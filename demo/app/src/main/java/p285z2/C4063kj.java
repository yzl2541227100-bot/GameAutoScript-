package p285z2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: z2.kj */
/* JADX INFO: loaded from: classes2.dex */
public class C4063kj {
    private long OooO00o;
    private long OooO0O0;

    @Nullable
    private TimeInterpolator OooO0OO;
    private int OooO0Oo;
    private int OooO0o0;

    public C4063kj(long j, long j2) {
        this.OooO00o = 0L;
        this.OooO0O0 = 300L;
        this.OooO0OO = null;
        this.OooO0Oo = 0;
        this.OooO0o0 = 1;
        this.OooO00o = j;
        this.OooO0O0 = j2;
    }

    public C4063kj(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.OooO00o = 0L;
        this.OooO0O0 = 300L;
        this.OooO0OO = null;
        this.OooO0Oo = 0;
        this.OooO0o0 = 1;
        this.OooO00o = j;
        this.OooO0O0 = j2;
        this.OooO0OO = timeInterpolator;
    }

    public static C4063kj OooO0O0(ValueAnimator valueAnimator) {
        C4063kj c4063kj = new C4063kj(valueAnimator.getStartDelay(), valueAnimator.getDuration(), OooO0o(valueAnimator));
        c4063kj.OooO0Oo = valueAnimator.getRepeatCount();
        c4063kj.OooO0o0 = valueAnimator.getRepeatMode();
        return c4063kj;
    }

    private static TimeInterpolator OooO0o(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C3767cj.OooO0O0 : interpolator instanceof AccelerateInterpolator ? C3767cj.OooO0OO : interpolator instanceof DecelerateInterpolator ? C3767cj.OooO0Oo : interpolator;
    }

    public void OooO00o(Animator animator) {
        animator.setStartDelay(OooO0OO());
        animator.setDuration(OooO0Oo());
        animator.setInterpolator(OooO0o0());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(OooO0oO());
            valueAnimator.setRepeatMode(OooO0oo());
        }
    }

    public long OooO0OO() {
        return this.OooO00o;
    }

    public long OooO0Oo() {
        return this.OooO0O0;
    }

    public TimeInterpolator OooO0o0() {
        TimeInterpolator timeInterpolator = this.OooO0OO;
        return timeInterpolator != null ? timeInterpolator : C3767cj.OooO0O0;
    }

    public int OooO0oO() {
        return this.OooO0Oo;
    }

    public int OooO0oo() {
        return this.OooO0o0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4063kj c4063kj = (C4063kj) obj;
        if (OooO0OO() == c4063kj.OooO0OO() && OooO0Oo() == c4063kj.OooO0Oo() && OooO0oO() == c4063kj.OooO0oO() && OooO0oo() == c4063kj.OooO0oo()) {
            return OooO0o0().getClass().equals(c4063kj.OooO0o0().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (OooO0OO() ^ (OooO0OO() >>> 32))) * 31) + ((int) (OooO0Oo() ^ (OooO0Oo() >>> 32)))) * 31) + OooO0o0().getClass().hashCode()) * 31) + OooO0oO()) * 31) + OooO0oo();
    }

    public String toString() {
        return '\n' + getClass().getName() + MessageFormatter.DELIM_START + Integer.toHexString(System.identityHashCode(this)) + " delay: " + OooO0OO() + " duration: " + OooO0Oo() + " interpolator: " + OooO0o0().getClass() + " repeatCount: " + OooO0oO() + " repeatMode: " + OooO0oo() + "}\n";
    }
}
