package p285z2;

import android.content.Context;
import com.cyjh.http.bean.request.UploadScriptSettingRequestInfo;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.bd */
/* JADX INFO: loaded from: classes2.dex */
public class C3724bd extends AbstractC3871fc {
    private static final String OooO0OO = "bd";
    private static C3724bd OooO0Oo;
    private OooO00o OooO0O0;

    /* JADX INFO: renamed from: z2.bd$OooO00o */
    public interface OooO00o {
        void OooO00o(int i, String str);

        void onSuccess(String str);
    }

    private C3724bd() {
    }

    public static C3724bd OooO0o() {
        if (OooO0Oo == null) {
            synchronized (C3724bd.class) {
                if (OooO0Oo == null) {
                    OooO0Oo = new C3724bd();
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

    public C3724bd OooO(OooO00o oooO00o) {
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

    public void OooOO0(Context context, String str, String str2, String str3, OooO00o oooO00o) {
        try {
            this.OooO0O0 = oooO00o;
            UploadScriptSettingRequestInfo uploadScriptSettingRequestInfo = new UploadScriptSettingRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            uploadScriptSettingRequestInfo.ScriptId = str;
            uploadScriptSettingRequestInfo.ScriptUI = str2;
            uploadScriptSettingRequestInfo.ScriptSettings = str3;
            String string = C4010j3.OooO(C4010j3.OooOOOo, InterfaceC4047k3.o00000oO, InterfaceC4047k3.o0000OoO).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, uploadScriptSettingRequestInfo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
