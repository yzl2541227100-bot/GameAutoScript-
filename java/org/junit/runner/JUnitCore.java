package org.junit.runner;

import junit.runner.Version;
import p285z2.InterfaceC3854ew;
import p285z2.e90;
import p285z2.f90;
import p285z2.m70;
import p285z2.q60;
import p285z2.s60;
import p285z2.t60;
import p285z2.t80;
import p285z2.x80;
import p285z2.z80;

/* JADX INFO: loaded from: classes2.dex */
public class JUnitCore {
    private final f90 OooO00o = new f90();

    public static t80 OooO0O0() {
        return new t80();
    }

    public static Result OooOO0(t80 t80Var, Class<?>... clsArr) {
        return new JUnitCore().OooO0o(t80Var, clsArr);
    }

    public static Result OooOO0O(Class<?>... clsArr) {
        return OooOO0(OooO0O0(), clsArr);
    }

    public static void main(String... strArr) {
        System.exit(!new JUnitCore().OooOO0o(new s60(), strArr).wasSuccessful() ? 1 : 0);
    }

    public Result OooO(Class<?>... clsArr) {
        return OooO0o(OooO0O0(), clsArr);
    }

    public void OooO00o(e90 e90Var) {
        this.OooO00o.OooO0Oo(e90Var);
    }

    public String OooO0OO() {
        return Version.OooO00o();
    }

    public void OooO0Oo(e90 e90Var) {
        this.OooO00o.OooOOO(e90Var);
    }

    public Result OooO0o(t80 t80Var, Class<?>... clsArr) {
        return OooO0oO(x80.OooO0OO(t80Var, clsArr));
    }

    public Result OooO0o0(InterfaceC3854ew interfaceC3854ew) {
        return OooO0oo(new m70(interfaceC3854ew));
    }

    public Result OooO0oO(x80 x80Var) {
        return OooO0oo(x80Var.OooO0oo());
    }

    public Result OooO0oo(z80 z80Var) {
        Result result = new Result();
        e90 e90VarCreateListener = result.createListener();
        this.OooO00o.OooO0OO(e90VarCreateListener);
        try {
            this.OooO00o.OooOO0O(z80Var.getDescription());
            z80Var.OooO00o(this.OooO00o);
            this.OooO00o.OooOO0(result);
            return result;
        } finally {
            OooO0Oo(e90VarCreateListener);
        }
    }

    public Result OooOO0o(q60 q60Var, String... strArr) {
        q60Var.OooO00o().println("JUnit version " + Version.OooO00o());
        JUnitCommandLineParseResult jUnitCommandLineParseResultOooO0oO = JUnitCommandLineParseResult.OooO0oO(strArr);
        OooO00o(new t60(q60Var));
        return OooO0oO(jUnitCommandLineParseResultOooO0oO.OooO0OO(OooO0O0()));
    }
}
