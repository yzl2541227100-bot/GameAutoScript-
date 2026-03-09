package p285z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class z90 {
    private final String OooO00o;
    private final v90 OooO0O0;
    private final List<Object> OooO0OO;

    public z90(String str, v90 v90Var, List<Object> list) {
        OooO0Oo(str, "The name is missing.");
        OooO0Oo(v90Var, "The test class is missing.");
        OooO0Oo(list, "The parameters are missing.");
        this.OooO00o = str;
        this.OooO0O0 = v90Var;
        this.OooO0OO = Collections.unmodifiableList(new ArrayList(list));
    }

    private static void OooO0Oo(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }

    public String OooO00o() {
        return this.OooO00o;
    }

    public List<Object> OooO0O0() {
        return this.OooO0OO;
    }

    public v90 OooO0OO() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z90 z90Var = (z90) obj;
        return this.OooO00o.equals(z90Var.OooO00o) && this.OooO0OO.equals(z90Var.OooO0OO) && this.OooO0O0.equals(z90Var.OooO0O0);
    }

    public int hashCode() {
        return ((((this.OooO00o.hashCode() + 14747) * 14747) + this.OooO0O0.hashCode()) * 14747) + this.OooO0OO.hashCode();
    }

    public String toString() {
        return this.OooO0O0.OooOOO0() + " '" + this.OooO00o + "' with parameters " + this.OooO0OO;
    }
}
