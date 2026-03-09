package com.anythink.core.common.p055f;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.common.p052c.C1186g;
import com.anythink.core.common.p065n.C1319b;
import com.anythink.core.p072d.C1396f;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.h */
/* JADX INFO: loaded from: classes.dex */
public class C1243h extends AbstractC1228au implements Cloneable {

    /* JADX INFO: renamed from: a */
    public static final int f4119a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f4120b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f4121c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f4122d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f4123e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f4124f = 6;

    /* JADX INFO: renamed from: g */
    public static final int f4125g = 7;

    /* JADX INFO: renamed from: h */
    public static final int f4126h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f4127i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f4128j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f4129k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f4130l = 0;

    /* JADX INFO: renamed from: m */
    public static final int f4131m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f4132n = 2;

    /* JADX INFO: renamed from: A */
    public int f4133A;

    /* JADX INFO: renamed from: B */
    public String f4134B;

    /* JADX INFO: renamed from: C */
    public int f4135C;

    /* JADX INFO: renamed from: D */
    public int f4136D;

    /* JADX INFO: renamed from: E */
    public int f4137E;

    /* JADX INFO: renamed from: F */
    public int f4138F;

    /* JADX INFO: renamed from: G */
    public double f4139G;

    /* JADX INFO: renamed from: H */
    public boolean f4140H;

    /* JADX INFO: renamed from: I */
    public int f4141I;

    /* JADX INFO: renamed from: J */
    public String f4142J;

    /* JADX INFO: renamed from: K */
    public long f4143K;

    /* JADX INFO: renamed from: L */
    public long f4144L;

    /* JADX INFO: renamed from: M */
    public String f4145M;

    /* JADX INFO: renamed from: aA */
    private String f4146aA;

    /* JADX INFO: renamed from: aB */
    private int f4147aB;

    /* JADX INFO: renamed from: aD */
    private int f4149aD;

    /* JADX INFO: renamed from: aE */
    private int f4150aE;

    /* JADX INFO: renamed from: aF */
    private boolean f4151aF;

    /* JADX INFO: renamed from: aG */
    private long f4152aG;

    /* JADX INFO: renamed from: aH */
    private long f4153aH;

    /* JADX INFO: renamed from: aI */
    private String f4154aI;

    /* JADX INFO: renamed from: aJ */
    private String f4155aJ;

    /* JADX INFO: renamed from: aK */
    private String f4156aK;

    /* JADX INFO: renamed from: aL */
    private int f4157aL;

    /* JADX INFO: renamed from: aN */
    private String f4159aN;

    /* JADX INFO: renamed from: aO */
    private String f4160aO;

    /* JADX INFO: renamed from: aP */
    private double f4161aP;

    /* JADX INFO: renamed from: aQ */
    private String f4162aQ;

    /* JADX INFO: renamed from: aR */
    private double f4163aR;

    /* JADX INFO: renamed from: aS */
    private double f4164aS;

    /* JADX INFO: renamed from: aT */
    private String f4165aT;

    /* JADX INFO: renamed from: aU */
    private String f4166aU;

    /* JADX INFO: renamed from: aV */
    private String f4167aV;

    /* JADX INFO: renamed from: aW */
    private int f4168aW;

    /* JADX INFO: renamed from: aX */
    private int f4169aX;

    /* JADX INFO: renamed from: aY */
    private String f4170aY;

    /* JADX INFO: renamed from: aZ */
    private long f4171aZ;

    /* JADX INFO: renamed from: av */
    private int f4172av;

    /* JADX INFO: renamed from: aw */
    private String f4173aw;

    /* JADX INFO: renamed from: ax */
    private String f4174ax;

    /* JADX INFO: renamed from: ay */
    private int f4175ay;

    /* JADX INFO: renamed from: az */
    private int f4176az;

    /* JADX INFO: renamed from: bA */
    private int f4177bA;

    /* JADX INFO: renamed from: bC */
    private int f4179bC;

    /* JADX INFO: renamed from: bD */
    private String f4180bD;

    /* JADX INFO: renamed from: bE */
    private long f4181bE;

    /* JADX INFO: renamed from: bF */
    private long f4182bF;

    /* JADX INFO: renamed from: bG */
    private boolean f4183bG;

    /* JADX INFO: renamed from: bH */
    private long f4184bH;

    /* JADX INFO: renamed from: ba */
    private int f4185ba;

    /* JADX INFO: renamed from: bb */
    private int f4186bb;

    /* JADX INFO: renamed from: bc */
    private int f4187bc;

    /* JADX INFO: renamed from: bd */
    private int f4188bd;

    /* JADX INFO: renamed from: be */
    private int f4189be;

    /* JADX INFO: renamed from: bf */
    private long f4190bf;

    /* JADX INFO: renamed from: bh */
    private int f4192bh;

    /* JADX INFO: renamed from: bi */
    private int f4193bi;

