package com.anythink.core.p072d;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.common.C1294j;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.C1178q;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1209ab;
import com.anythink.core.common.p055f.C1218ak;
import com.anythink.core.common.p055f.C1227at;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p058h.C1284l;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p285z2.C4003ix;

/* JADX INFO: renamed from: com.anythink.core.d.f */
/* JADX INFO: loaded from: classes.dex */
public class C1396f extends C1393c {

    /* JADX INFO: renamed from: a */
    public static final String f5893a = "Placement";

    /* JADX INFO: renamed from: b */
    public static final int f5894b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f5895c = 1;

    /* JADX INFO: renamed from: e */
    public static final int f5896e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f5897f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f5898g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f5899h = 3;

    /* JADX INFO: renamed from: A */
    private List<C1229av> f5900A;

    /* JADX INFO: renamed from: B */
    private Map<String, C1229av> f5901B;

    /* JADX INFO: renamed from: C */
    private int f5902C;

    /* JADX INFO: renamed from: D */
    private int f5903D;

    /* JADX INFO: renamed from: E */
    private long f5904E;

    /* JADX INFO: renamed from: F */
    private long f5905F;

    /* JADX INFO: renamed from: G */
    private long f5906G;

    /* JADX INFO: renamed from: H */
    private int f5907H;

    /* JADX INFO: renamed from: I */
    private String f5908I;

    /* JADX INFO: renamed from: J */
    private C1227at f5909J;

    /* JADX INFO: renamed from: K */
    private int f5910K;

    /* JADX INFO: renamed from: L */
    private String f5911L;

    /* JADX INFO: renamed from: M */
    private int f5912M;

    /* JADX INFO: renamed from: N */
    private int f5913N;

    /* JADX INFO: renamed from: O */
    private String f5914O;

    /* JADX INFO: renamed from: P */
    private Map<String, Object> f5915P;

    /* JADX INFO: renamed from: Q */
    private Map<String, ATRewardInfo> f5916Q;

    /* JADX INFO: renamed from: R */
    private ATRewardInfo f5917R;

    /* JADX INFO: renamed from: S */
    private String f5918S;

    /* JADX INFO: renamed from: T */
    private String f5919T;

    /* JADX INFO: renamed from: U */
    private long f5920U;

    /* JADX INFO: renamed from: V */
    private String f5921V;

    /* JADX INFO: renamed from: W */
    private long f5922W;

    /* JADX INFO: renamed from: X */
    private int f5923X;

    /* JADX INFO: renamed from: Y */
    private long f5924Y;

    /* JADX INFO: renamed from: Z */
    private int f5925Z;

    /* JADX INFO: renamed from: aA */
    private JSONObject f5926aA;

    /* JADX INFO: renamed from: aB */
    private String f5927aB;

    /* JADX INFO: renamed from: aC */
    private String f5928aC;

    /* JADX INFO: renamed from: aD */
    private int f5929aD;

    /* JADX INFO: renamed from: aE */
    private int f5930aE;

    /* JADX INFO: renamed from: aF */
    private List<Integer> f5931aF;

    /* JADX INFO: renamed from: aG */
    private int f5932aG;

    /* JADX INFO: renamed from: aH */
    private int f5933aH;

    /* JADX INFO: renamed from: aI */
    private int f5934aI;

    /* JADX INFO: renamed from: aK */
    private int f5936aK;

    /* JADX INFO: renamed from: aO */
    private double[][] f5940aO;

    /* JADX INFO: renamed from: aQ */
    private int f5942aQ;

    /* JADX INFO: renamed from: aR */
    private C1394d f5943aR;

    /* JADX INFO: renamed from: aS */
    private long f5944aS;

    /* JADX INFO: renamed from: aT */
    private int f5945aT;

    /* JADX INFO: renamed from: aU */
    private int f5946aU;

    /* JADX INFO: renamed from: aV */
    private int f5947aV;

    /* JADX INFO: renamed from: aW */
    private List<Integer> f5948aW;

    /* JADX INFO: renamed from: aX */
    private int f5949aX;

    /* JADX INFO: renamed from: aY */
    private String f5950aY;

    /* JADX INFO: renamed from: aZ */
    private int f5951aZ;

    /* JADX INFO: renamed from: aa */
    private List<C1261z> f5952aa;

    /* JADX INFO: renamed from: ab */
    private C1209ab f5953ab;

    /* JADX INFO: renamed from: ac */
    private long f5954ac;

    /* JADX INFO: renamed from: ad */
    private double f5955ad;

    /* JADX INFO: renamed from: ae */
    private String f5956ae;

    /* JADX INFO: renamed from: af */
    private List<String> f5957af;

    /* JADX INFO: renamed from: ag */
    private String f5958ag;

    /* JADX INFO: renamed from: ah */
    private String f5959ah;

    /* JADX INFO: renamed from: ai */
    private String f5960ai;

    /* JADX INFO: renamed from: aj */
    private String f5961aj;

    /* JADX INFO: renamed from: ak */
    private long f5962ak;

    /* JADX INFO: renamed from: al */
    private String f5963al;

    /* JADX INFO: renamed from: am */
    private String f5964am;

    /* JADX INFO: renamed from: an */
    private String f5965an;

    /* JADX INFO: renamed from: ao */
    private double f5966ao;

    /* JADX INFO: renamed from: ap */
    private String f5967ap;

    /* JADX INFO: renamed from: aq */
    private long f5968aq;

    /* JADX INFO: renamed from: ar */
    private long f5969ar;

    /* JADX INFO: renamed from: as */
    private long f5970as;

    /* JADX INFO: renamed from: at */
    private long f5971at;

    /* JADX INFO: renamed from: au */
    private int f5972au;

    /* JADX INFO: renamed from: av */
    private int f5973av;

    /* JADX INFO: renamed from: aw */
    private int f5974aw;

    /* JADX INFO: renamed from: ax */
    private long f5975ax;

    /* JADX INFO: renamed from: ay */
    private JSONObject f5976ay;

    /* JADX INFO: renamed from: az */
    private String f5977az;

    /* JADX INFO: renamed from: ba */
    private int f5978ba;

    /* JADX INFO: renamed from: bb */
    private int[] f5979bb;

    /* JADX INFO: renamed from: bd */
    private int f5981bd;

    /* JADX INFO: renamed from: be */
    private String f5982be;

    /* JADX INFO: renamed from: bf */
    private String f5983bf;

    /* JADX INFO: renamed from: bg */
    private String f5984bg;

    /* JADX INFO: renamed from: bh */
    private long f5985bh;

    /* JADX INFO: renamed from: bi */
    private String f5986bi;

    /* JADX INFO: renamed from: bj */
    private String f5987bj;

    /* JADX INFO: renamed from: bk */
    private double f5988bk;

    /* JADX INFO: renamed from: bl */
    private int f5989bl;

    /* JADX INFO: renamed from: bm */
    private int f5990bm;

    /* JADX INFO: renamed from: bn */
    private int f5991bn;

    /* JADX INFO: renamed from: bo */
    private int f5992bo;

    /* JADX INFO: renamed from: bp */
    private JSONObject f5993bp;

    /* JADX INFO: renamed from: i */
    private String f5994i;

    /* JADX INFO: renamed from: j */
    private long f5995j;

    /* JADX INFO: renamed from: k */
    private long f5996k;

    /* JADX INFO: renamed from: l */
    private int f5997l;

    /* JADX INFO: renamed from: m */
    private int f5998m;

    /* JADX INFO: renamed from: n */
    private int f5999n;

    /* JADX INFO: renamed from: o */
    private long f6000o;

    /* JADX INFO: renamed from: p */
    private long f6001p;

    /* JADX INFO: renamed from: q */
    private long f6002q;

    /* JADX INFO: renamed from: r */
    private int f6003r;

    /* JADX INFO: renamed from: s */
    private int f6004s;

    /* JADX INFO: renamed from: t */
    private int f6005t;

    /* JADX INFO: renamed from: u */
    private int f6006u;

    /* JADX INFO: renamed from: v */
    private String f6007v;

    /* JADX INFO: renamed from: w */
    private String f6008w;

    /* JADX INFO: renamed from: x */
    private String f6009x;

    /* JADX INFO: renamed from: y */
    private String f6010y;

    /* JADX INFO: renamed from: z */
    private String f6011z;

    /* JADX INFO: renamed from: aJ */
    private int f5935aJ = 0;

    /* JADX INFO: renamed from: aL */
    private int f5937aL = 10;

    /* JADX INFO: renamed from: aM */
    private int f5938aM = 10;

    /* JADX INFO: renamed from: aN */
    private int f5939aN = 2;

    /* JADX INFO: renamed from: aP */
    private int f5941aP = 1;

    /* JADX INFO: renamed from: bc */
    private int f5980bc = 2;

    /* JADX INFO: renamed from: com.anythink.core.d.f$a */
    public static class a {

        /* JADX INFO: renamed from: A */
        public static final String f6012A = "req_w_time";

        /* JADX INFO: renamed from: B */
        public static final String f6013B = "wf_loadts";

        /* JADX INFO: renamed from: C */
        public static final String f6014C = "req_ug_type";

        /* JADX INFO: renamed from: D */
        public static final String f6015D = "req_ug_numsp";

        /* JADX INFO: renamed from: E */
        public static final String f6016E = "bf_ldf_rf_sw";

        /* JADX INFO: renamed from: F */
        public static final String f6017F = "hb_start_time";

        /* JADX INFO: renamed from: G */
        public static final String f6018G = "dsp_list";

        /* JADX INFO: renamed from: H */
        public static final String f6019H = "bid_floor";

        /* JADX INFO: renamed from: I */
        public static final String f6020I = "max_unit_ids";

        /* JADX INFO: renamed from: J */
        public static final String f6021J = "xdb_list";

        /* JADX INFO: renamed from: K */
        public static final String f6022K = "s2s_bd_max";

        /* JADX INFO: renamed from: L */
        public static final String f6023L = "req_merge";

