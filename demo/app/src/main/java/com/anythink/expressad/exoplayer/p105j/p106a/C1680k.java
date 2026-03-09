package com.anythink.expressad.exoplayer.p105j.p106a;

import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1680k {

    /* JADX INFO: renamed from: a */
    private final Map<String, Object> f9347a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final List<String> f9348b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private C1680k m7802a(String str, Object obj) {
        this.f9347a.put((String) C1711a.m8005a(str), C1711a.m8005a(obj));
        this.f9348b.remove(str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    private C1680k m7803a(String str, byte[] bArr) {
        return m7802a(str, (Object) Arrays.copyOf(bArr, bArr.length));
    }

    /* JADX INFO: renamed from: a */
    public final C1680k m7804a(String str) {
        this.f9348b.add(str);
        this.f9347a.remove(str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C1680k m7805a(String str, long j) {
        return m7802a(str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    public final C1680k m7806a(String str, String str2) {
        return m7802a(str, (Object) str2);
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m7807a() {
        return Collections.unmodifiableList(new ArrayList(this.f9348b));
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, Object> m7808b() {
        HashMap map = new HashMap(this.f9347a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
