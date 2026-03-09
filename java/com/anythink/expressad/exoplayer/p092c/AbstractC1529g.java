package com.anythink.expressad.exoplayer.p092c;

import com.anythink.expressad.exoplayer.p092c.AbstractC1528f;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.lang.Exception;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.c.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1529g<I extends C1527e, O extends AbstractC1528f, E extends Exception> implements InterfaceC1525c<I, O, E> {

    /* JADX INFO: renamed from: a */
    private final Thread f7884a;

    /* JADX INFO: renamed from: b */
    private final Object f7885b = new Object();

    /* JADX INFO: renamed from: c */
    private final ArrayDeque<I> f7886c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    private final ArrayDeque<O> f7887d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e */
    private final I[] f7888e;

    /* JADX INFO: renamed from: f */
    private final O[] f7889f;

    /* JADX INFO: renamed from: g */
    private int f7890g;

    /* JADX INFO: renamed from: h */
    private int f7891h;

    /* JADX INFO: renamed from: i */
    private I f7892i;

    /* JADX INFO: renamed from: j */
    private E f7893j;

    /* JADX INFO: renamed from: k */
    private boolean f7894k;

    /* JADX INFO: renamed from: l */
    private boolean f7895l;

    /* JADX INFO: renamed from: m */
    private int f7896m;

    private AbstractC1529g(I[] iArr, O[] oArr) {
        this.f7888e = iArr;
        this.f7890g = iArr.length;
        for (int i = 0; i < this.f7890g; i++) {
            ((I[]) this.f7888e)[i] = m6678h();
        }
        this.f7889f = oArr;
        this.f7891h = oArr.length;
        for (int i2 = 0; i2 < this.f7891h; i2++) {
            ((O[]) this.f7889f)[i2] = m6679i();
        }
        Thread thread = new Thread() { // from class: com.anythink.expressad.exoplayer.c.g.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                AbstractC1529g.m6666a(AbstractC1529g.this);
            }
        };
        this.f7884a = thread;
        thread.start();
    }

    /* JADX INFO: renamed from: a */
    private void m6665a(int i) {
        C1711a.m8012b(this.f7890g == this.f7888e.length);
        for (I i2 : this.f7888e) {
            i2.m6660d(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6666a(AbstractC1529g abstractC1529g) {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (abstractC1529g.m6672o());
    }

    /* JADX INFO: renamed from: b */
    private void m6667b(I i) {
        i.mo6637a();
        I[] iArr = this.f7888e;
        int i2 = this.f7890g;
        this.f7890g = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX INFO: renamed from: b */
    private void m6668b(O o) {
        o.mo6637a();
        O[] oArr = this.f7889f;
        int i = this.f7891h;
        this.f7891h = i + 1;
        oArr[i] = o;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    /* JADX INFO: renamed from: l */
    private void m6669l() throws E {
        E e = this.f7893j;
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m6670m() {
        if (m6673p()) {
            this.f7885b.notify();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m6671n() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m6672o());
    }

    /* JADX INFO: renamed from: o */
    private boolean m6672o() {
        synchronized (this.f7885b) {
            while (!this.f7895l && !m6673p()) {
                this.f7885b.wait();
            }
            if (this.f7895l) {
                return false;
            }
            I iRemoveFirst = this.f7886c.removeFirst();
            O[] oArr = this.f7889f;
            int i = this.f7891h - 1;
            this.f7891h = i;
            O o = oArr[i];
            this.f7894k = false;
            if (iRemoveFirst.m6641c()) {
                o.m6639b(4);
            } else {
                if (iRemoveFirst.m6640b()) {
                    o.m6639b(Integer.MIN_VALUE);
                }
                try {
                    this.f7893j = (E) m6681k();
                } catch (OutOfMemoryError | RuntimeException unused) {
                    this.f7893j = (E) m6680j();
                }
                if (this.f7893j != null) {
                    synchronized (this.f7885b) {
                    }
                    return false;
                }
            }
            synchronized (this.f7885b) {
                if (this.f7894k) {
                    m6668b(o);
                    m6667b(iRemoveFirst);
                } else if (o.m6640b()) {
                    this.f7896m++;
                    m6668b(o);
                    m6667b(iRemoveFirst);
                } else {
                    o.f7883b = this.f7896m;
                    this.f7896m = 0;
                    this.f7887d.addLast(o);
                    m6667b(iRemoveFirst);
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m6673p() {
        return !this.f7886c.isEmpty() && this.f7891h > 0;
    }

    @Override // com.anythink.expressad.exoplayer.p092c.InterfaceC1525c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo6651a(I i) {
        synchronized (this.f7885b) {
            m6669l();
            C1711a.m8010a(i == this.f7892i);
            this.f7886c.addLast(i);
            m6670m();
            this.f7892i = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6675a(O o) {
        synchronized (this.f7885b) {
            m6668b(o);
            m6670m();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p092c.InterfaceC1525c
    /* JADX INFO: renamed from: d */
    public final void mo6654d() {
        synchronized (this.f7885b) {
            this.f7894k = true;
            this.f7896m = 0;
            I i = this.f7892i;
            if (i != null) {
                m6667b(i);
                this.f7892i = null;
            }
            while (!this.f7886c.isEmpty()) {
                m6667b(this.f7886c.removeFirst());
            }
            while (!this.f7887d.isEmpty()) {
                m6668b(this.f7887d.removeFirst());
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.p092c.InterfaceC1525c
    /* JADX INFO: renamed from: e */
    public final void mo6655e() {
        synchronized (this.f7885b) {
            this.f7895l = true;
            this.f7885b.notify();
        }
        try {
            this.f7884a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p092c.InterfaceC1525c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final I mo6652b() {
        I i;
        synchronized (this.f7885b) {
            m6669l();
            C1711a.m8012b(this.f7892i == null);
            int i2 = this.f7890g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f7888e;
                int i3 = i2 - 1;
                this.f7890g = i3;
                i = iArr[i3];
            }
            this.f7892i = i;
        }
        return i;
    }

    @Override // com.anythink.expressad.exoplayer.p092c.InterfaceC1525c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final O mo6653c() {
        synchronized (this.f7885b) {
            m6669l();
            if (this.f7887d.isEmpty()) {
                return null;
            }
            return this.f7887d.removeFirst();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract I m6678h();

    /* JADX INFO: renamed from: i */
    public abstract O m6679i();

    /* JADX INFO: renamed from: j */
    public abstract E m6680j();

    /* JADX INFO: renamed from: k */
    public abstract E m6681k();
}
