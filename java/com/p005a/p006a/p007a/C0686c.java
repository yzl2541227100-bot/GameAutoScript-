package com.p005a.p006a.p007a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: renamed from: com.a.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0686c extends Thread {

    /* JADX INFO: renamed from: a */
    private final BufferedReader f357a;

    /* JADX INFO: renamed from: b */
    private List<String> f358b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0687d f359c;

    public C0686c(InputStream inputStream, List<String> list) {
        this.f357a = new BufferedReader(new InputStreamReader(inputStream));
        this.f358b = list;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                String line = this.f357a.readLine();
                if (line != null) {
                    List<String> list = this.f358b;
                    if (list != null) {
                        list.add(line);
                    }
                    InterfaceC0687d interfaceC0687d = this.f359c;
                }
            } catch (IOException unused) {
            }
            try {
                this.f357a.close();
                return;
            } catch (IOException unused2) {
                return;
            }
        }
    }
}
