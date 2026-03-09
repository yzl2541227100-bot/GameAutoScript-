package com.iflytek.voiceads.request;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.anythink.core.common.res.C1380d;
import com.iflytek.voiceads.bridge.C2902b;
import com.iflytek.voiceads.bridge.DSBridgeWebView;
import com.iflytek.voiceads.bridge.InterfaceC2915o;
import com.iflytek.voiceads.download.C2937d;
import com.iflytek.voiceads.listener.DialogListener;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class IFLYBrowser extends Activity {

    /* JADX INFO: renamed from: a */
    InterfaceC2915o f16421a = new C2975b(this);

    /* JADX INFO: renamed from: b */
    WebChromeClient f16422b = new C2976c(this);

    /* JADX INFO: renamed from: c */
    DialogListener f16423c = new C2977d(this);

    /* JADX INFO: renamed from: d */
    private DSBridgeWebView f16424d;

    /* JADX INFO: renamed from: e */
    private LinearLayout f16425e;

    /* JADX INFO: renamed from: f */
    private ProgressBar f16426f;

    /* JADX INFO: renamed from: g */
    private C2902b f16427g;

    /* JADX INFO: renamed from: h */
    private String f16428h;

    /* JADX INFO: renamed from: com.iflytek.voiceads.request.IFLYBrowser$a */
    class C2973a implements DownloadListener {
        C2973a() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            C2989g.m13555a("IFLY_AD_SDK", "self webView");
            C2937d c2937dM13333a = C2937d.m13333a(IFLYBrowser.this.getApplicationContext());
            c2937dM13333a.m13367a(IFLYBrowser.this.f16423c);
            c2937dM13333a.m13368a(IFLYBrowser.this.getIntent().getBooleanExtra("is_show", false));
            c2937dM13333a.m13366a(IFLYBrowser.this, str);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.f16425e = new LinearLayout(getApplicationContext());
        this.f16425e.setOrientation(1);
        this.f16424d = new DSBridgeWebView(getApplicationContext());
        this.f16424d.getSettings().setDomStorageEnabled(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f16426f = new ProgressBar(getApplicationContext(), null, R.attr.progressBarStyleHorizontal);
        this.f16426f.setMax(100);
        this.f16426f.setProgress(0);
        this.f16425e.addView(this.f16426f, -1, 16);
        this.f16425e.addView(this.f16424d, layoutParams);
        setContentView(this.f16425e);
        this.f16428h = getIntent().getStringExtra("ad_session_id");
        this.f16424d.m13264a(this.f16421a);
        this.f16424d.setWebChromeClient(this.f16422b);
        this.f16424d.setDownloadListener(new C2973a());
        this.f16427g = new C2902b(getApplicationContext(), this.f16424d);
        this.f16424d.m13266a(this.f16427g, (String) null);
        this.f16424d.loadUrl(getIntent().getStringExtra("url_ad"));
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        C2989g.m13555a("IFLY_AD_SDK", "IFLYBrowser onDestroy");
        try {
            if (this.f16427g != null) {
                this.f16427g.m13274a();
            }
            if (this.f16424d != null) {
                this.f16425e.removeView(this.f16424d);
                this.f16424d.stopLoading();
                this.f16424d.getSettings().setJavaScriptEnabled(false);
                this.f16424d.clearHistory();
                this.f16424d.loadUrl(C1380d.f5563a);
                this.f16424d.removeAllViews();
                this.f16424d.destroy();
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "IFLYBrowser onDestroy " + e.getMessage());
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.f16427g != null) {
            this.f16427g.m13274a();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
