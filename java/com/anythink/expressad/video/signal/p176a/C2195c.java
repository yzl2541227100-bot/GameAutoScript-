package com.anythink.expressad.video.signal.p176a;

import android.app.Activity;
import android.content.Context;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.out.C1935j;
import com.anythink.expressad.out.C1941p;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.video.signal.InterfaceC2209c;
import com.anythink.expressad.videocommon.p179c.C2333c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C2195c implements InterfaceC2209c {

    /* JADX INFO: renamed from: d */
    public static final String f13904d = "DefaultJSCommon";

    /* JADX INFO: renamed from: n */
    public String f13914n;

    /* JADX INFO: renamed from: o */
    public C2340d f13915o;

    /* JADX INFO: renamed from: p */
    public C2333c f13916p;

    /* JADX INFO: renamed from: q */
    public C1405a f13917q;

    /* JADX INFO: renamed from: e */
    public boolean f13905e = false;

    /* JADX INFO: renamed from: f */
    public boolean f13906f = false;

    /* JADX INFO: renamed from: g */
    public int f13907g = 0;

    /* JADX INFO: renamed from: h */
    public int f13908h = 0;

    /* JADX INFO: renamed from: i */
    public int f13909i = 0;

    /* JADX INFO: renamed from: j */
    public int f13910j = 0;

    /* JADX INFO: renamed from: k */
    public int f13911k = 0;

    /* JADX INFO: renamed from: l */
    public int f13912l = 1;

    /* JADX INFO: renamed from: m */
    public int f13913m = -1;

    /* JADX INFO: renamed from: r */
    public InterfaceC2209c.a f13918r = new a();

    /* JADX INFO: renamed from: s */
    public int f13919s = 2;

    /* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.c$a */
    public static class a implements InterfaceC2209c.a {
        @Override // com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: a */
        public void mo10951a(int i, String str) {
            StringBuilder sb = new StringBuilder("onH5Error,code:");
            sb.append(i);
            sb.append("，msg:");
            sb.append(str);
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public void mo10050a(C1781c c1781c, String str) {
            StringBuilder sb = new StringBuilder("onStartRedirection,campaign:");
            sb.append(c1781c);
            sb.append(",url:");
            sb.append(str);
        }

        @Override // com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: a */
        public void mo10952a(C1781c c1781c, boolean z) {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10051a(C1935j c1935j) {
            new StringBuilder("onShowLoading,campaign:").append(c1935j);
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public void mo10052a(C1935j c1935j, String str) {
            StringBuilder sb = new StringBuilder("onFinishRedirection,campaign:");
            sb.append(c1935j);
            sb.append(",url:");
            sb.append(str);
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final boolean mo10053a() {
            return false;
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public final void mo10054b() {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public final void mo10055b(C1935j c1935j) {
            new StringBuilder("onDismissLoading,campaign:").append(c1935j);
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public void mo10056b(C1935j c1935j, String str) {
            StringBuilder sb = new StringBuilder("onFinishRedirection,campaign:");
            sb.append(c1935j);
            sb.append(",url:");
            sb.append(str);
        }

        @Override // com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: c */
        public void mo10953c() {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: c */
        public final void mo10058c(C1935j c1935j) {
            new StringBuilder("onDownloadStart,campaign:").append(c1935j);
        }

        @Override // com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: d */
        public void mo10954d() {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: d */
        public final void mo10059d(C1935j c1935j) {
            new StringBuilder("onDownloadFinish,campaign:").append(c1935j);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.c$b */
    public static class b implements InterfaceC2209c.a {

        /* JADX INFO: renamed from: a */
        private InterfaceC2209c f13920a;

        /* JADX INFO: renamed from: b */
        private InterfaceC2209c.a f13921b;

        public b(InterfaceC2209c interfaceC2209c, InterfaceC2209c.a aVar) {
            this.f13920a = interfaceC2209c;
            this.f13921b = aVar;
        }

        @Override // com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: a */
        public final void mo10951a(int i, String str) {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10951a(i, str);
            }
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10050a(C1781c c1781c, String str) {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10050a(c1781c, str);
            }
        }

        @Override // com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: a */
        public final void mo10952a(C1781c c1781c, boolean z) {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10952a(c1781c, z);
            }
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10051a(C1935j c1935j) {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10051a(c1935j);
            }
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10052a(C1935j c1935j, String str) {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10052a(c1935j, str);
            }
            InterfaceC2209c interfaceC2209c = this.f13920a;
            if (interfaceC2209c != null) {
                interfaceC2209c.mo11576j();
            }
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final boolean mo10053a() {
            InterfaceC2209c.a aVar = this.f13921b;
            return aVar != null && aVar.mo10053a();
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public final void mo10054b() {
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public final void mo10055b(C1935j c1935j) {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10055b(c1935j);
            }
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public final void mo10056b(C1935j c1935j, String str) {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10056b(c1935j, str);
            }
            InterfaceC2209c interfaceC2209c = this.f13920a;
            if (interfaceC2209c != null) {
                interfaceC2209c.mo11576j();
            }
        }

        @Override // com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: c */
        public final void mo10953c() {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10953c();
            }
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: c */
        public final void mo10058c(C1935j c1935j) {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10058c(c1935j);
            }
        }

        @Override // com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: d */
        public final void mo10954d() {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10954d();
            }
        }

        @Override // com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: d */
        public final void mo10059d(C1935j c1935j) {
            InterfaceC2209c.a aVar = this.f13921b;
            if (aVar != null) {
                aVar.mo10059d(c1935j);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11549a(C2333c c2333c) {
        this.f13916p = c2333c;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public final void mo11550a(int i) {
        this.f13919s = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public void mo11551a(int i, String str) {
        StringBuilder sb = new StringBuilder("statistics,type:");
        sb.append(i);
        sb.append(",json:");
        sb.append(str);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public void mo11552a(Activity activity) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public void mo11553a(Context context) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public final void mo11554a(InterfaceC2209c.a aVar) {
        new StringBuilder("setTrackingListener:").append(aVar);
        this.f13918r = aVar;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public final void mo11555a(C2340d c2340d) {
        new StringBuilder("setSetting:").append(c2340d);
        this.f13915o = c2340d;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public final void mo11556a(String str) {
        this.f13914n = str;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public final void mo11557a(boolean z) {
        this.f13906f = z;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: a */
    public final boolean mo11558a() {
        return this.f13906f;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: b */
    public final int mo11559b() {
        if (this.f13908h == 0 && this.f13906f) {
            this.f13908h = 1;
        }
        return this.f13908h;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: b */
    public final void mo11560b(int i) {
        this.f13908h = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: b */
    public void mo11561b(String str) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: c */
    public final int mo11562c() {
        if (this.f13907g == 0 && this.f13906f) {
            this.f13907g = 1;
        }
        return this.f13907g;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: c */
    public final void mo11563c(int i) {
        this.f13907g = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2305d
    public void click(int i, String str) {
        StringBuilder sb = new StringBuilder("click:type");
        sb.append(i);
        sb.append(",pt:");
        sb.append(str);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: d */
    public final int mo11564d() {
        if (this.f13909i == 0 && this.f13906f) {
            this.f13909i = 1;
        }
        return this.f13909i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: d */
    public final void mo11565d(int i) {
        this.f13909i = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: e */
    public final int mo11566e() {
        return this.f13910j;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: e */
    public final void mo11567e(int i) {
        this.f13910j = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: f */
    public final int mo11568f() {
        return this.f13911k;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: f */
    public final void mo11569f(int i) {
        this.f13911k = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: g */
    public final void mo11570g(int i) {
        this.f13913m = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: g */
    public final boolean mo11571g() {
        return this.f13905e;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: h */
    public String mo11572h(int i) {
        return MessageFormatter.DELIM_STR;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: h */
    public final void mo11573h() {
        this.f13905e = true;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2305d
    public void handlerH5Exception(int i, String str) {
        StringBuilder sb = new StringBuilder("handlerH5Exception,code=");
        sb.append(i);
        sb.append(",msg:");
        sb.append(str);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: i */
    public String mo11574i() {
        return MessageFormatter.DELIM_STR;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: i */
    public final void mo11575i(int i) {
        this.f13912l = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: j */
    public void mo11576j() {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: k */
    public final void mo11577k() {
        C1405a c1405a = this.f13917q;
        if (c1405a != null) {
            c1405a.m5211a();
            this.f13917q.m5212a((C1941p.c) null);
            this.f13917q.m5213b();
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: l */
    public void mo11578l() {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: m */
    public final int mo11579m() {
        return this.f13913m;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: n */
    public final int mo11580n() {
        new StringBuilder("getAlertDialogRole ").append(this.f13912l);
        return this.f13912l;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2209c
    /* JADX INFO: renamed from: o */
    public String mo11581o() {
        return null;
    }
}
