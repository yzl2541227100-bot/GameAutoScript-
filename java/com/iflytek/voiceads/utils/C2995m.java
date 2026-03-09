package com.iflytek.voiceads.utils;

import android.content.Context;
import android.media.MediaRecorder;
import java.io.File;
import p285z2.InterfaceC4047k3;

/* JADX INFO: renamed from: com.iflytek.voiceads.utils.m */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2995m {

    /* JADX INFO: renamed from: a */
    private Context f16469a;

    C2995m(Context context) {
        this.f16469a = context;
    }

    /* JADX INFO: renamed from: a */
    public boolean m13578a() throws Throwable {
        File fileCreateTempFile = null;
        MediaRecorder mediaRecorder = new MediaRecorder();
        try {
            try {
                fileCreateTempFile = File.createTempFile("permission", InterfaceC4047k3.o0000Ooo);
                mediaRecorder.setAudioSource(1);
                mediaRecorder.setOutputFormat(3);
                mediaRecorder.setAudioEncoder(1);
                mediaRecorder.setOutputFile(fileCreateTempFile.getAbsolutePath());
                mediaRecorder.prepare();
                mediaRecorder.start();
                try {
                    mediaRecorder.stop();
                } catch (Exception e) {
                }
                try {
                    mediaRecorder.release();
                } catch (Exception e2) {
                }
                if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                    fileCreateTempFile.delete();
                }
            } finally {
            }
        } catch (Throwable th) {
            z = this.f16469a.getPackageManager().hasSystemFeature("android.hardware.microphone") ? false : true;
            try {
                mediaRecorder.stop();
            } catch (Exception e3) {
            }
            try {
                mediaRecorder.release();
            } catch (Exception e4) {
            }
            if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                fileCreateTempFile.delete();
            }
        }
        return z;
    }
}
