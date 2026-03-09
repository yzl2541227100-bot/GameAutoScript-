package com.anythink.expressad.splash.p153js;

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
import com.anythink.expressad.p073a.p075b.C1410a;
import com.anythink.expressad.p086d.p088b.C1487a;
import com.anythink.expressad.splash.p152d.InterfaceC1988a;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SplashExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a */
    private final String f12667a;

    /* JADX INFO: renamed from: b */
    private String f12668b;

    /* JADX INFO: renamed from: c */
    private boolean f12669c;

    /* JADX INFO: renamed from: d */
    private FrameLayout f12670d;

    /* JADX INFO: renamed from: e */
    private WindVaneWebView f12671e;

    /* JADX INFO: renamed from: f */
    private TextView f12672f;

    /* JADX INFO: renamed from: g */
    private String f12673g;

    /* JADX INFO: renamed from: h */
    private List<C1781c> f12674h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1988a f12675i;

    /* JADX INFO: renamed from: j */
    private IMraidJSBridge f12676j;

    /* JADX INFO: renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$1 */
    public class ViewOnClickListenerC19921 implements View.OnClickListener {
        public ViewOnClickListenerC19921() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashExpandDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$2 */
    public class C19932 extends C1442b {

        /* JADX INFO: renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$2$1 */
        public class AnonymousClass1 implements ValueCallback<String> {
            public AnonymousClass1() {
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
            }
        }

        public C19932() {
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            StringBuilder sb = new StringBuilder("javascript:");
            C1487a.m6018a();
            sb.append(C1487a.m6022b());
            int i = Build.VERSION.SDK_INT;
            String string = sb.toString();
            if (i <= 19) {
                webView.loadUrl(string);
            } else {
                webView.evaluateJavascript(string, new ValueCallback<String>() { // from class: com.anythink.expressad.splash.js.SplashExpandDialog.2.1
                    public AnonymousClass1() {
                    }

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str2) {
                    }
                });
            }
            SplashExpandDialog.m10726a(SplashExpandDialog.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$3 */
    public class DialogInterfaceOnDismissListenerC19943 implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC19943() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (SplashExpandDialog.this.f12675i != null) {
                SplashExpandDialog.this.f12675i.mo10658a(false);
                SplashExpandDialog.this.f12675i.mo10662c();
            }
            SplashExpandDialog.this.f12671e.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            SplashExpandDialog.this.f12670d.removeView(SplashExpandDialog.this.f12671e);
            SplashExpandDialog.this.f12671e.release();
            SplashExpandDialog.this.f12671e = null;
            SplashExpandDialog.this.f12675i = null;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$4 */
    public class C19954 implements IMraidJSBridge {
        public C19954() {
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
        public void close() {
            SplashExpandDialog.this.dismiss();
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
        public void expand(String str, boolean z) {
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
        public C1781c getMraidCampaign() {
            return null;
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
        public void open(String str) {
            try {
                if (SplashExpandDialog.this.f12671e != null && System.currentTimeMillis() - SplashExpandDialog.this.f12671e.lastTouchTime > C1410a.f6300c) {
                    C1781c c1781c = (C1781c) SplashExpandDialog.this.f12674h.get(0);
                    SplashExpandDialog.this.f12671e.getUrl();
                    int i = C1410a.f6298a;
                    if (C1410a.m5255a(c1781c)) {
                        return;
                    }
                }
                if (SplashExpandDialog.this.f12674h.size() > 1) {
                    C1175n.m2059a().m2148f().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    str = null;
                }
                if (SplashExpandDialog.this.f12675i != null) {
                    SplashExpandDialog.this.f12675i.mo10661b(str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
        public void unload() {
            close();
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
        public void useCustomClose(boolean z) {
            try {
                SplashExpandDialog.this.f12672f.setVisibility(z ? 4 : 0);
            } catch (Throwable unused) {
            }
        }
    }

    public SplashExpandDialog(Context context, Bundle bundle, InterfaceC1988a interfaceC1988a) {
        super(context);
        this.f12667a = "SplashExpandDialog";
        this.f12676j = new IMraidJSBridge() { // from class: com.anythink.expressad.splash.js.SplashExpandDialog.4
            public C19954() {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void close() {
                SplashExpandDialog.this.dismiss();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void expand(String str, boolean z) {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public C1781c getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void open(String str) {
                try {
                    if (SplashExpandDialog.this.f12671e != null && System.currentTimeMillis() - SplashExpandDialog.this.f12671e.lastTouchTime > C1410a.f6300c) {
                        C1781c c1781c = (C1781c) SplashExpandDialog.this.f12674h.get(0);
                        SplashExpandDialog.this.f12671e.getUrl();
                        int i = C1410a.f6298a;
                        if (C1410a.m5255a(c1781c)) {
                            return;
                        }
                    }
                    if (SplashExpandDialog.this.f12674h.size() > 1) {
                        C1175n.m2059a().m2148f().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.f12675i != null) {
                        SplashExpandDialog.this.f12675i.mo10661b(str);
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void unload() {
                close();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void useCustomClose(boolean z) {
                try {
                    SplashExpandDialog.this.f12672f.setVisibility(z ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        if (bundle != null) {
            this.f12668b = bundle.getString(C1781c.f10246am);
            this.f12669c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f12675i = interfaceC1988a;
    }

    /* JADX INFO: renamed from: a */
    private void m10725a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12670d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f12671e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f12670d.addView(this.f12671e);
        TextView textView = new TextView(getContext());
        this.f12672f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f12672f.setLayoutParams(layoutParams);
        this.f12672f.setVisibility(this.f12669c ? 4 : 0);
        this.f12672f.setOnClickListener(new ViewOnClickListenerC19921());
        this.f12670d.addView(this.f12672f);
        setContentView(this.f12670d);
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
        this.f12671e.setWebViewListener(new C19932());
        this.f12671e.setObject(this.f12676j);
        this.f12671e.loadUrl(this.f12668b);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC19943());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10726a(SplashExpandDialog splashExpandDialog) {
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
            splashExpandDialog.f12671e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(splashExpandDialog.f12671e, r1[0], r1[1], r11.getWidth(), splashExpandDialog.f12671e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(splashExpandDialog.f12671e, r1[0], r1[1], r5.getWidth(), splashExpandDialog.f12671e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(splashExpandDialog.f12671e, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(splashExpandDialog.f12671e, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(splashExpandDialog.f12671e, map);
            CallMraidJS.getInstance().fireReadyEvent(splashExpandDialog.f12671e);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10728b() {
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
            this.f12671e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(this.f12671e, r1[0], r1[1], r11.getWidth(), this.f12671e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(this.f12671e, r1[0], r1[1], r5.getWidth(), this.f12671e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(this.f12671e, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(this.f12671e, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(this.f12671e, map);
            CallMraidJS.getInstance().fireReadyEvent(this.f12671e);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12670d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f12671e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f12670d.addView(this.f12671e);
        TextView textView = new TextView(getContext());
        this.f12672f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f12672f.setLayoutParams(layoutParams);
        this.f12672f.setVisibility(this.f12669c ? 4 : 0);
        this.f12672f.setOnClickListener(new ViewOnClickListenerC19921());
        this.f12670d.addView(this.f12672f);
        setContentView(this.f12670d);
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
        this.f12671e.setWebViewListener(new C19932());
        this.f12671e.setObject(this.f12676j);
        this.f12671e.loadUrl(this.f12668b);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC19943());
    }

    public void setCampaignList(String str, List<C1781c> list) {
        this.f12673g = str;
        this.f12674h = list;
    }
}
