package com.anythink.basead.p010a.p012b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.mraid.C0801d;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.basead.p010a.p011a.InterfaceC0719b;
import com.anythink.basead.p010a.p011a.InterfaceC0720c;
import com.anythink.basead.p010a.p012b.C0725d;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;
import com.anythink.core.common.p065n.C1319b;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.basead.a.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0723b implements C0725d.a {

    /* JADX INFO: renamed from: a */
    public static final String f505a = "b";

    /* JADX INFO: renamed from: b */
    public AbstractC1247l f506b;

    /* JADX INFO: renamed from: c */
    public AbstractC1249n f507c;

    /* JADX INFO: renamed from: d */
    public C1248m f508d;

    /* JADX INFO: renamed from: e */
    public InterfaceRunnableC1313b f509e = new InterfaceRunnableC1313b() { // from class: com.anythink.basead.a.b.b.1
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0723b.this.m174a(C0748f.m310a("20001", C0748f.f735q));
        }
    };

    /* JADX INFO: renamed from: f */
    private String f510f;

    /* JADX INFO: renamed from: g */
    private boolean f511g;

    /* JADX INFO: renamed from: h */
    private int f512h;

    /* JADX INFO: renamed from: i */
    private String f513i;

    /* JADX INFO: renamed from: j */
    private List<String> f514j;

    /* JADX INFO: renamed from: k */
    private b f515k;

    /* JADX INFO: renamed from: l */
    private InterfaceC0720c<Void, C0747e> f516l;

    /* JADX INFO: renamed from: m */
    private MraidWebView f517m;

    /* JADX INFO: renamed from: n */
    private volatile boolean f518n;

    /* JADX INFO: renamed from: com.anythink.basead.a.b.b$1 */
    public class AnonymousClass1 implements InterfaceRunnableC1313b {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0723b.this.m174a(C0748f.m310a("20001", C0748f.f735q));
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b.b$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f520a;

        public AnonymousClass2(String str) {
            this.f520a = str;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            C1319b.m3821a();
            String strM3822a = C1319b.m3822a(C0723b.this.f508d);
            C1319b c1319bM3821a = C1319b.m3821a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("recordOfferGetImageSizeStartTime, ");
            sb.append(strM3822a);
            sb.append(", timeStamp: ");
            sb.append(jCurrentTimeMillis);
            c1319bM3821a.m3832a(strM3822a).f3736d = jCurrentTimeMillis;
            C0723b.m173a(C0723b.this, this.f520a);
            C1319b c1319bM3821a2 = C1319b.m3821a();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder("recordOfferGetImageSizeEndTime, ");
            sb2.append(strM3822a);
            sb2.append(", timeStamp: ");
            sb2.append(jCurrentTimeMillis2);
            c1319bM3821a2.m3832a(strM3822a).f3737e = jCurrentTimeMillis2;
            C0723b.this.m180c();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b.b$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f522a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f523b;

        /* JADX INFO: renamed from: com.anythink.basead.a.b.b$3$1 */
        public class AnonymousClass1 implements C0801d.a {
            public AnonymousClass1() {
            }

            @Override // com.anythink.basead.mraid.C0801d.a
            /* JADX INFO: renamed from: a */
            public final void mo189a() {
                C0723b.this.m180c();
            }

            @Override // com.anythink.basead.mraid.C0801d.a
            /* JADX INFO: renamed from: a */
            public final void mo190a(C0747e c0747e) {
                C0723b.this.m174a(c0747e);
            }
        }

        public AnonymousClass3(String str, String str2) {
            this.f522a = str;
            this.f523b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C0723b.this.f517m = new MraidWebView(C1175n.m2059a().m2148f());
                String str = this.f522a;
                String str2 = this.f523b;
                MraidWebView mraidWebView = C0723b.this.f517m;
                AnonymousClass1 anonymousClass1 = new C0801d.a() { // from class: com.anythink.basead.a.b.b.3.1
                    public AnonymousClass1() {
                    }

                    @Override // com.anythink.basead.mraid.C0801d.a
                    /* JADX INFO: renamed from: a */
                    public final void mo189a() {
                        C0723b.this.m180c();
                    }

                    @Override // com.anythink.basead.mraid.C0801d.a
                    /* JADX INFO: renamed from: a */
                    public final void mo190a(C0747e c0747e) {
                        C0723b.this.m174a(c0747e);
                    }
                };
                C0723b c0723b = C0723b.this;
                C0801d.m663a(str, str2, mraidWebView, anonymousClass1, c0723b.f506b, c0723b.f508d, 5);
            } catch (Throwable th) {
                C0723b.this.m174a(C0748f.m310a(C0748f.f708G, C0748f.f717P + th.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b.b$a */
    public class a implements InterfaceC0719b<Void, C0747e> {
        private a() {
        }

        public /* synthetic */ a(C0723b c0723b, byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private void a2(C0747e c0747e) {
            if (C0723b.this.f515k != null) {
                String str = C0723b.f505a;
                new StringBuilder("Offer load failed, OfferId -> ").append(C0723b.this.f513i);
                C0723b.this.f515k.mo193a(c0747e);
            }
            C0723b.m184e(C0723b.this);
        }

        /* JADX INFO: renamed from: b */
        private void m191b() {
            if (C0723b.this.f515k != null) {
                String str = C0723b.f505a;
                new StringBuilder("Offer load success, OfferId -> ").append(C0723b.this.f513i);
                C0723b.this.f515k.mo192a();
            }
            C0723b.m184e(C0723b.this);
        }

        @Override // com.anythink.basead.p010a.p011a.InterfaceC0719b
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo137a() {
            if (C0723b.this.f515k != null) {
                String str = C0723b.f505a;
                new StringBuilder("Offer load success, OfferId -> ").append(C0723b.this.f513i);
                C0723b.this.f515k.mo192a();
            }
            C0723b.m184e(C0723b.this);
        }

        @Override // com.anythink.basead.p010a.p011a.InterfaceC0719b
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo138a(C0747e c0747e) {
            C0747e c0747e2 = c0747e;
            if (C0723b.this.f515k != null) {
                String str = C0723b.f505a;
                new StringBuilder("Offer load failed, OfferId -> ").append(C0723b.this.f513i);
                C0723b.this.f515k.mo193a(c0747e2);
            }
            C0723b.m184e(C0723b.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.a.b.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo192a();

        /* JADX INFO: renamed from: a */
        void mo193a(C0747e c0747e);
    }

    public C0723b(String str, boolean z, AbstractC1247l abstractC1247l, C1248m c1248m) {
        this.f510f = str;
        this.f511g = z;
        this.f506b = abstractC1247l;
        this.f508d = c1248m;
        AbstractC1249n abstractC1249n = c1248m.f4333n;
        this.f507c = abstractC1249n;
        this.f512h = abstractC1249n.m3373s();
        C0722a c0722a = new C0722a();
        this.f516l = c0722a;
        c0722a.mo135a((InterfaceC0719b) new a(this, (byte) 0));
    }

    /* JADX INFO: renamed from: a */
    private void m170a() {
        List<String> listMo2425b = this.f506b.mo2425b(this.f507c);
        if (listMo2425b == null) {
            m174a(C0748f.m310a(C0748f.f731m, "Incomplete resource allocation! MissResource: ".concat(String.valueOf(this.f506b.mo2427q()))));
            return;
        }
        int size = listMo2425b.size();
        if (size == 0) {
            m180c();
            return;
        }
        this.f514j = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = listMo2425b.get(i);
            if (!TextUtils.isEmpty(str)) {
                if (this.f506b.m3166E(str)) {
                    if (!C0724c.m198a(this.f506b, this.f507c) && !this.f514j.contains(str)) {
                        StringBuilder sb = new StringBuilder("videoInfo:video file is not ready to play -> ");
                        sb.append(str);
                        sb.append(",need readyRate:");
                        sb.append(this.f507c.m3289W());
                        this.f514j.add(str);
                    }
                } else if (!C0724c.m204c(str) && !this.f514j.contains(str)) {
                    this.f514j.add(str);
                }
            }
        }
        int size2 = this.f514j.size();
        if (size2 == 0) {
            StringBuilder sb2 = new StringBuilder("Offer(");
            sb2.append(this.f513i);
            sb2.append("), all files have already exist");
            m180c();
            return;
        }
        synchronized (this) {
            C0725d.m205a().m206a(this);
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = this.f514j.get(i2);
                boolean zM3166E = this.f506b.m3166E(str2);
                int iM3289W = this.f507c.m3289W();
                if (zM3166E) {
                    if (C0724c.m198a(this.f506b, this.f507c)) {
                        StringBuilder sb3 = new StringBuilder("Video file ready -> ");
                        sb3.append(str2);
                        sb3.append(",videoNeedReadyRate:");
                        sb3.append(iM3289W);
                        C0725d.m205a().m207a(str2, iM3289W);
                    } else {
                        StringBuilder sb4 = new StringBuilder("Video file not exis -> ");
                        sb4.append(str2);
                        sb4.append(",videoNeedReadyRate:");
                        sb4.append(iM3289W);
                        new C0727f(this.f510f, this.f506b, this.f507c).m221a();
                    }
                } else if (!C0724c.m200a(str2)) {
                    if (C0724c.m204c(str2)) {
                        C0724c.m194a(str2, 100);
                        C0725d.m205a().m207a(str2, 100);
                    } else {
                        C0724c.m194a(str2, 0);
                        new C0726e(this.f510f, this.f511g, this.f506b, str2).m4539d();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0074  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m173a(com.anythink.basead.p010a.p012b.C0723b r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            java.io.InputStream r2 = r2.openStream()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            r3.<init>()     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            r4 = 1
            r3.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            android.graphics.BitmapFactory.decodeStream(r2, r0, r3)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            int r0 = r3.outWidth     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            int r3 = r3.outHeight     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            java.lang.String r5 = "getImageDimensions, width: "
            r4.<init>(r5)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            r4.append(r0)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            java.lang.String r5 = ", height: "
            r4.append(r5)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            r4.append(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            if (r2 == 0) goto L6e
            r2.close()     // Catch: java.io.IOException -> L32
            goto L6e
        L32:
            r9 = move-exception
            r9.printStackTrace()
            goto L6e
        L37:
            r4 = move-exception
            goto L3b
        L39:
            r4 = move-exception
            r3 = 0
        L3b:
            r7 = r2
            r2 = r0
            r0 = r7
            goto L4a
        L3f:
            r8 = move-exception
            r0 = r2
            goto L80
        L42:
            r4 = move-exception
            r0 = r2
            goto L48
        L45:
            r8 = move-exception
            goto L80
        L47:
            r4 = move-exception
        L48:
            r2 = 0
            r3 = 0
        L4a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "getImageDimensions, "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L45
            r5.append(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = ", \n error: "
            r5.append(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = r4.getMessage()     // Catch: java.lang.Throwable -> L45
            r5.append(r9)     // Catch: java.lang.Throwable -> L45
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r9 = move-exception
            r9.printStackTrace()
        L6d:
            r0 = r2
        L6e:
            if (r0 >= 0) goto L71
            r0 = 0
        L71:
            if (r3 >= 0) goto L74
            goto L75
        L74:
            r1 = r3
        L75:
            com.anythink.core.common.f.l r9 = r8.f506b
            r9.m3215m(r0)
            com.anythink.core.common.f.l r8 = r8.f506b
            r8.m3218n(r1)
            return
        L80:
            if (r0 == 0) goto L8a
            r0.close()     // Catch: java.io.IOException -> L86
            goto L8a
        L86:
            r9 = move-exception
            r9.printStackTrace()
        L8a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p010a.p012b.C0723b.m173a(com.anythink.basead.a.b.b, java.lang.String):void");
    }

    /* JADX INFO: renamed from: a */
    public void m174a(C0747e c0747e) {
        this.f518n = true;
        InterfaceC0720c<Void, C0747e> interfaceC0720c = this.f516l;
        if (interfaceC0720c != null) {
            interfaceC0720c.mo136a(c0747e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0074  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m175a(java.lang.String r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            java.io.InputStream r2 = r2.openStream()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            r3.<init>()     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            r4 = 1
            r3.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            android.graphics.BitmapFactory.decodeStream(r2, r0, r3)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            int r0 = r3.outWidth     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L42
            int r3 = r3.outHeight     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            java.lang.String r5 = "getImageDimensions, width: "
            r4.<init>(r5)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            r4.append(r0)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            java.lang.String r5 = ", height: "
            r4.append(r5)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            r4.append(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L3f
            if (r2 == 0) goto L6e
            r2.close()     // Catch: java.io.IOException -> L32
            goto L6e
        L32:
            r9 = move-exception
            r9.printStackTrace()
            goto L6e
        L37:
            r4 = move-exception
            goto L3b
        L39:
            r4 = move-exception
            r3 = 0
        L3b:
            r7 = r2
            r2 = r0
            r0 = r7
            goto L4a
        L3f:
            r9 = move-exception
            r0 = r2
            goto L80
        L42:
            r4 = move-exception
            r0 = r2
            goto L48
        L45:
            r9 = move-exception
            goto L80
        L47:
            r4 = move-exception
        L48:
            r2 = 0
            r3 = 0
        L4a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "getImageDimensions, "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L45
            r5.append(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = ", \n error: "
            r5.append(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = r4.getMessage()     // Catch: java.lang.Throwable -> L45
            r5.append(r9)     // Catch: java.lang.Throwable -> L45
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r9 = move-exception
            r9.printStackTrace()
        L6d:
            r0 = r2
        L6e:
            if (r0 >= 0) goto L71
            r0 = 0
        L71:
            if (r3 >= 0) goto L74
            goto L75
        L74:
            r1 = r3
        L75:
            com.anythink.core.common.f.l r9 = r8.f506b
            r9.m3215m(r0)
            com.anythink.core.common.f.l r9 = r8.f506b
            r9.m3218n(r1)
            return
        L80:
            if (r0 == 0) goto L8a
            r0.close()     // Catch: java.io.IOException -> L86
            goto L8a
        L86:
            r0 = move-exception
            r0.printStackTrace()
        L8a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p010a.p012b.C0723b.m175a(java.lang.String):void");
    }

    /* JADX INFO: renamed from: a */
    private void m176a(boolean z) {
        String strM662a = C0801d.m662a(this.f508d, this.f506b);
        if (TextUtils.isEmpty(strM662a)) {
            m174a(C0748f.m310a(C0748f.f708G, C0748f.f714M));
        } else if (!z) {
            m180c();
        } else {
            C1175n.m2059a().m2135b(new AnonymousClass3(C0724c.m202b(this.f508d, this.f506b), strM662a));
        }
    }

    /* JADX INFO: renamed from: b */
    private void m178b() {
        C1248m c1248m = this.f508d;
        if (!c1248m.f4335p) {
            m180c();
            return;
        }
        if (!String.valueOf(c1248m.f4329j).equals("0")) {
            m180c();
            return;
        }
        AbstractC1247l abstractC1247l = this.f506b;
        if ((abstractC1247l instanceof C1245j) && !TextUtils.isEmpty(((C1245j) abstractC1247l).m3144a())) {
            m180c();
            return;
        }
        if (this.f508d.f4334o) {
            m180c();
            return;
        }
        String strM3239y = this.f506b.m3239y();
        if (TextUtils.isEmpty(strM3239y)) {
            m180c();
        } else {
            C1335b.m3998a().m4007a((Runnable) new AnonymousClass2(strM3239y), 4, true);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m180c() {
        InterfaceC0720c<Void, C0747e> interfaceC0720c = this.f516l;
        if (interfaceC0720c != null) {
            interfaceC0720c.mo133a();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m182d() {
        C0725d.m205a().m209b(this);
        C1315d.m3806a().mo3801b(this.f509e);
    }

    /* JADX INFO: renamed from: e */
    private void m183e() {
        C1315d.m3806a().mo3800a(this.f509e, this.f512h, false);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m184e(C0723b c0723b) {
        C0725d.m205a().m209b(c0723b);
        C1315d.m3806a().mo3801b(c0723b.f509e);
    }

    /* JADX INFO: renamed from: f */
    private void m185f() {
        C1248m c1248m = this.f508d;
        if (c1248m == null || c1248m.f4333n == null) {
            return;
        }
        Context contextM2148f = C1175n.m2059a().m2148f();
        int iMin = 0;
        try {
            iMin = Math.min(contextM2148f.getResources().getDisplayMetrics().widthPixels, contextM2148f.getResources().getDisplayMetrics().heightPixels) / 2;
        } catch (Throwable unused) {
        }
        if (String.valueOf(this.f508d.f4329j).equals("1") && !this.f506b.m3170I() && this.f508d.f4333n.m3309aj() != 1) {
            C1391a c1391aM4865b = C1392b.m4845a(contextM2148f).m4865b(C1175n.m2059a().m2165o());
            int iM3310ak = this.f508d.f4333n.m3310ak();
            List<String> listM4764i = iM3310ak != 2 ? iM3310ak != 3 ? iM3310ak != 5 ? null : c1391aM4865b.m4764i() : c1391aM4865b.m4765j() : c1391aM4865b.m4763h();
            if (listM4764i != null && listM4764i.size() > 0) {
                for (String str : listM4764i) {
                    if (!TextUtils.isEmpty(str) && !C0724c.m203b(str, 3)) {
                        C1378b.m4482a(contextM2148f).m4494a(new C1381e(3, str), iMin, iMin, null);
                    }
                }
            }
        }
        if (this.f508d.f4333n.m3277Q() != 1 || TextUtils.isEmpty(this.f508d.f4333n.m3319b())) {
            return;
        }
        C1378b.m4482a(contextM2148f).m4494a(new C1381e(3, this.f508d.f4333n.m3319b()), iMin, iMin, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x010f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m186a(com.anythink.basead.p010a.p012b.C0723b.b r12) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p010a.p012b.C0723b.m186a(com.anythink.basead.a.b.b$b):void");
    }

    @Override // com.anythink.basead.p010a.p012b.C0725d.a
    /* JADX INFO: renamed from: a */
    public final void mo187a(String str, int i) {
        synchronized (this) {
            C0724c.m194a(str, i);
            if (this.f514j.contains(str) && (!this.f506b.m3166E(str) || this.f507c.m3289W() <= i)) {
                if (this.f506b.m3166E(str)) {
                    C0728g.m231a(this.f506b, this.f507c);
                }
                List<String> list = this.f514j;
                if (list != null) {
                    list.remove(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f513i);
                    sb.append(" onResourceLoadSuccess -> resourceUrl:");
                    sb.append(str);
                    sb.append(",curmUrlList.size():");
                    sb.append(this.f514j.size());
                    if (this.f514j.size() == 0) {
                        m180c();
                    }
                }
            }
        }
    }

    @Override // com.anythink.basead.p010a.p012b.C0725d.a
    /* JADX INFO: renamed from: a */
    public final void mo188a(String str, C0747e c0747e) {
        synchronized (this) {
            C0724c.m194a(str, -1);
            m174a(c0747e);
        }
    }
}
