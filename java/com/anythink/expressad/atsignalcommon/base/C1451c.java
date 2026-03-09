package com.anythink.expressad.atsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.base.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1451c implements InterfaceC1449a {
    @Override // com.anythink.expressad.atsignalcommon.base.InterfaceC1449a
    /* JADX INFO: renamed from: a */
    public final boolean mo5623a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        scheme.equals("intent");
        return false;
    }
}
