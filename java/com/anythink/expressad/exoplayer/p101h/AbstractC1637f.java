package com.anythink.expressad.exoplayer.p101h;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1651t;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1637f<T> extends AbstractC1634c {

    /* JADX INFO: renamed from: a */
    private final HashMap<T, b> f8860a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private InterfaceC1610h f8861b;

    /* JADX INFO: renamed from: c */
    private Handler f8862c;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.f$1 */
    public class AnonymousClass1 implements InterfaceC1650s.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f8863a;

        public AnonymousClass1(Object obj) {
            obj = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s.b
        /* JADX INFO: renamed from: a */
        public final void mo7375a(InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
            AbstractC1637f.this.mo7230a(obj, interfaceC1650s, abstractC1499ae, obj);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.f$a */
    public final class a implements InterfaceC1651t {

        /* JADX INFO: renamed from: b */
        @Nullable
        private final Object f8866b;

        /* JADX INFO: renamed from: c */
        private InterfaceC1651t.a f8867c;

        public a(@Nullable Object obj) {
            this.f8867c = AbstractC1637f.this.m7353a((InterfaceC1650s.a) null);
            this.f8866b = obj;
        }

        /* JADX INFO: renamed from: a */
        private InterfaceC1651t.c m7376a(InterfaceC1651t.c cVar) {
            long jMo7370a = AbstractC1637f.this.mo7370a(cVar.f9061f);
            long jMo7370a2 = AbstractC1637f.this.mo7370a(cVar.f9062g);
            return (jMo7370a == cVar.f9061f && jMo7370a2 == cVar.f9062g) ? cVar : new InterfaceC1651t.c(cVar.f9056a, cVar.f9057b, cVar.f9058c, cVar.f9059d, cVar.f9060e, jMo7370a, jMo7370a2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: d */
        private boolean m7377d(int i, @Nullable InterfaceC1650s.a aVar) {
            InterfaceC1650s.a aVarMo7226a;
            if (aVar != null) {
                aVarMo7226a = AbstractC1637f.this.mo7226a(this.f8866b, aVar);
                if (aVarMo7226a == null) {
                    return false;
                }
            } else {
                aVarMo7226a = null;
            }
            int iMo7372a = AbstractC1637f.this.mo7372a(this.f8866b, i);
            InterfaceC1651t.a aVar2 = this.f8867c;
            if (aVar2.f9016a == iMo7372a && C1717af.m8085a(aVar2.f9017b, aVarMo7226a)) {
                return true;
            }
            this.f8867c = AbstractC1637f.this.m7352a(iMo7372a, aVarMo7226a);
            return true;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: a */
        public final void mo6167a(int i, InterfaceC1650s.a aVar) {
            if (m7377d(i, aVar)) {
                this.f8867c.m7471a();
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: a */
        public final void mo6168a(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar) {
            if (m7377d(i, aVar)) {
                this.f8867c.m7475a(bVar, m7376a(cVar));
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: a */
        public final void mo6169a(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar, IOException iOException, boolean z) {
            if (m7377d(i, aVar)) {
                this.f8867c.m7476a(bVar, m7376a(cVar), iOException, z);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: a */
        public final void mo6170a(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.c cVar) {
            if (m7377d(i, aVar)) {
                this.f8867c.m7477a(m7376a(cVar));
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: b */
        public final void mo6179b(int i, InterfaceC1650s.a aVar) {
            if (m7377d(i, aVar)) {
                this.f8867c.m7483b();
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: b */
        public final void mo6180b(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar) {
            if (m7377d(i, aVar)) {
                this.f8867c.m7484b(bVar, m7376a(cVar));
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: b */
        public final void mo6181b(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.c cVar) {
            if (m7377d(i, aVar)) {
                this.f8867c.m7485b(m7376a(cVar));
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: c */
        public final void mo6187c(int i, InterfaceC1650s.a aVar) {
            if (m7377d(i, aVar)) {
                this.f8867c.m7487c();
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1651t
        /* JADX INFO: renamed from: c */
        public final void mo6188c(int i, @Nullable InterfaceC1650s.a aVar, InterfaceC1651t.b bVar, InterfaceC1651t.c cVar) {
            if (m7377d(i, aVar)) {
                this.f8867c.m7488c(bVar, m7376a(cVar));
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1650s f8868a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1650s.b f8869b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC1651t f8870c;

        public b(InterfaceC1650s interfaceC1650s, InterfaceC1650s.b bVar, InterfaceC1651t interfaceC1651t) {
            this.f8868a = interfaceC1650s;
            this.f8869b = bVar;
            this.f8870c = interfaceC1651t;
        }
    }

    /* JADX INFO: renamed from: a */
    public int mo7372a(@Nullable T t, int i) {
        return i;
    }

    /* JADX INFO: renamed from: a */
    public long mo7370a(long j) {
        return j;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC1650s.a mo7226a(@Nullable T t, InterfaceC1650s.a aVar) {
        return aVar;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    @CallSuper
    /* JADX INFO: renamed from: a */
    public void mo7227a() {
        for (b bVar : this.f8860a.values()) {
            bVar.f8868a.mo7356a(bVar.f8869b);
            bVar.f8868a.mo7357a(bVar.f8870c);
        }
        this.f8860a.clear();
        this.f8861b = null;
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    @CallSuper
    /* JADX INFO: renamed from: a */
    public void mo7229a(InterfaceC1610h interfaceC1610h, boolean z) {
        this.f8861b = interfaceC1610h;
        this.f8862c = new Handler();
    }

    /* JADX INFO: renamed from: a */
    public final void m7373a(@Nullable T t) {
        b bVarRemove = this.f8860a.remove(t);
        bVarRemove.f8868a.mo7356a(bVarRemove.f8869b);
        bVarRemove.f8868a.mo7357a(bVarRemove.f8870c);
    }

    /* JADX INFO: renamed from: a */
    public final void m7374a(@Nullable T t, InterfaceC1650s interfaceC1650s) {
        C1711a.m8010a(!this.f8860a.containsKey(t));
        AnonymousClass1 anonymousClass1 = new InterfaceC1650s.b() { // from class: com.anythink.expressad.exoplayer.h.f.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f8863a;

            public AnonymousClass1(Object t2) {
                obj = t2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s.b
            /* JADX INFO: renamed from: a */
            public final void mo7375a(InterfaceC1650s interfaceC1650s2, AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
                AbstractC1637f.this.mo7230a(obj, interfaceC1650s2, abstractC1499ae, obj);
            }
        };
        a aVar = new a(t2);
        this.f8860a.put(t2, new b(interfaceC1650s, anonymousClass1, aVar));
        interfaceC1650s.mo7354a(this.f8862c, aVar);
        interfaceC1650s.mo7358a(this.f8861b, false, anonymousClass1);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7230a(@Nullable T t, InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj);

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    @CallSuper
    /* JADX INFO: renamed from: b */
    public void mo7286b() {
        Iterator<b> it = this.f8860a.values().iterator();
        while (it.hasNext()) {
            it.next().f8868a.mo7286b();
        }
    }
}
