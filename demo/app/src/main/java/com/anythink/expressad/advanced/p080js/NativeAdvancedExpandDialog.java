package com.anythink.expressad.advanced.p080js;

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
import com.anythink.expressad.advanced.p079d.InterfaceC1429a;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.p073a.p075b.C1410a;
import com.anythink.expressad.p086d.p088b.C1487a;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NativeAdvancedExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a */
    private final String f6589a;

    /* JADX INFO: renamed from: b */
    private String f6590b;

    /* JADX INFO: renamed from: c */
    private boolean f6591c;

    /* JADX INFO: renamed from: d */
    private FrameLayout f6592d;

    /* JADX INFO: renamed from: e */
    private WindVaneWebView f6593e;

    /* JADX INFO: renamed from: f */
    private TextView f6594f;

    /* JADX INFO: renamed from: g */
    private String f6595g;

    /* JADX INFO: renamed from: h */
    private List<C1781c> f6596h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1429a f6597i;

    /* JADX INFO: renamed from: j */
    private IMraidJSBridge f6598j;

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$1 */
    public class ViewOnClickListenerC14331 implements View.OnClickListener {
        public ViewOnClickListenerC14331() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NativeAdvancedExpandDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$2 */
    public class C14342 extends C1442b {

        /* JADX INFO: renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$2$1 */
        public class AnonymousClass1 implements ValueCallback<String> {
            public AnonymousClass1() {
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
            }
        }

        public C14342() {
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
                webView.evaluateJavascript(string, new ValueCallback<String>() { // from class: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog.2.1
                    public AnonymousClass1() {
                    }

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str2) {
                    }
                });
            }
            NativeAdvancedExpandDialog.m5557a(NativeAdvancedExpandDialog.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$3 */
    public class DialogInterfaceOnDismissListenerC14353 implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC14353() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (NativeAdvancedExpandDialog.this.f6597i != null) {
                NativeAdvancedExpandDialog.this.f6597i.mo5498a(false);
            }
            NativeAdvancedExpandDialog.this.f6593e.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            NativeAdvancedExpandDialog.this.f6592d.removeView(NativeAdvancedExpandDialog.this.f6593e);
            NativeAdvancedExpandDialog.this.f6593e.release();
            NativeAdvancedExpandDialog.this.f6593e = null;
            NativeAdvancedExpandDialog.this.f6597i = null;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$4 */
    public class C14364 implements IMraidJSBridge {
        public C14364() {
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
        public void close() {
            NativeAdvancedExpandDialog.this.dismiss();
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
                if (NativeAdvancedExpandDialog.this.f6593e != null && System.currentTimeMillis() - NativeAdvancedExpandDialog.this.f6593e.lastTouchTime > C1410a.f6300c) {
                    C1781c c1781c = (C1781c) NativeAdvancedExpandDialog.this.f6596h.get(0);
                    NativeAdvancedExpandDialog.this.f6593e.getUrl();
                    int i = C1410a.f6298a;
                    if (C1410a.m5255a(c1781c)) {
                        return;
                    }
                }
                if (NativeAdvancedExpandDialog.this.f6596h.size() > 1) {
                    C1175n.m2059a().m2148f().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    str = null;
                }
                if (NativeAdvancedExpandDialog.this.f6597i != null) {
                    NativeAdvancedExpandDialog.this.f6597i.mo5497a(str);
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
                NativeAdvancedExpandDialog.this.f6594f.setVisibility(z ? 4 : 0);
            } catch (Throwable unused) {
            }
        }
    }

    public NativeAdvancedExpandDialog(Context context, Bundle bundle, InterfaceC1429a interfaceC1429a) {
        super(context);
        this.f6589a = "NativeAdvancedExpandDialog";
        this.f6598j = new IMraidJSBridge() { // from class: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog.4
            public C14364() {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void close() {
                NativeAdvancedExpandDialog.this.dismiss();
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
                    if (NativeAdvancedExpandDialog.this.f6593e != null && System.currentTimeMillis() - NativeAdvancedExpandDialog.this.f6593e.lastTouchTime > C1410a.f6300c) {
                        C1781c c1781c = (C1781c) NativeAdvancedExpandDialog.this.f6596h.get(0);
                        NativeAdvancedExpandDialog.this.f6593e.getUrl();
                        int i = C1410a.f6298a;
                        if (C1410a.m5255a(c1781c)) {
                            return;
                        }
                    }
                    if (NativeAdvancedExpandDialog.this.f6596h.size() > 1) {
                        C1175n.m2059a().m2148f().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (NativeAdvancedExpandDialog.this.f6597i != null) {
                        NativeAdvancedExpandDialog.this.f6597i.mo5497a(str);
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
                    NativeAdvancedExpandDialog.this.f6594f.setVisibility(z ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        if (bundle != null) {
            this.f6590b = bundle.getString(C1781c.f10246am);
            this.f6591c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f6597i = interfaceC1429a;
    }

    /* JADX INFO: renamed from: a */
    private void m5556a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6592d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f6593e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6592d.addView(this.f6593e);
        TextView textView = new TextView(getContext());
        this.f6594f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f6594f.setLayoutParams(layoutParams);
        this.f6594f.setVisibility(this.f6591c ? 4 : 0);
        this.f6594f.setOnClickListener(new ViewOnClickListenerC14331());
        this.f6592d.addView(this.f6594f);
        setContentView(this.f6592d);
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
        this.f6593e.setWebViewListener(new C14342());
        this.f6593e.setObject(this.f6598j);
        this.f6593e.loadUrl(this.f6590b);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC14353());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5557a(NativeAdvancedExpandDialog nativeAdvancedExpandDialog) {
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
            map.put(CallMraidJS.f6709a, "inline");
            map.put("state", CallMraidJS.f6715g);
            map.put(CallMraidJS.f6711c, "true");
            map.put(CallMraidJS.f6712d, jSONObject);
            nativeAdvancedExpandDialog.f6593e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(nativeAdvancedExpandDialog.f6593e, r1[0], r1[1], r11.getWidth(), nativeAdvancedExpandDialog.f6593e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(nativeAdvancedExpandDialog.f6593e, r1[0], r1[1], r5.getWidth(), nativeAdvancedExpandDialog.f6593e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(nativeAdvancedExpandDialog.f6593e, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(nativeAdvancedExpandDialog.f6593e, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(nativeAdvancedExpandDialog.f6593e, map);
            CallMraidJS.getInstance().fireReadyEvent(nativeAdvancedExpandDialog.f6593e);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5559b() {
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
            map.put(CallMraidJS.f6709a, "inline");
            map.put("state", CallMraidJS.f6715g);
            map.put(CallMraidJS.f6711c, "true");
            map.put(CallMraidJS.f6712d, jSONObject);
            this.f6593e.getLocationInWindow(new int[2]);
            CallMraidJS.getInstance().fireSetDefaultPosition(this.f6593e, r1[0], r1[1], r11.getWidth(), this.f6593e.getHeight());
            CallMraidJS.getInstance().fireSetCurrentPosition(this.f6593e, r1[0], r1[1], r5.getWidth(), this.f6593e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(this.f6593e, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(this.f6593e, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(this.f6593e, map);
            CallMraidJS.getInstance().fireReadyEvent(this.f6593e);
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
        this.f6592d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f6593e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6592d.addView(this.f6593e);
        TextView textView = new TextView(getContext());
        this.f6594f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f6594f.setLayoutParams(layoutParams);
        this.f6594f.setVisibility(this.f6591c ? 4 : 0);
        this.f6594f.setOnClickListener(new ViewOnClickListenerC14331());
        this.f6592d.addView(this.f6594f);
        setContentView(this.f6592d);
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
        this.f6593e.setWebViewListener(new C14342());
        this.f6593e.setObject(this.f6598j);
        this.f6593e.loadUrl(this.f6590b);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC14353());
    }

    public void setCampaignList(String str, List<C1781c> list) {
        this.f6595g = str;
        this.f6596h = list;
    }
}
