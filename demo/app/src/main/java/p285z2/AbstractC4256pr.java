package p285z2;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.pr */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4256pr {
    private final C3735bo OooO00o;
    private final C4552xr OooO0O0;

    public AbstractC4256pr(C3735bo c3735bo) {
        this.OooO00o = c3735bo;
        this.OooO0O0 = new C4552xr(c3735bo);
    }

    public static AbstractC4256pr OooO00o(C3735bo c3735bo) {
        if (c3735bo.OooO0oo(1)) {
            return new C4145mr(c3735bo);
        }
        if (!c3735bo.OooO0oo(2)) {
            return new C4293qr(c3735bo);
        }
        int iOooO0oO = C4552xr.OooO0oO(c3735bo, 1, 4);
        if (iOooO0oO == 4) {
            return new C3923gr(c3735bo);
        }
        if (iOooO0oO == 5) {
            return new C3960hr(c3735bo);
        }
        int iOooO0oO2 = C4552xr.OooO0oO(c3735bo, 1, 5);
        if (iOooO0oO2 == 12) {
            return new C3997ir(c3735bo);
        }
        if (iOooO0oO2 == 13) {
            return new C4034jr(c3735bo);
        }
        switch (C4552xr.OooO0oO(c3735bo, 1, 7)) {
            case 56:
                return new C4071kr(c3735bo, "310", "11");
            case 57:
                return new C4071kr(c3735bo, "320", "11");
            case 58:
                return new C4071kr(c3735bo, "310", "13");
            case 59:
                return new C4071kr(c3735bo, "320", "13");
            case 60:
                return new C4071kr(c3735bo, "310", "15");
            case 61:
                return new C4071kr(c3735bo, "320", "15");
            case 62:
                return new C4071kr(c3735bo, "310", "17");
            case 63:
                return new C4071kr(c3735bo, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(c3735bo)));
        }
    }

    public final C4552xr OooO0O0() {
        return this.OooO0O0;
    }

    public final C3735bo OooO0OO() {
        return this.OooO00o;
    }

    public abstract String OooO0Oo() throws NotFoundException, FormatException;
}
