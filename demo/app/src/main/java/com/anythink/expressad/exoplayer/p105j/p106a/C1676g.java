package com.anythink.expressad.exoplayer.p105j.p106a;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1676g {

    /* JADX INFO: renamed from: c */
    private static final int f9325c = 2;

    /* JADX INFO: renamed from: d */
    private static final int f9326d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final int f9327a;

    /* JADX INFO: renamed from: b */
    public final String f9328b;

    /* JADX INFO: renamed from: g */
    private boolean f9331g;

    /* JADX INFO: renamed from: f */
    private C1681l f9330f = C1681l.f9349b;

    /* JADX INFO: renamed from: e */
    private final TreeSet<C1683n> f9329e = new TreeSet<>();

    public C1676g(int i, String str) {
        this.f9327a = i;
        this.f9328b = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1676g m7760a(int i, DataInputStream dataInputStream) throws IOException {
        C1676g c1676g = new C1676g(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i < 2) {
            long j = dataInputStream.readLong();
            C1680k c1680k = new C1680k();
            C1679j.m7798a(c1680k, j);
            c1676g.m7769a(c1680k);
        } else {
            c1676g.f9330f = C1681l.m7809a(dataInputStream);
        }
        return c1676g;
    }

    /* JADX INFO: renamed from: a */
    public final int m7761a(int i) {
        int i2;
        int iHashCode;
        int iHashCode2 = (this.f9327a * 31) + this.f9328b.hashCode();
        if (i < 2) {
            long jM7796a = C1679j.m7796a(this.f9330f);
            i2 = iHashCode2 * 31;
            iHashCode = (int) (jM7796a ^ (jM7796a >>> 32));
        } else {
            i2 = iHashCode2 * 31;
            iHashCode = this.f9330f.hashCode();
        }
        return i2 + iHashCode;
    }

    /* JADX INFO: renamed from: a */
    public final long m7762a(long j, long j2) {
        C1683n c1683nM7764a = m7764a(j);
        if (c1683nM7764a.m7751b()) {
            return -Math.min(c1683nM7764a.m7750a() ? Long.MAX_VALUE : c1683nM7764a.f9317c, j2);
        }
        long j3 = j + j2;
        long jMax = c1683nM7764a.f9316b + c1683nM7764a.f9317c;
        if (jMax < j3) {
            for (C1683n c1683n : this.f9329e.tailSet(c1683nM7764a, false)) {
                long j4 = c1683n.f9316b;
                if (j4 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j4 + c1683n.f9317c);
                if (jMax >= j3) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1678i m7763a() {
        return this.f9330f;
    }

    /* JADX INFO: renamed from: a */
    public final C1683n m7764a(long j) {
        C1683n c1683nM7834a = C1683n.m7834a(this.f9328b, j);
        C1683n c1683nFloor = this.f9329e.floor(c1683nM7834a);
        if (c1683nFloor != null && c1683nFloor.f9316b + c1683nFloor.f9317c > j) {
            return c1683nFloor;
        }
        C1683n c1683nCeiling = this.f9329e.ceiling(c1683nM7834a);
        return c1683nCeiling == null ? C1683n.m7837b(this.f9328b, j) : C1683n.m7835a(this.f9328b, j, c1683nCeiling.f9316b - j);
    }

    /* JADX INFO: renamed from: a */
    public final void m7765a(C1683n c1683n) {
        this.f9329e.add(c1683n);
    }

    /* JADX INFO: renamed from: a */
    public final void m7766a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.f9327a);
        dataOutputStream.writeUTF(this.f9328b);
        this.f9330f.m7816a(dataOutputStream);
    }

    /* JADX INFO: renamed from: a */
    public final void m7767a(boolean z) {
        this.f9331g = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7768a(C1674e c1674e) {
        if (!this.f9329e.remove(c1674e)) {
            return false;
        }
        c1674e.f9319e.delete();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7769a(C1680k c1680k) {
        C1681l c1681l = this.f9330f;
        C1681l c1681lM7815a = c1681l.m7815a(c1680k);
        this.f9330f = c1681lM7815a;
        return !c1681lM7815a.equals(c1681l);
    }

    /* JADX INFO: renamed from: b */
    public final C1683n m7770b(C1683n c1683n) throws InterfaceC1670a.a {
        C1711a.m8012b(this.f9329e.remove(c1683n));
        C1683n c1683nM7839a = c1683n.m7839a(this.f9327a);
        if (c1683n.f9319e.renameTo(c1683nM7839a.f9319e)) {
            this.f9329e.add(c1683nM7839a);
            return c1683nM7839a;
        }
        throw new InterfaceC1670a.a("Renaming of " + c1683n.f9319e + " to " + c1683nM7839a.f9319e + " failed.");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7771b() {
        return this.f9331g;
    }

    /* JADX INFO: renamed from: c */
    public final TreeSet<C1683n> m7772c() {
        return this.f9329e;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7773d() {
        return this.f9329e.isEmpty();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1676g.class == obj.getClass()) {
            C1676g c1676g = (C1676g) obj;
            if (this.f9327a == c1676g.f9327a && this.f9328b.equals(c1676g.f9328b) && this.f9329e.equals(c1676g.f9329e) && this.f9330f.equals(c1676g.f9330f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (m7761a(Integer.MAX_VALUE) * 31) + this.f9329e.hashCode();
    }
}
