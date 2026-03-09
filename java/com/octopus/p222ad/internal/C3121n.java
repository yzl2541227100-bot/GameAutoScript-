package com.octopus.p222ad.internal;

import android.util.Log;
import com.octopus.p222ad.internal.network.AsyncTaskC3126a;
import com.octopus.p222ad.internal.network.ServerResponse;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.utils.p258b.C3257h;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: com.octopus.ad.internal.n */
/* JADX INFO: loaded from: classes2.dex */
public class C3121n extends AbstractC3129o {

    /* JADX INFO: renamed from: a */
    private AsyncTaskC3126a f17204a;

    /* JADX INFO: renamed from: b */
    private C3111d f17205b = new C3111d(C3120m.m14425a().m14441g(), StringUtil.createRequestId());

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: a */
    public void mo14393a() {
        this.f17204a = new AsyncTaskC3126a(new AsyncTaskC3126a.a());
        m14591e();
        try {
            this.f17204a.m14557a(this);
            this.f17204a.executeOnExecutor(C3257h.m14988b().m14989c(), new Void[0]);
        } catch (IllegalStateException e) {
            Log.d("octopus", "ignored:" + e.getMessage());
        } catch (RejectedExecutionException e2) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, "Concurrent Thread Exception while firing new ad request: " + e2.getMessage());
        }
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: a */
    public void mo14394a(int i) {
        HaoboLog.m14607d(HaoboLog.pbLogTag, "Failed to load prefetch request: " + i);
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: a */
    public void mo14395a(ServerResponse serverResponse) {
        for (String str : serverResponse.getPrefetchResources()) {
            HaoboLog.m14607d(HaoboLog.baseLogTag, "Prefetch resource: " + str);
        }
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: b */
    public C3111d mo14396b() {
        return this.f17205b;
    }

    @Override // com.octopus.p222ad.internal.AbstractC3129o
    /* JADX INFO: renamed from: c */
    public void mo14400c() {
        AsyncTaskC3126a asyncTaskC3126a = this.f17204a;
        if (asyncTaskC3126a != null) {
            asyncTaskC3126a.cancel(true);
            this.f17204a = null;
        }
    }
}