        /* JADX INFO: renamed from: M */
        public static final String f6024M = "exclude_id_max";

        /* JADX INFO: renamed from: N */
        public static final String f6025N = "install_id_max";

        /* JADX INFO: renamed from: O */
        public static final String f6026O = "install_ids";

        /* JADX INFO: renamed from: P */
        public static final String f6027P = "exclude_ids";

        /* JADX INFO: renamed from: Q */
        public static final String f6028Q = "is_test";

        /* JADX INFO: renamed from: R */
        public static final String f6029R = "gsp_rates";

        /* JADX INFO: renamed from: S */
        public static final String f6030S = "adx_ext";

        /* JADX INFO: renamed from: T */
        public static final String f6031T = "wf_id";

        /* JADX INFO: renamed from: U */
        public static final String f6032U = "sysh_mtg_sw";

        /* JADX INFO: renamed from: V */
        public static final String f6033V = "mid_gdt_sw";

        /* JADX INFO: renamed from: W */
        public static final String f6034W = "lm_lrqf_interval_sws";

        /* JADX INFO: renamed from: X */
        public static final String f6035X = "wf_lscb_type";

        /* JADX INFO: renamed from: Y */
        public static final String f6036Y = "reqid_pg_sw";

        /* JADX INFO: renamed from: Z */
        public static final String f6037Z = "sr_sw";

        /* JADX INFO: renamed from: a */
        public static final String f6038a = "hb_bid_timeout";

        /* JADX INFO: renamed from: aA */
        private static final String f6039aA = "pucs";

        /* JADX INFO: renamed from: aB */
        private static final String f6040aB = "ad_delivery_sw";

        /* JADX INFO: renamed from: aC */
        private static final String f6041aC = "req_ug_num";

        /* JADX INFO: renamed from: aD */
        private static final String f6042aD = "unit_caps_d";

        /* JADX INFO: renamed from: aE */
        private static final String f6043aE = "unit_caps_h";

        /* JADX INFO: renamed from: aF */
        private static final String f6044aF = "unit_pacing";

        /* JADX INFO: renamed from: aG */
        private static final String f6045aG = "wifi_auto_sw";

        /* JADX INFO: renamed from: aH */
        private static final String f6046aH = "show_type";

        /* JADX INFO: renamed from: aI */
        private static final String f6047aI = "refresh";

        /* JADX INFO: renamed from: aJ */
        private static final String f6048aJ = "ug_list";

        /* JADX INFO: renamed from: aK */
        private static final String f6049aK = "ol_list";

        /* JADX INFO: renamed from: aL */
        private static final String f6050aL = "gro_id";

        /* JADX INFO: renamed from: aM */
        private static final String f6051aM = "hb_list";

        /* JADX INFO: renamed from: aN */
        private static final String f6052aN = "s2shb_list";

        /* JADX INFO: renamed from: aO */
        private static final String f6053aO = "format";

        /* JADX INFO: renamed from: aP */
        private static final String f6054aP = "auto_refresh";

        /* JADX INFO: renamed from: aQ */
        private static final String f6055aQ = "auto_refresh_time";

        /* JADX INFO: renamed from: aR */
        private static final String f6056aR = "s_t";

        /* JADX INFO: renamed from: aS */
        private static final String f6057aS = "l_s_t";

        /* JADX INFO: renamed from: aT */
        private static final String f6058aT = "ra";

        /* JADX INFO: renamed from: aU */
        private static final String f6059aU = "asid";

        /* JADX INFO: renamed from: aV */
        private static final String f6060aV = "tp_ps";

        /* JADX INFO: renamed from: aW */
        private static final String f6061aW = "t_g_id";

        /* JADX INFO: renamed from: aX */
        private static final String f6062aX = "s_id";

        /* JADX INFO: renamed from: aY */
        private static final String f6063aY = "u_n_f_sw";

        /* JADX INFO: renamed from: aZ */
        private static final String f6064aZ = "m_o";

        /* JADX INFO: renamed from: aa */
        public static final String f6065aa = "p_c";

        /* JADX INFO: renamed from: ab */
        public static final String f6066ab = "has_1st_rl";

        /* JADX INFO: renamed from: ac */
        public static final String f6067ac = "updateTime";

        /* JADX INFO: renamed from: ad */
        public static final String f6068ad = "upd_type";

        /* JADX INFO: renamed from: ae */
        public static final String f6069ae = "upd_th";

        /* JADX INFO: renamed from: af */
        public static final String f6070af = "value_n";

        /* JADX INFO: renamed from: ag */
        public static final String f6071ag = "bid_value_n";

        /* JADX INFO: renamed from: ah */
        public static final String f6072ah = "sto_stg";

        /* JADX INFO: renamed from: ai */
        public static final String f6073ai = "lf_rt_itr";

        /* JADX INFO: renamed from: aj */
        public static final String f6074aj = "wf2_mode_sw";

        /* JADX INFO: renamed from: ak */
        public static final String f6075ak = "wf2_req_ug_type";

        /* JADX INFO: renamed from: al */
        public static final String f6076al = "wf2_mode_req_num";

        /* JADX INFO: renamed from: am */
        public static final String f6077am = "am_est_num";

        /* JADX INFO: renamed from: an */
        public static final String f6078an = "share_pl_id";

        /* JADX INFO: renamed from: ao */
        public static final String f6079ao = "s2s_sw";

        /* JADX INFO: renamed from: ap */
        public static final String f6080ap = "bd_req_bid_sw";

        /* JADX INFO: renamed from: aq */
        public static final String f6081aq = "bn_template_id";

        /* JADX INFO: renamed from: ar */
        public static final String f6082ar = "mix_click_type";

        /* JADX INFO: renamed from: as */
        public static final String f6083as = "auto_refresh_type";

        /* JADX INFO: renamed from: at */
        public static final String f6084at = "wf_sw";

        /* JADX INFO: renamed from: au */
        public static final String f6085au = "wf_obj";

        /* JADX INFO: renamed from: av */
        public static final String f6086av = "pl_wf_st_type";

        /* JADX INFO: renamed from: aw */
        public static final String f6087aw = "presetwf_reload_sw";

        /* JADX INFO: renamed from: ax */
        private static final String f6088ax = "ps_id_timeout";

        /* JADX INFO: renamed from: ay */
        private static final String f6089ay = "ps_ct";

        /* JADX INFO: renamed from: az */
        private static final String f6090az = "ps_ct_out";

        /* JADX INFO: renamed from: b */
        public static final String f6091b = "addr_bid";

        /* JADX INFO: renamed from: ba */
        private static final String f6092ba = "m_o_s";

        /* JADX INFO: renamed from: bb */
        private static final String f6093bb = "m_o_ks";

        /* JADX INFO: renamed from: bc */
        private static final String f6094bc = "p_m_o";

        /* JADX INFO: renamed from: bd */
        private static final String f6095bd = "callback";

        /* JADX INFO: renamed from: be */
        private static final String f6096be = "sc_list";

        /* JADX INFO: renamed from: bf */
        private static final String f6097bf = "rw_n";

        /* JADX INFO: renamed from: bg */
        private static final String f6098bg = "rw_num";

        /* JADX INFO: renamed from: bh */
        private static final String f6099bh = "reward";

        /* JADX INFO: renamed from: bi */
        private static final String f6100bi = "currency";

        /* JADX INFO: renamed from: bj */
        private static final String f6101bj = "cc";

        /* JADX INFO: renamed from: bk */
        private static final String f6102bk = "exch_r";

        /* JADX INFO: renamed from: bl */
        private static final String f6103bl = "acct_cy";

        /* JADX INFO: renamed from: c */
        public static final String f6104c = "load_fail_wtime";

        /* JADX INFO: renamed from: d */
        public static final String f6105d = "load_cap";

        /* JADX INFO: renamed from: e */
        public static final String f6106e = "load_cap_time";

        /* JADX INFO: renamed from: f */
        public static final String f6107f = "cached_offers_num";

        /* JADX INFO: renamed from: g */
        public static final String f6108g = "adx_list";

        /* JADX INFO: renamed from: h */
        public static final String f6109h = "adx_st";

        /* JADX INFO: renamed from: i */
        public static final String f6110i = "ilrd";

        /* JADX INFO: renamed from: j */
        public static final String f6111j = "hb_list";

        /* JADX INFO: renamed from: k */
        public static final String f6112k = "inh_list";

        /* JADX INFO: renamed from: l */
        public static final String f6113l = "fbhb_bid_wtime";

        /* JADX INFO: renamed from: m */
        public static final String f6114m = "burl_nt_firm";

        /* JADX INFO: renamed from: n */
        public static final String f6115n = "wf_bid_addr";

        /* JADX INFO: renamed from: o */
        public static final String f6116o = "ss_data";

        /* JADX INFO: renamed from: p */
        public static final String f6117p = "cn_addr_bid";

        /* JADX INFO: renamed from: q */
        public static final String f6118q = "cn_wf_bid_addr";

        /* JADX INFO: renamed from: r */
        public static final String f6119r = "byuid_wt";

        /* JADX INFO: renamed from: s */
        public static final String f6120s = "addr_bks";

        /* JADX INFO: renamed from: t */
        public static final String f6121t = "addr_subbks";

        /* JADX INFO: renamed from: u */
        public static final String f6122u = "s2sbks_list";

        /* JADX INFO: renamed from: v */
        public static final String f6123v = "exch_rate_c2u";

        /* JADX INFO: renamed from: w */
        public static final String f6124w = "doffer_list";

        /* JADX INFO: renamed from: x */
        public static final String f6125x = "bottom_list";

        /* JADX INFO: renamed from: y */
        public static final String f6126y = "bottom_reqts";

        /* JADX INFO: renamed from: z */
        public static final String f6127z = "cb_w_time";
    }

    private C1396f(String str) {
        this.f5994i = str;
    }

    /* JADX INFO: renamed from: A */
    private void m4899A(int i) {
        this.f5923X = i;
    }

