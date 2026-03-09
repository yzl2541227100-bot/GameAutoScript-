package p285z2;

import okio.ByteString;

/* JADX INFO: renamed from: z2.bz */
/* JADX INFO: loaded from: classes2.dex */
public final class C3746bz {
    public final ByteString OooO00o;
    public final ByteString OooO0O0;
    public final int OooO0OO;
    public static final ByteString OooO0Oo = ByteString.encodeUtf8(":");
    public static final String OooO0o0 = ":status";
    public static final ByteString OooOO0 = ByteString.encodeUtf8(OooO0o0);
    public static final String OooO0o = ":method";
    public static final ByteString OooOO0O = ByteString.encodeUtf8(OooO0o);
    public static final String OooO0oO = ":path";
    public static final ByteString OooOO0o = ByteString.encodeUtf8(OooO0oO);
    public static final String OooO0oo = ":scheme";
    public static final ByteString OooOOO0 = ByteString.encodeUtf8(OooO0oo);
    public static final String OooO = ":authority";
    public static final ByteString OooOOO = ByteString.encodeUtf8(OooO);

    /* JADX INFO: renamed from: z2.bz$OooO00o */
    public interface OooO00o {
        void OooO00o(C3966hx c3966hx);
    }

    public C3746bz(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public C3746bz(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public C3746bz(ByteString byteString, ByteString byteString2) {
        this.OooO00o = byteString;
        this.OooO0O0 = byteString2;
        this.OooO0OO = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3746bz)) {
            return false;
        }
        C3746bz c3746bz = (C3746bz) obj;
        return this.OooO00o.equals(c3746bz.OooO00o) && this.OooO0O0.equals(c3746bz.OooO0O0);
    }

    public int hashCode() {
        return ((527 + this.OooO00o.hashCode()) * 31) + this.OooO0O0.hashCode();
    }

    public String toString() {
        return C4558xx.OooOOoo("%s: %s", this.OooO00o.utf8(), this.OooO0O0.utf8());
    }
}
