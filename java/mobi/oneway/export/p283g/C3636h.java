package mobi.oneway.export.p283g;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: mobi.oneway.export.g.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3636h {
    /* JADX INFO: renamed from: a */
    private static long m16944a(long j) {
        return Math.round(j / 1024.0d);
    }

    /* JADX INFO: renamed from: a */
    public static long m16945a(File file) {
        if (m16967f(file)) {
            return -1L;
        }
        try {
            return m16944a(file.getFreeSpace());
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m16946a(Context context, String str, String str2) {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            String strM17036c = C3648t.m17036c(inputStreamOpen, str2);
            C3638j.m16981a(inputStreamOpen);
            return strM17036c;
        } catch (Throwable th) {
            C3638j.m16981a(inputStreamOpen);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m16947a(String str, String str2) throws Throwable {
        byte[] bArrM16970h = m16970h(new File(str));
        return str2 == null ? new String(bArrM16970h) : new String(bArrM16970h, str2);
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m16948a(File file, String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(C3648t.m17035b(new FileInputStream(file), str));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        C3638j.m16981a(bufferedReader2);
                        return arrayList;
                    }
                    arrayList.add(line);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C3638j.m16981a(bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16949a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16950a(File file, byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (file == null || bArr == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            m16959c(file.getParent(), (String) null);
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            C3638j.m16981a(bufferedOutputStream);
            return true;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            C3638j.m16981a(bufferedOutputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16951a(String str) {
        return m16965e(new File(str));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16952a(String str, Object obj) {
        return obj != null && m16957b(new File(str), obj.toString());
    }

    /* JADX INFO: renamed from: b */
    private static long m16953b(long j) {
        return Math.round((j / 1024.0d) / 1024.0d);
    }

    /* JADX INFO: renamed from: b */
    public static long m16954b(File file) {
        if (m16967f(file)) {
            return -1L;
        }
        try {
            return m16944a(file.getTotalSpace());
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m16955b(String str) {
        return m16971i(new File(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m16956b(String str, String str2) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(C3648t.m17035b(new FileInputStream(str), str2));
            try {
                String line = bufferedReader2.readLine();
                C3638j.m16981a(bufferedReader2);
                return line;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                C3638j.m16981a(bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16957b(File file, String str) {
        return m16950a(file, str.getBytes());
    }

    /* JADX INFO: renamed from: c */
    public static File m16958c(File file, String str) {
        if (file == null) {
            return null;
        }
        return m16959c(file.getAbsolutePath(), str);
    }

    /* JADX INFO: renamed from: c */
    public static File m16959c(String str, String str2) {
        if (str == null) {
            return null;
        }
        File file = TextUtils.isEmpty(str2) ? new File(str) : new File(str, str2);
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m16960c(String str) {
        return m16956b(str, (String) null);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16961c(File file) {
        return m16965e(file) && file.isFile();
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m16962d(String str) {
        return m16948a(new File(str), (String) null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16963d(File file) {
        return m16965e(file) && file.isDirectory();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16964d(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
            try {
                C3648t.m17032a(fileInputStream2, fileOutputStream);
                C3638j.m16981a(fileInputStream2, fileOutputStream);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C3638j.m16981a(fileInputStream, fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16965e(File file) {
        return file != null && file.exists();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16966e(String str) {
        return !TextUtils.isEmpty(str) && m16972j(new File(str));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16967f(File file) {
        return !m16965e(file);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16968f(String str) {
        try {
            Runtime.getRuntime().exec("chmod 777 " + str);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16969g(File file) {
        return m16965e(file) && file.canRead();
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m16970h(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        if (file == null) {
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(bufferedInputStream.available());
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
            try {
                C3648t.m17032a(bufferedInputStream, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C3638j.m16981a(bufferedInputStream, byteArrayOutputStream);
                return byteArray;
            } catch (Throwable th3) {
                th = th3;
                C3638j.m16981a(bufferedInputStream, byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m16971i(File file) {
        return m16947a(file.getAbsolutePath(), (String) null);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m16972j(File file) {
        if (file == null) {
            return false;
        }
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            try {
                return file.delete();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File[] fileArrListFiles = ((File) stack.peek()).listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    if (!file2.isFile()) {
                        stack.push(file2);
                    } else if (!file2.delete()) {
                        z = false;
                    }
                }
            } else if (!((File) stack.pop()).delete()) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16973k(File file) {
        return file != null && file.isDirectory() && file.canRead() && file.canWrite() && file.canExecute();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m16974l(File file) {
        return file != null && m16968f(file.getAbsolutePath());
    }
}
