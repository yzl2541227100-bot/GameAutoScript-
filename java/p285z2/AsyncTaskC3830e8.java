package p285z2;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.http.oss.MyOSSUtils;
import com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback;
import com.cyjh.p202mq.sdk.MqRunner;
import com.google.protobuf.ByteString;
import com.ywfzjbcy.R;
import java.io.File;
import p285z2.C4611zc;

/* JADX INFO: renamed from: z2.e8 */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC3830e8 extends AsyncTask<Void, Void, String> {
    private static final String OooO0O0 = "MyAsyncTask";
    private OooO0OO OooO00o;

    /* JADX INFO: renamed from: z2.e8$OooO00o */
    public class OooO00o implements OnScreenShotCallback {
        public final /* synthetic */ String OooO00o;

        /* JADX INFO: renamed from: z2.e8$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C4725OooO00o implements MyOSSUtils.UploadFileCallBack {
            public final /* synthetic */ String OooO00o;

            public C4725OooO00o(String str) {
                this.OooO00o = str;
            }

            @Override // com.cyjh.http.oss.MyOSSUtils.UploadFileCallBack
            public void uploadFail(String str) {
                String str2 = "uploadFail -- > 上传图片失败 fileName=" + str;
                C3765ch.OooO0O0(-1, "阿里云上传图片失败！");
            }

            @Override // com.cyjh.http.oss.MyOSSUtils.UploadFileCallBack
            public void uploadProgress(long j, long j2) {
            }

            @Override // com.cyjh.http.oss.MyOSSUtils.UploadFileCallBack
            public void uploadSuc(String str, String str2) {
                String str3 = "uploadSuc -- > 上传图片成功 serverUrl=" + str;
                AsyncTaskC3830e8.this.OooO0o0(C3718b7.OooO0Oo().OooO0oO().getId(), this.OooO00o);
            }
        }

        public OooO00o(String str) {
            this.OooO00o = str;
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback
        public void onScreenShotDone(String str, ByteString byteString) {
            String str2;
            int iIntValue = Integer.valueOf(str).intValue();
            int i = 65535 & iIntValue;
            int i2 = iIntValue >> 16;
            String str3 = "onScreenShotDone -->\u3000width=" + i2 + ",height = " + i;
            Bitmap bitmapOooOO0O = C3683a9.OooOO0O(i2, i, byteString);
            if (bitmapOooOO0O != null) {
                C4011j4.OooOo00(bitmapOooOO0O, this.OooO00o);
                File file = new File(this.OooO00o);
                if (file.exists() && file.length() > 0) {
                    if (C3834ec.OooO0OO().OooO0OO == null) {
                        if (AsyncTaskC3830e8.this.OooO00o != null) {
                            AsyncTaskC3830e8.this.OooO00o.OooO00o(0);
                        }
                        new C4389tc().OooO0OO(AppContext.OooO00o());
                        str2 = "阿里云存储初始化中……";
                    } else {
                        if (!TextUtils.isEmpty(C3834ec.OooO0OO().OooO0OO.OssStudioScreenshotPathF)) {
                            String str4 = C3834ec.OooO0OO().OooO0OO.OssStudioScreenshotPathF.replace("{AppId}", AppContext.OooO00o().getString(R.string.elfin_appid)).replace("{ScriptId}", C3718b7.OooO0Oo().OooO0oO().getId()).replace("{DeviceId}", C3688ae.OooO00o(AppContext.OooO00o()).DeviceId) + File.separator + System.currentTimeMillis() + ".png";
                            String str5 = "objectKey=" + str4;
                            MyOSSUtils myOSSUtilsBuild = new MyOSSUtils.Builder(AppContext.OooO00o(), C3834ec.OooO0OO().OooO0OO).build();
                            if (!myOSSUtilsBuild.isTokenExpireTime()) {
                                myOSSUtilsBuild.uploadFile(this.OooO00o, str4, new C4725OooO00o(str4));
                                return;
                            }
                            C3765ch.OooO0O0(-1, "阿里云Token过期，稍后再试！");
                            if (AsyncTaskC3830e8.this.OooO00o != null) {
                                AsyncTaskC3830e8.this.OooO00o.OooO00o(0);
                            }
                            new C4389tc().OooO0OO(AppContext.OooO00o());
                            return;
                        }
                        str2 = "OssStudioScreenshotPathF参数出错！";
                    }
                    C3765ch.OooO0O0(-1, str2);
                    return;
                }
            }
            C3765ch.OooO0O0(-1, "截图文件生成失败！");
        }

        @Override // com.cyjh.mobileanjian.ipc.interfaces.OnScreenShotCallback
        public void onScreenShotFailed(int i) {
            C3765ch.OooO0O0(-1, "截图文件生成失败！");
        }
    }

    /* JADX INFO: renamed from: z2.e8$OooO0O0 */
    public class OooO0O0 implements C4611zc.OooO00o {
        public OooO0O0() {
        }

        @Override // p285z2.C4611zc.OooO00o
        public void OooO00o(int i, String str) {
            C3765ch.OooO0O0(-1, "上传文件失败！");
        }

        @Override // p285z2.C4611zc.OooO00o
        public void onSuccess(String str) {
            C3765ch.OooO0O0(0, "截屏成功！");
        }
    }

    /* JADX INFO: renamed from: z2.e8$OooO0OO */
    public interface OooO0OO {
        void OooO00o(int i);
    }

    public AsyncTaskC3830e8(OooO0OO oooO0OO) {
        this.OooO00o = oooO0OO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooO0o0(String str, String str2) {
        C4611zc.OooO0o().OooOO0(AppContext.OooO00o(), str, str2, new OooO0O0());
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        String absolutePath = C4011j4.OooOO0o(AppContext.OooO00o().getPackageName(), "screen_capture.png").getAbsolutePath();
        MqRunner.getInstance().OooO0OO(1, 3000, new OooO00o(absolutePath));
        return absolutePath;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
    }
}
