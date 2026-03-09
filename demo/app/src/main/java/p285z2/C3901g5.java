package p285z2;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: z2.g5 */
/* JADX INFO: loaded from: classes.dex */
public class C3901g5 {
    private static final String OooO00o = "g5";
    private static final int OooO0O0 = 512;

    private static String OooO00o(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb.toString().trim();
            }
            sb.append(line);
            sb.append("\n");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4 = OooO00o(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooO0O0(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.io.IOException -> L53
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L47
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L47
        Ld:
            java.util.zip.ZipEntry r0 = r3.getNextEntry()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L34
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L30
            boolean r0 = r0.isDirectory()     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L30
            java.lang.String r4 = OooO00o(r3)     // Catch: java.lang.Throwable -> L3d
            r3.close()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L2f
            r2.close()     // Catch: java.io.IOException -> L53
        L2f:
            return r4
        L30:
            r3.closeEntry()     // Catch: java.lang.Throwable -> L3d
            goto Ld
        L34:
            r3.close()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.io.IOException -> L53
            goto L57
        L3d:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L47
        L46:
            throw r4     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.io.IOException -> L53
        L52:
            throw r3     // Catch: java.io.IOException -> L53
        L53:
            r2 = move-exception
            r2.printStackTrace()
        L57:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3901g5.OooO0O0(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean OooO0OO(File file, File file2) {
        File fileOooO0oO;
        String str = "unzipFile --> zipFile= " + file + ",destDir=" + file2;
        boolean z = false;
        if (file == null || file2 == null) {
            return false;
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            byte[] bArr = new byte[512];
            boolean z3 = false;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        return z3;
                    }
                    try {
                        if (nextEntry.isDirectory()) {
                            File file3 = new File(file2.getAbsolutePath() + File.separator + nextEntry.getName());
                            if (!file3.exists()) {
                                file3.mkdirs();
                                String str2 = "unzipFile --> mkdirs: " + file3.getCanonicalPath();
                            }
                        }
                        String str3 = "unzipFile --> success: fileName=" + fileOooO0oO.getName();
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        String str4 = "unzipFile --> exception: " + e.getMessage();
                        e.printStackTrace();
                        return z;
                    }
                    fileOooO0oO = C4011j4.OooO0oO(new File(file2.getAbsolutePath(), nextEntry.getName()));
                    FileOutputStream fileOutputStream = new FileOutputStream(fileOooO0oO);
                    while (true) {
                        int i = zipInputStream.read(bArr, 0, 512);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                    fileOutputStream.close();
                    z3 = true;
                } catch (Exception e2) {
                    e = e2;
                    z = z3;
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static boolean OooO0Oo(Context context, String str, File file) {
        ZipInputStream zipInputStream;
        try {
            zipInputStream = new ZipInputStream(context.getAssets().open(str));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        try {
            byte[] bArr = new byte[1024];
            boolean z = false;
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return z;
                }
                File file2 = new File(file, nextEntry.getName());
                if (nextEntry.isDirectory()) {
                    file2.mkdirs();
                } else {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    while (true) {
                        try {
                            int i = zipInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                }
                zipInputStream.closeEntry();
                z = true;
                e.printStackTrace();
                return false;
            }
        } finally {
        }
    }
}
