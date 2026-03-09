package p285z2;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public class i90 extends l90<q90> {
    private final ConcurrentHashMap<q90, Description> OooO0o;

    public class OooO00o extends u70 {
        public OooO00o() throws Exception {
        }

        @Override // p285z2.u70
        public Object OooO0O0() throws Throwable {
            return i90.this.Oooo00O();
        }
    }

    public i90(Class<?> cls) throws InitializationError {
        super(cls);
        this.OooO0o = new ConcurrentHashMap<>();
    }

    private boolean Oooo0(Test test) {
        return Oooo0O0(test) != null;
    }

    private Class<? extends Throwable> Oooo0O0(Test test) {
        if (test == null || test.expected() == Test.None.class) {
            return null;
        }
        return test.expected();
    }

    private List<i80> Oooo0OO(Object obj) {
        return OoooO0O(obj);
    }

    private long Oooo0o(Test test) {
        if (test == null) {
            return 0L;
        }
        return test.timeout();
    }

    private boolean Oooo0oO() {
        return OooOOoo().OooOO0o().getConstructors().length == 1;
    }

    private void OoooOo0(List<Throwable> list) {
        v70.OooO0oO.OooO(OooOOoo(), list);
    }

    private u90 OooooOo(q90 q90Var, List<o80> list, Object obj, u90 u90Var) {
        for (i80 i80Var : Oooo0OO(obj)) {
            if (!list.contains(i80Var)) {
                u90Var = i80Var.OooO00o(u90Var, q90Var, obj);
            }
        }
        return u90Var;
    }

    private u90 Oooooo(q90 q90Var, Object obj, u90 u90Var) {
        List<o80> listOooo0o0 = Oooo0o0(obj);
        return OoooooO(q90Var, listOooo0o0, OooooOo(q90Var, listOooo0o0, obj, u90Var));
    }

    private u90 OoooooO(q90 q90Var, List<o80> list, u90 u90Var) {
        return list.isEmpty() ? u90Var : new k80(u90Var, list, OooOOO(q90Var));
    }

    @Override // p285z2.l90
    public void OooOO0O(List<Throwable> list) {
        super.OooOO0O(list);
        OoooOoO(list);
        o000oOoO(list);
        OoooOOo(list);
        OoooOOO(list);
        OoooOo0(list);
    }

    @Override // p285z2.l90
    public List<q90> OooOOOO() {
        return Oooo000();
    }

    public u90 Oooo(q90 q90Var) {
        try {
            Object objOooO00o = new OooO00o().OooO00o();
            return Oooooo(q90Var, objOooO00o, OooooO0(q90Var, objOooO00o, OooooOO(q90Var, objOooO00o, Oooooo0(q90Var, objOooO00o, OoooO0(q90Var, objOooO00o, OoooO00(q90Var, objOooO00o))))));
        } catch (Throwable th) {
            return new x70(th);
        }
    }

    public List<q90> Oooo000() {
        return OooOOoo().OooOO0O(Test.class);
    }

    public Object Oooo00O() throws Exception {
        return OooOOoo().OooOOO().newInstance(new Object[0]);
    }

    @Override // p285z2.l90
    /* JADX INFO: renamed from: Oooo00o */
    public Description OooOOO(q90 q90Var) {
        Description description = this.OooO0o.get(q90Var);
        if (description != null) {
            return description;
        }
        Description descriptionCreateTestDescription = Description.createTestDescription(OooOOoo().OooOO0o(), OoooOO0(q90Var), q90Var.OooO0O0());
        this.OooO0o.putIfAbsent(q90Var, descriptionCreateTestDescription);
        return descriptionCreateTestDescription;
    }

    public List<o80> Oooo0o0(Object obj) {
        List<o80> listOooO = OooOOoo().OooO(obj, k50.class, o80.class);
        listOooO.addAll(OooOOoo().OooO0o0(obj, k50.class, o80.class));
        return listOooO;
    }

    @Override // p285z2.l90
    /* JADX INFO: renamed from: Oooo0oo */
    public boolean OooOo00(q90 q90Var) {
        return q90Var.OooO00o(j50.class) != null;
    }

    @Override // p285z2.l90
    /* JADX INFO: renamed from: OoooO */
    public void OooOo0(q90 q90Var, f90 f90Var) {
        Description descriptionOooOOO = OooOOO(q90Var);
        if (OooOo00(q90Var)) {
            f90Var.OooO(descriptionOooOOO);
        } else {
            OooOo0o(Oooo(q90Var), descriptionOooOOO, f90Var);
        }
    }

    public u90 OoooO0(q90 q90Var, Object obj, u90 u90Var) {
        Test test = (Test) q90Var.OooO00o(Test.class);
        return Oooo0(test) ? new w70(u90Var, Oooo0O0(test)) : u90Var;
    }

    public u90 OoooO00(q90 q90Var, Object obj) {
        return new z70(q90Var, obj);
    }

    public List<i80> OoooO0O(Object obj) {
        List<i80> listOooO = OooOOoo().OooO(obj, k50.class, i80.class);
        listOooO.addAll(OooOOoo().OooO0o0(obj, k50.class, i80.class));
        return listOooO;
    }

    public String OoooOO0(q90 q90Var) {
        return q90Var.OooO0o0();
    }

    public void OoooOOO(List<Throwable> list) {
        v70.OooO0o0.OooO(OooOOoo(), list);
    }

    @Deprecated
    public void OoooOOo(List<Throwable> list) {
        OooOoo0(b50.class, false, list);
        OooOoo0(f50.class, false, list);
        Ooooo00(list);
        if (Oooo000().size() == 0) {
            list.add(new Exception("No runnable methods"));
        }
    }

    public void OoooOoO(List<Throwable> list) {
        if (OooOOoo().OooOOo0()) {
            list.add(new Exception("The inner class " + OooOOoo().OooOOO0() + " is not static."));
        }
    }

    public void OoooOoo(List<Throwable> list) {
        if (Oooo0oO()) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public constructor"));
    }

    public void Ooooo00(List<Throwable> list) {
        OooOoo0(Test.class, false, list);
    }

    public void Ooooo0o(List<Throwable> list) {
        if (OooOOoo().OooOOo0() || !Oooo0oO() || OooOOoo().OooOOO().getParameterTypes().length == 0) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
    }

    public u90 OooooO0(q90 q90Var, Object obj, u90 u90Var) {
        List<q90> listOooOO0O = OooOOoo().OooOO0O(b50.class);
        return listOooOO0O.isEmpty() ? u90Var : new a80(u90Var, listOooOO0O, obj);
    }

    public u90 OooooOO(q90 q90Var, Object obj, u90 u90Var) {
        List<q90> listOooOO0O = OooOOoo().OooOO0O(f50.class);
        return listOooOO0O.isEmpty() ? u90Var : new b80(u90Var, listOooOO0O, obj);
    }

    @Deprecated
    public u90 Oooooo0(q90 q90Var, Object obj, u90 u90Var) {
        long jOooo0o = Oooo0o((Test) q90Var.OooO00o(Test.class));
        return jOooo0o <= 0 ? u90Var : y70.OooO0OO().OooO0o(jOooo0o, TimeUnit.MILLISECONDS).OooO0Oo(u90Var);
    }

    public void o000oOoO(List<Throwable> list) {
        OoooOoo(list);
        Ooooo0o(list);
    }
}
