package p285z2;

import android.content.Context;
import com.cyjh.http.bean.request.EditProjectNumberRequestInfo;
import com.cyjh.http.bean.response.ProjectNumberInfo;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.qc */
/* JADX INFO: loaded from: classes2.dex */
public class C4278qc extends AbstractC3871fc {
    private static final String OooO0OO = "qc";
    private static C4278qc OooO0Oo;
    private OooO00o OooO0O0;

    /* JADX INFO: renamed from: z2.qc$OooO00o */
    public interface OooO00o {
        void OooO00o(int i, String str);

        void OooO0O0(ProjectNumberInfo projectNumberInfo);
    }

    private C4278qc() {
    }

    private void OooO(int i, String str) {
        OooO00o oooO00o = this.OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o(i, str);
        }
    }

    public static C4278qc OooO0oO() {
        if (OooO0Oo == null) {
            synchronized (C4278qc.class) {
                if (OooO0Oo == null) {
                    OooO0Oo = new C4278qc();
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
                    ProjectNumberInfo projectNumberInfo = (ProjectNumberInfo) C4159n4.OooO0o0(jSONObject.getString("Data"), ProjectNumberInfo.class);
                    OooO00o oooO00o = this.OooO0O0;
                    if (oooO00o != null) {
                        oooO00o.OooO0O0(projectNumberInfo);
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

    public void OooO0OO(Context context, String str, String str2, String str3, String str4, String str5, OooO00o oooO00o) {
        try {
            this.OooO0O0 = oooO00o;
            EditProjectNumberRequestInfo editProjectNumberRequestInfo = new EditProjectNumberRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            editProjectNumberRequestInfo.StudioProjectKey = str;
            editProjectNumberRequestInfo.ScriptId = str2;
            editProjectNumberRequestInfo.ScriptVersion = str3;
            editProjectNumberRequestInfo.ScriptUI = str4;
            editProjectNumberRequestInfo.ScriptSettings = str5;
            String string = C4010j3.OooO(C4010j3.OooOOOo, InterfaceC4047k3.o00000oO, InterfaceC4047k3.o00000oo).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, editProjectNumberRequestInfo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OooO0o() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
            this.OooO00o.OooOOO(getClass().getSimpleName());
            this.OooO00o.OooOOO(getClass().getName());
        }
    }

    public void OooO0oo() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
        }
    }

    public C4278qc OooOO0(OooO00o oooO00o) {
        this.OooO0O0 = oooO00o;
        return this;
    }

    public void OooOO0O(Context context, String str, OooO00o oooO00o) {
        try {
            this.OooO0O0 = oooO00o;
            EditProjectNumberRequestInfo editProjectNumberRequestInfo = new EditProjectNumberRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            editProjectNumberRequestInfo.ScriptId = str;
            String string = C4010j3.OooO(C4010j3.OooOOOo, InterfaceC4047k3.o00000oO, InterfaceC4047k3.o0000).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, editProjectNumberRequestInfo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
