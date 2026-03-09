package com.anythink.expressad.video.p154bt.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.video.module.p172a.p173a.C2179e;
import com.anythink.expressad.video.module.p172a.p173a.C2184j;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.videocommon.p181e.C2340d;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.anythink.expressad.videocommon.view.StarLevelView;
import com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkBTNativeEC extends BTBaseView {

    /* JADX INFO: renamed from: p */
    private static final String f12997p = "anythink_reward_endcard_native_hor";

    /* JADX INFO: renamed from: q */
    private static final String f12998q = "anythink_reward_endcard_native_land";

    /* JADX INFO: renamed from: A */
    private TextView f12999A;

    /* JADX INFO: renamed from: B */
    private TextView f13000B;

    /* JADX INFO: renamed from: C */
    private StarLevelView f13001C;

    /* JADX INFO: renamed from: D */
    private boolean f13002D;

    /* JADX INFO: renamed from: E */
    private boolean f13003E;

    /* JADX INFO: renamed from: F */
    private int f13004F;

    /* JADX INFO: renamed from: G */
    private Runnable f13005G;

    /* JADX INFO: renamed from: H */
    private View f13006H;

    /* JADX INFO: renamed from: I */
    private View f13007I;

    /* JADX INFO: renamed from: J */
    private String f13008J;

    /* JADX INFO: renamed from: K */
    private C2202j f13009K;

    /* JADX INFO: renamed from: L */
    private WebView f13010L;

    /* JADX INFO: renamed from: r */
    private ViewGroup f13011r;

    /* JADX INFO: renamed from: s */
    private ViewGroup f13012s;

    /* JADX INFO: renamed from: t */
    private RelativeLayout f13013t;

    /* JADX INFO: renamed from: u */
    private ImageView f13014u;

    /* JADX INFO: renamed from: v */
    private RoundImageView f13015v;

    /* JADX INFO: renamed from: w */
    private ImageView f13016w;

    /* JADX INFO: renamed from: x */
    private ImageView f13017x;

    /* JADX INFO: renamed from: y */
    private ImageView f13018y;

    /* JADX INFO: renamed from: z */
    private TextView f13019z;

    public AnythinkBTNativeEC(Context context) {
        super(context);
        this.f13002D = false;
        this.f13003E = false;
        this.f13004F = 0;
    }

    public AnythinkBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13002D = false;
        this.f13003E = false;
        this.f13004F = 0;
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m10999a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11000a(float f, float f2) {
        if (this.f13010L != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f13087n);
                jSONObject.put("id", this.f13093d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f2));
                jSONObject.put("data", jSONObject2);
                C1469j.m5701a();
                C1469j.m5703a(this.f13010L, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                C2024c.m10829a();
                C2024c.m10832a(this.f13010L, "onClicked", this.f13093d);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11001a(View view) {
        if (view == null) {
            init(this.f13090a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        m11008b(view);
        mo11014a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11002a(AnythinkBTNativeEC anythinkBTNativeEC, float f, float f2) {
        if (anythinkBTNativeEC.f13010L != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f13087n);
                jSONObject.put("id", anythinkBTNativeEC.f13093d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f2));
                jSONObject.put("data", jSONObject2);
                C1469j.m5701a();
                C1469j.m5703a(anythinkBTNativeEC.f13010L, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                C2024c.m10829a();
                C2024c.m10832a(anythinkBTNativeEC.f13010L, "onClicked", anythinkBTNativeEC.f13093d);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11003a(AnythinkBTNativeEC anythinkBTNativeEC, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(C1801a.f11116ce, anythinkBTNativeEC.m11044a(i));
                } catch (JSONException e) {
                    e = e;
                    jSONObject2 = jSONObject;
                    e.printStackTrace();
                    jSONObject = jSONObject2;
                }
            } catch (JSONException e2) {
                e = e2;
            }
            C2202j c2202j = anythinkBTNativeEC.f13009K;
            if (c2202j != null) {
                c2202j.click(1, jSONObject != null ? jSONObject.toString() : "");
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m11004a(AnythinkBTNativeEC anythinkBTNativeEC) {
        anythinkBTNativeEC.f13003E = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private int m11005b() {
        return findLayout(isLandscape() ? f12998q : f12997p);
    }

    /* JADX INFO: renamed from: b */
    private boolean m11007b(int i) {
        View view;
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f13095f.inflate(i, (ViewGroup) null);
            this.f13012s = viewGroup;
            addView(viewGroup);
            view = this.f13012s;
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f13095f.inflate(i, (ViewGroup) null);
            this.f13011r = viewGroup2;
            addView(viewGroup2);
            view = this.f13011r;
        }
        return m11008b(view);
    }

    /* JADX INFO: renamed from: b */
    private boolean m11008b(View view) {
        try {
            this.f13013t = (RelativeLayout) view.findViewById(findID("anythink_native_ec_layout"));
            this.f13014u = (ImageView) view.findViewById(findID("anythink_iv_adbanner_bg"));
            this.f13015v = (RoundImageView) view.findViewById(findID("anythink_iv_adbanner"));
            this.f13016w = (ImageView) view.findViewById(findID("anythink_iv_icon"));
            this.f13017x = (ImageView) view.findViewById(findID("anythink_iv_flag"));
            this.f13018y = (ImageView) view.findViewById(findID("anythink_iv_link"));
            this.f13019z = (TextView) view.findViewById(findID("anythink_tv_apptitle"));
            this.f12999A = (TextView) view.findViewById(findID("anythink_tv_appdesc"));
            this.f13000B = (TextView) view.findViewById(findID("anythink_tv_nuater"));
            this.f13001C = (StarLevelView) view.findViewById(findID("anythink_sv_starlevel"));
            this.f13006H = view.findViewById(findID("anythink_iv_close"));
            View viewFindViewById = view.findViewById(findID("anythink_tv_cta"));
            this.f13007I = viewFindViewById;
            return isNotNULL(this.f13014u, this.f13015v, this.f13016w, this.f13019z, this.f12999A, this.f13000B, this.f13001C, this.f13006H, viewFindViewById);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m11010c(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(C1801a.f11116ce, m11044a(i));
                } catch (JSONException e) {
                    e = e;
                    jSONObject2 = jSONObject;
                    e.printStackTrace();
                    jSONObject = jSONObject2;
                }
            } catch (JSONException e2) {
                e = e2;
            }
            C2202j c2202j = this.f13009K;
            if (c2202j != null) {
                c2202j.click(1, jSONObject != null ? jSONObject.toString() : "");
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    /* JADX INFO: renamed from: a */
    public final void mo11014a() {
        if (this.f13097h) {
            this.f13013t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTNativeEC.this.f13002D) {
                        AnythinkBTNativeEC.m11003a(AnythinkBTNativeEC.this, 1);
                        AnythinkBTNativeEC.m11002a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                    }
                }
            });
            this.f13006H.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTNativeEC.this.f13010L != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", AnythinkBTNativeEC.this.f13093d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("unitId", AnythinkBTNativeEC.this.f13008J);
                            jSONObject.put("data", jSONObject2);
                            new StringBuilder("NativeEC Call H5 onCloseBtnClicked ").append(jSONObject.toString());
                        } catch (JSONException e) {
                            e.getMessage();
                        }
                        C1469j.m5701a();
                        C1469j.m5703a(AnythinkBTNativeEC.this.f13010L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            });
            this.f13007I.setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.6
                @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                /* JADX INFO: renamed from: a */
                public final void mo11015a(View view) {
                    AnythinkBTNativeEC.m11003a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.m11002a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f13016w.setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.7
                @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                /* JADX INFO: renamed from: a */
                public final void mo11015a(View view) {
                    AnythinkBTNativeEC.m11003a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.m11002a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f13015v.setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.8
                @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                /* JADX INFO: renamed from: a */
                public final void mo11015a(View view) {
                    AnythinkBTNativeEC.m11003a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.m11002a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
        }
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript renderScriptCreate = RenderScript.create(this.f13090a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            bitmap.recycle();
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void init(Context context) {
        View view;
        int iFindLayout = findLayout(isLandscape() ? f12998q : f12997p);
        if (iFindLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f13095f.inflate(iFindLayout, (ViewGroup) null);
                this.f13012s = viewGroup;
                addView(viewGroup);
                view = this.f13012s;
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f13095f.inflate(iFindLayout, (ViewGroup) null);
                this.f13011r = viewGroup2;
                addView(viewGroup2);
                view = this.f13011r;
            }
            this.f13097h = m11008b(view);
            mo11014a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13005G == null) {
            this.f13005G = new Runnable() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkBTNativeEC.m11004a(AnythinkBTNativeEC.this);
                    if (AnythinkBTNativeEC.this.f13006H != null) {
                        AnythinkBTNativeEC.this.f13006H.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f13005G;
        if (runnable != null) {
            postDelayed(runnable, this.f13004F * 1000);
        }
        if (!this.f13097h && this.f13010L != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f13093d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.f13008J);
                jSONObject.put("data", jSONObject2);
                new StringBuilder("NativeEC Call H5 onCloseBtnClicked ").append(jSONObject.toString());
            } catch (JSONException e) {
                e.getMessage();
            }
            C1469j.m5701a();
            C1469j.m5703a(this.f13010L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.f13010L != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f13093d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.f13008J);
                jSONObject3.put("data", jSONObject4);
                new StringBuilder("NativeEC Call H5 onEndCardShow ").append(jSONObject3.toString());
            } catch (JSONException e2) {
                e2.getMessage();
            }
            C1469j.m5701a();
            C1469j.m5703a(this.f13010L, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f13005G;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        ViewGroup viewGroup;
        super.onSelfConfigurationChanged(configuration);
        int i = configuration.orientation;
        this.f13096g = i;
        if (i == 2) {
            removeView(this.f13011r);
            viewGroup = this.f13012s;
        } else {
            removeView(this.f13012s);
            viewGroup = this.f13011r;
        }
        m11001a(viewGroup);
    }

    public void preLoadData() {
        Bitmap bitmapBlurBitmap;
        try {
            if (this.f13091b == null || !this.f13097h) {
                return;
            }
            C2340d c2340d = this.f13094e;
            if (c2340d != null) {
                this.f13004F = c2340d.m12098p();
            }
            C1818b.m9427a(this.f13090a.getApplicationContext()).m9443a(this.f13091b.m10151be(), new C2179e(this.f13015v, this.f13091b, this.f13008J));
            C1818b.m9427a(this.f13090a.getApplicationContext()).m9443a(this.f13091b.m10150bd(), new C2184j(this.f13016w, C1886t.m9834b(C1773a.m8548c().m8557e(), 8.0f)));
            this.f13019z.setText(this.f13091b.m10148bb());
            this.f12999A.setText(this.f13091b.m10149bc());
            this.f13000B.setText(this.f13091b.m10145aY() + ")");
            this.f13001C.removeAllViews();
            double dM10144aX = this.f13091b.m10144aX();
            if (dM10144aX <= 0.0d) {
                dM10144aX = 5.0d;
            }
            this.f13001C.initScore(dM10144aX);
            if (Build.VERSION.SDK_INT < 17) {
                this.f13014u.setVisibility(8);
                return;
            }
            try {
                Bitmap bitmapM10999a = m10999a(this.f13015v.getDrawable());
                if (bitmapM10999a != null && (bitmapBlurBitmap = blurBitmap(bitmapM10999a)) != null) {
                    this.f13014u.setImageBitmap(bitmapBlurBitmap);
                }
            } catch (Throwable unused) {
                this.f13014u.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f13091b.m8801I()) && this.f13091b.m8801I().contains("alecfc=1")) {
                this.f13002D = true;
            }
            C1818b.m9427a(this.f13090a.getApplicationContext()).m9443a(TextUtils.isEmpty(this.f13091b.m8830aE()) ? C1404a.f6211ab : this.f13091b.m8830aE(), new InterfaceC1819c() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.2
                @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                /* JADX INFO: renamed from: a */
                public final void mo5462a(Bitmap bitmap, String str) {
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        int iM9834b = C1886t.m9834b(AnythinkBTNativeEC.this.f13090a, 12.0f);
                        AnythinkBTNativeEC.this.f13017x.getLayoutParams().height = iM9834b;
                        AnythinkBTNativeEC.this.f13017x.getLayoutParams().width = (int) (iM9834b * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                        AnythinkBTNativeEC.this.f13017x.setImageBitmap(bitmap);
                        AnythinkBTNativeEC.this.f13017x.setBackgroundColor(1426063360);
                    } catch (Throwable unused2) {
                    }
                }

                @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                /* JADX INFO: renamed from: a */
                public final void mo5463a(String str, String str2) {
                }
            });
            C1773a.m8548c().m8558f();
            C1486b.m6002a();
            C1483a c1483aM6007b = C1486b.m6007b();
            if (c1483aM6007b != null) {
                final String strM5936J = c1483aM6007b.m5936J();
                if (TextUtils.isEmpty(strM5936J)) {
                    this.f13018y.setVisibility(8);
                }
                this.f13018y.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1350n.m4203a(AnythinkBTNativeEC.this.f13090a, strM5936J);
                    }
                });
            } else {
                this.f13018y.setVisibility(8);
            }
            if (this.f13003E) {
                return;
            }
            this.f13006H.setVisibility(8);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setCreateWebView(WebView webView) {
        this.f13010L = webView;
    }

    public void setJSCommon(C2202j c2202j) {
        this.f13009K = c2202j;
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void setUnitId(String str) {
        this.f13008J = str;
    }
}
