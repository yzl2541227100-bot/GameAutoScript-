package mobi.oneway.export.p275b.p276a;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import mobi.oneway.export.AdListener.feed.OWFeedAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p275b.C3586a;
import mobi.oneway.export.p275b.p277b.C3592c;
import mobi.oneway.export.p281f.C3613a;
import mobi.oneway.export.p281f.C3624d;

/* JADX INFO: renamed from: mobi.oneway.export.b.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3588b {

    /* JADX INFO: renamed from: a */
    private final AdType f19638a = AdType.feed;

    /* JADX INFO: renamed from: b */
    private String f19639b;

    /* JADX INFO: renamed from: c */
    private Context f19640c;

    public C3588b(Context context, String str) {
        this.f19639b = str;
        this.f19640c = context;
    }

    /* JADX INFO: renamed from: a */
    public void m16692a(OWFeedAdListener oWFeedAdListener) {
        List<C3613a> listM16874a = C3624d.m16874a(this.f19639b, this.f19638a);
        if (listM16874a == null) {
            if (oWFeedAdListener != null) {
                oWFeedAdListener.onError(OnewaySdkError.INITIALIZE_FAILED, this.f19638a.name() + C3581a.f19612m);
                return;
            }
            return;
        }
        C3592c c3592c = new C3592c(this.f19638a, listM16874a, C3624d.m16875a(listM16874a), C3586a.m16671a().m16683c());
        c3592c.m16710a(oWFeedAdListener);
        c3592c.mo16714c();
        Iterator<C3613a> it = listM16874a.iterator();
        while (it.hasNext()) {
            it.next().m16829a(this.f19640c, c3592c);
        }
    }
}
