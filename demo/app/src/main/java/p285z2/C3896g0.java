package p285z2;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: z2.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C3896g0 implements InterfaceC4155n0 {
    private final Set<InterfaceC4229p0> OooO00o = Collections.newSetFromMap(new WeakHashMap());
    private boolean OooO0O0;
    private boolean OooO0OO;

    @Override // p285z2.InterfaceC4155n0
    public void OooO00o(@NonNull InterfaceC4229p0 interfaceC4229p0) {
        this.OooO00o.add(interfaceC4229p0);
        if (this.OooO0OO) {
            interfaceC4229p0.onDestroy();
        } else if (this.OooO0O0) {
            interfaceC4229p0.onStart();
        } else {
            interfaceC4229p0.onStop();
        }
    }

    @Override // p285z2.InterfaceC4155n0
    public void OooO0O0(@NonNull InterfaceC4229p0 interfaceC4229p0) {
        this.OooO00o.remove(interfaceC4229p0);
    }

    public void OooO0OO() {
        this.OooO0OO = true;
        Iterator it = C4379t2.OooOO0O(this.OooO00o).iterator();
        while (it.hasNext()) {
            ((InterfaceC4229p0) it.next()).onDestroy();
        }
    }

    public void OooO0Oo() {
        this.OooO0O0 = true;
        Iterator it = C4379t2.OooOO0O(this.OooO00o).iterator();
        while (it.hasNext()) {
            ((InterfaceC4229p0) it.next()).onStart();
        }
    }

    public void OooO0o0() {
        this.OooO0O0 = false;
        Iterator it = C4379t2.OooOO0O(this.OooO00o).iterator();
        while (it.hasNext()) {
            ((InterfaceC4229p0) it.next()).onStop();
        }
    }
}
