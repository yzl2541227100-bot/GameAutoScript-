package com.iflytek.voiceads.download;

import android.content.Context;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.iflytek.voiceads.download.p211a.InterfaceC2925b;
import com.iflytek.voiceads.download.p216d.C2938a;
import com.iflytek.voiceads.utils.C2986d;
import com.iflytek.voiceads.utils.C2989g;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.p */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2952p {

    /* JADX INFO: renamed from: com.iflytek.voiceads.download.p$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo13400a();

        /* JADX INFO: renamed from: a */
        void mo13401a(String str);
    }

    /* JADX INFO: renamed from: a */
    public static void m13399a(Context context, JSONObject jSONObject, a aVar) {
        String str;
        if (context == null || jSONObject == null) {
            return;
        }
        try {
            try {
                Class.forName("com.iflytek.voiceads.download.DownloadService");
                String str2 = C2933c.m13327a(context) + File.separator;
                String strOptString = jSONObject.optString(C1781c.f10246am);
                String strM13546a = C2986d.m13546a(strOptString);
                switch (jSONObject.optInt("format")) {
                    case 0:
                        str = ".mp4";
                        break;
                    case 1:
                        str = ".3gp";
                        break;
                    case 2:
                        str = ".avi";
                        break;
                    case 3:
                        str = ".flv";
                        break;
                    default:
                        str = ".mp4";
                        break;
                }
                String str3 = str2 + strM13546a + str;
                int iAbs = Math.abs(strOptString.hashCode());
                InterfaceC2925b interfaceC2925bM13299a = C2923a.m13299a(context);
                C2938a c2938aMo13304a = interfaceC2925bM13299a.mo13304a(iAbs);
                if (c2938aMo13304a != null) {
                    aVar.mo13401a(c2938aMo13304a.m13382c());
                } else {
                    C2938a c2938aM13392a = new C2938a.a().m13391a(strOptString).m13393b(str3).m13392a();
                    c2938aM13392a.m13373a(new C2953q(aVar, str3));
                    interfaceC2925bM13299a.mo13306a(c2938aM13392a);
                }
            } catch (ClassNotFoundException e) {
                C2989g.m13557b("IFLY_AD_SDK", "service not found");
            }
        } catch (Exception e2) {
            C2989g.m13557b("IFLY_AD_SDK", "startCache:" + e2.getMessage());
        }
    }
}
