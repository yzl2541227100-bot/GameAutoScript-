package p285z2;

import java.net.Proxy;

/* JADX INFO: renamed from: z2.wy */
/* JADX INFO: loaded from: classes2.dex */
public final class C4522wy {
    private C4522wy() {
    }

    public static String OooO00o(C4225ox c4225ox, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(c4225ox.OooO0oO());
        sb.append(' ');
        boolean zOooO0O0 = OooO0O0(c4225ox, type);
        C4003ix c4003ixOooOO0O = c4225ox.OooOO0O();
        if (zOooO0O0) {
            sb.append(c4003ixOooOO0O);
        } else {
            sb.append(OooO0OO(c4003ixOooOO0O));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean OooO0O0(C4225ox c4225ox, Proxy.Type type) {
        return !c4225ox.OooO0o() && type == Proxy.Type.HTTP;
    }

    public static String OooO0OO(C4003ix c4003ix) {
        String strOooO0oo = c4003ix.OooO0oo();
        String strOooOO0 = c4003ix.OooOO0();
        if (strOooOO0 == null) {
            return strOooO0oo;
        }
        return strOooO0oo + '?' + strOooOO0;
    }
}
