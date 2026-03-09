package com.elfin.p203ad.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManagerImpl;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.elfin.p203ad.C2711R;
import com.umeng.analytics.MobclickAgent;
import java.lang.ref.WeakReference;
import p285z2.AbstractC4172nh;
import p285z2.AbstractCountDownTimerC4084l3;
import p285z2.C3679a5;
import p285z2.C3715b4;
import p285z2.C3803di;
import p285z2.C4093lc;
import p285z2.C4098lh;
import p285z2.C4122m4;
import p285z2.C4230p1;
import p285z2.C4246ph;
import p285z2.o0oo0000;

/* JADX INFO: loaded from: classes2.dex */
public class FullScreenTwoAdActivity extends BaseActivity implements View.OnClickListener {
    private static final String o00Oo0;
    private static final int o00Ooo = 5;
    public static final int o00o0O = 8;
    public static final int o00oO0O = 1001;
    public static final int o00oO0o = 3;
    public static final int o00ooo = 200;
    private static final int o0OO00O = 103;
    private static final int o0OOO0o = 101;
    private static final int o0Oo0oo = 102;
    public static final int o0ooOO0 = 1002;
    public static final int o0ooOOo = 1003;
    private static final int o0ooOoO = 100;
    public static final int oo000o = 1000;
    private ImageView OooooO0;
    private TextView OooooOO;
    private TextView OooooOo;
    private OooO OoooooO;
    private int Oooooo0 = 0;
    private int Oooooo = 0;
    private boolean Ooooooo = false;
    private OooO0o o0OoOo0 = new OooO0o(this, null);
    private boolean ooOO = false;
    private int o00O0O = 100;

    public class OooO extends AbstractCountDownTimerC4084l3 {
        public final FullScreenTwoAdActivity OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private OooO(FullScreenTwoAdActivity fullScreenTwoAdActivity, int i) {
            super(i);
            this.OooO0OO = fullScreenTwoAdActivity;
        }

        public /* synthetic */ OooO(FullScreenTwoAdActivity fullScreenTwoAdActivity, int i, OooO00o oooO00o) {
            this(fullScreenTwoAdActivity, i);
        }

