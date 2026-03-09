package com.octopus.p222ad.utils.p229a.p257b;

import android.annotation.SuppressLint;
import android.content.Context;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.q */
/* JADX INFO: loaded from: classes2.dex */
public class C3243q implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17879a;

    /* JADX INFO: renamed from: b */
    private Class<?> f17880b;

    /* JADX INFO: renamed from: c */
    private Object f17881c;

    @SuppressLint({"PrivateApi"})
    public C3243q(Context context) {
        this.f17879a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.f17880b = cls;
            this.f17881c = cls.newInstance();
        } catch (Exception e) {
            C3247f.m14935a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    private String m14934b() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (String) this.f17880b.getMethod("getOAID", Context.class).invoke(this.f17881c, this.f17879a);
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17879a == null || interfaceC3244c == null) {
            return;
        }
        if (this.f17880b == null || this.f17881c == null) {
            interfaceC3244c.mo14853a(new C3246e("Xiaomi IdProvider not exists"));
            return;
        }
        try {
            String strM14934b = m14934b();
            if (strM14934b == null || strM14934b.length() == 0) {
                throw new C3246e("OAID query failed");
            }
            C3247f.m14935a("OAID query success: " + strM14934b);
            interfaceC3244c.mo14854a(strM14934b);
        } catch (Exception e) {
            C3247f.m14935a(e);
            interfaceC3244c.mo14853a(e);
        }
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        return this.f17881c != null;
    }
}
