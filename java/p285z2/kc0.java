package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class kc0 extends lc0 {
    @Override // p285z2.lc0
    public String OooO00o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("int") || str.equals("java.lang.Integer") || str.equals("long") || str.equals("java.lang.Long") || str.equals("short") || str.equals("java.lang.Short")) {
            return "integer";
        }
        return null;
    }
}
