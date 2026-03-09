package com.p188b.p199b;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.b.b.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2590q extends C2573a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Socket f15842a;

    public C2590q(Socket socket) {
        this.f15842a = socket;
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
        Level level;
        StringBuilder sb;
        Logger logger;
        Throwable th;
        try {
            this.f15842a.close();
        } catch (AssertionError e) {
            if (!C2587n.m13074a(e)) {
                throw e;
            }
            Logger logger2 = C2587n.f15837a;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            th = e;
            logger = logger2;
            sb.append(this.f15842a);
            logger.log(level, sb.toString(), th);
        } catch (Exception e2) {
            Logger logger3 = C2587n.f15837a;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            th = e2;
            logger = logger3;
            sb.append(this.f15842a);
            logger.log(level, sb.toString(), th);
        }
    }
}
