package com.p188b.p189a;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C2524aa {

    /* JADX INFO: renamed from: a */
    private final String[] f15455a;

    public C2524aa(C2525ab c2525ab) {
        List<String> list = c2525ab.f15456a;
        this.f15455a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: renamed from: a */
    public final int m12787a() {
        return this.f15455a.length / 2;
    }

    /* JADX INFO: renamed from: a */
    public final String m12788a(int i) {
        return this.f15455a[i * 2];
    }

    /* JADX INFO: renamed from: a */
    public final String m12789a(String str) {
        String[] strArr = this.f15455a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C2525ab m12790b() {
        C2525ab c2525ab = new C2525ab();
        Collections.addAll(c2525ab.f15456a, this.f15455a);
        return c2525ab;
    }

    /* JADX INFO: renamed from: b */
    public final String m12791b(int i) {
        return this.f15455a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2524aa) && Arrays.equals(((C2524aa) obj).f15455a, this.f15455a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15455a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f15455a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(m12788a(i));
            sb.append(": ");
            sb.append(m12791b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
