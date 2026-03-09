package cn.haorui.sdk.core.oaid.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.p */
/* JADX INFO: loaded from: classes.dex */
public class C0536p implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f208a;

    /* JADX INFO: renamed from: b */
    public Class<?> f209b;

    /* JADX INFO: renamed from: c */
    public Object f210c;

    @SuppressLint({"PrivateApi"})
    public C0536p(Context context) {
        this.f208a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.f209b = cls;
            this.f210c = cls.newInstance();
        } catch (Exception unused) {
        }
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f208a == null || interfaceC0519a == null) {
            return;
        }
        Class<?> cls = this.f209b;
        if (cls == null || this.f210c == null) {
            new OAIDException("Xiaomi IdProvider not exists");
            return;
        }
        try {
            String str = (String) cls.getMethod("getOAID", Context.class).invoke(this.f210c, this.f208a);
            if (str == null || str.length() == 0) {
                throw new OAIDException("OAID query failed");
            }
            String str2 = "OAID query success: " + str;
            ((AdSdk.C0476a) interfaceC0519a).m17a(str);
        } catch (Exception unused) {
        }
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        return this.f210c != null;
    }
}
