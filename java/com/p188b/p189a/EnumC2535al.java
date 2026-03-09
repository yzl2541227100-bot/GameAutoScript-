package com.p188b.p189a;

import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.al */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2535al {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* JADX INFO: renamed from: e */
    private final String f15546e;

    EnumC2535al(String str) {
        this.f15546e = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC2535al m12857a(String str) throws IOException {
        EnumC2535al enumC2535al = HTTP_1_0;
        if (str.equals(enumC2535al.f15546e)) {
            return enumC2535al;
        }
        EnumC2535al enumC2535al2 = HTTP_1_1;
        if (str.equals(enumC2535al2.f15546e)) {
            return enumC2535al2;
        }
        EnumC2535al enumC2535al3 = HTTP_2;
        if (str.equals(enumC2535al3.f15546e)) {
            return enumC2535al3;
        }
        EnumC2535al enumC2535al4 = SPDY_3;
        if (str.equals(enumC2535al4.f15546e)) {
            return enumC2535al4;
        }
        throw new IOException("Unexpected protocol: ".concat(String.valueOf(str)));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f15546e;
    }
}
