package com.king.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.king.sdk.p220a.C3028a;

/* JADX INFO: renamed from: com.king.sdk.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C3036i {

    /* JADX INFO: renamed from: b */
    private static C3036i f16633b;

    /* JADX INFO: renamed from: a */
    private InterfaceC3029b f16634a;

    private C3036i(InterfaceC3029b interfaceC3029b) {
        this.f16634a = interfaceC3029b;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C3036i m13774a(Context context) {
        InterfaceC3029b interfaceC3029bM13773a;
        C3036i c3036i = f16633b;
        if (c3036i != null) {
            return c3036i;
        }
        InterfaceC3029b interfaceC3029bM13742a = ServiceC3027a.m13742a();
        if (interfaceC3029bM13742a != null) {
            f16633b = new C3036i(interfaceC3029bM13742a);
        } else {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("GET_KING_SERVICE"));
            if (intentRegisterReceiver != null && (interfaceC3029bM13773a = AbstractBinderC3030c.m13773a(C3028a.m13743a(intentRegisterReceiver, "GET_KING_SERVICE"))) != null) {
                f16633b = new C3036i(interfaceC3029bM13773a);
            }
        }
        return f16633b;
    }

    /* JADX INFO: renamed from: a */
    public final void m13775a(IDFEE16B42C8B2890D8FF2860AF5562B1 idfee16b42c8b2890d8ff2860af5562b1) {
        try {
            this.f16634a.mo13751a(idfee16b42c8b2890d8ff2860af5562b1);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13776a(KingListener kingListener) {
        try {
            this.f16634a.mo13763b(kingListener);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13777a(String[] strArr, int i, String str, String str2) {
        try {
            this.f16634a.mo13757a(strArr, i, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13778a(String str, int i, byte[] bArr) {
        try {
            return this.f16634a.mo13759a(str, null, i, bArr, null, null);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13779a(String str, String str2) {
        try {
            return this.f16634a.mo13760a(str, null, str2, null, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
