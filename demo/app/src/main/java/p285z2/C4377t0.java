package p285z2;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: z2.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C4377t0 {
    private static final String OooO0Oo = "RequestTracker";
    private final Set<InterfaceC4082l1> OooO00o = Collections.newSetFromMap(new WeakHashMap());
    private final List<InterfaceC4082l1> OooO0O0 = new ArrayList();
    private boolean OooO0OO;

    private boolean OooO0O0(@Nullable InterfaceC4082l1 interfaceC4082l1, boolean z) {
        boolean z3 = true;
        if (interfaceC4082l1 == null) {
            return true;
        }
        boolean zRemove = this.OooO00o.remove(interfaceC4082l1);
        if (!this.OooO0O0.remove(interfaceC4082l1) && !zRemove) {
            z3 = false;
        }
        if (z3) {
            interfaceC4082l1.clear();
            if (z) {
                interfaceC4082l1.recycle();
            }
        }
        return z3;
    }

    public void OooO() {
        this.OooO0OO = false;
        for (InterfaceC4082l1 interfaceC4082l1 : C4379t2.OooOO0O(this.OooO00o)) {
            if (!interfaceC4082l1.OooOO0O() && !interfaceC4082l1.isRunning()) {
                interfaceC4082l1.OooO();
            }
        }
        this.OooO0O0.clear();
    }

    @VisibleForTesting
    public void OooO00o(InterfaceC4082l1 interfaceC4082l1) {
        this.OooO00o.add(interfaceC4082l1);
    }

    public boolean OooO0OO(@Nullable InterfaceC4082l1 interfaceC4082l1) {
        return OooO0O0(interfaceC4082l1, true);
    }

    public void OooO0Oo() {
        Iterator it = C4379t2.OooOO0O(this.OooO00o).iterator();
        while (it.hasNext()) {
            OooO0O0((InterfaceC4082l1) it.next(), false);
        }
        this.OooO0O0.clear();
    }

    public void OooO0o() {
        this.OooO0OO = true;
        for (InterfaceC4082l1 interfaceC4082l1 : C4379t2.OooOO0O(this.OooO00o)) {
            if (interfaceC4082l1.isRunning() || interfaceC4082l1.OooOO0O()) {
                interfaceC4082l1.clear();
                this.OooO0O0.add(interfaceC4082l1);
            }
        }
    }

    public boolean OooO0o0() {
        return this.OooO0OO;
    }

    public void OooO0oO() {
        this.OooO0OO = true;
        for (InterfaceC4082l1 interfaceC4082l1 : C4379t2.OooOO0O(this.OooO00o)) {
            if (interfaceC4082l1.isRunning()) {
                interfaceC4082l1.clear();
                this.OooO0O0.add(interfaceC4082l1);
            }
        }
    }

    public void OooO0oo() {
        for (InterfaceC4082l1 interfaceC4082l1 : C4379t2.OooOO0O(this.OooO00o)) {
            if (!interfaceC4082l1.OooOO0O() && !interfaceC4082l1.OooO0o()) {
                interfaceC4082l1.clear();
                if (this.OooO0OO) {
                    this.OooO0O0.add(interfaceC4082l1);
                } else {
                    interfaceC4082l1.OooO();
                }
            }
        }
    }

    public void OooOO0(@NonNull InterfaceC4082l1 interfaceC4082l1) {
        this.OooO00o.add(interfaceC4082l1);
        if (!this.OooO0OO) {
            interfaceC4082l1.OooO();
            return;
        }
        interfaceC4082l1.clear();
        if (Log.isLoggable(OooO0Oo, 2)) {
            Log.v(OooO0Oo, "Paused, delaying request");
        }
        this.OooO0O0.add(interfaceC4082l1);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.OooO00o.size() + ", isPaused=" + this.OooO0OO + "}";
    }
}
