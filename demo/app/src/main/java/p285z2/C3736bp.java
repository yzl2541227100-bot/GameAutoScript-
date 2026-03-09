package p285z2;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: renamed from: z2.bp */
/* JADX INFO: loaded from: classes2.dex */
public final class C3736bp implements InterfaceC3921gp {
    private static char OooO0OO(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 + InputDeviceCompat.SOURCE_ANY);
    }

    @Override // p285z2.InterfaceC3921gp
    public final int OooO00o() {
        return 5;
    }

    @Override // p285z2.InterfaceC3921gp
    public final void OooO0O0(C3958hp c3958hp) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!c3958hp.OooOO0()) {
                break;
            }
            sb.append(c3958hp.OooO0Oo());
            c3958hp.OooO0o++;
            if (C4032jp.OooOOOO(c3958hp.OooO0o0(), c3958hp.OooO0o, OooO00o()) != OooO00o()) {
                c3958hp.OooOOOo(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iOooO00o = c3958hp.OooO00o() + length + 1;
        c3958hp.OooOOo(iOooO00o);
        boolean z = c3958hp.OooO0oo().OooO0O0() - iOooO00o > 0;
        if (c3958hp.OooOO0() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            c3958hp.OooOOoo(OooO0OO(sb.charAt(i), c3958hp.OooO00o() + 1));
        }
    }
}
