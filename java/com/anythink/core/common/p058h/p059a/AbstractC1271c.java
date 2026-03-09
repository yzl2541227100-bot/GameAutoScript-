package com.anythink.core.common.p058h.p059a;

import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p058h.p059a.C1272d.AnonymousClass1;
import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import com.anythink.core.common.p066o.p068b.C1335b;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.a.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1271c {

    /* JADX INFO: renamed from: d */
    public static final int f4606d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f4607e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f4608f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f4609g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f4610h = 4;

    /* JADX INFO: renamed from: a */
    private final int f4611a = 0;

    /* JADX INFO: renamed from: i */
    public int f4612i;

    /* JADX INFO: renamed from: j */
    public String f4613j;

    /* JADX INFO: renamed from: com.anythink.core.common.h.a.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3660a(Object obj);

        /* JADX INFO: renamed from: a */
        void mo3661a(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3655a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: a */
    public final void m3656a(int i, String str) {
        this.f4612i = i;
        this.f4613j = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m3657a(a aVar) {
        C1335b.m3998a().m4004a((AbstractRunnableC1337d) C1272d.m3663a().new AnonymousClass1(this, aVar), 3);
    }

    /* JADX INFO: renamed from: a */
    public void mo3648a(String str, String str2, String str3, int i) {
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo3650c();

    /* JADX INFO: renamed from: d */
    public abstract int mo3651d();

    /* JADX INFO: renamed from: e */
    public abstract byte[] mo3652e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo3653f();

    /* JADX INFO: renamed from: g */
    public int mo3654g() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m3658h() {
        return C1275c.m3678a(mo3654g());
    }

    /* JADX INFO: renamed from: i */
    public final JSONObject m3659i() {
        return C1275c.m3683b(mo3654g());
    }
}
