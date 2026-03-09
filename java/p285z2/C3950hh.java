package p285z2;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: renamed from: z2.hh */
/* JADX INFO: loaded from: classes2.dex */
public class C3950hh {
    private static volatile C3950hh OooO0O0;
    private Context OooO00o;

    public static C3950hh OooO0Oo() {
        if (OooO0O0 == null) {
            synchronized (C3950hh.class) {
                if (OooO0O0 == null) {
                    OooO0O0 = new C3950hh();
                }
            }
        }
        return OooO0O0;
    }

    public void OooO() {
        C3692ai.OooOO0o().OooOOOO();
    }

    public void OooO00o(Activity activity, ViewGroup viewGroup, InterfaceC3766ci interfaceC3766ci) {
        C3692ai.OooOO0o().OooOOO(activity, viewGroup, interfaceC3766ci);
    }

    public void OooO0O0(Activity activity, ViewGroup viewGroup, InterfaceC4505wh interfaceC4505wh) {
        C3692ai.OooOO0o().OooOO0O(activity, viewGroup, interfaceC4505wh);
    }

    public Context OooO0OO() {
        return this.OooO00o;
    }

    public void OooO0o() {
        C3692ai.OooOO0o().OooOOoo();
    }

    public void OooO0o0(Context context) {
        this.OooO00o = context;
        C3692ai.OooOO0o().OooOOO0(context);
    }

    public void OooO0oO() {
    }

    public void OooO0oo(InterfaceC4394th interfaceC4394th) {
    }

    public void OooOO0() {
        C3692ai.OooOO0o().OooOOOo();
    }

    public void OooOO0O() {
        C3692ai.OooOO0o().OooOOo0();
    }
}
