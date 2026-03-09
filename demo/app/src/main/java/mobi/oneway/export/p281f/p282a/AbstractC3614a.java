package mobi.oneway.export.p281f.p282a;

import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.EventType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.p275b.p277b.InterfaceC3593d;
import mobi.oneway.export.p281f.C3613a;
import mobi.oneway.export.p281f.C3625e;

/* JADX INFO: renamed from: mobi.oneway.export.f.a.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3614a {

    /* JADX INFO: renamed from: a */
    public int f19738a;

    /* JADX INFO: renamed from: b */
    public String f19739b;

    /* JADX INFO: renamed from: c */
    public String f19740c;

    /* JADX INFO: renamed from: d */
    public C3625e f19741d;

    /* JADX INFO: renamed from: e */
    public InterfaceC3593d f19742e;

    public AbstractC3614a(C3613a c3613a) {
        this.f19738a = c3613a.m16823a();
        this.f19739b = c3613a.m16844f();
        this.f19740c = c3613a.m16845g();
        this.f19741d = new C3625e(mo16852c(), c3613a);
    }

    /* JADX INFO: renamed from: a */
    public String m16846a() {
        return this.f19739b;
    }

    /* JADX INFO: renamed from: a */
    public void m16847a(InterfaceC3593d interfaceC3593d) {
        this.f19742e = interfaceC3593d;
    }

    /* JADX INFO: renamed from: a */
    public void m16848a(EventType eventType) {
        this.f19741d.m16888a(eventType, null);
    }

    /* JADX INFO: renamed from: a */
    public void m16849a(OnewaySdkError onewaySdkError, String str) {
        this.f19741d.m16889a(EventType.adFail, onewaySdkError, str);
    }

    /* JADX INFO: renamed from: b */
    public String m16850b() {
        return this.f19740c;
    }

    /* JADX INFO: renamed from: b */
    public void m16851b(OnewaySdkError onewaySdkError, String str) {
        InterfaceC3593d interfaceC3593d = this.f19742e;
        if (interfaceC3593d != null) {
            interfaceC3593d.mo16699a(this.f19739b, onewaySdkError, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract AdType mo16852c();
}