    /* JADX INFO: renamed from: bl */
    private int f4196bl;

    /* JADX INFO: renamed from: bm */
    private String f4197bm;

    /* JADX INFO: renamed from: bn */
    private int f4198bn;

    /* JADX INFO: renamed from: bo */
    private ATRewardInfo f4199bo;

    /* JADX INFO: renamed from: bp */
    private Map<String, ATRewardInfo> f4200bp;

    /* JADX INFO: renamed from: bq */
    private Map<String, Object> f4201bq;

    /* JADX INFO: renamed from: br */
    private Map<String, Object> f4202br;

    /* JADX INFO: renamed from: bs */
    private C1238c f4203bs;

    /* JADX INFO: renamed from: bt */
    private Map<String, Object> f4204bt;

    /* JADX INFO: renamed from: bu */
    private boolean f4205bu;

    /* JADX INFO: renamed from: bv */
    private double f4206bv;

    /* JADX INFO: renamed from: bw */
    private int f4207bw;

    /* JADX INFO: renamed from: bx */
    private int f4208bx;

    /* JADX INFO: renamed from: by */
    private int f4209by;

    /* JADX INFO: renamed from: bz */
    private double f4210bz;

    /* JADX INFO: renamed from: o */
    public int f4211o;

    /* JADX INFO: renamed from: t */
    public int f4216t;

    /* JADX INFO: renamed from: u */
    public String f4217u;

    /* JADX INFO: renamed from: v */
    public int f4218v;

    /* JADX INFO: renamed from: w */
    public double f4219w;

    /* JADX INFO: renamed from: x */
    public String f4220x;

    /* JADX INFO: renamed from: y */
    public int f4221y;

    /* JADX INFO: renamed from: z */
    public int f4222z;

    /* JADX INFO: renamed from: aC */
    private int f4148aC = -1;

    /* JADX INFO: renamed from: p */
    public String f4212p = "";

    /* JADX INFO: renamed from: q */
    public int f4213q = 0;

    /* JADX INFO: renamed from: r */
    public int f4214r = 0;

    /* JADX INFO: renamed from: s */
    public int f4215s = 0;

    /* JADX INFO: renamed from: aM */
    private String f4158aM = "unknow";

    /* JADX INFO: renamed from: bg */
    private int f4191bg = -1;

    /* JADX INFO: renamed from: bj */
    private int f4194bj = 1;

    /* JADX INFO: renamed from: bk */
    private int f4195bk = 13;

    /* JADX INFO: renamed from: bB */
    private int f4178bB = 1;

    /* JADX INFO: renamed from: A */
    private void m2981A(String str) {
        this.f4217u = str;
    }

    /* JADX INFO: renamed from: O */
    private void m2982O(int i) {
        this.f4213q = i;
    }

    /* JADX INFO: renamed from: P */
    private void m2983P(int i) {
        this.f4214r = i;
    }

    /* JADX INFO: renamed from: Q */
    private void m2984Q(int i) {
        this.f4215s = i;
    }

    /* JADX INFO: renamed from: R */
    private void m2985R(int i) {
        this.f4216t = i;
    }

    /* JADX INFO: renamed from: S */
    private JSONObject m2986S(int i) {
        return super.mo2660F(i);
    }

