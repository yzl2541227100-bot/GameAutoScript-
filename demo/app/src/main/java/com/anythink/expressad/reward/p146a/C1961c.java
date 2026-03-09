package com.anythink.expressad.reward.p146a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.multidex.MultiDexExtractor;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.p081a.C1441a;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.exoplayer.C1575f;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.p154bt.module.AnythinkBTLayout;
import com.anythink.expressad.video.p154bt.module.AnythinkBTRootLayout;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.videocommon.C2314a;
import com.anythink.expressad.videocommon.p178b.C2320e;
import com.anythink.expressad.videocommon.p178b.C2324i;
import com.anythink.expressad.videocommon.p178b.C2325j;
import com.anythink.expressad.videocommon.p178b.C2327l;
import com.anythink.expressad.videocommon.p178b.C2328m;
import com.anythink.expressad.videocommon.p180d.InterfaceC2336c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.reward.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1961c {

    /* JADX INFO: renamed from: a */
    private static final String f11965a = "RewardCampaignsResourceManager";

    /* JADX INFO: renamed from: d */
    private static Map<String, a> f11966d = null;

    /* JADX INFO: renamed from: f */
    private static final int f11967f = 100;

    /* JADX INFO: renamed from: g */
    private static final int f11968g = 200;

    /* JADX INFO: renamed from: h */
    private static final int f11969h = 101;

    /* JADX INFO: renamed from: i */
    private static final int f11970i = 201;

    /* JADX INFO: renamed from: j */
    private static final int f11971j = 102;

    /* JADX INFO: renamed from: k */
    private static final int f11972k = 202;

    /* JADX INFO: renamed from: l */
    private static final int f11973l = 103;

    /* JADX INFO: renamed from: m */
    private static final int f11974m = 203;

    /* JADX INFO: renamed from: n */
    private static final int f11975n = 104;

    /* JADX INFO: renamed from: o */
    private static final int f11976o = 204;

    /* JADX INFO: renamed from: p */
    private static final int f11977p = 105;

    /* JADX INFO: renamed from: q */
    private static final int f11978q = 205;

    /* JADX INFO: renamed from: r */
    private static final int f11979r = 0;

    /* JADX INFO: renamed from: s */
    private static final int f11980s = 1;

    /* JADX INFO: renamed from: b */
    private final h f11981b;

    /* JADX INFO: renamed from: c */
    private ConcurrentHashMap<String, List<C1781c>> f11982c;

    /* JADX INFO: renamed from: e */
    private boolean f11983e;

    /* JADX INFO: renamed from: t */
    private volatile List<WindVaneWebView> f11984t;

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f11998a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ WindVaneWebView f11999b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1781c f12000c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List f12001d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f12002e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C2340d f12003f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f12004g;

        public AnonymousClass3(boolean z, WindVaneWebView windVaneWebView, C1781c c1781c, List list, String str, C2340d c2340d, String str2) {
            this.f11998a = z;
            this.f11999b = windVaneWebView;
            this.f12000c = c1781c;
            this.f12001d = list;
            this.f12002e = str;
            this.f12003f = c2340d;
            this.f12004g = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1961c.m10216a(this.f11998a, this.f11999b, this.f12000c.m8805M().m8957e(), this.f12000c, this.f12001d, C2324i.m11867a().m11883c(this.f12000c.m8805M().m8957e()), this.f12002e, this.f12003f, this.f12004g, C1961c.this.f11983e);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f12006a;

        /* JADX INFO: renamed from: b */
        public boolean f12007b;

        /* JADX INFO: renamed from: c */
        public int f12008c;

        /* JADX INFO: renamed from: d */
        public int f12009d;

        /* JADX INFO: renamed from: e */
        public String f12010e;

        /* JADX INFO: renamed from: f */
        public String f12011f;

        /* JADX INFO: renamed from: g */
        public int f12012g;

        /* JADX INFO: renamed from: h */
        public CopyOnWriteArrayList<C1781c> f12013h;

        /* JADX INFO: renamed from: i */
        public CopyOnWriteArrayList<C1781c> f12014i;

        public a(boolean z, boolean z3, int i, int i2, String str, String str2, int i3, CopyOnWriteArrayList<C1781c> copyOnWriteArrayList) {
            this.f12006a = z;
            this.f12007b = z3;
            this.f12008c = i;
            this.f12009d = i2;
            this.f12010e = str;
            this.f12011f = str2;
            this.f12012g = i3;
            this.f12013h = copyOnWriteArrayList;
            this.f12014i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$b */
    public static class b extends C1441a {

        /* JADX INFO: renamed from: b */
        private final Handler f12015b;

        /* JADX INFO: renamed from: c */
        private final Runnable f12016c;

        /* JADX INFO: renamed from: d */
        private final boolean f12017d;

        /* JADX INFO: renamed from: e */
        private final boolean f12018e;

        /* JADX INFO: renamed from: f */
        private int f12019f;

        /* JADX INFO: renamed from: g */
        private String f12020g;

        /* JADX INFO: renamed from: h */
        private String f12021h;

        /* JADX INFO: renamed from: i */
        private String f12022i;

        /* JADX INFO: renamed from: j */
        private String f12023j;

        /* JADX INFO: renamed from: k */
        private C2314a.a f12024k;

        /* JADX INFO: renamed from: l */
        private C1781c f12025l;

        /* JADX INFO: renamed from: m */
        private CopyOnWriteArrayList<C1781c> f12026m;

        /* JADX INFO: renamed from: n */
        private C2340d f12027n;

        /* JADX INFO: renamed from: o */
        private final j f12028o;

        /* JADX INFO: renamed from: q */
        private boolean f12030q;

        /* JADX INFO: renamed from: r */
        private boolean f12031r;

        /* JADX INFO: renamed from: t */
        private boolean f12033t;

        /* JADX INFO: renamed from: u */
        private long f12034u;

        /* JADX INFO: renamed from: s */
        private int f12032s = 0;

        /* JADX INFO: renamed from: p */
        private boolean f12029p = false;

        public b(boolean z, Handler handler, Runnable runnable, boolean z3, boolean z4, int i, String str, String str2, String str3, String str4, C2314a.a aVar, C1781c c1781c, CopyOnWriteArrayList<C1781c> copyOnWriteArrayList, C2340d c2340d, j jVar, long j) {
            this.f12015b = handler;
            this.f12016c = runnable;
            this.f12017d = z3;
            this.f12018e = z4;
            this.f12019f = i;
            this.f12020g = str;
            this.f12022i = str2;
            this.f12021h = str3;
            this.f12023j = str4;
            this.f12024k = aVar;
            this.f12025l = c1781c;
            this.f12026m = copyOnWriteArrayList;
            this.f12027n = c2340d;
            this.f12028o = jVar;
            this.f12033t = z;
            this.f12034u = j;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
        /* JADX INFO: renamed from: a */
        public final String mo5574a(String str) {
            return C2324i.m11867a().m11883c(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[Catch: all -> 0x0115, PHI: r0
  0x00ae: PHI (r0v16 'e' java.lang.Exception) = (r0v11 'e' java.lang.Exception), (r0v19 'e' java.lang.Exception) binds: [B:40:0x0112, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0115, blocks: (B:16:0x0062, B:18:0x0068, B:21:0x0070, B:23:0x007e, B:24:0x0083, B:27:0x00aa, B:29:0x00ae, B:30:0x00b2, B:32:0x00c0, B:34:0x00d0, B:35:0x00e6, B:36:0x00eb, B:39:0x0110), top: B:55:0x0062, inners: #0, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #2 {all -> 0x0115, blocks: (B:16:0x0062, B:18:0x0068, B:21:0x0070, B:23:0x007e, B:24:0x0083, B:27:0x00aa, B:29:0x00ae, B:30:0x00b2, B:32:0x00c0, B:34:0x00d0, B:35:0x00e6, B:36:0x00eb, B:39:0x0110), top: B:55:0x0062, inners: #0, #3 }] */
        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo5576a(java.lang.Object r18, java.lang.String r19) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.p146a.C1961c.b.mo5576a(java.lang.Object, java.lang.String):void");
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
        /* JADX INFO: renamed from: a */
        public final void mo5577a(String str, int i, int i2) {
            StringBuilder sb = new StringBuilder("loadAds: unitID ");
            sb.append(str);
            sb.append(" type ");
            sb.append(i);
            sb.append(" adType ");
            sb.append(i2);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.f12030q) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12021h);
            sb.append("_");
            sb.append(this.f12020g);
            if (!str.contains("wfr=1")) {
                C2327l.m11891a().m11908c(this.f12021h + "_" + this.f12023j + "_" + this.f12020g, true);
                Handler handler = this.f12015b;
                if (handler != null && (runnable = this.f12016c) != null) {
                    handler.removeCallbacks(runnable);
                }
                C2314a.a aVar = this.f12024k;
                if (aVar != null) {
                    aVar.m11761a(true);
                }
                j jVar = this.f12028o;
                if (jVar != null) {
                    jVar.mo10236a();
                }
            }
            C1469j.m5701a();
            C1469j.m5704b(webView);
            this.f12030q = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            StringBuilder sb = new StringBuilder("onReceivedError: ");
            sb.append(i);
            sb.append("  ");
            sb.append(str);
            C2327l.m11891a().m11908c(this.f12021h + "_" + this.f12023j + "_" + this.f12020g, false);
            if (this.f12028o != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f12021h);
                sb2.append("_");
                sb2.append(this.f12020g);
                C2314a.a aVar = this.f12024k;
                if (aVar != null) {
                    aVar.m11761a(false);
                }
                this.f12028o.mo10237a(str);
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            Runnable runnable;
            if (this.f12031r) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12021h);
            sb.append("_");
            sb.append(this.f12020g);
            StringBuilder sb2 = new StringBuilder("CampaignTPLWindVaneWebviewClient start to preload bid temp resource readyState: ");
            sb2.append(i);
            sb2.append(" isCache: ");
            sb2.append(this.f12029p);
            if (i == 1) {
                if (this.f12029p) {
                    C2314a.m11755e(this.f12021h + "_" + this.f12023j);
                } else {
                    C2314a.m11754d(this.f12021h + "_" + this.f12023j);
                }
                StringBuilder sb3 = new StringBuilder("add bid temp: ");
                sb3.append(this.f12021h);
                sb3.append("_");
                sb3.append(this.f12023j);
                sb3.append("_");
                sb3.append(this.f12020g);
                C2314a.m11745a(this.f12021h + "_" + this.f12023j + "_" + this.f12020g, this.f12024k, true, this.f12029p);
                Handler handler = this.f12015b;
                if (handler != null && (runnable = this.f12016c) != null) {
                    handler.removeCallbacks(runnable);
                }
                C2327l.m11891a().m11908c(this.f12021h + "_" + this.f12023j + "_" + this.f12020g, true);
                C2314a.a aVar = this.f12024k;
                if (aVar != null) {
                    aVar.m11761a(true);
                }
                j jVar = this.f12028o;
                if (jVar != null) {
                    jVar.mo10236a();
                }
            } else {
                C2327l.m11891a().m11908c(this.f12021h + "_" + this.f12023j + "_" + this.f12020g, false);
                C2314a.a aVar2 = this.f12024k;
                if (aVar2 != null) {
                    aVar2.m11761a(false);
                }
                j jVar2 = this.f12028o;
                if (jVar2 != null) {
                    jVar2.mo10237a("state 2");
                }
            }
            this.f12031r = true;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo10227a(String str, String str2, String str3, CopyOnWriteArrayList<C1781c> copyOnWriteArrayList);

        /* JADX INFO: renamed from: a */
        void mo10228a(String str, CopyOnWriteArrayList<C1781c> copyOnWriteArrayList);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$d */
    public static final class d implements C2324i.b {

        /* JADX INFO: renamed from: a */
        public static final int f12035a = 497;

        /* JADX INFO: renamed from: b */
        public static final int f12036b = 313;

        /* JADX INFO: renamed from: c */
        public static final int f12037c = 859;

        /* JADX INFO: renamed from: e */
        private int f12039e;

        /* JADX INFO: renamed from: f */
        private final String f12040f;

        /* JADX INFO: renamed from: g */
        private final String f12041g;

        /* JADX INFO: renamed from: h */
        private final String f12042h;

        /* JADX INFO: renamed from: i */
        private C1781c f12043i;

        /* JADX INFO: renamed from: j */
        private i f12044j;

        /* JADX INFO: renamed from: k */
        private Handler f12045k;

        /* JADX INFO: renamed from: l */
        private List<C1781c> f12046l;

        /* JADX INFO: renamed from: d */
        private boolean f12038d = false;

        /* JADX INFO: renamed from: m */
        private final long f12047m = System.currentTimeMillis();

        public d(int i, String str, String str2, String str3, C1781c c1781c, i iVar, Handler handler, List<C1781c> list) {
            this.f12039e = i;
            this.f12040f = str;
            this.f12041g = str2;
            this.f12042h = str3;
            this.f12043i = c1781c;
            this.f12044j = iVar;
            this.f12045k = handler;
            this.f12046l = list;
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5464a(String str) {
            C2327l.m11891a().m11906b(str, true);
            int i = this.f12039e;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f12041g);
                bundle.putString(C1404a.f6238y, this.f12040f);
                bundle.putString("request_id", this.f12042h);
                bundle.putString(C1781c.f10246am, str);
                messageObtain.setData(bundle);
                this.f12045k.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f12041g);
                bundle2.putString(C1404a.f6238y, this.f12040f);
                bundle2.putString("request_id", this.f12042h);
                bundle2.putString(C1781c.f10246am, str);
                messageObtain2.setData(bundle2);
                this.f12045k.sendMessage(messageObtain2);
                if (this.f12038d) {
                    System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 105;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f12041g);
            bundle3.putString(C1404a.f6238y, this.f12040f);
            bundle3.putString("request_id", this.f12042h);
            messageObtain3.setData(bundle3);
            this.f12045k.sendMessage(messageObtain3);
            i iVar = this.f12044j;
            if (iVar != null) {
                iVar.mo10235a(this.f12040f, this.f12041g, this.f12042h);
            }
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5465a(String str, String str2) {
            C2327l.m11891a().m11906b(str, false);
            int i = this.f12039e;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f12041g);
                bundle.putString(C1404a.f6238y, this.f12040f);
                bundle.putString("request_id", this.f12042h);
                bundle.putString(C1781c.f10246am, str);
                bundle.putString("message", str2);
                messageObtain.setData(bundle);
                this.f12045k.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f12041g);
                bundle2.putString(C1404a.f6238y, this.f12040f);
                bundle2.putString("request_id", this.f12042h);
                bundle2.putString(C1781c.f10246am, str);
                bundle2.putString("message", str2);
                messageObtain2.setData(bundle2);
                this.f12045k.sendMessage(messageObtain2);
                if (this.f12038d) {
                    System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 205;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f12041g);
            bundle3.putString(C1404a.f6238y, this.f12040f);
            bundle3.putString("request_id", this.f12042h);
            bundle3.putString("message", str2);
            messageObtain3.setData(bundle3);
            this.f12045k.sendMessage(messageObtain3);
            i iVar = this.f12044j;
            if (iVar != null) {
                iVar.mo10234a(this.f12041g);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m10229a(boolean z) {
            this.f12038d = z;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$e */
    public static final class e implements InterfaceC1819c {

        /* JADX INFO: renamed from: a */
        public static final int f12048a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f12049b = 1;

        /* JADX INFO: renamed from: c */
        private Handler f12050c;

        /* JADX INFO: renamed from: d */
        private int f12051d;

        /* JADX INFO: renamed from: e */
        private String f12052e;

        /* JADX INFO: renamed from: f */
        private String f12053f;

        /* JADX INFO: renamed from: g */
        private String f12054g;

        /* JADX INFO: renamed from: h */
        private C1781c f12055h;

        public e(Handler handler, int i, String str, String str2, String str3, C1781c c1781c) {
            this.f12050c = handler;
            this.f12051d = i;
            this.f12053f = str;
            this.f12052e = str2;
            this.f12054g = str3;
            this.f12055h = c1781c;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            C2327l.m11891a();
            C2327l.m11898c(str);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f12051d == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f12052e);
            bundle.putString(C1404a.f6238y, this.f12053f);
            bundle.putString("request_id", this.f12054g);
            messageObtain.setData(bundle);
            this.f12050c.sendMessage(messageObtain);
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f12051d == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f12052e);
            bundle.putString(C1404a.f6238y, this.f12053f);
            bundle.putString("request_id", this.f12054g);
            messageObtain.setData(bundle);
            this.f12050c.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$f */
    public static final class f implements InterfaceC2336c {

        /* JADX INFO: renamed from: a */
        private Handler f12056a;

        /* JADX INFO: renamed from: b */
        private final String f12057b;

        /* JADX INFO: renamed from: c */
        private final String f12058c;

        /* JADX INFO: renamed from: d */
        private final String f12059d;

        public f(Handler handler, String str, String str2, String str3) {
            this.f12056a = handler;
            this.f12058c = str;
            this.f12057b = str2;
            this.f12059d = str3;
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5460a(String str) {
            new StringBuilder("Video download success: ").append(this.f12059d);
            C2327l.m11891a().m11903a(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f12057b);
            bundle.putString(C1404a.f6238y, this.f12058c);
            bundle.putString("request_id", this.f12059d);
            bundle.putString(C1781c.f10246am, str);
            messageObtain.setData(bundle);
            this.f12056a.sendMessage(messageObtain);
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5461a(String str, String str2) {
            StringBuilder sb = new StringBuilder("Video download fail: ");
            sb.append(str);
            sb.append(C4196o4.OooO00o.OooO0Oo);
            sb.append(this.f12059d);
            C2327l.m11891a().m11903a(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f12057b);
            bundle.putString(C1404a.f6238y, this.f12058c);
            bundle.putString("request_id", this.f12059d);
            bundle.putString(C1781c.f10246am, str2);
            bundle.putString("message", str);
            messageObtain.setData(bundle);
            this.f12056a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$g */
    public static final class g implements C2324i.d {

        /* JADX INFO: renamed from: a */
        public static final int f12060a = 497;

        /* JADX INFO: renamed from: b */
        public static final int f12061b = 859;

        /* JADX INFO: renamed from: c */
        public static final int f12062c = 313;

        /* JADX INFO: renamed from: d */
        public static final int f12063d = 502;

        /* JADX INFO: renamed from: f */
        private Context f12065f;

        /* JADX INFO: renamed from: g */
        private String f12066g;

        /* JADX INFO: renamed from: h */
        private String f12067h;

        /* JADX INFO: renamed from: i */
        private String f12068i;

        /* JADX INFO: renamed from: j */
        private C1781c f12069j;

        /* JADX INFO: renamed from: k */
        private int f12070k;

        /* JADX INFO: renamed from: l */
        private Handler f12071l;

        /* JADX INFO: renamed from: m */
        private i f12072m;

        /* JADX INFO: renamed from: n */
        private List<C1781c> f12073n;

        /* JADX INFO: renamed from: e */
        private boolean f12064e = false;

        /* JADX INFO: renamed from: o */
        private long f12074o = System.currentTimeMillis();

        public g(Context context, String str, String str2, String str3, C1781c c1781c, int i, Handler handler, i iVar, List<C1781c> list) {
            this.f12065f = context;
            this.f12067h = str;
            this.f12066g = str2;
            this.f12068i = str3;
            this.f12069j = c1781c;
            this.f12070k = i;
            this.f12071l = handler;
            this.f12072m = iVar;
            this.f12073n = list;
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5464a(String str) {
            C2327l.m11891a().m11906b(str, true);
            System.currentTimeMillis();
            int i = this.f12070k;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f12066g);
                bundle.putString(C1404a.f6238y, this.f12067h);
                bundle.putString("request_id", this.f12068i);
                bundle.putString(C1781c.f10246am, str);
                messageObtain.setData(bundle);
                this.f12071l.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f12066g);
                bundle2.putString(C1404a.f6238y, this.f12067h);
                bundle2.putString("request_id", this.f12068i);
                bundle2.putString(C1781c.f10246am, str);
                messageObtain2.setData(bundle2);
                this.f12071l.sendMessage(messageObtain2);
                if (this.f12064e) {
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f12066g);
            bundle3.putString(C1404a.f6238y, this.f12067h);
            bundle3.putString("request_id", this.f12068i);
            messageObtain3.setData(bundle3);
            this.f12071l.sendMessage(messageObtain3);
            i iVar = this.f12072m;
            if (iVar != null) {
                iVar.mo10235a(this.f12067h, this.f12066g, this.f12068i);
            }
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5465a(String str, String str2) {
            C2327l.m11891a().m11906b(str2, false);
            System.currentTimeMillis();
            int i = this.f12070k;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f12066g);
                bundle.putString(C1404a.f6238y, this.f12067h);
                bundle.putString("request_id", this.f12068i);
                bundle.putString(C1781c.f10246am, str2);
                bundle.putString("message", str);
                messageObtain.setData(bundle);
                this.f12071l.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f12066g);
                bundle2.putString(C1404a.f6238y, this.f12067h);
                bundle2.putString("request_id", this.f12068i);
                bundle2.putString(C1781c.f10246am, str2);
                bundle2.putString("message", str);
                messageObtain2.setData(bundle2);
                this.f12071l.sendMessage(messageObtain2);
                if (this.f12064e) {
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 203;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f12066g);
            bundle3.putString(C1404a.f6238y, this.f12067h);
            bundle3.putString("request_id", this.f12068i);
            bundle3.putString(C1781c.f10246am, str2);
            bundle3.putString("message", str);
            messageObtain3.setData(bundle3);
            this.f12071l.sendMessage(messageObtain3);
            i iVar = this.f12072m;
            if (iVar != null) {
                iVar.mo10234a(this.f12066g);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m10230a(boolean z) {
            this.f12064e = z;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$h */
    public static final class h extends Handler {

        /* JADX INFO: renamed from: a */
        private Context f12075a;

        /* JADX INFO: renamed from: b */
        private c f12076b;

        /* JADX INFO: renamed from: c */
        private ConcurrentHashMap<String, c> f12077c;

        /* JADX INFO: renamed from: d */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<C1781c>> f12078d;

        public h(Looper looper) {
            super(looper);
            this.f12077c = new ConcurrentHashMap<>();
            this.f12078d = new ConcurrentHashMap<>();
        }

        /* JADX INFO: renamed from: a */
        public final void m10231a(Context context) {
            this.f12075a = context;
        }

        /* JADX INFO: renamed from: a */
        public final void m10232a(String str, String str2, c cVar) {
            this.f12077c.put(str + "_" + str2, cVar);
        }

        /* JADX INFO: renamed from: a */
        public final void m10233a(String str, CopyOnWriteArrayList<C1781c> copyOnWriteArrayList) {
            this.f12078d.put(str, copyOnWriteArrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:137:0x02d0 A[Catch: Exception -> 0x03b2, TryCatch #3 {Exception -> 0x03b2, blocks: (B:135:0x02ca, B:137:0x02d0, B:139:0x02e7, B:141:0x02ef, B:143:0x0306), top: B:201:0x00a0 }] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x02e7 A[Catch: Exception -> 0x03b2, TryCatch #3 {Exception -> 0x03b2, blocks: (B:135:0x02ca, B:137:0x02d0, B:139:0x02e7, B:141:0x02ef, B:143:0x0306), top: B:201:0x00a0 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r25) {
            /*
                Method dump skipped, instruction units count: 1062
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.p146a.C1961c.h.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        void mo10234a(String str);

        /* JADX INFO: renamed from: a */
        void mo10235a(String str, String str2, String str3);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        void mo10236a();

        /* JADX INFO: renamed from: a */
        void mo10237a(String str);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$k */
    public static class k extends C1442b {

        /* JADX INFO: renamed from: a */
        private Handler f12079a;

        /* JADX INFO: renamed from: b */
        private Runnable f12080b;

        /* JADX INFO: renamed from: c */
        private final boolean f12081c;

        /* JADX INFO: renamed from: e */
        private final boolean f12082e;

        /* JADX INFO: renamed from: f */
        private String f12083f;

        /* JADX INFO: renamed from: g */
        private final j f12084g;

        /* JADX INFO: renamed from: h */
        private final WindVaneWebView f12085h;

        /* JADX INFO: renamed from: i */
        private final String f12086i;

        /* JADX INFO: renamed from: j */
        private final String f12087j;

        /* JADX INFO: renamed from: k */
        private final String f12088k;

        /* JADX INFO: renamed from: l */
        private final C2314a.a f12089l;

        /* JADX INFO: renamed from: m */
        private final C1781c f12090m;

        /* JADX INFO: renamed from: n */
        private CopyOnWriteArrayList<C1781c> f12091n;

        /* JADX INFO: renamed from: o */
        private long f12092o;

        /* JADX INFO: renamed from: p */
        private boolean f12093p;

        /* JADX INFO: renamed from: q */
        private boolean f12094q;

        /* JADX INFO: renamed from: r */
        private final Runnable f12095r;

        /* JADX INFO: renamed from: s */
        private final Runnable f12096s;

        public k(Handler handler, Runnable runnable, boolean z, boolean z3, final String str, final j jVar, WindVaneWebView windVaneWebView, final String str2, final String str3, final String str4, final C2314a.a aVar, C1781c c1781c, CopyOnWriteArrayList<C1781c> copyOnWriteArrayList, long j) {
            this.f12079a = handler;
            this.f12080b = runnable;
            this.f12081c = z;
            this.f12082e = z3;
            this.f12083f = str;
            this.f12084g = jVar;
            this.f12085h = windVaneWebView;
            this.f12086i = str2;
            this.f12087j = str4;
            this.f12088k = str3;
            this.f12089l = aVar;
            this.f12090m = c1781c;
            this.f12091n = copyOnWriteArrayList;
            this.f12092o = j;
            Runnable runnable2 = new Runnable() { // from class: com.anythink.expressad.reward.a.c.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView windVaneWebViewM11758a;
                    C2314a.a aVar2;
                    if (jVar != null && (aVar2 = aVar) != null) {
                        aVar2.m11761a(true);
                        C2327l.m11891a().m11908c(str4 + "_" + str + "_" + str2, true);
                        j jVar2 = jVar;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        sb.append("_");
                        sb.append(str2);
                        jVar2.mo10236a();
                    }
                    C2314a.a aVar3 = aVar;
                    if (aVar3 == null || (windVaneWebViewM11758a = aVar3.m11758a()) == null) {
                        return;
                    }
                    try {
                        windVaneWebViewM11758a.release();
                    } catch (Exception unused) {
                    }
                }
            };
            this.f12096s = runnable2;
            this.f12095r = new Runnable() { // from class: com.anythink.expressad.reward.a.c.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView windVaneWebViewM11758a;
                    C2314a.a aVar2;
                    if (jVar != null && (aVar2 = aVar) != null) {
                        aVar2.m11761a(true);
                        C2327l.m11891a().m11908c(str4 + "_" + str + "_" + str2, true);
                        j jVar2 = jVar;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        sb.append("_");
                        sb.append(str2);
                        jVar2.mo10236a();
                    }
                    C2314a.a aVar3 = aVar;
                    if (aVar3 == null || (windVaneWebViewM11758a = aVar3.m11758a()) == null) {
                        return;
                    }
                    try {
                        windVaneWebViewM11758a.release();
                    } catch (Exception unused) {
                    }
                }
            };
            if (handler != null) {
                handler.postDelayed(runnable2, C1575f.f8394a);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[PHI: r1
  0x007f: PHI (r1v6 int) = (r1v5 int), (r1v8 int) binds: [B:25:0x007d, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[PHI: r1
  0x008b: PHI (r1v7 int) = (r1v5 int), (r1v8 int) binds: [B:25:0x007d, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onPageFinished(android.webkit.WebView r5, java.lang.String r6) {
            /*
                r4 = this;
                super.onPageFinished(r5, r6)
                android.os.Handler r0 = r4.f12079a
                if (r0 == 0) goto Le
                java.lang.Runnable r1 = r4.f12096s
                if (r1 == 0) goto Le
                r0.removeCallbacks(r1)
            Le:
                boolean r0 = r4.f12093p
                if (r0 != 0) goto Lb3
                java.lang.String r0 = "wfr=1"
                boolean r6 = r6.contains(r0)
                r0 = 1
                if (r6 != 0) goto L9e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = r4.f12087j
                r6.append(r1)
                java.lang.String r1 = "_"
                r6.append(r1)
                java.lang.String r2 = r4.f12086i
                r6.append(r2)
                com.anythink.expressad.videocommon.b.l r6 = com.anythink.expressad.videocommon.p178b.C2327l.m11891a()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r4.f12087j
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = r4.f12083f
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r4.f12086i
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r6.m11908c(r1, r0)
                java.lang.Runnable r6 = r4.f12080b
                if (r6 == 0) goto L5f
                android.os.Handler r1 = r4.f12079a
                if (r1 == 0) goto L5f
                r1.removeCallbacks(r6)
            L5f:
                com.anythink.expressad.videocommon.a$a r6 = r4.f12089l
                if (r6 == 0) goto L66
                r6.m11761a(r0)
            L66:
                boolean r6 = r4.f12081c
                if (r6 == 0) goto L75
                com.anythink.expressad.foundation.d.c r6 = r4.f12090m
                boolean r6 = r6.m8793A()
                r1 = 287(0x11f, float:4.02E-43)
                if (r6 == 0) goto L8b
                goto L7f
            L75:
                com.anythink.expressad.foundation.d.c r6 = r4.f12090m
                boolean r6 = r6.m8793A()
                r1 = 94
                if (r6 == 0) goto L8b
            L7f:
                com.anythink.expressad.foundation.d.c r6 = r4.f12090m
                java.lang.String r6 = r6.m8832aa()
                com.anythink.expressad.videocommon.a$a r2 = r4.f12089l
                com.anythink.expressad.videocommon.C2314a.m11744a(r1, r6, r2)
                goto L96
            L8b:
                com.anythink.expressad.foundation.d.c r6 = r4.f12090m
                java.lang.String r6 = r6.m8832aa()
                com.anythink.expressad.videocommon.a$a r2 = r4.f12089l
                com.anythink.expressad.videocommon.C2314a.m11750b(r1, r6, r2)
            L96:
                com.anythink.expressad.reward.a.c$j r6 = r4.f12084g
                if (r6 == 0) goto Lab
                r6.mo10236a()
                goto Lab
            L9e:
                android.os.Handler r6 = r4.f12079a
                if (r6 == 0) goto Lab
                java.lang.Runnable r1 = r4.f12095r
                if (r1 == 0) goto Lab
                r2 = 5000(0x1388, double:2.4703E-320)
                r6.postDelayed(r1, r2)
            Lab:
                com.anythink.expressad.atsignalcommon.windvane.C1469j.m5701a()
                com.anythink.expressad.atsignalcommon.windvane.C1469j.m5704b(r5)
                r4.f12093p = r0
            Lb3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.p146a.C1961c.k.onPageFinished(android.webkit.WebView, java.lang.String):void");
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C2327l.m11891a().m11908c(this.f12087j + "_" + this.f12083f + "_" + this.f12086i, false);
            Handler handler = this.f12079a;
            if (handler != null) {
                if (this.f12095r != null) {
                    handler.removeCallbacks(this.f12096s);
                }
                Runnable runnable = this.f12095r;
                if (runnable != null) {
                    this.f12079a.removeCallbacks(runnable);
                }
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f12087j);
                sb.append("_");
                sb.append(this.f12086i);
                C2314a.a aVar = this.f12089l;
                if (aVar != null) {
                    aVar.m11761a(false);
                }
                j jVar = this.f12084g;
                if (jVar != null) {
                    jVar.mo10237a(str);
                }
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.getLocalizedMessage();
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            String string = "";
            new StringBuilder("TempalteWindVaneWebviewClient preLoadTemplate onReceivedSslError: ").append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
            C2327l.m11891a().m11908c(this.f12087j + "_" + this.f12083f + "_" + this.f12086i, false);
            Handler handler = this.f12079a;
            if (handler != null) {
                if (this.f12095r != null) {
                    handler.removeCallbacks(this.f12096s);
                }
                Runnable runnable = this.f12095r;
                if (runnable != null) {
                    this.f12079a.removeCallbacks(runnable);
                }
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f12087j);
                sb.append("_");
                sb.append(this.f12086i);
                C2314a.a aVar = this.f12089l;
                if (aVar != null) {
                    aVar.m11761a(false);
                }
                j jVar = this.f12084g;
                if (jVar != null) {
                    if (sslError != null) {
                        string = Integer.toString(sslError.getPrimaryError());
                    }
                    jVar.mo10237a(string);
                }
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.getLocalizedMessage();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[PHI: r0
  0x007c: PHI (r0v6 int) = (r0v5 int), (r0v8 int) binds: [B:30:0x007a, B:27:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[PHI: r0
  0x0088: PHI (r0v7 int) = (r0v5 int), (r0v8 int) binds: [B:30:0x007a, B:27:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void readyState(android.webkit.WebView r4, int r5) {
            /*
                r3 = this;
                super.readyState(r4, r5)
                android.os.Handler r4 = r3.f12079a
                if (r4 == 0) goto Le
                java.lang.Runnable r0 = r3.f12095r
                if (r0 == 0) goto Le
                r4.removeCallbacks(r0)
            Le:
                android.os.Handler r4 = r3.f12079a
                if (r4 == 0) goto L19
                java.lang.Runnable r0 = r3.f12096s
                if (r0 == 0) goto L19
                r4.removeCallbacks(r0)
            L19:
                boolean r4 = r3.f12094q
                if (r4 != 0) goto Lae
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = r3.f12087j
                r4.append(r0)
                java.lang.String r0 = "_"
                r4.append(r0)
                java.lang.String r1 = r3.f12086i
                r4.append(r1)
                r4 = 1
                if (r5 != r4) goto L9b
                java.lang.Runnable r5 = r3.f12080b
                if (r5 == 0) goto L3f
                android.os.Handler r1 = r3.f12079a
                if (r1 == 0) goto L3f
                r1.removeCallbacks(r5)
            L3f:
                com.anythink.expressad.videocommon.b.l r5 = com.anythink.expressad.videocommon.p178b.C2327l.m11891a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r3.f12087j
                r1.append(r2)
                r1.append(r0)
                java.lang.String r2 = r3.f12083f
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r3.f12086i
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r5.m11908c(r0, r4)
                com.anythink.expressad.videocommon.a$a r5 = r3.f12089l
                if (r5 == 0) goto L6b
                r5.m11761a(r4)
            L6b:
                boolean r5 = r3.f12081c
                if (r5 == 0) goto L76
                boolean r5 = r3.f12082e
                r0 = 287(0x11f, float:4.02E-43)
                if (r5 == 0) goto L88
                goto L7c
            L76:
                boolean r5 = r3.f12082e
                r0 = 94
                if (r5 == 0) goto L88
            L7c:
                com.anythink.expressad.foundation.d.c r5 = r3.f12090m
                java.lang.String r5 = r5.m8832aa()
                com.anythink.expressad.videocommon.a$a r1 = r3.f12089l
                com.anythink.expressad.videocommon.C2314a.m11744a(r0, r5, r1)
                goto L93
            L88:
                com.anythink.expressad.foundation.d.c r5 = r3.f12090m
                java.lang.String r5 = r5.m8832aa()
                com.anythink.expressad.videocommon.a$a r1 = r3.f12089l
                com.anythink.expressad.videocommon.C2314a.m11750b(r0, r5, r1)
            L93:
                com.anythink.expressad.reward.a.c$j r5 = r3.f12084g
                if (r5 == 0) goto Lac
                r5.mo10236a()
                goto Lac
            L9b:
                com.anythink.expressad.reward.a.c$j r0 = r3.f12084g
                if (r0 == 0) goto Lac
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r1 = "state "
                java.lang.String r5 = r1.concat(r5)
                r0.mo10237a(r5)
            Lac:
                r3.f12094q = r4
            Lae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.p146a.C1961c.k.readyState(android.webkit.WebView, int):void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$l */
    public static class l extends C1442b {

        /* JADX INFO: renamed from: a */
        private String f12111a;

        /* JADX INFO: renamed from: b */
        private final boolean f12112b = false;

        /* JADX INFO: renamed from: c */
        private final WindVaneWebView f12113c;

        /* JADX INFO: renamed from: e */
        private final String f12114e;

        /* JADX INFO: renamed from: f */
        private final String f12115f;

        /* JADX INFO: renamed from: g */
        private final C2314a.a f12116g;

        /* JADX INFO: renamed from: h */
        private final C1781c f12117h;

        /* JADX INFO: renamed from: i */
        private boolean f12118i;

        /* JADX INFO: renamed from: j */
        private String f12119j;

        /* JADX INFO: renamed from: k */
        private boolean f12120k;

        /* JADX INFO: renamed from: l */
        private boolean f12121l;

        public l(String str, WindVaneWebView windVaneWebView, String str2, String str3, C2314a.a aVar, C1781c c1781c, boolean z, String str4) {
            this.f12113c = windVaneWebView;
            this.f12114e = str2;
            this.f12115f = str3;
            this.f12116g = aVar;
            this.f12117h = c1781c;
            this.f12111a = str;
            this.f12118i = z;
            this.f12119j = str4;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            int i;
            if (this.f12120k) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f12113c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f12111a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(C1796r.f10844ah, 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) this.f12113c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        if (C1404a.f6209a) {
                            e.getLocalizedMessage();
                        }
                    }
                }
                C2327l.m11891a().m11908c(this.f12115f + "_" + this.f12119j + "_" + this.f12114e, true);
                C2314a.a aVar = this.f12116g;
                if (aVar != null) {
                    aVar.m11761a(true);
                }
                String str2 = this.f12115f + "_" + this.f12117h.m10146aZ() + "_" + this.f12117h.m8818Z() + "_" + this.f12114e;
                if (this.f12112b) {
                    if (this.f12117h.m8793A()) {
                        i = C1801a.f11010aU;
                        C2314a.m11744a(i, this.f12117h.m8832aa(), this.f12116g);
                    }
                    C2314a.m11745a(str2, this.f12116g, false, this.f12118i);
                } else {
                    if (this.f12117h.m8793A()) {
                        i = 94;
                        C2314a.m11744a(i, this.f12117h.m8832aa(), this.f12116g);
                    }
                    C2314a.m11745a(str2, this.f12116g, false, this.f12118i);
                }
            }
            C1469j.m5701a();
            C1469j.m5704b(webView);
            this.f12120k = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C2327l.m11891a().m11908c(this.f12115f + "_" + this.f12119j + "_" + this.f12114e, false);
            C2314a.a aVar = this.f12116g;
            if (aVar != null) {
                aVar.m11761a(false);
            }
            if (this.f12113c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f12111a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C1796r.f10844ah, 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a((WebView) this.f12113c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.getLocalizedMessage();
                    }
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            if (this.f12121l) {
                return;
            }
            if (this.f12113c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f12111a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C1796r.f10844ah, i);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a((WebView) this.f12113c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (C1404a.f6209a) {
                        e.getLocalizedMessage();
                    }
                }
            }
            String str = this.f12115f + "_" + this.f12117h.m10146aZ() + "_" + this.f12117h.m8818Z() + "_" + this.f12114e;
            if (i == 1) {
                C2327l.m11891a().m11908c(this.f12115f + "_" + this.f12119j + "_" + this.f12114e, true);
                C2314a.a aVar = this.f12116g;
                if (aVar != null) {
                    aVar.m11761a(true);
                }
                boolean z = this.f12112b;
                this.f12117h.m8793A();
                C2314a.m11745a(str, this.f12116g, false, this.f12118i);
            } else {
                C2327l.m11891a().m11908c(this.f12115f + "_" + this.f12119j + "_" + this.f12114e, false);
                C2314a.a aVar2 = this.f12116g;
                if (aVar2 != null) {
                    aVar2.m11761a(false);
                }
            }
            this.f12121l = true;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.c$m */
    public static final class m {

        /* JADX INFO: renamed from: a */
        private static final C1961c f12122a = new C1961c(0);

        private m() {
        }
    }

    private C1961c() {
        this.f11984t = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f11966d = new HashMap();
        handlerThread.start();
        this.f11981b = new h(handlerThread.getLooper());
        this.f11982c = new ConcurrentHashMap<>();
    }

    public /* synthetic */ C1961c(byte b2) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C1961c m10209a() {
        return m.f12122a;
    }

    /* JADX INFO: renamed from: a */
    private void m10211a(Context context, String str, String str2, String str3, C1781c c1781c, String str4, i iVar, List<C1781c> list) {
        if (TextUtils.isEmpty(str4) || c1781c.m8800H()) {
            return;
        }
        if (str4.contains(MultiDexExtractor.EXTRACTED_SUFFIX) && str4.contains(C2328m.f14474b)) {
            boolean zIsEmpty = TextUtils.isEmpty(C2324i.m11867a().m11883c(str4));
            try {
                g gVar = new g(context, str, str2, str3, c1781c, 497, this.f11981b, iVar, list);
                gVar.m10230a(zIsEmpty);
                C2324i.m11867a().m11882b(str4, (C2324i.a) gVar);
                return;
            } catch (Exception e2) {
                if (C1404a.f6209a) {
                    e2.getLocalizedMessage();
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(C2325j.m11884a().m11889b(str4));
        try {
            d dVar = new d(497, str, str2, str3, c1781c, iVar, this.f11981b, list);
            dVar.m10229a(zIsEmpty2);
            C2324i.m11867a().m11882b(str4, dVar);
        } catch (Exception e3) {
            if (C1404a.f6209a) {
                e3.getLocalizedMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10212a(C1961c c1961c, Context context, String str, String str2, String str3, C1781c c1781c, String str4, i iVar, List list) {
        if (TextUtils.isEmpty(str4) || c1781c.m8800H()) {
            return;
        }
        if (str4.contains(MultiDexExtractor.EXTRACTED_SUFFIX) && str4.contains(C2328m.f14474b)) {
            boolean zIsEmpty = TextUtils.isEmpty(C2324i.m11867a().m11883c(str4));
            try {
                g gVar = new g(context, str, str2, str3, c1781c, 497, c1961c.f11981b, iVar, list);
                gVar.m10230a(zIsEmpty);
                C2324i.m11867a().m11882b(str4, (C2324i.a) gVar);
                return;
            } catch (Exception e2) {
                if (C1404a.f6209a) {
                    e2.getLocalizedMessage();
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(C2325j.m11884a().m11889b(str4));
        try {
            d dVar = new d(497, str, str2, str3, c1781c, iVar, c1961c.f11981b, list);
            dVar.m10229a(zIsEmpty2);
            C2324i.m11867a().m11882b(str4, dVar);
        } catch (Exception e3) {
            if (C1404a.f6209a) {
                e3.getLocalizedMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static /* synthetic */ void m10213a(C1961c c1961c, boolean z, WindVaneWebView windVaneWebView, C1781c c1781c, List list, C2340d c2340d, String str, String str2, int i2) {
        if (windVaneWebView != null) {
            if (c1781c == null || c2340d == null || c1781c.m8805M() == null || TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C1796r.f10844ah, 2);
                    jSONObject2.put("error", "data is null");
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    return;
                } catch (Exception e2) {
                    if (C1404a.f6209a) {
                        e2.getLocalizedMessage();
                        return;
                    }
                    return;
                }
            }
            if (!TextUtils.isEmpty(c1781c.m8805M().m8957e())) {
                if (TextUtils.isEmpty(c1781c.m8805M().m8957e()) || !c1781c.m8805M().m8957e().contains(C1781c.f10327d)) {
                    new Handler(Looper.getMainLooper()).postDelayed(c1961c.new AnonymousClass3(z, windVaneWebView, c1781c, list, str, c2340d, str2), i2 * 1000);
                    return;
                }
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(C1796r.f10844ah, 1);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                C1469j.m5701a();
                C1469j.m5703a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e3) {
                if (C1404a.f6209a) {
                    e3.getLocalizedMessage();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10214a(boolean z, WindVaneWebView windVaneWebView, C1781c c1781c, List<C1781c> list, C2340d c2340d, String str, String str2, int i2) {
        if (windVaneWebView != null) {
            if (c1781c == null || c2340d == null || c1781c.m8805M() == null || TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C1796r.f10844ah, 2);
                    jSONObject2.put("error", "data is null");
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    return;
                } catch (Exception e2) {
                    if (C1404a.f6209a) {
                        e2.getLocalizedMessage();
                        return;
                    }
                    return;
                }
            }
            if (!TextUtils.isEmpty(c1781c.m8805M().m8957e())) {
                if (TextUtils.isEmpty(c1781c.m8805M().m8957e()) || !c1781c.m8805M().m8957e().contains(C1781c.f10327d)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new AnonymousClass3(z, windVaneWebView, c1781c, list, str, c2340d, str2), i2 * 1000);
                    return;
                }
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(C1796r.f10844ah, 1);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                C1469j.m5701a();
                C1469j.m5703a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e3) {
                if (C1404a.f6209a) {
                    e3.getLocalizedMessage();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m10215a(boolean z, WindVaneWebView windVaneWebView, String str, int i2, C1781c c1781c, List<C1781c> list, String str2, String str3, C2340d c2340d, String str4, boolean z3) {
        C2202j c2202j;
        String strM8818Z;
        try {
            C2314a.a aVar = new C2314a.a();
            WindVaneWebView windVaneWebViewM10222d = m.f12122a.m10222d();
            if (windVaneWebViewM10222d == null) {
                windVaneWebViewM10222d = new WindVaneWebView(C1175n.m2059a().m2148f());
            }
            WindVaneWebView windVaneWebView2 = windVaneWebViewM10222d;
            aVar.m11759a(windVaneWebView2);
            if (list == null || list.size() <= 0) {
                c2202j = new C2202j(null, c1781c);
                strM8818Z = c1781c.m8818Z();
            } else {
                List<C1781c> listM11853a = C2320e.m11843a().m11853a(str3);
                if (listM11853a != null && listM11853a.size() > 0) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        C1781c c1781c2 = list.get(i3);
                        for (C1781c c1781c3 : listM11853a) {
                            if (c1781c3.m10146aZ().equals(c1781c2.m10146aZ()) && c1781c3.m8818Z().equals(c1781c2.m8818Z())) {
                                c1781c2.m8852au();
                                list.set(i3, c1781c2);
                            }
                        }
                    }
                }
                c2202j = new C2202j(null, c1781c, list);
                strM8818Z = list.get(0).m8818Z();
            }
            String str5 = strM8818Z;
            C2202j c2202j2 = c2202j;
            c2202j2.mo11550a(i2);
            c2202j2.mo11556a(str3);
            c2202j2.m11614c(str4);
            c2202j2.mo11555a(c2340d);
            c2202j2.m11613b(z);
            windVaneWebView2.setWebViewListener(new l(str4, windVaneWebView, str, str3, aVar, c1781c, z3, str5));
            windVaneWebView2.setObject(c2202j2);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str5);
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.getLocalizedMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10216a(boolean z, WindVaneWebView windVaneWebView, String str, C1781c c1781c, List list, String str2, String str3, C2340d c2340d, String str4, boolean z3) {
        C2202j c2202j;
        String strM8818Z;
        try {
            C2314a.a aVar = new C2314a.a();
            WindVaneWebView windVaneWebViewM10222d = m.f12122a.m10222d();
            if (windVaneWebViewM10222d == null) {
                windVaneWebViewM10222d = new WindVaneWebView(C1175n.m2059a().m2148f());
            }
            WindVaneWebView windVaneWebView2 = windVaneWebViewM10222d;
            aVar.m11759a(windVaneWebView2);
            if (list == null || list.size() <= 0) {
                c2202j = new C2202j(null, c1781c);
                strM8818Z = c1781c.m8818Z();
            } else {
                List<C1781c> listM11853a = C2320e.m11843a().m11853a(str3);
                if (listM11853a != null && listM11853a.size() > 0) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C1781c c1781c2 = (C1781c) list.get(i2);
                        for (C1781c c1781c3 : listM11853a) {
                            if (c1781c3.m10146aZ().equals(c1781c2.m10146aZ()) && c1781c3.m8818Z().equals(c1781c2.m8818Z())) {
                                c1781c2.m8852au();
                                list.set(i2, c1781c2);
                            }
                        }
                    }
                }
                c2202j = new C2202j(null, c1781c, list);
                strM8818Z = ((C1781c) list.get(0)).m8818Z();
            }
            String str5 = strM8818Z;
            C2202j c2202j2 = c2202j;
            c2202j2.mo11550a(0);
            c2202j2.mo11556a(str3);
            c2202j2.m11614c(str4);
            c2202j2.mo11555a(c2340d);
            c2202j2.m11613b(z);
            windVaneWebView2.setWebViewListener(new l(str4, windVaneWebView, str, str3, aVar, c1781c, z3, str5));
            windVaneWebView2.setObject(c2202j2);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str5);
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.getLocalizedMessage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static synchronized String m10217b(int i2) {
        return i2 != 200 ? i2 != 201 ? i2 != 203 ? i2 != 205 ? "unknown" : "tpl" : "temp" : "zip/html" : C1732o.f9719a;
    }

    /* JADX INFO: renamed from: c */
    private static String m10220c(int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m10221c() {
    }

    /* JADX INFO: renamed from: d */
    private synchronized WindVaneWebView m10222d() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m10223a(Context context, C1781c c1781c, final String str, final String str2, final String str3, final i iVar) {
        this.f11981b.m10231a(context);
        if (c1781c != null) {
            String strM8849ar = c1781c.m8849ar();
            if (c1781c.m8886j()) {
                C2327l.m11891a().m11906b(strM8849ar, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", str2);
                bundle.putString(C1404a.f6238y, str);
                bundle.putString("request_id", str3);
                bundle.putString(C1781c.f10246am, strM8849ar);
                messageObtain.setData(bundle);
                this.f11981b.sendMessage(messageObtain);
                iVar.mo10235a(str, str2, str3);
                return;
            }
        }
        if (c1781c != null && !TextUtils.isEmpty(c1781c.m8849ar())) {
            try {
                C2324i.m11867a().m11882b(c1781c.m8849ar(), (C2324i.a) new C2324i.d() { // from class: com.anythink.expressad.reward.a.c.2
                    @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
                    /* JADX INFO: renamed from: a */
                    public final void mo5464a(String str4) {
                        try {
                            C2327l.m11891a().m11906b(str4, true);
                            Message messageObtain2 = Message.obtain();
                            messageObtain2.what = 105;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("unit_id", str2);
                            bundle2.putString(C1404a.f6238y, str);
                            bundle2.putString("request_id", str3);
                            bundle2.putString(C1781c.f10246am, str4);
                            messageObtain2.setData(bundle2);
                            C1961c.this.f11981b.sendMessage(messageObtain2);
                            i iVar2 = iVar;
                            if (iVar2 != null) {
                                iVar2.mo10235a(str, str2, str3);
                            }
                        } catch (Exception e2) {
                            C2327l.m11891a().m11906b(str4, false);
                            Message messageObtain3 = Message.obtain();
                            messageObtain3.what = 205;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("unit_id", str2);
                            bundle3.putString(C1404a.f6238y, str);
                            bundle3.putString("request_id", str3);
                            bundle3.putString(C1781c.f10246am, str4);
                            messageObtain3.setData(bundle3);
                            C1961c.this.f11981b.sendMessage(messageObtain3);
                            i iVar3 = iVar;
                            if (iVar3 != null) {
                                String str5 = str2;
                                e2.getLocalizedMessage();
                                iVar3.mo10234a(str5);
                            }
                        }
                    }

                    @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
                    /* JADX INFO: renamed from: a */
                    public final void mo5465a(String str4, String str5) {
                        try {
                            C2327l.m11891a().m11906b(str5, false);
                            Message messageObtain2 = Message.obtain();
                            messageObtain2.what = 205;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("unit_id", str2);
                            bundle2.putString(C1404a.f6238y, str);
                            bundle2.putString("request_id", str3);
                            bundle2.putString(C1781c.f10246am, str5);
                            bundle2.putString("message", str4);
                            messageObtain2.setData(bundle2);
                            C1961c.this.f11981b.sendMessage(messageObtain2);
                            i iVar2 = iVar;
                            if (iVar2 != null) {
                                iVar2.mo10234a(str2);
                            }
                        } catch (Exception e2) {
                            C2327l.m11891a().m11906b(str5, false);
                            Message messageObtain3 = Message.obtain();
                            messageObtain3.what = 105;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("unit_id", str2);
                            bundle3.putString(C1404a.f6238y, str);
                            bundle3.putString("request_id", str3);
                            bundle3.putString(C1781c.f10246am, str5);
                            bundle3.putString("message", e2.getMessage());
                            messageObtain3.setData(bundle3);
                            C1961c.this.f11981b.sendMessage(messageObtain3);
                            i iVar3 = iVar;
                            if (iVar3 != null) {
                                iVar3.mo10234a(str2);
                            }
                            if (C1404a.f6209a) {
                                e2.getLocalizedMessage();
                            }
                        }
                    }
                });
            } catch (Exception e2) {
                if (C1404a.f6209a) {
                    e2.getLocalizedMessage();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m10224a(final Context context, boolean z, int i2, boolean z3, final int i3, final String str, final String str2, final String str3, final CopyOnWriteArrayList<C1781c> copyOnWriteArrayList, c cVar, final i iVar) {
        String str4 = str2 + "_" + str3;
        f11966d.put(str4, new a(z, z3, i2, copyOnWriteArrayList.size(), str2, str3, i3, copyOnWriteArrayList));
        this.f11981b.m10232a(str2, str3, cVar);
        this.f11981b.m10231a(context);
        this.f11981b.m10233a(str4, copyOnWriteArrayList);
        this.f11981b.post(new Runnable() { // from class: com.anythink.expressad.reward.a.c.1
            /* JADX WARN: Removed duplicated region for block: B:131:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00e4 A[PHI: r0 r17
  0x00e4: PHI (r0v33 'e' java.lang.Exception) = (r0v31 'e' java.lang.Exception), (r0v34 'e' java.lang.Exception) binds: [B:36:0x00b9, B:43:0x00e2] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r17v6 java.util.Iterator) = (r17v3 java.util.Iterator), (r17v7 java.util.Iterator) binds: [B:36:0x00b9, B:43:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x01f0 A[PHI: r0
  0x01f0: PHI (r0v24 'e' java.lang.Exception) = (r0v23 'e' java.lang.Exception), (r0v25 'e' java.lang.Exception) binds: [B:83:0x01c7, B:89:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 607
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.p146a.C1961c.AnonymousClass1.run():void");
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m10225a(boolean z, Handler handler, boolean z3, boolean z4, WindVaneWebView windVaneWebView, String str, int i2, C1781c c1781c, CopyOnWriteArrayList<C1781c> copyOnWriteArrayList, String str2, String str3, String str4, String str5, C2340d c2340d, j jVar) {
        WindVaneWebView windVaneWebView2;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append("_");
        sb.append(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (C1886t.m9846e(str)) {
                jVar.mo10236a();
                return;
            }
            C2314a.a aVar = new C2314a.a();
            WindVaneWebView windVaneWebViewM10222d = m.f12122a.m10222d();
            if (windVaneWebViewM10222d == null) {
                try {
                    windVaneWebView2 = new WindVaneWebView(C1175n.m2059a().m2148f());
                } catch (Exception unused) {
                    aVar.m11761a(true);
                    C2327l.m11891a().m11908c(str4 + "_" + str5 + "_" + str, true);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append("_");
                    sb2.append(str);
                    jVar.mo10236a();
                    return;
                } catch (Throwable unused2) {
                    aVar.m11761a(true);
                    C2327l.m11891a().m11908c(str4 + "_" + str5 + "_" + str, true);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str4);
                    sb3.append("_");
                    sb3.append(str);
                    jVar.mo10236a();
                    return;
                }
            } else {
                windVaneWebView2 = windVaneWebViewM10222d;
            }
            aVar.m11759a(windVaneWebView2);
            C2202j c2202j = (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) ? new C2202j(null, c1781c) : new C2202j(null, c1781c, copyOnWriteArrayList);
            c2202j.mo11550a(i2);
            c2202j.mo11556a(str4);
            c2202j.mo11555a(c2340d);
            c2202j.m11613b(z);
            WindVaneWebView windVaneWebView3 = windVaneWebView2;
            windVaneWebView3.setWebViewListener(new k(handler, null, z3, z4, str5, jVar, windVaneWebView, str, str3, str4, aVar, c1781c, copyOnWriteArrayList, jCurrentTimeMillis));
            windVaneWebView3.setObject(c2202j);
            windVaneWebView3.loadUrl(str2);
            windVaneWebView3.setRid(str5);
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.getLocalizedMessage();
            }
            jVar.mo10237a(e2.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m10226a(boolean z, Handler handler, boolean z3, boolean z4, String str, String str2, String str3, String str4, int i2, C1781c c1781c, CopyOnWriteArrayList<C1781c> copyOnWriteArrayList, String str5, String str6, C2340d c2340d, j jVar) {
        C2202j c2202j;
        this.f11983e = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append("_");
        sb.append(str4);
        this.f11983e = false;
        if (C1886t.m9846e(str4)) {
            jVar.mo10236a();
            return;
        }
        try {
            C2314a.a aVar = new C2314a.a();
            WindVaneWebView windVaneWebViewM10222d = m.f12122a.m10222d();
            if (windVaneWebViewM10222d == null) {
                windVaneWebViewM10222d = new WindVaneWebView(C1175n.m2059a().m2148f());
            }
            WindVaneWebView windVaneWebView = windVaneWebViewM10222d;
            aVar.m11759a(windVaneWebView);
            C2024c.m10829a();
            String strM10842b = C2024c.m10842b();
            C2024c.m10829a();
            String strM10842b2 = C2024c.m10842b();
            aVar.m11760a(strM10842b2);
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                c2202j = new C2202j(null, c1781c);
            } else {
                List<C1781c> listM11853a = C2320e.m11843a().m11853a(str3);
                if (listM11853a != null && listM11853a.size() > 0) {
                    for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                        C1781c c1781c2 = copyOnWriteArrayList.get(i3);
                        for (C1781c c1781c3 : listM11853a) {
                            List<C1781c> list = listM11853a;
                            if (c1781c3.m10146aZ().equals(c1781c2.m10146aZ()) && c1781c3.m8818Z().equals(c1781c2.m8818Z())) {
                                c1781c2.m8852au();
                                copyOnWriteArrayList.set(i3, c1781c2);
                            }
                            listM11853a = list;
                        }
                    }
                }
                c2202j = new C2202j(null, c1781c, copyOnWriteArrayList);
            }
            C2202j c2202j2 = c2202j;
            c2202j2.mo11550a(i2);
            c2202j2.mo11556a(str6);
            c2202j2.m11614c(strM10842b2);
            c2202j2.m11615d(strM10842b);
            c2202j2.m11617p();
            c2202j2.mo11555a(c2340d);
            c2202j2.m11613b(z);
            windVaneWebView.setWebViewListener(new b(z, handler, null, z3, z4, i2, str4, str2, str3, str, aVar, c1781c, copyOnWriteArrayList, c2340d, jVar, jCurrentTimeMillis));
            windVaneWebView.setObject(c2202j2);
            windVaneWebView.loadUrl(str5);
            windVaneWebView.setRid(str);
            AnythinkBTRootLayout anythinkBTRootLayout = new AnythinkBTRootLayout(C1175n.m2059a().m2148f());
            anythinkBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            anythinkBTRootLayout.setInstanceId(strM10842b);
            anythinkBTRootLayout.setUnitId(str3);
            AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(C1175n.m2059a().m2148f());
            anythinkBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            anythinkBTLayout.setInstanceId(strM10842b2);
            anythinkBTLayout.setUnitId(str3);
            anythinkBTLayout.setWebView(windVaneWebView);
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.m10829a().m10868b(str3, str);
            linkedHashMapM10868b.put(strM10842b2, anythinkBTLayout);
            linkedHashMapM10868b.put(strM10842b, anythinkBTRootLayout);
            anythinkBTRootLayout.addView(anythinkBTLayout, new FrameLayout.LayoutParams(-1, -1));
        } catch (Exception e2) {
            jVar.mo10237a(e2.getMessage());
            if (C1404a.f6209a) {
                e2.getLocalizedMessage();
            }
        }
    }
}
