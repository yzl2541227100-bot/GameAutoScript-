package com.iflytek.voiceads.p209c;

import android.content.Context;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.listener.IFLYNativeListener;
import com.iflytek.voiceads.p210d.C2921b;
import com.iflytek.voiceads.param.C2966a;
import com.iflytek.voiceads.request.C2974a;
import com.iflytek.voiceads.request.C2979f;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.c.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2916a {

    /* JADX INFO: renamed from: b */
    private C2966a f16173b;

    /* JADX INFO: renamed from: c */
    private Context f16174c;

    /* JADX INFO: renamed from: d */
    private C2921b f16175d;

    /* JADX INFO: renamed from: e */
    private IFLYNativeListener f16176e;

    /* JADX INFO: renamed from: a */
    C2974a.a f16172a = new C2917b(this);

    /* JADX INFO: renamed from: f */
    private HandlerC2919d f16177f = new HandlerC2919d();

    public C2916a(Context context, String str, IFLYNativeListener iFLYNativeListener) {
        this.f16174c = context;
        this.f16176e = iFLYNativeListener;
        this.f16173b = new C2966a(str);
        this.f16175d = new C2921b(this.f16174c.getApplicationContext());
        this.f16177f.m13292a(this.f16176e);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m13284a() {
        try {
            try {
                C2979f.m13529a(this.f16174c.getApplicationContext(), this.f16173b, this.f16172a);
            } catch (Exception e) {
                C2989g.m13557b("IFLY_AD_SDK", e.getMessage());
            }
        } catch (AdError e2) {
            this.f16177f.m13291a(1, e2);
            C2989g.m13555a("IFLY_AD_SDK", e2.getErrorDescription());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13285a(String str, Object obj) {
        this.f16173b.m13447a(str, obj);
    }
}
