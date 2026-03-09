package com.anythink.china.common.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.anythink.china.common.C1066a;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.china.common.p033a.C1071d;
import com.anythink.china.common.p033a.C1072e;
import com.anythink.china.common.p035b.C1076a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ApkDownloadService extends Service {

    /* JADX INFO: renamed from: a */
    public static final String f2503a = "extra_unique_id";

    /* JADX INFO: renamed from: b */
    private static final String f2504b = ApkDownloadService.class.getSimpleName();

    /* JADX INFO: renamed from: c */
    private Map<String, C1071d> f2505c = new HashMap();

    /* JADX INFO: renamed from: com.anythink.china.common.service.ApkDownloadService$1 */
    public class C10831 implements AbstractC1067a.a {
        public C10831() {
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: a */
        public final void mo1464a(C1072e c1072e, long j) {
            if (ApkDownloadService.this.f2505c != null) {
                ApkDownloadService.this.f2505c.remove(c1072e.f2458n);
            }
            AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e.f2458n);
            if (aVarM1457c != null) {
                aVarM1457c.mo1464a(c1072e, j);
            }
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: a */
        public final void mo1465a(C1072e c1072e, long j, long j2) {
            AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e.f2458n);
            if (aVarM1457c != null) {
                aVarM1457c.mo1465a(c1072e, j, j2);
            }
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: a */
        public final void mo1466a(C1072e c1072e, long j, long j2, int i) {
            if (ApkDownloadService.this.f2505c != null) {
                ApkDownloadService.this.f2505c.remove(c1072e.f2458n);
            }
            AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e.f2458n);
            if (aVarM1457c != null) {
                aVarM1457c.mo1466a(c1072e, j, j2, i);
            }
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: a */
        public final void mo1467a(C1072e c1072e, String str) {
            if (ApkDownloadService.this.f2505c != null) {
                ApkDownloadService.this.f2505c.remove(c1072e.f2458n);
            }
            AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e.f2458n);
            if (aVarM1457c != null) {
                aVarM1457c.mo1467a(c1072e, str);
            }
        }

        @Override // com.anythink.china.common.p033a.AbstractC1067a.a
        /* JADX INFO: renamed from: b */
        public final void mo1468b(C1072e c1072e, long j, long j2) {
            AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e.f2458n);
            if (aVarM1457c != null) {
                aVarM1457c.mo1468b(c1072e, j, j2);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.common.service.ApkDownloadService$a */
    public class BinderC1084a extends Binder implements InterfaceC1085a {
        public BinderC1084a() {
        }

        @Override // com.anythink.china.common.service.InterfaceC1085a
        /* JADX INFO: renamed from: a */
        public final void mo1562a(String str) {
            ApkDownloadService.this.m1561a(str);
        }

        @Override // com.anythink.china.common.service.InterfaceC1085a
        /* JADX INFO: renamed from: a */
        public final boolean mo1563a() {
            return ApkDownloadService.this.f2505c.size() == 0;
        }

        @Override // com.anythink.china.common.service.InterfaceC1085a
        /* JADX INFO: renamed from: b */
        public final void mo1564b(String str) {
            C1071d c1071d = (C1071d) ApkDownloadService.this.f2505c.get(str);
            if (c1071d != null) {
                c1071d.m1486b();
                ApkDownloadService.this.f2505c.remove(str);
            }
        }

        @Override // com.anythink.china.common.service.InterfaceC1085a
        /* JADX INFO: renamed from: c */
        public final void mo1565c(String str) {
            C1071d c1071d = (C1071d) ApkDownloadService.this.f2505c.get(str);
            if (c1071d != null) {
                c1071d.m1482a();
                ApkDownloadService.this.f2505c.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1561a(String str) {
        try {
            C1072e c1072e = C1066a.m1427a(getApplicationContext()).m1463f().get(str);
            if (c1072e == null) {
                return;
            }
            C1071d c1071d = new C1071d(c1072e);
            c1071d.m1483a(new AbstractC1067a.a() { // from class: com.anythink.china.common.service.ApkDownloadService.1
                public C10831() {
                }

                @Override // com.anythink.china.common.p033a.AbstractC1067a.a
                /* JADX INFO: renamed from: a */
                public final void mo1464a(C1072e c1072e2, long j) {
                    if (ApkDownloadService.this.f2505c != null) {
                        ApkDownloadService.this.f2505c.remove(c1072e2.f2458n);
                    }
                    AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e2.f2458n);
                    if (aVarM1457c != null) {
                        aVarM1457c.mo1464a(c1072e2, j);
                    }
                }

                @Override // com.anythink.china.common.p033a.AbstractC1067a.a
                /* JADX INFO: renamed from: a */
                public final void mo1465a(C1072e c1072e2, long j, long j2) {
                    AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e2.f2458n);
                    if (aVarM1457c != null) {
                        aVarM1457c.mo1465a(c1072e2, j, j2);
                    }
                }

                @Override // com.anythink.china.common.p033a.AbstractC1067a.a
                /* JADX INFO: renamed from: a */
                public final void mo1466a(C1072e c1072e2, long j, long j2, int i) {
                    if (ApkDownloadService.this.f2505c != null) {
                        ApkDownloadService.this.f2505c.remove(c1072e2.f2458n);
                    }
                    AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e2.f2458n);
                    if (aVarM1457c != null) {
                        aVarM1457c.mo1466a(c1072e2, j, j2, i);
                    }
                }

                @Override // com.anythink.china.common.p033a.AbstractC1067a.a
                /* JADX INFO: renamed from: a */
                public final void mo1467a(C1072e c1072e2, String str2) {
                    if (ApkDownloadService.this.f2505c != null) {
                        ApkDownloadService.this.f2505c.remove(c1072e2.f2458n);
                    }
                    AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e2.f2458n);
                    if (aVarM1457c != null) {
                        aVarM1457c.mo1467a(c1072e2, str2);
                    }
                }

                @Override // com.anythink.china.common.p033a.AbstractC1067a.a
                /* JADX INFO: renamed from: b */
                public final void mo1468b(C1072e c1072e2, long j, long j2) {
                    AbstractC1067a.a aVarM1457c = C1066a.m1427a(ApkDownloadService.this.getApplicationContext()).m1457c(c1072e2.f2458n);
                    if (aVarM1457c != null) {
                        aVarM1457c.mo1468b(c1072e2, j, j2);
                    }
                }
            });
            Map<String, C1071d> map = this.f2505c;
            if (map != null) {
                map.put(str, c1071d);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        if (intent != null) {
            m1561a(intent.getStringExtra(f2503a));
        }
        return new BinderC1084a();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        C1076a.m1523a(getApplicationContext()).m1528a();
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
