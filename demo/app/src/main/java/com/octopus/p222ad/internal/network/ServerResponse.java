package com.octopus.p222ad.internal.network;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.NativeAdResponse;
import com.octopus.p222ad.internal.AsyncTaskC3115h;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.EnumC3116i;
import com.octopus.p222ad.internal.EnumC3119l;
import com.octopus.p222ad.internal.nativead.C3124c;
import com.octopus.p222ad.internal.p225a.C3074a;
import com.octopus.p222ad.internal.utilities.HTTPResponse;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.ReportEventUtil;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.UrlUtil;
import com.octopus.p222ad.internal.utilities.WebviewUtil;
import com.octopus.p222ad.p224b.C3069b;
import com.octopus.p222ad.p224b.C3070c;
import com.octopus.p222ad.p224b.C3072e;
import com.octopus.p222ad.utils.C3215a;
import com.octopus.p222ad.utils.C3249b;
import com.octopus.p222ad.utils.p258b.C3253d;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.utils.p258b.C3257h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class ServerResponse {
    public static final String EXTRAS_KEY_MRAID = "MRAID";
    public static final String EXTRAS_KEY_ORIENTATION = "ORIENTATION";
    public static final String EXTRAS_KEY_REWARD_ITEM = "REWARD_ITEM";
    public static final String EXTRAS_KEY_SCALE = "SCALE";

    /* JADX INFO: renamed from: A */
    private int f17317A;

    /* JADX INFO: renamed from: B */
    private boolean f17318B;

    /* JADX INFO: renamed from: C */
    private C3069b.b.C4702b f17319C;

    /* JADX INFO: renamed from: D */
    private C3069b.b.a f17320D;

    /* JADX INFO: renamed from: E */
    private int f17321E;

    /* JADX INFO: renamed from: F */
    private String f17322F;

    /* JADX INFO: renamed from: G */
    private String f17323G;

    /* JADX INFO: renamed from: H */
    private String f17324H;

    /* JADX INFO: renamed from: I */
    private String f17325I;

    /* JADX INFO: renamed from: J */
    private C3069b.i f17326J;

    /* JADX INFO: renamed from: K */
    private C3069b.b f17327K;

    /* JADX INFO: renamed from: L */
    private C3069b.m f17328L;

    /* JADX INFO: renamed from: M */
    private C3069b.t f17329M;

    /* JADX INFO: renamed from: N */
    private List<C3069b.j> f17330N;

    /* JADX INFO: renamed from: O */
    private String f17331O;

    /* JADX INFO: renamed from: P */
    private String f17332P;

    /* JADX INFO: renamed from: Q */
    private List<Pair<EnumC3116i, String>> f17333Q;

    /* JADX INFO: renamed from: R */
    private String f17334R;

    /* JADX INFO: renamed from: S */
    private String f17335S;

    /* JADX INFO: renamed from: T */
    private String f17336T;

    /* JADX INFO: renamed from: U */
    private String f17337U;

    /* JADX INFO: renamed from: V */
    private LinkedList<String> f17338V;

    /* JADX INFO: renamed from: W */
    private HashMap<String, Object> f17339W;

    /* JADX INFO: renamed from: X */
    private boolean f17340X;

    /* JADX INFO: renamed from: Y */
    private boolean f17341Y;

    /* JADX INFO: renamed from: Z */
    private C3124c f17342Z;

    /* JADX INFO: renamed from: a */
    private String f17343a;

    /* JADX INFO: renamed from: b */
    private String f17344b;

    /* JADX INFO: renamed from: c */
    private C3072e.a f17345c;

    /* JADX INFO: renamed from: d */
    private int f17346d;

    /* JADX INFO: renamed from: e */
    private int f17347e;

    /* JADX INFO: renamed from: f */
    private int f17348f;

    /* JADX INFO: renamed from: g */
    private int f17349g;

    /* JADX INFO: renamed from: h */
    private int f17350h;

    /* JADX INFO: renamed from: i */
    private int f17351i;

    /* JADX INFO: renamed from: j */
    private boolean f17352j;

    /* JADX INFO: renamed from: k */
    private boolean f17353k;

    /* JADX INFO: renamed from: l */
    private boolean f17354l;

    /* JADX INFO: renamed from: m */
    private boolean f17355m;
    public String mDetectClickUrl;
    public String mDetectViewUrl;
    public EnumC3119l mMediaType;

    /* JADX INFO: renamed from: n */
    private boolean f17356n;

    /* JADX INFO: renamed from: o */
    private boolean f17357o;

    /* JADX INFO: renamed from: p */
    private boolean f17358p;

    /* JADX INFO: renamed from: q */
    private int f17359q;

    /* JADX INFO: renamed from: r */
    private int f17360r;

    /* JADX INFO: renamed from: s */
    private boolean f17361s;

    /* JADX INFO: renamed from: t */
    private int f17362t;

    /* JADX INFO: renamed from: u */
    private AdLogoInfo f17363u;

    /* JADX INFO: renamed from: v */
    private AdLogoInfo f17364v;

    /* JADX INFO: renamed from: w */
    private boolean f17365w;

    /* JADX INFO: renamed from: x */
    private int f17366x;

    /* JADX INFO: renamed from: y */
    private int f17367y;

    /* JADX INFO: renamed from: z */
    private String f17368z;

    /* JADX INFO: renamed from: com.octopus.ad.internal.network.ServerResponse$1 */
    public class RunnableC31251 implements Runnable {
        public final /* synthetic */ C3120m val$octopus;

        public RunnableC31251(C3120m c3120m) {
            c3120m = c3120m;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            for (String str : ServerResponse.this.f17338V) {
                try {
                    InputStream inputStreamOpenStream = new URL(c3120m.m14433b().m14302a(str)).openStream();
                    byte[] bArr = new byte[1024];
                    while (i > 0) {
                        int i2 = inputStreamOpenStream.read(bArr);
                        i = i2 != -1 ? i - i2 : 1024000;
                    }
                } catch (IOException unused) {
                    HaoboLog.m14613v(HaoboLog.baseLogTag, "Ignored request: " + str);
                }
            }
        }
    }

    public static class AdLogoInfo {
        public static int TYPE_PIC = 0;
        public static int TYPE_TEXT = 1;
        public String adurl;
        public int type = 0;

        public void setAdurl(String str) {
            this.adurl = str;
        }

        public void setType(int i) {
            this.type = i;
        }

        public String getAdurl() {
            return this.adurl;
        }

        public int getType() {
            return this.type;
        }
    }

    public ServerResponse(C3069b.q qVar, Map<String, List<String>> map, EnumC3119l enumC3119l) {
        this.f17346d = 0;
        this.f17347e = 1;
        this.f17348f = 0;
        this.f17349g = 0;
        this.f17350h = 0;
        this.f17351i = 0;
        this.f17352j = false;
        this.f17353k = false;
        this.f17354l = true;
        this.f17355m = false;
        this.f17356n = false;
        this.f17357o = false;
        this.f17358p = false;
        this.f17359q = 0;
        this.f17360r = 0;
        this.f17361s = false;
        this.f17362t = 0;
        this.f17363u = new AdLogoInfo();
        this.f17364v = new AdLogoInfo();
        this.f17365w = false;
        this.f17318B = false;
        this.f17333Q = new LinkedList();
        this.f17338V = new LinkedList<>();
        this.f17339W = new HashMap<>();
        this.f17340X = false;
        this.f17341Y = false;
        if (qVar == null) {
            HaoboLog.clearLastResponse();
            return;
        }
        HaoboLog.setLastResponse(qVar.toString());
        HaoboLog.m14607d(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.response_body, HaoboLog.getLastResponse()));
        this.mMediaType = enumC3119l;
        m14544a(map);
        m14543a(qVar);
        m14545b();
    }

    public ServerResponse(HTTPResponse hTTPResponse, EnumC3119l enumC3119l) {
        this.f17346d = 0;
        this.f17347e = 1;
        this.f17348f = 0;
        this.f17349g = 0;
        this.f17350h = 0;
        this.f17351i = 0;
        this.f17352j = false;
        this.f17353k = false;
        this.f17354l = true;
        this.f17355m = false;
        this.f17356n = false;
        this.f17357o = false;
        this.f17358p = false;
        this.f17359q = 0;
        this.f17360r = 0;
        this.f17361s = false;
        this.f17362t = 0;
        this.f17363u = new AdLogoInfo();
        this.f17364v = new AdLogoInfo();
        this.f17365w = false;
        this.f17318B = false;
        this.f17333Q = new LinkedList();
        this.f17338V = new LinkedList<>();
        this.f17339W = new HashMap<>();
        this.f17340X = false;
        this.f17341Y = false;
        this.mMediaType = enumC3119l;
        m14544a(hTTPResponse.getHeaders());
        try {
            m14543a(C3069b.q.m14065a(hTTPResponse.getResponseBinaryBody().toByteArray()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public ServerResponse(boolean z) {
        this.f17346d = 0;
        this.f17347e = 1;
        this.f17348f = 0;
        this.f17349g = 0;
        this.f17350h = 0;
        this.f17351i = 0;
        this.f17352j = false;
        this.f17353k = false;
        this.f17354l = true;
        this.f17355m = false;
        this.f17356n = false;
        this.f17357o = false;
        this.f17358p = false;
        this.f17359q = 0;
        this.f17360r = 0;
        this.f17361s = false;
        this.f17362t = 0;
        this.f17363u = new AdLogoInfo();
        this.f17364v = new AdLogoInfo();
        this.f17365w = false;
        this.f17318B = false;
        this.f17333Q = new LinkedList();
        this.f17338V = new LinkedList<>();
        this.f17339W = new HashMap<>();
        this.f17340X = false;
        this.f17341Y = false;
        this.f17341Y = z;
    }

    /* JADX INFO: renamed from: a */
    private String m14539a(C3069b.a aVar) {
        if (aVar.m13903a() != C3072e.f.RENDER_H5 && aVar.m13903a() != C3072e.f.RENDER_PIC) {
            return "";
        }
        if (aVar.m13903a() == C3072e.f.RENDER_PIC && aVar.m13909d() > 0) {
            return "<!DOCTYPE html>\n<html lang=\"en\" style=\"width: 100%; height: 100%;\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" id=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1\">\n    <title>Document</title>\n</head>\n<body style=\"width: 100%; height: 100%; padding: 0; margin: 0;\">\n<img style=\"width: 100%; height: 100%\" src=\"https://v.behe.com/dsp20/ad/2017/5/5/28d147ed3e96a3ba8ac90703e4d66de2.jpg\" alt=\"\"/>\n</body>\n</html><!DOCTYPE html>".replace("https://v.behe.com/dsp20/ad/2017/5/5/28d147ed3e96a3ba8ac90703e4d66de2.jpg", aVar.m13908c().get(0).m13996b());
        }
        Matcher matcher = Pattern.compile("\\{(\\d+)\\.value\\}").matcher(aVar.m13907b());
        HashMap map = new HashMap();
        for (int i = 0; i < aVar.m13909d(); i++) {
            map.put(Integer.valueOf(i), aVar.m13908c().get(i).m13996b());
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            Integer numValueOf = Integer.valueOf(Integer.parseInt(matcher.group(1)));
            if (map.get(numValueOf) != null) {
                matcher.appendReplacement(stringBuffer, (String) map.get(numValueOf));
            } else {
                matcher.appendReplacement(stringBuffer, "");
                HaoboLog.m14609e(HaoboLog.pbLogTag, HaoboLog.getString(C3063R.string.invalid_string_placeholder, matcher.group(0)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m14541a(int i) {
        List<C3069b.j> listM13936m;
        StringBuilder sb;
        C3069b.b bVar = this.f17327K;
        if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
            return;
        }
        for (int i2 = 0; i2 < listM13936m.size(); i2++) {
            C3069b.j jVar = listM13936m.get(i2);
            if (jVar != null && !TextUtils.isEmpty(jVar.m14023c())) {
                String strM14023c = jVar.m14023c();
                if (strM14023c.startsWith("http://v.adintl.cn/deepLink")) {
                    if (this.f17318B) {
                        sb = new StringBuilder();
                        sb.append(strM14023c);
                        sb.append("&opt=1");
                    } else if (i != 0) {
                        sb = new StringBuilder();
                        sb.append(strM14023c);
                        sb.append("&opt=");
                        sb.append(i);
                    }
                    strM14023c = sb.toString();
                }
                new AsyncTaskC3115h(strM14023c).execute(new Void[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14542a(C3069b.b bVar) {
        this.f17327K = bVar;
        this.f17330N = bVar.m13936m();
        this.f17319C = bVar.m13935l();
        this.f17320D = bVar.m13934k();
        this.f17321E = bVar.m13921c();
        this.f17322F = bVar.m13923d();
        this.f17323G = bVar.m13925e();
        this.f17324H = bVar.m13927f();
        this.f17325I = bVar.m13929g();
        this.f17326J = bVar.m13931h();
        if (TextUtils.isEmpty(this.f17323G)) {
            this.f17323G = "octopus";
        }
        if (TextUtils.isEmpty(this.f17322F)) {
            this.f17322F = "Octopus";
        }
        if (TextUtils.isEmpty(this.f17324H)) {
            this.f17324H = "Ad Download";
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14543a(C3069b.q qVar) {
        if (m14546b(qVar)) {
            EnumC3119l enumC3119l = this.mMediaType;
            if (enumC3119l == EnumC3119l.PREFETCH) {
                if (m14548d(qVar)) {
                    return;
                }
            } else if (enumC3119l != EnumC3119l.NATIVE) {
                if (m14547c(qVar)) {
                    return;
                }
            } else if (m14549e(qVar)) {
                return;
            }
            m14550f(qVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14544a(Map<String, List<String>> map) {
        if (map != null) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    for (String str : entry.getValue()) {
                        if (!TextUtils.isEmpty(str)) {
                            HaoboLog.m14613v(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.response_header, entry.getKey(), str));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m14545b() {
        if (this.f17338V.isEmpty()) {
            return;
        }
        C3120m c3120mM14425a = C3120m.m14425a();
        c3120mM14425a.m14436c().post(new Runnable() { // from class: com.octopus.ad.internal.network.ServerResponse.1
            public final /* synthetic */ C3120m val$octopus;

            public RunnableC31251(C3120m c3120mM14425a2) {
                c3120m = c3120mM14425a2;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i;
                for (String str : ServerResponse.this.f17338V) {
                    try {
                        InputStream inputStreamOpenStream = new URL(c3120m.m14433b().m14302a(str)).openStream();
                        byte[] bArr = new byte[1024];
                        while (i > 0) {
                            int i2 = inputStreamOpenStream.read(bArr);
                            i = i2 != -1 ? i - i2 : 1024000;
                        }
                    } catch (IOException unused) {
                        HaoboLog.m14613v(HaoboLog.baseLogTag, "Ignored request: " + str);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private boolean m14546b(C3069b.q qVar) {
        if (qVar.m14075b() == 0) {
            return true;
        }
        HaoboLog.m14609e(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.response_error, qVar.m14077c(), qVar.m14078d()));
        return false;
    }

    /* JADX INFO: renamed from: c */
    private boolean m14547c(C3069b.q qVar) {
        AdLogoInfo adLogoInfo;
        int i;
        AdLogoInfo adLogoInfo2;
        int i2;
        if (qVar.m14070a() > 0) {
            C3069b.s sVar = qVar.m14079e().get(0);
            this.f17343a = sVar.m14084a();
            this.f17344b = sVar.m14094b();
            this.f17345c = sVar.m14098c();
            this.f17346d = sVar.m14102d();
            this.f17347e = sVar.m14106e() == C3072e.h.PORTRAIT ? 1 : 2;
            this.f17351i = Integer.parseInt(sVar.m14113g());
            this.f17350h = Integer.parseInt(sVar.m14116h());
            if (sVar.m14117i() != null && (getAdType() == C3072e.a.ADP_TABLE || getAdType() == C3072e.a.ADP_CUSTOMER)) {
                C3069b.f fVarM14117i = sVar.m14117i();
                this.f17348f = Integer.parseInt(fVarM14117i.m13998a());
                this.f17349g = Integer.parseInt(fVarM14117i.m14000b());
            } else if (!StringUtil.isEmpty(sVar.m14094b()) && getAdType() == C3072e.a.ADP_IVIDEO) {
                addToExtras(EXTRAS_KEY_REWARD_ITEM, sVar.m14094b());
            }
            this.f17352j = sVar.m14126r();
            this.f17353k = sVar.m14127s();
            this.f17354l = sVar.m14124p();
            this.f17355m = sVar.m14129u();
            this.f17356n = sVar.m14125q();
            this.f17357o = sVar.m14120l();
            this.f17358p = sVar.m14122n();
            this.f17359q = sVar.m14123o();
            this.f17360r = sVar.m14121m();
            this.f17361s = sVar.m14128t();
            this.f17328L = sVar.m14118j();
            this.f17329M = sVar.m14119k();
            this.f17317A = sVar.m14130v();
            this.f17367y = sVar.m14110f();
            List<C3069b.d> listM14131w = sVar.m14131w();
            if (listM14131w != null && listM14131w.size() > 0) {
                this.f17366x = listM14131w.get(0).m13992i();
                this.f17368z = listM14131w.get(0).m13993j();
            }
            if (this.f17352j && this.f17351i == 0 && this.f17350h == 0) {
                this.f17351i = 720;
                this.f17350h = 1280;
            }
            if (sVar.m14132x() > 0) {
                int i3 = 0;
                for (C3069b.d dVar : sVar.m14131w()) {
                    if (i3 == 0) {
                        this.f17332P = dVar.m13983b();
                        C3255f.m14981a("OctopusAd", "mAdid = " + this.f17332P);
                    }
                    if (dVar.m13991h() <= 0 || dVar.m13990g().get(0) == null) {
                        this.f17331O = dVar.m13977a();
                        C3069b.c cVarM13988e = dVar.m13988e();
                        if (cVarM13988e != null) {
                            if (TextUtils.isEmpty(cVarM13988e.m13969a())) {
                                this.f17363u.setAdurl(cVarM13988e.m13971b());
                                adLogoInfo = this.f17363u;
                                i = AdLogoInfo.TYPE_TEXT;
                            } else {
                                this.f17363u.setAdurl(cVarM13988e.m13969a());
                                adLogoInfo = this.f17363u;
                                i = AdLogoInfo.TYPE_PIC;
                            }
                            adLogoInfo.setType(i);
                            if (TextUtils.isEmpty(cVarM13988e.m13973c())) {
                                this.f17364v.setAdurl(cVarM13988e.m13975d());
                                adLogoInfo2 = this.f17364v;
                                i2 = AdLogoInfo.TYPE_TEXT;
                            } else {
                                this.f17364v.setAdurl(cVarM13988e.m13973c());
                                adLogoInfo2 = this.f17364v;
                                i2 = AdLogoInfo.TYPE_PIC;
                            }
                            adLogoInfo2.setType(i2);
                        }
                        if (dVar.m13987d() > 0) {
                            for (C3069b.a aVar : dVar.m13989f()) {
                                if (this.f17354l) {
                                    for (int i4 = 0; i4 < aVar.m13909d(); i4++) {
                                        if (!StringUtil.isEmpty(aVar.m13908c().get(i4).m13994a())) {
                                            this.f17338V.add(aVar.m13908c().get(i4).m13996b());
                                        }
                                    }
                                }
                                if ((aVar.m13903a() == C3072e.f.RENDER_VIDEO || aVar.m13903a() == C3072e.f.RENDER_VAST_VIDEO) && aVar.m13909d() > 0) {
                                    this.f17333Q.add(Pair.create(EnumC3116i.VIDEO, aVar.m13908c().get(0).m13996b()));
                                } else {
                                    String strM14539a = m14539a(aVar);
                                    this.f17333Q.add(Pair.create(EnumC3116i.HTML, strM14539a));
                                    if (strM14539a.contains("mraid.js")) {
                                        addToExtras(EXTRAS_KEY_MRAID, Boolean.TRUE);
                                    }
                                }
                            }
                        }
                        if (dVar.m13985c() != null) {
                            C3069b.b bVarM13985c = dVar.m13985c();
                            m14542a(bVarM13985c);
                            this.f17335S = bVarM13985c.m13910a();
                            this.f17337U = bVarM13985c.m13932i();
                            this.f17336T = bVarM13985c.m13918b();
                            C3069b.j jVarM13933j = bVarM13985c.m13933j();
                            if (jVarM13933j != null && !TextUtils.isEmpty(jVarM13933j.m14019a())) {
                                this.mDetectViewUrl = jVarM13933j.m14019a();
                            }
                            if (jVarM13933j != null && !TextUtils.isEmpty(jVarM13933j.m14021b())) {
                                this.mDetectClickUrl = jVarM13933j.m14021b();
                            }
                            if (jVarM13933j != null && !TextUtils.isEmpty(jVarM13933j.m14029f())) {
                                this.f17334R = jVarM13933j.m14029f();
                            }
                        }
                    }
                    i3++;
                    if (!this.f17333Q.isEmpty()) {
                        break;
                    }
                }
            }
        } else {
            HaoboLog.m14609e(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.blank_ad));
        }
        if (this.f17333Q.isEmpty()) {
            return false;
        }
        this.f17340X = true;
        return true;
    }

    /* JADX INFO: renamed from: d */
    private boolean m14548d(C3069b.q qVar) {
        if (qVar.m14070a() > 0) {
            for (C3069b.s sVar : qVar.m14079e()) {
                this.f17354l = sVar.m14124p();
                if (sVar.m14132x() > 0) {
                    for (C3069b.d dVar : sVar.m14131w()) {
                        if (dVar.m13991h() <= 0 || dVar.m13990g().get(0) == null) {
                            if (dVar.m13987d() > 0) {
                                for (C3069b.a aVar : dVar.m13989f()) {
                                    if (this.f17354l) {
                                        for (int i = 0; i < aVar.m13909d(); i++) {
                                            if (!StringUtil.isEmpty(aVar.m13908c().get(i).m13994a())) {
                                                this.f17338V.add(aVar.m13908c().get(i).m13996b());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f17338V.isEmpty()) {
            return false;
        }
        this.f17340X = true;
        return true;
    }

    /* JADX INFO: renamed from: e */
    private boolean m14549e(C3069b.q qVar) {
        AdLogoInfo adLogoInfo;
        int i;
        AdLogoInfo adLogoInfo2;
        int i2;
        if (qVar.m14070a() > 0) {
            C3069b.s sVar = qVar.m14079e().get(0);
            this.f17343a = sVar.m14084a();
            this.f17344b = sVar.m14094b();
            this.f17345c = sVar.m14098c();
            this.f17346d = sVar.m14102d();
            this.f17347e = sVar.m14106e() == C3072e.h.PORTRAIT ? 1 : 2;
            this.f17351i = Integer.parseInt(sVar.m14113g());
            this.f17350h = Integer.parseInt(sVar.m14116h());
            this.f17367y = sVar.m14110f();
            List<C3069b.d> listM14131w = sVar.m14131w();
            if (listM14131w != null && listM14131w.size() > 0) {
                this.f17366x = listM14131w.get(0).m13992i();
                this.f17368z = listM14131w.get(0).m13993j();
            }
            this.f17352j = sVar.m14126r();
            this.f17353k = sVar.m14127s();
            this.f17354l = sVar.m14124p();
            this.f17355m = sVar.m14129u();
            this.f17356n = sVar.m14125q();
            this.f17357o = sVar.m14120l();
            this.f17358p = sVar.m14122n();
            this.f17359q = sVar.m14123o();
            this.f17360r = sVar.m14121m();
            this.f17361s = sVar.m14128t();
            this.f17328L = sVar.m14118j();
            this.f17329M = sVar.m14119k();
            this.f17317A = sVar.m14130v();
            if (this.f17352j && this.f17351i == 0 && this.f17350h == 0) {
                this.f17351i = 720;
                this.f17350h = 1280;
            }
            if (sVar.m14132x() > 0) {
                for (C3069b.d dVar : sVar.m14131w()) {
                    if (dVar.m13991h() <= 0 || dVar.m13990g().get(0) == null) {
                        this.f17331O = dVar.m13977a();
                        if (dVar.m13987d() >= 0) {
                            for (C3069b.a aVar : dVar.m13989f()) {
                                if (this.f17354l) {
                                    for (int i3 = 0; i3 < aVar.m13909d(); i3++) {
                                        if (!StringUtil.isEmpty(aVar.m13908c().get(i3).m13994a())) {
                                            this.f17338V.add(aVar.m13908c().get(i3).m13996b());
                                        }
                                    }
                                }
                                if (aVar.m13903a() == C3072e.f.RENDER_JSON && aVar.m13909d() > 0) {
                                    try {
                                        C3069b.c cVarM13988e = dVar.m13988e();
                                        if (cVarM13988e != null) {
                                            if (TextUtils.isEmpty(cVarM13988e.m13969a())) {
                                                this.f17363u.setAdurl(cVarM13988e.m13971b());
                                                adLogoInfo = this.f17363u;
                                                i = AdLogoInfo.TYPE_TEXT;
                                            } else {
                                                this.f17363u.setAdurl(cVarM13988e.m13969a());
                                                adLogoInfo = this.f17363u;
                                                i = AdLogoInfo.TYPE_PIC;
                                            }
                                            adLogoInfo.setType(i);
                                            if (TextUtils.isEmpty(cVarM13988e.m13973c())) {
                                                this.f17364v.setAdurl(cVarM13988e.m13975d());
                                                adLogoInfo2 = this.f17364v;
                                                i2 = AdLogoInfo.TYPE_TEXT;
                                            } else {
                                                this.f17364v.setAdurl(cVarM13988e.m13973c());
                                                adLogoInfo2 = this.f17364v;
                                                i2 = AdLogoInfo.TYPE_PIC;
                                            }
                                            adLogoInfo2.setType(i2);
                                        }
                                        C3124c c3124cM14481a = C3124c.m14481a(new JSONObject(aVar.m13907b()));
                                        this.f17342Z = c3124cM14481a;
                                        c3124cM14481a.m14528a(this);
                                        this.f17342Z.m14523a(getFilter());
                                        this.f17342Z.m14533b(getLogoInfo());
                                        this.f17342Z.m14527a(getTextLogInfo());
                                        if (dVar.m13985c() != null) {
                                            m14542a(dVar.m13985c());
                                            C3069b.b bVarM13985c = dVar.m13985c();
                                            this.f17335S = bVarM13985c.m13910a();
                                            this.f17336T = bVarM13985c.m13918b();
                                            this.f17337U = bVarM13985c.m13932i();
                                            this.f17342Z.m14534b(!StringUtil.isEmpty(this.f17335S) ? this.f17335S : this.f17337U);
                                            this.f17342Z.m14535c(this.f17336T);
                                            this.f17342Z.m14526a(dVar.m13985c());
                                            C3069b.j jVarM13933j = bVarM13985c.m13933j();
                                            if (jVarM13933j != null && !TextUtils.isEmpty(jVarM13933j.m14019a())) {
                                                this.f17342Z.m14536d(jVarM13933j.m14019a());
                                            }
                                            if (jVarM13933j != null && !TextUtils.isEmpty(jVarM13933j.m14021b())) {
                                                this.f17342Z.m14537e(jVarM13933j.m14021b());
                                            }
                                            List<C3069b.j> listM13936m = bVarM13985c.m13936m();
                                            if (listM13936m != null && listM13936m.size() > 0) {
                                                for (int i4 = 0; i4 < listM13936m.size(); i4++) {
                                                    String strM14021b = listM13936m.get(i4).m14021b();
                                                    if (!TextUtils.isEmpty(strM14021b)) {
                                                        this.f17342Z.m14537e(strM14021b);
                                                    }
                                                    String strM14019a = listM13936m.get(i4).m14019a();
                                                    if (!TextUtils.isEmpty(strM14019a)) {
                                                        this.f17342Z.m14536d(strM14019a);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (JSONException unused) {
                                    }
                                    if (this.f17342Z != null) {
                                        this.f17340X = true;
                                        return true;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } else {
            HaoboLog.m14609e(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.blank_ad));
        }
        if (this.f17333Q.isEmpty()) {
            return false;
        }
        this.f17340X = true;
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m14550f(C3069b.q qVar) {
        if (qVar.m14070a() > 0) {
            C3069b.s sVar = qVar.m14079e().get(0);
            List<C3069b.d> listM14131w = sVar.m14131w();
            if (listM14131w != null && listM14131w.size() > 0) {
                C3069b.d dVar = listM14131w.get(0);
                if (dVar.m13985c() != null) {
                    C3069b.b bVarM13985c = dVar.m13985c();
                    m14542a(bVarM13985c);
                    this.f17335S = bVarM13985c.m13910a();
                    this.f17337U = bVarM13985c.m13932i();
                    C3069b.j jVarM13933j = bVarM13985c.m13933j();
                    if (jVarM13933j != null && !TextUtils.isEmpty(jVarM13933j.m14019a())) {
                        this.mDetectViewUrl = jVarM13933j.m14019a();
                    }
                    if (jVarM13933j != null && !TextUtils.isEmpty(jVarM13933j.m14021b())) {
                        this.mDetectClickUrl = jVarM13933j.m14021b();
                    }
                    if (jVarM13933j != null && !TextUtils.isEmpty(jVarM13933j.m14029f())) {
                        this.f17334R = jVarM13933j.m14029f();
                    }
                }
            }
            this.f17343a = sVar.m14084a();
            this.f17344b = sVar.m14094b();
            this.f17345c = sVar.m14098c();
            this.f17346d = sVar.m14102d();
            this.f17347e = sVar.m14106e() == C3072e.h.PORTRAIT ? 1 : 2;
            this.f17350h = Integer.parseInt(sVar.m14113g());
            this.f17351i = Integer.parseInt(sVar.m14116h());
            this.f17367y = sVar.m14110f();
            List<C3069b.d> listM14131w2 = sVar.m14131w();
            if (listM14131w2 != null && listM14131w2.size() > 0) {
                this.f17366x = listM14131w2.get(0).m13992i();
                this.f17368z = listM14131w2.get(0).m13993j();
            }
            this.f17348f = 0;
            this.f17349g = 0;
            if (sVar.m14117i() != null && getAdType() == C3072e.a.ADP_TABLE) {
                C3069b.f fVarM14117i = sVar.m14117i();
                this.f17348f = Integer.parseInt(fVarM14117i.m13998a());
                this.f17349g = Integer.parseInt(fVarM14117i.m14000b());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m14551a() {
        return this.f17341Y;
    }

    public void addToExtras(String str, Object obj) {
        this.f17339W.put(str, obj);
    }

    public boolean containsAds() {
        return this.f17340X;
    }

    public void doClick(View view, boolean z, int i) {
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        C3255f.m14981a("OctopusAd", "handleClick========" + z);
        if (!z) {
            if (!StringUtil.isEmpty(this.mDetectClickUrl)) {
                new AsyncTaskC3115h(this.mDetectClickUrl).execute(new Void[0]);
                this.mDetectClickUrl = "";
            }
            if (this.f17327K != null && this.f17330N != null) {
                for (int i2 = 0; i2 < this.f17330N.size(); i2++) {
                    C3069b.j jVar = this.f17330N.get(i2);
                    if (jVar != null && !TextUtils.isEmpty(jVar.m14021b())) {
                        String strM14021b = jVar.m14021b();
                        if (strM14021b.startsWith("http://v.adintl.cn/clk")) {
                            if (this.f17318B) {
                                sb2 = new StringBuilder();
                                sb2.append(strM14021b);
                                sb2.append("&opt=1");
                            } else if (i != 0) {
                                sb2 = new StringBuilder();
                                sb2.append(strM14021b);
                                sb2.append("&opt=");
                                sb2.append(i);
                            }
                            strM14021b = sb2.toString();
                        }
                        new AsyncTaskC3115h(StringUtil.replaceClick(view, strM14021b)).executeOnExecutor(C3257h.m14988b().m14990d(), new Void[0]);
                    }
                }
                this.f17330N = null;
            }
        }
        C3255f.m14981a("OctopusAd", "mDeepLinkUrl:" + this.f17336T + ",appDownloadURL = " + this.f17325I + ",mLandingPageUrl = " + this.f17335S);
        if (TextUtils.isEmpty(this.f17336T)) {
            if (!TextUtils.isEmpty(this.f17325I) && this.f17321E == 2) {
                if (view != null) {
                    if (C3253d.m14975a(view.getContext(), this.f17323G)) {
                        C3253d.m14978b(view.getContext(), this.f17323G);
                        C3069b.b.a aVar = this.f17320D;
                        if (aVar != null) {
                            ReportEventUtil.report(aVar.m13937a());
                            return;
                        }
                        return;
                    }
                    File fileM14973a = C3253d.m14973a(view.getContext());
                    String absolutePath = fileM14973a != null ? fileM14973a.getAbsolutePath() : "";
                    C3249b.m14955a(view.getContext()).m14964b(view.getContext()).m14961a(this.f17326J).m14963a(this.f17318B || i == 8 || i == 9).m14962a(new C3215a(this.f17325I, this.f17323G + AbstractC1067a.f2406g, this.f17323G, absolutePath, this.f17322F, this.f17324H, view.getContext().getPackageName() + ".fileprovider", this.f17320D)).m14965b();
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(this.f17335S) || !this.f17335S.startsWith("http")) {
                StringUtil.isEmpty(this.f17337U);
                return;
            }
            if (!this.f17365w) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(this.f17335S)));
                    if (view != null) {
                        view.getContext().startActivity(intent);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    Toast.makeText(view.getContext(), C3063R.string.action_cant_be_completed, 0).show();
                    return;
                }
            }
            Class clsM13811a = AdActivity.m13811a();
            try {
                WebView webView = new WebView(new MutableContextWrapper(C3120m.m14425a().m14441g()));
                WebviewUtil.setWebViewSettings(webView);
                webView.loadUrl(this.f17335S);
                C3074a.f17016a.add(webView);
                Intent intent2 = new Intent(C3120m.m14425a().m14441g(), (Class<?>) clsM13811a);
                intent2.setFlags(268435456);
                intent2.putExtra("ACTIVITY_TYPE", "DOWNLOADBROWSER");
                C3120m.m14425a().m14441g().startActivity(intent2);
                return;
            } catch (ActivityNotFoundException unused2) {
                HaoboLog.m14615w(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.adactivity_missing, clsM13811a.getName()));
                C3074a.f17016a.remove();
            } catch (Exception e) {
                e = e;
                str = HaoboLog.baseLogTag;
                sb = new StringBuilder();
                sb.append("Exception initializing the redirect webview: ");
                sb.append(e.getMessage());
                HaoboLog.m14609e(str, sb.toString());
            }
        }
        try {
            if (this.f17320D != null && view != null) {
                ReportEventUtil.report(C3253d.m14975a(view.getContext(), this.f17323G) ? this.f17320D.m13951h() : this.f17320D.m13953i());
            }
            Uri uri = Uri.parse(Uri.decode(this.f17336T));
            if (uri.getScheme() == null || !uri.getScheme().equals("bzopen") || TextUtils.isEmpty(uri.getHost()) || uri.getPathSegments().size() <= 0) {
                Intent intent3 = new Intent("android.intent.action.VIEW", uri);
                intent3.setFlags(268435456);
                if (view != null) {
                    view.getContext().startActivity(intent3);
                }
            } else {
                Intent intent4 = new Intent();
                intent4.setAction("android.intent.action.MAIN");
                intent4.addCategory("android.intent.category.LAUNCHER");
                String queryParameter = uri.getQueryParameter("flags");
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        intent4.setFlags((queryParameter.startsWith("0x") || queryParameter.startsWith("0X")) ? Integer.parseInt(queryParameter.substring(2), 16) : Integer.parseInt(queryParameter));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                intent4.setComponent(new ComponentName(uri.getHost(), uri.getPathSegments().get(0)));
                String queryParameter2 = uri.getQueryParameter("rect");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String[] strArrSplit = queryParameter2.split(":");
                        if (strArrSplit.length == 4) {
                            Rect rect = new Rect();
                            rect.set(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Integer.parseInt(strArrSplit[3]));
                            intent4.setSourceBounds(rect);
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                if (view != null) {
                    view.getContext().startActivity(intent4);
                }
            }
            m14541a(i);
            C3069b.b.a aVar2 = this.f17320D;
            if (aVar2 == null || view == null) {
                return;
            }
            ReportEventUtil.report(aVar2.m13947f());
        } catch (Exception e4) {
            e = e4;
            C3069b.b.a aVar3 = this.f17320D;
            if (aVar3 != null) {
                ReportEventUtil.report(aVar3.m13949g());
            }
            if (TextUtils.isEmpty(this.f17335S) || !this.f17335S.startsWith("http")) {
                return;
            }
            if (!this.f17365w) {
                try {
                    Intent intent5 = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(this.f17335S)));
                    if (view != null) {
                        view.getContext().startActivity(intent5);
                        return;
                    }
                    return;
                } catch (Exception unused3) {
                    if (view == null) {
                        return;
                    }
                    Toast.makeText(view.getContext(), C3063R.string.action_cant_be_completed, 0).show();
                    return;
                }
            }
            Class clsM13811a2 = AdActivity.m13811a();
            try {
                WebView webView2 = new WebView(new MutableContextWrapper(view.getContext()));
                WebviewUtil.setWebViewSettings(webView2);
                webView2.loadUrl(this.f17335S);
                C3074a.f17016a.add(webView2);
                Intent intent6 = new Intent(C3120m.m14425a().m14441g(), (Class<?>) clsM13811a2);
                intent6.setFlags(268435456);
                intent6.putExtra("ACTIVITY_TYPE", "DOWNLOADBROWSER");
                view.getContext().startActivity(intent6);
            } catch (ActivityNotFoundException unused4) {
                HaoboLog.m14615w(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.adactivity_missing, clsM13811a2.getName()));
                C3074a.f17016a.remove();
            } catch (Exception unused5) {
                str = HaoboLog.baseLogTag;
                sb = new StringBuilder();
                sb.append("Exception initializing the redirect webview: ");
                sb.append(e.getMessage());
                HaoboLog.m14609e(str, sb.toString());
            }
        }
    }

    public int getAcRatio() {
        return this.f17317A;
    }

    public String getAdExtInfo() {
        return this.f17331O;
    }

    public String getAdId() {
        return this.f17332P;
    }

    public C3069b.b getAdInteractInfo() {
        return this.f17327K;
    }

    public int getAdOrientation() {
        return this.f17347e;
    }

    public C3072e.a getAdType() {
        return this.f17345c;
    }

    public List<Pair<EnumC3116i, String>> getCreatives() {
        return this.f17333Q;
    }

    public HashMap<String, Object> getExtras() {
        return this.f17339W;
    }

    public int getFilter() {
        return this.f17367y;
    }

    public C3069b.b.a getFollowTrackExt() {
        return this.f17320D;
    }

    public int getHeight() {
        return this.f17350h;
    }

    public C3069b.m getInterEvent() {
        return this.f17328L;
    }

    public int getLeft() {
        return this.f17348f;
    }

    public AdLogoInfo getLogoInfo() {
        return this.f17364v;
    }

    public int getMaxTimer() {
        return this.f17360r;
    }

    public int getMinTimer() {
        return this.f17359q;
    }

    public NativeAdResponse getNativeAdResponse() {
        return this.f17342Z;
    }

    public LinkedList<String> getPrefetchResources() {
        return this.f17338V;
    }

    public int getPrice() {
        return this.f17366x;
    }

    public int getRefreshInterval() {
        return this.f17346d;
    }

    public C3069b.t getStrategy() {
        return this.f17329M;
    }

    public String getTagId() {
        return this.f17368z;
    }

    public AdLogoInfo getTextLogInfo() {
        return this.f17363u;
    }

    public int getTop() {
        return this.f17349g;
    }

    public C3069b.b.C4702b getVideoTrackExt() {
        return this.f17319C;
    }

    public int getWidth() {
        return this.f17351i;
    }

    public void handleClick(View view, C3070c c3070c, String str, String str2, boolean z, String str3, int i, int i2) {
        doClick(view, z, i2);
    }

    public void handleClick(View view, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, int i) {
        doClick(view, z, i);
    }

    public void handleConvert(View view) {
        HaoboLog.m14609e(HaoboLog.baseLogTag, "handleClick called with convertUrl = " + this.f17334R);
        if (StringUtil.isEmpty(this.f17334R)) {
            return;
        }
        new AsyncTaskC3115h(this.f17334R).execute(new Void[0]);
    }

    public void handleOnCompletion() {
        List<C3069b.j> listM13936m;
        C3069b.b bVar = this.f17327K;
        if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
            return;
        }
        for (int i = 0; i < listM13936m.size(); i++) {
            UrlUtil.sendOnCompletionInfoToServer(listM13936m.get(i));
        }
    }

    public void handleOnPause(View view) {
        List<C3069b.j> listM13936m;
        C3069b.b bVar = this.f17327K;
        if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
            return;
        }
        for (int i = 0; i < listM13936m.size(); i++) {
            UrlUtil.sendOnPauseInfoToServer(listM13936m.get(i));
        }
    }

    public void handleOnStart(View view, int i) {
        List<C3069b.j> listM13936m;
        C3069b.b bVar = this.f17327K;
        if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
            return;
        }
        for (int i2 = 0; i2 < listM13936m.size(); i2++) {
            UrlUtil.sendOnStartInfoToServer(listM13936m.get(i2));
        }
    }

    public void handleView(View view, String str) {
        List<C3069b.j> listM13936m;
        int i = this.f17362t;
        if (i <= 0) {
            this.f17362t = i + 1;
            if (!StringUtil.isEmpty(this.mDetectViewUrl)) {
                this.mDetectViewUrl = UrlUtil.replaceToTouchEventUrl(this.mDetectViewUrl, "", "", "", "", "", "", "");
                new AsyncTaskC3115h(this.mDetectViewUrl).execute(new Void[0]);
                this.mDetectViewUrl = "";
            }
            C3069b.b bVar = this.f17327K;
            if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
                return;
            }
            for (int i2 = 0; i2 < listM13936m.size(); i2++) {
                C3069b.j jVar = listM13936m.get(i2);
                if (jVar != null && !TextUtils.isEmpty(jVar.m14019a()) && view != null) {
                    boolean zIsEmpty = TextUtils.isEmpty(str);
                    String strM14019a = jVar.m14019a();
                    if (!zIsEmpty) {
                        strM14019a = strM14019a.replace("__REQUESTUUID__", str);
                    }
                    if (this.f17318B) {
                        strM14019a = strM14019a + "&opt=1";
                    }
                    new AsyncTaskC3115h(StringUtil.replaceView(0, view, strM14019a)).executeOnExecutor(C3257h.m14988b().m14990d(), new Void[0]);
                }
            }
        }
    }

    public boolean isAutoClose() {
        return this.f17357o;
    }

    public boolean isAutoPlay() {
        return this.f17361s;
    }

    public boolean isBackgroundDim() {
        return this.f17353k;
    }

    public boolean isFullScreen() {
        return this.f17352j;
    }

    public boolean isManualClose() {
        return this.f17358p;
    }

    public boolean isMuted() {
        return this.f17356n;
    }

    public boolean isWifiOnly() {
        return this.f17355m;
    }

    public boolean isWifiPreload() {
        return this.f17354l;
    }

    public void reportLoss(int i, String str, String str2) {
        List<C3069b.j> listM13936m;
        C3069b.b bVar = this.f17327K;
        if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
            return;
        }
        for (int i2 = 0; i2 < listM13936m.size(); i2++) {
            C3069b.j jVar = listM13936m.get(i2);
            if (jVar != null && !TextUtils.isEmpty(jVar.m14027e())) {
                new AsyncTaskC3115h(UrlUtil.replaceLossUrl(jVar.m14027e(), i, str, str2)).execute(new Void[0]);
            }
        }
    }

    public void reportWin(int i) {
        List<C3069b.j> listM13936m;
        C3069b.b bVar = this.f17327K;
        if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
            return;
        }
        for (int i2 = 0; i2 < listM13936m.size(); i2++) {
            C3069b.j jVar = listM13936m.get(i2);
            if (jVar != null && !TextUtils.isEmpty(jVar.m14025d())) {
                new AsyncTaskC3115h(UrlUtil.replaceWinUrl(jVar.m14025d(), i)).execute(new Void[0]);
            }
        }
    }

    public void setAdOrientation(int i) {
        this.f17347e = i;
    }

    public void setIsLiftUp(boolean z) {
        this.f17318B = z;
    }

    public void setOpenInNativeBrowser(boolean z) {
        this.f17365w = z;
    }
}
