package com.octopus.p222ad;

import android.content.Context;
import androidx.annotation.RequiresPermission;
import com.octopus.p222ad.internal.nativead.AsyncTaskC3122a;
import com.octopus.p222ad.internal.network.AsyncTaskC3126a;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeAd implements AdLifeControl, IBidding {

    /* JADX INFO: renamed from: a */
    private final AsyncTaskC3122a f16671a;

    @RequiresPermission("android.permission.INTERNET")
    public NativeAd(Context context, String str, NativeAdListener nativeAdListener) {
        AsyncTaskC3122a asyncTaskC3122a = new AsyncTaskC3122a(context, str, 1);
        this.f16671a = asyncTaskC3122a;
        asyncTaskC3122a.m14459a(nativeAdListener);
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void cancel() {
        AsyncTaskC3122a asyncTaskC3122a = this.f16671a;
        if (asyncTaskC3122a != null) {
            asyncTaskC3122a.m14474g();
            this.f16671a.f17206a.m14365a();
            this.f16671a.cancel(true);
        }
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void destroy() {
        cancel();
    }

    public String getAdSlotId() {
        return this.f16671a.m14464b();
    }

    public int getPrice() {
        AsyncTaskC3122a asyncTaskC3122a = this.f16671a;
        if (asyncTaskC3122a == null) {
            return 0;
        }
        return asyncTaskC3122a.m14467c();
    }

    public String getTagId() {
        AsyncTaskC3122a asyncTaskC3122a = this.f16671a;
        if (asyncTaskC3122a == null) {
            return null;
        }
        return asyncTaskC3122a.m14469d();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd() {
        this.f16671a.m14463a((AsyncTaskC3126a.a) null);
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onCreateLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onDestroyLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onPauseLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onRestartLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onResumeLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onStartLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onStopLifeCycle() {
    }

    public void openAdInNativeBrowser(boolean z) {
        this.f16671a.m14466b(z);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendLossNotice(int i, String str, String str2) {
        AsyncTaskC3122a asyncTaskC3122a = this.f16671a;
        if (asyncTaskC3122a == null) {
            return;
        }
        asyncTaskC3122a.sendLossNotice(i, str, str2);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendWinNotice(int i) {
        AsyncTaskC3122a asyncTaskC3122a = this.f16671a;
        if (asyncTaskC3122a == null) {
            return;
        }
        asyncTaskC3122a.sendWinNotice(i);
    }

    public void setAdSlotId(String str) {
        this.f16671a.m14460a(str);
    }

    public void setChannel(String str) {
        this.f16671a.m14468c(str);
    }

    public void setRequestId(String str) {
        this.f16671a.m14470d(str);
    }
}
