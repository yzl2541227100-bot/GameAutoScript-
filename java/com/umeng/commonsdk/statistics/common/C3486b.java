package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3486b {

    /* JADX INFO: renamed from: a */
    public static int f19161a;

    /* JADX INFO: renamed from: a */
    public static String m16301a(byte[] bArr, String str) throws DataFormatException, UnsupportedEncodingException {
        byte[] bArrM16304b = m16304b(bArr);
        if (bArrM16304b != null) {
            return new String(bArrM16304b, str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m16302a(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m16303a(str.getBytes(str2));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m16303a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        f19161a = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int iDeflate = deflater.deflate(bArr2);
                    f19161a += iDeflate;
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

    /* JADX INFO: renamed from: b */
    public static byte[] m16304b(byte[] bArr) throws DataFormatException, UnsupportedEncodingException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Inflater inflater = new Inflater();
        int i = 0;
        inflater.setInput(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (!inflater.needsInput()) {
            int iInflate = inflater.inflate(bArr2);
            byteArrayOutputStream.write(bArr2, i, iInflate);
            i += iInflate;
        }
        inflater.end();
        return byteArrayOutputStream.toByteArray();
    }
}
