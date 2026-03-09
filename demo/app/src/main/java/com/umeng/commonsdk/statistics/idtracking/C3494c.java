package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.C3485a;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3494c extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19210a = "idfa";

    /* JADX INFO: renamed from: b */
    private Context f19211b;

    public C3494c(Context context) {
        super("idfa");
        this.f19211b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        String strM16293a = C3485a.m16293a(this.f19211b);
        return strM16293a == null ? "" : strM16293a;
    }
}
