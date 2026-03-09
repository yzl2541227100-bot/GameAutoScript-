package com.anythink.expressad.mbbanner.p139a.p140a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1908a;
import com.anythink.expressad.p073a.p075b.C1410a;
import com.anythink.expressad.p086d.p088b.C1487a;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1901b extends Dialog {

    /* JADX INFO: renamed from: a */
    private final String f11711a;

    /* JADX INFO: renamed from: b */
    private String f11712b;

    /* JADX INFO: renamed from: c */
    private boolean f11713c;

    /* JADX INFO: renamed from: d */
    private FrameLayout f11714d;

    /* JADX INFO: renamed from: e */
    private WindVaneWebView f11715e;

    /* JADX INFO: renamed from: f */
    private TextView f11716f;

    /* JADX INFO: renamed from: g */
    private String f11717g;

    /* JADX INFO: renamed from: h */
    private List<C1781c> f11718h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1908a f11719i;

    /* JADX INFO: renamed from: j */
    private IMraidJSBridge f11720j;

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogC1901b.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.a.b$2, reason: invalid class name */
    public class AnonymousClass2 extends C1442b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            StringBuilder sb = new StringBuilder("javascript:");
            C1487a.m6018a();
            sb.append(C1487a.m6022b());
            int i = Build.VERSION.SDK_INT;
            String string = sb.toString();
            if (i <= 19) {
                webView.loadUrl(string);
            } else {
                webView.evaluateJavascript(string, new ValueCallback<String>() { // from class: com.anythink.expressad.mbbanner.a.a.b.2.1
                    /* JADX INFO: renamed from: a */
                    private static void m9909a() {
                    }

                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                    }
                });
            }
            DialogC1901b.m9901a(DialogC1901b.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.a.b$3, reason: invalid class name */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (DialogC1901b.this.f11719i != null) {
                DialogC1901b.this.f11719i.mo9955a(false);
            }
            DialogC1901b.this.f11715e.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            DialogC1901b.this.f11714d.removeView(DialogC1901b.this.f11715e);
            DialogC1901b.this.f11715e.release();
            DialogC1901b.this.f11715e = null;
            DialogC1901b.this.f11719i = null;
        }
    }

    public DialogC1901b(Context context, Bundle bundle, InterfaceC1908a interfaceC1908a) {
        super(context);
        this.f11711a = "BannerExpandDialog";
        this.f11720j = new IMraidJSBridge() { // from class: com.anythink.expressad.mbbanner.a.a.b.4
            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void close() {
                DialogC1901b.this.dismiss();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void expand(String str, boolean z) {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final C1781c getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void open(String str) {
                try {
                    if (DialogC1901b.this.f11715e != null && System.currentTimeMillis() - DialogC1901b.this.f11715e.lastTouchTime > C1410a.f6300c) {
                        C1781c c1781c = (C1781c) DialogC1901b.this.f11718h.get(0);
                        DialogC1901b.this.f11715e.getUrl();
                        int i = C1410a.f6298a;
                        if (C1410a.m5255a(c1781c)) {
                            return;
                        }
                    }
                    if (DialogC1901b.this.f11718h.size() > 1) {
                        C1175n.m2059a().m2148f().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (DialogC1901b.this.f11719i != null) {
                        DialogC1901b.this.f11719i.mo9956a(true, str);
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void unload() {
                close();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void useCustomClose(boolean z) {
                try {
                    DialogC1901b.this.f11716f.setVisibility(z ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        this.f11712b = bundle.getString(C1781c.f10246am);
        this.f11713c = bundle.getBoolean("shouldUseCustomClose");
        this.f11719i = interfaceC1908a;
    }

    /* JADX INFO: renamed from: a */
    private void m9900a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11714d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f11715e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f11714d.addView(this.f11715e);
        TextView textView = new TextView(getContext());
        this.f11716f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f11716f.setLayoutParams(layoutParams);
        this.f11716f.setVisibility(this.f11713c ? 4 : 0);
        this.f11716f.setOnClickListener(new AnonymousClass1());
        this.f11714d.addView(this.f11716f);
        setContentView(this.f11714d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                getWindow().getDecorView().setSystemUiVisibility(i >= 19 ? 4615 : 519);
            }
        }
        this.f11715e.setWebViewListener(new AnonymousClass2());
        this.f11715e.setObject(this.f11720j);
        this.f11715e.loadUrl(this.f11712b);
        setOnDismissListener(new AnonymousClass3());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9901a(DialogC1901b dialogC1901b) {
        try {
            int i = C1175n.m2059a().m2148f().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i == 2 ? "landscape" : i == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float fM9702e = C1877k.m9702e(C1175n.m2059a().m2148f());
            float fM9705f = C1877k.m9705f(C1175n.m2059a().m2148f());
            HashMap mapM9707g = C1877k.m9707g(C1175n.m2059a().m2148f());
            int iIntValue = ((Integer) mapM9707g.get("width")).intValue();
            int iIntValue2 = ((Integer) mapM9707g.get("height")).intValue();
            HashMap map = new HashMap();
            map.put(CallMraidJS.f6709a, "Interstitial");
            map.put("state", CallMraidJS.f6715g);
            map.put(CallMraidJS.f6711c, "true");
            map.put(CallMraidJS.f6712d, jSONObject);
            dialogC1901b.f11715e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(dialogC1901b.f11715e, r1[0], r1[1], r11.getWidth(), dialogC1901b.f11715e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(dialogC1901b.f11715e, r1[0], r1[1], r5.getWidth(), dialogC1901b.f11715e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(dialogC1901b.f11715e, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(dialogC1901b.f11715e, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(dialogC1901b.f11715e, map);
            CallMraidJS.getInstance().fireReadyEvent(dialogC1901b.f11715e);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m9903b() {
        try {
            int i = C1175n.m2059a().m2148f().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i == 2 ? "landscape" : i == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float fM9702e = C1877k.m9702e(C1175n.m2059a().m2148f());
            float fM9705f = C1877k.m9705f(C1175n.m2059a().m2148f());
            HashMap mapM9707g = C1877k.m9707g(C1175n.m2059a().m2148f());
            int iIntValue = ((Integer) mapM9707g.get("width")).intValue();
            int iIntValue2 = ((Integer) mapM9707g.get("height")).intValue();
            HashMap map = new HashMap();
            map.put(CallMraidJS.f6709a, "Interstitial");
            map.put("state", CallMraidJS.f6715g);
            map.put(CallMraidJS.f6711c, "true");
            map.put(CallMraidJS.f6712d, jSONObject);
            this.f11715e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(this.f11715e, r1[0], r1[1], r11.getWidth(), this.f11715e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(this.f11715e, r1[0], r1[1], r5.getWidth(), this.f11715e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(this.f11715e, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(this.f11715e, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(this.f11715e, map);
            CallMraidJS.getInstance().fireReadyEvent(this.f11715e);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9908a(String str, List<C1781c> list) {
        this.f11717g = str;
        this.f11718h = list;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11714d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f11715e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f11714d.addView(this.f11715e);
        TextView textView = new TextView(getContext());
        this.f11716f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f11716f.setLayoutParams(layoutParams);
        this.f11716f.setVisibility(this.f11713c ? 4 : 0);
        this.f11716f.setOnClickListener(new AnonymousClass1());
        this.f11714d.addView(this.f11716f);
        setContentView(this.f11714d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            int i = Build.VERSION.SDK_INT;
            if (i >= 16) {
                getWindow().getDecorView().setSystemUiVisibility(i >= 19 ? 4615 : 519);
            }
        }
        this.f11715e.setWebViewListener(new AnonymousClass2());
        this.f11715e.setObject(this.f11720j);
        this.f11715e.loadUrl(this.f11712b);
        setOnDismissListener(new AnonymousClass3());
    }
}
