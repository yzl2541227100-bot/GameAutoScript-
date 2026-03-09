package com.anythink.basead.p010a.p012b;

import com.anythink.basead.p015c.C0747e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.anythink.basead.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C0725d {

    /* JADX INFO: renamed from: a */
    public static final String f532a = "d";

    /* JADX INFO: renamed from: b */
    private static volatile C0725d f533b;

    /* JADX INFO: renamed from: c */
    private List<a> f534c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.anythink.basead.a.b.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo187a(String str, int i);

        /* JADX INFO: renamed from: a */
        void mo188a(String str, C0747e c0747e);
    }

    private C0725d() {
    }

    /* JADX INFO: renamed from: a */
    public static C0725d m205a() {
        if (f533b == null) {
            synchronized (C0725d.class) {
                if (f533b == null) {
                    f533b = new C0725d();
                }
            }
        }
        return f533b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m206a(a aVar) {
        this.f534c.add(aVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m207a(String str, int i) {
        List<a> list = this.f534c;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo187a(str, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m208a(String str, C0747e c0747e) {
        List<a> list = this.f534c;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo188a(str, c0747e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m209b(a aVar) {
        int size = this.f534c.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (aVar == this.f534c.get(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.f534c.remove(i);
        }
    }
}
