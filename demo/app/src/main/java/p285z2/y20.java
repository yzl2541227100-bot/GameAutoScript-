package p285z2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class y20<T> extends g20<T> {
    private static final Pattern Ooooo0o = Pattern.compile("%([0-9]+)");
    private final String OoooOoO;
    private final p20<T> OoooOoo;
    private final Object[] Ooooo00;

    public y20(String str, p20<T> p20Var, Object[] objArr) {
        this.OoooOoO = str;
        this.OoooOoo = p20Var;
        this.Ooooo00 = (Object[]) objArr.clone();
    }

    @n20
    public static <T> p20<T> OooO0Oo(String str, p20<T> p20Var, Object... objArr) {
        return new y20(str, p20Var, objArr);
    }

    @Override // p285z2.g20, p285z2.p20
    public void OooO00o(Object obj, l20 l20Var) {
        this.OoooOoo.OooO00o(obj, l20Var);
    }

    @Override // p285z2.p20
    public boolean OooO0O0(Object obj) {
        return this.OoooOoo.OooO0O0(obj);
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        Matcher matcher = Ooooo0o.matcher(this.OoooOoO);
        int iEnd = 0;
        while (matcher.find()) {
            l20Var.OooO0Oo(this.OoooOoO.substring(iEnd, matcher.start()));
            l20Var.OooO0o0(this.Ooooo00[Integer.parseInt(matcher.group(1))]);
            iEnd = matcher.end();
        }
        if (iEnd < this.OoooOoO.length()) {
            l20Var.OooO0Oo(this.OoooOoO.substring(iEnd));
        }
    }
}
