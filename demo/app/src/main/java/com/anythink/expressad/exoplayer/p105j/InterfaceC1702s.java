package com.anythink.expressad.exoplayer.p105j;

import android.text.TextUtils;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1738u;
import com.tramini.plugin.p261a.p267f.C3341a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.s */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1702s extends InterfaceC1691h {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC1738u<String> f9485c = new InterfaceC1738u<String>() { // from class: com.anythink.expressad.exoplayer.j.s.1
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
        private static boolean a2(String str) {
            String strM8110d = C1717af.m8110d(str);
            if (TextUtils.isEmpty(strM8110d)) {
                return false;
            }
            return ((strM8110d.contains("text") && !strM8110d.contains(C1732o.f9707O)) || strM8110d.contains(C3341a.f18138b) || strM8110d.contains("xml")) ? false : true;
        }

        @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1738u
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean mo7893a(String str) {
            String strM8110d = C1717af.m8110d(str);
            if (TextUtils.isEmpty(strM8110d)) {
                return false;
            }
            return ((strM8110d.contains("text") && !strM8110d.contains(C1732o.f9707O)) || strM8110d.contains(C3341a.f18138b) || strM8110d.contains("xml")) ? false : true;
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.s$a */
    public static abstract class a implements b {

        /* JADX INFO: renamed from: a */
        private final f f9486a = new f();

        /* JADX INFO: renamed from: a */
        public abstract InterfaceC1702s mo7892a(f fVar);

        @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s.b
        @Deprecated
        /* JADX INFO: renamed from: a */
        public final void mo7894a(String str) {
            this.f9486a.m7902a(str);
        }

        @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s.b
        @Deprecated
        /* JADX INFO: renamed from: a */
        public final void mo7895a(String str, String str2) {
            this.f9486a.m7903a(str, str2);
        }

        @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s.b, com.anythink.expressad.exoplayer.p105j.InterfaceC1691h.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1702s mo7851a() {
            return mo7892a(this.f9486a);
        }

        @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s.b
        /* JADX INFO: renamed from: c */
        public final f mo7897c() {
            return this.f9486a;
        }

        @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1702s.b
        @Deprecated
        /* JADX INFO: renamed from: d */
        public final void mo7898d() {
            this.f9486a.m7901a();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.s$b */
    public interface b extends InterfaceC1691h.a {
        @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h.a
        /* JADX INFO: renamed from: a */
        /* synthetic */ InterfaceC1691h mo7851a();

        @Deprecated
        /* JADX INFO: renamed from: a */
        void mo7894a(String str);

        @Deprecated
        /* JADX INFO: renamed from: a */
        void mo7895a(String str, String str2);

        /* JADX INFO: renamed from: b */
        InterfaceC1702s mo7851a();

        /* JADX INFO: renamed from: c */
        f mo7897c();

        @Deprecated
        /* JADX INFO: renamed from: d */
        void mo7898d();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.s$c */
    public static class c extends IOException {

        /* JADX INFO: renamed from: a */
        public static final int f9487a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f9488b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f9489c = 3;

        /* JADX INFO: renamed from: d */
        public final int f9490d;

        /* JADX INFO: renamed from: e */
        public final C1694k f9491e;

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.s$c$a */
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private c(C1694k c1694k, int i) {
            this.f9491e = c1694k;
            this.f9490d = i;
        }

        public c(IOException iOException, C1694k c1694k, int i) {
            super(iOException);
            this.f9491e = c1694k;
            this.f9490d = i;
        }

        public c(String str, C1694k c1694k) {
            super(str);
            this.f9491e = c1694k;
            this.f9490d = 1;
        }

        public c(String str, IOException iOException, C1694k c1694k) {
            super(str, iOException);
            this.f9491e = c1694k;
            this.f9490d = 1;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.s$d */
    public static final class d extends c {

        /* JADX INFO: renamed from: f */
        public final String f9492f;

        public d(String str, C1694k c1694k) {
            super("Invalid content type: ".concat(String.valueOf(str)), c1694k);
            this.f9492f = str;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.s$e */
    public static final class e extends c {

        /* JADX INFO: renamed from: f */
        public final int f9493f;

        /* JADX INFO: renamed from: g */
        public final Map<String, List<String>> f9494g;

        public e(int i, Map<String, List<String>> map, C1694k c1694k) {
            super("Response code: ".concat(String.valueOf(i)), c1694k);
            this.f9493f = i;
            this.f9494g = map;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.s$f */
    public static final class f {

        /* JADX INFO: renamed from: a */
        private final Map<String, String> f9495a = new HashMap();

        /* JADX INFO: renamed from: b */
        private Map<String, String> f9496b;

        /* JADX INFO: renamed from: a */
        private synchronized void m7899a(Map<String, String> map) {
            this.f9496b = null;
            this.f9495a.putAll(map);
        }

        /* JADX INFO: renamed from: b */
        private synchronized void m7900b(Map<String, String> map) {
            this.f9496b = null;
            this.f9495a.clear();
            this.f9495a.putAll(map);
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m7901a() {
            this.f9496b = null;
            this.f9495a.clear();
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m7902a(String str) {
            this.f9496b = null;
            this.f9495a.remove(str);
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m7903a(String str, String str2) {
            this.f9496b = null;
            this.f9495a.put(str, str2);
        }

        /* JADX INFO: renamed from: b */
        public final synchronized Map<String, String> m7904b() {
            if (this.f9496b == null) {
                this.f9496b = Collections.unmodifiableMap(new HashMap(this.f9495a));
            }
            return this.f9496b;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    int mo7741a(byte[] bArr, int i, int i2);

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    long mo7742a(C1694k c1694k);

    /* JADX INFO: renamed from: a */
    void mo7887a(String str);

    /* JADX INFO: renamed from: a */
    void mo7888a(String str, String str2);

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    void mo7744b();

    /* JADX INFO: renamed from: c */
    Map<String, List<String>> mo7889c();

    /* JADX INFO: renamed from: d */
    void mo7890d();
}
