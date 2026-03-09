package p285z2;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: z2.ly */
/* JADX INFO: loaded from: classes2.dex */
public final class C4115ly {
    private final Set<C4373sx> OooO00o = new LinkedHashSet();

    public synchronized void OooO00o(C4373sx c4373sx) {
        this.OooO00o.remove(c4373sx);
    }

    public synchronized void OooO0O0(C4373sx c4373sx) {
        this.OooO00o.add(c4373sx);
    }

    public synchronized boolean OooO0OO(C4373sx c4373sx) {
        return this.OooO00o.contains(c4373sx);
    }
}
