package p285z2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class da0 implements ea0 {
    private static final List<Exception> OooO00o = Collections.emptyList();

    @Override // p285z2.ea0
    public List<Exception> OooO00o(v90 v90Var) {
        if (v90Var.OooOOo()) {
            return OooO00o;
        }
        return Collections.singletonList(new Exception("The class " + v90Var.OooOOO0() + " is not public."));
    }
}
