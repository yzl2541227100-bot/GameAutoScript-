package p285z2;

import java.io.PrintWriter;
import java.io.StringWriter;
import junit.framework.AssertionFailedError;

/* JADX INFO: renamed from: z2.gw */
/* JADX INFO: loaded from: classes2.dex */
public class C3928gw {
    public InterfaceC3854ew OooO00o;
    public Throwable OooO0O0;

    public C3928gw(InterfaceC3854ew interfaceC3854ew, Throwable th) {
        this.OooO00o = interfaceC3854ew;
        this.OooO0O0 = th;
    }

    public String OooO00o() {
        return OooO0Oo().getMessage();
    }

    public InterfaceC3854ew OooO0O0() {
        return this.OooO00o;
    }

    public boolean OooO0OO() {
        return OooO0Oo() instanceof AssertionFailedError;
    }

    public Throwable OooO0Oo() {
        return this.OooO0O0;
    }

    public String OooO0o0() {
        StringWriter stringWriter = new StringWriter();
        OooO0Oo().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public String toString() {
        return this.OooO00o + ": " + this.OooO0O0.getMessage();
    }
}
