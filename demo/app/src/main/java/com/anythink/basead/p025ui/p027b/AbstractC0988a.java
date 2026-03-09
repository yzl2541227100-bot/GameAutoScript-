package com.anythink.basead.p025ui.p027b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.shake.C1974a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.ui.b.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0988a {

    /* JADX INFO: renamed from: a */
    private int f1967a;

    /* JADX INFO: renamed from: b */
    public ViewGroup f1968b;

    /* JADX INFO: renamed from: c */
    public AbstractC1247l f1969c;

    /* JADX INFO: renamed from: d */
    public C1248m f1970d;

    /* JADX INFO: renamed from: e */
    private List<AbstractC0989b> f1971e;

    /* JADX INFO: renamed from: f */
    private Map<String, Object> f1972f;

    /* JADX INFO: renamed from: com.anythink.basead.ui.b.a$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0994g f1973a;

        public AnonymousClass1(C0994g c0994g) {
            c0994g = c0994g;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSpecialNoteView baseSpecialNoteView;
            ViewGroup.LayoutParams layoutParamsMo535a = AbstractC0988a.this.mo535a();
            if (c0994g == null || AbstractC0988a.this.mo535a() == null || (baseSpecialNoteView = c0994g.f2011i) == null) {
                return;
            }
            baseSpecialNoteView.setLayoutParams(layoutParamsMo535a);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.b.a$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1975a;

        public AnonymousClass2(int i) {
            i = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC0988a.this.m1177a(i);
        }
    }

    public AbstractC0988a(ViewGroup viewGroup, AbstractC1247l abstractC1247l, C1248m c1248m, int i, AbstractC0989b.a aVar) {
        ArrayList arrayList;
        int i2;
        this.f1967a = 0;
        this.f1968b = viewGroup;
        this.f1969c = abstractC1247l;
        this.f1970d = c1248m;
        this.f1967a = i;
        if (!abstractC1247l.mo2424P()) {
            switch (this.f1967a) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    AbstractC1249n abstractC1249n = this.f1970d.f4333n;
                    int i3 = abstractC1249n.m3301ab() || abstractC1249n.m3302ac() || abstractC1249n.m3303ad() ? 4 : 0;
                    int i4 = this.f1967a;
                    if (i4 == 1 || i4 == 2 || i4 == 3) {
                        if (C1974a.m10477a().m10480b() && this.f1970d.f4333n.m3277Q() == 1) {
                            i3 |= 1;
                        }
                    }
                    int i5 = this.f1967a;
                    if (i5 == 1 || i5 == 3) {
                        if (this.f1970d.f4333n.m3365o() == 1) {
                            i3 |= 2;
                        }
                    }
                    i = (this.f1970d.f4333n.m3314ao() == 1 ? 1 : 0) == 0 ? i3 : i3 | 8;
                    break;
            }
        }
        Context context = this.f1968b.getContext();
        int i6 = this.f1967a;
        ArrayList arrayList2 = new ArrayList();
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(C1345i.m4154a(context, "myoffer_guide2click_container", "id"));
        View viewFindViewById = viewGroup.findViewById(C1345i.m4154a(context, "myoffer_guide2click_mask", "id"));
        View viewFindViewById2 = viewGroup.findViewById(C1345i.m4154a(viewGroup.getContext(), "myoffer_rl_root", "id"));
        ViewGroup viewGroup2 = ((viewFindViewById2 == null || !(viewFindViewById2 instanceof ViewGroup)) && ((viewFindViewById2 = viewGroup.findViewById(C1345i.m4154a(viewGroup.getContext(), "myoffer_splash_root", "id"))) == null || !(viewFindViewById2 instanceof ViewGroup))) ? viewGroup : (ViewGroup) viewFindViewById2;
        if ((i & 1) == 1) {
            C0993f c0993f = new C0993f();
            arrayList = arrayList2;
            i2 = i6;
            c0993f.mo1182a(viewGroup2.getContext(), abstractC1247l, c1248m, viewGroup2, relativeLayout, viewFindViewById, i6, aVar);
            arrayList.add(c0993f);
        } else {
            arrayList = arrayList2;
            i2 = i6;
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
        this.f1971e = arrayList;
        C0994g c0994gM1171b = m1171b();
        if (c0994gM1171b != null) {
            viewGroup.post(new Runnable() { // from class: com.anythink.basead.ui.b.a.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0994g f1973a;

                public AnonymousClass1(C0994g c0994gM1171b2) {
                    c0994g = c0994gM1171b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseSpecialNoteView baseSpecialNoteView;
                    ViewGroup.LayoutParams layoutParamsMo535a = AbstractC0988a.this.mo535a();
                    if (c0994g == null || AbstractC0988a.this.mo535a() == null || (baseSpecialNoteView = c0994g.f2011i) == null) {
                        return;
                    }
                    baseSpecialNoteView.setLayoutParams(layoutParamsMo535a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    private C0994g m1171b() {
        List<AbstractC0989b> list = this.f1971e;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (AbstractC0989b abstractC0989b : this.f1971e) {
            if (abstractC0989b instanceof C0994g) {
                return (C0994g) abstractC0989b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private int m1172c() {
        if (this.f1969c.mo2424P()) {
            return 0;
        }
        switch (this.f1967a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AbstractC1249n abstractC1249n = this.f1970d.f4333n;
                int i = abstractC1249n.m3301ab() || abstractC1249n.m3302ac() || abstractC1249n.m3303ad() ? 4 : 0;
                int i2 = this.f1967a;
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    if (C1974a.m10477a().m10480b() && this.f1970d.f4333n.m3277Q() == 1) {
                        i |= 1;
                    }
                }
                int i3 = this.f1967a;
                if (i3 == 1 || i3 == 3) {
                    if (this.f1970d.f4333n.m3365o() == 1) {
                        i |= 2;
                    }
                }
                return this.f1970d.f4333n.m3314ao() == 1 ? i | 8 : i;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m1173d() {
        AbstractC1249n abstractC1249n = this.f1970d.f4333n;
        return abstractC1249n.m3301ab() || abstractC1249n.m3302ac() || abstractC1249n.m3303ad();
    }

    /* JADX INFO: renamed from: e */
    private boolean m1174e() {
        return this.f1970d.f4333n.m3365o() == 1;
    }

    /* JADX INFO: renamed from: f */
    private boolean m1175f() {
        return C1974a.m10477a().m10480b() && this.f1970d.f4333n.m3277Q() == 1;
    }

    /* JADX INFO: renamed from: g */
    private boolean m1176g() {
        return this.f1970d.f4333n.m3314ao() == 1;
    }

    /* JADX INFO: renamed from: a */
    public abstract ViewGroup.LayoutParams mo535a();

    /* JADX INFO: renamed from: a */
    public final void m1177a(int i) {
        List<AbstractC0989b> list = this.f1971e;
        if (list == null || list.size() <= 0) {
            return;
        }
        C1335b.m3998a();
        if (!C1335b.m4000b()) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.ui.b.a.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f1975a;

                public AnonymousClass2(int i2) {
                    i = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0988a.this.m1177a(i);
                }
            });
            return;
        }
        Iterator<AbstractC0989b> it = this.f1971e.iterator();
        while (it.hasNext()) {
            it.next().mo1181a(i2, this.f1972f);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1178a(long j) {
        C0994g c0994gM1171b = m1171b();
        if (c0994gM1171b != null) {
            c0994gM1171b.m1197a(j);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1179a(Map<String, Object> map) {
        this.f1972f = map;
    }
}
