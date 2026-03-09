package com.octopus.p222ad.internal.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.collection.LruCache;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.utils.p258b.C3253d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class ImageManager {
    private static ImageManager instance;
    private static Context mContext;
    private ExecutorService executorService = Executors.newFixedThreadPool(4);
    private LruCache<String, Bitmap> imageCache = new LruCache<>(4194304);
    private Handler handler = new Handler();

    /* JADX INFO: renamed from: com.octopus.ad.internal.utilities.ImageManager$1 */
    public class RunnableC31361 implements Runnable {
        public final /* synthetic */ String val$imgUrl;
        public final /* synthetic */ BitmapLoadedListener val$listener;

        /* JADX INFO: renamed from: com.octopus.ad.internal.utilities.ImageManager$1$1 */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ Bitmap val$bm;

            public AnonymousClass1(Bitmap bitmap) {
                bitmap = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                bitmapLoadedListener.onBitmapLoaded(bitmap);
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.utilities.ImageManager$1$2 */
        public class AnonymousClass2 implements Runnable {
            public AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public void run() {
                bitmapLoadedListener.onBitmapLoadFailed();
            }
        }

        public RunnableC31361(String str, BitmapLoadedListener bitmapLoadedListener) {
            str = str;
            bitmapLoadedListener = bitmapLoadedListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(2000);
                if (httpURLConnection.getResponseCode() == 200) {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                    httpURLConnection.disconnect();
                    ImageManager.this.handler.post(new Runnable() { // from class: com.octopus.ad.internal.utilities.ImageManager.1.1
                        public final /* synthetic */ Bitmap val$bm;

                        public AnonymousClass1(Bitmap bitmapDecodeStream2) {
                            bitmap = bitmapDecodeStream2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            bitmapLoadedListener.onBitmapLoaded(bitmap);
                        }
                    });
                    ImageManager.this.imageCache.put(str, bitmapDecodeStream2);
                    String str = str;
                    bitmapDecodeStream2.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(C3253d.m14979c(ImageManager.mContext), HashingFunctions.md5(str.substring(str.lastIndexOf("/") + 1)))));
                }
            } catch (Exception unused) {
                ImageManager.this.handler.post(new Runnable() { // from class: com.octopus.ad.internal.utilities.ImageManager.1.2
                    public AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        bitmapLoadedListener.onBitmapLoadFailed();
                    }
                });
            }
        }
    }

    public interface BitmapLoadedListener {
        void onBitmapLoadFailed();

        void onBitmapLoaded(Bitmap bitmap);
    }

    public class RequestCreatorRunnble implements Runnable {
        public int errorResId;
        public int holderResId;
        public ImageView imageView;
        public String url;

        /* JADX INFO: renamed from: com.octopus.ad.internal.utilities.ImageManager$RequestCreatorRunnble$1 */
        public class RunnableC31371 implements Runnable {
            public final /* synthetic */ Bitmap val$bm;

            public RunnableC31371(Bitmap bitmap) {
                bitmap = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                RequestCreatorRunnble.this.imageView.setImageBitmap(bitmap);
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.utilities.ImageManager$RequestCreatorRunnble$2 */
        public class RunnableC31382 implements Runnable {
            public RunnableC31382() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public RequestCreatorRunnble(String str) {
            this.url = str;
        }

        private Bitmap getBitmapFile() {
            String str = this.url;
            File file = new File(C3253d.m14979c(ImageManager.mContext), HashingFunctions.md5(str.substring(str.lastIndexOf("/") + 1)));
            if (!file.exists() || file.length() <= 0) {
                return null;
            }
            return BitmapFactory.decodeFile(file.getAbsolutePath());
        }

        private void showError() {
            ImageManager.this.handler.post(new Runnable() { // from class: com.octopus.ad.internal.utilities.ImageManager.RequestCreatorRunnble.2
                public RunnableC31382() {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }

        public RequestCreatorRunnble error(int i) {
            this.errorResId = i;
            return this;
        }

        public void into(ImageView imageView) {
            this.imageView = imageView;
            if (TextUtils.isEmpty(this.url)) {
                return;
            }
            Bitmap bitmap = (Bitmap) ImageManager.this.imageCache.get(this.url);
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
            Bitmap bitmapFile = getBitmapFile();
            if (bitmapFile == null) {
                ImageManager.this.executorService.submit(this);
            } else {
                imageView.setImageBitmap(bitmapFile);
                ImageManager.this.imageCache.put(this.url, bitmapFile);
            }
        }

        public RequestCreatorRunnble placeholder(int i) {
            this.holderResId = i;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.url).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(2000);
                if (httpURLConnection.getResponseCode() == 200) {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                    ImageManager.this.handler.post(new Runnable() { // from class: com.octopus.ad.internal.utilities.ImageManager.RequestCreatorRunnble.1
                        public final /* synthetic */ Bitmap val$bm;

                        public RunnableC31371(Bitmap bitmapDecodeStream2) {
                            bitmap = bitmapDecodeStream2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            RequestCreatorRunnble.this.imageView.setImageBitmap(bitmap);
                        }
                    });
                    ImageManager.this.imageCache.put(this.url, bitmapDecodeStream2);
                    String str = this.url;
                    bitmapDecodeStream2.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(C3253d.m14979c(ImageManager.mContext), HashingFunctions.md5(str.substring(str.lastIndexOf("/") + 1)))));
                } else {
                    showError();
                }
            } catch (FileNotFoundException unused) {
            } catch (Exception e) {
                e.printStackTrace();
                showError();
            }
        }
    }

    private static ImageManager getInstance() {
        if (instance == null) {
            synchronized (ImageManager.class) {
                if (instance == null) {
                    instance = new ImageManager();
                }
            }
        }
        return instance;
    }

    public static ImageManager with(Context context) {
        if (C3120m.m14425a().f17185h != null) {
            context = C3120m.m14425a().f17185h;
        }
        mContext = context;
        return getInstance();
    }

    public void getBitmap(String str, BitmapLoadedListener bitmapLoadedListener) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bitmap bitmap = this.imageCache.get(str);
        Bitmap bitmapDecodeFile = null;
        if (bitmap != null) {
            bitmapLoadedListener.onBitmapLoaded(bitmap);
            return;
        }
        File file = new File(C3253d.m14979c(mContext), HashingFunctions.md5(str.substring(str.lastIndexOf("/") + 1)));
        if (file.exists() && file.length() > 0) {
            bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        }
        if (bitmapDecodeFile == null) {
            this.executorService.submit(new Runnable() { // from class: com.octopus.ad.internal.utilities.ImageManager.1
                public final /* synthetic */ String val$imgUrl;
                public final /* synthetic */ BitmapLoadedListener val$listener;

                /* JADX INFO: renamed from: com.octopus.ad.internal.utilities.ImageManager$1$1 */
                public class AnonymousClass1 implements Runnable {
                    public final /* synthetic */ Bitmap val$bm;

                    public AnonymousClass1(Bitmap bitmapDecodeStream2) {
                        bitmap = bitmapDecodeStream2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        bitmapLoadedListener.onBitmapLoaded(bitmap);
                    }
                }

                /* JADX INFO: renamed from: com.octopus.ad.internal.utilities.ImageManager$1$2 */
                public class AnonymousClass2 implements Runnable {
                    public AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        bitmapLoadedListener.onBitmapLoadFailed();
                    }
                }

                public RunnableC31361(String str2, BitmapLoadedListener bitmapLoadedListener2) {
                    str = str2;
                    bitmapLoadedListener = bitmapLoadedListener2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(2000);
                        if (httpURLConnection.getResponseCode() == 200) {
                            Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                            httpURLConnection.disconnect();
                            ImageManager.this.handler.post(new Runnable() { // from class: com.octopus.ad.internal.utilities.ImageManager.1.1
                                public final /* synthetic */ Bitmap val$bm;

                                public AnonymousClass1(Bitmap bitmapDecodeStream22) {
                                    bitmap = bitmapDecodeStream22;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    bitmapLoadedListener.onBitmapLoaded(bitmap);
                                }
                            });
                            ImageManager.this.imageCache.put(str, bitmapDecodeStream22);
                            String str2 = str;
                            bitmapDecodeStream22.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(C3253d.m14979c(ImageManager.mContext), HashingFunctions.md5(str2.substring(str2.lastIndexOf("/") + 1)))));
                        }
                    } catch (Exception unused) {
                        ImageManager.this.handler.post(new Runnable() { // from class: com.octopus.ad.internal.utilities.ImageManager.1.2
                            public AnonymousClass2() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                bitmapLoadedListener.onBitmapLoadFailed();
                            }
                        });
                    }
                }
            });
        } else {
            this.imageCache.put(str2, bitmapDecodeFile);
            bitmapLoadedListener2.onBitmapLoaded(bitmapDecodeFile);
        }
    }

    public RequestCreatorRunnble load(String str) {
        return new RequestCreatorRunnble(str);
    }
}
