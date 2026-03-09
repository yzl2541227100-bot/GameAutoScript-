package cn.haorui.sdk.core.exception;

import cn.haorui.sdk.core.utils.LogUtil;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import p285z2.C4299qx;
import p285z2.InterfaceC4335rw;
import p285z2.InterfaceC4372sw;

/* JADX INFO: renamed from: cn.haorui.sdk.core.exception.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0494b implements InterfaceC4372sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CountDownLatch f90a;

    public C0494b(CountDownLatch countDownLatch) {
        this.f90a = countDownLatch;
    }

    @Override // p285z2.InterfaceC4372sw
    public void onFailure(InterfaceC4335rw interfaceC4335rw, IOException iOException) {
        iOException.printStackTrace();
        this.f90a.countDown();
        LogUtil.m87e("UncaughtExceptionProcessor", "uploadException error ");
    }

    @Override // p285z2.InterfaceC4372sw
    public void onResponse(InterfaceC4335rw interfaceC4335rw, C4299qx c4299qx) {
        this.f90a.countDown();
        LogUtil.m86d("UncaughtExceptionProcessor", "uploadException " + c4299qx.toString());
    }
}
