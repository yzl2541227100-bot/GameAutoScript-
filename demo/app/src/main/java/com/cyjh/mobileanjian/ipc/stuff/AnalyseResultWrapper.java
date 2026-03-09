package com.cyjh.mobileanjian.ipc.stuff;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.goldcoast.sdk.domain.AnalyseResult;

/* JADX INFO: loaded from: classes2.dex */
public class AnalyseResultWrapper {
    private static Context OooO00o;
    private static Handler OooO0O0 = new OooO00o();

    public class OooO00o extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            String string = message.getData().getString(C1796r.f10844ah);
            int i = message.getData().getInt("status");
            Log.i("MyApp", string);
            if (i == 1) {
                Toast.makeText(AnalyseResultWrapper.OooO00o, string, 0).show();
            }
        }
    }

    public class OooO0O0 implements AnalyseResult {
        @Override // com.goldcoast.sdk.domain.AnalyseResult
        public final void onException(String str) {
            AnalyseResultWrapper.OooO0O0(str, 3);
        }

        @Override // com.goldcoast.sdk.domain.AnalyseResult
        public final void onFailed(String str) {
            AnalyseResultWrapper.OooO0O0(str, 1);
        }

        @Override // com.goldcoast.sdk.domain.AnalyseResult
        public final void onProgress(String str) {
            AnalyseResultWrapper.OooO0O0(str, 2);
        }

        @Override // com.goldcoast.sdk.domain.AnalyseResult
        public final void onSuccess(String str) {
            AnalyseResultWrapper.OooO0O0(str, 0);
        }
    }

    public static /* synthetic */ void OooO0O0(String str, int i) {
        Handler handler = OooO0O0;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putString(C1796r.f10844ah, str);
            bundle.putInt("status", i);
            messageObtainMessage.setData(bundle);
            OooO0O0.sendMessage(messageObtainMessage);
        }
    }

    private static void OooO0OO(String str, int i) {
        Handler handler = OooO0O0;
        if (handler == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString(C1796r.f10844ah, str);
        bundle.putInt("status", i);
        messageObtainMessage.setData(bundle);
        OooO0O0.sendMessage(messageObtainMessage);
    }

    public static AnalyseResult resultBuilder(Context context) {
        OooO00o = context;
        return new OooO0O0();
    }

    public static AnalyseResult resultBuilder(Context context, Handler handler) {
        OooO00o = context;
        OooO0O0 = null;
        OooO0O0 = handler;
        return resultBuilder(context);
    }
}
