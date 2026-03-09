package com.umeng.commonsdk.proguard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.m */
/* JADX INFO: loaded from: classes2.dex */
public class C3462m {

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.m$a */
    public enum a {
        check_su_binary(new String[]{"/system/xbin/which", "su"});


        /* JADX INFO: renamed from: b */
        public String[] f18855b;

        a(String[] strArr) {
            this.f18855b = strArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public ArrayList m15967a(a aVar) {
        ArrayList arrayList = new ArrayList();
        try {
            Process processExec = Runtime.getRuntime().exec(aVar.f18855b);
            new BufferedWriter(new OutputStreamWriter(processExec.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    arrayList.add(line);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }
}
