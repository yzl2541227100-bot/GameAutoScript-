package com.anythink.expressad.exoplayer.p094e.p095a;

import android.util.Log;
import com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h;
import com.anythink.expressad.exoplayer.p097g.p099b.C1586a;
import com.anythink.expressad.exoplayer.p097g.p099b.C1590e;
import com.anythink.expressad.exoplayer.p097g.p099b.C1594i;
import com.anythink.expressad.exoplayer.p097g.p099b.C1596k;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1736s;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1555f {

    /* JADX INFO: renamed from: F */
    private static final String f8250F = "und";

    /* JADX INFO: renamed from: a */
    private static final String f8251a = "MetadataUtil";

    /* JADX INFO: renamed from: b */
    private static final int f8252b = C1717af.m8116f("nam");

    /* JADX INFO: renamed from: c */
    private static final int f8253c = C1717af.m8116f("trk");

    /* JADX INFO: renamed from: d */
    private static final int f8254d = C1717af.m8116f("cmt");

    /* JADX INFO: renamed from: e */
    private static final int f8255e = C1717af.m8116f("day");

    /* JADX INFO: renamed from: f */
    private static final int f8256f = C1717af.m8116f("ART");

    /* JADX INFO: renamed from: g */
    private static final int f8257g = C1717af.m8116f("too");

    /* JADX INFO: renamed from: h */
    private static final int f8258h = C1717af.m8116f("alb");

    /* JADX INFO: renamed from: i */
    private static final int f8259i = C1717af.m8116f("com");

    /* JADX INFO: renamed from: j */
    private static final int f8260j = C1717af.m8116f("wrt");

    /* JADX INFO: renamed from: k */
    private static final int f8261k = C1717af.m8116f("lyr");

    /* JADX INFO: renamed from: l */
    private static final int f8262l = C1717af.m8116f("gen");

    /* JADX INFO: renamed from: m */
    private static final int f8263m = C1717af.m8116f("covr");

    /* JADX INFO: renamed from: n */
    private static final int f8264n = C1717af.m8116f("gnre");

    /* JADX INFO: renamed from: o */
    private static final int f8265o = C1717af.m8116f("grp");

    /* JADX INFO: renamed from: p */
    private static final int f8266p = C1717af.m8116f("disk");

    /* JADX INFO: renamed from: q */
    private static final int f8267q = C1717af.m8116f("trkn");

    /* JADX INFO: renamed from: r */
    private static final int f8268r = C1717af.m8116f("tmpo");

    /* JADX INFO: renamed from: s */
    private static final int f8269s = C1717af.m8116f("cpil");

    /* JADX INFO: renamed from: t */
    private static final int f8270t = C1717af.m8116f("aART");

    /* JADX INFO: renamed from: u */
    private static final int f8271u = C1717af.m8116f("sonm");

    /* JADX INFO: renamed from: v */
    private static final int f8272v = C1717af.m8116f("soal");

    /* JADX INFO: renamed from: w */
    private static final int f8273w = C1717af.m8116f("soar");

    /* JADX INFO: renamed from: x */
    private static final int f8274x = C1717af.m8116f("soaa");

    /* JADX INFO: renamed from: y */
    private static final int f8275y = C1717af.m8116f("soco");

    /* JADX INFO: renamed from: z */
    private static final int f8276z = C1717af.m8116f("rtng");

    /* JADX INFO: renamed from: A */
    private static final int f8245A = C1717af.m8116f("pgap");

    /* JADX INFO: renamed from: B */
    private static final int f8246B = C1717af.m8116f("sosn");

    /* JADX INFO: renamed from: C */
    private static final int f8247C = C1717af.m8116f("tvsh");

    /* JADX INFO: renamed from: D */
    private static final int f8248D = C1717af.m8116f(C1594i.f8556a);

    /* JADX INFO: renamed from: E */
    private static final String[] f8249E = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private C1555f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.anythink.expressad.exoplayer.p097g.C1582a.a m6911a(com.anythink.expressad.exoplayer.p107k.C1736s r8) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1555f.m6911a(com.anythink.expressad.exoplayer.k.s):com.anythink.expressad.exoplayer.g.a$a");
    }

    /* JADX INFO: renamed from: a */
    private static C1590e m6912a(int i, C1736s c1736s) {
        int iM8280i = c1736s.m8280i();
        if (c1736s.m8280i() == AbstractC1550a.f8074aK) {
            c1736s.m8274d(8);
            String strM8276e = c1736s.m8276e(iM8280i - 16);
            return new C1590e("und", strM8276e, strM8276e);
        }
        Log.w(f8251a, "Failed to parse comment attribute: " + AbstractC1550a.m6825c(i));
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC1593h m6913a(int i, String str, C1736s c1736s, boolean z, boolean z3) {
        int iM6919d = m6919d(c1736s);
        if (z3) {
            iM6919d = Math.min(1, iM6919d);
        }
        if (iM6919d >= 0) {
            return z ? new C1596k(str, null, Integer.toString(iM6919d)) : new C1590e("und", str, Integer.toString(iM6919d));
        }
        Log.w(f8251a, "Failed to parse uint8 attribute: " + AbstractC1550a.m6825c(i));
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC1593h m6914a(C1736s c1736s, int i) {
        String strM8276e = null;
        String strM8276e2 = null;
        int i2 = -1;
        int i3 = -1;
        while (c1736s.m8271c() < i) {
            int iM8271c = c1736s.m8271c();
            int iM8280i = c1736s.m8280i();
            int iM8280i2 = c1736s.m8280i();
            c1736s.m8274d(4);
            if (iM8280i2 == AbstractC1550a.f8072aI) {
                strM8276e = c1736s.m8276e(iM8280i - 12);
            } else if (iM8280i2 == AbstractC1550a.f8073aJ) {
                strM8276e2 = c1736s.m8276e(iM8280i - 12);
            } else {
                if (iM8280i2 == AbstractC1550a.f8074aK) {
                    i2 = iM8271c;
                    i3 = iM8280i;
                }
                c1736s.m8274d(iM8280i - 12);
            }
        }
        if (strM8276e == null || strM8276e2 == null || i2 == -1) {
            return null;
        }
        c1736s.m8272c(i2);
        c1736s.m8274d(16);
        return new C1594i(strM8276e, strM8276e2, c1736s.m8276e(i3 - 16));
    }

    /* JADX INFO: renamed from: a */
    private static C1596k m6915a(int i, String str, C1736s c1736s) {
        int iM8280i = c1736s.m8280i();
        if (c1736s.m8280i() == AbstractC1550a.f8074aK) {
            c1736s.m8274d(8);
            return new C1596k(str, null, c1736s.m8276e(iM8280i - 16));
        }
        Log.w(f8251a, "Failed to parse text attribute: " + AbstractC1550a.m6825c(i));
        return null;
    }

    /* JADX INFO: renamed from: b */
    private static C1596k m6916b(int i, String str, C1736s c1736s) {
        int iM8280i = c1736s.m8280i();
        if (c1736s.m8280i() == AbstractC1550a.f8074aK && iM8280i >= 22) {
            c1736s.m8274d(10);
            int iM8275e = c1736s.m8275e();
            if (iM8275e > 0) {
                String strValueOf = String.valueOf(iM8275e);
                int iM8275e2 = c1736s.m8275e();
                if (iM8275e2 > 0) {
                    strValueOf = strValueOf + "/" + iM8275e2;
                }
                return new C1596k(str, null, strValueOf);
            }
        }
        Log.w(f8251a, "Failed to parse index/count attribute: " + AbstractC1550a.m6825c(i));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.anythink.expressad.exoplayer.p097g.p099b.C1596k m6917b(com.anythink.expressad.exoplayer.p107k.C1736s r3) {
        /*
            int r3 = m6919d(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.anythink.expressad.exoplayer.p094e.p095a.C1555f.f8249E
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.anythink.expressad.exoplayer.g.b.k r1 = new com.anythink.expressad.exoplayer.g.b.k
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1555f.m6917b(com.anythink.expressad.exoplayer.k.s):com.anythink.expressad.exoplayer.g.b.k");
    }

    /* JADX INFO: renamed from: c */
    private static C1586a m6918c(C1736s c1736s) {
        String strConcat;
        int iM8280i = c1736s.m8280i();
        if (c1736s.m8280i() == AbstractC1550a.f8074aK) {
            int iM6824b = AbstractC1550a.m6824b(c1736s.m8280i());
            String str = iM6824b == 13 ? "image/jpeg" : iM6824b == 14 ? "image/png" : null;
            if (str != null) {
                c1736s.m8274d(4);
                int i = iM8280i - 16;
                byte[] bArr = new byte[i];
                c1736s.m8268a(bArr, 0, i);
                return new C1586a(str, null, 3, bArr);
            }
            strConcat = "Unrecognized cover art flags: ".concat(String.valueOf(iM6824b));
        } else {
            strConcat = "Failed to parse cover art attribute";
        }
        Log.w(f8251a, strConcat);
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static int m6919d(C1736s c1736s) {
        c1736s.m8274d(4);
        if (c1736s.m8280i() == AbstractC1550a.f8074aK) {
            c1736s.m8274d(8);
            return c1736s.m8273d();
        }
        Log.w(f8251a, "Failed to parse uint8 attribute value");
        return -1;
    }
}
