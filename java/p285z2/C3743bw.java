package p285z2;

import java.util.Iterator;
import java.util.List;
import junit.framework.JUnit4TestAdapterCache;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;

/* JADX INFO: renamed from: z2.bw */
/* JADX INFO: loaded from: classes2.dex */
public class C3743bw implements InterfaceC3854ew, b90, c90, u80 {
    private final Class<?> OooO00o;
    private final z80 OooO0O0;
    private final JUnit4TestAdapterCache OooO0OO;

    public C3743bw(Class<?> cls) {
        this(cls, JUnit4TestAdapterCache.getDefault());
    }

    public C3743bw(Class<?> cls, JUnit4TestAdapterCache jUnit4TestAdapterCache) {
        this.OooO0OO = jUnit4TestAdapterCache;
        this.OooO00o = cls;
        this.OooO0O0 = x80.OooO0O0(cls).OooO0oo();
    }

    private boolean OooO0oO(Description description) {
        return description.getAnnotation(j50.class) != null;
    }

    private Description OooO0oo(Description description) {
        if (OooO0oO(description)) {
            return Description.EMPTY;
        }
        Description descriptionChildlessCopy = description.childlessCopy();
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            Description descriptionOooO0oo = OooO0oo(it.next());
            if (!descriptionOooO0oo.isEmpty()) {
                descriptionChildlessCopy.addChild(descriptionOooO0oo);
            }
        }
        return descriptionChildlessCopy;
    }

    @Override // p285z2.InterfaceC3854ew
    public int OooO00o() {
        return this.OooO0O0.OooO0O0();
    }

    @Override // p285z2.InterfaceC3854ew
    public void OooO0O0(C4002iw c4002iw) {
        this.OooO0O0.OooO00o(this.OooO0OO.getNotifier(c4002iw, this));
    }

    @Override // p285z2.b90
    public void OooO0OO(a90 a90Var) throws NoTestsRemainException {
        a90Var.OooO00o(this.OooO0O0);
    }

    @Override // p285z2.c90
    public void OooO0Oo(d90 d90Var) {
        d90Var.OooO00o(this.OooO0O0);
    }

    public List<InterfaceC3854ew> OooO0o() {
        return this.OooO0OO.asTestList(getDescription());
    }

    public Class<?> OooO0o0() {
        return this.OooO00o;
    }

    @Override // p285z2.u80
    public Description getDescription() {
        return OooO0oo(this.OooO0O0.getDescription());
    }

    public String toString() {
        return this.OooO00o.getName();
    }
}
