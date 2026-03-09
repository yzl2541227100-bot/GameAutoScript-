package com.anythink.core.common.res;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.image.C1382a;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.res.b */
/* JADX INFO: loaded from: classes.dex */
public class C1378b {

    /* JADX INFO: renamed from: b */
    private static final String f5530b = "ImageLoader";

    /* JADX INFO: renamed from: c */
    private static volatile C1378b f5531c;

    /* JADX INFO: renamed from: a */
    public Context f5532a;

    /* JADX INFO: renamed from: d */
    private Map<String, Integer> f5533d;

    /* JADX INFO: renamed from: e */
    private C1379c<String, SoftReference<Bitmap>> f5534e;

    /* JADX INFO: renamed from: f */
    private final Object f5535f = new Object();

    /* JADX INFO: renamed from: g */
    private final ConcurrentHashMap<String, List<a>> f5536g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.anythink.core.common.res.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Bitmap f5537a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ a f5538b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f5539c;

        public AnonymousClass1(Bitmap bitmap, a aVar, String str) {
            this.f5537a = bitmap;
            this.f5538b = aVar;
            this.f5539c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap = this.f5537a;
            if (bitmap != null) {
                this.f5538b.onSuccess(this.f5539c, bitmap);
            } else {
                this.f5538b.onFail(this.f5539c, "Bitmap load fail");
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.res.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ a f5541a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5542b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f5543c;

        public AnonymousClass2(a aVar, String str, String str2) {
            this.f5541a = aVar;
            this.f5542b = str;
            this.f5543c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5541a.onFail(this.f5542b, this.f5543c);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.res.b$5, reason: invalid class name */
    public class AnonymousClass5 implements C1382a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5551a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5552b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1381e f5553c;

        public AnonymousClass5(int i, int i2, C1381e c1381e) {
            this.f5551a = i;
            this.f5552b = i2;
            this.f5553c = c1381e;
        }

        @Override // com.anythink.core.common.res.image.C1382a.a
        /* JADX INFO: renamed from: a */
        public final void mo4500a(C1381e c1381e) {
            new StringBuilder("Load Success:").append(c1381e.f5580f);
            Bitmap bitmapM4493a = C1378b.this.m4493a(c1381e, this.f5551a, this.f5552b);
            if (bitmapM4493a != null) {
                C1378b.this.m4496a(c1381e.f5580f, bitmapM4493a);
            }
            C1378b.m4487a(C1378b.this, this.f5553c.f5580f, bitmapM4493a);
        }

        @Override // com.anythink.core.common.res.image.C1382a.a
        /* JADX INFO: renamed from: a */
        public final void mo4501a(C1381e c1381e, String str) {
            C1378b.m4488a(C1378b.this, c1381e.f5580f, str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.res.b$a */
    public interface a {
        void onFail(String str, String str2);

        void onSuccess(String str, Bitmap bitmap);
    }

    private C1378b(Context context) {
        this.f5532a = context.getApplicationContext();
        int iMaxMemory = ((int) Runtime.getRuntime().maxMemory()) / 5;
        StringBuilder sb = new StringBuilder("ImageLoad init cache size: ");
        sb.append(iMaxMemory);
        sb.append("B");
        this.f5534e = new C1379c<String, SoftReference<Bitmap>>(iMaxMemory) { // from class: com.anythink.core.common.res.b.3
            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
            private int a2(String str, SoftReference<Bitmap> softReference) {
                Bitmap bitmap = softReference != null ? softReference.get() : null;
                if (C1378b.this.f5533d == null) {
                    C1378b.this.f5533d = new HashMap(8);
                }
                if (bitmap != null) {
                    int rowBytes = bitmap.getRowBytes() * bitmap.getHeight();
                    C1378b.this.f5533d.put(str, Integer.valueOf(rowBytes));
                    return rowBytes;
                }
                Integer num = (Integer) C1378b.this.f5533d.get(str);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }

            /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
            private void a2(boolean z, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
                Bitmap bitmap;
                super.mo4499a(z, str, softReference, softReference2);
                if (softReference != null) {
                    try {
                        bitmap = softReference.get();
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    bitmap = null;
                }
                if (C1378b.this.f5533d != null) {
                    C1378b.this.f5533d.remove(str);
                }
                if (softReference == null || softReference.equals(softReference2) || bitmap == null || bitmap.isRecycled()) {
                    return;
                }
                bitmap.recycle();
            }

            @Override // com.anythink.core.common.res.C1379c
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int mo4498a(String str, SoftReference<Bitmap> softReference) {
                String str2 = str;
                SoftReference<Bitmap> softReference2 = softReference;
                Bitmap bitmap = softReference2 != null ? softReference2.get() : null;
                if (C1378b.this.f5533d == null) {
                    C1378b.this.f5533d = new HashMap(8);
                }
                if (bitmap != null) {
                    int rowBytes = bitmap.getRowBytes() * bitmap.getHeight();
                    C1378b.this.f5533d.put(str2, Integer.valueOf(rowBytes));
                    return rowBytes;
                }
                Integer num = (Integer) C1378b.this.f5533d.get(str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }

            @Override // com.anythink.core.common.res.C1379c
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo4499a(boolean z, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
                Bitmap bitmap;
                String str2 = str;
                SoftReference<Bitmap> softReference3 = softReference;
                SoftReference<Bitmap> softReference4 = softReference2;
                super.mo4499a(z, str2, softReference3, softReference4);
                if (softReference3 != null) {
                    try {
                        bitmap = softReference3.get();
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    bitmap = null;
                }
                if (C1378b.this.f5533d != null) {
                    C1378b.this.f5533d.remove(str2);
                }
                if (softReference3 == null || softReference3.equals(softReference4) || bitmap == null || bitmap.isRecycled()) {
                    return;
                }
                bitmap.recycle();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m4481a(String str) {
        SoftReference<Bitmap> softReferenceM4516a = this.f5534e.m4516a(str);
        if (softReferenceM4516a != null) {
            return softReferenceM4516a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C1378b m4482a(Context context) {
        if (f5531c == null) {
            synchronized (C1378b.class) {
                if (f5531c == null) {
                    f5531c = new C1378b(context);
                }
            }
        }
        return f5531c;
    }

    /* JADX INFO: renamed from: a */
    private void m4485a() {
        try {
            C1379c<String, SoftReference<Bitmap>> c1379c = this.f5534e;
            if (c1379c != null) {
                c1379c.m4517a();
            }
            ConcurrentHashMap<String, List<a>> concurrentHashMap = this.f5536g;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4486a(C1378b c1378b, C1381e c1381e, int i, int i2, a aVar) {
        synchronized (c1378b.f5536g) {
            if (c1378b.f5536g.containsKey(c1381e.f5580f)) {
                LinkedList linkedList = (LinkedList) c1378b.f5536g.get(c1381e.f5580f);
                if (linkedList != null && aVar != null && !linkedList.contains(aVar)) {
                    linkedList.add(aVar);
                }
            } else {
                if (aVar != null) {
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(aVar);
                    c1378b.f5536g.put(c1381e.f5580f, linkedList2);
                }
                C1382a c1382a = new C1382a(c1381e);
                c1382a.m4533a(c1378b.new AnonymousClass5(i, i2, c1381e));
                c1382a.m4539d();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4487a(C1378b c1378b, String str, Bitmap bitmap) {
        LinkedList<a> linkedList;
        synchronized (c1378b.f5536g) {
            try {
                linkedList = (LinkedList) c1378b.f5536g.remove(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (linkedList != null) {
                for (a aVar : linkedList) {
                    if (aVar != null) {
                        C1175n.m2059a().m2135b(c1378b.new AnonymousClass1(bitmap, aVar, str));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4488a(C1378b c1378b, String str, String str2) {
        LinkedList<a> linkedList;
        synchronized (c1378b.f5536g) {
            try {
                linkedList = (LinkedList) c1378b.f5536g.remove(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (linkedList != null) {
                for (a aVar : linkedList) {
                    if (aVar != null) {
                        C1175n.m2059a().m2135b(c1378b.new AnonymousClass2(aVar, str, str2));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4489a(String str, String str2) {
        LinkedList<a> linkedList;
        synchronized (this.f5536g) {
            try {
                linkedList = (LinkedList) this.f5536g.remove(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (linkedList != null) {
                for (a aVar : linkedList) {
                    if (aVar != null) {
                        C1175n.m2059a().m2135b(new AnonymousClass2(aVar, str, str2));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4491b(C1381e c1381e, int i, int i2, a aVar) {
        synchronized (this.f5536g) {
            if (this.f5536g.containsKey(c1381e.f5580f)) {
                LinkedList linkedList = (LinkedList) this.f5536g.get(c1381e.f5580f);
                if (linkedList != null && aVar != null && !linkedList.contains(aVar)) {
                    linkedList.add(aVar);
                }
            } else {
                if (aVar != null) {
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(aVar);
                    this.f5536g.put(c1381e.f5580f, linkedList2);
                }
                C1382a c1382a = new C1382a(c1381e);
                c1382a.m4533a(new AnonymousClass5(i, i2, c1381e));
                c1382a.m4539d();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4492b(String str, Bitmap bitmap) {
        LinkedList<a> linkedList;
        synchronized (this.f5536g) {
            try {
                linkedList = (LinkedList) this.f5536g.remove(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (linkedList != null) {
                for (a aVar : linkedList) {
                    if (aVar != null) {
                        C1175n.m2059a().m2135b(new AnonymousClass1(bitmap, aVar, str));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004b A[EXC_TOP_SPLITTER, PHI: r0
  0x004b: PHI (r0v2 android.graphics.Bitmap) = (r0v0 android.graphics.Bitmap), (r0v4 android.graphics.Bitmap) binds: [B:22:0x004f, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m4493a(com.anythink.core.common.res.C1381e r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L57
            java.lang.String r1 = r5.f5580f
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lc
            goto L57
        Lc:
            java.lang.String r1 = r5.f5580f
            java.lang.String r1 = com.anythink.core.common.p066o.C1343g.m4123a(r1)
            if (r6 > 0) goto L20
            android.content.Context r2 = r4.f5532a     // Catch: java.lang.Throwable -> L2e
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L2e
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L2e
            int r6 = r2.widthPixels     // Catch: java.lang.Throwable -> L2e
        L20:
            if (r7 > 0) goto L2e
            android.content.Context r2 = r4.f5532a     // Catch: java.lang.Throwable -> L2e
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L2e
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L2e
            int r7 = r2.heightPixels     // Catch: java.lang.Throwable -> L2e
        L2e:
            java.lang.Object r2 = r4.f5535f
            monitor-enter(r2)
            android.content.Context r3 = r4.f5532a     // Catch: java.lang.Throwable -> L54
            com.anythink.core.common.res.d r3 = com.anythink.core.common.res.C1380d.m4520a(r3)     // Catch: java.lang.Throwable -> L54
            int r5 = r5.f5579e     // Catch: java.lang.Throwable -> L54
            java.io.FileInputStream r5 = r3.m4522a(r5, r1)     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L41
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            return r0
        L41:
            java.io.FileDescriptor r1 = r5.getFD()     // Catch: java.lang.Throwable -> L4f
            android.graphics.Bitmap r0 = com.anythink.core.common.p066o.C1339c.m4023a(r1, r6, r7)     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L52
        L4b:
            r5.close()     // Catch: java.lang.Exception -> L52 java.lang.Throwable -> L54
            goto L52
        L4f:
            if (r5 == 0) goto L52
            goto L4b
        L52:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            return r0
        L54:
            r5 = move-exception
            monitor-exit(r2)
            throw r5
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.C1378b.m4493a(com.anythink.core.common.res.e, int, int):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: a */
    public final void m4494a(final C1381e c1381e, final int i, final int i2, final a aVar) {
        if (c1381e == null || TextUtils.isEmpty(c1381e.f5580f)) {
            if (aVar != null) {
                aVar.onFail("", "No url info.");
                return;
            }
            return;
        }
        Bitmap bitmapM4481a = m4481a(c1381e.f5580f);
        if (bitmapM4481a == null || bitmapM4481a.isRecycled()) {
            C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.res.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmapM4493a = C1378b.this.m4493a(c1381e, i, i2);
                    if (bitmapM4493a == null || bitmapM4493a.isRecycled()) {
                        C1378b.m4486a(C1378b.this, c1381e, i, i2, aVar);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("url image [");
                    sb.append(c1381e.f5580f);
                    sb.append("] is downloaded");
                    C1378b.this.m4496a(c1381e.f5580f, bitmapM4493a);
                    if (aVar != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(aVar);
                        C1378b.this.f5536g.put(c1381e.f5580f, linkedList);
                    }
                    C1378b.m4487a(C1378b.this, c1381e.f5580f, bitmapM4493a);
                }
            }, 2, true);
        } else if (aVar != null) {
            aVar.onSuccess(c1381e.f5580f, bitmapM4481a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4495a(C1381e c1381e, a aVar) {
        m4494a(c1381e, -1, -1, aVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m4496a(String str, Bitmap bitmap) {
        if (m4481a(str) != null || bitmap == null) {
            return;
        }
        this.f5534e.m4518b(str, new SoftReference<>(bitmap));
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m4497b(C1381e c1381e, int i, int i2) {
        if (TextUtils.isEmpty(c1381e.f5580f)) {
            return null;
        }
        Bitmap bitmapM4481a = m4481a(c1381e.f5580f);
        if (bitmapM4481a != null && !bitmapM4481a.isRecycled()) {
            return bitmapM4481a;
        }
        Bitmap bitmapM4493a = m4493a(c1381e, i, i2);
        if (bitmapM4493a != null && !bitmapM4493a.isRecycled()) {
            m4496a(c1381e.f5580f, bitmapM4493a);
        }
        return bitmapM4493a;
    }
}
