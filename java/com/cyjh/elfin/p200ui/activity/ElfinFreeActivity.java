package com.cyjh.elfin.p200ui.activity;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.anythink.basead.p025ui.GuideToClickView;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.cyjh.common.base.activity.BaseModelActivity;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.GameSwitchInfo;
import com.cyjh.elfin.entity.MsgItem;
import com.cyjh.elfin.entity.Script;
import com.cyjh.elfin.p200ui.activity.ElfinFreeActivity;
import com.cyjh.elfin.p200ui.view.customview.RTDViewPager;
import com.cyjh.elfin.p200ui.view.viewpagerindicator.TabPageIndicator;
import com.cyjh.elfin.tools.utils.BootDexManager;
import com.cyjh.elfin.tools.utils.ThreadUtils;
import com.cyjh.http.bean.NotifyMsgBean;
import com.cyjh.http.bean.response.RegCodeInfoResponse;
import com.cyjh.http.bean.response.VersionUpdateInfo;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.umeng.commonsdk.proguard.C3471v;
import com.ywfzjbcy.R;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import mobi.oneway.export.C3580a;
import org.greenrobot.eventbus.ThreadMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import p285z2.C3678a4;
import p285z2.C3691ah;
import p285z2.C3716b5;
import p285z2.C3718b7;
import p285z2.C3753c5;
import p285z2.C3755c7;
import p285z2.C3765ch;
import p285z2.C3827e5;
import p285z2.C3832ea;
import p285z2.C3834ec;
import p285z2.C3901g5;
import p285z2.C3902g6;
import p285z2.C3951hi;
import p285z2.C3977i7;
import p285z2.C4011j4;
import p285z2.C4050k6;
import p285z2.C4091la;
import p285z2.C4095le;
import p285z2.C4125m7;
import p285z2.C4128ma;
import p285z2.C4163n8;
import p285z2.C4173ni;
import p285z2.C4238p9;
import p285z2.C4273q7;
import p285z2.C4310r7;
import p285z2.C4381t4;
import p285z2.C4385t8;
import p285z2.C4389tc;
import p285z2.C4454v3;
import p285z2.C4491w3;
import p285z2.C4496w8;
import p285z2.C4529x4;
import p285z2.C4566y4;
import p285z2.C4589yr;
import p285z2.DialogC4309r6;
import p285z2.InterfaceC3865f6;
import p285z2.InterfaceC4047k3;
import p285z2.ViewOnClickListenerC3684aa;
import p285z2.ViewOnClickListenerC3943ha;
import p285z2.j10;
import p285z2.p10;

/* JADX INFO: loaded from: classes.dex */
public class ElfinFreeActivity extends BaseModelActivity<C4091la> implements View.OnClickListener {
    public static final int o000000 = 2;
    private static final Logger o000000O;
    private static final int o000000o = 1001;
    public static final String o000OOo;
    private ViewOnClickListenerC3943ha OooooOO;
    private View OooooOo;
    private int Ooooooo;
    private NotificationCompat.Builder o00O0O;
    private NotificationManager o00Oo0;
    private ImageView o00Ooo;
    private TextView o00o0O;
    private ImageView o00oO0O;
    private TextView o00oO0o;
    private GameSwitchInfo o00ooo;
    private C4389tc o0OOO0o;
    private ViewOnClickListenerC3684aa o0Oo0oo;
    private int o0OoOo0;
    private ImageView o0ooOO0;
    private boolean o0ooOOo;
    private C4128ma o0ooOoO;
    private boolean Oooooo0 = false;
    private float Oooooo = 0.0f;
    private float OoooooO = 0.0f;
    private Handler ooOO = new OooO(this, Looper.myLooper());
    private boolean oo000o = false;
    private boolean o0OO00O = false;
    private boolean oo0o0Oo = false;
    private boolean o0O0O00 = false;

    public class OooO extends Handler {
        public final ElfinFreeActivity OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(ElfinFreeActivity elfinFreeActivity, Looper looper) {
            super(looper);
            this.OooO00o = elfinFreeActivity;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str = "۫ۢ۬۫۟ۥۦۡۖۢۘ۟ۚۧۢۖۘۢۗ۠ۜۖ۠۬ۧۧ۠۟ۦۡۘۨۡ۬ۛۦۡۡ۫ۡۘ۫۫۫ۚۤۦۥ۬";
            while (true) {
                switch ((((str.hashCode() ^ 499) ^ PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW) ^ 843) ^ 332339485) {
                    case -820878017:
                        ElfinFreeActivity.OooOO0(this.OooO00o);
                        str = "ۢۧۜۘۡۜۨۘۨۜۘۘ۫ۧۜۘۗ۫۫ۨۧۖۘۢۙۜۥۢۛ۬ۘۡۘۡۡۜ";
                        break;
                    case -706610877:
                        String str2 = "ۢۧۖۜۨۦۘۘۛۡۥۖۥۡ۟ۤ۫ۖ۬۠ۡۘۥۘ۠ۡۗ۠ۛۜۗ۠ۗۧ۬ۥۘۜۙۖۚۜۖۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 1523147276) {
                                case -983946847:
                                    str = "ۙ۠ۛۤۦۘۘۜ۬۬ۛۙ۟ۚۨ۬ۢ۬۬ۖۦۢۛ۫ۙۜۨۜۚۧ۟ۤ۫ۤۨۢۦۙ۠ۚۜۚۛۗۨ۬ۥۢۜۘ";
                                    continue;
                                case -910540064:
                                    String str3 = "ۙۘۗ۟ۜۜۖ۬ۥۖۚۦۘۡۘۤۜۚۛۢۖ۠ۨۚۦۚۗۢ۫ۦۡۤۖۥۨۖۖۖۨۨۨۙۖۡۤ۫ۤۨۘۛۖۡۘۧۤ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-11917131)) {
                                            case -1566390587:
                                                str2 = "ۢۜ۟ۡۚۚۡۚۨۘۤۘ۟۟ۛۜۦۥۖۛۚۢۚۙۖۘۜۖۡۘۦۢۗۤۖۚۙ۬ۢۡۢ۬۟ۙ۬ۖۨۡۦۥۦۘ";
                                                break;
                                            case -1038473469:
                                                str3 = 1009 == message.what ? "ۨۛۨۘۤۜ۫ۖۦ۫۬ۨۖۘۢ۠۬۫۬ۜۘۖ۫ۢ۠ۥۥ۫ۦۨ۟ۧۖۘ۫ۘۛۙۡۗ" : "۠ۖۖۙ۬ۖۘۡۜۡۘۘ۫ۥۘۜۖۚۤۗۤۙۘۘۛۢ۫۟ۙۤۖۙۜۜۗۜۘۥۨ۟ۜۜۜۘۗۗ۟";
                                                break;
                                            case -777589789:
                                                str2 = "۟ۤۡۙۖۡۛۢ۠ۨۖ۫ۖ۫ۖ۬ۜۨۛۖۙۡ۫ۘ۫ۧ۠۫ۘۖۘۗۖۧۘ۟ۡۗ";
                                                break;
                                            case 1897495990:
                                                str3 = "ۛۢۚۡۛۡۘۤۜۜۘ۫ۢۨۘۖۘ۫ۛۗۨۘ۠ۘۤ۫ۛۢۢۙۥۛ۬۠ۢۜۨ۠ۚۡ۟ۚۡۘ۫ۧ۠۠ۘۖۗۡۜ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1020958851:
                                    str2 = "ۛۡۗۥ۫۠ۚۜۚۘۦۗۥۖۦ۠۫ۖ۫۠ۙۛ۫ۨۘۚۧۚ۠ۦ۬";
                                    break;
                                case 1309186601:
                                    str = "ۢۧۜۘۡۜۨۘۨۜۘۘ۫ۧۜۘۗ۫۫ۨۧۖۘۢۙۜۥۢۛ۬ۘۡۘۡۡۜ";
                                    continue;
                            }
                        }
                        break;
                    case -669161430:
                        str = "ۨ۟ۘۘۨۗۢۥۜۧ۬ۖۗۚ۠ۨۘۙۛۘ۬ۘۤۢۛۘۗۤۘۘۘ۬ۢۥ۬ۚۜۘۛۜۧۘۡ۫ۥۘۨۥۡ۫ۦۘۘۧ۬ۡۥۗۨۘ";
                        break;
                    case -291601284:
                        return;
                    case 2129516534:
                        str = "ۚۡۢۦۡۨۘۗۦۘۘۖۤۗۥۥۘۘۚۥ۫ۡ۫ۦۧۛۤۤۚۚۚۧۨۘۧۧۥۘۖۛۖ۟ۧۡۤ۬ۥۥ۫ۦ۠۫۬ۜۚۖۘۛۦۦۘ";
                        break;
                }
            }
        }
    }

    public class OooO00o extends CountDownTimer {
        public final TextView OooO00o;
        public final ViewGroup OooO0O0;
        public final ElfinFreeActivity OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ElfinFreeActivity elfinFreeActivity, long j, long j2, TextView textView, ViewGroup viewGroup) {
            super(j, j2);
            this.OooO0OO = elfinFreeActivity;
            this.OooO00o = textView;
            this.OooO0O0 = viewGroup;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            String str = "۠ۙ۠ۥۙۦۘۦۘۤۛۜ۠ۡۘۤۧۡۙۧۘۨۡۧ۫ۤۛۛۡۘ";
            while (true) {
                switch ((((str.hashCode() ^ 540) ^ 112) ^ 800) ^ (-1799682938)) {
                    case -1618256572:
                        ElfinFreeActivity.OooOOO(this.OooO0OO);
                        str = "۠ۧ۟ۤۜۘۘ۫ۜۙۘ۬۟ۚۡۖۛۤۡۘۦۘۙۗۚۦۥۡۘۥ۫ۧۛۦ۟ۡۘۘۤ۬ۨۘۤۥۖۘ";
                        break;
                    case -1181347536:
                        return;
                    case 76864431:
                        ElfinFreeActivity.OooOOo(this.OooO0OO, false);
                        str = "۟ۘۨۜۖۥ۟ۤۙۨۖۚۚۧۘۘ۟ۚۜۘۛۦۘۨۡۨۡ۫ۖۘۙۥ۬ۙۜۜۙۜۜ";
                        break;
                    case 402488331:
                        str = "ۢ۠ۙۗۤ۠ۘۙۨۦۗۥۘۢۚۥۧۘ۫۫ۧۘۘۖ۠ۥ۫ۥۦۘۛ۠ۦۘۛۛۥۙۤۨۘ";
                        break;
                    case 816746324:
                        this.OooO0O0.removeView(ElfinFreeActivity.OooOOo0(this.OooO0OO));
                        str = "ۢۧۚۙۦۙۢۖۦۘۚۙۡۜ۟۟ۨۧۥۜۖۘۡۙۖۘ۟ۡۖۘۜۥۜۘۥ۬ۚۦ۟ۨ";
                        break;
                }
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int iCeil = 0;
            String str = "ۚۤۦ۠ۚ۬ۙۚۨۨۦۘۦۜۘۜۛۛۚ۟ۚۧ۠ۢۢۨۜۘ۠ۛۖۘۗۦۥۛۦ۟";
            StringBuilder sb = null;
            TextView textView = null;
            while (true) {
                switch ((((str.hashCode() ^ 337) ^ C1486b.f7228b) ^ 493) ^ 358299203) {
                    case -1519856648:
                        str = "ۖۨ۠ۗۜۘۘۜۡۤ۫ۜۘۘۜۡۘۘۨۡۛ۫ۚۨۦۦ۬ۢۨ۬۟ۘ۫ۢۥۧ۟ۧۘۢۜۡۘۡۨۘۘۗۙۥۨ۬";
                        iCeil = (int) Math.ceil(j / 1000.0f);
                        break;
                    case -1059743072:
                        sb = new StringBuilder();
                        str = "ۡۖۘ۟ۜۖۘ۫ۤۘۘ۟ۦۘۘۢۨ۟ۢۙۨۜۨۨ۠ۙۘۨۚۥۘۛۛۨۙۤۨ۫ۢۘۘ۠ۘۚۢۢۧۥۖۙ۠۟ۘ";
                        break;
                    case -980949857:
                        str = "۠۠۠ۛ۟ۖۛۨۜۘۤۧۚۘۡۡ۟ۥۥۨۚ۠ۚۢ۟ۚۚۥۘۘۘۜۡۥۖۜۤۧ";
                        break;
                    case -380899287:
                        return;
                    case 36933505:
                        str = "۟۫ۛۨۖۘۘۗ۬ۖۚ۫ۨۗۥۡۙۜۘۘ۫ۦ۬۠۫۠۟ۘۢۤۦۗ";
                        break;
                    case 762177405:
                        sb.append(C3471v.f18958al);
                        str = "ۡۗۨۘۨۙۥۨۘۦۜۗ۟ۘۢۧۖۢۡۜۛۦۙۡۘ۫۫ۡۘۢ۠۬ۖۤۧۙۢۗ۫۬ۖۘۚۨ۠";
                        break;
                    case 1571314091:
                        textView.setText(sb.toString());
                        str = "ۗۗ۟ۤۢ۬ۗۥۙۥ۟ۚۤۨۥۢ۬ۜ۫۬ۨۘۚۜۥۖ۬ۖۘ۟ۜۥۘۗۛۢۤۜۧۘ";
                        break;
                    case 1792773647:
                        sb.append(iCeil);
                        str = "۫ۡ۟۠ۘۖۡۜۜ۟ۢۦۘ۬ۤۨۘۦۢۚۚ۠ۥۘۧۡۧۘۤ۟ۙۡۢۧۢۜ۫ۦ۟ۘۘۡۖۨ۟ۡۦۘۛۧۛۧۚۦۘ";
                        break;
                    case 1842065903:
                        str = "ۨۢۖۘۛ۠ۥۜۛۙۦۡۨۘۦۛۥۘۥ۫ۦۘۜۙۥۘۡۤۘۘۛۨۚۜۨ۬ۜۗ۬ۗۘۧۖۘۢۙۥۜۦۤۙۙۡۖۜۦۡۘ۬ۦۧۘ";
                        textView = this.OooO00o;
                        break;
                }
            }
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public final CountDownTimer OoooOoO;
        public final ViewGroup OoooOoo;
        public final ElfinFreeActivity Ooooo00;

        public OooO0O0(ElfinFreeActivity elfinFreeActivity, CountDownTimer countDownTimer, ViewGroup viewGroup) {
            this.Ooooo00 = elfinFreeActivity;
            this.OoooOoO = countDownTimer;
            this.OoooOoo = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "ۥۦۙۛۨۡۘۨۛۖ۟ۨۗۖ۠ۢۥۢ۫ۜۢۗۜ۫۠ۜۧ۟ۗۚۙ۠ۡۛۙ۬ۜۧ۟ۢۡۛ";
            while (true) {
                switch ((((str.hashCode() ^ 436) ^ 54) ^ 735) ^ 1619162411) {
                    case -1987891808:
                        str = "ۖ۫ۛۢۢۦ۬۬ۨۘۦۦۖۘ۟ۧۡۘۤۨۡۘۢ۟ۜۘۖۖۨۙ۬ۘۥۢۜۥۨۙۦۥۢ۬ۜۡۘۧۨۜ";
                        break;
                    case -1290646212:
                        str = "ۛۜۦۘۜۤۗ۠ۛۦۘ۠ۨۜۘۛۛۦ۟ۧۡۚۙۚ۬ۚۙۤۛۡۘۘۨۥۘ۠۫۠ۡۜۥۘۧۧۨۘۛۢۦ";
                        break;
                    case -640742661:
                        ElfinFreeActivity.OooOOo(this.Ooooo00, false);
                        str = "۟۠ۨۜۢ۫ۙ۬ۡۘۤ۫ۘۧ۫ۛۚۜۤۢۖۘۖۢۖۥ۠ۜۘۥۡۖۜۦۥۢۤۨۘ";
                        break;
                    case 843309906:
                        this.OoooOoO.cancel();
                        str = "ۤۨۚۥۦۚۢ۟ۡۘۛۥۗ۫ۜ۬ۢۛۛۤۜۛۦۖ۠ۙ۠ۚ۬ۖۥۗ۠ۙۥۘ۟";
                        break;
                    case 903813080:
                        this.OoooOoo.removeView(ElfinFreeActivity.OooOOo0(this.Ooooo00));
                        str = "۫ۧ۫۬ۦۡۘۘۚۢۖ۠ۜۘ۫ۜۜۘۖۨۡ۫ۗۢۙۚۡ۫ۡۘۨۘۖۘۖۚۥ۠ۘۤۢۨۡۘۘۘۦۘۡ۠۬ۡۚۥۘ";
                        break;
                    case 1409924519:
                        return;
                }
            }
        }
    }

    public class OooO0OO implements View.OnTouchListener {
        public final ElfinFreeActivity OoooOoO;

        public OooO0OO(ElfinFreeActivity elfinFreeActivity) {
            this.OoooOoO = elfinFreeActivity;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            String str = "۬ۖۦۨۗۦۘۧۥۥۘ۫ۨۘۡۜۖۛۜۘۚۧۡۖۧۜۜۙۧۧۢۖۘ۠۠ۘۘۗ۟ۛۘۚۢۢۛۤۘۨۘۡۘۨۚۘۖۘۡۡۥ";
            int action = 0;
            while (true) {
                switch ((((str.hashCode() ^ 417) ^ 229) ^ 366) ^ 1420912823) {
                    case -2128144089:
                        ElfinFreeActivity.OooOoO(this.OoooOoO, view);
                        str = "۬ۖۥۘۘۤۧۦ۠ۦۚۜۡۦۨۘۤۚ۫ۤۨ۟ۛۜ۟ۨۨۖۘۜۦۧۗ۬ۤۥ۠ۨ۠ۦۛۗۖۘ";
                        continue;
                    case -2068538379:
                        str = "ۦ۫ۨۘۢۘۦۘۦۚۙۗ۠ۨۘۧ۠ۦۘ۠۟۟ۜ۟۬۬ۡۨ۠ۙۧۛ۬ۨۤۦۛۙ۟ۧۨۧۗۨۛۛ۫۟ۚۚ۟ۛ";
                        continue;
                    case -1505075529:
                    case -949811611:
                    case 1846628057:
                        break;
                    case -1144883080:
                        str = "۠ۖۙۚۧۙ۟ۦۜۘۖ۫ۘۧ۠ۨۘۦۜۜۘۥۚۜۛۛۜ۟ۛ۟ۨ۬ۡۤۢۨۜۤۦۘۦۙۦۥۤۙۗ۠ۘۘ۠ۚۘ";
                        continue;
                    case -952024212:
                        String str2 = "۬ۦۘۖۤ۟ۛۨۡۘۡۥۡۗۙۗ۫۬ۢۛۙۧۤ۟ۗ۫ۦ۫ۖۛۥۘ";
                        while (true) {
                            switch (str2.hashCode() ^ (-1547106104)) {
                                case -1049968277:
                                    String str3 = "ۚۥۙۢ۬ۘۘۜۛۡۘۦۥۘۥ۬۫ۚۖ۬ۡۘۨۨ۠ۘۘۨ۬ۡۤۥۜ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-288412000)) {
                                            case -1772719724:
                                                str3 = "۫ۨ۠ۨ۫۟۟ۜۘ۟ۗۨۘۗ۬ۖۚۨۡۘۙۘۘۛۢۧ۟ۧ۟ۦ۟ۚۛۚۦۘۗۙۤۙۨۧۘۗ۫ۢ۟ۘ۫ۧۗ";
                                                break;
                                            case -204181782:
                                                str2 = "ۘۥۧۗۜۧۘۛۙۦۜ۫ۦۘۧۡۥۘ۠ۤۖۘۤۖۗۚۖۦۘ۠ۨۧۗۛۥۛۚ۟ۜۧۖۘ۠ۜۤۤۢۖۘ";
                                                break;
                                            case 1825372792:
                                                str2 = "۠۫ۥۥۢۘۘ۟۟ۖۘۖ۟ۛۗۧۡۡۡۘۗ۬ۗۙۜۦۘ۫ۢۜۘۢ۠ۚ۠ۧۗۜ۫ۘۘۧۗۛ۬ۛ";
                                                break;
                                            case 1925680240:
                                                str3 = action != 2 ? "۬ۨۡۘۙ۬ۙۢۥۙۤۘۛۙۚۦۘ۠ۨۥۘۚۦۧۘۢ۠ۨۥۡۜۘۖۡۡۨ۟ۥۘۚ۫۬۟ۖۖۘۖۗۚ۠ۜ۬۟ۚۧ۫ۢۢۜۦۛ" : "ۡۚۚۜۡۦۥۗ۟ۜۚ۟ۨ۠ۛۗۜۧۥۡۜۘۛۥۛۖۛۜۘۨۨۢ۟ۥۦۘ۠ۘۤۛۛۨۘۥ۬ۚ";
                                                break;
                                        }
                                    }
                                    break;
                                case 351170476:
                                    str = "۫ۘۨۧۨۛۛ۫ۨۧ۟ۦۘۜ۟ۘۘۘۢ۬ۢۘۢۛۘۗۚۛۨۘۡۛۚۡ۟ۘۤۖۖۜۖۤۨۢ۠ۚۥ۬ۛۙۨۡ۟ۥۘۖۘ۫";
                                    continue;
                                    continue;
                                case 700534150:
                                    str = "۠ۙۧ۬ۘۧۨۦۡۘۘۚۘۜۤۖ۬ۡۢۨۖۛۤۧ۬ۜ۠ۖۖ۠ۖۚۤۥۛ۠۫ۙۘۘ۟ۚۖ۟ۥۜۘۡ۬ۚۤ۬ۜۘ۬ۧۚ";
                                    continue;
                                case 824668677:
                                    str2 = "ۡۤۜۘ۠ۨۡۛۘۡۗۙۜۘ۠ۛۖۢ۟ۦۤۢ۠ۥۢ۫ۡۚ۫ۙۗۧ۟ۗۡۚ۬۬۬ۤۢۦۙۢۜۧۘ۟ۗۨۦۘ۫۟ۦ";
                                    break;
                            }
                        }
                        break;
                    case -839215114:
                        str = "ۧۢۤۨۢۡۖ۟ۡۘۦۗۜۘۥ۠ۖۘ۫ۖۧۘ۠ۛۘۘ۫ۖۙ۟ۖۨۦۢۛ۠۟ۚۨ۟ۥۘ";
                        continue;
                    case -461645543:
                        String str4 = "ۗۖۥۨۥۤۤۙۙ۫ۤۤۦۨۢ۟ۦۦ۟۬ۤۗۘۖۘۛ۟ۨۘ۟ۨ۟ۙۛۤۦ۫۫ۢۤۥۘ۠ۡۖۤۗ۟ۖ۫ۜ۬ۗ۟ۧۨ";
                        while (true) {
                            switch (str4.hashCode() ^ (-1274769094)) {
                                case -1571740377:
                                    break;
                                case 672967154:
                                    str = "ۜۛۨۛ۟ۜۘۙۖۘۥۚۜۘ۫۫ۛۢۚۢۨۥۢۧ۟ۗۥۨۥ۟ۤۦۥۤۧۛۡۘۡۚ۬ۖۖۧۛۦۡ۫۫ۚۢۤۖۘۢۘۢ";
                                    break;
                                case 692030839:
                                    String str5 = "ۗۤۦۡۨۘۗۧۡ۫ۘۘۨۗۥۜۛۦۧۜ۟ۦۨۖۗۘۧۘۥۜۨۚ۫ۙ۟ۡۜۧۧۥۘۛۨۨۘۢ۟ۗۢ۬ۢ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-1910568738)) {
                                            case -1618278782:
                                                str5 = "ۥۛۙ۠ۥۦۘ۫۫۬ۥۧۤۥۧۘۢۙۨۘۡۘۘۜۤۖۘۛ۫ۖۜۙۦۘ";
                                                break;
                                            case -323696027:
                                                str4 = "ۜۖۢۖۖۜۤۜ۠ۥۛ۬ۦۥۧۘۢۦۖۘ۠ۧۦۧۖۗۥۖۢ۠ۜۘ۟ۜ۟ۧۛۖۘۖۡۦۘ۬۟۬ۘۡ۟ۛۛۖۤۤۖۘۧۚۢ";
                                                break;
                                            case 1766280908:
                                                str5 = ElfinFreeActivity.OooOo(this.OoooOoO) ? "ۤۜۦۘۗۨۦۧۛۜۨۤ۬ۦۘ۬ۙ۫ۡۘۨ۫ۦۘۘۡۖ۫۟ۛۖ۠ۛۡۚۜۖۨۘۘۙۤۙۚ۫ۖۜۢۜۛ۫ۨۘ" : "ۚۛ۬۠ۨۥۙ۠ۛۚۤۚۗۢۡۛۚۤۨ۬ۛ۬ۚۥۢۢ۠ۡۦۘۧۛۢۗۙۢ۟ۤۛۤۧۡۘۘۦ۬۟ۢۦۘۙۚ۬ۙۚۢ";
                                                break;
                                            case 1809196137:
                                                str4 = "ۡۡۗۡۥۨۙۜۘۢۗۙۘۜۗ۠۫۟ۚۗۜۘۦ۠ۙۦۢۨۛۨۚ۟ۧۚۦ۬ۤ۠ۚۖۥۤ۟";
                                                break;
                                        }
                                    }
                                    break;
                                case 1000925760:
                                    str4 = "ۚۡ۫۬ۧۜۘۦۥ۠ۙۡۘ۠۠ۦۘۢۜۦۘۡ۫ۢۖۧۘۘۨۙۜۘۨ۬ۥۘ۠ۗۦۘ۠ۘۨۛۡ۫ۨۧۢۗۘۦۘۡۧۡ";
                                    break;
                            }
                        }
                        break;
                    case -208047694:
                        action = motionEvent.getAction();
                        str = "ۛۛ۠ۡ۬ۤۢۡۨۘۜ۠ۖۖۢۨۘ۠ۖۡۘۜۦ۫ۛ۟ۢۚۜۡۘۤۙۧ";
                        continue;
                    case -92274989:
                        ElfinFreeActivity.OooOoOO(this.OoooOoO, view);
                        str = "۠۫۬ۦۗ۟ۢ۬ۘۘۗۡۧۘۡ۫ۡۘۗ۟ۜۘ۟ۛۛۨۛۖۛۦ۟ۥ۠ۘۚۥۚۘۡ۬";
                        continue;
                    case 459726612:
                        String str6 = "ۨۢۙۧ۫ۖۧۦۡ۫ۖۧ۬ۦۘۡۚۜۖۙۨ۠۟ۨۘۛۧۖۘۚۗۨۘۡۛ۬ۙۗۥۘۤۧۖۘ۟۬ۤۥ۟ۧۜۧ۟ۜۙۚۨۖ۠";
                        while (true) {
                            switch (str6.hashCode() ^ 709495004) {
                                case -1874424998:
                                    str = "ۨۙ۟ۥۡۚۥۥۢۤۧ۬۠۬ۥۜۛۙۦۨۘ۫ۡ۬ۥۙۘ۫ۜۥ۫ۤ۬ۢۘۖ";
                                    continue;
                                case -1212825011:
                                    str = "ۗۛۥۤۨۡ۟۫۟ۡۤۘۘۨۥۨۘۛۘۤۧ۬ۜۘۡۜ۠ۦۧۡۘۡ۬ۦۘۥ۟ۧۦۦۧۦۜۧۥۥۙ";
                                    continue;
                                    continue;
                                case -1036773523:
                                    str6 = "۟ۘۡ۬ۜۧۘۨۜۙ۫ۘۦۚ۬ۥۘۗۛۙۢۖۛۙۡۦۘۢۡۘۜۡۚ۬ۢۘۜ۠ۢ";
                                    break;
                                case -841875084:
                                    String str7 = "ۖۨۖۚۖۥ۟ۥۛۗ۫ۦۦۜۘ۫ۧۢۦۜۥۘ۬ۙۡۘۤۧۖۧۜۘۘۚۙۖۘ۫۟ۦۘۥ۟۠۟۫ۙ";
                                    while (true) {
                                        switch (str7.hashCode() ^ 997085549) {
                                            case -2134247602:
                                                str7 = action != 0 ? "۠ۦ۬ۢ۫ۛۗ۟ۨۖۜۤۨۢ۬ۗۧ۟۫ۛۨ۠ۥۡۘۧۚ۬ۜۧۦۨ۫۫ۨۗۦۘ" : "ۗۘۡ۬۫۟ۥۦۥۘۗۖۘۤۦۨۦۡۛۢۚۘۜۡ۬ۨۗ۬۠ۜۘۘۤۜۢ۫۫ۨۘۧ۟ۚۥ۠ۗ۬ۜ۠ۨۢۢ";
                                                break;
                                            case -1960374033:
                                                str6 = "ۙ۠ۥۘۧۡۧۥۗۡۘۙۜۨۦۢۘۘۤۨۛۧ۬ۡ۠۠ۥۤۗۡۘۥ۬ۘۨۥۡ۟ۢۜۘۧۖۦۘ۟ۚۖۘۛۨۤۘۡۜ";
                                                break;
                                            case -1880837993:
                                                str7 = "۫۬ۗ۫ۥ۬ۘۧۥۘۘۙۥۘۚۧ۬ۦۧۦ۠ۜۨۛ۫۬۬۠ۚ۠ۘۦۖۢۜۛۚۚ۠ۤۘۘۦ۬ۧ";
                                                break;
                                            case 2019186932:
                                                str6 = "۠ۖ۫ۛۤۢ۟ۧۚۧۘۨ۫ۜۘۘ۬ۢۨ۬ۡ۬ۤۖۛۙ۠۟ۚۘۧۢۛۧۛۗ۟۠۬ۘۘۙۧۛ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 474593621:
                        ElfinFreeActivity.OooOo0O(this.OoooOoO, motionEvent.getRawY() - view.getY());
                        str = "ۗۦۧۡ۫ۦۤۨۘۧۧۜۘ۟ۛۤۡۦ۫ۘۙۧۜۥۘۖۥۛۙۖۛۥ۫ۚۙۗۧ";
                        continue;
                    case 492688995:
                        ElfinFreeActivity.OooOoO0(this.OoooOoO, false);
                        str = "ۡۨ۟ۜۖۘۨۛ۬ۛۡۤۜۜۤ۠۟ۙۦۘۚۖۜۖۜۗۜۜۦۥۨۛۘۘۜۧۤۥۧۜۘ۟ۨۢۨۦۡۘۖۢۧ۫ۢۖۚۗ";
                        continue;
                    case 548422407:
                        ElfinFreeActivity.OooOoO0(this.OoooOoO, true);
                        str = "ۘۙۨۢۛۤ۟ۜۘۧۦۢۨ۬ۘۘۛۘۥۘۤۘۧۧۗۗۙۦۘۙۡۡۘۥۤۜ۫ۙۖۛ۬۠۬۠ۥۜۛۘۖۦۘ";
                        continue;
                    case 612823023:
                        view.setY(motionEvent.getRawY() - ElfinFreeActivity.OooOo0(this.OoooOoO));
                        str = "۫ۙۘۘ۬ۡۧۘۗ۠ۢۧ۫ۨۘۨۤ۠ۖۜۥۘۗۘۙۗۖۘۖۘۘۖۤۥۢۚۥ۠ۚۙ۠ۥۗۘۚۡۘۗ۫ۜ۟ۨۜۘ";
                        continue;
                    case 713676584:
                        String str8 = "ۦۖۨۦۘۛۢۦۚ۟ۥۥۖۨۨۜۛۨۘۛۚۤۘۦۡۘۖۡ۫۬۫ۗۚۜۛۦۡ۫ۤۛۨۘۗۖۨۘۧ۫ۥۨۗ۟";
                        while (true) {
                            switch (str8.hashCode() ^ 241928897) {
                                case -1544209366:
                                    str = "۫ۧۧۦۡ۟ۡۚ۬ۘۘۧۢۨۗۘۨۗۥۢۦۥۥ۬ۦۗۜۢ۫ۛۧۧۦۡۛۦ۬ۜۘ۠ۛۚ۟ۨۥۤۢۦۘۤ۟۟ۨۗۢ";
                                    continue;
                                case -904371563:
                                    str8 = "ۡۤۗۥۚۧۧۘۧۘۥۤ۬۫ۗ۫ۖۖۨۥۨۡۧۤ۬ۙ۫ۖۘۢۜ۠";
                                    break;
                                case 277327154:
                                    String str9 = "ۗۦۡۘ۬ۡۡۘۖۙۖۘۛ۟ۥۨۧ۫ۘۢۘۗ۬ۥۛۗۢ۟ۧ۫ۛۧۡ";
                                    while (true) {
                                        switch (str9.hashCode() ^ (-1325676454)) {
                                            case -1493274011:
                                                str8 = "ۥۜ۬ۥ۬ۡ۠ۢۜۘۜۢۦۘۢۤۡۥ۫ۖۘۚ۟ۥۗۦۛۛۚۨۘۧ۟ۗۧۨۙۤۡۘۥۙ۠ۚۨۘۘۛۙۖۤۗۖۡۚ۟۠۠";
                                                break;
                                            case -908947762:
                                                str9 = action != 1 ? "ۖۧۧۙۜ۬ۛۦۜۛۘ۟ۛۘۨۘۖۦۚۜۘۧۘۦ۠ۥۜۘۢ۟ۥۘ۫ۡۛ۬ۙۡۘۖ۫ۨۙۧۨۘ" : "ۧ۟۠ۚۦۢ۬ۛۚۜۜ۟ۤۧ۟ۡ۬۬ۨۨۘۧ۫۟ۤۦ۬ۗ۠ۨ";
                                                break;
                                            case 472895637:
                                                str8 = "ۛۙۖۤۤۨۘۜۚۦۘۧۨۖۜۧۗۧۗۦۘۦ۟ۖۛۧۨۨۦۖۚۗۙ";
                                                break;
                                            case 791608579:
                                                str9 = "ۙۡۘۦ۟ۖۘۢۤۘۙۘۘۢۗ۬ۛۚۢۢۢۚۚۢۦۙۘ۬ۦۦ";
                                                break;
                                        }
                                    }
                                    break;
                                case 896990429:
                                    str = "۬۠ۖۘ۟ۘۦۚۘۥۘۙۡۨۡۥۜۘۧۗۗ۬۫۬ۙ۟ۜۘۗۙۤۚۜۖ۠۫ۧۨۖۦۨۚۚۨ۫ۘ۟ۚۛ۬ۥ";
                                    continue;
                                    continue;
                            }
                        }
                        break;
                    case 748324390:
                        view.setX(motionEvent.getRawX() - ElfinFreeActivity.OooOOoo(this.OoooOoO));
                        str = "ۛ۟ۘۘ۟ۘۘۘۗۘ۫ۚ۬ۙۘۢۦۘۨۖۘۘۦۖۡ۬ۦۘ۬ۖۘ۬ۘۦۘۧۡۜۢۥۖۖۢۜ۠ۢۙۘۜۘ۠ۘۜۚۢۖۘۙۥ۫";
                        continue;
                    case 1614931366:
                        ElfinFreeActivity.OooOo00(this.OoooOoO, motionEvent.getRawX() - view.getX());
                        str = "۫ۢۘۥۜۨۘۦ۬ۛۙ۬ۚ۠ۚۡۘۖ۟ۖۚۖۧۚۡۧۥۘۜۦۙۚۧۧۧۘۤۗۧۢۦۘۖۖۘۧۧۥۙۗۙ";
                        continue;
                    case 1848284175:
                        return true;
                }
                str = "ۘۙۨۢۛۤ۟ۜۘۧۦۢۨ۬ۘۘۛۘۥۘۤۘۧۧۗۗۙۦۘۙۡۡۘۥۤۜ۫ۙۖۛ۬۠۬۠ۥۜۛۘۖۦۘ";
            }
        }
    }

    public class OooO0o implements Runnable {
        public final float OoooOoO;
        public final float OoooOoo;
        public final ElfinFreeActivity Ooooo00;

        public OooO0o(ElfinFreeActivity elfinFreeActivity, float f, float f2) {
            this.Ooooo00 = elfinFreeActivity;
            this.OoooOoO = f;
            this.OoooOoo = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۢ۟ۙۘۡۧۘۜۧۢ۬ۨۗۜ۠ۘۘ۟۠ۥۨۢۨۤۥ۫ۙۥۧۘۧ۠ۛ۬ۙۥۜۖۘ۬۟ۚۛۜۨۨۦۛ۫ۛۦۘ";
            while (true) {
                switch ((((str.hashCode() ^ 877) ^ UiMessage.CommandToUi.Command_Type.FW_SET_WIDTH_VALUE) ^ 34) ^ 1894082494) {
                    case -1646161147:
                        ElfinFreeActivity.OooOOo0(this.Ooooo00).setY(ElfinFreeActivity.OooOoo(this.Ooooo00) * this.OoooOoo);
                        str = "ۥ۟ۤۢۖۨۘۡۥ۫ۙ۟ۡۗۨۗۙۤۛۗۦۨۤۗ۬ۛۚۘۘۜۢۦۘ";
                        break;
                    case -1049600098:
                        ElfinFreeActivity.OooOOo0(this.Ooooo00).setX((ElfinFreeActivity.OooOoo0(this.Ooooo00) * this.OoooOoO) - ElfinFreeActivity.OooOOo0(this.Ooooo00).getWidth());
                        str = "ۖۤۨۧۦۥۘ۬ۡۨۘۦ۟ۜۘۛۦ۟ۙۖۨۢۜۡۛۨۜۨۗۡۜۡۧۘۗۘۤۢۢۛۢۚۦۘ۠ۢ۠ۧۗۨۨۜۘۡۙۛۦ۫ۙ";
                        break;
                    case 226749840:
                        return;
                    case 617724549:
                        str = "۟ۦۖۤۙۖۘۧۛۚۚۚۨۘۖۜۨۘۛ۠ۥۧۨۚۨۦۚۧ۟ۡۘۥۚۚۥۤۜۘۡۗۗ";
                        break;
                }
            }
        }
    }

    public class OooOO0 implements Observer<RegCodeInfoResponse> {
        public final ElfinFreeActivity OooO00o;

        public OooOO0(ElfinFreeActivity elfinFreeActivity) {
            this.OooO00o = elfinFreeActivity;
        }

        public void OooO00o(@Nullable RegCodeInfoResponse regCodeInfoResponse) {
            String str = "۠ۤۢۤۦ۟ۛ۬ۛۦۨۦۘۖ۫ۜۘ۠ۦۙۦۜۧ۫ۨۘۘ۬۟ۧۜۜ۬ۡ۬ۤۧۦۨۙ۠ۡۖۥۜۘۜ۬ۡۘ۬ۦ۬۠ۨۖۘۖۙ";
            while (true) {
                switch ((((str.hashCode() ^ 193) ^ UiMessage.CommandToUi.Command_Type.SET_FW_SMOOTH_VALUE) ^ 131) ^ 95740999) {
                    case -20811859:
                        return;
                    case 903325176:
                        str = "ۦۗۧۢۡۡۘۥ۫۫۫ۥۜۘۦۜۡۘ۟ۥۘۙ۠ۢۛۜۘۘۚۜۜۥۨۜۘ";
                        break;
                    case 1551493976:
                        str = "ۚ۫۬ۚۙۨۛۦۤۗۛۧۗۜۗ۫ۨ۬ۤ۟ۜۖۡۛۛۨۢ۠ۖۗۤ۟۠ۚۖۥۛۧۥۘۛۢ۠";
                        break;
                }
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(@Nullable RegCodeInfoResponse regCodeInfoResponse) {
            String str = "۬ۨۗۡۙۢۗۤۗۛۥۧۘۘ۟ۥۢۨۖۤۜ۠ۙۦۚۛۤۥۚۚۖ۫ۜۘۧۢۦۛۨۘۚۙۢۨ۫ۢ۬ۚۨۡۦ۠۟ۗۨ";
            while (true) {
                switch ((((str.hashCode() ^ 59) ^ 878) ^ 182) ^ 632325794) {
                    case -1771883214:
                        str = "ۚۛۡۧۤۗۚ۬ۘۘۥۗۚ۠۠ۤۤۛۢ۠ۛۗۢۥ۠ۛۙۤۡۙۖۘ۟ۧۘۤۢ۬۟۬ۦۘۤۗۘۘ";
                        break;
                    case -274547347:
                        str = "ۘ۟ۙۢۥ۟ۙۨۧۘۛۢۘۘ۟ۘۤۦۢۡۘۙ۠۫ۨۧۤۙۛ۬۫ۙۦۙۚۡۘۙۛۚۧۦۘۧۛۖۢۡۡۘۧ۫۠";
                        break;
                    case 214871448:
                        OooO00o(regCodeInfoResponse);
                        str = "ۢۢۚۤ۠ۛۤۦۦۧۡۥ۫ۥۥۘۦۖۘۧۘۜۛۥۦ۠ۧۜۤۙ۬ۡۨۚۢۨۨۘۖۥۧ۫۠ۜۘۖۢۗۡ۟ۥۥۖۘۢ۠۫";
                        break;
                    case 516476421:
                        return;
                }
            }
        }
    }

    public class OooOO0O implements Runnable {
        public final ElfinFreeActivity OoooOoO;

        public OooOO0O(ElfinFreeActivity elfinFreeActivity) {
            this.OoooOoO = elfinFreeActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۦۛ۫۠ۗۘۛۧ۬۠ۖۘۗۙۛۘۖۖۗۦۧۗ۟ۖۨۨۖۛۚۡۘۙۘۛۨۤ";
            while (true) {
                switch ((((str.hashCode() ^ 861) ^ 32) ^ 88) ^ (-1883979255)) {
                    case 477780482:
                        str = "۠۠ۜۦۥۡۘ۟۫ۛۛ۟ۡۖۗۢۧ۟ۨۗۜۨۥۢۨۤ۬ۡۜۡۘۘۡۨۡۘۖۘۢۘۨۥۤۡ";
                        break;
                    case 1224483291:
                        ElfinFreeActivity.OooOO0o(this.OoooOoO, false);
                        str = "ۥۧۜۘۤ۠ۦۗۤۙ۬ۥۜۘۜۢۦ۟۟ۘۘۨ۠۬ۜۗۢۥۘ۠ۘۘ۬ۚۖۚۤۥۢۗۜۛ۫ۨۘ۠۬ۨۤۦۜ";
                        break;
                    case 1895473839:
                        return;
                }
            }
        }
    }

    public class OooOOO implements Observer<VersionUpdateInfo> {
        public final ElfinFreeActivity OooO00o;

        public OooOOO(ElfinFreeActivity elfinFreeActivity) {
            this.OooO00o = elfinFreeActivity;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:320:0x001a. Please report as an issue. */
        public void OooO00o(@Nullable VersionUpdateInfo versionUpdateInfo) {
            StringBuilder sb = null;
            String str = "ۡۧۙۦۢۢۘۢۘۘۖۗۛۡۘۦ۫ۢۢۦۦۘۚۢۚۖۨ۠ۡۗۨۗۜۨۘۤ۟ۥۦۜۥۙۢۥۘۜۨۚ۠ۙ۠ۥۦ۫ۢۚۨ";
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                switch ((((str.hashCode() ^ 181) ^ 329) ^ UiMessage.CommandToUi.Command_Type.SET_TEXT_VALUE) ^ 128828539) {
                    case -2112582460:
                        ElfinFreeActivity.Oooo0o(this.OooO00o, false);
                        str = "ۘۖۖۘۡۧۛۛۤۛۧۥ۬ۙۘۢۢۥۘۥ۠ۦۚۘۘۘۗۙ۠ۦ۟ۗ";
                        break;
                    case -1981303067:
                        str = "ۤ۫ۤۚ۬ۡۥۚۡۖۤۚۧ۬۫ۙ۫ۢۡۥۜۗۚۤۚۜۨۛۦۘۡۜۦ۬۠ۙۢۨۘۖۥۦۘ";
                        i3 = i2;
                        break;
                    case -1963702221:
                        i5 = versionUpdateInfo.UpgradeMode;
                        str = "۠۠ۢ۬۟ۨۘۥۚۘۘۥۢۛۗۙۥۧ۟ۦۗۘۡ۬ۖۥۘ۬ۤۡۤۛۜۘۢ۬ۚ۟ۥۨ";
                        break;
                    case -1938101767:
                        sb = new StringBuilder();
                        str = "ۢۜۖۨۙۧۥۗۘۘۤۖۘۨۖۧۘۜۘۙ۬ۥۘ۬ۜۛۘۖۨۦۧۦۗۡۘۘۗۚ۠ۗۡ۟ۜۥ۟ۨۜۘ۫ۘۨ";
                        break;
                    case -1920929221:
                        str = "۬۟ۜۘۨ۟۟ۜۗۨ۫ۖۧۘ۟ۛۜۘۧۚۖۘۦۧۨۘ۟ۙۥۖ۟ۦۖۢۧ";
                        break;
                    case -1654900540:
                        sb.append(versionUpdateInfo);
                        str = "ۧ۟ۘ۬ۦۧۛۦۡۘۙۦ۫۟ۢۡۘۤۘۢۜ۠ۛۦ۬ۥۚۚۖۙۖۖۘ";
                        break;
                    case -1368710346:
                        C3716b5.OooO0OO().OooO0oO(versionUpdateInfo.AppVersion);
                        str = "ۧۗۦۘۤۘۚۥۘۡۘۚۧ۬ۥۦۘۙۙۘۙ۬ۨۡۧ۬ۖ۠ۢۦۖۜۘۨۘ۫ۙ۟ۢ۬ۧۙۥۜ۫ۤۦۦۘۘ";
                        break;
                    case -1266917713:
                        str = "ۡۜۧۘۤۖۗۘۨۜۙۨۧۢۤۘۘ۟ۡۡۘۧ۫ۦۤ۫ۨۧۘۛۤۦۛ۟ۜۘۥۦۖۜ۠ۚۘ۬ۘۘۛۦۥۘۛۡۨ";
                        i3 = i4;
                        break;
                    case -1262553865:
                        String str2 = "ۙ۠۫ۛۦۘۘۛۨۢۡ۟ۤۤ۬ۖۘۗۢۦۘۛۡۨۢۥۖۘ۬ۦۨۘ۫ۥ۬ۧ۫ۘۖۢۚ۫ۗۢۡۨۘۜۨۙۡۧۥۘۗ۟ۜۚۢۜۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 1179119238) {
                                case -941651559:
                                    str = "ۤۚۦۘۚۥ۫۫۬ۨ۬ۖۡۚۦ۫ۧۘۛۗۙ۟ۦۗۜۜۢ۠ۥ۟";
                                    continue;
                                case 1068738953:
                                    String str3 = "ۨ۟ۛۡۗ۠۟ۦۛۦۗۨۘ۟۬۬ۙ۬ۡۘۥ۟۫ۗۡۘۧۥ۫ۡ۠ۜۘۨ۫ۖ۬ۥۜ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-56231152)) {
                                            case -1879255706:
                                                str2 = "ۜۜۥۨۘۙ۫ۦۧۘۧۚۖۗۤۖ۠ۧۘۘۘۦۤۜۢۗۙۥۘ۠ۛۨۘۙۨۤۛۘۗ";
                                                break;
                                            case -1575315043:
                                                str3 = "۠ۙۦۨۖۧۘ۠ۙۖۜ۬ۡۘۜۙۦۧ۠۠ۛۙ۫ۗۧۡۘۖۙۛۙۖۧۜۡ۬ۜۚۖۚۙۛۡۢۜۡ۫ۛۙۛ";
                                                break;
                                            case -1342856765:
                                                str2 = "ۙۖۥۘ۠ۘۡۡۡۘۧ۬۬ۘۧۧۙۙۡۤۦۧۘ۠ۤۘۘ۠۟ۙۧۥۨ۬ۡۧۘۨۡۨۘۘۛۙۛۧۡۡۥۦۧۦۖۥۡ۬ۖۤ۬";
                                                break;
                                            case 1890106865:
                                                str3 = i5 == 1 ? "ۦۛۧۦۨۘ۬ۨۖۖۤۘۜۢۥ۟ۜۤۤۙۜۘۨۚۖۘۨ۬ۢۜۤۖ۠ۨۖ۬ۗۨۘ۬۠ۙۙۥۜۡۜۘۚۜ۟ۢ۫ۙ۟۬ۧ" : "ۧ۬ۖۘۙۥۤ۟ۨۤۥۥۙۜۢۘۘۡۡۜۡ۬ۢۘۛۚ۟ۜۘۘۜۛۜۥۡۨۘۤ۫ۦۗۘۦۘۗ۠ۧۥۦۧۨۘۧۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1115256175:
                                    str2 = "ۢۘ۟ۛۢۜۘۥۡۦۘۗۖۖۘۢۧۗۥ۬ۢۜۖۖۘ۠ۥۙۗ۠ۚۧۜ۫ۖۗۢۜۥۚۡۨۦۘۡۚۚ";
                                    break;
                                case 1192474018:
                                    str = "ۙۖۨۢۘ۫ۖۜۥۢ۬ۙ۟۫ۦۘۤۤ۬ۦۨۜۢۤۖۘۢۙۙۨۖۚۚۨۘۘ۟ۙۖ۠۠ۗۤۢۡۦۗۘۘۦ۫ۚ";
                                    continue;
                            }
                        }
                        break;
                    case -1228601253:
                        i4 = C3755c7.OooO0oo;
                        str = "ۤۗۖۛ۬ۥۘۦۜۘۘۚۡۥ۟ۗۧ۠ۜۨۘۜۜۘ۬ۜۖۘۨۡ۟ۛۦۘ۬ۧۡۘۧ۬ۦ";
                        break;
                    case -1193319155:
                        str = "ۡ۠ۡۛۖۗ۟۬ۜۘۥ۬۟ۚۛۥۤۗۖۘۜۖۘۙۘۥۘۦۡۢۨۦۦ۬ۤۘۘۡ۬ۗۗ۠ۡۘۘۚۧ";
                        break;
                    case -1080056769:
                        str = "ۘۧۡۘۛۛۥۨۚۜۘ۬ۛۖۨۥۤۥۡۥۡ۠ۨۘۨۖۢۛۨۖۘۖۨۖۘۢۛۖۦۢۘۘۡ۠ۥۘۖۦۨ";
                        i3 = i;
                        break;
                    case -1076347979:
                        String str4 = "ۨۧۥۘۗۛۘۘ۠ۜ۬ۧۥ۬ۢۜۥۜۛۖ۟ۧۙۘۦۘ۫۫ۘۤۢۥۘۢۙۘۘ۬ۙ۟";
                        while (true) {
                            switch (str4.hashCode() ^ (-581639826)) {
                                case -1074646981:
                                    str4 = "۬ۥۜ۫ۢۤۢۘۜۙۙۚ۟ۗۥۥۨۧۘۚ۟۬ۥ۟ۤۨۛۥۢۘۙۙۘ۠ۙۖۘۢۢۡ۠ۡۥۘ";
                                    break;
                                case -399381211:
                                    String str5 = "ۤۘۡۘۛۖۘۢ۠۬ۢۤۗۙۛۖۖۦۛ۬۟ۦ۟ۧۜۨۤ۫۠ۗۖۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-1242424738)) {
                                            case -213492504:
                                                str4 = "ۥۙۖۥۜۜۤ۟ۘۢۚ۬ۥ۠ۤ۠۠۟۬ۧۜ۠ۨۘ۫ۢۤۛۥۦۘۗۡۘۘۘ۠ۜۘۢ۬ۚ۟ۜ";
                                                break;
                                            case -56388836:
                                                str5 = "۟ۛۡۘۘۚۖۘۖ۬ۜۘ۬ۗ۫ۗۥ۠۬ۙۧۜۖۙۛۜۙۘۙۙ۫ۗۚۛۖۘۚ۫۟ۡۖۜۦۙۢۚ۫ۨ۫ۥ۠";
                                                break;
                                            case 12336713:
                                                str5 = versionUpdateInfo == null ? "۫ۜۡۘۥ۬ۘۘ۬ۤۦۘۨۘۙۙۙۗۦۛۥۚۢۘۙۤۙۧۗۦۘ۫ۤۦۘۢۛۡ۟ۤۖۢۖ۫ۘۚۤۡ۬ۖۘۧۧۦۥۚۥۡ" : "۫ۛۨۜۛ۫ۦ۟ۜۧۙۡۘۥۘۚ۟ۜۨۗۤۛۥ۟ۤۜ۟ۜۘۘۨ۬ۘۤۤۖۥۤۛۚۖۘۢ";
                                                break;
                                            case 1058068929:
                                                str4 = "۫ۚ۟۬ۗ۫۟ۦۖۢۗۡۘۘۚۘۘۢۖۖۡ۬ۥۦۤ۠ۦۛ۫ۡ۟ۖۛ۫ۢۨۥۦۜۡۘۦۧ۠";
                                                break;
                                        }
                                    }
                                    break;
                                case 519179338:
                                    str = "ۡۨۛۚ۬ۨۛ۠ۘۨۖ۫ۢۘۚۙ۠ۨۘ۟ۥ۠ۗ۬ۡ۟ۘۥۛۚ۠";
                                    continue;
                                case 2043083756:
                                    str = "ۦۗۧۥۙۘۙ۬ۘۘۚۤۜ۫ۛۘۤۧۜۢۧۛۙۤۤۡۘ۬ۛ";
                                    continue;
                            }
                        }
                        break;
                    case -988664687:
                        i2 = C3755c7.OooO;
                        str = "ۜۤۨ۬ۜۜۛۛۚ۫ۚۘ۬ۚۙ۠ۦۘ۫ۙ۫ۘۨ۬ۡۚۗ۠ۗۦ";
                        break;
                    case -847755340:
                        ElfinFreeActivity.Oooo0OO(this.OooO00o, new ViewOnClickListenerC3684aa(this.OooO00o, versionUpdateInfo, false));
                        str = "ۦۜۖۘۥۗۚۧ۫ۜۘۛ۠۟ۢۢۖۘۥۘۚۢۤ۬ۛۗۗۖۧۡۙۙۛۢۚ۠ۘ۟ۡ";
                        break;
                    case -438039764:
                        str = "۟ۚۜۙۡۨۡۚۛ۟ۘ۫ۜۛۗ۟ۡۧۘۥۤۤۤۙۡۘۢۖۖۜ۬ۧ۬۫ۖ۠ۦۡۛ۠۠۬ۨۧۘۛۢۘۢۖۤۥۨۖۧۥۦ";
                        break;
                    case 137385929:
                        String str6 = "ۘۡۧ۫ۘۡۘۢ۬ۙۚۡۨۡۡۧۘ۟ۛۘۘۥۗۨۘ۬۟ۥۘۛ۫ۦۘۙۜۤۘ۬ۦۤۧ۟ۢۢۜۘۨۚۘۧ۠ۚۗ۫ۙ";
                        while (true) {
                            switch (str6.hashCode() ^ 668316767) {
                                case -445401393:
                                    str6 = "ۨۗۧۢۢۨۙۦۡۨۡۦۤۡۚۥۦۘۘۗۢۚۖ۟ۡ۠ۤۘۢۜۘۙۗۙۥۦۜ";
                                    break;
                                case 8426257:
                                    String str7 = "ۤۛۙۗۙۦۘۢۛۡۘۤۤ۟۫ۚۛ۬ۤ۟ۨۛۚۘۛۥ۬ۙ۫ۖۤۙۤۡۨۘ۬۠ۡۙۡ۬ۤۖۜۚۘۨۘۚۨۧۘ";
                                    while (true) {
                                        switch (str7.hashCode() ^ (-638816437)) {
                                            case -1474818596:
                                                str7 = i5 == 2 ? "ۛۗۚ۬ۚۨۘۖ۬ۜ۠ۗۖۘۢ۬۠ۘۧۜۘۖۢۦۘۜۨۖۘ۟۬ۦۘ۬ۜۧ" : "ۚۨۘۛۛ۬ۚۚۜۥۜ۬ۧۡ۬ۖۜۧۘ۟ۧۡۘۗ۟۫ۜۡ۫ۛ۠ۜۢۘۘۜۥۨۨۛۘۘ۠۟ۤۚۚۜۥۚۡۘ";
                                                break;
                                            case 980049718:
                                                str6 = "۟۫ۖۘۘۛۡۛۢۡۘۥۖۘۤ۟ۡۘۘۗ۫ۥۛۤ۬۫ۨۘۦ۟ۖۤ۟ۙۗۨۜ۬ۧۥۚ۟ۛ۫ۢۖۜۚۡ۠ۡۧۘ";
                                                break;
                                            case 1548877957:
                                                str7 = "ۤۚۡۖۛۡۘۤۧۥۘۧۤۘۘۤۛۚۚۢۗۚۘۜۘۦۤۛۥۚۨۤۘۥ۬ۖۡۤۥ";
                                                break;
                                            case 1854839729:
                                                str6 = "ۧۜۨۡۜ۬ۡۙۢ۬ۤۙۨۗۨۗۤۛۢ۟ۨۘۘۤۦۘ۠ۡ۟ۨۡۜۥۨۥۘ۬ۙۤ۠ۥۨۘۚۡۨۘۦۘۗۘۗ۫۫ۖۘۖۚۚ";
                                                break;
                                        }
                                    }
                                    break;
                                case 268035159:
                                    str = "ۛۢۖۘ۫۫ۥۘۧۛۨ۬ۗۧۖۥ۬ۢۚ۬ۘ۠ۢۤۢۘۜۘۢۥ۟ۖۧۡۜۘۖۤۦۘۧۙۡ۠ۜ۟ۨۖۜۘۖۢۨۘ";
                                    break;
                                case 1875204284:
                                    break;
                            }
                        }
                        break;
                    case 401135381:
                        String str8 = "ۦۜۡ۬ۘۨۡۥۧۦۚۗۧۖۘۘۧۥۘ۟ۤۜۨۛۡۘۨۤۙۡۤۡۘۥۙۚۗۖۡ";
                        while (true) {
                            switch (str8.hashCode() ^ 724958274) {
                                case -1917311666:
                                    str8 = "۟ۙۦۘ۟ۧۘۙۥۙ۟۠ۚۤۢۤۘ۟ۖۘۘۦۢۥ۟ۡۘۡ۫ۡۜۢۡۘۢۦۥۘ۫ۧۜۘ۠ۜۗۢ۠ۥۘۤۤۧۥۨۘۙۧۘۤ۬ۢ";
                                    break;
                                case -1136048977:
                                    str = "۟ۥۖۘۤۨۖۘۤۘۦ۫ۖۘۙۥۖۙ۠ۖۜۧۦۜۘ۠ۚۦۘۤ۫۫ۗۥۦ۫۠";
                                    break;
                                case 1649424454:
                                    break;
                                case 1718188206:
                                    String str9 = "۠ۗۦۦۥۘۘۧۢۗۘۛ۬ۙۢۧۤۙۢۥۥ۠ۗۘۜۘ۟ۚۥۤۡۡۜۤ۬ۙۤۦۚ۫ۥۨ۟ۡۘۡۨۘۤ۠ۘۘۧۧۨۜۡۥۘ";
                                    while (true) {
                                        switch (str9.hashCode() ^ (-676463257)) {
                                            case -550308780:
                                                str9 = "ۨۦۦۢۛۦۧۘۥۘۦ۠ۜۘۛۖۡۚۖۥۧۜۙ۬۫۟۠ۦۘۖۥۤۤۛۖۘۨۙۜۘۜ۬ۨۘۛۙ۬ۧۡۥۨۗۥۘۙۘۖۘۤۦۨۘ";
                                                break;
                                            case 663660958:
                                                str8 = "۠ۖۨۡۗ۠ۛۦۘۘۦۡۙ۫ۥۖۜۛۧۤۧۨۘۜۥۦۘۢ۟ۢۙ۬ۥۘۖۧۥۙۥۤۡۤۘۜ۠۫";
                                                break;
                                            case 1389558038:
                                                str9 = 3 == versionUpdateInfo.UpdateType ? "ۦۡۚۨ۬ۗۢۦۦۜ۬ۖۘۜۥۡۙۡۚۗ۬ۙۚۗۛۦۗۤ۟ۧۚ" : "۠ۜۥۘۥۦۨۘۦۜۘۛۛ۠ۡ۠ۜۘ۫۟ۙۥۙۤۜۤۙ۟ۥ۫ۤۗۨۘ۠ۘۛ۬ۜ۫ۨۤۨ۟ۡۘۧۘۚۥۙۦ۠ۧۥۛۙۖۘ";
                                                break;
                                            case 1826755007:
                                                str8 = "ۤ۬ۥۥۦۘۚۖۨۜۥ۬ۧۨۨۘۢۖۨۤۡۥ۠۬ۨۜۢۨۘۙۨۦۛۢ۬ۦ۬ۘۘۜۜۥ۬۬ۙ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        str = "ۘۧۡۘۛۛۥۨۚۜۘ۬ۛۖۨۥۤۥۡۥۡ۠ۨۘۨۖۢۛۨۖۘۖۨۖۘۢۛۖۦۢۘۘۡ۠ۥۘۖۦۨ";
                        break;
                    case 538755246:
                        C3755c7.OooO0oo().OooO(this.OooO00o.getApplicationContext(), C3718b7.OooO0Oo().OooO0oO().getId(), i3).OooO0oO(versionUpdateInfo.UpdateUrl);
                        str = "ۡ۠ۡۛۖۗ۟۬ۜۘۥ۬۟ۚۛۥۤۗۖۘۜۖۘۙۘۥۘۦۡۢۨۦۦ۬ۤۘۘۡ۬ۗۗ۠ۡۘۘۚۧ";
                        break;
                    case 669431390:
                        ElfinFreeActivity.Oooo0O0(this.OooO00o).show();
                        str = "۫ۢۨۘ۬۬ۧۨۚۘۘۨۢۚۙۛ۠ۖۜۘۡۗۢۤ۫ۛۘۨۜۢۦ۠ۙۡۖۜۙ۠ۢۡۘۖۙۧ";
                        break;
                    case 818304335:
                        i = C3755c7.OooO0oO;
                        str = "ۡۜۗۢۥ۟ۙۜۤۨۥۧۘۧۘۢۘۘۦ۫ۙۡۗۡۤۢۖۘۗۤۘۘ۠۫ۨۘۖۦ۠۬۠ۜۘۤۗۚ";
                        break;
                    case 1082666551:
                        sb.append("getVersionUpdateInfo:");
                        str = "ۢۥۢۢۜۖۘۙ۬ۨۘۚۛۖۡۙۦۘۛ۟ۖ۟۫ۜ۫ۜۤۖ۠ۢۜۜۗ";
                        break;
                    case 1137727929:
                        AppContext.OooO00o().OoooOoo = true;
                        str = "ۦۡ۟ۚۨۦۢۙ۬ۙۖۘۘۨۚ۟۟ۘ۫ۦۘ۠ۧۙۖ۟ۖۡۛۦۢ۟۬ۥۘ۠ۛۛۥۧۘۘۜ۟ۦۛۥۜۘ۠ۚۙ۬ۡۨۘۥۚۡۘ";
                        break;
                    case 1281782687:
                        sb.toString();
                        str = "ۛۦۚۜۙۨۘۜۖۦۘۚۤۨۜ۟ۧ۠ۘۡۘۢۗۦۡۨۖۘۥۘۛۢ۠۠ۡ۫۫۬ۘۘ";
                        break;
                    case 1753269306:
                        str = "ۘۧۡۘۛۛۥۨۚۜۘ۬ۛۖۨۥۤۥۡۥۡ۠ۨۘۨۖۢۛۨۖۘۖۨۖۘۢۛۖۦۢۘۘۡ۠ۥۘۖۦۨ";
                        break;
                    case 1817363817:
                    case 1977016257:
                        break;
                    case 1829070788:
                        String str10 = "ۤۚۤۨۛۜۡ۫ۥۘۤۖۡۘۤۨۘۘۤۙ۟ۛ۟ۦۙۤ۟ۗۜۥۘۛۦ۬۫ۜۨ۠ۗۗ";
                        while (true) {
                            switch (str10.hashCode() ^ 1292626356) {
                                case -2131659089:
                                    String str11 = "ۢۥۧۘۦۜۘۘۜۚ۬ۧۦ۫ۨۘۘۜۖۦۚۖۢۖۧۡ۟ۖۥۘ۠ۛ۬ۨۧۦۘ۫ۡۛۖۘۥۘۨۖۜۦ۬ۗۖ۫ۜ۬۟ۡۘۘ";
                                    while (true) {
                                        switch (str11.hashCode() ^ (-1047257100)) {
                                            case -1096810366:
                                                str10 = "ۡۖۗۨۢۨ۟ۧۥۨۘۧۘ۬۫ۡۥۢۥ۠ۖۧۗ۬ۘۧۢ۫ۗ۟ۦ۬ۗۧ۫ۚۜۘۥۙۦۚۨۧۘ";
                                                break;
                                            case -467673782:
                                                str10 = "ۚۦ۠ۛۗ۫ۧ۠ۗۢۨۢۜۤۜۢۙۤ۬ۥۜۤۖۘۥۡۙۥۦۘۢ۠ۖۤ۟ۥۘۜۦۜۜ۫ۗ";
                                                break;
                                            case -385346506:
                                                str11 = versionUpdateInfo.UpdateType == 1 ? "ۧۢۡۦ۫ۦۥ۫ۤۦ۟ۖۘ۫ۛۦۘ۟۟ۥۜ۫ۨۘۖۢۢۡۤۧ۫ۧۥ۬ۤۥۘۢۛۛۙۘۢۨۥۦۙۚۘۧۡ۟" : "ۘۨ۟ۥ۬ۛۦ۟ۨ۠۫۫ۨۛ۬ۚۡۨۖۖۨۘۨۜ۠ۚۥۖۘۤۚۛۥۧ۬ۗۤ۬ۧۖۦ۟ۖۚۡۢۡۚۦۦۗ۟ۘۙ";
                                                break;
                                            case 1508022624:
                                                str11 = "ۤۚۗۡۢۨۧۧۗۛۖۡۘۤۚۗۦۨۘۗۦۥۘۘ۬ۧۡ۫ۖۘۢۙ۠ۦۥۙ۠ۢۚۖۨۥۘ۠ۤۡ";
                                                break;
                                        }
                                    }
                                    break;
                                case -1334502462:
                                    str = "ۛۖ۠۬ۤۢ۬۬ۥۘۚۗ۬ۡۖۗۤۚۙۥۛۚۖ۟ۨۙۙۦۘۧۗ۫ۢۛۨۘۡۡۘۙۦۘۘۖۤۥۢ۬ۛۡ۫ۛ۠ۦۨۘ۠ۖ۫";
                                    continue;
                                case 46149302:
                                    str10 = "ۦۥۘ۫ۜۦۘ۬ۦۜ۟ۗۡۥۘ۬ۙۦۜۗۡۘۥ۠ۤۢۨۨۡ۬ۧۡۤۜ۫۠ۘۨ۟۠ۧ۬ۘۘ";
                                    break;
                                case 511445529:
                                    str = "ۦۡ۟ۚۨۦۢۙ۬ۙۖۘۘۨۚ۟۟ۘ۫ۦۘ۠ۧۙۖ۟ۖۡۛۦۢ۟۬ۥۘ۠ۛۛۥۧۘۘۜ۟ۦۛۥۜۘ۠ۚۙ۬ۡۨۘۥۚۡۘ";
                                    continue;
                            }
                        }
                        break;
                    case 1858000348:
                        ElfinFreeActivity.Oooo0(this.OooO00o, true);
                        str = "ۘۗۖ۫ۥۖۘ۬ۢۘۘۘۥۘۘۥ۟۟ۡۖۖۧۡۧۘ۠ۛۡۘۥۨۤۥۥۛۤۛۙۤ۫ۤ";
                        break;
                    case 2078150057:
                        String str12 = "ۤۤۧ۫ۛۙۙۡۜۘۢۤۦۘۡۜۗۗۗۥۘۛۢۜۛۤۦۘۥۧۙ۠ۚ۬ۗۥۘ۬ۗۢۥۚ۫۠ۛ۫ۧۛۡۘ۠ۘۜۥۨۧۖۛۖۘ";
                        while (true) {
                            switch (str12.hashCode() ^ (-1349526112)) {
                                case -1663255257:
                                    str12 = "۫ۙۜۘۗۛۤ۫۟ۦ۟۬ۦۚۤ۟ۜۗۘۤۧۦۘۨ۟ۘۘۡۦۦۘ۫ۖۘ";
                                    break;
                                case -87037883:
                                    str = "ۘۛۨۦ۟ۗۜۖۘۘۚۖ۠ۨۛۖۤۚۨۘۡۨ۠ۗۖۖۘۛۜۗۥ۠ۘۧۤۡۙۦ۫ۥ۬ۙۡۦ۠ۡۖۘۚۙ۬ۦ۫ۧۛۡۥ";
                                    continue;
                                case 1016334287:
                                    String str13 = "۠۟ۤۢۗۖۧۙۘۧۨۨ۟۟ۥۘۙۨۦۘۚۗ۟ۢۖۢۦۧۚ۫ۢ۫ۢۖۗ۟ۡۘۘ۬ۧ۟ۧۡۢۤۢۦۘۜ۠۠";
                                    while (true) {
                                        switch (str13.hashCode() ^ 1340362176) {
                                            case -1759438629:
                                                str13 = ElfinFreeActivity.Oooo0o0(this.OooO00o) ? "۫۟۫۫ۙۦۤۢۨۘ۫ۤ۫ۢۦۢۚۥۚ۠ۤۗۧۡۛۤۙۛۦۘ۬۫ۨۜ۫ۨ۟ۘۧۘۛۢۘۘ" : "ۜۙۤۚۗۙ۫۟ۥۘۢۜۗۗ۠ۛۗۤۥۖۘۖۗۙۜۜ۬ۘۜ۬ۥۜ۬ۡۨۨۘۧۦ۟ۥۛۜۘۙ۟ۜ۟ۜۘ";
                                                break;
                                            case 93251510:
                                                str12 = "ۨۖۧۙ۫۠۬ۗۘۘۛۡۘۘ۠ۥۗ۠ۨۖۙۗۖۧۡۨۘۧ۬ۨۘۙۜۦۥۨۧۘۨۘۧۘۧۖۖۘۤۗۤ۟ۚۜۘۡ۬ۦۘۗۤۥۧۨ";
                                                break;
                                            case 1302386877:
                                                str12 = "۠ۛۧۛۗۦۨۛۡۘۘۚۘۤ۠ۤۜۘۖۜ۠ۦۘۚۤۡۗۙۡۘ۬ۖۢۤۛۛۡۨ۬ۛۘۘۡ۟ۢ۟ۤۨۘۛۛۤ";
                                                break;
                                            case 2020120503:
                                                str13 = "ۚۙۥۘۧۗۜۘۧۧۢۚۚۥۨۗ۫ۜۡ۫ۨۢۜۘ۬ۥۦۤۘۢۡۜۘۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1224667944:
                                    str = "ۦۛۖۥۥۥۗۤۘۛۜۗۚۖۗۡ۫ۖۚ۬ۡ۠ۗۗۗۗۨۘ۬ۛۡۤۛۙ۟ۖۛۘۡۚۖۖۖ";
                                    continue;
                            }
                        }
                        break;
                }
                return;
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(@Nullable VersionUpdateInfo versionUpdateInfo) {
            String str = "ۘۡۨۙۦ۬۠۠ۖۘۜۦۚۢۚ۫۫۬ۛۙۙۤۜۘۗۚۚ۫ۢۨۘۗۚۡۘۢ۬ۤۖۦۖۚۡۘۦۜۛۢۨۨۘ";
            while (true) {
                switch ((((str.hashCode() ^ 972) ^ 869) ^ 520) ^ 1810087286) {
                    case -1998005784:
                        OooO00o(versionUpdateInfo);
                        str = "ۗ۠ۥۤ۟ۚ۬ۧۗ۠ۛۧۦۖۨ۠۬ۙ۠ۜۥۥۡۖۘۗۜۧۘ۫ۛۥۘۚۧۚۜۦۦۘ۬۠ۡۘ۫ۚۢ";
                        break;
                    case 567444868:
                        str = "ۜۖۗۧۗۛۡ۬ۦۘۜ۟۬ۤۡۘ۠۫ۜۘ۠۠۟ۨۛ۟ۚ۟ۢۢۚۘۚ۬۠ۜ۫ۨ";
                        break;
                    case 1146816820:
                        str = "ۢۚۗۥۤۢۢۖۖۜۡۖۢ۫ۥۘۘۛۜۘۡۡۡ۬۬۫ۛۘۥۦۗۦ۫ۦۡۨۚۖۛۡۘۘۗۥۜۘ";
                        break;
                    case 2136620928:
                        return;
                }
            }
        }
    }

    public class OooOOO0 implements Observer<NotifyMsgBean> {
        public final ElfinFreeActivity OooO00o;

        public OooOOO0(ElfinFreeActivity elfinFreeActivity) {
            this.OooO00o = elfinFreeActivity;
        }

        public void OooO00o(@Nullable NotifyMsgBean notifyMsgBean) {
            ElfinFreeActivity elfinFreeActivity = null;
            String str = "ۥ۠ۗ۬ۜۦۘۚۤۘۘۙۢۜۛۚۢۚۨۡۡۧۚۦۜ۫ۚۚۘۘۧ۠ۜۘۗۢۧ۬ۥۥۘۡ۬ۘۘۢۘۧ۫ۛۚۢ۫ۦۘ";
            while (true) {
                switch ((((str.hashCode() ^ 446) ^ 895) ^ 794) ^ (-218827618)) {
                    case -1844543230:
                        String str2 = "ۦۧۙۖۦۛۚۛۧۜ۫ۜۚۡۚۧ۫ۘۚ۠ۗ۟۠ۦ۬ۖ۬ۘۡۖ";
                        while (true) {
                            switch (str2.hashCode() ^ 1084110883) {
                                case -2137883407:
                                    break;
                                case -1743038257:
                                    str = "ۤۜۦۡۗۨۘۘۘۚۛۡۙۖۙۢ۠ۚۨۘۥۘۚۦۢۤۦۤۥۨۡ۟ۘۨۛۨۧۘۦۗۤۡ۬ۚ۬۠ۡۘۖۛۦۘ۫ۢۚۜۙۚ";
                                    break;
                                case -892535719:
                                    String str3 = "ۧۘۚۚۖۧۘۡۧۨ۫ۖۚۧۙۚۨ۬ۖۜۨۢۘۡ۫ۥ۫ۧ۬۫ۘۘۤ۟۟ۚۘۖۗۨۧۢۛۦۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 939085848) {
                                            case -1887357419:
                                                str3 = "۠ۜ۟ۙۛۨۘۥۦۛۦۤۘ۟ۦۤۘۛۡۦۥۤۡۘۖۘۗۛۛۙۖۙ۟ۙۦۘ۟ۜۧۘۥۡۗ۠ۧۗ";
                                                break;
                                            case -363144098:
                                                str3 = notifyMsgBean != null ? "ۥۦۥۤۤۙۢۢۡۙۢۜۘۙۖ۠۠۠ۦۘۦۘۡۚۖۜۘۢۚ۠ۢۤ۠ۗۧۡ۫ۢۚۖ۫ۛۥۗۚ" : "ۡ۟۟ۨۖۛۡۡۤۘۙ۫ۛ۫ۘۘ۬ۘ۟ۘۡ۠ۛۤۢۗۖۛ۠ۡۘۧ۠ۦۜۘۘ۫ۜۘ۬ۦۚۤۘۛۙ۬ۡ";
                                                break;
                                            case 188220133:
                                                str2 = "ۤۡۧۢ۫ۥۘۨ۫ۛۗ۟۠ۤ۬ۡۘۙ۟ۗۙۛۦۚۖۢ۟ۡۙۡۗۤۧۜ۬ۘ۟۫";
                                                break;
                                            case 708423460:
                                                str2 = "ۤ۬ۦ۟۟ۧ۫ۛۤۖ۫ۧۚۢۥۘۤۨۥۘ۠ۥۖۘ۠ۡۡۘۡۤۡ۫ۚۧ۟ۢۜۤۙۡۛۗۚ۠ۗۢۘۜۘۗۨۛۤۛۦ۫۠ۢ";
                                                break;
                                        }
                                    }
                                    break;
                                case 2047369445:
                                    str2 = "۠ۤۨۘ۬ۛۨۢۨۘۨۗۥۘ۟ۥۖۖۥۙۚۧۙۛۛۡ۠ۦۘۚ۫ۡۥۥۛۚ۬ۛۜ۫ۗ۠ۘۚ۫ۖۜ۫۟ۚۘۤۖۧۢ";
                                    break;
                            }
                        }
                        break;
                    case -1204144987:
                        ElfinFreeActivity.Oooo00O(this.OooO00o).notify(1001, ElfinFreeActivity.Oooo000(this.OooO00o).build());
                        str = "ۢۢۘۚ۫ۤ۠ۤۤۥۗۦۙ۟ۦۘ۬ۖۘۨۘۛ۫ۖۦۜۨۘۤۘۖۘ";
                        continue;
                    case -267811030:
                        String str4 = "ۙۙ۫ۗ۫ۨۤۖ۬ۙۨۛۡۦ۠ۙۜۘۖۘۛۘ۟۠ۘۖۖۘۦ۟ۜۘۨۦۦۘ۬ۛۤۧۨۨ";
                        while (true) {
                            switch (str4.hashCode() ^ (-1904963492)) {
                                case -1103973966:
                                    break;
                                case -152400896:
                                    str = "ۧۚۘۘۛۚۧ۟ۥ۫ۨۨۦۢۤۚۦۧۜۘۛۥۡۘۛۘۦۥۢۜۘ۫ۧۨۘ۟ۗۗ۬ۖۦۘۗ۟ۚۘۚۜۧۨۜۘۨۙۛ";
                                    break;
                                case 238590608:
                                    String str5 = "۟ۤۡۘۦۙۛۤۜۢ۬ۨ۬ۧۜۡۢۖ۟۟ۘۢۘۨۘۢۙۡۘ۟ۧۧ۠ۨۦۘ۟ۚۜۘ۫ۢۚۥۧۢۨۘۥۧۢ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-1009828342)) {
                                            case -1699222173:
                                                str4 = "ۜۜۙۢۡۜۘۡۖۡۤۛۨۡۜۖۘۙۚۙ۟ۢ۫۬ۗۨۘ۬ۤ۟ۜۡۙ";
                                                break;
                                            case -905375924:
                                                str5 = "۠ۘ۠ۖۢۜۘۜۥۙۤ۫ۛۛۤۡۜۡۗۚۗۤ۟۬ۖۗۛۤۦ۬ۧۗۢۗ۬ۖۘ";
                                                break;
                                            case -882015687:
                                                str4 = "۫ۗۖۘۛۜ۫ۗ۫ۙۡۧۨۘ۟ۖۨ۬ۗۡۤ۬ۛۗ۫ۘ۫ۤۦ۬ۙۡۗۥۨۘۗۦۦۘ۫ۗۨۛۛۘۘ";
                                                break;
                                            case 2008408971:
                                                str5 = notifyMsgBean.IsSendMessage ? "ۡۗۛۜ۫ۛۙۖۛۚۘۨۗۚۙۛۗۖۗۚۜۧۜۜۙۛۨۘۦۥۥ۬ۗۖۖۜۤۜ۬ۧۚۚۛ" : "ۙۢۦۖ۠۫ۡۡۘۘ۟ۙ۠ۨ۠ۙۙۤۢ۬ۦ۟ۛۘۡ۠ۘۘۘ۟ۧۖۡۘۦ۬ۥ";
                                                break;
                                        }
                                    }
                                    break;
                                case 913389405:
                                    str4 = "ۛۡۘۘۥۧۦۚ۠ۥۚۜ۠ۤ۬ۦ۠ۗۗۡ۟ۜۛۖۨۖۖۗۢۙۜ";
                                    break;
                            }
                        }
                        break;
                    case -147468553:
                        ElfinFreeActivity.OooOooo(elfinFreeActivity, ((C4091la) ElfinFreeActivity.OooOooO(elfinFreeActivity)).OooOooO());
                        str = "ۥۨۡ۬۟ۙۥ۠ۘۘۘۚ۟ۥۚۦۘۥۡۨۥۧۜۦۛۡۖ۬ۥۗۢ۬ۥۘ۟ۚۦۘۢۥۥۘ۬ۚ";
                        continue;
                    case -69000013:
                        str = "ۥۦۥ۬۠۠ۜ۬ۡ۠ۛ۫۠ۘۡۘۥۘ۟ۙۜ۠ۧۥۢۦۜۘۨۢۙ";
                        continue;
                    case -9108003:
                        elfinFreeActivity = this.OooO00o;
                        str = "ۚۚۧۖۥۥۡۛ۫ۘۜۜۘ۫ۜۤۨۡۢۨ۫۟۟۬ۥۘ۫ۥۥۧۤۤۙۦۖۘۢۥۤ";
                        continue;
                    case 76594318:
                        return;
                    case 1131426943:
                        str = "ۘۥۘۘۦۢۥۘۖۜۦ۫ۙ۫ۘۧۜ۬ۜ۫۫ۡۚۡۨۛۖۖۥۖ۠ۦۢۥۢۨۢۜۘ";
                        continue;
                    case 1554945671:
                        ElfinFreeActivity.OooOo0o(this.OooO00o).setVisibility(0);
                        str = "ۤۢۘۗۨۚ۬ۖۢ۠ۖ۬۟۟ۘۢ۫ۧۦ۬ۤ۟۫ۜ۬ۗۤۡ۠ۢ";
                        continue;
                    case 1975599766:
                        ElfinFreeActivity.Oooo000(this.OooO00o).setContentTitle(notifyMsgBean.NoticeTitle).setTicker(notifyMsgBean.NoticeTitle).setContentText(notifyMsgBean.NoticeTitle);
                        str = "ۛۜۜۘۢۡۧۘۚۥۜ۟ۘ۫ۗۛۦۗۜۨۘۡۧ۬ۘۙۦۨۥۙۡۚۥۘ";
                        continue;
                }
                str = "ۢۢۘۚ۫ۤ۠ۤۤۥۗۦۙ۟ۦۘ۬ۖۘۨۘۛ۫ۖۦۜۨۘۤۘۖۘ";
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(@Nullable NotifyMsgBean notifyMsgBean) {
            String str = "ۗ۠ۘۘۛۦ۠ۗۤۘۦ۟ۢۗۢۘۤۚۦۜۤۡۤۜۦۧۢۗۧۢ";
            while (true) {
                switch ((((str.hashCode() ^ 786) ^ 578) ^ 867) ^ (-1016796227)) {
                    case -1867305527:
                        str = "ۧۨۘۛۢۦۢۜ۫ۗۖۚۡۦۨۘۘۧۡۡۘۘۨۖ۬۠ۡۨۘۛۤۧۜۙۦۘ۟ۜۡۗ۬ۙۦۦ۟";
                        break;
                    case 70498051:
                        return;
                    case 685858459:
                        str = "ۦۗۘۘۛۢ۬۟ۨۗۖۧۦۘۘ۠ۥۘۡۤۜۨۛۖۘۙۚۨۚۜ۫۬۬ۖۘۥۛ۫ۖۦۜۘ";
                        break;
                    case 878290821:
                        OooO00o(notifyMsgBean);
                        str = "ۙ۠۟۟ۜۡۘۙۦۜۘۧۡۘۥۜۥۘۧۡۧ۟ۡۘ۠ۜۦۘ۬ۛۡۘۜۖۥۘۡۗۚۧۚۧ";
                        break;
                }
            }
        }
    }

    public class OooOOOO implements Observer<Integer> {
        public final ElfinFreeActivity OooO00o;

        public OooOOOO(ElfinFreeActivity elfinFreeActivity) {
            this.OooO00o = elfinFreeActivity;
        }

        public void OooO00o(@Nullable Integer num) {
            String str = "ۘ۟ۜۦۡۖۘۚۗۚۛۨۥۘۥ۫ۜۘۛۜۡۘ۬ۗۘ۫ۙ۫ۧۨۨۦۥۤ۠ۚۘۘۗۡۧۘ";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.LOAD_PROFILE_VALUE) ^ 322) ^ 841) ^ 928236119) {
                    case -746972589:
                        str = "ۖۙۥۘۗۢۧۗۘۘۘۤۚۦۚۙۜۘۙۨۨۘ۟ۧۜۘۜۗ۫۟۠ۢۤۧۙ";
                        continue;
                    case -417649587:
                        str = "ۡۥۛۖۛۦۘ۬ۖۖۡۚ۫ۙۤۤۢۖۤۙۚۦۘ۠ۚۥۘۧۨۥۘۢۛۡۜۡۚ۫ۡۘ";
                        continue;
                    case -213831390:
                    case 853585202:
                        break;
                    case 402584637:
                        ElfinFreeActivity.OooOO0(this.OooO00o);
                        str = "ۜۧۧۗ۟۠ۗۨ۠ۛۡ۬ۡۡۡۢۗۖۘۨۧۨۤۛۥۜۧۛۘۗۥۘۛۢۨۖۡۖۘ۟ۧۡۖۙ۫ۛ۫ۧۤ۟ۤ";
                        continue;
                    case 623011697:
                        return;
                    case 1138321321:
                        String str2 = "۠ۜۢۤۤ۫ۥ۟ۖۘۥۡۗۚۧۛۧۡۛۘۤۨۦۦۛۜۤ۬ۡۚۨۘۜۢۨۖۦۨ";
                        while (true) {
                            switch (str2.hashCode() ^ 1319896616) {
                                case -1507112516:
                                    str = "ۙۚۦۘۦۨۡ۬ۦ۫ۥۘۡۘۜۚۥۘۛ۠ۢۘۢۛۢ۠۫۫۫ۜۘۦۗۧۘۙۗۨۙ";
                                    continue;
                                    continue;
                                case -940625153:
                                    String str3 = "۫ۜۡۗۘۘۘۨۥۢ۫ۗۨۘۚۗۨ۟ۦ۬۫ۢۚ۬ۜۘۘۤۙۤۥۘۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-1624395763)) {
                                            case -1884297234:
                                                str2 = "۟ۜ۟ۡۧۗۙۘۛ۟۟ۘۘ۫ۤۦۘۗۖ۟ۨ۬۬ۜۦۥ۫ۤۚۚ";
                                                break;
                                            case -76155000:
                                                str3 = "ۨۙۚ۟ۡۖۚ۬۬ۡ۬ۘ۟۟ۜۘ۫ۙۢۢۨۧۘۘ۠ۥۘۤۦۥۘۨ۫ۢۗۨۡۘۘۘۙۦۚۖۚۚ۫ۗ۫ۘۢۦۘۧۡ۬ۚۚۜ";
                                                break;
                                            case 992425458:
                                                str3 = 1007 == num.intValue() ? "۬ۧۡ۟ۡۛۙۢۘۙۢۢۤ۠ۜۘۗۡۘۗۢۦۖ۬۬۟ۨۡۧۚۗۖ۫ۜ۫ۥۙۗۜۚۗۖۡ" : "۫ۗۦ۫۠۠۫ۡۥۚۧۨۙۙۘۧ۬ۡۘۚۡ۫۫ۙ۫ۡۚۖۘۖۨۘۘۙۧۚ۠ۢ۟ۖۗۨۘۘۜ";
                                                break;
                                            case 1607755579:
                                                str2 = "ۥۚۖۚۙ۠ۡۧۢۡ۬ۤۖۧ۬۟ۢۢ۟ۧۨۡۨۖۘۖۛۛ۠۫ۙۙۢۗۤۛۨۘۗۜۨ۠ۢ۠ۡۧۘۢۢۗۛۨۘۥ۠۫";
                                                break;
                                        }
                                    }
                                    break;
                                case -290579594:
                                    str = "ۗۗۦۘۡ۠ۘۘۖ۟۠ۚ۠ۨۘۘۗۚ۠ۥۖۘۤ۟ۦۥۗۗۨۗۡۘۦۜۖۖۚۗ۠۟ۨۤ۬ۧۙۗۥ";
                                    continue;
                                case -125618638:
                                    str2 = "ۢۗۖۘۗۢۦۥۜۧۘ۟ۨۤۛ۠ۘ۠ۨۜ۬ۡۨ۠ۥۧۢۧۨۘ۠ۘ۠ۦۖۦ۟ۥۥۢ۬ۚۜۢۗ";
                                    break;
                            }
                        }
                        break;
                    case 1606828675:
                        String str4 = "ۢۤ۫ۙۨۧ۠ۡۘۢۨۘۘۖۧۨۘ۟ۤۦۘ۬ۙۤۘۧۥ۫ۦ۠ۚۗۜۨۙۡۦۗۧ";
                        while (true) {
                            switch (str4.hashCode() ^ (-1114033601)) {
                                case -663402344:
                                    str4 = "ۤۢۘۘ۫ۖۧ۬ۘ۟ۙ۟ۛۗۛۙۡ۫ۧۚۘ۟ۨۜۨۙۨۥۥ۠ۙۤۙۥۘۛۢ۬۟۫ۦۘۙۢۘۘۗۥۚۛۥۘۘ۫ۦۧۢۨۦ";
                                    break;
                                case -601306918:
                                    String str5 = "ۡۢۨۢۙۖۘۖ۫۟ۢۥۜۢۤۥ۠ۧۙۗ۟ۦۛۛۘۘ۬۬ۜۛۡۜ۫ۚ۠ۙۥۤ";
                                    while (true) {
                                        switch (str5.hashCode() ^ 190535173) {
                                            case -1978383099:
                                                str5 = "ۡۦ۬ۢۗ۫ۢۗۖۘۛۚۧ۠ۚۦۘۙۢۘۥۤۢۛۚۗۙ۫۫ۛ۠ۙ";
                                                break;
                                            case -977341628:
                                                str5 = 1008 == num.intValue() ? "۟ۙۥۤ۫ۘۙۜۢۗۜۘۘۖۤۨۢۖۢۨۨۥۘۥۚۖۘۨ۬ۥۤ۟ۦۦۤۘۘۚ۬ۖ" : "ۡ۫ۛۦۢۚۥۨۚۧۖۜۘۦۡۦۘ۟ۙۤۜ۫ۦۘ۠۟ۜ۠ۧۦۘۗ۬۬ۦۧۘۚۚۘۜۚۨ۬ۧۤۢۧۢ۟ۢ۫ۨۙۙۜۦۘ";
                                                break;
                                            case 190955966:
                                                str4 = "ۢۘۘۘۡ۬۟ۙۢۦۘۗ۟۬ۦۢۡۘۡۗۜۘ۟ۤۖۘۛ۠ۥۘۘۦ۠۬ۤۡۚ۠ۖۘۙۚۖ";
                                                break;
                                            case 440747156:
                                                str4 = "ۛ۟ۢ۫ۗ۟۠ۡۢۡۤ۠ۨۘۘۙ۬ۜۥ۫ۗۚ۫۠ۜۦۘ۫۬ۡۘۚۦۛ۬۟ۨۘۢ۠ۥۘۧۖۗۦۤۘۘۨۦ۫ۚۜۦۘ۠۬ۥۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case -360285674:
                                    str = "ۖۚۥۘۦ۫ۚۨۚۦۤۗۙۗۖ۬۬ۜۜ۟۬ۢۗۜۖ۠۬ۜۘۜۛۘۡۥۡۘۡۙۘۘۙۜۦۘۢ۠ۜۘ";
                                    break;
                                case 1814070840:
                                    break;
                            }
                        }
                        break;
                    case 1788329066:
                        ElfinFreeActivity.OooOO0O(this.OooO00o).OooOo0O(C4273q7.OooO0o0().OooO0o(), 0);
                        str = "ۜۦ۟۠ۤۤۧ۠ۛۚ۠ۦۛۖ۟ۚۜۜ۟ۥ۟ۗۥۤ۬ۚۚ۠ۖۘ۠۬ۙ۫۬ۜۤ۟ۧۖۥۨۘۘۘۜۘ۬ۙ۫ۛ۬ۨۘۗۜۤ";
                        continue;
                    case 1847358907:
                        String str6 = "ۤ۟ۘۘۘۜۗۖۤ۟ۧ۬ۥۘۢۘ۠ۚۜۗۚۗۚۧ۬۫ۛۜۢ۬۟ۘۚۥۘ۟ۢۧۦۨ۟ۛۛ۟ۚۙۙۥ۬ۨۘۢۡۤۖ۟۬";
                        while (true) {
                            switch (str6.hashCode() ^ (-128863324)) {
                                case -82328715:
                                    str = "ۨۗۚ۟ۛۥۘ۠ۥ۫۠ۤۦۦۘۦۡۨۨۘۥ۬ۨۢۙۘۘ۠ۧۨۘۙ۠ۢ۠ۦۧۘۥ۟ۥ۬ۛۗۨ۬ۥۘ";
                                    continue;
                                case 384252158:
                                    str = "ۥۘۜۧۚۖۢۢۜۖۨۧۘۥۖۤۧ۬ۘۨۙۛۜۨۘ۬۫ۙ۫ۦۜۡۧ۠ۜۛۨۢۙۗۡ۫ۖۘ";
                                    continue;
                                    continue;
                                case 1649903298:
                                    str6 = "ۧۨۢ۫ۡۡۦ۬ۙۨۜ۫ۥۘۦ۟ۤۙ۠ۨۤ۠۠۬ۙۤۖۘ۠۟ۗ۠ۙۥۙۜۛ۫ۢۗ۟ۙۜ";
                                    break;
                                case 1761027881:
                                    String str7 = "ۢ۬ۚۚۧ۠ۚۡۨۛۢۛ۬ۘۚۢ۟ۖۘ۬ۛۖۘۙۡ۠ۥۦ۠ۖۜۗۜ۟ۧ۟ۚۜۘۡۜۢۤۡۨۥۨۨۘۗۛۤۦۚۦۗۨ";
                                    while (true) {
                                        switch (str7.hashCode() ^ (-2100015166)) {
                                            case -1387253782:
                                                str6 = "۟ۧ۠ۗۛۘۥۚۙۥ۟۬ۚۖۚۙۖۘۥۜۨۘۦۚۡۘۙۡۧۘۡۢۘۧ۟۠ۢ۟ۧۖۤۡۘۗۤ۠۬ۢۨۘۨۥۜۘ";
                                                break;
                                            case 843545272:
                                                str7 = "ۘۨ۠۬ۙۥۗۤۛ۠ۤۖۙۧۖۜۛۖۘۙۨۖۘۖۛۡ۠ۖۚ۠ۢۨۘ";
                                                break;
                                            case 990075745:
                                                str6 = "ۡۨۡۘۧۥ۫ۧۙۘۡۥۢۧۙۤۤۗ۟ۜۘۧۨۦۜۛۨۘۤ۟ۖۤۙۘۘ۫۬ۙۡ۟ۡۙ۠ۢۤۦۚۡۦۗ";
                                                break;
                                            case 1910220369:
                                                str7 = 1006 == num.intValue() ? "ۧۢۦۡۖۧۘۘۙۘۘۚۖۘۘۢۗ۠ۧۦۘۦۡ۟ۖۚۗۚ۫۠ۗ۟ۦ" : "۬۫ۡۤۗۨۘۡۜۤۤۖۘ۬ۚۦۘۜۗۨۘۜۥۛ۠ۘۧۗۦۘۦ۫ۧ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1943861869:
                        ElfinFreeActivity.OooOOO0(this.OooO00o).OooO0OO(this.OooO00o);
                        str = "ۘ۟ۢۦۥۜۘۚ۟ۛۘۚۥۤۦۛ۫ۦۨۘۛۗ۠ۙۤۢۗۦۦۢ۠ۥۘ";
                        continue;
                }
                str = "ۘ۟ۢۦۥۜۘۚ۟ۛۘۚۥۤۦۛ۫ۦۨۘۛۗ۠ۙۤۢۗۦۦۢ۠ۥۘ";
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(@Nullable Integer num) {
            String str = "ۨۙۖۘۛ۠ۜۘ۠ۖۙۧۗۜۧۜۙۙۚۨۘۚۗۧۢۛۥۘۘۡ۟ۜۚۤۛ۫ۗ۬ۥۘۥۗۛۦۡ۠ۤۨۜۘۧۚۘۘ";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_CHECK_BOX_VALUE) ^ C4589yr.OooO0O0) ^ 244) ^ (-359656333)) {
                    case -1390597409:
                        str = "ۙۦۧۙۛۗۧۙۤ۟۫ۛۛۙۦۤۢۘۘۨۧ۫ۡۙ۫۫۟ۨۘۘۚۨۛۘۥۖۧۘۖۤۗۡۘۘۘۖ۫ۜۘۨۥۦۘۦۙۘۙۗۤ";
                        break;
                    case -642095681:
                        str = "ۦۧۦ۫ۘۦۘۙۛۛ۫ۚۜۘۗۢۤۜۙۡۘۨۧ۟۠ۧۦ۟۠ۤۛۜۙۢۛۧۧۛۤۧۚۥۘ۟ۘۖۘ";
                        break;
                    case -602335832:
                        return;
                    case 153543982:
                        OooO00o(num);
                        str = "ۗۚۖۘۡۨۜۜۘۖۘ۟ۤۖۘۘ۟ۨۘۗۥۜۡۖۢۜۗۜۙۖ۟ۡ۫ۨ۟ۨۘ۬ۤۗ";
                        break;
                }
            }
        }
    }

    public class OooOo implements ViewOnClickListenerC3943ha.OooOOOO {
        public final ElfinFreeActivity OooO00o;

        public OooOo(ElfinFreeActivity elfinFreeActivity) {
            this.OooO00o = elfinFreeActivity;
        }

        @Override // p285z2.ViewOnClickListenerC3943ha.OooOOOO
        public void onFinish() {
            String str = "ۥۨۢۙۜۥۚۛۥۘۥۛۛۡۙ۟ۜ۠ۜ۬ۧۥۘۡۘ۫ۨۦۜۧ۬ۡ";
            while (true) {
                switch ((((str.hashCode() ^ 991) ^ 125) ^ 556) ^ (-442373081)) {
                    case -1785012090:
                        String str2 = "ۢۜۧۚۜۡۘۧۙۦ۬ۥۗۗۢ۠ۜۛۥۜۦ۬ۜۘۙۚۦۘۜ۫ۖۘ۬ۚۚ۬ۢۖۖۜۖۧۙۧۧۖۡۘۛۙۚ";
                        while (true) {
                            switch (str2.hashCode() ^ (-1885467839)) {
                                case -731147019:
                                    str2 = "ۛ۫ۦۦۚۘۤ۟۬ۥۤۘۗۦۘۘ۫۫ۗ۫ۤۢۚۘۢۤۥۘۦۛۢ";
                                    break;
                                case -278089539:
                                    String str3 = "۫ۥۛۤۨۦۖۦ۫ۖ۟ۥۘۚ۫ۘۥ۠ۥۛ۟ۨ۫ۡۦۨ۠ۤ۠۠ۖۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-979220754)) {
                                            case -760532441:
                                                str3 = C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOo0O, Boolean.FALSE) ? "ۥۧۗۖۘۘۜ۟ۘۨۧۧۨۨۘۦ۠ۧۧ۬۠ۜۗ۟ۦۘۦ۟ۧۡۘ" : "۟ۖۛۙۗۚۦۖۢۦۥۖۜۥۛۦۛ۠ۚۖۖۘۛۛۤۛۤۘۘۙۨ۠ۦۘۜۦ۫ۘۘ";
                                                break;
                                            case -622157095:
                                                str2 = "ۛۗ۬ۗۢۡۘۧ۫۬ۘ۟ۨۨ۫ۘۘۨۡ۟ۘۙۖۘ۠ۥۡۖۜۘۘۢۨۨۘۥۦۧۘۖ۬۠";
                                                break;
                                            case 700330703:
                                                str3 = "۫ۥۜۖۢۦ۟ۨ۫ۧۘۛۛ۟ۗۗ۟ۨۨۘۤۡ۬ۛۧ۫ۨۛۧۨۥ۬ۜ۠ۤۘ۬ۧ۬ۜۧۢ";
                                                break;
                                            case 1349287848:
                                                str2 = "ۚۦ۬ۙۢۖۘۙ۟۫ۦۚۦ۬ۧ۫ۖۛۗۙۥۧۘۢۙۦۘۢۛۚۢ۠ۚۡ۬ۦۘ۫۬۟ۥۖۘ۠ۡۦۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1164561698:
                                    str = "ۧۙۜۦۢۥۘۤۘ۬ۚۖۛۖۗۚۧۛۖ۟ۖۗۡۧۘۘۧۡ۠ۦۡۚۖۥۛۧۡۘ۟ۡۖۘۚۚۡۧ۟ۜ۟۬ۖ";
                                    continue;
                                case 1633469530:
                                    str = "۫ۖۤۗۜۙۖ۠ۦۤۥۨۘۚۚۜۚۛۛۙۡۡۜۢۜۤۧۡۡۗۙ۫ۥۥ۟ۖۦۦۘۧۦ۫ۧۨۜۘۧۥۢ";
                                    continue;
                            }
                        }
                        break;
                    case -1296473694:
                    case -515074870:
                        return;
                    case -1174796600:
                        String str4 = "۠ۡۗۥۧ۬ۛۤۥۘۙۢۥۘ۠ۛۢۘۘ۬۠ۘۤۧۛۙۧۘۗ۠ۛۨۘۢۜ۬ۥۦۚۤۡ۬۠ۧۨۘۖ۫ۜۧۛۨۘ۟۬ۡۘ۫ۢۦۘ";
                        while (true) {
                            switch (str4.hashCode() ^ 604944931) {
                                case -1310992285:
                                    String str5 = "ۤ۠ۖۘۜۧۜۖ۠ۘ۫ۥۦۢ۠ۨۘۙ۟ۥ۫ۖۙۗ۫۠ۢ۬۬ۤۦۜۘۦۧۙۖۘۢ۠ۥۘۘ۟۬";
                                    while (true) {
                                        switch (str5.hashCode() ^ 1971735978) {
                                            case -2039679901:
                                                str5 = "ۤۢۜۨ۠ۨۘ۟ۗۜۨۚۦۡ۠ۢۢۨۤ۫ۛۘۡۢۙ۠ۖۘۨۜۧۘ۠۟ۤۧۘۘ۫ۛۦۘۢ۟ۤ۫ۙۚ۬ۚ";
                                                break;
                                            case -874010602:
                                                str5 = ElfinFreeActivity.Oooo00o(this.OooO00o) ? "ۗۡۜۧۖۡۘۛ۟ۤۖۛۨۘۡۤۜۘۧۤۗۥۗ۠ۢۚۚۤ۬ۙ۠۟ۧ" : "ۥ۠ۡۘۧۧۢۡۚۖۖۥۗۧ۬ۙۙۖۖۘۚۤۧۡۚۥۨۘۚۖۘۘ۬ۜۢۚۦ۟۠ۥۚ۟ۗۡ";
                                                break;
                                            case 92803607:
                                                str4 = "ۜۖۦ۟۟ۡۘۦ۠ۦۥۜۜۘۚۘۛۛۗۢ۬ۢ۟ۨۧۡۤۡۘۘ۟ۨۡۘ";
                                                break;
                                            case 1560589858:
                                                str4 = "ۢ۫۠ۧ۫ۚۢ۟ۜۘ۟ۧ۟۫ۤۘۦۖۢ۫ۢۜۘۥۧ۫۟ۚ۠ۦ۬ۨۘۚۧۦ۬";
                                                break;
                                        }
                                    }
                                    break;
                                case -641142244:
                                    str = "ۖۗۨ۠ۢۨۘۖۜۦۘۙۢۨۗۡۖۗۤۖۙۖۗۙۡۗۤ۬ۘۘۜ۠ۜۘۨ۟ۤۡۜ۟ۜۥۘۤ۠ۜ۬ۗۙ۫ۥۙۡ۠ۧۖۚۡۘ";
                                    continue;
                                case 1222742488:
                                    str4 = "ۥۤۢۜۦۨۘۦۛۢ۠۬۫ۘۧۜۘۢۖۘۧۙۥۖۨ۠ۖ۠ۡ۬۫ۗۤۘۜۘۥۗۧ";
                                    break;
                                case 1656654089:
                                    str = "ۖۘۦ۬ۗۛۚۜۧۦۡۘ۠۟ۙ۠۠ۨ۬۟ۙۗۢۗ۟ۥۜۘۧۚۧۤۖۜۘۧۚۖۘ۬ۤ۟ۘۢۨۘۖۡۥۡۛۢ۟ۘ۫۫ۚ";
                                    continue;
                            }
                        }
                        break;
                    case -1007637805:
                        ElfinFreeActivity.OooOOOO(this.OooO00o);
                        str = "۫ۖۤۗۜۙۖ۠ۦۤۥۨۘۚۚۜۚۛۛۙۡۡۜۢۜۤۧۡۡۗۙ۫ۥۥ۟ۖۦۦۘۧۦ۫ۧۨۜۘۧۥۢ";
                        break;
                    case -1006294709:
                        ElfinFreeActivity.Oooo0(this.OooO00o, false);
                        str = "ۛۢۧ۟ۡۧۘۗۖۘۖ۬ۥۘۨ۬ۡۘۘۨۥۘ۬ۤ۬ۚۚ۫۟ۚۡۘۦ۟ۚۜ۟۫ۗۛۨ۟۠ۜۘۚۡۖۘۥۡۖۘ";
                        break;
                    case 2135660684:
                        str = "۬ۥۡۘۡۗۘۘۤ۬ۦۘۗۚ۟ۦۖۦۡۛۜۡ۠ۦۚۖۦۘۡۗۨۘۛۗۦۘ";
                        break;
                }
            }
        }
    }

    public class OooOo00 implements Observer<Boolean> {
        public final ElfinFreeActivity OooO00o;

        public OooOo00(ElfinFreeActivity elfinFreeActivity) {
            this.OooO00o = elfinFreeActivity;
        }

        public void OooO00o(@Nullable Boolean bool) {
            String str = "ۚۚۥۜۦۖ۠ۖۗۤۖۜۘۤ۫ۖۡۧۗۤۡۜۚ۫ۧۚ۠ۘۘۦۜۜۘ";
            while (true) {
                switch ((((str.hashCode() ^ 573) ^ 55) ^ 299) ^ (-723572523)) {
                    case -746901366:
                        str = "ۖۡۚۗۗۢ۟ۨ۟ۚۨ۫۫۬ۖ۬ۙۜۦۧۘۛۦۘۧۨ۠ۦۢ۫ۖۙۦۘۗۨۘۜۜۦۡۨۗ۠ۨۧۘۤۜۢۙ۫۬ۧ۠ۗ";
                        break;
                    case -325063555:
                        ElfinFreeActivity.OooOOO(this.OooO00o);
                        str = "ۧۛۧۧ۠ۜۘۘۙۦۙۤۚۧۜۨۘ۬ۘۙۜۥۘۤۢ۬ۚۦۤۡۤۦۘ";
                        break;
                    case 943955399:
                        String str2 = "ۚۥۜۦۜۨۘۗۧۥۘ۠۟ۚۛ۠ۙ۬۬ۘۘۢ۫ۧ۠ۛۡۘۤۖۦۘۗۨۘۘۡۜۦ۫ۥۘ۬ۙۥۢۨۧۘۙۦۧۙۦۗ۠ۘۦۘۧۥ۠";
                        while (true) {
                            switch (str2.hashCode() ^ 1896646024) {
                                case -291236234:
                                    String str3 = "۠ۥۨۘ۟۫۬ۤ۫ۦۘۢۡۧۘۧۗ۠ۛ۟ۚۦۨ۠ۘۗۨۘۡۨۨۘۦۗۛۥ۟۟ۗۛۨۘۥۦۡۥۗۘۘ۬ۘۢۥۦۘۨۘ۫ۙۤۡ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 449767579) {
                                            case -394581426:
                                                str3 = bool.booleanValue() ? "ۜۨۨۥۧۖۙۨۚۨ۫ۨۘۜۨۘۘۧۤۙۘۥۘۖ۠ۘ۬۬ۜۜۚۨۘۘۤۥۚۘۡۘۗۖۨۧۗۘۘ" : "ۜۦۘۥ۠ۡۘۤۡۜۙۗۚۜۗۖۘۗ۠ۢۧۙۤۨۗۙۤۗۧۚۨۘ۟ۚۦۧ۠ۢۛۡۖۘۡۥۙ۠ۥۖ";
                                                break;
                                            case 87995667:
                                                str3 = "ۨۢۥ۟ۢۧ۟ۛۡۘۨۤۜۜۘ۠ۧۥۜ۬۟۠ۥۜۧۘ۫ۢ۠ۦۢ۠ۛۤۘۥۨ۫ۗۤۖۘۘۘۥۘ";
                                                break;
                                            case 174829894:
                                                str2 = "ۨۙۨ۠ۖ۠ۛ۠ۦۘۡۦۢۛۘ۟۫ۗۖۖ۟۬ۗ۬ۢ۠ۛ۟ۥۗۖۘ";
                                                break;
                                            case 1869720980:
                                                str2 = "ۚ۟ۚ۬ۡۘۘۡۨۙۖۘۤ۟۠ۘۡۤۜۘ۟۬۬ۖۦۧۚۖۗ۫ۧ۠";
                                                break;
                                        }
                                    }
                                    break;
                                case 584902363:
                                    str2 = "۠ۜۜۙ۫۠ۛۙ۬ۖ۟ۦ۬ۧ۬ۖ۬ۢۡۥۦۘ۫ۨۙ۟ۡۧۘ۬۟۟۬ۧۘۘ۫ۤۢۦۖۤ۠ۙۘ";
                                    break;
                                case 660066517:
                                    str = "ۧۛۧۧ۠ۜۘۘۙۦۙۤۚۧۜۨۘ۬ۘۙۜۥۘۤۢ۬ۚۦۤۡۤۦۘ";
                                    continue;
                                case 1782016998:
                                    str = "ۦ۬ۖۤ۠ۡۚ۠۟ۨۧ۬ۖۡۘۦۧۨۙۤۗۗ۠ۛ۬ۙۘۡۤۦۤ۠ۜ۬ۡۧۢ۠ۧۖۙۢ";
                                    continue;
                            }
                        }
                        break;
                    case 1092229452:
                        return;
                    case 2100205805:
                        str = "ۜۙۦۘۛۜۨۡۡ۠ۚۤۙۦۘۖۘۘۗۜۙۚۧ۟ۡۦۘۖۜۧۘۜۧۘ";
                        break;
                }
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(@Nullable Boolean bool) {
            String str = "ۜ۠ۖ۫ۖۙ۠ۗۨۘۨۗۘۘۚۡۜۘۦۘۘۘۨۦۤۡۚۛ۟۬۬۟ۖۖۘۘۗ۫۠ۚۘۖۘۛۦ۫ۨۥۜۘۥۘ";
            while (true) {
                switch ((((str.hashCode() ^ 188) ^ 320) ^ 664) ^ (-1743122943)) {
                    case -2026833060:
                        return;
                    case -1231150863:
                        str = "ۢۚۘۘۨۗ۟۬ۡ۫ۡۧۖۘۖۖۥ۫ۢ۠۟ۢۡ۟۬ۦۘۖ۟ۥۘۖۘۜۘ۟ۡ۬ۦۧۛۤۜۗ۫ۚۖۘۢ۫ۛۡ";
                        break;
                    case -1080809817:
                        OooO00o(bool);
                        str = "ۗۢۦۘۖۦۜۘۦۛۡۡۦۚۜۤۖۘۙۥۡۘۗۡۜۘۙۧۛۜۤۦۙ۟۫ۗۗۚۨۛۦۘۡۛ۠ۧۤۜ۬ۘۙۚۛۘۢ۬ۥۘ۫ۧۥ";
                        break;
                    case 548120806:
                        str = "ۥۦۦ۠ۨۦۢۖۛ۟ۖۦۤۦ۟ۢ۫۠ۡۖۡۡۖۘۥۧۜۤ۬ۚ۫۫ۢۥۛۗۙۧۘۧۚ۬ۗۖۤۥۖۖ۬ۜۛۜ۫ۖ";
                        break;
                }
            }
        }
    }

    public class Oooo0 extends AsyncTask<InputStream, Void, Boolean> {
        public final ElfinFreeActivity OooO00o;

        private Oooo0(ElfinFreeActivity elfinFreeActivity) {
            this.OooO00o = elfinFreeActivity;
        }

        public /* synthetic */ Oooo0(ElfinFreeActivity elfinFreeActivity, OooO oooO) {
            this(elfinFreeActivity);
        }

        public Boolean OooO00o(InputStream... inputStreamArr) {
            String str = "ۖۧۨۘۙۡۤۧ۟ۨۗۡۤۙۤۖۦۘۨ۠ۛۥۜۜۘۧۜ۫ۧۨ۠ۗۦ۠ۙۙۡۘۤۗۡۘۨۘۧۤۖۛ۬۟ۥۤۢۖۘۧۜۡ";
            while (true) {
                switch ((((str.hashCode() ^ 717) ^ 257) ^ C4095le.o00000oO) ^ 1165493941) {
                    case -1627907884:
                        str = "ۙ۟۫ۙ۟۟ۙ۟۬ۛۥۘۢ۟ۘۘۧۜ۟ۡۢ۠ۗۘۘ۠۫ۗۜۜۚ";
                        break;
                    case -867946584:
                        ElfinFreeActivity.OooOOOo(this.OooO00o);
                        str = "ۨ۬ۡ۟ۘۖ۠ۖۛ۬۬۠ۘۖۜۘۖۡۙۡۘۨۘۘۗۜۘۢ۟ۢ۟۠ۡۘ۫ۡۗ۬ۖ";
                        break;
                    case 1397285078:
                        return Boolean.TRUE;
                    case 1486612520:
                        str = "ۘۜۧۘۘۨۧۘ۟۬ۢ۟ۛۜۧۧۤ۠ۦۧۘۙۡۤۙۜۘ۬۟ۜ۟ۛۥۘۗۗ۫ۤۧۡۘ۠۟۫۠ۖۘۥۙ۬ۖۨۡۘ";
                        break;
                }
            }
        }

        public void OooO0O0(Boolean bool) {
            String str = "۫ۢۧۡ۟ۥ۠ۖۨۘۚۡۗۤ۟۬ۘۙۖۚۤ۫ۚ۫ۧۨۙ۫۫ۧۥ";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_VIEW_VALUE) ^ 228) ^ 160) ^ (-144432902)) {
                    case -1785185310:
                        return;
                    case -773573952:
                        str = "ۦ۬ۚۤۨۧۦۛۖ۫ۖ۠ۧۜۜۘۧۚ۬ۜ۟ۡ۫ۜۛۜۢۥۘۜۚۜۘ";
                        break;
                    case -734900387:
                        str = "۠ۘۤۡۗ۫ۘۘۜۥ۠۟۬ۘۡۘۛ۫ۦۡۧۖۘۨۨ۬ۧۖۥۙۚۛ";
                        break;
                }
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(InputStream[] inputStreamArr) {
            String str = "ۙۚۘ۟ۖ۬ۦۤۘۘۢۧۥۚۖۨۘۜۢۙ۟۠۟ۗۛۙۦۗۘۡۛۘۧۚۘۘ۟۟ۦۡۨ۠ۢ۟ۘۘۥ۠ۥۘۚۡۜۘۙۢۙۡۡۜۘ";
            while (true) {
                switch ((((str.hashCode() ^ 1) ^ 979) ^ 79) ^ 2109355628) {
                    case -1906060074:
                        str = "ۘ۬ۙۘۢۛۙۧۦۚۚ۫۟۠ۖ۬ۚ۠۟ۥ۬ۥۨ۬ۗۚ۠ۙۚۧۡۨۗۦۢۢ۫ۖۦۛ۠ۜۡۖۡۘ۬۬ۨۘ";
                        break;
                    case -768005401:
                        str = "ۦۦۨۚۖۘۧۖۘ۬ۡۖۧ۠۫ۨۤۧۡۨۥۘۙۘۦۜ۠ۜۨۗۘۘۡۗۚۨۗ";
                        break;
                    case -235225147:
                        return OooO00o(inputStreamArr);
                }
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
            String str = "ۧۙ۠ۙۛۙ۠ۦۜۘ۟ۙۜۘۦۥ۬ۛۛۡۘۜۗۤۛ۠ۚۚۖۤۗۚۥۘ۟ۗ۬ۨۗۦۘۜۥۖۜۙۚۙ۠ۧۙۛۨۘ";
            while (true) {
                switch ((((str.hashCode() ^ 479) ^ UiMessage.CommandToUi.Command_Type.SET_FONT_SIZE_LEVEL_VALUE) ^ 878) ^ 193212018) {
                    case -1316886582:
                        str = "ۛۡۘۘ۠ۧۗۚۚۛ۟ۡۚۛۖۜ۬ۦۚ۠ۥۘۚۜۦۘۡۤۛ۫ۦۡۢ۬۫ۚۧ۟";
                        break;
                    case -843439701:
                        OooO0O0(bool);
                        str = "ۙۤۡ۫ۖ۟ۢ۠ۢۜۢۦ۟ۖۡۦۙۦۘۡۢۙۘۨۘۛ۫ۖۨۤۦۘ";
                        break;
                    case 443639769:
                        return;
                    case 1163750166:
                        str = "ۗۘۖ۫ۡ۠ۚ۬ۦۘۜۤۢۡۦۘۚۚ۠ۧۨۗ۬ۢۚۤ۠ۥۘۢ۫ۚۛ۬ۥۘ۫ۤۙۨۜۧ";
                        break;
                }
            }
        }
    }

    public class Oooo000 extends ThreadUtils.OooO0o<Boolean> {
        public final DialogC4309r6 o00Oo0;
        public final ElfinFreeActivity o00Ooo;

        public Oooo000(ElfinFreeActivity elfinFreeActivity, DialogC4309r6 dialogC4309r6) {
            this.o00Ooo = elfinFreeActivity;
            this.o00Oo0 = dialogC4309r6;
        }

        public static /* synthetic */ void OooOOoo(DialogC4309r6 dialogC4309r6) {
            String str = "ۚۡۦۚۥۤۨۦۖۘ۟۟۬ۗۥۜۘۦ۟ۧۜ۠ۜۘۛ۟۬ۨۨۨۘۡۛۛۤۧ۟ۛۢ۠ۛۖۖۘۧۖۡ";
            while (true) {
                switch ((((str.hashCode() ^ 61) ^ 940) ^ 225) ^ 662768375) {
                    case -1472884938:
                        dialogC4309r6.show();
                        str = "ۡۘۦۦ۠ۘۘۗۛۧۘۛۡۗۗۘۘ۫ۡۡۘۤۜۥۘۚۡۨۘۨ۬ۨ۟ۜۘۨۦ۟ۤۡۘ";
                        break;
                    case -548130173:
                        return;
                    case 833281306:
                        str = "ۧ۫ۡۘۜ۬ۡۘ۫ۤ۟ۜۛۜ۠ۧۚ۠۠ۖ۟۫ۙۢۡۘۜ۟ۦۘۜۥۘۘ۫ۛ۟۠ۘۜۛۤۘۨۧۥۘۦ۬۟ۡ۬ۥۘ";
                        break;
                }
            }
        }

        @Override // com.cyjh.elfin.tools.utils.ThreadUtils.OooOO0
        public /* bridge */ /* synthetic */ Object OooO0o() throws Throwable {
            String str = "ۧۗۡۘ۫ۦۨۨۙۖۘۗۧۖۘۢۨۖۥۗۡ۠ۦۧۦ۠ۧۨ۟۟ۖۜۤۡۥۘ۟ۧۨۘۗ۟۟ۦۗۛۗ۫ۡۢ۬ۚۘۧۛۜۚ۟";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_SIZE_VALUE) ^ 572) ^ 630) ^ (-62973460)) {
                    case -2029346351:
                        return OooOOo();
                    case 1903760378:
                        str = "۟ۙۜۘ۟۬ۤ۫ۥۡۡۙ۫ۘۡۢ۟ۥۥۡۘۖۢۖۜۛۘۛۘ۠۬ۙۖۗۦۦۘ";
                        break;
                }
            }
        }

        @Override // com.cyjh.elfin.tools.utils.ThreadUtils.OooOO0
        public /* bridge */ /* synthetic */ void OooOOO0(Object obj) {
            String str = "ۘۧ۬ۤۚ۬ۧ۠ۘۘۚۖۗۨۡۥۘۧۚۡۢ۬ۜۘۖ۫۟۬۟ۖۘۡۤۛ۬۬ۦۘۦۗۤۙ۟ۜۘۢ۬ۤۨۡۙۦ۫ۘۘۤۚۜۘۚۖۛ";
            while (true) {
                switch ((((str.hashCode() ^ 790) ^ 446) ^ 960) ^ 1838395396) {
                    case -2030559339:
                        OooOo00((Boolean) obj);
                        str = "ۡۛۡۘۦۘۜۚ۠ۨۘ۬۫۠ۙ۫۠ۘۨۚ۬ۨۤۦۦۘۡۢۤۤۤۘۤۖۥ۠۠ۚۚ۫ۡۘۜۖۨ";
                        break;
                    case 134703963:
                        str = "ۧۥۘۘۛۧ۫ۛ۫۠ۚۨۡۦ۟ۖۢۜۖ۟۬ۦۘۡۜۥۘۢۜ۬۟ۨۢۘۥۧۘۤۘۦۢۖۧ۠ۘۦۨ۬۫ۦ";
                        break;
                    case 1233308315:
                        str = "ۤ۠ۡۘۦ۟۬۬ۦۚۡۧۘ۟ۜۚ۬ۨ۬ۤۖۧۤۚۜۘ۠ۡۡۘۦۦۖۖۜ۫۟ۡۨۘۗۚ۬ۙۗۗۥ۟ۦۘ۠ۧۗ";
                        break;
                    case 1287732768:
                        return;
                }
            }
        }

        public Boolean OooOOo() throws Throwable {
            String strOooO0O0 = null;
            StringBuilder sb = null;
            File file = null;
            String strOooOOo = null;
            String str = null;
            String str2 = null;
            StringBuilder sb2 = null;
            StringBuilder sb3 = null;
            File file2 = null;
            StringBuilder sb4 = null;
            boolean z = false;
            boolean zOooO0o = false;
            StringBuilder sb5 = null;
            boolean zOooO0Oo = false;
            StringBuilder sb6 = null;
            boolean z3 = false;
            String str3 = "ۥۡۥۘۙ۟ۘۘۦۧۜۘۛۛۥۗ۟ۘۘ۟ۚۗۤۘۜۢ۬ۗۘۢۨۡۚۤۡۗۧۚۛۡۘ";
            while (true) {
                switch ((((str3.hashCode() ^ 600) ^ 919) ^ 786) ^ 795303978) {
                    case -2133173055:
                        String str4 = "ۨۜۚۜۘۘۘۢ۬۬ۜۘۗۤ۫ۘۗۥۧۖۨۧۘۡۡۤۡۛۜۘۦۤۚۚۧۤۥۧۘۨۢۨۜۢۥۘۤۖۜۘۤۨۨ";
                        while (true) {
                            switch (str4.hashCode() ^ (-1527174942)) {
                                case -359458380:
                                    String str5 = "ۙۙۚۧۖۧۘۨۦۥۗۜۗۗۢۢ۟۟ۧ۬ۡۛۖۥۡۛ";
                                    while (true) {
                                        switch (str5.hashCode() ^ 763602594) {
                                            case -1871206408:
                                                str5 = file.exists() ? "ۡۤ۠ۡۨۖ۠ۛۙۜۚۚ۟ۢۢ۬۬ۤۙۢ۫۫۠ۦۧۖۘۘۚۜۦۘۙۖۡۡۢۚۢۙ۟ۦۛۛۢۜۥۛۤ۠ۙۦۜ۟ۜ۠" : "ۖۙۖۡۤۗ۟۟ۦۧۦۘ۠ۢۧۥۛۢ۟ۖۢۗۦۨۤۦۘۢ۫ۧۨۛ۟ۗۗۡۘۛۛ۬ۤۜۦۘۜ۟ۛۢۨۡ";
                                                break;
                                            case -427854007:
                                                str4 = "ۙۨۧۡۜۚۙ۫ۛۡۡۘۦ۫ۥۘۘۥۚۚ۫ۚۧۢۜۘۡۚۡۨ۠۠ۚۨۙ۟ۨۘۙۦۘۚ۫۬ۖۙۜۘۥ۬ۙۙۗ۬ۡۖ۠";
                                                break;
                                            case 1069483064:
                                                str5 = "ۚۤۘۦۜۡۘۚۧۘۛۥ۟ۖۜۖۥۧۘۧۧۜۘۦۧۢۧۨۜۧۖۤۦۥۗۢۙۧۧۚ۠ۗۛۨۨۡۘۧۖ۬ۧۗۡۗ۟ۥۘ";
                                                break;
                                            case 1623860709:
                                                str4 = "ۥۙۢ۫۠ۥۘۥۧۛۦۥۚۙۜۖۜۜۗ۫ۡۥۘ۬ۤۥۥۚ۫ۥ۬ۦ۬ۘۘ۟ۘۨۘ۠ۗ۟۠۫۠";
                                                break;
                                        }
                                    }
                                    break;
                                case -347605031:
                                    str4 = "ۜ۬ۨۢۤۗۦۛ۠ۡۥۖۨ۬ۥۡۖ۬ۥۜۘۤۙۦۘۖۤ۬۬ۙۤۥۘۘۙۘۢۜۘۨ۟۠ۨۘۖ۬ۤ۟ۛ۬";
                                    break;
                                case -35545261:
                                    str3 = "ۤ۠ۘۘۨۨۥۘۦۨ۬ۡ۫ۗۧۨۨۘۖۜۘۗۙۡۘۡۤۧۡۨۘۘۡۧۥۘۚۦۖۘۙۦۤۚۤۡۘۘۖۥۘۜۛ۬ۧۨۡۗ۟ۛ۬ۘۘۘ";
                                    continue;
                                case 508231512:
                                    str3 = "ۗۥۤۖۚۥۘۡۥۨۚ۟ۨۘۜۧۦۘۨۧ۠ۘۘۢۡۜ۠ۜۗۨۥ۠۫ۥۘۢۥ۟ۜ۠ۖ۫ۚۖۘۜۦۙۡۘۚ";
                                    continue;
                            }
                        }
                        break;
                    case -2108501865:
                        String str6 = "ۨۛۦۘ۟ۦۜۥ۬ۨۙۥۤۖۦۘ۠ۛۦۙۦۨ۬ۨۚۥۡۙۛۨۘ";
                        while (true) {
                            switch (str6.hashCode() ^ 1831186633) {
                                case -1983692141:
                                    str6 = "ۖۜ۟ۧۘۜۘۗ۠ۨۘۖ۬ۦ۫ۚۥۜۧۘ۫ۘ۠۟۫ۦۘ۟ۛ۟۫ۙۦۢ۫ۚۢ۬ۖۘۥۜۘۦۢۘ۟ۘ۠ۗۖۡۛۜۢۛۦۖ";
                                    break;
                                case -234095854:
                                    String str7 = "ۘۤۧۦۢۥۗۘۢۨۖۨۘۙۨۥۘ۟ۗۤۧۡ۟۫۠ۨ۬ۖۘۙۨ۟۬۫ۢۧۘۛ۬ۨۧۛۢ";
                                    while (true) {
                                        switch (str7.hashCode() ^ 2052390306) {
                                            case -2018019808:
                                                str7 = file2.exists() ? "۟ۙۖۗۛۧۙۜۨۡۗۥۘۙۧۜۘ۠ۦۚۘۖۡۘۖۡ۠ۢۧۖۥۧۦۘۛۦ۟ۖۙۘۖۥۦ۟" : "۫ۙۥ۬ۨۨۜۨ۠۠ۦۙۥۦۦۜۢۨۢۙ۬ۗ۟ۨۡۖۘۢۚۜۘۚۛۦۘۡۖۙۚۦۖ۠ۜۘ";
                                                break;
                                            case -1318772886:
                                                str6 = "ۖ۟ۛ۫ۘۚۨۥۥۘ۬۫ۢۘۥۤۚۚۘۘ۫ۚۖۧۖۤۡ۟ۡ۬ۙۢ";
                                                break;
                                            case 540498099:
                                                str7 = "ۤۗۚۨ۬ۨۘۡۨۘۤۙۜ۫ۨۤۧۗۛۗۙۦۥۧ۟ۥۚۜۗۦۥۧۦۚۖۤۗ";
                                                break;
                                            case 1575717449:
                                                str6 = "ۜ۫ۤ۟۠ۗۤ۬ۨۧۛۥۘۙۗۖۘ۠ۦۤۦۗۙ۬۟ۙۘ۟ۘۘ۬۫ۖۛۖۘۡۦۙۙۢۦۘۘ۟ۖۘۥۘۥۘۚ۬ۛۘۨۥ۫ۢۜۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1202305046:
                                    str3 = "ۛۥۥۥ۫ۦۤ۠۠ۛ۬ۦۘ۫ۡۥۜۙۦۘ۟ۧۧۚۦۘۘۗ۫ۧۦۛۙ۫ۗۢۗۖۥ";
                                    continue;
                                case 1298509302:
                                    str3 = "۬ۗۛۘۥۘۘ۟ۗ۠ۘۡ۫۬ۢۨۡۥۖۘۗ۬ۛۘۢۨۥۤ۟ۜۚۧ۬ۖۜۘۛۗۜۘۨۖۚۘ۫ۤ۟ۥۖ۫ۤۡۘۧ۟ۡۘۜۗۘ";
                                    continue;
                            }
                        }
                        break;
                    case -2022332630:
                        str3 = "ۗۚۡۘۛۚۤ۠ۤۖۘۨۤۦۘۦۤۦۚۥۖ۬ۥ۠ۨۥ۬ۢۥۛ۬۬ۘۨۙۖۘۖۘۡۘۘۥۚۘۧ۬ۗ۟۠۫ۦ۬";
                        break;
                    case -1864379682:
                        zOooO0o = C4385t8.OooO0o(file2);
                        str3 = "۠ۘ۟ۦۘۢۨۛۖۙ۟ۢۦۨۧۥۥ۫ۖ۠ۘ۠ۖۙۤۜۖۘۤۧۨۘۙ۬ۛۧۛۚ";
                        break;
                    case -1852911599:
                        sb2.append(strOooO0O0);
                        str3 = "ۡۖ۫ۧۜ۬۠ۦۗ۟ۙۜۘۥۦ۫ۘ۫ۥۘۡۙۦۡ۟ۥۖۖۥۗ۟ۚ۫ۛۦۨ۬ۜۘ";
                        break;
                    case -1826521698:
                        sb2.append("copyOcrExLib: zipTime = ");
                        str3 = "ۛۦۦۘۤۛ۟۠ۦۘۘ۬ۚۡۛۖۛۛ۬۫ۙۨ۬ۡۦۚۡۤۘۘۧۨۘۛۛۥۧۜ۫ۧۗۧۙۦۙ";
                        break;
                    case -1807071142:
                        sb.append(InterfaceC4047k3.o00000OO);
                        str3 = "ۜۤۡۘۡۧۦۧ۫ۨۘۢۨۡۘۨۤۡ۟ۤۖۘۘۙۖۘۡ۟ۚۢۗۡۘۦ۠ۤ";
                        break;
                    case -1763443489:
                        String str8 = "۠۟ۡۢۥۘۢ۬ۚۛۖۘۜۢ۬ۙۘۜۦ۟۫ۖۢۛۦۜۨۘۥۡۗ";
                        while (true) {
                            switch (str8.hashCode() ^ (-24924197)) {
                                case -1118228368:
                                    str8 = "ۨۥ۫۬ۧ۟ۨۜۜۘۙۡۚۨۦۗ۟ۛۨۘۙۦۚۡۙۤ۫ۡۦ۠۠ۖۖۘۜۘۖۘۨۘۦ۫ۖۘ۫ۨۡۨۧۥۘۜۖۤۖ۬۫ۖۡۨۘ";
                                    break;
                                case -3091437:
                                    str3 = "ۡۘ۠ۢۖۨۘۚۥ۫۟ۚۤۥ۫ۨۘۚۢۥۘۤۤۦۘۙۚۗ۟ۢۜۧۥۜۘۨۘۘۘ۬ۗۨۧۥۖ۬ۧۥۗۚ۬۟۬ۗ۫ۙۢۜۗ۬";
                                    continue;
                                case 1054857722:
                                    String str9 = "ۦ۫ۘ۬ۦۚۤ۫ۘۘ۫ۡۜۘۚۨۘۘ۫ۚۨۘۡ۬ۙۚۨۗۧۧۘۖۙ۠ۜۜۡ۬ۤۗ۬ۦۧۦۖۘ";
                                    while (true) {
                                        switch (str9.hashCode() ^ 1571286421) {
                                            case -1314989353:
                                                str8 = "ۜۡۨۘۢ۬۟ۚۙۦۙۨۦۜۛۡۘۖ۠ۛۛۡۛ۟ۘ۠ۧۛۡۡۦۘۥۤۛۧۖ";
                                                break;
                                            case -303999879:
                                                str9 = TextUtils.isEmpty(strOooO0O0) ? "ۦۧۧۖۥۡۘۡۛۚۛۢۖۧۨ۠ۤۦۤۧ۫ۥۗۘۡۛ۫۠ۜۧۘ۟ۤ۟ۙ۫ۨۘۡۢۛۥۙۖۘۥۧۛۗۥ۟ۧۧۤ۫ۤۜۘ" : "ۤ۫ۜ۟ۛۦۘ۬ۛۘۘۖۨ۬۫ۡۢۖۢۡۤۛۖۘۜ۟۠ۥۗۢۢ۟ۡۛ۠ۧ۟ۗۢۧۥۜۘۛۙ۫ۜۘۡۘۗۖۛۗۢۡۗۤ۠";
                                                break;
                                            case 210183078:
                                                str9 = "ۦۨۘۘ۠ۤۧۧۧۜۘۦۡۧ۟ۘۘۦۢۨۘۗ۫ۜۧۜ۫ۛ۫ۡ۟ۦۛ۫ۘۥۘۧۨۨۘۤ۬۟ۛۙۚ";
                                                break;
                                            case 1987487766:
                                                str8 = "ۧۛۥۘۨۦۧۚۦۡۘۧۗ۠ۢۦۥۜ۠ۜۜۥۡۚ۫ۖ۟ۛۥۘۗۘۧ۬ۦۨ۠ۨۙ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1737575964:
                                    str3 = "ۧۥۙ۟ۦۧۦۤۢۖۙۢ۟ۜ۠ۖۧۨۤۗۘۘۖۧۘۧۨۙۚۜۜۘ";
                                    continue;
                            }
                        }
                        break;
                    case -1747664902:
                        sb3.append("copyOcrExLib: nativeLibraryDir = ");
                        str3 = "۠ۘۜۘۜۥۘ۟ۖۜۘۥۘۧۘۨۨ۟ۛۖۥۘ۬ۛۚۢۥۙۖۛۡۡۧ۟ۤ۬ۘۥۘۦۘ۫۠۠۫ۜ";
                        break;
                    case -1568554713:
                        str3 = "ۦۖۜۘۚۤۘۘۜۖۢۢۢۘۘۗۜ۟ۛ۬۠ۚۘۡۘ۬ۨۥۜۧۘۡ۬ۧ";
                        z3 = z;
                        break;
                    case -1398282586:
                        sb2 = new StringBuilder();
                        str3 = "۫ۦۙۤ۠ۜۛۡۦۘۙ۬ۤ۟۬ۦۘ۫ۨۨۘ۬ۚۡۘۨۤۥۘ۟ۙۚۖ۫۠ۚ۟ۘۧ۟";
                        break;
                    case -1369948894:
                        sb6 = new StringBuilder();
                        str3 = "۫۬ۧۤ۫ۧۖۚۨۡۘۖۗۙۥۘۡۖۙۤۧۥۘۗۤۙۘ۟ۦۥۖ۠ۨۖۤۗ۫ۢۜۘ۬ۘ۠ۛۚۥۘۧۘۦۘۧۛۥۘ";
                        break;
                    case -1219596741:
                        strOooOOo = C4011j4.OooOOo(file);
                        str3 = "ۧۦۜ۠ۘۜۘۙۤۥۤ۠ۧۛۜۦۥۦۜۥۢۘۤ۫ۥۦۧۧۗ۫۬ۗۙ۬ۘۙۧۙ۬ۦۖۤۜۘۥۛۘۘۛۜۜ";
                        break;
                    case -1094848565:
                        String str10 = "۠ۨۛۘۚ۟ۘۦۜۘۢۖ۟ۛۘۡۘۚۤۖۘۖۜۦۤۜۡۘۚ۫ۗ۟ۨۚ";
                        while (true) {
                            switch (str10.hashCode() ^ 462424378) {
                                case -1807014869:
                                    str10 = "ۥۢۘۘۥۖ۠۫ۘ۬۬۟ۨۢۚۢۙۨۘۖۡۤۨۚۥۘۡۗ۫۠ۢۜۚ۫۫ۜۙۗۤۙ۫ۜۘۛۚ۫ۛۖۧۦۛۥۘۙ۬۫";
                                    break;
                                case -1479697983:
                                    str3 = "ۤۛۜۘ۫ۨۛۧۗۡۘ۠۬ۤۨۜۖۦۙۢۙۘۧۘۨۨۨۘۥ۟۠ۛ۟ۗ۠ۘۜۨۧۨ";
                                    continue;
                                case -1198921216:
                                    str3 = "۬ۗۛۘۥۘۘ۟ۗ۠ۘۡ۫۬ۢۨۡۥۖۘۗ۬ۛۘۢۨۥۤ۟ۜۚۧ۬ۖۜۘۛۗۜۘۨۖۚۘ۫ۤ۟ۥۖ۫ۤۡۘۧ۟ۡۘۜۗۘ";
                                    continue;
                                case 2019889529:
                                    String str11 = "ۜ۟ۘۗۖۧۘۢۧۡۥۦۡ۟ۦۙۤۜۙۗۙۡ۠ۘۨۘۧۘۦۘۧۖۨۙۖۙ۬ۡۛ۠۠ۨۖۙۛۚۛۦۘۖۦۧۥۛۤۘۜۦ";
                                    while (true) {
                                        switch (str11.hashCode() ^ (-1113022650)) {
                                            case -1327908243:
                                                str10 = "۟ۗۖ۟ۡۨۘۗۛۧۜۚۧۥ۬ۖ۬ۡۘۥۗۚۦۡۘ۫ۡۦۘۜۡۨ۬ۢۜ۬ۗۙۖ۫ۡۥۨ۟ۜ۬ۗ۫ۖۥۘ";
                                                break;
                                            case 626427016:
                                                str11 = "ۢۘۙۜۚۘۘۡۖۦۘۚۡۥۘۖۙۗۢ۟ۡ۠۟ۢۧۧ۠ۜۨۦۖ۫ۗۨۧ۬ۡۢۢۦۨۘۨۗۥ";
                                                break;
                                            case 1367981007:
                                                str10 = "ۡۜۗۡۜۦۖۥ۠ۜۚۨۢۖۜۚ۠ۥۜۧ۫ۗۗۢۤ۫ۙۙۜۢ۫ۥۘۨۦۧۘ۬ۜۚۗۧ";
                                                break;
                                            case 2027787601:
                                                str11 = strOooO0O0.compareTo(str2) > 0 ? "ۨۡ۠ۨ۟ۢۥۘ۫ۤ۬ۖۗ۬ۥۙۛۘۘ۬۫ۗۖۡۢ۠ۜۧۖۦۢۨۙۖۛ۟ۦۘۨۧ۟ۜۖۧۘ" : "ۖۤۤۜۚۖۡۡۘۘۢۦۡۙۜۧۚۥۜۗ۫۫ۜۖ۬ۙۥۗۙۤ۟ۖۥۢۖۘ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case -865419347:
                        sb.append(this.o00Ooo.getFilesDir());
                        str3 = "ۥۘۙ۠ۛۘۚۙۥۥۤۢۘۦۦۥۤۗۘ۟ۗۚۗۦۘ۠ۗۖۘۚۖۘۘۦۡۤ۟۫۬";
                        break;
                    case -826590252:
                        sb3.toString();
                        str3 = "ۨۥۨ۠ۤۤۨۗۜۦۡۖ۫ۚۡۛۡۘۨۤ۠۫۬ۜ۟ۗۦۘۘۨۘۤ۟ۥۘۙۙۡۡۨۥۤۚۦ";
                        break;
                    case -728520121:
                        strOooO0O0 = C3901g5.OooO0O0(this.o00Ooo, "ocrex.zip", "ocrex/time.txt");
                        str3 = "ۖۚۖ۬ۗۤۘۦۚۗ۫ۛۙۖۧۘۖ۬ۗۛۦۥۘۨۙۧۧ۫ۚۢۦۘۘۨۥۘ۬ۤۤۢۥۘۘۖۦ۟ۗۦۖۖۛ۬";
                        break;
                    case -720986179:
                        String str12 = "ۖ۟ۜۘۦۗۡۦۡۘۘ۠۟ۦۖۙۚۛۘۡۚۖۚۢۚۦۢۦۚۜۛ۬۫ۜۛۨۚۘۘۙ۟۬ۨ۠ۜۘ";
                        while (true) {
                            switch (str12.hashCode() ^ (-685254649)) {
                                case -1675520390:
                                    str3 = "۬ۘۥۢۜ۫ۜۢۨۗۢۛۡ۫ۡۢۖۘ۟۬ۡۘ۬ۡۖۢۤۖۚ۟ۙۖۙۧۛ۫ۗ";
                                    continue;
                                case -353355564:
                                    String str13 = "ۘۢۧۖۚۨۘۦۛۨۥۢۨۖۡۜ۠ۨۙۛۡ۬ۖۤۥۦۗۧۦۥۢۢ۠ۖۦۧۗۢۖۘ۠ۥۤ۠ۥۦۘ۬۠ۡ";
                                    while (true) {
                                        switch (str13.hashCode() ^ (-1003629338)) {
                                            case -820643880:
                                                str13 = "۠ۡۧۘ۟ۢۧ۟ۚ۟۟ۘۛۢ۬ۡۛۧۗۗۖۨۘۙۘۘۘۤۤۜۜ۠ۧ۠۬ۖۨۜۥ۠۫۬۠ۢۡۘۡۡۛۢۛۤ";
                                                break;
                                            case -627421200:
                                                str13 = file2.exists() ? "ۗ۠۟۠ۘۖۛۡۚ۠ۛۢ۬ۖۜۦۘ۬ۥ۫ۢ۟ۦۘۨ۠ۖۘۖۦۜۘ۟۟ۖۘۧۛۦۤۖۨۢۥۜۘۖ۫ۥۘۦۚۦۗۦۖۛ۟ۢ" : "ۢۗۦ۬ۢ۟ۜ۠ۥ۫ۗۦۘۧ۟۠ۛۗۙۢۙۖ۬ۗۜۘۢۘۤۧۙۜۖۤۗۛۚۚۘۦ۬ۚۡ۟۠ۛۢۦۧۜۘ";
                                                break;
                                            case -16514164:
                                                str12 = "ۛۘۧۘۘ۬ۖۘ۠ۧۜۘۡۦۗۨۡۡۘۤۥۘۘۖۨۥۚۘۘۗۗۜۘۖۢۖۦۘۦ۫ۙۥۘ۬ۖۖۙۥۡۘۧۥۥۘۤ۟۠ۗۡۨۘ۠ۥۤ";
                                                break;
                                            case 191033972:
                                                str12 = "ۗۖۜۢ۟ۤۤۗۢۧۦۧۘۥۢۡۘۨۖ۬ۗ۟ۛۦۙ۟ۙۘۜۘۖۜۚۖۡۙ۬ۖ۠ۖ۫ۨۘۤۥۥۘۨۚ۬ۚۖۥۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case -197147567:
                                    str12 = "۟ۥ۠۫ۨۧۦ۬۫ۤۛۧۥ۬ۗۛۦۨۥۚۨۘۦۗۨۘۤۛۘۢۨۘ";
                                    break;
                                case 5032472:
                                    str3 = "ۥۚۧۡۡۚۘ۫۟ۢۜۖۘۤۜۜۤۚ۫ۙۗۢۖۥۚ۟۠۟۠۬۬۟ۘۡۘۧۨۖۘۖ۫۬ۢۡ";
                                    continue;
                            }
                        }
                        break;
                    case -546070990:
                        sb6.toString();
                        str3 = "ۥ۠ۜۜۧ۫۠ۧۨۛۜۗۙ۫ۥۖ۬ۢۢۢۥۘۗۧۨۘۜۢۘۥۖ۫ۤۗۨۘۜۢ۟ۜۨۜۘۙۦۦۘ۟۟ۢۜ۟ۢۨ۬ۡۗ۫";
                        break;
                    case -420197073:
                        sb3 = new StringBuilder();
                        str3 = "ۢ۟ۘۘ۬۫ۚ۫ۨۜۘۥۡۜۘۜۗ۠۬ۚ۠ۖ۫ۜۘۡۖۗ۫۬۫ۘ۠ۖۗۖ۠۫ۡ۫";
                        break;
                    case -349439615:
                        str3 = "ۗۧۥۤۘۧۘۗۧۥۥۧۜۘۜۘۧۘۡۢۥۘۙ۟ۖۘۧ۬۟ۖۙۖۘ۬ۦۢۛ۫۬ۥۤۧۡۡۘۙۨ۠";
                        break;
                    case -208229474:
                        sb5.append(zOooO0o);
                        str3 = "ۙۦۧ۬۬ۙۡۦۚۧ۫ۡۘۚۡۘ۫ۨ۠ۜۢۛۦۛ۟ۦۖۜۘ";
                        break;
                    case -171505056:
                        sb5.append("copyOcrExLib 删除旧的文件夹：");
                        str3 = "۬ۥۨۘۢۢۜ۫ۘۘۧۨۚۡۚ۟ۡۖۙۦ۫ۙۡۚۤۖۜ۟ۢۧۘۚۦۗ۬ۡۘۙ۟ۖۧۚۤ";
                        break;
                    case -140904782:
                        z = true;
                        str3 = "۫ۡۜۘۡۖۡۘۦۧۥۘۘۜ۠ۨۛۛ۠ۜۖۘۜۚۛۗۢۧۡۡۦ۫۠";
                        break;
                    case -112967809:
                        sb5 = new StringBuilder();
                        str3 = "ۨۦۛ۫ۤۥۘۙۦۛۥۖۙۗۖۥۘۡ۫۫۠ۘۘ۬ۛۥۘۗۨ۟ۦۙۢ";
                        break;
                    case -76007168:
                        sb.append(File.separator);
                        str3 = "۫ۨ۟ۥۚ۫ۨ۠ۖۗۗۨۘۢۙۥ۫ۢۡۘۢۨۜ۟ۤۜۘۦۛ۬ۗۛۦۡۤۙۛۤۤۥۦ۬ۙۙۘ۫ۦۚۚ";
                        break;
                    case -25900184:
                        String str14 = ElfinFreeActivity.o000OOo;
                        str3 = "ۢۗۜۗۜۖۚ۫ۚۚۖۖۡۘۤۥۢۦۜۤۡۘ۠ۢ۟ۖۢۥۧۧۧۡ۫۫۬ۜ۫ۖۘ۠۟ۡ";
                        break;
                    case 322798193:
                        sb4.toString();
                        str3 = "۟ۧۖۘۡۨۢۤۙۦۘۙۡۧۨۤۦۡۖۦۘۚ۫۟ۧۚۦۜ۫ۦۦۨۘۥ۬ۛۛۗۥۢۡۨۘ۠۟۟ۤ۫ۜۤۜۘۦۚۗ۟ۦۖ";
                        break;
                    case 375178088:
                        sb4 = new StringBuilder();
                        str3 = "ۖۤۥۘۡ۠ۡۘۦۥۛۦۥ۬ۤۘۥۚ۠ۢۢۗ۟ۖۚۚۘۡۚ۬ۘ";
                        break;
                    case 441388531:
                        sb5.toString();
                        str3 = "۬ۘۥۢۜ۫ۜۢۨۗۢۛۡ۫ۡۢۖۘ۟۬ۡۘ۬ۡۖۢۤۖۚ۟ۙۖۙۧۛ۫ۗ";
                        break;
                    case 586108233:
                        sb4.append("copyOcrExLib: ocrexDir = ");
                        str3 = "۟ۡۦۖ۟ۤۤۢۧ۬ۤۤ۟ۨ۠ۚۨ۬ۢۢۥۘ۟ۗ۠ۚۨۡۗۖۘ";
                        break;
                    case 637159410:
                        return Boolean.valueOf(z3);
                    case 940709019:
                        str3 = "ۗۚۡۘۛۚۤ۠ۤۖۘۨۤۦۘۦۤۦۚۥۖ۬ۥ۠ۨۥ۬ۢۥۛ۬۬ۘۨۙۖۘۖۘۡۘۘۥۚۘۧ۬ۗ۟۠۫ۦ۬";
                        str2 = str;
                        break;
                    case 996292342:
                        sb2.toString();
                        str3 = "۬ۛ۫ۗۥۖۘۨۗۙۛ۫ۜۥۜ۬ۧۥۥۥۨ۫ۧۨۘۘۗۛۜۘ۟ۢۘۦۦۙ۟ۖۗۗۡۘۘۙ۟ۛ";
                        break;
                    case 1008978294:
                        file2 = new File(this.o00Ooo.getFilesDir(), InterfaceC4047k3.o00000OO);
                        str3 = "ۚۧۜ۬ۘۘۘۜ۠ۡۧۘۧۨۡۜۘۘ۟ۤۦ۫ۨۘ۬ۗۡۘۢۢ۫ۥۗۦۘ۠ۖۥۥۙ۟ۧۤۗۥۘۤۛۘ۬ۗ";
                        break;
                    case 1048637178:
                        zOooO0Oo = C3901g5.OooO0Oo(this.o00Ooo.getApplication(), "ocrex.zip", this.o00Ooo.getFilesDir());
                        str3 = "۟ۙۥ۠۟۠ۥۧۥۘۚۦ۫ۚۖۙۚۜۗۦۦۤۢۙ۫ۙۥۤ۫ۢۖۘۨۘۜۘۗ۠ۢۖۤ۫ۘۦ۠ۚ۠ۨۘۢۡۗ";
                        break;
                    case 1080492486:
                        str3 = "ۛۡۡۤ۠ۨۘۜۚۥۗۦۦۘۨ۫ۡۘۡۨۢۘۙ۫ۨۦۘ۫ۗۖۘۖۜۡۘۨۙ۟ۦۚۧۚۘ۫ۗۖۦۦۖۖۘ۠ۤۜۘ۬ۢۘۖۛۖۘ";
                        str2 = strOooOOo;
                        break;
                    case 1091972400:
                        sb = new StringBuilder();
                        str3 = "ۖۡۗۨ۟۟۬ۡۦۘۗۨۡۘۛۦۦ۠ۖۛ۟ۨ۠ۥۥۙۜۙۛۤۡۘۚۜۥ۬ۧۧۨۦۨ۟۠ۖۘۜ۫ۢۗۜۦۘ";
                        break;
                    case 1117759322:
                        str = "";
                        str3 = "ۥۨۡۜۚۨۘۗۖ۟۬ۖۜۢ۫۟ۤۖۨۘۛۨۘ۬ۜۘۘ۬ۥۚۦۗۖۡۢۚ۠ۗۙۖۥۦۡۨ۠ۘۡۘۗۜۘۘۛۜۡۨۨۨ";
                        break;
                    case 1136943133:
                        sb3.append(this.o00Ooo.getApplicationInfo().nativeLibraryDir);
                        str3 = "ۤۧۧ۬۬ۘۘۥۧۘۨۤۤۜ۬ۦۧ۬ۖ۟ۤۥ۟ۘۤۛۚۨۜ۠ۚ۫۫ۤۖۜۤ";
                        break;
                    case 1219867940:
                        ElfinFreeActivity elfinFreeActivity = this.o00Ooo;
                        final DialogC4309r6 dialogC4309r6 = this.o00Oo0;
                        elfinFreeActivity.runOnUiThread(new Runnable() { // from class: z2.d9
                            @Override // java.lang.Runnable
                            public final void run() {
                                ElfinFreeActivity.Oooo000.OooOOoo(dialogC4309r6);
                            }
                        });
                        str3 = "ۥۥ۠۟۬ۖۘۘۜۘۘۙۘۧ۠۫۟ۘۛۨۥۘۥۘۘۜۖۡۘۜۨۢۤۢۦ۠ۥ۫ۨ۫ۧۜۗۗۙ";
                        break;
                    case 1264102253:
                        sb4.append(file2.getPath());
                        str3 = "ۙۘۧۘۛۙۨۥۡۡۘۦۗۥۘۜۧۥۙۙۥۘۛۢۜۘۙۜۤۦۢۗۦۨۥۘۢۦۙ۫ۛ۟ۛۗۡۘ۫ۥۧۘ";
                        break;
                    case 1455262169:
                        sb6.append(zOooO0Oo);
                        str3 = "ۙ۠ۨۘۚۦۘۘۢ۬ۜۘۖ۫۬ۗۙۨۘۦۘۥۘۡ۟۠ۤۙ۬ۖۥۖۘ۫ۤۥۜۘۘۨۖۖۘۜۤۚۨۤۛۨۤۥ۫ۢۦۘ۬ۡۨۘۢۖۘ";
                        break;
                    case 1500470581:
                        sb2.append(str2);
                        str3 = "ۜۗۧۗۗۖۘۗۛۜۦۜۤ۠ۚۤ۫ۛۧۖۖۥۘۥۧۘۘۜۙۗۚۧ";
                        break;
                    case 1630565575:
                        sb6.append("copyOcrExLib OcrEx 解压是否成功：");
                        str3 = "ۙۦۗۦۡ۫ۖۖۧۘۗۢۘۗۜۥۘ۠۫ۚۦۖۧۘۚۘۜۛۢۚۦۦۤۤ۬ۚۡۦۘ";
                        break;
                    case 1719799825:
                        sb2.append(" localTime = ");
                        str3 = "ۦۡۛۨۡۧۘۖۤ۟۟ۗۗ۫ۡۖۥۢۡۥ۬ۙۖۥۧۘ۫ۥۨۖۢ۠ۡ۠ۨۗۗۢۖۘۦۜ۫۬ۜۙۖۘۜۜۜۖۙۢ۟ۘ۫";
                        break;
                    case 1879479016:
                        str3 = "ۤۛۜۘ۫ۨۛۧۗۡۘ۠۬ۤۨۜۖۦۙۢۙۘۧۘۨۨۨۘۥ۟۠ۛ۟ۗ۠ۘۜۨۧۨ";
                        z3 = zOooO0Oo;
                        break;
                    case 1889221640:
                        file = new File(sb.toString(), "time.txt");
                        str3 = "ۥۦۜۘۘۗۘۘۧۜ۫۫ۖۡ۫۫ۨۘۖۙۗۛۙۥۤ۟۫ۛۥۡۘۧۗۜ۟ۦۨۘۨۤ۠ۢ۫ۚۗۗ۬۟ۖۦۢۘۡۘۜ۠۬ۖ۠ۦۘ";
                        break;
                    case 2107727713:
                        return Boolean.TRUE;
                }
            }
        }

        public void OooOo00(Boolean bool) {
            StringBuilder sb = null;
            String str = "۬ۤۜ۬ۢ۫ۜۗ۬ۘۦۧۘۤۡۧۥۜۨۤۛۛ۬ۤۨۘ۫ۤۗۢۦۡ۠ۢۡۘ۠ۥۛ";
            while (true) {
                switch ((((str.hashCode() ^ 446) ^ 445) ^ 395) ^ 274842295) {
                    case -1715316355:
                        str = "۬ۨۤۤۗۜۘ۟۬ۖۤۖۨۖۜۜۨۚ۬۠ۦۧۜۥۥۘۨۦۖۘۡۥۙ";
                        break;
                    case -1526919121:
                        String str2 = "ۜۦۦۘۥۜۦۥۥۡۘۚۜۖۘ۫ۛۨۘۦۙۤ۫ۤۖۘۗۧۡۘۙۦۨۘ۬ۧۡۘۦۖۦۘۥۤۢۡۖۘۘۜۥۘۤۖ۠ۦۘ۠ۡۖۧۘ";
                        while (true) {
                            switch (str2.hashCode() ^ (-1291745093)) {
                                case -1292759528:
                                    str = "ۘۢۨۘ۠ۦۧۘۛ۬ۤۨۤۘۖۡۛ۠ۢ۟ۡۚۥ۬ۦۜۘۘۦۚۢ۠۬ۢۙۛ۟";
                                    continue;
                                case -246394002:
                                    str2 = "۠ۡۖۘۜۨ۬ۘۙ۠ۖۧۘۧۜۘۖۖۧۘۗۡۤۤۢۥ۫ۥۖۘۖۤۢۧۨۥۗۚۧۗ۠ۙۚۖۧۘ";
                                    break;
                                case 576991002:
                                    str = "ۜۤۜۘ۬ۡۖۘۛ۟۟۟ۡ۫ۜۚۗۙۦۘۤۚ۠۫ۧۡ۟ۡۢۨۚۢۜ۟ۡۖ۬ۙ۠ۖۘۥۢۧۤ۟ۡۗ۫۟ۡۚۢ۟ۖۙ";
                                    continue;
                                case 1474919432:
                                    String str3 = "ۧۖۘۛ۠ۜۘ۟ۨۦۘ۫ۖۛۦۖۘ۠ۢۥۤۨۨ۬ۧ۟ۦۥۥۡ۫";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-741242196)) {
                                            case -2048015509:
                                                str3 = "ۤۨۨۘۡۦۡۥ۟ۘۘۚۜۡ۟ۡ۬۫ۖۚۥۖۜۘۘۦۘۘۢۨۘۘۜۦۥ";
                                                break;
                                            case -1742540858:
                                                str3 = this.o00Oo0.isShowing() ? "۫ۥۥ۟۠ۧۨۨۜۘۧۗۛ۫ۙۙۜۚ۟۠۠۬۫ۨۘ۬ۘۘۘۛۦ۟ۢ۠ۚۗ۠ۘۘۖ۟ۚۤۤۢ" : "ۧۦ۬ۗۦۗۧۘ۠ۢ۟ۜۢۡۦۘۜۦۤۥۦۙۗۘۖۚۘۦۙۘۥۘۖۥۘۗۢۥۘۥۛۧۢۜۧۘ";
                                                break;
                                            case -620972296:
                                                str2 = "ۤ۟ۖۘ۬ۤۜۚ۫ۤ۟ۙۗۜ۫ۦۙ۬۟۟ۜۘۥۛۜۜۨ۬ۙۥۘۢ۫۟ۚ۬ۧۧۧ۬۬ۙۧ۟۟ۘۘۙۗۙۦۚۙۚۙۖ";
                                                break;
                                            case 1893950324:
                                                str2 = "ۢ۫ۥۘۧ۟ۡۗۛۦۘ۟ۖۛۥۧۘۛ۟ۘۚ۬ۜۢۤۦۘۜۙۨۘۜۤۘۘۙۧۦۘ۠ۨۢۧۥ۫ۡ۟ۦۘ۬ۘۦۘۘۘ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case -1066738502:
                        sb.append("copyOcrExLib 执行完成：");
                        str = "ۘۡۧ۟ۛۖۗۛ۬ۤۜ۠۠ۧۡۘ۟ۨۧۘۘ۫ۚۢۧ۬ۖۤۘۘۜ۫ۘۘ";
                        break;
                    case -996378137:
                        return;
                    case -977731745:
                        String str4 = ElfinFreeActivity.o000OOo;
                        str = "ۥۡۖۘۖۧۨۦۗۧۛۙۜۘۦۢۦۧۧۤۡۚۘۚ۠ۙۡۢ۫ۤ۬ۤۙۜۖۘ۬ۘ۬";
                        break;
                    case -288531710:
                        sb.toString();
                        str = "۬ۗۦۘ۟ۢۜۦۚ۠ۖ۠ۖۘۙ۠۬۠ۚۡۘۙۤۡۗ۬ۚۜۚۘۥۢۖۘ";
                        break;
                    case -103773330:
                        sb.append(bool);
                        str = "ۚۤ۠ۗۛۧ۫ۗۖۧ۬ۤۦۙۛ۟ۨ۠ۨ۬۬ۧۛۡۨۡۙۖۨ۫ۥۖۘۦۚۖ۟۟۠ۢۨۙ";
                        break;
                    case 454241383:
                        str = "۫ۡۖ۬ۛۡۘۖۥۜ۟ۗۦۘۦۖۖۗۥۢۨۜ۠ۡۡۧۘۢۡ۟ۖ۫۫۟ۤۙ۬۬ۛۡۧۡۨۦ۠";
                        break;
                    case 666739451:
                        sb = new StringBuilder();
                        str = "ۗۦۡۘۖۜ۬ۘۘۘۥۨۘ۬ۧ۬ۚۚۡۘۦۖۢۨۡۥۘۘ۫ۖۧۡۖۘۤ۠ۤۨۦۡ۠ۥۘ۟ۖۖۘ";
                        break;
                    case 1135286126:
                        this.o00Oo0.dismiss();
                        str = "ۘۢۨۘ۠ۦۧۘۛ۬ۤۨۤۘۖۡۛ۠ۢ۟ۡۚۥ۬ۦۜۘۘۦۚۢ۠۬ۢۙۛ۟";
                        break;
                }
            }
        }
    }

    static {
        String str = "ۧۨ۠ۢۥۤۤۜۜۡ۠ۢۖۖۦۘۡ۠ۨۘۘۖۦۘۦۚۦۘۜۘ۬ۨۦۘۚۖۡۜۙۛ";
        while (true) {
            switch ((((str.hashCode() ^ 790) ^ 691) ^ 691) ^ 1822766340) {
                case -1789743679:
                    return;
                case 467124201:
                    o000OOo = ElfinFreeActivity.class.getSimpleName();
                    str = "ۦۜۘۘ۟ۡۨۛۡ۟ۦۗۥۘۖ۬ۘۜۗۜۘۖۛۛۙۢ۟ۛۨۨۘ۫ۤۦۢۧۦۥۗ۬۫۬ۘ۫ۨۡ";
                    break;
                case 1738817752:
                    o000000O = LoggerFactory.getLogger(ElfinFreeActivity.class);
                    str = "ۜ۬ۖۥۖۦۤ۟ۤ۬ۜ۬ۢۜۡۘۦ۠۫ۜۧ۠ۗ۬ۧۙۗۨۦۡۜۘۧۡۥۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooOO0(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۚ۫ۖۘۗۗۨۘۗۤۢۚۤۥ۬ۗۥ۟۫ۡۢۜ۫ۥۘۤ۬ۦۘ۫ۨۜ۠ۨۥۛۙۛۙۡۤ۠ۚۥ۬ۘۘ۠۠ۚۖۜۛۦۚۥ";
        while (true) {
            switch ((((str.hashCode() ^ 769) ^ 130) ^ 636) ^ 112206392) {
                case -988216169:
                    elfinFreeActivity.OoooO00();
                    str = "ۖ۟ۥۘۜۚۤ۟۟ۤ۟ۛۜۗۜۥۘۨۡۘۜۛۦۘۚۚۚۜۤۨۘۗۗ۟۫ۛۖۘ۠۫ۗۖ۟۫ۧۘۤ۟ۗۦۚۧۘۦ۫ۘۡ۠ۖۘ";
                    break;
                case 225959500:
                    return;
                case 1023964441:
                    str = "ۖۨۧۘ۬ۡۚۥۘ۠ۙ۫ۦۘۚۤ۬ۦۜۦۘۛۤۦۘ۠ۙۘۘۤۘۛۚۖۤ";
                    break;
            }
        }
    }

    public static /* synthetic */ C4128ma OooOO0O(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۜۚۢۚۡۦۢۙۥۚۙۡۥۛۢۢۜ۠ۦۚۦ۠ۦۢ۫ۛۥۢ۫۠ۦۘۨۘۨۥۙۨۦۗۖۘۙ";
        while (true) {
            switch ((((str.hashCode() ^ 682) ^ 888) ^ 447) ^ 699019194) {
                case -1031979884:
                    str = "ۦۛ۠۬۟ۨۘۛۦ۬ۡۦۘ۫ۤۥ۫۠ۦۧۨ۟ۖۜۤۖۧۚ۬ۢۤۛۛۘۘ۟۟ۡۘ";
                    break;
                case 300601942:
                    return elfinFreeActivity.o0ooOoO;
            }
        }
    }

    public static /* synthetic */ boolean OooOO0o(ElfinFreeActivity elfinFreeActivity, boolean z) {
        String str = "ۤۚۦۘۜۗۛۘۛ۫ۜۥ۬ۢۜۦۗۨۘۚۖۜۜ۫ۗ۟ۗۙۤۚۖۗ۟ۡۧۙۙ";
        while (true) {
            switch ((((str.hashCode() ^ 918) ^ 437) ^ 863) ^ (-1400888895)) {
                case -1663514210:
                    str = "ۤ۫ۛۢۛۢۡ۫ۛۗۦۡ۫ۛۨۘۗ۟ۦۘۜۙۗۜ۫ۨۘۛۡۨۧۦۨۦۨ۫ۢۨۙۡۨۥۘۛۥ۟ۖ۬۫ۗ۠ۜۘ";
                    break;
                case 470387505:
                    elfinFreeActivity.oo0o0Oo = z;
                    str = "ۘ۫ۛ۠ۖ۠ۙۘۛ۫ۖۥۘۛۖۡۘ۫ۢۖۘۜۚۘۘۚۙۚۗۦ۠ۘ۠ۨۡۧ۟ۤۚۜۚۚ۟ۙۡۖۗۛۧۤ۬ۖۖۜۦۘ۫ۡۡۘ";
                    break;
                case 801088484:
                    str = "ۧۢۤۜۛ۟ۚۚ۠ۚ۬ۦۘۚۤ۟ۢ۟ۜۘۗۨۡ۬ۢۦ۟ۧ۠ۙۗۜۘۦۥۚۘ۫ۘۥۘۥۘ۫ۖۦۤۚۢۤۖۧۜۜ۬ۢۥ";
                    break;
                case 892235880:
                    return z;
            }
        }
    }

    public static /* synthetic */ void OooOOO(ElfinFreeActivity elfinFreeActivity) {
        String str = "۫ۗۚۥۙۦۘۗۗۘۘۡۚۥۤۙ۫ۦۘۖۘۡۡۨۘ۠ۡۢۙۥۜۦۙۜ";
        while (true) {
            switch ((((str.hashCode() ^ 639) ^ 255) ^ 508) ^ (-149658931)) {
                case -1667638686:
                    elfinFreeActivity.Oooo0oo();
                    str = "۫ۜۛ۠۬ۜۥۢۧۡۨۖۘۤۙۧ۬ۤۢۚ۠۫ۤۖۦۥۙۥۘۢۖ۠";
                    break;
                case 793848137:
                    str = "ۤۗ۬ۛۤۖۘۡۧۖۘۡۢۦۘ۟ۛ۠ۤۚ۟ۖۚۧۗۨ۠۟۟ۡۜ۟ۥۘۗۜۗۙۧۨۖۧۧ۫۠۬ۡ۟ۡۙۨۛۢۚۡۘۘۤۧ";
                    break;
                case 1964434112:
                    return;
            }
        }
    }

    public static /* synthetic */ C4389tc OooOOO0(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۗۜۖۘۡۗ۠۬۬ۨۢۡۚۧ۫ۡۧۘۧۘۧۚۥۘۨۜۜۖ۫ۥۢۦۦۡۗ۬ۨۧۦ۫ۘۚۜۘ۫۬ۥۘۧۛۘۤۜۢۘۖۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 573) ^ 240) ^ 315) ^ (-1225050629)) {
                case 482635755:
                    return elfinFreeActivity.o0OOO0o;
                case 1795802252:
                    str = "۠ۘۚۡۛۜۛۛ۫۟ۛۙۦۙ۠ۤۗۦۖۥ۬۫ۙۥۘۗۦۚۗۨۨۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooOOOO(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۨۗۜۥۢۡۧۢۖ۟۫ۡۢۨۥۘ۫ۤۤ۠ۨۖۡۤۤ۬ۡۧۚۗۢۨۡۘۛۦۧۥۘۘۦۦ۬۟ۢۘۦۥ۠";
        while (true) {
            switch ((((str.hashCode() ^ 920) ^ 676) ^ 860) ^ (-423573133)) {
                case -1311379904:
                    elfinFreeActivity.Oooo0oO();
                    str = "۟ۨۡۘ۬ۦۚۘۨ۫ۘۜۙۚۦۘۗۛۥۘۖۡۧۘۤ۬ۨۢۛۧۨۜۖ";
                    break;
                case -774007484:
                    str = "ۦۛۥۘ۬ۨۥۘۗۤۤۥۘۜۘۖۗۗۗ۫ۦۘۚ۬ۙۘۘ۠۠۠ۘۘۦۙ۬";
                    break;
                case 255986876:
                    return;
            }
        }
    }

    public static /* synthetic */ void OooOOOo(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۛۚۦۘۥۚۧۜۜۙۛ۠ۨۨۥۙۤۚ۠ۜۘ۬ۗۜۘۗۖۘۢۚۘۘۤۚۦۛۥۢ۬ۗۜۘ۬ۧۥ";
        while (true) {
            switch ((((str.hashCode() ^ 720) ^ 436) ^ UiMessage.CommandToUi.Command_Type.SET_CHECK_BOX_VALUE) ^ 134187116) {
                case -2072297729:
                    return;
                case -323794749:
                    str = "۫۬ۚۙۚ۟ۡۙۖۘۤۙۢۛۘۜۜۤۚۢۦۗۘۙۘۙ۬ۥۘۤۥۡۘۦۖۛۗۥۙۡ۟ۧۨۧۨۘۗۦۗ۠ۤۢۨۖۧۙ۬ۙ";
                    break;
                case 271884253:
                    elfinFreeActivity.Ooooooo();
                    str = "۫ۗۥۚۗۡۘ۠ۙۨۖۧۧۧ۠ۗۘ۬ۜۡۘۘۘۡ۫ۥۛۜۜۘۦ۠ۥۨۗ۬ۙۚۡ۫ۗۗۗۖۗ۟ۥۡۡۜۨۘ۫ۙ۟۟ۖ";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean OooOOo(ElfinFreeActivity elfinFreeActivity, boolean z) {
        String str = "ۖۨۗۛ۟ۘۜۜۥۙۛۧۡ۫ۢۥۘۚۜۘۘۦۦۨۛۨۦ۫ۦۧ";
        while (true) {
            switch ((((str.hashCode() ^ 999) ^ 916) ^ GuideToClickView.C0870a.f1446e) ^ (-971380124)) {
                case -626622948:
                    str = "ۨۧۜۤ۟ۜۡۖۢۙ۬۬۬ۥۙۨۛۧۘۙۘۘۛۖۤ۠ۙۦۚۗۢ۫ۤۡۗۤۜۘ";
                    break;
                case 51165747:
                    return z;
                case 377209499:
                    elfinFreeActivity.o0O0O00 = z;
                    str = "ۘۘۗۦۚ۫ۜۥۖۖۘۧۘۥ۫ۥۜ۬۬۬ۖۢ۫ۢۥۤۥۥۗۤۗ۫ۦۢ۬ۛۧۘۜۘۥۜۙ۠ۨۡۘۡۥۘ";
                    break;
                case 508505555:
                    str = "ۥۧ۠ۡۘۘۥ۟۠ۤۖۢ۠۫ۡۘۧۡ۠۫ۨۥۚۖۡ۫ۡۘۖۙۚۜۡۢۥ۠ۡ";
                    break;
            }
        }
    }

    public static /* synthetic */ View OooOOo0(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۦۘۘۘ۟ۢۥۘ۠ۨۖۘۜۘۨۘۡۡۙۧۗۨ۟ۛ۫۫ۤۖ۫ۘ۫ۗ۬ۢۢۢۘۡۡۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 582) ^ 995) ^ 381) ^ 1440698174) {
                case -1006220938:
                    str = "ۚ۬ۢۜ۠ۤۧۡۢۛۨۤۦۚۜۘۘۡ۟ۖۖۡۨۛۦۦۤۧ۫۫ۗ۫ۡ۟ۚ۬ۦ۬۫ۖۖۛۥ۫ۖۦۖۛۦ۫ۙ۠ۗۘۖۘ";
                    break;
                case 889962738:
                    return elfinFreeActivity.OooooOo;
            }
        }
    }

    public static /* synthetic */ float OooOOoo(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۗۖۥۘۘۡۛۙۖۥۘ۬ۧۚۢۖ۫ۚ۬ۢۛۥۤ۠ۖ۬ۖۙۙ۫ۖۡ";
        while (true) {
            switch ((((str.hashCode() ^ 232) ^ 567) ^ 626) ^ (-2100050288)) {
                case 435131244:
                    return elfinFreeActivity.Oooooo;
                case 1592852217:
                    str = "ۙ۫ۖ۟ۥۘۘۦ۠ۡۨۗۦۡ۫ۥۡۗۖۘۤ۫ۗۧۘۜۘۙۧۛۚۚ۫۬ۨۚۜۧۖۘ۬ۢۘۘۗۢۥۦۘۥۥ۬ۦۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean OooOo(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۦ۠ۘۘۥۗۛۛۨ۬ۙۦۧۡۜۜۖ۟ۥۢۙۡۘ۬ۢۡۚ۫ۦۘۗۗ۫ۖ۠ۥۦۘۜ۫۠ۦۡۜۨۘۧۛۡۘۖۡۦ";
        while (true) {
            switch ((((str.hashCode() ^ 21) ^ 950) ^ 873) ^ (-1488627231)) {
                case -1720956200:
                    str = "ۖۥۘۦۤۥۨۗۗ۫ۨۡۛۜۢ۟ۨۙۗۘۗ۬ۛۦۘۗۜ۟ۜۜۥۘ۠ۗۜۤۨۜۦۥۗۥۦۡ";
                    break;
                case 758340497:
                    return elfinFreeActivity.Oooooo0;
            }
        }
    }

    public static /* synthetic */ float OooOo0(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۤۖۖۘ۠ۦۢۢۖۥۥۧۡۚۘۛۡۡۘۦۙۖۘ۠ۘۥۘۤۡۖۧۦۗۦۚۦۙ۟ۢۙۜۜۘ۠ۦۦۘ۠۬ۥۘۚ۫ۥۘ۟۫ۥۚۢ";
        while (true) {
            switch ((((str.hashCode() ^ 221) ^ 267) ^ 688) ^ 874202972) {
                case -1658235593:
                    str = "ۘۙۘۘۖۨۧۘۙۥۧۦۨ۬۠ۚ۟ۦۖ۟ۦ۫۠ۨۘ۫۟ۥۢۡۜۘ";
                    break;
                case 233117476:
                    return elfinFreeActivity.OoooooO;
            }
        }
    }

    public static /* synthetic */ float OooOo00(ElfinFreeActivity elfinFreeActivity, float f) {
        String str = "ۗۡۘۢۚۚۨۥۘۤۦۘۘۚ۟ۨۡ۠ۘۗۡۧۘۥۨۘ۟ۤۖۤۨۤۤۡۙۨۚۜۘۛۦۥۘۖۗۚۚ۠ۘۢۚۤۧۙۨۘۦۡۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 52) ^ 178) ^ 269) ^ 318654653) {
                case -1618652404:
                    elfinFreeActivity.Oooooo = f;
                    str = "ۥۢۡ۫ۧ۟ۤۜۨۖ۠ۨۘۤۢۜ۟۫ۤۦۙ۫ۖۨ۬ۜۦۜۘۘۙۚ";
                    break;
                case -1385500596:
                    str = "۟ۖۨۡۦۧۘ۬ۗۚۥۜۙۛۖۥۘۧ۬ۧۗۛۘۘۙۥ۬ۗ۬۠ۧۥۥۘ۫ۥۖۘ۠ۧۥۖ۬ۘۚۘ۠ۘۢۛۛۘۜ۬ۖۘۧۜۧ";
                    break;
                case -1016510568:
                    str = "۫ۢ۠۠ۦ۟ۥۘۤۦۨ۬۫۫ۘۖ۠ۢۙۨۤۛۘۤۤۗ۫ۢ۠۬ۖۘۧۨۥۘۤۧۛۗۘۥۛۗۘۘ۬۫ۚ۫ۧۘۤۗۡۘ";
                    break;
                case -893407366:
                    return f;
            }
        }
    }

    public static /* synthetic */ float OooOo0O(ElfinFreeActivity elfinFreeActivity, float f) {
        String str = "ۦۚۡ۟ۢ۫۟ۘۦۡۚ۟ۤۙۢ۬۟ۙ۬ۢۖۛۗۜۘۛۨۦۗۨۛۥۘۧ۟ۘۖۗۛۛ۬ۚۢۢۜۗۥۧۘۚ۟ۢۚۚۙ";
        while (true) {
            switch ((((str.hashCode() ^ C1486b.f7228b) ^ UiMessage.CommandToUi.Command_Type.SET_FW_BUTTON_VALUE) ^ 691) ^ (-1143804897)) {
                case -1031118836:
                    elfinFreeActivity.OoooooO = f;
                    str = "ۖۗۗۨۚ۬ۖ۫ۖۥۘ۬ۤۙۛۘۜۘۨۧۤۥۥۨۡۖۥۘ۬ۦۦۡۡۘۘ۠ۨۘ۫ۚۘۘۙۗۨۘۙۗۥۚۗ۫ۘۜۘۘۙۙۘۘ";
                    break;
                case 1241245838:
                    return f;
                case 1762139096:
                    str = "ۦ۬۟ۙۨۘۢ۠ۤۢۜۘۘۛۚۥۙۤۘۘۡ۠ۜ۬۫ۘۜۖۨۚۚ";
                    break;
                case 1831164830:
                    str = "ۖۦ۬ۥ۟ۚۛۚۤ۟ۡ۟ۤ۟ۖۘ۠ۢ۠ۗ۠ۡۘۦۘۢۗۨۘۤۥۙۤۢۜۘۤ۫۠";
                    break;
            }
        }
    }

    public static /* synthetic */ ImageView OooOo0o(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۙ۬ۦۘ۠ۚۖۜ۬ۘۥۤ۠ۧۧ۬۠ۢۜۖۖۘۚ۬۠ۡۜۙۗۖۦۨۡۗۥۛۦ۬۬ۦ۫۫ۥ۫۟ۦۘۡۘۖۘ۟ۤۗ۠ۧۛ";
        while (true) {
            switch ((((str.hashCode() ^ 486) ^ 316) ^ 176) ^ (-2039845061)) {
                case 947902287:
                    return elfinFreeActivity.o00Ooo;
                case 1605618046:
                    str = "ۘۗۚۢۛۧۜۙۙۨۢۧۚۛ۠۟ۘۘۤۖۛۤۜ۟ۦۘۖۘۧۥ۫ۨۥۨۘۙۢۙۧۤ۫ۖۢۨۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooOoO(ElfinFreeActivity elfinFreeActivity, View view) {
        String str = "ۛۡۨۘ۟ۤۡ۠ۛ۫ۥۤۢۙۡۜۘۤۢۘۘۨ۠۟۟ۙۖۘۙۥۘۨ۫ۧۗۖۙ۠ۘۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 652) ^ 231) ^ 294) ^ 905274574) {
                case -764652373:
                    elfinFreeActivity.OoooO0(view);
                    str = "۬ۢۤۗۗۤۖۡۧ۫ۘۡۘۗۤ۫۫ۙۤۢۦ۠ۛۢۦۘۤ۬۬۬ۚ۫۫ۢۙۨ۫";
                    break;
                case 453270541:
                    str = "ۚ۟ۗۨۚۡۨۦ۬ۚۛ۫ۢۡۛۥۢۜۗۖۘۚۙۥۘۛ۠ۡۘۚ۬۠ۢ۟ۥۘۥۖ۬ۢۡ۠ۖۦۘۘۙۦۦۘۘۘۥۙۙۜۘ";
                    break;
                case 765202138:
                    return;
                case 934305626:
                    str = "ۧۧۚۦۡۥۘۖۙۜۘ۟ۨ۬ۖۚۖۘۜۢۖۨۥۧۘۛ۠۠ۚ۟ۚ۬ۗ۠۟ۡ۠ۥۢ۬ۖۧۘ۬ۥۨۛۤۦۘۛۛۨۘۨۥۥۨۧ۬";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean OooOoO0(ElfinFreeActivity elfinFreeActivity, boolean z) {
        String str = "ۜۦۡۜۧۗۘۜۘۘ۟ۡ۟۟۫ۦۨۜۖۘۗۖۤۥۙۙۜۛۘۤۦۜ";
        while (true) {
            switch ((((str.hashCode() ^ 902) ^ 703) ^ C3580a.f19598e) ^ (-1869661824)) {
                case -1731827502:
                    return z;
                case -1517649455:
                    str = "۠ۢۨۘۘۛ۠ۗۙۡۘۥۦ۠ۙۦۥۘۜۖۦۚۦۖ۟ۦۖۖ۠ۨۡ۟ۘۘۗۢۤ۫ۚۦۧۥۡۚۥۘۜ۬۟ۡۥۜۡ۠ۥۢۡۦۘ";
                    break;
                case 877470083:
                    str = "ۥۦۤ۠ۗۜۘۚ۟ۖۘۧۦۢۨۜۙ۫ۦ۟ۙۘۧۧۥ۠۟ۨۡۢۗۤۡۤۘۜۘۜۤۢۛۛ";
                    break;
                case 1523945966:
                    elfinFreeActivity.Oooooo0 = z;
                    str = "۠۠ۘۘ۬ۜ۫ۖۢۡۢۧۜۘ۬ۙ۠ۨۥۥۛۜۦۘ۟۫ۥۘ۬ۦۧۜۡ۬";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooOoOO(ElfinFreeActivity elfinFreeActivity, View view) {
        String str = "ۘ۫ۡۘۧۢۢۙۤۖۘۘ۫ۛۙۜ۟ۥۚۨۛۙ۫ۨۙۖۘۚۧۡۘ۫ۨۘ۟ۖ۠ۤۧۤۖۚۘۘۥۜۧۘ";
        while (true) {
            switch ((((str.hashCode() ^ 922) ^ 987) ^ 695) ^ (-765835127)) {
                case -1370822726:
                    elfinFreeActivity.ooOO(view);
                    str = "ۘۛۦۙ۫ۧۚ۟ۘۘۛ۟ۜۘ۬ۦ۫۫ۡۘۚ۠ۘۖۦۨۘۥۜۡۛۦ۫ۦ۫ۙۚۦۘۦۖۨۜ۬۟";
                    break;
                case -965453821:
                    str = "ۡۖۜۜ۟ۚۢۢۢۙۛۨ۫ۨ۟ۥ۠۬ۜۘۢۚۛۡۥۗۢۧۨۗۖۘ۠ۘۢ";
                    break;
                case 248717424:
                    return;
                case 1408467983:
                    str = "ۡۘۡۘۦ۬۠ۗۖۦۦۢۧ۠ۤۥۖۢ۟ۨۦۘ۫۠ۙ۠ۥۗۥۧۖ۫ۖۘۦ۬ۢۙۢۖۛۗ۠ۦۖۛۛ۠";
                    break;
            }
        }
    }

    public static /* synthetic */ int OooOoo(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۘۨۥۘۛۧۡۘۛۢۨ۟ۚۘۙ۬۟ۢ۬ۡۦۦۥۘۜۥۧۚۦۥۗۧۥ۬ۨ۠ۦۥۙۨۨۘ۫ۜۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 721) ^ 761) ^ 515) ^ 695294727) {
                case -2089735291:
                    str = "ۛۙۚۧ۠ۘۘۥ۬ۨۘ۟ۘۛ۟ۘۡۘۙۦۚۜ۟ۢ۬ۦۘۗۚۤ۟ۗۨۘۧۥۖۙۗۤۥۢۨۛۚۨ۟ۧۡۚۡ";
                    break;
                case -1014516835:
                    return elfinFreeActivity.o0OoOo0;
            }
        }
    }

    public static /* synthetic */ int OooOoo0(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۘۦ۫ۙۖۨۙ۠ۗ۟ۨۜۙۖۨ۬ۛۚۙۨۥۜ۟۟۫۫ۥۘۖ۫ۘۧۧۦ۫ۘۚ۟ۙۥۧ۠ۥ۬۟ۜۘۤۨۦۢۥۦۜۖۚ";
        while (true) {
            switch ((((str.hashCode() ^ 631) ^ 34) ^ 617) ^ 1858741504) {
                case -769686445:
                    str = "ۦۘ۬ۧ۫ۨۘۨۥ۠ۨۧۦۗۨۘۧۧۙۘ۟ۚۡۙۨۡ۠ۖۘۙۨۤۖۡۘۘۘ۠ۗۦۥۧۘۙۢۗۗۨۜۢۥۚۗۘۦۙ۠";
                    break;
                case 1759125487:
                    return elfinFreeActivity.Ooooooo;
            }
        }
    }

    public static /* synthetic */ AndroidViewModel OooOooO(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۧۥۦۤۡۧۥۗ۟ۛ۬ۡۛ۬ۥۥۥ۫ۙۚۤۤۘۜ۟ۗۜۨ۠ۛۚۗۜۢۤۘۘۡۥ۫ۨۥۖۙۥۖۢۜ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_UIP_DATA_VALUE) ^ 568) ^ 812) ^ (-643138092)) {
                case -1786641553:
                    str = "۬ۦ۠ۥۤۡۘ۠ۦۖۗۖۛ۫ۖۢ۬ۛ۫ۙۜۧۜ۠ۙۥۨۘۚۡۜ۬ۡۢۗ۠ۚ";
                    break;
                case -682520708:
                    return elfinFreeActivity.OooooO0;
            }
        }
    }

    public static /* synthetic */ void OooOooo(ElfinFreeActivity elfinFreeActivity, ArrayList arrayList) {
        String str = "ۖ۬ۗۜۥۥۘۙۖۙ۫ۨۥ۬ۛۗ۟ۗ۫ۛ۠ۧۡۖۘۨ۬ۥۢۥۖۘۙۡۘۘۖ۬ۗۢۥۤۦۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 98) ^ 386) ^ 437) ^ 519802798) {
                case -1814464559:
                    elfinFreeActivity.OoooOoO(arrayList);
                    str = "ۨۨۜۘۤۦۦۘۗۖۘۦۨۦۘۧۘۘۘ۫ۚ۫ۚۢۨۘۨۛۙۡۥۦۘۜ۫ۚۘ۟ۖۘۦۧۙۧۢۙ";
                    break;
                case -1774408193:
                    return;
                case -1677795271:
                    str = "ۧۤۥۘۛۛۢۛۡ۬ۤۙۖۘ۠ۛ۠ۚۙۗۨۤۖۛۜۨۘۢۗۡۘ۠ۥۨ";
                    break;
                case -1350042652:
                    str = "۫ۨ۫۠ۛ۫ۦۥۘ۟۬ۖۘ۠ۘۙ۠۫ۨ۬۫ۥۘۤۗۜۘۙ۬۫ۗۨۨ";
                    break;
            }
        }
    }

    private void Oooo() {
        String str = "ۦۛۡۘۘۡۢۨۨۢۘ۫ۤۤۢۚ۟۠ۤۦۘۦۛۖۘۛۤۘۥ۠ۡۘ";
        int i = 0;
        TextView textView = null;
        int i2 = 0;
        TextView textView2 = null;
        TextView textView3 = null;
        String string = null;
        String string2 = null;
        StringBuilder sb = null;
        String string3 = null;
        StringBuilder sb2 = null;
        while (true) {
            switch ((((str.hashCode() ^ 750) ^ 556) ^ 167) ^ 1921039545) {
                case -1875556946:
                    sb.append(C4491w3.OooOoo0(this).y);
                    str = "ۚۜۘۘ۠۠ۙۢۨۧۘۗۦۨۘۦۜۢۡۘۨۛۖۗ۠ۥۙۤۘۤ۫ۧۘۘ۫ۚۤۦۨۨ";
                    continue;
                case -1842316088:
                    str = "۠ۧۢۛۛ۬۠ۢ۬ۦۧۨۘۜ۬ۨۘۢۘ۟ۥۙۡۢۧۡۘ۟ۛۨۘۨۙۨۥۗۥۖۥۘ";
                    i2 = i;
                    continue;
                case -1827881229:
                    textView = this.o00oO0o;
                    str = "ۤۛ۠ۙۚۡ۬ۙۜۘۚۘۢ۬ۤۛ۫۬ۧۨۛۘۢۦۗۛ۫۠ۥۖۘۡۦۡۘ۬۫ۗۛۡۗۦ۟";
                    continue;
                case -1798905753:
                    str = "ۘ۟۠ۘۤۜۘۢۚ۠ۖ۟ۜ۫۬ۥۜۘۨۘۙ۬ۤۤۘۘۗۡۘۖۜۚ۬۬ۜۨۗۨۨۨ۬۫ۧۤ۟ۦ۬ۗ۟ۘۘۘ۟ۖۖ۬ۦ";
                    string2 = sb.toString();
                    continue;
                case -1707963379:
                    sb2.append(Marker.ANY_MARKER);
                    str = "ۜ۟ۙۨۜۢۗ۟ۚۘۦۘۜۗ۬ۘۨۖۧ۫ۘ۠ۢۦۙۘۘۘۗۖۜۘۙۖۡۡۦۥ";
                    continue;
                case -1621342618:
                    i = 8;
                    str = "ۘۘۥۘۤۦۛۘ۫ۡۨۗ۠ۦۖۡۡۧۤۚۥۜ۟۫ۙۚ۠ۢۢۤۘ۬ۥۘۘ۟۬۬ۙۥۦ۟ۛۜۘۧۚۡۘۛۦۡ";
                    continue;
                case -1549214857:
                    str = "ۚۜ۫ۥۚۦۘۥۤۛۘۥۙۢۙۧۜۜۦۧۘۛۘۡۨۥ۫ۤۢۡ";
                    sb = new StringBuilder();
                    continue;
                case -1337610993:
                    str = "ۙۦۜۥۤۙۧۧۥۘۧ۫ۤ۟ۦ۠ۖۢۡۘۖۢۘۘۖۧۘۘۛۨۤۢۘ۬ۤۛۘۛۖۥۘۜۖۡ۠ۤ۠ۢۛۦۘۛۗۛۚۗ۟ۙ";
                    textView2 = textView3;
                    continue;
                case -1183336886:
                    String str2 = "ۙۚۦۘۜۖۗۗۖۖۘۤ۠۟ۚ۟ۛۙۧ۬ۥۙۖۘۤۡۙۜۦۗ۬ۢۖۗۧۛۜۧۥۘۚۦۘۜ۬ۦۜۧۨۥۢۢۥ۫۟ۖۖۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 353761520) {
                            case -2140049849:
                                break;
                            case -1787026974:
                                str = "ۜۡ۠ۦۤۖۘۨ۠ۜۦۚۘۗ۫ۡۥۤۘۗۥ۬ۛۦۘۘۢۨۘۖۤۤۛۤۡۢۧ۠ۘۛۢۧ۟";
                                break;
                            case -774640738:
                                String str3 = "ۡۤۙۖۦۤ۠ۡۗۘۥ۠ۖۨ۟ۘۧۨۛۚۛ۬ۧۢۙۡۧۙۦۡ۠ۥۥۦۗۚۨۜۘۢۢۦۚۤۛ";
                                while (true) {
                                    switch (str3.hashCode() ^ 357679265) {
                                        case -1943353346:
                                            str3 = !string.contains(string2) ? "ۜ۫ۦۘۛۨۖۢۘۥۘۘۚۢۙۜۧۘۡ۫ۖ۬۟ۚۧۗ۠ۨۦۜۘۙۛ۬ۡۥۛ۫ۥۤۙ۬۫ۖۤ۫ۚۜۦۘۧ۫ۛ" : "۬ۖۜۡۥۚۚۚۙۗۖۘۘ۟ۜۘۤ۫ۥۘۛۨۙۘۖۡۙۧۜ۫۬ۧۤۢۛۢۥ۫۠ۡۤۡۖۘۧ۫ۚۦۗۘۗۧۛۥۤۛ";
                                            break;
                                        case -602733556:
                                            str3 = "ۚۚۥ۠ۛۧۜۥ۫ۖۖۡۦۗۦۙۛۤۛ۬۫ۘ۠ۦۙۚۙۤۡۥۘۖۘۨۛۘۘ";
                                            break;
                                        case 443532327:
                                            str2 = "ۨۢۧۛ۬ۦۘ۬۬ۖۘ۠ۢۜۘۦۘۛۤۡۛۘۨۨۡۜۨۘۘ۬۫ۡۢۤۜۧۖۘ۬ۧۥۜ۬ۨۧ۫ۦۙۢۤۘ۠ۛۜۚۖۜ۬ۙ";
                                            break;
                                        case 1879367388:
                                            str2 = "ۦۖۛۧۡۗ۬ۢۘۧۦۗۜۤۚۦ۟ۨۨۡۙۢۛۘۘ۟ۤ۫ۜۦۧۡ۬ۡۢ";
                                            break;
                                    }
                                }
                                break;
                            case 680419798:
                                str2 = "۫ۡۨۘۥ۫ۧۤۥۥۦۛۦۘۧ۬ۛۗۛۨۚۜۥۥ۠ۖۘۖ۟ۘۘۚۛۜۘۨ۬ۥۘ۠ۘۘۘۨ۠۠ۥۨۢۚۤۦۦۢۜ";
                                break;
                        }
                    }
                    break;
                case -952676931:
                    sb2.append(C4491w3.OooOoo0(this).x);
                    str = "ۗۗ۫ۘۢ۫ۖۨۡۘۡۚۤۥۙۖۦۦۨ۠ۤۙۚۥۘۛۨۧۘ۟ۦ۠";
                    continue;
                case -933741986:
                    str = "ۤۙۦۘۤۦ۠ۧۡۘۙۦ۫۬ۧۡۘۧ۟ۨ۠۠ۦۚۗۖۘۡ۠ۡۥۚۤ";
                    string3 = sb2.toString();
                    continue;
                case -886308447:
                    str = "۬ۚۗۙۖۖۘ۫ۡۥۛۡ۠ۧۦ۬ۢۦۨۤۗۡ۫ۙۦۘۡۨۘۙ۟۠ۜ۬ۨۨۧۘۘۥۘۙۥۥۨۘ";
                    i2 = 0;
                    continue;
                case -560499964:
                    str = "۟ۖۖۘ۟ۤۖۡۨۡۘۖۛۘۘۡۦۚۨ۠ۘۘ۫۟ۨۘۙ۫۬ۢۥۛۢ۫ۡ";
                    string = getString(R.string.app_resolution);
                    continue;
                case -525477109:
                    str = "ۡۢۡۖۚۧۥۤۤۢ۟ۖۘۘۡۖ۟ۖ۫ۗ۬۠ۥۛۘۘۚۥۥۧۗۜۛۦۤۗۥۗۡۘۙۤ۫";
                    textView2 = textView;
                    continue;
                case -267287843:
                    sb.append(C4491w3.OooOoo0(this).x);
                    str = "۬ۙۢۗ۬ۡۘ۟ۢ۬ۡۚۤۢۛۢۦۙۥۘۙ۬ۗۨۘۖۜ۠۬ۙۖۛ۠ۗۦ۠ۘۘ۟ۨۨۛۗۡ";
                    continue;
                case 122270959:
                    sb.append(Marker.ANY_MARKER);
                    str = "ۖ۫۟ۚۢۥۘۖۖۧۥۨۗ۬ۘۥۘۖۥۨ۫ۛۥۦۖۢۜۗ۬۟ۛۜۜۛۛۗۢ۬ۥۦۘۧۘۦۘ";
                    continue;
                case 214015790:
                    str = "ۚۖۖۘ۠ۡۜ۠ۗۖۘۥۖۡۦۦۢ۠ۜ۠ۤۡۖۤۨۚۖۦۧۘۚۥۘ";
                    continue;
                case 267918610:
                    textView2.setVisibility(i2);
                    str = "ۚۡۘۘۧۚۦ۟ۨۧۘۥۨۨۙۙۙۨۢۢۧۛۤ۫ۙۤۜۧ۫۫ۚۖۨ۫ۘۘۛ۬ۙۖۜۜۘۗ۬ۡۘ";
                    continue;
                case 318462421:
                    break;
                case 525263263:
                    str = "ۡۤ۬ۘۤۧۙۧۡۘۧۢۜۗۖۘۘۡ۠۠۬۟ۜۘۨۡۙۗۥۙۖۙۖ۟ۥۢۘۡۙۘۚۗ۫۠ۘۘۧۨۧۘۗۗۢ۠ۙۘۘۙۦ";
                    sb2 = new StringBuilder();
                    continue;
                case 941575864:
                    String str4 = "ۖۜۘۤۙۡۘۢ۫ۙۗۧۨۜۜۗۛ۟۫ۢۥۥۥ۠ۨۢۤۨۜۖۘۙۦۛ۟ۘ۫۬ۡۚۗۤۗۤۤۢۨ۟ۜۘۚۖ۠ۙۛۛ";
                    while (true) {
                        switch (str4.hashCode() ^ 156457045) {
                            case -1928073379:
                                String str5 = "ۘۢ۬ۜ۫ۤۡۤ۬ۨۘۛۙۗۜۜۧۘۘۗۗۚ۫ۙۚۡۤۜ۫ۥ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-920308448)) {
                                        case -2105262235:
                                            str4 = "ۦ۟ۢۥ۠ۥۘ۟ۜۢ۠ۨۦۘ۠۠ۨۘ۟ۛۚۡ۬ۤ۫ۚۨۛۖۘ";
                                            break;
                                        case -191817011:
                                            str5 = !string.contains(string3) ? "ۨۗۨۢۗ۠ۖۤۢۛ۠۫ۙ۠ۘۙۡۧۚۖۘۧۦ۫ۛ۠ۘۙ۫ۖۘ۬ۧۥۘۗۡۡۘ" : "ۤۜۚۨۥۧۘۤۖۡۘۗۥۖ۫ۥۜۚ۬ۘۘ۠ۢۜۘ۫ۦۜۚۛۚۢۥۦۘۦ۟ۨۚۘۘۘۦ۠ۜۦ۬۫ۙۦۘۛۘۘۖۢۥۘۤ۫ۛ";
                                            break;
                                        case 440042036:
                                            str5 = "ۢۜۢ۠ۨۜۘ۠ۖۨۘ۬ۧۡۘۜۥ۫ۗۚ۫۟ۗۚۜ۬۫ۗۖۘۘ۠ۙۜۘۤۢۖۨۥۘ۫ۢۥۘۦۜۘۘۚۨ۫۠۟ۚ";
                                            break;
                                        case 708035032:
                                            str4 = "۟ۚۙ۟ۛۙۢۤۗۛ۫ۙۘۡۘۜۡۘۖۧۘۘۙ۬ۙ۠ۖۢ۟۫ۥۘۡ۟۫ۤۗۙۡ۟ۦۘۙۜۢ۠ۨ۟ۘ۟ۖ۫۫ۙۤۥ";
                                            break;
                                    }
                                }
                                break;
                            case -1517364724:
                                str4 = "ۧۦۛۦ۟ۜۘۘۚ۫ۤۘۢۘۚۨۤ۫ۡۢۢۤۜ۟ۧۛۤ۫ۦۨۥۧۧ۫ۚۢۦۘۧۥۧۚ۫";
                                break;
                            case -706739646:
                                break;
                            case 92497781:
                                str = "۬۬ۡۘۨۧۤۘ۫ۦۧۖۢۧ۟ۧۡۖۡۘۗۧۦۘ۬ۖۖ۠ۦ۠ۛۗۦۘۢۤۦۘ۫ۧۢۥۛ۬ۜۗۦ۟ۦۤۙۜۥۡۛۡۘۦۦۨ";
                                break;
                        }
                    }
                    break;
                case 1035596306:
                    textView3 = this.o00oO0o;
                    str = "ۘۛ۬ۦۜۘۘۗۦۙۡ۫ۨ۬ۡۦۘ۟ۘۗ۫ۖ۬ۜۜۗۦ۫ۦۘۦۥۖۘ";
                    continue;
                case 1122726802:
                    String str6 = "ۥۚۛۡۜ۠ۙۚ۟ۥۦۜ۠ۜۚ۟ۚۜۦ۬ۗۨۗ۠ۜ۬ۜۘ۠ۥۤۘۤۖۘۙۨۥ۫ۧۥۘ۟۠ۛۥۦۛۨۗۡ";
                    while (true) {
                        switch (str6.hashCode() ^ (-55289363)) {
                            case -1137677712:
                                str6 = "ۚۤۧ۫ۧۖۘۥۘۨۧۘۥۘۤۡۢۧۙۘۡۡۦۧ۬ۤۧ۟ۡ۬ۜ۠ۨۦ۟۫۠ۘۜۦۢۡ۟ۙۥۘۤۗۚ";
                                break;
                            case -183331198:
                                String str7 = "ۙۛۥۘ۟۫ۜۘ۬ۤۥۡ۫ۨۘ۠ۚۡۖ۠ۥۙۜۥۘۧ۫ۡۙۧۨۛۢ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1823297804)) {
                                        case -1344596298:
                                            str6 = "ۛۧۦۘۦۡ۬۫ۨۥ۠ۗۧۢۖۘۘۚۧۢۢۗۖۛۙ۟۟۫ۢۚۨۦۘ۬ۡ۫ۜۘۧۘۧۗ۠۠ۘۤۚۜۨ۫ۗۤ";
                                            break;
                                        case -220423968:
                                            str6 = "ۡۗۗۦۚ۬ۤۧۘۡۦ۬۠ۛۛۢۛۖۘۛۧ۠ۛۥۜۘۖۙۘۘۘۖۦ";
                                            break;
                                        case -39818176:
                                            str7 = "ۚۖۖۘۦۢۡۘ۫ۨۘ۠۫ۥۘۖۙ۫ۢۤ۟۬ۚۥۘۛۚۛۢۖ۠ۢ۟۟۫ۛ۟ۚۛۛۥ۠ۘۚۦۚۗۤۨۘۦۘۖ۫ۚۘۦۘۘ";
                                            break;
                                        case 1268103148:
                                            str7 = TextUtils.isEmpty(string) ? "ۨۙۡۨۨۖۚ۬ۦۤۤۦۘۡ۫ۥۜۚۦۘۙۘۨۖۢۦۙۗۜۘ۬۟ۛ۠ۖ۟ۙۗ۟ۡۙ۠۬ۤۙ۬ۢۤۖۜۥ" : "ۙ۟ۜۘ۟ۘۛ۫ۖۡۜۛۧۥۡۘۜ۬ۜۘ۫۠۠ۙۙۧۥۗۜۘۢ۠ۜۘۗۨۜ۠ۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case -111519299:
                                str = "ۗۖۚۙ۫ۢۛ۬ۖۜ۫ۖۗۗ۠ۙ۬ۙۦۨۘۤۙۚۛۜ۠۠ۦۜۘۛۡ۬۟ۖۗۗ۠ۥۘ۠ۜۦۘۗ۬ۤۧۦ۠ۨۡۢۦۚۡۘ";
                                continue;
                            case 1881333260:
                                str = "ۙۢۧۢ۠ۦۘۛۙۨۘۙ۫ۢ۬ۥۖۛۨۧۘۥۨ۫۠ۢۗۡۤۨۡۚ۟۠۠۫ۘۙۘ۠ۦۡۥۗۡۘ۟ۘۦۜ۟ۖۘۘ۫ۤۖ۬ۦ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case 1492238308:
                    return;
                case 1621998103:
                    sb2.append(C4491w3.OooOoo0(this).y);
                    str = "ۦۘ۬۫ۦۥۘۗ۠ۦۘۤۥۖۢ۠ۘۙ۬ۛۜ۟ۥۦۗۨۘۜ۟ۗۡۖۡۜ۠ۜۘۧ۟ۨۙۥۥۘۛۧۖۘ";
                    continue;
                case 1824220873:
                    str = "ۢۦۚۚۗ۫ۤۥۘۘۨ۬ۡۘ۬ۛۚۨ۫ۧۨۜۥۘۨ۟ۧ۬ۦۡۦۨۘ۫۬۬ۘۦ۫۠ۨۗۡۜۜ۠ۤ۬ۛۥۦ";
                    continue;
                case 1936756592:
                    str = "ۡۢۡۖۚۧۥۤۤۢ۟ۖۘۘۡۖ۟ۖ۫ۗ۬۠ۥۛۘۘۚۥۥۧۗۜۛۦۤۗۥۗۡۘۙۤ۫";
                    continue;
            }
            str = "ۧ۬ۥۦۘۦۘۢۖۥ۬ۦۘ۠ۨۡ۫۠ۜۖۙۚ۠۬ۘۘۘ۟ۖۙ۠ۤۡۤۘ۫۬ۥۜ۟ۜۧ";
        }
    }

    public static /* synthetic */ boolean Oooo0(ElfinFreeActivity elfinFreeActivity, boolean z) {
        String str = "ۗۖۨ۬ۡ۟ۤۚۘۘۗۤۨۡ۬ۦۘۡۤۘۙۤۖ۫۬۟ۨۖۙ۫ۛۤ۬ۥۡۚۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 162) ^ 1022) ^ UiMessage.CommandToUi.Command_Type.SET_ROW_ALIGNMENT_VALUE) ^ (-529680463)) {
                case -938758900:
                    str = "۬ۜۖۘۢ۠ۧۛۘۢ۫ۢۤۙ۫ۛۙۧۨۘۜۗ۟ۦۖۥۤۡۖ۫۟ۦ۠ۥۥ۫ۦۙ۠ۥۡۗۖۤ";
                    break;
                case -559417751:
                    str = "ۜ۠ۙ۫ۤۦۘۚ۟ۤ۫ۤۦۗۡۧۘۗ۟ۗۘۖۨۘۤۜۨۘ۟۫ۛ۬ۦۡۢۧۡۘۤۘۛ";
                    break;
                case -74763646:
                    elfinFreeActivity.o0OO00O = z;
                    str = "ۛۛۚۗ۬ۛۛۗۖۡۥۛۜۚۥۦۘ۟۫ۢۙۦۧۢۙ۠ۥۛۨۘۘ۠ۘۚۦۥ";
                    break;
                case 2092315071:
                    return z;
            }
        }
    }

    public static /* synthetic */ NotificationCompat.Builder Oooo000(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۘۧ۬۟ۚۤۘۥۨۘۚۖۘۡ۠۟ۘۤۙ۫ۥ۟۟ۦ۫ۖۦ۬ۨۥ۫ۜۘۘۘۗۜۜۨۨ۠ۤۡۜ";
        while (true) {
            switch ((((str.hashCode() ^ 715) ^ C1801a.f11005aP) ^ 696) ^ 2006046077) {
                case -2045771025:
                    str = "ۨۥۖۚ۟ۥۘۙۡۘۘۡۘۢۛۛۗۘۖۢۤۢ۬ۡۛۡۘۡ۫ۘۘۢۜۖۘۘۙۢۜۤۘۘ۟۠ۢۨۥ۫ۜۥۡۖ۟";
                    break;
                case -669909417:
                    return elfinFreeActivity.o00O0O;
            }
        }
    }

    public static /* synthetic */ NotificationManager Oooo00O(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۨۤۘ۠ۧۦۘۦۚۘۘۤۗ۫۟ۥۖۘۗۤۖۘ۬ۜۨۘۙۤ۬ۢۨۢ۟ۘۦۦۚۖۘ۬ۜۖۘۥۥۗ۟ۘۗ";
        while (true) {
            switch ((((str.hashCode() ^ 600) ^ 25) ^ 815) ^ 2137816302) {
                case -2092887429:
                    str = "ۢ۫ۢۛۜۘۘۗۘۦۘۜ۫ۜۙ۠ۘۧۢۖۘۙۗۥۛۚۧۘۦۙۗۨۘ";
                    break;
                case 1804673643:
                    return elfinFreeActivity.o00Oo0;
            }
        }
    }

    public static /* synthetic */ boolean Oooo00o(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۘۙۥۡۦۦۡۘ۠۠ۖۨۘۚۥۖۥۨۧۖۧۘۘۧۚۜۡۨۜ۟۬۟ۘۛۘۘ۠ۨۥۘ۠ۡۚ۟ۨۗ";
        while (true) {
            switch ((((str.hashCode() ^ 672) ^ 412) ^ UiMessage.CommandToUi.Command_Type.GET_BACKCOLOR_VALUE) ^ (-45449686)) {
                case -1715386914:
                    str = "ۛ۬ۤۛۘۚۤ۬ۨ۟۬ۗۡۥۜۘۧ۫ۥ۟۠ۡۦۨ۬ۢۜ۟۫ۨۘۖۚۨۘۚۚۖ";
                    break;
                case -605375530:
                    return elfinFreeActivity.o0OO00O;
            }
        }
    }

    public static /* synthetic */ ViewOnClickListenerC3684aa Oooo0O0(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۜۥۥۙ۠ۡۘۘ۟ۘۡۥۤۗۥۘ۫ۛۧۥۖۘ۠ۤ۟۠ۨۘۗ۬ۡ۟ۤۨ۫ۨۙ۟ۘ۫ۨۨۚۗۦۛ۟۠ۜۨۗۛۢۧ";
        while (true) {
            switch ((((str.hashCode() ^ 978) ^ 337) ^ 627) ^ 360496839) {
                case 499641275:
                    return elfinFreeActivity.o0Oo0oo;
                case 533812332:
                    str = "ۙۚ۠ۢۡۨۘۦ۫ۘۥۧ۬ۧۤۖۘۛۨۛۤۢۙۥۘۘۡۜۥۘۘۦۜۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ ViewOnClickListenerC3684aa Oooo0OO(ElfinFreeActivity elfinFreeActivity, ViewOnClickListenerC3684aa viewOnClickListenerC3684aa) {
        String str = "۬ۨۙۧۚ۠ۤۧۛۜۖۦ۟ۧۨۘ۬۠ۖۚۦۦۡۙ۠ۡۙ۠ۦ۫ۢ";
        while (true) {
            switch ((((str.hashCode() ^ 283) ^ 691) ^ 157) ^ 1181599026) {
                case -1538690815:
                    elfinFreeActivity.o0Oo0oo = viewOnClickListenerC3684aa;
                    str = "ۜۗۢۖۡ۬ۘۚۚۡ۬ۜۘ۟ۨۦۚۛۜۘۦۢۜۘۨۦۘۦۦۖۧۚۢ۠ۜۧۘۧۦۖۦۡۥۘۛۙ";
                    break;
                case -711970537:
                    return viewOnClickListenerC3684aa;
                case -246852850:
                    str = "ۡ۟ۢ۟ۛۗۖ۟ۧۘ۫ۖۘۙۥۤۤ۫۟ۤۢۜۛۡۖۘ۫ۘۥۡۤۖۚۘۚۛۗۨ۠ۖۡۢۥۧ۟ۖۘۚ۠ۘۚۨ۟ۛۨۧ";
                    break;
                case 518869775:
                    str = "ۗۦۨۘۜ۠ۖۘۘۡۨۨۛ۠۫ۤۚ۫ۨۦۘۢۦۘۘ۟۟ۡۘۚ۠۫ۗۗۦۛۨۤۘۛۥ۠ۚۙۜۨۥ۫ۙۦۘۦۢۜۘۥۛۨۥۧۤ";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean Oooo0o(ElfinFreeActivity elfinFreeActivity, boolean z) {
        String str = "۬ۢ۟ۙۦۦۘۤۡۚۡ۠ۙۡۧۗ۬۬ۧۡۘۙۘۢۜۙ۠۟ۙۦ";
        while (true) {
            switch ((((str.hashCode() ^ 585) ^ UiMessage.CommandToUi.Command_Type.LOAD_PROFILE_VALUE) ^ 377) ^ (-1566953676)) {
                case -1978137593:
                    str = "ۨۖۛ۬ۤۥ۟ۖۤۙۙۜۗۦۦۘۗ۠ۨۘۙۨۥۨۛۜ۟ۚۡۘۡۤۜۗۚ۠ۢ۫ۦۘۗۗۨۘۡۙۡۗۨۙۙۨ۬";
                    break;
                case -72209604:
                    str = "ۢ۬ۘۘۤۤۦۛۚۨۘۛۥۨ۠ۧۨۢۘ۫ۘۙۘۘ۠ۦۘۘۤ۠ۤۙۨۨۗ۠ۜۘۧۗۡۘۧ۬ۢۘ۬ۘۤۨۘۨۜۜ۠۫ۥۘۧۘۧ";
                    break;
                case 293600698:
                    return z;
                case 889126639:
                    elfinFreeActivity.o0ooOOo = z;
                    str = "۫ۤۖۗ۠ۡۨۧۨۥۧۡ۬ۧ۫۠۟ۘۘۨۖۘۘۗۤۧۡ۫ۘ۟ۡۡ۟ۛۡۨۧۨۢۥۡۘ۬ۡۙ";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean Oooo0o0(ElfinFreeActivity elfinFreeActivity) {
        String str = "ۦۜۨۘ۫ۤ۫ۜ۬ۜ۫۠ۥۙۚۢۥۡۜۢۖۥۘ۠۟ۡۘ۠ۢۘۧ۟ۜۜ۠ۜۨۡۗۜۥۦۘ۫ۖۜ";
        while (true) {
            switch ((((str.hashCode() ^ 9) ^ 199) ^ 168) ^ 1227926262) {
                case 523958438:
                    str = "۬ۥ۬ۥ۫۬ۨ۬ۨۘۧۦۦۘۧۡۨۨ۫۠ۙۨۥۢۥۗ۬۫ۧۙۘۡۘ";
                    break;
                case 1873425321:
                    return elfinFreeActivity.o0ooOOo;
            }
        }
    }

    private void Oooo0oO() {
        String str = "۟۟ۢ۠ۖۛ۟ۢۙۗۤۚ۬ۨ۟ۙۛ۠ۖۚ۬ۙۧۦۚۜۢۛ۫۟ۚ۫۠ۧۡۘۤۚۡۘۨۧۙ۟ۗۚۨ۠";
        CountDownTimer countDownTimerStart = null;
        TextView textView = null;
        FrameLayout.LayoutParams layoutParams = null;
        View viewInflate = null;
        ViewGroup viewGroup = null;
        Point point = null;
        while (true) {
            switch ((((str.hashCode() ^ 741) ^ 995) ^ 895) ^ 1995914232) {
                case -1572785017:
                    this.OooooOo.setLayoutParams(layoutParams);
                    str = "۬ۙۡۡۨۖۘۡۨۥۨۜۤۗۚۗۚۖۗ۟۠ۘۚۜۡۥ۬ۦۘ۬ۜۜۘۙۖۗۥۛۜۗۚۖۘۚ۠ۖۘ۫ۦۘۘ۟ۛۘۘۗۛۡۘۧۧۤ";
                    break;
                case -1354489482:
                    this.o0OoOo0 = point.y - 280;
                    str = "ۖۧ۬ۡۡۤۘۤۦۘۨۦۘ۬ۤۘۘۗۜۡۘۢۘۗ۠ۦۛۦۥۦۘۡۙۨۘۨ۟ۖۖ۫ۨۘۛۥۤ۫۫ۦۧۛ۠ۗ۫ۗۘۥۘۗۢ۫";
                    break;
                case -1233230142:
                    this.OooooOo.findViewById(R.id.im_remvoe_view).setOnClickListener(new OooO0O0(this, countDownTimerStart, viewGroup));
                    str = "ۤۛ۠ۗۦۘ۟ۤۜۜ۬ۗۗۧۖ۫ۨۢۚۧۙ۠۬ۘۖۨۜۘۚۢ۫ۜۧۖۘۙۦۢۢۤۡۘۦۙۦۧ۫ۦۖۦۗۢ۟ۛۢ";
                    break;
                case -718917991:
                    str = "ۗۦ۫ۦۖۘۘۛۢۥۘۛۚۨۚۚۥۦۖۨۡۤۙۖۗۛۚ۫ۖۖ۬۬";
                    layoutParams = (FrameLayout.LayoutParams) viewInflate.getLayoutParams();
                    break;
                case -623724352:
                    this.OooooOo.setOnTouchListener(new OooO0OO(this));
                    str = "ۘۧۦۘۦۗۚۜۜ۬ۦۡۥۘۗۖۘۗۧۨۦۙ۬ۚۦۧۘ۟ۥۨۘۨۡۘۘ";
                    break;
                case 242131054:
                    this.OooooOo = viewInflate;
                    str = "ۖۜۜۘۖۧۦۖۘۧۚۨۚ۠۬ۛ۟۫ۧۨۜۘۘۢۨۡۚۡۧ۟ۤۥ۬ۙۤۦۢۦۖۨۘ۫۫۫۫ۡۛۤ۠ۘۘۥۗۡۡۦۤ";
                    break;
                case 263228170:
                    layoutParams.leftMargin = (int) ((((double) this.Ooooooo) * 0.7d) - ((double) this.OooooOo.getWidth()));
                    str = "ۛۢۘۘۖۗۢۗۖ۠۠ۗۤۡۗۥۘ۟ۥۜۖۡۘ۠ۦۛۤ۫ۙۤ۠ۘۘ۫ۤۨۘۛۗۚۚۥۘۘۧۡۖۚۡۚ";
                    break;
                case 291499480:
                    getWindowManager().getDefaultDisplay().getSize(point);
                    str = "ۚۡۦۡ۫۟ۙۦۘۘۤۙۙۘۧۘۖۥۘۛ۫ۚۧۥۘۡۘۘۘۥۨ۬ۤۦۥۙۦ۬۠ۤۧۨ۫ۘ";
                    break;
                case 429484366:
                    this.Ooooooo = point.x;
                    str = "ۤۛۨۡ۬ۜۨ۫۫ۤۦۡۘۢۖ۟۠ۥ۟ۤۧ۟ۦۥۘۦۗۛۤۤۦۘۡۡۥۘۤۡ۬ۤۛۗ۟ۗۜۘۚۖۜۘۨ۠";
                    break;
                case 436434025:
                    str = "ۥۡۜۦۢۨ۠ۚۤۚۦۥۘ۫ۛۛۖ۠ۥۘۢ۬ۘۘۚ۠ۛۤ۬ۛۨۛۤ۫ۡۤ۠۠ۢ";
                    viewGroup = (ViewGroup) findViewById(R.id.mainContainer);
                    break;
                case 555428721:
                    str = "۟ۙۚۡۖۚۛۦۘۘۧۦۚ۫ۖۜۘ۫ۛۜۘ۬ۖ۬۠ۡۨۘۨۛۦۡۧۢۙۜ۠ۖ۠ۨۘ۬ۚۥۘۥۤ۟ۜۖۘۨۙ۫ۥۛ۠ۦ۫ۦ";
                    break;
                case 821730457:
                    layoutParams.topMargin = (int) (((double) this.o0OoOo0) * 0.2d);
                    str = "ۛ۫ۥۨۘۘۗۙۜۦۙۥۘ۫ۛۖۘۡۗۘۙۢۘۘۧۨۗۤۦۦۘۗۜ۠ۛ۬ۧۗۜ۬ۤ۬ۡ۫ۚۚۗۥۘۘۧۘۥ";
                    break;
                case 1049679189:
                    return;
                case 1060535659:
                    str = "ۦۤۚۦ۠ۥۘۛۜۦۘ۬ۜۤۘۙۗ۬ۚۤۥ۟۬ۨۥۦۘ۫ۢۥ۬ۤ۟ۖۤ۬ۥ۫ۜۡۖۧۖ۫ۦ";
                    point = new Point();
                    break;
                case 1067014839:
                    viewGroup.addView(this.OooooOo);
                    str = "۫ۜۡۥۙۘۥ۟۟۬ۤۥۘۛۖۘۘ۬۬ۜۘۢۢۘۘۙۥۘۚۚۖ۟ۨۘۘ";
                    break;
                case 1325322712:
                    this.o0O0O00 = true;
                    str = "ۡ۠ۙ۫ۨۨۛۜۡۖۧۛۦۢۛۢۥۤۡۦۢۜۢۧۥۢۖۤ۟ۥۦۢۥۘۜ۬ۨ۟۬ۖۡ۟ۗۥۘۘۥۡۤ";
                    break;
                case 1381187949:
                    countDownTimerStart = new OooO00o(this, ((long) C4529x4.OooO0O0().OooO0OO(InterfaceC3865f6.OooOo0o, 5)) * 1000, 1000L, textView, viewGroup).start();
                    str = "۟۫ۦ۟ۨۙ۫ۨۧۘۘ۬ۜۘ۬ۗۚ۠ۡۜۦۗۖۥۥۥۚ۫ۘۜۚۦۘۥۨ۬۬۫ۤۦۖۖۘ۠ۤ۬";
                    break;
                case 1686873907:
                    str = "۠ۖۗ۫۠ۤۦۧۥۗۚۖۢۙۙۗ۠ۜۘ۠ۛۘۘۛ۟ۤۛ۟۫ۘ۟۬ۢۦۜۨ۟ۘۚۧۦۘۨۛۗۧ۫ۜۨۜۘ";
                    viewInflate = LayoutInflater.from(this).inflate(R.layout.float_auto_start, viewGroup, false);
                    break;
                case 1912535207:
                    str = "ۙۜ۫ۧۜۨۦ۟۠ۥۦۦۘ۠ۤۦۡ۫ۚۗۧۡۢ۠ۗۛۜۧ۫ۗۘ۫ۚ۟ۤ۫";
                    textView = (TextView) this.OooooOo.findViewById(R.id.tv_countdown_time);
                    break;
            }
        }
    }

    private void Oooo0oo() {
        String str = "۟ۛۜۘۡۧ۬ۘۧۘۘۘۡۢۥۚۚ۟ۛۤۦۜ۫۬ۗۚۘۢۢ۬ۛۨۘۦۚۤۚۖۜۖۗۖۛۛۨ";
        while (true) {
            switch ((((str.hashCode() ^ 988) ^ 718) ^ 51) ^ (-2119280438)) {
                case -645266678:
                    str = "ۦۡۘۘۤۧۦۘ۟۬۬ۡۧ۠ۨۛۢۗۦۦۘۧۤۤۖ۬ۡۛ۬۠ۦۤۖۘ۠ۚۥۘۙۚۜۜۥۡۥۡ۫ۗۢۢۢۚۘۘ۠ۤۗۡۚۗ";
                    break;
                case 14825584:
                    moveTaskToBack(true);
                    str = "ۛۜۡۘۗۖۤۙۜۘۘۗ۬ۨۘۘۨ۬ۧۤۛۘۨۚۤۛۢۛ۠ۨۘۦۡۘ۟ۡۡۗۛۙۢۤۗۜۖۗۗۡۘۜۧ۟ۦۚ۠ۥۤ";
                    break;
                case 145059100:
                    this.ooOO.postDelayed(new Runnable() { // from class: z2.f9
                        @Override // java.lang.Runnable
                        public final void run() {
                            ElfinFreeActivity.OooooOO();
                        }
                    }, 1000L);
                    str = "ۛۘۤۛ۫ۡۘۦۛۡۘۖۥۡۙۡۦۘۡۦۛ۬۬ۡۘۗۨۚۡۜۧ۟ۡۛۡۗۦۖۦۧ";
                    break;
                case 1390009417:
                    return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:228:0x0019. Please report as an issue. */
    private void OoooO0(View view) {
        String str = "ۨۙۖۘ۠ۤۘۘۚ۠ۢۧۚۜ۠ۙۨ۫ۗۖۘۗ۫ۜۘۤۢۜۜۡۦۛ۬ۥۘ";
        float height = 0.0f;
        float f = 0.0f;
        float width = 0.0f;
        float f2 = 0.0f;
        float y = 0.0f;
        float x = 0.0f;
        while (true) {
            switch ((((str.hashCode() ^ 23) ^ 497) ^ 202) ^ (-1776974372)) {
                case -1667894729:
                    view.setY(f);
                    str = "ۛۙ۫۠ۤۨۘ۫ۤۥۖۖۚۦ۠ۤۦ۟۟۟۬ۖۘۗۖۘۘۖۤۗ۬ۜ۫ۦۗۚ۠ۖۢۨۧۦۘۢۗۖۘۥ۠ۖ۫ۛۛۡۗۤۗۗۛ";
                    break;
                case -1498596233:
                    str = "۟ۛۗۘۛۨۘۖۦۙ۬۟ۛۜۤۨۘۡۤۗۛۘ۬ۘۥۥۦۜ۟۫ۚ";
                    break;
                case -1084306224:
                    view.setX(f2);
                    str = "۟ۛۥ۠ۗۜ۠۫ۙ۟ۗۡۦۧ۟ۤۘۡۨۢۜ۬۬ۧ۬ۨۘۚۚۗ۟ۢۦ۫ۨۘۡۨۦۘۜۦۡۘۢۦۦ۠ۚۥۘۖۚۨۘ۬ۡۧ";
                    break;
                case -955847603:
                    String str2 = "ۚۤۖۨۗ۫ۦۧ۫ۤۜۤ۟۟ۜۘۖۛۢۡۦۧۡ۬ۜۘ۫۠ۜۗ۫ۘ۟۠ۚۦۜۙ۟۟ۡ۫ۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-366774411)) {
                            case -1959227722:
                                str = "ۗ۬ۦۜۦۘۘۚۧۧۡ۟ۥۜۧۦۘ۠ۧۛۙ۠۬ۨۜۥۙۦۨۙ۬۠ۢ۬۠۠۟ۘۦۡۡۢۤۖۘۚۘۨۢۗۛۨ۟ۡۘۘ۟ۦۘ";
                                continue;
                            case -1807051487:
                                str = "ۚۢۚۚۢۦۘۢ۟۫ۛۧۘۘۛۨۦۚ۬۬ۖۧۘۖۨۘۘۗۦ۫ۧ۫ۨۖۡۜۛۗۢ۬ۘۥۗ۟ۨۢۨ۟ۙۙۡۘۖۘۖۘۤۛۨۘ";
                                continue;
                            case -1513315192:
                                String str3 = "ۜۙۡۜۦۖۜۡۜۘۙۤۧۙۦۜۢۙۘۧ۫ۖۨۤۨۘ۠ۘ۬ۦ۫۠ۡۡۖۖۦۥ";
                                while (true) {
                                    switch (str3.hashCode() ^ 156758665) {
                                        case -2088536853:
                                            str2 = "ۨۥ۟ۤۧۘۘۗۗۗۘ۫۠ۤۙۧ۟ۡۡۢۢۦۘ۠ۗۗۙۗۗۖۙۙۙۢۢۛۘۖۘ";
                                            break;
                                        case -540795682:
                                            str2 = "ۧۧۥۨۙۚۗۘۧۡ۠ۨ۫۟ۨۢۡۜۘۖۨ۟ۧۙ۠ۘۦ۬ۙۘۦۖۨ۠ۦۙ۬ۗۚ۠۬۠۫۠ۨۧۛۥۦۗۖۘ۬۟۬";
                                            break;
                                        case 1468422166:
                                            str3 = y < 0.0f ? "ۚۧۥۛۡۦۥۗ۟ۜ۟ۙۥۦۜ۠ۜۢۙۤۜۘۦۖۖۘۤ۫ۜ۠ۛۜۘ" : "ۨۖۨۦۡۨ۠۠ۨۘۢ۟ۘۘۜ۫ۨۘۨ۫ۜۘۖۢۥۚۘۖۘ۟ۙۛۖۧ";
                                            break;
                                        case 1955084030:
                                            str3 = "ۧۙۗۙۚۙۧۤۛۛۜۙۦۛ۠ۧ۠ۗ۫۠ۨۧۗ۟ۛ۫ۖ۬";
                                            break;
                                    }
                                }
                                break;
                            case -892386560:
                                str2 = "ۖ۠ۛ۫ۨۢ۬۬۠ۙۤ۟۬ۜۛۙ۠ۤ۠ۥ۬ۚۛۦۥۨ۠۫۠ۚۡۥۨۘۛۤۜۘۦ۠ۘۘۧۘۦۧۘ۬ۧۦۘۖ۟ۦۘۥۚۥۘ";
                                break;
                        }
                    }
                    break;
                case -635967533:
                    str = "ۧ۠ۗۥۨۢ۬ۙۡۡۛۖۘۛۡۨ۟ۤۨۘۧۜۜۗۤۧۗۛ۫ۡۦۥ";
                    f2 = 0.0f;
                    break;
                case -411843460:
                    y = view.getY();
                    str = "ۙۤ۟۟۟ۛۘۚ۟ۜۧۖۡۨۜۥۨۢۡۘۙ۬ۢۘۘۘۡۡۖۖۥۘۚۖۥۘ۫ۗ۟";
                    break;
                case -355325941:
                    String str4 = "ۥۖ۬ۦۙۢۡۛۥۗۡۜۘ۬۠ۨۘۡۢ۟۠ۜۘۥۜۜۨ۬ۡۘ۟۬۠";
                    while (true) {
                        switch (str4.hashCode() ^ 740646277) {
                            case -1707101686:
                                str4 = "ۖۘۨۙۙ۟ۡ۫ۜۦۜۘۜۤۥۘۖۖۦۘۛۛۖ۠ۤ۫ۘۡۥ۫ۧۢۚۙ۫۠ۡۤ";
                                break;
                            case -1107369417:
                                String str5 = "ۚ۫ۡۘۤۥۢۡۨۡۗۚۜۧۘۖۛۘۥۘۜۨۡۨ۠ۖۦ۟۬ۨۗ۫ۢ۫ۡۘۧۨۡ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1081751205)) {
                                        case -1730667841:
                                            str4 = "ۖ۠۬ۘۡۘۘ۠۫ۜۘۜ۟ۦۡۥۜۢۡۙۜۜۘۧۦۘۘ۟ۡۧۘۙ۬ۨۘۥ۟۬ۚۖۨ۬ۤ۬ۥۨۡ";
                                            break;
                                        case -1122891187:
                                            str5 = "ۜۧۦۙۚۥۖ۟۟۫ۨۡۘۙۘۘۡۦۛۜۦۧۘۥۡۙۢۧۚ۠ۖۖ۬۬ۜۚۘ۟";
                                            break;
                                        case -369309238:
                                            str5 = x > ((float) (this.Ooooooo - view.getWidth())) ? "۠ۗۛۜۡۡ۟ۢۜۙ۬ۥۖۢۛۤۙۜۘ۠ۗۤۛۡۧۘۢ۠ۜۘۖۡۜۘ" : "۫۟ۨۘۖۘۚۢۤۦۘۡۗ۬ۥۧۨۘۚۧ۬ۢۘۘۙ۬ۡۜۘۖۘۡۛۧ";
                                            break;
                                        case -60067793:
                                            str4 = "ۘ۠ۡۘۥۨ۟ۜ۬ۖۘۢۛۘۘۨۨۘۖۧۧ۠ۛۜۢۥۘۗۦۖۡۤۡۘۜۧۘ۠ۤۢۥۥۥۘۘۜۖ۫ۦۧۧۧۦۘۚۗۨۘ۠۫ۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case -559990707:
                                str = "۬ۖۥۡۛ۬ۡۤۡۖۧۧۧۘ۫ۧۗۜۘ۬ۖۡۘۥۨ۟ۤ۬۠۠ۛۨ";
                                break;
                            case -503809381:
                                break;
                        }
                    }
                    break;
                case 8520287:
                    str = "۟ۛۗۘۛۨۘۖۦۙ۬۟ۛۜۤۨۘۡۤۗۛۘ۬ۘۥۥۦۜ۟۫ۚ";
                    f = height;
                    break;
                case 50570834:
                    str = "ۙۛۤ۬ۨۖۧۡۘۘۖۧۤۤۧۜۘۨۢۗۛۡۘۙۜۥۘۦۦۦۢ۬ۧۙ۬ۤ۠۫۬ۖۥۨۨۥۦ۠ۗۚۛ۬";
                    break;
                case 221310338:
                    String str6 = "۠ۤۗۚۙۘۘۢۦ۬ۧۦ۟ۜۗۛ۫ۙ۟ۚۖۦۚۙۨۘ۟ۘۚ۟ۚۥۗۜۡۘۙۚۥۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 1388711564) {
                            case -1590458245:
                                String str7 = "۫ۚۨۧۗۘۘۧۛۗۗۢۜۘۢۤۧۙۨۦۘۦۙۡۖۢ۬ۧ۠ۥۙۧۘۖۘۤ۫ۘ۬ۡۨۜۗۖۘۦۜۧۘۚۢۗۜۙۤۖۤ";
                                while (true) {
                                    switch (str7.hashCode() ^ 174133144) {
                                        case -986905413:
                                            str7 = x < 0.0f ? "ۛۨۡۦۤ۟ۥۙ۬ۨۡۦۘۥۧۜۘۚۨۘ۬ۦۦۗۚۖ۫ۚۘۘۨۜۜ۬ۛۜۘۖۘ۫ۙۘۘۚۗۨۧ۫ۘۘۤ۠" : "ۚۨۧۘۤۢۦۘۤۖۛۥ۫ۡۘۡ۠۬ۥۛۜۘۘۡۘۖۧۘۥۙۜۜۤۤۛۡۚ۟ۘۨۘ۟ۗۜۛ۠ۤۥۤۥۚۚۥۘ";
                                            break;
                                        case 138570861:
                                            str6 = "ۤ۫ۥۘۧۨۙۙۨۥۘۗۥۜۧۘۥۘۘۜۥ۟۠۫ۧۛۤۚۖ۫۠۠۟ۛ۟ۖۘۘۡ۬ۥۛۜۧ۫۬ۡۘۛۛۥۘ";
                                            break;
                                        case 1648788348:
                                            str6 = "ۙۖۜ۫ۥۛۘ۟ۡۢۘ۠ۘۙۜۛ۫ۖۧ۟۫۟ۤ۬ۙ۬ۜۘۢۥۖۘۢۧۦۧۗۨۘۗ۫ۨۘۢۢۗ۬ۨۙۢۥۢ۬ۖۘۤۢۡۘ";
                                            break;
                                        case 2023621612:
                                            str7 = "۬۬۠ۗ۠ۘۡۨ۬ۨۦۨ۬ۙ۬ۨۖۧ۬ۧۧ۠ۜۦۘ۬ۢۖۢۤۚ";
                                            break;
                                    }
                                }
                                break;
                            case -299604088:
                                str = "۠ۙۥۘ۟ۦۙۛۙۘۘۥۨۘۘ۬ۜۧۘۗۧ۟ۗۤۛ۫ۨۗۖۥ۬ۥۨۘ";
                                continue;
                            case -250596122:
                                str6 = "۫ۚۖۘۚۖۙۛۚۥۘ۠۠ۘ۬ۤۢۦ۫ۨۖۦۜۚۗۢ۬ۗ۫ۛۧۖۖۡۦۡ۬ۤۚۥۦۢۡۦۡۡۦ۠ۛ۟ۘ۬ۖۘۜۡۦ";
                                break;
                            case 571555745:
                                str = "۠ۛۨۧۘ۬ۘۥۧۨۘۜۘۚۖۜ۫ۥۨۘۖ۫ۦۨۘۖۘۥۖۛۛ۠ۦ";
                                continue;
                        }
                    }
                    break;
                case 300513166:
                    height = this.o0OoOo0 - view.getHeight();
                    str = "۬۫ۖۗۤۦۘۛ۬ۙۡۖۦۜۥۘۧۖۘۖۢۚۚۧۥۘۥ۠ۗۡۖۥۘ";
                    break;
                case 573695497:
                    width = this.Ooooooo - view.getWidth();
                    str = "ۥۖۖۘۚ۬ۜۘۖۥۖۚۗۗۚۜۛۛۖۥۘۥ۟۫ۧۧۘۗۙۜۜۤ۫ۘۜۘۗۤ۟ۦۙۡۦۡ۬ۙۦۢۙۥۨۘ";
                    break;
                case 745522989:
                    str = "ۥۨۦۨ۬ۘۘ۬ۡ۫ۧۡۨۡۖۡۢۘۛۙ۬ۚۗۡۘۘ۟ۙۦۘۚۢۘۘ۠۟ۧۖۤۜۤۜۚۧۡۘۥۜۘۗۧۡ";
                    break;
                case 753014223:
                    str = "ۘ۠ۦۙۢ۠ۜۥۙۤۘ۫ۡۖۤ۬ۧ۠ۨۚۖۧۗ۬۬۠ۤۙۛ۫";
                    f = 0.0f;
                    break;
                case 845739389:
                    str = "۠ۘۨۖۘۢۘ۟ۨ۠ۥۦۤۥۘۘۘ۠ۥۙۘۨۘۢۘۚۚۡ۬ۙ۠ۢ۫ۨۛۦۤۚ";
                    f2 = width;
                    break;
                case 1033612003:
                    break;
                case 1180746971:
                    str = "ۜۥۗۥۘ۬ۖۢۡ۬۠ۘۘۧۙۖۨۖۧۘۦۛۙۛۘۙۨۧۜۘۡۢۥۘۜ۠ۜۘۗۖۨۘ";
                    f2 = x;
                    break;
                case 1184895091:
                    String str8 = "۟ۢۘۖ۫ۥۘۧ۫ۡۘۤۚۚۤۦۛۨ۫۬ۙۡ۬ۖۧۜۘۡۤ۠ۢۨۖۘۘۥۘۘ۫۠ۡۙۧ۫ۡۢۗ";
                    while (true) {
                        switch (str8.hashCode() ^ 1195603120) {
                            case -2031527202:
                                str8 = "ۨ۬ۤ۫ۖۛۨۛۦۘ۫۫ۘۘۦۤۢۛۛۖۗۧۖۘۥۧۨۡۡۙۧۤۜۘۛۥ۟ۖ۠ۦ";
                                break;
                            case 250535132:
                                str = "۫۫ۡ۟۫ۜۘ۫ۡۡۥۛۦۘۘۙۚۡۨۧۘۧۥۧۘۗ۠۬۠۫ۨۘۥۗۘ";
                                break;
                            case 1024898296:
                                String str9 = "ۜۡۡ۟ۤ۫۬ۡۜ۫ۙۡۨۨۘۘۙۡۘۨۘ۬ۖۥ۟ۦۚۦۘۢۦۜۘۥ۟ۢۨۖۧۘ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-1389258805)) {
                                        case -2133270990:
                                            str9 = "ۡۗۗۚۙۜۗۦۘۨۜ۟ۙۧۘۘۦۘۦۘۗۥۗۨۛۡۤۨۡ۫ۤۨۘ۠ۖۜۥۨ۬۬ۛۡ۬ۙ";
                                            break;
                                        case -1589460832:
                                            str8 = "ۚ۬ۡۘۧ۫ۥۘۤۥۚۢۜۜۙ۟ۗۛۙۜۗۜۨۘ۬ۢۦۘۗۨۖۡۤۜۘ۬۬ۛ۫ۘۛۥۛۘۜۖۧ۠ۧۦۘ۟ۥۜ";
                                            break;
                                        case -597431016:
                                            str9 = y > ((float) (this.o0OoOo0 - view.getHeight())) ? "ۥۖۧۘۦۖۙ۬۬ۘۘۛۧۥۘۨۨۗۘ۠ۜۘۡۤۡۘ۫۟ۙ۫ۢۙۚۛۢۘ۫ۘۘۛۜۦۘۘ۟ۢۧۛۨۖۤۜۘۗ۠ۦۘ" : "ۗۘۥۨۧ۬۫ۦۙۛۤۗۙۥۘۡۙۘۘۚۥۤۨۖۖۘۛۨۡۛ۫ۚۖۧۘۖۧ۫ۗۘۘۧۘۦۥۖۘۘۙۜۛ۠ۘۛۘ۫ۧ";
                                            break;
                                        case 1223707832:
                                            str8 = "۠ۙۡۡ۫ۦۘۥۡۙۜۡۧۙۨۦۡ۬ۘۘ۠ۚۜۘ۫ۥۖۘ۟ۧ۠ۤۜۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1663777827:
                                break;
                        }
                    }
                    str = "۟ۛۗۘۛۨۘۖۦۙ۬۟ۛۜۤۨۘۡۤۗۛۘ۬ۘۥۥۦۜ۟۫ۚ";
                    break;
                case 1298049186:
                    x = view.getX();
                    str = "ۛ۫ۥۘۡۤۘۘۡۨۜۥۖۡۘ۠ۙۦۤۤ۫ۧ۬ۧۤۢۚۦۘۗۨۥۘۨ۫۫ۖۧۚۜ۠ۖۘۙۗۖ";
                    break;
                case 1330115128:
                    str = "ۧۤۖۡۘۦۘۧۨۧۘۤۛۦ۫ۘۜ۠ۨۘۢۛۜۚۡۘ۟۠ۖۡۙ";
                    break;
                case 1436489216:
                    str = "۫ۘۦۤۤ۟۬۠۠۠ۧۦۥۖۚۦۙۧۤۨۜۗ۫ۨۦ۠ۧۖۚۡۘ۬ۥۨۘۥۦۙۙۜۦۘۗ۫ۖۚۦۗۧ۫۠۫۠ۡۘۡۛ۟";
                    break;
                case 1727122461:
                    str = "ۖۦۧۘۨۧۛۜۢۡۙ۫۟ۡۘ۟۟ۚۘۤ۟ۨۤۢ۬ۢۘ۠ۗ۠۬۫۬ۙ۫۟۟ۡۦ۬ۤۨۘۦۤۥۘۤ۬ۖ۟ۚ۬ۤ۬ۛ";
                    f = y;
                    break;
                case 1850599876:
                    str = "۠ۘۨۖۘۢۘ۟ۨ۠ۥۦۤۥۘۘۘ۠ۥۙۘۨۘۢۘۚۚۡ۬ۙ۠ۢ۫ۨۛۦۤۚ";
                    break;
            }
            return;
        }
    }

    private void OoooO00() {
        String str = "۟ۜۢۖۥۡ۟ۘ۫ۙۜ۫ۙ۟ۥۘۖۛۥ۠ۗۘۢۥۜ۬ۗ۫ۡ۟ۦۘۙۧۚۦ۬۟۟ۘۘۙۧۛ";
        Script scriptOooO0oO = null;
        while (true) {
            switch ((((str.hashCode() ^ 317) ^ 654) ^ 961) ^ (-1494076832)) {
                case -1237971254:
                    String str2 = "ۡ۟ۥۥ۬ۨ۟ۧ۠۫۠ۤۥۘۜۤۛۚ۬ۨۡۘۨۧ۫ۗۤ۫۟۟۠۫ۚۚ۬ۙۧۛۢۤ۫۬";
                    while (true) {
                        switch (str2.hashCode() ^ (-2007078333)) {
                            case -833467812:
                                String str3 = "۬ۙۖۘ۠ۖۧۖۢۦۘ۫ۖۛ۟ۢۨۘۢ۫ۦۘۖۦۜۘۖ۫ۥۘۨۦۨۘۙۜۘۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1832098742) {
                                        case -1202272996:
                                            str3 = "ۜ۬ۡۨۥۧۚۘۧ۬ۥۥۘ۬۬ۚۦۙۘۥۧۡۢۜۥۘ۠ۨۜۗۗۤۧۢۧ۬ۖۛۤۖۘۘۢۧۘۘۨۜۘۘ۠ۗۧۦۖ۠ۤۜۥۘ";
                                            break;
                                        case 71442086:
                                            str2 = "ۖۜۦۢۢۘۘۤۢۖ۠ۤۤۗۤۦۘۧۖ۟ۖۙۡۤۤۘۘۢۦۨۘ۬۠ۡۘۚۡۛۜ۬۠ۨۘۦۘ۫ۘۗ۬۫ۜۖۦۜۘ";
                                            break;
                                        case 362240533:
                                            str3 = C4381t4.OooOO0(this) ? "ۛۢۚۙۖۗۜۦۗۦۛۧۤۤۤ۬ۘۖۥۧ۫۬ۛۛ۬ۘۘۥۚۜۜۛۢۘۜۥ۠۠ۦۨۘۧۘۥ۟ۘۘۡۦۢ" : "ۢۙۦۘۦۗ۠ۚۨۦۘۜ۟۠ۛ۠ۥ۬۫ۛۙۙۤ۠ۡۘۛۘۖۗ۟ۛۤۤۜۥۚۥۥ۟ۜۚۖ۠";
                                            break;
                                        case 494772928:
                                            str2 = "ۦۘۢۡ۬ۥۘۤۗۖۘۙۡۨۧۧۙ۟ۚۖۘۡۙۡۘۥۡۥۘۡ۫ۦۥ۟۟ۙۖۦۤۗۤۛۢ۫ۨۡۘۗۡۡۡۛ۬";
                                            break;
                                    }
                                }
                                break;
                            case -104409283:
                                str = "ۜ۠ۦۘ۟ۛۤۡ۟ۘۘۦۘۡۘۤ۠ۗ۫۫۬۫ۜۦۙ۠۫۫۬ۘۙ۠ۢ";
                                continue;
                            case 893780506:
                                str = "ۗۨۖۘ۬ۦۨۧۜۥۥۖۘۘۚۥۘ۠۟ۖۘۤ۫ۜۘۡۗۘۘۡۖۥۘۤۜۨۘۙ۠ۧۤۖۛۜۢ۫ۛ۬ۤۖۛۥۢۥۨۘ";
                                continue;
                                continue;
                            case 1017602994:
                                str2 = "ۧ۫ۧۢۘۚۡۥۥۘ۟ۜۜۘۧۨۧۘۧۜۖۘۥۖ۠ۡۤ۫ۨۛۖۖۨۥۥۛۡۖۚۥ";
                                break;
                        }
                    }
                    break;
                case -1104014951:
                    str = "ۗ۫ۡۘۙۙۚۢ۬ۜۘۙ۫ۚۧۜۙۜۖ۟ۥۙۖۤۢۧۥۖۥۘۧ۫ۘۙۖۚۥۤۥۜۘ۬ۚ۬۫ۡ۠ۘۘ۟ۗۨ";
                    scriptOooO0oO = C3718b7.OooO0Oo().OooO0oO();
                    continue;
                case -887476712:
                    C3765ch.OooOo().OooO(this, getString(R.string.elfin_appid), scriptOooO0oO.getId(), C3834ec.OooO0OO().OooO0O0.DeviceId, C3951hi.OooO0oo());
                    str = "ۡۖۥۘۙۨۜۡۥۘۚ۬ۘۛۨ۠ۗۜۡۘ۬ۘۘۢۦۦۘۦۨ۬ۙ۠ۨۘ";
                    continue;
                case 130513999:
                    return;
                case 528811754:
                    this.ooOO.sendEmptyMessageDelayed(1009, C2187m.f13871ag);
                    str = "۬ۢ۫۫ۛۗ۟ۢ۫ۧۚۖۥۛۨۘۙ۠۬۫ۡۚۗۤۤۢ۟ۥۧۥۚ۠ۜۜۤۚۖۥۥۘۛۙۘۘ";
                    continue;
                case 746963677:
                    str = "۟۠ۜۘۘ۟ۜۖۢۤۡ۫ۘۘۙ۬ۢۗ۠ۥۘ۟ۤۖ۠ۛ۠ۦۥۘ۠ۜۨۘۚۘۘۦۥۘۘ۬ۙۦ۫ۡ۬ۥۙ۬ۜۖ۠ۥۜۘۨۧۤ";
                    continue;
                case 1514257839:
                    String str4 = "ۨۙۖۚۚۢۚۛۡۘۖۨۧۧ۟ۖۘ۬۠ۦ۬ۡۦ۬ۨۘ۬ۥۡ۬ۨۘ۟ۥۘۥۧۥۘۨ۫ۘۘ۫ۢۢۡ۟ۖۘۤۦ۠ۥۗۦۘۨ۟ۖ";
                    while (true) {
                        switch (str4.hashCode() ^ 1916284573) {
                            case 120930280:
                                String str5 = "۠ۖۜ۬ۧۗۘۢۥۙۚۘۘۦ۫ۢ۟ۨۡۢۖۜۘۨ۠ۨۛۡۨۡۜۧۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-926335677)) {
                                        case -1153644190:
                                            str4 = "ۤۜۜۘ۫ۙۦۧۙ۟ۘۨ۬ۜۗ۟ۚۤ۫ۘ۟ۗۘۧۧۢۤۖۘۦۙۦۜۛۖۘۢۨۧۘۙۡۥۤۚ۫ۖۥۧ۫ۤۡۛۜۡۘ۠۬ۖۘ";
                                            break;
                                        case -1003253812:
                                            str5 = !this.ooOO.hasMessages(1009) ? "۬ۡۙۨ۠ۦۘ۬ۢۥۘ۬ۗۥۘۡۚ۟ۛ۠ۜۛۘۘۛۨۡ۟ۜۘۨۨ۠ۤۛ۬ۘۢۥۘۡۘۖۘۨ۬ۚ" : "ۛۥ۬ۚۗۜۘۘ۬ۥۘ۠ۚۦ۫ۦۦۘۤۨ۫ۛ۬ۦۗۦۘۨۤۤۤۡۢ۠ۦۗۢۛۜۢۧۦۖۤۘۘۤۙۘۤۦۛ";
                                            break;
                                        case 271283596:
                                            str5 = "ۘ۠۫ۥۜۥ۫ۘۜۘ۠ۛۡۘ۫ۙۡ۟۬۠ۧۤۖۛۜ۬۬۫ۗۦ۫ۖۘۡۤۖ۫ۢۤ";
                                            break;
                                        case 721882481:
                                            str4 = "۫ۘۥۘۗۘۧۘۚۛۥۤۜۜۘ۫ۚۥۘۦۚۗ۬۫ۗۚۙۛۦۤۡۖۖۙۢ۫۟۫۟۠ۘۨۖۢ۫ۥ۠ۥۡۨۨ۫۫ۢۙۚ";
                                            break;
                                    }
                                }
                                break;
                            case 277214029:
                                str = "ۤۙۚۥۤۘۢۛۚۧۧ۬ۧ۠ۖۘۗۢۢۖۦۙۖۡۥ۠ۘۨۧۥۘ";
                                break;
                            case 1802715744:
                                str4 = "۟ۦۧۦۖۜۘۢۛۚۛۗۜۧۡۦۚۨۚۢۢۢۖۜۘۘۗۛۡۘۥ۫ۦۧۨۛ۬ۚ۬ۥۜۥۛۚۧۢۛ۬ۢ۫ۦ";
                                break;
                            case 2092007285:
                                break;
                        }
                    }
                    break;
                case 1662461573:
                    break;
            }
            str = "۬ۢ۫۫ۛۗ۟ۢ۫ۧۚۖۥۛۨۘۙ۠۬۫ۡۚۗۤۤۢ۟ۥۧۥۚ۠ۜۜۤۚۖۥۥۘۛۙۘۘ";
        }
    }

    private void OoooOO0() {
        String str = "ۚۙۥۢۥۙۡۨۨۘۗۡۥۘۡ۠ۗۗۖۥۘۜ۟ۙ۬ۛۖۘ۬۟ۢۗۚ۫ۗۦۨۖۢۖ";
        while (true) {
            switch ((((str.hashCode() ^ 75) ^ 449) ^ UiMessage.CommandToUi.Command_Type.SET_RADIO_GROUP_VALUE) ^ (-964077923)) {
                case -2077363728:
                    str = "۫۟ۥ۬ۢۤۖۘۨۘۤۖۧۢۥ۠۠ۛۙۡ۟ۤۜۤۜۘۧۚۦۙۨۖۘۦۧ۫ۧ۟ۥۘ۟ۚۡۘۜۧۘ";
                    break;
                case -1592226352:
                    return;
                case -213931044:
                    AppContext.OooO00o().OooO();
                    str = "ۨۦۦۘۤ۫ۘۘۙۧۤۨۘۘ۠ۜۗۖۘۤ۬ۧۘۘۚۥۛۤۙۜۘۖ۫";
                    break;
            }
        }
    }

    private void OoooOOO() {
        String str = "ۢۜۗ۠۬ۦۨ۬۫ۙ۫ۜۖۖۨۘۨۧۛۙۥۖۤ۫ۦ۠ۖۢۤ۟";
        while (true) {
            switch ((((str.hashCode() ^ 229) ^ 84) ^ 883) ^ 980611965) {
                case -810998737:
                    C3827e5.OooO00o().OooO0o(new Runnable() { // from class: z2.g9
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.OoooOoO.Oooooo0();
                        }
                    });
                    str = "۬ۥۤۚۜۘۘۛ۬ۜۧۧۨۛ۬۫ۡۦۦۨ۠ۤۗۜۙۗۘۖۘۙۚۨۘ۟۬ۗۚۗ۠";
                    continue;
                case -721930709:
                    String str2 = "ۗۤۡ۠ۧۙ۬ۨۤ۠ۘۢۘ۬۬ۤ۬ۘۙۛۥۙۤۦۤۜۥۘۛۧۜۘۢ۠ۥۘۗۢۥۦۨۦۚۙۛۢۘۘۥۦۦ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1988638989)) {
                            case -1912730892:
                                str = "ۤ۫ۢۖۤۤ۫ۜۢۥۨۤۚۛۧۖۙۘۙ۬ۖۖۦ۠۫۟ۢ۟ۤۜۘ";
                                break;
                            case -1886463662:
                                str2 = "ۙۜۛ۬۟ۧۧۢۘۢ۠ۖۘۦ۟ۘۘۗۨۢۙۚۗۗۖۨۡۖ۫ۜۗۘۘۨۡۡۘۘۗۜۨۛۥۘ۬ۜۙۖۗۦ۠ۥۖۜۚۦۘ۠ۜۜ";
                                break;
                            case -482879150:
                                String str3 = "ۧ۫ۤ۬ۧ۫ۡۜ۠ۜۦۥۘۚۤۥۦۦۨ۠ۙ۟۫ۥۦۘۗۢۖۚ۟ۘۖۘۧۚۥۡ۠۠ۦۙۜۘۗۤۛۡۥ۬ۜۘۛۘ۬ۚ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1067252433)) {
                                        case -1462293328:
                                            str2 = "ۜۖۗ۫ۡۥۨۘ۬ۧۢۜۘۧۚۗۧۛۜۘۖ۫ۚۧۙۙ۟ۜۙۛۘۥۧ۫ۦۨۦ۠۫ۚۘۘۜ۬";
                                            break;
                                        case -483400941:
                                            str3 = AppContext.OooO00o().Ooooooo ? "۟ۜۧ۟ۧۙۚۥ۠ۦۙ۫۠۟ۗۙۖۗۘۚۡۘۜۦۧۥۖۘۢۧ۬ۢۥۤ۟ۨ۫ۘۘۦۘۢ۬ۙۙۡۗۥ۠ۥۦۘۜۚۧۨ" : "۫ۥۨۗ۬ۡۘ۫ۚۦۘ۟ۥۘۙۘۦۘۘ۬ۜۥۨۗۚۘ۠ۘۜۜ۟ۢ۬";
                                            break;
                                        case -400132931:
                                            str2 = "ۡ۠ۡۚۢۡۘۘۜ۠ۦۙۗۡ۬ۦۘۖۖ۬۬ۧ۫ۜۨۚۜۨۗۨۛۨۘ۠ۡ۠ۤۖۢۢۛۛۦۙۛ";
                                            break;
                                        case -276521185:
                                            str3 = "ۘۡۜۘۘۨ۫ۗ۫ۛۥۥۙ۫ۥۧۘۨۜۨۢۘۦۘۢۢۘۘۜۛۛۤۘۙ";
                                            break;
                                    }
                                }
                                break;
                            case 84435:
                                break;
                        }
                    }
                    break;
                case 257765945:
                    return;
                case 518591383:
                    String str4 = "ۢۨۖۡۚ۫ۗۖۖۙۡۨۘۗ۫۟ۖۧۗ۠ۨۜۤۛۡۢۗۦ۫۬ۦۥۛۖۘ۟ۤ۬ۖۢۦۘۜۧۨ۬ۖۗ۬ۗۜۥۤ۬ۧۡ۬";
                    while (true) {
                        switch (str4.hashCode() ^ (-642692971)) {
                            case -1711792450:
                                String str5 = "ۥۧۢۘۧۤۦۖۧۤ۫ۘۘۗۙۡۙۙۦ۬ۗۖۘۜۛۤۘۢ۫ۙ۟ۨۚۧۘۘ۠۫۟ۡۥۨۘۧۙۢۧۧۦ۬ۡۦۦ۬ۖۘۧۥۚ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1334132880) {
                                        case -1019356567:
                                            str4 = "ۧ۫ۘۘۘ۫ۜ۟ۢۨۘ۠ۡۥۘۖۨۥۘۘۡۚۥۘۡۨۜۧۘۢۛۡۦۜۧ";
                                            break;
                                        case -224680413:
                                            str5 = "ۤۙۡۛۦۦۘۙ۫ۦۖ۟ۥۘۜۤۤ۬ۗۡۘۨ۟ۨۙۨ۠۬ۨ۠۬ۖۢۗۜۘ۟ۦۙۦۜۖۘ۠ۙۚ";
                                            break;
                                        case 708605147:
                                            str5 = C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOo, Boolean.FALSE) ? "ۙۜۥۨ۠۫ۙ۠ۙۡۙۥۚ۬ۛۗۧۚۘۥ۬۬ۖۡ۬ۡۚۥۨۘ۬ۤۥۘۤ۬ۛ" : "ۨۧۢۛۛ۫ۛۘ۟۬۬ۤۛ۬ۥۘۖ۬ۥۤ۬ۡۘۚۙۘۘۚ۟۫ۘۢۥۢۨۡۧۢۛ";
                                            break;
                                        case 1348318319:
                                            str4 = "ۦۢ۬ۥ۬۫ۡۘۘۡۖۗۚۤۘۤۤۚۥۤ۟۠ۙۤۡ۠ۘۦۥۘۗۘۤۛۤۡۖۡۡۤۖۘ۠ۖ۬ۥۗۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case -1361187319:
                                break;
                            case 406136985:
                                str = "ۧۨۤۘۨ۬۟ۨۘۘۢۗۥۘ۟ۥۚۡ۠ۥۘۡۥ۟۬ۧۦۗۖۘۙۥۘۧۖ۫ۜ۬ۗۧۛۦۘۡۢۡ";
                                break;
                            case 2062739711:
                                str4 = "ۗ۫ۥۘۡۥۘۦۥ۠ۗۢۢ۫ۥۨۛۖۥۘ۬ۡۦۘۦۗۧۖۗۥۥۛۦ۠ۘۘۤۡۧ";
                                break;
                        }
                    }
                    break;
                case 804590617:
                    str = "ۛۙۦۘۖۤۨۚۖۘۥۨۖۧۘۧۢۢۗ۟ۢۡۖۘۧۘ۬ۢۡۘۖۨۢۜۨۖۦۙ۬ۗۡۘۘۖۥۡۘ۠۫ۜۘ۠ۚ";
                    continue;
            }
            str = "۬ۥۤۚۜۘۘۛ۬ۜۧۧۨۛ۬۫ۡۦۦۨ۠ۤۗۜۙۗۘۖۘۙۚۨۘ۟۬ۗۚۗ۠";
        }
    }

    private void OoooOOo() {
        String str = "ۚۡۦۧۧۖۘ۬ۦۖ۟ۚۨۛۘ۠ۨ۠ۥۘۤۤۨۚۗۜۤۡۖۤۛۜۘۨۚۖۘۚۖۙۧۖۤۤۖۥۘۦۖۦۘۤۙۦۧۤۗۥۦۢ";
        boolean zOooO00o = false;
        boolean z = false;
        while (true) {
            switch ((((str.hashCode() ^ 743) ^ 320) ^ 317) ^ (-1598879053)) {
                case -1976411948:
                    str = "ۜۨۛ۫ۡۚۡۚۗۨۢۜۗۛۜۘۡۡ۟ۢۡۨۘۥۜۥۨ۟ۖۨۛۜۘ";
                    z = AppContext.OooO00o().OoooooO;
                    continue;
                case -564182442:
                    return;
                case -510932036:
                    zOooO00o = C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOo0, Boolean.FALSE);
                    str = "ۡۗۜۘۥ۫ۥۘۛ۟ۥ۟ۨۡۘ۬ۛ۫۟ۧۥۡ۬ۥۤۙۢۦۛ۫۠ۡۦۘۦۤ۠ۤۤ۠ۥۘۦۨۖ۟ۙۡۜ۬ۙۘۘ";
                    continue;
                case -446434193:
                    C3678a4.OooOoo(this, zOooO00o);
                    str = "ۨۧۡۦ۟ۘۢۥۜۚ۟۫ۦۦ۟ۖ۟ۘۘۖۚۛ۠ۖۘۢۗۘۘ۫۬ۛ۫ۖ۫ۜۤۘ";
                    continue;
                case 328676350:
                    String str2 = "۬ۦۥۘۚۧۖۢۡۛ۟۟ۗۜۛۨۘۛۢۥۨۥۛۜۘۚۛ۟ۙۤۗۤ۫۠۫ۧۦۙۛۥۡۨۛۤۥۙۨۜۧۚۤۧۨۘۥۙۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1897230548) {
                            case -2082325858:
                                str = "۫ۜ۬ۦۢۛۗۖۦۘ۫ۖۙۚۛ۬ۗ۫۫۬ۧ۬ۖ۠ۖۦۚۢۡۡۦۤۧۤۨۚۦۥۗ۠۟ۢۦۙ۟ۘۘۡۗۡۘ";
                                break;
                            case -598410032:
                                String str3 = "ۗۧۥۘ۫ۙۥۘۡۡۤۢۛۤۚۦۘۗۚۡۚ۠ۙۦۤۤۧۚۜۖۚۤۖ۟ۨۦۗۡۘۡۜۗۜۡۛ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1744929832)) {
                                        case -1336247961:
                                            str2 = "ۚۘۧۘ۬ۜ۫ۚ۠ۥۘۜۥ۫ۜۖۚۛ۟ۨۘۗ۠۟ۤ۫ۥ۫ۚۧۧۡۡ";
                                            break;
                                        case -1106449686:
                                            str3 = "ۙۛۨۘۥۤۖۘۥۖۙۤۤۧ۫ۛۡۘۧۙ۠ۗۘۗ۠ۡ۟ۖۘ۬۟ۥۥۚ۠ۖۢۢۥۜۘۘۘۡ۫۠ۢۡ۫ۙ۬ۛۛۨۘۧۚۨۘ";
                                            break;
                                        case -599238628:
                                            str2 = "ۧ۟ۘۘ۬ۖۥۦ۠ۜۘ۠۫۟ۘۛۜۘ۠ۦ۫ۡ۟ۦۡۦۦۘ۠ۤۧ۟۫۠۟ۢۤۖۡۘ۫ۧ۟ۜۜۖۘۗۘۥۘۨۘ۟";
                                            break;
                                        case 645748578:
                                            str3 = z ? "ۧ۠ۖۧۖۦ۬ۢ۫ۘۦۗۙ۫ۧۙۙۧۧۜۦۘۛ۠ۢ۫ۘۘۘۦۚۦۤۘۚۧۥۗۨۚۦ" : "ۡۨۡۘۗۧۨۘۧۖ۠ۙۤۡۜۢۡۘۚۦۢۗۢۘۛۗ۟ۥۙۜ۟ۙۖۘ۫ۨ۬ۦۧۦۧۨۦۘ۠ۦ۫";
                                            break;
                                    }
                                }
                                break;
                            case -560498221:
                                break;
                            case 781559386:
                                str2 = "ۦ۬ۦۘۦۚ۬۫ۧۦۘ۬ۜ۠۬ۗۦۨۥ۟ۨۙۘۘۧۘۢ۟ۗۘۘۦۘ۬ۢۚۖۗ۟ۤ۟۟ۘۢۚۗۤۗۦ۫ۛۡۘ";
                                break;
                        }
                    }
                    break;
                case 431164581:
                    str = "۫ۗۢۦۨۡۘۖۤۥۘ۫ۤۘۘ۟ۙۘۘ۠ۦۛۚۚۢۙۛ۠۬ۖۡۘۚۡ۫۬ۡۤۗۘۨۨۧ۫ۦۥۨ۫ۥۖۧۢۨۘ";
                    continue;
                case 1204255578:
                    C3827e5.OooO00o().OooO0o(new Runnable() { // from class: z2.e9
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.OoooOoO.OoooooO();
                        }
                    });
                    str = "ۧ۬ۨۘۙۚ۬۠۫ۢۖۥۨۤۨۘۡ۟ۥۢۡۢ۬ۖۘۛۦۢۛۜۢۗۧۖۘۘ۟ۖۛۦ۟۬۠ۡۖ۫ۜۥۗۥ۬ۡ۫۠ۥۘ";
                    continue;
                case 1268222693:
                    String str4 = "۫ۗۜۘۗۡۚۖۙۖۢۦۖۧ۠ۖۘۥۛۛ۬۟ۦۗۢ۫ۨۨ۟ۘۙۜۗۨۨۜۤۧۤۢ۠ۦۥ";
                    while (true) {
                        switch (str4.hashCode() ^ (-420906666)) {
                            case -828194119:
                                str = "ۢ۟ۡۘۛۧۥۜۧۖۘۛۙۢۧۛۘۘۙ۬ۢۖۚۦۚۛۧۖ۬ۙۚۧۚ";
                                break;
                            case -303023223:
                                break;
                            case 371547755:
                                str4 = "۬ۨۜۙۗ۟ۜۗۜۘ۟۫۠ۨۛۨۘۡ۫۠ۡۘۨۦ۫ۨۤۧۘۘۗۡۥ";
                                break;
                            case 747268699:
                                String str5 = "۬ۢۢ۠ۦ۬ۢۛ۫ۘۧۡۘۙ۬ۜۘۨۛۨۜۨۛۜۗۚۜۜۜ۬ۘۛ۟ۦ۬ۥۨۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1883446795) {
                                        case -949574392:
                                            str4 = "ۢۘۧۘۘۢۘۘ۬ۚۙۦ۫ۗۘ۠ۦۛۙۥۥۘۘ۟ۚ۠ۢ۠ۖۗۛۤۗ۫ۖ۟ۧۜۘ";
                                            break;
                                        case -447558633:
                                            str5 = "ۘۙۨۘۥ۠ۡۘۘۗۥۘ۠ۧۥۜ۫ۦۘۚ۠ۜ۠ۛۘ۟ۘۨۘ۟۬ۥۘ۟ۚۘ";
                                            break;
                                        case 144598832:
                                            str5 = zOooO00o ? "ۢۨۤۧۗۥۙۛۛۡۢۚۚۖۗۘۜ۟ۗۖۡۛۘۧۘ۫۟ۘۥۗۘۜ۟ۥۛۘۘۙ۬ۦۤۤۧۗۡۢ۫ۦۘۢ۟ۦ" : "ۜۗ۠ۤ۟ۥۡۦۤۨۛۗۘۛ۫۫ۢۥۘۙۛ۫ۗۛۙۖۖۚۜ";
                                            break;
                                        case 465132381:
                                            str4 = "ۙ۬ۤ۬ۦۙۢۧۥۦۧۡۘ۬ۛۥۦۨۨۛ۟ۗۥۗۚ۬ۡۦ۠ۦۘۘۗ۟ۗۧ۠۟";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
            str = "ۧ۬ۨۘۙۚ۬۠۫ۢۖۥۨۤۨۘۡ۟ۥۢۡۢ۬ۖۘۛۦۢۛۜۢۗۧۖۘۘ۟ۖۛۦ۟۬۠ۡۖ۫ۜۥۗۥ۬ۡ۫۠ۥۘ";
        }
    }

    private void OoooOo0() {
        String str = "ۢۥۧۘۚۡۗۙۧ۟ۚۥۚۡۘۛۤۧۦۘ۫۠ۙۙۙ۫ۚۜۘ۠ۜۥۘۜۧۗ۬ۥۥ۟۠ۤ۟ۗۨۘۢۖۦۘۛۤۗ";
        while (true) {
            switch ((((str.hashCode() ^ 339) ^ 574) ^ 232) ^ (-879951506)) {
                case -1944168987:
                    ((C4091la) this.OooooO0).Oooo0OO();
                    str = "ۢ۠ۜۘۖۚۢۥۡۦۘۧۤۦۘۖۢۖۘۘۧۛ۟ۜۖۨۤۤ۠ۥ۠ۢۥۨۤ۠ۜۘۥ۟ۖۘۜ۟۠ۗۛ";
                    break;
                case -424942409:
                    str = "۟ۦۚۤۙۗۜۚۤۦۨۡۨ۟ۚۗ۠۫ۥۡۥۨۢۤۚۚۨۘۨۥۙ۬۟ۥۘۥۡۦ";
                    break;
                case 466170844:
                    return;
                case 882733419:
                    ((C4091la) this.OooooO0).Oooo0O0();
                    str = "ۜۤۘۨۙۖۧۤۥۢۖ۬ۤۦۘۗ۫ۨۘۦ۫ۖۘۦ۟ۤۤۡۢ۫ۘۧ۟۟ۡۛ۠ۥۘ۠ۥۢۨۚۨ";
                    break;
            }
        }
    }

    private void OoooOoO(ArrayList<NotifyMsgBean> arrayList) {
        String str = "ۛۡۙ۟ۦ۠ۘۧۜۘۢۥۡۘ۟۬ۜۘۖۢ۬ۧۥۚۧۡۖۗۢۙۧ۫ۘۛۗ۠ۡۙ۬۫۬ۦۙۘۘ";
        PendingIntent activity = null;
        Intent intent = null;
        while (true) {
            switch ((((str.hashCode() ^ 703) ^ 200) ^ 386) ^ 1401736702) {
                case -1903947320:
                    str = "ۢۛۖۧۧۦۘۥۤۖۘۡ۬ۥ۠ۧۦۘۛ۫ۜۘۛۥ۬ۤ۠ۥۘۗۗۘۘ۫ۧۥ";
                    intent = new Intent(this, (Class<?>) MessagePushActivity.class);
                    break;
                case -1556519799:
                    str = "ۚۨۥۘۢۨ۟ۨۙۘ۬ۛۧۘۨۘۘۡ۠ۛۖۘۥۘۨۦۜ۬ۚۜۘۘ۬۬";
                    break;
                case -379220541:
                    this.o00O0O = new NotificationCompat.Builder(this);
                    str = "ۨ۟۬۫ۖۨۘۥۢۡۛۡۘۘۖۤۘۘۨۥ۫ۙۤۜۘ۫۬ۡۘۗۘۧۦۗۡۘ۟ۧۦۘۡۥۘ";
                    break;
                case 102798427:
                    activity = PendingIntent.getActivity(this, 0, intent, 134217728);
                    str = "ۛۚ۬ۤۗۦ۠۟۟ۥۘ۬۫ۥۦۛۦۤۙ۠ۧۜ۠ۚۙۥۜ۠ۥۤۢۨۘۚۘۖۘۧۖۡۚۢۡۘۡۢۨۡۖۡۥۢۨۛۛۘۘ";
                    break;
                case 526463002:
                    this.o00Oo0 = (NotificationManager) getSystemService("notification");
                    str = "ۖۤۥۘۨۧۦۘۦۚۘ۬ۗ۟ۤ۠ۦۙۢۥۗۥۦۜۨۖۘۧۘۙۥۗۦۘۡۛ۟ۢۘ۫ۚ۠ۡۖۚۖ۠ۙۥۙۖۘۧۗۖۛۧۥ";
                    break;
                case 1313428093:
                    this.o00O0O.setSmallIcon(R.drawable.ic_launcher).setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher)).setOngoing(false).setAutoCancel(true).setPriority(0).setDefaults(2).setContentIntent(activity);
                    str = "ۧۜۡۘۨۡ۬ۜ۫۬ۥ۠ۡۤۨۥۛۦۦۘ۫ۥ۠ۥ۟ۨۘۧۛۡۘۨۤۦۘۨۛۧۙۧۜۘ";
                    break;
                case 1385064588:
                    intent.putParcelableArrayListExtra(C3902g6.OooO0OO, arrayList);
                    str = "ۤۧۢۢ۬ۤۛۗ۟ۡۡۘۗۨۧ۬۟ۜۘۘ۫ۨۘۦۡ۫۟۫ۤۧ۠ۡۘ";
                    break;
                case 1855927901:
                    str = "ۨۨۥۘ۬ۢۦۘۡۛۢ۟۠ۜۘ۫ۜۥۛۙ۬ۚ۠ۦۘ۬ۡۧۘ۟۫۠ۙ۟ۤۨۥ۟ۘۥۤۖ۬ۡۦۙۥۘۜ۠ۨۡ۠۠ۖ۠۫ۚۨ";
                    break;
                case 2056984776:
                    return;
            }
        }
    }

    private void OoooOoo() {
        String str = "ۛۘۡۘۥ۟۠ۖۛ۟۠ۤۛۘۛۤۤۛۦۘۗ۫ۘۢۥۘۚۥۡۚ۬ۢۢۦۢۦۗۨۘۜۚۨۘۖۧۦۘۜۜۧۘۨۘۜ۫ۨۜۘۙۛ۟";
        RTDViewPager rTDViewPager = null;
        C4238p9 c4238p9 = null;
        C3832ea c3832ea = null;
        ArrayList arrayList = null;
        while (true) {
            switch ((((str.hashCode() ^ 376) ^ 278) ^ 51) ^ 1127237591) {
                case -1797172933:
                    str = "ۨ۬ۨۘۦۘۜۢۦۖۢ۟ۚۖۢۖۨۗۙۛۗ۬۟ۤۢ۟ۘۘۥۗ";
                    arrayList = new ArrayList();
                    break;
                case -1599950904:
                    this.OooooOO.Ooooo0o(new OooOo(this));
                    str = "ۧ۟ۖۧۡ۬ۢ۟ۜۜۗۨۚۢۥ۟ۦۨ۬ۡۥ۫ۥ۟ۛ۠ۥۘۘۙۚ";
                    break;
                case -1240534702:
                    arrayList.add(this.OooooOO);
                    str = "۫۫ۗۖۛۤۘۨۘۛۙۧۚ۬ۛۘۛۨۧۘۨۥ۠ۚۥۢۢۤ۟ۗۨۗ۠۫";
                    break;
                case -1003984118:
                    str = "ۡۨۚۥۚ۠ۗ۟ۡۘۛۖۧۘۦۙۙۗۘۘۢۖ۫ۛ۫ۖۘۙۙ۬ۦ۠ۗ۬ۛۚ۫ۢۥۘۚۙۦۘ۟ۖۜۘ۬ۦۙۥ۫ۤ";
                    rTDViewPager = (RTDViewPager) findViewById(R.id.viewpager);
                    break;
                case -813070391:
                    this.OooooOO = new ViewOnClickListenerC3943ha();
                    str = "ۡۜۖۘ۠۠ۗۖۛۘۖ۫ۡۜۧۘۨۙۦۘۤۚۨۘۡۘۖ۟۠۫ۥۘۛ۫۠ۚۙۨۤۜۗ۟ۗۢ";
                    break;
                case -593606196:
                    return;
                case 586762784:
                    str = "ۦ۠ۜۘۙ۟ۛ۫ۥۚۦۗۦ۟ۨۤۤۢۚ۫ۦۘ۠ۜ۫۟ۡۖۜۨۙۚۜۜۘ۠ۡ۫۫ۢۗۛ۟ۦ۫۬ۘۢۦۥۘ";
                    c4238p9 = new C4238p9(this, getSupportFragmentManager(), arrayList);
                    break;
                case 591140212:
                    arrayList.add(c3832ea);
                    str = "ۨۗ۠ۤ۬۠ۧ۬ۨۚ۫ۤۚ۬ۛۢۦۦۘۡۜۘۦۜۛۢۨ۠ۢۧۘۧ۠ۗ۬۠۟ۙۤۘۘۧ۬ۛۦۛۢۚۜۤ";
                    break;
                case 879605721:
                    str = "۬ۘۥۛۧۘۙۡۗۧۜۖۘۗۛۡۘۥ۬ۨۛۜۜۘۥ۟ۥۗۖۡۘۜۥۘۙۜۛ۫ۦۜۘ";
                    break;
                case 1136656655:
                    str = "ۗ۠ۡۘۨۗۖۘۗۘۜۗ۫۫ۤ۬ۘۘۡ۬۠۫ۢۤۢۨۖۘ۫ۗۤۙۚۜۘۡ۠ۨۘۨ۬ۥۘۜۜ۬۟۟ۦۘۚۤ۬ۘۡ۫";
                    c3832ea = new C3832ea();
                    break;
                case 1247831032:
                    rTDViewPager.setAdapter(c4238p9);
                    str = "ۛۖۢۙ۬ۥۦ۟ۗ۬۠ۨۘ۫ۢ۫ۡۗۘۘۚ۠ۗۤ۟۟ۡۨۘ۟ۦۚۚۛۥۜۚۤ";
                    break;
                case 1777619136:
                    ((TabPageIndicator) findViewById(R.id.indicator)).setViewPager(rTDViewPager);
                    str = "ۘۜۚۚ۟ۚ۬ۢۛۤ۟ۡ۠ۧ۠ۢ۠ۦ۫ۗۗۢ۠ۦۙۛۙۢۨۘ۠ۦۜۘۘۚۡۘ";
                    break;
            }
        }
    }

    private void Ooooo00() {
        C4128ma c4128ma = null;
        String str = "ۘۙۘۘۗ۠ۘۘۗ۟ۙۤۡۨۧۦۧۘ۫ۜۡۤۥ۬۫ۨۤۨ۬ۘۗۜ";
        while (true) {
            switch ((((str.hashCode() ^ 568) ^ 868) ^ 81) ^ (-1618053870)) {
                case -1823201890:
                    this.o0ooOoO = c4128ma;
                    str = "۫ۤۢۦۙۛۡ۫ۘۘۢۙۖۘۡۖ۟۫۬۬۫ۘۖۘۧۧۦۘۢۥۤۦ۬ۗۙ۫ۘۢۤۘۛۘۖۘۥۗۖۘ";
                    break;
                case -1611285752:
                    c4128ma.OooOo().observe(this, new OooOO0(this));
                    str = "ۛۧۙۜۦ۫ۦۤۖ۠ۛۙۙۨۤۥۥۘۨۤۜۨۥۦۗ۬ۘۖۢۦۨۚۢۖۨۘۛ۬ۘۘۧۘۘۡ۬ۜۗۡۢ";
                    break;
                case -1231754795:
                    return;
                case 176389882:
                    str = "۬ۚ۟ۜۜۦ۟۬ۨۘ۠۬ۨۘ۫ۨ۠ۢۘۦۛۧۘۚ۬۠ۛۗۢۖۥۜ۠ۤۢۖۥۙ۟ۧۜۘۜۙۨۘ";
                    c4128ma = (C4128ma) ViewModelProviders.m10of(this).get(C4128ma.class);
                    break;
                case 234700606:
                    str = "ۤۗۖ۠ۦۛۘ۠۬۟ۤۦۚ۟ۦۘ۠ۖۜۨ۬ۦ۫ۨۗۥۗۥۘۢۘۗۖ۟ۡۘۛ۬ۨۘ";
                    break;
            }
        }
    }

    private void Ooooo0o() {
        C4389tc c4389tc = null;
        String str = "۬ۚۦۘ۟ۚۘۘۚۡۨۤۡۘۘۖ۟ۖۘۚۘ۬ۢ۠ۨۘۚ۟ۛ۟ۢۛۤۢۛ۠ۘۥۘۙ۟۠ۦۛۥۘۜ۬ۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 191) ^ 352) ^ 819) ^ (-377981917)) {
                case -1962003108:
                    o0OoOo0();
                    str = "ۦۜۖۛۦۧۘۨۥۡۧۢ۠ۡۗۦۘۗۜۤۦۢ۟ۦۜۖۢۦۡۡۤۛۘۘ۫ۙۥۘۚۗۡۘۧۖۙ";
                    break;
                case -1922691805:
                    str = "۬ۛۖۘۥۧۜۘۛۦۖۘ۠ۨۤۘۥۙۦۗۥۤۨ۠۬ۚ۠ۜۘۤ۬۫ۡۘ۠ۨۘۙۖۥۙۤۧ۬ۗۖ";
                    break;
                case -1643408418:
                    c4389tc = new C4389tc();
                    str = "ۡۜ۫ۛۡۦۨ۠ۧۦۤۖۘۙۤۚۡۨ۟ۗ۠ۧ۠ۜۡۡۖۡۗۖۗۙۗۖۘۢۚۡۘۤۘۗۛۘ";
                    break;
                case -1495408310:
                    ((C4091la) this.OooooO0).Oooo0o();
                    str = "ۚۧۙۧۖۡۘ۟۟۫ۢۙ۫ۙ۠ۜۘۙ۟ۦۘۡۥ۫ۙ۟ۘۘۢۥۗۢ۟۫";
                    break;
                case -1492996903:
                    c4389tc.OooO0OO(this);
                    str = "۬ۙۦۛۥۦۘۛۘۦ۠ۚۖۘۧۤۤۡۗۗ۟ۧۦۘۤۧۧ۠ۤۚ۟ۡ۫";
                    break;
                case -1483612210:
                    C3765ch.OooOO0o(getApplicationContext());
                    str = "۫ۨۨۗۧۜۖۚۙۛۖۦۗ۫ۚۢۡ۟۟ۤۛۜۖ۠۟۟۫۬ۤۖۘ";
                    break;
                case -1106745390:
                    OoooOOO();
                    str = "۠ۜ۟ۨۡۥ۠ۥۢۚ۬ۥۘۚ۟ۙۙۤۥۦۨۦۘۖۜۨۢۦ۠۫ۘ۟ۦ۫ۗۢ۬ۜۘ";
                    break;
                case -1104158439:
                    ((C4091la) this.OooooO0).OoooO00();
                    str = "ۘۥ۫ۜۢۛۤۥۘ۫۠ۖۘۡۘ۠ۦۖۧۘۗۡۙ۠ۗۘۘۗۘۖۘۦۡۡۦ۫ۥۗۗۤ۠ۜۥ۠ۨۘ۬ۘۥۘۘ۟ۨۘ۟ۚۧۤ۬ۨ";
                    break;
                case -736152280:
                    ((C4091la) this.OooooO0).Oooo00O();
                    str = "ۦۖۨۛۜۨۚۦۙۗۨۘۤ۠ۗ۫۫ۜ۫ۗۥۘۧۧۜۙۤۡۘۗۢ۫";
                    break;
                case -606306196:
                    OoooO0O();
                    str = "ۧۗۘۘۥۤۥۘۛ۬ۧ۟ۤۡۘۨۙۦۘ۟ۛۦۘۡۛ۟ۚۨۘۗۡۦۚۛۜۙۜۘۜ۠ۦۘۡۢۤ۫۬ۥۘ۬ۤ۬ۖ۠ۤ";
                    break;
                case -586098328:
                    AppContext.OooO00o().Ooooo00 = true;
                    str = "ۦۙۤۙۡۦۥ۟ۘۤ۠ۘۘۗۡۘۘۘۖۘۘۙ۫ۙ۫ۛ۟ۢۢۜ۠ۡۥۘۚۗۦ۬ۚۦ";
                    break;
                case -457257877:
                    C4310r7.OooO0o().OooO0o0(this);
                    str = "ۦۤۘۡ۠۠ۜۧۖۘۛۗۖۢ۫۫ۗۡۢۜۙۦۘۜۙۦۢۚۨۘ۫ۢۜۥۤۖۗۙۤۘۡۖۡۖۡۘۚ۠ۨۖ۫ۖۘ";
                    break;
                case 574597636:
                    Oooo();
                    str = "ۢۡ۟ۤۗۙۛۨۜ۫ۘۧۘۡۛۖۛۨ۠ۚۜ۟ۨ۬ۗۘۘۤۙۤ۬۬ۖ۬ۛ۬ۜ";
                    break;
                case 737216353:
                    OoooOo0();
                    str = "۠ۚۖۘۨۧۤۛۨۘ۠۟ۙۚ۟۠ۙ۫ۢۥۙۜۘ۬ۨۙۚۙۥۘۖ۠ۧ۫ۡۜۘ۫ۧۘۛۡۨۙۚۜۘ";
                    break;
                case 906701293:
                    C4496w8.OooOO0o(102);
                    str = "ۛۛۜۘۦۧۘۘۨ۠ۧۘۦۖۚۛۜۘۢۜۧۘۤۖۗۗۖۧ۬ۥۚۦۦۘۤۧۢۖ۬ۜۘۦۛۧۘۛۨۘۡۥۖۘۗۜۡۘ";
                    break;
                case 1141469141:
                    OoooOoo();
                    str = "۠ۖۜۘۧۜۥۘۘۖۤۗ۬ۧۚۜ۟ۜ۬۫ۦۦۧۘۛۤۤ۟ۤۦۜۖۚ۬ۨۗۚۜ";
                    break;
                case 1176112598:
                    OoooOOo();
                    str = "ۨ۟ۖ۠ۚۡۛ۬ۖۤۥ۟ۖ۠ۙۗۤۖۘ۟ۥۨۘۥۙۥۘۦۨ۫ۤۘ۠";
                    break;
                case 1210503001:
                    this.o0OOO0o = c4389tc;
                    str = "۬ۗ۟ۗۜ۟۟ۡ۟ۤۢۛۥۡۤۢۥۦۗۚۧۙۢۧۚۦۨۘۛۥۗ";
                    break;
                case 1211206885:
                    OoooO();
                    str = "ۨۡۨۘۧۥۖۘ۬ۤ۟ۡۨ۟ۙۨۘۧ۬ۡۘۢۜۢۛۜۨۡۡۜۘۙۨۗۨۤۥۥ۬ۧ";
                    break;
                case 1297711511:
                    OooooO0();
                    str = "ۜۦۦۘۤۦ۬ۡۜ۟ۛ۫ۖۜ۫ۗۜۗۥۘۙۧۚ۬ۗۗ۠۬ۙ۟ۜ۫ۥ۟ۢۘۥۦۘۗۚۙۨۘۙۦۧ۫۬ۘۥۘ";
                    break;
                case 1339093404:
                    ((C4091la) this.OooooO0).Oooo0o0();
                    str = "۟۬ۥۘۙۢۥ۠ۜۘۙ۬ۜۘۤۘۥۘۥۨۡۘۦۛ۫ۡۚۢۨۤۢۤۗۗۨ۟ۛۚۚۤ";
                    break;
                case 1943965752:
                    return;
                case 2107920975:
                    String str2 = "ۢۙۖۘۘ۟ۦۘۤ۟ۛۚۗۥۘۨۦۦۦۡ۫ۦۙۜۘۖۨۖۘۨ۬ۦ۫۠۬";
                    while (true) {
                        switch (str2.hashCode() ^ 1888038510) {
                            case -1602012944:
                                String str3 = "۟۠ۦۙۗۨۘۦۜۚۖۚۡ۬ۨۧۗۥۘۦۖۦۜ۬ۜۥۘۘۘۥۡۗۚۢۜۤۚۗۘ۟ۥۘ۟ۗۛۙۜۜۘۘۦۨۚۗۜۘۗۢ۟";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1727950122)) {
                                        case -1670570862:
                                            str2 = "ۥ۟ۘۘۙۛۦۘۖ۬۟ۚۤۥۗۢۥۘۢۢۦۘۨ۬ۤۦۛۚۡۧ۠ۜ۠ۚۨۙۜ۠ۗ۫ۚۡ۠ۥۘ";
                                            break;
                                        case 1415472946:
                                            str2 = "۟ۦۧۥ۠ۜۘۙۧۥۘۛۧ۬ۛۚۦۘۢ۠۟ۢۨۡ۟ۥۢ۫ۡ۟ۧۚۗۧۛۥۚۥۘۛۥۖۖۘۥ";
                                            break;
                                        case 1863028547:
                                            str3 = C4381t4.OooOO0(this) ? "ۤ۫ۜۖۘۤۜ۫ۛۘۢۦۛۨۨۘۗۦۘ۬ۦۘۘۥۤۦۘۙۤ۠ۖۡۦۘۛ۟ۜۤۙۢۜۧۡ۬ۥ۠ۨ۟ۢ۟ۧۤۜۢ۫ۗۗۥ" : "ۗ۠ۦۜۥۗ۟ۦۖۘۨۚۨۘ۟ۢۥۘ۬۠ۖۗۘۤۙ۠ۤ۟ۜۨ۟۠ۥ۠ۡ۬ۦۦۘ۫ۨۖۘۢۦۗ";
                                            break;
                                        case 1884956121:
                                            str3 = "ۦۡۚۤۨۦۘۢۘۘۘۡۚۦۘۙۤۡۘۜۛۚۦۙۦۘۘ۬ۤۧۡۖۘۧۨ۬ۘۡۘۘۖۜۚ";
                                            break;
                                    }
                                }
                                break;
                            case -223032095:
                                str = "ۥ۬ۘۘۖۦۛۥۚۜۘۤۖۧۘ۟ۨۧۢۢۨۘ۠ۗۥۧۘۨۘ۫۟ۘۘ۬۠ۨ";
                                continue;
                            case 120547964:
                                str = "ۦۖۨۛۜۨۚۦۙۗۨۘۤ۠ۗ۫۫ۜ۫ۗۥۘۧۧۜۙۤۡۘۗۢ۫";
                                continue;
                            case 1335360249:
                                str2 = "۟۫ۛ۠ۥۘۚۜۤۦۨۘ۫ۧۥۖۥۨۘۧۗۘ۬ۚۘۨۥۗۙ۠";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public static /* synthetic */ void OooooOO() {
        String str = "ۢۨۥۖۤ۬۫ۦۡۘۚۜۖۘ۠ۤ۠ۙ۬ۘۥۧۧۙۡۥۧۚۡۧۘۦۘۙ۟ۖۘۛ۫ۥۛۨۨۘ۟ۘۨۘ۫ۧۨۘ۫ۤۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 703) ^ UiMessage.CommandToUi.Command_Type.SET_LINE_VALUE) ^ 71) ^ 1536647009) {
                case 422447455:
                    return;
                case 580926463:
                    C4496w8.OooOO0o(11);
                    str = "ۧۧۨ۟ۖۗۚۚۢۘۘۧۘۙۜ۠ۥۘ۫ۢ۫ۤ۠۫ۡۗۨۘۖۨۜ";
                    break;
            }
        }
    }

    private /* synthetic */ void OooooOo() {
        String str = "ۤۗۜ۫ۧۙۨ۬ۨۘۨۖۥۘۙ۫۬ۧۦۢۜۧۢۗۛۖۗۙ۟ۡۙۨ۟ۢۘۘۦۙۥۚۗۙۚۦۙ";
        while (true) {
            switch ((((str.hashCode() ^ 330) ^ 794) ^ 997) ^ 798689890) {
                case -2124322328:
                    String str2 = "ۜۧ۫ۤۦۘۘۜۤ۟ۘۖۛۛ۫ۘۘۙۦۘۛۥ۠ۡ۬ۗۖۖۖ۬۬۟ۨۨۖۦۦۛۘۜۗ";
                    while (true) {
                        switch (str2.hashCode() ^ 1693643491) {
                            case -1834878760:
                                str2 = "ۜۙۗۦۛۙ۬ۚۘۘۘۜۨ۟ۢۥۘ۠ۛۦۦۘۧۗۨۤۜۖۨۘ۫ۚۚۖۗۘۘۖۛۡۛۛ۟ۗۧۖۘ";
                                break;
                            case -1507614829:
                                str = "۟ۢۦ۬ۙۖۘۢۙۙۧۡۦۘ۬ۨۨ۠ۘۗ۬ۥۚۙۜۜۘ۠ۡۖۘۢۥۛ۬ۡۤۥۗۡۙۙۥۘۢۖ۟۫ۦۚۛۥۧ";
                                continue;
                            case -993594329:
                                str = "ۡۗۨۗ۬۟ۚۢۢۘۛۛۨۘۧ۬ۙ۬۫ۦۨۖۘۦۘۚۤۨۚۨۢۖ۠۠ۖۗ۟۠ۦ۟۬ۘۧۘۛۙۖۗ۬ۖ";
                                continue;
                            case 1741246207:
                                String str3 = "ۥۨۚۗ۠ۖۘ۟ۜۥ۟ۜۛۛۗۙۗۦۨۘۢۦ۫ۧۙۘۧ۬۠ۜۡۖۡ۫ۦۘۜۦۧۘ۫ۘۖۘۧ۟ۗ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1478452331)) {
                                        case -171966177:
                                            str2 = "ۙۘۢۦۥۥۘ۟ۤۨۘۜ۬ۗۗ۠ۡ۫ۡۗۘۢۥۘۘۦۧۘ۠ۚ۫ۗۗ۠ۗۥۥۗ۟ۢۥ۫ۤۜۜۘۥۦۙۙۜۨ۬ۙۤۗ۟";
                                            break;
                                        case 388156565:
                                            str3 = AppContext.OooO00o().o0OoOo0 ? "ۢۢۧۙۡۡ۫۟ۨۘ۫۟ۨۘۦۗ۟ۤ۫ۦۧ۬ۖۦۨۦۙۖۙۙ۠ۡۨ۬ۘۖۙ۠ۛۢۥۖ۫ۘۘۡۦۖۗۗۖۘ" : "ۧۗۚۧۛۡۘۜۦۛۨۧۨۡۦۨۘۨۥۨ۬ۚۘۘۨۗۤۤۙۡۥۙ۬۟ۖۘۨۤۡۢۧۥۘۜ۠ۦۤۤۖ۫۠ۙ";
                                            break;
                                        case 1346124864:
                                            str2 = "ۤۡۥۘۖۜ۠۠ۛۖۢۜۧۗۡۗۗۨۘۙۚۗۨۧۖۙۦۧ۟ۛۤۜۗۦ۬۫۠";
                                            break;
                                        case 2023772592:
                                            str3 = "۬ۡۘۢۚۖۘۧۙ۟ۚۤۨ۬ۨۙۘۛ۬۠ۤۙۘ۫ۖۥ۫ۦ۬ۗۥۚ۟ۛۢۦۘۗۢۛۛۤۥۘۗۜۜۛۚۖۘ۟ۧۗۦۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -826226491:
                    SystemClock.sleep(200L);
                    str = "ۗۥۦۗۡ۟۟ۘۘۜ۟۟۟ۢۥۚۦۚۘ۠ۜۛۢۗۧۥۙ۠ۤۖۦ۟ۙ۫۟۠ۡۜۨۘ۠ۧۨ";
                    break;
                case -219817865:
                    str = "ۛ۟ۢۢۗۥۘۙ۠ۜۘ۫۠ۥ۠۫ۡ۠ۦۧۘۚۢۤۖۜ۬ۡ۬ۡۙۡۡۘۦۖۜۥۗۡۘ۠۠۫ۧۙۦۘ";
                    break;
                case -165219511:
                    ((C4091la) this.OooooO0).OooOoO();
                    str = "۬ۦۥۘۦ۫ۜۥۜۘۥۦ۫ۙۛ۠ۘۢۡۘۥۡ۟ۖۜۘۖۙۨۘۤۚۘۘۧۜۥ۠ۢۖۗۖۘۧۢۢۜۗ۠ۥۗۢ";
                    break;
                case 779018630:
                    str = "ۛ۟ۢۢۗۥۘۙ۠ۜۘ۫۠ۥ۠۫ۡ۠ۦۧۘۚۢۤۖۜ۬ۡ۬ۡۙۡۡۘۦۖۜۥۗۡۘ۠۠۫ۧۙۦۘ";
                    break;
                case 1391989494:
                    return;
            }
        }
    }

    private /* synthetic */ void Oooooo() {
        String str = "۫ۖ۫ۜۙ۠ۤۘۥۖ۫ۛۨۗۦۙۜۙۧ۫ۡۘۗۘ۬ۗۜ۟۠۠ۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 34) ^ 456) ^ 345) ^ 595607221) {
                case -1588807437:
                    str = "ۥۨۨۘۜۘۘۨ۫ۚ۠ۤۦۘۘ۬ۘۧۥۤۖۧۧۚۡۙۜ۠ۜۛۜۖۘۥۛۥۘ";
                    break;
                case -161602684:
                    String str2 = "ۙۡۘۡۧۖۘۜۧۥۛۛۜۘۛ۬ۜۚ۫ۨ۠ۖۡۘ۫ۥۥۘۨۘۛۦۜۜۦۖ۫ۡۨۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 1071498135) {
                            case -1842525883:
                                str = "ۤۦۘۙۜۥۤۙۡ۟۟ۦۘۡ۟ۛ۠ۙۡۘۧۗۨۖ۬ۗۚ۠ۢۛۡ";
                                continue;
                            case 222841480:
                                String str3 = "۟ۛ۫ۗۦ۟ۡ۬ۗۖۖۜۡۗ۟۟ۡۜۦۡۗۤۙۗۤۡۖۨۥۛۖۙ۠ۚۗۘۧۗۙۛۖۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 743947616) {
                                        case -354453048:
                                            str2 = "ۥۧۢۥۧۧۚۛۤۨۥۡۘۚ۟ۡۛ۬ۧۖۦۦۘۚۦۗۧۢۖۥۡ۬";
                                            break;
                                        case 1027462905:
                                            str2 = "ۤۗۢۗۢ۟۫ۖ۬۬۬ۢۨۢۨ۫۟۫ۘۤ۟۫ۙۨۜۘۥ۠ۛۦۘۗۚۖۤ۠ۗۡۛۨۙۗۦۘۧۧ۫ۗ۟ۦ";
                                            break;
                                        case 1871943424:
                                            str3 = "۬ۨۦۘۦۥۢۛ۬ۛۘۧ۫ۚۢۜۘۙۦۧۘۜۦۥۘ۟۫ۢ۠ۦ۠ۧۘۦۗۨ۠ۢۗ۟ۛۙۢۙۢۜۘ۠ۖۘۚۚۘ";
                                            break;
                                        case 2017361759:
                                            str3 = AppContext.OooO00o().o0OoOo0 ? "ۗۗۘۘۙۖۘۘ۬۫ۧۥ۟ۖۥۨۜۜۢۘۘۤۥۘۘۡۥۥۘ۫ۧۤۧۜۗ" : "ۜۨۨۗۦ۟ۛۢۜۘۦۨ۫ۦۦۙ۟ۜۦۨۘۗۙۚۡۘۢۚۘۡۦۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1382696481:
                                str = "ۙۡۢ۟۫ۛۡۤ۫ۗ۬ۢۨۛۘۘۙۥۢۚۡۤۙۙۙۚۧۡۧۤۚۡ۬ۧۧۧۚۦ۟ۖۘۨۚۦ";
                                continue;
                            case 1469582590:
                                str2 = "ۦۜۚ۫ۖۜۘۙ۟ۛۧ۬ۡۘۨۨۖۘۥۧۛۙۡۦۘۗۦۢۥۙۤ۠ۖۢۛۚۥۘۧۡۥ۬ۚۘۦۤۚۦۜۗۨ۫ۨۚۡ۠۠ۨ";
                                break;
                        }
                    }
                    break;
                case 270087228:
                    return;
                case 757716075:
                    SystemClock.sleep(200L);
                    str = "ۚۦۚ۟ۗۧۛۖۤۡ۟۟ۧ۠ۜۡ۠ۡۘۛۧۜ۬۫ۨۤۡۡۘ۬ۖ۬";
                    break;
                case 928348312:
                    ((C4091la) this.OooooO0).OooOoO();
                    str = "ۘۧۦۘۤ۬ۖۙۦ۠۠ۤۜۘۙۖۘۚۤ۫۠ۦ۠ۖۦۘ۟ۤۘ۫۠ۘۖۚۜۡۧۖۘ۫ۤۤۢۚۢۡۛۙۨۖۖۘ";
                    break;
                case 1025276599:
                    str = "ۥۨۨۘۜۘۘۨ۫ۚ۠ۤۦۘۘ۬ۘۧۥۤۖۧۧۚۡۙۜ۠ۜۛۜۖۘۥۛۥۘ";
                    break;
            }
        }
    }

    private void Ooooooo() {
        String str;
        String str2;
        String str3 = "ۙ۠ۤۛۚ۬ۥ۬ۜۘۤۨۨۢۧ۫ۢۙۥۘۜۡۦۘۨۨۚۥۛ۬ۘۤۥۘ۠ۗۨۘۛۜۧ۠ۨۘۘۖ۫ۨ";
        while (true) {
            try {
                switch (str3.hashCode() ^ 263676815) {
                    case -1553390649:
                        str3 = "ۦۤۖ۫ۥۦۜ۟ۘۘۗۖۦۗۡۘۘۖ۬ۢۚۜۥۡ۬ۨۗۡۚۢ۫ۨۘۥۘۧۘ۠ۙ۠ۤۘۘۘ۬ۧۛۙۜ";
                        continue;
                    case -1496183640:
                        return;
                    case 947162470:
                        C4566y4.OooO0OO("setenforce 0", true, 0);
                        C4529x4.OooO0O0().OooO0o(InterfaceC3865f6.OooOooO, Boolean.TRUE);
                        getPackageName();
                        C4011j4.OooOO0O(Environment.getExternalStorageDirectory().getAbsolutePath(), C3902g6.OooOo0);
                        boolean zOooO0O0 = C3678a4.OooO0O0(getApplicationContext(), C3902g6.OooOo0, "/sdcard/app-release.apk");
                        int i = Build.VERSION.SDK_INT;
                        String str4 = "۫۠ۚۢ۬ۥۦۦۦۥۙۘۚۜۥۥۥۘۜ۠ۦۘۛۦۥۦ۬ۡ۬ۜۡۘ";
                        while (true) {
                            switch (str4.hashCode() ^ 1557092575) {
                                case -1691937170:
                                    str = "priv-app";
                                    break;
                                case -1542991857:
                                    str4 = "۠ۡۖۘۙ۫ۤۢۨۧۘ۠ۜۘ۠ۧۚۦۥۦۘۖۗۜۢ۠ۛۨۘۙ۠۠۬";
                                    continue;
                                case 355236748:
                                    str = "app";
                                    break;
                                case 479313912:
                                    String str5 = "۠ۛۨۘۧۗۢۚۗۗۚۘ۬ۘۗۖۖ۟۠ۨۧۖۘ۬۬ۦۘ۠ۘ۫ۢۜۖۛۢۢۥ۠ۦۘۜۗۚۖۘۜۘۡۨۘۖۖۨۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ 1142716855) {
                                            case -1234117859:
                                                str4 = "ۘۜۖۘۦۢۜۘۧۙ۫۬ۛۥۧ۠ۡۘۗۛۤۗۚۦۗۙ۟ۛ۟ۥۘ۫ۤۙۗۨۘۙ۟ۛۡ۫ۖ۬ۢۦۘۚۜ۟ۖۛۥۘۗ۟ۡۘۢ۬ۢ";
                                                continue;
                                                continue;
                                            case -442702566:
                                                str4 = "ۡۜ۟۟ۧۗۗۖۛۧ۟ۥۙۨۖۘ۬ۦۘۖۨۥۘ۬۟ۚۨۛۤۙۡۢ۟ۥۜ۟ۦۡۘ۫ۤۖۛۦۛۜۧۗۖۦۢۧۖۖۥ";
                                                continue;
                                            case 28100607:
                                                str5 = "ۜۡۖ۠ۗۗۧۡۗۤۡۦۙ۬۟ۘۦۢۦۙۨۢ۫ۨۘۜۥ۬ۘۙۛۤۡۡۡ۫ۛۜۢۨۜۤۥۤۦۘۗۡ۠";
                                                break;
                                            case 1629339298:
                                                str5 = i > 19 ? "۠ۧ۟۫ۙۚۛۤۙۤ۟ۗۘۜ۠ۘۢۖۘ۠ۗۨۘ۠۠ۨ۠ۜۛۗۗۖۘۦۗۜ۬ۨ۬" : "ۧ۟ۛۨۖۜۥ۠۫ۛۚۛ۟ۜۘۨۜۢۗۥۛۡ۠ۖۘۤۗۖۛ۬ۨۘۗ۟ۡۧۙۦۡ۠ۢ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        String str6 = "pushApkToSystemApp --> filePath=/sdcard/app-release.apk,copyAppResult=" + zOooO0O0;
                        StringBuilder sb = new StringBuilder();
                        sb.append("mount -o remount,rw /");
                        String str7 = "ۥۘۘۧ۠ۧ۬ۦ۟ۥۨۡۘۦۙۢۗۘۧۘ۟ۘۦۘ۬۬ۧۥۦۧۨ۬ۖۘ۬۟ۖۢۨ";
                        while (true) {
                            switch (str7.hashCode() ^ 573525896) {
                                case -2015296894:
                                    str7 = "ۤۖۢۢۖۡۘۙۗ۟ۧۥۥ۟ۜۥۚۡۘۨۨۚۜۢۨۘۗۙۨۘ۠ۜۜۘ";
                                    continue;
                                case -236721082:
                                    String str8 = "ۦۨۧۘۛۜۖۚۢۜۘۨۜۖۘ۫ۤۜۤۥۛۚۨ۠ۚۚ۫ۜۢۨۡۘۘۧۨۥ۟ۚۗۤ۬ۤ۫۟ۘۘ";
                                    while (true) {
                                        switch (str8.hashCode() ^ (-436125091)) {
                                            case -947879696:
                                                str8 = i != 28 ? "ۘۛۧۨۘ۫۬ۧۘۦۚۛۤ۫۫۟ۢۨۨۖۘۤ۠ۥۨۛۡۘۤۙۖۙۙۨۘۖ۠ۚۗ۠۫ۗۙۥۖۜۤۘۧۘۢۘۖۤ۟ۥۘ" : "۠ۢۧۚۥۢۛۜۖۘۦۛۤۡۦۡۘۙۙۛۦۡۘۘۡ۟ۛۦۢۥۢۖ۠";
                                                break;
                                            case -402105563:
                                                str7 = "۟ۗ۬ۧ۬ۘۧۤۧۤ۠ۢۧۨۧۜۘۥۨۛۢۡۖۤۨۘۥ۫ۗ۠ۢۗۥۧۡۥۥ۟ۖ۟ۙۥ۠۟ۘۡ۫";
                                                continue;
                                            case 83799325:
                                                str8 = "۬ۦۨۘۦۥۡۘۙۢۖۜۡۘ۟۫۟۟ۧۦۜۡۨۘۗ۠ۖۜۚۘۘۡۘۛۨۛۡۦۡ۠ۥۢۧۗۜۦۤۧۗۧۜ۟";
                                                break;
                                            case 545340638:
                                                str7 = "ۨۗۧ۬ۡۜۘ۠ۦ۫ۖ۠ۛ۬ۥۡۘۗۚۢۚۦۜۘۛۡۡ۟۠ۚۦ۟ۖۥۢۚۜۙۗۧۚۖۤۥۘۘۗۡ۬ۖۨ";
                                                continue;
                                                continue;
                                        }
                                    }
                                    break;
                                case -183130956:
                                    str2 = "system";
                                    break;
                                case 399760760:
                                    str2 = "";
                                    break;
                            }
                        }
                        sb.append(str2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("cat ");
                        sb2.append("/sdcard/app-release.apk");
                        sb2.append(" > /system/");
                        sb2.append(str);
                        String str9 = File.separator;
                        sb2.append(str9);
                        sb2.append(C3902g6.OooOo0);
                        C4566y4.OooO00o oooO00oOooO0oO = C4566y4.OooO0oO(new String[]{sb.toString(), "chmod 777 /system", "chmod 777 /system/" + str, sb2.toString(), "chmod 777 /system/" + str + str9 + C3902g6.OooOo0, "mount -o remount,ro /"}, true, 0);
                        boolean zIsEmpty = TextUtils.isEmpty(oooO00oOooO0oO.OooO0OO);
                        C4529x4.OooO0O0().OooO0o(InterfaceC3865f6.OooOooO, Boolean.valueOf(zIsEmpty));
                        String str10 = "pushApkToSystemApp --> errorMsg=" + oooO00oOooO0oO.OooO0OO + ",successMsg=" + oooO00oOooO0oO.OooO0O0 + ",cmdResult=" + zIsEmpty;
                        String str11 = "ۡ۬ۙۢ۬ۘۘۨۛۘۧۦۨۘ۫ۖۙۚۨۘۛۥۖۥ۠ۦۘۛۚۗۡ۠ۖ";
                        while (true) {
                            switch (str11.hashCode() ^ 219959513) {
                                case 108727194:
                                    return;
                                case 866650778:
                                    str11 = "ۚۛ۟۫ۛۨۥۛۦۤۤ۟ۢۤۨۘۥۚ۬ۦۙۡۘۦۤۢ۫ۗۨۢۨۚ۬ۦ۫۠ۦۜ";
                                    continue;
                                case 917432258:
                                    C4566y4.OooO0OO("pm uninstall com.cyjh.startapp", true, 0);
                                    return;
                                case 1993316601:
                                    String str12 = "ۦۦۦۘۦۙۨۘۤۚۡ۠ۤۤۘۢۖۜۦۘ۬ۧۛۥۙۥۚۛ۠۟ۢۨۨ۫ۖۘۜۡۘ۬ۦۦۘۡۙۛ۬ۢۜۘۘۡۦۧۛۡۧ۬ۡ";
                                    while (true) {
                                        switch (str12.hashCode() ^ (-446505032)) {
                                            case -1400034611:
                                                str11 = "ۡ۫۠ۥۡۗۨۗۘۦۡۡۘۜۘۥۘۖۜۖ۫ۗۙ۟۫ۗۦۧۘۙۥ۫۫ۡۖۙۘۤۚۢۗۘۨۤۥۧۙۧ۟ۦۨۙۧۢۡ";
                                                continue;
                                                continue;
                                            case 484686102:
                                                str12 = !C4163n8.OooO0o0(this, "com.cyjh.startapp") ? "ۦۘ۬۫ۢۤۥۙۙۦۦۦۘۤۨۛۨ۠ۜۘۘۛ۫ۡۨۗۧۙۚۗۜۦۜۗ۟ۛۜۛۤۖۜۖ" : "۬ۤۖۘۙۦۗۛ۬ۛۚ۠۫۫۟۠ۥۜ۫ۥ۫ۘۡ۟ۡۘۧۦۡۗۖۥۘ";
                                                break;
                                            case 1330336792:
                                                str12 = "ۛۥۘۧۙۨۘ۫۫ۨۘ۟۬ۥۘۘۡ۠ۢ۠۠ۙۘۨۘ۠ۡۡۘۦۘۚۜ۟ۗۛۢۜۖۖۖۚۧۖۘ۟ۤۨ";
                                                break;
                                            case 1865013042:
                                                str11 = "ۢۚۡۘ۟ۡۢۨۦ۠۠ۖۘۧ۠ۗۛۛۨۘۗ۠ۗۧۘۜۚۥۘۙۧۤ";
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 1907073330:
                        String str13 = "ۛۧۛۡۗۧۚۙ۬ۖ۠ۧۖۤۦۢۜۢۛۦ۟ۙۡۘ۬ۖۦ۬۟ۖۖ۬ۢۙۨۦۚۛ۟ۦ";
                        while (true) {
                            switch (str13.hashCode() ^ (-873167202)) {
                                case -390653207:
                                    str13 = "۬ۗۦۘۡ۫ۥۘۛۖۦ۠ۖ۠ۗۖۖ۟ۙۙۥۘ۟ۤ۠ۦۘ۠ۡۧۘۧۜۘۘ";
                                    break;
                                case -82695482:
                                    str13 = !C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOooO, Boolean.FALSE) ? "ۨ۠ۥ۟۠ۨۘۨۡۖۗۨۧ۬۠ۤ۠۟۬۟ۥۡ۠ۚۗۗۖۧۘۗۢۗۤ۫ۤ" : "ۥۘۥۘ۟ۨۘۥۨۘۧۨۢۡۚۛۡۦۨۘۥۡۛۛۦۥۘۚ۫۬۟۫۫";
                                    break;
                                case -38691903:
                                    str3 = "۟ۘۥ۠ۤۜ۫ۨۗۗۨۨ۫ۚۦۘۤ۟ۤۚ۟ۨۥۙۥۘۤۚۙ۬ۖۥۧۦۖ۫۫ۗۛ۟ۙۡۚ۠ۧۛۡۚۙۨۘ";
                                    continue;
                                case 1768604350:
                                    str3 = "ۤ۫ۜۘۛۚۗۦ۟ۗۧۙۖۡۗۖۨۗۦۘۜۙۛOۤۡۖۚ۬ۜ";
                                    continue;
                                    continue;
                            }
                        }
                        break;
                    default:
                        continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            e.printStackTrace();
            return;
        }
    }

    private void initListener() {
        String str = "ۙۙۡۤ۬۬ۧۢۘۘۡۢۢۗۤۘۧ۫ۤ۠ۚۖۘۛۦۧۧۧ۟ۦۡۥ۟ۘۥۥۦۦ۟ۜ۫۬ۦ";
        while (true) {
            switch ((((str.hashCode() ^ 141) ^ 396) ^ 890) ^ (-1921297910)) {
                case -1402259255:
                    this.o00o0O.setOnClickListener(this);
                    str = "ۖۜۥۖۥۦۘۧۜۜۙۨۥ۟ۨۗ۫ۗۜۘۧۧۢ۟ۛۘۘۗۡ۠ۙۨۨ";
                    break;
                case -1282244757:
                    return;
                case -1274272429:
                    this.o00oO0O.setOnClickListener(this);
                    str = "ۢۢۘۘۙۥ۠ۢۨ۬ۜۤۨ۬۠۬ۚۘ۠ۗۗۤۢ۬ۥۘۡۚۖۘ۫ۗ۠۠ۗۦۘۦ۠۫";
                    break;
                case -891873843:
                    str = "ۡۦۙۘۛ۬۟ۜۡ۟۬ۙۚ۠ۘۘۛ۬ۡۘ۬ۦۢ۫۬ۖۙۡۜ۠ۛۦۘۢۚۢۧۥۜۧ۟ۜۚۨۘ";
                    break;
                case 346813378:
                    this.o0ooOO0.setOnClickListener(this);
                    str = "ۙ۬ۖۘ۟ۚۡۥۡۜۚ۫ۗۤۧ۫ۥۨ۠ۚۙۦۘ۟ۤۡۘۖۢۦۥۖۥ۠ۜ۬ۙ۫۠ۖۖۤ۬ۨۘۘۚۙۚۗۥۥۙۘۧۗۜ";
                    break;
                case 1331099282:
                    j10.OooO0o().OooOo00(this);
                    str = "۠۫ۡۤۤۘۘۚ۠ۡۘۗۘۥۨۗۛۧۗۦۘ۟۫ۦۘۖۚۘۧۤۖۚ۫ۖۘ";
                    break;
            }
        }
    }

    private void o000oOoO() {
        try {
            this.OooooOO.Oooo0oo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        OoooOO0();
    }

    public static void o00O0O(Context context) {
        Intent intent = null;
        String str = "ۡۗ۟ۧۦۙۦۛۘۘۖۦۗ۫ۛۚۖۖۖۧ۬ۜۘ۬۬ۜۨ۠ۧۧ۬ۢۦۚۢۨۨۧۘ۬ۘۥۨۦۚ۫۫ۦۙۡۦ";
        while (true) {
            switch ((((str.hashCode() ^ 957) ^ 527) ^ 855) ^ (-1070324925)) {
                case -2134212680:
                    str = "ۘ۫ۜۢۡۨۗۡۙۨۛۥۘۜۤۛ۟ۚۖۘ۟ۜۥۘۙۖ۟۟۟ۤۗۨ۬";
                    break;
                case -1725928483:
                    intent.addFlags(268435456);
                    str = "۠۫ۜۖ۫ۜۨ۠ۢۥ۟ۧۨۙ۫ۨۡۘۚۗۜۘۧۧ۬۫ۦ۠ۦۘۧۦ۠ۢ۬۫ۡۘ۟ۡۛۗۖۖۡ۬ۡۘۢۖۨ";
                    break;
                case 168937821:
                    context.startActivity(intent);
                    str = "ۛ۟ۨۘۗۡۗۧۜۚ۠ۢۘۘۖۤۧۦۘۘۘۙۜ۠ۛۙۦۘ۟ۗۗۢۙۥۘۘۨۖۘۧۡ۠۟ۥۤۧۡۦ";
                    break;
                case 261865832:
                    intent = new Intent(context, (Class<?>) ElfinFreeActivity.class);
                    str = "۬ۧۙۘۚ۟ۗۜۘۗۙۙۖۖۦۢۛۥۧۗۢۡۗ۬۟۫ۖۖ۟ۥ۬ۖۜۙۙۚۜۤۧۧۙۖۧۧۖۧۧۦۖۦۜۜۗۦ";
                    break;
                case 516900015:
                    return;
            }
        }
    }

    private void o00Oo0(float f, float f2) {
        String str = "ۤۖۤۛۢ۟ۦ۟ۧۢ۬ۜۢۨۘۨۙۜۘۜ۠ۧ۟ۚۥۜۙۦۘۡۡۖ";
        while (true) {
            switch ((((str.hashCode() ^ 24) ^ 371) ^ 253) ^ 1117666589) {
                case -1924814070:
                    this.OooooOo.post(new OooO0o(this, f, f2));
                    str = "ۧۢۜۛ۬ۡۨۚۦۢۗۧۨ۟ۖۡۗۤ۬ۙۢۤۤۙۚۨۥۘ۬ۖ۬ۛۗ۠۫ۙۡۘ";
                    break;
                case -1584760095:
                    str = "ۙۜۤۨۛۜ۟۠ۖۛ۟ۦۜۨ۫ۘۦۖۡۖۘ۫۠ۜۙۨۚۥ۟۬ۗۢۨۢۦۡۘۛۤۤ۠ۦۦۨۤ۬ۦۤۛ";
                    break;
                case -1345007805:
                    return;
                case 417344298:
                    str = "ۙۘۘۨۥۨۜ۠ۜۘۦ۠ۨۘۦ۫۟ۚۙۡۧ۫ۖۢۘۧۘۧۦۜۘۖۖۙۧۥۥۜۥۢۤۨ۬ۡۡۘۙۜۢۚۙۢۨ۠ۦۖۥۘ";
                    break;
                case 1846161120:
                    str = "ۢۚۖۤ۫ۤۘۦۘۚ۟ۙ۟ۨ۠ۤۘ۠ۘۖ۠۫۫ۦۗۚۥ۟ۖۘ";
                    break;
            }
        }
    }

    private void ooOO(View view) {
        int i = 0;
        String str = "ۤ۟ۜۘۙ۠ۧۥۚۤۤۦ۬۠۟ۡ۫ۖۛۗۖۧۘ۠ۚۡۘۜ۬۬ۦۥۨۚ۫۫ۛۡ۠ۙۚۦۘۚ۫ۚ۟۟ۖۘۤۜۡۡۦۦ۟ۢ";
        float width = 0.0f;
        float f = 0.0f;
        float width2 = 0.0f;
        float x = 0.0f;
        while (true) {
            switch ((((str.hashCode() ^ 467) ^ 626) ^ 147) ^ 1303481835) {
                case -2025422197:
                    str = "ۤۨۜۘۜۛۧۤۜۥۖۖۙۘۢۦۗۨۙۦ۬ۧۥۗۚۨۘ۠ۘ۠۬ۢ۠۫ۤۨۘۦ۠ۤۢ۫ۤ";
                    break;
                case -1696836234:
                    view.animate().x(f).setDuration(300L).start();
                    str = "ۙۚ۫ۥۡۜ۠ۢ۬ۗۨۜۛ۠ۧۦۧۧۙ۟ۜۦۘۖۧۥۘۘۡ۟ۤۙۛۚ۬ۤۧۚۙۦۜ۫۠ۢۧۦۗۜ";
                    break;
                case -1513492128:
                    str = "ۖ۫ۖۦ۠ۡۖۖۥۜ۫ۜۘۘۖۨۥۚۛۜ۫ۧ۫ۦۗۥۨۨۘۙۦۙ";
                    break;
                case -955445942:
                    x = view.getX();
                    str = "ۖ۠ۦۙ۟ۜۘۘۧۡۦۛۤۧۗۦۘۡۜۘ۠ۜۥۡ۠ۚۢۛۦۘۨۡۢۗ۫ۢۤ۠ۢ";
                    break;
                case -829323178:
                    width = i - view.getWidth();
                    str = "ۜ۟ۤۖۗ۬ۢۢۡۘۛۗۥۛۨۜۘ۬۫ۨۘۗۥ۟ۢۜۘ۬ۚۛ۫ۥۛۙۚۜۖ۠ۙ";
                    break;
                case -419031405:
                    i = this.Ooooooo;
                    str = "ۢۨۙۖۘ۬ۜۦۗۧ۟ۛ۟ۘۡۘۖۨۘۜۗۜۤ۬ۡۚۥۘ۠ۨۘۘۚۖۨۘۨ۫ۘ۠ۘۤۗ۠ۙۦۜۨۚۛۖۘ";
                    break;
                case -229636801:
                    return;
                case 37233045:
                    str = "۠۠ۨۥۙۙۘۖ۟ۢۡۡ۠ۛۦۘۚۤ۠ۤ۠ۡۘ۟ۗ۠ۧۗۚۢۡۡۗۖۧۘۖۢۖۘ۟ۛۦۘۧۧ۫ۨۥۡ۬۬ۚ۠ۘۖۙ۬ۢ";
                    break;
                case 500597258:
                    str = "ۧۜ۠ۙۘۜۘۗۥۢۜۗۛ۟ۧۨ۬ۡۜۘۜۦۤۥۥۥۘۥۡۥۗ۟ۚ۠ۙۚۜۘۨ۬ۖۖۛۘۘۛ۟ۜۖۥۨ";
                    break;
                case 782997405:
                    width2 = view.getWidth() / 2.0f;
                    str = "۠۫ۡ۟۬ۘۘۧۛۙۦۖۛۘ۫ۘۘۙۥۖۖۚۥۘۢ۠ۢۤۦۙۢۚۙۢۧۦۙۙ۫۬ۥۚۨۨۘ";
                    break;
                case 841404876:
                    str = "ۖ۫ۖۦ۠ۡۖۖۥۜ۫ۜۘۘۖۨۥۚۛۜ۫ۧ۫ۦۗۥۨۨۘۙۦۙ";
                    f = width;
                    break;
                case 2090063645:
                    str = "ۘ۫۬ۚۤ۫ۦۥۢۛۜۜ۫ۡۨۘ۠ۛۨۧۙۧۥۦ۟۟ۡۥۘۗۤ۟ۤۨۡۡۘ۠";
                    f = 0.0f;
                    break;
                case 2091375557:
                    String str2 = "ۧۨۛۤۖ۠ۗۖ۟ۛۖۛۖ۫ۜ۬ۧۥۘۛۤ۟۟۠۫ۡۢۨۘ۟ۘۚۘۦ۬ۤۜۖۘۚۗۚۡۗ۠ۙۦۨۙۚ۫";
                    while (true) {
                        switch (str2.hashCode() ^ (-1438938542)) {
                            case -1231835088:
                                str = "ۤۥۤۛۖۧۘۥۛۜۖۛۜۡ۟۠ۨۨۜۜۧ۟ۡۚۢۡ۫۫ۜ۟ۥۘۜۤۦۘۧ۬ۚ۟۟ۢ";
                                continue;
                            case -411553540:
                                str = "ۥ۠ۖ۬ۜۡۢ۠ۨۘ۫ۜۨۘ۠ۖۜۢ۬ۡۢ۟ۨۙۤۧ۟ۚۦۘۖۢۦۙ۫ۦۢۛۥۘۗۤ۬ۤۘۘۤۤۨۘۨۢ۫۠ۗۦۘۗۖۖ";
                                continue;
                            case 1084695019:
                                String str3 = "ۛۨ۟ۡۛ۠ۥۛۤۥۖ۟۫ۘۛ۬ۙۜۘۘۛۡۘۤۚۨۘۢۥۛۙۨۘۡۜۦۘۧۧۛۛۡۛۗۘۧۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1742159680) {
                                        case -2007187234:
                                            str2 = "ۡۖۦۘ۟۫ۨ۫ۢۚ۟ۧۧۧۚۥ۬ۦۧۘۜ۫ۢۜۡۤۡ۠ۡۘۙ۬۟ۨ۟ۡۚ۫";
                                            break;
                                        case -1092994062:
                                            str2 = "ۘۖۗۧۤۡۘ۫ۚ۬۬۠ۧۤۗۗۖۚۙۦۧۘۢ۟ۤۛۘۦۘۘ۟ۡۘ۫ۤۡۘ۟ۙۜ۟ۤۢۜۨۦۥۜۘۘ۟ۨ۟ۨۙۖۘۡۖ۫";
                                            break;
                                        case 440759531:
                                            str3 = "۟۫ۧۛۥ۟۠ۤۥۘۦۖۤۜۜۧۘۥۥ۫ۜ۬ۜۘۨۖۖۘ۠۠ۦ۬ۧۜۘۨۜۘۚۤۥۖ۫ۡۘ۠ۢ۠ۧۨ۠۠ۖۢ";
                                            break;
                                        case 509082733:
                                            str3 = x + width2 < ((float) i) / 2.0f ? "ۥۨۗۘۧۥۢۥۦۛۘ۠ۡۜۨۧ۟ۡۘۘ۬۠ۡۖۜۤۜۦ۟ۡۘۙ۟ۗۦۡۘۨۧ۬ۤۖۘۨ۠ۡۖۘۥ۟ۨۘۢۛۗ" : "ۙۘۥ۫ۨۡۘۜۙۙ۬۠ۖۘۦۢۘۘۜۡۖۨۖۢۜۥۖۜۥۘۖۗۙۡ۟۬ۤ۫ۨ";
                                            break;
                                    }
                                }
                                break;
                            case 1289598383:
                                str2 = "ۘۛۚۛۡۦۘ۟ۤۗۚۥۡۘۢ۬۠ۗۢۥۘ۬ۡ۫ۢۙۤ۫ۡۘ۟۬۟۠ۛۖۤۦۜۗۙۡۥ۟۠۬۫ۘۛۖۛۘۚ۠۫ۤۢ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public void OooO() {
        String str = "ۢۘ۟ۘۘۘۜۢۥۘۖۗۜۗۛۥۛ۬۠ۙۛۨۘۘۛۗ۫ۘۗۜۘ۬ۘۧۘۛۘ۟۬ۨۖۘۦۥ۬";
        while (true) {
            switch ((((str.hashCode() ^ 646) ^ InterfaceC2174a.f13808L) ^ 554) ^ (-1286567414)) {
                case -1845468685:
                    ((C4091la) this.OooooO0).OooOoo0().observe(this, new OooOo00(this));
                    str = "ۛۛۡۘۜۗۖۘ۟ۧۥۘۙۙۚۚۙۢۛۙۗۥۤۛۛ۬ۛۢ۠ۘ۫ۦۥۘ";
                    break;
                case -1656814544:
                    str = "ۢۦۙ۬ۙۨۘ۫۠ۜۡۧۜۘۖۜۡۘۤۗۗ۟ۢۘۘ۠ۢۚۘۧۖۚۦۙ";
                    break;
                case -605411749:
                    ((C4091la) this.OooooO0).OooOoo().observe(this, new OooOOOO(this));
                    str = "۫ۗ۫ۜۖۚۤۚۨۨۥۥۘ۬ۤۧۦۤۨۘۧۖۡۘۨۥ۠ۤۚۢۤۘۦ۠ۖۘۛ۫ۘۘۦۚۙۙ۫";
                    break;
                case -384658412:
                    ((C4091la) this.OooooO0).OooOooo().observe(this, new OooOOO0(this));
                    str = "ۚۚۥۘۨۜۨۘۥۖ۬۟ۘۦۥۡۘۖۖۨۡۛ۟ۨۧ۬ۗۨ۬ۦۜۘ";
                    break;
                case 621934555:
                    ((C4091la) this.OooooO0).Oooo000().observe(this, new OooOOO(this));
                    str = "ۜۗۙۗۛۦۘۡۦۥۚۨۛۛ۠۟ۚۘۢۖ۫ۘۛۜۘۖۛۡ۟ۖ۫ۗۜۘ۬ۚ۟ۜۜۜ۫ۨۘۘ";
                    break;
                case 747245734:
                    return;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public int OooO0oO() {
        String str = "۫ۘۢۨ۫ۥۤ۠ۨۘۜۥۥۘۥ۟ۜ۟ۛۢۧۡ۠ۥۛۢ۠ۜۦۛۚۤ";
        while (true) {
            switch ((((str.hashCode() ^ 503) ^ 689) ^ 769) ^ (-2031091932)) {
                case 319288238:
                    return R.layout.activity_main;
                case 1246666137:
                    str = "ۥ۠ۛۘ۫ۡۘ۫ۥۥۘۙۡ۠۫ۧۖۚۡۜۚۚۨۛۘۜۧۜۖۗۥۘ۬ۛۥۧۨۡۧ۟۫۬۫ۙ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public Class<C4091la> OooO0oo() {
        String str = "ۘۙۨۘۥۗۖۘۙۨ۟ۛۖۖۧۧۤۘۨۗۛۖ۟ۜۖۨۜۗ۠ۡۧۧۜۢۢۢۙۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 299) ^ 494) ^ 346) ^ (-519327798)) {
                case -2080081384:
                    str = "۫ۢۘۘۜۨۘ۟ۤۡۡۤۥۙ۠ۜۘۛۛۤۗ۬۠ۨۙۤ۫ۙۨۘۛۜۜۙۦ۫ۤۢۖۛۤۗۨۢۛ";
                    break;
                case -1521337623:
                    return C4091la.class;
            }
        }
    }

    public void OoooO() {
        String str = "ۖۙ۠۟۫ۥۘۥۥۜۘۘۙۖۘۖۜ۟ۤۦۗۡۛۘۘۨۦۧۢۜۦۘۨۤ۠۠ۥۢۙۗۙۜۡۧۘۜ۬ۡۘۤۚۜۦ۟ۧ";
        while (true) {
            switch ((((str.hashCode() ^ 696) ^ 898) ^ 159) ^ (-1203137362)) {
                case -24531972:
                    return;
                case 900149064:
                    str = "ۤۡۥۡۢۦۘۗۘ۫ۘۨۨۘۡ۟ۗ۠ۤۙ۟ۚۦۗۛۥۘۗۦۚۜۙۧۜۤۜۥ۟۟ۛ۟ۗۗۨۘۘ۬ۛۖ۫ۖۡۘۤۨۨۘۛۖ۬";
                    break;
                case 1560421850:
                    new Oooo0(this, null).executeOnExecutor(Executors.newCachedThreadPool(), new InputStream[0]);
                    str = "ۡۛۡۨۘۡۘ۟ۤۢ۠ۛۘۘۛۥۛۡ۫ۚۨۥۥۗۖ۟ۦۧۢۜ۠ۥۘ";
                    break;
            }
        }
    }

    public void OoooO0O() {
        String str = "ۗۜۨ۫ۥۗۘۚۧۨۨۗۥۗۦۖۥۥۘ۫ۚۚۦۛۧۖۨۛۙۘ۟۠ۗ۬۠ۙۖۘۗۡۥۛ۟ۛ";
        while (true) {
            switch ((((str.hashCode() ^ 517) ^ 951) ^ 731) ^ 369295494) {
                case 255829038:
                    ThreadUtils.OooOO0O(new Oooo000(this, new DialogC4309r6(this)));
                    str = "ۧ۠۬ۛ۟ۨۤۗ۫۠ۥۚۥۦۡۘۤۥۦۘۦۥۥۛۖۤۗۛۚۧ۟ۖۚ۟ۙۧۗ۠ۢ۠ۖۛۘۚۗۡۙۡۘۜۤ۠ۢۨ";
                    break;
                case 543066027:
                    str = "۬ۢۚ۬ۖۨۜۤۤۨۜۡۘۗ۟ۗ۠ۦۙۥ۠ۘۘ۫ۛۖ۟ۤ۫ۧ۫ۙ۟ۘۛۖۖۜۨۥۘ۫ۤۡۘۤۡۦۘۛۖۡۘۨۖۘ";
                    break;
                case 1982131954:
                    return;
            }
        }
    }

    public void OooooO0() {
        String str = "ۤۧۡ۟ۨۤۧۢۥۘۜۚۡۘۨۨۘۘۨۨ۟ۨۨۜۘ۠ۛۘۢۧۦۘۢۘۜ";
        while (true) {
            switch ((((str.hashCode() ^ 73) ^ 290) ^ 822) ^ 1473799852) {
                case -1614380564:
                    String str2 = "۠۠ۛۢ۬ۜ۟۟ۦۘ۫ۥۡۘۜۙۥۘۗۡۘۧ۫ۘۙۦ۠ۘۚ۬ۜۤ";
                    while (true) {
                        switch (str2.hashCode() ^ (-743894920)) {
                            case 828553830:
                                str = "ۘۗۜۧۛۨ۟ۢۛۛ۬ۚۗۘۜۗۦۨۘۨۨۢۖۨۙۙۙۛۢۡۤۦۘۜۛۖ۬";
                                continue;
                            case 920240990:
                                str = "ۖۙ۟ۘۨۚۗۨۤ۫ۚۗۙ۟۠ۛۛۜۘۚۨ۟۟ۤۨۡۘۨۨۥۛۚۢۘۘۖۙۜۨ۬ۥۗۤۡۛۡ۠۟ۖۖ";
                                continue;
                            case 957292184:
                                str2 = "ۤ۟۠۠ۨۧۘۗۢۖ۫ۢۦۘۨۧ۬۟ۧ۟ۖ۫ۡۘۨ۟ۖۘۥۧۜۘ۬ۤ۟ۤۜۖ۫ۦۛ۟ۤۦۖۚ۬۠ۢۜۧۨۨ۠ۢ۬ۦۨۘ";
                                break;
                            case 1358901591:
                                String str3 = "ۘۧ۠ۘ۠ۨۘۤۢۙۗۧ۬۟ۧۡۘۢۤۚۘۢۖ۬ۤ۟۫ۢۢۤۖ۠";
                                while (true) {
                                    switch (str3.hashCode() ^ 1493337755) {
                                        case -1301234384:
                                            str3 = "ۢ۬ۤ۠ۧۗۚ۟ۦۗ۠۟ۥۥ۫ۛ۠ۜۘۢ۬ۦۘۥۦۚۙ۟ۦۘ۬۬ۗ۫ۙۘۛۤۡۘ۠ۙۤۗۜۘ";
                                            break;
                                        case 116743894:
                                            str3 = C4529x4.OooO0O0().OooO00o(C3902g6.OooO0o0, Boolean.FALSE) ? "ۘ۠۠۬ۧۢۨۘۡۘۚ۠ۡۜ۠ۙۙۙ۬ۤۛۥۘۡ۫ۢ۟ۨۜۘ۟ۖۗۚۛ۠ۤۤۥۚۨۨۗۢۡۤۥۨۥۤۦ" : "ۘۛۦۘ۫ۗۨۘۖۚۗۚۛۖۚ۠۟ۥۚۜۖۦۚۘۨۘ۠۠ۥۨۖۥۥۧۖ۬ۨۧۘ۟ۗۚۜۛ۟ۡۗۜۦ۠ۗ";
                                            break;
                                        case 861533716:
                                            str2 = "ۦۛ۫۫ۖۘۘ۠۫۟ۜۧۧۛۙۤۚۖۗۛۤۘۛۢۚۡۢۡۘۙۚۚۨۢۚۖۚۜۘۦۚۥۘ۠ۘۤۨۢۡۘۗ۠ۖۘ";
                                            break;
                                        case 2048571326:
                                            str2 = "ۜۡۡۘۖۥۥۘۖۨۛ۫ۘۥۘۨ۠ۥۘۥۗۨۘۙ۫ۖۘ۫ۡۙۘۦۧ۬ۢۥۦۙۙۙۧۤۨۦۜۨۥۜ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -332604452:
                    str = "ۖۚۥۘۡۖۗۚۦۦۘۨۥۡۜۖۨۘۘ۠ۨۖ۟ۘۘۨۢ۫۫ۜ۬ۖۤۥ۟۫ۧۛۚۧۨ۬ۘۘۦۖۧ";
                    break;
                case 926506009:
                    return;
                case 952702438:
                    this.o00Ooo.setVisibility(0);
                    str = "ۘۗۜۧۛۨ۟ۢۛۛ۬ۚۗۘۜۗۦۨۘۨۨۢۖۨۙۙۙۛۢۡۤۦۘۜۛۖ۬";
                    break;
            }
        }
    }

    public /* synthetic */ void Oooooo0() {
        String str = "ۥۚۦۦۗۧ۬۟ۧۜۖ۟ۚۨ۫ۡۚۖۘۚۧۢۛۙۜۚۖۖۘۧۘ۟ۢۙۜۘۧۦۤۚۜۘۘ۠۟ۧۘۡۥ۫ۗۚ";
        while (true) {
            switch ((((str.hashCode() ^ 738) ^ 460) ^ UiMessage.CommandToUi.Command_Type.SET_FONT_VALUE) ^ (-1929680345)) {
                case -1811192042:
                    str = "ۤ۬ۦۘۛۨۛۡۦۗۥ۬۟ۙۗۘۧ۟۠ۗۨۗ۬ۡۘۖۘۜۘۙۡۥۦۥۘۜۖۦ۠ۛ۬ۘ۫۫ۥۢ۬ۙ۠ۚ";
                    break;
                case -862935571:
                    return;
                case 208231429:
                    OooooOo();
                    str = "ۦۧۨۘ۬ۡۘۘۗ۠ۨۘۖۤۦۤۗۧۥۚۢۧۢۖۗ۬ۖۛۧۘۘ۬ۘۘۘ";
                    break;
            }
        }
    }

    public /* synthetic */ void OoooooO() {
        String str = "ۨۨۧۨ۠ۡۘۧۚۡ۠۟ۤۤۡ۬ۘ۬ۥۗۤۦۘۤۤۚۢ۫ۦۨۙۧۦۥۘۘۘۢۨۛ۬ۖۥۥۨۘۗۜۘ۬ۛۨۘۜ۫ۗۦ۠ۚ";
        while (true) {
            switch ((((str.hashCode() ^ 921) ^ 392) ^ 28) ^ 1576977119) {
                case -1140974001:
                    return;
                case -654566484:
                    Oooooo();
                    str = "ۖ۫ۡۘۡۤۨۜۦۥۘۦۢۦۘۘۘۚۧ۬ۗۖۧ۠ۤۧ۫۟۟۟۫ۖۘ۟ۢۧۛۗ";
                    break;
                case 1484441629:
                    str = "ۙ۠ۜۘۨۜۦۘۢۡۥۘ۬ۢ۟۠ۘۨۘۗۜۖۘۗۡۗۡۦۥۘۡۙۛۤۖۧۘ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public void initView() {
        String str = "۠ۨۦۘۧۢ۫ۡۗۘۧۧۨۨ۫ۘ۫۟ۚ۬ۢۖۘۥ۠ۛۖۛۡۘۖۘۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ C4095le.o0000O00) ^ UiMessage.CommandToUi.Command_Type.SET_UIP_DATA_VALUE) ^ 615) ^ (-113054255)) {
                case -1524486274:
                    this.o00oO0O = (ImageView) findViewById(R.id.id_img_msg);
                    str = "ۛۨۡ۬۬ۙۗ۬ۜۘ۬۟۫ۧۦۗ۫ۡۥۜۨۖۥۥۖۘۗ۠ۨۖۜۙۙۚۘۧۨۘۘۖۚ۠ۥ۬ۧۙ۬ۤۜۦۘ۬ۚ۟۫ۖۥ";
                    break;
                case 145085419:
                    this.o0ooOO0 = (ImageView) findViewById(R.id.id_img_setting);
                    str = "ۥۗۙۢۤۢۨۖۙۛۡ۠۠ۗۚۤ۫ۛۘۨۧۙۖۧۘۜۧۗۙ۬ۦۘ";
                    break;
                case 854705537:
                    this.o00oO0o = (TextView) findViewById(R.id.tv_resolution_unsupport);
                    str = "ۥۛۖۚ۠ۧۦۗۙۡ۟ۥۘ۟ۥ۬ۢۙۛ۟۠ۦۚۨۤ۬ۚ۫ۡۚۗۖۚۥۖ۬ۤۨۡۖۘۘۦۖۘۥ۟ۛۚ۠ۗۨۨ۟ۦۘۛ";
                    break;
                case 1171144447:
                    this.o00Ooo = (ImageView) findViewById(R.id.id_img_dot);
                    str = "ۨۘ۫ۦ۫ۨۤۡۡۘۜۢۥۘۢۘ۫ۧ۟ۚۤۖۗ۟ۚۥۨۘ۟۠ۛۧ";
                    break;
                case 1363888865:
                    str = "ۡۤۥۘ۬ۜۨۢۜۤۚۤۗۨۚۗۦۨۗ۟ۥۡۘ۬ۦۛۧ۫ۦۤۥۘۘ";
                    break;
                case 1543790510:
                    getWindow().setSoftInputMode(48);
                    str = "۬ۡۨۗ۬ۛ۬ۧ۟ۨۦۘۗۥۖۘۢۙۥۖۙ۟ۦۦۥۘۦۜ۬ۥۥۜۘۘۧ۟ۚۘۧ";
                    break;
                case 1655606240:
                    this.o00o0O = (TextView) findViewById(R.id.tab_recommend_games);
                    str = "ۨۥۛۚ۟ۚ۬۬ۥۧۗ۟۬ۘۥۤۦۛۧ۬ۧۘۗۢۨۗۗ۬ۡۘۦ۬ۦۘۨۚۜۘ۠ۖۘۗ۫ۘۘ۬ۜۘۦۧۡۤۤ۠ۘ۟ۥۘ";
                    break;
                case 1937320277:
                    return;
            }
        }
    }

    public void o0OoOo0() {
        StringBuilder sb = null;
        String string = null;
        boolean zOooO0O0 = false;
        StringBuilder sb2 = null;
        String str = null;
        boolean zOooOOO0 = false;
        StringBuilder sb3 = null;
        boolean zOooO0O02 = false;
        StringBuilder sb4 = null;
        String str2 = null;
        boolean z = false;
        StringBuilder sb5 = null;
        String str3 = null;
        String str4 = "ۖۨۧۘۗۙۖۘ۟ۖۖۘ۫ۚ۫ۢۡۘۘۧ۬ۛۘۨ۟ۤۡۘۘ۠ۛۡۥۦۡۡۦ۬ۛ۠ۛۙۗۘ۟ۥۘ۠ۘۚۘۤۡۘۦۨۜۘ۟ۥ۫";
        while (true) {
            switch ((((str4.hashCode() ^ 659) ^ UiMessage.CommandToUi.Command_Type.SET_FW_BUTTON_VALUE) ^ 7) ^ 1344473889) {
                case -2098163609:
                    sb4 = new StringBuilder();
                    str4 = "ۜۙۡۘۜۚۦۡۦۜۘۢۦۛۧۥۡۚۧ۬۠ۗۘۡۗۗۗۗۦۘۢ۟۫ۖۖ۫۬ۛۘۘۤۥۧۚ";
                    continue;
                case -2029776256:
                    String str5 = "۠ۦ۟ۨۘۧ۠ۥۘۡۦۨ۫۠ۗۛۙ۠۫ۨۖۥۡ۠۠۟ۖۙۤ۫ۡ۠ۥۖ۫ۨ";
                    while (true) {
                        switch (str5.hashCode() ^ (-1393206967)) {
                            case 148013423:
                                str4 = "ۨۢۡۘۘۚۚۖۘۘۘۜۧۖۘۛۛۧۗۥۖۚۘۘ۠ۚۧۤ۠ۜۡ۫ۘ";
                                continue;
                            case 149837062:
                                String str6 = "ۤۗۜۘۜۥ۫ۛۦۘۘۙ۟ۛۢۥۙۗۙۨۡۨۡۜۡۜۥۘ۫ۤۥ۟۠ۥۘۘ۠ۚۚۨۧۡۦ۫۬ۨۤۙۛۥۘ";
                                while (true) {
                                    switch (str6.hashCode() ^ 1118023296) {
                                        case -286849881:
                                            str6 = !new File(string).exists() ? "ۨ۫ۨۘۘۙۖۨۘۜۘۤۡۗۘۤۤۘۙۖۘۘ۟ۤۗۖۡ۟ۜ۠۫ۨۨۘۖ۟ۖۘۗۧۥۘۚۛۢۨۘۦۡۘۘۨۥۨ" : "ۢۚۨۘ۠ۚۜۘۛ۟۟ۨۛۜ۬۫ۢۦۥۨۘۥۛۤ۬ۜۚۢۧۨۘۚۘۥۘ";
                                            break;
                                        case 138635656:
                                            str5 = "ۜۘۗۢۛۦۘۚۤۙۜۡۙۨۛۙۙۨۧۘۚ۟ۦۘۢۡۢۘۚۡۚۤۖۢۘ۠۠ۚۧۘۜۨ۟۫ۖۢ۬۟ۜ۟ۨۘۨۦۨۘۛ۠ۚ";
                                            break;
                                        case 725908999:
                                            str5 = "ۙۙۢ۫۠ۖۨۡۖۘۢۥۧۨۤۡۡ۠ۜۘۦۖۘۛ۠ۦۚ۟ۗۗۖۥۘۖۦۙ۠ۢۥۘ۟ۥۦ۟ۚۚ";
                                            break;
                                        case 2072587369:
                                            str6 = "ۗۥ۟ۘۨۨۜۡۨۦ۬ۗۢۢۙۜ۫ۥۚۦ۫ۛۜۘۡۧۤۧۨۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case 676185441:
                                str5 = "ۗ۫ۚۚ۟ۨۘۢۜۦۘ۠۟ۡۘۖۡۥۗۖۛۜۦ۟۬ۘ۬۫ۥۨۥۦۨۚۦۘۦۧۡ";
                                break;
                            case 1259103518:
                                str4 = "ۤۚۦۘ۟ۘۡۘۥۙۥۥ۬ۨۛۖۧۘۧ۠ۗ۫ۢ۟ۚ۬ۘۘۡۙۘۘۜ۫ۛۤۧۗۧ۫ۢۨۛۢۢۡۥۘ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case -1720116203:
                    string = sb.toString();
                    str4 = "ۛۡ۟ۘۧۤۦ۫ۗ۫۟ۙۙ۬ۜۘۙۛۤ۠ۖۡۢ۟ۘ۬ۧ۟ۛۚۥۘ";
                    continue;
                case -1248573682:
                    sb5.append(z);
                    str4 = "ۧۤۦۦۨۨۘۘۤۛۤۘۚۧۖۧ۟ۧۜۘ۫۟ۗۦۧۤۢ۫ۤ۫ۦۥۜۖ۠ۖۚ";
                    continue;
                case -1246727798:
                    sb = new StringBuilder();
                    str4 = "۫۟ۧ۫ۚۥۘۗۧۡۘۗ۟ۙۛۖۦۘ۫۟ۥۘۛۡۧۖ۬ۘۚ۬ۛۛ۬۟ۨۜۢۜۘ";
                    continue;
                case -1081746040:
                    str = "=====pushDexToSdcard: ";
                    str4 = "ۡۨ۟۟۬ۧۙۨۜۘۡ۠ۚ۫ۘ۟۟۟ۧۧۙۛۛۜۙ۬ۥۜۘ۠ۤۖۨۚۨۛۤۚۗۛۢ۟ۙۥۘۤ۬۠ۛۡۦۘ۠۟ۙ۟ۤۥ";
                    continue;
                case -838114038:
                    sb.append(C3902g6.OooOo0o);
                    str4 = "ۚۧ۫ۗ۫ۦۘۖۥۤۢۜۧۧۨۙۤۨۘ۫ۘ۟ۗۥۙ۠ۖ۠۫ۜۛۧ۫ۧۚ۫ۨۘۡۘۧۘۙۢۛۘۨۧۘۦۜۥ";
                    continue;
                case -802172997:
                    sb3.append(zOooOOO0);
                    str4 = "ۛۛۘۡۗۖۡۚۗ۬۫ۛۤۥۡۘۤۘۡۤ۫ۨۙ۫ۚ۟۫ۢۛۘۥۘۡ۠ۙ۫ۖۥۘ۠۬ۨۘۚ۟ۖۘۧۘۦۖۨۧۘ۟ۜۜۙۥۜ";
                    continue;
                case -703692609:
                    str4 = "ۤۡ۠ۜۢۧۤۦۧۘ۠ۤۖۘۖۖۜۘۖۥۘۥۢۦۚۡۦۗۖۤۗ۫ۛۥۙۖۘ۟ۜ۠ۦۗ۫ۛۗۢ";
                    sb5 = sb2;
                    continue;
                case -476171405:
                    sb5.toString();
                    str4 = "۠ۚۛۗ۬۫۬ۙۡۙۛ۬ۡ۬۟ۦۦۤۛۢ۠ۨ۬ۥۢۖۨۘ۟ۡۙۗ۫ۡۘۥۨ";
                    continue;
                case -420683023:
                    str4 = "ۗۘۖۘۢۖۧۡۤۦۜ۠ۦۘۖۖۚۛۦۡۗۗۦۨۘۨۡۖۜۜۨ۬۫ۨۛ۬ۗۧ۫ۜۦ۫ۢ";
                    sb5 = sb4;
                    continue;
                case -416745006:
                    str4 = "ۘۙۜ۟۠ۜۘۤۗۡۘۚۢۡۘۘۢۘۡۥۗۦۚۢۙۨۤ۟ۙۜۘۧ۠۠ۨۙۖۘۧۧ۫۫ۜ۟ۥ۫ۥۘ";
                    continue;
                case -67802637:
                    str4 = "ۥۦۢۘۛۦۘۥۤۥۘۧ۫ۡۘ۬۬ۨۚۗۨۘۦۚۦۘۧۦۘۘ۠ۚۦ۫ۖۘۘۛۧۖ۬ۦۘۢ۬ۙۙۢۢ۟ۧۘۘۢۘۦ۠۬۬ۢ۫ۜ";
                    str3 = str;
                    continue;
                case 122646825:
                    sb.append(File.separator);
                    str4 = "ۖۡ۟ۘۚ۠ۘۖ۫ۚۦۜ۫ۛۨۗۤۦۦۡۛۤۗۧۗ۟۟ۙ۬ۡۜۘۘ۠۬ۗ";
                    continue;
                case 172988489:
                    str4 = "ۘۙۜ۟۠ۜۘۤۗۡۘۚۢۡۘۘۢۘۡۥۗۦۚۢۙۨۤ۟ۙۜۘۧ۠۠ۨۙۖۘۧۧ۫۫ۜ۟ۥ۫ۥۘ";
                    z = zOooO0O0;
                    continue;
                case 239326989:
                    zOooO0O02 = C3678a4.OooO0O0(getApplicationContext(), C3902g6.OooOo0o, string);
                    str4 = "ۡۨۡۘۥۦۖۘۛۢۤۤۜۦۘۜۤۡۥۤۚۘۙ۠ۧۡ۫ۢۨۘۜۚۥۘۡ۫ۨۚۦۙۢ۠ۛ";
                    continue;
                case 299238109:
                    sb2 = new StringBuilder();
                    str4 = "ۦ۠ۤۚۥۧۦۢۙۦ۬ۛۜۧ۠۟ۨ۫ۚۦۘۘۦۙ۟ۥ۠ۥۢ۫";
                    continue;
                case 306366409:
                    sb3 = new StringBuilder();
                    str4 = "ۡ۟۫ۖۢۜ۫ۥۢۤۗۙ۟ۚ۫ۜۛۡۖ۠۠ۘ۫ۢۨۥۦۖۛۖۜۨۖۗۚۖ۠ۗۨۦۘۘ۟ۜۦۦۘ";
                    continue;
                case 320015345:
                    zOooO0O0 = C3678a4.OooO0O0(getApplicationContext(), C3902g6.OooOo0o, string);
                    str4 = "ۦۥۘۧۗۨۡ۫ۗۚۢۢۥۗۗۗۤ۬ۜۖۧۡۥۜۨۛ۠۠۬ۡۚۦۧۘۦۨۚ۬۫ۜۛ۟ۨۗ۟ۛ۬ۙۖ";
                    continue;
                case 507692028:
                    str4 = "ۨۚۡۘۦۛۦۘۡ۠۟ۧۤۥۘۧۖۦۘ۠ۨۦۤۙۥۛۚۥۘۖۚۥۘۖ۬۬ۗۥۘ";
                    str3 = str2;
                    continue;
                case 625976716:
                    str4 = "ۖ۟ۗۜۢۜۘۖۙۡۘۚۖ۫ۧۢۗۤۚۙۜۤۨۨ۬ۨۘۨۥۡۡۖۤ";
                    z = zOooO0O02;
                    continue;
                case 845204651:
                    sb3.append("=====pushDexToSdcard: dex文件已存在,isSame:");
                    str4 = "ۛ۬۫۬ۥۦ۟ۡ۟ۛ۠ۙۢۗۥۗ۫ۗۤ۟ۥۘۚ۬۬ۘۘۜ۬ۡۡۘ";
                    continue;
                case 982267834:
                    zOooOOO0 = C4385t8.OooOOO0(this, C3902g6.OooOo0o, string);
                    str4 = "۠ۗۖۘۗ۫ۘۘ۠ۙ۬ۜۛۤۢۡۖۢۦۘۘۘۡۗۦۦۤۦ۫ۖۘۤۤۘۘۢۙۢۙۡۥ";
                    continue;
                case 1168996468:
                    String str7 = "۬ۖۡۘ۫ۙ۠ۡ۫ۛۙۦۗۘۛۢۤ۬ۛۢۛۘۘ۫ۨۜۘۙ۬ۦۘۢۜۥ";
                    while (true) {
                        switch (str7.hashCode() ^ 837091939) {
                            case -1840027179:
                                String str8 = "ۘۛ۫ۙۡۗ۫ۙ۠۬ۛۜۗۗۜۘۖۘۨۘۛ۬ۖۘۛۧۗ۟ۚ۠ۖۘۨ۫ۗۥۘ۠ۡۘۘۧ۟ۢۧۨۦۘۖ۬۬ۡ۫ۚ۫ۗۜۘ۬ۛۗ";
                                while (true) {
                                    switch (str8.hashCode() ^ 1119197881) {
                                        case 175585806:
                                            str7 = "ۙۜۖۖ۫ۡۚ۟ۖۘ۟۬ۖۥۙۨۘ۬ۢۡۘۧۚۘۜۤۨۚۙۥۜ۠";
                                            break;
                                        case 1328714074:
                                            str7 = "ۚۜۜۘۤۙۦۘۨۖۤۢۙۧ۬ۛۡۘۛۥۥۦۖۘۧۖۦۘۢ۫ۙۤۖۖۢۚۘۘۖۗۖ";
                                            break;
                                        case 1820479738:
                                            str8 = "۬ۜۘۘۢ۠ۨۙ۠ۨۘۜۛۘۖۚۦۛۛۡۗ۟ۖۢۛۨۖۦۡۦ۠ۖ۬ۖۛ۠ۧۘۘۚۨۤ۠ۢۖ";
                                            break;
                                        case 2107971435:
                                            str8 = !zOooOOO0 ? "ۧۗ۫ۚۤ۬ۨ۟ۡۘۙۗۥۛۛۤۢۚۦۚ۬ۙۘۘۧۧۨۚۘۦۢۚۖۤۨۘۚۙۨۘۤۖۨۘۥۙۜ۫ۜۜۘ" : "۠ۗ۫۟ۢۗۨۚۘۗۧۘۧ۠ۨۡۥۨۤ۠۟ۥۨۦۙ۬ۢ۫۫ۜ۠ۡۘۘۙۡۨۥۘۧۥۖۘۗۧۧۤ۬ۨ";
                                            break;
                                    }
                                }
                                break;
                            case -228414890:
                                break;
                            case 719561672:
                                str4 = "ۡۥۧۦۗۙۘۜۘۘۤ۟۟۬ۗۘۘۡۙۦ۫ۨۖۡۘۜۖۜۧۡ۠ۛ";
                                break;
                            case 1572157813:
                                str7 = "۠ۢ۬۫ۗۥۘۗۘۗ۫ۘۘ۬ۚۖۖۖۘۨ۠ۡۘ۫ۧۖۘۘۙۘۘۖۢۖ۟ۤ۠ۙۨ۫ۛۘۗ۟۠۫ۦۢ۫ۤۡۘۡۗۥۘ۬ۧۚ";
                                break;
                        }
                    }
                    break;
                case 1341598198:
                    str4 = "ۧۡۗ۫۬ۜۥۡ۟ۢۗۦ۠ۥ۬ۧ۫ۢۧۦۘۡۙۨۤۖۘۗ۬ۡۘۘۙۤ۫۫ۨۤۨۘ۫ۘۘۘ۠ۤ۟ۢ۟ۜۥۤۗ۟۫ۤ";
                    continue;
                case 1500635257:
                    sb.append(getFilesDir());
                    str4 = "ۥ۟ۨۘۡۨ۟ۛۜۨ۠۠ۨ۟ۛ۟ۜۦۡۧۘ۟ۦۡۛۙۘۨۘۡۘۧ۠ۦۘۛۥۛ";
                    continue;
                case 1717057660:
                    break;
                case 1754850289:
                    sb5.append(str3);
                    str4 = "ۥۗۥۘۢ۫۟ۛ۟۫۠ۜۦۢۡ۬ۢۘۡۘۖۨۡۖ۟ۡۘۡ۠۬ۡۗ۟ۘۜۜ۫ۥۧۘۡ۬ۘۗۦۙۥۢ۫ۙۦ۬";
                    continue;
                case 1766209724:
                    sb3.toString();
                    str4 = "۠ۤۧ۟۟ۥۦۦۘۘۘ۬ۚۗۛۛۛۜۡۘ۠ۨۚ۬ۛۚۥۗۢ۬۠ۤۗ۬۬ۛۡۘۜۢۡۘۤۘۦ";
                    continue;
                case 1779360081:
                    return;
                case 1821654162:
                    str2 = "====覆盖=pushDexToSdcard: ";
                    str4 = "۠ۖۘۖۢۨۘۚۛۖۘۡۢۧۘ۫ۤۦۖۖۤۖۥۜ۟ۜۘۙ۠ۦۘۥۡۡۚۜۖۨۥۢ۠ۨۘۘۡۗۙۨۡۜ۬۫ۚ";
                    continue;
            }
            str4 = "ۧۧ۬۠ۥۚۘۦۥۙۙۜ۟ۜۘۘۘۜۢۚۜۧۘ۫۠۠ۢۨۙۢۛۚ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:225:0x0016. Please report as an issue. */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str = "ۚۜۧۘ۫ۗۦۘۨ۬ۢۚۡ۬۠ۢۥۖ۟۠ۚۧۖۡۘ۫ۗۤۜۘۧۚۧ۫ۤۡۢ";
        Intent intent2 = null;
        String string = null;
        StringBuilder sb = null;
        while (true) {
            switch ((((str.hashCode() ^ 808) ^ 918) ^ 807) ^ 1351757392) {
                case -2061528811:
                    sb.append(Environment.getExternalStorageDirectory());
                    str = "۠۬ۥۘۜ۫ۥۘۚۛ۟ۧۗۦۘ۬ۗۦۚۧۦۘۥۘۗۚ۟۫ۜۥۛۤۦۧۘۛۥۘۨ۠ۛۥۦۖۘ۬ۦۥۚۖۡۘۖۡۢۦۙۖۢۖ۫";
                    break;
                case -1640851536:
                    str = "۟ۧۡۘ۬ۢۢۡ۠ۘۥۨۧۨۦۚۙۚۖۘۥۤۜۖ۠ۥ۫ۚ۫ۤۙۨ۫۟ۗۡ۫ۦ";
                    break;
                case -1452346697:
                    str = "ۖۙۘۘۛ۟ۖۢۦۦۘ۬ۨۘۦۗۖۘ۫ۗۜ۬ۛۥۚۢۧۨ۫ۢۜۨۘ";
                    sb = new StringBuilder();
                    break;
                case -1294761488:
                    sb.append(AbstractC1067a.f2406g);
                    str = "ۖۛۜۘۧۡ۠ۘ۟ۚۘ۠ۛۤۧۤۡۖۥ۫ۡۤۗۖۛۙۧۙ۟ۢ۟۫۠۠ۘۡۗ۠ۥۥۘ۠۟ۖۘۙ۬ۥۙۗۥۘ";
                    break;
                case -901485284:
                    intent2 = new Intent("android.intent.action.VIEW");
                    str = "ۜ۫ۙۢۜۚۖۦ۠ۜۡۥۗ۠ۧۢۡ۠ۧ۫ۚۤۙۦۙۜۤۜۘۨۙ۟ۧۦۨۘۙۢ۟ۗۘۖۘ۬۠ۜۘۜۦۥۘ";
                    break;
                case -684081829:
                    str = "ۢۜۛۜ۫ۢۨۧۘۘۙ۟ۥۖۡۘۚۘۧۥۚۛۨۖۖۘۙۜۙۛۗۜۨ۟ۘۤۨۨۘ";
                    break;
                case -611448373:
                    intent2.setFlags(1);
                    str = "۠ۡۦۤۗۜۘۦۡۡ۬ۥۨۨ۟ۧ۟ۛۗ۫ۖ۟ۖۘ۫ۨۗۡۘۛ۬ۘۜ۬ۖۘۜۙۜ۫۠۠ۧۚۡۘ";
                    break;
                case -451524874:
                    str = "ۘۚۗۚۡۜۚۨۖۘۢ۟۬ۤۛۥۤۜ۬ۙۘۢ۬ۘۡ۬۠ۥۘۥ۠ۛۙۧ۠ۖ۫ۥۘۜۘۡۘۚ۠ۘۘ";
                    break;
                case -127480459:
                    startActivity(intent2);
                    str = "۟ۧۡۘ۬ۢۢۡ۠ۘۥۨۧۨۦۚۙۚۖۘۥۤۜۖ۠ۥ۫ۚ۫ۤۙۨ۫۟ۗۡ۫ۦ";
                    break;
                case 665931013:
                    intent2.setDataAndType(FileProvider.getUriForFile(this, getString(R.string.pay_appid), new File(string)), "application/vnd.android.package-archive");
                    str = "۟۟ۙۦۨۢۤۗۗ۬ۤۜ۟ۤۜۡ۠ۢۙۜۨۘۘ۫ۦۘۢ۠ۘۘۡۖۧۘۖۨۧۘۦۛۜۛۤۦ۠ۚ۠ۤۧ۫ۜ۬ۨۥۖۘ۠ۧۜ";
                    break;
                case 689760027:
                    String str2 = "۫ۨ۬ۘۡۦۘ۬ۛۚۦۧۜ۬ۨۖۛۢۡۘ۬۠ۖۘۡۖۥۢۚ۠ۥ۠۫";
                    while (true) {
                        switch (str2.hashCode() ^ (-1243333178)) {
                            case -1772368076:
                                break;
                            case 493983547:
                                str2 = "ۥۤۦۧۖۤۘ۠ۤ۬ۡ۬ۤۚۜۘۗ۟ۨۘۥۚۤۙ۬۠ۤ۬ۢۘ۬ۡ";
                                break;
                            case 1839090914:
                                String str3 = "ۗۢۗۤۢۘۘ۬ۛۜۘۦۤۡۚ۫ۖۨۜۧۘۜۧۜ۠۫ۗۘۗۢۢۗ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1697818837)) {
                                        case -1062189622:
                                            str3 = new File(string).exists() ? "ۥ۠ۘۘۤۢۖۘۖۗۡۘۙۥ۫ۚۥۜۘۤۛۛ۠ۥۙۡۛۢۛۨۜۜۜ" : "ۙۙۦۦۚۨۨۜۦۘۤۥۘۘۛ۠ۙ۟۬ۨۥۤۥۥۦۥۤۜۘۧۙۡۡ۠ۙ۠ۙۙۙۖۛ۠ۡ۬۟۠ۖۘ۟ۚۥۘ";
                                            break;
                                        case 366509889:
                                            str3 = "ۧ۠ۜۗۛۤۚۧۘ۫ۘ۠ۧۜۧ۬۬۫۟ۛۛۦۛۡۤۚۦۥۧۦۛۧ۠۟ۚۖۘ";
                                            break;
                                        case 1804598777:
                                            str2 = "ۙۛۗۥۧۡۘۜۥۥۘۙۢۘۘ۠ۡ۬۫۬ۘۘۧۖۗۡۛۧۥۖۥۧ۟ۢۧۜ۠ۨۙۜۘۦۘۨ۬ۢۥ";
                                            break;
                                        case 1806946502:
                                            str2 = "ۧۜۨۘۙۜۘۤ۬ۙ۬۫ۨۚ۬ۙ۬ۚۜۘۘۖۘۚۙۗۨۛۙ۫ۢۤۗۗۦۘۛۤۥۘۚ۫ۥۚۢۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case 2093888418:
                                str = "۫ۨۛ۟ۤۤۜۦۘۛ۟۟ۚۢۛۡ۬۫ۤۨۧۘۨۛۦۘۡ۟ۥ۬ۡۦۘۙ۬ۨۘۛۧۖۘ۬ۢۥۘ۟ۥۘۘۢۤۚۥۜ۫";
                                break;
                        }
                    }
                    break;
                case 759581789:
                    str = "ۘۙۛۨ۠ۨۘۨۗۖۘۥۥۚۖۧ۠۫ۤۜۘۡۗۧۧۤۖۘۛۛۦۘۗ۟۠ۦۢۤۖ۫ۙۧ۬۠ۡۡۚۦۜۘۡۦ۫";
                    string = sb.toString();
                    break;
                case 764029916:
                    break;
                case 776131523:
                    String str4 = "ۤۢۢۧۥۦۘۥۦۨۘ۬ۨۡۥ۟ۜۘۧۛۜۘ۫ۦۧ۫ۦۤۨۥ۠ۥ۬ۙ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1698079753)) {
                            case -1278515099:
                                String str5 = "۟ۙۨ۟ۚۡ۟۠ۗ۬ۙۡۗ۠ۦۘۚۥۙۨۛۗۥ۟ۡۘۥۘۢۦۤۘ۬ۧۗۙۧۛۤۨۖۗۜۘۛۡۢۘ۫ۨ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1582714710)) {
                                        case -1455785697:
                                            str5 = "ۧۛۙۜۙۦۘۗۧۦۘۛ۫ۗ۬ۖ۠ۖۦۨ۫ۨۦۦۨۙۨۦۥۨۨۘ۬ۥۘۥۗۖ";
                                            break;
                                        case -442815779:
                                            str4 = "۟ۙۖۜۧۨۘۛۢۨۘۧۗ۠ۡۡۖۘۘۦ۫۠ۗۢۚۧۤ۠ۧۙ۬ۦۖ۫ۧۨۘۤۚۢ۠ۗۙۧ۠";
                                            break;
                                        case 749474906:
                                            str4 = "ۡۨ۬ۙۗۤۢۛۖۥ۠ۡۘۢۥۡۘۘۜۧۘ۠ۤ۠ۘۤۗۤ۠ۙۥۨۚ۬۫ۚۧۗۚۦۜۚۡۚۥۘۙ۫ۡۘۜۖ۟ۨۚۥۘۥۡ";
                                            break;
                                        case 1787518148:
                                            str5 = i == 2 ? "ۤ۫ۨ۬ۛۨۘ۫۟ۘۘۧ۬ۙ۠ۤۤۢۧۖۘ۟ۘۖۘۨۙۙ۟ۧۦ۠ۛۖۘۧۜۧۘ۟ۤ۫ۢۦۥۘۗۜۙۛ۫ۨۤۥۜ" : "ۜۚۗۙ۠ۗۧۙۧۤ۬ۙۥۚۖۢۘۢ۫ۗۦۤ۠ۨۘۤۘۙ۠ۨۘۢ۟ۥۘۤۨۛۥۨ۠ۢۥۛۖۘۤ۫ۨ";
                                            break;
                                    }
                                }
                                break;
                            case -702209763:
                                str4 = "۠ۖۡۗۨۛۧۚۥۚۢۧۢۚۛۤۤ۬ۦ۟ۖۗ۫ۦۘۧۨۜۘۢۜۚۧۡۖۦ۠ۜۢۥ۟ۗ۬ۜۘۜ۫ۘۜۦۡۘ";
                                break;
                            case -669625419:
                                break;
                            case -298482897:
                                str = "۟ۡۢۦۡۨۘۢ۬ۘۘۚ۟ۖۤۥ۬۟ۥۘ۫ۖ۫ۦۧ۫ۜ۫ۡۘۚۡۛ";
                                break;
                        }
                    }
                    str = "ۜۨۢۢۤ۟ۢۢۧۢۜۚۦۦۖ۟ۛ۬ۦۡۧۛۘۨۘ۫ۜۤ۠۟۫ۥۘۨۥۦۘۦۨۥۘ۫ۛۨۧ۫۬۫ۘۛ";
                    break;
                case 815483784:
                    C4173ni.OooO0o().OooO0OO().OooO0Oo(this);
                    str = "ۜۨۢۢۤ۟ۢۢۧۢۜۚۦۦۖ۟ۛ۬ۦۡۧۛۘۨۘ۫ۜۤ۠۟۫ۥۘۨۥۦۘۦۨۥۘ۫ۛۨۧ۫۬۫ۘۛ";
                    break;
                case 1083442663:
                    str = "ۢ۬ۜۘ۬ۜۥۘۜۡۧۙ۬ۖۡۥۘۤۦۦۗۜ۫ۖۤ۠۠ۚۥۚ۫ۚ۟ۥۥۤۚۖۘ";
                    break;
                case 1294239382:
                    sb.append(getPackageName());
                    str = "ۜۦۙ۟ۢۢۚۦۘۘۧۗۦۘۤ۬۠ۤۤۦۘۛۜۧ۬ۦۧۛۙۨۢ۬ۙۧۙ۫ۥۖۚ۬ۢۥۘۚۧۥ۟ۡۘ۬۟ۖ۠ۦۨۘ۬۫ۢ";
                    break;
                case 1344774737:
                    String str6 = "ۡۜۖۘ۫۬ۥۦۜۛۖۤۖ۬ۤۙ۫ۘۨۘۨۨۖۚۙۚۧۚۛۤ۫۬۠ۗۡۘۗۧۛ";
                    while (true) {
                        switch (str6.hashCode() ^ (-1692479272)) {
                            case -1696993091:
                                break;
                            case -1650215454:
                                str = "ۚۨۜۘۨۜۚۜۨۥۖۚۢۢۘۧۘ۠۟ۚۧۙۥۘۙۚۥۘۗۥۜۘۚۡ۬ۤۜۦۘۖۖۧۘ";
                                break;
                            case -1387144001:
                                String str7 = "ۜۙۨۘ۟۠۠ۢۨ۟۟ۡۘۧ۟ۥۘۗۛۜۘۡۛۢۧۡ۬ۡ۠ۦۙۘۨۘ۟ۡۖۜۜ۫۟۬ۡۤۡۘۚۚۧۖۡۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-2114153035)) {
                                        case -2016098618:
                                            str6 = "ۙۖۗۢۥۨۗۗۨۥۙۡۘۥۧۨۘۤ۫ۦۘۙ۫ۗۥۥۙۤۖۨۘۡۨۡۘۛۘۨۘۘۘۖ";
                                            break;
                                        case -848470619:
                                            str6 = "ۖۡۗۢۜ۫ۡۢۚۚۦۡۘ۬ۨۚۦۖۙۚۦۙ۠ۤۡۘۛۢۚۡۛ۬";
                                            break;
                                        case -263530589:
                                            str7 = i2 == -1 ? "۬ۚۖۤ۟ۗۗۘۥۧۨۨ۫ۖۨ۠ۥۛ۠ۡۘۘۡۢۗۙۘ۫ۥۢۥۘۦۨۙ۫ۘۖ۫۠ۥۘۥۤۖۘ" : "ۗ۠ۥۦۥۖۘۛۦۖۘ۫ۜۦۘۡۜۦۘۙۧ۬۠۬ۦۛۚۘۘ۠ۥۙ۬ۤ۠ۗۖۘۘۚۡ۫ۜ۟ۡ۬ۖۡۘ۫۬ۘۘۨ۫ۨۘ۟ۦۦۗۨۡۘ";
                                            break;
                                        case 2006310023:
                                            str7 = "ۛۨۡۛ۬ۙ۫۟ۛOۖۧۖ۠۠ۘۡ۠ۛ۬ۙ۟۫۠ۨۘۡۚۛۨ۫۬ۡۘ۟ۤ۫۠۫ۗۡ";
                                            break;
                                    }
                                }
                                break;
                            case 1667796954:
                                str6 = "ۚۚۥۛۢۗ۫ۤۢ۫ۗۧۗ۠ۖۛۡۘۘۜۙۖۗ۠ۡۘۧۖۜۘۨۤۜۗۧۗۨۚۡ";
                                break;
                        }
                    }
                    break;
                case 1654629242:
                    str = "ۜۛۨۘۦۗ۠ۡۥۡ۬۠ۦ۫ۥۘۘۨۖۘۘۢۚۨۘۚۥۢۜۥۗۛۛۛۡۜۡۙۚۚ";
                    break;
                case 1758184772:
                    sb.append(File.separator);
                    str = "ۧۚۡۘۗۗۜۘۡ۫ۚ۬ۖۢۨ۟ۡۘۡ۫۟ۜ۟ۚ۫ۥۘ۫ۜۦۨۘۤ";
                    break;
                case 1786852806:
                    String str8 = "ۨۨۦۘ۠ۗۡۖۤۜ۬۬ۘۘۙۗۚۢۘۚۢۚۤۙۡۧ۠ۦۘۧۥۛ";
                    while (true) {
                        switch (str8.hashCode() ^ 904515623) {
                            case -2108225324:
                                str = "ۡۧ۠ۥۖۘۡۦۗۨۦۘ۫۟ۡۥ۫۬ۜۙۜ۟ۡۜۡۘۗۢۦۘۜۥۤۢۨ۫ۘۨۘۡۨۧۘۧۧۥۚۗۤۧ۫ۖۜ۬ۥ";
                                continue;
                            case -1463534009:
                                str8 = "۫ۢ۟ۛ۫۟ۨۨۗۧۜۜۘ۟ۖۘۢۧۖ۬ۨۜ۫ۗ۟ۡۜۜۘۚۚۦ۫ۥۢۧۢۜۘۢۙۦۘۢۤۙ";
                                break;
                            case -667414083:
                                str = "ۛۘۦۘۢۜۖۘۦۛۦۘۜۙۜۢ۫ۖۘۧۡۖۘۚۜۛۘۧۡۘۘۦۜ۬۟۬ۖۧۗۙۛ۫";
                                continue;
                            case 944708283:
                                String str9 = "ۖ۠ۥۦ۟۫ۗۘۥۖۚۗۜ۠ۘۛۖۖۛ۠ۗۦۡۧۘۤۢۦۘۗ۫ۜۘ۟۬ۘ۟ۢ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-1375536905)) {
                                        case -1125063072:
                                            str9 = "ۜۧۦۜۤۖۘ۫ۖۦۘۥۗۚۚۘۨۜۜۨ۫۬ۡۦۢۙۚۧۡ۬۠ۤۜۦۖۘۤۖۖۘۖۚۤۡ۟ۜۦۚ۬ۨۘ";
                                            break;
                                        case 400110922:
                                            str9 = i != 10000 ? "۫ۜۢۤۙۨ۬ۦۦ۬ۤۘۚ۬ۖۘۡ۬ۦۘۗۚۡ۫ۘۦ۫ۖۘۜۚ۠" : "ۢۤۨۗ۠ۦۖۥۥۘۘۡۡۘۦۡۢۡ۟ۛۛ۬ۧۛۧۗۛۖۜۘۖ۬ۖۜۧۡۘۘ۬ۜۜۡۧۗۡۚۗۢۦۘ";
                                            break;
                                        case 744217755:
                                            str8 = "ۤ۟۟ۗۥۗۧ۫ۘۦۛۜۘۨ۟ۜ۬ۦۖۜۛۨ۫ۜۥۘۚۢۜۘۨۛۨۛۜۡ۠ۥۜۙۛ۫ۧۙۙۡۗۡۜۨۚ";
                                            break;
                                        case 1284935386:
                                            str8 = "ۤ۫ۥۢۘۚۗۨ۫ۜۗۙۤۖ۠ۤۙۧۛ۟ۜۘۦ۬ۜۘ۠ۥۨۖۦۘ۫ۨ۬ۢۤ۬۠ۘۡۘۥۥۢۨۧ۠ۧۗۦ۠ۦۢۖۢۨۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1798171896:
                    super.onActivityResult(i, i2, intent);
                    str = "ۦ۬ۥۧۦ۠ۢۙۨۦۖ۠ۨۨ۬ۧ۫ۤۛۗۖۜۨ۬ۘۛۦ۫ۤۙ";
                    break;
            }
            return;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        String str = "ۦۥ۠ۤۜۖ۫ۦۨۘۙۜۘۘۘۡۙ۬۠ۢۥۘۖۘۙۥۖۢۢۗۢۦۨۘۖۨۡۘۖۧۤ۬ۛ۫ۘۡۛۦۥۧۜۧۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 161) ^ 587) ^ 595) ^ 1721202420) {
                case -1975126667:
                    this.ooOO.postDelayed(new OooOO0O(this), C1659a.f9130f);
                    str = "۠ۢۤۤۗۙۥۖۥ۫ۤۗۗۖۙ۠ۘ۠۫ۛۜۤۤۜۛۡۤۦۡۘ";
                    break;
                case -1467699718:
                    String str2 = "ۖۥۧۥۡۧۘۧ۠ۙۙۥۘۘ۟ۛۜ۬ۜۖۘ۟ۡۜۘۨۗۨ۬ۧ۠ۥۘ۫ۚ۠ۖۨۜ۫ۘۨۛۗۘۘۢۘۖ۟ۚۡۚ۠ۘۜۚۙ";
                    while (true) {
                        switch (str2.hashCode() ^ (-2139268168)) {
                            case -613805891:
                                String str3 = "ۧۛ۠۟ۗۡۘۚ۟ۦۖ۠ۤۖ۫ۚۥۤ۠ۡۧۘۢۚۖۙۡۥ۟ۧۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-98080948)) {
                                        case -2116657712:
                                            str2 = "ۘۢۗۗۙۤۘۤۡۘۥۡۘۨۗ۫ۚۢۗۨۨۘۨۚۤۥۢۦۘۡۧۗ۟ۦ۫۟۫ۖ۠ۖ۬ۦ۠ۥۛۙۦۘۤۡۜ";
                                            break;
                                        case -1156547037:
                                            str2 = "ۙۚۤۚۥۡ۬۠ۦۘۘ۠ۧۜ۟ۥۡ۟ۦ۫ۢ۟ۖۤۥۘ۬ۜۦۧۥۗ";
                                            break;
                                        case 902293450:
                                            str3 = "ۧۘۘ۬ۖۦۘ۟ۧۢۘۧ۫ۥۦۦۘ۟ۡۙۥۜۡۘۢۘۘۘۘ۫ۥۘ۠ۡۡۛۖۖۘ۠ۜۨ۟ۘۤۨۜۡۘۢۥۥۘ۠ۜۛ۠ۤۙۨ۫ۜ";
                                            break;
                                        case 1785688387:
                                            str3 = this.oo0o0Oo ? "۟۫۟ۢۚۨۘۘ۬ۢ۬ۨۧۢۛۙۘۢ۟ۖۢۚ۠ۥۨۜ۠ۥۘۤ۟ۚ" : "ۨ۟ۨۘۙۡۦۛۡ۟ۢۘ۫ۤۨ۬ۙۖۘۦۢ۟ۦۖۘۡۜۘۘ۫۠ۗ";
                                            break;
                                    }
                                }
                                break;
                            case 16343109:
                                str = "ۡۢۙۡۥۖۤ۠ۙۖۡۚۙۚۖۢۗۖۘ۠ۛۥ۬ۦۙ۬۬ۘۘۢۚۦۙ۟ۜۡۤۘۘۙۡ۟ۡۥۢۜ۟ۖۘۨۚۢۢ۫ۜۨۛۨۘ";
                                continue;
                            case 1167204248:
                                str2 = "ۡ۠ۖ۫۬۟۬۟۫ۧۧۧ۫ۥ۟۬ۘۥۖۥۨۛ۬ۜۗ۬ۧۜ۬ۨۡۖۢۤۨ۬";
                                break;
                            case 1665777883:
                                str = "ۥ۟ۥۤ۠ۢۙ۫ۙۜۦۙۖۤۦ۬ۗۨۛۤ۬ۖۘۢۛۤۥۘۚۧۥ۬۫ۨۦ۬ۘۘ۠ۦۧۥ۫۠ۤۗ۟ۡۖ۠ۧۧۧۡۢۘ";
                                continue;
                        }
                    }
                    break;
                case -1014541967:
                case 1947952230:
                    return;
                case -932713223:
                    str = "ۥۘۧ۟ۙۡۘۜ۫ۥۘۚ۟ۡۘۗۚۨۖۗۢۥۧۢۛۘۘۘۢۤۘۘۗۘۘ";
                    break;
                case -604238136:
                    o000oOoO();
                    str = "ۦۜۖۘ۫ۘۦ۠ۖۢ۫ۘۤۤۨۦ۠ۡۧۡۧۙۘۨۥۖۢۘۚۦۘۘۧۥ۫ۘۜۘۘۡۘۡۛۗۨۘۦۜ۟ۗۙۤۜۗۦۚۦۤ";
                    break;
                case -459409318:
                    C3753c5.OooO0Oo(getApplicationContext(), R.string.main_toast_exit);
                    str = "ۥۢ۠ۥۚۤۤۜۨۘ۬۠ۧۘۙۢۜۡۛۚۢۥۨۜۘۦۤۦۘۧۗۛۖۤ۬ۧۜ۫";
                    break;
                case -125349924:
                    C4454v3.OooO().OooO0oO();
                    str = "ۙۙۛۨۗۥۥۚۨۛۡۜۨۥۦۧۗۗ۫ۖۨۢۙۨۤۗۘۙ۫۠ۚۦۘۥۗۘ۫ۥۚۗۦۘ";
                    break;
                case 519042719:
                    String str4 = "ۤۤۦۚۖۨۘۘۦۧۘۨۘۚ۫۬ۤ۠ۘۛۤ۠ۤ۟ۥۚ۟ۥ۟ۧ۠ۧۥ۠ۤۡۘۦۡۧۘۢۜ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1384265585)) {
                            case -1072308248:
                                str = "ۖۚ۟ۦ۠۟۠۟ۘۦۧۡۘۙۦ۟۟ۦ۠ۛ۟ۢۦ۟ۢۦۦۨۘۚ۫ۚۖۨۘ۫ۨۜۘۨ۠۟ۙۘۢۡۙۙ۠۟";
                                continue;
                            case -694103622:
                                str4 = "ۚۗۘۘۥۦۘۘ۬۬ۥۚۥ۟ۗۥۦۘۖ۠۬۬۠ۦۘۙۙۗۥۗۡۘۦۢۥۘۛۚۘۙ۠ۡۘ۬۠ۗۛۘۥۜۜۖۗۨۜۤۙۦۛۢۘ";
                                break;
                            case -332666382:
                                str = "ۙۤ۫۬ۢۜۘۡۦ۠ۛۚ۟ۖۖۥۘۙۖۘۘۗۜۚۡۦۥۘۡۡۧۘ۟ۡۖۘۚۖۢۜ۫ۢۡ۬ۦۘۖ۠ۦۚ۟ۤۚۗۡۘ";
                                continue;
                            case 1304943011:
                                String str5 = "ۗۧۦۘ۬ۛۧۥ۠ۡ۟ۚۘ۫ۥۤۖ۫ۦۤۡۘ۠ۚ۫ۚۤۨۘۢۘ۫۫ۚۘۛۤ۠۠ۖۜۛۥۨۙۘۤۖۧ۠";
                                while (true) {
                                    switch (str5.hashCode() ^ 106506042) {
                                        case -1451136470:
                                            str4 = "۟۠ۥ۬ۧۖ۟۬ۚ۟۟ۦۗۚۖ۫۠ۜ۠ۤ۬۬ۘۙۜۦۦۦ۠ۙۜ۬ۜۘۖ۫۠۬ۚۘۢ۫ۖۛۖۜۢۛۨۘۜۢ۠ۡۢۘۘ";
                                            break;
                                        case -1388560869:
                                            str5 = C3977i7.OooO().OooOOO() ? "ۜۡۘۛۙۛۨۥۙ۟ۜۤۡۙ۬ۨۥۛۦۗۤۖۤۖۗۘ۠ۙ" : "ۨۙۛ۫ۢۜۥۦۨۘۦۤ۬ۙ۬۠ۥۨۢۢ۠ۙۤۤۙۚۡۚۤۖۜۙۧۦۘ۠ۗۗۚ۟ۡۘۗ۫ۗ";
                                            break;
                                        case -312267564:
                                            str5 = "ۤۙۨۢۦۦۗۘۥۘۧۖ۬ۦۦ۠ۗۧۤۘۧ۟ۙۘۜۧ۫ۧ۬۫ۧۘۛ۟۬ۘۖۘۢ۟ۢۨۥۡ۠ۜ۬ۜۘۘۙۦ۠ۛۜ۟";
                                            break;
                                        case 1999774714:
                                            str4 = "ۢۦۘۜۡۙۡ۟ۘۙۛ۠ۖۘۚۡۖ۠۟ۛۦۜۙۧۜۛۦۘۥۚ۠۫ۧۗۜ۫ۜۤۦۤۡۤ۬ۡۡۥۖۗ۟";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 969584497:
                    C3977i7.OooO().Oooo0o0();
                    str = "ۖۚ۟ۦ۠۟۠۟ۘۦۧۡۘۙۦ۟۟ۦ۠ۛ۟ۢۦ۟ۢۦۦۨۘۚ۫ۚۖۨۘ۫ۨۜۘۨ۠۟ۙۘۢۡۙۙ۠۟";
                    break;
                case 2046938317:
                    this.oo0o0Oo = true;
                    str = "ۢ۬ۘ۫ۙۨۘۡۘ۠ۗۗۤۚۜۨۦۦۡۘۗ۬ۙ۫۠ۙ۫ۜۥۘۡۘ۠ۧۢۡۛ۬ۙۙۤۦۘۙ۠۟ۜۤۛۗۡۘۘ۟۫۠ۧۦۗ";
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = 0;
        String str = "ۤۖۜ۫ۜ۬ۥۥۜۘۖۜۘۛ۠ۡۘۢۚۜۜۨۘۘۘۛۚۜ۠ۨۖۧ۟ۜۗۦ۠ۧۡۘ";
        ArrayList<NotifyMsgBean> arrayListOooOooO = null;
        Intent intent = null;
        Intent intent2 = null;
        Intent intent3 = null;
        while (true) {
            switch ((((str.hashCode() ^ 136) ^ 457) ^ 699) ^ 132156623) {
                case -2077056072:
                    str = "ۧۗۢ۬ۖۦۙۢۡۘۙۗ۟ۜ۫ۢۨ۬ۧۦ۫ۥۧۦۢۢۘۧۘۢۨۚۧۘۗۛ۠۟ۧ۫ۚۘ۬ۖۘ۠۠ۚۢۘۧۘ";
                    intent2 = intent;
                    continue;
                case -2019081366:
                case -929628393:
                    str = "۬۠ۡۘۢۥۧ۫۠ۘۧۙۥۤۡۘۘۧ۠ۨۘ۟ۧۨۥۦۡ۠ۛۥۦۢ۟";
                    continue;
                case -1825095611:
                    String str2 = "ۘۢۖۤۚۙۤۨۦۙ۫ۖۘۙۘۘۚۧۜۘۤ۠ۥۘ۟ۡۘۘ۬ۦۧۘۗۙ۬ۧۚ۠۬ۛۨۘۦۦۛۧۢۡ۠ۦۘۖۗ";
                    while (true) {
                        switch (str2.hashCode() ^ (-639431172)) {
                            case 171063352:
                                break;
                            case 403958053:
                                str = "ۖ۫ۡۘۧۧۧۧ۬ۧۗۡۦ۫ۙۥۛۙۘۘ۬۟ۡۘۦۙ۫ۧۜۡۘۥۡۖ";
                                break;
                            case 632394513:
                                str2 = "۫ۦۦۘۡۡۦۛۙۨۗ۬۫ۦۦۜۛۗۦ۠ۤۖۧۖۦ۠۬ۧۢ۫ۧۙۦۖۥۘ۬ۧۦۘ۫ۛۖۘ۫ۢۤۥۚۛ";
                                break;
                            case 1270596155:
                                String str3 = "۫ۜۥۗۜۨۘۡۛۧۡۗۙۡ۠۠ۨۢۘۡۢۙۤ۟ۚۧ۬ۡۘۢۚۧۜۚۚۛ۟ۘۘۙۤۙۧۥۜ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-108054956)) {
                                        case -1237156460:
                                            str3 = arrayListOooOooO != null ? "ۘۥۢ۟ۚ۟ۖ۠۠ۚۖۜۘۙۥۙۛ۠ۖۨۘۢۥۖۦ۟۬ۗۛ۫ۗ" : "ۨ۫ۦۘۢۨۙۛۗۖۦۧۨۘۡۘۡ۫ۤۦۖ۫۟ۦۡۚ۠ۢ۟ۡۤۛۛۦۚۡۙۘۘۧۚۖۘۜ۠ۧۖۤۛ۠ۥۗ";
                                            break;
                                        case 605346392:
                                            str2 = "ۗۚ۠ۡۡۦ۟ۡۡۘۜۗۗۘ۬ۡۘۡۚ۬ۖ۬ۜۥۘۘۙۚۦۘۧۗۘۘ۟ۦۡۨۖۢۘۢۖۦۧۧ";
                                            break;
                                        case 1705554519:
                                            str3 = "ۖۖۥ۬۠۫ۖۛۢۙۚۥۘۥۗ۬ۤۖۖۘۧۥ۟ۤۗ۫۫ۡۘ۫۬ۦۘۢۥۧۥ۠ۜۗۛ۟ۡۨۘۘۙ۠ۘۘۜۤۨۘ";
                                            break;
                                        case 2011309217:
                                            str2 = "۬۟۬ۧۧۜۦ۬ۘۘ۬۟ۛۦۙۡۘۚۜ۠ۡۖۨۗۦۦۘۧۨ۟ۛۜۧ۫ۥ۠ۨ۟۫ۨۜۘ۬ۘۦۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1795746965:
                    String str4 = "ۘۢۨ۫ۡ۫ۡۜۨۦۚۘ۫ۥ۫۫ۖۘ۬ۘۨۗۘ۬ۙۗۜ۟ۖۖۖۦۘ۠ۥۧۘۜۤۜۘۧۘۨۘۤۤۙ۬۟ۦۘۘۖۡۙ۠ۜۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1275933462)) {
                            case -1710744197:
                                String str5 = "ۦۛۘۙۗۛۖۛۦۗۖۜۘۙ۬ۤۧۜۘۘۛۧ۠ۖۖ۠ۗۢۨۙۚۗ۟ۘۘ۫ۘۜۘۡۥۨۘ۠ۢۛ۬۫ۧۢۧۨۥۤۙۨۥۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-280066051)) {
                                        case -942941962:
                                            str4 = "ۛۨ۟ۙۡۗۦۨۚۦۖۤۘۙ۫ۥ۟ۘۧۛۥۧۜۨۘۤۛ۫ۖۦ۫ۛۢ۫ۘۦۨۘۙ۫ۥۙۖۢۦۚۢ۫ۙۢۚۤۙۛۡ";
                                            break;
                                        case -227551137:
                                            str5 = id != R.id.id_img_setting ? "ۖۧۢۖ۫ۡۤۛۨۦۦ۫۟ۜ۟ۗۛۡۙۙ۠ۚۖۘۛۧۨۚ۠ۙ۫۬ۢۨۜ" : "ۖۧۗ۠ۘۦۡ۟ۨۘۨ۫ۖۜۖ۠ۨ۬ۜۘۧ۫ۦۘۘ۬ۚۗۢۜۗۚ۬ۗۨۜۦۥ";
                                            break;
                                        case -137125713:
                                            str5 = "۬ۙۗۖۨۦۘ۫ۖۤ۠ۥ۫ۚۥ۬ۧ۬۬ۢۡۘ۠۫ۘۘ۬۟ۦۘ۬ۧۚۜ۬ۡۜۨ۬ۜۙۚۘۛۦۘ";
                                            break;
                                        case 2079815409:
                                            str4 = "ۡۗۚ۬ۜۡۧۘ۫ۢۡۦۘۚۨۘۘۙۨۥ۠ۛ۟ۦۛۡۘ۬ۚۦ۫۬۠ۥ۬ۥ۬ۖۥۨۗۧ۟۫ۥۡۤۗ۟۫ۦۘۢۜۦۗ۬ۚ";
                                            break;
                                    }
                                }
                                break;
                            case -259116150:
                                str4 = "ۢۘۨۘۚۦۖۘ۟۠۫۬ۗۚ۫۠ۙۧۧۛۨۖۨ۬ۖۘۧۢۘۘۘۖۢۤ۫ۘۥۡۜۖۤۥۥۨۦۘ";
                                break;
                            case 827064466:
                                str = "ۛۖ۟ۛۗۦ۬ۙۘۘۘۖۜۘۨۚۢۢۜۘۘۤۦ۠ۢۜۘۢ۟ۘۜ۫ۖۘ۫۫ۨۘ۫ۚ۬۠ۢۗۘ۠۫ۧۚۘۙۛ۬ۚۥۤۚ۫ۘ";
                                continue;
                            case 1284098433:
                                str = "۟ۤۡۘۛ۠ۘۘۖۦۖۘۨ۬ۤۤ۟۟ۘۖۘۗۖۡۥ۠ۛۚۘۨۤۘۡۖۨ۟ۖۢۘ۠۟ۖۘۛۜۡۘ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case -1788493390:
                    str = "ۚۖ۬۬ۢۡ۠ۤۨۘ۫۟۫ۦۚ۠ۚۚ۬ۡ۠ۘۘ۬۫ۧۖۘۖۛۚۨۘۨۗۖ۠ۡۗ۠۠ۖۘۡۗۤ";
                    intent2 = intent3;
                    continue;
                case -1524643390:
                    intent.putParcelableArrayListExtra(C3902g6.OooO0OO, arrayListOooOooO);
                    str = "۟۫ۥ۫۟ۢۧۨۖۢۢۦۥۨۤۖۥۦ۟ۗ۫۟۬ۦۗۖۡۢ۫ۖ";
                    continue;
                case -1492142251:
                    str = "۠ۖۧۧۜ۬ۤۛ۠ۨۙۛۛۙۤۛ۬۫ۨۗۨۘۤ۟ۦۨۨۘۘۦۨۘۢۛۛ۟ۧۖۘۥۚۜۚ۠ۖۙۤۦۧۥ۟ۤۦۘ";
                    intent2 = intent;
                    continue;
                case -1411102102:
                    String str6 = "۟۬ۦۘۚۨۗ۫۟ۧۛۖۘۦۜۢۙۤۡ۬ۗۧۜۢۜۚۚ۟ۧۚۨۘ";
                    while (true) {
                        switch (str6.hashCode() ^ (-483155755)) {
                            case -2085501537:
                                String str7 = "ۗۤۖۥ۠۟ۘۡۢۤ۬ۡۘ۫ۖۦۥۨۦۘۜۨۡۘۗ۫ۜۘۜۦۖ۠ۧ۠ۙ۫ۦۘۘۡۜۢۢۤۡ۬ۚۗۥ۫۟۬ۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1224979012) {
                                        case -1745158847:
                                            str6 = "ۨۡۚۗۦۤۧ۬ۦۘۘ۬ۥۘۘۛۖۘۖ۠ۧۥۛۜۘۙ۟ۥۘۙۖۤۙۗ۬ۢۤۦۗ۫ۚۙۡۤۙ۟ۡۘ";
                                            break;
                                        case 1575868241:
                                            str7 = id != R.id.id_img_msg ? "ۘۜۖۤۧ۠ۜۛ۫ۖۨ۠ۖۗ۠ۤۜۦ۬ۥۡ۠ۥۘۨ۠۬ۚۦۨۘۘۡۘۘۥ۬۠ۢ۬ۥۢۘۘ۠۬ۨۥۧۡۦۦۘۦۨۨ" : "ۧ۫۫ۙۧ۬ۨۘۨۢۗۜۘۖۥ۫ۛ۬ۗۖۛۥۤ۬۬ۙۛ۠ۗۚۢ۬۬ۗۚ۬ۧ";
                                            break;
                                        case 1803018235:
                                            str7 = "ۨۤۤۘۘ۠ۨ۬ۥۥ۟ۥۡۗ۬ۦ۟ۢۦۗۜۚۛۥۘۢۥۘۚۡ۟ۦ۠۠ۦۙۚۗۙۥۙۚۛ";
                                            break;
                                        case 2014464347:
                                            str6 = "ۙۖۘۘ۟ۨۖۗ۬ۥۙۨۥۘ۟ۗۜۦۢۘۘۜۥۖۘۥۤۚۤۧۨۘۥۘ۟ۜ۬ۦۘ۫۟ۖۘۜۧۦ۟ۙۨۧۥۙ۠ۚ";
                                            break;
                                    }
                                }
                                break;
                            case -731253969:
                                str = "ۡۡۚ۫ۤۗۗۗۢۙۨۥۖۡۘۘۖۘ۠ۦۚۛۜۡۘۘۢ۫۫۫ۥۢ۬۟ۨۘۘ";
                                continue;
                            case -676659498:
                                str = "ۗۗۖۧۖ۟ۛۗۧ۬ۜۚۨۜۦ۫ۦۢۙۙۗۡۛۢۖ۫ۘ۟ۦۘۡۗۘۘۙۘۧۘۘۥۤۜۙۜۧ۠۠ۖ۠ۧ۠ۢۖۘۖ۟";
                                continue;
                                continue;
                            case -100417590:
                                str6 = "ۘۗۜ۬ۦۥۘۤۨ۟ۥۘۥۥۘۢۜۦۢۤۨۜۦ۫ۖۘۢ۫۟ۢۥۜۘۛۢۙۚۧۚۢۗۡ۟ۦۜ۟ۧۡ۠ۤۤۛ۟ۡۡۗۦۘ";
                                break;
                        }
                    }
                    break;
                case -1109844397:
                    str = "ۥ۟ۗۥۨۜۨۗۡۘۢ۫۠۬ۛۜۤۢۘۘۧۥۜۤۜۘۡۤۖۘۡۛۨۘ";
                    continue;
                case -715023479:
                    intent3 = new Intent(this, (Class<?>) SettingActivity.class);
                    str = "۟ۧۨۘۗۙۖۘۤ۬۬ۡ۠۟ۚۛۘۘۨۛۤ۟ۜۡۘ۟۠ۤۛۦۥۜ۠ۘۘ";
                    continue;
                case -368202318:
                    str = "ۤۚۖۤ۫ۖۘ۠ۛۥۧ۫ۢۡۜۡۘۦۨۥۘ۬۠ۦۖۥۢۢۚۖۘۤۜۘ۫ۖۗۛۢۧ۬ۗ۬۠ۤۤ۬ۡۛ۫ۘ";
                    id = view.getId();
                    continue;
                case -149076839:
                    break;
                case -144199609:
                    str = "ۜۥۜۙۜ۟ۢۤۘۡۖۘۤۛ۬۫ۖ۬ۧۖۡۚ۟ۖ۠ۘۚۘۛۤ۫ۡۥۘۤۖۜۘ";
                    intent = new Intent(this, (Class<?>) MessagePushActivity.class);
                    continue;
                case 66373602:
                    str = "ۚۗۥۦۛ۠ۦۗ۟۠ۦ۬ۚۧۙ۟ۢۖۨۧۦۗۡ۟ۡۘۦۘ۬ۖۖۘۡۦۤۙۥۘۘ";
                    continue;
                case 492398429:
                    return;
                case 1057741107:
                    str = "ۘ۟ۧۥ۟ۥ۠ۧۦۘۜۢۨۜۜۖۘۗ۟ۤۜ۠ۖۘۢ۠ۚۖۦۖۡۦۨۘۚۤۡۨۖۧۘۚ۬ۥۘۦۜ";
                    intent2 = intent;
                    continue;
                case 1098334485:
                    String str8 = "ۥۙۖۘۖۢۡۨۥۘۘۥ۬۬ۢۗۜۘۘۙۥۛۘۜۘ۟۠ۙۙۗۙ۫ۘۤۥۡۤ۬۫ۧۦۨۜۖۨ۬ۗ۫";
                    while (true) {
                        switch (str8.hashCode() ^ (-290819410)) {
                            case -1618009601:
                                str8 = "ۜۨۥۘۦۛۥۡۜۜۦ۠ۖۘۖۘۚۛۙۨۖۘۨۘۢ۟ۖۛۚۦۘۙۨۢ";
                                break;
                            case -1491826101:
                                break;
                            case -452991765:
                                String str9 = "۬ۛۘۘۛۢ۬ۧۜۜۘۦۤ۬۠ۨۦۖۖۖۘۘۛۨۘۥۥۘۘۖۤ۟ۖۙۨۘۨ۫ۖۧۘۛۚۖۜ۫ۗۧۡۘۘۘۥۗۖۦۢۡۧۘ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-2098558501)) {
                                        case -873672347:
                                            str8 = "ۗۘۙ۫۫ۦۤۦ۬۬ۦۜۘۡۧ۬۟۫ۘۘۖۜۥۖۘۦۗ۠۟ۚۙۘۧۛۥۘۙۧۥۘۥۧ۫ۢ۟ۨۘۘۨۛ۟ۢۡۘ۬ۥۡ۬ۨۘۘ";
                                            break;
                                        case -536734387:
                                            str9 = "۠ۧۚۛۡۘۡ۠ۤۤۤ۬ۚۦۦۤۜۘۘ۫ۨۘ۬ۗۡۨۡۘ۠۠ۡۘ";
                                            break;
                                        case 146567636:
                                            str8 = "ۦۦ۬ۙۦۦۘ۟ۛۜۘۗۡۥۜۙۨ۠۟ۧۤ۟ۛۛۖۦۘ۟ۥۙۛۚۖۥۨۗۥ۠ۚۖ۫ۙۦۙۤۛۨۘۚۘۛۧۘ۠ۦۢۖ";
                                            break;
                                        case 286104232:
                                            str9 = arrayListOooOooO.size() > 0 ? "۬ۙۡۡۢۨۘۖ۬ۘۦۘۧ۬ۖۜۦۨۧۘ۬ۜۧۘۤۦ۬ۦۙ۟ۛۗ۬ۛۡۘۖ۠ۜۘۘۦۧ۠ۛ۠ۗۦۘۙۚۨۘ" : "ۦۖۜۘ۫ۛۛۚۜۖ۬ۦۢ۟ۥۧۘ۠ۥۨۘ۫ۜۡۘۥۘ۫۬ۙۥۘۚ۠ۜۘۧۘۜۘۧۜۘۡۥۢۗۜۥۘۧۢۤۤۧۗ";
                                            break;
                                    }
                                }
                                break;
                            case -309036489:
                                str = "ۖۘۘۘۢۡ۫ۘۗۚۛۥۘۦۗۗۖۨۥ۠ۘۚۧۢ۫ۡۧ۟ۜ۠ۦۘۢۤۘ۠ۖۖۘ";
                                break;
                        }
                    }
                    break;
                case 1693921838:
                    startActivity(intent2);
                    str = "ۧۥۢ۠ۡۧۘۦۤۗۗۡ۠ۤ۫ۡۘۤۤۢۡۗ۬۬ۢۗۘۖۘۘۤۤۥۚۚۖۜۜۦۚۦۘ۠۠ۗۙۨۛۖۙ۫ۙۡۘۤۖۢ";
                    continue;
                case 1718816802:
                    arrayListOooOooO = ((C4091la) this.OooooO0).OooOooO();
                    str = "ۘۖ۠ۛۥۖۛۙۦۜ۬ۜۘۚۥۛۘۖ۬ۘۧۨ۠ۜۘ۬ۥ۬۫ۥۦۖۘۘۘۜۧۗ";
                    continue;
                case 2004777867:
                    this.o00Ooo.setVisibility(4);
                    str = "ۨۛۖۧ۬ۨۜۜۘۦۡۦۘۚ۠ۘۘۨۗۢ۠۟ۥۘۛۚۛۛۙۤ۫۬ۜۘ۠ۢۗ۬ۢۥۢۧ۟ۤۛۘۘ۬ۨۡۘۡ۟ۡۘۨۦۤ۫ۜ۫";
                    continue;
            }
            str = "ۚۖ۬۬ۢۡ۠ۤۨۘ۫۟۫ۦۚ۠ۚۚ۬ۡ۠ۘۘ۬۫ۧۖۘۖۛۚۨۘۨۗۖ۠ۡۗ۠۠ۖۘۡۗۤ";
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity, com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "۠۠ۜۜۨ۫ۥۤ۠۟ۥ۫۟ۜ۠۬ۥۡۘۙ۬ۘۘۦۚۥۤۡۘۚۜۚۖۤۘۘۗ۬ۡۛۛۦۘۚۨ۠ۚ۠ۥۘ۫ۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 184) ^ 963) ^ 564) ^ 1385003299) {
                case -1956841071:
                    str = "۠ۧ۟ۨۧۦ۟ۚۗۤۘ۬ۧ۟۠ۧۖۜۘۚۚۦ۫ۧۤۚۚۢۖۦۥۘۨۦۖۘ۫ۤۖۘۜۤۦۤۤۡ";
                    break;
                case -1479114694:
                    super.onCreate(bundle);
                    str = "ۦۛۨۘۙۚۜۘۗۛ۬ۡ۠ۨۘۛۘۘۘۢۘ۫ۥۥۤۢۖۥۘۦۢۘ۬ۚۡۘۦۢۙۡ۬ۤ";
                    break;
                case -11880473:
                    initListener();
                    str = "ۛۢۘۡۙ۟ۡ۠ۗۢۜۖۗۧۨۘۨۤۜۘ۟ۤ۟۬ۚۚۤ۠ۛۦ۬ۨۙۛۛۨۡۧۥۘۛۢۗۘۘ";
                    break;
                case 642972049:
                    return;
                case 1062191829:
                    str = "۫ۨۘۤۨۤۢۤۖۤۡۘۘۖۜۗۨ۟۠ۢ۫ۧ۠ۖ۬ۜۡۡۘۜۨۚ";
                    break;
                case 1196426733:
                    Ooooo00();
                    str = "ۙ۟۫ۘۧ۟ۥۤۖۘۛۚۜۘۤۜۘۘۗۖۛۘۥۖۨۥۜۘ۠ۘۛۥۜۗۜۚۗۘۜۘ";
                    break;
                case 2123672761:
                    Ooooo0o();
                    str = "ۚۥۧۘۢۧۥ۟ۡۘۘۢۜۘۘۦۦۦۛۜۘۘۢۧۚۚۧۧۜۘۜ۟ۜ۠ۨۢ۫ۛۤ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۙۦۜۘۢۢۘۘۢۧۥۘۘ۬ۢۖۙۗۧ۫ۧۢۨۧۘۡۖۥۢۛۡۦۤۗۤ۬۬۠ۘ۟";
        while (true) {
            switch ((((str.hashCode() ^ 282) ^ 980) ^ 444) ^ 584943651) {
                case -1975134502:
                    AppContext.OooO00o().Ooooo00 = false;
                    str = "ۥ۬ۙۜۜ۠ۥۥۘۘۦۤۨۛۙۙۖ۠ۖۘۜۜۜۘۘۢۥۥ۠۬ۛۚۡ۫۬ۖۤ۟ۖۘ";
                    break;
                case -1814202769:
                    AppContext.OooO00o().Ooooo0o = false;
                    str = "ۨۤۘۖ۠ۜۘ۬ۦۙۚۖۜۘۘۖۘۖۘ۟ۜۛ۬ۜۨۨۘۜۤۧۦۗۙ";
                    break;
                case -1808241099:
                    this.oo000o = false;
                    str = "ۙ۬۟ۛۧۜۤ۠۠ۗ۠ۢ۬ۚۢۙ۬ۥۘ۟۬۬۬ۗۜۘۧۘۥۘۘ۬ۖۤ۟ۗۦۧۘ";
                    break;
                case -1587911744:
                    str = "ۤ۠ۨۘۚۘۘ۠ۨۙۛۧۨۘۚ۟۬۬ۖۥۦ۟ۜۘۜ۠ۜۘ۟ۢ۫ۨۢۦ";
                    break;
                case -1498663459:
                    super.onDestroy();
                    str = "ۧۜۧۘ۬ۘۨۘۘۨ۠ۘۛۦۖ۫ۘۛۙۛۤ۠ۖۘۚ۠ۖۘۛۤۘۡ۫ۛۗۚۖۘۧۢ۟ۥۙۜۚۤۚ";
                    break;
                case -1127888059:
                    AppContext.OooO00o().OoooOoo = false;
                    str = "ۦۤۨۥۛۦۙۦۤۘ۟ۙۥ۠ۥۘۢۙۤۢۖ۫ۛۧۗ۠ۗ۬ۦۘۛۜۤۘۘۘۡۜ۟ۨۨۙۚۖۘۢۨۧۨۘۤ۫۫۟ۡۛۖۘ";
                    break;
                case -988050388:
                    C4125m7.OooO0o0().OooO0O0();
                    str = "ۢ۠ۦۘۖ۬ۙۢۢۘۦۨۡۢۙ۫۬۫ۢۥۚۦ۬ۧۖۧۜ۟ۛۦۥ۫ۛ۫ۖۥۧۦۥۤۦ۠ۗ۠ۨ۬ۨۜۘۙۖۧۘۛۘ";
                    break;
                case -767999372:
                    this.o0OOO0o.OooO0o();
                    str = "ۖۙۚۗۧۥۡۧۨۚۘۖۘۢۢۘۘۤۜۚۧۜۜۖۡۦۘ۠ۜۥۤۚۗ";
                    break;
                case -287611263:
                    this.ooOO.removeCallbacksAndMessages(null);
                    str = "۟۟ۖۢ۠ۦۘۚۦۛۜۙۖۘۦۖۚۤ۫ۦ۟ۛۥۧۗۙ۟ۘۤ۟ۢۥۘ";
                    break;
                case 740054155:
                    C4310r7.OooO0o().OooO0oo(this);
                    str = "۠۟ۥۘۛۘۛۚ۬ۤۡۥۘۤ۟ۤۖ۬۬ۜ۬ۨۨۘ۠ۜۙۧۚۖۥۘ";
                    break;
                case 1250892570:
                    return;
                case 1298153458:
                    C3765ch.OooOO0O();
                    str = "ۧ۬ۡۡۜ۟ۨۘۜۨ۟ۘۜ۠ۖۘۖۤۘۙۤۖ۬۬ۛ۠ۚۡۘۘۨۖۘۚۨۘۘۖۤۛ";
                    break;
                case 1441567063:
                    BootDexManager.OooO0OO().OooOO0();
                    str = "۬۫ۜۘۚۘۤۙۤۥۥۥۘۚۡۖۙۧۘۚۤۜۘۖ۫۠ۘ۫ۖۗ۫ۗۛ۫ۗۖۤ۟";
                    break;
                case 1938410082:
                    j10.OooO0o().OooOoO0(this);
                    str = "ۛۜ۟ۦ۟ۢ۟ۘۚ۟ۡۘۘ۠۟۬۟ۙۘۥۜۘۨۡۘۡۤ۟ۛۥۘ۫ۛۖۘۖۧۨۘۗۡۥۧۚۜۧۦ۬ۧۛۙ۬ۙۦۦۡ۟";
                    break;
                case 1948011836:
                    C4050k6.OooO0Oo().OooO0O0();
                    str = "ۚۦ۬ۤۥۜۜ۫ۖۘۗۦۡۘۜۢۦۚۗۡۘۤ۫ۨۧۗۥۘۧ۫ۚۧۚۢ۟۬ۖۘۤۜۗۨۘۘۢۛۗۙۦۦۘۛ۫ۡ۬ۥۡۘ۟۬ۗ";
                    break;
            }
        }
    }

    @p10(threadMode = ThreadMode.MAIN)
    public void onMessageMainThread(MsgItem msgItem) {
        int msgType = 0;
        String str = "ۨۨۦۘ۟ۤۛۗۘۖ۫۫ۖ۬ۢۥۘۧۡۧۘ۟۫۬ۡ۬ۦۨۙۛۧ۫ۦۥۨ۬ۦۖۨۘۜۚۤۧۤۨۧۛۜۘۛۛۡ";
        while (true) {
            switch ((((str.hashCode() ^ 446) ^ 359) ^ 67) ^ (-52423421)) {
                case -2121277765:
                    return;
                case -1289532028:
                    str = "ۘۢۗۤۢ۫ۧۘ۬۟ۨۘۨۙۥۜۧۘ۬ۧۖۦ۫ۢۥۡۨۘۛۘۙ";
                    break;
                case -856657003:
                case 1756854584:
                    str = "ۗۡۥۘۚۛۖ۬ۨۧۘ۟ۨ۠۠ۚ۫ۜ۫ۗۨۜ۠ۜۜ۠۫ۘۨۘۧۢۘۤۥۧۗۜۚۗۙ۫ۗۦۜۘ";
                    break;
                case -506953189:
                    String str2 = "ۜ۟ۜۘۚۨۦۧۡۘۡۛۢۖۖۘۥۖۜۘ۬۫ۦۢۦۜۘۦۘ۟ۡۛۡ۠ۡ۠۠ۙۡۨۤۙۜ۟ۢۚ۬ۘۨۖۚۧ۠ۥۘۨ";
                    while (true) {
                        switch (str2.hashCode() ^ 580029890) {
                            case -1532740864:
                                str = "ۜۨۢۙۢۢ۠ۦۡۦۚۢۨۤۡ۫ۥ۠ۛ۟ۚ۠ۛۘۗۖۤۢۚۡۘۢۚۘ۠ۧ۫۫ۖۦۦ۫ۦ";
                                continue;
                            case -984323922:
                                String str3 = "ۗۛۗ۠ۙۨۘۥۖۚۖۙۘۘ۠ۨۥۘۙ۬ۧۤ۬ۧۨۨ۟ۛۦۦ۬۬ۛۦۧۘۥۗۘ۠ۖۤۗۜۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1023194759) {
                                        case -1098685259:
                                            str3 = msgType != 1001 ? "ۧۡۤۗۙۦۙۘۨۘۨۗۘ۠ۚ۠ۙۥۘۢ۬ۚ۠ۙۛۥ۬۠ۥۙ۟ۧ۫ۥۘۤۘۜۖۗۨۜۥۜۘ۫۬ۤۚ۬ۨۘ" : "ۥۡۜۜ۠ۛ۫ۖۨۘ۬ۘۗ۟ۥۗۦۧ۟۫۟ۛۗۢۖۦۗۥۤ۫ۡۡ۫ۨۘۘ۟ۧۗ۬ۘۖۨۘۘۚۖۦۖۨۘ";
                                            break;
                                        case -866090553:
                                            str3 = "۟۠ۗۢ۫ۜۘۥۚۥۘۧۡۙۡۥۘ۠ۨۜۧۦۛ۫ۗۨۘۡ۬ۦۘۧۜۥۘ";
                                            break;
                                        case 384705382:
                                            str2 = "ۧۛۚۚۨۦۘۦۧۥۘۤۜۘۘ۠ۨۡۘۚۗۨۘۗ۟۠ۥۤۘۘ۫۠ۚۥۘۜۛۨۡۘ۠ۧۨۘ";
                                            break;
                                        case 844738012:
                                            str2 = "ۨۢۨۘۗۡۘۜۖ۫ۘ۬ۢۢ۬۠۬ۦ۟ۛۨۘۥۥۨۘ۬ۙۥۘ۠ۚۧ";
                                            break;
                                    }
                                }
                                break;
                            case -938762476:
                                str = "۠ۥۤۚۘۥۡۙۘۢۡۤۨۚۦۘۛ۫ۘۦۚۜۘۜۘۦ۟ۖۗۢۖ۬";
                                continue;
                            case -717758246:
                                str2 = "ۧۖ۬ۗۖ۟ۖۨ۫ۢۡۚۛۘۘۧۚۡۘ۠ۧ۬ۤۜۨۧۤۖۧ۟ۨۘ";
                                break;
                        }
                    }
                    break;
                case 660900373:
                    ((C4091la) this.OooooO0).OooOoOO();
                    str = "ۛۘۨۘۢۧۜۤۗۗۘ۫۫ۙ۫ۗۡۛۥ۫ۘ۫ۗۜۥۛ۟ۨۘ۠۠ۛ";
                    break;
                case 954003289:
                    this.o00Ooo.setVisibility(4);
                    str = "ۗۡۥۘۚۛۖ۬ۨۧۘ۟ۨ۠۠ۚ۫ۜ۫ۗۨۜ۠ۜۜ۠۫ۘۨۘۧۢۘۤۥۧۗۜۚۗۙ۫ۗۦۜۘ";
                    break;
                case 1144699266:
                    String str4 = "ۜۖۖۤۜ۠۟ۜۨۘ۟ۙۦۘ۟ۤۨ۫ۤۨ۫ۧۢۙۜۧۤۨۗۗ۟ۜۘۗۙۛۘۗۨۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-466800914)) {
                            case -1237155748:
                                str4 = "ۘۜۘۥۛۦۤۥۥۘۚۚۗۙۛۨۧۙۗ۬ۛۥۘۙۧۗۢۨۘ۫۫ۖۛ۟ۜۘ۟۠۟ۦ۟۬۬ۧۘ۠ۚۨۘۡۦۖۘ";
                                break;
                            case -115921638:
                                str = "ۨۡ۬ۦۢۨۛۖۡۘۗۥۛۖۢۢ۫ۤۨۘ۬ۤۤ۫ۛۚۤۢۦۥ۠ۨۛ۬ۘۛ۟ۜ۠۫ۡۘ۬۠۬۠ۡۜۗۚۥۘ";
                                continue;
                            case 63699816:
                                str = "۬ۛۖۥۧۥ۟۫ۛۘۥۘۙۤۥۡ۬ۖۧۖۛۚۨۘۖۦ۟۬۟ۦۘۡۨ۠ۡۡۘ";
                                continue;
                            case 1308098414:
                                String str5 = "ۨۗۢۨۤۖۧ۟۟ۘۛۦۖۨ۟ۜ۟۬ۖۗۦۜۚۡۘۛۧۘۚۥۚۙ۬ۨۘۚۨ۠۬ۜۦۘۖ۬ۦۘ۟۫ۥۧ۟ۦ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1466645165) {
                                        case -1007542110:
                                            str4 = "۟ۘ۟ۘۨۤۢۛۦۘۖ۟ۖۘۤ۫ۧۖۘۧۘۥ۟۫ۧۥۜۘ۬۟ۡۥۨ۫ۢۤۦۘۤ۬ۘۘ";
                                            break;
                                        case -500731005:
                                            str4 = "ۤۚۦۥۧۜ۟۟۠ۦ۬۟ۜۘۤۨۤۥ۟۫ۡۘۙۙ۠ۥۨ۬ۚۦۜۘۤۨۘۘۤۗۚۗۘۖۘۘۦۢ";
                                            break;
                                        case 376787965:
                                            str5 = msgType != 1003 ? "ۖۜۡۘۥ۠ۘ۠ۧۙۧۜۛۨۧۦۘۢۢۧۘۗۗ۬۫۟ۗۚۢۗۛۚ۠ۘۨۖۦۘۡۗۧۦۖۤ" : "ۘۢۖۙۧۛۛۖۥ۟ۙۙۖۢۡۘۥۡۜ۠۬ۨۘۦۙۛۡۡ۬ۦ۬ۨۘۚۚۡۘۨۨ۠ۜۦۧۘۥۦۧۚۖۙۢ۟ۜۗۥ۫ۦۖۚ";
                                            break;
                                        case 667863089:
                                            str5 = "۫ۜۥ۠ۗۦۘۡۖۢۙۖ۟۬ۥۘ۠ۡۥۘۜۗۗۥ۫۬۫ۙۥۘۙۜۦۘ۟ۦ۠۠ۗۘۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1420281430:
                    str = "ۡۧۢ۠ۜ۫ۡۧۘۨ۫ۢۢۦ۬ۗۨۢ۬ۤۦۖۚۡۘۦۜۘۜ۠ۧۖۢ۫ۧۤۤ۠ۤۙ۬ۥۙۚۛۧ۬ۗۨۘۨ۟ۖۘۥۡ۟";
                    break;
                case 1711971160:
                    msgType = msgItem.getMsgType();
                    str = "ۤ۟ۙۡۛۗۡۛۛۘۗۖۘۚۛۖۘۡ۫ۗۘۗۥۜ۫ۧۨۥۨۚ۟ۥۘ۟ۤۥۘۨۖۘۘۤ۟ۚۙۢۜۘۖۥ۬ۖۜ۠ۡۖۨۖۖۤ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        ViewOnClickListenerC3684aa viewOnClickListenerC3684aa = null;
        String str = "۬ۤ۬ۛۛۥ۠ۗۧ۟ۦۨۛۗۡۘۖۜۘۘۢ۫۟ۗۖۨۘۤۦۘ۟ۡۢۦۤۛ۫ۡۨۘۗۤۡۡ۫ۘۧۡۖۘ۠ۨۘۜۦۢۦۨۤ";
        while (true) {
            switch ((((str.hashCode() ^ 754) ^ 592) ^ 363) ^ (-1803569126)) {
                case -1888965493:
                    super.onNewIntent(intent);
                    str = "۬ۘۚۤ۫ۛۖۢۨۘ۠ۢۨۦۜۘۧ۟۠ۤۙ۬ۛۗۡۘۖۗۚۚۖۤۤۜۘ۬ۦ۬ۙۧ۟ۨۖۘۧۗۥۘۢۧ۟ۥۖۡۘۧ۠ۚ";
                    continue;
                case -1412720834:
                    String str2 = "ۚۡۡۘ۫۠ۥۡ۟ۖۘ۟ۧ۟ۥۘۘۘۧۢۘۘۡۧ۟۠ۚۥۘۥۚ۟ۘۦۥۘۡۤ۟ۗۨۥۘۢۖۧۘۜۖۡۘۚ۟ۢۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 1463274570) {
                            case -1642944053:
                                str2 = "۫ۥ۬ۜۥۨۘۧ۟ۨۘۙ۫ۥۘۚ۟ۛۡۨۢ۟ۙۨۤ۠ۤۨۖۗ۠ۘۨۦ۫۫ۨۥۘۖۢۗ۫ۜۗ";
                                break;
                            case -618221393:
                                str = "ۢ۠ۛۜ۟ۜۜۛۘ۟ۥۧۘۛۜۧۢۥۡۨ۟۠ۗۤۨۛۤۖۘۚۚ۟ۘۘ۠ۗۧۦ";
                                continue;
                            case 1346215396:
                                str = "ۛۥۚۗۙۘ۠۫ۡۘۧۧ۬ۜ۬ۨۘۧۢۗ۠ۜۛۧۛۦۜۨۚۖ۫ۥۘۙ۟ۥۢ۟ۜ";
                                continue;
                                continue;
                            case 1892892791:
                                String str3 = "ۡۛ۟ۗۨۡۙۨۘۘ۠ۛۧۨ۠ۤۘۘۥۘۧۗۖۘ۫۫ۜۘۥۖۤۡۨۦ۬۬ۖ۠ۢ۠ۢۡۙۡۧۥۤۖۘ۫ۢۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1491017983) {
                                        case -11298419:
                                            str3 = "ۥ۫ۜۜۢ۬ۘۧ۠ۡۙۢۚۚۙۖۗۨۤۗۛۚ۬ۧ۠ۗ۬۫ۚ۫ۙ۠۠ۛۙۨ۫ۤۦۘۚۦۡۢۤۙۘ۬ۜ";
                                            break;
                                        case 1728591938:
                                            str2 = "ۥۨۘۘۜۚۤ۬۫ۦۘۨۖۧۘۚۨۥۘۤۢۙۥۧ۟ۦ۬ۘۧۛۥۘۥۨۧۘ۫ۤۡۘ۟۫۠ۛ۫ۢۤۨۘۘۢۥۚۙۛۘۘۖ۠ۚۧۦۤ";
                                            break;
                                        case 1967144928:
                                            str2 = "ۗ۬۬۬ۜۘۛ۫ۚۦۙۙۗۖۖۘۡۙ۬ۥۘۖۘۢۥۛۢۦۥ۟ۛۗۥۦۘۨۗۦۘ";
                                            break;
                                        case 2060719615:
                                            str3 = viewOnClickListenerC3684aa != null ? "ۗۙۥۘ۟۬ۖ۠ۥۥۘۥۖۥۧۖۤۘۚ۫ۚۡۘۦ۠ۡۢ۫۟ۜۚۛۦۘۘۥ۠ۚ" : "ۧۙ۟ۖ۟ۨ۟ۨ۬ۢۙۚۨ۟ۧ۬ۙ۟ۙۧۧۥۥۘۢۗۥۦۢۚۘۘۚۜ۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1410865544:
                    String str4 = "ۗ۟ۦ۟ۢۗۤ۠ۖۨۘۛۥۢۧۙۜۘۡۨۚ۠ۘۘۦۡۘۘۨۜۜۛۨۘ۠ۖۤۛۖۘۘۛۧۚ";
                    while (true) {
                        switch (str4.hashCode() ^ (-933623543)) {
                            case -690773294:
                                str4 = "ۜ۬ۨۘۘۛۥۘۗۦۘۘ۟۠ۗ۠ۡۘۘۖ۬ۨۙ۟ۜۘۜۜۜۢۡۥۢ۬ۘۘ";
                                break;
                            case 371184127:
                                str = "ۢ۠ۛۜ۟ۜۜۛۘ۟ۥۧۘۛۜۧۢۥۡۨ۟۠ۗۤۨۛۤۖۘۚۚ۟ۘۘ۠ۗۧۦ";
                                break;
                            case 726354411:
                                String str5 = "ۨۛۚۤ۠ۘۘۥۦۥ۠۠ۗۚۡ۫۟۫ۡۢۤۢۗۜۧۙ۫ۙۖۤۗۛۥۖۤۥۘۦۘۡ۬ۜ۬ۖۛۤۨۢۜۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 792854701) {
                                        case -1983267447:
                                            str4 = "ۗۡۡۘۙۖۜۘۚۥۜۘ۠ۖۤۥۚۜۨۚۤۘۙۖۘۦۢۚ۫ۛۨ۬ۨۧۗ۫ۙۧۘ۫";
                                            break;
                                        case -977701409:
                                            str5 = !viewOnClickListenerC3684aa.isShowing() ? "ۙۦۖ۬۟ۗۧۗۚۥۘۘۘۦ۫ۖۦۤۤۗ۫ۗۦۙۙ۠ۜۨۘۤ۫ۧ۠ۢ۠ۖ۬ۛۨۙۦۖ۬" : "۬ۚ۟ۢۤۧۥ۫ۘۤۦۘۨۛ۠ۥ۫۫ۘۥۤۗۗۦۘۥ۠ۘۘۥۧۚ";
                                            break;
                                        case 609545383:
                                            str5 = "ۨۤۢۛۖۛۡۘ۫ۚۜۥ۫ۗ۠ۥۥۘۨۦۦۛۤۢۡۘۗۦۜۥ";
                                            break;
                                        case 625490528:
                                            str4 = "ۨۛ۫۬ۙۨ۬ۡۢۖۖۘ۫۫ۗ۫ۚ۫۫ۧۧۢ۟ۧۙ۠ۦۘۨ۠ۦۖۡۧۘۚ۬۬";
                                            break;
                                    }
                                }
                                break;
                            case 1785654434:
                                break;
                        }
                    }
                    break;
                case -1028462374:
                    viewOnClickListenerC3684aa = this.o0Oo0oo;
                    str = "ۙۙۜۘ۟۬ۛۤۗۙ۬ۡۗ۟۬۠۟ۛۗۦ۟ۗۗۥۥۡۖۦۘۚ۠ۨۦۤۦۜۢۙۙۙۖۚۖۘۘۥ۬ۖۘ۫ۧۡۘۦۖۖۦۨۜۘ";
                    continue;
                case -1024196666:
                    str = "۟ۨۨۘۡ۟۬ۖۧۛۢۗ۫ۖۢۘۖ۫ۗۢ۠ۘۛۡۘۖۥۦۥ۫ۚ۬ۡۘۗۜۗ۠۫ۖۤ۫ۤۙۢۗۘۥ۠ۡۧۘۘۘ۠ۨۘ";
                    continue;
                case -850993906:
                    String str6 = "ۜۥۙ۫ۘۧۘ۟۠۟ۚۖۢۛ۫۟ۢۖۘ۠ۥۙۘۖ۬۟ۜۡۘۗۚ۫";
                    while (true) {
                        switch (str6.hashCode() ^ 958922297) {
                            case -371309290:
                                String str7 = "ۡۥۥ۟ۢۦ۟ۥۦۖۦۘۧۖۗۗۧ۟ۧۛۛ۫ۨۡۘۖۚۦۢۗۗ۠ۨۜ۬ۥۦۘۨۘۤۜۙ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1256312782)) {
                                        case -663874057:
                                            str6 = "ۜۙۤ۠ۤۛ۟ۚۨۘۖۡ۬ۘۛۖۘ۬ۘۡۘ۟ۗۖۘۗۖۜۘۥۧۘۦۙۚۚۜۥۘ۠ۤۚ";
                                            break;
                                        case -565883292:
                                            str6 = "ۧ۠ۦۧۡۖۘۨ۠ۡ۬ۖۤ۠ۙ۬ۦۛۦۚۗۙۢۦۖۚ۠ۡۢۦۜ۠۬ۖۘۙۡۗ۫ۖۘۡۗ۟";
                                            break;
                                        case 205163022:
                                            str7 = intent.getExtras().getBoolean("needUpdate", false) ? "ۙۥ۟ۧۘۦۘۚۚۜۘۥۤۦۖ۬ۡۡۘۜۤۢۚۜۡۘۧ۫ۛۥ۟ۤۖۨۢۨۗۨۘۧۙۢۡ۫۫ۤۨۧۘۖ۫۠" : "ۖۦۦۥۗۗ۟ۥۡۤۛۥۦۥۥۘۦۡۥۘۧۚۜۘۗۦۢۙ۟ۥۘۧۖۖۘۘۚۜۨۨۡۘ";
                                            break;
                                        case 273884349:
                                            str7 = "ۘۜۦۢۗۤۧ۬ۨۤۦۘۘۛ۫ۗ۫ۚۘۛ۟ۤ۟ۧۚۘ۟ۦۘۦۘۧۘۡۨۧۚۢۖ";
                                            break;
                                    }
                                }
                                break;
                            case 1103676756:
                                break;
                            case 1398165484:
                                str = "ۘۖۤۤۘۜۗۙۢۛۡۖۨۖۘ۫ۗ۬ۚۧۛۙۙۦۘۚۛۖۡۙۢۜۛ۬۠ۡۜۚ۬ۜۘۤۛۢۜۦۛۛۧۤ";
                                break;
                            case 1462754635:
                                str6 = "ۦ۠ۘۨۛۜ۫ۨۡۧۘۗۦۘۘۢ۟ۡۘۛۙ۫ۧ۬۟ۗۖۖۘۥۨ۬ۗۚۜۘۜ۟۫ۙۥۨۘۡۦۤۗۤۜۘۧۥۖۥۜۧۘۨ۠ۜ";
                                break;
                        }
                    }
                    break;
                case 829315711:
                    ((C4091la) this.OooooO0).OoooO00();
                    str = "ۜۦ۠ۥۧۜۘ۠۠ۘ۫ۚۜۘۜۧۖۘۘۧۦۘۖۖ۬ۧ۫ۜۖۨۜۦۙۡ";
                    continue;
                case 1522106895:
                    String str8 = "ۛۦۚ۟ۧۡۘۘۜۜ۫ۤۘۥۨۖۢ۟ۘ۟ۛ۫ۗۘۜۘۘۜۗ۟۠ۙۥۘ۬ۙۜۘۨۖۙۗۥۧۥۖۡۥۖ";
                    while (true) {
                        switch (str8.hashCode() ^ (-1787508663)) {
                            case -1496436854:
                                String str9 = "ۤۙۦۘ۠ۤ۫ۤۖۚۘ۟ۤ۠۫ۙ۫ۦۘۚۡۜۘۡۚۖۘۛ۠ۤۤۘۘ";
                                while (true) {
                                    switch (str9.hashCode() ^ 421993176) {
                                        case 268966332:
                                            str8 = "ۜۘۤۛ۟ۜ۟ۨۜۘۡۗۦۘۤ۬ۥۘۥۙۦۘ۠ۨۧ۬ۢۖۙۦۘۢ۟ۘ۬ۨۘۦۡ۟۬۫ۛۢۚۜۘۛۤۖۥۚۡۧۘۧۢ۟ۘۘ";
                                            break;
                                        case 437973121:
                                            str8 = "ۘۢۦۘۦۘ۫ۘۡۘۗۨۦۤ۠ۖۨۘۘۖۤۘۜ۬ۧۡۤۖۘۢ۫ۦۘۡۙۘۘ۬ۙۖۘۦۖۡۘۢ۬۟";
                                            break;
                                        case 1518226623:
                                            str9 = intent.getExtras() != null ? "ۛۗۘۘۨۜ۟ۡۛۧۦۨۚۧۖۨۘۡۗۨ۟۠ۦۗۦۨۘۦۜ۠ۚۛ۠۠ۙۘۘۧ۬ۘ" : "ۛ۠ۨۘ۬۠ۘۖ۠ۧ۠ۛۤۚۚ۫ۖۢ۬ۤ۟ۡۨۘۢۖ۫ۜۘ۟ۙۢۛۚۡۘ۟ۦۜ";
                                            break;
                                        case 2095419490:
                                            str9 = "ۥۜۜۘ۠۠۟ۢۡۤۚ۠ۚۥۜۡۘۖ۬ۙۦۘۘ۠ۜ۠ۙۦۖۘۚۨۙۢۛۢۙۨۘۧۙۘۘۢۥ";
                                            break;
                                    }
                                }
                                break;
                            case -572731660:
                                str = "ۗۨۖۘۜۦۖۤ۟۟ۤۘۙۥۧۘۙۗۖۗۙۖۘۘۥۦۚۧۨۘۙۨۢ";
                                break;
                            case -509499182:
                                break;
                            case 867752576:
                                str8 = "۠ۧۥۘ۠۫ۢۢۨۧ۠۫ۥۘۖۙۦ۠ۨۨۘۛۨۡۘۤۚۖۢ۬۬ۙۦۧۘ";
                                break;
                        }
                    }
                    break;
                case 1644720990:
                    return;
                case 2003628451:
                    str = "ۤ۬ۖۘۗۥۘۢۚۙۜۜۨۘۛ۬ۚۙۡۙۘۘ۠۠ۘۤۤۘۘۦۥۖ";
                    continue;
            }
            str = "ۜۦ۠ۥۧۜۘ۠۠ۘ۫ۚۜۘۜۧۖۘۘۧۦۘۖۖ۬ۧ۫ۜۖۨۜۦۙۡ";
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "ۢۡۦۢۥۚۙۘۘۘ۬ۘ۠۠ۧۛ۟ۨۘ۫ۛۜۘ۠ۗۚ۫ۧ۠ۗۙۜۧۧۥۥۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 404) ^ 335) ^ 22) ^ 1547157002) {
                case -1629758291:
                    this.OooooOo.findViewById(R.id.im_remvoe_view).callOnClick();
                    str = "ۛۚۤۗۘۡۘ۫ۨ۠۠ۦۨ۠ۖۖۚ۠ۤ۟۟ۗۜ۠ۦۛ۠ۚۢۘۜۖۢ۟ۧۥ۠ۧۡۖۧۖۙ";
                    break;
                case -1589364264:
                    super.onPause();
                    str = "۟ۚۜۢۛۚۨۛ۠ۖۘۡۖۘۜۢۨۘۥۛۤ۟۠ۖ۫ۤۜۘ۠ۗۤ";
                    break;
                case -1371034966:
                    str = "ۤۘۙۦۛۙ۟ۙ۠۟۟۟۬ۖۘۗۙۤ۠ۗۙۘ۬ۥۛۛۨۤۘۘۛۖ۠۬ۥۖۘۢۛۦۘ۬ۢۖۘۥ۬ۧ۠ۦۥۘۙ۟ۥۘۢۢۥ";
                    break;
                case -825366529:
                    String str2 = "ۥ۬ۨۘۨۨ۬۟ۘۛۖۖۥۘۢۧۤۦۖۥ۬ۛ۟۠۬۫۠ۙۦ۬۫ۘۘۚۡۜۨ۟ۤۨۘۖ۫ۨ";
                    while (true) {
                        switch (str2.hashCode() ^ (-703257617)) {
                            case -130901717:
                                String str3 = "ۥۤۨۘۘ۟ۡۘۛ۬ۖۘۤۤۜۘۧۡۥۧۙۖۙۨۜۘ۠ۤۦۘۡۤ۟ۨۘۖۙ۬ۤۢۥۚۛۗۦۘۜ۬ۢ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1285301315) {
                                        case -612167307:
                                            str2 = "۠ۘ۫ۨ۟ۢ۬ۡۖۘۨۦۢۤۨۘۧۛۖۘۘۢۦ۠ۢۙۡۥۜۖۨۥ";
                                            break;
                                        case 255800093:
                                            str3 = this.o0O0O00 ? "ۙۡۛۢۗ۟ۖۖ۬ۛ۬۫۫ۥۘۖۧ۠ۦۤۥۘۡۛۦۨۤۧۚۦۥ۫ۛۢۘ" : "۬ۚۘۢۘۖۘۨ۬ۦۦۡ۟ۥۛۨ۬ۜۜۘ۬ۤ۫ۖۘۖ۫ۜۘۗۘۤ";
                                            break;
                                        case 1980578010:
                                            str3 = "۬ۘۡۘۨۖۜۗۤۖۘۖۧۛۙۨۡۘۡۨۜۘۨ۫ۙ۬ۚۙۨۘۨۘ۬ۛۡۘ۬ۚۥۘ۫ۗ۠۠۬ۙۖۚۨ";
                                            break;
                                        case 1983094932:
                                            str2 = "ۢۦۥۘۥۢ۬ۙۡۢۛۜۘۢۖۨۘۛۤۨۘ۟ۘۜۘۦۖۧۘۡۙۨۘۙۛۗۢۚۗۧۨۘۗۥۧۖۚۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case -102611202:
                                str = "۟۠ۙۛۛۧۙ۫۫ۙۥۛۦۜۧۘ۟۟ۡ۟ۗۥۘۗۛۨۜۧۢ۠ۚۖۘ۠ۢۨۘۡ۬ۜۘۢۘۙۡ۫ۥۘۜۦۥ۬ۖۗ";
                                continue;
                            case 391355300:
                                str2 = "ۘ۟ۚ۠۟ۥۘۙ۠ۥۡۦ۠ۧۤ۬ۨۥۘۥ۬ۦۘۢۜۘۘۘۨ۟۫ۦۙۘۨۙۖۚۙۡ۬ۖۘ۫۬ۥۙۡۘۘ۫ۖۢ۫ۡۘۧۚۨۘ";
                                break;
                            case 872577080:
                                str = "ۛۚۤۗۘۡۘ۫ۨ۠۠ۦۨ۠ۖۖۚ۠ۤ۟۟ۗۜ۠ۦۛ۠ۚۢۘۜۖۢ۟ۧۥ۠ۧۡۖۧۖۙ";
                                continue;
                        }
                    }
                    break;
                case -565221324:
                    return;
                case 1914365056:
                    C3691ah.OooO0o0(this);
                    str = "۫۟ۥۗۚۧۘ۟ۘ۠ۧ۠ۙۤۡ۠۟ۜ۬ۥۗۥ۫۠۠ۨ۬ۡۡۦۘ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "ۢۧۧۜۧۤۛۘۘۘۧۜۖۘ۫ۖۢۚۤۥۘۗۡ۫ۛ۬ۗۖ۟ۢۗۤۖۘۗ۫ۜۘۦ۠۟ۘۥۡۘ۠۠ۜۘۧۦۘۙ۬ۦ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_TITLE_TEXT_VALUE) ^ 984) ^ 339) ^ 599945613) {
                case -1659355622:
                    super.onResume();
                    str = "۫۠ۜۘۥۜۦۘ۟ۦۢۢۡۢۥ۟ۥۜۙۢۗ۟ۢ۠ۘۨۘۥۖۢ۟ۛۗ۬ۖۨۘۘۤ۬ۙۥ۬ۤ۬ۦۘ";
                    break;
                case -1030550547:
                    C3691ah.OooO0o(this);
                    str = "۠ۛ۬ۨۨۧۘۜۙۘۘ۬ۥۢۡ۬ۗ۬۟ۧۢۖۥۘ۫ۘۥۖۢۘۛۘۥۘ";
                    break;
                case 76382492:
                    str = "۫۬۟ۥۨۡۘۘۨۧۨۗۧۥ۫۫۟ۖۖۧۢۥۢۢۜۘۢۙۦۥ۠ۦ۬۫ۨۚۥۖۘۛۢۛۜۙۡۘۥۛ۠۟ۜ۟ۨۘۡۙۦۘ";
                    break;
                case 484939860:
                    return;
                case 1418011316:
                    String str2 = "ۖۘ۟ۜۗۘۘۥۥۘۧۜۢ۠ۨۙۥۛۨۘۥۦۜۘ۬ۖ۬ۦ۫۠ۥۥ۫ۡۥۜۚۥۨ۫ۚۖۢۖۘۜ۬ۡۘ۫۟ۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1692979106) {
                            case -1758261257:
                                str = "ۙ۫ۖۘۜۡۨۘۧۢۨۘۢۛۨۘۜۧ۟ۡ۟ۦۘۥۡۥۥۙۙۚۨۜۘ۠۠ۦۘ";
                                continue;
                            case -42613390:
                                str = "۟ۛۚۤۡۘۢۜۥۜۧۖۘۚۢۨۦۗۤۜۘۥۘ۬ۗۢ۠ۗۦۚۢۚ";
                                continue;
                            case 63743366:
                                String str3 = "ۥۡۚۥۛۦۘۖۚۦۘۥۥۦ۫ۥۜۤۥۧ۟ۖۘۖۚۜ۠۠۟ۦۢۘۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1141309234) {
                                        case -1528530220:
                                            str2 = "ۙۥۤۧ۟ۖۘۘ۫ۡۛۛۥۖۘۚۡۚۛۡ۬ۢۥۧۥۖ۟ۥۘ۫ۜ۠ۛۛۚۘۛۜۘ";
                                            break;
                                        case -1274813304:
                                            str2 = "ۜۖۖۘۨۨۡۘ۟ۙۨ۫۠ۧۘۚۘۘۘ۟ۜۙۦۧۘۙۛۡۜۥۜۢۧۜۘۗۦۘۚۗ۫ۙ۬ۛ۟ۙۖۘ";
                                            break;
                                        case -439228124:
                                            str3 = this.oo000o ? "۟ۜۢۗ۟ۙ۫ۦۗۗۡۤ۠ۜۨۘۢ۟ۗ۫ۥۤۘ۫ۘۘۤۨۚ۫ۚ۫ۗۘ۬ۢۦۦۡۘ۫۬ۦۢۛۖۘ۟ۜۘۚ۬۫ۦ۬ۦۘ" : "ۗ۬ۧۖ۠ۧۦۧۘ۬ۥۦۘۚۚۖۚۛ۫ۛۘۡۘۨۛۘۖۚ۟ۙ۠ۢۨۡۖۙ۠ۜۘ";
                                            break;
                                        case -431532261:
                                            str3 = "ۘۥۘۘۢۧۖۜۖۖۘ۠ۙۚ۫ۧۜۘۡۚۘۘ۟ۜۧۘ۬۟ۘۧۦ۫۠ۚۖۘ۫۠ۘۦۚۜۘۧۦ۠۫ۡ۬۫ۨۦۘۘۚۜ";
                                            break;
                                    }
                                }
                                break;
                            case 538349991:
                                str2 = "۬ۙۦۘۧۜۘۜۦ۫ۥۢۖ۟ۜۙۥۗۡۡۢ۫ۢۡ۟۬ۦۡۚۨۧۘۢۧۦۤۛ۬";
                                break;
                        }
                    }
                    break;
                case 1463083638:
                    ((C4091la) this.OooooO0).Oooo00O();
                    str = "۟ۛۚۤۡۘۢۜۥۜۧۖۘۚۢۨۦۗۤۜۘۥۘ۬ۗۢ۠ۗۦۚۢۚ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        String str = "۠۟ۖۘۤۨۥۜۨۘۜۡۡۚۜۘۚۗۡۡ۫ۡ۫ۜۜۙ۟ۖۘۡۜۡۘۙۦۖۘۥ۬۟ۜۦۢ۟ۗۚۨۙۨۘ۫۬ۧۢۦۘۚۦۚ";
        while (true) {
            switch ((((str.hashCode() ^ 772) ^ 442) ^ 291) ^ (-164138156)) {
                case -851169694:
                    super.onStop();
                    str = "ۛ۬ۧ۬۬ۤۖۗۥۢ۬ۘۘۙۨۨۘۜۤۧۗۧۧۨ۬ۗۨۨۧۘۢ۟ۚۦۧ۫۬ۢۡۘۘۧۚۧ۬ۘۘۧۨ۬۬ۗۦۛۚ۫ۦۥۘ";
                    break;
                case -716582575:
                    str = "ۜۚۜۘ۬ۧۥۧۗۡۘۥ۬ۡۘ۫۬ۜۚ۟ۧۨۡۘ۟۟ۡۢۛۘۧۜۢۘۧۘۤۗۛ";
                    break;
                case 1819733295:
                    this.oo000o = true;
                    str = "ۡۤ۬ۧ۟ۥۘۜۦۘۥۙۡۘۦۛۜۘۛۗۤۛۧۦۖۤۜۘۘۗۥۘ۠ۢۧ";
                    break;
                case 2018513224:
                    return;
            }
        }
    }
}
