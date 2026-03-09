package p285z2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import p285z2.InterfaceC4526x1;

/* JADX INFO: renamed from: z2.s1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4341s1<R> implements InterfaceC4563y1<R> {
    private final InterfaceC4563y1<Drawable> OooO00o;

    /* JADX INFO: renamed from: z2.s1$OooO00o */
    public final class OooO00o implements InterfaceC4526x1<R> {
        private final InterfaceC4526x1<Drawable> OooO00o;

        public OooO00o(InterfaceC4526x1<Drawable> interfaceC4526x1) {
            this.OooO00o = interfaceC4526x1;
        }

        @Override // p285z2.InterfaceC4526x1
        public boolean OooO00o(R r, InterfaceC4526x1.OooO00o oooO00o) {
            return this.OooO00o.OooO00o(new BitmapDrawable(oooO00o.getView().getResources(), AbstractC4341s1.this.OooO0O0(r)), oooO00o);
        }
    }

    public AbstractC4341s1(InterfaceC4563y1<Drawable> interfaceC4563y1) {
        this.OooO00o = interfaceC4563y1;
    }

    @Override // p285z2.InterfaceC4563y1
    public InterfaceC4526x1<R> OooO00o(DataSource dataSource, boolean z) {
        return new OooO00o(this.OooO00o.OooO00o(dataSource, z));
    }

    public abstract Bitmap OooO0O0(R r);
}
