package mobi.oneway.export.p275b.p276a;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import mobi.oneway.export.AdListener.OWSplashAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p275b.p277b.C3598i;
import mobi.oneway.export.p281f.C3613a;
import mobi.oneway.export.p281f.C3624d;

/* JADX INFO: renamed from: mobi.oneway.export.b.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3589c {

    /* JADX INFO: renamed from: a */
    private final AdType f19641a = AdType.splash;

    /* JADX INFO: renamed from: b */
    private String f19642b;

    public C3589c(String str) {
        this.f19642b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m16693a(Activity activity, ViewGroup viewGroup, OWSplashAdListener oWSplashAdListener, long j) {
        List<C3613a> listM16874a = C3624d.m16874a(this.f19642b, this.f19641a);
        if (listM16874a == null) {
            if (oWSplashAdListener != null) {
                oWSplashAdListener.onAdError(OnewaySdkError.INITIALIZE_FAILED, this.f19641a.name() + C3581a.f19612m);
                return;
            }
            return;
        }
        if (listM16874a.size() >= 1) {
            C3598i c3598i = new C3598i(this.f19641a, Collections.singletonList(listM16874a.get(0).m16844f()), j);
            c3598i.m16710a(oWSplashAdListener);
            c3598i.mo16714c();
            listM16874a.get(0).m16824a(activity, viewGroup, c3598i, j);
        }
    }
}
