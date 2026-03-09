package p285z2;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import p285z2.C3768ck;

/* JADX INFO: renamed from: z2.dk */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3805dk extends C3768ck.OooO00o {

    /* JADX INFO: renamed from: z2.dk$OooO */
    public static class OooO {
        public static final float OooO0Oo = Float.MAX_VALUE;
        public float OooO00o;
        public float OooO0O0;
        public float OooO0OO;

        private OooO() {
        }

        public OooO(float f, float f2, float f3) {
            this.OooO00o = f;
            this.OooO0O0 = f2;
            this.OooO0OO = f3;
        }

        public /* synthetic */ OooO(OooO00o oooO00o) {
            this();
        }

        public OooO(OooO oooO) {
            this(oooO.OooO00o, oooO.OooO0O0, oooO.OooO0OO);
        }

        public boolean OooO00o() {
            return this.OooO0OO == Float.MAX_VALUE;
        }

        public void OooO0O0(float f, float f2, float f3) {
            this.OooO00o = f;
            this.OooO0O0 = f2;
            this.OooO0OO = f3;
        }

        public void OooO0OO(OooO oooO) {
            OooO0O0(oooO.OooO00o, oooO.OooO0O0, oooO.OooO0OO);
        }
    }

    /* JADX INFO: renamed from: z2.dk$OooO0O0 */
    public static class OooO0O0 implements TypeEvaluator<OooO> {
        public static final TypeEvaluator<OooO> OooO0O0 = new OooO0O0();
        private final OooO OooO00o = new OooO();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: OooO00o */
        public OooO evaluate(float f, OooO oooO, OooO oooO2) {
            this.OooO00o.OooO0O0(C4582yk.OooO0Oo(oooO.OooO00o, oooO2.OooO00o, f), C4582yk.OooO0Oo(oooO.OooO0O0, oooO2.OooO0O0, f), C4582yk.OooO0Oo(oooO.OooO0OO, oooO2.OooO0OO, f));
            return this.OooO00o;
        }
    }

    /* JADX INFO: renamed from: z2.dk$OooO0OO */
    public static class OooO0OO extends Property<InterfaceC3805dk, OooO> {
        public static final Property<InterfaceC3805dk, OooO> OooO00o = new OooO0OO("circularReveal");

        private OooO0OO(String str) {
            super(OooO.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: OooO00o */
        public OooO get(InterfaceC3805dk interfaceC3805dk) {
            return interfaceC3805dk.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: OooO0O0 */
        public void set(InterfaceC3805dk interfaceC3805dk, OooO oooO) {
            interfaceC3805dk.setRevealInfo(oooO);
        }
    }

    /* JADX INFO: renamed from: z2.dk$OooO0o */
    public static class OooO0o extends Property<InterfaceC3805dk, Integer> {
        public static final Property<InterfaceC3805dk, Integer> OooO00o = new OooO0o("circularRevealScrimColor");

        private OooO0o(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: OooO00o */
        public Integer get(InterfaceC3805dk interfaceC3805dk) {
            return Integer.valueOf(interfaceC3805dk.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: OooO0O0 */
        public void set(InterfaceC3805dk interfaceC3805dk, Integer num) {
            interfaceC3805dk.setCircularRevealScrimColor(num.intValue());
        }
    }

    void OooO00o();

    void OooO0O0();

    void draw(Canvas canvas);

    @Nullable
    Drawable getCircularRevealOverlayDrawable();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    OooO getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i);

    void setRevealInfo(@Nullable OooO oooO);
}
