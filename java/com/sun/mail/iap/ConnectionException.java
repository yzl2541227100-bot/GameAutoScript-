package com.sun.mail.iap;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectionException extends ProtocolException {
    private static final long serialVersionUID = 5749739604257464727L;

    /* JADX INFO: renamed from: p */
    private transient Protocol f18017p;

    public ConnectionException() {
    }

    public ConnectionException(Protocol protocol, Response response) {
        super(response);
        this.f18017p = protocol;
    }

    public ConnectionException(String str) {
        super(str);
    }

    public Protocol getProtocol() {
        return this.f18017p;
    }
}
