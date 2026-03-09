package com.cyjh.event;

import android.app.Instrumentation;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.media.MediaScannerConnection;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.cyjh.event.accessibility.Cservice;
import com.cyjh.mobileanjian.ipc.interfaces.OnScriptListener;
import com.cyjh.mobileanjian.ipc.view.ExToast;
import com.cyjh.p202mq.sdk.MqRunner;
import com.cyjh.p202mq.sdk.MqRunnerLite;
import com.github.kevinsawicki.http.HttpRequest;
import com.google.protobuf.ByteString;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.googlecode.tesseract.android.TessBaseAPI;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.AuthenticationFailedException;
import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import org.apache.commons.p284io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p285z2.C3722bb;
import p285z2.C3759cb;
import p285z2.C3772co;
import p285z2.C3873fe;
import p285z2.C3899g3;
import p285z2.C3985if;
import p285z2.C3986ig;
import p285z2.C4003ix;
import p285z2.C4134mg;
import p285z2.C4317re;
import p285z2.C4354se;
import p285z2.C4503wf;
import p285z2.C4553xs;
import p285z2.C4614zf;
import p285z2.InterfaceC4047k3;
import p285z2.ViewOnClickListenerC4576ye;

/* JADX INFO: loaded from: classes.dex */
public final class Injector {
    private static boolean OooO = false;
    private static final String OooO00o = "Injector";
    private static Instrumentation OooO0O0 = null;
    private static Context OooO0OO = null;
    private static ExToast OooO0Oo = null;
    private static ViewOnClickListenerC4576ye OooO0o = null;
    private static C3873fe OooO0o0 = null;
    private static TessBaseAPI OooO0oO = null;
    private static boolean OooO0oo = false;
    private static int OooOO0 = 0;
    private static final float OooOO0o = 0.0f;
    private static final float OooOOO = -3.1415927f;
    private static final float OooOOO0 = -1.5707964f;
    private static final float OooOOOO = 1.5707964f;
    private static boolean OooOOOo = false;
    private static String OooOOo = null;
    private static int OooOOo0 = 0;
    private static final int OooOOoo = 1;
    private static final int OooOo = 2;
    private static final String OooOo0 = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.64 Safari/537.11";
    private static final int OooOo00 = 2;
    private static final int OooOo0O = 5;
    private static final int OooOo0o = 1;
    private static final int OooOoO0 = 3;
    private static Handler OooOO0O = new OooO00o(Looper.getMainLooper());
    private static OooO0o[] OooOoO = null;
    private static MotionEvent.PointerProperties[] OooOoOO = null;
    private static MotionEvent.PointerCoords[] OooOoo0 = null;

    public interface OooO {
        public static final int OooO = 9;
        public static final int OooO00o = 1;
        public static final int OooO0O0 = 2;
        public static final int OooO0OO = 3;
        public static final int OooO0Oo = 4;
        public static final int OooO0o = 6;
        public static final int OooO0o0 = 5;
        public static final int OooO0oO = 7;
        public static final int OooO0oo = 8;
    }

