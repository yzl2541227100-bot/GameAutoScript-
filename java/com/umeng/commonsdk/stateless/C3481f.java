package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.umeng.commonsdk.proguard.C3442bg;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.statistics.common.C3489e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.zip.Deflater;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p285z2.sa0;

/* JADX INFO: renamed from: com.umeng.commonsdk.stateless.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3481f {

    /* JADX INFO: renamed from: a */
    public static int f19136a;

    /* JADX INFO: renamed from: b */
    private static final byte[] f19137b = {10, 1, 11, 5, 4, C3442bg.f18783m, 7, 9, 23, 3, 1, 6, 8, 12, C3442bg.f18781k, 91};

    /* JADX INFO: renamed from: c */
    private static Object f19138c = new Object();

    /* JADX INFO: renamed from: a */
    public static File m16241a(Context context) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        File file = null;
        try {
            synchronized (f19138c) {
                C3489e.m16329a("walle", "get last envelope begin, thread is " + Thread.currentThread());
                if (context != null && context.getApplicationContext() != null) {
                    String str = context.getApplicationContext().getFilesDir() + "/" + C3476a.f19055c;
                    if (!TextUtils.isEmpty(str)) {
                        File file2 = new File(str);
                        if (file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length > 0) {
                            for (File file3 : fileArrListFiles) {
                                if (file3 != null && file3.isDirectory() && (fileArrListFiles2 = file3.listFiles()) != null && fileArrListFiles2.length > 0) {
                                    Arrays.sort(fileArrListFiles2, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.f.1
                                        @Override // java.util.Comparator
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public int compare(File file4, File file5) {
                                            long jLastModified = file4.lastModified() - file5.lastModified();
                                            if (jLastModified > 0) {
                                                return 1;
                                            }
                                            return jLastModified == 0 ? 0 : -1;
                                        }
                                    });
                                    File file4 = fileArrListFiles2[0];
                                    if (file4 != null && (file == null || file.lastModified() > file4.lastModified())) {
                                        file = file4;
                                    }
                                }
                            }
                        }
                    }
                }
                C3489e.m16329a("walle", "get last envelope end, thread is " + Thread.currentThread());
            }
        } catch (Throwable th) {
            C3454e.m15904a(context, th);
        }
        return file;
    }

    /* JADX INFO: renamed from: a */
    public static void m16242a(Context context, String str, int i) {
        try {
            if (str == null) {
                C3489e.m16329a("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            File file = new File(str);
            if (!file.isDirectory()) {
                C3489e.m16329a("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            synchronized (f19138c) {
                File[] fileArrListFiles = file.listFiles();
                C3489e.m16329a("AmapLBS", "[lbs-build] delete file begin " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
                if (fileArrListFiles == null || fileArrListFiles.length < i) {
                    C3489e.m16329a("AmapLBS", "[lbs-build] file size < max");
                } else {
                    C3489e.m16329a("AmapLBS", "[lbs-build] file size >= max");
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            arrayList.add(file2);
                        }
                    }
                    if (arrayList.size() >= i) {
                        Collections.sort(arrayList, new Comparator<File>() { // from class: com.umeng.commonsdk.stateless.f.2
                            @Override // java.util.Comparator
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file3, File file4) {
                                if (file3 == null || file4 == null || file3.lastModified() >= file4.lastModified()) {
                                    return (file3 == null || file4 == null || file3.lastModified() != file4.lastModified()) ? 1 : 0;
                                }
                                return -1;
                            }
                        });
                        if (C3489e.f19173a) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                C3489e.m16329a("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i2)).getPath());
                            }
                        }
                        for (int i3 = 0; i3 <= arrayList.size() - i; i3++) {
                            if (arrayList.get(i3) != null) {
                                C3489e.m16329a("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i3)).getPath());
                                try {
                                    ((File) arrayList.get(i3)).delete();
                                    arrayList.remove(i3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                C3489e.m16329a("AmapLBS", "[lbs-build] delete file end " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
            }
        } catch (Throwable th) {
            C3454e.m15904a(context, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16243a(long j, long j2) {
        return j > j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX INFO: renamed from: a */
    public static boolean m16244a(Context context, String str, String str2, byte[] bArr) {
        boolean z;
        FileOutputStream fileOutputStream;
        int i = 1;
        if (context == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                synchronized (f19138c) {
                    try {
                        C3489e.m16329a("walle", "[stateless] begin write envelope, thread is " + Thread.currentThread());
                        File file = new File(context.getFilesDir() + "/" + C3476a.f19055c);
                        if (!file.isDirectory()) {
                            file.mkdir();
                        }
                        File file2 = new File(file.getPath() + "/" + str);
                        if (!file2.isDirectory()) {
                            file2.mkdir();
                        }
                        File file3 = new File(file2.getPath() + "/" + str2);
                        if (!file3.exists()) {
                            file3.createNewFile();
                        }
                        fileOutputStream = new FileOutputStream(file3);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        z = false;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        throw th;
                    }
                    try {
                        C3489e.m16329a("walle", "[stateless] end write envelope, thread id " + Thread.currentThread());
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                        z = true;
                        while (true) {
                            break;
                            break;
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                e = e;
                z = false;
            } catch (Throwable th5) {
                th = th5;
                z = false;
            }
            try {
                break;
                throw th;
            } catch (IOException e2) {
                e = e2;
                C3489e.m16329a("walle", "[stateless] write envelope, e is " + e.getMessage());
                C3454e.m15904a(context, e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                C3489e.m16329a("walle", "[stateless] end write envelope, thread id " + Thread.currentThread());
                i = z;
                return i;
            } catch (Throwable th6) {
                th = th6;
                C3489e.m16329a("walle", "[stateless] write envelope, e is " + th.getMessage());
                C3454e.m15904a(context, th);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                C3489e.m16329a("walle", "[stateless] end write envelope, thread id " + Thread.currentThread());
                i = z;
                return i;
            }
        } catch (Throwable th7) {
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            Object[] objArr = new Object[i];
            objArr[0] = "[stateless] end write envelope, thread id " + Thread.currentThread();
            C3489e.m16329a("walle", objArr);
            throw th7;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m16245a(String str) throws IOException {
        byte[] bArr;
        synchronized (f19138c) {
            C3489e.m16329a("walle", "[stateless] begin read envelope, thread is " + Thread.currentThread());
            FileChannel channel = null;
            try {
                try {
                    channel = new RandomAccessFile(str, C1781c.f10296bk).getChannel();
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                    System.out.println(mappedByteBufferLoad.isLoaded());
                    bArr = new byte[(int) channel.size()];
                    if (mappedByteBufferLoad.remaining() > 0) {
                        mappedByteBufferLoad.get(bArr, 0, mappedByteBufferLoad.remaining());
                    }
                    C3489e.m16329a("walle", "[stateless] end read envelope, thread id " + Thread.currentThread());
                } catch (IOException e) {
                    C3489e.m16329a("walle", "[stateless] write envelope, e is " + e.getMessage());
                    throw e;
                }
            } finally {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m16246a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        f19136a = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int iDeflate = deflater.deflate(bArr2);
                    f19136a += iDeflate;
                    byteArrayOutputStream2.write(bArr2, 0, iDeflate);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            deflater.end();
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m16247a(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(bArr2, sa0.AES), new IvParameterSpec(f19137b));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m16248b(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m16249c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b)));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }
}
