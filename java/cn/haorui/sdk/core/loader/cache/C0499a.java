package cn.haorui.sdk.core.loader.cache;

import android.os.SystemClock;
import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.cache.a */
/* JADX INFO: loaded from: classes.dex */
public class C0499a implements Comparable<C0499a> {

    /* JADX INFO: renamed from: a */
    public String f105a;

    /* JADX INFO: renamed from: b */
    public SdkAdInfo f106b;

    /* JADX INFO: renamed from: c */
    public int f107c;

    /* JADX INFO: renamed from: d */
    public Object f108d;

    /* JADX INFO: renamed from: e */
    public boolean f109e;

    /* JADX INFO: renamed from: f */
    public long f110f;

    /* JADX INFO: renamed from: g */
    public long f111g;

    /* JADX INFO: renamed from: h */
    public HRAdInfo f112h;

    /* JADX INFO: renamed from: a */
    public boolean m38a() {
        long j = this.f111g;
        return SystemClock.uptimeMillis() - (this.f109e ? this.f110f : this.f106b.getLoadedTime()) < ((j > 0L ? 1 : (j == 0L ? 0 : -1)) <= 0 ? 1740000L : j * 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(C0499a c0499a) {
        return c0499a.f107c - this.f107c;
    }

    public String toString() {
        return "CacheEntity{key =" + this.f105a + ",ad =" + this.f108d + ",sdkAdInfo=" + this.f106b.getSdk() + ", cacheScore=" + this.f107c + MessageFormatter.DELIM_STOP;
    }
}
