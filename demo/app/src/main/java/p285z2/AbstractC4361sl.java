package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.sl */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4361sl {
    private final AbstractC4509wl OooO00o;

    public AbstractC4361sl(AbstractC4509wl abstractC4509wl) {
        this.OooO00o = abstractC4509wl;
    }

    public abstract AbstractC4361sl OooO00o(AbstractC4509wl abstractC4509wl);

    public abstract C3772co OooO0O0() throws NotFoundException;

    public abstract C3735bo OooO0OO(int i, C3735bo c3735bo) throws NotFoundException;

    public final int OooO0Oo() {
        return this.OooO00o.OooO0O0();
    }

    public final int OooO0o() {
        return this.OooO00o.OooO0o0();
    }

    public final AbstractC4509wl OooO0o0() {
        return this.OooO00o;
    }
}
