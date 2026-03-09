package p285z2;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.umeng.commonsdk.proguard.C3471v;
import java.io.BufferedInputStream;

/* JADX INFO: renamed from: z2.p8 */
/* JADX INFO: loaded from: classes.dex */
public class C4237p8 {
    private OooO0O0 OooO00o;

    /* JADX INFO: renamed from: z2.p8$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(String str);
    }

    /* JADX INFO: renamed from: z2.p8$OooO0OO */
    public class OooO0OO implements SensorEventListener {
        public SensorManager OooO00o;

        public OooO0OO(SensorManager sensorManager) {
            this.OooO00o = sensorManager;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            this.OooO00o.unregisterListener(this);
            this.OooO00o = null;
        }
    }

    /* JADX INFO: renamed from: z2.p8$OooO0o */
    public static class OooO0o {
        private static final C4237p8 OooO00o = new C4237p8();

        private OooO0o() {
        }
    }

    private C4237p8() {
    }

    public static final C4237p8 OooO0OO() {
        return OooO0o.OooO00o;
    }

    private static String OooO0Oo(BufferedInputStream bufferedInputStream) {
        int i;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[512];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (i >= 512);
        return sb.toString();
    }

    private boolean OooO0o0(Context context, int i) {
        SensorManager sensorManager;
        Sensor defaultSensor;
        if (context == null || (sensorManager = (SensorManager) context.getSystemService(C3471v.f18942W)) == null || (defaultSensor = sensorManager.getDefaultSensor(i)) == null) {
            return false;
        }
        sensorManager.registerListener(new OooO0OO(sensorManager), defaultSensor, 3);
        return true;
    }

    public String OooO() {
        return OooO00o("cat /proc/cpuinfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String OooO00o(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L78
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L78
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L54
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r2.write(r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r6 = 10
            r2.write(r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r2.flush()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r2.close()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r1.waitFor()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r6 = OooO0Oo(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r0 = move-exception
            r0.printStackTrace()
        L3e:
            r3.close()     // Catch: java.io.IOException -> L42
            goto L46
        L42:
            r0 = move-exception
            r0.printStackTrace()
        L46:
            if (r1 == 0) goto L4b
            r1.destroy()
        L4b:
            return r6
        L4c:
            r6 = move-exception
            goto L52
        L4e:
            goto L7b
        L50:
            r6 = move-exception
            r3 = r0
        L52:
            r0 = r2
            goto L5e
        L54:
            r3 = r0
            goto L7b
        L56:
            r6 = move-exception
            r3 = r0
            goto L5e
        L59:
            r2 = r0
            goto L7a
        L5b:
            r6 = move-exception
            r1 = r0
            r3 = r1
        L5e:
            if (r0 == 0) goto L68
            r0.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r0.printStackTrace()
        L68:
            if (r3 == 0) goto L72
            r3.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            if (r1 == 0) goto L77
            r1.destroy()
        L77:
            throw r6
        L78:
            r1 = r0
            r2 = r1
        L7a:
            r3 = r2
        L7b:
            if (r2 == 0) goto L85
            r2.close()     // Catch: java.io.IOException -> L81
            goto L85
        L81:
            r6 = move-exception
            r6.printStackTrace()
        L85:
            if (r3 == 0) goto L8f
            r3.close()     // Catch: java.io.IOException -> L8b
            goto L8f
        L8b:
            r6 = move-exception
            r6.printStackTrace()
        L8f:
            if (r1 == 0) goto L94
            r1.destroy()
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4237p8.OooO00o(java.lang.String):java.lang.String");
    }

    public String OooO0O0(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean OooO0o(Context context) {
        return OooO0o0(context, 4);
    }

    public boolean OooO0oO(Context context) {
        return OooO0o0(context, 5);
    }

    @Deprecated
    public String OooO0oo() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("-\n");
        stringBuffer.append("BOARD-");
        stringBuffer.append(Build.BOARD);
        stringBuffer.append("\nBOOTLOADER-");
        stringBuffer.append(Build.BOOTLOADER);
        stringBuffer.append("\nBRAND-");
        stringBuffer.append(Build.BRAND);
        stringBuffer.append("\nDEVICE-");
        stringBuffer.append(Build.DEVICE);
        stringBuffer.append("\nHARDWARE-");
        stringBuffer.append(Build.HARDWARE);
        stringBuffer.append("\nMODEL-");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("\nPRODUCT-");
        stringBuffer.append(Build.PRODUCT);
        return stringBuffer.toString();
    }

    public boolean OooOO0() {
        return OooOO0O(null);
    }

    public boolean OooOO0O(OooO0O0 oooO0O0) throws Throwable {
        this.OooO00o = oooO0O0;
        String strOooO0O0 = OooO0O0("gsm.version.baseband");
        int i = TextUtils.isEmpty(strOooO0O0) | (strOooO0O0 != null && strOooO0O0.contains("1.0.0.0")) ? 1 : 0;
        String strOooO0O02 = OooO0O0("ro.build.flavor");
        if (TextUtils.isEmpty(strOooO0O02) || (strOooO0O02.contains("vbox") | strOooO0O02.contains("sdk_gphone"))) {
            i++;
        }
        String strOooO0O03 = OooO0O0("ro.product.board");
        if (TextUtils.isEmpty(strOooO0O03) || (strOooO0O03.contains(C3902g6.OooO0O0) | strOooO0O03.contains("goldfish"))) {
            i++;
        }
        String strOooO0O04 = OooO0O0("ro.board.platform");
        if (TextUtils.isEmpty(strOooO0O04) || strOooO0O04.contains(C3902g6.OooO0O0)) {
            i++;
        }
        if (!TextUtils.isEmpty(strOooO0O03) && !TextUtils.isEmpty(strOooO0O04) && !strOooO0O03.equals(strOooO0O04)) {
            i++;
        }
        String strOooO00o = OooO00o("cat /proc/self/cgroup");
        if (TextUtils.isEmpty(strOooO00o)) {
            i++;
        }
        if (this.OooO00o != null) {
            StringBuffer stringBuffer = new StringBuffer("ceshi start|");
            stringBuffer.append(strOooO0O0);
            stringBuffer.append(C1801a.f11059bQ);
            stringBuffer.append(strOooO0O02);
            stringBuffer.append(C1801a.f11059bQ);
            stringBuffer.append(strOooO0O03);
            stringBuffer.append(C1801a.f11059bQ);
            stringBuffer.append(strOooO0O04);
            stringBuffer.append(C1801a.f11059bQ);
            stringBuffer.append(strOooO00o);
            stringBuffer.append("|end");
            this.OooO00o.OooO00o(stringBuffer.toString());
            this.OooO00o = null;
        }
        return i > 2;
    }

    public boolean OooOO0o() throws Throwable {
        String strOooO00o = OooO00o("cat /proc/self/cgroup");
        return strOooO00o == null || strOooO00o.length() == 0;
    }
}
