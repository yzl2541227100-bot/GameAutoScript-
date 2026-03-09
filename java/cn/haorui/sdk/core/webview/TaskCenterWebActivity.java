package cn.haorui.sdk.core.webview;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import cn.haorui.sdk.C0384R;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.taskcenter.TrackBean;
import cn.haorui.sdk.core.webview.TaskCenterJs;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TaskCenterWebActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a */
    public WebView f338a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f339b;

    /* JADX INFO: renamed from: c */
    public TaskCenterJs f340c;

    /* JADX INFO: renamed from: d */
    public boolean f341d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f342e;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.webview.TaskCenterWebActivity$a */
    public class C0591a implements ValueCallback<String> {
        public C0591a(TaskCenterWebActivity taskCenterWebActivity) {
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.webview.TaskCenterWebActivity$b */
    public class C0592b implements ValueCallback<String> {
        public C0592b(TaskCenterWebActivity taskCenterWebActivity) {
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.webview.TaskCenterWebActivity$c */
    public class C0593c extends WebViewClient {
        public C0593c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TaskCenterWebActivity.this.f342e.setVisibility(8);
            Log.e("TaskCenterWebActivity", "onPageFinished: ");
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            Log.e("TaskCenterWebActivity", "onPageStarted: ");
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0384R.layout.adsail_activity_task_center_web);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(9472);
            getWindow().setStatusBarColor(-1);
        }
        this.f339b = (RelativeLayout) findViewById(C0384R.id.adsail_task_center_rootview);
        this.f338a = (WebView) findViewById(C0384R.id.adsail_task_center_webview);
        this.f342e = (RelativeLayout) findViewById(C0384R.id.adsail_progressBarRL);
        WebSettings settings = this.f338a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        TaskCenterJs taskCenterJs = new TaskCenterJs(this, this.f338a);
        this.f340c = taskCenterJs;
        this.f338a.addJavascriptInterface(taskCenterJs, "MsBusiness");
        this.f338a.setWebChromeClient(new WebChromeClient());
        this.f338a.setWebViewClient(new C0593c());
        if (getIntent().hasExtra(C1781c.f10246am)) {
            String stringExtra = getIntent().getStringExtra(C1781c.f10246am);
            if (getIntent().hasExtra("userId")) {
                String stringExtra2 = getIntent().getStringExtra("userId");
                if (!TextUtils.isEmpty(stringExtra2)) {
                    stringExtra = stringExtra.replace("__UID__", stringExtra2);
                }
            }
            if (AdSdk.getOaid() != null) {
                stringExtra = stringExtra.replace("__DEVICE__", Base64.encodeToString(AdSdk.getOaid().getBytes(), 2));
            }
            this.f338a.loadUrl(stringExtra);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        TaskCenterJs.InstallReceiver installReceiver;
        TaskCenterWebActivity taskCenterWebActivity;
        super.onDestroy();
        WebView webView = this.f338a;
        if (webView != null) {
            this.f339b.removeView(webView);
            this.f338a.destroy();
            this.f338a = null;
        }
        TaskCenterJs taskCenterJs = this.f340c;
        if (taskCenterJs == null || (installReceiver = taskCenterJs.f330d) == null || (taskCenterWebActivity = taskCenterJs.f327a) == null) {
            return;
        }
        taskCenterWebActivity.unregisterReceiver(installReceiver);
        Map<String, TrackBean> map = taskCenterJs.f329c;
        if (map != null) {
            map.clear();
        }
        taskCenterJs.f327a = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f338a == null || Build.VERSION.SDK_INT < 19) {
            return true;
        }
        Log.e("TaskCenterWebActivity", "onKeyDown: ");
        this.f338a.evaluateJavascript("javascript:reportAndroidBack()", new C0592b(this));
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f341d = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        WebView webView = this.f338a;
        if (webView == null || !this.f341d) {
            return;
        }
        this.f341d = false;
        if (Build.VERSION.SDK_INT >= 19) {
            webView.evaluateJavascript("javascript:windowsResume()", new C0591a(this));
        }
    }
}
