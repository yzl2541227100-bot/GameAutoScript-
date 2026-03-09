package com.anythink.china.common;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.anythink.china.activity.TransparentActivity;
import java.util.Random;

/* JADX INFO: renamed from: com.anythink.china.common.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1082d {

    /* JADX INFO: renamed from: a */
    public static final String f2501a = "android.permission.READ_PHONE_STATE";

    /* JADX INFO: renamed from: b */
    public static final String f2502b = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* JADX INFO: renamed from: com.anythink.china.common.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m1558a();
    }

    /* JADX INFO: renamed from: a */
    private static void m1556a(Context context, a aVar, String... strArr) {
        if (context == null || Build.VERSION.SDK_INT < 23) {
            Log.i("PermissionManager", "Build.VERSION.SDK_INT below 23 does not require permission");
            return;
        }
        int iNextInt = new Random().nextInt(1000000000);
        if (aVar != null) {
            TransparentActivity.f2337e.put(Integer.valueOf(iNextInt), aVar);
        }
        Intent intent = new Intent(context, (Class<?>) TransparentActivity.class);
        intent.putExtra("type", 1000);
        intent.putExtra(TransparentActivity.f2334b, iNextInt);
        intent.putExtra(TransparentActivity.f2336d, strArr);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1557a(Context context, String str) {
        try {
            return ContextCompat.checkSelfPermission(context, str) == 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
