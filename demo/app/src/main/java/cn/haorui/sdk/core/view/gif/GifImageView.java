package cn.haorui.sdk.core.view.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes.dex */
public class GifImageView extends AppCompatImageView implements Runnable {
    private static final String TAG = "GifDecoderView";
    private boolean animating;
    private OnAnimationStart animationStartCallback;
    private OnAnimationStop animationStopCallback;
    private Thread animationThread;
    private boolean canClear;
    private final Runnable cleanupRunnable;
    private OnFrameAvailable frameCallback;
    private long framesDisplayDuration;
    private C0586a gifDecoder;
    private final Handler handler;
    private boolean renderFrame;
    private boolean shouldClear;
    private Bitmap tmpBitmap;
    private final Runnable updateResults;

    public interface OnAnimationStart {
        void onAnimationStart();
    }

    public interface OnAnimationStop {
        void onAnimationStop();
    }

    public interface OnFrameAvailable {
        Bitmap onFrameAvailable(Bitmap bitmap);
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.view.gif.GifImageView$a */
    public class RunnableC0584a implements Runnable {
        public RunnableC0584a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GifImageView.this.tmpBitmap == null || GifImageView.this.tmpBitmap.isRecycled()) {
                return;
            }
            GifImageView gifImageView = GifImageView.this;
            gifImageView.setImageBitmap(gifImageView.tmpBitmap);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.view.gif.GifImageView$b */
    public class RunnableC0585b implements Runnable {
        public RunnableC0585b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GifImageView.this.tmpBitmap = null;
            GifImageView.this.gifDecoder = null;
            GifImageView.this.animationThread = null;
            GifImageView.this.shouldClear = false;
        }
    }

    public GifImageView(Context context) {
        super(context);
        this.handler = new Handler(Looper.getMainLooper());
        this.frameCallback = null;
        this.framesDisplayDuration = -1L;
        this.animationStopCallback = null;
        this.animationStartCallback = null;
        this.updateResults = new RunnableC0584a();
        this.cleanupRunnable = new RunnableC0585b();
        this.canClear = true;
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handler = new Handler(Looper.getMainLooper());
        this.frameCallback = null;
        this.framesDisplayDuration = -1L;
        this.animationStopCallback = null;
        this.animationStartCallback = null;
        this.updateResults = new RunnableC0584a();
        this.cleanupRunnable = new RunnableC0585b();
        this.canClear = true;
    }

    private boolean canStart() {
        return (this.animating || this.renderFrame) && this.gifDecoder != null && this.animationThread == null;
    }

    private void startAnimationThread() {
        if (canStart()) {
            Thread thread = new Thread(this);
            this.animationThread = thread;
            thread.start();
        }
    }

    public void clear() {
        this.animating = false;
        this.renderFrame = false;
        this.shouldClear = true;
        stopAnimation();
        this.handler.post(this.cleanupRunnable);
    }

    public int getFrameCount() {
        return this.gifDecoder.f307p.frameCount;
    }

    public long getFramesDisplayDuration() {
        return this.framesDisplayDuration;
    }

    public int getGifHeight() {
        return this.gifDecoder.f307p.height;
    }

    public int getGifWidth() {
        return this.gifDecoder.f307p.width;
    }

    public OnAnimationStop getOnAnimationStop() {
        return this.animationStopCallback;
    }

    public OnFrameAvailable getOnFrameAvailable() {
        return this.frameCallback;
    }

    public void gotoFrame(int i) {
        boolean z;
        C0586a c0586a = this.gifDecoder;
        if (c0586a.f305n == i) {
            return;
        }
        int i2 = i - 1;
        c0586a.getClass();
        if (i2 < -1 || i2 >= c0586a.f307p.frameCount) {
            z = false;
        } else {
            c0586a.f305n = i2;
            z = true;
        }
        if (!z || this.animating) {
            return;
        }
        this.renderFrame = true;
        startAnimationThread();
    }

