package com.octopus.p222ad.internal.p226b;

import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.p */
/* JADX INFO: loaded from: classes2.dex */
public class C3108p {

    /* JADX INFO: renamed from: a */
    public final String f17095a;

    /* JADX INFO: renamed from: b */
    public final int f17096b;

    /* JADX INFO: renamed from: c */
    public final String f17097c;

    public C3108p(String str, int i, String str2) {
        this.f17095a = str;
        this.f17096b = i;
        this.f17097c = str2;
    }

    public String toString() {
        return "SourceInfo{url='" + this.f17095a + "', length=" + this.f17096b + ", mime='" + this.f17097c + '\'' + MessageFormatter.DELIM_STOP;
    }
}
