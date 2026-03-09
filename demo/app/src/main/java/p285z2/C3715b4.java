package p285z2;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.umeng.commonsdk.proguard.C3471v;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: z2.b4 */
/* JADX INFO: loaded from: classes.dex */
public class C3715b4 {
    public static boolean OooO(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean OooO00o(Context context) {
        try {
            Intent intent = new Intent();
            intent.setData(Uri.parse("tel:123456"));
            intent.setAction("android.intent.action.DIAL");
            return intent.resolveActivity(context.getPackageManager()) != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean OooO0O0() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3715b4.OooO0O0():boolean");
    }

    public static boolean OooO0OO() {
        String strOooOOOO = OooOOOO();
        return strOooOOOO.contains("intel") || strOooOOOO.contains("amd");
    }

    public static String OooO0Oo(Context context, String str) {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1);
        if (packageArchiveInfo != null) {
            return packageArchiveInfo.packageName;
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0064: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:42:0x0064 */
    public static synchronized boolean OooO0o() {
        Process processExec;
        DataOutputStream dataOutputStream;
        Exception e;
        DataOutputStream dataOutputStream2;
        DataOutputStream dataOutputStream3 = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec("su");
            } catch (Exception e2) {
                dataOutputStream = null;
                e = e2;
                processExec = null;
            } catch (Throwable th) {
                th = th;
                processExec = null;
            }
            try {
                dataOutputStream = new DataOutputStream(processExec.getOutputStream());
            } catch (Exception e3) {
                dataOutputStream = null;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                if (dataOutputStream3 != null) {
                    try {
                        dataOutputStream3.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        throw th;
                    }
                }
                processExec.destroy();
                throw th;
            }
            try {
                dataOutputStream.writeBytes("exit\n");
                dataOutputStream.flush();
                if (processExec.waitFor() == 0) {
                    try {
                        dataOutputStream.close();
                        processExec.destroy();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    return true;
                }
                try {
                    dataOutputStream.close();
                    processExec.destroy();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                return false;
            } catch (Exception e7) {
                e = e7;
                e.printStackTrace();
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        return false;
                    }
                }
                processExec.destroy();
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream3 = dataOutputStream2;
        }
    }

    public static String OooO0o0() {
        String line = "0.0.0.0";
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://pv.sohu.com/cityjson?ie=utf-8").openConnection();
            if (httpURLConnection.getResponseCode() != 200) {
                return "0.0.0.0";
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line + "\n");
            }
            inputStream.close();
            String strSubstring = sb.substring(sb.indexOf("{"), sb.indexOf("}") + 1);
            if (strSubstring == null) {
                return line;
            }
            try {
                return new JSONObject(strSubstring).optString("cip");
            } catch (JSONException e) {
                e.printStackTrace();
                return line;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return line;
        }
    }

    public static boolean OooO0oO() {
        if (new File("/system/bin/su").exists() && OooOO0("/system/bin/su")) {
            return true;
        }
        return new File("/system/xbin/su").exists() && OooOO0("/system/xbin/su");
    }

    public static String OooO0oo(Context context) {
        try {
            return Build.VERSION.SDK_INT < 19 ? new WebView(context).getSettings().getUserAgentString() : WebSettings.getDefaultUserAgent(context);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static boolean OooOO0(String str) {
        Process processExec = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec("ls -l " + str);
                String line = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
                if (line != null && line.length() >= 4) {
                    char cCharAt = line.charAt(3);
                    if (cCharAt == 's' || cCharAt == 'x') {
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return true;
                    }
                }
                if (processExec == null) {
                    return false;
                }
            } catch (IOException e) {
                e.printStackTrace();
                if (processExec == null) {
                    return false;
                }
            }
            processExec.destroy();
            return false;
        } catch (Throwable th) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th;
        }
    }

    public static boolean OooOO0O() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean OooOO0o(Context context) {
        return !OooO00o(context) || OooO0OO();
    }

    public static Boolean OooOOO(Context context) {
        return ((SensorManager) context.getSystemService(C3471v.f18942W)).getDefaultSensor(5) == null ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean OooOOO0() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter == null || TextUtils.isEmpty(defaultAdapter.getName());
    }

    private static String OooOOOO() {
        try {
            Process processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), "utf-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return stringBuffer.toString().toLowerCase();
                }
                stringBuffer.append(line);
            }
        } catch (IOException unused) {
            return "";
        }
    }

    public static boolean OooOOOo(String str, boolean z) {
        if (!OooOO0O()) {
            return false;
        }
        try {
            File file = new File(Environment.getExternalStorageDirectory().getPath(), "elfinParams.txt");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            fileOutputStream.write(str.getBytes("UTF-8"));
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
