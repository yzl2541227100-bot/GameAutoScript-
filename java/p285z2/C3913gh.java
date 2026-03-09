package p285z2;

import android.content.Context;
import android.util.Log;
import com.elf.studio.enity.IMRequestInfo;
import com.elf.studio.enity.IMResultInfo;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.gh */
/* JADX INFO: loaded from: classes2.dex */
public class C3913gh extends AbstractC3871fc {
    public static final String OooO0OO = "gh";
    private static C3913gh OooO0Oo;
    private OooO00o OooO0O0;

    /* JADX INFO: renamed from: z2.gh$OooO00o */
    public interface OooO00o {
        void OooO00o(int i, String str);

        void OooO0O0(IMResultInfo iMResultInfo);
    }

    private C3913gh() {
    }

    public static C3913gh OooO0o() {
        if (OooO0Oo == null) {
            synchronized (C3913gh.class) {
                if (OooO0Oo == null) {
                    OooO0Oo = new C3913gh();
                }
            }
        }
        return OooO0Oo;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject((String) obj);
            JSONObject jSONObject2 = jSONObject.getJSONObject("Data");
            int i = jSONObject.getInt("Code");
            String string = jSONObject.getString(C3902g6.OooO0Oo);
            if (i == 200) {
                IMResultInfo iMResultInfo = (IMResultInfo) C4159n4.OooO0o0(jSONObject2.toString(), IMResultInfo.class);
                OooO00o oooO00o = this.OooO0O0;
                if (oooO00o != null) {
                    oooO00o.OooO0O0(iMResultInfo);
                }
            } else {
                OooO00o oooO00o2 = this.OooO0O0;
                if (oooO00o2 != null) {
                    oooO00o2.OooO00o(i, string);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        Log.e(OooO0OO, "onErrorResponse --> exception message=" + str);
        OooO00o oooO00o = this.OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o(-1, str);
        }
    }

    public void OooO0OO(Context context, IMRequestInfo iMRequestInfo, OooO00o oooO00o) {
        try {
            this.OooO0O0 = oooO00o;
            IMRequestInfo iMRequestInfo2 = new IMRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            if (iMRequestInfo != null) {
                iMRequestInfo2.ScriptId = iMRequestInfo.ScriptId;
            }
            String string = C4010j3.OooO(C4010j3.OooOOOo, InterfaceC4047k3.o00000oO, InterfaceC4047k3.o0000OOo).build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, iMRequestInfo2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OooO0oO() {
        this.OooO00o.OooOOO(getClass().getCanonicalName());
    }
}
