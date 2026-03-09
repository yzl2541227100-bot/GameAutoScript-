package p285z2;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.anythink.core.api.ATCustomRuleKeys;
import com.sun.mail.imap.IMAPStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: z2.cz */
/* JADX INFO: loaded from: classes2.dex */
public final class C3783cz {
    private static final int OooO00o = 15;
    private static final int OooO0O0 = 31;
    private static final int OooO0OO = 63;
    private static final int OooO0Oo = 127;
    public static final Map<ByteString, Integer> OooO0o;
    public static final C3746bz[] OooO0o0;

    /* JADX INFO: renamed from: z2.cz$OooO00o */
    public static final class OooO00o {
        private final List<C3746bz> OooO00o;
        private final j00 OooO0O0;
        private final int OooO0OO;
        private int OooO0Oo;
        public int OooO0o;
        public C3746bz[] OooO0o0;
        public int OooO0oO;
        public int OooO0oo;

        public OooO00o(int i, int i2, c10 c10Var) {
            this.OooO00o = new ArrayList();
            this.OooO0o0 = new C3746bz[8];
            this.OooO0o = r0.length - 1;
            this.OooO0oO = 0;
            this.OooO0oo = 0;
            this.OooO0OO = i;
            this.OooO0Oo = i2;
            this.OooO0O0 = u00.OooO0Oo(c10Var);
        }

        public OooO00o(int i, c10 c10Var) {
            this(i, i, c10Var);
        }

        private void OooO00o() {
            int i = this.OooO0Oo;
            int i2 = this.OooO0oo;
            if (i < i2) {
                if (i == 0) {
                    OooO0O0();
                } else {
                    OooO0Oo(i2 - i);
                }
            }
        }

        private void OooO0O0() {
            Arrays.fill(this.OooO0o0, (Object) null);
            this.OooO0o = this.OooO0o0.length - 1;
            this.OooO0oO = 0;
            this.OooO0oo = 0;
        }

        private int OooO0OO(int i) {
            return this.OooO0o + 1 + i;
        }

        private int OooO0Oo(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.OooO0o0.length;
                while (true) {
                    length--;
                    i2 = this.OooO0o;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C3746bz[] c3746bzArr = this.OooO0o0;
                    i -= c3746bzArr[length].OooO0OO;
                    this.OooO0oo -= c3746bzArr[length].OooO0OO;
                    this.OooO0oO--;
                    i3++;
                }
                C3746bz[] c3746bzArr2 = this.OooO0o0;
                System.arraycopy(c3746bzArr2, i2 + 1, c3746bzArr2, i2 + 1 + i3, this.OooO0oO);
                this.OooO0o += i3;
            }
            return i3;
        }

