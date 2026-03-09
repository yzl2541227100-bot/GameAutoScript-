package com.anythink.core.common;

import android.content.Context;
import android.util.Log;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p055f.C1231ax;
import com.anythink.core.common.p055f.C1235ba;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p061j.InterfaceC1298d;
import com.anythink.core.common.p063l.C1309d;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1317n {

    /* JADX INFO: renamed from: a */
    public String f5018a;

    /* JADX INFO: renamed from: b */
    public String f5019b;

    /* JADX INFO: renamed from: e */
    private List<InterfaceC1162a> f5022e;

    /* JADX INFO: renamed from: c */
    private final String f5020c = C1317n.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private final Object f5021d = new Object();

    /* JADX INFO: renamed from: f */
    private InterfaceC1162a f5023f = new InterfaceC1162a() { // from class: com.anythink.core.common.n.1
        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public final void onAdLoadFail(AdError adError) {
            synchronized (C1317n.this.f5021d) {
                Iterator it = C1317n.this.f5022e.iterator();
                while (it.hasNext()) {
                    InterfaceC1162a interfaceC1162a = (InterfaceC1162a) it.next();
                    if (interfaceC1162a != null) {
                        C1317n c1317n = C1317n.this;
                        C1352p.m4214a(c1317n.f5018a, String.valueOf(c1317n.f5019b), C1169h.n.f3174D, C1169h.n.f3187m, "returned no eligible ads from any mediated networks. [listener:" + interfaceC1162a.toString() + "]");
                        interfaceC1162a.onAdLoadFail(adError);
                        it.remove();
                    }
                }
            }
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public final void onAdLoaded() {
            synchronized (C1317n.this.f5021d) {
                if (C1317n.this.f5022e != null) {
                    Iterator it = C1317n.this.f5022e.iterator();
                    while (it.hasNext()) {
                        InterfaceC1162a interfaceC1162a = (InterfaceC1162a) it.next();
                        if (interfaceC1162a != null) {
                            C1317n c1317n = C1317n.this;
                            C1352p.m4214a(c1317n.f5018a, String.valueOf(c1317n.f5019b), C1169h.n.f3174D, C1169h.n.f3186l, "[listener:" + interfaceC1162a.toString() + "]");
                            interfaceC1162a.onAdLoaded();
                            it.remove();
                        }
                    }
                }
            }
        }
    };

    /* JADX INFO: renamed from: a */
    private void m3809a(int i, C1257v c1257v, C1235ba c1235ba) {
        C1396f c1396fM5149d;
        if (c1257v == null || c1257v.m3448c()) {
            return;
        }
        boolean zM2931p = c1235ba == null ? i == 3 : c1235ba.m2931p();
        if (zM2931p) {
            C1398h c1398hM5135a = C1398h.m5135a(C1175n.m2059a().m2148f());
            c1396fM5149d = c1398hM5135a.m5149d(this.f5018a);
            if (c1396fM5149d == null) {
                c1396fM5149d = c1398hM5135a.m5150e(this.f5018a);
            }
            StringBuilder sb = new StringBuilder("callbackLoaded::handleWFReload() >>> placementId: ");
            sb.append(this.f5018a);
            sb.append(" localPlaceStrategyType: ");
            sb.append(c1396fM5149d == null ? "本地缓存策略为空" : Integer.valueOf(c1396fM5149d.m5076aR()));
            sb.append("  isCanReloadWhenWFFinish: ");
            sb.append(c1396fM5149d == null ? null : Boolean.valueOf(c1396fM5149d.m5079aU()));
            zM2931p = c1396fM5149d != null && c1396fM5149d.m5079aU();
        } else {
            c1396fM5149d = null;
        }
        StringBuilder sb2 = new StringBuilder("callbackLoaded::handleWFReload() >>> loadType: ");
        sb2.append(c1257v.f4483d);
        sb2.append(" isCanReload: ");
        sb2.append(zM2931p);
        if (zM2931p) {
            int i2 = c1396fM5149d.m5070aL() ? 13 : 14;
            C1201f c1201fM2340a = C1201f.m2340a(c1257v.m3445a(), this.f5018a, this.f5019b);
            C1257v c1257vM3447b = c1257v.m3447b();
            c1257vM3447b.f4483d = i2;
            c1257vM3447b.f4485f = null;
            c1257vM3447b.f4484e = null;
            c1201fM2340a.m2385a(c1257v.m3445a(), this.f5019b, this.f5018a, c1257vM3447b, (InterfaceC1162a) null);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3810a(C1235ba c1235ba) {
        if (c1235ba == null) {
            return;
        }
        C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
        if (c1391aM4865b == null || c1391aM4865b.m4712I()) {
            String str = C1389w.f5630a;
            return;
        }
        C1309d c1309dM4753b = c1391aM4865b.m4753b();
        if (c1309dM4753b != null && c1309dM4753b.m3792d() != 2) {
            String str2 = C1389w.f5630a;
        } else if (C1389w.m4583a().m4625a(c1235ba.m2916a())) {
            C1389w.m4583a().m4623a(c1309dM4753b, c1235ba.m2916a().m5118l());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3811a(String str, String str2) {
        this.f5018a = str;
        this.f5019b = str2;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3812a(C1201f c1201f) {
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(this.f5018a);
        return (c1396fM5139a == null || c1201f == null || ATAdxSetting.getInstance().isAdxNetworkMode(this.f5018a) || c1396fM5139a.m5114h() != 1 || c1201f.m2399c() >= c1396fM5139a.m5115i()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.anythink.core.d.f] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.anythink.core.common.b.b, com.anythink.core.common.n] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: a */
    public final void m3814a(int i, C1257v c1257v, C1235ba c1235ba, int i2) {
        ?? r6;
        int i3;
        ?? r13;
        InterfaceC1298d interfaceC1298d;
        C1396f c1396fM2916a;
        C1231ax c1231ax;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5018a);
        sb.append("::requestId::");
        sb.append(c1257v.f4480a);
        sb.append("::callbackLoaded::loadType::");
        sb.append(c1257v.f4483d);
        sb.append("::callbackType::");
        sb.append(i);
        sb.append("::");
        sb.append(c1235ba != null ? c1235ba.toString() : "");
        C1201f c1201fM4559a = C1387u.m4556a().m4559a(this.f5018a, String.valueOf(this.f5019b));
        if (c1235ba != null && i2 != 10 && (c1396fM2916a = c1235ba.m2916a()) != null) {
            if (c1396fM2916a.m5114h() != 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f5018a);
                sb2.append("::requestId::");
                sb2.append(c1257v.f4480a);
                sb2.append("::callbackLoaded::loadType::");
                sb2.append(c1257v.f4483d);
                sb2.append("::updateUpStatus::callbackType::");
                sb2.append(i);
                sb2.append("::");
                sb2.append(c1235ba.toString());
                if (c1201fM4559a != null) {
                    c1231ax = new C1231ax(System.currentTimeMillis(), c1235ba.m2929n());
                    c1201fM4559a.m2387a(c1231ax, c1396fM2916a);
                }
            } else if (i == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f5018a);
                sb3.append("::requestId::");
                sb3.append(c1257v.f4480a);
                sb3.append("::callbackLoaded::loadType::");
                sb3.append(c1257v.f4483d);
                sb3.append("::updateUpStatus::callbackType::");
                sb3.append(i);
                sb3.append("::");
                sb3.append(c1235ba.toString());
                if (c1201fM4559a != null) {
                    c1231ax = new C1231ax(System.currentTimeMillis(), c1235ba.m2929n());
                    c1201fM4559a.m2387a(c1231ax, c1396fM2916a);
                }
            }
        }
        if (c1201fM4559a != null) {
            c1201fM4559a.m2401d();
        }
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(this.f5018a);
        boolean z = (c1396fM5139a == null || c1201fM4559a == null || ATAdxSetting.getInstance().isAdxNetworkMode(this.f5018a) || c1396fM5139a.m5114h() != 1 || c1201fM4559a.m2399c() >= c1396fM5139a.m5115i()) ? false : true;
        this.f5023f.onAdLoaded();
        if (c1257v.f4483d == 9 || i == 3 || !z || c1201fM4559a == null) {
            r6 = 0;
            i3 = 3;
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f5018a);
            sb4.append("::requestId::");
            sb4.append(c1257v.f4480a);
            sb4.append("::callbackLoaded::loadType::");
            sb4.append(c1257v.f4483d);
            sb4.append("::StartToFilledToLoad::callbackType::");
            sb4.append(i);
            sb4.append("::");
            sb4.append(c1235ba.toString());
            C1257v c1257vM3447b = c1257v.m3447b();
            c1257vM3447b.f4483d = 9;
            c1257vM3447b.f4485f = null;
            c1257vM3447b.f4484e = null;
            r6 = 0;
            i3 = 3;
            c1201fM4559a.m2385a(C1175n.m2059a().m2148f(), this.f5019b, this.f5018a, c1257vM3447b, (InterfaceC1162a) null);
        }
        if (i == 1 && c1201fM4559a != null && (interfaceC1298d = c1201fM4559a.f3625k) != null) {
            interfaceC1298d.mo3731b();
        }
        if (c1257v != null && !c1257v.m3448c()) {
            boolean zM2931p = c1235ba == null ? i == i3 : c1235ba.m2931p();
            if (zM2931p) {
                C1398h c1398hM5135a = C1398h.m5135a(C1175n.m2059a().m2148f());
                C1396f c1396fM5149d = c1398hM5135a.m5149d(this.f5018a);
                C1396f c1396fM5150e = c1396fM5149d == null ? c1398hM5135a.m5150e(this.f5018a) : c1396fM5149d;
                ?? sb5 = new StringBuilder("callbackLoaded::handleWFReload() >>> placementId: ");
                sb5.append(this.f5018a);
                sb5.append(" localPlaceStrategyType: ");
                sb5.append(c1396fM5150e == null ? "本地缓存策略为空" : Integer.valueOf(c1396fM5150e.m5076aR()));
                sb5.append("  isCanReloadWhenWFFinish: ");
                sb5.append(c1396fM5150e == null ? r6 : Boolean.valueOf(c1396fM5150e.m5079aU()));
                zM2931p = c1396fM5150e != null && c1396fM5150e.m5079aU();
                r13 = c1396fM5150e;
            } else {
                r13 = r6;
            }
            StringBuilder sb6 = new StringBuilder("callbackLoaded::handleWFReload() >>> loadType: ");
            sb6.append(c1257v.f4483d);
            sb6.append(" isCanReload: ");
            sb6.append(zM2931p);
            if (zM2931p) {
                int i4 = r13.m5070aL() ? 13 : 14;
                C1201f c1201fM2340a = C1201f.m2340a(c1257v.m3445a(), this.f5018a, this.f5019b);
                C1257v c1257vM3447b2 = c1257v.m3447b();
                c1257vM3447b2.f4483d = i4;
                c1257vM3447b2.f4485f = r6;
                c1257vM3447b2.f4484e = r6;
                c1201fM2340a.m2385a(c1257v.m3445a(), this.f5019b, this.f5018a, c1257vM3447b2, (InterfaceC1162a) null);
            }
        }
        m3810a(c1235ba);
    }

    /* JADX INFO: renamed from: a */
    public final void m3815a(int i, final C1257v c1257v, C1235ba c1235ba, AdError adError) {
        final C1201f c1201fM4559a = C1387u.m4556a().m4559a(this.f5018a, String.valueOf(this.f5019b));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5018a);
        sb.append("::requestId::");
        sb.append(c1257v.f4480a);
        sb.append("::callbackLoadFail::loadType::");
        sb.append(c1257v.f4483d);
        sb.append("::callbackFailType::");
        sb.append(i);
        sb.append("::");
        sb.append(c1235ba != null ? c1235ba.toString() : "");
        if (c1235ba == null || i != 2 || !c1235ba.m2917b()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f5018a);
            sb2.append("::requestId::");
            sb2.append(c1257v.f4480a);
            sb2.append("::callbackLoadFail::loadType::");
            sb2.append(c1257v.f4483d);
            sb2.append("::noReTry::callbackFailType::");
            sb2.append(i);
            sb2.append("::");
            sb2.append(c1235ba != null ? c1235ba.toString() : "");
            if (i != 3 && c1201fM4559a != null) {
                c1201fM4559a.m2402e();
            }
            this.f5023f.onAdLoadFail(adError);
        } else if (c1201fM4559a != null && !C1387u.m4556a().m4573e(this.f5018a)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f5018a);
            sb3.append("::requestId::");
            sb3.append(c1257v.f4480a);
            sb3.append("::callbackLoadFail::loadType::");
            sb3.append(c1257v.f4483d);
            sb3.append("::delayToStartRetryLoad::callbackFailType::");
            sb3.append(i);
            sb3.append("::");
            sb3.append(c1235ba != null ? c1235ba.toString() : "");
            C1175n.m2059a();
            C1175n.m2071b(new Runnable() { // from class: com.anythink.core.common.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    C1257v c1257vM3447b = c1257v.m3447b();
                    c1257vM3447b.f4483d = 8;
                    c1257vM3447b.f4485f = null;
                    c1257vM3447b.f4484e = null;
                    C1201f c1201f = c1201fM4559a;
                    Context contextM2148f = C1175n.m2059a().m2148f();
                    C1317n c1317n = C1317n.this;
                    c1201f.m2385a(contextM2148f, c1317n.f5019b, c1317n.f5018a, c1257vM3447b, (InterfaceC1162a) null);
                }
            }, c1235ba.m2918c());
        }
        if (c1201fM4559a != null) {
            c1201fM4559a.m2386a(adError);
        }
        if (i != 2 && ATSDK.isNetworkLogDebug()) {
            Log.e("anythink", "ad load failed: " + this.f5018a + ", " + adError.printStackTrace());
        }
        m3810a(c1235ba);
    }

    /* JADX INFO: renamed from: a */
    public final void m3816a(InterfaceC1162a interfaceC1162a) {
        synchronized (this.f5021d) {
            if (this.f5022e == null) {
                this.f5022e = new ArrayList();
            }
            if (interfaceC1162a == null) {
                return;
            }
            boolean z = false;
            Iterator<InterfaceC1162a> it = this.f5022e.iterator();
            while (it.hasNext()) {
                if (it.next() == interfaceC1162a) {
                    z = true;
                }
            }
            if (!z) {
                this.f5022e.add(interfaceC1162a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3817b(InterfaceC1162a interfaceC1162a) {
        synchronized (this.f5021d) {
            List<InterfaceC1162a> list = this.f5022e;
            if (list == null) {
                return;
            }
            list.remove(interfaceC1162a);
        }
    }
}
