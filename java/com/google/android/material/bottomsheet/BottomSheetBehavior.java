package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.C2754R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int OooOoOO = 1;
    public static final int OooOoo = 3;
    public static final int OooOoo0 = 2;
    public static final int OooOooO = 4;
    public static final int OooOooo = 5;
    private static final float Oooo0 = 0.1f;
    public static final int Oooo000 = 6;
    public static final int Oooo00O = -1;
    private static final float Oooo00o = 0.5f;
    public int OooO;
    private boolean OooO00o;
    private float OooO0O0;
    private int OooO0OO;
    private boolean OooO0Oo;
    private int OooO0o;
    private int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;
    private boolean OooOO0O;
    public int OooOO0o;
    private boolean OooOOO;
    public ViewDragHelper OooOOO0;
    private int OooOOOO;
    private boolean OooOOOo;
    public WeakReference<V> OooOOo;
    public int OooOOo0;
    public WeakReference<View> OooOOoo;
    public boolean OooOo;
    private VelocityTracker OooOo0;
    private OooO0OO OooOo00;
    public int OooOo0O;
    private int OooOo0o;
    private final ViewDragHelper.Callback OooOoO;
    private Map<View, Integer> OooOoO0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OooO {
    }

    public class OooO00o implements Runnable {
        public final /* synthetic */ View OoooOoO;
        public final /* synthetic */ int OoooOoo;

        public OooO00o(View view, int i) {
            this.OoooOoO = view;
            this.OoooOoo = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.OooOo(this.OoooOoO, this.OoooOoo);
        }
    }

    public class OooO0O0 extends ViewDragHelper.Callback {
        public OooO0O0() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            int iOooO0oO = BottomSheetBehavior.this.OooO0oO();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return MathUtils.clamp(i, iOooO0oO, bottomSheetBehavior.OooOO0 ? bottomSheetBehavior.OooOOo0 : bottomSheetBehavior.OooO);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.OooOO0 ? bottomSheetBehavior.OooOOo0 : bottomSheetBehavior.OooO;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.OooOo0O(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.OooO0Oo(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:85:0x00a0, code lost:
        
            if (r9 < java.lang.Math.abs(r9 - r10.OooO)) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x00b2, code lost:
        
            if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.OooO)) goto L89;
         */
        /* JADX WARN: Removed duplicated region for block: B:92:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x00d9  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0O0.onViewReleased(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(@NonNull View view, int i) {
            WeakReference<V> weakReference;
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.OooOO0o;
            if (i2 == 1 || bottomSheetBehavior.OooOo) {
                return false;
            }
            return ((i2 == 3 && bottomSheetBehavior.OooOo0O == i && (view2 = bottomSheetBehavior.OooOOoo.get()) != null && view2.canScrollVertically(-1)) || (weakReference = BottomSheetBehavior.this.OooOOo) == null || weakReference.get() != view) ? false : true;
        }
    }

    public static abstract class OooO0OO {
        public abstract void OooO00o(@NonNull View view, float f);

        public abstract void OooO0O0(@NonNull View view, int i);
    }

    public class OooO0o implements Runnable {
        private final View OoooOoO;
        private final int OoooOoo;

        public OooO0o(View view, int i) {
            this.OoooOoO = view;
            this.OoooOoo = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper viewDragHelper = BottomSheetBehavior.this.OooOOO0;
            if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
                BottomSheetBehavior.this.OooOo0O(this.OoooOoo);
            } else {
                ViewCompat.postOnAnimation(this.OoooOoO, this);
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();
        public final int state;

        public static class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: OooO00o */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: OooO0O0 */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: OooO0OO */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    public BottomSheetBehavior() {
        this.OooO00o = true;
        this.OooOO0o = 4;
        this.OooOoO = new OooO0O0();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.OooO00o = true;
        this.OooOO0o = 4;
        this.OooOoO = new OooO0O0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2754R.styleable.BottomSheetBehavior_Layout);
        int i2 = C2754R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i2);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            OooOOoo(typedArrayObtainStyledAttributes.getDimensionPixelSize(i2, -1));
        } else {
            OooOOoo(i);
        }
        OooOOo(typedArrayObtainStyledAttributes.getBoolean(C2754R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        OooOOo0(typedArrayObtainStyledAttributes.getBoolean(C2754R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        OooOo00(typedArrayObtainStyledAttributes.getBoolean(C2754R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        typedArrayObtainStyledAttributes.recycle();
        this.OooO0O0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void OooO0OO() {
        this.OooO = this.OooO00o ? Math.max(this.OooOOo0 - this.OooO0o, this.OooO0oO) : this.OooOOo0 - this.OooO0o;
    }

    public static <V extends View> BottomSheetBehavior<V> OooO0o(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public int OooO0oO() {
        if (this.OooO00o) {
            return this.OooO0oO;
        }
        return 0;
    }

    private float OooOO0o() {
        VelocityTracker velocityTracker = this.OooOo0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.OooO0O0);
        return this.OooOo0.getYVelocity(this.OooOo0O);
    }

    private void OooOOOO() {
        this.OooOo0O = -1;
        VelocityTracker velocityTracker = this.OooOo0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.OooOo0 = null;
        }
    }

    private void OooOoO0(boolean z) {
        int iIntValue;
        int i = Build.VERSION.SDK_INT;
        WeakReference<V> weakReference = this.OooOOo;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (i >= 16 && z) {
                if (this.OooOoO0 != null) {
                    return;
                } else {
                    this.OooOoO0 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.OooOOo.get()) {
                    if (z) {
                        if (i >= 16) {
                            this.OooOoO0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        iIntValue = 4;
                    } else {
                        Map<View, Integer> map = this.OooOoO0;
                        if (map != null && map.containsKey(childAt)) {
                            iIntValue = this.OooOoO0.get(childAt).intValue();
                        }
                    }
                    ViewCompat.setImportantForAccessibility(childAt, iIntValue);
                }
            }
            if (z) {
                return;
            }
            this.OooOoO0 = null;
        }
    }

    @VisibleForTesting
    public int OooO() {
        return this.OooO0o0;
    }

    public void OooO0Oo(int i) {
        OooO0OO oooO0OO;
        float f;
        float fOooO0oO;
        V v = this.OooOOo.get();
        if (v == null || (oooO0OO = this.OooOo00) == null) {
            return;
        }
        int i2 = this.OooO;
        if (i > i2) {
            f = i2 - i;
            fOooO0oO = this.OooOOo0 - i2;
        } else {
            f = i2 - i;
            fOooO0oO = i2 - OooO0oO();
        }
        oooO0OO.OooO00o(v, f / fOooO0oO);
    }

    @VisibleForTesting
    public View OooO0o0(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewOooO0o0 = OooO0o0(viewGroup.getChildAt(i));
            if (viewOooO0o0 != null) {
                return viewOooO0o0;
            }
        }
        return null;
    }

    public final int OooO0oo() {
        if (this.OooO0Oo) {
            return -1;
        }
        return this.OooO0OO;
    }

    public boolean OooOO0() {
        return this.OooOO0O;
    }

    public final int OooOO0O() {
        return this.OooOO0o;
    }

    public boolean OooOOO() {
        return this.OooOO0;
    }

    public boolean OooOOO0() {
        return this.OooO00o;
    }

    public void OooOOOo(OooO0OO oooO0OO) {
        this.OooOo00 = oooO0OO;
    }

    public void OooOOo(boolean z) {
        this.OooOO0 = z;
    }

    public void OooOOo0(boolean z) {
        if (this.OooO00o == z) {
            return;
        }
        this.OooO00o = z;
        if (this.OooOOo != null) {
            OooO0OO();
        }
        OooOo0O((this.OooO00o && this.OooOO0o == 6) ? 3 : this.OooOO0o);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOoo(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.OooO0Oo
            if (r4 != 0) goto L15
            r3.OooO0Oo = r0
            goto L24
        Lc:
            boolean r2 = r3.OooO0Oo
            if (r2 != 0) goto L17
            int r2 = r3.OooO0OO
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = 0
            goto L24
        L17:
            r3.OooO0Oo = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.OooO0OO = r1
            int r1 = r3.OooOOo0
            int r1 = r1 - r4
            r3.OooO = r1
        L24:
            if (r0 == 0) goto L3a
            int r4 = r3.OooOO0o
            r0 = 4
            if (r4 != r0) goto L3a
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.OooOOo
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L3a
            r4.requestLayout()
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooOOoo(int):void");
    }

    public void OooOo(View view, int i) {
        int iOooO0oO;
        int i2;
        if (i == 4) {
            iOooO0oO = this.OooO;
        } else if (i == 6) {
            int i3 = this.OooO0oo;
            if (!this.OooO00o || i3 > (i2 = this.OooO0oO)) {
                iOooO0oO = i3;
            } else {
                iOooO0oO = i2;
                i = 3;
            }
        } else if (i == 3) {
            iOooO0oO = OooO0oO();
        } else {
            if (!this.OooOO0 || i != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i);
            }
            iOooO0oO = this.OooOOo0;
        }
        if (!this.OooOOO0.smoothSlideViewTo(view, view.getLeft(), iOooO0oO)) {
            OooOo0O(i);
        } else {
            OooOo0O(2);
            ViewCompat.postOnAnimation(view, new OooO0o(view, i));
        }
    }

    public final void OooOo0(int i) {
        if (i == this.OooOO0o) {
            return;
        }
        WeakReference<V> weakReference = this.OooOOo;
        if (weakReference == null) {
            if (i == 4 || i == 3 || i == 6 || (this.OooOO0 && i == 5)) {
                this.OooOO0o = i;
                return;
            }
            return;
        }
        V v = weakReference.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v)) {
            v.post(new OooO00o(v, i));
        } else {
            OooOo(v, i);
        }
    }

    public void OooOo00(boolean z) {
        this.OooOO0O = z;
    }

    public void OooOo0O(int i) {
        boolean z;
        V v;
        OooO0OO oooO0OO;
        if (this.OooOO0o == i) {
            return;
        }
        this.OooOO0o = i;
        if (i != 6 && i != 3) {
            z = (i == 5 || i == 4) ? false : true;
            v = this.OooOOo.get();
            if (v != null || (oooO0OO = this.OooOo00) == null) {
            }
            oooO0OO.OooO0O0(v, i);
            return;
        }
        OooOoO0(z);
        v = this.OooOOo.get();
        if (v != null) {
        }
    }

    public boolean OooOo0o(View view, float f) {
        if (this.OooOO0O) {
            return true;
        }
        return view.getTop() >= this.OooO && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.OooO)) / ((float) this.OooO0OO) > 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!v.isShown()) {
            this.OooOOO = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            OooOOOO();
        }
        if (this.OooOo0 == null) {
            this.OooOo0 = VelocityTracker.obtain();
        }
        this.OooOo0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.OooOo0o = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.OooOOoo;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.OooOo0o)) {
                this.OooOo0O = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.OooOo = true;
            }
            this.OooOOO = this.OooOo0O == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.OooOo0o);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.OooOo = false;
            this.OooOo0O = -1;
            if (this.OooOOO) {
                this.OooOOO = false;
                return false;
            }
        }
        if (!this.OooOOO && (viewDragHelper = this.OooOOO0) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.OooOOoo;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.OooOOO || this.OooOO0o == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.OooOOO0 == null || Math.abs(((float) this.OooOo0o) - motionEvent.getY()) <= ((float) this.OooOOO0.getTouchSlop())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0091  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, int r7) {
        /*
            r4 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r5)
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r6)
            if (r0 != 0) goto L10
            r6.setFitsSystemWindows(r1)
        L10:
            int r0 = r6.getTop()
            r5.onLayoutChild(r6, r7)
            int r7 = r5.getHeight()
            r4.OooOOo0 = r7
            boolean r7 = r4.OooO0Oo
            if (r7 == 0) goto L43
            int r7 = r4.OooO0o0
            if (r7 != 0) goto L31
            android.content.res.Resources r7 = r5.getResources()
            int r2 = com.google.android.material.C2754R.dimen.design_bottom_sheet_peek_height_min
            int r7 = r7.getDimensionPixelSize(r2)
            r4.OooO0o0 = r7
        L31:
            int r7 = r4.OooO0o0
            int r2 = r4.OooOOo0
            int r3 = r5.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            goto L45
        L43:
            int r7 = r4.OooO0OO
        L45:
            r4.OooO0o = r7
            r7 = 0
            int r2 = r4.OooOOo0
            int r3 = r6.getHeight()
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            r4.OooO0oO = r7
            int r7 = r4.OooOOo0
            r2 = 2
            int r7 = r7 / r2
            r4.OooO0oo = r7
            r4.OooO0OO()
            int r7 = r4.OooOO0o
            r3 = 3
            if (r7 != r3) goto L6b
            int r7 = r4.OooO0oO()
        L67:
            androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r7)
            goto L8d
        L6b:
            r3 = 6
            if (r7 != r3) goto L71
            int r7 = r4.OooO0oo
            goto L67
        L71:
            boolean r3 = r4.OooOO0
            if (r3 == 0) goto L7b
            r3 = 5
            if (r7 != r3) goto L7b
            int r7 = r4.OooOOo0
            goto L67
        L7b:
            r3 = 4
            if (r7 != r3) goto L81
            int r7 = r4.OooO
            goto L67
        L81:
            if (r7 == r1) goto L85
            if (r7 != r2) goto L8d
        L85:
            int r7 = r6.getTop()
            int r0 = r0 - r7
            androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r0)
        L8d:
            androidx.customview.widget.ViewDragHelper r7 = r4.OooOOO0
            if (r7 != 0) goto L99
            androidx.customview.widget.ViewDragHelper$Callback r7 = r4.OooOoO
            androidx.customview.widget.ViewDragHelper r5 = androidx.customview.widget.ViewDragHelper.create(r5, r7)
            r4.OooOOO0 = r5
        L99:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r6)
            r4.OooOOo = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.view.View r6 = r4.OooO0o0(r6)
            r5.<init>(r6)
            r4.OooOOoo = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        return view == this.OooOOoo.get() && (this.OooOO0o != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        int i4;
        if (i3 != 1 && view == this.OooOOoo.get()) {
            int top = v.getTop();
            int i5 = top - i2;
            if (i2 > 0) {
                if (i5 < OooO0oO()) {
                    iArr[1] = top - OooO0oO();
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    i4 = 3;
                    OooOo0O(i4);
                } else {
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    OooOo0O(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i6 = this.OooO;
                if (i5 <= i6 || this.OooOO0) {
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    OooOo0O(1);
                } else {
                    iArr[1] = top - i6;
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    i4 = 4;
                    OooOo0O(i4);
                }
            }
            OooO0Oo(v.getTop());
            this.OooOOOO = i2;
            this.OooOOOo = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        int i = savedState.state;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.OooOO0o = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.OooOO0o);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.OooOOOO = 0;
        this.OooOOOo = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x007e  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r4, @androidx.annotation.NonNull V r5, @androidx.annotation.NonNull android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.OooO0oO()
            r0 = 3
            if (r4 != r7) goto Lf
            r3.OooOo0O(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.OooOOoo
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L9f
            boolean r4 = r3.OooOOOo
            if (r4 != 0) goto L1d
            goto L9f
        L1d:
            int r4 = r3.OooOOOO
            r6 = 0
            r7 = 4
            if (r4 <= 0) goto L28
            int r4 = r3.OooO0oO()
            goto L81
        L28:
            boolean r4 = r3.OooOO0
            if (r4 == 0) goto L3a
            float r4 = r3.OooOO0o()
            boolean r4 = r3.OooOo0o(r5, r4)
            if (r4 == 0) goto L3a
            int r4 = r3.OooOOo0
            r0 = 5
            goto L81
        L3a:
            int r4 = r3.OooOOOO
            if (r4 != 0) goto L7e
            int r4 = r5.getTop()
            boolean r1 = r3.OooO00o
            r2 = 6
            if (r1 == 0) goto L5b
            int r1 = r3.OooO0oO
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.OooO
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r1 >= r4) goto L7e
            int r4 = r3.OooO0oO
            goto L81
        L5b:
            int r1 = r3.OooO0oo
            if (r4 >= r1) goto L6b
            int r7 = r3.OooO
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r4 >= r7) goto L7a
            r4 = 0
            goto L81
        L6b:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.OooO
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L7e
        L7a:
            int r4 = r3.OooO0oo
            r0 = 6
            goto L81
        L7e:
            int r4 = r3.OooO
            r0 = 4
        L81:
            androidx.customview.widget.ViewDragHelper r7 = r3.OooOOO0
            int r1 = r5.getLeft()
            boolean r4 = r7.smoothSlideViewTo(r5, r1, r4)
            if (r4 == 0) goto L9a
            r4 = 2
            r3.OooOo0O(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior$OooO0o r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$OooO0o
            r4.<init>(r5, r0)
            androidx.core.view.ViewCompat.postOnAnimation(r5, r4)
            goto L9d
        L9a:
            r3.OooOo0O(r0)
        L9d:
            r3.OooOOOo = r6
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.OooOO0o == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.OooOOO0;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            OooOOOO();
        }
        if (this.OooOo0 == null) {
            this.OooOo0 = VelocityTracker.obtain();
        }
        this.OooOo0.addMovement(motionEvent);
        if (actionMasked == 2 && !this.OooOOO && Math.abs(this.OooOo0o - motionEvent.getY()) > this.OooOOO0.getTouchSlop()) {
            this.OooOOO0.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.OooOOO;
    }
}
