package p285z2;

import android.content.Context;
import com.cyjh.http.bean.request.DomainNameRequestParamsInfo;
import com.cyjh.http.bean.response.DomainResult;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.jc */
/* JADX INFO: loaded from: classes2.dex */
public class C4019jc extends AbstractC3871fc {
    private static final String OooO0OO = "jc";
    private static C4019jc OooO0Oo;
    private OooO00o OooO0O0;

    /* JADX INFO: renamed from: z2.jc$OooO00o */
    public interface OooO00o {
        void OooO00o(int i, String str);

        void OooO0O0(DomainResult domainResult);
    }

    private C4019jc() {
    }

    private void OooO(int i, String str) {
        OooO00o oooO00o = this.OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o(i, str);
        }
    }

    public static C4019jc OooO0oO() {
        if (OooO0Oo == null) {
            synchronized (C4019jc.class) {
                if (OooO0Oo == null) {
                    OooO0Oo = new C4019jc();
                }
            }
        }
        return OooO0Oo;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        String message;
        if (obj != null) {
            try {
                JSONObject jSONObject = new JSONObject((String) obj);
                int i = jSONObject.getInt("Code");
                String string = jSONObject.getString(C3902g6.OooO0Oo);
                if (i == 200) {
                    DomainResult domainResult = (DomainResult) C4159n4.OooO0o0(jSONObject.getJSONObject("Data").toString(), DomainResult.class);
                    OooO00o oooO00o = this.OooO0O0;
                    if (oooO00o != null) {
                        oooO00o.OooO0O0(domainResult);
                    }
                } else {
                    OooO(i, string);
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                message = e.getMessage();
            }
        } else {
            message = "后台返回数据为空！";
        }
        OooO(-1, message);
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        OooO(-1, str);
    }

    public void OooO0OO() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
            this.OooO00o.OooOOO(getClass().getSimpleName());
            this.OooO00o.OooOOO(getClass().getName());
        }
    }

    public void OooO0o(Context context, int i, OooO00o oooO00o) {
        try {
            this.OooO0O0 = oooO00o;
            DomainNameRequestParamsInfo domainNameRequestParamsInfo = new DomainNameRequestParamsInfo(C3834ec.OooO0OO().OooO00o(context));
            String str = i % 2 == 1 ? InterfaceC4047k3.OooO0Oo : InterfaceC4047k3.OooO0O0;
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), str, C3834ec.OooO0OO().OooO(str, domainNameRequestParamsInfo));
        } catch (Exception unused) {
        }
    }

    public void OooO0oo() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
        }
    }

    public C4019jc OooOO0(OooO00o oooO00o) {
        this.OooO0O0 = oooO00o;
        return this;
    }
}
