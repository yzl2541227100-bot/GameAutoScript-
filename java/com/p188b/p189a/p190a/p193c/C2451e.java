package com.p188b.p189a.p190a.p193c;

import com.p188b.p189a.p190a.C2446c;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: com.b.a.a.c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2451e extends ThreadLocal<DateFormat> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ DateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(C2446c.f15180f);
        return simpleDateFormat;
    }
}
