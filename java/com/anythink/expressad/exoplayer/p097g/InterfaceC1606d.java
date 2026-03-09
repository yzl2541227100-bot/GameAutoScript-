package com.anythink.expressad.exoplayer.p097g;

import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p097g.p098a.C1584b;
import com.anythink.expressad.exoplayer.p097g.p099b.C1592g;
import com.anythink.expressad.exoplayer.p097g.p100c.C1601c;
import com.anythink.expressad.exoplayer.p107k.C1732o;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1606d {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1606d f8610a = new InterfaceC1606d() { // from class: com.anythink.expressad.exoplayer.g.d.1
        @Override // com.anythink.expressad.exoplayer.p097g.InterfaceC1606d
        /* JADX INFO: renamed from: a */
        public final boolean mo7169a(C1753m c1753m) {
            String str = c1753m.f9971h;
            return C1732o.f9714V.equals(str) || C1732o.f9728ai.equals(str) || C1732o.f9726ag.equals(str);
        }

        @Override // com.anythink.expressad.exoplayer.p097g.InterfaceC1606d
        /* JADX INFO: renamed from: b */
        public final InterfaceC1585b mo7170b(C1753m c1753m) {
            String str = c1753m.f9971h;
            str.hashCode();
            switch (str) {
                case "application/id3":
                    return new C1592g();
                case "application/x-emsg":
                    return new C1584b();
                case "application/x-scte35":
                    return new C1601c();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    };

    /* JADX INFO: renamed from: a */
    boolean mo7169a(C1753m c1753m);

    /* JADX INFO: renamed from: b */
    InterfaceC1585b mo7170b(C1753m c1753m);
}
