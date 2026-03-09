package cn.haorui.sdk.core.oaid.impl;

import android.app.KeyguardManager;
import android.content.Context;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import java.util.Objects;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.c */
/* JADX INFO: loaded from: classes.dex */
public class C0523c implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f190a;

    /* JADX INFO: renamed from: b */
    public final KeyguardManager f191b;

    public C0523c(Context context) {
        this.f190a = context;
        this.f191b = (KeyguardManager) context.getSystemService("keyguard");
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f190a == null || interfaceC0519a == null) {
            return;
        }
        KeyguardManager keyguardManager = this.f191b;
        if (keyguardManager == null) {
            new OAIDException("KeyguardManager not found");
            return;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod("obtainOaid", new Class[0]).invoke(this.f191b, new Object[0]);
            if (objInvoke == null) {
                throw new OAIDException("OAID obtain failed");
            }
            String string = objInvoke.toString();
            String str = "OAID obtain success: " + string;
            ((AdSdk.C0476a) interfaceC0519a).m17a(string);
        } catch (Exception unused) {
        }
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        KeyguardManager keyguardManager;
        if (this.f190a == null || (keyguardManager = this.f191b) == null) {
            return false;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod("isSupported", new Class[0]).invoke(this.f191b, new Object[0]);
            Objects.requireNonNull(objInvoke);
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
