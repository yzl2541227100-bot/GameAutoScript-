package com.p005a.p006a.p007a;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: com.a.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0684a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final List<String> f353a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final List<String> f354b;

    /* JADX INFO: renamed from: c */
    public final int f355c;

    public C0684a(@NonNull List<String> list, @NonNull List<String> list2, int i) {
        this.f353a = list;
        this.f354b = list2;
        this.f355c = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m105a() {
        List<String> list = this.f353a;
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            String str = "";
            for (String str2 : list) {
                sb.append(str);
                sb.append(str2);
                str = "\n";
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return m105a();
    }
}
