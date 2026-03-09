package p285z2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: z2.u0 */
/* JADX INFO: loaded from: classes.dex */
public class C4414u0 extends Fragment {
    private static final String OooooOo = "SupportRMFragment";
    private final C3896g0 OoooOoO;
    private final InterfaceC4340s0 OoooOoo;
    private final Set<C4414u0> Ooooo00;

    @Nullable
    private C4414u0 Ooooo0o;

    @Nullable
    private C4192o0 OooooO0;

    @Nullable
    private Fragment OooooOO;

    /* JADX INFO: renamed from: z2.u0$OooO00o */
    public class OooO00o implements InterfaceC4340s0 {
        public OooO00o() {
        }

        @Override // p285z2.InterfaceC4340s0
        @NonNull
        public Set<C4192o0> OooO00o() {
            Set<C4414u0> setOooOo0 = C4414u0.this.OooOo0();
            HashSet hashSet = new HashSet(setOooOo0.size());
            for (C4414u0 c4414u0 : setOooOo0) {
                if (c4414u0.OooOo() != null) {
                    hashSet.add(c4414u0.OooOo());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C4414u0.this + "}";
        }
    }

    public C4414u0() {
        this(new C3896g0());
    }

    @SuppressLint({"ValidFragment"})
    @VisibleForTesting
    public C4414u0(@NonNull C3896g0 c3896g0) {
        this.OoooOoo = new OooO00o();
        this.Ooooo00 = new HashSet();
        this.OoooOoO = c3896g0;
    }

    private void OooOo00(C4414u0 c4414u0) {
        this.Ooooo00.add(c4414u0);
    }

    @Nullable
    private Fragment OooOo0o() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.OooooOO;
    }

    private boolean OooOoO(@NonNull Fragment fragment) {
        Fragment fragmentOooOo0o = OooOo0o();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentOooOo0o)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void OooOoOO(@NonNull FragmentActivity fragmentActivity) {
        OooOooo();
        C4414u0 c4414u0OooOOo = o00Oo00.OooO0Oo(fragmentActivity).OooOOO().OooOOo(fragmentActivity);
        this.Ooooo0o = c4414u0OooOOo;
        if (equals(c4414u0OooOOo)) {
            return;
        }
        this.Ooooo0o.OooOo00(this);
    }

    private void OooOoo0(C4414u0 c4414u0) {
        this.Ooooo00.remove(c4414u0);
    }

    private void OooOooo() {
        C4414u0 c4414u0 = this.Ooooo0o;
        if (c4414u0 != null) {
            c4414u0.OooOoo0(this);
            this.Ooooo0o = null;
        }
    }

    @Nullable
    public C4192o0 OooOo() {
        return this.OooooO0;
    }

    @NonNull
    public Set<C4414u0> OooOo0() {
        C4414u0 c4414u0 = this.Ooooo0o;
        if (c4414u0 == null) {
            return Collections.emptySet();
        }
        if (equals(c4414u0)) {
            return Collections.unmodifiableSet(this.Ooooo00);
        }
        HashSet hashSet = new HashSet();
        for (C4414u0 c4414u02 : this.Ooooo0o.OooOo0()) {
            if (OooOoO(c4414u02.OooOo0o())) {
                hashSet.add(c4414u02);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    public C3896g0 OooOo0O() {
        return this.OoooOoO;
    }

    @NonNull
    public InterfaceC4340s0 OooOoO0() {
        return this.OoooOoo;
    }

    public void OooOoo(@Nullable Fragment fragment) {
        this.OooooOO = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        OooOoOO(fragment.getActivity());
    }

    public void OooOooO(@Nullable C4192o0 c4192o0) {
        this.OooooO0 = c4192o0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            OooOoOO(getActivity());
        } catch (IllegalStateException e) {
            if (Log.isLoggable(OooooOo, 5)) {
                Log.w(OooooOo, "Unable to register fragment with root", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.OoooOoO.OooO0OO();
        OooOooo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.OooooOO = null;
        OooOooo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.OoooOoO.OooO0Oo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.OoooOoO.OooO0o0();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + OooOo0o() + "}";
    }
}
