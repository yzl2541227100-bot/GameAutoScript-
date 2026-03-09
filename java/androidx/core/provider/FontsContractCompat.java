package androidx.core.provider;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.provider.SelfDestructiveThread;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import net.grandcentrix.tray.provider.TrayContract;

/* JADX INFO: loaded from: classes.dex */
public class FontsContractCompat {
    private static final int BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS = 10000;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String PARCEL_FONT_RESULTS = "font_results";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
    private static final String TAG = "FontsContractCompat";
    public static final LruCache<String, Typeface> sTypefaceCache = new LruCache<>(16);
    private static final SelfDestructiveThread sBackgroundThread = new SelfDestructiveThread("fonts", 10, 10000);
    public static final Object sLock = new Object();

    @GuardedBy("sLock")
    public static final SimpleArrayMap<String, ArrayList<SelfDestructiveThread.ReplyCallback<TypefaceResult>>> sPendingReplies = new SimpleArrayMap<>();
    private static final Comparator<byte[]> sByteArrayComparator = new Comparator<byte[]>() { // from class: androidx.core.provider.FontsContractCompat.5
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length == bArr2.length) {
                for (int i = 0; i < bArr.length; i++) {
                    if (bArr[i] != bArr2[i]) {
                        length = bArr[i];
                        length2 = bArr2[i];
                    }
                }
                return 0;
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }
    };

    /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$1 */
    public static class CallableC01451 implements Callable<TypefaceResult> {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$id;
        public final /* synthetic */ FontRequest val$request;
        public final /* synthetic */ int val$style;

        public CallableC01451(Context context, FontRequest fontRequest, int i, String str) {
            context = context;
            fontRequest = fontRequest;
            i = i;
            str = str;
        }

        @Override // java.util.concurrent.Callable
        public TypefaceResult call() throws Exception {
            TypefaceResult fontInternal = FontsContractCompat.getFontInternal(context, fontRequest, i);
            Typeface typeface = fontInternal.mTypeface;
            if (typeface != null) {
                FontsContractCompat.sTypefaceCache.put(str, typeface);
            }
            return fontInternal;
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$2 */
    public static class C01462 implements SelfDestructiveThread.ReplyCallback<TypefaceResult> {
        public final /* synthetic */ Handler val$handler;

        public C01462(Handler handler) {
            handler = handler;
        }

        @Override // androidx.core.provider.SelfDestructiveThread.ReplyCallback
        public void onReply(TypefaceResult typefaceResult) {
            int i;
            ResourcesCompat.FontCallback fontCallback;
            if (typefaceResult == null) {
                fontCallback = fontCallback;
                i = 1;
            } else {
                i = typefaceResult.mResult;
                if (i == 0) {
                    fontCallback.callbackSuccessAsync(typefaceResult.mTypeface, handler);
                    return;
                }
                fontCallback = fontCallback;
            }
            fontCallback.callbackFailAsync(i, handler);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$3 */
    public static class C01473 implements SelfDestructiveThread.ReplyCallback<TypefaceResult> {
        public final /* synthetic */ String val$id;

        public C01473(String str) {
            str = str;
        }

        @Override // androidx.core.provider.SelfDestructiveThread.ReplyCallback
        public void onReply(TypefaceResult typefaceResult) {
            synchronized (FontsContractCompat.sLock) {
                SimpleArrayMap<String, ArrayList<SelfDestructiveThread.ReplyCallback<TypefaceResult>>> simpleArrayMap = FontsContractCompat.sPendingReplies;
                ArrayList<SelfDestructiveThread.ReplyCallback<TypefaceResult>> arrayList = simpleArrayMap.get(str);
                if (arrayList == null) {
                    return;
                }
                simpleArrayMap.remove(str);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).onReply(typefaceResult);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4 */
    public static class RunnableC01484 implements Runnable {
        public final /* synthetic */ FontRequestCallback val$callback;
        public final /* synthetic */ Handler val$callerThreadHandler;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ FontRequest val$request;

        /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(-1);
            }
        }

        /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$2 */
        public class AnonymousClass2 implements Runnable {
            public AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(-2);
            }
        }

        /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$3 */
        public class AnonymousClass3 implements Runnable {
            public AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(-3);
            }
        }

        /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$4 */
        public class AnonymousClass4 implements Runnable {
            public AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(-3);
            }
        }

        /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$5 */
        public class AnonymousClass5 implements Runnable {
            public AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(1);
            }
        }

        /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$6 */
        public class AnonymousClass6 implements Runnable {
            public AnonymousClass6() {
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(-3);
            }
        }

        /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$7 */
        public class AnonymousClass7 implements Runnable {
            public final /* synthetic */ int val$resultCode;

            public AnonymousClass7(int i) {
                i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(i);
            }
        }

        /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$8 */
        public class AnonymousClass8 implements Runnable {
            public AnonymousClass8() {
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(-3);
            }
        }

        /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$9 */
        public class AnonymousClass9 implements Runnable {
            public final /* synthetic */ Typeface val$typeface;

            public AnonymousClass9(Typeface typeface) {
                typeface = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRetrieved(typeface);
            }
        }

        public RunnableC01484(Context context, FontRequest fontRequest, Handler handler, FontRequestCallback fontRequestCallback) {
            context = context;
            fontRequest = fontRequest;
            handler = handler;
            fontRequestCallback = fontRequestCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FontFamilyResult fontFamilyResultFetchFonts = FontsContractCompat.fetchFonts(context, null, fontRequest);
                if (fontFamilyResultFetchFonts.getStatusCode() != 0) {
                    int statusCode = fontFamilyResultFetchFonts.getStatusCode();
                    if (statusCode == 1) {
                        handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.2
                            public AnonymousClass2() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                fontRequestCallback.onTypefaceRequestFailed(-2);
                            }
                        });
                        return;
                    } else if (statusCode != 2) {
                        handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.4
                            public AnonymousClass4() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                fontRequestCallback.onTypefaceRequestFailed(-3);
                            }
                        });
                        return;
                    } else {
                        handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.3
                            public AnonymousClass3() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                fontRequestCallback.onTypefaceRequestFailed(-3);
                            }
                        });
                        return;
                    }
                }
                FontInfo[] fonts = fontFamilyResultFetchFonts.getFonts();
                if (fonts == null || fonts.length == 0) {
                    handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.5
                        public AnonymousClass5() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            fontRequestCallback.onTypefaceRequestFailed(1);
                        }
                    });
                    return;
                }
                for (FontInfo fontInfo : fonts) {
                    if (fontInfo.getResultCode() != 0) {
                        int resultCode = fontInfo.getResultCode();
                        if (resultCode < 0) {
                            handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.6
                                public AnonymousClass6() {
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                            return;
                        } else {
                            handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.7
                                public final /* synthetic */ int val$resultCode;

                                public AnonymousClass7(int resultCode2) {
                                    i = resultCode2;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(i);
                                }
                            });
                            return;
                        }
                    }
                }
                Typeface typefaceBuildTypeface = FontsContractCompat.buildTypeface(context, null, fonts);
                if (typefaceBuildTypeface == null) {
                    handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.8
                        public AnonymousClass8() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            fontRequestCallback.onTypefaceRequestFailed(-3);
                        }
                    });
                } else {
                    handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.9
                        public final /* synthetic */ Typeface val$typeface;

                        public AnonymousClass9(Typeface typefaceBuildTypeface2) {
                            typeface = typefaceBuildTypeface2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            fontRequestCallback.onTypefaceRetrieved(typeface);
                        }
                    });
                }
            } catch (PackageManager.NameNotFoundException unused) {
                handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        fontRequestCallback.onTypefaceRequestFailed(-1);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$5 */
    public static class C01495 implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length == bArr2.length) {
                for (int i = 0; i < bArr.length; i++) {
                    if (bArr[i] != bArr2[i]) {
                        length = bArr[i];
                        length2 = bArr2[i];
                    }
                }
                return 0;
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }
    }

    public static final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";
    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final FontInfo[] mFonts;
        private final int mStatusCode;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public FontFamilyResult(int i, @Nullable FontInfo[] fontInfoArr) {
            this.mStatusCode = i;
            this.mFonts = fontInfoArr;
        }

        public FontInfo[] getFonts() {
            return this.mFonts;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }
    }

    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final Uri mUri;
        private final int mWeight;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public FontInfo(@NonNull Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, m1to = 1000) int i2, boolean z, int i3) {
            this.mUri = (Uri) Preconditions.checkNotNull(uri);
            this.mTtcIndex = i;
            this.mWeight = i2;
            this.mItalic = z;
            this.mResultCode = i3;
        }

        public int getResultCode() {
            return this.mResultCode;
        }

        @IntRange(from = 0)
        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        @NonNull
        public Uri getUri() {
            return this.mUri;
        }

        @IntRange(from = 1, m1to = 1000)
        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }
    }

    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final int RESULT_OK = 0;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }

    public static final class TypefaceResult {
        public final int mResult;
        public final Typeface mTypeface;

        public TypefaceResult(@Nullable Typeface typeface, int i) {
            this.mTypeface = typeface;
            this.mResult = i;
        }
    }

    private FontsContractCompat() {
    }

    @Nullable
    public static Typeface buildTypeface(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontInfo[] fontInfoArr) {
        return TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    private static List<byte[]> convertToByteArrayList(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean equalsByteArrayList(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    public static FontFamilyResult fetchFonts(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontRequest fontRequest) throws PackageManager.NameNotFoundException {
        ProviderInfo provider = getProvider(context.getPackageManager(), fontRequest, context.getResources());
        return provider == null ? new FontFamilyResult(1, null) : new FontFamilyResult(0, getFontFromProvider(context, fontRequest, provider.authority, cancellationSignal));
    }

    private static List<List<byte[]>> getCertificates(FontRequest fontRequest, Resources resources) {
        return fontRequest.getCertificates() != null ? fontRequest.getCertificates() : FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    @NonNull
    @VisibleForTesting
    public static FontInfo[] getFontFromProvider(Context context, FontRequest fontRequest, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursorQuery = null;
        try {
            cursorQuery = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(uriBuild, new String[]{TrayContract.Preferences.Columns.f19815ID, Columns.FILE_ID, Columns.TTC_INDEX, Columns.VARIATION_SETTINGS, Columns.WEIGHT, Columns.ITALIC, Columns.RESULT_CODE}, "query = ?", new String[]{fontRequest.getQuery()}, null, cancellationSignal) : context.getContentResolver().query(uriBuild, new String[]{TrayContract.Preferences.Columns.f19815ID, Columns.FILE_ID, Columns.TTC_INDEX, Columns.VARIATION_SETTINGS, Columns.WEIGHT, Columns.ITALIC, Columns.RESULT_CODE}, "query = ?", new String[]{fontRequest.getQuery()}, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex(Columns.RESULT_CODE);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex(TrayContract.Preferences.Columns.f19815ID);
                int columnIndex3 = cursorQuery.getColumnIndex(Columns.FILE_ID);
                int columnIndex4 = cursorQuery.getColumnIndex(Columns.TTC_INDEX);
                int columnIndex5 = cursorQuery.getColumnIndex(Columns.WEIGHT);
                int columnIndex6 = cursorQuery.getColumnIndex(Columns.ITALIC);
                while (cursorQuery.moveToNext()) {
                    int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                    arrayList2.add(new FontInfo(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (FontInfo[]) arrayList.toArray(new FontInfo[0]);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    @NonNull
    public static TypefaceResult getFontInternal(Context context, FontRequest fontRequest, int i) {
        try {
            FontFamilyResult fontFamilyResultFetchFonts = fetchFonts(context, null, fontRequest);
            if (fontFamilyResultFetchFonts.getStatusCode() != 0) {
                return new TypefaceResult(null, fontFamilyResultFetchFonts.getStatusCode() == 1 ? -2 : -3);
            }
            Typeface typefaceCreateFromFontInfo = TypefaceCompat.createFromFontInfo(context, null, fontFamilyResultFetchFonts.getFonts(), i);
            return new TypefaceResult(typefaceCreateFromFontInfo, typefaceCreateFromFontInfo != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new TypefaceResult(null, -1);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Typeface getFontSync(Context context, FontRequest fontRequest, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z, int i, int i2) {
        String str = fontRequest.getIdentifier() + "-" + i2;
        Typeface typeface = sTypefaceCache.get(str);
        if (typeface != null) {
            if (fontCallback != null) {
                fontCallback.onFontRetrieved(typeface);
            }
            return typeface;
        }
        if (z && i == -1) {
            TypefaceResult fontInternal = getFontInternal(context, fontRequest, i2);
            if (fontCallback != null) {
                int i3 = fontInternal.mResult;
                if (i3 == 0) {
                    fontCallback.callbackSuccessAsync(fontInternal.mTypeface, handler);
                } else {
                    fontCallback.callbackFailAsync(i3, handler);
                }
            }
            return fontInternal.mTypeface;
        }
        CallableC01451 callableC01451 = new Callable<TypefaceResult>() { // from class: androidx.core.provider.FontsContractCompat.1
            public final /* synthetic */ Context val$context;
            public final /* synthetic */ String val$id;
            public final /* synthetic */ FontRequest val$request;
            public final /* synthetic */ int val$style;

            public CallableC01451(Context context2, FontRequest fontRequest2, int i22, String str2) {
                context = context2;
                fontRequest = fontRequest2;
                i = i22;
                str = str2;
            }

            @Override // java.util.concurrent.Callable
            public TypefaceResult call() throws Exception {
                TypefaceResult fontInternal2 = FontsContractCompat.getFontInternal(context, fontRequest, i);
                Typeface typeface2 = fontInternal2.mTypeface;
                if (typeface2 != null) {
                    FontsContractCompat.sTypefaceCache.put(str, typeface2);
                }
                return fontInternal2;
            }
        };
        if (z) {
            try {
                return ((TypefaceResult) sBackgroundThread.postAndWait(callableC01451, i)).mTypeface;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C01462 c01462 = fontCallback == null ? null : new SelfDestructiveThread.ReplyCallback<TypefaceResult>() { // from class: androidx.core.provider.FontsContractCompat.2
            public final /* synthetic */ Handler val$handler;

            public C01462(Handler handler2) {
                handler = handler2;
            }

            @Override // androidx.core.provider.SelfDestructiveThread.ReplyCallback
            public void onReply(TypefaceResult typefaceResult) {
                int i4;
                ResourcesCompat.FontCallback fontCallback2;
                if (typefaceResult == null) {
                    fontCallback2 = fontCallback;
                    i4 = 1;
                } else {
                    i4 = typefaceResult.mResult;
                    if (i4 == 0) {
                        fontCallback.callbackSuccessAsync(typefaceResult.mTypeface, handler);
                        return;
                    }
                    fontCallback2 = fontCallback;
                }
                fontCallback2.callbackFailAsync(i4, handler);
            }
        };
        synchronized (sLock) {
            SimpleArrayMap<String, ArrayList<SelfDestructiveThread.ReplyCallback<TypefaceResult>>> simpleArrayMap = sPendingReplies;
            if (simpleArrayMap.containsKey(str2)) {
                if (c01462 != null) {
                    simpleArrayMap.get(str2).add(c01462);
                }
                return null;
            }
            if (c01462 != null) {
                ArrayList<SelfDestructiveThread.ReplyCallback<TypefaceResult>> arrayList = new ArrayList<>();
                arrayList.add(c01462);
                simpleArrayMap.put(str2, arrayList);
            }
            sBackgroundThread.postAndReply(callableC01451, new SelfDestructiveThread.ReplyCallback<TypefaceResult>() { // from class: androidx.core.provider.FontsContractCompat.3
                public final /* synthetic */ String val$id;

                public C01473(String str2) {
                    str = str2;
                }

                @Override // androidx.core.provider.SelfDestructiveThread.ReplyCallback
                public void onReply(TypefaceResult typefaceResult) {
                    synchronized (FontsContractCompat.sLock) {
                        SimpleArrayMap<String, ArrayList<SelfDestructiveThread.ReplyCallback<TypefaceResult>>> simpleArrayMap2 = FontsContractCompat.sPendingReplies;
                        ArrayList<SelfDestructiveThread.ReplyCallback<TypefaceResult>> arrayList2 = simpleArrayMap2.get(str);
                        if (arrayList2 == null) {
                            return;
                        }
                        simpleArrayMap2.remove(str);
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            arrayList2.get(i4).onReply(typefaceResult);
                        }
                    }
                }
            });
            return null;
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public static ProviderInfo getProvider(@NonNull PackageManager packageManager, @NonNull FontRequest fontRequest, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        String providerAuthority = fontRequest.getProviderAuthority();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + fontRequest.getProviderPackage());
        }
        List<byte[]> listConvertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listConvertToByteArrayList, sByteArrayComparator);
        List<List<byte[]>> certificates = getCertificates(fontRequest, resources);
        for (int i = 0; i < certificates.size(); i++) {
            ArrayList arrayList = new ArrayList(certificates.get(i));
            Collections.sort(arrayList, sByteArrayComparator);
            if (equalsByteArrayList(listConvertToByteArrayList, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, FontInfo[] fontInfoArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (FontInfo fontInfo : fontInfoArr) {
            if (fontInfo.getResultCode() == 0) {
                Uri uri = fontInfo.getUri();
                if (!map.containsKey(uri)) {
                    map.put(uri, TypefaceCompatUtil.mmap(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static void requestFont(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
        handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4
            public final /* synthetic */ FontRequestCallback val$callback;
            public final /* synthetic */ Handler val$callerThreadHandler;
            public final /* synthetic */ Context val$context;
            public final /* synthetic */ FontRequest val$request;

            /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$1 */
            public class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRequestFailed(-1);
                }
            }

            /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$2 */
            public class AnonymousClass2 implements Runnable {
                public AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRequestFailed(-2);
                }
            }

            /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$3 */
            public class AnonymousClass3 implements Runnable {
                public AnonymousClass3() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRequestFailed(-3);
                }
            }

            /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$4 */
            public class AnonymousClass4 implements Runnable {
                public AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRequestFailed(-3);
                }
            }

            /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$5 */
            public class AnonymousClass5 implements Runnable {
                public AnonymousClass5() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRequestFailed(1);
                }
            }

            /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$6 */
            public class AnonymousClass6 implements Runnable {
                public AnonymousClass6() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRequestFailed(-3);
                }
            }

            /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$7 */
            public class AnonymousClass7 implements Runnable {
                public final /* synthetic */ int val$resultCode;

                public AnonymousClass7(int resultCode2) {
                    i = resultCode2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRequestFailed(i);
                }
            }

            /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$8 */
            public class AnonymousClass8 implements Runnable {
                public AnonymousClass8() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRequestFailed(-3);
                }
            }

            /* JADX INFO: renamed from: androidx.core.provider.FontsContractCompat$4$9 */
            public class AnonymousClass9 implements Runnable {
                public final /* synthetic */ Typeface val$typeface;

                public AnonymousClass9(Typeface typefaceBuildTypeface2) {
                    typeface = typefaceBuildTypeface2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.onTypefaceRetrieved(typeface);
                }
            }

            public RunnableC01484(Context context2, FontRequest fontRequest2, Handler handler2, FontRequestCallback fontRequestCallback2) {
                context = context2;
                fontRequest = fontRequest2;
                handler = handler2;
                fontRequestCallback = fontRequestCallback2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    FontFamilyResult fontFamilyResultFetchFonts = FontsContractCompat.fetchFonts(context, null, fontRequest);
                    if (fontFamilyResultFetchFonts.getStatusCode() != 0) {
                        int statusCode = fontFamilyResultFetchFonts.getStatusCode();
                        if (statusCode == 1) {
                            handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.2
                                public AnonymousClass2() {
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-2);
                                }
                            });
                            return;
                        } else if (statusCode != 2) {
                            handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.4
                                public AnonymousClass4() {
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                            return;
                        } else {
                            handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.3
                                public AnonymousClass3() {
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                            return;
                        }
                    }
                    FontInfo[] fonts = fontFamilyResultFetchFonts.getFonts();
                    if (fonts == null || fonts.length == 0) {
                        handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.5
                            public AnonymousClass5() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                fontRequestCallback.onTypefaceRequestFailed(1);
                            }
                        });
                        return;
                    }
                    for (FontInfo fontInfo : fonts) {
                        if (fontInfo.getResultCode() != 0) {
                            int resultCode2 = fontInfo.getResultCode();
                            if (resultCode2 < 0) {
                                handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.6
                                    public AnonymousClass6() {
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        fontRequestCallback.onTypefaceRequestFailed(-3);
                                    }
                                });
                                return;
                            } else {
                                handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.7
                                    public final /* synthetic */ int val$resultCode;

                                    public AnonymousClass7(int resultCode22) {
                                        i = resultCode22;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        fontRequestCallback.onTypefaceRequestFailed(i);
                                    }
                                });
                                return;
                            }
                        }
                    }
                    Typeface typefaceBuildTypeface2 = FontsContractCompat.buildTypeface(context, null, fonts);
                    if (typefaceBuildTypeface2 == null) {
                        handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.8
                            public AnonymousClass8() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                fontRequestCallback.onTypefaceRequestFailed(-3);
                            }
                        });
                    } else {
                        handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.9
                            public final /* synthetic */ Typeface val$typeface;

                            public AnonymousClass9(Typeface typefaceBuildTypeface22) {
                                typeface = typefaceBuildTypeface22;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                fontRequestCallback.onTypefaceRetrieved(typeface);
                            }
                        });
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    handler.post(new Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.1
                        public AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            fontRequestCallback.onTypefaceRequestFailed(-1);
                        }
                    });
                }
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void resetCache() {
        sTypefaceCache.evictAll();
    }
}
