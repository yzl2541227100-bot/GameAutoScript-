package com.anythink.splashad.p187a;

import com.anythink.core.api.AdError;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceC1312a;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;

/* JADX INFO: renamed from: com.anythink.splashad.a.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2416b implements InterfaceC1162a {
    private String mRequestId;
    private volatile boolean mHasReturn = false;
    private volatile boolean isAdTimeout = false;
    private final InterfaceC1312a timeOutHandler = C1315d.m3806a();
    private final InterfaceRunnableC1313b timeoutRunnable = new InterfaceRunnableC1313b() { // from class: com.anythink.splashad.a.b.1
        @Override // java.lang.Runnable
        public final void run() {
            if (AbstractC2416b.this.mHasReturn) {
                return;
            }
            AbstractC2416b.this.isAdTimeout = true;
            AbstractC2416b abstractC2416b = AbstractC2416b.this;
            abstractC2416b.onTimeout(abstractC2416b.mRequestId);
        }
    };

    @Override // com.anythink.core.common.p051b.InterfaceC1162a
    public void onAdLoadFail(AdError adError) {
        this.timeOutHandler.mo3801b(this.timeoutRunnable);
        if (this.mHasReturn) {
            return;
        }
        this.mHasReturn = true;
        onNoAdError(this.mRequestId, adError);
    }

    @Override // com.anythink.core.common.p051b.InterfaceC1162a
    public void onAdLoaded() {
        this.timeOutHandler.mo3801b(this.timeoutRunnable);
        if (this.mHasReturn) {
            return;
        }
        this.mHasReturn = true;
        onAdLoaded(this.mRequestId, this.isAdTimeout);
    }

    public abstract void onAdLoaded(String str, boolean z);

    public abstract void onNoAdError(String str, AdError adError);

    public abstract void onTimeout(String str);

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void startCountDown(int i) {
        this.timeOutHandler.mo3800a(this.timeoutRunnable, i, false);
    }
}
