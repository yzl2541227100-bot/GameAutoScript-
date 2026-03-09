package p285z2;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;

/* JADX INFO: loaded from: classes2.dex */
public class i60 extends b60 {
    private Class<?> OooO00o;

    public i60(Class<?> cls) {
        this.OooO00o = cls;
    }

    @Override // p285z2.b60
    public List<PotentialAssignment> OooO00o(a60 a60Var) {
        Object[] enumConstants = this.OooO00o.getEnumConstants();
        ArrayList arrayList = new ArrayList();
        for (Object obj : enumConstants) {
            arrayList.add(PotentialAssignment.OooO00o(obj.toString(), obj));
        }
        return arrayList;
    }
}
