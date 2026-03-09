package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.commonsdk.proguard.C3412ad;
import com.umeng.commonsdk.proguard.C3418aj;
import com.umeng.commonsdk.statistics.C3483b;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.InterfaceC3517d;
import com.umeng.commonsdk.statistics.proto.C3527d;
import com.umeng.commonsdk.statistics.proto.C3528e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3498g {

    /* JADX INFO: renamed from: a */
    private static final String f19228a = "ImprintHandler";

    /* JADX INFO: renamed from: c */
    private static final String f19230c = ".imprint";

    /* JADX INFO: renamed from: i */
    private static Context f19233i;

    /* JADX INFO: renamed from: e */
    private InterfaceC3517d f19234e;

    /* JADX INFO: renamed from: f */
    private a f19235f = new a();

    /* JADX INFO: renamed from: g */
    private C3527d f19236g = null;

    /* JADX INFO: renamed from: b */
    private static Object f19229b = new Object();

    /* JADX INFO: renamed from: d */
    private static final byte[] f19231d = "pbl0".getBytes();

    /* JADX INFO: renamed from: h */
    private static C3498g f19232h = null;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private Map<String, String> f19237a = new HashMap();

        public a() {
        }

        public a(C3527d c3527d) {
            m16409a(c3527d);
        }

        /* JADX INFO: renamed from: b */
        private synchronized void m16407b(C3527d c3527d) {
            C3528e c3528e;
            if (c3527d != null) {
                try {
                    if (c3527d.m16573e()) {
                        Map<String, C3528e> mapM16570c = c3527d.m16570c();
                        for (String str : mapM16570c.keySet()) {
                            if (!TextUtils.isEmpty(str) && (c3528e = mapM16570c.get(str)) != null) {
                                String strM16602b = c3528e.m16602b();
                                if (!TextUtils.isEmpty(strM16602b)) {
                                    this.f19237a.put(str, strM16602b);
                                    if (C3483b.f19146f) {
                                        Log.i(C3498g.f19228a, "imKey is " + str + ", imValue is " + strM16602b);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public synchronized String m16408a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.f19237a.size() > 0) {
                String str3 = this.f19237a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }

        /* JADX INFO: renamed from: a */
        public void m16409a(C3527d c3527d) {
            if (c3527d == null) {
                return;
            }
            m16407b(c3527d);
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m16410a(String str) {
            Map<String, String> map = this.f19237a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.f19237a.containsKey(str)) {
                this.f19237a.remove(str);
            }
        }
    }

    private C3498g(Context context) {
        f19233i = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C3498g m16393a(Context context) {
        if (f19232h == null) {
            C3498g c3498g = new C3498g(context);
            f19232h = c3498g;
            c3498g.m16398e();
        }
        return f19232h;
    }

    /* JADX INFO: renamed from: a */
    private C3527d m16394a(C3527d c3527d, C3527d c3527d2) {
        if (c3527d2 == null) {
            return c3527d;
        }
        Map<String, C3528e> mapM16570c = c3527d.m16570c();
        for (Map.Entry<String, C3528e> entry : c3527d2.m16570c().entrySet()) {
            if (entry.getValue().m16606d()) {
                mapM16570c.put(entry.getKey(), entry.getValue());
            } else {
                String key = entry.getKey();
                mapM16570c.remove(key);
                this.f19235f.m16410a(key);
            }
        }
        c3527d.m16562a(c3527d2.m16574f());
        c3527d.m16563a(m16400a(c3527d));
        return c3527d;
    }

    /* JADX INFO: renamed from: a */
    private boolean m16395a(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* JADX INFO: renamed from: c */
    private boolean m16396c(C3527d c3527d) {
        if (!c3527d.m16577i().equals(m16400a(c3527d))) {
            return false;
        }
        for (C3528e c3528e : c3527d.m16570c().values()) {
            byte[] bArrReverseHexString = DataHelper.reverseHexString(c3528e.m16610h());
            byte[] bArrM16402a = m16402a(c3528e);
            for (int i = 0; i < 4; i++) {
                if (bArrReverseHexString[i] != bArrM16402a[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private C3527d m16397d(C3527d c3527d) {
        Map<String, C3528e> mapM16570c = c3527d.m16570c();
        ArrayList arrayList = new ArrayList(mapM16570c.size() / 2);
        for (Map.Entry<String, C3528e> entry : mapM16570c.entrySet()) {
            if (!entry.getValue().m16606d()) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mapM16570c.remove((String) it.next());
        }
        return c3527d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.InputStream] */
    /* JADX INFO: renamed from: e */
    private void m16398e() {
        Throwable th;
        FileInputStream fileInputStreamOpenFileInput;
        File filesDir = f19233i.getFilesDir();
        ?? r2 = f19230c;
        File file = new File(filesDir, f19230c);
        synchronized (f19229b) {
            if (file.exists()) {
                byte[] streamToByteArray = null;
                try {
                    try {
                        fileInputStreamOpenFileInput = f19233i.openFileInput(f19230c);
                    } catch (Exception e) {
                        e = e;
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th2) {
                        r2 = 0;
                        th = th2;
                        HelperUtils.safeClose((InputStream) r2);
                        throw th;
                    }
                    try {
                        streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStreamOpenFileInput);
                        r2 = fileInputStreamOpenFileInput;
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        r2 = fileInputStreamOpenFileInput;
                    }
                    HelperUtils.safeClose((InputStream) r2);
                    if (streamToByteArray != null) {
                        try {
                            C3527d c3527d = new C3527d();
                            new C3412ad().m15727a(c3527d, streamToByteArray);
                            this.f19236g = c3527d;
                            this.f19235f.m16409a(c3527d);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    HelperUtils.safeClose((InputStream) r2);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized C3527d m16399a() {
        return this.f19236g;
    }

    /* JADX INFO: renamed from: a */
    public String m16400a(C3527d c3527d) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(c3527d.m16570c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((C3528e) entry.getValue()).m16606d()) {
                sb.append(((C3528e) entry.getValue()).m16602b());
            }
            sb.append(((C3528e) entry.getValue()).m16607e());
            sb.append(((C3528e) entry.getValue()).m16610h());
        }
        sb.append(c3527d.f19361b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: a */
    public void m16401a(InterfaceC3517d interfaceC3517d) {
        this.f19234e = interfaceC3517d;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m16402a(C3528e c3528e) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(null);
        byteBufferAllocate.putLong(c3528e.m16607e());
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = f19231d;
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr2[i] = (byte) (bArrArray[i] ^ bArr[i]);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public a m16403b() {
        return this.f19235f;
    }

    /* JADX INFO: renamed from: b */
    public void m16404b(C3527d c3527d) {
        boolean z;
        if (c3527d == null) {
            if (C3483b.f19146f) {
                MLog.m16263d("Imprint is null");
                return;
            }
            return;
        }
        if (!m16396c(c3527d)) {
            if (C3483b.f19146f) {
                MLog.m16269e("Imprint is not valid");
                return;
            }
            return;
        }
        if (C3483b.f19146f) {
            MLog.m16263d("Imprint is ok");
        }
        synchronized (this) {
            C3527d c3527d2 = this.f19236g;
            String strM16577i = null;
            String strM16577i2 = c3527d2 == null ? null : c3527d2.m16577i();
            C3527d c3527dM16397d = c3527d2 == null ? m16397d(c3527d) : m16394a(c3527d2, c3527d);
            this.f19236g = c3527dM16397d;
            if (c3527dM16397d != null) {
                strM16577i = c3527dM16397d.m16577i();
            }
            z = !m16395a(strM16577i2, strM16577i);
        }
        C3527d c3527d3 = this.f19236g;
        if (c3527d3 == null || !z) {
            return;
        }
        this.f19235f.m16409a(c3527d3);
        InterfaceC3517d interfaceC3517d = this.f19234e;
        if (interfaceC3517d != null) {
            interfaceC3517d.onImprintChanged(this.f19235f);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m16405c() {
        if (this.f19236g == null) {
            return;
        }
        try {
            synchronized (f19229b) {
                byte[] bArrM15741a = new C3418aj().m15741a(this.f19236g);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(f19233i.getFilesDir(), f19230c));
                try {
                    fileOutputStream.write(bArrM15741a);
                    fileOutputStream.flush();
                } finally {
                    HelperUtils.safeClose(fileOutputStream);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m16406d() {
        return new File(f19233i.getFilesDir(), f19230c).delete();
    }
}
