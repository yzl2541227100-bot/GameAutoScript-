package p285z2;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;

/* JADX INFO: loaded from: classes2.dex */
public class l60 extends b60 {
    @Override // p285z2.b60
    public List<PotentialAssignment> OooO00o(a60 a60Var) {
        ArrayList arrayList = new ArrayList();
        for (int i : ((k60) a60Var.OooO0oO(k60.class)).ints()) {
            arrayList.add(PotentialAssignment.OooO00o("ints", Integer.valueOf(i)));
        }
        return arrayList;
    }
}
