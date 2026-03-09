package com.goldcoast.sdk.p206c;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: renamed from: com.goldcoast.sdk.c.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C2741g {

    /* JADX INFO: renamed from: a */
    private static C2741g f16007a;

    /* JADX INFO: renamed from: b */
    private static Context f16008b;

    /* JADX INFO: renamed from: c */
    private static boolean f16009c;

    private C2741g() {
    }

    /* JADX INFO: renamed from: a */
    public static C2741g m13175a() {
        if (f16007a == null) {
            f16007a = new C2741g();
        }
        return f16007a;
    }

    /* JADX INFO: renamed from: a */
    public static void m13176a(Context context) {
        f16008b = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m13177a(String str) {
        if (f16009c) {
            Log.i("GOLD_COAST", str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13178b(String str) {
        try {
            FileWriter fileWriter = new FileWriter(new File(f16008b.getFilesDir().getAbsolutePath() + File.separator + "dump"), true);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
