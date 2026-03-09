package com.goldcoast.sdk.domain;

import android.os.ConditionVariable;
import android.text.TextUtils;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.InterfaceC2554h;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.goldcoast.sdk.domain.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C2750g implements InterfaceC2554h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f16061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConditionVariable f16062b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EntryPoint f16063c;

    public C2750g(EntryPoint entryPoint, List list, ConditionVariable conditionVariable) {
        this.f16063c = entryPoint;
        this.f16061a = list;
        this.f16062b = conditionVariable;
    }

    @Override // com.p188b.p189a.InterfaceC2554h
    /* JADX INFO: renamed from: a */
    public final void mo12928a(C2542as c2542as) {
        String strM12910d = c2542as.m12889e().m12910d();
        if (!TextUtils.isEmpty(strM12910d)) {
            try {
                EntryPoint.m13194a(this.f16063c, strM12910d, this.f16061a);
            } catch (Exception e) {
                int i = 3;
                String str = String.format("Exception:\n %s\n", e.getMessage());
                if (this.f16063c.f16043r == 4) {
                    str = String.format("Exception:\n %s\n$$$ failed", e.getMessage());
                    i = 1;
                }
                this.f16063c.m13207b(str, i);
            }
        }
        this.f16062b.open();
    }

    @Override // com.p188b.p189a.InterfaceC2554h
    /* JADX INFO: renamed from: a */
    public final void mo12929a(IOException iOException) {
        EntryPoint entryPoint;
        String stackString;
        int i;
        new HashMap().put("stack", this.f16063c.getStackString(iOException));
        if (this.f16063c.f16043r == 4) {
            entryPoint = this.f16063c;
            stackString = this.f16063c.getStackString(iOException) + "\n$$$ failed\n";
            i = 1;
        } else {
            entryPoint = this.f16063c;
            stackString = entryPoint.getStackString(iOException);
            i = 3;
        }
        entryPoint.m13207b(stackString, i);
        this.f16062b.open();
    }
}
