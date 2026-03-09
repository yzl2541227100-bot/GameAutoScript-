package p285z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import junit.framework.AssertionFailedError;

/* JADX INFO: renamed from: z2.iw */
/* JADX INFO: loaded from: classes2.dex */
public class C4002iw {
    public List<C3928gw> OooO00o = new ArrayList();
    public List<C3928gw> OooO0O0 = new ArrayList();
    public List<InterfaceC3965hw> OooO0OO = new ArrayList();
    public int OooO0Oo = 0;
    private boolean OooO0o0 = false;

    /* JADX INFO: renamed from: z2.iw$OooO00o */
    public class OooO00o implements InterfaceC3817dw {
        public final /* synthetic */ AbstractC3891fw OooO00o;

        public OooO00o(AbstractC3891fw abstractC3891fw) throws Throwable {
            this.OooO00o = abstractC3891fw;
        }

        @Override // p285z2.InterfaceC3817dw
        public void OooO00o() throws Throwable {
            this.OooO00o.OoooO0();
        }
    }

    private synchronized List<InterfaceC3965hw> OooO0Oo() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.OooO0OO);
        return arrayList;
    }

    public synchronized Enumeration<C3928gw> OooO() {
        return Collections.enumeration(this.OooO00o);
    }

    public synchronized void OooO00o(InterfaceC3854ew interfaceC3854ew, Throwable th) {
        this.OooO0O0.add(new C3928gw(interfaceC3854ew, th));
        Iterator<InterfaceC3965hw> it = OooO0Oo().iterator();
        while (it.hasNext()) {
            it.next().OooO00o(interfaceC3854ew, th);
        }
    }

    public synchronized void OooO0O0(InterfaceC3854ew interfaceC3854ew, AssertionFailedError assertionFailedError) {
        this.OooO00o.add(new C3928gw(interfaceC3854ew, assertionFailedError));
        Iterator<InterfaceC3965hw> it = OooO0Oo().iterator();
        while (it.hasNext()) {
            it.next().OooO0O0(interfaceC3854ew, assertionFailedError);
        }
    }

    public synchronized void OooO0OO(InterfaceC3965hw interfaceC3965hw) {
        this.OooO0OO.add(interfaceC3965hw);
    }

    public synchronized int OooO0o() {
        return this.OooO0O0.size();
    }

    public void OooO0o0(InterfaceC3854ew interfaceC3854ew) {
        Iterator<InterfaceC3965hw> it = OooO0Oo().iterator();
        while (it.hasNext()) {
            it.next().OooO0OO(interfaceC3854ew);
        }
    }

    public synchronized Enumeration<C3928gw> OooO0oO() {
        return Collections.enumeration(this.OooO0O0);
    }

    public synchronized int OooO0oo() {
        return this.OooO00o.size();
    }

    public synchronized void OooOO0(InterfaceC3965hw interfaceC3965hw) {
        this.OooO0OO.remove(interfaceC3965hw);
    }

    public void OooOO0O(AbstractC3891fw abstractC3891fw) {
        OooOOOO(abstractC3891fw);
        OooOOO0(abstractC3891fw, new OooO00o(abstractC3891fw));
        OooO0o0(abstractC3891fw);
    }

    public synchronized int OooOO0o() {
        return this.OooO0Oo;
    }

    public synchronized boolean OooOOO() {
        return this.OooO0o0;
    }

    public void OooOOO0(InterfaceC3854ew interfaceC3854ew, InterfaceC3817dw interfaceC3817dw) {
        try {
            interfaceC3817dw.OooO00o();
        } catch (ThreadDeath e) {
            throw e;
        } catch (AssertionFailedError e2) {
            OooO0O0(interfaceC3854ew, e2);
        } catch (Throwable th) {
            OooO00o(interfaceC3854ew, th);
        }
    }

    public void OooOOOO(InterfaceC3854ew interfaceC3854ew) {
        int iOooO00o = interfaceC3854ew.OooO00o();
        synchronized (this) {
            this.OooO0Oo += iOooO00o;
        }
        Iterator<InterfaceC3965hw> it = OooO0Oo().iterator();
        while (it.hasNext()) {
            it.next().OooO0Oo(interfaceC3854ew);
        }
    }

    public synchronized void OooOOOo() {
        this.OooO0o0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean OooOOo0() {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.OooO0oo()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            int r0 = r1.OooO0o()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4002iw.OooOOo0():boolean");
    }
}
