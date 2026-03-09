package com.goldcoast.sdk.domain;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.FrameMetricsAggregator;
import androidx.multidex.MultiDexExtractor;
import com.goldcoast.sdk.p204a.C2727b;
import com.goldcoast.sdk.p204a.C2729d;
import com.goldcoast.sdk.p204a.C2731f;
import com.goldcoast.sdk.p204a.C2732g;
import com.goldcoast.sdk.p205b.C2733a;
import com.goldcoast.sdk.p205b.C2734b;
import com.goldcoast.sdk.p206c.C2735a;
import com.goldcoast.sdk.p206c.C2737c;
import com.goldcoast.sdk.p206c.C2738d;
import com.goldcoast.sdk.p206c.C2739e;
import com.goldcoast.sdk.p206c.C2741g;
import com.goldcoast.sdk.p206c.C2742h;
import com.king.sdk.C3036i;
import com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1;
import com.king.sdk.KingListener;
import com.p188b.p189a.C2532ai;
import com.p188b.p189a.C2539ap;
import com.p188b.p189a.C2570x;
import com.p188b.p189a.C2571y;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.C4003ix;

/* JADX INFO: loaded from: classes2.dex */
public class EntryPoint {
    public static final byte RS_LONG = 1;
    public static final byte RS_MIXED = 2;
    public static final byte RS_TEMP = 0;
    public static final byte S_120 = 3;
    public static final byte S_123 = 2;
    public static final byte S_43 = 1;
    public static final byte S_47 = 4;

    /* JADX INFO: renamed from: a */
    private static EntryPoint f16020a = null;

    /* JADX INFO: renamed from: b */
    private static byte f16021b = 1;

    /* JADX INFO: renamed from: c */
    private static String f16022c;

    /* JADX INFO: renamed from: d */
    private static String f16023d;

    /* JADX INFO: renamed from: e */
    private static String f16024e;
    public static File extractDir;

    /* JADX INFO: renamed from: f */
    private static String f16025f;

    /* JADX INFO: renamed from: h */
    private static AnalyseResult f16027h;

    /* JADX INFO: renamed from: i */
    private static String f16028i;

    /* JADX INFO: renamed from: m */
    private static boolean f16032m;
    public static Application mContext;

    /* JADX INFO: renamed from: n */
    private static final boolean f16033n;

    /* JADX INFO: renamed from: A */
    private C2729d f16034A;

    /* JADX INFO: renamed from: B */
    private C2729d f16035B;

    /* JADX INFO: renamed from: F */
    private Pair<String, String> f16039F;

    /* JADX INFO: renamed from: r */
    private int f16043r;

    /* JADX INFO: renamed from: s */
    private int f16044s;

    /* JADX INFO: renamed from: t */
    private int f16045t;

    /* JADX INFO: renamed from: u */
    private int f16046u;

    /* JADX INFO: renamed from: v */
    private ConnectivityManager f16047v;

    /* JADX INFO: renamed from: w */
    private JNIWrapper f16048w;

    /* JADX INFO: renamed from: x */
    private String f16049x;

    /* JADX INFO: renamed from: z */
    private C2737c f16051z;

    /* JADX INFO: renamed from: g */
    private static C2532ai f16026g = new C2532ai();

    /* JADX INFO: renamed from: j */
    private static int f16029j = 60;

    /* JADX INFO: renamed from: k */
    private static int f16030k = -1;

    /* JADX INFO: renamed from: l */
    private static byte f16031l = 0;

    /* JADX INFO: renamed from: o */
    private final String[] f16040o = {"天", "干", "地", "支", "山"};

    /* JADX INFO: renamed from: p */
    private final KingListener f16041p = new BinderC2744a(this);

    /* JADX INFO: renamed from: q */
    private boolean f16042q = false;

    /* JADX INFO: renamed from: y */
    private boolean f16050y = false;

    /* JADX INFO: renamed from: C */
    private boolean f16036C = false;

    /* JADX INFO: renamed from: D */
    private boolean f16037D = false;

    /* JADX INFO: renamed from: E */
    private BroadcastReceiver f16038E = new C2746c(this);

    static {
        f16032m = true;
        f16033n = Build.VERSION.SDK_INT >= 14;
        try {
            System.loadLibrary("goldcoast");
        } catch (Exception e) {
            f16032m = false;
            e.printStackTrace();
        }
    }

