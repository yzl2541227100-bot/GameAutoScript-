package p285z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: z2.vw */
/* JADX INFO: loaded from: classes2.dex */
public final class C4483vw {
    public final String OooO00o;
    public static final Comparator<String> OooO0O0 = new OooO00o();
    private static final Map<String, C4483vw> OooO0OO = new LinkedHashMap();
    public static final C4483vw OooO0Oo = OooO0OO("SSL_RSA_WITH_NULL_MD5", 1);
    public static final C4483vw OooO0o0 = OooO0OO("SSL_RSA_WITH_NULL_SHA", 2);
    public static final C4483vw OooO0o = OooO0OO("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
    public static final C4483vw OooO0oO = OooO0OO("SSL_RSA_WITH_RC4_128_MD5", 4);
    public static final C4483vw OooO0oo = OooO0OO("SSL_RSA_WITH_RC4_128_SHA", 5);
    public static final C4483vw OooO = OooO0OO("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
    public static final C4483vw OooOO0 = OooO0OO("SSL_RSA_WITH_DES_CBC_SHA", 9);
    public static final C4483vw OooOO0O = OooO0OO("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    public static final C4483vw OooOO0o = OooO0OO("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
    public static final C4483vw OooOOO0 = OooO0OO("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
    public static final C4483vw OooOOO = OooO0OO("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
    public static final C4483vw OooOOOO = OooO0OO("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
    public static final C4483vw OooOOOo = OooO0OO("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
    public static final C4483vw OooOOo0 = OooO0OO("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
    public static final C4483vw OooOOo = OooO0OO("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
    public static final C4483vw OooOOoo = OooO0OO("SSL_DH_anon_WITH_RC4_128_MD5", 24);
    public static final C4483vw OooOo00 = OooO0OO("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
    public static final C4483vw OooOo0 = OooO0OO("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
    public static final C4483vw OooOo0O = OooO0OO("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
    public static final C4483vw OooOo0o = OooO0OO("TLS_KRB5_WITH_DES_CBC_SHA", 30);
    public static final C4483vw OooOo = OooO0OO("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
    public static final C4483vw OooOoO0 = OooO0OO("TLS_KRB5_WITH_RC4_128_SHA", 32);
    public static final C4483vw OooOoO = OooO0OO("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final C4483vw OooOoOO = OooO0OO("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final C4483vw OooOoo0 = OooO0OO("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final C4483vw OooOoo = OooO0OO("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final C4483vw OooOooO = OooO0OO("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final C4483vw OooOooo = OooO0OO("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final C4483vw Oooo000 = OooO0OO("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final C4483vw Oooo00O = OooO0OO("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final C4483vw Oooo00o = OooO0OO("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final C4483vw Oooo0 = OooO0OO("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final C4483vw Oooo0O0 = OooO0OO("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final C4483vw Oooo0OO = OooO0OO("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final C4483vw Oooo0o0 = OooO0OO("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final C4483vw Oooo0o = OooO0OO("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final C4483vw Oooo0oO = OooO0OO("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final C4483vw Oooo0oo = OooO0OO("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final C4483vw Oooo = OooO0OO("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final C4483vw OoooO00 = OooO0OO("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final C4483vw OoooO0 = OooO0OO("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final C4483vw OoooO0O = OooO0OO("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final C4483vw OoooO = OooO0OO("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final C4483vw OoooOO0 = OooO0OO("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final C4483vw o000oOoO = OooO0OO("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final C4483vw OoooOOO = OooO0OO("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final C4483vw OoooOOo = OooO0OO("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final C4483vw OoooOo0 = OooO0OO("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final C4483vw OoooOoO = OooO0OO("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    public static final C4483vw OoooOoo = OooO0OO("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
    public static final C4483vw Ooooo00 = OooO0OO("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
    public static final C4483vw Ooooo0o = OooO0OO("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
    public static final C4483vw OooooO0 = OooO0OO("TLS_PSK_WITH_RC4_128_SHA", 138);
    public static final C4483vw OooooOO = OooO0OO("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
    public static final C4483vw OooooOo = OooO0OO("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
    public static final C4483vw Oooooo0 = OooO0OO("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
    public static final C4483vw Oooooo = OooO0OO("TLS_RSA_WITH_SEED_CBC_SHA", 150);
    public static final C4483vw OoooooO = OooO0OO("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
    public static final C4483vw Ooooooo = OooO0OO("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
    public static final C4483vw o0OoOo0 = OooO0OO("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
    public static final C4483vw ooOO = OooO0OO("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
    public static final C4483vw o00O0O = OooO0OO("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
    public static final C4483vw o00Oo0 = OooO0OO("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
    public static final C4483vw o00Ooo = OooO0OO("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
    public static final C4483vw o00o0O = OooO0OO("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
    public static final C4483vw o00ooo = OooO0OO("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
    public static final C4483vw oo000o = OooO0OO("TLS_FALLBACK_SCSV", 22016);
    public static final C4483vw o00oO0o = OooO0OO("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
    public static final C4483vw o00oO0O = OooO0OO("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
    public static final C4483vw o0ooOO0 = OooO0OO("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
    public static final C4483vw o0ooOOo = OooO0OO("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
    public static final C4483vw o0ooOoO = OooO0OO("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
    public static final C4483vw o0OOO0o = OooO0OO("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
    public static final C4483vw o0Oo0oo = OooO0OO("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
    public static final C4483vw o0OO00O = OooO0OO("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final C4483vw oo0o0Oo = OooO0OO("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final C4483vw o0O0O00 = OooO0OO("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final C4483vw o000OOo = OooO0OO("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final C4483vw o000000 = OooO0OO("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final C4483vw o000000O = OooO0OO("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final C4483vw o000000o = OooO0OO("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final C4483vw o00000 = OooO0OO("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final C4483vw o00000O0 = OooO0OO("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final C4483vw o00000O = OooO0OO("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final C4483vw o00000OO = OooO0OO("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final C4483vw o00000Oo = OooO0OO("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final C4483vw o00000o0 = OooO0OO("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final C4483vw o0000Ooo = OooO0OO("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final C4483vw o00000oO = OooO0OO("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final C4483vw o00000oo = OooO0OO("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final C4483vw o0000 = OooO0OO("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final C4483vw o0000O00 = OooO0OO("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final C4483vw o0000oo = OooO0OO("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final C4483vw o0000oO = OooO0OO("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final C4483vw o0000O0 = OooO0OO("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final C4483vw o0000O0O = OooO0OO("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final C4483vw o000OO = OooO0OO("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final C4483vw o0000O = OooO0OO("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final C4483vw o0000OO0 = OooO0OO("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final C4483vw o0000OO = OooO0OO("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final C4483vw o0000OOO = OooO0OO("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
    public static final C4483vw o0000OOo = OooO0OO("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
    public static final C4483vw o0000Oo0 = OooO0OO("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
    public static final C4483vw o0000Oo = OooO0OO("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
    public static final C4483vw o0000OoO = OooO0OO("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
    public static final C4483vw o0000o0 = OooO0OO("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
    public static final C4483vw o0000o0O = OooO0OO("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
    public static final C4483vw o0000o0o = OooO0OO("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
    public static final C4483vw o0000o = OooO0OO("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
    public static final C4483vw o0000oO0 = OooO0OO("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
    public static final C4483vw o0000oOO = OooO0OO("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
    public static final C4483vw o0000oOo = OooO0OO("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    public static final C4483vw o0000oo0 = OooO0OO("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
    public static final C4483vw o0000ooO = OooO0OO("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
    public static final C4483vw o000 = OooO0OO("TLS_AES_128_GCM_SHA256", 4865);
    public static final C4483vw o000O000 = OooO0OO("TLS_AES_256_GCM_SHA384", 4866);
    public static final C4483vw o000OoO = OooO0OO("TLS_CHACHA20_POLY1305_SHA256", 4867);
    public static final C4483vw o000O0o = OooO0OO("TLS_AES_128_CCM_SHA256", 4868);
    public static final C4483vw o000Ooo = OooO0OO("TLS_AES_256_CCM_8_SHA256", 4869);

    /* JADX INFO: renamed from: z2.vw$OooO00o */
    public class OooO00o implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iMin = Math.min(str.length(), str2.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    private C4483vw(String str) {
        Objects.requireNonNull(str);
        this.OooO00o = str;
    }

    public static synchronized C4483vw OooO00o(String str) {
        C4483vw c4483vw;
        Map<String, C4483vw> map = OooO0OO;
        c4483vw = map.get(str);
        if (c4483vw == null) {
            c4483vw = map.get(OooO0o0(str));
            if (c4483vw == null) {
                c4483vw = new C4483vw(str);
            }
            map.put(str, c4483vw);
        }
        return c4483vw;
    }

    public static List<C4483vw> OooO0O0(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(OooO00o(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static C4483vw OooO0OO(String str, int i) {
        C4483vw c4483vw = new C4483vw(str);
        OooO0OO.put(str, c4483vw);
        return c4483vw;
    }

    private static String OooO0o0(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String OooO0Oo() {
        return this.OooO00o;
    }

    public String toString() {
        return this.OooO00o;
    }
}
