package p285z2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: z2.ds */
/* JADX INFO: loaded from: classes2.dex */
public final class C3813ds {
    private final Map<Integer, Integer> OooO00o = new HashMap();

    public final Integer OooO00o(int i) {
        return this.OooO00o.get(Integer.valueOf(i));
    }

    public final int[] OooO0O0() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry<Integer, Integer> entry : this.OooO00o.entrySet()) {
            if (entry.getValue().intValue() > iIntValue) {
                iIntValue = entry.getValue().intValue();
                arrayList.clear();
            } else if (entry.getValue().intValue() == iIntValue) {
            }
            arrayList.add(entry.getKey());
        }
        return C4589yr.OooO0OO(arrayList);
    }

    public final void OooO0OO(int i) {
        Integer num = this.OooO00o.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.OooO00o.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
