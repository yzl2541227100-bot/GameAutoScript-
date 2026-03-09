package com.cyjh.feedback.lib.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public class ImageLoader {
    private static final int OooOO0 = 3;
    private static final int OooOO0O = 272;
    private static ImageLoader OooOO0o;
    private Semaphore OooO;
    private LruCache<String, Bitmap> OooO00o;
    private ExecutorService OooO0O0;
    private LinkedBlockingDeque<Runnable> OooO0OO;
    private Thread OooO0Oo;
    private Handler OooO0o;
    private Handler OooO0o0;
    private Type OooO0oO;
    private Semaphore OooO0oo = new Semaphore(0);

    public class OooO {
        public ImageView OooO00o;
        public String OooO0O0;
        public Bitmap OooO0OO;

        public OooO() {
        }
    }

    public class OooO00o extends Thread {

        /* JADX INFO: renamed from: com.cyjh.feedback.lib.utils.ImageLoader$OooO00o$OooO00o, reason: collision with other inner class name */
        public class HandlerC4698OooO00o extends Handler {
            public HandlerC4698OooO00o() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                ImageLoader.this.OooO0O0.execute(ImageLoader.this.OooOOoo());
                try {
                    ImageLoader.this.OooO.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public OooO00o() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            Looper.prepare();
            ImageLoader.this.OooO0o0 = new HandlerC4698OooO00o();
            ImageLoader.this.OooO0oo.release();
            Looper.loop();
        }
    }

    public class OooO0O0 extends LruCache<String, Bitmap> {
        public OooO0O0(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    public class OooO0OO extends Handler {
        public OooO0OO() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            OooO oooO = (OooO) message.obj;
            Bitmap bitmap = oooO.OooO0OO;
            String str = oooO.OooO0O0;
            ImageView imageView = oooO.OooO00o;
            if (imageView.getTag().toString().equals(str)) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class OooO0o implements Runnable {
        public final /* synthetic */ ImageView OoooOoO;
        public final /* synthetic */ String OoooOoo;

        public OooO0o(ImageView imageView, String str) {
            this.OoooOoO = imageView;
            this.OoooOoo = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmapOooOOO0 = ImageLoader.this.OooOOO0(this.OoooOoo, ImageLoader.this.OooOOOo(this.OoooOoO));
            ImageLoader.this.OooOO0(bitmapOooOOO0, this.OoooOoo);
            ImageLoader.this.OooOo0O(bitmapOooOOO0, this.OoooOoo, this.OoooOoO);
            ImageLoader.this.OooO.release();
        }
    }

    public class OooOO0 {
        public int OooO00o;
        public int OooO0O0;

        public OooOO0() {
        }
    }

    public enum Type {
        FIFO,
        FILO
    }

    private ImageLoader(Type type, int i) {
        OooOo0(type, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOO0(Bitmap bitmap, String str) {
        if (OooOOO(str) != null || bitmap == null) {
            return;
        }
        this.OooO00o.put(str, bitmap);
    }

    private synchronized void OooOO0O(Runnable runnable) {
        this.OooO0OO.add(runnable);
        try {
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.OooO0o0 == null) {
            this.OooO0oo.acquire();
            this.OooO0o0.sendEmptyMessage(272);
        } else {
            this.OooO0o0.sendEmptyMessage(272);
        }
    }

    private int OooOO0o(BitmapFactory.Options options, OooOO0 oooOO0) {
        int i = options.outWidth;
        int i2 = options.outHeight;
        int i3 = oooOO0.OooO00o;
        if (i > i3 || i2 > oooOO0.OooO0O0) {
            return Math.max(Math.round((i * 1.0f) / i3), Math.round((i2 * 1.0f) / oooOO0.OooO0O0));
        }
        return 1;
    }

    private Bitmap OooOOO(String str) {
        return this.OooO00o.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap OooOOO0(String str, OooOO0 oooOO0) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = OooOO0o(options, oooOO0);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    private int OooOOOO(Object obj, String str) {
        try {
            Field declaredField = ImageView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            int i = declaredField.getInt(obj);
            if (i <= 0 || i >= Integer.MAX_VALUE) {
                return 0;
            }
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OooOO0 OooOOOo(ImageView imageView) {
        DisplayMetrics displayMetrics = imageView.getContext().getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int width = imageView.getWidth();
        if (width <= 0) {
            width = layoutParams.width;
        }
        if (width <= 0) {
            width = OooOOOO(imageView, "mMaxWidth");
        }
        if (width <= 0) {
            width = displayMetrics.widthPixels;
        }
        int height = imageView.getHeight();
        if (height <= 0) {
            height = layoutParams.height;
        }
        if (height <= 0) {
            height = OooOOOO(imageView, "mMaxHeight");
        }
        if (height <= 0) {
            height = displayMetrics.heightPixels;
        }
        OooOO0 oooOO0 = new OooOO0();
        oooOO0.OooO00o = width;
        oooOO0.OooO0O0 = height;
        return oooOO0;
    }

    public static ImageLoader OooOOo(Type type, int i) {
        if (OooOO0o == null) {
            synchronized (ImageLoader.class) {
                if (OooOO0o == null) {
                    OooOO0o = new ImageLoader(type, i);
                }
            }
        }
        return OooOO0o;
    }

    public static ImageLoader OooOOo0() {
        if (OooOO0o == null) {
            synchronized (ImageLoader.class) {
                if (OooOO0o == null) {
                    OooOO0o = new ImageLoader(Type.FILO, 3);
                }
            }
        }
        return OooOO0o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable OooOOoo() {
        Runnable runnablePollLast;
        Type type = Type.FIFO;
        Type type2 = this.OooO0oO;
        if (type == type2) {
            runnablePollLast = this.OooO0OO.pollFirst();
        } else {
            if (Type.FILO != type2) {
                return null;
            }
            runnablePollLast = this.OooO0OO.pollLast();
        }
        return runnablePollLast;
    }

    private void OooOo0(Type type, int i) {
        this.OooO0oO = type;
        this.OooO = new Semaphore(i);
        OooO00o oooO00o = new OooO00o();
        this.OooO0Oo = oooO00o;
        oooO00o.start();
        this.OooO00o = new OooO0O0(((int) Runtime.getRuntime().maxMemory()) / 8);
        this.OooO0OO = new LinkedBlockingDeque<>();
        this.OooO0O0 = Executors.newFixedThreadPool(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOo0O(Bitmap bitmap, String str, ImageView imageView) {
        OooO oooO = new OooO();
        oooO.OooO0OO = bitmap;
        oooO.OooO0O0 = str;
        oooO.OooO00o = imageView;
        Message messageObtainMessage = this.OooO0o.obtainMessage();
        messageObtainMessage.obj = oooO;
        this.OooO0o.sendMessage(messageObtainMessage);
    }

    public void OooOo00(String str, ImageView imageView) {
        imageView.setTag(str);
        if (this.OooO0o == null) {
            this.OooO0o = new OooO0OO();
        }
        Bitmap bitmapOooOOO = OooOOO(str);
        if (bitmapOooOOO != null) {
            OooOo0O(bitmapOooOOO, str, imageView);
        } else {
            OooOO0O(new OooO0o(imageView, str));
        }
    }
}
