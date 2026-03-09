package com.octopus.p222ad.internal.p226b;

import android.text.TextUtils;
import com.octopus.p222ad.internal.p226b.p227a.C3084b;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3097e extends C3104l {

    /* JADX INFO: renamed from: a */
    private final C3100h f17051a;

    /* JADX INFO: renamed from: b */
    private final C3084b f17052b;

    /* JADX INFO: renamed from: c */
    private InterfaceC3090b f17053c;

    public C3097e(C3100h c3100h, C3084b c3084b) {
        super(c3100h, c3084b);
        this.f17052b = c3084b;
        this.f17051a = c3100h;
    }

    /* JADX INFO: renamed from: a */
    private void m14280a(OutputStream outputStream, long j) throws C3105m, IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int iM14344a = m14344a(bArr, j, 8192);
            if (iM14344a == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, iM14344a);
                j += (long) iM14344a;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m14281a(C3096d c3096d) throws C3105m {
        int iMo14316a = this.f17051a.mo14316a();
        return ((iMo14316a > 0) && c3096d.f17050c && ((float) c3096d.f17049b) > ((float) this.f17052b.mo14246a()) + (((float) iMo14316a) * 0.2f)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private String m14282b(C3096d c3096d) throws C3105m, IOException {
        String strM14320c = this.f17051a.m14320c();
        boolean z = !TextUtils.isEmpty(strM14320c);
        int iMo14246a = this.f17052b.mo14251d() ? this.f17052b.mo14246a() : this.f17051a.mo14316a();
        boolean z3 = iMo14246a >= 0;
        boolean z4 = c3096d.f17050c;
        long j = iMo14246a;
        if (z4) {
            j -= c3096d.f17049b;
        }
        boolean z5 = z3 && z4;
        StringBuilder sb = new StringBuilder();
        sb.append(c3096d.f17050c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z3 ? String.format("Content-Length: %d\n", Long.valueOf(j)) : "");
        sb.append(z5 ? String.format("Content-Range: bytes %d-%d/%d\n", Long.valueOf(c3096d.f17049b), Integer.valueOf(iMo14246a - 1), Integer.valueOf(iMo14246a)) : "");
        sb.append(z ? String.format("Content-Type: %s\n", strM14320c) : "");
        sb.append("\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private void m14283b(OutputStream outputStream, long j) throws C3105m, IOException {
        C3100h c3100h = new C3100h(this.f17051a);
        try {
            c3100h.mo14318a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int iMo14317a = c3100h.mo14317a(bArr);
                if (iMo14317a == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, iMo14317a);
            }
        } finally {
            c3100h.mo14319b();
        }
    }

    @Override // com.octopus.p222ad.internal.p226b.C3104l
    /* JADX INFO: renamed from: a */
    public void mo14284a(int i) {
        InterfaceC3090b interfaceC3090b = this.f17053c;
        if (interfaceC3090b != null) {
            interfaceC3090b.mo14269a(this.f17052b.f17034a, this.f17051a.m14321d(), i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14285a(InterfaceC3090b interfaceC3090b) {
        this.f17053c = interfaceC3090b;
    }

    /* JADX INFO: renamed from: a */
    public void m14286a(C3096d c3096d, Socket socket) throws C3105m, IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(m14282b(c3096d).getBytes("UTF-8"));
        long j = c3096d.f17049b;
        if (m14281a(c3096d)) {
            m14280a(bufferedOutputStream, j);
        } else {
            m14283b(bufferedOutputStream, j);
        }
    }
}
