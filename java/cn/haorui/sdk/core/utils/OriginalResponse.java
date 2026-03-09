package cn.haorui.sdk.core.utils;

import p285z2.C3966hx;

/* JADX INFO: loaded from: classes.dex */
public class OriginalResponse {
    private String body;
    private int code;
    private C3966hx headers;
    private boolean successful;

    public OriginalResponse(int i, boolean z) {
        this.code = i;
        this.successful = z;
    }

    public String getBody() {
        return this.body;
    }

    public int getCode() {
        return this.code;
    }

    public String header(String str) {
        C3966hx c3966hx = this.headers;
        if (c3966hx != null) {
            return c3966hx.OooO0Oo(str);
        }
        return null;
    }

    public boolean isSuccessful() {
        return this.successful;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setHeaders(C3966hx c3966hx) {
        this.headers = c3966hx;
    }

    public void setSuccessful(boolean z) {
        this.successful = z;
    }
}
