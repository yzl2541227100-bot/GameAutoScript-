package com.umeng.commonsdk.stateless;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3418aj;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.stateless.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3478c {

    /* JADX INFO: renamed from: e */
    private String f19112e;

    /* JADX INFO: renamed from: j */
    private int f19117j;

    /* JADX INFO: renamed from: k */
    private int f19118k;

    /* JADX INFO: renamed from: l */
    private byte[] f19119l;

    /* JADX INFO: renamed from: m */
    private byte[] f19120m;

    /* JADX INFO: renamed from: a */
    private final byte[] f19108a = {0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b */
    private final int f19109b = 1;

    /* JADX INFO: renamed from: c */
    private final int f19110c = 0;

    /* JADX INFO: renamed from: d */
    private String f19111d = "1.0";

    /* JADX INFO: renamed from: f */
    private byte[] f19113f = null;

    /* JADX INFO: renamed from: g */
    private byte[] f19114g = null;

    /* JADX INFO: renamed from: h */
    private byte[] f19115h = null;

    /* JADX INFO: renamed from: i */
    private int f19116i = 0;

    /* JADX INFO: renamed from: n */
    private boolean f19121n = false;

    private C3478c(byte[] bArr, String str, byte[] bArr2) throws Exception {
        this.f19112e = null;
        this.f19117j = 0;
        this.f19118k = 0;
        this.f19119l = null;
        this.f19120m = null;
        if (bArr == null || bArr.length == 0) {
            throw new Exception("entity is null or empty");
        }
        this.f19112e = str;
        this.f19118k = bArr.length;
        this.f19119l = C3481f.m16246a(bArr);
        this.f19117j = (int) (System.currentTimeMillis() / 1000);
        this.f19120m = bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static C3478c m16220a(Context context, String str, byte[] bArr) {
        try {
            String mac = DeviceConfig.getMac(context);
            String deviceId = DeviceConfig.getDeviceId(context);
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("[stateless] build envelope, raw is  ");
            sb.append(bArr == null);
            sb.append("m app key is ");
            sb.append(str);
            sb.append("device id is ");
            sb.append(deviceId);
            sb.append(", mac is ");
            sb.append(mac);
            objArr[0] = sb.toString();
            C3489e.m16329a("walle", objArr);
            C3478c c3478c = new C3478c(bArr, str, (deviceId + mac).getBytes());
            c3478c.m16225a();
            return c3478c;
        } catch (Exception e) {
            C3489e.m16329a("walle", "[stateless] build envelope, e is " + e.getMessage());
            C3454e.m15904a(context, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m16221a(byte[] bArr, int i) {
        byte[] bArrM16248b = C3481f.m16248b(this.f19120m);
        byte[] bArrM16248b2 = C3481f.m16248b(this.f19119l);
        int length = bArrM16248b.length;
        int i2 = length * 2;
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            bArr2[i4] = bArrM16248b2[i3];
            bArr2[i4 + 1] = bArrM16248b[i3];
        }
        for (int i5 = 0; i5 < 2; i5++) {
            bArr2[i5] = bArr[i5];
            bArr2[(i2 - i5) - 1] = bArr[(bArr.length - i5) - 1];
        }
        byte[] bArr3 = {(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) (i >>> 24)};
        for (int i6 = 0; i6 < i2; i6++) {
            bArr2[i6] = (byte) (bArr2[i6] ^ bArr3[i6 % 4]);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static C3478c m16222b(Context context, String str, byte[] bArr) {
        try {
            String mac = DeviceConfig.getMac(context);
            C3478c c3478c = new C3478c(bArr, str, (DeviceConfig.getDeviceId(context) + mac).getBytes());
            c3478c.m16226a(true);
            c3478c.m16225a();
            return c3478c;
        } catch (Exception e) {
            C3454e.m15904a(context, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private byte[] m16223c() {
        return m16221a(this.f19108a, (int) (System.currentTimeMillis() / 1000));
    }

    /* JADX INFO: renamed from: d */
    private byte[] m16224d() {
        return C3481f.m16248b((C3481f.m16249c(this.f19113f) + this.f19116i + this.f19117j + this.f19118k + C3481f.m16249c(this.f19114g)).getBytes());
    }

    /* JADX INFO: renamed from: a */
    public void m16225a() {
        if (this.f19113f == null) {
            this.f19113f = m16223c();
        }
        if (this.f19121n) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.f19113f, 1, bArr, 0, 16);
                this.f19119l = C3481f.m16247a(this.f19119l, bArr);
            } catch (Exception unused) {
            }
        }
        this.f19114g = m16221a(this.f19113f, this.f19117j);
        this.f19115h = m16224d();
    }

    /* JADX INFO: renamed from: a */
    public void m16226a(boolean z) {
        this.f19121n = z;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m16227b() {
        C3477b c3477b = new C3477b();
        c3477b.m16165a(this.f19111d);
        c3477b.m16170b(this.f19112e);
        c3477b.m16174c(C3481f.m16249c(this.f19113f));
        c3477b.m16164a(this.f19116i);
        c3477b.m16169b(this.f19117j);
        c3477b.m16173c(this.f19118k);
        c3477b.m16167a(this.f19119l);
        c3477b.m16177d(this.f19121n ? 1 : 0);
        c3477b.m16178d(C3481f.m16249c(this.f19114g));
        c3477b.m16182e(C3481f.m16249c(this.f19115h));
        try {
            return new C3418aj().m15741a(c3477b);
        } catch (Exception unused) {
            return null;
        }
    }
}
