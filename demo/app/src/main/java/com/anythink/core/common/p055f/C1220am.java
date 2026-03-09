package com.anythink.core.common.p055f;

import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.core.common.f.am */
/* JADX INFO: loaded from: classes.dex */
public final class C1220am {

    /* JADX INFO: renamed from: a */
    private String f3844a;

    /* JADX INFO: renamed from: b */
    private String f3845b;

    /* JADX INFO: renamed from: c */
    private String f3846c;

    /* JADX INFO: renamed from: d */
    private String f3847d;

    /* JADX INFO: renamed from: e */
    private int f3848e;

    /* JADX INFO: renamed from: f */
    private Map<String, Object> f3849f;

    /* JADX INFO: renamed from: g */
    private Map<String, Object> f3850g;

    /* JADX INFO: renamed from: h */
    private Map<String, String> f3851h;

    public C1220am(String str, String str2, String str3, String str4, Map<String, Object> map, Map<String, Object> map2) {
        this.f3844a = str;
        this.f3845b = str2;
        this.f3846c = str3;
        this.f3847d = str4;
        this.f3849f = map;
        this.f3850g = map2;
    }

    /* JADX INFO: renamed from: a */
    private void m2584a(String str) {
        this.f3844a = str;
    }

    /* JADX INFO: renamed from: b */
    private void m2585b(String str) {
        this.f3845b = str;
    }

    /* JADX INFO: renamed from: b */
    private void m2586b(Map<String, Object> map) {
        this.f3849f = map;
    }

    /* JADX INFO: renamed from: c */
    private void m2587c(String str) {
        this.f3846c = str;
    }

    /* JADX INFO: renamed from: c */
    private void m2588c(Map<String, Object> map) {
        this.f3850g = map;
    }

    /* JADX INFO: renamed from: d */
    private void m2589d(String str) {
        this.f3847d = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m2590a() {
        return this.f3844a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2591a(int i) {
        this.f3848e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m2592a(Map<String, String> map) {
        this.f3851h = map;
    }

    /* JADX INFO: renamed from: b */
    public final String m2593b() {
        return this.f3845b;
    }

    /* JADX INFO: renamed from: c */
    public final String m2594c() {
        return this.f3846c;
    }

    /* JADX INFO: renamed from: d */
    public final String m2595d() {
        return this.f3847d;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, Object> m2596e() {
        return this.f3849f;
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> m2597f() {
        return this.f3850g;
    }

    /* JADX INFO: renamed from: g */
    public final int m2598g() {
        return this.f3848e;
    }

    /* JADX INFO: renamed from: h */
    public final Map<String, String> m2599h() {
        return this.f3851h;
    }

    public final String toString() {
        return "PlaceStrategyLoaderParams{appId='" + this.f3844a + "', appKey='" + this.f3845b + "', placeId='" + this.f3846c + "', settingId='" + this.f3847d + "', fistReqPlaceStrategyFlag=" + this.f3848e + ", customMap=" + this.f3849f + ", tkExtraMap=" + this.f3850g + ", cachedMap=" + this.f3851h + MessageFormatter.DELIM_STOP;
    }
}
