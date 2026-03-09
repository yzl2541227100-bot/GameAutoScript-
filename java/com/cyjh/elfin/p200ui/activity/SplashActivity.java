package com.cyjh.elfin.p200ui.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Observer;
import cn.haorui.sdk.adsail_ad.view.scaleImage.SubsamplingScaleImageView;
import com.anythink.china.common.C1082d;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.cyjh.common.base.activity.BaseModelActivity;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.p200ui.activity.guide.RecognitionGuideActivity;
import com.cyjh.http.bean.response.PhoneConfig;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;
import java.util.ArrayList;
import mobi.oneway.export.C3580a;
import p285z2.AbstractCountDownTimerC4084l3;
import p285z2.AbstractViewOnClickListenerC3980ia;
import p285z2.C3729bi;
import p285z2.C3753c5;
import p285z2.C3863f4;
import p285z2.C3939h6;
import p285z2.C3950hh;
import p285z2.C3951hi;
import p285z2.C4095le;
import p285z2.C4122m4;
import p285z2.C4173ni;
import p285z2.C4203oa;
import p285z2.C4230p1;
import p285z2.C4246ph;
import p285z2.C4283qh;
import p285z2.C4454v3;
import p285z2.C4460v9;
import p285z2.C4496w8;
import p285z2.C4579yh;
import p285z2.C4589yr;
import p285z2.C4616zh;
import p285z2.InterfaceC4135mh;
import p285z2.InterfaceC4306r3;
import p285z2.InterfaceC4505wh;
import p285z2.o0oo0000;

/* JADX INFO: loaded from: classes.dex */
public class SplashActivity extends BaseModelActivity<C4203oa> implements View.OnClickListener {
    public static final int o00Oo0 = 8;
    private static final int o00Ooo = 200;
    private static final String o00o0O;
    private static final int o00ooo = 1;
    private ImageView OooooOo;
    private LinearLayout Oooooo;
    private TextView Oooooo0;
    private TextView OoooooO;
    private C4283qh Ooooooo;
    private OooO ooOO;
    private String[] OooooOO = {C1082d.f2501a, C1082d.f2502b, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.CALL_PHONE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.SEND_SMS", "android.permission.READ_SMS", "android.permission.READ_CONTACTS", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.CAMERA"};
    private int o0OoOo0 = 0;
    private InterfaceC4135mh<String> o00O0O = new OooO00o(this);

    public class OooO extends AbstractCountDownTimerC4084l3 {
        public final SplashActivity OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private OooO(SplashActivity splashActivity, int i) {
            super(i);
            this.OooO0OO = splashActivity;
        }

        public /* synthetic */ OooO(SplashActivity splashActivity, int i, OooO00o oooO00o) {
            this(splashActivity, i);
        }

        @Override // p285z2.AbstractCountDownTimerC4121m3
        public void OooO0O0(int i) {
            String str = "ۗۥ۫ۚۗۨ۟ۙ۟ۙۤۨۘۥۘۘۨ۫ۥۥۨۧۘۚ۫ۤ۬ۘۧۘۗ۠ۘۚۤۘۚۜۘۥۤۥۘۗۡۨۡۧۨۢۡ۬";
            while (true) {
                switch ((((str.hashCode() ^ 652) ^ 187) ^ 816) ^ 518587209) {
                    case -723552113:
                        SplashActivity.OooOo00(this.OooO0OO);
                        str = "ۤۡۡۤۛ۫ۦۖۡۘۡۖۖۜ۟ۙۥ۟ۤۥۧۘۥۥۤ۠ۘۥۘ۬ۤ۬ۛۥۜۘۖۢ۠ۗۗ۠ۗۘ۬۠ۨۡۘ۟۬ۖ۟ۚۡۧۦۘ";
                        break;
                    case -123239612:
                        str = "ۥۜۡۘ۟ۙۤۦۢۡۘۥ۟ۜۚۢ۬۬ۙ۫۠۬ۜۘۡۡۛۥۥۜۘ۫ۚۨۘ";
                        break;
                    case 1326910415:
                        return;
                    case 1956344963:
                        str = "۟ۥۗۦۛۦۘۜۥ۠ۛۜۖۢۥۖۘۚۤۘۢ۟ۡۘ۫۬ۘۥ۫ۖۨۚۖ۬ۚۥۨۘۧۖۤۡۘ۠۠ۚۘۦۘۘۧ۬۟ۨۚۨۖۨۗ";
                        break;
                }
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            String str = "ۚۙۙ۟ۡۥۗۛۗۢۦ۠۠ۚۡ۟۫ۜۨۧۖۘۘۢۘۜۖۨۘ۠ۡۗۘۗۚۖ۫ۧۤۦۖۛۗۖۘ";
            while (true) {
                switch ((((str.hashCode() ^ 529) ^ UiMessage.CommandToUi.Command_Type.FW_SET_WIDTH_VALUE) ^ 97) ^ 1719161060) {
                    case -2122688137:
                        str = "ۤۧۡۤ۬۬ۜۛۨۘۥۜ۫ۛۛ۟ۗۙۢۨۜۘۚۜۙۡۧۡۦۦۧۘ";
                        break;
                    case -639764881:
                        SplashActivity.OooOo0(this.OooO0OO);
                        str = "ۘ۬ۥۨۖۨۘۜۜ۟ۢۦۥۥۥۜۘ۠۬ۜۖۤۖۤۗۧۦۛۡۛۤ۬ۛۡۗۜۛ۬ۙ۬۫ۗۖ۬ۖ۫ۙۧۦۚ۠ۨۘ۠۫ۖ";
                        break;
                    case -379136193:
                        return;
                }
            }
        }
    }

    public class OooO00o implements InterfaceC4135mh<String> {
        public final SplashActivity OooO00o;

        public OooO00o(SplashActivity splashActivity) {
            this.OooO00o = splashActivity;
        }

        @Override // p285z2.InterfaceC4135mh
        public void OooO00o(String str) {
            String str2 = "ۦۤۚۜ۠۬ۢۨۤۖۧۥۘۜۗۜ۫۟ۥۤۤۡۘۨۗۘ۟۠ۙۛ۠۫۫ۥ۬۫ۢۧ";
            while (true) {
                switch ((((str2.hashCode() ^ 764) ^ 322) ^ 3) ^ (-501281612)) {
                    case -1783352454:
                        return;
                    case -1440789850:
                        SplashActivity.OooOOOO(this.OooO00o).setVisibility(0);
                        str2 = "ۢ۬ۖۘۨ۬ۘۥۡۖ۠ۡۡۘ۠ۦ۬۬ۚۥۗ۫ۢۡۡۨ۫۫ۦۘۖۘۧۘۧۤۜۘۨۖۧۖۗۚۜۡۡۘۦۙ۠ۛ۬۠ۚۘۘ۠ۥۡ";
                        break;
                    case 785339232:
                        String str3 = "ۢۛۦۜۜۚ۟ۢ۬ۛۢۤ۠ۦ۠ۥۤۛۧۦ۬ۤۦۘۘۦۤۜۨۥۖۖ۬۠ۗۥۘۥۧۡۘ۫ۘۦۘۤۖۦۛۡۗ";
                        while (true) {
                            switch (str3.hashCode() ^ (-511349713)) {
                                case -1995707359:
                                    str2 = "ۚ۬ۘ۬ۨۦۤۛۦ۫ۖۤۥۨۙۖۦۡۡۚۡۘ۫ۗۜۖۜۦۘۙۙۧۙۘۦۙۛۨۘۛۥۗۚۦ۟ۤۡۚۘۘ۬ۛۨۘۘ۠ۤ";
                                    continue;
                                case -935574886:
                                    str3 = "ۛۘۥۘۤۙ۟ۤۚۧۧۨۥۤۘۧۥ۠۟۫۬ۡۗ۠ۧۜۨۥۘۘۥۡۘۤۧۤۗ۟۟ۚۖۧۘ۟ۧۘ";
                                    break;
                                case -236667181:
                                    String str4 = "۫۫ۤۜۜۢۘۤۢۨۡۦ۫ۥ۫ۡۨۘ۟ۧۛۨۦۢۤۦۚۡۥ۬۬ۨۧۘۧۖ۬ۗۛ۫۟۠ۢ";
                                    while (true) {
                                        switch (str4.hashCode() ^ 1151152780) {
                                            case -2071787142:
                                                str3 = "ۤۖۘۤۢۢۨ۠ۧۧ۠ۥۘۢ۬ۥۥۦۘۢۖۢ۠ۨۖۚۜۖۘۧۜۗ";
                                                break;
                                            case -1638607246:
                                                str3 = "ۥۛۡۘۥ۠ۙۜۢۙۛۤۨۘ۬ۥۡ۫ۛۨۘۖۖۧ۫ۜۧ۫۫ۡۘۜۡۧۘۖۙۡۙۗۙۛ۠ۖ۟ۤۥۘ۫ۙۡۘ۬۫ۤۚ۠ۦۨۨۘ";
                                                break;
                                            case -956318867:
                                                str4 = "ۚۦ۫ۜۚۦۘۨۢۧۤۡۦۘۘۦۜۘۜۘۜۘۦ۬۟ۨۡ۫۟ۨ۫ۚ۫ۤۨۤۖۡۤۖ۟ۛۦۜۢ";
                                                break;
                                            case -798202728:
                                                str4 = !TextUtils.isEmpty(str) ? "ۘۚۥۡۡۙۢۨۖۢۘ۟۫ۗۨۘۜۖۢۤۢ۫ۗۗۜۦ۬ۤۦ۟ۗۙۗ۫ۧۧۙۖۖۥۚۤۗۘۙۥۧۢ۠ۘۚۧۨۨۥ" : "ۥۜۖ۫ۦۡۘۥۨۨۘۨۥۘۚۜۧ۫ۙۜ۬۬۠۫۫۟ۙۚۦۘۧ۫ۡۗۙۢۡۛ۫ۚۚ۬ۚ۬ۨۧۘۥۘ۠۫۫";
                                                break;
                                        }
                                    }
                                    break;
                                case 421569354:
                                    str2 = "ۢ۬ۖۘۨ۬ۘۥۡۖ۠ۡۡۘ۠ۦ۬۬ۚۥۗ۫ۢۡۡۨ۫۫ۦۘۖۘۧۘۧۤۜۘۨۖۧۖۗۚۜۡۡۘۦۙ۠ۛ۬۠ۚۘۘ۠ۥۡ";
                                    continue;
                            }
                        }
                        break;
                    case 1662682734:
                        SplashActivity.OooOOOO(this.OooO00o).setText(String.format(this.OooO00o.getString(R.string.ad_source_mark), str));
                        str2 = "ۙۨۡۧۖۨۨۜ۠ۜۜ۟ۡۘۡۘ۬ۥۥۙۘۤۤۚۚۗ۟ۨۢ۠ۛۡ۫ۗۗ۬ۦۘۜ۬ۖۘۘۜۦ۫ۨۖ۠ۛۡۘ";
                        break;
                    case 1678435665:
                        str2 = "ۖۚۛۦ۬۫ۙۛۖۖ۬ۧۙۨۘ۠ۖۨۘۦۚۘۘۨ۠ۥۢ۬ۥۦۚۘۧۚۡۘ۠ۛۡۘ";
                        break;
                    case 1974170771:
                        str2 = "ۘۛۨۗۦۦ۫ۡۥۚۦۘۢ۫ۘۘۥۧۘۘۘۘۘۧ۫ۚۚ۫ۦۘۡۤۧ";
                        break;
                }
            }
        }

        @Override // p285z2.InterfaceC4135mh
        public /* bridge */ /* synthetic */ void OooO0O0(String str) {
            String str2 = "۟ۚۥۧۨۤ۫ۗۚۙۧۡۘۙۥ۫ۥ۠ۚۖۨۦۘۥۗۖۘۧۧۜۚۥۥۘ۠ۗۥۧ۠ۤ۫ۦۧۘۖۗۖۘ۬ۥۚۚ۫ۦۜۦ۫ۗۦۢ";
            while (true) {
                switch ((((str2.hashCode() ^ 181) ^ 115) ^ 58) ^ (-1284134199)) {
                    case -1137938751:
                        return;
                    case 636327120:
                        OooO0o(str);
                        str2 = "ۗۥۥۜۗ۟۫ۜ۟۬ۧ۬۬۬ۙۤۦۛ۫ۜۢۙۦ۟۠ۙۤۦۗ۟۫ۡۧ۫ۙۡۖۖ۠۬ۦۘ";
                        break;
                    case 1139143823:
                        str2 = "ۙۡۨ۬۟ۢۗۨۚ۫۟ۤۧ۫۫ۨۡۜۥۨۘۖۜۦۘۥۥۤۧۛ۟ۦ۠ۖ۟ۛ۟ۛۖۘۥۤۚ";
                        break;
                    case 1262127922:
                        str2 = "ۤۖۨۘ۟ۤۜۘۙۨۘۘۖۛۘۢۦۦۡۚ۫ۘۜۘۘۨۜ۟ۜۥۖۘۙۡۚ۬ۢۗ۫ۡۛۙۛۥ۟ۧۘۘۨ۫۬۠ۨ۠";
                        break;
                }
            }
        }

        @Override // p285z2.InterfaceC4135mh
        public void OooO0OO() {
            String str = "ۡۧۡۘۛۛۘۧۙۜ۟ۜ۫ۨۘۜۘۛۧ۟ۨۥۤۙۡۜۥ۠ۦۘ۫ۛۥۘۛۙۛۘۘۥ";
            while (true) {
                switch ((((str.hashCode() ^ 765) ^ 43) ^ 758) ^ 1977337827) {
                    case -165717778:
                        str = "ۛ۬ۘ۠ۘۜۦۧۛ۫ۧۤۗۡۧۘۢۜۚۤ۫۟ۘۜۦۦ۬ۦۜۡۥ۬۬ۘۘۥ۬۟ۧۜۡۘۡ۟ۙ۬۟ۜۘۦۚ۟ۗۚۛۨۖ۟";
                        break;
                    case 400237817:
                        SplashActivity.OooOOo(this.OooO00o);
                        str = "ۖۦۦۖۦۖۘۚۡۖۘ۟ۘۦۘۖۖۧۘۤۗۧۤۡۨۘۙۖۨۘۥۗۨۘ۟ۡ۟ۜ۫۠ۥۙۧ";
                        break;
                    case 2138140863:
                        return;
                }
            }
        }

        @Override // p285z2.InterfaceC4135mh
        public void OooO0Oo(int i) {
            String str = "۟۠ۡۧۦۧۡۘۗۤۧۚۥۛۥۖ۠ۙ۟ۛ۬ۜۨ۠ۙۥۘۨۚۦۗۢۚۜۨۘ";
            while (true) {
                switch ((((str.hashCode() ^ 959) ^ 254) ^ 585) ^ (-1589538065)) {
                    case -691495029:
                        this.OooO00o.OooOo();
                        str = "ۦۤۜۘۤۡۧۡۖۢۤۥۢۡۗۘۘۘۗۧۗۥۦۘ۫ۖۥ۫۟۟ۚۜۨۧۘ۫ۤۖۘۘۡۜۢۥۛۢ";
                        break;
                    case -284977788:
                        str = "ۤۖۥۘۦۡ۫۟ۦۡ۠ۡۤ۟۫ۤۛۚۖۙۦ۬ۘۢۜۜۤۛۙ۠۠";
                        break;
                    case -261637363:
                        SplashActivity.OooOOOo(this.OooO00o).setOnClickListener(this.OooO00o);
                        str = "ۖۢۛۢۜۡ۬ۛۤۧ۠ۨۥۦۡ۟ۖۢۤۢۦۘۗ۠ۦۙۥ۫ۥۘ";
                        break;
                    case 1071161061:
                        SplashActivity.OooOOOo(this.OooO00o).setVisibility(0);
                        str = "۠ۤۢ۬ۡ۟ۛۘۘۘۤۖۖۥ۬ۜ۫۫ۥۙۢۖۘۨ۠ۦۘۢۨۘ۫ۡۧۘۛۢۧۦۨۥۦۘۤ۟ۢۦ";
                        break;
                    case 1197323343:
                        str = "ۘۧۖۤۨۡۘۧۦۘۖۙۚۗۛۙۤۗۢۧۧۧۢۗ۬ۜۛۚۢۤۘۡۛۚۥۖ۫ۗ۠۠ۗۥۦۘۨۖۦۘۛۘۖۘ۟ۦۗۙۗۚ";
                        break;
                    case 1529735170:
                        return;
                    case 1900633322:
                        ((C4203oa) SplashActivity.OooOOo0(this.OooO00o)).Oooo(i);
                        str = "۫ۢۡۘۛۗۖۘ۫۟ۖۗۡۛۦۧۡۘۗۧۥۧۘۡۧۘۖۤۚۘ۠ۨۘ";
                        break;
                }
            }
        }

        public void OooO0o(String str) {
            String str2 = "۟ۘ۬ۨۤ۠ۧۚۤۛ۫ۛ۠ۗۘۘۢۙۜۘۤۧ۟ۖ۬ۢۛۜۜۛۖۗ";
            while (true) {
                switch ((((str2.hashCode() ^ 531) ^ 686) ^ 867) ^ 396736552) {
                    case -1047986704:
                        str2 = "ۢۦۙ۠ۘۥۧۨۧۘۖۘ۫ۢ۫ۚۧۖۚۘۘۚۛۤۚۚۖۧۧۥۘ";
                        break;
                    case -812820919:
                        str2 = "ۙۚۚ۟ۛۖۘۘ۬ۤ۟۠ۗۚۡ۫۟ۡ۟۠ۧ۬ۜۛۖۥۦۧۘ۠ۘۗ";
                        break;
                    case 180975955:
                        SplashActivity.OooOO0(this.OooO00o, str);
                        str2 = "۬ۖۘ۟ۨۦۘۗۥ۬۠ۗۜۧۡۜۖۙۦۘ۫ۚۜۨۚ۠ۤۗۜۦۨۘۧۛۖۘۡۡۜۘۡۥۥۥ۬ۖۘۜ۬ۡۘۤۦ۠۠ۛۧۡۨۦ";
                        break;
                    case 1257746321:
                        return;
                }
            }
        }

        @Override // p285z2.InterfaceC4135mh
        public void OooO0o0(String str) {
            String str2 = "۟ۖۡۘۨۛۡۘ۠ۨۘۘۢ۫ۧۦۘ۟ۙۢۦۡۥۨۦۤۡۡۘ۟ۦ۠ۖۧۜ۠ۛۨۡۥ۟ۗۜۤۙۙۙۗۖۖۘۘ۫ۡ۫ۦ";
            while (true) {
                switch ((((str2.hashCode() ^ 596) ^ 111) ^ 950) ^ (-977056775)) {
                    case -1997701962:
                        return;
                    case -1222700370:
                        str2 = "۫ۗۜۘۗۤۗ۫ۛ۟ۘۛۥۘۢۡۢۘ۠ۨۘۡۨۡۘ۬ۡۡۘۖۥ۫ۚۦۛۡۦۛۘۜۨۘۨۡۤۙۦۥ";
                        break;
                    case 1801886782:
                        str2 = "ۦۗ۬ۖۤۘۛ۫ۤۗۧ۠ۢ۠ۘۚ۬ۥۘۜۘۡ۟ۧۚۖ۫ۥۖۗۜۘۘ۬ۘۧۖۥۘ";
                        break;
                }
            }
        }

        @Override // p285z2.InterfaceC4135mh
        public void onAdClose() {
            String str = "ۧ۫ۦ۠ۥۧۘ۟ۡۚۡۢۦۘۙۢۗۘۨۘۜۨۘۧ۟ۚۜۜ۬ۧۤۗ";
            while (true) {
                switch ((((str.hashCode() ^ C1801a.f11013aX) ^ 780) ^ 331) ^ 56220413) {
                    case -1991252792:
                        return;
                    case 1087721566:
                        SplashActivity.OooOO0O(this.OooO00o).setVisibility(0);
                        str = "ۗۜۙۘۡۨ۠ۥۨۦۗۨ۬ۤۥۛۥۘۛۙۨۜۚۨۖ۬ۘۘۤۘۖۨۖ۬ۨۨۡۘ۫۠۠ۛۢ۫۬ۜ۬۠ۦۘ";
                        break;
                    case 1896511105:
                        str = "۠۬ۜۚۡۖۧۛۥۘۥۢۜۘۤۦۤۡۗۛۡۡۢۢۘۛ۠ۜ۬ۥ۬ۢۢۖۨۘۖۨۖۛۖۘۜۦۤۚ۬ۘۚ۟ۚۢۢۗۘۧۘ";
                        break;
                }
            }
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public final SplashActivity OoooOoO;

        public OooO0O0(SplashActivity splashActivity) {
            this.OoooOoO = splashActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "ۗ۬ۖۡ۬ۢۚۢۜۘۦۥۜۦۛۛۥ۟ۛۢۡۢ۬ۜۘۛۦۦۘۛۢۥۘ۫ۜۛۡۚ۬۫ۦۡۡۘۨۘۦۙۜۥۦۖۜۢۤۧۖ";
            while (true) {
                switch ((((str.hashCode() ^ 583) ^ 55) ^ 536) ^ (-411391449)) {
                    case -1262609192:
                        str = "ۥۢۥۥۗۛۡۨۡۘۥ۠ۗ۠ۗۚۛۚۘۡۤۙ۫ۥۘ۟ۡۦۘۙ۟ۖ";
                        break;
                    case -424252511:
                        this.OoooOoO.startActivity(new Intent("android.settings.DATA_ROAMING_SETTINGS"));
                        str = "۟ۚۗۡۖ۬۟ۛۨۘۢۧۨۥۖۖۘ۫۬ۡۡۜ۫ۧۘۦ۠ۜۨۘۜۘۥ۠ۢ۬ۨۥۘ۬ۨ۟ۗۗۘۧۘ۟ۧۛۨۘۜۜۥۘۘۢۦ";
                        break;
                    case 1520652046:
                        str = "ۡۙۖۘۗۗۤۨۡۙۘۢۢۚۘۦۘۨۧۡۘۦۜ۬ۙۛۦۙۘۘۖۦۡ";
                        break;
                    case 1817595851:
                        return;
                }
            }
        }
    }

    public class OooO0OO implements InterfaceC4306r3<String> {
        public final SplashActivity OooO00o;

        public OooO0OO(SplashActivity splashActivity) {
            this.OooO00o = splashActivity;
        }

        @Override // p285z2.InterfaceC4306r3
        public /* bridge */ /* synthetic */ void OooO00o(String str) {
            String str2 = "ۜۦۖۥۢۙۨ۬ۤۜۘۖۧۥۦ۫۟ۚۖۘۙۥۖۚۨ۠ۡ۫ۖۨۘۢۤۜۡۤۧ۫ۤۛۤۨ۠";
            while (true) {
                switch ((((str2.hashCode() ^ 655) ^ UiMessage.CommandToUi.Command_Type.FW_OPACITY_VALUE) ^ 914) ^ (-1444299286)) {
                    case -1002467091:
                        str2 = "ۢۨ۬۠ۖۚۘ۬ۡۙۥۧۘ۟ۖۖۘۚۤۦۡ۫ۤۡۨۚ۟۟ۦۙۘۦۘ";
                        break;
                    case -993833458:
                        OooO0O0(str);
                        str2 = "ۚ۠ۘۡۗ۟ۦۢۘۘۤۨ۬۟ۛۖۦۗ۠ۥۛۦۚۦ۬ۚۨۜۡۜۘ";
                        break;
                    case 132050784:
                        return;
                    case 870119623:
                        str2 = "ۤۢۘۘۜۡۢۡۜۘۨ۬ۨۘۢ۫ۛ۫ۜۜۛۢۤ۫ۛۘۧۘۜ۬ۖ۫ۛۗۦۚۙۢۖۢۙۡ۫ۢۜۖۧۘۚۜۦ۫۠ۜۤۧۥ";
                        break;
                }
            }
        }

        public void OooO0O0(String str) {
            String str2 = "ۘۨۡۘۥۡۡۘۢۖۨۘۙ۠ۖۘۡۛۥۧ۫ۦ۠ۨ۠۠ۖۡۘۦۧۜۘۙ۠۬۬۠ۜۙۖۙ";
            while (true) {
                switch ((((str2.hashCode() ^ 170) ^ 932) ^ 40) ^ (-610612075)) {
                    case -1747447802:
                        str2 = "ۦۤۘۤ۬ۥۘۖۥۤۚۧۤۥۢۨۤۗۗۜ۟۟ۖۗۧ۟ۜۧ۫ۙۢۚۚ۬ۘۗ۫۬ۖۙۜۘ۬۫ۜۗۥۛۛ";
                        break;
                    case -212561492:
                        SplashActivity.OooOO0o(this.OooO00o);
                        str2 = "ۙ۬ۘۛۜۨۘۙ۟ۨۘ۠ۡۨۘۙۚۦۘۤۥۨۘۜۦۢۦۚۜۢۨۦ۫ۛۦۘۤۙۜۘۖ۠ۜۘۧۛۜۚۧۧۧ۬ۙۗۖۘۘ";
                        break;
                    case -17623734:
                        return;
                    case 76238551:
                        str2 = "ۗۜۛ۫۟ۖۘۧۘۦۘ۫ۢۚۗۥ۬ۛۘۡۙۗۧۛ۫ۧۙۥۘ۠ۘۡۘۥۤۛۖۡ۟ۤۙۡۦۨۜۘ";
                        break;
                }
            }
        }

        @Override // p285z2.InterfaceC4306r3
        public void error(String str) {
            String str2 = "ۚ۬ۖۡۘۡۖۢۜ۠ۧۦۘۡۜۡۘۛۛۜۘۤۤۛۙۚۨۤ۠ۖۘ۠۠ۨ۠ۚۙۦۜ۫ۛۚ۠ۜۚۛۧۡۖۘۧۢۜ";
            while (true) {
                switch ((((str2.hashCode() ^ 443) ^ 434) ^ UiMessage.CommandToUi.Command_Type.LOAD_PROFILE_VALUE) ^ 1635050922) {
                    case -1947137305:
                        SplashActivity.OooOO0o(this.OooO00o);
                        str2 = "۠ۛۖۘۚۘ۠ۨۙۤۡۗۗۧ۟ۜۨۘۨۘ۬ۖۘۦۦ۠ۤۜۨۘۘۗ";
                        break;
                    case -1548838370:
                        str2 = "ۖۗۦۘۚۤ۬ۙ۟ۡۘۘۧۨۥۧۢۡۦۘۥ۫۟۫ۘۘۦۘۤ۬ۥۖۘۦ۠۫ۡ۫۬ۤۦۦۘۢۨ۫ۨۗۚ۬ۤۘۘۤۥۦۨۧۡۘ";
                        break;
                    case -26800036:
                        str2 = "۠ۘۘ۬۠ۗۨۧۙ۟ۡ۫ۡ۟۟ۛ۫ۘۘ۬ۥۨۘۨ۫ۤۜۦۜۘۡۙۛ";
                        break;
                    case 749130608:
                        return;
                }
            }
        }
    }

    public class OooO0o implements InterfaceC4505wh {
        private boolean OooO00o = false;
        public final SplashActivity OooO0O0;

        public OooO0o(SplashActivity splashActivity) {
            this.OooO0O0 = splashActivity;
        }

        @Override // p285z2.InterfaceC4505wh
        public void OooO00o(C4616zh c4616zh) {
            String str = "۫ۘۤۢ۫ۗۨۤۚۥۜۦ۠ۧۥۨۥۦۜۢۥۙۖۦۖۗۜۙۘۘ۠۠ۖۘۤۦۚ۟ۗۦ۫ۖۡۘۧۜۗۤ۠ۜۘۢۤۡۘۦ";
            while (true) {
                switch ((((str.hashCode() ^ 376) ^ 421) ^ C4095le.o00000oO) ^ (-707705298)) {
                    case -664408791:
                        str = "۬ۨ۬ۛۖۥۦۛۨۛۨۘۙۡۗ۫ۛۢۢ۫ۜۘۖۛۛۜۤۢۘۢۥۦۘۨۥ۟ۨۦ۫ۦۘ۠ۘۙ";
                        break;
                    case -561807811:
                        str = "ۜۜۨۗۗۦۨۤۜۘ۟ۥۥۙ۫ۙۡۤۥۘ۫ۦۡۘۖ۠ۖۘۙۛ۠ۚۜۖۘۗۦۨ۟ۛ۠ۛۡۘۛۢ۠ۢ۬ۙۘ۬ۦ۟ۨ۠ۨۥ۫";
                        break;
                    case 75312405:
                        return;
                    case 990695680:
                        Log.d("XJL_AD_TAG", "adview onAdShow");
                        str = "ۚۤۚ۠ۢۜۘ۠ۤۖۗۙۚۛ۟ۘۘۦۥ۫ۙۙ۟۬ۡۡۘۧۗۦۚ۠ۡۘ۫ۡ۬ۚۥۘ۠ۗۡۘۜۖۨۚۗ۫ۧۧۜۘۦۨ۠ۤۤۡ";
                        break;
                }
            }
        }

        @Override // p285z2.InterfaceC4505wh
        public void OooO0O0(C4616zh c4616zh) {
            String str = "ۨۥ۬ۙۡ۫ۛۢۖۘ۟ۧۨۘۚۧ۬۬ۖۤۧۨۧۘ۫ۨ۟ۢۙۨۤۤ۫ۘۚۜۥۗۖ۬ۙۘ۠۬";
            while (true) {
                switch ((((str.hashCode() ^ 12) ^ 957) ^ 147) ^ 1056025897) {
                    case -1052126727:
                        str = "ۚۧۗۘۜۖۘۦ۬ۜۦۘۢۥۤۥۡۛۥ۫ۙۨۘۡ۟ۜۘ۬ۢۥۥ۟ۜۘۘۛۦۘۦۢۜ۫ۤ۠۬ۙۜۨ۟ۢۢۘۧ";
                        break;
                    case -329349313:
                        return;
                    case 55622520:
                        str = "ۛۚۛۚۨۘۘۜۡۨۘ۟ۡۧۥۨۘۚۢۧ۠ۡۘ۟ۦۛۨ۠ۖۘۦ۬ۢۜۗۢۢۧۥۘۦۦۥۘ۟ۦۥۤۜۤۥۧۢ۫۬۠ۘ۠ۤ";
                        break;
                    case 758485232:
                        Log.d("XJL_AD_TAG", "adview onAdClick");
                        str = "۬۬ۡۤ۬ۘۡۙۦۖۡۘۛۘ۫ۢ۟۫ۗۖۗۧۙۜۘۢۙۖۡ۬ۘۘۨۘۥۧ۬ۡ۬ۥۥۘۧۖ";
                        break;
                }
            }
        }

        @Override // p285z2.InterfaceC4505wh
        public void OooO0OO(C4616zh c4616zh, C3729bi c3729bi) {
            String str = "ۜۘۧۘۙۘۘۙ۠ۢۜ۟ۡۘۤۥۚۚۜۥۘۗۜۖۘۦ۫ۤۛ۟ۥۘ۠ۜۖۘ۫۬ۥۤ۠ۘۘۙۡ۟ۜۚۗ۟ۥۨۘۙۡۥ";
            while (true) {
                switch ((((str.hashCode() ^ C3580a.f19598e) ^ 87) ^ 471) ^ (-724112900)) {
                    case -2062361076:
                        SplashActivity.OooOo0(this.OooO0O0);
                        str = "۠ۘ۬ۙۡۖۦۘۨۘۙۦۖۙۖۖۘ۫ۥۤۦۙۖۘۚۧۡۥۙۖۘۖۤۥ";
                        break;
                    case -903312565:
                        return;
                    case -560288623:
                        Log.d("XJL_AD_TAG", "adview onAdDismiss");
                        str = "ۙ۠ۥۘۢ۠ۢۛۛۚۤۦۡۢۗۘۘۜۚۥۘۢۤۦۥۧ۬ۗۛۦۘ۟ۦۜۘ۠ۧۜۥۦۨ۠ۛۜۘۚۖ۟ۙۖ۫ۘ۟ۖ";
                        break;
                    case 641925478:
                        str = "ۖۥۜۘۘۗۘۦۖۘۖۤۡۘۨۚۗۨۜۘ۬ۥۘۜۙ۟ۗۥۖۚ۫ۦۘ۠۠ۦۘۧۧۨۘۙۤ۫ۢۢۡۘۚ۫ۘۘۡۙۤۡۥۙۘۤ۫";
                        break;
                    case 1002309689:
                        str = "ۙۛۖۢ۬ۜۘۨۙۡ۫ۗۨۗ۫ۡۤۧۨۘۡۜۗۜۗۘۘ۟ۦ۠۠۠ۖ";
                        break;
                    case 1871816209:
                        str = "ۦۙۧۧ۟ۨۚ۠۟ۨۙۤۦۜۘۛ۬۫ۛ۬ۥۛ۫۬ۥۤۙۗۘ۠ۘۤ۠ۢ۫ۨۘ";
                        break;
                }
            }
        }

