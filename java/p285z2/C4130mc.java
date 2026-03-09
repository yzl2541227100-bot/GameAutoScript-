package p285z2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.cyjh.http.C2619R;
import com.cyjh.http.bean.request.UpdateRequestInfo;
import com.cyjh.http.bean.response.VersionUpdateInfo;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.mc */
/* JADX INFO: loaded from: classes2.dex */
public class C4130mc extends AbstractC3871fc {
    public static final String OooO = "mc";
    private Context OooO0O0;
    private InterfaceC4094ld OooO0OO;
    private long OooO0Oo;
    private String OooO0o;
    private boolean OooO0o0;
    private String OooO0oO;
    private UpdateRequestInfo OooO0oo;

    public C4130mc(Context context, InterfaceC4094ld interfaceC4094ld, boolean z) {
        this.OooO0o0 = false;
        this.OooO0O0 = context;
        this.OooO0OO = interfaceC4094ld;
        this.OooO0o0 = z;
    }

    public C4130mc(Context context, InterfaceC4094ld interfaceC4094ld, boolean z, UpdateRequestInfo updateRequestInfo) {
        this.OooO0o0 = false;
        this.OooO0O0 = context;
        this.OooO0OO = interfaceC4094ld;
        this.OooO0o0 = z;
        this.OooO0oo = updateRequestInfo;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        InterfaceC4094ld interfaceC4094ld;
        try {
            JSONObject jSONObject = new JSONObject((String) obj);
            JSONObject jSONObject2 = jSONObject.getJSONObject("Data");
            int i = jSONObject.getInt("Code");
            String string = jSONObject.getString(C3902g6.OooO0Oo);
            if (i == 200) {
                VersionUpdateInfo versionUpdateInfo = (VersionUpdateInfo) C4159n4.OooO0o0(jSONObject2.toString(), VersionUpdateInfo.class);
                if (versionUpdateInfo != null) {
                    this.OooO0OO.OooO0O0(versionUpdateInfo);
                    if (!TextUtils.isEmpty(versionUpdateInfo.StudioProjectKey)) {
                        this.OooO0OO.OooO00o(versionUpdateInfo);
                    }
                    if (this.OooO0Oo == versionUpdateInfo.ClientTimestamp) {
                        if (versionUpdateInfo.UpdateType != 0) {
                            this.OooO0OO.OooOO0(versionUpdateInfo);
                            return;
                        }
                        this.OooO0OO.OooOOO0();
                        if (this.OooO0o0) {
                            C3753c5.OooO0O0(C3834ec.OooO0OO().OooO0O0(), C2619R.string.version_newest);
                            return;
                        }
                        return;
                    }
                    interfaceC4094ld = this.OooO0OO;
                    string = C3834ec.OooO0OO().OooO0O0().getResources().getString(C2619R.string.json_parse_exception);
                } else {
                    interfaceC4094ld = this.OooO0OO;
                    string = C3834ec.OooO0OO().OooO0O0().getResources().getString(C2619R.string.json_parse_exception);
                }
            } else {
                String str = "onUpdateFailure --> message=" + string;
                interfaceC4094ld = this.OooO0OO;
            }
            interfaceC4094ld.OooO0o(string);
        } catch (Exception e) {
            Log.e("zzz", "com.cyjh.share.AppVersionUpdatePresenter--onErrorResponse:" + e.getMessage());
            this.OooO0OO.OooO0o(e.getMessage());
        }
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        Log.e("zzz", "com.cyjh.share.AppVersionUpdatePresenter--onErrorResponse:" + str);
        this.OooO0OO.OooO0o(str);
    }

    public void OooO0OO() {
        this.OooO00o.OooOOO(getClass().getCanonicalName());
    }

    public void OooO0o(Context context) {
        try {
            UpdateRequestInfo updateRequestInfo = new UpdateRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            UpdateRequestInfo updateRequestInfo2 = this.OooO0oo;
            if (updateRequestInfo2 != null) {
                updateRequestInfo.ScriptId = updateRequestInfo2.getScriptId();
                updateRequestInfo.DeviceName = this.OooO0oo.getDeviceName();
                updateRequestInfo.ScriptVersion = this.OooO0oo.getScriptVersion();
                updateRequestInfo.IsScriptHotUpgrade = this.OooO0oo.getIsScriptHotUpgrade();
                if (!TextUtils.isEmpty(this.OooO0oo.AppVersion)) {
                    updateRequestInfo.AppVersion = this.OooO0oo.AppVersion;
                }
            }
            String string = C4010j3.OooO0oO(InterfaceC4047k3.Oooo00o).build().toString();
            Map<String, String> mapOooO = C3834ec.OooO0OO().OooO(string, updateRequestInfo);
            this.OooO0Oo = C3834ec.OooO0o;
            this.OooO00o.OooOO0(this.OooO0O0, getClass().getCanonicalName(), string, mapOooO);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("zzz", "com.cyjh.share.AppVersionUpdatePresenter--updateVersion:" + e.getMessage());
        }
    }
}
