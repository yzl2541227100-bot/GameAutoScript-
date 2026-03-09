package com.octopus.p222ad.internal.p226b;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.n */
/* JADX INFO: loaded from: classes2.dex */
public class C3106n {
    /* JADX INFO: renamed from: a */
    public static String m14348a(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    /* JADX INFO: renamed from: a */
    private static String m14349a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(b)));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m14350a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                HaoboLog.m14610e(HaoboLog.proxyCacheUtilsLogTag, "Error closing resource", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14351a(byte[] bArr, long j, int i) {
        C3103k.m14330a(bArr, "Buffer must be not null!");
        C3103k.m14332a(j >= 0, "Data offset must be positive!");
        C3103k.m14332a(i >= 0 && i <= bArr.length, "Length must be in range [0..buffer.length]");
    }

    /* JADX INFO: renamed from: b */
    public static String m14352b(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error encoding url", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m14353c(String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error decoding url", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m14354d(String str) {
        try {
            return m14349a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
