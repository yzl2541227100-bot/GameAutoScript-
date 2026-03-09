package cn.haorui.sdk.core.loader.loadbean;

import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.utils.HRConstants;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.loadbean.a */
/* JADX INFO: loaded from: classes.dex */
public class C0512a {

    /* JADX INFO: renamed from: a */
    public SdkAdInfo f152a;

    /* JADX INFO: renamed from: b */
    public Object f153b;

    /* JADX INFO: renamed from: e */
    public int f156e;

    /* JADX INFO: renamed from: g */
    public boolean f158g;

    /* JADX INFO: renamed from: h */
    public boolean f159h;

    /* JADX INFO: renamed from: c */
    public int f154c = 1;

    /* JADX INFO: renamed from: d */
    public int f155d = 0;

    /* JADX INFO: renamed from: f */
    public int f157f = -1;

    /* JADX INFO: renamed from: a */
    public int m54a() {
        if (!this.f158g) {
            if ("bidding".equals(this.f152a.getOtype())) {
                return this.f157f;
            }
            if ("order".equals(this.f152a.getOtype())) {
                return (this.f156e + 100000) - this.f152a.getScore();
            }
            if ("price".equals(this.f152a.getOtype())) {
                return this.f156e + this.f152a.getPrice();
            }
        }
        return this.f157f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmallGroupBean{platform =");
        sb.append(this.f158g ? HRConstants.PLATFORM_HR : this.f152a.getSdk());
        sb.append(", state=");
        sb.append(this.f154c);
        sb.append(", timeoutState=");
        sb.append(this.f155d);
        sb.append(", firstScore=");
        sb.append(this.f156e);
        sb.append(", secondScore=");
        sb.append(m54a());
        sb.append(", isMs=");
        sb.append(this.f158g);
        sb.append(", isCache=");
        sb.append(this.f159h);
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
