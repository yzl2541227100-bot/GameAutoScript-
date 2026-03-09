package com.octopus.p222ad.internal.view;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.utilities.ViewUtil;

/* JADX INFO: renamed from: com.octopus.ad.internal.view.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3200h extends C3193a {

    /* JADX INFO: renamed from: a */
    private WebChromeClient.CustomViewCallback f17791a;

    /* JADX INFO: renamed from: b */
    private FrameLayout f17792b;

    /* JADX INFO: renamed from: c */
    private Context f17793c;

    /* JADX INFO: renamed from: d */
    private AdViewImpl f17794d;

    /* JADX INFO: renamed from: e */
    private AdWebView f17795e;

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.h$1 */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3200h.this.onHideCustomView();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.h$2 */
    public class AnonymousClass2 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GeolocationPermissions.Callback f17797a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f17798b;

        public AnonymousClass2(GeolocationPermissions.Callback callback, String str) {
            callback = callback;
            str = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            callback.invoke(str, true, true);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.h$3 */
    public class AnonymousClass3 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GeolocationPermissions.Callback f17800a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f17801b;

        public AnonymousClass3(GeolocationPermissions.Callback callback, String str) {
            callback = callback;
            str = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            callback.invoke(str, false, false);
        }
    }

    public C3200h(Activity activity) {
        this.f17793c = activity;
    }

    public C3200h(AdWebView adWebView) {
        this.f17793c = adWebView.getContextFromMutableContext();
        this.f17795e = adWebView;
        this.f17794d = adWebView.adViewImpl;
    }

    /* JADX INFO: renamed from: a */
    private void m14821a(FrameLayout frameLayout) {
        ImageButton imageButton = new ImageButton(this.f17793c);
        imageButton.setImageDrawable(this.f17793c.getResources().getDrawable(R.drawable.ic_menu_close_clear_cancel));
        imageButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 53));
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.h.1
            public AnonymousClass1() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3200h.this.onHideCustomView();
            }
        });
        frameLayout.addView(imageButton);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        AdViewImpl adViewImpl = this.f17794d;
        if (adViewImpl == null || adViewImpl.mo14697e() || this.f17794d.m14692a()) {
            return;
        }
        this.f17794d.getAdDispatcher().mo14241b();
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        AdWebView adWebView = this.f17795e;
        AlertDialog.Builder builder = new AlertDialog.Builder(adWebView != null ? ViewUtil.getTopContext(adWebView) : this.f17793c);
        builder.setTitle(String.format(this.f17793c.getResources().getString(C3063R.string.html5_geo_permission_prompt_title), str));
        builder.setMessage(C3063R.string.html5_geo_permission_prompt);
        builder.setPositiveButton(C3063R.string.allow, new DialogInterface.OnClickListener() { // from class: com.octopus.ad.internal.view.h.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ GeolocationPermissions.Callback f17797a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f17798b;

            public AnonymousClass2(GeolocationPermissions.Callback callback2, String str2) {
                callback = callback2;
                str = str2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                callback.invoke(str, true, true);
            }
        });
        builder.setNegativeButton(C3063R.string.deny, new DialogInterface.OnClickListener() { // from class: com.octopus.ad.internal.view.h.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ GeolocationPermissions.Callback f17800a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f17801b;

            public AnonymousClass3(GeolocationPermissions.Callback callback2, String str2) {
                callback = callback2;
                str = str2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                callback.invoke(str, false, false);
            }
        });
        builder.create().show();
        AdViewImpl adViewImpl = this.f17794d;
        if (adViewImpl == null || adViewImpl.mo14697e() || this.f17794d.m14692a()) {
            return;
        }
        this.f17794d.getAdDispatcher().mo14242c();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0039  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onHideCustomView() {
        /*
            r4 = this;
            super.onHideCustomView()
            android.content.Context r0 = r4.f17793c
            if (r0 == 0) goto L2d
            android.widget.FrameLayout r1 = r4.f17792b
            if (r1 != 0) goto Lc
            goto L2d
        Lc:
            r1 = 0
            com.octopus.ad.internal.view.AdWebView r2 = r4.f17795e
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 == 0) goto L20
            android.view.View r0 = r2.getRootView()
            android.view.View r0 = r0.findViewById(r3)
        L1c:
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L2b
        L20:
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L2b
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.View r0 = r0.findViewById(r3)
            goto L1c
        L2b:
            if (r1 != 0) goto L39
        L2d:
            java.lang.String r0 = com.octopus.p222ad.internal.utilities.HaoboLog.baseLogTag
            int r1 = com.octopus.p222ad.C3063R.string.fullscreen_video_hide_error
            java.lang.String r1 = com.octopus.p222ad.internal.utilities.HaoboLog.getString(r1)
            com.octopus.p222ad.internal.utilities.HaoboLog.m14615w(r0, r1)
            return
        L39:
            android.widget.FrameLayout r0 = r4.f17792b
            r1.removeView(r0)
            android.webkit.WebChromeClient$CustomViewCallback r0 = r4.f17791a
            if (r0 == 0) goto L61
            r0.onCustomViewHidden()     // Catch: java.lang.NullPointerException -> L46
            goto L61
        L46:
            r0 = move-exception
            java.lang.String r1 = com.octopus.p222ad.internal.utilities.HaoboLog.baseLogTag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception calling customViewCallback  onCustomViewHidden: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.octopus.p222ad.internal.utilities.HaoboLog.m14609e(r1, r0)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.view.C3200h.onHideCustomView():void");
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0035  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onShowCustomView(android.view.View r5, android.webkit.WebChromeClient.CustomViewCallback r6) {
        /*
            r4 = this;
            super.onShowCustomView(r5, r6)
            android.content.Context r0 = r4.f17793c
            if (r0 != 0) goto L13
        L7:
            java.lang.String r5 = com.octopus.p222ad.internal.utilities.HaoboLog.baseLogTag
            int r6 = com.octopus.p222ad.C3063R.string.fullscreen_video_show_error
            java.lang.String r6 = com.octopus.p222ad.internal.utilities.HaoboLog.getString(r6)
            com.octopus.p222ad.internal.utilities.HaoboLog.m14615w(r5, r6)
            return
        L13:
            com.octopus.ad.internal.view.AdWebView r1 = r4.f17795e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            r3 = 0
            if (r1 == 0) goto L26
            android.view.View r0 = r1.getRootView()
            android.view.View r0 = r0.findViewById(r2)
        L23:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L32
        L26:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L31
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.View r0 = r0.findViewById(r2)
            goto L23
        L31:
            r0 = r3
        L32:
            if (r0 != 0) goto L35
            goto L7
        L35:
            r4.f17791a = r6
            boolean r6 = r5 instanceof android.widget.FrameLayout
            if (r6 == 0) goto L66
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r4.f17792b = r5
            r6 = 1
            r5.setClickable(r6)
            android.widget.FrameLayout r5 = r4.f17792b
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setBackgroundColor(r6)
            android.widget.FrameLayout r5 = r4.f17792b     // Catch: java.lang.Exception -> L5b
            r4.m14821a(r5)     // Catch: java.lang.Exception -> L5b
            android.widget.FrameLayout r5 = r4.f17792b     // Catch: java.lang.Exception -> L5b
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Exception -> L5b
            r1 = -1
            r6.<init>(r1, r1)     // Catch: java.lang.Exception -> L5b
            r0.addView(r5, r6)     // Catch: java.lang.Exception -> L5b
            goto L68
        L5b:
            r5 = move-exception
            java.lang.String r6 = com.octopus.p222ad.internal.utilities.HaoboLog.baseLogTag
            java.lang.String r5 = r5.toString()
            com.octopus.p222ad.internal.utilities.HaoboLog.m14607d(r6, r5)
            goto L68
        L66:
            r4.f17792b = r3
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.view.C3200h.onShowCustomView(android.view.View, android.webkit.WebChromeClient$CustomViewCallback):void");
    }
}
