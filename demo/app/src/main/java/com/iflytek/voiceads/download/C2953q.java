package com.iflytek.voiceads.download;

import com.iflytek.voiceads.download.C2952p;
import com.iflytek.voiceads.download.p211a.InterfaceC2924a;
import com.iflytek.voiceads.download.p217e.C2941a;
import com.iflytek.voiceads.utils.C2989g;
import java.io.File;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.q */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
final class C2953q implements InterfaceC2924a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2952p.a f16341a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f16342b;

    C2953q(C2952p.a aVar, String str) {
        this.f16341a = aVar;
        this.f16342b = str;
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: a */
    public void mo13311a(int i) {
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: a */
    public void mo13312a(long j, long j2, int i) {
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: a */
    public void mo13313a(C2941a c2941a, int i) {
        C2989g.m13555a("IFLY_AD_SDK", "video cache failed");
        this.f16341a.mo13400a();
        File file = new File(this.f16342b);
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: b */
    public void mo13314b(int i) {
        C2989g.m13555a("IFLY_AD_SDK", "video cache success");
        this.f16341a.mo13401a(this.f16342b);
    }
}
