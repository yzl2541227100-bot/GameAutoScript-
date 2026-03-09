package com.anythink.expressad.exoplayer.p105j.p106a;

import android.util.SparseArray;
import com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1719b;
import com.anythink.expressad.exoplayer.p107k.C1741x;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p285z2.sa0;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1677h {

    /* JADX INFO: renamed from: a */
    public static final String f9332a = "cached_content_index.exi";

    /* JADX INFO: renamed from: b */
    private static final int f9333b = 2;

    /* JADX INFO: renamed from: c */
    private static final int f9334c = 1;

    /* JADX INFO: renamed from: d */
    private final HashMap<String, C1676g> f9335d;

    /* JADX INFO: renamed from: e */
    private final SparseArray<String> f9336e;

    /* JADX INFO: renamed from: f */
    private final C1719b f9337f;

    /* JADX INFO: renamed from: g */
    private final Cipher f9338g;

    /* JADX INFO: renamed from: h */
    private final SecretKeySpec f9339h;

    /* JADX INFO: renamed from: i */
    private final boolean f9340i;

    /* JADX INFO: renamed from: j */
    private boolean f9341j;

    /* JADX INFO: renamed from: k */
    private C1741x f9342k;

    private C1677h(File file) {
        this(file, null);
    }

    private C1677h(File file, byte[] bArr) {
        this(file, bArr, bArr != null);
    }

    public C1677h(File file, byte[] bArr, boolean z) {
        this.f9340i = z;
        if (bArr != null) {
            C1711a.m8010a(bArr.length == 16);
            try {
                this.f9338g = m7779h();
                this.f9339h = new SecretKeySpec(bArr, sa0.AES);
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            C1711a.m8012b(!z);
            this.f9338g = null;
            this.f9339h = null;
        }
        this.f9335d = new HashMap<>();
        this.f9336e = new SparseArray<>();
        this.f9337f = new C1719b(new File(file, f9332a));
    }

    /* JADX INFO: renamed from: a */
    private static int m7774a(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private void m7775a(C1676g c1676g) {
        this.f9335d.put(c1676g.f9328b, c1676g);
        this.f9336e.put(c1676g.f9327a, c1676g.f9328b);
    }

    /* JADX INFO: renamed from: f */
    private C1676g m7776f(String str) {
        SparseArray<String> sparseArray = this.f9336e;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C1676g c1676g = new C1676g(iKeyAt, str);
        m7775a(c1676g);
        this.f9341j = true;
        return c1676g;
    }

    /* JADX INFO: renamed from: f */
    private boolean m7777f() throws Throwable {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(this.f9337f.m8138c());
            dataInputStream = new DataInputStream(bufferedInputStream);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i = dataInputStream.readInt();
            if (i >= 0 && i <= 2) {
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (this.f9338g == null) {
                        C1717af.m8075a((Closeable) dataInputStream);
                        return false;
                    }
                    byte[] bArr = new byte[16];
                    dataInputStream.readFully(bArr);
                    try {
                        this.f9338g.init(2, this.f9339h, new IvParameterSpec(bArr));
                        dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f9338g));
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    }
                } else if (this.f9340i) {
                    this.f9341j = true;
                }
                int i2 = dataInputStream.readInt();
                int iM7761a = 0;
                for (int i3 = 0; i3 < i2; i3++) {
                    C1676g c1676gM7760a = C1676g.m7760a(i, dataInputStream);
                    m7775a(c1676gM7760a);
                    iM7761a += c1676gM7760a.m7761a(i);
                }
                int i4 = dataInputStream.readInt();
                boolean z = dataInputStream.read() == -1;
                if (i4 == iM7761a && z) {
                    C1717af.m8075a((Closeable) dataInputStream);
                    return true;
                }
                C1717af.m8075a((Closeable) dataInputStream);
                return false;
            }
            C1717af.m8075a((Closeable) dataInputStream);
            return false;
        } catch (IOException unused2) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                C1717af.m8075a((Closeable) dataInputStream2);
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                C1717af.m8075a((Closeable) dataInputStream2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m7778g() throws Throwable {
        DataOutputStream dataOutputStream = null;
        try {
            try {
                OutputStream outputStreamM8137b = this.f9337f.m8137b();
                C1741x c1741x = this.f9342k;
                if (c1741x == null) {
                    this.f9342k = new C1741x(outputStreamM8137b);
                } else {
                    c1741x.m8307a(outputStreamM8137b);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.f9342k);
                try {
                    dataOutputStream2.writeInt(2);
                    int iM7761a = 0;
                    dataOutputStream2.writeInt(this.f9340i ? 1 : 0);
                    if (this.f9340i) {
                        byte[] bArr = new byte[16];
                        new Random().nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            this.f9338g.init(1, this.f9339h, new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f9342k, this.f9338g));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(this.f9335d.size());
                    for (C1676g c1676g : this.f9335d.values()) {
                        c1676g.m7766a(dataOutputStream2);
                        iM7761a += c1676g.m7761a(2);
                    }
                    dataOutputStream2.writeInt(iM7761a);
                    this.f9337f.m8136a(dataOutputStream2);
                    C1717af.m8075a((Closeable) null);
                } catch (IOException e3) {
                    e = e3;
                    dataOutputStream = dataOutputStream2;
                    throw new InterfaceC1670a.a(e);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    C1717af.m8075a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: h */
    private static Cipher m7779h() {
        if (C1717af.f9627a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    /* JADX INFO: renamed from: a */
    public final C1676g m7780a(String str) {
        C1676g c1676g = this.f9335d.get(str);
        if (c1676g != null) {
            return c1676g;
        }
        SparseArray<String> sparseArray = this.f9336e;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C1676g c1676g2 = new C1676g(iKeyAt, str);
        m7775a(c1676g2);
        this.f9341j = true;
        return c1676g2;
    }

    /* JADX INFO: renamed from: a */
    public final String m7781a(int i) {
        return this.f9336e.get(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m7782a() {
        C1711a.m8012b(!this.f9341j);
        if (m7777f()) {
            return;
        }
        this.f9337f.m8135a();
        this.f9335d.clear();
        this.f9336e.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m7783a(String str, C1680k c1680k) {
        if (m7780a(str).m7769a(c1680k)) {
            this.f9341j = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1676g m7784b(String str) {
        return this.f9335d.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m7785b() throws Throwable {
        if (!this.f9341j) {
            return;
        }
        DataOutputStream dataOutputStream = null;
        try {
            try {
                OutputStream outputStreamM8137b = this.f9337f.m8137b();
                C1741x c1741x = this.f9342k;
                if (c1741x == null) {
                    this.f9342k = new C1741x(outputStreamM8137b);
                } else {
                    c1741x.m8307a(outputStreamM8137b);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.f9342k);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(this.f9340i ? 1 : 0);
                    if (this.f9340i) {
                        byte[] bArr = new byte[16];
                        new Random().nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            this.f9338g.init(1, this.f9339h, new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f9342k, this.f9338g));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(this.f9335d.size());
                    int iM7761a = 0;
                    for (C1676g c1676g : this.f9335d.values()) {
                        c1676g.m7766a(dataOutputStream2);
                        iM7761a += c1676g.m7761a(2);
                    }
                    dataOutputStream2.writeInt(iM7761a);
                    this.f9337f.m8136a(dataOutputStream2);
                    C1717af.m8075a((Closeable) null);
                    this.f9341j = false;
                } catch (IOException e3) {
                    e = e3;
                    dataOutputStream = dataOutputStream2;
                    throw new InterfaceC1670a.a(e);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    C1717af.m8075a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m7786c(String str) {
        return m7780a(str).f9327a;
    }

    /* JADX INFO: renamed from: c */
    public final Collection<C1676g> m7787c() {
        return this.f9335d.values();
    }

    /* JADX INFO: renamed from: d */
    public final void m7788d() {
        int size = this.f9335d.size();
        String[] strArr = new String[size];
        this.f9335d.keySet().toArray(strArr);
        for (int i = 0; i < size; i++) {
            m7789d(strArr[i]);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7789d(String str) {
        C1676g c1676g = this.f9335d.get(str);
        if (c1676g == null || !c1676g.m7773d() || c1676g.m7771b()) {
            return;
        }
        this.f9335d.remove(str);
        this.f9336e.remove(c1676g.f9327a);
        this.f9341j = true;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC1678i m7790e(String str) {
        C1676g c1676gM7784b = m7784b(str);
        return c1676gM7784b != null ? c1676gM7784b.m7763a() : C1681l.f9349b;
    }

    /* JADX INFO: renamed from: e */
    public final Set<String> m7791e() {
        return this.f9335d.keySet();
    }
}
