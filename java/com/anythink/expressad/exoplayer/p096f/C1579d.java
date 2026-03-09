package com.anythink.expressad.exoplayer.p096f;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.foundation.p120g.C1801a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p285z2.le0;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.d */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class C1579d {

    /* JADX INFO: renamed from: a */
    private static final String f8476a = "MediaCodecUtil";

    /* JADX INFO: renamed from: c */
    private static final String f8478c = "OMX.MTK.AUDIO.DECODER.RAW";

    /* JADX INFO: renamed from: g */
    private static final SparseIntArray f8482g;

    /* JADX INFO: renamed from: h */
    private static final SparseIntArray f8483h;

    /* JADX INFO: renamed from: i */
    private static final String f8484i = "avc1";

    /* JADX INFO: renamed from: j */
    private static final String f8485j = "avc2";

    /* JADX INFO: renamed from: k */
    private static final Map<String, Integer> f8486k;

    /* JADX INFO: renamed from: l */
    private static final String f8487l = "hev1";

    /* JADX INFO: renamed from: m */
    private static final String f8488m = "hvc1";

    /* JADX INFO: renamed from: b */
    private static final String f8477b = "OMX.google.raw.decoder";

    /* JADX INFO: renamed from: d */
    private static final C1576a f8479d = C1576a.m6999a(f8477b);

    /* JADX INFO: renamed from: e */
    private static final Pattern f8480e = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: f */
    private static final HashMap<a, List<C1576a>> f8481f = new HashMap<>();

    /* JADX INFO: renamed from: n */
    private static int f8489n = -1;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f8490a;

        /* JADX INFO: renamed from: b */
        public final boolean f8491b;

        public a(String str, boolean z) {
            this.f8490a = str;
            this.f8491b = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f8490a, aVar.f8490a) && this.f8491b == aVar.f8491b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f8490a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f8491b ? 1231 : 1237);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.d$b */
    public static class b extends Exception {
        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }

        public /* synthetic */ b(Throwable th, byte b) {
            this(th);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.d$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        int mo7068a();

        /* JADX INFO: renamed from: a */
        MediaCodecInfo mo7069a(int i);

        /* JADX INFO: renamed from: a */
        boolean mo7070a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: b */
        boolean mo7071b();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.d$d */
    public static final class d implements c {
        private d() {
        }

        public /* synthetic */ d(byte b) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.p096f.C1579d.c
        /* JADX INFO: renamed from: a */
        public final int mo7068a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.anythink.expressad.exoplayer.p096f.C1579d.c
        /* JADX INFO: renamed from: a */
        public final MediaCodecInfo mo7069a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.anythink.expressad.exoplayer.p096f.C1579d.c
        /* JADX INFO: renamed from: a */
        public final boolean mo7070a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return C1732o.f9738h.equals(str);
        }

        @Override // com.anythink.expressad.exoplayer.p096f.C1579d.c
        /* JADX INFO: renamed from: b */
        public final boolean mo7071b() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.d$e */
    @TargetApi(21)
    public static final class e implements c {

        /* JADX INFO: renamed from: a */
        private final int f8492a;

        /* JADX INFO: renamed from: b */
        private MediaCodecInfo[] f8493b;

        public e(boolean z) {
            this.f8492a = z ? 1 : 0;
        }

        /* JADX INFO: renamed from: c */
        private void m7072c() {
            if (this.f8493b == null) {
                this.f8493b = new MediaCodecList(this.f8492a).getCodecInfos();
            }
        }

        @Override // com.anythink.expressad.exoplayer.p096f.C1579d.c
        /* JADX INFO: renamed from: a */
        public final int mo7068a() {
            m7072c();
            return this.f8493b.length;
        }

        @Override // com.anythink.expressad.exoplayer.p096f.C1579d.c
        /* JADX INFO: renamed from: a */
        public final MediaCodecInfo mo7069a(int i) {
            m7072c();
            return this.f8493b[i];
        }

        @Override // com.anythink.expressad.exoplayer.p096f.C1579d.c
        /* JADX INFO: renamed from: a */
        public final boolean mo7070a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // com.anythink.expressad.exoplayer.p096f.C1579d.c
        /* JADX INFO: renamed from: b */
        public final boolean mo7071b() {
            return true;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8482g = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f8483h = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        f8486k = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", Integer.valueOf(le0.OoooOOo));
    }

    private C1579d() {
    }

    /* JADX INFO: renamed from: a */
    private static int m7055a(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m7056a(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p096f.C1579d.m7056a(java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> m7057a(java.lang.String r6, java.lang.String[] r7) {
        /*
            int r0 = r7.length
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            r2 = 0
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 4
            if (r0 >= r4) goto L15
        L9:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r1.concat(r6)
        L11:
            android.util.Log.w(r3, r6)
            return r2
        L15:
            java.util.regex.Pattern r0 = com.anythink.expressad.exoplayer.p096f.C1579d.f8480e
            r4 = 1
            r5 = r7[r4]
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r5 = r0.matches()
            if (r5 != 0) goto L25
            goto L9
        L25:
            java.lang.String r6 = r0.group(r4)
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L33
            r6 = 1
            goto L3c
        L33:
            java.lang.String r1 = "2"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L66
            r6 = 2
        L3c:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.anythink.expressad.exoplayer.p096f.C1579d.f8486k
            r5 = 3
            r7 = r7[r5]
            java.lang.Object r7 = r1.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L5c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unknown HEVC level string: "
            r6.<init>(r7)
            java.lang.String r7 = r0.group(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L11
        L5c:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.<init>(r6, r7)
            return r0
        L66:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Unknown HEVC profile string: "
            java.lang.String r6 = r7.concat(r6)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p096f.C1579d.m7057a(java.lang.String, java.lang.String[]):android.util.Pair");
    }

    /* JADX INFO: renamed from: a */
    public static C1576a m7058a() {
        return f8479d;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static C1576a m7059a(String str, boolean z) {
        List<C1576a> listM7067c = m7067c(str, z);
        if (listM7067c.isEmpty()) {
            return null;
        }
        return listM7067c.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x029b A[Catch: Exception -> 0x02f0, TRY_ENTER, TryCatch #0 {Exception -> 0x02f0, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x002f, B:14:0x0035, B:16:0x003d, B:18:0x0045, B:20:0x004d, B:22:0x0055, B:24:0x005d, B:29:0x006d, B:33:0x0078, B:35:0x0080, B:37:0x008a, B:39:0x0094, B:44:0x00a1, B:46:0x00a9, B:48:0x00b3, B:50:0x00bb, B:52:0x00c3, B:54:0x00cb, B:56:0x00d3, B:58:0x00db, B:60:0x00e3, B:62:0x00eb, B:64:0x00f3, B:66:0x00fb, B:68:0x0103, B:72:0x010f, B:74:0x0117, B:76:0x0121, B:78:0x0129, B:80:0x0131, B:85:0x0141, B:87:0x0149, B:89:0x0151, B:91:0x0159, B:93:0x0163, B:95:0x016b, B:97:0x0173, B:99:0x017b, B:101:0x0183, B:103:0x018b, B:105:0x0193, B:110:0x01a3, B:112:0x01ab, B:114:0x01b3, B:116:0x01bd, B:118:0x01c5, B:120:0x01cb, B:122:0x01d3, B:126:0x01df, B:128:0x01e7, B:131:0x01f1, B:133:0x01fb, B:139:0x0209, B:141:0x0211, B:185:0x0293, B:188:0x029b, B:190:0x02a1, B:191:0x02b8, B:192:0x02d6), top: B:200:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<com.anythink.expressad.exoplayer.p096f.C1576a> m7060a(com.anythink.expressad.exoplayer.p096f.C1579d.a r18, com.anythink.expressad.exoplayer.p096f.C1579d.c r19, java.lang.String r20) throws com.anythink.expressad.exoplayer.p096f.C1579d.b {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p096f.C1579d.m7060a(com.anythink.expressad.exoplayer.f.d$a, com.anythink.expressad.exoplayer.f.d$c, java.lang.String):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: a */
    private static void m7061a(List<C1576a> list) {
        if (C1717af.f9627a < 26) {
            if (list.size() <= 1 || !f8478c.equals(list.get(0).f8406c)) {
                return;
            }
            for (int i = 1; i < list.size(); i++) {
                C1576a c1576a = list.get(i);
                if (f8477b.equals(c1576a.f8406c)) {
                    list.remove(i);
                    list.add(0, c1576a);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7062a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C1717af.f9627a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C1717af.f9628b;
            if ("a70".equals(str3) || ("Xiaomi".equals(C1717af.f9629c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C1717af.f9628b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C1717af.f9628b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C1717af.f9629c))) {
            String str6 = C1717af.f9628b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C1717af.f9629c)) {
            String str7 = C1717af.f9628b;
            if (str7.startsWith(C1801a.f10977O) || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && C1717af.f9628b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (C1732o.f9694B.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static int m7063b() {
        if (f8489n == -1) {
            int iMax = 0;
            C1576a c1576aM7059a = m7059a(C1732o.f9738h, false);
            if (c1576aM7059a != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM7016a = c1576aM7059a.m7016a();
                int length = codecProfileLevelArrM7016a.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i = codecProfileLevelArrM7016a[iMax].level;
                    int i2 = 9437184;
                    if (i != 1 && i != 2) {
                        switch (i) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    iMax2 = Math.max(i2, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, C1717af.f9627a >= 21 ? 345600 : 172800);
            }
            f8489n = iMax;
        }
        return f8489n;
    }

    /* JADX INFO: renamed from: b */
    private static Pair<Integer, Integer> m7064b(String str, String[] strArr) {
        Integer numValueOf;
        Integer numValueOf2;
        String strValueOf;
        String str2;
        String strConcat;
        if (strArr.length < 2) {
            strConcat = "Ignoring malformed AVC codec string: ".concat(String.valueOf(str));
        } else {
            try {
                if (strArr[1].length() == 6) {
                    numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                    numValueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                } else {
                    if (strArr.length < 3) {
                        Log.w(f8476a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
                        return null;
                    }
                    Integer numValueOf3 = Integer.valueOf(Integer.parseInt(strArr[1]));
                    numValueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                    numValueOf2 = numValueOf3;
                }
                int i = f8482g.get(numValueOf2.intValue(), -1);
                if (i == -1) {
                    strValueOf = String.valueOf(numValueOf2);
                    str2 = "Unknown AVC profile: ";
                } else {
                    int i2 = f8483h.get(numValueOf.intValue(), -1);
                    if (i2 != -1) {
                        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                    strValueOf = String.valueOf(numValueOf);
                    str2 = "Unknown AVC level: ";
                }
                strConcat = str2.concat(strValueOf);
            } catch (NumberFormatException unused) {
                strConcat = "Ignoring malformed AVC codec string: ".concat(String.valueOf(str));
            }
        }
        Log.w(f8476a, strConcat);
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static void m7065b(String str, boolean z) {
        try {
            m7067c(str, z);
        } catch (b e2) {
            Log.e(f8476a, "Codec warming failed", e2);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m7066b(String str) {
        if (C1717af.f9627a > 22) {
            return false;
        }
        String str2 = C1717af.f9630d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private static synchronized List<C1576a> m7067c(String str, boolean z) {
        a aVar = new a(str, z);
        HashMap<a, List<C1576a>> map = f8481f;
        List<C1576a> list = map.get(aVar);
        if (list != null) {
            return list;
        }
        int i = C1717af.f9627a;
        byte b2 = 0;
        c eVar = i >= 21 ? new e(z) : new d(b2);
        ArrayList<C1576a> arrayListM7060a = m7060a(aVar, eVar, str);
        if (z && arrayListM7060a.isEmpty() && 21 <= i && i <= 23) {
            eVar = new d(b2);
            arrayListM7060a = m7060a(aVar, eVar, str);
            if (!arrayListM7060a.isEmpty()) {
                Log.w(f8476a, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListM7060a.get(0).f8406c);
            }
        }
        if (C1732o.f9694B.equals(str)) {
            arrayListM7060a.addAll(m7060a(new a(C1732o.f9693A, aVar.f8491b), eVar, str));
        }
        m7061a(arrayListM7060a);
        List<C1576a> listUnmodifiableList = Collections.unmodifiableList(arrayListM7060a);
        map.put(aVar, listUnmodifiableList);
        return listUnmodifiableList;
    }
}
