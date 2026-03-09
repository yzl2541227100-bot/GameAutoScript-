package cn.haorui.sdk.core.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

/* JADX INFO: renamed from: cn.haorui.sdk.core.webview.a */
/* JADX INFO: loaded from: classes.dex */
public class C0594a implements DownloadListener {

    /* JADX INFO: renamed from: a */
    public Context f344a;

    public C0594a(Context context) {
        this.f344a = context;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            this.f344a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
