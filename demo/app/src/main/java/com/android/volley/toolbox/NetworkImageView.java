package com.android.volley.toolbox;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import p285z2.o00000OO;
import p285z2.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {
    private String OoooOoO;
    private int OoooOoo;
    private int Ooooo00;
    private o00000OO Ooooo0o;
    private OooO0O0 OooooO0;
    private o0000Ooo.OooO00o OooooOO;
    private o00000OO.OooOO0O OooooOo;

    public class OooO00o implements o00000OO.OooOOO0 {
        public final /* synthetic */ boolean OoooOoO;

        /* JADX INFO: renamed from: com.android.volley.toolbox.NetworkImageView$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC4643OooO00o implements Runnable {
            public final /* synthetic */ o00000OO.OooOO0O OoooOoO;

            public RunnableC4643OooO00o(o00000OO.OooOO0O oooOO0O) {
                this.OoooOoO = oooOO0O;
            }

            @Override // java.lang.Runnable
            public void run() {
                OooO00o.this.OooO00o(this.OoooOoO, false);
            }
        }

        public OooO00o(boolean z) {
            this.OoooOoO = z;
        }

        @Override // z2.o00000OO.OooOOO0
        public void OooO00o(o00000OO.OooOO0O oooOO0O, boolean z) {
            if (z && this.OoooOoO) {
                NetworkImageView.this.post(new RunnableC4643OooO00o(oooOO0O));
                return;
            }
            if (oooOO0O.OooO0Oo() != null) {
                NetworkImageView.this.setImageBitmap(oooOO0O.OooO0Oo());
            } else if (NetworkImageView.this.OoooOoo != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.OoooOoo);
            }
        }

        @Override // z2.oo000o.OooO00o
        public void OooO0O0(VolleyError volleyError) {
            if (NetworkImageView.this.Ooooo00 != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.Ooooo00);
            }
        }
    }

    public interface OooO0O0 {
        String OooO00o(String str, int i, int i2, ImageView.ScaleType scaleType, Context context);
    }

    public NetworkImageView(Context context) {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void OooO0Oo() {
        int i = this.OoooOoo;
        if (i != 0) {
            setImageResource(i);
        } else {
            setImageBitmap(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0OO(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            android.widget.ImageView$ScaleType r7 = r9.getScaleType()
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2a
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            int r2 = r2.width
            r5 = -2
            if (r2 != r5) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            int r6 = r6.height
            if (r6 != r5) goto L2b
            r5 = 1
            goto L2c
        L2a:
            r2 = 0
        L2b:
            r5 = 0
        L2c:
            if (r2 == 0) goto L31
            if (r5 == 0) goto L31
            goto L32
        L31:
            r3 = 0
        L32:
            if (r0 != 0) goto L39
            if (r1 != 0) goto L39
            if (r3 != 0) goto L39
            return
        L39:
            java.lang.String r3 = r9.OoooOoO
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L4f
            z2.o00000OO$OooOO0O r10 = r9.OooooOo
            if (r10 == 0) goto L4b
            r10.OooO0OO()
            r10 = 0
            r9.OooooOo = r10
        L4b:
            r9.OooO0Oo()
            return
        L4f:
            if (r2 == 0) goto L53
            r6 = 0
            goto L54
        L53:
            r6 = r0
        L54:
            if (r5 == 0) goto L58
            r8 = 0
            goto L59
        L58:
            r8 = r1
        L59:
            java.lang.String r1 = r9.OoooOoO
            com.android.volley.toolbox.NetworkImageView$OooO0O0 r0 = r9.OooooO0
            if (r0 == 0) goto L73
            android.widget.ImageView$ScaleType r4 = r9.getScaleType()
            android.content.Context r2 = r9.getContext()
            android.content.Context r5 = r2.getApplicationContext()
            r2 = r6
            r3 = r8
            java.lang.String r0 = r0.OooO00o(r1, r2, r3, r4, r5)
            r3 = r0
            goto L74
        L73:
            r3 = r1
        L74:
            z2.o00000OO$OooOO0O r0 = r9.OooooOo
            if (r0 == 0) goto L93
            java.lang.String r0 = r0.OooO0o0()
            if (r0 == 0) goto L93
            z2.o00000OO$OooOO0O r0 = r9.OooooOo
            java.lang.String r0 = r0.OooO0o0()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L8b
            return
        L8b:
            z2.o00000OO$OooOO0O r0 = r9.OooooOo
            r0.OooO0OO()
            r9.OooO0Oo()
        L93:
            z2.o00000OO r2 = r9.Ooooo0o
            com.android.volley.toolbox.NetworkImageView$OooO00o r4 = new com.android.volley.toolbox.NetworkImageView$OooO00o
            r4.<init>(r10)
            z2.o0000Ooo$OooO00o r10 = r9.OooooOO
            r5 = r6
            r6 = r8
            r8 = r10
            z2.o00000OO$OooOO0O r10 = r2.OooO0oo(r3, r4, r5, r6, r7, r8)
            r9.OooooOo = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.NetworkImageView.OooO0OO(boolean):void");
    }

    public void OooO0o(String str, o00000OO o00000oo, OooO0O0 oooO0O0) {
        this.OoooOoO = str;
        this.Ooooo0o = o00000oo;
        this.OooooO0 = oooO0O0;
        OooO0OO(false);
    }

    public void OooO0o0(String str, o00000OO o00000oo) {
        OooO0o(str, o00000oo, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        o00000OO.OooOO0O oooOO0O = this.OooooOo;
        if (oooOO0O != null) {
            oooOO0O.OooO0OO();
            setImageBitmap(null);
            this.OooooOo = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0OO(true);
    }

    public void setDefaultImageResId(int i) {
        this.OoooOoo = i;
    }

    public void setErrorImageResId(int i) {
        this.Ooooo00 = i;
    }

    public void setTransformation(o0000Ooo.OooO00o oooO00o) {
        this.OooooOO = oooO00o;
    }
}
