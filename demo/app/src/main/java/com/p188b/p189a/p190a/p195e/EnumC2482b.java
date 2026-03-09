package com.p188b.p189a.p190a.p195e;

/* JADX INFO: renamed from: com.b.a.a.e.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2482b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);


    /* JADX INFO: renamed from: g */
    public final int f15293g;

    EnumC2482b(int i) {
        this.f15293g = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC2482b m12697a(int i) {
        for (EnumC2482b enumC2482b : values()) {
            if (enumC2482b.f15293g == i) {
                return enumC2482b;
            }
        }
        return null;
    }
}
