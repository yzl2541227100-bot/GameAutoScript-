package com.octopus.p222ad.utils.p258b;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.anythink.china.common.C1082d;

/* JADX INFO: renamed from: com.octopus.ad.utils.b.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C3260k {
    /* JADX INFO: renamed from: a */
    public static boolean m14997a(Context context) {
        return ContextCompat.checkSelfPermission(context, C1082d.f2502b) == 0 && ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}
