package com.iflytek.voiceads.download;

import android.content.Context;
import android.os.Environment;
import com.anythink.china.common.C1082d;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2994l;
import java.io.File;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.c */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2933c {

    /* JADX INFO: renamed from: a */
    private static final String f16272a = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "IFlyAdDownload";

    /* JADX INFO: renamed from: a */
    public static String m13327a(Context context) {
        try {
            File file = C2994l.m13577a(context, C1082d.f2502b) ? new File(f16272a) : new File(context.getFilesDir().getAbsolutePath() + File.separator + "IFlyAdDownload");
            if (!file.exists()) {
                file.mkdir();
            }
            long length = 0;
            for (File file2 : file.listFiles()) {
                length += file2.length();
            }
            if (length > 314572800) {
                C2923a.m13299a(context).mo13307b();
                for (File file3 : file.listFiles()) {
                    file3.delete();
                }
            }
            return file.getAbsolutePath();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "get pre path:" + e.getMessage());
            return "";
        }
    }
}
