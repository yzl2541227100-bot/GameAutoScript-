package com.umeng.analytics.pro;

import com.sun.mail.imap.IMAPStore;
import com.umeng.commonsdk.proguard.C3471v;

/* JADX INFO: renamed from: com.umeng.analytics.pro.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3380b {

    /* JADX INFO: renamed from: A */
    public static final String f18347A = "traffic";

    /* JADX INFO: renamed from: B */
    public static final String f18348B = "upload_traffic";

    /* JADX INFO: renamed from: C */
    public static final String f18349C = "download_traffic";

    /* JADX INFO: renamed from: D */
    public static final String f18350D = "activate_msg";

    /* JADX INFO: renamed from: E */
    public static final String f18351E = "ts";

    /* JADX INFO: renamed from: F */
    public static final String f18352F = "group_info";

    /* JADX INFO: renamed from: G */
    public static final String f18353G = "active_user";

    /* JADX INFO: renamed from: H */
    public static final String f18354H = "provider";

    /* JADX INFO: renamed from: I */
    public static final String f18355I = "puid";

    /* JADX INFO: renamed from: J */
    public static final String f18356J = "error";

    /* JADX INFO: renamed from: K */
    public static final String f18357K = "ts";

    /* JADX INFO: renamed from: L */
    public static final String f18358L = "error_source";

    /* JADX INFO: renamed from: M */
    public static final String f18359M = "context";

    /* JADX INFO: renamed from: N */
    public static final String f18360N = "ekv";

    /* JADX INFO: renamed from: O */
    public static final String f18361O = "gkv";

    /* JADX INFO: renamed from: P */
    public static final String f18362P = "id";

    /* JADX INFO: renamed from: Q */
    public static final String f18363Q = "ts";

    /* JADX INFO: renamed from: S */
    public static final String f18365S = "userlevel";

    /* JADX INFO: renamed from: U */
    public static final String f18367U = "dplus";

    /* JADX INFO: renamed from: V */
    public static final String f18368V = "analytics";

    /* JADX INFO: renamed from: W */
    public static final String f18369W = "content";

    /* JADX INFO: renamed from: X */
    public static final String f18370X = "header";

    /* JADX INFO: renamed from: Y */
    public static final String f18371Y = "events";

    /* JADX INFO: renamed from: Z */
    public static final String f18372Z = "_$!ts";

    /* JADX INFO: renamed from: a */
    public static final String f18373a = "appkey";

    /* JADX INFO: renamed from: ac */
    public static final String f18376ac = "session";

    /* JADX INFO: renamed from: ad */
    public static final String f18377ad = "_$!s_b";

    /* JADX INFO: renamed from: ae */
    public static final String f18378ae = "_$!ts_b";

    /* JADX INFO: renamed from: af */
    public static final String f18379af = "_$!s_e";

    /* JADX INFO: renamed from: ag */
    public static final String f18380ag = "_$!ts_e";

    /* JADX INFO: renamed from: ah */
    public static final String f18381ah = "pageview";

    /* JADX INFO: renamed from: ai */
    public static final String f18382ai = "_$!pv_b";

    /* JADX INFO: renamed from: aj */
    public static final String f18383aj = "_$!ts";

    /* JADX INFO: renamed from: ak */
    public static final String f18384ak = "versioncode";

    /* JADX INFO: renamed from: al */
    public static final String f18385al = "versionname";

    /* JADX INFO: renamed from: am */
    public static final String f18386am = "userlevel";

    /* JADX INFO: renamed from: an */
    public static final String f18387an = "eof";

    /* JADX INFO: renamed from: ao */
    public static final String f18388ao = "exception";

    /* JADX INFO: renamed from: b */
    public static final String f18391b = "channel";

    /* JADX INFO: renamed from: c */
    public static final String f18392c = "secret";

    /* JADX INFO: renamed from: d */
    public static final String f18393d = "app_version";

    /* JADX INFO: renamed from: e */
    public static final String f18394e = "version_code";

    /* JADX INFO: renamed from: f */
    public static final String f18395f = "wrapper_type";

    /* JADX INFO: renamed from: g */
    public static final String f18396g = "wrapper_version";

    /* JADX INFO: renamed from: h */
    public static final String f18397h = "sdk_version";

    /* JADX INFO: renamed from: i */
    public static final String f18398i = "vertical_type";

    /* JADX INFO: renamed from: j */
    public static final String f18399j = "device_id";

    /* JADX INFO: renamed from: k */
    public static final String f18400k = "device_model";

    /* JADX INFO: renamed from: l */
    public static final String f18401l = "$pr_ve";

    /* JADX INFO: renamed from: m */
    public static final String f18402m = "$ud_da";

    /* JADX INFO: renamed from: n */
    public static final String f18403n = "sessions";

    /* JADX INFO: renamed from: o */
    public static final String f18404o = "id";

    /* JADX INFO: renamed from: p */
    public static final String f18405p = "start_time";

    /* JADX INFO: renamed from: q */
    public static final String f18406q = "end_time";

    /* JADX INFO: renamed from: r */
    public static final String f18407r = "duration";

    /* JADX INFO: renamed from: s */
    public static final String f18408s = "pages";

    /* JADX INFO: renamed from: t */
    public static final String f18409t = "autopages";

    /* JADX INFO: renamed from: u */
    public static final String f18410u = "page_name";

    /* JADX INFO: renamed from: v */
    public static final String f18411v = "duration";

    /* JADX INFO: renamed from: w */
    public static final String f18412w = "locations";

    /* JADX INFO: renamed from: x */
    public static final String f18413x = "lat";

    /* JADX INFO: renamed from: y */
    public static final String f18414y = "lng";

    /* JADX INFO: renamed from: z */
    public static final String f18415z = "ts";

    /* JADX INFO: renamed from: R */
    public static final String f18364R = "du";

    /* JADX INFO: renamed from: T */
    public static final String f18366T = "$st_fl";

    /* JADX INFO: renamed from: ap */
    public static final String[] f18389ap = {"id", "ts", f18364R, f18366T};

    /* JADX INFO: renamed from: aa */
    public static final String f18374aa = "_$!id";

    /* JADX INFO: renamed from: ab */
    public static final String f18375ab = "_$!sp";

    /* JADX INFO: renamed from: aq */
    public static final String[] f18390aq = {"_$!ts", f18374aa, "_$!du", "_$!c", f18366T, f18375ab, "event_name", "token", "time", "ip", C3471v.f18929J, "region", "city", "browser", "os", C3471v.f18920A, "device_version", C3471v.f18948ab, "screen_width", "screen_height", "referrer", "referrer_domain", "initial_referrer", "initial_referrer_domain", "initial_view_time", "search_engine", "keyword", "ali_lib", "utm_source", "utm_medium", "utm_term", "utm_content", "utm_campaign", IMAPStore.ID_DATE, "hour", "minute", "app_version", "sp"};
}
