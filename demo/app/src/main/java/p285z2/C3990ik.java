package p285z2;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C2754R;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: z2.ik */
/* JADX INFO: loaded from: classes2.dex */
public class C3990ik {
    public static final long OooOoo = 100;
    public static final long OooOooO = 100;
    public static final int OooOooo = 0;
    private static final float Oooo0 = 0.0f;
    public static final int Oooo000 = 1;
    public static final int Oooo00O = 2;
    private static final float Oooo00o = 0.0f;
    private static final float Oooo0O0 = 0.0f;
    private static final float Oooo0OO = 1.0f;
    private static final float Oooo0o = 1.0f;
    private static final float Oooo0o0 = 1.0f;
    private float OooO;

    @Nullable
    public Animator OooO0O0;

    @Nullable
    public C4026jj OooO0OO;

    @Nullable
    public C4026jj OooO0Oo;

    @Nullable
    private C4026jj OooO0o;

    @Nullable
    private C4026jj OooO0o0;
    private final C4397tk OooO0oO;
    public C3806dl OooO0oo;
    public Drawable OooOO0;
    public Drawable OooOO0O;
    public C4064kk OooOO0o;
    public float OooOOO;
    public Drawable OooOOO0;
    public float OooOOOO;
    public float OooOOOo;
    public int OooOOo0;
    private ArrayList<Animator.AnimatorListener> OooOOoo;
    public final VisibilityAwareImageButton OooOo0;
    private ArrayList<Animator.AnimatorListener> OooOo00;
    public final InterfaceC3843el OooOo0O;
    private ViewTreeObserver.OnPreDrawListener OooOoOO;
    public static final TimeInterpolator OooOoo0 = C3767cj.OooO0OO;
    public static final int[] Oooo0oO = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] Oooo0oo = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] Oooo = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] OoooO00 = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] OoooO0 = {R.attr.state_enabled};
    public static final int[] OoooO0O = new int[0];
    public int OooO00o = 0;
    public float OooOOo = 1.0f;
    private final Rect OooOo0o = new Rect();
    private final RectF OooOo = new RectF();
    private final RectF OooOoO0 = new RectF();
    private final Matrix OooOoO = new Matrix();

    /* JADX INFO: renamed from: z2.ik$OooO */
    public class OooO extends OooOOO {
        public OooO() {
            super(C3990ik.this, null);
        }

        @Override // p285z2.C3990ik.OooOOO
        public float OooO00o() {
            C3990ik c3990ik = C3990ik.this;
            return c3990ik.OooOOO + c3990ik.OooOOOO;
        }
    }

    /* JADX INFO: renamed from: z2.ik$OooO00o */
    public class OooO00o extends AnimatorListenerAdapter {
        private boolean OooO00o;
        public final /* synthetic */ boolean OooO0O0;
        public final /* synthetic */ OooOO0O OooO0OO;

        public OooO00o(boolean z, OooOO0O oooOO0O) {
            this.OooO0O0 = z;
            this.OooO0OO = oooOO0O;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.OooO00o = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3990ik c3990ik = C3990ik.this;
            c3990ik.OooO00o = 0;
            c3990ik.OooO0O0 = null;
            if (this.OooO00o) {
                return;
            }
            VisibilityAwareImageButton visibilityAwareImageButton = c3990ik.OooOo0;
            boolean z = this.OooO0O0;
            visibilityAwareImageButton.OooO0OO(z ? 8 : 4, z);
            OooOO0O oooOO0O = this.OooO0OO;
            if (oooOO0O != null) {
                oooOO0O.OooO0O0();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C3990ik.this.OooOo0.OooO0OO(0, this.OooO0O0);
            C3990ik c3990ik = C3990ik.this;
            c3990ik.OooO00o = 1;
            c3990ik.OooO0O0 = animator;
            this.OooO00o = false;
        }
    }

    /* JADX INFO: renamed from: z2.ik$OooO0O0 */
    public class OooO0O0 extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean OooO00o;
        public final /* synthetic */ OooOO0O OooO0O0;

        public OooO0O0(boolean z, OooOO0O oooOO0O) {
            this.OooO00o = z;
            this.OooO0O0 = oooOO0O;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3990ik c3990ik = C3990ik.this;
            c3990ik.OooO00o = 0;
            c3990ik.OooO0O0 = null;
            OooOO0O oooOO0O = this.OooO0O0;
            if (oooOO0O != null) {
                oooOO0O.OooO00o();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C3990ik.this.OooOo0.OooO0OO(0, this.OooO00o);
            C3990ik c3990ik = C3990ik.this;
            c3990ik.OooO00o = 2;
            c3990ik.OooO0O0 = animator;
        }
    }

    /* JADX INFO: renamed from: z2.ik$OooO0OO */
    public class OooO0OO implements ViewTreeObserver.OnPreDrawListener {
        public OooO0OO() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C3990ik.this.OooOooO();
            return true;
        }
    }

    /* JADX INFO: renamed from: z2.ik$OooO0o */
    public class OooO0o extends OooOOO {
        public OooO0o() {
            super(C3990ik.this, null);
        }

        @Override // p285z2.C3990ik.OooOOO
        public float OooO00o() {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: z2.ik$OooOO0 */
    public class OooOO0 extends OooOOO {
        public OooOO0() {
            super(C3990ik.this, null);
        }

        @Override // p285z2.C3990ik.OooOOO
        public float OooO00o() {
            C3990ik c3990ik = C3990ik.this;
            return c3990ik.OooOOO + c3990ik.OooOOOo;
        }
    }

    /* JADX INFO: renamed from: z2.ik$OooOO0O */
    public interface OooOO0O {
        void OooO00o();

        void OooO0O0();
    }

    /* JADX INFO: renamed from: z2.ik$OooOOO */
    public abstract class OooOOO extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean OooO00o;
        private float OooO0O0;
        private float OooO0OO;

        private OooOOO() {
        }

        public /* synthetic */ OooOOO(C3990ik c3990ik, OooO00o oooO00o) {
            this();
        }

        public abstract float OooO00o();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3990ik.this.OooO0oo.OooOOOO(this.OooO0OO);
            this.OooO00o = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.OooO00o) {
                this.OooO0O0 = C3990ik.this.OooO0oo.OooOO0();
                this.OooO0OO = OooO00o();
                this.OooO00o = true;
            }
            C3806dl c3806dl = C3990ik.this.OooO0oo;
            float f = this.OooO0O0;
            c3806dl.OooOOOO(f + ((this.OooO0OO - f) * valueAnimator.getAnimatedFraction()));
        }
    }

    /* JADX INFO: renamed from: z2.ik$OooOOO0 */
    public class OooOOO0 extends OooOOO {
        public OooOOO0() {
            super(C3990ik.this, null);
        }

        @Override // p285z2.C3990ik.OooOOO
        public float OooO00o() {
            return C3990ik.this.OooOOO;
        }
    }

    public C3990ik(VisibilityAwareImageButton visibilityAwareImageButton, InterfaceC3843el interfaceC3843el) {
        this.OooOo0 = visibilityAwareImageButton;
        this.OooOo0O = interfaceC3843el;
        C4397tk c4397tk = new C4397tk();
        this.OooO0oO = c4397tk;
        c4397tk.OooO00o(Oooo0oO, OooO0o(new OooOO0()));
        c4397tk.OooO00o(Oooo0oo, OooO0o(new OooO()));
        c4397tk.OooO00o(Oooo, OooO0o(new OooO()));
        c4397tk.OooO00o(OoooO00, OooO0o(new OooO()));
        c4397tk.OooO00o(OoooO0, OooO0o(new OooOOO0()));
        c4397tk.OooO00o(OoooO0O, OooO0o(new OooO0o()));
        this.OooO = visibilityAwareImageButton.getRotation();
    }

    private void OooO0OO(float f, Matrix matrix) {
        matrix.reset();
        if (this.OooOo0.getDrawable() == null || this.OooOOo0 == 0) {
            return;
        }
        RectF rectF = this.OooOo;
        RectF rectF2 = this.OooOoO0;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i = this.OooOOo0;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.OooOOo0;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    @NonNull
    private AnimatorSet OooO0Oo(@NonNull C4026jj c4026jj, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.OooOo0, (Property<VisibilityAwareImageButton, Float>) View.ALPHA, f);
        c4026jj.OooO0o0("opacity").OooO00o(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.OooOo0, (Property<VisibilityAwareImageButton, Float>) View.SCALE_X, f2);
        c4026jj.OooO0o0("scale").OooO00o(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.OooOo0, (Property<VisibilityAwareImageButton, Float>) View.SCALE_Y, f2);
        c4026jj.OooO0o0("scale").OooO00o(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        OooO0OO(f3, this.OooOoO);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.OooOo0, new C3952hj(), new C3989ij(), new Matrix(this.OooOoO));
        c4026jj.OooO0o0("iconScale").OooO00o(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C3804dj.OooO00o(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator OooO0o(@NonNull OooOOO oooOOO) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(OooOoo0);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(oooOOO);
        valueAnimator.addUpdateListener(oooOOO);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void OooO0oo() {
        if (this.OooOoOO == null) {
            this.OooOoOO = new OooO0OO();
        }
    }

    private C4026jj OooOO0() {
        if (this.OooO0o == null) {
            this.OooO0o = C4026jj.OooO0OO(this.OooOo0.getContext(), C2754R.animator.design_fab_hide_motion_spec);
        }
        return this.OooO0o;
    }

    private C4026jj OooOO0O() {
        if (this.OooO0o0 == null) {
            this.OooO0o0 = C4026jj.OooO0OO(this.OooOo0.getContext(), C2754R.animator.design_fab_show_motion_spec);
        }
        return this.OooO0o0;
    }

    private boolean OoooO0O() {
        return ViewCompat.isLaidOut(this.OooOo0) && !this.OooOo0.isInEditMode();
    }

    private void OoooOO0() {
        VisibilityAwareImageButton visibilityAwareImageButton;
        int i;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.OooO % 90.0f != 0.0f) {
                i = 1;
                if (this.OooOo0.getLayerType() != 1) {
                    visibilityAwareImageButton = this.OooOo0;
                    visibilityAwareImageButton.setLayerType(i, null);
                }
            } else if (this.OooOo0.getLayerType() != 0) {
                visibilityAwareImageButton = this.OooOo0;
                i = 0;
                visibilityAwareImageButton.setLayerType(i, null);
            }
        }
        C3806dl c3806dl = this.OooO0oo;
        if (c3806dl != null) {
            c3806dl.OooOOO(-this.OooO);
        }
        C4064kk c4064kk = this.OooOO0o;
        if (c4064kk != null) {
            c4064kk.OooO0o0(-this.OooO);
        }
    }

    public final Drawable OooO() {
        return this.OooOOO0;
    }

    public void OooO00o(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.OooOo00 == null) {
            this.OooOo00 = new ArrayList<>();
        }
        this.OooOo00.add(animatorListener);
    }

    public void OooO0O0(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.OooOOoo == null) {
            this.OooOOoo = new ArrayList<>();
        }
        this.OooOOoo.add(animatorListener);
    }

    public C4064kk OooO0o0(int i, ColorStateList colorStateList) {
        Context context = this.OooOo0.getContext();
        C4064kk c4064kkOooOo0O = OooOo0O();
        c4064kkOooOo0O.OooO0Oo(ContextCompat.getColor(context, C2754R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, C2754R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, C2754R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, C2754R.color.design_fab_stroke_end_outer_color));
        c4064kkOooOo0O.OooO0OO(i);
        c4064kkOooOo0O.OooO0O0(colorStateList);
        return c4064kkOooOo0O;
    }

    public GradientDrawable OooO0oO() {
        GradientDrawable gradientDrawableOooOo0o = OooOo0o();
        gradientDrawableOooOo0o.setShape(1);
        gradientDrawableOooOo0o.setColor(-1);
        return gradientDrawableOooOo0o;
    }

    public float OooOO0o() {
        return this.OooOOO;
    }

    public float OooOOO() {
        return this.OooOOOO;
    }

    @Nullable
    public final C4026jj OooOOO0() {
        return this.OooO0Oo;
    }

    public void OooOOOO(Rect rect) {
        this.OooO0oo.getPadding(rect);
    }

    public float OooOOOo() {
        return this.OooOOOo;
    }

    public void OooOOo(@Nullable OooOO0O oooOO0O, boolean z) {
        if (OooOOoo()) {
            return;
        }
        Animator animator = this.OooO0O0;
        if (animator != null) {
            animator.cancel();
        }
        if (!OoooO0O()) {
            this.OooOo0.OooO0OO(z ? 8 : 4, z);
            if (oooOO0O != null) {
                oooOO0O.OooO0O0();
                return;
            }
            return;
        }
        C4026jj c4026jjOooOO0 = this.OooO0Oo;
        if (c4026jjOooOO0 == null) {
            c4026jjOooOO0 = OooOO0();
        }
        AnimatorSet animatorSetOooO0Oo = OooO0Oo(c4026jjOooOO0, 0.0f, 0.0f, 0.0f);
        animatorSetOooO0Oo.addListener(new OooO00o(z, oooOO0O));
        ArrayList<Animator.AnimatorListener> arrayList = this.OooOo00;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetOooO0Oo.addListener(it.next());
            }
        }
        animatorSetOooO0Oo.start();
    }

    @Nullable
    public final C4026jj OooOOo0() {
        return this.OooO0OO;
    }

    public boolean OooOOoo() {
        return this.OooOo0.getVisibility() == 0 ? this.OooO00o == 1 : this.OooO00o != 2;
    }

    public void OooOo() {
        if (Oooo00O()) {
            OooO0oo();
            this.OooOo0.getViewTreeObserver().addOnPreDrawListener(this.OooOoOO);
        }
    }

    public void OooOo0() {
        this.OooO0oO.OooO0OO();
    }

    public boolean OooOo00() {
        return this.OooOo0.getVisibility() != 0 ? this.OooO00o == 2 : this.OooO00o != 1;
    }

    public C4064kk OooOo0O() {
        return new C4064kk();
    }

    public GradientDrawable OooOo0o() {
        return new GradientDrawable();
    }

    public void OooOoO() {
        if (this.OooOoOO != null) {
            this.OooOo0.getViewTreeObserver().removeOnPreDrawListener(this.OooOoOO);
            this.OooOoOO = null;
        }
    }

    public void OooOoO0() {
    }

    public void OooOoOO(int[] iArr) {
        this.OooO0oO.OooO0Oo(iArr);
    }

    public void OooOoo(Rect rect) {
    }

    public void OooOoo0(float f, float f2, float f3) {
        C3806dl c3806dl = this.OooO0oo;
        if (c3806dl != null) {
            c3806dl.OooOOOo(f, this.OooOOOo + f);
            OoooOOO();
        }
    }

    public void OooOooO() {
        float rotation = this.OooOo0.getRotation();
        if (this.OooO != rotation) {
            this.OooO = rotation;
            OoooOO0();
        }
    }

    public void OooOooo(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.OooOo00;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public final void Oooo(float f) {
        if (this.OooOOOo != f) {
            this.OooOOOo = f;
            OooOoo0(this.OooOOO, this.OooOOOO, f);
        }
    }

    public void Oooo0(ColorStateList colorStateList) {
        Drawable drawable = this.OooOO0;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
        C4064kk c4064kk = this.OooOO0o;
        if (c4064kk != null) {
            c4064kk.OooO0O0(colorStateList);
        }
    }

    public void Oooo000(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.OooOOoo;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public boolean Oooo00O() {
        return true;
    }

    public void Oooo00o(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable[] drawableArr;
        Drawable drawableWrap = DrawableCompat.wrap(OooO0oO());
        this.OooOO0 = drawableWrap;
        DrawableCompat.setTintList(drawableWrap, colorStateList);
        if (mode != null) {
            DrawableCompat.setTintMode(this.OooOO0, mode);
        }
        Drawable drawableWrap2 = DrawableCompat.wrap(OooO0oO());
        this.OooOO0O = drawableWrap2;
        DrawableCompat.setTintList(drawableWrap2, C3769cl.OooO00o(colorStateList2));
        if (i > 0) {
            C4064kk c4064kkOooO0o0 = OooO0o0(i, colorStateList);
            this.OooOO0o = c4064kkOooO0o0;
            drawableArr = new Drawable[]{c4064kkOooO0o0, this.OooOO0, this.OooOO0O};
        } else {
            this.OooOO0o = null;
            drawableArr = new Drawable[]{this.OooOO0, this.OooOO0O};
        }
        this.OooOOO0 = new LayerDrawable(drawableArr);
        Context context = this.OooOo0.getContext();
        Drawable drawable = this.OooOOO0;
        float fOooO0O0 = this.OooOo0O.OooO0O0();
        float f = this.OooOOO;
        C3806dl c3806dl = new C3806dl(context, drawable, fOooO0O0, f, f + this.OooOOOo);
        this.OooO0oo = c3806dl;
        c3806dl.OooOO0O(false);
        this.OooOo0O.setBackgroundDrawable(this.OooO0oo);
    }

    public void Oooo0O0(PorterDuff.Mode mode) {
        Drawable drawable = this.OooOO0;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
        }
    }

    public final void Oooo0OO(float f) {
        if (this.OooOOO != f) {
            this.OooOOO = f;
            OooOoo0(f, this.OooOOOO, this.OooOOOo);
        }
    }

    public final void Oooo0o(float f) {
        if (this.OooOOOO != f) {
            this.OooOOOO = f;
            OooOoo0(this.OooOOO, f, this.OooOOOo);
        }
    }

    public final void Oooo0o0(@Nullable C4026jj c4026jj) {
        this.OooO0Oo = c4026jj;
    }

    public final void Oooo0oO(float f) {
        this.OooOOo = f;
        Matrix matrix = this.OooOoO;
        OooO0OO(f, matrix);
        this.OooOo0.setImageMatrix(matrix);
    }

    public final void Oooo0oo(int i) {
        if (this.OooOOo0 != i) {
            this.OooOOo0 = i;
            o000oOoO();
        }
    }

    public void OoooO(@Nullable OooOO0O oooOO0O, boolean z) {
        if (OooOo00()) {
            return;
        }
        Animator animator = this.OooO0O0;
        if (animator != null) {
            animator.cancel();
        }
        if (!OoooO0O()) {
            this.OooOo0.OooO0OO(0, z);
            this.OooOo0.setAlpha(1.0f);
            this.OooOo0.setScaleY(1.0f);
            this.OooOo0.setScaleX(1.0f);
            Oooo0oO(1.0f);
            if (oooOO0O != null) {
                oooOO0O.OooO00o();
                return;
            }
            return;
        }
        if (this.OooOo0.getVisibility() != 0) {
            this.OooOo0.setAlpha(0.0f);
            this.OooOo0.setScaleY(0.0f);
            this.OooOo0.setScaleX(0.0f);
            Oooo0oO(0.0f);
        }
        C4026jj c4026jjOooOO0O = this.OooO0OO;
        if (c4026jjOooOO0O == null) {
            c4026jjOooOO0O = OooOO0O();
        }
        AnimatorSet animatorSetOooO0Oo = OooO0Oo(c4026jjOooOO0O, 1.0f, 1.0f, 1.0f);
        animatorSetOooO0Oo.addListener(new OooO0O0(z, oooOO0O));
        ArrayList<Animator.AnimatorListener> arrayList = this.OooOOoo;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetOooO0Oo.addListener(it.next());
            }
        }
        animatorSetOooO0Oo.start();
    }

    public final void OoooO0(@Nullable C4026jj c4026jj) {
        this.OooO0OO = c4026jj;
    }

    public void OoooO00(ColorStateList colorStateList) {
        Drawable drawable = this.OooOO0O;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, C3769cl.OooO00o(colorStateList));
        }
    }

    public final void OoooOOO() {
        Rect rect = this.OooOo0o;
        OooOOOO(rect);
        OooOoo(rect);
        this.OooOo0O.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void o000oOoO() {
        Oooo0oO(this.OooOOo);
    }
}
