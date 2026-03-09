package com.anythink.basead.p025ui.p027b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView;
import com.anythink.basead.p025ui.specialnote.ScreenSpecialNoteView;
import com.anythink.basead.p025ui.specialnote.SimpleSpecialNoteView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.ui.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0994g extends AbstractC0989b {

    /* JADX INFO: renamed from: i */
    public BaseSpecialNoteView f2011i;

    /* JADX INFO: renamed from: j */
    private long f2012j;

    /* JADX INFO: renamed from: k */
    private boolean f2013k = false;

    /* JADX INFO: renamed from: l */
    private boolean f2014l = false;

    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[PHI: r0
  0x007c: PHI (r0v12 long) = (r0v11 long), (r0v11 long), (r0v14 long) binds: [B:30:0x0065, B:32:0x006e, B:36:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1194a(int r14) {
        /*
            r13 = this;
            com.anythink.core.common.f.l r0 = r13.f1978b
            boolean r0 = r0.mo2424P()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r13.f2013k
            if (r0 == 0) goto Le
            return
        Le:
            com.anythink.basead.ui.specialnote.BaseSpecialNoteView r0 = r13.f2011i
            if (r0 != 0) goto L13
            return
        L13:
            r0 = 5
            if (r14 == r0) goto L44
            r0 = 6
            if (r14 == r0) goto L39
            r0 = 7
            if (r14 == r0) goto L1d
            return
        L1d:
            com.anythink.core.common.f.m r0 = r13.f1979c
            com.anythink.core.common.f.n r0 = r0.f4333n
            boolean r0 = r0.m3303ad()
            if (r0 != 0) goto L28
            return
        L28:
            com.anythink.core.common.f.m r0 = r13.f1979c
            com.anythink.core.common.f.n r0 = r0.f4333n
            long r0 = r0.m3306ag()
            com.anythink.core.common.f.m r2 = r13.f1979c
            com.anythink.core.common.f.n r2 = r2.f4333n
            long r2 = r2.m3307ah()
            goto L5f
        L39:
            com.anythink.core.common.f.m r0 = r13.f1979c
            com.anythink.core.common.f.n r0 = r0.f4333n
            boolean r0 = r0.m3302ac()
            if (r0 != 0) goto L4f
            return
        L44:
            com.anythink.core.common.f.m r0 = r13.f1979c
            com.anythink.core.common.f.n r0 = r0.f4333n
            boolean r0 = r0.m3301ab()
            if (r0 != 0) goto L4f
            return
        L4f:
            com.anythink.core.common.f.m r0 = r13.f1979c
            com.anythink.core.common.f.n r0 = r0.f4333n
            long r0 = r0.m3304ae()
            com.anythink.core.common.f.m r2 = r13.f1979c
            com.anythink.core.common.f.n r2 = r2.f4333n
            long r2 = r2.m3305af()
        L5f:
            long r4 = r13.f2012j
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L7c
            long r8 = r0 + r2
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 + r10
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 >= 0) goto L7c
            long r0 = r2 + r10
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 < 0) goto L79
            long r2 = r4 - r10
            goto L7d
        L79:
            long r4 = r4 - r2
            long r0 = r4 - r10
        L7c:
            r6 = r0
        L7d:
            r8 = r2
            r4 = r13
            r5 = r14
            r4.m1195a(r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.p027b.C0994g.m1194a(int):void");
    }

    /* JADX INFO: renamed from: a */
    private void m1195a(final int i, final long j, final long j2) {
        if (j >= 0 && j2 >= 0) {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.ui.b.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSpecialNoteView baseSpecialNoteView = C0994g.this.f2011i;
                    if (baseSpecialNoteView != null) {
                        if (baseSpecialNoteView.getParent() == null) {
                            C0994g c0994g = C0994g.this;
                            c0994g.f2011i.initSetting(c0994g.f1980d, i, new BaseSpecialNoteView.InterfaceC1032a() { // from class: com.anythink.basead.ui.b.g.1.1
                                @Override // com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView.InterfaceC1032a
                                /* JADX INFO: renamed from: a */
                                public final void mo1198a(int i2) {
                                    AbstractC0989b.a aVar = C0994g.this.f1984h;
                                    if (aVar != null) {
                                        aVar.mo534a(i2, 4);
                                    }
                                }
                            }, j, j2);
                            C0994g c0994g2 = C0994g.this;
                            c0994g2.f1980d.addView(c0994g2.f2011i);
                            return;
                        }
                        if (i == 7) {
                            C0994g c0994g3 = C0994g.this;
                            if (!C0731d.m245a(c0994g3.f1978b, c0994g3.f1979c) || C0994g.this.f2011i.hasBeenShow()) {
                                return;
                            }
                            C0994g.this.f2011i.pause();
                            C0994g.this.f2011i.reset(i, j, j2);
                            C0994g.this.f2011i.resume();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1196a(ViewGroup.LayoutParams layoutParams) {
        BaseSpecialNoteView baseSpecialNoteView = this.f2011i;
        if (baseSpecialNoteView != null) {
            baseSpecialNoteView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1180a() {
        BaseSpecialNoteView baseSpecialNoteView = this.f2011i;
        if (baseSpecialNoteView != null) {
            baseSpecialNoteView.release();
        }
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1181a(int i, Map<String, Object> map) {
        int i2;
        if (i == 102) {
            this.f2014l = true;
            return;
        }
        if (i == 103) {
            if (C0731d.m245a(this.f1978b, this.f1979c)) {
                m1194a(7);
                return;
            }
            return;
        }
        switch (i) {
            case 112:
                break;
            case 113:
                this.f2013k = true;
                break;
            case 114:
                if (!C0731d.m245a(this.f1978b, this.f1979c)) {
                    i2 = 5;
                } else if (this.f2014l) {
                    return;
                } else {
                    i2 = 6;
                }
                m1194a(i2);
                return;
            default:
                return;
        }
        mo1180a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1197a(long j) {
        this.f2012j = j;
    }

    @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b
    /* JADX INFO: renamed from: a */
    public final void mo1182a(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, AbstractC0989b.a aVar) {
        AbstractC1249n abstractC1249n;
        super.mo1182a(context, abstractC1247l, c1248m, viewGroup, relativeLayout, view, i, aVar);
        int i2 = this.f1981e;
        this.f2011i = (i2 == 4 || i2 == 5 || i2 == 6) ? new SimpleSpecialNoteView(this.f1977a) : new ScreenSpecialNoteView(this.f1977a);
        C1248m c1248m2 = this.f1979c;
        if (c1248m2 == null || !String.valueOf(c1248m2.f4329j).equals("4") || (abstractC1249n = this.f1979c.f4333n) == null) {
            return;
        }
        this.f2012j = abstractC1249n.m3375t();
    }
}
