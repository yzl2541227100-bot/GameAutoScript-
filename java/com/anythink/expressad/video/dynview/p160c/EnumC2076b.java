package com.anythink.expressad.video.dynview.p160c;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.c.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2076b implements InterfaceC2075a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* JADX INFO: renamed from: g */
    private int f13218g;

    /* JADX INFO: renamed from: h */
    private String f13219h;

    EnumC2076b(int i, String str) {
        this.f13218g = i;
        this.f13219h = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m11123a() {
        return this.f13218g;
    }

    /* JADX INFO: renamed from: b */
    public final String m11124b() {
        return this.f13219h;
    }
}
