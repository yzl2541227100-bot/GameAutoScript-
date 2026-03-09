package p285z2;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: z2.x2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4527x2 {
    private static final boolean OooO00o = false;

    /* JADX INFO: renamed from: z2.x2$OooO0O0 */
    public static class OooO0O0 extends AbstractC4527x2 {
        private volatile RuntimeException OooO0O0;

        public OooO0O0() {
            super();
        }

        @Override // p285z2.AbstractC4527x2
        public void OooO0O0(boolean z) {
            this.OooO0O0 = z ? new RuntimeException("Released") : null;
        }

        @Override // p285z2.AbstractC4527x2
        public void OooO0OO() {
            if (this.OooO0O0 != null) {
                throw new IllegalStateException("Already released", this.OooO0O0);
            }
        }
    }

    /* JADX INFO: renamed from: z2.x2$OooO0OO */
    public static class OooO0OO extends AbstractC4527x2 {
        private volatile boolean OooO0O0;

        public OooO0OO() {
            super();
        }

        @Override // p285z2.AbstractC4527x2
        public void OooO0O0(boolean z) {
            this.OooO0O0 = z;
        }

        @Override // p285z2.AbstractC4527x2
        public void OooO0OO() {
            if (this.OooO0O0) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private AbstractC4527x2() {
    }

    @NonNull
    public static AbstractC4527x2 OooO00o() {
        return new OooO0OO();
    }

    public abstract void OooO0O0(boolean z);

    public abstract void OooO0OO();
}
