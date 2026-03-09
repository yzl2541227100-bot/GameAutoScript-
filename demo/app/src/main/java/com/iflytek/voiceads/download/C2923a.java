package com.iflytek.voiceads.download;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.iflytek.voiceads.download.DownloadService;
import com.iflytek.voiceads.download.p211a.InterfaceC2925b;
import com.iflytek.voiceads.download.p212b.C2929b;
import com.iflytek.voiceads.download.p212b.C2932d;
import com.iflytek.voiceads.download.p212b.InterfaceC2927a;
import com.iflytek.voiceads.download.p215c.C2935b;
import com.iflytek.voiceads.download.p215c.InterfaceC2934a;
import com.iflytek.voiceads.download.p216d.C2938a;
import com.iflytek.voiceads.utils.C2989g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2923a implements InterfaceC2925b, C2932d.a {

    /* JADX INFO: renamed from: a */
    private static C2923a f16239a;

    /* JADX INFO: renamed from: e */
    private InterfaceC2927a f16243e;

    /* JADX INFO: renamed from: f */
    private InterfaceC2934a f16244f;

    /* JADX INFO: renamed from: g */
    private Context f16245g;

    /* JADX INFO: renamed from: h */
    private C2938a f16246h;

    /* JADX INFO: renamed from: i */
    private DownloadService.BinderC2922a f16247i;

    /* JADX INFO: renamed from: j */
    private ServiceConnection f16248j = new ServiceConnectionC2926b(this);

    /* JADX INFO: renamed from: d */
    private List<C2938a> f16242d = new ArrayList();

    /* JADX INFO: renamed from: c */
    private ConcurrentHashMap<Integer, Object> f16241c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private ExecutorService f16240b = Executors.newFixedThreadPool(2);

    private C2923a(Context context) {
        this.f16245g = context;
        this.f16244f = new C2935b(context);
        this.f16243e = new C2929b(this.f16244f);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2925b m13299a(Context context) {
        synchronized (C2923a.class) {
            if (f16239a == null) {
                f16239a = new C2923a(context);
            }
        }
        return f16239a;
    }

    /* JADX INFO: renamed from: c */
    private void m13302c() {
        for (C2938a c2938a : this.f16242d) {
            if (c2938a.m13386g() == 3) {
                m13303e(c2938a);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m13303e(C2938a c2938a) {
        if (this.f16241c.size() >= 2) {
            c2938a.m13371a(3);
            this.f16243e.mo13315a(c2938a);
            return;
        }
        C2932d c2932d = new C2932d(this.f16240b, this.f16243e, c2938a, this);
        this.f16241c.put(Integer.valueOf(c2938a.m13387h()), c2932d);
        c2938a.m13371a(1);
        this.f16243e.mo13315a(c2938a);
        c2932d.m13326a();
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2925b
    /* JADX INFO: renamed from: a */
    public C2938a mo13304a(int i) {
        return this.f16244f.mo13328a(i);
    }

    /* JADX INFO: renamed from: a */
    public List<C2938a> m13305a() {
        return this.f16244f.mo13329a();
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2925b
    /* JADX INFO: renamed from: a */
    public void mo13306a(C2938a c2938a) {
        this.f16246h = c2938a;
        if (this.f16247i != null) {
            this.f16247i.m13297a(c2938a);
            return;
        }
        try {
            Class.forName("com.iflytek.voiceads.download.DownloadService");
            Intent intent = new Intent(this.f16245g, (Class<?>) DownloadService.class);
            this.f16245g.startService(intent);
            this.f16245g.bindService(intent, this.f16248j, 1);
        } catch (ClassNotFoundException e) {
            C2989g.m13557b("IFLY_AD_SDK", "service not found");
        }
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2925b
    /* JADX INFO: renamed from: b */
    public void mo13307b() {
        try {
            for (C2938a c2938a : m13305a()) {
                File file = new File(c2938a.m13382c());
                if (file.exists() && file.delete()) {
                    this.f16244f.mo13331b(c2938a);
                }
            }
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "clearAllDownloaded:" + e.getMessage());
        }
    }

    @Override // com.iflytek.voiceads.download.p211a.InterfaceC2925b
    /* JADX INFO: renamed from: b */
    public void mo13308b(C2938a c2938a) {
        this.f16242d.add(c2938a);
        m13303e(c2938a);
    }

    @Override // com.iflytek.voiceads.download.p212b.C2932d.a
    /* JADX INFO: renamed from: c */
    public void mo13309c(C2938a c2938a) {
        if (c2938a != null) {
            this.f16241c.remove(Integer.valueOf(c2938a.m13387h()));
            this.f16242d.remove(c2938a);
        }
        m13302c();
    }

    @Override // com.iflytek.voiceads.download.p212b.C2932d.a
    /* JADX INFO: renamed from: d */
    public void mo13310d(C2938a c2938a) {
        if (c2938a != null) {
            this.f16241c.remove(Integer.valueOf(c2938a.m13387h()));
            this.f16242d.remove(c2938a);
        }
    }
}