    /* JADX INFO: renamed from: A */
    private void m4900A(String str) {
        this.f5960ai = str;
    }

    /* JADX INFO: renamed from: B */
    private void m4901B(int i) {
        this.f5925Z = i;
    }

    /* JADX INFO: renamed from: B */
    private void m4902B(String str) {
        this.f5961aj = str;
    }

    /* JADX INFO: renamed from: C */
    private void m4903C(int i) {
        this.f5990bm = i;
    }

    /* JADX INFO: renamed from: C */
    private void m4904C(String str) {
        this.f5986bi = str;
    }

    /* JADX INFO: renamed from: D */
    private void m4905D(int i) {
        this.f5989bl = i;
    }

    /* JADX INFO: renamed from: D */
    private void m4906D(String str) {
        this.f5987bj = str;
    }

    /* JADX INFO: renamed from: E */
    private void m4907E(int i) {
        this.f5991bn = i;
    }

    /* JADX INFO: renamed from: F */
    private void m4908F(int i) {
        this.f5992bo = i;
    }

    /* JADX INFO: renamed from: G */
    private void m4909G(int i) {
        this.f5929aD = i;
    }

    /* JADX INFO: renamed from: H */
    private void m4910H(int i) {
        this.f5930aE = i;
    }

    /* JADX INFO: renamed from: I */
    private void m4911I(int i) {
        this.f5933aH = i;
    }

    /* JADX INFO: renamed from: J */
    private void m4912J(int i) {
        this.f5936aK = i;
    }

    /* JADX INFO: renamed from: K */
    private void m4913K(int i) {
        this.f5937aL = i;
    }

    /* JADX INFO: renamed from: L */
    private void m4914L(int i) {
        this.f5938aM = i;
    }

    /* JADX INFO: renamed from: M */
    private void m4915M(int i) {
        this.f5939aN = i;
    }

    /* JADX INFO: renamed from: N */
    private void m4916N(int i) {
        this.f5941aP = i;
    }

    /* JADX INFO: renamed from: O */
    private void m4917O(int i) {
        this.f5978ba = i;
    }

    /* JADX INFO: renamed from: P */
    private void m4918P(int i) {
        this.f5980bc = i;
    }

    /* JADX INFO: renamed from: a */
    public static C1396f m4919a(String str, JSONObject jSONObject) {
        C1396f c1396fM4935b = m4935b(str, jSONObject);
        if (c1396fM4935b != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            ArrayList arrayList = new ArrayList();
            C1403m.m5178a(c1396fM4935b, concurrentHashMap, arrayList);
            c1396fM4935b.f5900A = arrayList;
            c1396fM4935b.f5901B = concurrentHashMap;
        }
        return c1396fM4935b;
    }

