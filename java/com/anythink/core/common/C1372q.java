package com.anythink.core.common;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1172k;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1244i;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.p066o.C1351o;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1398h;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.q */
/* JADX INFO: loaded from: classes.dex */
public class C1372q {

    /* JADX INFO: renamed from: a */
    public static final String f5458a = "q";

    /* JADX INFO: renamed from: b */
    private static volatile C1372q f5459b;

    /* JADX INFO: renamed from: c */
    private Context f5460c;

    private C1372q(Context context) {
        this.f5460c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static C1372q m4390a(Context context) {
        if (f5459b == null) {
            synchronized (C1372q.class) {
                if (f5459b == null) {
                    f5459b = new C1372q(context);
                }
            }
        }
        return f5459b;
    }

    /* JADX INFO: renamed from: a */
    private void m4391a(int i, String str, String str2, String str3, String str4, C1243h c1243h) {
        if (this.f5460c == null) {
            return;
        }
        try {
            Intent intent = new Intent(str);
            intent.putExtra("common", str2);
            intent.putExtra("data", str3);
            intent.putExtra("adsourceId", str4);
            intent.putExtra("networkType", String.valueOf(c1243h.m3039P()));
            intent.putExtra("format", c1243h.m2679aj());
            intent.putExtra("showid", c1243h.m3129t());
            intent.putExtra("tktype", i);
            intent.setPackage(this.f5460c.getPackageName());
            C1172k.m2050a(this.f5460c).m2053a(intent);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4392a(C1372q c1372q, int i, String str, String str2, String str3, String str4, C1243h c1243h) {
        if (c1372q.f5460c != null) {
            try {
                Intent intent = new Intent(str);
                intent.putExtra("common", str2);
                intent.putExtra("data", str3);
                intent.putExtra("adsourceId", str4);
                intent.putExtra("networkType", String.valueOf(c1243h.m3039P()));
                intent.putExtra("format", c1243h.m2679aj());
                intent.putExtra("showid", c1243h.m3129t());
                intent.putExtra("tktype", i);
                intent.setPackage(c1372q.f5460c.getPackageName());
                C1172k.m2050a(c1372q.f5460c).m2053a(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4393a(final int i, final C1244i c1244i, final C1391a c1391a) {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.q.1
            @Override // java.lang.Runnable
            public final void run() {
                Map<String, String> mapM4718O;
                String str;
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(c1244i.f4224b.m2677ah()) == null) {
                        return;
                    }
                    String strM3026F = ((C1243h) c1244i.f4224b).m3026F();
                    if (TextUtils.isEmpty(strM3026F)) {
                        return;
                    }
                    String str2 = null;
                    int i2 = i;
                    if (i2 == 4) {
                        z = ((C1243h) c1244i.f4224b).m3018B() == 1;
                        mapM4718O = c1391a.m4718O();
                        str = "show";
                    } else {
                        if (i2 != 6) {
                            switch (i2) {
                                case 18:
                                case 19:
                                case 20:
                                    z = ((C1243h) c1244i.f4224b).m3100j() == 1;
                                    mapM4718O = c1391a.m4718O();
                                    str = "dl";
                                    break;
                            }
                            if (z && !TextUtils.isEmpty(str2)) {
                                JSONObject jSONObjectM4205a = C1351o.m4205a();
                                String str3 = C1372q.f5458a;
                                new StringBuilder("common -> ").append(jSONObjectM4205a.toString());
                                new StringBuilder("data -> ").append(c1244i.mo3143a().toString());
                                C1372q.m4392a(C1372q.this, i, str2, jSONObjectM4205a.toString(), c1244i.mo3143a().toString(), strM3026F, (C1243h) c1244i.f4224b);
                            }
                            String str4 = C1372q.f5458a;
                            new StringBuilder("handleTK cost time: ").append(System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                        z = ((C1243h) c1244i.f4224b).m3020C() == 1;
                        mapM4718O = c1391a.m4718O();
                        str = C1781c.f10313ca;
                    }
                    str2 = mapM4718O.get(str);
                    if (z) {
                        JSONObject jSONObjectM4205a2 = C1351o.m4205a();
                        String str32 = C1372q.f5458a;
                        new StringBuilder("common -> ").append(jSONObjectM4205a2.toString());
                        new StringBuilder("data -> ").append(c1244i.mo3143a().toString());
                        C1372q.m4392a(C1372q.this, i, str2, jSONObjectM4205a2.toString(), c1244i.mo3143a().toString(), strM3026F, (C1243h) c1244i.f4224b);
                    }
                    String str42 = C1372q.f5458a;
                    new StringBuilder("handleTK cost time: ").append(System.currentTimeMillis() - jCurrentTimeMillis);
                } catch (Throwable unused) {
                }
            }
        }, 13, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m4394a(final C1391a c1391a) {
        C1335b.m3998a().m4008a(new Runnable() { // from class: com.anythink.core.common.q.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (C1372q.this.f5460c == null) {
                        return;
                    }
                    String packageName = C1372q.this.f5460c.getPackageName();
                    String str = "";
                    for (int i = 0; i < 2; i++) {
                        str = str + packageName;
                    }
                    String strM4127c = C1343g.m4127c(str);
                    Intent intent = new Intent(strM4127c);
                    intent.putExtra(strM4127c, c1391a.m4713J());
                    intent.putExtra("data", C1351o.m4205a().toString());
                    intent.putExtra("denied", C1175n.m2059a().m2147e());
                    intent.setPackage(packageName);
                    C1172k.m2050a(C1372q.this.f5460c).m2053a(intent);
                } catch (Throwable unused) {
                }
            }
        }, 1000L);
    }
}
