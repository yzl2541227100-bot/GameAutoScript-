package mobi.oneway.export.p281f;

import android.os.Build;
import com.anythink.basead.p010a.C0732e;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mobi.oneway.export.C3580a;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.EventType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p274a.C3582b;
import mobi.oneway.export.p279d.C3608f;
import mobi.oneway.export.p283g.C3629a;
import mobi.oneway.export.p283g.C3633e;
import mobi.oneway.export.p283g.C3634f;
import mobi.oneway.export.p283g.C3640l;
import mobi.oneway.export.p283g.C3642n;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.f.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3625e {

    /* JADX INFO: renamed from: g */
    private static ExecutorService f19762g = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a */
    private Long f19763a = 0L;

    /* JADX INFO: renamed from: b */
    private AdType f19764b;

    /* JADX INFO: renamed from: c */
    private String f19765c;

    /* JADX INFO: renamed from: d */
    private C3613a f19766d;

    /* JADX INFO: renamed from: e */
    private String f19767e;

    /* JADX INFO: renamed from: f */
    private String f19768f;

    /* JADX INFO: renamed from: mobi.oneway.export.f.e$1 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19769a;

        static {
            int[] iArr = new int[EventType.values().length];
            f19769a = iArr;
            try {
                iArr[EventType.ready.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19769a[EventType.show.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19769a[EventType.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19769a[EventType.click.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19769a[EventType.close.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19769a[EventType.reward.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19769a[EventType.skip.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19769a[EventType.adFail.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: mobi.oneway.export.f.e$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public EventType f19770a;

        public a(EventType eventType) {
            this.f19770a = eventType;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                C3608f c3608fM16767a = new C3608f(C3581a.f19604e, C3581a.f19603d).m16767a("eventName", (Object) this.f19770a.toString()).m16767a("publishId", (Object) C3582b.m16654b()).m16767a("token", (Object) C3582b.m16658d()).m16767a("adType", Integer.valueOf(C3625e.this.f19764b.value())).m16767a("dmd", (Object) Build.MODEL).m16767a("dmk", (Object) Build.BRAND).m16767a("ip", (Object) C3642n.m16999a(C3582b.m16650a())).m16767a("osv", (Object) Build.VERSION.RELEASE);
                if (C3582b.m16657c()) {
                    c3608fM16767a.m16767a(C0732e.f588a, Boolean.valueOf(C3582b.m16657c()));
                }
                c3608fM16767a.m16780c("POST").m16766a(C3625e.this.m16883a()).m16792n();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C3625e(AdType adType, C3613a c3613a) {
        this.f19764b = adType;
        this.f19766d = c3613a;
        this.f19767e = c3613a.m16845g();
        this.f19768f = c3613a.m16844f();
    }

    /* JADX INFO: renamed from: a */
    public String m16883a() {
        String strM16904a = "";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", C3622b.m16853a(this.f19766d.m16823a(), this.f19767e, this.f19768f));
            jSONObject.put("v", this.f19766d.m16841d());
            jSONObject.put(C1801a.f10988Z, C3580a.f19599f);
            jSONObject.put("ssv", C3634f.m16933c());
            jSONObject.put("wv", "");
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put("did", C3634f.m16929a());
            jSONObject.put("bdid", C3634f.m16932b());
            jSONObject.put("dos", "Android");
            jSONObject.put("ua", C3634f.m16934d());
            jSONObject.put(C1485b.f7188dx, C3634f.m16936f());
            jSONObject.put(C1801a.f10981S, C3634f.m16937g());
            jSONObject.put("osv", Build.VERSION.RELEASE);
            jSONObject.put("dmd", Build.MODEL);
            jSONObject.put("dmk", Build.BRAND);
            jSONObject.put("aid", C3634f.m16935e());
            jSONObject.put("bssid", C3634f.m16939i());
            jSONObject.put("ssid", C3634f.m16938h());
            jSONObject.put("simopt", C3634f.m16940j());
            jSONObject.put("simoptn", C3634f.m16941k());
            jSONObject.put("lng", C3640l.m16985b());
            jSONObject.put("lat", C3640l.m16983a());
            jSONObject.put("adp", this.f19766d.m16823a());
            jSONObject.put("ip", C3642n.m16999a(C3582b.m16650a()));
            jSONObject.put("adts", this.f19763a);
            jSONObject.put("crc", this.f19766d.m16837b());
            jSONObject.put(C1485b.f7040bH, C3582b.m16659e());
            jSONObject.put("slt", this.f19766d.m16839c());
            jSONObject.put("dt", this.f19765c);
            jSONObject.put(C1485b.f6981aB, this.f19767e);
            jSONObject.put("thirdPid", this.f19768f);
            jSONObject.put("oaid", m16887c());
            strM16904a = C3582b.m16657c() ? C3629a.m16904a(jSONObject.toString(), C3582b.m16658d(), C3582b.m16654b()) : jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strM16904a;
    }

    /* JADX INFO: renamed from: b */
    private void m16886b() {
        this.f19763a = Long.valueOf(System.currentTimeMillis());
        C3622b.m16854a(this.f19766d.m16823a(), this.f19767e, this.f19768f, C3633e.m16928a(C3582b.m16654b() + "-" + this.f19764b.value() + "-" + this.f19763a).longValue());
        this.f19765c = "";
    }

    /* JADX INFO: renamed from: c */
    private String m16887c() {
        try {
            Field declaredField = this.f19766d.m16843e().loadClass("mobi.oneway.third_common.util.oaid.OaidHolder").getDeclaredField("oaid");
            declaredField.setAccessible(true);
            return (String) declaredField.get(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x002c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16888a(mobi.oneway.export.enums.EventType r4, java.lang.String r5) {
        /*
            r3 = this;
            mobi.oneway.export.f.a r0 = r3.f19766d
            int r0 = r0.m16823a()
            r1 = 1
            if (r0 != r1) goto La
            return
        La:
            int[] r0 = mobi.oneway.export.p281f.C3625e.AnonymousClass1.f19769a
            int r2 = r4.ordinal()
            r0 = r0[r2]
            if (r0 == r1) goto L2c
            r1 = 2
            if (r0 == r1) goto L22
            r1 = 8
            if (r0 == r1) goto L1c
            goto L2f
        L1c:
            r3.m16886b()
            r3.f19765c = r5
            goto L2f
        L22:
            mobi.oneway.export.enums.AdType r5 = r3.f19764b
            mobi.oneway.export.enums.AdType r0 = mobi.oneway.export.enums.AdType.splash
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L2f
        L2c:
            r3.m16886b()
        L2f:
            java.util.concurrent.ExecutorService r5 = mobi.oneway.export.p281f.C3625e.f19762g
            mobi.oneway.export.f.e$a r0 = new mobi.oneway.export.f.e$a
            r0.<init>(r4)
            r5.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.oneway.export.p281f.C3625e.m16888a(mobi.oneway.export.enums.EventType, java.lang.String):void");
    }

    /* JADX INFO: renamed from: a */
    public void m16889a(EventType eventType, OnewaySdkError onewaySdkError, String str) {
        m16888a(eventType, onewaySdkError + "--" + str);
    }
}
