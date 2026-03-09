package com.alibaba.sdk.android.oss.network;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import java.io.IOException;
import p285z2.AbstractC4336rx;
import p285z2.C4077kx;
import p285z2.c10;
import p285z2.h00;
import p285z2.j00;
import p285z2.m00;
import p285z2.u00;

/* JADX INFO: loaded from: classes.dex */
public class ProgressTouchableResponseBody<T extends OSSRequest> extends AbstractC4336rx {
    private j00 mBufferedSource;
    private OSSProgressCallback mProgressListener;
    private final AbstractC4336rx mResponseBody;
    private T request;

    public ProgressTouchableResponseBody(AbstractC4336rx abstractC4336rx, ExecutionContext executionContext) {
        this.mResponseBody = abstractC4336rx;
        this.mProgressListener = executionContext.getProgressCallback();
        this.request = (T) executionContext.getRequest();
    }

    private c10 source(c10 c10Var) {
        return new m00(c10Var) { // from class: com.alibaba.sdk.android.oss.network.ProgressTouchableResponseBody.1
            private long totalBytesRead = 0;

            @Override // p285z2.m00, p285z2.c10
            public long read(h00 h00Var, long j) throws IOException {
                long j2 = super.read(h00Var, j);
                this.totalBytesRead += j2 != -1 ? j2 : 0L;
                if (ProgressTouchableResponseBody.this.mProgressListener != null) {
                    long j3 = this.totalBytesRead;
                    if (j3 != -1 && j3 != 0) {
                        ProgressTouchableResponseBody.this.mProgressListener.onProgress(ProgressTouchableResponseBody.this.request, this.totalBytesRead, ProgressTouchableResponseBody.this.mResponseBody.contentLength());
                    }
                }
                return j2;
            }
        };
    }

    @Override // p285z2.AbstractC4336rx
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // p285z2.AbstractC4336rx
    public C4077kx contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // p285z2.AbstractC4336rx
    public j00 source() {
        if (this.mBufferedSource == null) {
            this.mBufferedSource = u00.OooO0Oo(source(this.mResponseBody.source()));
        }
        return this.mBufferedSource;
    }
}
