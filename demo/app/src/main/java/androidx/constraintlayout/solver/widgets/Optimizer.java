package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class Optimizer {
    public static final int FLAG_CHAIN_DANGLING = 1;
    public static final int FLAG_RECOMPUTE_BOUNDS = 2;
    public static final int FLAG_USE_OPTIMIZE = 0;
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_GROUPS = 32;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 7;
    public static boolean[] flags = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:237:0x00dd, code lost:
    
        if (r6 != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x00e8, code lost:
    
        r7 = r17.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x00ff, code lost:
    
        if (r6 != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x01aa, code lost:
    
        if (r6 != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01ac, code lost:
    
        r4.dependsOn(r2, 1, r17.getResolutionHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01b5, code lost:
    
        r4.dependsOn(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x01c2, code lost:
    
        if (r6 != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00ec A[PHI: r7
  0x00ec: PHI (r7v26 int) = (r7v21 int), (r7v27 int), (r7v27 int) binds: [B:239:0x00e8, B:216:0x007b, B:211:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void analyze(int r16, androidx.constraintlayout.solver.widgets.ConstraintWidget r17) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Optimizer.analyze(int, androidx.constraintlayout.solver.widgets.ConstraintWidget):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x0030 A[PHI: r11 r12
  0x0030: PHI (r11v17 boolean) = (r11v1 boolean), (r11v19 boolean) binds: [B:264:0x0040, B:254:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r12v8 boolean) = (r12v1 boolean), (r12v10 boolean) binds: [B:264:0x0040, B:254:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0032 A[PHI: r11 r12
  0x0032: PHI (r11v3 boolean) = (r11v1 boolean), (r11v19 boolean) binds: [B:264:0x0040, B:254:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r12v3 boolean) = (r12v1 boolean), (r12v10 boolean) binds: [B:264:0x0040, B:254:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean applyChainOptimized(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r24, androidx.constraintlayout.solver.LinearSystem r25, int r26, int r27, androidx.constraintlayout.solver.widgets.ChainHead r28) {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Optimizer.applyChainOptimized(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):boolean");
    }

    public static void checkMatchParent(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidgetContainer.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.mLeft.mMargin;
            int width = constraintWidgetContainer.getWidth() - constraintWidget.mRight.mMargin;
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            constraintAnchor.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.mRight;
            constraintAnchor2.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor2);
            linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
            linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, width);
            constraintWidget.mHorizontalResolution = 2;
            constraintWidget.setHorizontalDimension(i, width);
        }
        if (constraintWidgetContainer.mListDimensionBehaviors[1] == dimensionBehaviour2 || constraintWidget.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i2 = constraintWidget.mTop.mMargin;
        int height = constraintWidgetContainer.getHeight() - constraintWidget.mBottom.mMargin;
        ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
        constraintAnchor3.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.mBottom;
        constraintAnchor4.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor4);
        linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i2);
        linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, height);
        if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.mBaseline;
            constraintAnchor5.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor5);
            linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i2);
        }
        constraintWidget.mVerticalResolution = 2;
        constraintWidget.setVerticalDimension(i2, height);
    }

    private static boolean optimizableMatchConstraint(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
        if (dimensionBehaviourArr[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        if (constraintWidget.mDimensionRatio != 0.0f) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i != 0 ? (char) 0 : (char) 1];
            return false;
        }
        if (i == 0) {
            if (constraintWidget.mMatchConstraintDefaultWidth != 0 || constraintWidget.mMatchConstraintMinWidth != 0 || constraintWidget.mMatchConstraintMaxWidth != 0) {
                return false;
            }
        } else if (constraintWidget.mMatchConstraintDefaultHeight != 0 || constraintWidget.mMatchConstraintMinHeight != 0 || constraintWidget.mMatchConstraintMaxHeight != 0) {
            return false;
        }
        return true;
    }

    public static void setOptimizedWidget(ConstraintWidget constraintWidget, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        constraintWidget.mListAnchors[i3].getResolutionNode().resolvedTarget = constraintWidget.getParent().mLeft.getResolutionNode();
        constraintWidget.mListAnchors[i3].getResolutionNode().resolvedOffset = i2;
        constraintWidget.mListAnchors[i3].getResolutionNode().state = 1;
        constraintWidget.mListAnchors[i4].getResolutionNode().resolvedTarget = constraintWidget.mListAnchors[i3].getResolutionNode();
        constraintWidget.mListAnchors[i4].getResolutionNode().resolvedOffset = constraintWidget.getLength(i);
        constraintWidget.mListAnchors[i4].getResolutionNode().state = 1;
    }
}
