package com.p188b.p189a.p190a.p194d;

import com.p188b.p189a.C2526ac;
import com.p188b.p189a.p190a.C2446c;
import com.p188b.p189a.p190a.p193c.C2452f;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.InterfaceC2597x;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.b.a.a.d.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2464d extends AbstractC2462b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2461a f15227d;

    /* JADX INFO: renamed from: e */
    private final C2526ac f15228e;

    /* JADX INFO: renamed from: f */
    private long f15229f;

    /* JADX INFO: renamed from: g */
    private boolean f15230g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2464d(C2461a c2461a, C2526ac c2526ac) {
        super(c2461a, (byte) 0);
        this.f15227d = c2461a;
        this.f15229f = -1L;
        this.f15230g = true;
        this.f15228e = c2526ac;
    }

    @Override // com.p188b.p199b.InterfaceC2597x
    /* JADX INFO: renamed from: a */
    public final long mo12513a(C2579f c2579f, long j) throws ProtocolException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.f15222b) {
            throw new IllegalStateException("closed");
        }
        if (!this.f15230g) {
            return -1L;
        }
        long j2 = this.f15229f;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                this.f15227d.f15218c.mo13036m();
            }
            try {
                this.f15229f = this.f15227d.f15218c.mo13032j();
                String strTrim = this.f15227d.f15218c.mo13036m().trim();
                if (this.f15229f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f15229f + strTrim + "\"");
                }
                if (this.f15229f == 0) {
                    this.f15230g = false;
                    C2452f.m12607a(this.f15227d.f15216a.m12843f(), this.f15228e, this.f15227d.m12630c());
                    m12631a(true);
                }
                if (!this.f15230g) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long jMo12513a = this.f15227d.f15218c.mo12513a(c2579f, Math.min(j, this.f15229f));
        if (jMo12513a != -1) {
            this.f15229f -= jMo12513a;
            return jMo12513a;
        }
        m12631a(false);
        throw new ProtocolException("unexpected end of stream");
    }

    @Override // com.p188b.p199b.InterfaceC2597x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f15222b) {
            return;
        }
        if (this.f15230g && !C2446c.m12585a((InterfaceC2597x) this, TimeUnit.MILLISECONDS)) {
            m12631a(false);
        }
        this.f15222b = true;
    }
}
