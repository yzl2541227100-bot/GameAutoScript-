package com.anythink.basead.p025ui.guidetoclickv2;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import java.util.Queue;

/* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1018a {

    /* JADX INFO: renamed from: a */
    public Queue<C1019b> f2130a;

    /* JADX INFO: renamed from: b */
    public BaseG2CV2View.InterfaceC1001b f2131b = new BaseG2CV2View.InterfaceC1001b() { // from class: com.anythink.basead.ui.guidetoclickv2.a.1
        @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View.InterfaceC1001b
        /* JADX INFO: renamed from: a */
        public final void mo1225a() {
            C1018a.this.m1266f();
        }

        @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View.InterfaceC1001b
        /* JADX INFO: renamed from: b */
        public final void mo1226b() {
            C1018a.this.m1270c();
        }
    };

    /* JADX INFO: renamed from: c */
    private Context f2132c;

    /* JADX INFO: renamed from: d */
    private AbstractC1247l f2133d;

    /* JADX INFO: renamed from: e */
    private C1248m f2134e;

    /* JADX INFO: renamed from: f */
    private RelativeLayout f2135f;

    /* JADX INFO: renamed from: g */
    private int f2136g;

    /* JADX INFO: renamed from: h */
    private View f2137h;

    /* JADX INFO: renamed from: i */
    private C1019b f2138i;

    /* JADX INFO: renamed from: j */
    private AbstractC0989b.a f2139j;

    public C1018a(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, int i, RelativeLayout relativeLayout, View view, AbstractC0989b.a aVar) {
        this.f2132c = context;
        this.f2133d = abstractC1247l;
        this.f2134e = c1248m;
        this.f2136g = i;
        this.f2135f = relativeLayout;
        this.f2137h = view;
        this.f2139j = aVar;
        m1264d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    private boolean m1263a(int i) {
        boolean z = false;
        switch (i) {
            case 1:
            case 6:
                return z;
            case 2:
                if ((this.f2136g != 1 || C0731d.m245a(this.f2133d, this.f2134e)) && this.f2136g != 3) {
                    return true;
                }
                return z;
            case 3:
                int i2 = this.f2136g;
                if (i2 != 1 && i2 != 3) {
                    return true;
                }
                return z;
            case 4:
            case 5:
                int i3 = this.f2136g;
                if (i3 != 1 && i3 != 2 && i3 != 3) {
                    return true;
                }
                if (this.f2137h == null) {
                }
                return z;
            case 7:
                if (this.f2136g != 3) {
                }
                return z;
            default:
                return true;
        }
        z = true;
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1264d() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.guidetoclickv2.C1018a.m1264d():void");
    }

    /* JADX INFO: renamed from: e */
    private void m1265e() {
        C1019b c1019b = this.f2138i;
        if (c1019b != null) {
            c1019b.m1286a();
        } else {
            m1266f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m1266f() {
        m1267g();
        if (this.f2130a.size() > 0) {
            this.f2138i = this.f2130a.poll();
            m1265e();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m1267g() {
        C1019b c1019b = this.f2138i;
        if (c1019b != null) {
            c1019b.m1288c();
            this.f2138i = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1268a() {
        m1265e();
    }

    /* JADX INFO: renamed from: b */
    public final void m1269b() {
        C1019b c1019b = this.f2138i;
        if (c1019b != null) {
            c1019b.m1287b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1270c() {
        C1019b c1019b = this.f2138i;
        if (c1019b != null) {
            c1019b.m1287b();
        }
        m1267g();
        Queue<C1019b> queue = this.f2130a;
        if (queue != null) {
            queue.clear();
        }
    }
}
