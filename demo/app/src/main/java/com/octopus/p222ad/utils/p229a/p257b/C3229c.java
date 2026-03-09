package com.octopus.p222ad.utils.p229a.p257b;

import android.app.KeyguardManager;
import android.content.Context;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;
import java.util.Objects;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3229c implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17853a;

    /* JADX INFO: renamed from: b */
    private final KeyguardManager f17854b;

    public C3229c(Context context) {
        this.f17853a = context;
        this.f17854b = (KeyguardManager) context.getSystemService("keyguard");
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17853a == null || interfaceC3244c == null) {
            return;
        }
        KeyguardManager keyguardManager = this.f17854b;
        if (keyguardManager == null) {
            interfaceC3244c.mo14853a(new C3246e("KeyguardManager not found"));
            return;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod("obtainOaid", new Class[0]).invoke(this.f17854b, new Object[0]);
            if (objInvoke == null) {
                throw new C3246e("OAID obtain failed");
            }
            String string = objInvoke.toString();
            C3247f.m14935a("OAID obtain success: " + string);
            interfaceC3244c.mo14854a(string);
        } catch (Exception e) {
            C3247f.m14935a(e);
        }
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        KeyguardManager keyguardManager;
        if (this.f17853a == null || (keyguardManager = this.f17854b) == null) {
            return false;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod("isSupported", new Class[0]).invoke(this.f17854b, new Object[0]);
            Objects.requireNonNull(objInvoke);
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e) {
            C3247f.m14935a(e);
            return false;
        }
    }
}
