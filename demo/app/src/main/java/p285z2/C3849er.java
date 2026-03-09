package p285z2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z2.er */
/* JADX INFO: loaded from: classes2.dex */
public final class C3849er {
    private final List<C3812dr> OooO00o;
    private final int OooO0O0;
    private final boolean OooO0OO;

    public C3849er(List<C3812dr> list, int i, boolean z) {
        this.OooO00o = new ArrayList(list);
        this.OooO0O0 = i;
        this.OooO0OO = z;
    }

    public final List<C3812dr> OooO00o() {
        return this.OooO00o;
    }

    public final int OooO0O0() {
        return this.OooO0O0;
    }

    public final boolean OooO0OO(List<C3812dr> list) {
        return this.OooO00o.equals(list);
    }

    public final boolean OooO0Oo() {
        return this.OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3849er)) {
            return false;
        }
        C3849er c3849er = (C3849er) obj;
        return this.OooO00o.equals(c3849er.OooO00o()) && this.OooO0OO == c3849er.OooO0OO;
    }

    public final int hashCode() {
        return this.OooO00o.hashCode() ^ Boolean.valueOf(this.OooO0OO).hashCode();
    }

    public final String toString() {
        return "{ " + this.OooO00o + " }";
    }
}
