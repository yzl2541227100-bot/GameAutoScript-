package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.C3428at;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.aj */
/* JADX INFO: loaded from: classes2.dex */
public class C3418aj {

    /* JADX INFO: renamed from: a */
    private final ByteArrayOutputStream f18672a;

    /* JADX INFO: renamed from: b */
    private final C3447bl f18673b;

    /* JADX INFO: renamed from: c */
    private AbstractC3434az f18674c;

    public C3418aj() {
        this(new C3428at.a());
    }

    public C3418aj(InterfaceC3437bb interfaceC3437bb) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f18672a = byteArrayOutputStream;
        C3447bl c3447bl = new C3447bl(byteArrayOutputStream);
        this.f18673b = c3447bl;
        this.f18674c = interfaceC3437bb.mo15825a(c3447bl);
    }

    /* JADX INFO: renamed from: a */
    public String m15740a(InterfaceC3409aa interfaceC3409aa, String str) throws C3415ag {
        try {
            return new String(m15741a(interfaceC3409aa), str);
        } catch (UnsupportedEncodingException unused) {
            throw new C3415ag("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m15741a(InterfaceC3409aa interfaceC3409aa) throws C3415ag {
        this.f18672a.reset();
        interfaceC3409aa.write(this.f18674c);
        return this.f18672a.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public String m15742b(InterfaceC3409aa interfaceC3409aa) throws C3415ag {
        return new String(m15741a(interfaceC3409aa));
    }
}
