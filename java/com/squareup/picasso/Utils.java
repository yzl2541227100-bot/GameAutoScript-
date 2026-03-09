package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.expressad.exoplayer.C1500b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public final class Utils {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 15000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 20000;
    public static final int DEFAULT_WRITE_TIMEOUT_MILLIS = 20000;
    private static final int KEY_PADDING = 50;
    public static final char KEY_SEPARATOR = '\n';
    public static final StringBuilder MAIN_THREAD_KEY_BUILDER = new StringBuilder();
    private static final int MAX_DISK_CACHE_SIZE = 52428800;
    private static final int MIN_DISK_CACHE_SIZE = 5242880;
    public static final String OWNER_DISPATCHER = "Dispatcher";
    public static final String OWNER_HUNTER = "Hunter";
    public static final String OWNER_MAIN = "Main";
    private static final String PICASSO_CACHE = "picasso-cache";
    public static final String THREAD_IDLE_NAME = "Picasso-Idle";
    public static final int THREAD_LEAK_CLEANING_MS = 1000;
    public static final String THREAD_PREFIX = "Picasso-";
    public static final String VERB_BATCHED = "batched";
    public static final String VERB_CANCELED = "canceled";
    public static final String VERB_CHANGED = "changed";
    public static final String VERB_COMPLETED = "completed";
    public static final String VERB_CREATED = "created";
    public static final String VERB_DECODED = "decoded";
    public static final String VERB_DELIVERED = "delivered";
    public static final String VERB_ENQUEUED = "enqueued";
    public static final String VERB_ERRORED = "errored";
    public static final String VERB_EXECUTING = "executing";
    public static final String VERB_IGNORED = "ignored";
    public static final String VERB_JOINED = "joined";
    public static final String VERB_PAUSED = "paused";
    public static final String VERB_REMOVED = "removed";
    public static final String VERB_REPLAYING = "replaying";
    public static final String VERB_RESUMED = "resumed";
    public static final String VERB_RETRYING = "retrying";
    public static final String VERB_TRANSFORMED = "transformed";
    private static final String WEBP_FILE_HEADER_RIFF = "RIFF";
    private static final int WEBP_FILE_HEADER_SIZE = 12;
    private static final String WEBP_FILE_HEADER_WEBP = "WEBP";

    @TargetApi(11)
    public static class ActivityManagerHoneycomb {
        private ActivityManagerHoneycomb() {
        }

        public static int getLargeMemoryClass(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    public static class BitmapHoneycombMR1 {
        private BitmapHoneycombMR1() {
        }

        public static int getByteCount(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    public static class OkHttpLoaderCreator {
        private OkHttpLoaderCreator() {
        }

        public static Downloader create(Context context) {
            return new OkHttpDownloader(context);
        }
    }

    public static class PicassoThread extends Thread {
        public PicassoThread(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static class PicassoThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new PicassoThread(runnable);
        }
    }

    private Utils() {
    }

    public static long calculateDiskCacheSize(File file) {
        long blockCount;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return Math.max(Math.min(blockCount, 52428800L), 5242880L);
    }

    public static int calculateMemoryCacheSize(Context context) {
        ActivityManager activityManager = (ActivityManager) getService(context, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && Build.VERSION.SDK_INT >= 11) {
            memoryClass = ActivityManagerHoneycomb.getLargeMemoryClass(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    public static void checkMain() {
        if (!isMain()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static void checkNotMain() {
        if (isMain()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    public static <T> T checkNotNull(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static void closeQuietly(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static File createDefaultCacheDir(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), PICASSO_CACHE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static Downloader createDefaultDownloader(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return OkHttpLoaderCreator.create(context);
        } catch (ClassNotFoundException unused) {
            return new UrlConnectionDownloader(context);
        }
    }

    public static String createKey(Request request) {
        StringBuilder sb = MAIN_THREAD_KEY_BUILDER;
        String strCreateKey = createKey(request, sb);
        sb.setLength(0);
        return strCreateKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String createKey(com.squareup.picasso.Request r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.stableKey
            r1 = 50
            if (r0 == 0) goto L14
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.stableKey
        L10:
            r5.append(r0)
            goto L2d
        L14:
            android.net.Uri r0 = r4.uri
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L10
        L25:
            r5.ensureCapacity(r1)
            int r0 = r4.resourceId
            r5.append(r0)
        L2d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.rotationDegrees
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L5e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.rotationDegrees
            r5.append(r1)
            boolean r1 = r4.hasRotationPivot
            if (r1 == 0) goto L5b
            r1 = 64
            r5.append(r1)
            float r1 = r4.rotationPivotX
            r5.append(r1)
            r5.append(r3)
            float r1 = r4.rotationPivotY
            r5.append(r1)
        L5b:
            r5.append(r0)
        L5e:
            boolean r1 = r4.hasSize()
            if (r1 == 0) goto L79
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.targetWidth
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.targetHeight
            r5.append(r1)
            r5.append(r0)
        L79:
            boolean r1 = r4.centerCrop
            if (r1 == 0) goto L86
            java.lang.String r1 = "centerCrop"
        L7f:
            r5.append(r1)
            r5.append(r0)
            goto L8d
        L86:
            boolean r1 = r4.centerInside
            if (r1 == 0) goto L8d
            java.lang.String r1 = "centerInside"
            goto L7f
        L8d:
            java.util.List<com.squareup.picasso.Transformation> r1 = r4.transformations
            if (r1 == 0) goto Lad
            r2 = 0
            int r1 = r1.size()
        L96:
            if (r2 >= r1) goto Lad
            java.util.List<com.squareup.picasso.Transformation> r3 = r4.transformations
            java.lang.Object r3 = r3.get(r2)
            com.squareup.picasso.Transformation r3 = (com.squareup.picasso.Transformation) r3
            java.lang.String r3 = r3.key()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L96
        Lad:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Utils.createKey(com.squareup.picasso.Request, java.lang.StringBuilder):java.lang.String");
    }

    public static void flushStackLocalLeaks(Looper looper) {
        Handler handler = new Handler(looper) { // from class: com.squareup.picasso.Utils.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000L);
            }
        };
        handler.sendMessageDelayed(handler.obtainMessage(), 1000L);
    }

    public static int getBitmapBytes(Bitmap bitmap) {
        int byteCount = Build.VERSION.SDK_INT >= 12 ? BitmapHoneycombMR1.getByteCount(bitmap) : bitmap.getRowBytes() * bitmap.getHeight();
        if (byteCount >= 0) {
            return byteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String getLogIdsForHunter(BitmapHunter bitmapHunter) {
        return getLogIdsForHunter(bitmapHunter, "");
    }

    public static String getLogIdsForHunter(BitmapHunter bitmapHunter, String str) {
        StringBuilder sb = new StringBuilder(str);
        Action action = bitmapHunter.getAction();
        if (action != null) {
            sb.append(action.request.logId());
        }
        List<Action> actions = bitmapHunter.getActions();
        if (actions != null) {
            int size = actions.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || action != null) {
                    sb.append(", ");
                }
                sb.append(actions.get(i).request.logId());
            }
        }
        return sb.toString();
    }

    public static int getResourceId(Resources resources, Request request) throws FileNotFoundException {
        Uri uri;
        int i = request.resourceId;
        if (i != 0 || (uri = request.uri) == null) {
            return i;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + request.uri);
        }
        List<String> pathSegments = request.uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + request.uri);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + request.uri);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + request.uri);
    }

    public static Resources getResources(Context context, Request request) throws FileNotFoundException {
        Uri uri;
        if (request.resourceId != 0 || (uri = request.uri) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + request.uri);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + request.uri);
        }
    }

    public static <T> T getService(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean isAirplaneModeOn(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static boolean isMain() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean isWebPFile(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && WEBP_FILE_HEADER_RIFF.equals(new String(bArr, 0, 4, C1500b.f7493i)) && WEBP_FILE_HEADER_WEBP.equals(new String(bArr, 8, 4, C1500b.f7493i));
    }

    public static void log(String str, String str2, String str3) {
        log(str, str2, str3, "");
    }

    public static void log(String str, String str2, String str3, String str4) {
        Log.d(Picasso.TAG, String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    public static boolean parseResponseSourceHeader(String str) {
        if (str == null) {
            return false;
        }
        String[] strArrSplit = str.split(C4196o4.OooO00o.OooO0Oo, 2);
        if ("CACHE".equals(strArrSplit[0])) {
            return true;
        }
        if (strArrSplit.length == 1) {
            return false;
        }
        try {
            if ("CONDITIONAL_CACHE".equals(strArrSplit[0])) {
                return Integer.parseInt(strArrSplit[1]) == 304;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
