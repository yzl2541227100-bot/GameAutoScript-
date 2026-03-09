package com.anythink.expressad.exoplayer.p091b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1506f {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f7547a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.f$a */
    public static final class a extends Exception {
        public a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo6421a(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: a */
    boolean mo6422a();

    /* JADX INFO: renamed from: a */
    boolean mo6423a(int i, int i2, int i3);

    /* JADX INFO: renamed from: b */
    int mo6424b();

    /* JADX INFO: renamed from: c */
    int mo6425c();

    /* JADX INFO: renamed from: d */
    int mo6426d();

    /* JADX INFO: renamed from: e */
    void mo6427e();

    /* JADX INFO: renamed from: f */
    ByteBuffer mo6428f();

    /* JADX INFO: renamed from: g */
    boolean mo6429g();

    /* JADX INFO: renamed from: h */
    void mo6430h();

    /* JADX INFO: renamed from: i */
    void mo6431i();
}
