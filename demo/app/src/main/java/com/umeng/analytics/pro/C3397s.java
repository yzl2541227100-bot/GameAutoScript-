package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.commonsdk.proguard.C3442bg;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: com.umeng.analytics.pro.s */
/* JADX INFO: loaded from: classes2.dex */
public class C3397s {
    /* JADX INFO: renamed from: a */
    public static Object m15620a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ObjectInputStream(new ByteArrayInputStream(m15623b(str))).readObject();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m15621a(Serializable serializable) {
        if (serializable == null) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            return m15622a(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m15622a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append((char) (((bArr[i] >> 4) & 15) + 97));
            stringBuffer.append((char) ((bArr[i] & C3442bg.f18783m) + 97));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m15623b(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length(); i += 2) {
            int i2 = i / 2;
            bArr[i2] = (byte) ((str.charAt(i) - 'a') << 4);
            bArr[i2] = (byte) (bArr[i2] + (str.charAt(i + 1) - 'a'));
        }
        return bArr;
    }
}
