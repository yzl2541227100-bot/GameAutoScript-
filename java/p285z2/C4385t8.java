package p285z2;

import android.content.Context;
import android.os.AsyncTask;
import com.cyjh.elfin.base.AppContext;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.apache.commons.p284io.FileUtils;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: z2.t8 */
/* JADX INFO: loaded from: classes.dex */
public class C4385t8 {
    private static final Pattern OooO00o = Pattern.compile("[\\w%+,./=_-]+");

    /* JADX INFO: renamed from: z2.t8$OooO00o */
    public static class OooO00o implements FilenameFilter {
        private String OoooOoO;

        public OooO00o(String str) {
            this.OoooOoO = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(this.OoooOoO);
        }
    }

    /* JADX INFO: renamed from: z2.t8$OooO0O0 */
    public static class OooO0O0 extends AsyncTask<File[], ArrayList<HashMap<String, Integer>>, ArrayList<HashMap<String, Boolean>>> {
        private OooO00o OooO00o;

        /* JADX INFO: renamed from: z2.t8$OooO0O0$OooO00o */
        public interface OooO00o {
            void OooO00o(ArrayList<HashMap<String, Boolean>> arrayList);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public ArrayList<HashMap<String, Boolean>> doInBackground(File[]... fileArr) {
            new ArrayList(fileArr[0].length);
            for (int i = 0; i < fileArr[0].length; i++) {
                C4385t8.OooO0Oo(fileArr[0][i], fileArr[1][i]);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<HashMap<String, Boolean>> arrayList) {
            super.onPostExecute(arrayList);
            this.OooO00o.OooO00o(arrayList);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(ArrayList<HashMap<String, Integer>>... arrayListArr) {
            super.onProgressUpdate(arrayListArr);
        }

        public void OooO0Oo(OooO00o oooO00o) {
            this.OooO00o = oooO00o;
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public static String OooO(String str) {
        return OooOOOo(new File(OooOO0(), str).getAbsolutePath());
    }

    public static String OooO00o(Context context, String str) throws NoSuchAlgorithmException, IOException {
        return OooO0O0(context.getAssets().open(str));
    }

    private static String OooO0O0(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                break;
            }
            messageDigest.update(bArr, 0, i);
        }
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static String OooO0OO(String str) throws NoSuchAlgorithmException, IOException {
        return OooO0O0(new FileInputStream(new File(str)));
    }

    public static boolean OooO0Oo(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                boolean zOooO0o0 = OooO0o0(fileInputStream, file2);
                fileInputStream.close();
                return zOooO0o0;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean OooO0o(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (!OooO0o(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARN: Finally extract failed */
    public static boolean OooO0o0(InputStream inputStream, File file) {
        try {
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
                fileOutputStream.flush();
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException unused) {
                }
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                fileOutputStream.flush();
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException unused2) {
                }
                fileOutputStream.close();
                throw th;
            }
        } catch (IOException unused3) {
            return false;
        }
    }

    public static String OooO0oO(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        File file = new File(str);
        try {
            byte[] bArr = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    break;
                }
                stringBuffer.append(new String(bArr, 0, i, str2));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public static String OooO0oo(long j) {
        StringBuilder sb;
        String str;
        DecimalFormat decimalFormat = new DecimalFormat("#");
        if (j < 1024) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(j));
            str = "B";
        } else if (j < 1048576) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(j / 1024.0d));
            str = "KB";
        } else if (j < FileUtils.ONE_GB) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(j / 1048576.0d));
            str = "MB";
        } else {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(j / 1.073741824E9d));
            str = "G";
        }
        sb.append(str);
        return sb.toString();
    }

    public static File OooOO0() {
        File file = new File(C3902g6.OooO00o(AppContext.OooO00o()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean OooOO0O(String str, String str2) {
        String str3;
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        if (str.lastIndexOf("/") == str.length() - 1) {
            str3 = str + str2;
        } else {
            str3 = str + "/" + str2;
        }
        return new File(str3).exists();
    }

    public static boolean OooOO0o(File file) {
        return OooO00o.matcher(file.getPath()).matches();
    }

    public static String OooOOO(String str, String str2) {
        String str3 = File.separator;
        if (str.endsWith(str3)) {
            return str + str2;
        }
        return str + str3 + str2;
    }

    public static boolean OooOOO0(Context context, String str, String str2) {
        try {
            return OooO00o(context, str).equals(OooO0OO(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String OooOOOO(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
            try {
                if (!file.isDirectory()) {
                    file.createNewFile();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file.getAbsolutePath();
    }

    private static String OooOOOo(String str) {
        return OooO0oO(str, "utf-8");
    }

    public static String OooOOo(File file) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            do {
                i = bufferedReader.read();
                if (i != -1) {
                    stringBuffer.append((char) i);
                }
            } while (i != -1);
            bufferedReader.close();
            String string = stringBuffer.toString();
            return string.indexOf(IOUtils.LINE_SEPARATOR_WINDOWS) != -1 ? string.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, "\n") : string.indexOf("\r") != -1 ? string.replaceAll("\r", "\n") : string;
        } catch (IOException | OutOfMemoryError unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooOOo0(android.content.Context r2, java.lang.String r3) {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.io.IOException -> L4d
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.io.IOException -> L4d
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L41
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L41
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L41
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
        L17:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L26
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            goto L17
        L26:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L37
            r3.close()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L36
            r2.close()     // Catch: java.io.IOException -> L4d
        L36:
            return r0
        L37:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L41
        L40:
            throw r0     // Catch: java.lang.Throwable -> L41
        L41:
            r3 = move-exception
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.io.IOException -> L4d
        L4c:
            throw r3     // Catch: java.io.IOException -> L4d
        L4d:
            r2 = move-exception
            r2.printStackTrace()
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4385t8.OooOOo0(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String OooOOoo(File file, int i, String str) throws IOException {
        StringBuilder sb;
        int i2;
        boolean z;
        int i3;
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        try {
            long length = file.length();
            String str2 = "";
            if (i > 0 || (length > 0 && i == 0)) {
                if (length > 0 && (i == 0 || length < i)) {
                    i = (int) length;
                }
                byte[] bArr = new byte[i + 1];
                int i4 = bufferedInputStream.read(bArr);
                if (i4 > 0) {
                    if (i4 <= i) {
                        str2 = new String(bArr, 0, i4);
                    } else if (str == null) {
                        str2 = new String(bArr, 0, i);
                    } else {
                        sb = new StringBuilder();
                        sb.append(new String(bArr, 0, i));
                        sb.append(str);
                        str2 = sb.toString();
                    }
                }
            } else if (i < 0) {
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                boolean z3 = false;
                while (true) {
                    z = true;
                    if (bArr2 != null) {
                        z3 = true;
                    }
                    if (bArr2 == null) {
                        bArr2 = new byte[-i];
                    }
                    i3 = bufferedInputStream.read(bArr2);
                    if (i3 != bArr2.length) {
                        break;
                    }
                    byte[] bArr4 = bArr3;
                    bArr3 = bArr2;
                    bArr2 = bArr4;
                }
                if (bArr3 != null || i3 > 0) {
                    if (bArr3 == null) {
                        str2 = new String(bArr2, 0, i3);
                    } else {
                        if (i3 > 0) {
                            System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
                            System.arraycopy(bArr2, 0, bArr3, bArr3.length - i3, i3);
                        } else {
                            z = z3;
                        }
                        if (str != null && z) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append(new String(bArr3));
                            str2 = sb.toString();
                        }
                        str2 = new String(bArr3);
                    }
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr5 = new byte[1024];
                do {
                    i2 = bufferedInputStream.read(bArr5);
                    if (i2 > 0) {
                        byteArrayOutputStream.write(bArr5, 0, i2);
                    }
                } while (i2 == 1024);
                str2 = byteArrayOutputStream.toString();
            }
            return str2;
        } finally {
            bufferedInputStream.close();
            fileInputStream.close();
        }
    }

    public static void OooOo0(String str, String str2) {
        try {
            File file = new File(OooOO0(), str);
            if (!file.exists()) {
                file.createNewFile();
            }
            OooOo00(file.getAbsolutePath(), str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void OooOo00(String str, String str2) throws IOException {
        FileWriter fileWriter = new FileWriter(str);
        try {
            fileWriter.write(str2);
        } finally {
            fileWriter.close();
        }
    }
}
