package p285z2;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.target.Target;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: z2.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4451v0 implements InterfaceC4229p0 {
    private final Set<Target<?>> OoooOoO = Collections.newSetFromMap(new WeakHashMap());

    public void OooO00o() {
        this.OoooOoO.clear();
    }

    @NonNull
    public List<Target<?>> OooO0O0() {
        return C4379t2.OooOO0O(this.OoooOoO);
    }

    public void OooO0OO(@NonNull Target<?> target) {
        this.OoooOoO.add(target);
    }

    public void OooO0Oo(@NonNull Target<?> target) {
        this.OoooOoO.remove(target);
    }

    @Override // p285z2.InterfaceC4229p0
    public void onDestroy() {
        Iterator it = C4379t2.OooOO0O(this.OoooOoO).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onDestroy();
        }
    }

    @Override // p285z2.InterfaceC4229p0
    public void onStart() {
        Iterator it = C4379t2.OooOO0O(this.OoooOoO).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onStart();
        }
    }

    @Override // p285z2.InterfaceC4229p0
    public void onStop() {
        Iterator it = C4379t2.OooOO0O(this.OoooOoO).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onStop();
        }
    }
}