        @Override // p285z2.InterfaceC4505wh
        public void OooO0Oo(C4579yh c4579yh) {
            StringBuilder sb = null;
            String str = "ۧ۬ۧۗۗ۟ۤۛۘۘۙۛۦۚۜ۠۬ۜۙ۠۫ۥۤۢۨ۬۬۟ۗۜ۟ۗۡۧۘ۟ۢ۫";
            while (true) {
                switch ((((str.hashCode() ^ 359) ^ 48) ^ C4589yr.OooO0O0) ^ (-619276919)) {
                    case -1800257440:
                        SplashActivity.OooOOO0(this.OooO0O0).OooOOo0();
                        str = "ۤۚۢۚۥۚۧۜ۬۠ۘ۟۠۫ۡۘۨۚ۫ۖۤ۬ۘۙۢۙۚۘۘۥ۠ۦۡ۫ۨ۫ۥۢۙۘۚۡۜۖۘ";
                        break;
                    case -1533475646:
                        sb = new StringBuilder();
                        str = "ۖۤۙ۠ۚۥۘۗۘ۟ۛۥۢ۫۬ۖۙ۫ۡ۟ۦۧۗۧۚۘۥۧۤۥۢ۟ۤ۫ۖۥۨۘۢ۟ۡ۠۠۫";
                        break;
                    case -359228564:
                        sb.append(c4579yh.OooO00o());
                        str = "ۧۧۖۘۗۥۥ۟ۗۦۘۢۤۥۛۧۡۡۛۜۦۘۥۗۡۘۦۙۤۥۧۥ۠ۥۢۤۦ۬۬ۥۜۗۘ";
                        break;
                    case 117903966:
                        str = "ۗۢۧۙۚۦۙ۠ۛ۬ۦۙۛ۠ۢۢۜۨۦ۬ۜۧۡۗۡۜۚۖۤۙۘۜ۫ۡ۟ۨۘۢۡ";
                        break;
                    case 135070201:
                        str = "ۗ۬ۘۘ۟ۗۦۘ۫۫ۢۨۧۗ۟ۨۙ۠ۨ۠ۡۗۗۡۛ۫ۜ۫ۥۗۡۘۧۥۡۚۘۜ";
                        break;
                    case 367123423:
                        sb.append(c4579yh.OooO0O0());
                        str = "ۡۘۧۘ۫۠ۥۘۗ۬ۙۦ۫ۜۦۤۥۚۜۨۘ۟ۢۘۘۜۦۡ۫ۦۢۙ۫ۖۘۦۥۘ۠ۖۧۘۖ۟ۖۘ۠ۗۨۥۜۚۖۢۨۘۜۦ۬۟ۖ۬";
                        break;
                    case 390360081:
                        Log.d("XJL_AD_TAG", sb.toString());
                        str = "ۙ۫ۥۚۗ۫ۖ۬ۘۖۥۦۘۥ۟ۨۘۛۚۡ۠ۚۡۘ۫ۗۘۢۤۖۚۖۡۘۘۙۙۡۗۘۘ";
                        break;
                    case 774943180:
                        String str2 = "ۘۙ۫ۡۢۤۖ۠ۨ۬ۥۘۢۥۛ۬۬ۤ۠ۖۡۘۜۨۘۜۘۥۘۚۛۘ";
                        while (true) {
                            switch (str2.hashCode() ^ (-261629321)) {
                                case -1716448613:
                                    str2 = "ۚۗۛۘۘۘ۠ۨۜۨۛۤۥۡ۠ۨۨۚۡۧۘۘۛۡۘ۬ۚۥۘ۠ۥ۫ۙۜۡۘۤۧۨۘۜۤۙۘۜۚۚۨۗ۫ۡ۬ۦۧۧۘۢۥۘ";
                                    break;
                                case -891801463:
                                    str = "ۗ۬ۚۘۦۡۘۥ۫۬ۤۨۨ۫ۨۡ۟۫ۜۦۢ۬ۧۗۤۛۨۨ۠ۖۗ";
                                    continue;
                                case -91003322:
                                    str = "ۤۚۢۚۥۚۧۜ۬۠ۘ۟۠۫ۡۘۨۚ۫ۖۤ۬ۘۙۢۙۚۘۘۥ۠ۦۡ۫ۨ۫ۥۢۙۘۚۡۜۖۘ";
                                    continue;
                                case 234543512:
                                    String str3 = "ۤۦ۠ۜۢۗۘۥۜۛۚۘۘ۬ۘۢۤۢۡ۬ۤۚ۟ۢۤۗۜ۟ۦۦۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-1281263156)) {
                                            case -1559512407:
                                                str3 = SplashActivity.OooOOO0(this.OooO0O0) != null ? "ۤۧۙۤۨۘۘۗۡۚ۬ۦۘۥ۫ۡۛۗۜۤۙۜۘۡۤ۫۠ۡ۬ۥۤۘ" : "ۦ۠۟ۜۤۦ۫ۢۘۘۨۡ۟ۗۙۦ۟ۦ۠۠ۛۙۧۥ۠ۘۥۘۘۨۥۡ۟۟ۦۗ۟ۦۨۖۘۜۡۘۘ۫ۨۜ۬ۜۡ";
                                                break;
                                            case -651664595:
                                                str2 = "ۥۖ۬۟ۙۢۨۧۙۥۥۘۘۦۘۘۚ۟ۥۙۜۢۥ۟ۡ۬ۚۡۘۤۥۜۘ";
                                                break;
                                            case 927031380:
                                                str3 = "ۢ۫ۢۖۘۦۘۤۨۜۘۤ۬ۢ۬۬ۖۘۙۢۦۤۨۖۘۛۥۡۘۙۧۚۢۢۘۘ";
                                                break;
                                            case 1101019739:
                                                str2 = "ۧۤۚۥ۟ۤۥ۬ۙۛ۟ۦۜۖۚۧۨۜ۠۬ۡۛۦۘۖۥۨۘ۟ۜ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1357407029:
                        return;
                    case 1600776839:
                        sb.append(", msg = ");
                        str = "ۗۛۙ۬ۚۨۘۛۨ۫۫۬ۡۘۡۘۘۖۚۡ۬ۧۤ۟ۥۡۘۡ۟ۜۖۙۡۙۛ۠ۘۡۡ";
                        break;
                    case 1915634833:
                        sb.append("adview onNoAdError:");
                        str = "ۨۤۙ۟ۛۙۤۗۙ۬ۚ۠ۧ۫ۤۥۦۧۚۖۘۚۧۘۘۧۗۜۘۜۢۛ";
                        break;
                }
            }
        }

        @Override // p285z2.InterfaceC4505wh
        public void onAdLoadTimeout() {
            String str = "ۘۜ۬ۛۜۦۘۤ۟ۧۜ۬ۖۤۤۖۥۤ۠ۤۘۡۘ۬ۜۥۘۧۙ۠ۘۖ۬";
            while (true) {
                switch ((((str.hashCode() ^ 445) ^ 923) ^ 751) ^ 2064436166) {
                    case -1925830831:
                        this.OooO00o = true;
                        str = "ۢۥۘۘ۫ۖۖۘۢ۫ۧ۬۠۬ۧۘ۫ۡۦۦۘۚۗۖ۫ۧۙۙۧۨۢۜۖۦۙۜۛۨۘۧۧۘۘۜۘۙۧۡ۟ۧۤۥۘۢۙۜۢۦ۬";
                        break;
                    case -143118331:
                        String str2 = "ۡۜۨۖ۠ۗۛۙۧۨۢۡۤ۬ۙۡۘۥۚۚۢ۬ۥ۬ۜۛۥۜۡۤۖۗۥۘۜۨۖۘ";
                        while (true) {
                            switch (str2.hashCode() ^ (-490952258)) {
                                case -1560952862:
                                    str = "ۨۢۤۖ۫ۦۘۥۨۥۘ۬ۘۤۡۥۨۜۧۢ۫ۘۙۧۚۦۘۤۖۧۜۨ۬۟ۛۤۧۡۡۘۦۛۨۘۦۤۡۘ۟ۛ۫ۢۥۦۘ";
                                    continue;
                                case -624163646:
                                    str = "ۗ۠ۦۘۙۨۖۚۦۦۘۡۖۖۘۨۦۡۘۘۛۜۘۡۙۙۜۢۘۦ۠ۤ۫ۛۥۘۤۥ۟ۜۢۧۨۜۥۘ۫۫ۗۗ۠ۡۘ۟ۛۘ۫ۨۡۘ۬ۙۥۘ";
                                    continue;
                                case 1211285602:
                                    str2 = "ۖ۬ۘۘ۬ۙۨۛۦۧۘۨۢۥ۠ۦ۫۠ۨۡۘۙۜۥۜۤۦۤۦۦۘۨۤۢ";
                                    break;
                                case 1851860985:
                                    String str3 = "ۢۛ۬ۗۡۦۘۢۨ۠ۤۘۨۘۧۢۡۘۤۖۨۘۖۚ۫ۥۤ۠ۙۦۘۗۛۜۘۜۦۧۘۨۡۜۘۖ۟ۡۘۙۗۢ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 1926119199) {
                                            case -1053068379:
                                                str3 = "ۙۙۦ۠ۛ۟۠۬ۗۨۡۖۘۡۗۧۖۥۢۥۥۤۧۜۤۛ۠ۥۘۚۨۥۜۖۘۘ";
                                                break;
                                            case 371671673:
                                                str3 = SplashActivity.OooOOO0(this.OooO0O0) != null ? "ۤ۟ۘۘۛ۟ۥۘۤ۠ۥۘۨۦۧ۬ۖۨۖۘۗۡۥۘ۟ۚ۫۟۠ۥۛۨۥۗۙ۬ۥۗۜۘۖۙۡۘۘۛۦۘ۬ۙۘۡۨ" : "ۢ۫ۥۘۧۖۜۨۢۦۘۖۛۘۗۙۙۖ۟ۤۡ۫ۘۘۧ۟ۤۡۢۥۡۥۖ";
                                                break;
                                            case 671851803:
                                                str2 = "۬ۦ۟ۨۢۥۧۧۙۜۜۨۧۧۦ۟ۦۨۜۢۨۨۘۡۦۧۘۚۦ۠";
                                                break;
                                            case 1890061161:
                                                str2 = "۬۬ۥۘۘ۫ۤۜۡۧۘ۠۫ۖۘۚۚۖۘۧۛۜۘ۠۫ۜۘۦۢ۫ۚ۬ۚۙۡۖۘۜۨ۠۫۫ۖۘ۟ۦۥ۠ۦۧۘ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 13894519:
                        Log.d("XJL_AD_TAG", "adview onAdLoadTimeout");
                        str = "ۡ۬ۤۨ۟ۥۙۚۧۡۘۘۙۦ۠ۨۚ۫ۛۜۘ۟ۚۦۘ۬۠۠ۧ۫ۦۘ۬ۚۡۧۗۗۙ۠ۢ۬ۛۜۘ";
                        break;
                    case 168296801:
                        str = "ۙۘ۠ۧ۫ۗۙۥۗ۠ۖۨۖۗۖۖ۟ۛۨۡۚۢ۟ۥ۟ۡۗ";
                        break;
                    case 478124325:
                        SplashActivity.OooOOO0(this.OooO0O0).OooOOo0();
                        str = "ۨۢۤۖ۫ۦۘۥۨۥۘ۬ۘۤۡۥۨۜۧۢ۫ۘۙۧۚۦۘۤۖۧۜۨ۬۟ۛۤۧۡۡۘۦۛۨۘۦۤۡۘ۟ۛ۫ۢۥۦۘ";
                        break;
                    case 1033214470:
                        return;
                }
            }
        }

        @Override // p285z2.InterfaceC4505wh
        public void onAdLoaded(boolean z) {
            String str = "ۥۤۡۘ۟ۤۨ۠۬ۡ۬ۡۦۚۘۜۘۘۗۚ۬ۛۤۥۖۦۢۛۖۖ۫ۜۙۦۜۘ۠ۚۨۘ";
            while (true) {
                switch ((((str.hashCode() ^ C1801a.f11013aX) ^ 598) ^ 372) ^ (-590666455)) {
                    case -1839144419:
                        str = "۠۟ۥۡۘۖۘۧ۬۟ۡ۟۬ۢ۠ۡۧۤ۟ۙۥۥۘۤۥۡ۟ۛۛۨۤۧۤۖۡۘ۟۟ۤۖۦ۫ۦ۟ۖ";
                        break;
                    case -674380957:
                        Log.d("XJL_AD_TAG", "adview onAdLoaded");
                        str = "ۤ۟ۤۦۚۨۧۧۙۡۜۘ۬ۧ۫ۧۖ۫ۖۤۛۙۡۡۘۘۜۘۘۡۚ۫ۚ۟ۨۚۨۨۜ۬ۨۘۗۢۨ۬ۘ۠ۦۘ";
                        break;
                    case -557642788:
                        return;
                    case -147353004:
                        str = "ۖۙۘۘۢۨ۟ۖۛ۫ۖۚۢۨۙۥۘۖۘۚۙ۫ۖۘۗۘۥۘۦۜۗۤۡۚ۫۠ۦۘۡۛۧ";
                        break;
                }
            }
        }
    }

    public class OooOO0 extends AbstractViewOnClickListenerC3980ia {
        public final SplashActivity Ooooo00;

        private OooOO0(SplashActivity splashActivity) {
            this.Ooooo00 = splashActivity;
        }

        public /* synthetic */ OooOO0(SplashActivity splashActivity, OooO00o oooO00o) {
            this(splashActivity);
        }

        @Override // p285z2.AbstractViewOnClickListenerC3980ia
        public void OooO00o() {
            String str = "ۧۛۗۧۢۢۨۜۛۙۗۘۚۚۥۢۧۥۘۨۤۚ۠ۧۢۨۢۡۘۜ۫ۖۛۜۖ۠ۤۦۛۧۧ۟ۡۘۡۦۘ۠ۧۘۤۧۘۘۤۚۡ";
            while (true) {
                switch ((((str.hashCode() ^ 485) ^ 567) ^ 806) ^ 1539991954) {
                    case 338859930:
                        C4454v3.OooO().OooO0oO();
                        str = "ۧۥۤ۟ۦۢۧ۫ۘۘ۟ۢۜۘۦۧۡۘۛ۠ۚ۬ۢۧ۟ۗۥۥ۟ۜۙ۬ۧۙۢۚۚۨۨۙۤۙۥۥۙۛۡۘۡۚ۫ۜۚۡۘ۬ۢۡ";
                        break;
                    case 513137429:
                        C3951hi.OooOo0O(this.Ooooo00);
                        str = "ۖۤۚ۫ۜۜۜۦ۠۠۠ۢۜۘۢۢۥۦ۫۬ۦۙۦۤۤۗۚۘۧ";
                        break;
                    case 1057569897:
                        return;
                    case 1933489001:
                        str = "ۘۨۜۘۙۘۜۚۜۛۦۘۛۤۖۚۥۥۘۥ۫۫۬ۚۖۘۥۤۘۡۦۖۘۘۧۥۡۤۡۘۦۤ۠ۨۢۛ";
                        break;
                }
            }
        }

        @Override // p285z2.AbstractViewOnClickListenerC3980ia
        public void OooO0O0() {
            String str = "ۜۢۡ۬۟ۦۙۚۦۡ۟ۦۘۦ۠ۦۤۨۢۥۧۢۡۡۧۨۥۜۘۡۧۨ۟۬ۘۖۜۗۛۙۘۘۖ۬";
            while (true) {
                switch ((((str.hashCode() ^ 943) ^ 525) ^ 755) ^ (-2038692282)) {
                    case 132833395:
                        SplashActivity.OooOOoo(this.Ooooo00);
                        str = "۫ۙ۟۠ۧ۟ۜ۟ۖۖۥۨ۠ۦۖ۫ۖۨۤۜۧۦۨۘۜۖۘۘۙۢۗ";
                        break;
                    case 160552058:
                        str = "ۤ۫ۨۘۙۛۥۘۧۘۛۘۡ۠۬ۢۘۘۧۧۥۘۢۖۨۢۦۛۛ۠ۤ۠ۚۦۘۘ۫ۥۜۦۖۘۜۧۘۛۦۧۘۨۡۛۥۨۨۘ";
                        break;
                    case 877974724:
                        return;
                }
            }
        }
    }

    public class OooOO0O implements View.OnClickListener {
        private AlertDialog OoooOoO;
        public final SplashActivity OoooOoo;

        private OooOO0O(SplashActivity splashActivity, AlertDialog alertDialog) {
            this.OoooOoo = splashActivity;
            this.OoooOoO = alertDialog;
        }

        public /* synthetic */ OooOO0O(SplashActivity splashActivity, AlertDialog alertDialog, OooO00o oooO00o) {
            this(splashActivity, alertDialog);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "ۦۘۧ۟ۜ۠ۚ۫ۢۜۢ۬ۗۙۚۥ۟ۜۡۗۥۜ۬۫۟ۤۗۢۘ۬ۖۖۖۘۖۤۙ۫۬۠ۤ۟ۚۜۗۤ۬ۘۧۘۙۤۥۘۦۙۡۘ";
            while (true) {
                switch ((((str.hashCode() ^ 744) ^ 943) ^ 933) ^ (-320266853)) {
                    case -1806099604:
                        this.OoooOoO.dismiss();
                        str = "۫ۦۦۨۚۙۗ۫۫ۗۥۖۘۗۥۙ۟ۤۥۘۖۥۜۘ۠ۥۡ۠ۧۡۗۗۗۛۙۥ۬ۜۡۗۢۙۖۨۘۨۥ۟۟ۢۜۘ۬ۧۤۙۛ۠";
                        break;
                    case -1473167461:
                        str = "ۧۗۨۘۦۖۥۘ۟ۨۨۘۧۢۨۘۡ۠ۢ۟ۜۘۘ۬۟۬ۘۜ۬ۙۙۤ۫ۦۘ";
                        break;
                    case 756413176:
                        str = "ۜۥ۠ۨۥۖۤۥۨۘ۟ۗۦۘ۠ۜۛۨۖۡۛۛۖۘۦۢۢۢۦۤۡ۫ۙ۬ۧۧۛۗۖۘۘۗۘۦۘۘ";
                        break;
                    case 1332958119:
                        ((C4203oa) SplashActivity.OooOOO(this.OoooOoo)).OooOoo0();
                        str = "ۛۧۘ۬۟۫ۙۗۨۜۧۖۧۦ۬ۜۨۢۨۢۤۦۖۡۘۜ۠ۛۧ۟ۧ";
                        break;
                    case 1982298890:
                        return;
                }
            }
        }
    }

    static {
        String str = "۬ۢ۟۬ۙ۠ۦۧۡۘ۫ۘۦۡۘۖۤۦ۫۬۠ۚۤ۬۠ۡۚۨۦ۬ۨۧۨۘۙۙۥ";
        while (true) {
            switch ((((str.hashCode() ^ 115) ^ 919) ^ 381) ^ 930567678) {
                case -42132967:
                    return;
                case 290579443:
                    o00o0O = SplashActivity.class.getSimpleName();
                    str = "ۧۨۖۘۦۗۙ۫ۖۦۘۛۚۥۡۦۦۘ۫ۡۥۛۖۘ۠ۚ۬ۧۤ۬۟۬ۗ۫۟ۖۘۛۦۡ۟۫ۙۘۡۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooOO0(SplashActivity splashActivity, String str) {
        String str2 = "ۡۖۚۦۤۧۨۘۚۙۧۥۘۜۙ۟ۦ۫ۘۖۚۘۘ۠ۨۛ۠ۗ۫ۛۢ۬ۥۜۘۚۡۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 285) ^ 58) ^ 350) ^ 1101416759) {
                case -1964170097:
                    str2 = "ۥ۠ۙ۠ۛۗ۠ۚۤ۬ۜ۬۬ۧۙۦۙۤ۫ۢۜۨۦۥۦۧۘۘۨۨۢۤۦۧۢ۠ۡۘۗۦ۟ۛ۬ۜۘ۫ۦۘۘۚۗۡۘ۠ۙۚ۫ۢۖ";
                    break;
                case -596009514:
                    str2 = "ۙۗۡ۟۬۟ۘۧۘۧۘۜۖۧۡۘۗۡۦ۬ۙۚ۠۫ۗۘۥۦ۠ۙ۬ۨۖۘۢۦۘۦۙۨ۬ۨ۬";
                    break;
                case 77567522:
                    splashActivity.OooOoO0(str);
                    str2 = "ۘۜۛۤۚۧۡۘۗۙ۠ۗۛۡۗۧۗ۬ۦۨۘۜۛۛۛ۟ۤۘ۟ۖۘۚۛ۠۠ۦۧۧۗۗۖۗۤ";
                    break;
                case 1962853154:
                    return;
            }
        }
    }

    public static /* synthetic */ TextView OooOO0O(SplashActivity splashActivity) {
        String str = "ۙۧ۬ۛ۬ۛۗۙۥۘۨۜۘۘۥۛۜۘۜ۫ۨۡۨۖۘ۟ۚۢۡۦۘۨ۫ۖۘۨ۠۠ۘۛۚ";
        while (true) {
            switch ((((str.hashCode() ^ 760) ^ UiMessage.CommandToUi.Command_Type.SET_UIP_DATA_VALUE) ^ 985) ^ (-1509760703)) {
                case -2016478285:
                    return splashActivity.OoooooO;
                case 159078277:
                    str = "ۥۙۗۢۜۘۘۧۚۚ۬ۧۚۘ۟ۧۨۦۜۘ۫۬ۙۨۦۗۗ۫ۡۦ۬ۡ۠ۨۘۡ۠ۦۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooOO0o(SplashActivity splashActivity) {
        String str = "ۗ۟ۚۚۗۢۜۘۢۜۦۘۘۡۧ۫ۨۛۡۤ۬ۦۜۧۘۖ۬ۦۡۡۖ";
        while (true) {
            switch ((((str.hashCode() ^ 381) ^ 736) ^ 42) ^ (-1055762649)) {
                case -1904036554:
                    splashActivity.OooOoo0();
                    str = "ۨ۠ۜۘۦۧۜۙۗۚۛۚۜۘۚۤۙۡۘۗۖۗۨۧ۬ۨۘ۫۫ۦۘۘۢۡۘ۫۬ۥۘۚۤۡ۟ۡۘۤۡۡۘ";
                    break;
                case -1882059643:
                    return;
                case 1026018827:
                    str = "۫ۥۛۚ۫۟ۡ۠ۜۘ۫ۖۗۥ۟ۛۛ۟ۨۢۡۖۘۜ۠ۦۘ۟ۦۘۖ۬ۖۘۢۦۤۨۥۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ AndroidViewModel OooOOO(SplashActivity splashActivity) {
        String str = "ۢۛۧۢۜۦۗۢۡۚ۫ۗۧ۬ۢۥۙۡۘۚۚۘۗ۬ۙۧۧۢۡۧۛ۠ۗۜ۟ۖۡ۠ۜۚۗۦۥۘۛ۠ۗۤ۠ۡۘ۟ۦ۟ۥ۟ۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 773) ^ 806) ^ 38) ^ (-1780883738)) {
                case -1451258012:
                    return splashActivity.OooooO0;
                case 1664410817:
                    str = "۟۬ۚۘۛۘ۠ۤۦۘ۟ۜۧۙۛۜۘۜۢ۫۟ۙۢۤ۫ۡۧۜۧۘۧۨۛ";
                    break;
            }
        }
    }

    public static /* synthetic */ C4283qh OooOOO0(SplashActivity splashActivity) {
        String str = "ۥۛۡۥۗ۫۠ۡۘۖۤ۫ۤۥ۠ۛۨۦۘۗۗۥۘۗۖۡۡ۬۟ۖ۠";
        while (true) {
            switch ((((str.hashCode() ^ 102) ^ 643) ^ 974) ^ 1540189546) {
                case -2119059730:
                    return splashActivity.Ooooooo;
                case -16827112:
                    str = "ۦ۠۟ۜۦۚۖۢۛۖۤۨۘۡۜۜۘ۬ۡۦۘ۬۫ۥۚۖۧۦۗۦۛۜ۠";
                    break;
            }
        }
    }

    public static /* synthetic */ TextView OooOOOO(SplashActivity splashActivity) {
        String str = "ۗۨۨۧۙۚ۫ۘ۫ۙۨۧۖ۬ۨۘ۠ۙۙۧۥۦۘۢۡۗ۟ۢۖۦ۟ۧۨ۠ۢۙ۠ۚ";
        while (true) {
            switch ((((str.hashCode() ^ 141) ^ 163) ^ 23) ^ 130859595) {
                case -1648762833:
                    str = "ۤۨ۫ۚۛ۠ۤۥ۬ۧۥۛۦۨۜۘۡ۬ۥۡۥۡۘۨۡۨۘ۠ۡۛۡۘۖۗ۠ۨۘۧ۫ۗۘۚ۠ۦۤ";
                    break;
                case 1212516303:
                    return splashActivity.Oooooo0;
            }
        }
    }

    public static /* synthetic */ ImageView OooOOOo(SplashActivity splashActivity) {
        String str = "ۨ۟ۛۢۧۛۙ۠ۜۘۚۗۖۘۗۨۦۧۧۙۢۨۥۘۧۢۡۘۦۙۙ۟۟ۢ۠ۥۦ۠ۡۛ۫ۖۖۙۚۜ۠ۖۢ۫ۙۛۙۜۜۧۖۨ";
        while (true) {
            switch ((((str.hashCode() ^ 826) ^ 231) ^ 998) ^ (-1859584053)) {
                case 1329022099:
                    return splashActivity.OooooOo;
                case 1368585561:
                    str = "ۤ۟ۧ۫۠ۗ۟۬ۚOۜۘۨۘۚ۫ۜۘۗۚۛۗ۫ۘۧ۫ۘۘۡۖۦۖ۠ۙۦۧ۟ۤۚ۬ۚ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooOOo(SplashActivity splashActivity) {
        String str = "ۖۦۦۘۙۢ۟ۤۨۛۢۘۦۘۜۘۨ۠ۧۨۨۛۖۨۛۦۘۢۥۥۘۗۗ۟";
        while (true) {
            switch ((((str.hashCode() ^ 895) ^ 549) ^ C1801a.f11013aX) ^ (-1937720147)) {
                case -1184793060:
                    str = "ۥۛۥۡۤۘۘۗۦۛۗۦۨۘۘۖ۟ۦۧۧ۠ۛۨۗۤۤۧۦ۫ۗۤ۬ۨ۫ۜ۟ۥ۠ۥۙۡۘ۟ۡۧۘ";
                    break;
                case -836579498:
                    return;
                case 150021127:
                    splashActivity.Oooo0o0();
                    str = "ۙۢۘ۫ۖ۠ۦۧۜۚ۫ۥۖۗۖۚۘۧۨۥ۬ۦ۫ۡۢۧۧۚۤۗ";
                    break;
            }
        }
    }

    public static /* synthetic */ AndroidViewModel OooOOo0(SplashActivity splashActivity) {
        String str = "ۨۛۨۘۥۡۧۘۖۗۥۘۤۘۨۙ۠ۜۜۨۡ۬۟ۚ۬۠ۨ۫ۡۦ۠ۥۘۖۧۗۨۢۙۡۦۥ۟۫ۜۘ۬ۥۦ۬۫ۦۘۨ۟ۤۚۙۨ";
        while (true) {
            switch ((((str.hashCode() ^ 983) ^ 20) ^ SubsamplingScaleImageView.ORIENTATION_270) ^ 2084649979) {
                case 258262045:
                    str = "ۦۚۨۘۨۘۥۘۨۙ۠ۙۜ۫ۡ۠ۖۗ۬۬۟ۜۢ۬ۢۨۢۦۡۘۤ۫۟۠۠۬ۧ۬ۥۢۛۚۢۦۘ";
                    break;
                case 769407649:
                    return splashActivity.OooooO0;
            }
        }
    }

    public static /* synthetic */ void OooOOoo(SplashActivity splashActivity) {
        String str = "۠۫ۥۘۢۤۖۚۗۗۖۧۨۘۖ۫ۖۧۜۦ۠ۤ۟ۚۨۘۘۦۦۘۧۘۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 558) ^ C1485b.f7083by) ^ 878) ^ 869146094) {
                case -880491329:
                    str = "ۨ۠ۦۘۚۧۦۛۤۡۘۥۧۤ۫۠ۡۢۢۥۢ۠ۨۘۥ۠ۜۢۦۚۦۜۘۢۜۛۗۘۘۢۡۥۘۦ۠ۜۗۘۛۨۖۖۘۦۡ۟ۘۨۜ";
                    break;
                case 207899169:
                    splashActivity.Oooo0OO();
                    str = "۫ۢۨۘۨۗۢۙۗ۠ۤۜۘۘۜۛۤۨۤۖۘۨۙۡۘۤۜۘۦۢۢ۟۬۫۬ۚۘۘۜۢۥۚ۟ۛۗۘۖۡۖۚۚۤۨۘ";
                    break;
                case 1269470240:
                    return;
            }
        }
    }

    public static /* synthetic */ void OooOo0(SplashActivity splashActivity) {
        String str = "۠ۦۦۘ۠ۘۖۘ۬ۢ۠ۥۤۢۥۘۘۚۥ۬ۖۗۧۦۦۧۧ۠ۗۚۥۨ";
        while (true) {
            switch ((((str.hashCode() ^ 397) ^ 510) ^ 719) ^ (-922311617)) {
                case -955413191:
                    splashActivity.Oooo();
                    str = "ۖۙۘ۟۟ۘۨۤ۠ۥۧۜۛۖۥۘۛۦۢۢۖۡۛ۟ۜۘۗۖۦۤۖۧۘۚۚۤ۬ۘۤۨ۟۠۟ۚ۟۠ۨۨۛۦۜ";
                    break;
                case -941174322:
                    return;
                case -217696092:
                    str = "ۙۗ۠ۨۖ۫ۢ۫ۡۘۚ۠ۡۘۚۧۘۜۧۖۘۚۙ۠۠ۖ۫ۧۢۡۦۢۖ۟ۧۜۘۢۤۦۘۘۢۨ۬ۥۖۘۤۢۥۘۗ۟۬";
                    break;
            }
        }
    }

    public static /* synthetic */ int OooOo00(SplashActivity splashActivity) {
        int i = 0;
        String str = "ۗۘ۬۫ۧۖۘۥ۟ۢ۠ۖ۟ۚۙۧۨۡۙۡ۠ۘۘۢۘۘۦ۠ۖۧۥۘ۬ۙۜ۫ۗۦۘ۬۠۫ۧۚۜ";
        while (true) {
            switch ((((str.hashCode() ^ 535) ^ 602) ^ 747) ^ (-1078527075)) {
                case -1911962898:
                    splashActivity.o0OoOo0 = i + 1;
                    str = "ۗۚۜۘۦۢۦۘۛۙۖ۬ۡۤۛۖۧۘۡۗۡ۫۫ۙ۫ۜۗۦۧۢۛۛۧۙۖ۟ۨۨۘۨ۟ۥۖۡۦۘ";
                    break;
                case 606555744:
                    i = splashActivity.o0OoOo0;
                    str = "ۤۙ۠۫۟۬ۧۘ۠۠۠ۨۘۤۢۢۛ۟ۖۦۖ۠ۡۙۤۜۛۨۤ۬";
                    break;
                case 949732059:
                    str = "ۥۧۥۙۦۥۖۢ۟۟ۗۗۧۧۗۗ۠ۨۧ۫ۛۜۢۡۦۘۖۖ۫ۜۘۢۖۦۘۤ۟ۙ۫ۜۛۢ۠ۡۙۨۧۡۘۡ";
                    break;
                case 974133212:
                    return i;
            }
        }
    }

    private void OooOo0O(int i, String str) {
        String str2 = "ۛۖۘۘۥۥۘۘ۫ۛۨۙۖۧۘ۟ۨۢۨۜۨۘۗ۟ۖۘۡۗۢۜ۟ۦۘۦۨۙ";
        while (true) {
            switch ((((str2.hashCode() ^ 263) ^ 166) ^ 955) ^ (-2104998428)) {
                case -1735374029:
                    C4460v9.OooO0O0().OooO00o(i, str, this, new OooOO0(this, null));
                    str2 = "ۥۧۜۨۧۦۜ۠ۥۘۤۡ۠ۢ۟۬ۛۚۙۛۢۦۗۛ۟ۜۛ۠ۚ۬ۗۙۗۧۗ۫ۥۘۚۛۦۘ۫ۗۧ۟ۚۦۘۘۖۥ۬ۥۧۘۜۥ۫";
                    break;
                case -909864877:
                    str2 = "۟۬ۧۙۦۦۛۘۡۤۜۗۚۙۨۦ۠۬ۨۥۦۘۧ۬ۢۛ۟ۢۡ۬ۗۤۜۘۘۨۢ۬ۤۗۘۘۜۙ۠";
                    break;
                case -475423266:
                    return;
                case 442839212:
                    str2 = "ۤ۫ۙۙۚ۬۠ۧۡ۬ۤۦۘۖۤ۬ۗۧۨۛۜۚۧۤ۟ۢۛۥۖۜۢۜۘۗۨ۬ۧ۫ۖۘۡۖۢۨۖۜ۠ۥۚ";
                    break;
                case 605396881:
                    str2 = "ۚۧۨۘۦۜۙۨۛۤۧۚۗ۫ۥ۫ۜۨۡۘۛۜۦۘۛۡ۟ۧ۠۠۫ۗۧ۬۬ۨ۠ۥۨۘ۠ۢۖۧ۬ۦۘ";
                    break;
            }
        }
    }

    private void OooOo0o() {
        String str = "ۗۦۚۥۤۥۘۜۗ۬ۘۡۡۘۙۜۖۨۥۙۘۘۡۡۦۘۡ۫ۖۧ۬ۙۗۘ۫ۤۢۗ۠ۚۢۥۢۜۘۚ۬ۖۖۘۛ";
        OooO oooO = null;
        while (true) {
            switch ((((str.hashCode() ^ 721) ^ 719) ^ 570) ^ (-704141857)) {
                case -2147030474:
                    this.o0OoOo0 = 0;
                    str = "۠۫۬ۚۤۛۦ۬ۜۘۘۛ۠ۧ۟ۙۧۗۤۛۚ۫ۙۚۤۤ۫ۘ۠۫ۖ۫ۨ۠ۘ۫ۖۦۥ۬ۤۚۦۘۧۢۡۘ۬ۤۗ۟ۚۨۥۡۘ";
                    break;
                case -1996030119:
                    String str2 = "ۗۧۛۨۢۡۘۖۘ۫ۧۦ۟ۦۛۦ۬۫ۧۜۦۛ۠ۧۘ۠ۥۨۘۥۙۨ۟۬ۚۖۢۦۦۤۨۧۤۘۘۡۘۘ۟ۗۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1646634532) {
                            case -1305806990:
                                String str3 = "ۜۜۥ۠ۧۖۘۦۥۦۘۥۢ۫ۚ۟ۧۧۜۥۘۗۗۦۘۚۙۛ۬ۡ۟۠ۤۖۙۖ۟۬ۨۙۖۢۛۥ۟ۘ۠ۦ۟ۤۚۙ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-933423683)) {
                                        case -1423818670:
                                            str2 = "۬ۖۨۨۧۧ۬۫ۖۘ۬ۡۘۚۖۧۘۦۘۖۘۙ۟ۥۘۘۗۧ۟ۢۗ۠ۢۢۜۖۘۦۜۛ۟ۗۛ۠ۢۡۘۢۘۜۡۤ۬ۧۨۘۘۧۥۘ";
                                            break;
                                        case -944931646:
                                            str2 = "ۖۡۘۨ۠ۛ۟ۡۙ۠ۡۥۘۤ۬ۜۘ۟ۤۨۧۦۘۖۡۗۛۡ۟ۜ۫ۧ۫ۖ۠ۙۧۦۘۢ۠ۡۘۨ۫ۘۘ";
                                            break;
                                        case -480940010:
                                            str3 = oooO != null ? "ۙۨ۟ۚۡۛ۬۫ۚ۬ۖ۠۫۠ۥۛ۟ۘۘ۠ۖۘۘۡ۫ۙۤۤۖۘ۬ۗۜۘ" : "ۢۛۘۖ۫ۖۥۖۨۘۥۦۜۘۙۥ۟ۡ۬ۜ۠ۨۥ۫ۚ۬ۥ۟ۧۙۘ۬ۖۡۤۜۘۦ";
                                            break;
                                        case 1508511728:
                                            str3 = "ۗۡۤ۠ۧ۟۟۬ۦ۫ۙۡۘۢۦۢۙ۫ۛۗۙۦۢۢۥ۫ۤۦۘۤۧۤ۫ۙ۬ۢۡۚۤ۠ۚۛ۬ۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case -135280779:
                                str2 = "۬۫۬ۦۚۚۙۗۨۚۥۥۘۢۦۜۢۨ۠۬۠ۙۤۗۗۨۗۦۘۥۙۡۜۢ۠۟ۦۙۥ۠۫ۚۖ۟ۗۙۚ۟ۖۗ";
                                break;
                            case 738248811:
                                str = "ۘۥۜۜۘۜۨۦۚۙۦۦ۬ۚۦۧۗۡۢۨۥ۠ۘۙۧۗۡۘۜ۬ۦۘ۬ۢ۬ۛۚ۠۫۟ۚۨۦ۟";
                                continue;
                            case 741933543:
                                str = "ۚۨۛۗ۠۫ۛۥۘۘۙۧۘۡ۟ۡۘۥۛۗۦۜۚۤۥۤ۟ۖ۫ۗۦۦ۟ۦۥۘۗۙۢ۬ۛۚۡۢۧۦۚ۬ۖۤ۫ۡۡۚۥۚۦ";
                                continue;
                        }
                    }
                    break;
                case 224665549:
                    this.ooOO = null;
                    str = "ۚۨۛۗ۠۫ۛۥۘۘۙۧۘۡ۟ۡۘۥۛۗۦۜۚۤۥۤ۟ۖ۫ۗۦۦ۟ۦۥۘۗۙۢ۬ۛۚۡۢۧۦۚ۬ۖۤ۫ۡۡۚۥۚۦ";
                    break;
                case 741658716:
                    oooO = this.ooOO;
                    str = "ۡۜۦۘۙ۬ۖۘۡۢۖۘۜۖۧۘ۬ۖۤ۫ۡۛۧ۠۠ۖۢۜۘۚۢۢۚۧۥۘۢۦ۠ۡ۫ۖۘ";
                    break;
                case 832355971:
                    oooO.cancel();
                    str = "ۚۤ۟ۥۖۦۤۢۤۜۢۤۨۖۙۚۚۨۘۛ۟ۜۘۗۡ۬ۖۜۖۘۛۨۦۘ۠ۜۛۛ۫ۚۘۜۧۥۙۧۦۖ۫۠ۜ۠۬ۨ۟۟ۙ۠";
                    break;
                case 1098357729:
                    return;
                case 1459326635:
                    str = "ۤۚۦۘ۫ۥۤۙۗۚۧۜۖۗۖۦۢۚۨۘۡۧۛۥۥۘۦۢ۫۟ۜۨۤۖۙ۬ۥ۠";
                    break;
            }
        }
    }

    private void OooOoO0(String str) {
        String str2 = "ۨۥۧۘۨۗۤ۬۫ۜ۬ۤۘۨۥۘۙۡۗۧ۟ۥۘۖۘۛ۠ۛۥۤۥۥ";
        C4230p1 c4230p1OooO0OO = null;
        C4230p1 c4230p1OooO0OO2 = null;
        while (true) {
            switch ((((str2.hashCode() ^ 138) ^ 62) ^ 218) ^ 994027883) {
                case -2082465226:
                    c4230p1OooO0OO.OooOOoo(o0oo0000.OooO0O0);
                    str2 = "ۤۚۧۧۧۨۙ۟ۦۢۙۛۖۘۨۘۜۘۚ۬ۘۤ۠ۧ۬۟ۨۧۡۨۘ۫ۛ۫ۛ۟ۨۚ۬ۜۗۢۨۤۙۨۘۖۘۦۘ۬ۦ۫ۨۨۡۘ";
                    break;
                case -1729709911:
                    return;
                case -1352959474:
                    str2 = "ۗۛۨۜۡۖۢۡ۠ۢۙۡ۫ۛۖ۬۬ۨۖۘۤۗ۠ۙۖۖۛۛ";
                    break;
                case -1343221969:
                    str2 = "۟ۥۖ۠ۨۨۜۨۖۘ۠ۛۘۛۘۤ۟۫۫ۗۖۡ۬ۢۡۘۧۛۛ۫ۘۚۗۖۡ۠ۨۧۨۡۥۦۛ";
                    break;
                case -1094201611:
                    c4230p1OooO0OO2.OooOOoo(o0oo0000.OooO0OO);
                    str2 = "۬ۨ۠ۨۧۡۚ۬ۗۡۜۘۥۡۗۘۘۘ۫ۢۗۤۥۨۚۜۛۖۖۛۦۨ۟ۚۦۚ";
                    break;
                case -905466173:
                    str2 = "ۖۥۦۜۛۢ۬۬ۥۢۜۘۧۜۙۨۖۥۗۗ۬ۚ۟۟ۗ۬ۡۘۘ۫ۚ۫ۖ۟ۗۢ۠ۦ۫ۜۘۜ۠ۜۘۥ۫ۡۘۚۢۘۦۧۜۧۛۘ";
                    break;
                case 271338947:
                    this.Ooooooo.OooO0o0();
                    str2 = "ۛۗۜۘۚۜۥۘۢۧۢۨۚۘۘۦۨۧۘۢۜۜۘۛۘۦۘ۠ۦۢۗ۫ۨۘ۫۠ۧ";
                    break;
                case 535749992:
                    C4122m4.OooOOO(this, str, this.OooooOo, c4230p1OooO0OO2);
                    str2 = "۬ۦۥۨۨۥۘۢ۟ۤۧۚۙ۟ۛۚ۟ۧ۬ۧۘۨۘ۫۠ۘۧۙۙۨۜۙۦۡۖۛۦۨۢۥۡۜۘ۠ۤۖۡۗ۬ۡۘۗۨۘۘۗۨۥۘ";
                    break;
                case 556831751:
                    C4122m4.OooOO0O(this, str, this.OooooOo, c4230p1OooO0OO);
                    str2 = "ۗۛۨۜۡۖۢۡ۠ۢۙۡ۫ۛۖ۬۬ۨۖۘۤۗ۠ۙۖۖۛۛ";
                    break;
                case 1502211776:
                    String str3 = "ۢۨ۬ۙۗۡۖۦۖۘۜۗۡۥ۠ۦۘۛ۠ۗۜۖۥۙۥۦ۫ۨۚ۟ۨۛۦۗۛۘۦۚۨۥۘ۟ۜۡۜۦۘۘۢ۬ۦ۟۟ۧۘ۟ۛ";
                    while (true) {
                        switch (str3.hashCode() ^ (-56606410)) {
                            case -2092578481:
                                str3 = "ۧۗۧۜۘۜۘۡ۟ۥ۬ۘۥۘ۠ۙۜ۠ۢۗۤۤۖۛۘۘۗ۬ۦۧۡۢ";
                                break;
                            case -2054553388:
                                String str4 = "ۚۗۜۜۘۚۥۗۖۦۨ۟ۨ۟ۗۙ۟۫ۘ۟۫ۤ۬ۜ۟ۥۦۘۛۦۧۘ۠ۘۥ۟ۚۖ۬ۨۧ۫۠ۥۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ 2009584008) {
                                        case -1639060104:
                                            str4 = "ۛ۠ۘۘۖ۠ۖۘۢۥۥۘۥۗۧۗۚۖۤۡۚ۟۬ۜۦۙۥۖۘ۟ۘۤ۬ۛۢۧۜۢ";
                                            break;
                                        case -1151689167:
                                            str3 = "ۚۙ۫ۡۛۜۘۧۡۦۘ۬۠ۜۘ۬ۙۘۘۨۥۜۧۘۢۖ۟ۧۛۤۜۘۛۚ۠ۥۛۖۘ۬ۘۗۤۘۥۘۚ۟ۖۘ";
                                            break;
                                        case -269120864:
                                            str3 = "ۜۦ۠ۦۤۜۘۨۙۜۘۢۘۜۡۨۦۘۚۗ۬۟ۥۧۘۚۖۡۘۘۘۤۦۙۦ۫۠ۢۙ۠ۧ";
                                            break;
                                        case 575407148:
                                            str4 = str.endsWith(".gif") ? "ۛۚ۬ۗۨۦۜ۫ۡۗۥۧۛۥۘۘۘۘۛ۟ۜۡۡۘۖۘۡ۠ۛۨۘۗۡۜۘۢۚ۟" : "ۨۛۥۘ۠۟ۡۚۗ۫ۡۜۖۗ۟ۢۘ۠ۨۘۤۤۦۥۤۡۢۖۘۘۤۤ";
                                            break;
                                    }
                                }
                                break;
                            case -1793959597:
                                str2 = "ۜۖ۠ۚۤۥۨۢۚۥۤۡۘۘۗۘ۫ۤۛۧ۬۟۬۟ۚۙۚۤۖۤۤۙۜۜۢۖ۬ۥۤۖۢۡ";
                                continue;
                            case 1249938160:
                                str2 = "ۢۢۚۖ۬ۘۘ۟۫ۙۤۡۢۖۙۡ۟ۗۧۤۥ۠ۛۥۜ۫ۙۡۘۘۛۡۘۚۥۦۘ۫۬ۖ";
                                continue;
                        }
                    }
                    break;
                case 1543779688:
                    str2 = "ۚۤۦۘۢ۠ۦۗۦۦۖۦۥ۠۫ۨ۬ۙۖۢ۠ۦۙۢۘۙ۠ۡۘۢ۠۬ۛۜۘۘۤۙۜۥۙۖ۟۟ۛۨۙۥ۟۫ۦ۫ۨۘۜۢ۟";
                    c4230p1OooO0OO2 = C4122m4.OooO0OO();
                    break;
                case 2076540360:
                    c4230p1OooO0OO = C4122m4.OooO0OO();
                    str2 = "ۨۧۜۘۨۧۜۗۙ۫ۥۥۥۘۤ۬ۚۘۚ۫ۤۢ۬ۥۦۢ۟ۡۤۤۜۨ۠ۢۨۥۢۢۚ۟۬ۗۦۘ";
                    break;
            }
        }
    }

    private void OooOoOO() {
        String str = "ۦۘ۟ۦ۠ۘۘ۬۠ۘۘ۫ۢ۠ۤ۬ۘۗۤۦۙۥۖۢۢۨۜۡۦۢۦۜۤۥۖۘۧۦ۬ۨ۠ۘۘ۟ۛۛ۬ۚۜۘۛۙۚ";
        final AlertDialog alertDialogCreate = null;
        AlertDialog.Builder builder = null;
        View viewInflate = null;
        while (true) {
            switch ((((str.hashCode() ^ 547) ^ 370) ^ 453) ^ 1761760642) {
                case -528549207:
                    alertDialogCreate.show();
                    str = "ۡۘۗۢۗۙۧۢۦۘۨۤۢۖۘۥۘۗۨۨۘۗۖۜۜۜۖۘ۟ۦۡۗۘۥۘ۫ۗ۟۫۠ۢۛۥۘۥۙۙۦۡۤۤ۬ۜۚۗۘۡۘ";
                    continue;
                case -146823042:
                    alertDialogCreate = builder.create();
                    str = "ۙۙۨ۬ۡ۫ۛۦۜۘۥۥۨۘ۟ۦۨۙۤۛ۬ۚ۫ۜۧۤۘ۫۬ۢۡ۬ۛۗۥۥ۫ۥۤۘۡۚۧۥۢ۫ۛ۬ۡ۬ۨۚۖۗۜۘۘ";
                    continue;
                case -93432580:
                case 1717416367:
                    return;
                case 340254965:
                    String str2 = "۟ۜۥۘۧۢۢ۠ۛۥۖۤۚۡۡۘۙۨۙۖۥۦۥۜۥۘ۠۠ۨۘۜۦۦۘۗۧۙۛۧۗۤۛۖۜۗۦۘۤۛۖۘۙ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1622780366)) {
                            case -1282622447:
                                break;
                            case -58098537:
                                str = "ۥۜۜۜ۠ۖۘ۟ۥ۠ۛ۬ۥۘۜۖۥۘ۟ۛۤۜۡۙۜۤۥ۫ۥ۫ۘۚۡۜۙۥ۟۟ۗۗۖۚ۠ۧۨ۟۬ۚ۫ۤۘۘ";
                                break;
                            case 194839722:
                                String str3 = "ۦۦۦۘۖۖۡۘۗ۬ۚۛۤۘۡۗۤۚۥ۬ۢۘۧۗۤ۟۟ۚۙ۟ۨ۠ۢۜۨۘ۠۫ۚۧ۬ۖۘۘۘۛۡۜۨۢۗۨۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-741877142)) {
                                        case -1625537706:
                                            str2 = "ۘ۬ۖۤۤۛۤ۬۫ۥۧۘۤۧۨۘۜۥۛۚۨ۟ۧۦۥ۟۬ۦ۫ۛۤ";
                                            break;
                                        case -692204101:
                                            str3 = "ۨۡۖۘۜۡۛۘۙ۟ۘۜۦۦۤۦۤۡۙۧۗۥۘۥ۬ۡۤۖۖۘۤۛۜۧۨۜۘۚۦۦۘۙۥۧۥ۬ۥۘۚۚۢۦۖۡ۟۫ۗۜۧۗ";
                                            break;
                                        case -327945225:
                                            str2 = "ۚۥۙۤۚۨۗ۠ۜۢۨۗۙۢ۠ۥۤۥۘۧۢۥۥۖۧۖ۬۠۫ۜۥۘۢۦۦۘۢۜۧۥۘۜۜۜۗۙۨ۠ۢۡۘ";
                                            break;
                                        case 1738284681:
                                            str3 = Build.VERSION.SDK_INT >= 23 ? "ۛ۫ۚۧۨۦۥۥۦۘۧ۬ۦۜۘ۟ۘۙۧۘۡۘۧۡۚۘۛۖۘۚۖۚ" : "۫۬ۢۗۤۗ۬ۙۨۘ۠ۙۥۘۦۡۡۙۨۖۤۨۡۖۢۘۧۢۤۖۖۡۡۖۗۗ۫ۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case 703146720:
                                str2 = "۫۬ۗۙۖ۬ۧۦۧۘۥۥۡۘۖۘۗۦ۠ۡۘ۬۫ۛۙۥۦۥۚۜۘۧۢ۟۠ۡۚۢ۬ۦۘۥۛ۟ۤ۫ۛۨ۟ۥ۠ۘۚ";
                                break;
                        }
                    }
                    break;
                case 627020458:
                    viewInflate.findViewById(R.id.dialog_miuiguide_button_open).setOnClickListener(new View.OnClickListener() { // from class: z2.h9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.OoooOoO.Oooo000(alertDialogCreate, view);
                        }
                    });
                    str = "ۦۡۢ۟ۙۡ۠ۚۖۘۡۗۖ۬ۧۚ۟ۢ۬ۚۢ۫ۚۙۚۙۨۘۜ۬ۙۛۧۜ۬ۨۚ۠۫ۦۘۘۛۡۘۤ۟۟ۧ۫ۖۘۤۤۦۦۨۨۘ";
                    continue;
                case 1130792191:
                    viewInflate = getLayoutInflater().inflate(R.layout.dialog_miuifloatview, (ViewGroup) null);
                    str = "ۗۚۘ۟ۙۡۘۨۢ۟ۢۢۥۘ۬۬ۨۗۙۥۘۢۜۨۘۡۖۡۘۧ۠۠۠ۖۗ";
                    continue;
                case 1647983172:
                    String str4 = "ۚۧۡۖ۬ۡ۟ۥۘۘۡۦۚۦۦۘۘ۟ۜۦۡۜ۫۬ۙۡۘۢۜۥۛۨ۟";
                    while (true) {
                        switch (str4.hashCode() ^ 180553391) {
                            case -1460465403:
                                String str5 = "۫ۛۖۘۢۖۥۗ۟ۡۘۛۤۘ۬ۨۛۜۙۖۘۖۦۙۧۦ۫ۥۥۡۘ۫۟ۨۛ۬۠۫۬ۢ۫ۡۘۖۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-2000688563)) {
                                        case -1056169597:
                                            str4 = "ۙۡ۠ۥۤۦ۫ۦۜۖۖۨ۫ۛۥۛۗۖۖۨۘۛۤ۫ۨۘۡۢ۠ۙۘۘۥۤۦۘ";
                                            break;
                                        case 247801864:
                                            str5 = !Settings.canDrawOverlays(this) ? "ۥ۬ۘۘۢۨ۠ۡ۟ۘۘ۫ۚۨۘ۟ۥ۟ۧۙۤۚۡ۠ۜۜۜ۫ۗۛۗۖۗ۠ۘۡ۠ۢۚۙ۟ۢۚۗ۫ۥۥۘ۬ۨ" : "ۢ۟ۨۧۖۖۢ۟۬ۘۥۗۧۥۧۘۘۙ۫ۥۖۛۥۛۡۘ۫ۛ۠ۡۙ۬ۧۗۦ۬ۛ۟ۥۜۡۘ۟ۤۜۘۢۚۛۜۛۚۢ۠۟۟ۖۖ";
                                            break;
                                        case 1532544371:
                                            str5 = "ۖۛۜۘ۠ۡ۫ۖۘ۠ۗۘۡۛۢۖۘۢ۟ۜ۠ۨۤۥۤۧۛ۫ۙ۠";
                                            break;
                                        case 1826851739:
                                            str4 = "۫ۦۚۤۦۙۙ۠ۦۦۡۨۖۥۘۨۢۘ۟ۙۥۢۡ۫ۙۦۛۚۡ۠ۡۧ۠ۜۢۦۙۥ۬ۛۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case 377813095:
                                break;
                            case 1896444924:
                                str = "ۜۤ۠ۗۙۘۘۛۤۖۘۡۗۡۘۨ۬ۨۘۢ۫۠ۚۡۖۘ۠ۤۥۙۖۦۨۦ۠ۜ۠ۦ۟ۗ۬۟ۘۜ۟۟ۚ";
                                break;
                            case 2120313853:
                                str4 = "ۦۤۨۜۢۢۤۨۘۡۥۖۘۦۖۚۗۚۡۘۧۗۜۘۚۢۡۨۦ۠ۤۢ۬ۨۤۗۜۥۙ۟ۗۢۛۥۦۘۥۤۨۙۦۢۜۗۙۜۤۙ";
                                break;
                        }
                    }
                    break;
                case 1738852447:
                    str = "ۜۢۥ۟ۨۡۡۛۜۧۡۙۡۤ۫۫ۖۚۙۤۤۘۜۙ۠ۗۚ۠ۙۜۥۘۡۡۡۨۘۙۗۥۖۙۨ";
                    continue;
                case 1767946568:
                    ((C4203oa) this.OooooO0).Oooo000();
                    str = "۠ۡ۟ۘۡۚ۬ۜ۬۠ۨۧۘ۫ۚۘۦۧۜۘۥۤۚ۠ۖۥۘۙۙۖۡۖۛ۫ۘۢ۫ۗۛ";
                    continue;
                case 2021042691:
                    builder.setCancelable(false);
                    str = "ۨۘۘۘۘۦۨۘۧۗۢ۬ۦۥۘ۫ۘۦۘۥ۫ۨۙۤۛ۫ۙۘۘۘ۠ۜۧ۫ۜۘ";
                    continue;
                case 2112961941:
                    builder.setView(viewInflate);
                    str = "ۜۙۚۗۢۧۡۘۘۙۚۘ۟ۜۥ۫۫ۘۨۤۗ۟۬ۜۜۧۨۘ۟ۛۜۦۤۘۘ۟ۚۖ۫ۨۤۚ۠ۜۧۡۘۘۘۢۙ";
                    continue;
                case 2116041101:
                    builder = new AlertDialog.Builder(this);
                    str = "ۗ۬ۡۛۢۜۤۥۖ۫۠ۗۢ۟ۤ۬ۚۜۙۥۖ۠ۦۖۥۘۘۘۨ۬ۧۧۖۘۧ۠ۜۤۛۡۘ۬ۗۡۘۨۜۜۘۜۙۧ";
                    continue;
            }
            str = "ۖۢۛۗۡۛۛ۬۟ۖۢۗۘۧۚۙۥۢۖۨۘۜۤۧۚۖۡ۫ۧۘۘ";
        }
    }

