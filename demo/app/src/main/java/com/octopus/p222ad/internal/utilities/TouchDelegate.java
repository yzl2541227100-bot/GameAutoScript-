package com.octopus.p222ad.internal.utilities;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class TouchDelegate extends android.view.TouchDelegate {
    public static final int ABOVE = 1;
    public static final int BELOW = 2;
    public static final int TO_LEFT = 4;
    public static final int TO_RIGHT = 8;
    private Rect mBounds;
    private boolean mDelegateTargeted;
    private View mDelegateView;
    private int mSlop;
    private Rect mSlopBounds;

    public TouchDelegate(Rect rect, View view) {
        super(rect, view);
        this.mBounds = rect;
        this.mSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.mSlopBounds = rect2;
        int i = this.mSlop;
        rect2.inset(-i, -i);
        this.mDelegateView = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getActionMasked()
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L33
            if (r2 == r3) goto L27
            if (r2 == r5) goto L27
            r6 = 3
            if (r2 == r6) goto L22
            r6 = 5
            if (r2 == r6) goto L27
            r6 = 6
            if (r2 == r6) goto L27
            r0 = 0
            goto L7b
        L22:
            boolean r0 = r7.mDelegateTargeted
            r7.mDelegateTargeted = r4
            goto L7b
        L27:
            boolean r2 = r7.mDelegateTargeted
            if (r2 == 0) goto L31
            android.graphics.Rect r3 = r7.mSlopBounds
            boolean r3 = r3.contains(r0, r1)
        L31:
            r0 = r2
            goto L7b
        L33:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "TouchDelegate mBounds = "
            r2.append(r6)
            android.graphics.Rect r6 = r7.mBounds
            r2.append(r6)
            java.lang.String r6 = ",x = "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = ",y = "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "OctopusAd"
            com.octopus.p222ad.utils.p258b.C3255f.m14983c(r6, r2)
            android.graphics.Rect r2 = r7.mBounds
            boolean r0 = r2.contains(r0, r1)
            r7.mDelegateTargeted = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TouchDelegate onTouchEvent mDelegateTargeted = "
            r0.append(r1)
            boolean r1 = r7.mDelegateTargeted
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.octopus.p222ad.utils.p258b.C3255f.m14983c(r6, r0)
            boolean r0 = r7.mDelegateTargeted
        L7b:
            if (r0 == 0) goto L9e
            android.view.View r0 = r7.mDelegateView
            if (r3 == 0) goto L91
            int r1 = r0.getWidth()
            int r1 = r1 / r5
            float r1 = (float) r1
            int r2 = r0.getHeight()
            int r2 = r2 / r5
            float r2 = (float) r2
            r8.setLocation(r1, r2)
            goto L9a
        L91:
            int r1 = r7.mSlop
            int r1 = r1 * 2
            int r1 = -r1
            float r1 = (float) r1
            r8.setLocation(r1, r1)
        L9a:
            boolean r4 = r0.dispatchTouchEvent(r8)
        L9e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.utilities.TouchDelegate.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
