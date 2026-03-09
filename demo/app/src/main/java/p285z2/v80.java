package p285z2;

import org.junit.runner.Description;
import org.junit.runner.FilterFactory;

/* JADX INFO: loaded from: classes2.dex */
public class v80 {
    public static a90 OooO00o(Class<? extends FilterFactory> cls, w80 w80Var) throws FilterFactory.FilterNotCreatedException {
        return OooO0OO(cls).OooO00o(w80Var);
    }

    public static a90 OooO0O0(String str, w80 w80Var) throws FilterFactory.FilterNotCreatedException {
        return OooO0Oo(str).OooO00o(w80Var);
    }

    public static FilterFactory OooO0OO(Class<? extends FilterFactory> cls) throws FilterFactory.FilterNotCreatedException {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new FilterFactory.FilterNotCreatedException(e);
        }
    }

    public static FilterFactory OooO0Oo(String str) throws FilterFactory.FilterNotCreatedException {
        try {
            return OooO0OO(m60.OooO00o(str).asSubclass(FilterFactory.class));
        } catch (Exception e) {
            throw new FilterFactory.FilterNotCreatedException(e);
        }
    }

    public static a90 OooO0o0(x80 x80Var, String str) throws FilterFactory.FilterNotCreatedException {
        Description description = x80Var.OooO0oo().getDescription();
        String[] strArrSplit = str.contains("=") ? str.split("=", 2) : new String[]{str, ""};
        return OooO0O0(strArrSplit[0], new w80(description, strArrSplit[1]));
    }
}
