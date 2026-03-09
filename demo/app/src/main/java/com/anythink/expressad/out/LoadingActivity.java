package com.anythink.expressad.out;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1172k;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.widget.ATImageView;

/* JADX INFO: loaded from: classes.dex */
public class LoadingActivity extends Activity {

    /* JADX INFO: renamed from: b */
    private RelativeLayout f11891b;

    /* JADX INFO: renamed from: c */
    private ImageView f11892c;

    /* JADX INFO: renamed from: d */
    private Bitmap f11893d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1924a f11894e;

    /* JADX INFO: renamed from: f */
    private String f11895f;

    /* JADX INFO: renamed from: h */
    private Drawable f11897h;

    /* JADX INFO: renamed from: i */
    private RelativeLayout f11898i;

    /* JADX INFO: renamed from: g */
    private InterfaceC1819c f11896g = new InterfaceC1819c() { // from class: com.anythink.expressad.out.LoadingActivity.1
        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            if (LoadingActivity.this.f11892c == null || bitmap == null || bitmap.isRecycled() || !((String) LoadingActivity.this.f11892c.getTag()).equals(str)) {
                return;
            }
            LoadingActivity.this.f11892c.setImageBitmap(bitmap);
            LoadingActivity.this.f11893d = bitmap;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    };

    /* JADX INFO: renamed from: a */
    public BroadcastReceiver f11890a = new BroadcastReceiver() { // from class: com.anythink.expressad.out.LoadingActivity.2
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            LoadingActivity.this.finish();
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.out.LoadingActivity$a */
    public interface InterfaceC1924a {
        /* JADX INFO: renamed from: a */
        void m10112a();
    }

    /* JADX INFO: renamed from: a */
    private View m10110a() {
        if (this.f11891b == null) {
            this.f11891b = new RelativeLayout(this);
            this.f11898i = new RelativeLayout(this);
            int iM9834b = C1886t.m9834b(this, 15.0f);
            this.f11898i.setPadding(iM9834b, iM9834b, iM9834b, iM9834b);
            this.f11898i.setBackgroundResource(C1875i.m9684a(this, "anythink_native_bg_loading_camera", C1875i.f11528c));
            this.f11898i.addView(new TextView(this), new RelativeLayout.LayoutParams(C1886t.m9834b(this, 140.0f), C1886t.m9834b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.f11892c = aTImageView;
            aTImageView.setId(C1886t.m9819a());
            this.f11892c.setTag(this.f11895f);
            if (!TextUtils.isEmpty(this.f11895f)) {
                C1818b.m9427a(getApplicationContext()).m9443a(this.f11895f, this.f11896g);
            }
            int iM9834b2 = C1886t.m9834b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM9834b2, iM9834b2);
            layoutParams.addRule(13, -1);
            this.f11898i.addView(this.f11892c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.f11892c.getId());
            layoutParams2.addRule(14, -1);
            this.f11898i.addView(textView, layoutParams2);
            this.f11891b.addView(this.f11898i, new RelativeLayout.LayoutParams(-1, -1));
        }
        return this.f11891b;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("icon_url")) {
            this.f11895f = getIntent().getStringExtra("icon_url");
        }
        if (this.f11891b == null) {
            this.f11891b = new RelativeLayout(this);
            this.f11898i = new RelativeLayout(this);
            int iM9834b = C1886t.m9834b(this, 15.0f);
            this.f11898i.setPadding(iM9834b, iM9834b, iM9834b, iM9834b);
            this.f11898i.setBackgroundResource(C1875i.m9684a(this, "anythink_native_bg_loading_camera", C1875i.f11528c));
            this.f11898i.addView(new TextView(this), new RelativeLayout.LayoutParams(C1886t.m9834b(this, 140.0f), C1886t.m9834b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.f11892c = aTImageView;
            aTImageView.setId(C1886t.m9819a());
            this.f11892c.setTag(this.f11895f);
            if (!TextUtils.isEmpty(this.f11895f)) {
                C1818b.m9427a(getApplicationContext()).m9443a(this.f11895f, this.f11896g);
            }
            int iM9834b2 = C1886t.m9834b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM9834b2, iM9834b2);
            layoutParams.addRule(13, -1);
            this.f11898i.addView(this.f11892c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.f11892c.getId());
            layoutParams2.addRule(14, -1);
            this.f11898i.addView(textView, layoutParams2);
            this.f11891b.addView(this.f11898i, new RelativeLayout.LayoutParams(-1, -1));
        }
        setContentView(this.f11891b);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f11890a != null) {
            C1172k.m2050a(this).m2051a(this.f11890a);
        }
        ImageView imageView = this.f11892c;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f11892c = null;
        this.f11891b = null;
        this.f11896g = null;
        this.f11897h = null;
        RelativeLayout relativeLayout = this.f11898i;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundDrawable(null);
        }
        this.f11898i = null;
        Bitmap bitmap = this.f11893d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f11893d = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ExitApp");
        if (this.f11890a != null) {
            C1172k.m2050a(this).m2052a(this.f11890a, intentFilter);
        }
    }
}