    public class OooO00o extends Handler {
        public OooO00o(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Injector.OooO0oo((C3722bb) message.obj);
                    break;
                case 2:
                    Injector.OooOO0o((C3722bb) message.obj);
                    break;
                case 3:
                    Injector.OooOOOo((C3722bb) message.obj);
                    break;
                case 4:
                    Injector.OooOOoo((C3722bb) message.obj);
                    break;
                case 5:
                    Injector.OooOO0O();
                    break;
                case 6:
                    Injector.OooO0Oo();
                    break;
                case 7:
                    Injector.OooO((byte[]) message.obj);
                    break;
                case 8:
                    C3722bb c3722bb = (C3722bb) message.obj;
                    if (!MqRunnerLite.getInstance().OooO0o) {
                        MqRunner.getInstance();
                    } else {
                        if (MqRunnerLite.getInstance().OooO0o0 != null) {
                            MqRunnerLite.getInstance().OooO0o0.onCallback(c3722bb.OooO00o, c3722bb.OooO0Oo);
                        }
                        if (MqRunnerLite.getInstance().OooO0Oo != null) {
                            MqRunnerLite.getInstance().OooO0Oo.callback(c3722bb.OooO00o, c3722bb.OooO0Oo);
                        }
                    }
                    break;
                case 9:
                    Injector.OooOo0((C3722bb) message.obj);
                    break;
            }
        }
    }

    public class OooO0O0 implements C4317re.OooO0o {
        @Override // p285z2.C4317re.OooO0o
        /* JADX INFO: renamed from: a */
        public final void mo13085a(int i) {
            Injector.setSyncReturnValue(i, "");
        }
    }

    public class OooO0OO implements C4354se.OooO0O0 {
        @Override // p285z2.C4354se.OooO0O0
        /* JADX INFO: renamed from: a */
        public final void mo13086a(String str) {
            Injector.setSyncReturnValue(0, str);
        }
    }

    public static class OooO0o {
        public boolean OooO00o;
        public int OooO0O0;
        public float OooO0OO;
        public float OooO0Oo;

        private OooO0o() {
        }

        public /* synthetic */ OooO0o(byte b) {
            this();
        }
    }

    private Injector() {
    }

    public static void AddContact(String str, String str2, String str3) {
        C3985if.OooO0o0(OooO0OO, str, str2, str3);
    }

    public static void ClearAllPhotos() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/anjian/";
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
        String str2 = "_data like \"" + str + "%\"";
        OooO0OO.getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, str2, null);
        OooO0OO.getContentResolver().delete(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, str2, null);
    }

    public static void ClearCaches(String str) {
    }

    public static void ClearContacts() throws Throwable {
        C3985if.OooO00o(OooO0OO);
    }

    public static void DeleteContact(String str) {
        C3985if.OooO0O0(OooO0OO, str);
    }

    public static void FloatEventThreadExit() {
        C3759cb.OooO0oo();
    }

    public static void FreeupMemory() {
        OooO0o0.OooOOOo();
    }

    public static String GetAndroidVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String GetAppPackageName() {
        return "";
    }

    public static String GetAppPath(String str) {
        try {
            return OooO0OO.getPackageManager().getApplicationInfo(str, 0).sourceDir;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String GetAppSingInfo() {
        return "";
    }

    public static String GetDeviceID() {
        Context contextOooO0o0 = C4614zf.OooO0o0();
        String deviceId = ((TelephonyManager) contextOooO0o0.getSystemService("phone")).getDeviceId();
        if (deviceId == null || deviceId.equals("")) {
            deviceId = C4134mg.OooO00o(contextOooO0o0);
        }
        return TextUtils.isEmpty(deviceId) ? C4134mg.OooO00o(C4614zf.OooO0o0()) : deviceId;
    }

    public static String GetDeviceName() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && !TextUtils.isEmpty(defaultAdapter.getName())) {
                return defaultAdapter.getName();
            }
        } catch (Exception unused) {
        }
        return Build.MODEL;
    }

    public static int GetDisplayDpi() {
        return OooO0OO.getResources().getDisplayMetrics().densityDpi;
    }

    public static byte[] GetFloatEvent() {
        ByteString byteStringOooO0oO = C3759cb.OooO0oO();
        if (byteStringOooO0oO == null) {
            return null;
        }
        return byteStringOooO0oO.toByteArray();
    }

    public static String GetForegroundPackage(int i) {
        return MqRunnerLite.getInstance().OooO0oO != null ? MqRunnerLite.getInstance().OooO0oO.getForegroundPackage() : "";
    }

    public static String GetFullUiElement() {
        return "";
    }

    public static String GetNetType() {
        return OooO0o0.OooOo0O();
    }

    public static String GetRunningApp() {
        return MqRunnerLite.getInstance().OooO0oO.getRunningPackages();
    }

    public static int GetScreenRotation() {
        return ((WindowManager) C4614zf.OooO0Oo().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static String GetSdcardDir() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static float GetTapRotation() {
        int iGetScreenRotation = GetScreenRotation();
        if (iGetScreenRotation == 0) {
            return 0.0f;
        }
        if (iGetScreenRotation == 1) {
            return OooOOO0;
        }
        if (iGetScreenRotation == 2) {
            return OooOOO;
        }
        if (iGetScreenRotation != 3) {
            return 0.0f;
        }
        return OooOOOO;
    }

    public static String GetUiElement() {
        return "";
    }

    public static byte[] GetUiEvent() {
        return C3759cb.OooO0Oo();
    }

    public static boolean GetVPNStatus() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.isUp()) {
                    String name = networkInterface.getName();
                    Log.e("GetVPNStatus", "GetVPNStatus name:" + networkInterface.getName());
                    if (name.contains("tun") || name.contains("ppp") || name.contains("pptp")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String GetVersion() {
        return "10_2116";
    }

    public static String GetWebViewElement(String str) {
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String ImageQRDeCode(java.lang.String r12) throws java.lang.Throwable {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.zxing.DecodeHintType r1 = com.google.zxing.DecodeHintType.CHARACTER_SET
            java.lang.String r2 = "utf-8"
            r0.put(r1, r2)
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Exception -> L20 java.lang.Throwable -> La5
            r2.close()     // Catch: java.io.IOException -> L1a
            goto L1e
        L1a:
            r2 = move-exception
            r2.printStackTrace()
        L1e:
            r2 = r12
            goto L35
        L20:
            r12 = move-exception
            goto L27
        L22:
            r12 = move-exception
            goto La7
        L25:
            r12 = move-exception
            r2 = r1
        L27:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L34
            r2.close()     // Catch: java.io.IOException -> L30
            goto L34
        L30:
            r12 = move-exception
            r12.printStackTrace()
        L34:
            r2 = r1
        L35:
            int r12 = r2.getWidth()     // Catch: java.lang.Exception -> L81
            int r10 = r2.getHeight()     // Catch: java.lang.Exception -> L81
            int r3 = r12 * r10
            int[] r11 = new int[r3]     // Catch: java.lang.Exception -> L81
            r4 = 0
            r6 = 0
            r7 = 0
            r3 = r11
            r5 = r12
            r8 = r12
            r9 = r10
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L81
            z2.am r2 = new z2.am     // Catch: java.lang.Exception -> L81
            r2.<init>(r12, r10, r11)     // Catch: java.lang.Exception -> L81
            z2.xl r12 = new z2.xl     // Catch: java.lang.Exception -> L7f
            r12.<init>()     // Catch: java.lang.Exception -> L7f
            z2.tl r3 = new z2.tl     // Catch: java.lang.Exception -> L7f
            z2.jo r4 = new z2.jo     // Catch: java.lang.Exception -> L7f
            r4.<init>(r2)     // Catch: java.lang.Exception -> L7f
            r3.<init>(r4)     // Catch: java.lang.Exception -> L7f
            z2.cm r12 = r12.OooO00o(r3, r0)     // Catch: java.lang.Exception -> L7f
            java.lang.String r3 = "RootIpcFramework"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            java.lang.String r5 = "syncDecodeQRCode: result is:"
            r4.<init>(r5)     // Catch: java.lang.Exception -> L7f
            java.lang.String r5 = r12.OooO0oO()     // Catch: java.lang.Exception -> L7f
            r4.append(r5)     // Catch: java.lang.Exception -> L7f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L7f
            android.util.Log.i(r3, r4)     // Catch: java.lang.Exception -> L7f
            java.lang.String r12 = r12.OooO0oO()     // Catch: java.lang.Exception -> L7f
            return r12
        L7f:
            r12 = move-exception
            goto L83
        L81:
            r12 = move-exception
            r2 = r1
        L83:
            r12.printStackTrace()
            if (r2 == 0) goto La4
            z2.xl r12 = new z2.xl     // Catch: java.lang.Throwable -> La0
            r12.<init>()     // Catch: java.lang.Throwable -> La0
            z2.tl r3 = new z2.tl     // Catch: java.lang.Throwable -> La0
            z2.ho r4 = new z2.ho     // Catch: java.lang.Throwable -> La0
            r4.<init>(r2)     // Catch: java.lang.Throwable -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La0
            z2.cm r12 = r12.OooO00o(r3, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r12 = r12.OooO0oO()     // Catch: java.lang.Throwable -> La0
            return r12
        La0:
            r12 = move-exception
            r12.printStackTrace()
        La4:
            return r1
        La5:
            r12 = move-exception
            r1 = r2
        La7:
            if (r1 == 0) goto Lb1
            r1.close()     // Catch: java.io.IOException -> Lad
            goto Lb1
        Lad:
            r0 = move-exception
            r0.printStackTrace()
        Lb1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.event.Injector.ImageQRDeCode(java.lang.String):java.lang.String");
    }

    public static void ImageQREnCode(String str, String str2, int i) {
        C3772co c3772coOooO0O0;
        C4553xs c4553xs = new C4553xs();
        HashMap map = new HashMap();
        map.put(EncodeHintType.CHARACTER_SET, "utf-8");
        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        map.put(EncodeHintType.MARGIN, 2);
        try {
            c3772coOooO0O0 = c4553xs.OooO0O0(str2, BarcodeFormat.QR_CODE, 400, 400, map);
        } catch (WriterException e) {
            e.printStackTrace();
            c3772coOooO0O0 = null;
        }
        int[] iArr = new int[160000];
        for (int i2 = 0; i2 < 400; i2++) {
            for (int i3 = 0; i3 < 400; i3++) {
                if (c3772coOooO0O0.OooO0o0(i2, i3)) {
                    iArr[(i2 * 400) + i3] = -16777216;
                } else {
                    iArr[(i2 * 400) + i3] = -1;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, 400, 400, Bitmap.Config.RGB_565);
        if (bitmapCreateBitmap == null) {
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapCreateBitmap.compress(str.endsWith(".png") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("RootIpcFramework", "ImageQREnCode IOException" + e2.toString());
        }
    }

    public static int InjectWebViewElement(String str, String str2) {
        return 0;
    }

    public static void InsertImageToGallery(String str, int i) throws Throwable {
        int i2 = Build.VERSION.SDK_INT;
        File file = new File(str);
        if (file.exists()) {
            if (i == 1) {
                String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/anjian/";
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdir();
                }
                File file3 = new File(str2 + file.getName());
                if (file3.exists()) {
                    file3.delete();
                }
                try {
                    FileUtils.copyFile(file, file3);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                file = file3;
            }
            if (i2 < 29) {
                try {
                    MediaStore.Images.Media.insertImage(OooO0OO.getContentResolver(), file.getAbsolutePath(), file.getName(), (String) null);
                } catch (FileNotFoundException e2) {
                    e2.printStackTrace();
                }
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", file.getName());
                contentValues.put("mime_type", "image/jpeg");
                contentValues.put("relative_path", Environment.DIRECTORY_DCIM);
                ContentResolver contentResolver = OooO0OO.getContentResolver();
                Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert == null) {
                    Log.e("InsertImageToGallery", "图片保存失败:" + str + C1801a.f11059bQ + file.getName());
                    return;
                }
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    android.os.FileUtils.copy(bufferedInputStream, outputStreamOpenOutputStream);
                    bufferedInputStream.close();
                    outputStreamOpenOutputStream.close();
                    file.delete();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            if (i2 >= 19) {
                MediaScannerConnection.scanFile(OooO0OO, new String[]{file.getAbsolutePath()}, null, null);
                return;
            }
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            OooO0OO.sendBroadcast(intent);
        }
    }

    public static void InsertVideoToGallery(String str) throws Throwable {
        File file = new File(str);
        if (file.exists()) {
            String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/anjian/";
            File file2 = new File(str2);
            if (!file2.exists()) {
                file2.mkdir();
            }
            File file3 = new File(str2 + file.getName());
            if (file3.exists()) {
                file3.delete();
            }
            try {
                FileUtils.copyFile(file, file3);
            } catch (IOException e) {
                e.printStackTrace();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ContentResolver contentResolver = OooO0OO.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", file3.getName());
            contentValues.put("_display_name", file3.getName());
            contentValues.put("mime_type", "video/3gp");
            contentValues.put("datetaken", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("_data", file3.getAbsolutePath());
            contentValues.put("_size", Long.valueOf(file3.length()));
            OooO0OO.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues)));
        }
    }

    public static boolean Is64Bit() {
        Class<?> cls;
        Method declaredMethod;
        Object objInvoke;
        Method declaredMethod2;
        try {
            if (Build.VERSION.SDK_INT < 21 || (cls = Class.forName("dalvik.system.VMRuntime")) == null || (declaredMethod = cls.getDeclaredMethod("getRuntime", new Class[0])) == null || (objInvoke = declaredMethod.invoke(null, new Object[0])) == null || (declaredMethod2 = cls.getDeclaredMethod("is64Bit", new Class[0])) == null) {
                return false;
            }
            Object objInvoke2 = declaredMethod2.invoke(objInvoke, new Object[0]);
            if (objInvoke2 instanceof Boolean) {
                return ((Boolean) objInvoke2).booleanValue();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static boolean IsRoot() {
        String str = System.getenv("PATH");
        new ArrayList();
        for (String str2 : str.split(":")) {
            File file = new File(str2, "su");
            if (file.exists() && file.canExecute()) {
                return true;
            }
            File file2 = new File(str2, "xu");
            if (file2.exists() && file2.canExecute()) {
                return true;
            }
        }
        return false;
    }

    public static void KeepScreen(boolean z) {
        OooO0o0.OooO0o(z ? 10 : 0);
    }

    public static void KeyDown(int i) {
        try {
            OooOo00().sendKeySync(new KeyEvent(0, i));
        } catch (Throwable unused) {
        }
    }

    public static void KeyPress(int i) {
        if (OooO) {
            KeyPressAB(i);
        } else if (MqRunnerLite.getInstance().OooO0oO != null) {
            MqRunnerLite.getInstance().OooO0oO.keyPress(i);
        }
    }

    public static void KeyPressAB(int i) {
        if (Cservice.OooOOOO()) {
            Cservice.OoooOoo.OooOOOo(i, OooO0OO);
        }
    }

    public static void KeyUp(int i) {
        try {
            OooOo00().sendKeySync(new KeyEvent(1, i));
        } catch (Throwable unused) {
        }
    }

    public static void KillApp(String str) {
        if (MqRunnerLite.getInstance().OooO0oO != null) {
            MqRunnerLite.getInstance().OooO0oO.killApp(str);
        }
    }

    public static void LockScreen() {
        OooO0o0.OooOo00();
    }

    public static void MoveZoomIn(float f, float f2, float f3, float f4, int i) {
        Log.e("RootIpcFramework", "MoveZoomIn");
        float f5 = (f + f3) / 2.0f;
        float f6 = (f2 + f4) / 2.0f;
        TouchDown(10123, f5, f6);
        TouchDown(10124, f5, f6);
        int i2 = i / 11;
        if (i2 < 10) {
            i2 = 10;
        }
        float f7 = (f - f5) / 11.0f;
        float f8 = (f2 - f6) / 11.0f;
        float f9 = (f3 - f5) / 11.0f;
        float f10 = (f4 - f6) / 11.0f;
        try {
            Thread.sleep(20L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        float f11 = f6;
        float f12 = f11;
        float f13 = f5;
        for (int i3 = 0; i3 < 11; i3++) {
            f5 += f7;
            f11 += f8;
            f13 += f9;
            f12 += f10;
            TouchMoveEvent(10123, f5, f11, 0);
            TouchMoveEvent(10124, f13, f12, 0);
            try {
                Thread.sleep(i2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        TouchUp(10123);
        TouchUp(10124);
    }

    public static void MoveZoomOut(float f, float f2, float f3, float f4, int i) {
        Log.e("RootIpcFramework", "MoveZoomOut");
        float f5 = (f + f3) / 2.0f;
        float f6 = (f2 + f4) / 2.0f;
        TouchDown(10125, f, f2);
        TouchDown(10126, f3, f4);
        int i2 = i / 11;
        if (i2 < 10) {
            i2 = 10;
        }
        float f7 = (f5 - f) / 11.0f;
        float f8 = (f6 - f2) / 11.0f;
        float f9 = (f5 - f3) / 11.0f;
        float f10 = (f6 - f4) / 11.0f;
        try {
            Thread.sleep(20L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i3 = 0; i3 < 11; i3++) {
            f += f7;
            f2 += f8;
            f3 += f9;
            f4 += f10;
            TouchMoveEvent(10125, f, f2, 0);
            TouchMoveEvent(10126, f3, f4, 0);
            try {
                Thread.sleep(i2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        TouchUp(10125);
        TouchUp(10126);
    }

    public static void NotifyApp(String str) {
        if (MqRunnerLite.getInstance().OooO0oo != null) {
            MqRunnerLite.getInstance().OooO0oo.callback(str);
        }
    }

    public static String OcrText(byte[] bArr, int i, int i2, int i3) {
        Log.e("TAG", "GetOrcText: width=" + i2 + " hight=" + i3 + " size=" + i);
        if (!OooO0oo) {
            OooO0oo = initTessBass();
        }
        if (!OooO0oo) {
            return "";
        }
        int i4 = i / 4;
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < 4; i6++) {
                iArr[i5] = iArr[i5] + ((bArr[(i5 * 4) + i6] & 255) << ((3 - i6) * 8));
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i2, i3, Bitmap.Config.ARGB_8888);
        OooO0oO.OooO0Oo(bitmapCreateBitmap);
        String strOooO00o = OooO0oO.OooO00o();
        bitmapCreateBitmap.recycle();
        return strOooO00o;
    }

    public static void OnElfCallback(int i, String str) {
        C3722bb c3722bb = new C3722bb();
        c3722bb.OooO00o = i;
        c3722bb.OooO0Oo = str;
        OooO0oO(8, c3722bb);
    }

    public static void OnPause() {
        OooOO0O.sendEmptyMessage(6);
    }

    public static void OnResponse(int i, String str) {
        C3722bb c3722bb = new C3722bb();
        c3722bb.OooO00o = i;
        c3722bb.OooO0Oo = str;
        OooO0oO(8, c3722bb);
    }

    public static void OnResume() {
        OooOO0O.sendEmptyMessage(5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void OooO(byte[] r11) {
        /*
            Method dump skipped, instruction units count: 2534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.event.Injector.OooO(byte[]):void");
    }

    private static final float OooO00o(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    private static int OooO0O0(int i, int i2) {
        int iOooOoO = OooOoO();
        int iOooOOo0 = OooOOo0(OooOOO(i));
        int i3 = 0;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 1 == iOooOoO ? 2 : (iOooOOo0 * 256) + 2;
            } else if (i2 == 3) {
                i3 = 1 == iOooOoO ? 1 : (iOooOOo0 * 256) + 6;
            }
        } else if (1 != iOooOoO) {
            i3 = (iOooOOo0 * 256) + 5;
        }
        StringBuilder sb = new StringBuilder("injector>>>>>>touchType:");
        sb.append(i2);
        sb.append("action:");
        sb.append(i3);
        sb.append("---pointerNum:");
        sb.append(iOooOoO);
        sb.append("---pointerId:");
        sb.append(iOooOOo0);
        return i3;
    }

    private static String OooO0OO(String str) {
        try {
            Matcher matcher = Pattern.compile("[\\u4e00-\\u9fa5]").matcher(str);
            while (matcher.find()) {
                String strGroup = matcher.group();
                str = str.replaceAll(strGroup, URLEncoder.encode(strGroup, "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static /* synthetic */ void OooO0Oo() {
        OnScriptListener onScriptListener = MqRunnerLite.getInstance().OooO0OO;
        if (onScriptListener != null) {
            onScriptListener.onPause();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0021, code lost:
    
        r5.OooO00o = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0023, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void OooO0o(int r5, float r6, float r7) {
        /*
            r0 = 0
            r1 = 0
        L2:
            r2 = 5
            if (r1 >= r2) goto L27
            com.cyjh.event.Injector$OooO0o[] r2 = com.cyjh.event.Injector.OooOoO
            r3 = r2[r1]
            boolean r3 = r3.OooO00o
            if (r3 != 0) goto L24
            r3 = r2[r1]
            int r3 = r3.OooO0O0
            if (r3 != r5) goto L24
            r3 = r2[r1]
            r3.OooO0O0 = r5
            r5 = r2[r1]
            r5.OooO0OO = r6
            r5 = r2[r1]
            r5.OooO0Oo = r7
            r5 = r2[r1]
        L21:
            r5.OooO00o = r0
            return
        L24:
            int r1 = r1 + 1
            goto L2
        L27:
            r1 = 0
        L28:
            if (r1 >= r2) goto L44
            com.cyjh.event.Injector$OooO0o[] r3 = com.cyjh.event.Injector.OooOoO
            r4 = r3[r1]
            boolean r4 = r4.OooO00o
            if (r4 == 0) goto L41
            r2 = r3[r1]
            r2.OooO0O0 = r5
            r5 = r3[r1]
            r5.OooO0OO = r6
            r5 = r3[r1]
            r5.OooO0Oo = r7
            r5 = r3[r1]
            goto L21
        L41:
            int r1 = r1 + 1
            goto L28
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.event.Injector.OooO0o(int, float, float):void");
    }

    private static void OooO0o0(int i) {
        for (int i2 = 0; i2 < 5; i2++) {
            OooO0o[] oooO0oArr = OooOoO;
            if (i == oooO0oArr[i2].OooO0O0) {
                oooO0oArr[i2].OooO00o = true;
                oooO0oArr[i2].OooO0O0 = 0;
                oooO0oArr[i2].OooO0OO = 0.0f;
                oooO0oArr[i2].OooO0Oo = 0.0f;
            }
        }
    }

    private static void OooO0oO(int i, C3722bb c3722bb) {
        StringBuilder sb = new StringBuilder("sendToTargetHandler ");
        sb.append(i);
        sb.append("         ");
        sb.append(c3722bb);
        OooOO0O.obtainMessage(i, c3722bb).sendToTarget();
    }

    public static /* synthetic */ void OooO0oo(C3722bb c3722bb) {
        if (OooO0Oo == null) {
            OooO0Oo = new ExToast(OooO0OO);
        }
        OooO0Oo.show(c3722bb.OooO0Oo, c3722bb.OooO00o, c3722bb.OooO0O0, c3722bb.OooO0OO);
    }

    private static OooO0o OooOO0(int i) {
        for (int i2 = 0; i2 < 5; i2++) {
            OooO0o[] oooO0oArr = OooOoO;
            if (!oooO0oArr[i2].OooO00o && oooO0oArr[i2].OooO0O0 == i) {
                return oooO0oArr[i2];
            }
        }
        return null;
    }

    public static /* synthetic */ void OooOO0O() {
        OnScriptListener onScriptListener = MqRunnerLite.getInstance().OooO0OO;
        if (onScriptListener != null) {
            onScriptListener.onResume();
        }
    }

    public static /* synthetic */ void OooOO0o(C3722bb c3722bb) {
        new C4317re(OooO0OO, c3722bb.OooO0Oo, c3722bb.OooO00o, new OooO0O0()).OooO00o();
    }

    private static int OooOOO(int i) {
        for (int i2 = 0; i2 < 5; i2++) {
            OooO0o[] oooO0oArr = OooOoO;
            if (!oooO0oArr[i2].OooO00o && oooO0oArr[i2].OooO0O0 == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void OooOOO0(byte[] r11) {
        /*
            Method dump skipped, instruction units count: 2534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.event.Injector.OooOOO0(byte[]):void");
    }

    private static void OooOOOO() {
        OnScriptListener onScriptListener = MqRunnerLite.getInstance().OooO0OO;
        if (onScriptListener != null) {
            onScriptListener.onResume();
        }
    }

    public static /* synthetic */ void OooOOOo(C3722bb c3722bb) {
        new C4354se(OooO0OO, c3722bb.OooO0Oo, new OooO0OO()).OooO0O0();
    }

    private static void OooOOo() {
        OnScriptListener onScriptListener = MqRunnerLite.getInstance().OooO0OO;
        if (onScriptListener != null) {
            onScriptListener.onPause();
        }
    }

    private static int OooOOo0(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (!OooOoO[i3].OooO00o) {
                i2++;
            }
        }
        return i2;
    }

    public static /* synthetic */ void OooOOoo(C3722bb c3722bb) {
        OnScriptListener onScriptListener = MqRunnerLite.getInstance().OooO0OO;
        if (onScriptListener != null) {
            onScriptListener.onUpdateControlBarPos(c3722bb.OooO0o0, c3722bb.OooO00o, c3722bb.OooO0O0);
        }
    }

    private static void OooOo() {
        if (OooOoO == null) {
            OooOoO = new OooO0o[5];
            for (int i = 0; i < 5; i++) {
                OooO0o oooO0o = new OooO0o((byte) 0);
                oooO0o.OooO00o = true;
                oooO0o.OooO0O0 = 0;
                oooO0o.OooO0OO = 0.0f;
                oooO0o.OooO0Oo = 0.0f;
                OooOoO[i] = oooO0o;
            }
        }
    }

    public static /* synthetic */ void OooOo0(C3722bb c3722bb) {
        OnScriptListener onScriptListener = MqRunnerLite.getInstance().OooO0OO;
        if (onScriptListener != null) {
            onScriptListener.onSetControlBarVisiable(c3722bb.OooO00o);
        }
    }

    private static Instrumentation OooOo00() {
        if (OooO0O0 == null) {
            OooOO0 = 0;
            OooOO0 = OooOo0O();
            OooO0O0 = new Instrumentation();
        }
        return OooO0O0;
    }

    private static int OooOo0O() {
        boolean zBooleanValue = false;
        for (int i : InputDevice.getDeviceIds()) {
            InputDevice device = InputDevice.getDevice(i);
            try {
                Method declaredMethod = Class.forName(device.getClass().getName()).getDeclaredMethod("supportsSource", Integer.TYPE);
                declaredMethod.setAccessible(true);
                zBooleanValue = ((Boolean) declaredMethod.invoke(device, 4098)).booleanValue();
            } catch (Exception e) {
                new StringBuilder("getInputDeviceId error:").append(e.getMessage());
            }
            if (zBooleanValue) {
                return i;
            }
        }
        return 0;
    }

    private static void OooOo0o(C3722bb c3722bb) {
        if (OooO0Oo == null) {
            OooO0Oo = new ExToast(OooO0OO);
        }
        OooO0Oo.show(c3722bb.OooO0Oo, c3722bb.OooO00o, c3722bb.OooO0O0, c3722bb.OooO0OO);
    }

    private static int OooOoO() {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            if (!OooOoO[i2].OooO00o) {
                i++;
            }
        }
        return i;
    }

    private static void OooOoO0(C3722bb c3722bb) {
        new C4317re(OooO0OO, c3722bb.OooO0Oo, c3722bb.OooO00o, new OooO0O0()).OooO00o();
    }

    private static void OooOoOO(C3722bb c3722bb) {
        new C4354se(OooO0OO, c3722bb.OooO0Oo, new OooO0OO()).OooO0O0();
    }

    private static void OooOoo(C3722bb c3722bb) {
        OnScriptListener onScriptListener = MqRunnerLite.getInstance().OooO0OO;
        if (onScriptListener != null) {
            onScriptListener.onUpdateControlBarPos(c3722bb.OooO0o0, c3722bb.OooO00o, c3722bb.OooO0O0);
        }
    }

    private static void OooOoo0() {
        int iOooOoO = OooOoO();
        if (iOooOoO == 0) {
            return;
        }
        OooOoOO = new MotionEvent.PointerProperties[iOooOoO];
        OooOoo0 = new MotionEvent.PointerCoords[iOooOoO];
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            if (!OooOoO[i2].OooO00o) {
                if (i < iOooOoO) {
                    MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                    MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                    pointerProperties.id = i2;
                    OooO0o[] oooO0oArr = OooOoO;
                    pointerCoords.x = oooO0oArr[i2].OooO0OO;
                    pointerCoords.y = oooO0oArr[i2].OooO0Oo;
                    pointerCoords.orientation = GetTapRotation();
                    OooOoOO[i] = pointerProperties;
                    OooOoo0[i] = pointerCoords;
                }
                i++;
            }
        }
    }

    private static void OooOooO(C3722bb c3722bb) {
        OnScriptListener onScriptListener = MqRunnerLite.getInstance().OooO0OO;
        if (onScriptListener != null) {
            onScriptListener.onSetControlBarVisiable(c3722bb.OooO00o);
        }
    }

    public static void PlaySound(String str) {
        C3873fe.OooOOO(str);
    }

    public static void RandomTap(float f, float f2, int i, String str) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb = new StringBuilder("RandomTap：x=");
            sb.append(f);
            sb.append(",y = ");
            sb.append(f2);
            sb.append(",random = ");
            sb.append(i);
            double d = i;
            float fRandom = f + ((int) ((Math.random() * d) - ((double) (i / 2))));
            float fRandom2 = f2 + ((int) ((Math.random() * d) - ((double) (i / 2))));
            StringBuilder sb2 = new StringBuilder("RandomTap：realX=");
            sb2.append(fRandom);
            sb2.append(",realY = ");
            sb2.append(fRandom2);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.x = fRandom;
            pointerCoords.y = fRandom2;
            pointerCoords.orientation = GetTapRotation();
            OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 1, new int[]{0}, new MotionEvent.PointerCoords[]{pointerCoords}, 0, 0.0f, 0.0f, OooOO0, 0, 0, 0));
            try {
                Thread.sleep(50L);
            } catch (Exception unused) {
            }
            OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, 1, new int[]{0}, new MotionEvent.PointerCoords[]{pointerCoords}, 0, 0.0f, 0.0f, OooOO0, 0, 0, 0));
            new C4503wf(OooO0OO).OooO0O0((int) fRandom, (int) fRandom2, str);
        } catch (Throwable unused2) {
        }
    }

    public static void RandomsTap(float f, float f2, int i, String str) {
        float f3;
        StringBuilder sb = new StringBuilder("RandomsTap：x=");
        sb.append(f);
        sb.append(",y = ");
        sb.append(f2);
        sb.append(",random = ");
        sb.append(i);
        double d = i;
        double d2 = i / 2;
        float fRandom = f + ((int) ((Math.random() * d) - d2));
        float fRandom2 = f2 + ((int) ((Math.random() * d) - d2));
        StringBuilder sb2 = new StringBuilder("RandomTap：x2=");
        sb2.append(fRandom);
        sb2.append(",y2 = ");
        sb2.append(fRandom2);
        long jUptimeMillis = SystemClock.uptimeMillis();
        OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, f, f2, 1.0f, 1.0f, 0, 1.0f, 1.0f, OooOO0, 0));
        try {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            f3 = fRandom;
            try {
                OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 2, fRandom, fRandom2, 1.0f, 1.0f, 0, 1.0f, 1.0f, OooOO0, 0));
                Thread.sleep(20L);
            } catch (InterruptedException e) {
                e = e;
                e.printStackTrace();
            }
        } catch (InterruptedException e2) {
            e = e2;
            f3 = fRandom;
        }
        long jUptimeMillis3 = SystemClock.uptimeMillis();
        OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis3, jUptimeMillis3, 1, f3, fRandom2, 1.0f, 1.0f, 0, 1.0f, 1.0f, OooOO0, 0));
        new C4503wf(OooO0OO).OooO0O0((int) f3, (int) fRandom2, str);
    }

    public static void RunApp(String str, String str2) {
        if (MqRunnerLite.getInstance().OooO0oO != null) {
            MqRunnerLite.getInstance().OooO0oO.launchApp(str);
        }
    }

    public static void SaveSnapShot(int[] iArr, int i, int i2, int i3, String str, int i4) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i2, i3, Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap == null) {
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i4, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("RootIpcFramework", "SaveSnapShot IOException" + e.toString());
        }
    }

    public static boolean SendSimpleEmail(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str6)) {
            Log.i("TestTAG", "SendSimpleEmail1 --- " + Thread.currentThread().getName());
            C3899g3 c3899g3 = new C3899g3(str2, str3);
            Log.i("TestTAG", "SendSimpleEmail2");
            c3899g3.OooO0oO = str;
            c3899g3.OooO0Oo = str2;
            c3899g3.OooO = str5;
            c3899g3.OooO0OO = str6.contains(";") ? str6.split(";") : new String[]{str6};
            c3899g3.OooO0oo = str4;
            try {
                for (String str8 : str7.split("\\|")) {
                    if (new File(str8).exists()) {
                        MimeBodyPart mimeBodyPart = new MimeBodyPart();
                        mimeBodyPart.setDataHandler(new DataHandler(new FileDataSource(str8)));
                        mimeBodyPart.setFileName(str8);
                        c3899g3.OooOO0o.addBodyPart(mimeBodyPart);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                return c3899g3.OooO0o0();
            } catch (AuthenticationFailedException e2) {
                e2.printStackTrace();
            } catch (MessagingException e3) {
                e3.printStackTrace();
                return false;
            } catch (Exception e4) {
                e4.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static byte[] SendUiRequest(byte[] bArr) {
        OooOO0O.obtainMessage(7, bArr).sendToTarget();
        return C3759cb.OooO0O0();
    }

    public static int SetAirplaneMode(boolean z) {
        return -1;
    }

    public static void SetAutoLockTime(int i) {
        OooO0o0.OooOO0(i);
    }

    public static void SetBTEnable(boolean z) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (z) {
            defaultAdapter.enable();
        } else {
            defaultAdapter.disable();
        }
    }

    public static void SetBacklightLevel(int i) {
        if (i > 100) {
            i = 100;
        }
        OooO0o0.OooOOO0(i);
    }

    public static void SetCaptureScreenMode(int i) {
        if (i == 1) {
            C3986ig.OooO0O0(OooO0OO);
        }
    }

    public static void SetCellularDataEnable(boolean z) {
        ConnectivityManager connectivityManager = (ConnectivityManager) OooO0OO.getSystemService("connectivity");
        try {
            connectivityManager.getClass().getMethod("setMobileDataEnabled", Boolean.TYPE).invoke(connectivityManager, Boolean.valueOf(z));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void SetControlBarPos(float f, int i, int i2) {
        C3722bb c3722bb = new C3722bb();
        c3722bb.OooO0o0 = f;
        c3722bb.OooO00o = i;
        c3722bb.OooO0O0 = i2;
        OooO0oO(4, c3722bb);
    }

    public static void SetControlBarVisiable(boolean z) {
        C3722bb c3722bb = new C3722bb();
        c3722bb.OooO00o = z ? 1 : 0;
        OooO0oO(9, c3722bb);
    }

    public static void SetIsAccessibility(boolean z) {
        OooO = z;
    }

    public static void SetRotationLockEnable(boolean z) {
        Settings.System.putInt(OooO0OO.getContentResolver(), "accelerometer_rotation", !z ? 1 : 0);
    }

    public static void SetVPNEnable(boolean z) {
        OooO0o0.OooOo();
    }

    public static void SetVolumeLevel(int i) {
        if (i > 100) {
            i = 100;
        }
        OooO0o0.OooOOo0(i);
    }

    public static void SetWifiEnable(boolean z) {
        ((WifiManager) OooO0OO.getSystemService("wifi")).setWifiEnabled(z);
    }

    public static String ShowInputDialog(String str, int i, int i2) {
        OooOOOo = false;
        C3722bb c3722bb = new C3722bb();
        c3722bb.OooO00o = i;
        c3722bb.OooO0O0 = i2;
        c3722bb.OooO0Oo = str;
        OooO0oO(3, c3722bb);
        while (!OooOOOo) {
            try {
                TimeUnit.MILLISECONDS.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        new StringBuilder("InputDialog typed text: ").append(OooOOo);
        return OooOOo;
    }

    public static void ShowMessage(String str, int i, int i2, int i3) {
        C3722bb c3722bb = new C3722bb();
        c3722bb.OooO00o = i2;
        c3722bb.OooO0O0 = i3;
        c3722bb.OooO0OO = i;
        c3722bb.OooO0Oo = str;
        OooO0oO(1, c3722bb);
    }

    public static int ShowMsgBox(String str, int i, int i2, int i3) {
        OooOOOo = false;
        C3722bb c3722bb = new C3722bb();
        c3722bb.OooO00o = i;
        c3722bb.OooO0O0 = i2;
        c3722bb.OooO0OO = i3;
        c3722bb.OooO0Oo = str;
        OooO0oO(2, c3722bb);
        while (!OooOOOo) {
            try {
                TimeUnit.MILLISECONDS.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return OooOOo0;
    }

    public static void SpecialFunction(int i, String str) {
        StringBuilder sb = new StringBuilder("SpecialFunction   ");
        sb.append(i);
        sb.append(", ");
        sb.append(str);
        if (MqRunnerLite.getInstance().OooO0oO != null) {
            MqRunnerLite.getInstance().OooO0oO.doSpecialFuction(i, str);
        }
    }

    public static void StopPlay() {
        C3873fe.OooOOo();
    }

    public static void StopScript() {
    }

    public static void Swipe(float f, float f2, float f3, float f4, int i) {
        if (OooO) {
            SwipeAB(f, f2, f3, f4, i);
            return;
        }
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, f, f2, 1.0f, 1.0f, 0, 1.0f, 1.0f, OooOO0, 0));
            int i2 = i / 11;
            for (int i3 = 1; i3 <= 11; i3++) {
                try {
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    float f5 = i3 / 11.0f;
                    OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 2, ((f3 - f) * f5) + f, ((f4 - f2) * f5) + f2, 1.0f, 1.0f, 0, 1.0f, 1.0f, OooOO0, 0));
                    if (i2 != 0) {
                        Thread.sleep(i2);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    long jUptimeMillis3 = SystemClock.uptimeMillis();
                    OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis3, jUptimeMillis3, 1, f3, f4, 1.0f, 1.0f, 0, 1.0f, 1.0f, OooOO0, 0));
                }
            }
            long jUptimeMillis32 = SystemClock.uptimeMillis();
            OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis32, jUptimeMillis32, 1, f3, f4, 1.0f, 1.0f, 0, 1.0f, 1.0f, OooOO0, 0));
        } catch (Throwable unused) {
        }
    }

    @RequiresApi(api = 24)
    public static void SwipeAB(float f, float f2, float f3, float f4, int i) {
        int i2 = i <= 10 ? 10 : i;
        String str = OooO00o;
        Log.e(str, "SwipeABSwipeABSwipeAB1");
        if (Cservice.OooOOOO()) {
            Log.e(str, "SwipeABSwipeABSwipeAB2");
            Cservice.OoooOoo.OooO0O0((int) f, (int) f2, (int) f3, (int) f4, i2);
        }
    }

    public static void Tap(float f, float f2, int i) {
        StringBuilder sb = new StringBuilder("ipc process Tap1：x=");
        sb.append(f);
        sb.append(",y = ");
        sb.append(f2);
        sb.append(",delay = ");
        sb.append(i);
        if (OooO) {
            TapAB(f, f2, i);
            return;
        }
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.x = f;
            pointerCoords.y = f2;
            pointerCoords.orientation = GetTapRotation();
            OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 1, new int[]{0}, new MotionEvent.PointerCoords[]{pointerCoords}, 0, 0.0f, 0.0f, OooOO0, 0, 0, 0));
            StringBuilder sb2 = new StringBuilder("Tap2 ：x=");
            sb2.append(f);
            sb2.append(",y = ");
            sb2.append(f2);
            sb2.append(",delay = ");
            sb2.append(i);
            if (i != 0) {
                try {
                    Thread.sleep(i);
                } catch (Exception unused) {
                }
            }
            OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, 1, new int[]{0}, new MotionEvent.PointerCoords[]{pointerCoords}, 0, 0.0f, 0.0f, OooOO0, 0, 0, 0));
            StringBuilder sb3 = new StringBuilder("Tap3 ：x=");
            sb3.append(f);
            sb3.append(",y = ");
            sb3.append(f2);
            sb3.append(",delay = ");
            sb3.append(i);
        } catch (Throwable unused2) {
        }
    }

    @RequiresApi(api = 24)
    public static void TapAB(float f, float f2, int i) {
        if (i <= 10) {
            i = 10;
        }
        StringBuilder sb = new StringBuilder("TapAB (");
        sb.append(f);
        sb.append(",");
        sb.append(f2);
        sb.append(")");
        if (Cservice.OooOOOO()) {
            StringBuilder sb2 = new StringBuilder("TapAB (");
            sb2.append(f);
            sb2.append(",");
            sb2.append(f2);
            sb2.append(")");
            Cservice.OoooOoo.OooO0Oo((int) f, (int) f2, i);
        }
    }

    public static void TouchDown(int i, float f, float f2) {
        try {
            if (OooOoO == null) {
                OooOoO = new OooO0o[5];
                for (int i2 = 0; i2 < 5; i2++) {
                    OooO0o oooO0o = new OooO0o((byte) 0);
                    oooO0o.OooO00o = true;
                    oooO0o.OooO0O0 = 0;
                    oooO0o.OooO0OO = 0.0f;
                    oooO0o.OooO0Oo = 0.0f;
                    OooOoO[i2] = oooO0o;
                }
            }
            if (OooOoO() >= 5) {
                return;
            }
            OooO0o(i, f, f2);
            long jUptimeMillis = SystemClock.uptimeMillis();
            int iOooO0O0 = OooO0O0(i, 1);
            int iOooOoO = OooOoO();
            OooOoo0();
            OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, iOooO0O0, iOooOoO, OooOoOO, OooOoo0, 0, 0, 0.0f, 0.0f, OooOO0, 0, 0, 0));
        } catch (Throwable unused) {
        }
    }

    public static void TouchMove(int i, float f, float f2, int i2) {
        OooO0o oooO0oOooOO0;
        try {
            if (OooOoO == null || (oooO0oOooOO0 = OooOO0(i)) == null) {
                return;
            }
            float f3 = oooO0oOooOO0.OooO0OO;
            float f4 = oooO0oOooOO0.OooO0Oo;
            int i3 = 11;
            if (i2 <= 200) {
                float f5 = f3 - f;
                float f6 = f4 - f2;
                double dSqrt = Math.sqrt((f5 * f5) + (f6 * f6));
                double dMin = Math.min(C4614zf.OooO0o0().getResources().getDisplayMetrics().widthPixels, C4614zf.OooO0o0().getResources().getDisplayMetrics().heightPixels);
                if (!(2.0d * dSqrt > dMin)) {
                    i3 = ((int) ((dSqrt * 20.0d) / dMin)) + 1;
                }
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            for (int i4 = 1; i4 <= i3; i4++) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                float f7 = i4 / i3;
                OooO0o(i, ((f - f3) * f7) + f3, ((f2 - f4) * f7) + f4);
                int iOooO0O0 = OooO0O0(i, 2);
                int iOooOoO = OooOoO();
                OooOoo0();
                OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, iOooO0O0, iOooOoO, OooOoOO, OooOoo0, 0, 0, 0.0f, 0.0f, OooOO0, 0, 0, 0));
                if (i2 != 0) {
                    long jUptimeMillis3 = (((long) i2) - (SystemClock.uptimeMillis() - jUptimeMillis)) / ((long) ((i3 + 1) - i4));
                    if (jUptimeMillis3 >= 10) {
                        Thread.sleep(jUptimeMillis3);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void TouchMoveEvent(int i, float f, float f2, int i2) {
        try {
            if (OooOoO == null || OooOO0(i) == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            OooO0o(i, f, f2);
            int iOooO0O0 = OooO0O0(i, 2);
            int iOooOoO = OooOoO();
            OooOoo0();
            if (i2 > 10) {
                Thread.sleep(i2 - 15);
            }
            OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, iOooO0O0, iOooOoO, OooOoOO, OooOoo0, 0, 0, 0.0f, 0.0f, OooOO0, 0, 0, 0));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void TouchUp(int i) {
        try {
            if (OooOoO == null || OooOO0(i) == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            int iOooO0O0 = OooO0O0(i, 3);
            int iOooOoO = OooOoO();
            OooOoo0();
            OooOo00().sendPointerSync(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, iOooO0O0, iOooOoO, OooOoOO, OooOoo0, 0, 0, 0.0f, 0.0f, OooOO0, 0, 0, 0));
            for (int i2 = 0; i2 < 5; i2++) {
                OooO0o[] oooO0oArr = OooOoO;
                if (i == oooO0oArr[i2].OooO0O0) {
                    oooO0oArr[i2].OooO00o = true;
                    oooO0oArr[i2].OooO0O0 = 0;
                    oooO0oArr[i2].OooO0OO = 0.0f;
                    oooO0oArr[i2].OooO0Oo = 0.0f;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void TracePrint(String str) {
    }

    public static int UninstallApp(String str, String str2) {
        return -1;
    }

    public static void UnlockScreen() {
        OooO0o0.OooOo0();
    }

    public static String UrlRequest(int i, String str, String str2, int i2) {
        if (i2 <= 0) {
            i2 = 5;
        }
        if (i == 1) {
            int i3 = i2 * 1000;
            String strBody = HttpRequest.get(OooO0OO(str)).connectTimeout(i3).readTimeout(i3).useCaches(false).body();
            return strBody == null ? "" : strBody;
        }
        if (i == 2) {
            int i4 = i2 * 1000;
            String strBody2 = new HttpRequest(str, "POST").header("User-Agent", OooOo0).followRedirects(false).connectTimeout(i4).readTimeout(i4).useCaches(false).send(str2).body();
            return strBody2 == null ? "" : strBody2;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0141 A[Catch: all -> 0x01b3, Exception -> 0x01b7, LOOP:1: B:134:0x013b->B:136:0x0141, LOOP_END, TryCatch #6 {Exception -> 0x01b7, all -> 0x01b3, blocks: (B:121:0x00e5, B:123:0x00f1, B:134:0x013b, B:136:0x0141, B:137:0x0151, B:139:0x0157, B:140:0x0170, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018f, B:149:0x0192, B:124:0x0100), top: B:189:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0157 A[Catch: all -> 0x01b3, Exception -> 0x01b7, TryCatch #6 {Exception -> 0x01b7, all -> 0x01b3, blocks: (B:121:0x00e5, B:123:0x00f1, B:134:0x013b, B:136:0x0141, B:137:0x0151, B:139:0x0157, B:140:0x0170, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018f, B:149:0x0192, B:124:0x0100), top: B:189:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x018f A[Catch: all -> 0x01b3, Exception -> 0x01b7, TryCatch #6 {Exception -> 0x01b7, all -> 0x01b3, blocks: (B:121:0x00e5, B:123:0x00f1, B:134:0x013b, B:136:0x0141, B:137:0x0151, B:139:0x0157, B:140:0x0170, B:142:0x0178, B:144:0x017e, B:146:0x0184, B:148:0x018f, B:149:0x0192, B:124:0x0100), top: B:189:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a3 A[Catch: IOException -> 0x01a7, TRY_ENTER, TryCatch #3 {IOException -> 0x01a7, blocks: (B:151:0x01a3, B:155:0x01ab, B:168:0x01db, B:170:0x01e0), top: B:188:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ab A[Catch: IOException -> 0x01a7, TRY_LEAVE, TryCatch #3 {IOException -> 0x01a7, blocks: (B:151:0x01a3, B:155:0x01ab, B:168:0x01db, B:170:0x01e0), top: B:188:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01fd A[Catch: IOException -> 0x01f9, TRY_LEAVE, TryCatch #0 {IOException -> 0x01f9, blocks: (B:176:0x01f5, B:180:0x01fd), top: B:184:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0151 A[EDGE_INSN: B:192:0x0151->B:137:0x0151 BREAK  A[LOOP:1: B:134:0x013b->B:136:0x0141], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String UrlRequestEx(int r16, java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.event.Injector.UrlRequestEx(int, java.lang.String):java.lang.String");
    }

    public static void Vibrate(int i) {
        OooO0o0.OooO0O0(i);
    }

    public static void dispatchGestureMoveAB(String str) {
        int i;
        Path path = new Path();
        int i2 = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("duration");
            try {
                if (jSONObject.get("points") instanceof JSONArray) {
                    JSONArray jSONArray = jSONObject.getJSONArray("points");
                    while (i2 < jSONArray.length()) {
                        int iIntValue = ((Integer) jSONArray.getJSONObject(i2).get("x")).intValue();
                        int iIntValue2 = ((Integer) jSONArray.getJSONObject(i2).get("y")).intValue();
                        float f = iIntValue;
                        float f2 = iIntValue2;
                        if (i2 == 0) {
                            path.moveTo(f, f2);
                        } else {
                            path.lineTo(f, f2);
                        }
                        StringBuilder sb = new StringBuilder("x:");
                        sb.append(iIntValue);
                        sb.append("y:");
                        sb.append(iIntValue2);
                        i2++;
                    }
                }
            } catch (Exception e) {
                e = e;
                i2 = i;
                new StringBuilder("dispatchGestureMove: Exception:").append(e.toString());
                e.printStackTrace();
                i = i2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        Cservice.OoooOoo.OooO0oO(path, i);
    }

    public static String getAppList() {
        return C4003ix.OooOOO;
    }

    public static void init(Context context) {
        Objects.requireNonNull(context, "Context is null...");
        OooO0OO = context.getApplicationContext();
        OooO0o0 = new C3873fe(OooO0OO);
        OooO0o = new ViewOnClickListenerC4576ye(OooO0OO);
        OooO0oo = initTessBass();
    }

    public static boolean initTessBass() {
        File file = new File(OooO0OO.getFilesDir().getAbsolutePath() + "/tessdata/", InterfaceC4047k3.o0000O0O);
        File file2 = new File(OooO0OO.getFilesDir().getAbsolutePath() + "/tessdata/", InterfaceC4047k3.o0000O0);
        boolean z = false;
        if (!file.exists() || !file2.exists()) {
            File file3 = new File(C4614zf.OooOO0O + "/tessdata/", InterfaceC4047k3.o0000O0O);
            File file4 = new File(C4614zf.OooOO0O + "/tessdata/", InterfaceC4047k3.o0000O0);
            if (!file3.exists() || !file4.exists()) {
                return false;
            }
            z = true;
        }
        OooO0oO = new TessBaseAPI();
        boolean zOooOOO = OooO0oO.OooOOO(z ? C4614zf.OooOO0O : OooO0OO.getFilesDir().getAbsolutePath(), "chi_sim+eng");
        Log.i("MqmHandler", "initTessBass: init ret=".concat(String.valueOf(zOooOOO)));
        return zOooOOO;
    }

    public static boolean isLockScreen() {
        return !((PowerManager) OooO0OO.getSystemService("power")).isScreenOn();
    }

    public static int isRunning(String str) {
        return 0;
    }

    public static void release() {
        C3873fe.OooOOo();
        OooO0o0.OooO00o();
        ViewOnClickListenerC4576ye viewOnClickListenerC4576ye = OooO0o;
        viewOnClickListenerC4576ye.OooOOO0();
        viewOnClickListenerC4576ye.OoooOoo = 0;
        viewOnClickListenerC4576ye.OooooOo = 1;
        for (int i = 0; i < 32; i++) {
            viewOnClickListenerC4576ye.OoooOoO[i] = null;
            HashMap[] mapArr = viewOnClickListenerC4576ye.OooooOO;
            if (mapArr[i] != null) {
                mapArr[i].clear();
            }
        }
        releasePointerInfoArray();
    }

    public static void releasePointerInfoArray() {
        OooOoO = null;
    }

    public static String runTimeCmd(String str, int i) {
        return "";
    }

    public static void sendText(String str, int i) {
        if (OooO) {
            sendTextAB(str);
        } else if (MqRunnerLite.getInstance().OooO0oO != null) {
            MqRunnerLite.getInstance().OooO0oO.inputText(str);
        }
    }

    public static void sendTextAB(String str) {
        if (Cservice.OooOOOO()) {
            Cservice.OoooOoo.OooOOO(str, OooO0OO);
        }
    }

    public static void setSyncReturnValue(int i, String str) {
        OooOOo0 = i;
        OooOOo = str;
        OooOOOo = true;
    }

    public static void switchToIm(String str) {
    }
}
