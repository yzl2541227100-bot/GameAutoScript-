package com.octopus.p222ad.utils;

import android.content.Context;
import com.octopus.p222ad.utils.p258b.C3255f;

/* JADX INFO: renamed from: com.octopus.ad.utils.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3264e {

    /* JADX INFO: renamed from: c */
    private static C3264e f17911c;

    /* JADX INFO: renamed from: a */
    public C3265f f17912a;

    /* JADX INFO: renamed from: b */
    private String f17913b = "OnLineState";

    private C3264e(Context context) {
        if (context == null) {
            C3255f.m14983c("OnLineState", "OnLineState init failed,because context cann't be null ");
            return;
        }
        C3265f c3265f = new C3265f();
        this.f17912a = c3265f;
        c3265f.m15035a(context);
    }

    /* JADX INFO: renamed from: a */
    public static C3264e m15018a(Context context) {
        if (f17911c == null) {
            synchronized (C3264e.class) {
                if (f17911c == null) {
                    f17911c = new C3264e(context);
                }
            }
        }
        return f17911c;
    }

    /* JADX INFO: renamed from: a */
    public void m15019a(InterfaceC3263d interfaceC3263d) {
        C3265f c3265f = this.f17912a;
        if (c3265f != null) {
            c3265f.m15036a(interfaceC3263d);
        } else {
            C3255f.m14981a(this.f17913b, "please init OnLineState first ,you can init it with 'OnLineState.init(context);' in you BaseApplication ");
        }
    }
}
