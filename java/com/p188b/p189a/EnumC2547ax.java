package com.p188b.p189a;

/* JADX INFO: renamed from: com.b.a.ax */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2547ax {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: f */
    public final String f15606f;

    EnumC2547ax(String str) {
        this.f15606f = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC2547ax m12915a(String str) {
        str.hashCode();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str)));
        }
    }
}
