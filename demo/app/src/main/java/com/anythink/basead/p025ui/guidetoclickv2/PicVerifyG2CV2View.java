package com.anythink.basead.p025ui.guidetoclickv2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.p025ui.guidetoclickv2.picverify.PictureVerifyView;
import com.anythink.basead.p025ui.guidetoclickv2.picverify.TextSeekbar;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.p086d.C1486b;

/* JADX INFO: loaded from: classes.dex */
public class PicVerifyG2CV2View extends BaseG2CV2View {

    /* JADX INFO: renamed from: c */
    public PictureVerifyView f2104c;

    /* JADX INFO: renamed from: d */
    public TextSeekbar f2105d;

    /* JADX INFO: renamed from: e */
    public String f2106e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f2107f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f2108g;

    /* JADX INFO: renamed from: h */
    public int f2109h;

    /* JADX INFO: renamed from: i */
    private boolean f2110i;

    /* JADX INFO: renamed from: j */
    private boolean f2111j;

    /* JADX INFO: renamed from: k */
    private final int f2112k;

    /* JADX INFO: renamed from: l */
    private final int f2113l;

    /* JADX INFO: renamed from: m */
    private final int f2114m;

    /* JADX INFO: renamed from: n */
    private final int f2115n;

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View$4 */
    public class C10134 implements ValueAnimator.AnimatorUpdateListener {
        public C10134() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            PicVerifyG2CV2View.this.f2105d.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View$5 */
    public class C10145 implements ValueAnimator.AnimatorUpdateListener {
        public C10145() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PicVerifyG2CV2View picVerifyG2CV2View = PicVerifyG2CV2View.this;
            if (picVerifyG2CV2View.f2109h != iIntValue) {
                picVerifyG2CV2View.f2109h = iIntValue;
                picVerifyG2CV2View.f2105d.setProgress(iIntValue);
            }
        }
    }

    public PicVerifyG2CV2View(Context context) {
        super(context);
        this.f2112k = 30;
        this.f2113l = 15;
        this.f2114m = C1486b.f7228b;
        this.f2115n = 300;
        this.f2109h = -1;
    }