        private ByteString OooO0o(int i) throws IOException {
            C3746bz c3746bz;
            if (!OooO0oo(i)) {
                int iOooO0OO = OooO0OO(i - C3783cz.OooO0o0.length);
                if (iOooO0OO >= 0) {
                    C3746bz[] c3746bzArr = this.OooO0o0;
                    if (iOooO0OO < c3746bzArr.length) {
                        c3746bz = c3746bzArr[iOooO0OO];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            c3746bz = C3783cz.OooO0o0[i];
            return c3746bz.OooO00o;
        }

        private void OooO0oO(int i, C3746bz c3746bz) {
            this.OooO00o.add(c3746bz);
            int i2 = c3746bz.OooO0OO;
            if (i != -1) {
                i2 -= this.OooO0o0[OooO0OO(i)].OooO0OO;
            }
            int i3 = this.OooO0Oo;
            if (i2 > i3) {
                OooO0O0();
                return;
            }
            int iOooO0Oo = OooO0Oo((this.OooO0oo + i2) - i3);
            if (i == -1) {
                int i4 = this.OooO0oO + 1;
                C3746bz[] c3746bzArr = this.OooO0o0;
                if (i4 > c3746bzArr.length) {
                    C3746bz[] c3746bzArr2 = new C3746bz[c3746bzArr.length * 2];
                    System.arraycopy(c3746bzArr, 0, c3746bzArr2, c3746bzArr.length, c3746bzArr.length);
                    this.OooO0o = this.OooO0o0.length - 1;
                    this.OooO0o0 = c3746bzArr2;
                }
                int i5 = this.OooO0o;
                this.OooO0o = i5 - 1;
                this.OooO0o0[i5] = c3746bz;
                this.OooO0oO++;
            } else {
                this.OooO0o0[i + OooO0OO(i) + iOooO0Oo] = c3746bz;
            }
            this.OooO0oo += i2;
        }

        private boolean OooO0oo(int i) {
            return i >= 0 && i <= C3783cz.OooO0o0.length - 1;
        }

        private int OooOO0() throws IOException {
            return this.OooO0O0.readByte() & 255;
        }

        private void OooOOO0(int i) throws IOException {
            if (OooO0oo(i)) {
                this.OooO00o.add(C3783cz.OooO0o0[i]);
                return;
            }
            int iOooO0OO = OooO0OO(i - C3783cz.OooO0o0.length);
            if (iOooO0OO >= 0) {
                C3746bz[] c3746bzArr = this.OooO0o0;
                if (iOooO0OO < c3746bzArr.length) {
                    this.OooO00o.add(c3746bzArr[iOooO0OO]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void OooOOOO(int i) throws IOException {
            OooO0oO(-1, new C3746bz(OooO0o(i), OooOO0O()));
        }

        private void OooOOOo() throws IOException {
            OooO0oO(-1, new C3746bz(C3783cz.OooO00o(OooOO0O()), OooOO0O()));
        }

        private void OooOOo() throws IOException {
            this.OooO00o.add(new C3746bz(C3783cz.OooO00o(OooOO0O()), OooOO0O()));
        }

        private void OooOOo0(int i) throws IOException {
            this.OooO00o.add(new C3746bz(OooO0o(i), OooOO0O()));
        }

        public int OooO() {
            return this.OooO0Oo;
        }

        public List<C3746bz> OooO0o0() {
            ArrayList arrayList = new ArrayList(this.OooO00o);
            this.OooO00o.clear();
            return arrayList;
        }

        public ByteString OooOO0O() throws IOException {
            int iOooOO0 = OooOO0();
            boolean z = (iOooOO0 & 128) == 128;
            int iOooOOO = OooOOO(iOooOO0, 127);
            return z ? ByteString.m17043of(C4042jz.OooO0o().OooO0OO(this.OooO0O0.Oooo0oO(iOooOOO))) : this.OooO0O0.OooO0Oo(iOooOOO);
        }

        public void OooOO0o() throws IOException {
            while (!this.OooO0O0.OooOOO()) {
                int i = this.OooO0O0.readByte() & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((i & 128) == 128) {
                    OooOOO0(OooOOO(i, 127) - 1);
                } else if (i == 64) {
                    OooOOOo();
                } else if ((i & 64) == 64) {
                    OooOOOO(OooOOO(i, 63) - 1);
                } else if ((i & 32) == 32) {
                    int iOooOOO = OooOOO(i, 31);
                    this.OooO0Oo = iOooOOO;
                    if (iOooOOO < 0 || iOooOOO > this.OooO0OO) {
                        throw new IOException("Invalid dynamic table size update " + this.OooO0Oo);
                    }
                    OooO00o();
                } else if (i == 16 || i == 0) {
                    OooOOo();
                } else {
                    OooOOo0(OooOOO(i, 15) - 1);
                }
            }
        }

        public int OooOOO(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iOooOO0 = OooOO0();
                if ((iOooOO0 & 128) == 0) {
                    return i2 + (iOooOO0 << i4);
                }
                i2 += (iOooOO0 & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* JADX INFO: renamed from: z2.cz$OooO0O0 */
    public static final class OooO0O0 {
        private static final int OooOO0O = 4096;
        private static final int OooOO0o = 16384;
        public int OooO;
        private final h00 OooO00o;
        private final boolean OooO0O0;
        private int OooO0OO;
        private boolean OooO0Oo;
        public int OooO0o;
        public int OooO0o0;
        public C3746bz[] OooO0oO;
        public int OooO0oo;
        public int OooOO0;

        public OooO0O0(int i, boolean z, h00 h00Var) {
            this.OooO0OO = Integer.MAX_VALUE;
            this.OooO0oO = new C3746bz[8];
            this.OooO0oo = r0.length - 1;
            this.OooO = 0;
            this.OooOO0 = 0;
            this.OooO0o0 = i;
            this.OooO0o = i;
            this.OooO0O0 = z;
            this.OooO00o = h00Var;
        }

        public OooO0O0(h00 h00Var) {
            this(4096, true, h00Var);
        }

        private void OooO00o() {
            int i = this.OooO0o;
            int i2 = this.OooOO0;
            if (i < i2) {
                if (i == 0) {
                    OooO0O0();
                } else {
                    OooO0OO(i2 - i);
                }
            }
        }

        private void OooO0O0() {
            Arrays.fill(this.OooO0oO, (Object) null);
            this.OooO0oo = this.OooO0oO.length - 1;
            this.OooO = 0;
            this.OooOO0 = 0;
        }

        private int OooO0OO(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.OooO0oO.length;
                while (true) {
                    length--;
                    i2 = this.OooO0oo;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C3746bz[] c3746bzArr = this.OooO0oO;
                    i -= c3746bzArr[length].OooO0OO;
                    this.OooOO0 -= c3746bzArr[length].OooO0OO;
                    this.OooO--;
                    i3++;
                }
                C3746bz[] c3746bzArr2 = this.OooO0oO;
                System.arraycopy(c3746bzArr2, i2 + 1, c3746bzArr2, i2 + 1 + i3, this.OooO);
                C3746bz[] c3746bzArr3 = this.OooO0oO;
                int i4 = this.OooO0oo;
                Arrays.fill(c3746bzArr3, i4 + 1, i4 + 1 + i3, (Object) null);
                this.OooO0oo += i3;
            }
            return i3;
        }

        private void OooO0Oo(C3746bz c3746bz) {
            int i = c3746bz.OooO0OO;
            int i2 = this.OooO0o;
            if (i > i2) {
                OooO0O0();
                return;
            }
            OooO0OO((this.OooOO0 + i) - i2);
            int i3 = this.OooO + 1;
            C3746bz[] c3746bzArr = this.OooO0oO;
            if (i3 > c3746bzArr.length) {
                C3746bz[] c3746bzArr2 = new C3746bz[c3746bzArr.length * 2];
                System.arraycopy(c3746bzArr, 0, c3746bzArr2, c3746bzArr.length, c3746bzArr.length);
                this.OooO0oo = this.OooO0oO.length - 1;
                this.OooO0oO = c3746bzArr2;
            }
            int i4 = this.OooO0oo;
            this.OooO0oo = i4 - 1;
            this.OooO0oO[i4] = c3746bz;
            this.OooO++;
            this.OooOO0 += i;
        }

        public void OooO0o(ByteString byteString) throws IOException {
            int size;
            int i;
            if (!this.OooO0O0 || C4042jz.OooO0o().OooO0o0(byteString) >= byteString.size()) {
                size = byteString.size();
                i = 0;
            } else {
                h00 h00Var = new h00();
                C4042jz.OooO0o().OooO0Oo(byteString, h00Var);
                byteString = h00Var.Oooo00o();
                size = byteString.size();
                i = 128;
            }
            OooO0oo(size, 127, i);
            this.OooO00o.OoooO0(byteString);
        }

        public void OooO0o0(int i) {
            this.OooO0o0 = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.OooO0o;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.OooO0OO = Math.min(this.OooO0OO, iMin);
            }
            this.OooO0Oo = true;
            this.OooO0o = iMin;
            OooO00o();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void OooO0oO(java.util.List<p285z2.C3746bz> r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p285z2.C3783cz.OooO0O0.OooO0oO(java.util.List):void");
        }

        public void OooO0oo(int i, int i2, int i3) {
            int i4;
            h00 h00Var;
            if (i < i2) {
                h00Var = this.OooO00o;
                i4 = i | i3;
            } else {
                this.OooO00o.OooOOOO(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.OooO00o.OooOOOO(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                h00Var = this.OooO00o;
            }
            h00Var.OooOOOO(i4);
        }
    }

    static {
        ByteString byteString = C3746bz.OooOO0O;
        ByteString byteString2 = C3746bz.OooOO0o;
        ByteString byteString3 = C3746bz.OooOOO0;
        ByteString byteString4 = C3746bz.OooOO0;
        OooO0o0 = new C3746bz[]{new C3746bz(C3746bz.OooOOO, ""), new C3746bz(byteString, "GET"), new C3746bz(byteString, "POST"), new C3746bz(byteString2, "/"), new C3746bz(byteString2, "/index.html"), new C3746bz(byteString3, "http"), new C3746bz(byteString3, "https"), new C3746bz(byteString4, "200"), new C3746bz(byteString4, "204"), new C3746bz(byteString4, "206"), new C3746bz(byteString4, "304"), new C3746bz(byteString4, "400"), new C3746bz(byteString4, "404"), new C3746bz(byteString4, "500"), new C3746bz("accept-charset", ""), new C3746bz("accept-encoding", "gzip, deflate"), new C3746bz("accept-language", ""), new C3746bz("accept-ranges", ""), new C3746bz("accept", ""), new C3746bz("access-control-allow-origin", ""), new C3746bz(ATCustomRuleKeys.AGE, ""), new C3746bz("allow", ""), new C3746bz("authorization", ""), new C3746bz("cache-control", ""), new C3746bz("content-disposition", ""), new C3746bz("content-encoding", ""), new C3746bz("content-language", ""), new C3746bz("content-length", ""), new C3746bz("content-location", ""), new C3746bz("content-range", ""), new C3746bz("content-type", ""), new C3746bz("cookie", ""), new C3746bz(IMAPStore.ID_DATE, ""), new C3746bz("etag", ""), new C3746bz("expect", ""), new C3746bz("expires", ""), new C3746bz("from", ""), new C3746bz("host", ""), new C3746bz("if-match", ""), new C3746bz("if-modified-since", ""), new C3746bz("if-none-match", ""), new C3746bz("if-range", ""), new C3746bz("if-unmodified-since", ""), new C3746bz("last-modified", ""), new C3746bz("link", ""), new C3746bz(RequestParameters.SUBRESOURCE_LOCATION, ""), new C3746bz("max-forwards", ""), new C3746bz("proxy-authenticate", ""), new C3746bz("proxy-authorization", ""), new C3746bz("range", ""), new C3746bz(RequestParameters.SUBRESOURCE_REFERER, ""), new C3746bz("refresh", ""), new C3746bz("retry-after", ""), new C3746bz("server", ""), new C3746bz("set-cookie", ""), new C3746bz("strict-transport-security", ""), new C3746bz("transfer-encoding", ""), new C3746bz("user-agent", ""), new C3746bz("vary", ""), new C3746bz("via", ""), new C3746bz("www-authenticate", "")};
        OooO0o = OooO0O0();
    }

    private C3783cz() {
    }

    public static ByteString OooO00o(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (b >= 65 && b <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    private static Map<ByteString, Integer> OooO0O0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(OooO0o0.length);
        int i = 0;
        while (true) {
            C3746bz[] c3746bzArr = OooO0o0;
            if (i >= c3746bzArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(c3746bzArr[i].OooO00o)) {
                linkedHashMap.put(c3746bzArr[i].OooO00o, Integer.valueOf(i));
            }
            i++;
        }
    }
}
