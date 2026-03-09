package com.octopus.p222ad.internal;

import com.octopus.p222ad.internal.utilities.HTTPGet;
import com.octopus.p222ad.internal.utilities.HTTPResponse;

/* JADX INFO: renamed from: com.octopus.ad.internal.h */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC3115h extends HTTPGet {

    /* JADX INFO: renamed from: a */
    private String f17146a;

    public AsyncTaskC3115h(String str) {
        super(false);
        this.f17146a = str;
    }

    @Override // com.octopus.p222ad.internal.utilities.HTTPGet
    public String getUrl() {
        return this.f17146a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.octopus.p222ad.internal.utilities.HTTPGet, android.os.AsyncTask
    public void onPostExecute(HTTPResponse hTTPResponse) {
        if (hTTPResponse != null) {
            hTTPResponse.getSucceeded();
        }
    }
}
