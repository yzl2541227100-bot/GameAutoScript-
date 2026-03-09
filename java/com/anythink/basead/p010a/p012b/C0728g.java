package com.anythink.basead.p010a.p012b;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1380d;
import com.anythink.expressad.exoplayer.C1575f;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.anythink.basead.a.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0728g {

    /* JADX INFO: renamed from: com.anythink.basead.a.b.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f555a;

        /* JADX INFO: renamed from: b */
        public int f556b;
    }

    /* JADX INFO: renamed from: a */
    private static a m227a(int i, int i2, int i3, int i4) {
        if (i == 0 || i2 == 0) {
            return null;
        }
        a aVar = new a();
        float f = (i * 1.0f) / i2;
        if (f < (i3 * 1.0f) / i4) {
            aVar.f556b = i4;
            aVar.f555a = (int) (i4 * f);
        } else {
            aVar.f555a = i3;
            aVar.f556b = (int) (i3 / f);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    private static a m228a(FileDescriptor fileDescriptor) {
        a aVar = null;
        if (fileDescriptor == null) {
            return null;
        }
        try {
            a aVar2 = new a();
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(fileDescriptor);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                mediaMetadataRetriever.release();
                aVar2.f555a = Integer.parseInt(strExtractMetadata);
                aVar2.f556b = Integer.parseInt(strExtractMetadata2);
                return aVar2;
            } catch (Exception e) {
                e = e;
                aVar = aVar2;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    private static a m229a(FileDescriptor fileDescriptor, int i, int i2) {
        a aVarM228a = m228a(fileDescriptor);
        if (aVarM228a == null) {
            return null;
        }
        if ((aVarM228a.f555a * 1.0f) / aVarM228a.f556b < (i * 1.0f) / i2) {
            aVarM228a.f556b = i2;
            aVarM228a.f555a = (int) Math.ceil(i2 * r0);
        } else {
            aVarM228a.f555a = i;
            aVarM228a.f556b = (int) Math.ceil(i / r0);
        }
        return aVarM228a;
    }

    /* JADX INFO: renamed from: a */
    public static a m230a(String str) {
        a aVar = null;
        try {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return null;
            }
            a aVar2 = new a();
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                mediaMetadataRetriever.release();
                aVar2.f555a = Integer.parseInt(strExtractMetadata);
                aVar2.f556b = Integer.parseInt(strExtractMetadata2);
                return aVar2;
            } catch (Exception e) {
                e = e;
                aVar = aVar2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m231a(final AbstractC1247l abstractC1247l, AbstractC1249n abstractC1249n) {
        if (abstractC1247l == null) {
            return;
        }
        synchronized (abstractC1247l) {
            if (abstractC1247l != null) {
                if (!abstractC1247l.m3180T() && !TextUtils.isEmpty(abstractC1247l.m3159B())) {
                    abstractC1247l.m3181U();
                    if (String.valueOf(abstractC1249n.m3387z()).equals("3") && abstractC1247l.m3168G() == 1 && abstractC1249n.m3265K().equals("2")) {
                        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.basead.a.b.g.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                final ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                                executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: com.anythink.basead.a.b.g.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        try {
                                            a aVarM230a = C0728g.m230a(C1380d.m4520a(C1175n.m2059a().m2148f()).m4532c(4, C1343g.m4123a(abstractC1247l.m3159B())));
                                            if (aVarM230a != null) {
                                                abstractC1247l.m3206j(aVarM230a.f555a);
                                                abstractC1247l.m3208k(aVarM230a.f556b);
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        try {
                                            synchronized (executorServiceNewFixedThreadPool) {
                                                executorServiceNewFixedThreadPool.notifyAll();
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                });
                                try {
                                    synchronized (executorServiceNewFixedThreadPool) {
                                        executorServiceNewFixedThreadPool.wait(C1575f.f8394a);
                                    }
                                    executorServiceNewFixedThreadPool.shutdownNow();
                                } catch (Throwable unused) {
                                }
                            }
                        }, 2, true);
                    }
                }
            }
        }
    }
}
