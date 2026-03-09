package com.p188b.p189a.p190a.p193c;

import com.github.kevinsawicki.http.HttpRequest;
import p285z2.o000000O;

/* JADX INFO: renamed from: com.b.a.a.c.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2453g {
    /* JADX INFO: renamed from: a */
    public static boolean m12610a(String str) {
        return str.equals("POST") || str.equals(HttpRequest.METHOD_PUT) || str.equals(o000000O.OooO00o.OooO00o) || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12611b(String str) {
        return m12610a(str) || str.equals(HttpRequest.METHOD_OPTIONS) || str.equals(HttpRequest.METHOD_DELETE) || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }
}
