package com.anythink.basead.p022f.p023a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.p014b.C0741c;
import com.anythink.basead.p015c.C0745c;
import com.anythink.core.common.p055f.C1261z;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.anythink.basead.f.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0783b {

    /* JADX INFO: renamed from: a */
    private static C0783b f986a;

    /* JADX INFO: renamed from: b */
    private Context f987b;

    /* JADX INFO: renamed from: d */
    private ConcurrentHashMap<String, C0745c> f989d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    private SimpleDateFormat f988c = new SimpleDateFormat("yyyyMMdd");

    private C0783b(Context context) {
        this.f987b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static C0783b m572a(Context context) {
        if (f986a == null) {
            f986a = new C0783b(context);
        }
        return f986a;
    }

    /* JADX INFO: renamed from: a */
    public final String m573a() {
        List<C0745c> listM289b = C0741c.m284a(this.f987b).m289b(this.f988c.format(new Date(System.currentTimeMillis())));
        JSONArray jSONArray = new JSONArray();
        if (listM289b != null) {
            Iterator<C0745c> it = listM289b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f691a);
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m574a(C1261z c1261z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.f988c.format(new Date(jCurrentTimeMillis));
        final C0745c c0745cM578d = m578d(c1261z);
        if (c0745cM578d.f696f.equals(str)) {
            c0745cM578d.f694d++;
        } else {
            c0745cM578d.f694d = 1;
            c0745cM578d.f696f = str;
        }
        c0745cM578d.f695e = jCurrentTimeMillis;
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.basead.f.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                C0741c.m284a(C0783b.this.f987b).m290c(c0745cM578d.f696f);
                C0741c.m284a(C0783b.this.f987b).m287a(c0745cM578d);
            }
        }, 2, true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m575a(String str) {
        List<C1261z> listM5046R;
        C1396f c1396fM5139a = C1398h.m5135a(this.f987b).m5139a(str);
        if (c1396fM5139a == null || (listM5046R = c1396fM5139a.m5046R()) == null || listM5046R.size() <= 0) {
            return false;
        }
        Iterator<C1261z> it = listM5046R.iterator();
        while (it.hasNext()) {
            if (!m576b(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m576b(C1261z c1261z) {
        C0745c c0745cM578d = m578d(c1261z);
        int i = c1261z.f4525c;
        return i != -1 && c0745cM578d.f694d >= i;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m577c(C1261z c1261z) {
        return System.currentTimeMillis() - m578d(c1261z).f695e <= c1261z.f4526d;
    }

    /* JADX INFO: renamed from: d */
    public final C0745c m578d(C1261z c1261z) {
        String str = this.f988c.format(new Date(System.currentTimeMillis()));
        C0745c c0745cM288a = this.f989d.get(c1261z.m3229t());
        if (c0745cM288a == null) {
            c0745cM288a = C0741c.m284a(this.f987b).m288a(c1261z.m3229t());
            if (c0745cM288a == null) {
                c0745cM288a = new C0745c();
                c0745cM288a.f691a = c1261z.m3229t();
                c0745cM288a.f692b = c1261z.f4525c;
                c0745cM288a.f693c = c1261z.f4526d;
                c0745cM288a.f695e = 0L;
                c0745cM288a.f694d = 0;
                c0745cM288a.f696f = str;
            }
            this.f989d.put(c1261z.m3229t(), c0745cM288a);
        }
        if (!TextUtils.equals(str, c0745cM288a.f696f)) {
            c0745cM288a.f696f = str;
            c0745cM288a.f694d = 0;
        }
        return c0745cM288a;
    }
}
