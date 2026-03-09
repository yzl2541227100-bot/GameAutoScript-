package com.anythink.core.basead.p045ui.web;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.C1115a;
import com.anythink.core.basead.p043a.C1116a;
import com.anythink.core.basead.p044b.C1121c;
import com.anythink.core.basead.p045ui.p046a.C1123a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1236bb;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class WebLandPageActivity extends Activity implements InterfaceC1134b {

    /* JADX INFO: renamed from: e */
    private static final int f2773e = 343452;

    /* JADX INFO: renamed from: A */
    private IOfferClickHandler f2774A;

    /* JADX INFO: renamed from: B */
    private C1135c f2775B;

    /* JADX INFO: renamed from: C */
    private int f2776C;

    /* JADX INFO: renamed from: b */
    public JSONArray f2780b;

    /* JADX INFO: renamed from: j */
    private WebProgressBarView f2787j;

    /* JADX INFO: renamed from: k */
    private WebView f2788k;

    /* JADX INFO: renamed from: l */
    private ImageView f2789l;

    /* JADX INFO: renamed from: m */
    private ImageView f2790m;

    /* JADX INFO: renamed from: n */
    private TextView f2791n;

    /* JADX INFO: renamed from: o */
    private ValueAnimator f2792o;

    /* JADX INFO: renamed from: p */
    private Random f2793p;

    /* JADX INFO: renamed from: q */
    private int f2794q;

    /* JADX INFO: renamed from: r */
    private long f2795r;

    /* JADX INFO: renamed from: s */
    private Map<String, JSONArray> f2796s;

    /* JADX INFO: renamed from: v */
    private WebLoadFailRefrshView f2799v;

    /* JADX INFO: renamed from: w */
    private RelativeLayout f2800w;

    /* JADX INFO: renamed from: x */
    private AbstractC1247l f2801x;

    /* JADX INFO: renamed from: y */
    private C1248m f2802y;

    /* JADX INFO: renamed from: z */
    private String f2803z;

    /* JADX INFO: renamed from: f */
    private final int f2783f = 1;

    /* JADX INFO: renamed from: g */
    private final int f2784g = 2;

    /* JADX INFO: renamed from: h */
    private final int f2785h = 3;

    /* JADX INFO: renamed from: i */
    private final int f2786i = 0;

    /* JADX INFO: renamed from: a */
    public int f2779a = 8;

    /* JADX INFO: renamed from: t */
    private String f2797t = "";

    /* JADX INFO: renamed from: u */
    private int f2798u = 0;

    /* JADX INFO: renamed from: D */
    private ValueCallback<Uri[]> f2777D = null;

    /* JADX INFO: renamed from: E */
    private final int f2778E = 512;

    /* JADX INFO: renamed from: c */
    public int f2781c = 0;

    /* JADX INFO: renamed from: d */
    public int f2782d = 0;

    /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$1 */
    public class ViewOnClickListenerC11241 implements View.OnClickListener {
        public ViewOnClickListenerC11241() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1360x.m4265a(WebLandPageActivity.this.f2799v);
            if (WebLandPageActivity.this.f2788k != null) {
                WebLandPageActivity.this.f2788k.reload();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$2 */
    public class C11252 implements DownloadListener {
        public C11252() {
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            if (WebLandPageActivity.this.f2801x == null || WebLandPageActivity.this.f2802y == null || TextUtils.isEmpty(WebLandPageActivity.this.f2801x.m3167F())) {
                WebLandPageActivity.this.f2779a = 11;
                C1350n.m4204a(str);
            } else if (WebLandPageActivity.this.f2774A != null && (WebLandPageActivity.this.f2774A instanceof IOfferClickHandler) && WebLandPageActivity.this.f2774A.startDownloadApp(WebLandPageActivity.this.getApplicationContext(), WebLandPageActivity.this.f2801x, WebLandPageActivity.this.f2802y, str)) {
                WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                webLandPageActivity.f2779a = 6;
                webLandPageActivity.f2782d = 1;
            } else {
                WebLandPageActivity.this.f2782d = 2;
                C1350n.m4204a(str);
                WebLandPageActivity.this.f2779a = 7;
            }
            WebLandPageActivity.m1790f(WebLandPageActivity.this);
            WebLandPageActivity.this.m1789e();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$3 */
    public class ViewOnClickListenerC11263 implements View.OnClickListener {
        public ViewOnClickListenerC11263() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLandPageActivity.this.f2788k == null || !WebLandPageActivity.this.f2788k.canGoBack()) {
                WebLandPageActivity.this.finish();
            } else {
                WebLandPageActivity.this.f2788k.goBack();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$4 */
    public class ViewOnClickListenerC11274 implements View.OnClickListener {
        public ViewOnClickListenerC11274() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebLandPageActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$5 */
    public class C11285 extends WebChromeClient {

        /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$5$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebLandPageActivity.this.f2787j.setVisibility(8);
            }
        }

        public C11285() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            C1123a.m1766a(WebLandPageActivity.this, str, callback);
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (WebLandPageActivity.this.f2787j != null) {
                if (!WebLandPageActivity.this.f2792o.isRunning()) {
                    WebLandPageActivity.this.f2787j.setProgress(((i * 30) / 100) + 70);
                }
                if (i == 100) {
                    if (WebLandPageActivity.this.f2792o.isRunning()) {
                        WebLandPageActivity.this.f2792o.cancel();
                        WebLandPageActivity.this.f2787j.setProgress(100);
                    }
                    C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.5.1
                        public AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            WebLandPageActivity.this.f2787j.setVisibility(8);
                        }
                    }, 200L);
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (TextUtils.isEmpty(str) || WebLandPageActivity.this.f2791n == null || WebLandPageActivity.this.f2791n.getText().toString().length() != 0) {
                return;
            }
            WebLandPageActivity.this.f2791n.setText(str);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            try {
                WebLandPageActivity.this.f2777D = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                WebLandPageActivity.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 512);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$6 */
    public class DialogInterfaceOnClickListenerC11296 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC11296() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            String str = WebLandPageActivity.this.f2802y.f4321b;
            String str2 = WebLandPageActivity.this.f2802y.f4323d;
            int iMo2426d = WebLandPageActivity.this.f2801x.mo2426d();
            String strM3229t = WebLandPageActivity.this.f2801x.m3229t();
            WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
            C1322e.m3906a(str, str2, iMo2426d, strM3229t, webLandPageActivity.f2780b, webLandPageActivity.f2797t, 1);
            WebLandPageActivity.this.m1789e();
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$7 */
    public class DialogInterfaceOnClickListenerC11307 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC11307() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            String str = WebLandPageActivity.this.f2802y.f4321b;
            String str2 = WebLandPageActivity.this.f2802y.f4323d;
            int iMo2426d = WebLandPageActivity.this.f2801x.mo2426d();
            String strM3229t = WebLandPageActivity.this.f2801x.m3229t();
            WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
            C1322e.m3906a(str, str2, iMo2426d, strM3229t, webLandPageActivity.f2780b, webLandPageActivity.f2797t, 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$8 */
    public class C11318 implements ValueAnimator.AnimatorUpdateListener {
        public C11318() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (WebLandPageActivity.this.f2787j == null || iIntValue % WebLandPageActivity.this.f2794q != 0) {
                return;
            }
            WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
            webLandPageActivity.f2794q = webLandPageActivity.f2793p.nextInt(12) + 3;
            WebLandPageActivity.this.f2787j.setProgress(iIntValue);
        }
    }

    /* JADX INFO: renamed from: a */
    private ImageView m1776a(Drawable drawable) {
        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C1345i.m4153a(this, 48.0f), C1345i.m4153a(this, 48.0f));
        layoutParams.gravity = 16;
        layoutParams.rightMargin = C1345i.m4153a(this, 6.0f);
        imageView.setLayoutParams(layoutParams);
        int iM4153a = C1345i.m4153a(this, 16.0f);
        imageView.setPadding(iM4153a, iM4153a, iM4153a, iM4153a);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    /* JADX INFO: renamed from: a */
    private void m1778a() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(C1115a.a.f2710c);
                if (serializableExtra != null && (serializableExtra instanceof AbstractC1247l)) {
                    AbstractC1247l abstractC1247l = (AbstractC1247l) serializableExtra;
                    this.f2801x = abstractC1247l;
                    this.f2775B = new C1135c(abstractC1247l);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(C1115a.a.f2712e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof C1248m)) {
                    this.f2802y = (C1248m) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(C1115a.a.f2719l);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.f2774A = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.f2803z = intent.getStringExtra(C1115a.a.f2717j);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                this.f2776C = intent.getIntExtra(C1115a.a.f2724q, -1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1779a(Context context, C1121c c1121c) {
        Intent intent = new Intent();
        intent.setClass(context, WebLandPageActivity.class);
        intent.putExtra(C1115a.a.f2710c, c1121c.f2751c);
        intent.putExtra(C1115a.a.f2712e, c1121c.f2756h);
        intent.putExtra(C1115a.a.f2717j, c1121c.f2754f);
        intent.putExtra(C1115a.a.f2724q, c1121c.f2757i);
        IOfferClickHandler iOfferClickHandler = c1121c.f2755g;
        if (iOfferClickHandler != null) {
            intent.putExtra(C1115a.a.f2719l, iOfferClickHandler);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    public static void m1780a(Context context, String str) {
        C1121c c1121c = new C1121c();
        c1121c.f2754f = str;
        m1779a(context, c1121c);
    }

    /* JADX INFO: renamed from: a */
    private void m1781a(String str) {
        C1123a.m1768a(this.f2788k, this, this);
        this.f2788k.setDownloadListener(new C11252());
        C1236bb c1236bbM1728a = C1116a.m1728a(str);
        this.f2779a = c1236bbM1728a.f4088l;
        this.f2788k.loadUrl(c1236bbM1728a.f4091o);
        recordRedirectUrl(this.f2788k.getUrl());
    }

    /* JADX INFO: renamed from: b */
    private static void m1783b() {
    }

    /* JADX INFO: renamed from: c */
    private static void m1785c() {
    }

    /* JADX INFO: renamed from: d */
    private void m1787d() {
        this.f2789l.setOnClickListener(new ViewOnClickListenerC11263());
        this.f2790m.setOnClickListener(new ViewOnClickListenerC11274());
    }

    /* JADX INFO: renamed from: e */
    public void m1789e() {
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        super.finish();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m1790f(WebLandPageActivity webLandPageActivity) {
        webLandPageActivity.f2798u = 2;
        return 2;
    }

    /* JADX INFO: renamed from: f */
    private RelativeLayout m1791f() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(f2773e);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1345i.m4153a(this, 55.0f));
        layoutParams.addRule(10);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        int iM4153a = C1345i.m4153a(this, 16.0f);
        linearLayout.setPadding(iM4153a, 0, iM4153a, 0);
        relativeLayout.addView(linearLayout);
        this.f2789l = m1776a(getResources().getDrawable(C1345i.m4154a(this, "browser_left_icon", C1875i.f11528c)));
        this.f2790m = m1776a(getResources().getDrawable(C1345i.m4154a(this, "browser_close_icon", C1875i.f11528c)));
        linearLayout.addView(this.f2789l);
        linearLayout.addView(this.f2790m);
        TextView textView = new TextView(this);
        new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(C1345i.m4153a(this, 20.0f), 0, 0, C1345i.m4153a(this, 2.0f));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Color.parseColor("#666666"));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.f2791n = textView;
        linearLayout.addView(textView);
        try {
            this.f2788k = new BaseWebView(this);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(3, f2773e);
            this.f2788k.setLayoutParams(layoutParams2);
            relativeLayout.addView(this.f2788k);
            View view = new View(this);
            view.setBackgroundColor(-2434342);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, C1345i.m4153a(this, 1.0f));
            layoutParams3.addRule(3, f2773e);
            view.setLayoutParams(layoutParams3);
            relativeLayout.addView(view);
            WebProgressBarView webProgressBarView = new WebProgressBarView(this);
            this.f2787j = webProgressBarView;
            webProgressBarView.setProgress(0);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, C1345i.m4153a(this, 4.0f));
            layoutParams4.addRule(3, f2773e);
            relativeLayout.addView(this.f2787j, layoutParams4);
            Random random = new Random();
            this.f2793p = random;
            this.f2794q = random.nextInt(12) + 3;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 70);
            this.f2792o = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(1000L);
            this.f2792o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.8
                public C11318() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (WebLandPageActivity.this.f2787j == null || iIntValue % WebLandPageActivity.this.f2794q != 0) {
                        return;
                    }
                    WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                    webLandPageActivity.f2794q = webLandPageActivity.f2793p.nextInt(12) + 3;
                    WebLandPageActivity.this.f2787j.setProgress(iIntValue);
                }
            });
            this.f2792o.start();
            return relativeLayout;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private TextView m1792g() {
        TextView textView = new TextView(this);
        new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(C1345i.m4153a(this, 20.0f), 0, 0, C1345i.m4153a(this, 2.0f));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Color.parseColor("#666666"));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void callbackClickResult(C1236bb c1236bb) {
        this.f2779a = c1236bb.f4088l;
        if (c1236bb.f4090n) {
            if (!c1236bb.f4089m) {
                this.f2781c = 2;
                return;
            }
            this.f2781c = 1;
            this.f2798u = 2;
            m1789e();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        AbstractC1249n abstractC1249n;
        C1248m c1248m = this.f2802y;
        if (c1248m != null && (abstractC1249n = c1248m.f4333n) != null && abstractC1249n.m3339f() == 1) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(this, C1345i.m4154a(this, "system_dialog", C1875i.f11530e));
                builder.setMessage(getString(C1345i.m4154a(this, "web_land_page_dialog_title", C1875i.f11532g))).setCancelable(true).setPositiveButton(getString(C1345i.m4154a(this, "web_land_page_dialog_stay", C1875i.f11532g)), new DialogInterface.OnClickListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.7
                    public DialogInterfaceOnClickListenerC11307() {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        String str = WebLandPageActivity.this.f2802y.f4321b;
                        String str2 = WebLandPageActivity.this.f2802y.f4323d;
                        int iMo2426d = WebLandPageActivity.this.f2801x.mo2426d();
                        String strM3229t = WebLandPageActivity.this.f2801x.m3229t();
                        WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                        C1322e.m3906a(str, str2, iMo2426d, strM3229t, webLandPageActivity.f2780b, webLandPageActivity.f2797t, 0);
                    }
                }).setNegativeButton(getString(C1345i.m4154a(this, "web_land_page_dialog_yes", C1875i.f11532g)), new DialogInterface.OnClickListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.6
                    public DialogInterfaceOnClickListenerC11296() {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        String str = WebLandPageActivity.this.f2802y.f4321b;
                        String str2 = WebLandPageActivity.this.f2802y.f4323d;
                        int iMo2426d = WebLandPageActivity.this.f2801x.mo2426d();
                        String strM3229t = WebLandPageActivity.this.f2801x.m3229t();
                        WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                        C1322e.m3906a(str, str2, iMo2426d, strM3229t, webLandPageActivity.f2780b, webLandPageActivity.f2797t, 1);
                        WebLandPageActivity.this.m1789e();
                    }
                });
                builder.create().show();
                return;
            } catch (Throwable unused) {
            }
        }
        m1789e();
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public WebProgressBarView getWebProgressBarView() {
        return this.f2787j;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        ClipData clipData;
        if (i == 512) {
            try {
                if (this.f2777D == null) {
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
                this.f2777D.onReceiveValue(uriArr);
                this.f2777D = null;
            } catch (Throwable unused3) {
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.f2788k;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.f2788k.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2795r = SystemClock.elapsedRealtime();
        this.f2796s = new LinkedHashMap();
        setResult(-1);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(C1115a.a.f2710c);
                if (serializableExtra != null && (serializableExtra instanceof AbstractC1247l)) {
                    AbstractC1247l abstractC1247l = (AbstractC1247l) serializableExtra;
                    this.f2801x = abstractC1247l;
                    this.f2775B = new C1135c(abstractC1247l);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(C1115a.a.f2712e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof C1248m)) {
                    this.f2802y = (C1248m) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(C1115a.a.f2719l);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.f2774A = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.f2803z = intent.getStringExtra(C1115a.a.f2717j);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                this.f2776C = intent.getIntExtra(C1115a.a.f2724q, -1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        }
        String strM3165E = this.f2803z;
        if (TextUtils.isEmpty(strM3165E)) {
            AbstractC1247l abstractC1247l2 = this.f2801x;
            strM3165E = abstractC1247l2 != null ? abstractC1247l2.m3165E() : "";
        }
        Context applicationContext = getApplicationContext();
        if (TextUtils.isEmpty(strM3165E)) {
            Toast.makeText(applicationContext, C1345i.m4154a(applicationContext, "basead_click_empty", C1875i.f11532g), 0).show();
            this.f2798u = 3;
            m1789e();
            return;
        }
        C1236bb c1236bbM1727a = C1116a.m1727a(applicationContext, strM3165E);
        boolean z = c1236bbM1727a.f4089m;
        callbackClickResult(c1236bbM1727a);
        if (z) {
            return;
        }
        RelativeLayout relativeLayoutM1791f = m1791f();
        this.f2800w = relativeLayoutM1791f;
        if (relativeLayoutM1791f == null) {
            C1350n.m4204a(strM3165E);
            m1789e();
            return;
        }
        setContentView(relativeLayoutM1791f);
        this.f2789l.setOnClickListener(new ViewOnClickListenerC11263());
        this.f2790m.setOnClickListener(new ViewOnClickListenerC11274());
        C1123a.m1765a(this);
        C1123a.m1768a(this.f2788k, this, this);
        this.f2788k.setDownloadListener(new C11252());
        C1236bb c1236bbM1728a = C1116a.m1728a(strM3165E);
        this.f2779a = c1236bbM1728a.f4088l;
        this.f2788k.loadUrl(c1236bbM1728a.f4091o);
        recordRedirectUrl(this.f2788k.getUrl());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C1248m c1248m;
        super.onDestroy();
        ValueAnimator valueAnimator = this.f2792o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2792o = null;
        }
        WebView webView = this.f2788k;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.f2788k.destroy();
        }
        this.f2788k = null;
        AbstractC1247l abstractC1247l = this.f2801x;
        if (abstractC1247l == null || (c1248m = this.f2802y) == null) {
            return;
        }
        String str = c1248m.f4321b;
        String str2 = c1248m.f4323d;
        int iMo2426d = abstractC1247l.mo2426d();
        String strM3229t = this.f2801x.m3229t();
        Map<String, JSONArray> map = this.f2796s;
        int i = this.f2781c;
        int i2 = this.f2782d;
        int i3 = this.f2779a;
        String str3 = this.f2803z;
        int i4 = this.f2802y.f4329j;
        int i5 = this.f2776C;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f2795r;
        String str4 = this.f2797t;
        int i6 = this.f2798u;
        C1322e.m3905a(str, str2, iMo2426d, strM3229t, map, i, i2, i3, str3, i4, i5, jElapsedRealtime, str4, i6 == 0 ? 1 : i6);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        WebView webView = this.f2788k;
        if (webView != null) {
            webView.setWebChromeClient(null);
            C1123a.m1769a(this.f2788k, isFinishing());
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        WebView webView = this.f2788k;
        if (webView != null) {
            webView.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.5

                /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$5$1 */
                public class AnonymousClass1 implements Runnable {
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        WebLandPageActivity.this.f2787j.setVisibility(8);
                    }
                }

                public C11285() {
                }

                @Override // android.webkit.WebChromeClient
                public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    C1123a.m1766a(WebLandPageActivity.this, str, callback);
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }

                @Override // android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView2, int i) {
                    if (WebLandPageActivity.this.f2787j != null) {
                        if (!WebLandPageActivity.this.f2792o.isRunning()) {
                            WebLandPageActivity.this.f2787j.setProgress(((i * 30) / 100) + 70);
                        }
                        if (i == 100) {
                            if (WebLandPageActivity.this.f2792o.isRunning()) {
                                WebLandPageActivity.this.f2792o.cancel();
                                WebLandPageActivity.this.f2787j.setProgress(100);
                            }
                            C1175n.m2059a().m2118a(new Runnable() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.5.1
                                public AnonymousClass1() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    WebLandPageActivity.this.f2787j.setVisibility(8);
                                }
                            }, 200L);
                        }
                    }
                }

                @Override // android.webkit.WebChromeClient
                public final void onReceivedTitle(WebView webView2, String str) {
                    super.onReceivedTitle(webView2, str);
                    if (TextUtils.isEmpty(str) || WebLandPageActivity.this.f2791n == null || WebLandPageActivity.this.f2791n.getText().toString().length() != 0) {
                        return;
                    }
                    WebLandPageActivity.this.f2791n.setText(str);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView2, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    try {
                        WebLandPageActivity.this.f2777D = valueCallback;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent.setType("*/*");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        WebLandPageActivity.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 512);
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
            });
            this.f2788k.onResume();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void onWebFinish() {
        m1789e();
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void onWebPageFinish(WebView webView, String str) {
        WebView webView2;
        WebLoadFailRefrshView webLoadFailRefrshView = this.f2799v;
        if (webLoadFailRefrshView != null && webLoadFailRefrshView.getParent() == null && (webView2 = this.f2788k) != null) {
            webView2.setVisibility(0);
        }
        webView.canGoBack();
        webView.canGoForward();
        if (!TextUtils.isEmpty(str) && this.f2798u != 3 && TextUtils.equals(this.f2797t, str) && !isFinishing()) {
            this.f2798u = 2;
            JSONArray jSONArray = this.f2796s.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(1, sb.toString());
                    this.f2796s.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        C1135c c1135c = this.f2775B;
        if (c1135c != null) {
            c1135c.m1804a(webView, str);
        }
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void onWebPageLoadError(WebView webView, String str) {
        if (TextUtils.equals(this.f2797t, str)) {
            this.f2798u = 3;
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.f2799v;
        if (webLoadFailRefrshView != null) {
            C1360x.m4265a(webLoadFailRefrshView);
        } else {
            WebLoadFailRefrshView webLoadFailRefrshView2 = new WebLoadFailRefrshView(this);
            this.f2799v = webLoadFailRefrshView2;
            WebView webView2 = this.f2788k;
            if (webView2 != null) {
                webLoadFailRefrshView2.setLayoutParams(webView2.getLayoutParams());
            }
            this.f2799v.setOnRefreshListener(new View.OnClickListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.1
                public ViewOnClickListenerC11241() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1360x.m4265a(WebLandPageActivity.this.f2799v);
                    if (WebLandPageActivity.this.f2788k != null) {
                        WebLandPageActivity.this.f2788k.reload();
                    }
                }
            });
        }
        WebView webView3 = this.f2788k;
        if (webView3 != null) {
            webView3.setVisibility(8);
        }
        this.f2800w.addView(this.f2799v);
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void onWebPageStart(WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(this.f2797t, str)) {
                this.f2798u = 1;
            }
            JSONArray jSONArray = this.f2796s.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(0, sb.toString());
                    jSONArray.put(1, "");
                    this.f2796s.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.f2799v;
        if (webLoadFailRefrshView != null) {
            C1360x.m4265a(webLoadFailRefrshView);
        }
    }

    @Override // com.anythink.core.basead.p045ui.web.InterfaceC1134b
    public void recordRedirectUrl(String str) {
        if (this.f2780b == null) {
            this.f2780b = new JSONArray();
        }
        this.f2780b.put(str);
        if (this.f2796s.size() > 0) {
            JSONArray jSONArray = this.f2796s.get(this.f2797t);
            try {
                if (this.f2798u == 0 && jSONArray != null) {
                    if (TextUtils.isEmpty(jSONArray.getString(1))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        jSONArray.put(1, sb.toString());
                    }
                    this.f2796s.put(this.f2797t, jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        jSONArray2.put(sb2.toString());
        jSONArray2.put("");
        this.f2796s.put(str, jSONArray2);
        this.f2797t = str;
        this.f2798u = 0;
    }
}
