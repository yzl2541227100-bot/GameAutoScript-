package com.anythink.expressad.exoplayer.p094e.p095a;

import androidx.core.view.ViewCompat;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p285z2.InterfaceC4047k3;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1550a {

    /* JADX INFO: renamed from: a */
    public static final int f8063a = 8;

    /* JADX INFO: renamed from: b */
    public static final int f8110b = 12;

    /* JADX INFO: renamed from: c */
    public static final int f8111c = 16;

    /* JADX INFO: renamed from: d */
    public static final int f8112d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f8113e = 0;

    /* JADX INFO: renamed from: aU */
    public final int f8135aU;

    /* JADX INFO: renamed from: f */
    public static final int f8114f = C1717af.m8116f("ftyp");

    /* JADX INFO: renamed from: g */
    public static final int f8115g = C1717af.m8116f("avc1");

    /* JADX INFO: renamed from: h */
    public static final int f8116h = C1717af.m8116f("avc3");

    /* JADX INFO: renamed from: i */
    public static final int f8117i = C1717af.m8116f("hvc1");

    /* JADX INFO: renamed from: j */
    public static final int f8118j = C1717af.m8116f("hev1");

    /* JADX INFO: renamed from: k */
    public static final int f8119k = C1717af.m8116f("s263");

    /* JADX INFO: renamed from: l */
    public static final int f8120l = C1717af.m8116f("d263");

    /* JADX INFO: renamed from: m */
    public static final int f8121m = C1717af.m8116f("mdat");

    /* JADX INFO: renamed from: n */
    public static final int f8122n = C1717af.m8116f("mp4a");

    /* JADX INFO: renamed from: o */
    public static final int f8123o = C1717af.m8116f(".mp3");

    /* JADX INFO: renamed from: p */
    public static final int f8124p = C1717af.m8116f("wave");

    /* JADX INFO: renamed from: q */
    public static final int f8125q = C1717af.m8116f("lpcm");

    /* JADX INFO: renamed from: r */
    public static final int f8126r = C1717af.m8116f("sowt");

    /* JADX INFO: renamed from: s */
    public static final int f8127s = C1717af.m8116f("ac-3");

    /* JADX INFO: renamed from: t */
    public static final int f8128t = C1717af.m8116f("dac3");

    /* JADX INFO: renamed from: u */
    public static final int f8129u = C1717af.m8116f("ec-3");

    /* JADX INFO: renamed from: v */
    public static final int f8130v = C1717af.m8116f("dec3");

    /* JADX INFO: renamed from: w */
    public static final int f8131w = C1717af.m8116f("dtsc");

    /* JADX INFO: renamed from: x */
    public static final int f8132x = C1717af.m8116f("dtsh");

    /* JADX INFO: renamed from: y */
    public static final int f8133y = C1717af.m8116f("dtsl");

    /* JADX INFO: renamed from: z */
    public static final int f8134z = C1717af.m8116f("dtse");

    /* JADX INFO: renamed from: A */
    public static final int f8037A = C1717af.m8116f("ddts");

    /* JADX INFO: renamed from: B */
    public static final int f8038B = C1717af.m8116f("tfdt");

    /* JADX INFO: renamed from: C */
    public static final int f8039C = C1717af.m8116f("tfhd");

    /* JADX INFO: renamed from: D */
    public static final int f8040D = C1717af.m8116f("trex");

    /* JADX INFO: renamed from: E */
    public static final int f8041E = C1717af.m8116f("trun");

    /* JADX INFO: renamed from: F */
    public static final int f8042F = C1717af.m8116f("sidx");

    /* JADX INFO: renamed from: G */
    public static final int f8043G = C1717af.m8116f("moov");

    /* JADX INFO: renamed from: H */
    public static final int f8044H = C1717af.m8116f("mvhd");

    /* JADX INFO: renamed from: I */
    public static final int f8045I = C1717af.m8116f("trak");

    /* JADX INFO: renamed from: J */
    public static final int f8046J = C1717af.m8116f("mdia");

    /* JADX INFO: renamed from: K */
    public static final int f8047K = C1717af.m8116f("minf");

    /* JADX INFO: renamed from: L */
    public static final int f8048L = C1717af.m8116f("stbl");

    /* JADX INFO: renamed from: M */
    public static final int f8049M = C1717af.m8116f("avcC");

    /* JADX INFO: renamed from: N */
    public static final int f8050N = C1717af.m8116f("hvcC");

    /* JADX INFO: renamed from: O */
    public static final int f8051O = C1717af.m8116f("esds");

    /* JADX INFO: renamed from: P */
    public static final int f8052P = C1717af.m8116f("moof");

    /* JADX INFO: renamed from: Q */
    public static final int f8053Q = C1717af.m8116f("traf");

    /* JADX INFO: renamed from: R */
    public static final int f8054R = C1717af.m8116f("mvex");

    /* JADX INFO: renamed from: S */
    public static final int f8055S = C1717af.m8116f("mehd");

    /* JADX INFO: renamed from: T */
    public static final int f8056T = C1717af.m8116f("tkhd");

    /* JADX INFO: renamed from: U */
    public static final int f8057U = C1717af.m8116f("edts");

    /* JADX INFO: renamed from: V */
    public static final int f8058V = C1717af.m8116f("elst");

    /* JADX INFO: renamed from: W */
    public static final int f8059W = C1717af.m8116f("mdhd");

    /* JADX INFO: renamed from: X */
    public static final int f8060X = C1717af.m8116f("hdlr");

    /* JADX INFO: renamed from: Y */
    public static final int f8061Y = C1717af.m8116f("stsd");

    /* JADX INFO: renamed from: Z */
    public static final int f8062Z = C1717af.m8116f("pssh");

    /* JADX INFO: renamed from: aa */
    public static final int f8084aa = C1717af.m8116f("sinf");

    /* JADX INFO: renamed from: ab */
    public static final int f8085ab = C1717af.m8116f("schm");

    /* JADX INFO: renamed from: ac */
    public static final int f8086ac = C1717af.m8116f("schi");

    /* JADX INFO: renamed from: ad */
    public static final int f8087ad = C1717af.m8116f("tenc");

    /* JADX INFO: renamed from: ae */
    public static final int f8088ae = C1717af.m8116f("encv");

    /* JADX INFO: renamed from: af */
    public static final int f8089af = C1717af.m8116f("enca");

    /* JADX INFO: renamed from: ag */
    public static final int f8090ag = C1717af.m8116f("frma");

    /* JADX INFO: renamed from: ah */
    public static final int f8091ah = C1717af.m8116f("saiz");

    /* JADX INFO: renamed from: ai */
    public static final int f8092ai = C1717af.m8116f("saio");

    /* JADX INFO: renamed from: aj */
    public static final int f8093aj = C1717af.m8116f("sbgp");

    /* JADX INFO: renamed from: ak */
    public static final int f8094ak = C1717af.m8116f("sgpd");

    /* JADX INFO: renamed from: al */
    public static final int f8095al = C1717af.m8116f(InterfaceC4047k3.o00000);

    /* JADX INFO: renamed from: am */
    public static final int f8096am = C1717af.m8116f("senc");

    /* JADX INFO: renamed from: an */
    public static final int f8097an = C1717af.m8116f("pasp");

    /* JADX INFO: renamed from: ao */
    public static final int f8098ao = C1717af.m8116f("TTML");

    /* JADX INFO: renamed from: ap */
    public static final int f8099ap = C1717af.m8116f("vmhd");

    /* JADX INFO: renamed from: aq */
    public static final int f8100aq = C1717af.m8116f("mp4v");

    /* JADX INFO: renamed from: ar */
    public static final int f8101ar = C1717af.m8116f("stts");

    /* JADX INFO: renamed from: as */
    public static final int f8102as = C1717af.m8116f("stss");

    /* JADX INFO: renamed from: at */
    public static final int f8103at = C1717af.m8116f("ctts");

    /* JADX INFO: renamed from: au */
    public static final int f8104au = C1717af.m8116f("stsc");

    /* JADX INFO: renamed from: av */
    public static final int f8105av = C1717af.m8116f("stsz");

    /* JADX INFO: renamed from: aw */
    public static final int f8106aw = C1717af.m8116f("stz2");

    /* JADX INFO: renamed from: ax */
    public static final int f8107ax = C1717af.m8116f("stco");

    /* JADX INFO: renamed from: ay */
    public static final int f8108ay = C1717af.m8116f("co64");

    /* JADX INFO: renamed from: az */
    public static final int f8109az = C1717af.m8116f("tx3g");

    /* JADX INFO: renamed from: aA */
    public static final int f8064aA = C1717af.m8116f("wvtt");

    /* JADX INFO: renamed from: aB */
    public static final int f8065aB = C1717af.m8116f("stpp");

    /* JADX INFO: renamed from: aC */
    public static final int f8066aC = C1717af.m8116f("c608");

    /* JADX INFO: renamed from: aD */
    public static final int f8067aD = C1717af.m8116f("samr");

    /* JADX INFO: renamed from: aE */
    public static final int f8068aE = C1717af.m8116f("sawb");

    /* JADX INFO: renamed from: aF */
    public static final int f8069aF = C1717af.m8116f("udta");

    /* JADX INFO: renamed from: aG */
    public static final int f8070aG = C1717af.m8116f("meta");

    /* JADX INFO: renamed from: aH */
    public static final int f8071aH = C1717af.m8116f("ilst");

    /* JADX INFO: renamed from: aI */
    public static final int f8072aI = C1717af.m8116f("mean");

    /* JADX INFO: renamed from: aJ */
    public static final int f8073aJ = C1717af.m8116f("name");

    /* JADX INFO: renamed from: aK */
    public static final int f8074aK = C1717af.m8116f("data");

    /* JADX INFO: renamed from: aL */
    public static final int f8075aL = C1717af.m8116f("emsg");

    /* JADX INFO: renamed from: aM */
    public static final int f8076aM = C1717af.m8116f("st3d");

    /* JADX INFO: renamed from: aN */
    public static final int f8077aN = C1717af.m8116f("sv3d");

    /* JADX INFO: renamed from: aO */
    public static final int f8078aO = C1717af.m8116f("proj");

    /* JADX INFO: renamed from: aP */
    public static final int f8079aP = C1717af.m8116f("vp08");

    /* JADX INFO: renamed from: aQ */
    public static final int f8080aQ = C1717af.m8116f("vp09");

    /* JADX INFO: renamed from: aR */
    public static final int f8081aR = C1717af.m8116f("vpcC");

    /* JADX INFO: renamed from: aS */
    public static final int f8082aS = C1717af.m8116f("camm");

    /* JADX INFO: renamed from: aT */
    public static final int f8083aT = C1717af.m8116f("alac");

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.a$a */
    public static final class a extends AbstractC1550a {

        /* JADX INFO: renamed from: aV */
        public final long f8136aV;

        /* JADX INFO: renamed from: aW */
        public final List<b> f8137aW;

        /* JADX INFO: renamed from: aX */
        public final List<a> f8138aX;

        public a(int i, long j) {
            super(i);
            this.f8136aV = j;
            this.f8137aW = new ArrayList();
            this.f8138aX = new ArrayList();
        }

        /* JADX INFO: renamed from: f */
        private int m6826f(int i) {
            int size = this.f8137aW.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                if (this.f8137aW.get(i3).f8135aU == i) {
                    i2++;
                }
            }
            int size2 = this.f8138aX.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (this.f8138aX.get(i4).f8135aU == i) {
                    i2++;
                }
            }
            return i2;
        }

        /* JADX INFO: renamed from: a */
        public final void m6827a(a aVar) {
            this.f8138aX.add(aVar);
        }

        /* JADX INFO: renamed from: a */
        public final void m6828a(b bVar) {
            this.f8137aW.add(bVar);
        }

        /* JADX INFO: renamed from: d */
        public final b m6829d(int i) {
            int size = this.f8137aW.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.f8137aW.get(i2);
                if (bVar.f8135aU == i) {
                    return bVar;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final a m6830e(int i) {
            int size = this.f8138aX.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.f8138aX.get(i2);
                if (aVar.f8135aU == i) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // com.anythink.expressad.exoplayer.p094e.p095a.AbstractC1550a
        public final String toString() {
            return AbstractC1550a.m6825c(this.f8135aU) + " leaves: " + Arrays.toString(this.f8137aW.toArray()) + " containers: " + Arrays.toString(this.f8138aX.toArray());
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.a$b */
    public static final class b extends AbstractC1550a {

        /* JADX INFO: renamed from: aV */
        public final C1736s f8139aV;

        public b(int i, C1736s c1736s) {
            super(i);
            this.f8139aV = c1736s;
        }
    }

    public AbstractC1550a(int i) {
        this.f8135aU = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m6823a(int i) {
        return (i >> 24) & 255;
    }

    /* JADX INFO: renamed from: b */
    public static int m6824b(int i) {
        return i & ViewCompat.MEASURED_SIZE_MASK;
    }

    /* JADX INFO: renamed from: c */
    public static String m6825c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m6825c(this.f8135aU);
    }
}
