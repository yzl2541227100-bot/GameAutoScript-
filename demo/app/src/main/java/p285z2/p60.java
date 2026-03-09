package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class p60 extends n60 {
    public Object OooO00o;

    public p60(double d) {
        this.OooO00o = Double.valueOf(d);
    }

    public p60(float f) {
        this.OooO00o = Float.valueOf(f);
    }

    @Override // p285z2.n60
    public void OooO0OO(Object obj, Object obj2) {
        if (obj instanceof Double) {
            d50.OooOo00(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) this.OooO00o).doubleValue());
        } else {
            d50.OooOo0(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) this.OooO00o).floatValue());
        }
    }
}
