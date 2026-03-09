package com.cyjh.mobileanjian.ipc.log;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.AbstractC4021je;
import p285z2.C4058ke;

/* JADX INFO: loaded from: classes2.dex */
public class ScriptRunDurationLog extends AbstractC4021je {
    private static final int OooO0o = 4;
    private static final String OooO0o0 = "SetOperationLog";
    private long OooO0Oo;

    public ScriptRunDurationLog(Context context) {
        super(context);
    }

    @Override // p285z2.AbstractC4021je
    public final void OooO00o() {
        this.OooO0O0 = AbstractC4021je.OooO0OO + File.separator + OooO0o0;
    }

    @Override // p285z2.AbstractC4021je
    public final String OooO0O0() {
        C4058ke c4058keOooO00o = C4058ke.OooO00o();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("PhoneModel", c4058keOooO00o.OooO00o);
            jSONObject2.put("MACMD5", c4058keOooO00o.OooO0OO);
            jSONObject2.put("AndroidVersion", c4058keOooO00o.OooO0O0);
            jSONObject2.put("ROM", c4058keOooO00o.OooO0Oo);
            jSONObject2.put("PackageName", c4058keOooO00o.OooO0o);
            String str = "1";
            jSONObject2.put("IsNew", c4058keOooO00o.OooOO0o ? "1" : "0");
            jSONObject2.put("AppID", c4058keOooO00o.OooO0oo);
            jSONObject2.put("AppVersion", c4058keOooO00o.OooOO0);
            jSONObject2.put("Version", c4058keOooO00o.OooOO0O);
            if (!c4058keOooO00o.OooO) {
                str = "0";
            }
            jSONObject2.put("IsFree", str);
            jSONObject2.put("UsedTime", String.valueOf((SystemClock.uptimeMillis() - this.OooO0Oo) / 1000));
            jSONObject.put("LogType", "4");
            jSONObject.put("Data", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public ScriptRunDurationLog setScriptStartTime(long j) {
        this.OooO0Oo = j;
        return this;
    }
}