    private void OooOoo() {
        String str = "ۥۥۨۘ۫ۖۢۦۙۤ۟ۗۘۘۜۖۜۧۢۗۤۖۨ۫ۜۦ۫ۛۦۘۛۦۘۢ۟ۨۦۛۘۘۢ۠ۡ۟ۖۧۨۘۡۘۤ۫ۡ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_ENABLED_VALUE) ^ 546) ^ 692) ^ (-31442733)) {
                case -1944750606:
                    return;
                case -1516074371:
                    C4496w8.OooOO0o(1);
                    str = "ۧۖۘۥۗۤۜۥۚۧۘۙۡ۠ۘۘۨۦۜۨ۬ۨۘۨۗ۟ۨۧۦ۠ۗۘۘۙۜ۬ۤ۬ۥۙۥۢ۬ۘۨۘۜۛۦۘۘۦۖ";
                    break;
                case -81389354:
                    ((C4203oa) this.OooooO0).Oooo0oo();
                    str = "ۨۥۨۖ۬ۦۘۘۡۚ۠ۙ۫ۗۚ۬ۥۡۜۦۧۜۡ۬۬ۤۢ۠ۖ۫ۖۘ۠ۜۢ۟ۘۡ۫ۘ۟۟۬ۥۤۡۡۘۧۘۘۖۖۨۘۖۨۚ";
                    break;
                case 687748862:
                    str = "ۖۜۚۥۥۡۚ۠۠ۤ۫ۗۥ۬ۜۘۡۤۥۘۚۖۛ۫ۛۧ۟ۦۙ۬ۨۛۤۙۥۡۖۜۢۥۧۘۡ۟ۡۘۚۜۢۛۚ";
                    break;
            }
        }
    }

    private void OooOoo0() {
        String stringExtra = null;
        String str = "ۖ۫ۨۜۖۖۘ۫ۘۜۧۨۦۘۢۗۚۦ۬۟۫ۢ۬ۤۙۖۤۡۡۡۜ۠ۜۡۜ۟ۛۡۘ۫ۧۦۘ۬ۚ۠۬ۗۙۥۦۚۚۡۘۥ۬۟";
        while (true) {
            switch ((((str.hashCode() ^ 709) ^ 921) ^ 456) ^ 874590507) {
                case -1207238771:
                case -532332795:
                    break;
                case -1006266026:
                    return;
                case -341392195:
                    String str2 = "ۨۤۦ۫ۧۘۡۥۚۜۘۜۘۘۗ۬ۚۨۨ۟۫ۥۘ۬۠ۧۘ۟۫۬ۡۨۛۚ۟ۜۥۚ۫ۚۨۘۧۚۘ۠۬ۖۖۢۡۘ۠ۥۥۘ۠ۢۖ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1497296800)) {
                            case -868948310:
                                String str3 = "ۥۢۦۛۘۖۚۦۜۛ۟ۤۡۡۡۢۥۦۨ۠ۗۤۘۜۘۥۘۡۘۡ۫۟ۜۢۡۘۧ۬ۥۘۤۤ۟۟ۦۧۘۛ۟ۖۘۛۤۦ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-749315437)) {
                                        case -318887938:
                                            str3 = "ۙۥۡۘ۟ۨۙ۬ۥۥۘۢۡۡۘۧۢۤ۠ۘۨۦۖۚ۟ۨۘۧ۫ۛۗۧۜۙۜۘۤۢۥ۟ۖ۠ۢۨۤ۬ۗ۫ۢۜۚۘ۬ۜۘ۫ۥۘ";
                                            break;
                                        case 105723588:
                                            str2 = "ۤۢۘۢۢۜ۟ۜۧۘۜ۬ۧۗۙۢ۠ۨۚۙۖۡۨۜ۬ۚۘۘۘۙۨۘۢۨۤۘۙ";
                                            break;
                                        case 1403454784:
                                            str3 = stringExtra.equals("PowerBoot") ? "۫۟ۥۘۚ۠ۜۘۤ۬ۤۧۚۥ۬ۘۤۛ۬ۘۘۦۛ۬ۥ۠ۖۥۨ۠ۜ۟ۥۤۜۘۘ۠ۢ" : "ۚ۠ۖۨۧۨۖۨ۬۠ۦۡۤۖۛۙ۟ۥۘۢۢۨۘ۟ۗۨ۠ۜۦۘ۟ۡ۠ۘۦۘۘۖ۠ۤۡۘۖۖۨۙۜۚۡۤۥۖۘۗۜۨۖۨۨ";
                                            break;
                                        case 1671218158:
                                            str2 = "۬ۙۘۘۨۢۦۜ۟ۦۙۛۙۖۜۖۘۘ۫ۡۦۛۡۘۧۡ۫۫ۦۥۘ۠ۡۘۘ۫ۦۧۘۥۖۘۡۤۥۧۢۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case -244444319:
                                str2 = "۟ۗۗۥۘۨۘۥ۟ۜۚۡۧۘ۠ۚ۟ۡۗۥۨ۬ۜ۠ۗۡۘۤۥۨ۬ۥۤ۟ۙ۟۟ۡ۫۠۬ۘۘۡ۟ۨۡۧۡۥۧۡۘۘۜۖۘۢۚۙ";
                                break;
                            case -220033853:
                                str = "ۥۥۥۘ۟ۜۚۛۥۦۗ۠ۜ۟ۥۢۚۘۨۘۧۘۦۘۚۦۨ۬۟ۤۖۧۡۚۨۚۤۡۘۗ۬ۙ۟ۜۘۥ۟ۜۘ۫۠ۡ";
                                continue;
                                continue;
                            case 657955961:
                                str = "ۖۦ۠ۙۤۖۘۦۤۙۨۛۨۗۢۖ۠ۤۖۘ۠۠۠ۡۘۥۧۘۗۨۤۚ";
                                continue;
                        }
                    }
                    break;
                case 164363231:
                    AppContext.OooO00o().OoooooO = true;
                    str = "ۦ۠ۧۢۘۥۢۙ۬ۧۘۛۥۖۜۘۛۙۗۙۚۥۘ۬ۡۜۜۚۖۘۧۨۙۗ۟۬۫ۤۖ۟ۘۦۘۗ۫۬ۛۗۦۘۢۘۘ";
                    continue;
                case 986587796:
                    stringExtra = getIntent().getStringExtra("type");
                    str = "ۦۦۗۤۛۜۨ۫ۢۜۤۧ۟۬ۡۜۖۡۘۖۤۨۘۨۡ۠ۙ۫ۚ۫۠ۨۘ";
                    continue;
                case 1028542098:
                    AppContext.OooO00o().Ooooooo = false;
                    str = "ۘۡۖ۫۫ۖۘۤۡۗۡۜۤۙۗ۟ۨۦۨۘ۠۠ۙۤ۬ۜۘۥ۠ۢۖۖۡۘۥۡ۠۫ۧۚۢ۟۟۟ۨۙ";
                    continue;
                case 1194964405:
                    AppContext.OooO00o().Ooooo0o = C3863f4.OooO0O0(this);
                    str = "ۘۡۘۘۙ۠ۜۨۥۖۘۧ۫ۥۘ۬ۥۥۨۗۥۘۛۗۥۘۖۗ۬۟۬ۨۗ۬۫";
                    continue;
                case 1196482276:
                    String str4 = "ۘۖ۫ۦۘۙ۠ۖۥ۫ۨۥۘۤ۬ۤۖۛۖۘ۬ۦۡۘۨۤۖۘۜ۫ۦۦۨ۬ۚۜۥۗۙۡۘۢۗۖۘ۫ۖۛ";
                    while (true) {
                        switch (str4.hashCode() ^ (-220838743)) {
                            case -1553698069:
                                str4 = "ۥۖۢۦۦۜۘۤۙۗۚ۫ۢ۠ۤۢۖۖۥۘۤ۠۬ۜۗۖۘۜۡۡ۫ۢۡۘۨۜۦۧۜۘ۬ۗۢۘۗ۟ۦۨۖۥۤ";
                                break;
                            case -1413234290:
                                str = "ۗۗۖۙۛۛۛۨۘۘۙۜۙۜۢۥۘۗ۠ۜۘۗۦ۫ۘۖۦۘۛۤ۫ۚۦۡۡۤۤۦۦۖ۟ۛۘۘۧۦۘ";
                                continue;
                                continue;
                            case -1040202124:
                                String str5 = "۠ۛۥۨۛ۬ۖۦۖۡۦۜۡ۫ۥۧۧ۬ۜۖ۫۠۠ۦۘۦ۠ۧۙۗ۠ۙۡۦۦۤۜۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1870242605)) {
                                        case -1931614803:
                                            str4 = "ۘ۟ۘۧۦۤ۠۟ۨۡ۠۟ۦۘۖۘۙۙۤۨۜۛۗۤۦۧۗۦ۬ۗ۬ۥۥۘۧۦۢۡۖۧۜۦۥۘ";
                                            break;
                                        case -75395681:
                                            str5 = "۠ۗ۫ۧ۬ۢ۠ۜۨۘۤۢۛۜۡۦۘ۬۟ۖۘۜۡۢۜۙ۬ۧۜۙۦۦۘۘ";
                                            break;
                                        case 981237602:
                                            str5 = !TextUtils.isEmpty(stringExtra) ? "ۜۖۥۘۧۧۦۘۧ۫ۡ۬ۡۦۘۙۡۧۦۧۘۘۗۢۖۚۧ۫۬ۛۦ۬۫ۧ۠ۢ۬۬ۜۜ۫۠۬ۛۡۘۖۦۛۨۢۖ۬ۘۛۗۥۜۘ" : "۫ۤۙ۬ۘۦۘۛۡۧۘۥ۠ۙۙۧۗۘۨۤۢ۬ۘ۬ۧۚۖۜۛ۫ۥۘۧۖۦۨۘ۬ۜۦۜۙۘۘۦۛۦۘۨۢ۫";
                                            break;
                                        case 2089933475:
                                            str4 = "۟ۙۤۤ۠ۡۙۖ۬ۘۘۡ۠ۗۢۘ۬ۦۛ۫ۙۥۛۛۡۚ۬ۛۢۡۘۜۧۚۜۨۡ";
                                            break;
                                    }
                                }
                                break;
                            case 373231918:
                                str = "ۥۥۥۘ۟ۗ۟۬۟ۦۘۤۖۜ۬ۚ۟۠ۢۢ۟ۛ۫ۥۤۡ۠۬ۥ۬ۥۗ۬ۖۚ۠ۥۗۛۜۢ۠ۛۖۘ۬ۦۡۘ۠ۚۥۘ";
                                continue;
                        }
                    }
                    break;
                case 1348877490:
                    AppContext.OooO00o().OoooooO = getIntent().getBooleanExtra("sIsBooted", false);
                    str = "ۛ۠ۥۢۤۗ۟ۚۧۙۚۖۘۨ۫ۡۘۢ۫ۛۥۢۖۖۖۘ۬ۨۘۥۥ۠ۛ۟ۨ۟۬ۢۘۧۗۧۜۘ";
                    continue;
                case 1470619260:
                    C3939h6.OooO00o();
                    str = "۫ۤۡۖۜ۟ۜۦۜۧۜۤ۫۫ۡۘۦۥۨۜۦۙۘۙۥۘۗۙۨۖۦۥۘ";
                    continue;
                case 1473781445:
                    OooOoo();
                    str = "۬ۜۨۢۤ۫ۢۡۘۗۤۨۡۡۥۘۖ۫ۢۤۚۥۡ۬ۘۡ۠ۘۜۡۨ۟۟ۙ۬ۨۢۥۚۡۤۥۦۘۧۤ۟ۚۙۧ";
                    continue;
                case 1559754635:
                    AppContext.OooO00o().Ooooooo = true;
                    str = "۫۫ۢ۟ۦۨۘۤۡۜۘۙۨۘ۬ۚۖۡۚۛۘۘۘۥۨ۬ۤۦۨۗۗۥۛۥۚۘۛ";
                    continue;
                case 1629454270:
                    String str6 = "ۙۘۢ۟ۜ۫ۨۚۖۜۜۜ۟ۡۦۢۘۛۨۥۨۘۚ۠۫ۛۖۚ۠ۙۜۘ۠ۜۘۘۚۦۥۛۚۦۦ۟ۥۦۘۖۘۡۧۤ";
                    while (true) {
                        switch (str6.hashCode() ^ (-1776875501)) {
                            case -1865535006:
                                str = "ۗۙۜۘۖۧ۠۟ۙ۠ۖۡ۠ۢۜۦۘۧۚ۫ۙۥۦۘۨ۟ۘۘ۠ۗۨۘۦۖ۬";
                                break;
                            case 1352871630:
                                str6 = "ۤۧۖۘۘۤۛ۬ۗۜۡۡۨۖۧۘۨۙۖۚۨ۟ۗۡۙ۬۟ۨۛ۫ۙ";
                                break;
                            case 1604915579:
                                String str7 = "ۖۙۙۚۘۡۘ۠ۡۜۧ۠ۙۢۢۘۘۥۥۢ۠ۡۢۢۗۚۜۘ۠۬ۘۡ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1488442937)) {
                                        case -1119516640:
                                            str7 = stringExtra.equals("AppReboot") ? "۟۬ۘۘۥۨۘ۟ۖۥۖۘ۠ۖۙۛۤ۬ۧۛۜۜ۠ۧۨۘۨۡۧۘۗۨۦۤۧۖۖۗۚ۫ۡۢۦۡۡ۟ۚۜۥۛ" : "ۥۜۗۢۨۢۧ۬ۛۤ۫ۖۥۜۡ۟ۡۜۘۤۙۙۜۦۡ۬ۖ۟ۦۦۙ";
                                            break;
                                        case -469875411:
                                            str6 = "ۧ۫ۥ۠ۥۢۖۢۘۘۘۡ۬ۦ۟ۛ۟ۙۧۜ۫ۨۥۡۢۨۦۨۘۛۦۘ۠ۜۢ۬ۙۡ";
                                            break;
                                        case 397359160:
                                            str7 = "ۢۦۦۘۛۢۜۧۖۘۨۛۗۜۘۛۢ۟ۗۘۛۚ۬ۨۖۤ۟۠ۤۡۧ۫۟ۜۡۨۖۘۦۨ۬۠ۖۚۤ۟ۥۘ۠ۚۙۡۤۘۘ۫ۤۡۘ";
                                            break;
                                        case 1077830609:
                                            str6 = "ۜۦ۟۫ۤۚۜۙۘۚۙۤۚۥۦ۫ۗۤ۫ۤۛ۠۟۟ۦۗۡۘۖۢۥۧۗۦۘ۫ۤۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1725918537:
                                break;
                        }
                    }
                    break;
                case 1767987967:
                    str = "۟ۜۗ۟۫ۛۧ۠ۧ۬ۙۧۛ۠ۥۜۖۘۖۢ۫۟۬ۦۘۤۘۜۢۦۤۥ۬ۜۘۜۥ";
                    continue;
            }
            str = "ۘۡۖ۫۫ۖۘۤۡۗۡۜۤۙۗ۟ۨۦۨۘ۠۠ۙۤ۬ۜۘۥ۠ۢۖۖۡۘۥۡ۠۫ۧۚۢ۟۟۟ۨۙ";
        }
    }

    private void OooOooO() {
        String str = "۫ۧۤۖۤ۫ۥۜۨۗۘۚۥۢۧۢۦ۠ۚۛۜۘۥۨۖۘۤ۫ۥۘۗۡۘ۟ۘۦۥۘ۬ۦۧۥۘۖۗۦۡۘۦ۟ۦ۠";
        while (true) {
            switch ((((str.hashCode() ^ 855) ^ 521) ^ 170) ^ 1378575247) {
                case -1732675674:
                    C4173ni.OooO0o().OooO00o(new OooO0OO(this));
                    str = "۠ۖۡۨ۠ۧۤۛۙۜۛۚۤۨۡۘ۟ۨ۠ۢۢۛ۫ۢۙ۬ۛۛ۫۬ۡ۠ۧۜۥۨۦۘۥۘۥۘۘۚ۟ۥۙۢۧۥۨۢۛ۟ۖ۫ۛ";
                    break;
                case -1635161256:
                    return;
                case 437969111:
                    str = "ۗۘۡۘۧ۠۫۫ۡۡۘۨۥۜۤ۫ۢۢ۫ۨۘۧۘۜۙۥۧۦۙۨۢۨ۬";
                    break;
            }
        }
    }

    private /* synthetic */ void OooOooo(AlertDialog alertDialog, View view) {
        StringBuilder sb = null;
        String str = "ۡ۠ۥۜۙۧۜ۫ۘۘ۟ۤ۬ۛۙۛۤۦۥۚۤۥۗۙۛۨۘۤۖۢ";
        while (true) {
            switch ((((str.hashCode() ^ 744) ^ 678) ^ 997) ^ 1710194229) {
                case -1887008928:
                    alertDialog.dismiss();
                    str = "ۦ۫ۥۘۚۡۥۢۡۘۤۚۜۘۨ۫ۡ۠۬ۛۛ۬۠۫ۡۖۘۢۖۘۚۨۙۘۗ۠۠ۖۦۘۢۘۤ۫۟ۡۘۖۜۚ۬ۧۨ۫ۥ۠ۙۦ۫";
                    break;
                case -716741772:
                    sb.append("package:");
                    str = "ۧۜۡۘ۟ۦۘۙۦۘۥۚ۟۬ۨۥۦۛۢۨۘۗۛۥۡ۬ۦۚۘۧۦۥ۬ۜۛۨۥۙۥۨ۬ۙۛۗۥۘۤۖۤ";
                    break;
                case -533522683:
                    str = "ۖۥۜۘۨ۬ۡۘۗۥۧۡ۟ۦۘۗۘۘ۠ۗۨۛۚۡۘۙۜۖۨۡۖۘۖۚۥۘۤۛۧۛۘ۫";
                    break;
                case 355378994:
                    sb.append(getPackageName());
                    str = "ۗۚۙۤۖۦۘ۠ۦۗۛۚ۠ۘ۟ۘۨ۫ۖۡۥۦۢۖۦۗۧۚ۟ۗۘۘۗ۬۫ۘۢۡۘ";
                    break;
                case 400322975:
                    sb = new StringBuilder();
                    str = "۟ۨ۟ۘۚۢۛۧۨۨۜ۫ۥۖۘۘ۬۟ۖۦۥ۟ۛۙۚۖۨۙۜۥۨۘ۫ۘۥۘ۟ۚۜ";
                    break;
                case 809527918:
                    str = "ۖۚۗ۟ۜۤۥ۬۫ۘۗ۟۠ۢۧۘۗ۟ۗۗ۬ۧ۬۬۟۬۟ۜۧۘ";
                    break;
                case 1317615943:
                    return;
                case 1361546678:
                    str = "ۗۧ۬۠۫ۦۡۡۖۘۡۢۤ۬ۛۧ۟ۥۨۘۘۢۦۧ۫۫ۨۙۦۘۦ۠ۨۘ۬ۤۨۡۥۘ۬ۨۡۘۤۙ۫";
                    break;
                case 1528935535:
                    startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(sb.toString())), 200);
                    str = "ۜۙۘۧ۫ۜۥۤۡۡۜۢۧ۬ۢۥۛۥۛ۬ۨۚۘۜۘۜ۟ۘۨ۫ۘ۟ۜۤۤۡۥۗ۠ۙ۠ۗۡۛۤ۬۫ۧۥ";
                    break;
            }
        }
    }

    private void Oooo() {
        String str = "ۡۥۜۘۨۗۘۖۜۧۘۢۜۙۜۖۡۜ۫ۦۘ۫۠ۖۘۚۢۙۛۤ۫ۖۢۖ۫۬ۨ۟ۜ۬";
        while (true) {
            switch ((((str.hashCode() ^ 560) ^ 878) ^ 615) ^ (-1970178004)) {
                case -1258674316:
                    str = "ۚ۫ۤ۠ۡ۬۬ۦ۟ۗ۠۫۫ۘۛ۬ۚۘۘ۫ۢۤۘۤۦۘۖۨۜۡ۠ۗ";
                    break;
                case 443038037:
                    return;
                case 551898151:
                    C4496w8.OooO0OO(this);
                    str = "ۚۡۧۖۖۥۚۙ۫ۨۖ۬۟۟ۦ۬ۖ۠ۖۖۦۤۛ۟ۡۨۡۘۜۨ۬۟ۦۥۤۦۘ۬۫ۡۦۘ۟";
                    break;
                case 1034492777:
                    finish();
                    str = "ۧ۠ۗۖۖۧۥ۫ۨۘۦۥۚۦۙۡۡۥۢ۠ۛۚۤ۟ۤ۟ۜۤۤ۠ۘۜۘۜ۠ۦۘۥۧۨۥ۠ۤ";
                    break;
            }
        }
    }

    private /* synthetic */ void Oooo0(PhoneConfig phoneConfig) {
        String str = "ۧۨۗ۟۠ۡۘۨۤ۟۟ۥۜۘۙۚ۬ۖ۬ۤۨۘۚ۠ۦۙۦۥۡۗۜۛۛ۬۟۫ۖۘۙۚۙۛۨۜۦۧۙۙۖۥ۟ۙۤۖۧۘ";
        while (true) {
            switch ((((str.hashCode() ^ 987) ^ 939) ^ 516) ^ 694538481) {
                case -2126192360:
                    return;
                case -1692885266:
                    str = "ۙۘۗۜ۠۫۠ۙ۬ۦۦۨۘۢۛۦۘ۫ۡ۟ۨ۠ۗۡۡۖۖۡۧۤۦۘۡ۠ۡۘ۟ۥۖۘ";
                    break;
                case 819664981:
                    finish();
                    str = "ۘۚۘۧ۠ۡۨۜۥۚۘۤ۫ۖۛۘۦۥۡۧۜۙ۠۠۬ۙۗۗۢۖۚۨۜۚۛ";
                    break;
                case 1204238815:
                    str = "ۚ۟ۢۗۛ۠ۡۖۖ۬۟ۗۛۡۘۚۗۦ۬ۛۨۦۢۖۦۤۜۦۘۦۛۜۚۗۛۘ";
                    break;
                case 1780879132:
                    String str2 = "ۧۘۧۡۨۥۘۦۢۘۘۥۨۥۘۙۦۨ۫ۗۧۚۡۡ۠۟ۦۘۚ۠ۜۤ۫ۨ۟ۚۤۦ۟ۦ";
                    while (true) {
                        switch (str2.hashCode() ^ (-904789927)) {
                            case -2133709030:
                                str = "ۘۚۘۧ۠ۡۨۜۥۚۘۤ۫ۖۛۘۦۥۡۧۜۙ۠۠۬ۙۗۗۢۖۚۨۜۚۛ";
                                continue;
                            case -1802520503:
                                str = "ۚ۠ۜۤۨۧۘۥۤ۫ۖ۫ۗ۟ۡۗ۟۫ۨ۫ۖۙۖۥۨۧۖۡۚۥۡۤۘۦۧۡۥۘۥۤۧ۬ۧ۫";
                                continue;
                            case -1727563711:
                                String str3 = "۬ۧۜۘۖۛۗۗۚۢۘ۬ۜ۟۟ۖ۫ۨۥۥۗۨۜۘۨۗۥۗۜ۬۠ۚۨۨۘۘۥۙ۟ۗۗۛ۫ۥۚۚۦ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1248885356) {
                                        case -1753732064:
                                            str2 = "ۘۨۨۢۜ۟۠۠ۚۥۙ۬ۡۛۛ۟ۛۡۢۛۜۖ۫۬ۥۖۗ۟ۙۨۜۥۘ۟ۚۨۚۧۨۗۨ";
                                            break;
                                        case -1573915762:
                                            str2 = "ۥ۟ۤ۫۠ۗۙۘۧۛ۠ۖۘۛۦۜۘۙۢۢۛۤ۟ۗۚۡۚۖۧۚۙۥۙۗۨۘ۟۬۟ۘۧۘۘۡۚ۫۠۫ۤۘۤۥۘۛ۬۫ۧۢۖۘ";
                                            break;
                                        case -435043397:
                                            str3 = "۬ۚ۫ۦ۫ۜۘۡۡۢۤۢۡۘۘ۠ۜۦ۟ۨۚۧۗ۫ۥۦۛۚۨۘۖۚ۠۟ۜۘۘۚۙۖۗۧۡ۠ۥۦۧۘۜۨۦۘ";
                                            break;
                                        case -325551879:
                                            str3 = phoneConfig != null ? "ۘ۫ۘۘۚۜ۠ۥ۬ۤۚۜ۫ۘۖۘۙۜۗۗۙۢۨۡ۬ۘۤۨۘ۠ۡۘ" : "ۥۛۦ۟۠ۚۙ۟۬ۛۜۘۘ۟ۗ۟ۛۛۜۛۖۘۘۦۜ۫ۦۜۗۥۛۜ";
                                            break;
                                    }
                                }
                                break;
                            case -798538555:
                                str2 = "ۘۦ۬ۜۡۦۡۘۚۖ۫ۜۘ۬ۨۦ۟ۜۜۘۦۘ۟۬ۜۘۗۥۡۘ۟ۦۙۛۡۜۥ۟۠";
                                break;
                        }
                    }
                    break;
                case 2028088981:
                    RecognitionGuideActivity.OooO0oo(this, phoneConfig);
                    str = "ۘۚۧۤۗۜۘۙۗۡۘۖۡۢ۠ۚۨۢۘ۬۠ۢۛۢۖۛۛۡ۬ۗ۬۟۫۠ۨ۫ۘۥۥۛۨ۬ۥۜۘۛۚۨۧۡۜۘۘۛۡۘۖ۠ۙ";
                    break;
            }
        }
    }

    private /* synthetic */ void Oooo00O(C4203oa.Oooo0 oooo0) {
        int i = 0;
        String str = "ۘۛۙۙۙۖۘۦۦۜۧۡۥۘۧۡۨۘۜ۫ۦۖۖۢۛۖۢۜۢۨۘ۬ۢۥۘۖۛۗۡۡۘۜۘۛۗۙۥۘۛ۟ۡۘۙ۫ۨ";
        while (true) {
            switch ((((str.hashCode() ^ 365) ^ 694) ^ 330) ^ 1786299560) {
                case -2030495354:
                case 744610276:
                case 1461120634:
                case 1667732601:
                    str = "ۘۥۖۘۢۗۦۘۜۛۤۡۘ۬۠ۜۖۥۚۖۘۖ۫ۧ۬ۥ۬ۨۘۧۙۤ۟ۙۛۘۘ۬ۢۦ";
                    break;
                case -1686440392:
                    String str2 = "ۙۡۜۘۜۥ۠ۡۙۨۛۤۦۘۡۚ۫ۙۧ۠ۜۨۨۘ۬ۡۖۧۢۜۘۧۥ۟ۗۢۙ۫۟ۙۡ۟ۡۧۖۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-338786246)) {
                            case -1375617986:
                                str2 = "ۙۗۡۘ۬ۚۙۥۚۨۘۗۗۦۨۜۧۙۤۨۘۛۜۨۢ۟ۦۜۛ۫۠ۙۛ";
                                break;
                            case -923181909:
                                String str3 = "ۤۡ۫ۨۛ۠۟ۖۖۘۖ۟۠ۦۙۢ۫ۨۜۡ۟ۨۦۨۨۢۗۦۧۜۗۥۛۨ۫ۘۚۡۛۨۛۨۘۢ۬ۨۘۧۜ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1719405254) {
                                        case -1342891645:
                                            str3 = "ۦۢۧۨ۠ۜۧۖۙۡۖۤۛۥ۬ۧۧۘۘۥۡۚۛۜۖۘۧ۠ۤۡۡۥۜ۬ۖۜۙۚ۟ۡۘۚۘۦ";
                                            break;
                                        case -1250376186:
                                            str2 = "ۘۛۚ۠۬ۛۛۨ۬ۦ۠۬ۦۤ۫۬ۜۘۡۦۖۗۤۘ۟ۙۨۘۥۜۙۢۨۙۥۗ۟۠ۦۗۙۘۦۥۜ۬ۡۘ";
                                            break;
                                        case -6877067:
                                            str2 = "ۨۤۘۘۚۡۙ۟۬ۦۦۤۙۥۤ۠ۖۥۥۘۢۨۖۘ۠ۨۧۙۘۗۧۥۡۖۧۦۤ۠ۜۘ۟ۗۦۘ۫۠ۛ";
                                            break;
                                        case 221393349:
                                            str3 = oooo0 == null ? "۬ۗۖۨۨۖۡۥۨۗۗۛۨۘۧ۟ۦۤ۟ۖۘۨۡۘۛۛۧۤۨۘۤ۬ۖۜۖۘۖ۬۠ۚۢ۬۫ۖۘۘۥۧ۠ۜ۫ۖۡۥۨۘ" : "ۖۡۘۘۤۦۚۗۗۡۘۨ۫ۦۤۚ۬ۨۤۡ۬ۨۘۘۧۙ۟ۜۨۖ۟ۧۜۡۧۘۙۤۦۧۨۜۘۢۘ۠۠ۧ۫۟ۜۚۥۤۚۛۡۤ";
                                            break;
                                    }
                                }
                                break;
                            case 847705852:
                                str = "ۗ۠۠ۢۡۥۘۙۥۘۤ۫۠ۗۦۚۡۨ۬ۡۨۘۛۙ۠۠ۨۘۧۧۗۤ۬ۜۘۢ۬ۨۚۤۨۛۜۧۡۦۧۡۦۘ";
                                continue;
                            case 1020212961:
                                str = "ۢۖ۫۠۬ۨ۬۟۠ۢۛ۠ۥ۬۫۬ۦۨۗۛۙۖ۬ۥۘۡۘۜۜۨۦ۫ۢۘۘۘۜ۠ۚۜۦۘۙ۫ۘ";
                                continue;
                        }
                    }
                    break;
                case -1619900441:
                    Oooo0oo();
                    str = "ۘۥۖۘۢۗۦۘۜۛۤۡۘ۬۠ۜۖۥۚۖۘۖ۫ۧ۬ۥ۬ۨۘۧۙۤ۟ۙۛۘۘ۬ۢۦ";
                    break;
                case -1272217292:
                    OooOooO();
                    str = "ۡ۟ۜۘۨۖۨۘۤۗ۬۬ۙ۟ۚ۬۫ۘۤۧ۟ۦۨۤ۫۠ۨۘۚۛۤۙۧ۫ۛۙ۬ۜ";
                    break;
                case -1062708772:
                    String str4 = "ۖۦۦۥۖۖۜۦۧۘ۠ۢۥۗۚۚۧۧۘۘۦۙۗۥۨۢ۟ۜۛۛۚۨۗۛۡۘۤ۠ۖ";
                    while (true) {
                        switch (str4.hashCode() ^ 732568041) {
                            case -2122273189:
                                str = "ۢ۫ۦۚۢۧۦۦۦۘۧۧ۟ۚۨۧ۟ۥۘۖۤۖۘۡ۠ۛۚۖۢۧۙۥ۫ۖۖۖۛۜ";
                                continue;
                            case -1108004360:
                                str = "ۢۖۤۧۖۥۘۙۚۖ۠۫ۢۧۘۢۥۧۡۘۖ۬ۚۚۥۘۘ۠ۚۨ۫ۥۘ";
                                continue;
                            case -855758958:
                                String str5 = "ۗۖۧۘۘۛۦۘ۬ۛ۫ۘۨۗۖۨۜۚۚۙۖۙۥۖۜۨ۟ۧۜۛ۟ۘۘۜۘۖۖۥۘۢۨۡۥۚۚۦ۬۠ۛۗۥۘۘۥۛ۫";
                                while (true) {
                                    switch (str5.hashCode() ^ (-132969240)) {
                                        case -1899041652:
                                            str4 = "۬ۢۜ۫ۡۡۚ۠ۤۘۨۜۘ۟۫ۙۜۗۢۥۧۡۡۨۢۧۗۧ۫۟ۜ۫۟ۨ۠ۖۚۘۘۡۛۦۘۛۖۨۗۖۘۘ";
                                            break;
                                        case -1778988610:
                                            str5 = "ۖۧۨۦۨۡۧۥۨ۟ۘۛۧ۟ۦۗۥۙ۠ۚۛ۬ۦ۫ۙ۟۫ۖۚۨۘ۬ۚۘۘۖۡۡۘۙۡۖ۬۠ۤ۟ۨۘۘۚۡۧۨۥ۟۬ۧ";
                                            break;
                                        case -171487236:
                                            str5 = i != 0 ? "ۡۖۨۘ۫ۤ۬۟۫ۚۙۦۘۖۦۖ۠ۧۚۛۙۜۘۧۤۖۗۥ۬ۥۡۢۥۜۛۨۖۥۘ" : "ۛۡۦۘۤۧۖۡ۫ۡۥۛۗۦۦۨۙۥ۫۫ۧ۟ۧۛ۟ۤۨۥۨۗ۬";
                                            break;
                                        case 1621483016:
                                            str4 = "۬ۛ۬۠۫ۥۘۦۤۢۥۥۢۨۨۥۘۤۢۜ۫۫ۡ۬۟ۙ۫۟ۧۙۡۙۛۖۦۨ";
                                            break;
                                    }
                                }
                                break;
                            case 1893795821:
                                str4 = "ۢۤۘ۫ۜ۬ۦ۫۬۫ۢۦ۬۠۬ۘ۠ۘۘۨۛۖ۠ۨ۠ۢۢۜۧۧۥ";
                                break;
                        }
                    }
                    break;
                case -899221630:
                    str = "ۧۦ۬ۨ۫ۤۚۧۨۧۢۜۘۚۨ۬ۙۙۖۚۡۥۖۚۘۛۜۙۧۜۡۙۤۨۡۚۥۧۙۖ۠ۧۨۘ۠ۤۦ۬ۢۘۢۗ";
                    break;
                case -356371728:
                    String str6 = "ۨۚۜۘۥۙۥۤۚۡۘ۬ۜۤۙ۬ۥۤ۟ۘۧۨۡۧۜۘۗۧۤۨۘۦۘ۬ۤۦۚۨۘۘ";
                    while (true) {
                        switch (str6.hashCode() ^ (-1359668677)) {
                            case -2041944861:
                                String str7 = "۟ۗۧۧ۠ۦ۠ۥۡۘۚ۟ۖۨ۬ۘۘۗۜۜۖ۬ۡۤۘۘۢ۟ۥ۬ۢ۬ۥۨۤۨۛۦۘ۬ۖۘ۫ۡۡۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 171279880) {
                                        case -981712176:
                                            str7 = i != 1 ? "ۙۡۡۘۚ۬ۦۘۗۖ۠۬ۖۦۦۥۜ۟ۚۙ۫۠ۨ۫ۨۘ۬۠ۢ۬۟۫" : "ۜۤ۬ۨ۫ۙۘۡۦ۫ۨ۬ۗۥۦۘۤۛۖۘۧۢۘۘۘۨۡۘۧ۫ۥۘۗۖۤۙۜ۬ۛ۟ۖۘۛ۫ۦۨ۟۬";
                                            break;
                                        case -36214343:
                                            str7 = "ۥ۬ۧۖ۟ۦۘۡۨۨۢ۟ۡۜ۬ۦ۟۫ۧ۫ۡۢۛۗ۬ۙ۟ۡۘۡۙۖۘۥۜۥۙ۟۫ۢۨۗ۬ۥۘۖ۬ۤۡ۬ۤۦۙ۫ۙۥۢ";
                                            break;
                                        case 289639780:
                                            str6 = "۟ۨۦۛۚۜۚۛ۫ۜۚۖۛ۟ۨ۬ۦۢۙۧ۬ۛۢۦۘۗۖۦۘۛۧ۠ۨ۬ۥۛۖۖۘۥۨۤۜ۬ۜۘۨۙۜۚۡۦۗۡۨ۬۠ۘ";
                                            break;
                                        case 758394007:
                                            str6 = "ۦۤ۠۬ۥۘ۟ۦۗۙۧۗۚۥۘ۫ۗۘۡۥۘ۟ۨ۬ۥۢ۬ۢ۫ۥ۠ۢۤۘۡۢۖ۟ۥ۬ۚۙۙ۫ۖۗۨۡۨۦۦ۟ۘۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case 468696949:
                                str = "ۛ۠۟ۤۘۖۛۚۖۘ۠۬ۥۘۥۚۖۧۢۖۛۗۧۘۙۡۘۤۘ۟ۦۤۜۡۘۤ۟ۦۗ۬ۖۘۖ۬۬";
                                continue;
                            case 940074391:
                                str = "ۚ۫ۨۡۥۨۘۥۧۘۦۘۢۦ۫ۦۧۦۢۤ۟ۖۘ۟ۢۥ۬ۢۥۖۚۦۘ۬ۥۦۘ۫۬ۡۢ۟ۛۥۚۨ";
                                continue;
                            case 1354988540:
                                str6 = "۟ۛۗ۟ۡ۟ۡۗۡ۫ۦۗۖۦۘۘۧۡۙ۟ۢ۫ۧۤۥۘۢۜۖۘۚۡۢ۟ۚۛۨۛۥۤۡۜۘۗۤۥۘۨۘۢۤۜۘۢۗۥۘ۬ۖۚ";
                                break;
                        }
                    }
                    break;
                case -63791468:
                    str = "ۙۡۡۘ۟ۗۡۘۦ۬۬ۘۥۦۤۥۥۙۦۨۘۧۖۛۡۗۨۡۚۡۘۗ۠ۡۧۚۛۜۦ۫";
                    break;
                case 70672110:
                    C3753c5.OooO0O0(getApplication(), R.string.response_data_null);
                    str = "ۧۚۤۜۘۜ۫ۡۙۢۜۜۦۧۥۥۗۛ۬ۢۙۤۜۖۥۧۙۥۦۘ";
                    break;
                case 486711174:
                    Oooo0OO();
                    str = "ۧۢۦۘۘۗۖۦ۟ۧ۬ۚۡۜ۫ۖۙۖۧۘۛۜۥۘۨۦۡۜۥۜۘ۟ۤۥۙۘۜۘ۠ۙۨۘۡ۟ۘۜ۟ۧۚۗۤۗ۫ۦۘۨۜۗۖ";
                    break;
                case 1085742808:
                    OooOo0O(oooo0.OooO0OO, oooo0.OooO0O0);
                    str = "ۡۡۛ۬ۡۗۛۘۜۘۦ۠ۢ۬ۤۥۘۦۢ۬ۧۧۤۙ۠۬ۛۖۖۢۢۧۥۚۦۧۖ۬ۥۘۤۚۧۥۢۗۡۧۧۨ۟۬ۚۢۚ۫";
                    break;
                case 1127541212:
                case 1182321047:
                    return;
                case 1185259940:
                    String str8 = "۬ۙۥۘۘ۟ۖۘۧۜ۠۬ۛۡۘۜ۟ۥۥۚ۫ۚۨ۬ۘۘۨ۠۟۬۬ۡۜۘۦۘۤۧۗۦۚۦۘۘۜۧۘۘۢۤۡۘۜ۬۫ۙۢ۬ۛۤ۠";
                    while (true) {
                        switch (str8.hashCode() ^ (-1327812650)) {
                            case 825556520:
                                str = "ۨۢ۟ۗۧۨۚ۫ۜۘۥ۫ۙۨۤۢۤۢۖۥ۫ۤۧۧۖۛ۠ۨۘۛۜۡۘۛۦۦۘۤۤۜۘ۠ۚ۟ۛ۬۬ۚۚۤ۟ۨۘۙۘۨۡۢ۫";
                                continue;
                            case 1064721455:
                                str8 = "ۡۦۦۥۙۜۘۙۧۛۙۛۢۖۡ۟۫ۚۙۡۤۦۡۥۙۧۤۡۘۚۥۡ۟ۖۤۥۗۨۘۙۢ۠ۥۡۘ";
                                break;
                            case 1180625408:
                                str = "ۗ۠ۡۘ۫ۗۡۘۢۖۜۜۦۘۘۢۙۥ۫۠ۡۘۘۚۦۖۦۡۘۜۢۦۘۘۗۡۖۢۤۧۚ۬۫ۥ۠۬ۧۙۥۦۖۥ۠ۥۘ۫ۨۜۘۖۦۧ";
                                continue;
                            case 2054498037:
                                String str9 = "۟ۥۤۘ۬۫ۘۤۨۘ۫۠ۜۜۢۜۜ۟ۧۛۡۡۘ۟۬ۥۘۨۙۙۥۚۡ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-102301094)) {
                                        case -622520815:
                                            str8 = "ۨۛۥۘۧۥۗۚۥۖۘۙۤۤۛۧۖ۟۟ۢۨ۬۠۬ۚۘۘۙ۠ۚۧ۟ۥۖۚۡۘۗۢ۠۟ۥۙۧۘۜۘ";
                                            break;
                                        case 607227681:
                                            str9 = "۠ۗۢۥۤۘۘۖۗۨۡۚۖۘۤۘۘۘۙ۠ۧۦۗ۟۟ۨۘۥۛۦۘۥۘۚۛ۫ۜۨۡۧۘۗۜۥۘۜ۠ۥۘۗۢۧ۠ۗۥۘ";
                                            break;
                                        case 882667867:
                                            str9 = i != -1 ? "ۙۥ۠ۥۥۡۘۦۥ۫ۜۦۡۘ۬ۛۡۗۤۡۘۨ۠ۢۤۙۧۥ۫ۨۧۚۘۘۚۘۨۚۨۦۘۢۜۨۘۖۦۨۘ" : "۫ۥۗۤۛۘۘۚ۬۫۠ۗۖۧۜۘ۬ۧۜۘۥۖۤۥۗۨۘ۬ۤۡۤ۫ۦۘۡۜ۫ۘۤۥۘ";
                                            break;
                                        case 1620731096:
                                            str8 = "ۚۗۖۘۡۗۦۘۘۦۜۘ۫ۖۙۛ۠ۢۤ۟۬۫ۧۖۘۢۥۘۙ۟ۘۨ۫ۥۘ۠ۖۘۙۗۤۚۦۨۗۚۡۘۨۘۤۡۥۘۤ۠ۗۧ۟ۙ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1402260442:
                    String str10 = "ۚۘۙۛ۬ۘۢۦ۟ۙۢۘۘۜۚۥۦۨۖۚۡۡۘۖۧۦۘۚۧ۠ۡ۠";
                    while (true) {
                        switch (str10.hashCode() ^ (-1796120946)) {
                            case -1554223097:
                                str = "ۦ۟ۨ۫۫ۜۨۦۨۚۧۥ۬ۨ۟ۖۜ۠ۢۖۘۨ۠ۥۨۖۘ۟ۧۘ۠ۦ۟ۘۦۡۘ";
                                continue;
                            case -1291712062:
                                str = "ۙۗۗۗۡۜ۠ۢۖ۬ۤۖۘۧۨۘۛۖۥۙۡۖۘ۫ۚ۠ۢۚ۟۫۬ۜۘۘ۠ۡۘۘۨۜۘ۠ۡ۫ۜۖۖۘۨۛ۫ۗۜۜۘۛ۟ۜۛۥ۬";
                                continue;
                            case -308131093:
                                str10 = "۠ۜۥۘ۟ۜۖ۫۠ۚۜ۫ۧۥۨۗۙ۟ۘۙۢۚۢۛۦۘۖۜۘۡۦۦۘ۠ۥۖۘۦۦۦۘۚ۫ۥ۠ۧ۫ۨۡۘۥۚ۬";
                                break;
                            case 1106262370:
                                String str11 = "ۖۧ۬ۛۗۜۧۘۙۛۧۗ۟ۤۦۖۘۘۤۡۨۗۧ۟ۘۖۜۘۚۦۤۙ۠ۡۘ۫ۘ۬۟ۙ۬۠ۖ";
                                while (true) {
                                    switch (str11.hashCode() ^ 854053393) {
                                        case -2022060930:
                                            str10 = "ۥ۟۠ۙۧ۟ۘ۬ۧۚۚۜۥۦۤ۟ۥۚ۫ۛۖۘۥۛ۬ۢۧۗۙۧ۠ۗۧۘۨۜۛۖۘ۬ۙۦۛۗ۠ۙ۬ۢۜۘۨۘۗۗۜ";
                                            break;
                                        case -1706744715:
                                            str11 = i != 100 ? "ۢ۠ۦۘۡ۫ۥ۠ۜۤۛۗۘۤۥۜۘۗۡۘۙۚ۫۬ۦۜۘۢۜ۬۠ۥۖ" : "ۘۦۡۛ۬ۜۘۛۤۧ۫۠ۥۘ۠۫ۗۖۧۜ۟ۧۥۧۧۖ۫۫ۤۨۛۛۦ۠ۖ۬ۥۨۢۜۙۚۦۙۙۢۜۘۖۥۦ";
                                            break;
                                        case -508722165:
                                            str10 = "۬ۛۦۘۡۚۧۤۢۖۚۤۤۙۧۙۚۘۦۚۜۜ۬ۛۙۙ۬ۨۘۜ۟ۤۗۦۘۘۤۖۘۚۖۡۖ۟ۢۨۡۡۦ۬";
                                            break;
                                        case 368219484:
                                            str11 = "ۡۨۖۘ۠ۨۚۗ۟ۦۚۦۢۚ۫ۜۘۗۨۦۘ۠ۤۖۨ۟ۦۘۗۥۧۨۘ۫۬ۙۗۤۚۛۦۖۛۧۙۨۘۡ۟ۨۘۤۢ۬";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1933161618:
                    i = oooo0.OooO00o;
                    str = "ۚۥۜۡۜۨ۫۟ۖۘۙ۟۫ۘ۫ۖ۠ۧۤۤ۟ۖۘۨۘۨۥۗ۟ۨۘ۬ۢ۫۟ۖۘۘ";
                    break;
            }
        }
    }

    private void Oooo0OO() {
        String str = "ۘۙۜۘ۫۬ۗۦۡۡۘ۠ۗۢ۫ۨ۟ۧۙۘۦ۟ۨۢۛۢۦ۠ۡۘ۟ۙۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 178) ^ 945) ^ 202) ^ 169450234) {
                case -1054802262:
                    Log.d("XJL_AD_TAG1", "adview show");
                    str = "ۤ۫ۚ۠ۢۛۤۦۘۘۗۧۧۨۦ۟۠۬ۚ۬ۤۘ۟ۦۖۘ۬ۤۖۘۦ۬۠ۖۧۜۘۘ۟ۘۘ۟ۗۥۘۙۤ";
                    break;
                case -802862781:
                    finish();
                    str = "ۘۧۢۗۗۦۘۗۦۧۘۦۚۧ۬ۡۥۘۦۧۥۘۗ۟ۢ۟ۜ۬ۤۗ۟۬ۨۘۡۗۤۚۢۘ۟ۖۜۡۡۢۚۘۥۘۦۧۥۛ۟ۚۛۖ۬";
                    break;
                case -751907791:
                    str = "ۘۧۢۗۗۦۘۗۦۧۘۦۚۧ۬ۡۥۘۦۧۥۘۗ۟ۢ۟ۜ۬ۤۗ۟۬ۨۘۡۗۤۚۢۘ۟ۖۜۡۡۢۚۘۥۘۦۧۥۛ۟ۚۛۖ۬";
                    break;
                case 13919385:
                    C4496w8.OooO0O0(this);
                    str = "ۙۜۡۘۤۨۛۧ۠ۜۘۜۧۘۘۘۛۖۨۛۡۡ۫ۥۗ۟ۨۤ۟ۘۘۨۨۧۥۚۨ۫۠ۗۥۘۜ۟ۤ";
                    break;
                case 373064940:
                    Log.d("XJL_AD_TAG", "adview hide");
                    str = "ۧۛۖۘۙۗۧۙۛۧ۠ۦۘ۠ۙۙۨ۫ۧۛ۠ۖۘۜۡۙۗ۠ۨۧۖۛۤۛۨۘۛ۫ۘۘ۫ۢۤۘۦۖۜۡۥۘۢۧۜۡۚۥۨۡۘ";
                    break;
                case 1505891219:
                    return;
                case 1860659502:
                    Oooo0o();
                    str = "ۡ۠ۡۘۧۥۜۛۡۢۡۥۧۘۦۘۥ۬ۗۥۥۧۡۘۗۦۡۘۘۛۤ۬ۡۥۢۗۥۘ۬ۥۗۘ۬ۥۤ۠ۢۙۡۚۤۘۛ";
                    break;
                case 1876161480:
                    str = "ۧ۟ۖ۬۟ۜۘۙۜۡۛۛ۫ۤۜ۫ۘۜۜۢۦۘۛۗ۬ۖۘۢۡۙ۬۠ۥۡۨۜۘ";
                    break;
                case 2093797892:
                    String str2 = "ۙ۫ۡۘۙۙۙۗ۟۫ۘ۟ۜۡ۫۬ۡۨ۟ۨۗۛۡۙۦۜ۬ۖۧۡۘۤۦۨۘ۫ۚۘۢۛۗۗۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-2132671848)) {
                            case -284488888:
                                str2 = "۟۬ۤۙۙۚ۟ۙۥ۟ۡۧۘۡۚۥۘۨۛۦۥۜۘۘۤۖۦۨ۫ۙۘۚۨۨۜۘۤۙۤۜۡۢۙۖۗ۬۫ۗۛۢۧ";
                                break;
                            case 149340802:
                                String str3 = "ۢ۬ۦۚۗۚۨۚ۫ۘۘۘ۫ۨۦۛۧۢۙۥۖۘۡۚۧۘۨۖۘ۟ۢۖۖۡۦۙ۠ۧۚۤۨۥ۫ۨۘۖۡ۟ۨ۟ۚۙۨۥۜۚۘۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1561109184) {
                                        case -2146798067:
                                            str2 = "ۙۗۦۖۙۘۘ۟ۡۦۘ۫ۦۤۨۘۖۙۤۙۨ۠ۦۢۢۦۖ۟ۤۘۙۘۘۧۘۨۘۖۛۥۘۜ۠۬ۘۡۨۘۧۢۤۙۢۤ";
                                            break;
                                        case -2020518627:
                                            str2 = "ۙۥۨۚۦۚۨۜۖ۠ۧۛۤۜۜۜۧۘۚۙ۠۟ۛۖۗۥۥۦ۟ۛۥ۟ۚۗۘۘۤۧۜ۠۠ۨۤۤۜ۬ۗ";
                                            break;
                                        case -1304063356:
                                            str3 = !C4246ph.OooO0O0().OooO0Oo() ? "ۖۘۥۘۢ۬ۖۘ۟ۚۜۘۨۖۘۡۥ۠ۖۦۢۜ۠ۦۜۤۨۘۢۖۚۖۜۡ" : "ۡۥۦۘۡ۫ۨۢۡۖۖۘۨۘۙۛۥۘۤۚۨۘۡۡ۟ۜۜۙۜۛ۫ۢ۟ۛۧۥۧۜ۬ۜۘ";
                                            break;
                                        case 95274887:
                                            str3 = "ۛۚۙ۟ۦۜۜۜۧۘۚۡۖۚۡۘۨۤۨۘ۟ۦۥ۬ۚۛ۫ۜۗۤ۬ۢ";
                                            break;
                                    }
                                }
                                break;
                            case 570780617:
                                str = "ۥۘۘۧۡ۠۠۠ۨۘۦ۬ۡۘۨۜ۬۬ۥۡۘ۟۠ۘۚۦۡۘۙۡۤۖۛۘ۬ۥۘۤ۫ۢۢۘۛۥ۟ۦۘ۫ۦۗ۟۫ۥۘۘۜ۫ۙۨ";
                                continue;
                            case 1061070736:
                                str = "۟ۡۗ۫ۜۧ۫۠ۙۦۤ۬ۜۜۧۘ۫ۛۧۤۖۨۦۘ۬ۢۜۘۜ۬ۘۘ۬۫ۤ۫ۜۡۘ۬ۚۚۘۡۘۧۢۜۘۗۡۦ۬۫۟ۙۦۨ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    private void Oooo0o() {
        String str = "ۢۧۜۜۦۗۨۧۧۨۛۖۢۗۖۛۦ۬ۚ۫ۚۚۜ۠ۘ۫۫ۧ۬ۧۧۤۤۘۤۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 447) ^ 534) ^ 137) ^ (-776106220)) {
                case -1321616794:
                    this.Ooooooo.OooOO0(1, this.o00O0O);
                    str = "ۨۜۥۧۗۤۥۚ۟ۖۘ۬ۢ۬ۧ۫ۢۡۘۛ۠ۖۘ۟۫ۡۘۡۡۜۗ۫ۡۘ";
                    break;
                case 355875703:
                    str = "ۜۜۧۛۢۢۛ۟ۧ۫ۜۖۡ۠ۘۦۖۧۨۥۗۢۢۖۘۗۗۡۘۖۘۢۢ۫ۧۥۨۖۘۨۨۙۥۙۘۘۚۨۙۦۤۙۛ۫ۥۢۘۖۘ";
                    break;
                case 1207298881:
                    return;
            }
        }
    }

    private void Oooo0o0() {
        FrameLayout frameLayout = null;
        String str = "ۜ۠ۖۘۜۙ۟ۦۛۖ۟ۦۖۘۛۨ۠ۛ۠۬ۧۖۡۖۛۧۗۡۧۘۦۗۡۘۨۥۖۚۜۤ۬۠ۖۘ۠ۦۙۗ۟ۨۘۗۙۚ";
        while (true) {
            switch ((((str.hashCode() ^ 731) ^ 554) ^ 62) ^ 1253136696) {
                case -1613975086:
                    C3950hh.OooO0Oo().OooO0O0(this, frameLayout, new OooO0o(this));
                    str = "ۨۚۘۘۥۖۧۘۤۥ۟۫ۗۗۥۘۦۘۥ۫۟ۚ۫ۖۜۨۘۘۥۘ۬۠ۨ۟ۗۜۖۛۘ";
                    break;
                case 753252360:
                    Log.d("XJL_AD_TAG", "adview loadBannerForYunJing ");
                    str = "۠۟ۡۘۚۨۡۦۖۘۧۖۘۤۙۛۙۘۡۘۗ۟ۢۡۛۗۛۡۦۥۦۧۘ";
                    break;
                case 1277366630:
                    str = "ۡۙ۠ۜۨۖۘ۬۟ۘۘ۫ۖ۠۫ۧۖۘۗۖۗۦۘۡۦۗۜ۟ۦۧۘۤۚۙۘ۟۬ۥۢ۬ۥ۬ۡۘۖۤۧ۠ۡۛۘۡۘ";
                    frameLayout = (FrameLayout) findViewById(R.id.flSplashAd);
                    break;
                case 1815706949:
                    return;
                case 2122171542:
                    str = "ۖۢۥۥۥۜۘۢ۠۬۠ۜ۟ۡۚ۬ۡۡ۬ۖۨۧ۟۟ۤۜۛۚۛۤ۫ۨۗۙۖۘۙۖۖۘۨۤۘۧۙۡۘۘۢۜ";
                    break;
            }
        }
    }

    private void Oooo0oO() {
        String str = "ۚۖۦ۟ۙۛۢۙۧۤۙۨۘۙۨۛۙ۬ۖ۠۠ۖۘ۟ۚۡۘۘۜۨۘ۬ۗۤ۫ۧۦۖۙ۬ۚۚۧ۫ۘۨ";
        int i = 0;
        String str2 = null;
        int i2 = 0;
        int length = 0;
        String[] strArr = null;
        ArrayList arrayList = null;
        while (true) {
            switch ((((str.hashCode() ^ 897) ^ 166) ^ 787) ^ (-1383883126)) {
                case -1971031092:
                    str = "ۥۢ۬ۧۡۢ۬۟ۚۢۤۤۨ۠۬ۦۨۖ۫ۚ۠ۙۤۨۜۤ۟ۥۡ۟ۨۤۨۘۜۡۨۘۢ۟ۛۡۥۙۢ۟۠ۗۢۢ";
                    length = strArr.length;
                    break;
                case -1293841216:
                    str = "ۖۜۦۤۦۖۥۙۘۘۦۢۧۘۢۜۘۧۗۧۦۢۜۘۗۦ۟ۚ۫ۨۘۨۡۜۜۜۘۙۤۥۘ";
                    arrayList = new ArrayList();
                    break;
                case -1252019706:
                    str = "ۥۖۡۘۡۥۛۛۨ۫ۨۖۘۗ۠ۧۖۨ۫ۜۡۨۘ۟ۙۨۡۧۖۥۧۚ";
                    break;
                case -961228940:
                    str = "ۖۘۜۘ۠ۥۙۡۤۥ۠ۘۧۘۙ۬۟ۘ۬ۨۘۖۙۡۘۧۗۢۥۗۗۙۡ۬ۘ۟ۖۛۜۡۧۨ۫ۙۚۜۘ۫ۥ۬ۧۗۨۘ";
                    break;
                case -645325123:
                    i = i2 + 1;
                    str = "۠۫ۢۡۡۗۦۤ۟ۙ۬ۦۥۨۙۤ۫ۧ۠ۗۤۖۥۘۘ۠۠ۖۘۡۡۘۙ۠۠ۧۘۥ";
                    break;
                case -443772736:
                    str = "ۜ۟۫ۦۛ۠ۘ۠ۖۖ۠ۖۡۢۡۧۙۦۘ۠ۥ۫ۖۘۜ۬ۡ۠ۜۜۛۡۦۢ۟ۧۦۡۧ۬ۛۨۧۘۗۘ۬ۚۙۜ۟ۜۨ۟ۗۧ";
                    strArr = this.OooooOO;
                    break;
                case -423031768:
                    ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[0]), 1);
                    str = "ۜۙۥۛۤۘۘۙ۫ۚۤۦۦ۟ۖۖۘۧۥۨۘۢۤۜۘۙۨۥۘۧۗ۟۬۟ۛۤۧۖۘۜۦۜ";
                    break;
                case -382559367:
                    arrayList.add(str2);
                    str = "ۛۘۢۤۖ۫ۥۛۖۘۦ۟ۨۘ۬ۗۜۖۧۨۘ۟ۖۛۦۢۤۛۗ۟۫ۢۘۘۖۗۦۘۨ۫ۜۘۡۘۢۘۚۘ۟ۗۖۘۨۛۦ";
                    break;
                case -342749581:
                    String str3 = "۫ۡۘ۫ۤۚۤۦۢ۟ۛ۟ۤۙۖۙ۠۟ۗۙۥۢ۠ۥۘۧ۠ۘۤۗ";
                    while (true) {
                        switch (str3.hashCode() ^ (-881095585)) {
                            case -1602234493:
                                str = "ۖ۟۫۫ۛۜۢۢ۬ۦ۬۟ۤ۫ۥۘ۫ۢۗ۠ۚۛ۟۟ۜ۫ۡۧۘۗۦۦۛۗۧۦۖۖۘ";
                                continue;
                            case -1527480152:
                                String str4 = "۬ۧۘۘۨ۠ۥۢ۠ۖۚۘۡۥ۟ۥۖۜۦۘ۫۟ۨۧۛۦۘۢ۬ۘۧۦۦۘۘۡ۬ۖۜۜۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-1872575038)) {
                                        case -1454083636:
                                            str3 = "ۘ۠ۦۘۨۤۨۜۤۧۚۨۚۤۢۡۛۢۦۘۨۗۘ۫ۖۦۘۥ۬ۚۚۨۘۧۗ۫۬ۤۨۚۛۥۤۧ۟ۜۜ۫ۙۦۖۘۜ۫ۦۘ";
                                            break;
                                        case -1148553030:
                                            str4 = "۫ۨۧۘۘۙۗۙۦۘ۟ۗۘۘۗۨ۟۫ۘۦۤ۫ۜۘۥۘ۟ۘ۟۟ۨۨ۟ۜ۟ۜۗ۠ۙۘۘ۠ۖۢۛۗ۫ۦۘۖۛۦۘ";
                                            break;
                                        case 654936815:
                                            str3 = "ۙۙۤ۫ۗۦۤ۠ۢۛۘۦۖ۫ۛۘۡۘۨۖۘۙۨۤۦۧۙۙ۬۫ۖ۟۟۬۬";
                                            break;
                                        case 1111912920:
                                            str4 = arrayList.isEmpty() ? "ۙۨۡۘۗۖۛۜ۠ۨۘۡۦۧۘ۠۠ۖۨۚۖۘۤۜۜۘۢۙۨۘۢۙ۬ۗۘ۬ۚۥۡۦۢۦۘۖۧۘۤۚۙۢۜۨۗۚۤ" : "ۧۙۘۢۖ۫ۙۨۘۢۨۨۘۛۨۘ۟ۢۦۜۗۡۘۚۡ۟ۖۜۤۘۘۧۘۥۚۜۘۤ۬ۙۨۛۥۘۖۜۦۘ۬ۡۜۘۙۛ۫ۙ۬ۜۤ۠ۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case 613040182:
                                str3 = "ۘۜۙ۟۫ۢ۬ۦۡۡۜۘۘ۟ۡۚۜۡۢۛ۫ۨۘۖۚۤۗۥۢ۟ۢۜۘۘۧۨۛۚۡۘۜۛۦۢۛ۫ۖۘۗۖۧۡۡۢۡۦۧۡ";
                                break;
                            case 1037744561:
                                str = "ۡۙۗۢ۠ۜۘۧۨ۫ۦۙۨۘۢۙۤۛۘۧۨۘۨۘۥۨۨۘۥۘۘۖۦۘۘۡۧۤۦ۟ۚۙۚۖۘ۬ۨۦۨۗ۫ۚۗۨۘ";
                                continue;
                        }
                    }
                    break;
                case -246241082:
                    String str5 = "ۦۜۖۖۗۚۧ۬ۛۜۗۜ۟ۢۦۖۗۨ۬۫ۗ۬ۗۥۘۜۚۡۘۧۙۤۚۡۧۨۨۨۚۨۘۗۖۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 382611826) {
                            case -1757304492:
                                String str6 = "ۙۤۖۘ۬۬ۨ۫ۦۨۘۙۛۧۗۨۘۙۗۥۘۦ۬۟ۗۥۜۙ۠ۦۘۡۖۡۡۘۡۖۖۛۨۡۗۡۦۤ";
                                while (true) {
                                    switch (str6.hashCode() ^ (-1957899250)) {
                                        case -1544969639:
                                            str6 = i2 < length ? "ۖۗ۬ۧۖۖۘۢ۠ۥۤۨۖۘۛۥۦۥۤۤ۬ۚۜۛ۬ۚۘ۠ۘ۠۠۫ۚۧۗۜۖۘۧۘۡۘۖۦۘ" : "ۢۘۦۘ۫ۗۢۨۜۘۦۤۛۢۛۥۥۜۚۤۜۨ۬ۙ۠ۢۙۨۧۛ۫";
                                            break;
                                        case -1165698314:
                                            str5 = "ۗۥۥۤۨۙ۫ۘۜ۠ۧ۟۠ۛۛۘۧۤ۬ۛۦۘۙ۫ۨۘۦۗۛۜۜۘ";
                                            break;
                                        case -961180686:
                                            str6 = "ۗۧۤۤۧ۬ۢ۬ۤۤۨۨۘ۫۠ۖۘ۟ۨۥۙۛ۠ۨۘ۟ۦۡۥۘۙۚۖۘۙ۠ۛ۫ۥۦۘ۫ۗۘۘۨۦۨ۬ۧ۠۬۟ۤ";
                                            break;
                                        case 262324105:
                                            str5 = "ۤۦۧۢۖۧۧۘ۬ۥۘۡ۠ۥۖۥۘۨۘ۬۬۬ۖۡۘۤۥۙ۬ۜۧۢۥۨ۟ۘۦ۫ۦۙ۠ۢۛ۠ۧۡۜۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case -1501996577:
                                str5 = "ۨۡۜۘۜۙۚۙۛۥۘۙۗ۠ۦۚۗۜۦۙۜۜۨ۟ۥۨ۠۬ۘ۬۠۟۠ۦۥۤۜۨۜۢ۟ۛۗ۬۠ۗۚۗۤ۟ۙ۟ۦۦ۫ۦۘ";
                                break;
                            case -1176323333:
                                str = "۬۟ۨۜۥۧۘۜۗۛۤۛۗۨۧۦ۬۬ۦۘۧۧ۠۟ۨۚۛ۫ۥۙۚ۠ۛۡۤۙۨۧۢۚۖۘ۫ۤۖ۟ۧ۬ۨۢۡ۟ۖۜ۟ۙۥ";
                                continue;
                            case -979844956:
                                str = "ۗۦۦۥۡۥۘۤۙۘۨ۠ۦۦ۟ۘۗۦۡۙۚۜۛۦۨۘۖۡۦۘۤۥۖۢۖۛ۫ۖ۟";
                                continue;
                        }
                    }
                    break;
                case -159152463:
                    str = "ۦۚ۠۠ۤۘۘۡ۬ۨۤۖۧۧۦ۠ۨۘۙۡۖۨۚ۫ۖ۠ۦۨ۟ۛۤۤۚ۬۬";
                    break;
                case -84108081:
                    str = "ۦۜۡۘۥۖۛۧۗ۠ۛۥۙۧۘۚۚۜۛۤۗۜۚۦۧۘۛۙۥۘۗۚۛ۠ۨۦۨ۬ۧ۫۟۠۟ۜ۫ۚ۬ۤۖۖ۟ۚ۟۠ۜۘ۠";
                    i2 = i;
                    break;
                case 42258454:
                    String str7 = "۟ۤ۫۫ۨۘۘۧۘۙۥۘۜۡۨۤۤۘۥۤ۫ۢۙ۠ۡۢۤۜۧۖۘۖۘۦۘۦۛۢۧ۠ۥۘۜۢۥۘ۫ۧۖۛۢ۫ۦ۬ۘ۬ۖۘ";
                    while (true) {
                        switch (str7.hashCode() ^ 858759461) {
                            case -2045203670:
                                str = "ۤ۠ۢۥۚۗۘۛۨۨۡۘۛۖۖۗ۟ۘۦۤۤ۠ۗۖۗۗۜۘ۫ۨۢۘۚۢۙۦۜۘۗۤ۫ۛۨۘۘ";
                                continue;
                            case -1073432964:
                                str = "ۛۘۢۤۖ۫ۥۛۖۘۦ۟ۨۘ۬ۗۜۖۧۨۘ۟ۖۛۦۢۤۛۗ۟۫ۢۘۘۖۗۦۘۨ۫ۜۘۡۘۢۘۚۘ۟ۗۖۘۨۛۦ";
                                continue;
                            case 797052283:
                                String str8 = "ۤۘۖۘۤۦۘۘۡۜۘۥۡۡۛۤۧ۠ۙۖۛۨ۫ۚۖۖۦۚۜ۫ۢۦۚ۫ۖ۟ۨۗۜۛۥۘۖ۠ۗۡ۠ۥۘۜۛۗ";
                                while (true) {
                                    switch (str8.hashCode() ^ (-1647145469)) {
                                        case -1650715328:
                                            str7 = "۬ۧۨۗۗۨۘ۠ۤۥۢۧۥۜۜۦۗۥۘ۬ۢۙۧۡۨۖۥ۠ۨ۟ۜۘ";
                                            break;
                                        case -1259037031:
                                            str7 = "ۗ۟ۡۦ۫۠۠ۡۢۧۡ۟ۢۗ۟ۛۤۡ۬ۤۢۙۜۘۦۦۛۛ۬ۥۤۘۦۛۙ۟ۛۖ۠ۙۥۧۘۤۚۖۡۗۨ";
                                            break;
                                        case -595979007:
                                            str8 = "ۙۦ۠ۡ۠ۤۢۜۙۧ۬ۡۥۙۜۘۡ۠۟۠۬ۧۛۗۗ۠ۙۡۘ۬ۘۗ";
                                            break;
                                        case 1709354581:
                                            str8 = ContextCompat.checkSelfPermission(this, str2) != 0 ? "ۙ۟ۖۙ۠ۡۚۤۜۘۨۧۤۡ۠ۦۘۗۦۧۜۤۡۘۘۧۜۘۡۢۦۥۥۢۥۡۤۤۢۗۗ۠ۥۚۧۥۘۦۘۧ۬ۙۦۘ" : "ۜۤ۟ۡۥۖۘ۠۟۫ۡۚۗۥ۟ۤۨۘۧۘۗۚۡۗ۫ۧ۫ۥ۟ۖۙ۫ۜۖۥۘۛ۫ۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case 828186152:
                                str7 = "ۗ۫ۥۥۥ۫ۧۥۦۨۘۚۤۨۗ۫ۨۘۙۥۧ۬ۥ۠۟ۨۘ۬ۢۧ۟ۢۜۡۥۨۗ۟ۚۤ۬ۤۨۜۘ۬۬ۨۘۚ۫ۨۗۤۦ";
                                break;
                        }
                    }
                    break;
                case 307850221:
                    str2 = strArr[i2];
                    str = "ۤ۫ۢ۬ۨۡۘۥۚۨۡۛۥۘۗۜۖۤۦۘۨۨۥۘۛۢۨۘۥۗۖۘۦۚۤۥۛۖۢۛۦ";
                    break;
                case 814077653:
                    str = "ۖۘۜۘ۠ۥۙۡۤۥ۠ۘۧۘۙ۬۟ۘ۬ۨۘۖۙۡۘۧۗۢۥۗۗۙۡ۬ۘ۟ۖۛۜۡۧۨ۫ۙۚۜۘ۫ۥ۬ۧۗۨۘ";
                    i2 = 0;
                    break;
                case 1496318185:
                    OooOoOO();
                    str = "۟ۥۗۛ۟ۢ۟۟ۢۧ۫۠ۥۗۜۤۥۡ۬ۗۡۧ۟ۡۗ۫۟ۖۧۨۘۘۘۜۘۖۖۖۘۘ۟ۦۨۢۥۘۡۙ۠ۨۢۛ۫ۡۖ";
                    break;
                case 1902477918:
                    return;
                case 2124311595:
                    str = "ۜۙۥۛۤۘۘۙ۫ۚۤۦۦ۟ۖۖۘۧۥۨۘۢۤۜۘۙۨۥۘۧۗ۟۬۟ۛۤۧۖۘۜۦۜ";
                    break;
            }
        }
    }

    private void Oooo0oo() {
        OooO00o oooO00o = null;
        String str = "ۤۢۥ۠ۛۖۛۛۨۘۗۤۧۘ۬ۨۘۦۨۡۘۘۨۡۦ۬ۦۙۜۤۡ۫ۤۗۚ۟ۦۖ۫ۖۘۖۘۘۛۚۛۨۨ۟ۡۗ۬ۧۧۥ۫ۜ";
        TextView textView = null;
        TextView textView2 = null;
        AlertDialog alertDialogOooO0o0 = null;
        while (true) {
            switch ((((str.hashCode() ^ 930) ^ 582) ^ 816) ^ (-782414002)) {
                case -2061097354:
                    return;
                case -1879007776:
                    textView2.setOnClickListener(new OooOO0O(this, alertDialogOooO0o0, oooO00o));
                    str = "ۗۨۨۘ۫ۖۢۖۡۤۙۥۛۦۜۗ۟ۨۘ۬ۡۡۘۗۡۘ۠ۥۚۥۦۦۘۛۚۘۤۦۗ۬ۛۜ۟ۧۚ۠ۨۥۤۡۘۡۦۦۜۥۗ";
                    break;
                case -1557640490:
                    textView.setOnClickListener(new OooO0O0(this));
                    str = "ۘ۠ۨۧۤۖۘۨۡ۟ۚۥۦۖۤۢ۠۟۫ۙۤۤۙۘۗۧۘۘۛۧۢ۫ۦۨ۠ۢۚ۫ۖۘۡۖۖۘۥۜۘۜۥۦ";
                    break;
                case -1303106655:
                    alertDialogOooO0o0.show();
                    str = "۟ۧۗۖ۬ۨۗۨ۠ۥ۠ۥۘۢۖ۠۟ۨۚۨۚۨۘ۠۠ۥۥۧۡۥۜۨۘۢۚۧۗۜ۠ۖۡۘۢۜۡۘۙۘۤۡۚۨۖ۟ۘۘۨۢۗ";
                    break;
                case -1110509497:
                    str = "ۘۨۡۢۨۛ۫ۥۨۤۥۘۛۦۥۘ۫۬ۛ۟ۛۗۘۚۤۤ۟ۚۛۤۧ۫ۗۖۦۧۤۚۢۙۥۨۘۡۤۜۘۜۜۤۛۚۛۜ۟";
                    break;
                case -1041367675:
                    str = "۫۫ۥۤۙۢ۠ۛۙۚ۬۟۟ۖ۠ۖۨۛۥۛۚۜۤۚۗۙۘۛ۬ۡ۠ۚۤۜ۫";
                    textView = (TextView) alertDialogOooO0o0.findViewById(R.id.id_tv_setting);
                    break;
                case 511316481:
                    str = "ۖۡۥۧۛۖۘ۫ۦۧۖۚۢۥ۬ۙۨۛ۬۬۫ۢۥۥۥۜۚ۟ۨۜۧۥۤۡۨۜۥ";
                    break;
                case 642563296:
                    str = "ۜۡۧۘ۬ۥۡۙۜۙۨۙۦۘ۠ۤۛۨۧۧۢۚۗۥۦۚ۠۟۬ۦۜۥۘۥۢۡۘۖۘۖۙۦۜۘۙۜۡۘ";
                    textView2 = (TextView) alertDialogOooO0o0.findViewById(R.id.id_tv_reset);
                    break;
                case 1836041014:
                    String str2 = "ۗۖۖۘۧ۬۬ۗۜ۬ۦۛۛۜۧ۫۠ۘ۫ۘۢۖۤۘۤۗۘۙۖۥۦۦ۫۟ۦۙ۫ۦۘۘۨ۠";
                    while (true) {
                        switch (str2.hashCode() ^ (-633839451)) {
                            case -865488762:
                                str = "ۦۤۢۖۥۗۤۨۜۘۘۜۤۨۘۖۘۘۖۡۛ۟ۖۧۘۘۖ۫ۘۡۤۖۘۡۦۛۖۧۘۥ۠ۤۘۖۘۘۙۢۡۘۨۥۜۘ";
                                continue;
                            case -20432945:
                                str2 = "ۦ۬ۡۘۙ۟ۗۜۜۘ۟ۦۥۨۦۚۚۧۙۥۤۖۦۘۥۡ۠ۥۨۨۚۛۡۘۡۦۛ";
                                break;
                            case 165616507:
                                str = "۫ۥۧۘۤۢ۫ۧۤۡۘۗۘۚۥۤۘۘ۬۠ۧۤۦۡۦۧۖۤۦ۫ۙۤۨ۬ۙۥۘۢۛۚۖۥ۠ۛۢ۬ۛۡۜۤ۬";
                                continue;
                            case 2126541728:
                                String str3 = "ۙۥۢۚۨۜ۬۫ۦۘۥ۫ۨۘۗۛۥۘۦۢ۠۬ۤۚۦ۬ۡۗ۠۠ۗۚۦۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1060628984)) {
                                        case -1754962561:
                                            str2 = "ۙ۬ۜۘ۟۫ۗۥ۫ۨۚۘۡۘ۟ۨۜۘۥۙۤۥۘ۫ۖۘ۬۬۬ۥۦۡۡ";
                                            break;
                                        case -896465327:
                                            str3 = "ۧۘۦۛۦ۟۠ۨۖۘۤۜۡۘۧۗۨۘۚۚ۬ۛۨۥۘ۠۠ۡۘۖ۫۫ۨۦۙۚۤۖ۠ۘۖۙۦۜۧۙۦۘ";
                                            break;
                                        case 2005389881:
                                            str2 = "ۜۘۨۘ۠ۦۜۘۚۦۘۡۖۚۛۗۜۘ۟۠ۢۢۡۗۚ۫ۖۘۦۨۨۘۦ۠۟";
                                            break;
                                        case 2094999373:
                                            str3 = C4454v3.OooO().OooO0O0() instanceof SplashActivity ? "ۜۖۤ۠ۥۨۙۜۥۘۙۢۤۗۖۡۘۧۛۛۘۧۤۛۛۦۥۘۘۤۜۢۖۜۡۧۜۦۛ۟ۜۘۗۦۙ" : "ۦۘۜۚۘۘۡۗۜۨۗۘۖۚۘۖۙۦۗۜ۬ۜۡۥۘ۠ۧۨۘۖۦۥۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1887868286:
                    alertDialogOooO0o0 = C4460v9.OooO0O0().OooO0o0(this, R.layout.dialog_network_inspection, R.style.Theme_Dialog);
                    str = "ۦ۠ۜۨ۟ۨۘۥۢۥۘۛۚۦۨۖ۟۠ۥۢۥۤۚۗۖۜۘۘۢۥۗۘۜۘۜ۫ۦ۠ۥۧۚ۫ۗ۟۬ۗ۫ۥۨۘۥ۬ۥۘ";
                    break;
                case 2062967019:
                    C3753c5.OooO0o0(getApplicationContext(), "弹窗出问题");
                    str = "ۖۡۥۧۛۖۘ۫ۦۧۖۚۢۥ۬ۙۨۛ۬۬۫ۢۥۥۥۜۚ۟ۨۜۧۥۤۡۨۜۥ";
                    break;
                case 2105260629:
                    alertDialogOooO0o0.setCancelable(false);
                    str = "۠ۙ۬ۡۦۥۘۤۦۛ۠ۛۡۘ۠ۗ۠۬۬ۘۤۗ۟ۗۚ۠۬ۡۛۨۗۖ۟ۜۤۛۡۧۢ۫ۚۚۦۡۚۦۙۧۖۘ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public void OooO() {
        String str = "ۘۢۜۢۜۢۨۜ۬۠۫ۦۘ۫ۘۘۥۧۜۘۗۗۥۘۡۚ۟ۜۥۖۘ۬ۗۥۢ۬ۤ۫ۛۨۜۢۥ۫ۛ۠ۥۘۙ۫ۧ";
        while (true) {
            switch ((((str.hashCode() ^ 397) ^ 339) ^ 222) ^ 1288294547) {
                case -1878910906:
                    this.Ooooooo = new C4283qh(this, this.OooooOo);
                    str = "۟ۧۧ۟ۚۨۘۧۡۥۜ۫۟ۡۙ۬ۙۧۜۘ۬ۢۙۖۢۨۘۚۡۛۖۢۛۤۚۖۗۜ۠۟ۘۡ۫ۨۗۗ۬ۖۢۥۥۘ۠ۡۘۗ۫ۦۘ";
                    break;
                case -695313435:
                    ((C4203oa) this.OooooO0).Oooo0O0().observe(this, new Observer() { // from class: z2.i9
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            this.OooO00o.Oooo0O0((PhoneConfig) obj);
                        }
                    });
                    str = "ۡۤۜۙۡۦ۬ۨۖۖۥۡۛۗۥۤۨۡۨۥۡۜۛۖۛۙۨۗۛۚۤ۬ۨۙۜۘۗۙۜ۟ۙ۬ۧۙۖۛۦۛۚۖۘۜۧۡۘ";
                    break;
                case -53140752:
                    ((C4203oa) this.OooooO0).Oooo0().observe(this, new Observer() { // from class: z2.j9
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            this.OooO00o.Oooo00o((C4203oa.Oooo0) obj);
                        }
                    });
                    str = "ۡۛۨۘۚۥ۟۠ۡۥۘ۟ۤۦۘۛۚۥۘ۫ۤۘ۟۬۫ۜۘۨۘۡۗۛۘۛ۬";
                    break;
                case 1587351902:
                    str = "ۘۜۡۖ۬۫ۚۖۡۘۚ۠ۡ۫ۧۢۘ۬ۜۘۙۖۗۙۥۥۘۢۙۚۦۘۙۡۥۨۘ۟ۨۨۘ۟ۗ۫ۘۧۧۡ۫ۨۚ۟ۗۚۖۡۘۧۚۘۘ";
                    break;
                case 1770180173:
                    return;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public int OooO0oO() {
        String str = "۫ۢۚۢ۠ۘۜۥۡ۟ۚۚۧۦۢۥ۫ۘۘۚۗۤۚ۫ۨۘۦۜ۟ۡۙۚۚۗ۫ۛۤۜۨۘ۬ۛۦۛۛ۬ۛۨۜۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ C3580a.f19598e) ^ 875) ^ 136) ^ (-690301626)) {
                case -1790200199:
                    str = "ۘ۫ۦۘۨۘۘ۫ۧۜۘ۬ۚۜۗۦ۠۫ۛۙ۬ۤۥۙۙۚۢ۫ۦۘ۬ۗ۠";
                    break;
                case 195219728:
                    return R.layout.activity_splash2;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public Class<C4203oa> OooO0oo() {
        String str = "ۗۛۤ۫۟ۥۘۜ۟ۨۘۦ۫ۥۘ۠ۗۢۨۗۡ۫ۚۦ۠ۥۘ۠۟ۢۧۧۡۥۘۘۚۙ";
        while (true) {
            switch ((((str.hashCode() ^ 564) ^ 782) ^ 184) ^ (-1475892644)) {
                case -1590404753:
                    str = "ۚۜۘۤۖۙۢۥۚ۬ۡۛ۟ۘۘۥۤۡۦۡۢۘۤۖ۠۟ۤۜۦ۬ۧۙۨۘ۫ۚۘۘۘۦۨۘۦ۫ۨۜۢۦۨۜۘۜ۠ۨۘۗۗۖ";
                    break;
                case 454545779:
                    return C4203oa.class;
            }
        }
    }

    public void OooOo() {
        OooO00o oooO00o = null;
        String str = "ۦۖۖۖۘۢۙۦۖۘ۠ۖۨۘۛ۠ۜۘۤۥۛۦۤۢۢۡۙۥۧۥ۫ۨۙۜۖۛۨۧۥۘۢۗۡۘۛۜۘۘۦۜۙۥۖۖۘۘۖۜۘۢ۠ۗ";
        OooO oooO = null;
        while (true) {
            switch ((((str.hashCode() ^ 988) ^ 731) ^ C4095le.o00000oo) ^ 1139706978) {
                case -1919670095:
                    OooOo0o();
                    str = "ۗ۬ۦۘۢۧ۟ۘۡۘ۠۬ۦۗۘۦۖۡۜۘۖۤ۬۠ۥۘۥۦۡۗۤۖۚ۟ۗۙ۫ۨ۫ۖ۫ۤۗۨۘ۠ۦۘۘۘۖۦ";
                    break;
                case -380889243:
                    str = "ۨۦۦۘۚۥۦۘۗۜۡۘ۠ۨۖۨ۠ۥۘ۬ۜۨۘ۠ۘۡۘۦۜۖۖۛۘۦۥۥۘۢۤۥۚ۟";
                    break;
                case 270687662:
                    return;
                case 504874810:
                    oooO = new OooO(this, 8, oooO00o);
                    str = "ۦ۟ۘۘۚۥۜۦۚۥۚ۬ۜۛۘۘۢۦۛۤۖۚۙۖۘۘۛۨ۬ۨۗۨۘ";
                    break;
                case 922991091:
                    this.ooOO = oooO;
                    str = "ۧۘۡۘۗۚۘۘۦۛ۫ۢۥۜ۫ۚۜ۟ۜۗۦۘۚۦۡۘۢ۫ۧۢۧۡۢۘۘۚ۟ۗ۫ۘ۬۬ۤۥ";
                    break;
                case 1685872409:
                    oooO.start();
                    str = "۠۟ۦۘۢ۟ۢۘۡۖۘۧ۟ۥۘۖ۫ۡۘۘۛۨۘۛ۟ۦۖۤ۫ۤۖۘۘۙۢۘ۟ۗۨۙۢ۠ۦۨۚۢۥۖ";
                    break;
            }
        }
    }

    public void OooOoO() {
        int i = 0;
        try {
            PackageManager packageManager = getPackageManager();
            String packageName = getPackageName();
            int i2 = Build.VERSION.SDK_INT;
            String str = "۟۬ۥۥۜۧۙۛۙۚۙۥ۠ۜۘۘ۬ۧۧۜۛۡۗۚۨۘ۠ۙۖۘۜۦۧۘۘۢۖۜۗۛ";
            while (true) {
                switch (str.hashCode() ^ 219570684) {
                    case -1450089238:
                        String str2 = "ۦ۟ۗ۟ۚۡ۠ۛۦۙۦۖۘ۬ۡۢۦۦۘۘ۟ۡۧۧۤۜۘۛۜۛۜۢۚۘۥ۬ۗۦۖۙۚ۠ۥۚۦۨۡۨۘۘۥ۠ۖۧ۟ۨۨۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 679381068) {
                                case -1571985041:
                                    str2 = "۬ۤۥۖ۫ۗۡۜۧۚۡۜ۠ۤۙ۟ۥۘۢۥۜۘۗۤۤۦۙ۟ۘ۫ۨۙۧ۬ۤۘۖ";
                                    break;
                                case -1122989882:
                                    str = "ۧۙۖۜۛۗۛۗۥۗۜۚ۠ۘۜۘۛۚ۟۫ۥۡۧۧۚ۫۬ۢۨۧ۟ۡۦۜۘۦۖۥ۠ۦۡۗۖۜۡۗۡۘۙۜۚ";
                                    continue;
                                case -591499574:
                                    str = "ۤۢۡۘۗۗ۫ۧۦۡۤ۫ۨۗ۬ۗۗۗۘۢۤۦۘۦۦۜۘۘۜۜۗۙۖۢ۟ۢۘۜۧۙۢۘۘ";
                                    continue;
                                case -456587759:
                                    str2 = i2 < 28 ? "ۡۡۡۘ۟ۦۗۤۛۨۗۛ۫۠۠ۘ۫ۘۨ۬۬ۚۦۧۦۗۡۤۖ۟۬۬۬۟ۥۘۦۗۨۘۥۗۥ" : "۟ۛۘۘۤۧ۬ۛۡۘۢۡۥۘ۫ۜۜۧۙۙ۠ۢۚۨۦۡۘ۟ۙۜ۠۠۠ۢ۫ۦۖۗۨۦۦۦۢۤۦۘۛۢ۬ۨۙۡۘۡ۬ۛۤ۟ۙ";
                                    break;
                            }
                        }
                        break;
                    case -132700690:
                        str = "ۢ۟ۚۙۚۡۜ۠ۘۙۛۜۘۛۜۦۘۗۦۘۘۖۨ۟ۧۥۖۘ۬۟ۡۥۡۨۡۨۨۘۘ۫۬ۦ۠ۤۢۖۨۖۨۘۘۘۥ۫۬ۙۥۘۡۤ۬";
                        break;
                    case 701756211:
                        SigningInfo signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                        String str3 = "ۦۤۖۘۧۜۜۘۡ۠ۖۘ۠ۧۨۘۢۦۖۘۥۨۨۘۜۖ۫ۧۢۧ۠ۥۦۘۙۡۤ۬۟ۛۜ۫ۗ۬ۥۥۘ۠۟ۚۛ۠ۙۗۢۥۘۧ۟ۡۘۥۥۘ";
                        while (true) {
                            switch (str3.hashCode() ^ (-1443240193)) {
                                case -1225460609:
                                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                                    int length = apkContentsSigners.length;
                                    while (true) {
                                        String str4 = "ۘۛۗۤۥۚۖۤۨۧۥۘۛۗۦۘۘۦۤۚۦ۟ۦۚۙ۬ۛ۫۠ۤۢۨ۬ۜۚۡۜۘ";
                                        while (true) {
                                            switch (str4.hashCode() ^ 1279158964) {
                                                case -924688528:
                                                    String str5 = "ۘ۫۠ۤۧۨۘۘ۬ۦ۟ۢۤۧۤۤۚۗ۫۫ۚۘۥۢۜۤۥۙۛ۬ۥ۫ۢۤ۫ۜۧۖۜۚۨۙۡ۠ۨۖۜۦۚ";
                                                    while (true) {
                                                        switch (str5.hashCode() ^ 733572993) {
                                                            case -1585289284:
                                                                str4 = "۬ۗۧۙ۟ۗۧ۠۟۬۬ۥۘۧۨۦۘۢۘۜۘ۬ۨۧ۫ۖۚۜۙۤ۟ۜۘۙۡۘۘۘۛۢۥۜ۫۠ۨۜۘۡۨ۟ۜۗۖۘ";
                                                                break;
                                                            case -1145079410:
                                                                str5 = i < length ? "ۗۚۡۘۡۚ۫ۨۤۧۢۗۢۤ۟۬ۨۡ۟ۤۡ۠ۗۨۤۜ۟ۥۛۖۘ" : "ۖ۟۟ۖۖۙۗۖۦۘ۠۬ۨۛۦ۠ۗ۫ۥ۠ۚۨۦۤۥۘۧۗۦۙۨۧۘۙۡۢۖۧۚۖۡۡۦ۟ۧ۟ۤ۬۬ۙۗۥ۬ۛۙۥۘ";
                                                                break;
                                                            case -262132719:
                                                                str4 = "ۛۚۖۘ۬ۗۛۙۤۜۖ۠ۨۘۜۘۘۘۚۘۙ۬۬۟ۧۜۖۨۦۧۢۢۜۘ";
                                                                break;
                                                            case 72365979:
                                                                str5 = "ۦۨۦۘۜ۫ۜۘۙۘۤۢۘ۫ۚۗ۬ۤۦۘ۟ۖۦۘ۟۟ۖۙۢۥۜۧ۠";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -348835129:
                                                    return;
                                                case 432853332:
                                                    str4 = "ۥۨۗ۫ۨ۫ۖۡۨۘۚۖۛۦ۬ۚۙۢۧۦۤۦۦۖۘ۠ۧۚۖۗۨۘۡۡۤۙۜۡ";
                                                    break;
                                                case 965177982:
                                                    String str6 = "V2/V3 Signature: " + apkContentsSigners[i].toCharsString();
                                                    i++;
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case -1187583005:
                                    str3 = "ۜۨۘ۬ۜۗۨ۬ۜۜۡۘۦۗۤۚۙۗۤۙ۬ۨۧۖۘۛ۟ۛۘۗ۬ۛ۫ۧۘۚۖۧ۟ۜۘۜۘ";
                                    break;
                                case 49114292:
                                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                                    int length2 = signingCertificateHistory.length;
                                    while (true) {
                                        String str7 = "ۥۢۡ۟۬ۘۨۙ۬۬ۚۨۤۤ۬ۙۛۧ۬ۜۡۛۤۡ۟ۧۙۢۘۘۦۜۥۘۢۧ۠ۤۖ۫ۦۜ۟ۢ۟ۚۙۜۘ";
                                        while (true) {
                                            switch (str7.hashCode() ^ 238467864) {
                                                case -1630630728:
                                                    return;
                                                case -470750085:
                                                    String str8 = "ۤۦۜۘ۫ۚۦۦۖۡ۟ۛۖۘۦۖۚۦ۬۬ۙۥۨۘۡۧۜۥۜ۫ۙۗۧۙۙۘۘۛۜۚۗۥۘۥ۟ۧ۫ۙ۟۟ۨۜ۠ۡۘ۬ۥۨۘ";
                                                    while (true) {
                                                        switch (str8.hashCode() ^ 1012543638) {
                                                            case -1910809847:
                                                                str8 = i < length2 ? "ۢۚۚ۬ۚۧۜۖۦۡۥۧۘۨۢۦۘ۠ۘۡۨۥ۫ۜۡۛۗۡۜۘۖ۫ۥۨ۠ۢۢ۠ۖۘ۫۟ۡۚۖۦۘۘۜۨۘۧۙۜۘ۬ۖۧۦۘۨ" : "ۙ۬ۙۜۦۡۥ۟ۥۦۤۖۘۥۗۢۤۛ۟ۥۨۗۜۘۙۦ۫ۙۧۥۛۨۜۜۘۜ۟ۧ";
                                                                break;
                                                            case 47314790:
                                                                str7 = "ۥۘۖۘۗۗۚۤۧۙ۫ۢۚ۟ۘۙ۠ۜ۬ۡ۫ۗ۬۫ۥۧۙ۬ۤۛۨۘۡۛ۫ۤۡۧۡۦۘ۬ۥۡۘۡۡۦ۫ۢۙ";
                                                                break;
                                                            case 1091907469:
                                                                str8 = "ۡۘۥۥۤۜۛۘۛ۫۫ۥ۫ۛۤۤۜۘۨۛۡۘۢۖۥۘۖۦۦۘ۠ۧ۫۠ۘۡۚۢ۠ۨۢۚۘۖۜۧۡۧۘۚۧۜۘ";
                                                                break;
                                                            case 1808093990:
                                                                str7 = "ۢۛۖۚ۫۬ۨۥۘ۬ۙ۫ۤۙۘۖۡۚۨۘۤۚ۟ۦۘ۟۟ۖۖۦۧۘ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 924698215:
                                                    String str9 = "V1 Signature: " + signingCertificateHistory[i].toCharsString();
                                                    i++;
                                                    break;
                                                case 1729198497:
                                                    str7 = "ۙۗۨ۫۟ۗۘۖۜۥۘۦۨۨ۫ۢ۟ۤ۠ۥۘۖ۠ۦ۟ۗۖۚۧۗ";
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case 174352961:
                                    String str10 = "ۗۗۡۘ۬۫ۢۥۢۤۥ۠ۢ۫ۦۘۦۛۗۜۜۨۥۙ۟۬ۨۡۧۘۥۘ۠ۜۡۘۡۨۤ۟۟ۖۥۦۦۗۢۨۘۦ۟۬ۧۢۡۢ۟ۥۘ";
                                    while (true) {
                                        switch (str10.hashCode() ^ 550676888) {
                                            case -2060624353:
                                                str3 = "ۧ۫ۡۤۖۧۘۛۜ۠ۧ۠ۡۚۧۥۧۗۤۤ۟ۦ۟ۛۡۤۖۢۢ۫ۦۖۘۙۛۨۙ۟ۧۚۚۥ";
                                                continue;
                                            case 1081969114:
                                                str10 = !signingInfo.hasMultipleSigners() ? "ۘۛۚ۬ۦۡۡۖۛۦ۟۟ۦۜۨۘۦۤۧۛۨۡۘۜۙۦۤۗۨۖ۬ۡ۫ۚۤۙۡ۠" : "ۢۡۦۖۦۦۛۨ۬ۙۦۢ۠۠ۤ۬ۜۥۘ۟ۤۛۤۦۜۘۡۥ۠ۙۜۦۡۘ۟ۚۖۢۢۥۘۦۡۨۘ";
                                                break;
                                            case 1563159313:
                                                str10 = "ۢۖ۬ۙۘۖۦۙۦ۠ۙۙۘۚۛۖۢۖۧۢۤۛۢۖۗ۟ۙ۟ۖۘۥۦۥۘۦۚۦۘۤۤۖۘۢۦۚ";
                                                break;
                                            case 1936009235:
                                                str3 = "ۖ۟۫ۖ۬ۤۡۦۧۘۚۦۨۡ۫ۢۨۛ۬ۥۦۚۛۧۜ۟ۥۜۢۢ۬۬ۘۙۢۦۛۙۧۡۘۙۜۙۖ۫ۨۨۘۘۦۡۧۘۨۨ۫";
                                                continue;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1136748194:
                        Signature[] signatureArr = packageManager.getPackageInfo(packageName, 64).signatures;
                        int length3 = signatureArr.length;
                        while (true) {
                            String str11 = "ۥۤۨۘۖ۫ۡ۫ۛۖۛۖ۫ۨۖۘۨۘۘۘ۟۟ۤۘۘۚۤۦۚۙۚ۠ۜۖۘۢ۟ۘۘ";
                            while (true) {
                                switch (str11.hashCode() ^ (-1730445986)) {
                                    case -1553752331:
                                        String str12 = "۫ۥۖۘۦۧ۬ۨۘۘۨ۫ۜ۬ۘ۫ۗۘ۬ۘۘ۠۟۠ۥۘۢۛۖۘۛ۟ۦۘۧۘۜۘۜ۟ۗ۠ۘۡۘۘۢۖ";
                                        while (true) {
                                            switch (str12.hashCode() ^ 1755018671) {
                                                case -838470438:
                                                    str11 = "۠ۜۗۖۢ۠ۥ۫۬۠ۖ۫ۡ۬ۜۘۧۤۗۡۗۚۛۤۖ۬ۦۖۘۙۛ۫ۚۛ۫ۢ۫ۡۙۛۥۘۡۙۦۘۛۖۢ۠۠۠";
                                                    break;
                                                case -402613823:
                                                    str11 = "ۛۙۜۘۤۢۡ۫ۗۦۘۢۘۚۚۡۚۧۜۥۡ۬ۖۘ۟ۜۨۗۨۦۘۚۡۜ";
                                                    break;
                                                case 1719955841:
                                                    str12 = "ۢۨۢۚۚۙ۫ۗۙۚ۬۬ۙۜۢۜۙ۟ۨۜۧۘ۠ۘۜۘۖۤۨ۫ۢ۫ۨۢۛۘۚۖۧۢۨۘ۠ۜۥۨۦ۟۠ۢ۫۫۠ۡۘۤۖۦ";
                                                    break;
                                                case 1880032480:
                                                    str12 = i < length3 ? "ۘ۟ۥ۫ۥۘۗۨۦۚۙۗ۠ۜۘۗ۠ۥۘۙۨ۠ۧۙ۠ۙ۬ۘ۬ۛۚۜۛۙۙۥ" : "۬ۙۗۨۨۡ۠ۗۜۘ۟۬ۨۢۨۧۘۚۡ۫۫ۡ۫ۢۦۘۜۥۦۘۡۦۤۘۖۡۘۤۘ۠";
                                                    break;
                                            }
                                        }
                                        break;
                                    case -539731088:
                                        return;
                                    case 751811553:
                                        str11 = "۫ۢۨۘۥۘۧۘ۠۫ۜۗۗۦۗۜۜۘۨۦ۟ۚۘ۬ۥۖۜۘۧ۠ۗۚۡۘۗۖۧۘۨ۟ۖۘۘۛۖۘۡۡ۫";
                                        break;
                                    case 1062343633:
                                        String str13 = "V1 Signature: " + signatureArr[i].toCharsString();
                                        i++;
                                        break;
                                }
                            }
                        }
                        break;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ void Oooo000(AlertDialog alertDialog, View view) {
        String str = "ۘۜۦۘۧۨ۠۫ۨۡ۟ۦ۫ۤ۫ۜۛۜۘۢۘۘۘ۠۫۬ۚۙۜۘۖۦۢ۠ۙ۫ۥۨ۬";
        while (true) {
            switch ((((str.hashCode() ^ 677) ^ C4095le.o00000o0) ^ 797) ^ (-1779131138)) {
                case -1961307700:
                    str = "ۛۙۜۘۙۜۤۚ۬ۜۘ۠ۥۧۘۛۖۚۢۖ۫ۧۘۥۙۙ۬ۘۘۥۘ۠ۤۥۡۘ۠ۗۧۤۥۖ۬۟";
                    break;
                case -1502168099:
                    return;
                case 757754987:
                    str = "ۛۦۧۤۖۜۘۜۗۜۘ۬ۨ۫ۖۛ۟ۢۢ۠ۖۛۚۥ۠ۛ۟ۡۖۖۢ";
                    break;
                case 828189056:
                    str = "۫ۘ۬ۗۢ۟ۜ۫۠ۤ۬ۙۡۦۘۢۗۥۡۘۙۜۥۜۘۦۖ۟ۡ۠ۚۢۥۡۘۢۘۘۘۙۤۧۛ۟۠۫ۜۘۤۗۘۘ";
                    break;
                case 1766800867:
                    OooOooo(alertDialog, view);
                    str = "ۢۢۜۘۡ۬ۗۜۡۥۘۢۘۦۛۛۛۨۙۦۘۜۙۨۘۡۦۧۧۙۜۗۡۡۢۖۨۦۨۘۧۘۢۗۘۗۨۤۜۧ۫ۖۜۗۜۘۚۧۨ";
                    break;
            }
        }
    }

    public /* synthetic */ void Oooo00o(C4203oa.Oooo0 oooo0) {
        String str = "ۨۥۥۙۖۢۜ۠ۘۚۡۡۧۦ۠ۥۧۘۖۦۧۛ۟ۦۘۤ۬ۤۨۧۨۥۗۘۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 886) ^ 539) ^ 429) ^ (-885740148)) {
                case -1777422618:
                    str = "ۤۨۧۘۖۗۥ۫ۘۘۛۨۥۚۗۧۦۛۧۙۤۢۡۙ۫ۥۜۚۦۙۦ";
                    break;
                case -1226144944:
                    return;
                case -786678985:
                    str = "۫ۖۨۘۚۙ۟ۤۙۦۘۢۦۙۡۧۥۡ۟ۦۘۦۨ۬۠ۦۜۤۛۨۘۦۢۖۘۘۖۦۘۨۤۤۗۚ۠ۖ۬ۜ";
                    break;
                case -771255140:
                    Oooo00O(oooo0);
                    str = "ۗۥۖۛۥۢۨۜ۬ۨۖ۠ۤۖۖۨۙۜۘۚۢۙۤۜۘۗۡۘۘۘۘۜۘ";
                    break;
            }
        }
    }

    public /* synthetic */ void Oooo0O0(PhoneConfig phoneConfig) {
        String str = "ۙ۫ۧۙۖۜۘ۠ۨۥۘۦ۫ۡۘۦۜۥۘۘۖۧۚۤۜ۫۟ۧ۫ۦۗۚۡۛۨۗۡۖۛۛۡۢۢۖۛۛ۠ۤۜۚۜۦ۬۫ۖۘۙۖۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 815) ^ SubsamplingScaleImageView.ORIENTATION_270) ^ UiMessage.CommandToUi.Command_Type.SET_TEXT_VALUE) ^ (-1433777332)) {
                case -1634307916:
                    return;
                case -555515828:
                    Oooo0(phoneConfig);
                    str = "ۢ۠ۦۙۙۘۘ۬۫ۜۦۗ۟ۥۘۘۖ۬ۡۗ۫ۨۘۜۦۥۥۨۦۘۙۥۢ";
                    break;
                case 32886103:
                    str = "ۧۙۖۡ۠ۦ۫ۡ۟ۖۦۥۘ۠ۖۖ۟ۜۥۘۧۘ۫۟ۛۥۜۙۖۛۛۡ۠ۧۥ۟ۧ۫ۨۜۘۧۨۦۘۚ۠ۢۦۙۛ";
                    break;
                case 1097145437:
                    str = "ۡ۫۠۬ۚۢ۬ۢۜۦۤۗۜ۠ۥۨ۫ۘ۫ۘۡۘۖۢۦۘۗۛۥ۠۠ۦۘۡۘۜۡۖۧۧۨۜۛ۫ۛۦۨۨۡۤۥۖۧۜ۬ۗ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public void initView() {
        String str = "ۨۦۘۙ۠۫ۗۖۚۦۛۗ۟ۧۧۨ۫ۢۗ۟ۥۘۘۤۤۢۛۤۢۜۘۖۦۜۨۖۗۢۗ۬ۤ۫";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.GET_FW_TEXT_COLOR_VALUE) ^ 895) ^ C4095le.o0000Ooo) ^ 210888325) {
                case -793243119:
                    this.Oooooo = (LinearLayout) findViewById(R.id.id_ll_dot);
                    str = "۫ۥۚۗۗ۟ۛۚۦ۫ۢۧۦۖ۬ۜۢۘ۟ۤۤۦ۬ۢۤۤۡۘۤۢۖۜۘۤۘۥۛۧۙۨۘۨۗۦۘۙۢۦۘۢۦۘ۠ۥۧۘ۠ۧۡۘ";
                    break;
                case -304749681:
                    this.Oooooo0 = (TextView) findViewById(R.id.tv_splash_ad_mark);
                    str = "ۨۧۤ۫ۚۖۘۙۦۦۘۤۧۢۘۛۨۘۨۨۢۘۨۤۙۢۚۢۘ۫ۨۜۙۨۥۙۨۖ۟ۥۜ۠ۧۨۘ";
                    break;
                case 33107066:
                    this.OoooooO = (TextView) findViewById(R.id.tv_close_ad);
                    str = "۟ۡۘۦۥۘۘۛۜۘۥۡۨۨۗۡۘۖ۟ۖ۠ۛۥۢۜۧۛۥۦۚۤۨۙ۠ۦۘۗۖۨۢۧۚۧۘۦۖ۟ۥۦۜۥۘۚۦ۫ۢ۠ۛ";
                    break;
                case 403403281:
                    return;
                case 490842453:
                    this.OooooOo = (ImageView) findViewById(R.id.iv_splash_ad_fullscreen);
                    str = "ۡۨۨۘ۫۬ۙ۬ۤۜۘۘۖۧۘۤۙۥۡۡۘۘۘۜۛۡ۟ۖۘۧۥۗۨۥۙۙ۟ۦ۫ۨۢۦۡۗ۬ۗۖۘۚ۬ۤۖۧۘ";
                    break;
                case 1323903302:
                    str = "ۗ۟ۥۘۛۙۖۡۜۤۜۦۨۘ۠ۖۘۘۧۨ۠ۖ۫ۥۘۦۡۦۘۗۚۜۗۘۦ۫ۘۡۥۦۡۘ۬ۘۘۘ۬ۦۜۦۖ۟ۤۧۥۘۥ۠ۡ۠";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        String str = "ۥۚۧ۫ۧۧۛۛۛۘۧۥ۬ۛۗۨ۟۠۬ۜۖۘۘۧۘۘۜۙ۟ۧۜۖۘۙۥۘۦ۟ۘ";
        while (true) {
            switch ((((str.hashCode() ^ 726) ^ 381) ^ 164) ^ (-733475829)) {
                case -2133355100:
                    OooOoOO();
                    str = "ۖۨۙۙۜۥۖ۟ۛۥ۟ۚۤ۬ۦ۫ۖۥۘۖۨ۫ۚۘۜۛۜۤۖۤ۠۠۬ۖۚ۫۟۟ۛ۟۟ۦۘۘ۟ۥۘۘۧۢ۫";
                    continue;
                case -2007941556:
                    str = "۬۟۠۟ۛۜۘۜ۠ۚ۫ۜۚۗۢ۫ۤۖ۫ۡ۠ۛ۟ۢۧۧۦۜۘۖ۟ۢۗۛۢۖۤۥۘ۟۟ۚۗۘ۠ۧۥۘۚۦۡ";
                    continue;
                case -591348590:
                    Toast.makeText(this, "请确保开启悬浮窗权限，否则将无法正常使用", 0).show();
                    str = "۫ۡۖۗۨۗۗۚۚۥۥۙ۬ۚۧۡۧۦۘۡۦۧۘۗ۬ۧۢۚۜۘۡ۬ۡۥ۟ۗۡۖ۫ۥۤۧۜۜ۠";
                    continue;
                case -310619211:
                    String str2 = "۟ۙۘۡۧۜۘۙ۬ۥۘۙۦۧۨۗۧۥۤۖۘۜۖۚۦۛۨۘ۠ۗۥ۬ۤ۫ۘۥۥۘۡ۠ۦۤۢۗ۬ۡۘۜۡۘۘۗ۬ۙۧ۫ۘۚۤۢ";
                    while (true) {
                        switch (str2.hashCode() ^ (-805113790)) {
                            case -233175531:
                                String str3 = "۬ۙۗۡۨۨۘ۫ۗۨ۟ۘۜۖۨۖۘۧۥ۟ۙ۟ۥ۟ۦۙۦۦۘۙ۠ۢۡۚۥۘ۟ۥۦۘ۟۟ۡۤۚۡ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1013642929)) {
                                        case -1888448314:
                                            str3 = Build.VERSION.SDK_INT >= 23 ? "ۥۢۘۨۦۨۗۖۜۘۧۨۘۧۜۜۘ۬ۗۨۘۦۨۤۗۙۨۧۖ۬ۨۡۨۚۥۛۘۘۨۙۦۥۜۢۤۨۜۥۗ۫۟۟ۖۦ۟ۧۜۘ" : "ۙۗۧۡ۟ۦۘۛۖۜۘۤۛۗۙۢۛۨۡۖۘ۫۟ۨۘ۟۟ۧ۫ۖۨۘۧۚۡۘ";
                                            break;
                                        case -104646268:
                                            str2 = "ۧۡۘۘۙۖۡۢۧ۟ۦۛۚۨۖ۬۠ۡۛۜۤۘۢۜۧۜۨ۬ۥۡ۬ۘۢ۟۫۫";
                                            break;
                                        case 1238039799:
                                            str2 = "ۗۢۨ۬ۧۡۧ۬ۙ۟ۜۢ۠ۘۨۘۤۥۖ۬۫ۗۚۘۖۜۧۘ۬ۚۜۘۤۙۨۘ۠ۨ۟";
                                            break;
                                        case 1816059459:
                                            str3 = "ۨۤۨۘۚۢ۫۟ۧۜۘ۫ۡۘۡۙۜۘۖۘۙۢۢۢۢۗۜۘۦ۫ۦۖۨۜۘ";
                                            break;
                                    }
                                }
                                break;
                            case 105059349:
                                break;
                            case 707929004:
                                str2 = "۟ۚۘۖۥ۫ۦۚۨۘۥ۬ۥۙۗۡۨۧۙۥۛۡۡ۠۫ۡۤۚۘۘ۫ۢۢۚۦۙ";
                                break;
                            case 993712708:
                                str = "۫ۘ۬ۥۥۥ۟ۛۚ۬ۢ۫ۖۜۢۥۢۙۛۢۥۘۙۧۧ۬ۥۧۜۛۖۘۙۚۚۛۘۨۤۧۡۙۡ";
                                break;
                        }
                    }
                    break;
                case 2681970:
                    str = "ۜۥۦۘۥ۫۟ۦۙۛۘۚۘۥۛۛۧۖۗۙ۬ۨۛۦۘۨۚۙۥۘۖۤۢۘۨۛۛۢ۫ۢۙۜۧۘۢ۠۟۟۠ۖۘ";
                    continue;
                case 90339134:
                    str = "۬ۨۡۘۥ۬ۜۦۦۘۧ۠ۡۘۧۙۗۥ۟۟ۧ۫ۥ۠ۘۧۚۖ۫ۘۚۚ";
                    continue;
                case 962605071:
                    return;
                case 1050311241:
                    super.onActivityResult(i, i2, intent);
                    str = "ۤۛۥۘۨۛ۫ۗۥۦۘ۠ۤ۬۬ۥۧۦۖۢ۫ۧۜۗۥۜۗۥ۟ۨ۬۠ۘۖۘۡۚۧۤ۬ۖۨۜۛۗ۠ۦۨۦۦ";
                    continue;
                case 1331381931:
                    String str4 = "ۜۨ۫ۖۥۡۘۖۖ۟ۨۜۘۛۧ۟۫ۤۨۤ۠ۡۙۥۘۧۛ۟ۛۙۨۚۢۖۘ۫۬ۖ";
                    while (true) {
                        switch (str4.hashCode() ^ (-307952820)) {
                            case -941165955:
                                str4 = "ۢۢۦۘۜۗۥۨۘۨۘۗۨۨۘ۟ۧۜۘۥ۠ۧۗۛۤۙۚۦۘۘۧۦۜۦۦۙ۟ۙۗ۫";
                                break;
                            case -361809070:
                                str = "۬ۘۧۚۗ۫ۤۤۤ۟ۚۤۖۡۙۥۧ۬ۤۛۗۖ۬ۥۛۨۖۚۦۘۜۦۙۧۢۨ۬۟۫ۡۡۥ";
                                continue;
                            case -13256013:
                                String str5 = "۠ۨۛ۬ۡۧۘۧ۫ۙ۠ۧۨۖۙۛۖۢۥۢۚۧۦۦۘۘۗۨ۟۠ۡۙۘۡۘۧۜۧۜۙۧۚ۫";
                                while (true) {
                                    switch (str5.hashCode() ^ 1483182378) {
                                        case -2012614790:
                                            str4 = "۬ۨۨۤۖۥ۬ۤۗۙۘۜۢۤۨۚۨۗۗۛۗۤ۠ۧ۫ۧۨۜۙ۠ۡۜۘۡۨۖۘۖۛۤۙۥۚۨۡۗ۬۠";
                                            break;
                                        case -1336031491:
                                            str5 = "ۢ۟ۨۘ۟ۜۧۘۘۙۙ۬ۖۧۘۢۖۦۘۘۤ۫ۘۚ۬ۚۜۥۚ۠ۡۗۜۘۘۢ۬ۥۗۚۖ۫ۙۗ۟ۡۥۘۘۛۖۤۡۢ";
                                            break;
                                        case -1310578385:
                                            str5 = i == 200 ? "ۡۛ۠ۨۘۖۜۛۥۘ۫ۚۗۙۦۘۘۡۖۗۡۘۨۦۧۨۘۦۘۡۙ۫۟۫ۘۘۛۙ۬ۜ۠۫ۤۦۥۢۤۤۙ" : "ۘ۠ۥۛۜۚۢۖۖۙۖۛۛۛ۫ۡۛ۫ۘۘ۫ۨۘۜۙۢۨ۫۟ۦۘ۫ۖۥۘۥ۠۟ۢ۟ۖۡ۠۠۠ۜۛۨۡۖۢ۫ۙ۟۠ۛ";
                                            break;
                                        case 272614328:
                                            str4 = "ۢۘۛۥۢۘۙۘۚۖۦۦۛ۠۫ۜۨۙ۟ۨۖۘۥۚۙۜۛۡۘۧۢۗۛۦ۫ۡ۠ۤۤۘۡۨۖ";
                                            break;
                                    }
                                }
                                break;
                            case 2079920280:
                                str = "ۖۨۙۙۜۥۖ۟ۛۥ۟ۚۤ۬ۦ۫ۖۥۘۖۨ۫ۚۘۜۛۜۤۖۤ۠۠۬ۖۚ۫۟۟ۛ۟۟ۦۘۘ۟ۥۘۘۧۢ۫";
                                continue;
                                continue;
                        }
                    }
                    break;
                case 1442942809:
                    str = "ۘ۠۫ۜۚۗۡۨۚ۬ۦۜ۟ۙۦ۠ۢۘۘ۟۫ۨۘۦ۬ۧ۬ۧۤ۫ۨۦۘۗۢۛۤۛۘ";
                    continue;
                case 1607954819:
                    String str6 = "۠ۚۨۘۚۗ۫۟ۤۥۘۥۙۢۚۢۡۘۛ۫ۨۤ۟ۛۚۖۘۤ۟ۡۘۖ۫ۘ۟ۗۜ۟۫ۦۘۨۤۛۗۖۧۤۗۚۨۡۚۜۜۥۙۤ";
                    while (true) {
                        switch (str6.hashCode() ^ 1493218427) {
                            case 498849169:
                                str = "ۛ۟ۡۘۦ۫ۛ۫ۜۦۘۛۙ۫۟ۖۡۜۧۖۙۨۥۘ۠ۧۜۖۙۖۘۥۙ۫ۚ۠ۥۗ۠ۘۘۗۤۖۗۖۘۙ۠۬ۘۘۜۜۢۖۘۥ۫ۤ";
                                break;
                            case 928477666:
                                String str7 = "ۧ۟ۘ۠ۤۦۚ۫۫ۙ۟ۢۛۖۢ۟۟ۜۘۛۦۜۘۚ۬ۥۘ۬ۘۖۘۤۢۙ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-871881495)) {
                                        case -2006645332:
                                            str7 = "ۗۚ۟ۧۤۦۤ۫۟ۥۧۡ۫ۗ۟ۗ۫ۨۘۙۡۚۚۛۡۘ۟۫ۦۛۘۚۥۤۡۘۨۜۜۤۨۡۖۙۗ";
                                            break;
                                        case -1912310822:
                                            str6 = "ۧۜۜۘۡۙۘۘۧۤۚ۫ۘۦۥۙۛۘۡۛۗۚ۟ۚۗۜۘۗ۟ۨۘۢ۟ۢۤۢۚۛۜۧۦۘۘۘۛۙۢۨۡۘۦۧۛ";
                                            break;
                                        case -1562288885:
                                            str7 = !Settings.canDrawOverlays(this) ? "ۗۢۦۘ۫۠۫ۘۘۨۢۡۡۖۧۤ۟ۜۤ۟ۦۖۥۡۙۙۖۢۨۘۥۘۘۖۗۙۢۚۧۜۖۛ" : "ۛۗ۠ۧۢۛۘۙۘۥ۫۠ۦ۠ۦۘۙۙۥۗۨۘۘۘۢۘۘۡۨۗۙۨۢۘۜۘۥۨ۫ۖۢ۫ۛ۫ۖ";
                                            break;
                                        case 1448260886:
                                            str6 = "ۧۚۜۗۨۛۡ۠ۨۘ۠۠ۨۦۦۘۘۢۤۦۗۡۗۤۢۤۨۛۡۘۜۥۜۘۗ۫ۦ۫ۦۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1354051554:
                                str6 = "ۛۗۤۢ۫ۥۘۢۛۨۘۘۧۖۘۥ۟ۖۘۖۛۖۧۚ۠۟ۗۘۧۖۡۗ۠ۤ۠ۥۧۘۖۦۜۜۦۜ۠ۙۧۧۥۛ۠۟ۧ";
                                break;
                            case 1866909312:
                                break;
                        }
                    }
                    break;
            }
            str = "۫ۡۖۗۨۗۗۚۚۥۥۙ۬ۚۧۡۧۦۘۡۦۧۘۗ۬ۧۢۚۜۘۡ۬ۡۥ۟ۗۡۖ۫ۥۤۧۜۜ۠";
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = 0;
        String str = "ۤۥۥۘ۟۠ۨۚۢۥۘ۠ۘۘۨ۠ۜۡۢۦۨ۟ۥۖۦۥۢۜۛ۠ۛۡۘۗ۫ۘۥۧۖۘۨ۟ۚۢۙۢۤۖۦۘۦۡۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 931) ^ 980) ^ 379) ^ 2063788847) {
                case -1904289305:
                    this.Ooooooo.OooOOO0();
                    str = "ۤۘۛۤۤۗۥۙۛ۟ۜۘ۬ۢۢۙۥۖۘ۠ۛ۠۫ۛۧۧۧۖۘ۠ۦۖۘۛۢ۟ۖۤۖۜۦۜۘۤۚۖۘۦۖۨ۠ۙۡۘۘ۟ۢۨۙ۫";
                    break;
                case -862949566:
                    String str2 = "ۨۧۘۤۥۤ۫ۦۙۜۚۘۨ۟ۡۗۛۦۘۥ۟۠ۦۡۦ۫ۡۘۙۨۛ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1240925459)) {
                            case -1615457675:
                                str = "۫ۦۧۤۜۦ۠ۧۜۘ۠ۖۥۘۖۜۚۧ۟ۢ۬ۡۘۘۢۤۜۤۙ۟ۙ۟ۢ۫ۛۡۜۘ۟۫۬ۧ۟ۡۦۖ۠ۘۘۗۗۡۘ";
                                continue;
                            case 238404954:
                                str = "ۙۧ۫ۘۡۦۗۚۦۘۙۙۦ۬ۨۦۖۡۥۡۖۙ۬ۧۖۘۢۜۖ۫ۚۜۘۖۢۖۢۗۨۦۗۡ۬ۗۦۜۜۤ۫ۗۚۚۗۡۛۗ";
                                continue;
                            case 272347108:
                                String str3 = "ۤۗۖۘ۠ۥۦۘۧۗۖۗ۬ۤۥ۠ۖ۟۫ۥۖۥۧۖۘۧۨ۠ۤۛۦۤۥۘۘۦۖۘۛۘۦ۟ۧۧۛ۟ۦۘۥۜۙۖۨۡۘۧۨۗ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-821358914)) {
                                        case -1017950633:
                                            str3 = "۠ۘۦۜ۫۠۟ۘۘۢ۟۬ۦۜۘۢ۟۫ۦ۠ۨۚۤۖۘۡ۠۠ۦۖۘۘۜۤۤۘۖۙ۬ۚ۟۫ۤۨۘۤۦۙ۟ۦۧۢۚ۫ۛۖۘ";
                                            break;
                                        case 67015180:
                                            str2 = "ۙۦۗۜۢۜۘ۠ۦۙۚ۬ۧ۬۟ۥ۠۠۫ۥۛ۠ۖ۫ۧ۟ۦۘ۟ۘۦ۠ۤۖۘۨۡ۠۫ۚۡۘۨۧۚ۠ۡۚۥ۟ۛ۠ۘۜۜۡۚ";
                                            break;
                                        case 753547289:
                                            str3 = id != R.id.iv_splash_ad_fullscreen ? "ۘۨۛ۠ۧۥۢۛۦۤۡ۬ۚۜۥۦ۟۟۬ۛۖۘۨۧ۫ۛۖۖۘۖۤۜۗۨۧۦ۟ۡۘ۠۠ۡ" : "ۜۖۧۦۢۥ۠ۚۙۦۤۖۥۢ۠ۙۧۛۢ۬ۘۘۜۥۜۘ۠۠ۗۖۛۙ۫ۜۦۘ۟ۤۙۥۚۦۘۡۨۤۖ۫ۢۤۗۥۡ۠۠ۜۢۤ";
                                            break;
                                        case 1586908102:
                                            str2 = "۫ۥ۫ۜۘۦۘۡۘۥۘ۠ۗۦۛ۟ۨۘۚۧۥۘۙۜۛۚۛۦۘۖ۬ۤ۠ۡۘۙۜۖۘۖ۬۬۠ۡ۫۠ۤۡۘ۬ۜۦۥۢۘۘۖۖۛۛۢۥ";
                                            break;
                                    }
                                }
                                break;
                            case 1322907429:
                                str2 = "ۧۘۗۡۜ۠ۗ۬ۚۛۚ۬ۙ۠ۜۖ۫ۥۜۡۘۧۜۥۙ۟۬ۨۛۗۦ۫ۢ۟ۦۘۙ۟ۦۘ۠ۛۥۘۥۦۗ۬ۡ۫";
                                break;
                        }
                    }
                    break;
                case -798930300:
                    return;
                case 74256160:
                case 532950325:
                    str = "ۤۘۛۤۤۗۥۙۛ۟ۜۘ۬ۢۢۙۥۖۘ۠ۛ۠۫ۛۧۧۧۖۘ۠ۦۖۘۛۢ۟ۖۤۖۜۦۜۘۤۚۖۘۦۖۨ۠ۙۡۘۘ۟ۢۨۙ۫";
                    break;
                case 160978647:
                    str = "ۥ۬ۦۖ۟ۜۘۦۜۧ۫ۗ۫ۥۧ۟۟ۗ۟ۦ۟۟ۖۥۜۘۜ۠ۘۚۦ۠ۦۚ۠ۢ۠ۘۘۛۡۖۧ۟ۥۘ۠۟ۗ۟۫ۖۙۘۛۦۗۗ";
                    break;
                case 664280997:
                    this.Ooooooo.OooO0Oo();
                    str = "ۛۖۨۛۦۧۘۨۡۖۘۨۛۚۤۗۗۧ۫۬۫ۥۛۡۢۖۘۙۜۜۘ۟ۗۖۘ";
                    break;
                case 1348030177:
                    id = view.getId();
                    str = "ۤۥۡۘۦۖۨۘۘ۬ۦۘۦ۬۟ۡ۫ۙۨۤۦۘۚۘۡۙۦۨۘۥۗۙۜۖۤ";
                    break;
                case 1351861752:
                    String str4 = "ۚۖۖۘۘۙۖۘ۠ۚۧ۠ۗ۠ۚ۫ۚۦۙۙۙۦۘۘ۟۬ۚۛۨۜۘ۟۫ۡۘ۬ۖۚۘ۠ۖۚۡۘۘ۟۟ۜۜۜۤ۟ۙ۠۠۬ۧ۟";
                    while (true) {
                        switch (str4.hashCode() ^ (-1294629791)) {
                            case -1827433402:
                                str4 = "ۥۛۢۗۤۡۛ۟ۧۨۚۚۜۗۧۤۘ۬ۦۤۜۘۜۛۢۡۧۚۖۨۧۘ";
                                break;
                            case -797383226:
                                str = "ۘ۬ۘۘۖۜ۬۫ۗۙۙۚۘۤۜۖۡۥۥۘ۠۫ۧۨۨۡۘ۬ۨۢۙ۬ۥۦ۫۟ۗۖۨۘ";
                                continue;
                            case 1038621767:
                                str = "ۡ۬ۘۘۘ۠ۗۤ۠ۡۛۢ۬۟ۧۧۜۤۘ۫ۨۨۚۛ۟ۜۖۢۧۧۙ۟۫ۘۚ۫۫۟ۤ۫ۡۨ";
                                continue;
                            case 1780040106:
                                String str5 = "۟۟ۙۥۨ۫ۙۗۨۖۡ۬ۚۧۘۘۘۖۤ۬ۡۜ۟ۛۨۙ۬ۦۡ۠ۛ۫ۧۙۖۚۛۖۘۤۛۨ";
                                while (true) {
                                    switch (str5.hashCode() ^ 955657421) {
                                        case -1911107738:
                                            str4 = "ۚۧۛۗۖۜۨۖۙ۠ۙ۟ۤۦۢۗۜۜ۠ۧۡۛۢۜۘۘ۫ۜۘۖۜۘۧۥۜۤ۠ۙ";
                                            break;
                                        case -1786017779:
                                            str5 = "ۚۖۦ۠ۢۢۗۛ۫۟ۜۘ۬ۗۖۘۤ۟ۙۡۘۨ۫ۙۦ۫ۖۧۚۤۥ۠ۥۥۤۧۢ۟ۗۡۚ۫";
                                            break;
                                        case -1518949725:
                                            str4 = "ۚۘۘۘۦ۟ۢۥۧۘۛۤۨۘۘۙۖۛ۠ۤۛۖ۟ۥۦ۬ۘۢ۫ۨۡۘ۬ۖۜۡۦۡۘۤ۫۬ۢۜ۫";
                                            break;
                                        case 210365049:
                                            str5 = id != R.id.tv_close_ad ? "ۢۥۦۘۨۘۖۖۤۡ۟۬ۥۛۜۘۜۚۜۡۢۡۘۤۛۘۗۥۡۘۢ۫ۡۘۛۜۘۙۗۢۦۢۜۖ۠ۡۘۘۢۖ۬ۘۜۘۖ۬۟ۚۘۖ" : "ۛۘۖۘۦۤ۠ۢ۟ۚۧۨ۟ۥۦۨۘۤ۠ۖۘ۠ۙۧۥۡۨۛۥۖۘ۬ۨۙ۫ۘ۟ۦۢۜۡۥۡۘۡ۠ۨۖ۟ۡ۫ۗۢۧۢۖۤۖۜۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1635242501:
                    str = "ۥۤ۬ۡ۟ۡۧۙ۬ۚۜۘۡ۟ۜۘۜ۬ۥۖ۬۠ۧۛۡۘۘ۫ۦۘ۠۟ۘۨۜۨۘ۫۠ۡۦۛۦۘۛ۬ۨۘۘۦۨۘۤۥۦ۠ۜۡ۬ۚۘۘ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity, com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۡۥۢۤۨۜۘۜ۠ۗۛۤۗۥۨۨۗۦۧۘۗۖۨۘۜۛ۠۫ۡ۟ۗۛۘۦۨۦۘ۠ۥۜۙۗۜۘۧۗ۬ۢۨ۫";
        while (true) {
            switch ((((str.hashCode() ^ 906) ^ 436) ^ 714) ^ 1411504867) {
                case -1349897182:
                    String str2 = "۟ۙۦۘۘۖۘۖ۬ۖۘۦۧۡۘۘ۫ۥۘۛۙۢۢۨ۟ۦ۟ۨۘۚۘ۠ۜۡۘۘۙۤۦۘۚۘۚ";
                    while (true) {
                        switch (str2.hashCode() ^ 1006926501) {
                            case -558769603:
                                str = "ۢۜۨۘۧ۟ۥۨۖۙۨۗۤۦۛ۟ۡۛۥۢ۠ۥ۠ۜۙۢۢ۠ۧۧۚۧ۬ۢۢۧۘۗۧۖۙۥۘ";
                                continue;
                            case -453516905:
                                str = "ۨۡۜۜۗۜۖۗ۟ۚۧۤ۟ۧۘۖ۟۫ۚۡۘۨ۬ۥۘ۠ۗۢۖۘ۠ۦ۬ۘۘۚۤۗ";
                                continue;
                            case 149152322:
                                str2 = "ۙۡ۬ۖ۬ۦۘۦۧۥۘۛۦۧ۬ۘۖۢ۫ۜۘۡۦۜۘۧۦۘۘ۫ۙۦۘۙ۟ۨۖۗۥۘۦۛۨۘ۠۠ۜۘۧۥۚ";
                                break;
                            case 407977119:
                                String str3 = "ۡۗ۬۠ۘۙۤۤۜۘۢۧۖۘۡۛ۫ۚ۠ۨۘۖۡۙۨۘۥۙۢ۠ۨ۫ۘۢۖۥۘۢۤۧۡ۬۟۟ۥۛۧۥۘۚۢۦۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-2017282578)) {
                                        case -2119858675:
                                            str2 = "ۨۖۦۘۡ۟۟ۘۖۡۘۦۧ۠ۜۦۚۢۥۖۘۨۘۜ۬ۧۜۚۤۤ۠ۦۧۘۡۡۨۘۚ۠ۘ";
                                            break;
                                        case -899927100:
                                            str2 = "۟ۧۢۡۜۚۨۜۧۨۢۡ۫ۨۦۘۖ۟۠ۜۘۧۛۚۛ۠ۥۛ۫ۦۘ";
                                            break;
                                        case -521712358:
                                            str3 = "ۥۛۖ۠ۗ۟ۖ۫ۨۘۖۛۙۚۖ۫ۡۢۖۘۗۥۤۡۡۨۘ۬ۤۗ۠۟۠ۦۙۤۘۜ۬ۢۧۤۗ۠۠۠ۢۗۘۚۢۜۘۥۘۢۗۥ";
                                            break;
                                        case 904214365:
                                            str3 = Build.VERSION.SDK_INT >= 23 ? "ۛۢ۠ۥۢۖ۫۫ۗۡ۠ۡۦۛۦۙۖ۬ۢۨۦۘۦۚۗۖۛۨۘۥۢ" : "ۡۙ۫۠ۖۧۘ۬۬ۤۜۜۘۘ۠۬ۤۘۤۖۘۜ۫ۘۘۢۧ۫ۗۛۖۘۙۛ۬ۢۤۨۧۢۛۢۤۖۘۡۗۖۖۖۨۛۡۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1278925921:
                    str = "ۗۛۦۜۤۢ۬۟۬ۨۜۛۨۦ۫۫ۤۘۚۚۡۘۚۦۧۚۦۜۧۗۜۥۡۧۘۨ۠ۚۘ۟ۨۘ۟ۨۦ۬ۨۡۗ۬";
                    break;
                case -1046908595:
                    Oooo0oO();
                    str = "ۤۨۜۘۧۧ۟ۧۖۜۘۧۦۢ۫ۧۜۘۦ۟ۖۘۦ۬ۙۖۥۖۘ۬ۘۜۗ۟ۢ۫ۘۧۘۦۗۙ";
                    break;
                case -802859961:
                case -231840330:
                    return;
                case -685179777:
                    str = "ۜۖ۬ۛۛۡۧۙۙۜۢۥۘۗۤۡۘۛۘۨۙۢۗۨ۠ۡۜۡۗۗۜۛ۬ۨۙۧۡ۠ۖۢ۠ۢۧۤ۠ۗۦۤۖۨ";
                    break;
                case -3192510:
                    OooOoOO();
                    str = "ۜۖ۬ۛۛۡۧۙۙۜۢۥۘۗۤۡۘۛۘۨۙۢۗۨ۠ۡۜۡۗۗۜۛ۬ۨۙۧۡ۠ۖۢ۠ۢۧۤ۠ۗۦۤۖۨ";
                    break;
                case 362098998:
                    super.onCreate(bundle);
                    str = "۠ۥۖۘۤ۠ۨۤۙۢۖۧۘۜۗۥۘۤ۫ۥۤ۟۫ۙۤۥ۬ۤۤۤ۠ۦ۫ۦۨۗۛۗۜۨۨۢۨۘۧۘ۬ۨۤۦۥۙ۠ۜۛ";
                    break;
                case 599818128:
                    String str4 = "ۖۘ۟۟ۨۧۧۡۜۘۗۙ۟ۤۥۥۘ۟ۛۦۡۘۚ۠۬ۘۡۖۚۙ۠ۨۘۤۜۡۘۢۡۜ۠ۚۘۤۚۚ";
                    while (true) {
                        switch (str4.hashCode() ^ (-543650460)) {
                            case -1815071467:
                                String str5 = "ۥۘۥۜۦۧۘ۠ۙ۬ۛۢۡۨۥ۫ۜۘ۬ۜۧۗۛۜۤۧۜۘۧۡۘۡۦۨ۬ۗ۟ۡۗ۫ۚۢۥۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1622264067)) {
                                        case -663093885:
                                            str5 = "ۛۚۙۢۜۢۚ۫۠ۢۦ۫۟ۡۨۤۤۤۤۙۤۘۛۨۚۡۖۘۖۥۥۤۦ۫ۜۦ";
                                            break;
                                        case -526895779:
                                            str4 = "ۘۧۨۢۥۧۘۧۚۨۘ۠ۖۛۥۡۜۘۡ۬ۤۦۛ۬ۖ۫ۗۚۜۘۙ۬ۙۙۛۥۨۙۖ۫ۚ۟ۦ۫ۢۗ۠ۥۘ۠۠ۖ";
                                            break;
                                        case 62047549:
                                            str4 = "ۨۨۗۥ۬ۗۛۚۛۥۥ۫ۨۥۨۘۘۧ۟ۜۦۘۛۚۦۘۧۛۘۦۡۚ۠۬ۧۖۛۛۨ۬۟۫ۜۡۙۖۙ۟ۦۧۘ۫ۗۛۜۢۥ";
                                            break;
                                        case 692628106:
                                            str5 = !isTaskRoot() ? "۫ۘ۬ۧ۬ۜ۟ۜۜۘۨۙۡۘۛۦۘۘۤۘۦۘ۬ۧۥۢۗۨۘۚۨۦۢ۬ۛ" : "۠۠ۛۜۜۜۤۛۦۚۛۘۜۗۤۤۤۡۦۦۦۢۖ۫۫۫ۦ۟۫۫۟ۦ۫ۢۚ۫ۦۜۤ۠ۚ۫ۡ۟ۜۥۡ۫ۗۧۖۛۤۡ";
                                            break;
                                    }
                                }
                                break;
                            case -1163793696:
                                str4 = "ۘ۬ۥۘۜۖۦۘۤ۫ۖۙۜۘۙۘۛۗۡۤ۟۫ۙۦۢۢۚۦۖۦۧۚ";
                                break;
                            case -216329893:
                                str = "ۚۡۖۘۢۛۤ۬ۜۨۡۧ۟ۧۙۨۘ۫ۘ۫ۦۘۘۘۦۦۥۘۡۗۘۛۘ۬ۡۦۘۤۚۡۘۧۢۖ۬ۢۜۖۜۙۥ۫ۤۗۨۛ";
                                continue;
                            case 750957553:
                                str = "ۨۜۨۘۗۗۨۚۜۤۙۗۛۚۚۙۡۢۥ۫۫ۙۖۜۘۖ۬۠ۡۢۥۘۗۤ۫۬ۚ۟ۘ۫ۦۘ۠۠ۥۘۧۖۜۚۙۖۘ۟ۡۤۡۘۦ";
                                continue;
                        }
                    }
                    break;
                case 658514114:
                    str = "ۘۦۘۛۥۛۥۙۜۜۦۢۤ۟ۗۦۜۘ۫ۧۖۘۗۘۢۘۨۘۛۢ۠ۢۤۦۢ۠ۧۚ۬ۥۢۚۗ";
                    break;
                case 1212908168:
                    finish();
                    str = "ۧۖۥۘۡۤۧ۠۠ۙۖۨۦۘۡ۬ۜۘ۟ۥۘ۬ۥۥۘۡۖۥۤ۫ۜۘ۟ۜۧۦۙۨۘ۫ۖۜۘۥۦ۫ۘ۬";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۤۨۜۡۤۨۥۢۜۘۙۡۡۧۛ۠ۘۢۤ۠ۡۢۡۘۘ۠ۤۜۖۙۤ";
        C4283qh c4283qh = null;
        while (true) {
            switch ((((str.hashCode() ^ 49) ^ 813) ^ 682) ^ (-1940604007)) {
                case -772166267:
                    c4283qh = this.Ooooooo;
                    str = "ۛۧۛ۫۟ۦۤۙۥۘۨۨ۟ۙۙ۟۫ۥۘۘۜ۠ۚۘۦۡۗۙۗۗ۫۫";
                    break;
                case -730853403:
                    str = "۟۬ۡۘۡۦ۠ۗۘۡۨ۬ۗۢۦۛ۫ۧۚۨۢۦۘۛۡۤۖۧۤ۬ۙۤ";
                    break;
                case -714302037:
                    String str2 = "ۙ۠ۦۘۥۙۦۘۤۜۡۥۙ۫ۤۨۜۖ۟ۦۘۦۘۧۚۥۨۘ۟ۗۜۘ۠ۦۢۦۚۦۨ۠ۘۘۢۧۦۛۨ۬ۙۤۚۚۖۡۘ۬۠ۥۙۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1062058443) {
                            case -707365775:
                                str = "ۦۤۖۧۤۖۦۢۡۘ۬ۥ۬ۡۤ۟۠ۢۥۧ۟ۗۜۥۘۘۖۛۖۘۙۗۚ";
                                continue;
                            case 298509556:
                                str2 = "۬ۚۦۙۤۗۜ۠ۨۘۛۖۖ۫ۢ۟ۘۧۨۘۚۢۙ۠ۨۘۚۨۢۖ۫ۦۧۥۙۜ۟";
                                break;
                            case 530397765:
                                str = "ۗۥۗ۟ۨۜۘۜۨۨۨۖۜۘۚۚۙ۫ۘۜۚ۬ۖۢۜۤ۫ۘۚ۟ۗۦۜۖۗۤۘۚ";
                                continue;
                            case 1594279347:
                                String str3 = "ۗۚۡۘۙۡۜۘۤۘۧۘۛۚۦۚۖ۟ۢ۫ۨ۬ۧ۫ۗۘۗ۬ۤ۬ۛۚۗ۫۫ۨ۠ۤ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-839361326)) {
                                        case -1335914584:
                                            str2 = "ۡۜۜۙ۟ۖۜۨۦۘۤۘۖۘۖۜ۫ۧۨۤۦۥ۟ۦۦۡۘۡۖۛ۬۬ۧۖۧۘۘۘۛۡۧۨۧۨۤۦ";
                                            break;
                                        case -51943899:
                                            str3 = "ۚۛۜۥۢۨۡ۟ۖۘۖۗۦۘۧۛۘۘ۫ۖۘۘۦ۟ۖ۟ۛۡۘ۫ۡۡ۠ۨۘۢۜۖۘۙۤۙۨ۟۬ۢۛۘۘۧ۟ۚۥۙۡۢۦۗۛۚۘۘ";
                                            break;
                                        case 1690120778:
                                            str2 = "ۧۤۗۤۥۦۧۦۖۥۖ۬ۨ۬ۢۧۙۤۧ۠ۧ۟ۙۚۤۖۙۡۦۖ";
                                            break;
                                        case 1955505744:
                                            str3 = c4283qh != null ? "ۚۛ۬ۘۦ۠۫ۧۨۚ۬ۦۘ۟۬ۜۘۢۦۘۛۛۦۛۙ۫ۧۢۖۜ۬ۘۘ۬ۥۢۥ۫ۚ۬ۦۖۘۗ۫ۧۖ۫ۙۙۘۘۤۧۥۨ۬ۨۘ" : "ۜۧۖۨۜ۠ۦ۫ۧ۫ۧۜۘۘ۟ۨۛ۫ۜۘۜۡۛۘۥ۬ۧۢۧۢۘۙ۫ۤۗۢۦۥۘۛۧ۬ۖۗۚ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 168420348:
                    return;
                case 1324608407:
                    this.Ooooooo = null;
                    str = "ۦۤۖۧۤۖۦۢۡۘ۬ۥ۬ۡۤ۟۠ۢۥۧ۟ۗۜۥۘۘۖۛۖۘۙۗۚ";
                    break;
                case 1515682186:
                    super.onDestroy();
                    str = "ۢۖ۬۟ۖۗۤۨۘۖ۫ۖۚۧۨۘۢۚۥۘ۠ۛ۟ۡۡ۫ۦۘۥۤۡۘۤۧۢۙۡۨۦۖۡۘ۫ۧۧ۟ۧۥۘ۬ۚ۠ۥۖۘۜ۟";
                    break;
                case 2062265297:
                    c4283qh.OooOOO();
                    str = "ۢۜۧۢ۫ۖۤ۫ۢۤۧۛۢۜۦ۠۠ۡۘ۬ۦ۠ۤۡۧۘ۫۫ۖۜۗۛ۫ۡۧۖۗۢ۬ۜ۠ۛ۟۠ۥۤۤ۠ۧ";
                    break;
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        String str = "۠۟ۡۥۢۚۖ۠ۖۘ۬۠ۨۜۜ۬ۚۙۦۜۗۦۘ۬ۜ۫ۤۥ۬ۥۗۘۜۧۜ۠ۛۥۘۚۗۢۙۜۢ";
        boolean z = false;
        boolean z3 = false;
        while (true) {
            switch ((((str.hashCode() ^ 543) ^ 1002) ^ 237) ^ 813824807) {
                case -2099363888:
                    String str2 = "ۘۥۦۘۚۨۘۦ۬ۡۘۥۗۙۘۜۘۘۨۧ۟ۡۖۛۧ۬۬ۥۢۜۘۘۙۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 152250081) {
                            case -368922619:
                                str2 = "ۦۧۡۥ۬۫ۦۙ۫ۨۘۖ۫۫۫ۥۛۘۤۖۘۨۥ۠ۚۚۨۥۦ۫";
                                break;
                            case 390355306:
                                String str3 = "ۧۤۨۘۥۗۥۚۙۚۖۙۥۥۘۚۜۥۖۖۧۨۙۦۜۘۧ۟ۥۜۤۥۘۛۡۧۘۚ۠۠۫ۖۧۧۘۧۥۧۖۜ۟ۖ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1047152913)) {
                                        case -2026064688:
                                            str3 = "ۦۖۚۦۗۙۛۧۗۥۘۧۘۧ۬ۖ۟ۤۤۗۜۢۗ۫ۛۚۨۘۖۦۦۧۡۖۚۖۜۘ";
                                            break;
                                        case 546747790:
                                            str3 = i == 4 ? "ۗۥۜۘۥۡۜۛۗ۫ۦۖۦۙۥۥۘۖۡۥ۬ۘۖۨۘۛۥ۟ۦۘ۠ۗۢ۟۟ۦۘۛ۬۬ۤۙۛۘۖۥۢ۠۟ۖ۠۠" : "ۗۘۥ۫ۗۨۘۧ۠ۡۘ۬ۤۙۡۖۖۘۙۘۢۖۙۥۖۜۖۘ۠ۛۨ۫۟ۡ۠ۜۜۘۤۤ۬ۤ۠ۗ۬۬۫";
                                            break;
                                        case 760312922:
                                            str2 = "۬۠ۖۨ۬۫ۖ۬ۜۘۢۥۜۘۗۘ۬ۦۢۢ۬ۚۗۙۖۨۘۚۗ۠۟ۢ۟۫ۥ۠ۖۤۨۜۘۜۘۥ۠ۡۘۧۢۘۘۙۗ۠ۥۢۚۥۚۜ";
                                            break;
                                        case 1103620624:
                                            str2 = "ۘۖ۟ۜ۫ۦۚۦۗ۬ۜۦۡۛۙۜۛۥۘۦۨۦۙۧۧۗ۟ۜۘۗۥۛ";
                                            break;
                                    }
                                }
                                break;
                            case 1566139145:
                                str = "۫ۢۖۘۤ۬ۦۧۖۘۛۛۡۘۧۢۖۗۢ۬۠ۘ۠۠ۡۜۘ۫۟ۨۗۧۥۘ";
                                continue;
                            case 2016024244:
                                str = "ۨۜۨۘۤۥۘۘۥۧ۫ۥۖۜۘۙۨ۫ۨۥۘۢۗۖۨۦۨۘۙۚۜۚ۟ۗۘ۬ۧۨۚۗۤۧۢۢ۬ۜ";
                                continue;
                        }
                    }
                    break;
                case -1435076636:
                    str = "۬۫ۢۙۘ۬ۖۙۚۗ۫ۨ۫ۤ۫ۜۥۧ۬۠ۥۘۚ۬ۧ۟ۦۘۤۥۘ۬ۘۤۦۘ۫ۤۤۘۡۘ";
                    break;
                case -1008360847:
                    str = "۬ۛۖۘۧۤۧۨۤۖۘ۬ۛۢۗ۫ۨۚۗۚۤۦۘۘۖۗۙۦ۟ۦۘۢ۫۠ۡۨۖۘۘۧ۫ۗۨۡۜۗۤۢۜۖۦۘۖۘۛۧ";
                    break;
                case -829640398:
                    str = "۬ۛۖۘۧۤۧۨۤۖۘ۬ۛۢۗ۫ۨۚۗۚۤۦۘۘۖۗۙۦ۟ۦۘۢ۫۠ۡۨۖۘۘۧ۫ۗۨۡۜۗۤۢۜۖۦۘۖۘۛۧ";
                    z = false;
                    break;
                case -88430609:
                    str = "۠ۙۛۚ۟ۖۨۨۜۘ۠۟۫ۘۙۘۡۥۦۥۨۡۗۧۘۘۙۥۜۜ۫ۤۙۤ۟ۚۢۢۤۨۘۦ۫۫";
                    break;
                case 20733932:
                    z3 = true;
                    str = "۫ۘ۠ۤ۬ۜۘۧۤۜ۟ۥۤۛ۠ۦۦۖ۟ۤۥۜۘۢۜۢۜۥۛ۠ۗۙۤۜۙۥۥ۬ۘۖۨۘۖۥۜۧۙۡۘۢۜۜۙ۫۬ۚ۟ۡ";
                    break;
                case 340647828:
                    return z;
                case 817795040:
                    str = "ۥۜ۠ۛۜۘ۬ۙ۠۫۠ۥۘۧۚۤۛۜۘۛۤۡۧۦ۬۟ۘۦۘۨۦ۠";
                    break;
                case 1297589697:
                    str = "۫ۡۦ۠ۗۦۘ۠ۜۗ۟ۚ۟ۛ۬ۛۛۜۘۘۤ۬ۡۖۡۖۘ۬۟ۙۜۚ۠ۨۛ۫۟ۛ۟ۡۡۘ۟ۤ۫ۛۚۜۜۜۙ";
                    z = z3;
                    break;
                case 2092399015:
                    str = "ۜ۟۠ۤۧۜۛ۬ۦۨۨۙ۠ۖۛۘۦ۟ۦۘۜۢۖ۠ۖۦۚۚ۠ۘ۫ۗۜۡۦۛۥۗۢۖۘۗ۠ۦۘۜۛۘۘ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        String str = "ۦ۫۫۠ۧۜۘۢۦۖۘۥۥ۠۠ۡۨۘ۫ۡ۟ۘۙۚۡۤ۟ۖۥۧۘۨۤۨۘۡۡۖۘ۫۫ۚ۟ۗۛۚۧ۬";
        int i2 = 0;
        boolean z = false;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        int length = 0;
        while (true) {
            switch ((((str.hashCode() ^ 137) ^ 295) ^ 444) ^ 50748472) {
                case -1765485518:
                    str = "ۨۧۡۤ۫ۡۛۦۦۡۗۜۘۖ۫ۚۘۧۜۘۘۚۘۘ۬۠ۘ۠ۤ۟ۢۗۤۦۜۥ۟ۤ۟ۤۖۖۗۨ۬ۨۨۗۨۗۧۙۦۡۘ۫ۤۦۘ";
                    break;
                case -1718160801:
                    C3753c5.OooO0o0(AppContext.OooO00o(), "获取权限失败");
                    str = "ۥۢۥۘۧۤۜۘۚۗۜۘ۟ۜۗۛۡۨۖۜۚۦۘۢ۠ۚۜۘۡۡۘۘۗۙ۟ۜۙۘۘۛۗۨۛۜۖۧ۫ۨۡۧۙۙۗۜۙۛۤۧۛ";
                    break;
                case -1495196517:
                    str = "ۥۜۧۛۙۥۘۘ۟۫ۙۗۚۚۡۨۘۗۘۨۘ۠ۗ۬ۜ۠ۦۘ۟ۥۖ۠ۛۖۘۘۛ۟ۚۡۜۚۢۧۦۦۙۜۛۖۨ";
                    break;
                case -1354450063:
                    str = "۟۫ۘۘۜۡۜۥۗۦۘۢۜۧۘۡ۬۟۟ۘۤۜ۟ۖۘۡۘۦ۠ۡۗ۟ۦۢۥ۬ۦۧۜۘۘ";
                    z3 = z;
                    break;
                case -1310916186:
                    length = iArr.length;
                    str = "۬۠ۗۗ۫ۖۘ۠ۜۡ۟ۡۦۘ۠۬ۦۘ۬ۚۜۘۦ۟ۚۢ۟ۜۨۧ۠۫ۗۜۘۤ۫ۨۘۨ۟ۘۘ";
                    break;
                case -1002508940:
                    str = "ۦۗۢۦۨ۟ۤۤۗۦۘۚۡ۫ۖۘ۫ۨ۟ۜ۠ۜۘۜۜ۬ۢۚۥۘۜ۠ۡۨۜۛۨۗۗۧ۠ۘۘ۟۠ۧ";
                    break;
                case -880829093:
                    z4 = true;
                    str = "۠۠ۦ۬ۥۢۡۙ۠۬ۦۨۘۧۨۚ۫ۘ۫ۙ۠ۡ۟ۥۚ۟۬۬ۤ۠ۥۤ۠ۡۘۛۥۡۘ";
                    break;
                case -543888554:
                    String str2 = "۬ۢۢۚۘ۠۬ۢۘۘۢۖۚ۠۟۬ۤۙۜۢۖۚ۟ۨۤۙۗۥۙ۠۟۬۠ۨۜۥ۫۠ۗۚۙۖ۟ۡۘۘۢۦ۬ۘ۬ۚۚۧۖ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1949808500)) {
                            case -1402394933:
                                str2 = "۠ۜۜۘۦۨۨۘۡ۠ۜ۬۫ۖۘ۠۠۫ۨۗۜۘۥ۟ۦۘ۬۬ۡۗ۬ۜۘ۟۟ۗ";
                                break;
                            case -1074599459:
                                String str3 = "۠ۖ۬۬ۦۙۢۥۤ۟ۡۘۘۘۘۖۘۖۗ۟ۥ۫ۚۢۥۘۡۘۛۤ۟ۗۦۙۚ۬ۥۦۦۖ۬ۘۜۥۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1414522209) {
                                        case -104996560:
                                            str2 = "ۢ۫ۢۨۛۡۘ۫ۢۥۘۚ۬ۦۘ۠ۨ۫۬ۘۘۘۛ۬ۢۤۡ۟ۜ۠۟ۧۘۚۚ۟ۜۧۙۘۘ۟ۥۘۙۧۧ";
                                            break;
                                        case 1051303657:
                                            str2 = "ۡۤۧ۟۫ۨۘ۟ۛۤۦۘۤۙ۫ۜۧۘۘۥۦۧۘۗۦۘۘۦۧۘ۟ۨ۟";
                                            break;
                                        case 1356438771:
                                            str3 = z3 ? "۟ۖۤۖۗۗ۬۠۫ۧ۬ۡۘۙۗۧۢۚۜ۠ۤۙۤۢۦۜۡۡۘۦۤۖۘۜۨۘۚۚۨۘۚ۬۠ۗۙ۠ۧۨ۬۟۟" : "ۡۢ۟ۧ۠ۡۘۢۡۨۘۘ۟ۥۘۥ۟ۡۘۢۨۙۨ۫ۖۧ۬۟ۢۘۘۢ۫ۨۜۜۥۘۥ۫ۜۦۜۦۘ۬۬ۤۨۤۧۚۢۜ";
                                            break;
                                        case 1362154290:
                                            str3 = "ۥۜۖۗ۬ۦۘۙ۫ۦۘۙ۬ۢ۟۬ۦۘۙۧ۬۠ۡ۬۠۠ۚۗ۬۫ۖۡۘۦۦۢۖۧۘۘ۫ۤۢۢ۬ۨ";
                                            break;
                                    }
                                }
                                break;
                            case -932016289:
                                str = "۟ۡۜۚۖۢ۟ۧۡۥ۟ۧ۬ۗۨ۫ۤۖۙۧۢ۟۬۟۠ۤۖۖۗۜۙۥۘۡۡۧۘ۬۟۠۟ۢۚ۟ۡۧۘ۫۬ۨۘۤۘۘۙ۬ۜۘ";
                                continue;
                            case -297098881:
                                str = "ۧۙۦۘۜۗۜۨۢ۠ۨۚۨۘۚۙۧۦ۠ۢۥۨۚۖۥۖ۟ۥۡۜۚۥۘۨۢۛۛۥۜ۟ۛۙۧۦۥۗۖۙۨۜۘ";
                                continue;
                        }
                    }
                    break;
                case -318890487:
                    String str4 = "ۘۨۖۢ۟ۖۚۖۖۦۨۛ۟ۦۥۘۤۘۙۨۦۤۥ۬ۤ۬ۚۜۘۤۥۚ۟ۥۥۘۦۙۦ";
                    while (true) {
                        switch (str4.hashCode() ^ 1336115102) {
                            case -2064740859:
                                str4 = "ۨۤۛۗۨۧۘۤۚۡۖۖۙۙۙۘۡۤۖۘۨ۠ۜۘۤۥۦۧۖۛۦۖۥۘۦۧۢۙ۟ۖ";
                                break;
                            case -1156951733:
                                str = "ۜۖۘۗۡۦۘۡۥۦۤۙۘ۫۠۟ۥۙۧ۬ۥۗۨۘۥۨۚۛۨۨ۬۫ۜۢۤ۟ۗۤ۟۠ۡۜۧۚ۫۠ۦۘ";
                                continue;
                            case -284314299:
                                str = "۟ۦۚۚ۠ۜۘۘۘۨۘۗۗۤ۫ۜۗ۬ۛۥۨ۟ۧ۠ۛ۠ۤۦۦۘۢۛ";
                                continue;
                            case 662664677:
                                String str5 = "ۦۙۨۘۖۢ۫ۢۖۥۙ۠ۡۦۧ۬ۜۥۘۘۦ۟ۘۘ۠۬ۤۧۜۨۘۖۙ۟";
                                while (true) {
                                    switch (str5.hashCode() ^ 1330309895) {
                                        case -955108879:
                                            str5 = "۟ۘ۫ۗۛۦۛۤ۟ۚۖۙۗ۬ۖۘۖۥۧۘۜۛ۠ۤۙۥۦۙۨۗۥۨۙ۟ۡۡۚ۫ۛۗ۠ۧۤۥۨ۫ۛ۟ۘ۠۠ۚۢۥۖۘۘ";
                                            break;
                                        case 766009264:
                                            str4 = "۠۬۠۬ۥۘOۥۢۢۧۧۥۘ۟ۤۨ۠ۢۦۘۙۨۨ۟ۚ۟۟ۜ۬ۡۡۖۘۥۚۨۘ۬ۛۨۘۡ۟ۚ";
                                            break;
                                        case 844198826:
                                            str4 = "ۡۦۚۡۧۡۘۨۗۖۘۧۖۡۖ۬ۘۖۡۨ۠۫ۙۚۤۜۘۘۨۨۘۚۙۦۘ";
                                            break;
                                        case 1029298752:
                                            str5 = iArr[i3] == -1 ? "ۨۖۖ۠ۗۜۘۢۤۦۥۦۜۘۨۜۤۡۦۖۘۤ۠۬ۦۥۜۡۢۤۧۤۘ" : "۫ۢۜ۬ۖ۫۟ۜۨۘۜۘ۠ۦ۟ۜۡۜۘۙ۫ۗ۠ۦۛۚ۫ۚۙۥۥۘ۠ۥ۬ۖ۬ۜۛ۟ۖۘۘۢۘۘۥۗۡۘۗۗۘۙۜۧۨۖ۬";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -251854015:
                    str = "ۧ۫ۘۘۙۤۨۢۨۢۦۧۜۘۖۧۥۘ۬ۤۘۘۖۨ۫ۙ۬۟ۨ۬ۘۗۦۢۖۧۡۘۖ۬۫ۙۜۜۗۥۤۨ۠ۗۚۨۦۘ";
                    z = z3;
                    break;
                case -245118073:
                    String str6 = "ۢۧۖۘۤۘۜۨۤۖۗۧۨۘ۟ۜۙۢۤۘۡۛۥۘۧ۫ۥۙۛۥۘۘۦۖ۠ۢۗ۫ۧۤ";
                    while (true) {
                        switch (str6.hashCode() ^ 1090154894) {
                            case -284837866:
                                str = "ۦ۟ۚۚ۟ۘۘۛ۫ۘۨۜۘۜۡۡ۬۬۬۠ۧۨۘۦۢۘۘۗۤۗ۫ۢ۟ۢ۫ۢۧ۬ۨۘ";
                                continue;
                            case 480216427:
                                String str7 = "۠۟ۦۘۤۜۦۘۤۦ۠ۗۥۘۘۘ۫ۤ۬ۚۡۘ۬ۦۥ۫ۨۜۥۙۥۚۚ۠ۥۡۡۗ۠ۡۧۖ۠ۗ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1266712395)) {
                                        case -434384246:
                                            str6 = "۫ۢۧ۫ۗ۟ۙۦ۬ۢۙۢۖۘۜۘ۫ۖۖۘۖۙۦۘۦۙ۠ۙۖۘۡ۟۠ۥۛۘۘۚ۟ۥۜۘ۫ۥۚۘۘ";
                                            break;
                                        case 745520974:
                                            str7 = "۠ۖۧۘۚ۟ۥ۬ۖۦۨۢۜۘۦۙۨۖ۬ۥۧ۠ۙۙ۫۬ۨۥۖ۫ۢ۟۠ۡ۟ۤ۫۠ۤۢ۬ۜۖۤۢ۬۫ۡۤۢۨۧۨۡۧۙ";
                                            break;
                                        case 1526347316:
                                            str7 = i3 < length ? "۟ۗۡۘۦۧۤۛۙۦۘۖۨۡۖۡۤۤ۬ۚۗۜۙۦۙۡۛۥۖۥۛ۠ۚۥۡۘۧۚ۬" : "ۦۡۖۘۗۨۤۗ۬ۥۘۡۚۧ۬ۛۨۘۗ۠ۡۘۖ۟ۧۨ۬ۙۦۤۘۘۖۧۘۜ۬ۡۘۨۜۗۧۨۘۤۥ";
                                            break;
                                        case 1529926318:
                                            str6 = "ۢ۬ۢۡۖ۠۬۬۟ۧ۬ۧۘ۬ۗ۠ۧ۟ۨۙۗۘ۬ۜۨۤۘۙ۫";
                                            break;
                                    }
                                }
                                break;
                            case 1043727279:
                                str6 = "ۨۙۡۤ۟ۡۘۡۗۙۗۨۨۘۗۛۢۦۤ۫ۥۙۖۘۡ۟ۖۖۚۧۨۨۥۘ۬۬ۘۘۖۘۧۘ";
                                break;
                            case 1988858577:
                                str = "ۦۖۘۘۥۖۡۘۡۗۦۘۗۛۨۧۦۧ۠۠ۥۘ۫۠۫ۖۢۡۘ۬۟ۡۧۜۤۖۦ۫ۚۤۚۦۘۖۦۖ";
                                continue;
                        }
                    }
                    break;
                case -224570264:
                    str = "ۢۚۡۘ۟ۙۛۛۥۘ۫۟ۢۜ۠ۡۥ۟ۜۜۗۤۤۖۛۢۗۢۜۖۧۘۥۛۡۡۜۨ۫ۖۘۘۖ۬۟۟ۡۘ۟ۙۢ";
                    i3 = 0;
                    break;
                case -85541465:
                    str = "ۨۧۡۤ۫ۡۛۦۦۡۗۜۘۖ۫ۚۘۧۜۘۘۚۘۘ۬۠ۘ۠ۤ۟ۢۗۤۦۜۥ۟ۤ۟ۤۖۖۗۨ۬ۨۨۗۨۗۧۙۦۡۘ۫ۤۦۘ";
                    z3 = z4;
                    break;
                case 146389438:
                    str = "ۥۦۧۚۖ۫ۡۢۦۗۡۡ۫ۙ۬ۖۤۙۚۘۘ۬ۛ۠۬۟ۖۧۤۦۘۨۥۢۦۛۡ";
                    break;
                case 149064758:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    str = "ۗۘ۬ۘۨ۫۬۬ۦۘ۫ۢۖ۟ۘۡۘۛۚۡۨۦۘ۫۫ۗۖۦۥۘ۟ۧ۫ۗۛۚۧۚۦۤ۟ۤ۟ۜۨۦۛۘۘ۠ۚۨ";
                    break;
                case 668532284:
                    str = "۟ۖۚۦ۫ۢۦۢۜۖۖۦۘۦ۟۟ۚ۬ۨۘۙۚۥۙۨۘۥۛۡۚۛۦۧۗ۠ۧۜۖۘ";
                    i3 = i2;
                    break;
                case 760491833:
                    return;
                case 1120532774:
                    str = "ۡۘۡ۠۟ۖۘۖۤۙۙۢۚۗ۟ۖۙ۟ۦۜ۠ۡۧۤ۟ۨ۠ۨۘۗۗۖۙۥۡۘۘۖۡۘۢۗۜۖۚۙۚۗۦۘۦ۫ۖۘ";
                    break;
                case 1121630416:
                    str = "۠ۚۦۛ۫ۖۘۖۜ۬ۙ۫ۜۘۙۖۢۜۙۥۘۗۥۧۗ۟ۦۘۤۙۛۧۥۤۥۖۚۦ۬ۗۢ۫ۧۢۜۘ";
                    break;
                case 1356267163:
                    i2 = i3 + 1;
                    str = "ۢ۫۟ۖۢ۠ۢ۫ۚۤۖۙ۬ۖۘۧۖۖ۫ۥۨ۬ۘ۟ۥ۫۠ۤۡ۠";
                    break;
                case 1546614765:
                    str = "ۜۖۘۗۡۦۘۡۥۦۤۙۘ۫۠۟ۥۙۧ۬ۥۗۨۘۥۨۚۛۨۨ۬۫ۜۢۤ۟ۗۤ۟۠ۡۜۧۚ۫۠ۦۘ";
                    z = false;
                    break;
                case 1669288705:
                    str = "۠ۗ۠۠ۘۦۜۥۤۨۛ۟ۙۚۤۡۨۘۙۜۡۘۧۥ۟ۖۙۚۦۧۦۘۜۧۙۧۥۥۧۤ۠۫۫ۨۘ";
                    break;
                case 1876373767:
                    str = "ۤۘۘۚ۬ۥۥۨۜ۠ۢۦۘۧۗ۫ۗۗ۠ۦۡۦۘ۫ۛۤۧ۬۫۟۬ۖۘۘ۬۫ۦۡۥۘ";
                    break;
                case 1907560452:
                    finish();
                    str = "۠ۗ۠۠ۘۦۜۥۤۨۛ۟ۙۚۤۡۨۘۙۜۡۘۧۥ۟ۖۙۚۦۧۦۘۜۧۙۧۥۥۧۤ۠۫۫ۨۘ";
                    break;
                case 2117004613:
                    OooOoOO();
                    str = "ۗۛۨۘۚۤۘۘ۬ۡۥۦ۬ۘۧ۫ۙ۬ۚۛ۬ۢۜۦۡۖۥۖۘ۫۬ۦ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        C4283qh c4283qh = null;
        String str = "ۛۧۜۘۛۧۜۘ۠ۡۡۘ۬۫ۖۢ۫ۘۘۥ۬۟ۛۙ۠ۨ۟۫ۛۥۖۜۢۚ۫ۗۡۗۧۙ";
        while (true) {
            switch ((((str.hashCode() ^ 478) ^ 623) ^ 927) ^ (-41878364)) {
                case -1273627090:
                    String str2 = "ۥ۟ۘۘ۬ۚۨۘۗۢۜۨۡۚۡۙۧۜ۠ۘۘۡۥۤ۠۟ۥۚۚ۠ۜۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 994738942) {
                            case -1649117022:
                                str = "ۢۚۖۘۡۦ۫ۖۘۜۥۥۡۘۗ۟ۗ۫۠ۨۘۨ۫ۦۘۤۨۖ۟ۗۡۘۦ۬ۖ۟ۧۘۖۢۦۘۘۦۦۘۖۛۡۘۗۥۚ۫ۛۘۘ";
                                continue;
                            case 134350929:
                                String str3 = "ۨ۠ۢۡۧۨۘ۟۟ۡۜ۬ۦۘۡۚۤۙۦۗۙۜۢۚۧ۟ۖۡۦۘ۬۫ۦۤۦۖۘۧۘۦۥۤۥۘۦۚۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1147892875)) {
                                        case -741725117:
                                            str3 = c4283qh != null ? "۠ۛۙ۠ۜۧۡۖۖۘ۟ۡۜۘ۬ۡ۠ۨۨ۫ۤۦۜۘۘۦۗ۬ۤۡۘۜۧۘ۫۟ۚۥۦۘ۠ۦۗۧۗۨ" : "۬ۢۡۘۨۨۡۦۛ۠ۗۜۚ۫ۖۘ۫ۜۗۚ۬ۘۘۙۖۥۘۙۙۥۗۥۤ";
                                            break;
                                        case -79804512:
                                            str2 = "ۧۡۧۡۜۧۘۥ۟ۨۘۢۛۦۘۤۥۥۡۛۡۘۖۨۢۦ۠ۡۘ۬ۤ۫۬ۡۙۨۥۨۘۙۦۚۙۛۡۧۥۘ۫۟ۚۡۨۖۘ";
                                            break;
                                        case 306430424:
                                            str3 = "ۛۜۥۨ۫ۡۖۡۘۘۦ۬ۨۘۘۨۡۘۘۢۦۥ۬ۘ۟ۨۧۘ۟ۖ۠ۦۧۜۘ";
                                            break;
                                        case 1410397567:
                                            str2 = "ۖ۬ۥۢۡۡۖۤۦۗۦ۠۠ۢۙۦۖۤۨۡۘۥۚۘۦۛۙۦۙ۬ۦۧۙۗۚۦۢۗۚۙۨ";
                                            break;
                                    }
                                }
                                break;
                            case 882624353:
                                str2 = "۬۬۬۠ۛ۟ۗۘۜۦۛۘۚۛۥۘۗۗۦۗۤۡ۫۠ۜۘۜۚ۫ۥۛۡۘۜ۟ۢ۫۟ۛۡۜۤۜۢۦۖۗۜۘۚۛۗۙۖ۟۫ۘ";
                                break;
                            case 1752206969:
                                str = "ۢۤ۫۫ۦۘۧۙۡۤۦۘۛۜۖۤۦۘۙ۫ۙۘۜۖۘۖۚۖۤۧۦۘۖۖۖۡۧ۟۫ۢۦۤ";
                                continue;
                        }
                    }
                    break;
                case -1171445884:
                    return;
                case 93217971:
                    super.onResume();
                    str = "ۨۢۦ۫ۡۦۤۡۗ۫۠ۛۘۖۥۘۦۨ۫ۨۢۥۖۢۦۜۜۨۢۗۡۘۘۜۘۙۗۦ";
                    break;
                case 447160923:
                    c4283qh = this.Ooooooo;
                    str = "ۢۜۘۦۦۜۘۗۦ۫ۚ۠ۛ۬ۢۙۛۛۢ۫۫ۛۖ۠ۖۘۡۨۘۦۛۡ۫ۦۧۗۚۧۖۗ۫۟ۙۦۘۙۙۥۡ۟ۙ";
                    break;
                case 968757263:
                    c4283qh.OooOOOO();
                    str = "ۢۤ۫۫ۦۘۧۙۡۤۦۘۛۜۖۤۦۘۙ۫ۙۘۜۖۘۖۚۖۤۧۦۘۖۖۖۡۧ۟۫ۢۦۤ";
                    break;
                case 1435480420:
                    str = "ۘۦۥۘۙۙۜۘۢۚۡۢ۟ۡ۠ۜ۫ۤ۫ۤ۬ۡۥۘۛ۬ۖۤۧۚۨۡ";
                    break;
            }
        }
    }
}
