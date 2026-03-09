package com.iflytek.voiceads.videolib;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.n */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C3012n {
    /* JADX INFO: renamed from: a */
    public static int m13676a(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public static Activity m13677a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m13677a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m13678a(long j) {
        if (j <= 0 || j >= 86400000) {
            return "00:00";
        }
        long j2 = j / 1000;
        int i = (int) (j2 % 60);
        int i2 = (int) ((j2 / 60) % 60);
        int i3 = (int) (j2 / C1485b.f6968P);
        Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
        return i3 > 0 ? formatter.format("%d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i)).toString() : formatter.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i)).toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m13679a(Context context, int i) {
        Activity activityM13677a = m13677a(context);
        if (activityM13677a != null) {
            activityM13677a.setRequestedOrientation(i);
        }
    }
}
