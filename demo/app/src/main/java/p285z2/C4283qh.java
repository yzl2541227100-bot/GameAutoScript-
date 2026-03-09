package p285z2;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import p285z2.C4093lc;

/* JADX INFO: renamed from: z2.qh */
/* JADX INFO: loaded from: classes2.dex */
public class C4283qh {
    public static final int OooOO0 = 4;
    private static final int OooOO0O = 100;
    private static final int OooOO0o = 102;
    private static final String OooOOO0 = "AdManager";
    private View OooO;
    private boolean OooO00o;
    public int OooO0O0;
    private Activity OooO0o;
    private InterfaceC4135mh OooO0o0;
    private int OooO0OO = 0;
    private int OooO0Oo = 0;
    private int OooO0oO = 100;
    private Handler OooO0oo = new Handler();

    /* JADX INFO: renamed from: z2.qh$OooO00o */
    public class OooO00o implements C4093lc.OooO00o {
        public OooO00o() {
        }

        @Override // p285z2.C4093lc.OooO00o
        public void OooO00o(Object obj) {
            C4093lc.OooO0oo().OooO0oO();
            C4246ph.OooO0O0().OooO0o0(C4283qh.this.OooO0o);
        }
    }

    /* JADX INFO: renamed from: z2.qh$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4283qh c4283qh = C4283qh.this;
            c4283qh.OooOOo(c4283qh.OooO0o);
        }
    }

    /* JADX INFO: renamed from: z2.qh$OooO0OO */
    public class OooO0OO implements C4093lc.OooO00o {
        public final /* synthetic */ Context OooO00o;

        public OooO0OO(Context context) {
            this.OooO00o = context;
        }

        @Override // p285z2.C4093lc.OooO00o
        public void OooO00o(Object obj) {
            C4093lc.OooO0oo().OooO0oO();
            C4246ph.OooO0O0().OooO0o0(this.OooO00o);
        }
    }

    public C4283qh(Activity activity, View view) {
        this.OooO0o = activity;
        this.OooO = view;
    }

    private void OooO(int i) {
        String str;
        InterfaceC4135mh interfaceC4135mh;
        Log.d("XJL_AD_TAG", "loadBackgroundAd index：" + i);
        boolean zOooO0OO = C4246ph.OooO0O0().OooO0OO(i);
        String str2 = "加载后台广告 handleMessage --> isDisplay=" + zOooO0OO;
        str = "";
        if (zOooO0OO) {
            str = C4246ph.OooO0O0().OooO0O0 != null ? C4246ph.OooO0O0().OooO0O0.ImageUrl : "";
            String str3 = "加载后台广告 handleMessage --> imageUrl=" + str;
            interfaceC4135mh = this.OooO0o0;
            if (interfaceC4135mh == null) {
                return;
            }
        } else {
            interfaceC4135mh = this.OooO0o0;
            if (interfaceC4135mh == null) {
                return;
            }
        }
        interfaceC4135mh.OooO0O0(str);
    }

    private void OooO0OO() {
        if (this.OooO0OO == 3) {
            this.OooO0oo.postDelayed(new OooO0O0(), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void OooO0oo() {
        this.OooO0o0.onAdClose();
    }

    private void OooOO0o(Context context) {
        C4093lc.OooO0oo().OooOOO0(new OooO0OO(context)).OooO(context, 1, 3, C4246ph.OooO0O0().OooO0O0.f15897Id);
    }

    private void OooOOOo(int i) {
        this.OooO0oO = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOOo(Activity activity) {
        C3803di.OooO0O0(activity);
        if (activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public void OooO0Oo() {
        if (this.OooO0Oo < 4) {
            OooOOO0();
        } else {
            OooOOo(this.OooO0o);
        }
    }

    public boolean OooO0o() {
        return this.OooO00o;
    }

    public void OooO0o0() {
        Log.d(OooOOO0, "displayAd");
        InterfaceC4135mh interfaceC4135mh = this.OooO0o0;
        if (interfaceC4135mh != null) {
            interfaceC4135mh.OooO0Oo(this.OooO0oO);
        }
        this.OooO0oo.postDelayed(new Runnable() { // from class: z2.oh
            @Override // java.lang.Runnable
            public final void run() {
                this.OoooOoO.OooO0oo();
            }
        }, 300L);
    }

    public void OooOO0(int i, InterfaceC4135mh interfaceC4135mh) {
        this.OooO0O0 = i;
        String str = "loadILFYAd:" + i;
        OooOOOo(100);
        C4098lh c4098lhOooO00o = C4246ph.OooO0O0().OooO00o(this.OooO0O0, AbstractC4172nh.OooO0o0);
        String str2 = "loadILFYAd --> ilfyAd.isDisplay =" + c4098lhOooO00o.OooO00o;
        this.OooO0o0 = interfaceC4135mh;
        if (c4098lhOooO00o.OooO00o) {
            interfaceC4135mh.OooO0OO();
        } else {
            OooOOo0();
        }
    }

    public void OooOO0O() {
        this.OooO.setVisibility(8);
        int i = this.OooO0oO;
        if (i != 100 && i == 102) {
            C4093lc.OooO0oo().OooOOO0(new OooO00o()).OooO(this.OooO0o, 1, 3, C4246ph.OooO0O0().OooO0O0.f15897Id);
        }
    }

    public void OooOOO() {
        this.OooO = null;
        this.OooO0o = null;
        this.OooO0o0 = null;
        this.OooO0oo.removeCallbacksAndMessages(null);
        this.OooO00o = false;
    }

    public void OooOOO0() {
        if (this.OooO00o) {
            return;
        }
        this.OooO00o = true;
        OooOO0o(this.OooO0o);
    }

    public void OooOOOO() {
        if (this.OooO00o) {
            OooOOo(this.OooO0o);
        }
    }

    public void OooOOo0() {
        OooOOOo(102);
        OooO(this.OooO0O0);
    }
}
