package p285z2;

import android.content.Context;
import com.cyjh.http.bean.request.DdyStatisticsData;
import com.cyjh.http.bean.request.DdyStatisticsRequestParamsInfo;
import java.net.URLEncoder;

/* JADX INFO: renamed from: z2.oc */
/* JADX INFO: loaded from: classes2.dex */
public class C4205oc extends AbstractC3871fc {
    private static final String OooO0OO = "oc";
    private static C4205oc OooO0Oo;
    private OooO00o OooO0O0;

    /* JADX INFO: renamed from: z2.oc$OooO00o */
    public interface OooO00o {
        void OooO00o(int i, String str);

        void onSuccess();
    }

    private C4205oc() {
    }

    public static C4205oc OooO0o() {
        if (OooO0Oo == null) {
            synchronized (C4205oc.class) {
                if (OooO0Oo == null) {
                    OooO0Oo = new C4205oc();
                }
            }
        }
        return OooO0Oo;
    }

    private void OooO0oo(int i, String str) {
        OooO00o oooO00o = this.OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o(i, str);
        }
    }

    public void OooO(Context context) {
        try {
            DdyStatisticsRequestParamsInfo ddyStatisticsRequestParamsInfo = new DdyStatisticsRequestParamsInfo(C3834ec.OooO0OO().OooO00o(context));
            ddyStatisticsRequestParamsInfo.IsDDYun = 1;
            ddyStatisticsRequestParamsInfo.IsChargeStatistics = 1;
            this.OooO00o.OooO0oO(context, getClass().getCanonicalName(), InterfaceC4047k3.OooO0o + URLEncoder.encode(C4159n4.OooO0O0(new DdyStatisticsData(DdyStatisticsData.DAILY_STATISTICS, ddyStatisticsRequestParamsInfo)), "UTF-8"));
        } catch (Exception unused) {
        }
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        OooO00o oooO00o = this.OooO0O0;
        if (oooO00o != null) {
            oooO00o.onSuccess();
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        OooO0oo(-1, str);
    }

    public void OooO0OO() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
            this.OooO00o.OooOOO(getClass().getSimpleName());
            this.OooO00o.OooOOO(getClass().getName());
        }
    }

    public void OooO0oO() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
        }
    }

    public C4205oc OooOO0(OooO00o oooO00o) {
        this.OooO0O0 = oooO00o;
        return this;
    }
}
