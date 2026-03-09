package p285z2;

import java.lang.management.ManagementFactory;
import java.util.List;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public class d80 implements o80 {
    private final o80 OooO00o;
    private final boolean OooO0O0;

    public d80(o80 o80Var) {
        this(o80Var, ManagementFactory.getRuntimeMXBean().getInputArguments());
    }

    public d80(o80 o80Var, List<String> list) {
        this.OooO00o = o80Var;
        this.OooO0O0 = OooO0OO(list);
    }

    private static boolean OooO0OO(List<String> list) {
        for (String str : list) {
            if ("-Xdebug".equals(str) || str.startsWith("-agentlib:jdwp")) {
                return true;
            }
        }
        return false;
    }

    @Override // p285z2.o80
    public u90 OooO00o(u90 u90Var, Description description) {
        return this.OooO0O0 ? u90Var : this.OooO00o.OooO00o(u90Var, description);
    }

    public boolean OooO0O0() {
        return this.OooO0O0;
    }
}
