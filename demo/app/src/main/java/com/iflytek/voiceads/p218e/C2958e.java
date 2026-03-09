package com.iflytek.voiceads.p218e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import com.anythink.core.common.res.C1380d;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.iflytek.voiceads.conn.VideoDataRef;
import com.iflytek.voiceads.download.C2937d;
import com.iflytek.voiceads.listener.DialogListener;
import com.iflytek.voiceads.listener.IFLYVideoListener;
import com.iflytek.voiceads.p210d.C2920a;
import com.iflytek.voiceads.p210d.C2921b;
import com.iflytek.voiceads.param.C2966a;
import com.iflytek.voiceads.param.C2968c;
import com.iflytek.voiceads.request.C2978e;
import com.iflytek.voiceads.utils.C2984b;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2992j;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.iflytek.voiceads.e.e */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2958e extends VideoDataRef {

    /* JADX INFO: renamed from: a */
    private Context f16357a;

    /* JADX INFO: renamed from: b */
    private C2920a f16358b;

    /* JADX INFO: renamed from: c */
    private C2921b f16359c;

    /* JADX INFO: renamed from: d */
    private String f16360d;

    /* JADX INFO: renamed from: e */
    private C2966a f16361e;

    /* JADX INFO: renamed from: f */
    private IFLYVideoListener f16362f;

    /* JADX INFO: renamed from: g */
    private boolean f16363g = false;

    /* JADX INFO: renamed from: h */
    private boolean f16364h = false;

    public C2958e(Context context, C2921b c2921b, C2966a c2966a, IFLYVideoListener iFLYVideoListener) {
        this.f16357a = context;
        this.f16359c = c2921b;
        this.f16358b = c2921b.f16233f;
        this.f16360d = c2921b.f16230c;
        this.f16361e = c2966a;
        this.f16362f = iFLYVideoListener;
    }

    /* JADX INFO: renamed from: a */
    private void m13428a() {
        String str = this.f16358b.f16199L;
        if (TextUtils.isEmpty(this.f16358b.f16198K)) {
            m13429a(str);
            return;
        }
        String str2 = this.f16358b.f16198K;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        if (!C2984b.m13536a(str2) || !C2984b.m13533a(this.f16357a.getApplicationContext(), intent)) {
            m13429a(str);
            C2992j.m13571b(C2968c.f16415b + "type=NotInstall&sid=" + this.f16360d);
            return;
        }
        try {
            intent.addFlags(32768);
            intent.addFlags(268435456);
            this.f16357a.startActivity(intent);
            C2992j.m13571b(C2968c.f16415b + "type=DeepLink&sid=" + this.f16360d);
        } catch (Exception e) {
            C2992j.m13571b(C2968c.f16415b + "type=DeepFail&sid=" + this.f16360d);
            C2989g.m13557b("IFLY_AD_SDK", "video deep" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m13429a(String str) {
        if (!URLUtil.isValidUrl(str) || str.equals(C1380d.f5563a)) {
            C2989g.m13555a("IFLY_AD_SDK", "Invalid click url: " + str);
        }
        switch (getActionType()) {
            case 3:
                m13430b("");
                break;
            default:
                C2978e.m13528a(this.f16357a, str, this.f16361e, this.f16360d);
                C2992j.m13571b(C2968c.f16415b + "type=H5Open&sid=" + this.f16360d);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m13430b(String str) {
        C2937d c2937dM13333a = C2937d.m13333a(this.f16357a.getApplicationContext());
        c2937dM13333a.m13367a((DialogListener) this.f16362f);
        c2937dM13333a.m13368a(this.f16361e.m13452c("download_alert"));
        if (TextUtils.isEmpty(str)) {
            c2937dM13333a.m13365a(this.f16357a, this.f16358b, new Object[0]);
            C2989g.m13555a("IFLY_AD_SDK", "startVideoDownload");
        } else {
            c2937dM13333a.m13365a(this.f16357a, this.f16358b, str);
            C2989g.m13555a("IFLY_AD_SDK", "startVideoDownload with url");
        }
    }

    public void downloadApp() {
        if (TextUtils.isEmpty(this.f16358b.f16221t)) {
            return;
        }
        m13430b(this.f16358b.f16221t);
    }

    public int getActionType() {
        return this.f16358b.f16200M;
    }

    public String getAdSourceMark() {
        return this.f16358b.f16201N;
    }

    public String getBrand() {
        return this.f16358b.f16193F;
    }

    public String getContent() {
        return this.f16358b.f16216o;
    }

    public String getCtatext() {
        return this.f16358b.f16217p;
    }

    public String getDesc() {
        return this.f16358b.f16214m;
    }

    public int getDuration() {
        if (this.f16358b.f16211j == null || !this.f16358b.f16211j.has("duration")) {
            return 0;
        }
        return this.f16358b.f16211j.optInt("duration");
    }

    public int getHeight() {
        if (this.f16358b.f16211j == null || !this.f16358b.f16211j.has("height")) {
            return 0;
        }
        return this.f16358b.f16211j.optInt("height");
    }

    public String getIconUrl() {
        return (this.f16358b.f16215n == null || !this.f16358b.f16215n.has(C1781c.f10246am)) ? "" : this.f16358b.f16215n.optString(C1781c.f10246am);
    }

    public String getImgUrl() {
        return (this.f16358b.f16207f == null || !this.f16358b.f16207f.has(C1781c.f10246am)) ? "" : this.f16358b.f16207f.optString(C1781c.f10246am);
    }

    public String getRequestID() {
        return this.f16359c.f16229b;
    }

    public int getTemplateID() {
        return this.f16358b.f16202a;
    }

    public String getTitle() {
        return this.f16358b.f16213l;
    }

    public int getWidth() {
        if (this.f16358b.f16211j == null || !this.f16358b.f16211j.has("width")) {
            return 0;
        }
        return this.f16358b.f16211j.optInt("width");
    }

    public boolean isExposured() {
        return this.f16363g;
    }

    public boolean onClick(View view) {
        try {
            m13428a();
            if (this.f16364h) {
                return true;
            }
            if (this.f16363g) {
                C2992j.m13570a(this.f16358b.f16197J.optJSONArray("click_urls"), this.f16357a, 2);
                this.f16364h = true;
                return true;
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "video clk urls" + e.getMessage());
        }
        return false;
    }

    public boolean onExposure(View view) {
        if (this.f16363g) {
            C2989g.m13555a("IFLY_AD_SDK", "已曝光");
            return true;
        }
        boolean zM13532a = C2984b.m13532a(this.f16357a);
        boolean zM13537b = C2984b.m13537b(this.f16357a);
        boolean z = view.getVisibility() == 0;
        boolean zIsShown = view.isShown();
        boolean zM13534a = C2984b.m13534a(this.f16357a, view);
        C2989g.m13555a("IFLY_AD_SDK", "曝光失败-: B:" + zM13532a + " L:" + zM13537b + " V:" + z + " S:" + zIsShown + " I:" + zM13534a);
        if (zM13532a || zM13537b || !z || !zIsShown || !zM13534a) {
            return false;
        }
        try {
            JSONArray jSONArrayM13569a = C2992j.m13569a(this.f16361e.m13454e("auction_price"), this.f16358b.f16197J.optJSONArray("impress_urls"));
            if (jSONArrayM13569a == null) {
                C2989g.m13555a("IFLY_AD_SDK", "impArray null");
                return false;
            }
            this.f16363g = true;
            C2989g.m13555a("IFLY_AD_SDK", "曝光成功");
            C2992j.m13570a(jSONArrayM13569a, this.f16357a, 1);
            return true;
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "video imp urls" + e.getMessage());
            return false;
        }
    }

    public void showIntroduce() {
        if (TextUtils.isEmpty(this.f16358b.f16222u)) {
            return;
        }
        C2978e.m13528a(this.f16357a, this.f16358b.f16222u, this.f16361e, this.f16360d);
    }
}
