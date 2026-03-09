package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class jc0 extends lc0 {
    @Override // p285z2.lc0
    public String OooO00o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("float") || str.equals("java.lang.Float") || str.equals("double") || str.equals("java.lang.Double")) {
            return "real";
        }
        return null;
    }
}
