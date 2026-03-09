package com.anythink.basead.p025ui.p027b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.basead.ui.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0992e {

    /* JADX INFO: renamed from: a */
    public static final int f1992a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f1993b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f1994c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f1995d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f1996e = 8;

    /* JADX INFO: renamed from: com.anythink.basead.ui.b.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final String f1997a = "screen_style";
    }

    /* JADX INFO: renamed from: a */
    private static List<AbstractC0989b> m1185a(int i, Context context, AbstractC1247l abstractC1247l, C1248m c1248m, ViewGroup viewGroup, int i2, AbstractC0989b.a aVar) {
        ViewGroup viewGroup2 = viewGroup;
        ArrayList arrayList = new ArrayList();
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup2.findViewById(C1345i.m4154a(context, "myoffer_guide2click_container", "id"));
        View viewFindViewById = viewGroup2.findViewById(C1345i.m4154a(context, "myoffer_guide2click_mask", "id"));
        View viewFindViewById2 = viewGroup2.findViewById(C1345i.m4154a(viewGroup.getContext(), "myoffer_rl_root", "id"));
        if (viewFindViewById2 == null || !(viewFindViewById2 instanceof ViewGroup)) {
            View viewFindViewById3 = viewGroup2.findViewById(C1345i.m4154a(viewGroup.getContext(), "myoffer_splash_root", "id"));
            if (viewFindViewById3 != null && (viewFindViewById3 instanceof ViewGroup)) {
                viewGroup2 = (ViewGroup) viewFindViewById3;
            }
        } else {
            viewGroup2 = (ViewGroup) viewFindViewById2;
        }
        if ((i & 1) == 1) {
            C0993f c0993f = new C0993f();
            c0993f.mo1182a(viewGroup2.getContext(), abstractC1247l, c1248m, viewGroup2, relativeLayout, viewFindViewById, i2, aVar);
            arrayList.add(c0993f);
        }
        if ((i & 2) == 2) {
            C0990c c0990c = new C0990c();
            c0990c.mo1182a(viewGroup2.getContext(), abstractC1247l, c1248m, viewGroup2, relativeLayout, viewFindViewById, i2, aVar);
            arrayList.add(c0990c);
        }
        if ((i & 4) == 4) {
            C0994g c0994g = new C0994g();
            c0994g.mo1182a(viewGroup2.getContext(), abstractC1247l, c1248m, viewGroup2, relativeLayout, viewFindViewById, i2, aVar);
            arrayList.add(c0994g);
        }
        if (relativeLayout != null && (i & 8) == 8) {
            C0991d c0991d = new C0991d();
            c0991d.mo1182a(viewGroup2.getContext(), abstractC1247l, c1248m, viewGroup2, relativeLayout, viewFindViewById, i2, aVar);
            arrayList.add(c0991d);
        }
        return arrayList;
    }
}
