package com.umeng.commonsdk.proguard;

import p285z2.C4196o4;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.y */
/* JADX INFO: loaded from: classes2.dex */
public class C3474y {

    /* JADX INFO: renamed from: a */
    private short[] f19038a;

    /* JADX INFO: renamed from: b */
    private int f19039b = -1;

    public C3474y(int i) {
        this.f19038a = new short[i];
    }

    /* JADX INFO: renamed from: d */
    private void m16135d() {
        short[] sArr = this.f19038a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f19038a = sArr2;
    }

    /* JADX INFO: renamed from: a */
    public short m16136a() {
        short[] sArr = this.f19038a;
        int i = this.f19039b;
        this.f19039b = i - 1;
        return sArr[i];
    }

    /* JADX INFO: renamed from: a */
    public void m16137a(short s) {
        if (this.f19038a.length == this.f19039b + 1) {
            m16135d();
        }
        short[] sArr = this.f19038a;
        int i = this.f19039b + 1;
        this.f19039b = i;
        sArr[i] = s;
    }

    /* JADX INFO: renamed from: b */
    public short m16138b() {
        return this.f19038a[this.f19039b];
    }

    /* JADX INFO: renamed from: c */
    public void m16139c() {
        this.f19039b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i = 0; i < this.f19038a.length; i++) {
            if (i != 0) {
                sb.append(C4196o4.OooO00o.OooO0Oo);
            }
            if (i == this.f19039b) {
                sb.append(">>");
            }
            sb.append((int) this.f19038a[i]);
            if (i == this.f19039b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }
}
