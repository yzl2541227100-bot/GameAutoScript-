package com.anythink.expressad.foundation.p116d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.basead.p014b.C0739a;
import com.anythink.core.common.C1325o;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p114c.p115a.C1776a;
import com.anythink.expressad.foundation.p138h.C1876j;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.p073a.C1411c;
import com.anythink.expressad.p089e.InterfaceC1491b;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.d.c */
/* JADX INFO: loaded from: classes.dex */
public class C1781c extends C1786h implements InterfaceC1491b, Serializable {

    /* JADX INFO: renamed from: A */
    public static final int f10182A = -2;

    /* JADX INFO: renamed from: B */
    public static final int f10183B = 1;

    /* JADX INFO: renamed from: C */
    public static final String f10184C = "id";

    /* JADX INFO: renamed from: D */
    public static final String f10185D = "unitId";

    /* JADX INFO: renamed from: E */
    public static final String f10186E = "title";

    /* JADX INFO: renamed from: F */
    public static final String f10187F = "desc";

    /* JADX INFO: renamed from: G */
    public static final String f10188G = "package_name";

    /* JADX INFO: renamed from: H */
    public static final String f10189H = "icon_url";

    /* JADX INFO: renamed from: I */
    public static final String f10190I = "image_url";

    /* JADX INFO: renamed from: J */
    public static final String f10191J = "image_size";

    /* JADX INFO: renamed from: K */
    public static final String f10192K = "app_size";

    /* JADX INFO: renamed from: L */
    public static final String f10193L = "impression_url";

    /* JADX INFO: renamed from: M */
    public static final String f10194M = "click_url";

    /* JADX INFO: renamed from: N */
    public static final String f10195N = "wtick";

    /* JADX INFO: renamed from: O */
    public static final String f10196O = "deep_link";

    /* JADX INFO: renamed from: P */
    public static final String f10197P = "user_activation";

    /* JADX INFO: renamed from: Q */
    public static final String f10198Q = "notice_url";

    /* JADX INFO: renamed from: R */
    public static final String f10199R = "template";

    /* JADX INFO: renamed from: S */
    public static final String f10200S = "ad_source_id";

    /* JADX INFO: renamed from: T */
    public static final String f10201T = "fca";

    /* JADX INFO: renamed from: U */
    public static final String f10202U = "fcb";

    /* JADX INFO: renamed from: V */
    public static final String f10203V = "click_mode";

    /* JADX INFO: renamed from: W */
    public static final String f10204W = "landing_type";

    /* JADX INFO: renamed from: X */
    public static final String f10205X = "link_type";

    /* JADX INFO: renamed from: Y */
    public static final String f10206Y = "rating";

    /* JADX INFO: renamed from: Z */
    public static final String f10207Z = "number_rating";

    /* JADX INFO: renamed from: a */
    public static final String f10208a = C1781c.class.getSimpleName();

    /* JADX INFO: renamed from: aA */
    public static final String f10209aA = "vctn_t";

    /* JADX INFO: renamed from: aB */
    public static final String f10210aB = "vck_t";

    /* JADX INFO: renamed from: aC */
    public static final String f10211aC = "rs_ignc_r";

    /* JADX INFO: renamed from: aD */
    public static final int f10212aD = 1;

    /* JADX INFO: renamed from: aE */
    public static final int f10213aE = 2;

    /* JADX INFO: renamed from: aF */
    public static final String f10214aF = "rw_pl";

    /* JADX INFO: renamed from: aG */
    public static final String f10215aG = "jm_pd";

    /* JADX INFO: renamed from: aI */
    public static final String f10216aI = "oc_type";

    /* JADX INFO: renamed from: aJ */
    public static final String f10217aJ = "oc_time";

    /* JADX INFO: renamed from: aK */
    public static final String f10218aK = "t_list";

    /* JADX INFO: renamed from: aL */
    public static final String f10219aL = "adchoice";

    /* JADX INFO: renamed from: aM */
    public static final String f10220aM = "omid";

    /* JADX INFO: renamed from: aN */
    public static final String f10221aN = "ia_icon";

    /* JADX INFO: renamed from: aO */
    public static final String f10222aO = "ia_rst";

    /* JADX INFO: renamed from: aP */
    public static final String f10223aP = "ia_url";

    /* JADX INFO: renamed from: aQ */
    public static final String f10224aQ = "ia_ori";

    /* JADX INFO: renamed from: aR */
    public static final String f10225aR = "ad_type";

    /* JADX INFO: renamed from: aS */
    public static final String f10226aS = "ia_ext1";

    /* JADX INFO: renamed from: aT */
    public static final String f10227aT = "ia_ext2";

    /* JADX INFO: renamed from: aU */
    public static final String f10228aU = "is_download_zip";

    /* JADX INFO: renamed from: aV */
    public static final String f10229aV = "ia_cache";

    /* JADX INFO: renamed from: aW */
    public static final String f10230aW = "imp_ua";

    /* JADX INFO: renamed from: aX */
    public static final String f10231aX = "c_ua";

    /* JADX INFO: renamed from: aY */
    public static final int f10232aY = 1;

    /* JADX INFO: renamed from: aZ */
    public static final int f10233aZ = 1;

    /* JADX INFO: renamed from: aa */
    public static final String f10234aa = "ctatext";

    /* JADX INFO: renamed from: ab */
    public static final String f10235ab = "c_ct";

    /* JADX INFO: renamed from: ac */
    public static final String f10236ac = "video_url";

    /* JADX INFO: renamed from: ad */
    public static final String f10237ad = "video_length";

    /* JADX INFO: renamed from: ae */
    public static final String f10238ae = "video_size";

    /* JADX INFO: renamed from: af */
    public static final String f10239af = "video_resolution";

    /* JADX INFO: renamed from: ag */
    public static final String f10240ag = "watch_mile";

    /* JADX INFO: renamed from: ah */
    public static final String f10241ah = "endcard_click_result";

    /* JADX INFO: renamed from: ai */
    public static final String f10242ai = "ctype";

    /* JADX INFO: renamed from: aj */
    public static final String f10243aj = "adv_imp";

    /* JADX INFO: renamed from: ak */
    public static final String f10244ak = "t_imp";

    /* JADX INFO: renamed from: al */
    public static final String f10245al = "sec";

    /* JADX INFO: renamed from: am */
    public static final String f10246am = "url";

    /* JADX INFO: renamed from: an */
    public static final String f10247an = "guidelines";

    /* JADX INFO: renamed from: ao */
    public static final String f10248ao = "offer_type";

    /* JADX INFO: renamed from: ap */
    public static final String f10249ap = "reward_amount";

    /* JADX INFO: renamed from: aq */
    public static final String f10250aq = "reward_name";

    /* JADX INFO: renamed from: ar */
    public static final String f10251ar = "md5_file";

    /* JADX INFO: renamed from: as */
    public static final String f10252as = "c_toi";

    /* JADX INFO: renamed from: at */
    public static final int f10253at = 2;

    /* JADX INFO: renamed from: au */
    public static final String f10254au = "5";

    /* JADX INFO: renamed from: av */
    public static final String f10255av = "rtins_type";

    /* JADX INFO: renamed from: aw */
    public static final String f10256aw = "ad_url_list";

    /* JADX INFO: renamed from: ax */
    public static final String f10257ax = "retarget_offer";

    /* JADX INFO: renamed from: ay */
    public static final String f10258ay = "flb";

    /* JADX INFO: renamed from: az */
    public static final String f10259az = "flb_skiptime";

    /* JADX INFO: renamed from: b */
    public static final String f10260b = "ad_tpl_url";

    /* JADX INFO: renamed from: bA */
    public static final int f10261bA = 9;

    /* JADX INFO: renamed from: bB */
    public static final int f10262bB = 12;

    /* JADX INFO: renamed from: bC */
    public static final String f10263bC = "video_end_type";

    /* JADX INFO: renamed from: bD */
    public static final int f10264bD = 1;

    /* JADX INFO: renamed from: bE */
    public static final int f10265bE = 2;

    /* JADX INFO: renamed from: bF */
    public static final int f10266bF = 3;

    /* JADX INFO: renamed from: bG */
    public static final int f10267bG = 4;

    /* JADX INFO: renamed from: bH */
    public static final int f10268bH = 5;

    /* JADX INFO: renamed from: bI */
    public static final int f10269bI = 100;

    /* JADX INFO: renamed from: bJ */
    public static final int f10270bJ = 2;

    /* JADX INFO: renamed from: bL */
    public static final String f10271bL = "ready_rate";

    /* JADX INFO: renamed from: bM */
    public static final String f10272bM = "tmp_ids";

    /* JADX INFO: renamed from: bN */
    public static final String f10273bN = "ext_data";

    /* JADX INFO: renamed from: bO */
    public static final String f10274bO = "endcard_url";

    /* JADX INFO: renamed from: bP */
    public static final String f10275bP = "playable_ads_without_video";

    /* JADX INFO: renamed from: bQ */
    public static final int f10276bQ = 1;

    /* JADX INFO: renamed from: bR */
    public static final int f10277bR = 2;

    /* JADX INFO: renamed from: bS */
    public static final String f10278bS = "impression";

    /* JADX INFO: renamed from: bT */
    public static final String f10279bT = "start";

    /* JADX INFO: renamed from: bU */
    public static final String f10280bU = "first_quartile";

    /* JADX INFO: renamed from: bV */
    public static final String f10281bV = "midpoint";

    /* JADX INFO: renamed from: bW */
    public static final String f10282bW = "third_quartile";

    /* JADX INFO: renamed from: bX */
    public static final String f10283bX = "complete";

    /* JADX INFO: renamed from: bY */
    public static final String f10284bY = "mute";

    /* JADX INFO: renamed from: bZ */
    public static final String f10285bZ = "unmute";

    /* JADX INFO: renamed from: ba */
    public static final String f10286ba = "iex";

    /* JADX INFO: renamed from: bb */
    public static final String f10287bb = "ts";

    /* JADX INFO: renamed from: bc */
    public static final String f10288bc = "nv_t2";

    /* JADX INFO: renamed from: bd */
    public static final String f10289bd = "impression_t2";

    /* JADX INFO: renamed from: be */
    public static final String f10290be = "gif_url";

    /* JADX INFO: renamed from: bf */
    public static final String f10291bf = "dropout_track";

    /* JADX INFO: renamed from: bg */
    public static final String f10292bg = "plycmpt_track";

    /* JADX INFO: renamed from: bh */
    public static final String f10293bh = "aks";

    /* JADX INFO: renamed from: bi */
    public static final String f10294bi = "k";

    /* JADX INFO: renamed from: bj */
    public static final String f10295bj = "q";

    /* JADX INFO: renamed from: bk */
    public static final String f10296bk = "r";

    /* JADX INFO: renamed from: bl */
    public static final String f10297bl = "al";

    /* JADX INFO: renamed from: bm */
    public static final String f10298bm = "mp";

    /* JADX INFO: renamed from: bn */
    public static final String f10299bn = "pv_urls";

    /* JADX INFO: renamed from: bo */
    public static final int f10300bo = 3;

    /* JADX INFO: renamed from: bp */
    public static final int f10301bp = 4;

    /* JADX INFO: renamed from: bq */
    public static final int f10302bq = 1;

    /* JADX INFO: renamed from: br */
    public static final int f10303br = 2;

    /* JADX INFO: renamed from: bs */
    public static final int f10304bs = 3;

    /* JADX INFO: renamed from: bt */
    public static final int f10305bt = 1;

    /* JADX INFO: renamed from: bu */
    public static final int f10306bu = 2;

    /* JADX INFO: renamed from: bv */
    public static final int f10307bv = 1;

