package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.b.a.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C2525ab {

    /* JADX INFO: renamed from: a */
    public final List<String> f15456a = new ArrayList(20);

    /* JADX INFO: renamed from: d */
    private static void m12792d(String str, String str2) {
        Objects.requireNonNull(str, "name == null");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                throw new IllegalArgumentException(C2446c.m12576a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
        Objects.requireNonNull(str2, "value == null");
        int length2 = str2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt2 = str2.charAt(i2);
            if ((cCharAt2 <= 31 && cCharAt2 != '\t') || cCharAt2 >= 127) {
                throw new IllegalArgumentException(C2446c.m12576a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i2), str, str2));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C2524aa m12793a() {
        return new C2524aa(this);
    }

    /* JADX INFO: renamed from: a */
    public final C2525ab m12794a(String str) {
        int i = 0;
        while (i < this.f15456a.size()) {
            if (str.equalsIgnoreCase(this.f15456a.get(i))) {
                this.f15456a.remove(i);
                this.f15456a.remove(i);
                i -= 2;
            }
            i += 2;
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C2525ab m12795a(String str, String str2) {
        m12792d(str, str2);
        return m12796b(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final C2525ab m12796b(String str, String str2) {
        this.f15456a.add(str);
        this.f15456a.add(str2.trim());
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final C2525ab m12797c(String str, String str2) {
        m12792d(str, str2);
        m12794a(str);
        m12796b(str, str2);
        return this;
    }
}
