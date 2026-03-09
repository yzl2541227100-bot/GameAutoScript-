package com.iflytek.voiceads.bridge;

import android.content.Context;
import android.os.CountDownTimer;
import com.iflytek.voiceads.download.C2933c;
import com.iflytek.voiceads.p207a.InterfaceC2892a;
import com.iflytek.voiceads.utils.C2989g;
import java.io.File;

/* JADX INFO: renamed from: com.iflytek.voiceads.bridge.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2902b {

    /* JADX INFO: renamed from: a */
    private Context f16145a;

    /* JADX INFO: renamed from: b */
    private DSBridgeWebView f16146b;

    /* JADX INFO: renamed from: c */
    private InterfaceC2892a f16147c;

    /* JADX INFO: renamed from: d */
    private a f16148d;

    /* JADX INFO: renamed from: e */
    private boolean f16149e;

    /* JADX INFO: renamed from: f */
    private String f16150f;

    /* JADX INFO: renamed from: com.iflytek.voiceads.bridge.b$a */
    class a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2902b f16151a;

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (this.f16151a.f16149e || this.f16151a.f16146b == null) {
                return;
            }
            this.f16151a.f16146b.m13268a("voiceRecordEnd", (Object[]) null, (InterfaceC2914n) null);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    public C2902b(Context context, DSBridgeWebView dSBridgeWebView) {
        this.f16145a = context;
        this.f16146b = dSBridgeWebView;
        this.f16150f = C2933c.m13327a(context) + File.separator + "voiceRecord.wav";
    }

    /* JADX INFO: renamed from: a */
    public void m13274a() {
        try {
            this.f16149e = true;
            if (this.f16148d != null) {
                this.f16148d = null;
            }
            if (this.f16147c != null) {
                this.f16147c.m13229a();
                this.f16147c = null;
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "stopRecordExcept:" + e.getMessage());
        }
    }
}