    public boolean isAnimating() {
        return this.animating;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.canClear) {
            clear();
        }
    }

    public void resetAnimation() {
        this.gifDecoder.f306o = 0;
        gotoFrame(0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:10|(13:13|(1:15)|16|(1:21)|22|77|23|(1:25)|26|79|27|38|(2:83|61)(6:75|42|(1:50)(1:(1:49))|51|(3:53|(1:55)(1:56)|57)|58))(1:12)|20|22|77|23|(0)|26|79|27|38|(1:83)(1:82)|61) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        android.util.Log.w(cn.haorui.sdk.core.view.gif.GifImageView.TAG, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049 A[Catch: ArrayIndexOutOfBoundsException | IllegalArgumentException -> 0x0064, ArrayIndexOutOfBoundsException -> 0x0067, all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0007, B:7:0x000b, B:62:0x00ab, B:64:0x00af, B:65:0x00b6, B:67:0x00bd, B:10:0x0011, B:23:0x0039, B:25:0x0049, B:26:0x004f, B:27:0x0058, B:38:0x006e, B:42:0x0077, B:44:0x007f, B:49:0x0088, B:51:0x0094, B:53:0x0099, B:57:0x00a1, B:56:0x00a0, B:58:0x00a4, B:61:0x00a9, B:37:0x0069, B:13:0x001d, B:15:0x0023, B:16:0x0028, B:18:0x002c, B:21:0x0032), top: B:73:0x0000 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r10 = this;
            cn.haorui.sdk.core.view.gif.GifImageView$OnAnimationStart r0 = r10.animationStartCallback     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L7
            r0.onAnimationStart()     // Catch: java.lang.Throwable -> Lc1
        L7:
            boolean r0 = r10.animating     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L11
            boolean r0 = r10.renderFrame     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L11
            goto Lab
        L11:
            cn.haorui.sdk.core.view.gif.a r0 = r10.gifDecoder     // Catch: java.lang.Throwable -> Lc1
            cn.haorui.sdk.core.view.gif.GifHeader r1 = r0.f307p     // Catch: java.lang.Throwable -> Lc1
            int r2 = r1.frameCount     // Catch: java.lang.Throwable -> Lc1
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 > 0) goto L1d
            goto L30
        L1d:
            int r6 = r0.f305n     // Catch: java.lang.Throwable -> Lc1
            int r7 = r2 + (-1)
            if (r6 != r7) goto L28
            int r7 = r0.f306o     // Catch: java.lang.Throwable -> Lc1
            int r7 = r7 + r4
            r0.f306o = r7     // Catch: java.lang.Throwable -> Lc1
        L28:
            int r1 = r1.loopCount     // Catch: java.lang.Throwable -> Lc1
            if (r1 == r3) goto L32
            int r7 = r0.f306o     // Catch: java.lang.Throwable -> Lc1
            if (r7 <= r1) goto L32
        L30:
            r4 = 0
            goto L37
        L32:
            int r6 = r6 + 1
            int r6 = r6 % r2
            r0.f305n = r6     // Catch: java.lang.Throwable -> Lc1
        L37:
            r0 = 0
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.ArrayIndexOutOfBoundsException -> L67 java.lang.Throwable -> Lc1
            cn.haorui.sdk.core.view.gif.a r2 = r10.gifDecoder     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.ArrayIndexOutOfBoundsException -> L67 java.lang.Throwable -> Lc1
            android.graphics.Bitmap r2 = r2.m96b()     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.ArrayIndexOutOfBoundsException -> L67 java.lang.Throwable -> Lc1
            r10.tmpBitmap = r2     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.ArrayIndexOutOfBoundsException -> L67 java.lang.Throwable -> Lc1
            cn.haorui.sdk.core.view.gif.GifImageView$OnFrameAvailable r8 = r10.frameCallback     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.ArrayIndexOutOfBoundsException -> L67 java.lang.Throwable -> Lc1
            if (r8 == 0) goto L4f
            android.graphics.Bitmap r2 = r8.onFrameAvailable(r2)     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.ArrayIndexOutOfBoundsException -> L67 java.lang.Throwable -> Lc1
            r10.tmpBitmap = r2     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.ArrayIndexOutOfBoundsException -> L67 java.lang.Throwable -> Lc1
        L4f:
            long r8 = java.lang.System.nanoTime()     // Catch: java.lang.IllegalArgumentException -> L64 java.lang.ArrayIndexOutOfBoundsException -> L67 java.lang.Throwable -> Lc1
            long r8 = r8 - r6
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 / r6
            android.os.Handler r2 = r10.handler     // Catch: java.lang.IllegalArgumentException -> L60 java.lang.ArrayIndexOutOfBoundsException -> L62 java.lang.Throwable -> Lc1
            java.lang.Runnable r6 = r10.updateResults     // Catch: java.lang.IllegalArgumentException -> L60 java.lang.ArrayIndexOutOfBoundsException -> L62 java.lang.Throwable -> Lc1
            r2.post(r6)     // Catch: java.lang.IllegalArgumentException -> L60 java.lang.ArrayIndexOutOfBoundsException -> L62 java.lang.Throwable -> Lc1
            goto L6e
        L60:
            r2 = move-exception
            goto L69
        L62:
            r2 = move-exception
            goto L69
        L64:
            r2 = move-exception
        L65:
            r8 = r0
            goto L69
        L67:
            r2 = move-exception
            goto L65
        L69:
            java.lang.String r6 = "GifDecoderView"
            android.util.Log.w(r6, r2)     // Catch: java.lang.Throwable -> Lc1
        L6e:
            r10.renderFrame = r5     // Catch: java.lang.Throwable -> Lc1
            boolean r2 = r10.animating     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto La9
            if (r4 != 0) goto L77
            goto La9
        L77:
            cn.haorui.sdk.core.view.gif.a r2 = r10.gifDecoder     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            cn.haorui.sdk.core.view.gif.GifHeader r4 = r2.f307p     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            int r6 = r4.frameCount     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            if (r6 <= 0) goto L93
            int r2 = r2.f305n     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            if (r2 >= 0) goto L84
            goto L93
        L84:
            if (r2 < 0) goto L94
            if (r2 >= r6) goto L94
            java.util.List<cn.haorui.sdk.core.view.gif.b> r3 = r4.frames     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            cn.haorui.sdk.core.view.gif.b r2 = (cn.haorui.sdk.core.view.gif.C0587b) r2     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            int r3 = r2.f324i     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            goto L94
        L93:
            r3 = 0
        L94:
            long r2 = (long) r3     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            long r2 = r2 - r8
            int r3 = (int) r2     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            if (r3 <= 0) goto La4
            long r4 = r10.framesDisplayDuration     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto La0
            goto La1
        La0:
            long r4 = (long) r3     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
        La1:
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Lc1
        La4:
            boolean r0 = r10.animating     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L7
            goto Lab
        La9:
            r10.animating = r5     // Catch: java.lang.Throwable -> Lc1
        Lab:
            boolean r0 = r10.shouldClear     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lb6
            android.os.Handler r0 = r10.handler     // Catch: java.lang.Throwable -> Lc1
            java.lang.Runnable r1 = r10.cleanupRunnable     // Catch: java.lang.Throwable -> Lc1
            r0.post(r1)     // Catch: java.lang.Throwable -> Lc1
        Lb6:
            r0 = 0
            r10.animationThread = r0     // Catch: java.lang.Throwable -> Lc1
            cn.haorui.sdk.core.view.gif.GifImageView$OnAnimationStop r0 = r10.animationStopCallback     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lc5
            r0.onAnimationStop()     // Catch: java.lang.Throwable -> Lc1
            goto Lc5
        Lc1:
            r0 = move-exception
            r0.printStackTrace()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.view.gif.GifImageView.run():void");
    }

    public void setBytes(byte[] bArr) {
        C0586a c0586a = new C0586a(new C0588c());
        this.gifDecoder = c0586a;
        try {
            c0586a.m93a(4, bArr);
            if (this.animating) {
                startAnimationThread();
            } else {
                gotoFrame(0);
            }
        } catch (Exception e) {
            this.gifDecoder = null;
            Log.e(TAG, e.getMessage(), e);
        }
    }

    public void setBytes(byte[] bArr, int i) {
        C0586a c0586a = new C0586a(new C0588c());
        this.gifDecoder = c0586a;
        try {
            c0586a.m93a(i, bArr);
            if (this.animating) {
                startAnimationThread();
            } else {
                gotoFrame(0);
            }
        } catch (Exception e) {
            this.gifDecoder = null;
            Log.e(TAG, e.getMessage(), e);
        }
    }

    public void setCanClear(boolean z) {
        this.canClear = z;
    }

    public void setFramesDisplayDuration(long j) {
        this.framesDisplayDuration = j;
    }

    public void setOnAnimationStart(OnAnimationStart onAnimationStart) {
        this.animationStartCallback = onAnimationStart;
    }

    public void setOnAnimationStop(OnAnimationStop onAnimationStop) {
        this.animationStopCallback = onAnimationStop;
    }

    public void setOnFrameAvailable(OnFrameAvailable onFrameAvailable) {
        this.frameCallback = onFrameAvailable;
    }

    public void startAnimation() {
        this.animating = true;
        startAnimationThread();
    }

    public void stopAnimation() {
        this.animating = false;
        Thread thread = this.animationThread;
        if (thread != null) {
            thread.interrupt();
            this.animationThread = null;
        }
    }
}
