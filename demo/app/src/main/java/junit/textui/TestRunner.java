package junit.textui;

import java.io.PrintStream;
import junit.runner.Version;
import p285z2.AbstractC3891fw;
import p285z2.AbstractC4076kw;
import p285z2.C4002iw;
import p285z2.C4039jw;
import p285z2.C4150mw;
import p285z2.InterfaceC3854ew;

/* JADX INFO: loaded from: classes2.dex */
public class TestRunner extends AbstractC4076kw {
    public static final int OooO = 2;
    public static final int OooO0oO = 0;
    public static final int OooO0oo = 1;
    private C4150mw OooO0o;

    public TestRunner() {
        this(System.out);
    }

    public TestRunner(PrintStream printStream) {
        this(new C4150mw(printStream));
    }

    public TestRunner(C4150mw c4150mw) {
        this.OooO0o = c4150mw;
    }

    public static void Oooo0(Class<? extends AbstractC3891fw> cls) {
        Oooo00o(new C4039jw(cls));
    }

    public static C4002iw Oooo00o(InterfaceC3854ew interfaceC3854ew) {
        return new TestRunner().OooOooo(interfaceC3854ew);
    }

    public static void Oooo0O0(InterfaceC3854ew interfaceC3854ew) {
        new TestRunner().Oooo000(interfaceC3854ew, true);
    }

    public static void main(String[] strArr) {
        try {
            if (!new TestRunner().Oooo0o(strArr).OooOOo0()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(2);
        }
    }

    @Override // p285z2.AbstractC4076kw
    public void OooOOoo(String str) {
        System.err.println(str);
        System.exit(1);
    }

    @Override // p285z2.AbstractC4076kw
    public void OooOoO(int i, InterfaceC3854ew interfaceC3854ew, Throwable th) {
    }

    @Override // p285z2.AbstractC4076kw
    public void OooOoO0(String str) {
    }

    @Override // p285z2.AbstractC4076kw
    public void OooOoOO(String str) {
    }

    public C4002iw OooOooO() {
        return new C4002iw();
    }

    public C4002iw OooOooo(InterfaceC3854ew interfaceC3854ew) {
        return Oooo000(interfaceC3854ew, false);
    }

    public C4002iw Oooo000(InterfaceC3854ew interfaceC3854ew, boolean z) {
        C4002iw c4002iwOooOooO = OooOooO();
        c4002iwOooOooO.OooO0OO(this.OooO0o);
        long jCurrentTimeMillis = System.currentTimeMillis();
        interfaceC3854ew.OooO0O0(c4002iwOooOooO);
        this.OooO0o.OooO0oO(c4002iwOooOooO, System.currentTimeMillis() - jCurrentTimeMillis);
        Oooo00O(z);
        return c4002iwOooOooO;
    }

    public void Oooo00O(boolean z) {
        if (z) {
            this.OooO0o.OooOOOo();
            try {
                System.in.read();
            } catch (Exception unused) {
            }
        }
    }

    public C4002iw Oooo0OO(String str, String str2, boolean z) throws Exception {
        return Oooo000(C4039jw.OooO0oO(OooOOOo(str).asSubclass(AbstractC3891fw.class), str2), z);
    }

    public C4002iw Oooo0o(String[] strArr) throws Exception {
        String strOooO0oO = "";
        String strSubstring = strOooO0oO;
        int i = 0;
        boolean z = false;
        while (i < strArr.length) {
            if (strArr[i].equals("-wait")) {
                z = true;
            } else if (strArr[i].equals("-c")) {
                i++;
                strOooO0oO = OooO0oO(strArr[i]);
            } else if (strArr[i].equals("-m")) {
                i++;
                String str = strArr[i];
                int iLastIndexOf = str.lastIndexOf(46);
                String strSubstring2 = str.substring(0, iLastIndexOf);
                strSubstring = str.substring(iLastIndexOf + 1);
                strOooO0oO = strSubstring2;
            } else if (strArr[i].equals("-v")) {
                System.err.println("JUnit " + Version.OooO00o() + " by Kent Beck and Erich Gamma");
            } else {
                strOooO0oO = strArr[i];
            }
            i++;
        }
        if (strOooO0oO.equals("")) {
            throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
        }
        try {
            return !strSubstring.equals("") ? Oooo0OO(strOooO0oO, strSubstring, z) : Oooo000(OooOOOO(strOooO0oO), z);
        } catch (Exception e) {
            throw new Exception("Could not create and run test suite: " + e);
        }
    }

    public void Oooo0o0(C4150mw c4150mw) {
        this.OooO0o = c4150mw;
    }
}
