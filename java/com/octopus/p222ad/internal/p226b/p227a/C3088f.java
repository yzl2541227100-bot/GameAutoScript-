package com.octopus.p222ad.internal.p226b.p227a;

import android.text.TextUtils;
import com.octopus.p222ad.internal.p226b.C3106n;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.a.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3088f implements InterfaceC3085c {
    /* JADX INFO: renamed from: b */
    private String m14268b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || iLastIndexOf <= str.lastIndexOf(47) || (iLastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(iLastIndexOf + 1, str.length());
    }

    @Override // com.octopus.p222ad.internal.p226b.p227a.InterfaceC3085c
    /* JADX INFO: renamed from: a */
    public String mo14254a(String str) {
        String strM14268b = m14268b(str);
        String strM14354d = C3106n.m14354d(str);
        if (TextUtils.isEmpty(strM14268b)) {
            return strM14354d;
        }
        return strM14354d + "." + strM14268b;
    }
}
