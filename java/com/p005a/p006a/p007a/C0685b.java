package com.p005a.p006a.p007a;

import androidx.annotation.NonNull;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.a.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0685b {

    /* JADX INFO: renamed from: a */
    public static final String[] f356a = {"echo -BOC-", "id"};

    /* JADX INFO: renamed from: a */
    public static C0684a m106a(@NonNull String str, @NonNull String... strArr) {
        return m107b(str, strArr);
    }

    /* JADX INFO: renamed from: b */
    private static C0684a m107b(@NonNull String str, @NonNull String[] strArr) {
        int iWaitFor;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        List listSynchronizedList2 = Collections.synchronizedList(new ArrayList());
        try {
            try {
                Process processExec = Runtime.getRuntime().exec(str, (String[]) null);
                DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                C0686c c0686c = new C0686c(processExec.getInputStream(), listSynchronizedList);
                C0686c c0686c2 = new C0686c(processExec.getErrorStream(), listSynchronizedList2);
                c0686c.start();
                c0686c2.start();
                try {
                    for (String str2 : strArr) {
                        dataOutputStream.write((str2 + "\n").getBytes("UTF-8"));
                        dataOutputStream.flush();
                    }
                    dataOutputStream.write("exit\n".getBytes("UTF-8"));
                    dataOutputStream.flush();
                } catch (IOException e) {
                    if (!e.getMessage().contains("EPIPE")) {
                        throw e;
                    }
                }
                iWaitFor = processExec.waitFor();
                try {
                    dataOutputStream.close();
                } catch (IOException unused) {
                }
                c0686c.join();
                c0686c2.join();
                processExec.destroy();
            } catch (IOException unused2) {
                iWaitFor = -4;
            }
        } catch (InterruptedException unused3) {
            iWaitFor = -1;
        }
        return new C0684a(listSynchronizedList, listSynchronizedList2, iWaitFor);
    }
}
