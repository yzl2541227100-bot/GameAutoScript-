package com.anythink.basead.p025ui.p027b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p025ui.GuideToClickView;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1360x;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.ui.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0990c extends AbstractC0989b {

    /* JADX INFO: renamed from: i */
    public GuideToClickView f1985i;

    /* JADX INFO: renamed from: j */
    public boolean f1986j = false;

    /* JADX INFO: renamed from: k */
    public boolean f1987k = false;

    /* JADX INFO: renamed from: b */
    private void m1183b() {
        GuideToClickView guideToClickView;
        if (this.f1982f == null || (guideToClickView = this.f1985i) == null) {
            return;
        }
        C1360x.m4265a(guideToClickView);
        this.f1982f.addView(this.f1985i, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: c */
    private void m1184c() {
        GuideToClickView guideToClickView = this.f1985i;
        if (guideToClickView != null) {
            guideToClickView.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1180a() {
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1181a(int i, Map<String, Object> map) {
        if (i == 103) {
            if (this.f1981e != 1 || this.f1986j || !this.f1987k || this.f1985i == null) {
                return;
            }
            m1183b();
            return;
        }
        if (i == 113) {
            this.f1986j = true;
            GuideToClickView guideToClickView = this.f1985i;
            if (guideToClickView != null) {
                guideToClickView.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 116) {
            if (this.f1981e != 3 || C0731d.m246b(this.f1978b)) {
                return;
            }
            m1183b();
            return;
        }
        switch (i) {
            case 106:
                if (this.f1981e == 3 && C0731d.m246b(this.f1978b)) {
                    m1183b();
                    break;
                }
                break;
            case 107:
            case 108:
                this.f1987k = true;
                break;
        }
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1182a(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, AbstractC0989b.a aVar) {
        super.mo1182a(context, abstractC1247l, c1248m, viewGroup, relativeLayout, view, i, aVar);
        GuideToClickView guideToClickView = new GuideToClickView(this.f1977a);
        this.f1985i = guideToClickView;
        guideToClickView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.b.c.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC0989b.a aVar2 = C0990c.this.f1984h;
                if (aVar2 != null) {
                    aVar2.mo534a(1, 12);
                }
            }
        });
    }
}
