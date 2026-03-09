package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.C2754R;
import p285z2.InterfaceC4214ol;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements InterfaceC4214ol {
    private TextView OoooOoO;
    private Button OoooOoo;
    private int Ooooo00;
    private int Ooooo0o;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2754R.styleable.SnackbarLayout);
        this.Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2754R.styleable.SnackbarLayout_android_maxWidth, -1);
        this.Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2754R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static void OooO0OO(View view, int i, int i2) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean OooO0Oo(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.OoooOoO.getPaddingTop() == i2 && this.OoooOoO.getPaddingBottom() == i3) {
            return z;
        }
        OooO0OO(this.OoooOoO, i2, i3);
        return true;
    }

    @Override // p285z2.InterfaceC4214ol
    public void OooO00o(int i, int i2) {
        this.OoooOoO.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.OoooOoO.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.OoooOoo.getVisibility() == 0) {
            this.OoooOoo.setAlpha(0.0f);
            this.OoooOoo.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // p285z2.InterfaceC4214ol
    public void OooO0O0(int i, int i2) {
        this.OoooOoO.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.OoooOoO.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.OoooOoo.getVisibility() == 0) {
            this.OoooOoo.setAlpha(1.0f);
            this.OoooOoo.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.OoooOoo;
    }

    public TextView getMessageView() {
        return this.OoooOoO;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.OoooOoO = (TextView) findViewById(C2754R.id.snackbar_text);
        this.OoooOoo = (Button) findViewById(C2754R.id.snackbar_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.Ooooo00
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.Ooooo00
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.C2754R.dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.google.android.material.C2754R.dimen.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.OoooOoO
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.Ooooo0o
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.OoooOoo
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.Ooooo0o
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.OooO0Oo(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.OooO0Oo(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