    /* JADX INFO: renamed from: bw */
    public static final int f10308bw = 2;

    /* JADX INFO: renamed from: bx */
    public static final int f10309bx = 3;

    /* JADX INFO: renamed from: by */
    public static final int f10310by = 4;

    /* JADX INFO: renamed from: bz */
    public static final int f10311bz = 8;

    /* JADX INFO: renamed from: c */
    public static final String f10312c = "ad_html";

    /* JADX INFO: renamed from: ca */
    public static final String f10313ca = "click";

    /* JADX INFO: renamed from: cb */
    public static final String f10314cb = "pause";

    /* JADX INFO: renamed from: cc */
    public static final String f10315cc = "resume";

    /* JADX INFO: renamed from: cd */
    public static final String f10316cd = "error";

    /* JADX INFO: renamed from: ce */
    public static final String f10317ce = "endcard";

    /* JADX INFO: renamed from: cf */
    public static final String f10318cf = "close";

    /* JADX INFO: renamed from: cg */
    public static final String f10319cg = "video_click";

    /* JADX INFO: renamed from: ch */
    public static final String f10320ch = "endcard_show";

    /* JADX INFO: renamed from: ci */
    public static final String f10321ci = "play_percentage";

    /* JADX INFO: renamed from: cj */
    public static final String f10322cj = "ad_tracking";

    /* JADX INFO: renamed from: ck */
    public static final String f10323ck = "rv";

    /* JADX INFO: renamed from: cl */
    public static final int f10324cl = -1;

    /* JADX INFO: renamed from: cm */
    public static final int f10325cm = 1;

    /* JADX INFO: renamed from: cn */
    public static final int f10326cn = 0;

    /* JADX INFO: renamed from: d */
    public static final String f10327d = "cmpt=1";

    /* JADX INFO: renamed from: dP */
    private static final long f10328dP = 1;

    /* JADX INFO: renamed from: e */
    public static final String f10329e = "tp_offer";

    /* JADX INFO: renamed from: eS */
    private static final int f10330eS = 100;

    /* JADX INFO: renamed from: f */
    public static final String f10331f = "fac";

    /* JADX INFO: renamed from: g */
    public static final String f10332g = "at_cd_rate";

    /* JADX INFO: renamed from: h */
    public static final String f10333h = "plct";

    /* JADX INFO: renamed from: i */
    public static final String f10334i = "plctb";

    /* JADX INFO: renamed from: j */
    public static final String f10335j = "banner_url";

    /* JADX INFO: renamed from: k */
    public static final String f10336k = "banner_html";

    /* JADX INFO: renamed from: l */
    public static final String f10337l = "creative_id";

    /* JADX INFO: renamed from: m */
    public static final String f10338m = "mraid";

    /* JADX INFO: renamed from: n */
    public static final String f10339n = "mraid_src";

    /* JADX INFO: renamed from: o */
    public static final String f10340o = "timestamp";

    /* JADX INFO: renamed from: p */
    public static final String f10341p = "hb";

    /* JADX INFO: renamed from: q */
    public static final String f10342q = "maitve";

    /* JADX INFO: renamed from: r */
    public static final String f10343r = "maitve_src";

    /* JADX INFO: renamed from: s */
    public static final String f10344s = "vcn";

    /* JADX INFO: renamed from: t */
    public static final String f10345t = "token_r";

    /* JADX INFO: renamed from: u */
    public static final String f10346u = "encrypt_p";

    /* JADX INFO: renamed from: v */
    public static final String f10347v = "view_com_time";

    /* JADX INFO: renamed from: w */
    public static final String f10348w = "adspace_t";

    /* JADX INFO: renamed from: x */
    public static final String f10349x = "cbd";

    /* JADX INFO: renamed from: y */
    public static final String f10350y = "vst";

    /* JADX INFO: renamed from: z */
    public static final int f10351z = -2;

    /* JADX INFO: renamed from: aH */
    public C1794p f10352aH;

    /* JADX INFO: renamed from: cZ */
    private List<String> f10358cZ;

    /* JADX INFO: renamed from: dA */
    private String f10359dA;

    /* JADX INFO: renamed from: dB */
    private int f10360dB;

    /* JADX INFO: renamed from: dC */
    private String f10361dC;

    /* JADX INFO: renamed from: dD */
    private int f10362dD;

    /* JADX INFO: renamed from: dE */
    private int f10363dE;

    /* JADX INFO: renamed from: dF */
    private String f10364dF;

    /* JADX INFO: renamed from: dG */
    private String f10365dG;

    /* JADX INFO: renamed from: dH */
    private int f10366dH;

    /* JADX INFO: renamed from: dI */
    private String f10367dI;

    /* JADX INFO: renamed from: dJ */
    private a f10368dJ;

    /* JADX INFO: renamed from: dL */
    private int f10370dL;

    /* JADX INFO: renamed from: dM */
    private String f10371dM;

    /* JADX INFO: renamed from: dR */
    private String f10375dR;

    /* JADX INFO: renamed from: da */
    private long f10384da;

    /* JADX INFO: renamed from: dd */
    private int f10387dd;

    /* JADX INFO: renamed from: dl */
    private boolean f10395dl;

    /* JADX INFO: renamed from: du */
    private int f10404du;

    /* JADX INFO: renamed from: dv */
    private int f10405dv;

    /* JADX INFO: renamed from: dw */
    private int f10406dw;

    /* JADX INFO: renamed from: dx */
    private int f10407dx;

    /* JADX INFO: renamed from: dy */
    private int f10408dy;

    /* JADX INFO: renamed from: dz */
    private int f10409dz;

    /* JADX INFO: renamed from: eA */
    private int f10410eA;

    /* JADX INFO: renamed from: eB */
    private String f10411eB;

    /* JADX INFO: renamed from: eC */
    private int f10412eC;

    /* JADX INFO: renamed from: eD */
    private String f10413eD;

    /* JADX INFO: renamed from: eE */
    private HashMap<String, String> f10414eE;

    /* JADX INFO: renamed from: eF */
    private String f10415eF;

    /* JADX INFO: renamed from: eG */
    private String f10416eG;

    /* JADX INFO: renamed from: eH */
    private String f10417eH;

    /* JADX INFO: renamed from: eI */
    private String f10418eI;

    /* JADX INFO: renamed from: eJ */
    private String f10419eJ;

    /* JADX INFO: renamed from: eK */
    private boolean f10420eK;

    /* JADX INFO: renamed from: eM */
    private String f10422eM;

    /* JADX INFO: renamed from: eN */
    private boolean f10423eN;

    /* JADX INFO: renamed from: eO */
    private boolean f10424eO;

    /* JADX INFO: renamed from: eQ */
    private int f10426eQ;

    /* JADX INFO: renamed from: eT */
    private String f10428eT;

    /* JADX INFO: renamed from: eV */
    private String f10430eV;

    /* JADX INFO: renamed from: eW */
    private String f10431eW;

    /* JADX INFO: renamed from: eX */
    private int f10432eX;

    /* JADX INFO: renamed from: eY */
    private String f10433eY;

    /* JADX INFO: renamed from: eb */
    private int f10436eb;

    /* JADX INFO: renamed from: ec */
    private int f10437ec;

    /* JADX INFO: renamed from: ed */
    private int f10438ed;

    /* JADX INFO: renamed from: ee */
    private String f10439ee;

    /* JADX INFO: renamed from: ef */
    private String f10440ef;

    /* JADX INFO: renamed from: eg */
    private String f10441eg;

    /* JADX INFO: renamed from: eh */
    private String f10442eh;

    /* JADX INFO: renamed from: ei */
    private int f10443ei;

    /* JADX INFO: renamed from: ej */
    private boolean f10444ej;

    /* JADX INFO: renamed from: el */
    private boolean f10446el;

    /* JADX INFO: renamed from: em */
    private int f10447em;

    /* JADX INFO: renamed from: eo */
    private int f10449eo;

    /* JADX INFO: renamed from: ep */
    private String f10450ep;

    /* JADX INFO: renamed from: eq */
    private int f10451eq;

    /* JADX INFO: renamed from: er */
    private int f10452er;

    /* JADX INFO: renamed from: es */
    private String f10453es;

    /* JADX INFO: renamed from: et */
    private int f10454et;

    /* JADX INFO: renamed from: eu */
    private int f10455eu;

    /* JADX INFO: renamed from: ev */
    private int f10456ev;

    /* JADX INFO: renamed from: ew */
    private String f10457ew;

    /* JADX INFO: renamed from: ex */
    private int f10458ex;

    /* JADX INFO: renamed from: ey */
    private String f10459ey;

    /* JADX INFO: renamed from: ez */
    private String f10460ez;

    /* JADX INFO: renamed from: fA */
    private String f10461fA;

    /* JADX INFO: renamed from: fC */
    private int f10463fC;

    /* JADX INFO: renamed from: fb */
    private String f10465fb;

    /* JADX INFO: renamed from: fd */
    private C1792n f10467fd;

    /* JADX INFO: renamed from: fe */
    private String f10468fe;

    /* JADX INFO: renamed from: ff */
    private String f10469ff;

    /* JADX INFO: renamed from: fg */
    private int f10470fg;

    /* JADX INFO: renamed from: fh */
    private long f10471fh;

    /* JADX INFO: renamed from: fi */
    private String f10472fi;

    /* JADX INFO: renamed from: fj */
    private String f10473fj;

    /* JADX INFO: renamed from: fk */
    private int f10474fk;

    /* JADX INFO: renamed from: fl */
    private String f10475fl;

    /* JADX INFO: renamed from: fm */
    private int f10476fm;

    /* JADX INFO: renamed from: fn */
    private b f10477fn;

    /* JADX INFO: renamed from: fo */
    private c f10478fo;

    /* JADX INFO: renamed from: fp */
    private C1411c.b f10479fp;

    /* JADX INFO: renamed from: fs */
    private int f10482fs;

    /* JADX INFO: renamed from: fu */
    private ArrayList<Integer> f10484fu;

    /* JADX INFO: renamed from: cV */
    private int f10354cV = 1;

    /* JADX INFO: renamed from: cW */
    private String f10355cW = "";

    /* JADX INFO: renamed from: cX */
    private String f10356cX = "";

    /* JADX INFO: renamed from: cY */
    private boolean f10357cY = false;

    /* JADX INFO: renamed from: db */
    private int f10385db = 0;

    /* JADX INFO: renamed from: dc */
    private int f10386dc = 0;

    /* JADX INFO: renamed from: de */
    private int f10388de = -2;

    /* JADX INFO: renamed from: df */
    private int f10389df = -2;

    /* JADX INFO: renamed from: dg */
    private long f10390dg = 0;

    /* JADX INFO: renamed from: dh */
    private long f10391dh = 0;

    /* JADX INFO: renamed from: di */
    private String f10392di = "";

    /* JADX INFO: renamed from: dj */
    private String f10393dj = "";

    /* JADX INFO: renamed from: dk */
    private long f10394dk = 0;

    /* JADX INFO: renamed from: dm */
    private int f10396dm = 0;

    /* JADX INFO: renamed from: dn */
    private int f10397dn = 0;

    /* JADX INFO: renamed from: do */
    private String f10398do = "";

    /* JADX INFO: renamed from: dp */
    private boolean f10399dp = false;

    /* JADX INFO: renamed from: dq */
    private int f10400dq = 0;

    /* JADX INFO: renamed from: dr */
    private boolean f10401dr = false;

    /* JADX INFO: renamed from: ds */
    private int f10402ds = 0;

    /* JADX INFO: renamed from: dt */
    private int f10403dt = -1;

