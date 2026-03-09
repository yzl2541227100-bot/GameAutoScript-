package p285z2;

import java.util.ArrayList;
import java.util.List;
import org.junit.runner.FilterFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o50 implements FilterFactory {
    private List<Class<?>> OooO0OO(String str) throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            arrayList.add(m60.OooO00o(str2));
        }
        return arrayList;
    }

    @Override // org.junit.runner.FilterFactory
    public a90 OooO00o(w80 w80Var) throws FilterFactory.FilterNotCreatedException {
        try {
            return OooO0O0(OooO0OO(w80Var.OooO00o()));
        } catch (ClassNotFoundException e) {
            throw new FilterFactory.FilterNotCreatedException(e);
        }
    }

    public abstract a90 OooO0O0(List<Class<?>> list);
}
