package com.anythink.expressad.mbbanner.p139a.p143d;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p120g.p123c.C1814d;
import com.anythink.expressad.foundation.p120g.p123c.EnumC1811a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p138h.C1882p;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.mbbanner.p139a.p141b.C1907e;
import com.anythink.expressad.mbbanner.p139a.p142c.C1913f;
import com.anythink.expressad.mbbanner.p139a.p142c.C1914g;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1909b;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1911d;
import com.anythink.expressad.mbbanner.p139a.p144e.C1918a;
import com.anythink.expressad.mbbanner.p139a.p144e.C1919b;
import com.anythink.expressad.reward.p146a.C1962d;
import com.anythink.expressad.videocommon.p178b.C2324i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1916b {

    /* JADX INFO: renamed from: a */
    private static final String f11785a = "b";

    /* JADX INFO: renamed from: b */
    private Context f11786b;

    /* JADX INFO: renamed from: d */
    private C1907e f11788d;

    /* JADX INFO: renamed from: e */
    private C1918a f11789e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1909b f11790f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1911d f11791g;

    /* JADX INFO: renamed from: c */
    private int f11787c = 0;

    /* JADX INFO: renamed from: h */
    private volatile boolean f11792h = false;

    /* JADX INFO: renamed from: i */
    private Timer f11793i = new Timer();

    /* JADX INFO: renamed from: j */
    private volatile List<String> f11794j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private volatile boolean f11795k = false;

    /* JADX INFO: renamed from: l */
    private volatile boolean f11796l = false;

    /* JADX INFO: renamed from: m */
    private volatile boolean f11797m = false;

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.b$1, reason: invalid class name */
    public class AnonymousClass1 extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f11798a;

        public AnonymousClass1(String str) {
            this.f11798a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (C1916b.this.f11792h) {
                return;
            }
            C1916b.m9993b(C1916b.this);
            C1916b.this.m9998a(this.f11798a, -1, "", false);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.d.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1782d f11800a;

        public AnonymousClass2(C1782d c1782d) {
            this.f11800a = c1782d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<C1781c> arrayList;
            String unused = C1916b.f11785a;
            C1782d c1782d = this.f11800a;
            if (c1782d != null && (arrayList = c1782d.f10572J) != null && arrayList.size() > 0) {
                Context unused2 = C1916b.this.f11786b;
                C1919b.m10069a();
            }
            String unused3 = C1916b.f11785a;
        }
    }

    public C1916b(Context context, C1907e c1907e, InterfaceC1909b interfaceC1909b, C1918a c1918a) {
        this.f11786b = context.getApplicationContext();
        this.f11788d = c1907e;
        this.f11790f = interfaceC1909b;
        this.f11789e = c1918a;
    }

    /* JADX INFO: renamed from: a */
    private String m9983a(String str, String str2) throws Throwable {
        String str3 = "";
        if (!TextUtils.isEmpty(str2)) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    String strM9407b = C1814d.m9407b(EnumC1811a.ANYTHINK_700_HTML);
                    String strM9771a = C1882p.m9771a(C1890x.m9869a(str2));
                    if (TextUtils.isEmpty(strM9771a)) {
                        strM9771a = String.valueOf(System.currentTimeMillis());
                    }
                    File file = new File(strM9407b, strM9771a.concat(".html"));
                    Uri.parse(str2).getPath();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(str2.getBytes());
                        fileOutputStream2.flush();
                        String absolutePath = file.getAbsolutePath();
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        str3 = absolutePath;
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e5) {
                e = e5;
            }
            File file2 = new File(str3);
            m9998a(str, 2, str2, file2.exists() && file2.isFile() && file2.canRead());
        }
        return str3;
    }

    /* JADX INFO: renamed from: a */
    private List<C1781c> m9984a(C1782d c1782d) {
        ArrayList arrayList = new ArrayList();
        if (c1782d != null) {
            try {
                ArrayList<C1781c> arrayList2 = c1782d.f10572J;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList<C1781c> arrayList3 = c1782d.f10572J;
                    new StringBuilder("getNeedShowList total campaign:").append(arrayList3.size());
                    for (int i = 0; i < arrayList3.size(); i++) {
                        C1781c c1781c = arrayList3.get(i);
                        if (c1781c != null && c1781c.m8807O() != 99 && (!TextUtils.isEmpty(c1781c.m8901p()) || !TextUtils.isEmpty(c1781c.m8903q()) || !TextUtils.isEmpty(c1781c.m10151be()))) {
                            if (C1886t.m9828a(c1781c)) {
                                c1781c.m8882i(C1886t.m9827a(this.f11786b, c1781c.m10147ba()) ? 1 : 2);
                            }
                            if (c1781c.m8836ae() == 1 || !C1886t.m9827a(this.f11786b, c1781c.m10147ba()) || C1886t.m9828a(c1781c)) {
                                arrayList.add(c1781c);
                            }
                        }
                    }
                    new StringBuilder("getNeedShowList return these campaign with video res:").append(arrayList.size());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m9985a(String str) {
        if (this.f11797m) {
            return;
        }
        if ((this.f11795k || this.f11796l) && this.f11794j.size() == 0) {
            this.f11792h = true;
            this.f11797m = true;
            this.f11793i.cancel();
            this.f11789e.m10063a(this.f11790f, str);
            this.f11791g.mo9972a(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9986a(String str, List<C1781c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C1781c c1781c : list) {
            if (!TextUtils.isEmpty(c1781c.m10151be())) {
                this.f11794j.add(c1781c.m10151be());
                C1818b.m9427a(this.f11786b).m9443a(c1781c.m10151be(), new C1914g(this, str));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private String m9988b() {
        return this.f11788d.m9947a();
    }

    /* JADX INFO: renamed from: b */
    private void m9989b(C1782d c1782d) {
        new Thread(new AnonymousClass2(c1782d)).start();
    }

    /* JADX INFO: renamed from: b */
    private void m9990b(String str) {
        this.f11792h = true;
        this.f11789e.m10065b(this.f11790f, str);
        this.f11791g.mo9972a(str);
    }

    /* JADX INFO: renamed from: b */
    private void m9991b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        C2324i.m11867a().m11880a(str2, new C1913f(this, str));
    }

    /* JADX INFO: renamed from: b */
    private void m9992b(String str, List<C1781c> list) {
        int size = this.f11787c;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    size += list.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (size > this.f11788d.m9951c()) {
            size = 0;
        }
        if (C1889w.m9868b(str)) {
            this.f11788d.m9948a(size);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m9993b(C1916b c1916b) {
        c1916b.f11792h = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    private int m9994c() {
        try {
            int iM9950b = this.f11788d.m9950b();
            if (iM9950b > this.f11788d.m9951c()) {
                return 0;
            }
            return iM9950b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m9996c(String str) {
        this.f11793i.schedule(new AnonymousClass1(str), 60000L);
    }

    /* JADX INFO: renamed from: d */
    private void m9997d(String str) {
        this.f11788d.m9949a(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m9998a(String str, int i, String str2, boolean z) {
        if (!z) {
            if (i == -1) {
                StringBuilder sb = new StringBuilder(" unitId =");
                sb.append(str);
                sb.append(" --> time out!");
            }
            this.f11793i.cancel();
            this.f11792h = true;
            this.f11789e.m10065b(this.f11790f, str);
            this.f11791g.mo9972a(str);
            return;
        }
        if (i == 1) {
            synchronized (this) {
                this.f11794j.remove(str2);
                if (this.f11794j.size() == 0) {
                    m9985a(str);
                }
            }
            return;
        }
        if (i == 2) {
            this.f11796l = true;
            m9985a(str);
        } else if (i == 3) {
            this.f11795k = true;
            m9985a(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9999a(String str, C1782d c1782d, InterfaceC1911d interfaceC1911d) throws Throwable {
        C1918a c1918a;
        InterfaceC1909b interfaceC1909b;
        String str2;
        this.f11791g = interfaceC1911d;
        if (c1782d == null) {
            c1918a = this.f11789e;
            interfaceC1909b = this.f11790f;
            str2 = "campaignUnit is NULL!";
        } else {
            List<C1781c> listM9984a = m9984a(c1782d);
            new Thread(new AnonymousClass2(c1782d)).start();
            if (listM9984a.size() != 0) {
                this.f11793i.schedule(new AnonymousClass1(str), 60000L);
                this.f11788d.m9949a(c1782d.m9021c());
                int size = this.f11787c;
                int i = 0;
                try {
                    if (listM9984a.size() > 0) {
                        size += listM9984a.size();
                    }
                    if (size > this.f11788d.m9951c()) {
                        size = 0;
                    }
                    if (C1889w.m9868b(str)) {
                        this.f11788d.m9948a(size);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C1781c c1781c = listM9984a.get(0);
                String strTrim = c1781c.m8901p().trim();
                if (TextUtils.isEmpty(strTrim)) {
                    String strTrim2 = c1781c.m8903q().trim();
                    if (TextUtils.isEmpty(strTrim2)) {
                        this.f11796l = true;
                        this.f11795k = true;
                    } else {
                        String strM9983a = m9983a(str, strTrim2);
                        if (listM9984a.size() > 0) {
                            while (i < listM9984a.size()) {
                                listM9984a.get(i).m8871e(strM9983a);
                                listM9984a.get(i).m8824a(strTrim2.contains("<MBTPLMARK>"));
                                i++;
                            }
                        }
                    }
                } else {
                    if (!TextUtils.isEmpty(strTrim)) {
                        C2324i.m11867a().m11880a(strTrim, new C1913f(this, str));
                    }
                    if (listM9984a.size() > 0) {
                        while (i < listM9984a.size()) {
                            listM9984a.get(i).m8868d(c1781c.m8901p());
                            listM9984a.get(i).m8824a(true);
                            i++;
                        }
                    }
                }
                m9986a(str, listM9984a);
                return;
            }
            c1918a = this.f11789e;
            interfaceC1909b = this.f11790f;
            str2 = C1962d.f12129a;
        }
        c1918a.m10064a(interfaceC1909b, str2, str);
        this.f11791g.mo9972a(str);
    }
}
