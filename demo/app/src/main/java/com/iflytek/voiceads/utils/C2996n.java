package com.iflytek.voiceads.utils;

import android.os.Environment;
import java.io.File;

/* JADX INFO: renamed from: com.iflytek.voiceads.utils.n */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2996n {
    C2996n() {
    }

    /* JADX INFO: renamed from: a */
    public boolean m13579a() throws Throwable {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (!externalStorageDirectory.exists() || !externalStorageDirectory.canWrite()) {
            return false;
        }
        File file = new File(externalStorageDirectory, "Android");
        if (file.exists() && file.isFile() && !file.delete()) {
            return false;
        }
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        File file2 = new File(file, "ANDROID.PERMISSION.TEST");
        return file2.exists() ? file2.delete() : file2.createNewFile();
    }
}
