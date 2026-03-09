package p285z2;

import android.content.Context;
import android.text.TextUtils;
import com.cyjh.http.bean.SignaClass;
import com.cyjh.http.bean.request.BaseRequestValueInfo;
import com.cyjh.http.bean.request.DeviceInfo;
import com.cyjh.http.bean.response.AliCloudServerResponse;
import com.cyjh.mqm.ElfinNativeJni;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: renamed from: z2.ec */
/* JADX INFO: loaded from: classes2.dex */
public class C3834ec {
    public static long OooO0o;
    private static C3834ec OooO0o0;
    private Context OooO00o;
    public DeviceInfo OooO0O0 = new DeviceInfo();
    public AliCloudServerResponse OooO0OO;
    public int OooO0Oo;

    private C3834ec() {
    }

    public static C3834ec OooO0OO() {
        if (OooO0o0 == null) {
            synchronized (C3834ec.class) {
                if (OooO0o0 == null) {
                    OooO0o0 = new C3834ec();
                }
            }
        }
        return OooO0o0;
    }

    private int OooO0Oo() {
        return new Random().nextInt(8);
    }

    private String OooO0oO(String str, Object obj, int i) throws Exception {
        String strOooO0O0 = C4159n4.OooO0O0(obj);
        return TextUtils.isEmpty(strOooO0O0) ? "" : C3762ce.OooO0O0(str, strOooO0O0, i);
    }

    public Map<String, String> OooO(String str, BaseRequestValueInfo baseRequestValueInfo) throws Exception {
        HashMap map;
        synchronized (this) {
            SignaClass signaClass = new SignaClass();
            String strOooO0O0 = C4159n4.OooO0O0(baseRequestValueInfo);
            signaClass.SignContent = strOooO0O0;
            signaClass.Signature = C3762ce.OooO0Oo(strOooO0O0);
            int iOooO0Oo = OooO0Oo();
            String strOooO0oO = OooO0oO(str, signaClass, iOooO0Oo);
            map = new HashMap();
            map.put("Data", strOooO0oO);
            map.put("R", String.valueOf(iOooO0Oo));
            if (!TextUtils.isEmpty(C4010j3.OooO0O0)) {
                map.put("V", C4010j3.OooO0O0);
            }
        }
        return map;
    }

    public BaseRequestValueInfo OooO00o(Context context) {
        BaseRequestValueInfo baseRequestValueInfo = new BaseRequestValueInfo();
        if (TextUtils.isEmpty(this.OooO0O0.DeviceCode) || TextUtils.isEmpty(this.OooO0O0.DeviceId)) {
            DeviceInfo deviceInfoOooO00o = C3688ae.OooO00o(context);
            DeviceInfo deviceInfo = this.OooO0O0;
            deviceInfo.DeviceId = deviceInfoOooO00o.DeviceId;
            deviceInfo.DeviceCode = deviceInfoOooO00o.DeviceCode;
        }
        DeviceInfo deviceInfo2 = this.OooO0O0;
        baseRequestValueInfo.DeviceId = deviceInfo2.DeviceId;
        baseRequestValueInfo.DeviceCode = deviceInfo2.DeviceCode;
        baseRequestValueInfo.TemplateVersion = C4010j3.OooOO0o();
        baseRequestValueInfo.AppId = C4010j3.OooO0o();
        baseRequestValueInfo.TemplateFileId = C4010j3.OooOOO0();
        baseRequestValueInfo.AppVersion = C3678a4.OooO0o0();
        baseRequestValueInfo.AppInfo = C4010j3.OooO0OO();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        OooO0o = jCurrentTimeMillis;
        baseRequestValueInfo.ClientTimestamp = jCurrentTimeMillis;
        if (!TextUtils.isEmpty(C4010j3.OooO0O0)) {
            baseRequestValueInfo.f15895V = C4010j3.OooO0O0;
        }
        return baseRequestValueInfo;
    }

    public Context OooO0O0() {
        return this.OooO00o;
    }

    public void OooO0o(Context context) {
        this.OooO00o = context.getApplicationContext();
    }

    public boolean OooO0o0() {
        return this.OooO0Oo == 1;
    }

    public Map<String, String> OooO0oo(String str, BaseRequestValueInfo baseRequestValueInfo) throws Exception {
        HashMap map;
        synchronized (this) {
            SignaClass signaClass = new SignaClass();
            String strOooO0O0 = C4159n4.OooO0O0(baseRequestValueInfo);
            signaClass.SignContent = strOooO0O0;
            signaClass.Signature = C3762ce.OooO0Oo(strOooO0O0);
            int iOooO0Oo = OooO0Oo();
            String string = ElfinNativeJni.getString(C4159n4.OooO0O0(signaClass), iOooO0Oo);
            map = new HashMap();
            map.put("Data", string);
            map.put("R", String.valueOf(iOooO0Oo));
        }
        return map;
    }

    public String OooOO0(String str, BaseRequestValueInfo baseRequestValueInfo) {
        String string;
        synchronized (this) {
            StringBuffer stringBuffer = new StringBuffer(str);
            try {
                stringBuffer.append("?AppId=");
                stringBuffer.append(baseRequestValueInfo.AppId);
                stringBuffer.append("&AppVersion=");
                stringBuffer.append(baseRequestValueInfo.AppVersion);
                stringBuffer.append("&PlatformId=");
                stringBuffer.append(C3723bc.OooO00o().OooO0O0());
            } catch (Exception e) {
                e.printStackTrace();
            }
            string = stringBuffer.toString();
        }
        return string;
    }
}
