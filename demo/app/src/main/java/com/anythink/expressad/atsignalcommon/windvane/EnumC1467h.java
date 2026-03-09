package com.anythink.expressad.atsignalcommon.windvane;

import com.anythink.expressad.video.signal.p176a.C2198f;
import com.tramini.plugin.p261a.p267f.C3341a;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.h */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1467h {
    JS(C2198f.f13924a, "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML(C3341a.f18138b, "text/html");


    /* JADX INFO: renamed from: j */
    private String f6777j;

    /* JADX INFO: renamed from: k */
    private String f6778k;

    EnumC1467h(String str, String str2) {
        this.f6777j = str;
        this.f6778k = str2;
    }

    /* JADX INFO: renamed from: a */
    private void m5690a(String str) {
        this.f6777j = str;
    }

    /* JADX INFO: renamed from: b */
    private void m5691b(String str) {
        this.f6778k = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m5692a() {
        return this.f6777j;
    }

    /* JADX INFO: renamed from: b */
    public final String m5693b() {
        return this.f6778k;
    }
}