    /* JADX INFO: renamed from: a */
    private BitmapDrawable m1248a(Context context, int i, int i2, int i3) {
        return new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), i), i2, i3, false));
    }

    /* JADX INFO: renamed from: a */
    private void m1249a(int i) {
        this.f2105d.setClickable(false);
        this.f2105d.setEnabled(false);
        this.f2105d.getProgressDrawable().setAlpha(255);
        if (this.f2108g == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 100);
            this.f2108g = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(new C10145());
            this.f2108g.setDuration(300L);
            this.f2108g.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1250a(PicVerifyG2CV2View picVerifyG2CV2View) {
        if (picVerifyG2CV2View.f2107f == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 15);
            picVerifyG2CV2View.f2107f = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(picVerifyG2CV2View.new C10134());
            picVerifyG2CV2View.f2107f.setRepeatMode(2);
            picVerifyG2CV2View.f2107f.setRepeatCount(-1);
            picVerifyG2CV2View.f2107f.setDuration(500L);
        }
        if (picVerifyG2CV2View.f2107f.isStarted() || picVerifyG2CV2View.f2108g != null) {
            return;
        }
        picVerifyG2CV2View.f2107f.start();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1251a(PicVerifyG2CV2View picVerifyG2CV2View, int i) {
        picVerifyG2CV2View.f2105d.setClickable(false);
        picVerifyG2CV2View.f2105d.setEnabled(false);
        picVerifyG2CV2View.f2105d.getProgressDrawable().setAlpha(255);
        if (picVerifyG2CV2View.f2108g == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 100);
            picVerifyG2CV2View.f2108g = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(picVerifyG2CV2View.new C10145());
            picVerifyG2CV2View.f2108g.setDuration(300L);
            picVerifyG2CV2View.f2108g.start();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m1255c() {
        this.f2105d.setProgress(0);
    }

    /* JADX INFO: renamed from: d */
    private void m1257d() {
        if (this.f2107f == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 15);
            this.f2107f = valueAnimatorOfInt;
            valueAnimatorOfInt.addUpdateListener(new C10134());
            this.f2107f.setRepeatMode(2);
            this.f2107f.setRepeatCount(-1);
            this.f2107f.setDuration(500L);
        }
        if (this.f2107f.isStarted() || this.f2108g != null) {
            return;
        }
        this.f2107f.start();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1258d(PicVerifyG2CV2View picVerifyG2CV2View) {
        ValueAnimator valueAnimator = picVerifyG2CV2View.f2107f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m1259e() {
        ValueAnimator valueAnimator = this.f2107f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    /* JADX INFO: renamed from: a */
    public final void mo1223a(int i, int i2) {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_g2c_v2_pic_vertify", "layout"), this);
        this.f2104c = (PictureVerifyView) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_picvertify", "id"));
        this.f2105d = (TextSeekbar) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_picvertify_seekbar", "id"));
        final int iM4153a = C1345i.m4153a(getContext(), 48.0f);
        this.f2104c.setBlockSize(iM4153a);
        this.f2104c.callback(new PictureVerifyView.InterfaceC1022a() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.1
            @Override // com.anythink.basead.p025ui.guidetoclickv2.picverify.PictureVerifyView.InterfaceC1022a
            /* JADX INFO: renamed from: a */
            public final void mo1260a() {
                AbstractC0989b.a aVar = PicVerifyG2CV2View.this.f2057b;
                if (aVar != null) {
                    aVar.mo534a(11, 16);
                }
            }

            @Override // com.anythink.basead.p025ui.guidetoclickv2.picverify.PictureVerifyView.InterfaceC1022a
            /* JADX INFO: renamed from: b */
            public final void mo1261b() {
            }
        });
        if (!TextUtils.isEmpty(this.f2106e)) {
            C1378b.m4482a(getContext()).m4495a(new C1381e(1, this.f2106e), new C1378b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.2
                @Override // com.anythink.core.common.res.C1378b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.C1378b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, PicVerifyG2CV2View.this.f2106e)) {
                        DisplayMetrics displayMetrics = PicVerifyG2CV2View.this.getContext().getResources().getDisplayMetrics();
                        int[] iArrM4270a = C1360x.m4270a(displayMetrics.widthPixels, displayMetrics.heightPixels, bitmap.getWidth() / bitmap.getHeight());
                        int i3 = iM4153a * 2;
                        if (bitmap.getWidth() < i3 || bitmap.getHeight() < i3) {
                            BaseG2CV2View.InterfaceC1001b interfaceC1001b = PicVerifyG2CV2View.this.f2056a;
                            if (interfaceC1001b != null) {
                                interfaceC1001b.mo1225a();
                                return;
                            }
                            return;
                        }
                        int iM4153a2 = C1345i.m4153a(PicVerifyG2CV2View.this.getContext(), 180.0f);
                        if (iArrM4270a[0] < iM4153a2 || iArrM4270a[1] < iM4153a2) {
                            BaseG2CV2View.InterfaceC1001b interfaceC1001b2 = PicVerifyG2CV2View.this.f2056a;
                            if (interfaceC1001b2 != null) {
                                interfaceC1001b2.mo1225a();
                                return;
                            }
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = PicVerifyG2CV2View.this.f2104c.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = iArrM4270a[0];
                            layoutParams.height = iArrM4270a[1];
                            PicVerifyG2CV2View.this.f2104c.setLayoutParams(layoutParams);
                        }
                        PicVerifyG2CV2View.this.f2104c.setImageBitmap(bitmap);
                        PicVerifyG2CV2View.this.post(new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((RelativeLayout.LayoutParams) PicVerifyG2CV2View.this.f2105d.getLayoutParams()).setMargins(0, (PicVerifyG2CV2View.this.getMeasuredHeight() / 2) + (iM4153a / 2), 0, 0);
                                PicVerifyG2CV2View.this.f2105d.setVisibility(0);
                                PicVerifyG2CV2View.m1250a(PicVerifyG2CV2View.this);
                            }
                        });
                    }
                }
            });
        }
        this.f2105d.setProgressDrawable(getResources().getDrawable(C1345i.m4154a(getContext(), "myoffer_g2c_seek_bar_bg", C1875i.f11528c)));
        TextSeekbar textSeekbar = this.f2105d;
        Context context = getContext();
        int iM4154a = C1345i.m4154a(getContext(), "myoffer_seek_bar_icon", C1875i.f11528c);
        textSeekbar.setThumb(new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), iM4154a), C1345i.m4153a(getContext(), 60.0f), C1345i.m4153a(getContext(), 24.0f), false)));
        this.f2105d.setThumbOffset(0);
        this.f2105d.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.3
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i3, boolean z) {
                if (!z) {
                    PicVerifyG2CV2View.this.f2104c.move(i3);
                    if (i3 == 100) {
                        PicVerifyG2CV2View.this.f2104c.loose();
                        return;
                    }
                    return;
                }
                if (PicVerifyG2CV2View.this.f2111j) {
                    PicVerifyG2CV2View.this.f2111j = false;
                    PicVerifyG2CV2View picVerifyG2CV2View = PicVerifyG2CV2View.this;
                    if (i3 > 30) {
                        picVerifyG2CV2View.f2110i = false;
                    } else {
                        picVerifyG2CV2View.f2110i = true;
                    }
                }
                if (!PicVerifyG2CV2View.this.f2110i) {
                    seekBar.setProgress(0);
                    return;
                }
                PicVerifyG2CV2View picVerifyG2CV2View2 = PicVerifyG2CV2View.this;
                if (i3 > 30) {
                    PicVerifyG2CV2View.m1251a(picVerifyG2CV2View2, i3);
                } else {
                    picVerifyG2CV2View2.f2104c.move(i3);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                PicVerifyG2CV2View.this.f2111j = true;
                PicVerifyG2CV2View.m1258d(PicVerifyG2CV2View.this);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                if (PicVerifyG2CV2View.this.f2110i) {
                    PicVerifyG2CV2View.this.f2104c.loose();
                }
                PicVerifyG2CV2View.m1250a(PicVerifyG2CV2View.this);
            }
        });
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    public boolean canStartNextAnim() {
        return this.f2108g == null;
    }

    public void loadImage(String str) {
        this.f2106e = str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ValueAnimator valueAnimator = this.f2107f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f2108g;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
