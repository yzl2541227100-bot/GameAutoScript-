package p285z2;

import com.cyjh.mobileanjian.ipc.interfaces.OnSpecialMqCmdCallback;
import com.cyjh.p202mq.sdk.MqRunner;
import com.cyjh.p202mq.sdk.MqRunnerLite;
import com.cyjh.p202mq.sdk.inf.IRunner;
import com.cyjh.p202mq.sdk.inf.OnElfCallback;

/* JADX INFO: renamed from: z2.ki */
/* JADX INFO: loaded from: classes2.dex */
public class C4062ki extends AbstractC3877fi {
    @Override // p285z2.AbstractC3877fi
    public void OooO(String str) {
    }

    @Override // p285z2.AbstractC3877fi
    public IRunner OooO00o() {
        return MqRunnerLite.getInstance();
    }

    @Override // p285z2.AbstractC3877fi
    public void OooO0O0(String str, String str2, String str3, OnElfCallback onElfCallback) {
        MqRunner.getInstance().OooO00o(str, str2, str3, onElfCallback);
        MqRunnerLite.getInstance().OooO00o(str, str2, str3, onElfCallback);
    }

    @Override // p285z2.AbstractC3877fi
    public void OooO0o(boolean z, int i, int i2, int i3, int i4) {
        MqRunnerLite.getInstance().setImageCrop(z, i, i2, i3, i4);
    }

    @Override // p285z2.AbstractC3877fi
    public void OooO0oo(OnSpecialMqCmdCallback onSpecialMqCmdCallback) {
        MqRunnerLite.getInstance().OooO0oO(onSpecialMqCmdCallback);
    }

    public void OooOOO0(String str) {
        MqRunnerLite.getInstance().OooO0oo(str);
    }
}
