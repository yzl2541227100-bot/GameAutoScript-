package com.anythink.core.basead.adx;

import android.util.Log;
import com.anythink.core.basead.adx.api.IATAdxHandler;
import com.anythink.core.common.C1148a;
import com.anythink.core.common.C1193d;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1237bc;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1260y;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.p038b.p042d.C1109b;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.basead.adx.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1117a implements IATAdxHandler {

    /* JADX INFO: renamed from: a */
    public static String f2731a = "anythink_adx_handler";

    /* JADX INFO: renamed from: b */
    private C1252q f2732b;

    /* JADX INFO: renamed from: c */
    private C1229av f2733c;

    /* JADX INFO: renamed from: d */
    private C1243h f2734d;

    /* JADX INFO: renamed from: e */
    private boolean f2735e;

    /* JADX INFO: renamed from: f */
    private boolean f2736f;

    /* JADX INFO: renamed from: com.anythink.core.basead.adx.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2737a;

        static {
            int[] iArr = new int[IATAdxHandler.LOSS_REASON.values().length];
            f2737a = iArr;
            try {
                iArr[IATAdxHandler.LOSS_REASON.LOSS_TO_HIGHER_BID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2737a[IATAdxHandler.LOSS_REASON.LOSS_TO_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C1117a(C1252q c1252q, C1229av c1229av, C1243h c1243h) {
        this.f2732b = c1252q;
        this.f2733c = c1229av;
        this.f2734d = c1243h;
    }

    @Override // com.anythink.core.basead.adx.api.IATAdxHandler
    public final synchronized void destroy() {
        if (this.f2736f) {
            Log.e(f2731a, "destroy: has call destroy(), do nothing");
            return;
        }
        this.f2736f = true;
        Log.i(f2731a, "destroy, placementId: " + this.f2734d.m2677ah() + ", adSourceId: " + this.f2733c.m2842u());
        try {
            C1148a.m1904a().m1918a(this.f2734d.m2677ah(), this.f2733c, this.f2734d.m2678ai());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.core.basead.adx.api.IATAdxHandler
    public final synchronized void notifyLose(IATAdxHandler.LOSS_REASON loss_reason, double d, Map<String, Object> map) {
        String string;
        if (this.f2735e) {
            Log.e(f2731a, "notifyWin: win or loss has been sent, do anything");
            return;
        }
        this.f2735e = true;
        if (this.f2732b != null && this.f2733c != null) {
            if (d <= 0.0d) {
                Log.e(f2731a, "notifyLose, winnerPrice: " + d + " <= 0, do nothing");
                return;
            }
            Log.i(f2731a, "notifyLose, lossCode: " + loss_reason + ", winnerPrice: " + d + ", extraMap: " + map);
            try {
                String str = AnonymousClass1.f2737a[loss_reason.ordinal()] != 1 ? "103" : "102";
                C1252q c1252q = this.f2732b;
                C1260y c1260y = new C1260y(2, this.f2733c, this.f2734d);
                string = "";
                if (map != null) {
                    Object obj = map.get(IATAdxHandler.BIDDER_NAME);
                    string = obj instanceof String ? obj.toString() : "";
                    Object obj2 = map.get(IATAdxHandler.WATERFALL_INFO);
                    if (obj2 instanceof String) {
                        C1193d.m2290a().m2294a(this.f2734d.m2677ah(), (String) obj2);
                    }
                }
                c1260y.m3456a(d, string, str);
                C1109b.m1674a(c1252q, c1260y, false);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.basead.adx.api.IATAdxHandler
    public final synchronized void notifyWin(Map<String, Object> map) {
        String string;
        if (this.f2735e) {
            Log.e(f2731a, "notifyWin: win or loss has been sent, do anything");
            return;
        }
        this.f2735e = true;
        if (this.f2732b != null && this.f2733c != null) {
            Log.i(f2731a, "notifyWin, extraMap: ".concat(String.valueOf(map)));
            try {
                C1252q c1252q = this.f2732b;
                C1229av c1229av = this.f2733c;
                string = "";
                if (map != null) {
                    Object obj = map.get(IATAdxHandler.SECOND_PRICE);
                    dValueOf = obj instanceof Double ? (Double) obj : null;
                    Object obj2 = map.get(IATAdxHandler.BIDDER_NAME);
                    string = obj2 instanceof String ? obj2.toString() : "";
                    Object obj3 = map.get(IATAdxHandler.WATERFALL_INFO);
                    if (obj3 instanceof String) {
                        C1193d.m2290a().m2294a(this.f2734d.m2677ah(), (String) obj3);
                    }
                }
                if (dValueOf == null) {
                    dValueOf = Double.valueOf(C1344h.m4129a(c1229av));
                    string = "TopOn";
                    StringBuilder sb = new StringBuilder("notifyWin: fix second price to: ");
                    sb.append(dValueOf);
                    sb.append(", fix bidderName to TopOn");
                }
                C1237bc c1237bc = c1252q.f4452u;
                if (c1237bc != null) {
                    c1237bc.m2935a(dValueOf.doubleValue(), string);
                }
                C1109b.m1673a(c1252q, c1229av);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
