package p285z2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: z2.vb */
/* JADX INFO: loaded from: classes.dex */
public class C4462vb {
    private static final String OooO00o = "ROOT_UTIL";

    private static boolean OooO00o() throws Throwable {
        DataOutputStream dataOutputStream;
        Throwable th;
        Process processExec;
        DataOutputStream dataOutputStream2 = null;
        try {
            processExec = Runtime.getRuntime().exec("su");
            try {
                dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                try {
                    dataOutputStream.writeBytes("exit\n");
                    dataOutputStream.flush();
                    processExec.waitFor();
                    try {
                        dataOutputStream.close();
                        processExec.destroy();
                        return true;
                    } catch (Exception unused) {
                        return true;
                    }
                } catch (Exception unused2) {
                    dataOutputStream2 = dataOutputStream;
                    if (dataOutputStream2 != null) {
                        try {
                            dataOutputStream2.close();
                        } catch (Exception unused3) {
                            return false;
                        }
                    }
                    processExec.destroy();
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception unused4) {
                            throw th;
                        }
                    }
                    processExec.destroy();
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th3) {
                dataOutputStream = null;
                th = th3;
            }
        } catch (Exception unused6) {
            processExec = null;
        } catch (Throwable th4) {
            dataOutputStream = null;
            th = th4;
            processExec = null;
        }
    }

    public static boolean OooO0O0() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean OooO0OO() {
        String str = System.getenv("PATH");
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(":")) {
            String str3 = str2 + File.separator + "su";
            if (new File(str3).exists()) {
                arrayList.add("ls -l " + str3);
            }
        }
        ArrayList<String> arrayListOooO0Oo = OooO0Oo("/system/bin/sh", arrayList);
        String str4 = "";
        for (int i = 0; i < arrayListOooO0Oo.size(); i++) {
            str4 = str4 + arrayListOooO0Oo.get(i);
        }
        if (str4.contains("-rws")) {
            return true;
        }
        return OooO00o();
    }

    private static ArrayList<String> OooO0Oo(String str, ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Process processExec = null;
        try {
            try {
                try {
                    processExec = Runtime.getRuntime().exec(str);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        bufferedOutputStream.write((it.next() + " 2>&1\n").getBytes());
                    }
                    bufferedOutputStream.write("exit\n".getBytes());
                    bufferedOutputStream.flush();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList2.add(line);
                    }
                    processExec.waitFor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return arrayList2;
        } finally {
            processExec.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean OooO0o0() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4462vb.OooO0o0():boolean");
    }
}
