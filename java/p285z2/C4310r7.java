package p285z2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.Script;
import com.cyjh.elfin.floatingwindowprocess.service.FloatingWindowService;
import java.util.concurrent.Executors;
import p285z2.C3687ad;

/* JADX INFO: renamed from: z2.r7 */
/* JADX INFO: loaded from: classes.dex */
public class C4310r7 {
    private static final C4310r7 OooO0o = new C4310r7();
    private static final String OooO0o0 = "z2.r7";
    private Messenger OooO00o;
    private OooO0O0 OooO0OO = new OooO0O0();
    private Messenger OooO0Oo = new Messenger(this.OooO0OO);
    private ServiceConnection OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: z2.r7$OooO00o */
    public class OooO00o implements ServiceConnection {
        public OooO00o() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C4310r7.this.OooO00o = new Messenger(iBinder);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putInt(C3793d8.OooO00o, 30000);
            messageObtain.setData(bundle);
            messageObtain.replyTo = C4310r7.this.OooO0Oo;
            try {
                C4310r7.this.OooO00o.send(messageObtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: z2.r7$OooO0O0 */
    public static class OooO0O0 extends Handler {

        /* JADX INFO: renamed from: z2.r7$OooO0O0$OooO00o */
        public class OooO00o implements C3687ad.OooO00o {
            public OooO00o() {
            }

            @Override // p285z2.C3687ad.OooO00o
            public void OooO00o(int i, String str) {
                String unused = C4310r7.OooO0o0;
                String str2 = "doSpecialFuction --> uploadInstanceData onFailure message=" + str;
            }

            @Override // p285z2.C3687ad.OooO00o
            public void onSuccess(String str) {
                String unused = C4310r7.OooO0o0;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Script scriptOooO0oO;
            super.handleMessage(message);
            Bundle data = message.getData();
            int i = data.getInt(C3793d8.OooO00o);
            int i2 = data.getInt(C3793d8.OooO0OO);
            if (1 == i) {
                C3765ch.OooOOOO();
            } else if (i == 4) {
                C3765ch.OooOOO();
            }
            String string = data.getString(C3793d8.OooO0O0);
            if (i2 == 1002) {
                C3765ch.OooO0o0(i == 6 ? 0 : -1, string);
                return;
            }
            if (i2 == 1001) {
                C3765ch.OooO0Oo(i == 6 ? 0 : -1, string);
                return;
            }
            if (i2 == 1003) {
                new AsyncTaskC3904g8().executeOnExecutor(Executors.newCachedThreadPool(), string);
                return;
            }
            if (i2 == 1101) {
                String unused = C4310r7.OooO0o0;
                j10.OooO0o().OooOOOO(new C3802dh(10101));
            } else if (i2 == 1004 && C3683a9.OooO0oo() && (scriptOooO0oO = C3718b7.OooO0Oo().OooO0oO()) != null) {
                C3687ad.OooO0o().OooOO0(AppContext.OooO00o(), scriptOooO0oO.getId(), string, new OooO00o());
            }
        }
    }

    public static C4310r7 OooO0o() {
        return OooO0o;
    }

    public void OooO0o0(Context context) {
        Intent intent = new Intent(context, (Class<?>) FloatingWindowService.class);
        ServiceConnection serviceConnection = this.OooO0O0;
        if (serviceConnection != null) {
            context.bindService(intent, serviceConnection, 1);
        }
    }

    public void OooO0oO(int i) {
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putInt(C3793d8.OooO00o, i);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.OooO0Oo;
        try {
            this.OooO00o.send(messageObtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void OooO0oo(Context context) {
        context.unbindService(this.OooO0O0);
        this.OooO0OO = null;
        this.OooO0Oo = null;
        this.OooO00o = null;
    }
}
