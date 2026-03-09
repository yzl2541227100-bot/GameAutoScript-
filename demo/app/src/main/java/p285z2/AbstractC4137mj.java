package p285z2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: z2.mj */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4137mj<V extends View> extends C4212oj<V> {
    private static final int OooOO0O = -1;
    private int OooO;
    private Runnable OooO0Oo;
    private boolean OooO0o;
    public OverScroller OooO0o0;
    private int OooO0oO;
    private int OooO0oo;
    private VelocityTracker OooOO0;

    /* JADX WARN: Field signature parse error: OoooOoo
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TV at position 1 ('V'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:161)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:37)
     */
    /* JADX INFO: renamed from: z2.mj$OooO00o */
    public class OooO00o implements Runnable {
        private final CoordinatorLayout OoooOoO;
        private final View OoooOoo;

        public OooO00o(CoordinatorLayout coordinatorLayout, V v) {
            this.OoooOoO = coordinatorLayout;
            this.OoooOoo = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.OoooOoo == null || (overScroller = AbstractC4137mj.this.OooO0o0) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC4137mj.this.OooOO0o(this.OoooOoO, this.OoooOoo);
                return;
            }
            AbstractC4137mj abstractC4137mj = AbstractC4137mj.this;
            abstractC4137mj.OooOOO(this.OoooOoO, this.OoooOoo, abstractC4137mj.OooO0o0.getCurrY());
            ViewCompat.postOnAnimation(this.OoooOoo, this);
        }
    }

    public AbstractC4137mj() {
        this.OooO0oO = -1;
        this.OooO = -1;
    }

    public AbstractC4137mj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0oO = -1;
        this.OooO = -1;
    }

    private void OooO0oO() {
        if (this.OooOO0 == null) {
            this.OooOO0 = VelocityTracker.obtain();
        }
    }

    public int OooO(V v) {
        return -v.getHeight();
    }

    public boolean OooO0o(V v) {
        return false;
    }

    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.OooO0Oo;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.OooO0Oo = null;
        }
        if (this.OooO0o0 == null) {
            this.OooO0o0 = new OverScroller(v.getContext());
        }
        this.OooO0o0.fling(0, OooO0O0(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.OooO0o0.computeScrollOffset()) {
            OooOO0o(coordinatorLayout, v);
            return false;
        }
        OooO00o oooO00o = new OooO00o(coordinatorLayout, v);
        this.OooO0Oo = oooO00o;
        ViewCompat.postOnAnimation(v, oooO00o);
        return true;
    }

    public int OooOO0(V v) {
        return v.getHeight();
    }

    public int OooOO0O() {
        return OooO0O0();
    }

    public void OooOO0o(CoordinatorLayout coordinatorLayout, V v) {
    }

    public int OooOOO(CoordinatorLayout coordinatorLayout, V v, int i) {
        return OooOOOO(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final int OooOOO0(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return OooOOOO(coordinatorLayout, v, OooOO0O() - i, i2, i3);
    }

    public int OooOOOO(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iClamp;
        int iOooO0O0 = OooO0O0();
        if (i2 == 0 || iOooO0O0 < i2 || iOooO0O0 > i3 || iOooO0O0 == (iClamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        OooO0o0(iClamp);
        return iOooO0O0 - iClamp;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.OooO
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.OooO = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.OooO0o
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L60
            r5 = -1
            if (r0 == r2) goto L51
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L51
            goto L83
        L2f:
            int r6 = r4.OooO0oO
            if (r6 != r5) goto L34
            goto L83
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L83
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.OooO0oo
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.OooO
            if (r6 <= r0) goto L83
            r4.OooO0o = r2
            r4.OooO0oo = r5
            goto L83
        L51:
            r4.OooO0o = r3
            r4.OooO0oO = r5
            android.view.VelocityTracker r5 = r4.OooOO0
            if (r5 == 0) goto L83
            r5.recycle()
            r5 = 0
            r4.OooOO0 = r5
            goto L83
        L60:
            r4.OooO0o = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.OooO0o(r6)
            if (r2 == 0) goto L83
            boolean r5 = r5.isPointInChildBounds(r6, r0, r1)
            if (r5 == 0) goto L83
            r4.OooO0oo = r1
            int r5 = r7.getPointerId(r3)
            r4.OooO0oO = r5
            r4.OooO0oO()
        L83:
            android.view.VelocityTracker r5 = r4.OooOO0
            if (r5 == 0) goto L8a
            r5.addMovement(r7)
        L8a:
            boolean r5 = r4.OooO0o
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.AbstractC4137mj.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.OooO < 0) {
            this.OooO = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.OooOO0;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.OooOO0.computeCurrentVelocity(1000);
                    OooO0oo(coordinatorLayout, v, -OooOO0(v), 0, this.OooOO0.getYVelocity(this.OooO0oO));
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.OooO0oO);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.OooO0oo - y;
                if (!this.OooO0o) {
                    int iAbs = Math.abs(i);
                    int i2 = this.OooO;
                    if (iAbs > i2) {
                        this.OooO0o = true;
                        i = i > 0 ? i - i2 : i + i2;
                    }
                }
                int i3 = i;
                if (this.OooO0o) {
                    this.OooO0oo = y;
                    OooOOO0(coordinatorLayout, v, i3, OooO(v), 0);
                }
            } else if (actionMasked == 3) {
            }
            this.OooO0o = false;
            this.OooO0oO = -1;
            VelocityTracker velocityTracker2 = this.OooOO0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.OooOO0 = null;
            }
        } else {
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!coordinatorLayout.isPointInChildBounds(v, x, y2) || !OooO0o(v)) {
                return false;
            }
            this.OooO0oo = y2;
            this.OooO0oO = motionEvent.getPointerId(0);
            OooO0oO();
        }
        VelocityTracker velocityTracker3 = this.OooOO0;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }
}
