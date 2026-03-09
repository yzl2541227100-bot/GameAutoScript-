package cn.haorui.sdk.adsail_ad.view.scaleImage.decoder;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.widget.ActivityChooserModel;
import cn.haorui.sdk.adsail_ad.view.scaleImage.SubsamplingScaleImageView;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class SkiaPooledImageRegionDecoder implements ImageRegionDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private static final String TAG = "SkiaPooledImageRegionDecoder";
    private static boolean debug;
    private final Bitmap.Config bitmapConfig;
    private Context context;
    private final ReadWriteLock decoderLock;
    private DecoderPool decoderPool;
    private long fileLength;
    private final Point imageDimensions;
    private final AtomicBoolean lazyInited;
    private Uri uri;

    public static class DecoderPool {
        private final Semaphore available;
        private final Map<BitmapRegionDecoder, Boolean> decoders;

        private DecoderPool() {
            this.available = new Semaphore(0, true);
            this.decoders = new ConcurrentHashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BitmapRegionDecoder acquire() {
            this.available.acquireUninterruptibly();
            return getNextAvailable();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void add(BitmapRegionDecoder bitmapRegionDecoder) {
            this.decoders.put(bitmapRegionDecoder, Boolean.FALSE);
            this.available.release();
        }

        private synchronized BitmapRegionDecoder getNextAvailable() {
            for (Map.Entry<BitmapRegionDecoder, Boolean> entry : this.decoders.entrySet()) {
                if (!entry.getValue().booleanValue()) {
                    entry.setValue(Boolean.TRUE);
                    return entry.getKey();
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean isEmpty() {
            return this.decoders.isEmpty();
        }

        private synchronized boolean markAsUnused(BitmapRegionDecoder bitmapRegionDecoder) {
            for (Map.Entry<BitmapRegionDecoder, Boolean> entry : this.decoders.entrySet()) {
                if (bitmapRegionDecoder == entry.getKey()) {
                    if (!entry.getValue().booleanValue()) {
                        return false;
                    }
                    entry.setValue(Boolean.FALSE);
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void recycle() {
            while (!this.decoders.isEmpty()) {
                BitmapRegionDecoder bitmapRegionDecoderAcquire = acquire();
                bitmapRegionDecoderAcquire.recycle();
                this.decoders.remove(bitmapRegionDecoderAcquire);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release(BitmapRegionDecoder bitmapRegionDecoder) {
            if (markAsUnused(bitmapRegionDecoder)) {
                this.available.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized int size() {
            return this.decoders.size();
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
        this(null);
    }

    public SkiaPooledImageRegionDecoder(Bitmap.Config config) {
        this.decoderPool = new DecoderPool();
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.fileLength = Long.MAX_VALUE;
        this.imageDimensions = new Point(0, 0);
        this.lazyInited = new AtomicBoolean(false);
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config == null) {
            if (preferredBitmapConfig != null) {
                this.bitmapConfig = preferredBitmapConfig;
                return;
            }
            config = Bitmap.Config.RGB_565;
        }
        this.bitmapConfig = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void debug(String str) {
        if (debug) {
            Log.d(TAG, str);
        }
    }

    private int getNumCoresOldPhones() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.SkiaPooledImageRegionDecoder.1CpuFilter
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]+", file.getName());
                }
            }).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    private int getNumberOfCores() {
        return Build.VERSION.SDK_INT >= 17 ? Runtime.getRuntime().availableProcessors() : getNumCoresOldPhones();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|(7:(1:18)(2:67|16)|44|78|45|(1:47)|48|49)(1:12)|74|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122 A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #8 {all -> 0x012f, blocks: (B:45:0x011e, B:47:0x0122), top: B:78:0x011e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initialiseDecoder() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.SkiaPooledImageRegionDecoder.initialiseDecoder():void");
    }

    private boolean isLowMemory() {
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (activityManager == null) {
            return true;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    private void lazyInit() {
        if (!this.lazyInited.compareAndSet(false, true) || this.fileLength >= Long.MAX_VALUE) {
            return;
        }
        debug("Starting lazy init of additional decoders");
        new Thread() { // from class: cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.SkiaPooledImageRegionDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (SkiaPooledImageRegionDecoder.this.decoderPool != null) {
                    SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = SkiaPooledImageRegionDecoder.this;
                    if (!skiaPooledImageRegionDecoder.allowAdditionalDecoder(skiaPooledImageRegionDecoder.decoderPool.size(), SkiaPooledImageRegionDecoder.this.fileLength)) {
                        return;
                    }
                    try {
                        if (SkiaPooledImageRegionDecoder.this.decoderPool != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            SkiaPooledImageRegionDecoder.this.debug("Starting decoder");
                            SkiaPooledImageRegionDecoder.this.initialiseDecoder();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            SkiaPooledImageRegionDecoder.this.debug("Started decoder, took " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
                        }
                    } catch (Exception e) {
                        SkiaPooledImageRegionDecoder.this.debug("Failed to start decoder: " + e.getMessage());
                    }
                }
            }
        }.start();
    }

    @Keep
    public static void setDebug(boolean z) {
        debug = z;
    }

    public boolean allowAdditionalDecoder(int i, long j) {
        String str;
        if (i >= 4) {
            str = "No additional decoders allowed, reached hard limit (4)";
        } else {
            long j2 = ((long) i) * j;
            if (j2 > 20971520) {
                str = "No additional encoders allowed, reached hard memory limit (20Mb)";
            } else if (i >= getNumberOfCores()) {
                str = "No additional encoders allowed, limited by CPU cores (" + getNumberOfCores() + ")";
            } else {
                if (!isLowMemory()) {
                    debug("Additional decoder allowed, current count is " + i + ", estimated native memory " + (j2 / 1048576) + "Mb");
                    return true;
                }
                str = "No additional encoders allowed, memory is low";
            }
        }
        debug(str);
        return false;
    }

    @Override // cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.ImageRegionDecoder
    public Bitmap decodeRegion(Rect rect, int i) {
        debug("Decode region " + rect + " on thread " + Thread.currentThread().getName());
        if (rect.width() < this.imageDimensions.x || rect.height() < this.imageDimensions.y) {
            lazyInit();
        }
        this.decoderLock.readLock().lock();
        try {
            DecoderPool decoderPool = this.decoderPool;
            if (decoderPool != null) {
                BitmapRegionDecoder bitmapRegionDecoderAcquire = decoderPool.acquire();
                if (bitmapRegionDecoderAcquire != null) {
                    try {
                        if (!bitmapRegionDecoderAcquire.isRecycled()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = i;
                            options.inPreferredConfig = this.bitmapConfig;
                            Bitmap bitmapDecodeRegion = bitmapRegionDecoderAcquire.decodeRegion(rect, options);
                            if (bitmapDecodeRegion != null) {
                                return bitmapDecodeRegion;
                            }
                            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                        }
                    } finally {
                        this.decoderPool.release(bitmapRegionDecoderAcquire);
                    }
                }
                if (bitmapRegionDecoderAcquire != null) {
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } finally {
            this.decoderLock.readLock().unlock();
        }
    }

    @Override // cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.ImageRegionDecoder
    public Point init(Context context, Uri uri) throws IOException {
        this.context = context;
        this.uri = uri;
        initialiseDecoder();
        return this.imageDimensions;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.ImageRegionDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isReady() {
        /*
            r1 = this;
            monitor-enter(r1)
            cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.SkiaPooledImageRegionDecoder$DecoderPool r0 = r1.decoderPool     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Ld
            boolean r0 = cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.SkiaPooledImageRegionDecoder.DecoderPool.access$900(r0)     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            monitor-exit(r1)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.SkiaPooledImageRegionDecoder.isReady():boolean");
    }

    @Override // cn.haorui.sdk.adsail_ad.view.scaleImage.decoder.ImageRegionDecoder
    public synchronized void recycle() {
        this.decoderLock.writeLock().lock();
        try {
            DecoderPool decoderPool = this.decoderPool;
            if (decoderPool != null) {
                decoderPool.recycle();
                this.decoderPool = null;
                this.context = null;
                this.uri = null;
            }
        } finally {
            this.decoderLock.writeLock().unlock();
        }
    }
}
