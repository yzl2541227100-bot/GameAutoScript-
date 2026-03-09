package com.cyjh.elfin.floatingwindowprocess.floatview;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.PointerIconCompat;
import cn.haorui.sdk.adsail_ad.view.scaleImage.SubsamplingScaleImageView;
import com.anythink.basead.p025ui.GuideToClickView;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.video.dynview.p158a.C2069a;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.ElfinFloatViewEvent;
import com.cyjh.elfin.entity.MsgItem;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.cyjh.p202mq.sdk.MqRunner;
import com.ywfzjbcy.R;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.ThreadMode;
import p285z2.C3679a5;
import p285z2.C3718b7;
import p285z2.C3753c5;
import p285z2.C3793d8;
import p285z2.C3797dc;
import p285z2.C3940h7;
import p285z2.C3951hi;
import p285z2.C3977i7;
import p285z2.C4014j7;
import p285z2.C4093lc;
import p285z2.C4095le;
import p285z2.C4125m7;
import p285z2.C4381t4;
import p285z2.C4491w3;
import p285z2.C4496w8;
import p285z2.C4587yp;
import p285z2.C4589yr;
import p285z2.DialogC4309r6;
import p285z2.DialogC4346s6;
import p285z2.ViewOnClickListenerC4272q6;
import p285z2.ViewOnClickListenerC4383t6;
import p285z2.j10;
import p285z2.p10;

/* JADX INFO: loaded from: classes.dex */
public class ElfinFloatView extends LinearLayout implements View.OnClickListener {
    private static final int o0000 = 1;
    public static final String o00000o0;
    private static final int o00000oO = 1001;
    public static final int o00000oo = 3000;
    private static final int o0000O = 2000;
    private static final int o0000O0 = 60;
    private static final int o0000O00 = 2;
    private static final int o0000O0O = 2;
    private static final int o0000OO = 5;
    private static final int o0000OO0 = 1000;
    private static final int o0000OOO = 1000;
    private static long o0000OOo = 0;
    private static final int o0000Ooo = 1000;
    private static final int o0000oO = 4;
    private static final int o0000oo = 3;
    private static final int o000OO = 5000;
    private WindowManager OoooOoO;
    private WindowManager.LayoutParams OoooOoo;
    private Context Ooooo00;
    private float Ooooo0o;
    private float OooooO0;
    private float OooooOO;
    private float OooooOo;
    private float Oooooo;
    private float Oooooo0;
    private ImageView OoooooO;
    private LinearLayout Ooooooo;
    private final View.OnTouchListener o00000;
    private Handler o000000;
    private Runnable o000000O;
    private CountDownTimer o000000o;
    private ViewOnClickListenerC4272q6.OooO00o o00000O;
    private ViewOnClickListenerC4272q6.OooO0O0 o00000O0;
    private int o00000OO;
    private BroadcastReceiver o00000Oo;
    private ComponentCallbacks o000OOo;
    private LinearLayout o00O0O;
    private LinearLayout o00Oo0;
    private ViewOnClickListenerC4383t6 o00Ooo;
    private DialogC4346s6 o00o0O;
    public TextView o00oO0O;
    public ImageView o00oO0o;
    private DialogC4309r6 o00ooo;
    private C4093lc.OooO00o o0O0O00;
    private Oooo000 o0OO00O;
    private DeleteFloatView o0OOO0o;
    private boolean o0Oo0oo;
    private LinearLayout o0OoOo0;
    public ImageView o0ooOO0;
    private boolean o0ooOOo;
    public boolean o0ooOoO;
    public TextView oo000o;
    private int oo0o0Oo;
    private LinearLayout ooOO;

    public class OooO implements Runnable {
        public final ElfinFloatView OoooOoO;

        public OooO(ElfinFloatView elfinFloatView) {
            this.OoooOoO = elfinFloatView;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۙۗۤۦ۫ۙۦۛۧۡۜۘۧۚۡۜ۬ۗۧۢۦۦۦ۟ۡۚۘ۫ۘۨۘ۫ۘۘۘۛ۠ۡۘ";
            ElfinFloatView elfinFloatView = null;
            WindowManager windowManagerOooOoOO = null;
            while (true) {
                switch ((((str.hashCode() ^ 640) ^ UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_VIEW_VALUE) ^ 45) ^ (-1137572967)) {
                    case -1667081018:
                        str = "ۤۜ۬۫۟ۜۨۘۘۘۨ۬ۦۘۢۦ۫ۘۚۖۗۖۥۥۡۢۜۗۤۗ۟ۦۘۤ۠ۧ۬ۚۦۘۥۡ۫ۨۡ";
                        windowManagerOooOoOO = ElfinFloatView.OooOoOO(this.OoooOoO);
                        break;
                    case -1021967129:
                        return;
                    case -875152722:
                        windowManagerOooOoOO.updateViewLayout(elfinFloatView, ElfinFloatView.OooOoO(elfinFloatView));
                        str = "۫۬۫ۡۨۘۘۤۘۖۗۧ۫ۚۖۗۨۨ۟ۜۚۥ۠ۖۡۨ۠۟ۗ۬ۖۥۜۚۘ۬";
                        break;
                    case -830311211:
                        elfinFloatView = this.OoooOoO;
                        str = "ۤۦ۠ۗۜۜۖ۬۬ۖۘۥۘۖ۠ۨۘۧ۠ۥۢۤ۟ۛۛۖۘۗۛۨۨۧۖ۠ۧۥۘۥۢۚۧۗۡۘ۫ۙۨ";
                        break;
                    case 347485483:
                        ElfinFloatView.OooOoO(this.OoooOoO).flags = 262176;
                        str = "ۚۦۗۖۖۘۨۘۘۘۘ۟ۙۦ۬ۜۡۖۡۘۗ۬۠ۤۙۢۦۚۧۚۨ۟۟ۚۘۦ۬۠";
                        break;
                    case 377213523:
                        str = "ۡ۠ۗۡ۟ۗۢۥۜۘۡ۫ۦۢۢ۠ۢۗۦۚۜۡۘۢۙ۬ۘ۫ۡۚۢۦۙۜۛۛۧ۠ۦۚۖۚۤۖۘۤۗۤۦ۬۫";
                        break;
                }
            }
        }
    }

    public class OooO00o implements Runnable {
        public final ElfinFloatView OoooOoO;

        /* JADX INFO: renamed from: com.cyjh.elfin.floatingwindowprocess.floatview.ElfinFloatView$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C4693OooO00o implements C3940h7.OooOO0 {
            public final OooO00o OooO00o;

            public C4693OooO00o(OooO00o oooO00o) {
                this.OooO00o = oooO00o;
            }

            @Override // p285z2.C3940h7.OooOO0
            public void OooO00o(Object obj) {
                String str = "ۗۦۧ۬ۚۡۡۖۜۘ۟ۡۜۚ۬۫ۛ۬ۡۘۙ۫ۖۨۢۢۢۜۜۘۤۛۚ۟ۧ۠ۚۤۡۘۧۙ۟۬ۦۘ";
                while (true) {
                    switch ((((str.hashCode() ^ 125) ^ SubsamplingScaleImageView.ORIENTATION_270) ^ 342) ^ 495064961) {
                        case 887614314:
                            str = "۬۟ۦۚۥۧۥۛۦۥ۟ۘۘۧۢۤۦ۬ۢ۬ۧۥۘۤۥۨۛۚۧ۟ۧۨ";
                            break;
                        case 1072354636:
                            return;
                        case 1369629392:
                            str = "۬ۘ۟ۖۧۜۘۚۥۥۘۨۤۡۦۛۨۘۛۖۖۘۥۢۥۘۛۧ۠۠ۙۥۢۦۡۘ۬ۡۡۘۚ۬ۧۤ۫ۡۜ۠ۜۘۘ۫ۘۘ۟۠۟";
                            break;
                        case 1911092313:
                            ElfinFloatView.Oooo000(this.OooO00o.OoooOoO, false);
                            str = "ۥۚۖۘۘ۫ۛۤۖۛۜ۫ۜۘ۠ۥۛۗۜۡ۠ۙۘۗ۫۠ۖ۟ۖۦۚۚۧ۠۠ۚ۟ۙۗ۬ۥۜۖۘۙۤۛۖ۠ۢۥۖۖ۠۟ۚ";
                            break;
                    }
                }
            }

            @Override // p285z2.C3940h7.OooOO0
            public void OooO0O0() {
                String str = "۠ۡۘۢ۠ۨۘۖ۫ۘۧۦۥۜۜۤۜۛۖۜۧۢۢۗۗۤۜ۠ۗۨۘۥۤۦۦۗ";
                while (true) {
                    switch ((((str.hashCode() ^ 681) ^ 773) ^ 78) ^ 1420193916) {
                        case -1027166107:
                            ElfinFloatView.Oooo000(this.OooO00o.OoooOoO, false);
                            str = "ۢۙ۫ۥۦۥۘۜ۬ۧۘۧۦ۠ۜۜۘۢ۬ۡۘۖۧۖۘۦ۟۫ۙۤۖۖۤۛ";
                            break;
                        case 948963981:
                            str = "ۦ۬ۥۘ۫ۨ۫۬۫ۦۜ۬۫ۨ۠ۗۥۥۦۥۘۘ۟ۖۘۙۧۛۗ۠ۚۦ۟ۨۖۚۥۛۦۗۨۛۘ";
                            break;
                        case 1735194910:
                            return;
                    }
                }
            }
        }

        public OooO00o(ElfinFloatView elfinFloatView) {
            this.OoooOoO = elfinFloatView;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۘ۫ۜۘۗ۫ۢۖۦۘۥ۠ۚۜۢ۟۟۟ۖۘۦ۠۬ۦ۫ۨۘۨۨ۠۬ۥۙۚۥۖۚۛۙ";
            while (true) {
                switch ((((str.hashCode() ^ 642) ^ 61) ^ 905) ^ 106202867) {
                    case -1657846273:
                        C3940h7.OooO0o0(new C4693OooO00o(this));
                        str = "ۚۗۨ۫ۚ۬ۤۜۘ۫ۗۗۧ۫ۤۡۖۖۘۨۖۤۤۛۦۘۡ۠ۧۢۤ۬ۗۤ۫۠۟ۥۘۢ۠ۦۘۧ۟ۖۘ۟۫ۦۘۥۢۡ";
                        break;
                    case -368886218:
                        return;
                    case 1875857450:
                        str = "ۤۘۖ۬ۧۘۘۜ۬ۦ۬ۥۗ۬ۡۘۘۚۧ۬ۨۖۜ۫ۖۖۜۢۚۡۛۧۢۖۥۧۘۙ۟ۗۦۘۨۧ۠ۤ۠۟۟۫ۗ۫ۘۤ۠۠ۨۘ";
                        break;
                }
            }
        }
    }

    public class OooO0O0 extends BroadcastReceiver {
        public final ElfinFloatView OooO00o;

        public OooO0O0(ElfinFloatView elfinFloatView) {
            this.OooO00o = elfinFloatView;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str = "ۤۖۦۘ۫ۥۛ۟ۖ۟ۗۘۖۧۘۗۘ۟ۖۘ۟ۜۦۘ۠۠ۦۘۙۘۖۘ۬ۦۦۘ";
            while (true) {
                switch ((((str.hashCode() ^ 218) ^ 238) ^ 758) ^ 1646974688) {
                    case -1931232086:
                        break;
                    case -1903378696:
                        String str2 = "ۢ۟ۚۡۡۙۦۨ۟۠ۙ۟۠ۧۡۡۡۡ۬ۡۘ۬۫۬ۨۦ۠۟ۗۛۜ۟۠ۘۧۨ۫ۜۛۙۜۘۚ۟۠ۦۖ۟ۦۢۡۨۢۢ";
                        while (true) {
                            switch (str2.hashCode() ^ 1390125735) {
                                case -1887513006:
                                    String str3 = "ۧۤۤۚۛۨۛۧۘۘ۬ۥۥۘۦ۫ۗۗۛۥۤ۫ۧۛۛۥۡۚۗۥۤۙۧۖۦۖۗۦۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-416947316)) {
                                            case -1660222580:
                                                str3 = "۬ۥۦۢۤۨۥۦۘۘۚۘۥۚۛۗۗۦۧۧۙۛۧ۠ۧ۫ۢۡ۬ۥۙۡ۫ۘۗۧۘ";
                                                break;
                                            case -366622283:
                                                str2 = "ۙۢۥ۠۠۠ۦۦۥۙۜ۠ۗۦۚۧ۠ۡۖۘۖۘۜۖۤۛ۫ۘۘۘ۠ۥ";
                                                break;
                                            case 485802696:
                                                str2 = "ۜۦۛۘۘۧۛ۫ۧۚۜۚۡۚۖۘۘۥۡۘۗ۟ۜۢۗۦۦۨ۟ۨۤۘ۬ۡۡۘۢ۠۟";
                                                break;
                                            case 1788300078:
                                                str3 = ElfinFloatView.OooOo0O(this.OooO00o) != null ? "ۨۜۛۜۡۖۥۥۥۘ۬۠ۗۗۛۚۢۨۡۘۛۙۥۘ۟ۗۘۚۖۖۘ۟ۙۘۙۦۙۚۧۛ" : "ۧۘۥ۬ۨۚۜ۫ۖۘۡۡ۬ۗۙۘۘۢۥۡۘۗ۠ۥۘۨۡ۠ۦۤۨۧۦۡۘ۠ۤۨۘۡۙۧ";
                                                break;
                                        }
                                    }
                                    break;
                                case -27735033:
                                    break;
                                case 656071633:
                                    str = "ۤۦۛۛۡۦۘۘۦۘۖ۫ۡۛۨۨۘۢۘۨۘۨ۠ۦۘۦ۬ۦۖ۠ۖۘۡۧۧۚۤۥۘ۬ۖۖۘۦۤۧ۟۫ۙۙۡ۠ۚۧۚ";
                                    break;
                                case 1693199748:
                                    str2 = "ۛ۬ۤۧۢۖۧۛۦ۬ۦۙ۬ۥۖۘۢۧۜ۫ۦۖۗۛۨۢۜۨۥۤۦۜ۠ۡۘۢۘ۬ۙۜۧۘۦۡۙ۠ۦۘۘۧۨۢۛۛۙ";
                                    break;
                            }
                        }
                        break;
                    case -1297075803:
                        String str4 = "۟ۛۨۜۜۖۘ۟ۤۖۘ۫۬ۘۡۛۧۗ۠ۤۨۖۢۛۜۙۢۖۡۜۖۜۘ۬۠ۧ۬ۦ";
                        while (true) {
                            switch (str4.hashCode() ^ (-2070268704)) {
                                case -2031623323:
                                    break;
                                case -1060042522:
                                    str = "ۛۥۢۥۜۡۢۥۘۘۢ۠۬ۚ۫ۙۖۚ۠۟ۨۘۗۚ۫۠ۨۦۘۛۙۦ۟ۤ۬ۢۦ";
                                    break;
                                case 842757942:
                                    str4 = "۫ۨ۬ۢۖ۠۟ۛۡۘۧۗۦۘۤۢۖۡۤۦۖۜ۬ۧۥۘ۟ۘۘ۫ۢۘۘۦۡۢۛ۬ۖۘ۫۟ۨ۠ۧۖۘۥ۟ۖۘ۠ۨ۬ۗ۠ۜۘۚۦۗ";
                                    break;
                                case 1999029150:
                                    String str5 = "ۥۛ۟۟ۦۥۚۜ۠ۙ۟ۛۢۙۘۡۚ۬ۤۦ۠ۛۙۖۨۙۢۜۛۢۦ۬ۚۗ۠ۜۘۖۘۗۜ۠ۗۛ۠ۘۘۗ۠ۚۜۚ۟ۙۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-933634529)) {
                                            case -1817458402:
                                                str5 = ElfinFloatView.OooOo(this.OooO00o).isShowing() ? "ۗۚ۬ۡۤۢ۟ۥۜۘۦۧۨۘ۫ۘۧۘۢۚ۟ۢۚۙۗ۫ۦۘۚۙ۬ۤۨۡۘ" : "ۚۨ۬ۦۨۥۢۢۦۖۙۨۘ۠ۙۤۜۥۧۘۜۙۨۘۥ۬ۜۘۛۦ۬ۖۖۤۨۧ۟ۘۙۘ۬۠ۜۘ۠ۨۡ۟ۨ۫ۖۧۖۘ";
                                                break;
                                            case 755073635:
                                                str4 = "ۙۙۦۘ۟ۨۘۜۗۘۘۦۘۥۘۖۙ۠ۨۚ۫ۜۧ۠ۡۨۖۘ۠ۚۙۙۥۨۘۖ۠ۥۘۘۨۨۢ۟ۗۖۙۛۘۚۖ۫ۡ۠ۤۚۢۜۚۧ";
                                                break;
                                            case 1493625048:
                                                str4 = "ۨ۟ۢۘۥ۫ۜ۟ۜۘۘۤۛۗۙۜۖۥۛۦۥۘۘۘۗۜۘۗۨۧۧۤۡۚۜۛ۫ۤۥ۫ۛ۟۟۟";
                                                break;
                                            case 1635776670:
                                                str5 = "۟ۦۨ۫ۗ۫۫ۚۜ۠ۧۡۘ۟ۡۘ۠ۛۡ۟۟۬ۢۦۦ۠ۜۨۚۧۧۚ۫ۨۚ۠";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        str = "۠۟ۖۘۗ۠ۢۦ۬ۘۦۖۘۘۢۥۘ۠ۨۖۖ۬ۘۖۙۨۘۖۖۡۘۛ۟ۤۜۧۨۢۢۖ";
                        break;
                    case -1179231968:
                        str = "ۥۙۦ۫ۘۗ۫ۢۖۘۜۗۖۥ۫ۘۘۡۢۖ۠۠ۖ۫ۗۡۦۗۧۚ۫ۦۘۦۖ۫ۙ۟ۨۘۡۖۖۙۚۥۙ۟ۜۘۤۡۤۦۨ۟ۛ۟ۖ";
                        break;
                    case -1030721319:
                        str = "ۛۘۥۘۥۧۧۡ۫ۜۛۙۖۨ۠۫ۧۢ۬ۘۘۘۘ۠ۨۘۤۛۘ۬ۤۘۘۧ۠ۦۦۘۡ";
                        break;
                    case -894696750:
                        ElfinFloatView.OooOo0o(this.OooO00o, null);
                        str = "ۦ۠ۗ۠۬ۥۘ۟ۨۨۨۦۥۘۧ۟ۥ۠ۗۦۘۥ۬ۙۤۨۦۘۗۘ۠ۚۗ۟ۗۨۢۡۨ";
                        break;
                    case -817635947:
                        String str6 = "ۛۛۙۤۥۙۥۢۗۚۧۢۡۚ۟ۤ۠ۙۙ۟ۢۙۥۙۘۦۘۚۧۤۛۦۡۘ۟۫ۡۖۦۦۙ۫ۥ۠ۦۧۘۗۨۦ";
                        while (true) {
                            switch (str6.hashCode() ^ (-1683493916)) {
                                case -63042247:
                                    String str7 = "۬ۡۙۙۚۧۦۗۖۘ۫ۚۡۘۤۜۙۜۥۨۧ۠۟ۖۧۢۜۘۘۨۚۡ۫۬ۨ۠ۜۧۦۢۖۥۧۘۦۦۡ۟ۖۘ۬۟ۢۛ۠ۜۘ";
                                    while (true) {
                                        switch (str7.hashCode() ^ (-302685634)) {
                                            case -1731741998:
                                                str6 = "ۗۙۢ۠ۜۖۘ۬۬ۘۨۘۡۡۖۘۢۜۗ۬ۗۤۚۦۗۖۗۘۘۘۚۛ۟ۡۤۧ۟ۖۘۧۦۥۘۗۤۡۙ۠ۖۤۦۨ";
                                                break;
                                            case -1706644915:
                                                str7 = "۫ۤۛۙۜ۫ۚ۫ۨۛۡۘ۫ۤۥۛۨۨۘۙۛۚۛ۟ۜۘۘۡۦ۬ۢۙۜ۠ۘۘ۟ۛۖۖۗ۫ۦۜۘ۫ۢ۟ۤ۠ۘۘ";
                                                break;
                                            case -1385989912:
                                                str6 = "۬ۗۘۘ۠ۤ۬ۚ۠۫ۖۜۥۘۧ۠ۜۚ۬ۨۘۥۢ۬ۘۤ۫۠ۤۖۘۢۛۘ۠ۡۨۙ۟ۙ۠۬ۛۧۘۘۤ۫۠ۥۨۤۚۛ۟ۢۡۥۘ";
                                                break;
                                            case 968568167:
                                                str7 = ElfinFloatView.OooOo0O(this.OooO00o).isShowing() ? "ۙۛ۫۬ۙ۫ۚۖۗۤۖۥۘۥۨ۬ۛۢۖۖۙۘۘ۠ۨۨۘۛ۠ۤ۬ۧ۠ۛۗۤۚ۫۟ۧ۬ۚۨۖۛۢۘۘ۟ۚ۠" : "ۥ۫ۡۘ۫ۥۖۛۧ۟ۜۤ۟ۘۘۤۡۧۘۛ۬ۜ۠۫۠ۢۙۦۜۚۘۤۢۥۘ۠۟ۤۥۤۜۥ";
                                                break;
                                        }
                                    }
                                    break;
                                case 63013046:
                                    str6 = "ۥۛۥۜ۠ۢۦۚۡۘۥ۫ۖۡۛ۠ۧۦۥۧۘۗۚۧ۫ۜۡۨۖۨۘ";
                                    break;
                                case 81122997:
                                    str = "ۙۤۨۘ۫ۨۥۘۦۢۧ۬ۥ۬ۙۡۖۘ۫۠ۖۘۦۜۙۜ۟۟ۘۨۦۘۚۡۚۨۘ۫ۚۦۚ۫ۥۦۘۨ";
                                    break;
                                case 1412746011:
                                    break;
                            }
                        }
                        str = "ۧۖ۫ۥ۠۬ۢۢۜۢۜۧۘ۫ۘۘ۟ۦۙۘ۫ۡۨۡ۫ۖ۟ۥۘۛۢ۬۫ۨۘ۠ۨۙ";
                        break;
                    case -260720352:
                        String str8 = "ۡ۠ۥۡۦۚۨۚۙ۫ۘ۟۠۫ۜ۫ۛۜۘۙۦۧۛۛۜۘۛۗۦۜۡۘۤۧۨۘۧۢۜۘۥۤ۠ۥۛۥۘۛۛۜ۟ۧۦۙۨۦ۠ۨۢ";
                        while (true) {
                            switch (str8.hashCode() ^ 1107943565) {
                                case -1223704252:
                                    String str9 = "ۧۛۦۦۡۘۦۦۜۚۖۨۤ۬۠ۘۡۨۨۢۚۖۜۛ۠ۘۥۡ۟۟ۜۘۢۚۛۡۧۡۘۦۚ۠ۚۨۡۘۚۗۡۘۗۘۧۚۡۥۘ";
                                    while (true) {
                                        switch (str9.hashCode() ^ (-1804120842)) {
                                            case -1915488958:
                                                str9 = ElfinFloatView.OooOo(this.OooO00o) != null ? "ۛ۟ۘۘۥ۟ۘۘۜۧ۬ۛۡۨۚ۫۫ۚۘۖۘۧۛۥۡ۫ۤ۠۠ۤ۫۠" : "ۨۘۡۚۜۗۚۜۧۘۖۡۢۛۦۦۘۨۨۘۜۖۤۥ۟ۗۧۥۘۜ۟ۡۘ۠ۙ۫ۤۜ۠";
                                                break;
                                            case -951324825:
                                                str8 = "ۖۦۘۚۡۥۘۨ۬ۜۘۢۨۖۗۘۘۛ۠۬ۗۘۧۛ۫ۖۘۘ۬ۡۜۘۨ۬ۘ۫ۙۨۗ۠ۨۘۗۤۘۘۘ۠ۡۘۤۥ۬ۥۨ۠ۜۥ";
                                                break;
                                            case -565188797:
                                                str9 = "ۛۛ۫۠ۜۤۡۘۡۛۗ۟ۢۥۥۘۛۨۡۘۘ۫ۦ۬ۦۤ۠ۛۙۨۤۚۗۦۚۗۥۢ۟ۥۧۘ۬ۛۧ";
                                                break;
                                            case 12722442:
                                                str8 = "۫ۡ۬ۨۦ۠ۧۢۨۨۡۧۘ۫ۗۦۙۘۨۘۡۙۡۚۢۚۢۚۙۘۖۥۢۧۘۛۙۜ۠ۦۧۘۛۨۡۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case -1139039618:
                                    break;
                                case 865998332:
                                    str = "ۦ۫ۜۗ۠ۙۛ۟ۥۘۙۤۘۥۙۢۚۦۦۦ۫ۡۧۢۗۨۖۥۘۛۘۨۘۜۛۘۛۙۢۜ۟ۨۦۥ۠ۥۢۜۖۦۘۥۥۖۘۘۤۦۘ";
                                    break;
                                case 1680885048:
                                    str8 = "ۨ۟ۖۥۗ۠ۜۙۦۘۢۢۘۡۗۨ۟ۧۤۖۜۦۘۗۘۜۤ۫ۡۨۛ۟۬ۚ۬۠ۢ۬ۖ۬ۗۥۖۜۘ";
                                    break;
                            }
                        }
                        str = "۠۟ۖۘۗ۠ۢۦ۬ۘۦۖۘۘۢۥۘ۠ۨۖۖ۬ۘۖۙۨۘۖۖۡۘۛ۟ۤۜۧۨۢۢۖ";
                        break;
                    case -154468799:
                        ElfinFloatView.OooOo(this.OooO00o).dismiss();
                        str = "۠۟ۖۘۗ۠ۢۦ۬ۘۦۖۘۘۢۥۘ۠ۨۖۖ۬ۘۖۙۨۘۖۖۡۘۛ۟ۤۜۧۨۢۢۖ";
                        break;
                    case -123707987:
                        ElfinFloatView.OooOoO0(this.OooO00o, null);
                        str = "ۧۜۧۘ۬ۨ۟ۢۜۘۘۧ۠ۙۧۘۨۘ۬ۧۜۘ۠ۡ۟ۛ۠ۡۨۜۜۘۛۨۘۥۗۨۗۤۨۘۙۧ۫۬۟ۨۘۨۚ۟ۡۥ";
                        break;
                    case 335272337:
                        str = "ۙۢ۬ۡۨۘۜۢۨۘۨۜ۫ۛۛۥۜۨ۫۠ۗۨۘ۬ۘۖۦ۟ۜۦۧۥۘ۬ۥۢۜۡۜۡ۠ۛ۫ۙۛۖ۫ۦۘ۬ۤۚۤۢۜۘۚۨۥ";
                        break;
                    case 892335975:
                        ElfinFloatView.OooOo0O(this.OooO00o).dismiss();
                        str = "ۧۖ۫ۥ۠۬ۢۢۜۢۜۧۘ۫ۘۘ۟ۦۙۘ۫ۡۨۡ۫ۖ۟ۥۘۛۢ۬۫ۨۘ۠ۨۙ";
                        break;
                    case 1176974310:
                        String str10 = "۬ۧۙ۠ۘۘۗۧۥۘ۫۟ۘۘ۫۬ۡ۠ۙۤۖۢۚۦۥ۠ۘۛۗۘۦ";
                        while (true) {
                            switch (str10.hashCode() ^ 723091520) {
                                case -606085261:
                                    str10 = "ۥ۬ۨۘۡۢۛۖۚۨ۬ۥۙۙۜۨۘۧۥۙۘ۟ۛۧۛ۠ۜۚ۠ۗ۠ۜۘ";
                                    break;
                                case 468905163:
                                    String str11 = "ۥۧۛ۫۬ۘۘ۟ۧۡۨ۠۟ۚۛۨۘۧۦۥ۬ۡۧۘۚۢۘۘۦۡ۬ۘۦۡۖۗۗۜ۟۬۠۫ۨۗۢۜ";
                                    while (true) {
                                        switch (str11.hashCode() ^ 1715958472) {
                                            case -1666417364:
                                                str11 = "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) ? "ۤ۠ۚ۫ۢۖۘۙۤۡۘۖۘۤ۫ۙۢۧۤۜۘۖۦۨۘۡۤۜۙۖ۟ۡۙ۫ۚۘۘ۫ۨۜۘ" : "ۡۦ۫۟ۜ۬ۢۡۛۨۖۖۚ۟۠ۚ۬۠۠ۧۗۡۙۚۢ۠ۗۗ۫ۨۘ۟ۗۦۥۧ۬ۧۛۙۨۥۗۖۡۥۘۡۡ";
                                                break;
                                            case -1159768219:
                                                str11 = "ۨۤۗ۟ۡۛ۫۠ۜۘ۟ۦۡۘ۫ۥۘۘۨۢ۬ۥ۠ۨ۫ۧۘۘۛۘۚۙۧ۠ۨۦۖۤ۬ۙۥۘۜ۟۟ۤ";
                                                break;
                                            case -135518566:
                                                str10 = "۟ۘۙۤۧۦۘۚۧۡۘۘۘۚۚۨۥۘۙۨۥ۬ۥۦۘۜ۫ۦۘۧۤۛۚ۫ۨۘ";
                                                break;
                                            case -52164049:
                                                str10 = "ۗ۫ۦۙ۫ۖۢۧۖۘۗۨ۬ۥۖۢ۟ۧۜۚۘۡۘ۠ۦ۫ۜۤۘ۬ۛۛۡۗۡۘ۟ۤۦۚۢۦۘۨۢۦۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 484333798:
                                    str = "ۨۧۤۘۙۦۚۙۜۜ۠ۘۨۧۡۘۦۚۨۗ۬ۘۥۘۥۘۧۡۖ";
                                    continue;
                                case 863104639:
                                    str = "ۧۜۧۘ۬ۨ۟ۢۜۘۘۧ۠ۙۧۘۨۘ۬ۧۜۘ۠ۡ۟ۛ۠ۡۨۜۜۘۛۨۘۥۗۨۗۤۨۘۙۧ۫۬۟ۨۘۨۚ۟ۡۥ";
                                    continue;
                            }
                        }
                        break;
                }
                return;
            }
        }
    }

    public class OooO0OO implements C4093lc.OooO00o {
        public final ElfinFloatView OooO00o;

        public OooO0OO(ElfinFloatView elfinFloatView) {
            this.OooO00o = elfinFloatView;
        }

        @Override // p285z2.C4093lc.OooO00o
        public void OooO00o(Object obj) {
            String str = "ۜۥۘۤ۟ۙۦۨۘۘۙۙۦۧۧۦۘۤ۬ۜۘۗۧ۫ۗۨۚۦۨۤۡۢۨۤۨۚۖۚۚۡۤ۟ۦۘۘ۬ۚۨۖ";
            while (true) {
                switch ((((str.hashCode() ^ 102) ^ 795) ^ 548) ^ (-2116981883)) {
                    case -1818724512:
                        str = "۬ۙ۫ۧۛ۫ۛۛۡۤۙۚۤۢۢۖۗۜۘۡ۬ۙۥۤۜۨۤۤۨۘۙۦۜۤۛۡۢۨۨۧۘۙ";
                        break;
                    case -207730867:
                        return;
                    case 41564538:
                        ElfinFloatView.OooO00o(this.OooO00o);
                        str = "ۤۖۙۜ۫ۛۚۚۜ۬ۛۥۘ۠۫ۡۘۤ۫ۗۤۤۥۨۜۗۧۨۗ۫ۢۥۖ۠ۘۘۧۤۙۦۡۛ۫ۗۨۘۗۨۨۘۛ۫ۗ";
                        break;
                    case 808795128:
                        str = "ۡۙۚۨۘۚ۬ۧۡۤۛۢۛۡ۟ۨۚۗۚۗ۟ۥۥۙۥ۫ۖۘۢۚۨۘۚ۠ۡۘۗۦۖۤۥۥۥۘۙۧۙۖ۟ۦۛ";
                        break;
                }
            }
        }
    }

    public class OooO0o implements ComponentCallbacks2 {
        public final ElfinFloatView OoooOoO;

        public OooO0o(ElfinFloatView elfinFloatView) {
            this.OoooOoO = elfinFloatView;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            String str = "۠ۦۙۛۦ۬ۨۧۡۙۚ۬۠ۨۨۘ۬ۜۦۘۥۢۗۗۘ۠ۙۥۗۚۙۥۤۥۢۛۥۧۘۤۖۗۘۧۡۘۥۦۘۧۧۨۘ";
            while (true) {
                switch ((((str.hashCode() ^ 248) ^ 108) ^ 805) ^ 1562716360) {
                    case -2114961250:
                        str = "ۜۚ۫۬ۡۗۗۡۧ۬ۙۘۨۤۧۗۜۖۗۢۜۘۜۥۘۙۛۨۘۦۦۖ۫ۘۥۘۦ۠۟ۢۡۤ۬۟ۜۨۧۘۧۢ";
                        break;
                    case -449825369:
                        return;
                    case 1462910505:
                        str = "ۜ۠ۛۛۗۦۗۖ۬ۢ۠ۖ۟۠ۖۢۡ۠ۜۘۨۘۧۚۨۘۜۙۗۥۢۥۘۖۨۘۡۜ۬۫ۙۖۚۥۨۚ۟۬ۥ۠ۦۘۘۨۜۘ۟ۗۡۘ";
                        break;
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            String str = "ۨ۫ۨۧۡۙۢ۟ۨۘۘۡ۠ۧۧۦۘۗۜۥۘۛۧ۫۟۬ۙۨ۬۬۠ۙۥ";
            while (true) {
                switch ((((str.hashCode() ^ 713) ^ 254) ^ 494) ^ 670869778) {
                    case -901061792:
                        str = "ۧۖۗۤۡۧ۫ۛۦۘ۬۬ۦۛۚۥۜۧ۠ۧۚۥۘۘۧۙۤۢۖۤۙۖۥۢۢۢۜ۬۠ۥۖ";
                        break;
                    case 807877155:
                        String str2 = ElfinFloatView.o00000o0;
                        str = "ۡۗ۫ۙۦۘۗۖۧۘ۬۠۬ۛۢۖۘۦۚۥۦ۟۟ۗۥۥۡۨۥۘ۫ۥۡۦۜۧۘۚۖۨۘ۫۠۫ۤۗۥۘ";
                        break;
                    case 1870022440:
                        return;
                }
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            StringBuilder sb = null;
            String str = "ۧۤۙ۟ۜۡۘۦۛۨۘ۫ۚۢۘۙۚ۫ۦۜ۬ۖ۟ۨۧۨۙۧ۠۠ۡۗ۠ۢۘۙۥۤ۟ۥۘۖۦ۟ۢ۟ۡۛۡۡ";
            while (true) {
                switch ((((str.hashCode() ^ 877) ^ GuideToClickView.C0870a.f1446e) ^ 168) ^ (-253833466)) {
                    case -1574614851:
                        sb.toString();
                        str = "ۘ۟ۨ۠۟ۡۘۜ۟ۦۘۦۦۨۘۚۙ۫ۥۨۥۘۖۥۜۘ۟ۖۦۜۛ۟ۤۥۥۛۧۖۖۧۦ۠ۘۚۨۢۜۘۤۗۜۡۧۚ";
                        break;
                    case -478280769:
                        str = "ۥۢۡۥۙۖۘۧۨۧۛۧۦۘۜ۬ۨۘ۫ۤۛۘۤۖۘۤۤ۟ۥ۬ۤۙۙۘۢۧۡۘۧۜۥ۠ۚۚۡۡۗۢۙۘۧ۟ۨ۫ۨ۟ۛۗۤ";
                        break;
                    case -232362642:
                        str = "ۛۗۚۙۧ۬ۗۢ۟ۧ۠ۖۚۤۗۥۥۡۘۥۨۤۗ۬ۜۡۦۢ۬ۘۚۢۧۥۘۨ۠ۖۘ۫ۡۗۡ۟۠";
                        break;
                    case 247459254:
                        String str2 = ElfinFloatView.o00000o0;
                        str = "۬ۙۘ۟ۗۨ۟ۡۘۡۤۥۘۛۢۚۛ۟ۥۘ۫ۦۚۚۛۘۘۙۥۘ۫ۚۖۘۨۧ۠ۗۤۛ";
                        break;
                    case 1022448608:
                        sb.append(i);
                        str = "ۨۚ۫ۧۛ۬ۧۤۛۡۤۧۨۡۘۤ۠ۦۚۡۧۘۜۛۖۘۖۗ۟۫ۚۚۗۜۙۥۧۧ";
                        break;
                    case 1080161463:
                        sb = new StringBuilder();
                        str = "۟۬ۤ۟ۘ۟ۜ۠ۡۘۨۚۜۦۘۦۘ۫ۘۦۜۧۖۘ۠ۙۖۢۜۧۘۢۗ۫۫ۡۡۗۖ۫";
                        break;
                    case 1245304844:
                        return;
                    case 1817919723:
                        sb.append("onTrimMemory: ");
                        str = "ۤۦۨۚۤ۫ۚ۠۟ۗۛۘۘۘۡۧۘۚۦۢۦۨۡ۫ۖۗۤۧۧۡ۬ۜۨۨۛۥۘ";
                        break;
                }
            }
        }
    }

    public class OooOO0 extends CountDownTimer {
        public final ElfinFloatView OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ElfinFloatView elfinFloatView, long j, long j2) {
            super(j, j2);
            this.OooO00o = elfinFloatView;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            String str = "ۘ۠ۦۘۛۖۖۘۙۛۡۚ۠ۨۘۢ۠ۡۘۛۙۙ۬ۖۨۘۨۚۗ۠ۛۢۤ۠ۢ";
            while (true) {
                switch ((((str.hashCode() ^ 237) ^ 672) ^ 997) ^ 297625149) {
                    case -1817622506:
                        return;
                    case -982012092:
                        ElfinFloatView.OooOoo(this.OooO00o);
                        str = "ۚۡۛ۫ۦ۬ۘ۬ۘۘۖۨۥۘۛۘۦۨۡۦۘۜۚ۫۫ۧۤۢۦۡۗ۬ۨۥ۟ۛۢ۬ۚۢ۟ۡۘۦ۫ۨۘ۟ۛۚۥ۬ۢ۠ۤۨ۫ۗۡۘ";
                        break;
                    case 1496274007:
                        str = "ۡۗ۬۫ۤۗۙۦۘ۠ۦۡ۠ۘۢۚ۬ۘۥۡۡۘۛۚ۫ۡ۫ۨۦۗۛ";
                        break;
                }
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            String str = "ۛۡۖۘۤۨۤ۟ۚۙۧۧۨۘ۟۠ۢ۟ۚۜۚۧ۟ۙۥۜۘ۫ۡۛ۟ۤۘۘۘۦۢۤۧۧ";
            while (true) {
                switch ((((str.hashCode() ^ 404) ^ 387) ^ 941) ^ (-262469824)) {
                    case -2133500729:
                        String str2 = "ۛۜۘۦ۬ۖۢۧ۬ۗۤۢۖ۟ۤۢۖۥۘ۬ۧۖۢۥۥۡۘۜۘۡۥۧۘۧۙۡۘ۠ۛۗ";
                        while (true) {
                            switch (str2.hashCode() ^ (-1890442410)) {
                                case -268278432:
                                    str2 = "۬ۧۖۘۢۢۥۢۧ۠۠ۢ۟۬ۛۘۤۧۡۚۢۛ۠۬ۜۜۙ۫ۦۦۥۦۚۙۦۥۤۗ۠۠۫ۨ";
                                    break;
                                case -138153802:
                                    break;
                                case 386052287:
                                    String str3 = "ۢۛۤۧۦۘ۟۫ۡۡۡۦۗۨۖۘۥۤۘۘۨ۟ۜۘۘۘۘۨ۠ۧۘۤۢۖ۠ۘۦۨۤۦۧۗۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-872711288)) {
                                            case -1421028166:
                                                str3 = "ۛۖ۠ۜۡۛۘۙۦ۫ۜ۠ۙ۠ۥۥ۠ۙۦۘۥۚۗۥۘۘۘۘ۟ۨۤۖۜۡۘۦۢۥۤۤۚۛۖۨ";
                                                break;
                                            case -1300888094:
                                                str2 = "۬ۦۜۘۦۘۘ۟ۗۢۦۦۦۘۡۤۖۘۘۖۘۧۗۜ۟ۨۚۢۢۘۘۖۦۥۘ۬ۤۗ۠ۨۙۦۚۧۘۚۖۘۚ۠ۧ۫ۢۡۘۖۥۨۘۢۤۜ";
                                                break;
                                            case 1555335417:
                                                str3 = ElfinFloatView.OooOoo0(this.OooO00o).getVisibility() == 8 ? "ۘۚۛ۟ۘۙ۬ۦۤۘۡۨۘ۫ۜۜۘۤۢۥۘۛۨۗ۫۠ۧۥۙ۟ۘۡ" : "ۖ۠ۙۨۛ۬ۖۜۡۘۘۘۙۥۚۘۖ۬ۢ۟ۨۘ۠ۛۦۘۤۛۤۧۢۜۘۨ۫ۥۨۙۚ";
                                                break;
                                            case 1806756924:
                                                str2 = "ۤۥۚۦۗۜۛ۟ۖۡۢۥۘۧۛۗۗۜۢۗۦۛۡۤۥۘۤۗۙۙۧۗۖۚۤۚۚۙ۬ۜ۠۠۬ۨۜۚۨۢۖ۬ۘۤۘۚۘۖ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1756232215:
                                    str = "ۚۘۖۘۚۧ۬ۛۢۘۢۚۛۘۥۤ۫ۘۡۘۘۡۦۘۤۚۚ۫۬ۖۚ۠ۦۦۨۘۖۚۨ";
                                    break;
                            }
                        }
                        str = "ۡۤۢۧۘۘۗۙۦۢۦۤ۬ۖۜۘۖ۫ۡۘۙۤۜۨ۟۠۬۠ۦۡۥۘۜۗۢۙۤۨۛۢۥۘ۠۫";
                        break;
                    case -2012488275:
                        break;
                    case -1767571679:
                        ElfinFloatView.OooOooO(this.OooO00o).cancel();
                        str = "ۡۤۢۧۘۘۗۙۦۢۦۤ۬ۖۜۘۖ۫ۡۘۙۤۜۨ۟۠۬۠ۦۡۥۘۜۗۢۙۤۨۛۢۥۘ۠۫";
                        break;
                    case -972991038:
                        ElfinFloatView.OooOoo(this.OooO00o);
                        str = "ۧ۠ۡۚ۬ۡۘۤۖۘۘۙۦۦ۟ۢ۟ۤ۠ۨۜۖۛۙۚۦۧۨۗۦۘۘۘۥۖ۟ۧۚۢۖۜ۟ۧ۫ۙ";
                        break;
                    case -637607664:
                        str = "ۘ۠ۚۛ۫۫۟ۤۜۘ۬ۚۨۘۦۛ۠ۥۛۨۘۛ۬ۦۖۨۛۚۧۡۘۛ۬۠ۧۦۥۙۛۨۚۡۘۧ۟۬ۖ۟ۧۚ۠۟ۧۙ۠۠ۚۧ";
                        break;
                    case -343218964:
                        str = "ۗۢۙۗۤۧۛۚ۬ۚۖۦۘۛۢۨۨۙۛۥۢۨۘۗۡۙۡۦۛ۫ۢ۬ۥۨۢۚۘۖ۟ۤۤۖۡۜۘۙۜۤۢۢۥۘۙۥۖۖۖۤ";
                        break;
                    case -202138374:
                        this.OooO00o.Oooo00o(false);
                        str = "ۚۢۖۘۦۢۚۘۛۜۘۤۚۘۦۗۨۛۨۡۘ۟ۜۡۜۗۤۛۥ۠ۖۖۛۘۖ۟ۧ۫ۦ";
                        break;
                    case -47111791:
                        String str4 = "ۜ۟۬ۧۦۤۤۥۛۥ۫ۨۚۦۥۦۘۖۘ۫ۦۜۘۨۛ۟ۦۗۦۡۛۘ۟ۧ۬ۥۘۜۘۘۢۚ۬ۨۚۦ۬ۧۧۛ";
                        while (true) {
                            switch (str4.hashCode() ^ (-1715376625)) {
                                case -1412828718:
                                    str = "ۡۗۘۘۢ۠ۨۘۢۛۦ۟ۚۖۘۡ۫ۦۘ۠ۧۡۘۥۢ۠ۚۘۧۘۜۨ۟ۥۢ۠ۛۧۧ۬۬ۨۘ";
                                    break;
                                case -1238381338:
                                    String str5 = "ۗۚۗۡۥۘ۟ۗۥ۬ۖۦۘۛۖۥۘۜۤۧۧۨۗۖۡ۟ۦ۠ۡۚۗۚۙۦۥۘۥۢ۫";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-457452277)) {
                                            case -1174203988:
                                                str4 = "ۧ۟ۡ۠۫ۗۛۢ۟ۦۤ۫ۦۥۦ۠ۛۦۘۤۥۘۘ۠ۖۛ۫ۙ۟ۘ۟ۦۥۘۦۢۜ۬ۨۙۘۥ۬ۘ";
                                                break;
                                            case -1083883047:
                                                str5 = j <= C2187m.f13871ag ? "ۚ۟ۛۙ۫ۥۧۦۘۤۙ۬۬ۤ۠ۙۧ۠ۛ۠ۧۦۢۥۘ۟ۛۤۡۜۘ" : "ۜ۠ۢۤۧۖۜ۟ۡۘۧ۠ۡ۟ۗ۟۠۫۟ۧ۟ۦۘۜۥۛ۬۬۬ۤۡ";
                                                break;
                                            case 1083798474:
                                                str5 = "ۦۜۥۘۙۘۙۦ۬ۘۦ۫ۘۘۢ۠۫ۤۡۨۥ۫ۧۙۤۘ۫ۥۖ۟ۛۤۜۘۘۘۙۛۜۘ";
                                                break;
                                            case 1461061213:
                                                str4 = "ۗ۟ۡۘۧۖ۬ۖ۫ۢۙۜ۬۬ۚ۬۠ۨۜۛۦۗۖ۟۬ۨۢ۬ۤۡۧ۠ۘۦۛۡ۫ۥۤۦ۠۬";
                                                break;
                                        }
                                    }
                                    break;
                                case -762157520:
                                    break;
                                case -183463502:
                                    str4 = "ۚۙۥ۬۟۫ۙ۠ۨۘۢۘۜۙۡۡۤۨۥۘۨۡۗۚۤۥۘۤ۟ۥ۫ۚۡ۬ۘۡۖۘۤ";
                                    break;
                            }
                        }
                        break;
                    case 829218403:
                        ElfinFloatView.OooOooo(this.OooO00o).setAlpha(0.5f);
                        str = "ۙ۟۟ۘۨۨۧ۠ۙ۠ۘۢ۬ۛۘۦۦۢۛۖۜۡۛۡۘۧ۟ۜۜ۬ۖۘۙۜۖۘۙ۟۬ۤ۠ۛۙۖۚۡۦۜ۫ۙ۬";
                        break;
                    case 1292589521:
                        String str6 = "ۚۡ۠ۗ۠ۧۦ۠ۘۥۚ۫ۖۜۜۘ۬ۜ۬ۥۘۘۛ۬ۘۘۦۗۦۙۖۧۙۡ۠ۖۗۗۗۚۖۤۙۜۗۙۖۙۛۤۛ۠ۖۘۦۚۦ";
                        while (true) {
                            switch (str6.hashCode() ^ (-302007412)) {
                                case -1722339604:
                                    break;
                                case -1617581103:
                                    String str7 = "ۛۖۜۘۧ۬ۜۚ۠۬ۦۙۗۡ۠ۢۨۘۡۦۙۨۧۗۢ۬ۡۧۡۘۢۡۥۘ۬ۨۜۜۘۥ۠ۘۡۘ";
                                    while (true) {
                                        switch (str7.hashCode() ^ 306180162) {
                                            case -1457630602:
                                                str6 = "ۥۚۜۛۚ۫ۥۥ۟ۥۧۜۘۜۙۚۥ۠ۚۧۢۖ۫ۗۗۘۡۘ۟ۚ۫ۘۙۗۥۘۧۢۗۥۗۥۘۢۦۖۘ۬ۚۖۘ";
                                                break;
                                            case 312983379:
                                                str7 = "ۜۦ۟ۖ۫ۢۛۘ۠ۛۡۘ۫ۗۘۘۡۜۤ۬۠۟ۨۖۚۤۖۚۚۥ۬ۗۗۦۘ۟ۖۢۦۚۢ۬ۙۖۘ";
                                                break;
                                            case 585841640:
                                                str7 = C3718b7.OooO0Oo().OooO0OO == 2 ? "ۤ۠ۛ۠ۨۥ۟ۦۦۚۗ۬۫ۡ۟ۨۡۘۘۢۖۖۥۖۘ۠ۘۖۘۖ۬ۡۘ۠ۘۤ۟ۥۡۘۚ۫ۦۘۡۧۨۘۥۡۖۤۙۜۘ۫۠ۢۡ۬ۖۘ" : "۠ۛۖ۟ۦۜۘ۬ۨۥۧۢ۫ۧۤۙۛۦ۫۫۫۠ۧۜۖۘۢۛۨۘۨۧۡ۟ۧۨۗۥ";
                                                break;
                                            case 1596415233:
                                                str6 = "ۙۚۙۛۢۥۘ۟ۗۙ۬ۥۘۡۜۧۚۘۘۘۡۖۜۘۤۙ۬۠ۦۚ۟۠ۡۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case -704096893:
                                    str = "۠۟۬ۦ۬ۘۘۦۧۜۘۙۖۡۘۖۜۜۗۙۘۛۗۥۘ۫ۚۥ۬ۤۨۘ۟ۧ۠۬۠ۨۙۗۦۘۗۛ۫ۙۧۡ۬ۗۖۗۧۥۧۡۘۘ۫ۡ";
                                    break;
                                case 485761429:
                                    str6 = "ۦ۠ۨۘۖۘۤ۫ۛ۫۠۟ۨ۟ۙۜۦ۫ۚۙ۬ۦۡۧ۟۬ۜۗۛ۠ۖ۠ۨ۬ۘۡۡۘۦۚ۠۠";
                                    break;
                            }
                        }
                        break;
                    case 1639951315:
                        String str8 = "ۘۖۚۥۡۥ۟ۤۨۚۖۤ۬ۘۦ۬ۢ۠ۗۘۘۢۛۥۘۙۨۦۜ۬۬ۛۦۧ۫ۙۢۢۦۥۡۙ";
                        while (true) {
                            switch (str8.hashCode() ^ (-1057567314)) {
                                case -2093848555:
                                    String str9 = "ۗۗۜۘۙۖۥۘ۫ۙۤ۬ۧ۟ۡۦۨۘۤ۬ۗۧۖۨۡۘۥۨۨۦۡۤۦۘۥ۟ۘۜۗۘۘۜۘۚۛۥۡ";
                                    while (true) {
                                        switch (str9.hashCode() ^ 700729847) {
                                            case -1633081929:
                                                str8 = "ۦۜۥۘۤۙ۬۠ۙۘ۟۬ۙ۟ۛۗ۬۬ۧۖۙۜۘۜۜۜ۬ۨۥۘۜۚۧۢۦۥ۫۬۠";
                                                break;
                                            case -278913491:
                                                str9 = "۬ۢۚۧۤۨۦۧۨۘۧۦۙ۫۫۬ۢۢ۫ۖ۟ۨۗۨۜۘۙۤۥۢ۠ۥۘۥ۫ۦۘۛۙۘ";
                                                break;
                                            case 1238718933:
                                                str8 = "ۜۢ۬ۛۙۜۘۨۘۦۘۢۖۛۘۚۢۢۖۤۚۛۧ۬ۙۤۘۖۖۘۚ۬ۘۘۛۧۖۘۧۢۜۢۜ۠ۤۖۜۡۚۘۡۖۨ۫ۘ۫ۚۤ";
                                                break;
                                            case 1957248347:
                                                str9 = j > C1659a.f9130f ? "ۡۛۦ۬ۡ۠۟۬ۡۤۚۤۢۨۢ۬ۙ۟ۦۜۤ۠۟ۘۘۨ۠۬ۡۥۘۘ" : "ۤۦۨۘۖ۠ۨ۫ۡۜۛۡۗۘۤۜۘ۬ۤۖ۟ۜۨۢ۫ۥۘ۟ۥۜۘۘۧۙ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1267710747:
                                    str8 = "ۦ۠ۨۗۖ۠ۖۨۚۡۡۡ۫۫۠۫ۨ۟۬ۗۜۘۤۘۡۙۧۖۘۡۢ۬ۡۧۘ۫ۤۘۢۖۡۘۡۨۥۘۖ۠۬ۗۘۦ";
                                    break;
                                case 1876342326:
                                    str = "ۤۜۦۘ۫ۛۜ۟ۨۧۥۘۚۛۧۗ۫۠ۡۘۥۥ۬ۧۡ۠ۚۗۖۡۨ۠۟ۥۢۘۚۦۘۦۙۢ۫ۢۡ۠ۜۘۙ۠ۗ";
                                    break;
                                case 2088942540:
                                    break;
                            }
                        }
                        str = "ۚۢۖۘۦۢۚۘۛۜۘۤۚۘۦۗۨۛۨۡۘ۟ۜۡۜۗۤۛۥ۠ۖۖۛۘۖ۟ۧ۫ۦ";
                        break;
                }
                return;
            }
        }
    }

    public class OooOO0O implements C3940h7.OooOO0 {
        public final ElfinFloatView OooO00o;

        public OooOO0O(ElfinFloatView elfinFloatView) {
            this.OooO00o = elfinFloatView;
        }

        @Override // p285z2.C3940h7.OooOO0
        public void OooO00o(Object obj) {
            String str = "۬ۘۧۘۜۙۜۨۖۥ۫ۛۗۨۨۛۘۧۖۡۚۜۤۛۢۗۖۜ۬۬ۗۨ۬ۜۘۧۥ";
            while (true) {
                switch ((((str.hashCode() ^ 875) ^ 2) ^ UiMessage.CommandToUi.Command_Type.SET_BACKCOLOR_VALUE) ^ (-1015578687)) {
                    case -1170595920:
                        str = "ۧۙۘۘۜۙۖۘۤۜۤۖۡۥۜۢۨۘۖۤۨۜ۠ۙۚۗۚ۠ۚۙۗۤۗۨۘۘۥۡۧۘ";
                        break;
                    case -1122569817:
                        str = "۟ۡۖۥۜۢۤۛ۫ۥۦۦۚۗۡۗۥ۫۬ۤۡ۟۬ۤۙۥۨۖۦۘ۬۟۟۟ۡۖۘۦۘۙۧۖۚۦۥۜۡۦ";
                        break;
                    case -643128124:
                        ElfinFloatView.Oooo000(this.OooO00o, false);
                        str = "ۖ۠ۚ۠ۡۧۤۛۨ۟۠ۡۙ۠ۡۘۡۗۜۙ۫۠۟ۛۥۘۜۥۚۜۡۧۦۦۡۜۨ۫ۡۡۘۤ۬ۤ۫ۚۦ۫ۚ۠";
                        break;
                    case 1476987998:
                        return;
                }
            }
        }

        @Override // p285z2.C3940h7.OooOO0
        public void OooO0O0() {
            String str = "ۡۖۛۡۡۚۘۖۖۢۤۚۧ۠ۡۘۜۖۜۘۛۗۦۘۧ۟ۚۘۤۚۙۜۡ";
            while (true) {
                switch ((((str.hashCode() ^ 429) ^ 334) ^ 936) ^ 1197066172) {
                    case -1955543357:
                        return;
                    case -1183319939:
                        str = "ۗ۫ۥۚۤۗۡۥۜۙۢۚۨۥۛۢۜۖۘۡۙۜۘۧۖۡۘۦۨۘۘۜۜۨۘ۟ۡۜۤ۟ۥۨۥۨۦ۫۟ۦۗ۬ۜۧۗۥۡۧۘۜۢۜۘ";
                        break;
                    case 1293185415:
                        ElfinFloatView.Oooo000(this.OooO00o, false);
                        str = "ۤۢ۠ۗ۟ۜۚۦۖۘۤۤ۠ۢۙۖۘۨۡۡۗۙۤ۠۫ۡۘۥۦۜۧۘۡۘۡۜۤ۬ۨ۫";
                        break;
                }
            }
        }
    }

    public class OooOOO implements ViewOnClickListenerC4272q6.OooO0O0 {
        public final ElfinFloatView OooO00o;

        public OooOOO(ElfinFloatView elfinFloatView) {
            this.OooO00o = elfinFloatView;
        }

        @Override // p285z2.ViewOnClickListenerC4272q6.OooO0O0
        public void onClick(View view) {
            String str = "ۧۨ۫ۙۖۦۘۢۖۥۢ۬۠ۜۛۘۘۘۖۜۤ۟ۘۤۡۡۛۡۖ۫ۘۥ";
            while (true) {
                switch ((((str.hashCode() ^ 236) ^ 423) ^ 639) ^ 675776762) {
                    case -2090237867:
                        this.OooO00o.OoooOoo();
                        str = "ۗۘۡۡ۬ۜۘۨۗ۠ۙۖ۫۫ۖۡۘۛۚۘۙۙۗۥ۟ۚۛۚۢۖۥۜ۫ۗۡۘ۫ۘۥۗ۫ۢۦۘ۟ۥۡۥۘۚۦۗۗۤۢ۫ۖۜۘ";
                        break;
                    case -128751464:
                        str = "ۜۡۧۘۤۛۢۤۘۜ۫ۛۡۘۗۥۦۗۨۢۨ۫ۥۘۨ۟ۘۘۗۚۖۘ۠ۧۧ";
                        break;
                    case 810398718:
                        str = "ۗۙۡۘۙ۫ۛۢۨ۫۬۟ۥۘۛۢ۫ۙۢۥۙۖۥۘۢۙۖۘۥۥۜۘۖ۫ۥ۬۟ۢۥۦ۠ۚۦ۫ۛۙۖۘۚۥۖ۠ۚۤ";
                        break;
                    case 1066063360:
                        return;
                }
            }
        }
    }

    public class OooOOO0 implements View.OnTouchListener {
        private static final int Ooooo0o = 5;
        private OooOo OoooOoO;
        private GestureDetector OoooOoo;
        public final ElfinFloatView Ooooo00;

        public class OooO00o implements DialogInterface.OnCancelListener {
            public final OooOOO0 OoooOoO;

            public OooO00o(OooOOO0 oooOOO0) {
                this.OoooOoO = oooOOO0;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                String str = "ۗ۫۟۠ۚ۬ۜ۬ۖۘۥۦۖۛ۟ۖۤۨۗۘ۠ۗۜۡ۬ۧۜۨ۬۠ۘۢۡۧۨۙۧۦۢۤۙۚۚۙ۬ۚۧۘۜۘ";
                while (true) {
                    switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.GET_ENABLED_VALUE) ^ 849) ^ 965) ^ (-1742043083)) {
                        case -1881411463:
                            str = "۫ۛۜۤۥۖۘۙۤۘۘۡۧۢۗۦۥۜۨۖۘۘۛ۟ۘۛۤۢ۬۟ۡۗۘۙۛۧ۠ۙ";
                            break;
                        case -746702854:
                            ElfinFloatView.OooOo0(this.OoooOoO.Ooooo00);
                            str = "ۙۘۧۥ۟ۙۥۧۘۘۦۧ۠ۖۛۧۧۤۢ۠ۚۜۘۘۨۡۡۡۙ۟ۚۨۗ۟ۧۨۨۙ";
                            break;
                        case -414598800:
                            return;
                        case 799690847:
                            str = "ۥۦۘۜۨۛۗۜۗۦۚۦۗۧۨۢۖۛ۠ۙۘۘ۟ۜۨۘ۟ۘۡۚۥۙ۫۠ۢ۬ۨۘۜۙۗ۬ۤۙۨۥۘۦۡۖ";
                            break;
                    }
                }
            }
        }

        public OooOOO0(ElfinFloatView elfinFloatView) {
            this.Ooooo00 = elfinFloatView;
            this.OoooOoO = new OooOo(elfinFloatView, null);
            this.OoooOoo = new GestureDetector(elfinFloatView.getContext(), this.OoooOoO);
        }

        public float OooO00o(float f, float f2, float f3, float f4) {
            String str = "ۜۡۡۘۤ۬ۦۜۙۢۡۧۦۘۜۘۘ۫ۦۜۘۥۚۥۘۜۘۜۡۛ۟ۚۤۤ";
            while (true) {
                switch ((((str.hashCode() ^ C4587yp.OooO0oO) ^ PointerIconCompat.TYPE_GRAB) ^ 754) ^ 385057922) {
                    case -2065489363:
                        str = "۫ۖ۟۟ۢۨۥۚۥ۫ۧ۫۟ۙۡۙ۠ۢ۠ۗۢۛ۫ۢ۟ۤۛۢ۠۬";
                        break;
                    case -1164677893:
                        str = "ۚۥۙۛۙۖۘۘۦۘۘۦۚۨۗۤۥۜۙۛۨۨۨ۟ۜۦۘ۫ۗۤۤۗۘ۟ۜۛۙۚۧۢۙۖۗۜۘۘ";
                        break;
                    case -975907215:
                        str = "ۢۚۦ۟ۧۙ۬ۦۨۥۥۗۛۡۨۘۜۥۘۥ۠ۡۘ۬ۛۨ۠ۘۤۘۘۥۘ";
                        break;
                    case -736527500:
                        str = "ۦۨۜۘۛۦۘ۟ۦۤۢۧۦۘۤۡۧۥۛۡۧ۟ۧۖ۬۠ۤۥۘۙۡ۠ۖۙۜۘ۠۬ۖۜ۫ۤ۟ۖۨۧۤ۫";
                        break;
                    case 537498094:
                        str = "۠ۛۥۘۚۙۙۖۡۘۖ۬ۖۘۢۥۦۘۢۜۧ۠ۚۡۗۘۛۘۚۦۘۢۜۦۘ۬ۖۜۘۥ۠ۘۛ۠ۨۛۚۘۘ۠ۥۗ۬ۦۨۜۛۤۚۚۘۘ";
                        break;
                    case 808789533:
                        return (float) Math.sqrt(Math.pow(f - f3, 2.0d) + Math.pow(f2 - f4, 2.0d));
                }
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = 0;
            int i = 0;
            ElfinFloatView elfinFloatView = null;
            ElfinFloatView elfinFloatView2 = null;
            double degrees = 0.0d;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            ElfinFloatView elfinFloatView3 = null;
            ViewOnClickListenerC4272q6 viewOnClickListenerC4272q6 = null;
            String str = "۟ۨۧۚۗۡ۬ۛۖۘۚ۬ۗۘۚۘۚۤۡۘۧۢۤۦ۫ۨۘ۠ۤ۟ۦۨۘۧۜۖۘ۫ۨۡۘۘۧۢۗۗۘۘۚ۫ۖۘۛ۫ۦۤۧۗۘۤۖۘ";
            while (true) {
                switch ((((str.hashCode() ^ 624) ^ 842) ^ 920) ^ (-745262604)) {
                    case -2021755123:
                        String str2 = "۬۬ۗۨۜ۟ۗۘۢۙۥۘۨۦۗۘۥۜ۬۬ۡۘ۬ۤۨۘۖۚۖۘۘ۬ۦۘۦۙۜۘۤۢ۫ۦ۟ۜۘۙۧۧۥ۟۫ۛۙ";
                        while (true) {
                            switch (str2.hashCode() ^ (-728623984)) {
                                case -10558551:
                                    str = "۠ۜۡۢۥ۫۫۬ۦۘۖۗۜۧۖۥۘۘۨۚۜۧۥۘۨۤ۠ۜ۠ۧ۟ۥۡۘ";
                                    continue;
                                case 118124084:
                                    str2 = "۟ۦۡۗۡۘۜۜۤ۟ۖۧۛۡۜ۫ۗۖۘ۟ۧۨۨ۫۟ۧۢۘۖۘۘ";
                                    break;
                                case 833867225:
                                    String str3 = "ۜۤۤ۬ۡۦۦۢۧۜۥۧ۟ۛ۠ۢۙۤۜۛۢۚۥۜۘۨۨۧۘۥ۬۠ۨ۠ۘۘۤ۠ۥۘۜۙ۠ۖۧۘۢۤۚۦۚ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-469680391)) {
                                            case -2087768376:
                                                str3 = "ۚۚۡۥۘۚۨۨۨۙۚۡۘ۬ۜۦۘۦۘۧۦۡۦ۫ۧۢۙۚۘ۠ۤ۠ۢۗ۟ۨۙۨۘ";
                                                break;
                                            case 258329904:
                                                str2 = "۬ۚ۬ۘ۠ۖۖۡۜۘ۟ۗۦۘۛۛۙۦۢۘۦۜۢۤۡۦۢۧۥۘۦ۟ۗۚۢۦۘ۬ۙۢ";
                                                break;
                                            case 285113035:
                                                str3 = action != 2 ? "ۖۢۥۘ۠ۨۧۘۢۚ۟ۧ۠ۘۘ۠ۗۤۙۨۨۧۙ۫ۦۤۨۘۚۤۚ۠ۤ۟ۖۡۜۚۙۙۨ۬ۧ۬ۙۡۘۢۘۦۘۧۦۘ" : "ۡۤۛۦۖۦ۬۫ۥۘۦۚۦۘۦۛۜۙۧۡۖۜۘ۠ۘۘ۟۠ۧۛۢۡۜ۬ۦۘۧۜۜۨۚۡۥۙ۫";
                                                break;
                                            case 620265035:
                                                str2 = "۫ۛۦۢ۟ۗۘۢۖ۟۫ۗۙۗۡۘ۟ۛ۟ۨۧۘۖۚۡۘ۫ۚۥۧۢ۬";
                                                break;
                                        }
                                    }
                                    break;
                                case 1361352934:
                                    str = "ۧۧ۬۠ۢۧۜۙۙ۟ۡۘ۬ۗۘۘۜۦۡ۫ۛ۫۬ۥۗۛۘۨۘۥۘۖ";
                                    continue;
                            }
                        }
                        break;
                    case -1996467605:
                    case 1150486040:
                    case 1406150110:
                        str = "۫ۚۜ۬۟ۖۢۥ۫ۚۦۘۗ۠۠ۘۘۗۢۨۜ۟ۛۜۘ۟۟۬ۤۗۗۚۧۖۘۨۛۘۘ۟۠ۘۦ۬ۛۚۤۛۛۨۘۦ۬ۡۘۢۗۢ";
                        break;
                    case -1968509042:
                        str = "۟ۜۨۨۖۥۘۖۡۗ۬ۙۘۘۙۨۛ۬ۖۤۙۗ۬۠۟ۖۘ۠ۢۨۘۢۜۧۘۛۥ۬ۢۚۖ۫ۗۦۖۙ۠ۨۛۘۘۘۧۧۖۨۥۘۨۦۜ";
                        break;
                    case -1792922550:
                        i2 = 1;
                        str = "ۙ۠ۜۘۗۘۜۘۢۜۖۘۦ۬ۜ۫۟ۢۢۖ۟۟ۦۤ۬ۢ۟۟ۜۡۢۡۧۘۤۙۨۘ۟ۛۗ";
                        break;
                    case -1634234313:
                        String str4 = "ۛۡۖ۬۟ۧۡۙۛ۠ۤ۟ۨۥۘ۠ۗۥۘۛ۠ۜ۬ۥۧۤۜ۬ۛۥۥۙۗۜۘۤۤۜۘۤۨ۬ۙۢۤۤۖۛۘۡۖۘ۫ۚ۫ۗۚۗ";
                        while (true) {
                            switch (str4.hashCode() ^ 1937759535) {
                                case -532674157:
                                    String str5 = "ۨ۟ۜۘۦۙۥۧۡۦۘ۠ۥ۠ۗۡۖۘ۠ۙۡۘ۬۟ۧ۠ۚۢۢۜۡۘۜۚۥۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ 781074649) {
                                            case -1479422505:
                                                str4 = "ۜۧۧۛۗۦۗۗۘۜۡۧۡۘ۠ۢۘۘۘ۠ۧۗۖۖۘۧۚۡۗۢۦۘۡۦ۬۬ۨ۟ۗۧۗۧۡ۟ۘ۫ۥۜۡ۬";
                                                break;
                                            case -1261045101:
                                                str4 = "۠ۗۧۖۤۡۘ۬۬ۘۘۖۡ۬ۜ۠ۨۙۧۘۨۨۛۢۙۜۘۗۗۥۘۖۛۡۘۧۚۗۚۡۙۖۜۨۜۨۡۘۡۢ۬ۙۖۜۡۦۨۨۢۖ";
                                                break;
                                            case -333888485:
                                                str5 = ElfinFloatView.OooOOOo(this.Ooooo00).getVisibility() == 8 ? "ۖۤ۟ۤۥۛۜۜ۬ۜۢۢ۬ۜۡۦۥۡۘۜۥۜۘ۬ۗۘۘۜۙۜۗۙ۠ۨ۫۫ۨۘۧۚۦ۟ۖۡۘۡ۬ۤۛۢۨۘۥۥ۬ۜ۬ۖ" : "ۚۨۛۦۦۥۘۤۙۨۖۥ۬ۛ۟ۡۘۡۛۥۛۧۘۘۘ۟ۖۘ۬ۜۚ۫ۡۤۨۙۖ۟ۚۜۧۖۛۖۢ۫";
                                                break;
                                            case 1599087005:
                                                str5 = "ۗۤۦۚۙۘۘۤۢۖۧ۟ۘۘ۬ۨۡۦۗۧ۬ۘۛۥۦۦۦ۠ۗ۬ۢۤ۫ۚۘۨۡۘۨ۟۠۫ۧۜۨۡۘۘۦ۫ۥ";
                                                break;
                                        }
                                    }
                                    break;
                                case -515609802:
                                    str4 = "ۤ۬ۙۘۛۧ۟ۢ۫۠۟۟ۛ۫ۘۘۛۗ۟ۗۜۤۡۤۜۤۛۡۡۚۥۘۡۧۘۧۦۛۘ۫۟ۥۗۧۙۛۚ۬۬ۜۥۚۤۢۘۘ";
                                    break;
                                case -338400828:
                                    str = "ۥۘۡۢۢ۫ۦۨۧۘ۟ۧۢۙۜۡ۫۠۠۠ۨۢ۠ۢۨۘۜۜۨۘۨۡۗۖۢۦۘۧۤۨۘ۠ۚۜۨۨۘۘۖۙۥۘۦۗۗ";
                                    continue;
                                case 1148808241:
                                    str = "ۦۡۛۜۧ۠۟ۦۢۦۘۛۘۛۗ۠ۥۡۘۥ۫ۚ۬ۜۡۙۦۘۤۥۙ";
                                    continue;
                            }
                        }
                        break;
                    case -1534851836:
                        String str6 = "ۜ۠۫ۢۘۤۘۗۤۗۗ۫ۧۛ۠ۗۨ۬۬ۗۜۧۥۘۨۜۧۘۥۘۨۡۨۜۘۗۚۨۘۧۘۛ۫۬ۖ۫ۧ۬۟ۘۚۥۛ۫ۤۡۘ";
                        while (true) {
                            switch (str6.hashCode() ^ (-530057752)) {
                                case -1748912927:
                                    str = "ۖۖۥۛۚ۫ۚ۬ۨۘ۠ۦۨۧۦۨۘۦۢۡۧ۠ۘۘۙۤۖۨۘۗ۠ۥ۬ۜۢۦۘۚ۬ۧ۠ۘۜۨۙۗ";
                                    continue;
                                case -337230157:
                                    str = "ۖۖۧۘ۟ۦ۟ۛۢۘۘۡۜۧۘۖۗۘۘۖ۬ۘۘۙ۟ۧ۫ۛۖۘۗۖۤۡ۟ۘۘ۬ۗۧۡۤۜۘۨۜۘۘۙۤۜۘۜۥۚۢۘۘۘۙۥۥۘ۬ۤ۟";
                                    continue;
                                case 1732252281:
                                    str6 = "ۧ۫۬ۡۖۛۥۗۥۘۜۛۛۨۘۧ۫ۡۖۘۖۛ۟ۗۨ۫۠ۨۙۧۢۥۘۖۚۨۢۨۘۘۧۥۙۡۜۨۖۤۦۧۛۢ";
                                    break;
                                case 2140581739:
                                    String str7 = "ۚۘۥۘ۟ۛۜۘ۠ۦۦۘۥۥۙۡۥۡ۟۫ۘ۟ۛۖۘۗۘۖۘۥۨۖۘۘۧۘ";
                                    while (true) {
                                        switch (str7.hashCode() ^ 1166439847) {
                                            case -1104411136:
                                                str7 = "ۗۙ۠ۨۥۨۘۗۗۗ۬ۜۨۘۙ۟۠۟ۦۦۘۧ۫ۡۘۧۙۖ۫ۦۘۘۤۗۦ";
                                                break;
                                            case 61008753:
                                                str6 = "ۘۗۖۘ۟ۜ۬ۦۘۧ۠ۢۖۘۖۤۥۘۡۘۗ۟ۖۧۚ۬ۜۘۛۨۘۥۙ۬ۙۘۜۡۙۗۤۥۨۘۢ۫ۜۨۨۚۙۜۘۘۢۡۨۘۦ۬ۚ";
                                                break;
                                            case 795713211:
                                                str7 = ElfinFloatView.OooOOo(this.Ooooo00) ? "ۤۨۥۘۥ۠ۖ۫ۤۖۨۘۤۘۖۘ۬ۢۥۨۖۦۢۛۜۡۨ۟۟ۧ۬" : "۬ۡۤۧۨۚۚۥۦۘۧۜ۫۟۫۫ۘۙۨۚۡ۠۟ۦۢۤۚۡ۟۟ۜۗۦۦۦۨۢۨۨۖ۫ۛۦ۬۟۫ۛۜۥۨ۟۠ۡ";
                                                break;
                                            case 1013136400:
                                                str6 = "ۡۛۙۛۗۚۘۧۘۙۛۤۡۨۗ۬ۛۨۘۜۜۘۘۨۢۦۦۦۘۖۙۥۘۦۙۛ۠ۚۥۘۛۖۘۘۧۘۥۘ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case -1487747636:
                        String str8 = "ۙۛ۠ۘۙۖۘۡۦۘۡۙ۟ۘۘۘۘۥ۟ۖۘۤۘۧ۫ۜ۬ۘۢۚۘۨۥۘۘ۬ۖۥۖ۬ۘ۠ۙۛۘۙۧۥۘۢ۫۟";
                        while (true) {
                            switch (str8.hashCode() ^ (-1187047489)) {
                                case -293918929:
                                    str = "ۤۛۜۧۦۜۘۛ۟ۤۗۙۨۜۥ۬ۛ۬ۨۘۙ۫ۖ۬ۨۘۖۨۨۘ۠ۧۖۘۨۦۗۖ۠ۜۘۛ۫ۖۡ۫ۨۘۨۘۛۗۘۜۘۚۢۨۤۛۖۘ";
                                    continue;
                                case 596229282:
                                    str = "ۙۖۜۙ۬ۚۧ۠ۛ۠ۘۢ۟۫ۦۧ۠ۗۚۙ۫ۦۖۡۘۧۤ۫۬۬ۦۘ۠ۚۙۙ۫ۥۘۨۦۢۢ۟۬ۤۦ۫ۙۥۥ";
                                    continue;
                                case 907925108:
                                    str8 = "ۛۥ۠۫ۧۦۛۚۨۘ۠ۛ۬۠ۚ۬ۚۥۗ۫ۛ۠ۨۡۚۜۡۗۡ۟ۖۘ۬ۥۤۛۡ۠۫ۤۜۘ";
                                    break;
                                case 912155877:
                                    String str9 = "ۖۙۤۧۜۖۡ۬ۨۘۦۧۡۨۜ۫ۛ۟۟ۥۗۨۨۨۜۛۖ۟۠ۘۘ";
                                    while (true) {
                                        switch (str9.hashCode() ^ (-1097092252)) {
                                            case -1278110907:
                                                str9 = "۬ۧ۟۬۟۟ۙۦۘۙۧۙۖۜۧۘۖۢۢۥ۬ۨ۫۠ۘ۠ۡۧۙۨ۫ۗۗ۠ۖۘۘۧۚۥۘۜۡۤۤ۟۫ۥۖۘ";
                                                break;
                                            case -706226545:
                                                str9 = ElfinFloatView.OooOoo0(this.Ooooo00).getVisibility() == 0 ? "ۙ۠۬ۙۡۧۗۦۘۚۜۜۙۨۢۢۡ۠ۤۦۙۤ۫ۡ۠ۧۘۘۨۢۖۘۥۘۥ۫ۢۦۘۡۧۖۘۗۦۘۘۧۥۥۘۥۗۗ" : "ۜ۟ۜۘۢۦۡۛ۫ۡۡۡۥۢۢۧۨ۠ۜ۬ۛۜۙۖۛ۬ۘۖۘۤۨۧۘ۬ۨۡۘ۫ۤۛ۬ۙۘۜۧۤ";
                                                break;
                                            case -187117506:
                                                str8 = "ۖ۬۫ۚۗۦۢۦۗۛۢۦۢۜۥۖۨۘ۟ۤۖۘۦ۟ۜۨۥۧۥۤۜۘۜۙۖۘۡۛۜۘۡۥۡۛۧۖۘۖۨ۫ۧۦۧۨۡۡۧۛ۫";
                                                break;
                                            case 1564060815:
                                                str8 = "ۛۢ۟ۤ۠ۢۛۢۧۗۦۛۨۜۘ۟ۥۜۦۨ۠ۡۢۖۘۖۢۛۙۙۥ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case -1477308597:
                        break;
                    case -1463518143:
                        str = "ۡۘ۟۫ۥ۬ۨۙۖۤ۫ۨۘۚۨ۟۠ۥۛۗ۟ۧۖ۠ۤۛۘۘۢۙۥۜۨ۠ۡۗۖ۫ۦ۬۫ۗۤ";
                        break;
                    case -1398368072:
                        elfinFloatView3.OooooOO((int) (ElfinFloatView.OooO0OO(elfinFloatView3) - ElfinFloatView.OooO0oO(this.Ooooo00)), (int) (ElfinFloatView.OooO0o0(this.Ooooo00) - ElfinFloatView.OooO(this.Ooooo00)));
                        str = "ۜۚۧۢۖ۠۠ۤۘۡۤۡۘ۫ۢۙۢ۟ۤۚ۠ۚۚۖۚ۫ۙۥۥۖۘۗۛۥۘۜۨ۠ۤ۠ۜۛۥۘ";
                        break;
                    case -1319410124:
                        elfinFloatView2 = this.Ooooo00;
                        str = "۠ۜۧ۟ۜۖۦ۬ۦۘۖۙۖۘ۟۬ۜۘۗۚۗۖۢ۠ۥۥۡۤۗ۬ۚۘۜۘ۬ۘ۫ۙۦ۟ۖۤۖۢۡ۠ۛۘۥۜۜ";
                        break;
                    case -1300703088:
                        break;
                    case -1189915987:
                        String str10 = "ۜ۟ۘۘۜۖۡۘۨۚۚۖۨۜۘۛ۠ۡ۫۫ۗۦۗۥۘ۫ۜۘۗۦۖۘۖۥۨۘۗۘۚۦۧۘۘۛۤ۠ۥۚۨۘۘۨۤۖۙۙۧۧ۠۠ۜۚ";
                        while (true) {
                            switch (str10.hashCode() ^ 487913121) {
                                case -1211006162:
                                    str = "ۡۚۥۙۗۡۙۤۗۚۡۡۘۘ۫ۤۛۦۜ۬ۘۖۘۥ۫ۥۡۗۜۘۘۜۥۤۤۤۢۡ۟ۖۚۨ۟ۜۘۨ۫ۛۘ۬";
                                    continue;
                                case -16474352:
                                    str10 = "۠ۘۧۘ۠۫ۡۙۛۙۛۚ۟ۦۦۧۧۧۘۙۗۜۛ۟ۜۘۘۗۛۨۙۡ۬ۘۧۘ۟ۖۥۘۚۦۧۘ";
                                    break;
                                case 394831193:
                                    String str11 = "ۗۘۦۘۡۡۚۜۧۦۜۥ۠۬ۙۦۜۘ۬۬ۨۨۘۜۢۡۘۧ۬ۚۘۧۡۘ";
                                    while (true) {
                                        switch (str11.hashCode() ^ (-1108255749)) {
                                            case -2065882142:
                                                str10 = "ۡۛۖۧۡۨۘۚۗۖۘۗۧۡۘۡۜۥۜۦۘۘ۠۬۟ۖۤۢۜۘۘۜۧ۬ۦ۟ۡۚۛۦۘۚۡۦۘۨۘۧ";
                                                break;
                                            case 186934459:
                                                str10 = "۟ۧۖۘۚۘ۫ۘۗۚۤۗ۠۬ۦۜۜۛۥۧۜ۬۫۟۫ۨۙۢۗ۫۫ۤ۬ۢۨۡۥۨۘۗۗۜۘ";
                                                break;
                                            case 1214534019:
                                                str11 = degrees <= -120.0d ? "ۛ۫ۨۜۚۙۥ۠ۖ۫ۚۦۥۚۙۛۧۚۘۘۚۨ۬ۢۥۧۘۙ" : "۟ۤۜۚ۬ۙ۟ۚۙۖۜۜۙۚۘ۟ۨ۠ۖۥۗ۠ۨۧۚۥۡۖ۟";
                                                break;
                                            case 1675541291:
                                                str11 = "ۘ۬ۦۘۙۗۛ۠ۨۢۦۛۦۘۜۛۦۦ۠ۛ۫ۤۘۙۛۗۦ۠ۨۗ۫ۡ";
                                                break;
                                        }
                                    }
                                    break;
                                case 397490108:
                                    str = "ۡۤۖۘ۬ۤۨ۠ۙۗۦۖ۟ۚۤۘۤۜۘ۫ۢۦۡۚۡۘۧ۬ۨۘۥۢ۟";
                                    continue;
                            }
                        }
                        break;
                    case -1097334288:
                        String str12 = "ۦۘۜۘۢۗۢ۟ۘۥ۫ۡۡۘۛۜ۬ۡۜۚۗ۫ۥ۫ۜۛۧۙۧۙۚۘۘۚۜۙۚۧۛۡۤۢۨۨۚۚۡۨ۫ۗۤۦۢۧۗۥ۠";
                        while (true) {
                            switch (str12.hashCode() ^ (-820900067)) {
                                case -1988268766:
                                    String str13 = "ۜۘ۠ۤۜۘۗۛۙۡۛ۟ۦۡ۫۫۟۟ۥۤۡۘ۠ۥۘۡۚۘۧۚۦ۟ۤۨۘۜۤۡۘۦۙۛۗۜۨۘۡ۬ۜۘۧۡ";
                                    while (true) {
                                        switch (str13.hashCode() ^ 1609846821) {
                                            case -1290386880:
                                                str12 = "ۡۘۢۨۧۚۘۛۚۢ۬ۡۦۤۖۘۤۧ۟۟۠ۖۘۜۡۢۦ۟ۦۖۚ";
                                                break;
                                            case -1254761992:
                                                str13 = "ۜ۫ۦۘ۬۬ۦۢۜۘۘۧۧۤۢۚ۬ۜ۠۫۫ۛۥۘۧۙۛ۟ۥۘۘۨۧۘ";
                                                break;
                                            case -970471469:
                                                str12 = "ۥ۠ۚۨۚۗ۬۟۬۠ۖ۬ۤۘۦۘۘ۟ۨۘ۫۟ۜۙۧۨۗۧۖ۫ۥۜۨۢ۟۫ۗۨۘ۠ۚۨۘۢۡۖ۠ۙۨۥۖۙ";
                                                break;
                                            case -709114139:
                                                str13 = degrees > -120.0d ? "ۤۖۗۢۥ۬ۘ۠ۥۘۛۤۚۨۚۡۘۢۘۦۙۘۜۘۧۡ۠ۖۢۘۚۦۜۘۥۜۡۘۡۤۢۥۜۡۘ۫ۢ۫ۙۜۜ۠ۨۙ۠ۢۘۚ۬" : "ۡۘۘ۠ۛ۠ۛۧۘۘۧۜ۬ۢ۠ۥۡۖۦۘ۟ۗ۬ۗۙۜۘ۫ۤۛۧۛ۬ۙۦۡۤ۟ۚ۠۠ۛ۬ۥۘۗۖۘۘۘۛۜۘۤۧۨۘۢۥۦۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case -1755593970:
                                    break;
                                case -1184113730:
                                    str12 = "ۗۖۙۛۙۙ۠ۢۘۘۥۨۥۛۤۦۦۨۙ۟۬۬ۢۧۛۨ۫ۗ۠ۛۤۗۙ۬۫ۥۡۜۧۡۧۢۜۘ۠ۗۚۗ۠ۙۚ۟۠ۡۗۘ";
                                    break;
                                case 1486683650:
                                    str = "ۡۤۖۘ۬ۤۨ۠ۙۗۦۖ۟ۚۤۘۤۜۘ۫ۢۦۡۚۡۘۧ۬ۨۘۥۢ۟";
                                    break;
                            }
                        }
                        str = "ۗۚۨۘ۫ۤۖۧۨۛۙۥۗۛۛۖۘۡۦ۠ۘۘ۫ۨۜۖۘۤۙۦۘۙۚۨ";
                        break;
                    case -1065018303:
                        ElfinFloatView.OooO0O0(this.Ooooo00);
                        str = "۠ۥۤ۠۫ۨۘۡۛۨۡۨۜۧ۬ۛۚۖۡۘۨۗ۫ۖۨۢۡۡ۟ۥۧۙۨۡ۫ۡۗ۬ۡۡۙۚ۠ۘۜۥۗۥۡۨ";
                        break;
                    case -952909650:
                        elfinFloatView3 = this.Ooooo00;
                        str = "ۥ۠ۖۘۦۛۡۘۧۘ۠۬ۛۤ۬ۡۘ۫ۛ۟ۥۥ۫ۖۤۖۘۛ۟ۗ۬ۚۦۘ۟ۘۦۘۜۡۧۡۜۘ۫۠";
                        break;
                    case -949448797:
                        String str14 = "ۦ۫۟ۦۦۦۘۚۤۧۛۢۡۙۗۛۧ۫ۛۘۘۜۘۛۦۡۘۛ۬ۤ۠۟۬ۘۡۘۘ۬ۘۘۖۗۖۘۨ۬ۤۖ۫ۢۦ۫ۖۧ۫ۥ۟ۖ";
                        while (true) {
                            switch (str14.hashCode() ^ 1981750554) {
                                case -1349427700:
                                    str14 = "ۚۖ۫ۚۧۜۘ۟۬ۖۨۙۜۘۢۘ۫ۗۘۢۗۧۛ۠۠ۦۘۤۜ۬ۨ۬ۘ۫ۛۨۙۤۥۘۥۜۛ۠ۡۘ۫ۙۚۡ۬ۦۘۚ۠ۘۘۤۙ";
                                    break;
                                case 526775467:
                                    str = "ۡۚۥۙۗۡۙۤۗۚۡۡۘۘ۫ۤۛۦۜ۬ۘۖۘۥ۫ۥۡۗۜۘۘۜۥۤۤۤۢۡ۟ۖۚۨ۟ۜۘۨ۫ۛۘ۬";
                                    continue;
                                case 594969300:
                                    str = "ۧۥ۬ۘۖۙ۫۬ۦۤۛۚۜۛ۟ۚۤۥۘۗۥۜۘۘۦۙۘ۠۫۫ۜ۟ۙۚۙۗ۟ۡ";
                                    continue;
                                case 2134963941:
                                    String str15 = "ۦۛ۬ۨۚۖۘۗۖۖۘۘۖۙۛۦۤ۫ۦۘۤۥ۫۟ۢ۫ۚۤۘۨۜۜۘۥۖۥ۬۠ۜۧۡ۬ۨۦۥۛۧۨ۫ۗۡ";
                                    while (true) {
                                        switch (str15.hashCode() ^ 1728671554) {
                                            case -1169104498:
                                                str14 = "ۚۚۡ۠ۛۡۚۧ۫ۥۥۙۦ۬ۖۘۚۘۘۗۜۤۤ۠ۥۘۖۖۘۡۥۦۘۜۧۡۥ۠ۦۘ";
                                                break;
                                            case -65298611:
                                                str15 = degrees < 120.0d ? "ۜۧ۬ۛۘۥۘ۫ۡۧۤۗ۟ۗۛ۠ۦۘ۬ۘۙ۠ۧ۬ۨۤۖۦۗۘۖۤۢۖۘ۟۠ۡۤۥۘۛۖۜۧۧ۬ۢۛ۠ۛۤۙۡ" : "ۛۨۛۥۦ۠۟ۢۖۥۙ۫ۗ۬ۘۤۘۧۘۧۛۖۘۨۘۦۘۗۤۙۦۚۡ";
                                                break;
                                            case 369653029:
                                                str15 = "ۧۡۜۘۧۨۧۘ۬ۚۡۦۦۙ۟ۘۜۘ۠ۤۡۜ۠ۜۜ۫ۛۖۛ۬ۥۖۗۛۡۨۡۡ۫ۙۦ۬۬ۤۡۚۙۖۘۡۗۘۧۥۢ۫ۗۥۘ";
                                                break;
                                            case 416760576:
                                                str14 = "ۨ۫۫ۜۙۙۦۦۤۨۙۙۥۡۙۘۦ۬ۙۧۡۛۧۗ۠ۥۡۧۖۨۘۜۢ۬ۙ۬ۦۤۗ۠";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case -886623936:
                        viewOnClickListenerC4272q6.setOnCancelListener(new OooO00o(this));
                        str = "ۡۙۤۜۨۧۘۥۤۖۘۦۧ۟ۗۧۗۛ۬ۜۘۚۚۨۨ۠ۡۛۜۙۘ۬ۜۘ۠ۡۦۘۘۚۖۥۗۢ۬ۨۛۙۚۛۛۜ";
                        break;
                    case -865654602:
                        ElfinFloatView.OooO0o(this.Ooooo00, motionEvent.getRawY() - C4491w3.OooOooO(this.Ooooo00.getContext()));
                        str = "ۙۡ۟ۖۢۘۡۥۜۘ۠ۥۖۘۚۙۗۜۜۨۚۥۖۘ۟ۢۥۖۨۧۘۗۡۨۡۖۤ۠ۙۗۢ۫ۢۘ۠ۙ";
                        break;
                    case -823218244:
                        viewOnClickListenerC4272q6 = new ViewOnClickListenerC4272q6(this.Ooooo00.getContext());
                        str = "ۗۨۘۙۡ۟ۜۡۜۘۢۜۤۡۥ۠ۦۗۙ۟ۛۦۛ۬ۘۘۙۤۛۥۗۥۘ";
                        break;
                    case -742107337:
                        ElfinFloatView.OooOO0o(elfinFloatView, ElfinFloatView.OooO0OO(elfinFloatView));
                        str = "ۦۦۛۖ۠ۢۦۙ۟۠ۨۡۛۨۗۡ۟۬۬ۖۢ۫ۗۚۧۧ۬ۢۧۚ۬ۦۗۥۥ۠ۜ۫ۖۘۧ۟ۛ";
                        break;
                    case -627314254:
                        str = "ۧۖۙۚۗۨۜۨۧۧۦ۫ۥۥۤۨۘۢ۟ۨۜۘ۟۟ۨۧ۫ۘۘۙ۬ۨۘ۫ۡۚۦ۬ۗۦۘۗۖۙۖ۟۠ۦۗۚ۬ۜ۬ۗۡۜۘ";
                        break;
                    case -623617039:
                        ElfinFloatView.OooOOOo(this.Ooooo00).OooO0o();
                        str = "ۡۤ۫۟ۘ۠ۨۢۢۚۨۜۘۧۢ۠ۜۜۨۘۙۘۗۖ۠ۛۖۨۥۘۖ۫";
                        break;
                    case -613367686:
                        ElfinFloatView.OooOOOo(this.Ooooo00).OooO0o0();
                        str = "ۢۖ۫ۧۘۡۘ۫ۤۦۡۡۡۘۘ۬ۜۘۙۦۧۘۖۖۙ۠ۖۡۘۜ۫ۡ۟ۛۨۘۡ۬ۚۖۜۘۗ۠ۘۘۡۤۘ۬ۤۡۘۨۨ۠";
                        break;
                    case -591493948:
                        viewOnClickListenerC4272q6.show();
                        str = "ۦۨۘ۠ۙۥ۟۟ۢۦۜۥۘۥۜۨۘۛۦۜۘۗۢ۫ۤۜۘ۟ۤ۬۬ۥۦۘۗۤۦۡۙۡۖ۟ۖۖ";
                        break;
                    case -476967602:
                        ElfinFloatView.OooO0Oo(this.Ooooo00, motionEvent.getRawX());
                        str = "۟ۜۢۜۖۦۘۘۛۨۘۦ۬ۙۨۡۡۘۦۜۚۜۙۦۘۙۡۛۤۡۥۤۘ";
                        break;
                    case -437434980:
                        ElfinFloatView.OooOOOO(this.Ooooo00, i5);
                        str = "ۢۦۗۤۛۙۤۘۜ۟ۡۦۡۖۥۘۗۛۙ۟ۗۡۘۖ۫ۘۥۚۡۘۥۥۚ۟۬ۢۘۥۚۙ۫۫۬ۧۧۗۛۘۘۨۥۗ۬۬ۚۥۙۗ";
                        break;
                    case -345434122:
                        ElfinFloatView.OooOooO(this.Ooooo00).start();
                        str = "ۨۗۤۧۚۜۘۧۚۖۗ۟ۥۘ۬۬ۜۘ۟ۨۦۥ۫ۚ۠ۦۥۚۖۡۘۥۗۡۘ";
                        break;
                    case -328145678:
                        String str16 = "ۥۜۧۥ۬ۧۢ۫ۜۧۘۘ۟ۜۨۥۛۦۘ۫ۖۧۙ۬ۡۙ۬ۚۨۘۘۛۖۡۘۤۚ۠";
                        while (true) {
                            switch (str16.hashCode() ^ (-609910425)) {
                                case -712546352:
                                    str16 = "ۗۤۚۘۨۜۡۛۥ۠ۜ۟۟ۧۧۡۚۜۨۗۘۡۤۡۘۡۘۧۘۥۥ۟ۦۚۚۘۙۦۘ";
                                    break;
                                case 126193037:
                                    str = "ۨۡ۠۫ۙۨۨۙۘۛ۠ۗۧۦۧۘۤۜۧۘۗ۠۠ۧۢ۬ۖۘۨۘۖۚ";
                                    continue;
                                case 1171251417:
                                    str = "ۢ۬ۨۘ۬۟ۥۚۡۦۘۧ۠ۥۚۖۖۘۗۤۦۘ۠ۦۡۥۖۨۘۗۡۘ۠ۛۦۘ";
                                    continue;
                                case 1432586385:
                                    String str17 = "ۘۜۥۘۖۧۛۡۧۛۚۜۤۛۥۡۘۤۛ۠ۤۥۤۜۧۜۘۗ۬ۖۖۚ۬ۗۘۘ۟ۥۖۚۙ۬ۘ۫ۖۘۛۥۡۚ۠ۙۨ۬ۨ۫ۘۘ";
                                    while (true) {
                                        switch (str17.hashCode() ^ (-388478315)) {
                                            case -248404074:
                                                str17 = action != 0 ? "ۙۚ۟ۦ۠ۤۨۥۥۨۧۦ۫ۘۘۚۤۥ۟۠۟ۗۙۡۧۙۢۚۖ۟۬ۜۦۡۙۢۚۤ۟ۡۢۜۦۨۧۤۙۘۛۧۛۙۡۧۘ" : "۬ۢۧۖۥۜۘۤۡۛۙۦۢۧۖۖۘۨۨ۬۫ۧۡۚۦۖۘۜۙۛۚۖۤۧۜۤ۠۟ۥۘۘۧۚۘ۟ۙۜۚ۫ۙۡۖۢۛۦۜۥۘ";
                                                break;
                                            case -93233654:
                                                str16 = "ۤۧ۫۠ۛ۟۫ۢ۫ۢۙۖۗۢۦۢۡۛۧ۠ۡ۫۬ۢۛ۟ۨۚۖۗۨۙ۫ۤۙ۠ۙۚۥۡۦۡۘ";
                                                break;
                                            case 106823203:
                                                str16 = "ۡۜۧۘ۫ۤۦ۬ۘۛۤۙۖۘۢۧۚ۫ۢۘ۬ۤۨۚۗۚۜۙ۟ۧۘۨ۬۫ۜۧۧۖۚۘۘۨ۠ۘۨۢ۫ۙۘۥۜۛۨۘۡۘ۫";
                                                break;
                                            case 2100207316:
                                                str17 = "۟ۤۨ۟ۡۢۢۜۨۘ۠ۥۨۜۖۦۧۥۙ۟ۥۤۢۙۜۨۦۥۘۥۜۡ۫ۧۜۘۘۨۡۨ۠ۡۘۘۥۧۘ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case -233087765:
                        viewOnClickListenerC4272q6.OooO0o(ElfinFloatView.OooOo00(this.Ooooo00));
                        str = "ۨۗۡۘۙۡ۫ۦۗۖۙۡۘۘۧۢۜۘ۬ۗ۠ۤ۫ۥۦۨۧۖۜ۟۠۠۟ۘ۫ۦۘۨۦ۬۫ۥۘۘ۬ۚۘۘ";
                        break;
                    case -140332288:
                        String str18 = "ۦۨ۟ۢۢۨۘۧۢۦۘ۬ۨ۠ۚۚۥۘ۫ۡۦۢۜۤۦۛ۟۠ۜ۬۠۫۟۫ۗۦۡ۫ۙۘۨۢۢۙۜۨۗۨۘۦۤۜ";
                        while (true) {
                            switch (str18.hashCode() ^ (-1489316252)) {
                                case -1706166796:
                                    str18 = "ۥۧۖۨۜۘۘ۟ۦۡۘۤۦۡۘۢۙۤ۬ۨۖۖۡۖۦۨۥۘۥۘۛۙۗ۬ۤ۬ۗۥۨۤۛۢۤۨۜۘۙۡ۫۠ۥۜۘۜۨۘۖۧۤ";
                                    break;
                                case -1076158692:
                                    str = "۟ۤۙ۬۬ۘۗۥۜۙۡ۫ۙ۟۠ۘۜ۠۟۫ۢ۟ۗۤۦۦۥۘ۬ۧۡۥۥۖۘۦ۫ۦۛ۫ۖۘۨۧۨ";
                                    continue;
                                case -823461724:
                                    String str19 = "۟ۤۘۘ۫ۖ۬ۖ۟ۗۥۛۘۘۙۖۥۘۦۗۘۘۚۘۨۡ۬ۥ۫۫ۤۚ۟ۙ";
                                    while (true) {
                                        switch (str19.hashCode() ^ 87295947) {
                                            case -1356232894:
                                                str19 = ElfinFloatView.OooOoo0(this.Ooooo00).getVisibility() == 8 ? "ۜۛۚۜۡ۫ۙ۟ۨۘۤۜۨ۫ۡ۫۟ۖۨۚۛۡۘۚۖۜۘۖۦۘ۠ۖ" : "ۘۡۖۘۚۗۜۘۡ۫۠ۛ۟ۗۦۤۦۘۖۧۡۘۛ۬ۜ۟ۦۥۘ۫ۚۡۘۚۛۖۤۤۗۗۤۤۚ۠ۖ۬ۧۥۖ۫ۤۜۥ";
                                                break;
                                            case -1337511224:
                                                str19 = "ۗۤ۫ۚۨۛ۠۫ۖۧۗۙۡۙۘۚۨۛۤۧ۫ۛۤۙۙۤۘۚ۫ۢ۟ۜۙۧۙ";
                                                break;
                                            case -558442845:
                                                str18 = "۟ۢۢۡۗ۟ۧ۫ۥۘۘ۟ۖۘۗۦۙۧۤۚۦۜۘۤۢ۠ۖۢ۬ۧ۟ۦۘۡۨۘۡۚۘۘۗۥۜۘ۠ۤۙۚۖۡۙۘۦ";
                                                break;
                                            case 1632769520:
                                                str18 = "ۨۦۡۙۦۡۘۘ۫ۗۗۦۚۙۜۖۛۖ۠ۛۦ۬ۨ۠ۧۗۛۢۦۛۙۧ۠ۜ۠ۢۛۖۖۘۘ۫ۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 244258547:
                                    str = "ۥ۟ۨۘۢۖۛۙۥۧ۬ۦۥۚ۫ۨۢۡ۬ۥۚۡۘۗۗۥۘۢۛۡۘ۬ۗۘۨۧۢۥ۠۟ۥۥۘۤ۬ۥۘ۫ۗ۟ۖۛۢۨۢۛۗۙۤ";
                                    continue;
                            }
                        }
                        break;
                    case -100003591:
                        ElfinFloatView.OooO0Oo(this.Ooooo00, motionEvent.getRawX());
                        str = "۠ۜۨۘ۟ۛ۟ۧۛۛۤۦۜۥۛۦۡۨۥۘۤۡۥۘ۠ۖ۬ۦۡۢۙۗۡۡۖۢ";
                        break;
                    case -72556235:
                        String str20 = "ۤۛۜۘۦۧۖۘۦ۟ۤۡۖۥۘۙۛۘۘۙۙۜۘ۫ۡۦۘۛۡۥۘ۠ۨۖۘۤۛۜۘۤۤۜۛۨۥۘۡۢ۬ۨۥۦۥۘۢۢ";
                        while (true) {
                            switch (str20.hashCode() ^ 628438627) {
                                case -1377077563:
                                    str20 = "ۗ۠۫ۗۘۨۖۖ۠ۜۥۡۘ۬ۙ۫ۦۤۦۘۘۗۜۘ۬ۖۖۚۤۜۢۜۘ";
                                    break;
                                case 490383591:
                                    break;
                                case 1164268087:
                                    String str21 = "ۖۗۤۗۚۦۘۧۚۜ۟ۖ۬ۖۧ۟ۗۨۜۘۘۨۘۤۡۙۡ۟ۜۜ۬ۧۦۨۗۗۘ۠۬ۦۦ۟ۜۘ۠ۜ۠ۦۚۡۘۢ۟ۤ۬ۡ۫";
                                    while (true) {
                                        switch (str21.hashCode() ^ 540626828) {
                                            case -238892177:
                                                str20 = "۫۠ۜۘ۠ۧۙۢۤۦۘۖۜۙۛ۠ۢۖ۬ۜۛۗۡ۬ۨ۠ۥۥ۬ۦۛۙۛ۟ۗۧۜۜۗ۬۫ۡۛۡۜۙۡۡ۠ۦ";
                                                break;
                                            case -100947379:
                                                str21 = degrees < 120.0d ? "ۖ۠ۙۧۦ۫ۗ۫ۗ۬ۚۥۛۗۚۚۡ۟ۘۡۨۘۢۖۘۘ۫ۙۜۖۤۖ۠ۘ۠ۚۗۢ" : "ۚ۬۠ۤۛۘ۫ۗۜۘۦۨۖۜۡۘۗۢۥۤۦۦۘۥۗۦۘۗۖۡ۠ۛ۬ۨۦۦۜۤۢ";
                                                break;
                                            case 241473763:
                                                str21 = "ۤ۬۫ۡۜ۟۫۟ۧ۠ۦۘۧ۠ۛۤۘۥO۟۟ۘۤۢۦۙۙۦۡۧ۠ۥ۫ۥۖۨ۟ۙۜۘ";
                                                break;
                                            case 292051413:
                                                str20 = "ۧۢۥۡۚۜۨۦۖۘۥۖۦۘۘۛۥۥ۠ۥۖۘۙۡ۫ۢۜۖۘۗۧ۠ۥۨۧۘۧۤۜۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1615022601:
                                    str = "ۖۘۧۘۚۤۥۘۖۧۡۘۤۘۖۨۘۢۢۙ۬ۤۡ۬ۡ۠ۛۗۤۜۘۚۢ۫ۗ۫۬ۧ۫۬";
                                    break;
                            }
                        }
                        str = "ۚۛ۠۠ۙۧۚۛۥۜ۟ۛ۬۫ۧۢ۫ۙ۬ۖۜۘۘ۫۟۬ۥۡۘ۟ۘۤ۬ۖۧۘ۫ۚۖ۠۫ۢۚۨ۟ۧۧ۬ۗۗۡۘ۟۬ۨۗۜۦۘ";
                        break;
                    case 236585437:
                        str = "ۖۤۜۛۜ۫۫ۚۡۦۨۧۘ۬ۨ۟ۦ۫ۜۘۨۘۡۘۤ۫ۨۥۖۢۢۥۦۙۚۤۢۨۦ۠ۢۧۨۘۙۗۢۤۨ۟ۗ";
                        i5 = i;
                        break;
                    case 423288517:
                        str = "ۡۤ۫۟ۘ۠ۨۢۢۚۨۜۘۧۢ۠ۜۜۨۘۙۘۗۖ۠ۛۖۨۥۘۖ۫";
                        break;
                    case 442965035:
                        ElfinFloatView.OooO0o(this.Ooooo00, motionEvent.getRawY() - C4491w3.OooOooO(this.Ooooo00.getContext()));
                        str = "ۢۗۨۖۖۜۖ۠۟ۧۖۘ۬۠ۘۘۢ۬۟ۗۡ۬ۜۧۚ۠ۘۧۨ۟ۘۜۤۦۗۘۡۥۙ۟ۦۗۨۖۢۨۧۨ۟ۖ۫ۚ";
                        break;
                    case 697644404:
                        ElfinFloatView.OooOOOo(this.Ooooo00).setVisibility(8);
                        str = "ۘ۟ۗۖۧۖ۟ۛۤۛۚۦۗ۟۬ۦۦۦۧۦۥۖۡ۟ۛۦۘۦۥۥۛ۟ۨۦ۟۠";
                        break;
                    case 789682675:
                        str = "ۙۤۜۘۘۗۨۜۥۙ۬۫ۡۘ۬ۧۛۜۘۥۗۗۦۘۧۛۚ۫ۢ۠۟ۙ۫ۚ۟ۡۗۘۦۘ";
                        i5 = i2;
                        break;
                    case 816584774:
                        i3 = 3;
                        str = "ۥ۬ۘۨۜۖۜۦۥ۫ۡۘۧۖۡۡ۫ۥ۫ۢۥۛۗۛۖۚۙ۠ۥۧۘ";
                        break;
                    case 841622382:
                        action = motionEvent.getAction();
                        str = "ۛۘ۟ۢ۬۬ۢۛۘۘ۠۬ۡۤۡۡ۬ۗۨۘۨۜۜۘ۫ۥۨۘۤ۠ۙۤۨ۟۬ۧۚ";
                        break;
                    case 849153998:
                    case 1019833110:
                    case 1779898191:
                        str = "ۦۗۜۘۡۥ۬ۗۛ۟ۢۗۦۘۘۦ۫ۧۙۥۘۖ۠ۖۘۢۦۧۛ۠ۖۘۘ۟ۘۘۤ۠ۘۘۤ۟۫";
                        break;
                    case 895937312:
                        ElfinFloatView.OooOO0(this.Ooooo00, motionEvent.getY());
                        str = "۫ۚۜ۬۟ۖۢۥ۫ۚۦۘۗ۠۠ۘۘۗۢۨۜ۟ۛۜۘ۟۟۬ۤۗۗۚۧۖۘۨۛۘۘ۟۠ۘۦ۬ۛۚۤۛۛۨۘۦ۬ۡۘۢۗۢ";
                        break;
                    case 958902846:
                        str = "ۦۗۜۘۡۥ۬ۗۛ۟ۢۗۦۘۘۦ۫ۧۙۥۘۖ۠ۖۘۢۦۧۛ۠ۖۘۘ۟ۘۘۤ۠ۘۘۤ۟۫";
                        i5 = i4;
                        break;
                    case 995154749:
                        ElfinFloatView.OooO0o(this.Ooooo00, motionEvent.getRawY() - C4491w3.OooOooO(this.Ooooo00.getContext()));
                        str = "ۚۤۙ۠ۡۖۡۤۙۨ۠ۗ۬ۤۧۙ۟ۨۚ۬ۜۘۗۥۥۘۥ۠ۘۘۧ۬ۚۥۘۖۘ۫ۘۙۡ۬ۢۘۘۜۘۛۗۘۘۢۜۨۘۨۙۦۘۦۚۘۘ";
                        break;
                    case 1028803115:
                        String str22 = "ۢۢۡۘۧۗۦۦۦ۬ۖۜۛۢۨۛۤۤ۫ۨۧ۬ۗۘۦۘ۬ۡۡۘ۫ۗۧۛۡۘۘۧۘ۠۟ۧۧ۫۬ۘۜۨۖۘۡۙۡ۫۟ۚۧۦۘ";
                        while (true) {
                            switch (str22.hashCode() ^ (-593632149)) {
                                case -1542367135:
                                    break;
                                case -132711306:
                                    str = "۬ۖ۬ۘۡۡ۠ۖۧۘۘۙۦۘۢ۬ۥۨۨۦۘۡۜۦۤ۬ۖۥۢۥۘۙۦۦۘۨۧۜۘۦۘ۟ۙ۬۠ۛۜ۠ۧۢۘۖۖۜ";
                                    break;
                                case 7990321:
                                    String str23 = "ۤۥۛ۟ۚ۫ۤ۬ۥ۟ۚۙۨۧۢۢۥۦۘۥۙۛۢۜۚۖۡۦ۬ۥۤۚۙۡۡۜۖۙ۠ۘۘۘۛۥۘ";
                                    while (true) {
                                        switch (str23.hashCode() ^ 1575715305) {
                                            case -54037719:
                                                str23 = degrees >= -60.0d ? "ۢۥۘۧۙ۬ۙ۫ۛۤ۠ۜۘۥ۬ۢۜۥ۬ۙۜۥۙۜۘۘ۫ۢۢۧۛۡۘ۫ۗۢۖۙ۬ۗ۠ۘ۠ۢۚۖ۫ۖۢۖ" : "ۦۤۥۘ۟۫ۛۗۜۙۚ۬ۥۘۚۘۛۜۨۘۘۘۖ۬ۢۡۡ۫ۡۘۙۛۜ۫ۨۧۚۢۦۘ۬ۙۥۘ۫۟ۘۘۘ۬ۢۢۘۨۘۧ۠ۨۘ۠ۛۦۘ";
                                                break;
                                            case 89042863:
                                                str22 = "۠ۖ۬۬ۜۜۘۥ۠ۗ۟ۢ۫۟ۧۗ۫ۙۗۧۡۜ۫۠ۨ۬ۥۛۖ۬ۦۘ۫ۖۛ۬ۢۛۙۨۧۥۘۨۨۙ۬ۢ۬ۗۨۖۘ۬۠ۘۘ";
                                                break;
                                            case 216492389:
                                                str22 = "ۧۤۤۤۡۙۛ۠ۥۘۖ۬ۘۘۦۡۛ۫ۨۢۗ۟ۦۘۖۢۜۘۧ۬ۥۛ۠ۚۨۧۗ۫ۘۚۢ۠ۗۦۖۘۢۨۖۘۦۤۖۘۚ۫ۥۘۜۗ";
                                                break;
                                            case 753431565:
                                                str23 = "ۦۤ۠ۦۨۜۘۡۡۜۛۡۧۨ۬ۢۡۤۘۚۚۧۙۙۖۙ۬ۗ۫ۤۢۧۜ۫۠ۦۦۘۗۥۡۘۚۘۙۖۥۨ۫ۖۨۛۥ۟۬ۧۦۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1467442786:
                                    str22 = "۬ۦۤۖ۟ۙۥۗۖ۟ۧۚۚۜۦۦۜۖ۠ۜۨۘۘ۠ۜۖۥۙۜ۬ۙۘۘۢۛ۠ۨۡۤۦۘۢۘ۠";
                                    break;
                            }
                        }
                        str = "ۨ۠ۚۘۡۖۘۥ۠ۚ۫ۦۘۚ۠ۙۥ۟ۧۗۦۢۧۗۢۦۡۡۘۧۙ۠ۖۜۜ۬۬ۜۛ۬ۡۘ۫ۖۦ۠ۖۤۚ۟ۥ";
                        break;
                    case 1048286013:
                        ElfinFloatView.OooO0Oo(this.Ooooo00, motionEvent.getRawX());
                        str = "ۗۦۖۘۢۖۚۘۢۥۤ۟۠۬ۧۚۤۦۦۧۗۡۘۨۜۘۖۚ۫ۧۖۢۘۧۜ۟ۛۤ";
                        break;
                    case 1149632324:
                        String str24 = "ۚۗۨۘۗۗۢۥۦۦ۫ۘۚۧۜۧۤۘۤ۬۫ۨۘۜۥ۫۠۠ۖۘۗ۬ۥۘۘۛ۬ۤ۟ۚۦۤۘۘۘۚۛ";
                        while (true) {
                            switch (str24.hashCode() ^ (-508251234)) {
                                case -1629800564:
                                    str24 = "ۤ۠ۧۛۨ۫ۥۥۗۛۛۡۘ۫ۖۡۘ۠ۘۡۘۥۜۘۘۤۙۤۖۦ۟ۦۙۘۗۙۖۘۛۨۦۘۛۨۡۗۗۜۘۘۥۧۘۙۗۡۘۧۦۦۘۘۤۖۘ";
                                    break;
                                case -393971107:
                                    String str25 = "۫۬ۡۘ۫ۙۢ۬ۘۥۘ۟ۗۜۤۧۙ۫ۨۡۘۙ۠۫ۗۚۚۡۚۦ۫ۢ۠";
                                    while (true) {
                                        switch (str25.hashCode() ^ 430195384) {
                                            case -1228204391:
                                                str24 = "۠ۗ۟ۤۛۜۘۨۙۨ۫ۤ۬۫۬۠ۢۢۙۘ۬ۨۖۦ۟ۜۖۦ۫۟ۖۘۦۡۡۘۚۦۖۘۖۤۤ۟۠";
                                                break;
                                            case 909167656:
                                                str25 = ElfinFloatView.OooOOo(this.Ooooo00) ? "ۢۙۥۘۨۘ۬ۘۚۗۢۖ۠ۡۢۘۘۧۥۗۘۧۙۧۜۘۘ۟ۙۨۧۘۘۙۙۛۦ۟ۡۙۢۥۛۡۖ" : "ۛۗۜۘۘۘۧۘ۟۬ۗۤۢ۟ۦۜۨۘ۠ۖۨۘۘۘۗۦۦۜۢۦ۠ۦۛۡۚ۫ۘۘ۠ۨۚۨۢۥۘ۠ۗۡۛ۟ۢ";
                                                break;
                                            case 1232799858:
                                                str25 = "ۧۨۘۘۧۡۨۘۦ۬ۖۖۖۛۜ۬ۨ۠ۜۡۛۛۙۘۛ۬ۙۖۘۨ۫ۦۘۚۖ۬۫ۗۖۘۗۥۘۜ۟ۧۙۚۘۤۖۡ۟ۦۢۧۘۖ";
                                                break;
                                            case 1991864613:
                                                str24 = "۟ۛۥۢۦ۟۬ۥۛۨۚۚۗۢۨۘ۟ۘۙۢ۬ۙۨ۠ۘۘ۟ۘۦ۟۫ۖۚۘ۠۬ۜۡۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 365116415:
                                    str = "۠۬۟ۛۙۦ۟ۧۨۚۚۡۛۢۡۙۤۥۗۜۖۘ۟ۛۜۘ۟ۚۖۤۦۘۤۗۖۘۢۥ۠ۙۜۤۘۥۧۘ";
                                    continue;
                                case 1212360035:
                                    str = "ۤۡ۫ۗۡۘۘۥۙۘ۬ۖۚۨۜۙۗ۫ۥۘۚۦۗ۬ۤۧۥۦۛۥ۟۠ۚۚۖۤۥۘۘ۫ۜ۠ۤۜۡۘۚۤۧۨ۫ۢ۟ۙۧ";
                                    continue;
                            }
                        }
                        break;
                    case 1290704003:
                        break;
                    case 1337594732:
                        ElfinFloatView.OooOo0(this.Ooooo00);
                        str = "ۥ۟ۨۘۢۖۛۙۥۧ۬ۦۥۚ۫ۨۢۡ۬ۥۚۡۘۗۗۥۘۢۛۡۘ۬ۗۘۨۧۢۥ۠۟ۥۥۘۤ۬ۥۘ۫ۗ۟ۖۛۢۨۢۛۗۙۤ";
                        break;
                    case 1420436305:
                        String str26 = "۫ۤۦۘۧ۟ۨۘۨۙۙۥۢۢ۠ۗۧ۟ۗۛ۠ۚۡۛ۠ۘۘۡۡۘۘ۬ۡۗۤۥۘۚۖۖۘۨۦۥۘۘۘۡۘ۟ۥۖۥ۫ۚ";
                        while (true) {
                            switch (str26.hashCode() ^ (-1778476054)) {
                                case -1166678430:
                                    String str27 = "ۦۙۚۧۡۧۙۨۚۥۥۖ۠ۘۨۤۡۘۘۨۢۡۘۛۤۨۜۗ۫ۗۘ۬۟ۤۛۜ۟ۖ";
                                    while (true) {
                                        switch (str27.hashCode() ^ (-463861694)) {
                                            case -1224855468:
                                                str26 = "ۡ۫ۘۘۡۜۦۘۙۦ۠ۜۖۥۥۜ۟۫۠ۤۙۜ۫ۡۗۥۘۧۘۙۙۧۤۜ۬ۤۗۘ۠";
                                                break;
                                            case -132598314:
                                                str26 = "ۥۖۗ۠ۜۚۦۨۧۘۗۦۜۘ۠ۨۢ۠ۤۡۤۡۨۡ۬ۡۨۖۥۥۧۤۦۡۦۨ۟۫۬ۥۘۚ۫ۦۘۨۛ۫ۨ۠ۛۖۙۗۧۨۛ";
                                                break;
                                            case 843445320:
                                                str27 = degrees > 60.0d ? "ۚۤۜۘۛ۠ۗۜۡۗۜۨۦۢ۬۟ۖۘۙۚۥۤۘ۬ۦ۟ۤۨۢۢۦۧ۟ۜۚۦۘۜۚۧۦ۠ۡ۫ۢ۠ۗۗ۬ۤۥ۟ۡ۬" : "ۨۧۛۚۘۧۢۨۥۥۧ۬ۖۨۧۚۖۚ۫ۘۘۘۤۖۤۧۧ۟ۜۨۗ۠ۜۡۧ۬ۜۘ";
                                                break;
                                            case 981040108:
                                                str27 = "ۡۧ۠ۗۗۨۘۚۦۚۙۜۥۘۤۨۖۧ۟ۙۚۤۦۘۢۛۘۤۚۘۢۜۗۢۜۜۙۙۛ۫ۚۢۧۦۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case -367643119:
                                    str26 = "ۘۘۨۘۡۜۧۜۨ۟ۥ۬ۧۘۧۤۘۛۛۙ۠ۖۖۗۧۘ۟ۡۜۧۘ";
                                    break;
                                case 836502942:
                                    break;
                                case 2068190204:
                                    str = "ۤۡۨۘ۟ۤ۫ۢۗۡۘۤۨۚۤ۬ۘ۠ۚۥۘۛۦۗۜۘۘۛۖۖ۠ۖ۠ۖۦۧۘۧ۬ۦۘ";
                                    break;
                            }
                        }
                        break;
                    case 1456992116:
                        String str28 = "ۦۜ۫ۚۙۛۨۧۜۘۖ۟ۛۙۢۜ۟ۥۦۘۛۤۖۧۦۧۘۦۦۦ۫ۧ";
                        while (true) {
                            switch (str28.hashCode() ^ (-1339557356)) {
                                case -1189754861:
                                    break;
                                case -374974755:
                                    str28 = "ۚۘۨۘۡۦۦۙ۫ۥۜۡۖۢۢۡۘۨۧۘۘ۠۟ۛۨۜۛۛ۠ۜ۠ۚ۠۬ۘۖۚۦ۠ۚۖۘۖۢۘۧۤۘ۟ۡۥ";
                                    break;
                                case 942822356:
                                    String str29 = "ۥ۟ۨۘۨۘۦۘ۬ۥۡۘ۟ۘۖۦۥۧۨۥۡۖۧۜۘۙۦۚۡۧۚۜۙۨۘۧۖۛۗۖ۫";
                                    while (true) {
                                        switch (str29.hashCode() ^ 571303414) {
                                            case -1616637208:
                                                str29 = degrees < -60.0d ? "ۗ۠ۙ۟ۥۨۦۨۡۘۜۖۜۘ۟ۙۘۘۨۥ۟ۚۜۛ۠۬۫ۡ۫ۛۨۙۡ" : "ۤۖۜۧۢ۟۬ۧۢۦۛ۠۬ۨ۫ۤۡۢۨۜ۫ۛۛۛ۫ۧۡۘۗ۫ۧ";
                                                break;
                                            case -796625958:
                                                str29 = "ۚ۟ۖ۟ۢ۟ۧۛۘۘۨ۠ۤۛ۠۠ۨۤۨۘۧۜۦۨۦۙۛۗ۫ۛۖۨۧۙۗۢ۬ۖۘۨۜۖۨۛ۟";
                                                break;
                                            case 680600158:
                                                str28 = "ۖۨۜۘۗۨۛ۠۟ۢۚۙۥۚ۟ۗۦۛۨۡ۠ۙۚۜۧۘ۬۫۬ۛ۬ۘ";
                                                break;
                                            case 874828303:
                                                str28 = "ۢۢۦۧۤۨۘۛۚۡۘۙۤۥۥۗۛۜۘۦۘ۟۬ۘۥۢ۟۟ۙۥۘ۟ۨۨۘۦۢۙۤۥۢۛۗ۟ۧۧ۬ۦۗۛۙ۬ۜۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1522062967:
                                    str = "ۙۘۛۧۛۦۘۗۢۘ۠ۦ۟ۨۚۛۘۧۘۧۨۘۖ۬ۛۥۨۡۘ۠۠۟ۢ۠ۛ۟۟ۦۙۢۦۨۡۖۘ";
                                    break;
                            }
                        }
                        str = "ۗۚۨۘ۫ۤۖۧۨۛۙۥۗۛۛۖۘۡۦ۠ۘۘ۫ۨۜۖۘۤۙۦۘۙۚۨ";
                        break;
                    case 1505831004:
                        break;
                    case 1506156617:
                        String str30 = "ۢۥۧۘۖۖۙۥۚۛۜ۠ۥۘۘۦۜ۟ۦ۫ۡۥۡۘۥۙۙ۟ۤ۟ۡۧۜۚۥۤۗۖۘۖۗۜۘۘۗ۫ۦ۠ۖۘۡۢۥۦۖۘ۫ۜۚ";
                        while (true) {
                            switch (str30.hashCode() ^ (-200361405)) {
                                case -1384423841:
                                    str30 = "ۡ۫ۦۘۗ۬ۗۙۚۚۢۨۥۨۧۡۧۙۨۛۦۘۤۙۨۘۛۤ۫ۤۗۛ۬ۘ۠ۘۦۙ";
                                    break;
                                case -698058255:
                                    String str31 = "ۚۙۦۘۤۛۗۧۖۦۘۜۤۥۘ۠ۘ۠ۜ۠ۖۦۘۧۘۙۨۥۦۦۘۢۗۗ۠ۚۦۢ۟ۜۙ۠ۘۘۘۤۥۘ";
                                    while (true) {
                                        switch (str31.hashCode() ^ (-915682966)) {
                                            case -2099796529:
                                                str31 = "ۚ۟ۚۥۚۖۘۚۖۧۘۤۘۧۢۡۘۘۢۗۥۘ۟ۛۜۙۧۨۢ۠۫ۚۢۡۘ";
                                                break;
                                            case -1822475045:
                                                str30 = "ۢ۟ۥۖۨۜۘۘۜ۬ۗۢۜ۬ۛۘۙۦۤۨۛۨۨۧۦۦۗ۫۟۬ۚۥۧۥۛۦۚ۠ۨۨ۬ۦۘ";
                                                break;
                                            case -590343793:
                                                str30 = "ۡۙۦۜۗۘ۬ۚ۬ۙۙۘۚۧۨۤۘۜۘۥۧۡۘۘ۠ۖ۠ۢۘۤۧ۬ۡۢۖ۠۟ۡ";
                                                break;
                                            case 1112192779:
                                                str31 = this.OoooOoo.onTouchEvent(motionEvent) ? "ۜ۠ۖ۟ۜۡ۬ۨۘۤۗ۟ۦۦ۫ۖۗۦۘۚ۠ۦۖ۟ۘۘۧۤۦۚۘ۟" : "ۧ۬ۖۘ۬ۛ۠۬ۘۘۡۜ۠۬ۧۥۧ۠ۛۜۖۦ۟ۨۢۦ۬ۡۘۧۡۜۘۨۛۘۘۦ۫ۦۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1200619152:
                                    str = "ۢۨۡۥ۫ۤۛ۫ۚ۫ۗۘۘۦۡۡۘۖۖۦۛۦۤۜۧۖۘۧۨۡۘ۬ۧۛ۠ۦۢۨۧ۠ۜ۟ۜۗۘۦ۫ۧ۬ۘۚۘۜۗۙۤۘ";
                                    continue;
                                case 1654751948:
                                    str = "۟ۗۘۘۖ۟ۘۘۛۖۗۥۙ۠ۢۧۖۘۜۜۘۥۢۖۘۡۥۧۘۥۢۨۥۛۧۤ۠ۘۤۦۗۙۧۖۦۜۧۡۗ۬۫ۗۢۖۢۜۡ۬ۜ";
                                    continue;
                            }
                        }
                        break;
                    case 1508236749:
                        degrees = Math.toDegrees(Math.atan2(ElfinFloatView.OooO0o0(this.Ooooo00) - ElfinFloatView.OooOOO0(this.Ooooo00), ElfinFloatView.OooO0OO(this.Ooooo00) - ElfinFloatView.OooOO0O(this.Ooooo00)));
                        str = "ۡۜ۫ۧۤۚۦۖۥۘ۠ۨۧۘۨۗۖ۫ۦۡۥ۠۫ۥۚۖۦۚۚۡۘ۠ۨۥۤۗۦ۬ۢۤۥ۠ۦۗۢۤ۫۬ۥ";
                        break;
                    case 1508351369:
                        viewOnClickListenerC4272q6.OooO0oO(ElfinFloatView.OooOOoo(this.Ooooo00));
                        str = "۬ۦۙۡۙۧۦۨۚۡۡۚۧۡۚۙ۫ۚۦۨۗۘ۠ۡۘۜ۟ۥۘ۟ۖۦۘۚۚۤۦۤۦۘۖۗۖ۬ۧۥۤ۠ۜۘۡۡۖۤۥ۠ۖ۠ۖۘ";
                        break;
                    case 1542728133:
                        elfinFloatView = this.Ooooo00;
                        str = "۠ۢۙۙۧ۫۟ۚۦۘ۟ۤ۠ۥۘۘۖۧۛۙۘۙۧۨۧۢۘۖۘ۫ۤۢۢۛۖۛۧۨۘ";
                        break;
                    case 1648243070:
                        i4 = 4;
                        str = "۬ۦۘۘۙۦۥۘۡۖ۠ۥۛۗ۟۬ۨۥۘۚ۠ۜ۟ۢۦۜۘۚۛۨۜۥۨۘۖۙۤۦ۟ۤۛۖ۠ۚۜۖۘۦۛۖۘۢ۠ۥۡۖۦۘۧۦۘ";
                        break;
                    case 1651028712:
                        break;
                    case 1653305937:
                        String str32 = "ۢۘۦۥۡۙۡۥۛۗۦۨۗۤ۟ۡۜۢۖۨۧۘۗۖۗ۠ۤۖۘۖۤۦۛ۟ۜۘۚۙۦۜۦۦۘۤۦۛۦ۫ۥۘۚ۟ۖۘۥۛۦۘۨۨۘ";
                        while (true) {
                            switch (str32.hashCode() ^ (-1294168573)) {
                                case -192402199:
                                    str = "ۤۧۡۘۛ۫ۨۥۤۛ۫۬۬ۦۖۦۙ۠ۤۘۖۘۘۨۖۜۘۙۖۛۜۧۡۘۜۙۢۡۗۚ";
                                    continue;
                                case 215111201:
                                    str32 = "ۥۘۚۤ۟ۖۦۘۦۖۦۘۨۙۨۘۤ۠ۗۛ۫ۗۗۤۘۚ۬۠ۖۦۨۘۧۛ۠ۦۙ۫ۡۦۜ۬ۛ۬";
                                    break;
                                case 629350041:
                                    String str33 = "ۖ۟۟۬ۛۢۛۨۜۘۙ۟ۦۘۨ۠ۧۘۨۢۡ۫ۡۘۢۙۘۛ۫ۘۘۖۚۙ";
                                    while (true) {
                                        switch (str33.hashCode() ^ (-548289531)) {
                                            case -1945456819:
                                                str32 = "۟۟ۥ۬ۤۤۖۚ۬ۧۚۥۘ۠ۜۨۘۥۛۥۦ۠ۨۢۢۜۘۤ۬۬۠ۙۖۥۜۡۨۢۡۢۥۦۘۛۗۦۧۧۨ۬ۧ";
                                                break;
                                            case -1872417620:
                                                str32 = "ۚۢۦۘ۟ۖۤۡۨۢۤۤۘۦ۬ۨۘۖۦۙ۠ۛۙ۬ۧۨۜۨۡۥۤ";
                                                break;
                                            case 1094669603:
                                                str33 = action != 1 ? "۬۟ۘۘۖۧۙۡۚۢۦ۫ۢ۠ۦۜۥۦۖۘۜ۠ۡۦۜۢۖۤۧۧ۟ۙۨۘ۬ۙۨۤ" : "ۘۜ۫۫ۛۡۘ۬ۘۦۙۤۖۤۛۨ۫ۨ۬ۚۖ۬ۜ۟ۛۜۚۦۜۤ۠ۢۧۘ۟ۙ۠ۥۨۘۥۘۨۘۚۨۙ۟۫۟ۖ۠ۦۘۜ۠ۨۘ";
                                                break;
                                            case 1140021669:
                                                str33 = "۫ۧۖۘۖۜ۟ۢ۫ۜۨۙۖ۠ۨۨۛۘۖۘ۬ۘۘۜۖۦ۠ۡۛ۠ۚ۬۠۟ۧۦۘۚۗۥۘۥۗۤۡ۠ۚۘۖۖۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1757816081:
                                    str = "ۥ۟ۜۘۚۖۡۘۚۗۘۘۛۨۗ۟ۛۜۚ۬ۥۘۧۡۖۦۗۚۚۦۛۦۚۜۘۦۦۨۦ۟ۨ";
                                    continue;
                            }
                        }
                        break;
                    case 1810076597:
                        i = 2;
                        str = "ۦۧۨۚ۠ۤۜۜۦۘۖ۬ۦۘۜۥۗۢۤ۫ۡۦۜۘۜۧۥۘۖۚۢ۫۠ۡۘۛۤۤۧۤۖۘ";
                        break;
                    case 1829354959:
                        String str34 = "ۖۡ۬ۗۙۡۧ۬ۦۘۚ۬ۛۨ۟ۚۜۚۗۛۦ۟ۢۛ۟ۘۙۡۖۡۥۦۗۘۧۗۡۘ";
                        while (true) {
                            switch (str34.hashCode() ^ (-245402313)) {
                                case -42902688:
                                    str34 = "ۡۨۛ۫ۖۡۗۨۘۘ۬ۤۦ۬ۤۥۚۨ۠۟ۡۤۘۙۙۘۤۜۤۦۘۡۦۥۤۤۧۙۘۘۚۖ۫";
                                    break;
                                case 31932238:
                                    str = "ۥۙۘۤ۬ۤ۠ۦۡۖ۠ۦۢۖۥۘۗۡ۬۠ۥۧۘۘ۟۫ۥۥۥۘۖۤۗ۫ۜۨۖۘۥۧۚۘ۠ۤۘ۬۟ۗ۫ۡۤ۬ۤ۫ۛۧۖ";
                                    continue;
                                case 1259424706:
                                    str = "۫ۛۥۜۜۚۨۦۧۘ۬ۗ۫۟ۤۢۘۦۤ۫ۢۧۙۛۦۥۡۚۛۘۛۡۜ۫ۚ۫ۛۦۚۖۘۨۤ۠";
                                    continue;
                                case 1955643631:
                                    String str35 = "ۖ۫ۥۘۖۨۖۘۙۗۡۜۙۢۖۢۡۨۦۘۛۗۨۙۘۜۜۢۜۘۤۖۚ";
                                    while (true) {
                                        switch (str35.hashCode() ^ 1812819994) {
                                            case 492809567:
                                                str34 = "ۜۗۥۘۡۤۥۛۙۗ۠ۖ۟ۛۤۘۦۧۘۘۨ۬ۥ۫ۚۗۨۧۘۗۜۧۦۢۨۖۖ۟ۚۥۘۙۤ۠";
                                                break;
                                            case 1170680105:
                                                str35 = "ۥ۠ۥۘۨۚۤۧ۠ۨۘۥۤۚۢ۟ۢۨ۟ۥۚ۟ۜۘۗۥۨۦۛۜۗۥ۫ۙۛۜۘۥۢۙۖۡۥۛۢۡۘۦۥۘۧ۟ۙۖ۬ۙۖۢۚ";
                                                break;
                                            case 1532507663:
                                                str34 = "ۧۡۨ۟ۖۜ۟ۘۘۢۙۢۡۨۡۗۗ۬۠۠ۨ۠ۘۚۛۘۨ۬ۡۡۘ۠ۗ۠ۜ۟ۘۤۧۦۘۥۨۡ";
                                                break;
                                            case 1864605256:
                                                str35 = OooO00o(ElfinFloatView.OooOO0O(this.Ooooo00), ElfinFloatView.OooOOO0(this.Ooooo00), ElfinFloatView.OooO0OO(this.Ooooo00), ElfinFloatView.OooO0o0(this.Ooooo00)) <= 5.0f ? "ۙۢۦۤ۫ۛۙۘۨۙۧ۬ۢۙ۠ۧۨۘۦۧۦۢۛۤ۬ۢۛۥۨۖۚۜۘۘ۫ۛ۬ۢ۬ۧۢۢۤ" : "ۘۤ۟ۙۘۦ۬ۧۘۨۢۡۥۙ۠۟ۚۢۨۨۗۢ۟ۚۖ۫۠ۢۡۤۘۙۚ۠ۨۖۘ۫ۜۙ۠ۧۦۙ۬ۥ۠ۨۜۘ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1848348692:
                        ElfinFloatView.OooO0oo(this.Ooooo00, motionEvent.getX());
                        str = "ۜۥۡۙۥۦۡۗۜۙۛۛۗۘۖۘ۠ۢ۬۬۬ۦۘۜۦۡۘۢۡ۬ۤۦ۫۬ۧۚ۫ۢ۫";
                        break;
                    case 1905734210:
                        String str36 = "ۧۚۤۛۜۙ۫ۙۜۘۜۛ۟ۨۗۛۢۧۡۘۤۢۡۘۧۦۗۘۤۗۧۙۦۡۥۘۥۡ۫ۛ۟ۧۘۖۘ۟ۧۚ۬ۜ۟ۡۢۗۦۡ";
                        while (true) {
                            switch (str36.hashCode() ^ (-641972830)) {
                                case -1512218576:
                                    str = "ۧۦۜۖۦۢۙۛۘۘ۬۟۟ۡ۫ۖۘۦۗۗۥۢۢۙۜ۫ۢۗۦۘۛۤۤۚۡۜۘۛۧۨۘ";
                                    break;
                                case -916666241:
                                    break;
                                case 876900845:
                                    String str37 = "۫ۢۢۖۘ۬ۦۥ۟ۨۖۘۘۧۖۜۘ۟۫ۥۖۜ۟ۥۜۘۧ۬ۤۛ۫۬۟ۦۤۡ۠ۛ";
                                    while (true) {
                                        switch (str37.hashCode() ^ (-331298782)) {
                                            case -1655815026:
                                                str36 = "ۨ۬۬ۤۚۜۤۧ۬ۨۥۘۥ۬ۢۨۦۨۘۚ۫ۢۙۛۧۢۡۜۜ۫";
                                                break;
                                            case -1309629858:
                                                str37 = "۠ۧ۬ۙۧۖۛ۬ۡۘۙۢۖۘۙۦۧۘۗۡ۫ۜۨ۬ۨ۫ۖۘۖۤۖۧۦۘۙۢ۟۫ۘۦ";
                                                break;
                                            case -3093041:
                                                str36 = "ۜۙۛ۠ۧۡ۫ۡۘۨۙۤۥ۬ۥۚۛۧۖۦ۫۬ۡۦۛۥ۠۠ۘۗۥۨ۫ۧۡ۫";
                                                break;
                                            case 74406433:
                                                str37 = degrees <= 60.0d ? "ۘۢ۬ۜۤۜۢ۬ۡۘۗ۟ۙۚۗۥۗ۬ۦۘۜۨۖۘۦ۠ۗ۟ۦۘۙۙۘۡۤۥۘۙۧۖۡۢۡۘۖۥۖۘۦ۠۬ۖۖۘ" : "ۤ۬ۖۘۘ۫ۛۨ۫۫ۘۤۧ۫ۙۖۘۛۧۡۙۤۚۘۦۤۚۘۡ۠ۥۜ۟ۖۘۚۙۙۚۨۚۤۗۤ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1177154973:
                                    str36 = "ۖ۠ۘۘۚ۫ۛۖۜۨۙۙۘۤۖۜۘۢۦۧ۫ۙۥۘۨۨۦۘۢۨ۬ۗۗ۟ۢۗۖۘۗۜۙۨۦۤۢۛ۟";
                                    break;
                            }
                        }
                        str = "ۨ۠ۚۘۡۖۘۥ۠ۚ۫ۦۘۚ۠ۙۥ۟ۧۗۦۢۧۗۢۦۡۡۘۧۙ۠ۖۜۜ۬۬ۜۛ۬ۡۘ۫ۖۦ۠ۖۤۚ۟ۥ";
                        break;
                    case 1906887552:
                        ElfinFloatView.OooOOO(elfinFloatView2, ElfinFloatView.OooO0o0(elfinFloatView2));
                        str = "ۨۦۧۘۨۧۖۥۨ۫ۜۨۘۨۥۡۘۖۜۧۘۨۦۙۛۘۦ۬ۢۙۨۥۥۙ۟ۙۜۗۚ۬ۦۡۘۖۤۘۘۖۚۤ";
                        break;
                    case 1927291585:
                        ElfinFloatView.OooOOOo(this.Ooooo00).setVisibility(0);
                        str = "ۥۘۡۢۢ۫ۦۨۧۘ۟ۧۢۙۜۡ۫۠۠۠ۨۢ۠ۢۨۘۜۜۨۘۨۡۗۖۢۦۘۧۤۨۘ۠ۚۜۨۨۘۘۖۙۥۘۦۗۗ";
                        break;
                    case 2005728143:
                        str = "۬۟ۛ۠ۢۧۗ۟ۜۛۧۨۦۜۦۘۦ۟ۧۗۦۘ۠ۥۧۘۚۤۘۘ۫ۥۖۖۘۗۧۛۡ۠ۖۥۗۥۜۘۦ۠ۦۘۖ۬ۦۘ۟ۦۤ۟ۥۚ";
                        i5 = i3;
                        break;
                }
                return true;
            }
        }
    }

    public class OooOOOO implements ViewOnClickListenerC4272q6.OooO00o {
        public final ElfinFloatView OooO00o;

        public OooOOOO(ElfinFloatView elfinFloatView) {
            this.OooO00o = elfinFloatView;
        }

        @Override // p285z2.ViewOnClickListenerC4272q6.OooO00o
        public void onClick(View view) {
            String str = "ۗۦۡۙۡۥۧۛۢۙۥ۠ۚۖ۠۠۟ۘۘۨۦۗۢۢ۠۟ۢ۫ۗۜۡۛۤۥۘۚۖ۫";
            while (true) {
                switch ((((str.hashCode() ^ 369) ^ 857) ^ 129) ^ (-1568460569)) {
                    case -253394104:
                        str = "ۜۚۗۤۨۙۗۚۙۖۥۚۡۘۢۡۘۘۥ۟۠ۙۛۤۥۗۦۘۦ۠ۢۙ۟ۢۜۨۧۘ";
                        break;
                    case 1123051254:
                        str = "۠ۡۨۘۥ۫ۢۤۗۦۘۤۡۚۧ۟ۡ۟ۦۨۤۤۦۘۡۤ۟ۦ۠ۖ۟ۥۜۡۙۦۗۢۘ";
                        break;
                    case 1258916979:
                        return;
                    case 1383780592:
                        ElfinFloatView.OooOo0(this.OooO00o);
                        str = "ۙ۬ۖۨۨۚۛۛۨۘ۠ۦۡۘۢۖۙۗۦۢۧۤۦۥۛ۫ۦۢۢ۟۬ۢۙۚۦۙۨۤ";
                        break;
                }
            }
        }
    }

    public class OooOo implements GestureDetector.OnGestureListener {
        public final ElfinFloatView OoooOoO;

        private OooOo(ElfinFloatView elfinFloatView) {
            this.OoooOoO = elfinFloatView;
        }

        public /* synthetic */ OooOo(ElfinFloatView elfinFloatView, OooO0OO oooO0OO) {
            this(elfinFloatView);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            String str = "۬ۛۖۧ۫ۜۘۧۥۥۙ۠۟ۖ۠ۥۡۧۨۛۥۘۤۤۡ۫۟ۖۘۙۤۗۨ۬ۗۢ۬ۛۚۦ۫ۖۘ۠ۨۚۗۜ۫";
            while (true) {
                switch ((((str.hashCode() ^ 820) ^ 338) ^ 84) ^ 38632289) {
                    case -1996256939:
                        return false;
                    case -211034592:
                        str = "ۥۜ۠ۘۖۦۜ۫۠ۦۦۜۘۥۙۦۢۥۙۚۥۛۡۦۦۘۗۡ۬ۛ۬ۡۖۘۜۘ۫ۙۢۗۖۢ۠ۙۦۘۘۨۚۦۜۘ";
                        break;
                    case 1924583616:
                        str = "ۗۜۜۘۜۤۦۘۢ۫ۜۘ۠۫ۨۖ۬ۖۖۗۖۘۤۢۜۜۢۜۙۜۦۢۡۦۨۘۛۢ۫۬۫ۙۤ۠ۗۦۧۡۦ۫ۘ";
                        break;
                }
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            String str = "ۜۜۘۘۛۛ۬ۡۛۨۚ۟ۤۤۘ۫ۜۖ۫ۜ۬ۜۛۤۚ۬ۢۖۘۦ۟۠ۘۜۜۜۡۙ";
            while (true) {
                switch ((((str.hashCode() ^ 930) ^ GuideToClickView.C0870a.f1447f) ^ 425) ^ (-207093316)) {
                    case -1207129726:
                        str = "ۡ۠ۨۘۢ۬ۦۙ۫ۛ۫۬ۘۘۙۨ۬ۘۙۘۘۥۨ۫۫ۚۛۧ۬ۘۘۚ۬۟۫۠ۦۘۢۚ۠ۥۜۧۘۚۖۨۚۢۡۚۛۨۘ۬۠ۦۘۚ۬ۘۘ";
                        break;
                    case 332771381:
                        str = "ۨۜۥۘ۫۠ۦۘۛۖۥۘۖۗ۠ۨ۬ۤۥۘۧۧۗۥ۟ۙۘ۫ۘۤۚ۠ۚۜۥ۠ۡۥ";
                        break;
                    case 365150017:
                        str = "ۛۜۤ۟ۧ۟ۤۡۜۦۘۦ۟۬ۘۦۧۧ۫ۤۗۖۙۦۘۗ۠ۘۘ۫ۖۖۘ";
                        break;
                    case 387591144:
                        str = "۠ۨۖۘ۬ۛۤ۫ۤ۟ۙۖۖۡۧۖۘۙۛ۫ۢۖۢۗۛۥۘۙ۬ۦۚۥۘۤ۬ۤۖۦۘۚۦ۠ۜۢۧۙۢۛۥ۠";
                        break;
                    case 834484209:
                        str = "ۖۙۖۙ۟ۘ۫۟ۜۘۖۧۜۘۖۖ۠ۥۨۤۡ۟ۛۘۤۖۘۖۤۤۘۧۘ۟ۖۧۤ۟ۖۘ";
                        break;
                    case 2058592723:
                        return false;
                }
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            String str = "۟ۧ۫ۤۘۚ۬ۘۧۛۢ۬ۨۢ۬ۗ۟ۚ۠۠ۦۘۛ۫ۖۘۤۙ۠۠ۗۚ۫ۥۘۛۘۚۛ۠ۤ۠ۢۨۦۧ۠۫ۨ";
            while (true) {
                switch ((((str.hashCode() ^ 254) ^ 116) ^ 447) ^ (-1009848573)) {
                    case -1291844301:
                        str = "۠ۖۘۘۢۙۖۘۡۡۨۘۚۛۦۘ۫ۚۥۡۙۚۛۨ۠ۙ۠۠۟ۤۗۖۤۖۘۛۦۧۘۘ۬ۖۘ";
                        break;
                    case -947052058:
                        return;
                    case 1975321243:
                        str = "ۙۗۘۘۢۖۦۨۦۘۗۢۜۘۖۢۚۤۤۨۘۡۥۧۜۖۘۨۤۧۧۨۥ";
                        break;
                }
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            String str = "ۘۤۖۘۢۙ۬ۦۦ۬۬ۘۜ۬ۙ۫ۘ۫ۨۘۦ۬ۢ۠ۦۘۚۗۘۧۖۚۚۦۨۘۥۘۢۥ۠ۧۧۗۧۤۚۢ۠ۜ";
            while (true) {
                switch ((((str.hashCode() ^ 330) ^ 686) ^ 473) ^ (-47481829)) {
                    case -2109567209:
                        return false;
                    case -1689996576:
                        str = "ۡ۬ۡۘ۠ۥۥۘۗۨۨ۠۟ۧ۟ۙۜۘ۟ۙ۟ۥۚ۫ۦۦۗۘۛۥۘ۫۬ۢۤ۬۫ۜۢۧ";
                        break;
                    case -663117500:
                        str = "ۤۖۨۘۜ۟ۛ۟ۤۖۤۛۘۘ۟ۤۢۙۛۨۘ۬ۥۜۘۙ۠ۘۘ۫ۤۧ۫۬ۜ۟ۨۦۘۡ۟ۢ";
                        break;
                    case 458159842:
                        str = "ۢۛۨۧۜۗ۫ۤۡۘۛۡۘۥ۟ۖۘۤ۬۠ۡۘۛ۠ۧۜۛ۠ۡۘۖۢۨ";
                        break;
                    case 931029669:
                        str = "ۥۘۜ۫۟ۘۡ۬ۧۗۨۤۜۨۖۘۢۘۜۗۦۜۘۢ۬ۦۘۙ۠ۙۚۘۡۘۨۧۘۗۦۘۘ";
                        break;
                    case 1159790344:
                        str = "ۥۘۗۘۛۘۘۢۢۘۘۦ۟۠ۖۘۥۜۤۘۢۚۙۨ۠۫ۘۢۗۚۖۨۚۘۤۜۥ";
                        break;
                }
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            String str = "ۥۡ۠ۚۨ۬ۗ۬ۖ۟ۙۗ۟ۡۡۢۡۘۛۤۙ۠۟ۘۗۜ۟ۘۧۘۥ۬ۧ۬ۦۧۜ۠ۡۘۡۜۚ۠ۦۗۦۧۖۘۤۜ۬ۢ۟ۚ";
            while (true) {
                switch ((((str.hashCode() ^ 682) ^ 489) ^ 930) ^ (-621960717)) {
                    case -1856995799:
                        str = "ۖ۫ۘۘۤۜۖۘۧ۟ۙۨۧۤۚۗۡۘۨۜۚۜۘۘۚۢۜۘۡۜۜ۫۠ۛ۫۬ۧۡۚۙۤ۠۫ۥ۠";
                        break;
                    case 1328539832:
                        return;
                    case 1676731100:
                        str = "ۗۚۖۘ۫ۖۖ۠۬۠ۦ۠ۜۚۢۨۧۧۢۖ۟۬ۚ۟ۘۘۖۨۧۘۧۚۤۛ۬ۨۖۧۜۛ۬ۖۙۤ۠۟۠ۖۘۜۖۘ";
                        break;
                }
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            String str = "۬۬ۥۜ۠ۜۨۘۛۢۨۙ۟ۚۤۥۙ۫ۥۢۨۘ۫ۤ۫۫ۘۦۘۙۙ";
            while (true) {
                switch ((((str.hashCode() ^ 622) ^ 972) ^ 282) ^ (-1972519909)) {
                    case -1995138219:
                        str = "ۤۖۤۨۨ۫۟ۚۖۘ۟۟ۧۡۨۙ۬ۜۜۥ۠۫ۘۧۢ۟ۥۥۘ۠ۙۜۧۚۗۜ۫ۙ";
                        break;
                    case -1691918920:
                        str = "ۤۗۖۘۡ۬ۘۥۦ۫ۚۢۛۜۨۥ۬ۙۖۦۘ۬ۛۤۖۘۥۚۙۗۢۗۘۤۚۢۥۙۘ۟ۦۘۧۖۢ";
                        break;
                    case -1205125921:
                        str = "۠ۦۖ۬ۨ۫ۙۜۥۙ۟ۨۘۗۧۥۢۨۙۦۡۦۚۜۦۛ۟ۘۦۚ۟ۘۡۖۘۖۦ۟ۚۨۖ۫ۧۜ";
                        break;
                    case -841819599:
                        String str2 = "ۗۥ۟۟ۧۢۥۤۦۢۧۘۤ۫ۨۘۨۤۘۘۚۖۢۛۜۘۦۖۛۚۥۖۘ۫ۜۨۘۖۤۥۙۦۦۘۖ۬ۡ۫۠ۨۘۗۨۧ";
                        while (true) {
                            switch (str2.hashCode() ^ 1632769987) {
                                case 13228721:
                                    str2 = "ۡۤۗ۠ۖۘۗۢ۬ۙۥۧۘۧۖۦۘۨۘۖۘ۬ۡ۬ۢۖۢۘۧۚۗۘۘۚۢ۠ۜۚۨۘۛۧۨۧۥ۫ۚ۠ۨۗ۫";
                                    break;
                                case 127713574:
                                    str = "ۗۨۧۧۗۧ۠ۚۖۘ۫ۘۘۨ۬ۙۨ۬ۡۧۡۡۦۖۧۘۖۡۥۚۤۨۘۘۜ۠ۧۗۙ۫ۘۘۘۤۘۥۖۘۛۥۘۘۘ";
                                    continue;
                                case 1826659999:
                                    String str3 = "ۤۦۖ۠ۛۦۜ۬ۜۘ۫ۗ۫۬۠ۢۢ۫ۤۘۛۢۘ۠۠ۦۘۦ۬ۜۨۦۥۙ۬ۤۨۦ۟۟ۘۜۘۗۧۘۘۢۙۦۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-736130077)) {
                                            case -1248158109:
                                                str2 = "۬ۦۨۖۜۡۘۡۥۨ۬ۧۘۘ۟ۨۦۘۥۢۤۧ۠ۦۤۗۦۢ۠ۙۡۗۢۦۨۘ۠ۨۡ";
                                                break;
                                            case -1072028921:
                                                str2 = "ۤۥۙۗۡۗۤ۫ۛ۠ۛ۠ۨۘۚ۟ۖۚۥۥ۫۫ۥۙ۠ۡۜۜۨۖ۫۟ۗۡۥۘ";
                                                break;
                                            case -250591040:
                                                str3 = ElfinFloatView.OooOoo0(this.OoooOoO).getVisibility() == 0 ? "۬ۤۘۘۥ۠ۥۢۢۖۘۢۨۘۘۛۤۚۘ۠۫ۦۘۖۥ۠ۛۗۡۛۛۤۢۦۨۘۜۚۦۜۦۛ" : "ۚ۫ۘۘۜ۬۬ۛۧۜۘۘۧۛۘۡۘۘۨۡۘۘۤۦۜۗۤۘ۟ۙ۠ۤۘ۟۟ۢۥۤۗ";
                                                break;
                                            case 359080556:
                                                str3 = "ۨۥۘ۟ۛۛۨ۫ۦۘۚ۬ۥۤۜ۬ۢ۠۫ۦۡۤ۬ۖۘ۬ۢۨ۫ۚۨۙ۠۠ۨۘۚ۫ۖۘۧ۟ۜۘۚۜۖۘۨۚۜۗۨۥۘۚۥۤ";
                                                break;
                                        }
                                    }
                                    break;
                                case 2122174544:
                                    str = "ۡ۬ۡۘۥۤۘۡ۫۠ۤۢ۬ۧ۫ۧۥۤ۠۠۟ۙۙۜۧۘ۠ۡ۠ۥۚ۫ۙۜۤۜ۫ۥۧ۠ۜ۠ۥۢ";
                                    continue;
                            }
                        }
                        break;
                    case -478753047:
                        return true;
                    case 219853046:
                        ElfinFloatView.OooOooO(this.OoooOoO).start();
                        str = "ۚۖۦۘ۬ۘ۠ۙۛۧۥۤۘۘۢۤۢۖ۠۬۬ۙۥۘۨ۬ۘۘۘۨۧۘۥۙۘۨۡۥۘۘۛۖۙۧۢ۟ۥۧۤۗۚ۠ۥۡ";
                        break;
                    case 264166420:
                        this.OoooOoO.Oooo00o(false);
                        str = "ۗۗۡۗۥۜۡۤۗۦۚۖۘ۬ۧ۬۬۬ۦ۫۠ۥۨۚ۠ۨۥۢۡۜۘ۠۟ۜۘۚۖۛ۟ۚۥۢۖۗۥۘۨۖۗۛۙۖۙۛۡۤ";
                        break;
                    case 749954788:
                        this.OoooOoO.Oooo00o(true);
                        str = "۠ۦۖ۬ۨ۫ۙۜۥۙ۟ۨۘۗۧۥۢۨۙۦۡۦۚۜۦۛ۟ۘۦۚ۟ۘۡۖۘۖۦ۟ۚۨۖ۫ۧۜ";
                        break;
                    case 1274996417:
                        String str4 = "ۛۛۢ۠ۛۡۧۡۡۘۡۨۥۚۧۦۘۚۦۖۦۗ۬۬ۛۥۘ۬ۚ۫ۡۧۤۙ۠۫۬۫ۦ";
                        while (true) {
                            switch (str4.hashCode() ^ 227812508) {
                                case -1956739518:
                                    str = "ۙۡۤۙۦۥۜۚۦۘۚۢۘۘۢۙۙۘۥۨۖۙۧۜۨۛۡ۬ۦۘ۠ۗۢ۠ۡۘۘۥۘۦۛ۟ۡۜۖ۟ۤۤۙ۟ۚۚ";
                                    continue;
                                case -522753322:
                                    str = "ۙۢۚۗۡۦۘ۬ۤۨۜۖۛۗۤۧۗۦۧۘۦ۬ۨۜۜ۫۟۟ۚ۬ۘۨۘۧۧۧۤۚۖ۠ۦۖۘۢ۠۠ۛۨۡۖ۫۫";
                                    continue;
                                case 1566191107:
                                    String str5 = "ۛۤۦۘ۠۠ۥۘ۫ۚۧ۬۠ۛۜۜۘۚۢۘۘ۠۬ۦۘۦ۟ۛۜۦۙۢ۬ۧ۠ۡۘۦۡ۬ۚۡۙۡ۬ۛۡۖۛۜۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ 817503391) {
                                            case -1172519132:
                                                str5 = ElfinFloatView.OooOOOo(this.OoooOoO).getVisibility() == 0 ? "ۢۗۖۛۡۗۨۥۚ۬ۨۤۛۦ۬۫ۖۤۡۢۥ۠ۢ۠ۤ۟ۗۙۡۦۘۛۥۘۤۥ۠ۥۚۖۥۨۢۜۦۚۖ۟ۙ" : "ۚ۫ۜۘ۬ۨۢۡۙۘۦ۟۫ۖۗۦۡۨۘۘۘۢۡۨ۫ۨ۫۟۫ۤۜۚ۫ۛۛۛ";
                                                break;
                                            case -886903627:
                                                str4 = "۫ۤۦۘۙ۬ۤۢۘۤۥ۫ۡۘۜۘۧۘ۫ۧۢۚۘ۬ۖ۟ۖۘۘۥۤۢۚ";
                                                break;
                                            case 797466023:
                                                str5 = "ۨ۠۟ۢۘۜۦۛۨۘۥۦۛ۬ۧۙ۬ۡۨۘۜۡۖۙۢۥۙۜۛۗ۟ۥۘ۠ۚۥۥ۫";
                                                break;
                                            case 1095135913:
                                                str4 = "ۘۖۜۘۨ۟ۜۦۡۘ۟ۜ۫ۚۗ۟ۧۛۘ۠۟۫۫ۖۧۨ۬ۘۘۜۛۜۘۛۢۘۘۧۨۗ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1818292798:
                                    str4 = "۬ۜۘۘۙ۫۫ۛۛۥۘۡۘۤ۟ۤۛۦۡۤ۬ۙۨۘۜۗۦۘ۫ۙۛ۫ۚۥۜ۫ۖۘۙۜۘۧۖ۠ۡۙۖۘ";
                                    break;
                            }
                        }
                        break;
                    case 1336804969:
                        ElfinFloatView.OooOOOo(this.OoooOoO).setVisibility(8);
                        str = "ۙۢۚۗۡۦۘ۬ۤۨۜۖۛۗۤۧۗۦۧۘۦ۬ۨۜۜ۫۟۟ۚ۬ۘۨۘۧۧۧۤۚۖ۠ۦۖۘۢ۠۠ۛۨۡۖ۫۫";
                        break;
                }
            }
        }
    }

    public class OooOo00 implements C3940h7.OooOO0 {
        public final ElfinFloatView OooO00o;

        public OooOo00(ElfinFloatView elfinFloatView) {
            this.OooO00o = elfinFloatView;
        }

        @Override // p285z2.C3940h7.OooOO0
        public void OooO00o(Object obj) {
            String str = "ۛۢۨۖۜۛۡۛۖۤۗ۫ۤۚۗۜۡۧۘۤۤ۠ۥ۬ۜۘۧۚۥۘۧۘ۬ۥ۠ۜۘۜۘۦۘ۟ۥۤۦۧۥۘ۟ۢ۟ۛۙ۠";
            while (true) {
                switch ((((str.hashCode() ^ 37) ^ 477) ^ 447) ^ 1730742731) {
                    case -2077884418:
                        return;
                    case -878900490:
                        str = "ۙۗۘۙۥۡۗ۠ۥۘۡۦ۟ۛۡ۬۟ۙۚۜ۫ۧ۫ۗ۬ۘۨۘۖۡۨۛۘۛ۬ۦۚۡۙۢۗۧۗ";
                        break;
                    case 1040213412:
                        ElfinFloatView.Oooo000(this.OooO00o, false);
                        str = "ۢۗ۟ۢ۬۟۠۟۫ۧۡۧۘۥۢۛۡ۠۠ۙۙۛۚۘۨۥۢۤۧۘ۟ۦۘ۠ۦۧۖۚۦۙۛۧۥۦۖۚۘۡۘۤۥۛ۟ۨۘ";
                        break;
                    case 2089031541:
                        str = "ۖۦ۫ۤۤۜۧۘ۟۬ۙۤ۫ۤۦۢ۫ۚۦۘۜۥۦۢۙۙۧۖۢۘۜۡۗ۠ۜۨۡۘۘۥۘۘ";
                        break;
                }
            }
        }

        @Override // p285z2.C3940h7.OooOO0
        public void OooO0O0() {
            String str = "ۢۛۘۗ۠ۦۘۚۘۖ۟ۜۘۜۨۚۚ۠ۨۥۨۜۖۥۤۥۚۧۚۛۘۚۚۜۦۜۧۤ۫ۥۚۢۧۙۦ۫ۘۥۘ";
            while (true) {
                switch ((((str.hashCode() ^ 748) ^ 726) ^ 510) ^ 71867877) {
                    case -1613997142:
                        return;
                    case 27414055:
                        ElfinFloatView.Oooo000(this.OooO00o, false);
                        str = "ۚۨۥۘۤۧۚۘۘۧۗۜۖۙۤۙ۬۟ۜۨۥۖۙۚۢۜ۫ۢ۬ۥۖۖ۬ۢۜۨ۟ۛ۠ۥۦۧۧۧۜۦ۟۬ۡۘۢ۬ۚ۠ۡۡ";
                        break;
                    case 1491402260:
                        str = "ۛۦۜ۟۬۟۬ۥۖۘۡ۠ۘۘ۠ۢۢ۠ۦ۫ۛ۫ۜۚۡۡۘۖۦۦ۬ۦۘۘ";
                        break;
                }
            }
        }
    }

    public static class Oooo000 extends Handler {
        private WeakReference<ElfinFloatView> OooO00o;

        private Oooo000(ElfinFloatView elfinFloatView) {
            this.OooO00o = new WeakReference<>(elfinFloatView);
        }

        public /* synthetic */ Oooo000(ElfinFloatView elfinFloatView, OooO0OO oooO0OO) {
            this(elfinFloatView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ElfinFloatView elfinFloatView = null;
            int i = 0;
            String str = "ۛۚۤۨۤ۠ۡ۟ۧۙۧۧۡ۟ۜۘۦ۠ۜ۬ۡۦۜ۫ۛۘۡۤۤ۫ۥۘ";
            while (true) {
                switch ((((str.hashCode() ^ 897) ^ 960) ^ 691) ^ 994994673) {
                    case -2069555960:
                        i = message.what;
                        str = "۬ۛۜۘ۟۠ۜۘۦۥۧۘۖۛۖۘۙۥۜۛ۠ۙۘۢۡۘۧۚۛۖۢ۠ۢۡۥۥۥۖۘ۬ۦۘۡۚۡۘۗ۠ۨۤۖۘۢۙۙ";
                        break;
                    case -1305481707:
                    case 463548607:
                        str = "۠ۧۡ۫ۚ۠ۖۙۨۧ۠۠ۧۧۢۢۥۘۜۧۗ۬ۖۡ۟ۛۗۖۙۗۤۚ۠ۥۚ۠ۢۖۘۗ۬ۧ۫ۡۤۨۧ۫ۘۦۗۘۛۦ";
                        break;
                    case -1025468062:
                        str = "ۢۗۨۘۚۨ۟ۦ۟ۖۖۜۘۨۧۗۡ۠ۥۘ۫ۗۤۖۡ۫۫ۙۜۨۜۘ۬۬ۥۛ۫۟۫ۜۘۦۚۤۢۥۛ۠ۛ۠ۨۨ۬ۘۡۘ";
                        break;
                    case 88004756:
                        return;
                    case 354949379:
                        ElfinFloatView.OooO00o(elfinFloatView);
                        str = "۫ۨۚۜۘۚ۠ۖۘۢۦۥ۬ۘۚۜ۠ۦۘۘۗۘۨۛ۬ۥۡۤۜۘۖ";
                        break;
                    case 415294633:
                        str = "ۘ۫ۢ۫ۤ۟ۜۙۛ۠۠ۥۙۗۤۜ۫ۗۛ۫ۚۗ۠۫ۙۥۡۦۜۘۧ۠ۙ۟ۢۥ";
                        break;
                    case 434803119:
                        ElfinFloatView.OooOOo0(elfinFloatView);
                        str = "۠ۧۡ۫ۚ۠ۖۙۨۧ۠۠ۧۧۢۢۥۘۜۧۗ۬ۖۡ۟ۛۗۖۙۗۤۚ۠ۥۚ۠ۢۖۘۗ۬ۧ۫ۡۤۨۧ۫ۘۦۗۘۛۦ";
                        break;
                    case 1068522566:
                        String str2 = "ۖ۟ۦ۫۬ۖۘۧۨۘۘۡۧ۟۫ۚ۟۫ۥۘ۫ۙۙ۟۟۟۟ۧۥ۫ۥۘۤ۬ۙ۟ۦۙ۠۬ۦۘ۫ۛۛ۫ۚۘۜۡۘۥۚۙۙۢۘ";
                        while (true) {
                            switch (str2.hashCode() ^ (-899004566)) {
                                case -1273992690:
                                    str2 = "ۨۡۜۜ۬ۤۘ۬ۨۘۖۨۦۘۗۙ۠ۢۤ۬ۥۧۙۙۢۦ۬ۡۨۘ۟ۢۥۖ۬ۡۛۙۜ";
                                    break;
                                case -158032241:
                                    str = "ۥۥۦۘۚۨۘۦۘۡۖۡۜۘۛۨۨۤ۫ۥۘۛ۬ۧۦۛۘۡۚۜۧۚۨۘۗۜۨۥ۫ۨۘۛۦۚۜۚۗۢۗۥۘۧ۫ۧ";
                                    continue;
                                case 1592892300:
                                    String str3 = "ۗۦۨۘ۬ۦ۟ۥۨۘۚۗ۬ۡۢۗۡ۫ۜۤۧۦۘ۬ۚ۬ۚ۬ۦۘ۠۬ۤۥۦ۠۬۬ۤۛ۬ۨۘۗۢۜ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 1259025672) {
                                            case -526793844:
                                                str3 = i != 1000 ? "ۡۢۦۨۙ۫ۛۘۘۡۜۧۜۦۢۢۢۘۙۘۨ۟ۖۙۖۙ۟ۗ۬ۖ۫ۦۦۘ۠۫ۘۘ" : "ۤۢۥ۟ۗۙ۫ۧ۟ۜۨۜ۬ۧ۬ۙ۬۟ۖ۫ۜۘۘۙۦۘ۠ۥۚۚۦ۠ۖۚ۬۟ۤۢ";
                                                break;
                                            case 136261120:
                                                str2 = "ۨۦۘۖۥۧۘۢۡ۠ۨۤۨۘۢۢۨۤۨۜۗۥۘۚۤۧۛۥۤۘۜۧۘۖۢۨۘۛۡۙۖۨۘۚ۠ۥ۬ۚۚۨ۫ۡۘۚۛۦۦۢۖ";
                                                break;
                                            case 610086772:
                                                str3 = "ۧ۬ۨ۠ۛۡۘ۬ۡ۠ۨۙۜۖۚۚۢۗۘۘۧۚ۟ۧۘۖ۟ۨۜ۟ۨۗۨۚۖۘۜۗۛ۬ۢۗ۠ۘۧۘ";
                                                break;
                                            case 612469362:
                                                str2 = "ۜۥۡ۟ۖ۫ۡۖۡۘ۠ۢ۠ۘۜ۫ۡۜ۬ۤ۫ۧۜۜۘۙۧ۬ۨ";
                                                break;
                                        }
                                    }
                                    break;
                                case 2071464072:
                                    str = "ۚۚۘۘۥۥ۠۠ۨۥۜ۠ۤۗ۫ۦۖۛۦۚۚۜۘۤۜۨۘۖۘۖۦۘۨۘ۠ۙۙۦۛۡۘ";
                                    continue;
                            }
                        }
                        break;
                    case 1360462308:
                        super.handleMessage(message);
                        str = "ۥۨ۠ۖۤ۬ۡۖۜۜۘۢۢۖۚ۬۫۬ۢۗۡۘۛ۫ۡۘۛ۟ۘۥۧۡۘۖۜۘۜ۬ۖۛۜۧ۫ۛ۬";
                        break;
                    case 1375761529:
                        String str4 = "ۧۧۖۘۤ۫ۥۢۨۘۛۛۨۜۙۖۘۗۤۨۤۧۥۘۨۦۗۚۚۘۘۖ۬ۗ";
                        while (true) {
                            switch (str4.hashCode() ^ (-1302981831)) {
                                case 230925854:
                                    str = "۫ۡۘۘ۫ۥۖۘۤۜۦۡ۬ۥۥۡۦ۠ۙۡۡۖۧ۟ۖ۫ۡ۬ۖۜۘۧۗۢۖۦۚۛۥ۬۫ۧۖۨۙ۫ۥۧۦ۟";
                                    continue;
                                case 347867668:
                                    str4 = "ۥۢ۬ۤۤۛۚۛۥۘۦۚۙ۬ۢۛۢۚۗۖۘۡۥۨۥ۟ۜۘۦ۬ۦۘۨۥۡۘۦ۬ۜۘ";
                                    break;
                                case 670122225:
                                    String str5 = "ۚۦۙۘۦ۟۟ۦۤۚۢۖۨۙۜۡۥۦۚۜۤۖۗۥۥۧۘۚۗۦ";
                                    while (true) {
                                        switch (str5.hashCode() ^ 242446217) {
                                            case -1415627803:
                                                str4 = "۫ۖۘۗ۠۫ۛۤۤۧۦۗۢۛۡۘۥۦۦۥ۟ۥۙۙ۬ۦۧۜۦۧۤ۬ۘ۟۫ۦۥۘۦۙۦۤ۠ۧ";
                                                break;
                                            case -1211801755:
                                                str5 = "ۨۙۨۧۥ۠ۚۛ۫ۛۨۨۘۙۙۨۜۚۦ۠ۢۦۛۨۤ۬ۘۢۗۤۤۦۨۥۘۥ۬۠ۧۙۧۥۦۖۘۧ۬ۦۗ۫۟ۗۙۗۗۜ";
                                                break;
                                            case -520562744:
                                                str5 = i != 1001 ? "ۛ۫۬ۙۘۦۦ۟ۡۘۚۙۤۤۙۢۖۤۥ۟۠ۖۜۧ۫ۘۦۛۦۙۛۜۙۚۘ۟ۜۜۡۛۜۨۡۘۖ۠۫ۙۡۧۘۡۘۨۘۜۘۢ" : "ۢۛۙ۫ۗۧۤۢۦۘۙۦۖۥ۫ۜۚۡۘۘ۠۫ۦۘۤۨۨۘۜ۠ۤۧۖۜ۫۠۟ۖ۠۠ۡۗۗۧۦ۬ۦ۬ۥۜۡۘ";
                                                break;
                                            case 1687384448:
                                                str4 = "ۡۗۧ۫ۤۥۘۗۗۨۘۛۤۛۤۦۥۙۤۤۙۡۦۗۥۡۖۗ۟ۛۥۨۘۥ۫ۗ۬ۤۡۘۦۖۖۤۥۧۘ۠ۖۥۘ۟ۛۚۚۘۚۢۧ۫";
                                                break;
                                        }
                                    }
                                    break;
                                case 1713525350:
                                    str = "ۗۛۧ۫ۖۘۨ۟ۜۘۢۖ۟ۧۧۥۘ۬ۚۚۗۜۨۡۤ۫۟۠۫ۨۜۧۘۢۢۖۢۛۛۖۖۧۘ۠ۢۖۘۙۙ۠";
                                    continue;
                            }
                        }
                        break;
                    case 1813729886:
                        str = "ۗۚۖۘۙۚ۟ۙۤۥۗۘۚۛۚۜۘ۠ۥ۟ۜ۟۫ۗ۠ۚۖۡۥۖۧۖۘۗۗ۟ۡۤ۠۬ۙۢۚۙۖۘ۠ۖۚۛۨۡ";
                        elfinFloatView = this.OooO00o.get();
                        break;
                }
            }
        }
    }

    static {
        String str = "ۘ۫ۥۘۨۖۥۤۨۥۘ۟ۚۚۢۙ۫۬ۡ۫ۙۢ۬ۘۧۛ۟ۙۧۙۧۗۢۖۛۧ۠ۨۗۗۥۘۦ۫ۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 472) ^ 881) ^ 537) ^ 1018226856) {
                case -1601948312:
                    o00000o0 = ElfinFloatView.class.getSimpleName();
                    str = "ۖۤۚۡۦۥۘۤ۟ۘۘۖۥۥۛۦۦۥۚۤۤۙۖ۟ۤۦۘۘۛ۠ۛۧۡ";
                    break;
                case -1219339555:
                    o0000OOo = 0L;
                    str = "ۗۢۖۘۤۚ۠ۢۙۜۢۨۡۘۡۚۖۘۧۘ۟ۖۦۨۦ۟ۘۘ۬ۚۢۙۧ۟۠ۖۛۢۜۘۚۜۧۥۗۛۢ۟ۘۘۚۦ";
                    break;
                case -97326690:
                    return;
            }
        }
    }

    public ElfinFloatView(Context context, DeleteFloatView deleteFloatView) {
        super(context);
        this.o0ooOOo = true;
        this.o0ooOoO = true;
        this.o0Oo0oo = false;
        this.o0OO00O = new Oooo000(this, null);
        this.o0O0O00 = new OooO0OO(this);
        this.o000OOo = new OooO0o(this);
        this.o000000 = new Handler();
        this.o000000O = new OooO(this);
        this.o000000o = new OooOO0(this, 7000L, 1000L);
        this.o00000 = new OooOOO0(this);
        this.o00000O0 = new OooOOO(this);
        this.o00000O = new OooOOOO(this);
        this.o00000OO = 0;
        this.o00000Oo = new OooO0O0(this);
        this.Ooooo00 = context;
        Oooo0oo();
        Oooo();
        this.o0OOO0o = deleteFloatView;
        this.o000000o.start();
        j10.OooO0o().OooOo00(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        this.Ooooo00.registerReceiver(this.o00000Oo, intentFilter);
        this.Ooooo00.registerComponentCallbacks(this.o000OOo);
    }

    public static /* synthetic */ float OooO(ElfinFloatView elfinFloatView) {
        String str = "ۢ۟ۧۡۙۜۘۧۨۛۗ۠ۡ۟ۙۨۘۗۦۥۘۧۜۦۘۗۨ۠ۨ۟ۤ۬ۢۥۘۢۤۚ۫ۛۡۘۜۧۤۧۜ۫ۡۧ۬ۧۜۖۘۦۚۥۘۥ۬ۗ";
        while (true) {
            switch ((((str.hashCode() ^ 246) ^ 438) ^ 909) ^ (-1215924651)) {
                case -810866944:
                    return elfinFloatView.OooooOo;
                case 2112913770:
                    str = "ۥۚۖۘۚۡۜۘۗۦۥۘۤۢۥۘ۫ۦۨۘۘ۠ۦ۫ۛ۫ۖۛۨۘۡۗۧۧۘۙ۫ۨۙۢۡۘ۠ۙۛۥۜۧۜۙۜۘۘۙۦۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooO00o(ElfinFloatView elfinFloatView) {
        String str = "ۚۙ۬ۤۦ۠ۤ۟ۥ۫ۙۗۦۙۖۡۛۘۢ۬ۙ۠ۜۖۘۨۤۧ۠ۥۨۦۛۧۤۜ۠ۜۨۖۘ۟ۚۗۢۨ۟ۛۚۜۢ۬ۘۙۡ";
        while (true) {
            switch ((((str.hashCode() ^ 640) ^ FrameMetricsAggregator.EVERY_DURATION) ^ 641) ^ (-57834406)) {
                case -800814320:
                    str = "ۨۖۡۘۗۡۚ۠۟ۡۥۨۚۗ۫۠ۦۖۢۚ۫ۨۘ۬۟ۖۘۧ۫ۡۘۚۥۖۘ";
                    break;
                case 647018420:
                    return;
                case 1542089536:
                    elfinFloatView.Oooo0o0();
                    str = "ۢۖۚ۫ۥۖۛۡۗۦۙۢۖۤ۬ۗۢۦۦۤۚۛ۫ۖۘۗۚۘ۟ۚۛۦ۠ۗۛ۟ۘ۬ۙۢۗۨۦۘۜۢۜۙ۬ۘۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooO0O0(ElfinFloatView elfinFloatView) {
        String str = "ۨ۬ۤ۫ۗۡۘۦۚۢۗۛۜۙۢ۟۠ۜۘۜۧ۟ۤۡۥۦ۫ۨۡۘۙۨۛۖۘ۬ۛۘۖۛۗۜۧۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ C3793d8.OooOOo) ^ 828) ^ 461) ^ 1154409141) {
                case -1665975035:
                    elfinFloatView.OoooOOO();
                    str = "ۙۖ۫ۧۢۡۘۖۧۚۦۥۛ۠۟ۧۗۘۧ۟ۚۢ۟ۙۤۘۥۥۘۘ۬ۙ";
                    break;
                case -47406218:
                    str = "ۥۦۡۤ۠۫۬ۨۘۘۚۜۘۘۢۨۧۘۘۛ۫ۜۨۥ۠ۨۘ۫ۦۧۘۚۗۨۘۙۙۦۘۘۚۘۘ۫ۦۜۨ۫ۡۡۨۚ۠ۢ۟ۥۡۚۨۡ۠";
                    break;
                case 243523948:
                    return;
            }
        }
    }

    public static /* synthetic */ float OooO0OO(ElfinFloatView elfinFloatView) {
        String str = "ۗ۬۫ۛۡۧۘۗۗۖۘ۬۫۟۫ۢۥۚۜ۟ۦۥۖۛۘۜۚۚۖۘ۬ۜ";
        while (true) {
            switch ((((str.hashCode() ^ 634) ^ 759) ^ 715) ^ (-1197850485)) {
                case -240220457:
                    str = "ۘۛۘۦ۟۠ۜۜۗ۬ۤۥۘ۟۬ۖۘۢۜۥۖ۠ۢۢۥۘۧۛۢۖۤۜۗۤۜۛ۫۟ۤ۬ۗۧ۫۬ۛۖۢۥۜ۫ۢۧۧۥۖۘ";
                    break;
                case 679524729:
                    return elfinFloatView.Ooooo0o;
            }
        }
    }

    public static /* synthetic */ float OooO0Oo(ElfinFloatView elfinFloatView, float f) {
        String str = "۬ۜۛ۬ۤۡۘۗۖۖۘۢۤۘۘۧۧۜۚ۟ۨۘ۠ۢۘۘۜۧۘۘۜۡۡۘۢۦۢۥ۟۫۫۟ۤۗۜۘۦۜۢۢ۟ۥۡۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 848) ^ 451) ^ 619) ^ (-830225813)) {
                case -1113198274:
                    str = "ۖۡۦۢۤۗۥۦۘۘۗۦۘۜۤۥۘۤۙۖۨۨۙۧ۠ۜۘۦۙۜۘۦۡۡۘۗۨ۠۫۬ۨۘۙ۟۟ۤۜ۫ۤۘۛۘۗۤ";
                    break;
                case -1028476686:
                    elfinFloatView.Ooooo0o = f;
                    str = "ۙۧ۟ۙۥۛۚۜۚ۫ۜۧۘۙۥۘ۟ۧۗ۫ۤۚۙۗۧۧۚۛۖۘ۟ۘۥۛ۟ۘۖۘ";
                    break;
                case 502587390:
                    return f;
                case 809748945:
                    str = "ۡ۟ۤۗۤ۠ۡ۫ۜۘۚۙۥۘۥۗۘۜ۟ۦۘۡ۟ۤۘ۬ۢۘۜ۬ۜۦۗۥۜۘ۬ۘۥۘ۫ۢۛۛۡ";
                    break;
            }
        }
    }

    public static /* synthetic */ float OooO0o(ElfinFloatView elfinFloatView, float f) {
        String str = "ۧۚۜ۠ۡۖۘۡۧ۫ۢۨۚۖۘۡۨۧۘۘۨۘۦۘۦۘۤۙۘۛ۫ۢۥۙۡ۟ۜۚۘ۫ۛۥۘۜۙۥۘۧۘۦۘۚۘ۬";
        while (true) {
            switch ((((str.hashCode() ^ 434) ^ 832) ^ 313) ^ 21996910) {
                case -1835129526:
                    elfinFloatView.OooooO0 = f;
                    str = "ۡۢۖ۠ۥۤۗۤ۟ۖۚۡ۫ۥۙ۟ۙۖۘۜۙۥۥ۫۬ۢۨۡ۫ۥ۟ۙ۟ۨۘ۠ۡۨۘۤۖ۬ۧۥۥۘۦ۫۟ۘۛ۠";
                    break;
                case -1654175172:
                    return f;
                case 510542387:
                    str = "ۤ۠ۡۢ۬ۤ۬ۡۥۘۚۤۡۘ۠ۦۤۨ۬ۦۢۤۤۜۡۗۧۥۡۘۧۤۨ۬۠ۜۘۙۗۚۙۧۧۢۨۨۘ";
                    break;
                case 767776898:
                    str = "ۗۙۥۥۘۥۘ۠ۢۖۘۨۜ۫۫ۢۖۘۦۡۢۖ۫ۢۘۥۢۤۙۛۨۦۨۘۡ۠ۖۘۘۢۢ";
                    break;
            }
        }
    }

    public static /* synthetic */ float OooO0o0(ElfinFloatView elfinFloatView) {
        String str = "ۦ۬ۥ۫ۨۤۘۥۥۦۜۨۘ۫ۢۦۙ۟ۚۘۨۤ۫ۜ۫ۙۨۗۧۢ۫۫ۖۨۘۗۦۨ";
        while (true) {
            switch ((((str.hashCode() ^ 817) ^ 816) ^ 863) ^ 2145805043) {
                case -1827274719:
                    return elfinFloatView.OooooO0;
                case -1277216616:
                    str = "ۜۥ۟ۦۙۜۘۥ۫ۘۘۨۛ۟۫ۡۨۘۡۧۖۘۤۛۡ۫۫۟۫۟ۖ۠ۜ۠ۦۦۘۥ۟";
                    break;
            }
        }
    }

    public static /* synthetic */ float OooO0oO(ElfinFloatView elfinFloatView) {
        String str = "ۖۥۚۥۗۡۘۖۧۜۖۨۜۤۘۥۘۥ۫ۜ۠ۖۡۖۜۘۘۤۤۙۡۥۛۛۖۧۖۦۢ۫ۚۢۖۧ۫۬۠ۖۘۛۘۙ";
        while (true) {
            switch ((((str.hashCode() ^ 61) ^ 557) ^ 770) ^ (-626586878)) {
                case -1729092970:
                    str = "ۘۚۧۛۦۥۤۜۛۛۡۡۙ۠ۥۤۤۦۤۧۦۘۙۧۥۗ۠ۖۙۦ۫ۚ۫ۥۡۚۡۘۧ۫ۡۘۡۦۡۘۤۥۧۘۤ۠ۜۘ";
                    break;
                case 419550423:
                    return elfinFloatView.OooooOO;
            }
        }
    }

    public static /* synthetic */ float OooO0oo(ElfinFloatView elfinFloatView, float f) {
        String str = "ۖ۠ۢۘۗۡ۟ۙۨۘۛۖۧۘۙۦۗ۟ۡۦۘۚۘۙۙۢۧۡۛۥۖۙۗ۬ۛ۠ۤۚ";
        while (true) {
            switch ((((str.hashCode() ^ 161) ^ 776) ^ 322) ^ (-387816156)) {
                case -256501835:
                    elfinFloatView.OooooOO = f;
                    str = "۫ۖ۬ۧۤۢۜۚۖۘۙۤۖۘۢۖۨ۟ۢۥۤۨۘۧۛۨۘۖۢۦۚۡۥۘۧۘ۬ۡۗۖۘ";
                    break;
                case 228244023:
                    return f;
                case 432824835:
                    str = "ۚۜۦۗۚۖۥۛۤۧۜۘۜۡۡۧۙ۫۟ۚ۟ۢ۬ۢۧۧ۠ۙ۠۬";
                    break;
                case 892250450:
                    str = "ۦۡۖۘۥۨۖۘۢ۫ۡ۟ۢۙۦۙ۟ۥۥۨۥ۫ۤۚۢۗۨۗۜۘۗۜۥۘۙ۬ۦۘ۟ۢۘۘۘۨۙۥۢۧۘۡ۠ۤۢۨ";
                    break;
            }
        }
    }

    public static /* synthetic */ float OooOO0(ElfinFloatView elfinFloatView, float f) {
        String str = "۬ۨۥۘۚۙۥۜۛۨۨۚ۠ۤ۫ۖۘۜۨۦۖۛۨۘ۬ۧۖۨۚۖۘۢۢ۠";
        while (true) {
            switch ((((str.hashCode() ^ 970) ^ 970) ^ 833) ^ 123180908) {
                case -261430410:
                    str = "ۨۖۜۡۛۙۘۡۘۧۥ۬ۨۗۜۖۙۚ۬ۘۡۘۘۡۡۚۜ۬ۖ۠ۨۘۖۦ۬ۤۚۥۡۧۜۘۨۜۗۦ۬ۖۢۜۥ";
                    break;
                case 379038172:
                    return f;
                case 1364358706:
                    elfinFloatView.OooooOo = f;
                    str = "ۧۨۘ۬ۢ۟ۦۤۨ۬ۨۢۛۨۛۦ۫ۡۚۗۘۘ۬ۢۨۘۖۘۖۘۡ۬ۦۡۖ۠ۤۨ۠۠ۡۗۢۜۘ";
                    break;
                case 1479677421:
                    str = "۟ۢۤۚ۟ۢۜۨۥۘ۬ۜ۬۠ۗۡۖۚۘ۟ۚۤۧۥۜۛۖۘۢۥۤۜۨۖۘۨۥۖ۠ۗۘۤ۠۫۟ۦۥ۫ۥۢ";
                    break;
            }
        }
    }

    public static /* synthetic */ float OooOO0O(ElfinFloatView elfinFloatView) {
        String str = "ۤ۬ۜۢۢۨۘ۬ۤۢۨۢۗۚ۬۫ۗۘۗۤۢۨۖ۠ۗۡۛۚۨۤۚۙۗۘۚ۬۬۠ۤۘۖۚۡۘۡ۫ۡۘ۬ۙۗ";
        while (true) {
            switch ((((str.hashCode() ^ C1801a.f11011aV) ^ 676) ^ 944) ^ (-1421256386)) {
                case -608508276:
                    str = "ۢۙۡ۫ۘۘۙۨۗۜۨۡۘۡۧ۬ۖ۠ۖۘۥۨۛۢۙۢۚۡ۠۟ۘ";
                    break;
                case -290632876:
                    return elfinFloatView.Oooooo0;
            }
        }
    }

    public static /* synthetic */ float OooOO0o(ElfinFloatView elfinFloatView, float f) {
        String str = "ۧۧ۬ۖۛۢۡۨۨۘۤ۠ۗۦۜ۠ۙۨۨۘ۬ۗۛۦۤۦ۫ۤۤ۠ۨۚۖۜۤۚۚۥۘ۫۬ۘۡۜۜ";
        while (true) {
            switch ((((str.hashCode() ^ 323) ^ 163) ^ UiMessage.CommandToUi.Command_Type.GET_UIP_DATA_VALUE) ^ 556770914) {
                case -1798970623:
                    elfinFloatView.Oooooo0 = f;
                    str = "۟ۦۨۘۧۡۜۘۤ۟۬ۙۜۥۘۗۦۙۙۢۛۖۚۗۨۛ۫ۥۗۜۘ۠ۙۡۘۜۜۨۘۜ۟ۡ۠۠ۨۘ۫۫۬ۤۘۖۧ۬۫";
                    break;
                case -867083783:
                    str = "ۡۜۨ۟۬ۢ۟۬۬ۗۤۘۚ۠ۢۡۦ۫ۧۚۗۚۗۛۦ۠ۘۦ۟ۦۛ۠ۡۙۘ۟۫ۦ۟ۤۘۘۧۡۜۘۖ۠۟ۗۛۜۘۨۡۖ";
                    break;
                case -598130072:
                    return f;
                case 252262422:
                    str = "ۚ۟ۜۘۥۚۢۖ۟ۗۘۚۘۤۦۧۘۙۥۖۘۦۚۖۘۖۢۡۘۚۖۖۛ۟ۦۘۗۦۧۘۧۧ۠ۖۚۧۙۛۡۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ float OooOOO(ElfinFloatView elfinFloatView, float f) {
        String str = "ۥۖۚۘۗۗۙۜ۠ۜ۟ۘۘۚۧۛۦۜۚ۠ۜۥۥ۬۬ۧۜۘ۠ۗۚۤ۬ۘۛۗۧۙۡۘ۟ۡۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 832) ^ 71) ^ 189) ^ (-239200188)) {
                case -1686567344:
                    elfinFloatView.Oooooo = f;
                    str = "ۦۢۡۘ۟۟ۙ۬ۦۥۘۢۢۥۘۥ۬ۧ۟ۥۗ۬ۡۘ۟ۥۢۡۖۛۨۡۘ";
                    break;
                case -1182162916:
                    str = "۬۫ۨۘۧۧۘۘۙۚۤۚۛ۠ۖ۬ۡۦ۫۟۠ۥۘ۟ۙۜۘۘۥۜ۬۟ۡ";
                    break;
                case -408539561:
                    return f;
                case -166767239:
                    str = "ۛۖۥۘ۬ۜۜۛۖۨۘ۬ۙۜۘۦۛ۟ۨۖۗۖۧۡۢۜۘ۫ۤۨۘۜۚۡۘۘۥۢۙۢۨۘۗۡۚۧۘۦۦ۫ۨۘۖۤۛ";
                    break;
            }
        }
    }

    public static /* synthetic */ float OooOOO0(ElfinFloatView elfinFloatView) {
        String str = "ۗ۫ۥۘۜۦۗۖ۬ۤۘ۠ۨۥۘ۫ۥۙ۟۠ۦۘۤۗۨۤۡ۟ۨۚۚۥۙۛۦ۬ۗ";
        while (true) {
            switch ((((str.hashCode() ^ 998) ^ 314) ^ 806) ^ 1317568533) {
                case -963111503:
                    str = "ۖۚۧۨۧۧۛ۟ۨۘ۬۠۟ۙ۫ۤۘۘۨۧۗۢ۠ۙۦۘۨۛۚۨ۟ۗ۬۬ۧۧۡۧ۫ۜ۫ۖۗ۫۬ۚۦۡ";
                    break;
                case 431081346:
                    return elfinFloatView.Oooooo;
            }
        }
    }

    public static /* synthetic */ void OooOOOO(ElfinFloatView elfinFloatView, int i) {
        String str = "ۢ۠ۘۘۦۥۘۘۗۗۘۘۧۘۛۙۦۢۢۧۢۢۦۡۘۨ۠ۚۛۖ۟ۗۚۛۛ۠ۘۘۥ۟ۥۛ۟ۨ۟ۚۧ";
        while (true) {
            switch ((((str.hashCode() ^ 649) ^ 1014) ^ 13) ^ 484113115) {
                case -206698851:
                    str = "ۚۥۡۘۡۗۨۘ۫ۛۦۘۡۥۥۡۙۡۜ۬ۡ۬ۚۛۙۨۖۘۘ۠۫ۧۢۢۛۧۡۜۜۧۘۤۗۛۛۘۘۘ۠ۧۤۖۦۢ";
                    break;
                case 26142017:
                    str = "ۢ۬ۖۘ۠ۛۥۘۢۥۜۘۥۘۧۘۤۡۥ۟ۘۖۘۚۙۤۨۡۡۘۚ۬۬ۥۙۘۘۙۗۤۛۙۖ۟ۛۡۢۦ۬";
                    break;
                case 778929522:
                    return;
                case 1828634142:
                    elfinFloatView.OooooO0(i);
                    str = "ۢۗۙۨۜۦۘ۬ۨ۟۬ۛۥ۟ۢۚۖ۬۟ۘۜۖۗۜ۫ۘ۫ۚۨۚۡۦۢۤۙۦۨۘۗۤۖۡۢۖ۬ۦۦۘۙۨۜ";
                    break;
            }
        }
    }

    public static /* synthetic */ DeleteFloatView OooOOOo(ElfinFloatView elfinFloatView) {
        String str = "ۗۗ۠۟ۨۦۘۥۦۨۨۤ۟۠ۡ۠ۧۡۘ۠۫ۨۧۜۢۤۡۗۦ۬ۗ";
        while (true) {
            switch ((((str.hashCode() ^ 110) ^ 832) ^ 106) ^ (-278504828)) {
                case 657846754:
                    return elfinFloatView.o0OOO0o;
                case 1456936189:
                    str = "ۢ۠۟۬ۧۨۘۚۗ۬ۡۥ۬ۙۚۖۢ۠ۚۦ۟ۖۘۛۦ۫۟ۛۦۖ۟ۨۘۦ۬ۡۘۖۗۘۘۛ۬ۦۚ۟ۛ۬۬ۦۙۙ۟";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean OooOOo(ElfinFloatView elfinFloatView) {
        String str = "ۙ۬۟۠ۨۡۘۖۤۜۘ۠ۙ۟ۢۛۙ۟ۥۖۨ۬۟۬ۖۚۤۜۧۘۢ۠ۢۘۤۡۘۗۨۨۛ۫ۚۙۡۥۘۨۥۜۘۜۤۨ";
        while (true) {
            switch ((((str.hashCode() ^ 866) ^ 633) ^ UiMessage.CommandToUi.Command_Type.GET_FW_ENABLE_VALUE) ^ (-1356039806)) {
                case -581932399:
                    str = "ۥۚ۠ۖۙۡۦۚۡۡۙۘۚۢۥۘۙ۫۬ۜ۫۬ۢ۠ۘۘۦۖۥ۠ۗۜ";
                    break;
                case 966072626:
                    return elfinFloatView.OoooO00();
            }
        }
    }

    public static /* synthetic */ void OooOOo0(ElfinFloatView elfinFloatView) {
        String str = "ۧۧۖۨ۫ۜۘۙۥ۟ۗۥۧۘۙۥۖۛۦ۟ۤ۫۫۠ۡ۟ۧۧۥۗۤ۠۫۫ۥۘۦۖۤۨ۫ۤ۟ۙۦۡۙۙۛۗۢ";
        while (true) {
            switch ((((str.hashCode() ^ 163) ^ 661) ^ 797) ^ (-934192075)) {
                case -1628199706:
                    return;
                case 547873404:
                    str = "ۙ۟ۨۘ۠۟ۡۘ۫ۖۦۚ۫ۤ۟۠ۤۛۗ۟ۤ۟ۡۛۦۖ۠ۢۖۚۗۛۡ۟ۘ۟ۛ";
                    break;
                case 1140134877:
                    elfinFloatView.OoooO0();
                    str = "ۨۦۚۖۘۚۗ۟ۜۖۘ۬۠۫ۡۖۖۛۦۗ۬ۡۖۘۛۙ۬۬ۖۥ۬ۥۤۤۖۢۥۨۛۙ۠ۖۘۤۚۘۘۜۘۚ";
                    break;
            }
        }
    }

    public static /* synthetic */ ViewOnClickListenerC4272q6.OooO0O0 OooOOoo(ElfinFloatView elfinFloatView) {
        String str = "ۜۦۡۘۖ۫ۦ۫ۘۘۘۡۥۗ۟ۙۗۜۡ۫ۜۡ۠ۜۧۖۥ۠ۥۘ۟ۚۛۧۚۜۗۧۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 53) ^ C4589yr.OooO0O0) ^ 432) ^ 215143469) {
                case -1031272531:
                    return elfinFloatView.o00000O0;
                case 565924078:
                    str = "ۡۖۡۘ۟ۗۤ۠ۗۧۚۙۨۘ۟ۖۤۥۛۘۧ۬ۜۘ۬۠ۥۥۧۜۘۨ۠ۗ";
                    break;
            }
        }
    }

    public static /* synthetic */ DialogC4346s6 OooOo(ElfinFloatView elfinFloatView) {
        String str = "۬ۜۜۘۗۜۡۘۖۨۧۛۢۨۘۥ۟ۘۘۘۡ۬ۘ۠ۤ۠ۧ۠ۛۖۗۙۛۡۘۦۖۦۖ۫ۦ۬ۚ۟ۚۖۥۘۥۗۡۚ۠ۚ";
        while (true) {
            switch ((((str.hashCode() ^ 163) ^ 992) ^ 547) ^ 1928237997) {
                case -525595366:
                    str = "ۗۙۙ۟ۘۡ۟ۗۨۘ۠ۢۥۘۨۢۚۚۜۦۘ۠ۦۘ۠۠ۤۤۘۚۥۦۡۘۛۛۘۘ۫ۜۙۛۜۖۤ۠ۨۘ";
                    break;
                case 2073793234:
                    return elfinFloatView.o00o0O;
            }
        }
    }

    public static /* synthetic */ void OooOo0(ElfinFloatView elfinFloatView) {
        String str = "۫ۨۡۘۖۡۘۖۥۛۛ۬ۨۘۦ۫ۜۘۗۙۤ۟ۗۥۜۨۛۥ۬ۥۘۙۜۨۘۜ۠ۥ۬۫ۗۘۧۖۘۖۖۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 686) ^ UiMessage.CommandToUi.Command_Type.SET_FW_SMOOTH_VALUE) ^ 613) ^ 732016915) {
                case -1677681753:
                    elfinFloatView.OoooOO0();
                    str = "ۗۤ۠ۤۘۧۤ۟۟ۨۜ۬ۨۧۡۘۗۤۛۗۥۨ۫۠۠ۡۛۘۦ۟ۦۦۜ۬ۤۢۖۨۥۘۨۘ۟۠ۘۜۘۧ۫ۢ";
                    break;
                case -215279403:
                    str = "ۜۡۖۘۦۧ۬ۙۤۜۥۖۖۘ۟ۧ۟ۨ۠ۧ۫ۗۙۖۘۗۙ۬ۖۦۧۧۤۘۘۤۗ۠ۖۜۜۘ۠ۨۤ۠ۦۗۚۗ۟ۖۨۜ۫ۤ";
                    break;
                case 1812115987:
                    return;
            }
        }
    }

    public static /* synthetic */ ViewOnClickListenerC4272q6.OooO00o OooOo00(ElfinFloatView elfinFloatView) {
        String str = "ۖۡ۬ۘۥۥۘۘۡۧۡۚۦۘۢۘ۟ۖۥۤۛۖۧ۫ۛۜۖۢۚۛ۟۬ۢۢ۬ۦۨۙۥۤ۬ۡ۟ۧۙۖۜۨۜ";
        while (true) {
            switch ((((str.hashCode() ^ 788) ^ 730) ^ 977) ^ 1505046832) {
                case -1820537748:
                    return elfinFloatView.o00000O;
                case 430466961:
                    str = "ۤۜۦ۬۬ۨۛۧۜۦۛۦۘۡۨۘۘۙ۟۠ۢۤ۫ۢۙ۠ۖۡۘ۬ۗۜ۠ۚۗۥ۠ۘۦۨۚۤۖۧۘ۬ۘ۟۫۠ۖۦ۟ۡۡۛۖ";
                    break;
            }
        }
    }

    public static /* synthetic */ ViewOnClickListenerC4383t6 OooOo0O(ElfinFloatView elfinFloatView) {
        String str = "۫ۙۛۛۙۦۘۙۜ۫ۥۖۜۘ۫ۗۙۧۤ۫ۛۨۖۦۡۨۦۜ۟ۢ۟ۦ";
        while (true) {
            switch ((((str.hashCode() ^ 987) ^ 480) ^ 706) ^ 566216279) {
                case -824869069:
                    str = "۫ۜۗ۬ۙۨۘ۟ۡۦ۠ۦۡۦۨ۬ۙۢ۠ۨۤ۠ۧ۟۠۠ۛۗ۬ۜۗۙ۟ۛۢۨ۫ۤۨۘۢ۬ۨۥۚۘۦۤۖۘ";
                    break;
                case 1682269981:
                    return elfinFloatView.o00Ooo;
            }
        }
    }

    public static /* synthetic */ ViewOnClickListenerC4383t6 OooOo0o(ElfinFloatView elfinFloatView, ViewOnClickListenerC4383t6 viewOnClickListenerC4383t6) {
        String str = "ۚ۫ۡۘۛۘۨۘ۫ۢۡۛ۬ۧۗۡۥۘ۫۫ۥۚۗۥۘۧۢۥۙ۬۬ۢۧۥ";
        while (true) {
            switch ((((str.hashCode() ^ 322) ^ 792) ^ 341) ^ (-1637097262)) {
                case -1727271545:
                    str = "ۛۗ۬ۡۦۡۘۚۢۖۘۡۛ۠ۡۦ۫ۤۗۡ۬ۥۧۗۛۙ۟ۘۘۘ۟ۡ۫ۤۢۦۘۜ۫ۨۘۧ۟۬ۥۧۨۙۖۤۤۥۙ";
                    break;
                case -1344244962:
                    str = "ۘ۟ۥۧۧۚۦۤۥۘۤۦ۠ۤۡۥۢۡۘۘۛۨۜۚ۬ۗۖۙۛ۟ۢۖۜۤۡۘۡ۠ۥۘ";
                    break;
                case -84903387:
                    elfinFloatView.o00Ooo = viewOnClickListenerC4383t6;
                    str = "۬ۙۜۘۖۚۡۧۚۡۘۢۚۥۘۖۡ۠۫۫۟۬۬ۤۧ۬ۜۛۚ۠ۜ۬ۘۘۙۦ۫۬ۜۘۘۙۖۨۘۧۢۖۘۨۢۚۨۥۧۘ";
                    break;
                case 384398492:
                    return viewOnClickListenerC4383t6;
            }
        }
    }

    public static /* synthetic */ WindowManager.LayoutParams OooOoO(ElfinFloatView elfinFloatView) {
        String str = "ۡۜۧۘۙۡۜۘۡۖۦۙۚۤۗ۟ۢ۟ۛۤۗۡۢۜۦ۟۠ۙۦۘۘۘۙۢۨۡۚۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 178) ^ UiMessage.CommandToUi.Command_Type.SET_IMAGE_VIEW_VALUE) ^ UiMessage.CommandToUi.Command_Type.SET_LINE_VALUE) ^ (-440339406)) {
                case -974068196:
                    str = "ۥ۟ۨ۬ۖۨۙۖۧۘۛ۟ۢۦۗۜۖۖۧۥۤ۫ۨۦۦۗۘۙۗۧۗۗۨۘ۫ۛۨۘ۠ۦۤۙۚۡ";
                    break;
                case -548804066:
                    return elfinFloatView.OoooOoo;
            }
        }
    }

    public static /* synthetic */ DialogC4346s6 OooOoO0(ElfinFloatView elfinFloatView, DialogC4346s6 dialogC4346s6) {
        String str = "ۢۨ۬ۧۙۨ۟۠ۦۘ۟ۘۜۧ۠ۛۧ۬۬ۨ۟۟ۢۤۡۘ۬ۧۡ۬ۜۗۛۗۘۘۧ۠ۛ۟ۘۙۨ۫ۡۙۨۨۘۤۙۧ";
        while (true) {
            switch ((((str.hashCode() ^ 333) ^ 251) ^ 5) ^ 131938153) {
                case -1612671466:
                    str = "۠۟ۖۘ۫ۦۢۙۚۜۘۘ۠ۤۢۖۜۗ۫ۦۘ۬۠ۜۘۖۜۨ۟۬ۢۡۦۦۘ";
                    break;
                case -247508842:
                    str = "ۢۨۜۥۧۛۨۨۛ۟ۖۛ۠ۗۡۘۘۘۜۘۡۛۢ۟ۦۦۘۘۡۨۜۨۥۛۨۧۗۤۗۚۚ۠ۨ۫ۥۗ۬ۘۘ";
                    break;
                case 805912021:
                    elfinFloatView.o00o0O = dialogC4346s6;
                    str = "ۥۜ۫ۡۢۗۤۢۦۛۧ۬ۛۖۛ۫ۨۜۘۜۤۦۘ۟ۦۜۧۙۘۦۧۜ۟ۜ۬ۨ۟۟";
                    break;
                case 1335205936:
                    return dialogC4346s6;
            }
        }
    }

    public static /* synthetic */ WindowManager OooOoOO(ElfinFloatView elfinFloatView) {
        String str = "۠۠ۨۤۖۧۘ۟ۘۢۥۢۛۢۢۡ۬ۚۙۜۖۨۘۤۚۨۘۡۥۜۖ۫ۥۘۧۥۡۘ۫ۦۥۘۥۜۙۛۚۙ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_RADIO_GROUP_VALUE) ^ SubsamplingScaleImageView.ORIENTATION_270) ^ 189) ^ (-1391664548)) {
                case -1698991774:
                    str = "ۘۘۜۘۦۛ۬ۖ۠ۛۤۗۥۤۘۖۗۢۚۧۦۡۢۥۨۗ۫ۨۚۢ";
                    break;
                case 1390645587:
                    return elfinFloatView.OoooOoO;
            }
        }
    }

    public static /* synthetic */ void OooOoo(ElfinFloatView elfinFloatView) {
        String str = "ۤۥۢۧۖۥۘ۟ۚۥۚۜۙۦۜۧۘۡ۟ۡۘۤ۬ۡۘۘۥۘۖۗۥۘ۬۟ۢۜ۟ۘۘ۠ۧۡ";
        while (true) {
            switch ((((str.hashCode() ^ 703) ^ 695) ^ 751) ^ (-10278732)) {
                case -1254213513:
                    return;
                case -1120837814:
                    elfinFloatView.Ooooo0o();
                    str = "ۥۖۘۘۤۨۥۘ۟ۜۘ۟ۤۡۘ۟ۧ۬ۤۥۜۘ۬ۘۙۦۚۦۘۧۥۖۛۥۡۢۚۥۘۡ۬ۖ۬۬ۥۚۧۖ";
                    break;
                case 1977103823:
                    str = "ۢۤۙۖۙۥۘۧ۬۟۟ۙۜۘۥ۠ۨۘۙۢۨۘ۬ۗۤ۬۫ۨۖۡۦۜۚۛ";
                    break;
            }
        }
    }

    public static /* synthetic */ LinearLayout OooOoo0(ElfinFloatView elfinFloatView) {
        String str = "ۗۗۡۘۢ۫ۙۗۜۘۤۖۨۘ۬۟ۡۧ۠ۖۘۧ۫۟ۖۜۖۛۨۡۘ۟ۦۛۡۚ۟ۛۡۨۜۤۘۘۢۥۗ";
        while (true) {
            switch ((((str.hashCode() ^ 917) ^ 445) ^ 254) ^ 1069782572) {
                case 626034392:
                    str = "۬ۗۜ۬ۜۨ۟۠ۜۘۚۖۘۘۦۚۡۤۘۜۘۤۖۥۢۘۖۦ۠ۥۘۘۛۥۘۖۙۡۧۢ۬ۥۥۡۗۛ۟ۚۚۨۘۧ۟ۡۘۤۥۡۘ۫ۗۨۘ";
                    break;
                case 948980183:
                    return elfinFloatView.o0OoOo0;
            }
        }
    }

    public static /* synthetic */ CountDownTimer OooOooO(ElfinFloatView elfinFloatView) {
        String str = "ۗۤۜۘۥۘۘۨۥۘۘۥۙۗۢۖ۫ۥ۬ۢۚۦۘۡۙۚۜۘۡۢۥۜۘۜۧۡۜۜۘۙۘۖۘ۟۠۫ۖۤۘۥۜۧۘۧ۬ۦۥۥۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 314) ^ 911) ^ 868) ^ (-591971351)) {
                case -534294328:
                    return elfinFloatView.o000000o;
                case 734627918:
                    str = "ۗۖۡ۫۠ۡۘۚۖۨۗۢ۫۬ۥۜۥۥۘۗۨۚۖ۠ۥ۟ۗۜۗ۠۠۬۬ۘۤ۫ۢۗ۠ۙۙۗ۟";
                    break;
            }
        }
    }

    public static /* synthetic */ ImageView OooOooo(ElfinFloatView elfinFloatView) {
        String str = "ۥۦۨۚۙۧۥۡۜۘ۫ۡۙۛۢۜۘۙ۟ۘۘۛۥ۬ۗۧۤۛۖ۟ۘۚۛۖۡۙۘۚۙ۫ۙۥ۫ۗ۫ۜۖ۫ۥۛۡۥۘ۬۠ۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 872) ^ 94) ^ 134) ^ 1842599558) {
                case -97358108:
                    return elfinFloatView.OoooooO;
                case 1181214922:
                    str = "Oۖۚۙۛۗ۟ۛۢۥۚۘۙ۟ۘۗۢۨۚۗۥ۠ۜۘۧۘۛۚۘۥۙۨ۟ۗۧۛۘۡۢۥۜۘ۟۫ۘۖۚۛ۬ۗۗۤۚ۫";
                    break;
            }
        }
    }

    private void Oooo() {
        WindowManager.LayoutParams layoutParams = null;
        String str = "۬ۧۡۘۜۦ۠ۡۤ۫ۨۘۧۗۗۘۘۙۡۛۚۡ۬ۛۤۨۘۗۖۙۡۨۜۧۗۗۚۛۨۘ۠ۛۛ۫ۚۖۘ";
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            switch ((((str.hashCode() ^ 129) ^ 859) ^ 80) ^ (-392360009)) {
                case -2028592512:
                    i4 = 2038;
                    str = "ۗ۫۟۠ۨ۟ۖۜۨۘۖۛۧۦۖۗۜۖۗۢۨۘۜ۫ۤۘ۠ۦۖۡۗۤۧ۫ۙۦۤۦۨۖ۫ۙۜۘ۫۫۬۫ۙۘۛۥۜۡۜۖ";
                    continue;
                case -2006180993:
                    str = "ۢۜۡ۟ۜۦۘۛۘ۬۬۠ۘ۟۟ۗۖۢۦ۫ۧۢۜۗۗۧۛۦۘۡۤۡ۫ۚۡۘۛۖۦ۠۠ۤۦۛۨۤۚۢۚۤۥۘۘۧۨۘ۫ۙۗ";
                    i3 = i2;
                    continue;
                case -1798028182:
                    str = "ۛۡۦۚۙۘۧۢۙۤۦۨۧ۫ۛۗۜۘۘ۟ۜ۟ۛ۬ۚۧۖۨۥۖۜۛۤۗۜۤۗ";
                    continue;
                case -1670295074:
                    this.OoooOoo.y = C4491w3.OooOoo0(getContext()).y / 4;
                    str = "ۡ۬ۤۧۥۘۛۛۡۜۨۘۘۙۤۦۜ۠ۚ۫ۚۤۚۗ۠۠۫ۦۘۘۛ۟ۘۨۜۘ۫ۧۜۗۗ۠ۧ۬ۚ";
                    continue;
                case -1394240401:
                    str = "ۤۗۚۡۖۤۨۛۧۛۛۨۘۘۨۨۧۖۢۥۨۖۘۖۘۤۢۡۘ۠ۦۧ۠ۢۖۥۚ۟ۜۖ۠ۖۖۜۡۧۗۡۘۤ۠ۡۘۢ۫ۙ";
                    continue;
                case -1377839868:
                    layoutParams.flags = 40;
                    str = "ۨۖۖۘۚۖۢۚ۬۟ۢۜۖۘۖ۟ۦۡۘۧۙۢۚۖۖۧۛۤۛۜۡۜۖ۠ۙۖ۟۬ۧۢۨۡۚ۫۬ۜۘ۬ۨ۠";
                    continue;
                case -1360303792:
                    String str2 = "ۥۧۛۚ۠ۘۘۖۙۜۘۧۨ۠ۦ۬ۥۘ۬ۢۨۘۛۗۘۘۡۛۦۡۢۗۙۦۦۨ۫ۖ۬ۨۢۙۘۘۧ۬";
                    while (true) {
                        switch (str2.hashCode() ^ (-172200195)) {
                            case 791061123:
                                str2 = "۫ۤۦۘۖۘۘ۬ۤۦۘۦۙۛ۠۬ۨۛ۬ۖۜۢۗۙۢۜۘۖۦۛۨ۬ۦۚۧۛۙۤۜۨۢۛۘ۫ۖۘ۠ۙ۠ۛ۠ۙۜۡۜۘۢۜۜۘ";
                                break;
                            case 1027840123:
                                str = "ۤ۠ۚۤۤ۫ۙ۫۬ۗ۟ۙۥ۫ۢۗۢۙۖۤۤ۟۫ۡۛ۠۠ۙۢۖۚۙۤ۟ۨۤۜ۠ۜۘ";
                                continue;
                            case 1066735027:
                                str = "ۙۦۜ۬۟ۧ۬ۖۘۤۙۨۘۛۗ۫۫ۖ۟ۗۘۡۢۚۘۘ۟ۖۜ۠ۗۥۘۙۛۤۢ۠ۦۘۗۘۡۨۙۥ";
                                continue;
                                continue;
                            case 1210372261:
                                String str3 = "ۦ۟۫۟۠ۗۖ۠ۖۥۖۘۘۢۥۗۦۛۘۨۖۘۦ۫ۗۖۡۘۘ۬ۡۨۨۘۛۛۘۤۦۙۜۘۚ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1481396824) {
                                        case -2053617553:
                                            str3 = i5 >= 26 ? "ۜۛۗۥۧۢۜۙ۠ۙۥۘۘۚ۬ۦۧ۟ۧۢۗ۬ۗۙۦ۠ۥۖۘۗۖ" : "۫ۤۛۧۚۤۚۘۦۘۘۥۡۗۥۛۧۥ۠ۘ۫ۖۗۡۘۤ۫۟ۢۤۚۜۘۘۥ۠ۥۘ";
                                            break;
                                        case 433387392:
                                            str2 = "ۦ۫۟ۤ۠ۡۦۢۘ۠ۙۨۚۤۤۨ۠ۨۚۨۜۘۛۙۙۚ۠ۘۙۛۜۘۦ۬ۙۧ۟ۡ۬ۥۜ۫ۧۨ۟ۤۖۖۛۥۢۛۨۥۙ۠";
                                            break;
                                        case 1488877581:
                                            str3 = "۫ۗۡۜۖۜۖۜۨۘ۬۫ۥ۬ۡۚ۫ۘ۟ۜ۫ۙۦۨۨۧۦۚ۫ۛۗ";
                                            break;
                                        case 2085538061:
                                            str2 = "ۜۦۜۘۧۡ۠ۜۡۤ۫ۦۜۘۖۡ۬ۗۖۘۘ۫۬ۦ۠ۖ۟۟ۢۗۘ۠ۥۘۥۜ۬ۙۚۥۘۛ۬ۘۘۖ۫ۘۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1147877950:
                    this.OooooO0 = C4491w3.OooOoo0(getContext()).y / 4;
                    str = "ۜۧ۠ۗۢ۫ۘۨۢ۠۫ۢۖ۟۟۠ۜۢ۠ۧ۬ۗۜۘ۫ۤۥۘ۟ۨۛۦۧۤۚۨۨۥ۠ۨۘۖۡۢۥ۫۫ۚۨۦ";
                    continue;
                case -1077235448:
                    layoutParams.format = 1;
                    str = "ۤۢۨۥۚۘ۫۠ۖۘ۟ۥۡۗ۬ۦۘۡۜۦۘ۬ۥۧۘ۠ۥ۠ۜۨۘۖۧۜۘۨۘۛۖ۠ۖۘۢۡۘ۬ۜ";
                    continue;
                case -635748856:
                    String str4 = "۫ۖ۬ۦۖۧ۠۫ۨۘۡۛۛۧ۫ۦۘۘۚۧۚۙۡۘ۠ۧ۫ۛ۟ۛۜۖۘۤ۬ۛۗۡ۠۬۬۬ۥۘۥۚۧۘۘ۫ۘۖۙۡۖۢۛۥ";
                    while (true) {
                        switch (str4.hashCode() ^ (-628792164)) {
                            case -564535332:
                                break;
                            case 216317629:
                                str4 = "۟ۤۧۖۗۛۧۢۨۧۧ۫۬۬ۘۥۥۦۘ۬ۧۖۘ۠ۤۖ۟ۢۗۢ۠ۥۡۘۥۜۡۥۘ";
                                break;
                            case 248467598:
                                str = "۠۠ۚۖۥۘۡ۫۬ۖۡ۬۬ۜۖۗۡۡ۬۟ۙۡ۫ۚۘۗۚۤۨۥۘۖۙۡۘۢۗۙۨۗ۠۠ۨۜۢۡۧۢۢۨۘۨۦۜۨ۬ۘ";
                                break;
                            case 1868946759:
                                String str5 = "۠ۗۜۜۡۢۚ۟ۧۛۖۘۤۢ۟ۥ۫ۖ۬۬ۖۘۨۤۛۖۖۖ۠ۛۨۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1520995299)) {
                                        case -1265697087:
                                            str4 = "۟ۙۚۛ۬۟ۘ۬ۖۘۗۖۚۧۘۧ۬ۢۙۧۦۢۙۥۥۤۖۦۥۥۛ";
                                            break;
                                        case -1239451078:
                                            str5 = "۠ۚۥۘۛۢۨۘۛۚۘ۟۫ۖۨۥۡۘۛۨۥۨۥۖ۟ۨۘۗۢ۟ۢۦۨۢۘۘۦۜۡۚۡۡۘۙۦۥ";
                                            break;
                                        case 880385873:
                                            str4 = "ۖ۬۟۫ۥۖۘۚۤۜۘۙۨۖۧۧۢۗ۫ۧ۬ۨۘۧۛۦۢ۬ۖۘۖ۫ۥۘۛۖۧۘۤۥۨۘۛۧۖ۫ۚۥ";
                                            break;
                                        case 1202319291:
                                            str5 = i5 < 24 ? "۠۬ۖۘۥۧۨۚۛۨۦ۬ۜۘۧ۬ۡ۟ۦۜۚ۟ۡۘۜ۠ۢ۬۬۬ۙ۬ۡۡ۠۫ۖ۠ۘۘ۬ۚۥۘۢۘۚ" : "۫ۛۦۘۤ۬ۙ۠ۦ۟۠ۛ۫۫ۖۙۡۖ۟ۥۖۜۥۘۧۤۦۘۘۥۤۜۛۦۦۘ۠ۚۢ۫۠ۖۘ۬ۤۦۘۖۨ۠۬ۘۖۘۜ۠ۛۡۥۧ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -515300622:
                    this.OoooOoO = (WindowManager) getContext().getSystemService("window");
                    str = "ۤ۫ۥۜ۟ۥۘ۫ۙۤۙۦۨۘۘۗ۫ۜۙۡۧۧ۬ۥۦۛۧ۟ۛۜۘۨۘ۬ۥ۠ۦۨۘۡۙۖۘۖۖۘۛۥۘۘۧۚۜ۠ۖۡۛ۫ۦۘ";
                    continue;
                case -487206318:
                    str = "۠۟ۡۧۙۡۗۖۖۨۛۧۙۚۖۖۖۡۦۗۤۢ۫ۘۘۡۢۗ۫ۧ۟۠۫ۧ۠ۜۦ";
                    i3 = i4;
                    continue;
                case -487072937:
                    str = "ۦۘۧۥ۠ۖۘۖۥۙۛۚۙۚۙۜۘ۬ۖۡۧ۟۬ۢ۟۫۬ۖۢۧۢۡ";
                    i2 = 2005;
                    continue;
                case -460749171:
                    str = "ۗۚۨۘۘ۟۠ۗۜۘ۠ۧۘۘ۫ۚۦۘۥۡ۟ۚۛۧۖ۟ۤۢ۠۬ۚ۠۬۫ۡۢۜ۟ۚ۫ۢۤۖۥ۫ۙۛۖۢۥۡۘۢۜ۟ۛۤۢ";
                    i5 = Build.VERSION.SDK_INT;
                    continue;
                case -403752676:
                    layoutParams.type = i3;
                    str = "ۜۛۗۥۗۘۦۘۦۜۦ۠ۚۥۧۗۜ۟ۦۜ۫ۗۖۥۢۢ۟ۨۨۘۥ۠ۢۦۜۦۘ۬ۛۜۘۢۤۛ";
                    continue;
                case -202037310:
                    str = "ۤۗۨۘۡ۠ۙۘۘۘۚۗۘۘ۫ۡ۫۫ۘۖۘ۫ۥۙ۠۠۟ۤۦۗۢۗۨۡ۫ۜ۠ۧۜۘۜۙۦۚ۬ۦۥۗۙ";
                    i3 = i;
                    continue;
                case -18472897:
                    layoutParams.x = C4491w3.OooOoo0(getContext()).x - this.Ooooooo.getLayoutParams().width;
                    str = "ۦۦۤۗۨۢۧۥ۟ۧۖۨۘ۠۠ۤۛۚۡۙ۬۟ۖ۠ۢۤۧۡۘۧۤۢۥۢۥۧۦۤۘۙۖ۬ۡ۫ۜۢۥۢۜۘ۫ۜ۫ۧۙۖۘ";
                    continue;
                case 135301622:
                case 2040452956:
                    str = "۠۟ۡۧۙۡۗۖۖۨۛۧۙۚۖۖۖۡۦۗۤۢ۫ۘۘۡۢۗ۫ۧ۟۠۫ۧ۠ۜۦ";
                    continue;
                case 442410187:
                    layoutParams.gravity = 51;
                    str = "ۥۡۜۘۢۚۗ۬ۧۦۘۛ۟ۛۛۥۜۘۧۦۤۡ۫ۨۖ۟ۤۡۘۘۦۖۚ";
                    continue;
                case 588509742:
                    i = 2002;
                    str = "ۡ۬ۛۤۛۚۧۙۥۘۤۗۜۘ۫ۘۛ۫ۦۘۢ۟ۨۥ۬ۘ۫ۜ۠ۢۧۗ";
                    continue;
                case 621805146:
                    this.OoooOoo = layoutParams;
                    str = "ۛ۠ۥۦۗۨۘۗ۟ۤۦۗۦۘۨ۟ۦۛ۠۬ۨۙۦ۠ۦ۟ۖۧۨ۟ۦۢۦۦۘۡۢۦۘۥ۠ۜۦۙۜۘۤ۬ۘۡۤ";
                    continue;
                case 710399454:
                    return;
                case 831437326:
                    str = "۫ۜۡۙۤۨۦۥۛۘۘۗۗۘۨۘ۬ۛۤۢ۟۫ۖ۟ۨۧۜۨۥۦ";
                    layoutParams = new WindowManager.LayoutParams();
                    continue;
                case 1213119888:
                    this.OoooOoo.height = this.Ooooooo.getLayoutParams().height;
                    str = "ۛ۫۫ۘ۫ۛۥۛۥۘۛۗۘۘ۟ۖۜۘۖ۠ۙۡۡۥ۬ۖۖۘۧۗۥۘۧۡۧۘۜۜۘۥۛۢ۫ۚ۟ۢۡۙۙۖۧۘۗ۫ۘ";
                    continue;
                case 1855588161:
                    String str6 = "ۚۙۦۢۦۥۘۗۥۜۤ۟ۖۡۡۜ۟ۡ۫ۙۙۥۘۖۡۖۘۧۨۥۜ۠۠ۜ۬ۡۘۧۜۨۘ۫۬ۜۘۡ۠ۚ۠ۖۘ۬ۥۨۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 100892408) {
                            case -2137715075:
                                str6 = "ۖۦ۠ۙۙۙۜ۫ۥۤ۠ۜۘۦ۠ۧ۠ۥۡ۫۠ۖۘۧۛۖۘۦۡۨۗ۫ۖۘ";
                                break;
                            case -1345564150:
                                break;
                            case -1297573158:
                                str = "ۘۚ۟ۘۤۤۤۗۖۙۚۨ۟۟ۢۘۙۤۚۜۚۢۦۥۙۥۘۤۥۖۘۧۗۘۘۙۡۡۘ";
                                break;
                            case -329602191:
                                String str7 = "۫ۤ۟ۧۦۧۘۗ۬۟ۨۚۛۨۨۡۘۡۡۤۦ۟ۤ۬۟ۙۢۦۨۡ۬ۤ۟ۗۦۘ۟۫۟";
                                while (true) {
                                    switch (str7.hashCode() ^ (-478530849)) {
                                        case -1883237100:
                                            str7 = "۠ۥۖۘۛۜۛ۟ۤۨۙۢۧۤۘۘۤۢۖۧۗۢۛ۬ۘ۠ۤۥۘۤۥ۠ۙۦۘۨۡۜۘ";
                                            break;
                                        case -101392970:
                                            str6 = "ۥۛۦۦ۬ۘۘۧۨۥۤ۫ۛ۟ۙۡۨ۠ۤۢۖۥۚۙۤۥۥۥۢۦۖۖۘۥۘۢۘۨۘۤۚۨۘۧ۫ۗ۫ۘۜۘۖ۬ۗ";
                                            break;
                                        case -50719362:
                                            str7 = i5 >= 19 ? "ۚ۠ۗۨۙۦۘ۬ۡۘۘۛ۠ۘۡۡۡۤۨۨۘۡۚۤۜۦۧۘۙۤۙۗۙۖۡ۫ۤۖۦۖۘ" : "ۜۚۧۡۜۦۘۘۦۡۘۤ۟ۖ۟۟ۦۘ۫ۘۧۘۙۦۖۨ۠ۨ۠ۦۜۘۥۢۗۜۤۖۘۚۥۜۜۢ۬ۦۧ۟ۡۥۘۘۧۙۤۚۨ۟۫ۥۤ";
                                            break;
                                        case 302891568:
                                            str6 = "ۤۖۨۚ۫ۛ۫ۙۦ۬ۡۖۘۙ۬ۢ۫۬ۜ۠ۤۘۛۗۘۤۢۨۜۜۙۖۦۘۛ۟۠ۘۢۘ۟ۧۢۨۡۧۦ۫ۨۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 2146285741:
                    this.OoooOoo.width = this.Ooooooo.getLayoutParams().width;
                    str = "ۡۘۙۦۛۜۘ۬۫ۜۡۡۘۧۨۢۧۛۛۧۤۙۡۗۜۨۗۖۘۨۧۢۦۜۖۛۖۡۘۢۡۨۘۗۡۨۢ۠ۧۨۚۢۤۧۨ";
                    continue;
            }
            str = "ۘۤۧۡۗ۬ۗۤۤۡۢۘۘ۟ۖۥۘۦ۠ۦۘۚۚۦۘۙۛۜۘۚ۬ۘۜۡۨۘۢۦۜۚ۫ۡۛۛۜۘۖۦۡۘ";
        }
    }

    public static /* synthetic */ boolean Oooo000(ElfinFloatView elfinFloatView, boolean z) {
        String str = "ۧۦۙۙۡۖۚ۫ۧۚۤۦۘۥۗۘۘۚۗۧۨ۬۟ۢۚ۠ۛ۬ۛۢۨۗۚ۬۬ۙۧ۠ۨ۠ۦۘۦۢۡ";
        while (true) {
            switch ((((str.hashCode() ^ 361) ^ 313) ^ 644) ^ (-1291321548)) {
                case -453094432:
                    str = "۫ۖ۠ۡ۟۠ۛۘۘۖ۬ۖۚۛۧۚۚۤۘۗۡۘۙ۬ۨۢۘۖۥۘۦۧۧۢۘۛ۫";
                    break;
                case 405956456:
                    elfinFloatView.o0Oo0oo = z;
                    str = "ۨۥۨۨۗۤۧۜۘۨۙۚۜۘۛ۠ۧۦ۠ۥۖۘۢۖۖۢۧۡۘۚۘۘۘ";
                    break;
                case 522585285:
                    return z;
                case 2084187189:
                    str = "ۨۨ۟ۘۛ۟۬ۖۢۢۧۜۖۜۘۚ۟ۛ۠ۚ۬ۨۧ۟ۢۛ۫ۧ۫۬ۧۦۚۡ۫ۨۘۦۨۦ۫ۙۡ";
                    break;
            }
        }
    }

    private void Oooo00O(boolean z) {
        boolean zIsScriptStarted = false;
        int i = 0;
        C4014j7 c4014j7OooO0O0 = null;
        String str = null;
        boolean zIsScriptStarted2 = false;
        int i2 = 0;
        C4014j7 c4014j7OooO0O02 = null;
        String str2 = null;
        C4014j7 c4014j7 = null;
        int i3 = 0;
        String str3 = null;
        String str4 = "ۥۧۨۘۙۙۛۖۢۡۛۧۖۘۙۤۚۘۧۥۘۡ۬ۡۘ۬ۘۡۧۘۦۧۥ";
        while (true) {
            switch ((((str4.hashCode() ^ 595) ^ 654) ^ 278) ^ 822893770) {
                case -2067431158:
                    str4 = "ۧۡۧۦۖۨۘۛ۟ۧۢ۬ۙۚۥۚۢۘۡ۬ۡۡۜۘۘۘۜۘ۫۠";
                    str3 = str;
                    break;
                case -1931926794:
                    str4 = "۫ۚۧ۠۬ۜۘ۟ۚۦۨۡ۬ۧ۫ۥۘ۬ۗۤۙ۠ۚۛ۫ۤۡ۟ۥۘۢۡ۠ۢۛ۬ۢۖ۫ۡۛۘۨۛۛۧۥۦ۬ۘۨ۟ۖۘۚۛۜۘ";
                    c4014j7 = c4014j7OooO0O02;
                    break;
                case -1724914924:
                case -860869915:
                    str4 = "ۤۜۡۦۢۡۘۨۡۤۜۗۡۘۘۛۨۘۚۦ۬ۧۖ۠ۘ۫ۤ۬ۥۦۘۘۧۛۢۙ۬ۗۦۚ۫ۖۨ۬۠ۘ";
                    break;
                case -1620792858:
                    str4 = "ۛۙۨۘۨۧۖۘۜۗ۫ۡۨ۠ۛۘۘۘۥ۠۟ۚۛۥۡۥۘۛۘۤ۠ۥۨ";
                    i3 = i2;
                    break;
                case -1616579579:
                    c4014j7OooO0O02 = C4014j7.OooO0O0();
                    str4 = "۠۟۫ۥۡۢ۠ۙۖۘۖۜۧۖ۫ۥۘۙۙ۫ۥۤۚۦۚۗ۫ۖۢ۬ۜ۬ۜۚۖ۟ۚۜۘۛۛۗۛ۟ۖۧۘۦۨۢۤ";
                    break;
                case -1405915912:
                    i2 = 1002;
                    str4 = "ۡۜۥۙۚ۬۫ۥۜ۬ۛۖۛۘۘۗۤۧۧ۫ۜۙۜۡۘۦۗۨۘۖۢۚ";
                    break;
                case -1287768701:
                    String str5 = "ۚۦۧۘۚۧۜۘۛ۠ۡۚۘۖۗۗۗۥۤۘۧ۠ۨۘ۠ۨۧۘ۬۬ۢۧۚۧ۠ۥۛ۟ۧۧۙۖۖۘۡ۫ۤ۟ۧۛۡ۬ۧۗ۬۠ۥۗۤ";
                    while (true) {
                        switch (str5.hashCode() ^ 248378631) {
                            case -2130731491:
                                str4 = "ۛۙۤ۟۫ۤۙۡۜۘ۠۟ۚۧ۟ۖۘۖۛۘۙۘ۫ۤۛۡۥ۬ۛۘۥۜۘۥ۠ۜۘۜۦۘ";
                                continue;
                            case -761427653:
                                str5 = "ۤۡۤۡ۫۟ۖۤۤۙ۬ۥۚ۬ۜۘۛ۬ۛۛ۠۟ۛ۬ۤۖۚ۟ۨۨ۟ۛۛۡۗ۠ۥ۠ۤۡۦۡۘۙۜۢۚۗ۬";
                                break;
                            case 1238447597:
                                String str6 = "ۚۨۥ۟ۘۖ۟ۥۘۦۛۢۦ۬ۖۚۙۚۧۤۜۖۚ۫ۜۥۧۘۡ۟ۙ";
                                while (true) {
                                    switch (str6.hashCode() ^ (-1206068161)) {
                                        case -2084858094:
                                            str5 = "۫۬ۙۜ۬ۖۨۘۡۘ۟ۚ۫ۖۤۨۘ۠ۨۘۥۧ۟ۗۥۘ۟ۚۨ۟۟ۧ";
                                            break;
                                        case -761692709:
                                            str5 = "۟ۚۤۢ۫ۢۚۧۢۙۖۨ۠۠ۤۛۚۦ۫ۚۨۡۖۧ۫۫ۖۗ۠ۥ۬ۢۡۘۤۨۨۡۨۘۧۡۘ";
                                            break;
                                        case 173498226:
                                            str6 = this.o0Oo0oo ? "۬ۢۨۢۡۤۧۜۡۘۡۡۨۖۧۢۗ۬ۗۦۥۗۗۘۙۛۧۨۧۚ۬۫۫ۨۥۘۖۧ۠ۘ۫۟ۜ۫۫ۖۜۡۤۤۦۘۨۙۘ" : "۫ۖ۬۬۟ۤۚۢۙۦۡ۫ۢۜۡۖ۬۠ۜۡۧۛۚۤۧۜۘ۬ۖۢۦۦۗ۫ۗۨۘۚۦ۬ۖۤ۠ۖۚۜۘۗۙۨۘ";
                                            break;
                                        case 2009898090:
                                            str6 = "۠۫ۡۘۥۧۢۥۚۖۘۚۥۚۥۦۛۙۖۦۥۡۧۙۢۥۘۗۘۧۘۗ۫";
                                            break;
                                    }
                                }
                                break;
                            case 1604395801:
                                str4 = "۠ۥۦۘۨۘۡۘۗۗۢۡۘۤ۫۟ۡۙۧۧ۫ۛۛۘۨۙ۬ۚۡۜۤۦ۠ۚۧۙۨۖۥۗۖ۫ۚۡۙۤ۠";
                                continue;
                        }
                    }
                    break;
                case -1268693355:
                case 419119309:
                case 940617171:
                    return;
                case -1226647321:
                    str4 = "ۧۘۦۘۗ۬ۚ۬۠ۧۛۜۥۘ۬ۢۗ۫ۚۛۖۢ۟ۛۙ۫ۥۗۗ۟ۛۨۖۙۤۦۙۚۛۖ۠۬۫ۥۘ";
                    c4014j7 = c4014j7OooO0O0;
                    break;
                case -976921275:
                    C3753c5.OooO0OO(getContext(), getContext().getString(R.string.network_off));
                    str4 = "ۛۥۨۘۙۥۛۤۛۘۘۖۦۘ۫ۤۖۤۤۡ۬۠ۦۘۧۢۖۢۧۦۘۙۗۙۘ۟ۤۙ";
                    break;
                case -642627722:
                    str4 = "۠ۡۥۘۚۗۨۘۛۨۗۗۡۡۙۗ۫ۢۚۤۘ۟ۦۧۛۘۤۖۖۖ۠ۜۘۜ۟ۛ۫ۨۜۙۧۡۥۡۨۘ۬ۜۖۛۜۙ";
                    break;
                case -634705678:
                    String str7 = "ۤ۫ۘۘۤۘ۠۫ۢ۟ۥۜۡۛ۠۟۟ۛۘۢۦۖ۬ۙۙۘۘۘ۬۫۬ۜۘۤۗۜ۫۫ۖۨۘۤ۬ۜۘ";
                    while (true) {
                        switch (str7.hashCode() ^ 1215997604) {
                            case -1251927247:
                                String str8 = "ۖ۠ۛۖۤۧۗۤۦۘۘۧۡۡۗۜۨ۫ۘۨۤۦ۠ۙۛ۫ۥۦۦۥۘ";
                                while (true) {
                                    switch (str8.hashCode() ^ 2129887101) {
                                        case -2111907902:
                                            str8 = z ? "ۢۡۧۦۦۢۨۨۖۙۢۡۘ۫۫ۘۘۘ۠ۥۛ۫۠ۨۡۨۘ۟۫۠۟۟ۡ۠ۧۗۜۙۡۘۨۢۦۨۢۥۘۦ۠ۘ۫ۤۖ" : "۟ۤۖۢ۬۟ۛ۠ۤۙۦۘۘۗ۠ۦۖۦۘۢۦۛۤۗ۠۠ۢۖ۬ۥۧۘۢۗ۟۬ۘۤۘۡۘۧۖ۟ۛۡۙ۫ۖۘۜۙۨۙۦ۬";
                                            break;
                                        case -1868216232:
                                            str7 = "ۚۗۚۨ۫ۨۚ۠ۡۨۙ۠ۗۖۡۘ۬۫ۚ۟۫ۡ۬۬ۖۘ۠ۜۘۡ۟ۙۗ۠ۢۖۗ۬";
                                            break;
                                        case -42193169:
                                            str7 = "ۙۜ۬ۡ۟ۤۙۙ۫ۥۘۙۛۜۘۚۥۙۥ۟ۨ۠ۥۗۙۢۘۛ۟ۜۢۨۙۨۘۘۥۛۗۛۡۤ۟ۧۘۘۚۗ";
                                            break;
                                        case 599600004:
                                            str8 = "ۢۦۦۙۤۢۥۖ۫۬ۨۥۨۜۖۘۗۛۥ۟۟ۥۘۨۗۚۨۛ۬ۛ۟ۦۦۖۥ۠ۡۨۢۢۧۥۢۙۤۦۘۛۥۦۨۤۖۗۦۧ";
                                            break;
                                    }
                                }
                                break;
                            case -257996124:
                                str4 = "ۢۙ۫ۢۥۖۘۖۛ۟۠۟ۗۦۥۘۦ۬ۜۘۗۡ۠۟ۗۙ۠ۖۦۘۦۤۘۘۨ۟۫ۤۜۥ۬ۙۨۘۧ۫ۚۡۦۗۚ۟ۢ۬ۚۖۧ";
                                continue;
                            case -22820297:
                                str4 = "ۖۧۨۘۚۜۨۧۖۦۨۨۘۗ۠ۨۤۥ۠ۦۡۥ۫ۤۢۧۤۦ۫ۛۖۗۦۥۢۜۦۘۘۙۗۘۨۡۘۜ۠ۘ۬ۘۘ";
                                continue;
                            case 305854811:
                                str7 = "ۖ۠ۨۖۗۦۘۧ۫ۢۜۡۨۘ۫ۗۘۘۦۙۘۤ۠ۛۤ۫ۚۨۗۖۘۖۡۜۘۨۤۨۘۙۤۜۘۥۛ۫۟ۨۚۙۖۨۙۗۗ";
                                break;
                        }
                    }
                    break;
                case -613176454:
                    str4 = "ۨۡۧۘ۟ۡۥۘۚ۫ۜۘۡۖۗۥۢۡۖۧۗۘۥۜۢۤۗۛۥۥۘۦۡۜۘۥۥۖۡ۠ۖۙۡۢۧۜۘۘۡۛۘۜۥۚ";
                    str3 = str2;
                    break;
                case -610485676:
                    zIsScriptStarted = MqRunner.getInstance().isScriptStarted();
                    str4 = "ۡۗۦۘۛۤۨۘۘۢۖۘۢۛۚۢۤۗ۟ۜۖۥۜۙۨ۟ۡۗ۫ۤۚۙۙۛ۫ۗۥۢۙۛۧۚۖۧۘ";
                    break;
                case -506717823:
                    str4 = "ۨۡۧۘ۟ۡۥۘۚ۫ۜۘۡۖۗۥۢۡۖۧۗۘۥۜۢۤۗۛۥۥۘۦۡۜۘۥۥۖۡ۠ۖۙۡۢۧۜۘۘۡۛۘۜۥۚ";
                    break;
                case -399944878:
                    str = "脚本正在运行中……";
                    str4 = "ۡ۫ۚۘۙۨۚۗۙۧۤۡۦۦۙ۟ۦۖۘۖۡۚۛۨۥۘۧۘۛۘۥۖۛۜ۫ۙ۫ۚ۟ۘۡۚۖ۟ۖۡۦۥۦۥۘ";
                    break;
                case -276906216:
                    String str9 = "۠ۡۛ۠ۛ۫ۖۢ۫۫۫۫ۘۚۡۘ۫۠ۖۘۧ۫ۨۘۦۜ۬ۙۤ۟ۚۨۘۧۨ۫ۜ۫ۖۛۚۗۧۛ۠ۥ۬ۚۚۖۚ۫ۡۛۧۥۧۘ";
                    while (true) {
                        switch (str9.hashCode() ^ 570255314) {
                            case -2110970304:
                                String str10 = "۬ۖۚۛ۟ۚۥۘۡۘۡ۠ۛۢۤۙۢۖ۠ۥۜۚۢۖۡ۟ۚۢۡۢۢ";
                                while (true) {
                                    switch (str10.hashCode() ^ 290198768) {
                                        case -311120353:
                                            str10 = "ۦ۠ۡۘۢۡۜۘۛۡۗۘ۬ۥۘۤۛۦۜۛۘۨۜۡۘۨۢۛ۬ۧۧۖ۬ۘۨۜۘۘۤۢ۠۫ۥ۟۠ۜۜۘۤۤۖۘ۟ۚۡۘ";
                                            break;
                                        case 184171984:
                                            str9 = "ۛۚۘۘۘۘ۟ۤۡۘۢۖۖ۠ۨۧ۟ۗۥۗ۠ۤ۬۫ۚۘۘۨ۬ۙ";
                                            break;
                                        case 1491101013:
                                            str10 = !C4381t4.OooOO0(getContext()) ? "ۧۗۡ۠ۥۖۘۢۖۘ۬ۨۢ۬۠۬ۥۤۖۘۧۜۦۖ۠ۦۘۘ۬ۨۘۨۥۦۘۥۢۗۢۦ۬ۦۗۘۘۘۡۘ" : "ۤۥۢ۠ۘۦ۠ۜ۟ۜ۟۫ۧۛ۠ۖۜ۟ۤۚۖۨۘۤۗۥۘۥۜۗۡۘۗۗ";
                                            break;
                                        case 1678597481:
                                            str9 = "ۙۜ۟ۘۛۢ۫ۦۘۜ۠ۖۘۨۧۦۘۘ۫۠ۗ۠۫۫ۜۘۘۛۤۛۤۙۢۘ۬ۢۘ۫ۥۜۖۗ۠ۨۦۡۙۥۗ۬";
                                            break;
                                    }
                                }
                                break;
                            case -1566378157:
                                str4 = "ۘۥۨۘۜۘۜۚۨۘۢۤۖۢۨ۠ۥۛۧ۟ۡ۠۫ۤۛۘۖۘ۟ۡۘۘۢۤۥۘۘۙۢۨۜۡۘ۫ۖۘ۫ۢۦۗۖۘۘ";
                                continue;
                            case -835801287:
                                str9 = "ۚۘۢۦۥۘۗۖۗۧۨۤۤۖ۫ۧ۫۬ۨۥۜۦۘ۠ۚۦۘ۫ۧۘۤۛ۬ۜۘۘۗ۫ۚۦ۬ۗ۬ۤۦۚۜۘۜ۟۠ۖۜۜ";
                                break;
                            case 1713982610:
                                str4 = "۠ۖۗۛۗۖۘ۟ۤۨۘۖۤۨۘ۠ۧۥۘ۟ۚۦۚۙۜۙۖۤ۬ۢۗۛۖۥۘۖۡۚۦۦ۠۠ۢ۟ۜۘ";
                                continue;
                        }
                    }
                    break;
                case -215986988:
                    zIsScriptStarted2 = MqRunner.getInstance().isScriptStarted();
                    str4 = "ۤۖۧۧ۟ۚۚ۬ۘ۫ۜۥۤۘۦۚ۠ۤۥۜۥۘۡۨۤ۫ۢۘۘۥ۫ۢ";
                    break;
                case -211783079:
                    i = 1001;
                    str4 = "ۚ۟ۦۘ۟ۗۘۘۗۢۘ۬۫ۥۜۙۡۘۧ۟۠ۢۗۤ۠۬۫ۨۖۘ۫۠ۡۘۙۨۡۖۨۗۤۥ۬ۦۜۤۙۘ۫۫ۡ۠";
                    break;
                case -76541279:
                    c4014j7OooO0O0 = C4014j7.OooO0O0();
                    str4 = "ۙۡۥۘۜۨۜ۫ۢۜۘۙ۬ۜۢۧۗۖ۬ۦۧۥ۠ۡۢ۫ۜۛۡۤۜۘۘ";
                    break;
                case -29905133:
                    str4 = "ۢۤ۟ۢ۠ۨۧۙۤ۬ۜ۟۟ۜۧۦۢۜۦۜ۠ۢۤۥۘۡۛۨ۬ۙۡۘ";
                    break;
                case 131086958:
                    c4014j7.OooO0oO(5, i3, str3);
                    str4 = "ۤۜۡۦۢۡۘۨۡۤۜۗۡۘۘۛۨۘۚۦ۬ۧۖ۠ۘ۫ۤ۬ۥۦۘۘۧۛۢۙ۬ۗۦۚ۫ۖۨ۬۠ۘ";
                    break;
                case 298929903:
                    String str11 = "ۦۚۜ۬۠ۜۗۡۚۘۛۥۜۤۛۛۨ۠ۘۜۧۙۙۧۛۡۗ۫ۚۥۘۙۦۙۛۖ۟۟ۥ";
                    while (true) {
                        switch (str11.hashCode() ^ 1039155953) {
                            case -935299670:
                                String str12 = "ۧۥ۟ۛۨۖ۫ۛۨۘۨۨۤۤۖۡۤۧۛۛۘۨ۬ۨۛۢۦۘۥ۟ۜۚۖۘ۬ۡۤ";
                                while (true) {
                                    switch (str12.hashCode() ^ (-862313398)) {
                                        case -162838501:
                                            str11 = "ۛۡۦۡۤ۠ۘ۬ۜۘۖۙۘۘۖۨۖۖۢۥۘۛۧۥ۫ۢۦۥۙۡ۠۫ۖۤۛۢۜۜۘۚۡۧۘۥ۫ۗۨۥۡۘۜۘۖۙ۬ۚ۬ۡۖۘ";
                                            break;
                                        case 112869594:
                                            str11 = "ۚۜ۠ۥۧۜۥۜۦۧ۟ۡۖ۟۬۬ۤۖۘۡ۬ۚۜۨۦۜ۟۠ۙ۫ۗۖۚ۠ۨ۠ۧۗۖۥ۬ۗۦۙ۬ۛۘ";
                                            break;
                                        case 1038216528:
                                            str12 = zIsScriptStarted ? "۫۠ۦۘۨۘۥۘۧۖ۠ۡ۠ۨۙۨۘۙۢ۬۬۟ۘۘ۬ۜۜۘۗۦۖۘ۬ۖۗ" : "ۛۨۗۨ۬۠ۘ۠ۚ۠ۧۘۧۙۦۗۗ۬۬ۧۘ۠ۖۖۚۨۘۜ۫ۖۥ۟ۥۙۨ";
                                            break;
                                        case 1965896267:
                                            str12 = "ۙۖۙۖۤۧۙۤ۬ۡ۠ۗۧۤۚ۬ۚ۠۠ۡ۫ۛۦۨۗۛۖۘۦۥۘۧۖۨۘۥ۟۠";
                                            break;
                                    }
                                }
                                break;
                            case -901446247:
                                str4 = "۠۬ۘۘۨۖۘۚۡۦۙ۠ۢ۫ۛۖۘ۠ۨۨۚۚۖۘۦۛ۠ۨۘۘۜۡۤۢۥۥۘۘ۬ۧۛۡۡۘۡۡۢۜ۫ۙۥۘۦۜۙۢۧۙۚ";
                                continue;
                            case -516880468:
                                str4 = "ۧ۫ۥۗ۟ۘۨ۬ۘ۬ۡ۬ۢۚۜۖۘۘۤۗۧ۬ۘ۬ۦۙۙۨۢۦۘ";
                                continue;
                            case 1667486147:
                                str11 = "ۘۢۤۥۖۛۦ۫ۡۥۨۙۛۜۜۙۥۛۥۚۘۘ۟ۚۦۢ۫ۥۗۤ۠ۢۖۚۗۗۚۖ۬۫ۖۡۗۖۢۘۘۜۛۦۘۖۨۜ۫ۧۗ";
                                break;
                        }
                    }
                    break;
                case 629877827:
                    C3940h7.OooO0o0(new OooOo00(this));
                    str4 = "ۢۙۤۗۗ۟ۢۥۘۜۦۘۤۗۦۦۛۨۡۙۡۘۦۥۨۘۛۗۜۘۥ";
                    break;
                case 686750478:
                    this.o0Oo0oo = true;
                    str4 = "۫ۡۜۘۖۥ۟ۦۙۡۜۥۥۚۤ۫۫۬ۗۥۨۖۘ۠ۘۨۘۥۥۛ۠ۢۨۘۧۧۜۛ۠ۡۘ";
                    break;
                case 783198116:
                    C4014j7.OooO0O0().OooO0oO(5, 1001, getContext().getString(R.string.network_off));
                    str4 = "ۢۧۨۘ۬۫ۡۤۘ۠ۤۥۘۡۢۥ۟ۜۘۥۘۦۨۥۦۤۙۜۘۢۢۚۛۥۙۖۡۡ۠ۜۥۘۖۧۦ۠ۖ۟ۤۖۘۖۡۡۘۙۗۜۘ";
                    break;
                case 971878337:
                    String str13 = "ۘۥۨۘۨ۠ۚۗ۟ۗۘ۫ۧ۠ۖۦۘۤۜۚۤۘۖۡۧۥۘۤۤۦ۫ۡ۫ۗۡۘۘۢۧۖۘ";
                    while (true) {
                        switch (str13.hashCode() ^ (-885797966)) {
                            case -1954522888:
                                str4 = "۫ۤۛۡۚۖۚۙ۟ۘۘۨۨۚۥۙۘۥۙۜۘۘۖۤۧۤ۟ۖۘ۫ۛۨۦۚ۟ۨۤۙۦۘۘۖۚۦۘۡۘۨۧ۠ۦۘۛۘ۫۠ۚ۟";
                                continue;
                            case -1713573681:
                                str4 = "ۨ۫ۤۨۦۚ۠ۥۙ۠ۤ۠ۧۖۦۘۢۨۦۛۚۥۘ۬۠ۥ۫ۘۦۘ۬ۛ۟ۤۙۖۘۡۤۨ";
                                continue;
                            case 1852877516:
                                str13 = "ۧۨۨۘۘ۬ۘۘۢ۬ۘ۫ۗ۫ۥۢۛ۠۠ۨۘۦۨ۠ۖ۬ۥۘۥۛۘۘۛۙۗۘۗۙۢۦۥۢۦۦۤۧۥۘۗۚۢۖ۟ۨۘۡۙۗۦ۟";
                                break;
                            case 1868347609:
                                String str14 = "ۥۢۡۘۦۡۦ۫ۘ۬۠۠ۘۡۘ۬ۗۥۚۧۖۘۡۥۘۘۢ۬ۦۚ۬ۨۘۨۡۦ۟ۜ";
                                while (true) {
                                    switch (str14.hashCode() ^ 1180012139) {
                                        case -2046003402:
                                            str13 = "ۡۦۜۘۨۙۖۘۘۜۦۤۛۜۘۡۗۦۘ۬۬ۜۘ۟ۥۧۚ۟ۨۘۘۦۜ۠۟ۦ";
                                            break;
                                        case -1405371210:
                                            str13 = "ۘۧۢۘۖۙۙ۟ۘۘۙۤۡۘۥۜۖۙۧۨۤۧۥۚۥۡۢۖۧ۠ۖۡۖۦۥۤۤ";
                                            break;
                                        case 209362502:
                                            str14 = "ۤۛۥۛۚۧۘۚ۠ۜۦۧۧۙۦۘ۬۫ۤۜۛۜۛۨۨۨ۫ۚۜۘۗۥ۬ۨۙۨۢۢ۬ۛۗۜۤۤۧۥۛ۠";
                                            break;
                                        case 798014073:
                                            str14 = zIsScriptStarted2 ? "ۚۡ۟ۚۘۖۖ۟ۚۧ۠ۖۡۘۘ۫ۘۦۘۤۦۢۖۡۜ۟ۧۢۧۨۨۗۧۚۘۥۙ۬ۨۙ۠۟ۥۢ۠ۗۤ۠۠۬ۦۙۖۗۥ" : "۬۟ۢ۫ۥۧۘۙ۠ۥۘۚۘ۟ۡ۫ۛۧۥۨۘۗۨۘۘۘۡۛ۫ۗۦۘ۬ۨۘۡ۫ۥۚۧۦ۬ۜۢۜۙۨۘۚۜۛۗ۬ۙ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1154063429:
                    str4 = "ۢۤ۬ۚۛۡ۫ۢۘۗ۠ۢ۟ۦ۠ۧۙۘۗۨۘۤۗۜۤ۬ۛ۟ۛۜۘ۠۫ۖۘ۫۟ۡۘ";
                    i3 = i;
                    break;
                case 1759142984:
                    C4014j7.OooO0O0().OooO0oO(6, 1002, "脚本停止运行！");
                    str4 = "ۤۢ۬ۜ۬ۦۘ۬ۘ۟۠۟ۘۘۜۙ۫ۜ۟۠ۚۦۘ۬ۤۢۧ۫۬۟ۤۛۚ۟ۨۘ۫ۦۚ۟۠ۚ۠ۙۚ";
                    break;
                case 1866266810:
                    str2 = "脚本未在运行状态！";
                    str4 = "ۥۙۥۜۜۧۘ۟ۧ۠ۥ۠ۚ۬ۥۧۚ۫ۧۡ۬ۡۘۦۙۨۘ۫ۛ۟۠ۡ۟ۛ۫ۘۛۨ۟ۚۛۘۖۢۤۗۙۛۤۛۡۘ";
                    break;
                case 1886009601:
                    this.o0Oo0oo = false;
                    str4 = "ۥۧۥۢۖۦۜۚۖۘۖۦۘۘۦۖ۟ۢۦۘۥۛ۬ۗۗۦ۫ۦۧ۬ۡۜۘ";
                    break;
                case 1907998081:
                    MqRunner.getInstance().stop();
                    str4 = "ۙ۫ۘۘ۫ۦۗۦ۠ۖۘۗ۟ۘۘۜۧ۠ۘۛۗ۠ۧۗۢۚ۫۟۫ۤ۠۟ۘۦۢۜ۫ۨۘۨۦۙۥۘۧۘۜۢۡۨ";
                    break;
                case 2010335594:
                    this.o0Oo0oo = false;
                    str4 = "ۘۢۥۘۤۜۛۛۚۦۧۦۘ۠۟ۛۖۨ۠ۥ۫ۤۗۧۖۘۤۚۖۨ۬ۦۨۘ۫ۛۙۘۜ۠ۡۡۚۖۚ۠۟ۜۧ۫ۘ۬ۦۗۦۘ";
                    break;
            }
        }
    }

    private void Oooo0o0() {
        String str = "ۙۛۘۘۙۨۖۥ۫ۥۧۡۛۛۦۖۙۤۜ۬ۜۘۜۙۧۚ۠۬۠ۗۚۡۥۚ۫ۗۧۛ۬ۦۘۧۘۥۙۤ۬ۡۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ C4095le.o00000oo) ^ 1009) ^ 108) ^ 229914331) {
                case -1890999917:
                    return;
                case -841316201:
                    Process.killProcess(Process.myPid());
                    str = "ۥۤۘۘۥۜۘۖ۠۟۠ۥۜۥۜۜۥۛۤۡۨۘ۫ۗ۬ۡۦ۬ۨۧۙۢۙۚ۠۟ۦۘ";
                    break;
                case -828134186:
                    j10.OooO0o().OooOoO0(this);
                    str = "ۥۦۦۘۧ۬ۧۦۚۧ۟۟ۤۘ۬۟ۗۦۖ۠ۥ۠ۛ۫۫ۗۨۦۘ۠ۡۡ۠۬۟ۦ۠ۨۚۥۨ۬۟ۜ۟ۧۨۜۖۦۤۤۦۘ۠ۚۡ";
                    break;
                case -390768482:
                    this.Ooooo00.unregisterComponentCallbacks(this.o000OOo);
                    str = "ۥۘۗۛۦ۟ۘۙۜۛ۫ۦ۠۟۠ۤۤۡۘۧۢۘۘ۟ۥۡۘۦۦۖۘۚۧ۬ۦ۠ۦۘۛۡۨۘ";
                    break;
                case -358906186:
                    str = "ۧ۟ۚۙ۠ۨۘۡۙ۟ۛۘۨۘ۬ۤۦۘۖ۫ۘۘۘۧۨۘۙۛۤ۠ۥۙۢ۟ۜۘۗ۠ۘۘ۬ۡۙ";
                    break;
                case -6177377:
                    C3951hi.OooO0O0();
                    str = "ۘۙۡۦۖۦۘۤ۟ۦۘۖۡ۠۬۟ۖۥۛۢ۫ۛۦۡ۠ۛ۬ۛۡۨۛۨۥ۟ۙۛۖۥۘۤۧۙۤۖ";
                    break;
                case 194189217:
                    String str2 = "۟ۦۧۛۖۘۧ۟ۙۡۧۦ۬۟ۥۙۦۗۦۦۘۘۜۥۖۛۜۘ۟ۨۖ۬ۤ۫۟ۨۗۚۖۧۘۥ۬۠ۢۧۛۨۖۜۜۦۥۡۢۖ";
                    while (true) {
                        switch (str2.hashCode() ^ 760828354) {
                            case -1346388053:
                                str = "ۧۛۡۘۘۖۤ۟ۚۡۦۚۖۘۗۤ۟ۥۙۦ۠۠ۥۘۡ۫۟ۚۧۛۦ۬ۥۘ";
                                continue;
                            case -330732055:
                                str2 = "ۤۙۧۨۧۜۘۥۡۨۘۥۜ۟ۙۜۜۚۘ۬ۧۜۗ۫ۤۖۢۚۛۡۧۘۡۢ۠ۚ۟ۖۘۙ۠ۗۘۦۤ۟ۨۛۗۢۨ";
                                break;
                            case 1756174038:
                                String str3 = "ۖۚۧ۬ۘ۬ۜ۫ۡۘ۠ۚۥ۬ۖۛۗۙۧۙۨۗۤۗۛۥۜۡۚۖۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1089455667) {
                                        case -577161391:
                                            str2 = "ۘۙۖۘۖۚۘ۫ۙۘۘ۫ۚۥۢۥۚۖۥۘۤ۟ۨۜۛۨۘۤۤۧۜۦ۠ۚۢۥۘۨ";
                                            break;
                                        case 105621171:
                                            str2 = "ۦۧۡۘۖ۟ۖۘۥۖۦۛ۫ۥۘۜۦۜۦۙۜۘۤ۠ۦ۫ۖۦۘۘۡۖ۠ۖۘ";
                                            break;
                                        case 803005859:
                                            str3 = "۬۠۫۬۫ۥۘۙۙۘۘۨ۠ۜۘۧ۟ۜۖ۬ۛۤۙۨ۟ۘۙۚۤ۟۠ۨۨۘ";
                                            break;
                                        case 2041571453:
                                            str3 = C3977i7.OooO().OooOOO() ? "ۧۜ۫۫ۖۜۘۤۘۦۘۜۙۛۖۢ۟ۥۦۗ۬ۘۘۗۛۨ۠ۥۘ۟۠ۦۘ" : "ۡ۟ۦۨۢۡۘۤ۬ۖۘۡۤۚۛۗۤۨ۟ۧۘۗۜۧ۠ۚۨۨۘۨۤۗۖۙۨ۠ۦۧۚۦۡۘۜۛۡ";
                                            break;
                                    }
                                }
                                break;
                            case 1962324626:
                                str = "ۙۖۛۗ۬ۦۘ۫ۥۢ۬۟ۡۘۡۧۙۗۘۗۡۨ۬ۗۧ۟ۡۚۖۜ۠ۛۤۢۚۧ۬ۖۘۧۖۘۘ۟ۢ";
                                continue;
                        }
                    }
                    break;
                case 197070454:
                    this.Ooooo00.unregisterReceiver(this.o00000Oo);
                    str = "۟ۜۙ۟ۤۥۙ۬ۡ۟ۜۘۘۨۜۜۘ۠ۜۚۦۖۜۜۧۜۖ۟۫ۘۥۨۢۧۖۘ۠ۨۙۗ۫ۦۢۨۛ";
                    break;
                case 482099333:
                    C4496w8.OooOO0O();
                    str = "ۘۘۡۘ۬۟ۙۖۨۖ۫ۡ۫ۧۨۦ۬ۥۗۖۢۤۛۧۗۤۗۛۦۚۨۘ";
                    break;
                case 663944727:
                    this.o0OO00O.removeCallbacksAndMessages(null);
                    str = "ۨۗۜ۬ۗ۠ۡۨۥۢ۫ۗۜۢۛۢۧ۟ۙۦۜۦۢ۠ۥۘۚۥ۠ۦۡۘۡۙۜ۫ۢۦۘۨۡ۬ۡۘۥۗۡۧ۠۟ۖۘۥۦۤ";
                    break;
                case 1318489648:
                    C3977i7.OooO().Oooo0o0();
                    str = "ۙۖۛۗ۬ۦۘ۫ۥۢ۬۟ۡۘۡۧۙۗۘۗۡۨ۬ۗۧ۟ۡۚۖۜ۠ۛۤۢۚۧ۬ۖۘۧۖۘۘ۟ۢ";
                    break;
                case 1323889164:
                    C3951hi.OooOo0O(getContext());
                    str = "ۧۤۨۛ۬ۦۘۚ۬ۦۘۨۥۡۘۡ۫ۖۘۖۡۘۥۡۛۧۙۦۘۤۙۧۙۤۥۗۖ۟ۖۧۤۚۘۥ۠ۨۦۨۘۡۘۤ۬";
                    break;
            }
        }
    }

    private void Oooo0oO() {
        String str = "ۘۧۗ۫ۘۨۢۤۚ۫ۖۜۘۜۖۡۘۗۜۘۨۢۦۦۗۥۘۢۦۥۜۘۚۨ۠ۧ۠ۛ۠ۢۛۘۘ۫ۥۡۘۖۜۨۘۖۨۥ";
        while (true) {
            switch ((((str.hashCode() ^ 591) ^ 785) ^ 370) ^ (-204092599)) {
                case -1825610414:
                    this.OoooooO = (ImageView) findViewById(R.id.floatview_elfin_imageview_elfin);
                    str = "ۗۤ۟۬ۧۦۦۚۗۥۨۘۙ۬۠ۦۘۘۘۢۢۚ۟ۦۡۘۛۜۡۘ۬۬ۜۘ";
                    break;
                case -1416015643:
                    this.OoooooO.setOnClickListener(null);
                    str = "ۢۥۘۘۜۨۧۡۚۘۗۨ۟ۥۗ۠ۥ۬ۛ۬ۜۡۘۚۦۛ۫۫ۛۚۚۨۨۜۡۘۙۜ۫ۚۙۖۥۘۡۘ";
                    break;
                case -466417751:
                    this.OoooooO.setOnTouchListener(this.o00000);
                    str = "ۤۛۖۜ۟ۚۛۧۤۚۦۘۚۨۦۘۥۦۘۖۜۖۦۢۖۘۧۨۗۤۖۛۛۘۖۜۗۢۜۦۘۢ۟ۦۘۥۨۨ۬ۛۧۜ۫ۢ۠ۘ";
                    break;
                case -363574109:
                    str = "۟ۛۡۘۦ۫۟۫۬ۖۘۗۖۜۨۘۤۙۦۘ۟ۙۦۘۦۦۘۘۤۦۥ۬ۤ۫۫ۧۙ۠ۥ۠ۦ۠ۙۦۜۨ";
                    break;
                case 750771546:
                    return;
                case 1133747229:
                    Oooo0();
                    str = "۟ۘۦۘ۟۟۠ۨۤۜۥۧ۫۬ۦۙ۬ۨۘۗۚ۟۟۬ۨۘۙۗۨۘۡۙۦۧۗۨ۠ۚۨۘ";
                    break;
            }
        }
    }

    private void Oooo0oo() {
        String str = "ۙۖۨ۟ۧ۫ۤۧۙ۟ۙۨۥۦۤۦۦۜۥۚۚۛ۫ۡۦۙۥۚۘۚ";
        while (true) {
            switch ((((str.hashCode() ^ 379) ^ 567) ^ 361) ^ 139924508) {
                case -2038374811:
                    this.oo000o = (TextView) findViewById(R.id.id_tv_run_and_pause);
                    str = "ۡ۫ۡۘ۬ۨۨۘۚۛۨ۟۠ۢۘ۟ۡۙۡ۠ۜ۫ۛ۠ۥۨۘۘۦۤ۠ۚ۬ۘۧۥۗ۠ۦۨۜۖۥ۠ۜ۟ۖۦۘۚ۬۬";
                    break;
                case -2000659878:
                    this.o00Oo0.setOnClickListener(this);
                    str = "۫۫ۥۖۦۖ۠ۤۛۢۡۢۗۡۦۥ۠ۨۥ۫ۨۖۘۢۘۤ۟ۗۜۘۤۡۦ۫۟ۡۡ۟ۖۘ۠ۛۨۘ";
                    break;
                case -1734187419:
                    return;
                case -1427234195:
                    this.o00Oo0 = (LinearLayout) findViewById(R.id.floatview_linearlayout_setting);
                    str = "ۛ۫ۨۘۡۤۢۢ۫ۧ۟ۜۘۚۧۚ۟ۤۥۘۙ۫ۘ۟ۢۨۦۢۜ۠ۨۜۘ";
                    break;
                case -1307637904:
                    this.o00O0O = (LinearLayout) findViewById(R.id.floatview_linearlayout_info);
                    str = "۫۟ۨۘۛۘۨۘ۫ۛۖۧ۟ۜۛۘ۬۬۫ۤۚۗۗۖ۫۟ۛۨۘۨۜ۠ۡۖ۠ۧ۠ۢ";
                    break;
                case -1252789556:
                    Oooo0oO();
                    str = "ۜۙۡۗۘ۠ۢ۬ۖۘۙۖۨۢۨۥ۠ۧۨ۬ۜۨۘۤۤۤۤۚۦۗۨۛۡۦ۫۟ۡ۬";
                    break;
                case -1206274902:
                    this.o00oO0o = (ImageView) findViewById(R.id.floatview_imageview_run_and_pause);
                    str = "ۥ۟ۦۘۤ۫ۤ۠ۤۥۘۘۖ۟۟ۜۢۗۘۦۦۤۢۗۜۧۘۚۗۥۡۨۡۘۘ۬۟ۨۜۙ";
                    break;
                case -733358554:
                    this.o00oO0O = (TextView) findViewById(R.id.id_tv_setting_and_stop);
                    str = "ۛ۟ۧ۠ۚۡۘ۫ۥۜۘۙۧۚۚۦۡۘ۠ۥۛ۟۠ۚۚۙ۬ۧۘۖۘۨ";
                    break;
                case -606967090:
                    this.ooOO = (LinearLayout) findViewById(R.id.floatview_linearlayout_run);
                    str = "ۥۙۖ۬۠ۦۘۗۖۖۖۨۧۥۨۜۘۧۛۚۧۦۜۘۦۜ۫ۗۜۚ۟ۥۘۘۜۙۛۢۥۤۜۢۢۦۛۨۚ۠۫ۥ۟۬";
                    break;
                case -517834472:
                    LayoutInflater.from(getContext()).inflate(R.layout.floatview_elfin, this);
                    str = "ۗۚۡۨۜۨۘۖۙۗۦۢ۫ۢۙۧ۟ۚۘ۬ۗ۬۬ۚۥۘۚ۠ۘۘۛۡۙۛۘۜۘۤۧۜۘۤۧۖۥۦ۬ۤ۟ۖۜۛۗ۟ۖۗۧ۫";
                    break;
                case -466725621:
                    this.o0OoOo0 = (LinearLayout) findViewById(R.id.floatview_elfin_liearlayout_tools);
                    str = "ۜۤۜۚۡۥۘ۫ۨۘۗ۬ۗۧۗۨۘۡۘۧ۫ۜۘۙ۠ۗ۫ۘۘ۬۠ۜۘ";
                    break;
                case -323988558:
                    findViewById(R.id.floatview_linearlayout_exit).setOnClickListener(this);
                    str = "۠۫ۖۦۚۡۖۡۦۘ۠ۨۜۘۜۦۥۙۤۨۥۖۘۘۦۡۢۜ۬ۨۘۜۗ۠ۗۦۨۘۘۨۦ۬ۨۘۗ۫ۧ۟۬ۨۘۧۧۨۗۡۡۙۨ";
                    break;
                case -269909121:
                    this.o00O0O.setOnClickListener(this);
                    str = "ۙۜۙۡۚۦۤۥ۫ۙۘۗۘۜۜۘۨۗۡ۬۬ۢ۟ۘۘ۫۫ۙۧۦۢۖۧۚ۬ۢۨۤۢۘۧ۟ۘ";
                    break;
                case 93897961:
                    this.o0ooOO0 = (ImageView) findViewById(R.id.floatview_imageview_setting);
                    str = "ۤۙۘۧ۟ۘۦۡۙۜۜ۫ۙۜۧۙۡۙۖۜۙ۟ۘۘ۬ۨ۠۬ۛ۫ۥ۟ۧ۠۬ۖۘ۠ۙۥۘۡ۟۫ۨۡۚۥۜ۠ۢۦۡۘ۟ۘۖۘ";
                    break;
                case 984339174:
                    str = "ۜۨۙ۠ۜۨۘۥۢۦۘۡۙۧ۠۠ۛ۠ۦ۟ۗۤ۬ۥۧۖ۬ۙۤۨۡ۟۫۠Oۤ۫ۨ۫۬ۨۘ";
                    break;
                case 1536577563:
                    this.Ooooooo = (LinearLayout) findViewById(R.id.floatview_elfin_liearlayout_elfin);
                    str = "ۗ۟ۥۜ۟۫۫ۚۛ۠۟ۧ۟ۦۘۡۦۘۦۗۚۗۚۚۘۗۡۘۧۤۙۥۥۨۨۢ۫ۛۨ۫ۜۤ۬ۘۙ۬ۖۗۨۗ۬ۡ";
                    break;
                case 1566345478:
                    this.ooOO.setOnClickListener(this);
                    str = "۬ۗۤۙ۠ۗۗ۬ۘۘۛۤۖۘۤ۟۠ۜ۟ۜۧۙ۟ۜ۟ۘۡ۫ۢ۫";
                    break;
            }
        }
    }

    private void OoooO0() {
        String str = "ۦۚۚ۠۫۬ۚۛۙۨۧۤۖ۟ۙۢۢۘۘۢۛۙۥ۫ۨۘ۬ۙۢۜ۟ۡۘ۟ۖ۬ۙۢ۫۫ۖ۫ۙ۬ۖ";
        while (true) {
            switch ((((str.hashCode() ^ 813) ^ 713) ^ 101) ^ (-1609516844)) {
                case -1267344703:
                    String str2 = "۟ۡۘۘ۬ۢۘۧۗۡۘۙۜۥۘ۬ۥۖۘ۟ۥۤ۬ۛۜۘۚۜۖۘ۫ۚۚ۠ۦۙۘۦۘۖ۟۬ۜۨ۟ۛۗۜۘۤۥۡۛۧۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 235155820) {
                            case -1270377397:
                                str = "ۛ۟ۦۘۗ۟۟ۡۥۥۧ۫ۨۘ۫ۗۖۡۖۛۙۘۢ۫ۧۘۤۙ۬ۗۘۘۗ۠۠۠ۨۨ۬۟ۗۗۦۘۘۦ۫ۦ۠ۙ۟ۤۤۢۗۖۨ";
                                continue;
                            case 267354579:
                                str2 = "۠۟۫۫۟ۥۖۘۦۖۧۘۛۚۦۘۖ۬ۛۜۚۖۚۢۖ۬ۦۥۘۜۥۗۥ۠ۡۘ۠ۧۘۘۡۤۖۘۢۛ۠ۖ۠ۨۜۡۜۥۛۧۤۦۡۘ";
                                break;
                            case 407169045:
                                String str3 = "ۢۗۢۧۚۛۙۚۦ۬۬۫ۢ۬۟ۛۤ۬ۧ۟ۜۘۚۘۦۘۡۥۥۖ۫۟ۡۚۙۖۧ۠ۘ۠ۚۙ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1967771725)) {
                                        case -272116799:
                                            str3 = AppContext.OooO00o().OooooO0 ? "ۢۗۜۘۨۦۖۨۦۘۨ۬۟ۨۘۧۧۥۘۥۚۨۗ۫۬ۡ۟ۡ۟ۤۥۘۡ۟ۦۢۜۜ۬ۨ۟ۖۨۙۗۨۡۙۨۙ" : "ۘۡۡۘۢۡۡۘۚۜ۬ۘ۫ۨۗۜۧۚۙۛۥۖۨۘۦۜۧۘۥۘۧۘۧۖۙۚۘۗۜ۬ۤۙ۫ۦۘۘ۠ۛ";
                                            break;
                                        case 195500334:
                                            str2 = "ۛۚ۟۠ۨۧ۬ۤۗ۬ۛۘۘ۬ۗۖۚۡ۬ۡۡۥۘ۟ۛۦۘۘۜۢۧ۬ۘۦۤۜۘ۠ۗۙۚۨۗۧۜۚۚۤ۫ۡۨۢ";
                                            break;
                                        case 280219618:
                                            str2 = "ۤۘۥۚۦ۫ۘۤ۬ۙۦۖۘۘۥۤۜۚۚۜۘۘۛۗۛۥۜۘ۫ۨۛۘۜۙۥ۬۬ۤۦۧۢۤۜۧۗۦۛۦۘۘ";
                                            break;
                                        case 1433680368:
                                            str3 = "۫۬ۥۦۥۙۖۙۖۘ۫ۖ۠ۡۦۢۜۦۜۧۜۦۘۛۛۗۖ۫ۥۢۙۚۜۜۙۖ۫ۗ";
                                            break;
                                    }
                                }
                                break;
                            case 1576264442:
                                str = "ۚۘۙۜۤ۠ۛۢۥۘۗۚ۟ۢۤۥۘ۫ۗ۬ۛۦۨۘۘۡۧۧۖۨۖۜ۟ۦۖۖۘۛۖۤۨۘۥۘۗۤۦۢۤۦۘۜۛۧ";
                                continue;
                        }
                    }
                    break;
                case -903664538:
                    this.oo0o0Oo = 1;
                    str = "۬ۙۛۛۡۥ۠ۖۚ۬۠ۨۘ۫ۖۨۡۛۡۙ۬ۡۚۘۘۖۚۜۘۦۜۥۘ";
                    break;
                case -673001139:
                    this.oo0o0Oo++;
                    str = "۫ۤ۠ۗۗۚۚ۠ۚۥۗۗۦۜۘ۫ۖۨۘۥۛۡۖۦۧ۫ۤۖۢ۬ۡۨ۫۟ۢۨۚ";
                    break;
                case -560722494:
                    String str4 = "ۦ۬ۙۛۡۛۥ۫ۖۨۙۛۜۧۦۘۗ۠ۤۙ۠ۤۦ۬ۜۘ۟ۜۘۜۗ۠ۨۜ۬ۙۛۘۘۧۘ۬ۥ۠۠ۖۤۢۡۢۨ۠۫ۨۨۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1904667487)) {
                            case -2134953139:
                                str = "۬ۚ۫ۜۗۚۦ۟ۥۘۜۡ۫۫ۜۙۡۛۛۗۖۖۘۦۙ۬ۦۥۙۧۨۘ۫ۨۛۨۡۧۥۖۗۥۢ۟۫ۛۨۘۛ۠ۨ";
                                continue;
                            case 1467523255:
                                str = "ۧۢ۟ۗۡ۟ۜۗ۬ۦۜۛ۫ۥ۟ۗۧۚۢۥۨۥۗۘۘۙ۬ۙۥ۬ۜۘۚۗۨۘ۬ۦۨۘ";
                                continue;
                            case 1895644540:
                                String str5 = "۬ۚۡۛۖۛۘۚۨۚۛۘۖۦۘۡۖۘۘۖۢۙ۬ۥ۟ۚۗۧۚۡۧۘ۟۬ۖۘۨۨۧۘۚۘۦۢ۠ۘ۟ۦۨۘۨۧۨۚۖ۟ۥۥۥ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1520721274)) {
                                        case -736546429:
                                            str5 = "ۤۘ۬ۚۤۜۘ۬ۙ۠ۦۨۚۛۗۙۦۘۘۘۚۜۥۘۧۨ۠ۘۖۜ۟ۧ۟ۡۗۨۘ۬ۧۨۤۥۙۙ۠";
                                            break;
                                        case -153607631:
                                            str4 = "ۙۤۘۘۚۤۚۢۥۦۢۘۡۢ۟ۜۘ۫ۛۖۘۥۛ۫ۤۡۘۘۡ۫ۡۘۢ۬ۡ۬۟ۖۘۢۤۥۘۙۤۛ۟ۗۜۡۤۛۗۙۖ";
                                            break;
                                        case 905119113:
                                            str4 = "ۖۜۨۤۡۦۘۜۘۥۢۙ۠ۜۘۨۥۤۛۘۧۚۛۛۥ۟۟ۗۢ۬ۖۘ۟ۗۘ۟ۥۜۢۨ۫ۡۡ۟";
                                            break;
                                        case 1915087134:
                                            str5 = this.o0OO00O.hasMessages(1000) ? "ۙ۫۟ۡ۫ۥۙۛۡۘۜۦۗۗ۠ۘۤۖۘ۫ۧۦۘۨۢۛۙ۬۫ۦ۬ۥۖۥۥۘ۠ۤۗۧۘۦۘۗۚۥۤۥۦۘۖۥۚۗۧۤ۟ۘۥ" : "ۖۥۚۘۨۡۘۧۧۥۘ۟۫ۖۘ۠ۤۦۘۦۚ۫۬ۥۡۘۗ۫ۘۡ۫۫ۛۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1941071481:
                                str4 = "ۤۤۘۤۗۘۤ۬۠۠۫ۛۧ۬ۦ۬ۛ۟ۥ۫ۦۘۖۦۖۘۜ۠ۨ۠ۦ۫۬ۙۘۘۧۤۙۥۤ۟ۚۖ";
                                break;
                        }
                    }
                    break;
                case -524837306:
                    this.o0OO00O.sendEmptyMessageDelayed(1000, C2187m.f13871ag);
                    str = "ۢۚۡۘ۬ۨۘۤۢۜۘۗۥۘۦۧۥۘۢۤۢۡۗۚۥ۠ۢۘۦۘۡۦۦۘ۠ۚۡۙ۟ۢ۬ۛ۬ۗۚۘۘ۫ۦۧۛۙۧۙ۬ۘ۬۟ۗ";
                    break;
                case -99663197:
                    String str6 = "ۖ۫۬ۜۙۖۗۢۗۦۙۡۘ۬ۗۢ۟ۙۨۘۢۢۘۛۛۘۘۦۙۜۘ۟ۜۦۘۦۛۦۜۛۘۘ۠ۤ۟ۡۤۡۘ۠۠ۨۤۥۢ";
                    while (true) {
                        switch (str6.hashCode() ^ (-1250306480)) {
                            case -2081461086:
                                str6 = "ۤۧۡۘۦۛۡۘ۠ۧۜۡۚۥۘ۠ۥۧۗ۫ۘۨ۬ۧ۫ۦۙۨۦۢۦۖۖۦۧ۬۬ۢۨۚۛۤۧۧۦ";
                                break;
                            case -14901737:
                                String str7 = "۠ۚۦۦۙۨۘۦۡۜۨۗۛ۟ۧۙۖ۫ۛ۫ۡۨۘۗۘ۟ۡۥۗۧۥۜۘ۟ۤۙ۟۠ۨ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1105558064) {
                                        case -1435394073:
                                            str7 = this.o0OO00O == null ? "ۤۦۤۥۢۢۗ۟۟۟ۖۧۖۙۦ۟ۡ۠ۧ۟ۜۘۥۢۤۢۦۦۘ۟ۨ۟ۢۙۜۘۡۚ" : "ۛۨۡۘۗ۫ۘۥۦۤۜۦ۫ۢۚۗۡۧۘۗۥۦۧ۠۫ۥۥۜۢۗۘۦۥۜۘ۟ۛۨۥۘۢۥۖۘۚ۬ۢۥۨۥۘۡۥۦۘۡ";
                                            break;
                                        case -948262912:
                                            str7 = "ۖۤۗۖۘۘۡۦۘۚۙۨ۠ۨۥۗ۬ۚ۟ۦۖۘۦۚ۟ۤۦۡۘۙ۟ۦ۟۫ۜۘۥۧ۟۠ۥۖۦۨۘ";
                                            break;
                                        case -847791462:
                                            str6 = "ۧۦۢۤۤۖۧۢۛۘۖۨۥ۫ۡۡ۬ۡ۟۫ۘۘۤ۬ۨۚۡۥۙۛۛ۬ۜۤۚۘۨۘ۠۠ۙۨۧ۟ۧۜۜ۬۫ۙۦ۟ۖۧۜ۟";
                                            break;
                                        case -118785556:
                                            str6 = "۫ۨ۟ۢ۠ۛ۠ۗۡۙ۟ۖۘۖۚۨۘۦۡۘۧۘۢۖۗ۠۠ۜ۠ۤۜۡ";
                                            break;
                                    }
                                }
                                break;
                            case 478012596:
                                str = "ۘۥۖۖۧۛۛۖۚۖۥۖۘۤۡ۟ۘۡۥۘۜۗۥۘۨ۬ۨۢۜۘۙ۫ۡۘۤ۠ۨۨۤۦ";
                                continue;
                            case 1317759829:
                                str = "ۦۡۗۛۤۖۦ۬ۦۘۛ۠۟ۜ۫ۨۘ۠ۙۜۢۘۘ۫ۚۤ۟۠۟ۘۗ۟ۨۖۡۙۥ۠ۗۖۚۙ۬ۨۘۤۙۘۡۗۜۘ۠ۗ۫";
                                continue;
                        }
                    }
                    break;
                case 47307108:
                    str = "ۥۨۙ۫ۧۥۘۦ۫ۜۘۜۡ۫ۡۡۚ۫ۜۛۨۢ۬ۘۧ۫ۢۚۛۥۧۖۘۘۛ۟۫۟";
                    break;
                case 109625272:
                    this.o0OO00O.removeMessages(1000);
                    str = "ۧۘۖۙۡۖۘ۠ۡۦۘۢۡۛۜۦۖۜۜۘۘۤ۬ۖۘۜۗۘۘۦ۫ۚ۠ۨۗ";
                    break;
                case 550458507:
                    this.o0OO00O = new Oooo000(this, null);
                    str = "ۦۡۗۛۤۖۦ۬ۦۘۛ۠۟ۜ۫ۨۘ۠ۙۜۢۘۘ۫ۚۤ۟۠۟ۘۗ۟ۨۖۡۙۥ۠ۗۖۚۙ۬ۨۘۤۙۘۡۗۜۘ۠ۗ۫";
                    break;
                case 734627270:
                    this.o0OO00O.removeMessages(1000);
                    str = "ۧۢ۟ۗۡ۟ۜۗ۬ۦۜۛ۫ۥ۟ۗۧۚۢۥۨۥۗۘۘۙ۬ۙۥ۬ۜۘۚۗۨۘ۬ۦۨۘ";
                    break;
                case 923824616:
                    C3977i7.OooO().Oooo0o0();
                    str = "ۦۥۨۘ۫ۢۚۥۘ۬ۥۙۛۤ۟ۦۘۢ۬ۧ۠ۤۚ۬ۙۘۘۙۤۖۘۚۤۚۛ۠ۘۘۦۜۜ";
                    break;
                case 1190066038:
                    String str8 = "ۨ۠ۡۘۧ۬ۨ۠ۛۙۙۥۦۥۗۡۘۖ۫۠ۤۧۡۘۥ۫ۦۘۡۖۥۗۛۘ۟ۨۘۦۗۨۘ";
                    while (true) {
                        switch (str8.hashCode() ^ (-385669292)) {
                            case -2028902179:
                                str8 = "ۧۗ۫ۢۡۛۡۡۘۘۖۘۡۗۢۥ۠ۧۡ۬ۢ۠ۥ۫ۖۤ۟ۧۘۘ";
                                break;
                            case 247323228:
                                str = "ۖۧۙۛۚۗۡۡۘۨۙۢۨۘۦۛۜ۟۫ۨۚۧۦۘۗۘ۫ۨۦۚۦۚۚۗۚۧ";
                                continue;
                            case 375903644:
                                String str9 = "۬ۘۘۥۗۤۤۥۜۙۦۧۜۥۦۢۘۨۘ۠ۗۦۙۖ۠۠ۧۦۢۥۘ";
                                while (true) {
                                    switch (str9.hashCode() ^ 520822389) {
                                        case -1626360242:
                                            str9 = "ۜۨۖۘۧۦۘۚۛۜ۟ۡۡۘۜۘۨۢۧ۟ۖ۬ۚۡۥۘۗۡۨۘ۟ۛۨۘ۬ۖۘۘۤۖۖۘ۬۠ۛۡۧۦۘ۠۠ۗۗۛۧ";
                                            break;
                                        case -1388510976:
                                            str8 = "ۡۙ۬ۙۢۨۗۚۘۡۧۜۘۨۢ۠ۗ۟ۗۜۦۡۘۖۗۢۢۤۜ۫ۖۧۘۡۨۡۧۙ۠ۢ۠ۥۛۥۘ";
                                            break;
                                        case -768570667:
                                            str8 = "ۛ۠۠ۦ۟ۥۘۘۖۙ۬ۨۡۘۡۗۙۖۛ۠ۡۘۚۗۥۖ۟ۧۛۙۡۙۜۚۥۘۡۚۥۙۢۘۘۦۙۨۘۢۤۨۘۢۤۢ";
                                            break;
                                        case 919539485:
                                            str9 = this.oo0o0Oo >= 5 ? "۬ۨۦۗ۬ۗۨۘۖ۠ۚۡۤۛۨ۠ۜۨۡ۬۬ۨ۟۠۫۠ۜۘۥۧۙۜۥۧۘۢۛۨ۟ۚۦۘ۠ۖۢۥ۟ۦۘۛ۬ۥۖۨۡۥۧۘ" : "ۛۦ۬ۗۜۗۚۧ۫ۙۛۨۘ۠ۜۤ۫ۦۦۘۨۡۘۘ۠ۢۛۗۧۘۦ۫ۖۡ۬ۧۧۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1941101490:
                                str = "۬ۙۛۛۡۥ۠ۖۚ۬۠ۨۘ۫ۖۨۡۛۡۙ۬ۡۚۘۘۖۚۜۘۦۜۥۘ";
                                continue;
                        }
                    }
                    break;
                case 1524514180:
                    OoooOo0();
                    str = "۫۬ۖۘۚۨ۠ۤۜۚۘۡ۬ۤۧ۟۬۟ۧۥۜ۠ۘۖۤ۬ۜۧۦۤ۟۠ۦۘۡۥۖۘۧ۠ۖۥۦۡۘ";
                    break;
                case 1538006681:
                    str = "ۢۚۡۘ۬ۨۘۤۢۜۘۗۥۘۦۧۥۘۢۤۢۡۗۚۥ۠ۢۘۦۘۡۦۦۘ۠ۚۡۙ۟ۢ۬ۛ۬ۗۚۘۘ۫ۦۧۛۙۧۙ۬ۘ۬۟ۗ";
                    break;
                case 1660628487:
                    return;
            }
        }
    }

    private boolean OoooO00() {
        String str = "ۥ۬ۡۘ۬ۜۜۘۖۛۗۤۗ۟ۘ۫ۡۘۙۚۨۘۥۛۖۘ۟ۨۖۢۜۥۘۚۧۖۘۚۙۢۙۜۖۘ";
        int[] iArr = null;
        int[] iArr2 = null;
        while (true) {
            switch ((((str.hashCode() ^ 682) ^ 462) ^ 27) ^ 587891017) {
                case -2013557716:
                    iArr = new int[2];
                    str = "۠ۛۡۤۧ۠ۡۡ۟ۦۜۚۢۥۥۘۧۧۜۘۢۡۘۤۦۥۘۧ۟ۡۘۤۘۧۘ";
                    continue;
                case -1882509342:
                    this.o0OOO0o.getLocationOnScreen(iArr);
                    str = "ۧ۫ۥۙ۠۠ۤۘۘۗ۫۟ۗۜۥۘۙ۠ۙ۠ۗۙۛۧۗۡۥۘۘ۟ۧۜۧۜۧۘ۫۟ۘۤۨۧۘۤۡۧۘۢۘۚۖۥۢ";
                    continue;
                case -1509903600:
                    String str2 = "ۜۚۤۙۚ۠۫۫۠ۙۤۧۥ۠ۚ۟ۗۛ۬ۖۖۥۛۨۦۗۜۘۗۢۘۘۛۘ۠ۛۙۚ۠ۦۦۘۚ۬ۧ۬۠ۘۘۨۙۘۘۤ۟۠ۗۜۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-498540772)) {
                            case -522768287:
                                str = "ۨۖۙۢ۫ۘۘۗ۟ۧۙۛ۫ۚۨ۠ۡۜۦۙۚۧۙۙ۟ۡۖۗ۬ۦۜۘۢۥ۬ۨۗۖۘۡۢۙ۬۬ۡۥۘۚۘۦۘ";
                                break;
                            case -514943753:
                                break;
                            case -148160844:
                                String str3 = "ۨ۠ۗۗ۟ۘۗۚۡۘ۫ۘۨۘ۫ۥۦۘۤۜۗۨۖۜۘۧ۬۬ۥ۠ۚ۬ۜۖۘۤۗۙۛۢۦۘ۫۫ۘۤۖۤ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1866975163) {
                                        case -1501057351:
                                            str2 = "۬ۡۛۛۥ۬ۢۤۙۡۧۛ۟ۜۚ۟ۖۙۡۡۜۜۖۖۘۨۦۥۘۘ۟ۗۜۧ۬ۖۖۜۚ۫ۡۘۚ۫ۤۙۛۜۘۖۘۡۘۛ۠ۛ۫ۘۧ";
                                            break;
                                        case 28184993:
                                            str3 = iArr2[0] < iArr[0] + this.o0OOO0o.OooO00o() ? "ۗۨ۠ۢۡۙۖۡۨۜۦۖۜ۠۠ۡۖۗۡۢۘۡۡۛۘ۫۬۫ۧ۫ۤ۫ۨۖۜۦۚۧ۠ۡۥۤۢۦۘۨۗ۟ۥۛۥ۫ۨۦۘ" : "ۘۜۢۢۖۛۙ۟ۡۘ۟ۡ۬ۢۙۨ۟ۥۥ۬ۜۚۥ۠ۜۥۢ۠۫۠ۙۚۚۥۘۢۛۖۘۙۡۗۗۛ۬ۖۚۦۧۖۘ";
                                            break;
                                        case 588508359:
                                            str3 = "ۙۢۤۧ۫ۘۢۖۘۧۙ۫ۘۜۤۘۘۖۘۚ۟۠ۧ۠۠ۢۦ۟ۥ۫ۚۧۢ۟ۚۗۖ۠ۥۘۚۚ۬ۨۚۛۨۖ۠ۥۦۨۡ۬";
                                            break;
                                        case 1305361667:
                                            str2 = "۠۫ۘۨۙۚۤۤ۬ۚۡ۬ۥۢ۠۬ۧۖۘۢۗۢ۟۟ۘۘۖۛۖۦۚۙۜ۬۠ۚۙۘۜۧۢۡۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case 573172537:
                                str2 = "ۘۦۗۦ۠ۗ۬ۙۨۘۗ۟ۥۘۥ۬ۥۘ۠ۘ۟۫ۢۦۨۤ۠ۨۤۡۘۢۜۛۡۡۦ۬ۙۘ";
                                break;
                        }
                    }
                    break;
                case -1311259108:
                    str = "ۖۢۡۤ۠ۘۦ۟ۡۖ۠ۤ۬ۙۡۢۦۚ۫ۚ۟۫ۜۦۘ۠ۚۡۘۡ۠ۧ";
                    iArr2 = new int[2];
                    continue;
                case -1026047600:
                    return true;
                case 371000914:
                    String str4 = "۠ۖۜ۟ۚۦۘۢۧۖ۫۬ۤۨۥۙۖۦۘۡۧۘۡ۟۫ۥۥۚۤۖ۟ۙۡ۟۫ۖ۠ۙۛۡ۫۬ۨۧ۫ۦ۠";
                    while (true) {
                        switch (str4.hashCode() ^ 197776251) {
                            case -2100622092:
                                break;
                            case -939093893:
                                str = "ۡ۫ۙۚۙۥۘۚ۟ۤۜ۫ۛۙۤۢۖۧۨۤ۟ۛ۟ۦۥ۟۫ۜۗۥۥۘۚۧۖۤۤۥۖۡ۟ۡۢۖۘۛۡۤۨۦ";
                                break;
                            case 1137096841:
                                str4 = "۟ۗۚ۠ۢ۫ۤ۟ۗۚۛۡۡۡۖۦۙۘۘۙۢۘۖۚۥ۟ۥۗ۬ۥ۬ۜۘۥۜۤۦۖۥ۟ۜۧۜۘۨۖۧۘۜۚۥۘ";
                                break;
                            case 1494821016:
                                String str5 = "۟ۥۜۘۢۨۜۨ۠ۖۘ۬۟ۢۢۤۜۘۙۘۙ۫۬ۡۛ۫ۧ۟ۘۖۚ۟";
                                while (true) {
                                    switch (str5.hashCode() ^ 1421283168) {
                                        case -332188912:
                                            str5 = iArr2[0] > iArr[0] ? "ۚ۬ۗۘ۠ۛۢ۬۠ۚۡۥۖۙ۫ۧۖۥۜۖۜ۟ۦۥۘۧۛۜ۬ۨ۫ۨۗۥۘۨۤۘ" : "ۥ۠۬ۛ۟۟ۖۙۗۥۖۧۢۖۜۘۛۙۤۗۗۖۘۘۨۦۚۜۡۘۙ۟ۗۛ۬ۢۧ۠ۘۘ";
                                            break;
                                        case 133938867:
                                            str4 = "۠ۥۛۧۦۘۗۘۡۘۦ۫ۖۘۥۦۧۘۗۛۢۧۧۨۘۛۗ۟ۧ۫ۙ۫ۨ۬ۜۚ۠۬ۤۦۘ۟ۧۢۡۥۘۚۥۜۙ۫ۜۧ۠ۢ۬ۙ۬";
                                            break;
                                        case 780474140:
                                            str4 = "۠ۗۦۖۡۨۚۦۜۡۗۧۥۜۤۙۡۧۘ۠ۥۡۙۥۦۜۨۨ۠ۨ";
                                            break;
                                        case 1591784475:
                                            str5 = "ۢ۫۫ۥۢۦ۫ۘۨۘۡۡۧۚۙۚۜۤۖۘ۫ۡۜۦۘۦۡ۬ۘۗۡۤ۠۫ۦۘۛۜۗۨ۫ۦۘۛۚ۟ۢ۟ۘۚ۬۬ۛۨۖۦۙۡ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 659892329:
                    this.OoooooO.getLocationOnScreen(iArr2);
                    str = "ۖۘۤۚۛۘۤۦ۠۫۬۟۬ۘ۬۟ۜۥۘۗۢۥۖۗۖۘۦۡ۠ۦۥۜ";
                    continue;
                case 1189412689:
                    return false;
                case 1360184128:
                    str = "۫ۧۛۢۘ۠ۛۥۙۜۥۘ۬ۚۥۘۡۘ۟ۚۢۜۨ۟ۛۤۜۜۚۨۘۢۢۡ۟۬ۘۤۤۘۘۡۧۘۨ۬ۢۡۧۜۘ";
                    continue;
                case 1449207944:
                    String str6 = "۠ۜ۬ۤۗ۬ۦۙۜۘ۟۠ۨۜۢۚۙۢۜۘۢۧۦۧۗۛۗ۬ۦ۫ۥۨۘۗۚۘۢۖۚۢۥۘۜۥۥ";
                    while (true) {
                        switch (str6.hashCode() ^ 377168069) {
                            case -1534242438:
                                String str7 = "۟ۡۧۢۧۜ۠ۡۘۜۙۤۘۦۙۗۛۛ۟ۜۧۚۗ۫ۗۦۚۚۘۖۜ۟ۦۘۘۘۡۘۚۡۚۙۙۙۥۜۗۚۚۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 492434973) {
                                        case -1361415276:
                                            str7 = iArr2[1] > iArr[1] ? "ۦ۠ۜۘۥۚۘۘۦۨۘۙۥۘ۬ۨۥ۫ۨ۟۫ۤۜۘۥۨۨۛۚۢۤۚۖۨۛ۟۬ۘۥ" : "ۧۦۥۢۙۤۨۗۜۛۜۘۗۧۤ۟ۤۚۢۨۥۜۥۘ۟ۗ۠ۦۡۨ";
                                            break;
                                        case -756050241:
                                            str6 = "۫ۤ۬ۚۙۜۘۙۗۜۘۨ۟ۡۘOۜۗۜۘۛۖ۬ۖ۟ۜۜۤ۟۫ۘۘ";
                                            break;
                                        case -550443014:
                                            str6 = "ۦۖۥۚۜۧۤۤۦۘۚۚۘۘ۠ۖۤۘۚۥۘۧۖۥ۬ۚۖۛ۠ۡ۟ۜۥۘ";
                                            break;
                                        case 1513333085:
                                            str7 = "ۥۜ۫ۛۚۙ۫ۡۥۚۨۘۛۨۡ۟ۧۢۜۧۥۘۛۜۨۘ۠ۥۡۘۤۦۖ";
                                            break;
                                    }
                                }
                                break;
                            case -1009027347:
                                str = "ۥۤۘۘۗۧ۬ۧۖۡ۬۫۬ۥ۟۫ۥۜۘۧۘۦۜۗۚۜۦۖۘۗۢۤۜۚۦۘۘۛۥۙ۠۫ۦۚۚۚ۬ۦۘ۠ۨ۫";
                                break;
                            case -498061565:
                                str6 = "۠ۦۛۖۛ۬۫۫۬ۘ۠ۚۨۛ۟ۥۢ۬ۨۘ۬ۨۥۛ۬ۤۥۙۡۨۘ";
                                break;
                            case 1509376892:
                                break;
                        }
                    }
                    break;
            }
            str = "ۘ۟۟ۛۨۛۜۚۘۧۖۥۘۜۗۦ۟۠۬ۨۥ۬ۙۗۨۘ۟ۙ۟ۥ۫ۥۘ";
        }
    }

    private /* synthetic */ void OoooO0O() {
        String str = "ۤ۫ۚۨۧۚۢۡۦۘۘۙۘۘ۠۫ۛۘۡۖۘۢۦ۠ۗۨۘ۫۠ۦۘۖۤ۠۠ۚ۫۠ۘۙۨۖۥۘۥۦۢۗۘۚۛۜۜOۨۚۦ";
        while (true) {
            switch ((((str.hashCode() ^ 321) ^ 803) ^ 442) ^ 1107908291) {
                case -44608253:
                    str = "ۚۦۘۘۥۗ۠۬ۖۥۛۧۖۖۘۤۘ۟۫ۤۜ۬ۜۢۧ۫ۨۘۢۜۨۘ";
                    break;
                case 889655422:
                    this.o0Oo0oo = false;
                    str = "۠ۚۦۘۘۦۘۙ۠ۜۖۘۘۘۗۖۧۗۧۢۦۦۤۙۛۢۘۢۨۗ۟ۖ";
                    break;
                case 1026722292:
                    return;
            }
        }
    }

    private void OoooOO0() {
        int[] iArr = null;
        ImageView imageView = null;
        int i = 0;
        ImageView imageView2 = null;
        int i2 = 0;
        ImageView imageView3 = null;
        int i3 = 0;
        int i4 = 0;
        ImageView imageView4 = null;
        String str = "ۚۙۖۤۗۧۧۗۦۦۚۘۘۧۤۚ۟ۜ۠۬۠ۥۘۘ۟ۛۘۘ۠ۖۡۘۖۖۦۥۡۧۘۦۧۡۘۛ۠ۡۘۥۗ۫۫ۘۡۗۥۚۗۘ";
        while (true) {
            switch ((((str.hashCode() ^ 650) ^ 602) ^ 623) ^ 2111176623) {
                case -1810132243:
                    imageView = this.OoooooO;
                    str = "ۡۥۥۛ۫ۜ۬۬ۤۨۗۡۘۥۗۖۘ۬۠۫ۛۙۗۨ۫ۦ۬ۙۙۡۙۜۚۧۦۡۢ۠۬ۦۨۛ۟۟ۙ۬ۚۜۦۘ";
                    continue;
                case -1764683117:
                    OooooOO(0, (int) (this.OooooO0 - this.OooooOo));
                    str = "ۖۘ۫۫ۙۤۖۙۨۘۜۚ۫ۦۖۜۘ۫ۧۧۨۦۦۘۨ۠ۖۘۤۧۛۚۘۜ۫ۥۛۦۖۘ";
                    continue;
                case -1663929287:
                    this.Ooooooo.removeView(this.o0OoOo0);
                    str = "ۧۡۜ۫ۥۦۗۦۘۘۡۜۦ۠ۙۖۘۛۡ۟۟۬ۦۗۡۘۗۦۦ۟۠ۖۘ";
                    continue;
                case -1552493049:
                    iArr = new int[2];
                    str = "ۦۨۡۗ۫ۗ۬ۢۙ۬۟ۙۖۨۙ۬ۢۜ۫ۗۗۢۚ۟ۜۥۧۧۦۜۗۤۛۥۥۘ۠ۖۙۚۗ۬ۨۢۧۚۦۨۘ";
                    continue;
                case -1415865671:
                    imageView4.setImageResource(i4);
                    str = "۟ۘ۠ۢۤۨۙۙۡۘۦ۟ۖۘۦۛۘۘۘ۟۫ۨۜۥۘ۠ۘ۫ۜۧۨۢ۠ۖۘ۫۬ۨۗ۟۫ۘ۠۬ۙۦۘۨ۫ۜۘۛۨۖۘۛۜۖۨۘ";
                    continue;
                case -1390714472:
                    String str2 = "ۖۡۢۦۘۖۜۖۤ۟ۧۧۗۗۧۤۤ۬ۗ۬۠ۜۛۧۜۦۗۜۚۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1737294153)) {
                            case -1405321464:
                                str = "ۨۚۘۘۛۚ۠ۦ۟ۧ۟ۡۘ۫ۚۦۘۘۜۢۛۛۜۘۡۨۚۡۗۙۥۖ۠۟ۚۢۢۜۖۘ۟ۛۨۥ۬ۘۘۗۖۜۘ۟ۘۥ";
                                continue;
                            case -1188404951:
                                String str3 = "۠ۖ۟ۗ۫ۤ۬ۥۖۜ۫ۙ۟ۧ۫ۛۢۡۦ۬ۨۗۢۗۜۧۜۛ۫ۖۘۙۜ۬ۜۚ۬ۜۡۢۜۖۗ۫ۚۨۘۤۡۡ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-2055957577)) {
                                        case -433854386:
                                            str2 = "ۛ۟۬ۖۤۢۢۛۨۛ۫ۖۨۚۚۦ۬ۖۢۛۨۤۖ۠ۜ۟ۛۧۦۖۘ۟ۘۧۘۚۥۢۧۛۦۤۥۤۥۥ۟۬ۡۜۘ";
                                            break;
                                        case 714910725:
                                            str3 = ((float) iArr[0]) >= (((float) C4491w3.OooOoo0(getContext()).x) - this.OooooOO) / 2.0f ? "ۤۚۘ۫ۛۨۘۜۗۜ۠ۦ۫ۖۚۖۘۙۧۨۘۙ۬ۨۘۦ۫ۗۖۥۥۧۢۘۘۢۦۘۙۤۙۤۗ۬ۜۘ۫ۢۨۘۦۗۥۘ" : "ۢۥۖۘۜۙۖۘۡۨۥۦۗۢۨۘۛۜ۠ۗۤۥ۬۟ۧۡۜ۫ۛ۫ۙ۫۫ۜۡ۫";
                                            break;
                                        case 905534829:
                                            str3 = "ۛۥۘۜۗۖ۫ۘۘۥۥۘۘ۫ۜۥۤ۟۟ۥۧۚۙۧ۫ۡۘۘ۬۠۟ۙۨۨۤۛۥۜۙۘۘ۫۠ۖۘۖۧۡۚ۫ۙ";
                                            break;
                                        case 1313566601:
                                            str2 = "ۗۨۤۗۡۖۘۘ۟ۜۘۢۦۘۢ۟ۖ۟ۙۗۧۗۧۙ۬ۡۢۖۡۚۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case 396525334:
                                str = "ۨۥۦۘۥۜۜۛۡۧۘۜۡۜ۠ۖۘۛ۬ۘ۬۠ۡۘۖۢۜ۟ۖۜ۬۠";
                                continue;
                                continue;
                            case 782386524:
                                str2 = "۠ۦۥ۫۟ۧۨۦۚۗۤ۬ۤۙۛۛۥۘۛۢۛۛۚۦۧۥۦۘۢ۠۟ۚۜۡۚۙۜۜۢۜۘۖۦۨۘ";
                                break;
                        }
                    }
                    break;
                case -1366994091:
                    return;
                case -1169241775:
                    str = "ۘۖ۫ۙ۫ۚۜۜۢۖۖۥۨۦۛۢۢۨۡۛ۠ۦۧۥۛۢۥۘۥۨۦۛۧۘۘۥۘۥۘ۠ۙۘۘۖۥۢۨۢۖۤۦۧۘ";
                    imageView4 = imageView3;
                    continue;
                case -994468855:
                    this.Ooooooo.addView(this.o0OoOo0, 1);
                    str = "ۛۜۨۘۚ۟ۨ۫ۢ۠ۨۨۢ۠ۥۤۘۘۖۙۘ۠۠ۤۖۘۙۢۘ۟ۙۦ۫ۤۚ۠ۛۜۘ۫ۡ۫۫ۛۤ";
                    continue;
                case -795866052:
                    str = "ۛۜۨۘۚ۟ۨ۫ۢ۠ۨۨۢ۠ۥۤۘۘۖۙۘ۠۠ۤۖۘۙۢۘ۟ۙۦ۫ۤۚ۠ۛۜۘ۫ۡ۫۫ۛۤ";
                    continue;
                case -686237717:
                    str = "۬ۡۖۘ۬ۥ۫ۙۚۡۢۘۖۘ۫ۧۜۨۦۘۘۤۨ۫ۖۜۘۚۤۢۡ۟ۚۗۤ۠ۙۢۛۦۗ۟ۜۡۦۘ۬ۜۘۢۦۡ";
                    imageView4 = imageView;
                    continue;
                case -550818686:
                    str = "ۤۤۘۢۙۖۡۘ۟ۚۨۜۘۥۡۦۘۧۗۙۢ۫ۡ۠ۢۥۗۙۨۘ۠ۧۡۘۡۗ۬ۜۧۤ۫ۚۧۦۜۘۗۖ۫ۗ۬ۙ";
                    continue;
                case -265212588:
                case 106679263:
                    str = "ۘۖ۫ۙ۫ۚۜۜۢۖۖۥۨۦۛۢۢۨۡۛ۠ۦۧۥۛۢۥۘۥۨۦۛۧۘۘۥۘۥۘ۠ۙۘۘۖۥۢۨۢۖۤۦۧۘ";
                    continue;
                case 5765243:
                    imageView3 = this.OoooooO;
                    str = "ۤۛۘۧۗۡۘۛۖۦ۟ۙۢۘۨۛ۬ۘۧۘ۬ۤ۫۬ۡۘۗۡۨۘۘۤۘ";
                    continue;
                case 114443753:
                    str = "۟۬ۨۗۦ۟ۗۨۨۘۨۨۗۖۗۛۧۘۡۗ۫ۛۦ۠ۛ۫ۖۗۤ۟ۦۘۜۦۧۤۡ۠ۛۧۦۚۨ۫ۛ۠ۜۙۨۖۛۧۜ";
                    i4 = i2;
                    continue;
                case 413068458:
                    this.o0OOO0o.OooO0o();
                    str = "ۨۚۗۢ۬ۛۙۥۤ۠ۚۜۘۛۥۥۘ۬ۤۧۙۜ۟ۤۢۨۤۘ۠ۦ۬ۦ۬ۥۥۘ۟ۤۚ";
                    continue;
                case 747773627:
                    str = "ۖۖۖ۠۬ۗ۠ۖۡۘۦۤۜۘۢۘۡ۟ۡ۫۠ۢۨۚ۠ۥۢۚ۟ۙۖۧۙۖۗ";
                    i4 = i;
                    continue;
                case 751635170:
                    this.o0OOO0o.setVisibility(8);
                    str = "ۜ۠ۚۘ۟۟۬ۢ۠ۜۢۗۤۨۨۛۛۛۘۦۦۘۦۥ۟ۜۦ۫ۗۙۨۗۙۘۘۙۤ۬";
                    continue;
                case 791774223:
                    i3 = R.drawable.elfin_run1;
                    str = "ۛ۬ۚۡۨۘۢۖۦۖۛۖۘۢۥ۫ۛ۠ۛ۠ۥۨۜۜۨۘۥ۬۬ۚۨۡۘۚ۠۠ۧ۬ۥۖۘۡۘۛ۬ۘۦۦ۠ۥۖۡ";
                    continue;
                case 822276807:
                    i2 = R.drawable.elfin_normal1;
                    str = "ۗۧۘۚۘ۬ۙۛۧۚۧۚۤۚۘۘۜۖۧۘۚۚۖۘۨۧۘۜۦۡۘ۟ۢۗ";
                    continue;
                case 933605391:
                    break;
                case 996296624:
                    i = R.drawable.elfin_pause1;
                    str = "ۖۡ۟ۨۢ۟۫ۡۜۛۙۘۘ۠۫ۖۖۛۡۜۧۧۤۗۖۙۙۛۖۚۖۘۗۧ۠ۚۙۘۘۤۦۥۘ۫ۘ";
                    continue;
                case 1281650907:
                    str = "۫ۛۜۛۖۥۢ۬۠ۖۜۗۧ۟ۙۡۘۡۘۡۖۜۘۗۚ۫ۘۚۗۙۢۘۘۥۚۨۦۘۘۘۢۛۛۨۙۖ۫ۗۚ۠۠ۜ";
                    imageView4 = imageView2;
                    continue;
                case 1392112331:
                    imageView2 = this.OoooooO;
                    str = "ۥۧ۬ۗۢۨۙۨۨۘۚۤۘ۟ۤ۫۫ۤۥۘۢۡۡۨۢۚۘۜ۠ۥ۬ۦ";
                    continue;
                case 1472383712:
                    String str4 = "۫ۢۛۧۛ۬ۦ۫۟ۤ۬ۚۥ۫ۡۘۖۖۘۘۤۨ۫ۙۨۚۥۨۤۤۖۡ";
                    while (true) {
                        switch (str4.hashCode() ^ 1261172130) {
                            case -1371767015:
                                String str5 = "۟ۛۛۦۘۥۘۥۤۗۘۛۖۘ۬ۖۨۘ۠ۡ۟ۖۜۡۘۙۛۥۗۚۘۘ۫۫۟ۖۘۨۘۥۗۦۘۖۥۤۛ۟ۜ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-872643898)) {
                                        case -1270633967:
                                            str4 = "۟ۜۖۘ۫ۘۡۚ۠ۨۡۥۘۨ۠ۨۘ۬ۗۦۘ۫ۨۡۘۢۤۢۚۡۘۘ۟ۘ۬ۘۛۖۘۦۖۖ۫ۤ۠ۖۛۥۘ";
                                            break;
                                        case -392152872:
                                            str5 = "ۘۦۙۜ۬ۖۗۡۘۥۨۢ۠۬ۜ۠ۜۡ۟ۙۥۚ۠ۖۚۖۛ۟۠ۜۘۧۢۗۥۗۨۘۖۥۦۧۢ۬ۢۜۜۘۦۙۢ";
                                            break;
                                        case 1394138343:
                                            str4 = "ۦۘۨۦۧ۠ۨۚ۠۫ۖۡۧۜۘۘۡۤۖۘۤۚ۟ۨۡۥ۬۫ۦۙۡۘۗۦۦ۟ۗۨ۠ۨۧۘۜۢۨۘۛ۠ۘۘۧ۫ۦ۟ۡۥ۫ۢۛ";
                                            break;
                                        case 1477928636:
                                            str5 = this.o0OOO0o.getVisibility() == 0 ? "۬ۧۦۜۖۙۙۢۗ۠۫ۗۡۖۙۚۡۦ۠ۥۥۜ۟۟ۗ۠ۢۜۚۘۘ۟ۥ۬ۚۜۘ" : "۟ۖ۠ۤ۬ۦ۫ۦ۫۠ۢ۬ۙۡۧۦۖۜۥۨۜۜۧۢ۬ۚۤۗ۟ۤۙۡۗۚ۟ۨۦۘ۫ۧۤ۬۬ۘۚۤۘۖ۠ۧۛۚۥ";
                                            break;
                                    }
                                }
                                break;
                            case -149201176:
                                str4 = "۫۫ۦۧۨۥ۫ۤ۫ۧۧۖۘ۠ۗۡۘ۟۠ۨ۟ۛۡۧۖۥ۠ۜۘۘ۟ۛۢۦۨۥ۫ۢ";
                                break;
                            case -120416186:
                                str = "۠ۜۜۧ۫۟ۧۧۦۘۚۥۡ۟ۢۘ۠۠ۖۘۧۘۥۖۙۜۗۘۘۥۜۗۢۘۜۘۦ۠ۚ";
                                continue;
                            case 2004762557:
                                str = "ۨۚۗۢ۬ۛۙۥۤ۠ۚۜۘۛۥۥۘ۬ۤۧۙۜ۟ۤۢۨۤۘ۠ۦ۬ۦ۬ۥۥۘ۟ۤۚ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case 1495222360:
                    String str6 = "۠۬ۨ۬ۙ۬ۘ۫ۘۘۧۜۜۡۛۨۘ۫ۨ۬ۘۤ۬ۦ۟ۥۘۤ۟ۘۘۗۧۗۘۚۥۘۛۚۚۦ۟ۦۘ۫ۥۥۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 1000392750) {
                            case -1927624650:
                                str = "ۤ۫ۘ۟ۨۧۨۙۗۚۤ۟ۢۛۧۛۘۥ۟ۚ۫۬ۥۦۥۡۜۘۤۢۘۧۜۤۚ۠۫";
                                continue;
                                continue;
                            case -1333506876:
                                String str7 = "۠ۚۡۘۤۗۡۘۧۥۡۡۦۖۘ۬ۘۚۜۛۥۚۛۨۙۥۥۢۙۛ۟۠ۢۛۘ۫ۘۖ۫ۚۘۗۥ۫";
                                while (true) {
                                    switch (str7.hashCode() ^ 437066824) {
                                        case -651760413:
                                            str7 = "ۗۘۦۡۦۨۘ۟ۜۡۘۙۤۥۘ۬ۧۡۘۥۚۡ۠۠ۨۘۧ۬ۘۨۥۧۘۨ۫ۨۘۦۖۚۗۛ۬ۥۙۨ۠۬۠";
                                            break;
                                        case -605362295:
                                            str6 = "ۢۨۖۘۦۦۗۘ۫ۘۘۛۧ۬ۚۢۥ۠ۢۥۘۛۡۜۘۥۘۧۘۥۗۦۘۢ۟ۡۘۧۨۖۘۥۗۛۚۤۙ۫ۖۘۙۖۧۘۚۚۘ";
                                            break;
                                        case 339848028:
                                            str6 = "ۜۢۧۘۦۥۘۛۡۦۘۖۦۥۜۦۖۛۜۖۘ۬ۤۧۧۧۖۢۘۙ۠۬ۘۘ";
                                            break;
                                        case 1951822626:
                                            str7 = C3718b7.OooO0Oo().OooO0OO == 4 ? "ۦۖ۫ۖۧ۟ۧ۫۟۟ۨ۬۫۟ۦۗ۠ۨۘۢۤۨۡۧۘۧۡۜۘۤ۫ۤ" : "۫ۨۡۤ۬ۜۘۦۦۗۦ۬ۤۜ۫ۥۛۨۘۚ۠ۥۘۚۜۥۙۚۧ۬ۤۘۘۢۗ۫ۚۜۙۧۧۨۘ۫ۦۚۘۥۘۦۧۥ۠ۢۦۘ۟ۚ۟";
                                            break;
                                    }
                                }
                                break;
                            case -1149416966:
                                str6 = "۬۬ۗ۠۟ۦ۫ۦۤۦۘۥۙ۬ۛۨ۫ۢۧۨۡۘۗۦۘۘۖۥۗ۠ۘۜۘ";
                                break;
                            case 1107982826:
                                str = "ۤۖۘۘ۠ۡ۟۟ۧۧۖۘۤۤۦۡۘۙۚۛۜ۫ۜۘۛۧۧۛۜۙۗ۠ۢ";
                                continue;
                        }
                    }
                    break;
                case 1582932421:
                    String str8 = "ۢ۬ۨۛۦۦۘۚۛۦ۬ۚۨۡۡۘۙۥۚۛ۬ۖۧۜۖۘۢۘۛۨۚ۟ۡۜۘۘۥۘۥۘۧۤۡۡۢۨۚ۬ۗ۠ۙۖۨ۫ۨۜۚ";
                    while (true) {
                        switch (str8.hashCode() ^ 1139823732) {
                            case -1764957928:
                                str8 = "ۨۦۙۖۗۤۡۘۦۘۡ۬ۛۧۤۛۖۡۖۘۦۘۖ۬ۢ۬ۦ۫ۖ۠۬ۧۙۡۥۘۜۙۢ";
                                break;
                            case -1561690693:
                                break;
                            case 787590870:
                                str = "ۙۖۘۨۗ۟۠۫ۡۘۜۨۗۤۖۦۥۛ۠ۚ۬۫ۗۦۘۥۢۜ۬ۦۙۡۚۨۘۦۦۢۗۥ۫ۙ۟ۘ۫ۥۘۢۢ۫ۦۤ۫ۧ۬ۙ";
                                break;
                            case 1958885149:
                                String str9 = "۬ۤۡۘۖۤۨ۫ۨۘۘۦۧۙۦۖۢۚ۬ۘۤ۬ۖۘۜۜ۫ۜۙۤۧۧۜۧۤۛۗۧۜۘ۟ۙۢۨۖۡۘۜۚ۬ۨۦۦۘۖ۫ۙۙۨۜ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-959349671)) {
                                        case -1383478773:
                                            str9 = "۫ۘۗۨۨۙۨۥ۠ۤۖۡۢ۟ۘۘۘۡۖۘۗۗۢۧۤۨۤۛۡۘ۬ۦۥۘۙۨ۠ۡۦۡۙۘۖۛ۫ۗۚۦۨۡۙۨۘ۬۫ۡۥۦۧ";
                                            break;
                                        case -955550913:
                                            str8 = "ۡۢۘۘۗ۠ۜۘۗۙۖۤ۬ۙۗ۠ۜ۠ۧۥۚۖۥۗ۠ۥۙۤۡ۬ۡۖ";
                                            break;
                                        case -73750174:
                                            str8 = "ۡۤ۫۠ۡۖ۟ۙۦۘۤۥۥۚۦۜ۠ۜۡۗۖۨۘۥۖۢۗۖۦۜۛۛۘۜ۫ۧۚۦۘۛ۠ۤۧۨۚ";
                                            break;
                                        case 499764075:
                                            str9 = C3718b7.OooO0Oo().OooO0OO != 2 ? "ۘۖ۠ۥۢ۫ۧۥۚ۬ۛ۬ۗۤۤ۠ۘۡۘۦۛۨۘۜ۫۠ۗۘۡۖۙۖۘ" : "ۧۙۤۡۖ۫ۙۡۧۛۤۤۡۛ۟۬۫ۜۧۘۘۘۛ۬ۖۘۗۚۜۗۥۦۤ۠ۨ۬";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1587653621:
                    String str10 = "ۚۦۧۘۡۥ۫ۢۗۢ۟ۙۘ۠۠ۛ۠ۤۛۧۜۖۘۗۧۜۘۙۖ۫ۤۖۨ۠ۜۥۖۗ";
                    while (true) {
                        switch (str10.hashCode() ^ 1978163845) {
                            case -1346595304:
                                str = "ۤۧۦۘ۫ۦۚۤۥۧۗ۟ۡۘ۟۫ۡۤۤۘۘ۫ۤۖۥۙۙۚۜۦ۬۠ۡۙۜ۟ۜۧۚ۠۟ۤ۫ۥۜ";
                                continue;
                                continue;
                            case -1184855818:
                                str10 = "۟ۖۡۘۘۖۤۛۦۦۤۙۘۘۚۦۨ۫ۥۧۘۥۚۖۘۘۦۡۘۗۗۘۘ۠ۛۛۚ۫۬ۖۘۨۘ";
                                break;
                            case 535751805:
                                str = "ۢۤۖۘۦۤۤۥۧۤۢۗۦۘۖۖۡۦ۬ۜۘۖۜۨۤۨۢۖۢ۟ۢۢ۫۬ۡۨۘۚ۟ۗۘۥۧۙۙۜۘۙ۟ۜ۫۫";
                                continue;
                            case 974407597:
                                String str11 = "ۛۖۨۘۙۨۥۘۨۨۘۥۚ۟۫ۗۤۦ۬ۖۨۖۤ۠ۗۥۘۡ۠ۚۦۤۢۤۜۘۥ۠ۖۘۡۖۥۖ";
                                while (true) {
                                    switch (str11.hashCode() ^ (-1996379427)) {
                                        case -760199188:
                                            str11 = C3718b7.OooO0Oo().OooO0OO == 3 ? "۫ۢ۬ۤۗۜۘۖ۬ۜۘ۟ۦۜۨۘ۟ۘۤ۬ۛۖۥۢ۫ۤۨۢ۠ۤۛۦۘۜۛۙۗۛ۟۫ۖ۟ۗ۫ۦۘۨۘۜۘۖۛۜۘ" : "۬ۡۨۘۧۤۨۖ۫ۡۘۛۨۧۛۙۨۘۧۨۨ۠ۤۢۛۙۘۘۢۛۢۤ۬ۦۛۜۨۙۡۦۘ";
                                            break;
                                        case -585296548:
                                            str10 = "ۦ۬ۢ۠ۜ۠ۙۧۦۛۘۙۢۖۧۙۢ۬ۜۖۚ۬ۖۥۘ۬ۦ۟ۧۚۢۘۧ۠ۥ۟ۥۘ";
                                            break;
                                        case 851765468:
                                            str10 = "ۘۡۨۘۤ۠ۘ۠ۚۦۘۥۢۦ۠ۛۥۥ۠۠۠۫ۚۢۙۤۘۤۧۙۛۤۘۘ۟۠ۖۘ";
                                            break;
                                        case 1653421157:
                                            str11 = "ۨ۟ۨۨ۫۠۫ۖۛۗ۠ۛ۠ۘۨۘۚۢۤۧ۠ۦۢۚۡۘۨ۬ۦ۟ۦۖۢۗ۫ۜ۫ۖۧۥ۟ۙۖۘۧۚۘۘۨۨ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1759121268:
                    OooooOO(C4491w3.OooOoo0(getContext()).x, (int) (this.OooooO0 - this.OooooOo));
                    str = "ۗۦۦۘ۟ۗۖۘۥۗۛۤ۠ۛۤۡۘۘۨۢ۬ۧۘۙۨ۟ۜۘ۠ۖۜۘ۬ۗ۠ۘۢۘۘۙۧۦۛۥۢۚ";
                    continue;
                case 1838542658:
                    this.OoooooO.getLocationOnScreen(iArr);
                    str = "ۤۘۧۡۙۛ۬ۤۘۘۥۛۜۤۚۜۘ۫ۚۡۘۢۜۡۘ۬ۥۙ۬ۜ۠۟۟ۧۘ۟ۥۘۖۥۖۛ۠ۧۗۜۨۚۖۘۦۙۡۘ";
                    continue;
                case 1874680474:
                    this.Ooooooo.addView(this.o0OoOo0, 0);
                    str = "ۦۦۨۘۙۙ۫ۛۛۗۖۛ۟ۜ۟۟ۜۙۖۛۡۘ۬ۦۧۘۦۖۘ۫ۖۥۘۢۘۘۘۥۗۥۘۙۙۖۘۖۥۜۘۦۨۜۨۦ";
                    continue;
                case 1880852882:
                    str = "ۜ۟۬ۙۜۨۘۗۤۜۗۜۙ۫ۘۜ۬ۖۨۘۤۧۜۘۖۛۤۨۨۥۦۗ۟";
                    i4 = i3;
                    continue;
                case 2113034676:
                    this.Ooooooo.removeView(this.o0OoOo0);
                    str = "۟ۙۗۛۡۖۘۚۨ۫ۛۚۖۘۙۙ۬ۚۥۜۛۖۘۗۘۗ۠ۖۜۙ۟ۨۘۖۥۢۨۘۢۦۚۢۧۧ";
                    continue;
            }
            str = "ۚۗۚۛۛ۟ۙۦۘۤ۬ۦۘۢۛۘ۬ۥۤۘۛ۟۬ۜۛۡۛۨۖۦ۠ۢۜۥۖۗۗ";
        }
    }

    private void OoooOOO() {
        String str = "ۤ۟۫۫ۗۧۗ۟ۢۚ۬ۘۘۨۖۦۤ۟ۛ۬ۢ۠ۛۜۙۖۙۨۖۤۤۚۛۘۘۨ۠۟۠ۖۖۘۖۖۦ";
        while (true) {
            switch ((((str.hashCode() ^ FrameMetricsAggregator.EVERY_DURATION) ^ 264) ^ 107) ^ 167397053) {
                case -2066448751:
                    str = "ۘۦۖۘ۬ۨ۟ۥۚۤۙۖۘۘۧۧۜۧ۟ۧۥۦۧۨ۟ۙۨۜۦۘ۠ۥۡۗۜۦۖۙۜۡۤۘۜ";
                    break;
                case -918268328:
                    this.OoooooO.setAlpha(1.0f);
                    str = "ۚۨۖۘۗ۬ۦۘۚۖۚۘۛۥۥۜ۟ۜۢ۟۠ۦۡۘۘۦ۫۟ۤۥۘۘ۫ۖۘ۫۬ۨۘ۠ۦۘۤۙۘۘۛ۬ۗ";
                    break;
                case 1599502412:
                    this.o000000o.cancel();
                    str = "۟۠ۜۘۚۗۨۗۘۚۡ۟ۙۢۧۥۡۜ۠ۡۘۗۥۖۖۥۛۥۘۡۘۥۗۚۤۤ۠ۜۘۗ۬۫ۨۦۖۧۗۥۨۢ۫ۥۧۤۤۧۘۘ";
                    break;
                case 1619175280:
                    return;
            }
        }
    }

    private void OoooOo0() {
        OooO0OO oooO0OO = null;
        String str = "ۘۥۧۘۤۨۥۨۡۥۘ۫ۡۦۖۡۘۥ۟۫ۦۡۦۘۚۢۧۚ۫ۚۦۡۛۢۘۘۘۘ۫ۚۛۙۧۧۨۢۗۙۜۡ۫ۤۛۡۚ";
        while (true) {
            switch ((((str.hashCode() ^ 350) ^ 52) ^ 823) ^ (-241825727)) {
                case -2045149310:
                    String str2 = "ۜۛۜۘ۠ۡۘۘۜۙۧۢ۠ۜۢۦۥۚ۬ۚۨۗۜۦۤ۠ۥ۠۠۫ۛۛۛ۠ۚۘۨۤۢ۬۫ۧۗ۟ۜۜۘۘۛۖ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 255644071) {
                            case 342844469:
                                String str3 = "۠ۢۛۦۖۡۨۚۘۘۛ۠ۧ۫ۤۚۗۢۘۜۨۨۜۖۥۘۦۙۖ۫ۗۤۢۦ۬ۡ۫ۨۘۚۥۧۤۚۥۘ۟ۦۧۢۢۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-609484690)) {
                                        case -1934821492:
                                            str2 = "ۙۚۘ۠ۨۢۧۢۘۘۚۨۦۘۢۗۗ۬ۛ۬۫ۤۙۙ۟ۡۘۚ۫ۜۢۨۚۚۗ۠ۧ۬ۘۦۗۥۘۥۛ۫ۛۦۛ۟ۙۢ";
                                            break;
                                        case -1353844749:
                                            str2 = "ۚۜۦۘۥ۟ۙۘۚۜۘ۠۟ۜۘ۬ۙ۟ۖۢۡۚۥ۬ۚۜۧۘ۬ۘ۟۬۠ۤ";
                                            break;
                                        case -1270779717:
                                            str3 = !C3718b7.OooO0Oo().OooOO0o() ? "ۚۖۦۘ۠ۘ۟ۢۦۜۙۧۖۘۨ۟ۤ۫ۛۨۘ۠ۢ۟ۘۡۘۡۨۥۘ۫۫ۦۘۧ۟ۨۢۥ۠" : "ۜۡۧۘ۬ۧ۬ۤۗۗ۫۟ۙ۫ۚۤۨۧۧۡۧ۬ۢۤۖۘ۫ۗۨۗۤۖۚ۠ۨۦۦۦۧۢۥ۟ۥۖۦ۟ۘ۟ۘۜۘ";
                                            break;
                                        case 123599303:
                                            str3 = "۬ۦۜۘ۠۟ۦۤۨۜۙ۠ۢۨ۟ۘۘۡۦۜۤ۫ۚ۬۬ۚۖۢۗۨ۬ۙ";
                                            break;
                                    }
                                }
                                break;
                            case 1449314923:
                                break;
                            case 1655522519:
                                str = "۟ۘۡۘۛۢۨۢۜۧۘۦۧۥۨۘۡۖۢۜۗۖۘۧۨۤۤۢۗۛ۠ۡۘۨۡۤۢۛۜۤۥۖۧ۟ۛۡ۬ۦۘۗۧ";
                                break;
                            case 1806560429:
                                str2 = "۠۬ۗۗ۠۟ۤۘ۬ۦۖۡۘ۬ۚۡۘۧۧۦ۟۫۬ۢۦۗۢۨۖۘۙۦۡۥۦۦۘ۠ۖۖۜۖ۫ۤۜۘ";
                                break;
                        }
                    }
                    break;
                case -2040423985:
                    this.o0Oo0oo = false;
                    str = "ۥۘۨۛۚۘۙۗۥۘۤۗ۬ۦۗۖۥۡۧ۟ۢۦۘۛۡۥۘۦۗ۫ۚۚۜۨۥۙۗۤ۠ۥۜۗۚ۫ۡۨۖۡۘۖۦۜ۫۫ۨ۟۟۠";
                    continue;
                case -1864717202:
                    String str4 = "ۦۚۡۚۘۧۗۛۚ۬ۧۢۤۦۡۤۧۘۘ۠ۘۘۜۢۦۘۨۗۗۡۧۧ";
                    while (true) {
                        switch (str4.hashCode() ^ 294125809) {
                            case -653441705:
                                str = "ۡۛۡ۠ۦۛۢۡۚۥ۟۠ۚ۟۬ۨ۠ۜۘۨۖۦۘۙۧۥ۟ۨۜۡۢۥ";
                                continue;
                                continue;
                            case -601677627:
                                str = "۠ۨۚۖۤۙۤۦۡۘ۬ۗ۫ۨۚۗۚۥۨۘۧۙۦۖۦۛ۟ۥۘۘ۟ۖۘۜۤۛۧ۟ۦۘۜ۫ۖۘ۠ۦۜۡۜۢ۬ۜۦۘۚۜ۟ۤۦۜ";
                                continue;
                            case 1339122093:
                                String str5 = "ۡۜ۟ۦۥ۟ۗ۬۠۠ۤ۫ۦۗۢ۫ۨۘۢۤۙۨۖۦ۫ۘۗۡۚۘۚ۠ۡۘۛ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1460240387)) {
                                        case -1624577022:
                                            str4 = "۫ۦۜ۟۫ۡۥۚۗۤۙۖ۟۫ۨۘۧ۟ۜۖ۠ۥۘۡۢۙ۫ۖ۫ۥۧۘ";
                                            break;
                                        case -1617746149:
                                            str5 = this.o0OO00O == null ? "ۘ۟ۖۡۗۖۘۨۘ۟ۥۙۦۨۤۦۘۚۧۦۜ۫ۘۘۘۨۛۥۚ۬ۢۚۦۘ" : "ۦۢۥۖۡ۟ۦۡۢۙۤۡۡۖۡ۠ۥۘۤۘۤ۠ۡۘۘۧۘۦۦۡۤۡۤۚۘ۫";
                                            break;
                                        case -245445957:
                                            str4 = "ۤ۠۬ۦۧۖۚ۬ۡ۬ۙۙ۬۠ۢ۫ۨۧۧۢۦۘۨ۠۠ۛ۫ۜۘ۠ۛۤۛۙۗۛۨ۬";
                                            break;
                                        case 655492283:
                                            str5 = "ۗۡۡۗۙۡ۠ۚۛۚۥۦۤۢۚۨۥۡۙ۬ۡۘۚۜۧۘۧۨۧۦۜۘۦۧۗۥۤۡۘۡۚۖۘۗۖۜۘۙۨۙۙۦۘۘۜۖۘۘ۠ۜۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1742983501:
                                str4 = "ۤ۫ۘۘ۬ۦۦۘۗۤۘۘۙۧۖۘۥ۫۟ۥۖۦۤۜۘۘۦۙۖۨۧۛۘۡۘۘۙۦ۬ۧۙۗۛۙۛۢۥۨ";
                                break;
                        }
                    }
                    break;
                case -1795915467:
                    this.o0Oo0oo = true;
                    str = "ۖۘۢۜۧۖ۠ۚۧۦ۫۟۠ۘ۟ۛۗ۬ۡۙۥۤ۠۟ۙ۫ۡۘۛۛۙۖۥۜۧۨۧۘۛۘ۬ۡۖۗ۬۟ۡۘۖۥۙ";
                    continue;
                case -1470740012:
                case -996947224:
                case -722674730:
                case 206820742:
                case 416609339:
                case 1364582900:
                    return;
                case -1335311312:
                    this.o0OO00O = new Oooo000(this, oooO0OO);
                    str = "ۡۛۡ۠ۦۛۢۡۚۥ۟۠ۚ۟۬ۨ۠ۜۘۨۖۦۘۙۧۥ۟ۨۜۡۢۥ";
                    continue;
                case -1328857854:
                    str = "ۤۥۚۜۖۖۢۧۚۗ۠ۗۧۙۤۘۦۚۨۥ۟ۡۨۧۢۖۨ۫ۢۥۛۗۥۘۨۨۦۖۢۗۘۨۤ";
                    continue;
                case -1195068556:
                    C3753c5.OooO0OO(getContext(), getContext().getString(R.string.network_off));
                    str = "ۦۥۖۘۙۗۛۥۨۜۡۚ۬ۥۡۘۧ۬ۗۥۦۗۧۚۧۗۤۨۧۜۦۘۦۗۜۘۜۧ۫۬۫ۚ۠۫ۚۙۥۥۘ۟ۥۨ";
                    continue;
                case -664790942:
                    C3940h7.OooO0o0(new OooOO0O(this));
                    str = "ۤۥۚۜۖۖۢۧۚۗ۠ۗۧۙۤۘۦۚۨۥ۟ۡۨۧۢۖۨ۫ۢۥۛۗۥۘۨۨۦۖۢۗۘۨۤ";
                    continue;
                case -598002037:
                    String str6 = "ۖۤ۠۟ۢۨ۠ۗۡۡۦۘ۬۬ۜۘۢ۬ۧۖ۟ۤۦ۬ۤ۬۬۠ۢۜۡ";
                    while (true) {
                        switch (str6.hashCode() ^ 235337138) {
                            case -1661712002:
                                str = "ۨۜۗۢۢۗۜۦ۟ۢۜۥۥ۬ۧۗ۬ۚۛۧۢۥۛۡۘۜۘۨۤۨۘۧۗۜۜۗۛۜ۟۠ۡۚۥۘ";
                                continue;
                            case -704666435:
                                String str7 = "۬۠ۥۧۚۨۘۘ۫ۤ۟ۨۖۘۦۛۨۘۙۦۖۙۙ۠ۧۥ۟۬ۖۤۦۡۘۘۢۤۨ۟ۜۥ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1073628141) {
                                        case -344928347:
                                            str7 = "۠۟ۨۘۧۤۦۘ۟ۤۖ۫ۖۖۢۡ۬ۜ۠ۥ۬ۡۘۗ۠ۗۤۤۖۘۢ۬ۥ";
                                            break;
                                        case 1683567748:
                                            str6 = "ۜۚۡۢۛۖۘ۠ۖ۠۠ۗۦ۠ۥۢ۠ۥۨۜۦۤۚۛۖۘۤۢ۬ۜۢۥۡۢۥ۟۠ۢ";
                                            break;
                                        case 2105308943:
                                            str6 = "۬ۡۖۘ۫ۨۜ۬ۨ۠ۘۜۡۚۨۥ۟ۦۜۤ۠ۥۘۤۙۘۥ۫ۙۦ۬ۦۘۥ۟ۡۘ۠ۡۡۘ";
                                            break;
                                        case 2137969559:
                                            str7 = C3797dc.OooO00o().OooO0OO(AppContext.OooO00o()) ? "ۡۧ۟ۜۥۘ۬۠ۧۦۜۡۘۜۤۚۗ۬ۜۘۚۨ۠ۥ۟ۢۗۛۗۦۤۜۛۙۡۘۙ۬ۦۤ۟ۥۛۡۥۘۜ۟ۙۜ۫ۖۘ" : "ۙ۬ۤ۠۫ۘۚۛۖۡۨۧۘۡۗ۬ۙۡۘۡۢۘۦۧۡۘۡۢۛۥ۠ۚۙۙۨ۠۠ۨ";
                                            break;
                                    }
                                }
                                break;
                            case 223666701:
                                str6 = "ۖۚۗۢۡۖۘۡۨۘۗۢۡۨۚۨۘۥۚۘۘۥۛۤۜۗۨۘۦۤ۬ۙۡۙۚ۬ۖۖۡۤۧۤ۠ۧۙۗۜ۬ۧۢ۠ۡۜۚۙ۠ۤۜۘ";
                                break;
                            case 905913008:
                                str = "ۙ۟ۡ۫ۦۙۧۛۡۘۖۛۡ۫ۡۥ۬ۖۛۡۙۙۤۨۤۢۤۜ۟ۛۖۘ۬ۗ۫۫۫ۥۢ۬ۦۘۧۚۤۦۗ۫ۧۜۘ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case -480649349:
                    String str8 = "ۜۜۖۘۤۥۦ۟ۨۤۜ۟ۨۘۗۦۘ۠۟ۖ۫ۚۚۧ۫ۥ۫ۗ۬ۜۜۨۘۖ۫ۨۛۚۦۧۙۧۦۢۦۘۨۥۤ۫ۛۡۡۛۙۗۥۡ";
                    while (true) {
                        switch (str8.hashCode() ^ (-2105331885)) {
                            case -1217167815:
                                str = "ۥۢۨ۠ۢ۠ۨۖ۠ۡۛۦۘۢۦۧۢۦۦ۫ۜ۫ۜۥۧۘۙۘۧۘ۟ۡۥۘۛۛ۠ۜۡۘۘ";
                                continue;
                                continue;
                            case -1123991137:
                                String str9 = "ۚۡۚۤۧ۟۠ۙۥۘۧۢۤ۬ۨۘ۬ۗۖۤۥۘ۟ۥۖۘۥۤۘۘۨۤۢۢۛۜۨۢۤ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-885709764)) {
                                        case -704755897:
                                            str8 = "ۥ۬۫۠ۨۗۛ۠ۥۘۧۜۨۘۛۜۛۦۨۥۘۧ۬ۥۤۙ۠۫۬ۘۘۖۡۨۘ۬ۙۗۡۦ۫";
                                            break;
                                        case 879773744:
                                            str9 = "ۗۧۤۙۥۢ۠ۙ۫ۧۦۛۡۜۚ۬ۖۚۙ۫ۡۘۜ۬ۘۚ۫ۧ۠ۜۘۛۦۡۘۤۥ۠ۛۚۙ۠۬ۖ";
                                            break;
                                        case 1567537806:
                                            str9 = C3977i7.OooO().OooOOO() ? "۟۫ۥۘۥۥۖۤۘۧۢۤۥۘۥ۠ۖ۬ۙۨۘ۬۟ۨ۬ۘۖۘۥۤۥۜۡۧۘۦۢ۠ۘۛۥ۫۟ۖۘۥۤ۠۫ۘۧۘۥ۠ۖۢ۫ۖۖۨۛ" : "۟۬ۥۛۧۥۘۤۡۘۗۙۚۗ۠ۧ۠ۧۥۥۦۦۘۖۘۙ۠ۤۦۘ۬۫۠";
                                            break;
                                        case 2125554937:
                                            str8 = "ۤۖۨۜ۫ۛۦۦۨۘۥۜۧۘۖۧۚۧ۫۟ۨۚ۠ۦۜۦۘۦ۠۟ۤۡۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case 30205710:
                                str8 = "۫ۨۤۨۙ۠ۜ۟ۤ۠ۦ۫ۜۖۘۖۢ۟ۛۜۛۘ۫ۢ۬ۙ۬ۦۙ۫ۖۥۥۛ۟ۦۘ";
                                break;
                            case 406961838:
                                str = "ۛۜۧۘۙۦۜۘۤۥ۟ۦۤۡۨۘ۬ۘۚۥۛۚ۟ۦ۫ۙۛۗ۟ۖۛۘۘ";
                                continue;
                        }
                    }
                    break;
                case -337056744:
                    String str10 = "ۗۧۤ۟ۖ۫۬ۛۗۧۙۜ۠ۜۡۘۜۙۚۧۨۘ۬ۧۥۘ۟ۙۙۡۚۦ۬ۥ۟ۖۛۛۛ۫ۗ۫ۦۨ۬ۜ۫ۙۢۘۘ";
                    while (true) {
                        switch (str10.hashCode() ^ 385875438) {
                            case -967701084:
                                str = "ۘۥ۫ۙۙۛۦۙۧۙۘۡۡ۫ۘۥۧۡۘۛ۟ۘۜ۬ۡۙۧۡ۠ۡۘۘۙۖۘۗۧ۠۬ۥۜۘۧ۟ۖۘۖۨۖۘ۠ۤۘۘ";
                                continue;
                                continue;
                            case 12873325:
                                String str11 = "ۖۜۡۦ۫۟ۖۘۖۛۜۖۘۗ۠ۦۗ۟ۡۘ۫۠ۖۙ۠ۤۥۛۖۤۘۦۢۛۛ۠۬ۚۜۘۨۡۦۚۜۦۦ۫ۗ";
                                while (true) {
                                    switch (str11.hashCode() ^ 2104726345) {
                                        case -2107023544:
                                            str11 = AppContext.OooO00o().OoooOoo ? "ۛ۠ۖۘۘۡۦ۠ۚۙۥ۬ۨۘ۟۫ۦۖۤۜۜۛۥۘۖۜ۠۠۠ۤۜۚۢ" : "ۙۥۨۘۙۘۦۛ۬ۨۘۨۧۧۗۨۘۘۦۚ۟ۚ۟ۧۛۗۧ۠ۗۥۘۥۢۦ۬ۙۥۘۚ۟ۦۘۥۚۢۤۥ۫";
                                            break;
                                        case -1070953947:
                                            str10 = "ۜۧۛۦ۬ۙۨ۠ۨۜۡ۟ۧۙۘۧۨ۫۬ۨ۬ۛۘۦۘۜۢۚۧ۟ۨۚۢۖۘۦۦۖۘ۬۫ۢ۬ۙۨۘ";
                                            break;
                                        case -741220451:
                                            str10 = "ۤۚۤۤۨ۟۟ۗۡۧۥۜۘۙۙۡۘ۠ۙۖۨ۟ۜۖۧۖۙۢۛۖۨۗۢۢۚۛۢۖ۟ۙۥ۫ۚۗۜ۬ۢۦ۬ۖ۟ۛۘۘ";
                                            break;
                                        case 1239612989:
                                            str11 = "ۘۜۖۘۙۘۙۡۥۖۘۦۨۦۛۛۦ۬ۡۨۘۦۡۧۘۚۜۘۘۡۡۘۜۧ";
                                            break;
                                    }
                                }
                                break;
                            case 577913697:
                                str10 = "ۧۚۡۘۤۨۘۘۖ۠ۦۖۙۘۡۚۢۖۦۢۛۖۤۢۘۘ۬ۡ۬۠۫ۢ۟ۛۡۗۦۦۘ۫ۧۜۘۦ۟ۦۡۧ۬ۜ۫ۡۘ";
                                break;
                            case 1869329818:
                                str = "ۧۚ۫ۚۧ۟ۤۗ۫۠ۢۤۚ۫۠ۨۡۦۘۜۡۜ۫۠ۨ۟۟ۗ۠ۥ۫۫ۜۡۘۦ۫ۖ";
                                continue;
                        }
                    }
                    break;
                case -284122062:
                    String str12 = "ۨۗۨۤ۠ۙۛۘ۠ۛۜۢۙۧۧۗۨۤ۠ۙ۬۠ۢۛ۠ۧۥۤ۫ۙۗۧۨۙ۫۬";
                    while (true) {
                        switch (str12.hashCode() ^ 1151062248) {
                            case -1773807696:
                                String str13 = "ۢ۫۬ۙۗ۟ۨ۬ۗۢۙ۬ۤ۠ۚۚۦۥۘۤۢۤۛۢۛۗۡ۠ۦۦۙۙۨۗۚۢۘ";
                                while (true) {
                                    switch (str13.hashCode() ^ (-137735415)) {
                                        case -2009392133:
                                            str12 = "ۢۢۨۨۚۜۘ۬۫ۘۙ۟ۚ۫ۨۗۧۢۥۢ۬ۨۘۙۜۜۚۥۦۘۚۜۚۘۨ۬ۗۤۦۘ";
                                            break;
                                        case -1949589217:
                                            str13 = this.o0Oo0oo ? "۬ۢۡۨۛۖۨۡۖۘۚ۠ۘۘۗ۬ۥ۬ۨۗۧۦۥۘۧۖۚ۬۠۫ۥۨۜۛۥۡۜۥۘۘۖۥۙ۟ۛۜۘۥ۟ۤۖۘۗۜ۫۠ۚۚ" : "ۘۘۧۚۦ۫ۤۚۤ۫ۖۗۖۛ۠ۜۗۨۘ۠۠ۥۘۤۙۡۢ۬ۖۘۥۘۗ۠ۚۖۥۡ۠ۤۥۡۗۖۖ";
                                            break;
                                        case 291193383:
                                            str12 = "ۜۜۖۘۤۡۘۘۤۜۙ۟ۙۥۘۜۗۜۖۗۜۘۗۜۤۙۘۗۜۗۜۘۗۖ۠۠ۨۤۜ";
                                            break;
                                        case 954304228:
                                            str13 = "ۨۢۡۘۜۨۤۘۦۡ۟ۨۘۥ۠ۙۛۘۖ۟۟ۤ۫ۢ۫۬ۥ۠ۘۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case -1382079382:
                                str = "۠ۚۢۗۚۨۦ۫ۚۛۜ۬ۥ۫ۧۜۘۢۙۨۘۖۚ۫ۜ۫ۖۛۙۖۧ۠ۗۖۗۦۛۤۜۘۗۚۛ۟ۨ۬۠ۦۛۦۚ۬ۗۥۘ";
                                continue;
                                continue;
                            case 265085452:
                                str = "۫ۜۗۖۥۛۜۤۡۡۖۘۦۡۡۘۖۡۖۢۘۗۖۜۢۢ۫ۥۘۙۢۨۦۚۢۧ۠";
                                continue;
                            case 542909750:
                                str12 = "ۤۜۧ۬ۙۜۘۘ۟ۥۘۚ۠ۧ۠ۤۤۖۨۢۢۜۥۚ۬ۘۘۢۚۢۛۗۤ۫ۛۙۚۚۤۨ۠۫ۤ۬ۚۢۦۜۘۚۛۛ";
                                break;
                        }
                    }
                    break;
                case 95433996:
                    String str14 = "ۧۢۜ۬ۥۡۘۨۘۡۘ۫ۦۖۘۤۗۥۘۡۛۢۙۤۨۛۙۥۙۙۦۡۚ۫ۛۚۙۥۧۨ";
                    while (true) {
                        switch (str14.hashCode() ^ 1892749906) {
                            case -1234617308:
                                str14 = "ۦۧۖ۫۫ۖۘ۬ۧۖۚۛ۠ۙۚۥۧۢۥۘۦ۫ۛۗ۫ۡۘۖۘۘۘ۟ۨۘۥ۫ۖۘۨ۟ۗۦ۬ۗۖ۫ۤۜۙۜ۫ۤ۬ۗۙ۠ۖ۫";
                                break;
                            case -342111427:
                                String str15 = "ۘۜۜ۬۟۟ۜۗۧۘۥۡۢۨۨۖۨۘۤۦۛ۬۟ۦۘۧۤۢۛ۬ۥۚۤ۫ۛۤۗۦۢۘۘۥۛۗ۫ۢۚۛ۟ۛ";
                                while (true) {
                                    switch (str15.hashCode() ^ 1483036787) {
                                        case -564118510:
                                            str15 = "۠ۧۖۘۡ۬ۙۦۨۨۘۥۖۘۘۨۜۘۘۛۚۤۜۧۛۥۘۥۨۜۘۚ۠ۨۡۡۜۘۛۚۚۥۘۤۢۙۥۚۜۢۚ";
                                            break;
                                        case -84128758:
                                            str14 = "ۘ۫ۥۡۗۦۘۧۜۧ۟۠ۚۗۧ۬ۖۥۢۖۨ۫ۘۥۘۚۛۢ۠ۚ۠ۙۘۘۦۢۛ";
                                            break;
                                        case 691623870:
                                            str14 = "ۧ۫ۗ۬ۡۘۘ۟ۙۙۙۨۚۨۢۖۘۚۤۦۘ۟ۧۥۘۡۚۙۘۗۖۘۘۜۧۘۥ۟ۦۜ۠۫ۨۛۘۚۥۡۡۤۤ۠۬ۙۘۨۜۧۘ";
                                            break;
                                        case 875973740:
                                            str15 = C3718b7.OooO0Oo().OooOO0O() ? "ۖۗۛ۬ۙۥۖ۫ۢ۬ۘۘۦۛۚۘۧۡ۫۬۫۠ۖۢ۟ۘۧۘۤۧ۬ۤ۠ۗۧ۟ۖۘۜ۫ۘۘۦ۟ۡۘ" : "ۨۗۖۘۘۙۛۚۖۜۘۙۗۦۘۤۛۜۖۥۤۦۘۡۘۚۗ۟۟۟ۘ۟ۛۤ۟۫۬ۦۧۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1053233822:
                                str = "۠ۗۛۨۘ۠ۤۧۖۤۙ۬ۡۚۘۘۖ۫ۥۘ۫ۡۢۥۧۜۘۥۙۦۘ۟ۘ۫ۢۢۡۘۦۥۖۗۙۙ۬ۛۖۘۡۤ۫ۘۡۨۢۖۡۙۜۘۘ";
                                break;
                            case 1454612455:
                                break;
                        }
                    }
                    break;
                case 203342545:
                    this.o0OO00O.postDelayed(new Runnable() { // from class: z2.w6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.OoooOoO.OoooO();
                        }
                    }, C2187m.f13871ag);
                    str = "ۖۧۨۘۙ۬ۘۘۙۢۨۘۤۜۧۘۦۡۧۡۦۥۘۗۤۜۘۡۥۡۜ۟۫ۥۜۖ۟ۦۖۘۚۧ۬۫۟ۖۘۧ۫ۡۘ";
                    continue;
                case 206839667:
                    str = "ۗ۫ۦۙۛۦۘۧ۟ۤۖ۟ۨۘ۫۟ۚۙۤۡۘۗ۠ۧۦ۬ۙ۠ۚۦۤ۠ۤۜۧۘۖۥۥۘۚ۫ۥ۠ۡۤ";
                    continue;
                case 261121829:
                    C3753c5.OooO0Oo(AppContext.OooO00o(), R.string.environment_init_failure);
                    str = "ۨۧۤ۬ۥۡۘ۫ۤۡۖۧۡۘۛ۟ۡۘۘۗ۬ۛۖۡۦۥۤۗۥۘۘۧ۫ۥۘ۬ۙ۫۟ۤۖۘۛۡۡۘۤۦۥۘۤۤ۠ۖ۬ۦۖۘۜۢۛۘۘ";
                    continue;
                case 322590676:
                    C3753c5.OooO0Oo(AppContext.OooO00o(), R.string.version_too_low);
                    str = "ۖۨۧۛۘۖۘۘ۠ۗۘۗۙۨۢ۟۠ۤۦۘۦۨۢ۠ۜۜۘۧ۫ۛۡۘۦ";
                    continue;
                case 365904202:
                    String str16 = "ۘۨ۠ۛۙۜ۫۟ۗۦۛۡۘۥۛ۫۬ۥۜۙۧۦۘۛۖۨۡۖۘۘۥۡۥۘۚۘۛۗۘۨۘۜۢۧۧۗۗۘۢۥۦ۫ۘ";
                    while (true) {
                        switch (str16.hashCode() ^ 346624354) {
                            case -1537984811:
                                str = "ۦۥۧۘ۫ۢۨۛۗۨۘۙ۫ۡۘۦۚۚۛۜ۫ۗۢۨۨۛ۟ۖ۠ۜۧۜ";
                                continue;
                            case -856258619:
                                str16 = "۟ۜۜۘ۟ۢۚۗۦۧۘ۬ۗۥۘۤۡۥۘۜۚۛ۟ۥۖۘۨۛ۫۠ۢۢۗۡۢۤۚۦۛ۬ۚۦۜۦۧۨۜۛۨۜۢۤۘ";
                                break;
                            case -711915384:
                                String str17 = "۟ۙۡۘۢۖۘۡ۫ۤ۫ۢۗ۠ۡۜ۠ۗۡۘۙۥۘ۟۟ۡۨۜۡۜۤۛ۟ۘۥۙۥۙ";
                                while (true) {
                                    switch (str17.hashCode() ^ 1483922451) {
                                        case -395316641:
                                            str17 = !C4381t4.OooOO0(getContext()) ? "ۖۧۢۧۥۜۘۨ۠ۤۢۡۖ۬ۥۖۖۙۨۘۙۦ۬ۥۥ۬ۚۜۘۘۡۛۡۘ" : "ۙۥۥۢۡۡ۫ۥ۬۠۫ۖۘۙۤ۟۟ۚۡۘۖ۠ۘۘۜۗۥۤۨۧ۫ۡۗۜۨۥۘۖۙۛ۟ۖۘۚ۟ۢ";
                                            break;
                                        case 299795572:
                                            str16 = "ۦۢۜۘۖۗ۫۟۠ۧۖۡۨۡۛۧ۫ۘۦۦۦۘۨ۠ۦۖۚ۫ۖۧۨۖۨۨ۟ۤۗ";
                                            break;
                                        case 327217982:
                                            str16 = "۬ۦۙۧۡۢۖۜۘۢ۫۠ۦۦۤۙۡۤ۟ۜۛ۫۫ۧۘۙۤۤۜۦ۫ۜۦ۫ۡۘ";
                                            break;
                                        case 2137935945:
                                            str17 = "۫ۧۨۘ۠ۧۚۗۢ۠ۥۘۨۘۧۛۤۤ۬۬ۤۖۘۢۢۢۜۜۨۘۤ۬ۛ۬۟ۡۘۙۜ۫ۢۖ۟ۖۧۙ۫ۧۨ۠ۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case -273656832:
                                str = "ۨۖۘۘۤۙ۬ۚۜۨۘۢۦۧۙ۟ۜ۬ۧ۟ۨ۬۟ۡۙۙۜ۬۫ۙ۬ۧۧۙۖۚ۠ۥۘ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case 391410458:
                    this.o0OO00O.removeCallbacksAndMessages(null);
                    str = "۟ۚۡۖۡۘۘۘۧۗۜ۠ۚ۠ۛۢۤ۠۬ۛۘۘۨ۠ۚۗۙ۬ۖۖۛۧۢۡۘۚ۟ۨۨۛۖۘۢ۬ۨۘۧۖۥۤۡۡۘۖۨۦۙۙۗ";
                    continue;
                case 711463883:
                    C3753c5.OooO0Oo(AppContext.OooO00o(), R.string.script_file_verify_failure);
                    str = "۫ۥۖۧ۬ۧۜ۠۬۠ۦۥۨ۬ۖۚۜۜۦۧۚۜۦۥۘۛۤۖۘۖۗ۠ۜۦۤۦ۠ۡۘ";
                    continue;
                case 747934536:
                    this.o0Oo0oo = false;
                    str = "۫۠ۗۛۘۧ۠ۜ۫ۨۛۙۢۖۨۗۗۚۥۖۧۘۘ۬۟ۜۚۢۜۛۡ۠۟۟ۤ۫۟";
                    continue;
                case 1154582528:
                    C3977i7.OooO().Oooo0o0();
                    str = "ۨۢۡۘ۟ۢۢۡۧۚۛۦۛ۠ۜۥۛۜۜۘۜ۫ۦۘ۫۠ۧ۟ۗ۟ۗۤۦۘۗۛۤۢۡۘۨۤۚۢۗ۠ۡ۠۟ۗۗۡۘۗۦۢۙۙ";
                    continue;
                case 2100964913:
                    C3679a5.OooO0O0(getContext(), "runScriptOperate -->\u3000停止引擎");
                    str = "ۦۗ۬۠۠ۖۘۛۜۘۘۜۧ۬ۨ۬۫ۡ۠ۖۘۦۥۧۘۗۛ۫ۨۘۡۖۡۜۘ۠۬۬ۗۡۜۘۨۨۘ۬ۙۡۘ";
                    continue;
            }
            str = "ۚۥۡۘۛۢۖۘۨۡ۫ۡۘۦۘۛۥۚۜۖۖۥۜۚۦۜۙۛۛۖۥۡ۫ۚۨ۫ۖ۫۫ۙۧۥۨ۫ۖۖۙۡ۫۫ۢ";
        }
    }

    private void OoooOoO() {
        String str = "ۥۥ۫ۨۡۧۘۥ۠ۤۚۚۛ۠ۛۨۘۨ۠ۛۡۢۗۙۨۤۤ۫ۥ۠۠ۚ";
        while (true) {
            switch ((((str.hashCode() ^ 95) ^ 348) ^ InterfaceC2174a.f13810N) ^ (-434848808)) {
                case -386046097:
                    str = "ۤۖ۫۬ۡۘۧۥ۠ۤۨۥۥۚۨۦۛۥۨۤۦۘۖۡۙ۬۫ۘ۬ۛۖۘ";
                    break;
                case 127536780:
                    str = "ۗۚۨۘ۠ۥۜۢۡۛۘۘۡ۬ۜۘۡۖۚۗ۫ۥ۫ۨۚۧۘۘۢۢۗۖۙۜۧۖ۠";
                    break;
                case 857506146:
                    Oooo0o0();
                    str = "ۖۗۘۘۨۦۤۡۜۘۘۖۦۥۧۡ۬ۖۖۘۗۛۙۤۦۡۘۦۢۖۜۗۧۗۦ۠۠ۙ۟ۚۜۘۤۚۡ";
                    break;
                case 971411642:
                    String str2 = "ۢۢۛۛۢۨۡ۟ۖۜ۟۫ۛۦۘۦۙۖۘ۬ۚۘ۟ۢ۬ۦۘۘۧۦۘ۠ۥۚۙۙ۠ۘۜۙ۟۟ۡ۟ۡۘۘۜ۫ۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1005127833)) {
                            case -2078715679:
                                str2 = "ۦۖ۟ۚۜۘۘ۫۫۫۬ۘۜۖۛۡۘۢۙۘۢۜۙۤۘۡۘۛ۟ۢۤۡۨۗۘۗۚۘۤ۠ۛ۬ۨۡۗ";
                                break;
                            case 1060888597:
                                String str3 = "ۙۖۦۘۡۨ۫ۗۗ۬۬۠ۥۚۧۛۨ۫ۖۘۨۗۗۤۥۨۖۘۜ۬۟ۙۘۨۘۚۤۘۘۗۙ۠۫ۙ۟ۧ۬ۦۘۜ۬ۘۧۦۙۙۤ";
                                while (true) {
                                    switch (str3.hashCode() ^ 160468733) {
                                        case -1513948069:
                                            str2 = "ۨۜۨۡۨۡۘۛ۠ۥ۬۬۫۠ۧۛۡۘۘ۬۫ۥۥۜ۬ۡۜۛۢۡۜۜۧۖۘۥۖۜ";
                                            break;
                                        case -1066867512:
                                            str3 = C4125m7.OooO0o0().OooOO0 == null ? "ۘۢ۬ۙۚۜ۟ۡۘۢ۬ۨۧۥۜۘۜۘۘۘ۫۫ۦۙۛ۟ۖۗۨۛۦۗۗۧۦۘۘۛۥۘۤۦۨ۟ۧ۟ۘۛۥۘۛۙ" : "۟ۚ۬ۖۖۧۘۢۢۥۘۙ۠ۘ۫ۛۦۘۧۥۥۡۜۥۘ۫ۤۖۨۧۖۘۨۙۛ۟ۜۨۘۥۖۧ";
                                            break;
                                        case -921336814:
                                            str2 = "۟ۨۖۦۗ۫۟ۚۘۦۚۗۙۚ۬ۧۘ۫ۥۘۗۤۧۘۨۖۘ۬ۦۘۗۙ۫۫۟۠ۡۥۤۖۙ۬۫۫ۥۘۧۜۡ";
                                            break;
                                        case 1541322605:
                                            str3 = "ۤۙۥۘ۠ۖۦۘۥۙۦۘۚۨ۬ۤ۫ۨۜۡۧۗۧۗۘۜۗۜۜۘۘۢۖۘۘ۠۬ۥ۠ۘۨۗۨۨۘۛ۬ۥۘۙ۬ۨۘۢۙۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1614463266:
                                str = "ۘۨۦۖۖۛۘۛۨۘۢۡۘۧۢ۫۬ۤۜۜۛۦۘۥۛ۬ۡۨۘۘۨۖۥۘ۟ۤ۟۫ۧۢۡۤ۟ۗ۠۟۬ۙۨۜۗۢۛۥۜۘۡ۫ۜ";
                                continue;
                            case 1869504303:
                                str = "ۦۖۙ۠۟ۛۗۢۘۘۡۤۡ۬ۦۦۘۦۛۖۦ۬ۘۘۙۥۛۗۖۤۥۙ۠ۡ۟۬ۛۧۖۘ";
                                continue;
                        }
                    }
                    break;
                case 1017417537:
                    C3940h7.OooO0oO(this.o0O0O00);
                    str = "ۡۤ۟ۥ۟ۜۘ۟ۨۚۘۘۗۢۗۚ۬ۡۜۘۥۦۤۜۦۙۥ۫ۧۢ۠ۘۘۜۤۨۘ۫۫ۦۡۡۘۥۘۨۛۙۥۙۛ";
                    break;
                case 1093654352:
                    return;
                case 1434718067:
                    this.o0OO00O.sendEmptyMessageDelayed(1001, C2187m.f13871ag);
                    str = "ۤۖ۫۬ۡۘۧۥ۠ۤۨۥۥۚۨۦۛۥۨۤۦۘۖۡۙ۬۫ۘ۬ۛۖۘ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0029. Please report as an issue. */
    private void Ooooo0o() {
        int[] iArr = null;
        ImageView imageView = null;
        int i = 0;
        ImageView imageView2 = null;
        int i2 = 0;
        ImageView imageView3 = null;
        int i3 = 0;
        ImageView imageView4 = null;
        int i4 = 0;
        ImageView imageView5 = null;
        int i5 = 0;
        ImageView imageView6 = null;
        int i6 = 0;
        int i7 = 0;
        ImageView imageView7 = null;
        String str = "ۡۜ۬ۘۙۛۢۤۘۘۗۗۦۧۦ۟۫ۛۦۘۘۖ۠ۦۙۨۤۨۧۖۜۗۛۧۢ۠ۗ۫ۚۛۨۘۡ۬ۗۘۜۖۛ۠ۜ۫ۧۦۙ۠ۗ";
        while (true) {
            switch ((((str.hashCode() ^ 689) ^ 363) ^ 841) ^ 1230479143) {
                case -2120438176:
                    imageView7.setImageResource(i7);
                    str = "۬ۙۥۘۨ۬ۨۗ۫ۦۨۚۜۘۦۨ۫۬۬ۨ۬ۜۘ۟ۧۖۢۗۖۥۙ۟";
                    break;
                case -1771084035:
                    imageView = this.OoooooO;
                    str = "۟ۚۘۘۥ۫ۦۤۤ۫۠۟ۚۛ۠ۨۗۢۖ۟۫ۢۦ۫ۚ۟ۖۘ۠ۥۨۤۡۥ۟۟ۡۜۖ۟ۢۚ۫۠ۙۗۥ۠ۖۧۘۚۖ۠";
                    break;
                case -1645239331:
                    str = "۫ۨۡۧ۟ۛۧۡۧۖ۟ۛۜ۬ۚۘ۟ۖۘ۫ۦۙۖۡۘۘ۬ۗۜۛۘۜ۬۫ۘۧ۫";
                    imageView7 = imageView;
                    break;
                case -1595731833:
                    imageView4 = this.OoooooO;
                    str = "ۨۧۙۡۤ۫۠ۤۦۘۙۖۢۡۗۚ۬ۢۙۡ۬ۖۥۢۡۘۡ۫ۘ۟ۜۚۥۘ۫ۘۥۥۚۥۘۛۜۙۖۜۛۨۦۗۡۖۤۨ۬ۤ";
                    break;
                case -1363864024:
                    i2 = R.drawable.elfin_normal_left_edge;
                    str = "ۨ۟ۜ۬ۥ۟۟ۥۨۘۚۡۗۦۥۖۢ۫۟۬ۧۖۜۗ۬ۢۧۢۘۘ۫ۛۖۨۨۜۡۨۖۙۚ۟";
                    break;
                case -1051328489:
                case 259103649:
                case 1106085124:
                case 1180914709:
                case 1537930087:
                    str = "ۖۜۨۘۚۜۦۘ۬۟ۥۢۜ۠ۧ۟ۚ۫ۨۘۘ۫ۥۢۘۚۗۘۘ۫ۤ۫ۘ";
                    break;
                case -1003756386:
                    str = "ۚ۠۫ۢۨ۬ۡۚۦۘ۫ۢۥ۠ۢ۫ۦۦۘۗۡۡۘۛۨۖ۫ۜۜۨ۬ۛۢۧ۬ۘ۬ۛۜ۬ۥۤۦۘ۟ۥۡۚۤۚۦۜۡ۟ۛۤ";
                    break;
                case -978368446:
                    imageView3 = this.OoooooO;
                    str = "۫ۜۡ۟ۜۡۘۖۤ۟ۦۖ۟ۥۛۜۘۢۨۥۦ۬ۧ۫ۗۨۘ۟۠۠ۚ۬ۘۘ";
                    break;
                case -946127728:
                    i5 = R.drawable.elfin_normal_right_edge;
                    str = "۫ۢۖۜۨۘۘ۠۬ۜۦۢۜۘ۠۫ۨۥۚۙۗۖۜۦۦۜۘۥۜۛۗۜۧ";
                    break;
                case -921755948:
                    str = "ۖۚۚۥ۬ۛۙۛۙۦۗۡ۟ۡۡۘۤۦ۬ۖۜۥۘۡۗ۟ۤۡۘۘ۠ۛ۬۠ۥۜۧۧۖۘۤ۟ۖۘ۬۟۠ۦۗ۫ۢۘ";
                    break;
                case -725175439:
                    str = "۬ۘۤۗۢ۟ۤۚۗۚ۫۫۬ۦۖۗۨۢۖۦۧۘ۠ۢۧۤۜ۟ۚۡۖۘۧ۠ۖۨۖۨ";
                    i7 = i4;
                    break;
                case -657272031:
                    str = "۟ۛۨۢۡۖۤ۠ۡۘۤۥۘ۬ۙ۬ۦۨۛ۫۟ۘ۟ۧۙۦۙۖۢۥۛ";
                    i7 = i;
                    break;
                case -499006128:
                    str = "ۙۘۤۖۘۥۘ۟۫ۘۨۦۨۘۢۥۜۘۗ۟۬۠ۖۦۘۢۖۖۘۢۥۦۧۖۖۘۚۖۜ۠ۧۛ";
                    i7 = i6;
                    break;
                case -292065216:
                    str = "ۦ۫۬ۛۛۖ۬۫ۗ۟ۚۚۛۢۦۛۨۙۙۥۚۥۦۖۙۢۨۘۖۖۥۘۡ۬ۜ۬ۙۜۘۨۛۙ۬ۚۥۘ";
                    i7 = i2;
                    break;
                case 9070176:
                    imageView5 = this.OoooooO;
                    str = "۫ۤۘۘ۟ۗۘۘۜۦ۬۠ۤۧۧۗ۠ۦۡۜۘۨ۫ۥۘۚۜۚۘ۫ۧۡۛۥ";
                    break;
                case 208341856:
                    str = "ۖۛ۫ۤۛۦۘۙۛۜۘ۬۬ۘۘۘۙۦۘۥۨۘۘۙۘۡۘۖۙۦۘۦۗ۬ۙۜۚۙۧ۫ۥۦ";
                    imageView7 = imageView2;
                    break;
                case 248010605:
                    String str2 = "ۡۨۙۜۗۧۡ۫ۜۘۦۨۚۦۨۧۘۗۙۡۛۡۤۚ۬ۙۨ۫ۨۘۗ۬ۙ۟۠ۡ۬۟ۦۘۙۥۧۘۡ۟ۜۘۥۙۗۖ۟ۘۛۚ۠ۨۘ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 1405692856) {
                            case -2144273514:
                                String str3 = "ۥۚ۟ۙۦۡۘ۟۬ۘۘۤۨۧۢۖ۠ۦۢۨۘ۫۫ۧۖۥۥۛۖ۬ۚۗۗ۟ۧۢۖۘۗۢۛۗۧۢ۠ۗ۫ۛ۠ۨۧ۬۬ۡ۫ۚ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1157754967) {
                                        case -1653436281:
                                            str2 = "ۜۛ۟ۘۗۦۘ۫ۤۦۘۦۘۦۜۧۘۘۗ۬ۢ۠ۛۖ۫ۙۦۘۦۤۨۘۜ۬ۛۘۘ۟ۗ۫ۜۘۧۡۘۤ۟ۤۡۖۜۥۘۘ";
                                            break;
                                        case -1078928583:
                                            str3 = C3718b7.OooO0Oo().OooO0OO == 3 ? "ۢۨۧۘۨۧۘ۫ۚۢ۫ۢۘۤۙۖۡۜۤ۬ۦۥۘۛۦۚۢۢۡۛۢۖۘۖ۠ۗۥۙۡۡۢ۫ۢۨۤ" : "ۙۢۨۦۙۥۗۛۡۡۥ۟ۥۖۡ۫ۨۧۙۨۘ۠۟۬۬ۧۨۘۤ۟ۡ۬ۨۨۘۥۘۘۘ۠ۚ۫۟ۦۡۨۘۗۤۡ";
                                            break;
                                        case -431345725:
                                            str3 = "ۛۖۗ۬ۨۢۜۤۨۘۙۢۨۜۡۨ۠۫۫ۘ۫ۦۘۨ۫ۢ۬۠ۘ۬۠ۨۤۡۤۨۢ۬ۡۘۧۘۛ۠ۦ۬ۛ۠ۗۡۦ";
                                            break;
                                        case 1356173630:
                                            str2 = "۠۫ۦۘۖۡۗۜۗ۟۬ۥۚۛۚۥۘ۬ۨۛۙ۫ۜۘۡۙۖۥۧۙۦۖۜۢۚ۠ۜۢۗۛ۬ۙ۠۟ۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case -791505612:
                                str = "ۖۛۥۙۧۖۘۥۧۡۖ۠ۢۚۛۨۖۡۥۖۧۜۘ۫ۨۘ۠۠ۜۘۘۨ۟ۨۥۦۘۘۢۘۘ۟ۗۥ۠ۜۗۗۥۡۡۖۦۘۛۘۥۘۙۨ۠";
                                continue;
                            case -78324215:
                                str2 = "ۥۘۨۦۖۜ۠ۥ۫ۚۗۦۘ۟۟۠ۡۖۦۘ۫ۖۖۢۚۘۘۨۧۘۥۘۚ";
                                break;
                            case 1428804400:
                                str = "۟ۦۛۢۨۖ۟ۤۖۘۛۡۘۘۙۤۜۢۚۜۘۖ۟ۗ۠ۙ۟۟ۘ۟ۛۨۚ۬۠ۥۨۚ۬ۖۗۘۨۨۜ";
                                continue;
                        }
                    }
                    break;
                case 258528871:
                    str = "ۤۜۛ۠ۚۡۘ۬ۙۚۨۧۢۜ۬ۙۖۨۦۘۥۘۙۚ۟ۦۛۜۨۘ۬ۗۥۛۖ۟ۥۘ۬ۧۙ۟ۢۤ۟ۗۜۧۘ۟۠۟";
                    imageView7 = imageView5;
                    break;
                case 502637019:
                    imageView2 = this.OoooooO;
                    str = "ۥۡۖۘۘۢ۫ۗۗۘۘ۠ۡۘۘۘ۫ۨۘۗۛ۬ۨۢۦۛۨۖۘۥۖ۬۫۠۠۬ۙ۫۬۠ۤ";
                    break;
                case 572060241:
                    str = "ۨۜۚۛ۫ۥۘ۫ۖۨۘۜ۠ۨۘۡۘۧ۠ۛۥ۟ۨۘۡ۬ۡۙۦۨۘ۠ۥ۠";
                    imageView7 = imageView4;
                    break;
                case 574745617:
                    str = "ۘ۬ۙۦۡۥۘۙ۬ۨ۟ۨۢۡۢۛۡۛۛۗۨۘۖۖ۬ۙ۟ۖ۟ۦۜۘۚۛ۬۠ۥۤۥۙۦۘۧ۠ۦۘ۟ۡۛۛ۬ۡۢۛۢۜۡۘ";
                    imageView7 = imageView3;
                    break;
                case 667855718:
                    String str4 = "ۛ۬ۚ۬۠ۜۜۜۦۘۤۦۧۘۚ۬۬ۗۦۜۘ۠۟ۤ۫ۛ۫ۡۙۢۘ۫ۨۘ۫۠۫ۜۨۘۘۤۗ۬ۖۜۥ";
                    while (true) {
                        switch (str4.hashCode() ^ 1019694564) {
                            case -2126183530:
                                String str5 = "ۨۢۥۢۗۚ۫ۜۥ۠ۨۜۢۙ۟ۢۙۦۥۡۤۤۛۦۘۜۥۨۘۦ۠ۡ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-755861088)) {
                                        case -1287308662:
                                            str4 = "۬ۥۙۢۢۚۤۘۘ۬۟ۜۘۥۘۚۘۢۖ۠۫ۡۨۧۨ۟ۤۚۗۦۘۙۥۨۘۚۘۨۘ۟ۘۘ۠ۜ۠ۡۚۦۘ۫ۖۨۘۙۗۦۡ۫ۡ";
                                            break;
                                        case -778769954:
                                            str5 = "ۚۦۨ۫ۨۙۦۜۥۘۗۘۥۘۨۘۛۖۜۦۧۜۖۙۚۛۧ۬ۗۡۘۙۧ۠۠ۢۥۜۧۗۢۘۤۡۙۘۙ";
                                            break;
                                        case -108628482:
                                            str5 = C3718b7.OooO0Oo().OooO0OO == 4 ? "ۥۧۛۨۨ۫ۤۧۖۘ۠ۘ۫ۙ۫۬۟ۤ۬۫ۛۥۘۛۤۤۤ۬۟۫ۡۦۧۜۛ۬ۨۖۖۛۤ۠۫ۘۘۙۥۖ۟۫ۜۘۥ۠ۜۘ۠۬ۥ" : "ۡۚۤۙۖۡۘۨۖۖۘۤ۟ۘۘۧۦۨۘۧ۬ۙۢۥۤۚۦۘۙۙ۬ۙ۬";
                                            break;
                                        case 1048050009:
                                            str4 = "ۛۨۜۘ۟ۜۥۘۚۖۗۤۡۡۘۗۦۧ۠ۦۘۨۗۖۨۙۦۘۧۨۙ۟ۜۜ";
                                            break;
                                    }
                                }
                                break;
                            case 1008119528:
                                str = "ۘۢۚۨۦۖۘ۠ۜۘۜ۟ۢۡۦۥۜ۬ۦۘۜۘ۠ۛۡۘ۟۫ۙۤۤۗۧ۟۬۠ۧ۟ۜۗ۟ۧۘۜۗۡۢۦۢ۠ۧ۬ۦۘۘۨۡ";
                                continue;
                            case 1821951341:
                                str4 = "ۤۨۡۘۖ۫ۜۘۜ۫ۡۘۥۗۨۨۡۢ۬ۜ۠ۢ۟ۙۨۨۛۡۚۤۘۥۚ";
                                break;
                            case 1983353573:
                                str = "ۦۧۥۘۦۚۡۛ۟ۨۘۜ۫ۖۘ۫ۙۖۘۡۦۜ۬ۢۤۥۖ۬ۢ۫ۛۙۤۨۘۛۦۤ۠ۤۨ";
                                continue;
                        }
                    }
                    break;
                case 782069597:
                    String str6 = "۫ۨۜۖۢۨۘۙۧۜۖۨۧۘ۬ۘۙۛ۠ۗۘۧۘۥۢۙۖ۬ۨۘۛۗۛۦۖۥۡ۬ۥۘۗ۠ۡۧۛۚۥۜۦ۬";
                    while (true) {
                        switch (str6.hashCode() ^ 1674408289) {
                            case -1228751199:
                                break;
                            case 522717618:
                                String str7 = "۠ۖۢۗۖ۬ۗ۟ۢۖۖۦۘۖۤۛ۟ۡۦۘۛ۫ۦۘۧ۠ۨۘ۫ۜۜۘۤۚۜۛۛۦ۬ۜۗ";
                                while (true) {
                                    switch (str7.hashCode() ^ 693881315) {
                                        case 443256779:
                                            str6 = "ۧ۟ۗۖۖۘ۟ۡۘۤۚۘۘۥۥۙۜ۟ۥۢۨۜۖ۠ۗۛ۠ۙۘ۠۠";
                                            break;
                                        case 1413413818:
                                            str7 = C3718b7.OooO0Oo().OooO0OO != 2 ? "ۦۖۗۨۤۡۘۤۦۘۘۜۗۘۜۡۜۘۚ۠ۜۘۘۡۖ۠ۥ۟ۛ۫۠ۗۚۘۜۛۡۘۖ۟۬" : "۫ۘۨۙۛۨۘۧۘۥۧ۟ۖۘ۟ۤۥۘۚۜۧۖ۟ۡۘۡۡۖۘ۫۟ۗ۬ۨ۬ۧ۬ۖۧ۫ۥۙۛۡۙۦۨۖۦۨۘۚۡ۟";
                                            break;
                                        case 1666923954:
                                            str6 = "ۦۥۗۤۨ۬۠ۘۤۢ۟ۗۧۥۖۘۗۖۘ۠ۗۚۛۦ۠۬۫۠ۚۘۥۘۘۢۤۢۙ۬";
                                            break;
                                        case 1898547124:
                                            str7 = "ۡۖۘۘۥ۬ۥۘ۟ۡۥۧۦۦۗ۟۫۟ۦۘۗۙۧ۟۟۠۫۟۫ۧۧۧ۠۬ۦۖ";
                                            break;
                                    }
                                }
                                break;
                            case 1750186737:
                                str = "۠ۧۦۘۥۙۗۚ۟ۥ۠۬ۡۘۖۧۖ۟ۛۢۦۦ۠ۖۖۦۘ۠۟ۨ۠ۤۧۚۗۗۢۜ۠ۤۡۛۤ۬ۚ";
                                break;
                            case 1886663766:
                                str6 = "ۡۥ۫۫ۜۦۙۜۘۜۗ۠ۧۙۤ۟۠۬ۘۢۦۘ۬ۢۖ۫ۨ۠۠ۙۦۡۢۤۥۦ۫ۜۗۜ۫ۘ";
                                break;
                        }
                    }
                    break;
                case 867792933:
                    imageView6 = this.OoooooO;
                    str = "ۤۤۡۘ۬۟۠۬ۧۛ۠ۤۡۘۤۥۧۘۨۘۖۘۘۛ۫ۖۗۗۤۛۤ۫ۘ۟ۘۡۧۙۖۜۙۡۚ۬ۨۦ";
                    break;
                case 984445334:
                    String str8 = "۠۫ۖۙۥۥۘۖۥۨۘۨۜۘۥ۠ۢۛ۬ۥۧۖۜۧۙۗۚ۟۠ۗۘۥ۬۟ۦۦ۠ۛۖۙۥۘۗۗۘ";
                    while (true) {
                        switch (str8.hashCode() ^ (-434007090)) {
                            case -1772043995:
                                String str9 = "ۥۢۡۧۛۜ۫۟ۜۥۢۦۘۙۙۖۤۨ۟۬ۜۧ۫ۨۨۙ۠۟ۦۘۘ";
                                while (true) {
                                    switch (str9.hashCode() ^ 2105325179) {
                                        case -2138056470:
                                            str9 = "ۙۖۜۘ۟۟ۢۛۛۘۢۨۡۘۖۢۖ۠۫ۛۛۤۘ۟۫ۘۘۚۜۘۘۢۛۥ";
                                            break;
                                        case -1737507647:
                                            str9 = C3718b7.OooO0Oo().OooO0OO == 3 ? "۬ۨۢۦۛۛ۟ۢۙۡ۠ۖ۬ۧۘ۠ۛۛۘۤۤۦۛۦ۟ۘۖۘۙۡۧۘ" : "ۧۡۦۛ۫ۤۘۘۧۘۘۢۖۦۦ۠ۢۢ۟ۙۙ۬ۨۜۙ۬ۛۧۢ۬ۖ۠ۜۖۛۖ۬ۘۖۦۛۨۙۨۖۡۧۢۥۘ۟۟ۦۜ۟ۦۘ";
                                            break;
                                        case 486693114:
                                            str8 = "۟ۛ۬ۧۥۚۙۛۥۜ۬ۘۘۢ۬ۚۛۢۜ۠ۙۖۦ۫ۧ۬۟ۜۥۥۤۙۧۨ۫ۢۡ";
                                            break;
                                        case 1896980367:
                                            str8 = "ۦۚۡ۬۫ۖۘۗۚۦۜۖۜۚۗۨۘۜۚۡۘۥ۬ۖۜۙ۬ۧۨۦۘۛۢۖۘۦۙۢۙۨۨۘۘۙۥۘ۬۫ۦۘۤۜۥۚ";
                                            break;
                                    }
                                }
                                break;
                            case -1740274039:
                                str = "ۚ۬ۡۘۨ۠ۢۘۖۘۗۜۘۘۚۛۗۧۜۦۘۡۥۘۘۦۨۦ۠ۜ۟۟ۘۥۘۧ۫ۡۨۧۡ";
                                continue;
                            case 1143113938:
                                str8 = "ۦۚ۫۠ۜۖۘۥۤۖۘۘۥ۫ۧۘۦۘۗۧۚۤۖۛۜ۬ۜۘۜۛۦۗۧۖۦۘ۫ۧۡۖۜۤۢ۠۟ۘۘۖۜۖ۟ۧۨۘ";
                                break;
                            case 1166436859:
                                str = "ۖۖ۫ۧۢۧۗۗ۠ۗ۟۬ۥۢۗۢ۟ۛۤۗ۠ۘۦۘۜۢۡۘۡۘۡۘ۫ۤۜ۬ۗۡۘ";
                                continue;
                        }
                    }
                    break;
                case 1060091909:
                    i = R.drawable.elfin_pause_left_edge;
                    str = "ۚۨۧۜۜۗ۟۠۟ۦ۬ۡۡۗۜ۠ۡۘۜۛۦۚۛۦۥۨۛۡ۬ۢ";
                    break;
                case 1078474893:
                    this.OoooooO.getLocationOnScreen(iArr);
                    str = "ۢۦۧ۟ۦۖ۠ۜ۟ۚۦۘۘ۬ۥۥۧ۫ۢۦۨۗۢۨۦۘۦۘۧۤۢ۬";
                    break;
                case 1259448559:
                    iArr = new int[2];
                    str = "ۦۦۙۜۨۘۨۧ۠۟ۛۨ۬ۜۘۙ۟ۨۘۜۚۗۢۦ۟ۘۘۧۘ۫۫۬";
                    break;
                case 1270925360:
                    String str10 = "۬۬ۦۘ۠ۗۦۚ۬ۚۦۜۦۘۤۖۢۛۤ۟ۢۜۘۚۢۜۘۦۗۚۙۥۦۘۨۙۘ۬ۜۨۖۥۛۧ۫ۙۢ۟ۙۛۤ۬";
                    while (true) {
                        switch (str10.hashCode() ^ 636892966) {
                            case -624516904:
                                str = "ۤۙۨۘۡۚۡ۠ۢۦۚۘۖۥۦ۬ۨۡ۟ۖۛۗ۫۠ۨۗۡۧۨ۬ۦ۠ۦ۫ۡۜۖۘ";
                                continue;
                            case 178719419:
                                str10 = "ۥ۫ۜۤۙۜۘۖ۟ۨۘۨ۬ۘۘۘۧۖۘۜۖۡ۟ۘۙۨۤ۟ۜ۟ۤۚۚۙ۫ۢۤۧۡۨۘۘۖۦۖۚ۟۟ۖۡۨۘۛ";
                                break;
                            case 246442123:
                                str = "۠ۙۛ۠ۨۖۜۡۘ۠ۘۧۘۨ۬ۨۗۡۛ۬ۧۖۘۨۧۥۘۦۧۦۤۘۦ";
                                continue;
                            case 1678369977:
                                String str11 = "۬۠ۜۘۦۘۘۧ۠ۥۢۖ۟ۢۚ۟۟ۥۘۛۧ۫ۤۧۢۚ۠ۘۦ۟ۜ";
                                while (true) {
                                    switch (str11.hashCode() ^ (-1679805070)) {
                                        case 213163267:
                                            str11 = C3718b7.OooO0Oo().OooO0OO == 4 ? "ۙۗۘۚۘۥۨۙۖ۬ۡۘۜۨ۠ۨۦۜۨ۠ۜۗۘۘۘۖۥۛۡۨۛۦۡۚۨۗ" : "ۧۗۙۘۤۢۚۤۙۜۢۨۥۧۘ۬ۚۥۘ۫ۛۖۥ۠ۢۘۘ۫۠ۚۨۙۜۜۖ۫ۙۥۙۜۤۖۖۘۤ۬۬ۜۢۤ";
                                            break;
                                        case 1317732100:
                                            str11 = "۠ۗۢ۠۟ۗۛۡۡۘ۫ۤۛۛۜۚۢۜۘۙ۬ۖۚۡۡۘ۠ۡۧ۬ۘۤۛۛۨۘۜۛ۬ۨ۬ۧۖۨۛۢۧۨۤۧۙ";
                                            break;
                                        case 1370143954:
                                            str10 = "ۨۥۡ۬ۘۥۘۘ۠ۦۘۘۨۡ۠۠ۡ۟ۘۡۘۤ۬ۛۤ۟۟۟ۛۙۧۦۜۘۜۨۨۖۨۚۜۜ۟۠ۙ۟ۤۥۘ۟۟۬ۖۦۦۡ";
                                            break;
                                        case 1496093762:
                                            str10 = "ۜۗۖۘۦۛۛ۫ۙۡۚۨۘۚۚۦ۬ۛ۫ۖ۟ۧۖۛۧۦۗۡۡۘۗ۠ۚۚۡۤۦۜۡۘۥ۬ۘۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1403052735:
                    break;
                case 1426472465:
                    str = "ۖۜۨۘۚۜۦۘ۬۟ۥۢۜ۠ۧ۟ۚ۫ۨۘۘ۫ۥۢۘۚۗۘۘ۫ۤ۫ۘ";
                    imageView7 = imageView6;
                    break;
                case 1513603720:
                    str = "۠۠۬ۦۤۥۘۛۨۘۙۙۙ۠ۗۢۡۥ۬ۜ۟ۡ۬ۧۤۡ۠ۘ۠ۚۜ۟ۥۦۤۗۤ۬ۗۜۘۥ";
                    break;
                case 1526112770:
                    str = "ۙۨ۟ۘۨۚۨ۬ۛۨۖۛۧ۠ۦۨۜ۟ۤۨۘۥۚۨۘۛ۬ۙۗۘ۠ۖۡ۬۟ۙۙۖۢۜۘۢۙۥۨۧۨۘۖ۠ۢۥۨ۟ۤۧ۬";
                    i7 = i3;
                    break;
                case 1526290604:
                    str = "ۙۦۦۘۙ۫۠ۢۤۧۛۘۚ۠ۜۖۥۚۨۖۦۖۘ۫ۖۢۤۢۙۧۨۘ";
                    i7 = i5;
                    break;
                case 1574439191:
                    String str12 = "ۜ۟ۧۗ۫ۦۢۤۧۦۘۜۥۗۛ۟ۜۘۥۖۨۘۦۗۨۛۤۦ۟۠ۙۥۤۦۖۚۜۘۦۙۥۘۧۘۤۚۤۚۦۜۜۤۨۙۚۚۡ";
                    while (true) {
                        switch (str12.hashCode() ^ (-667807453)) {
                            case -1814091187:
                                str = "ۤۨۖ۠۠ۧۢۛ۟ۨۚۤۘۨ۫ۨۛ۟ۧۚۖۡۜۥۗۢ۫ۡ۬ۖۘۧۘۥۘۧۘۧۜ۬ۦۘۖۘۦ";
                                break;
                            case -1605923188:
                                str12 = "۟۟ۘۖۘۜۘۢۥۥۚۙۗۤۘۖۘ۠ۖ۠ۦ۬ۨۘۧ۟ۖۘ۠ۥ۬ۥ۟ۙۨ۬ۥ۟ۢۘ۠ۥۘۘ۠ۤۛ";
                                break;
                            case 248351885:
                                break;
                            case 1447931831:
                                String str13 = "۠۫ۗۧۡۜۘۜۛۙۛۙۦ۟ۥۡ۫۟ۘۜ۠ۖۛۚۘۢۦۚۗۥۨۘ۫ۖۙۖۨۜ۟ۗۦۘۜۢۖۥۦۤۤۛۨۥۚۡۛۜۘ";
                                while (true) {
                                    switch (str13.hashCode() ^ 1542094335) {
                                        case -2076972086:
                                            str12 = "۠ۤۨۚ۫ۗۗۦۙۥۡۘۢۙۤۚۤ۠ۤۜ۠ۡۛۦ۬ۘۥۘۚۗ۟ۨۥۦۘۧۧۥ۫ۨۤۖۗ۬۠ۡۧۘۡۤۖۘ";
                                            break;
                                        case -1713461552:
                                            str13 = C3718b7.OooO0Oo().OooO0OO != 2 ? "ۜۥۙۘۚۙۡۧۘۖۢ۫ۥۙۡۛۡۦۘۘۨۖۘ۟ۧۤۖ۟ۜۘۤۡ۬۬۫ۨۘۛۖۖۧۗۢ۬ۨۧۥ۬ۗۨۘۛ۫ۦۤۖۥۘ" : "ۥ۟ۗ۟ۘ۬ۜۖۢۙ۟ۚۜۧۖۘۤۤۥ۠ۤ۟ۢۥۗۘۧۦ۟ۗۨۡۨۤۘۤۜۘۡۚۡۤ۠ۘۘ۠ۚۛۦ۬ۜۨۘ۠ۥۨۘ";
                                            break;
                                        case 209057808:
                                            str13 = "ۢۦۡۘ۟۫ۢۢۥۘۘۥۡ۟ۙۜۛ۟ۗۘۘۨ۠ۘۘۙۘۨۘۢۥۗۙۧۜۘۧۘۤۚ۟ۡ";
                                            break;
                                        case 1357929950:
                                            str12 = "ۘۧۙۢۚۡۙ۫ۢۜۨۘۘۦۨۜۖۢۨ۬۠ۡۘۨۜۛۡۨۖۛۡ۬ۥ۫ۨۡ۫ۗۙۙۙۖۨۢۧۤۡۜ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1904230945:
                    i6 = R.drawable.elfin_run_right_edge;
                    str = "ۦۤ۫ۥۜ۫ۚۨۜۜۦ۠ۧۗ۫ۗۦ۬۫ۦۘ۟ۗ۠ۨ۟۫ۗۦ۫";
                    break;
                case 1988003066:
                    i4 = R.drawable.elfin_pause_right_edge;
                    str = "ۗۨۢۢۢۛۜۘۖۡۦۘۡ۟ۜۨۖۛۖۥۧۢ۠ۘۘۘۤۦۘۧۥۨ۟ۤۨۜۨۘۛۧۙۛۡۧ";
                    break;
                case 2026585989:
                    String str14 = "ۧۜۡۘۢۖ۫ۦۜۨۘۤۗۘۘ۫ۤۨۙۘۖۘۖۦۥۘۢۚۖۘۤ۠ۜۘۜۛۙ۟۫ۗۘۢۦ";
                    while (true) {
                        switch (str14.hashCode() ^ (-1697547364)) {
                            case -2105694391:
                                str14 = "ۖ۟ۖۦۗۤۚۖۧۡۡۛۜ۠۠ۜۛۧۧۚۦۧۥۘ۫ۢۘ۫ۦۗۤۧۧۗۡۨ";
                                break;
                            case -1002529290:
                                String str15 = "ۡۜۛۜۙۥۘۜۦۘۘۦ۫ۜۜ۫۟ۡۖۦ۬۫ۨۗۙۦۧۤۥۥ۠ۧۜۨۘۖۧۙۧ۠ۖۘۙۘۗۗۡ۟ۜۧۖ";
                                while (true) {
                                    switch (str15.hashCode() ^ (-1878678656)) {
                                        case -1843559462:
                                            str15 = ((float) iArr[0]) >= (((float) C4491w3.OooOoo0(getContext()).x) - this.OooooOO) / 2.0f ? "ۖ۫ۙ۠ۛۡۙۦۡۘ۟ۜۦ۬۠ۥ۟ۨۜۘۤۖۧۜۨۚۛۨۖۘۨ۫ۦۘۖۨۤۨۚۨۢۤۜۙۛ۫ۖۜۡۘ۫ۦۦ" : "۟ۖۨۥۗ۫ۤۙۥۘۥ۬ۨۘۦۛ۠ۥۘۚۦۤۡۘۙۚۧۗۨۦۘۜ۠ۨۘ";
                                            break;
                                        case -434536827:
                                            str14 = "۫ۚۨۘ۟ۥۧۘۛۙۤۙۘۡۢۢۡۧ۟ۚۢۨۥۨۛۡۘۦ۬ۘۘۡ۬ۨۘۜ۠ۧۧۙ۠";
                                            break;
                                        case 1214657643:
                                            str15 = "ۚۘۡۘ۠۠ۨۘۤۥۚۗۧۙ۫۬ۡۗۛۜۘۨۡۜۘۘۨۘۜۦۘۛۘۘۘ";
                                            break;
                                        case 1887049507:
                                            str14 = "ۙ۫ۖۘ۫ۖۥۥۛۨۤۜۢ۟ۧۦۘ۠۬ۘۡۛۘ۬۟ۘۛ۟ۘۗ۠ۜۘۗ۠ۖۘۗۙۜۥۧ۬۬ۘۡۘ۫ۦۘۘۤۢۨۘۨ۫ۖ۫ۡۙ";
                                            break;
                                    }
                                }
                                break;
                            case -631294718:
                                str = "ۛۗۙ۠۫ۡۘۢۦۜۘۜۡۤۚۦۘۙۖۖۚۨۦۘۘۡ۟ۛۨ۠۫ۨۡۘ۫ۙۧۙۛ۠";
                                continue;
                            case 1755259070:
                                str = "ۚ۟۬۟ۡۙۤ۫ۙۘۡۛۥۦۘ۬ۦ۬۟ۖۤۙ۫ۛۧۖۧ۟۫ۙۜۥۘ۬ۦۛۡۧ۠ۢ۬ۗۦۨۖۘ۬۟ۡ";
                                continue;
                        }
                    }
                    break;
                case 2062503595:
                    i3 = R.drawable.elfin_run_left_edge;
                    str = "۫ۤۥۘۢۤۧۨ۠ۖۘۥۥۦۘ۟۬۟ۙۗۧۢۢ۬ۡۚۢ۬ۘ۟ۗۧۨۙۤۧۛۘۨۘۖ۠ۜۘۡۦۘ۬۠ۨۨۖۥ";
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0040. Please report as an issue. */
    private void OooooO0(int i) {
        ImageView imageView = null;
        int i2 = 0;
        ImageView imageView2 = null;
        int i3 = 0;
        ImageView imageView3 = null;
        int i4 = 0;
        ImageView imageView4 = null;
        int i5 = 0;
        ImageView imageView5 = null;
        int i6 = 0;
        ImageView imageView6 = null;
        int i7 = 0;
        ImageView imageView7 = null;
        int i8 = 0;
        ImageView imageView8 = null;
        int i9 = 0;
        ImageView imageView9 = null;
        int i10 = 0;
        ImageView imageView10 = null;
        int i11 = 0;
        ImageView imageView11 = null;
        int i12 = 0;
        ImageView imageView12 = null;
        int i13 = 0;
        ImageView imageView13 = null;
        int i14 = 0;
        String str = "ۜۖۜۘۢ۟۬ۨۤ۬ۖۙۖۜۡۛۛۨۦۘ۠ۦۖ۠ۙۗ۫ۤۘۘۧۘۡۦۘۘۤۖۨۥ۠ۥۘ۬ۜۧ";
        while (true) {
            switch ((((str.hashCode() ^ 862) ^ 939) ^ 79) ^ (-1047894075)) {
                case -2102220594:
                    str = "ۢۧۖۘ۫ۛۨۘۘۗۢۗۘۘۖۙۡۨۤۛۚۚۥۙ۟۠ۡۖ۠ۚ۠ۡۥۢ۬ۨۧ۫۫ۦۘۛۥۖۘۡ۫ۦۘ۫ۚۦ";
                    imageView13 = imageView2;
                    break;
                case -2089095337:
                    str = "ۧۜۥۘۡۚۥۘۧ۟ۡۘۘۢۤۚۖۧۘۨ۠ۗۜۡۖۘۡ۠ۡۘۘۚۖ۬۠۫ۢۧۦۘۜۘۛ";
                    i14 = i4;
                    break;
                case -1905187265:
                    imageView2 = this.OoooooO;
                    str = "ۧۗ۠ۦۥۙۡۜ۬ۘۗ۫ۤۘۖۘۤۥۙۚۖۤۡۘۘۤۢۘۚۢۨۢۡۤۥۛۛۚ۟ۘۛۜۖۘ";
                    break;
                case -1898939744:
                    String str2 = "ۙۜۨۘۤۘۖۥۨۖۢۨۢۗۡۢۗۙۖ۟ۦ۬ۧۡۧ۠۠ۥۦۥۖ";
                    while (true) {
                        switch (str2.hashCode() ^ 1423153912) {
                            case -37847690:
                                String str3 = "ۙ۫ۤۗۡۙۦۛۘ۫ۧۥۙۡۘۙۤ۫ۘۖۘۘۚ۠ۚ۬ۛ۬ۧۡۜۘۚۡۧۘ۠ۛۡۘۦۤۙ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1500560284)) {
                                        case -1751391379:
                                            str3 = "ۛۗ۠ۙ۫ۢ۠ۖۘۨۧۦۘۦ۬ۙۚۘ۠۟ۘۘۢۘۦۘۥۦۚۨ۠۠";
                                            break;
                                        case -1337468187:
                                            str3 = C3718b7.OooO0Oo().OooO0OO == 4 ? "ۥۘۥ۬ۗ۫ۦۜۧۘۨۖۚۘۚۘۙۡۖۘۢۘۦۜۜ۫ۛۦۦۘۥۘۤۙ۟ۡ۠ۨۙۧ۬۫ۡۗ۟" : "ۤۘۛۡ۠ۨۘۨۖ۬ۤۙ۫ۜ۟ۦۥ۫ۛ۟ۖ۟ۘۙۧ۟ۚۧۨۘۗۨۖۚۦ";
                                            break;
                                        case -1182976764:
                                            str2 = "ۖۥۤۙ۟ۗۙۜۧۘ۠۠ۜۘۜۤۘۘ۠ۘ۠ۤ۠ۥۘۤ۠ۡۥۚۘۥۗ۟ۡ۫ۥۘ۠ۜۖۘۥۡۥۨۨ۬ۜۙۜۘۖۘ۫";
                                            break;
                                        case 2091379991:
                                            str2 = "ۛۤۗۜۙۥۘۚۖ۠۠ۧۖۘ۬ۨۢۤۢۦۚۛۧ۟۬ۖۘۤ۬ۥۤۗ۠ۧۡۜ۬ۛۤۗۥۤ۟۫";
                                            break;
                                    }
                                }
                                break;
                            case 789340264:
                                str = "ۥۙۦۢۘۜ۠۬ۜ۬ۖۡ۟ۦۜۤۢۜۙۜۤۡۥ۬ۖۘ۟ۤۡۘۡۖۜۘۥۘۖۦۙ۬ۨۙ۠ۤۨۜۦ۟ۧۚۡۜ۟";
                                continue;
                            case 1709001827:
                                str = "ۛ۟ۘۘۘۛۚ۟ۢۦۘۙۙ۠ۦ۬ۗۨۗۡۘۦۡۢۘۙۖ۫ۦۤۜۚۜۘ";
                                continue;
                            case 1788196958:
                                str2 = "۬۬ۢ۟ۚۙ۫۠ۢۘۛۘۛۡۧۘۧۛۗۥۥۨۘ۟ۚۖۘ۬ۚۖۘۨۢۙۙۢۙۨۧۥ";
                                break;
                        }
                    }
                    break;
                case -1818510405:
                case -1552749744:
                case -100133133:
                case 74977913:
                case 612728215:
                case 639198068:
                case 717448162:
                case 1158805543:
                case 1276760367:
                case 1444044133:
                case 2078507687:
                    str = "۠ۤۛ۟ۘۡۧۗۚۘۙۚ۟ۥ۟ۗۧۡۚۘۜۙۦۘ۟۬ۡۢۧۘ۠۫ۨۚۚۜۘۘۜ۫ۥ۠ۨ۫۫ۥۡ۬";
                    break;
                case -1752442665:
                    str = "ۛۖ۫ۢۛۙۜۢۢ۫ۡۜۘ۫ۢۥۙۙۛ۬ۧۜۘۦۤۥۥۜۨۘۧۤۦۘۥۢ۟ۤۗۖۘ";
                    imageView13 = imageView12;
                    break;
                case -1645117257:
                    str = "ۦۤۜۘ۬ۧۡ۫ۛۚۛۘۘۡۦ۟ۚ۟ۜۘۧۤ۬ۛۖۡۘۢۗۙۗۙ۠ۦۚۢۡ۠ۘۛ۠ۨۘۦۜۦۘۜۜۡۥۦ۫ۢ۠ۛ۟ۨۨۘ";
                    imageView13 = imageView4;
                    break;
                case -1644936543:
                    String str4 = "ۧۛۨۘۥۡ۟ۡۜۢ۬ۧ۟۬ۜۧۨۘۘۛ۫۫ۢۢۢ۬ۨۦۜۨۜۜۤۦۘۤۡۛ۠ۤۧ۠ۥۧۘۨۜۜ";
                    while (true) {
                        switch (str4.hashCode() ^ (-45306390)) {
                            case -1242467818:
                                str = "۟ۖۢۘۥۗۦۖۨۘۤۦۛۥۦۜۘۛۦۖۙ۠ۢۛۛ۠ۢۙۨۖۨۤۙۦۘۗۗۗۗۖۚ۫ۛۤۚۦۥۢۚ۠";
                                break;
                            case 515284991:
                                break;
                            case 557051059:
                                String str5 = "ۘۡ۫ۙۡۘۘۧۤۛۤۘۡۥۨۗ۬ۡۚۧۥ۠ۨۧۙۙۘۘۖ۬ۥۘۦۚۗ۫ۧۘۘۚۚۦۧۧۡ";
                                while (true) {
                                    switch (str5.hashCode() ^ 429046846) {
                                        case -2032445052:
                                            str5 = C3718b7.OooO0Oo().OooO0OO != 2 ? "ۦ۫ۦۘ۠۟ۥۚۖۚۘ۬ۜ۠ۗۡۤۢۡۨۦ۠ۦ۬ۦۜۛۡۘۤۗۚۤۤۨۤۘۙ۫ۗۛۨۚ۟" : "ۜۢۜ۬۫ۙۨۗۘۘۚۘۘۗ۠ۛۤ۟۠ۖۜۘۦۗۛۙۡۚۥ";
                                            break;
                                        case -1179310142:
                                            str5 = "ۧۜۚ۬ۢۨۘۘۗۡۘۘۗۘۗۥۜۜۥۡۘۚۖۥۜۦ۟ۢۡۡۘۙۥ۫۠ۙۛۚۗۢ";
                                            break;
                                        case 857791860:
                                            str4 = "۟ۛۙۜۥۚۤۙۛۜۨۗۗ۬ۜ۠ۗۘۘۜۖۡۡۚۥۘۖۦۦۢۧۖۨۖۘۡۥۚ";
                                            break;
                                        case 1546182523:
                                            str4 = "ۡۥۙۗۘۙ۟ۜۖ۫ۜۖۗۦۡۘۨۛۡۘۛ۫ۡۘۤ۫ۜۘۡ۬ۥۘۢۡۗ۠ۘ۠ۢۙۦ۬ۖ۫۠ۨۙۜ۟ۚۗۗۤ";
                                            break;
                                    }
                                }
                                break;
                            case 1164481279:
                                str4 = "ۜۘۡ۟ۘ۬ۥۨۜۚۢۜۛۘۡۛ۠ۘۘۨۖۡۘۗۥ۫ۦ۫ۢۛۜۜۘۥۜۡۘۛۥۧۘ۟ۥۚ۬ۖۛ۫ۚۡۥ۫ۢۖۛۖۢ۫ۤ";
                                break;
                        }
                    }
                    break;
                case -1547156137:
                    str = "ۤ۫ۧۛۚ۬ۘۥ۬ۧۢۚۥۛۘۢۗۖۙۗ۠ۦۖۡۢۥ۫ۧ۬۠ۜۙۡۡۘ";
                    i14 = i6;
                    break;
                case -1525454139:
                    i3 = R.drawable.elfin_normal_left_up;
                    str = "ۘۧۘ۟ۙۦۖۖۖۘۤۜۖۘۛۤۗ۬۠ۖۤۡۨۘۨ۠ۨۜ۠۫ۜ۬ۦۘۨۛۨۜ۠ۨۘۜ۠ۨۡ۟ۜۜۙۘ۟ۦۜۤۨۛۘ۬";
                    break;
                case -1461685832:
                    String str6 = "ۥۧۢۙۡۡۨۦۢۙۡ۬ۙۖۚۨۡۤۨۗۚۙۗۙۛۚۥۘ۬ۢۘۘ";
                    while (true) {
                        switch (str6.hashCode() ^ (-1838164612)) {
                            case -1869894134:
                                str = "۫ۛۢۙۚۗ۠۟ۤۦۘۜۘۦۦۦۨۖۧۡۨۨۘۥۜۨۛۦۡۙ۠ۛۥۦۛۢۖۘ";
                                continue;
                            case -968451456:
                                str = "ۖۡۧۘۗۧۖۗۡۦۘۡۖۘۘۗۥۥۘۘۗۗ۫۠۫۟ۛۜۘۖۘۡۘ۬ۗ";
                                continue;
                            case 542466787:
                                String str7 = "ۦ۟۫ۘۥۡۘۜ۫ۦۘۨۘۜۖۦۥۘ۫ۘۖۘۙۢۜۖ۟ۥۦۢۨۧ۠ۘۧۢۛۚ۠ۡۤۦۙۖ۬ۙ۬ۥۘۢۤۜۧۧۘۘۚۛۢ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-30338329)) {
                                        case -1146475293:
                                            str6 = "ۘۢۡۥۘۡۘۜۥۧۘۡ۠ۖۘۛۜۧۘ۠ۚۡۘۙۤۛ۠ۡۘۥۖۢۢۧۖۖۨۧۨۗۗۙ۟ۨۗۜۦۚۙۨۘۥ۫ۦ۟ۖۜۘۤۚۢ";
                                            break;
                                        case 218489115:
                                            str7 = C3718b7.OooO0Oo().OooO0OO == 3 ? "ۙ۫۬۫۠ۥۘ۬ۖۦۘۛ۫ۖۘ۠ۥۗۨۖۢۦۧۨۢۢ۫ۥۤۨۗۖۗۗۨۘ۬ۤۛۘۧ۟ۘۗۤۡۘۖۘۙۨۚۥۦ۬۬ۢۛ" : "۠۬ۜۢۧۖۧۤۙۜۗۙۦۜۙۥۧۘۦۙۜۘۗۜۘۙۛۖۘۘۗۥۛ۬ۙ۠۟ۚۖۥۧۘۨۨۡۘۥۚۜۙ۟ۙۥۜۜۘۗۗ۠";
                                            break;
                                        case 505892401:
                                            str7 = "ۦۗۦۘۥۖۤۘۧۤۡۖۘ۠۠ۗۥ۬ۛۚۢۤۤۘۙۦۡ۬۟ۢۢۨۘ۠ۘۨۗۗ۠۫ۡ۬";
                                            break;
                                        case 575580804:
                                            str6 = "ۚۘۢۖ۫ۚ۬ۢۨۘۤۗۜۚۥۨ۠ۧۜۘۜ۟ۡۖۗۨ۫ۖۤۙ۠ۢۜۤۥۘۧۗ۫ۨۧۜۘۦۤۥۘۜۤۡۦۥۧۢۙۚۢۗۜ";
                                            break;
                                    }
                                }
                                break;
                            case 774572444:
                                str6 = "ۛۢۥۚۦۥۘۦۘ۠۟ۛۗۢۥۤۚۖۘۚۤۥۘۖۤ۟ۧۛۙۨۥۦۘۚۘۛۘۜۡۘ۬۟ۙۧۨۖۜۨ۬ۦۧۜۘۤ۟ۜۤۡ۟";
                                break;
                        }
                    }
                    break;
                case -1383633682:
                    i4 = R.drawable.elfin_run_left_up;
                    str = "۫ۥۜ۠ۜ۠ۙۢۖۡۜۜۡۥۘۦ۠ۘۘ۬ۖۦۘ۫ۦ۠ۢۜۖۜۘۢ۠ۢ۫۬ۚۤ";
                    break;
                case -1286400488:
                    imageView6 = this.OoooooO;
                    str = "ۖۥۘۘۗۗۘۨۨۡۘۛ۫ۡۘۛۥ۫ۛۘۘ۠ۨۛۘۖۨۘۦۖۦۘۢۚ۠";
                    break;
                case -1243987055:
                    str = "۬ۖۡۘۜ۠ۛۗۢۡۙ۟ۗۥۗۖۢ۠ۤۤۡۢۙ۫ۤۨۗۙۗۨۘۥۡۛ۬۟ۤ";
                    imageView13 = imageView9;
                    break;
                case -1178115400:
                    String str8 = "ۧۥۡۘۡ۟ۙۘ۠ۚۡۗۜۦۛۨ۠ۡۡۤۘۘۘۖۧۘۛۡۧۘۢۘۥ۬ۤۖۘ۬ۡۜۤۤۜۗۚۜۘ";
                    while (true) {
                        switch (str8.hashCode() ^ 1456280882) {
                            case -269579581:
                                str = "ۚۛۨۘۘۦۜۙۗ۟۫۫ۦۜ۫ۘۘۥ۟ۚۥ۫۬ۨۘۦ۠۟ۘۘۤ۬ۗۤۡ۫ۦ۟ۥۘ";
                                continue;
                            case 591938303:
                                str = "ۖۗ۟ۖۥۗ۬ۧۦۘۦۦۥۘۧۥۗۛۥۘۛۦۥۘۥۙۖ۟ۛ۟ۛۨۤ";
                                continue;
                            case 1279660827:
                                str8 = "ۘۨ۬ۧۡۘۢ۫ۨۢۤۜۘۦ۫۫ۧ۬ۜ۟ۜۙۙۨۙۢۢۥۜۥۡۘۢ۬ۖۘۦۦۢۖۥۡ۠ۚۨۘ";
                                break;
                            case 1775271880:
                                String str9 = "ۜۛۡۧ۬ۛ۫ۨۤۧۦۧۘ۫۟ۡۘۛ۫ۜۘ۟۫ۙۘ۟ۧۖۦۥۢۖۘۢ۫۬۟ۗۘۘ۬ۢۨۖ۬ۨۛۤۦۘۨۨۡۘ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-1008503807)) {
                                        case -379078218:
                                            str8 = "ۥۘ۟ۡۤ۫ۧۡۧۘ۟ۘۜۦۘۢۛۙۤۚۘۘۧۤۤۛۢۡۨۨۦۘۘۗۙۗۢۦۢ۟ۤۛۛ۬۟ۥۛ۠ۧ";
                                            break;
                                        case 631383677:
                                            str9 = "ۙ۬۫ۨ۟ۨۘۧۖۜۘۛۢۦۘۘۥۨۧۘۖۘۘۧۦۘ۠ۤۧۗۘ۠ۙۥ۬ۖ۫ۜۨ۫۬ۘۨۛۚۜۘۥۦۛۡۙۘۘۘۤۚۖ۬ۘۘ";
                                            break;
                                        case 639165808:
                                            str9 = i != 1 ? "۫ۖ۫۟ۜۡۦ۟ۜۧ۫ۜۘ۫ۡۡۘۗ۠۫ۥۢۙۢ۠ۦ۬۫۫ۧۤ۫ۡۦۘۘ۠ۡۘ۠ۦۘۧۢۡ۫ۛۘۡۗ" : "ۙ۟ۚۦۘ۟ۨۦۚۖۖ۟ۢۖۡۘ۬ۛۖۘۡ۫۫ۚۨۜۘۙۗۥۘۗۘۘۛۖۘۘۡۛۦۖۦۙۥ۬ۥۘۛۢۗ۟ۘۦۘ";
                                            break;
                                        case 1671746007:
                                            str8 = "ۤۖۛ۠ۛۖۤ۬ۧ۫ۡۡۘۜۖ۠۟ۖۦۙۡۗۨۢۡۘۡۘۗ۫ۨۘۥۗۥۖۘۨۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1177188080:
                    imageView3 = this.OoooooO;
                    str = "ۘۗۤۡ۟ۨۘۖۗۘ۠ۗۖۛۥ۬ۥۨۢۗۤ۬ۨۗۙ۫ۙۥۙۘۤ";
                    break;
                case -1015474695:
                    i7 = R.drawable.elfin_run_down;
                    str = "ۘۧۘۘۜ۠۬ۙۧۥۘ۬ۦۥۘۚۢۖۨۖۚ۟ۜۖۘ۫ۦۖۘۦۥ۬ۚۗ۬۟ۘۡۚۦۖۙۥ۟ۜۚۨۘۜۙۨ۬ۡۤ";
                    break;
                case -958918226:
                    String str10 = "۠ۥۜۗۛۘۘۙۜۥۘۜۗۡۜۦۚۦۛۛۙۨۥۘۨۧۥۘۢۦ۬ۙۚۢۢۡۗۚ۠ۘۚ۬ۨۨۤۡۘۧۚۨۚۖۖۘۨۦۦۧۦۧ";
                    while (true) {
                        switch (str10.hashCode() ^ 577624397) {
                            case -1945853964:
                                str = "ۡۨۧۘ۫ۡۨ۫ۨۘۛۦۦۦۘۜۧۥ۬ۗۛ۟ۚۡۘ۠ۡۡۘ۬ۡۚ۫۬ۜۨۦۛۥۛۙۧۦۘۡۢ۫ۗۡ";
                                continue;
                            case -386565156:
                                str10 = "ۖ۫ۡۥۘۥۦۥۛۧۚۢ۬ۙۖۘۚۦۤۜۤۘۘۦ۠ۨۘۥۖۘۘۡۥۘۘۧۥۛۗۤۡۧۥۢ۫ۨ۬ۥۗ۟";
                                break;
                            case -53626287:
                                String str11 = "ۨۢۢۦۚۚۖۡۘۘۛۘۥۙۢۖۘۘ۠ۘۘۚ۠ۗۙۛ۠۟ۦ۟۟ۗۥۡ۬ۚۦۙۥۘۛ۫۬ۤۢۗۖۚۡۖ۟۠";
                                while (true) {
                                    switch (str11.hashCode() ^ (-310593612)) {
                                        case 155450471:
                                            str10 = "ۛ۬ۜۘۥ۫ۗ۬ۖۡ۬ۤۢۥۤۧ۟۠ۜۤۧ۠ۙ۟ۘۘۚۖۘۖ۫ۖۡۧ۫ۘۡۡ";
                                            break;
                                        case 454652088:
                                            str10 = "۫۬ۜۖۚۖۘۚ۬ۛۤ۫۫۟ۘۖۚۧۦۘۜ۬۬ۡۥۘۥۘۨۘۚ۬ۦۢ۬۬ۨۘۡۤۥۧۚ۬۟ۢ۟ۦۗۜۘ";
                                            break;
                                        case 473288750:
                                            str11 = "ۖۤۦۘۢ۫ۛۧۥۧۘ۟۟ۖۡۡۘ۟ۢۥ۫ۢۡۚۛۖۦۗۧ۠ۛۖۢۧ۬ۦۚ۠ۢۖۗۦۘۘۥۗۜۘۡۧۖۘ۬ۨۥۘۢۛۨ";
                                            break;
                                        case 1214736780:
                                            str11 = i != 3 ? "۬ۤۧۥ۬۠ۧۦۢۧ۬ۙۛ۠۫ۜۖ۠ۗۦۘ۫ۧۘۘۥۙۘۤۢ۟ۚۖۥۢۨ۠۠ۧۨۢۧۜۘۘۢۗۖۛۦۘ" : "ۚۖۧۖۘۘۘۜ۟ۖۧ۫ۗۙ۟۟۠ۘۨۘۙ۠۬ۖۜۥۤۖۦۨۜۦ";
                                            break;
                                    }
                                }
                                break;
                            case 208251897:
                                str = "ۤۙۖۤۧۜۘۙ۟ۙۗۧۗۢۛۙۚۨۛۛۦۗۘۙۛۢ۟ۥۗۦۘۘ۫۬ۥۜۜۘۘۡۖۥۤۤۥۘ";
                                continue;
                        }
                    }
                    break;
                case -933870063:
                    i12 = R.drawable.elfin_normal1;
                    str = "ۤۖۚۙۢۜۘۗۦۜ۟ۗۤۚۘۜۘۥ۟ۦۘۙۜۤۨۛۥۗۤۖۢۢۚۡۛ۠ۤۗۤۤ۫ۦۘۦۖ۟۫۫ۖ۬ۢۖۘ۬ۤ۬۬ۛۖ";
                    break;
                case -924982359:
                    imageView = this.OoooooO;
                    str = "ۖۥۨۦۗۧ۬ۨۛۙۤۨۘۦۘ۠۬ۚۤ۠ۙۥۡۦۗ۬ۘۘۧ۫ۥۘۖۛۙ۫ۜۘ";
                    break;
                case -871186381:
                    str = "ۖ۠ۜۘۢ۠۬ۤۧۡۨ۟ۡۘۙۘۡۛۜۡۥۦۙۙۢۡۜۥۘ۠ۗۚ";
                    break;
                case -810682638:
                    imageView5 = this.OoooooO;
                    str = "ۖۨۧ۟ۨ۫ۘۥۡۙۙۥۜ۠ۢ۠ۢۖۘۢۘۜۘ۟ۜۨۛۘۗۜۧۢۢۧۨۘۥۗۡۘ۫ۙۖۘ۟ۖۜ";
                    break;
                case -786562826:
                    String str12 = "ۖۛۨۦۨ۠۠ۤۧۨۘۗۚۜۘ۠ۨ۬ۛۡۧۘۤۙۘۦۥۥۢۙۚ۟ۗۥۘۚۡۖۦ۠ۥۚۗۥۘۖۡۥۗۗۗ۠ۖ۠ۨۚ۠";
                    while (true) {
                        switch (str12.hashCode() ^ (-958952071)) {
                            case -1013228446:
                                str = "ۖۨ۫ۧ۫ۜۡۢۡۘ۬ۜۦۘۙۦۗۜ۠ۡۘۦۚۛۙۦۖۘ۠۟ۧۨۡۨۘ۠ۥۚۦۜۘ";
                                continue;
                            case 476391105:
                                str = "۬ۛۨۘۤۥۡۘۨۜۙ۬ۨۦۘۤ۟ۖۜۡۡۘۡۤۖۘ۬۠ۡۘۙۘۨۖۦۖۖۧۢۧۦۛ۬ۛۘۘۦ۟۬";
                                continue;
                            case 642221517:
                                String str13 = "ۖۙۨۡ۠۫ۤۢۖۚۨۡ۠ۧۤۢۘۖۘ۬ۡۚۗۨۨۘۘۗۢۨ۫ۨ۫ۛۦۢۢۡ";
                                while (true) {
                                    switch (str13.hashCode() ^ (-641046125)) {
                                        case -2060851098:
                                            str12 = "ۚ۫ۧۚۚۥۧۤۥۘ۬ۢۤۗۡۘۘۤ۬ۜۘۥۤۢۥۚۨۨۙۜۘۛۗۡۖۡۡۚۖۛۢۥۛ۬۠ۥۘ";
                                            break;
                                        case -1930818349:
                                            str13 = i != 2 ? "ۚۢۥۘۗ۬ۦۘ۟ۙۘۘۥۨۜۘۜ۟ۢۨۖ۫ۗۘۥۢۜۙۨۢۘ۫ۜۘۤ۬ۙۜ۫ۗۘۙ۬ۖ" : "۫ۖۡۘۙۨۖۘۙۘۥۡۢۦۘۤۨ۠ۚ۫ۙۚۢ۫۫ۦۗۚۨۖۖۚۙۧۗۛۦ۠";
                                            break;
                                        case 825945900:
                                            str13 = "ۙۤۥۡۚۖۜ۠ۨۘۥۥۧۘ۠ۛۢ۟ۡ۬ۥۖۘۥۘۘۘۜ۬ۖۘۖۙۜۦۢۖ۬ۨۦۖۖۡۜۢ۠۟۠ۦۙ";
                                            break;
                                        case 1765772766:
                                            str12 = "ۧۗ۟۠۫ۡۘ۬ۛۙۧۙۖۡۢۥۘۧۙۙۚۙۢۢۗ۬۠ۧۙ۬ۥۢۚۙۚۘ۫";
                                            break;
                                    }
                                }
                                break;
                            case 1288222258:
                                str12 = "ۤۥ۠ۤ۫۫۠ۚ۬۫۠ۨۡۖۦۘۗۛۗۧۤۢۘۘۦۘ۫۫ۧ۟ۜ۫";
                                break;
                        }
                    }
                    break;
                case -698584911:
                    String str14 = "ۥۤۗۡ۬ۘۘ۫ۜۖۘۡۛۨۘۧۖۡۜۚۤۚۢۙ۬۫ۧۡۜۘۖۚۖ";
                    while (true) {
                        switch (str14.hashCode() ^ 1010438518) {
                            case -2049637642:
                                String str15 = "۬ۨۢۧ۠۫ۧۗ۠ۨۛۦۡۡۧۤۥۡۘۗۥۦ۟ۧۥۘۧ۟ۨۧۖۧۚۖ۫۠ۙۖۘۖۜۢۨ۠ۘ۠۬ۙۨۨۡۘۜۘۢۖ۫ۧ";
                                while (true) {
                                    switch (str15.hashCode() ^ 241531661) {
                                        case -1036754664:
                                            str14 = "۬ۢۦۘۦۜۧۦۜۙۜ۟ۢۦۦۢۢۡۖۘۛۡۜۘۜۢۥۘۢۨۢۗۢۥۘۘ۟ۡۘۖۦۙ";
                                            break;
                                        case -556893886:
                                            str14 = "ۜۢۦۨۘۧۘۜۥۡۘۨۡۤۙۛۨۖۖۖۦۧۘۘۙۡۘۧۗۥ۬۟ۡۘۘۨۡۘۢ۠ۤۡۡ۟۠ۜۘۚۥۜۘ۬۟۬";
                                            break;
                                        case -219306978:
                                            str15 = "۟ۖ۟ۜۦۧۢۚۢۖۥۡۘ۟ۥۦ۟ۥۘۦۢۖۘۚۨۜۘۤۖ۫ۤۘۗ۫ۖۤۧۛۖۧۚۜۤۚۖۗۛۖۘۘۘۨۘ";
                                            break;
                                        case 25924256:
                                            str15 = C3718b7.OooO0Oo().OooO0OO == 4 ? "ۙۙۘ۟ۚۡۧۦۖۘ۬ۡ۫ۖۥۙۙۛۤ۟ۗۥۥ۫ۘۘ۟ۚۚۘۘۦۚۤۡۡۨۨۘ" : "ۤ۠ۙۘ۫ۧۗ۬ۦۗۧۙ۫ۗ۫ۗ۫ۥۘ۬ۘۗۡۜۥ۟ۙۚۨۘۥۢۦۧۘ۠۫ۥۘ۟۟ۨۘۚۨۜۢۢۡۘۨۚۡۘۢۤۜۥۘۜ";
                                            break;
                                    }
                                }
                                break;
                            case -866614268:
                                str = "۠ۥۨۘۢۚۜۘۤۢ۫ۨۜۤۤۨۤۗۥ۠ۘۦۛۜۦۨۤۘۥۘۙۚۢۤۘۖۘۥۨۨ";
                                continue;
                            case 763846518:
                                str = "ۖۨۜۘ۬ۜۧۦۘۦ۠ۗۛۙ۫ۗۧۡۘۢۧۦۘ۠ۘۜ۠۬ۡۘۜ۠ۙۡۚۡۚۥۦۘۛۜۜۘ۬ۦۖۘ";
                                continue;
                            case 2051598204:
                                str14 = "۬۠ۖۗۡ۠۬ۚۖ۠ۜ۫۬۬ۨۘۧۘۘ۫ۚۘۛ۟ۥۘ۬ۜۧۦ۠ۨۛۖۚۚۢۦۜۨۚۡۦ۫";
                                break;
                        }
                    }
                    break;
                case -687968090:
                    String str16 = "۟ۗۘۘ۟ۥۙۚۨۨۥۜۤۡۥۦۜۧ۟ۛ۟ۖۢۘ۬ۚۦۥۘ۬ۚۨۘۥۛۜۖۙۘ";
                    while (true) {
                        switch (str16.hashCode() ^ 2061582255) {
                            case -1944631821:
                                str16 = "ۧ۠۟ۦۧۧۘ۬ۚۡ۫ۥۗۖۧۜۗۜۘ۟ۦۤ۫ۨۨۜ۟ۛۜۚۦۘۢۦۡۗ۟ۨ۫ۗۛۜۙۧ۠ۖۡۥۥۥ";
                                break;
                            case 1267988682:
                                break;
                            case 1457823815:
                                str = "ۚ۬ۡۖۦۗۥ۬ۜۘ۬ۜۤۙۥۥۙۧۜ۟ۖۡ۟ۚۜ۫۠۫ۚۖۧۥۘۦۧۥۘ";
                                break;
                            case 1673873919:
                                String str17 = "ۜۤ۬ۖۧۦۧۜۧۘۗۚۡۘۧ۟ۤۤۨۦۡۤۗۦ۟ۥۙ۠ۦۘ۫ۥ۫ۛۚۜۘۘۤۘۘ";
                                while (true) {
                                    switch (str17.hashCode() ^ 1808988899) {
                                        case -936744957:
                                            str17 = C3718b7.OooO0Oo().OooO0OO != 2 ? "ۗۙۥۘۖ۠ۖۚۖۗۖۧۡۘۦ۫۠ۦۧۜۛ۠ۚۖۘۤۛۥۚۥۨۡ۫ۘۜۤۧۚ۫ۘۗ۫ۖۘ" : "ۦۧۨۗ۬ۦ۬ۗۜۘۘ۫۫ۖۢۦ۟ۦۦ۠ۖۤۨۧۡۖۦ۬۟ۧۥۘۚۢۨۖ۬ۛۢ۟ۡۘۥۨۛۗۧ۫ۨۖۜۦۨ۠۫ۖۤ";
                                            break;
                                        case -721312335:
                                            str17 = "ۛۛۚۡۦۚۖۛۦۘۧۥۢ۠۫ۦۘ۟ۢۦ۬ۨۚ۫ۤۢ۬ۦ۠۫۟ۥۢۢۨ۟ۥۢۨۛ۠۫ۦۜۘ۬ۦۖۘۖۢۡۘ";
                                            break;
                                        case 202308614:
                                            str16 = "ۜۤۢ۬ۢۘۘۤ۬ۜۛۦۘۗ۫ۧ۬ۙۡۛۡۘ۫ۢۥۛۢۦۘۥۢۘ";
                                            break;
                                        case 457828853:
                                            str16 = "ۦۜۡۘۨ۠ۨۚۧ۟ۤۤۢۙۢۦۧۛ۟ۘۜۜۨۜۘۤۢۡۛۦۨۘۥۙۡۡۖۨۗۦۦ۬۟ۖۘۢۥ۟ۛۧۡ۬ۦۥۘۚۨۜۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -641071972:
                    String str18 = "ۘۤۥۘ۠۠ۧۚۦۡۘۨۛۨۘۙۡۤۥۘۢۜۥۘۥ۟ۨۘۘ۟ۜۘۗ۫ۖۧۛۘۘۧۜۗ";
                    while (true) {
                        switch (str18.hashCode() ^ (-397925578)) {
                            case 1239007633:
                                String str19 = "ۗۖۖۘۘۢۜۘۦۗۜۜۗۜۘۨۚ۟ۢ۟ۥۘۚۘۦۙۙ۟ۨۙۦۘۤۛۡۘۘ۠ۥۨۢۧ";
                                while (true) {
                                    switch (str19.hashCode() ^ (-1849624219)) {
                                        case -2115939521:
                                            str19 = C3718b7.OooO0Oo().OooO0OO != 2 ? "۬ۛۢۚۘۨۛۨ۫۟۠۫ۘ۟ۧۥ۠۠ۜۢۗۜۖۥۚۖۗۦ۫ۦۘ۟ۚۤۛۡ۠ۙۢۡۨۖۘ۫ۢ۟۠۫ۖۘ" : "ۨ۫ۜۘۘ۬ۥۦۚۜۘۛۧۘۘۥ۠ۚۦۡۘ۬ۨۗۦۖۚۨۢۢۗ۫ۜۢۖۗۦۖۚ";
                                            break;
                                        case -2004906169:
                                            str19 = "ۨۚۦۙ۫ۖ۫ۢ۫ۗۙۛۘۥۘۘۛۛ۫ۚۥۜۨۥۘۘۨۨۥ۬ۙۜۘ";
                                            break;
                                        case -1314471609:
                                            str18 = "ۘ۠ۢۨ۫ۤۥۤۘۥۚۙۛۘۤ۬ۡ۟ۘ۫ۦۘۨۡۦۦۡۤۚۙ۠ۤۨۙ۠ۨۚۗۥۨۜۢ۠ۦۢۡۘۚۙۙ";
                                            break;
                                        case -1150316916:
                                            str18 = "ۨۥۦۘ۠ۖ۬ۙ۫ۥۖۡۡۘ۟۟ۜۘ۟ۚۘۘ۟ۜۨۡۘۜۥۖۘۘۘۖۛ";
                                            break;
                                    }
                                }
                                break;
                            case 1869501596:
                                str = "ۛ۫ۧۗ۫ۖۘ۟ۥۨۦۡۥۜ۬ۖۘ۠۟ۜۘۦۘ۬ۛۨۥۘ۫۠ۛۛۦۧۘۡ۟۠۟۬ۡ۠۫ۜۘۛ۬۠ۧۗۘۡۛ۟ۚ۬ۧۘ۫";
                                break;
                            case 2012274203:
                                str18 = "ۧۦۙۜۤۖۦۧۥۘ۬ۢ۬۬ۦۜۧۧۛۡۦۖۘۦۖۨۘۧ۟ۦۡۙۥۘۢ۠ۡۘۡۦۜۖۥۗۨۙۡۘۜ۫۫ۡۘۤ";
                                break;
                            case 2121035913:
                                break;
                        }
                    }
                    str = "ۜۖۦۘۡۖۧۘۧۚ۫ۢۖۡۘۙۜۘۘۦۘۘۨۖ۟ۤۨۘۘۧۚ۠ۦۙۤ";
                    break;
                case -543738498:
                    String str20 = "ۥۧۗۚۗ۠۟ۜۧۚۨۥۙۘۦۥ۟ۗ۫ۗۙۤۖۦۧۤۖۘ۫ۥۢۢۦۜۦۦۥ";
                    while (true) {
                        switch (str20.hashCode() ^ (-185608201)) {
                            case -2130589407:
                                str20 = "ۢۦ۟ۦۚۤۡۖۨۥۚۧۥۗۜۘۚۖۦۤۥ۫۫ۡۨۜۘۡۜۙۥۘ";
                                break;
                            case -1331687529:
                                str = "ۚ۫ۦۘ۬ۚۦۦۙۦۛۘۚۛ۬ۥۢۛ۟۟ۢ۬ۢ۟۫ۡۜ۬۟ۡۡۘۜ۟۬ۖۢۦۙۦ۫ۤۘۨۘۗۙۡۛۦۧ۫ۜۘ۬ۡۡ";
                                continue;
                            case 376994834:
                                str = "ۚۚۨۘۜۧۛ۫ۨ۬ۤ۬ۥۘۡۗۤۙۥۦ۫ۗۧۜۢۖۘۚۨۜۘۤ۟ۢ";
                                continue;
                            case 1525324361:
                                String str21 = "ۦۨۡۘ۫ۚۚۖۗۡ۬ۨۧ۬ۚۥۘۥۘۖۛۨۚۡۖۘ۟۟ۨ۬۟ۛۦۘۘ۠۠۬";
                                while (true) {
                                    switch (str21.hashCode() ^ (-1877610792)) {
                                        case -1089079888:
                                            str21 = "ۨۦۤۤۧۗ۫ۨۡ۟ۥۖۘۜۚۨۘ۠ۙۨۘۙۦۘۘۘۡۥۘۗ۫ۖۘۛ۫ۡۘۙۘۗۘ۬ۡۘۘۡۘۘۧۗۥۧۥۥۘۡ۬ۡۘۥۙۖۖۧۥ";
                                            break;
                                        case -907000039:
                                            str21 = C3718b7.OooO0Oo().OooO0OO == 4 ? "ۥۖ۬ۥۤۘۡۖۡۘ۟ۢۧۤۖۚۗۜۘۘۧ۫۠ۦۢۧۚۙۙ۫ۚ۟ۖ۠ۜۘۗۡ" : "ۘۤ۬ۥۘۥ۫ۥ۟ۢۚ۬۠ۜۨۢ۠ۥۘ۠ۚۘ۬۬ۖۘۘ۫ۢۘۨۨۘۘۦۚ۫ۖ۫۠ۥۜۤ۟ۨۘۨۛ۠ۜۗ۠";
                                            break;
                                        case 1131904515:
                                            str20 = "۬۟ۘ۟۠ۨۚۧۦۘ۠۟ۦۘ۟۠۟ۦ۠ۢۢ۠ۤۢۢۦۘۤ۬ۡۘۡۦۘۘ";
                                            break;
                                        case 1441948625:
                                            str20 = "ۗۨۘۢۘ۟۬ۧۤ۬ۦۘۧۨ۫ۙۦۧۤ۫ۙ۬ۡۘۧۗۙۨۘۡۘۗۘ۫۟ۙۨۘ۠ۛۖ۫۫ۙۥۢۨۖۘۦۛۧۘۘۥۜ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -431895635:
                    i5 = R.drawable.elfin_pause_down;
                    str = "۬ۛۚۧ۬ۡ۬ۗۡۦۘ۬ۖۡ۟ۨۦۦۘۤۨۡۘۨۡۚۤۘۡ۬ۤ۫۠ۥۜۘۗۤ۬ۗۢ";
                    break;
                case -322181937:
                    str = "ۤۗۤۦۘۖ۠ۡۖۘۧ۠ۚۥۖ۬۬۟ۙۘۡۡۘۧۙۨۛ۠ۖۘۦۢۘۘ";
                    break;
                case -291619146:
                    str = "ۥۨۦۘ۠ۚۜۡۜۘ۠ۖۦۥ۫۫ۚۚۡۙۨ۬ۜۥ۫ۡۖۘۘ۟ۨۗۢۛۛۗۡۘ";
                    break;
                case -191314030:
                    i8 = R.drawable.elfin_pause_right_up;
                    str = "۠ۜۘۘ۫ۤۖۚ۠ۖۘۙۘۡۘۡۦ۠ۛۢ۟۠ۥۧ۟ۘ۬۠ۥۤۡۜۡ";
                    break;
                case -119073139:
                    i13 = R.drawable.elfin_run1;
                    str = "ۦۥۧۤۤۘۘۧۡۨۖۖۢۡ۫ۡۘۧۡۥۘۛ۫ۤ۫ۖۨۚ۟ۦۖ۫ۦۦ۟ۛ۫ۤۚ۠۟ۢ۬ۙۖ";
                    break;
                case -72709928:
                    String str22 = "ۤ۬ۨ۫ۚۨۘۡۙۚۜۡ۟ۗ۫۠ۗۧۜۘۡۚۗۚۥۖۘۥۚۨۖ۠ۗ";
                    while (true) {
                        switch (str22.hashCode() ^ 190447252) {
                            case -1805687723:
                                str = "ۜۚۨۘۜۦۧۘۦۧۧۗۛۡۤۤۤۗۧۤۥۥ۠ۚۗۜۘ۟ۨۧۥۙۡۘ۟ۗۢۤ۠ۜۘۤۛۘۘۧۘۥۘۡۧۤۖۡۘ";
                                continue;
                            case -958119586:
                                str = "ۤ۠۫ۨۛۡۗۦۘۘۧۖۖۤۘۨۘ۠ۙ۟۟۫۠ۖۜۥ۟ۦۤۤۙ";
                                continue;
                            case 35719580:
                                str22 = "ۧۖۦ۠۫۫ۛۚۢ۫ۨۧۘۡ۠ۥۜۗۙ۟ۜۘۚ۬ۛۦۢۖۘ۫ۖۥۘۤۛۦ۬ۗۗۥۛۤۛۢۥۘ";
                                break;
                            case 623093552:
                                String str23 = "ۗۥۤۨۢۡۘۦۧۢۧۤۚۢ۟۫ۘۜۧۡۧۥۘۥ۫ۖۘ۟ۘ۟ۧۚ۠";
                                while (true) {
                                    switch (str23.hashCode() ^ 1473740269) {
                                        case -519652691:
                                            str23 = i != 4 ? "ۢۘ۬۠ۡۧۘۡۛ۟۟ۘۦۡۙۨۥۢۦۘۙۥۧ۬۫ۥۘۗ۠ۧۤۨ۬ۤ۫ۧ۬۫ۨ" : "ۥۢ۬ۨۘۖۥۡۦۤۦۨ۫ۚۤۚۤ۬۬ۨ۬ۡۤۖ۬۠ۦۘۢۗ۠ۚۘۥۤۗۚۡ۫ۘۤۜ";
                                            break;
                                        case 336390441:
                                            str22 = "ۙۢ۬ۙۙۥۘۖۧۦۘۙ۫ۧۘۢۜۘۢ۬۬ۡ۫ۧۜۡ۬ۨۗ۫ۨۜۥۘۢ۫ۨ۬۫ۦۘۡۘۗۥۨۨۘۦۘۜۘۨۨ";
                                            break;
                                        case 1236764444:
                                            str23 = "۬ۗۧۙۧ۟۟ۡ۠ۡۚۤۛ۫ۨ۟۟ۡۘۖۚ۬ۦۡۦۘۖۖۖۖۙۢۤ۬ۡۘۚ۟ۦۘۤۨ۬ۚ۟ۡ۠۬۠۬ۦۘ";
                                            break;
                                        case 1856883976:
                                            str22 = "ۘ۫ۘۘۜ۠ۘۘۗۛۥۧۧۙ۫ۨ۫ۗۡۧۘ۫ۚۘۖۖۤۖ۟ۦۘ۟۟ۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -24172767:
                    str = "ۧۦۥۘۛۢ۬ۛۡۤ۬ۚۗۘۜۤۖ۟ۜۘۧ۬ۦۧۚۘۢۚ۫ۤ۬ۦۘۜ۫۬ۙۨۙۜۛۧۗۧ۟ۗۢۘۛۗۙ";
                    imageView13 = imageView8;
                    break;
                case 82984508:
                    imageView12 = this.OoooooO;
                    str = "ۨۥۜۘۖۗۗۡۜ۟۫ۘۗۗۚۙۡۗۘۥ۠ۖۧۡۚۘ۫۟ۨۗۙ";
                    break;
                case 99485732:
                    str = "ۙ۫ۨۡ۫۫ۥۤ۠۫ۨۢ۫۬ۤۖۦۛۨۜۘۦۥۖۘۘۥۤۤۚۧۡ۫۟ۙۙۥۡۦۘۖۙۜ";
                    i14 = i9;
                    break;
                case 151406004:
                    i2 = R.drawable.elfin_pause_left_up;
                    str = "ۥۤۤۤۛۦ۬ۦۥ۫ۡۖۘۗۨۘۛۖۚۜۜۘۖۨۜ۠۟ۘ۫ۡۤ۬ۛۜۘۢۤ۠";
                    break;
                case 189116285:
                    imageView10 = this.OoooooO;
                    str = "۟ۡۨۗۡ۟ۨۥۜۧۢۖۘۨۥۧۘۢ۬ۘۘۖۦۘۘۘۡۧۨ۫ۘۘ۬ۤۜۦۜۘۚۢۡۨۛۙۤۧۗ";
                    break;
                case 303515481:
                    String str24 = "ۤۤۥۘۦ۟ۤۙ۟ۛۖۡۚۜۤۥۤۜۘ۬ۜۙۦ۠۬ۥۨۜۡۙۙۧۖۘۙۤۦۘۛۥ۫ۢ۫ۥۘ";
                    while (true) {
                        switch (str24.hashCode() ^ 1169116816) {
                            case -977684255:
                                str = "ۛۖۡۘۛ۬ۦۘۡۙۤۗۜۜۘۢۥۗۤۦ۟ۦۗ۬ۧۜۢۤۛ۟ۡ۠ۚۚ۫ۚۤ۟۠۬ۘۡۘۡ۟ۖۘ";
                                continue;
                            case -957281454:
                                str = "ۤ۫ۛۙۙۨۗۛۘۡۘۘۡۧۛ۟ۨۜۗۜۘۛۘۗۖۨۡ۬۟ۤ";
                                continue;
                            case -744175866:
                                str24 = "ۢۢۦۘ۫ۥۜۢ۬ۨۜۢۡۙۡۘۚۛ۟ۨ۟ۙۢۨ۟ۨۛۜۘۨۖۦ۬۟ۚ۟۟۬۠۬ۛۜ۬ۥۖۡۘۧ۬ۦۘ";
                                break;
                            case 978874317:
                                String str25 = "ۤۚۢۗۘۨۘۙۥ۟ۧۧۨۘۘۙ۬ۜۡۛۛۥۚ۫ۘۛۧۜۙۨ۬۫۫ۖ۫ۘۚۥۘ۬۟ۖۨۘ";
                                while (true) {
                                    switch (str25.hashCode() ^ (-1389283694)) {
                                        case -1784746187:
                                            str25 = "ۙۧ۟ۢۙۥۧۖۙۗۘۜۧۜۘۘ۬ۦۘۘۡ۠ۡۘۨ۬ۨۘۡۙۗۡ۫۬";
                                            break;
                                        case 197948228:
                                            str24 = "۬ۘۧۛ۟ۘۨۤۦۘۧۘۨۚۧۜ۬ۤۡۘۡۤۦۤۜۤۖۚ۬۫ۤۦۘۨۥۢ۠ۖۜۧۧۧۨۦۖۡ۠ۦۢۚ";
                                            break;
                                        case 202908130:
                                            str25 = C3718b7.OooO0Oo().OooO0OO == 4 ? "ۦ۟ۢۨۦۘ۫ۦ۬ۙۡۢۚۙۗۡۛۤۜۜۘۤۘۧ۟ۚۥۤۖۖۙۚۨۖۤۥۘ" : "ۡۤۘۘ۬۠ۢۜ۫ۗ۫۬ۨۘۖ۠ۦۘۙۚ۬ۛۚۧۙۤۖۜۤۤ۫ۢۜۘۤۛۡۜ۟ۗ۬۟ۗ۠ۢۖ۬ۥۘۨۤۘۘ";
                                            break;
                                        case 645379160:
                                            str24 = "۬ۨۨۘ۬ۦۨ۬ۚۨۘۧۗۜۘۖۖ۠ۧ۫ۥۘۥۚ۠۟ۢۤۘۖ۟ۘۙۡۘۙ۠ۘۚۥۥۘۖ۬ۖۘۘۥۘۘۙ۬ۦۘۢۥۦۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 322150290:
                    str = "ۚۛۧۦ۟۫ۧۛ۠ۛۘۤ۫ۙ۬ۡ۟ۤۤ۫۬ۗۤۛ۫ۙۢ۬ۧۘۧ۠۠۫۬ۡۘ۟ۥۖۢۗۙ۬ۨۛۖۖۥ";
                    imageView13 = imageView3;
                    break;
                case 535506825:
                    String str26 = "ۧ۫ۖۚۦۙۥۗۦۜۡۚۨۨۘۘۙ۬ۡ۬ۦ۬ۛۦۘ۫ۡۨۘۘۚ۬";
                    while (true) {
                        switch (str26.hashCode() ^ (-528576496)) {
                            case 20103546:
                                str = "ۨۥۤ۫ۦۙۡۜۖۘ۫ۦۥۡۚۡۥۦۨۖ۬ۧۤۡۤ۠ۛۛۡۦۦۘۚۡۧ۫ۙۦۗۛۙۡۦۜۘ";
                                continue;
                            case 180185351:
                                String str27 = "ۧۛۡۙ۟ۤ۠۫ۥۚۘۦ۟ۥۘۙۘۧۘ۟ۘۚ۬ۙۙۢۢۡۘۦۨۧۘۤۘۘۤۚۜۘۧ۠ۚۢۚۦۘ";
                                while (true) {
                                    switch (str27.hashCode() ^ 465383132) {
                                        case -1390671561:
                                            str26 = "ۦۢ۬ۨۖ۠ۜۧۧۦۥۗ۠۟ۡۘۘۢۙۜ۟ۡۘ۠ۚۛ۬۠ۦۘۧۗۨۘۡ۫ۚۡ۠ۦۗۨۘۘۢۗۚۛۚۚۖ۬ۦۘ";
                                            break;
                                        case -483577423:
                                            str27 = C3718b7.OooO0Oo().OooO0OO == 3 ? "ۚۗۖۘۛۖۡۥۛۢ۟ۖۥۘ۟۫ۡۘۙۡ۠ۤۜۜۡۘۖۗۥۘۘ۟ۥۡۚۧۘۤ۠ۙۦ۠ۥ۟ۚۦ۫ۜ۠ۛ۟" : "ۗۗۨۘۧۦۗ۟ۗۧۖۡۡۨ۫ۨۘۦۤۛۤۚۨۘ۫ۥۛۡۖۨۘۢۢ۫ۡۨۚۦ۬ۗۚۘۧۥۨۘ";
                                            break;
                                        case 658910601:
                                            str27 = "۟ۥۘۖۘ۠ۨۗۤۤ۟ۗۨۗۨۨۤۤۥۦ۟ۤۛ۟ۥۚۘۤ۬ۘۚۧۦۢۘۚ۬ۜۘۜۨ۬ۢۛۥۥ۠ۢۚۢۢۛۧۜۘ";
                                            break;
                                        case 1007457164:
                                            str26 = "ۖۦۦۘۥۥۘۘۥۘۨۥۙ۠ۤۙۥۘۖۤۚۦۤۗۗۨۘۙۧۜۧۙ۟ۗۤۘۘۛ۬ۨۘ۬ۨۘۘۥۥۨۨۙ۠ۘ۟ۧۛۚ۟";
                                            break;
                                    }
                                }
                                break;
                            case 578713192:
                                str26 = "ۢ۬۬ۥۧۘۥۢۤۛ۟۫ۖۧۖۘۙۘ۬ۦۤۡۜۨۥۘۙۗۜۢۙ۟ۛۥۜ۫۬۠ۢ۠۫ۧۡۘۙۧۘۜۤۘ";
                                break;
                            case 1167237881:
                                str = "ۗۗۘۙۧۚۦۛۖۘۧۘۧۘۗۤۜۘ۫ۗۧۙ۟ۦۘۦۤۘۘۢۦۖۘۛۦۜۤۛۦۘۧۙ۫ۡۥۘۡۙۖ۬ۤۖۘۖ۫ۦ";
                                continue;
                        }
                    }
                    break;
                case 586257251:
                    str = "۠ۤۛ۟ۘۡۧۗۚۘۙۚ۟ۥ۟ۗۧۡۚۘۜۙۦۘ۟۬ۡۢۧۘ۠۫ۨۚۚۜۘۘۜ۫ۥ۠ۨ۫۫ۥۡ۬";
                    i14 = i13;
                    break;
                case 598537316:
                    str = "ۥۙۗۖۦۘۨۛۢۚۨۖۘۢ۬ۨۘۢۦۧۨۖۘۧۦۜۘۢۤ۫ۤۘ۟۬ۚۢ۫ۨۖۘۤۨۘۘۙۖۙ";
                    imageView13 = imageView6;
                    break;
                case 682129427:
                    str = "ۤۨۢۜۧۖۘ۬ۥۥۙۧۚۖ۟ۥۘۥۘۥۚ۫ۨ۠ۥۥۘۚۥۧۤۛۗ";
                    i14 = i5;
                    break;
                case 700724164:
                    str = "ۙۜۚۧۥۡ۠۠ۚۢۦۘۧۧ۠ۗۨۖۘۙۛۤۛۖۤۡۖۥۘ۫ۘۡۜۜۜۘۙۘ۬۬ۨۚۙۡۗ";
                    i14 = i2;
                    break;
                case 729136074:
                    imageView13.setImageResource(i14);
                    str = "ۖ۠ۜۘۢ۠۬ۤۧۡۨ۟ۡۘۙۘۡۛۜۡۥۦۙۙۢۡۜۥۘ۠ۗۚ";
                    break;
                case 762612858:
                    i6 = R.drawable.elfin_normal_down;
                    str = "ۗۚۤۥ۠۬ۖۥ۟ۧۤۦۘۙۡۘۘۜۜ۫ۗۜۘۘۥ۬۫ۚ۠ۛۚۘ";
                    break;
                case 778442670:
                    i9 = R.drawable.elfin_normal_right_up;
                    str = "۟ۢۖۘ۬ۦۙۘۖۤۛۖ۠ۧۥۤۤۨۡۤۤۡ۬ۨۗۘۗۢ۠ۜۨۘۨۘۜۚۚۢ";
                    break;
                case 834147631:
                    i10 = R.drawable.elfin_run_right_up;
                    str = "ۥۡۥۨ۬ۦۘۜۦۘۢۥۗۨۤ۠۬ۖۧ۠ۤۧۜۗۘ۫ۗ۟ۦ۟ۖۦۨۢۛۜۛ۫ۖ۠ۢۜۘۘ";
                    break;
                case 857858052:
                    imageView11 = this.OoooooO;
                    str = "ۤۨۦۘۚۥۘۘۧۧۨ۟ۚۢ۫ۖۧۡۨۙۥۙۗۘۤۤۦۡۘۤۢۗ۫۠ۥۘۜۥۜۘۥۖۢۖ۠ۨۗ۫ۦۘۥۨۘ";
                    break;
                case 922973586:
                    str = "ۡۛۗۘۖۙۥۧۖۘۜ۬ۢۨۘۘ۫ۦۚۢۜۘۧۖۘۧۗۛۙ۟ۡۨۚۢۨ۫ۙ۫۟۠ۢۥ۫";
                    imageView13 = imageView5;
                    break;
                case 932480571:
                    str = "ۤۛۨۥۢۨ۟ۢۥۘ۟ۜۧۨۨۡۙۨۦۤۡۦۦۢۗۗۦۚۨ۟ۖ۫ۧۨۘۗۨۢ";
                    break;
                case 985662280:
                    imageView9 = this.OoooooO;
                    str = "ۥۧۤۜۧۧۡۖۡۦۘۨۗۢۡۘۦۗۦۘۜۦۘۜ۬ۖۘ۟ۨۥۦۡ۫ۜۖۜۘۥ۬ۗۥۖۙۚۚۨۥۡۜۥۤۘۘ";
                    break;
                case 1137552887:
                    str = "۟ۡۨۘ۠۟ۥۛۙۢۧ۫۠ۗۚ۫ۚۘۤۥۙۘۢۨۤ۬ۢۗ۫ۚ۬۟ۨ۟ۢۛۡۘ۬ۜۙۡۢۛ";
                    break;
                case 1219510348:
                    str = "۫ۛۘ۫ۘۘۘۖ۟ۛۛ۬ۖ۫ۧۖۥ۫ۜ۟ۘۦۘۙۤۦۘۙۘۡ۬ۚۤۤۜۧۘۥۢۦۦۘۨۘ۟ۜ۫ۙۛۚۚ۫۫";
                    i14 = i10;
                    break;
                case 1232851189:
                    str = "۬ۘۧۘ۬ۨۥۘۡۥۖۘۚۦۚۡۗ۠ۘۦۥۘۨۛۙۢۡۘۜۜۘۘۛۗۥۘۛۧ۫ۡۨ۫ۙ۫ۜ۠ۥۘۚۦ۫ۚۛۡۘ";
                    imageView13 = imageView;
                    break;
                case 1246783551:
                    str = "ۛۢۗۥۨۤ۬ۥۚۖۥۖۘۖۦۦۘۨۗۖۘ۬ۨۘۖۦ۬ۦۙۡۜۘۛ۠ۨ۟۫ۖۘ";
                    i14 = i7;
                    break;
                case 1417325411:
                    imageView7 = this.OoooooO;
                    str = "ۙ۠ۘۘۛۜۧۘۖ۫ۧۙۦۢ۬ۢۜۖۨۚۨۢ۟ۖۨۘۛۤۙۚۛۥۘۜۛۡۗ۠ۦۤۨ۫۠۠ۘۘۢۛۦ۫ۙۗ۫ۤۡۛ۠ۗ";
                    break;
                case 1438404834:
                    i11 = R.drawable.elfin_pause1;
                    str = "ۤۖۚۨۖۧۘۛۢۘۘۡۥۡۘۨۛ۟۠ۜۛۖۗۦۢۡۖ۫ۛۜۘۤۡۙۖۦۧۘۥۜۦ۟ۛۢ۬ۙۗ";
                    break;
                case 1478455885:
                    imageView4 = this.OoooooO;
                    str = "ۢۢۨۘۜ۫ۜۘۜۢۧۥۧۖۖۚۡۚۥ۠ۨ۠ۖۘۨۗۥۘ۬ۛۘۘۥ۟۠۫ۧۛۡۢۜۨۛۡۘۥۥۡۘ";
                    break;
                case 1485156971:
                    String str28 = "ۡۗۦۘۛۢ۠ۡۜۗ۠ۤ۫ۧۗۡۢۢۨۘۘۛۜۘ۬ۦۚۚۦۛۡۚۥۛۡۦۤۜ۬ۜۢۜ۫ۤۨۘ";
                    while (true) {
                        switch (str28.hashCode() ^ 1086441364) {
                            case -1376952882:
                                str = "ۗ۫ۘۘۜۧۧۛۥۧۘۛ۬ۥۘۨۨ۠ۨۦۚۗۚ۟۟ۜۨۨۚۥۘۜۨۦۘۛ۬ۢۨۡۛ";
                                break;
                            case -1367296954:
                                String str29 = "ۜۗۘۢ۬ۖۘ۬ۡۖۚۘۢۥۗۗۖۦۘۙۛۦ۬ۥۦۘۗۥ۟ۤۖۛ۫ۨۖۘۡۚۨۘ";
                                while (true) {
                                    switch (str29.hashCode() ^ 1589183094) {
                                        case -2115546531:
                                            str29 = "ۢۗۦۘ۬ۗۢۧۚۥۨۡۘ۠ۨۨۘۛۨۧۡۧۗۡۧۘۜۖۡۖۦۜ۬ۤۖۘۛۡۤۖ۠ۦۘۗۙۨۚۚۦۨۘۡ۫ۙۤۖۗ";
                                            break;
                                        case -1157346794:
                                            str29 = C3718b7.OooO0Oo().OooO0OO != 2 ? "ۢۛۦۚۙۤۗۚۖۘۘۢۘۥۗۘۦۖۘۗۗۥۦۤ۟ۦۗۖۘۦ۟ۗ۬ۢ۠ۦۧۘ۫ۙۡۘۜۤۡ" : "ۘۡ۬ۡۡۥۘۛۘۦ۟ۤۖۢۧۨۘ۟ۥۛ۬ۙۢۚۘۥۘۨۗۖۘۡۢۘۘۧۖۦۘۗ۟ۖ";
                                            break;
                                        case -794811839:
                                            str28 = "۫ۧۙ۟ۦ۠ۚۙۙۨۛۙۦۜۢۧۨۧۘۤۦۨۗۙ۬۬ۗۥۨۥۢ";
                                            break;
                                        case 1617107981:
                                            str28 = "ۡۗۥۡۛ۬۫۬ۜۥۛۚۜۨۙ۠ۗ۫ۢۚۢۘۦۘ۫ۛۜۗ۫ۡۢ۬۫۠ۛۨۘۧۛۚ۫ۥۨۦ۬ۨ۬۫ۜۘۢۖ۟ۢ۠ۧ";
                                            break;
                                    }
                                }
                                break;
                            case 360999023:
                                str28 = "ۜۙۦۘۨ۫ۘۙۦۙۨۚۡۘۤۙۥۘۧۨۧۘۗۖۥۘ۠۬ۦۛۗۗۢ۟ۨۨ۫ۨۘۥۢۘۘ۟۠ۡۛ";
                                break;
                            case 1789786097:
                                break;
                        }
                    }
                    break;
                case 1509096745:
                    break;
                case 1565174144:
                    String str30 = "ۖ۬ۘۘۗۛۖ۫ۢۗۛۥۘۢۨۜ۠۠ۛۚۤۖۚۡۤۛۦۜۘۤۧۥ";
                    while (true) {
                        switch (str30.hashCode() ^ (-321661300)) {
                            case -1972278325:
                                str = "ۨ۟ۗۢۗۗ۫ۦ۫ۙۖۡ۠ۢ۬ۚ۠ۧۥۙۖۜ۬ۨۘۚۗۦۘۥۖۗ";
                                continue;
                            case -709429545:
                                String str31 = "ۘ۫ۖۨۡ۫ۡۜۜۘۛۢۥۘۥ۠ۨۦ۬۠ۧۨۦۘ۟ۢۚۥۙۘۘ۟ۡۧۤۢۖۘۢۡۨۘۡۢۚۡۥۘ";
                                while (true) {
                                    switch (str31.hashCode() ^ 1639791024) {
                                        case -1991391678:
                                            str31 = "۬ۘ۫ۧۚۥ۟ۨۗۢۜۘۥۢۨۗۧۡۚۙۡۢۘۘۖۤۛ۟ۧۥ۠۠ۨۘۖۢۥۘۨۦۛۢۦ";
                                            break;
                                        case -878072087:
                                            str30 = "ۘۢۦۘۦۢ۫۠ۗ۟ۧۢۜۨۗۦۜۤۤۚۖۘۚۨۢۥۗۙ۬ۜۛۖۢۡۢۨۜۘۧ۬ۢۗۨ۟ۗۚۙۢۖۡۘ";
                                            break;
                                        case 836261394:
                                            str30 = "ۡۙۖۘۧ۫ۤۦۚۨۛۧۦۦۡۘۙۦۙۧ۫ۧۤ۫ۡ۬ۚۜ۫ۢۡ";
                                            break;
                                        case 2045701396:
                                            str31 = C3718b7.OooO0Oo().OooO0OO == 3 ? "ۜۥۖ۟ۤۦ۫ۧۘۜ۟ۨ۬۟۟۬ۜۜۦۘۦۘۚ۠ۖۘۘۦۢۨۦۥۘۚۨۧ۬۟ۖۘۙۛ۫ۡ۬۫ۨۧۨۘۘ۟ۥۘ" : "ۙۛۦۘ۫ۢۗۡۥۚ۠ۜ۬ۙ۫ۜۘۙۤۥۧۛۥۘ۬۫ۘۘۛۘۤ۠ۦۛ۠ۚۘۧۥ";
                                            break;
                                    }
                                }
                                break;
                            case -321711006:
                                str = "ۨ۫ۚۡۤۦۘۜ۫۠ۢۚۙۤۚ۠۫ۚۡۘ۫ۜۦۘۙۚۙۙۙۦۨ۫ۤ۫ۨ۫ۜۨۦۡ۬ۥۘ۠ۚۛ";
                                continue;
                            case 1951285354:
                                str30 = "ۙۘۜۘۖ۟ۢ۫ۢۡۘۨ۠ۤۖ۬ۨۜۥ۫ۚۥۛۜۢۜۘ۬ۜۦ۫ۨۚۛۗۛ۫۟ۖۤۦۥۜۤۨۖۤۦۘ۠ۧۡۘ";
                                break;
                        }
                    }
                    break;
                case 1584108160:
                    str = "ۜۖۦۘۡۖۧۘۧۚ۫ۢۖۡۘۙۜۘۘۦۘۘۨۖ۟ۤۨۘۘۧۚ۠ۦۙۤ";
                    break;
                case 1601976981:
                    str = "ۨۙ۠ۚۡۡۘۢۤۘۦۡۡۙۛ۫۟ۡۘ۫ۢۧۤ۬۫ۚۗۦ۟ۙۨۘۡۘۨۖ۠ۤۖۖۚۦۛۢۦ۟۫۫ۡۘۘۤۛۧۦۗۡۘ";
                    i14 = i12;
                    break;
                case 1660112152:
                    str = "ۧۥۘ۠۬ۘۘ۠ۢۘۘۙۢۗۡۙۖۘ۬ۜۢ۫ۨۢۧ۟ۖ۫ۖۖ۟ۥۤ۫ۜۦۘۗۤۦۘ۟ۛۜۘۨۢۡۢۦۘۗۘۡۨۡۜۘۘۘۡ";
                    i14 = i3;
                    break;
                case 1683556467:
                    str = "ۥۚۥۡۖۢۛۥۡۘۚۚۦۘ۠ۧۘ۠ۥۡۘۡۧۥۥ۠ۙۘۙۡۛ۠ۚۤ۫ۨۚۢۛۛۘ۬۟ۘ۠ۤۥ۠ۖۙۥۘۜ۠ۜۘۡۡۦۘ";
                    imageView13 = imageView10;
                    break;
                case 1717182653:
                    str = "ۗ۫ۜۤۜۛۥ۬ۡۦۤۘۘۖۥۘۖۢۥۡۖۡۗۥۖ۬۬ۜۡۘۖۘۖۥۧۨۢۘ۟۠ۚ۟ۨۨ۬۠۫ۚۨۘ";
                    imageView13 = imageView11;
                    break;
                case 1792385402:
                    String str32 = "۟ۤۡۘۚ۟ۖۘۙۦۜۢۢ۫ۨۦۡۦ۫ۤۡۤۛۢۥۘۤ۫ۜۦ۟ۨ۫۠۟ۡۢ۫۬ۙۘۤ۠۬ۚۤۜۡۤ۫۫ۙۚۘۡۧۘ";
                    while (true) {
                        switch (str32.hashCode() ^ 1937456412) {
                            case -745644403:
                                str32 = "ۨۧۗۧ۠ۜۘۖۚۡۘۛۨۧۙ۟ۥۘۗ۠ۥۛۨۛۛۘۧۖۧۤۘۘ۟ۡۙۤ۬ۢۜۘۖۛۙۦ";
                                break;
                            case -33614075:
                                String str33 = "۟ۜۢۨۗۡۡۗ۠ۢۛۡۢۢ۬۬ۤۧۘۘۥۘۗۢۖۦۖۧۘ۠ۜ۫ۜۢۦۘ۫ۙۨ";
                                while (true) {
                                    switch (str33.hashCode() ^ 2004593627) {
                                        case -684637447:
                                            str32 = "ۘۤۘۘۢۙ۠ۥۗۤۘۙۦۘۤۗۜۘ۟ۦۛۗۨۤۤۙۘۙۧۘۥۥۙۘ۟ۚ۠۫ۨۢۚۡۖۨۜۘ";
                                            break;
                                        case 513101573:
                                            str33 = C3718b7.OooO0Oo().OooO0OO == 3 ? "ۙ۠ۦۢۜۗۥۘۡۜۢۛۜۚۘۘۚ۫ۡۘۥۛ۬ۦ۠ۚۚۦۜ۟ۘ۟ۗۙۨۘۢ۫۫۬ۤۙۧۗۘ" : "ۤۚۙۤۖ۬۫ۨۡۘۚۛۧ۠ۚۜۘۦ۠ۡۡۥۥۘۨۨۘۙۤۧ۠ۢۨۨۦۘۘۢۘۨۘ";
                                            break;
                                        case 1045751106:
                                            str32 = "۬۫ۢۢۨۥۨۥۘۚۢ۫۫ۜۛۡۚۜۘ۬ۖ۬۬ۗۘۧۢۛۢ۠۟ۥۜۦۛۙ۟ۧ۫ۖۢۗۨ";
                                            break;
                                        case 1468127127:
                                            str33 = "ۚۜۦۘۥۡۖۘۗۖۜۘۥۜۦ۟ۗۚۤۖ۟ۚۜۧۙۙۗۡۜۦۦۤ۬";
                                            break;
                                    }
                                }
                                break;
                            case 39956363:
                                str = "ۦۤ۬ۦۗۜۘۧۛ۟ۦۤۗۗۧ۟۬ۤۘۘۨۖۖ۟ۛۦۖۛۧۥۦۛۨۚۢۥۗ۟ۦۘۡۚۜۘ";
                                continue;
                            case 1263824710:
                                str = "ۘۡ۫ۜۦۛ۫ۚۨۘۥۨۨۚۚۨۘۛۥۖۨۡۖۤۜۧۨۜۧۙۡۘۘۗۚۛۜۛۙۙۚۜۙ۫ۤۥۜۜ۫۫ۡۘۚ۬ۗۛۦۥۘ";
                                continue;
                        }
                    }
                    break;
                case 1810382314:
                    str = "ۡۧۨۘۢۘۤ۬ۘ۬ۘۦۛۢۦۨۘۖۘۦۖ۫ۚۖۖۦۛۖۥۗۥۦ";
                    imageView13 = imageView7;
                    break;
                case 1870555019:
                    str = "۟۟ۛۚۘۙۦۦۢۚۜۧۗۛۥۚۛۛۢۜۨۧ۬۫ۛۛۜۘ۟ۤ۠۟۟ۦۘۤۜۡۨ۫ۨۘۚۜۥۘۧ۬ۦ۬ۦۛ۬۫ۥۧ";
                    i14 = i8;
                    break;
                case 1880703771:
                    imageView8 = this.OoooooO;
                    str = "ۢ۟ۛ۫ۡۖۘۦۛۥۘ۟ۘ۬ۚۙ۫۫۟۟ۦۦۛۢۧۡۘ۠ۛۜۚ۫ۖۘ";
                    break;
                case 1982214331:
                    str = "۬۠ۥ۫۫ۤۢ۫ۧۨۘۢۚۘ۠ۛۦ۟۠ۙۡۜۘ۬ۚۡۜۨۚۚۧۜۖۘۗ۫ۦ۫۫ۖۙۜۙ";
                    break;
                case 2114062799:
                    str = "ۛ۠ۦۗۛ۟ۥۦۘ۠ۨۨ۟۠ۘۘۢۢۡۘۖۚۙۥۡۖ۫ۛۗ۟ۤۦۢۛۧۚۘۦۘۙۨۘۚۖۜۖ۬۟۬ۛۗ۠۫ۘۘ۬۠ۥۘ";
                    i14 = i11;
                    break;
            }
            return;
        }
    }

    public void Oooo0() {
        String str = "ۚۢۙ۬ۢۢۛ۫ۤۛۢ۬ۤۥۦۜۨۘۘۦۥۖۘ۟۬ۘۘ۟ۥۗۡۜۨۘۘ۟ۙۙۚۧۥۙ۠ۛۨۥۘ";
        int i = 0;
        ImageView imageView = null;
        ImageView imageView2 = null;
        int i2 = 0;
        ImageView imageView3 = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((((str.hashCode() ^ 712) ^ 542) ^ 436) ^ (-1284805105)) {
                case -1921559538:
                    str = "۟ۤ۟۬ۦۦۘۚۥۦۦ۟ۗۨۘۨۘۛۤۥۘۜۡۘۤۤ۫ۖۨۙۗ۠ۧ۬ۖۢۥۗۥۖ۟ۡۘۢۨ۫";
                    break;
                case -1291534295:
                    this.oo000o.setText(getContext().getString(R.string.floatview_elfin_run));
                    str = "۬ۡۢ۟ۜۗۚۢۥۦۥۨۤ۠۠ۘۨۛۗ۫ۥۡۚۗۛ۬ۢۨۛۖ۫ۡۡ۫ۖۤۖۚۨ۫ۢ";
                    break;
                case -1072607874:
                    str = "ۘۥۙۛۥۧۘ۟ۢۡۘ۫ۨۚۙۛۖۘۡ۠ۜۘۚۛۙۦۜ۠ۗۤ۬ۥۙۧۚ۬ۤ۟ۘۘ۟۬ۚۢ۟ۨۘ";
                    break;
                case -939818831:
                    this.OoooooO.setImageResource(R.drawable.elfin_normal1);
                    str = "۟ۧۘۘۗۛۦۘۚۙۨۘ۫ۘۜۡۘۨۘۤۗۤ۬ۘۥۙ۬ۘۘ۟۫ۜۛ۫ۦۙۨۖۘ۫ۘ۬ۘۢۖۘۥۡۦ";
                    break;
                case -824084201:
                    this.oo000o.setText(getContext().getString(R.string.floatview_elfin_run));
                    str = "ۚۖۘۜۧۘۘۨۥۦۘۦ۠۫۫ۜۨۘ۫۬ۜۘ۟ۡۨ۠ۡۗۙۤۛ۟ۖۧۘۖۖۨۨۘۘۧۘۙۥۙۥۙۗۛۨۘۗ۫ۥۘۦۚۥ";
                    break;
                case -802786036:
                    this.o00oO0o.setImageResource(R.drawable.floatview_elfin_pause);
                    str = "۟ۤ۟۬ۦۦۘۚۥۦۦ۟ۗۨۘۨۘۛۤۥۘۜۡۘۤۤ۫ۖۨۙۗ۠ۧ۬ۖۢۥۗۥۖ۟ۡۘۢۨ۫";
                    break;
                case -737129523:
                    str = "ۧۢۘۘۨۙۦۖ۠ۖۘۜ۫ۦۘۨۡ۫ۜۗ۬ۛۖۤۘۚۛۧۥ۟ۤۚۦۘۛۨۡۦۗۦۘۘ۟ۖۢۦۥۘۥۨۛۚ۫ۥۘ۟ۘۚۢ۟ۙ";
                    i4 = C3718b7.OooO0Oo().OooO0OO;
                    break;
                case -171285407:
                    return;
                case -110123162:
                    i = R.drawable.floatview_elfin_setting;
                    str = "۠۠ۗۦۧۨ۫ۥۙۥۛۚ۬ۜۗۦ۠ۥ۠ۗۗۘۙۖۨۙۨۗۤۦۜۥۚ۬ۦۚ";
                    break;
                case 99649074:
                    imageView3 = this.o0ooOO0;
                    str = "ۛ۬۬ۚۡۚۥۜۦۘۙۗۦۘۤ۟ۗ۬ۘۡۘۡۘۡۘۚ۫ۤۡ۠ۖۨ۟ۢۤۥ۠ۨ۫ۗ";
                    break;
                case 113543650:
                    String str2 = "ۙۘۡۡ۠ۜۘۚۡۥۘ۫ۦۖۘ۫ۜۨۘۨۜۨۘۥۡۙۥ۠۬۫ۡۘۖۜۖۘۚۜۘۘۛۖ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 157050399) {
                            case -1589335794:
                                String str3 = "ۧۢۛ۟ۥۥۖۘ۫۠ۦۨۖ۠ۚۛۢۚ۬ۢۨۜۨۚۡ۬۬ۨ۟ۢۤۜۜۢ۟ۖ۫ۛۛ۠۫۠ۥ۫۠۠ۜ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1071476504)) {
                                        case -656307967:
                                            str3 = "ۧۘۜۘ۟ۨۙۛۧۗۤۗۛۜۤۦۘ۟ۖۥۘۡ۬ۢۡۥۘۡۖۘۚۖ۬ۧۜ۫ۜۙۜ۬۫ۢۡ۬ۘۘۗۚۚ";
                                            break;
                                        case -356147141:
                                            str2 = "۟ۘۖۘۡۙ۟ۢ۬ۗۚ۟ۤۧۢ۠ۡۛۡۧۜۨۜۦ۠ۜۧ۫ۘۦۛۙۧۨۘۤۖ۫ۜۥۡۡۙۤۗۨ";
                                            break;
                                        case 1555413534:
                                            str3 = i4 == 2 ? "ۤ۟ۜۘ۫ۜ۟۠ۜ۠ۥۧۖۡۢ۠ۧۚۨۘ۠ۖۖۤۢۜۥۤۢۗۡۛۖۜۙۙۜۘ" : "ۧۡۜۘ۫۬ۖۦۥۚۛۦۥۘۧۙۖۘۗۗۨۘۡۛۖۧۦۚ۬ۤۘۘۢۛۨۨۤۢۨۤۛ";
                                            break;
                                        case 2143603400:
                                            str2 = "ۡ۠ۧ۟۬ۚۢۜۧۙۧۚ۟ۙۡۜۚۘۡۧۜۘۦۧۛ۫ۤۡۖۧۧ";
                                            break;
                                    }
                                }
                                break;
                            case -994448176:
                                str2 = "ۘۖۜۘ۬ۗ۟ۛۧۖۤ۫ۨۘۖ۠ۧۚۗۙۜۨ۫ۢۧۡۘۤۦۡۘۦۨۥۘ";
                                break;
                            case -616737028:
                                str = "ۚۙۡۘ۠ۦۥۢۧۡۘ۟۫ۨۘۘۤ۟ۜۗۦۘۙۚۘۗۖۧۘۛۚۡۘۦ۟۠ۖۡۦۖۢۦ۬ۘ۬ۗۚ۟";
                                continue;
                            case 1171864367:
                                str = "ۖۘ۠ۚۗ۫ۚۜۡۘۖۥۥ۫ۧ۠ۚۙ۬۬ۡۧ۟ۦۘۘۤ۠ۧ۠ۗۢۗ۟ۘ۠ۖۜۘ۫ۢۦۜ۫ۨۧۧۗ۫ۥۨ";
                                continue;
                        }
                    }
                    break;
                case 187835341:
                    str = "ۖۙۦۤۖۨۘۘۜۜۦۗۦ۠ۧۦۘۖۚۘۘۤۥۦۡۦۛ۠ۙ۬۟۟ۦۚۡۘۘۜۛۤۥۘۜۘ۟ۧۥۘ";
                    i2 = i3;
                    break;
                case 193188567:
                    this.o00oO0O.setText(getContext().getString(R.string.floatview_elfin_setting));
                    str = "ۚۧۢۛۖۜۦۙۦۘۡۨۚۢۢۘۘۗ۫ۤۢۧۙۥۙۤۗ۠ۘۘۛ۠ۖۘ۟۟ۥۗ۟ۦۥ۬ۧۙۤۚ";
                    break;
                case 195925211:
                    this.o00oO0O.setText(getContext().getString(R.string.floatview_elfin_stop));
                    str = "ۖ۠ۦۘ۠ۦۘۡۘۜۢۘۙۥۖۘ۬۫ۚۥۤۚ۬ۗۖۦۛۘۘ۬ۚۜۛۢۨۘۧۛ۫";
                    break;
                case 535771279:
                    str = "۬ۨۘۘ۠۠ۢۧۗ۠۬ۜۦۘۧۡ۠ۗۘۗۤۘۘ۟ۤۥۘۖۘۧۥۘۤۦۜۥۘۤ۬ۤ۠ۨۥۘ۬ۖۗ";
                    imageView = this.o0ooOO0;
                    break;
                case 615332559:
                    str = "ۦ۠۫ۙ۬۠ۚۜۨۘ۟ۘۧۘۚ۫ۦۘۢۚۡۘ۬۠ۦۘۥۚۘۘ۫ۦ۟ۢۘ۠ۥۜۖ۟ۜۛۙۖۥۘۙۡۘۜۨۖۛۜ۠ۛۡ۫ۖۚۡۘ";
                    i2 = i;
                    break;
                case 618752520:
                    str = "۠۟ۨۛ۟ۡۘۦۙۗۜۦۥ۠ۦۘۥۘۛۙ۬ۖۛ۟ۛۚۤۙۗۥۚۘۛۘ۟ۖۚۛۖۘۤ۟ۦۘ۟ۢۡ۫ۤۛ۬ۦۖۜۦ";
                    imageView2 = imageView3;
                    break;
                case 648289784:
                    this.o00oO0o.setImageResource(R.drawable.floatview_elfin_run);
                    str = "ۗۡ۠۫ۨۧۘۨۨ۫ۧۗۦۨۧۚۜۧۙ۬ۤۥۘۤۜ۠۬۟ۜۘ۠ۙۘۘ";
                    break;
                case 929148178:
                    str = "ۛۗۛ۬۟۬ۚۘۥۡۙۚۗۜۡۘ۠۫ۜۘۜۗ۠ۡۗۥۦۦۨۥۤۧ";
                    imageView2 = imageView;
                    break;
                case 1469078367:
                    this.oo000o.setText(getContext().getString(R.string.floatview_elfin_pause));
                    str = "۟۬ۛۥ۠ۙۛ۫ۖۘ۬ۦۘۢۙۡۘ۬ۡۥۘۤۢۢۖ۠ۖ۬ۡۧۚۤۘ۬ۢۖۙۧۖۛۥۖۘ۫ۢۢ";
                    break;
                case 1664614644:
                    this.OoooooO.setImageResource(R.drawable.elfin_normal1);
                    str = "ۡۡۦۡۜۙ۟ۙۡۤۚۗۤۥۜۙۥۛۛۘۘۖ۬ۘۘۗۤۢۗ۫ۢ";
                    break;
                case 1671607298:
                    str = "۠ۧۖۘ۠ۦۥۘۢۡۥۧۦۛۡۚ۠ۚۢۥۖۦۜۚۥۦۘۙۘۡۘ۫۟ۡۤۜۧۘۗۨۖ";
                    break;
                case 1706850936:
                    i3 = R.drawable.floatview_elfin_stop;
                    str = "ۗۙۘۚۚۡۘۛ۫ۤ۠۫ۡۘۢۤ۠ۨۛۘۙۙۗۙ۠ۢۙۚۜۘۖۨۛۢۤۙۤۙۚۜۘ۬۬۬ۚۦۥۘۙۡۡۦۖۦۦۘۧ";
                    break;
                case 1924494661:
                    imageView2.setImageResource(i2);
                    str = "ۙۧۨۡ۬۬ۥ۫ۖ۠ۦۧۘۥ۫ۜۘۤۚۚۚ۟۬ۛۛۗ۫ۨۧۙۦۚ۟ۦۦۖ۟";
                    break;
                case 1972101283:
                    this.o00oO0o.setImageResource(R.drawable.floatview_elfin_run);
                    str = "۟ۧۤۘۙ۟ۚۨۨۘ۠ۡۘ۟ۘۜۙۡ۠۠ۧۜۘۗۤۥۘۦۜۨۜ۠۠ۗ۠ۤۦۡ۫۬۠۫۬ۨۖۧۧۘۛۗۘۡۚ۫ۤۥۘ";
                    break;
                case 1999750573:
                    String str4 = "ۥۥۨۘۨۘۖۘۚ۠۬ۜۙ۟ۗۛۤۤۙۖ۠ۦۘۥۤۤۙ۠ۜۘۚۙۜ۟ۢ۟۟ۨۘۘ۬ۚۜ۬ۢۤ۫ۗۜۖۥۛۧۢۙۡۗ";
                    while (true) {
                        switch (str4.hashCode() ^ 971962114) {
                            case -2131849031:
                                String str5 = "ۦۛۜۚۜۥۧۡۦ۬ۧۨۜ۟۫ۚۚۛۨۤۡۖ۠ۛۦۜۡۘ۫ۜۘۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1452448909)) {
                                        case -910647269:
                                            str4 = "۟ۖۦۚۤۛۦۤۨۘۙۢ۟۟ۗۗ۬ۡۘ۬ۦۦۙۦۜۦۦۘۘۗۙۛ۫ۦۚۥۥۥۘۧۖۖۘ۠۠ۨۛۜۥۜۦۜۘۡۨۖۘۛ۟ۡۘ";
                                            break;
                                        case 1323878952:
                                            str4 = "ۡۙۥۘ۫۬ۗۨۧۤ۬۟ۥۘۙۥۜۘۨۘۦۘۗ۟۫ۥۤۘۗۘ۬ۢۨۨۘۘ۫ۖ۠۟ۖۘ";
                                            break;
                                        case 2107939593:
                                            str5 = C3718b7.OooO0Oo().OooO0OO == 3 ? "۬ۢۥۘۦۢۘۘۡۛۜۨۥۖ۫ۧۦۘۧۖۙۚ۟ۙۦۢۥۘۛۘۜۘۥۛۡۚۥۨۘۥۗ۬ۥۜۤۢۘۘۚۛۥۘۨۘۥۘۚۤۙۧۢۦ" : "ۦۢۧۙۚ۟ۖۧۨۘ۬ۨۧۘۘۦۘۢۚۜۘۡ۬ۜۘۧۘۦۖۥۘۨۖ۟۫ۜۖۛ۟ۤۚۛۥۧ۬ۨۘۛۜۥۘۗۨ۠۬ۗۥۘۖۨۖۘ";
                                            break;
                                        case 2136727307:
                                            str5 = "ۢۧۙۢۥۥۨۡۗۘۜ۬ۧۡۥۘ۬ۘۥۚۥ۫ۦۙ۟ۙۦۖۘۖ۫ۘ۫۟ۜۚۖۤ۬ۡۘۧۡۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case -2029791000:
                                str = "ۚ۬۟ۜۤۡۘۘ۬۫ۤ۬ۘ۫ۦۥۗۡۚۧ۬ۢۖۦۖۘ۟ۥۥ۟ۘۦۖۢۗۖۧۦ";
                                continue;
                            case -107181503:
                                str4 = "۟۫ۚۥۜۗ۬ۡۧ۠ۛۖۘۤۜۨۨ۠ۚۥ۠۟۠۫ۦۢۨۘ۫ۛۦ";
                                break;
                            case 658425503:
                                str = "ۥۙ۠ۖۥۡ۫ۙۖۘۧ۠ۡۘۢۦۥۢۖۧۘۨۘۡۘۜۚۨۘۖۗ۬۫ۛۥۘ";
                                continue;
                        }
                    }
                    break;
                case 2079887177:
                    this.OoooooO.setImageResource(R.drawable.elfin_pause1);
                    str = "ۧۤۡ۟ۦۗ۠ۛۘۗ۫ۨۘۡۢۡۨ۫ۦۡۘۧۘۤۗۛۧ۟ۚۢۜۦ";
                    break;
                case 2104669464:
                    str = "۠۟ۨۛ۟ۡۘۦۙۗۜۦۥ۠ۦۘۥۘۛۙ۬ۖۛ۟ۛۚۤۙۗۥۚۘۛۘ۟ۖۚۛۖۘۤ۟ۦۘ۟ۢۡ۫ۤۛ۬ۦۖۜۦ";
                    break;
            }
        }
    }

    public void Oooo00o(boolean z) {
        String str = "ۛۘۥۘۡۖۘۨۦۦۘ۠ۦۘۘ۟ۜۗ۟ۥۡۡۧۙۨۧۦۘۢۛۧۜۙۡۛۙۜ۬ۤ۬ۢ۫ۦۖ۫ۘ";
        LinearLayout linearLayout = null;
        LinearLayout linearLayout2 = null;
        int i = 0;
        LinearLayout linearLayout3 = null;
        int i2 = 0;
        StringBuilder sb = null;
        while (true) {
            switch ((((str.hashCode() ^ 936) ^ 777) ^ 445) ^ (-1789672740)) {
                case -1571299233:
                    sb.append(z);
                    str = "ۖۥۙۗۢۥۘۘۡۧۙۜ۬ۢ۬ۜۘۛۢۘۘ۬ۡۛ۠ۧۙۤۛۥۘ۫ۢۨۘ";
                    continue;
                case -1359742253:
                    str = "۬ۗۨ۬ۢۙۙۥۤۥۜۥۜۙۨۗۡۦ۟ۢۘۥ۫ۨۘۛۙۚ۫ۥۖۘۧۛۨ۠ۥۧۘۤۛۧۛۛۖۦ۠ۚۡۗۜ";
                    continue;
                case -1355383914:
                    str = "۠ۨۖۘۖۨۘۚۚۦ۟ۥۢ۟ۚۛ۬ۙ۫ۧۥۘ۟ۦ۠۟ۛۘۙۡۡ";
                    continue;
                case -1066227916:
                    String str2 = "۠ۡۗ۫ۗ۫۟ۖۘ۠ۚۜۧۚۢۢ۠ۦۘۜۗۖۥ۟ۖۢۤۚۗۘۜۜ۠ۧۖۦۜۥۤۦۤۧۢ";
                    while (true) {
                        switch (str2.hashCode() ^ (-905908447)) {
                            case -1776028396:
                                break;
                            case 470042794:
                                str2 = "ۥ۠ۜۜۙۧ۫ۘۖۘۤۡۤۡۘۘۤۙ۬ۢۛۘۘۤۧۡۤۘۚۥۦۧۖۨۡۚۦ۬ۧۛۥۘۙ۬۟ۚۡۨۨۖ۟ۦ۬ۡۜ۠۠";
                                break;
                            case 1284908763:
                                String str3 = "۬ۥۤۤۖۜۘۘۚۡۘ۠ۛ۬ۧۢ۠ۡۦۘۚۗ۠ۜۘ۬ۧۨ۬ۗۖۚۡۛۘۦ۠ۘ۠ۦۖۘۚۗۡ۫ۤۘۥۚۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 429068206) {
                                        case -1989028044:
                                            str2 = "ۘۘ۫۬ۘۘۘ۠ۛۥۘۛۘۧۘ۫۬۫ۜۢۡ۫ۡ۬ۧۨۜۘۜ۬ۤۙۢۤ۠ۙۘۙۚۨۘۦۥ۟۫ۨۦۘ";
                                            break;
                                        case -999913546:
                                            str2 = "ۚۚۧۢ۠ۖ۟ۤۨۘۖۘ۬ۦۜۚۙۤۗۘ۠ۦۘۛۜۙۙۡۡۘۦۛۚۘۧۡۘۖۘۖ۫ۨۜۘۦۖۧۘ۬ۦۘۘۜۙ";
                                            break;
                                        case 135895991:
                                            str3 = this.o0OoOo0.getVisibility() == 0 ? "ۜۦۛۧۨۡۤۥۖۚۚ۬ۘۡ۬ۛ۠ۙ۬ۦ۟ۖۙۦۥۤۦۘۤۤۦۘ۫ۧۡۘۘۙۜ۟ۨۡۘ۫۟ۧ" : "ۡۨۨۦ۫۟ۙۗۢۤ۟ۢۡۘۨۘۢۦۖۘۡۥۢۛۧۗۘۦۜۘۡ۫ۖۨۛۧۖۘۨۘ";
                                            break;
                                        case 690729549:
                                            str3 = "ۡۨۨ۫ۧۨۘۤۧۨۘۜۜ۠ۛۙ۠۫۟ۗۚۡۦۚ۫ۥۛۡۤۤۘۘۙۗۦ۬ۘۘۙۦۘۘۡۚۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case 2071566980:
                                str = "ۢ۠ۖۘۘۜ۫ۖۨ۬ۨۛۙۗۛۡۘۨ۫ۜۡۤۥۧۥ۫ۛۢۥۖۨۘۚۛ۬ۗ۠ۘۡۤۨۘۨۜۡۘۚ۠ۜۘۢۢۨۛۜۤۨ۠۠";
                                break;
                        }
                    }
                    break;
                case -730927892:
                    str = "ۡ۟۟ۥ۟۠ۨۖۚۧۤۥۘۦۥ۟ۗۦۘۗۢۦ۟ۘۤۙۚۧ۠۟ۜۘۙۛۖۥۖۥۡۗۘۘۙۘۧۧۗۤ۬ۘۨۘ۠۠ۡ۬ۧۜ";
                    sb = new StringBuilder();
                    continue;
                case -690268194:
                    str = "ۦۜۘۜۙ۬ۘۤ۠ۚۢۗۤۡۢۚۦۡۘۙۙۚۜۗ۠ۦۨۖۙ۟ۜۘۧ۠ۢۦۖۘۚۚۜۘۦۥۘ";
                    linearLayout2 = linearLayout3;
                    continue;
                case -659280372:
                    str = "ۙۥۡۡۨۥۘۡۖۙۜۤۨۦۨۘۘۨ۟ۖۘۖۗۘۚۜ۠۬ۗۘۙۜۙ";
                    continue;
                case -431162890:
                    String str4 = "ۜ۬ۢۛۧۧۛۨۙۧۢۥۘۜۚۢۨۘۘۜ۠۬ۛۚۧۧۚۦۘۜۧۜۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-905389673)) {
                            case -1719197748:
                                str4 = "ۡۨ۬ۛۙ۟ۤۦۡۗۛۧۛۖۡۘۥۥۘۦ۟ۥۘ۫ۙ۬ۚۡۙۡ۫ۡ۠ۘۖۨ۠ۙ";
                                break;
                            case -1081320458:
                                str = "ۨۜۡۘ۠ۜۧۦۛۘۚۡۨۘۗ۠ۡۘۙۦۢ۬۫۫ۢۗۙۧۘۧۘۦ۟ۢ";
                                continue;
                                continue;
                            case 1039784086:
                                String str5 = "۬ۘۡ۟ۤۖۘۤۡۗ۫۬ۛۢ۬ۘۘۨۦۙۖ۫ۡۘۚۥۘۡۨۙ۠ۛۥۘ۫ۤۦۘ۫ۡۜۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 14025299) {
                                        case -130728094:
                                            str5 = z ? "ۦۦۥۘۦ۠ۦۘۘ۟ۧۤۛ۬۫ۧۙۖۖ۟ۧۢۦۜۡۜۤۥۘۖۗۡۘ۫ۜۘۘۦۤۧۚۦ۟ۤۛۥۢۢۢۗۡ" : "ۖۚۦۜۜۖۘۘۨۘۘۚۢ۬ۡ۫ۜۘۧۖ۟۫ۤ۟ۜۨۗۖۜۖ۬ۙۨۤۘ۫ۤۥۚۗۘۚۘۜ";
                                            break;
                                        case 773575285:
                                            str5 = "ۙۖۧۨۤۖۘ۫ۚۘۘۛۦۘۘۛۘ۫۫۫۫ۥۘۙۘۥۨۘۤۖ۫ۡۥۗۘ۟ۖۘۢ۫ۦ";
                                            break;
                                        case 946682530:
                                            str4 = "ۧۦۜۘۨ۠ۛۖۖۦۘ۬ۧۤۧ۬ۥۘ۠ۚۙۦۛ۬۫ۘۤ۬ۥۥۙ۟۠ۧۤۨۘۘۦۢ";
                                            break;
                                        case 2147208869:
                                            str4 = "ۗۘۜۘ۟ۧۦۦ۟ۛۤۡۚۧۙۥۘۙۜۦۜۜۦۡۗۥۘ۫ۧۗۥۡۥ";
                                            break;
                                    }
                                }
                                break;
                            case 1179708163:
                                str = "۟ۛۧۡۤۦۘۖۘۡۚ۠ۥۗۖۛۖۙۜۜۚ۬ۖۧۡۘۡۦۥۘۡۤ۬ۗۡۘۙۨۧۗۛۜۘ۠ۙ۬";
                                continue;
                        }
                    }
                    break;
                case -418771396:
                    linearLayout2.setVisibility(i);
                    str = "ۛۦ۟۠ۡۧۘۡۚۨ۬۠ۦۦۙۡۨۘۘۨۥۘۧۖ۬ۖۢۨۘۖۘۨۘ۟۫ۗۚۨ۬ۛۘۘۘۦۚ۟ۥۘۘۜ۠ۥۤۡۘۘ۬۠ۜۘ";
                    continue;
                case -384790147:
                    str = "ۥۘۚ۟ۚۡۘۗۚۡۛۙۤۢۘۡۙۜۘۤۜ۬ۨ۠ۢۘ۬ۤۘ۫ۡۘۜۢ۟ۘ۟ۖۛۚۙۢ۟ۦۘۛ۟ۡۘۧۘۥۘ";
                    continue;
                case -72095695:
                    return;
                case 239720402:
                    str = "ۗۜۡۘۚۖ۫ۡۦۘۗۥۗۜۘۗۙۙۜۥۜۙۡۘ۟۟۠ۧۖۥۛ";
                    i2 = 8;
                    continue;
                case 540534212:
                    OooooO0(1);
                    str = "ۚۘۧۛۤۜ۟ۙۖۜۙۛۥ۟ۘۘ۫ۨۨۤۘۖۘۜ۠ۛۘۙۙۘ۬ۛۛۚۦۘۖۦۖۚۡۙۗۦۡۘۙۚۙۚۖۘ";
                    continue;
                case 743588689:
                    String str6 = "ۖۛۖ۫۟ۛۥ۬ۚۜۥۘۘۦ۠۟ۚۨۘۘۦ۠ۧۙۖۨ۠ۜۧۚ۫ۘۜۗ۫ۨۘ۬ۛۦ۠ۢۘۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 878959724) {
                            case -918870081:
                                str6 = "ۦۥۡۛۙۥۘۜۧ۬ۤۘ۟ۘۨۦۘۜۚۘۗ۟ۧۗۨۧۘۢ۠ۗۨ۬ۦۘ۫ۛۢۙۜۘ۬ۖۤۢۗۘۛۗۡ۠۬ۥۘ۠۠ۢۡۜۤ";
                                break;
                            case -609619718:
                                str = "ۜۦۨ۬ۖۘۡۦ۟ۥ۠ۢ۫ۜۛۤۧۧ۟ۖۖۙۤۦۦۥۨ۫ۡۘۘۧۗۨۘ۟ۧۦۥ۬ۚ۬ۗۧۙ۫۠ۨۥۖ";
                                break;
                            case 1383281748:
                                break;
                            case 1997034380:
                                String str7 = "۫ۜۨۘ۠ۧۦۜۛۥ۫ۜۦۘۧ۬ۧۖ۠۫ۘۤۢۨۚۤ۠ۙۨۜ۫۫ۙ۬۠ۦۥۧۛۦۧۗۖۦۘۗۢۤۦ۫ۦ";
                                while (true) {
                                    switch (str7.hashCode() ^ 537505948) {
                                        case -1431566044:
                                            str6 = "ۘۨۤۖۛۜۘۡۤ۫ۤۤۚۙۥۡۘۜۧۤ۬۫ۤۖۘ۬۟ۘۘ۬ۖ۠۟ۙۡۘۡ۟ۦۛۘ۬ۖۢۜۘۗۘۚۗۜ";
                                            break;
                                        case -47113701:
                                            str7 = this.o0OoOo0.getVisibility() == 8 ? "ۥۜۥۗۜۧۥۚ۟۫ۘۨۘۘۢۦۘ۫ۙۤۨۖۡۘۙۧۧۡۘۛۜۡۛ۫ۜۘۨۚ۬ۚۢۘۦۗۗ" : "۬ۖۖۨۦۖۧۨۧۖۚ۟ۢۙۡۘ۬۫ۢ۬۬ۧۥ۬ۤۤ۬ۦ۫ۜۨۘۜۖۖۜ۫ۡۛۦۨۘۧۧۤۢۛۜۥ";
                                            break;
                                        case 603968988:
                                            str6 = "ۤۘۤۗۛ۟ۙۨۙ۬ۥۥۡۡۧۘۘۡۥۘ۬ۙۢۚۚۧۧۢۧۦ۟ۙۛ۬ۧۥۖ۟";
                                            break;
                                        case 1841305652:
                                            str7 = "۬ۧۨۗۖۘۘۧ۠۬۟ۨ۫ۚ۠ۥۘ۠ۜ۬ۙۤ۟۠ۦۧۙۖۥۘۥۚۦ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 830489157:
                    str = "ۢۧۙۨۗۖۘ۬ۜۡ۬ۡۜۘ۫ۘۖۗۚ۠ۗۚ۫ۘۚۖۘۦۡۧۚۨۡۘۘ۫ۥۘ۟ۘۚۗ۫ۧۡ۠۫ۛۛۡۘۡۡۥۘ۟ۤۛۘۘۛ";
                    linearLayout2 = linearLayout;
                    continue;
                case 1037882681:
                    str = "ۢ۟۟ۢ۠ۚۗۤۧۤۧۤۗۦۘۚۖۦ۟۠ۗۖۢۖۦۡۘۘۗۨۧۘۚ۫ۧۙۙۘۘۚ۬۫ۚۙۡۘۜ۟ۙۜۖۦۧۙۢۜ۫ۛ";
                    i = 0;
                    continue;
                case 1497836655:
                    sb.append("changeToolBarState1:");
                    str = "ۦۢۨۘۥۥۦۡ۟ۦۘۙۖۡۡ۫ۥۘ۫۬ۗۤۧۦۗ۬ۡۛۧۤۤۖۙۢۘۚۦۤۢۗۛۡۡۤۨ";
                    continue;
                case 1623677309:
                    sb.toString();
                    str = "ۥۜۖۡ۬ۥۘۘۖ۟ۚۙۛۙۥۜۘۜ۟ۦۨۛۥۘ۟ۤ۠۫ۧ۫ۧۡۛ";
                    continue;
                case 1907170822:
                    linearLayout3 = this.o0OoOo0;
                    str = "۬ۨۦۧۢۨۘ۟ۚۘۘۖ۫ۢۗ۫ۦۖۨۨ۫ۧۜۘۧۧۦۢۨۧۘۘۨۢۢۨ۫ۛ۬ۥ";
                    continue;
                case 2043016971:
                    linearLayout = this.o0OoOo0;
                    str = "ۨۛ۫۬ۜۧۘۥۙۨۦۥۥۘۦۖ۟ۛ۠ۥۘۘ۠ۥۜۘۧۘۧۦ۬ۦ۬۫ۤۥۡۜۘ۠ۥۨۧ۟۬";
                    continue;
                case 2083940749:
                    str = "۬ۗۨ۬ۢۙۙۥۤۥۜۥۜۙۨۗۡۦ۟ۢۘۥ۫ۨۘۛۙۚ۫ۥۖۘۧۛۨ۠ۥۧۘۤۛۧۛۛۖۦ۠ۚۡۗۜ";
                    i = i2;
                    continue;
            }
            str = "ۛۦ۟۠ۡۧۘۡۚۨ۬۠ۦۦۙۡۨۘۘۨۥۘۧۖ۬ۖۢۨۘۖۘۨۘ۟۫ۗۚۨ۬ۛۘۘۘۦۚ۟ۥۘۘۜ۠ۥۤۡۘۘ۬۠ۜۘ";
        }
    }

    public void Oooo0O0() {
        String str = "۫ۚ۟ۧۦۦۘۚۙۡۘۧ۠ۥۘۤۙۥۘۥۚۡۜ۬ۘۖۛۜۘۢۨ۬ۖ۟۠ۦۢۘۚۧۨۘۜۜۡ۠ۤ۟ۢۗۜۡ۫ۡۘۨۘ۠۠۟۠";
        while (true) {
            switch ((((str.hashCode() ^ 60) ^ 116) ^ 434) ^ (-435035370)) {
                case -1496515025:
                    this.OoooooO.setOnTouchListener(this.o00000);
                    str = "۫ۛۦۘۡۤ۟۠ۗۤۖۛۙۘۡۘ۠ۛ۫ۦۗۧۦ۟ۖۢۢۜ۫ۨ";
                    break;
                case -1257597828:
                    String str2 = "ۖ۠ۧۦۡۤ۫ۜ۠۬ۙۚۨۡۜۘۨۖ۫ۤ۟ۡ۫ۛ۟ۧۡۛۤۘۧۘۥۦۗ۟ۙۖۘۨۥ۫ۖۨ۫ۦۤۤۥ۠ۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 301544042) {
                            case 199650669:
                                str = "ۥۙ۠۠ۙۜۗ۟ۥۘۥۜۧۥ۬ۙۚ۫ۢ۟ۖۚۙ۬۫ۜۧۘ۬ۙۨۦۤۢۢۡۦۗ۫ۜۘۛۦۖۘ";
                                continue;
                            case 529623205:
                                str2 = "۫ۜ۫ۨۢ۫ۚۡۘۖۢۨۨۛۨۘۙۦ۫ۥ۬ۚ۠ۤۡۖۗۥۘۖۜۡۘۦۙۘۧۤۥۘۚۗۘۘۚ۬ۦۙ۬ۦۧۧۡۘۦۙۙ۫ۧۜۘ";
                                break;
                            case 1748422848:
                                str = "ۚۡۛۘ۟ۢ۠ۙۥۛ۠ۨۦۢ۫۫۬۠ۖۚۦۧۧۖ۬ۜۡ۠ۤۨۖۗۢۙۚ۟ۥۘۚۜۨ۠ۚۧ۫۟۫ۚۗۦۥۨۘۘ";
                                continue;
                            case 2115509515:
                                String str3 = "ۛۨۧ۫ۚۚۤۥۡۘۡۧۛۜۧ۫ۨۗۛۡۖۧۘۚۧۜۘۗۢۦۨۤۖ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1314236754)) {
                                        case -871233368:
                                            str3 = getVisibility() == 8 ? "ۧ۟۟۠ۤۘۘۤ۟ۨۖ۟ۜۘۨۙ۠۠ۨۦۧ۫ۛ۫۬ۘ۬ۨۙۦۢۘ۟ۥۨۦۖۜۘ۫ۙۜۘ۬ۨۘ۫۬ۤۛۚۘۘ" : "۫ۡۦۘۧۦۖۦۖۡۤۨۧۦۘۦ۟۠ۥۘۚ۬ۢۨۙ۠ۘۡۘۙۙۜۦ۟ۖۘۚۤ۫";
                                            break;
                                        case -313389465:
                                            str3 = "ۛۤۛ۬۫ۢ۟ۛۘۤ۠ۦۥۦۖۡۘۨۘۖۙۘۖۧ۫ۜۨۜۘۗۧۜۘۗ۫ۙۦۥۨۘ";
                                            break;
                                        case 303736240:
                                            str2 = "ۙۢۛۙ۫ۖۘ۫ۦۨۘۥۨۙ۬ۥۧ۠ۜۤۤۛۢۘۨ۬ۨ۠ۥۘۚۨۡۛۘۜۚۘۙۦۡۘۥۨۛ";
                                            break;
                                        case 1857571005:
                                            str2 = "۟ۗۧۚۤۦۘۚ۫ۙ۠۬ۚۤۚۨۘ۫ۡۘۙۡۗۥ۬ۧۗۨۘ۫ۜ۬ۚ۫ۚۨۡ۬ۨۧۜۘ۬ۚ۬ۜ۫ۤ۫ۡ۟ۛۤۦۘ۠ۡ۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 78675667:
                    str = "ۡۨۖۥۥ۫ۙۥ۬ۗۛۖۘۘ۫ۖ۫ۚۢۢ۬۫ۤ۠ۤ۫ۢۨۢۘۧۘۧ۠ۡۜۨ۠۬ۦۥ۫ۥۧ";
                    break;
                case 1192763657:
                    String str4 = "ۙۜۨۛۥۗۗۗ۟ۢۚۖۛۧ۟ۗ۫ۖۘۧۧۚ۬ۛۘۘ۬ۡۦۢ۠ۡۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-492602146)) {
                            case -1199023263:
                                String str5 = "۬ۦ۠ۖۜۥۧۙۖۘۤۖۖۛۢ۫ۜۦۢۧۦۨۘۥۨۖۘ۠ۘۦۥۚۜۦۜۘ۟ۙۨۘۙ۟ۦۥۗۡۥۨۗۤۚۖۥۚ۠ۜۡۦ";
                                while (true) {
                                    switch (str5.hashCode() ^ 793891219) {
                                        case -1851407361:
                                            str4 = "ۜۢۚۚۤۘۚۚۖ۟ۢۜۥۗ۬ۖۨۥۘ۠ۘۘۖۜۥۘۤۨۨۙۙ۫ۚۨۘۚۗۨۖ۬۟ۡۢ۟۫ۡۤۦ۫ۛ";
                                            break;
                                        case -901625042:
                                            str5 = "ۛ۟ۦۘۧ۬۫۟۬ۜۘۢ۬ۜۘۦۙۡۖ۫ۖۛۨۜۘۨۡۦۘۥ۠ۨۘۛۥۧۘ";
                                            break;
                                        case -631906698:
                                            str5 = this.o00000OO != 0 ? "ۤۛۚ۫۟ۘ۠ۛۥ۫ۛ۬ۡۙۨۘ۟۠ۖۘۦۘ۟۠ۖۚ۫ۛ۠ۧۡ۟ۦ۬ۦۖۗۗۥۜۘۦۢ۬ۜ۫ۡۡ۬ۜۡۜۘۨۢۦ" : "ۛ۬ۡۘ۬ۘۤ۟ۦۙۜ۠ۤۖۚۥۘ۠ۥۗۤۖۨۗۨۖۗۦ۬ۗ۫ۨۗۨۤۖۜۜۘ";
                                            break;
                                        case 1128725153:
                                            str4 = "۬۫ۨۦۥۜ۬ۧۥۘ۬ۡۘۧۙۖۘۧ۬ۦۖ۬ۖۘ۟ۜۗۖ۟ۡۘۡ۟ۥۘۧۛۜۘۙۢۚ۟ۛۛۧ۬۫ۖۛۤۥۡۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case -742822091:
                                str = "۫ۛۦۘۡۤ۟۠ۗۤۖۛۙۘۡۘ۠ۛ۫ۦۗۧۦ۟ۖۢۢۜ۫ۨ";
                                continue;
                            case 1215782722:
                                str4 = "۠ۨۗۚۥۡۘۡۖۧۘۛ۬ۡۘۖ۟ۦۘۥۗۥ۫ۡۥۢۗۜۘۥۛۨۢۧۘ";
                                break;
                            case 1830091990:
                                str = "ۘۖ۬ۗۢۖۙۘۛ۠۟ۜۘ۬۫ۨۘۥۨۙۘۥۥۡۗۜۗ۠ۥۘۘۤ";
                                continue;
                        }
                    }
                    break;
                case 1614116460:
                    return;
                case 1752004237:
                    setVisibility(0);
                    str = "ۥۙ۠۠ۙۜۗ۟ۥۘۥۜۧۥ۬ۙۚ۫ۢ۟ۖۚۙ۬۫ۜۧۘ۬ۙۨۦۤۢۢۡۦۗ۫ۜۘۛۦۖۘ";
                    break;
            }
        }
    }

    public void Oooo0OO() {
        DialogC4309r6 dialogC4309r6 = null;
        String str = "ۢۛۥۘۧۘۚۤۨۖۖ۠ۨۘ۠ۧۘۙۘۧۚۗۨۘ۟ۘۥۘ۟ۧ۠ۖۡۚۡۖۖۘۢ۟ۢ";
        while (true) {
            switch ((((str.hashCode() ^ 706) ^ 571) ^ 452) ^ 674534677) {
                case -1631166906:
                    return;
                case 52351800:
                    dialogC4309r6 = this.o00ooo;
                    str = "ۢۚۖۨۢۨۘۢۖۚۤۢ۠۟ۨۧۥۧۡۛۖۥۨۤ۟ۥۤۛۦۦۜۨۛۡۛۘۘۚۨۢۨۙۜۡ۠۟ۜۚۥۘۤۜۖۚۘ۬";
                    continue;
                case 240788533:
                    String str2 = "ۤۨۛۢ۬ۢۤۚۜۘ۠ۦ۫ۧۧۗۢۖ۫ۦ۫ۗ۠ۡۧۘ۠ۡۜۘۡ۟۬ۧۤۦۙۛۜۨۡۧۢۦۘۧۧۤۛۙۧ۟ۦۨۘۗۛۚ";
                    while (true) {
                        switch (str2.hashCode() ^ 1381461893) {
                            case -1519509432:
                                break;
                            case -789792649:
                                str = "ۖ۟ۗۛۖۨۡ۟ۦۘۖۤۥۚۦۨ۟۟ۡۨ۠ۛۤۘۧۤۥۘۚۦۨ۟ۡۤۨۢۥۘۜۢۛۡۛۤ";
                                break;
                            case 1139363190:
                                str2 = "ۤۡۨۛۖۧۘۗۡۦۘۡۚۧۨۤۗ۫ۧۦۢۖۚۡۡۛۨۢۡۘۛ۠ۜۘۛۥۥۘۥ۠ۙۤۗۜۘ۠ۜۨۜ۫ۨۘۨ۠ۤۧ۬ۢۢۗۘۘ";
                                break;
                            case 1668794273:
                                String str3 = "ۢۚۢ۟ۢۦ۠ۡۥۘ۫ۢۢۖ۫ۥۛۗۤۧۙ۠ۢۦۖۗۧۙۛۘۚ۫۠ۙۘۦۨۙ۬ۢۥۨۤۙۡۘۢۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1175663544) {
                                        case -1504705662:
                                            str2 = "ۗۦۙۙ۠ۥ۬ۡۚۦۚۡۘۦ۫ۚ۫ۛۖ۠ۥۦۦ۠ۚۜۨۚۧۙۜۘۢۧۗۧۢۚۨۘۚۦۖ۬ۘ۬۟ۢۥۖۘۧۗۘۘ۫ۨۡ";
                                            break;
                                        case -1104065305:
                                            str3 = dialogC4309r6.isShowing() ? "ۙۦۘۘۧ۠ۚ۠ۦۘۚ۬ۘۘۛۗۤۧ۠۬ۙ۫ۖۘۜۨ۫ۤۗۜۘۗ۟ۖۘۧۦۧۚۨۘۗۧۥۛۨۘۘ۟ۖ۟ۤۙۘ" : "ۨۨۥۚۤۤۢۨۛۥۗۡۜ۫ۚۤۗ۫ۙۘۘۧۨۤۡ۠ۜۦۛ۟۬۫ۧۥۘ۟ۢ۠۠۬ۢ";
                                            break;
                                        case -654658343:
                                            str2 = "ۥۛۛۧۡۙ۟ۦ۠ۗۛۜۘۦ۠ۢۚۦۧۘ۠ۘۗ۫ۡۧ۟ۖ۫۟ۚۤ";
                                            break;
                                        case 213588010:
                                            str3 = "ۡۗۗۖۧۡۜۘۖۘۦ۬ۖۥۢۦۘۧ۟ۨۥۘۨۘۡۨۚ۫ۦۥۘۨۚ۬";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 353077616:
                    str = "ۚۨۗۤۙۘۚۚۘۗ۬ۡ۬ۜۘۛۘۘ۠ۡۖۧ۬ۘۚۧۦۘ۬ۚ۠ۨۨۘۘۨۡ۬۟۬ۘ۠ۧۧ۫۠ۖۥۘۨۘۘۨۘۨۘۘ";
                    continue;
                case 423793463:
                    String str4 = "ۨۙۨۘ۬ۜۜۧۡۢ۠ۜۘ۫ۦۙۛۥۨۘ۠۫ۛ۠۟ۗ۫ۥۢۡۨۨ";
                    while (true) {
                        switch (str4.hashCode() ^ 678228300) {
                            case -715049226:
                                String str5 = "ۢۖۛ۬ۢۥۘۚۛۥۛۗۥۡ۫۠ۖۖۗ۬ۦۖۢۥۤ۠ۦۧۗۧۤۖ۠ۜۦۘۧۖۖۘ۫۟ۛۢۦۘۛۨۦ";
                                while (true) {
                                    switch (str5.hashCode() ^ 74512467) {
                                        case -990797859:
                                            str4 = "ۧۨۨۢ۬۫ۤۖۨ۫ۙۛۗۖۨۛۛۘۘۖۦۥۘۤ۬ۥۘ۟ۖۖۧۦۙۥۧۖۨۙۤۤۡۢ۬ۤۢ";
                                            break;
                                        case 645708919:
                                            str4 = "ۦۧۡۧۘۧۘ۟ۘۡۥۥۨۘۗۘۜۘۘۘ۟ۡ۬ۡۚ۟ۘۘۨۡۧۚۧۡ";
                                            break;
                                        case 1431840726:
                                            str5 = dialogC4309r6 != null ? "۫۟ۜ۠ۦۙۗۖۨۘۧۢۦۘۙ۬ۥۘۜ۟ۥۧۗۨ۬ۘ۟ۢ۠ۜۘۤۙۨۘۘ۠ۥۜۧۖۘۧ۫ۤۢۦۨۘ" : "ۛ۬ۘۘۚۚۥۘۡۡ۠ۘ۠ۜ۟ۖۥۘ۠۠ۖۢ۫ۨۘۧۚۘ۠ۗۢ۟ۡ۟ۡۙۖ۠ۖۤۚ۠ۦۧۙۗ۠۟۬ۜۛۦۡ۠ۜۘ۠ۚۘۘ";
                                            break;
                                        case 1790479530:
                                            str5 = "ۙۛۨۘ۟ۦۥۘۧۧۥ۠ۦۖۘۖۙۜ۠ۤۙۥۘۛ۬۟ۦۙۦۨ۠ۘۘۨۤۙۢۥۘۘۗۜ۟۬ۙۘ";
                                            break;
                                    }
                                }
                                break;
                            case 552779257:
                                str4 = "ۙۛۡۦۨۦۘ۠ۗ۠ۡۛۦۘۧۜ۠ۗ۫ۥۘۜۘۘۘۗۖۡ۟ۢۡۨۡۥۘ";
                                break;
                            case 1739006968:
                                str = "ۡۖۜۘۥۖ۟ۦۧۧۥ۟ۛۘۘۘۘ۫ۨۛۘ۫ۡ۟ۘۡۖۘۘۤۤۘۘۢۦۦۤ۫ۖۦۢۗۗۢ۠";
                                break;
                            case 2114713849:
                                break;
                        }
                    }
                    break;
                case 496457994:
                    this.o00ooo.dismiss();
                    str = "ۢۡ۫ۡۥۘۘ۠ۘۘۘ۫ۛۜۖۤ۬ۗۨۛ۫ۡۙۥ۠ۙۚۥۙۗ۠ۜۘۨۙۧۢۧۧۚۤۛۡۦۦۧۧۦۡۦۘۤ۫ۡ۬ۗۢ";
                    continue;
            }
            str = "ۢۡ۫ۡۥۘۘ۠ۘۘۘ۫ۛۜۖۤ۬ۗۨۛ۫ۡۙۥ۠ۙۚۥۙۗ۠ۜۘۨۙۧۢۧۧۚۤۛۡۦۦۧۧۦۡۦۘۤ۫ۡ۬ۗۢ";
        }
    }

    public void Oooo0o() {
        String str = "ۚۡۜۖۦۘۚۗۤ۫ۛۢۘۢۜۘۡۚۨۜۢۥۤۥ۠ۚۤ۫ۨ۫ۧۚۥۘۘۨۨۗۙۦ۬ۙ۟ۗۗۛۦ۠ۜۧ";
        while (true) {
            switch ((((str.hashCode() ^ 5) ^ 357) ^ 968) ^ (-1409134451)) {
                case -1355246670:
                    return;
                case 244030426:
                    this.o00Ooo = null;
                    str = "ۘۙۗۨ۫ۥ۟ۤۡۘۢ۬ۨۘۨۛۖۘۚۦۙۙۡ۬۬ۦۘۘۗۜۛۜۜۥۘ۟ۗۙ۟ۦۘ";
                    break;
                case 1179222516:
                    this.o00o0O = null;
                    str = "ۛ۫۠ۤۧۜۘۘۙۚ۟ۗۜۘۙۦ۫ۘۧۤۢ۫ۘۘۦۤۘۘ۬۫۟ۧ۟ۘ۬ۘۡۘۙۚ۠ۚۦۜۘۢ۫ۖۘۥۢۢۘۜۦۙۘۥۘۗۤۦ";
                    break;
                case 1591073756:
                    str = "ۢۜۡۘ۟ۤۥۘۖۙۖۘۗ۠ۤ۬۫ۦ۟ۙۦۘۤۦۨۛۡۗۥ۟ۥ۠ۢۖ۠ۡۗۢ۫۬ۚ۫۬۟ۚۛ۠ۚۨۘۛۨۜۘ";
                    break;
            }
        }
    }

    public /* synthetic */ void OoooO() {
        String str = "ۥۡ۫ۤۜۧۘۦ۬ۦۘ۬ۜۖ۟ۢۗۨۗۖۗۙۨۘۦۚۚۧۨ۫ۛۨۚۢ۬۠ۗۧۥ";
        while (true) {
            switch ((((str.hashCode() ^ 531) ^ 398) ^ 956) ^ 1703712645) {
                case -679775133:
                    OoooO0O();
                    str = "ۢۦۙ۫ۜۧ۫۟ۘۘ۟ۚۤۦ۫ۤۚۚ۟۠۬۟۬۬ۧ۟ۗ۠ۦۖۨ۬۬ۚۥۦۦۘۗۤ۫ۗۘۡۢۨۚۖۢ";
                    break;
                case 373167181:
                    return;
                case 1906571593:
                    str = "۠ۧۨۧۢۘۘ۟ۨۡۘۥۘۦۢۥۘۘۗۗۡۘۧۘۘ۠ۚۗۨۖۗۦۜۨۘۥۖۥۚۤ۫ۜۨۥۨۙۜۘۥۗ۫ۨۛۢ";
                    break;
            }
        }
    }

    public void OoooOOo() {
        String str = "ۚۤۧۥۢ۟ۘۦۛۤۜۘ۬ۚۜۘۥۢۨۘۜۢۚۜۗ۠ۛۡۛۨۦ۬";
        while (true) {
            switch ((((str.hashCode() ^ 228) ^ 424) ^ 437) ^ (-57012173)) {
                case -1266331331:
                    OoooOOO();
                    str = "ۢۜ۟ۡۖۦۘ۠ۤۜۘۢۥ۬ۚ۠ۘۘۙ۠ۤۛ۠۟ۘۚۗۗۛ۠ۖۘۘ";
                    break;
                case 703616146:
                    OooooO0(1);
                    str = "ۛۜۢۖۜۧۘۘۛۡۘۘۦ۫ۗۦۢۦۡۨۘۘۢۛۙۡۙۗۡۧ۟ۙۥۘۦ۠۫۟ۜۗ۫ۜۦۥ۠ۚۡۢۦۘۧۚۥ۬ۤۘۘ۠ۛۚ";
                    break;
                case 894485959:
                    this.OoooOoo.y = C4491w3.OooOoo0(getContext()).y / 4;
                    str = "ۦۦۖۚۗۘۦۦ۫ۚ۫ۡۚۘۨۥۛۨۜۨ۟ۙ۠ۨ۬ۛۜۥۗ۠";
                    break;
                case 962818277:
                    this.o000000o.start();
                    str = "ۡۥۛۡۗۤ۬ۥۦۘۡۢۡۜۛ۟ۦۦۙ۫ۡۨۘۧۘۗ۬ۚ۬ۖ۫ۘۛۥۙ۟ۖۛۨۙۨۘۘۚۥۗۛۥۘۚۡۡ۫ۧۘ۬۬";
                    break;
                case 971344952:
                    this.OoooOoo.x = C4491w3.OooOoo0(getContext()).x - this.Ooooooo.getLayoutParams().width;
                    str = "ۡۘۥۘۨۚۤۚۦۜ۬ۥۚ۫ۨۨۦۖۨۦۥۜۧۚۦۤ۫ۥۛۡۜ۫۠ۖۘۨۦۡۘۨ۬ۙۡۘۙ";
                    break;
                case 1254804243:
                    str = "ۛ۬ۘۡۥۛۗۙۛۜۘ۟ۛۨ۟ۥ۬ۦۦۛۛۗۜۛۦۜۨ۟ۜۘۢ۠ۧۡۦۥ";
                    break;
                case 1279425035:
                    this.OoooOoO.updateViewLayout(this, this.OoooOoo);
                    str = "۟ۨۖۡۦۡۘۚۡۘۢۙۖۚ۠ۗۦۚۢۜ۫ۙۨۖۥۘۧ۫ۚۤ۫ۡۘۚۛ۠ۤۚ۬ۖۧۡۘۜ۟ۜۘۜ۫۠ۛۚۘۙۦۗ۠ۙۦۘ";
                    break;
                case 1294236568:
                    this.o0OOO0o.OooO0Oo();
                    str = "ۡۥۦۘ۟ۥۨۘۚۡۙۥۗۢۗۥۘۜۡۢ۠۠ۗۘۦۧۛ۫ۡۘۜۥۖ۫ۜۤۖۤۤ۟۫۬ۢۖۢ";
                    break;
                case 1726086482:
                    return;
            }
        }
    }

    public void OoooOoo() {
        DeleteFloatView deleteFloatView = null;
        String str = "ۢۨۚۤۛۘۘۤۚۘۘۥۤۗ۟ۘۡۙ۬ۙ۠ۥۨۘۖۖۖۘۤ۠ۦۨۡۦۘ";
        int i = 0;
        int i2 = 0;
        int visibility = 0;
        while (true) {
            switch ((((str.hashCode() ^ 268) ^ 804) ^ 542) ^ (-243675244)) {
                case -1669674324:
                    str = "۠ۖۚ۬ۧۦۘۢ۫ۗۙۘۘۧۨۘۘۨۢۜۧۨۗۖۘۙ۠ۢۥۘۛۦۜۘۘۜۘۘۤۤۨ";
                    break;
                case -1557413188:
                    setVisibility(i);
                    str = "ۦۗۡ۫ۨۘۘۚۘۤ۠ۧ۫۬۬ۧۖۥ۟۫ۘۘۦۛۦ۠ۜۤۛۙۗ۠ۢۡۘ۫ۥ۬ۗۙۖۢۥۥۧۗۧ۟ۢ۠ۗۦۜۘۙۥۤ";
                    break;
                case -1418602272:
                    String str2 = "ۙ۫۫۟۫ۙ۫۬ۡۖۨۢۥ۬ۗۙۜۢۢۜۢۚۛ۠ۗۢۚۡۘۗ";
                    while (true) {
                        switch (str2.hashCode() ^ 2059478424) {
                            case -1929098493:
                                String str3 = "ۥۢۦۘ۟ۦۗۢۙۧ۬۫ۜۘ۬ۛ۫ۥۚۗۘۤۖۘۦۦۡۤ۫ۥۘ۫۫ۜۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 97550520) {
                                        case -928630463:
                                            str3 = visibility == 0 ? "۫ۜۧۘۘۦۨۘ۫ۦۢ۫ۙۧۢۦۖۜۘۘ۫۬ۥۥۨۡۘۡ۫ۜۤ۟ۗۖ۬ۖۘ۟۟ۖ۬ۘۡۘۛۥ۫" : "ۥ۬ۢۢۖ۟ۨ۠ۨۥۗۜۘۛۦۙۜ۬ۙۥۧۗۚۖۢۧۦۛ۟ۨۘ۠۟ۚ۫ۛ۠";
                                            break;
                                        case -190048902:
                                            str2 = "ۜ۟ۡۢۨۥ۫ۖۜۘۙۢۢۨۧۦۦۘ۠ۡۙۚۥ۫۬۬ۥ۠۬ۧۢ۫ۨۘۘۡۧۢۚۘۡ۟ۡۘۛۦۤۚۦۡۢ۟ۚۗۥۜۘ";
                                            break;
                                        case 431160336:
                                            str2 = "ۖۤۥۘ۬ۛۨۘۢۤۡۙۥ۠۠ۘۢۘۙۚۚۨۖۘۨۖۦۘۥ۠ۦۛ۫ۜ۟۟ۜۨۚ";
                                            break;
                                        case 1217277140:
                                            str3 = "ۙ۠ۡۘۦۧۧ۫۬ۘۘۥ۟ۜۘ۟ۤ۠ۙ۬ۚۙ۬ۖۘۧۚۙۨۙۨۘۚۙۦۘۥۙۖۜۧۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case 151904051:
                                str = "ۨۖۜۨۙۖۚۦۜ۬۬ۙ۬ۦۥۘۙۗۘۘۗۡۧۘۥۤ۠ۚۘۧۘۧۦۦۖۚۙ۟۫ۧۜۦۧۗۧۦۘۚۛۜۘ۬ۜۡۘۖۧۖۜۛ۠";
                                continue;
                            case 1336488749:
                                str = "ۘۜۧۘۤۦۘۘۖۘۡۘ۟ۜۡۘۡ۟۫ۦۦۦۤۜۚۢۙ۟۠۠ۥۘۘۧ۬۠ۤۨۘ۬۬ۡ۫ۛۢ۫۫ۗ";
                                continue;
                            case 2017466337:
                                str2 = "ۤ۫ۧۧۥۖۘۘ۟۫ۘۥۜۘۥۦ۟ۦۥۜۘۢۡ۫ۡ۠ۦۜۥۖ۬ۛ۠";
                                break;
                        }
                    }
                    break;
                case -1035716844:
                    OoooOOO();
                    str = "ۧۖۢ۬۠ۨۤۢۥۘۨۛۛۥۦۧۘ۠۟ۛ۟ۦۡۥۘۚ۠ۦۧۨۡۦۤ۫۠۠ۦۛ";
                    break;
                case -985284345:
                    deleteFloatView.setVisibility(8);
                    str = "ۧ۟ۚۙۥۘۘۛۖۗۜۖۥۘۤۗۨۘۦۢۜۦ۫۫ۙۜ۟ۧ۫۟ۛۛۜۥۘۖۜۨۦۘۧ۟ۘۘۥ۬ۢ";
                    break;
                case -863440332:
                    str = "ۤۜۥۘۚۤۢۗ۠ۢۡۡۚۦۨۡۘۨۚۥۘۤۥۜۚۡۥۘۡۚۢۧۡ۫ۜۥ۬ۘۘۧۛ۬ۘ۬ۡۥۢۥۨ۟ۦۨۘ";
                    i = 0;
                    break;
                case -835288420:
                    OooooOO(C4491w3.OooOoo0(getContext()).x, C4491w3.OooOoo0(getContext()).y / 4);
                    str = "ۖۚ۠۠ۘ۟ۜۤۖۘ۫۠۟ۡۖۙۛۥ۟ۦۤۢۜۙۧۢ۫ۧۙ۫۟ۛۙ۫ۚۛۥۘۦۖۙۨۦۦ۫ۧۨۘۢۧۘۘ";
                    break;
                case -570826647:
                    this.o000000o.start();
                    str = "۫ۙ۫۠۠۫ۘۛۘۥۥۨۙۖۨۧۡۦۘۧ۟ۛۗ۟ۜۥۘۘۘ۟ۢۛ";
                    break;
                case -502210995:
                    str = "۫۬ۖۘۨۖۥۘۤۛۛۨۡۥۨۛۢۗۚۖۘۢۗۤۤۦۧ۬ۡۘۨۥۧ";
                    i2 = 8;
                    break;
                case -343909593:
                    str = "ۤۜۥۘۚۤۢۗ۠ۢۡۡۚۦۨۡۘۨۚۥۘۤۥۜۚۡۥۘۡۚۢۧۡ۫ۜۥ۬ۘۘۧۛ۬ۘ۬ۡۥۢۥۨ۟ۦۨۘ";
                    break;
                case 351720766:
                    Oooo00o(false);
                    str = "ۤۥۥۘ۠ۛۖۛۡ۠ۖۗۘۘۡۤۘ۟ۘۡۘۤۚۗۤۖۖۘۤۖۥ۠ۚ۫ۗۙۦ۟ۦۘۘ";
                    break;
                case 512904809:
                    return;
                case 798959403:
                    str = "۬ۗۖۡۘۘۘۢۜۦۘۖۨۤۢۚۨ۠ۛۡۘ۫ۢۜ۬ۜۨۘ۬ۥۦۘۧۖۦ۠ۨ۬۠ۗۗۨ۫ۨ۬ۖ۟ۡۖۛۗۢۥۦۦ۠ۧۢ";
                    break;
                case 1080105945:
                    str = "ۜۛۙۗۖۡۡۘۥۘۘ۠۫ۨۛ۫ۜۦۦۘۨ۫ۖۖ۠ۨ۫ۜۥۘۙۗۦۤۘۜۧۚ";
                    i = i2;
                    break;
                case 1407791243:
                    deleteFloatView = this.o0OOO0o;
                    str = "ۡۘۨ۬ۨۧ۬۬ۢ۟۬ۦۘۖۚۙۥۗۡ۠ۦ۠ۙۛ۠۬۫ۦ۟ۗۨۜۘۜۥۖۘ۫ۘۨۦۧۜۙۛۚ۟ۢ۫ۧۘۨۘۨ۬ۙ";
                    break;
                case 1420394219:
                    visibility = getVisibility();
                    str = "ۡۡۜۘۗ۟ۥۘۦۢۛۚ۟۫ۛۦ۠ۨۧ۫ۘۛۥ۫ۤ۫ۖۨۢ۟ۦۘۘۤۘ۟۟ۚۨۘۗ۠ۙۖۥۥۜۙۨۘ۠ۥۦۜۛۚۖۜۡۘ";
                    break;
            }
        }
    }

    public void Ooooo00() {
        String str = "ۧۖ۟ۢ۫ۨۘۦۖۙۨ۠ۤۤ۠۬۬ۦۡۘۚۨۚۘ۬ۜۢۦۢۙۡۢۦ۟ۜۙۚۛ۟ۨۛۛۖۜ";
        int i = 0;
        ImageView imageView = null;
        int i2 = 0;
        ImageView imageView2 = null;
        int i3 = 0;
        ImageView imageView3 = null;
        while (true) {
            switch ((((str.hashCode() ^ 709) ^ 286) ^ 369) ^ 743107818) {
                case -1719437248:
                    str = "ۡۚۙۡۜۧۘۗۥۗ۟۠۫ۦ۫ۜۘۡۗۖۢۢۢۖۤۨۘۙۢ۠ۦۡۚۗۜۦۦۨۜۘ۬ۧ۠۬ۙۘۤۖۛۦۧۘ";
                    imageView2 = imageView;
                    break;
                case -1073529500:
                    str = "ۜۡۥۡۧۛۤۦ۬ۡۗۡۘۛۜۘ۠ۢ۟ۙۨ۬ۧۡۥ۠ۘۙۚۡۥ۟ۡۥۧۤ۫ۙۜۘۙ۬ۦۚۜۜۦۨ";
                    i2 = i;
                    break;
                case -1060418977:
                    String str2 = "ۚ۠ۖ۬ۛۨۘۛۦۘۦ۟۠ۧۗۖ۬۟ۤۛۗۗۚۧۦۘۧ۬ۦۘ۠۫ۙۦۨۡۘ۠ۧ۟۫ۥ۫ۢۚۘۢۡۦۘۙۨۗ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1195871757)) {
                            case -214308406:
                                str = "۬ۙۥۡۧۨۘۖ۠ۘ۠ۨۘۘۙۜۖۘۜ۬۠ۢۘۚۜۘۦۘۚۨ۬ۘۘۜۘۨۧۜ۬ۙۛۖۦۜۘۦۨۘۨۚۨۘۛۨۗ";
                                continue;
                            case 175778883:
                                str2 = "ۘۦۙۢۤۨۘ۫۟ۡۘ۟ۛۘۨۙ۠۫۠ۨۥ۠ۥ۬ۤ۟ۖۡۘۨ۟۠ۙۨۚۜ۠ۡ۟۟ۜۘ۬ۜۥۖ۠ۙ۫ۗۘۜۡۨۜۦۦۘ";
                                break;
                            case 471487465:
                                String str3 = "ۚۜۦۘ۬ۥۘۘۨۦۨۘۧ۠۫ۛ۫ۤ۟ۨۡۘ۠ۦ۬ۡ۬ۖۦۚۥۨۡۗۛۚۨۘۨۡۙۚ۫ۤۢۜۘۘۥۙۛۡۤۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 2081707499) {
                                        case -1695040422:
                                            str2 = "۬ۦۧۘۜ۫ۧ۟ۛۨۘۥۥۖۘۡۢۜۘۛۖۚ۟ۡۗۦۘۢۛ۟ۜ۟ۧۡۚۦ۟ۛۙ۬۬۟ۥۜۥۘۗۦۧ۟ۢ۟ۚۖۖۢۤۥۘ";
                                            break;
                                        case -1609474435:
                                            str2 = "ۦۙۘۘۘۗۗ۬ۚۥۛۖۢۖ۬ۚۥۗۛۘۧۢۥۗۡۜ۟ۙ۬ۖۡۜۦۜ۟ۖۡۡۤۛۦۗۛ۠ۥۢۥۨۘ";
                                            break;
                                        case 1383921323:
                                            str3 = "ۨ۟ۜۧۢۢۥۜۘۡۡۦۘۡۢۦۘۡۗ۠ۙۧۥۘۖ۟ۗ۫ۨۚۦۤ۫ۜۛ۫ۦۨ۬۠ۥۤ۟۬ۨۚۦۗۘۤۗ";
                                            break;
                                        case 2111672882:
                                            str3 = C3718b7.OooO0Oo().OooO0OO == 3 ? "ۧ۫ۥۘۜۡۧۘ۫ۛۡۘۥ۟ۢ۠ۜۧۘۘۖ۠ۚۢۦۛۨ۫ۚۖۨۘۡۤۖۛۗۘۨۙۧۦۥۗۤ۬" : "ۘ۠ۖۜ۟ۨۢ۟ۢۙ۫ۚۛۜۧۦۤ۟۠ۦۜۘۚۛ۠۠۟۟ۖۧۜۦۛۛ۟۫۟۠ۛ۬ۛۚ۬ۦۨۘۧ۬ۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 2034485503:
                                str = "ۙ۬ۡۘ۟ۚۦۘۥۚۖۢۢۜۧۢۨۘ۠ۙۨۖۗۧۢ۬ۘ۫ۜۘۨۙۘۘۚۤ۠۠ۦ۫ۜۗۨۙۧۙۜۘۘۜۘۘ";
                                continue;
                        }
                    }
                    break;
                case -783884993:
                    this.o000000o.start();
                    str = "ۚۗۖۨۚۨۤۜۚ۠۠۬ۤۢۢۧ۟ۨۘۨ۠۬ۘ۠۬ۡ۫ۦۤۨۥۘ";
                    break;
                case -518125845:
                    str = "ۛۜۜۘ۟ۨۖۨۘۨۧۜۦۘۡۥۡۘۡۖۘۦ۟ۤۤۥۖۚۥۥۖۖۘۘ";
                    i2 = i3;
                    break;
                case -490295701:
                    imageView3 = this.OoooooO;
                    str = "ۛۨ۬ۚۧۚۤ۟ۥۗ۟ۜ۟ۥۚ۠ۥۘ۠ۜۦ۠۫ۦۗۜۖۧۜۡۘۙۦ۟ۛۤ۬ۤ۬ۗۖ۫ۡۘ";
                    break;
                case -302422050:
                    return;
                case -192135533:
                    str = "ۜۤ۠ۧۖ۠ۡ۠ۙۡۥۜۘۢۨۡۘۙۘۙۚۘۡۗ۟ۥۤۢۢۖ۬ۚۢۗۚ۟ۛۨۥۚ۬۠ۘۘۗۙۥۘۥۛۨۘ۟ۖۛ۫۟ۜ";
                    break;
                case -145953289:
                    Oooo00o(false);
                    str = "۟ۘۨۘۜۡۖ۬ۥۘۦۧ۠۬ۜۘۘۤۡۜۘ۟۠ۤ۠ۙۜۘۧۛۡۡ۫۟ۢ۬۟ۤۥۚۡۧۘۤۨۨۘ";
                    break;
                case 299993189:
                    OoooOOO();
                    str = "۫ۖۤۘۧ۠ۤۧ۫ۜۙ۟ۡۘۜ۫ۛۙۖۚۨۖۧۘ۬ۖۡۘۜ۫۫ۧۛ۟ۡۚۗۦۛۡۖ۟۟";
                    break;
                case 303303738:
                    imageView = this.OoooooO;
                    str = "ۚ۟ۦۘۖ۠ۥۘۥۦ۟ۨۛۦ۠ۚۢ۫ۦۜۘ۬ۜ۠۫ۥۥۘ۟ۥۢ۟ۦۖۖۨۖۡۦۢۛۤ۠ۨۤۢۦۜۜ۟ۖۤۦۘۜۧۦۥ";
                    break;
                case 401467114:
                    String str4 = "ۧۙۧۛۙۘۘۨۚۧۡۛۤ۠ۙۛۗۜۧۘۦۗۙۥ۟ۦۘۥۧۚۖۘۛۧ۫ۦۡۧۙۤۖۤ۠۫ۦۘ۟ۜۘۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1698912310)) {
                            case -1885780337:
                                str = "۠ۨ۬ۖۙ۠ۚۛۥۘ۫۬ۜۚۤۦۗ۠ۢۥۙ۟۬ۘۖۘ۠ۢۨۘ۠۫۠ۜۧۘۘ۠ۜ۠ۚۙۦۘۚۨۢ";
                                continue;
                            case -957017233:
                                str4 = "ۡۖۦۧ۫ۤ۫ۥۡۘۜۦۖۘۥۚۙۢۨۜۘ۟ۜۤۦۥ۫۠ۗۤۘۢۧۖ۟ۜۘۢۡۘۘۙۨ۠ۡۜۦ۠ۧۗۥ۬ۡۘۨۘۖۘۥۦۤ";
                                break;
                            case 788500668:
                                String str5 = "۟۫ۗۛۦۘۡۦ۫ۧۦۤۢۥۜۘۜۡۖ۫۟ۤۚۡ۬۫ۖۢۗۤۦۤۢۥۥۜۥۘۜ۟ۦ۠ۙۡۘۛۜۜۘۧۤۜۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1395201056) {
                                        case -1312828290:
                                            str5 = "ۘۗ۠ۗۨ۠ۘ۠۠ۤۨۢۚۛۥۤۖۘۨ۬ۙۖۗۡۘۡ۬۟ۘ۬ۖۘ۫ۘۥۨۜۡۘۡ۫ۦ۟ۡۜۘۙۦۨۘۛۥۖۘ";
                                            break;
                                        case -1023843232:
                                            str5 = C3718b7.OooO0Oo().OooO0OO == 2 ? "ۖۧۙۨۥۛۚۘۨ۬ۙۤۢۛ۟۬ۨۘ۟ۥ۬ۥۦۦۦۚۢۧۡ۫ۛۢۜۘ۬ۤ۟ۘۜۡۡ۟ۜۤۖۚۥ۠ۗ" : "ۡۡ۫ۜۗۨۘۥ۟ۤۙۥۜۡۘ۠ۤۛ۟ۚۨ۠ۥۜ۠ۜۘۙۧۜۙ";
                                            break;
                                        case 368248185:
                                            str4 = "ۚۛۛۜۦۖۥۜۧۘۨۗۚۦۘۗۥ۟ۨۥ۟ۛ۟ۢۦۜۗۦۖۦۖۙۖۙۛۤۛۙۨۖۦۗۙۖۗۡۦۧۘ";
                                            break;
                                        case 381554387:
                                            str4 = "۬ۤۘۗۤ۬ۜۡۜ۬ۡۦۙۘۗۥۧۨۧۦۡ۠ۙ۠ۛۡۗۚۜۙۛۚۧ۬۟ۗۘۧۜۡۗۚ";
                                            break;
                                    }
                                }
                                break;
                            case 1917970618:
                                str = "ۘۦۘۘۙۚ۠ۘۖۙۨۖۛۨۢۢ۬۟۬ۘۜۜۘۘۖۦۘۘ۠۠ۥۥ۫۠ۘۢ۠ۖۛۦۢۧۧۦۧۘ";
                                continue;
                        }
                    }
                    break;
                case 429422523:
                    str = "ۛۘۥۜۥۡۧۘۖ۬ۖ۟ۖ۟ۗ۟۫ۚۦۘۘ۬ۢۜۚۜۨۥۗۘۘۚ۠ۡۡۨۥۥۖۦۧۢۦۘۥۡۥۘ۠ۤۥ";
                    imageView2 = imageView3;
                    break;
                case 623693405:
                    imageView2.setImageResource(i2);
                    str = "ۜۤ۠ۧۖ۠ۡ۠ۙۡۥۜۘۢۨۡۘۙۘۙۚۘۡۗ۟ۥۤۢۢۖ۬ۚۢۗۚ۟ۛۨۥۚ۬۠ۘۘۗۙۥۘۥۛۨۘ۟ۖۛ۫۟ۜ";
                    break;
                case 683123301:
                    i = R.drawable.elfin_normal1;
                    str = "ۖۙۗۘۥۘۜ۠۬ۜۖۙۢۡۗ۫ۡۘۦۚۨۢ۟ۜۘ۬ۦۧۘ۟ۢۧ";
                    break;
                case 702334931:
                    str = "ۢۢۤۖ۠ۧ۠ۗۥۘۜ۬ۘۘ۠۟۟ۧۨۧۧۥۘۛۘۥۚۦۧۨ۠ۥۦۤۜۥۧۥۗۚ۠ۤۢۛۥۢۖ۫ۢۛۧ۬ۚۢ۠";
                    break;
                case 1122743573:
                    i3 = R.drawable.elfin_pause1;
                    str = "ۡۨۡۘۥۡۘۦۗ۟ۦ۠ۖۘۛۚۖۘۙۡۚۤۜۤۘۜۦۢۖ۠۟ۥۨ۟ۚۧۤۨۙ۟ۦ۫ۙۘ۟ۦ۫ۡۤۦۘۙۙۦۥۗۥۘ";
                    break;
                case 1632476489:
                    this.OoooooO.setImageResource(R.drawable.elfin_run1);
                    str = "ۚۨۧۤۖ۠ۡۡۘ۟ۤۜۘ۠ۙۚۦۜۤۡۚۨۘۖۙۨۘۧۚۧۡۘ۬ۥۖۗۛۘۡۘۥۚۥۘۧۥۦ۟ۢۨۥ۫";
                    break;
                case 1969318935:
                    str = "ۡۚۙۡۜۧۘۗۥۗ۟۠۫ۦ۫ۜۘۡۗۖۢۢۢۖۤۨۘۙۢ۠ۦۡۚۗۜۦۦۨۜۘ۬ۧ۠۬ۙۘۤۖۛۦۧۘ";
                    break;
            }
        }
    }

    public void OooooOO(int i, int i2) {
        WindowManager.LayoutParams layoutParams = null;
        String str = "ۘۜۢۛۨۢۘۚۘۤ۬ۨۛۦۙۗۖۘۘۥۧۦۚۚۥۨۘۦۘۨ";
        while (true) {
            switch ((((str.hashCode() ^ 976) ^ 151) ^ 897) ^ (-304866775)) {
                case -1959339482:
                    return;
                case -1659795445:
                    this.OoooOoO.updateViewLayout(this, layoutParams);
                    str = "ۥ۫ۨۥۥ۬۬ۙۜۤۖ۬۫ۡۘ۠۬ۚۗۙۦۘۙۡۡۘۚۦ۫۟ۚۢ۬ۨۧ۠ۖۖ۬ۨۖۘ۬۟۫";
                    break;
                case -1636957840:
                    layoutParams.y = i2;
                    str = "ۛ۠۬ۚۖۨۖۜۖۘ۠ۜ۠ۤ۠ۡۡۡۖۗۢ۬ۘۧۢۘۖۘۘۨۛ۠ۗۛ۠ۧۜۘ۫ۘۧۥۥۦۘۖۤۤۥۙۜ۠۬ۙ۫ۗۛ";
                    break;
                case -1468936298:
                    str = "ۛۨۜۘۡۚ۬ۤۧۦۨ۬ۜۨ۫ۦۖۜ۫ۢۗۘۢۥۧۘۛۘۚ۟ۥۚ";
                    break;
                case -778124702:
                    str = "ۜۗۚ۠ۧۜ۬۠ۥۚ۬ۢۧۘۦۨۙۥۘۡ۟۠ۗ۬ۜۘۦۡۥۢۢۡۘۥۛۦۜۦۙ";
                    break;
                case -647682597:
                    layoutParams = this.OoooOoo;
                    str = "ۧۢۨۘ۬ۜۗۗۘ۠ۢ۠ۜۘۧۜ۫ۤۦۖۘۧۤۖۖۧۥۥۗۙۖۜۧۘۤۧۚ۬ۨۛۧ۟ۥۘۙۗۥ";
                    break;
                case -383431106:
                    str = "ۖۖ۬ۨۛۖۛۦ۫ۙۦۖۢۤۧۗ۠۠ۨۘۨ۟ۨۘۢ۟ۜۤۨۤۖۙۦۘۚ۠ۧ۠ۡ۫ۘۗۘۖۧۘۖ۫ۜ۬ۡۨۘ۫ۘۧۘ";
                    break;
                case 1837603233:
                    layoutParams.x = i;
                    str = "ۢۡۨۧۖۡۜۚۜۘۧ۠ۜۜۖۢۥ۬ۤۚۧۥۙۙۗ۫ۦۘۜ۫ۦۘۖۦ۟ۢۖۚۖۖۢۧۧ۫ۚۙ۬ۛ۠ۡۘۥۡۨۘۨ۟ۡ";
                    break;
            }
        }
    }

    @Override // android.view.View
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams getLayoutParams() {
        String str = "ۘۘۤۛۦۗۥۛۨۘۧۙ۫ۙۡۗۛۧ۫ۙۗ۠ۘۨۘۡ۠۬ۢۛۨۘۨۘۜۘۘۧۘۘۜۙۨۘ۬ۤۨ";
        while (true) {
            switch ((((str.hashCode() ^ 670) ^ 473) ^ 314) ^ (-1175706447)) {
                case -979675937:
                    str = "ۧۘۘۘۡۗۥۘ۬ۗۚۙ۠ۥ۠۟ۡۘ۫ۧۘ۫۬ۡۜۨۘ۬ۨۖۗ۬ۘۙۢۛۚۘۥ۠ۨۖ۫ۨۖ";
                    break;
                case 1537793822:
                    return getLayoutParams();
            }
        }
    }

    @Override // android.view.View
    public WindowManager.LayoutParams getLayoutParams() {
        String str = "ۜۤۛۡۧۜۘ۟ۗۦۛۢۘۛۜۤۤۤۤۜۦۘۘ۟ۛۘۘۘۛۖۘۦۚۘۚۗ۟۠ۦۛ";
        while (true) {
            switch ((((str.hashCode() ^ 96) ^ 436) ^ 596) ^ (-1738846207)) {
                case -876653431:
                    return this.OoooOoo;
                case 1060402866:
                    str = "ۨۚۜۘۚۧ۠ۥۨۖ۬ۜۘۘ۠ۖ۫۟ۤۜۡۥۧ۟ۧۛۢ۠ۧۖۦۘۘ۠ۡۘۧۢ۟۠ۖۢ۠ۢ۠";
                    break;
            }
        }
    }

    public void o000oOoO(float f, int i, int i2) {
        ImageView imageView = null;
        View.OnTouchListener onTouchListener = null;
        ImageView imageView2 = null;
        View.OnTouchListener onTouchListener2 = null;
        ImageView imageView3 = null;
        View.OnTouchListener onTouchListener3 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        LinearLayout linearLayout = null;
        LinearLayout linearLayout2 = null;
        int i7 = 0;
        int i8 = 0;
        ImageView imageView4 = null;
        int i9 = 0;
        ImageView imageView5 = null;
        int i10 = 0;
        ImageView imageView6 = null;
        int i11 = 0;
        ImageView imageView7 = null;
        int i12 = 0;
        String str = "ۥۢۥۘۖ۠ۦۧۛۧ۬۠ۦۘۨۖۡۘۢۘۗۤۘۡۗۨ۬ۡۖۘۖۦۨ۫ۚۦۘۖۖۢ";
        while (true) {
            switch ((((str.hashCode() ^ 141) ^ UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_VIEW_VALUE) ^ 171) ^ 2126110971) {
                case -2115802394:
                    str = "ۛۖۡۘۛۡۚۜ۟ۚۤۦ۬۫ۦۙۗۖ۠ۘۚۛۧۦۘۖۧۦۘۧ۫ۙۢۗۛۤۛۡۘ۬۟ۚ۫ۚۜۛۧ۟۟ۤۖۘ";
                    break;
                case -1988586293:
                    str = "ۙۙ۬ۡ۠ۜ۬ۘۧۘۥۗۚ۫ۨ۠ۚ۫ۘۘۥۢۚۨۧۦۨۛ۫ۙۘۛۤۘۛۢۤ";
                    imageView7 = imageView6;
                    break;
                case -1986566676:
                    String str2 = "۟ۗ۟ۥۥ۠ۛ۠ۡ۟ۗۘۤۚۖۚ۬ۡۜۨۨۘ۫۬ۚۜ۟۬ۨ۬۠ۗۡۘ۫ۘۧۗۜۧۘۡۨۥۛۚۜ۫ۥۘۤۤۦۘۥۦۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1951966906) {
                            case -1529731291:
                                str = "ۗۤۙۖ۬ۤۢۧۨۢۚ۟ۨۤۡۘۥۜۦۘۚۜۛۥ۟ۘۛۖۦۗۖ۫ۚۘۘۡۨۜۘ۬۠ۦۘۘۘۦۘۨۖۗ۫۬۫";
                                continue;
                            case -1100187227:
                                str2 = "ۦۘۧۥۘۘۘ۬ۥۘ۠ۤ۬۠ۛۙۙۜۦۘۘۜۨۘۡ۬ۘۘۙۦۥۤۜۚۨۜ۬ۖۤۚ";
                                break;
                            case -403959303:
                                str = "۫ۗۖۦۗ۬ۢ۬ۡۦۢ۬ۚۨۘۖ۫ۜۘۡۡۧۘۧۚۖ۟۬ۗۥۡ۬ۦۜۘ۟ۙ";
                                continue;
                            case 1416060998:
                                String str3 = "ۛ۬ۘۘ۫۠۟ۘۤ۬۬ۘ۠۬ۦۤۧۙۙۢۛۦۘۥۜۙۚۗۧۥۥۦۘۖ۠ۜۗۨ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1586514568) {
                                        case -477092292:
                                            str3 = i2 == 0 ? "ۡ۠ۦۛ۟ۖۘۘۜۡۘۗۢۗ۬۫ۗ۠۠۫ۨۘۜۘۛۦۛۡۛۧۤۥۥ۠ۗۗۚۨۤۗۢۗۗۘ" : "ۗۛۤۘۖ۟ۡ۬۫ۖۖۗۛۙۙۖ۠ۗۧۘ۟۟ۘۖۚۗۚ۬ۧۛۤۛ۬۬ۦۤ۬۬ۦۗۦۘۡۤۤۛ";
                                            break;
                                        case 716227910:
                                            str2 = "ۙۢۢۚۗۦۥۖۨۘۧۤ۬ۛۥۦۘ۫ۗۡۖۙۥۗۖۘۘۦۥۤۢۥۢۘۦۧۘۗۚۥ";
                                            break;
                                        case 1170046507:
                                            str2 = "ۨ۟۬۟۟ۦۡۗۨۥۘۘۘۡۥۨۙ۬ۖ۫۠ۜۦۛۦۘۜۜۗۙۚۜ۠ۢ۠۟ۛۡۜۢۨۜۙۡۘ۬ۢۚۚۦۧۘۨۙ۬ۥۛ۟";
                                            break;
                                        case 1410028251:
                                            str3 = "ۖ۠۟۠۫ۜۘۗۖۨۘۧ۠ۖۘ۬ۙ۬ۗۦۜۢ۠ۜۥۡۡۘۜۡۜ۬ۛ۬۟ۡۡۥۘۥۡ۫ۖۘۦ۫ۦۥۛ۬۬ۘۦ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1927967736:
                    i3 = 0;
                    str = "۫۫ۘۛ۫ۘۡ۫۟ۙۙۜۖۘ۟ۖۤۙۗۚۤۜ۫ۜۘۦۛۤ۠ۤۤۖ۬ۢ۫ۡۛۡ۬ۢۖۖۡۘۚۦۘۛۥۢ";
                    break;
                case -1874886275:
                    imageView = this.OoooooO;
                    str = "ۤۢ۟ۚ۫ۢۨ۟ۚۗۗ۬۫ۜۥۘۦ۫ۤ۫ۦۘ۬ۖۘۖۤۚۗۖ۫";
                    break;
                case -1714924288:
                    str = "ۥۦۥۘۨۡۜۧۢۖ۟ۨ۬ۙۥۘۨۜۡۢۧۖ۟ۦ۫ۤۙۥۥۨۚۚۘۚ۬ۗۤ";
                    i12 = i9;
                    break;
                case -1636458059:
                    str = "ۢۧۜۚۙۨۘ۫ۡۧۛۚۤۥۢۨ۫ۨۘۙۘۜۘۢۗۘۘۘۨۨۢۧۨۘ";
                    imageView7 = imageView5;
                    break;
                case -1563290463:
                    i7 = 1;
                    str = "ۧۖۡۛۜۧۘۗۨۖۥۤۡ۠ۥۖۘ۟ۨۜۤۤۛۢۚ۟۟ۨۙۜۦۛۖۥۛۜۨ";
                    break;
                case -1452546706:
                    String str4 = "ۦ۫ۙۘۧۥۘ۠ۦۨ۬ۚۛ۠ۧۙۗۖۙ۟۠ۖۗۖۧۘۤۜۤۗۤۥۘۥۜۨۘ۫ۡۖۘۗۥۨ۠ۙ۟ۥۡۨۖۥۘۘ۬ۜۡۢ";
                    while (true) {
                        switch (str4.hashCode() ^ 1776916181) {
                            case -1560416562:
                                str = "ۘۘۥۢۚۨۘۛۡۡۘۡۖۤۘ۟۠ۜۘۦۛۧۧۢۧۢۗۘۨۛۗۥ۠۟ۚۢۨۨۘ۬۟ۡۙۖۧۜ۟ۜۙۨۘۨ۠ۜۘ۫۬ۘۘ";
                                continue;
                            case -78352956:
                                String str5 = "ۜۛۡۡۦۤۥۧۘۚۘۖۘۗۚۡۘ۟۟۟ۖۨۨۡۢۡۚۦۥۘۗ۟ۤۢۤۖۜۚۘۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1371867236) {
                                        case -294227842:
                                            str4 = "۫ۤۛ۠ۘۜۗ۟۟ۢۘۥۨۨۨ۠ۛۖۧۨۦۘۦۤ۟ۡۙۢۤۥۘ";
                                            break;
                                        case -270959978:
                                            str5 = "ۚۜۚۢۜۜۘۢۥ۠ۧۗۘۛۙۖۘۙۛۨۘۨ۬ۢۗۨ۠ۨۚۗۜۢۥۘۙ۠ۖ۠ۚۡ";
                                            break;
                                        case 1954761935:
                                            str5 = i != 0 ? "ۡۦۘۘۤ۟ۖۗۤۦۥۚۘۘۖۜۧۘۗ۬ۨۘۧ۫ۡۘۨۢ۫ۧۡ۫ۧۗ۬ۦ۠ۢۜۨۙ" : "ۛۘۡۘ۟۬ۥۥ۠ۡۢۘۗۡۥۦۜ۬ۘۗۛۚۡۖۨۦ۟ۘۜۤۡۘ";
                                            break;
                                        case 2138483032:
                                            str4 = "ۗۡۧۘۗۙۘۤۨۢۙۜۖۧۚۧۚۧ۠۟ۘ۬ۥۧ۠ۖۢۗۙۢۢۥۘۜۛۖ";
                                            break;
                                    }
                                }
                                break;
                            case 372653001:
                                str = "ۡۘ۠ۘۚۨۘۘۚ۬ۨ۫ۙۦۗۧۨ۠ۡۘۛۘۨۘۙۡۗۦۨ۠ۗۧۡ";
                                continue;
                            case 1965068187:
                                str4 = "۫ۛ۟ۦ۟ۛۛۙۤ۟ۘۧ۬ۜ۠ۢ۬ۘ۟ۨ۫ۗۢ۬ۙۡۘۖۜۦۜۚۖۨ۬ۧ۫ۢۖۧۚۘۘۤۙۢ۬ۙ";
                                break;
                        }
                    }
                    break;
                case -1429676106:
                    onTouchListener = null;
                    str = "۠ۖۤۖۚۜۘ۟۠ۧ۠ۚۘۘۨۤۚۗ۟ۚۛۘۢۙۢۖۡۡۥۖ۬۫۠ۨۦۘۡۢۜۘ";
                    break;
                case -1381393834:
                    str = "ۦۘۘۘۨۦۘۢۢۨۘۖۦۦۙۦۜ۟ۦۦۚۢۤ۟ۨۚۛۙۧۢۨۥۘ";
                    i12 = i10;
                    break;
                case -1224712157:
                    onTouchListener2 = this.o00000;
                    str = "۫ۗۨۚۨۦۗۚۢۙۢۥ۫ۘۘۘۧۖۦ۫ۘۘۧۧۛ۫۫ۤۡۘ۫ۢۦ۬ۨۚۜۘۤۜۧۘۦۖۙ";
                    break;
                case -1212707099:
                    i11 = R.drawable.elfin_normal1;
                    str = "ۤۜۡۛۨ۠ۧ۟ۧۙۗ۟ۡۦۘۨۛ۬ۡۚۡۥۖ۬ۘۚۢۖۤۧ";
                    break;
                case -1211075627:
                    linearLayout.addView(linearLayout2, i8);
                    str = "۬۫ۡۘ۫ۤ۠ۡۤۨۘۚۨ۫ۤ۬ۖۘ۠ۛ۠ۘۛۖۘۥۥ۬ۤۘۥۚۚ۠۬۠ۨ۬۫ۥ۟ۗۢۢ۠ۢۜۙ۬۟ۤ";
                    break;
                case -1156746801:
                    this.o0OOO0o.OooO0o();
                    str = "ۚۙۤۛ۟ۜ۬ۙۜۘ۠ۢۘۘۤۨۡۥۙۦۢۡ۬۟ۥ۟ۗ۟۟ۢۥۨۘۖۤۡۘۙ۫۫ۦۘۨۘۨۨۦۙۨۘۙۘ";
                    break;
                case -1009569355:
                    linearLayout2 = this.o0OoOo0;
                    str = "ۦۢۧۙ۠ۡۘ۫ۖۥۘۖ۫ۖۨۙۥۘ۬ۜۘۚۘۜ۟۬ۢۚۙ۬ۗۤ۟";
                    break;
                case -916911413:
                    str = "ۙۥۥۘۥۧۘۚۖۙۜۤۜۘۧۖۥۢۙ۬۠ۧ۬۬ۖۛۧ۠ۤۜۘۚۖۖۘۘ۟ۨۙۛۦۚۖۛۡۖۧۘۥۤ";
                    i6 = i4;
                    break;
                case -913431110:
                    return;
                case -890343696:
                    i5 = C4491w3.OooOoo0(getContext()).x;
                    str = "ۦۙۨۘۗۡۜۘۚۡۗۘ۟ۥۤۖۤۜۧ۬۟۠ۚۧۦۨۧ۠ۘۘۛۜۗ۬ۜۘۘۜ۬";
                    break;
                case -794458998:
                    str = "ۘۦۖۘۖۦۥۘۥۜ۫۠ۨۘۘۙۙۚۢۤۦۦۘۥۘۜ۫ۜۙ۬ۦۘۗۘۤۦۖۢۥۥۡۜۢۧۧۥۨۘ۟ۨۜۘۡۙۥۦ۫ۤ۬ۜۙ";
                    imageView7 = imageView4;
                    break;
                case -763620233:
                case 202221274:
                    str = "ۘۦۖۘۖۦۥۘۥۜ۫۠ۨۘۘۙۙۚۢۤۦۦۘۥۘۜ۫ۜۙ۬ۦۘۗۘۤۦۖۢۥۥۡۜۢۧۧۥۨۘ۟ۨۜۘۡۙۥۦ۫ۤ۬ۜۙ";
                    break;
                case -646276439:
                    str = "ۢ۟۠ۥۦۘۤۥ۫ۘۚ۠ۗۗۦ۫۠ۧۜۡۗۦۢۙۡۥۥۘۦۤۨ";
                    break;
                case -482613757:
                    String str6 = "ۦۢۦۘۦۧۡۘ۫ۥۥ۬ۥۘۡ۬ۡۧۛۢۚ۫ۙۦۤۧۨۦۧۘۗۢ۬ۦۧۜۘۨۥۢۡۛۦۖۡۧ۬ۧۙۤۡۜۘ۟ۛۖۘ۟ۥۦ";
                    while (true) {
                        switch (str6.hashCode() ^ (-18487639)) {
                            case -2019784275:
                                String str7 = "ۙۦۡۦۤ۟ۤۡۨۘۢۥۦۙۗۢۥ۠ۖۢۙۡۘ۠ۚۘۘۡۥۛۡۚۜۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-866578020)) {
                                        case -1876156231:
                                            str6 = "۫ۡۙۙۜۡۢۥۦۡۡۡۘ۫ۚۤ۠۫ۥۘۧۨ۬ۧۖۘۙۦۦۘۢۢۧ";
                                            break;
                                        case 308123576:
                                            str7 = this.o0OOO0o.getVisibility() == 0 ? "۟ۜۨۘۨۖۡۘۘ۟۟۬ۘۧۦۤۧ۫۬ۡۘۛۢۖۘۜۜۚ۠ۨۜۘ۠۫ۜۘۨۡۙۖۗۛۢۖۖۤ۬ۗ" : "ۛۡۛۜۚۗۧۧۖ۟ۦۖۡۥ۫ۡۗۖ۬ۨ۬۠۟ۛۗ۬ۥۘۛ۠۬ۦ۟ۨۗ۠ۖ";
                                            break;
                                        case 527636875:
                                            str7 = "ۙۤۜۡۖۗۡ۫ۖۖۥ۠ۚۦۧۛۙۥ۠ۗۥۘۧۛۙ۟ۚۥۦۘۤۤۚ۬ۚۡۧۥۦۢۨۗ";
                                            break;
                                        case 1784490087:
                                            str6 = "۟۠۫ۜۨۡ۫ۨۖ۟ۛۖۘۡۡۤۚۘۢۥۜۧۤۢۛۦۙۜۘۥۚۤۖۜۘ۠ۙ۠۟۬ۘۘۤ۫۟ۢۜ۟ۢۨۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case -923201953:
                                str6 = "ۘۡۖۚ۬ۡۘۨۥۚۖۢۦۤۛ۬ۚ۟ۖۘۗۚۢۡ۟ۜۢۦۡۤۘ۟ۙۚۗۤۧۜۘ";
                                break;
                            case -679983113:
                                str = "ۚۙۤۛ۟ۜ۬ۙۜۘ۠ۢۘۘۤۨۡۥۙۦۢۡ۬۟ۥ۟ۗ۟۟ۢۥۨۘۖۤۡۘۙ۫۫ۦۘۨۘۨۨۦۙۨۘۙۘ";
                                continue;
                            case 1712192406:
                                str = "ۦۘ۬ۥۤ۬ۙۙۘۤۦۡۖۗۥۜۛۡۤۢۘۜۙۨۘ۠۫ۨ۟ۥۢ";
                                continue;
                        }
                    }
                    break;
                case -479721365:
                    i4 = 0;
                    str = "۬۠ۚۜۨۡۘۦۚۚۖۧ۠ۧ۫۬ۛۛ۬ۧۤ۫ۥۚ۟۟۫ۧ۬ۤۢ۬ۖۗ۫ۦۥۚۨۘۢۖۗ۬۫ۛ۬ۥۦۘ۬ۤۨۨۥۧۘ";
                    break;
                case -287600822:
                    str = "ۧ۟ۦۦۖۡۘۜۙ۟ۢۤ۬ۗ۫۫ۖ۟ۜ۬ۡۘۛۦۜۘۗۗۧۧۦۘ";
                    break;
                case -10423757:
                    linearLayout = this.Ooooooo;
                    str = "ۤۤۤۙ۬ۘۗ۟ۧۖ۟ۗۦۤۦۘ۬ۧۘۢۘۗۚۦۜۘ۫ۤۡۘۖۢۘۖ۫ۡۘۛۢۥۨۗۘ۬ۧ۠ۘۘۘۥۥۚ۬۟ۜۛۤۢ";
                    break;
                case 53240233:
                    OooooOO(i6, (int) ((C4491w3.OooOoo0(getContext()).y * f) - getHeight()));
                    str = "ۥۦۖۘ۟ۛۢۖ۠ۨ۟ۘۜۙۥۨۧۥۘۤۦۡۢۙۦۤ۬ۦۘۛ۫ۗۥۜۖ۠۫ۢ";
                    break;
                case 118284005:
                    str = "ۙۚۗۢۢ۠۫ۘۖۘ۫ۨۚۥۛ۟ۘۖۜۘۙۜۥۗۤۗ۬ۧۘۘۡۘۨۢۧۖۘۡ۫ۨۘ";
                    i8 = i7;
                    break;
                case 138727746:
                    str = "ۦۧۜۚۤۛۧۚۘۥ۬ۘۘ۫ۗۘۘۧۧۡۤۖۘۡ۬ۥۤ۫ۚۚۨۘۨۤ۠ۦۡۡ";
                    i6 = i5;
                    break;
                case 178027986:
                    str = "ۚۡۦۘ۫ۦۡۗۥۡۘۥۦ۠ۛ۟ۡۘۥ۠ۢۢ۠ۥ۠۬ۜۘۗۨۢۗۜۧۘۤۗۢۜۦۖۘ";
                    imageView3 = imageView;
                    break;
                case 236672562:
                    imageView2 = this.OoooooO;
                    str = "۟ۚۜۘۚۢۗۥۙۘۗۙۚۘۘۘ۬ۡۗۚ۟۟ۥۨۖۘۦۡۖۘۧ۟ۚۘۜ۫۠ۤۡۘۖۢۙۜۗۘۡۤۥۘ۠ۘۖۘ";
                    break;
                case 298642371:
                    i9 = R.drawable.elfin_run1;
                    str = "ۙ۟ۤۗۖ۠ۖۡۘۡۚۤ۠ۘ۠ۢۥ۠ۗۨۦۘۦ۠ۤۖۗ۟ۤۨۨۢ۟۠ۜۘۦۡۧۤۡ۟ۢۗ۟ۧۡۜ۠۬ۢۜ۟ۖۘ";
                    break;
                case 333171974:
                    imageView5 = this.OoooooO;
                    str = "ۚۤۜۘۘۘۗۜۧۘۧۢ۬ۤۗۖۘۗۥۦۘۚ۠ۖۚۢ۠۟ۡۘ۠۟ۚۤۧۦۘ۫ۦۜۘ";
                    break;
                case 518781489:
                    String str8 = "۠۫ۡۘ۫ۘۖۘۚۧۛۗۚ۬ۤۥ۟۟ۖۦۘۤ۫ۦۘ۟ۢۙۗۚۘۘۨۤۜۖ۫۫ۜۢ۠ۙۥۘۖ۠ۧ";
                    while (true) {
                        switch (str8.hashCode() ^ (-76046156)) {
                            case -825277579:
                                str8 = "۠ۦۦۨۡۡۡ۫ۜۘ۟۫ۡۘۢۧۘۘۖۚۘۜۛۥۙۚۜۢۖۦۤۘۖ";
                                break;
                            case -358697993:
                                str = "۫ۛۥۦ۬ۚۚۚۨۘۙ۠ۨۤ۠ۤۙۢ۫ۢۨۙۧۚۤۦۗۙۘۙۛۦۦ۬۬ۗۥ۟ۥۨۥ۫ۤ";
                                continue;
                            case 304192033:
                                str = "۬۫ۧۘۨۨ۠ۤۙ۠۠ۖۘۡۥۜۘۢۘ۬ۦ۟ۨۜۘۧۤۖۚۙ۟ۡۛۛۢۙ۬ۤۖۧۖۛۙۨۜۧۤۡۧۘۜۙۨ۬ۨۘ";
                                continue;
                            case 1540608068:
                                String str9 = "ۨۜۜۘ۟ۢۨۥۜۜۖۢۘۡۘۘۨۡۘ۫ۗۛۘۗۘۗۡۚۦۤۥۘۘ۟ۢۢۡۥۚۚۥۨۘۥ۟ۨۡۨۢ۟ۛۦۘ۠ۘۤ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-722191645)) {
                                        case -1029356397:
                                            str9 = "ۢۘۥۘ۟۬ۥۘۦۤۨۘۡ۠۫ۛۛۜۛۦۧۗ۫ۘۘۤۤ۫ۡ۬۟ۙۖۤۨۢۡۘۛۥۡۤۜۚۘۦۧۗۤۖۘۘۨۛۘۛ۟۟ۜۡۘ";
                                            break;
                                        case 637151324:
                                            str8 = "۟۟ۖۘ۬ۥۧۙ۠ۛۡۘۘۗۨۧۘۦ۠۟۬ۗۧۤۢۖۘۢۖۜۙۧۥۦۙۜۘۡۨۖۨۧۘ۫ۤۦ۬ۙۡۙۨۥ";
                                            break;
                                        case 1060412031:
                                            str8 = "ۥۚۘۘ۬ۛۤ۫ۢۖۗۜۜ۬ۨۧۘۨۗ۟ۧۡۥ۫۠ۙۧۛۗ۠ۨۦۘۤۧۡۧ۠۟";
                                            break;
                                        case 1345474503:
                                            str9 = C3718b7.OooO0Oo().OooO0OO == 2 ? "ۗۡۖۡ۬۠۟۟۫۬ۘ۠۫ۢۛۡۥۖۘۘۚۖ۟ۗ۠ۛۗۜۘۚ۟ۗ۟ۨۨۙۖۖۘ" : "ۙۤۚۢۢ۫ۚ۫ۘ۬ۘۡۘۘۘۚۖۜ۬ۢۙۥۘۧۡۜۗۡ۠۫ۡۜۘۦۜۨۘۡۚۤۨۘۦۘ۟ۗۜۘ۠۬ۡۘۘ۬ۧ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 534038431:
                    str = "۫ۖۦۘۘ۫ۨ۫ۙۨۖ۠۟ۗۚۨ۫ۖۘۘ۠ۡۘۥۘ۬ۥۘۘۘۚۥ۠ۢۢۚۛۗۥۤۡۘۥۙ۠ۛۖۙۦۤۥ";
                    break;
                case 667251203:
                    imageView4 = this.OoooooO;
                    str = "ۨ۠۫ۜۖۦۡۨۧۤ۟ۢۥۚۛۦۡۥۘۗۜۙۨ۫۠ۙۘۘۘ۠ۥۧ";
                    break;
                case 697999505:
                    this.o00000OO = i;
                    str = "ۚۤۗۦۥۤ۬۬۠ۘ۠ۤ۟ۘۛۤۖۨۡۖۧۡ۫ۡۘۖۚۖۚۜۖۘ";
                    break;
                case 702234510:
                    str = "ۡۢۦۘ۠ۥ۠۟ۧۖۘ۬۟۟۠ۛۖۘۖۙۜۘۦۛۥۙ۫ۤۜ۟ۧۙۖۙۚۦۨۥۡۧ";
                    break;
                case 763933476:
                    str = "ۘۧۥۘۗۘۦۘۜۢۙۜۜۦۚ۠ۘۦۡۖۛۨۦ۟ۛۦ۠ۢۜۘۨۗۨۢۗۛۜۥۘ۫ۙۤۨۛۘ۬ۗۥۘۥۚۖ";
                    i12 = i11;
                    break;
                case 866497667:
                    str = "ۛۖۧۘۤۢۦ۬ۗۢۚۘۦۘۦۚۤۗۡۚۤۨۜۖۤۢۡۖ۬۫ۢۙۗۦۘۡۡۘ۫ۦۧۘ۫ۙۚۙۙۖ۫ۛۗ۠ۘۘۤ۠ۧ";
                    i8 = i3;
                    break;
                case 899189662:
                    str = "۫ۖۦ۫ۡ۠ۗۚۥۘۥۥۧ۫ۢ۠ۘۙۨۘۨۨۡۢۡۡۘۥ۬ۛۨۚۥۘۛۘۚۤۖۡۢۙۚۦ۠ۚ";
                    imageView3 = imageView2;
                    break;
                case 973538302:
                    String str10 = "ۥۜۖۧ۟ۡۘ۬ۙ۬ۥ۬ۙ۬ۖۤۙۦۨۛۙۤ۬ۙۨ۫ۥۘۘۘۨۖۘۚۖ۬ۨۖۦۘۖۚۡۘۧۨۘۖۢۥۤۙۨ";
                    while (true) {
                        switch (str10.hashCode() ^ (-296823737)) {
                            case -1293841032:
                                str = "ۙۚۗۢۢ۠۫ۘۖۘ۫ۨۚۥۛ۟ۘۖۜۘۙۜۥۗۤۗ۬ۧۘۘۡۘۨۢۧۖۘۡ۫ۨۘ";
                                continue;
                            case -12658664:
                                str = "ۜ۠ۚۦۨۚ۟ۤۦ۠ۡۥۘۖ۫ۘۘۗۧۨ۟۟ۥۘ۬ۡۘۜۛۦۘۗۜۧ۠۫ۜۛۘ۠۟ۛۥۘۙۙۦۘ";
                                continue;
                            case 349558958:
                                String str11 = "ۤۜۡۗۘ۠ۡ۟ۘۦۤ۟ۧۧۘ۠ۙۙۤۦۙۤۗۘۘۖۙۖۛۤۧۚۨۖۚۗۜۘ۫۫ۘۛ۫ۖۘ";
                                while (true) {
                                    switch (str11.hashCode() ^ (-355312231)) {
                                        case -1830167840:
                                            str11 = i2 == 0 ? "ۧۦۜۘۜ۫ۜ۫ۢۡۘۙۙۘۘۗۤ۠ۗۢۖۚۡۜۗ۬ۙۙۧۗۘۥۤۘۖۤۥۦۜۥۤۘۘۘۘۡ" : "ۦۨۦۙۧۥۧۛۨۘۘۦۚۛۜۤ۟ۡۘۦۢۚۢۜۦۘۤۦ۬ۡۥۚۗ۠ۧۛۛۥۘ";
                                            break;
                                        case -852363160:
                                            str10 = "ۨۖۗۛۦۙۧۤۗۥۤۢ۟ۥۜۘ۫ۘۡۧ۫ۜۚۚۦۘۙۨۘۘۤۥ۟ۖۧۜۘۛ۟ۘۡۧۨۛۥۦۘ۬ۤۢۡۗۘۘ";
                                            break;
                                        case 646177626:
                                            str10 = "ۗ۬ۡۥۛ۟ۗۢ۬۟۠ۤۦۘۖۘۗۦ۫ۚ۫ۦۨۤۙۚۜۡۘۢۢۦۘۚۢۦۘ۠ۖۥۘ";
                                            break;
                                        case 1306041121:
                                            str11 = "ۤ۠ۖ۬ۡۡۘۛ۬ۡۘۨۡۧۘ۫ۚۘۘۦۥۜۢۘۜۗۥۖۖۛۗۢۘۤ۬ۧۦۘۗۛ۫ۦۘۜۧ۬۟ۤ۠ۚۨۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1614679367:
                                str10 = "۟ۨۖۘۙۖۘ۠۫ۤۨۛۛۧۥ۠۫۟ۨۘۛ۫۠ۧۦۢۗۦۘۖۢۗۘۗۥۘۧ۬ۦ۟ۤۨۡۗۜۘ۟ۨۧ۫ۦۧۘۖۡۛ۬۟ۚ";
                                break;
                        }
                    }
                    break;
                case 1004647398:
                    i10 = R.drawable.elfin_pause1;
                    str = "ۤۛ۫۠ۖ۟۠۠ۚۙ۫ۨۗۙۘۘ۫ۨۤۥۘۤۦ۟ۡ۟۟۫۠ۨۘ۟ۡۥۧۧۦ۫۟ۦۧۥۧۘۖۖۥۘۚۖۥۘۧ۟ۤۢۢ۬";
                    break;
                case 1011985460:
                    str = "ۦۧۜۚۤۛۧۚۘۥ۬ۘۘ۫ۗۘۘۧۧۡۤۖۘۡ۬ۥۤ۫ۚۚۨۘۨۤ۠ۦۡۡ";
                    break;
                case 1061836065:
                    str = "۟ۘۧۘۤۨۥۛۖۜۨۤۙۛۦۘۖۨۙۨۢۡۘۛ۬ۖ۠۠ۦۥۦۦۘ";
                    break;
                case 1116910553:
                    String str12 = "۠ۡۙۧ۬ۥۦۜ۬۫ۛۡۘۧۤۚۗ۬ۗ۫ۜ۠۬ۖۡۖۡۥ۟ۧۙۚۖۛۤۤۛ";
                    while (true) {
                        switch (str12.hashCode() ^ (-2025384715)) {
                            case -167289536:
                                String str13 = "ۨۛ۫ۘ۟ۜۘ۟ۧۥۘۡۤۙۥۨۘۥۜ۟۠ۦۥۘۨ۠ۡۧۢۚۡۜۗۙۥۡۨ۬ۦۧۚۤ۫ۘ۫ۥۜۜۘ۬۬ۖۥ۟۫ۤۦۡۘ";
                                while (true) {
                                    switch (str13.hashCode() ^ (-1622692269)) {
                                        case -602971000:
                                            str13 = C3718b7.OooO0Oo().OooO0OO == 3 ? "ۢۙۘ۬ۛۨۘ۫ۤۧۦۗۗ۠۟ۜۘۚۡۥۘۦ۟۬ۦۢۨۙۡۚۙۦۥۗۙۥۡ۬ۜۘۧۤۡۥۖۥ" : "ۨۙۢۡۨۦ۟ۡۜۖۚۥۘۤۜۥۘۜ۠ۥۦ۠ۙۨۥۤۙۜۦۘۡۗۖۘۤ۬ۥۤۥۘ";
                                            break;
                                        case -434278179:
                                            str13 = "۠ۛۛۘۢۖۘۘۡۖۡۛۧۛ۬ۦۧۙۘۘ۟۟ۘۛۤۜۘۙۥۧۘۙۗۗ۬۟ۦۘۜۚۤ";
                                            break;
                                        case -341922188:
                                            str12 = "ۙۥۛۡۤۛ۫ۗۚ۬۠ۡ۠ۚ۠۬ۘۦ۫۬ۖۤۢۡۙۦۘۧۙۘ";
                                            break;
                                        case 1734449009:
                                            str12 = "۬۬ۦۨۘۖۘۜۘۘۗۚۗۗۦۡۘۥۙۗۗۦۧۘۥۢ۬ۙۚ۠ۨۥۡۘۖۛۘۘ۫ۡۜۡ۠ۗ۟ۥ۠";
                                            break;
                                    }
                                }
                                break;
                            case 174328909:
                                str = "ۨ۬ۙ۠ۗۡۘۤ۬ۖۘۖۥۖۘۗ۟ۜۙۙ۟ۜۥۘۜۗۤ۬۬ۨۘۚۖ۠۬ۘۖ۫ۥ۫ۖۨۨۘۧ۬ۗۧۤۜۘ۫ۢۨ۬ۤۥۘۛ۬۟";
                                continue;
                            case 1451355815:
                                str = "۟ۡ۬ۢ۬ۚۛۜۢۜۜۙ۫۬ۚ۟ۘۤۨ۬ۘۘ۟ۧۗ۠۟ۚۘۧ۬ۨۘۘۚۚۘۘۘ۟۠۟ۢۦ۫ۥۦۛ۠ۖۘ";
                                continue;
                            case 1812376560:
                                str12 = "ۢ۠ۗۜ۠ۙۜۨۖۦ۠۠ۚۜ۟۠ۤۨۘۘ۟ۦۙۜ۠ۤۥۨۙۢۤۡۚۗۡۗۡ۟ۤۤۤۗۦ۠۫ۨۙۨۘ";
                                break;
                        }
                    }
                    break;
                case 1256345675:
                    this.o0OOO0o.setVisibility(8);
                    str = "۫ۦۢۚ۫ۦۘۛۡ۟۬ۦ۬ۥ۠ۧۨۤۦۘۗۘۘۘ۬۟ۜۘۜۙۙۡۧ۫ۧۥۛ۠ۨۡۘ۬ۡۜۘۥ۟ۜۘ۫۟ۗۖۘۜ";
                    break;
                case 1421670587:
                    imageView6 = this.OoooooO;
                    str = "۟ۨۦۚۥۥۙۦۛۢۡۜۛ۫ۜۘۙۜۚ۬۠ۖۤ۠۟ۖۘۥۜۦ۟ۚۖۖۘۢ۟ۦ۟ۚۤۤۘۘۘ۬ۢ۟ۖۧۖ";
                    break;
                case 1534458698:
                    this.Ooooooo.removeView(this.o0OoOo0);
                    str = "ۚۜۖۘۘ۠ۗۚۗۜۥۡۜۙۥۚۧ۟۫ۥ۟ۜۘۨۢۘۘ۟ۜۛۘۢۛۨ۠ۦ۬ۧۢۤ۟ۚۤۨۧۧۢۦۘ۟۠ۗۚ۟ۤۙۡۥ";
                    break;
                case 1618389246:
                    imageView7.setImageResource(i12);
                    str = "۟ۨۡۘ۬ۦۧۘ۟ۚۨۙ۬ۚۡۨۘۘۖۗۦۘۚۥۙۗ۬۫ۙۤۖۢۜۖ۠ۙۨ۟ۗ۬ۡۤۚۤۗۦۛۨۖۘۜۥۜ";
                    break;
                case 1726723024:
                    str = "۬ۛۡۘۢۘۙۢۨۨۘۤۡۡۜۤۥۢۥۢ۟ۖ۟۟ۜۧۘۙۙ۠۫ۥ";
                    onTouchListener3 = onTouchListener;
                    break;
                case 1789649676:
                    str = "۟ۘۧۘۤۨۥۛۖۜۨۤۙۛۦۘۖۨۙۨۢۡۘۛ۬ۖ۠۠ۦۥۦۦۘ";
                    onTouchListener3 = onTouchListener2;
                    break;
                case 1887895639:
                    imageView3.setOnTouchListener(onTouchListener3);
                    str = "۠۫ۦۧۢۡۘۚۤ۫ۚۛ۠ۨ۬ۚۜۛ۬۬ۖۢۢۜۥۘۨۥۨۧۙۙ۟۫ۧۤۙۗۡ۠ۢۖۚۧ";
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        StringBuilder sb = null;
        ViewOnClickListenerC4383t6 viewOnClickListenerC4383t6 = null;
        ViewOnClickListenerC4383t6 viewOnClickListenerC4383t62 = null;
        ViewOnClickListenerC4383t6 viewOnClickListenerC4383t63 = null;
        StringBuilder sb2 = null;
        StringBuilder sb3 = null;
        DialogC4346s6 dialogC4346s6 = null;
        Dialog dialog = null;
        String str = "ۘ۠ۡۘۥۢۢ۬ۛۡۧۥۘۘۤ۠ۘۢۨۙۘ۠۫۟ۧۥۘۧۢۡۛ۬ۦۧ۠ۜۗۨۗۚۗ۬۫ۘۤۤۚۚۨۙۥ";
        while (true) {
            switch ((((str.hashCode() ^ 927) ^ 726) ^ 530) ^ (-1674611433)) {
                case -2115401734:
                    this.o000000o.start();
                    str = "ۡۢۚۛۧۡۘۚۙۢۥۡۡۘۨۖۙۡۖۧۘ۠ۦۜۘ۬ۚۘۤۙۢۢۖۥۘۥۗۘۘۗۤۜۘ۫ۥۦۘۡ۟ۢ۟ۤ۫ۚۢۙ";
                    continue;
                case -2011210034:
                    C3679a5.OooO0O0(getContext(), "runScriptOperate -->\u3000停止引擎");
                    str = "ۡۨۥۘۚۛۛۖۛۛ۟ۖۦۨ۠ۤۥ۬ۥۘۧۦۥۘۛۖ۟ۧ۬ۘۘۘۖ۬۟ۘۜۗۚۘۘ";
                    continue;
                case -1902550695:
                case -688725307:
                case 96774:
                case 65615781:
                case 83634130:
                case 765160836:
                    str = "ۖۘ۫ۙ۬ۖۘۗۖۥۛۤۦۖۦۨۨۜۚ۟ۨۘۘۢۘۘۘۨ۟ۙۖۢۖۘۛۙ۠ۙۦۘۧۗۜۨۧ۟ۜۤ۫ۤۢ";
                    continue;
                case -1771488403:
                    String str2 = "ۦۥۜۘ۠ۖۧۘۤۥۘۦۧۢۘۘ۟ۦۥ۟ۡۖۤۗۗ۫ۚۦ۬ۡۨۛۖۗۗ۫ۤۦۘۡ۠۫ۚۧۙ۠۫ۘۙۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-480523560)) {
                            case -1658585190:
                                String str3 = "۟ۘۛۡ۬ۘ۠ۛۢۦۖۛ۬۫ۦۘۤۛ۫ۤ۫ۜۡۨۡ۟ۦ۫۫ۦ۠";
                                while (true) {
                                    switch (str3.hashCode() ^ 219402640) {
                                        case -402157078:
                                            str3 = C3718b7.OooO0Oo().OooO0OO == 3 ? "۟ۙ۬۬ۡۨ۟ۤۦۘۤۗۡۘۖ۫ۘ۠ۘۛۖۖۛۗۙۥۘۤۧۧۙۚ۠۬ۘ۟ۢۘۘۘ" : "ۥۗ۫ۦ۟ۘ۟ۘ۫ۦۡۥۜۘۨۗ۬ۢۖۗ۫ۨۘۚۘۤۡۨۥۘ۟ۛۗۦۦۢ۫ۜۘۗ۠۟";
                                            break;
                                        case 600153136:
                                            str3 = "ۘۛۡۘۧۙۙۥ۟ۘۙۗۛۤۚۧۥ۠ۙۦۘۘۛۘۨۘ۟ۡۘ۠۫ۗۨۦۙۡۛ۠ۙۧ۠ۢۗ";
                                            break;
                                        case 899600380:
                                            str2 = "ۢۙۨۧۖۘۥۧۖۥۥۥۘۘ۟ۥۘ۫ۧۖۖۙۨۘۧ۫۬۬ۘ۬۬ۗۦۛۙۥۘۢۖ";
                                            break;
                                        case 1536295595:
                                            str2 = "ۦۨۚۦۦۦۗۢۤۗۢۗۥۜۤۨ۬ۙۚۦۨۘۥۡۘۚۘۢۢۛۛۘۧۥۡ۬ۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case -452560836:
                                str = "ۜ۬ۦۘ۬ۘۢ۫ۗ۬ۛۦۚۖۥۗ۬ۡۗۨۧ۬ۤ۟ۢۧۗۨۤۘۘۚۘۡۗ۫ۘۘۘۗ۟ۡ۫ۨۘۖ۟ۘۘO۫ۡۧ۫ۢۚ";
                                continue;
                                continue;
                            case -101689738:
                                str = "ۘۜۜ۫۬ۘۘۗۖۡۘ۟ۗۥۥۨۡۧۜۘۢ۫ۦۘ۬۟ۚۡۦۜۙۡۖۚ۟ۜ۠ۥ۟ۜۡۖۡۡ۠ۨ۫۠ۗ۫ۧۡۨۧۘۖۨۦۘ";
                                continue;
                            case 1336166748:
                                str2 = "ۘۧۡۘۖۘۦۘۤ۠۟ۗۗۖۢۘۦۘ۠ۖۢۛ۬ۨۦۢۢ۫۟ۚۘۘ۟ۙۙۗۦۨۘ۫ۖۚۤ۬ۡۘ۬۬ۧۜۡ۠";
                                break;
                        }
                    }
                    break;
                case -1735411261:
                case -706238032:
                case 561461897:
                    return;
                case -1734353955:
                    String str4 = "ۦۧۢۡۜۘۖ۠ۡۘۡۚۘۛۢۜۨۜۜۗ۟۟ۜۗ۫۟ۤۖۘۦۙۡۘۡ۫۬ۤۦۧ۫ۡۡۘۛۡ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1398740251)) {
                            case -1459933147:
                                str4 = "ۗۛۤۡۙۙۥۚۘۥۡۚۦۘۧۙۦۖۙ۠۬ۥۧۛۤۛۘۤۡۦۧۨ۬ۘ۟ۛۨۤ۬ۗ۬ۛۖۚ۠ۚۥ۫ۘ";
                                break;
                            case 58724216:
                                str = "ۢۡۜۘۗۤۤۖۚ۠ۧ۫ۚ۫۠ۙۥۨۧ۫ۚۨۡۨۘ۠ۖۡۘۜۘۜۘ۠ۡۡۘۢۖ۟ۦۨۘۘۜۜۖۘۖ۟ۥۧۤۤۤۗۤۚۜۥ";
                                continue;
                                continue;
                            case 467341072:
                                String str5 = "۠۠۬ۨ۫ۧۤۜ۫ۨۤۚۘۡۨۡ۬ۡۘ۫ۙۛۢۚۦۘۗۛۘۘۗ۟ۚۙ۬ۖۢۗ۠";
                                while (true) {
                                    switch (str5.hashCode() ^ 2078919155) {
                                        case 856307874:
                                            str4 = "۟۟۬ۗۗۘۘۛۙۗ۫ۦۥۘۖ۟ۜۘۦ۫ۨۘ۫ۨۧۤۘۙۛۙۗۦۘۢ۠ۜۗۗۦۢۥۗۛۢۘ";
                                            break;
                                        case 1510537006:
                                            str5 = viewOnClickListenerC4383t6 == null ? "ۦۘۖۛۡۧۘۧۡۖ۫ۥ۫ۢۗ۠ۤ۟ۗۦۥۙۖ۟ۡۚ۫ۢۦۥۖۧ۬ۗۛۡۘۘ" : "ۖۘۖۘۗۡۡ۠ۘۨۘۚ۬ۨۚ۟ۢۖۗۥ۫ۙ۫۫ۢۙۦۦۘۧۙ۟";
                                            break;
                                        case 1685976623:
                                            str4 = "ۥۚۘۘ۬ۤ۫ۛ۟ۜۘۨۥۧ۟ۜ۬ۢۤۧ۫ۖۡۡ۠۟ۨۛۧۡۥۧۘ";
                                            break;
                                        case 2102653504:
                                            str5 = "ۢۡۙ۠ۦۖۘۙۦ۠ۙۗۚۨۥۨۘۙۤۖۘۜ۬ۨۦۘۨۘ۫ۦۙۧۘۧۘۜۚۦ۫ۨۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 767198188:
                                str = "ۜۖۜ۫۫ۥۘۘ۫ۨۘۗ۫ۦۚۛۦۘ۟۠۬ۤۗۦۚۤۦۘۦۡ۫ۚۛۘۘ۟۬ۜۙ۬ۖ";
                                continue;
                        }
                    }
                    break;
                case -1725595714:
                    sb3 = new StringBuilder();
                    str = "ۛ۠ۢۖۛۘۘۚۦ۬ۤۥۖۘۗۡۨۖۘۗ۠ۡۘۥۖۦۖۤۘۘۡۘۨۘ۫۫ۥۘۛۗۙۚۥۘۖۤۨ";
                    continue;
                case -1604108865:
                    sb2.append(C3718b7.OooO0Oo().OooO0OO);
                    str = "ۗۚۖۖۘۥۘۨۖۙ۠ۡۥۘۨۖۘۘۥۖۡۘۗۘۖۛۦۜۘۤ۫ۨۧۤۗ";
                    continue;
                case -1580430151:
                    String str6 = "۬۟ۘۘۘۡ۠ۧۥ۟۬ۗۦۘۡۥۡۙۗۖۘۙۛۥۘ۬ۥۘۦ۠ۢۢۨۥۘۡۥۙ۠ۜۜۤۖۢۨۦۜۙ۟ۜۘۛۦ۬ۤۙۜۥ۠";
                    while (true) {
                        switch (str6.hashCode() ^ 859155426) {
                            case -2069298732:
                                String str7 = "ۡۡۖۘۡۛۜۘۧۘۛۙۤۖۖۡۦۘۦۜ۬۫ۘۡۘۗۚۤۜ۠ۘۘۥۡۖۘ۬۬۫۟ۦۖۘۗۤۦۘۚۚۘۤ۫ۘۛ۟۠ۡ۫ۗۡۢ۠";
                                while (true) {
                                    switch (str7.hashCode() ^ 257037178) {
                                        case -1822355843:
                                            str6 = "۫ۛۥۨۥۡۘ۟۠۠ۤۤۖۛ۠۟ۢ۬۠۠ۤۚۘۘ۬ۚۧ۟۫ۚۘۘ۟ۢۖۜۡ۬";
                                            break;
                                        case 1044788926:
                                            str7 = "ۘۗ۠ۛۘۜۘ۠ۚۤ۫ۗۙۥۜۧۘۢۗ۬ۜۙ۫ۤۘۘۤۥۡۘ۠ۨۥۘۢۧۡۘۨۥۨۗۦۜ۟ۖۡۘ";
                                            break;
                                        case 1067889064:
                                            str6 = "ۛۚ۫ۡۚۜۗۥ۠ۗۨۖۙۘ۟ۗۗۜۖۢۘۘۘ۫۫ۢ۬ۙۨۗۨ";
                                            break;
                                        case 1097684539:
                                            str7 = System.currentTimeMillis() - o0000OOo < 1000 ? "ۨۦۡ۠ۤۧۙۦۘۤۢۜ۬۫ۙۨۧۘۘۢۡ۫۬ۖۚۗۡۚۖۘۚۢۛ۬ۤۧ" : "ۥ۬ۨۘۖ۬ۘۙ۫۫ۨ۟ۛۤۚۥ۠ۦۗ۫ۤۨۘۡۨۤ۫ۙۡۖ۟ۤۢۖۡۘۡۦۧۧۖۛۦۖۘۘۨۡۧۘۨ۫ۨ";
                                            break;
                                    }
                                }
                                break;
                            case -83683551:
                                str6 = "۫۬ۦۘۦ۫ۡۘۚۢۡۜۜۤۙ۫ۗۗ۬ۖۘۜۘۢ۟ۗ۟۫ۤۗۦۘ۠ۨۢۜۜۦ۬۠۟ۖ۟ۦ۬";
                                break;
                            case 160867154:
                                str = "۠ۜ۬ۛۥۡۙۘۥۜۗۖۘۤۤۡۢ۬۠ۨۘ۬۠ۦۨۘۗۗۖۘ۫۟ۜ۫ۦۦۘۜۘۚۨۛۙۖ۬ۛ";
                                continue;
                            case 721783779:
                                str = "ۙۧۚۚۨ۬ۘۚۛۥ۟ۡۘۙۡۦۘۨۧۚۢۨۜ۫ۘۧۘۦۦۥۘۜ۬ۡۚۢۢۖۡۡ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case -1449708738:
                    dialog.show();
                    str = "۟ۢۥۘۖۨۨۘۗۚ۟ۤۚۨۘ۫ۙۖۘ۟۫ۘۘۗۡۛۤۖۧۘ۟۬ۖۘۗۖۢ۟ۡۧ۟ۦ۬ۡ۬ۨۘ۟ۧۙۚ۫۬ۙ۫ۚۢ۟ۖۡ۟ۢ";
                    continue;
                case -1232388505:
                    viewOnClickListenerC4383t6 = this.o00Ooo;
                    str = "۫ۚۨۢۥۜۖۙۖۘۗۜ۬ۛۥۛۦ۬ۦۨۙۧۨۡۦۘ۫ۤۖۘۜۖۛۤ۬ۨۙۙۜۘۦۙ۬ۘۨۦۛۗۨۘۡۘۗ";
                    continue;
                case -1120455217:
                    sb = new StringBuilder();
                    str = "ۗ۠ۜۘۜ۬ۡۛۧۨۗۤۨۘۘۧۜۘ۬۟۠ۘۧۨۘۥۘۘۘۡۥۙۥۥۨۘۢۘۡۛۢۡۘ";
                    continue;
                case -1113727295:
                    dialogC4346s6 = this.o00o0O;
                    str = "ۨۨۙۖۗۖۘۨۖۨۖۥۢۢۛ۬ۦۡ۬۫۬۫۠ۥۚۢۨۘۦ۬ۚۤۖ۟ۖۡۥ";
                    continue;
                case -1047165497:
                    sb.append("floatview_linearlayout_setting ---- ");
                    str = "۠ۦۙۥۢۘۧۜۛۦۤۜۙۗ۠ۤۗۖۘ۟ۙۥۘۘ۬ۙۛۖۘۖۦۦۖۖۖۘۨۡۡۘۧ۫ۥۙۨۘۖۨۦ۬ۡۡ";
                    continue;
                case -954269781:
                    str = "ۤۖۛۦۛۡ۫ۗۗۖ۟۟ۛ۫ۘ۟ۡۨۘ۠ۡۡۤۖۖ۫ۙۡۘ۬ۢۜۘ";
                    continue;
                case -791675937:
                    switch (view.getId()) {
                        case R.id.floatview_linearlayout_exit /* 2131296940 */:
                            str = "ۥۢۜۥ۠۠ۚۜۘۧۡ۠ۨ۬ۧۙۢۗۡۖۘ۫ۛۨۘۧ۠ۗ";
                            break;
                        case R.id.floatview_linearlayout_info /* 2131296941 */:
                            str = "ۜۘ۬ۥۦۡۘۙ۟ۤ۟ۨ۟ۙۤۨۙۧۡۘۚۖۡۡۖۢۧۥۧۘۡۙۤ۠ۚۤۗۡۜ";
                            break;
                        case R.id.floatview_linearlayout_run /* 2131296942 */:
                            str = "۫ۡۢۦ۬۠ۘۛۛۥۖ۫ۛۙۨۜۚۥۦ۟۫ۛۦۦۤۛۛۡۤۥۘۤۙ۟ۛۥۜۡۤۦۘ۬۠ۦ";
                            break;
                        case R.id.floatview_linearlayout_setting /* 2131296943 */:
                            str = "ۤ۫ۛ۟ۙۜۛۘۢۢۜۚۤۗۥۘۥۛۚ۟ۥ۠ۗۗۡۘ۬ۧۨۚۘۨۘۛۡۡۘۨۗۦ۫۬ۢۙۥۧۘ";
                            continue;
                        default:
                            str = "ۙ۟ۘ۠ۘۚ۬ۢۦۘۥۘ۟ۚۜ۟ۢۢۧۧۗۢ۫ۗۧ۬۟ۛۗۨۡۘ";
                            break;
                    }
                    break;
                case -591990580:
                    this.o0Oo0oo = false;
                    str = "ۧۧۡۘ۬ۙۗ۟ۖۜۖۗۦۨۦۥۨۘۙۚۨۥۘۨۘۨۢ۫ۧۥۛۚۤ۟ۖ۠ۖ۠ۖۢ۫۫ۘۘۗ۠ۨۘۛ۠۟۫۠ۢۖۘۦ";
                    continue;
                case -300249647:
                    this.o00o0O = new DialogC4346s6(getContext());
                    str = "ۥ۟ۢۖۡۗۢۘ۠ۘۥۘۘۢۡۧۘ۫ۥۘ۟ۡۘۘۜۜۛۙۗ۬ۖ۠ۥۘ";
                    continue;
                case -196172874:
                    str = "ۥۡۨۥۙۥۘۜۡۘ۠ۥۥۘۤۛۥۘۢۢۤۛۤۖۚۦۧ۬ۤۚۨۥۤ";
                    dialog = viewOnClickListenerC4383t63;
                    continue;
                case -160741811:
                    viewOnClickListenerC4383t6.OooOO0(1, true);
                    str = "ۧۡۖۦۦۦۘۙۗ۫ۧۖۛ۠ۡۧۤۚۥۘۛۨ۫ۢۥۙۗۢۖۘۚۨۖۘ";
                    continue;
                case -142030051:
                    sb2 = new StringBuilder();
                    str = "۫ۥۦۘۜۙۥ۫ۡ۟ۧۛۧۜۧۨۦ۠ۙۖۡۘ۫ۡۥۚۤۜۡۗ۟";
                    continue;
                case -101009880:
                    String str8 = "۬ۧۨۥ۬ۨۘۖۧۘ۫ۜۧۙۜ۫۬ۚۛۥۦ۠ۗۖۘۥۗۚۥۘۨ۟ۥۘ۫ۡۚۤۥۦۜۢۤ۟۬ۦۘۖۦۘۘۗۤۤۥۤ۬";
                    while (true) {
                        switch (str8.hashCode() ^ (-1847871243)) {
                            case -765833779:
                                str = "ۧۗۤ۫۟ۨۘۤۨۦۘ۫۫ۦ۬ۗۜۧۘۡ۠۟۬ۢۜ۠ۚۢ۫ۙۡ";
                                continue;
                                continue;
                            case 623842220:
                                str8 = "ۘۦۢۡۥۦۢۘۚۧۡ۟ۦ۟ۘۘۜۢۗۛۤۜ۬ۜۡۚۤۢ۫ۗ۠۫ۢۛۧۤ۫۠ۚۗۦۤۘۦۙۘۘۥۚۖۘ";
                                break;
                            case 1143355841:
                                str = "ۦۨ۠ۡۙۦۜۙۢ۠ۡۛۖۧۨۘۖ۟ۘۚ۟ۥۘ۬ۢۗ۟ۥۥۙۜۜۙۗۦۖۛ۫";
                                continue;
                            case 1542769210:
                                String str9 = "ۢ۠ۘۙۦۡۘۧۧۨۘۡ۫ۢۗۛۤۜ۬ۨۨۛۥۘۦ۠ۛۛۧ۬ۛ۠ۜۛۦۗۘۨۧۗۤۨۘۢۗۜۥۢۨۘ۠ۙۧ";
                                while (true) {
                                    switch (str9.hashCode() ^ 1407762764) {
                                        case -888990722:
                                            str9 = C3718b7.OooO0Oo().OooO0OO == 2 ? "ۡۢۨۢ۟۠ۜۛۡۘ۬۠ۜۘۧ۬ۙۨۘۛۦۗۥۘۡ۟ۡۘۜۨ۫ۤۙۥۘۚ۬ۛۥۢ۫ۗۖۦۦۢ۟" : "ۦۖۖۘ۬ۜ۟ۖۢۜۘۢۜۦۢۡۧ۬۫ۢ۠ۡۚۢۜۚۙ۬ۥۨ۬ۨۘۡۜۨۘۥۡۖ";
                                            break;
                                        case 581837790:
                                            str8 = "۟ۜۙ۫۬ۘۡۚۥۙ۟ۜۘۤ۫ۨ۟ۥۢۘ۠ۤۧۧۢۘ۟ۘۘۚۦۤۥۨ۬ۧۙۖ";
                                            break;
                                        case 1043808052:
                                            str8 = "۫۬ۢۡۘۡ۬ۚ۠۟ۨۜۘۥ۟ۥۧۘ۠۠ۢۖۦۢۥۘۙۢۡۘۡۗۦۘ";
                                            break;
                                        case 1121492474:
                                            str9 = "ۥ۬۠ۨ۠ۢۨۦۧۘۦۤۜۘ۬ۤۥۜۗۤۚۦۘۘۧۘۘۚۛ۟۫ۦۜۘۚۚۚۘۨۙۡۡ۫ۧۚ۬ۚ۫۟ۖۙۡ۟۫ۧۜۖ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -71355484:
                    sb2.toString();
                    str = "۬ۗۗ۠۫ۛۖۚ۫ۚۜۧۘۨۢۗۖۢ۬ۤۢۜۘۚ۟ۘ۠ۥۙۥۢۡۡ۠ۢۗۘ";
                    continue;
                case -53455081:
                    OoooOo0();
                    str = "ۖۘۖۘ۠ۘۛ۫۟ۖۖ۫۫ۢۗ۟۟۟ۖۘۘۖۙۢۗ۟ۘۧۦۖ۫ۤۛۢ۬۬ۨۘۜۙۚۢۥۧ";
                    continue;
                case 21308276:
                    C3977i7.OooO().OooOoOO();
                    str = "ۜ۟۠۟ۥۤ۠ۖۚۘۥۡۘۖۨۦۘ۠ۥ۟ۗ۠ۥۘۢۦۖۘۙۡ۠ۨۗۥۘ";
                    continue;
                case 79035344:
                    String str10 = "۟ۤۢۧۦۥۘۧۘۦۜۙۡۙۤۦۘۛۨۜۨۘۖ۠ۢۚۘۡۗۗۜ۟";
                    while (true) {
                        switch (str10.hashCode() ^ (-1116575428)) {
                            case -701964612:
                                str10 = "۫۫۟ۥۙۘۜۢۜۛۙۢۜۙۢۡۘۘۘۥۜۘۜ۫ۤ۬۟ۘۥۡۢ۬ۗۡۙۥۡۡۖۛ۬۟ۤۢۧۗۜۘۨ";
                                break;
                            case -701670155:
                                break;
                            case -542147970:
                                str = "ۦۦۖ۟ۛۖۘۚ۠ۥ۬ۥۡ۠ۢۨۦۦۥۦۛۘ۠ۜۡۖۨۡۘ۫ۧۘۘۜۘ۠۠ۥۛۥۢۜۦۘۨۦۧۛ";
                                break;
                            case 1784242318:
                                String str11 = "ۡۦۡۘ۟ۢۗۢۢۤۦۢۡۢ۟ۨۘ۟ۛۦ۬۫۟۠ۨۦۖۢۗۤۖ۟ۧۥۘۗۘۨۘۙ۫ۡۘۘۨۗۢۙۙ";
                                while (true) {
                                    switch (str11.hashCode() ^ 1036417082) {
                                        case -894102356:
                                            str10 = "ۥۤۚ۫ۛ۟ۨ۠۬ۤۗ۬۫۬ۗۚۛۚ۠ۨۡۤۥ۬ۘۦۧۘ۠ۙۜۨۡ۟ۨۘ۠";
                                            break;
                                        case -836480125:
                                            str10 = "۠ۥۜۘۧ۬ۡۘۥۦۚۢ۠ۦۘۙۚ۬ۢۜۦ۟ۙۦۘۡۜۡۘۥۗۘۖ۫ۦۘۦ۬۟ۥۗ";
                                            break;
                                        case -657052111:
                                            str11 = C3718b7.OooO0Oo().OooO0OO != 3 ? "۟ۦۥۖ۟ۨۘۗ۟ۙۢۛۚۦ۠ۨۘۢۧۧ۠ۛۖۛۚۛۧۦۛۛ۠ۦۘۖۜۗۧۘۥۘۚۧۘۜۦۘۘ" : "ۜۨۜ۠ۘۢۘۖۧۘۤ۟۠ۖۦۛۨۜ۠ۖۜۙۘۘۦ۠ۧۤۘۜۘۢ۬ۜۥۢۡ";
                                            break;
                                        case 277579035:
                                            str11 = "۟ۙۗۤۛۘۘۥۨ۫ۡۗۘۘۜۡۦۘۤۜۨۖۧۛۙ۠ۨۘ۫ۜۦۘۗ۬۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 244777152:
                    sb.append(C3718b7.OooO0Oo().OooO0OO);
                    str = "ۗ۬ۡۘۨۘۙۥۛۢۘۥ۫۬ۤۡۘۨۧ۬ۖ۫ۨۘۙۙۦۘ۫ۨۜۥۤۙ۬ۘ۫ۜ۟ۨۨۗۧۘۦۡ";
                    continue;
                case 376362032:
                    OoooOoO();
                    str = "ۖۘ۫ۙ۬ۖۘۗۖۥۛۤۦۖۦۨۨۜۚ۟ۨۘۘۢۘۘۘۨ۟ۙۖۢۖۘۛۙ۠ۙۦۘۧۗۜۨۧ۟ۜۤ۫ۤۢ";
                    continue;
                case 411066792:
                    OoooOOO();
                    str = "۟ۜۥۘۖۨۦ۟ۥ۬ۘۡۛۛۤۡ۟ۗۨۘۨۤۗۥۛۡۘۗۗۥ۟ۙۡ۠ۙ۬ۡ۠۫";
                    continue;
                case 466178987:
                    str = "ۧۗ۠ۛۦۨۘۚ۬ۧۢۨۦ۬ۖۗۡۛۡۘ۟ۥۤۦۦۜۘۦۨۜۘۗۢۦۘۖۛ۫ۥۢ۫";
                    continue;
                case 525888248:
                    viewOnClickListenerC4383t62 = new ViewOnClickListenerC4383t6(getContext());
                    str = "ۦۤۥۘۨ۫ۘۛۜۨۘۢۖۨۘۚۥۛۙۥۦۘۥۜۜۜ۠۫۫۠ۘۘۘۡۡۗۙ۬ۤ۟ۜۛ۬ۗۡۚۘۘۥۘۗۛ۬ۦۘ";
                    continue;
                case 578936832:
                    sb3.append("ElfinFloatView run SCRIPT_STATE_PAUSE_BY_HEART_BEAT_VERIFI_ERR ---- ");
                    str = "ۗۚ۫۫ۧۡ۠۠۫ۦۧ۬۬ۧۥۘۧۧۘۘۥۡ۠۬۫ۡۢ۟ۜۘ۬ۢۜۖ۠ۨۧۡۛۥۜۧۥ۬ۥ۬ۦۖۨۘۧۘ";
                    continue;
                case 667866974:
                    C3977i7.OooO().OooOoo();
                    str = "۟۠ۢۦۢۢۖۘۦۘۗ۫ۜۙۧۗۢ۟ۜۛ۠ۦۤ۬ۦۖۚۥ۬ۧۤ";
                    continue;
                case 670144270:
                    sb.toString();
                    str = "ۧۢ۟ۥۧۗ۫ۛۛۨۜۖۦ۬۬۠ۥۥۘۗۦۙ۫ۡۘۘۢۙ۟ۖۤۡۘۙۤۥۛ۠ۘۘ";
                    continue;
                case 677882695:
                    this.o00Ooo = viewOnClickListenerC4383t62;
                    str = "ۥ۬ۙ۠۟ۧۙ۟ۨۘۦۦ۫ۨۡۖۚۘۖ۬ۚۢ۫۬ۜۘۦۧ۫ۘۨۦۘۛۤ۠ۧ۟۟ۜۡۡۚ۬ۥۘۙۛۘۦۛۛ";
                    continue;
                case 687366178:
                    String str12 = "۫۠ۘۙۢۘ۫ۙۖۦۜ۠ۦۚۖۘۙۡۤۛۥۨ۬ۦۧۖۖۜۘۙۧ";
                    while (true) {
                        switch (str12.hashCode() ^ 1859252888) {
                            case -1799355237:
                                break;
                            case 68454686:
                                str12 = "۬۠ۛۛ۫ۜۘۢۛۥۘۘ۠۫ۨۦ۠ۘۘۧ۠ۥۧۚۚۜۧ۟ۨۘۨ۬ۗۗ۬۟ۜۤۥۘ";
                                break;
                            case 319101477:
                                str = "ۥ۟ۦۡۤۡۘۙۡ۫ۨۤۨ۟۟ۨۗۢۖۖۖۖۡ۟ۨۖۗۨۘۦۙ۠ۜۖۜۘۥۡۤۗۡۧۨ۫ۚ";
                                break;
                            case 1905781033:
                                String str13 = "ۦ۫ۦۢۙۨ۠ۛ۬ۨۗۘۘۤ۬ۛۢ۫ۥۘ۬۟ۖۘۙۘۥۖۖۢۨۡۖۢۤۥۥۡۥۜۨۡۚۘۦۘۗۡۥۚۢۜ";
                                while (true) {
                                    switch (str13.hashCode() ^ (-2073363722)) {
                                        case -2005356792:
                                            str13 = "ۧۧۨۛۙۙ۟ۚ۟۟ۤۜۘۖ۟ۡۨۦۥۘۖۛۗۜ۠ۙۡۛۛ۬ۥۦ۫۟ۤۙۨۛۘۧ۠۬ۥۤ۫ۦۧۘۤۨۘ";
                                            break;
                                        case -1770145123:
                                            str12 = "ۦۨۘۦ۠ۤۥۘۤۡۥۘۙۦۡۨۧۘۖۘۤۥۛۢۢۡۘ۬۫ۧ۬ۥۥ۠ۥۘ۟ۜۖۘۘ۠ۦ";
                                            break;
                                        case -1333644899:
                                            str13 = C3718b7.OooO0Oo().OooO0OO != 2 ? "۟۠ۘ۠ۤ۟ۤ۬۠ۖ۫ۖۡۢۖ۟ۗۚ۬ۨۦۘ۠ۖۖۘ۬ۙۥۘۛۜ۟" : "ۘۨ۬ۤۘۧۘ۬ۤۗۛۙۜ۬ۨۘۜۙ۟ۤۨۘۛۦۛۤۖۖۜۜۨۥۥ۬ۜۥۚ";
                                            break;
                                        case 854145914:
                                            str12 = "ۗۗۨۘۜۡۖۧ۟۫ۜۙۡۤۨۢۚۖ۟ۦۥۤ۫ۜ۬ۥۗۙ۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 759518811:
                    viewOnClickListenerC4383t63 = this.o00Ooo;
                    str = "ۙۢۗۧۜۨۗۧۘۤۛ۠ۖ۫ۡ۠۠۬ۙۗۛۧۜۡۘۜۧۤۥۚۥ۟۫ۜۧۥۖۚ۬ۛۢۘۡۢۚۙ۠ۘۛۗۗۖۛۥۘۘ";
                    continue;
                case 830837751:
                    String str14 = "ۤۘ۠۬ۖۥۗۧۖۙۤۤۥۦۧۗ۬۫ۢۖۦۚۧۛۧۛۡۘۖۗۘ۟ۢۥۜ۬ۥۘۨ۫۫ۡۜ";
                    while (true) {
                        switch (str14.hashCode() ^ 1821139340) {
                            case -740641680:
                                String str15 = "۠ۙۦۘۥۛۤۜۨۡۘۗۡۢ۬ۖۖۘ۠ۜۙ۠ۧۧۘ۟۬۠ۨۡۘۡۥۦۘۤۙۜۘۨۛۖۗۥۧ۬ۤۧۜ۠ۨۘۜۥۗ";
                                while (true) {
                                    switch (str15.hashCode() ^ 1704679282) {
                                        case -2012172935:
                                            str15 = this.o00o0O == null ? "ۥۥۦۘۖۜۨۘۜۥۢۢۧۚۢۥ۫ۥۥۙۗۚۨۘۡ۬۟ۧۚۡۤۜۥۘۧۦۛۤۛۙۚۚۗۢۘۜ" : "۫ۢۧۤ۠۟۟ۥۙۜۡۡۘ۟ۦۙۨۖۖ۬ۨۘۚ۫ۙۨۡۡۡۜۦ۫ۡۘ۠ۨۥۜ۬ۖۥۥ۠۟ۛۨۛۖۤ";
                                            break;
                                        case -1803403075:
                                            str14 = "ۙۦۘۘۨۨۙ۬ۡۨۚۖۡۢۥۖ۬۫ۘۘۡۛۖۘۨۡ۟ۗ۠۠۬ۢۡ";
                                            break;
                                        case 1043129217:
                                            str14 = "ۦ۬۠ۥۚۤۥۤۥۨۛۡۢۜۚۘۥۖۚۢۖ۫۠ۙۘۘۙۙۥۦۢ۫ۙۙۧۗۛۛۢۧ۬";
                                            break;
                                        case 1990935504:
                                            str15 = "ۛ۟ۤۥۚۘۤۜۨۘ۫۬ۨۨۗۨۦۙۦۘ۠ۗۛ۠۬ۥۧ۠ۘۥ۟ۖۢ۬ۖۚۚۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case -716071450:
                                str14 = "۟ۢۚۖ۫ۜ۟۫۫ۛۥۦۘ۫۠ۜۦۜۢ۬ۙۦۘۗۨۖۘ۬ۗۦۗ۫ۗۖ۬ۨۛۙۘۧۧۥۦۤۛ۟ۘ۫ۙۚ";
                                break;
                            case 475896805:
                                str = "۫۠ۥ۠ۢ۟ۙۗۜ۠ۢۘ۠ۛۘۚ۬ۚۖۨۘۤۖۧۙۙ۟ۧۤۚ";
                                continue;
                                continue;
                            case 893003485:
                                str = "ۥ۟ۢۖۡۗۢۘ۠ۘۥۘۘۢۡۧۘ۫ۥۘ۟ۡۘۘۜۜۛۙۗ۬ۖ۠ۥۘ";
                                continue;
                        }
                    }
                    break;
                case 834321656:
                    String str16 = "۬ۦ۟ۨۡۢ۠ۨ۟۠ۨۙۥۧۘۤ۬۠ۘۙۡۦۗ۫ۗۗۨۙۘۜۘ۟ۗ۠ۚۨۙۥ۬ۛۗ۬ۙ";
                    while (true) {
                        switch (str16.hashCode() ^ (-1062407488)) {
                            case -1396576194:
                                str = "ۢ۫ۤۤ۬ۥ۠ۨۥۙۧ۠۟ۡۢۖۘۥۚ۬ۡۘۛ۫۬۠ۜۧۘۚ۠ۦ۫ۨۘۥۤ۟ۛۜۥ۬ۙ۬ۢۥۥۘۛ۬";
                                continue;
                                continue;
                            case -1306736900:
                                String str17 = "۫۟ۥۘ۬۬۬ۥ۠ۥۗۘۨۘۗۚۜ۠ۧۧ۬ۥۘۚۖۙۨ۬ۦۘۘۙۙۚۜۧۘ۟ۙۚۗ۬ۡ۟۟۫۫۠ۘۚۤۦۛ۬ۖۘۗۥۛ";
                                while (true) {
                                    switch (str17.hashCode() ^ 1976301087) {
                                        case -1674711086:
                                            str16 = "۫ۘۨۜۖۨ۟ۖۨ۠۟۬ۥۨۛۧۡۜۨۡۡۧۤۗۢۜۛۧ۫ۥۘۧۚۛۘۢ۠۠ۤۨۘۥۖۤ۠ۧۜۘ۠ۗ۬۬ۖۧۤۗۜۘ";
                                            break;
                                        case -282179229:
                                            str17 = C3718b7.OooO0Oo().OooO0OO == 4 ? "ۥۖۘۚۛۙۥ۫ۡۘ۫ۧۖۧۙۨۦۛۤۧ۟۬ۘۙۚۦۤۨۘۨۚۡۘۨۘۦۗۢۛۤۚۘۤۗۦۘۧۦۡۘۙۛۗ" : "ۢۗۢۤ۫ۖۡۘ۬۬ۦۘۦۧۜ۠ۚۖۘۛۨۥۙۗۚۙۥۥۥۙۗۛۤۙ۫۬ۙۖۗۚۚ۬۠ۖۧ۟ۖۚۥۘ";
                                            break;
                                        case 334308812:
                                            str17 = "ۘۘۢ۠ۙۥۨۦۘۘۘۘۦۘۚۢۧۚۜۨۦۜۡ۟ۘۡۙۥۤۨۡۘۖ۟ۘۘۧۨۖۘۘۢۨۘۘۧۗۡۧۙ۠ۗ";
                                            break;
                                        case 1966096593:
                                            str16 = "۠ۘ۠ۖۘۨۘۖ۟ۖۥۨۦۗۥۘۥۥۘۘۦۦۥۘۖۢۚۚۦۨۚۖۙ۫ۦۖۗۚۥۘ۬ۘ۫ۘۢۤ۫۠ۙ۠۟ۧۜۧۗ۠۠";
                                            break;
                                    }
                                }
                                break;
                            case 309974590:
                                str16 = "ۘۚۡۘ۟ۤۧۨۡ۟ۦۨۤۧۨۛۨۧۘۦۗۨۢۤۡۘۨۢۘۘۤۖۜ۬ۗۥۦۚۢ";
                                break;
                            case 1577814648:
                                str = "ۤ۬ۢۢۡۢۙۤۤۜۢۘۘۘۡۛۗ۟ۥۨۜۘۘۜ۫۬ۦۢۡۘ۠ۨ۠۟ۙۗ۬ۙۖۘ۫۬ۦۥۦ۬ۢ۬ۙۤۤۦۚۚۦۘۥۢۡۘ";
                                continue;
                        }
                    }
                    break;
                case 908238625:
                    str = "ۘۢۨۙۗۖۢۥۤۦۚ۟۟۫ۨۙۦۡۘۥۜۥۘ۬ۦۤۤ۫۬ۥۖ";
                    dialog = dialogC4346s6;
                    continue;
                case 1085878330:
                    String str18 = "ۦۛۢ۟ۙۥۘۖۖۦۘ۬ۗۦۘۘۛۖۘۛۤۦۘۥۢۛۛۡۧۤ۫ۥۡ۠۬۬ۡ۟ۚۥۛۙۜ۫ۨۜۡۦۘۤ۬ۦۢۗۢۙۚ۬۫";
                    while (true) {
                        switch (str18.hashCode() ^ 2074242115) {
                            case -1471613081:
                                str = "ۢۖۗۛ۫ۢۧۘ۟۬ۜۜۚۨۧۘۨۗۗۧ۟ۜۘ۟ۨۗۡۤ۬ۛ۫ۚۛۥۘۦۢۘۘۖۨۙۨۙۗۙۤۛۗۗۦۘۙۧ۫ۛ۫";
                                continue;
                            case -292739092:
                                str18 = "ۘۤۨۨۢۜۘۤۢۥۘ۬ۧ۫ۜۧ۬ۙ۟ۨۘۘۙ۬ۡ۬ۤ۬ۗۖ۠ۧۡۜ۫۠ۗۚۡۘ";
                                break;
                            case 1893861988:
                                String str19 = "ۛۗۦۘ۠ۜۘۛۡۨ۬ۢۜۘۨ۟ۨۘۨۢۖۘۗۥۢۡ۫۬ۗۨۘۨ۠ۚۡۥۗ۫ۥۚ";
                                while (true) {
                                    switch (str19.hashCode() ^ 1918423920) {
                                        case -1762532722:
                                            str18 = "ۥۖۦۘۢۖۖۥۖۘ۟ۡۙ۠ۥۘۖ۫ۛۘ۟ۗۦۙۜۚۤۡۡۦ۫ۗۙ۠ۤۤۧۨۛۥۘ۬ۘۨۚۨ۬ۡ۬ۚۥۘ۠ۖ۬";
                                            break;
                                        case -99385820:
                                            str18 = "ۗۥۖۜۥۘۡۘۙۢۥ۟ۧۜۘۡۙۨۤۢ۫۠ۙ۫۫ۘۛۨۦۨ۫۬ۨۘ۠۬";
                                            break;
                                        case 1197796815:
                                            str19 = C3718b7.OooO0Oo().OooO0OO == 4 ? "۬ۘۤۘۙۨۘ۫ۢۦۘۗۥۘۘۧۜۛۡۚۨۘۚۦۦۙۗۗ۬ۙۘۘۨۗۗۤۛۤۧۜۧۘ" : "ۜ۟ۨۡۤۚ۠ۧۡۡ۬ۧۘ۠۫ۥۛۡۙۤۘۨۡۚۦۦۤۙ۬ۛ";
                                            break;
                                        case 2100608822:
                                            str19 = "ۖۢۖۘۘۛۥۤۗۛۖۥۙۘۤۘۚۛۚ۬ۤ۬ۤۡۖۡۧ۬ۡۚۤۡۚۗۛۨ";
                                            break;
                                    }
                                }
                                break;
                            case 2027423439:
                                str = "ۗۖۥۦۦۤۧۙۨۗۖۚۤۨۘ۫ۧۜۜۢ۠ۤۧۘۘۗ۠ۙۚ۫ۜۘ۟ۡۘۡۚۦۘ۟۬ۦۘۨۢۘ۠ۖۡۘۚۛۦ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case 1200277034:
                    str = "ۧۡۖۦۦۦۘۙۗ۫ۧۖۛ۠ۡۧۤۚۥۘۛۨ۫ۢۥۙۗۢۖۘۚۨۖۘ";
                    continue;
                case 1402956871:
                    o0000OOo = System.currentTimeMillis();
                    str = "ۘۚۘۘۢۛۦ۠ۚۖۘۤۚۦۤۢۗۨ۟ۖۘ۬ۨۖ۠ۨۥۘۗۜۦۘۗۨۘ";
                    continue;
                case 1502642543:
                    sb3.toString();
                    str = "ۥۜۘۗ۫ۤۧۘۦۘۢۛۦ۫ۨ۟ۖ۠ۖۥ۬ۚۚۘۥۡۢۙ۬ۚ۫ۛ۫۟۬ۥۦۘ";
                    continue;
                case 1535802841:
                    break;
                case 1567916333:
                    sb2.append("floatview_linearlayout_run ---- ");
                    str = "ۨۘۡۚۖۖۘ۠ۥ۬ۨۘ۫ۨۜۚۗۗۘۜۛۘ۬ۦۘۦۜ۠ۜۖۧۘۤۤۡۢ۠ۖۘۧۙۨۘ۫۫ۧۢۖۘۦۗۥۙۧۥۘۗ۟۫";
                    continue;
                case 1701245696:
                    viewOnClickListenerC4383t62.OooooOo = this.Ooooo00;
                    str = "ۜ۠ۜۛۢۤۧۜۘۛۗۗۢۢۛۖۚۧ۠ۙۧۜۜۗ۫ۨۥۚۡۘۛۘۖۘۧۛۡ۠۟ۚۖۧۘۚۡۨۦۡۧ۟۬۟ۡۛۤ";
                    continue;
                case 1958079801:
                    str = "ۘۢۨۙۗۖۢۥۤۦۚ۟۟۫ۨۙۦۡۘۥۜۥۘ۬ۦۤۤ۫۬ۥۖ";
                    continue;
                case 2094235140:
                    sb3.append(C3718b7.OooO0Oo().OooO0OO);
                    str = "ۜۖۖۘۘۙۤۦۧۨ۬ۨۤۤۥ۠۫ۘۘۖۤۨۘۖۡۨۧۢۚۖۘۘۜۡۖۥ۫ۘ";
                    continue;
                case 2113189710:
                    C3977i7.OooO().Oooo0o0();
                    str = "ۧۧۜۡۢۢۢۘۨۧۘۢ۫ۛۤۢۡۤ۬ۢۡ۬ۢۜۦۙ۟ۧۜۗۙۚۗۜۦۤۨۘۧۡۨۘۘۚۨ۠ۗۖۘۢ۬ۡۘۚۗۙ";
                    continue;
            }
            str = "ۦۙۡۡۢ۬ۖۚ۬ۙۦۖۛۚۘۗۜۤۚۥۧۖۥۘ۠ۤۦۚ۬ۥ";
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        String str = "ۚۖ۫ۦۜۛۗۚۨۘ۠ۢۥۘۡۚۛۨ۬ۥۘ۬ۧۚۥۡ۫۟۫ۢۨۦۖ۬ۚۢ۫۟ۛ";
        Oooo000 oooo000 = null;
        while (true) {
            switch ((((str.hashCode() ^ 818) ^ C4095le.o0000O00) ^ 146) ^ 2132804451) {
                case -1838435861:
                    oooo000 = this.o0OO00O;
                    str = "ۙۚۖۘۙ۟ۜۘۨۤۘۙۗۥۘۢۤۘ۟ۘۘ۠ۜۨۤۜۘۘۢۛۥۘۨۜۜۘۙۘۙۚۤۧۧۦۨۤۧۗۥۡۙۦۚۢ";
                    break;
                case 153116211:
                    super.onDetachedFromWindow();
                    str = "ۥۨۦۘۦۜۖۥۛۧۢۦۘ۬۟ۨۘۘۗ۬۬ۨۖۧۤۗ۫۠ۙۜۘۘۘۡۢۦۘۛ۟ۦۘۡۡۤۛۜ۟ۡۥۜۦ۫ۤۖۚۡۘ۫ۖۦ";
                    break;
                case 328184259:
                    return;
                case 732897759:
                    String str2 = "ۦۚۦۜۤۦ۠ۘۘۡ۠ۖ۟ۨ۟ۥۤ۠ۗۥۦۘۥۖ۫ۦۦۤۖ۫ۦۖۤۜۨۢۨۘ۬ۘۜۘ۠ۜۥۧۦۤۤ۫۬";
                    while (true) {
                        switch (str2.hashCode() ^ 101863504) {
                            case -790329728:
                                str = "ۢۢۡۨۜۥۘۤۛۖۘۚۨۦۘۨۖۛۦۥۜۘۜۖۦۘۥ۠ۧۧۜۢۨۜۖۘۤۤۢۦۜۥۘ۬ۧۛۧۤۜۜۚۚۗ۟ۦ";
                                continue;
                            case -260592959:
                                str = "ۜۥۦۖۨۘۡۥۦۛۙۘۛۥۡۧ۬ۨۘۥۙۖۘۤ۟ۛ۫ۡۙ۬ۤۜۛۡ۠۫ۨۢۚۧۥۧۘۘ۟ۚۖۘۧۜ";
                                continue;
                            case 723515282:
                                String str3 = "۠۫۟ۤ۟ۦۘۖ۟ۗۜ۟ۥۡ۠ۙ۬ۛۤ۠ۥۘۘۗۤۢۘۗۥۘ۠ۚۖۗۧۘۘۤ۬ۤ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-871891440)) {
                                        case -739599928:
                                            str3 = "ۗۦۖۘۛۜۛ۟ۙۚۜ۬ۥۘۡۥۘۨ۟ۗۨۡۦۙۢۘ۬ۜۗۜۗۧۢۘۖۘۨۨۦۘۖۚۥۢۡۙۢ۬ۖۘ";
                                            break;
                                        case 656397708:
                                            str2 = "۟ۛۖۘۗۗۜۘۤ۫ۥۘۙ۫ۘۙۖۢۢۜۡۤۥۘ۟ۛۧۚۢۦۘۡۚ۟ۢۜۡۢ۟ۨۘۘۥۘۖۢۚۨۙۤۦۛ۠";
                                            break;
                                        case 1268556345:
                                            str2 = "ۤۘ۬ۡۙۛۡ۫ۛۘۤ۠ۥۖ۫ۘۨ۬۟ۗۤۘۘۛۚۧۗۗۚۘۘۦۤۘۘۙۖ۫ۨۘۙۥۦۘ";
                                            break;
                                        case 1763637874:
                                            str3 = oooo000 != null ? "ۚۚۖۘۨۥۧۗۤۢۧۗۨۙۚۘۘۘۜۘۘۙۙ۟۠ۥ۫۫ۘ۠ۥۚۧۚ۬۟ۚۨۥۘ" : "ۙۙۢ۫ۖۥۘۜۥۚۢۢۧۛۗ۟ۢۜۥۗۛۨۡۨۚۥۢۗۖۥۥ";
                                            break;
                                    }
                                }
                                break;
                            case 1574308347:
                                str2 = "ۦ۬ۨ۠ۙۨ۫ۥ۠ۦۢۧ۟ۚۜۘۨۛۘۘ۫ۙۘۘۙۨۙ۠ۖۜۡۤۚ";
                                break;
                        }
                    }
                    break;
                case 959203633:
                    str = "ۦۢۨۛ۬ۖۗۡۖۖ۫ۚ۠ۨ۫ۚ۟ۜۙۧ۠ۗۘ۟ۚۖۦۛۥۜ";
                    break;
                case 1669043805:
                    oooo000.removeCallbacksAndMessages(null);
                    str = "ۢۢۡۨۜۥۘۤۛۖۘۚۨۦۘۨۖۛۦۥۜۘۜۖۦۘۥ۠ۧۧۜۢۨۜۖۘۤۤۢۦۜۥۘ۬ۧۛۧۤۜۜۚۚۗ۟ۦ";
                    break;
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        String str = "ۤ۠ۘۘ۠ۚۛۛۡ۠ۚ۟ۗۦ۟ۖۖ۬ۘۘۧۢۦۘۥۧۗۖ۬ۨۘۤ۠ۛۤۧۦۘۚۨۥۘۚۥۥۡۗ۟";
        while (true) {
            switch ((((str.hashCode() ^ 967) ^ 149) ^ 949) ^ (-292855026)) {
                case -640167963:
                    str = "ۡ۫ۜۗۦۢۖۚۜ۠۠۟ۚۤۖۜۘۘۥۦۗۜۡۘ۠۠ۙۗۛۘ۠ۘۥۢۥۘۧۗۚ۬ۧ";
                    break;
                case 530696172:
                    return;
                case 1809089188:
                    super.onFinishInflate();
                    str = "۟ۥۦۗۢۜۘۜۤۙۜۡۥۖۧ۠ۡ۠ۡۨۚۙۨۘۛۧۥۘۥۖۤۦ۠ۨۘۥۚۦ۫۠ۗۧۢ۬ۤۜۤۥۜۨۘۧ۟ۥۘۙ۫ۥ";
                    break;
            }
        }
    }

    @p10(threadMode = ThreadMode.MAIN)
    public void onMessageMainThread(MsgItem msgItem) {
        int msgType = 0;
        String str = "ۡۙ۠ۛۤۖۖ۠ۨۛۦۥۧۥۙۧۢ۟ۦۨۥ۬۫ۙ۬۬ۥۧۙۥۘۗۚۙۚۦۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 125) ^ 330) ^ 854) ^ (-314260881)) {
                case -2075289147:
                case -1392230025:
                    str = "ۦۜۢۥۢۘۘ۠ۧۨۜ۠ۥۘۢ۫ۦۧۖۜۘۚۧۤ۬ۡۨۡۥۜ۠۟ۨۗۗۖۘ۠ۢۡۘۨ۬ۛۘۛۢ۫ۖۘۥۜۦ";
                    break;
                case -1643570660:
                    String str2 = "ۦۡۚ۠ۧۨۢۨۘۘۤۤۜۘ۟ۘ۫ۛۡۙ۠۟ۨۛۤۨ۠ۖۢ۫ۙۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 1304529542) {
                            case -2041437691:
                                str2 = "ۛۡۧۜۡۧۘۢ۠ۥۘۢ۫ۗۜ۫ۨۘۖۢۜ۠ۙۦۗۦۨۘۨۛۥ۫ۖۘۘۘۜۦۢۘۜۚۤۙ۟ۘۖۘۢۦۦۘۥۨۘ";
                                break;
                            case -528509623:
                                str = "ۖۜۚ۟ۨ۫ۛ۫ۦۖۘۖۖ۠ۚۖ۬ۡۘ۫ۢ۫ۖۚۦۤۗۥۘۖۙ";
                                continue;
                            case 1344271675:
                                String str3 = "ۛ۟ۦۘۖ۟۠ۜۙۦۛۘۥۡ۬ۗ۫ۜۖۘ۠ۡۧۙۤۢۥۡۢۛۛۙ۠ۡۙۧۥۖۘۦۚ۬ۢۖۖ۟ۙ۠ۙۘۧۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1897859823) {
                                        case -803410408:
                                            str3 = msgType != 2000 ? "ۨ۬ۧۡۤۗۛۙۥۘۗ۬۠۬ۗۜ۬ۛ۟ۢۚۗۢۡۛ۠ۙ۠ۘۥۗ" : "ۡ۫ۖۥ۟ۦۘۙۦۥۡۦۖۘۥ۟ۗۦ۬ۛۨۜۦۨ۟ۘۘ۬ۙۚ۟ۨ۫";
                                            break;
                                        case -594310284:
                                            str2 = "ۨ۫۠ۖۡۦۜۨۥۘۥۚۥۘۥۚۥۗۢ۫ۗۚۛ۬ۦۘۘ۬ۢۨۧ۟۠۬۠ۨۘۖۨۛۚ۬ۖۨ۟ۧۨۧ۬۠ۢۡۨۨۚۨۡۦ";
                                            break;
                                        case -66234233:
                                            str3 = "ۥۛۧۡ۠ۦۦۥۥۘ۬ۙ۟۫۠ۦۘۖۛۜۘۛ۬ۚۧۚ۠ۜۢۢۘۗ۬ۚۚ۫۠ۤۥۘ";
                                            break;
                                        case 192150032:
                                            str2 = "ۧۦۨۙۧۨۘۧۥۛۦ۬۬ۖۚ۟ۗۚۡ۠ۙۧۚۗۙۚۚۡۘۚۤۖۦۗۨۘۚۢۢۛۨۡۘۧۛۖۘۙۛۦۤۚۖۘۗۛۙۤۛ";
                                            break;
                                    }
                                }
                                break;
                            case 1725116499:
                                str = "ۖۘۙۜۘۚ۟ۘۜۘۗۖۛۘۡۦۨۢۚۧۤۡۛۙۦۘۧۖۚۧۘۥ";
                                continue;
                        }
                    }
                    break;
                case -1179782683:
                    return;
                case -161275436:
                    String str4 = "ۢۡۙۙۗۗۜۡۗۚ۬۫۟ۘۧۥۦۘۙۥ۬ۦ۠ۜۘۧۥۨۜۢ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1920732448)) {
                            case -609566007:
                                String str5 = "ۢ۟ۨۗۤۥۘۤ۫ۥۜۢۢۙۚۥۥۜۨۦ۫ۜۘ۫۬ۨۘۜۦۨۘ۟۟۬ۤۙۢۨۦۜۘۖۡ۟۬ۡۥۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1112869015) {
                                        case -1631097138:
                                            str4 = "۟ۚۥۗۜۧۧۥۧۘۤۨۨۘۨۡۧۘۦ۬ۡۘۙۙۘۘۛ۟ۥ۬۬ۤ";
                                            break;
                                        case -1022506232:
                                            str5 = msgType != 2001 ? "ۧ۟ۤۗۘۘۚ۬ۘۘ۬ۙۙ۬۫ۙۖ۟ۧۛ۬ۗ۟ۖۨۚۨۘۘۨۗ۠ۧۤۥۡۥۖۘ۬۬ۛۨ۫ۡۘ۫ۛۨۙۡۨ۬ۗۘۘۙۡ۠" : "ۗ۫ۗۘۜۤ۬ۥۢۙۛۢۥۧۜۘۤۢۤۛ۫ۖۖۥۡۘۡۜ۬ۙۙۨۦۢ۬ۘۨۦۤۧۨۦۤۙۗۤۜۙ۟ۘۘ";
                                            break;
                                        case -601711907:
                                            str4 = "ۢۢۡ۬ۦ۫ۤۧ۫۬ۡ۫ۤۢۦۘۛ۬ۛۛ۫ۦۙ۫ۗۤۚۤۜۙۚۘۥۥۦۤۜۘ";
                                            break;
                                        case 822320974:
                                            str5 = "ۗۗۜۨۗۘۢ۫ۙ۠ۤۗۨۧ۬ۥۜۧۛۘۡۗۙۖ۟۟ۚۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1068429189:
                                str4 = "ۜۚۘۘ۫ۧۥۢۢ۬۟۟ۖۧۘۥ۠۟۟ۢ۫ۢۖ۬۬ۚ۟ۧۜ۬۟ۚ۬ۙۡۙۜۘۜۛۖۘۛۢ";
                                break;
                            case 1512835352:
                                str = "ۡۛۚۙۢۦۧۜۘۨۦۤۛۘۘۘۢ۠ۖ۬ۗۦۢۙۚۚۦۙۘ۠ۗۨۜۛۥۧ۫۬ۥۘۘ۠ۙ";
                                continue;
                            case 1650020344:
                                str = "ۧۜۡۨۛۦۘۘۥۙۙۢۡۦۖ۫ۢۤۨۡۚۗۦۚۤۘۖۖ۫ۢۡۨۙۙ۟ۦۦۦۢۗ۬";
                                continue;
                        }
                    }
                    break;
                case 188313350:
                    C3940h7.OooO0o0(null);
                    str = "ۦۜۢۥۢۘۘ۠ۧۨۜ۠ۥۘۢ۫ۦۧۖۜۘۚۧۤ۬ۡۨۡۥۜ۠۟ۨۗۗۖۘ۠ۢۡۘۨ۬ۛۘۛۢ۫ۖۘۥۜۦ";
                    break;
                case 550238743:
                    str = "ۘۜ۫ۙۦۖۤ۠ۦۥ۟۬۬۟۬ۖۖۢۦ۬۠ۘۧۘۥ۬ۖۛۖ۠ۢۧۡۘ۟ۚۡۙ۟ۗۢۢۥۘ";
                    break;
                case 1332999482:
                    this.o0OO00O.postDelayed(new OooO00o(this), C1659a.f9130f);
                    str = "ۙۥۜۛۢۛ۟ۚۥ۫ۛۚۜۦۘۢۢۜۘۗۗۦۢۤۤۧۨۛۢۗۘ";
                    break;
                case 1434612012:
                    msgType = msgItem.getMsgType();
                    str = "ۘۜۜۘۤۛۡۘ۟ۛۘۨۜۡۘۦۖ۬ۛ۟ۦۜۚ۟ۜۙۘۨۘۘۘۧۦۦ۬ۗۢۢۜۥ";
                    break;
                case 2075832220:
                    str = "ۚۛۛۖۗ۬ۘۛۖۖۜۨۘۡ۬ۜۚۨۘۦ۠ۤ۫ۜۘۧۙۤۢۢۜۛۦۦۗ۟ۨۗۥۡۘ۠ۚۥۡۙۡۖۘ";
                    break;
            }
        }
    }

    @p10(threadMode = ThreadMode.MAIN)
    public void onReceiveElfinFloatViewEvent(ElfinFloatViewEvent elfinFloatViewEvent) {
        String str = "۠۟۟ۡۗۘۜۘۙ۬ۦۘۘۚۚ۠ۤۧۥ۫ۜۦۘۥۗۨۧ۬ۖۘۤۨۙۤۚۙۘۛۨ";
        boolean z = false;
        boolean z3 = false;
        int type = 0;
        while (true) {
            switch ((((str.hashCode() ^ 532) ^ 107) ^ 449) ^ 1713758680) {
                case -1896538558:
                    str = "ۧۛۖۘ۠ۛۢۥۙۦۘۘۜۥۙۖۦۗۥۙۗۢۛۖ۠۠ۘۦ۠ۤۙۦۘۦۚۨۘ۫ۗ۟ۗۡۥۜۖۥۘۜ۟ۛ۟۠ۖۙۘۡۚۙۘ";
                    break;
                case -1821391270:
                    type = elfinFloatViewEvent.getType();
                    str = "ۛۜۜ۟۫ۖۘۥ۫ۦ۬۟ۢۜۜۧۤۚۖۙ۠ۥ۠ۥ۫۟ۦۡۘ۫۬ۡ۬۠ۡۘۗۧۡ";
                    break;
                case -1788451445:
                    String str2 = "ۡ۫ۘۥۨۡۘۡۛۢ۟ۡۘۜۡۙۘۤۜۦۖۛۡ۫ۧۢۙۥۘۘۢۖۥۦۚ۬ۚۘۚۢۘۢۡ۫۬ۜۖۘۨۨۘۘۧۡۥۘۘۥۚ";
                    while (true) {
                        switch (str2.hashCode() ^ 1593769113) {
                            case -1242507689:
                                str = "ۜۧۥۘۚۦۨۘۙۤ۟۟ۡۦۘ۫ۘۘۘۢۦۡۘۖۙۖۜۛۜۘ۠ۙۦۜۨۨۘۥۢ۫۠۟۠";
                                continue;
                            case -473112087:
                                str2 = "ۜۖۖۚۜۨۛۢۘۘۢۨ۠ۖۦۨ۠ۨۘۨۘ۬ۜ۠ۥۥ۬۫۠ۧۙۢۥۙ۬ۢ۟ۙ۫ۡۘ۟ۤۘ";
                                break;
                            case -375106822:
                                str = "ۢۛۙۦۚۡۧۧۥۤۥۖۘۢۘۚ۠ۧۘ۬ۦۚۤۦۘۨۦۛۦۦۖ۬ۚۛ۬ۡۨۧۘۜۦ۫۫ۦۙۦۢۘۘ";
                                continue;
                            case 869962842:
                                String str3 = "ۢۜۥۤۨۡۘۢ۬ۧۖۢۛۡ۫ۦۢۦۧۘۘۥۤ۬ۡۘۗۜۡۘ۬۠ۛ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1233348131) {
                                        case -945328108:
                                            str3 = "ۖ۠ۖۘۤ۠۠ۢ۠ۡۨ۟ۤۧۢۚۦۧ۫ۧۖۜ۬ۜۘۘۚۖ۠۫ۙۛۡۥۘۖۨۢۢۖۘۘ۬ۛۥ۟ۧ۟ۖۧۥۘۨۧۙۥۛۚ";
                                            break;
                                        case -848811141:
                                            str2 = "ۖۥۡۨۥ۬ۢۗۘۥۨۜ۫ۥۧۘۙۗ۫ۙۘۛۘۧۤۗۘۧۦۘ";
                                            break;
                                        case -75700730:
                                            str2 = "ۜۘۦۨۥۗۢۘۖۘۡۥۖۛۜۢۜۜۘۛۤۨۘۘۚۤۖۦۦۘۙ۠ۧ۟ۖ۫ۘ۫۟";
                                            break;
                                        case 427189125:
                                            str3 = type != 10103 ? "ۧ۠ۜۖۢۡ۠۠ۖۛۢۛۦۗۖۡ۫ۖۗۖۗۤۛۜۥۜۦۧۗ۫ۤ۬ۚ۟ۧۚۨۙۥ۠ۘۘۘۖۨۖۘۡۢۨ" : "ۘۚۜۘۢۨۙۙۧۤ۠ۥۨۘۢۡۜۘ۫ۚۦۘ۟ۥۨۢ۬ۧۙۢ۟ۗۚۘۘ۠ۙ۠۠۫۫";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1490683399:
                    z = true;
                    str = "ۤۨۥۘۙۢ۠۫۫ۤۛ۫ۦۗۜ۬ۘۥۨۗۡۘۛۜۖۘۖۖۖۘۚۨۗ";
                    break;
                case -983586670:
                    str = "ۘۦۙ۫ۧۘۘۘ۠ۖۥۨۡۘۛۖۤ۟ۨۘۨۧۡۘۘۦۖۘۨۢۗ۠ۙۜۙۥۙۗۦۜ۠ۢ۫ۖۥۘ";
                    break;
                case -519405813:
                    OoooO0();
                    str = "ۛۖۘۨۙۨۡۡۗۙ۫۠۠ۚۙ۬ۗ۬ۤۘۜۖۙۢۦۥۚۢۖۘۘ";
                    break;
                case 177743203:
                    return;
                case 352836905:
                    Oooo00O(z3);
                    str = "۫ۜۨۘۦۙۨۙۛۨۘۢۧۦۘۖۢۘۤۢۜۨۧۥۘۙۢۖۘۦ۫ۤ۫ۖ";
                    break;
                case 966916979:
                    String str4 = "ۘ۠ۛۗۙ۫ۤۧۗۛۖۙۥۨۥۘ۟ۜ۠ۧۦۙۛۥۦۧۧ۠ۨۦۘۢۧۧۜۨۘۘۜۘۨ۠۟ۢۧۖۢۜۗۛۥۥۘۘ۟۬ۗ";
                    while (true) {
                        switch (str4.hashCode() ^ 133908430) {
                            case -1611836849:
                                String str5 = "ۤ۫ۦۘۢ۫ۖۨۘۨۘۘۡۨۘۛۥ۠ۨۖ۬۬ۨۢۥۚۙۧۥۡۨۛۚ۟۟ۥۘۛۖ";
                                while (true) {
                                    switch (str5.hashCode() ^ 390308972) {
                                        case -1973741550:
                                            str4 = "ۡۥۥۘۘۤ۬ۙۜۖۙۜۡۖۖۦۛۥ۟۟ۗۜۦۡۤۨۡۘۙۙۡۘۚۚۗۡۘۦ۫۟۠ۜۧۘۙۨۥۙۘۙۖۜۙ۫۬ۨۘ";
                                            break;
                                        case -1258139639:
                                            str5 = type != 10101 ? "ۧۨ۫ۡۢۜۤ۬ۗۘۤۨۘۗۤۦۗۗۛ۬ۢۗۜۚۚۢ۫ۗۜۥۛۨۥۥۘۨۧۨۘۤۗ۟ۗۡ۬" : "۬۟ۚۛ۬ۖۘۨۖۖۘۜ۠ۚۖۤۗۥۧۦۘۜۡۦ۠ۜۦ۬ۙۘۘۜۖۥۘۘۘۧۛۡۘۚ۫۫ۤۧ";
                                            break;
                                        case 83191581:
                                            str4 = "ۖ۠ۡۘ۟ۜۗۤ۟ۘۘ۬ۖۧ۫ۛۘ۫ۗۨۙۙ۠ۦۨ۫ۜۤۘۘۨۛۡۘ۟ۡۚۤۙۚ";
                                            break;
                                        case 548209148:
                                            str5 = "ۨۦۡۘۜۜۙ۫۫ۦ۫ۥ۬ۤۥۘۘۗ۫ۤۛۨۗۦۗ۠ۨۘۖۘۚۜ۬۟ۦۡۘۡۘۛۢ۠ۥۘۖۨۜۘ";
                                            break;
                                    }
                                }
                                break;
                            case -1428173813:
                                str4 = "۠ۧۚ۟۠ۥۘۛ۠ۦۘ۫ۙۘۧۜۡۨۚۨۘۦ۠ۜۘ۫ۗۚۥۚۗ۠۫ۥۘۛۙۧۖۤۙ";
                                break;
                            case 1755707767:
                                str = "۫ۢۤ۟ۦۥۘ۠۠ۦۘ۟ۜۦۘۡ۟ۦۨۨۢۚۙۛ۠۟ۡۙ۫ۨ۫۟ۡ";
                                continue;
                            case 1914846722:
                                str = "۬ۘۤ۫ۗۥۘۖۥۖۘۧۜۥۘ۟ۜۖۤۘۜۤ۠ۨۤۡۨۘۚۘ۠ۜۧۢ۫ۦۘۦۘۖۧ۬ۛۖۘۜۘۚ۠ۖۚۖۛ";
                                continue;
                        }
                    }
                    break;
                case 1205231576:
                case 1530008737:
                    str = "ۛۖۘۨۙۨۡۡۗۙ۫۠۠ۚۙ۬ۗ۬ۤۘۜۖۙۢۦۥۚۢۖۘۘ";
                    break;
                case 1272620917:
                    str = "ۨۗۢ۠ۤۥۥۢۧۖ۟ۥۘۛۗۗۦ۬ۖۛۙ۬ۜۥ۬ۛۜۤۛ۟ۡ";
                    break;
                case 1745792866:
                    str = "۟ۛۥۥ۠ۨۘۚ۫ۗۦۦۖ۫ۤۚ۬ۡۦۘۥۧ۟ۥۨۦۡۡۥۜۙۛۡۜۤۥۦۖۢۖۗۤۦۥ";
                    break;
                case 1819556379:
                    String str6 = "ۛۡۦۘ۟ۙۢ۟ۦۖ۟۫۫ۗۗۦۘۡۨۢ۬ۨ۟ۖۜۗۚۤۘۘۨۤۨۧ۬ۘۘۛۙ۟ۧۘۦۛۢۤۨۤۦ۬";
                    while (true) {
                        switch (str6.hashCode() ^ (-1007936792)) {
                            case 401603791:
                                str = "ۛۖۘۢۛۗۘۥۧۛۜۧۛ۠۫ۨۡۙۗۤۧۜۘۘۗۗۧۢۥ۫ۤۡۨۡ۫ۘ";
                                continue;
                            case 575819987:
                                String str7 = "ۢۦۢۤۧۛۨ۠ۧ۬۬۬ۘۗۚۦ۟ۚۖ۫ۗۙۚۡۡۖۗ۠ۚۥ۬ۥۘۨۘۗ۠ۧۜۜۦۢ۫ۘ۫ۚۦۤۡۨۘ۠ۖۖ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1332647004)) {
                                        case -1174789348:
                                            str7 = type != 4 ? "ۗۥۛۗۦۖ۬ۚ۠ۨۡۡۘۤۦۘۘ۬ۨۘۖ۠۫۠ۥۨۘۚۚۥۙۦۡۘ۠ۚۘۢۨ۫ۦۖ۬۟ۤۦۘۘۖ۬ۖۙ۟ۜۛۧ۬" : "ۜۘۥۘۨۢ۟ۨۦۥۢۚۙۛ۬ۦۙۛۡۗۢۨ۠ۖۦۘۨۥۘۜۡۖۘ";
                                            break;
                                        case -255573311:
                                            str6 = "ۜۖۧۡۙۚۜۗۧۦۜۡۘۢۘۘۘۤۨۦ۬ۧۘۘ۫۠ۘۘ۫ۢ۫ۛۘۧۘۛۡۦۘ۟ۘۨۘۜۖۢۦۨۧۢۚ۟۬ۖۘۢۖۦۢۧۛ";
                                            break;
                                        case -134606765:
                                            str6 = "ۦۡۜۡۜۘۘۘۖۘۘۙۤ۠ۚۢۖۘۗ۠ۦۛۡۤۨۡۡۘۙۤۦۘۚۙۤۗۖۥۘ۬ۜۛۘ۫ۡۗ۠ۗ";
                                            break;
                                        case 605732029:
                                            str7 = "ۘۨۡۘۨۜۥۘۜۚۡ۟۫ۦ۬ۜۨۦ۫ۢۜۥۖۘ۫ۖ۟۠ۘۥۥۗۨۢۘۜ۠۠ۙۨۡۙۥ۟ۤ";
                                            break;
                                    }
                                }
                                break;
                            case 1246577051:
                                str6 = "ۖۚۜ۟ۡۘۦۙۙۧۚۖۢۙۚۗۡ۫ۢۦۧۘۘ۠ۤۘۨۥۘۢ۟ۛۙ۫۫ۡ۬ۧ۬ۤ۠ۡۛۤۚۢۛۛ۠ۧ";
                                break;
                            case 1979853321:
                                str = "ۗ۟۬ۗۧۧۥ۫ۤۗۚۖۙۡۖۚ۠ۨۘۘۢۧۚۢ۬ۤۗۤۦۧۜۤۥۦۖۥۜ";
                                continue;
                        }
                    }
                    break;
                case 1920708434:
                    str = "ۥۗۧۜ۠ۢۨۨۦۘۤ۠ۦۘۚۨۨۘ۟ۗۤۧۛۡۘۦ۬ۥۜۥۥۘۨۖۦۘۡۚۧۤۘۜۜۗۦۘۗۦۘۦۚۢۢۦ۟";
                    z3 = false;
                    break;
                case 2121724922:
                    str = "۟ۛۥۥ۠ۨۘۚ۫ۗۦۦۖ۫ۤۚ۬ۡۦۘۥۧ۟ۥۨۦۡۡۥۜۙۛۡۜۤۥۦۖۢۖۗۤۦۥ";
                    z3 = z;
                    break;
            }
        }
    }

    public void setControlbarVisiable(int i) {
        String str = "ۡۗۧۤۘۛۛۜۗ۠ۖۥۘۨۢۙۥۗۗ۬ۡۜۥ۠ۖ۠ۗۘۘۥۘ۟";
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((((str.hashCode() ^ 596) ^ 219) ^ 46) ^ (-400782652)) {
                case -1925544628:
                    setVisibility(i3);
                    str = "ۦۧ۠ۙۤۢ۬۬ۖۘۗۗ۟ۛ۟ۖۛۨۡۖۘۢۡۛۡۥۘۢۗۨۖۙۘۚ۠ۗ۟";
                    break;
                case -476373961:
                    str = "ۙۜۙۖۜ۫۟۟ۚۧۥۘ۠ۘۗۙۨۥۘۛۢۡ۟۬ۦۘۦۢۖۙۦۖۛۖۥۘۗۡ۟";
                    break;
                case -234885870:
                    str = "ۢ۠ۘۛۜ۟۟ۖۖۘ۟ۖۖۘ۫ۢۨۘ۫ۦۦۡۡۜۗۙۥۧۙۨۜۢ۟ۗۧۘۘ۫۬";
                    break;
                case -88852151:
                    i2 = 8;
                    str = "ۘۢۗۙۛۥۦۘ۟ۘۖۗۢۢۜۘۨۚۖۗ۫ۘۙۦ۬۬ۖۖ۠ۤ۠۠ۜۖۗ۟ۜۧۖۙ۠ۥۨۧۧۦۦۡۨۨۖۨ۬ۦ۠";
                    break;
                case 22648053:
                    String str2 = "ۘۛۗۥۡۖۘ۟ۚ۬ۙۙۙۤۖۙ۫ۛۢ۟ۖ۠ۙۥۧ۫ۘ۠ۤۢۛ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1341412669)) {
                            case -1809220542:
                                String str3 = "ۖۗۘۘۘۗۛۢۢ۬۠ۡۖۘۜۙ۬ۘۨۢۖۘۨۘۘ۬ۡۘۘۜ۟ۥۘۡ۠ۛ۫۠ۢۗ۠ۡۘۘۧ۫ۦۥۖۛۢۨۛۥۜۗۧۗ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1349318958) {
                                        case -1116069643:
                                            str2 = "ۨۚۚ۫ۢۡۘ۬۠ۚ۠ۧۖۘۗۚۨۘ۬ۛ۟ۙۦۥ۬ۜۘۗۚۛۨۙۜ";
                                            break;
                                        case 370877639:
                                            str2 = "۠ۢۛۢۘۦۘۖۢۗ۫ۘۘۘ۬ۡۤۙۖۗۗۡۥۘۚۤۘۘۚۜۚۢۜۘۘۦۙۖۚ۬ۥۘ";
                                            break;
                                        case 1176819070:
                                            str3 = i == 1 ? "ۦ۬ۧۨۦۖۘۘۘ۟ۢۥۦۘۦۚۘۘ۟ۗۘۘۢ۫۟۟ۡۖۘۥۦۧۖۜۨۡۤۗۡۜۘۢۤۡۘۡۦۥ۠ۥۜۘ۟ۛۥۚۢۨۘۖۜۘ" : "ۜ۠ۜۘ۬ۨۢ۟ۛۜۤۖۜۜۛۡۘۥۦۖ۟ۥ۟ۦۨۧۦ۬ۧۤ۟ۡۥ۠ۗۚۘۘ۠ۚۡۘۢۦۙ۟ۗ۟ۢۖۦۘ۠ۙۢۥۚۦۘ";
                                            break;
                                        case 1344964887:
                                            str3 = "ۙۙۥۘۛۜۥۙۖ۬ۙ۬ۥۘۚ۠ۧ۫۫ۧ۫ۜۧۘۡۜۢ۟ۙۜۖۚۚۡ۫ۨۘ۟ۤۜۥ۬ۗۨۢ۟ۘۨۛۤۦۥۙۗۗۙ";
                                            break;
                                    }
                                }
                                break;
                            case -1235820676:
                                str = "ۢۗۥۘۢۖۢۗۖۖۘ۠ۛۨۧۘۚۨ۠ۦۘ۫ۤۘ۫ۚۖۘۥۡۛۙۗۗ۬ۗ۟۟۠ۤۦۡ۫ۗ۟ۘۘ";
                                continue;
                            case -1112288412:
                                str2 = "ۚۨ۫ۛۘۙۙۛۥۥۗۘۘۗ۟ۤ۠ۦۦۦۖۤۚۨۘۨ۬ۨ۬ۙۖۦ۬ۖ۫ۙۡۘ۫۟ۜ۠ۚۡ۫۠ۘۘ۟ۡۢ";
                                break;
                            case -248513489:
                                str = "ۧۗۘۥۗۙۡۢۖۘۛۧۧۥۛۖۘ۟ۘۜۘۙۤۘۘۙۙۘۘۡۤ۫ۨۢۙۤۛ۟ۛۖ۠";
                                continue;
                        }
                    }
                    break;
                case 91766132:
                    str = "۟ۤۦۛۧۦۚ۫ۖ۟ۧۙۧۜۘۘۢۜۘۜۖ۬۟ۦ۬ۛ۟ۜ۫ۨۘ۟ۚ۫۫ۘۖۧ۟۠ۗۡۜۨۨۚ۬۟";
                    break;
                case 155821440:
                    str = "ۛۘۛۜۥۦ۠۟ۢۜۡۘۘ۬ۦۙۡۨۛۤۘۧۘ۟۠ۜۤۖۢ۬ۘۚۚ۫ۖۘۦۦۗۛۗ۬ۖۦۘۘۡۚۥۙۛ۟ۗۤ۬۟ۡۢ";
                    break;
                case 396457268:
                    return;
                case 532357618:
                    str = "ۢ۠ۘۛۜ۟۟ۖۖۘ۟ۖۖۘ۫ۢۨۘ۫ۦۦۡۡۜۗۙۥۧۙۨۜۢ۟ۗۧۘۘ۫۬";
                    i3 = i2;
                    break;
                case 791259777:
                    str = "ۨۧۦۚۛۖۢ۬ۛۗۙۛۙۙ۫ۨۥۖۗۤۗ۠ۧۖۘۜۤۨۨ۬۬ۖۦۧ۟ۤۧۧۚ۠ۚۜۤ";
                    i3 = 0;
                    break;
            }
        }
    }

    public void setIsPreventRepeatedClick(boolean z) {
        String str = "ۘۦۡۘۛۤۜۧۨ۟ۜۢۗ۠ۥۗۡۨۘ۫ۢۙۛۨۨۘۛۧۢۡۚۙۢۘ۠ۦ۠ۥ۠۬ۡۘ۫ۥۡۘۙۧۦۛ۬ۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ C2069a.f13167s) ^ 36) ^ 646) ^ (-1161469991)) {
                case -1452252057:
                    this.o0Oo0oo = z;
                    str = "ۛۖۜۘ۫ۜ۫ۧۢۖۙۡۖۥۦۗۧۤ۠ۜۗۥۘ۠ۢۜۥ۬ۥۘۨۦۛۗۛۧۗۢۘۘۘۧۥۘۥۨۤ";
                    break;
                case -940269324:
                    str = "ۗۗ۬ۜۗۗۙۖۘ۟ۦۖۘ۟۫۠ۚۙۗ۬۬۬ۜۖۨۘۧ۬ۥۘۘۜۧۚۢۧۘۧۚۘ۫ۖ۬ۡۧۜۥۨۘ۟ۗ۫ۦۚۦۢ۠ۖۘ";
                    break;
                case -768728365:
                    str = "ۚۙ۬ۗۢۡۘۨۗۡۘ۫ۧۨۘۦۛۢۛۖ۫ۢۛ۬ۦۡۜۘۡۛۨۘۥۗۘ۬ۖ۠ۙۥۖۡۥۙ۠ۧۨۥۚۥۘۘۚۖۘۨۧ۫ۦ۠ۨۘ";
                    break;
                case -549804456:
                    return;
            }
        }
    }
}
