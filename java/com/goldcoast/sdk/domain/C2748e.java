package com.goldcoast.sdk.domain;

import android.os.ConditionVariable;
import android.text.TextUtils;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.InterfaceC2554h;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: com.goldcoast.sdk.domain.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2748e implements InterfaceC2554h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConditionVariable f16057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean[] f16058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EntryPoint f16059c;

    public C2748e(EntryPoint entryPoint, ConditionVariable conditionVariable, boolean[] zArr) {
        this.f16059c = entryPoint;
        this.f16057a = conditionVariable;
        this.f16058b = zArr;
    }

    @Override // com.p188b.p189a.InterfaceC2554h
    /* JADX INFO: renamed from: a */
    public final void mo12928a(C2542as c2542as) {
        String strM12910d = c2542as.m12889e().m12910d();
        if (!TextUtils.isEmpty(strM12910d)) {
            try {
                EntryPoint.m13192a(this.f16059c, strM12910d);
            } catch (Exception e) {
                int i = 3;
                String str = String.format("Exception:\n %s\n", e.getMessage());
                if (this.f16059c.f16043r == 4) {
                    str = String.format("Exception:\n %s\n$$$ failed", e.getMessage());
                    i = 1;
                }
                this.f16059c.m13207b(str, i);
            }
        }
        this.f16057a.open();
    }

    @Override // com.p188b.p189a.InterfaceC2554h
    /* JADX INFO: renamed from: a */
    public final void mo12929a(IOException iOException) {
        new HashMap().put("stack", this.f16059c.getStackString(iOException));
        this.f16058b[0] = true;
        if (this.f16059c.f16043r == 4) {
            this.f16059c.m13207b(this.f16059c.getStackString(iOException) + "\n$$$ failed\n", 1);
        } else {
            EntryPoint entryPoint = this.f16059c;
            entryPoint.m13207b(entryPoint.getStackString(iOException), 3);
        }
        this.f16057a.open();
    }
}
