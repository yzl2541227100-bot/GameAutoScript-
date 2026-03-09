package com.iflytek.voiceads.param;

import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.param.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2966a {

    /* JADX INFO: renamed from: a */
    private String f16412a;

    /* JADX INFO: renamed from: b */
    private C2971f f16413b = new C2971f();

    public C2966a(String str) {
        this.f16412a = str;
        m13442d();
    }

    /* JADX INFO: renamed from: d */
    private void m13442d() {
        m13447a("debug_mode", false);
        m13447a("back_key_enable", true);
        m13447a("download_alert", false);
        m13447a("http_request_timeout", 15000);
        m13447a("lock_screen_ad", false);
        m13447a("banner_recycle", false);
        m13447a("banner_interval", 30);
        m13447a("request_id", m13443e());
        m13447a("currency", "CNY");
        m13455f(this.f16412a);
    }

    /* JADX INFO: renamed from: e */
    private String m13443e() {
        return "AD_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public int m13444a() {
        return ((Integer) this.f16413b.m13507a("adw")).intValue();
    }

    /* JADX INFO: renamed from: a */
    public Object m13445a(String str) {
        return this.f16413b.m13507a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m13446a(int i) {
        this.f16413b.m13508a("adw", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m13447a(String str, Object obj) {
        this.f16413b.m13508a(str, obj);
    }

    /* JADX INFO: renamed from: b */
    public int m13448b() {
        return ((Integer) this.f16413b.m13507a("adh")).intValue();
    }

    /* JADX INFO: renamed from: b */
    public String m13449b(String str) {
        try {
            return (String) this.f16413b.m13507a(str);
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "get str param :" + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public void m13450b(int i) {
        this.f16413b.m13508a("adh", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public String m13451c() {
        return (String) this.f16413b.m13507a("adunit_id");
    }

    /* JADX INFO: renamed from: c */
    public boolean m13452c(String str) {
        try {
            return ((Boolean) this.f16413b.m13507a(str)).booleanValue();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "get boolean param :" + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m13453d(String str) {
        try {
            return ((Integer) this.f16413b.m13507a(str)).intValue();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "get int param :" + e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public double m13454e(String str) {
        try {
            if (this.f16413b.m13507a(str) != null) {
                return ((Double) this.f16413b.m13507a(str)).doubleValue();
            }
            return 0.0d;
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "get double param :" + e.getMessage());
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m13455f(String str) {
        this.f16413b.m13508a("adunit_id", str);
    }
}