    /* JADX INFO: renamed from: a */
    private void m2987a(int i, JSONObject jSONObject) throws JSONException {
        if (i == 1 || i == 2 || i == 4 || i == 6 || i == 13) {
            jSONObject.put(C1186g.a.f3498h, this.f4166aU);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2988a(JSONObject jSONObject, int i) {
        int i2;
        try {
            if (TextUtils.equals(this.f3923al, "2")) {
                if (i == 1 || i == 2 || i == 4 || i == 13 || i == 11 || i == 6) {
                    if (this.f4191bg == 0 || i == 11) {
                        StringBuilder sb = new StringBuilder("Banner广告上使用自渲染原生广告 >>> tk = ");
                        sb.append(i);
                        sb.append(" bnTemplateId = ");
                        sb.append(this.f4209by);
                        sb.append(" bnClickArea = ");
                        sb.append(this.f4208bx);
                        jSONObject.put(C1396f.a.f6081aq, this.f4209by);
                    }
                    Map<String, Object> map = this.f4202br;
                    if (map != null) {
                        Object obj = map.get(ATAdConst.KEY.AD_WIDTH);
                        Object obj2 = this.f4202br.get(ATAdConst.KEY.AD_HEIGHT);
                        if (obj != null) {
                            try {
                                jSONObject.put("bn_width", Integer.parseInt(obj.toString()));
                            } catch (Exception e) {
                                new StringBuilder("parse ad width failed: ").append(e.getMessage());
                            }
                        }
                        if (obj2 != null) {
                            try {
                                jSONObject.put("bn_height", Integer.parseInt(obj2.toString()));
                            } catch (Exception e2) {
                                new StringBuilder("parse ad height failed: ").append(e2.getMessage());
                            }
                        }
                    }
                    if (i != 6 || (i2 = this.f4208bx) == 0) {
                        return;
                    }
                    jSONObject.put("bn_click_area", i2);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: aA */
    private int m2989aA() {
        return this.f4216t;
    }

    /* JADX INFO: renamed from: aB */
    private boolean m2990aB() {
        return this.f4140H;
    }

    /* JADX INFO: renamed from: aC */
    private int m2991aC() {
        return this.f4141I;
    }

    /* JADX INFO: renamed from: aD */
    private String m2992aD() {
        return this.f4142J;
    }

    /* JADX INFO: renamed from: aE */
    private long m2993aE() {
        return this.f4143K;
    }

    /* JADX INFO: renamed from: aF */
    private long m2994aF() {
        return this.f4144L;
    }

    /* JADX INFO: renamed from: aG */
    private String m2995aG() {
        return this.f4145M;
    }

    /* JADX INFO: renamed from: aH */
    private int m2996aH() {
        return this.f4208bx;
    }

    /* JADX INFO: renamed from: aI */
    private int m2997aI() {
        return this.f4209by;
    }

    /* JADX INFO: renamed from: al */
    private int m2998al() {
        return this.f4177bA;
    }

    /* JADX INFO: renamed from: am */
    private C1238c m2999am() {
        return this.f4203bs;
    }

    /* JADX INFO: renamed from: an */
    private double m3000an() {
        return this.f4206bv;
    }

    /* JADX INFO: renamed from: ao */
    private boolean m3001ao() {
        return this.f4205bu;
    }

    /* JADX INFO: renamed from: ap */
    private double m3002ap() {
        return this.f4139G;
    }

    /* JADX INFO: renamed from: aq */
    private int m3003aq() {
        return this.f4187bc;
    }

    /* JADX INFO: renamed from: ar */
    private int m3004ar() {
        return this.f4186bb;
    }

    /* JADX INFO: renamed from: as */
    private String m3005as() {
        return this.f4134B;
    }

    /* JADX INFO: renamed from: at */
    private int m3006at() {
        return this.f4221y;
    }

    /* JADX INFO: renamed from: au */
    private void m3007au() {
        this.f4221y = 1;
    }

    /* JADX INFO: renamed from: av */
    private String m3008av() {
        return this.f4217u;
    }

    /* JADX INFO: renamed from: aw */
    private boolean m3009aw() {
        return this.f4188bd == 9;
    }

    /* JADX INFO: renamed from: ax */
    private String m3010ax() {
        return this.f4173aw;
    }

    /* JADX INFO: renamed from: ay */
    private int m3011ay() {
        return this.f4213q;
    }

    /* JADX INFO: renamed from: az */
    private int m3012az() {
        return this.f4214r;
    }

    /* JADX INFO: renamed from: b */
    private void m3013b(JSONObject jSONObject, int i) {
        C1319b c1319bM3821a = C1319b.m3821a();
        try {
            if (i != 4) {
                if (i == 6 && this.f4211o == 66) {
                    long jM3823b = C1319b.m3823b(this);
                    if (jM3823b > 0) {
                        jSONObject.put("s_c_interval", jM3823b);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("0".equals(this.f3923al)) {
                return;
            }
            long jM3831a = c1319bM3821a.m3831a(this);
            if (jM3831a > 0) {
                jSONObject.put("pl_show_interval", jM3831a);
            }
            long jM3836b = c1319bM3821a.m3836b();
            if (jM3836b > 0) {
                jSONObject.put("bidads_show_interval", jM3836b);
            }
        } catch (Throwable th) {
            new StringBuilder("fillAdShowInterval() >>> ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m3014d(boolean z) {
        this.f4151aF = z;
    }

    /* JADX INFO: renamed from: z */
    private void m3015z(String str) {
        this.f4134B = str;
    }

    /* JADX INFO: renamed from: A */
    public final Map<String, Object> m3016A() {
        return this.f4201bq;
    }

    /* JADX INFO: renamed from: A */
    public final void m3017A(int i) {
        this.f4191bg = i;
    }

    /* JADX INFO: renamed from: B */
    public final int m3018B() {
        return this.f4222z;
    }

    /* JADX INFO: renamed from: B */
    public final void m3019B(int i) {
        this.f4194bj = i;
    }

    /* JADX INFO: renamed from: C */
    public final int m3020C() {
        return this.f4133A;
    }

    /* JADX INFO: renamed from: C */
    public final void m3021C(int i) {
        this.f4195bk = i;
    }

    /* JADX INFO: renamed from: D */
    public final int m3022D() {
        return this.f4218v;
    }

    /* JADX INFO: renamed from: D */
    public final void m3023D(int i) {
        this.f4196bl = i;
    }

    /* JADX INFO: renamed from: E */
    public final double m3024E() {
        return this.f4219w;
    }

    /* JADX INFO: renamed from: E */
    public final void m3025E(int i) {
        this.f4141I = i;
    }

    /* JADX INFO: renamed from: F */
    public final String m3026F() {
        return this.f4154aI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(12:233|235|(15:456|236|(1:238)|239|(1:241)|242|(4:458|248|(1:250)|251)|(1:259)|260|(1:262)|263|(1:265)|266|(1:268)|269)|(2:451|SW:270)|460|385|(6:399|(1:403)|404|(3:406|(2:449|408)|(2:452|413))|417|(1:421))|422|464|(2:424|(2:429|(2:431|432)))(2:433|(4:435|(1:437)|438|(2:440|432)))|444|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x055c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x055d, code lost:
    
        new java.lang.StringBuilder("fillAdShowInterval() >>> ").append(r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x014b A[Catch: Exception -> 0x022f, TryCatch #1 {Exception -> 0x022f, blocks: (B:277:0x00f0, B:278:0x00f8, B:282:0x0111, B:281:0x010a, B:283:0x0116, B:287:0x0152, B:289:0x0176, B:290:0x017b, B:293:0x0197, B:286:0x014b, B:294:0x019c, B:296:0x01ad, B:299:0x01b4, B:300:0x01bf, B:298:0x01b1, B:301:0x01c4, B:305:0x01e9, B:307:0x01f1, B:308:0x01fc, B:309:0x0201, B:304:0x01e2, B:310:0x020d, B:314:0x0216, B:317:0x0234, B:319:0x025c, B:325:0x027f, B:327:0x0287, B:328:0x028c, B:330:0x0291, B:332:0x0295, B:320:0x026a, B:324:0x027c, B:336:0x02af, B:344:0x0322, B:346:0x034a, B:352:0x0369, B:354:0x0383, B:355:0x0388, B:347:0x0356, B:351:0x0366, B:338:0x02e5, B:340:0x030c, B:341:0x0313, B:343:0x031b), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0176 A[Catch: Exception -> 0x022f, TryCatch #1 {Exception -> 0x022f, blocks: (B:277:0x00f0, B:278:0x00f8, B:282:0x0111, B:281:0x010a, B:283:0x0116, B:287:0x0152, B:289:0x0176, B:290:0x017b, B:293:0x0197, B:286:0x014b, B:294:0x019c, B:296:0x01ad, B:299:0x01b4, B:300:0x01bf, B:298:0x01b1, B:301:0x01c4, B:305:0x01e9, B:307:0x01f1, B:308:0x01fc, B:309:0x0201, B:304:0x01e2, B:310:0x020d, B:314:0x0216, B:317:0x0234, B:319:0x025c, B:325:0x027f, B:327:0x0287, B:328:0x028c, B:330:0x0291, B:332:0x0295, B:320:0x026a, B:324:0x027c, B:336:0x02af, B:344:0x0322, B:346:0x034a, B:352:0x0369, B:354:0x0383, B:355:0x0388, B:347:0x0356, B:351:0x0366, B:338:0x02e5, B:340:0x030c, B:341:0x0313, B:343:0x031b), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0197 A[Catch: Exception -> 0x022f, TryCatch #1 {Exception -> 0x022f, blocks: (B:277:0x00f0, B:278:0x00f8, B:282:0x0111, B:281:0x010a, B:283:0x0116, B:287:0x0152, B:289:0x0176, B:290:0x017b, B:293:0x0197, B:286:0x014b, B:294:0x019c, B:296:0x01ad, B:299:0x01b4, B:300:0x01bf, B:298:0x01b1, B:301:0x01c4, B:305:0x01e9, B:307:0x01f1, B:308:0x01fc, B:309:0x0201, B:304:0x01e2, B:310:0x020d, B:314:0x0216, B:317:0x0234, B:319:0x025c, B:325:0x027f, B:327:0x0287, B:328:0x028c, B:330:0x0291, B:332:0x0295, B:320:0x026a, B:324:0x027c, B:336:0x02af, B:344:0x0322, B:346:0x034a, B:352:0x0369, B:354:0x0383, B:355:0x0388, B:347:0x0356, B:351:0x0366, B:338:0x02e5, B:340:0x030c, B:341:0x0313, B:343:0x031b), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01b1 A[Catch: Exception -> 0x022f, TryCatch #1 {Exception -> 0x022f, blocks: (B:277:0x00f0, B:278:0x00f8, B:282:0x0111, B:281:0x010a, B:283:0x0116, B:287:0x0152, B:289:0x0176, B:290:0x017b, B:293:0x0197, B:286:0x014b, B:294:0x019c, B:296:0x01ad, B:299:0x01b4, B:300:0x01bf, B:298:0x01b1, B:301:0x01c4, B:305:0x01e9, B:307:0x01f1, B:308:0x01fc, B:309:0x0201, B:304:0x01e2, B:310:0x020d, B:314:0x0216, B:317:0x0234, B:319:0x025c, B:325:0x027f, B:327:0x0287, B:328:0x028c, B:330:0x0291, B:332:0x0295, B:320:0x026a, B:324:0x027c, B:336:0x02af, B:344:0x0322, B:346:0x034a, B:352:0x0369, B:354:0x0383, B:355:0x0388, B:347:0x0356, B:351:0x0366, B:338:0x02e5, B:340:0x030c, B:341:0x0313, B:343:0x031b), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x034a A[Catch: Exception -> 0x022f, TryCatch #1 {Exception -> 0x022f, blocks: (B:277:0x00f0, B:278:0x00f8, B:282:0x0111, B:281:0x010a, B:283:0x0116, B:287:0x0152, B:289:0x0176, B:290:0x017b, B:293:0x0197, B:286:0x014b, B:294:0x019c, B:296:0x01ad, B:299:0x01b4, B:300:0x01bf, B:298:0x01b1, B:301:0x01c4, B:305:0x01e9, B:307:0x01f1, B:308:0x01fc, B:309:0x0201, B:304:0x01e2, B:310:0x020d, B:314:0x0216, B:317:0x0234, B:319:0x025c, B:325:0x027f, B:327:0x0287, B:328:0x028c, B:330:0x0291, B:332:0x0295, B:320:0x026a, B:324:0x027c, B:336:0x02af, B:344:0x0322, B:346:0x034a, B:352:0x0369, B:354:0x0383, B:355:0x0388, B:347:0x0356, B:351:0x0366, B:338:0x02e5, B:340:0x030c, B:341:0x0313, B:343:0x031b), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0356 A[Catch: Exception -> 0x022f, TryCatch #1 {Exception -> 0x022f, blocks: (B:277:0x00f0, B:278:0x00f8, B:282:0x0111, B:281:0x010a, B:283:0x0116, B:287:0x0152, B:289:0x0176, B:290:0x017b, B:293:0x0197, B:286:0x014b, B:294:0x019c, B:296:0x01ad, B:299:0x01b4, B:300:0x01bf, B:298:0x01b1, B:301:0x01c4, B:305:0x01e9, B:307:0x01f1, B:308:0x01fc, B:309:0x0201, B:304:0x01e2, B:310:0x020d, B:314:0x0216, B:317:0x0234, B:319:0x025c, B:325:0x027f, B:327:0x0287, B:328:0x028c, B:330:0x0291, B:332:0x0295, B:320:0x026a, B:324:0x027c, B:336:0x02af, B:344:0x0322, B:346:0x034a, B:352:0x0369, B:354:0x0383, B:355:0x0388, B:347:0x0356, B:351:0x0366, B:338:0x02e5, B:340:0x030c, B:341:0x0313, B:343:0x031b), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0383 A[Catch: Exception -> 0x022f, TryCatch #1 {Exception -> 0x022f, blocks: (B:277:0x00f0, B:278:0x00f8, B:282:0x0111, B:281:0x010a, B:283:0x0116, B:287:0x0152, B:289:0x0176, B:290:0x017b, B:293:0x0197, B:286:0x014b, B:294:0x019c, B:296:0x01ad, B:299:0x01b4, B:300:0x01bf, B:298:0x01b1, B:301:0x01c4, B:305:0x01e9, B:307:0x01f1, B:308:0x01fc, B:309:0x0201, B:304:0x01e2, B:310:0x020d, B:314:0x0216, B:317:0x0234, B:319:0x025c, B:325:0x027f, B:327:0x0287, B:328:0x028c, B:330:0x0291, B:332:0x0295, B:320:0x026a, B:324:0x027c, B:336:0x02af, B:344:0x0322, B:346:0x034a, B:352:0x0369, B:354:0x0383, B:355:0x0388, B:347:0x0356, B:351:0x0366, B:338:0x02e5, B:340:0x030c, B:341:0x0313, B:343:0x031b), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x03a3 A[Catch: Exception -> 0x00da, TRY_ENTER, TryCatch #5 {Exception -> 0x00da, blocks: (B:272:0x00d2, B:275:0x00dd, B:358:0x03a3, B:359:0x03b1, B:361:0x03b5, B:362:0x03ba, B:364:0x03be, B:365:0x03c3, B:367:0x03c8, B:369:0x03cc, B:373:0x03e4, B:375:0x0429, B:376:0x042d, B:378:0x0436, B:379:0x043a, B:377:0x0431, B:380:0x043e), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x03b5 A[Catch: Exception -> 0x00da, TryCatch #5 {Exception -> 0x00da, blocks: (B:272:0x00d2, B:275:0x00dd, B:358:0x03a3, B:359:0x03b1, B:361:0x03b5, B:362:0x03ba, B:364:0x03be, B:365:0x03c3, B:367:0x03c8, B:369:0x03cc, B:373:0x03e4, B:375:0x0429, B:376:0x042d, B:378:0x0436, B:379:0x043a, B:377:0x0431, B:380:0x043e), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x03be A[Catch: Exception -> 0x00da, TryCatch #5 {Exception -> 0x00da, blocks: (B:272:0x00d2, B:275:0x00dd, B:358:0x03a3, B:359:0x03b1, B:361:0x03b5, B:362:0x03ba, B:364:0x03be, B:365:0x03c3, B:367:0x03c8, B:369:0x03cc, B:373:0x03e4, B:375:0x0429, B:376:0x042d, B:378:0x0436, B:379:0x043a, B:377:0x0431, B:380:0x043e), top: B:451:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0498 A[Catch: Exception -> 0x0519, TryCatch #7 {Exception -> 0x0519, blocks: (B:385:0x0472, B:399:0x0490, B:404:0x04bd, B:406:0x04c1, B:416:0x04ff, B:411:0x04e0, B:419:0x0510, B:421:0x0514, B:403:0x0498, B:408:0x04d1, B:413:0x04f0), top: B:460:0x0472, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x04c1 A[Catch: Exception -> 0x0519, TRY_LEAVE, TryCatch #7 {Exception -> 0x0519, blocks: (B:385:0x0472, B:399:0x0490, B:404:0x04bd, B:406:0x04c1, B:416:0x04ff, B:411:0x04e0, B:419:0x0510, B:421:0x0514, B:403:0x0498, B:408:0x04d1, B:413:0x04f0), top: B:460:0x0472, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x053a A[Catch: all -> 0x055c, TryCatch #9 {all -> 0x055c, blocks: (B:427:0x0526, B:429:0x052c, B:432:0x0536, B:433:0x053a, B:435:0x0544, B:437:0x054c, B:438:0x0551), top: B:464:0x0520 }] */
    @Override // com.anythink.core.common.p055f.AbstractC1228au
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject mo2660F(int r20) {
        /*
            Method dump skipped, instruction units count: 1442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p055f.C1243h.mo2660F(int):org.json.JSONObject");
    }

    /* JADX INFO: renamed from: G */
    public final int m3027G() {
        int i = this.f4188bd;
        if (i != 8) {
            return i != 9 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: G */
    public final void m3028G(int i) {
        this.f4208bx = i;
    }

    /* JADX INFO: renamed from: H */
    public final int m3029H() {
        return this.f4149aD;
    }

    /* JADX INFO: renamed from: H */
    public final void m3030H(int i) {
        this.f4209by = i;
    }

    /* JADX INFO: renamed from: I */
    public final int m3031I() {
        return this.f4150aE;
    }

    /* JADX INFO: renamed from: I */
    public final void m3032I(int i) {
        this.f4179bC = i;
    }

    /* JADX INFO: renamed from: J */
    public final int m3033J() {
        return this.f4175ay;
    }

    /* JADX INFO: renamed from: K */
    public final int m3034K() {
        return this.f4176az;
    }

    /* JADX INFO: renamed from: L */
    public final String m3035L() {
        return this.f4146aA;
    }

    /* JADX INFO: renamed from: M */
    public final int m3036M() {
        return this.f4147aB;
    }

    /* JADX INFO: renamed from: N */
    public final int m3037N() {
        return this.f4148aC;
    }

    /* JADX INFO: renamed from: O */
    public final String m3038O() {
        return this.f4174ax;
    }

    /* JADX INFO: renamed from: P */
    public final int m3039P() {
        return this.f4211o;
    }

    /* JADX INFO: renamed from: Q */
    public final int m3040Q() {
        return this.f4172av;
    }

    /* JADX INFO: renamed from: R */
    public final long m3041R() {
        return this.f4152aG;
    }

    /* JADX INFO: renamed from: S */
    public final long m3042S() {
        return this.f4153aH;
    }

    /* JADX INFO: renamed from: T */
    public final int m3043T() {
        return this.f4191bg;
    }

    /* JADX INFO: renamed from: U */
    public final int m3044U() {
        return this.f4196bl;
    }

    /* JADX INFO: renamed from: V */
    public final C1243h m3045V() {
        try {
            C1243h c1243h = (C1243h) super.clone();
            c1243h.f4199bo = this.f4199bo;
            c1243h.f4202br = this.f4202br;
            c1243h.f4200bp = this.f4200bp;
            c1243h.f4201bq = this.f4201bq;
            c1243h.f4204bt = this.f4204bt;
            c1243h.f4203bs = this.f4203bs;
            c1243h.f4178bB = this.f4178bB;
            c1243h.f4184bH = this.f4184bH;
            return c1243h;
        } catch (Throwable unused) {
            return this;
        }
    }

    /* JADX INFO: renamed from: W */
    public final int m3046W() {
        return this.f4179bC;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m3047X() {
        return this.f4183bG;
    }

    /* JADX INFO: renamed from: a */
    public final long m3048a() {
        return this.f4181bE;
    }

    /* JADX INFO: renamed from: a */
    public final void m3049a(double d) {
        this.f4210bz = d;
    }

    /* JADX INFO: renamed from: a */
    public final void m3050a(int i) {
        this.f4177bA = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3051a(int i, int i2) {
        this.f4180bD = i + "_" + i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3052a(long j) {
        this.f4181bE = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m3053a(ATRewardInfo aTRewardInfo) {
        this.f4199bo = aTRewardInfo;
    }

    /* JADX INFO: renamed from: a */
    public final void m3054a(C1238c c1238c) {
        this.f4203bs = c1238c;
    }

    /* JADX INFO: renamed from: a */
    public final void m3055a(String str) {
        this.f4197bm = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m3056a(Map<String, Object> map) {
        this.f4204bt = map;
    }

    /* JADX INFO: renamed from: a */
    public final void m3057a(boolean z) {
        this.f4205bu = z;
    }

    /* JADX INFO: renamed from: b */
    public final long m3058b() {
        return this.f4182bF;
    }

    /* JADX INFO: renamed from: b */
    public final void m3059b(double d) {
        this.f4206bv = d;
    }

    /* JADX INFO: renamed from: b */
    public final void m3060b(int i) {
        this.f4207bw = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m3061b(long j) {
        this.f4182bF = j;
    }

    /* JADX INFO: renamed from: b */
    public final void m3062b(String str) {
        this.f4170aY = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m3063b(Map<String, Object> map) {
        this.f4202br = map;
    }

    /* JADX INFO: renamed from: b */
    public final void m3064b(boolean z) {
        this.f4140H = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m3065c() {
        this.f4178bB = 2;
    }

    /* JADX INFO: renamed from: c */
    public final void m3066c(double d) {
        this.f4139G = d;
    }

    /* JADX INFO: renamed from: c */
    public final void m3067c(int i) {
        this.f4192bh = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m3068c(long j) {
        this.f4190bf = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m3069c(String str) {
        this.f4167aV = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m3070c(Map<String, ATRewardInfo> map) {
        this.f4200bp = map;
    }

    /* JADX INFO: renamed from: c */
    public final void m3071c(boolean z) {
        this.f4183bG = z;
    }

    /* JADX INFO: renamed from: d */
    public final double m3072d() {
        return this.f4210bz;
    }

    /* JADX INFO: renamed from: d */
    public final void m3073d(double d) {
        this.f4164aS = d;
    }

    /* JADX INFO: renamed from: d */
    public final void m3074d(int i) {
        this.f4193bi = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m3075d(long j) {
        this.f4171aZ = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m3076d(String str) {
        this.f4162aQ = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m3077d(Map<String, Object> map) {
        this.f4201bq = map;
    }

    /* JADX INFO: renamed from: e */
    public final String m3078e() {
        C1238c c1238c = this.f4203bs;
        return c1238c != null ? c1238c.m2966a() : "";
    }

    /* JADX INFO: renamed from: e */
    public final void m3079e(double d) {
        this.f4161aP = d;
    }

    /* JADX INFO: renamed from: e */
    public final void m3080e(int i) {
        this.f4188bd = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m3081e(long j) {
        this.f4152aG = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m3082e(String str) {
        this.f4165aT = str;
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> m3083f() {
        return this.f4204bt;
    }

    /* JADX INFO: renamed from: f */
    public final void m3084f(double d) {
        this.f4219w = d;
    }

    /* JADX INFO: renamed from: f */
    public final void m3085f(int i) {
        this.f4189be = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m3086f(long j) {
        this.f4153aH = j;
    }

    /* JADX INFO: renamed from: f */
    public final void m3087f(String str) {
        this.f4220x = str;
    }

    /* JADX INFO: renamed from: g */
    public final int m3088g() {
        return this.f4207bw;
    }

    /* JADX INFO: renamed from: g */
    public final void m3089g(int i) {
        this.f4187bc = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m3090g(long j) {
        this.f4143K = j;
    }

    /* JADX INFO: renamed from: g */
    public final void m3091g(String str) {
        this.f4155aJ = str;
    }

    /* JADX INFO: renamed from: h */
    public final Map<String, Object> m3092h() {
        return this.f4202br;
    }

    /* JADX INFO: renamed from: h */
    public final void m3093h(int i) {
        this.f4186bb = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m3094h(long j) {
        this.f4144L = j;
    }

    /* JADX INFO: renamed from: h */
    public final void m3095h(String str) {
        this.f4156aK = str;
    }

    /* JADX INFO: renamed from: i */
    public final int m3096i() {
        return this.f4189be;
    }

    /* JADX INFO: renamed from: i */
    public final void m3097i(int i) {
        this.f4185ba = i;
    }

    /* JADX INFO: renamed from: i */
    public final void m3098i(long j) {
        this.f4184bH = j;
    }

    /* JADX INFO: renamed from: i */
    public final void m3099i(String str) {
        this.f4158aM = str;
    }

    /* JADX INFO: renamed from: j */
    public final int m3100j() {
        return this.f4185ba;
    }

    /* JADX INFO: renamed from: j */
    public final void m3101j(int i) {
        this.f4135C = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m3102j(String str) {
        this.f4159aN = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m3103k() {
        this.f4169aX = 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m3104k(int i) {
        this.f4136D = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m3105k(String str) {
        this.f4160aO = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m3106l() {
        if (this.f4169aX != 1) {
            this.f4168aW = 1;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3107l(int i) {
        this.f4137E = i;
    }

    /* JADX INFO: renamed from: l */
    public final void m3108l(String str) {
        this.f4154aI = str;
    }

    /* JADX INFO: renamed from: m */
    public final String m3109m() {
        return this.f4167aV;
    }

    /* JADX INFO: renamed from: m */
    public final void m3110m(int i) {
        this.f4138F = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m3111m(String str) {
        this.f4146aA = str;
    }

    /* JADX INFO: renamed from: n */
    public final double m3112n() {
        return this.f4164aS;
    }

    /* JADX INFO: renamed from: n */
    public final void m3113n(int i) {
        this.f4157aL = i;
    }

    /* JADX INFO: renamed from: n */
    public final void m3114n(String str) {
        this.f4174ax = str;
    }

    /* JADX INFO: renamed from: o */
    public final double m3115o() {
        return this.f4161aP;
    }

    /* JADX INFO: renamed from: o */
    public final void m3116o(int i) {
        this.f4198bn = i;
    }

    /* JADX INFO: renamed from: o */
    public final void m3117o(String str) {
        this.f4173aw = str;
    }

    /* JADX INFO: renamed from: p */
    public final String m3118p() {
        return this.f4162aQ;
    }

    /* JADX INFO: renamed from: p */
    public final void m3119p(int i) {
        this.f4222z = i;
    }

    /* JADX INFO: renamed from: p */
    public final void m3120p(String str) {
        this.f4166aU = str;
    }

    /* JADX INFO: renamed from: q */
    public final String m3121q() {
        return this.f4165aT;
    }

    /* JADX INFO: renamed from: q */
    public final void m3122q(int i) {
        this.f4133A = i;
    }

    /* JADX INFO: renamed from: q */
    public final void m3123q(String str) {
        this.f4142J = str;
    }

    /* JADX INFO: renamed from: r */
    public final String m3124r() {
        return this.f4220x;
    }

    /* JADX INFO: renamed from: r */
    public final void m3125r(int i) {
        this.f4218v = i;
    }

    /* JADX INFO: renamed from: r */
    public final void m3126r(String str) {
        this.f4145M = str;
    }

    /* JADX INFO: renamed from: s */
    public final String m3127s() {
        return this.f4155aJ;
    }

    /* JADX INFO: renamed from: s */
    public final void m3128s(int i) {
        this.f4149aD = i;
    }

    /* JADX INFO: renamed from: t */
    public final String m3129t() {
        return this.f4156aK;
    }

    /* JADX INFO: renamed from: t */
    public final void m3130t(int i) {
        this.f4150aE = i;
    }

    /* JADX INFO: renamed from: u */
    public final int m3131u() {
        return this.f4157aL;
    }

    /* JADX INFO: renamed from: u */
    public final void m3132u(int i) {
        this.f4175ay = i;
    }

    /* JADX INFO: renamed from: v */
    public final String m3133v() {
        return this.f4158aM;
    }

    /* JADX INFO: renamed from: v */
    public final void m3134v(int i) {
        this.f4176az = i;
    }

    /* JADX INFO: renamed from: w */
    public final String m3135w() {
        return this.f4159aN;
    }

    /* JADX INFO: renamed from: w */
    public final void m3136w(int i) {
        this.f4147aB = i;
    }

    /* JADX INFO: renamed from: x */
    public final String m3137x() {
        return this.f4160aO;
    }

    /* JADX INFO: renamed from: x */
    public final void m3138x(int i) {
        this.f4148aC = i;
    }

    /* JADX INFO: renamed from: y */
    public final Map<String, ATRewardInfo> m3139y() {
        return this.f4200bp;
    }

    /* JADX INFO: renamed from: y */
    public final void m3140y(int i) {
        this.f4211o = i;
    }

    /* JADX INFO: renamed from: z */
    public final ATRewardInfo m3141z() {
        return this.f4199bo;
    }

    /* JADX INFO: renamed from: z */
    public final void m3142z(int i) {
        this.f4172av = i;
    }
}