    private EntryPoint() {
        C2742h.m13179a();
        C2742h.m13182a("client", f16028i);
        if (f16032m) {
            this.f16048w = new JNIWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mContext.getFilesDir().getAbsoluteFile());
        String str = File.separator;
        sb.append(str);
        sb.append("ota");
        sb.append(str);
        sb.append("elf");
        extractDir = new File(sb.toString());
        try {
            mContext.unregisterReceiver(this.f16038E);
        } catch (Exception unused) {
        }
        this.f16047v = (ConnectivityManager) mContext.getSystemService("connectivity");
        mContext.registerReceiver(this.f16038E, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        C2741g.m13176a(mContext);
        this.f16051z = C2737c.m13157a(mContext);
        initHost("http://www.newbyvideo.com:10001");
        C2734b.m13150a(f16022c);
    }

    /* JADX INFO: renamed from: a */
    private int m13185a(C2729d c2729d) {
        m13207b(String.format("key:%s\norder:%d name: %s", c2729d.m13125e(), Integer.valueOf(c2729d.m13124d()), c2729d.m13119a()), 2);
        try {
            JNIWrapper jNIWrapper = this.f16048w;
            if (jNIWrapper == null) {
                return -1;
            }
            return jNIWrapper.loadSO(String.format("%s/ota/elf/%s", mContext.getFilesDir(), c2729d.m13119a()));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m13188a(InputStream inputStream, String str) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        zipInputStream.available();
        String name = "";
        String name2 = "";
        int i = 0;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            if (!name.startsWith("META-INF") && !nextEntry.isDirectory()) {
                if (nextEntry.getName().startsWith("_")) {
                    name2 = nextEntry.getName();
                }
                i++;
                name = nextEntry.getName();
                File file = new File(str, name);
                file.delete();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                m13195a(zipInputStream, fileOutputStream);
                fileOutputStream.close();
                C2739e.m13168a(file);
            }
        }
        zipInputStream.close();
        return i > 1 ? name2 : name;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m13189a(String str, int i) {
        if (i != 2 && i != 3) {
            return extractDir.getAbsolutePath() + File.separator + str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(extractDir.getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        String string = sb.toString();
        String str3 = extractDir.getParent() + str2 + ".romaster_root";
        File file = new File(string);
        C2739e.m13171a(file, new File(str3));
        C2739e.m13169a(str3, 493);
        file.delete();
        return extractDir.getParent() + str2 + "shua .romaster_root";
    }

    /* JADX INFO: renamed from: a */
    private static String m13190a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(String.valueOf(hexString));
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13191a(int i) {
        try {
            C2742h.m13179a();
            String strM13180a = C2742h.m13180a("refer");
            if (TextUtils.isEmpty(strM13180a)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(strM13180a);
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (i2 != i) {
                    jSONArray2.put(jSONArray.get(i2).toString());
                }
            }
            C2742h.m13179a();
            C2742h.m13182a("refer", jSONArray2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0127 A[PHI: r13
  0x0127: PHI (r13v5 java.lang.String) = (r13v2 java.lang.String), (r13v7 java.lang.String) binds: [B:39:0x0125, B:32:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0191  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m13192a(com.goldcoast.sdk.domain.EntryPoint r19, java.lang.String r20) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.goldcoast.sdk.domain.EntryPoint.m13192a(com.goldcoast.sdk.domain.EntryPoint, java.lang.String):void");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13194a(EntryPoint entryPoint, String str, List list) throws JSONException, IOException {
        String strOptString = new JSONObject(str).optString("body", "");
        if (TextUtils.isEmpty(strOptString)) {
            entryPoint.m13207b("response body is null", 2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("######\n");
        char c = 0;
        sb.append(String.format("<analyseP.Enc>:%s\n", str));
        C2741g.m13175a();
        C2741g.m13178b(sb.toString());
        JSONObject jSONObject = new JSONObject(C2735a.m13152b(strOptString));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("bra");
        entryPoint.f16045t = jSONArrayOptJSONArray.length();
        String strOptString2 = jSONObject.optString("global", "");
        int iOptInt = jSONObject.optInt("category", 0);
        String strOptString3 = jSONObject.optString("token", "");
        if (!TextUtils.isEmpty(strOptString3)) {
            C2742h.m13179a();
            C2742h.m13182a("client", strOptString3);
        }
        entryPoint.m13210c(strOptString2);
        String strOptString4 = jSONObject.optString("poc", "");
        new ArrayList();
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            if (entryPoint.f16043r == 4) {
                entryPoint.m13207b("not found suitable su file\n$$$ failed", 1);
                return;
            } else {
                entryPoint.m13207b("not found suitable su file ", 2);
                return;
            }
        }
        int i = 0;
        while (i < jSONArrayOptJSONArray.length() && !entryPoint.f16036C) {
            entryPoint.f16046u = i;
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
            String strOptString5 = jSONObject2.optString("file");
            entryPoint.f16049x = jSONObject2.optString("params");
            int iOptInt2 = jSONObject2.optInt("category");
            int iOptInt3 = jSONObject2.optInt("order");
            String strOptString6 = jSONObject2.optString("file_hex", "");
            String strOptString7 = jSONObject2.optString("component", "");
            String str2 = strOptString5.split("\\?")[c];
            C2741g.m13175a();
            C2741g.m13177a("parseResponse_m->braUrl=".concat(String.valueOf(str2)));
            C2729d c2729d = new C2729d(strOptString5.substring(str2.lastIndexOf("/") + 1, str2.length()), iOptInt2, strOptString4, iOptInt3, strOptString6, strOptString5);
            if (entryPoint.f16042q) {
                return;
            }
            if ((iOptInt == 0 && !TextUtils.isEmpty(strOptString7) && !strOptString7.equals("null") && !strOptString7.equals(C4003ix.OooOOO)) || (i == 0 && !strOptString7.equals("null") && !strOptString7.equals(C4003ix.OooOOO))) {
                m13206b(strOptString7);
            }
            list.add(c2729d);
            i++;
            c = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m13195a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13196a(String str) {
        try {
            C2742h.m13179a();
            String strM13180a = C2742h.m13180a("refer");
            JSONArray jSONArray = TextUtils.isEmpty(strM13180a) ? new JSONArray() : new JSONArray(strM13180a);
            jSONArray.put(str);
            C2742h.m13179a();
            C2742h.m13182a("refer", jSONArray.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m13197a(String str, int i, int i2) {
        C2570x c2570xM12969a = new C2571y().m12970a("body", str).m12969a();
        StringBuilder sb = new StringBuilder();
        sb.append(i2 == 2 ? "######rePost\n" : "######\n");
        sb.append(String.format("<feedbackQ.Enc>:%s\n", c2570xM12969a.toString()));
        C2741g.m13175a();
        C2741g.m13178b(sb.toString());
        ConditionVariable conditionVariable = new ConditionVariable(false);
        conditionVariable.close();
        f16026g.m12838a(new C2539ap().m12876a(f16024e).m12875a(c2570xM12969a).m12872a()).mo12860a(new C2751h(this, i2, str, conditionVariable, i));
        conditionVariable.block();
    }

    @TargetApi(3)
    /* JADX INFO: renamed from: a */
    private void m13198a(String str, int i, String str2, int i2) {
        File file = new File(extractDir.getAbsolutePath(), str);
        C2732g c2732g = new C2732g();
        C2731f c2731f = new C2731f(C2731f.m13130a());
        C2738d.m13163a(mContext);
        c2731f.m13131a(C2738d.m13162a().m13112b().m13128b());
        c2732g.m13136a(c2731f);
        c2732g.m13137a(str);
        c2732g.m13134a(i);
        c2732g.m13139b(str2);
        c2732g.m13135a(System.currentTimeMillis());
        C2738d.m13163a(mContext);
        c2732g.m13140c(C2738d.m13164b());
        try {
            TelephonyManager telephonyManager = (TelephonyManager) mContext.getSystemService("phone");
            c2732g.m13141d(telephonyManager.getNetworkOperatorName());
            c2732g.m13142e(telephonyManager.getSimOperatorName());
        } catch (Exception unused) {
        }
        c2732g.m13143f(Locale.getDefault().getDisplayLanguage());
        c2732g.m13144g(Locale.getDefault().getDisplayCountry());
        C2742h.m13179a();
        c2732g.m13145h(C2742h.m13180a("client"));
        c2732g.m13147j(mContext.getPackageName());
        c2732g.m13148k(getCertificateFingerprintMD5());
        c2732g.m13138b(i2);
        c2732g.m13146i("4.0.14");
        file.delete();
        try {
            m13197a(C2735a.m13151a(c2732g.m13133a().toString()), -1, 1);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m13199a(AnalyseResult analyseResult) {
        boolean z;
        String str;
        NetworkInfo[] allNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
            z = false;
        } else {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z) {
            C2742h.m13179a();
            if (TextUtils.isEmpty(C2742h.m13180a("client")) || mContext == null) {
                str = "start failed: 请在Application中调用 EntryPoint.init([context],[token])";
            } else {
                if (analyseResult != null) {
                    return true;
                }
                str = "start failed: 请初始化analyseResult参数";
            }
        } else {
            str = "start failed: 当前网络连接异常，请检测网络连接是否可用.";
        }
        m13207b(str, 1);
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m13201a(File file) {
        try {
            LocalSocket localSocket = new LocalSocket();
            localSocket.connect(new LocalSocketAddress("darwin.rodo", LocalSocketAddress.Namespace.ABSTRACT));
            byte[] bytes = file.getAbsolutePath().getBytes();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 4);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            byteBufferAllocate.putInt(bytes.length);
            byteBufferAllocate.put(bytes);
            localSocket.getOutputStream().write(byteBufferAllocate.array());
            byte[] bytes2 = String.valueOf(Process.myPid()).getBytes();
            Log.d("KingDaemon", "client pid=" + Process.myPid());
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bytes2.length + 4);
            byteBufferAllocate2.order(byteOrder);
            byteBufferAllocate2.putInt(bytes2.length);
            byteBufferAllocate2.put(bytes2);
            localSocket.getOutputStream().write(byteBufferAllocate2.array());
            localSocket.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @TargetApi(5)
    /* JADX INFO: renamed from: b */
    private Pair<String, String> m13202b(C2729d c2729d) {
        if (f16030k == 0) {
            return new Pair<>("yes", "$$$ success");
        }
        ConditionVariable conditionVariable = new ConditionVariable(false);
        conditionVariable.close();
        C2737c c2737c = this.f16051z;
        String strM13119a = c2729d.m13119a();
        if (!c2737c.m13161c(strM13119a)) {
            String strM13158a = c2737c.m13158a();
            JSONArray jSONArray = null;
            if (TextUtils.isEmpty(strM13158a)) {
                jSONArray = new JSONArray();
            } else {
                try {
                    jSONArray = new JSONArray(strM13158a);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            try {
                jSONArray.put(strM13119a);
                c2737c.m13159a(jSONArray.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        new Thread(new RunnableC2753j(this, c2729d)).start();
        new Thread(new RunnableC2745b(this, conditionVariable)).start();
        conditionVariable.block();
        this.f16051z.m13160b(c2729d.m13119a());
        if (this.f16039F == null) {
            this.f16039F = new Pair<>("no", "not return any result");
        }
        return this.f16039F;
    }

    /* JADX INFO: renamed from: b */
    private void m13203b() {
        File file = new File(extractDir.getParent());
        if (file.listFiles() != null) {
            try {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            } catch (Exception unused) {
            }
        }
        extractDir.mkdirs();
        this.f16050y = false;
    }

    /* JADX INFO: renamed from: b */
    private static void m13206b(String str) throws IOException {
        String str2 = str.split("\\?")[0];
        String strSubstring = str2.substring(str2.lastIndexOf("/") + 1, str2.length());
        C2733a.m13149a(str, mContext, str2);
        String str3 = extractDir.getAbsolutePath() + File.separator + strSubstring;
        m13188a(new FileInputStream(str3), extractDir.getAbsolutePath());
        new File(str3).delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m13207b(String str, int i) {
        f16030k = i;
        if (i == 0) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C2729d c2729d = this.f16035B;
            if (c2729d == null || !c2729d.m13119a().equals(this.f16034A.m13119a())) {
                this.f16035B = this.f16034A;
                this.f16051z.m13159a("");
                C2729d c2729d2 = this.f16034A;
                if (c2729d2 != null) {
                    m13198a(c2729d2.m13119a(), 1, str, this.f16034A.m13123c());
                }
                for (int i2 = 0; i2 < 30; i2++) {
                    try {
                        if (getStatus()) {
                            break;
                        }
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                f16027h.onSuccess(str);
                return;
            }
            return;
        }
        if (i == 1) {
            f16027h.onFailed(str);
            braFlush();
            C2729d c2729d3 = this.f16034A;
            if (c2729d3 != null) {
                m13198a(c2729d3.m13119a(), -1, str, this.f16034A.m13123c());
                return;
            }
            return;
        }
        if (i == 2) {
            f16027h.onProgress(str);
            return;
        }
        if (this.f16043r != 4 || this.f16045t - 1 != this.f16046u) {
            f16027h.onException(str);
            return;
        }
        f16027h.onFailed(str);
        braFlush();
        C2729d c2729d4 = this.f16034A;
        if (c2729d4 != null) {
            m13198a(c2729d4.m13119a(), -1, str, this.f16034A.m13123c());
        }
    }

    /* JADX INFO: renamed from: c */
    private void m13208c() {
        File file = new File(mContext.getFilesDir().getAbsolutePath() + File.separator + "dump");
        if (file.exists()) {
            file.delete();
        }
        this.f16042q = false;
        this.f16044s = 0;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13209c(EntryPoint entryPoint) {
        if (TextUtils.isEmpty(entryPoint.f16051z.m13158a())) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rf_md5", entryPoint.f16051z.m13158a());
            C2738d.m13163a(mContext);
            jSONObject.put("android_id", C2738d.m13164b());
            C2742h.m13179a();
            jSONObject.put("token", C2742h.m13180a("client"));
            jSONObject.put("package_name", mContext.getPackageName());
            jSONObject.put("signature", entryPoint.getCertificateFingerprintMD5());
            f16026g.m12838a(new C2539ap().m12876a(f16025f).m12875a(new C2571y().m12970a("body", C2735a.m13151a(jSONObject.toString())).m12969a()).m12872a()).mo12859a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m13210c(String str) throws IOException {
        if (this.f16050y) {
            return;
        }
        String str2 = str.split("\\?")[0];
        String strSubstring = str2.substring(str2.lastIndexOf("/") + 1, str2.length());
        StringBuilder sb = new StringBuilder();
        sb.append(extractDir.getAbsolutePath());
        String str3 = File.separator;
        sb.append(str3);
        sb.append(strSubstring);
        String string = sb.toString();
        C2733a.m13149a(str, mContext, strSubstring);
        m13188a(new FileInputStream(string), extractDir.getParent());
        new File(string).delete();
        String str4 = String.format("%s%slibsu.so", extractDir.getParent(), str3);
        File file = new File(mContext.getFilesDir().getAbsolutePath() + str3 + "permmgr" + str3 + "libsu.so");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str4);
        C2739e.m13171a(file2, file);
        C2739e.m13168a(file);
        file2.delete();
        this.f16050y = true;
    }

    /* JADX INFO: renamed from: d */
    private JSONObject m13212d() throws JSONException {
        C2738d.m13163a(mContext);
        C2727b c2727bM13162a = C2738d.m13162a();
        JSONObject jSONObject = new JSONObject();
        C2731f c2731f = new C2731f(C2731f.m13130a());
        C2738d.m13163a(mContext);
        c2731f.m13131a(C2738d.m13165c().m13128b());
        c2727bM13162a.m13110a(c2731f);
        jSONObject.put("device", c2727bM13162a.m13107a());
        jSONObject.put("self", mContext.getPackageName());
        C2742h.m13179a();
        jSONObject.put("token", C2742h.m13180a("client"));
        jSONObject.put("package_name", mContext.getPackageName());
        jSONObject.put("signature", getCertificateFingerprintMD5());
        jSONObject.put("keyword", "");
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    private void m13214e() {
        m13207b("$$$ success", 0);
        this.f16042q = true;
        braFlush();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m13215f(EntryPoint entryPoint) {
        int i = entryPoint.f16044s;
        entryPoint.f16044s = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m13216f() {
        new Thread(new RunnableC2752i(this)).start();
    }

    /* JADX INFO: renamed from: g */
    private static boolean m13218g() {
        try {
            LocalSocket localSocket = new LocalSocket();
            localSocket.connect(new LocalSocketAddress("darwin.rodo", LocalSocketAddress.Namespace.ABSTRACT));
            localSocket.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m13219h(EntryPoint entryPoint) {
        entryPoint.f16036C = false;
        return false;
    }

    public static void init(Application application, String str, AnalyseResult analyseResult, int i, byte b) {
        mContext = application;
        f16027h = analyseResult;
        C2742h.m13181a(application);
        f16028i = str;
        f16021b = b;
        if (i >= 120) {
            f16029j = i;
        }
    }

    public static EntryPoint instance() {
        if (f16020a == null) {
            f16020a = new EntryPoint();
        }
        return f16020a;
    }

    public synchronized void analyse(AnalyseResult analyseResult) {
        f16030k = -1;
        f16027h = analyseResult;
        if (m13199a(analyseResult)) {
            if (getStatus()) {
                m13214e();
                return;
            }
            if (f16030k == 0) {
                m13214e();
                return;
            }
            if (this.f16036C) {
                m13207b("busying now\n$$$ failed", 1);
                return;
            }
            m13203b();
            m13208c();
            m13216f();
            JSONObject jSONObjectM13212d = m13212d();
            for (int i = 0; i < this.f16040o.length; i++) {
                if (i != 3) {
                    this.f16043r = i;
                    if (this.f16042q) {
                        return;
                    }
                    braFlush();
                    if (this.f16036C) {
                        break;
                    }
                    new Thread(new RunnableC2747d(this)).start();
                    if (f16030k != 0) {
                        ConditionVariable conditionVariable = new ConditionVariable(false);
                        m13207b(String.format("正在云端  [%s]  字组查找方案 请等待...", this.f16040o[i]), 2);
                        jSONObjectM13212d.put("category", i);
                        jSONObjectM13212d.put("sdkV", "4.0.14");
                        jSONObjectM13212d.put("rtp", (int) f16021b);
                        C2570x c2570xM12969a = new C2571y().m12970a("body", C2735a.m13151a(jSONObjectM13212d.toString())).m12969a();
                        C2741g.m13175a();
                        C2741g.m13178b("######\n" + String.format("<analyseQ.Enc>:%s\n", c2570xM12969a.toString()));
                        conditionVariable.close();
                        f16026g.m12838a(new C2539ap().m12876a(f16023d).m12875a(c2570xM12969a).m12872a()).mo12860a(new C2748e(this, conditionVariable, new boolean[]{false}));
                        conditionVariable.block();
                    }
                }
            }
        }
    }

    public void braFlush() {
        File file = extractDir;
        if (file == null || file.listFiles() == null) {
            return;
        }
        try {
            for (File file2 : extractDir.listFiles()) {
                file2.delete();
            }
        } catch (Exception unused) {
        }
    }

    public void cleanSkipFlag() {
        this.f16051z.m13159a("");
    }

    public boolean exec(String[] strArr) {
        String str;
        if (getStatus()) {
            byte b = f16031l;
            if (b == 0) {
                execDarwin(strArr);
            } else if (b == 1) {
                try {
                    C3036i c3036iM13774a = C3036i.m13774a(mContext);
                    int iMyPid = Process.myPid();
                    String packageName = mContext.getPackageName();
                    C2742h.m13179a();
                    c3036iM13774a.m13777a(strArr, iMyPid, packageName, C2742h.m13180a("client"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                str = "Service has been stoped";
            }
            return true;
        }
        str = "getStatus failed, Service not start";
        Log.d("EntryPoint", str);
        return false;
    }

    public void execDarwin(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        File file = new File(mContext.getFilesDir(), "tmp.sh");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        C2739e.m13170a(strArr, file);
        C2739e.m13169a(file.getAbsolutePath(), FrameMetricsAggregator.EVERY_DURATION);
        m13201a(file);
    }

    public void getBra(C2729d c2729d) throws IOException {
        C2733a.m13149a(c2729d.m13126f(), mContext, c2729d.m13119a());
        if (TextUtils.isEmpty(c2729d.m13121b())) {
            m13207b("poc is null", 2);
        } else if (c2729d.m13119a().endsWith(MultiDexExtractor.EXTRACTED_SUFFIX)) {
            String str = extractDir.getAbsolutePath() + File.separator + c2729d.m13119a();
            c2729d.m13120a(m13188a(new FileInputStream(str), extractDir.getAbsolutePath()));
            new File(str).delete();
        }
        this.f16034A = c2729d;
        if (this.f16051z.m13161c(c2729d.m13119a())) {
            m13207b("$$$ skip", 2);
            return;
        }
        if (this.f16043r != 4) {
            m13202b(c2729d);
        } else if (m13185a(c2729d) == 3000) {
            m13214e();
        } else {
            m13207b("$$$ failed", 1);
            braFlush();
        }
    }

    public String getCertificateFingerprintMD5() {
        PackageInfo packageInfo;
        CertificateFactory certificateFactory;
        X509Certificate x509Certificate;
        try {
            packageInfo = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
        try {
            certificateFactory = CertificateFactory.getInstance("X509");
        } catch (CertificateException e2) {
            e2.printStackTrace();
            certificateFactory = null;
        }
        try {
            x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
        } catch (CertificateException e3) {
            e3.printStackTrace();
            x509Certificate = null;
        }
        try {
            return m13190a(MessageDigest.getInstance("MD5").digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            return null;
        } catch (CertificateEncodingException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public String getStackString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    public boolean getStatus() {
        boolean zM13218g = m13218g();
        f16031l = (byte) 0;
        return zM13218g;
    }

    public boolean hasSkip() {
        return !TextUtils.isEmpty(this.f16051z.m13158a());
    }

    public void initHost(String str) {
        f16022c = str;
        f16023d = String.format("%s/api/v1/phones", str);
        f16024e = String.format("%s/api/v1/phones/referer", f16022c);
        f16025f = String.format("%s/api/v1/where_is_the_way", f16022c);
    }

    public synchronized List<C2729d> manual(int i, AnalyseResult analyseResult) {
        if (!f16032m) {
            return null;
        }
        f16030k = -1;
        f16027h = null;
        f16027h = analyseResult;
        if (!m13199a(analyseResult)) {
            return null;
        }
        if (f16030k == 0) {
            m13214e();
            return null;
        }
        if (this.f16036C) {
            m13207b("busying now\n$$$ failed", 1);
            return null;
        }
        m13203b();
        m13208c();
        m13216f();
        this.f16043r = i;
        JSONObject jSONObjectM13212d = m13212d();
        new Thread(new RunnableC2749f(this)).start();
        ConditionVariable conditionVariable = new ConditionVariable(false);
        m13207b(String.format("正在云端  [%s]  字组查找方案 请等待...", this.f16040o[i]), 2);
        jSONObjectM13212d.put("category", i);
        jSONObjectM13212d.put("sdkV", "4.0.14");
        jSONObjectM13212d.put("rtp", (int) f16021b);
        C2570x c2570xM12969a = new C2571y().m12970a("body", C2735a.m13151a(jSONObjectM13212d.toString())).m12969a();
        C2741g.m13175a();
        C2741g.m13178b("######\n" + String.format("<analyseQ.Enc>:%s\n", c2570xM12969a.toString()));
        conditionVariable.close();
        ArrayList arrayList = new ArrayList();
        f16026g.m12838a(new C2539ap().m12876a(f16023d).m12875a(c2570xM12969a).m12872a()).mo12860a(new C2750g(this, arrayList, conditionVariable));
        conditionVariable.block();
        return arrayList;
    }

    public boolean registerStatus(boolean z, KingListener kingListener) {
        if (!getStatus()) {
            return false;
        }
        if (kingListener == null) {
            kingListener = this.f16041p;
        }
        try {
            if (z) {
                C3036i.m13774a(mContext).m13775a((IDFEE16B42C8B2890D8FF2860AF5562B1) kingListener);
                return true;
            }
            C3036i.m13774a(mContext).m13776a(kingListener);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean sendData(String str, int i, byte[] bArr) {
        try {
            return C3036i.m13774a(mContext).m13778a(str, i, bArr);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean sendmsg(String str, String str2) {
        try {
            return C3036i.m13774a(mContext).m13779a(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
