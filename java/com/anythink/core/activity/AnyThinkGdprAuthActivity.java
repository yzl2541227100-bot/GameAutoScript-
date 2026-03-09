package com.anythink.core.activity;

import android.app.Activity;
import android.os.Bundle;
import com.anythink.core.activity.component.PrivacyPolicyView;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.common.C1267h;

/* JADX INFO: loaded from: classes.dex */
public class AnyThinkGdprAuthActivity extends Activity {
    public static ATGDPRAuthCallback mCallback;

    /* JADX INFO: renamed from: a */
    public String f2524a;

    /* JADX INFO: renamed from: b */
    public PrivacyPolicyView f2525b;

    /* JADX INFO: renamed from: c */
    public boolean f2526c = false;

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f2526c) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1267h.m3614a();
        this.f2524a = C1267h.m3630l();
        setRequestedOrientation(getResources().getConfiguration().orientation == 2 ? 6 : 7);
        try {
            PrivacyPolicyView privacyPolicyView = new PrivacyPolicyView(this);
            this.f2525b = privacyPolicyView;
            privacyPolicyView.setResultCallbackListener(new PrivacyPolicyView.InterfaceC1093a() { // from class: com.anythink.core.activity.AnyThinkGdprAuthActivity.1
                @Override // com.anythink.core.activity.component.PrivacyPolicyView.InterfaceC1093a
                public final void onLevelSelect(int i) {
                    ATGDPRAuthCallback aTGDPRAuthCallback = AnyThinkGdprAuthActivity.mCallback;
                    if (aTGDPRAuthCallback != null) {
                        aTGDPRAuthCallback.onAuthResult(i);
                        AnyThinkGdprAuthActivity.mCallback = null;
                    }
                    AnyThinkGdprAuthActivity.this.finish();
                }

                @Override // com.anythink.core.activity.component.PrivacyPolicyView.InterfaceC1093a
                public final void onPageLoadFail() {
                    AnyThinkGdprAuthActivity.this.f2526c = true;
                    ATGDPRAuthCallback aTGDPRAuthCallback = AnyThinkGdprAuthActivity.mCallback;
                    if (aTGDPRAuthCallback != null) {
                        aTGDPRAuthCallback.onPageLoadFail();
                    }
                }

                @Override // com.anythink.core.activity.component.PrivacyPolicyView.InterfaceC1093a
                public final void onPageLoadSuccess() {
                    AnyThinkGdprAuthActivity.this.f2526c = false;
                }
            });
            setContentView(this.f2525b);
            this.f2525b.loadPolicyUrl(this.f2524a);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        PrivacyPolicyView privacyPolicyView = this.f2525b;
        if (privacyPolicyView != null) {
            privacyPolicyView.destory();
        }
        mCallback = null;
        super.onDestroy();
    }
}
