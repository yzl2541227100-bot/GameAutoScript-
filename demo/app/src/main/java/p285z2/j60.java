package p285z2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class j60 extends f60 {
    public j60(v90 v90Var) {
        super(v90Var);
    }

    @Override // p285z2.f60
    public Collection<Field> OooOO0(a60 a60Var) {
        Collection<Field> collectionOooOO0 = super.OooOO0(a60Var);
        String strValue = ((z50) a60Var.OooO0oO(z50.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field field : collectionOooOO0) {
            if (Arrays.asList(((y50) field.getAnnotation(y50.class)).value()).contains(strValue)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    @Override // p285z2.f60
    public Collection<q90> OooOO0O(a60 a60Var) {
        Collection<q90> collectionOooOO0O = super.OooOO0O(a60Var);
        String strValue = ((z50) a60Var.OooO0oO(z50.class)).value();
        ArrayList arrayList = new ArrayList();
        for (q90 q90Var : collectionOooOO0O) {
            if (Arrays.asList(((y50) q90Var.OooO00o(y50.class)).value()).contains(strValue)) {
                arrayList.add(q90Var);
            }
        }
        return arrayList;
    }

    @Override // p285z2.f60
    public Collection<Field> OooOO0o(a60 a60Var) {
        Collection<Field> collectionOooOO0o = super.OooOO0o(a60Var);
        String strValue = ((z50) a60Var.OooO0oO(z50.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field field : collectionOooOO0o) {
            if (Arrays.asList(((x50) field.getAnnotation(x50.class)).value()).contains(strValue)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    @Override // p285z2.f60
    public Collection<q90> OooOOO0(a60 a60Var) {
        Collection<q90> collectionOooOOO0 = super.OooOOO0(a60Var);
        String strValue = ((z50) a60Var.OooO0oO(z50.class)).value();
        ArrayList arrayList = new ArrayList();
        for (q90 q90Var : collectionOooOOO0) {
            if (Arrays.asList(((x50) q90Var.OooO00o(x50.class)).value()).contains(strValue)) {
                arrayList.add(q90Var);
            }
        }
        return arrayList;
    }
}