    /* JADX INFO: renamed from: dK */
    private int f10369dK = 0;

    /* JADX INFO: renamed from: dN */
    private int f10372dN = 1;

    /* JADX INFO: renamed from: dO */
    private int f10373dO = 1;

    /* JADX INFO: renamed from: dQ */
    private int f10374dQ = 6;

    /* JADX INFO: renamed from: dS */
    private int f10376dS = -1;

    /* JADX INFO: renamed from: dT */
    private String f10377dT = "";

    /* JADX INFO: renamed from: dU */
    private String f10378dU = "";

    /* JADX INFO: renamed from: dV */
    private String f10379dV = "";

    /* JADX INFO: renamed from: dW */
    private int f10380dW = 0;

    /* JADX INFO: renamed from: dX */
    private String f10381dX = "";

    /* JADX INFO: renamed from: dY */
    private boolean f10382dY = false;

    /* JADX INFO: renamed from: dZ */
    private String f10383dZ = "";

    /* JADX INFO: renamed from: ea */
    private String f10435ea = "";

    /* JADX INFO: renamed from: ek */
    private boolean f10445ek = false;

    /* JADX INFO: renamed from: en */
    private String f10448en = "";

    /* JADX INFO: renamed from: eL */
    private String f10421eL = "";

    /* JADX INFO: renamed from: eP */
    private int f10425eP = 2;

    /* JADX INFO: renamed from: bK */
    public String f10353bK = "";

    /* JADX INFO: renamed from: eR */
    private int f10427eR = -1;

    /* JADX INFO: renamed from: eU */
    private int f10429eU = 1;

    /* JADX INFO: renamed from: eZ */
    private int f10434eZ = 0;

    /* JADX INFO: renamed from: fa */
    private int f10464fa = 2;

    /* JADX INFO: renamed from: fc */
    private int f10466fc = 1;

    /* JADX INFO: renamed from: fq */
    private boolean f10480fq = false;

    /* JADX INFO: renamed from: fr */
    private String f10481fr = null;

    /* JADX INFO: renamed from: ft */
    private String f10483ft = "";

    /* JADX INFO: renamed from: fv */
    private int f10485fv = 2;

    /* JADX INFO: renamed from: fw */
    private int f10486fw = 1;

    /* JADX INFO: renamed from: fx */
    private int f10487fx = -1;

    /* JADX INFO: renamed from: fy */
    private boolean f10488fy = false;

    /* JADX INFO: renamed from: fz */
    private boolean f10489fz = false;

    /* JADX INFO: renamed from: fB */
    private int f10462fB = 0;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.d.c$a */
    public static final class a implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final String f10490a = "ad_logo_link";

        /* JADX INFO: renamed from: b */
        public static final String f10491b = "adchoice_link";

        /* JADX INFO: renamed from: c */
        public static final String f10492c = "adchoice_icon";

        /* JADX INFO: renamed from: d */
        public static final String f10493d = "adchoice_size";

        /* JADX INFO: renamed from: e */
        public static final String f10494e = "platform_name";

        /* JADX INFO: renamed from: f */
        public static final String f10495f = "platform_logo";

        /* JADX INFO: renamed from: g */
        public static final String f10496g = "adv_name";

        /* JADX INFO: renamed from: h */
        public static final String f10497h = "adv_logo";

        /* JADX INFO: renamed from: i */
        private String f10498i = "";

        /* JADX INFO: renamed from: j */
        private String f10499j = "";

        /* JADX INFO: renamed from: k */
        private String f10500k = "";

        /* JADX INFO: renamed from: l */
        private String f10501l = "";

        /* JADX INFO: renamed from: m */
        private String f10502m = "";

        /* JADX INFO: renamed from: n */
        private String f10503n = "";

        /* JADX INFO: renamed from: o */
        private String f10504o = "";

        /* JADX INFO: renamed from: p */
        private String f10505p = "";

        /* JADX INFO: renamed from: q */
        private int f10506q = 0;

        /* JADX INFO: renamed from: r */
        private int f10507r = 0;

        /* JADX INFO: renamed from: s */
        private String f10508s = "";

