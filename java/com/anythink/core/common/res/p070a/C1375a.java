package com.anythink.core.common.res.p070a;

import android.text.TextUtils;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1380d;
import com.anythink.core.common.res.image.AbstractC1383b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.res.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1375a extends AbstractC1383b {

    /* JADX INFO: renamed from: a */
    public final String f5513a;

    /* JADX INFO: renamed from: b */
    public C1376b f5514b;

    /* JADX INFO: renamed from: j */
    public List<a> f5515j;

    /* JADX INFO: renamed from: k */
    public b f5516k;

    /* JADX INFO: renamed from: l */
    public int f5517l;

    /* JADX INFO: renamed from: m */
    private final int f5518m;

    /* JADX INFO: renamed from: n */
    private final int f5519n;

    /* JADX INFO: renamed from: o */
    private int f5520o;

    /* JADX INFO: renamed from: p */
    private int f5521p;

    /* JADX INFO: renamed from: q */
    private long f5522q;

    /* JADX INFO: renamed from: r */
    private String f5523r;

    /* JADX INFO: renamed from: s */
    private boolean f5524s;

    /* JADX INFO: renamed from: com.anythink.core.common.res.a.a$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract void mo223a(String str, String str2);

        /* JADX INFO: renamed from: a */
        public abstract boolean mo224a(int i, long j, long j2);
    }

    /* JADX INFO: renamed from: com.anythink.core.common.res.a.a$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract void mo225a(long j, long j2, long j3, long j4, long j5);

        /* JADX INFO: renamed from: a */
        public abstract void mo226a(String str, String str2, long j, long j2, long j3, long j4);
    }

    public C1375a(String str) {
        super(str);
        this.f5513a = C1375a.class.getSimpleName();
        this.f5518m = 0;
        this.f5519n = 1;
        this.f5517l = -1;
        this.f5515j = new ArrayList();
        this.f5514b = new C1376b();
        this.f5521p = 0;
        this.f5522q = 0L;
        this.f5524s = false;
        this.f5520o = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m4464a(int i) {
        this.f5520o = i;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m4465a(int i, long j) {
        if (this.f5517l != i) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5584c);
            sb.append(" notifyDownloadProcess:");
            sb.append(i);
            this.f5517l = i;
        }
        Iterator<a> it = this.f5515j.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().mo224a(i, j, this.f5590i)) {
                z = i != 100;
                it.remove();
            }
        }
        C1160l.m1996a().m2003a(this.f5584c, this.f5523r, this.f5590i, j, i, z);
    }

    /* JADX INFO: renamed from: a */
    private void m4466a(b bVar) {
        this.f5516k = bVar;
    }

    /* JADX INFO: renamed from: b */
    private void m4467b(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5584c);
        sb.append(" notifyDownloadFinish: downloadRate:");
        sb.append(i);
        if (i == 100) {
            C1160l.m1996a().m2003a(this.f5584c, this.f5523r, this.f5590i, j, i, true);
            b bVar = this.f5516k;
            if (bVar != null) {
                bVar.mo225a(this.f5590i, this.f5586e, this.f5588g, this.f5587f, this.f5589h);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m4468b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5584c);
        sb.append(" notifyLoadFailed: errorCode:");
        sb.append(str);
        sb.append(",errorMsg:");
        sb.append(str2);
        this.f5520o = 0;
        Iterator<a> it = this.f5515j.iterator();
        while (it.hasNext()) {
            it.next().mo223a(str, str2);
        }
        m4473j();
        b bVar = this.f5516k;
        if (bVar != null) {
            bVar.mo226a(str, str2, this.f5590i, this.f5586e, this.f5587f, this.f5589h);
        }
    }

    /* JADX INFO: renamed from: b */
    private synchronized boolean m4469b(int i) {
        if (this.f5524s) {
            return true;
        }
        C1376b c1376b = this.f5514b;
        if (c1376b.f5527c == 2) {
            if (i >= c1376b.f5525a) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private int m4470g() {
        return this.f5520o;
    }

    /* JADX INFO: renamed from: h */
    private void m4471h() {
        String strM4524a = C1380d.m4520a(C1175n.m2059a().m2148f()).m4524a(4);
        if (TextUtils.isEmpty(strM4524a)) {
            m4468b("", "without saveDirectory");
            return;
        }
        File file = new File(strM4524a);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f5523r = C1380d.m4520a(C1175n.m2059a().m2148f()).m4532c(4, C1343g.m4123a(this.f5584c));
        File file2 = new File(this.f5523r);
        if (file2.exists()) {
            this.f5522q = file2.length();
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m4472i() {
        int i = this.f5521p;
        if (i != 100) {
            return this.f5520o == 0 && i < 100;
        }
        m4465a(i, this.f5522q);
        m4467b(this.f5521p, this.f5522q);
        return false;
    }

    /* JADX INFO: renamed from: j */
    private synchronized void m4473j() {
        this.f5515j.clear();
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final Map<String, String> mo210a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final void mo211a(AbstractRunnableC1337d abstractRunnableC1337d) {
        C1335b.m3998a().m4004a(abstractRunnableC1337d, 4);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4474a(a aVar) {
        if (!this.f5515j.contains(aVar)) {
            this.f5515j.add(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m4475a(C1376b c1376b) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5584c);
        sb.append(" setVideoUrlLoaderConfig: mReadyRate:");
        sb.append(c1376b.f5525a);
        sb.append(",mVideoCtnType:");
        sb.append(c1376b.f5527c);
        C1376b c1376b2 = this.f5514b;
        int i = c1376b2.f5525a;
        int i2 = c1376b.f5525a;
        if (i < i2) {
            c1376b2.f5525a = i2;
        }
        if (c1376b2.f5527c != 1) {
            c1376b2.f5527c = c1376b.f5527c;
        }
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final void mo212a(String str, String str2) {
        m4468b(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final boolean mo213a(InputStream inputStream) {
        ?? r5;
        FileOutputStream fileOutputStream;
        boolean z;
        int i = 0;
        if (TextUtils.isEmpty(this.f5523r)) {
            z = false;
        } else {
            ?? r2 = 0;
            try {
                r5 = this.f5522q;
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (r5 > 0) {
                    inputStream.skip(r5);
                    fileOutputStream = new FileOutputStream(this.f5523r, true);
                    long j = this.f5522q;
                    int i2 = (int) (((j * 1.0d) / this.f5590i) * 100.0d);
                    this.f5521p = i2;
                    m4465a(i2, j);
                } else {
                    fileOutputStream = new FileOutputStream(this.f5523r);
                    this.f5521p = 0;
                }
                r2 = fileOutputStream;
                r5 = 2048;
                byte[] bArr = new byte[2048];
                while (true) {
                    int i3 = inputStream.read(bArr);
                    if (i3 == -1 || !m4469b(this.f5521p)) {
                        break;
                    }
                    r2.write(bArr, i, i3);
                    long j2 = this.f5522q + ((long) i3);
                    this.f5522q = j2;
                    int i4 = (int) (((j2 * 1.0d) / this.f5590i) * 100.0d);
                    this.f5521p = i4;
                    m4465a(i4, j2);
                    i = 0;
                }
                r2.close();
                try {
                    r2.close();
                } catch (Throwable unused) {
                }
                z = true;
            } catch (Throwable th2) {
                th = th2;
                r2 = r5;
                try {
                    th.printStackTrace();
                    if (r2 != 0) {
                        try {
                            r2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    z = false;
                } finally {
                }
            }
        }
        m4467b(this.f5521p, this.f5522q);
        return z;
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: b */
    public final void mo214b() {
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: c */
    public final void mo215c() {
        this.f5520o = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m4476e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5584c);
        sb.append(" startRequest: canStartLoader():");
        sb.append(m4472i());
        if (m4472i()) {
            m4471h();
            this.f5520o = 1;
            m4539d();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4477f() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5584c);
        sb.append(" startRequest: resumeRequest():");
        sb.append(m4472i());
        this.f5524s = true;
        if (m4472i()) {
            m4471h();
            this.f5520o = 1;
            m4539d();
        }
    }
}
