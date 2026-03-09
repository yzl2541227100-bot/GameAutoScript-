package com.anythink.basead.p025ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p025ui.WrapRoundImageView;
import com.anythink.basead.p025ui.animplayerview.scale.AlbumScaleAnimatorView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import java.util.List;
import p285z2.InterfaceC4236p7;

/* JADX INFO: loaded from: classes.dex */
public class AlbumScaleAnimPlayerView extends BaseMainAnimPlayerView {

    /* JADX INFO: renamed from: A */
    private List<Bitmap> f1785A;

    /* JADX INFO: renamed from: B */
    private Paint f1786B;

    /* JADX INFO: renamed from: y */
    private InterfaceC0975c f1787y;

    /* JADX INFO: renamed from: z */
    private boolean f1788z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.AlbumScaleAnimPlayerView$1 */
    public class C09601 implements C1378b.a {
        public C09601() {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
            AlbumScaleAnimPlayerView.this.mo1091a(C0748f.m310a(C0748f.f730l, C0748f.f716O));
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, AlbumScaleAnimPlayerView.this.f1794e)) {
                if (AlbumScaleAnimPlayerView.this.f1787y == null) {
                    AlbumScaleAnimPlayerView.this.f1787y = new AlbumScaleAnimatorView(AlbumScaleAnimPlayerView.this.getContext().getApplicationContext());
                    AlbumScaleAnimPlayerView.this.f1787y.setBitmapResources(AlbumScaleAnimPlayerView.this.f1785A);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    AlbumScaleAnimPlayerView albumScaleAnimPlayerView = AlbumScaleAnimPlayerView.this;
                    albumScaleAnimPlayerView.addView((View) albumScaleAnimPlayerView.f1787y, layoutParams);
                    AlbumScaleAnimPlayerView.this.f1787y.addMainView(bitmap, new WrapRoundImageView[0]);
                }
                if (AlbumScaleAnimPlayerView.this.f1788z) {
                    AlbumScaleAnimPlayerView.m1076d(AlbumScaleAnimPlayerView.this);
                    if (AlbumScaleAnimPlayerView.this.f1787y != null) {
                        AlbumScaleAnimPlayerView.this.f1787y.start();
                    }
                }
            }
        }
    }

    public AlbumScaleAnimPlayerView(Context context) {
        this(context, null);
    }

    public AlbumScaleAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m1076d(AlbumScaleAnimPlayerView albumScaleAnimPlayerView) {
        albumScaleAnimPlayerView.f1788z = false;
        return false;
    }

    /* JADX INFO: renamed from: j */
    private void m1077j() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), new int[]{Color.parseColor("#DF4B32"), Color.parseColor("#800915")}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        this.f1786B = paint;
        paint.setShader(linearGradient);
    }

    /* JADX INFO: renamed from: k */
    private void m1078k() {
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1794e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new C09601());
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: a */
    public final void mo1079a() {
        InterfaceC0975c interfaceC0975c = this.f1787y;
        if (interfaceC0975c != null) {
            interfaceC0975c.start();
        } else {
            this.f1788z = true;
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseMainAnimPlayerView
    /* JADX INFO: renamed from: a */
    public final void mo1080a(Context context) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), new int[]{Color.parseColor("#DF4B32"), Color.parseColor("#800915")}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        this.f1786B = paint;
        paint.setShader(linearGradient);
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1794e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new C09601());
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: b */
    public final void mo1081b() {
        InterfaceC0975c interfaceC0975c = this.f1787y;
        if (interfaceC0975c != null) {
            interfaceC0975c.pause();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: c */
    public final void mo1082c() {
        InterfaceC0975c interfaceC0975c = this.f1787y;
        if (interfaceC0975c != null) {
            interfaceC0975c.stop();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: d */
    public final void mo1083d() {
        InterfaceC0975c interfaceC0975c = this.f1787y;
        if (interfaceC0975c != null) {
            interfaceC0975c.release();
            this.f1787y = null;
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: e */
    public final int mo1084e() {
        return InterfaceC4236p7.OooO0OO;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseMainAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void init(AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, List<Bitmap> list) {
        this.f1785A = list;
        super.init(abstractC1247l, c1248m, z, list);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1786B != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f1786B);
        }
    }
}
