package com.anythink.expressad.exoplayer.p105j;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1697n implements InterfaceC1691h {

    /* JADX INFO: renamed from: a */
    private static final String f9434a = "DefaultDataSource";

    /* JADX INFO: renamed from: b */
    private static final String f9435b = "asset";

    /* JADX INFO: renamed from: c */
    private static final String f9436c = "content";

    /* JADX INFO: renamed from: d */
    private static final String f9437d = "rtmp";

    /* JADX INFO: renamed from: e */
    private static final String f9438e = "rawresource";

    /* JADX INFO: renamed from: f */
    private final Context f9439f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC1684aa<? super InterfaceC1691h> f9440g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC1691h f9441h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1691h f9442i;

    /* JADX INFO: renamed from: j */
    private InterfaceC1691h f9443j;

    /* JADX INFO: renamed from: k */
    private InterfaceC1691h f9444k;

    /* JADX INFO: renamed from: l */
    private InterfaceC1691h f9445l;

    /* JADX INFO: renamed from: m */
    private InterfaceC1691h f9446m;

    /* JADX INFO: renamed from: n */
    private InterfaceC1691h f9447n;

    /* JADX INFO: renamed from: o */
    private InterfaceC1691h f9448o;

    public C1697n(Context context, InterfaceC1684aa<? super InterfaceC1691h> interfaceC1684aa, InterfaceC1691h interfaceC1691h) {
        this.f9439f = context.getApplicationContext();
        this.f9440g = interfaceC1684aa;
        this.f9441h = (InterfaceC1691h) C1711a.m8005a(interfaceC1691h);
    }

    private C1697n(Context context, InterfaceC1684aa<? super InterfaceC1691h> interfaceC1684aa, String str, boolean z) {
        this(context, interfaceC1684aa, str, z, (byte) 0);
    }

    private C1697n(Context context, InterfaceC1684aa<? super InterfaceC1691h> interfaceC1684aa, String str, boolean z, byte b) {
        this(context, interfaceC1684aa, new C1699p(str, null, interfaceC1684aa, 8000, 8000, z, null));
    }

    /* JADX INFO: renamed from: c */
    private InterfaceC1691h m7868c() {
        if (this.f9442i == null) {
            this.f9442i = new C1701r(this.f9440g);
        }
        return this.f9442i;
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC1691h m7869d() {
        if (this.f9443j == null) {
            this.f9443j = new C1686c(this.f9439f, this.f9440g);
        }
        return this.f9443j;
    }

    /* JADX INFO: renamed from: e */
    private InterfaceC1691h m7870e() {
        if (this.f9444k == null) {
            this.f9444k = new C1688e(this.f9439f, this.f9440g);
        }
        return this.f9444k;
    }

    /* JADX INFO: renamed from: f */
    private InterfaceC1691h m7871f() {
        if (this.f9445l == null) {
            try {
                this.f9445l = (InterfaceC1691h) Class.forName("com.anythink.expressad.exoplayer.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(f9434a, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f9445l == null) {
                this.f9445l = this.f9441h;
            }
        }
        return this.f9445l;
    }

    /* JADX INFO: renamed from: g */
    private InterfaceC1691h m7872g() {
        if (this.f9446m == null) {
            this.f9446m = new C1689f();
        }
        return this.f9446m;
    }

    /* JADX INFO: renamed from: h */
    private InterfaceC1691h m7873h() {
        if (this.f9447n == null) {
            this.f9447n = new C1708y(this.f9439f, this.f9440g);
        }
        return this.f9447n;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) {
        return this.f9448o.mo7741a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo7742a(com.anythink.expressad.exoplayer.p105j.C1694k r4) {
        /*
            r3 = this;
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9448o
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.anythink.expressad.exoplayer.p107k.C1711a.m8012b(r0)
            android.net.Uri r0 = r4.f9395c
            java.lang.String r0 = r0.getScheme()
            android.net.Uri r1 = r4.f9395c
            boolean r1 = com.anythink.expressad.exoplayer.p107k.C1717af.m8083a(r1)
            if (r1 == 0) goto L37
            android.net.Uri r0 = r4.f9395c
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = "/android_asset/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L27
            goto L3f
        L27:
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9442i
            if (r0 != 0) goto L34
            com.anythink.expressad.exoplayer.j.r r0 = new com.anythink.expressad.exoplayer.j.r
            com.anythink.expressad.exoplayer.j.aa<? super com.anythink.expressad.exoplayer.j.h> r1 = r3.f9440g
            r0.<init>(r1)
            r3.f9442i = r0
        L34:
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9442i
            goto L43
        L37:
            java.lang.String r1 = "asset"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L46
        L3f:
            com.anythink.expressad.exoplayer.j.h r0 = r3.m7869d()
        L43:
            r3.f9448o = r0
            goto La0
        L46:
            java.lang.String r1 = "content"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L60
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9444k
            if (r0 != 0) goto L5d
            com.anythink.expressad.exoplayer.j.e r0 = new com.anythink.expressad.exoplayer.j.e
            android.content.Context r1 = r3.f9439f
            com.anythink.expressad.exoplayer.j.aa<? super com.anythink.expressad.exoplayer.j.h> r2 = r3.f9440g
            r0.<init>(r1, r2)
            r3.f9444k = r0
        L5d:
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9444k
            goto L43
        L60:
            java.lang.String r1 = "rtmp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L6d
            com.anythink.expressad.exoplayer.j.h r0 = r3.m7871f()
            goto L43
        L6d:
            java.lang.String r1 = "data"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L83
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9446m
            if (r0 != 0) goto L80
            com.anythink.expressad.exoplayer.j.f r0 = new com.anythink.expressad.exoplayer.j.f
            r0.<init>()
            r3.f9446m = r0
        L80:
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9446m
            goto L43
        L83:
            java.lang.String r1 = "rawresource"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9d
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9447n
            if (r0 != 0) goto L9a
            com.anythink.expressad.exoplayer.j.y r0 = new com.anythink.expressad.exoplayer.j.y
            android.content.Context r1 = r3.f9439f
            com.anythink.expressad.exoplayer.j.aa<? super com.anythink.expressad.exoplayer.j.h> r2 = r3.f9440g
            r0.<init>(r1, r2)
            r3.f9447n = r0
        L9a:
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9447n
            goto L43
        L9d:
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9441h
            goto L43
        La0:
            com.anythink.expressad.exoplayer.j.h r0 = r3.f9448o
            long r0 = r0.mo7742a(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p105j.C1697n.mo7742a(com.anythink.expressad.exoplayer.j.k):long");
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        InterfaceC1691h interfaceC1691h = this.f9448o;
        if (interfaceC1691h == null) {
            return null;
        }
        return interfaceC1691h.mo7743a();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    public final void mo7744b() {
        InterfaceC1691h interfaceC1691h = this.f9448o;
        if (interfaceC1691h != null) {
            try {
                interfaceC1691h.mo7744b();
            } finally {
                this.f9448o = null;
            }
        }
    }
}
