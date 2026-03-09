package junit.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import p285z2.C3743bw;
import p285z2.C3780cw;
import p285z2.C4002iw;
import p285z2.C4039jw;
import p285z2.InterfaceC3854ew;
import p285z2.e90;
import p285z2.f90;

/* JADX INFO: loaded from: classes2.dex */
public class JUnit4TestAdapterCache extends HashMap<Description, InterfaceC3854ew> {
    private static final JUnit4TestAdapterCache fInstance = new JUnit4TestAdapterCache();
    private static final long serialVersionUID = 1;

    public class OooO00o extends e90 {
        public final /* synthetic */ C4002iw OooO00o;

        public OooO00o(C4002iw c4002iw) {
            this.OooO00o = c4002iw;
        }

        @Override // p285z2.e90
        public void OooO0O0(Failure failure) throws Exception {
            this.OooO00o.OooO00o(JUnit4TestAdapterCache.this.asTest(failure.getDescription()), failure.getException());
        }

        @Override // p285z2.e90
        public void OooO0OO(Description description) throws Exception {
            this.OooO00o.OooO0o0(JUnit4TestAdapterCache.this.asTest(description));
        }

        @Override // p285z2.e90
        public void OooO0oO(Description description) throws Exception {
            this.OooO00o.OooOOOO(JUnit4TestAdapterCache.this.asTest(description));
        }
    }

    public static JUnit4TestAdapterCache getDefault() {
        return fInstance;
    }

    public InterfaceC3854ew asTest(Description description) {
        if (description.isSuite()) {
            return createTest(description);
        }
        if (!containsKey(description)) {
            put(description, createTest(description));
        }
        return get(description);
    }

    public List<InterfaceC3854ew> asTestList(Description description) {
        if (description.isTest()) {
            return Arrays.asList(asTest(description));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            arrayList.add(asTest(it.next()));
        }
        return arrayList;
    }

    public InterfaceC3854ew createTest(Description description) {
        if (description.isTest()) {
            return new C3780cw(description);
        }
        C4039jw c4039jw = new C4039jw(description.getDisplayName());
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            c4039jw.OooO0OO(asTest(it.next()));
        }
        return c4039jw;
    }

    public f90 getNotifier(C4002iw c4002iw, C3743bw c3743bw) {
        f90 f90Var = new f90();
        f90Var.OooO0Oo(new OooO00o(c4002iw));
        return f90Var;
    }
}
