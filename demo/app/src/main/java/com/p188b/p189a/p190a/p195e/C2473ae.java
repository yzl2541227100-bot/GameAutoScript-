package com.p188b.p189a.p190a.p195e;

import com.p188b.p199b.C2573a;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: com.b.a.a.e.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C2473ae extends C2573a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2470ab f15264a;

    public C2473ae(C2470ab c2470ab) {
        this.f15264a = c2470ab;
    }

    @Override // com.p188b.p199b.C2573a
    /* JADX INFO: renamed from: a */
    public final IOException mo12661a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // com.p188b.p199b.C2573a
    /* JADX INFO: renamed from: a */
    public final void mo12662a() {
        this.f15264a.m12648b(EnumC2482b.CANCEL);
    }

    /* JADX INFO: renamed from: b */
    public final void m12663b() {
        if (m12980a_()) {
            throw mo12661a((IOException) null);
        }
    }
}
