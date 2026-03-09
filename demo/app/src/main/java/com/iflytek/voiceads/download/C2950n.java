package com.iflytek.voiceads.download;

import com.iflytek.voiceads.download.p211a.InterfaceC2924a;
import com.iflytek.voiceads.download.p217e.C2941a;
import com.iflytek.voiceads.utils.C2989g;
import java.io.File;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.n */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2950n implements InterfaceC2924a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f16338a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C2937d f16339b;

    C2950n(C2937d c2937d, String str) {
        this.f16339b = c2937d;
        this.f16338a = str;
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: a */
    public void mo13311a(int i) {
        this.f16339b.m13336a(i);
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: a */
    public void mo13312a(long j, long j2, int i) {
        this.f16339b.m13337a(i, (int) ((100 * j) / j2));
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: a */
    public void mo13313a(C2941a c2941a, int i) {
        C2989g.m13555a("IFLY_AD_SDK", "download failed " + c2941a.getMessage());
        this.f16339b.m13353b(i);
        File file = new File(this.f16338a);
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: b */
    public void mo13314b(int i) {
        this.f16339b.m13353b(i);
        this.f16339b.m13339a(this.f16339b.f16280a, new File(this.f16338a));
    }
}
