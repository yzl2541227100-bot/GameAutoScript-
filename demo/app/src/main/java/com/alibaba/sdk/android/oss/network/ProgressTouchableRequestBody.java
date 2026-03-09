package com.alibaba.sdk.android.oss.network;

import android.support.v4.media.session.PlaybackStateCompat;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import java.io.InputStream;
import p285z2.AbstractC4262px;
import p285z2.C4077kx;
import p285z2.c10;
import p285z2.i00;
import p285z2.u00;

/* JADX INFO: loaded from: classes.dex */
public class ProgressTouchableRequestBody<T extends OSSRequest> extends AbstractC4262px {
    private static final int SEGMENT_SIZE = 2048;
    private OSSProgressCallback callback;
    private long contentLength;
    private String contentType;
    private InputStream inputStream;
    private T request;

    public ProgressTouchableRequestBody(InputStream inputStream, long j, String str, ExecutionContext executionContext) {
        this.inputStream = inputStream;
        this.contentType = str;
        this.contentLength = j;
        this.callback = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    @Override // p285z2.AbstractC4262px
    public long contentLength() throws IOException {
        return this.contentLength;
    }

    @Override // p285z2.AbstractC4262px
    public C4077kx contentType() {
        return C4077kx.OooO0Oo(this.contentType);
    }

    @Override // p285z2.AbstractC4262px
    public void writeTo(i00 i00Var) throws IOException {
        c10 c10VarOooOO0o = u00.OooOO0o(this.inputStream);
        long j = 0;
        while (true) {
            long j2 = this.contentLength;
            if (j >= j2) {
                break;
            }
            long j3 = c10VarOooOO0o.read(i00Var.OooO00o(), Math.min(j2 - j, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
            if (j3 == -1) {
                break;
            }
            j += j3;
            i00Var.flush();
            OSSProgressCallback oSSProgressCallback = this.callback;
            if (oSSProgressCallback != null && j != 0) {
                oSSProgressCallback.onProgress(this.request, j, this.contentLength);
            }
        }
        if (c10VarOooOO0o != null) {
            c10VarOooOO0o.close();
        }
    }
}