        @Override // p285z2.AbstractCountDownTimerC4121m3
        public void OooO0O0(int i) {
            String str = "ۢۤۨۘۡۘۨۗۗۢۜۤۨۡۡۡۘۨ۫ۖۥۥۖ۟ۙۗۛ۫ۡۘ۬ۙۦ۬ۜۚۧۥۤۡ۠۫ۨۗۗ";
            while (true) {
                switch ((((str.hashCode() ^ 696) ^ 949) ^ 421) ^ 1971149353) {
                    case -1834039017:
                        str = "ۖۖۡۛۨۙۗۙۦۜۖۚۜۚۙ۟ۨۤ۟ۨۚ۫ۤۥۜۗۨۘ۠ۨۙ۟ۖۘۘۨۡۙ";
                        break;
                    case -900058383:
                        String str2 = "ۗۘ۬ۤ۟ۙ۫ۤۨۘ۠ۚ۟ۥۢۧ۟ۚۡ۬۬ۤۧ۟۠ۧۦۘۧۛۙ۫ۗۜ۬ۘۨۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 1325003406) {
                                case -1420913082:
                                    str2 = "ۢۗۖۨۨ۠ۧۥۙ۫ۙۦۨۥۡۘۥ۠ۡۘۜۢ۫ۜۡ۟۫ۚۜۘۦۖ۟ۙۨۚۡ۫۬ۢ۬ۢۡۘۛ";
                                    break;
                                case 76351006:
                                    str = "ۦۨۘۘۧۦۡۘۤۗۧ۫ۧۖۘۖۨ۫۫ۛ۟ۗۗۘۛۡ۬۬۬ۚۢ۟ۦۘۚۤ۫ۜۤۦۗۙ۫ۜ۫ۤ۬ۨۜۘ۫ۧۦ۠ۡۧۘ۬ۘ۬";
                                    continue;
                                case 590032569:
                                    String str3 = "۬ۚۦۢۢۘۘۛ۫ۗۤۜۜۘ۫ۤ۟ۨۙۚ۬ۖۛ۬ۨۦۦۨۘ۟ۙۖ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 920259895) {
                                            case -1899664398:
                                                str3 = FullScreenTwoAdActivity.OooOO0(this.OooO0OO) ? "ۥۜۡۧۥۜۘۖۚ۫ۤ۠ۗۢۧ۟ۙۘۘ۫ۥۗ۟۫ۚۤۜ۬ۜۜۡ" : "ۜۢۛۚۗۘۘۜۚۘۘۤۗ۠ۖۚ۠ۖۖۘۘۛۖ۫ۢۖۧۡۘۘۘۚۨۘۡۗۖۘ۬۟ۙۥۦۘ۫ۥۘۘۢۙۥۦۤۖ";
                                                break;
                                            case -1114456192:
                                                str2 = "ۤ۫ۨ۬ۛۨۡۤۦۘ۠ۨۨۘۙۜۖۘۗ۟ۘۚۡۜۘۗۛۥ۫ۧۙ۟ۛۦ۫۫ۧۡۧۘۘ";
                                                break;
                                            case -954275031:
                                                str2 = "ۢۦۘۘۜ۠ۤۛۖ۟ۥۦۢۧۚۗۘۚ۟ۢۗۛۜۙۚۚۨۘۦۢۚ";
                                                break;
                                            case 859540354:
                                                str3 = "ۧۙۚۘۥۙ۟ۛۡۤۢ۫ۡ۬۟۫ۥۨۘۨۖۜۘۘۦ۫ۘۗۙۙۨۤۥۘۦۘۘۗۡۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1748138963:
                                    str = "۬ۖ۬ۙۡۧۗۚۘۚۡ۬ۛ۟ۨۘ۬ۤۗۙۜۜۦۖۗ۠ۥۘۙۧۜۘۥۙۖۛۛۙۢۗۨۘۢۜۡۘۘۥۙۤۖۚۛۤۧۜۛ";
                                    continue;
                            }
                        }
                        break;
                    case 315912130:
                        FullScreenTwoAdActivity.OooOO0O(this.OooO0OO).setVisibility(0);
                        str = "۬ۖ۬ۙۡۧۗۚۘۚۡ۬ۛ۟ۨۘ۬ۤۗۙۜۜۦۖۗ۠ۥۘۙۧۜۘۥۙۖۛۛۙۢۗۨۘۢۜۡۘۘۥۙۤۖۚۛۤۧۜۛ";
                        break;
                    case 851729924:
                        FullScreenTwoAdActivity.OooO(this.OooO0OO);
                        str = "ۙۚۨۚۦۚۛۙۤۧۘۥۘۜۖۜۘۢۧۦۛۛۡۘ۠ۜۛۚۙۙۘۦۘ";
                        break;
                    case 877112901:
                        str = "ۘۥۦۘ۫۠ۦۚۢۛۘ۟۬ۜ۠ۘۗۛ۟۠ۡۦۤ۬ۜۘۗۦۦۘ۠ۖۚۨ۟ۜۦۙ۫ۡۛۥۛۗۥ";
                        break;
                    case 1625208162:
                        return;
                    case 1983112369:
                        FullScreenTwoAdActivity.OooOO0O(this.OooO0OO).setText(this.OooO0OO.getString(C2711R.string.countdown_time, new Object[]{Integer.valueOf(i)}));
                        str = "۟ۙۛۚۡۘۘ۟ۙ۟۠۬ۥۘ۫ۙۡۧۘۨۗۥۜۘۦ۬ۜۙۗ۠۫ۢۤۘۦ۬ۢۜۘۤۢۡ۬ۙۗ۠ۚۡۘۙۤۢۥ۟ۧۤۡۥ";
                        break;
                }
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            String str = "۬ۧۜۜۙۜۗۘۚۖ۫ۚۙۛۚۤۤۦۘۖ۟ۨۥۚۨ۟ۖۜۘۧۥۨۘۖ۫ۤۥۧۥۘۙۦۜۘۡ۠ۖۘ";
            while (true) {
                switch ((((str.hashCode() ^ 101) ^ 443) ^ 482) ^ (-2028427878)) {
                    case -2140528609:
                        str = "ۖۖۜ۬ۢۘۥۖۦۡۦۖ۟ۧ۠۫۟ۖۘۜۖۤۙۜۗ۟۫ۡۚۙۤۤۛۦۘۥۧۘۚۦۜۨۛ۠";
                        break;
                    case -129347230:
                        return;
                    case 216681634:
                        FullScreenTwoAdActivity.OooO0oO(this.OooO0OO);
                        str = "ۖۙ۫ۖۥۨۙ۠۬۟ۙۚۚۛۘۖۙۘۘ۫ۚ۠۬۫ۨۘۧۤۢۤ۬ۡۦۨۜۙۜۘۧۗۨۘۚۦۘۖۧۛۘۨۖۨۛ۫ۦۗۖۘ";
                        break;
                }
            }
        }
    }

    public class OooO00o implements Runnable {
        public final FullScreenTwoAdActivity OoooOoO;

        public OooO00o(FullScreenTwoAdActivity fullScreenTwoAdActivity) {
            this.OoooOoO = fullScreenTwoAdActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "۫ۨۧۘۚۛۨۧۧۧۦۤۡۖ۫ۛ۠ۤۢۤۜۜۘۘۗۤ۟ۡۙۜۨ۟";
            while (true) {
                switch ((((str.hashCode() ^ 750) ^ 717) ^ 690) ^ (-117950675)) {
                    case -1346587812:
                        str = "ۜۘۧۘۨۧ۬ۙ۟ۦۘۙۜ۫ۤۧۘۘۖۜۛ۠ۙ۠ۥۛۨۛۜۖۡ۟ۤۢ۠۟ۤۚۧۥۥۘ۫ۙ";
                        break;
                    case 636220708:
                        FullScreenTwoAdActivity.OooO0oO(this.OoooOoO);
                        str = "ۘۗۨۨۦۧۛ۟ۖ۬۠ۛۘۥۧۜۚۗۦۙ۫۠ۚۘۗۜۧۖۡۙۡۗۖۘۘۦ۫ۘۘ۫ۛ۠ۦۚۘۘۤۜۦۘۢۥۡۦ۟ۢ";
                        break;
                    case 1667348998:
                        return;
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public final FullScreenTwoAdActivity OoooOoO;

        public OooO0O0(FullScreenTwoAdActivity fullScreenTwoAdActivity) {
            this.OoooOoO = fullScreenTwoAdActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۗۡۥۖۡۨۧ۬ۖ۫ۨۖۘۖ۫ۖۨۜۜ۟ۧۘۡۧۡۥ۟۫ۙ۟ۜۜ۟ۥۘۨۤ۠ۤ۠ۖۘ۠ۚۙۙۤۖۖۘۜ۟ۖۥۨۦۧۘ";
            while (true) {
                switch ((((str.hashCode() ^ 80) ^ 224) ^ 745) ^ (-149838745)) {
                    case -708119098:
                        return;
                    case 868820136:
                        str = "ۗۙۘۘ۠۟ۥۘۤۧۛۨۛ۬ۥ۠۫۠ۖۦۦۛۗۢۘۛۤ۬ۥۢۛۛ";
                        break;
                    case 1638832579:
                        FullScreenTwoAdActivity.OooO0oO(this.OoooOoO);
                        str = "ۘۜۨۘۛۜ۟۬ۖۚۖۢۘۘۨ۠۟ۛ۫ۦۘۙۡۖۙۘۙۜ۟ۨۘ۫ۖۡۘ";
                        break;
                }
            }
        }
    }

    public class OooO0OO implements C4093lc.OooO00o {
        public final FullScreenTwoAdActivity OooO00o;

        public OooO0OO(FullScreenTwoAdActivity fullScreenTwoAdActivity) {
            this.OooO00o = fullScreenTwoAdActivity;
        }

        @Override // p285z2.C4093lc.OooO00o
        public void OooO00o(Object obj) {
            String str = "ۥۘۖۚ۟ۧۗۡۜۘۜ۟ۜۘۚۘۡۡۙۖۘۢۦۥۥۘۙۚ۫ۖۘۜۘۡۘۡۛۙۦۖ۫ۡۖۚۘۧۘ۬ۨۗ۬ۘۨۚۧۨۗۛۗ";
            while (true) {
                switch ((((str.hashCode() ^ 349) ^ 937) ^ 508) ^ (-457359388)) {
                    case -1920596640:
                        return;
                    case 376010497:
                        str = "ۙۚۨۘۧ۬ۡۘۨۖۨۘۤۨۖۘۛۡ۬ۨ۫ۧۚۚۤ۫ۜۘۗۜۗۗ۬ۡ۫ۖۘۧ۬ۡ۬ۧۦۖۤۘۘ";
                        break;
                    case 1146983442:
                        C4093lc.OooO0oo().OooO0oO();
                        str = "ۢۨ۬ۛۡۙ۫۠ۦۘۦۧۜۡۖۡۘۘۧۖۤۦۗۤۥۢ۠ۧۚۦۢۨۘۚۢۜ۫۟ۜۘۖۙ۠ۦۘۗ۟ۦۦۘۛۜۚۨۡۛۛ۬ۘۘ";
                        break;
                    case 1576117804:
                        C4246ph.OooO0O0().OooO0o0(this.OooO00o);
                        str = "ۥ۟ۦۘۚۘ۫ۤۘۖۦۥۥۘۦۧۜۘ۟۟ۙۢۢ۟ۘۢۡۘۧۘۦۗ۠ۘۘۗۙۦۘۥۤۦ";
                        break;
                    case 1910996945:
                        str = "ۦۘۦۘ۟ۧۙۚۗۜۖ۬ۦۨۛ۫ۖۢۖۘۥۨۧۘۡۧۘۤۡۙۗۨۥۘۡ۠ۨۢۘۥۧۦۨۜۦۗۨۨۗۧۖۥۡ۟ۖۘ۟ۦۥۘ";
                        break;
                }
            }
        }
    }

    public static class OooO0o extends Handler {
        private WeakReference<FullScreenTwoAdActivity> OooO00o;

        private OooO0o(FullScreenTwoAdActivity fullScreenTwoAdActivity) {
            this.OooO00o = new WeakReference<>(fullScreenTwoAdActivity);
        }

        public /* synthetic */ OooO0o(FullScreenTwoAdActivity fullScreenTwoAdActivity, OooO00o oooO00o) {
            this(fullScreenTwoAdActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            FullScreenTwoAdActivity fullScreenTwoAdActivity = null;
            C4093lc c4093lcOooO0oo = null;
            int i = 0;
            long j = 0;
            C4093lc c4093lcOooO0oo2 = null;
            int i2 = 0;
            long j2 = 0;
            long j3 = 0;
            int i3 = 0;
            C4093lc c4093lc = null;
            String str = "۬ۜۖۘۥ۠ۚۥۧۢۦۦۡۘ۠ۧۧ۫ۦۦۘۘۢۧۛ۠ۖۘۖۢۜ۫ۛۦ۫ۨۥۙۜۤۥ۟ۜۘۘۢۦۢ۫ۘۙۗۛ";
            while (true) {
                switch ((((str.hashCode() ^ 961) ^ 699) ^ 107) ^ 1737364038) {
                    case -1960556435:
                        c4093lcOooO0oo = C4093lc.OooO0oo();
                        str = "ۥ۟ۥ۠۫ۘۛ۠ۛۖۨۘۘۖۥۨۘۛ۬ۗ۟ۚۢۦۜۥۘۢۚۙۚۖۢۗ۫ۛۖۘ۟۬ۡۘۖۚ۟";
                        continue;
                    case -1910491969:
                        str = "۫ۧ۫ۙۜۨۜۘۥۘۖۖۖۘ۠ۖۗۡۚۙۥۨۖۘ۫ۛۦۘۤۦۖۘ۠ۤۥۘۜۨۥۘ۬ۤۤۥۙۦۛۢۚ";
                        j3 = j;
                        continue;
                    case -1725332688:
                        str = "ۡ۬ۥۘ۟ۢۤ۠ۥۜ۬ۙ۫ۚۖۧۘۥۢۢۦۙ۫۬ۢۜۘۧۜۥۤۤۦۨۘۦ۟۬۟ۤۨۘۡۜۚ";
                        continue;
                    case -1716526430:
                        i2 = 2;
                        str = "۫ۨ۫ۤۖۡۘۚۖۖۘۜ۠ۖۘۡ۬ۛۗۡۨۥ۫ۨۘۦۘۖۘۡۙۦۘ۬ۜۨۘ";
                        continue;
                    case -1715536498:
                        fullScreenTwoAdActivity = this.OooO00o.get();
                        str = "ۖۢۘۛۜۜۘۦۤۛۖۡۧۘۢۛۤۛۤۘۦۢ۫ۦۙۡۤۦۛ۟ۘۥۨۨۘۖ۬ۗۖ۟۠ۦۚۢ۬ۜ۟۫ۥۘۤۛۤۤۢۡ";
                        continue;
                    case -1402948156:
                        str = "ۤۨۜۗۡۤۙۦۡۛۚۡۛۡۙۛۨۢۖ۫ۘۘ۬ۦۘ۠ۧۖۨۧ۫ۖۖ۟ۥۛۦۘۥۚۖۘۜۡۗ";
                        i3 = i;
                        continue;
                    case -1359531644:
                    case 798490203:
                        break;
                    case -1294440710:
                        j = C4246ph.OooO0O0().OooO0O0.f15897Id;
                        str = "۟۫ۢۧۡ۟ۛۧۛۜۖ۬ۚۖ۬ۤۖۘۜۖۜۘ۫ۘۘۚۛۗ۫ۢۡ";
                        continue;
                    case -1113464163:
                        str = "ۤ۫۠ۘۥۡۘۢۙۖۘ۬ۜۗۡ۠ۘۘۤۨۘۘ۫۠ۜۘ۟۟ۘۘ۬ۤۜۘ۟ۜۘۢۘۨۛۙۗ";
                        c4093lc = c4093lcOooO0oo2;
                        continue;
                    case -959796651:
                        i = 1;
                        str = "۫ۛۥۨۡ۬ۢ۫ۥۘۡۨۘۘۚۛۢ۫۟ۖۘۙ۠ۛۦ۟ۥۚۜۜۧ۫۠ۢۘۢ۫ۘۖ";
                        continue;
                    case -681811442:
                        return;
                    case -183858764:
                        str = "ۢۢۡۘۡۧۛۗۡۘۢۚ۫۟ۚۚۖ۫ۗ۫۬ۡۘۤۘۤ۫ۜۛۙۜۦۥ۬ۖ۬ۡۜۖ۠۟۬ۨۘۛۧۜۜ۫ۗۘۨۚۥ۬ۙ";
                        i3 = i2;
                        continue;
                    case 216550742:
                        str = "ۥۗۨۘۢ۫۟۠۟ۥۘۘۘۧۘۙۦۗۗۗۚ۫۬ۧۨ۠ۜۙۙۧۢۥۘ";
                        c4093lc = c4093lcOooO0oo;
                        continue;
                    case 720575690:
                        j2 = 2;
                        str = "ۢ۟ۧۙۤۨۗۤۦۘ۫ۖۧۖۙۚۛۤ۠۫ۛۥۖۦ۫ۜۗۖۘۦۖۖۗۢۘ۠ۙ۬";
                        continue;
                    case 791406760:
                        str = "ۡۦۖۡۛۜۘۧۥۧۘۡۗۡۘ۠ۘۗۛ۬ۜۘ۟ۙۡ۠۫ۙۥۧۘۚۦۖۚۗۦۡ۟ۡ۠۫ۖۘۙۧۜ";
                        j3 = j2;
                        continue;
                    case 986046398:
                        c4093lc.OooO(fullScreenTwoAdActivity, i3, 2, j3);
                        str = "ۥۢۛۢۚۜۧ۫ۤۘۧۨۘۤ۟ۜۜۧۚۥۚ۟ۙ۠۫ۗۛۜۥۚ۫ۡۖۜۨۘۘۤۛۥۘ۬ۥۡۘۗۜ۟ۢ۫ۨۘ";
                        continue;
                    case 1195731196:
                        String str2 = "ۢ۟ۜۘۥۚۗۦۨۚۜ۠ۗ۠ۧۦۤۤۦۧ۫ۚۗ۫ۡۢۧۖۘۢۡ";
                        while (true) {
                            switch (str2.hashCode() ^ (-913253852)) {
                                case -1721941850:
                                    str = "ۙ۬ۨۙ۟۫ۨ۬ۨ۬ۦۡۧۚۚۡۚۘ۬ۥۨۘۥۛۨ۟ۨۦۘۜۘۨ۠ۙۡۖۧۥۚۚۥۘ۟ۧۚ۠ۦۙۗۛۘۛۨۘۨۖ۠";
                                    break;
                                case -1688240031:
                                    break;
                                case 494175126:
                                    str2 = "ۦۘۛۢ۬ۖۘۡۤۜۛ۠ۙ۟ۘۦۘۡ۫۫ۚۦۦۘۗۤ۬ۗ۟ۘۘۖۥۢۙۨۥۦۢ";
                                    break;
                                case 866730412:
                                    String str3 = "ۜ۠ۨ۠ۦۛۥۢۦۥۦۨۘ۫۠ۡۢۥۦۘۥۛ۠ۗۨۙۙۨۢ۬۫ۖۜۙۨۥ۟ۨۘ۫ۙۗ۟ۜ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-1840062140)) {
                                            case -651186161:
                                                str3 = fullScreenTwoAdActivity != null ? "۠۬۟ۧۜۡۘ۟۟ۗ۠۬ۖۚۢۦۤۖۜۘ۬۫ۙۗۤۘۘۨۦۚۘۗ۟ۤۥۖۧۙ۫۟ۙۦ۬ۖۘ۫ۥۜۘۥۘۥ" : "ۘۙۨۦ۟ۗۖۥۘۦۤۢۧۥۨۛ۫ۢۘۢۦۘۙۢۖۦۜۜۘ۬ۧۙۘ۟ۦۘۤۗۥۘ۬ۜۘۘۧ۬ۗۗۛۥۘۨۜۨۙۧۡۦۘۨۘ";
                                                break;
                                            case -227254559:
                                                str3 = "ۦۥ۫ۤۚۥۘۢۗۚ۫۫ۨۗۜۨۛۡۦۘۙۥۧۘۗۙۡۧۛۢ۫ۦۖۘۗۜۘۘۜۡۦۘۧۘۨۧۙۧۛۜۨۚۧ";
                                                break;
                                            case 474266186:
                                                str2 = "ۡۜۘۤۦۡۘ۫ۧ۫۠۬۫۬ۦۙ۫ۨۘۜۜۥۚ۫ۗۙۚۘۛۧۦۘ";
                                                break;
                                            case 1205873922:
                                                str2 = "ۗۡ۫۫۬ۖۦۛۛۥ۟ۢ۫۫ۡۤ۠ۗۥۥۗۡ۟۠ۨۤۨۘ۫ۖۨ۟ۗۖۘۗۛۧۛۥ۟ۘ۫ۛۢ۫ۢۖۜ۬ۜ۠ۛۧۗۙ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1235362961:
                        str = "ۤ۫۠ۘۥۡۘۢۙۖۘ۬ۜۗۡ۠ۘۘۤۨۘۘ۫۠ۜۘ۟۟ۘۘ۬ۤۜۘ۟ۜۘۢۘۨۛۙۗ";
                        continue;
                    case 1315063939:
                        str = "ۚۡۘۘ۟ۖۨۘۥ۠ۘۘۚ۠ۨۘۤ۫ۨۘ۠ۡۡۤۘ۬ۢۡۦۘۥۡۤۡۢۜۘۡۡۜۙۢۦ";
                        continue;
                    case 1448997855:
                        switch (message.what) {
                            case 1001:
                                str = "ۦۡۜۛۛ۫ۖۜ۫۠ۨۜۘۨۤ۬ۡۜۖ۠۟ۡۛۚۖۘ۬۠ۢۘ۫ۤۖۛۥۘۙۡۘ";
                                break;
                            case 1002:
                                str = "۫ۖۢۧۥ۫ۙۗۥۙ۬۟۟۬ۛۢ۫ۨۘۖ۠ۙ۫ۢۘۢۛۡۘۖۜۚۘۨۨۘۛۡۘۦۤ۫ۚۚۖۘۦۢۡۧۦۜ";
                                break;
                            case 1003:
                                str = "ۗۨ۫ۛۚۗۜۗۡۗ۬ۢۛ۬ۢۜ۫ۖۢۦۘۥ۬ۡۘۘۛۙ۟۫ۥۘۧۙۦۡ۫ۨۖۢۘۖۖۙۖۧۡۘۦۨۧۘۥ۟ۚۥۖۛ";
                                continue;
                            default:
                                str = "ۤ۟۟ۢۗۥۗۚۙۦۡۦۘۘۘۖۘۢ۟ۙۘۗۢۧۖۧۗۗۢ۟ۚۖۡۛۦۘۙۛ۫";
                                break;
                        }
                        break;
                    case 1513795276:
                        FullScreenTwoAdActivity.OooO0oo(fullScreenTwoAdActivity);
                        str = "ۤ۠ۚۦۛ۠۠ۧۡۘۦۚۚۤ۬ۜۘ۬ۥۥۘ۬ۚۖۘ۟۠۫ۤۥۜ۠ۨۧ";
                        continue;
                    case 2019984203:
                        c4093lcOooO0oo2 = C4093lc.OooO0oo();
                        str = "ۥۧۡۥۤۡۧۚۥ۠ۢۧۧۡۘۤۘۗ۟ۖۦۢۤۚ۠ۛۨۜۨ";
                        continue;
                }
                str = "ۥۢۛۢۚۜۧ۫ۤۘۧۨۘۤ۟ۜۜۧۚۥۚ۟ۙ۠۫ۗۛۜۥۚ۫ۡۖۜۨۘۘۤۛۥۘ۬ۥۡۘۗۜ۟ۢ۫ۨۘ";
            }
        }
    }

    static {
        String str = "۬ۧۦۘۛ۫ۖۗۤۖۘ۫ۙ۫ۥۨۡۛۢۢۡۘۘۘۖۧۚ۠ۥۘۖۘۡۘۚۢۥۦ۬ۛۦۥۥۘۘۧۘۧۢ۟ۗۦۘ۫ۡۧۤۦۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 323) ^ 705) ^ 918) ^ 2020405921) {
                case 632416020:
                    return;
                case 1998415742:
                    o00Oo0 = FullScreenTwoAdActivity.class.getSimpleName();
                    str = "ۧۜۡۥۜۘۡۥۖۘۜۘۙۡۨۜۦۧ۬ۜۗۚ۠ۙۦۘ۟ۥۦۘۡۦۢۤۨۢۢۜۜۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ int OooO(FullScreenTwoAdActivity fullScreenTwoAdActivity) {
        int i = 0;
        String str = "ۢۡۛۤ۟۫۟ۨۧۘۦۦۜۘۛ۟۟ۧۦۨۤۜۙۛۡۧۘ۫۟ۜۘۨۡۨۙۦۢۨۦۘۡ۟ۖۧۘ۫۬ۦۧۨۙ";
        while (true) {
            switch ((((str.hashCode() ^ 330) ^ 848) ^ 155) ^ 1059328608) {
                case -1754654153:
                    i = fullScreenTwoAdActivity.Oooooo;
                    str = "ۤ۠ۢۥۜۚۘ۬ۢۖۜۨۡۡۜۘۛ۠ۥۘۘۛۖۘ۠ۙۖۘ۟ۥۙۖۢۡۚۢۜۘۥۦۨۘۢۧۜۘۢۥۘۘۤۢۢ۫ۚۛ";
                    break;
                case -1521640855:
                    fullScreenTwoAdActivity.Oooooo = i + 1;
                    str = "ۤۘۗ۟ۖۙۖۜۡۦۛۙۖۤۨۘۛۦۨۘۛۧۖ۟ۙۚ۬۬ۡۘ۬۟ۘ۫ۢۘۘ۠ۥۘۚۦۖ۫۠۫ۚۛۙۢۥۧۘۘ۠ۖۘۦۜۦ";
                    break;
                case -1201691047:
                    str = "ۖۙۖ۠ۙۘۘۚۜۘۡۜ۬ۤ۬ۜۘۗۙۛۡ۠ۚۛۢۙۖۗۡۘ۠ۥۘۥ۫ۢۢۢۥۘۦۥۖۛۗۖۦۜۡ۠ۡۘۘۖۚۥۧۗۗ";
                    break;
                case -124429462:
                    return i;
            }
        }
    }

    public static /* synthetic */ void OooO0oO(FullScreenTwoAdActivity fullScreenTwoAdActivity) {
        String str = "ۦۡۜۘ۟ۦۜۘۜ۫ۢۧ۫۬ۤۖۗۧۢۨ۠ۛۡۘۛۦۧۘۖۦۧ۟ۦۢۤۡۚۚۘۚۤۧۦۘۨۢۦ";
        while (true) {
            switch ((((str.hashCode() ^ 253) ^ 257) ^ 965) ^ (-2078725115)) {
                case -239805062:
                    return;
                case 235116179:
                    str = "ۛ۠ۘۗۥۡۚۤۖۧۛۤۡۡۙۘۡۧۘ۫۫ۜۘۖۧۜۘ۬ۘۧۡۘۜۘۛۘۜۘۧ۫ۖۘۤۧۥۧۚۨ";
                    break;
                case 1843564724:
                    fullScreenTwoAdActivity.OooOo0o();
                    str = "ۤۛۖۢۘۡۥۙۚۛۛۥۘ۬ۦۘ۟ۥۡۥۙۙۘ۟ۧۥۨۧۘۨۖۚ۫ۙ۫ۨۥۧۥۡۛۥ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooO0oo(FullScreenTwoAdActivity fullScreenTwoAdActivity) {
        String str = "۫ۤۧۡۗۨۘۗۢۨۘۖ۫ۡۙۗۨۘۘۧۦۥۨۖۘۛ۠ۙۢۤ۫ۛۡۘۙۚۙۤۥ۟ۡۙ۫ۙۡۦۦۘۤۘۦۘ۬ۙۦ";
        while (true) {
            switch ((((str.hashCode() ^ 465) ^ 989) ^ 768) ^ 1464977605) {
                case -2060788346:
                    return;
                case -632775539:
                    str = "ۛ۬ۨۘۥۨۥۡ۬ۦۘۗۗۚۨۖۨۘۗۚۗ۬۬ۛۖۗۙۨۢۘۖۦ۠ۢۦ۫ۘ";
                    break;
                case 1134851763:
                    fullScreenTwoAdActivity.OooOOOo();
                    str = "ۡۘۦۘ۠ۘۢۗۚۘۘۗۧۛۚۙۡۘۨۢۜ۟ۗۗۘۧۚۧ۬ۖۢۘۧ۟ۗۧۥۤۖۘۛۖ۟۠ۤۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean OooOO0(FullScreenTwoAdActivity fullScreenTwoAdActivity) {
        String str = "ۥ۟ۜۛ۫۠ۗۥ۬ۢۨۜۘۚۖۢ۫۠ۡ۬ۥۧۘۘۖۥ۠ۢۤ۟۫ۦ";
        while (true) {
            switch ((((str.hashCode() ^ 589) ^ UiMessage.CommandToUi.Command_Type.CLOSE_CONTINUE_ACK_VALUE) ^ 637) ^ (-684894854)) {
                case -1953815796:
                    return fullScreenTwoAdActivity.Ooooooo;
                case -1507344842:
                    str = "ۖ۫ۘۥۖۨۘ۠ۚۘۘۤۘۥۜ۠ۢۦۘۨۙۦۥۘۥ۬۟ۚۙۗۘۨۦۘۥ۫۠ۤ۫ۥۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ TextView OooOO0O(FullScreenTwoAdActivity fullScreenTwoAdActivity) {
        String str = "ۚۥۧۘۡۦۗۘۜۤۥۜۖۘۨۧۡۨ۠ۖۙۙۘۤۛ۬ۘۛۗۚ۠ۗۥۤۙۜۙۡۗۦۙۧۡ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_VIEW_VALUE) ^ 250) ^ UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_VIEW_VALUE) ^ 1248023139) {
                case -2031205544:
                    str = "ۖۚۢۦۚۚۘۨۨ۫ۜۛ۟۟ۜۥۖۖ۫ۧۘ۠ۜ۟ۧۘۗ۫ۨۖۖۦۨۦۚۡۘۜۤۥۘۦۡۖۘۚۜۥۘۘ۟ۡۙۤۖۘۜ۠۟";
                    break;
                case 1120383614:
                    return fullScreenTwoAdActivity.OooooOo;
            }
        }
    }

    private void OooOO0o() {
        String str = "ۛۥۙۢۨۦۘۤۤۦ۬ۗۦۥ۫ۥۘۘۙۤۗۘۜۘۗۙۡۧۥۥۘۤۜ۟۟ۚۦۖۢۛۢۥۢ۫ۢ۟";
        OooO oooO = null;
        while (true) {
            switch ((((str.hashCode() ^ 254) ^ 348) ^ 224) ^ (-700480068)) {
                case -1524852202:
                    return;
                case -1223984199:
                    this.OoooooO = null;
                    str = "ۗۜۛۧ۫ۗۨۨۜۧۨۥۘۤۦۘۙۛۗۚۤۡۘۙ۠ۖ۟ۘ۫ۚۗۛ";
                    break;
                case -995162620:
                    this.Oooooo = 0;
                    str = "ۢۢۙ۠۠ۥۙ۬ۥۖۦۖۘۖ۠ۖۚۖۗۧۛۡۘۜ۫ۤۢۘۧۘۤۛۨ";
                    break;
                case -26916988:
                    oooO = this.OoooooO;
                    str = "ۧ۫ۜۘ۫۠ۥۖۥۖ۬ۙۢۢۖۘۖۢۢۢۢ۫ۤۗۥۘۤۛۙ۫ۖۢۦۙۗۥۤۜۘۢۘۦ۟ۨۨۘۤ۟ۛۚۨۨ۬۠ۜۘ۫ۧۘ";
                    break;
                case 129101691:
                    oooO.cancel();
                    str = "ۜۢ۫ۥ۠۠ۥۖۡۘۗۘۘ۬۠ۖۘۤ۠۠ۙۚ۟ۤۙ۬ۨۦۥۘ۟ۡۛۙۖ۬ۤۨۡۘ";
                    break;
                case 910109841:
                    str = "ۤ۠ۚۡ۫ۢۖ۬ۦ۟ۡۖۘۧۡۜۨ۫ۛۦۨۨۙۢۡۡۧۘۧۛۢۗۜۧۘ۬ۖۜۘ";
                    break;
                case 2005155756:
                    String str2 = "ۗ۠ۘۚۤ۫ۗ۬ۛ۫ۚۨۦۥۘۘۢۥ۠ۜۜۘ۬۬ۦۘۥۡۡۘۤۘۙۡۧ۟ۛۡۤۖۘ۠ۦۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1077016565)) {
                            case -1350411034:
                                str = "ۡۨۛ۟۫ۧۧۙۗۨۥۗۤ۟ۖۘ۠ۖۦۧۖۥۘ۬ۘۥۢۛۘۘۧۖۥۙ۫ۜۘۧۥۜۘ";
                                continue;
                            case -1006607485:
                                str = "ۗۜۛۧ۫ۗۨۨۜۧۨۥۘۤۦۘۙۛۗۚۤۡۘۙ۠ۖ۟ۘ۫ۚۗۛ";
                                continue;
                            case -814996180:
                                str2 = "ۖۧۖۡۥۢۗۜۚۡۗۨ۠ۚۡۘ۫ۢۨۚۢ۬ۨ۟ۧۢۦۨۘۥۨ";
                                break;
                            case -637406325:
                                String str3 = "ۦ۟۠۫۬۠ۘۘۘۚۧۖۡۖۢۦۙۦۢۡۥۚۖۜۘۙ۠ۦۨۛۨ۠ۨۤۨۦۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 973528374) {
                                        case -1318984587:
                                            str2 = "ۚۛۖۤۙۖۨۘۛ۟ۢۚۧۨ۫ۢۘۨۘۢۜۡۘۢ۟ۜۘ۠ۜۖ۫ۧۘۘۘۧۛۨۘ";
                                            break;
                                        case -1116235888:
                                            str2 = "ۤۨۙۛۧۦ۫ۘۜۘۙ۫ۦۘۖۜۖۨۚۗۚۧۚۦ۠ۚۗۦۘ۫ۘۥۘ۬ۙۧ۫۠ۧ";
                                            break;
                                        case -1085942648:
                                            str3 = "۟ۧۜۢۙ۟ۜۨۙ۠۟۠ۡۥۥۤۨۖۘ۟۠ۜۘ۬ۜۦ۬ۢۤۥۜۜۘۤۘۘۜۦۢۦۛۘۘۢۘۛۨۥۨۘۢۙ۟";
                                            break;
                                        case 1189621077:
                                            str3 = oooO != null ? "ۧۨ۠ۖۚۗۢۡۖۘ۟ۧ۬۠ۘۚۢۘۖۛ۫ۨۢۤۤۘۧ۬ۥۢۢۥۘۢۖ۬۠۫ۜۗ۠۬ۖ۫ۢۤۡ۫ۗ" : "ۚۡۘۘۘۙۧۧۢۖۘۧۗۚۥۧۜۘۗۦۨۘۜۗ۠ۚۚ۬۬ۢۨۥ۫ۡۘۨۗۛۦۘۤ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
        }
    }

    private void OooOOO(String str) {
        String str2 = "۫ۙۚۦۖۤۗ۬ۡۘۘۡۚ۠ۢۚۡۢ۠۫ۖۦ۬ۚۘۙ۬ۜۨۖ۬ۥ۟ۘۙۖۘۚۗۚ۠ۚ۬۟۟۫۟ۛ";
        C4230p1 c4230p1OooO0OO = null;
        C4230p1 c4230p1OooO0OO2 = null;
        while (true) {
            switch ((((str2.hashCode() ^ 332) ^ C1801a.f11013aX) ^ UiMessage.CommandToUi.Command_Type.SET_FONT_VALUE) ^ (-2068317072)) {
                case -1717972559:
                    return;
                case -1615936224:
                    str2 = "ۧۨۜۤۥۨۚۡۜۘۦۛۙۙۙۧۥۤۦۧۜۜۘۡۘۦۘ۫ۢۦۘ۫ۤۡۘۢۦۘۙۜۛۚۢۡۗۖۗۜۛۖۦۡۖۘ";
                    break;
                case -1510803586:
                    str2 = "ۡ۠ۚۛۦۛۡۦۥۢۚ۟ۛ۫ۜۛۛۨ۫ۗۦ۟۠ۤۙۘۧۧۧۥۙۨۘ۟۬ۘۖۖۜۜ۠۬۬ۢۧ۫ۗ";
                    break;
                case -1142047349:
                    String str3 = "ۦۥ۠ۖۛ۬ۨۗۤۘۛۨۘ۠ۨۦۘۙۧ۟ۖۚۡۘۘۥۙۨ۠ۖۨۥۖ۫ۧ۫ۡۢۖ";
                    while (true) {
                        switch (str3.hashCode() ^ 859433654) {
                            case 1091763993:
                                str2 = "۠ۡۥ۟ۤۙۡۤۖۘۚۙ۠ۤ۠ۚۖ۟ۖۘ۟ۤ۟ۘ۟ۨۜ۟ۚۡۙۗۡۢۖۨ۬ۗۢۗۨۢۖۦۘ";
                                continue;
                            case 1252961177:
                                str3 = "ۘۗ۬ۥ۟ۨۖۢۨ۫ۡۚۧۚۤۙۧۧۖۘۘۚۗۡۙۨۖۗۘۡۖۚۘۘۨ۬ۨ۬ۖۡ";
                                break;
                            case 1322928075:
                                String str4 = "ۤۡۜۘۥۦۨۗۗۨ۠۠ۡ۬۠ۡۨ۬ۦۨۖۨۘۡ۫ۜۘۘ۫ۨۘۗ۫ۙ";
                                while (true) {
                                    switch (str4.hashCode() ^ 1899258252) {
                                        case -1834101976:
                                            str4 = "ۢۨۙۙۘ۟۠ۗۨ۫ۗۨۘۙۥۧۘۗۡۡۘ۫ۜۘۘ۟ۚۖۘ۫ۤۖۘۗۨۡ۬۠۠ۥۧۙ";
                                            break;
                                        case -933692722:
                                            str4 = str.endsWith(".gif") ? "ۙۘ۬ۗۘۖۘۘ۠ۦۘۙۗۦۘۦۖ۫ۗۤۨ۠ۜۙ۟۫ۖۘۚ۫ۥۘ۟ۡۘۚۢۥۘۙۚ۫۠ۦۜ۬ۡۘۙۥۤۧ۠۠ۖۤۨۘۙۨۛ" : "ۡۛۗ۟ۘۜۘۗۥۘۘۛۤۡۤ۬۟ۨ۟ۥۢۥۦۘۢۙۥۖۤ۫ۨۖۨۘ";
                                            break;
                                        case 737045341:
                                            str3 = "ۡۡۥۘۖۗۘۢۖۡۘۚۦۘۦۘ۟ۙۦۘۨۡۘ۫۟ۗۦ۫ۗۘۥۘۤۚ۬ۙۥۘۘۚۚۙۘۥۧۢۙۥۨۡۗ";
                                            break;
                                        case 1400011192:
                                            str3 = "۟۟ۧۤۛ۟ۦۖۧۘ۫ۤۜۘۨۘۖۚۢۢۛۨۗۥ۠ۜۘۚۡۥ۟۟ۘۘۚۜۡۗۦ۬ۡۢ۠ۜۙۢ۟۠ۨۘۜۨۜۗۥۦۘۧ۠ۛ";
                                            break;
                                    }
                                }
                                break;
                            case 1500862861:
                                str2 = "ۥۤۤۘۦۗۗ۠ۚ۟ۖۤۡۖۧۢۥۤۜۢۢۜۤۥۘ۬ۢۦۚۨۦۘ";
                                continue;
                        }
                    }
                    break;
                case -1133147550:
                    c4230p1OooO0OO2.OooOOoo(o0oo0000.OooO0OO);
                    str2 = "ۛۚۡۖۗ۫۫ۖۘ۟۫ۥۘ۠ۛۥۘۜۙۨۗۛۜۙ۟۫ۘۙۥۖۨۜۤ۬ۗۗۜۨۘۧۛۘ۬ۦۘۖ۫ۦۜۡۦۘ";
                    break;
                case -747139980:
                    C4122m4.OooOOO(this, str, this.OooooO0, c4230p1OooO0OO2);
                    str2 = "ۧۨۨۘۚۧۘۧۙۛ۫۬ۛ۫ۖۦۖۛۘۘۨ۠ۘۘ۫ۗۦۘۚۜۨۛ۠ۜۘ";
                    break;
                case 359123178:
                    c4230p1OooO0OO = C4122m4.OooO0OO();
                    str2 = "ۖ۟ۛۦ۠ۦۘۥۜ۠ۗۧۜۘۘۢ۫۫ۘۥۘۢۤۨۘۥۨ۠ۙۗۛۜۘۨۤۨ۟ۖۧۜۥۖۛ۫ۤۜۘۚۜۤ۫ۛۢ۟۫ۡۘ";
                    break;
                case 1085938703:
                    str2 = "ۜۙۡۢۦۦۘۙۦۛۘۢ۫۬۠۠ۛۘۛۚ۫۬ۛ۟ۡۖۜۗۢ۟ۛۢۙۡۚ۫ۥۘۜۚۙۥ۫ۤۨۙۡۨ۫ۦۘ";
                    break;
                case 1232325389:
                    str2 = "ۨ۟ۜ۬ۙۘۘۡۜۘۘۖۚۜۨۛ۠ۙ۟ۘۘ۬۟ۚۗۤۜۥ۠ۗ۫ۗ۟ۖۙ۠ۙ۫ۡۘ۫۠ۨۘ۠ۜۘۘ";
                    c4230p1OooO0OO2 = C4122m4.OooO0OO();
                    break;
                case 1264026606:
                    C4122m4.OooOO0O(this, str, this.OooooO0, c4230p1OooO0OO);
                    str2 = "ۡ۠ۚۛۦۛۡۦۥۢۚ۟ۛ۫ۜۛۛۨ۫ۗۦ۟۠ۤۙۘۧۧۧۥۙۨۘ۟۬ۘۖۖۜۜ۠۬۬ۢۧ۫ۗ";
                    break;
                case 1365355891:
                    OooOOO0();
                    str2 = "۬ۧۛۜۘۤۚۧۚۗۢۦۦ۟ۦۘۦۨۤۚۨۦۘۤۖۜۘۡۘۥۘۧۘۧۘۦۜ۟ۗۖۖۘۦۚۖۤ۫ۜۤۛۡۘ۟ۦ۠ۗۘۤۧ۠ۘۘ";
                    break;
                case 1719988656:
                    c4230p1OooO0OO.OooOOoo(o0oo0000.OooO0O0);
                    str2 = "ۚۖ۟ۗۤۥ۫ۨۥۘۖۜۧ۠۬ۦۘۛۧۧۦۨۙ۬ۗۦۜ۫ۘۨۦۙۤۡۢۤۢ";
                    break;
            }
        }
    }

    private void OooOOO0() {
        String str = "ۥۜۨۘۖۙۡۘۦ۫۫ۨۡۨۘۜ۠ۨۡۘۜۦۗۙۗۙۦۚۘۘۛۤۧۜۖۧۘۧۨۤۧ۬ۙۚۤۧ";
        int i = 0;
        OooO0o oooO0o = null;
        OooO0o oooO0o2 = null;
        int i2 = 0;
        int i3 = 0;
        OooO0o oooO0o3 = null;
        int i4 = 0;
        while (true) {
            switch ((((str.hashCode() ^ 761) ^ 539) ^ 563) ^ (-115547195)) {
                case -2048733543:
                    oooO0o2.obtainMessage(i2).sendToTarget();
                    str = "ۨ۟ۢۘۗۖ۫ۚۖۘۥۧۧۧۨۦۘۤۖۨۘۡ۠ۙ۫ۘۦۘ۫۟۫ۙۗۜۘۢۘۙۖ۠ۧ";
                    continue;
                case -1961367791:
                    this.OooooO0.setOnClickListener(this);
                    str = "ۦۙ۠ۤ۟ۜۜۦۘۦۜ۠ۧۗۢۨۢۨۜۙۨۛ۟ۛۡۜۡۦۢۤۘۦۙۨۡ۟";
                    continue;
                case -1760059039:
                    str = "۫ۦۧۥۨۘۙۦۡۨۤۤ۠ۥۖ۫۬ۙۚۡۘۘۡۨۘۘ۬ۤۥۘۧۧۥۨۡۦۤۘۖ";
                    i4 = this.o00O0O;
                    continue;
                case -1688116863:
                    OooOO0o();
                    str = "ۛ۫ۤۨۚۡ۠ۜۙۗۨۤۜۨۨۚۗۡۨۤۡۛۢۗۗۡۡۘ۟۫ۥ";
                    continue;
                case -1617718117:
                    return;
                case -1278839124:
                    oooO0o3 = this.o0OoOo0;
                    str = "۟ۘۛ۬ۗۜۘۗۗۥۘۛ۫ۨۜۙۘۘۡ۟ۨۘۥۙۛ۟ۧۢۗۤۨۡۧۖۘ۠۠ۗۖۛۛ";
                    continue;
                case -999286784:
                    OooOo0O();
                    str = "ۜ۠ۜۘۛۚۜۚ۬۬ۖۨۚۤ۫ۗۥۦ۠ۡ۠ۚۙۢۦۘ۠ۤۤ۟ۨۧۡۦۧۘۚۚۢۘۢ۬۫ۚۤ";
                    continue;
                case -755020058:
                    str = "ۧ۠ۧۘۡ۬ۦ۠ۡۖ۫ۚۨۘۨۘۜ۫ۖۘ۟ۗۢ۬ۛۗۜۦۘۘ۫ۚ";
                    oooO0o2 = oooO0o;
                    continue;
                case -663530734:
                    str = "ۥۥۡۘۚۙۖ۠ۖۘۘ۟ۛۜۘ۬ۜۥۚۗ۟ۡۖۙۗۖۖۘۗۙۛۜ۬ۢۥۛۧۨۛ۠ۚۡۘۧ۫ۚۢۛۡۘ۬ۖۡۥۢۜ۫ۧۙ";
                    i2 = i3;
                    continue;
                case -89572865:
                    str = "ۗۧۦۘۨ۫ۨۘۡۘۥ۠ۨ۟ۘۛ۠ۛۤۜۘۡۢۜۥ۫ۜۛ۬ۛۥ۠۟ۢ۬ۛۛۘ۠ۧۙۜۘۙۜۜۘ";
                    oooO0o = this.o0OoOo0;
                    continue;
                case 511407038:
                    String str2 = "ۧۖۚۛۧۨ۠ۧۢۜ۟ۜۨۨۘۧۢۗۜ۬۟ۖۗۖۘۨۜ۠ۡ۬ۙ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1636011793)) {
                            case -1030138416:
                                break;
                            case -990753735:
                                str2 = "ۗۛۗۚۥۘۘۨۨ۫۬۫ۘۘ۠۟ۗۗۜۤۡۗۖۦۜۦۘ۬ۜۜۧۦۥۘۤۘۤۛ۠ۤ۫ۥ۬ۜ۬۟ۢ۫ۨۚۥۥۤۖۚۨ۫ۦۘ";
                                break;
                            case -981059538:
                                String str3 = "ۥۘ۫ۥۥۡۘ۬ۦ۠ۘۨۦۨۘۖ۠ۦۦۦۧۘۙۜۨۘ۟ۦۘۖۗۥۦۢۚۜۘۤۡۥۖۘۢۜۖۡ۠ۚۡۨۘ۫ۡۧۛۗۖ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1158325336)) {
                                        case 886480395:
                                            str3 = "۟ۨۙۤۖۜۘۨۦۧۚۖ۠ۘۖۜۘۧۧۘۧۢۗۥۦۡ۫ۧ۬ۢۨۘ";
                                            break;
                                        case 919460175:
                                            str3 = i4 == 102 ? "ۘۚۡۘۜ۟ۥۖۛۖۘۙۦۗۗۛۡۢۤۛۛۢۖۘۡ۫ۚۨۢۨ۠ۡۖۘ۟ۧۦ۠۟ۖۘۦۖۧۘۙۗۘۜۖۖۘۢ۠ۥۘۨۘۖۘۚۖۘ" : "۫ۜۙۜۨۢۨۢۨۦ۠ۥۛ۬۫ۙۖ۟ۚۨۗۦۗۜۘۖۚ۫ۧۤۜۘ";
                                            break;
                                        case 1268075093:
                                            str2 = "ۜۤۛ۟۟ۜۡۜ۫۠ۨۥۘۦ۫ۖۘۗۚۗ۬ۤۤۧۧۚۛۡۗۜۥ۠";
                                            break;
                                        case 1971610019:
                                            str2 = "ۤۚۘۘ۟ۖۗ۫۬ۦۘۗۥۘۘۗۤ۫ۚۧ۠ۜۘۛ۠۬ۗ۟ۡۗۧۖۙ۬ۗۡۘۙ";
                                            break;
                                    }
                                }
                                break;
                            case 1490439266:
                                str = "ۘۘۖۡۡۥۖۗ۟۠ۘۥۜ۬۠ۢۢۘۢۢۡۡۗ۫ۢۥۘۖ۬ۡۘۗۘۨۡۜۤۗۘۨۘۦۧۨۘ۟ۖۛۢۜۘۦۚۨۙۢۢ";
                                break;
                        }
                    }
                    break;
                case 679915485:
                    str = "ۤۨ۟ۢۙۛۨۡۖۘۥۤۥ۬ۗۨۘۨ۠ۜۘۙۢۗۨۛۢ۠ۚۨۘۜ۫ۛۘۧۘۘۥۜۡۘ";
                    continue;
                case 735247974:
                    str = "ۜ۠ۦۤۖۖۥ۬ۨۤۥۜۘ۫ۛۨۢۥۦۚۜۥۨۡۦۘ۬ۨ۫ۤۧۦۧۘۨۦۚۜۘۥۥۦۦۤۘۘ۫ۚۨۦۤۥۥۙۘۥۙۜۘ";
                    continue;
                case 836921980:
                    i3 = 1001;
                    str = "ۡۦ۠ۙۛۘ۬ۜۦۘۥۚۜۥۗ۟ۨۥۚ۠ۡ۠ۘۜۗۢۤۘۘۛ۠۬ۚ۟ۙۥ۫ۜۦۙۛۖۖۡۘ";
                    continue;
                case 1067865018:
                    this.Ooooooo = true;
                    str = "۟ۤۘۙۤ۬ۤۡۥۥۚۚۦۚۖۘۡ۟ۜۜۖۡۙۦۗۥۙۨۨۨۛۧۥۘۘۙۗۡۧۨۨ۠۬";
                    continue;
                case 1158336693:
                    str = "ۤۨ۟ۢۙۛۨۡۖۘۥۤۥ۬ۗۨۘۨ۠ۜۘۙۢۗۨۛۢ۠ۚۨۘۜ۫ۛۘۧۘۘۥۜۡۘ";
                    oooO0o2 = oooO0o3;
                    continue;
                case 1303506159:
                    str = "ۛۦۜۘۦۧۡۡۘۧۨۥۤۜۤۨۥۖۘۙۛۥ۟ۢۦۘۦۖۡ۟ۖۖۘ";
                    i2 = i;
                    continue;
                case 1311982220:
                    i = 1003;
                    str = "ۤۙۡۘۛۙۘۘۨ۬ۖۘ۠۬ۢۜۙۘۜۥۛۘۘۧۢۘۘ۫ۗۦۚۨۧۦۚۥۢۛۘۖۦ۟۬ۘۘ۬ۚۦۛ۬ۖۜ۟ۡۤۗۨۘ";
                    continue;
                case 1410183579:
                    break;
                case 2100539721:
                    String str4 = "ۧۨ۬۬۟ۢۗۦۜۘ۟ۖۚۧ۠ۖۥۖۡۘۘۤۗۡ۬ۧۜۙۚ۟ۜ۫ۤۤۗۡۦ۠۠ۧۖۘۘۜۛ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1087034785)) {
                            case -753575079:
                                str = "ۦۗ۬ۙۢۤۦۦۚۢۜۤۥۗۜۘۘۢۜۘۛۢۨۚ۟ۥۘ۫ۨۥۘۦۦ۠ۢۧۦۘۘ۠۟۫ۥۙ۫ۖۡۘ۟۬ۥ۫۫ۡۘ۟ۛۦۢۢۡ";
                                continue;
                                continue;
                            case -656073685:
                                str = "ۚۤۨۘۜۜۡۢۡ۬ۜۢۦۘ۬۬ۥۘۙۤۘۘۖۙۛ۟ۙۢۜۚۨ۟۬ۚۗۨۘۘۥۧۨۘۗۤۘۘۤۥۘ";
                                continue;
                            case -26453994:
                                str4 = "ۡۜۦۘۤۗۙۙۥۦۘۤۖۜۗۘۖۢۗۖۖۚۘۘۖۧ۟ۘۙۢۚۡۖۘۤۧۚۙۨۨۘۤۢۖۘۙۦۘ";
                                break;
                            case 979072744:
                                String str5 = "ۜۡ۬ۢۨۘۘۖۤۨۛۘۘۡ۠۟ۜۖۖۘۖۘۦۙۘۜۘۥۛۘۘۜۙۤۘۧۘۚۖۗ۠۟ۖۘۦۛ۠";
                                while (true) {
                                    switch (str5.hashCode() ^ 116079744) {
                                        case -1951453956:
                                            str5 = "ۙۚۘ۠ۨۘۘ۬ۗۤۗۘۘۨۚۗۤۛۜۘۙۥۥ۟ۥۛ۟ۨۡۖ۫۟ۡۨۙۘۘ";
                                            break;
                                        case -1734378504:
                                            str5 = i4 == 100 ? "ۤۦۧۦ۫ۚۜۗۖۗۛۖۘۨۘۗۨۡۨ۠۠ۚۗۨ۟ۡۖۜۘۘ۬ۘۜ۠ۧۡ۠" : "۬۬ۗۗۙۡۘۢۥۙۦۦۘ۟ۨۙۨۗۡۥۤۥۨ۟ۦۘۛۖۥۛۢۗۤۨۜۢ۟ۥۘ";
                                            break;
                                        case 1224488775:
                                            str4 = "ۡۡۛۚۗۡۘ۠۟ۦۡۘۘ۫ۦۗۘۖۦ۠ۚ۫ۥۛۦۘۛ۫ۥۖۤۨۘۤۚۘۘۤۥ۬";
                                            break;
                                        case 1905293769:
                                            str4 = "ۜ۠ۨۘۡۡ۬۫ۦۡ۠ۙ۬ۖۥۨۘۤۜۨۙ۫ۙۗۗۜۧۢۨۦۖ۠۫۫ۥۘۧ۠ۥۘۡۖۖۘ۫ۚ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
            str = "۠ۡۤ۫ۘ۟۬ۚۖۘۗۤۡۘۢۤۦۨۘۢ۫ۜۢۚۡ۫ۥ۟ۘۧۨۡۘۜۘۛۨۦۙۤ۟۬ۘ۠ۛۜۤ۠ۤۨۥۨ";
        }
    }

    private void OooOOOO() {
        String str = "ۗۨۥۗ۠ۘۘۥۖۦۗۨۦۘۥۨۧۘۢۢۨۚۤۜۧۥۚۚۡۘ۬۬ۜۙۥۛۡۨۘۛۜ۫ۘۜۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 369) ^ 876) ^ 777) ^ (-558234352)) {
                case -702477154:
                    str = "ۛۨۘ۫ۘ۠ۘۨ۟ۢۥۨۘۜۡۤۧۙ۟ۚۜ۬ۚۨ۬۫۬ۦۛۧ۫ۜۡۡۘۖۢ۫ۗۙۧۘۦۖۘ";
                    break;
                case -261648500:
                    OooOOo0();
                    str = "ۥۡۧۘۦۘۖۖۨۗۧۘۖۖۦۨۘۦۛۧۦۛۙۛۢۘ۠ۗ۟ۚ۫ۜۘ۬ۚۦۘۤۚۡۘ";
                    break;
                case 90938206:
                    return;
                case 1132930703:
                    str = "ۥۡۧۘۦۘۖۖۨۗۧۘۖۖۦۨۘۦۛۧۦۛۙۛۢۘ۠ۗ۟ۚ۫ۜۘ۬ۚۦۘۤۚۡۘ";
                    break;
                case 1324442060:
                    String str2 = "ۦ۫ۡۦ۫ۥۘۖۗۙۘۖۧۧۖۘۦۦۚۥۥۨۘۤۗۗۤۖ۟ۙۖۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1827659818) {
                            case -1371808184:
                                str = "۬ۜۖ۫ۖۘۘۘۨۨۘۖۙۖۗۤۚۗۤۡۘۤۜۦۘۡۤ۠ۨۤۢۤۗ۟۫ۧۜۡۨۤۦ۬ۦۘۖۨۛۢۜۙ۫ۦۧۦ۫ۛ۠ۙ۠";
                                continue;
                            case 919645828:
                                String str3 = "ۤۤ۟ۨۦۡۢۡۤۤۜۡۘۡۘۜۘۖۨۘ۠ۗۥۘۨۘۗۥۤۢۢۡۦۥۨۘۥۦۜۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-834206688)) {
                                        case 213237082:
                                            str3 = "ۡۨ۟ۧۦۚۦ۬۠ۜۥۧۨۢۜۘۘ۫ۨۛۙۜۘۥۤۢۘۜۜۘۙۢۥۘۛۜۥۘ۬ۡۘۛۛۦۚ۬ۦۢۖۡ۠ۦۘ";
                                            break;
                                        case 1006950196:
                                            str3 = C3715b4.OooOO0o(this) ? "۫ۦۤۙۦۜ۟ۜ۟ۢۡۜۘۚۗ۠ۗ۫ۡۘ۫ۡۥۦۡۡۗۛۙۡۜۜ" : "۫ۗۡۛۘۜ۬ۡۘۖ۠ۜۘۡۦۜۗۢۦۙۛۦۧۛۢۚۙ۫ۡۗ۬";
                                            break;
                                        case 1025310519:
                                            str2 = "۠ۧۨۘۙ۟ۦۛۙۖۗۦۙۦۡۦۘۧۦۗ۬۟ۧۗ۬ۙۚ۫ۗۦ۫۫ۜۚۛۜۗۛۛ۫ۡۘ۬ۗۖۨۘۦۜۨۦۘۦۤۖۜۗۖۘ";
                                            break;
                                        case 1817012245:
                                            str2 = "۫ۛۚۦۨۘۘ۬ۘۘۘۙ۠ۜۜۢ۟ۛ۟ۦۚۡۥۘۦۧۥۦۗۨۢۥۧۗۢۘۘۥ۬ۧۘۙۦۘۖۢ";
                                            break;
                                    }
                                }
                                break;
                            case 1478347209:
                                str2 = "ۚۧۨۨۙۢۤ۟۫۠۟ۘۛۡۘۚ۟ۜۘۛۘۦۚۨ۬۟ۡۘۢ۫ۜ";
                                break;
                            case 2067662124:
                                str = "ۧۙۨۙۘۡۘۚۖۘۦ۠ۗۖۧۤۜۨۦۘۤۚۘۘۗۜ۟ۚۦۘۡ۫ۧۖۢ۫ۖۡۘۘۙ۠ۧ۠ۥۘۧ۠ۥۗۨۤ";
                                continue;
                        }
                    }
                    break;
                case 2026639223:
                    this.o0OoOo0.obtainMessage(1002).sendToTarget();
                    str = "ۙۡۨۥۡۡ۬ۖ۠ۨۗۥۘ۬ۖۥۜۗۢۛۢۖۨۦۖۘۚ۠ۛۥۘ۫ۨ۬ۨ۟ۨۘۖ۠۫ۖ۫ۦ۠ۢۜۘۖۛ۫ۜۚ۬ۡۘ";
                    break;
            }
        }
    }

    private void OooOOOo() {
        String str = "ۨۘ۟ۢۥۛۖ۠۟۬ۧ۫ۨ۟ۚۡۛۜۛۙۙۖ۫۬ۚۨ۬ۥۙۦۘۢۛۥۘۛۦۚۦۨۤۦۤۜۘۤۤۤۙۧۤ";
        String str2 = null;
        OooO oooO = null;
        while (true) {
            switch ((((str.hashCode() ^ 699) ^ 816) ^ 748) ^ (-1625303586)) {
                case -2057889879:
                    str = "ۚ۫ۦۘ۟ۧۗ۬ۢۤۖۧۗۢۖۗ۠ۚۚ۬ۜۘۤۗۢۥۖۨۘۡ۟ۛۤۨۖ۫۟ۧ۠ۤ۟ۘۧۖۘۥۥۡ۬ۨۘۙۗۖۘۗۜ۟";
                    continue;
                case -2015772566:
                    String str3 = "ۗۥۨۖۘۘ۫ۘۥۤۘۦۘۚۧۙۜۘۡ۬ۛۤۦۧۧۛۧ۟ۨۛ";
                    while (true) {
                        switch (str3.hashCode() ^ (-861886156)) {
                            case -1921034842:
                                str = "ۧۗۜۘۚۡ۫۬ۥۘۡۥۤۙۖۚۧۨۤۖۧ۬ۨ۫۬ۛۦۜۘ۫ۘۜۘ۠ۛۜۨۧۜۘۢۛۥۘۥۜۤ";
                                break;
                            case -248638368:
                                str3 = "ۦۤۦۘۡۙۖۘ۫ۜۖۘۥ۠ۥۘ۟ۨۨۘۤ۠۬ۧۡۨۥۛۦۥۨۧۛۢۘۘۙۙۡۘۛۜۥ۠۫ۙۙۜۘۨۗ۫ۧۢۜۛۡۨ۫ۚۧ";
                                break;
                            case 255925486:
                                String str4 = "ۨۙ۠ۘۥۙ۠ۦۙۛۗ۫ۖۚۡۘ۬ۖۘۖۘۜۘ۫ۛۥۢۤ۠ۗۗۖۛۙۖۨۙۗۤۦۨۜ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-1295313941)) {
                                        case -1143343938:
                                            str4 = "۬۠۫ۗ۟۫ۡ۫ۦۦ۟ۨۚۜۤۛۤ۬ۛ۟ۘۨۜۛۨۚ۟ۡۘ۟ۜۢۘۗۜۘ";
                                            break;
                                        case -227471175:
                                            str3 = "ۜۙ۟۠ۚۘۥۖۘۚۢ۟ۤۦ۫ۖۘۥ۠ۤۛۖۜۘۜۚۦۘۗ۟ۗۗۡۗۜ۫ۤ۫ۧۖۡ۬ۜۚۗۦۛ";
                                            break;
                                        case 87423250:
                                            str4 = !TextUtils.isEmpty(str2) ? "ۥۡۧۛۤۙ۫ۦۚ۟ۘۤۡ۫ۚ۟ۖ۬ۨۢۖۘۘۘۡۛۗۢ۬ۨۖۘۗ۠ۡۖۦ۠ۛۚۙ۠ۡۙۘۡۘ۠ۧ۠" : "۠ۖۘۘۛۥۘۘۦ۠ۡۢۖ۫ۛۘۡۘۧ۟۬ۙۙۛ۟ۢۘۦۤ۫۫۬ۦۖۥۦۖ۟ۢۙۦۡۡۖۗ";
                                            break;
                                        case 1956247652:
                                            str3 = "ۗ۟ۘۥۛۚۚۥۢۛۧۤۤ۬ۚۤ۟ۗۙ۠ۘۤۘ۬ۦۡۘۧۜۘۘۦۦۘۦ۟ۙ";
                                            break;
                                    }
                                }
                                break;
                            case 522978715:
                                break;
                        }
                    }
                    break;
                case -1172626442:
                    OooOo0o();
                    str = "ۦۖۦ۟ۚ۠۟ۧۥۘ۠ۤۡۥ۬۬ۜ۠ۢ۟۟۠ۛۥۛۤ۫ۧۡۖۦۙۧۤۤۙۖ";
                    continue;
                case -838569141:
                    str2 = C4246ph.OooO0O0().OooO0O0.ImageUrl;
                    str = "ۧۥۡۜ۬ۘۤۡۙۢۥۦۘۨۧ۬۠ۜۥ۬ۡۚۘ۫ۖۘۢ۬ۜۘۛۖ";
                    continue;
                case -729399899:
                    OooOo0(102);
                    str = "۫ۚۦۘۗۛ۟۫ۗۡۜۥۤۨۧۖۥۦۖ۫ۦۜ۟ۜۤ۬ۤۧۦۥ";
                    continue;
                case -479666496:
                    return;
                case -364903272:
                    oooO = new OooO(this, 8, null);
                    str = "۠۟ۜۘۙ۬ۦۨۤ۟۫ۙ۟ۗۢۜۨۨۚ۬ۙۛۦۦۦۦۥۚۜ۟ۨۚ۫ۘ۫۫ۛ۟ۛۘۘۗۜۢۢۢۛۥۡۡۘۗۦۢۖۗۢ";
                    continue;
                case 106556113:
                    str = "ۦۖۦ۟ۚ۠۟ۧۥۘ۠ۤۡۥ۬۬ۜ۠ۢ۟۟۠ۛۥۛۤ۫ۧۡۖۦۙۧۤۤۙۖ";
                    continue;
                case 399825939:
                    OooOOO(str2);
                    str = "ۙ۠ۧۤۨۤۨۖۤۙ۟۟ۜ۠ۜۙ۠ۙۖ۟ۡۨۙۛۗۙۧۧۡۘ";
                    continue;
                case 754221089:
                    oooO.start();
                    str = "۫ۦۥۘۢۙۢ۫ۖ۟ۚ۬ۗۚۙۥۘ۫۟۬ۢۛۦۢ۬ۦۘۧۛۘۘۥۚۛۧۨۘۛۛۢۦۤۚ۬۬ۧۨۡ۟ۡ";
                    continue;
                case 845578137:
                    this.OoooooO = oooO;
                    str = "ۡۚۗۘۨۧۘۙ۟ۖۘۧۖ۟ۧۜ۠ۙۤۢۨ۬ۤ۫ۦۘۜۨۦۘۤۜۘ۬ۡۤ۫ۨ۟ۛ۠ۜۜۧۡۘۙ۬ۨۙۜ۬ۚۦۘۘ۬۟ۡ";
                    continue;
                case 1483609147:
                    C3679a5.OooO0Oo(this, "后台广告加载成功");
                    str = "ۜۗۨۘۜۤۘۢۖۦۘ۫ۖۘ۬ۘۤۧۖۙۢۡۖۖۚۦۦۨۦۙ۫ۤۚ۫ۨۙۥۘ۟ۢۥۤ۠ۡۥ۟ۘۘۚۗ";
                    continue;
                case 1496045553:
                    String str5 = "ۚۦ۟ۗۚۛۗۤۥۘۦۧ۟ۛ۠ۜۘۘۧۘۜۨۖۥۗۦۘۦۗۥۘۥۙۘۘ۠ۧۢ۟ۤ۠۬ۤۜۙۦۧ۬ۗۦۘۥ۫ۜۘۤۥۧۘۥۗۛ";
                    while (true) {
                        switch (str5.hashCode() ^ (-61534462)) {
                            case -1972622375:
                                str5 = "۬ۚ۟ۧۖۖ۫ۚۡۜۢۧۡ۬۬ۛۘۘۡ۬۟۟ۜۦۘۛۥۘ۬ۥۧۘۢ۟ۖۖۡ۟ۚۘ۟۬ۨۢۥۙۚ۠ۖ";
                                break;
                            case -1053955412:
                                break;
                            case -472878038:
                                str = "ۢ۬۬۠ۘۥۘۜۚۖۘ۫ۨۦۧۜۨۡۦۛۦ۟۟ۗۨۜۘۤۢ۠۬۫ۨۚ۟۟ۗۙ";
                                break;
                            case 166836553:
                                String str6 = "ۥۡۡۡۗۧۢ۠ۗۥۘۨۗۥۛۡۛ۬ۙ۫ۗۜۥۖۘۤ۠ۖۘ۬ۘۥۘۢۢۥۘۧۜۘۘۙۤۤۧ۠۫ۢۛۦۘۢ";
                                while (true) {
                                    switch (str6.hashCode() ^ (-149264127)) {
                                        case -369658655:
                                            str6 = "ۜۙۦۘۧۖۧۘ۫ۢۢۗ۬ۤۤۡۧۘۙۤ۬ۢۛۨۛۢۡۘ۫ۥۨ۫ۗۚۘ۠ۢ۬۬ۘ";
                                            break;
                                        case 193330551:
                                            str6 = C4246ph.OooO0O0().OooO0OO(2) ? "ۜۙۥ۠۫ۘۦ۟ۛۧۦۨۘ۠ۧۨ۟ۨۘۦۧۡ۠۟ۤۦۗۧۗۥۘۙۜۖ۠ۥۥ" : "ۚۤۦۘۤۦۨۡۢۥۘۥ۠ۛۨۛۡۢۢۡۘۜۚۘۘۡ۬ۚۦۙۨۘ۟ۖ۬ۨۥ۫۠ۙۨۘۢۧۢۚۜ۠ۗۦۗۢ۠ۡ۬ۘۧۥۥۚ";
                                            break;
                                        case 437996175:
                                            str5 = "ۨۜۤ۟ۗۢۨۜۨۘۡۖۥۘۚۚۧۧ۬۬۠ۗۤ۬ۤۙۤ۫۠ۥ۟ۘۜۨۢۨۙۜۘۤۧۛۤۢۜۘ";
                                            break;
                                        case 616428202:
                                            str5 = "ۦۧ۟ۨۦ۟ۙۜۘۚۤ۟ۤۘۘۤ۬ۡۗۧۖۥۨۜ۠ۗۦۛۥ۠ۛۙ۫ۦۘۤۤۥۗ۠ۥ۟ۨۨۘۖ۫ۡۘۢۚ۟ۛۥۥۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
            str = "ۧ۬ۦۘۛۚۦۛۗۦۗ۠ۜۘۖۜۚۙۛۗۖۦ۠ۘۛۡۖۚۖۘ۠ۤۧ";
        }
    }

    private void OooOOo() {
        String str = "ۢۘۢۡۙۡۦۦۘۧۚۨۜۥۡۘۗ۫ۡۢۧۗۧۡۘۛۧۡۘۗۨ۠۠ۤۘۘۗ۟ۘ۫ۜۖۡۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 653) ^ 509) ^ 803) ^ 211617215) {
                case -1965410838:
                    this.o0OoOo0.postDelayed(new OooO0O0(this), 1000L);
                    str = "ۛ۬ۗۗ۬ۙۘۡۤۘۦۥ۫ۤۘۚۚ۠ۜۡ۫ۖ۫۬ۤۦۦۘ۟ۙۦۤۢۘۛ۟ۦۘ";
                    break;
                case -1417597033:
                    str = "ۡۖۜۡ۫ۥۘۢۤۥۘۗ۟ۖۘۦ۫ۦ۠ۦۘۘۤۚ۬ۨۚۨۘۤۛۦۘ۠ۚۧۨ۠ۙ۫۟ۖۘ";
                    break;
                case 2027556744:
                    return;
                case 2143502795:
                    String str2 = "ۥۢۖ۠ۗ۫ۡۢۙۡۡۨۘۘۡۙۢۜۘۘۜ۠ۦۜۥۥ۠ۡۘۥۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1152082705) {
                            case -1469137793:
                                str = "ۘۢۨۘۖ۫ۢۚۡۢۡ۬ۛۤۙۘۘۧۚۚۡۢۢۙۦ۬۠ۖۤۧۦۡۤۦۛۚۨۦۘۚۢۨۘ۬ۢۤۚۘۖۗ۫ۙ";
                                continue;
                            case -456781302:
                                str2 = "ۗۛۘۘۘۜۘ۫ۡۖۤ۫۠ۦۤۘ۟ۗۜۢۖۤۤ۬ۥۢۥ۠ۗۧۥۢۢۖۘۢ۟ۨۡۗۦۡۢۚ۟ۜۨۘۦۗۧ۟ۨ۠ۜۥ۟";
                                break;
                            case -104557407:
                                str = "ۛ۬ۗۗ۬ۙۘۡۤۘۦۥ۫ۤۘۚۚ۠ۜۡ۫ۖ۫۬ۤۦۦۘ۟ۙۦۤۢۘۛ۟ۦۘ";
                                continue;
                            case 1359986214:
                                String str3 = "ۖۚۚۙۚۧۛ۠ۦۥۛ۟ۘۛۡۘۖ۫ۦۡۚ۬ۡ۠ۖۘ۫۫ۥۘ۫ۢۥۘۚۛۛۛۡۢ";
                                while (true) {
                                    switch (str3.hashCode() ^ 290263789) {
                                        case -1748863431:
                                            str3 = this.Oooooo0 == 3 ? "ۥۚۖ۬ۥۨۘۘ۫ۜۘۤ۟ۨۘۚۘۛۢۙۡۘۨۙۖۘۡ۬۟۠ۜۛۗۛۥ۠۠ۖۘۗ۠ۡۤۢۧ۟ۖۨۘ" : "ۤۜۨۤۢۖۘۖۙ۠۫ۗۥۘۖۖۘۨۜۜۘۛۨۘۘۗۨۧۡۦۚ۬ۜ۟ۛۨۚۙ۬ۢ۠ۥۗۥ۟ۡۘ";
                                            break;
                                        case -1303104779:
                                            str2 = "ۤۛۘۥ۟ۖۘۥ۠ۖۘ۠ۖۧۘۖۢ۬ۥ۟ۦۘ۫ۧ۫ۨۜۥۘ۬۟ۜۘۦۧ۟ۜۛۛۧۜۤۢۧۢۛۦ۬";
                                            break;
                                        case -424425641:
                                            str2 = "ۚۙۗۤۜۢۙۗۖۘ۟ۙ۬ۗۢۥ۠ۦۗۥۤ۟ۖ۠ۤۘۗۡ۠۬ۖۨۨۗۙ۫";
                                            break;
                                        case 1412388475:
                                            str3 = "ۡۙۛۘۚۙۙ۬۫۫ۙۤۖۨۜ۟ۦۜۘ۟۠۠ۖۢۨ۫ۜ۟ۙۛۘۘ۫ۗۦۘۤۧ۠ۦۨ۠ۗ۬ۥۘۙ۠ۘۘۤۦۨۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
        }
    }

    private void OooOOo0() {
        String str = "ۧۚۚ۟ۢۚۧ۟ۗ۟۟ۖۤۡۨۘۗ۠ۥۘۘۛۜۤۘۥۘۢ۠۬ۡۙ۠ۥۛۖۘۢ۠۟";
        StringBuilder sb = null;
        C4098lh c4098lhOooO00o = null;
        while (true) {
            switch ((((str.hashCode() ^ 752) ^ InterfaceC2174a.f13808L) ^ 430) ^ 869117365) {
                case -2103251739:
                    str = "۬ۘ۟ۗ۟ۜۦۦۚۥ۬ۢۦۥۡۙۡۥ۟ۖۥۛۥۡ۠ۗ۫ۛ۬ۡۧۤۧۗۨۨ۫ۚۛۤۡۘۢۦۨۚ۫ۤ";
                    c4098lhOooO00o = C4246ph.OooO0O0().OooO00o(2, AbstractC4172nh.OooO0o);
                    break;
                case -2042044451:
                    sb.toString();
                    str = "۠ۧۡۘۗۛۙ۟ۜۥۧۚۦۘۜ۟ۦۘۧۛۦۘۙۡۡۘۦ۠ۙۨۘۜۘۥ۫ۢۘۢ۟ۘ۟ۧۜۨۤ۟ۗۤۙۡۦۖۗۨۘۗۦۥۡۧۘ";
                    break;
                case -1621653907:
                    str = "۫ۚۢۤۢۡۘۛۥۜۘۧۘۜۖۛۛۛۙۜۤۤۧۨۘۡ۟ۧۖۘۖۢۨۘۧۛۘۚ۠۬";
                    break;
                case 759576372:
                    sb.append("loadIFLYAd --> ilfyAd.isDisplay=");
                    str = "ۙۥۜۘۚۖۧۘۢۘۙۙۦۗ۠ۥۘۛۙ۫ۤۖۡ۫۟ۜۘۛۙ۟۫ۘۛۦۤ۫ۦۘۖۘۧۙۥۘۥۖۥۘ";
                    break;
                case 1055626431:
                    sb = new StringBuilder();
                    str = "ۙۦۤ۫ۨ۬ۗۨۨۘۗۘۨۘۢۗ۠ۖۘۨۙۤۛۖۗ۬ۜ۫ۦۘ۫ۗۨۘۜ۬ۖۥۜۢۥۢۘ۫ۘ";
                    break;
                case 1241077273:
                    this.o0OoOo0.obtainMessage(1002).sendToTarget();
                    str = "ۨ۟ۢ۬۠ۚۡ۠ۡۛۖۥۘۗۙۙۚۡۖۖۧۤ۟ۗۖۡ۫ۘۘۙۨۚ۫ۡۖۘۛۡۦۖۙۥۘ۠ۙۢۤۗۦۥۥۡۘۚۨۨۘۤۙ۬";
                    break;
                case 1605857105:
                    return;
                case 1782997638:
                    sb.append(c4098lhOooO00o.OooO00o);
                    str = "ۙۖۨ۠ۢۖۘۨۨۜۘۡۗۖ۠ۥۖۦۦۖ۬ۛۢ۫ۡۧۘ۠۬ۜۘۚۡ";
                    break;
            }
        }
    }

    private void OooOOoo() {
        String str = "ۖۤۙۦۢۡۗۖ۫ۜ۟ۨۘۖۢۗ۟ۢۙۚۜۨۘ۫ۖۦۗ۟ۡۡۘۙ۬ۜۛۜۢ۫ۦ۬ۢۥۦ";
        while (true) {
            switch ((((str.hashCode() ^ 638) ^ 714) ^ 426) ^ 1282691356) {
                case 253517328:
                    return;
                case 830621635:
                    OooOO0o();
                    str = "ۙۜۘۖ۬ۘۧۚ۬ۧ۟۟ۙۦ۫ۡۗۢ۬ۡۘۘۛۘۧۘ۬ۥۡۘ۫ۜۨۘۜ۬ۨۘۚۨۡۘ";
                    break;
                case 1929453027:
                    str = "ۦۤ۬ۘ۟ۡۘۡۥۖ۟ۗ۬ۛ۠ۥ۬۠ۧۙۘۡۘۖ۬ۡۘۖ۠ۜۚۦۡۚۗۛ۫۟ۢۢۧۦۘۨۛۡۘۤۜۖۘۧ۠۬";
                    break;
                case 2023298880:
                    OooOo00();
                    str = "۫۟۟ۡ۠ۦۘۘۖۢ۠ۛۙ۬ۢۛۨۗۥۘۙۜۤۗۦۗۛۥۦۢۢۦۘۖۖۧۘۛۖۨۘ";
                    break;
            }
        }
    }

    private void OooOo0(int i) {
        String str = "ۗۥۦۗۧۤۙۧۘۜۨۡۘۖ۬۟ۨ۬ۖۖۡۦۘۚۢ۬ۨۛۘۧۧۖۢ۬ۘۘ۠ۛۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 349) ^ 361) ^ 478) ^ 1844723804) {
                case -199541403:
                    str = "ۦۧۡۥۜۙۖۗۤۧۙ۬ۜۛۖۚ۫ۘۤۤۤۖ۟ۨۘۘۚ۠ۨۢۘ";
                    break;
                case 502289333:
                    this.o00O0O = i;
                    str = "ۦ۬ۥۛۤۡۡۛۦۘۨ۠ۨۥۗۨۘۛ۟۠ۛۛۥۨ۫ۥۘۘۧۡۘ۬ۤۖ";
                    break;
                case 1588167074:
                    str = "ۘ۫ۜۘۢۨۤۨۘ۬ۖۘۧۘۤۨۖۨۛۛۥۢ۬ۢۘۨۨۜۗ۬ۢ۠ۤۖۘ۟ۚۤ";
                    break;
                case 1816123866:
                    return;
            }
        }
    }

    private void OooOo00() {
        String str = "ۜ۟ۢ۠۟ۗ۫ۜۨۡ۫ۢ۫ۖۨۤ۬ۨۘۥۤۥۘۧۚ۬۟ۤ۟ۛۙۜ۫ۥۦۚۦۖۘۢۤۗۜ۠ۛ";
        while (true) {
            switch ((((str.hashCode() ^ 387) ^ 26) ^ 166) ^ (-266333984)) {
                case -2065260365:
                    str = "ۚ۫ۖ۬ۙۘۙۧۤۨ۟ۛۗۥۢۨۚ۫ۘۖۖۘۥۙ۠ۦۖ۠۬ۢۦۤۤۛۡ۬ۜۜۖ۫ۙۦۢۘ۫ۥۙۡۨۘ";
                    break;
                case -1484299405:
                    return;
                case -930286046:
                    this.ooOO = true;
                    str = "ۗۤۜۘۨۛ۠ۚۤۛۘۙۛۨۡۧۗۨۤۢۥۤ۠ۘۘۜۦۦ۟۬۫ۖۜۗۥۖۜۘ۫ۤۜۚۨ";
                    break;
                case 2066056633:
                    C4093lc.OooO0oo().OooOOO0(new OooO0OO(this)).OooO(this, 1, 3, C4246ph.OooO0O0().OooO0O0.f15897Id);
                    str = "ۛۤۢۥۘۜۘۖۦۡۘۙۥۗۥۙۦۘ۬ۡۢۧۚۨۘۧۚۙۙۚۨۙۙۤۢۨۙۘۧۨۨۦۙۡ۬ۗ";
                    break;
            }
        }
    }

    private void OooOo0O() {
        String str = "۬ۘۜۜۧۗۢۗ۬ۤۦۚۡ۫ۨۗۖۘ۫ۨۨۘۡۡ۬ۙۙۡۘ۫ۛۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 672) ^ 380) ^ 465) ^ 1762282776) {
                case -1372480500:
                    return;
                case -843851504:
                    this.OoooooO = new OooO(this, 5, null);
                    str = "ۘۖۡۢۖۧۘ۟ۡۜۘ۟ۚۦۘۦۖۦۘۛۘۙۡۛۧۤۖۚ۠۠ۙۤۦۦۤۜۗۖۧۜ";
                    break;
                case -721163333:
                    str = "ۡۡۚۦۙۖۘۜۙۡۢۨۤ۠ۦ۫ۗ۟ۥۘۨۛۜۨۡ۠۬ۧۨۘۤۤۜ۠ۨۦۘۡۧۨۘۛۗۤۜۙۖۘۡۙۦۘۗۥۨ";
                    break;
                case 89822412:
                    this.OoooooO.start();
                    str = "ۖۜۘ۬۫ۡۘۨۗۦۡ۬ۥۜۧۦۧۚۢۢۙ۬ۜۜۘ۬۬ۘۘۛۖۜۘ";
                    break;
                case 2050631392:
                    String str2 = "ۤۨ۟ۜۤۡۘۢۥۘۘۗۧۥۘ۠ۖۥۘۙۦ۠ۘۢۡۘۜۨۨۘۥۡۧۘۜۧۤۦۨۗۚۛۘۦۘۢۜۚ۬";
                    while (true) {
                        switch (str2.hashCode() ^ (-721608293)) {
                            case -1375474914:
                                String str3 = "ۤ۬ۨۘۚۨۛۖۜۦۚ۟ۨۖۘۦۘۥۜۘۖۖۙۚۘۥۘ۟ۥ۬ۗۢ۫ۦۥۚۗۘ۫ۥ۠ۖۘۥ۟ۨ۫ۡۤۛۢۥ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-2012701597)) {
                                        case -2130258492:
                                            str3 = "ۖۨۖۜۢ۟ۡۢۖۨۤۡۘۦۘۡۖ۬ۡۦ۟ۗۖ۠۫ۦۧۚۤۨۘ۫ۥۢۡۦۧ";
                                            break;
                                        case 695895424:
                                            str3 = this.OoooooO == null ? "ۖۚ۟ۦۧۖۘۢ۬ۘۘ۟۬۫ۢۖۘ۫ۥۘۗۚۚۜۙۨۥ۟۫ۘ۬ۚۚۚۚ۟ۜۘۤۤۨ۟۠ۖ" : "ۢ۬ۖۘ۠ۘۛۧ۬ۘۘ۫ۨ۠ۖۧۡۙۘۘۦۤۡۘۜۜۖۘ۠۫ۜۘ۫ۦۖۥۧۦ۟ۚۢۜۚۨۘۛ۠ۤۖۦۖۦۛ۬ۢۢۥۖۛۢ";
                                            break;
                                        case 750965700:
                                            str2 = "۠ۦۘ۠ۚۥۘۨۖۧۘۜۡۦۘۜ۠ۢۢۤۧۚۜ۟ۙ۫ۘ۟ۗۧۖۥۖۨ۠۫ۦۦ۟";
                                            break;
                                        case 1828429513:
                                            str2 = "۟ۗۡۘ۠ۤۤۥۛۘۘۥۗ۬۟ۥۘۘۨۜۘۤۧۢ۬ۨۖۘۢۘۧۥ۟۟ۘۡۗۢۨۘۚۚۘ۬ۢۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case 14116754:
                                str2 = "ۗۡ۬۟ۖۧۘۙۦۙۤ۫ۖۡۢۘ۫ۛۘۥ۫ۚ۠۠ۥۧۜۚۥۖۦۘۨۡۥۘۘۘۛۢۡۢۧۧۡۘۛۥۧۘ۬ۤ۫ۖۦۜ۫ۤۨۘ";
                                break;
                            case 1488864474:
                                str = "۫ۥۥۙۥۨۘۜۧۜۗۘۥۘۜۨ۠ۗۧۖۘۥۥۥۘۦ۟ۧ۠ۙۜۢۡۗۙ۬ۤ۫ۧۘۘ";
                                continue;
                            case 1812223084:
                                str = "ۘۖۡۢۖۧۘ۟ۡۜۘ۟ۚۦۘۦۖۦۘۛۘۙۡۛۧۤۖۚ۠۠ۙۤۦۦۤۜۗۖۧۜ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    private void OooOo0o() {
        String str = "۫۠ۨۘۖ۟ۘۘ۟۫ۚ۫ۛۗۥۗ۟ۙۙۘ۫۬۫ۢۨۡۚۨۗۖۙ۠ۗ۠۫ۜۥۘۥۖۡۘۘۤۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 877) ^ UiMessage.CommandToUi.Command_Type.SET_IMAGE_VIEW_VALUE) ^ 98) ^ 1105751734) {
                case 93396674:
                    return;
                case 947782735:
                    str = "۟ۢۡۧ۬ۨۢۦۨۘۧۖ۬ۢۧۢۜۖۧۘ۬ۦۦۦ۫ۥۘۦۧۘ۬۬ۘۨ۬ۘۘۗ۟ۥ۠ۦ۟ۨۤۨۘ۬ۚۧۤۡۥۘ";
                    break;
                case 1052393835:
                    C3803di.OooO00o(this);
                    str = "ۗۘۛۙۚۤۥۛۜۦۜ۠ۚۙ۫۟ۜۤۡۤۧۗۢ۟ۧۨۘۡ۫ۨۗۧۦۘۤۗۦۘ۠ۚ۠ۢۤۢۜۗ۠ۙۘۖۘ";
                    break;
                case 1625707409:
                    finish();
                    str = "ۙۛۛۚ۫ۦۢۚۛۙۘۦۨۤۙۚۦۛۜۦ۬ۘۡۡۘۨۘۙۗۙۤۨۖۘۧۥۘۘ۬۟۫ۗۨۛ۬ۙ۬ۤۙۦۘ";
                    break;
            }
        }
    }

    private void initData() {
        String str = "ۡۜۤۡۗۗۤۥۘۘ۠ۚۢ۬ۙۙۚ۫ۚۜۨ۠ۧۡۛۛۗ۫ۚۡۦۚ۠ۖۚۖۥۡۧۘۡۙۥۨۨ۠ۥۨۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 974) ^ 375) ^ 924) ^ (-1211703957)) {
                case -2089393568:
                    OooOOOO();
                    str = "ۦۖ۠ۧ۬ۙ۟ۘۚۢۦۘۜۦۨۛۘۧۘۧۙۨۘۨۧۘ۠ۡۘ۠۬ۦۜۜۚۛۘ۬ۧۛۚۨۡۘۤۥۦۘۤ۫ۨ";
                    break;
                case -1794668602:
                    str = "ۧۚۢۨۡۛۗ۠ۘۘۗ۟ۥۘۦۙۜۜۘۥۘ۠ۙۡۘۦۘ۟ۚۛ۫ۙۙۘۥۖۖۙۢۨۘۦۡۧۘۦۚۢ";
                    break;
                case -574204779:
                    return;
            }
        }
    }

    private void initListener() {
        String str = "ۦ۠ۡۤۦۢۨۨۚۙ۠ۚ۫ۨۚۥۚۖ۠ۙۗۢۖۙۦۖۘۜۘۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 47) ^ 318) ^ 127) ^ (-1742451138)) {
                case -1821763026:
                    str = "ۙ۟ۨۦۜۘۘ۟ۡۘۘۖۙۗۜۚۜ۬ۧ۠ۖۘۘۘۨ۫ۡ۫۟ۘۘ۬ۜۧۘۖۛۚۢۛۡۘۡۗ۫ۦۗۥۘ۫ۢۙۘ۟ۨۧ۬ۖ۬ۥۜۘ";
                    break;
                case -1341069773:
                    this.OooooOo.setOnClickListener(this);
                    str = "ۨۜۥۘۖۖ۫ۤۘۤ۫ۢۚۨۜۜۘۦ۫ۢ۠ۥۨۘ۠ۙۦۘ۫۬ۧۤۨۥ";
                    break;
                case 1439460865:
                    return;
            }
        }
    }

    private void initView() {
        String str = "ۚ۫ۧۨ۫ۘۙ۟ۥۘ۫ۖۛ۬ۘ۬ۗۖۛۖۚ۟ۛۨۘۙۦۚۧۦۜۘۡۗۧۡۛۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 35) ^ 767) ^ 182) ^ 1692818482) {
                case -1280452270:
                    this.OooooOo = (TextView) findViewById(C2711R.id.tv_close_ad);
                    str = "ۗۧۨۢ۠ۙۘ۫۠۫ۘۖۘ۟ۘۚۦۨۘۘۤ۬۫ۧۛۖ۟ۢۨۦۘۧۨۢ۫ۙۚۦۦۘۤ۫ۘۨ";
                    break;
                case -839277266:
                    this.OooooOO = (TextView) findViewById(C2711R.id.tv_splash_ad_mark);
                    str = "ۢ۬۟ۗۗۧۛۚۘۘۛۡۗۦۦۘۥ۠ۗۦۤۚ۠ۥۤ۫ۚۖۚۚ۟ۘۙۖۘۖۚۡۘۡۤۡۘۘۥۜۘۨۖۢۗۖ۟ۛۜۖۘۜۗ";
                    break;
                case -612811905:
                    str = "ۚۚ۟ۥۡۘۘۜۘ۫۫ۖۘۦۦۜۘۨۤۚۛۨۢ۫۬ۡۘۦۧۗۘ۬ۜۘۧۦۖۧۛۤۖۙۗ۟ۖ";
                    break;
                case 1133750350:
                    return;
                case 2010952712:
                    this.OooooO0 = (ImageView) findViewById(C2711R.id.iv_splash_ad_fullscreen);
                    str = "ۨۘۨۘ۬ۙۗۜۖۘۘۖۜۡۧۨ۬۟ۛ۟۟ۡۜۘۚۥۛۦۥۨۘ۠ۤۡۘۦۢۥۡ۫ۜ";
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = 0;
        String str = "ۡ۟ۤۧۢۦ۬ۧۥۘۙۘۜۘۚۛۦ۫ۢۖۥۧۦۘۡۡۡۚۖ۬ۛۖۘ۠ۨۖۜۤۧ";
        while (true) {
            switch ((((str.hashCode() ^ 199) ^ 10) ^ 662) ^ 471027256) {
                case -1760551561:
                    str = "ۨ۫ۧۢ۫ۜ۠ۤۚۡۧۢۛۜۘ۠ۧۥۘۤۗۦۘۢۡۖۘ۟ۢۘۚۗۧ";
                    continue;
                case -1067336024:
                    String str2 = "۠ۡۢۙۘۚ۟۠ۨۘۙۡۘۘۘۜۧۜ۫ۡۘۡۧۤۢۗۚۘ۫ۛۗۖۢۖۨۢۡۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1906113597) {
                            case -2022639008:
                                str = "ۖۥۚۥۦۘۘ۟ۢۡۘۙۖۢۖ۟ۥۦۚۨۘ۟ۢۘۘۗ۬ۧۨ۟ۜۥۤ۬۠ۚۡۘۥۢۡۘ۟ۥۜۛۖۧۘۧۙۖۢۢۧ";
                                break;
                            case -1643079061:
                                break;
                            case 94080029:
                                String str3 = "ۤۧۧۙۦ۬ۤۦۘ۟ۜۢۖۦ۠ۨۤۛ۬ۚۤۤۜ۬ۡۥۖۛۚۤۢ۠ۡۡۡۨۧۨ۬ۚۜۤۚ۬ۥۨۚۢ۠ۥۧۥ";
                                while (true) {
                                    switch (str3.hashCode() ^ 374139494) {
                                        case -1779843442:
                                            str3 = "ۚۚ۠ۘۦۚ۫۫ۦۧۖۘۘ۟ۛۜۖ۫ۥۦۜۗۦ۠ۚۦۦۤ۬ۥۘۖ۬۫ۖۙۨۥ۟ۖۘ۬ۙۘۢۙۡۘ۫۟ۚ";
                                            break;
                                        case -1552648896:
                                            str3 = id == C2711R.id.iv_splash_ad_fullscreen ? "ۛۘۖۜ۫ۚۜۚ۬ۨۧۙ۟۠۠ۛۙۢۡۨۡ۟ۡۥۙۡۖ۫ۘۗ" : "۫ۦ۬ۙ۟ۢۜۘۨۡ۫ۦۖۢۖۗۢۢ۟۟ۖۡۢۖۘۙۘۥۡ۟ۧۢ۟ۦۘۘ۬۟";
                                            break;
                                        case -422304854:
                                            str2 = "ۗ۫ۧۢۥۙۢ۟ۖۨۛۗۜۖۨ۫ۢۡۖۡۢ۬ۡۖۘۛ۟۟ۨۜۡۘ";
                                            break;
                                        case 1935644206:
                                            str2 = "۟ۖۛۡۢۨۘۛۡۨۘۦۥۦ۟۟۬ۦۢۜۢ۟ۖ۫ۤۖۗۜۛ۠۫ۥ۠ۖۘ۠۠ۚ۫ۦۡۘۚۡۧۘۚۥۖۜۧۥ۠۬ۡۘۖ۬ۘ";
                                            break;
                                    }
                                }
                                break;
                            case 501143967:
                                str2 = "ۛۖۜۨۧۥۙ۫ۨۘۤ۬۬ۡۡ۫ۛۙ۫۟ۛۛۢ۫۠ۡ۫ۖۙۥۚۖۧ۫ۥ۠ۢۘۢۥۗۘۛۚۥۘۙ۟۫";
                                break;
                        }
                    }
                    break;
                case -762155088:
                    OooOo0o();
                    str = "ۛۨ۠ۥ۟ۖۘۚۗۥۨۛۨۜۧۚۧۤۜۘ۬۠ۗۢ۬۫ۢۚ۫۬۬ۨۘۙ۬ۥۘۜۛۜۥۦۙۢ۠ۘۘۗ۟۫ۗۧۨ۫ۘۨۙ۫";
                    continue;
                case -427308738:
                    return;
                case -389776640:
                    str = "ۛۖۖۘۦۦۤ۟ۧۘۖۛۨۘۧ۠ۛۗ۫ۘۚۧۦ۟ۚۛۨۙۧۦۡۖۢۘۘۢ۟ۤۤۖۗ";
                    continue;
                case 427394921:
                    OooOOoo();
                    str = "ۘ۬ۜۘۡۤۦ۬ۖۦۘ۫۫ۤۙ۟ۗۘۙ۟ۦۧۙۗ۬ۜۘ۠ۗۙۤۚۡۘۨ۬۠ۤۥۛۙۦۖۘۜۡۚۧۗ۬۟ۦ۠";
                    continue;
                case 794433410:
                    String str4 = "ۧۨۖۘۧۦۢ۟ۡۜۘۦۢۤۡ۬ۛۤ۫ۖ۬ۥ۬۬ۧۙۧۜۤۛ۠۬ۘۘۘۗۦۜۗۘۤۗۨۥۦ۠۬۫ۗۖۘۜۘۢۦۢۨ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1976964041)) {
                            case -2078158872:
                                str = "ۖ۠ۘۘۨ۫ۛۛ۫ۗۜۨۗۥۤۛ۟ۙۡۘۖۚۡۘۘۜۛۘۨۚۘۡۘۛۜۡۘۖۦۜۨۨۜۘ۟ۢ۠";
                                continue;
                            case -374236293:
                                str = "ۥ۬ۡۘ۫ۗۨۦۡۜۘۨ۟ۗۨ۠ۖۤۧۖۘۙۗۡۘۚۘۡۘ۬ۛۦۘۥۨۥۘۢ۫ۧ۠ۖ۫ۦ۟ۖۥ۫ۡۘ";
                                continue;
                                continue;
                            case 320647395:
                                String str5 = "۟ۥۛۢ۫ۜۙۛۙۡۘۛۨۖۙۧۤ۫ۛۗۗۡۥۛۙۚۗۗۙ۟ۡۢ۬ۜۥۖۢ۫ۡۦۜۡ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1705267217)) {
                                        case -114834560:
                                            str5 = "ۤ۟ۦ۟ۖۢۢۛ۬۫ۥۘۤۘۥۘۤ۟ۘ۫ۙۡۦۡۨ۠۬ۘۘۢۛۗۙۧۜۚۜۘ";
                                            break;
                                        case -104652353:
                                            str4 = "ۗۙۦۘۡ۫۠ۧۨۨۘ۟۟ۦۧۢۗۙ۟ۜۘۦۦ۟ۢ۠ۘۘۨ۠۫ۚۖۜ";
                                            break;
                                        case 394533978:
                                            str4 = "ۥۗۨ۟ۗۛۗۘۘۘ۫ۥ۫ۙۤۨۗۛۘۘۨۙۥۘۘۨۧۛۜۙ۬ۨۘ";
                                            break;
                                        case 1160637577:
                                            str5 = this.Oooooo < 3 ? "ۨۧ۫ۙۧۦۧۗۥۢۡۘۚۧ۬ۗۡ۟ۢۢۨ۫ۧۡۥۥۧۘۙۧ۟ۗ۠ۘۘۦۦۜۘۢۘۧۤۖۚۙۜۙۡ۠۟۟ۖ۫ۚۘ" : "۬۬ۜۘۤۧۖۘۛۦۤۛۡۧۛۨۖۘۤۖۦۘۘۨ۬۠ۨۡۘۡۥۨ۫ۜۗۙ۫ۤۗۢۛۖۖۡۡۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1652132302:
                                str4 = "ۡۛۗۦۡۜۘۥۡۘۘ۟ۢۤۧۢۖۘۨۛۖۘ۫ۘۤۧ۫ۡۖۨۦۤۦۙۤ۠ۜۘۡۗۦ";
                                break;
                        }
                    }
                    break;
                case 1127245749:
                    String str6 = "۠ۥ۠ۨ۠۬۠ۜۤۘۦۘۜۙۖۙۜۧۘ۠ۧۥۘۗۙۘۘۚۤۘۘۛۛ۟ۤۘۡۥ۫ۖۘۨۡۗۘۜۖۘۘۘۙۧۢ";
                    while (true) {
                        switch (str6.hashCode() ^ 496107841) {
                            case -1593358853:
                                str = "ۡۜۡۜۖۧ۟ۗۥۙ۫ۜۘۢۚۦۖۜۢۘۚۗۦۜۧۛ۟ۘۘۡ۟ۛۡۛۦۘ۫ۨۥ";
                                continue;
                            case -1067639233:
                                String str7 = "ۤ۟ۥ۠ۨۚۙ۠ۙ۫ۚۨۘۛۖۙ۠۠ۦۘ۫۟ۜۘۡۗۗ۠۟ۨۘۖۡ۫۫ۢ۫ۧ۬ۘۖۥۜۘۧۛۙۨۤۖۘۜ۟ۖ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-641102719)) {
                                        case -2018773219:
                                            str6 = "ۖۦۙۨ۠ۥۘۙ۬ۜۘۚۥۨۘ۬ۨۥۘ۟ۙۦۚۨ۠ۥ۠ۜۨۘۧۘۡ۠ۖۜ۟۠ۡۨ۬";
                                            break;
                                        case 49303104:
                                            str7 = id == C2711R.id.tv_close_ad ? "ۛۢۜۘۨۚۙ۠ۦۧۘۖۨ۫۬ۦۘ۟۫ۦۘ۫ۤۖۘۧۚۘۗ۫ۢۦ۟ۦۘۡۧۡۘ۠۟ۚۧۦۘۥۤۦ" : "۬ۧۨۨۢ۬ۛۥۘۘ۬۫ۘۘ۠ۖۨۖ۠ۤۚ۬۟ۘۗۥۘ۟۬ۡۘۗۢ";
                                            break;
                                        case 1307603710:
                                            str7 = "ۜ۫ۦۦۡۨۘۦۚۖۘۡ۬ۨۘ۠۫ۨۘۘۦۧۘۖۡۧۘۗۚۘ۟ۘۥۛۛۜ";
                                            break;
                                        case 1674055417:
                                            str6 = "۠ۛ۬ۘۥ۠ۦۜۧۡۖۘۘۥۚۜۘۨۗۘۘۥۗۙۨ۬۠ۘۙۜۘۢ۠ۘۗ۠۠";
                                            break;
                                    }
                                }
                                break;
                            case -821668494:
                                str = "ۢۢۡۛۗۜۘۢۘ۟ۢۨۜۚۛۜۦۨ۟ۜۜۥۧ۬۬ۧۥۡۘۖۤۥۘۗۥۛۛۦۥ۟ۛۦۘۘۦۖۘ۬ۥۦۜ۬ۨۨۥۘۛۤۙ";
                                continue;
                                continue;
                            case 792807697:
                                str6 = "ۥۡۛۚۜۙۛۡۡۡۘ۠۟ۘۢۢۜۜۘ۫ۤۖۥۚۛۗ۟ۜ۬";
                                break;
                        }
                    }
                    break;
                case 1210762452:
                    id = view.getId();
                    str = "ۢۢۤۗ۟ۥۘۗۦۨۘۚۨۧۗ۫۟ۢۘۘۢۦۥ۟ۗۡۘۛۧۤ۠ۛ۟ۢۙۤۛۘۡۤ۬ۧۖۤۨۘۤۥۘۛ۠ۖ";
                    continue;
                case 1980847715:
                    break;
                case 2035990665:
                    str = "ۖۥۚۥۦۘۘ۟ۢۡۘۙۖۢۖ۟ۥۦۚۨۘ۟ۢۘۘۗ۬ۧۨ۟ۜۥۤ۬۠ۚۡۘۥۢۡۘ۟ۥۜۛۖۧۘۧۙۖۢۢۧ";
                    continue;
            }
            str = "ۘ۬ۜۘۡۤۦ۬ۖۦۘ۫۫ۤۙ۟ۗۘۙ۟ۦۧۙۗ۬ۜۘ۠ۗۙۤۚۡۘۨ۬۠ۤۥۛۙۦۖۘۜۡۚۧۗ۬۟ۦ۠";
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۖۧۢ۟ۨۙۥۥۨۛۡۧۘ۬ۖۘ۫ۗۘۘۢۘۥۘۡ۠ۜۘۤ۠ۨ۠ۥۘ۟ۥۧۘۨۡۡۘ۠۠ۡۘۢۨۥ";
        while (true) {
            switch ((((str.hashCode() ^ 56) ^ 194) ^ 595) ^ (-1706297477)) {
                case -1679276305:
                    initView();
                    str = "ۢۨۨۘۘۡۘۘۗۢۢ۫ۖۨۚۥۛۡۤ۬ۧۗۘۚۡۘۦ۬۬ۘۡۘ۟ۢۨۙۘۧۙۢ۫۬۟۫ۨۘۘۡۘۘ";
                    break;
                case -1638792096:
                    setContentView(C2711R.layout.activity_fullscreen_ad_two);
                    str = "ۘۚۡۘ۫ۖۡۛۖۙۨۗۨ۠ۢۢۥۢۗ۠ۗ۬۠ۜۡۘۜۦۡ۫۬ۡ۠ۥۜۘۢ۟ۢۧۙۨۘ۟ۙۜۘ";
                    break;
                case -869267073:
                    super.onCreate(bundle);
                    str = "ۖ۬ۡۢۖۤۜۦۤۘۨ۬ۘۢۤ۠ۢۢۘۖۘۢۧ۬۟ۧۜۘ۫ۡۜۙۤۦۘۜ۫ۖۘۧۚۜۙۘۘۤ۟ۡۗۜۦۘ";
                    break;
                case -70312411:
                    requestWindowFeature(1);
                    str = "ۥۨۚۚۦۛ۬ۢۥۘۙۛۧۨۥۥۚۚۖۛۖۡۡۥ۫ۤۦۙۖۦۘۡۤۘۦۨۜ";
                    break;
                case -52865989:
                    getWindow().setFlags(1024, 1024);
                    str = "ۥۖۡۘۖ۬ۨۘۚ۠ۢۙ۫ۨۜۘۖۚۖۡ۫۠ۡۤۨۧۤۧۥۜۥۗۗۨ۫ۥۡۘۦۘ۟ۛ۠۠ۡۥۦۘۘ۬ۜۖۗۘۖۥ۬";
                    break;
                case 130415696:
                    initData();
                    str = "۬ۢۥۘۚۗۡ۟ۙۖۘۜ۟ۘ۫ۡۗ۫ۦۗۗۘۜۘۗ۫۠ۥۤۜۥۦۦۘۙۡۨۘۛۜۘ";
                    break;
                case 484828462:
                    str = "۫ۤ۠ۚۙۡۘۢۢۢۧۤۙۨۖ۬۠۟ۧۖ۬ۖ۬ۖۜۘۗۙ۠ۚۡۘۡۢۥۘۖۢۜۖۘۖۘ۠ۥ";
                    break;
                case 568510030:
                    str = "ۤۜۨۘۧۤۜۡۜۤۨۙۙۗۤۨۜۙۡۥ۟ۦۘۗۧ۟ۡۡۘۦۧۙۗ۟ۡۡۨۘ";
                    break;
                case 1809880471:
                    initListener();
                    str = "ۨ۠ۗ۠ۤۨ۟ۛۖۘ۟ۙۜۧۦۛۖۘۦ۟ۜۨۛ۫ۦۚ۫ۜۘۚۤۘۘۦۨ۫ۥۘۨۘۧ۠ۖ۟ۧۖۘ۫ۘۧ۬ۤۖۘ";
                    break;
                case 1870186210:
                    return;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۢ۬۫ۙۖۖۘۖۖۚۦۜۜۘ۬ۙۡۥ۫ۙۤۢۦۖۗ۠ۨۡۧۡ۬";
        while (true) {
            switch ((((str.hashCode() ^ 845) ^ 414) ^ 253) ^ 1105679688) {
                case -1641070657:
                    this.o0OoOo0.removeCallbacksAndMessages(null);
                    str = "ۡۦۥۘۡۖۤ۫ۗۡۡ۟ۨۢ۫ۜۤۛۖۚۙۘۘۦۤۘۧۘۡۖۥۧۦۙۥ۟ۥۥۘ";
                    break;
                case -1514463403:
                    return;
                case -1469597212:
                    OooOO0o();
                    str = "۫ۗ۟ۖۜۢۖ۬ۨۨۙۤ۬ۚۤۜۙۢۘۦۤۧ۬ۦۦۤۘۘۘۖۙ";
                    break;
                case -1394778806:
                    this.ooOO = false;
                    str = "۠ۥ۟ۦۢۜۘۛۘۚۜۦۢۧۤۗۜۨۖۘ۬ۙۡۘۤۗۡۨۛۖۘ۟ۢۗۗۘۡۙۗۖۘ";
                    break;
                case -943546362:
                    this.Ooooooo = false;
                    str = "۟ۛۖۘ۬ۙ۠ۨۨۙۚۧۦ۟ۖۜۛۜۙۘ۬۬ۡۢ۠۫۬۬ۨۘ";
                    break;
                case 511480142:
                    super.onDestroy();
                    str = "ۖ۬ۨۘۙۦ۫ۚۥۥۘۦۘ۫ۥۛۡۘۥۥۥۘۛ۟۟ۚۧ۬ۖ۠ۖۘۛۢۗ۫ۦۘۢۧ۫ۤۧۨۤۜۤۛ۟ۤۗۧۨۧۘ۫ۘۥ";
                    break;
                case 1603390609:
                    str = "۫ۗۧ۠ۧۨۘۨ۬ۧۘۘۖۡۜۙۖ۬ۨۢ۠ۚۡۙۧۘۡۜ۠ۗۜۖۘۖۨۖۤۛ۬ۗۖۘ";
                    break;
                case 1865038198:
                    C4093lc.OooO0oo().OooOO0o();
                    str = "ۗۜۢۖۘۘۚۜۡۘ۫ۙۜ۟ۜۥۘۤۡۧۛۛۗ۬ۨۜ۬ۦ۫۫ۥۜۘ۠۟ۘۘۙۖ۬ۥۚۘۘۚۢۘۘۖۧۘۜ۬ۥۨۧۡۙۥ";
                    break;
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        String str = "ۗۙ۠ۚۖۨۖۥۘۨۥۢۛ۟ۦۘۛۛ۫ۡۙۙۨۘۖۘ۬ۗۛۖۛۧ";
        boolean z = false;
        boolean z3 = false;
        while (true) {
            switch ((((str.hashCode() ^ 157) ^ 466) ^ 559) ^ 230050908) {
                case -2093935561:
                    str = "ۥۜۨۡۧۥۘ۫ۜۘۚۛۥ۟ۚۥۘۛۢۨۘۥۨۥۙۨۡۧۦۥۢۨۗۢۦۘ۫ۖۦۙۘۖۘۥۦۙۦۖۡ۟۠ۥۘۚۤۚ۫ۧۙ";
                    z = z3;
                    break;
                case -1487154635:
                    str = "ۨ۬ۖۘۡۘۘۘۢۨۨ۠ۦ۠ۧۛۡۜۦۖۘۦ۠ۧۛ۫ۘۘۥۙۘۘۖۚۛ";
                    break;
                case -1202188893:
                    z3 = true;
                    str = "ۘۘۖۤۛۧۛ۠ۦۦۧ۟۠ۥۦۘۥ۬۬ۙۤ۟۬ۖ۠ۧۧ۟ۗۥۖۘۡۡۤۦ۟ۤۘ۫ۙۖۘ";
                    break;
                case -702777277:
                    str = "ۨۛ۠ۥۛۖۘۚۤۤۡۧۛۦۢۜۥۨۛۚۜۜ۠۫۫ۗۤۥۗۖۘۘۖۚۜۘۚۧۡۘۨۘۢ۟ۙۡۜ۬۬ۖۜۧۘۛ۠۠ۨۖۧ";
                    break;
                case -682370730:
                    return z;
                case -393848186:
                    str = "ۡۙۡ۟ۡۡۘۦۜۨۘۜۦۧۘ۫ۥۘ۟۟ۖۢۜۦۘۨ۬۠ۦۚۚۧۥۥۘ";
                    break;
                case -14784797:
                    String str2 = "ۤۛۤۨۤۛ۟ۜ۫ۚۨۨۧۨ۠ۗۚۖۥۡۖۘۖۙۤۘۥۘ۬ۡۡۙۡ۠۬ۦۥۥۛۦ۠ۥۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-24332764)) {
                            case -1561536330:
                                str2 = "ۦ۬ۢۛۨۦۦۚۦۘۢۦۨۘۛۦ۬ۚۤۨۘ۠۟۠ۛۨۥۘ۠ۜۘۖۚۜ۬ۗۜۘۖۛۖۘۚۗۤۢ۟ۖۘ";
                                break;
                            case -1289627672:
                                String str3 = "ۙۤۚۥۥۗ۠ۜۥ۠ۛۧ۫ۦۖۧ۟ۨۘۢ۟ۧ۬ۛۡۘۗۙۗۗۤۖۘۦۚۘۘۡ۠ۛ۬ۜۦۢۧۜۘۜۨۦۗ۠ۦۘۗۥۦۙۡۗ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1708837860)) {
                                        case -1548038701:
                                            str2 = "ۘۘۙ۟ۖۛۥۖۘۘۜۦ۫ۚۦۨ۟۠۫ۥۥ۫ۨۧ۬ۘۧۖۘ۟ۦۦۘ۬۬ۨۘۧۖۚۦ۠ۢۢۤۡۧۤۙۧۢۖ";
                                            break;
                                        case 833979885:
                                            str3 = i == 4 ? "ۥۗۘ۬ۧۡۘۦۦۨ۟ۚۥۘۘۧ۠ۧۡۨۙۤۗۢ۠ۗۚ۠ۗ۟ۨ۠" : "۠۬ۧ۫۬ۡۖۖۤۤۤۙۨۗۙ۟ۢ۠ۢۙۖۖۛ۟ۖ۠ۡۖۢۖ";
                                            break;
                                        case 835348914:
                                            str3 = "ۢۤۖۘۗۙ۟ۧۡۙۜۖ۟ۜۢۥۡۦۘۛۛ۫ۛۤۡۡۨۦۡۥۢۖۗۜۧۖۚ";
                                            break;
                                        case 1277912839:
                                            str2 = "ۛۚۥۜۧۜ۬ۡۦ۟ۡۘۚۙ۠۟ۚ۟۫ۗۡۥۜۥۘ۫ۙۦۧۖۚۜۖۜۢۢۘۘۦۨۨۗۧۖۘ۫ۦۘۡۥۛۘۨۧۘۛۥۙ";
                                            break;
                                    }
                                }
                                break;
                            case -516676293:
                                str = "ۖۦۘ۠ۖۧۙۧ۠ۨ۬ۢۡ۠ۘۘ۠۫ۥۛۚۧ۟ۢۜۖۗۖ۫۬۬۟ۛۘۦۥۗ۠۫ۡۥۘۜ۠ۥۤۡۗۨۦۘۘ۟ۢۙ";
                                continue;
                            case 2024177115:
                                str = "ۖۡۘۘۥۙ۬۬ۗۡۘۚۘ۬ۚ۬ۡۛۤۖۘۚۜۛۙۜۦۘۛۖۘۤۘۢ";
                                continue;
                        }
                    }
                    break;
                case 145744350:
                    str = "ۡۚۘۘ۬ۚ۬۟ۨۢ۫ۛ۬ۢۤۨۖۛۛۥ۟ۘۘۨۘۖۘۡۜۖۤۨۘۘ۫۬۠ۨۙۖۘۛۨۦۡۤۤ";
                    break;
                case 211910008:
                    str = "ۧۙۗۙ۟ۖۚۘۨۘۦ۟ۖۘۧۨ۫۫ۜ۟ۖۤ۫ۢ۬ۦۘۖۧۘ۫ۜ۠۬ۦۡۘۙۛۖۘ۬ۜۡۘۛۜ۠";
                    break;
                case 1143350982:
                    str = "ۨ۬ۖۘۡۘۘۘۢۨۨ۠ۦ۠ۧۛۡۜۦۖۘۦ۠ۧۛ۫ۘۘۥۙۘۘۖۚۛ";
                    z = false;
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "ۨ۬ۥۘ۬ۧۦۘ۠ۘۨۘۛۢۦۘۦۜۥۨۖۧۘ۠۫ۜ۠۫ۦۖۙۢۘۤۥۘۖۜۥۘۜ۬ۤ۫۫ۦۜ۟ۥۧۘۜۘ۫";
        while (true) {
            switch ((((str.hashCode() ^ 188) ^ 720) ^ 559) ^ (-1190163441)) {
                case -1053741483:
                    return;
                case 541475102:
                    str = "ۘۙۢ۠۬ۤۗۖۜ۟ۛ۠ۘۛۖۘۙۜۜۙۤۜۘۗۨۨۘۘۚۡۜۥ۬";
                    break;
                case 821387655:
                    MobclickAgent.onPause(this);
                    str = "ۛ۬۬۠ۨۥۜۡۧۨۥۚۘۨ۬ۙ۫ۦۧۖۨۜ۬ۡ۟ۡۥۥۛۥۙۖۡۘۖ۬ۜ";
                    break;
                case 2073133454:
                    super.onPause();
                    str = "ۛ۫ۥۘۡۖۧۧۡۗ۠ۘ۟ۧۖۦۘ۬۠۫ۡۤۡۚۜۦۘ۬ۡۡۦۜۚ۠ۧ۟ۧۧ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "ۜۚۗۜۘۜۛ۠ۗۖ۬ۚۘۡۜۘۗ۬ۥ۠ۚۚ۫ۧۘۘ۠ۘۖۘۦ۬ۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 2) ^ 966) ^ FragmentManagerImpl.ANIM_DUR) ^ 807314634) {
                case -47204875:
                    return;
                case 325765850:
                    this.o0OoOo0.postDelayed(new OooO00o(this), 200L);
                    str = "ۘۙۚ۟ۙۚۘۥۦۦۧۡۥۤۗۛۜ۬ۡۘۛۨۖۦۘ۬ۡۧ۟ۥۜ";
                    break;
                case 436930713:
                    MobclickAgent.onResume(this);
                    str = "ۖۚ۠۟۫ۥۘۙۙۙ۟ۤۥ۬ۚۗ۟ۤ۠۟ۜۧۦۨۙ۬ۗۘۥۨۛ";
                    break;
                case 1601372144:
                    super.onResume();
                    str = "ۨ۠ۨۖۖۦۥۘۖۤۗۡۢۡۗۚۛۙ۠ۤۙ۫ۤۨۜۘۨۡۚۡۘۛۖۖۛ۬ۢ۟ۡۧۙ";
                    break;
                case 1878476830:
                    String str2 = "ۗۗۢ۬ۚۗۜۧ۠ۦۧۦۘۗۖۗۙۥۨۘ۫۟ۨۧۡۡۛ۠ۙۙۢ";
                    while (true) {
                        switch (str2.hashCode() ^ (-743012060)) {
                            case -1635370022:
                                str = "ۘۙۚ۟ۙۚۘۥۦۦۧۡۥۤۗۛۜ۬ۡۘۛۨۖۦۘ۬ۡۧ۟ۥۜ";
                                continue;
                            case -316743288:
                                str = "ۚۨ۟۫ۤ۟ۢۗۖۘۦۗۗۜ۫ۛۗۧ۟ۡۧۗ۠ۛۘۥۖۗۜۦۗۨۗۥۘۙۗۧۥۘۚ۠ۛۜۨۘۧ۟ۤۢۜۘۘ۟۠ۖۘ";
                                continue;
                            case 56035560:
                                str2 = "ۥ۬ۦۡۨۧۘۗۘۨ۟۠ۢۚۙۧۡۡۘۦۤۗۙۚ۬ۢۤۧۙ۠ۥ";
                                break;
                            case 1314828915:
                                String str3 = "ۥ۬ۦۘۧۚۘۘۦۡۥۧۧ۫ۢ۫۫ۢۗۚۛ۟ۘۡۡۚۡۘۡۘ۬ۡۜۥۧۡۡۚۘۚ۟ۦۘۚۘۧۤۜۛۡۖ۫";
                                while (true) {
                                    switch (str3.hashCode() ^ (-600685868)) {
                                        case -2051925170:
                                            str3 = "ۗۖۢ۫ۡۘ۟ۧۡۧ۫ۥۦۥۧۢۧۖۢ۟ۦۤۖۖۘۤۖۧۘۨۚۧۗۦۛۘۢ";
                                            break;
                                        case -331979820:
                                            str2 = "ۛۨۘۢۦۙۢۚۥۘۚۢۢۚۢ۬۫ۘۨۡۥۚ۬ۤۘۘۢۖۘۗۧۜۘ";
                                            break;
                                        case 406441366:
                                            str3 = this.ooOO ? "۫ۗۥۨ۠ۘۢ۠ۡۨۧۡۘۧۢۨ۫ۛۘۤۥۘۡۚ۠ۘۢ۠ۗۚۛ۫ۖۦۘۛۧۦۘ" : "ۚ۬ۡۨۖۛۥۖۜۛۨۘۥۢۨۡ۠ۨۤ۫ۦۘۨۡۡۦۦۨۘ۠ۚۙۢۦۧۘۥۖۢ";
                                            break;
                                        case 1480691877:
                                            str2 = "۟ۤۘۥۗۥۜ۫ۥۘۢۧۦۖ۟ۘۘۡ۬ۨۡ۬ۦۜۘۚۗۡۢۙۡۢ۟۫ۜۜۘۡ۟ۖۘ۫ۚۨ۟ۢۖۘۖ۬ۚۙۤ۟ۖۖۨۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 2076508142:
                    str = "۠۫۫ۙۚۘۘۘۦۡۢ۟ۦۘ۟ۡۥۘۨۚۦۤ۬۫ۜۢۨۘۚ۫ۖۘۧۥۦۘۡۘۘۡۙۥۘۨۖۥۗ۠۟ۜۘۧۘۗۨۡۘ";
                    break;
            }
        }
    }
}
