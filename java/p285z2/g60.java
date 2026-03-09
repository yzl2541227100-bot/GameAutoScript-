package p285z2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;

/* JADX INFO: loaded from: classes2.dex */
public class g60 {
    private final List<PotentialAssignment> OooO00o;
    private final List<a60> OooO0O0;
    private final v90 OooO0OO;

    private g60(List<PotentialAssignment> list, List<a60> list2, v90 v90Var) {
        this.OooO0O0 = list2;
        this.OooO00o = list;
        this.OooO0OO = v90Var;
    }

    private int OooO() {
        return a60.OooOOOO(this.OooO0OO.OooOOO()).size();
    }

    public static g60 OooO00o(Method method, v90 v90Var) {
        List<a60> listOooOOOO = a60.OooOOOO(v90Var.OooOOO());
        listOooOOOO.addAll(a60.OooOOO0(method));
        return new g60(new ArrayList(), listOooOOOO, v90Var);
    }

    private b60 OooO0OO(Class<? extends b60> cls) throws Exception {
        Object objNewInstance;
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                objNewInstance = cls.newInstance();
                break;
            }
            Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(v90.class)) {
                objNewInstance = constructor.newInstance(this.OooO0OO);
                break;
            }
            i++;
        }
        return (b60) objNewInstance;
    }

    private List<PotentialAssignment> OooO0Oo(a60 a60Var) {
        Class<?> clsOooO = a60Var.OooO();
        return clsOooO.isEnum() ? new i60(clsOooO).OooO00o(a60Var) : (clsOooO.equals(Boolean.class) || clsOooO.equals(Boolean.TYPE)) ? new h60().OooO00o(a60Var) : Collections.emptyList();
    }

    private b60 OooOO0O(a60 a60Var) throws Exception {
        c60 c60Var = (c60) a60Var.OooO0o0(c60.class);
        return c60Var != null ? OooO0OO(c60Var.value()) : new f60(this.OooO0OO);
    }

    public g60 OooO0O0(PotentialAssignment potentialAssignment) {
        ArrayList arrayList = new ArrayList(this.OooO00o);
        arrayList.add(potentialAssignment);
        List<a60> list = this.OooO0O0;
        return new g60(arrayList, list.subList(1, list.size()), this.OooO0OO);
    }

    public Object[] OooO0o() throws PotentialAssignment.CouldNotGenerateValueException {
        return OooO0o0(0, this.OooO00o.size());
    }

    public Object[] OooO0o0(int i, int i2) throws PotentialAssignment.CouldNotGenerateValueException {
        Object[] objArr = new Object[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            objArr[i3 - i] = this.OooO00o.get(i3).OooO0OO();
        }
        return objArr;
    }

    public Object[] OooO0oO(boolean z) throws PotentialAssignment.CouldNotGenerateValueException {
        int size = this.OooO00o.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = this.OooO00o.get(i).OooO0O0();
        }
        return objArr;
    }

    public Object[] OooO0oo() throws PotentialAssignment.CouldNotGenerateValueException {
        return OooO0o0(0, OooO());
    }

    public Object[] OooOO0() throws PotentialAssignment.CouldNotGenerateValueException {
        return OooO0o0(OooO(), this.OooO00o.size());
    }

    public boolean OooOO0o() {
        return this.OooO0O0.size() == 0;
    }

    public List<PotentialAssignment> OooOOO() throws Throwable {
        a60 a60VarOooOOO0 = OooOOO0();
        List<PotentialAssignment> listOooO00o = OooOO0O(a60VarOooOOO0).OooO00o(a60VarOooOOO0);
        return listOooO00o.size() == 0 ? OooO0Oo(a60VarOooOOO0) : listOooO00o;
    }

    public a60 OooOOO0() {
        return this.OooO0O0.get(0);
    }
}
