package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private androidx.constraintlayout.solver.widgets.Barrier mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public boolean allowsGoneWidget() {
        return this.mBarrier.allowsGoneWidget();
    }

    public int getType() {
        return this.mIndicatedType;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mBarrier = new androidx.constraintlayout.solver.widgets.Barrier();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0131R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C0131R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0131R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.mBarrier.setAllowsGoneWidget(typedArrayObtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.mHelperWidget = this.mBarrier;
        validateParams();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mBarrier.setAllowsGoneWidget(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setType(int r7) {
        /*
            r6 = this;
            r6.mIndicatedType = r7
            r6.mResolvedType = r7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 5
            r3 = 0
            r4 = 1
            r5 = 17
            if (r0 >= r5) goto L18
            if (r7 != r2) goto L13
        L10:
            r6.mResolvedType = r3
            goto L3b
        L13:
            if (r7 != r1) goto L3b
        L15:
            r6.mResolvedType = r4
            goto L3b
        L18:
            android.content.res.Resources r7 = r6.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            if (r4 != r7) goto L28
            r7 = 1
            goto L29
        L28:
            r7 = 0
        L29:
            if (r7 == 0) goto L33
            int r7 = r6.mIndicatedType
            if (r7 != r2) goto L30
            goto L15
        L30:
            if (r7 != r1) goto L3b
            goto L10
        L33:
            int r7 = r6.mIndicatedType
            if (r7 != r2) goto L38
            goto L10
        L38:
            if (r7 != r1) goto L3b
            goto L15
        L3b:
            androidx.constraintlayout.solver.widgets.Barrier r7 = r6.mBarrier
            int r0 = r6.mResolvedType
            r7.setBarrierType(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.setType(int):void");
    }
}
