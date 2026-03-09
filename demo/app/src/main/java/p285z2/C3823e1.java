package p285z2;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: z2.e1 */
/* JADX INFO: loaded from: classes.dex */
public class C3823e1 {
    private static final oO000O0<?, ?, ?> OooO0OO = new oO000O0<>(Object.class, Object.class, Object.class, Collections.singletonList(new oO0Oo(Object.class, Object.class, Object.class, Collections.emptyList(), new C3859f0(), null)), null);
    private final ArrayMap<C4268q2, oO000O0<?, ?, ?>> OooO00o = new ArrayMap<>();
    private final AtomicReference<C4268q2> OooO0O0 = new AtomicReference<>();

    private C4268q2 OooO0O0(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C4268q2 andSet = this.OooO0O0.getAndSet(null);
        if (andSet == null) {
            andSet = new C4268q2();
        }
        andSet.OooO0O0(cls, cls2, cls3);
        return andSet;
    }

    @Nullable
    public <Data, TResource, Transcode> oO000O0<Data, TResource, Transcode> OooO00o(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        oO000O0<Data, TResource, Transcode> oo000o0;
        C4268q2 c4268q2OooO0O0 = OooO0O0(cls, cls2, cls3);
        synchronized (this.OooO00o) {
            oo000o0 = (oO000O0) this.OooO00o.get(c4268q2OooO0O0);
        }
        this.OooO0O0.set(c4268q2OooO0O0);
        return oo000o0;
    }

    public boolean OooO0OO(@Nullable oO000O0<?, ?, ?> oo000o0) {
        return OooO0OO.equals(oo000o0);
    }

    public void OooO0Oo(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable oO000O0<?, ?, ?> oo000o0) {
        synchronized (this.OooO00o) {
            ArrayMap<C4268q2, oO000O0<?, ?, ?>> arrayMap = this.OooO00o;
            C4268q2 c4268q2 = new C4268q2(cls, cls2, cls3);
            if (oo000o0 == null) {
                oo000o0 = OooO0OO;
            }
            arrayMap.put(c4268q2, oo000o0);
        }
    }
}
