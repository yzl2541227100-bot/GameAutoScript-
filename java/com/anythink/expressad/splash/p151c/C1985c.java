package com.anythink.expressad.splash.p151c;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p123c.C1814d;
import com.anythink.expressad.foundation.p120g.p123c.EnumC1811a;
import com.anythink.expressad.foundation.p138h.C1882p;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.p086d.C1489c;
import com.anythink.expressad.p086d.p088b.C1487a;
import com.anythink.expressad.splash.p148a.C1978b;
import com.anythink.expressad.splash.p150b.InterfaceC1979a;
import com.anythink.expressad.splash.p150b.InterfaceC1981c;
import com.anythink.expressad.splash.p151c.C1983a;
import com.anythink.expressad.splash.p151c.C1987e;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.InterfaceC2020a;
import com.anythink.expressad.video.dynview.p158a.C2069a;
import com.anythink.expressad.videocommon.p178b.C2320e;
import com.anythink.expressad.videocommon.p178b.C2324i;
import com.anythink.expressad.videocommon.p180d.InterfaceC2336c;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.splash.c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1985c {

    /* JADX INFO: renamed from: c */
    private static String f12517c = "SplashLoadManager";

    /* JADX INFO: renamed from: l */
    private static final int f12518l = 1;

    /* JADX INFO: renamed from: m */
    private static final int f12519m = 2;

    /* JADX INFO: renamed from: n */
    private static final int f12520n = 3;

    /* JADX INFO: renamed from: B */
    private int f12522B;

    /* JADX INFO: renamed from: b */
    public C1781c f12526b;

    /* JADX INFO: renamed from: d */
    private String f12527d;

    /* JADX INFO: renamed from: e */
    private String f12528e;

    /* JADX INFO: renamed from: f */
    private long f12529f;

    /* JADX INFO: renamed from: g */
    private long f12530g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1981c f12531h;

    /* JADX INFO: renamed from: j */
    private ATSplashView f12533j;

    /* JADX INFO: renamed from: k */
    private C1489c f12534k;

    /* JADX INFO: renamed from: o */
    private boolean f12535o;

    /* JADX INFO: renamed from: p */
    private int f12536p;

    /* JADX INFO: renamed from: q */
    private int f12537q;

    /* JADX INFO: renamed from: r */
    private int f12538r;

    /* JADX INFO: renamed from: s */
    private String f12539s;

    /* JADX INFO: renamed from: t */
    private int f12540t;

    /* JADX INFO: renamed from: u */
    private boolean f12541u;

    /* JADX INFO: renamed from: v */
    private volatile boolean f12542v;

    /* JADX INFO: renamed from: w */
    private InterfaceC2336c f12543w;

    /* JADX INFO: renamed from: x */
    private C2324i.d f12544x;

    /* JADX INFO: renamed from: y */
    private String f12545y;

    /* JADX INFO: renamed from: z */
    private int f12546z;

    /* JADX INFO: renamed from: A */
    private String f12521A = "";

    /* JADX INFO: renamed from: C */
    private Handler f12523C = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.c.1
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                int i2 = message.arg1;
                if (obj instanceof C1781c) {
                    C1781c c1781c = (C1781c) obj;
                    C1985c.m10564a(C1985c.this, C2324i.m11867a().m11883c(c1781c.m8862c()), c1781c, i2);
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof C1781c) {
                    C1985c c1985c = C1985c.this;
                    c1985c.m10569b((C1781c) obj2, c1985c.f12540t);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            if (obj3 instanceof String) {
                C1985c c1985c2 = C1985c.this;
                String string = obj3.toString();
                String unused = C1985c.this.f12539s;
                int unused2 = C1985c.this.f12540t;
                c1985c2.m10565a(string);
            }
        }
    };

    /* JADX INFO: renamed from: D */
    private Runnable f12524D = new Runnable() { // from class: com.anythink.expressad.splash.c.c.2
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1985c c1985c = C1985c.this;
            String unused = c1985c.f12539s;
            int unused2 = C1985c.this.f12540t;
            c1985c.m10565a("load timeout");
        }
    };

    /* JADX INFO: renamed from: a */
    public boolean f12525a = false;

    /* JADX INFO: renamed from: i */
    private Context f12532i = C1175n.m2059a().m2148f();

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.c$1 */
    public class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                int i2 = message.arg1;
                if (obj instanceof C1781c) {
                    C1781c c1781c = (C1781c) obj;
                    C1985c.m10564a(C1985c.this, C2324i.m11867a().m11883c(c1781c.m8862c()), c1781c, i2);
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof C1781c) {
                    C1985c c1985c = C1985c.this;
                    c1985c.m10569b((C1781c) obj2, c1985c.f12540t);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            if (obj3 instanceof String) {
                C1985c c1985c2 = C1985c.this;
                String string = obj3.toString();
                String unused = C1985c.this.f12539s;
                int unused2 = C1985c.this.f12540t;
                c1985c2.m10565a(string);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.c$2 */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1985c c1985c = C1985c.this;
            String unused = c1985c.f12539s;
            int unused2 = C1985c.this.f12540t;
            c1985c.m10565a("load timeout");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.c$3 */
    public class AnonymousClass3 implements InterfaceC2020a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f12549a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12550b;

        public AnonymousClass3(C1781c c1781c, int i) {
            c1781c = c1781c;
            i = i;
        }

        @Override // com.anythink.expressad.splash.view.InterfaceC2020a
        /* JADX INFO: renamed from: a */
        public final void mo10605a() {
            if (c1781c.m8886j() && C1985c.this.f12533j != null) {
                C1985c.this.f12533j.setImageReady(true);
                C1985c.m10570b(C1985c.this, c1781c, i);
            }
            C1985c.this.m10569b(c1781c, i);
        }

        @Override // com.anythink.expressad.splash.view.InterfaceC2020a
        /* JADX INFO: renamed from: b */
        public final void mo10606b() {
            if (!c1781c.m8886j() || C1985c.this.f12533j == null) {
                return;
            }
            C1985c.this.f12533j.setImageReady(false);
            C1985c c1985c = C1985c.this;
            String unused = c1985c.f12539s;
            c1985c.m10565a("Image resource load faile");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.c$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f12552a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12553b;

        /* JADX INFO: renamed from: com.anythink.expressad.splash.c.c$4$1 */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ File f12555a;

            public AnonymousClass1(File file) {
                file = file;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1985c c1985c = C1985c.this;
                String str = "file:////" + file.getAbsolutePath();
                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                C1985c.m10564a(c1985c, str, anonymousClass4.f12552a, anonymousClass4.f12553b);
            }
        }

        public AnonymousClass4(C1781c c1781c, int i) {
            this.f12552a = c1781c;
            this.f12553b = i;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            File file;
            File file2;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        file2 = new File(this.f12552a.m8866d());
                        try {
                            if (!file2.exists()) {
                                String strM9407b = C1814d.m9407b(EnumC1811a.ANYTHINK_700_HTML);
                                String strM9771a = C1882p.m9771a(C1890x.m9869a(this.f12552a.m8866d()));
                                if (TextUtils.isEmpty(strM9771a)) {
                                    strM9771a = String.valueOf(System.currentTimeMillis());
                                }
                                file = new File(strM9407b, strM9771a.concat(".html"));
                                try {
                                    if (!file.exists()) {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                        try {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("<script>");
                                            C1487a.m6018a();
                                            sb.append(C1487a.m6022b());
                                            sb.append("</script>");
                                            sb.append(this.f12552a.m8866d());
                                            fileOutputStream2.write(sb.toString().getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception e) {
                                            e = e;
                                            fileOutputStream = fileOutputStream2;
                                            e.printStackTrace();
                                            this.f12552a.m8885j("");
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            file2 = file;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = fileOutputStream2;
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    file2 = file;
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            file = file2;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        file = null;
                    }
                    if (file2.exists() && file2.isFile() && file2.canRead()) {
                        this.f12552a.m8860b(file2.getAbsolutePath());
                        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.expressad.splash.c.c.4.1

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ File f12555a;

                            public AnonymousClass1(File file22) {
                                file = file22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C1985c c1985c = C1985c.this;
                                String str = "file:////" + file.getAbsolutePath();
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                C1985c.m10564a(c1985c, str, anonymousClass4.f12552a, anonymousClass4.f12553b);
                            }
                        });
                    } else {
                        C1985c c1985c = C1985c.this;
                        String unused = c1985c.f12539s;
                        c1985c.m10565a("html file write failed");
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e5) {
                C1985c c1985c2 = C1985c.this;
                String message = e5.getMessage();
                String unused2 = C1985c.this.f12539s;
                c1985c2.m10565a(message);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.c$5 */
    public class AnonymousClass5 implements C2324i.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f12557a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12558b;

        public AnonymousClass5(C1781c c1781c, int i) {
            this.f12557a = c1781c;
            this.f12558b = i;
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5464a(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f12557a;
            messageObtain.arg1 = this.f12558b;
            C1985c.this.f12523C.sendMessage(messageObtain);
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5465a(String str, String str2) {
            C1985c c1985c = C1985c.this;
            String unused = c1985c.f12539s;
            c1985c.m10565a(str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.obj = str;
            C1985c.this.f12523C.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.c$6 */
    public class AnonymousClass6 implements InterfaceC1979a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f12560a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12561b;

        public AnonymousClass6(C1781c c1781c, int i) {
            this.f12560a = c1781c;
            this.f12561b = i;
        }

        @Override // com.anythink.expressad.splash.p150b.InterfaceC1979a
        /* JADX INFO: renamed from: a */
        public final void mo10535a(View view) {
            if (C1985c.this.f12533j != null) {
                C1985c.this.f12533j.setDynamicView(true);
                C1985c.this.f12533j.setSplashNativeView(view);
                C1985c.this.m10569b(this.f12560a, this.f12561b);
            }
        }

        @Override // com.anythink.expressad.splash.p150b.InterfaceC1979a
        /* JADX INFO: renamed from: a */
        public final void mo10536a(String str) {
            C1985c c1985c = C1985c.this;
            String unused = c1985c.f12539s;
            c1985c.m10565a(str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.c$7 */
    public class AnonymousClass7 implements C1987e.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f12563a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12564b;

        public AnonymousClass7(C1781c c1781c, int i) {
            this.f12563a = c1781c;
            this.f12564b = i;
        }

        @Override // com.anythink.expressad.splash.p151c.C1987e.b
        /* JADX INFO: renamed from: a */
        public final void mo10607a() {
            if (this.f12563a.m8908s()) {
                return;
            }
            C1985c.m10575c(C1985c.this, this.f12563a, this.f12564b);
        }

        @Override // com.anythink.expressad.splash.p151c.C1987e.b
        /* JADX INFO: renamed from: a */
        public final void mo10608a(int i) {
            if (i == 1) {
                C1985c.m10575c(C1985c.this, this.f12563a, this.f12564b);
            } else {
                C1985c.this.m10565a("readyState 2");
            }
        }

        @Override // com.anythink.expressad.splash.p151c.C1987e.b
        /* JADX INFO: renamed from: a */
        public final void mo10609a(String str) {
            C1985c.this.m10565a(str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.c.c$8 */
    public class AnonymousClass8 implements InterfaceC2336c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f12566a;

        public AnonymousClass8(C1781c c1781c) {
            this.f12566a = c1781c;
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5460a(String str) {
            C1985c.this.f12533j.setVideoReady(true);
            String unused = C1985c.f12517c;
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f12566a;
            messageObtain.what = 3;
            C1985c.this.f12523C.sendMessage(messageObtain);
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5461a(String str, String str2) {
            C1985c.this.f12533j.setVideoReady(false);
            String unused = C1985c.f12517c;
            Message messageObtain = Message.obtain();
            messageObtain.obj = str;
            messageObtain.what = 2;
            C1985c.this.f12523C.sendMessage(messageObtain);
        }
    }

    public C1985c(String str, String str2, long j) {
        this.f12528e = str;
        this.f12527d = str2;
        this.f12530g = j;
    }

    /* JADX INFO: renamed from: a */
    private void m10559a(long j) {
        this.f12523C.postDelayed(this.f12524D, j);
    }

    /* JADX INFO: renamed from: a */
    private void m10560a(C1781c c1781c, int i) {
        ATSplashView aTSplashView = this.f12533j;
        if (aTSplashView != null) {
            aTSplashView.setDynamicView(false);
        }
        if (c1781c.m8886j()) {
            m10579d(c1781c, i);
        }
        if (C1984b.m10555a(this.f12533j, c1781c)) {
            m10569b(c1781c, i);
            return;
        }
        this.f12533j.clearResState();
        if (!TextUtils.isEmpty(c1781c.m8862c()) && !c1781c.m8886j()) {
            this.f12544x = new AnonymousClass5(c1781c, i);
            C2324i.m11867a().m11882b(c1781c.m8862c(), (C2324i.a) this.f12544x);
        }
        if (c1781c.m8886j()) {
            return;
        }
        if (!TextUtils.isEmpty(c1781c.m8866d())) {
            C1335b.m3998a().m4005a(new AnonymousClass4(c1781c, i));
        }
        if (!TextUtils.isEmpty(c1781c.m8811S())) {
            this.f12543w = new AnonymousClass8(c1781c);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1781c);
            C2320e.m11843a().m11852a(this.f12527d, arrayList, C1801a.f11011aV, this.f12543w);
            if (C2320e.m11843a().m11855a(C1801a.f11011aV, this.f12527d, c1781c.m8793A())) {
                this.f12533j.setVideoReady(true);
                m10569b(c1781c, i);
            } else {
                C2320e.m11843a().m11862d(this.f12527d);
            }
        }
        if (TextUtils.isEmpty(c1781c.m10151be())) {
            return;
        }
        m10579d(c1781c, i);
    }

    /* JADX INFO: renamed from: a */
    private void m10561a(C1782d c1782d, int i) {
        ArrayList arrayList;
        if (c1782d == null || c1782d.f10572J == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            C1781c c1781c = c1782d.f10572J.get(0);
            c1781c.m8891l(this.f12527d);
            this.f12545y = c1782d.m9021c();
            if (c1781c.m8807O() != 99 && (!TextUtils.isEmpty(c1781c.m8862c()) || !TextUtils.isEmpty(c1781c.m8866d()))) {
                if (C1886t.m9828a(c1781c)) {
                    c1781c.m8882i(C1886t.m9827a(this.f12532i, c1781c.m10147ba()) ? 1 : 2);
                }
                if (c1781c.m8836ae() == 1 || !C1886t.m9827a(this.f12532i, c1781c.m10147ba()) || C1886t.m9828a(c1781c)) {
                    arrayList.add(c1781c);
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            m10565a("invalid  campaign");
            return;
        }
        m10584g();
        new StringBuilder("onload load suc size:").append(arrayList.size());
        C1781c c1781c2 = (C1781c) arrayList.get(0);
        if (!TextUtils.isEmpty(c1781c2.m8862c()) || (!TextUtils.isEmpty(c1781c2.m8866d()) && c1781c2.m8866d().contains("<MBTPLMARK>"))) {
            c1781c2.m8824a(true);
            c1781c2.m8861b(false);
        } else {
            c1781c2.m8824a(false);
            c1781c2.m8861b(true);
        }
        ATSplashView aTSplashView = this.f12533j;
        if (aTSplashView != null) {
            aTSplashView.setDynamicView(false);
        }
        if (c1781c2.m8886j()) {
            m10579d(c1781c2, i);
        }
        if (C1984b.m10555a(this.f12533j, c1781c2)) {
            m10569b(c1781c2, i);
            return;
        }
        this.f12533j.clearResState();
        if (!TextUtils.isEmpty(c1781c2.m8862c()) && !c1781c2.m8886j()) {
            this.f12544x = new AnonymousClass5(c1781c2, i);
            C2324i.m11867a().m11882b(c1781c2.m8862c(), (C2324i.a) this.f12544x);
        }
        if (c1781c2.m8886j()) {
            return;
        }
        if (!TextUtils.isEmpty(c1781c2.m8866d())) {
            C1335b.m3998a().m4005a(new AnonymousClass4(c1781c2, i));
        }
        if (!TextUtils.isEmpty(c1781c2.m8811S())) {
            this.f12543w = new AnonymousClass8(c1781c2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c1781c2);
            C2320e.m11843a().m11852a(this.f12527d, arrayList2, C1801a.f11011aV, this.f12543w);
            if (C2320e.m11843a().m11855a(C1801a.f11011aV, this.f12527d, c1781c2.m8793A())) {
                this.f12533j.setVideoReady(true);
                m10569b(c1781c2, i);
            } else {
                C2320e.m11843a().m11862d(this.f12527d);
            }
        }
        if (TextUtils.isEmpty(c1781c2.m10151be())) {
            return;
        }
        m10579d(c1781c2, i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10564a(C1985c c1985c, String str, C1781c c1781c, int i) {
        C1987e.c cVar = new C1987e.c();
        cVar.m10679c(c1985c.f12527d);
        cVar.m10676b(c1985c.f12528e);
        cVar.m10672a(c1781c);
        cVar.m10673a(str);
        cVar.m10677b(c1985c.f12535o);
        cVar.m10671a(c1985c.f12536p);
        cVar.m10674a(c1985c.f12525a);
        C1987e.a.f12606a.m10667a(c1985c.f12533j, cVar, c1985c.new AnonymousClass7(c1781c, i));
    }

    /* JADX INFO: renamed from: a */
    public void m10565a(String str) {
        if (this.f12541u) {
            this.f12541u = false;
        } else {
            m10572b(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10566a(String str, C1781c c1781c, int i) {
        C1987e.c cVar = new C1987e.c();
        cVar.m10679c(this.f12527d);
        cVar.m10676b(this.f12528e);
        cVar.m10672a(c1781c);
        cVar.m10673a(str);
        cVar.m10677b(this.f12535o);
        cVar.m10671a(this.f12536p);
        cVar.m10674a(this.f12525a);
        C1987e.a.f12606a.m10667a(this.f12533j, cVar, new AnonymousClass7(c1781c, i));
    }

    /* JADX INFO: renamed from: b */
    private List<C1781c> m10568b(C1782d c1782d) {
        if (c1782d == null || c1782d.f10572J == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C1781c c1781c = c1782d.f10572J.get(0);
        c1781c.m8891l(this.f12527d);
        this.f12545y = c1782d.m9021c();
        if (c1781c.m8807O() == 99) {
            return arrayList;
        }
        if (TextUtils.isEmpty(c1781c.m8862c()) && TextUtils.isEmpty(c1781c.m8866d())) {
            return arrayList;
        }
        if (C1886t.m9828a(c1781c)) {
            c1781c.m8882i(C1886t.m9827a(this.f12532i, c1781c.m10147ba()) ? 1 : 2);
        }
        if (c1781c.m8836ae() != 1 && C1886t.m9827a(this.f12532i, c1781c.m10147ba()) && !C1886t.m9828a(c1781c)) {
            return arrayList;
        }
        arrayList.add(c1781c);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public void m10569b(C1781c c1781c, int i) {
        if (!C1984b.m10555a(this.f12533j, c1781c) || this.f12542v) {
            return;
        }
        m10592l();
        this.f12526b = c1781c;
        this.f12542v = true;
        InterfaceC1981c interfaceC1981c = this.f12531h;
        if (interfaceC1981c != null) {
            interfaceC1981c.mo10539a(c1781c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10570b(C1985c c1985c, C1781c c1781c, int i) {
        if (c1781c.m8886j()) {
            C1978b.a aVar = new C1978b.a();
            aVar.m10527b(c1985c.f12527d).m10524a(c1985c.f12528e).m10525a(c1985c.f12535o).m10523a(c1781c).m10522a(c1985c.f12536p).m10533h(c1985c.f12522B);
            try {
                if (!TextUtils.isEmpty(c1781c.m8862c())) {
                    Uri uri = Uri.parse(c1781c.m8862c());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter(C2069a.f13134L);
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.m10526b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.m10528c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.m10529d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.m10530e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.m10531f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.m10532g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.m10534i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            C1983a unused = C1983a.a.f12510a;
            C1983a.m10548a(c1985c.f12533j, new C1978b(aVar), c1985c.new AnonymousClass6(c1781c, i));
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10572b(String str) {
        if (this.f12542v) {
            return;
        }
        m10592l();
        this.f12542v = true;
        InterfaceC1981c interfaceC1981c = this.f12531h;
        if (interfaceC1981c != null) {
            interfaceC1981c.mo10540a(str);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10574c(C1781c c1781c, int i) {
        this.f12533j.clearResState();
        if (!TextUtils.isEmpty(c1781c.m8862c()) && !c1781c.m8886j()) {
            this.f12544x = new AnonymousClass5(c1781c, i);
            C2324i.m11867a().m11882b(c1781c.m8862c(), (C2324i.a) this.f12544x);
        }
        if (c1781c.m8886j()) {
            return;
        }
        if (!TextUtils.isEmpty(c1781c.m8866d())) {
            C1335b.m3998a().m4005a(new AnonymousClass4(c1781c, i));
        }
        if (!TextUtils.isEmpty(c1781c.m8811S())) {
            this.f12543w = new AnonymousClass8(c1781c);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1781c);
            C2320e.m11843a().m11852a(this.f12527d, arrayList, C1801a.f11011aV, this.f12543w);
            if (C2320e.m11843a().m11855a(C1801a.f11011aV, this.f12527d, c1781c.m8793A())) {
                this.f12533j.setVideoReady(true);
                m10569b(c1781c, i);
            } else {
                C2320e.m11843a().m11862d(this.f12527d);
            }
        }
        if (TextUtils.isEmpty(c1781c.m10151be())) {
            return;
        }
        m10579d(c1781c, i);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10575c(C1985c c1985c, C1781c c1781c, int i) {
        if (c1985c.f12533j.isH5Ready()) {
            return;
        }
        c1985c.f12533j.setH5Ready(true);
        c1985c.m10569b(c1781c, i);
    }

    /* JADX INFO: renamed from: c */
    private void m10576c(String str) {
        m10565a(str);
    }

    /* JADX INFO: renamed from: d */
    private void m10579d(C1781c c1781c, int i) {
        C1984b.m10551a(this.f12533j, c1781c, new InterfaceC2020a() { // from class: com.anythink.expressad.splash.c.c.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1781c f12549a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f12550b;

            public AnonymousClass3(C1781c c1781c2, int i2) {
                c1781c = c1781c2;
                i = i2;
            }

            @Override // com.anythink.expressad.splash.view.InterfaceC2020a
            /* JADX INFO: renamed from: a */
            public final void mo10605a() {
                if (c1781c.m8886j() && C1985c.this.f12533j != null) {
                    C1985c.this.f12533j.setImageReady(true);
                    C1985c.m10570b(C1985c.this, c1781c, i);
                }
                C1985c.this.m10569b(c1781c, i);
            }

            @Override // com.anythink.expressad.splash.view.InterfaceC2020a
            /* JADX INFO: renamed from: b */
            public final void mo10606b() {
                if (!c1781c.m8886j() || C1985c.this.f12533j == null) {
                    return;
                }
                C1985c.this.f12533j.setImageReady(false);
                C1985c c1985c = C1985c.this;
                String unused = c1985c.f12539s;
                c1985c.m10565a("Image resource load faile");
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private void m10580e(C1781c c1781c, int i) {
        C1335b.m3998a().m4005a(new AnonymousClass4(c1781c, i));
    }

    /* JADX INFO: renamed from: e */
    private boolean m10581e() {
        return this.f12535o;
    }

    /* JADX INFO: renamed from: f */
    private int m10582f() {
        return this.f12536p;
    }

    /* JADX INFO: renamed from: f */
    private void m10583f(C1781c c1781c, int i) {
        if (c1781c.m8886j()) {
            return;
        }
        this.f12544x = new AnonymousClass5(c1781c, i);
        C2324i.m11867a().m11882b(c1781c.m8862c(), (C2324i.a) this.f12544x);
    }

    /* JADX INFO: renamed from: g */
    private void m10584g() {
        try {
            int i = this.f12546z + 1;
            this.f12546z = i;
            C1489c c1489c = this.f12534k;
            if (c1489c == null || i > c1489c.m6115t()) {
                this.f12546z = 0;
            }
            new StringBuilder("onload,next offset is:").append(this.f12546z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m10585g(C1781c c1781c, int i) {
        if (c1781c.m8886j()) {
            C1978b.a aVar = new C1978b.a();
            aVar.m10527b(this.f12527d).m10524a(this.f12528e).m10525a(this.f12535o).m10523a(c1781c).m10522a(this.f12536p).m10533h(this.f12522B);
            try {
                if (!TextUtils.isEmpty(c1781c.m8862c())) {
                    Uri uri = Uri.parse(c1781c.m8862c());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter(C2069a.f13134L);
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.m10526b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.m10528c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.m10529d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.m10530e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.m10531f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.m10532g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.m10534i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            C1983a unused = C1983a.a.f12510a;
            C1983a.m10548a(this.f12533j, new C1978b(aVar), new AnonymousClass6(c1781c, i));
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m10586h() {
    }

    /* JADX INFO: renamed from: h */
    private void m10587h(C1781c c1781c, int i) {
        if (this.f12533j.isH5Ready()) {
            return;
        }
        this.f12533j.setH5Ready(true);
        m10569b(c1781c, i);
    }

    /* JADX INFO: renamed from: i */
    private static void m10588i() {
    }

    /* JADX INFO: renamed from: i */
    private void m10589i(C1781c c1781c, int i) {
        this.f12543w = new AnonymousClass8(c1781c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1781c);
        C2320e.m11843a().m11852a(this.f12527d, arrayList, C1801a.f11011aV, this.f12543w);
        if (!C2320e.m11843a().m11855a(C1801a.f11011aV, this.f12527d, c1781c.m8793A())) {
            C2320e.m11843a().m11862d(this.f12527d);
        } else {
            this.f12533j.setVideoReady(true);
            m10569b(c1781c, i);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m10590j() {
        this.f12546z = 0;
    }

    /* JADX INFO: renamed from: k */
    private static void m10591k() {
    }

    /* JADX INFO: renamed from: l */
    private void m10592l() {
        this.f12523C.removeCallbacks(this.f12524D);
    }

    /* JADX INFO: renamed from: a */
    public final String m10593a() {
        return this.f12521A;
    }

    /* JADX INFO: renamed from: a */
    public final void m10594a(int i) {
        this.f12522B = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m10595a(int i, int i2) {
        this.f12538r = i;
        this.f12537q = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m10596a(C1489c c1489c) {
        this.f12534k = c1489c;
    }

    /* JADX INFO: renamed from: a */
    public final void m10597a(C1782d c1782d) {
        ArrayList arrayList;
        this.f12542v = false;
        this.f12539s = "";
        this.f12540t = 2;
        if (c1782d == null || c1782d.f10572J == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            C1781c c1781c = c1782d.f10572J.get(0);
            c1781c.m8891l(this.f12527d);
            this.f12545y = c1782d.m9021c();
            if (c1781c.m8807O() != 99 && (!TextUtils.isEmpty(c1781c.m8862c()) || !TextUtils.isEmpty(c1781c.m8866d()))) {
                if (C1886t.m9828a(c1781c)) {
                    c1781c.m8882i(C1886t.m9827a(this.f12532i, c1781c.m10147ba()) ? 1 : 2);
                }
                if (c1781c.m8836ae() == 1 || !C1886t.m9827a(this.f12532i, c1781c.m10147ba()) || C1886t.m9828a(c1781c)) {
                    arrayList.add(c1781c);
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            m10565a("invalid  campaign");
            return;
        }
        m10584g();
        new StringBuilder("onload load suc size:").append(arrayList.size());
        C1781c c1781c2 = (C1781c) arrayList.get(0);
        if (!TextUtils.isEmpty(c1781c2.m8862c()) || (!TextUtils.isEmpty(c1781c2.m8866d()) && c1781c2.m8866d().contains("<MBTPLMARK>"))) {
            c1781c2.m8824a(true);
            c1781c2.m8861b(false);
        } else {
            c1781c2.m8824a(false);
            c1781c2.m8861b(true);
        }
        ATSplashView aTSplashView = this.f12533j;
        if (aTSplashView != null) {
            aTSplashView.setDynamicView(false);
        }
        if (c1781c2.m8886j()) {
            m10579d(c1781c2, 2);
        }
        if (C1984b.m10555a(this.f12533j, c1781c2)) {
            m10569b(c1781c2, 2);
            return;
        }
        this.f12533j.clearResState();
        if (!TextUtils.isEmpty(c1781c2.m8862c()) && !c1781c2.m8886j()) {
            this.f12544x = new AnonymousClass5(c1781c2, 2);
            C2324i.m11867a().m11882b(c1781c2.m8862c(), (C2324i.a) this.f12544x);
        }
        if (c1781c2.m8886j()) {
            return;
        }
        if (!TextUtils.isEmpty(c1781c2.m8866d())) {
            C1335b.m3998a().m4005a(new AnonymousClass4(c1781c2, 2));
        }
        if (!TextUtils.isEmpty(c1781c2.m8811S())) {
            this.f12543w = new AnonymousClass8(c1781c2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c1781c2);
            C2320e.m11843a().m11852a(this.f12527d, arrayList2, C1801a.f11011aV, this.f12543w);
            if (C2320e.m11843a().m11855a(C1801a.f11011aV, this.f12527d, c1781c2.m8793A())) {
                this.f12533j.setVideoReady(true);
                m10569b(c1781c2, 2);
            } else {
                C2320e.m11843a().m11862d(this.f12527d);
            }
        }
        if (TextUtils.isEmpty(c1781c2.m10151be())) {
            return;
        }
        m10579d(c1781c2, 2);
    }

    /* JADX INFO: renamed from: a */
    public final void m10598a(InterfaceC1981c interfaceC1981c) {
        this.f12531h = interfaceC1981c;
    }

    /* JADX INFO: renamed from: a */
    public final void m10599a(ATSplashView aTSplashView) {
        this.f12533j = aTSplashView;
    }

    /* JADX INFO: renamed from: a */
    public final void m10600a(boolean z) {
        this.f12525a = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m10601b() {
        if (this.f12531h != null) {
            this.f12531h = null;
        }
        if (this.f12543w != null) {
            this.f12543w = null;
        }
        if (this.f12544x != null) {
            this.f12544x = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10602b(int i) {
        this.f12536p = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m10603b(boolean z) {
        this.f12535o = z;
    }

    /* JADX INFO: renamed from: c */
    public final C1781c m10604c() {
        return this.f12526b;
    }
}
