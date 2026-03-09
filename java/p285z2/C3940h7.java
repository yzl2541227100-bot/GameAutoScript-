package p285z2;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.MsgItem;
import com.cyjh.http.bean.request.UpdateRequestInfo;
import com.cyjh.http.bean.response.ScriptStartRunInfo;
import com.cyjh.http.bean.response.ScriptStartRunResponse;
import com.cyjh.http.bean.response.VersionUpdateInfo;
import com.ywfzjbcy.R;
import p285z2.C3982ic;
import p285z2.C4093lc;

/* JADX INFO: renamed from: z2.h7 */
/* JADX INFO: loaded from: classes.dex */
public class C3940h7 {
    private static final String OooO00o = "z2.h7";

    /* JADX INFO: renamed from: z2.h7$OooO */
    public class OooO implements C4093lc.OooO0O0 {
        public final /* synthetic */ InterfaceC4306r3 OooO00o;

        /* JADX INFO: renamed from: z2.h7$OooO$OooO00o */
        public class OooO00o implements View.OnClickListener {
            public final /* synthetic */ DialogC4608z9 OoooOoO;

            public OooO00o(DialogC4608z9 dialogC4608z9) {
                this.OoooOoO = dialogC4608z9;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.OoooOoO.dismiss();
            }
        }

        public OooO(InterfaceC4306r3 interfaceC4306r3) {
            this.OooO00o = interfaceC4306r3;
        }

        @Override // p285z2.C4093lc.OooO0O0
        public void OooO00o(Object obj) {
            Boolean bool = Boolean.TRUE;
            String str = (String) obj;
            String unused = C3940h7.OooO00o;
            String str2 = "startRunStatistics --> onCallbackSuc： " + str;
            if (!TextUtils.isEmpty(str)) {
                ScriptStartRunResponse scriptStartRunResponse = (ScriptStartRunResponse) C4159n4.OooO0o0(str, ScriptStartRunResponse.class);
                if (scriptStartRunResponse.Code == 200) {
                    this.OooO00o.OooO00o(Boolean.FALSE);
                    C4125m7.OooO0o0().OooOO0 = scriptStartRunResponse.Data;
                } else {
                    this.OooO00o.OooO00o(bool);
                    if (scriptStartRunResponse != null) {
                        int i = scriptStartRunResponse.Code;
                        String str3 = scriptStartRunResponse.Message;
                        String str4 = "AppContext--onStartScript message:" + str3 + ", responseCode:" + i;
                        if (1100 == i || 1200 == i || 1201 == i || 1202 == i || 1203 == i || 1300 == i) {
                            if (DialogC4608z9.Ooooo0o && !DialogC4608z9.OooooO0) {
                                j10.OooO0o().OooOOOO(new MsgItem(1005));
                            }
                            if (DialogC4608z9.Ooooo0o) {
                                j10.OooO0o().OooOOOO(new MsgItem.UpdateMessageToDialog(str3));
                            } else {
                                DialogC4608z9 dialogC4608z9 = new DialogC4608z9(AppContext.OooO00o(), true, str3);
                                dialogC4608z9.OooO0O0(new OooO00o(dialogC4608z9));
                                dialogC4608z9.show();
                            }
                        } else if (i == 1504) {
                            C3753c5.OooO0OO(AppContext.OooO00o(), scriptStartRunResponse.Message);
                            C3977i7.OooO().Oooo();
                        } else {
                            C3753c5.OooO0OO(AppContext.OooO00o(), scriptStartRunResponse.Message);
                        }
                    } else {
                        C3753c5.OooO0O0(AppContext.OooO00o(), R.string.json_parse_exception);
                    }
                    if (C3977i7.OooO().OooOOO()) {
                        Log.i("EnginSdk", "start stop 111");
                        SystemClock.sleep(C2187m.f13871ag);
                    }
                }
                C4093lc.OooO0oo().OooO0oO();
            }
            this.OooO00o.OooO00o(bool);
            C3753c5.OooO0O0(AppContext.OooO00o(), R.string.json_data_null);
            C3977i7.OooO().Oooo0o0();
            C4093lc.OooO0oo().OooO0oO();
        }

        @Override // p285z2.C4093lc.OooO0O0
        public void OooO0O0() {
            String unused = C3940h7.OooO00o;
        }
    }

    /* JADX INFO: renamed from: z2.h7$OooO00o */
    public class OooO00o implements C3982ic.OooO00o {
        public final /* synthetic */ OooOO0 OooO00o;

