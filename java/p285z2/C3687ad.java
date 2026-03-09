package p285z2;

import android.content.Context;
import com.cyjh.http.bean.request.UploadInstanceDataRequestInfo;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.ad */
/* JADX INFO: loaded from: classes2.dex */
public class C3687ad extends AbstractC3871fc {
    private static C3687ad OooO0OO;
    private OooO00o OooO0O0;

    /* JADX INFO: renamed from: z2.ad$OooO00o */
    public interface OooO00o {
        void OooO00o(int i, String str);

        void onSuccess(String str);
    }

    private C3687ad() {
    }

    public static C3687ad OooO0o() {
        if (OooO0OO == null) {
            synchronized (C3687ad.class) {
                if (OooO0OO == null) {
                    OooO0OO = new C3687ad();
                }
            }
        }
        return OooO0OO;
    }

    private void OooO0oo(int i, String str) {
        OooO00o oooO00o = this.OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o(i, str);
        }
    }

    public C3687ad OooO(OooO00o oooO00o) {
        this.OooO0O0 = oooO00o;
        return this;
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
                    OooO00o oooO00o = this.OooO0O0;
                    if (oooO00o != null) {
                        oooO00o.onSuccess(string);
                    }
                } else {
                    OooO0oo(i, string);
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                message = e.getMessage();
            }
        } else {
            message = "后台返回数据为空！";
        }
        OooO0oo(-1, message);
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

    public void OooOO0(Context context, String str, String str2, OooO00o oooO00o) {
        try {
            this.OooO0O0 = oooO00o;
            UploadInstanceDataRequestInfo uploadInstanceDataRequestInfo = new UploadInstanceDataRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            uploadInstanceDataRequestInfo.ScriptId = str;
            uploadInstanceDataRequestInfo.InstanceData = str2;
            String string = C4010j3.OooO(C4010j3.OooOOOo, InterfaceC4047k3.o00000oO, InterfaceC4047k3.o0000o0).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, uploadInstanceDataRequestInfo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