        /* JADX INFO: renamed from: a */
        public static a m8917a(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return m8918a(new JSONObject(str));
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.printStackTrace();
                }
                return null;
            } catch (Throwable th) {
                if (C1404a.f6209a) {
                    th.printStackTrace();
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        private static a m8918a(JSONObject jSONObject) {
            a aVar;
            a aVar2 = null;
            try {
                aVar = new a();
            } catch (Exception e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
            try {
                aVar.f10500k = jSONObject.optString("adchoice_icon");
                aVar.f10499j = jSONObject.optString("adchoice_link");
                String strOptString = jSONObject.optString("adchoice_size");
                aVar.f10501l = strOptString;
                aVar.f10498i = jSONObject.optString(f10490a);
                aVar.f10505p = jSONObject.optString(f10497h);
                aVar.f10504o = jSONObject.optString(f10496g);
                aVar.f10503n = jSONObject.optString("platform_logo");
                aVar.f10502m = jSONObject.optString("platform_name");
                aVar.f10507r = m8936k(strOptString);
                aVar.f10506q = m8938l(strOptString);
                aVar.f10508s = jSONObject.toString();
                return aVar;
            } catch (Exception e2) {
                e = e2;
                aVar2 = aVar;
                if (C1404a.f6209a) {
                    e.printStackTrace();
                }
                return aVar2;
            } catch (Throwable th2) {
                th = th2;
                aVar2 = aVar;
                if (C1404a.f6209a) {
                    th.printStackTrace();
                }
                return aVar2;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m8919a(int i) {
            this.f10506q = i;
        }

        /* JADX INFO: renamed from: b */
        private void m8920b(int i) {
            this.f10507r = i;
        }

        /* JADX INFO: renamed from: b */
        private void m8921b(String str) {
            this.f10508s = str;
        }

        /* JADX INFO: renamed from: c */
        private void m8922c(String str) {
            this.f10498i = str;
        }

        /* JADX INFO: renamed from: d */
        private void m8923d(String str) {
            this.f10499j = str;
        }

        /* JADX INFO: renamed from: e */
        private int m8924e() {
            return this.f10506q;
        }

        /* JADX INFO: renamed from: e */
        private void m8925e(String str) {
            this.f10500k = str;
        }

        /* JADX INFO: renamed from: f */
        private int m8926f() {
            return this.f10507r;
        }

        /* JADX INFO: renamed from: f */
        private void m8927f(String str) {
            this.f10501l = str;
        }

        /* JADX INFO: renamed from: g */
        private String m8928g() {
            return this.f10498i;
        }

        /* JADX INFO: renamed from: g */
        private void m8929g(String str) {
            this.f10502m = str;
        }

        /* JADX INFO: renamed from: h */
        private String m8930h() {
            return this.f10502m;
        }

        /* JADX INFO: renamed from: h */
        private void m8931h(String str) {
            this.f10503n = str;
        }

        /* JADX INFO: renamed from: i */
        private String m8932i() {
            return this.f10503n;
        }

        /* JADX INFO: renamed from: i */
        private void m8933i(String str) {
            this.f10504o = str;
        }

        /* JADX INFO: renamed from: j */
        private String m8934j() {
            return this.f10504o;
        }

        /* JADX INFO: renamed from: j */
        private void m8935j(String str) {
            this.f10505p = str;
        }

        /* JADX INFO: renamed from: k */
        private static int m8936k(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (strArrSplit = str.split("x")) != null && strArrSplit.length > 1) {
                    return Integer.parseInt(strArrSplit[1]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        /* JADX INFO: renamed from: k */
        private String m8937k() {
            return this.f10505p;
        }

        /* JADX INFO: renamed from: l */
        private static int m8938l(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (strArrSplit = str.split("x")) != null && strArrSplit.length > 0) {
                    return Integer.parseInt(strArrSplit[0]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        /* JADX INFO: renamed from: l */
        private boolean m8939l() {
            return (TextUtils.isEmpty(this.f10499j) || TextUtils.isEmpty(this.f10501l) || TextUtils.isEmpty(this.f10500k)) ? false : true;
        }

        /* JADX INFO: renamed from: a */
        public final String m8940a() {
            return this.f10508s;
        }

        /* JADX INFO: renamed from: b */
        public final String m8941b() {
            return this.f10499j;
        }

        /* JADX INFO: renamed from: c */
        public final String m8942c() {
            return this.f10500k;
        }

        /* JADX INFO: renamed from: d */
        public final String m8943d() {
            return this.f10501l;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.d.c$b */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a */
        public boolean f10509a = false;

        /* JADX INFO: renamed from: b */
        public boolean f10510b = false;

        /* JADX INFO: renamed from: c */
        public boolean f10511c = false;

        /* JADX INFO: renamed from: d */
        public boolean f10512d = false;

        /* JADX INFO: renamed from: e */
        public boolean f10513e = false;

        /* JADX INFO: renamed from: f */
        public boolean f10514f = false;

        /* JADX INFO: renamed from: g */
        public boolean f10515g = false;

        /* JADX INFO: renamed from: h */
        public boolean f10516h = false;

        /* JADX INFO: renamed from: i */
        public boolean f10517i = false;

        /* JADX INFO: renamed from: j */
        public boolean f10518j = false;

        /* JADX INFO: renamed from: k */
        public boolean f10519k = false;

        /* JADX INFO: renamed from: l */
        public Map<Integer, String> f10520l;
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.d.c$c */
    public static final class c implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final String f10521a = "video_template";

        /* JADX INFO: renamed from: b */
        public static final String f10522b = "template_url";

        /* JADX INFO: renamed from: c */
        public static final String f10523c = "orientation";

        /* JADX INFO: renamed from: d */
        public static final String f10524d = "paused_url";

        /* JADX INFO: renamed from: e */
        public static final String f10525e = "image";

        /* JADX INFO: renamed from: f */
        private static final int f10526f = 1;

        /* JADX INFO: renamed from: g */
        private String f10527g;

        /* JADX INFO: renamed from: h */
        private int f10528h;

        /* JADX INFO: renamed from: i */
        private int f10529i;

        /* JADX INFO: renamed from: j */
        private String f10530j;

        /* JADX INFO: renamed from: k */
        private String f10531k;

        /* JADX INFO: renamed from: l */
        private List<a> f10532l;

        /* JADX INFO: renamed from: com.anythink.expressad.foundation.d.c$c$a */
        public static final class a implements Serializable {

            /* JADX INFO: renamed from: a */
            public String f10533a;

            /* JADX INFO: renamed from: b */
            public List<String> f10534b = new ArrayList();
        }

        private c(String str) {
            this.f10527g = str;
        }

        /* JADX INFO: renamed from: a */
        public static c m8944a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                if (!C1889w.m9868b(jSONObject.toString())) {
                    return null;
                }
                c cVar = new c(jSONObject.toString());
                cVar.f10528h = jSONObject.optInt(f10521a, 1);
                cVar.m8953a(jSONObject.optString("template_url"));
                cVar.f10529i = jSONObject.optInt("orientation");
                cVar.f10530j = jSONObject.optString(f10524d);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f10525e);
                if (jSONObjectOptJSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        List<String> listM9825a = C1886t.m9825a(jSONObjectOptJSONObject.optJSONArray(next));
                        if (listM9825a != null && listM9825a.size() > 0) {
                            a aVar = new a();
                            aVar.f10533a = next;
                            aVar.f10534b.addAll(listM9825a);
                            arrayList.add(aVar);
                        }
                    }
                    cVar.f10532l = arrayList;
                }
                return cVar;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m8946a(int i) {
            this.f10528h = i;
        }

        /* JADX INFO: renamed from: a */
        private void m8947a(List<a> list) {
            this.f10532l = list;
        }

        /* JADX INFO: renamed from: b */
        private void m8948b(int i) {
            this.f10529i = i;
        }

        /* JADX INFO: renamed from: b */
        private void m8949b(String str) {
            this.f10527g = str;
        }

        /* JADX INFO: renamed from: c */
        private void m8950c(String str) {
            this.f10530j = str;
        }

        /* JADX INFO: renamed from: d */
        private static c m8951d(String str) {
            try {
                if (C1889w.m9868b(str)) {
                    return m8944a(new JSONObject(str));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public final String m8952a() {
            return this.f10527g;
        }

        /* JADX INFO: renamed from: a */
        public final void m8953a(String str) {
            this.f10531k = C1890x.m9872c(str);
        }

        /* JADX INFO: renamed from: b */
        public final int m8954b() {
            return this.f10528h;
        }

        /* JADX INFO: renamed from: c */
        public final int m8955c() {
            return this.f10529i;
        }

        /* JADX INFO: renamed from: d */
        public final String m8956d() {
            return this.f10530j;
        }

        /* JADX INFO: renamed from: e */
        public final String m8957e() {
            return this.f10531k;
        }

        /* JADX INFO: renamed from: f */
        public final List<a> m8958f() {
            return this.f10532l;
        }
    }

    /* JADX INFO: renamed from: A */
    private void m8617A(int i) {
        this.f10366dH = i;
    }

    /* JADX INFO: renamed from: B */
    private void m8618B(int i) {
        this.f10409dz = i;
    }

    /* JADX INFO: renamed from: C */
    private void m8619C(int i) {
        this.f10407dx = i;
    }

    /* JADX INFO: renamed from: C */
    private void m8620C(String str) {
        this.f10371dM = str;
    }

    /* JADX INFO: renamed from: D */
    private void m8621D(int i) {
        this.f10408dy = i;
    }

    /* JADX INFO: renamed from: D */
    private void m8622D(String str) {
        this.f10367dI = str;
    }

    /* JADX INFO: renamed from: E */
    private void m8623E(int i) {
        this.f10406dw = i;
    }

    /* JADX INFO: renamed from: E */
    private void m8624E(String str) {
        this.f10375dR = str;
    }

    /* JADX INFO: renamed from: F */
    private void m8625F(int i) {
        this.f10374dQ = i;
    }

    /* JADX INFO: renamed from: F */
    private void m8626F(String str) {
        this.f10415eF = str;
    }

    /* JADX INFO: renamed from: G */
    private void m8627G(int i) {
        this.f10426eQ = i;
    }

    /* JADX INFO: renamed from: G */
    private void m8628G(String str) {
        this.f10416eG = str;
    }

    /* JADX INFO: renamed from: H */
    private void m8629H(int i) {
        this.f10372dN = i;
    }

    /* JADX INFO: renamed from: H */
    private void m8630H(String str) {
        this.f10417eH = str;
    }

    /* JADX INFO: renamed from: I */
    private void m8631I(int i) {
        this.f10373dO = i;
    }

    /* JADX INFO: renamed from: I */
    private void m8632I(String str) {
        this.f10418eI = str;
    }

    /* JADX INFO: renamed from: J */
    private void m8633J(int i) {
        this.f10425eP = i;
    }

    /* JADX INFO: renamed from: J */
    private void m8634J(String str) {
        this.f10419eJ = str;
    }

    /* JADX INFO: renamed from: K */
    private void m8635K(int i) {
        this.f10466fc = i;
    }

    /* JADX INFO: renamed from: K */
    private void m8636K(String str) {
        this.f10421eL = str;
    }

    /* JADX INFO: renamed from: L */
    private void m8637L(int i) {
        this.f10470fg = i;
    }

    /* JADX INFO: renamed from: L */
    private void m8638L(String str) {
        this.f10353bK = str;
    }

    /* JADX INFO: renamed from: M */
    private void m8639M(int i) {
        this.f10476fm = i;
    }

    /* JADX INFO: renamed from: M */
    private void m8640M(String str) {
        this.f10468fe = str;
    }

    /* JADX INFO: renamed from: N */
    private void m8641N(int i) {
        this.f10412eC = i;
    }

    /* JADX INFO: renamed from: N */
    private void m8642N(String str) {
        this.f10413eD = str;
    }

    /* JADX INFO: renamed from: O */
    private void m8643O(int i) {
        this.f10458ex = i;
    }

    /* JADX INFO: renamed from: O */
    private void m8644O(String str) {
        this.f10472fi = str;
    }

    /* JADX INFO: renamed from: P */
    private void m8645P(int i) {
        this.f10410eA = i;
    }

    /* JADX INFO: renamed from: P */
    private void m8646P(String str) {
        this.f10473fj = str;
    }

    /* JADX INFO: renamed from: Q */
    private void m8647Q(int i) {
        this.f10455eu = i;
    }

    /* JADX INFO: renamed from: Q */
    private void m8648Q(String str) {
        this.f10457ew = str;
    }

    /* JADX INFO: renamed from: R */
    private void m8649R(int i) {
        this.f10452er = i;
    }

    /* JADX INFO: renamed from: R */
    private void m8650R(String str) {
        this.f10411eB = str;
    }

    /* JADX INFO: renamed from: S */
    private void m8651S(int i) {
        this.f10454et = i;
    }

    /* JADX INFO: renamed from: S */
    private void m8652S(String str) {
        this.f10453es = str;
    }

    /* JADX INFO: renamed from: T */
    private void m8653T(int i) {
        this.f10449eo = i;
    }

    /* JADX INFO: renamed from: T */
    private void m8654T(String str) {
        this.f10448en = str;
    }

    /* JADX INFO: renamed from: U */
    private void m8655U(int i) {
        this.f10451eq = i;
    }

    /* JADX INFO: renamed from: U */
    private void m8656U(String str) {
        this.f10450ep = str;
    }

    /* JADX INFO: renamed from: V */
    private void m8657V(int i) {
        this.f10447em = i;
    }

    /* JADX INFO: renamed from: V */
    private void m8658V(String str) {
        this.f10441eg = str;
    }

    /* JADX INFO: renamed from: W */
    private void m8659W(int i) {
        this.f10443ei = i;
    }

    /* JADX INFO: renamed from: W */
    private void m8660W(String str) {
        this.f10442eh = str;
    }

    /* JADX INFO: renamed from: X */
    private void m8661X(int i) {
        this.f10464fa = i;
    }

    /* JADX INFO: renamed from: X */
    private void m8662X(String str) {
        this.f10439ee = str;
    }

    /* JADX INFO: renamed from: Y */
    private void m8663Y(int i) {
        this.f10437ec = i;
    }

    /* JADX INFO: renamed from: Y */
    private void m8664Y(String str) {
        this.f10440ef = str;
    }

    /* JADX INFO: renamed from: Z */
    private void m8665Z(int i) {
        this.f10438ed = i;
    }

    /* JADX INFO: renamed from: Z */
    private void m8666Z(String str) {
        this.f10381dX = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1781c m8667a(JSONObject jSONObject) {
        C1781c c1781c = new C1781c();
        c1781c.m10159v(jSONObject.optString("campaignid"));
        c1781c.m10160w(jSONObject.optString("packageName"));
        c1781c.m10161x(jSONObject.optString("title"));
        c1781c.mo8900o(jSONObject.optString(C0739a.a.f626k));
        c1781c.m10162y(jSONObject.optString("desc"));
        c1781c.f10377dT = jSONObject.optString(f10193L);
        c1781c.m10140A(jSONObject.optString("image_url"));
        c1781c.f10390dg = jSONObject.optLong("plct");
        c1781c.f10391dh = jSONObject.optLong("plctb");
        c1781c.f10356cX = jSONObject.optString(f10312c);
        c1781c.m8822a(jSONObject.optString(f10260b));
        c1781c.m8868d(jSONObject.optString(f10335j));
        c1781c.f10393dj = jSONObject.optString(f10336k);
        c1781c.f10394dk = jSONObject.optInt("creative_id");
        return c1781c;
    }

    /* JADX INFO: renamed from: a */
    private static C1781c m8668a(JSONObject jSONObject, String str, String str2, String str3, boolean z, C1782d c1782d) {
        return m8669a(jSONObject, str, str2, str3, z, c1782d, "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:212|(1:214)(9:216|252|218|256|219|223|(5:227|(2:230|228)|263|231|(1:233))|234|235))(1:217)|252|218|256|219|223|(6:225|227|(1:228)|263|231|(0))|234|235) */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0491, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0492, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04c2 A[Catch: Exception -> 0x04e2, LOOP:2: B:228:0x04bc->B:230:0x04c2, LOOP_END, TryCatch #2 {Exception -> 0x04e2, blocks: (B:223:0x0495, B:225:0x04b0, B:227:0x04b6, B:228:0x04bc, B:230:0x04c2, B:231:0x04d0, B:233:0x04d6, B:234:0x04d8, B:222:0x0492, B:219:0x047c), top: B:252:0x043e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04d6 A[Catch: Exception -> 0x04e2, TryCatch #2 {Exception -> 0x04e2, blocks: (B:223:0x0495, B:225:0x04b0, B:227:0x04b6, B:228:0x04bc, B:230:0x04c2, B:231:0x04d0, B:233:0x04d6, B:234:0x04d8, B:222:0x0492, B:219:0x047c), top: B:252:0x043e, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r11v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v57, types: [com.anythink.expressad.foundation.d.c, com.anythink.expressad.out.j] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.anythink.expressad.foundation.p116d.C1781c m8669a(org.json.JSONObject r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, com.anythink.expressad.foundation.p116d.C1782d r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 1263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p116d.C1781c.m8669a(org.json.JSONObject, java.lang.String, java.lang.String, java.lang.String, boolean, com.anythink.expressad.foundation.d.d, java.lang.String):com.anythink.expressad.foundation.d.c");
    }

    /* JADX INFO: renamed from: a */
    private static C1792n m8670a(JSONObject jSONObject, C1792n c1792n) {
        c1792n.m9176a(m8681a(jSONObject.optJSONArray(C1786h.f10661cK)));
        c1792n.m9178b(m8681a(jSONObject.optJSONArray(C1786h.f10662cL)));
        c1792n.m9180c(m8681a(jSONObject.optJSONArray(C1786h.f10663cM)));
        return c1792n;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m8671a(C1781c c1781c) throws JSONException {
        c cVar;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", c1781c.m10146aZ());
        jSONObject.put(f10258ay, c1781c.f10404du);
        jSONObject.put(f10259az, c1781c.f10405dv);
        jSONObject.put("adspace_t", c1781c.f10387dd);
        jSONObject.put(f10350y, c1781c.f10389df);
        jSONObject.put(f10349x, c1781c.f10388de);
        if (!TextUtils.isEmpty(c1781c.f10469ff)) {
            jSONObject.put("unitId", c1781c.f10469ff);
        }
        if (!TextUtils.isEmpty(c1781c.f10428eT)) {
            try {
                jSONObject.put(f10273bN, new JSONObject(c1781c.f10428eT));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(c1781c.f10433eY)) {
            try {
                jSONObject.put(C1782d.f10542H, new JSONObject(c1781c.f10433eY));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        List<String> list = c1781c.f10358cZ;
        if (list != null && list.size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = c1781c.f10358cZ.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("pv_urls", jSONArray);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(c1781c.f10430eV)) {
            jSONObject.put(C1782d.f10541G, c1781c.f10432eX);
            jSONObject.put(C1782d.f10540F, c1781c.f10430eV);
            jSONObject.put(C1782d.f10539E, c1781c.f10429eU);
        }
        jSONObject.put("ready_rate", c1781c.f10427eR);
        jSONObject.put("title", c1781c.m10148bb());
        jSONObject.put("desc", c1781c.m10149bc());
        jSONObject.put("package_name", c1781c.m10147ba());
        jSONObject.put(f10255av, c1781c.f10456ev);
        jSONObject.put("icon_url", c1781c.m10150bd());
        jSONObject.put("image_url", c1781c.m10151be());
        jSONObject.put(f10192K, c1781c.m10154bh());
        jSONObject.put(f10191J, c1781c.f10435ea);
        jSONObject.put(f10193L, c1781c.f10377dT);
        jSONObject.put("click_url", c1781c.f10379dV);
        C1794p c1794p = c1781c.f10352aH;
        if (c1794p != null) {
            jSONObject.put(f10214aF, c1794p.m9235c());
        }
        jSONObject.put(f10195N, c1781c.f10380dW);
        jSONObject.put(f10196O, c1781c.f10381dX);
        jSONObject.put(f10197P, c1781c.f10382dY);
        jSONObject.put("notice_url", c1781c.f10378dU);
        jSONObject.put("template", c1781c.f10436eb);
        jSONObject.put("ad_source_id", c1781c.m10152bf());
        jSONObject.put(f10201T, c1781c.f10437ec);
        jSONObject.put(f10202U, c1781c.f10438ed);
        StringBuilder sb = new StringBuilder();
        sb.append(c1781c.m10144aX());
        jSONObject.put(f10206Y, sb.toString());
        jSONObject.put(f10207Z, c1781c.m10145aY());
        jSONObject.put("click_mode", c1781c.f10439ee);
        jSONObject.put("landing_type", c1781c.f10440ef);
        jSONObject.put("link_type", c1781c.f10455eu);
        jSONObject.put(f10235ab, c1781c.f10443ei);
        jSONObject.put(f10234aa, c1781c.f11928cU);
        jSONObject.put(f10241ah, c1781c.f10426eQ);
        jSONObject.put(f10257ax, c1781c.f10476fm);
        jSONObject.put("video_url", c1781c.f10448en);
        jSONObject.put("video_length", c1781c.m10155bi());
        jSONObject.put("video_size", c1781c.f10449eo);
        jSONObject.put(f10239af, c1781c.f10450ep);
        jSONObject.put(f10240ag, c1781c.f10451eq);
        jSONObject.put(f10256aw, c1781c.f10413eD);
        jSONObject.put(C1782d.f10552g, c1781c.f10383dZ);
        jSONObject.put("ctype", c1781c.f10452er);
        jSONObject.put(f10244ak, c1781c.f10454et);
        jSONObject.put(f10243aj, c1781c.f10453es);
        jSONObject.put(C1782d.f10551f, c1781c.f10459ey);
        jSONObject.put(C1782d.f10556k, c1781c.f10460ez);
        jSONObject.put(f10247an, c1781c.f10457ew);
        jSONObject.put("offer_type", c1781c.f10458ex);
        jSONObject.put("reward_amount", c1781c.f10410eA);
        jSONObject.put("reward_name", c1781c.f10411eB);
        jSONObject.put(f10290be, c1781c.f10375dR);
        if (C1889w.m9868b(c1781c.f10468fe)) {
            jSONObject.put(f10322cj, new JSONObject(c1781c.f10468fe));
        }
        jSONObject.put(f10263bC, c1781c.f10425eP);
        jSONObject.put("endcard_url", c1781c.m8801I());
        jSONObject.put(f10275bP, c1781c.f10466fc);
        if (c1781c != null && (cVar = c1781c.f10478fo) != null && C1889w.m9868b(cVar.m8952a())) {
            jSONObject.put(f10323ck, new JSONObject(c1781c.f10478fo.m8952a()));
        }
        jSONObject.put(f10251ar, c1781c.f10353bK);
        jSONObject.put(f10252as, c1781c.f10464fa);
        jSONObject.put(f10231aX, c1781c.f10373dO);
        jSONObject.put(f10230aW, c1781c.f10372dN);
        jSONObject.put(f10215aG, c1781c.f10406dw);
        jSONObject.put("ia_icon", c1781c.f10359dA);
        jSONObject.put("ia_rst", c1781c.f10360dB);
        jSONObject.put("ia_url", c1781c.f10361dC);
        jSONObject.put("ia_ori", c1781c.f10362dD);
        jSONObject.put("ad_type", c1781c.f10363dE);
        jSONObject.put(f10226aS, c1781c.f10364dF);
        jSONObject.put(f10227aT, c1781c.f10365dG);
        jSONObject.put(f10228aU, c1781c.f10366dH);
        jSONObject.put(f10229aV, c1781c.f10367dI);
        jSONObject.put(f10216aI, c1781c.f10369dK);
        jSONObject.put(f10217aJ, c1781c.f10370dL);
        jSONObject.put(f10218aK, c1781c.f10371dM);
        a aVar = c1781c.f10368dJ;
        if (aVar != null) {
            jSONObject.put(f10219aL, new JSONObject(aVar.m8940a()));
        }
        jSONObject.put("plct", c1781c.f10390dg);
        jSONObject.put("plctb", c1781c.f10391dh);
        jSONObject.put(f10220aM, c1781c.f10481fr);
        jSONObject.put("creative_id", c1781c.f10394dk);
        jSONObject.put("cam_html", c1781c.f10393dj);
        String str = c1781c.f10392di;
        if (str == null) {
            str = c1781c.f10355cW;
        }
        jSONObject.put("cam_tpl_url", str);
        jSONObject.put(f10338m, c1781c.f10422eM);
        jSONObject.put(f10339n, c1781c.f10422eM);
        jSONObject.put(f10340o, c1781c.m10153bg());
        jSONObject.put("hb", c1781c.f10420eK);
        jSONObject.put(f10342q, c1781c.f10474fk);
        jSONObject.put(f10343r, c1781c.f10475fl);
        int i = c1781c.f10396dm;
        if (i <= 0) {
            i = 1;
        }
        jSONObject.put("vcn", i);
        int i2 = c1781c.f10397dn;
        if (i2 != 1) {
            i2 = 0;
        }
        jSONObject.put("token_r", i2);
        jSONObject.put("encrypt_p", c1781c.f10398do);
        jSONObject.put(f10347v, c1781c.f10402ds);
        jSONObject.put(f10211aC, c1781c.f10484fu);
        jSONObject.put(f10210aB, c1781c.f10485fv);
        jSONObject.put(f10209aA, c1781c.f10486fw);
        jSONObject.put(f10329e, c1781c.f10385db);
        jSONObject.put(f10331f, c1781c.f10386dc);
        try {
            jSONObject.put("misk_spt", C1325o.m3942a().m3952c());
            C1325o.m3942a();
            jSONObject.put("misk_spt_det", C1325o.m3943b());
        } catch (JSONException unused) {
        }
        jSONObject.put(f10332g, c1781c.f10463fC);
        if (c1781c == null) {
            return jSONObject;
        }
        jSONObject.put(C1786h.f10676cw, c1781c.m9121aW());
        jSONObject.put(C1786h.f10677cx, c1781c.m9120aV());
        jSONObject.put(C1786h.f10651cA, c1781c.m9119aU());
        jSONObject.put("ttc_type", c1781c.m9118aT());
        jSONObject.put(C1786h.f10653cC, c1781c.m9117aS());
        jSONObject.put(C1786h.f10654cD, c1781c.m9112aN());
        jSONObject.put(C1786h.f10655cE, C1876j.m9686a(c1781c.m9113aO()));
        jSONObject.put(C1786h.f10656cF, c1781c.m9114aP());
        jSONObject.put(C1786h.f10669cp, c1781c.m9107aI());
        jSONObject.put(C1786h.f10670cq, c1781c.m9106aH());
        if (c1781c.m9105aG() != null) {
            jSONObject.put(C1786h.f10671cr, c1781c.m9105aG().m8612g());
        }
        jSONObject.put(C1786h.f10657cG, c1781c.m9115aQ());
        jSONObject.put(C1786h.f10658cH, c1781c.m9116aR());
        jSONObject.put(f10288bc, c1781c.f10374dQ);
        jSONObject.put(C1786h.f10673ct, c1781c.m9109aK());
        jSONObject.put(C1786h.f10672cs, c1781c.m9108aJ());
        jSONObject.put(C1786h.f10674cu, c1781c.m9110aL());
        jSONObject.put(C1786h.f10675cv, c1781c.m9111aM());
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m8672a(C1781c c1781c, boolean z, boolean z3) throws JSONException {
        JSONObject jSONObjectM8671a = m8671a(c1781c);
        jSONObjectM8671a.put("isReady", z);
        jSONObjectM8671a.put("expired", z3);
        return jSONObjectM8671a;
    }

    /* JADX INFO: renamed from: a */
    private void m8673a(a aVar) {
        this.f10368dJ = aVar;
    }

    /* JADX INFO: renamed from: a */
    private void m8674a(b bVar) {
        this.f10477fn = bVar;
    }

    /* JADX INFO: renamed from: a */
    private void m8675a(c cVar) {
        this.f10478fo = cVar;
        if (cVar == null || TextUtils.isEmpty(cVar.m8957e())) {
            return;
        }
        if (TextUtils.isEmpty(this.f10430eV) && cVar.m8957e().contains(f10327d)) {
            this.f10431eW = cVar.m8957e();
        }
        boolean zM9846e = C1886t.m9846e(cVar.m8957e());
        int iM9850g = C1886t.m9850g(cVar.m8957e());
        if (zM9846e) {
            this.f10399dp = true;
            m8788v(iM9850g);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m8676a(C1792n c1792n) {
        this.f10467fd = c1792n;
    }

    /* JADX INFO: renamed from: a */
    private void m8677a(C1794p c1794p) {
        this.f10352aH = c1794p;
    }

    /* JADX INFO: renamed from: a */
    private void m8678a(ArrayList<Integer> arrayList) {
        this.f10484fu = arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m8679a(HashMap<String, String> map) {
        this.f10414eE = map;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8680a(C1781c c1781c, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C1773a.m8548c().m8561i() == 2 && "1".equals(Uri.parse(str).getQueryParameter("dpwgl"))) {
            return true;
        }
        c1781c.m8889k(str);
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static String[] m8681a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: aa */
    private void m8682aa(int i) {
        this.f10376dS = i;
    }

    /* JADX INFO: renamed from: aa */
    private void m8683aa(String str) {
        this.f10377dT = str;
    }

    /* JADX INFO: renamed from: ab */
    private void m8684ab(int i) {
        this.f10380dW = i;
    }

    /* JADX INFO: renamed from: ab */
    private void m8685ab(String str) {
        this.f10383dZ = str;
    }

    /* JADX INFO: renamed from: ac */
    private void m8686ac(int i) {
        this.f10436eb = i;
    }

    /* JADX INFO: renamed from: ac */
    private void m8687ac(String str) {
        this.f10435ea = str;
    }

    /* JADX INFO: renamed from: ad */
    private static C1792n m8688ad(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                C1792n c1792n = new C1792n();
                c1792n.m9210r(m8681a(jSONObject.optJSONArray(f10278bS)));
                c1792n.m9188g(m8681a(jSONObject.optJSONArray(f10279bT)));
                c1792n.m9190h(m8681a(jSONObject.optJSONArray(f10280bU)));
                c1792n.m9193i(m8681a(jSONObject.optJSONArray(f10281bV)));
                c1792n.m9194j(m8681a(jSONObject.optJSONArray(f10282bW)));
                c1792n.m9196k(m8681a(jSONObject.optJSONArray(f10283bX)));
                c1792n.m9175a(m8704b(jSONObject.optJSONArray(f10321ci)));
                c1792n.m9198l(m8681a(jSONObject.optJSONArray("mute")));
                c1792n.m9200m(m8681a(jSONObject.optJSONArray(f10285bZ)));
                c1792n.m9202n(m8681a(jSONObject.optJSONArray(f10313ca)));
                c1792n.m9204o(m8681a(jSONObject.optJSONArray(f10314cb)));
                c1792n.m9206p(m8681a(jSONObject.optJSONArray(f10315cc)));
                c1792n.m9208q(m8681a(jSONObject.optJSONArray("error")));
                c1792n.m9211s(m8681a(jSONObject.optJSONArray(f10317ce)));
                c1792n.m9213u(m8681a(jSONObject.optJSONArray(f10318cf)));
                c1792n.m9212t(m8681a(jSONObject.optJSONArray(f10320ch)));
                c1792n.m9214v(m8681a(jSONObject.optJSONArray(f10319cg)));
                c1792n.m9186f(m8681a(jSONObject.optJSONArray(f10289bd)));
                c1792n.m9182d(m8681a(jSONObject.optJSONArray(f10291bf)));
                c1792n.m9184e(m8681a(jSONObject.optJSONArray(f10292bg)));
                c1792n.m9176a(m8681a(jSONObject.optJSONArray(C1786h.f10661cK)));
                c1792n.m9178b(m8681a(jSONObject.optJSONArray(C1786h.f10662cL)));
                c1792n.m9180c(m8681a(jSONObject.optJSONArray(C1786h.f10663cM)));
                return c1792n;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ad */
    private void m8689ad(int i) {
        this.f10427eR = i;
    }

    /* JADX INFO: renamed from: ae */
    private static Map<Integer, String> m8690ae(String str) {
        HashMap map = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            HashMap map2 = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    int iOptInt = jSONObjectOptJSONObject.optInt(f10245al);
                    map2.put(Integer.valueOf(iOptInt), jSONObjectOptJSONObject.optString(f10246am));
                } catch (Exception e) {
                    e = e;
                    map = map2;
                }
            }
            return map2;
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        return map;
    }

    /* JADX INFO: renamed from: ae */
    private void m8691ae(int i) {
        this.f10354cV = i;
    }

    /* JADX INFO: renamed from: af */
    private void m8692af(int i) {
        this.f10474fk = i;
    }

    /* JADX INFO: renamed from: af */
    private void m8693af(String str) {
        this.f10428eT = str;
    }

    /* JADX INFO: renamed from: ag */
    private void m8694ag(int i) {
        if (i > 2 || i <= 0) {
            this.f10485fv = 2;
        } else {
            this.f10485fv = i;
        }
    }

    /* JADX INFO: renamed from: ag */
    private void m8695ag(String str) {
        this.f10431eW = str;
    }

    /* JADX INFO: renamed from: ah */
    private void m8696ah(int i) {
        if (i > 2 || i <= 0) {
            this.f10486fw = 1;
        } else {
            this.f10486fw = i;
        }
    }

    /* JADX INFO: renamed from: ah */
    private void m8697ah(String str) {
        this.f10475fl = str;
    }

    /* JADX INFO: renamed from: ai */
    private void m8698ai(int i) {
        this.f10487fx = i;
    }

    /* JADX INFO: renamed from: ai */
    private void m8699ai(String str) {
        this.f10481fr = str;
    }

    /* JADX INFO: renamed from: aj */
    private void m8700aj(int i) {
        this.f10463fC = i;
    }

    /* JADX INFO: renamed from: aj */
    private void m8701aj(String str) {
        this.f10483ft = str;
    }

    /* JADX INFO: renamed from: ak */
    private void m8702ak(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String str2 : strArrSplit) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            this.f10484fu = arrayList;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:148|(1:150)|151|(1:153)|154|(1:156)|157|(2:159|(1:161)(18:163|165|(1:172)(1:171)|173|(1:175)|176|(1:178)(2:179|(1:184)(1:183))|218|185|186|(2:188|(1:190))|191|(2:193|(1:195))|196|197|(5:201|(2:204|202)|229|205|(1:207))|208|209))(1:164)|162|165|(3:167|169|172)(0)|173|(0)|176|(0)(0)|218|185|186|(0)|191|(0)|196|197|(6:199|201|(1:202)|229|205|(0))|208|209) */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0381 A[Catch: Exception -> 0x04b0, TryCatch #1 {Exception -> 0x04b0, blocks: (B:120:0x0018, B:122:0x00d6, B:123:0x00e3, B:125:0x00ed, B:126:0x00f7, B:145:0x022d, B:148:0x0242, B:150:0x0250, B:151:0x0256, B:153:0x025c, B:154:0x0262, B:156:0x0268, B:157:0x026e, B:159:0x032f, B:161:0x0339, B:162:0x033d, B:165:0x0348, B:167:0x0365, B:169:0x0371, B:171:0x037d, B:173:0x0384, B:175:0x03a4, B:176:0x03aa, B:178:0x03b0, B:196:0x0400, B:179:0x03b5, B:181:0x03bd, B:183:0x03c7, B:184:0x03ca, B:172:0x0381, B:163:0x0340, B:164:0x0343), top: B:220:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a4 A[Catch: Exception -> 0x04b0, TryCatch #1 {Exception -> 0x04b0, blocks: (B:120:0x0018, B:122:0x00d6, B:123:0x00e3, B:125:0x00ed, B:126:0x00f7, B:145:0x022d, B:148:0x0242, B:150:0x0250, B:151:0x0256, B:153:0x025c, B:154:0x0262, B:156:0x0268, B:157:0x026e, B:159:0x032f, B:161:0x0339, B:162:0x033d, B:165:0x0348, B:167:0x0365, B:169:0x0371, B:171:0x037d, B:173:0x0384, B:175:0x03a4, B:176:0x03aa, B:178:0x03b0, B:196:0x0400, B:179:0x03b5, B:181:0x03bd, B:183:0x03c7, B:184:0x03ca, B:172:0x0381, B:163:0x0340, B:164:0x0343), top: B:220:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b0 A[Catch: Exception -> 0x04b0, TryCatch #1 {Exception -> 0x04b0, blocks: (B:120:0x0018, B:122:0x00d6, B:123:0x00e3, B:125:0x00ed, B:126:0x00f7, B:145:0x022d, B:148:0x0242, B:150:0x0250, B:151:0x0256, B:153:0x025c, B:154:0x0262, B:156:0x0268, B:157:0x026e, B:159:0x032f, B:161:0x0339, B:162:0x033d, B:165:0x0348, B:167:0x0365, B:169:0x0371, B:171:0x037d, B:173:0x0384, B:175:0x03a4, B:176:0x03aa, B:178:0x03b0, B:196:0x0400, B:179:0x03b5, B:181:0x03bd, B:183:0x03c7, B:184:0x03ca, B:172:0x0381, B:163:0x0340, B:164:0x0343), top: B:220:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b5 A[Catch: Exception -> 0x04b0, TryCatch #1 {Exception -> 0x04b0, blocks: (B:120:0x0018, B:122:0x00d6, B:123:0x00e3, B:125:0x00ed, B:126:0x00f7, B:145:0x022d, B:148:0x0242, B:150:0x0250, B:151:0x0256, B:153:0x025c, B:154:0x0262, B:156:0x0268, B:157:0x026e, B:159:0x032f, B:161:0x0339, B:162:0x033d, B:165:0x0348, B:167:0x0365, B:169:0x0371, B:171:0x037d, B:173:0x0384, B:175:0x03a4, B:176:0x03aa, B:178:0x03b0, B:196:0x0400, B:179:0x03b5, B:181:0x03bd, B:183:0x03c7, B:184:0x03ca, B:172:0x0381, B:163:0x0340, B:164:0x0343), top: B:220:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03da A[Catch: Exception -> 0x0400, TRY_ENTER, TryCatch #0 {Exception -> 0x0400, blocks: (B:185:0x03cc, B:188:0x03da, B:190:0x03e2, B:191:0x03e8, B:193:0x03f2, B:195:0x03fa), top: B:218:0x03cc }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f2 A[Catch: Exception -> 0x0400, TryCatch #0 {Exception -> 0x0400, blocks: (B:185:0x03cc, B:188:0x03da, B:190:0x03e2, B:191:0x03e8, B:193:0x03f2, B:195:0x03fa), top: B:218:0x03cc }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0491 A[Catch: Exception -> 0x04b3, LOOP:1: B:202:0x048b->B:204:0x0491, LOOP_END, TryCatch #4 {Exception -> 0x04b3, blocks: (B:119:0x0013, B:197:0x0445, B:199:0x047f, B:201:0x0485, B:202:0x048b, B:204:0x0491, B:205:0x049f, B:207:0x04a5, B:208:0x04a7), top: B:226:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04a5 A[Catch: Exception -> 0x04b3, TryCatch #4 {Exception -> 0x04b3, blocks: (B:119:0x0013, B:197:0x0445, B:199:0x047f, B:201:0x0485, B:202:0x048b, B:204:0x0491, B:205:0x049f, B:207:0x04a5, B:208:0x04a7), top: B:226:0x0013 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.anythink.expressad.foundation.p116d.C1781c m8703b(org.json.JSONObject r15) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p116d.C1781c.m8703b(org.json.JSONObject):com.anythink.expressad.foundation.d.c");
    }

    /* JADX INFO: renamed from: b */
    private static List<Map<Integer, String>> m8704b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        HashMap map = new HashMap();
                        int i2 = jSONObject.getInt("rate");
                        map.put(Integer.valueOf(i2), jSONObject.getString(f10246am));
                        arrayList.add(map);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m8705b(List<C1781c> list) {
        JSONArray jSONArray = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        Iterator<C1781c> it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                jSONArray2.put(m8671a(it.next()));
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        return jSONArray2;
                    } catch (Exception e) {
                        e = e;
                        jSONArray = jSONArray2;
                        e.printStackTrace();
                        return jSONArray;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: b */
    private void m8706b(long j) {
        this.f10390dg = j;
    }

    /* JADX INFO: renamed from: bA */
    private int m8707bA() {
        return this.f10362dD;
    }

    /* JADX INFO: renamed from: bB */
    private int m8708bB() {
        return this.f10409dz;
    }

    /* JADX INFO: renamed from: bC */
    private int m8709bC() {
        return this.f10406dw;
    }

    /* JADX INFO: renamed from: bD */
    private int m8710bD() {
        return this.f10407dx;
    }

    /* JADX INFO: renamed from: bE */
    private int m8711bE() {
        return this.f10408dy;
    }

    /* JADX INFO: renamed from: bF */
    private int m8712bF() {
        return this.f10456ev;
    }

    /* JADX INFO: renamed from: bG */
    private String m8713bG() {
        return this.f10415eF;
    }

    /* JADX INFO: renamed from: bH */
    private String m8714bH() {
        return this.f10416eG;
    }

    /* JADX INFO: renamed from: bI */
    private String m8715bI() {
        return this.f10417eH;
    }

    /* JADX INFO: renamed from: bJ */
    private String m8716bJ() {
        return this.f10418eI;
    }

    /* JADX INFO: renamed from: bK */
    private String m8717bK() {
        return this.f10419eJ;
    }

    /* JADX INFO: renamed from: bL */
    private String m8718bL() {
        return this.f10353bK;
    }

    /* JADX INFO: renamed from: bM */
    private String m8719bM() {
        return this.f10468fe;
    }

    /* JADX INFO: renamed from: bN */
    private String m8720bN() {
        return this.f10413eD;
    }

    /* JADX INFO: renamed from: bO */
    private String m8721bO() {
        return this.f10472fi;
    }

    /* JADX INFO: renamed from: bP */
    private String m8722bP() {
        return this.f10473fj;
    }

    /* JADX INFO: renamed from: bQ */
    private int m8723bQ() {
        return this.f10470fg;
    }

    /* JADX INFO: renamed from: bR */
    private long m8724bR() {
        return this.f10471fh;
    }

    /* JADX INFO: renamed from: bS */
    private b m8725bS() {
        return this.f10477fn;
    }

    /* JADX INFO: renamed from: bT */
    private int m8726bT() {
        return this.f10412eC;
    }

    /* JADX INFO: renamed from: bU */
    private String m8727bU() {
        return this.f10457ew;
    }

    /* JADX INFO: renamed from: bV */
    private String m8728bV() {
        return this.f10459ey;
    }

    /* JADX INFO: renamed from: bW */
    private int m8729bW() {
        return this.f10410eA;
    }

    /* JADX INFO: renamed from: bX */
    private String m8730bX() {
        return this.f10411eB;
    }

    /* JADX INFO: renamed from: bY */
    private int m8731bY() {
        return this.f10452er;
    }

    /* JADX INFO: renamed from: bZ */
    private String m8732bZ() {
        return this.f10453es;
    }

    /* JADX INFO: renamed from: bj */
    private int m8733bj() {
        return this.f10354cV;
    }

    /* JADX INFO: renamed from: bk */
    private String m8734bk() {
        return this.f10398do;
    }

    /* JADX INFO: renamed from: bl */
    private int m8735bl() {
        int i = this.f10397dn;
        if (i == 1) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: bm */
    private int m8736bm() {
        int i = this.f10396dm;
        if (i > 0) {
            return i;
        }
        return 1;
    }

    /* JADX INFO: renamed from: bn */
    private void m8737bn() {
        this.f10399dp = true;
    }

    /* JADX INFO: renamed from: bo */
    private long m8738bo() {
        return this.f10391dh;
    }

    /* JADX INFO: renamed from: bp */
    private C1794p m8739bp() {
        return this.f10352aH;
    }

    /* JADX INFO: renamed from: bq */
    private int m8740bq() {
        return this.f10369dK;
    }

    /* JADX INFO: renamed from: br */
    private int m8741br() {
        return this.f10370dL;
    }

    /* JADX INFO: renamed from: bs */
    private String m8742bs() {
        return this.f10371dM;
    }

    /* JADX INFO: renamed from: bt */
    private String m8743bt() {
        return this.f10367dI;
    }

    /* JADX INFO: renamed from: bu */
    private int m8744bu() {
        return this.f10366dH;
    }

    /* JADX INFO: renamed from: bv */
    private String m8745bv() {
        return this.f10364dF;
    }

    /* JADX INFO: renamed from: bw */
    private String m8746bw() {
        return this.f10365dG;
    }

    /* JADX INFO: renamed from: bx */
    private String m8747bx() {
        return this.f10359dA;
    }

    /* JADX INFO: renamed from: by */
    private int m8748by() {
        return this.f10360dB;
    }

    /* JADX INFO: renamed from: bz */
    private String m8749bz() {
        return this.f10361dC;
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m8750c(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (!jSONObject.has(f10272bM) || (jSONArrayOptJSONArray = jSONObject.optJSONArray(f10272bM)) == null || jSONArrayOptJSONArray.length() <= 0) {
                return jSONObject;
            }
            jSONObject.remove(f10272bM);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectM8574a = C1776a.m8572a().m8574a(jSONArrayOptJSONArray.getString(i));
                if (jSONObjectM8574a != null) {
                    Iterator<String> itKeys = jSONObjectM8574a.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectM8574a.opt(next));
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m8751c(long j) {
        this.f10391dh = j;
    }

    /* JADX INFO: renamed from: ca */
    private int m8752ca() {
        return this.f10454et;
    }

    /* JADX INFO: renamed from: cb */
    private int m8753cb() {
        return this.f10451eq;
    }

    /* JADX INFO: renamed from: cc */
    private int m8754cc() {
        return this.f10447em;
    }

    /* JADX INFO: renamed from: cd */
    private boolean m8755cd() {
        return this.f10445ek;
    }

    /* JADX INFO: renamed from: ce */
    private int m8756ce() {
        return this.f10443ei;
    }

    /* JADX INFO: renamed from: cf */
    private int m8757cf() {
        return this.f10437ec;
    }

    /* JADX INFO: renamed from: cg */
    private int m8758cg() {
        return this.f10438ed;
    }

    /* JADX INFO: renamed from: ch */
    private int m8759ch() {
        return this.f10376dS;
    }

    /* JADX INFO: renamed from: ci */
    private boolean m8760ci() {
        return this.f10382dY;
    }

    /* JADX INFO: renamed from: cj */
    private int m8761cj() {
        return this.f10436eb;
    }

    /* JADX INFO: renamed from: ck */
    private String m8762ck() {
        return this.f10435ea;
    }

    /* JADX INFO: renamed from: cl */
    private String m8763cl() {
        return this.f10428eT;
    }

    /* JADX INFO: renamed from: cm */
    private String m8764cm() {
        return this.f10433eY;
    }

    /* JADX INFO: renamed from: cn */
    private int m8765cn() {
        return this.f10474fk;
    }

    /* JADX INFO: renamed from: co */
    private String m8766co() {
        return this.f10475fl;
    }

    /* JADX INFO: renamed from: cp */
    private String m8767cp() {
        return this.f10481fr;
    }

    /* JADX INFO: renamed from: cq */
    private String m8768cq() {
        return this.f10483ft;
    }

    /* JADX INFO: renamed from: cr */
    private long m8769cr() {
        return this.f10384da;
    }

    /* JADX INFO: renamed from: cs */
    private String m8770cs() {
        ArrayList<Integer> arrayList = this.f10484fu;
        if (arrayList == null || arrayList.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Integer> it = this.f10484fu.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            return !TextUtils.isEmpty(sb) ? sb.toString() : "";
        } catch (Throwable th) {
            th.getMessage();
            return "";
        }
    }

    /* JADX INFO: renamed from: ct */
    private int m8771ct() {
        return this.f10485fv;
    }

    /* JADX INFO: renamed from: cu */
    private int m8772cu() {
        return this.f10487fx;
    }

    /* JADX INFO: renamed from: cv */
    private boolean m8773cv() {
        return this.f10489fz;
    }

    /* JADX INFO: renamed from: cw */
    private int m8774cw() {
        return this.f10463fC;
    }

    /* JADX INFO: renamed from: d */
    private void m8775d(long j) {
        this.f10394dk = j;
    }

    /* JADX INFO: renamed from: d */
    private void m8776d(boolean z) {
        this.f10420eK = z;
    }

    /* JADX INFO: renamed from: e */
    private void m8777e(long j) {
        this.f10471fh = j;
    }

    /* JADX INFO: renamed from: e */
    private void m8778e(boolean z) {
        this.f10445ek = z;
    }

    /* JADX INFO: renamed from: f */
    private void m8779f(boolean z) {
        this.f10382dY = z;
    }

    /* JADX INFO: renamed from: f */
    private boolean m8780f(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return this.f10390dg > 0 ? m10153bg() + (this.f10390dg * 1000) >= jCurrentTimeMillis : m10153bg() + j >= jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: g */
    private void m8781g(long j) {
        this.f10384da = j;
    }

    /* JADX INFO: renamed from: g */
    private void m8782g(boolean z) {
        this.f10488fy = z;
    }

    /* JADX INFO: renamed from: h */
    private void m8783h(boolean z) {
        this.f10489fz = z;
    }

    /* JADX INFO: renamed from: r */
    private void m8784r(int i) {
        this.f10385db = i;
    }

    /* JADX INFO: renamed from: s */
    private void m8785s(int i) {
        this.f10386dc = i;
    }

    /* JADX INFO: renamed from: t */
    private void m8786t(int i) {
        this.f10387dd = i;
    }

    /* JADX INFO: renamed from: u */
    private void m8787u(int i) {
        this.f10388de = i;
    }

    /* JADX INFO: renamed from: v */
    private void m8788v(int i) {
        this.f10400dq = C1886t.m9820a(i);
    }

    /* JADX INFO: renamed from: w */
    private void m8789w(int i) {
        this.f10404du = i;
    }

    /* JADX INFO: renamed from: x */
    private void m8790x(int i) {
        this.f10405dv = i;
    }

    /* JADX INFO: renamed from: y */
    private void m8791y(int i) {
        this.f10369dK = i;
    }

    /* JADX INFO: renamed from: z */
    private void m8792z(int i) {
        this.f10370dL = i;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m8793A() {
        return this.f10420eK;
    }

    /* JADX INFO: renamed from: B */
    public final String m8794B() {
        return this.f10421eL;
    }

    /* JADX INFO: renamed from: C */
    public final int m8795C() {
        return this.f10426eQ;
    }

    /* JADX INFO: renamed from: D */
    public final int m8796D() {
        return this.f10372dN;
    }

    /* JADX INFO: renamed from: E */
    public final int m8797E() {
        return this.f10373dO;
    }

    /* JADX INFO: renamed from: F */
    public final int m8798F() {
        return this.f10425eP;
    }

    /* JADX INFO: renamed from: G */
    public final String m8799G() {
        return this.f10422eM;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m8800H() {
        return this.f10423eN;
    }

    /* JADX INFO: renamed from: I */
    public final String m8801I() {
        if (TextUtils.isEmpty(this.f10465fb)) {
            return this.f10465fb;
        }
        return this.f10465fb + "&n_logo=0";
    }

    /* JADX INFO: renamed from: J */
    public final int m8802J() {
        return this.f10466fc;
    }

    /* JADX INFO: renamed from: K */
    public final String m8803K() {
        return this.f10469ff;
    }

    /* JADX INFO: renamed from: L */
    public final C1792n m8804L() {
        return this.f10467fd;
    }

    /* JADX INFO: renamed from: M */
    public final c m8805M() {
        return this.f10478fo;
    }

    /* JADX INFO: renamed from: N */
    public final int m8806N() {
        return this.f10476fm;
    }

    /* JADX INFO: renamed from: O */
    public final int m8807O() {
        return this.f10458ex;
    }

    /* JADX INFO: renamed from: P */
    public final String m8808P() {
        return this.f10460ez;
    }

    /* JADX INFO: renamed from: Q */
    public final int m8809Q() {
        return this.f10455eu;
    }

    /* JADX INFO: renamed from: R */
    public final Map<Integer, String> m8810R() {
        return m8690ae(this.f10453es);
    }

    /* JADX INFO: renamed from: S */
    public final String m8811S() {
        return this.f10448en;
    }

    /* JADX INFO: renamed from: T */
    public final int m8812T() {
        return this.f10449eo;
    }

    /* JADX INFO: renamed from: U */
    public final String m8813U() {
        return this.f10450ep;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m8814V() {
        return this.f10444ej;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m8815W() {
        return this.f10446el;
    }

    /* JADX INFO: renamed from: X */
    public final void m8816X() {
        this.f10446el = true;
    }

    /* JADX INFO: renamed from: Y */
    public final int m8817Y() {
        return this.f10464fa;
    }

    /* JADX INFO: renamed from: Z */
    public final String m8818Z() {
        try {
            if (!TextUtils.isEmpty(this.f10441eg)) {
                return this.f10441eg;
            }
            if (TextUtils.isEmpty(this.f10383dZ)) {
                return null;
            }
            Uri uri = Uri.parse(this.f10383dZ);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("k");
                this.f10441eg = queryParameter;
                this.f10441eg = queryParameter;
            }
            return this.f10441eg;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8819a() {
        return this.f10385db;
    }

    /* JADX INFO: renamed from: a */
    public final void m8820a(int i) {
        this.f10389df = i;
    }

    @Override // com.anythink.expressad.foundation.p116d.C1786h
    /* JADX INFO: renamed from: a */
    public final void mo8821a(C1411c.b bVar) {
        this.f10479fp = bVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m8822a(String str) {
        this.f10355cW = str;
        boolean zM9846e = C1886t.m9846e(str);
        int iM9850g = C1886t.m9850g(str);
        if (zM9846e) {
            this.f10399dp = true;
            m8788v(iM9850g);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8823a(List<String> list) {
        this.f10358cZ = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m8824a(boolean z) {
        this.f10395dl = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8825a(long j, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f10390dg <= 0 ? m10153bg() + j >= jCurrentTimeMillis : m10153bg() + (this.f10390dg * 1000) >= jCurrentTimeMillis) {
            return false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        return this.f10391dh > 0 ? m10153bg() + (this.f10391dh * 1000) >= jCurrentTimeMillis2 : m10153bg() + j2 >= jCurrentTimeMillis2;
    }

    /* JADX INFO: renamed from: aA */
    public final boolean m8826aA() {
        return super.m9122b(this);
    }

    /* JADX INFO: renamed from: aB */
    public final ArrayList<Integer> m8827aB() {
        return this.f10484fu;
    }

    /* JADX INFO: renamed from: aC */
    public final int m8828aC() {
        return this.f10486fw;
    }

    /* JADX INFO: renamed from: aD */
    public final boolean m8829aD() {
        return this.f10488fy;
    }

    /* JADX INFO: renamed from: aE */
    public final String m8830aE() {
        return this.f10461fA;
    }

    /* JADX INFO: renamed from: aF */
    public final int m8831aF() {
        return this.f10462fB;
    }

    /* JADX INFO: renamed from: aa */
    public final String m8832aa() {
        try {
            if (!TextUtils.isEmpty(this.f10442eh)) {
                return this.f10442eh;
            }
            if (TextUtils.isEmpty(this.f10378dU)) {
                return "";
            }
            Uri uri = Uri.parse(this.f10378dU);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("k");
                this.f10442eh = queryParameter;
                this.f10442eh = queryParameter;
            }
            return this.f10442eh;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ab */
    public final String m8833ab() {
        return this.f10439ee;
    }

    /* JADX INFO: renamed from: ac */
    public final String m8834ac() {
        return this.f10440ef;
    }

    /* JADX INFO: renamed from: ad */
    public final String m8835ad() {
        return this.f10379dV;
    }

    /* JADX INFO: renamed from: ae */
    public final int m8836ae() {
        return this.f10380dW;
    }

    /* JADX INFO: renamed from: af */
    public final String m8837af() {
        return this.f10381dX;
    }

    /* JADX INFO: renamed from: ag */
    public final String m8838ag() {
        return this.f10377dT;
    }

    /* JADX INFO: renamed from: ah */
    public final String m8839ah() {
        return this.f10378dU;
    }

    /* JADX INFO: renamed from: ai */
    public final String m8840ai() {
        return this.f10383dZ;
    }

    @Override // com.anythink.expressad.foundation.p116d.C1786h
    /* JADX INFO: renamed from: aj */
    public final C1411c.b mo8841aj() {
        return this.f10479fp;
    }

    /* JADX INFO: renamed from: ak */
    public final String m8842ak() {
        if (!TextUtils.isEmpty(this.f10378dU)) {
            try {
                URL url = new URL(this.f10378dU);
                return url.getProtocol() + "://" + url.getHost();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: al */
    public final List<String> m8843al() {
        Exception e;
        ArrayList arrayList;
        String str = this.f10413eD;
        try {
        } catch (Exception e2) {
            e = e2;
            arrayList = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.optString(i));
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
            }
        }
        return arrayList;
        e.printStackTrace();
        return arrayList;
    }

    /* JADX INFO: renamed from: am */
    public final boolean m8844am() {
        return this.f10424eO;
    }

    /* JADX INFO: renamed from: an */
    public final void m8845an() {
        this.f10424eO = true;
    }

    /* JADX INFO: renamed from: ao */
    public final int m8846ao() {
        return this.f10427eR;
    }

    /* JADX INFO: renamed from: ap */
    public final int m8847ap() {
        return this.f10429eU;
    }

    /* JADX INFO: renamed from: aq */
    public final String m8848aq() {
        return this.f10430eV;
    }

    /* JADX INFO: renamed from: ar */
    public final String m8849ar() {
        return this.f10431eW;
    }

    /* JADX INFO: renamed from: as */
    public final int m8850as() {
        return this.f10432eX;
    }

    /* JADX INFO: renamed from: at */
    public final boolean m8851at() {
        return this.f10357cY;
    }

    /* JADX INFO: renamed from: au */
    public final void m8852au() {
        this.f10357cY = true;
    }

    /* JADX INFO: renamed from: av */
    public final int m8853av() {
        return this.f10434eZ;
    }

    /* JADX INFO: renamed from: aw */
    public final boolean m8854aw() {
        return this.f10480fq;
    }

    /* JADX INFO: renamed from: ax */
    public final void m8855ax() {
        this.f10480fq = true;
    }

    /* JADX INFO: renamed from: ay */
    public final boolean m8856ay() {
        return (TextUtils.isEmpty(this.f10481fr) || TextUtils.isEmpty(C1404a.f6236w)) ? false : true;
    }

    /* JADX INFO: renamed from: az */
    public final int m8857az() {
        return this.f10482fs;
    }

    /* JADX INFO: renamed from: b */
    public final int m8858b() {
        return this.f10386dc;
    }

    /* JADX INFO: renamed from: b */
    public final void m8859b(int i) {
        this.f10402ds = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m8860b(String str) {
        this.f10356cX = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m8861b(boolean z) {
        this.f10423eN = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m8862c() {
        return this.f10355cW;
    }

    /* JADX INFO: renamed from: c */
    public final void m8863c(int i) {
        this.f10397dn = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m8864c(String str) {
        this.f10398do = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m8865c(boolean z) {
        this.f10444ej = z;
    }

    /* JADX INFO: renamed from: d */
    public final String m8866d() {
        return this.f10356cX;
    }

    /* JADX INFO: renamed from: d */
    public final void m8867d(int i) {
        this.f10396dm = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m8868d(String str) {
        this.f10392di = C1890x.m9872c(str);
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m8869e() {
        return this.f10358cZ;
    }

    /* JADX INFO: renamed from: e */
    public final void m8870e(int i) {
        this.f10403dt = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m8871e(String str) {
        this.f10393dj = str;
    }

    /* JADX INFO: renamed from: f */
    public final int m8872f() {
        return this.f10387dd;
    }

    /* JADX INFO: renamed from: f */
    public final void m8873f(int i) {
        this.f10363dE = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m8874f(String str) {
        this.f10364dF = str;
    }

    /* JADX INFO: renamed from: g */
    public final int m8875g() {
        return this.f10388de;
    }

    /* JADX INFO: renamed from: g */
    public final void m8876g(int i) {
        this.f10360dB = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m8877g(String str) {
        this.f10365dG = str;
    }

    /* JADX INFO: renamed from: h */
    public final int m8878h() {
        return this.f10389df;
    }

    /* JADX INFO: renamed from: h */
    public final void m8879h(int i) {
        this.f10362dD = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m8880h(String str) {
        this.f10359dA = str;
    }

    /* JADX INFO: renamed from: i */
    public final int m8881i() {
        return this.f10402ds;
    }

    /* JADX INFO: renamed from: i */
    public final void m8882i(int i) {
        this.f10456ev = i;
    }

    /* JADX INFO: renamed from: i */
    public final void m8883i(String str) {
        this.f10361dC = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m8884j(int i) {
        this.f10429eU = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m8885j(String str) {
        this.f10422eM = str;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8886j() {
        return this.f10399dp;
    }

    /* JADX INFO: renamed from: k */
    public final int m8887k() {
        return this.f10400dq;
    }

    /* JADX INFO: renamed from: k */
    public final void m8888k(int i) {
        this.f10432eX = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m8889k(String str) {
        c cVar;
        this.f10465fb = str;
        if (TextUtils.isEmpty(this.f10430eV) && (((cVar = this.f10478fo) == null || TextUtils.isEmpty(cVar.f10531k)) && !TextUtils.isEmpty(str) && str.contains(f10327d))) {
            this.f10431eW = str;
        }
        this.f10489fz = C1886t.m9844d(str);
    }

    /* JADX INFO: renamed from: l */
    public final void m8890l(int i) {
        this.f10434eZ = i;
    }

    /* JADX INFO: renamed from: l */
    public final void m8891l(String str) {
        this.f10469ff = str;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m8892l() {
        return this.f10401dr;
    }

    /* JADX INFO: renamed from: m */
    public final void m8893m() {
        this.f10401dr = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m8894m(int i) {
        this.f10482fs = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m8895m(String str) {
        this.f10459ey = str;
    }

    /* JADX INFO: renamed from: n */
    public final int m8896n() {
        return this.f10403dt;
    }

    /* JADX INFO: renamed from: n */
    public final void m8897n(int i) {
        this.f10462fB = i;
    }

    /* JADX INFO: renamed from: n */
    public final void m8898n(String str) {
        this.f10460ez = C1890x.m9872c(str);
    }

    /* JADX INFO: renamed from: o */
    public final long m8899o() {
        return this.f10390dg;
    }

    @Override // com.anythink.expressad.out.C1935j
    /* JADX INFO: renamed from: o */
    public final void mo8900o(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f10455eu != 2 ? "Learn more" : "Install";
        }
        super.mo8900o(str);
    }

    /* JADX INFO: renamed from: p */
    public final String m8901p() {
        return this.f10392di;
    }

    /* JADX INFO: renamed from: p */
    public final void m8902p(String str) {
        this.f10379dV = str;
    }

    /* JADX INFO: renamed from: q */
    public final String m8903q() {
        return this.f10393dj;
    }

    /* JADX INFO: renamed from: q */
    public final void m8904q(String str) {
        this.f10378dU = str;
    }

    /* JADX INFO: renamed from: r */
    public final long m8905r() {
        return this.f10394dk;
    }

    /* JADX INFO: renamed from: r */
    public final void m8906r(String str) {
        this.f10430eV = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10431eW = str;
        boolean zM9846e = C1886t.m9846e(str);
        int iM9850g = C1886t.m9850g(str);
        if (zM9846e) {
            this.f10399dp = true;
            m8788v(iM9850g);
        }
        this.f10488fy = C1886t.m9844d(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m8907s(String str) {
        this.f10433eY = str;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8908s() {
        return this.f10395dl;
    }

    /* JADX INFO: renamed from: t */
    public final int m8909t() {
        return this.f10404du;
    }

    /* JADX INFO: renamed from: t */
    public final void m8910t(String str) {
        this.f10461fA = str;
    }

    /* JADX INFO: renamed from: u */
    public final int m8911u() {
        return this.f10405dv;
    }

    /* JADX INFO: renamed from: v */
    public final a m8912v() {
        return this.f10368dJ;
    }

    /* JADX INFO: renamed from: w */
    public final int m8913w() {
        return this.f10363dE;
    }

    /* JADX INFO: renamed from: x */
    public final int m8914x() {
        return this.f10374dQ;
    }

    /* JADX INFO: renamed from: y */
    public final String m8915y() {
        return this.f10375dR;
    }

    /* JADX INFO: renamed from: z */
    public final HashMap<String, String> m8916z() {
        return this.f10414eE;
    }
}
