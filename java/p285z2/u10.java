package p285z2;

import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u10 implements w10 {
    private final Class OooO00o;
    private final Class<? extends w10> OooO0O0;
    private final boolean OooO0OO;

    public u10(Class cls, Class<? extends w10> cls2, boolean z) {
        this.OooO00o = cls;
        this.OooO0O0 = cls2;
        this.OooO0OO = z;
    }

    @Override // p285z2.w10
    public w10 OooO0O0() {
        Class<? extends w10> cls = this.OooO0O0;
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p285z2.w10
    public boolean OooO0OO() {
        return this.OooO0OO;
    }

    @Override // p285z2.w10
    public Class OooO0Oo() {
        return this.OooO00o;
    }

    public r10 OooO0o(String str, Class<?> cls, ThreadMode threadMode) {
        return OooO0oO(str, cls, threadMode, 0, false);
    }

    public r10 OooO0o0(String str, Class<?> cls) {
        return OooO0oO(str, cls, ThreadMode.POSTING, 0, false);
    }

    public r10 OooO0oO(String str, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        try {
            return new r10(this.OooO00o.getDeclaredMethod(str, cls), cls, threadMode, i, z);
        } catch (NoSuchMethodException e) {
            throw new EventBusException("Could not find subscriber method in " + this.OooO00o + ". Maybe a missing ProGuard rule?", e);
        }
    }
}