        public OooO00o(OooOO0 oooOO0) {
            this.OooO00o = oooOO0;
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO00o(VersionUpdateInfo versionUpdateInfo) {
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0O0(VersionUpdateInfo versionUpdateInfo) {
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0OO(VersionUpdateInfo versionUpdateInfo) {
            int i;
            if (versionUpdateInfo == null) {
                C3940h7.OooO0OO(this.OooO00o);
                return;
            }
            if (versionUpdateInfo.UpgradeMode != 2 || (5 != (i = versionUpdateInfo.UpdateType) && 3 != i)) {
                C3940h7.OooO0OO(this.OooO00o);
                return;
            }
            C3716b5.OooO0OO().OooO0oO(versionUpdateInfo.AppVersion);
            int i2 = C3755c7.OooOO0;
            if (3 == versionUpdateInfo.UpdateType) {
                i2 = C3755c7.OooO;
            }
            C3755c7.OooO0oo().OooO(AppContext.OooO00o(), C3718b7.OooO0Oo().OooO0oO().getId(), i2).OooO0oO(versionUpdateInfo.UpdateUrl);
            C4605z6.OooO0Oo().OooO00o.Oooo0OO();
        }
    }

    /* JADX INFO: renamed from: z2.h7$OooO0O0 */
    public class OooO0O0 implements C4093lc.OooO0O0 {
        public final /* synthetic */ OooOO0 OooO00o;

        public OooO0O0(OooOO0 oooOO0) {
            this.OooO00o = oooOO0;
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
        @Override // p285z2.C4093lc.OooO0O0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void OooO00o(java.lang.Object r4) {
            /*
                Method dump skipped, instruction units count: 277
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p285z2.C3940h7.OooO0O0.OooO00o(java.lang.Object):void");
        }

        @Override // p285z2.C4093lc.OooO0O0
        public void OooO0O0() {
            C3679a5.OooO0O0(AppContext.OooO00o(), "runScriptOperate --> 准备工作失败");
            OooOO0 oooOO0 = this.OooO00o;
            if (oooOO0 != null) {
                oooOO0.OooO0O0();
            }
        }
    }

    /* JADX INFO: renamed from: z2.h7$OooO0OO */
    public class OooO0OO implements C4093lc.OooO0O0 {
        public final /* synthetic */ boolean OooO00o;
        public final /* synthetic */ OooOO0 OooO0O0;

        public OooO0OO(boolean z, OooOO0 oooOO0) {
            this.OooO00o = z;
            this.OooO0O0 = oooOO0;
        }

        @Override // p285z2.C4093lc.OooO0O0
        public void OooO00o(Object obj) {
            String unused = C3940h7.OooO00o;
            String str = "runScriptOperate --> onCallbackSuc1 -- " + C4273q7.OooO0o0().OooO0o();
            String str2 = (String) obj;
            if (!TextUtils.isEmpty(str2)) {
                ScriptStartRunResponse scriptStartRunResponse = (ScriptStartRunResponse) C4159n4.OooO0o0(str2, ScriptStartRunResponse.class);
                if (scriptStartRunResponse != null && scriptStartRunResponse.Code == 200 && !TextUtils.isEmpty(scriptStartRunResponse.Data.ScriptEncryptKey)) {
                    C4125m7.OooO0o0().OooOO0(scriptStartRunResponse.Data.ScriptEncryptKey);
                    C4125m7.OooO0o0().OooOO0O(scriptStartRunResponse.Data.SecKey);
                    if (!C4125m7.OooO0o0().OooO0oO().equals(scriptStartRunResponse.Data.SecKey)) {
                        return;
                    }
                    if (this.OooO00o) {
                        ScriptStartRunInfo scriptStartRunInfo = scriptStartRunResponse.Data;
                        C4496w8.OooO0oO(scriptStartRunInfo.ScriptEncryptKey, scriptStartRunInfo.SecKey);
                        ScriptStartRunInfo scriptStartRunInfo2 = scriptStartRunResponse.Data;
                        C4496w8.OooO(scriptStartRunInfo2.ScriptEncryptKey, scriptStartRunInfo2.SecKey);
                        C4496w8.OooOO0();
                    }
                }
                OooOO0 oooOO0 = this.OooO0O0;
                if (oooOO0 != null) {
                    oooOO0.OooO00o(obj);
                }
            }
            C4093lc.OooO0oo().OooO0oO();
        }

        @Override // p285z2.C4093lc.OooO0O0
        public void OooO0O0() {
            String unused = C3940h7.OooO00o;
            OooOO0 oooOO0 = this.OooO0O0;
            if (oooOO0 != null) {
                oooOO0.OooO0O0();
            }
        }
    }

    /* JADX INFO: renamed from: z2.h7$OooO0o */
    public class OooO0o implements C4093lc.OooO0O0 {
        @Override // p285z2.C4093lc.OooO0O0
        public void OooO00o(Object obj) {
            ScriptStartRunResponse scriptStartRunResponse;
            String unused = C3940h7.OooO00o;
            String str = (String) obj;
            if (TextUtils.isEmpty(str) || (scriptStartRunResponse = (ScriptStartRunResponse) C4159n4.OooO0o0(str, ScriptStartRunResponse.class)) == null || scriptStartRunResponse.Code != 200 || TextUtils.isEmpty(scriptStartRunResponse.Data.ScriptEncryptKey)) {
                return;
            }
            C4125m7.OooO0o0().OooOO0(scriptStartRunResponse.Data.ScriptEncryptKey);
            C4125m7.OooO0o0().OooOO0O(scriptStartRunResponse.Data.SecKey);
            if (C4125m7.OooO0o0().OooO0oO().equals(scriptStartRunResponse.Data.SecKey)) {
                ScriptStartRunInfo scriptStartRunInfo = scriptStartRunResponse.Data;
                C4496w8.OooO0oO(scriptStartRunInfo.ScriptEncryptKey, scriptStartRunInfo.SecKey);
            }
        }

        @Override // p285z2.C4093lc.OooO0O0
        public void OooO0O0() {
            String unused = C3940h7.OooO00o;
        }
    }

    /* JADX INFO: renamed from: z2.h7$OooOO0 */
    public interface OooOO0 {
        void OooO00o(Object obj);

        void OooO0O0();
    }

    public static void OooO0O0() {
        C4093lc.OooO0oo().OooOOO(new OooO0o()).OooOO0(AppContext.OooO00o(), C4273q7.OooO0o0().OooO0o(), C3718b7.OooO0Oo().OooO0oO().getId(), InterfaceC4047k3.OoooO0O);
    }

    public static void OooO0OO(OooOO0 oooOO0) {
        String str = "preStart  --  start : " + C3718b7.OooO0Oo().OooO0oO().getId();
        C4093lc.OooO0oo().OooOOO(new OooO0O0(oooOO0)).OooOO0(AppContext.OooO00o(), C4273q7.OooO0o0().OooO0o(), C3718b7.OooO0Oo().OooO0oO().getId(), InterfaceC4047k3.OoooO0O);
    }

    public static void OooO0Oo(OooOO0 oooOO0, boolean z) {
        C4093lc.OooO0oo().OooOOO(new OooO0OO(z, oooOO0)).OooOO0(AppContext.OooO00o(), C4273q7.OooO0o0().OooO0o(), C3718b7.OooO0Oo().OooO0oO().getId(), InterfaceC4047k3.OoooO0O);
    }

    public static void OooO0o(InterfaceC4306r3<Boolean> interfaceC4306r3) {
        C4093lc.OooO0oo().OooOOO(new OooO(interfaceC4306r3)).OooOO0(AppContext.OooO00o(), C4273q7.OooO0o0().OooO0o(), C3718b7.OooO0Oo().OooO0oO().getId(), InterfaceC4047k3.OoooO0);
    }

    public static void OooO0o0(OooOO0 oooOO0) {
        OooO0oo(false, oooOO0);
    }

    public static void OooO0oO(C4093lc.OooO00o oooO00o) {
        C4093lc.OooO0oo().OooOOO0(oooO00o).OooOO0O(AppContext.OooO00o(), C4125m7.OooO0o0().OooOO0.RunGuid);
    }

    private static void OooO0oo(boolean z, OooOO0 oooOO0) {
        String strOooO0Oo = C4533x8.OooO0Oo(AppContext.OooO00o(), InterfaceC3865f6.OooO0oo);
        String strOooOO0O = C3678a4.OooOO0O(AppContext.OooO00o());
        UpdateRequestInfo updateRequestInfo = new UpdateRequestInfo();
        updateRequestInfo.ScriptId = C3718b7.OooO0Oo().OooO0oO().getId();
        updateRequestInfo.DeviceName = strOooOO0O;
        updateRequestInfo.ScriptVersion = Integer.parseInt(strOooO0Oo);
        updateRequestInfo.IsScriptHotUpgrade = 1;
        updateRequestInfo.AppVersion = C3678a4.OooO0o0();
        C3982ic.OooOo00().OooOo0O(new OooO00o(oooOO0)).OooOo(z, AppContext.OooO00o(), updateRequestInfo);
    }
}
