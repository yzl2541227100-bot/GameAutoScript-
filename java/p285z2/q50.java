package p285z2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p285z2.m50;

/* JADX INFO: loaded from: classes2.dex */
public final class q50 extends o50 {

    public static class OooO00o extends m50.OooO00o {
        public OooO00o(List<Class<?>> list) {
            this(new HashSet(list));
        }

        public OooO00o(Set<Class<?>> set) {
            super(true, null, true, set);
        }

        @Override // z2.m50.OooO00o, p285z2.a90
        public String OooO0O0() {
            return "excludes " + super.OooO0O0();
        }
    }

    @Override // p285z2.o50
    public a90 OooO0O0(List<Class<?>> list) {
        return new OooO00o(list);
    }
}
