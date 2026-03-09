package com.anythink.expressad.exoplayer.p093d;

import com.anythink.expressad.exoplayer.p093d.InterfaceC1540i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.j */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1541j<T extends InterfaceC1540i> {

    /* JADX INFO: renamed from: a */
    public static final int f8001a = 2;

    /* JADX INFO: renamed from: b */
    public static final int f8002b = 3;

    /* JADX INFO: renamed from: c */
    public static final int f8003c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f8004d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f8005e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f8006f = 3;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.j$a */
    public static final class a implements d {

        /* JADX INFO: renamed from: a */
        private final byte[] f8007a;

        /* JADX INFO: renamed from: b */
        private final String f8008b;

        public a(byte[] bArr, String str) {
            this.f8007a = bArr;
            this.f8008b = str;
        }

        @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j.d
        /* JADX INFO: renamed from: a */
        public final byte[] mo6795a() {
            return this.f8007a;
        }

        @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j.d
        /* JADX INFO: renamed from: b */
        public final String mo6796b() {
            return this.f8008b;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.j$b */
    public static final class b implements e {

        /* JADX INFO: renamed from: a */
        private final int f8009a;

        /* JADX INFO: renamed from: b */
        private final byte[] f8010b;

        public b(int i, byte[] bArr) {
            this.f8009a = i;
            this.f8010b = bArr;
        }

        @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j.e
        /* JADX INFO: renamed from: a */
        public final int mo6797a() {
            return this.f8009a;
        }

        @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j.e
        /* JADX INFO: renamed from: b */
        public final byte[] mo6798b() {
            return this.f8010b;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.j$c */
    public static final class c implements h {

        /* JADX INFO: renamed from: a */
        private final byte[] f8011a;

        /* JADX INFO: renamed from: b */
        private final String f8012b;

        public c(byte[] bArr, String str) {
            this.f8011a = bArr;
            this.f8012b = str;
        }

        @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j.h
        /* JADX INFO: renamed from: a */
        public final byte[] mo6799a() {
            return this.f8011a;
        }

        @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1541j.h
        /* JADX INFO: renamed from: b */
        public final String mo6800b() {
            return this.f8012b;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.j$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        byte[] mo6795a();

        /* JADX INFO: renamed from: b */
        String mo6796b();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.j$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        int mo6797a();

        /* JADX INFO: renamed from: b */
        byte[] mo6798b();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.j$f */
    public interface f<T extends InterfaceC1540i> {
        /* JADX INFO: renamed from: a */
        void mo6763a(byte[] bArr, int i);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.j$g */
    public interface g<T extends InterfaceC1540i> {
        /* JADX INFO: renamed from: a */
        void m6801a();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.j$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        byte[] mo6799a();

        /* JADX INFO: renamed from: b */
        String mo6800b();
    }

    /* JADX INFO: renamed from: a */
    d mo6779a(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> map);

    /* JADX INFO: renamed from: a */
    String mo6780a(String str);

    /* JADX INFO: renamed from: a */
    void mo6781a(f<? super T> fVar);

    /* JADX INFO: renamed from: a */
    void mo6782a(g<? super T> gVar);

    /* JADX INFO: renamed from: a */
    void mo6783a(String str, String str2);

    /* JADX INFO: renamed from: a */
    void mo6784a(String str, byte[] bArr);

    /* JADX INFO: renamed from: a */
    void mo6785a(byte[] bArr);

    /* JADX INFO: renamed from: a */
    byte[] mo6786a();

    /* JADX INFO: renamed from: a */
    byte[] mo6787a(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: b */
    h mo6788b();

    /* JADX INFO: renamed from: b */
    void mo6789b(byte[] bArr);

    /* JADX INFO: renamed from: b */
    void mo6790b(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: b */
    byte[] mo6791b(String str);

    /* JADX INFO: renamed from: c */
    Map<String, String> mo6792c(byte[] bArr);

    /* JADX INFO: renamed from: c */
    void mo6793c();

    /* JADX INFO: renamed from: d */
    T mo6794d(byte[] bArr);
}
