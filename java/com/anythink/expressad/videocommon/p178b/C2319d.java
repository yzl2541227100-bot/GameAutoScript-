package com.anythink.expressad.videocommon.p178b;

import android.text.TextUtils;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.videocommon.p178b.C2324i;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2319d implements C2324i.c {

    /* JADX INFO: renamed from: a */
    private static String f14427a = "DownLoadH5SourceListener";

    /* JADX INFO: renamed from: b */
    private ConcurrentMap<String, C2319d> f14428b;

    /* JADX INFO: renamed from: c */
    private C2328m f14429c;

    /* JADX INFO: renamed from: d */
    private CopyOnWriteArrayList<C2324i.d> f14430d;

    /* JADX INFO: renamed from: e */
    private String f14431e;

    public C2319d(ConcurrentMap<String, C2319d> concurrentMap, C2328m c2328m, C2324i.d dVar, String str) {
        CopyOnWriteArrayList<C2324i.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f14430d = copyOnWriteArrayList;
        this.f14428b = concurrentMap;
        this.f14429c = c2328m;
        copyOnWriteArrayList.add(dVar);
        this.f14431e = str;
    }

    @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
    /* JADX INFO: renamed from: a */
    public final void mo11839a() {
    }

    /* JADX INFO: renamed from: a */
    public final void m11840a(C2324i.d dVar) {
        this.f14430d.add(dVar);
    }

    @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
    /* JADX INFO: renamed from: a */
    public final void mo11841a(String str) {
        ConcurrentMap<String, C2319d> concurrentMap;
        try {
            concurrentMap = this.f14428b;
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
            try {
                str = e.getMessage();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        if (concurrentMap == null) {
            for (C2324i.d dVar : this.f14430d) {
                if (dVar != null) {
                    dVar.mo5465a(this.f14431e, "mResDownloadingMap  is null");
                    this.f14430d.remove(dVar);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(this.f14431e)) {
            this.f14428b.remove(this.f14431e);
        }
        for (C2324i.d dVar2 : this.f14430d) {
            if (dVar2 != null) {
                dVar2.mo5465a(this.f14431e, str);
                this.f14430d.remove(dVar2);
            }
        }
    }

    @Override // com.anythink.expressad.videocommon.p178b.C2324i.c
    /* JADX INFO: renamed from: a */
    public final void mo11842a(byte[] bArr, String str) {
        String message;
        ConcurrentMap<String, C2319d> concurrentMap;
        try {
            concurrentMap = this.f14428b;
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
            try {
                message = e.getMessage();
            } catch (Throwable th) {
                th.getMessage();
                message = "";
            }
        }
        if (concurrentMap == null) {
            for (C2324i.d dVar : this.f14430d) {
                if (dVar != null) {
                    dVar.mo5465a(str, "mResDownloadingMap  is null");
                    this.f14430d.remove(dVar);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(str)) {
            this.f14428b.remove(str);
        }
        if (bArr == null || bArr.length <= 0) {
            message = "response data is error";
        } else {
            String strM11915a = this.f14429c.m11915a(str, bArr);
            if (TextUtils.isEmpty(strM11915a)) {
                for (C2324i.d dVar2 : this.f14430d) {
                    if (dVar2 != null) {
                        dVar2.mo5464a(str);
                        this.f14430d.remove(dVar2);
                    }
                }
                return;
            }
            message = "data save failed:".concat(String.valueOf(strM11915a));
        }
        for (C2324i.d dVar3 : this.f14430d) {
            if (dVar3 != null) {
                dVar3.mo5465a(str, message);
            }
        }
    }
}
