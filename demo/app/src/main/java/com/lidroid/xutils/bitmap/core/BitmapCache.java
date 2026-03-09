package com.lidroid.xutils.bitmap.core;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import cn.haorui.sdk.adsail_ad.view.scaleImage.SubsamplingScaleImageView;
import com.lidroid.xutils.bitmap.BitmapDisplayConfig;
import com.lidroid.xutils.bitmap.BitmapGlobalConfig;
import com.lidroid.xutils.bitmap.factory.BitmapFactory;
import com.lidroid.xutils.cache.FileNameGenerator;
import com.lidroid.xutils.cache.LruDiskCache;
import com.lidroid.xutils.cache.LruMemoryCache;
import com.lidroid.xutils.util.IOUtils;
import com.lidroid.xutils.util.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapCache {
    private BitmapGlobalConfig globalConfig;
    private LruDiskCache mDiskLruCache;
    private LruMemoryCache<MemoryCacheKey, Bitmap> mMemoryCache;
    private final int DISK_CACHE_INDEX = 0;
    private final Object mDiskCacheLock = new Object();

    /* JADX INFO: renamed from: com.lidroid.xutils.bitmap.core.BitmapCache$1 */
    public class C30391 extends LruMemoryCache<MemoryCacheKey, Bitmap> {
        public C30391(int i) {
            super(i);
        }

        @Override // com.lidroid.xutils.cache.LruMemoryCache
        public int sizeOf(MemoryCacheKey memoryCacheKey, Bitmap bitmap) {
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    public class BitmapMeta {
        public byte[] data;
        public long expiryTimestamp;
        public FileInputStream inputStream;

        private BitmapMeta() {
        }

        public /* synthetic */ BitmapMeta(BitmapCache bitmapCache, BitmapMeta bitmapMeta) {
            this();
        }
    }

    public class MemoryCacheKey {
        private String subKey;
        private String uri;

        private MemoryCacheKey(String str, BitmapDisplayConfig bitmapDisplayConfig) {
            this.uri = str;
            this.subKey = bitmapDisplayConfig == null ? null : bitmapDisplayConfig.toString();
        }

        public /* synthetic */ MemoryCacheKey(BitmapCache bitmapCache, String str, BitmapDisplayConfig bitmapDisplayConfig, MemoryCacheKey memoryCacheKey) {
            this(str, bitmapDisplayConfig);
        }

        public boolean equals(Object obj) {
            String str;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MemoryCacheKey)) {
                return false;
            }
            MemoryCacheKey memoryCacheKey = (MemoryCacheKey) obj;
            if (!this.uri.equals(memoryCacheKey.uri)) {
                return false;
            }
            String str2 = this.subKey;
            if (str2 == null || (str = memoryCacheKey.subKey) == null) {
                return true;
            }
            return str2.equals(str);
        }

        public int hashCode() {
            return this.uri.hashCode();
        }
    }

    public BitmapCache(BitmapGlobalConfig bitmapGlobalConfig) {
        if (bitmapGlobalConfig == null) {
            throw new IllegalArgumentException("globalConfig may not be null");
        }
        this.globalConfig = bitmapGlobalConfig;
    }

    private Bitmap decodeBitmapMeta(BitmapMeta bitmapMeta, BitmapDisplayConfig bitmapDisplayConfig) throws IOException {
        if (bitmapMeta == null) {
            return null;
        }
        if (bitmapMeta.inputStream != null) {
            return (bitmapDisplayConfig == null || bitmapDisplayConfig.isShowOriginal()) ? BitmapDecoder.decodeFileDescriptor(bitmapMeta.inputStream.getFD()) : BitmapDecoder.decodeSampledBitmapFromDescriptor(bitmapMeta.inputStream.getFD(), bitmapDisplayConfig.getBitmapMaxSize(), bitmapDisplayConfig.getBitmapConfig());
        }
        if (bitmapMeta.data != null) {
            return (bitmapDisplayConfig == null || bitmapDisplayConfig.isShowOriginal()) ? BitmapDecoder.decodeByteArray(bitmapMeta.data) : BitmapDecoder.decodeSampledBitmapFromByteArray(bitmapMeta.data, bitmapDisplayConfig.getBitmapMaxSize(), bitmapDisplayConfig.getBitmapConfig());
        }
        return null;
    }

    private synchronized Bitmap rotateBitmapIfNeeded(String str, BitmapDisplayConfig bitmapDisplayConfig, Bitmap bitmap) {
        File bitmapFileFromDiskCache;
        if (bitmapDisplayConfig != null) {
            if (bitmapDisplayConfig.isAutoRotation() && (bitmapFileFromDiskCache = getBitmapFileFromDiskCache(str)) != null && bitmapFileFromDiskCache.exists()) {
                try {
                    int i = 0;
                    int attributeInt = new ExifInterface(bitmapFileFromDiskCache.getPath()).getAttributeInt("Orientation", 0);
                    if (attributeInt == 3) {
                        i = 180;
                    } else if (attributeInt == 6) {
                        i = 90;
                    } else if (attributeInt == 8) {
                        i = SubsamplingScaleImageView.ORIENTATION_270;
                    }
                    if (i != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        bitmap.recycle();
                        bitmap = bitmapCreateBitmap;
                    }
                } catch (Throwable unused) {
                    return bitmap;
                }
            }
        }
        return bitmap;
    }

    public Bitmap addBitmapToMemoryCache(String str, BitmapDisplayConfig bitmapDisplayConfig, Bitmap bitmap, long j) throws IOException {
        BitmapFactory bitmapFactory;
        if (bitmapDisplayConfig != null && (bitmapFactory = bitmapDisplayConfig.getBitmapFactory()) != null) {
            bitmap = bitmapFactory.cloneNew().createBitmap(bitmap);
        }
        if (str != null && bitmap != null && this.globalConfig.isMemoryCacheEnabled() && this.mMemoryCache != null) {
            this.mMemoryCache.put(new MemoryCacheKey(this, str, bitmapDisplayConfig, null), bitmap, j);
        }
        return bitmap;
    }

    public void clearCache() {
        clearMemoryCache();
        clearDiskCache();
    }

    public void clearCache(String str) {
        clearMemoryCache(str);
        clearDiskCache(str);
    }

    public void clearDiskCache() {
        synchronized (this.mDiskCacheLock) {
            LruDiskCache lruDiskCache = this.mDiskLruCache;
            if (lruDiskCache != null && !lruDiskCache.isClosed()) {
                try {
                    this.mDiskLruCache.delete();
                    this.mDiskLruCache.close();
                } catch (Throwable th) {
                    LogUtils.m13791e(th.getMessage(), th);
                }
                this.mDiskLruCache = null;
            }
        }
        initDiskCache();
    }

    public void clearDiskCache(String str) {
        synchronized (this.mDiskCacheLock) {
            LruDiskCache lruDiskCache = this.mDiskLruCache;
            if (lruDiskCache != null && !lruDiskCache.isClosed()) {
                try {
                    this.mDiskLruCache.remove(str);
                } catch (Throwable th) {
                    LogUtils.m13791e(th.getMessage(), th);
                }
            }
        }
    }

    public void clearMemoryCache() {
        LruMemoryCache<MemoryCacheKey, Bitmap> lruMemoryCache = this.mMemoryCache;
        if (lruMemoryCache != null) {
            lruMemoryCache.evictAll();
        }
    }

    public void clearMemoryCache(String str) {
        MemoryCacheKey memoryCacheKey = new MemoryCacheKey(this, str, null, null);
        if (this.mMemoryCache != null) {
            while (this.mMemoryCache.containsKey(memoryCacheKey)) {
                this.mMemoryCache.remove(memoryCacheKey);
            }
        }
    }

    public void close() {
        synchronized (this.mDiskCacheLock) {
            LruDiskCache lruDiskCache = this.mDiskLruCache;
            if (lruDiskCache != null) {
                try {
                    if (!lruDiskCache.isClosed()) {
                        this.mDiskLruCache.close();
                    }
                } catch (Throwable th) {
                    LogUtils.m13791e(th.getMessage(), th);
                }
                this.mDiskLruCache = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0062 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #5 {all -> 0x0078, blocks: (B:96:0x0035, B:98:0x0045, B:102:0x004f, B:107:0x0062), top: B:155:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008e A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #4 {all -> 0x00b7, blocks: (B:122:0x008e, B:134:0x00bb, B:119:0x0081), top: B:153:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00bb A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b7, blocks: (B:122:0x008e, B:134:0x00bb, B:119:0x0081), top: B:153:0x0081 }] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.lidroid.xutils.bitmap.download.Downloader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap downloadBitmap(java.lang.String r16, com.lidroid.xutils.bitmap.BitmapDisplayConfig r17, com.lidroid.xutils.BitmapUtils.BitmapLoadTask<?> r18) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lidroid.xutils.bitmap.core.BitmapCache.downloadBitmap(java.lang.String, com.lidroid.xutils.bitmap.BitmapDisplayConfig, com.lidroid.xutils.BitmapUtils$BitmapLoadTask):android.graphics.Bitmap");
    }

    public void flush() {
        synchronized (this.mDiskCacheLock) {
            LruDiskCache lruDiskCache = this.mDiskLruCache;
            if (lruDiskCache != null) {
                try {
                    lruDiskCache.flush();
                } catch (Throwable th) {
                    LogUtils.m13791e(th.getMessage(), th);
                }
            }
        }
    }

    public File getBitmapFileFromDiskCache(String str) {
        synchronized (this.mDiskCacheLock) {
            LruDiskCache lruDiskCache = this.mDiskLruCache;
            if (lruDiskCache == null) {
                return null;
            }
            return lruDiskCache.getCacheFile(str, 0);
        }
    }

    public Bitmap getBitmapFromDiskCache(String str, BitmapDisplayConfig bitmapDisplayConfig) {
        LruDiskCache.Snapshot snapshot;
        Bitmap bitmapDecodeFileDescriptor;
        if (str != null && this.globalConfig.isDiskCacheEnabled()) {
            if (this.mDiskLruCache == null) {
                initDiskCache();
            }
            LruDiskCache lruDiskCache = this.mDiskLruCache;
            if (lruDiskCache != null) {
                try {
                    snapshot = lruDiskCache.get(str);
                    if (snapshot != null) {
                        if (bitmapDisplayConfig != null) {
                            try {
                                bitmapDecodeFileDescriptor = bitmapDisplayConfig.isShowOriginal() ? BitmapDecoder.decodeFileDescriptor(snapshot.getInputStream(0).getFD()) : BitmapDecoder.decodeSampledBitmapFromDescriptor(snapshot.getInputStream(0).getFD(), bitmapDisplayConfig.getBitmapMaxSize(), bitmapDisplayConfig.getBitmapConfig());
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    LogUtils.m13791e(th.getMessage(), th);
                                    return null;
                                } finally {
                                    IOUtils.closeQuietly(snapshot);
                                }
                            }
                        }
                        return addBitmapToMemoryCache(str, bitmapDisplayConfig, rotateBitmapIfNeeded(str, bitmapDisplayConfig, bitmapDecodeFileDescriptor), this.mDiskLruCache.getExpiryTimestamp(str));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    snapshot = null;
                }
            }
        }
        return null;
    }

    public Bitmap getBitmapFromMemCache(String str, BitmapDisplayConfig bitmapDisplayConfig) {
        if (this.mMemoryCache == null || !this.globalConfig.isMemoryCacheEnabled()) {
            return null;
        }
        return this.mMemoryCache.get(new MemoryCacheKey(this, str, bitmapDisplayConfig, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[Catch: all -> 0x005d, DONT_GENERATE, TryCatch #1 {, blocks: (B:37:0x0003, B:39:0x000b, B:41:0x000f, B:43:0x0015, B:45:0x0026, B:47:0x002c, B:56:0x0054, B:57:0x005b, B:52:0x003d), top: B:64:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initDiskCache() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.mDiskCacheLock
            monitor-enter(r0)
            com.lidroid.xutils.bitmap.BitmapGlobalConfig r1 = r7.globalConfig     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r1.isDiskCacheEnabled()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5b
            com.lidroid.xutils.cache.LruDiskCache r1 = r7.mDiskLruCache     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L15
            boolean r1 = r1.isClosed()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5b
        L15:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L5d
            com.lidroid.xutils.bitmap.BitmapGlobalConfig r2 = r7.globalConfig     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = r2.getDiskCachePath()     // Catch: java.lang.Throwable -> L5d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L5d
            if (r2 != 0) goto L2c
            boolean r2 = r1.mkdirs()     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L5b
        L2c:
            long r2 = com.lidroid.xutils.util.OtherUtils.getAvailableSpace(r1)     // Catch: java.lang.Throwable -> L5d
            com.lidroid.xutils.bitmap.BitmapGlobalConfig r4 = r7.globalConfig     // Catch: java.lang.Throwable -> L5d
            int r4 = r4.getDiskCacheSize()     // Catch: java.lang.Throwable -> L5d
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3c
            r2 = r4
        L3c:
            r4 = 1
            com.lidroid.xutils.cache.LruDiskCache r1 = com.lidroid.xutils.cache.LruDiskCache.open(r1, r4, r4, r2)     // Catch: java.lang.Throwable -> L52
            r7.mDiskLruCache = r1     // Catch: java.lang.Throwable -> L52
            com.lidroid.xutils.bitmap.BitmapGlobalConfig r2 = r7.globalConfig     // Catch: java.lang.Throwable -> L52
            com.lidroid.xutils.cache.FileNameGenerator r2 = r2.getFileNameGenerator()     // Catch: java.lang.Throwable -> L52
            r1.setFileNameGenerator(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "create disk cache success"
            com.lidroid.xutils.util.LogUtils.m13788d(r1)     // Catch: java.lang.Throwable -> L52
            goto L5b
        L52:
            r1 = move-exception
            r2 = 0
            r7.mDiskLruCache = r2     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "create disk cache error"
            com.lidroid.xutils.util.LogUtils.m13791e(r2, r1)     // Catch: java.lang.Throwable -> L5d
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            return
        L5d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lidroid.xutils.bitmap.core.BitmapCache.initDiskCache():void");
    }

    public void initMemoryCache() {
        if (this.globalConfig.isMemoryCacheEnabled()) {
            if (this.mMemoryCache != null) {
                try {
                    clearMemoryCache();
                } catch (Throwable unused) {
                }
            }
            this.mMemoryCache = new LruMemoryCache<MemoryCacheKey, Bitmap>(this.globalConfig.getMemoryCacheSize()) { // from class: com.lidroid.xutils.bitmap.core.BitmapCache.1
                public C30391(int i) {
                    super(i);
                }

                @Override // com.lidroid.xutils.cache.LruMemoryCache
                public int sizeOf(MemoryCacheKey memoryCacheKey, Bitmap bitmap) {
                    if (bitmap == null) {
                        return 0;
                    }
                    return bitmap.getRowBytes() * bitmap.getHeight();
                }
            };
        }
    }

    public void setDiskCacheFileNameGenerator(FileNameGenerator fileNameGenerator) {
        synchronized (this.mDiskCacheLock) {
            LruDiskCache lruDiskCache = this.mDiskLruCache;
            if (lruDiskCache != null && fileNameGenerator != null) {
                lruDiskCache.setFileNameGenerator(fileNameGenerator);
            }
        }
    }

    public void setDiskCacheSize(int i) {
        synchronized (this.mDiskCacheLock) {
            LruDiskCache lruDiskCache = this.mDiskLruCache;
            if (lruDiskCache != null) {
                lruDiskCache.setMaxSize(i);
            }
        }
    }

    public void setMemoryCacheSize(int i) {
        LruMemoryCache<MemoryCacheKey, Bitmap> lruMemoryCache = this.mMemoryCache;
        if (lruMemoryCache != null) {
            lruMemoryCache.setMaxSize(i);
        }
    }
}
