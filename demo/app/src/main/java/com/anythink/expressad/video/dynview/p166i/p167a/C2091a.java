package com.anythink.expressad.video.dynview.p166i.p167a;

import android.graphics.Bitmap;
import android.view.View;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1882p;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p164g.C2087a;
import com.anythink.expressad.video.dynview.p166i.C2092b;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.i.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C2091a {

    /* JADX INFO: renamed from: a */
    private static volatile C2091a f13256a;

    /* JADX INFO: renamed from: b */
    private View f13257b;

    /* JADX INFO: renamed from: c */
    private Bitmap f13258c;

    /* JADX INFO: renamed from: d */
    private Bitmap f13259d;

    private C2091a() {
    }

    /* JADX INFO: renamed from: a */
    public static C2091a m11182a() {
        C2091a c2091a;
        if (f13256a != null) {
            return f13256a;
        }
        synchronized (C2091a.class) {
            if (f13256a == null) {
                f13256a = new C2091a();
            }
            c2091a = f13256a;
        }
        return c2091a;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m11183a(int i, float f, float f2, Bitmap bitmap, Bitmap bitmap2) {
        C2087a.a aVarM11139a = C2087a.m11139a();
        aVarM11139a.mo11155a(i).mo11156a(bitmap).mo11159b(bitmap2);
        if (i != 2 || f > f2) {
            C2087a.b bVarMo11154a = aVarM11139a.mo11154a(f);
            bVarMo11154a.mo11157b(f2);
            this.f13257b.setBackgroundDrawable(aVarM11139a.mo11160b());
        } else {
            aVarM11139a.mo11154a(f2).mo11157b(f);
            this.f13257b.setBackgroundDrawable(aVarM11139a.mo11160b());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11184a(Map map, C2074c c2074c, View view) {
        Bitmap bitmap;
        List<C1781c> listM11093g;
        this.f13257b = view;
        int iM11091e = c2074c.m11091e();
        float fM11090d = c2074c.m11090d();
        float fM11089c = c2074c.m11089c();
        if (map != null && map.size() > 1 && (listM11093g = c2074c.m11093g()) != null && listM11093g.size() > 1) {
            if (map.get(C1882p.m9771a(listM11093g.get(0).m10151be())) != null && (map.get(C1882p.m9771a(listM11093g.get(0).m10151be())) instanceof Bitmap)) {
                Bitmap bitmap2 = (Bitmap) map.get(C1882p.m9771a(listM11093g.get(0).m10151be()));
                if (listM11093g.get(0) != null && bitmap2 != null && !bitmap2.isRecycled()) {
                    C2092b.m11188a();
                    this.f13258c = C2092b.m11187a(bitmap2, 0);
                }
            }
            if (map.get(C1882p.m9771a(listM11093g.get(1).m10151be())) != null && (map.get(C1882p.m9771a(listM11093g.get(1).m10151be())) instanceof Bitmap)) {
                Bitmap bitmap3 = (Bitmap) map.get(C1882p.m9771a(listM11093g.get(1).m10151be()));
                if (listM11093g.get(1) != null && !bitmap3.isRecycled()) {
                    C2092b.m11188a();
                    this.f13259d = C2092b.m11187a(bitmap3, 1);
                }
            }
        }
        Bitmap bitmap4 = this.f13258c;
        if (bitmap4 == null || bitmap4.isRecycled() || (bitmap = this.f13259d) == null || bitmap.isRecycled()) {
            return;
        }
        m11183a(iM11091e, fM11090d, fM11089c, this.f13258c, this.f13259d);
    }

    /* JADX INFO: renamed from: b */
    public final void m11185b() {
        if (this.f13257b != null) {
            this.f13257b = null;
        }
        Bitmap bitmap = this.f13258c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f13258c.recycle();
            this.f13258c = null;
        }
        Bitmap bitmap2 = this.f13259d;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f13259d.recycle();
        this.f13259d = null;
    }
}
