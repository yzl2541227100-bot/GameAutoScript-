package p285z2;

import com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback;
import com.cyjh.p202mq.sdk.MqRunner;
import com.cyjh.p202mq.sdk.inf.IRunner;
import com.cyjh.p202mq.sdk.inf.OnElfCallback;

/* JADX INFO: renamed from: z2.ji */
/* JADX INFO: loaded from: classes2.dex */
public class C4025ji extends AbstractC3877fi {
    @Override // p285z2.AbstractC3877fi
    public void OooO(String str) {
        MqRunner.getInstance().OooO0o0(str);
    }

    @Override // p285z2.AbstractC3877fi
    public IRunner OooO00o() {
        return MqRunner.getInstance();
    }

    @Override // p285z2.AbstractC3877fi
    public void OooO0O0(String str, String str2, String str3, OnElfCallback onElfCallback) {
        MqRunner.getInstance().OooO00o(str, str2, str3, onElfCallback);
    }

    @Override // p285z2.AbstractC3877fi
    public void OooO0o(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // p285z2.AbstractC3877fi
    public void OooO0oo(OnSpecialMqCmdCallback onSpecialMqCmdCallback) {
        MqRunner.getInstance().OooO0oO(onSpecialMqCmdCallback);
    }

    public void OooOOO(String str) {
        MqRunner.getInstance().OooO0oo(str);
    }

    public void OooOOO0(String str, String str2, String str3) {
        MqRunner.getInstance().OooO00o(str, str2, str3, null);
    }
}
