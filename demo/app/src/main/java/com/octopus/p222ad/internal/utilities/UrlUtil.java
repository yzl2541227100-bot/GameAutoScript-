package com.octopus.p222ad.internal.utilities;

import android.content.Context;
import android.text.TextUtils;
import com.octopus.p222ad.internal.AsyncTaskC3115h;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.p224b.C3069b;
import com.octopus.p222ad.p224b.C3070c;
import com.octopus.p222ad.utils.p258b.C3257h;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public class UrlUtil {
    public static String CLT_TYPE = "__CLT__";
    public static String CLT_TYPE_999 = "__CLT-999__";
    public static String E_TS_E = ".EVENT_TS_END.";
    public static String E_TS_S = ".EVENT_TS_START.";
    public static String LOSS_REASON = "${LOSS_REASON}";
    public static String RAW_X_DOWN = ".SCRN_CLK_PT_DOWN_X.";
    public static String RAW_X_DOWN_DP = ".SCRN_CLK_PT_DOWN_X_DP.";
    public static String RAW_X_UP = ".SCRN_CLK_PT_UP_X.";
    public static String RAW_X_UP_DP = ".SCRN_CLK_PT_UP_X_DP.";
    public static String RAW_Y_DOWN = ".SCRN_CLK_PT_DOWN_Y.";
    public static String RAW_Y_DOWN_DP = ".SCRN_CLK_PT_DOWN_Y_DP.";
    public static String RAW_Y_UP = ".SCRN_CLK_PT_UP_Y.";
    public static String RAW_Y_UP_DP = ".SCRN_CLK_PT_UP_Y_DP.";
    public static String SECOND_PRICE = "${SECOND_PRICE}";

    /* JADX INFO: renamed from: TS */
    public static String f17421TS = ".UTC_TS.";
    public static String V_D = ".VIDEO_DURATION.";
    public static String WIN_BIDDER = "${WIN_BIDDER}";
    public static String WIN_PRICE = "${WIN_PRICE}";
    public static String X_DOWN = ".AD_CLK_PT_DOWN_X.";
    public static String X_DOWN_DP = ".AD_CLK_PT_DOWN_X_DP.";
    public static String X_UP = ".AD_CLK_PT_UP_X.";
    public static String X_UP_DP = ".AD_CLK_PT_UP_X_DP.";
    public static String Y_DOWN = ".AD_CLK_PT_DOWN_Y.";
    public static String Y_DOWN_DP = ".AD_CLK_PT_DOWN_Y_DP.";
    public static String Y_UP = ".AD_CLK_PT_UP_Y.";
    public static String Y_UP_DP = ".AD_CLK_PT_UP_Y_DP.";

    public static class DNSResolver implements Runnable {
        private String domain;
        private InetAddress inetAddr;

        public DNSResolver(String str) {
            this.domain = str;
        }

        public synchronized InetAddress get() {
            return this.inetAddr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                set(InetAddress.getByName(this.domain));
            } catch (UnknownHostException unused) {
            }
        }

        public synchronized void set(InetAddress inetAddress) {
            this.inetAddr = inetAddress;
        }
    }

    public static boolean isSendTouchEventUrl(String str) {
        int i = str.contains(X_DOWN) ? 1 : 0;
        if (str.contains(Y_DOWN)) {
            i++;
        }
        if (str.contains(X_UP)) {
            i++;
        }
        if (str.contains(Y_UP)) {
            i++;
        }
        if (str.contains(RAW_X_DOWN)) {
            i++;
        }
        if (str.contains(RAW_Y_DOWN)) {
            i++;
        }
        if (str.contains(RAW_X_UP)) {
            i++;
        }
        if (str.contains(RAW_Y_UP)) {
            i++;
        }
        if (str.contains(f17421TS)) {
            i++;
        }
        return i == 9;
    }

    public static String px2dip(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && !str.equals("-999") && !str.equals("0")) {
                return String.valueOf((int) ((((long) Double.parseDouble(str)) / context.getResources().getDisplayMetrics().density) + 0.5f));
            }
            return str;
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static String replaceLossUrl(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains(WIN_PRICE)) {
            str = str.replace(WIN_PRICE, i + "");
        }
        if (str.contains(LOSS_REASON) && !TextUtils.isEmpty(str2)) {
            str = str.replace(LOSS_REASON, str2);
        }
        return (!str.contains(WIN_BIDDER) || TextUtils.isEmpty(str3)) ? str : str.replace(WIN_BIDDER, str3);
    }

    public static String replaceToTouchEventUrl(String str, C3070c c3070c, String str2, String str3, String str4) {
        if (str.contains(X_DOWN) && !TextUtils.isEmpty(c3070c.m14141a())) {
            str = str.replace(X_DOWN, c3070c.m14141a());
        }
        if (str.contains(Y_DOWN) && !TextUtils.isEmpty(c3070c.m14143b())) {
            str = str.replace(Y_DOWN, c3070c.m14143b());
        }
        if (str.contains(X_UP) && !TextUtils.isEmpty(c3070c.m14149e())) {
            str = str.replace(X_UP, c3070c.m14149e());
        }
        if (str.contains(Y_UP) && !TextUtils.isEmpty(c3070c.m14151f())) {
            str = str.replace(Y_UP, c3070c.m14151f());
        }
        if (str.contains(RAW_X_DOWN) && !TextUtils.isEmpty(c3070c.m14145c())) {
            str = str.replace(RAW_X_DOWN, c3070c.m14145c());
        }
        if (str.contains(RAW_Y_DOWN) && !TextUtils.isEmpty(c3070c.m14147d())) {
            str = str.replace(RAW_Y_DOWN, c3070c.m14147d());
        }
        if (str.contains(RAW_X_UP) && !TextUtils.isEmpty(c3070c.m14153g())) {
            str = str.replace(RAW_X_UP, c3070c.m14153g());
        }
        if (str.contains(RAW_Y_UP) && !TextUtils.isEmpty(c3070c.m14155h())) {
            str = str.replace(RAW_Y_UP, c3070c.m14155h());
        }
        if (str.contains(X_DOWN_DP) && !TextUtils.isEmpty(c3070c.m14141a())) {
            str = str.replace(X_DOWN_DP, px2dip(C3120m.m14425a().f17185h, c3070c.m14141a()));
        }
        if (str.contains(Y_DOWN_DP) && !TextUtils.isEmpty(c3070c.m14143b())) {
            str = str.replace(Y_DOWN_DP, px2dip(C3120m.m14425a().f17185h, c3070c.m14143b()));
        }
        if (str.contains(X_UP_DP) && !TextUtils.isEmpty(c3070c.m14149e())) {
            str = str.replace(X_UP_DP, px2dip(C3120m.m14425a().f17185h, c3070c.m14149e()));
        }
        if (str.contains(Y_UP_DP) && !TextUtils.isEmpty(c3070c.m14151f())) {
            str = str.replace(Y_UP_DP, px2dip(C3120m.m14425a().f17185h, c3070c.m14151f()));
        }
        if (str.contains(RAW_X_DOWN_DP) && !TextUtils.isEmpty(c3070c.m14145c())) {
            str = str.replace(RAW_X_DOWN_DP, px2dip(C3120m.m14425a().f17185h, c3070c.m14145c()));
        }
        if (str.contains(RAW_Y_DOWN_DP) && !TextUtils.isEmpty(c3070c.m14147d())) {
            str = str.replace(RAW_Y_DOWN_DP, px2dip(C3120m.m14425a().f17185h, c3070c.m14147d()));
        }
        if (str.contains(RAW_X_UP_DP) && !TextUtils.isEmpty(c3070c.m14153g())) {
            str = str.replace(RAW_X_UP_DP, px2dip(C3120m.m14425a().f17185h, c3070c.m14153g()));
        }
        return (!str.contains(RAW_Y_UP_DP) || TextUtils.isEmpty(c3070c.m14155h())) ? str : str.replace(RAW_Y_UP_DP, px2dip(C3120m.m14425a().f17185h, c3070c.m14155h()));
    }

    public static String replaceToTouchEventUrl(String str, C3070c c3070c, String str2, String str3, String str4, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("url must no null");
        }
        if (i == 2) {
            c3070c = new C3070c();
            if (str.contains(CLT_TYPE)) {
                c3070c.m14142a("0");
                c3070c.m14144b("0");
                c3070c.m14146c("0");
                c3070c.m14148d("0");
                c3070c.m14150e("0");
                c3070c.m14152f("0");
                c3070c.m14154g("0");
                c3070c.m14156h("0");
                str = replaceToTouchEventUrl(str, c3070c, str2, str3, str4);
            }
            if (str.contains(CLT_TYPE_999)) {
                c3070c.m14142a("-999");
                c3070c.m14144b("-999");
                c3070c.m14146c("-999");
                c3070c.m14148d("-999");
                c3070c.m14150e("-999");
                c3070c.m14152f("-999");
                c3070c.m14154g("-999");
                c3070c.m14156h("-999");
                str = replaceToTouchEventUrl(str, c3070c, str2, str3, str4);
            }
        } else {
            str = replaceToTouchEventUrl(str, c3070c, str2, str3, str4);
        }
        if (str.contains(CLT_TYPE)) {
            str = str.replace(CLT_TYPE, String.valueOf(i));
        }
        if (str.contains(CLT_TYPE_999)) {
            str = str.replace(CLT_TYPE_999, String.valueOf(i));
        }
        if (str.contains(f17421TS)) {
            str = str.replace(f17421TS, String.valueOf(System.currentTimeMillis()));
        }
        if (str.contains(E_TS_S)) {
            str = str.replace(E_TS_S, str2);
        }
        if (str.contains(E_TS_E)) {
            str = str.replace(E_TS_E, str3);
        }
        return str.contains(V_D) ? str.replace(V_D, str4) : str;
    }

    public static String replaceToTouchEventUrl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("url must no null");
        }
        if (str.contains(X_DOWN)) {
            str = str.replace(X_DOWN, str2);
        }
        if (str.contains(Y_DOWN)) {
            str = str.replace(Y_DOWN, str3);
        }
        if (str.contains(X_UP)) {
            str = str.replace(X_UP, str2);
        }
        if (str.contains(Y_UP)) {
            str = str.replace(Y_UP, str3);
        }
        if (str.contains(RAW_X_DOWN)) {
            str = str.replace(RAW_X_DOWN, str4);
        }
        if (str.contains(RAW_Y_DOWN)) {
            str = str.replace(RAW_Y_DOWN, str5);
        }
        if (str.contains(RAW_X_UP)) {
            str = str.replace(RAW_X_UP, str4);
        }
        if (str.contains(RAW_Y_UP)) {
            str = str.replace(RAW_Y_UP, str5);
        }
        if (str.contains(f17421TS)) {
            str = str.replace(f17421TS, String.valueOf(System.currentTimeMillis()));
        }
        if (str.contains(E_TS_S)) {
            str = str.replace(E_TS_S, str6);
        }
        if (str.contains(E_TS_E)) {
            str = str.replace(E_TS_E, str7);
        }
        return str.contains(V_D) ? str.replace(V_D, str8) : str;
    }

    public static String replaceWinUrl(String str, int i) {
        if (TextUtils.isEmpty(str) || !str.contains(SECOND_PRICE)) {
            return str;
        }
        return str.replace(SECOND_PRICE, i + "");
    }

    public static void sendClickInfoToServerWithReplace(C3069b.j jVar, String str, String str2, String str3, String str4) {
        String strM14021b = jVar.m14021b();
        if (TextUtils.isEmpty(strM14021b)) {
            return;
        }
        new AsyncTaskC3115h(replaceToTouchEventUrl(strM14021b, str, str2, str3, str4, "", "", "")).executeOnExecutor(C3257h.m14988b().m14990d(), new Void[0]);
    }

    public static void sendOnCompletionInfoToServer(C3069b.j jVar) {
        String strM14035i = jVar.m14035i();
        if (TextUtils.isEmpty(strM14035i)) {
            return;
        }
        new AsyncTaskC3115h(replaceToTouchEventUrl(strM14035i, "", "", "", "", "", "", "")).executeOnExecutor(C3257h.m14988b().m14990d(), new Void[0]);
    }

    public static void sendOnPauseInfoToServer(C3069b.j jVar) {
        String strM14033h = jVar.m14033h();
        if (TextUtils.isEmpty(strM14033h)) {
            return;
        }
        new AsyncTaskC3115h(replaceToTouchEventUrl(strM14033h, "", "", "", "", "", "", "")).executeOnExecutor(C3257h.m14988b().m14990d(), new Void[0]);
    }

    public static void sendOnStartInfoToServer(C3069b.j jVar) {
        String strM14031g = jVar.m14031g();
        if (TextUtils.isEmpty(strM14031g)) {
            return;
        }
        new AsyncTaskC3115h(replaceToTouchEventUrl(strM14031g, "", "", "", "", "", "", "")).executeOnExecutor(C3257h.m14988b().m14990d(), new Void[0]);
    }

    public static void sendViewShowInfoToServer(C3069b.j jVar) {
        String strM14019a = jVar.m14019a();
        if (TextUtils.isEmpty(strM14019a)) {
            return;
        }
        new AsyncTaskC3115h(replaceToTouchEventUrl(strM14019a, "", "", "", "", "", "", "")).executeOnExecutor(C3257h.m14988b().m14990d(), new Void[0]);
    }

    public static boolean testDNS(String str) {
        try {
            DNSResolver dNSResolver = new DNSResolver("sv.adintl.cn");
            Thread thread = new Thread(dNSResolver);
            thread.start();
            thread.join(1500L);
            return dNSResolver.get() != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
