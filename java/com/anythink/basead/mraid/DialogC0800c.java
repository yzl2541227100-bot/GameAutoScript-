package com.anythink.basead.mraid;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
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
import com.anythink.expressad.p086d.p088b.C1487a;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.basead.mraid.c */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0800c extends Dialog {

    /* JADX INFO: renamed from: a */
    private final String f1080a;

    /* JADX INFO: renamed from: b */
    private String f1081b;

    /* JADX INFO: renamed from: c */
    private boolean f1082c;

    /* JADX INFO: renamed from: d */
    private FrameLayout f1083d;

    /* JADX INFO: renamed from: e */
    private WindVaneWebView f1084e;

    /* JADX INFO: renamed from: f */
    private TextView f1085f;

    /* JADX INFO: renamed from: g */
    private AbstractC0799b f1086g;

    /* JADX INFO: renamed from: h */
    private IMraidJSBridge f1087h;

    /* JADX INFO: renamed from: com.anythink.basead.mraid.c$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogC0800c.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.mraid.c$2, reason: invalid class name */
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
                webView.evaluateJavascript(string, new ValueCallback<String>() { // from class: com.anythink.basead.mraid.c.2.1
                    /* JADX INFO: renamed from: a */
                    private static void m661a() {
                    }

                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                    }
                });
            }
            DialogC0800c.m655a(DialogC0800c.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.mraid.c$3, reason: invalid class name */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            DialogC0800c.this.f1084e.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            DialogC0800c.this.f1083d.removeView(DialogC0800c.this.f1084e);
            DialogC0800c.this.f1084e.release();
            DialogC0800c.this.f1084e = null;
            DialogC0800c.this.f1086g = null;
        }
    }

    public DialogC0800c(Context context, Bundle bundle, AbstractC0799b abstractC0799b) {
        super(context);
        this.f1080a = "BannerExpandDialog";
        this.f1087h = new IMraidJSBridge() { // from class: com.anythink.basead.mraid.c.4
            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void close() {
                DialogC0800c.this.dismiss();
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
                    if (DialogC0800c.this.f1086g != null) {
                        DialogC0800c.this.f1086g.open(str);
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
                    DialogC0800c.this.f1085f.setVisibility(z ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        this.f1081b = bundle.getString(C1781c.f10246am);
        this.f1082c = bundle.getBoolean("shouldUseCustomClose");
        this.f1086g = abstractC0799b;
    }

    /* JADX INFO: renamed from: a */
    private void m654a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1083d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f1084e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f1083d.addView(this.f1084e);
        TextView textView = new TextView(getContext());
        this.f1085f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f1085f.setLayoutParams(layoutParams);
        this.f1085f.setVisibility(this.f1082c ? 4 : 0);
        this.f1085f.setOnClickListener(new AnonymousClass1());
        this.f1083d.addView(this.f1085f);
        setContentView(this.f1083d);
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
        this.f1084e.setWebViewListener(new AnonymousClass2());
        this.f1084e.setObject(this.f1087h);
        this.f1084e.loadUrl(this.f1081b);
        setOnDismissListener(new AnonymousClass3());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m655a(DialogC0800c dialogC0800c) {
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
            dialogC0800c.f1084e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(dialogC0800c.f1084e, r1[0], r1[1], r11.getWidth(), dialogC0800c.f1084e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(dialogC0800c.f1084e, r1[0], r1[1], r5.getWidth(), dialogC0800c.f1084e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(dialogC0800c.f1084e, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(dialogC0800c.f1084e, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(dialogC0800c.f1084e, map);
            CallMraidJS.getInstance().fireReadyEvent(dialogC0800c.f1084e);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m657b() {
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
            this.f1084e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(this.f1084e, r1[0], r1[1], r11.getWidth(), this.f1084e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(this.f1084e, r1[0], r1[1], r5.getWidth(), this.f1084e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(this.f1084e, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(this.f1084e, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(this.f1084e, map);
            CallMraidJS.getInstance().fireReadyEvent(this.f1084e);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1083d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f1084e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f1083d.addView(this.f1084e);
        TextView textView = new TextView(getContext());
        this.f1085f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f1085f.setLayoutParams(layoutParams);
        this.f1085f.setVisibility(this.f1082c ? 4 : 0);
        this.f1085f.setOnClickListener(new AnonymousClass1());
        this.f1083d.addView(this.f1085f);
        setContentView(this.f1083d);
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
        this.f1084e.setWebViewListener(new AnonymousClass2());
        this.f1084e.setObject(this.f1087h);
        this.f1084e.loadUrl(this.f1081b);
        setOnDismissListener(new AnonymousClass3());
    }
}
