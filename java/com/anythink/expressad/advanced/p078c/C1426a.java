package com.anythink.expressad.advanced.p078c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.advanced.p076a.C1420a;
import com.anythink.expressad.advanced.p077b.InterfaceC1423a;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p123c.C1814d;
import com.anythink.expressad.foundation.p120g.p123c.EnumC1811a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1882p;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.p086d.C1489c;
import com.anythink.expressad.p086d.p088b.C1487a;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p178b.C2320e;
import com.anythink.expressad.videocommon.p178b.C2324i;
import com.anythink.expressad.videocommon.p180d.InterfaceC2336c;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1426a {

    /* JADX INFO: renamed from: a */
    private static String f6451a = "NativeAdvancedLoadManager";

    /* JADX INFO: renamed from: j */
    private static final int f6452j = 1;

    /* JADX INFO: renamed from: k */
    private static final int f6453k = 2;

    /* JADX INFO: renamed from: l */
    private static final int f6454l = 3;

    /* JADX INFO: renamed from: m */
    private static final int f6455m = 4;

    /* JADX INFO: renamed from: n */
    private static final int f6456n = 5;

    /* JADX INFO: renamed from: A */
    private int f6457A;

    /* JADX INFO: renamed from: b */
    private String f6461b;

    /* JADX INFO: renamed from: c */
    private String f6462c;

    /* JADX INFO: renamed from: d */
    private long f6463d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1423a f6464e;

    /* JADX INFO: renamed from: g */
    private ATNativeAdvancedView f6466g;

    /* JADX INFO: renamed from: h */
    private C1489c f6467h;

    /* JADX INFO: renamed from: i */
    private C1781c f6468i;

    /* JADX INFO: renamed from: o */
    private int f6469o;

    /* JADX INFO: renamed from: p */
    private int f6470p;

    /* JADX INFO: renamed from: q */
    private int f6471q;

    /* JADX INFO: renamed from: r */
    private int f6472r;

    /* JADX INFO: renamed from: s */
    private String f6473s;

    /* JADX INFO: renamed from: t */
    private int f6474t;

    /* JADX INFO: renamed from: u */
    private boolean f6475u;

    /* JADX INFO: renamed from: v */
    private volatile boolean f6476v;

    /* JADX INFO: renamed from: w */
    private InterfaceC2336c f6477w;

    /* JADX INFO: renamed from: x */
    private C2324i.d f6478x;

    /* JADX INFO: renamed from: y */
    private C2324i.d f6479y;

    /* JADX INFO: renamed from: z */
    private String f6480z;

    /* JADX INFO: renamed from: B */
    private String f6458B = "";

    /* JADX INFO: renamed from: C */
    private Handler f6459C = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.advanced.c.a.1
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj2 = message.obj;
                int i2 = message.arg1;
                if (obj2 == null || !(obj2 instanceof C1781c)) {
                    return;
                }
                C1781c c1781c = (C1781c) obj2;
                C1426a.m5421a(C1426a.this, C2324i.m11867a().m11883c(c1781c.m8862c()), c1781c, i2);
                return;
            }
            if (i == 2) {
                Object obj3 = message.obj;
                if (obj3 == null || !(obj3 instanceof String)) {
                    return;
                }
                C1426a c1426a = C1426a.this;
                String string = obj3.toString();
                String unused = C1426a.this.f6473s;
                c1426a.m5433b(string, C1426a.this.f6474t);
                return;
            }
            if (i == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof C1781c)) {
                    return;
                }
                C1426a c1426a2 = C1426a.this;
                c1426a2.m5423a((C1781c) obj4, c1426a2.f6474t);
                return;
            }
            if (i != 4) {
                if (i == 5 && (obj = message.obj) != null && (obj instanceof C1781c)) {
                    if (C1426a.this.f6466g != null) {
                        C1426a.this.f6466g.setVideoReady(true);
                    }
                    C1426a c1426a3 = C1426a.this;
                    c1426a3.m5423a((C1781c) obj, c1426a3.f6474t);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof C1781c)) {
                return;
            }
            if (C1426a.this.f6466g != null) {
                C1426a.this.f6466g.setEndCardReady(true);
            }
            C1426a c1426a4 = C1426a.this;
            c1426a4.m5423a((C1781c) obj5, c1426a4.f6474t);
        }
    };

    /* JADX INFO: renamed from: D */
    private Runnable f6460D = new Runnable() { // from class: com.anythink.expressad.advanced.c.a.3
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1426a c1426a = C1426a.this;
            String unused = c1426a.f6473s;
            c1426a.m5433b("load timeout", C1426a.this.f6474t);
        }
    };

    /* JADX INFO: renamed from: f */
    private Context f6465f = C1175n.m2059a().m2148f();

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$1 */
    public class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                Object obj2 = message.obj;
                int i2 = message.arg1;
                if (obj2 == null || !(obj2 instanceof C1781c)) {
                    return;
                }
                C1781c c1781c = (C1781c) obj2;
                C1426a.m5421a(C1426a.this, C2324i.m11867a().m11883c(c1781c.m8862c()), c1781c, i2);
                return;
            }
            if (i == 2) {
                Object obj3 = message.obj;
                if (obj3 == null || !(obj3 instanceof String)) {
                    return;
                }
                C1426a c1426a = C1426a.this;
                String string = obj3.toString();
                String unused = C1426a.this.f6473s;
                c1426a.m5433b(string, C1426a.this.f6474t);
                return;
            }
            if (i == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof C1781c)) {
                    return;
                }
                C1426a c1426a2 = C1426a.this;
                c1426a2.m5423a((C1781c) obj4, c1426a2.f6474t);
                return;
            }
            if (i != 4) {
                if (i == 5 && (obj = message.obj) != null && (obj instanceof C1781c)) {
                    if (C1426a.this.f6466g != null) {
                        C1426a.this.f6466g.setVideoReady(true);
                    }
                    C1426a c1426a3 = C1426a.this;
                    c1426a3.m5423a((C1781c) obj, c1426a3.f6474t);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof C1781c)) {
                return;
            }
            if (C1426a.this.f6466g != null) {
                C1426a.this.f6466g.setEndCardReady(true);
            }
            C1426a c1426a4 = C1426a.this;
            c1426a4.m5423a((C1781c) obj5, c1426a4.f6474t);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$10 */
    public class AnonymousClass10 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATNativeAdvancedWebview f6482a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f6483b;

        public AnonymousClass10(ATNativeAdvancedWebview aTNativeAdvancedWebview, String str) {
            this.f6482a = aTNativeAdvancedWebview;
            this.f6483b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6482a.loadUrl(C1890x.m9872c(this.f6483b));
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$2 */
    public class AnonymousClass2 implements InterfaceC2336c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f6485a;

        public AnonymousClass2(C1781c c1781c) {
            this.f6485a = c1781c;
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5460a(String str) {
            String unused = C1426a.f6451a;
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f6485a;
            messageObtain.what = 5;
            C1426a.this.f6459C.sendMessage(messageObtain);
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5461a(String str, String str2) {
            String unused = C1426a.f6451a;
            Message messageObtain = Message.obtain();
            messageObtain.obj = str;
            messageObtain.what = 2;
            C1426a.this.f6459C.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$3 */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1426a c1426a = C1426a.this;
            String unused = c1426a.f6473s;
            c1426a.m5433b("load timeout", C1426a.this.f6474t);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$4 */
    public class AnonymousClass4 implements InterfaceC1819c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f6488a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6489b = 2;

        /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$4$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                C1426a.this.m5423a(anonymousClass4.f6488a, anonymousClass4.f6489b);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$4$2 */
        public class AnonymousClass2 implements Runnable {
            public AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                C1426a.this.m5423a(anonymousClass4.f6488a, anonymousClass4.f6489b);
            }
        }

        public AnonymousClass4(C1781c c1781c) {
            this.f6488a = c1781c;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            String unused = C1426a.f6451a;
            if (C1426a.this.f6459C != null) {
                C1426a.this.f6459C.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.4.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        C1426a.this.m5423a(anonymousClass4.f6488a, anonymousClass4.f6489b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
            String unused = C1426a.f6451a;
            if (C1426a.this.f6459C != null) {
                C1426a.this.f6459C.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.4.2
                    public AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        C1426a.this.m5423a(anonymousClass4.f6488a, anonymousClass4.f6489b);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$5 */
    public class AnonymousClass5 implements C2324i.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f6493a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6494b = 2;

        public AnonymousClass5(C1781c c1781c) {
            this.f6493a = c1781c;
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5464a(String str) {
            String unused = C1426a.f6451a;
            if (C1426a.this.f6459C != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f6493a;
                messageObtain.arg1 = this.f6494b;
                C1426a.this.f6459C.sendMessage(messageObtain);
            }
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5465a(String str, String str2) {
            String unused = C1426a.f6451a;
            if (C1426a.this.f6466g != null) {
                C1426a.this.f6466g.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.obj = str;
            C1426a.this.f6459C.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$6 */
    public class AnonymousClass6 implements InterfaceC1819c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f6496a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6497b = 2;

        /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$6$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                C1426a.this.m5423a(anonymousClass6.f6496a, anonymousClass6.f6497b);
            }
        }

        /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$6$2 */
        public class AnonymousClass2 implements Runnable {
            public AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                C1426a.this.m5423a(anonymousClass6.f6496a, anonymousClass6.f6497b);
            }
        }

        public AnonymousClass6(C1781c c1781c) {
            this.f6496a = c1781c;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            String unused = C1426a.f6451a;
            if (C1426a.this.f6459C != null) {
                C1426a.this.f6459C.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.6.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        C1426a.this.m5423a(anonymousClass6.f6496a, anonymousClass6.f6497b);
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
            String unused = C1426a.f6451a;
            if (C1426a.this.f6459C != null) {
                C1426a.this.f6459C.post(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.6.2
                    public AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        C1426a.this.m5423a(anonymousClass6.f6496a, anonymousClass6.f6497b);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$7 */
    public class AnonymousClass7 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f6501a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6502b = 2;

        /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$7$1 */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ File f6504a;

            public AnonymousClass1(File file) {
                file = file;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1426a c1426a = C1426a.this;
                String str = "file:////" + file.getAbsolutePath();
                AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                C1426a.m5421a(c1426a, str, anonymousClass7.f6501a, anonymousClass7.f6502b);
            }
        }

        public AnonymousClass7(C1781c c1781c) {
            this.f6501a = c1781c;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            File file;
            File file2;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        file2 = new File(this.f6501a.m8866d());
                        try {
                            if (!file2.exists()) {
                                String strM9407b = C1814d.m9407b(EnumC1811a.ANYTHINK_700_HTML);
                                String strM9771a = C1882p.m9771a(C1890x.m9869a(this.f6501a.m8866d()));
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
                                            sb.append(this.f6501a.m8866d());
                                            fileOutputStream2.write(sb.toString().getBytes());
                                            fileOutputStream2.flush();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception e) {
                                            e = e;
                                            fileOutputStream = fileOutputStream2;
                                            e.printStackTrace();
                                            this.f6501a.m8885j("");
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
                        this.f6501a.m8860b(file2.getAbsolutePath());
                        String unused = C1426a.f6451a;
                        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.7.1

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ File f6504a;

                            public AnonymousClass1(File file22) {
                                file = file22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C1426a c1426a = C1426a.this;
                                String str = "file:////" + file.getAbsolutePath();
                                AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                                C1426a.m5421a(c1426a, str, anonymousClass7.f6501a, anonymousClass7.f6502b);
                            }
                        });
                    } else {
                        String unused2 = C1426a.f6451a;
                        C1426a c1426a = C1426a.this;
                        String unused3 = c1426a.f6473s;
                        c1426a.m5433b("html file write failed", this.f6502b);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e5) {
                C1426a c1426a2 = C1426a.this;
                String message = e5.getMessage();
                String unused4 = C1426a.this.f6473s;
                c1426a2.m5433b(message, this.f6502b);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$8 */
    public class AnonymousClass8 implements C2324i.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f6506a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6507b = 2;

        public AnonymousClass8(C1781c c1781c) {
            this.f6506a = c1781c;
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5464a(String str) {
            String unused = C1426a.f6451a;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f6506a;
            messageObtain.arg1 = this.f6507b;
            C1426a.this.f6459C.sendMessage(messageObtain);
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5465a(String str, String str2) {
            String unused = C1426a.f6451a;
            StringBuilder sb = new StringBuilder("zip download fail: ");
            sb.append(str2);
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.obj = str;
            C1426a.this.f6459C.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.a$9 */
    public class AnonymousClass9 extends C1442b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f6509a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6510b;

        public AnonymousClass9(C1781c c1781c, int i) {
            this.f6509a = c1781c;
            this.f6510b = i;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f6509a.m8908s()) {
                C1426a.this.f6466g.setH5Ready(true);
                C1420a.m5400a(this.f6509a.m8818Z());
                C1426a.m5429b(C1426a.this, this.f6509a, this.f6510b);
            }
            NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            StringBuilder sb = new StringBuilder("onReceivedError: ");
            sb.append(i);
            sb.append("  ");
            sb.append(str);
            sb.append("  ");
            sb.append(str2);
            C1426a.this.m5433b(str, this.f6510b);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            new StringBuilder("onReceivedSslError: ").append(sslError.getPrimaryError());
            C1426a.this.m5433b("onReceivedSslError:" + sslError.getUrl(), this.f6510b);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            super.readyState(webView, i);
            if (i != 1) {
                C1426a.this.m5433b("readyState 2", this.f6510b);
                return;
            }
            C1426a.this.f6466g.setH5Ready(true);
            C1420a.m5400a(this.f6509a.m8818Z());
            C1426a.m5429b(C1426a.this, this.f6509a, this.f6510b);
        }
    }

    public C1426a(String str, String str2) {
        this.f6462c = str;
        this.f6461b = str2;
    }

    /* JADX INFO: renamed from: a */
    private void m5418a(long j) {
        this.f6459C.postDelayed(this.f6460D, j);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5421a(C1426a c1426a, String str, C1781c c1781c, int i) {
        ATNativeAdvancedView aTNativeAdvancedView = c1426a.f6466g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(c1426a.f6466g.getContext(), c1426a.f6462c, c1426a.f6461b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1781c);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(c1426a.f6469o);
        nativeAdvancedJSBridgeImpl.setCountdownS(c1426a.f6470p);
        c1426a.f6466g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = c1426a.f6466g.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            c1426a.m5433b("webview is null", i);
            return;
        }
        if (advancedNativeWebview != null && advancedNativeWebview.isDestroyed()) {
            c1426a.m5433b("webview is destroyed", i);
            return;
        }
        advancedNativeWebview.setWebViewListener(c1426a.new AnonymousClass9(c1781c, i));
        if (advancedNativeWebview.isDestroyed()) {
            c1426a.m5433b("webview has destory", i);
            return;
        }
        Handler handler = c1426a.f6459C;
        if (handler != null) {
            handler.post(c1426a.new AnonymousClass10(advancedNativeWebview, str));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5422a(C1781c c1781c) {
        this.f6468i = c1781c;
        if (C1428c.m5510a(this.f6466g, c1781c)) {
            m5423a(c1781c, 2);
            return;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f6466g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(c1781c.m8862c())) {
            new StringBuilder("start download zip: ").append(c1781c.m8862c());
            this.f6478x = new AnonymousClass8(c1781c);
            C2324i.m11867a().m11882b(c1781c.m8862c(), (C2324i.a) this.f6478x);
        }
        if (!TextUtils.isEmpty(c1781c.m8866d())) {
            new StringBuilder("start download HTML: ").append(c1781c.m8866d());
            C1335b.m3998a().m4005a(new AnonymousClass7(c1781c));
        }
        if (!TextUtils.isEmpty(c1781c.m8811S())) {
            new StringBuilder("start download Video: ").append(c1781c.m8811S());
            this.f6477w = new AnonymousClass2(c1781c);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1781c);
            C2320e.m11843a().m11852a(this.f6461b, arrayList, C1801a.f11013aX, this.f6477w);
            if (C2320e.m11843a().m11855a(C1801a.f11013aX, this.f6461b, c1781c.m8793A())) {
                this.f6466g.setVideoReady(true);
                m5423a(c1781c, 2);
            } else {
                C2320e.m11843a().m11862d(this.f6461b);
            }
        }
        if (!TextUtils.isEmpty(c1781c.m10151be())) {
            new StringBuilder("start download image: ").append(c1781c.m10151be());
            C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m10151be(), new AnonymousClass6(c1781c));
        }
        if (!TextUtils.isEmpty(c1781c.m8801I())) {
            new StringBuilder("start download EndCard: ").append(c1781c.m8801I());
            this.f6479y = new AnonymousClass5(c1781c);
            C2324i.m11867a().m11882b(c1781c.m8801I(), (C2324i.a) this.f6479y);
        }
        if (TextUtils.isEmpty(c1781c.m8915y())) {
            return;
        }
        new StringBuilder("start download gitUrl: ").append(c1781c.m8915y());
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m8915y(), new AnonymousClass4(c1781c));
    }

    /* JADX INFO: renamed from: a */
    public void m5423a(C1781c c1781c, int i) {
        if (!C1428c.m5510a(this.f6466g, c1781c) || this.f6476v) {
            return;
        }
        m5448i();
        this.f6476v = true;
        InterfaceC1423a interfaceC1423a = this.f6464e;
        if (interfaceC1423a != null) {
            interfaceC1423a.mo5406a(c1781c, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5424a(String str, int i) {
        m5433b(str, i);
    }

    /* JADX INFO: renamed from: a */
    private void m5425a(String str, C1781c c1781c, int i) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f6466g;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(this.f6466g.getContext(), this.f6462c, this.f6461b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1781c);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.f6469o);
        nativeAdvancedJSBridgeImpl.setCountdownS(this.f6470p);
        this.f6466g.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = this.f6466g.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            m5433b("webview is null", i);
            return;
        }
        if (advancedNativeWebview != null && advancedNativeWebview.isDestroyed()) {
            m5433b("webview is destroyed", i);
            return;
        }
        advancedNativeWebview.setWebViewListener(new AnonymousClass9(c1781c, i));
        if (advancedNativeWebview.isDestroyed()) {
            m5433b("webview has destory", i);
            return;
        }
        Handler handler = this.f6459C;
        if (handler != null) {
            handler.post(new AnonymousClass10(advancedNativeWebview, str));
        }
    }

    /* JADX INFO: renamed from: b */
    private List<C1781c> m5427b(C1782d c1782d) {
        if (c1782d == null || c1782d.f10572J == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C1781c c1781c = c1782d.f10572J.get(0);
        c1781c.m8891l(this.f6461b);
        this.f6480z = c1782d.m9021c();
        if (c1781c.m8807O() == 99) {
            return arrayList;
        }
        if (TextUtils.isEmpty(c1781c.m8862c()) && TextUtils.isEmpty(c1781c.m8866d())) {
            return arrayList;
        }
        if (C1886t.m9828a(c1781c)) {
            c1781c.m8882i(C1886t.m9827a(this.f6465f, c1781c.m10147ba()) ? 1 : 2);
        }
        if (c1781c.m8836ae() != 1 && C1886t.m9827a(this.f6465f, c1781c.m10147ba())) {
            StringBuilder sb = new StringBuilder("onload: ");
            sb.append(c1781c.m10148bb());
            sb.append(" has been installed.");
            if (!C1886t.m9828a(c1781c)) {
                return arrayList;
            }
        }
        arrayList.add(c1781c);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private void m5428b(int i) {
        this.f6470p = i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5429b(C1426a c1426a, C1781c c1781c, int i) {
        if (c1426a.f6466g.isH5Ready()) {
            c1426a.m5423a(c1781c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5431b(C1781c c1781c) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f6466g;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(c1781c.m8862c())) {
            new StringBuilder("start download zip: ").append(c1781c.m8862c());
            this.f6478x = new AnonymousClass8(c1781c);
            C2324i.m11867a().m11882b(c1781c.m8862c(), (C2324i.a) this.f6478x);
        }
        if (!TextUtils.isEmpty(c1781c.m8866d())) {
            new StringBuilder("start download HTML: ").append(c1781c.m8866d());
            C1335b.m3998a().m4005a(new AnonymousClass7(c1781c));
        }
        if (!TextUtils.isEmpty(c1781c.m8811S())) {
            new StringBuilder("start download Video: ").append(c1781c.m8811S());
            this.f6477w = new AnonymousClass2(c1781c);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1781c);
            C2320e.m11843a().m11852a(this.f6461b, arrayList, C1801a.f11013aX, this.f6477w);
            if (C2320e.m11843a().m11855a(C1801a.f11013aX, this.f6461b, c1781c.m8793A())) {
                this.f6466g.setVideoReady(true);
                m5423a(c1781c, 2);
            } else {
                C2320e.m11843a().m11862d(this.f6461b);
            }
        }
        if (!TextUtils.isEmpty(c1781c.m10151be())) {
            new StringBuilder("start download image: ").append(c1781c.m10151be());
            C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m10151be(), new AnonymousClass6(c1781c));
        }
        if (!TextUtils.isEmpty(c1781c.m8801I())) {
            new StringBuilder("start download EndCard: ").append(c1781c.m8801I());
            this.f6479y = new AnonymousClass5(c1781c);
            C2324i.m11867a().m11882b(c1781c.m8801I(), (C2324i.a) this.f6479y);
        }
        if (TextUtils.isEmpty(c1781c.m8915y())) {
            return;
        }
        new StringBuilder("start download gitUrl: ").append(c1781c.m8915y());
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m8915y(), new AnonymousClass4(c1781c));
    }

    /* JADX INFO: renamed from: b */
    private void m5432b(C1781c c1781c, int i) {
        if (this.f6466g.isH5Ready()) {
            m5423a(c1781c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5433b(String str, int i) {
        if (this.f6476v) {
            return;
        }
        m5448i();
        this.f6476v = true;
        InterfaceC1423a interfaceC1423a = this.f6464e;
        if (interfaceC1423a != null) {
            interfaceC1423a.mo5407a(str, i);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m5435c(C1781c c1781c) {
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m8915y(), new AnonymousClass4(c1781c));
    }

    /* JADX INFO: renamed from: c */
    private void m5436c(String str, int i) {
        m5433b(str, i);
    }

    /* JADX INFO: renamed from: d */
    private void m5439d(C1781c c1781c) {
        this.f6479y = new AnonymousClass5(c1781c);
        C2324i.m11867a().m11882b(c1781c.m8801I(), (C2324i.a) this.f6479y);
    }

    /* JADX INFO: renamed from: e */
    private int m5440e() {
        return this.f6470p;
    }

    /* JADX INFO: renamed from: e */
    private void m5441e(C1781c c1781c) {
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m10151be(), new AnonymousClass6(c1781c));
    }

    /* JADX INFO: renamed from: f */
    private void m5442f() {
        try {
            int i = this.f6457A + 1;
            this.f6457A = i;
            C1489c c1489c = this.f6467h;
            if (c1489c == null || i > c1489c.m6115t()) {
                this.f6457A = 0;
            }
            new StringBuilder("onload 算出 下次的offset是:").append(this.f6457A);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m5443f(C1781c c1781c) {
        C1335b.m3998a().m4005a(new AnonymousClass7(c1781c));
    }

    /* JADX INFO: renamed from: g */
    private static void m5444g() {
    }

    /* JADX INFO: renamed from: g */
    private void m5445g(C1781c c1781c) {
        this.f6478x = new AnonymousClass8(c1781c);
        C2324i.m11867a().m11882b(c1781c.m8862c(), (C2324i.a) this.f6478x);
    }

    /* JADX INFO: renamed from: h */
    private void m5446h() {
        this.f6457A = 0;
    }

    /* JADX INFO: renamed from: h */
    private void m5447h(C1781c c1781c) {
        this.f6477w = new AnonymousClass2(c1781c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1781c);
        C2320e.m11843a().m11852a(this.f6461b, arrayList, C1801a.f11013aX, this.f6477w);
        if (!C2320e.m11843a().m11855a(C1801a.f11013aX, this.f6461b, c1781c.m8793A())) {
            C2320e.m11843a().m11862d(this.f6461b);
        } else {
            this.f6466g.setVideoReady(true);
            m5423a(c1781c, 2);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m5448i() {
        this.f6459C.removeCallbacks(this.f6460D);
    }

    /* JADX INFO: renamed from: j */
    private static void m5449j() {
    }

    /* JADX INFO: renamed from: a */
    public final String m5450a() {
        return this.f6458B;
    }

    /* JADX INFO: renamed from: a */
    public final String m5451a(String str) {
        int iM11830k;
        if (this.f6468i == null) {
            return "";
        }
        try {
            C2318c c2318cM11851a = C2320e.m11843a().m11851a(this.f6461b, this.f6468i.m10146aZ() + this.f6468i.m8811S() + this.f6468i.m8794B());
            if (c2318cM11851a == null || (iM11830k = c2318cM11851a.m11830k()) != 5) {
                return str;
            }
            String strM11823e = c2318cM11851a.m11823e();
            if (!new File(strM11823e).exists()) {
                return str;
            }
            StringBuilder sb = new StringBuilder("download success locally,use local video url:");
            sb.append(strM11823e);
            sb.append(" state:");
            sb.append(iM11830k);
            return strM11823e;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5452a(int i) {
        this.f6469o = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m5453a(int i, int i2) {
        this.f6472r = i;
        this.f6471q = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m5454a(InterfaceC1423a interfaceC1423a) {
        this.f6464e = interfaceC1423a;
    }

    /* JADX INFO: renamed from: a */
    public final void m5455a(ATNativeAdvancedView aTNativeAdvancedView) {
        this.f6466g = aTNativeAdvancedView;
    }

    /* JADX INFO: renamed from: a */
    public final void m5456a(C1489c c1489c) {
        this.f6467h = c1489c;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0081  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5457a(com.anythink.expressad.foundation.p116d.C1782d r8) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.advanced.p078c.C1426a.m5457a(com.anythink.expressad.foundation.d.d):void");
    }

    /* JADX INFO: renamed from: b */
    public final void m5458b() {
        if (this.f6464e != null) {
            this.f6464e = null;
        }
        m5433b("LoadManager release", this.f6474t);
        if (this.f6477w != null) {
            this.f6477w = null;
        }
        if (this.f6478x != null) {
            this.f6478x = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1781c m5459c() {
        return this.f6468i;
    }
}