    /* JADX INFO: renamed from: a */
    private static List<C1261z> m4920a(String str, String str2, long j, C1209ab c1209ab) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                C1261z c1261z = new C1261z();
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                c1261z.m3209k(jSONObjectOptJSONObject.optString("o_id"));
                c1261z.m3213l(jSONObjectOptJSONObject.optString("c_id"));
                c1261z.m3216m(jSONObjectOptJSONObject.optString("t"));
                c1261z.m3238x(jSONObjectOptJSONObject.optString("p_g"));
                c1261z.m3219n(jSONObjectOptJSONObject.optString("d"));
                c1261z.m3221o(jSONObjectOptJSONObject.optString("ic_u"));
                c1261z.m3223p(jSONObjectOptJSONObject.optString("im_u"));
                c1261z.m3224q(jSONObjectOptJSONObject.optString("f_i_u"));
                c1261z.m3226r(jSONObjectOptJSONObject.optString("a_c_u"));
                c1261z.m3228s(jSONObjectOptJSONObject.optString("c_t"));
                c1261z.m3230t(jSONObjectOptJSONObject.optString("v_u"));
                c1261z.m3200h(jSONObjectOptJSONObject.optInt("l_t"));
                c1261z.m3232u(jSONObjectOptJSONObject.optString("p_u"));
                c1261z.m3234v(jSONObjectOptJSONObject.optString("dl"));
                c1261z.m3236w(jSONObjectOptJSONObject.optString("c_u"));
                c1261z.m3486I(jSONObjectOptJSONObject.optString("ip_u"));
                c1261z.m3487J(jSONObjectOptJSONObject.optString("t_u"));
                c1261z.m3488K(jSONObjectOptJSONObject.optString("t_u_25"));
                c1261z.m3489L(jSONObjectOptJSONObject.optString("t_u_50"));
                c1261z.m3490M(jSONObjectOptJSONObject.optString("t_u_75"));
                c1261z.m3491N(jSONObjectOptJSONObject.optString("t_u_100"));
                c1261z.m3492O(jSONObjectOptJSONObject.optString("s_e_c_t_u"));
                c1261z.m3493P(jSONObjectOptJSONObject.optString("c_t_u"));
                c1261z.m3494Q(jSONObjectOptJSONObject.optString("ip_n_u"));
                c1261z.m3495R(jSONObjectOptJSONObject.optString("c_n_u"));
                c1261z.f4525c = jSONObjectOptJSONObject.optInt("o_a_d_c");
                c1261z.f4526d = jSONObjectOptJSONObject.optLong("o_a_p");
                c1261z.m3501a(j);
                c1261z.m3197g(jSONObjectOptJSONObject.optInt("unit_type"));
                c1261z.m3500a(jSONObjectOptJSONObject.optInt("c_m"));
                c1261z.m3514b(jSONObjectOptJSONObject.optString("ext_h_pic"));
                c1261z.m3483F(jSONObjectOptJSONObject.optString("ext_big_h_pic"));
                c1261z.m3484G(jSONObjectOptJSONObject.optString("ext_rect_h_pic"));
                c1261z.m3485H(jSONObjectOptJSONObject.optString("ext_home_h_pic"));
                c1261z.m3502a(str2);
                c1261z.m3242z(jSONObjectOptJSONObject.optString("pub"));
                c1261z.m3158A(jSONObjectOptJSONObject.optString("app_vc"));
                c1261z.m3160B(jSONObjectOptJSONObject.optString("pvc"));
                c1261z.m3162C(jSONObjectOptJSONObject.optString("pms"));
                c1261z.m3186a((AbstractC1249n) c1209ab);
                arrayList.add(c1261z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m4921a(double d) {
        this.f5966ao = d;
    }

    /* JADX INFO: renamed from: a */
    private void m4922a(long j) {
        this.f5944aS = j;
    }

    /* JADX INFO: renamed from: a */
    private void m4923a(ATRewardInfo aTRewardInfo) {
        this.f5917R = aTRewardInfo;
    }

    /* JADX INFO: renamed from: a */
    private void m4924a(C1209ab c1209ab) {
        this.f5953ab = c1209ab;
    }

    /* JADX INFO: renamed from: a */
    private void m4925a(C1227at c1227at) {
        this.f5909J = c1227at;
    }

    /* JADX INFO: renamed from: a */
    private void m4926a(C1394d c1394d) {
        this.f5943aR = c1394d;
    }

    /* JADX INFO: renamed from: a */
    private void m4927a(List<Integer> list) {
        this.f5948aW = list;
    }

    /* JADX INFO: renamed from: a */
    private void m4928a(Map<String, C1229av> map) {
        this.f5901B = map;
    }

    /* JADX INFO: renamed from: a */
    private void m4929a(JSONObject jSONObject) {
        this.f5926aA = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private void m4930a(int[] iArr) {
        this.f5979bb = iArr;
    }

    /* JADX INFO: renamed from: a */
    private void m4931a(double[][] dArr) {
        this.f5940aO = dArr;
    }

    /* JADX INFO: renamed from: a */
    private boolean m4932a(C1396f c1396f) {
        if (c1396f == null) {
            return true;
        }
        return (TextUtils.equals(this.f5908I, c1396f.f5908I) || m4873au()) ? false : true;
    }

    /* JADX INFO: renamed from: aY */
    private JSONObject m4933aY() {
        return this.f5976ay;
    }

    /* JADX INFO: renamed from: aZ */
    private String m4934aZ() {
        return this.f5984bg;
    }

    /* JADX INFO: renamed from: b */
    private static C1396f m4935b(String str, JSONObject jSONObject) {
        long jOptLong;
        int i;
        JSONArray jSONArrayOptJSONArray;
        int length;
        if (jSONObject == null) {
            return null;
        }
        try {
            C1396f c1396f = new C1396f(str);
            c1396f.m4875b(jSONObject);
            c1396f.m4876c(jSONObject);
            c1396f.m4877d(jSONObject);
            if (jSONObject.isNull("ps_ct")) {
                c1396f.f5995j = 0L;
            } else {
                c1396f.f5995j = jSONObject.optLong("ps_ct");
            }
            if (jSONObject.isNull("ps_ct_out")) {
                c1396f.f5996k = 0L;
            } else {
                c1396f.f5996k = jSONObject.optLong("ps_ct_out");
            }
            if (jSONObject.isNull("pucs")) {
                c1396f.f5997l = 1;
            } else {
                c1396f.f5997l = jSONObject.optInt("pucs");
            }
            if (jSONObject.isNull("ad_delivery_sw")) {
                c1396f.f5998m = 1;
            } else {
                c1396f.f5998m = jSONObject.optInt("ad_delivery_sw");
            }
            if (jSONObject.isNull("req_ug_num")) {
                c1396f.f5999n = -1;
            } else {
                c1396f.f5999n = jSONObject.optInt("req_ug_num");
            }
            if (jSONObject.isNull("unit_caps_d")) {
                c1396f.f6000o = -1L;
            } else {
                c1396f.f6000o = jSONObject.optLong("unit_caps_d");
            }
            if (jSONObject.isNull("unit_caps_h")) {
                c1396f.f6001p = -1L;
            } else {
                c1396f.f6001p = jSONObject.optLong("unit_caps_h");
            }
            if (jSONObject.isNull("unit_pacing")) {
                c1396f.f6002q = -1L;
            } else {
                c1396f.f6002q = jSONObject.optLong("unit_pacing");
            }
            if (jSONObject.isNull("wifi_auto_sw")) {
                c1396f.f6003r = 0;
            } else {
                c1396f.f6003r = jSONObject.optInt("wifi_auto_sw");
            }
            if (jSONObject.isNull("show_type")) {
                c1396f.f6004s = 0;
            } else {
                c1396f.f6004s = jSONObject.optInt("show_type");
            }
            if (jSONObject.isNull("refresh")) {
                c1396f.f6005t = 0;
            } else {
                c1396f.f6005t = jSONObject.optInt("refresh");
            }
            if (jSONObject.isNull("gro_id")) {
                c1396f.f6006u = 0;
            } else {
                c1396f.f6006u = jSONObject.optInt("gro_id");
            }
            if (jSONObject.isNull("format")) {
                c1396f.f5902C = 0;
            } else {
                c1396f.f5902C = jSONObject.optInt("format");
            }
            if (jSONObject.isNull("auto_refresh")) {
                c1396f.f5903D = 0;
            } else {
                c1396f.f5903D = jSONObject.optInt("auto_refresh");
            }
            if (jSONObject.isNull("auto_refresh_time")) {
                c1396f.f5904E = 0L;
            } else {
                c1396f.f5904E = jSONObject.optLong("auto_refresh_time");
            }
            if (jSONObject.isNull("s_t")) {
                c1396f.f5905F = 900000L;
            } else {
                c1396f.f5905F = jSONObject.optLong("s_t");
            }
            if (jSONObject.isNull(C1294j.f4847L)) {
                c1396f.f5906G = 1800000L;
            } else {
                c1396f.f5906G = jSONObject.optLong(C1294j.f4847L);
            }
            if (jSONObject.isNull("ra")) {
                c1396f.f5907H = -1;
            } else {
                c1396f.f5907H = jSONObject.optInt("ra");
            }
            if (jSONObject.isNull("asid")) {
                c1396f.f5908I = "";
            } else {
                c1396f.f5908I = jSONObject.optString("asid");
            }
            if (jSONObject.isNull("tp_ps")) {
                c1396f.f5909J = null;
            } else {
                try {
                    C1227at c1227at = new C1227at();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tp_ps");
                    c1227at.f3891a = jSONObjectOptJSONObject.optInt("pucs") == 1;
                    c1227at.f3892b = jSONObjectOptJSONObject.optLong("apdt");
                    c1227at.f3893c = jSONObjectOptJSONObject.optInt("aprn");
                    c1227at.f3894d = jSONObjectOptJSONObject.optInt("puas") == 1;
                    c1227at.f3895e = jSONObjectOptJSONObject.optLong("cdt");
                    c1227at.f3896f = jSONObjectOptJSONObject.optInt("ski_swt") == 1;
                    c1227at.f3897g = jSONObjectOptJSONObject.optInt("aut_swt") == 1;
                    c1396f.f5909J = c1227at;
                } catch (Exception unused) {
                }
            }
            if (jSONObject.isNull("ug_list")) {
                c1396f.f6007v = C4003ix.OooOOO;
            } else {
                c1396f.f6007v = jSONObject.optString("ug_list");
            }
            if (jSONObject.isNull("ol_list")) {
                c1396f.f6008w = C4003ix.OooOOO;
            } else {
                c1396f.f6008w = jSONObject.optString("ol_list");
            }
            if (jSONObject.isNull("s2shb_list")) {
                c1396f.f6009x = C4003ix.OooOOO;
            } else {
                c1396f.f6009x = jSONObject.optString("s2shb_list");
            }
            if (jSONObject.isNull(a.f6108g)) {
                c1396f.f5983bf = C4003ix.OooOOO;
            } else {
                c1396f.f5983bf = jSONObject.optString(a.f6108g);
            }
            if (jSONObject.isNull(a.f6111j)) {
                c1396f.f6010y = C4003ix.OooOOO;
            } else {
                c1396f.f6010y = jSONObject.optString(a.f6111j);
            }
            if (jSONObject.isNull(a.f6112k)) {
                c1396f.f6011z = C4003ix.OooOOO;
            } else {
                c1396f.f6011z = jSONObject.optString(a.f6112k);
            }
            if (jSONObject.isNull(a.f6122u)) {
                c1396f.f5965an = "";
            } else {
                c1396f.f5965an = jSONObject.optString(a.f6122u);
            }
            if (jSONObject.isNull(a.f6124w)) {
                c1396f.f5986bi = C4003ix.OooOOO;
            } else {
                c1396f.f5986bi = jSONObject.optString(a.f6124w);
            }
            if (jSONObject.isNull(a.f6067ac)) {
                c1396f.f5985bh = 0L;
                jOptLong = 0;
            } else {
                jOptLong = jSONObject.optLong(a.f6067ac);
                c1396f.f5985bh = jOptLong;
            }
            if (jSONObject.isNull("t_g_id")) {
                c1396f.f5910K = -1;
            } else {
                c1396f.f5910K = jSONObject.optInt("t_g_id");
            }
            if (jSONObject.isNull("s_id")) {
                c1396f.f5911L = "";
            } else {
                c1396f.f5911L = jSONObject.optString("s_id");
            }
            if (jSONObject.isNull("u_n_f_sw")) {
                c1396f.f5912M = 0;
            } else {
                c1396f.f5912M = jSONObject.optInt("u_n_f_sw");
            }
            if (!jSONObject.isNull("m_o_s")) {
                c1396f.f5953ab = C1209ab.m2431i(jSONObject.optString("m_o_s"));
            }
            if (jSONObject.isNull("m_o")) {
                c1396f.f5952aa = null;
            } else {
                c1396f.f5952aa = m4920a(jSONObject.optString("m_o"), jSONObject.optString("m_o_ks"), jOptLong, c1396f.f5953ab);
            }
            if (jSONObject.isNull("p_m_o")) {
                c1396f.f5913N = 0;
            } else {
                c1396f.f5913N = jSONObject.optInt("p_m_o");
            }
            if (jSONObject.isNull(C1284l.f4762a)) {
                c1396f.f5915P = null;
            } else {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(C1284l.f4762a));
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.opt(next));
                }
                c1396f.f5915P = map;
            }
            if (!jSONObject.isNull("callback")) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString("callback"));
                if (!jSONObject3.isNull("sc_list")) {
                    JSONObject jSONObject4 = new JSONObject(jSONObject3.optString("sc_list"));
                    HashMap map2 = new HashMap();
                    Iterator<String> itKeys2 = jSONObject4.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        JSONObject jSONObject5 = new JSONObject(jSONObject4.optString(next2));
                        ATRewardInfo aTRewardInfo = new ATRewardInfo();
                        aTRewardInfo.rewardName = jSONObject5.optString("rw_n");
                        aTRewardInfo.rewardNumber = jSONObject5.optInt("rw_num");
                        map2.put(next2, aTRewardInfo);
                    }
                    c1396f.f5916Q = map2;
                }
                if (!jSONObject3.isNull("reward")) {
                    JSONObject jSONObject6 = new JSONObject(jSONObject3.optString("reward"));
                    ATRewardInfo aTRewardInfo2 = new ATRewardInfo();
                    if (!jSONObject6.isNull("rw_n")) {
                        aTRewardInfo2.rewardName = jSONObject6.optString("rw_n");
                    }
                    if (!jSONObject6.isNull("rw_num")) {
                        aTRewardInfo2.rewardNumber = jSONObject6.optInt("rw_num");
                    }
                    c1396f.f5917R = aTRewardInfo2;
                }
                if (!jSONObject3.isNull("currency")) {
                    c1396f.f5918S = jSONObject3.optString("currency");
                }
                if (!jSONObject3.isNull(C1485b.f7208h)) {
                    c1396f.f5919T = jSONObject3.optString(C1485b.f7208h);
                }
                if (!jSONObject3.isNull("exch_r")) {
                    c1396f.f5955ad = jSONObject3.optDouble("exch_r", 0.0d);
                }
                if (!jSONObject3.isNull("acct_cy")) {
                    c1396f.f5956ae = jSONObject3.optString("acct_cy");
                }
            }
            if (jSONObject.isNull(a.f6038a)) {
                c1396f.f5920U = UMAmapConfig.AMAP_CACHE_WRITE_TIME;
            } else {
                c1396f.f5920U = jSONObject.optLong(a.f6038a);
            }
            if (jSONObject.isNull(a.f6091b)) {
                c1396f.f5921V = "";
            } else {
                c1396f.f5921V = jSONObject.optString(a.f6091b);
            }
            if (jSONObject.isNull(a.f6104c)) {
                c1396f.f5922W = UMAmapConfig.AMAP_CACHE_WRITE_TIME;
            } else {
                c1396f.f5922W = jSONObject.optLong(a.f6104c);
            }
            if (jSONObject.isNull(a.f6105d)) {
                c1396f.f5923X = -1;
            } else {
                c1396f.f5923X = jSONObject.optInt(a.f6105d);
            }
            if (jSONObject.isNull(a.f6106e)) {
                c1396f.f5924Y = 900000L;
            } else {
                c1396f.f5924Y = jSONObject.optLong(a.f6106e);
            }
            if (jSONObject.isNull(a.f6107f)) {
                c1396f.f5925Z = 2;
            } else {
                c1396f.f5925Z = jSONObject.optInt(a.f6107f);
            }
            if (jSONObject.isNull(a.f6110i)) {
                c1396f.f5982be = null;
            } else {
                c1396f.f5982be = jSONObject.optString(a.f6110i);
            }
            if (jSONObject.isNull(a.f6109h)) {
                c1396f.f5984bg = "";
            } else {
                c1396f.f5984bg = jSONObject.optString(a.f6109h);
            }
            if (jSONObject.isNull(a.f6113l)) {
                c1396f.f5954ac = 4000L;
            } else {
                c1396f.f5954ac = jSONObject.optLong(a.f6113l);
            }
            if (jSONObject.isNull(a.f6114m)) {
                c1396f.f5957af = null;
            } else {
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(a.f6114m);
                ArrayList arrayList = new ArrayList(3);
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray2.optString(i2));
                }
                c1396f.f5957af = arrayList;
            }
            if (jSONObject.isNull(a.f6115n)) {
                c1396f.f5958ag = "";
            } else {
                c1396f.f5958ag = jSONObject.optString(a.f6115n);
            }
            if (jSONObject.isNull(a.f6116o)) {
                c1396f.f5959ah = "";
            } else {
                c1396f.f5959ah = jSONObject.optString(a.f6116o);
            }
            if (jSONObject.isNull(a.f6117p)) {
                c1396f.f5960ai = "";
            } else {
                c1396f.f5960ai = jSONObject.optString(a.f6117p);
            }
            if (jSONObject.isNull(a.f6118q)) {
                c1396f.f5961aj = "";
            } else {
                c1396f.f5961aj = jSONObject.optString(a.f6118q);
            }
            if (jSONObject.isNull(a.f6119r)) {
                c1396f.f5962ak = 500L;
            } else {
                c1396f.f5962ak = jSONObject.optLong(a.f6119r);
            }
            if (jSONObject.isNull(a.f6120s)) {
                c1396f.f5963al = "";
            } else {
                c1396f.f5963al = jSONObject.optString(a.f6120s);
            }
            if (jSONObject.isNull(a.f6121t)) {
                c1396f.f5964am = "";
            } else {
                c1396f.f5964am = jSONObject.optString(a.f6121t);
            }
            if (jSONObject.isNull(a.f6123v)) {
                c1396f.f5966ao = 0.1614d;
            } else {
                c1396f.f5966ao = jSONObject.optDouble(a.f6123v);
            }
            if (jSONObject.isNull(a.f6125x)) {
                c1396f.f5967ap = C4003ix.OooOOO;
            } else {
                c1396f.f5967ap = jSONObject.optString(a.f6125x);
            }
            if (jSONObject.isNull(a.f6126y)) {
                c1396f.f5968aq = 1000L;
            } else {
                c1396f.f5968aq = jSONObject.optLong(a.f6126y);
            }
            if (jSONObject.isNull(a.f6127z)) {
                c1396f.f5969ar = 0L;
            } else {
                c1396f.f5969ar = jSONObject.optLong(a.f6127z);
            }
            if (jSONObject.isNull(a.f6012A)) {
                c1396f.f5970as = C1659a.f9130f;
            } else {
                c1396f.f5970as = jSONObject.optLong(a.f6012A);
            }
            if (jSONObject.isNull(a.f6013B)) {
                c1396f.f5971at = -1L;
            } else {
                c1396f.f5971at = jSONObject.optLong(a.f6013B);
            }
            if (jSONObject.isNull(a.f6014C)) {
                c1396f.f5972au = 1;
            } else {
                int iOptInt = jSONObject.optInt(a.f6014C);
                if (iOptInt != 1 && iOptInt != 2) {
                    StringBuilder sb = new StringBuilder("requestUnitGroupType error: ");
                    sb.append(iOptInt);
                    sb.append(", fix requestType to 1");
                    iOptInt = 1;
                }
                c1396f.f5972au = iOptInt;
            }
            if (jSONObject.isNull(a.f6015D)) {
                c1396f.f5973av = 1;
            } else {
                c1396f.f5973av = jSONObject.optInt(a.f6015D);
            }
            if (jSONObject.isNull(a.f6016E)) {
                c1396f.f5974aw = 2;
            } else {
                c1396f.f5974aw = jSONObject.optInt(a.f6016E);
            }
            if (jSONObject.isNull(a.f6017F)) {
                c1396f.f5975ax = C1659a.f9130f;
            } else {
                c1396f.f5975ax = jSONObject.optLong(a.f6017F);
            }
            if (jSONObject.isNull(a.f6018G)) {
                c1396f.f5987bj = C4003ix.OooOOO;
            } else {
                c1396f.f5987bj = jSONObject.optString(a.f6018G);
            }
            if (jSONObject.isNull("bid_floor")) {
                c1396f.f5988bk = 0.0d;
            } else {
                c1396f.f5988bk = jSONObject.optDouble("bid_floor");
            }
            if (jSONObject.isNull(a.f6020I)) {
                c1396f.f5976ay = null;
            } else {
                c1396f.f5976ay = jSONObject.optJSONObject(a.f6020I);
            }
            if (jSONObject.isNull(a.f6021J)) {
                c1396f.f5977az = "";
            } else {
                c1396f.f5977az = jSONObject.optString(a.f6021J);
            }
            if (jSONObject.isNull(a.f6022K)) {
                c1396f.f5989bl = 0;
            } else {
                c1396f.f5989bl = jSONObject.optInt(a.f6022K);
            }
            if (jSONObject.isNull(a.f6023L)) {
                c1396f.f5990bm = 2;
            } else {
                c1396f.f5990bm = jSONObject.optInt(a.f6023L);
            }
            if (jSONObject.isNull(a.f6024M)) {
                c1396f.f5992bo = 0;
            } else {
                c1396f.f5992bo = jSONObject.optInt(a.f6024M);
            }
            if (jSONObject.isNull(a.f6025N)) {
                c1396f.f5991bn = 0;
            } else {
                c1396f.f5991bn = jSONObject.optInt(a.f6025N);
            }
            if (jSONObject.isNull("is_test")) {
                c1396f.f5981bd = 2;
            } else {
                c1396f.f5981bd = jSONObject.optInt("is_test");
            }
            c1396f.f5926aA = jSONObject.optJSONObject(a.f6029R);
            if (jSONObject.isNull(a.f6030S)) {
                c1396f.f5927aB = "";
            } else {
                c1396f.f5927aB = jSONObject.optString(a.f6030S);
            }
            if (jSONObject.isNull(a.f6031T)) {
                c1396f.f5928aC = "";
            } else {
                c1396f.f5928aC = jSONObject.optString(a.f6031T);
            }
            if (jSONObject.isNull(a.f6032U)) {
                c1396f.f5929aD = 2;
            } else {
                c1396f.f5929aD = jSONObject.optInt(a.f6032U);
            }
            if (jSONObject.isNull(a.f6033V)) {
                i = 1;
                c1396f.f5930aE = 1;
            } else {
                c1396f.f5930aE = jSONObject.optInt(a.f6033V);
                i = 1;
            }
            if (jSONObject.isNull(a.f6034W)) {
                c1396f.f5931aF = new ArrayList(i);
            } else {
                ArrayList arrayList2 = new ArrayList(3);
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(a.f6034W);
                if (jSONArrayOptJSONArray3 != null) {
                    int length2 = jSONArrayOptJSONArray3.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray3.optInt(i3)));
                    }
                }
                c1396f.f5931aF = arrayList2;
            }
            if (jSONObject.isNull(a.f6035X)) {
                c1396f.f5932aG = 2;
            } else {
                c1396f.f5932aG = jSONObject.optInt(a.f6035X);
            }
            if (jSONObject.isNull(a.f6036Y)) {
                c1396f.f5933aH = 1;
            } else {
                c1396f.f5933aH = jSONObject.optInt(a.f6036Y);
            }
            if (jSONObject.isNull(a.f6037Z)) {
                c1396f.f5934aI = 2;
            } else {
                c1396f.f5934aI = jSONObject.optInt(a.f6037Z);
            }
            if (!jSONObject.isNull(a.f6065aa)) {
                c1396f.f5993bp = jSONObject.optJSONObject(a.f6065aa);
            }
            if (!jSONObject.isNull(a.f6066ab)) {
                c1396f.f5936aK = jSONObject.optInt(a.f6066ab);
            }
            if (!jSONObject.isNull(a.f6070af)) {
                c1396f.f5937aL = jSONObject.optInt(a.f6070af);
            }
            if (!jSONObject.isNull(a.f6071ag)) {
                c1396f.f5938aM = jSONObject.optInt(a.f6071ag);
            }
            if (!jSONObject.isNull(a.f6068ad)) {
                c1396f.f5939aN = jSONObject.optInt(a.f6068ad);
            }
            if (!jSONObject.isNull(a.f6069ae)) {
                try {
                    JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray(a.f6069ae);
                    if (jSONArrayOptJSONArray4 != null) {
                        double[][] dArr = new double[jSONArrayOptJSONArray4.length()][];
                        for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                            Object obj = jSONArrayOptJSONArray4.get(i4);
                            if (obj instanceof JSONArray) {
                                JSONArray jSONArray = (JSONArray) obj;
                                dArr[i4] = new double[]{Double.parseDouble(String.valueOf(jSONArray.get(0))), Double.parseDouble(String.valueOf(jSONArray.get(1)))};
                            }
                        }
                        c1396f.f5940aO = dArr;
                    }
                } catch (Exception unused2) {
                }
            }
            if (!jSONObject.isNull(a.f6072ah)) {
                c1396f.f5941aP = jSONObject.optInt(a.f6072ah);
            }
            c1396f.f5944aS = jSONObject.optLong(a.f6073ai, C1659a.f9130f);
            c1396f.f5945aT = jSONObject.optInt(a.f6074aj, 2);
            int iOptInt2 = jSONObject.optInt(a.f6075ak, 1);
            if (iOptInt2 != 1 && iOptInt2 != 2) {
                StringBuilder sb2 = new StringBuilder("filledLoadRequestType error: ");
                sb2.append(iOptInt2);
                sb2.append(", fix requestType to 1");
                iOptInt2 = 1;
            }
            c1396f.f5946aU = iOptInt2;
            c1396f.f5947aV = jSONObject.optInt(a.f6076al, 1);
            c1396f.f5949aX = jSONObject.optInt(a.f6077am, 0);
            c1396f.f5950aY = jSONObject.optString(a.f6078an, "");
            c1396f.f5951aZ = jSONObject.optInt("s2s_sw", 2);
            JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray(a.f6080ap);
            if (jSONArrayOptJSONArray5 != null && (length = jSONArrayOptJSONArray5.length()) > 0) {
                ArrayList arrayList3 = new ArrayList();
                for (int i5 = 0; i5 < length; i5++) {
                    Object obj2 = jSONArrayOptJSONArray5.get(i5);
                    if (obj2 instanceof Integer) {
                        arrayList3.add((Integer) obj2);
                    }
                }
                c1396f.f5948aW = arrayList3;
            }
            c1396f.f5978ba = jSONObject.optInt(a.f6081aq, 1);
            int[] iArr = {1, 2, 3, 4, 5};
            if (!jSONObject.isNull(a.f6082ar) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(a.f6082ar)) != null && jSONArrayOptJSONArray.length() > 0) {
                try {
                    iArr = new int[jSONArrayOptJSONArray.length()];
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                        iArr[i6] = jSONArrayOptJSONArray.getInt(i6);
                    }
                } catch (Exception unused3) {
                    iArr = new int[]{1, 2, 3, 4, 5};
                }
            }
            c1396f.f5979bb = iArr;
            c1396f.f5942aQ = jSONObject.optInt(a.f6083as, 1);
            if (jSONObject.optInt(a.f6084at, 2) == 1) {
                c1396f.f5943aR = C1394d.m4878a(jSONObject.optString(a.f6085au));
            } else {
                c1396f.f5943aR = null;
            }
            c1396f.f5935aJ = jSONObject.optInt(a.f6086av, 0);
            c1396f.f5980bc = jSONObject.optInt(a.f6087aw, 2);
            return c1396f;
        } catch (Exception unused4) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4936b(double d) {
        this.f5955ad = d;
    }

    /* JADX INFO: renamed from: b */
    private void m4937b(int i) {
        this.f5942aQ = i;
    }

    /* JADX INFO: renamed from: b */
    private void m4938b(long j) {
        this.f5975ax = j;
    }

    /* JADX INFO: renamed from: b */
    private void m4939b(List<C1229av> list) {
        this.f5900A = list;
    }

    /* JADX INFO: renamed from: b */
    private void m4940b(Map<String, ATRewardInfo> map) {
        this.f5916Q = map;
    }

    /* JADX INFO: renamed from: ba */
    private String m4941ba() {
        return this.f5921V;
    }

    /* JADX INFO: renamed from: bb */
    private int m4942bb() {
        return this.f5907H;
    }

    /* JADX INFO: renamed from: bc */
    private int m4943bc() {
        return this.f5998m;
    }

    /* JADX INFO: renamed from: bd */
    private int m4944bd() {
        return this.f6003r;
    }

    /* JADX INFO: renamed from: be */
    private int m4945be() {
        return this.f6004s;
    }

    /* JADX INFO: renamed from: bf */
    private int m4946bf() {
        return this.f6005t;
    }

    /* JADX INFO: renamed from: bg */
    private C1227at m4947bg() {
        return this.f5909J;
    }

    /* JADX INFO: renamed from: bh */
    private long m4948bh() {
        return this.f5985bh;
    }

    /* JADX INFO: renamed from: bi */
    private String m4949bi() {
        return this.f5960ai;
    }

    /* JADX INFO: renamed from: bj */
    private long m4950bj() {
        return this.f5969ar;
    }

    /* JADX INFO: renamed from: bk */
    private long m4951bk() {
        return this.f5970as;
    }

    /* JADX INFO: renamed from: bl */
    private int m4952bl() {
        return this.f5930aE;
    }

    /* JADX INFO: renamed from: bm */
    private int m4953bm() {
        return this.f5933aH;
    }

    /* JADX INFO: renamed from: bn */
    private int[] m4954bn() {
        return this.f5979bb;
    }

    /* JADX INFO: renamed from: bo */
    private C1229av m4955bo() {
        List<C1229av> listM5175a = C1403m.m5175a(this, this.f5983bf);
        if (listM5175a.size() > 0) {
            return listM5175a.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private void m4956c(double d) {
        this.f5988bk = d;
    }

    /* JADX INFO: renamed from: c */
    private void m4957c(int i) {
        this.f5934aI = i;
    }

    /* JADX INFO: renamed from: c */
    private void m4958c(long j) {
        this.f5971at = j;
    }

    /* JADX INFO: renamed from: c */
    private void m4959c(String str) {
        this.f5950aY = str;
    }

    /* JADX INFO: renamed from: c */
    private void m4960c(List<Integer> list) {
        this.f5931aF = list;
    }

    /* JADX INFO: renamed from: c */
    private void m4961c(Map<String, Object> map) {
        this.f5915P = map;
    }

    /* JADX INFO: renamed from: d */
    private void m4962d(int i) {
        this.f5946aU = i;
    }

    /* JADX INFO: renamed from: d */
    private void m4963d(long j) {
        this.f5968aq = j;
    }

    /* JADX INFO: renamed from: d */
    private void m4964d(String str) {
        this.f5928aC = str;
    }

    /* JADX INFO: renamed from: d */
    private void m4965d(List<String> list) {
        this.f5957af = list;
    }

    /* JADX INFO: renamed from: e */
    private void m4966e(int i) {
        this.f5947aV = i;
    }

    /* JADX INFO: renamed from: e */
    private void m4967e(long j) {
        this.f5962ak = j;
    }

    /* JADX INFO: renamed from: e */
    private void m4968e(String str) {
        this.f5927aB = str;
    }

    /* JADX INFO: renamed from: e */
    private void m4969e(List<C1261z> list) {
        this.f5952aa = list;
    }

    /* JADX INFO: renamed from: e */
    private void m4970e(JSONObject jSONObject) {
        this.f5976ay = jSONObject;
    }

    /* JADX INFO: renamed from: f */
    private void m4971f(int i) {
        this.f5945aT = i;
    }

    /* JADX INFO: renamed from: f */
    private void m4972f(long j) {
        this.f5954ac = j;
    }

    /* JADX INFO: renamed from: f */
    private void m4973f(String str) {
        this.f5977az = str;
    }

    /* JADX INFO: renamed from: f */
    private void m4974f(JSONObject jSONObject) {
        this.f5993bp = jSONObject;
    }

    /* JADX INFO: renamed from: g */
    private void m4975g(int i) {
        this.f5949aX = i;
    }

    /* JADX INFO: renamed from: g */
    private void m4976g(long j) {
        this.f5920U = j;
    }

    /* JADX INFO: renamed from: g */
    private void m4977g(String str) {
        this.f5967ap = str;
    }

    /* JADX INFO: renamed from: h */
    private void m4978h(int i) {
        this.f5951aZ = i;
    }

    /* JADX INFO: renamed from: h */
    private void m4979h(long j) {
        this.f5905F = j;
    }

    /* JADX INFO: renamed from: h */
    private void m4980h(String str) {
        this.f5963al = str;
    }

    /* JADX INFO: renamed from: i */
    private void m4981i(int i) {
        this.f5932aG = i;
    }

    /* JADX INFO: renamed from: i */
    private void m4982i(long j) {
        this.f5906G = j;
    }

    /* JADX INFO: renamed from: i */
    private void m4983i(String str) {
        this.f5964am = str;
    }

    /* JADX INFO: renamed from: j */
    private void m4984j(int i) {
        this.f5981bd = i;
    }

    /* JADX INFO: renamed from: j */
    private void m4985j(long j) {
        this.f5904E = j;
    }

    /* JADX INFO: renamed from: j */
    private void m4986j(String str) {
        this.f5965an = str;
    }

    /* JADX INFO: renamed from: k */
    private void m4987k(int i) {
        this.f5974aw = i;
    }

    /* JADX INFO: renamed from: k */
    private void m4988k(long j) {
        this.f5995j = j;
    }

    /* JADX INFO: renamed from: k */
    private void m4989k(String str) {
        this.f5959ah = str;
    }

    /* JADX INFO: renamed from: l */
    private void m4990l(int i) {
        this.f5972au = i;
    }

    /* JADX INFO: renamed from: l */
    private void m4991l(long j) {
        this.f5996k = j;
    }

    /* JADX INFO: renamed from: l */
    private void m4992l(String str) {
        this.f5958ag = str;
    }

    /* JADX INFO: renamed from: m */
    private void m4993m(int i) {
        this.f5973av = i;
    }

    /* JADX INFO: renamed from: m */
    private void m4994m(long j) {
        this.f6000o = j;
    }

    /* JADX INFO: renamed from: m */
    private void m4995m(String str) {
        this.f5956ae = str;
    }

    /* JADX INFO: renamed from: n */
    private void m4996n(int i) {
        this.f5913N = i;
    }

    /* JADX INFO: renamed from: n */
    private void m4997n(long j) {
        this.f6001p = j;
    }

    /* JADX INFO: renamed from: n */
    private void m4998n(String str) {
        this.f6011z = str;
    }

    /* JADX INFO: renamed from: o */
    private void m4999o(int i) {
        this.f5910K = i;
    }

    /* JADX INFO: renamed from: o */
    private void m5000o(long j) {
        this.f6002q = j;
    }

    /* JADX INFO: renamed from: o */
    private void m5001o(String str) {
        this.f5982be = str;
    }

    /* JADX INFO: renamed from: p */
    private void m5002p(int i) {
        this.f5912M = i;
    }

    /* JADX INFO: renamed from: p */
    private void m5003p(long j) {
        this.f5985bh = j;
    }

    /* JADX INFO: renamed from: p */
    private void m5004p(String str) {
        this.f5984bg = str;
    }

    /* JADX INFO: renamed from: q */
    private void m5005q(int i) {
        this.f5907H = i;
    }

    /* JADX INFO: renamed from: q */
    private void m5006q(long j) {
        this.f5922W = j;
    }

    /* JADX INFO: renamed from: q */
    private void m5007q(String str) {
        this.f5983bf = str;
    }

    /* JADX INFO: renamed from: r */
    private void m5008r(int i) {
        this.f5903D = i;
    }

    /* JADX INFO: renamed from: r */
    private void m5009r(long j) {
        this.f5924Y = j;
    }

    /* JADX INFO: renamed from: r */
    private void m5010r(String str) {
        this.f5921V = str;
    }

    /* JADX INFO: renamed from: s */
    private void m5011s(int i) {
        this.f5902C = i;
    }

    /* JADX INFO: renamed from: s */
    private void m5012s(long j) {
        this.f5969ar = j;
    }

    /* JADX INFO: renamed from: s */
    private void m5013s(String str) {
        this.f5918S = str;
    }

    /* JADX INFO: renamed from: t */
    private void m5014t(int i) {
        this.f5997l = i;
    }

    /* JADX INFO: renamed from: t */
    private void m5015t(long j) {
        this.f5970as = j;
    }

    /* JADX INFO: renamed from: t */
    private void m5016t(String str) {
        this.f5919T = str;
    }

    /* JADX INFO: renamed from: u */
    private void m5017u(int i) {
        this.f5998m = i;
    }

    /* JADX INFO: renamed from: u */
    private void m5018u(String str) {
        this.f5911L = str;
    }

    /* JADX INFO: renamed from: v */
    private void m5019v(int i) {
        this.f5999n = i;
    }

    /* JADX INFO: renamed from: v */
    private void m5020v(String str) {
        this.f5908I = str;
    }

    /* JADX INFO: renamed from: w */
    private void m5021w(int i) {
        this.f6003r = i;
    }

    /* JADX INFO: renamed from: w */
    private void m5022w(String str) {
        this.f6007v = str;
    }

    /* JADX INFO: renamed from: x */
    private void m5023x(int i) {
        this.f6004s = i;
    }

    /* JADX INFO: renamed from: x */
    private void m5024x(String str) {
        this.f6008w = str;
    }

    /* JADX INFO: renamed from: y */
    private void m5025y(int i) {
        this.f6005t = i;
    }

    /* JADX INFO: renamed from: y */
    private void m5026y(String str) {
        this.f6009x = str;
    }

    /* JADX INFO: renamed from: z */
    private void m5027z(int i) {
        this.f6006u = i;
    }

    /* JADX INFO: renamed from: z */
    private void m5028z(String str) {
        this.f6010y = str;
    }

    /* JADX INFO: renamed from: A */
    public final String m5029A() {
        return this.f5967ap;
    }

    /* JADX INFO: renamed from: B */
    public final long m5030B() {
        return this.f5968aq;
    }

    /* JADX INFO: renamed from: C */
    public final double m5031C() {
        return this.f5966ao;
    }

    /* JADX INFO: renamed from: D */
    public final String m5032D() {
        return this.f5963al;
    }

    /* JADX INFO: renamed from: E */
    public final String m5033E() {
        return this.f5964am;
    }

    /* JADX INFO: renamed from: F */
    public final String m5034F() {
        return this.f5965an;
    }

    /* JADX INFO: renamed from: G */
    public final long m5035G() {
        return this.f5962ak;
    }

    /* JADX INFO: renamed from: H */
    public final String m5036H() {
        return this.f5959ah;
    }

    /* JADX INFO: renamed from: I */
    public final String m5037I() {
        return this.f5958ag;
    }

    /* JADX INFO: renamed from: J */
    public final List<String> m5038J() {
        return this.f5957af;
    }

    /* JADX INFO: renamed from: K */
    public final double m5039K() {
        return this.f5955ad;
    }

    /* JADX INFO: renamed from: L */
    public final String m5040L() {
        return this.f5956ae;
    }

    /* JADX INFO: renamed from: M */
    public final long m5041M() {
        return this.f5954ac;
    }

    /* JADX INFO: renamed from: N */
    public final String m5042N() {
        return this.f6011z;
    }

    /* JADX INFO: renamed from: O */
    public final String m5043O() {
        return this.f5982be;
    }

    /* JADX INFO: renamed from: P */
    public final String m5044P() {
        return this.f5983bf;
    }

    /* JADX INFO: renamed from: Q */
    public final C1209ab m5045Q() {
        return this.f5953ab;
    }

    /* JADX INFO: renamed from: R */
    public final List<C1261z> m5046R() {
        return this.f5952aa;
    }

    /* JADX INFO: renamed from: S */
    public final long m5047S() {
        return this.f5920U;
    }

    /* JADX INFO: renamed from: T */
    public final Map<String, ATRewardInfo> m5048T() {
        return this.f5916Q;
    }

    /* JADX INFO: renamed from: U */
    public final String m5049U() {
        return this.f5918S;
    }

    /* JADX INFO: renamed from: V */
    public final String m5050V() {
        return this.f5919T;
    }

    /* JADX INFO: renamed from: W */
    public final ATRewardInfo m5051W() {
        return this.f5917R;
    }

    /* JADX INFO: renamed from: X */
    public final Map<String, Object> m5052X() {
        return this.f5915P;
    }

    /* JADX INFO: renamed from: Y */
    public final int m5053Y() {
        return this.f5913N;
    }

    /* JADX INFO: renamed from: Z */
    public final int m5054Z() {
        return this.f5910K;
    }

    /* JADX INFO: renamed from: a */
    public final C1229av m5055a(String str) {
        Map<String, C1229av> map = this.f5901B;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m5056a() {
        return this.f5994i;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m5057a(String str, String str2, C1229av c1229av) {
        C1252q c1252qM2719M;
        Map<String, Object> mapM4171c = C1345i.m4171c(c1229av.m2804h());
        boolean zM4145b = C1344h.m4145b();
        C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
        if (!TextUtils.isEmpty(c1229av.m2852z())) {
            mapM4171c.put("payload", c1229av.m2852z());
        }
        if (!TextUtils.isEmpty(c1229av.m2723Q())) {
            mapM4171c.put("custom_inhouse_bid_result", c1229av.m2723Q());
        }
        boolean z = false;
        mapM4171c.put(C1169h.p.f3224c, Boolean.valueOf(c1391aM4865b.m4773r() == 3));
        if (c1391aM4865b.m4774s() == 2 && zM4145b) {
            z = true;
        }
        mapM4171c.put(C1169h.p.f3225d, Boolean.valueOf(z));
        mapM4171c.put(C1169h.p.f3226e, Boolean.valueOf(C1178q.m2182a(C1175n.m2059a().m2148f()).m2190c()));
        mapM4171c.put("ad_type", Integer.valueOf(c1229av.m2730X()));
        if (this.f5930aE == 1) {
            mapM4171c.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.MEDIATION_WF_ID, str + "_" + this.f5910K + "_" + this.f6006u);
        }
        mapM4171c.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.STACK_INFO, C1387u.m4556a().m4574f(str));
        if (c1229av.m2784d() == 28 && (c1252qM2719M = c1229av.m2719M()) != null) {
            mapM4171c.put(C1169h.p.f3232k, Double.valueOf(C1344h.m4129a(c1229av) * c1252qM2719M.f4443l));
        }
        String strM4079l = C1341e.m4079l();
        if (!TextUtils.isEmpty(strM4079l)) {
            mapM4171c.put(ATAdConst.KEY.WECHAT_APPID, strM4079l);
        }
        if (c1229av.m2784d() == 35 || c1229av.m2826m() == 3 || c1229av.m2826m() == 4 || c1229av.m2826m() == 7) {
            C1248m c1248m = new C1248m();
            c1248m.f4320a = c1229av.m2852z();
            c1248m.f4325f = c1229av.m2784d();
            c1248m.f4322c = c1229av.m2842u();
            c1248m.f4323d = str2;
            c1248m.f4321b = str;
            c1248m.f4327h = this.f5910K;
            c1248m.f4328i = this.f6006u;
            c1248m.f4329j = this.f5902C;
            c1248m.f4326g = c1229av.m2789e();
            C1252q c1252qM2719M2 = c1229av.m2719M();
            c1248m.f4330k = c1252qM2719M2 != null ? c1252qM2719M2.f4438g : "";
            c1248m.f4331l = c1252qM2719M2 != null ? c1252qM2719M2.f4439h : "";
            c1248m.f4333n = c1229av.m2784d() == 35 ? this.f5953ab : C1218ak.m2506i(this.f5984bg);
            AbstractC1249n abstractC1249n = c1248m.f4333n;
            if (abstractC1249n != null) {
                abstractC1249n.m3374s(this.f5902C);
            }
            c1248m.f4332m = c1252qM2719M2 != null ? c1252qM2719M2.f4437f : 0L;
            if (TextUtils.equals(String.valueOf(this.f5902C), "0")) {
                c1248m.f4334o = TextUtils.equals(ATInitMediation.getStringFromMap(mapM4171c, "layout_type", ""), "1");
                c1248m.f4335p = c1391aM4865b.m4752as();
            }
            mapM4171c.put(C1169h.p.f3222a, c1248m);
        }
        if (c1229av.m2756ai()) {
            mapM4171c.put(C1169h.p.f3230i, this.f5976ay);
        }
        if (c1229av.m2784d() == 50 && this.f5933aH == 1) {
            mapM4171c.put(C1169h.p.f3234m, str2);
        }
        if (c1229av.m2784d() == 46) {
            ATAdConst.CURRENCY currency = ATAdConst.CURRENCY.RMB;
            if (TextUtils.equals(c1229av.m2755ah(), "USD")) {
                currency = ATAdConst.CURRENCY.USD;
            }
            mapM4171c.put(C1169h.p.f3235n, currency);
        }
        if (c1229av.m2784d() == 2) {
            mapM4171c.put(C1169h.p.f3237p, c1229av.m2766as());
        }
        if (c1229av.m2730X() == 0) {
            mapM4171c.put(a.f6081aq, Integer.valueOf(this.f5978ba));
            if (c1229av.m2772ay() == null) {
                mapM4171c.put(a.f6082ar, this.f5979bb);
            } else {
                mapM4171c.put(a.f6082ar, c1229av.m2772ay());
            }
        }
        JSONObject jSONObjectM4720Q = c1391aM4865b.m4720Q();
        if (jSONObjectM4720Q != null) {
            try {
                String string = jSONObjectM4720Q.getString(String.valueOf(c1229av.m2784d()));
                if (!TextUtils.isEmpty(string)) {
                    mapM4171c.put("network_ext", string);
                }
            } catch (Exception unused) {
            }
        }
        JSONArray jSONArrayM2745aC = c1229av.m2745aC();
        if (jSONArrayM2745aC != null && jSONArrayM2745aC.length() > 0) {
            mapM4171c.put("web_content_urls", jSONArrayM2745aC);
        }
        int iM2746aD = c1229av.m2746aD();
        if (iM2746aD > 0) {
            mapM4171c.put(C1294j.f4865aC, Integer.valueOf(iM2746aD));
        }
        mapM4171c.put("ad_s_reqf_mode", Integer.valueOf(c1229av.m2747aE()));
        return mapM4171c;
    }

    /* JADX INFO: renamed from: a */
    public final void m5058a(int i) {
        this.f5935aJ = i;
    }

    /* JADX INFO: renamed from: aA */
    public final String m5059aA() {
        return this.f5986bi;
    }

    /* JADX INFO: renamed from: aB */
    public final String m5060aB() {
        return this.f5987bj;
    }

    /* JADX INFO: renamed from: aC */
    public final int m5061aC() {
        return this.f5990bm;
    }

    /* JADX INFO: renamed from: aD */
    public final int m5062aD() {
        return this.f5989bl;
    }

    /* JADX INFO: renamed from: aE */
    public final double m5063aE() {
        return this.f5988bk;
    }

    /* JADX INFO: renamed from: aF */
    public final int m5064aF() {
        return this.f5991bn;
    }

    /* JADX INFO: renamed from: aG */
    public final int m5065aG() {
        return this.f5992bo;
    }

    /* JADX INFO: renamed from: aH */
    public final int m5066aH() {
        return this.f5929aD;
    }

    /* JADX INFO: renamed from: aI */
    public final JSONObject m5067aI() {
        return this.f5993bp;
    }

    /* JADX INFO: renamed from: aJ */
    public final boolean m5068aJ() {
        return this.f5935aJ == 1;
    }

    /* JADX INFO: renamed from: aK */
    public final boolean m5069aK() {
        return this.f5936aK == 1;
    }

    /* JADX INFO: renamed from: aL */
    public final boolean m5070aL() {
        return this.f5935aJ == 2;
    }

    /* JADX INFO: renamed from: aM */
    public final boolean m5071aM() {
        return this.f5935aJ == 0;
    }

    /* JADX INFO: renamed from: aN */
    public final int m5072aN() {
        return this.f5937aL;
    }

    /* JADX INFO: renamed from: aO */
    public final int m5073aO() {
        return this.f5938aM;
    }

    /* JADX INFO: renamed from: aP */
    public final int m5074aP() {
        return this.f5939aN;
    }

    /* JADX INFO: renamed from: aQ */
    public final double[][] m5075aQ() {
        return this.f5940aO;
    }

    /* JADX INFO: renamed from: aR */
    public final int m5076aR() {
        return this.f5935aJ;
    }

    /* JADX INFO: renamed from: aS */
    public final int m5077aS() {
        return this.f5941aP;
    }

    /* JADX INFO: renamed from: aT */
    public final int m5078aT() {
        return this.f5978ba;
    }

    /* JADX INFO: renamed from: aU */
    public final boolean m5079aU() {
        return this.f5980bc == 1;
    }

    /* JADX INFO: renamed from: aV */
    public final boolean m5080aV() {
        return this.f5998m == 1;
    }

    /* JADX INFO: renamed from: aW */
    public final boolean m5081aW() {
        new StringBuilder("Already cache time -- > ").append(System.currentTimeMillis() - this.f5985bh);
        return System.currentTimeMillis() - this.f5985bh > this.f5995j;
    }

    /* JADX INFO: renamed from: aX */
    public final boolean m5082aX() {
        return !TextUtils.isEmpty(this.f5950aY);
    }

    /* JADX INFO: renamed from: aa */
    public final String m5083aa() {
        return this.f5911L;
    }

    /* JADX INFO: renamed from: ab */
    public final int m5084ab() {
        return this.f5912M;
    }

    /* JADX INFO: renamed from: ac */
    public final long m5085ac() {
        return this.f5905F;
    }

    /* JADX INFO: renamed from: ad */
    public final long m5086ad() {
        return this.f5906G;
    }

    /* JADX INFO: renamed from: ae */
    public final String m5087ae() {
        return this.f5908I;
    }

    /* JADX INFO: renamed from: af */
    public final int m5088af() {
        return this.f5903D;
    }

    /* JADX INFO: renamed from: ag */
    public final long m5089ag() {
        return this.f5904E;
    }

    /* JADX INFO: renamed from: ah */
    public final int m5090ah() {
        return this.f5902C;
    }

    /* JADX INFO: renamed from: ai */
    public final long m5091ai() {
        return this.f5996k;
    }

    /* JADX INFO: renamed from: aj */
    public final int m5092aj() {
        return this.f5997l;
    }

    /* JADX INFO: renamed from: ak */
    public final int m5093ak() {
        return this.f5999n;
    }

    /* JADX INFO: renamed from: al */
    public final long m5094al() {
        return this.f6000o;
    }

    /* JADX INFO: renamed from: am */
    public final long m5095am() {
        return this.f6001p;
    }

    /* JADX INFO: renamed from: an */
    public final long m5096an() {
        return this.f6002q;
    }

    /* JADX INFO: renamed from: ao */
    public final int m5097ao() {
        return this.f6006u;
    }

    /* JADX INFO: renamed from: ap */
    public final String m5098ap() {
        return this.f6007v;
    }

    /* JADX INFO: renamed from: aq */
    public final String m5099aq() {
        return this.f6008w;
    }

    /* JADX INFO: renamed from: ar */
    public final String m5100ar() {
        return this.f6009x;
    }

    /* JADX INFO: renamed from: as */
    public final String m5101as() {
        return this.f6010y;
    }

    /* JADX INFO: renamed from: at */
    public final long m5102at() {
        return this.f5922W;
    }

    /* JADX INFO: renamed from: aw */
    public final int m5103aw() {
        return this.f5923X;
    }

    /* JADX INFO: renamed from: ax */
    public final long m5104ax() {
        return this.f5924Y;
    }

    /* JADX INFO: renamed from: ay */
    public final int m5105ay() {
        return this.f5925Z;
    }

    /* JADX INFO: renamed from: az */
    public final String m5106az() {
        return this.f5961aj;
    }

    /* JADX INFO: renamed from: b */
    public final C1261z m5107b(String str) {
        List<C1261z> list = this.f5952aa;
        if (list == null) {
            return null;
        }
        for (C1261z c1261z : list) {
            if (c1261z.m3220o() == null) {
                c1261z.m3186a((AbstractC1249n) this.f5953ab);
            }
            if (TextUtils.equals(str, c1261z.m3229t()) && !c1261z.m3503a(this.f5953ab)) {
                return c1261z;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C1394d m5108b() {
        return this.f5943aR;
    }

    /* JADX INFO: renamed from: c */
    public final int m5109c() {
        return this.f5942aQ;
    }

    /* JADX INFO: renamed from: d */
    public final int m5110d() {
        return this.f5934aI;
    }

    /* JADX INFO: renamed from: e */
    public final List<Integer> m5111e() {
        return this.f5948aW;
    }

    /* JADX INFO: renamed from: f */
    public final int m5112f() {
        return this.f5946aU;
    }

    /* JADX INFO: renamed from: g */
    public final int m5113g() {
        return this.f5947aV;
    }

    /* JADX INFO: renamed from: h */
    public final int m5114h() {
        return this.f5945aT;
    }

    /* JADX INFO: renamed from: i */
    public final int m5115i() {
        return this.f5945aT == 1 ? 2 : 1;
    }

    /* JADX INFO: renamed from: j */
    public final long m5116j() {
        return this.f5944aS;
    }

    /* JADX INFO: renamed from: k */
    public final int m5117k() {
        return this.f5949aX;
    }

    /* JADX INFO: renamed from: l */
    public final String m5118l() {
        return this.f5950aY;
    }

    /* JADX INFO: renamed from: m */
    public final int m5119m() {
        return this.f5951aZ;
    }

    /* JADX INFO: renamed from: n */
    public final List<C1229av> m5120n() {
        return this.f5900A;
    }

    /* JADX INFO: renamed from: o */
    public final int m5121o() {
        return this.f5932aG;
    }

    /* JADX INFO: renamed from: p */
    public final List<Integer> m5122p() {
        return this.f5931aF;
    }

    /* JADX INFO: renamed from: q */
    public final String m5123q() {
        return this.f5928aC;
    }

    /* JADX INFO: renamed from: r */
    public final String m5124r() {
        return this.f5927aB;
    }

    /* JADX INFO: renamed from: s */
    public final JSONObject m5125s() {
        return this.f5926aA;
    }

    /* JADX INFO: renamed from: t */
    public final String m5126t() {
        return this.f5977az;
    }

    /* JADX INFO: renamed from: u */
    public final int m5127u() {
        return this.f5981bd;
    }

    /* JADX INFO: renamed from: v */
    public final long m5128v() {
        return this.f5975ax;
    }

    /* JADX INFO: renamed from: w */
    public final int m5129w() {
        return this.f5974aw;
    }

    /* JADX INFO: renamed from: x */
    public final int m5130x() {
        return this.f5972au;
    }

    /* JADX INFO: renamed from: y */
    public final int m5131y() {
        int i = this.f5972au;
        if (i == 1) {
            return this.f5999n;
        }
        if (i != 2) {
            return 1;
        }
        return this.f5973av;
    }

    /* JADX INFO: renamed from: z */
    public final long m5132z() {
        return this.f5971at;
    }
}
