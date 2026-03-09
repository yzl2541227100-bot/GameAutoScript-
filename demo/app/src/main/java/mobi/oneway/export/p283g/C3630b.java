package mobi.oneway.export.p283g;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: mobi.oneway.export.g.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3630b {
    /* JADX INFO: renamed from: a */
    public static String m16912a(String str) {
        return new String(m16918a(str.getBytes("utf-8")), "ASCII");
    }

    /* JADX INFO: renamed from: a */
    public static String m16913a(String str, String str2) {
        try {
            try {
                return new String(m16918a(str.getBytes(str2)), "ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("ASCII is not supported!", e);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Unsupported charset: " + str2, e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16914a(File file, File file2) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    m16916a(fileInputStream, fileOutputStream2);
                    C3638j.m16981a(fileOutputStream2);
                    C3638j.m16981a(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    C3638j.m16981a(fileOutputStream);
                    C3638j.m16981a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16915a(File file, File file2, int i) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    m16917a(fileInputStream, fileOutputStream2, i);
                    C3638j.m16981a(fileOutputStream2);
                    C3638j.m16981a(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    C3638j.m16981a(fileOutputStream);
                    C3638j.m16981a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16916a(InputStream inputStream, OutputStream outputStream) throws IOException {
        m16917a(inputStream, outputStream, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m16917a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        C3632d c3632d = new C3632d(outputStream, i);
        m16925c(inputStream, c3632d);
        c3632d.m16927a();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m16918a(byte[] bArr) {
        return m16919a(bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m16919a(byte[] bArr, int i) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                m16917a(byteArrayInputStream, byteArrayOutputStream, i);
                C3638j.m16981a(byteArrayInputStream, byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException("Unexpected I/O error", e);
            }
        } catch (Throwable th) {
            C3638j.m16981a(byteArrayInputStream, byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m16920b(String str) {
        try {
            return new String(m16924b(str.getBytes("ASCII")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII is not supported!", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m16921b(String str, String str2) {
        try {
            try {
                return new String(m16924b(str.getBytes("ASCII")), str2);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported charset: " + str2, e);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII is not supported!", e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16922b(File file, File file2) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    m16923b(fileInputStream, fileOutputStream2);
                    C3638j.m16981a(fileOutputStream2);
                    C3638j.m16981a(fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    C3638j.m16981a(fileOutputStream);
                    C3638j.m16981a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16923b(InputStream inputStream, OutputStream outputStream) throws IOException {
        m16925c(new C3631c(inputStream), outputStream);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m16924b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                m16923b(byteArrayInputStream, byteArrayOutputStream);
                C3638j.m16981a(byteArrayInputStream);
                C3638j.m16981a(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException("Unexpected I/O error", e);
            }
        } catch (Throwable th) {
            C3638j.m16981a(byteArrayInputStream);
            C3638j.m16981a(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m16925c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }
}
