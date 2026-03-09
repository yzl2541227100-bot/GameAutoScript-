package com.anythink.expressad.foundation.p138h;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1891y {

    /* JADX INFO: renamed from: a */
    private static final String f11640a = "ViewUtils";

    /* JADX INFO: renamed from: b */
    private static boolean f11641b;

    /* JADX INFO: renamed from: a */
    private static int m9873a(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m9874a(android.view.View r7) {
        /*
            int r0 = r7.getVisibility()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            float r0 = r7.getAlpha()
            r2 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L13
            return r1
        L13:
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L2e
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            android.view.ViewParent r0 = r7.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L2e
            return r1
        L2e:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r2 = r7.getGlobalVisibleRect(r0)
            int r3 = r0.bottom
            int r4 = r0.top
            int r3 = r3 - r4
            int r4 = r0.right
            int r0 = r0.left
            int r4 = r4 - r0
            int r3 = r3 * r4
            int r0 = r7.getMeasuredHeight()
            int r4 = r7.getMeasuredWidth()
            int r0 = r0 * r4
            int r0 = r0 / 2
            r4 = 0
            if (r3 < r0) goto L54
            r0 = 1
            goto L55
        L54:
            r0 = 0
        L55:
            if (r2 == 0) goto L5b
            if (r0 == 0) goto L5b
            r3 = 1
            goto L5c
        L5b:
            r3 = 0
        L5c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "View Judge : partVisible is "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " halfPercentVisible is "
            r5.append(r2)
            r5.append(r0)
            if (r3 != 0) goto L71
            return r1
        L71:
            r0 = r7
        L72:
            android.view.ViewParent r2 = r0.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto Lbd
            android.view.ViewParent r2 = r0.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r0 = m9873a(r0, r2)
            int r0 = r0 + r1
        L85:
            int r3 = r2.getChildCount()
            if (r0 >= r3) goto Lbb
            android.view.View r3 = r2.getChildAt(r0)
            int r5 = r3.getVisibility()
            if (r5 != 0) goto Lb8
            boolean r5 = m9875a(r7, r3)
            if (r5 == 0) goto Lb8
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto Lb1
            r5 = r3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r6 = r5.getChildCount()
            if (r6 <= 0) goto Lb1
            boolean r3 = m9877b(r7, r5)
            com.anythink.expressad.foundation.p138h.C1891y.f11641b = r4
            if (r3 == 0) goto Lb8
            return r1
        Lb1:
            boolean r3 = m9876b(r3)
            if (r3 == 0) goto Lb8
            return r1
        Lb8:
            int r0 = r0 + 1
            goto L85
        Lbb:
            r0 = r2
            goto L72
        Lbd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p138h.C1891y.m9874a(android.view.View):boolean");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m9875a(View view, View view2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        return Rect.intersects(rect, rect2) && ((Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * (Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top))) * 2 >= view.getMeasuredHeight() * view.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: b */
    private static boolean m9876b(View view) {
        if (view.getAlpha() <= 0.5f) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getBackground() != null && view.getBackground().getAlpha() > 127;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m9877b(View view, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && m9875a(view, childAt)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    f11641b = true;
                }
                if (m9876b(childAt)) {
                    f11641b = true;
                }
                if (f11641b) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    m9877b(view, (ViewGroup) childAt);
                }
            }
        }
        return f11641b;
    }
}
