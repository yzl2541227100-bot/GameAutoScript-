package com.octopus.p222ad.internal;

import android.content.Context;
import com.anythink.core.api.ATAdConst;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.StringUtil;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.octopus.ad.internal.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3111d {

    /* JADX INFO: renamed from: a */
    public static HashSet<String> f17114a;

    /* JADX INFO: renamed from: c */
    private String f17116c;

    /* JADX INFO: renamed from: d */
    private String f17117d;

    /* JADX INFO: renamed from: e */
    private String f17118e;

    /* JADX INFO: renamed from: l */
    private String f17125l;

    /* JADX INFO: renamed from: o */
    private WeakReference<Context> f17128o;

    /* JADX INFO: renamed from: p */
    private String f17129p;

    /* JADX INFO: renamed from: b */
    private EnumC3119l f17115b = EnumC3119l.PREFETCH;

    /* JADX INFO: renamed from: f */
    private int f17119f = 3;

    /* JADX INFO: renamed from: g */
    private boolean f17120g = false;

    /* JADX INFO: renamed from: h */
    private int f17121h = -1;

    /* JADX INFO: renamed from: i */
    private int f17122i = -1;

    /* JADX INFO: renamed from: j */
    private int f17123j = -1;

    /* JADX INFO: renamed from: k */
    private int f17124k = -1;

    /* JADX INFO: renamed from: m */
    private boolean f17126m = false;

    /* JADX INFO: renamed from: n */
    private boolean f17127n = false;

    public C3111d(Context context, String str) {
        this.f17129p = "";
        this.f17128o = new WeakReference<>(context);
        this.f17129p = str;
    }

    /* JADX INFO: renamed from: a */
    public String m14369a() {
        return this.f17129p;
    }

    /* JADX INFO: renamed from: a */
    public void m14370a(int i) {
        this.f17119f = i;
    }

    /* JADX INFO: renamed from: a */
    public void m14371a(EnumC3119l enumC3119l) {
        this.f17115b = enumC3119l;
    }

    /* JADX INFO: renamed from: a */
    public void m14372a(String str) {
        this.f17116c = str;
    }

    /* JADX INFO: renamed from: a */
    public void m14373a(boolean z) {
        this.f17126m = z;
    }

    /* JADX INFO: renamed from: b */
    public Context m14374b() {
        if (this.f17128o.get() != null) {
            return this.f17128o.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m14375b(int i) {
        this.f17121h = i;
    }

    /* JADX INFO: renamed from: b */
    public void m14376b(String str) {
        this.f17117d = str;
    }

    /* JADX INFO: renamed from: b */
    public void m14377b(boolean z) {
        this.f17120g = z;
    }

    /* JADX INFO: renamed from: c */
    public String m14378c() {
        return this.f17116c;
    }

    /* JADX INFO: renamed from: c */
    public void m14379c(int i) {
        this.f17122i = i;
    }

    /* JADX INFO: renamed from: c */
    public void m14380c(String str) {
        this.f17118e = str;
    }

    /* JADX INFO: renamed from: d */
    public String m14381d() {
        return this.f17117d;
    }

    /* JADX INFO: renamed from: d */
    public void m14382d(int i) {
        this.f17123j = i;
    }

    /* JADX INFO: renamed from: e */
    public String m14383e() {
        return this.f17118e;
    }

    /* JADX INFO: renamed from: e */
    public void m14384e(int i) {
        this.f17124k = i;
    }

    /* JADX INFO: renamed from: f */
    public int m14385f() {
        if (this.f17115b == EnumC3119l.BANNER) {
            return this.f17121h;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m14386g() {
        if (this.f17115b == EnumC3119l.BANNER) {
            return this.f17122i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public int m14387h() {
        return this.f17123j;
    }

    /* JADX INFO: renamed from: i */
    public int m14388i() {
        return this.f17124k;
    }

    /* JADX INFO: renamed from: j */
    public boolean m14389j() {
        return this.f17120g;
    }

    /* JADX INFO: renamed from: k */
    public EnumC3119l m14390k() {
        return this.f17115b;
    }

    /* JADX INFO: renamed from: l */
    public boolean m14391l() {
        if (!StringUtil.isEmpty(C3120m.m14425a().m14438d()) && !StringUtil.isEmpty(this.f17116c)) {
            return true;
        }
        HaoboLog.m14609e(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.no_identification));
        return false;
    }

    /* JADX INFO: renamed from: m */
    public String m14392m() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = m14374b().getResources().getConfiguration().orientation == 2 ? "h" : "v";
            this.f17125l = str2;
            if (!StringUtil.isEmpty(str2)) {
                jSONObject.put("mOrientation", this.f17125l);
            }
            int i = this.f17121h;
            String str3 = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE;
            if (i > 0 && this.f17122i > 0) {
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, this.f17121h + "x" + this.f17122i);
            }
            int iM14388i = m14388i();
            int iM14387h = m14387h();
            if (iM14388i > 0 && iM14387h > 0) {
                EnumC3119l enumC3119l = this.f17115b;
                EnumC3119l enumC3119l2 = EnumC3119l.INTERSTITIAL;
                if (!enumC3119l.equals(enumC3119l2) && (this.f17121h < 0 || this.f17122i < 0)) {
                    str3 = "max_size";
                    str = iM14387h + "x" + iM14388i;
                } else if (this.f17115b.equals(enumC3119l2)) {
                    str = iM14387h + "x" + iM14388i;
                }
                jSONObject.put(str3, str);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            HaoboLog.m14609e(HaoboLog.jsonLogTag, "Failed to encode adUnitParams, err = " + e.getMessage());
            return "";
        }
    }
}
