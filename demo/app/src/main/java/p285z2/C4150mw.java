package p285z2;

import com.googlecode.tesseract.android.TessBaseAPI;
import com.umeng.commonsdk.proguard.C3471v;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Enumeration;
import junit.framework.AssertionFailedError;
import p285z2.C4196o4;

/* JADX INFO: renamed from: z2.mw */
/* JADX INFO: loaded from: classes2.dex */
public class C4150mw implements InterfaceC3965hw {
    public PrintStream OooO00o;
    public int OooO0O0 = 0;

    public C4150mw(PrintStream printStream) {
        this.OooO00o = printStream;
    }

    public void OooO(C3928gw c3928gw, int i) {
        OooO0o().print(i + ") " + c3928gw.OooO0O0());
    }

    @Override // p285z2.InterfaceC3965hw
    public void OooO00o(InterfaceC3854ew interfaceC3854ew, Throwable th) {
        OooO0o().print("E");
    }

    @Override // p285z2.InterfaceC3965hw
    public void OooO0O0(InterfaceC3854ew interfaceC3854ew, AssertionFailedError assertionFailedError) {
        OooO0o().print(TessBaseAPI.OooO0oo);
    }

    @Override // p285z2.InterfaceC3965hw
    public void OooO0OO(InterfaceC3854ew interfaceC3854ew) {
    }

    @Override // p285z2.InterfaceC3965hw
    public void OooO0Oo(InterfaceC3854ew interfaceC3854ew) {
        OooO0o().print(".");
        int i = this.OooO0O0;
        this.OooO0O0 = i + 1;
        if (i >= 40) {
            OooO0o().println();
            this.OooO0O0 = 0;
        }
    }

    public PrintStream OooO0o() {
        return this.OooO00o;
    }

    public String OooO0o0(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    public synchronized void OooO0oO(C4002iw c4002iw, long j) {
        OooOOOO(j);
        OooOO0o(c4002iw);
        OooOOO0(c4002iw);
        OooOOO(c4002iw);
    }

    public void OooO0oo(C3928gw c3928gw, int i) {
        OooO(c3928gw, i);
        OooOO0(c3928gw);
    }

    public void OooOO0(C3928gw c3928gw) {
        OooO0o().print(AbstractC4076kw.OooO(c3928gw.OooO0o0()));
    }

    public void OooOO0O(Enumeration<C3928gw> enumeration, int i, String str) {
        StringBuilder sb;
        String str2;
        if (i == 0) {
            return;
        }
        PrintStream printStreamOooO0o = OooO0o();
        if (i == 1) {
            sb = new StringBuilder();
            sb.append("There was ");
            sb.append(i);
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(str);
            str2 = ":";
        } else {
            sb = new StringBuilder();
            sb.append("There were ");
            sb.append(i);
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(str);
            str2 = "s:";
        }
        sb.append(str2);
        printStreamOooO0o.println(sb.toString());
        int i2 = 1;
        while (enumeration.hasMoreElements()) {
            OooO0oo(enumeration.nextElement(), i2);
            i2++;
        }
    }

    public void OooOO0o(C4002iw c4002iw) {
        OooOO0O(c4002iw.OooO0oO(), c4002iw.OooO0o(), "error");
    }

    public void OooOOO(C4002iw c4002iw) {
        PrintStream printStreamOooO0o;
        StringBuilder sb;
        if (c4002iw.OooOOo0()) {
            OooO0o().println();
            OooO0o().print("OK");
            printStreamOooO0o = OooO0o();
            sb = new StringBuilder();
            sb.append(" (");
            sb.append(c4002iw.OooOO0o());
            sb.append(" test");
            sb.append(c4002iw.OooOO0o() == 1 ? "" : C3471v.f18958al);
            sb.append(")");
        } else {
            OooO0o().println();
            OooO0o().println("FAILURES!!!");
            printStreamOooO0o = OooO0o();
            sb = new StringBuilder();
            sb.append("Tests run: ");
            sb.append(c4002iw.OooOO0o());
            sb.append(",  Failures: ");
            sb.append(c4002iw.OooO0oo());
            sb.append(",  Errors: ");
            sb.append(c4002iw.OooO0o());
        }
        printStreamOooO0o.println(sb.toString());
        OooO0o().println();
    }

    public void OooOOO0(C4002iw c4002iw) {
        OooOO0O(c4002iw.OooO(), c4002iw.OooO0oo(), "failure");
    }

    public void OooOOOO(long j) {
        OooO0o().println();
        OooO0o().println("Time: " + OooO0o0(j));
    }

    public void OooOOOo() {
        OooO0o().println();
        OooO0o().println("<RETURN> to continue");
    }
}
