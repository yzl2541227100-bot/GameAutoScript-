package p285z2;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback;
import com.cyjh.p202mq.sdk.MqRunner;
import com.google.protobuf.ByteString;

/* JADX INFO: renamed from: z2.f8 */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC3867f8 extends AsyncTask<Void, Void, String> {
    private static final String OooO00o = "MyAsyncTask";

    /* JADX INFO: renamed from: z2.f8$OooO00o */
    public class OooO00o implements OnScreenShotCallback {
        public final /* synthetic */ String OooO00o;

        public OooO00o(String str) {
            this.OooO00o = str;
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback
        public void onScreenShotDone(String str, ByteString byteString) {
            C4014j7 c4014j7OooO0O0;
            String str2;
            int iIntValue = Integer.valueOf(str).intValue();
            int i = 65535 & iIntValue;
            int i2 = iIntValue >> 16;
            String str3 = "onScreenShotDone -->\u3000width=" + i2 + ",height = " + i;
            Bitmap bitmapOooOO0O = C3683a9.OooOO0O(i2, i, byteString);
            if (bitmapOooOO0O != null) {
                C4011j4.OooOo00(bitmapOooOO0O, this.OooO00o);
                c4014j7OooO0O0 = C4014j7.OooO0O0();
                str2 = this.OooO00o;
            } else {
                c4014j7OooO0O0 = C4014j7.OooO0O0();
                str2 = "";
            }
            c4014j7OooO0O0.OooO0oO(6, 1003, str2);
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback
        public void onScreenShotFailed(int i) {
            C4014j7.OooO0O0().OooO0oO(6, 1003, "");
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        String absolutePath = C4011j4.OooOO0o(AppContext.OooO00o().getPackageName(), "screen_capture.png").getAbsolutePath();
        MqRunner.getInstance().OooO0OO(1, 3000, new OooO00o(absolutePath));
        return absolutePath;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
    }
}
