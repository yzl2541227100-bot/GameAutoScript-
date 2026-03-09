package com.octopus.p222ad;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: renamed from: com.octopus.ad.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3064a {

    /* JADX INFO: renamed from: a */
    public static final C3064a f16684a = new C3064a(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: b */
    public static final C3064a f16685b = new C3064a(468, 60, "468x60_as");

    /* JADX INFO: renamed from: c */
    public static final C3064a f16686c = new C3064a(320, 100, "320x100_as");

    /* JADX INFO: renamed from: d */
    public static final C3064a f16687d = new C3064a(728, 90, "728x90_as");

    /* JADX INFO: renamed from: e */
    public static final C3064a f16688e = new C3064a(300, 250, "300x250_as");

    /* JADX INFO: renamed from: f */
    public static final C3064a f16689f = new C3064a(160, 600, "160x600_as");

    /* JADX INFO: renamed from: g */
    public static final C3064a f16690g = new C3064a(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: h */
    public static final C3064a f16691h = new C3064a(-3, -4, "fluid");

    /* JADX INFO: renamed from: i */
    public static final C3064a f16692i = new C3064a(-3, 0, "search_v2");

    /* JADX INFO: renamed from: j */
    private final int f16693j;

    /* JADX INFO: renamed from: k */
    private final int f16694k;

    /* JADX INFO: renamed from: l */
    private final String f16695l;

    public C3064a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i == -1 ? "FULL" : String.valueOf(i));
        sb.append("x");
        sb.append(i2 == -2 ? "AUTO" : String.valueOf(i2));
        sb.append("_as");
        this(i, i2, sb.toString());
    }

    private C3064a(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        }
        if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f16693j = i;
            this.f16694k = i2;
            this.f16695l = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m13840a() {
        return this.f16694k;
    }

    /* JADX INFO: renamed from: a */
    public int m13841a(Context context) {
        int i = this.f16694k;
        if (i == -4 || i == -3) {
            return -1;
        }
        return i != -2 ? (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()) : context.getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX INFO: renamed from: b */
    public int m13842b() {
        return this.f16693j;
    }

    /* JADX INFO: renamed from: b */
    public int m13843b(Context context) {
        int i = this.f16693j;
        if (i == -4 || i == -3) {
            return -1;
        }
        return i != -1 ? (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()) : context.getResources().getDisplayMetrics().widthPixels;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3064a)) {
            return false;
        }
        C3064a c3064a = (C3064a) obj;
        return this.f16693j == c3064a.f16693j && this.f16694k == c3064a.f16694k && this.f16695l.equals(c3064a.f16695l);
    }

    public int hashCode() {
        return this.f16695l.hashCode();
    }

    public String toString() {
        return this.f16695l;
    }
}
