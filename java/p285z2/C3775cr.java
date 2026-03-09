package p285z2;

import java.util.List;

/* JADX INFO: renamed from: z2.cr */
/* JADX INFO: loaded from: classes2.dex */
public final class C3775cr {
    private C3775cr() {
    }

    public static C3735bo OooO00o(List<C3812dr> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).OooO0Oo() == null) {
            size--;
        }
        C3735bo c3735bo = new C3735bo(size * 12);
        int i = 0;
        int iOooO0O0 = list.get(0).OooO0Oo().OooO0O0();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & iOooO0O0) != 0) {
                c3735bo.OooOOo(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C3812dr c3812dr = list.get(i3);
            int iOooO0O02 = c3812dr.OooO0OO().OooO0O0();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & iOooO0O02) != 0) {
                    c3735bo.OooOOo(i);
                }
                i++;
            }
            if (c3812dr.OooO0Oo() != null) {
                int iOooO0O03 = c3812dr.OooO0Oo().OooO0O0();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & iOooO0O03) != 0) {
                        c3735bo.OooOOo(i);
                    }
                    i++;
                }
            }
        }
        return c3735bo;
    }
}
