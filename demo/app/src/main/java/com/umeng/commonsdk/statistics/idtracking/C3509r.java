package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.r */
/* JADX INFO: loaded from: classes2.dex */
public class C3509r extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    public static final String f19259a = "uopdta";

    /* JADX INFO: renamed from: b */
    private static final String f19260b = "uop";

    /* JADX INFO: renamed from: c */
    private Context f19261c;

    public C3509r(Context context) {
        super(f19260b);
        this.f19261c = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f19261c);
        return sharedPreferences != null ? sharedPreferences.getString(f19259a, "") : "";
    }
}
