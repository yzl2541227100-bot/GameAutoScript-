package com.iflytek.voiceads.p218e;

import android.content.Context;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.download.C2952p;
import com.iflytek.voiceads.listener.IFLYVideoListener;
import com.iflytek.voiceads.p208b.C2893a;
import com.iflytek.voiceads.p210d.C2920a;
import com.iflytek.voiceads.p210d.C2921b;
import com.iflytek.voiceads.param.C2966a;
import com.iflytek.voiceads.request.C2974a;
import com.iflytek.voiceads.request.C2979f;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.videolib.C3012n;
import com.iflytek.voiceads.videolib.JZPlayer;
import com.iflytek.voiceads.videolib.JZVPStandard;

/* JADX INFO: renamed from: com.iflytek.voiceads.e.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2954a {

    /* JADX INFO: renamed from: a */
    public JZVPStandard f16343a;

    /* JADX INFO: renamed from: c */
    private C2966a f16345c;

    /* JADX INFO: renamed from: d */
    private Context f16346d;

    /* JADX INFO: renamed from: e */
    private C2921b f16347e;

    /* JADX INFO: renamed from: f */
    private C2920a f16348f;

    /* JADX INFO: renamed from: g */
    private IFLYVideoListener f16349g;

    /* JADX INFO: renamed from: i */
    private int f16351i;

    /* JADX INFO: renamed from: j */
    private C2960g f16352j;

    /* JADX INFO: renamed from: k */
    private String f16353k;

    /* JADX INFO: renamed from: b */
    C2974a.a f16344b = new C2955b(this);

    /* JADX INFO: renamed from: h */
    private HandlerC2959f f16350h = new HandlerC2959f();

    public C2954a(Context context, String str, int i, IFLYVideoListener iFLYVideoListener) {
        this.f16346d = context;
        this.f16349g = iFLYVideoListener;
        this.f16351i = i;
        this.f16345c = new C2966a(str);
        this.f16347e = new C2921b(this.f16346d.getApplicationContext());
        this.f16350h.m13432a(this.f16349g);
        this.f16343a = new JZVPStandard(context);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m13411a() {
        try {
            try {
                C2979f.m13529a(this.f16346d.getApplicationContext(), this.f16345c, this.f16344b);
            } catch (Exception e) {
                C2989g.m13557b("IFLY_AD_SDK", e.getMessage());
            }
        } catch (AdError e2) {
            this.f16350h.m13431a(1, e2);
            C2989g.m13555a("IFLY_AD_SDK", e2.getErrorDescription());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13412a(String str, Object obj) {
        this.f16345c.m13447a(str, obj);
    }

    /* JADX INFO: renamed from: a */
    public void m13413a(boolean z) {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.m13610b(z);
    }

    /* JADX INFO: renamed from: a */
    public void m13414a(Object... objArr) {
        if (this.f16343a == null) {
            return;
        }
        try {
            this.f16343a.m13601a(this.f16352j);
            this.f16343a.m13604a(this.f16345c);
            this.f16343a.m13603a(this.f16349g);
            this.f16343a.m13595a(this.f16351i);
            switch (this.f16351i) {
                case 0:
                    m13417c();
                    this.f16343a.m13606a(this.f16353k, "", 0, new Object[0]);
                    break;
                case 1:
                    C3012n.m13679a(this.f16346d, ((Integer) objArr[0]).intValue());
                    this.f16343a.m13606a(this.f16353k, "", 1, new Object[0]);
                    this.f16343a.f16503m.performClick();
                    break;
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "video show ad" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m13415b() {
        if (this.f16346d == null || this.f16348f == null) {
            return;
        }
        C2952p.m13399a(this.f16346d, this.f16348f.f16211j, new C2956c(this));
    }

    /* JADX INFO: renamed from: b */
    public void m13416b(boolean z) {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.m13607a(z);
    }

    /* JADX INFO: renamed from: c */
    public void m13417c() {
        try {
            new C2893a(this.f16346d.getApplicationContext(), this.f16352j.f16373h.optString(C1781c.f10246am)).m13232a(new C2957d(this));
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "loadCoverImg:" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m13418c(boolean z) {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.m13612c(z);
    }

    /* JADX INFO: renamed from: d */
    public void m13419d() {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.f16503m.performClick();
    }

    /* JADX INFO: renamed from: e */
    public void m13420e() {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.m13616f();
        this.f16343a.m13603a((IFLYVideoListener) null);
        this.f16343a = null;
    }

    /* JADX INFO: renamed from: f */
    public void m13421f() {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.m13618h();
    }

    /* JADX INFO: renamed from: g */
    public void m13422g() {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.m13615e();
    }

    /* JADX INFO: renamed from: h */
    public void m13423h() {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.m13613d();
    }

    /* JADX INFO: renamed from: i */
    public boolean m13424i() {
        return this.f16343a != null && this.f16343a.f16497g == 3;
    }

    /* JADX INFO: renamed from: j */
    public boolean m13425j() {
        if (this.f16343a == null) {
            return false;
        }
        return JZPlayer.m13580b();
    }

    /* JADX INFO: renamed from: k */
    public void m13426k() {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.m13619i();
    }

    /* JADX INFO: renamed from: l */
    public void m13427l() {
        if (this.f16343a == null) {
            return;
        }
        this.f16343a.m13620j();
    }
}
