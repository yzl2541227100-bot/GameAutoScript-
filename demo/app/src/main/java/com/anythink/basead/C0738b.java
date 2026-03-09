package com.anythink.basead;

import android.text.TextUtils;
import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p022f.AbstractC0785c;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.p050a.C1149a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1218ak;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1252q;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0738b {

    /* JADX INFO: renamed from: com.anythink.basead.b$1 */
    public class AnonymousClass1 implements C1252q.a {

        /* JADX INFO: renamed from: b */
        private C0751i f607b;

        public AnonymousClass1() {
            this.f607b = new C0751i(this.f606a.m3217n(), "");
        }

        @Override // com.anythink.core.common.p055f.C1252q.a
        /* JADX INFO: renamed from: a */
        public final void mo280a(Map<String, Object> map) {
            C0751i c0751i = this.f607b;
            c0751i.f772l = map;
            C0717a.m126a(10, this.f606a, c0751i);
            C1149a.m1921a();
            C1149a.m1925c(C1175n.m2059a().m2148f(), ((C1245j) this.f606a).m3147b());
        }

        @Override // com.anythink.core.common.p055f.C1252q.a
        /* JADX INFO: renamed from: b */
        public final void mo281b(Map<String, Object> map) {
            C0751i c0751i = this.f607b;
            c0751i.f772l = map;
            C0717a.m126a(36, this.f606a, c0751i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m277a(AbstractC0756b abstractC0756b) {
        if (abstractC0756b != null) {
            return m279a(abstractC0756b.m410f());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m278a(AbstractC0785c abstractC0785c) {
        if (abstractC0785c != null) {
            return m279a(abstractC0785c.m584e());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m279a(AbstractC1247l abstractC1247l) {
        String string;
        if (abstractC1247l == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("offer_id", abstractC1247l.m3229t());
        map.put("creative_id", abstractC1247l.m3231u());
        map.put(ATAdConst.NETWORK_CUSTOM_KEY.IS_DEEPLINK_OFFER, Integer.valueOf((TextUtils.isEmpty(abstractC1247l.m3227s()) && TextUtils.isEmpty(abstractC1247l.m3163D())) ? 0 : 1));
        if (abstractC1247l instanceof AbstractC1217aj) {
            AbstractC1217aj abstractC1217aj = (AbstractC1217aj) abstractC1247l;
            map.put("dsp_id", abstractC1217aj.m2485ad());
            if (abstractC1217aj.m3220o() instanceof C1218ak) {
                map.put(ATAdConst.NETWORK_CUSTOM_KEY.WS_IMP_SWITCH, Integer.valueOf(((C1218ak) abstractC1217aj.m3220o()).m2509av()));
            }
            if (abstractC1247l instanceof C1245j) {
                map.put(ATAdConst.NETWORK_CUSTOM_KEY.WS_ACTION, new C1252q.a() { // from class: com.anythink.basead.b.1

                    /* JADX INFO: renamed from: b */
                    private C0751i f607b;

                    public AnonymousClass1() {
                        this.f607b = new C0751i(this.f606a.m3217n(), "");
                    }

                    @Override // com.anythink.core.common.p055f.C1252q.a
                    /* JADX INFO: renamed from: a */
                    public final void mo280a(Map<String, Object> map2) {
                        C0751i c0751i = this.f607b;
                        c0751i.f772l = map2;
                        C0717a.m126a(10, this.f606a, c0751i);
                        C1149a.m1921a();
                        C1149a.m1925c(C1175n.m2059a().m2148f(), ((C1245j) this.f606a).m3147b());
                    }

                    @Override // com.anythink.core.common.p055f.C1252q.a
                    /* JADX INFO: renamed from: b */
                    public final void mo281b(Map<String, Object> map2) {
                        C0751i c0751i = this.f607b;
                        c0751i.f772l = map2;
                        C0717a.m126a(36, this.f606a, c0751i);
                    }
                });
                if (!abstractC1247l.m3170I()) {
                    if (abstractC1217aj.m3220o().m3309aj() == 1) {
                        string = "6";
                    } else if (abstractC1217aj.m3220o().m3310ak() > 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(abstractC1217aj.m3220o().m3310ak());
                        string = sb.toString();
                    }
                    map.put(ATAdConst.NETWORK_CUSTOM_KEY.RV_ANIM_TYPE, string);
                }
            }
        }
        return map;
    }
}
