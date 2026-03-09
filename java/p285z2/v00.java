package p285z2;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class v00 extends AbstractList<ByteString> implements RandomAccess {
    public final ByteString[] OoooOoO;
    public final int[] OoooOoo;

    private v00(ByteString[] byteStringArr, int[] iArr) {
        this.OoooOoO = byteStringArr;
        this.OoooOoo = iArr;
    }

    private static void OooO00o(long j, h00 h00Var, int i, List<ByteString> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        h00 h00Var2;
        int i7 = i2;
        if (i7 >= i3) {
            throw new AssertionError();
        }
        for (int i8 = i7; i8 < i3; i8++) {
            if (list.get(i8).size() < i) {
                throw new AssertionError();
            }
        }
        ByteString byteString = list.get(i2);
        ByteString byteString2 = list.get(i3 - 1);
        int iIntValue = -1;
        if (i == byteString.size()) {
            iIntValue = list2.get(i7).intValue();
            i7++;
            byteString = list.get(i7);
        }
        int i9 = i7;
        if (byteString.getByte(i) == byteString2.getByte(i)) {
            int i10 = 0;
            int iMin = Math.min(byteString.size(), byteString2.size());
            for (int i11 = i; i11 < iMin && byteString.getByte(i11) == byteString2.getByte(i11); i11++) {
                i10++;
            }
            long jOooO0OO = 1 + j + ((long) OooO0OO(h00Var)) + 2 + ((long) i10);
            h00Var.OooO0oo(-i10);
            h00Var.OooO0oo(iIntValue);
            int i12 = i;
            while (true) {
                i4 = i + i10;
                if (i12 >= i4) {
                    break;
                }
                h00Var.OooO0oo(byteString.getByte(i12) & 255);
                i12++;
            }
            if (i9 + 1 == i3) {
                if (i4 != list.get(i9).size()) {
                    throw new AssertionError();
                }
                h00Var.OooO0oo(list2.get(i9).intValue());
                return;
            } else {
                h00 h00Var3 = new h00();
                h00Var.OooO0oo((int) ((((long) OooO0OO(h00Var3)) + jOooO0OO) * (-1)));
                OooO00o(jOooO0OO, h00Var3, i4, list, i9, i3, list2);
                h00Var.OooOooO(h00Var3, h00Var3.o00000O0());
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i9 + 1; i14 < i3; i14++) {
            if (list.get(i14 - 1).getByte(i) != list.get(i14).getByte(i)) {
                i13++;
            }
        }
        long jOooO0OO2 = j + ((long) OooO0OO(h00Var)) + 2 + ((long) (i13 * 2));
        h00Var.OooO0oo(i13);
        h00Var.OooO0oo(iIntValue);
        for (int i15 = i9; i15 < i3; i15++) {
            byte b = list.get(i15).getByte(i);
            if (i15 == i9 || b != list.get(i15 - 1).getByte(i)) {
                h00Var.OooO0oo(b & 255);
            }
        }
        h00 h00Var4 = new h00();
        int i16 = i9;
        while (i16 < i3) {
            byte b2 = list.get(i16).getByte(i);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i5 = i3;
                    break;
                } else {
                    if (b2 != list.get(i18).getByte(i)) {
                        i5 = i18;
                        break;
                    }
                    i18++;
                }
            }
            if (i17 == i5 && i + 1 == list.get(i16).size()) {
                h00Var.OooO0oo(list2.get(i16).intValue());
                i6 = i5;
                h00Var2 = h00Var4;
            } else {
                h00Var.OooO0oo((int) ((((long) OooO0OO(h00Var4)) + jOooO0OO2) * (-1)));
                i6 = i5;
                h00Var2 = h00Var4;
                OooO00o(jOooO0OO2, h00Var4, i + 1, list, i16, i5, list2);
            }
            h00Var4 = h00Var2;
            i16 = i6;
        }
        h00 h00Var5 = h00Var4;
        h00Var.OooOooO(h00Var5, h00Var5.o00000O0());
    }

    private static int OooO0OO(h00 h00Var) {
        return (int) (h00Var.o00000O0() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p285z2.v00 OooO0Oo(okio.ByteString... r10) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.v00.OooO0Oo(okio.ByteString[]):z2.v00");
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public ByteString get(int i) {
        return this.OoooOoO[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OoooOoO.length;
    }
}
