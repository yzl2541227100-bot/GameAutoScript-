package com.anythink.expressad.exoplayer.p105j.p106a;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1682m implements InterfaceC1670a {

    /* JADX INFO: renamed from: a */
    private static final String f9353a = "SimpleCache";

    /* JADX INFO: renamed from: b */
    private static final HashSet<File> f9354b = new HashSet<>();

    /* JADX INFO: renamed from: c */
    private static boolean f9355c;

    /* JADX INFO: renamed from: d */
    private final File f9356d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1673d f9357e;

    /* JADX INFO: renamed from: f */
    private final C1677h f9358f;

    /* JADX INFO: renamed from: g */
    private final HashMap<String, ArrayList<InterfaceC1670a.b>> f9359g;

    /* JADX INFO: renamed from: h */
    private long f9360h;

    /* JADX INFO: renamed from: i */
    private boolean f9361i;

    private C1682m(File file, InterfaceC1673d interfaceC1673d) {
        this(file, interfaceC1673d, null, false);
    }

    private C1682m(File file, InterfaceC1673d interfaceC1673d, C1677h c1677h) {
        if (!m7825c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(String.valueOf(file)));
        }
        this.f9356d = file;
        this.f9357e = interfaceC1673d;
        this.f9358f = c1677h;
        this.f9359g = new HashMap<>();
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread("SimpleCache.initialize()") { // from class: com.anythink.expressad.exoplayer.j.a.m.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                synchronized (C1682m.this) {
                    conditionVariable.open();
                    C1682m.m7818a(C1682m.this);
                    InterfaceC1673d unused = C1682m.this.f9357e;
                }
            }
        }.start();
        conditionVariable.block();
    }

    private C1682m(File file, InterfaceC1673d interfaceC1673d, byte[] bArr) {
        this(file, interfaceC1673d, bArr, bArr != null);
    }

    private C1682m(File file, InterfaceC1673d interfaceC1673d, byte[] bArr, boolean z) {
        this(file, interfaceC1673d, new C1677h(file, bArr, z));
    }

    /* JADX INFO: renamed from: a */
    private void m7817a(C1674e c1674e, boolean z) {
        C1676g c1676gM7784b = this.f9358f.m7784b(c1674e.f9315a);
        if (c1676gM7784b == null || !c1676gM7784b.m7768a(c1674e)) {
            return;
        }
        this.f9360h -= c1674e.f9317c;
        if (z) {
            try {
                this.f9358f.m7789d(c1676gM7784b.f9328b);
                this.f9358f.m7785b();
            } finally {
                m7823c(c1674e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7818a(C1682m c1682m) throws Throwable {
        if (!c1682m.f9356d.exists()) {
            c1682m.f9356d.mkdirs();
            return;
        }
        c1682m.f9358f.m7782a();
        File[] fileArrListFiles = c1682m.f9356d.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!file.getName().equals(C1677h.f9332a)) {
                    C1683n c1683nM7833a = file.length() > 0 ? C1683n.m7833a(file, c1682m.f9358f) : null;
                    if (c1683nM7833a != null) {
                        c1682m.m7819a(c1683nM7833a);
                    } else {
                        file.delete();
                    }
                }
            }
            c1682m.f9358f.m7788d();
            try {
                c1682m.f9358f.m7785b();
            } catch (InterfaceC1670a.a e) {
                Log.e(f9353a, "Storing index file failed", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7819a(C1683n c1683n) {
        this.f9358f.m7780a(c1683n.f9315a).m7765a(c1683n);
        this.f9360h += c1683n.f9317c;
        m7821b(c1683n);
    }

    /* JADX INFO: renamed from: b */
    private void m7821b(C1683n c1683n) {
        ArrayList<InterfaceC1670a.b> arrayList = this.f9359g.get(c1683n.f9315a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static synchronized boolean m7822b(File file) {
        return f9354b.contains(file.getAbsoluteFile());
    }

    /* JADX INFO: renamed from: c */
    private void m7823c(C1674e c1674e) {
        ArrayList<InterfaceC1670a.b> arrayList = this.f9359g.get(c1674e.f9315a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7824c(C1683n c1683n) {
        ArrayList<InterfaceC1670a.b> arrayList = this.f9359g.get(c1683n.f9315a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static synchronized boolean m7825c(File file) {
        if (f9355c) {
            return true;
        }
        return f9354b.add(file.getAbsoluteFile());
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    private static synchronized void m7826d() {
        f9355c = true;
        f9354b.clear();
    }

    /* JADX INFO: renamed from: d */
    private static synchronized void m7827d(File file) {
        if (!f9355c) {
            f9354b.remove(file.getAbsoluteFile());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized C1683n mo7702a(String str, long j) {
        C1683n c1683nMo7712b;
        while (true) {
            c1683nMo7712b = mo7712b(str, j);
            if (c1683nMo7712b == null) {
                wait();
            }
        }
        return c1683nMo7712b;
    }

    /* JADX INFO: renamed from: e */
    private void m7829e() throws Throwable {
        if (!this.f9356d.exists()) {
            this.f9356d.mkdirs();
            return;
        }
        this.f9358f.m7782a();
        File[] fileArrListFiles = this.f9356d.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.getName().equals(C1677h.f9332a)) {
                C1683n c1683nM7833a = file.length() > 0 ? C1683n.m7833a(file, this.f9358f) : null;
                if (c1683nM7833a != null) {
                    m7819a(c1683nM7833a);
                } else {
                    file.delete();
                }
            }
        }
        this.f9358f.m7788d();
        try {
            this.f9358f.m7785b();
        } catch (InterfaceC1670a.a e) {
            Log.e(f9353a, "Storing index file failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized C1683n mo7712b(String str, long j) {
        C1683n c1683nM7764a;
        C1683n c1683nM7837b;
        C1711a.m8012b(!this.f9361i);
        C1676g c1676gM7784b = this.f9358f.m7784b(str);
        if (c1676gM7784b == null) {
            c1683nM7837b = C1683n.m7837b(str, j);
        } else {
            while (true) {
                c1683nM7764a = c1676gM7784b.m7764a(j);
                if (!c1683nM7764a.f9318d || c1683nM7764a.f9319e.exists()) {
                    break;
                }
                m7831f();
            }
            c1683nM7837b = c1683nM7764a;
        }
        if (!c1683nM7837b.f9318d) {
            C1676g c1676gM7780a = this.f9358f.m7780a(str);
            if (c1676gM7780a.m7771b()) {
                return null;
            }
            c1676gM7780a.m7767a(true);
            return c1683nM7837b;
        }
        C1683n c1683nM7770b = this.f9358f.m7784b(str).m7770b(c1683nM7837b);
        ArrayList<InterfaceC1670a.b> arrayList = this.f9359g.get(c1683nM7837b.f9315a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size);
            }
        }
        return c1683nM7770b;
    }

    /* JADX INFO: renamed from: f */
    private void m7831f() throws Throwable {
        ArrayList arrayList = new ArrayList();
        Iterator<C1676g> it = this.f9358f.m7787c().iterator();
        while (it.hasNext()) {
            for (C1683n c1683n : it.next().m7772c()) {
                if (!c1683n.f9319e.exists()) {
                    arrayList.add(c1683n);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m7817a((C1674e) arrayList.get(i), false);
        }
        this.f9358f.m7788d();
        this.f9358f.m7785b();
    }

    /* JADX INFO: renamed from: g */
    private C1683n m7832g(String str, long j) throws Throwable {
        C1683n c1683nM7764a;
        C1676g c1676gM7784b = this.f9358f.m7784b(str);
        if (c1676gM7784b == null) {
            return C1683n.m7837b(str, j);
        }
        while (true) {
            c1683nM7764a = c1676gM7784b.m7764a(j);
            if (!c1683nM7764a.f9318d || c1683nM7764a.f9319e.exists()) {
                break;
            }
            m7831f();
        }
        return c1683nM7764a;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    @NonNull
    /* JADX INFO: renamed from: a */
    public final synchronized NavigableSet<C1674e> mo7703a(String str) {
        C1711a.m8012b(!this.f9361i);
        C1676g c1676gM7784b = this.f9358f.m7784b(str);
        if (c1676gM7784b != null && !c1676gM7784b.m7773d()) {
            return new TreeSet((Collection) c1676gM7784b.m7772c());
        }
        return new TreeSet();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: a */
    public final synchronized NavigableSet<C1674e> mo7704a(String str, InterfaceC1670a.b bVar) {
        C1711a.m8012b(!this.f9361i);
        ArrayList<InterfaceC1670a.b> arrayList = this.f9359g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f9359g.put(str, arrayList);
        }
        arrayList.add(bVar);
        return mo7703a(str);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7705a() {
        if (this.f9361i) {
            return;
        }
        this.f9359g.clear();
        try {
            m7831f();
        } finally {
            m7827d(this.f9356d);
            this.f9361i = true;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7706a(C1674e c1674e) {
        C1711a.m8012b(!this.f9361i);
        C1676g c1676gM7784b = this.f9358f.m7784b(c1674e.f9315a);
        C1711a.m8005a(c1676gM7784b);
        C1711a.m8012b(c1676gM7784b.m7771b());
        c1676gM7784b.m7767a(false);
        this.f9358f.m7789d(c1676gM7784b.f9328b);
        notifyAll();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7707a(File file) {
        boolean z = true;
        C1711a.m8012b(!this.f9361i);
        C1683n c1683nM7833a = C1683n.m7833a(file, this.f9358f);
        C1711a.m8012b(c1683nM7833a != null);
        C1676g c1676gM7784b = this.f9358f.m7784b(c1683nM7833a.f9315a);
        C1711a.m8005a(c1676gM7784b);
        C1711a.m8012b(c1676gM7784b.m7771b());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long jM7796a = C1679j.m7796a(c1676gM7784b.m7763a());
            if (jM7796a != -1) {
                if (c1683nM7833a.f9316b + c1683nM7833a.f9317c > jM7796a) {
                    z = false;
                }
                C1711a.m8012b(z);
            }
            m7819a(c1683nM7833a);
            this.f9358f.m7785b();
            notifyAll();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7708a(String str, C1680k c1680k) {
        C1711a.m8012b(!this.f9361i);
        this.f9358f.m7783a(str, c1680k);
        this.f9358f.m7785b();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo7709a(String str, long j, long j2) {
        C1711a.m8012b(!this.f9361i);
        C1676g c1676gM7784b = this.f9358f.m7784b(str);
        if (c1676gM7784b != null) {
            if (c1676gM7784b.m7762a(j, j2) >= j2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: b */
    public final synchronized long mo7710b(String str) {
        return C1679j.m7796a(mo7717c(str));
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: b */
    public final synchronized long mo7711b(String str, long j, long j2) {
        C1711a.m8012b(!this.f9361i);
        C1676g c1676gM7784b = this.f9358f.m7784b(str);
        if (c1676gM7784b != null) {
            return c1676gM7784b.m7762a(j, j2);
        }
        return -j2;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: b */
    public final synchronized Set<String> mo7713b() {
        C1711a.m8012b(!this.f9361i);
        return new HashSet(this.f9358f.m7791e());
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: b */
    public final synchronized void mo7714b(C1674e c1674e) {
        C1711a.m8012b(!this.f9361i);
        m7817a(c1674e, true);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: b */
    public final synchronized void mo7715b(String str, InterfaceC1670a.b bVar) {
        if (this.f9361i) {
            return;
        }
        ArrayList<InterfaceC1670a.b> arrayList = this.f9359g.get(str);
        if (arrayList != null) {
            arrayList.remove(bVar);
            if (arrayList.isEmpty()) {
                this.f9359g.remove(str);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: c */
    public final synchronized long mo7716c() {
        C1711a.m8012b(!this.f9361i);
        return this.f9360h;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: c */
    public final synchronized InterfaceC1678i mo7717c(String str) {
        C1711a.m8012b(!this.f9361i);
        return this.f9358f.m7790e(str);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: c */
    public final synchronized File mo7718c(String str, long j) {
        C1676g c1676gM7784b;
        C1711a.m8012b(!this.f9361i);
        c1676gM7784b = this.f9358f.m7784b(str);
        C1711a.m8005a(c1676gM7784b);
        C1711a.m8012b(c1676gM7784b.m7771b());
        if (!this.f9356d.exists()) {
            this.f9356d.mkdirs();
            m7831f();
        }
        return C1683n.m7836a(this.f9356d, c1676gM7784b.f9327a, j, System.currentTimeMillis());
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7719d(String str, long j) {
        C1680k c1680k = new C1680k();
        C1679j.m7798a(c1680k, j);
        mo7708a(str, c1680k);
    }
}
