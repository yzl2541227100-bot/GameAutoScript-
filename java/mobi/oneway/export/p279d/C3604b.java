package mobi.oneway.export.p279d;

import java.io.File;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.d.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3604b {

    /* JADX INFO: renamed from: a */
    private C3608f f19663a;

    /* JADX INFO: renamed from: b */
    private int f19664b;

    /* JADX INFO: renamed from: c */
    private byte[] f19665c;

    /* JADX INFO: renamed from: d */
    private Map<String, List<String>> f19666d;

    /* JADX INFO: renamed from: e */
    private Throwable f19667e;

    /* JADX INFO: renamed from: f */
    private long f19668f;

    /* JADX INFO: renamed from: g */
    private File f19669g;

    public C3604b(C3608f c3608f) {
        m16736a(c3608f);
    }

    /* JADX INFO: renamed from: a */
    public String m16729a() {
        return m16744h().m16784f();
    }

    /* JADX INFO: renamed from: a */
    public String m16730a(String str) {
        List<String> list;
        Map<String, List<String>> map = this.f19666d;
        if (map == null || (list = map.get(str)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: a */
    public C3604b m16731a(Throwable th) {
        this.f19667e = th;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m16732a(int i) {
        this.f19664b = i;
    }

    /* JADX INFO: renamed from: a */
    public void m16733a(long j) {
        this.f19668f = j;
    }

    /* JADX INFO: renamed from: a */
    public void m16734a(File file) {
        this.f19669g = file;
    }

    /* JADX INFO: renamed from: a */
    public void m16735a(Map<String, List<String>> map) {
        this.f19666d = map;
    }

    /* JADX INFO: renamed from: a */
    public void m16736a(C3608f c3608f) {
        this.f19663a = c3608f;
    }

    /* JADX INFO: renamed from: a */
    public void m16737a(byte[] bArr) {
        this.f19665c = bArr;
    }

    /* JADX INFO: renamed from: b */
    public boolean m16738b() {
        return this.f19667e == null;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m16739c() {
        return this.f19665c;
    }

    /* JADX INFO: renamed from: d */
    public String m16740d() {
        if (this.f19665c == null) {
            return null;
        }
        return new String(this.f19665c);
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m16741e() {
        return new JSONObject(m16740d());
    }

    /* JADX INFO: renamed from: f */
    public long m16742f() {
        if (this.f19665c != null) {
            return r0.length;
        }
        File file = this.f19669g;
        if (file != null) {
            return file.length();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: g */
    public File m16743g() {
        return this.f19669g;
    }

    /* JADX INFO: renamed from: h */
    public C3608f m16744h() {
        return this.f19663a;
    }

    /* JADX INFO: renamed from: i */
    public Map<String, List<String>> m16745i() {
        return this.f19666d;
    }

    /* JADX INFO: renamed from: j */
    public long m16746j() {
        return this.f19668f;
    }

    /* JADX INFO: renamed from: k */
    public boolean m16747k() {
        C3608f c3608f = this.f19663a;
        return c3608f != null && c3608f.m16783e();
    }

    /* JADX INFO: renamed from: l */
    public int m16748l() {
        return this.f19664b;
    }

    /* JADX INFO: renamed from: m */
    public Throwable m16749m() {
        return this.f19667e;
    }
}
