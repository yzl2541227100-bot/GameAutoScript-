package com.iflytek.voiceads.param;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.iflytek.voiceads.param.f */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2971f {

    /* JADX INFO: renamed from: a */
    HashMap<String, Object> f16419a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public Object m13507a(String str) {
        return this.f16419a.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m13508a(String str, Object obj) {
        m13509a(str, obj, true);
    }

    /* JADX INFO: renamed from: a */
    public void m13509a(String str, Object obj, boolean z) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        if (z || !this.f16419a.containsKey(str)) {
            this.f16419a.put(str, obj);
        }
    }
}
