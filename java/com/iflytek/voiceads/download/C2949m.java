package com.iflytek.voiceads.download;

import com.iflytek.voiceads.download.C2937d;
import com.iflytek.voiceads.download.p211a.InterfaceC2924a;
import com.iflytek.voiceads.download.p217e.C2941a;
import com.iflytek.voiceads.utils.C2989g;
import java.io.File;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.m */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C2949m implements InterfaceC2924a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C2937d.b f16335a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f16336b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C2937d f16337c;

    C2949m(C2937d c2937d, C2937d.b bVar, String str) {
        this.f16337c = c2937d;
        this.f16335a = bVar;
        this.f16336b = str;
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: a */
    public void mo13311a(int i) {
        this.f16337c.m13336a(i);
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: a */
    public void mo13312a(long j, long j2, int i) {
        this.f16337c.m13337a(i, (int) ((100 * j) / j2));
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: a */
    public void mo13313a(C2941a c2941a, int i) {
        C2989g.m13555a("IFLY_AD_SDK", "download failed " + c2941a.getMessage());
        this.f16337c.m13353b(i);
        this.f16337c.f16282c.remove(this.f16335a.f16297b);
        File file = new File(this.f16336b);
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2924a
    /* JADX INFO: renamed from: b */
    public void mo13314b(int i) {
        this.f16337c.m13352b();
        this.f16337c.m13353b(i);
        this.f16337c.f16282c.remove(this.f16335a.f16297b);
        this.f16337c.f16283d.put(this.f16335a.f16297b, this.f16335a);
        this.f16337c.m13356b(this.f16335a.f16297b);
        this.f16337c.m13361c(this.f16335a.f16297b);
        this.f16337c.m13339a(this.f16337c.f16280a, new File(this.f16336b));
    }
}
