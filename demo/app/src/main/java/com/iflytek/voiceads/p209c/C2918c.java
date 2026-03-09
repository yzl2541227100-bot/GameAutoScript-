package com.iflytek.voiceads.p209c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import com.anythink.core.common.res.C1380d;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.iflytek.voiceads.bean.AdAudio;
import com.iflytek.voiceads.bean.AudioMonitor;
import com.iflytek.voiceads.conn.NativeDataRef;
import com.iflytek.voiceads.download.C2937d;
import com.iflytek.voiceads.listener.DialogListener;
import com.iflytek.voiceads.listener.IFLYNativeListener;
import com.iflytek.voiceads.p210d.C2920a;
import com.iflytek.voiceads.p210d.C2921b;
import com.iflytek.voiceads.param.C2966a;
import com.iflytek.voiceads.param.C2968c;
import com.iflytek.voiceads.request.C2978e;
import com.iflytek.voiceads.utils.C2984b;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2992j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.iflytek.voiceads.c.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2918c extends NativeDataRef {

    /* JADX INFO: renamed from: a */
    private Context f16179a;

    /* JADX INFO: renamed from: b */
    private C2920a f16180b;

    /* JADX INFO: renamed from: c */
    private C2921b f16181c;

    /* JADX INFO: renamed from: d */
    private String f16182d;

    /* JADX INFO: renamed from: e */
    private C2966a f16183e;

    /* JADX INFO: renamed from: f */
    private IFLYNativeListener f16184f;

    /* JADX INFO: renamed from: g */
    private boolean f16185g = false;

    /* JADX INFO: renamed from: h */
    private boolean f16186h = false;

    public C2918c(Context context, C2921b c2921b, C2966a c2966a, IFLYNativeListener iFLYNativeListener) {
        this.f16179a = context;
        this.f16181c = c2921b;
        this.f16180b = c2921b.f16233f;
        this.f16182d = c2921b.f16230c;
        this.f16183e = c2966a;
        this.f16184f = iFLYNativeListener;
    }

    /* JADX INFO: renamed from: a */
    private void m13288a() {
        String str = this.f16180b.f16199L;
        if (TextUtils.isEmpty(this.f16180b.f16198K)) {
            m13289a(str);
            return;
        }
        String str2 = this.f16180b.f16198K;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        if (!C2984b.m13536a(str2) || !C2984b.m13533a(this.f16179a.getApplicationContext(), intent)) {
            m13289a(str);
            C2992j.m13571b(C2968c.f16415b + "type=NotInstall&sid=" + this.f16182d);
            return;
        }
        try {
            intent.addFlags(32768);
            intent.addFlags(268435456);
            this.f16179a.startActivity(intent);
            C2992j.m13571b(C2968c.f16415b + "type=DeepLink&sid=" + this.f16182d);
        } catch (Exception e) {
            C2992j.m13571b(C2968c.f16415b + "type=DeepFail&sid=" + this.f16182d);
            C2989g.m13557b("IFLY_AD_SDK", "native deep" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m13289a(String str) {
        if (!URLUtil.isValidUrl(str) || str.equals(C1380d.f5563a)) {
            C2989g.m13555a("IFLY_AD_SDK", "Invalid click url: " + str);
        }
        switch (getActionType()) {
            case 3:
                m13290b("");
                break;
            default:
                C2978e.m13528a(this.f16179a, str, this.f16183e, this.f16182d);
                C2992j.m13571b(C2968c.f16415b + "type=H5Open&sid=" + this.f16182d);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m13290b(String str) {
        C2937d c2937dM13333a = C2937d.m13333a(this.f16179a.getApplicationContext());
        c2937dM13333a.m13367a((DialogListener) this.f16184f);
        c2937dM13333a.m13368a(this.f16183e.m13452c("download_alert"));
        if (TextUtils.isEmpty(str)) {
            c2937dM13333a.m13365a(this.f16179a, this.f16180b, new Object[0]);
            C2989g.m13555a("IFLY_AD_SDK", "startNativeDownload");
        } else {
            c2937dM13333a.m13365a(this.f16179a, this.f16180b, str);
            C2989g.m13555a("IFLY_AD_SDK", "startNativeDownload with url");
        }
    }

    public void downloadApp() {
        if (TextUtils.isEmpty(this.f16180b.f16221t)) {
            return;
        }
        m13290b(this.f16180b.f16221t);
    }

    public int getActionType() {
        return this.f16180b.f16200M;
    }

    public AdAudio getAdAudio() {
        if (this.f16180b.f16212k == null) {
            return null;
        }
        AdAudio adAudio = new AdAudio();
        adAudio.url = this.f16180b.f16212k.optString(C1781c.f10246am);
        if (this.f16180b.f16212k.has("duration")) {
            adAudio.duration = this.f16180b.f16212k.optInt("duration");
        }
        if (this.f16180b.f16212k.has("bitrate")) {
            adAudio.bitrate = this.f16180b.f16212k.optInt("bitrate");
        }
        if (this.f16180b.f16212k.has("format")) {
            adAudio.format = this.f16180b.f16212k.optInt("format");
        }
        if (!this.f16180b.f16212k.has("end_time")) {
            return adAudio;
        }
        adAudio.cacheDeadLine = this.f16180b.f16212k.optLong("end_time");
        return adAudio;
    }

    public String getAdSourceMark() {
        return this.f16180b.f16201N;
    }

    public String getAddress() {
        return this.f16180b.f16190C;
    }

    public String getAppName() {
        return this.f16180b.f16218q;
    }

    public double getAppSize() {
        return this.f16180b.f16224w;
    }

    public String getAppVer() {
        return this.f16180b.f16223v;
    }

    public AudioMonitor getAudioMonitor() {
        if (this.f16180b.f16212k == null || this.f16180b.f16197J == null) {
            return null;
        }
        AudioMonitor audioMonitor = new AudioMonitor();
        audioMonitor.start_urls = this.f16180b.f16197J.optJSONArray("start_urls");
        audioMonitor.first_quartile_urls = this.f16180b.f16197J.optJSONArray("first_quartile_urls");
        audioMonitor.mid_point_urls = this.f16180b.f16197J.optJSONArray("mid_point_urls");
        audioMonitor.third_quartile_urls = this.f16180b.f16197J.optJSONArray("third_quartile_urls");
        audioMonitor.complete_urls = this.f16180b.f16197J.optJSONArray("complete_urls");
        audioMonitor.pause_urls = this.f16180b.f16197J.optJSONArray("pause_urls");
        audioMonitor.resume_urls = this.f16180b.f16197J.optJSONArray("resume_urls");
        audioMonitor.skip_urls = this.f16180b.f16197J.optJSONArray("skip_urls");
        audioMonitor.mute_urls = this.f16180b.f16197J.optJSONArray("mute_urls");
        audioMonitor.unmute_urls = this.f16180b.f16197J.optJSONArray("unmute_urls");
        audioMonitor.replay_urls = this.f16180b.f16197J.optJSONArray("replay_urls");
        audioMonitor.close_urls = this.f16180b.f16197J.optJSONArray("close_linear_urls");
        return audioMonitor;
    }

    public String getBrand() {
        return this.f16180b.f16193F;
    }

    public String getContent() {
        return this.f16180b.f16216o;
    }

    public String getCtatext() {
        return this.f16180b.f16217p;
    }

    public double getCurrentPrice() {
        return this.f16180b.f16188A;
    }

    public String getDesc() {
        return this.f16180b.f16214m;
    }

    public ArrayList<String> getDisplayLabels() {
        if (this.f16180b.f16194G == null) {
            return null;
        }
        JSONArray jSONArray = this.f16180b.f16194G;
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        while (i < jSONArray.length()) {
            int i2 = i + 1;
            try {
                arrayList.add(jSONArray.getString(i));
                i = i2;
            } catch (JSONException e) {
                C2989g.m13557b("IFLY_AD_SDK", "get labels" + e.getMessage());
                i = i2;
            }
        }
        return arrayList;
    }

    public int getDownloads() {
        return this.f16180b.f16219r;
    }

    public String getIconUrl() {
        return (this.f16180b.f16215n == null || !this.f16180b.f16215n.has(C1781c.f10246am)) ? "" : this.f16180b.f16215n.optString(C1781c.f10246am);
    }

    public List<String> getImgList() {
        ArrayList arrayList = new ArrayList();
        if (this.f16180b.f16208g != null && this.f16180b.f16208g.has(C1781c.f10246am)) {
            arrayList.add(this.f16180b.f16208g.optString(C1781c.f10246am));
        }
        if (this.f16180b.f16209h != null && this.f16180b.f16209h.has(C1781c.f10246am)) {
            arrayList.add(this.f16180b.f16209h.optString(C1781c.f10246am));
        }
        if (this.f16180b.f16210i != null && this.f16180b.f16210i.has(C1781c.f10246am)) {
            arrayList.add(this.f16180b.f16210i.optString(C1781c.f10246am));
        }
        return arrayList;
    }

    public String getImgUrl() {
        return (this.f16180b.f16207f == null || !this.f16180b.f16207f.has(C1781c.f10246am)) ? "" : this.f16180b.f16207f.optString(C1781c.f10246am);
    }

    public int getLikes() {
        return this.f16180b.f16226y;
    }

    public double getOriginalPrice() {
        return this.f16180b.f16227z;
    }

    public String getPhone() {
        return this.f16180b.f16225x;
    }

    public String getRating() {
        return this.f16180b.f16220s;
    }

    public String getRequestID() {
        return this.f16181c.f16229b;
    }

    public String getSponsored() {
        return this.f16180b.f16189B;
    }

    public int getTemplateID() {
        return this.f16180b.f16202a;
    }

    public String getTitle() {
        return this.f16180b.f16213l;
    }

    public boolean isExposured() {
        return this.f16185g;
    }

    public boolean onClick(View view) {
        m13288a();
        if (this.f16186h) {
            return true;
        }
        try {
            if (this.f16185g) {
                C2992j.m13570a(this.f16180b.f16197J.optJSONArray("click_urls"), this.f16179a, 2);
                this.f16186h = true;
                return true;
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "native clk urls" + e.getMessage());
        }
        return false;
    }

    public boolean onExposure(View view) {
        if (this.f16185g) {
            C2989g.m13555a("IFLY_AD_SDK", "已曝光");
            return true;
        }
        if (!this.f16183e.m13452c("lock_screen_ad") && C2984b.m13537b(this.f16179a)) {
            C2989g.m13555a("IFLY_AD_SDK", "曝光失败-L");
            return false;
        }
        boolean zM13532a = C2984b.m13532a(this.f16179a);
        boolean z = view.getVisibility() == 0;
        boolean zIsShown = view.isShown();
        boolean zM13534a = C2984b.m13534a(this.f16179a, view);
        C2989g.m13555a("IFLY_AD_SDK", "曝光失败-: B:" + zM13532a + " V:" + z + " S:" + zIsShown + " I:" + zM13534a);
        if (zM13532a || !z || !zIsShown || !zM13534a) {
            return false;
        }
        try {
            JSONArray jSONArrayM13569a = C2992j.m13569a(this.f16183e.m13454e("auction_price"), this.f16180b.f16197J.optJSONArray("impress_urls"));
            if (jSONArrayM13569a == null) {
                C2989g.m13555a("IFLY_AD_SDK", "impArray null");
                return false;
            }
            this.f16185g = true;
            C2989g.m13555a("IFLY_AD_SDK", "曝光成功");
            C2992j.m13570a(jSONArrayM13569a, this.f16179a, 1);
            return true;
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "native imp urls" + e.getMessage());
            return false;
        }
    }

    public void showIntroduce() {
        if (TextUtils.isEmpty(this.f16180b.f16222u)) {
            return;
        }
        C2978e.m13528a(this.f16179a, this.f16180b.f16222u, this.f16183e, this.f16182d);
    }
}
