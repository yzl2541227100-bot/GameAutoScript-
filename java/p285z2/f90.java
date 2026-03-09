package p285z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.StoppedByUserException;
import p285z2.e90;

/* JADX INFO: loaded from: classes2.dex */
public class f90 {
    private final List<e90> OooO00o = new CopyOnWriteArrayList();
    private volatile boolean OooO0O0 = false;

    public class OooO extends OooOOO0 {
        public final /* synthetic */ Failure OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Failure failure) {
            super(f90.this);
            this.OooO0OO = failure;
        }

        @Override // z2.f90.OooOOO0
        public void OooO00o(e90 e90Var) throws Exception {
            e90Var.OooO00o(this.OooO0OO);
        }
    }

    public class OooO00o extends OooOOO0 {
        public final /* synthetic */ Description OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Description description) throws Exception {
            super(f90.this);
            this.OooO0OO = description;
        }

        @Override // z2.f90.OooOOO0
        public void OooO00o(e90 e90Var) throws Exception {
            e90Var.OooO0o(this.OooO0OO);
        }
    }

    public class OooO0O0 extends OooOOO0 {
        public final /* synthetic */ Result OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Result result) throws Exception {
            super(f90.this);
            this.OooO0OO = result;
        }

        @Override // z2.f90.OooOOO0
        public void OooO00o(e90 e90Var) throws Exception {
            e90Var.OooO0o0(this.OooO0OO);
        }
    }

    public class OooO0OO extends OooOOO0 {
        public final /* synthetic */ Description OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Description description) throws Exception {
            super(f90.this);
            this.OooO0OO = description;
        }

        @Override // z2.f90.OooOOO0
        public void OooO00o(e90 e90Var) throws Exception {
            e90Var.OooO0oO(this.OooO0OO);
        }
    }

    public class OooO0o extends OooOOO0 {
        public final /* synthetic */ List OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(List list, List list2) throws Exception {
            super(list);
            this.OooO0OO = list2;
        }

        @Override // z2.f90.OooOOO0
        public void OooO00o(e90 e90Var) throws Exception {
            Iterator it = this.OooO0OO.iterator();
            while (it.hasNext()) {
                e90Var.OooO0O0((Failure) it.next());
            }
        }
    }

    public class OooOO0 extends OooOOO0 {
        public final /* synthetic */ Description OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Description description) throws Exception {
            super(f90.this);
            this.OooO0OO = description;
        }

        @Override // z2.f90.OooOOO0
        public void OooO00o(e90 e90Var) throws Exception {
            e90Var.OooO0Oo(this.OooO0OO);
        }
    }

    public class OooOO0O extends OooOOO0 {
        public final /* synthetic */ Description OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Description description) throws Exception {
            super(f90.this);
            this.OooO0OO = description;
        }

        @Override // z2.f90.OooOOO0
        public void OooO00o(e90 e90Var) throws Exception {
            e90Var.OooO0OO(this.OooO0OO);
        }
    }

    public abstract class OooOOO0 {
        private final List<e90> OooO00o;

        public OooOOO0(f90 f90Var) {
            this(f90Var.OooO00o);
        }

        public OooOOO0(List<e90> list) {
            this.OooO00o = list;
        }

        public abstract void OooO00o(e90 e90Var) throws Exception;

        public void OooO0O0() {
            int size = this.OooO00o.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (e90 e90Var : this.OooO00o) {
                try {
                    OooO00o(e90Var);
                    arrayList.add(e90Var);
                } catch (Exception e) {
                    arrayList2.add(new Failure(Description.TEST_MECHANISM, e));
                }
            }
            f90.this.OooO0oO(arrayList, arrayList2);
        }
    }

    public void OooO0oO(List<e90> list, List<Failure> list2) {
        if (list2.isEmpty()) {
            return;
        }
        new OooO0o(list, list2).OooO0O0();
    }

    public void OooO(Description description) {
        new OooOO0(description).OooO0O0();
    }

    public void OooO0OO(e90 e90Var) {
        Objects.requireNonNull(e90Var, "Cannot add a null listener");
        this.OooO00o.add(0, OooOOOO(e90Var));
    }

    public void OooO0Oo(e90 e90Var) {
        Objects.requireNonNull(e90Var, "Cannot add a null listener");
        this.OooO00o.add(OooOOOO(e90Var));
    }

    public void OooO0o(Failure failure) {
        OooO0oO(this.OooO00o, Arrays.asList(failure));
    }

    public void OooO0o0(Failure failure) {
        new OooO(failure).OooO0O0();
    }

    public void OooO0oo(Description description) {
        new OooOO0O(description).OooO0O0();
    }

    public void OooOO0(Result result) {
        new OooO0O0(result).OooO0O0();
    }

    public void OooOO0O(Description description) {
        new OooO00o(description).OooO0O0();
    }

    public void OooOO0o(Description description) throws StoppedByUserException {
        if (this.OooO0O0) {
            throw new StoppedByUserException();
        }
        new OooO0OO(description).OooO0O0();
    }

    public void OooOOO(e90 e90Var) {
        Objects.requireNonNull(e90Var, "Cannot remove a null listener");
        this.OooO00o.remove(OooOOOO(e90Var));
    }

    public void OooOOO0() {
        this.OooO0O0 = true;
    }

    public e90 OooOOOO(e90 e90Var) {
        return e90Var.getClass().isAnnotationPresent(e90.OooO00o.class) ? e90Var : new g90(e90Var, this);
    }
}
