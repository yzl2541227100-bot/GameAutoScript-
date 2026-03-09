package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.anythink.china.common.C1082d;
import com.umeng.commonsdk.framework.C3403a;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.q */
/* JADX INFO: loaded from: classes2.dex */
public class C3466q {

    /* JADX INFO: renamed from: b */
    private static final String f18878b = "/.um/.umm.dat";

    /* JADX INFO: renamed from: c */
    private static final String f18879c = "/.uxx/.cca.dat";

    /* JADX INFO: renamed from: d */
    private static final String f18880d = "/.cc/.adfwe.dat";

    /* JADX INFO: renamed from: e */
    private static final String f18881e = "/.a.dat";

    /* JADX INFO: renamed from: f */
    private static final String f18882f = "umdat";

    /* JADX INFO: renamed from: a */
    private Context f18883a;

    public C3466q(Context context) {
        this.f18883a = context;
    }

    /* JADX INFO: renamed from: a */
    private void m15985a(String str, String str2) {
        if (DeviceConfig.checkPermission(this.f18883a, C1082d.f2502b)) {
            try {
                String externalStorageState = Environment.getExternalStorageState();
                if (externalStorageState == null || !externalStorageState.equalsIgnoreCase("mounted")) {
                    return;
                }
                String strM15986b = m15986b(str2);
                if (strM15986b == null || !strM15986b.equals(str)) {
                    File file = new File(Environment.getExternalStorageDirectory() + str2);
                    if (file.getParentFile() != null && !file.getParentFile().exists()) {
                        file.getParentFile().mkdir();
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(Environment.getExternalStorageDirectory() + str2, "rw");
                    randomAccessFile.setLength((long) str.getBytes().length);
                    FileChannel channel = randomAccessFile.getChannel();
                    FileLock fileLockTryLock = channel.tryLock();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
                    byteBufferAllocate.clear();
                    byteBufferAllocate.put(str.getBytes());
                    byteBufferAllocate.flip();
                    while (byteBufferAllocate.hasRemaining()) {
                        channel.write(byteBufferAllocate);
                    }
                    channel.force(true);
                    if (fileLockTryLock != null) {
                        fileLockTryLock.release();
                    }
                    channel.close();
                }
            } catch (Exception e) {
                C3489e.m16350e("saveFileUmtt:" + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private String m15986b(String str) {
        String externalStorageState;
        try {
            if (!DeviceConfig.checkPermission(this.f18883a, "android.permission.READ_EXTERNAL_STORAGE") || (externalStorageState = Environment.getExternalStorageState()) == null || !externalStorageState.equalsIgnoreCase("mounted")) {
                return null;
            }
            if (!new File(Environment.getExternalStorageDirectory() + str).exists()) {
                return null;
            }
            FileChannel channel = new RandomAccessFile(Environment.getExternalStorageDirectory() + str, "rw").getChannel();
            FileLock fileLockTryLock = channel.tryLock();
            StringBuilder sb = new StringBuilder();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
            while (true) {
                byteBufferAllocate.clear();
                if (channel.read(byteBufferAllocate) == -1) {
                    break;
                }
                byte[] bArr = new byte[byteBufferAllocate.position()];
                for (int i = 0; i < byteBufferAllocate.position(); i++) {
                    bArr[i] = byteBufferAllocate.get(i);
                }
                sb.append(new String(bArr));
            }
            if (channel != null) {
                fileLockTryLock.release();
            }
            channel.close();
            return sb.toString();
        } catch (Exception e) {
            C3489e.m16350e("getFileUmtt:" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m15987c(String str) {
        SharedPreferences sharedPreferences = this.f18883a.getApplicationContext().getSharedPreferences(f18882f, 0);
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("u", null);
            if (string == null || !string.equals(str)) {
                sharedPreferences.edit().putString("u", str).commit();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private String m15988h() {
        return C3403a.m15641a(this.f18883a, C3471v.f18971d, (String) null);
    }

    /* JADX INFO: renamed from: i */
    private String m15989i() {
        SharedPreferences sharedPreferences = this.f18883a.getApplicationContext().getSharedPreferences(f18882f, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("u", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public String m15990a() {
        String strM15992b = m15992b();
        if (strM15992b == null || strM15992b.equals("")) {
            strM15992b = m15997g();
        }
        if (strM15992b == null || strM15992b.equals("")) {
            strM15992b = m15993c();
        }
        if (strM15992b == null || strM15992b.equals("")) {
            strM15992b = m15994d();
        }
        if (strM15992b == null || strM15992b.equals("")) {
            strM15992b = m15995e();
        }
        return (strM15992b == null || strM15992b.equals("")) ? m15996f() : strM15992b;
    }

    /* JADX INFO: renamed from: a */
    public void m15991a(String str) {
        m15985a(str, f18878b);
        m15985a(str, f18879c);
        m15985a(str, f18880d);
        m15985a(str, f18881e);
        m15987c(str);
    }

    /* JADX INFO: renamed from: b */
    public String m15992b() {
        return m15988h();
    }

    /* JADX INFO: renamed from: c */
    public String m15993c() {
        return m15986b(f18878b);
    }

    /* JADX INFO: renamed from: d */
    public String m15994d() {
        return m15986b(f18879c);
    }

    /* JADX INFO: renamed from: e */
    public String m15995e() {
        return m15986b(f18880d);
    }

    /* JADX INFO: renamed from: f */
    public String m15996f() {
        return m15986b(f18881e);
    }

    /* JADX INFO: renamed from: g */
    public String m15997g() {
        return m15989i();
    }
}
