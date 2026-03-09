package com.anythink.basead.p025ui.animplayerview;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.TranslateAnimation;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.p043a.C1116a;
import com.anythink.core.basead.p045ui.p046a.C1123a;
import com.anythink.core.basead.p045ui.web.BaseWebView;
import com.anythink.core.basead.p045ui.web.C1135c;
import com.anythink.core.basead.p045ui.web.InterfaceC1134b;
import com.anythink.core.basead.p045ui.web.WebProgressBarView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1236bb;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class WebLandpagePlayerView extends BaseAnimPlayerView implements InterfaceC1134b {

    /* JADX INFO: renamed from: A */
    public int f1838A;

    /* JADX INFO: renamed from: B */
    public IOfferClickHandler f1839B;

    /* JADX INFO: renamed from: C */
    public int f1840C;

    /* JADX INFO: renamed from: D */
    public String f1841D;

    /* JADX INFO: renamed from: E */
    public boolean f1842E;

    /* JADX INFO: renamed from: F */
    private final int f1843F;

    /* JADX INFO: renamed from: G */
    private final int f1844G;

    /* JADX INFO: renamed from: H */
    private final int f1845H;

    /* JADX INFO: renamed from: I */
    private final int f1846I;

    /* JADX INFO: renamed from: J */
    private TranslateAnimation f1847J;

    /* JADX INFO: renamed from: K */
    private TranslateAnimation f1848K;

    /* JADX INFO: renamed from: L */
    private TranslateAnimation f1849L;

    /* JADX INFO: renamed from: M */
    private WebView f1850M;

    /* JADX INFO: renamed from: N */
    private C1135c f1851N;

    /* JADX INFO: renamed from: O */
    private ValueCallback<Uri[]> f1852O;

    /* JADX INFO: renamed from: P */
    private final int f1853P;

    /* JADX INFO: renamed from: Q */
    private String f1854Q;

    /* JADX INFO: renamed from: R */
    private int f1855R;

    /* JADX INFO: renamed from: S */
    private Map<String, JSONArray> f1856S;

    /* JADX INFO: renamed from: y */
    public LinearLayout f1857y;

    /* JADX INFO: renamed from: z */
    public int f1858z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView$1 */
    public class RunnableC09681 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f1859a;

        public RunnableC09681(Context context) {
            this.f1859a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebLandpagePlayerView.m1108a(WebLandpagePlayerView.this, this.f1859a);
            WebLandpagePlayerView.m1107a(WebLandpagePlayerView.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView$2 */
    public class AnimationAnimationListenerC09692 implements Animation.AnimationListener {
        public AnimationAnimationListenerC09692() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            if (WebLandpagePlayerView.this.f1850M != null) {
                WebLandpagePlayerView.this.f1850M.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView$3 */
    public class C09703 implements DownloadListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f1862a;

        public C09703(Context context) {
            this.f1862a = context;
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            WebLandpagePlayerView webLandpagePlayerView = WebLandpagePlayerView.this;
            AbstractC1247l abstractC1247l = webLandpagePlayerView.f1826w;
            if (abstractC1247l == null || webLandpagePlayerView.f1827x == null || TextUtils.isEmpty(abstractC1247l.m3167F())) {
                WebLandpagePlayerView.this.f1858z = 11;
                C1350n.m4204a(str);
            } else {
                WebLandpagePlayerView webLandpagePlayerView2 = WebLandpagePlayerView.this;
                IOfferClickHandler iOfferClickHandler = webLandpagePlayerView2.f1839B;
                if (iOfferClickHandler != null && (iOfferClickHandler instanceof IOfferClickHandler) && iOfferClickHandler.startDownloadApp(this.f1862a, webLandpagePlayerView2.f1826w, webLandpagePlayerView2.f1827x, str)) {
                    WebLandpagePlayerView webLandpagePlayerView3 = WebLandpagePlayerView.this;
                    webLandpagePlayerView3.f1858z = 6;
                    webLandpagePlayerView3.f1838A = 1;
                } else {
                    WebLandpagePlayerView.this.f1838A = 2;
                    C1350n.m4204a(str);
                    WebLandpagePlayerView.this.f1858z = 7;
                }
            }
            WebLandpagePlayerView.m1111c(WebLandpagePlayerView.this);
        }
    }

    public WebLandpagePlayerView(Context context) {
        super(context, null);
        this.f1843F = 1;
        this.f1844G = 2;
        this.f1845H = 3;
        this.f1846I = 0;
        this.f1858z = 8;
        this.f1838A = 0;
        this.f1852O = null;
        this.f1853P = 512;
        this.f1840C = 0;
        this.f1842E = false;
        this.f1854Q = "";
        this.f1855R = 0;
    }

    public WebLandpagePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1843F = 1;
        this.f1844G = 2;
        this.f1845H = 3;
        this.f1846I = 0;
        this.f1858z = 8;
        this.f1838A = 0;
        this.f1852O = null;
        this.f1853P = 512;
        this.f1840C = 0;
        this.f1842E = false;
        this.f1854Q = "";
        this.f1855R = 0;
    }

    public WebLandpagePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1843F = 1;
        this.f1844G = 2;
        this.f1845H = 3;
        this.f1846I = 0;
        this.f1858z = 8;
        this.f1838A = 0;
        this.f1852O = null;
        this.f1853P = 512;
        this.f1840C = 0;
        this.f1842E = false;
        this.f1854Q = "";
        this.f1855R = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m1106a(Context context) {
        m1090a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels - C1345i.m4153a(context, 40.0f));
        this.f1856S = new LinkedHashMap();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f1857y = linearLayout;
        linearLayout.setGravity(1);
        this.f1857y.setOrientation(1);
        this.f1857y.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(C1345i.m4154a(getContext(), "myoffer_arrow_up", C1875i.f11528c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C1345i.m4153a(context, 9.0f), C1345i.m4153a(context, 9.0f));
        layoutParams.topMargin = C1345i.m4153a(context, 3.0f);
        this.f1857y.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(C1345i.m4154a(getContext(), "myoffer_slide_hint", C1875i.f11532g));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C1345i.m4153a(context, 1.0f);
        this.f1857y.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, C1345i.m4153a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.f1857y, layoutParams3);
        if (this.f1847J == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, C1345i.m4153a(context, 18.0f), 0.0f);
            this.f1847J = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f1847J.setRepeatMode(2);
            this.f1847J.setRepeatCount(-1);
            this.f1847J.setInterpolator(new AnticipateInterpolator());
            this.f1847J.setDuration(600L);
        }
        this.f1857y.startAnimation(this.f1847J);
        post(new RunnableC09681(context));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1107a(WebLandpagePlayerView webLandpagePlayerView) {
        if (webLandpagePlayerView.f1848K == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -webLandpagePlayerView.getMeasuredHeight());
            webLandpagePlayerView.f1848K = translateAnimation;
            translateAnimation.setFillAfter(true);
            webLandpagePlayerView.f1848K.setDuration(1200L);
        }
        if (webLandpagePlayerView.f1849L == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, webLandpagePlayerView.getMeasuredHeight(), 0.0f);
            webLandpagePlayerView.f1849L = translateAnimation2;
            translateAnimation2.setFillAfter(true);
            webLandpagePlayerView.f1849L.setDuration(1200L);
            webLandpagePlayerView.f1849L.setAnimationListener(webLandpagePlayerView.new AnimationAnimationListenerC09692());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1108a(WebLandpagePlayerView webLandpagePlayerView, Context context) {
        try {
            webLandpagePlayerView.f1850M = new BaseWebView(context);
            webLandpagePlayerView.f1851N = new C1135c(webLandpagePlayerView.f1826w);
            webLandpagePlayerView.f1850M.setBackgroundColor(-1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, webLandpagePlayerView.getMeasuredHeight());
            webLandpagePlayerView.f1850M.setVisibility(8);
            webLandpagePlayerView.addView(webLandpagePlayerView.f1850M, layoutParams);
            C1123a.m1765a(context);
            C1123a.m1768a(webLandpagePlayerView.f1850M, context, webLandpagePlayerView);
            webLandpagePlayerView.f1850M.setDownloadListener(webLandpagePlayerView.new C09703(context));
            webLandpagePlayerView.f1842E = true;
        } catch (Throwable unused) {
            webLandpagePlayerView.f1842E = false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1110b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f1857y = linearLayout;
        linearLayout.setGravity(1);
        this.f1857y.setOrientation(1);
        this.f1857y.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(C1345i.m4154a(getContext(), "myoffer_arrow_up", C1875i.f11528c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C1345i.m4153a(context, 9.0f), C1345i.m4153a(context, 9.0f));
        layoutParams.topMargin = C1345i.m4153a(context, 3.0f);
        this.f1857y.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(C1345i.m4154a(getContext(), "myoffer_slide_hint", C1875i.f11532g));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C1345i.m4153a(context, 1.0f);
        this.f1857y.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, C1345i.m4153a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.f1857y, layoutParams3);
        if (this.f1847J == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, C1345i.m4153a(context, 18.0f), 0.0f);
            this.f1847J = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f1847J.setRepeatMode(2);
            this.f1847J.setRepeatCount(-1);
            this.f1847J.setInterpolator(new AnticipateInterpolator());
            this.f1847J.setDuration(600L);
        }
        this.f1857y.startAnimation(this.f1847J);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m1111c(WebLandpagePlayerView webLandpagePlayerView) {
        webLandpagePlayerView.f1855R = 2;
        return 2;
    }

    /* JADX INFO: renamed from: c */
    private void m1112c(Context context) {
        try {
            this.f1850M = new BaseWebView(context);
            this.f1851N = new C1135c(this.f1826w);
            this.f1850M.setBackgroundColor(-1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getMeasuredHeight());
            this.f1850M.setVisibility(8);
            addView(this.f1850M, layoutParams);
            C1123a.m1765a(context);
            C1123a.m1768a(this.f1850M, context, this);
            this.f1850M.setDownloadListener(new C09703(context));
            this.f1842E = true;
        } catch (Throwable unused) {
            this.f1842E = false;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m1114d(Context context) {
        C1123a.m1768a(this.f1850M, context, this);
        this.f1850M.setDownloadListener(new C09703(context));
    }

    /* JADX INFO: renamed from: j */
    private void m1116j() {
        if (this.f1848K == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -getMeasuredHeight());
            this.f1848K = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f1848K.setDuration(1200L);
        }
        if (this.f1849L == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, getMeasuredHeight(), 0.0f);
            this.f1849L = translateAnimation2;
            translateAnimation2.setFillAfter(true);
            this.f1849L.setDuration(1200L);
            this.f1849L.setAnimationListener(new AnimationAnimationListenerC09692());
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: a */
    public final void mo1079a() {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: b */
    public final void mo1081b() {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: c */
    public final void mo1082c() {
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void callbackClickResult(C1236bb c1236bb) {
        this.f1858z = c1236bb.f4088l;
        if (c1236bb.f4090n) {
            if (!c1236bb.f4089m) {
                this.f1840C = 2;
            } else {
                this.f1840C = 1;
                this.f1855R = 2;
            }
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: d */
    public final void mo1083d() {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: g */
    public final void mo1093g() {
        C1248m c1248m;
        super.mo1093g();
        WebView webView = this.f1850M;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.f1850M.destroy();
        }
        this.f1850M = null;
        AbstractC1247l abstractC1247l = this.f1826w;
        if (abstractC1247l == null || (c1248m = this.f1827x) == null) {
            return;
        }
        String str = c1248m.f4321b;
        String str2 = c1248m.f4323d;
        int iMo2426d = abstractC1247l.mo2426d();
        String strM3229t = this.f1826w.m3229t();
        Map<String, JSONArray> map = this.f1856S;
        int i = this.f1840C;
        int i2 = this.f1838A;
        int i3 = this.f1858z;
        String str3 = this.f1841D;
        int i4 = this.f1827x.f4329j;
        String str4 = this.f1854Q;
        int i5 = this.f1855R;
        C1322e.m3905a(str, str2, iMo2426d, strM3229t, map, i, i2, i3, str3, i4, 1, 0L, str4, i5 == 0 ? 1 : i5);
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public WebProgressBarView getWebProgressBarView() {
        return null;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void init(AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, List<Bitmap> list) {
        super.init(abstractC1247l, c1248m, z, list);
        Context context = getContext();
        m1090a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels - C1345i.m4153a(context, 40.0f));
        this.f1856S = new LinkedHashMap();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f1857y = linearLayout;
        linearLayout.setGravity(1);
        this.f1857y.setOrientation(1);
        this.f1857y.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(C1345i.m4154a(getContext(), "myoffer_arrow_up", C1875i.f11528c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C1345i.m4153a(context, 9.0f), C1345i.m4153a(context, 9.0f));
        layoutParams.topMargin = C1345i.m4153a(context, 3.0f);
        this.f1857y.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(C1345i.m4154a(getContext(), "myoffer_slide_hint", C1875i.f11532g));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C1345i.m4153a(context, 1.0f);
        this.f1857y.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, C1345i.m4153a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.f1857y, layoutParams3);
        if (this.f1847J == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, C1345i.m4153a(context, 18.0f), 0.0f);
            this.f1847J = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f1847J.setRepeatMode(2);
            this.f1847J.setRepeatCount(-1);
            this.f1847J.setInterpolator(new AnticipateInterpolator());
            this.f1847J.setDuration(600L);
        }
        this.f1857y.startAnimation(this.f1847J);
        post(new RunnableC09681(context));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        ClipData clipData;
        if (i == 512) {
            try {
                if (this.f1852O == null) {
                    return;
                }
                if (i2 != -1 || intent == null) {
                    uriArr = null;
                } else {
                    String dataString = intent.getDataString();
                    try {
                        clipData = Build.VERSION.SDK_INT >= 16 ? intent.getClipData() : null;
                    } catch (Throwable unused) {
                    }
                    if (clipData != null) {
                        uriArr = new Uri[clipData.getItemCount()];
                        for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                            try {
                                uriArr[i3] = clipData.getItemAt(i3).getUri();
                            } catch (Throwable unused2) {
                            }
                        }
                    } else {
                        uriArr = null;
                    }
                    if (dataString != null) {
                        uriArr = new Uri[]{Uri.parse(dataString)};
                    }
                }
                this.f1852O.onReceiveValue(uriArr);
                this.f1852O = null;
            } catch (Throwable unused3) {
            }
        }
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void onWebFinish() {
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void onWebPageFinish(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.f1855R != 3) {
            this.f1855R = 2;
            JSONArray jSONArray = this.f1856S.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(1, sb.toString());
                    this.f1856S.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        C1135c c1135c = this.f1851N;
        if (c1135c != null) {
            c1135c.m1804a(webView, str);
        }
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void onWebPageLoadError(WebView webView, String str) {
        this.f1855R = 3;
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void onWebPageStart(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f1855R = 1;
        JSONArray jSONArray = this.f1856S.get(str);
        if (jSONArray != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                jSONArray.put(0, sb.toString());
                jSONArray.put(1, "");
                this.f1856S.put(str, jSONArray);
            } catch (JSONException unused) {
            }
        }
    }

    public synchronized boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler) {
        if (TextUtils.isEmpty(this.f1841D)) {
            this.f1841D = str;
            this.f1839B = iOfferClickHandler;
            post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (WebLandpagePlayerView.this.f1850M != null) {
                        C1236bb c1236bbM1728a = C1116a.m1728a(WebLandpagePlayerView.this.f1841D);
                        WebLandpagePlayerView webLandpagePlayerView = WebLandpagePlayerView.this;
                        webLandpagePlayerView.f1858z = c1236bbM1728a.f4088l;
                        webLandpagePlayerView.f1850M.loadUrl(c1236bbM1728a.f4091o);
                        WebLandpagePlayerView webLandpagePlayerView2 = WebLandpagePlayerView.this;
                        webLandpagePlayerView2.recordRedirectUrl(webLandpagePlayerView2.f1850M.getUrl());
                        if (WebLandpagePlayerView.this.f1857y.getAnimation() != null) {
                            WebLandpagePlayerView.this.f1857y.getAnimation().cancel();
                        }
                        WebLandpagePlayerView webLandpagePlayerView3 = WebLandpagePlayerView.this;
                        webLandpagePlayerView3.f1857y.startAnimation(webLandpagePlayerView3.f1848K);
                        WebLandpagePlayerView.this.f1850M.startAnimation(WebLandpagePlayerView.this.f1849L);
                    }
                }
            });
        }
        return this.f1842E;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void pause() {
        super.pause();
        if (this.f1850M != null) {
            CookieSyncManager.getInstance().stopSync();
            this.f1850M.setWebChromeClient(null);
            C1123a.m1769a(this.f1850M, getContext() instanceof Activity ? ((Activity) getContext()).isFinishing() : false);
        }
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void recordRedirectUrl(String str) {
        if (this.f1856S.size() > 0) {
            JSONArray jSONArray = this.f1856S.get(this.f1854Q);
            try {
                if (this.f1855R == 0 && jSONArray != null) {
                    if (TextUtils.isEmpty(jSONArray.getString(1))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        jSONArray.put(1, sb.toString());
                    }
                    this.f1856S.put(this.f1854Q, jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        jSONArray2.put(sb2.toString());
        jSONArray2.put("");
        this.f1856S.put(str, jSONArray2);
        this.f1854Q = str;
        this.f1855R = 0;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void start() {
        super.start();
        if (this.f1850M != null) {
            CookieSyncManager.getInstance().startSync();
            this.f1850M.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView.4
                @Override // android.webkit.WebChromeClient
                public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    C1123a.m1766a(WebLandpagePlayerView.this.getContext(), str, callback);
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    try {
                        WebLandpagePlayerView.this.f1852O = valueCallback;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent.setType("*/*");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        if (WebLandpagePlayerView.this.getContext() instanceof Activity) {
                            ((Activity) WebLandpagePlayerView.this.getContext()).startActivityForResult(Intent.createChooser(intent, "File Chooser"), 512);
                        }
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
            });
            this.f1850M.onResume();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void stop() {
        super.stop();
    }
}
