package p285z2;

import android.content.Context;
import android.text.TextUtils;
import com.cyjh.http.bean.request.ChannelRequestInfo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.sc */
/* JADX INFO: loaded from: classes2.dex */
public class C4352sc extends AbstractC3871fc {
    private static final String OooO0Oo = "sc";
    private long OooO0O0;
    private InterfaceC3872fd OooO0OO;

    public C4352sc(InterfaceC3872fd interfaceC3872fd) {
        this.OooO0OO = interfaceC3872fd;
    }

    @Override // p285z2.InterfaceC4168nd
    public void OooO00o(Object obj) {
        JSONArray jSONArray;
        if (obj != null) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("Data");
                    int i = jSONObject.getInt("Code");
                    String string = jSONObject.getString(C3902g6.OooO0Oo);
                    if (i != 200) {
                        this.OooO0OO.onError(string);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (jSONObject2.has("ChannelList") && (jSONArray = jSONObject2.getJSONArray("ChannelList")) != null && jSONArray.length() > 0) {
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            arrayList.add((String) jSONArray.get(i2));
                        }
                    }
                    this.OooO0OO.OooOO0O(arrayList);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    this.OooO0OO.onError("解析数据异常！");
                    return;
                }
            }
        }
        this.OooO0OO.onError("返回数据为空！");
    }

    @Override // p285z2.AbstractC3871fc
    public void OooO0O0(String str) {
        this.OooO0OO.onError(str);
    }

    public void OooO0OO(Context context, String str, String str2) {
        try {
            ChannelRequestInfo channelRequestInfo = new ChannelRequestInfo(C3834ec.OooO0OO().OooO00o(context));
            channelRequestInfo.PackageName = str;
            channelRequestInfo.Version = str2;
            this.OooO0O0 = C3834ec.OooO0o;
            String string = C4010j3.OooO0oo(InterfaceC4047k3.OooOOOo, "List").build().toString();
            this.OooO00o.OooOO0(context, getClass().getCanonicalName(), string, C3834ec.OooO0OO().OooO(string, channelRequestInfo));
        } catch (Exception unused) {
        }
    }

    public void OooO0o() {
        C4206od c4206od = this.OooO00o;
        if (c4206od != null) {
            c4206od.OooOOO(getClass().getCanonicalName());
        }
    }
}
