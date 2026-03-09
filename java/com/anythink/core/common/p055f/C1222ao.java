package com.anythink.core.common.p055f;

import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.core.common.f.ao */
/* JADX INFO: loaded from: classes.dex */
public final class C1222ao {

    /* JADX INFO: renamed from: a */
    public int f3860a;

    /* JADX INFO: renamed from: b */
    public String f3861b;

    /* JADX INFO: renamed from: c */
    public int f3862c;

    /* JADX INFO: renamed from: d */
    public int f3863d;

    /* JADX INFO: renamed from: e */
    public long f3864e;

    /* JADX INFO: renamed from: f */
    public String f3865f;

    /* JADX INFO: renamed from: g */
    public String f3866g;

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, a> f3867h;

    /* JADX INFO: renamed from: com.anythink.core.common.f.ao$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f3868a;

        /* JADX INFO: renamed from: b */
        public String f3869b;

        /* JADX INFO: renamed from: c */
        public String f3870c;

        /* JADX INFO: renamed from: d */
        public int f3871d;

        /* JADX INFO: renamed from: e */
        public int f3872e;

        /* JADX INFO: renamed from: f */
        public long f3873f;

        public final String toString() {
            return "AdSourceImpressionInfo{unitId='" + this.f3868a + "', hourTimeFormat='" + this.f3869b + "', dateTimeFormat='" + this.f3870c + "', dayShowCount=" + this.f3871d + ", hourShowCount=" + this.f3872e + ", showTime=" + this.f3873f + MessageFormatter.DELIM_STOP;
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m2616a(String str) {
        ConcurrentHashMap<String, a> concurrentHashMap = this.f3867h;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2617a(String str, a aVar) {
        if (this.f3867h == null) {
            this.f3867h = new ConcurrentHashMap<>(3);
        }
        this.f3867h.put(str, aVar);
    }

    public final String toString() {
        return "PlacementImpressionInfo{format=" + this.f3860a + ", placementId='" + this.f3861b + "', dayShowCount=" + this.f3862c + ", hourShowCount=" + this.f3863d + ", showTime=" + this.f3864e + ", hourTimeFormat='" + this.f3865f + "', dateTimeFormat='" + this.f3866g + '\'' + MessageFormatter.DELIM_STOP;
    }
}
