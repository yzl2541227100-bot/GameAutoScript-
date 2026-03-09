package com.anythink.basead.p025ui.p029d;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.anythink.basead.p025ui.p028c.InterfaceC0995a;

/* JADX INFO: renamed from: com.anythink.basead.ui.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0997b {

    /* JADX INFO: renamed from: a */
    private static final String f2040a = "TouchEventClickTrigger";

    /* JADX INFO: renamed from: b */
    private static final int f2041b = -1;

    /* JADX INFO: renamed from: c */
    private static final int f2042c = 10;

    /* JADX INFO: renamed from: e */
    private int f2044e;

    /* JADX INFO: renamed from: f */
    private int f2045f;

    /* JADX INFO: renamed from: h */
    private InterfaceC0995a f2047h;

    /* JADX INFO: renamed from: i */
    private boolean f2048i;

    /* JADX INFO: renamed from: d */
    private int f2043d = -1;

    /* JADX INFO: renamed from: g */
    private boolean f2046g = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1212a(int i) {
        InterfaceC0995a interfaceC0995a = this.f2047h;
        if (interfaceC0995a != null) {
            interfaceC0995a.mo672a(i, 13);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1213a(final View view) {
        if (this.f2048i) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.anythink.basead.ui.d.b.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    try {
                        if (Build.VERSION.SDK_INT >= 16) {
                            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                        View view2 = view;
                        while (view2.getParent() != null) {
                            Object parent = view2.getParent();
                            if (!(parent instanceof View)) {
                                break;
                            } else {
                                view2 = (View) parent;
                            }
                        }
                        View view3 = view;
                        if (view2 == view3) {
                            return;
                        }
                        final int[] iArr = new int[2];
                        view3.getLocationOnScreen(iArr);
                        final int width = view.getWidth();
                        final int height = view.getHeight();
                        final boolean[] zArr = {false};
                        view2.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.basead.ui.d.b.1.1
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view4, MotionEvent motionEvent) {
                                int rawX = (int) motionEvent.getRawX();
                                int rawY = (int) motionEvent.getRawY();
                                int[] iArr2 = iArr;
                                int i = iArr2[0];
                                int i2 = iArr2[1];
                                int action = motionEvent.getAction();
                                if (action == 0) {
                                    zArr[0] = false;
                                } else if (action != 1) {
                                    if (action == 2 && rawX > i && rawX < i + width && rawY > i2 && rawY < i2 + height) {
                                        zArr[0] = true;
                                    }
                                } else if (zArr[0]) {
                                    C0997b.this.m1212a(12);
                                }
                                return false;
                            }
                        });
                    } catch (Exception e) {
                        new StringBuilder("setDecorViewTouchListener() failed: ").append(e.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0997b m1215a(InterfaceC0995a interfaceC0995a) {
        this.f2047h = interfaceC0995a;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C0997b m1216a(boolean z) {
        this.f2048i = z;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1217a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 0
            if (r0 == 0) goto L83
            r2 = 1
            r3 = -1
            if (r0 == r2) goto L61
            r4 = 2
            if (r0 == r4) goto L13
            r2 = 3
            if (r0 == r2) goto L61
            goto Laf
        L13:
            int r0 = r5.f2043d
            if (r0 == r3) goto Laf
            int r1 = r6.findPointerIndex(r0)
            if (r1 != r3) goto L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r6.<init>(r1)
            r6.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r6.append(r0)
            goto Laf
        L2e:
            float r0 = r6.getY(r1)
            int r0 = (int) r0
            float r6 = r6.getX(r1)
            int r6 = (int) r6
            int r1 = r5.f2044e
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r5.f2045f
            int r6 = r6 - r1
            int r6 = java.lang.Math.abs(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "onInterceptTouchEvent() >>> ACTION_MOVE: xDiff = "
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r3 = " yDiff = "
            r1.append(r3)
            r1.append(r0)
            r1 = 10
            if (r0 > r1) goto L5e
            if (r6 <= r1) goto Laf
        L5e:
            r5.f2046g = r2
            goto Laf
        L61:
            boolean r0 = r5.f2046g
            if (r0 == 0) goto L6a
            r0 = 13
            r5.m1212a(r0)
        L6a:
            int r0 = r5.f2043d
            int r0 = r6.findPointerIndex(r0)
            float r2 = r6.getX(r0)
            int r2 = (int) r2
            r5.f2045f = r2
            float r6 = r6.getY(r0)
            int r6 = (int) r6
            r5.f2044e = r6
            r5.f2046g = r1
            r5.f2043d = r3
            goto Laf
        L83:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f2044e = r0
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.f2045f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onInterceptTouchEvent() >>> ACTION_DOWN: mLastMotionX = "
            r0.<init>(r2)
            int r2 = r5.f2045f
            r0.append(r2)
            java.lang.String r2 = " mLastMotionY = "
            r0.append(r2)
            int r2 = r5.f2044e
            r0.append(r2)
            int r6 = r6.getPointerId(r1)
            r5.f2043d = r6
            r5.f2046g = r1
        Laf:
            boolean r6 = r5.f2046g
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.p029d.C0997b.m1217a(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1218a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2044e = (int) motionEvent.getY();
            this.f2045f = (int) motionEvent.getX();
            this.f2043d = motionEvent.getPointerId(0);
            this.f2046g = false;
        } else if (action == 1) {
            new StringBuilder("onTouchEvent() >>> ACTION_UP mIsBeingDragged = ").append(this.f2046g);
            if (this.f2046g) {
                m1212a(13);
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f2043d);
            this.f2045f = (int) motionEvent.getX(iFindPointerIndex);
            this.f2044e = (int) motionEvent.getY(iFindPointerIndex);
            this.f2046g = false;
            this.f2043d = -1;
        } else if (action == 2) {
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f2043d);
            if (iFindPointerIndex2 == -1) {
                StringBuilder sb = new StringBuilder("Invalid pointerId=");
                sb.append(this.f2043d);
                sb.append(" in onTouchEvent");
            } else {
                int x = (int) motionEvent.getX(iFindPointerIndex2);
                int y = (int) motionEvent.getY(iFindPointerIndex2);
                int iAbs = Math.abs(x - this.f2045f);
                int iAbs2 = Math.abs(y - this.f2044e);
                StringBuilder sb2 = new StringBuilder("onTouchEvent() >>> ACTION_MOVE: xDiff = ");
                sb2.append(iAbs);
                sb2.append(" yDiff = ");
                sb2.append(iAbs2);
                if (iAbs2 > 10 || iAbs > 10) {
                    this.f2046g = true;
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        }
        return true;
    }
}
