package com.cyjh.mobileanjian.ipc.uip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import com.cyjh.mqsdk.C2703R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.cyjh.mobileanjian.ipc.uip.b */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(14)
public final class C2698b extends ViewGroup {
    private int OoooOoO;
    private final List<List<View>> OoooOoo;
    private final List<Integer> Ooooo00;
    private final List<Integer> Ooooo0o;

    /* JADX INFO: renamed from: com.cyjh.mobileanjian.ipc.uip.b$OooO00o */
    public static class OooO00o extends ViewGroup.MarginLayoutParams {
        public int OooO00o;

        public OooO00o(int i, int i2) {
            super(i, i2);
            this.OooO00o = -1;
        }

        public OooO00o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.OooO00o = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2703R.styleable.FlowLayout_Layout);
            try {
                this.OooO00o = typedArrayObtainStyledAttributes.getInt(C2703R.styleable.FlowLayout_Layout_android_layout_gravity, -1);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        public OooO00o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.OooO00o = -1;
        }
    }

    public C2698b(Context context) {
        this(context, (byte) 0);
    }

    private C2698b(Context context, byte b) {
        this(context, (char) 0);
    }

    private C2698b(Context context, char c) {
        super(context, null, 0);
        this.OoooOoO = (OooO0Oo() ? GravityCompat.START : 3) | 48;
        this.OoooOoo = new ArrayList();
        this.Ooooo00 = new ArrayList();
        this.Ooooo0o = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C2703R.styleable.FlowLayout, 0, 0);
        try {
            int i = typedArrayObtainStyledAttributes.getInt(C2703R.styleable.FlowLayout_android_gravity, -1);
            if (i > 0) {
                setGravity(i);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static OooO00o OooO00o() {
        return new OooO00o(-1, -1);
    }

    private OooO00o OooO0O0(AttributeSet attributeSet) {
        return new OooO00o(getContext(), attributeSet);
    }

    private static OooO00o OooO0OO(ViewGroup.LayoutParams layoutParams) {
        return new OooO00o(layoutParams);
    }

    private static boolean OooO0Oo() {
        return Build.VERSION.SDK_INT >= 14;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof OooO00o);
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooO00o(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooO00o(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OooO00o(layoutParams);
    }

    public final int getGravity() {
        return this.OoooOoO;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0170  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.mobileanjian.ipc.uip.C2698b.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.mobileanjian.ipc.uip.C2698b.onMeasure(int, int):void");
    }

    @TargetApi(14)
    public final void setGravity(int i) {
        if (this.OoooOoO != i) {
            if ((8388615 & i) == 0) {
                i |= OooO0Oo() ? GravityCompat.START : 3;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.OoooOoO = i;
            requestLayout();
        }
    }
}
