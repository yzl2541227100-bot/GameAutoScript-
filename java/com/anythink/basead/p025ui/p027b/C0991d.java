package com.anythink.basead.p025ui.p027b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.p025ui.guidetoclickv2.C1018a;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.ui.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0991d extends AbstractC0989b {

    /* JADX INFO: renamed from: i */
    public boolean f1989i = false;

    /* JADX INFO: renamed from: j */
    public boolean f1990j = false;

    /* JADX INFO: renamed from: k */
    public C1018a f1991k;

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1180a() {
        C1018a c1018a = this.f1991k;
        if (c1018a != null) {
            c1018a.m1270c();
            this.f1991k = null;
        }
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1181a(int i, Map<String, Object> map) {
        int i2;
        int i3;
        switch (i) {
            case 107:
            case 108:
                if (this.f1981e == 1) {
                    mo1180a();
                }
                break;
            case 110:
                C1018a c1018a = this.f1991k;
                if (c1018a != null) {
                    if (this.f1990j || (i2 = this.f1981e) == 1 || i2 == 2) {
                        c1018a.m1268a();
                    }
                }
                break;
            case 111:
                C1018a c1018a2 = this.f1991k;
                if (c1018a2 != null) {
                    if (this.f1990j || (i3 = this.f1981e) == 1 || i3 == 2) {
                        c1018a2.m1269b();
                    }
                }
                break;
            case 113:
                this.f1989i = true;
                mo1180a();
                break;
            case 114:
                this.f1990j = true;
                C1018a c1018a3 = this.f1991k;
                if (c1018a3 != null) {
                    c1018a3.m1268a();
                }
                break;
        }
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1182a(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, AbstractC0989b.a aVar) {
        super.mo1182a(context, abstractC1247l, c1248m, viewGroup, relativeLayout, view, i, aVar);
        this.f1991k = new C1018a(context, abstractC1247l, c1248m, i, relativeLayout, view, aVar);
    }
}
