package p285z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public class j80 implements o80 {
    private static final j80 OooO0O0 = new j80(Collections.emptyList());
    private List<o80> OooO00o;

    private j80(List<o80> list) {
        this.OooO00o = list;
    }

    public static j80 OooO0OO() {
        return OooO0O0;
    }

    public static j80 OooO0Oo(o80 o80Var) {
        return OooO0OO().OooO0O0(o80Var);
    }

    @Override // p285z2.o80
    public u90 OooO00o(u90 u90Var, Description description) {
        Iterator<o80> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            u90Var = it.next().OooO00o(u90Var, description);
        }
        return u90Var;
    }

    public j80 OooO0O0(o80 o80Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o80Var);
        arrayList.addAll(this.OooO00o);
        return new j80(arrayList);
    }
}
