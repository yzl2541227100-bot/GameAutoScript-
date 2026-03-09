package com.anythink.expressad.video.dynview.p170j;

import android.content.Context;
import android.view.View;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p158a.C2069a;
import com.anythink.expressad.video.dynview.p166i.C2094c;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2099c {

    /* JADX INFO: renamed from: a */
    private static final String f13333a = "ViewOptionWrapper";

    /* JADX INFO: renamed from: b */
    private static final String f13334b = "\\.xml";

    /* JADX INFO: renamed from: c */
    private static final String f13335c = "\\/xml";

    /* JADX INFO: renamed from: a */
    public static C2074c m11252a(Context context, C1781c c1781c, int i) {
        if (c1781c == null) {
            return null;
        }
        try {
            return new C2074c.a().mo11113a(C1877k.m9696b(context) == 1 ? C2069a.f13150b : C2069a.f13149a).mo11110a(4).mo11111a(context).mo11118b(C1877k.m9696b(context)).mo11119b("").mo11122e(c1781c.m8887k()).mo11121d(i).mo11116a();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2074c m11253a(Context context, List<C1781c> list) {
        int iM8955c;
        if (list == null) {
            return null;
        }
        try {
            float fM9847f = C1886t.m9847f(C1175n.m2059a().m2148f());
            float fM9845e = C1886t.m9845e(C1175n.m2059a().m2148f());
            if (list.size() <= 0 || list.get(0) == null) {
                iM8955c = 1;
            } else {
                C1781c c1781c = list.get(0);
                iM8955c = (c1781c == null || c1781c.m8805M() == null) ? 1 : c1781c.m8805M().m8955c();
                list.get(0).m8850as();
                list.get(0).m8848aq();
            }
            String str = C2069a.f13157i;
            if (iM8955c == 1) {
                str = C2069a.f13158j;
            } else if (iM8955c != 2) {
                if (C2094c.m11195a(context)) {
                    iM8955c = 2;
                } else {
                    str = C2069a.f13158j;
                    iM8955c = 1;
                }
            }
            return new C2074c.a().mo11111a(context).mo11113a(str).mo11110a(1).mo11109a(fM9845e).mo11117b(fM9847f).mo11114a(list).mo11118b(iM8955c).mo11119b("").mo11116a();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2074c m11254a(View view, C1781c c1781c) {
        String strM8803K;
        String strM8957e;
        String strM11255a;
        boolean zM11196a;
        if (c1781c == null) {
            return null;
        }
        int iM8954b = 102;
        if (c1781c != null) {
            try {
                strM8803K = c1781c.m8803K();
                if (c1781c.m8805M() != null) {
                    iM8954b = c1781c.m8805M().m8954b();
                    strM8957e = c1781c.m8805M().m8957e();
                } else {
                    strM8957e = "";
                }
                strM11255a = m11255a(iM8954b);
                zM11196a = C2094c.m11196a(strM8957e);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        } else {
            strM8803K = "";
            strM11255a = strM8803K;
            zM11196a = false;
        }
        C2340d c2340dM12000a = C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), strM8803K, false);
        int iM12090h = c2340dM12000a != null ? c2340dM12000a.m12090h() : 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1781c);
        return new C2074c.a().mo11113a(strM11255a).mo11110a(iM8954b).mo11114a(arrayList).mo11111a(view.getContext()).mo11112a(view).mo11120c(iM12090h).mo11118b(C1877k.m9696b(view.getContext())).mo11121d(iM8954b).mo11115a(zM11196a).mo11119b("").mo11122e(c1781c.m8887k()).mo11116a();
    }

    /* JADX INFO: renamed from: a */
    private static String m11255a(int i) {
        return i != 3 ? i != 302 ? i != 802 ? i != 904 ? "anythink_reward_layer_floor" : C2069a.f13155g : C2069a.f13154f : C2069a.f13153e : C2069a.f13156h;
    }

    /* JADX INFO: renamed from: b */
    public static C2074c m11256b(Context context, List<C1781c> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        try {
            float fM9847f = C1886t.m9847f(C1175n.m2059a().m2148f());
            float fM9845e = C1886t.m9845e(C1175n.m2059a().m2148f());
            int i = 0;
            if (list.get(0) != null) {
                int iM8887k = list.get(0).m8887k();
                list.get(0).m8850as();
                list.get(0).m8848aq();
                i = iM8887k;
            }
            int iM9696b = C1877k.m9696b(context);
            return new C2074c.a().mo11113a(iM9696b == 1 ? C2069a.f13159k : C2069a.f13160l).mo11110a(5).mo11111a(context).mo11109a(fM9845e).mo11117b(fM9847f).mo11114a(list).mo11118b(iM9696b).mo11119b("").mo11122e(i).mo11121d(i).mo11116a();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2074c m11257b(View view, C1781c c1781c) {
        String strM11255a;
        if (c1781c == null) {
            return null;
        }
        String strM8803K = "";
        if (c1781c != null) {
            try {
                strM8803K = c1781c.m8803K();
                strM11255a = m11255a(3);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        } else {
            strM11255a = "";
        }
        C2340d c2340dM12000a = C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), strM8803K, false);
        int iM12090h = c2340dM12000a != null ? c2340dM12000a.m12090h() : 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1781c);
        return new C2074c.a().mo11113a(strM11255a).mo11110a(3).mo11114a(arrayList).mo11111a(view.getContext()).mo11112a(view).mo11120c(iM12090h).mo11118b(C1877k.m9696b(view.getContext())).mo11121d(3).mo11116a();
    }
}
