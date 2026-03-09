package com.cyjh.elfin.p200ui.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.view.PointerIconCompat;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.Script;
import com.cyjh.elfin.entity.ScriptLog;
import com.cyjh.elfin.p200ui.activity.studio.EditDeviceNameActivity;
import com.cyjh.elfin.p200ui.activity.studio.StudioBindActivity;
import com.cyjh.elfin.p200ui.activity.studio.StudioBindClearActivity;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.http.bean.request.UpdateRequestInfo;
import com.cyjh.http.bean.response.VersionUpdateInfo;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.elf.studio.enity.IMResultInfo;
import com.ywfzjbcy.R;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import p285z2.C3678a4;
import p285z2.C3691ah;
import p285z2.C3718b7;
import p285z2.C3753c5;
import p285z2.C3765ch;
import p285z2.C3834ec;
import p285z2.C3839eh;
import p285z2.C3939h6;
import p285z2.C3951hi;
import p285z2.C3974i4;
import p285z2.C3977i7;
import p285z2.C3982ic;
import p285z2.C4048k4;
import p285z2.C4095le;
import p285z2.C4125m7;
import p285z2.C4348s8;
import p285z2.C4381t4;
import p285z2.C4382t5;
import p285z2.C4496w8;
import p285z2.C4529x4;
import p285z2.C4533x8;
import p285z2.C4589yr;
import p285z2.DialogC3944hb;
import p285z2.InterfaceC3865f6;
import p285z2.ViewOnClickListenerC3684aa;
import p285z2.j10;
import p285z2.p10;

/* JADX INFO: loaded from: classes.dex */
public class SettingActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    public static final int o000000 = 1000;
    private static final int o000000O = 1;
    public static final int o000OOo = 3000;
    public static final String o0O0O00;
    private Switch OooooO0;
    private Switch OooooOO;
    private Switch OooooOo;
    private Switch Oooooo;
    private Switch Oooooo0;
    private Switch OoooooO;
    private Switch Ooooooo;
    private Switch o00O0O;
    private Switch o00Oo0;
    private Switch o00Ooo;
    private LinearLayout o00o0O;
    private Button o00oO0O;
    private Button o00oO0o;
    private OooOO0 o00ooo;
    private LinearLayout o0OO00O;
    private TextView o0OOO0o;
    private LinearLayout o0Oo0oo;
    private Switch o0OoOo0;
    private Button o0ooOO0;
    private Button o0ooOOo;
    private TextView o0ooOoO;
    private DialogC3944hb oo000o;
    private String[] oo0o0Oo = {"5秒", "10秒", "15秒", "30秒", "60秒"};
    private Spinner ooOO;

    public class OooO implements TitleView.OooO0O0 {
        public final SettingActivity OooO00o;

        private OooO(SettingActivity settingActivity) {
            this.OooO00o = settingActivity;
        }

        public /* synthetic */ OooO(SettingActivity settingActivity, OooO00o oooO00o) {
            this(settingActivity);
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "ۦۢۖۨۛۦۤۘ۬ۨۖۦۡ۬ۘۨۤۙۧ۟ۛ۫ۤۗۘۦۧۦۘ۠ۘۥۘۤۘۛۦۗۢۚۡۘ۟ۦۧۙۚۛ";
            while (true) {
                switch ((((str.hashCode() ^ 639) ^ 57) ^ 338) ^ 1372758303) {
                    case 723236066:
                        str = "ۛۗۥۛۥۖۤۖۥۖۤۖۘۦۚۦۘۡۢۚۤۦۦۡ۠ۨ۠ۚۜۘۦۤۨۘ۫ۨۥۘۘۤ۠ۘۜۥ۠ۤۥۘۥۖۤۘۨۡۘ";
                        break;
                    case 821217764:
                        str = "ۗۧۜۤۨ۟ۤۖۘ۫ۥۨۘۖۦۘۨ۠ۖ۬ۚۦۦۛ۟ۥۜ۬ۜۙۢۥۛۥۨۥۨ۬۫ۖۡۨ";
                        break;
                    case 868489089:
                        this.OooO00o.finish();
                        str = "۫ۗۘۘۗۙۡۘ۬ۛۥۘ۫ۧۜۚ۫ۖۧۖۘۜۥ۬ۤۗ۠ۙ۫ۡ۟۟۫ۜۨۖۡۡۜۘۚۜۛۛ۫ۗۤۡۖۘ۟۬ۥ۫۫ۢۤۥۢ";
                        break;
                    case 1076297420:
                        return;
                }
            }
        }
    }

    public class OooO00o implements AdapterView.OnItemSelectedListener {
        public final SettingActivity OoooOoO;

        public OooO00o(SettingActivity settingActivity) {
            this.OoooOoO = settingActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String str = "ۧ۬ۛۨۛۡۘ۬۬۬ۙۥۘۙۧۤ۬ۧۛۛۗۢۙۧۥۘۤ۬ۦۙۤۜ۟ۤۤۜ۟ۖۘۡۤ۠۠ۧۛ";
            while (true) {
                switch ((((str.hashCode() ^ 632) ^ PointerIconCompat.TYPE_GRABBING) ^ 600) ^ (-1670314383)) {
                    case -1843204940:
                        str = "۠ۢ۬ۜۙۙۙۙۙۨۥۡ۫ۧۗۜۘۨۘۙۦۤۚۨۙۤۖۦۘۡۗ۠۬ۜۖ";
                        break;
                    case -1233182094:
                        str = "ۛ۬ۛۧ۠ۡ۟ۚۖ۫۠ۨۘۖۛۦۡ۟ۗۚ۟ۚۥۨۦۘ۬ۧۖۥۗۘۘۡ۟ۦۜۡۘۘ";
                        break;
                    case -1026671976:
                        C4529x4.OooO0O0().OooO0oO(InterfaceC3865f6.OooOo0o, Integer.parseInt(SettingActivity.OooO0oO(this.OoooOoO)[i].replace("秒", "")));
                        str = "ۤ۟۬ۜۖۚۗ۫۫۟۫ۙۚۡۙۗۗۢۧۚ۫۫ۤ۠ۧۙۦۚۚ۟ۚۥۘۖۡۜۧۘۖۘ۟ۛۗ";
                        break;
                    case -920206511:
                        str = "ۥۦۘۘۤ۠۫۟ۜۨۘۥۦ۠ۘۜۙۨۡۨ۟ۖۜ۬ۥۘۛۜۤۢۥۦ";
                        break;
                    case 341350716:
                        str = "۫ۛۜۛ۟ۗۚۢۨۘۤۜۨۥۘۡۘۗۖۦۡۢ۬ۡ۠۟ۧۦۥۘۦ۟۠";
                        break;
                    case 422165465:
                        return;
                    case 1761618471:
                        str = "ۨۘۢۘۨۧۨۦۖۦۙۡۘۜۘ۫ۖۖۜۘۢ۬ۜۘۘ۬ۛۦ۟ۚۥۦۗۛۧ۠ۜۖۘۜۦۛۢۡۛ";
                        break;
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            String str = "ۜۗ۟ۜۙۨۘۡ۫۟ۤۘ۫ۨۧ۬ۖۥۘۚۡۘ۟ۙۡۘۙ۠۬۟ۥۖۦۗ۫ۙۙ۬";
            while (true) {
                switch ((((str.hashCode() ^ 790) ^ 735) ^ 368) ^ (-1263875998)) {
                    case 894281355:
                        str = "ۜۖۖۘۖۘۡۘ۫ۧۗۙۥۖۘۜ۠۫ۡ۟ۡۘۗۤۥۘۡۖۙۨۖۧ۟ۤۜۘۧۧۜۘۙ۬ۗۚۨۦۘ۫۬۫ۛ۬ۚۨۜۦ";
                        break;
                    case 1369913291:
                        str = "ۧ۠ۚۖۤۦۖ۟ۜۨۚۨۦۨۤۤۨ۫ۡۥۗۛۖۨ۬ۥۛۡۖۥۘۘۦۥۘۜ۠ۘۘۦۤۥ۟ۦ۠ۜۥۨۘۤ۟۬";
                        break;
                    case 1584843186:
                        return;
                }
            }
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public final EditText OoooOoO;
        public final AlertDialog OoooOoo;
        public final SettingActivity Ooooo00;

        public OooO0O0(SettingActivity settingActivity, EditText editText, AlertDialog alertDialog) {
            this.Ooooo00 = settingActivity;
            this.OoooOoO = editText;
            this.OoooOoo = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "ۗ۠ۨۘ۬ۛۖ۟ۦۙۗۘۜۤۜ۟ۚۧۡۥ۟۠ۦۙۛ۠ۗۚۖ۠ۛۙۡۧۜۘۧۘ";
            while (true) {
                switch ((((str.hashCode() ^ 86) ^ 392) ^ 386) ^ (-1625011881)) {
                    case -1256238637:
                        str = "ۥ۟ۗ۠ۜۖۘۨ۫۠ۛ۫ۤۜۗۡۘۚۘۖۖۥۢۘ۬ۡۘۢ۟ۗ۟ۙۖۥۥۤۦۜۨ۠۫ۗۡۘۧ";
                        break;
                    case -850881728:
                        C4529x4.OooO0O0().OooO0oo(InterfaceC3865f6.OooOo00, this.OoooOoO.getText().toString());
                        str = "۠ۧۡۖۗ۬ۗۨۥۘۗ۫ۨۗ۫ۜۘۗۜۥۘۨۙ۟ۖۨۚۤۢۥۘۤۚۥۘ۠۟ۤۢۥۛ";
                        break;
                    case -593099966:
                        String str2 = "ۙۚۨۡۗ۬۬ۥۨۘۘ۫ۘۥ۬ۖۘۧۖۚۗ۬۬ۥۧۜۙۧۦۘ۠ۜۘۚۜ۫ۖ۬ۤۨ۠ۡۥۨۖ۟ۤۦۘۜۧۡ";
                        while (true) {
                            switch (str2.hashCode() ^ (-935494893)) {
                                case -1437014559:
                                    str2 = "ۨۖۙۗۧۘۧۘۘۨۜۨۗۘ۬ۙۦۡۘۦۚۛ۫۟ۤۥۜ۬ۖۡۘ۠ۙۡۘۨۡۨ۠ۛۢۗۨۘۤۦۨۘۚۧۛۙۖۘۤۛۦ";
                                    break;
                                case -333853891:
                                    str = "ۛ۟ۘۘۥۥۦۥۜۘۚۘۡۡۖۡۘۦۗۨۘۜۜۗۨۢۡۘۖۢۥۘ۫ۚۖۘ۠ۢۥۦ۟ۨ۫ۧۡۘۖۛۖ";
                                    continue;
                                case 895054527:
                                    String str3 = "ۡۘ۠۟ۙۥۘۥۦۨۥۜۨ۟۬ۙۗۖ۫ۚۨۦۡ۠ۜۘۙ۫ۨۛۗۖۜۛۘۡ۠ۡۡۥۘۖۜۡۘۧۡۡۗ۠۬";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-2070212985)) {
                                            case -1759342678:
                                                str2 = "ۧۖۢۜ۫ۨۡۦۨۢۙۘ۫۠ۥۘۖۙۦۘۤۥۚۢۘۧۘۢۗۤ۫ۜۧۘ";
                                                break;
                                            case -1050314850:
                                                str2 = "ۤۚۥۘۨۥۘۡۛۚۢۧۛۤۡۚۢۖۛ۟ۙۖ۠۟ۦ۠ۥۧ۟ۗ۫";
                                                break;
                                            case 871951226:
                                                str3 = "ۤۙۙ۟ۦۨۜۘ۬۠ۛۙ۬ۙ۬ۘۗۥۘۦۛ۫۬ۖۤۜ۠ۚۧۥۤۚۚۧۡۧۘۚۢۡۨۥۚۘۢۨۖۘۦۢ۠ۖۘۢ۟ۙ";
                                                break;
                                            case 957249258:
                                                str3 = TextUtils.isEmpty(this.OoooOoO.getText().toString()) ? "۠ۙۚ۠ۗۨۘۥۧۥۧ۬ۧۘ۫ۦۡۦۧۢ۫ۚ۬ۙۗۦۦ۬۬ۦ۫۫ۚۜ۠ۨۜ۫ۥۜۦ۟ۜۘۗۧۦۘۨۧۘۘ" : "ۖ۫ۧۢۘ۬۬ۡۗۤۘ۟ۜۙۡۢۤۥۘۡۦۙۨۘۖۤ۟ۨۛۥ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1132145476:
                                    str = "ۡۘۨ۠۠ۜۘۤ۫ۤۘ۟ۥۚۚۦ۫ۖۦ۟ۖۦۗۦۜۘۦۖۚۜۖۥۢۛ۬ۖۘۦ";
                                    continue;
                            }
                        }
                        break;
                    case -342726335:
                        str = "ۙۥ۫ۛۛۖۘۛ۠ۡۘۙۤۛ۟ۖۘۨ۬ۡۚۤۗۖۘۨ۬ۖۦۘۤ۟۬ۙۛۖۧۘۧۘۜۗۘۘۦۢۚۙۧ۟ۗۜ۟ۘۘ۬ۤۡ";
                        break;
                    case -58310771:
                        return;
                    case 295006978:
                        C4382t5.o000oOoO("输入不能为空！");
                        str = "ۗۚۤۗۥۧۤۧۚۜۢۢۧۚۚۦۜۚ۫۬ۡ۫ۨ۫ۚۛۚ۬ۨۘۦۛۧۗۘ۫۠۠ۚۗۗۤۗۜۨ۠ۤۨۘ";
                        break;
                    case 914502293:
                        str = "ۨۚ۟ۛۗ۠ۦۚۨۘۨۘ۠ۦۖۛ۟۟۠ۥۢۛ۟۟ۦۘۛۘۦۤۦۧۘۨۖۥۘۨ۟ۡ۫ۡۖۜ۬ۖۘ۟ۘۙۗۧۚ";
                        break;
                    case 926916269:
                        this.OoooOoo.dismiss();
                        str = "ۙۥ۫ۛۛۖۘۛ۠ۡۘۙۤۛ۟ۖۘۨ۬ۡۚۤۗۖۘۨ۬ۖۦۘۤ۟۬ۙۛۖۧۘۧۘۜۗۘۘۦۢۚۙۧ۟ۗۜ۟ۘۘ۬ۤۡ";
                        break;
                    case 1115504773:
                        C4382t5.o000oOoO("已保存！");
                        str = "ۙۡۨۖۦ۬ۗۜۤۧۧ۟ۛ۟ۘۦۧۙۥۨۨۗۖۖۗ۫";
                        break;
                }
            }
        }
    }

    public class OooO0OO implements C3982ic.OooO00o {
        public final SettingActivity OooO00o;

        public OooO0OO(SettingActivity settingActivity) {
            this.OooO00o = settingActivity;
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO00o(VersionUpdateInfo versionUpdateInfo) {
            String str = "ۨۛۜۡۡ۫۠۫ۜۘ۬۟۟ۙۡۛۗ۬ۦ۬ۖ۬ۚ۠ۖۘ۟ۧۘ۫ۥۘ۟ۖۖۘۘۤۙ۫۠ۡۘۨۖۜۘۖ۫ۖۘ۠ۤ";
            while (true) {
                switch ((((str.hashCode() ^ C4095le.o00000oO) ^ 419) ^ 773) ^ (-2119520368)) {
                    case -1647737584:
                        return;
                    case -1038035481:
                        str = "ۧۡۡۘ۠ۚۙۤۦۦۘۢۘۦۘۖۜۦۘۥۦۥۗۧۜۥ۟ۤۧۨۡۗۜۥ";
                        break;
                    case 1417470302:
                        str = "ۡۥۢۡۢۢۚۨۨۧۢۨ۠ۙۦۥ۠ۖۘ۟ۖۨۘ۠۫ۘۘ۫ۡۨۘۥۗۢ۟ۖۢۖۦۘ۠ۛۦۘۥۘۡۙ۬۫ۜۦۧۜۧۘ۬ۤۡۘ";
                        break;
                }
            }
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0O0(VersionUpdateInfo versionUpdateInfo) {
            String str = "ۜ۬ۡۘۘۗۦۘۡۖۚۙ۫ۤ۬ۖ۫ۜۘۚۚۥ۬ۧۘۤ۬ۛۨۨۡۥۦۚۧۨۨۙۢۡۘۢۙۧۙۢۡۘ۟ۨۢۧۡۛ۬۬ۥۘ";
            while (true) {
                switch ((((str.hashCode() ^ 534) ^ 240) ^ 954) ^ (-750015585)) {
                    case -46290889:
                        return;
                    case 349537660:
                        str = "ۤۡۧۖۧۚۖۧۘۥۙۢۦۤۗ۟ۘۘۥۘۧۚۦۘۥ۠ۜۘۘۚۖۙۜۖۡۗ۠ۜۡۚۢ۫ۡۘ۫ۢۦۨ۬۬";
                        break;
                    case 1084591197:
                        str = "ۜۨۦۦۥ۠ۛۚۗۖۥۤۦۚۡۦ۬۠ۜۘۦۘ۟۟ۘ۠ۦ۠۬ۙۧۥ۬ۥۨۦۥۘۘۖۥۛۤۡۧۥۜۜۘۚۢۛۥۗۦ";
                        break;
                }
            }
        }

        @Override // p285z2.C3982ic.OooO00o
        public void OooO0OO(VersionUpdateInfo versionUpdateInfo) {
            String str = "ۛۙۨۘ۠ۧۛۧۨۤۗۙۜۥۨۤ۟۫ۜۚۤۡۘۙۛۘۘۖ۠ۗۧ۫ۡۥۘ۠ۗۥۘۙ۟ۥۦۦ";
            while (true) {
                switch ((((str.hashCode() ^ 874) ^ 438) ^ 21) ^ 72075271) {
                    case -1561050483:
                        str = "۟ۛۘۘۡۨۡۘۢ۬ۢۨ۠ۥۤۗۘۗۙۛۛۥۡۖ۫ۨۘۜۛۨۘۦ۠ۢۙۤۢۜۡ۫ۜۗۘۢ۠ۗ";
                        break;
                    case -667100315:
                        str = "ۖۗۨۘۚۛۚۡۦۢ۠ۧۗ۟ۜۡۖ۠ۖۘۛ۬۬ۧۜ۟ۖۧۡ۬ۜۨ۟ۘۚۡۥۜۗۗۜۢ۟ۘ۠ۘۖۘ۠ۤۙ";
                        break;
                    case 756995790:
                        new ViewOnClickListenerC3684aa(this.OooO00o, versionUpdateInfo, false).show();
                        str = "ۦۖۤۙ۫ۤ۠ۥۨ۠ۡۗۘۖۜۙ۠۠ۢۚۖۘۨۚۖۛۡ۟ۘۜۙۤ۫ۛۙۨۖ۠ۡۙ۟ۜۘ";
                        break;
                    case 947060254:
                    case 1747659943:
                        return;
                    case 1033846583:
                        String str2 = "ۤۤۜۘۢۖ۫۠۬ۥۘۥ۟ۨۥ۟ۡۘۢ۠۬ۡ۠ۥۛۥۚۤۨۡۙۚۡۗۤۜۘۖۨۧۖۗۖۘۛۧ۬ۡۘۥۘۡۤۡۘ۬۫ۗۢۢ۫";
                        while (true) {
                            switch (str2.hashCode() ^ (-1393042209)) {
                                case -1530645021:
                                    str = "۟ۡ۠ۙۦۨۘۛۨ۫۠ۡۢۢۦۡۘۙۦۡۘۡۖۜ۬ۥۜۘۧ۫ۨۚ۬ۡۘۚۜۥۢ۫ۘۘۧۢۡۘۤۢۦۘ۬۠۟ۧۤۨ";
                                    continue;
                                case -68860367:
                                    str2 = "۬۠ۗۙۜ۬۫ۡ۬۬ۧۦۘۤۥۙۤۜۚ۬۟ۙۨۛۛۡۨۗ۠ۦۘۨۦۦۜ۟ۥۘ";
                                    break;
                                case 600475233:
                                    String str3 = "ۜۥ۠۫ۨۧۤۛۦۡۤۖۘۚۡۨۜۡۨۘۚۥۖۗۜۜۘۢۢۜۥۘ۫ۥۦۡۨۥۖ۠ۛۘۦۘۘ۫ۨۨۤ۬ۛۧۦ۬ۢۛۤ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 330694049) {
                                            case -1620120757:
                                                str2 = "ۦ۬ۨۗۘۜۜۚ۬ۙۗۛۤۛۦۨ۠ۧۦۙۛۗۜۗۧۥۥۘ۫ۨۜ۠ۚۛۡۨۨۘ";
                                                break;
                                            case -204670653:
                                                str3 = "ۨۖ۠ۗ۠ۘۘۜۛۦ۫ۦۧۘۢۜۗۥۚۛۡۥۡۘۢۙۨۘۙۚۨۨۨۛ";
                                                break;
                                            case 678889334:
                                                str2 = "۟۠ۥۧ۫ۚۨۦ۬ۚ۫ۛۡۦۧ۫ۧۖۥ۟۫ۙۙۡۘ۟ۛۘ۟ۖۥۚۢ۬ۦۜۥۧۧۘ۫ۛۤۦ۠ۗۘۚۡۙۖۘۘۜۖۢ";
                                                break;
                                            case 972019322:
                                                str3 = versionUpdateInfo == null ? "ۚۤۦۜۧۥۨۡ۫ۖۙ۠ۦۙ۟ۡۗۡۘۨ۫ۥۥۖۥۘ۠ۖۜۦۡۡۘۥ۫۠ۧۢۥۖۗۜ۬۬ۥۗۤۖۘ۟ۤۦۘۧۗۤۚۨۢ" : "ۙ۠۟ۢۛۘۛۚۗۢ۫ۗ۬ۗ۠۫۫۫ۗۧۜۚ۬۟ۙۦۥۗۢۦۘۘ۟ۖ۠۟ۚ۬ۜۧۘۙۗۥۘۛۥۘۢ۫ۧۧۢۘۗۡۢ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1488158668:
                                    str = "۬۫۬ۨۡۧۙۙۘۘۖۤۥۘ۟ۗۥۘ۫ۧۧۦۛۥۘ۫ۛۗۜ۫۫۫ۙۢۧۥۚۤۜۘ۬ۙۜۘۡ۠ۥۧۛۜۢۨۗ";
                                    continue;
                            }
                        }
                        break;
                }
            }
        }
    }

    public class OooO0o implements Runnable {
        public final SettingActivity OoooOoO;

        public OooO0o(SettingActivity settingActivity) {
            this.OoooOoO = settingActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "۠ۡۗۜۧۨۘۤ۫ۨۘۖ۬ۛۥۡۨ۬۬ۖۘۡۛۛۚۥۡۛۚۡۘۛ۟ۤ۟۫ۡۘۥۨۘۤۥۢۧۥۖۥۤ۫ۦۧۥۘۨۚۢۖۘ";
            while (true) {
                switch ((((str.hashCode() ^ 228) ^ 466) ^ 77) ^ (-1903694063)) {
                    case -1718664925:
                        C3765ch.OooOo0(this.OoooOoO);
                        str = "ۘۦ۟ۗۤۗۚۥۨۘۘۤۤ۟۟ۦۘ۬ۢۦۘۙۚۦ۬ۥۧ۟ۤۘۤۥۖۧۧۖۘۚۚۦۜۡۨۘۖۘۛ";
                        break;
                    case -179254083:
                        str = "ۜۥۨۧۥۖۘ۫ۛۜۧۚۘۘۘ۫ۢۖۜۜۘ۬ۖۗۚ۟ۧۧۨۥۘۛ۫ۖۘۘۘۡۧۖۛۡۛۥۘۡۙۥ";
                        break;
                    case 2136693987:
                        return;
                }
            }
        }
    }

    public class OooOO0 extends CountDownTimer {
        public final SettingActivity OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private OooOO0(SettingActivity settingActivity, long j, long j2) {
            super(j, j2);
            this.OooO00o = settingActivity;
        }

        public /* synthetic */ OooOO0(SettingActivity settingActivity, long j, long j2, OooO00o oooO00o) {
            this(settingActivity, j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            String str = "۬ۢۚ۟۠ۤ۠۫ۘۘۙۗۜۚۚۦۦۤۦۛۖۘۧۗۦۧۖ۠۬ۢۡۚۢۜۙ۫ۤ۫ۗ۬ۥ۟ۡ";
            while (true) {
                switch ((((str.hashCode() ^ 756) ^ 836) ^ 488) ^ 1689159354) {
                    case -1993748719:
                        String str2 = "ۛۧۥۘۗۨ۫ۨۘۘۨۥۡ۫ۗۢۥۨۧۘۜۢۘۦۨۘۛۖۚۗ۠ۢۖۦۜۘۖ۟ۜۘ۫ۖۧۘۤۘۦۤۛۘۥ۬ۜۘ";
                        while (true) {
                            switch (str2.hashCode() ^ (-726733653)) {
                                case -1397604468:
                                    str = "ۥۡۧۜ۫ۜ۬ۜۜۘ۠۫ۙۤۢ۟ۛۙۢۡۗۗ۟ۛۖۗ۫۠ۘۚۘ۟ۦۧۘۚۛۖۘۖ۟ۖۘۛۧۖۘۢۛۡۘۘۙۢ";
                                    continue;
                                case 368509114:
                                    str = "ۜ۠ۦۥۤ۬ۚ۠ۦ۫ۗۧۛۤ۟ۨۧ۬ۖ۟ۗۜۨ۫ۙ۠ۡ۠ۘۘۘۘۦۤۧۖۛ۫ۗۨ۟۠ۛۘ۫۠۬ۖۘۦ۬۠ۨۛ۬";
                                    continue;
                                case 1015123944:
                                    str2 = "ۨ۠ۛۚۥۗۚۙۙۜۤۡۘۜۧۖۧۦۥۘۚۢۖۘۗۗۧۥۛۤ۬ۥ۫۠۬ۡۘۙۚ۠ۥ۟ۥۚۚۘۘۨ۬ۜۘۙۦۡۘۜۙۖۨۧۘ";
                                    break;
                                case 1486870011:
                                    String str3 = "ۖۚۜۘ۬ۛۨۚۚ۫۫ۡۘ۬ۦۘۡۥۗۦۗۦۛۚۜۘ۬ۦۜۙۢۗۜ۠ۨۚۖۘۗۦۘۢۦۥۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-998744817)) {
                                            case -1815831417:
                                                str2 = "ۡۤ۫ۖۥۛۛۙۚۧۘۧۧۡۦۘ۟۬ۢۤۢۨ۫ۛۜۘ۠۠ۘۘۨۧ۟ۖۗۛ۬ۡۚۨۛۡۘۜۥۖ";
                                                break;
                                            case -612443202:
                                                str3 = SettingActivity.OooO0oo(this.OooO00o).isShowing() ? "ۤۗۡۘ۟ۜۡ۬ۛۘۘ۠ۢۨۡ۠ۤۦۤۘۘۗۨۗۜۘۧۙ۟ۦۘۙ۫ۨۥ۫۬۬۫ۖۘۘۡ۟ۢ۬ۜۘۙۦۘۘۡ۫ۢ" : "۬ۘۨۘ۬ۥۗۗۨۙۘ۟ۘ۟ۚ۟ۡۗۙۥۗۖۘۜۘۢۜۚۗۘۙۢۦۨ۠۟ۧۙ۠ۢ۟ۤ۟ۧۤۗۧۥۢۨ";
                                                break;
                                            case 103451212:
                                                str3 = "ۦۘۚۘۗۦۘۦۤۖۡۨۥۖ۬ۚۛۜۖۧۨۗۜۢۘۚۨۘۜ۫۫ۚۢۛۜ۫ۥۦۘۙ۟ۡ";
                                                break;
                                            case 1724215974:
                                                str2 = "۫ۘۙۘۦۥۧۦ۟ۖ۟ۡۘۙۖۧۘۥۗۘۘۡۢۦۘۨۨۦۘ۬ۥۘۛۗۗۥۜۖۘ۠ۜۖۘۜۢۛۡۦ۠۟۟ۢۧ۫ۚۧۡۤۚۨۢ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case -1409686827:
                        SettingActivity.OooO0oo(this.OooO00o).dismiss();
                        str = "ۜ۠ۦۥۤ۬ۚ۠ۦ۫ۗۧۛۤ۟ۨۧ۬ۖ۟ۗۜۨ۫ۙ۠ۡ۠ۘۘۘۘۦۤۧۖۛ۫ۗۨ۟۠ۛۘ۫۠۬ۖۘۦ۬۠ۨۛ۬";
                        break;
                    case 896654202:
                        return;
                    case 1985263436:
                        str = "۬۠ۜۘۡۥ۠۠ۧۥۜ۬ۜ۫ۘۜۖۧۡۖۥۧۚۛۢۢۥۧۘۧ۟ۡۤ۬ۡۥۤۖۘ۫ۗۦۘ۬ۤۘۘۙۦۨۛ۠ۦۘ";
                        break;
                }
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            String str = "ۦ۠۠ۢ۟ۢ۟۫ۡۘۢۘۖۛۜۤۗ۟ۚۘۤ۠ۙۛۡۘۖۛۥۥۨ۠ۨۛۗۜۜۨۘ۠ۗۦۘ۠ۙۚۛۤ۠ۜۡۖۘۢۙۤۚۤ";
            while (true) {
                switch ((((str.hashCode() ^ 861) ^ 959) ^ 899) ^ (-254846357)) {
                    case -2106536477:
                        str = "ۧۨۙۚۚۤۙۦۖۘۚۨ۬۬ۤ۠ۢۨ۫ۚۤۖۙۙ۠ۨۡۘۧۡ۬ۥۡۦ۠ۘ";
                        break;
                    case 710105649:
                        return;
                    case 1033263120:
                        str = "ۢۥۥۨ۟۬ۡۨ۟ۧۥۖۙۘۖۗۜۡ۫۟ۘۘۛ۫۠ۙ۫ۢۜۙۘۘ۟۬ۘۘ۫ۙ۬ۥۘ۬ۙۨۡۘۥۨ۟ۙ۫ۦۘ";
                        break;
                }
            }
        }
    }

    static {
        String str = "۫ۡۖۘ۬ۤۥۘ۫۫ۗۛۡۢۢۢۨۥۧۘۧۡۨ۟ۘۡۡ۟ۜۢۦۡ۟ۧۗۚۨ۫۬ۖۛۨۛ۟۟ۛۡۤۜۗ";
        while (true) {
            switch ((((str.hashCode() ^ 650) ^ 657) ^ 136) ^ (-203490950)) {
                case -2135968631:
                    return;
                case 1019495227:
                    o0O0O00 = SettingActivity.class.getSimpleName();
                    str = "۫۬۟۫ۤۦۘۘۗۥۢ۫ۜۢۨۘ۬ۗۥۤۥۦ۟ۜۛۤۘ۫ۤۤۜۘ۟ۡۘۢۧۘۘۜۡۦۘ۟ۦ۠ۥۗ۫ۤ۫ۗۛۡۙۚۜۛ";
                    break;
            }
        }
    }

    private void OooO() {
        String str = "ۘۤۚۡۨۥ۫ۚۖۖۥۡۥۖۚۙۚ۟ۦۨۢۙۖۖۛ۬ۢۛۡ۫ۚ۫۠ۤۘ";
        Boolean bool = null;
        C4529x4 c4529x4OooO0O0 = null;
        Switch r4 = null;
        Boolean bool2 = null;
        C4529x4 c4529x4OooO0O02 = null;
        Switch r7 = null;
        while (true) {
            switch ((((str.hashCode() ^ C4589yr.OooO0O0) ^ 628) ^ 375) ^ 1415451348) {
                case -1049284505:
                    this.o00Oo0.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOo, bool));
                    str = "ۜۥۛۜۧ۫۟ۘۤۨۥۚ۠ۡ۫ۛۦ۟ۛۘۜ۬۫ۗ۟ۙۖۘۨۘۤۙۡۡۘ۟ۢۡۢۥۚ۠ۖۤ";
                    break;
                case -811812048:
                    this.o0OoOo0.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOo0O, bool));
                    str = "ۤ۠ۦۗ۫ۜۥ۬ۥۖۚۖۘ۟۫ۥۨۨ۟۬ۛۘۘۡۡۘ۬ۧۤۖۜۧ";
                    break;
                case -740483958:
                    this.OoooooO.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOOO, bool2));
                    str = "۠ۦۢۧ۠۫ۜۢۚۘۨۥۘۗۗ۟ۦۥۦۘۘۙ۬ۨۡۙۤ۠ۧۤۗۛ";
                    break;
                case -533632894:
                    return;
                case -448658111:
                    this.OooooOO.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOO0o, bool2));
                    str = "ۨ۠ۜۘۡ۬ۜۘۨۗۨۘۘۥۦۘ۟۬ۡۘۚۗۤۤۨۜۙ۫ۚ۬ۥۧۥۛۦۖۙۗ۠ۛۥۖ۟۠ۜۥ";
                    break;
                case -380710067:
                    str = "۟ۜۗۨۖۢ۠۫ۜۘۚۥۛۘۦۖۦۙۢۚۙۙۧ۬ۧۗۖ۫ۧۡۦۘۛ۫ۜۘۧۛۦ";
                    c4529x4OooO0O0 = C4529x4.OooO0O0();
                    break;
                case -377202943:
                    this.Ooooooo.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOo0, bool));
                    str = "ۢۦ۠ۖۖۡۘ۠۟ۥۘۢۧۗۨۦۦ۟۬ۘۘۤۘ۫ۚۙۜ۬ۢۢۘۨۘ۬۬ۨۘ۫ۖ۬ۛ۠ۥۧۢۥۘ";
                    break;
                case -265812776:
                    r7.setChecked(c4529x4OooO0O02.OooO00o(InterfaceC3865f6.OooOO0O, bool2));
                    str = "ۖۙۚۢۛۜۜۛۢۗۙۡۧۧۦۨۥۜۜۖ۟۫ۦۤۢۦۨۘۖۢۡۨۛۥۡۨ۠ۖ۫ۥۙ۬ۖ";
                    break;
                case 207515034:
                    this.Oooooo.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOO, bool2));
                    str = "ۙۙۨۥۨۦۘۥۤۜۘۨۜۡ۠ۗ۫ۨۧۘ۠۬۟ۚ۟ۢۥۗۙۗۧۨۘۘۨۖۘ۫ۨۛۢ۬۟ۚۜۙ۫ۢۙۢۦۘ";
                    break;
                case 282492121:
                    this.Oooooo0.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOO0, bool2));
                    str = "ۦۗۖۨۜۚ۠ۢۖۘۖۡۘۜ۬ۧۙ۬ۦ۟ۗۖۘۜۡۧۗۥۧۗۨۦۗ۬ۥۘۜ۟ۘ";
                    break;
                case 371566469:
                    str = "۫ۚۙۗۙۜۗۜ۬ۖۨۧۘۡۗۘۘ۬۫ۧۧ۠ۥۨۢۢۙۛۗۘۙ۬ۗ۠ۡۘۗۛۖۘۜۙۜۛۢ۟";
                    r7 = this.OooooO0;
                    break;
                case 566862737:
                    str = "ۧ۬۫ۥۨۘۡۦۦۘۡۗ۬۟ۜۧۡ۟ۙۨۢ۬ۙۚۜۘۧ۫ۡۧۥ۟ۛۦۖۘۥۜۖۨۛۦۘۢ۠ۨ۠ۦۧۛۢۨۘۖۥۨۘۦۛۙ";
                    break;
                case 888864251:
                    bool = Boolean.FALSE;
                    str = "ۜۖۖۘۥۥۗ۬ۡۖۘۚۖۨۘۧۘۦۢۥۘۧ۬ۥۘۧۜۛ۬ۦۦۙۜۙ";
                    break;
                case 1020367425:
                    str = "ۥۖۤۢۡ۬ۨ۟ۘۙۘۘۜۖۖۘۘۨۚۢۚۙۥۘۜ۫ۧۘۤۤۥ۫۬ۖ۠ۥۜ";
                    bool2 = Boolean.TRUE;
                    break;
                case 1162754750:
                    str = "ۧۛۖۡۖۦۘ۬ۧ۬ۘۧۘۤۧۦۨۡۡۗۦۗۙ۬ۙۦۧۘ۫ۨۥۘۛۤ۟ۡۙۛۦۖۢۗ۫۬";
                    c4529x4OooO0O02 = C4529x4.OooO0O0();
                    break;
                case 1302813302:
                    str = "ۢۜۖۧۙ۫ۜ۬ۢۧ۫ۧۜۗ۬ۗۙۨۘۦۙۗۚۙۨۘۗ۫ۖۘۡۦۜۗۧۤۙۚۖۖۖۦۖۜۛۜۧۡۥ۬ۨۦۡۖۚۧۨۘ";
                    r4 = this.o00O0O;
                    break;
                case 1399218861:
                    r4.setChecked(c4529x4OooO0O0.OooO00o(InterfaceC3865f6.OooOOo0, bool));
                    str = "ۘۢۡ۬ۛ۟۬ۖۢۚۖۦۛۤ۟ۧۚۛۧۗۨۘۜ۟ۥۘۥۗۡ۟ۛۢ۠ۜۨ۠ۨۤ۬ۖۧۘۥۤۤ";
                    break;
                case 1652218038:
                    this.o00Ooo.setChecked(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOoo, bool));
                    str = "ۧۜۚ۬ۦۢ۫۫۬ۧۡ۫۟ۧۥۘۥۦۤ۫۬ۡۘۧۚۨۘۖۥۢۘۙۘ۟۠۬ۦۨۨۦۡۘۤ۫۠";
                    break;
            }
        }
    }

    public static /* synthetic */ String[] OooO0oO(SettingActivity settingActivity) {
        String str = "۟۬۫ۤۛۥۘ۟ۧۧۗۥۢۛۦۥۘ۠۠ۖۘۙۧۦۗ۫ۜۘۛۦۜۘۡۡۛۢۙۥۙ۟ۢ۟ۧۘۨۖۚ";
        while (true) {
            switch ((((str.hashCode() ^ 630) ^ 710) ^ 443) ^ 2139863453) {
                case -2041909211:
                    str = "ۧۖۢۜۙۢۤ۠ۦ۫۬ۛۛۤۖ۫ۡۡۨۥۘ۠ۡۥۖۨۛۨۦۤۙۨۛۗۛۦۘ";
                    break;
                case 216963306:
                    return settingActivity.oo0o0Oo;
            }
        }
    }

    public static /* synthetic */ DialogC3944hb OooO0oo(SettingActivity settingActivity) {
        String str = "ۦ۬ۖۘۧۛۨۘۥ۬ۙ۬ۧ۟ۗۛۤ۟ۢۜۜۖۖۤۥۖۘۤ۠ۜ۟ۨۙ۟۫ۨۨۚۥ";
        while (true) {
            switch ((((str.hashCode() ^ 814) ^ 930) ^ 356) ^ 721642029) {
                case -804165046:
                    str = "ۚۜۨۘۨۙۘ۫ۙۡ۬ۚۙۜۧۖۚۗۘۘۥۨۦۨۢۜ۫ۥۨ۟ۤۛۨۚۡۜ۬ۦۢۜۖۘۗۥۡۛ۟۫ۦۗ۠";
                    break;
                case 1474516051:
                    return settingActivity.oo000o;
            }
        }
    }

    private void OooOO0() {
        OooO00o oooO00o = null;
        String str = "ۡۖۧۘۦۚ۠ۦۨۘۘۦۘۜۥ۫ۗ۬ۦۥۤ۠ۤۜۖۖ۟ۤۤۛ";
        TitleView titleView = null;
        while (true) {
            switch ((((str.hashCode() ^ 864) ^ 758) ^ 194) ^ (-103813671)) {
                case -1745827244:
                    return;
                case -1345284634:
                    titleView.setleftImage(R.drawable.ic_back);
                    str = "۠ۛۨۘۚ۟۫۠ۗۦۘ۬ۨۤۖۥۢۥ۬ۨ۟ۨ۠ۚۚۧۨۤۘۧۜۚۘۥۖۥۤۖۚ۬ۡۚۡۜۘ";
                    break;
                case -826463359:
                    titleView.setVisibilityRightImage(4);
                    str = "ۚ۫ۚۦۘ۟ۙۘۛۗۥۜۘ۫ۨ۠ۖۢۘۘ۫ۛۦۘۧۢ۫ۦۦ۠۫ۥ";
                    break;
                case 814901441:
                    str = "ۖۥۥۘۡ۬۟ۙ۟۟ۚ۟ۡۙ۬ۚۢۧ۬ۘۚۦۥۤۙۡۥ۠ۘۗۢۚۢۘۤ۟ۧۤۨۘۖۧۥۥ۠ۧۡۡ۫ۘۨ۫ۤۥۖ";
                    break;
                case 818355924:
                    titleView.setOnLeftImageViewListener(new OooO(this, oooO00o));
                    str = "ۚ۟ۖۘۖ۬ۨۧ۬ۜۧۧ۬ۜۤ۬ۘ۬ۖۤۖۤۥ۟ۗۧۡۧ۫ۦۢۘۨۧۥۗۛۙۛۡۘۢ۟ۘۦۘ۫۠۬ۤ";
                    break;
                case 1203362633:
                    titleView.setTitleText(R.string.setting);
                    str = "ۙ۟۬۟ۚۙۥۤۤۥ۟۫ۘ۫ۗۜ۫ۗۧ۫۫ۥۥۖۘ۫ۥۥۚۛۜۘۢۡۘۦ۠ۥۘۜۥۧۘ۬ۦ۠";
                    break;
                case 1293005344:
                    titleView.setVisibilityLeftImage(0);
                    str = "۬ۦۖۘ۫ۧۚۢۗۨۦۥۧۙۖۨۘۚۡۗ۫ۙۦۘ۟۟ۖۘۡۥۜۙ۟ۛ";
                    break;
                case 1452882218:
                    str = "ۗۧۤۥ۫ۡۘ۠ۥ۬ۜۥۛ۟ۚۜۘ۟۠۠۠ۢۥۘۜۡۧۘۥۛۚۛۗۜۘۤۖۚۢۡ۟ۖ۬۬ۖۦۛۦۤۜۘۛۡۦۘ";
                    titleView = (TitleView) findViewById(R.id.titleview_setting);
                    break;
            }
        }
    }

    private void OooOO0O() {
        TextView textView = null;
        String str = "۬ۡۢۙۥۘۘۖۜ۠ۜۡۜ۠ۨۧۘۚۜۘۘ۫ۛ۟ۥۧۡۘۘۙ۟ۗۧ۬۬ۘۘۥۜۖۢۦۦ۠۫ۢ۠۫۟ۤۨۘۨۗۘۘ۟۫۬";
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((((str.hashCode() ^ 752) ^ 917) ^ 761) ^ 1703901719) {
                case -1745013375:
                    return;
                case -1709112193:
                    str = "ۗ۫ۥۗ۫۬۟ۥۥۜ۠ۡۗۙ۬ۛۥۢۘۙۦۘۢۖۘ۟ۨۘۘۡۖۦۤۢۧۗۦۘۡۗۡۗۙۗۥۢۨۘۗ۠ۛ۟ۛۤۥ۟";
                    break;
                case -1542229695:
                    str = "۠ۤۨۢۘ۠ۛ۟ۖۘۚۛۦۚۗۘۘۢۦۚۚۤۗۗۙۤۙۥۘ۠۠ۗۚۗۖ۬ۧۙۘ۟ۖۛۨۗ";
                    i2 = i;
                    break;
                case -859537957:
                    i3 = R.string.not_binding;
                    str = "ۖۧۖۨۜۨۘ۬ۗۙ۠ۡۘۘۛۖۥ۠ۚۚۨ۫ۦۘۢۥۘۘ۠ۦۡۙۢۡۘۖۡۖۘۨۘۙۛۚۗۡۥۘۥ۟ۨۘۨۖۚ۬ۨۡۘۨۗۥۘ";
                    break;
                case -749115621:
                    str = "۠ۤۨۢۘ۠ۛ۟ۖۘۚۛۦۚۗۘۘۢۦۚۚۤۗۗۙۤۙۥۘ۠۠ۗۚۗۖ۬ۧۙۘ۟ۖۛۨۗ";
                    break;
                case -651492201:
                    String str2 = "ۛۢ۬ۦۜۥۘۡۢۜۜۢۚۧۢۥۘۧۡۜۘۗۡۜۘۘ۟ۗۨ۬ۧۦۦۘۡۘ۠ۡ۬ۥۘۗۖۘۘۚ۬۫ۥۤۧۥۥۨۘۙۙ۫ۚۥۤ";
                    while (true) {
                        switch (str2.hashCode() ^ (-147208449)) {
                            case -1642428509:
                                str2 = "ۥۚۡۘۘۖۦۨۡۧۘ۬ۥ۬۠۫ۦۘۥۦۧۛۜۨۘۘ۠ۥۥۛۧۤۖ۬";
                                break;
                            case -955183853:
                                str = "ۙۙۗۖۦۡۥۥۚۛ۠۠ۨۧۖۙۦ۠۟ۡۛۚۢۡۡۙۨۘ۫ۨۘۨۖۘۤ۫۫ۡۖۧۡ۫ۢ";
                                continue;
                            case -459122912:
                                String str3 = "ۙۦ۟ۤۢۘ۟ۨۙۛۖۡۤۧۡۨ۠ۨۚۛۧۘۡۘ۠ۡۦۧۗۚ۬ۙۡۖۨۨۘ۟ۧ۬ۛ۠۟";
                                while (true) {
                                    switch (str3.hashCode() ^ 697207918) {
                                        case -1830461635:
                                            str3 = "ۢۧۢۖ۠ۡۘۘۗۜۦۧۘۥۗ۬ۢۡۥۗۢۦۘۨۛۦۘۤۜۨۘۡۙۛۛۡ۠ۨۥ۬ۨۘۦ۟۫ۨۦۘۧۢۥۨۗۗۡۦ";
                                            break;
                                        case -1393082508:
                                            str2 = "۬۬ۧۢۛۥۖ۬ۡۘۧۨ۟ۛۥۦۘۢۖۖۘۗ۫ۖ۟ۚۛ۠ۤۡ۟ۨۦ۬ۖۘۙۙۢۤۚۗۘۛۢ۠ۘۖۜ";
                                            break;
                                        case 657723680:
                                            str3 = TextUtils.isEmpty(AppContext.OooO00o().OoooOoO) ? "ۛۙۡۖۙۡۚۖ۠ۡۚۦۧۤۡ۠ۜ۬۟ۧۦۘۖۖۖۘۙۘ۠ۜۦ۟ۚ۟ۤۧۦۘۘ۟ۘۥۘۦۛ۟ۜ۬ۛۙۡۡۘۦۨۘۘۖۙۢ" : "ۗۧۖۚۜۙۙۡۖۖۘۡ۫ۖۘۙۖۘۥ۟۟ۥۗ۫ۡ۟ۡۘۛ۬ۤ";
                                            break;
                                        case 1717693355:
                                            str2 = "ۢۘۤ۟۟ۥۖۡ۬ۙ۠ۡۘۢ۬۫ۦۙۤۛۦ۠ۨ۫ۛۦۥۘۡ۬ۥ";
                                            break;
                                    }
                                }
                                break;
                            case 363752806:
                                str = "ۚۙۥۤ۠ۜۜ۫ۦۗۦۨۘۨۜۡۘۘۛۙۨۜۙۘۗۡۘۤۖۨۢۘۦۘۚۢۚۦۛۛۚ۬۠ۥۡۨۜ۠ۜۘ۫ۗ۠";
                                continue;
                        }
                    }
                    break;
                case -353803721:
                    i = R.string.already_binding;
                    str = "ۖۛ۬ۜۨۗۢۘۘۘۙۤۦۘ۟ۧ۠ۖۡۦۥۡۦۘۦۧ۠۠ۤ۬ۛۙۥۘۧ۫ۦۡ۬ۥۘۖۨۡ۠ۚۨۙۦۥۘ۠ۡۙۨۙۚ۬۬ۜۘ";
                    break;
                case 372531885:
                    str = "۫ۙۖ۟ۥۖۗۘۜۛۛۙۢۙ۠۠ۗ۟ۢ۫ۤۥ۫ۥ۬ۛۨۘۢۢۥۘۤۢۜۛ۫۟ۥۡۜۨۜۘ";
                    i2 = i3;
                    break;
                case 482254394:
                    str = "ۚۘۘۙۖۧۨ۠ۜۜۖ۟ۤۜ۫ۛۜۜۘۢۡ۟ۥۛۖۘۜۨۛ۫۫ۢۚ۟ۨۘۗ۫ۨۥۧۖۘ۬ۗۨۘۙۘۥۘۜۛ۟";
                    textView = this.o0ooOoO;
                    break;
                case 881183659:
                    textView.setText(getString(i2));
                    str = "ۛۤ۬ۨۚ۬ۗ۫ۡۘۨۤۦۘۤۛۧ۬ۖۦ۬ۧ۫ۖۢۖۘۧ۟ۨۖۨۘۘۚۤۡ۫۫ۨۘۥ۫ۜۘۛۛۘۥۚۨ۠ۨۦۧ۟ۦۚۜ۠";
                    break;
            }
        }
    }

    private void OooOO0o(String str) {
        String str2 = "ۘۡۚۡۧ۠ۨۛۤ۫ۜۨۚۖ۟۬ۡۦۘۛ۫ۜ۬۟۬۠ۖۥۘۗۜ۫ۚۜۘۘۥۛ۠ۘۛۛۚۨۗ۬ۢۜ۟";
        IMResultInfo iMResultInfo = null;
        Script scriptOooO0oO = null;
        while (true) {
            switch ((((str2.hashCode() ^ 426) ^ 128) ^ 737) ^ 1006727799) {
                case -1852199236:
                    str2 = "۫ۤۘۘ۫۫ۚۢۦۘۜ۫۫۠ۦۘۚۖۗ۫ۘۧ۬ۥۥۘۦ۟ۤۜۚۚۡۢۘۡۘۘ";
                    break;
                case -939360351:
                    str2 = "ۙۗۥۧۧۦۘۦ۟ۙۦۤۜۗۢۖۢۚ۫ۙ۫ۢ۫ۘۜۡۨۘۡۤۧۤۨۡۜ۟ۗۡۖۦۘۙ۫ۥۛۢۜۗۤۚۘۢۢۛ۟";
                    break;
                case -923508905:
                    iMResultInfo.IMToken = str;
                    str2 = "ۘۖۧۘۢ۟ۚ۫ۧۖۙۖۢۖۗۦۘ۫۬ۦۙۨ۠ۤۦۖۘ۫۬ۨۛۤۢۨ۬ۙۤۜۧۘۡۡۨۧۛۡ";
                    break;
                case -241635927:
                    C3765ch.OooOOoo(this, iMResultInfo, getString(R.string.elfin_appid), scriptOooO0oO.getId(), C3834ec.OooO0OO().OooO0O0.DeviceId, C3951hi.OooO0oo());
                    str2 = "۟ۜۛۚۡۖ۬ۧۘۘۖۜۢۥۖۥۦ۫ۥۘۢ۬ۨۥۚۙۙۖۗۨ۠۟ۗ۠ۡ۠ۖۗ۟ۥۖۘۖۦۖۘ";
                    break;
                case -58342064:
                    iMResultInfo = new IMResultInfo();
                    str2 = "ۧۖۧۘۖۙۤۛۤۦۘ۟ۢۙ۟ۘۗۧۘۡۡ۬ۖۦۙۤۡۚۢ۫۬ۖۙۥۧۚۚۨ";
                    break;
                case 489815598:
                    return;
                case 1890226835:
                    str2 = "ۙۨ۫ۥۙۡۘۢۢۤ۫ۨۖۘۧۗۖۘۜۥ۟ۢ۫۟ۢۘۧ۬۫۠ۧۤۜۘۤۙۥۜۦ۬ۤ۬ۜۡۦۖۘۧ۫ۦ۬ۨ";
                    scriptOooO0oO = C3718b7.OooO0Oo().OooO0oO();
                    break;
            }
        }
    }

    private void OooOOO0() {
        String str = "۫ۖۧۤۙۦۘۛۤۘۘۧۚۥۘ۬۠ۥۚۨۖۘۛۛۢ۬ۧۜۗۡۚۗۘۡ۠۠ۥۘ۟ۘۦۘۨۨ۟ۙۚۢۘۨ۬ۡۙۧ";
        StringBuilder sb = null;
        UpdateRequestInfo updateRequestInfo = null;
        String strOooOO0O = null;
        String strOooO0Oo = null;
        while (true) {
            switch ((((str.hashCode() ^ C1801a.f11005aP) ^ C1801a.f11011aV) ^ 12) ^ (-479858359)) {
                case -1950338184:
                case 1029118964:
                case 1403898837:
                    return;
                case -1328804840:
                    sb.append(updateRequestInfo.DeviceName);
                    str = "ۦۢۚۤۙۥۘ۠ۖۚ۬ۤۢۤۛۜۘۤۘۖۘ۫ۘ۬ۧۧۥۘۧۖۨۘۜۗۨۗۨۙۗۧۦ۠۫ۦۖۢۘۨ۬۟ۖۗ۫۬۬ۡۦۖۘ";
                    break;
                case -1075664239:
                    updateRequestInfo.ScriptId = C3718b7.OooO0Oo().OooO0oO().getId();
                    str = "۠ۜۜۖۚ۠ۗ۫ۦۘۢۙۨۢ۟۫ۗۡۢ۟ۜ۫ۤۧۛۜۧۖۘۙۧۘۘۧۚ۟ۗۘۡۘۥۖۦۘۢۜۧۨۨۧۘۧۛ";
                    break;
                case -975438437:
                    sb = new StringBuilder();
                    str = "ۛ۫ۨۧۜۖۢ۟ۘۢۡۖۘۤۤۗۦ۠ۛ۠ۗۡ۬ۙۚ۫ۢۥۘۢۦۛۦۚۦۘۘ۫ۢ";
                    break;
                case -474102428:
                    sb.append(",DeviceName=");
                    str = "ۥ۟ۦۘۙۜۧۘۚۧۨ۠ۢۢۢۚۖۜ۫۬۫ۤۨۙۚۖۘ۟ۗۗۥۥۛۤۗۡۘۙۥۜ";
                    break;
                case -446475499:
                    updateRequestInfo.ScriptVersion = Integer.parseInt(strOooO0Oo);
                    str = "ۧ۟۟ۦۨۤۖۚۜ۠ۡۧۥۛۙ۬ۛۘۘ۟ۖۤۧۙۙ۬ۖۘۘۛ۟ۖۢۦۨۘۖۘۨۘۙ۫ۤۨ۠ۨۢ۠۫ۦۙ۠ۦ۫ۘۘ۠ۡۨۘ";
                    break;
                case -241064295:
                    sb.append(updateRequestInfo.ScriptVersion);
                    str = "۠ۨۜۘ۬ۡۨۘۥۦۛۨۛۜۥۢۛۚۚۛۛۘۘۜ۫ۤۘۢۙۥۨۧۢۦۨۘۖۤۨۡۨ۠ۜ۠۫";
                    break;
                case -199646572:
                    sb.toString();
                    str = "ۢ۫۫ۙۚۖۥۦۨ۠ۛۖۤ۟ۨۘۛ۬۬ۤ۠ۘۘ۟ۙۡۘۚۙۡ۫ۧۖۖ۠ۥۘۤ۬۟ۚۥۖۘۖۚۤ";
                    break;
                case 59713078:
                    str = "ۜۛۖۚۘ۫ۨۡۘۥۧۦۘۖۦۖۢۙۨۛۧۥۨۚۨۨ۫ۤ۫ۗۛۛۨۨۨۡۧۘۙۡۢۡۤ۬ۛۗۢۜۙۗۢۙۡۘۘۨۨ";
                    updateRequestInfo = new UpdateRequestInfo();
                    break;
                case 119569059:
                    C3982ic.OooOo00().OooOo0O(new OooO0OO(this)).OooOo(true, this, updateRequestInfo);
                    str = "۟ۜ۫ۚۘۡۘۤ۟ۡۘۨۢۜۜۢۖۘۤ۟ۧۧۗۜۘۡۜۨ۠ۚۡۘۡۖ۠ۤۦۘۤۜۡۜۨۘۘۤۚۘۤۛۨۗۜۢۨۜۦۘۙۚۢ";
                    break;
                case 268738534:
                    str = "ۧۙ۟ۦۡۛۜۢۥۧۧۡۘۙۥۥۡۚۥۘۛۨۦۗۥۖۘۛۜ۟ۥۦۘ۫۠۠ۛ۫ۦۘۧ۬ۦۡ۟";
                    strOooOO0O = C3678a4.OooOO0O(this);
                    break;
                case 555788725:
                    String str2 = "ۡۥۡۙۨۘۛۨۦۘۦ۬ۖۘۖ۟ۜۘ۬۟ۖۘ۟ۖۦۘۧۦۨۖۦۡۙۘۢۨۗۖۢ۟۠ۢۤۥۘۛۗۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-809427027)) {
                            case -1525335381:
                                String str3 = "ۢۘۖۘ۠۫ۡۘۥ۟ۚ۫ۖۧ۟ۚۥۘۨۘۖ۠ۡۘۘ۠ۡۘۘۘۘۨۥۘۘۗۘۦۗۖۘۖۥۤ۬۠ۨۡۡ۟ۜۚۚ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1865697401) {
                                        case -1710571032:
                                            str3 = C3974i4.OooO00o().OooO0O0() ? "ۚۦۧۘۚۡۨۡۡۜۘۢۦۙۦۖ۠۠ۗ۟ۚۤۢۖ۟ۡۨۢۦۜ۬۫ۢۛ۟ۗۥۨۘ" : "ۦۦۗۖۗۚۢۢۛۤۖۘۧ۠ۙ۬ۗۘۖۜۘۗ۬۠ۨۧۡۧۨۘۘۨۚۘ۬۫۟ۥۚۦۛۚ۫ۛۡۖۡۙۙ";
                                            break;
                                        case -1205045647:
                                            str3 = "۬۫ۢ۠۟۟ۢۡۚۡۘۖ۬ۗۨۜۥۥۘۢ۫ۖۨ۫ۢۨۡۙۖۙ۟ۛۖۜۘۧۗۜۦ۫ۦ۬۫۫ۨۥ۠ۘۚۤ";
                                            break;
                                        case -788703456:
                                            str2 = "ۙۧۙۙۥۜۘۤۡۥ۬ۛۜ۫ۗۚۗۖۢۗۧۦۘۙ۟ۧۨۢۦۧۤۜۖۖۥۖۖ۬ۤۖۦ۟ۡۚ";
                                            break;
                                        case 1315722063:
                                            str2 = "ۘۛۜۤۚۢۤۦۡۘۜۨۘۗۘۡۤۘۧۘۜ۠ۦۙۦۖۘۘۘۧ۠ۙۗ";
                                            break;
                                    }
                                }
                                break;
                            case -375630202:
                                str = "ۙۖ۠۫ۜۡۘۜۥۜۘۦۡۨۡ۫ۜۤۛۧۖ۟ۨۘۢۘۧۘۛۦۥۘ۟۟۠ۤۨۖۘۙ۠ۖۘۗۦۥۘۢ۟ۦ";
                                continue;
                            case 403000846:
                                str = "ۢ۠ۧۨۘۘۘۚۗۛۤۦۘۗۡۜۙ۬ۘۤ۟ۥۘۜ۠ۛۖ۟ۗ۫ۖۜۘ۟۫ۡۛۦ۟ۨۤۥۘۡۤ۟";
                                continue;
                            case 727438941:
                                str2 = "ۤۗ۠ۡ۟ۥۘۨ۟ۨۘۘۘۜۘۘۗۡۘۜۜۛۧۢۛۙۜۦۘۛ۠۫۠ۜۖۘۚۙۡ۫ۡۨۦۘ۬ۨۧ۟ۘ۫ۧ";
                                break;
                        }
                    }
                    break;
                case 989983661:
                    updateRequestInfo.DeviceName = strOooOO0O;
                    str = "ۨۧۥۙۘۦ۫ۜ۟ۙ۫ۜۖۗۦۘ۠۬ۖۘۥۛۖۚۦۨۘۢۧۡۧۖۡۡۚۨۘۦۙۥۛۗۢۛۙ۫ۛۤۢۤۙۦۘ۠ۙۢ۠ۚۦۘ";
                    break;
                case 990072920:
                    sb.append("updateVersionRequest --> 1 ScriptId=");
                    str = "ۗۚۢۧۘ۠ۤ۬ۧۢۖۡۘ۬ۦۘۘ۠ۢۘۘۛۤۡۘ۟ۢۨۘۥۘۛۜۙ۠ۖۛۤۗۡ۬۠ۛۤۥۙ۠ۘۙ۬ۗ";
                    break;
                case 1269201795:
                    C3753c5.OooO0O0(getApplicationContext(), R.string.network_off);
                    str = "۟ۗۖۘۗۖ۫۠ۢۙۢ۟ۥۦۘۡۘۗۦۤۨۘۙۛۚۘۤۨۚۜ۫ۥۚۘۢۦ۫";
                    break;
                case 1387924981:
                    str = "ۧ۟ۥۘۤ۫ۤۘۡۛۙۦۢۦۚ۬۫ۤۢۢۦ۠۬۠ۘۘۗۛۧۗ۬ۢۙۙۖۥۨۥۘۥۛۘۡۜۖۖۘ۟ۚۘۛ";
                    break;
                case 1609772410:
                    String str4 = "۬ۜۢۢۢ۟۬۬ۛۜۢۨۘۘۘۨۘۨ۠ۡۨ۠ۘ۟ۧۡۦۧۡۢ۬۠ۚۚۘۢۛۢۚۨۧ۠۬ۖۢ۟۬۬ۨۛ۟۠ۜۦۧۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 1846548596) {
                            case -1337556816:
                                str = "ۖۦۧۧۥۘۚۥۖ۠ۥۘۘۛۛۡۢ۬ۦۘۧۖۛۤ۫ۚۗ۬ۘۘ۬ۡۘۤۚۥ۫ۥۘۜۧ۫ۦۤ۟";
                                continue;
                            case -1052736090:
                                String str5 = "ۜ۠ۜۧۗۧۤۡۦۘۚۦۨۘ۫۟ۨۘۥ۠ۙۛۙۙۜ۟ۖۡۗۖۥ۠ۡۡۜۦۘۥ۟ۖ۠ۨۡۗۗۨۘۤۜۘۨۥۘۙۧۦۘۘ۟۫";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1503857610)) {
                                        case -2021723695:
                                            str4 = "ۘۤۚۘۜۢۨۜۘۥۚۜ۟ۖۘۢۧۢ۟ۧۨۘۤۖ۠ۧۜۜۘۧ۫ۨۙۗۘۙ۟ۜ۬ۢۖۚۘۘۘۨۜۤۛۜ۟ۢۦۛۡۧۦ";
                                            break;
                                        case -98803568:
                                            str5 = "ۛۧۖۘ۫ۙ۬ۙۨ۟ۡۗۨۘ۫ۥۜۘ۟ۙۥۗ۠ۖۘۙۦۤۥۙۨۜۘۜۖ۬ۧۚۨۡۡۥۙ۬ۢۧ";
                                            break;
                                        case 177955831:
                                            str4 = "ۨۘ۬ۘۜۘۙۘۘۘۘۢۖۘۥۥۜۘۛ۟ۛۜ۬ۧۤۗۖۘ۟ۥۧۥۨۘۘ۬ۛۡۖ۠۠ۗۧۚۚ۫ۨۢۧۖ۬ۥ";
                                            break;
                                        case 1353071671:
                                            str5 = !C4381t4.OooOO0(this) ? "ۦ۬ۙۖ۫ۥۘۛۦ۟۟ۘۛۦۖ۠۠۬ۘۘۚۘۦۘ۟۫ۛۚۜ۟ۨۧۖۨۗۙۗۢ۟ۙۨۡ۫ۢ۟" : "ۜۤۙۛۗۧۙۤ۬۫ۢ۠ۜۢۜۘۜۜۛۛۗ۠ۚۤۢ۟ۜۛ۟۫ۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case -112980707:
                                str = "ۢۤۘۘۘۖۙۥۢۙۦ۟۟ۚۛۤ۫ۚۖۢۗۤۛۤۤۤۨۖۘۧۛ۠۬ۡۘۘۙۨۦۘۥۖ۫۟ۘۥۘۨۛۚۜۤۙ";
                                continue;
                            case 471092601:
                                str4 = "ۤۡۘۘۥۗۚۡۦۧۤ۫ۙۦۗ۬ۖۢۥۘۥۡۦۘ۫۫ۘۗۥۡۘۙۖۢۦ۫ۡۖۛۡۘۨۡۘۡۢۡ";
                                break;
                        }
                    }
                    break;
                case 1712312146:
                    sb.append(updateRequestInfo.ScriptId);
                    str = "ۦ۠ۛۜ۟ۦ۠۬ۜۘۦۦۖۘۥۙۜۘۖ۟ۢۡ۬ۢۧۦۦۚۗۨ۟ۙ۫ۥۨۘۘۜۚۨۛۙۙۢ۫ۨۘ";
                    break;
                case 1982888162:
                    sb.append(",ScriptVersion=");
                    str = "ۧ۬ۡۘۢۧۡۜۢۗۘۢۜ۟ۢۙ۠۟ۛۤۚۥۨۨۘۨۙۢۢ۠ۥۥۜۗۥۡۧۘۛ۠ۨۘۗۢ۫ۡ۬۟ۧۦ۬";
                    break;
                case 2030209827:
                    str = "ۧۚۛۤۚۚۨ۟ۛۖ۟۟۠۠ۢ۬۫ۘۦ۠ۧۜۨۙۢۗۤ۠ۦۤۥۖۨۧۤۥۘۛ۠ۙ۟۠ۘۘ";
                    strOooO0Oo = C4533x8.OooO0Oo(this, InterfaceC3865f6.OooO0oo);
                    break;
            }
        }
    }

    private void initListener() {
        String str = "ۨ۬ۥۘۘۜۜ۬ۨۘۘۚۨۢۥ۫۫۠ۚ۬ۚ۫ۥۘۙ۫ۛۤۘ۫ۨۜۘۘۜۚۗۖۢ۫ۛۘۜۚۗۥۗۥۘۘۙ۠";
        int iIndexOf = 0;
        StringBuilder sb = null;
        List listAsList = null;
        int iOooO0OO = 0;
        ArrayAdapter arrayAdapter = null;
        while (true) {
            switch ((((str.hashCode() ^ 524) ^ 677) ^ 333) ^ 1937633936) {
                case -2119203992:
                    this.ooOO.setOnItemSelectedListener(new OooO00o(this));
                    str = "ۛ۠ۘۧۢۧۦۚۤۦۢۘۖۦ۬ۙۖۘۘۙۗۖۘۦ۟ۖۡ۠ۗ۠ۛۜۘ";
                    break;
                case -2112427350:
                    this.o0Oo0oo.setOnClickListener(this);
                    str = "ۙۚ۫ۦۢۡۘۥۚۢۗۘۦ۬۬ۥۘۛ۬ۜۘۙ۠ۖۗۨۤۢ۠۬ۧ۫ۡۘۘ۟ۤۦ۬۠";
                    break;
                case -1954497769:
                    this.ooOO.setAdapter((SpinnerAdapter) arrayAdapter);
                    str = "ۤۨۥۘ۬ۘۡۥۖ۫ۗۘ۬ۛ۫ۨۘۗۚۡۘ۬ۦۘۨۘۙۛۢۚۚۨۤۥۤۗۥ۠";
                    break;
                case -1746005577:
                    this.o0OoOo0.setOnCheckedChangeListener(this);
                    str = "ۦۗۤۛۘۧۘۧۖۤۨۜ۫۟ۗۤۤۛۘ۫ۨۡ۬ۖ۬ۙۘۡۥۥۘۘۨۖۖ۬ۗۗۥۢۗۤ۟ۜ";
                    break;
                case -1604047787:
                    str = "ۜۚۥۙۛۧۙۦۧ۠ۤۨۘۧۥ۟ۤ۫ۢ۫ۡۘ۫ۢۘ۟ۡۜۘۙۜۚۚۘۡۙۖۦۖۚۥۘۧۚۗۧۙۛۙۚۖ";
                    arrayAdapter = new ArrayAdapter(this, R.layout.my_spinner, this.oo0o0Oo);
                    break;
                case -1526583255:
                    this.o00oO0O.setOnClickListener(this);
                    str = "ۡۗۡۖۡۨۘۧۘۦۘۧۘ۬ۘۦۘۧ۫ۦۘۚ۠۬ۧۙۖۘۢ۠ۘۙۚۙۡۧۨۘۙۛ۫ۖۥۘۖۢۥۙۘ۬ۤۤۘۘ۫ۧۛۖۘۥ";
                    break;
                case -1162711212:
                    return;
                case -1102147347:
                    this.o00Oo0.setOnCheckedChangeListener(this);
                    str = "ۗۚۤۧۢۙۘ۠۠ۢ۬ۨۘۗۜۜ۫ۥۨۛۧۙۧۖۤۢ۫ۚۤۛۖۘۗۨۥۗۛۦۘۙۜۦۘ۫۬ۤۜۛ۬ۡۨۥۘ";
                    break;
                case -918955170:
                    iIndexOf = listAsList.indexOf(sb.toString());
                    str = "ۧۚۜۢۙۦۘ۠ۜۦۢۦۙۢۛۘۚۨ۟۬ۢ۠ۜۦ۬ۥۜۘۜۖۦ";
                    break;
                case -803708637:
                    this.o00oO0o.setOnClickListener(this);
                    str = "ۖۘۚۦۜۘۘۛۧۡۘۜۤۨۘۧۨۛۚۚۧۥ۬ۚۛ۫۟۫ۛۖۘ۟ۚۥۘ۬ۗۧۤۚۦۘۜ۫ۜۡۡۖۘ";
                    break;
                case -642370766:
                    str = "ۢۢۙۘۚۢۨۦۜۡ۟ۡۧۘۦ۠ۗۘ۟ۦۘ۫ۗ۟ۥ۫ۥۡۘۧۘۡۢۖۡۖۦۘ";
                    listAsList = Arrays.asList(this.oo0o0Oo);
                    break;
                case -625382810:
                    this.ooOO.setSelection(iIndexOf);
                    str = "۠ۚۙۘۗۖۛۗ۠ۧۤۤۛ۟ۖۥۖۘۖۖۜۤ۫ۦۖۗ۫ۧۙۚۛۚۗۘ۫ۜۘۧ۬ۜۘۥۜۜۘۡۖۜۡۥۡ۬ۨۥ۠ۗ";
                    break;
                case -585742487:
                    this.OoooooO.setOnCheckedChangeListener(this);
                    str = "ۜ۟ۖۘۚۧ۫ۤۘۘۖۗۙۜۗۡۘۙۛۦۘۡۥۧۡۢۗۢۛۖ۬ۥۙۘۘۥۢۜۘ";
                    break;
                case -502400585:
                    this.OooooOo.setOnCheckedChangeListener(this);
                    str = "ۘۧ۠ۛۦۖۧۗۨ۬ۡۘۖۛۘۧۤ۬ۛ۟۟ۜۗۘۛ۬ۛۤۥۨۤۛۘۘۜۧۡۤۚۥۘۘۤۛۜۥۧۘ۟ۥۥۦ۫ۤۨ۠ۖۘ";
                    break;
                case -499808032:
                    sb.append(iOooO0OO);
                    str = "ۖۢ۬ۛۛۖۗ۠ۥۘۗۤۨۘۥۙۙ۠ۗ۠ۢۚۧۚۘۖ۟ۥ۫۫۠ۛۚۘ۬۫ۗۤۨۦۗۚ۠ۥۘ";
                    break;
                case -418572810:
                    this.o00O0O.setOnCheckedChangeListener(this);
                    str = "ۦۡ۠ۚۢۜۘ۟ۖۧۚۦۧۘۥۦ۟ۗۤۙ۬ۤۢ۠ۢۛۗۤ۟ۨۖۘ";
                    break;
                case -15533416:
                    this.Ooooooo.setOnCheckedChangeListener(this);
                    str = "ۤ۟ۧ۠ۖ۫ۚۖۖۦۙۡۘۢۜۙۡ۟ۥۘ۫ۡۤۗۨۚۚۘۛۢۜۛ۟ۤۚ۬ۘۢ۬۠ۧ۠ۧۘۤۧۗۖۘ";
                    break;
                case 35176178:
                    str = "۠ۡۡۗۥۗ۫ۚۢۘۧۦۜۛۜۘۜۥۜ۟۟۫ۚۥۗۧ۟ۘۙ۫ۨۢ۟۠ۚۛۨ";
                    iOooO0OO = C4529x4.OooO0O0().OooO0OO(InterfaceC3865f6.OooOo0o, 5);
                    break;
                case 169033663:
                    sb.append("秒");
                    str = "ۥۘ۟ۚۛۡۘۨ۠ۚۛۦ۫۬ۛ۬ۘۤۙۚ۠۠ۡۘۥۘۨۛۜۘ۠ۡۨۘۦۢ۠ۛۖ۠ۜ۬۬۬ۦۘۜۗۜۘۜۚۢۛۤ۟ۨ";
                    break;
                case 395692793:
                    this.o0OO00O.setOnClickListener(this);
                    str = "ۦۦۚۨۦۜۦۦۘۨ۬ۧۙ۬ۜۘۜۧ۠ۧ۟۫ۗۤۡۘ۠ۛۜۘۜۦۜۧۛ۟ۛ۬";
                    break;
                case 510281947:
                    str = "۫ۜۜۢۢۦۘۖۢۜۦۢ۫ۥۖ۫ۤ۬ۜ۟ۦۖۡۤۜۘۛۥۧۡۧۡۘۘۛۤۦۘۘۢۢۥۘۛۗۦۘۨۤۦۚ۟ۛ";
                    sb = new StringBuilder();
                    break;
                case 683329070:
                    this.o0ooOOo.setOnClickListener(this);
                    str = "ۡ۠ۦۘۘ۬۬ۙۜۤۡۙۖۘۤۢۖۖۖۥۛۧۘۛۥۡۘ۟ۡۘۜۨۘۙۦ۟ۖۦۨۦۚۦۘ۬ۨۖۙ۬ۢ۫ۜ۠ۚ۠ۥۘ۠ۙۘۘ";
                    break;
                case 792999894:
                    this.Oooooo.setOnCheckedChangeListener(this);
                    str = "ۤۙۗ۬ۚۜۦۨ۠ۛۗ۟ۢ۬ۙ۟ۗۗ۫ۗۧۚۙۚۦ۠ۖۡۘۥ۬۟۫ۙ۟ۨ";
                    break;
                case 931699685:
                    this.OooooOO.setOnCheckedChangeListener(this);
                    str = "ۢۥۡۘۤۡۢۤۥۥۘۨۗ۠ۗۛۖۘ۠ۚۥۥۥۗ۬ۚۜۘۛ۠۟ۤۘۤ۠ۖ۟۟۫ۜۥۙۨۘۘ۬";
                    break;
                case 1198356013:
                    this.OooooO0.setOnCheckedChangeListener(this);
                    str = "ۙۢۘۘۨۚۧۖۡۛۚۧۡ۫۬۬ۙۘۨۘ۠ۡ۠ۤۥۗۙۗۡۜۖۘۚ۬ۘۡ۫ۥ";
                    break;
                case 1359210330:
                    str = "ۥۢۢۖ۫۟ۢ۬ۚۥۤۘۧۚۜۥۤۤۨۦۧۙ۠ۘۘۚۨۗۡۥ۠";
                    break;
                case 1396924239:
                    this.Oooooo0.setOnCheckedChangeListener(this);
                    str = "ۧ۠ۘۘۖۤۤ۟ۖۢ۟ۗۦۤۨۚۚۘۘۢۦۡۘۥۙۚ۠ۥۢۖۜۢۖۛۤۨۖۧۘۘۡۥۛ۟ۥۘۗۦ۬";
                    break;
                case 1800204953:
                    this.o00Ooo.setOnCheckedChangeListener(this);
                    str = "۟ۧۡۘۢۡۗ۫ۙۥۜۘ۫ۢۨ۟۬ۖۘ۠ۦۧۘۚ۠ۤۤۧۙ۟ۜۙۡ۟ۥۡ۫ۨۘ۫۬ۥ۬ۙۡۗۖۨۘۨۥۗۖۘۙۡۗۘۘ";
                    break;
                case 2129956940:
                    this.o0ooOO0.setOnClickListener(this);
                    str = "ۧۚۥۘۛ۬ۧۖۧۤۡ۫ۘۜۡ۟ۥۨ۫ۛۖۘۖۧۛ۠ۨۥۧۢۘۘۢۘۢۙ۟ۥۚۥۥۘۦۧۘۗۦۦۘ۟ۖۦ";
                    break;
            }
        }
    }

    private void initView() {
        String strOooOO0O = null;
        String str = "۠ۤۡۘ۟ۤۙ۟ۚۚۧۤۘۢۛۘۘ۠ۘۨ۫ۚۨۥۗۦۚۡۡۘۤۥۙۦۥۘۙ۬ۧۥۤۖۧۤۜۘۘ۬ۡۘۨۘۦ۟ۙۡۘۤۛۨ";
        while (true) {
            switch ((((str.hashCode() ^ 537) ^ 149) ^ 133) ^ (-1193333350)) {
                case -1814824953:
                    this.o0OO00O = (LinearLayout) findViewById(R.id.ll_project_number);
                    str = "ۢۗۖۘۨۛۗۚ۠۬ۤۢۤۦ۬ۜۘۨ۬ۥۘ۫ۚۡۚۦۖۘۤ۬ۗۡۙۗۢۙۨۤۤۜۘۜ۫ۤۦ۬ۦۧۤ۠";
                    break;
                case -1697022522:
                    this.o0ooOoO = (TextView) findViewById(R.id.tv_project_number);
                    str = "ۗۗۧۜۧ۟ۚ۠ۚۗۛ۬۠ۚۥۘ۟ۡۥ۟ۥۚۧۘۚۛۛ۟ۘۘۘ۠ۨ۠ۧۖ۟ۙ۫ۘۘۥۗۨۖۚۥۧۗۥۘۤ۠ۨۘ۠ۖۛ";
                    break;
                case -1691807889:
                    OooO();
                    str = "۬۬ۛۥۜ۬ۤۜۦۜۤۢۤۨۚ۟ۙۖۘۨۚۜۙۦۧۧ۠ۥۘۜۘۗۢۘۧۤۖۛۛۚۜۚۥۚۗۧۗ۟۟ۙ۠ۘۘۨۖ۫";
                    break;
                case -1595937230:
                    this.o0OOO0o.setText(strOooOO0O);
                    str = "ۜۘۛۖۛ۠ۤۗۡۡۖ۠ۧ۠ۗۛۚۚ۟ۜ۟ۖۙۥ۫ۛۥۘۘۦۦۘۥۡ۬ۦ۟ۚۗۧۨۗۤۛۗۥۗۥ۬۠";
                    break;
                case -1535599195:
                    strOooOO0O = C3678a4.OooOO0O(this);
                    str = "ۡۢۡۨۡۥۨ۠ۢۘۖۘۢۙۗۧۢۘ۬ۚۜۙۙۗ۫ۜۜ۟ۤۥۘ";
                    break;
                case -1235855064:
                    j10.OooO0o().OooOo00(this);
                    str = "۠ۥ۬ۚ۠ۛ۟ۦ۠ۢ۫ۧۧۡۥۧۢۥۜۧۖۙ۟ۙۗۥۤۜۦ۟";
                    break;
                case -970595944:
                    this.ooOO = (Spinner) findViewById(R.id.sp_run_script_countdown);
                    str = "۫ۛ۫ۤۦۦۚۢ۬ۤۥۘۜ۫ۢۥۧۤۘۨ۠ۤۦۥۤ۫ۦ۬ۨۖ۫۬ۦۘۙۗۖۥۜۖۙۨۘۘۗۢۦ۬ۥۦۘۢۨۘۘۨۚۗ";
                    break;
                case -921471350:
                    OooOO0();
                    str = "ۛۡۜۘۥۗ۫ۙ۟ۖۚۚۗۘ۫ۚۦۜۜۘۜۦ۬۠۠ۙۥ۬ۘۘۧۚۨ";
                    break;
                case -727484957:
                    OooOO0O();
                    str = "ۨ۬۬ۘ۠ۥۗۢۥۘۙۡۥۘۤ۟ۘۘۜۧۨۗۚۧۨۨۘۘۢۨۧۘۛۚۢ";
                    break;
                case -591047185:
                    this.OooooO0 = (Switch) findViewById(R.id.swtich_setting_call_stop);
                    str = "ۘۛ۬ۘۗ۠ۚ۠ۛۡ۠ۦۘۙ۠ۥۘۖۨۖۘۤ۟ۦ۟ۜۛۜۨۧۘۤۙۨ۟ۨۘۢۦۧۗۡۤۙۢۖۘۚۡۗ۫ۧۦۘ";
                    break;
                case -214410937:
                    this.OooooOO = (Switch) findViewById(R.id.swtich_setting_volume_key_ctrl);
                    str = "ۜۧۤۘ۠ۤۤۚۦ۫ۘۘۚۢۖۘ۬ۧۖ۫ۢۦۘ۫ۚۨۘ۟ۙۨۘۨۨ۠۬۠ۨۘ۫ۙ۫ۧۢۚۚۨۦ";
                    break;
                case -128077537:
                    this.o0OoOo0 = (Switch) findViewById(R.id.switch_setting_automatically_run_script);
                    str = "ۚۦۧۘۖۙ۬ۗۜۗ۬ۧۜۘۢ۬ۦۘۢۖ۫ۚۥۖۘ۬ۦۦۘۤۦ۫ۘۢ۟ۜۨۘ۠۠ۗۙۡۤۨۡۡ۫ۗۦ۬ۗ";
                    break;
                case 178183678:
                    str = "۬ۚۙۗۡۥۘۨۜۤۛۦ۠ۢۘۡۘۗۡ۠ۙۗۥۥۢ۫ۥۤۚۧۘۨۘ";
                    break;
                case 251526206:
                    this.OoooooO = (Switch) findViewById(R.id.swtich_setting_vibration);
                    str = "ۙ۫ۖۥۖ۟ۛۥ۠۬ۗۨۘۙۡۡ۟ۢۚ۠ۗۥۤۖۛ۫۫ۘۦۨۜۤۧۘۘۤۙۛۡۦۜۘۘۘۘۘۘۗۡۛۧ";
                    break;
                case 282860413:
                    this.o0Oo0oo = (LinearLayout) findViewById(R.id.ll_device_name);
                    str = "ۢۡۧۤۢ۟ۘۜۦۜۤۚ۫ۦۘۘ۬ۙۚۖۗ۬ۖۜۛۗ۠ۚ۬ۤۧۚۛۡۗۗۢۜۧۘۚ۬۠";
                    break;
                case 545865530:
                    this.o00o0O.setVisibility(0);
                    str = "ۢۨۢۙ۫ۥۥۨۥۘۥۡۤۥۗۚۘۙۢۨۢۥۘۚۖ۠ۧۤۨۖۡۘۥۢۥۘۧۡ۠۬ۗۦۘۨۜۡۘۛۦۖۘۦۛۘۘ";
                    break;
                case 589487204:
                    this.OooooOo = (Switch) findViewById(R.id.swtich_setting_script_pause_and_resume);
                    str = "ۨۙۗۚۘۤۥ۬ۦ۟ۧۥ۫ۡۚۛۚ۠ۗۡۚ۫۫ۜۘۤۘۧۘ۬۠۟۫ۗ۫ۡۙۦۘۘۤۛ۬ۢۖ";
                    break;
                case 729591126:
                    this.o0ooOOo = (Button) findViewById(R.id.button_setting_feedback);
                    str = "۠ۥۦۘۜۨ۫۠۬ۡۘ۟ۧۧۜۛۨۘۗۖۖۘۜۚ۟ۛ۠ۜۜۖۨۘۤ۠۠ۨ۠ۚۘۧۡ";
                    break;
                case 818632301:
                    this.o0OOO0o = (TextView) findViewById(R.id.tv_device_name);
                    str = "ۥۤۨۘۤۤۘۥۙۨۘۜۥ۫ۤۥۙۘۧۥۘۨۜ۟ۖۥۧۦۚۛۗۧۦۗۦ۬ۤۙ۠ۢۜۦۘ۬۬۟ۧۚۚۢۘۖۘ۫۠ۛۢ۬۫";
                    break;
                case 1099840134:
                    this.o00oO0O = (Button) findViewById(R.id.setting_button_update);
                    str = "ۖۢ۫ۨۚۖۢۗۥۘۢۖۧۘۜۚ۬ۡ۬ۜۘۦۛۙۜۘۡۚۨۙۤۤۢۖۖۥۤۗۛ۟ۦۖۛۗۦۘ";
                    break;
                case 1116320616:
                    this.o00Oo0 = (Switch) findViewById(R.id.switch_setting_collect_logcat);
                    str = "ۡۙۖۘ۫ۨۜۤۗۘۡ۟۟ۛۖۘ۠ۤۚۦۦۘۤۙۢۨۚ۬ۢۥۦۨ۠ۢ۠۫ۘۘ";
                    break;
                case 1144055331:
                    this.o00O0O = (Switch) findViewById(R.id.setting_swtich_open_run);
                    str = "ۥۘ۫ۢۧۨۡۘۢۧۦ۠ۧ۠ۚ۬ۘۖۖۤۥۦ۠ۙۤۘۨۘ۫ۥ۟ۤ۬ۘۘۗۤۢ";
                    break;
                case 1178475437:
                    this.o00o0O = (LinearLayout) findViewById(R.id.layout_boot_script);
                    str = "ۡۡۛۜۢۡ۠ۡۦۘۦۡۜۗۥۚ۠ۛ۠ۢۤۤۥ۬ۦۘۥۢۦۤ۬ۥۙۨ۫۟ۙۙ۬۠۟ۚ۬ۘۘۡۦۖۘۨۡۜۘ";
                    break;
                case 1206386047:
                    this.Ooooooo = (Switch) findViewById(R.id.switch_setting_flash_back_auto_restart);
                    str = "ۗۖۤۜ۫ۧۡۤۥۙۨۘۦۙۢۤ۟ۖۢ۬ۛۙۡۥۚۦۘۤۢۤۜۤۡ۬ۛۥۜۥۛۡۡۘۛۧۗۚۚۥ۫ۖۢ۫ۙۨۘ";
                    break;
                case 1208761127:
                    this.o0Oo0oo.setVisibility(8);
                    str = "ۧۧۡۧۥۥۢۢۡۗۜ۟ۨۡۙۡۘ۠ۥۡۘۢۜۘۙۨۘۘۛۥۘۙۛۧۧۖۘۨۙۦ۫ۜۧ۫۠ۨۘۙ۫ۜۙۘۘۘۡ۠";
                    break;
                case 1315531999:
                    this.o00oO0o = (Button) findViewById(R.id.btn_setting_scriptlog);
                    str = "ۨۦۢۦۘۥۚ۫ۘۖ۟۠۫ۢۘۘ۟۠ۦۥ۠ۦۘۙۦۡۘۜۦۛۧۘۧۘ۬ۛۖۘۥۧۚ۬ۜۘۘۛۦۘۙۥۨۘۤۡۗ";
                    break;
                case 1430145548:
                    this.o0ooOO0 = (Button) findViewById(R.id.setting_button_exitapp);
                    str = "ۡ۟ۢۡۤۚ۟ۦۡۙۛۡۘۜ۬ۥۘۛۙۚۥۧۡۘۦۗۢۜۙ۬ۧۦۧۘۜۢ۟ۗۗۦۧۥۛۡۗ۫ۗۚۗ۟ۥۚ";
                    break;
                case 1440650672:
                    this.o0OO00O.setVisibility(8);
                    str = "ۖۚۢۨ۬ۥۘۗ۠ۥ۠ۛۨ۬ۦۘۘ۬ۗۖۦۗۦۘۚۜۜ۬ۨ۟ۢۡۤۢۢ۫ۘ۠ۘۖۖۥۘۗۡۜ۠۠ۨۘۤۜ";
                    break;
                case 1478408558:
                    this.o00Ooo = (Switch) findViewById(R.id.switch_setting_error_dialog);
                    str = "ۦۜۥۘۘ۠ۡۥۗۖۘۢۘۡۧۦۦۛۗۜۘۘۧۜۡۚۗۖۘۨ۬۬ۛۦۡۘۜ۫ۦۘۤۙۦۘۦۛۦ۬۟ۗ۬ۖۗۨ۫ۜۢۖۦۘ";
                    break;
                case 1704449238:
                    this.Oooooo0 = (Switch) findViewById(R.id.swtich_setting_waggle_stop);
                    str = "ۛۙۨۡۘۜۜ۠ۜ۟ۦۗۙۤۙۙ۠ۗۢ۬ۡۙ۬ۨۜۡ۟ۦۥۙۙ۬۫۬ۖۦۘ۟ۖۥۘۦۥۨۘۡۗ۫ۡۖۧۚۛۜۗ۫";
                    break;
                case 1717906571:
                    this.Oooooo = (Switch) findViewById(R.id.swtich_setting_floatview_ctrl);
                    str = "ۖ۫ۖۘۘۢۦۢۗۗۢۡۧۦۧۖۡۡۚۧۚۨۨ۟ۦۧ۬ۗۢۥۘ";
                    break;
                case 1827647967:
                    initListener();
                    str = "ۦۖۗۚ۟ۧۥۗۥۘۗ۫ۖۘۡۛ۟ۗۧ۟ۛۛۚۥۢۜۖۡۖۦۧۥۘ۬ۢ۬ۖۡۜۘ";
                    break;
                case 2007983530:
                    return;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        OooO00o oooO00o = null;
        String str = "ۡۤۡ۫ۗۜۛۥۥۘ۫ۘۦۙ۬ۜۘۗۗۢ۠ۙۘ۟۟۟ۤ۫ۦۨۚۦۨۦۛ۠ۜ۠۬ۖۖۦۨۘ۟ۡۘۡۤۜ۫۫۟ۢۤۘۘ";
        OooOO0 oooOO0 = null;
        DialogC3944hb dialogC3944hb = null;
        while (true) {
            switch ((((str.hashCode() ^ 936) ^ 844) ^ 918) ^ 1968815455) {
                case -2102432478:
                    str = "ۛۘ۠۫ۡۜ۬ۡۛۡۚ۫۟۬۫ۖۗ۠ۘ۬ۦۘۨۢۦۛۡۘ۟ۚۢ۟۠ۘۨ۬ۡ";
                    continue;
                case -1709621218:
                    String str2 = "ۢۜۢ۠ۚ۟ۤۛۖۘ۟ۗۤۨ۠ۥۘ۫ۚۙۤۖۢۤۡۚۨۘۧۘ۟ۦۜ۠۫ۧۧۜۛۗ۠۟۟ۗۦ";
                    while (true) {
                        switch (str2.hashCode() ^ 1440249835) {
                            case -805846453:
                                String str3 = "ۙۘۚۥۖۡۘۥۖۛۡۜۖۘۤۙۨۤۥۤۨ۟ۥۘۜۢۦۗۥۥۗ۬ۧۦۡۚۗۨۡۘۛۧۜۘ۠ۚۤ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1712590971) {
                                        case 70778255:
                                            str2 = "ۡۢۚۡۥۥ۟ۗۛۦۦۨۘۘۢۡۖ۬۫ۤۘۡ۟ۨۨۨۗۜۘۚۦۜ";
                                            break;
                                        case 978066820:
                                            str2 = "ۥ۟ۘ۫ۦۖۘۦۦ۠ۗۨۛۚۥۡۘۜۜۡۘۦۗ۟ۧۜۡۙۡۘۤ۬ۜۛۧۦۙ";
                                            break;
                                        case 1157275034:
                                            str3 = "۟ۛۘۜۧۛ۬ۡۜۙۡ۠ۤۧۥۘۜۗۘۥۜۢۚۥۡۘ۬۟۠ۤۙ۫";
                                            break;
                                        case 1560644675:
                                            str3 = i != 1 ? "ۡ۫۬ۜۦۨۘ۟ۧۛۜۛۚۢۤۤۚۢۦۘۛ۬ۗۧۚۨۜۤ۟۫ۘۙۛۗۖۘۗۦ۠ۧۙۢ۫ۘۧۡۖۗ۫۫ۘۘ" : "ۜۚۖ۟۬ۡۘ۬ۤۜۘۘۗ۬ۛۥۡۘۜ۠۠ۧۙۤۡۚۚۙ۟ۦۘۢۘۚ";
                                            break;
                                    }
                                }
                                break;
                            case -370406111:
                                str = "ۢ۟ۘۤۡۘۘ۬۠ۙ۟۠ۜۘۖۦۥۡۖۘۦۘۧۘۜۚۢۢۤۗۦ۟ۥۘ۫۬ۛۢۡۘۧۛ۟ۜۚۦۜۗۦ۬ۗۘۜۦ۠ۛۢۙ";
                                continue;
                                continue;
                            case 325115508:
                                str = "ۖۖ۫ۙۗۦۜۦۜۘۗ۠۬ۚۜۥۘ۠ۡۖۘ۟ۙ۫۬ۙۨۚۚۗۨ۠ۜۘۚۤۖۘ۟۠ۜۘ۟ۢۦۘۡۛۢ";
                                continue;
                            case 1131986593:
                                str2 = "۠ۤۢۖۥۗۖۘۚۢۛۛۢ۟ۦۦۥۨۡۡۖۥۤۚۘۨۡۘۢۜۨۘ";
                                break;
                        }
                    }
                    break;
                case -1680608599:
                    super.onActivityResult(i, i2, intent);
                    str = "ۗۙۚۨۧۘۥ۟ۜۗۗۧ۠۫۬۠ۦۨۘ۫ۧۘۘۥۛۤ۫ۢ۬ۦۨۡۘۖۚۛۦۨ۟";
                    continue;
                case -1458956055:
                    return;
                case -1370046162:
                    str = "ۦۖۢۨۥۘۨ۫ۗۢۨۢۡۡۛ۬ۙۢۗۧۚ۠۫ۚۥۤۨۤۧ۟ۨۖۢ۫ۘۛۜۧۢۛۗۘۘ";
                    dialogC3944hb = new DialogC3944hb(this);
                    continue;
                case -1306716578:
                    this.o00ooo = oooOO0;
                    str = "ۦۤ۠۟۫ۢۤۗۘۘۖۦۚۢۚۖۢ۫۬ۙۜۜ۬ۘۗۛۜ۫ۢۛۦۘۥۡۦۘۛ۬";
                    continue;
                case -845721332:
                    String str4 = "۬۟ۥۘ۫ۗ۫ۤ۫۟ۚ۫ۨۛۗ۬ۤ۟ۖۖۗ۬ۧۦۖۘۦۡۧۥۥ۬";
                    while (true) {
                        switch (str4.hashCode() ^ (-268992350)) {
                            case 138552141:
                                str4 = "ۤ۟ۜۥۗۙۡۤۥۘۢۗۖۘۗۦۧۚ۠ۡۘۧ۠ۡۘۤۢۜۗۧۡۘ۟ۙۨۘۙۖ۠۬ۧۧ";
                                break;
                            case 1122530625:
                                break;
                            case 1370244580:
                                str = "ۤۜۤ۠ۥۡ۟ۚ۫ۢۚۨۤۚۘۘۚۗۡۘۚۗۛۖ۬ۛ۠ۤۨۘۖ۠ۨۘ۫ۨۢ۫ۡۚۧۘ۫۫ۥۦۘۛۙۤۗ۠ۚ";
                                break;
                            case 2043880683:
                                String str5 = "۟ۤۗۗۤۡۙ۬ۘۨۛۘۘۚۙۜۘۖۥۨۢۢۦۘ۫۟ۘ۟ۦۖۨۡۥۘۥۦۢۖۖۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 519376377) {
                                        case -1242342878:
                                            str4 = "ۖۧ۟۫ۙۖۗۧ۠ۨ۫ۜۧۘ۠ۦۙ۠ۛۙۤۘ۬۟ۢۜ۫ۤۖۥۡۖۥۘۧۥۜۜۖۖۘ۟ۡۛ";
                                            break;
                                        case -719357947:
                                            str4 = "۫ۥۧۘۖۛۚۗۤۧۚۨۛ۬۟ۘۥ۟ۥۙۖۨۦۥ۫۫ۙۥ۠۬ۧۡ۠ۥۙۘۖۧۘۘۘ۠ۙ";
                                            break;
                                        case -88752015:
                                            str5 = i2 == -1 ? "ۖۚ۠ۚۙۖ۬ۨۧۤۚ۠۬۟ۥۘ۫۠۫ۥۜۦۘۚۡۖۘۦۥۤۚۖۘۡۙۥۗۛۜۘ" : "ۦۘۡۘۜۥۘ۟۬ۗۡ۟ۧۘۜ۟ۢ۬ۤۢ۫ۢۚۡۘۗۖۜ۬ۨۖۢۥۘۜ۬۠ۚۙۤۗ۬ۢ";
                                            break;
                                        case 2062408439:
                                            str5 = "ۧۢ۬۠ۚۖۤ۬ۚۢ۬ۜ۟۠ۙۚۧۘۡۖۘۘۗ۠ۡۘۙۚۛ۫۟ۘۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 124499216:
                    str = "ۨ۬ۜۙ۠ۥۜۜ۬ۡۢۚۦۧۙۖۡۘۘۚۙۡۙۘۨۘۚۢۖۤ۠۬ۦۧۜۤۛۦ۫ۥۨۚۧ";
                    continue;
                case 197802551:
                    oooOO0.start();
                    str = "ۧۗۥۦۙۦۥۦۦۘ۬ۘۜۘۖۘۗۤۢۥۘ۠ۜۧۙۧۦ۠ۜۡۤۧۜۤۖۦۛۧۖ";
                    continue;
                case 954775035:
                    this.oo000o = dialogC3944hb;
                    str = "ۧۘۥ۬ۥ۠ۤ۬ۚۦ۬ۦۘۥۥۛۢ۫ۥۘ۠ۢۡۘۤۜۖۘۤ۠ۦ۟ۗۜۘۥ۠ۦ۠ۡۖ";
                    continue;
                case 1100422348:
                    str = "ۨ۟ۨۘ۫ۨۡۘۤۘۡۘۢۘۦ۟ۨۦۘ۠ۥۘ۟ۢۨۘۨۤۨۧۖۦۘ۫ۤۖۘۢ۬ۨۜۘۦۨۡۖۨۗۜۛۘۘ۠ۜۤۖۥ۟ۛۨ۠";
                    oooOO0 = new OooOO0(this, C2187m.f13871ag, 1000L, oooO00o);
                    continue;
                case 1180241887:
                    break;
                case 1313842396:
                    str = "ۛۘۧۘۨۨۥۘۘۥۛ۬۟ۦۘۥ۫ۢۘ۟ۛۛۖ۫ۨۢۦۘۤۖ۫ۥۨۦۘ۫۠ۨۘۧۢۖۖ۫ۜۘۢۛۧۤۡۘۡۡۜۘ";
                    continue;
                case 1634386905:
                    str = "ۦ۠۟ۗ۟۬ۙۚۜۖۜۜۜۖۥۛۛۙۖۦۦۘ۬ۡ۟ۘ۠ۦۛ";
                    continue;
                case 1772569976:
                    dialogC3944hb.show();
                    str = "ۡۥۦۘ۟ۦ۠۫ۖۖۖ۬ۘۘ۫ۥۨۖ۟ۖ۠ۙ۠ۥۘۛۢ۬۬ۜۧۜۘ۠ۛۦۗۗ۫ۤ۫ۥۤۨۘ";
                    continue;
            }
            str = "ۧۗۥۦۙۦۥۦۦۘ۬ۘۜۘۖۘۗۤۢۥۘ۠ۜۧۙۧۦ۠ۜۡۤۧۜۤۖۦۛۧۖ";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0053. Please report as an issue. */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id = 0;
        C4529x4 c4529x4OooO0O0 = null;
        Boolean boolValueOf = null;
        String str = null;
        Switch r33 = null;
        C4529x4 c4529x4OooO0O02 = null;
        Boolean boolValueOf2 = null;
        String str2 = null;
        C4529x4 c4529x4OooO0O03 = null;
        Boolean boolValueOf3 = null;
        String str3 = null;
        C3977i7 c3977i7OooO = null;
        Switch r24 = null;
        Switch r32 = null;
        C4529x4 c4529x4OooO0O04 = null;
        Boolean boolValueOf4 = null;
        String str4 = null;
        C4529x4 c4529x4OooO0O05 = null;
        Boolean boolValueOf5 = null;
        String str5 = null;
        C4529x4 c4529x4OooO0O06 = null;
        Boolean boolValueOf6 = null;
        String str6 = null;
        C4529x4 c4529x4OooO0O07 = null;
        Boolean boolValueOf7 = null;
        String str7 = null;
        View viewInflate = null;
        AlertDialog.Builder builder = null;
        AlertDialog alertDialogCreate = null;
        EditText editText = null;
        C4529x4 c4529x4OooO0O08 = null;
        Boolean boolValueOf8 = null;
        String str8 = null;
        Boolean bool = null;
        C4529x4 c4529x4 = null;
        String str9 = null;
        String str10 = "۫ۜۢۥۜۥۘۛ۬ۜۘ۬ۙۛۥۧۥۘۚۢ۠ۘۨ۟ۖۜۥ۫ۖ۠ۛ۫ۙۨۥۖۘۜۗۥ";
        while (true) {
            switch ((((str10.hashCode() ^ 692) ^ 750) ^ 945) ^ (-69055239)) {
                case -2147358706:
                    break;
                case -2081654821:
                    String str11 = "ۚۛۥۥۚ۠ۖۢۜۘ۟۠ۦۘ۟ۜۧ۠ۦۜۘ۬ۢۚۨ۟ۨۘۗۧۜۚۧۛۙۧۨۘۦۦۨۘۗۘۦۘ۟۫۟ۡۛۥۨۥۙۤ۟ۚۜۢ";
                    while (true) {
                        switch (str11.hashCode() ^ (-1427668168)) {
                            case -1367336039:
                                str10 = "ۛ۬ۦۘۤۤ۠۫ۧۘۚۦۜۖۚۚۦۨۢۨۖۘۤ۬ۡۢۜۢۨۖ۬ۥۢۦۧۚۥۘۙۜۘۡۗ";
                                break;
                            case -1330149070:
                                str11 = "ۜۡۦ۠ۙۗۘۥۖۘۢۢۡۙ۬ۜ۬۬ۧۡۖۧۖۖۖۡۤۥۢۜۢ۫ۤۨۨ۬ۢ۠ۨۡۦ۬ۦۜۖۜۦۘ";
                                break;
                            case -1165950595:
                                String str12 = "ۛۗۡۘ۫ۥۡۘ۟ۖ۬ۗ۟ۙ۠ۛۜۙۛ۬ۘۨۘۤ۠ۨۗۙۦۘۖۗۡۥۦۢۛۜ۠ۖۙۢ۟ۚۖ";
                                while (true) {
                                    switch (str12.hashCode() ^ (-1088086227)) {
                                        case -1974341867:
                                            str12 = "ۢۜۚ۠ۧۦ۠ۤۧۨ۬ۖۘۦۤۥۘۡۜۖۘ۠ۛۚۦۚۖۛۢۡۧۖۙ۠ۡۘۙ۟ۘ۬ۢۦۜ۠ۚۥ۬۬ۧۙۜۘ";
                                            break;
                                        case -311167630:
                                            str11 = "۟۬۟ۨۡۢۢۧۙۗ۫ۡۖۡ۬ۧ۫ۗۨۨۘۘۨۜۘ۫ۨۘۘۧۛۗ";
                                            break;
                                        case 306474666:
                                            str11 = "ۢۖۡۗۡ۟ۚۥۘۘۨ۟ۛۗ۫ۦۗۡۧ۟ۜۘۤ۠ۘ۫ۜۦۧ۫ۛ۬ۘۖۥ۫ۛ";
                                            break;
                                        case 1966705396:
                                            str12 = !this.OooooOO.isChecked() ? "ۨۙۨۘۥۧۦۙۗۥۙۧۗۛۖۥۘۚۘۘۡۢۗۥۡۡۘۛ۫ۢۛ۟ۜۘۤۛۢ۬ۜۢۙ۠۬ۨۖۜۘ" : "ۖۧۗۛۘۖۘ۠ۖۧ۬ۗۥۜۗۤۛۢۧۢ۬ۦۢ۬ۦۛۙۜۡۜۧۘۜۛۢ۬ۥۖ";
                                            break;
                                    }
                                }
                                break;
                            case 263396572:
                                break;
                        }
                    }
                    str10 = "ۛۤۢۨ۫۠ۙ۬ۙۦۚۡۘۜۧ۠ۧۧۜۗۨ۬۫ۚۜۤۗ۠ۥۘۖۥۛ۠ۦۤ";
                    break;
                case -2062450250:
                case -1768290555:
                case -1602746859:
                case 102287419:
                case 219556378:
                case 972613746:
                case 1285562946:
                    str10 = "ۙۜۖۘ۬۬ۨۤۢۨۘۧ۠ۙ۠ۜۢۜۜۥ۟ۙۗۜ۫ۛ۟ۥۛۖۚ۟۬ۤۥۨۡۨۘ";
                    break;
                case -1979460925:
                    str5 = InterfaceC3865f6.OooOO0O;
                    str10 = "۠ۧۜۙۚ۟ۨ۫ۙ۫ۢ۬۟۫۫ۗۜۧۗ۟ۨۢۜۢۘۚ۠ۘۘۤۢ۫ۧۨ۠۫ۗۤۢۤ۠ۡۧۜۨۧۡۦۜۦۘۙ";
                    break;
                case -1956308533:
                    str10 = "ۥۤۨۙۦۤۛۤۜۘۨۦۘۘ۬ۨۧۘۙ۟ۡۘۖۥ۟ۥۖۢۜۚ۫۟ۤۦ";
                    bool = boolValueOf;
                    break;
                case -1950188272:
                    String str13 = "ۘۚۘۘ۠ۜۨۘ۬ۧۛۜۘۖۛۛ۫ۧۡۡۙ۬ۖ۟ۚۚ۬۫ۙۥۗۘۘۢۨۦۘۨۨۖۘۡ۫ۦۘۚۨ۠";
                    while (true) {
                        switch (str13.hashCode() ^ 1496001450) {
                            case -2060971932:
                                str10 = "۠ۡۛۜۨۨۙۨۢۤۥۛۡۜۨۘۜۘۧۢۢ۫۠۬۠ۙۨۦۡۤ۫ۧ۫ۘۧۙۜۖۨۘۖۙۦۧۘۤۚۡۦۘۜۢۙۙۗۘۘ";
                                break;
                            case -1898979526:
                                String str14 = "ۗۥۥۘۡۦ۫ۖۚۘۙۛۧۖۤۡ۫ۤۘ۬ۦۥۚۧۘۘۨۛۥۙۨۡۢۖۢ۬ۛۗۘۗ";
                                while (true) {
                                    switch (str14.hashCode() ^ 1800515574) {
                                        case -860166028:
                                            str13 = "ۤۢۘۘۤۗۡۘ۠ۗ۟ۚۥۡۡۙۛۙۨۧۜۜۘ۫ۚۖۘۧۤۨۘۜۡۥۘۦۗۛۧۥۜ۬ۦۤۦۥۨ۟۬ۖۦۥۘۘ";
                                            break;
                                        case -294111463:
                                            str14 = !z ? "ۙۥ۟۟ۖ۬ۧۜۧۘ۫۫۫ۤ۬ۛۖ۟ۙ۫ۧۙۨۢ۫ۖۢۨۘۙ۠ۥۘ۫ۤ۫ۛۛۨۦ۬۬" : "ۗۚۤۧۨۘۘ۫ۧۡۜۡۘۤۗ۬ۨۜۨۘ۟ۧۘۘ۬ۢۦۧۦۙۗ۟ۥۢۢ۠ۙۥ۬ۚۜۘ۠ۦ۠";
                                            break;
                                        case 936657290:
                                            str13 = "ۜ۟ۧۧۚۘۘ۟ۦۗ۬ۢۚۤ۫۠ۛۨۘۘۜۘۘ۟ۗۘۘ۟ۗۗۘۢۦۘ";
                                            break;
                                        case 949020400:
                                            str14 = "ۢۜۙۧۧۖۢۖۖۢۧۜۘ۟۫ۖۤۢۦۤۗۦۘ۠ۗۧ۫ۢۤ۟ۙۧ۬ۧ۟ۗۖۘ۟۠ۡۘۨۢۥۘۢۦۥۘۛۖۡۗۧۛۧۚۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1106536008:
                                str13 = "ۙ۬ۛۧۛۨۘۢۨۦۘۙۙۦۥ۟ۦۘۨۧۖۨۨ۫ۨۡۥۢۚۤ۠ۨۘ";
                                break;
                            case 1355449368:
                                break;
                        }
                    }
                    break;
                case -1942209710:
                    viewInflate.findViewById(R.id.dialog_save_command).setOnClickListener(new OooO0O0(this, editText, alertDialogCreate));
                    str10 = "ۥۧۚۤ۬ۨۘۢۛ۠ۦۙۨۦۦۜۘۦۡۘۙۦۜۘۡۚۥ۠ۢۚۨۜۥۘ۬ۘ۬ۘۦۙۢۚ۟۬ۢ۟";
                    break;
                case -1853111112:
                    str10 = "۠ۛۡۜۗۥۘۖ۠۟ۨۢۦۦۦۘۦۡۗۙۛۡۘۦ۫ۘۛۥۛ۠۬۟۠ۡۜۚۗۨۘ";
                    c4529x4 = c4529x4OooO0O08;
                    break;
                case -1846623204:
                    c4529x4OooO0O05 = C4529x4.OooO0O0();
                    str10 = "ۥۥۗۛۙ۬ۧ۬ۚۜۡۘۘۘۥۧۘ۫ۚ۫ۖۡۙۥۘۦۗۙۡۘۧۗۖۙۘۤۥۧۨۘ۟ۦۜۜۖۘۘۡۥۘۡ۬ۡۡ۟ۧۖۘۨۘ";
                    break;
                case -1819857997:
                    c4529x4OooO0O02 = C4529x4.OooO0O0();
                    str10 = "۟ۘۗ۬ۜ۟۫ۢۤۢۖۖۘ۟۫ۖۜۨ۬۟۟ۗۘۙۨۙۘ۟ۗ۬ۦۘ۫۠ۛۛ۟ۢۧۘۘۦ۟ۨۘ۬ۘۛۨۛۘۘۙۤۚۧ۬۬";
                    break;
                case -1796985466:
                    id = compoundButton.getId();
                    str10 = "۟۠ۜۜۥۡ۬ۛۜۗۛۧۖ۫ۤ۫ۦۡۛ۬ۖۘۢۛۡۘۘۘۧۘ۫ۘۨۘۦۙ۠ۛۛۡۗۧۗۧ۬ۡۘۖۢۙۜۨۨۨۜ۟ۖۜۘ";
                    break;
                case -1584511896:
                    alertDialogCreate = builder.create();
                    str10 = "ۢۖ۟ۥۗۦۘۡۚۨۘۥۚ۟ۡۡۜۘۨۨۜۘۛۘۨۤۖۗۤ۫ۦۥۤۥۘ";
                    break;
                case -1561688758:
                    str10 = "ۗۖۗۧۛ۫ۨۙۥۦۜۖ۬ۖ۟ۥۘۘۧۥۘۢ۠ۢۡ۬۟ۙۜۦۘۤۧ۠ۡ۬ۜ";
                    c4529x4 = c4529x4OooO0O04;
                    break;
                case -1499120738:
                    builder.setView(viewInflate);
                    str10 = "ۜ۫ۘۘۦۦۙۨ۫۟ۘ۫ۗۥۢ۠ۢۡۡۨۧۘۨۚ۠ۙۤۚۤ۬ۨۘۦ۠۫ۥۤۥۘۛۗۘۘۥ۬ۡۖۦۘۛۜۧ";
                    break;
                case -1485323296:
                    str10 = "۫ۦۡۘۦۥۡۧۛ۠ۖۨ۟ۨۖۘۥۗۛۦۤۖۨ۠ۘۥۧۡۜۡۨۛۤۛ۠ۧ۟ۤۖۥۗۖۗ";
                    bool = boolValueOf5;
                    break;
                case -1457435956:
                    boolValueOf8 = Boolean.valueOf(z);
                    str10 = "ۧ۟۬ۖ۟ۡۘ۠ۢۘۘۧ۫ۜۘ۫ۜ۠۠ۨ۠ۖ۟ۦۨۚۡۚۤۥۛ۫ۧۛۥ۠ۤ۟ۚۚۖۘۖۤۖۘۦۡۜۘۚۙۙ";
                    break;
                case -1440547516:
                    c4529x4OooO0O07 = C4529x4.OooO0O0();
                    str10 = "ۚۧۤۧۧۥۘۤۤۗۧۜۥۘۦۥۦۢۖ۬ۡۡۖۘۡۧۨۘۡۤۚ۟ۖۦۘ";
                    break;
                case -1351398289:
                case -1117931480:
                case -900005442:
                case -627844827:
                case -434346696:
                case 251626089:
                    str10 = "۟۬ۚۨۚۨۖۦۙۢ۫ۖۘۢ۠ۘۖۥۘۤۚۜ۠ۢۡۘۜۘۦۙۦۧۡۦۤۡۘ۠ۦۗۜۦۖۘ";
                    break;
                case -1343323322:
                    str10 = "ۥۦۡۜۙ۠ۢۜۤ۟ۧۨ۫ۘۙ۠۟ۥۘۛۧۘۘۡۜۖۘۖۖۤۘۢۜۤۤ۠۠ۢۖۘۥۨۨۡۖۨۘۘۘۛ۠ۤۡۘۨۧۘۚۤۨ";
                    c4529x4 = c4529x4OooO0O0;
                    break;
                case -1318810376:
                    String str15 = "ۥۢۦۘ۟ۘ۫ۦۚۘ۟ۘۢۤۘ۠ۛۢۦ۟ۚۢ۠ۖۛۧۡ۠ۖۢ";
                    while (true) {
                        switch (str15.hashCode() ^ (-812826884)) {
                            case -2065471928:
                                str10 = "ۡ۬ۡۘۧۧۗۙۤۛۥۖۜۦۧ۟ۡۜۚۤۛۗ۬ۚۥۘۥۙۚۡۘ";
                                continue;
                            case -1603107281:
                                str15 = "۫ۜۖۘۛۦۢۙ۟ۗۧ۬ۥۘ۬ۧۥ۟ۙۖۡۘ۠۠ۜۨۡۡۘ۬ۥۘۘۖۚ۫۠ۖۘۘۨۡۘۤ۬ۜ";
                                break;
                            case -379225:
                                str10 = "ۙۚۧۧۚ۠ۛۘۢۨ۠ۢۜۗۢۥۗۛۛۧۙ۫ۦۘۘۤ۟ۡۘۘۤۛۢۘۨۨ۟ۨۦۘۜۜ۬ۙۢۜۘ۬ۡ";
                                continue;
                            case 1718036197:
                                String str16 = "ۡۙۦۘۥۡ۫ۢ۫ۤۧ۠ۖۘۢۧۢۗ۠ۘۘۤۚۙ۠ۗۥ۠ۖ۬۬ۡۤ";
                                while (true) {
                                    switch (str16.hashCode() ^ (-1229568323)) {
                                        case -132703607:
                                            str15 = "ۢۦۢ۬ۦۥۘۨۢۗۚۢۦۜ۟ۘۘ۠۟ۘۘۗۥۘۦ۫ۖۘ۟ۢۨۘۛۖۖۘ";
                                            break;
                                        case 700809357:
                                            str15 = "ۘ۟ۛۛۙۡۘۥ۫ۧۤۡۘۛۦۛۗۙۗۦ۠ۥۘۚۢۥۘۛۙۢ۠ۚ۬ۛ۟ۦۡۦۦۖۚۘۖۚۦۥۗۡۚ۟ۖۘۢۤۘۘۙۜۤ";
                                            break;
                                        case 1421907972:
                                            str16 = id != R.id.setting_swtich_open_run ? "ۜۗ۟ۧۖۦ۫۟ۙۖ۠ۡۘۚۦۥۘ۠ۦۥۘۧۦۨۘۚۨۢۥۡۗۛۚۢ" : "ۦۗ۟ۖۚۡۨ۬ۙۧۜۨۘۚۜۧۘۗۦۦۥۦۜۘۡۘ۠۠ۨۗ۠ۖۖۘۗۘ۠۟ۦۧۦۚۛۚۤ۬";
                                            break;
                                        case 1965453119:
                                            str16 = "۬۫ۦۘۛۘۖۛۗۖ۬ۢۘۘۙۖۚ۫۠ۤ۫ۡ۫ۡۦۜۘۖ۬ۦۤۡۙۡۦ۟ۛۖۗۡۧۘۗۢ۬ۧ۟ۙۧ۬ۡ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1267669353:
                    String str17 = "ۜ۬ۡ۠ۥ۫۟ۡۛۖۧۥۖ۟ۡۚۗۥ۠ۗۘۥۥۧۘۥۙۚ۬ۖۦۥۘ۬ۨۨۘۧۚۥۘۨۦۡۘۢۦ۬ۘۜ";
                    while (true) {
                        switch (str17.hashCode() ^ (-1091159900)) {
                            case -1459211231:
                                str17 = "ۙۢ۬ۧ۠ۡۚ۟ۖۡۥۚۥ۟ۤۨۡۛ۟ۥۚ۬۫ۨۦۛۘۚ";
                                break;
                            case -157081170:
                                break;
                            case 185548266:
                                str10 = "ۗۗۚ۫ۥ۟ۚۚۛۙۧ۟ۦ۫ۜۘ۟ۘۡۘ۬ۥۘۘۜۢۥۘۢۡۛۥ۠ۗۢ۟ۖۘۦ۟ۢ۫ۛ۬ۖۡۘۘۗ۟ۨۘ۠ۤۖ";
                                break;
                            case 907662126:
                                String str18 = "ۨ۬ۢۥ۫ۡۘ۬ۧ۟ۧۚۖۦۙ۫ۧۘۚ۫ۥۙۖۥۡۘ۬ۤۦۘۤۢۨۖۦۖ۫ۦ۠۬ۜۜۘۖۗۗۗۖ۟ۥۢۜۘ۠ۗۢۧۚۡ";
                                while (true) {
                                    switch (str18.hashCode() ^ (-62930918)) {
                                        case -2017013683:
                                            str18 = !this.Oooooo.isChecked() ? "ۛۘۜۘۖۢۘۘۦۨۡۦۡۘ۟ۤۦۘۦۚۢۜۢۡۘۢ۠ۘۘ۟ۜۧۧۗۡۧۜۦۜۗۨ۬ۘۙ۬ۡۢۗۚۡۘۛۙۥ" : "ۦۜۦۦ۬ۜۦۡۤۛۛ۫ۡۘ۟ۘ۫ۖ۬ۙ۟ۙۜۛ۬ۧ۬ۥۤۦۢۖۜۘۙ۬ۖ";
                                            break;
                                        case -1393146623:
                                            str18 = "ۗ۬ۡۨۖ۟ۛۘۥۡۘۤۥ۠ۤۗۚۥۡۘۘۚۖۧ۫ۛۚۤ۟ۥۚۦ۫۠۫ۘ";
                                            break;
                                        case -811672895:
                                            str17 = "ۚۖۤۚۛۘۘۛۚۥۡۥۧۘۦۘۖۧ۫ۦۘۦۗۘۜۜۧۘۛۚۡ۠۫۬ۤۙۜۘۚ۟";
                                            break;
                                        case -561455186:
                                            str17 = "ۢۦۜۘۡۢۡ۟ۢۗۘۜۗۤ۬ۙ۬ۘۖۤۧۡۛ۟ۘۘۡۗۥۘۡۢۢ۫ۥۤۜ۫۫ۨۛۜۘۧۦۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    str10 = "۬ۢۦۧۜۖۘۜ۠ۚۜۡ۠ۤۢۨۢ۠ۖۚۥۢۛۛۡۘۦ۠ۢۦۤۗۜۙۥۗۢۥۘ";
                    break;
                case -1229003962:
                    str10 = "ۨ۬ۦۘۖۜۛۛۘۛۚۖ۟ۗۨۜۘۤۜ۠ۨۙۧۙۤۨۘۖۘۡ۬ۨۘۜۢۜۗۦ۟ۘ۬ۖۘۥ۫۠ۢ۟ۥۘۧۨۨ";
                    bool = boolValueOf6;
                    break;
                case -1216723519:
                    String str19 = "ۗۘۧۨ۠ۦۦ۠ۡۜۛۘۙ۬۬ۥۥۥ۠ۥۖۘۧۨۛۤۜۧۘۚۘۘ۟ۡۚۗ۬ۦ";
                    while (true) {
                        switch (str19.hashCode() ^ (-1822053014)) {
                            case -1245444319:
                                str10 = "۟ۥۙ۫۫ۜۘۧۚۤۛۤۤۤۧ۫ۘۚۦ۬ۤ۫۫ۦۥ۟ۧۨۘ۫ۧ۫ۘۤۗۙۡ۟ۘۢۡۗۖۥ۫ۘۘۜ۠ۜۘ";
                                break;
                            case -1231082299:
                                str19 = "ۛۚۦۘۗۥۛۤ۬ۢ۠ۖ۠ۨۜۨ۬ۤۙۛۢ۬ۗۙۤۗۜۧۜۤۚ۟۫ۢۛ";
                                break;
                            case -1091052386:
                                break;
                            case -106879401:
                                String str20 = "ۚۥۖۘ۬ۥۨۘ۟ۧۘۘۡۡۘۚۦۡۘ۠ۤۚۨۢۨۘۧۥۤۙۛۥۙۙۖۘ";
                                while (true) {
                                    switch (str20.hashCode() ^ 1068155068) {
                                        case -813710722:
                                            str20 = !z ? "ۨۧۧۛ۟ۤۙۗۚۙۙ۫۟ۖ۠۟ۡۘۡۥ۟ۢ۫۬ۙۨۘۚۚۡۘۢۛۦۘ۠ۢ۬" : "۫۫ۡۘۖۦۖۤۤۡۘ۬۠ۨۜۨ۠۟ۙۜۘ۬۟ۜۢۥۡ۟۬ۘۘۙۤۘۘ۠۬ۘۘۖ۫ۙ";
                                            break;
                                        case 982122867:
                                            str19 = "ۢۦ۟ۗۧۗۜۡۤۡۦۚۧۦ۟ۥ۟ۤۢۦۛۨ۟ۦۚۨۘۘ۠ۢۡۘۙۡۥۘۥۜۡۘ";
                                            break;
                                        case 1083215205:
                                            str19 = "ۖ۫ۥۚ۬۠ۚ۫ۗۨۜۙ۠۫۠ۨۗۗۘۛۚۘۢ۫ۖۜۨۤۥۘ";
                                            break;
                                        case 1602898151:
                                            str20 = "ۡ۬ۛۦۨۦۘ۟ۚۡ۬ۛۦۘۗ۟ۚۜ۫ۚۦۖۜۘۢۦۖۘۘۛۨ۠ۡۙ۫ۦۘۢۚ۠ۧۘ۟ۛۜۜ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1150655391:
                    str10 = "۫۬ۙۨۢۦ۬ۜۚۚ۟ۗ۫ۘۧۘۧۨۤۗۤۧۢۡۡۘۤۛۦۘۤۢۙۜۨۦۘۙۦۦۘ۠ۖۥۘۤۧۧۜۨۦۘۢۡۦۘ";
                    c4529x4 = c4529x4OooO0O02;
                    break;
                case -1143364994:
                    C4496w8.OooOO0o(101);
                    str10 = "ۗۡۚ۫ۖۘۨۜ۬ۤۡۦۘۚ۠ۡۘۨۡۜۘۥ۠۬۠۠ۦۘۦ۫ۚۜۛۦۘۘۖۘۘ۫۬ۥۛۛۨۘۘۧۨۘۗۤۘۘۦۛۡۘۜۚۨۘۖۖۜۘ";
                    break;
                case -1074079294:
                    str10 = "ۜۤۘۘۨۢ۟ۨۧۦ۟ۛۨۘۜۨۢۚۦۚۢۤ۫ۘۥۘۘ۟ۘ۠۠۫";
                    break;
                case -1056694219:
                    String str21 = "ۘۡۖ۟ۥۥۘۤۢۧۙۡۚۤۜۦۘۚۛۦۘ۫۬ۙۖۚۘۘۧۚۦۥۨۗۖۖۡۚ۬ۖۘۢۡۘ۬ۦۛ";
                    while (true) {
                        switch (str21.hashCode() ^ (-1140544928)) {
                            case -1294987509:
                                str10 = "ۤۨۖۘۤۥۖۘۜۢۨ۟۬۬ۙۤۖۛۚۡۜۥۙۚۢۘۥۥۜۜ۟ۡۨۢ۟ۙۘۘ۠۫ۦۘۡ۠ۡ۫۬ۧ۟۫ۙۙۧۦۘۨ۬ۜ";
                                continue;
                            case 608532711:
                                str10 = "ۜۢۢۖۦۡۥۨۨۘ۫ۡ۬۠ۨۧۦ۠ۗ۠۟ۘۛۤۖۘۜۢۗۚ";
                                continue;
                            case 911960846:
                                str21 = "ۢۗۗ۟ۡۜۘۚۜۧ۫۠ۘۨ۫ۘۘ۠ۥۦۘۢۜۙۡۨۦۧۘۘۚۡۥۚۗۘۘۜۢۗۡ۟ۥۙۜۘۘۡۙۦۘۢ۬ۥۚ۫ۙ۠۫";
                                break;
                            case 2093282892:
                                String str22 = "ۡۙۚۛۖ۬ۘۗۚۦۚۡۘۗۘۖ۠ۖۖ۟ۥۜۘۦۗۥۤۦۘۤۦۚۚ۫۟ۤۥۢۧۙ۟ۛۘۦۥۜ۫ۨۙۤۨۦۦۖۘۘ";
                                while (true) {
                                    switch (str22.hashCode() ^ (-879433796)) {
                                        case -1678978811:
                                            str21 = "۬ۥۢۡۦۥۧۜۡۜۛ۫ۡۧ۠ۥۗۧۖۥۨۘۧۢۘۖ۬ۖۘۨۖۡۗۧۤۙ۟";
                                            break;
                                        case -1520149486:
                                            str22 = z ? "ۥ۠ۨ۟ۨۖۤ۟ۥۘۢۖۙۤۦۨ۟ۢۢۨ۬ۢۛۛۦۦۘۡۨۥۙۗۥۧۚۙۦۘ۠ۗۙۥۜۘ" : "ۖ۬ۚ۟ۛۡۙۚ۬ۙۦۡۘۨ۬ۜۥۨۘۜ۫ۤ۬ۥ۬۬ۨۘۘۡۢۥۘ";
                                            break;
                                        case 426417464:
                                            str22 = "۠ۡۡ۫ۖۜ۠ۘ۬ۨ۬ۘۘ۬۟ۥۘۗۖۚۧۗ۬ۖۖ۟ۧۜۘۘ۬۬ۛ";
                                            break;
                                        case 2092615625:
                                            str21 = "ۥۗۙ۫ۡ۫۬ۥۛۛ۠ۡۜۦۜۛۛۦۘۘۛۘ۟۠ۨۛ۫ۘ۠ۤۨۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1017825904:
                    boolValueOf7 = Boolean.valueOf(z);
                    str10 = "۟ۨۧ۬۫ۘۢۢۦۨۜۖۖۗۦۘۨۘۦ۬۟ۜۦۥۧۘۤۜۤۚۘۧۗۤۡ۬ۨۜۚۗۦۘۗۤۥۦۜۡۧۨ۫ۥ۠ۙۥ";
                    break;
                case -1010858773:
                    boolValueOf6 = Boolean.valueOf(z);
                    str10 = "ۨۜ۫ۗ۟ۦۘۨ۟ۡۘۥۜۦۘۙ۬۟۟۫ۡۥۜۥۘۥۖۦۘ۬۠۟ۧ۠ۜۜۨۘۘۧۘۥۘ";
                    break;
                case -910692398:
                    str10 = "ۦۘۦۘۖۤۨۨۖۘ۠ۤۢۤۜۥ۫ۚۙ۠ۛۡۡۙ۫ۥ۫ۛۢۨۙۧۨۥۖۥۥۘ";
                    c4529x4 = c4529x4OooO0O03;
                    break;
                case -831976735:
                    str10 = "۫ۧۦۤۢۖۛۚۜۘۡۗۚۚۘۤۜۜۤۖۢ۬ۥۜۡۤۖ۠ۛۗۘۦۖۘۜ۬ۚ";
                    str9 = str2;
                    break;
                case -822943039:
                    str10 = "۠ۗۥۘ۬ۥۛۥۢۡۘۨۡۜۛۡۤۙۘۧۜ۠ۧۗ۫۟ۦۛ۠ۜ۠ۗۘۘ۟۠ۥۥ";
                    str9 = str6;
                    break;
                case -782989882:
                    str10 = "ۤۗۘۘۡۛۘۘ۬۬ۦۚۚۦۘۡۖۦۘۚۤۖۘۜۨ۠ۤۤۦۘۧۡۙۘۦۘۦۤ۟ۢۗۡۘۙۘ۟ۘۘۜ۠۬ۥۖۘۘۢۘۘ۫ۡۙ";
                    str9 = str;
                    break;
                case -777471585:
                    str10 = "ۘ۬ۙۜۚۨۘۘ۫ۡۘ۟۫ۥ۬ۖۗ۟۫ۜۤۡۦۧۖۘۢۧۛۦ۠ۖۨ۫ۢۡۧ۟ۚۙۚۤ۠ۨۘۛۛۦۘ۬ۨۜ";
                    break;
                case -672983105:
                    C4529x4.OooO0O0().OooO0o(InterfaceC3865f6.OooOOo0, Boolean.valueOf(z));
                    str10 = "ۦۖ۠۬۠ۘۖۡۜۘۥۤ۟ۧۛ۠ۘۧ۬۠ۜۗۗۘۚۖۘۛۖۡ۫ۦۤۘۥۦۘۗ۫ۗۡۨ۟ۜۛۜۘۖۨ";
                    break;
                case -653440853:
                    AppContext.OooO00o().OooOO0(R.string.setting_illegal);
                    str10 = "۬ۗۧ۠ۛۘۧۖ۬ۘۤ۬ۜۡۘۘۗۥۖۜۢۢۛۨۗ۫ۚۗۢۗۦۘ";
                    break;
                case -473743584:
                    switch (id) {
                        case R.id.switch_setting_automatically_run_script /* 2131297306 */:
                            str10 = "ۡ۟ۧۚۦۙ۠ۚۦۨۜ۠۫۠ۚۙۥۤ۫ۧۥۘ۫ۙۜۥۦۜۥۨ۬۫۫ۡۨۧۡۘۧۤۧ۠ۛۤۥۚ۟۟ۨۧۖۢ۫ۦۦ";
                            break;
                        case R.id.switch_setting_collect_logcat /* 2131297307 */:
                            str10 = "۫ۚۤ۫ۜۦۘۨۥۜۤۨۚۘۖۘۙ۠ۢۗ۠ۜۘ۠۠ۡۖۤۢ۫ۙۖۚۖ۫ۘۙۜ";
                            break;
                        case R.id.switch_setting_error_dialog /* 2131297308 */:
                            str10 = "ۛۢ۫۠ۡۜ۫ۡۥۘۘۢۖۘۡ۬۠ۚ۬۟ۧۙۧۛۘۦ۠ۥۜۛۗۖۘۘۦۙ۟ۦۢۤۛ۫۟ۘۘۘ۟ۚۘۘۨۥۚۗ۟ۦۨۢ۬";
                            break;
                        case R.id.switch_setting_flash_back_auto_restart /* 2131297309 */:
                            str10 = "ۥۢ۫ۤ۟ۛۗ۬۬۫ۥ۟ۜۡۘۚ۠ۜۡۘۖۡ۫ۦۘۚۚۚۤۧۖۘ۫۫ۧ۠ۢۧۡ۫ۗۥ۫۟ۗ۟ۖۜ۬ۖ";
                            break;
                        case R.id.swtich_setting_call_stop /* 2131297310 */:
                            str10 = "ۧۨۧۘۢۡۤۜۜۛ۠ۡۦۘۡۖۦۘۨۢ۟ۦۥۗۨۦۨۘ۠ۖۡۜۦ۠";
                            break;
                        case R.id.swtich_setting_floatview_ctrl /* 2131297311 */:
                            str10 = "ۤۡۧۘۥۨۦۘۧۡۡۘۛۨۡۘۢۖۤۢۛۡۘۙۜ۬۠ۘۘۜۜۦۨ۫ۗ۫۫ۡۧ۬ۛ";
                            break;
                        case R.id.swtich_setting_script_pause_and_resume /* 2131297312 */:
                            str10 = "ۧۡۜۢۘۤۥ۬ۤۘۛۦۧ۬ۘۘۚۤ۠ۥۦۖۘ۟۟ۧۦ۟ۖۥۚۦۛۢ۬ۤۥۤ";
                            break;
                        case R.id.swtich_setting_vibration /* 2131297313 */:
                            str10 = "ۢ۠ۨۘۜۥۧۘ۫ۖۘ۫ۗ۠ۧۨ۫ۘۦۨۘۧۦ۬ۢۜ۫ۗ۫ۜۡ۬ۡۘۨۚۘۧۙ۬ۘۙۥ۟ۜ۟ۥۡۜۤ۟";
                            break;
                        case R.id.swtich_setting_volume_key_ctrl /* 2131297314 */:
                            str10 = "ۥۜۨۘ۬ۗۦۘۥ۫ۥۨۡۛ۬ۙۖۧۜۘۤۡۥۘ۠۟ۘ۟ۡۡۜۘۦۙ۠ۛۢۦۘ";
                            break;
                        case R.id.swtich_setting_waggle_stop /* 2131297315 */:
                            str10 = "ۘۥۡۙۖۤۢۤۨۘۤۜ۟۬ۧۤ۟ۗۗ۫ۚۖۤ۟ۥۙۗۤۤۥۦ۠ۙ۠ۦ۟ۧۙ۠ۗۜۘۛۦۛۜۧۖ";
                            break;
                        default:
                            str10 = "۬ۙۨۨۚۜۘۤ۬ۦۘ۠ۗۖۦۚۢۤۙۚۜۗۡۘۧ۬۟ۨۧۨۚۡۡ۬ۚۥۘ۠ۥۘۦۡۘۡۦۛۤۡۘۤۘۨۘ";
                            break;
                    }
                    break;
                case -257949883:
                    c3977i7OooO = C3977i7.OooO();
                    str10 = "ۡۛۘۘۚۧۖۛۤۙۢ۬ۘۧۨۘ۬ۨۙۙۜۙۙۧ۠ۡۛ۫ۙۙۢۜۙۛ۟ۢۛۡ۬ۚۢۥۘۘۦۧ۠";
                    break;
                case -245903017:
                    viewInflate = getLayoutInflater().inflate(R.layout.dialog_adb_command, (ViewGroup) null);
                    str10 = "ۙۜۧ۫ۛۚۧۢۖۘۡۙۛۦۦۡۘۨۖ۫۠ۗۢۨۙۡۘۥ۫ۘۘۚ۠ۨۨۢۙ۬ۢۙۜۖۥۘۗ۬ۧۖۧۘۚۗۦۘۖۨۚۚۡۗ";
                    break;
                case -225061399:
                    str10 = "ۙۜۖۘ۬۬ۨۤۢۨۘۧ۠ۙ۠ۜۢۜۜۥ۟ۙۗۜ۫ۛ۟ۥۛۖۚ۟۬ۤۥۨۡۨۘ";
                    str9 = str8;
                    break;
                case -197679676:
                    r24 = this.Oooooo;
                    str10 = "ۗۛۨۘۛۧۜۘۢۛۧۚۙۘۘۢۦۥ۟ۦ۠ۗۤۨ۬ۤۛۚۤۥۧۨۘۙۖۖۨ۟ۢ";
                    break;
                case -170977557:
                    c4529x4OooO0O04 = C4529x4.OooO0O0();
                    str10 = "۟۬۬ۛۗۨۘۛۘۦۘۜ۬ۛۤۨۧۤۜۘۖۡۘۘۦۡۧ۬ۗ۠۠ۥۗ۫ۛۥۘۢۤۖ۬۬ۡ۠ۢۙ۠ۦۘ۟ۡۨۚۤ۟ۡۦ";
                    break;
                case -77162070:
                    str10 = "۫ۚ۫ۦۘۘۘۜۡۡۘ۬ۘۦۜۨ۬ۢۨۢۥۖۘۖ۬۬ۚۦۜ۟ۨۧۘۜۥۡۘۙۗۨۘۢ۬۠۫۟ۤۜۡۢۢ۫ۦۘ";
                    editText = (EditText) viewInflate.findViewById(R.id.et_adb_command);
                    break;
                case -32262358:
                    str10 = "ۘۙۦۡۨ۟ۜۨۖۘۨۡۛۚۡۡۚ۫ۘۜۧ۟ۢۛ۫۟ۙ۫۬ۦۢۤۡۦۧۛۦۘۜۨۖۧۙۨۘۙۛۚۗ۟ۙۦۖۜۘ۠ۗۤ";
                    bool = boolValueOf4;
                    break;
                case -26487813:
                    c4529x4OooO0O06 = C4529x4.OooO0O0();
                    str10 = "ۛۦۤۜۢ۠ۘۙۘۘۤۤۦۨۦۨۘۡۗۧ۬۫ۨۘۖۡۢ۟ۧۛۡ۠ۢ";
                    break;
                case 3000787:
                    str10 = "ۥۢۘۧ۬ۤۘۜۦۥۢۜۥۦ۬ۡۨۖۘ۬ۜۙۢ۠ۦۘ۬ۛۡۘۛۖۙۜۙۥۘۘۖۥۜ۟۠ۥ۫ۖۘ";
                    bool = boolValueOf7;
                    break;
                case 74593651:
                    c3977i7OooO.OooOoOO();
                    str10 = "۫ۨۡۥۡۙ۠ۢۨۧۤ۠۟ۨۜۘ۫ۖۜۘۦۢۗۡۦ۟ۤۥۚۗۛۗۧۘۗۙۧۥۧۨۤۡ";
                    break;
                case 127498345:
                    str10 = "ۚۗ۠۟ۤۖ۬ۦۤۖۨۗۚۛۥۘۥۘۦۘۤ۠ۘۨۤۖۖ۬ۥ۬ۜۡۘۗۤۘۛۘ";
                    c4529x4 = c4529x4OooO0O05;
                    break;
                case 248997172:
                    c4529x4OooO0O0 = C4529x4.OooO0O0();
                    str10 = "ۥۧۖۧۛۖۘۦ۬ۡۘۜۡۜۢۦۦۦۢۡۘۥۙ۟ۦۘۢۧۚۘ۬ۖ۫ۨۦۘۛۥۧۢۢۗ۠ۦۧۘ۠ۜۗۤۜۥ۟ۚۤۤۜۜ";
                    break;
                case 274955806:
                    str10 = "ۘۖ۠ۧۧ۠ۜۧ۫۟ۧۦۘۢۗۥۘۘۜ۠ۤۜۘۨ۫ۜۘۚۚۘۘۥۘۛۛۦ۬ۜۦۥۖۙۘ۫ۤۦ۠ۘۘۛۦۗۘۤۦ۠ۖۨۘ";
                    c4529x4 = c4529x4OooO0O07;
                    break;
                case 355400582:
                    boolValueOf5 = Boolean.valueOf(z);
                    str10 = "۟ۥۤۗ۠۠ۚۛ۠ۚ۫ۦ۫ۦۘۚۥۤۨۡۗ۠ۗ۫ۤۥۗۙۢۗۤۡۙۜۜۘۘۘۙۙۜ۠ۤۜۡۘۜۧۤ";
                    break;
                case 492025512:
                    C3678a4.OooOoo(this, z);
                    str10 = "۟۬ۚۨۚۨۖۦۙۢ۫ۖۘۢ۠ۘۖۥۘۤۚۜ۠ۢۡۘۜۘۦۙۦۧۡۦۤۡۘ۠ۦۗۜۦۖۘ";
                    break;
                case 578843263:
                    str8 = InterfaceC3865f6.OooOo0O;
                    str10 = "۬ۜۡۘ۫ۦۨۘ۠۠ۨۘ۬ۗۨ۫ۡ۫۟ۜۘۗۢۢۗۢۢۢۘۖۙۢۚۛ۟ۛۚ۬ۗ۫۠ۛ۠ۨ۟";
                    break;
                case 608429784:
                    str10 = "ۚ۠ۨۛ۬ۦۛۛۛ۬ۜۚۚ۠ۘۡۢ۫ۧۙ۬ۨ۫ۡۜۤۘۘ۫ۖۨۘۡۡۡ۟ۗۦۦۖۘۥ۬ۛۨ۠۠ۜۢۘۘ";
                    break;
                case 703535128:
                    str10 = "ۛۙۗۖۤۨۢۗۘۘۧۦۖۘ۬ۛۨ۫ۗۘۘۨ۠۟ۘۤۜۘۥ۠ۛۚۥۥۧۤ۫ۤۨۛۧۤۢۘۗ۬";
                    str9 = str7;
                    break;
                case 712736692:
                    r32.setChecked(true);
                    str10 = "ۧۥۥۤۚۡۛۜۢۥۤۡۡ۠ۘۘۙۖۖۘۨۨۨۘۜۨۢۢۤۢۚۘۖۘۤۨۥۧۨۤۛۙ۬ۧۘۧۘۧۖ۟ۙ۠ۚۡۨۘۘۥۡ";
                    break;
                case 734929486:
                    c4529x4OooO0O03 = C4529x4.OooO0O0();
                    str10 = "ۧ۫ۤۙ۠ۘۘۡ۟ۙۜۘۨۜۙۚۗ۫ۤۖ۬ۗۤ۟ۖ۫ۙۙۨۜۘ۟۫۠ۚۧۡۘ";
                    break;
                case 749550000:
                    str10 = "ۚۛۥۘۖۤ۠ۢۤ۫ۧۘۘ۫ۢ۬۠ۢۥۘۡۘۛۘۤۚ۟ۗ۫ۡ۬ۦۘۦۢۖۜۖۥ";
                    bool = boolValueOf2;
                    break;
                case 751994024:
                    boolValueOf3 = Boolean.valueOf(z);
                    str10 = "۟ۨۥۘۖۥۧ۟ۤۨۦۤۜۘۗۗ۬ۢۛۢۥۨۗۧۙ۠ۦۛ۟۟ۚۙۖۘۙۤ۫ۦۚۤۦۘ۟۠ۦۚۖۡۘ۬ۦۘۘۧ۬ۧۗۜۧۘ";
                    break;
                case 781044528:
                    str10 = "ۢۚۛ۟ۢۜۘۢ۠۬ۡۨۚۗۘۖ۫۟۠۬ۖۦۘۨۦۦۚۙۢ۠ۨۘ";
                    str9 = str5;
                    break;
                case 807831391:
                    alertDialogCreate.show();
                    str10 = "۟ۤۗ۫ۘۨۘ۠ۥۘۘۘۖۦ۬ۗۚۢۦۥۘۦ۟ۜۘۛۜ۟ۧۖۤۜۖۧ۟ۙ۠ۗۨۗۜۜۨۘۖۨۧۜۘۗ۟ۦۘۙۤۦۘۦۥ۠";
                    break;
                case 857868568:
                    str2 = InterfaceC3865f6.OooOO0o;
                    str10 = "ۙ۠ۨۖۨۥۡۙ۫ۦۛۛۘۘۡۘۧۖۙۤۡۙۛۧۡۘۜۤۨۘۗۥۜۘ";
                    break;
                case 893664653:
                    c3977i7OooO.OooOoo();
                    str10 = "ۥۥۦۘ۠۟۬ۧۥۡۘۡۙۤۡۤۗۘۥۡۖۘۡۘۥۘۙۙۜۘۙۡۗۦۧ۬۟ۧۥۘ";
                    break;
                case 910260928:
                    str10 = "ۥۧۦۘۜۘۥۜۦۧۘۧۛۨۘ۬ۜ۫ۤۚۡۨۢۥۘ۬ۨۦ۬ۙۢۤۚۡۚۛۤۛۜۧۖ۬۟ۚۗۘۘ";
                    c4529x4 = c4529x4OooO0O06;
                    break;
                case 941378436:
                    String str23 = "۟ۦۥۘۜۚۖۥۤۘۘۜۛۖۡ۫ۢۥۦۜۜ۟ۥۢۥۥۡۘۚۘۛ۬";
                    while (true) {
                        switch (str23.hashCode() ^ (-1158740640)) {
                            case -2000627165:
                                String str24 = "ۖۜ۟ۖۤۢ۟ۧۘۘ۟۫ۖ۠ۢۙۜۘۖۦ۬ۢۜ۫ۡۘۡۖۦۥۛۚ۬۬ۘۘ۠ۢۥۗۤۖۘۦۘ۫";
                                while (true) {
                                    switch (str24.hashCode() ^ (-1709042526)) {
                                        case 671806647:
                                            str24 = "ۡۤۧ۫ۨۨۘ۠ۖۙ۠ۢۙۥۖۚۡۢۘۖۜۨ۬۬ۢۚۡۘۘۚۗ۬ۥۗۢۡۙۦۖۜ۬ۗۨۡۘۚۥۢۨۡۜۘۧۧۡۘۖۡۛ";
                                            break;
                                        case 1048618354:
                                            str23 = "ۢۛۚۙۤۘۘۙۥۦۜۡۗۦۛۡۘ۠۠ۚۚ۟ۘ۟ۡۦۛۢ۟ۘۢۥۘ";
                                            break;
                                        case 1697875754:
                                            str23 = "۟ۘۧ۠۠ۗۢۢۨۢۨۦۘۜۗۖۙۛۤۨۛۡۘۥۙ۠ۙۧۖۗۘۤۖۘۜۘۙۗ۫۟۟ۦۤۨۛۛۡ۟ۡۦۡۘ۬ۨۡۚ۠ۥۘ";
                                            break;
                                        case 2088762960:
                                            str24 = z ? "ۚۦ۬۫ۛۧ۠ۦۘۘۧ۟ۖۘۨۖۧۛۧۡ۟۠ۗۦۛۜۘ۬ۦۜۖۘۚۧۛۗۦۜۜۘۚۘۗ۠ۨۘۘۘۙۡۨۜۡۘ" : "ۡ۫ۙ۟۬ۨۧۛۘ۟ۛۤۙۙۚۘۨ۠ۨۧۘۘۜۖۧۘۗۢۥۜۚۚۚۘۘۘۢ۟ۜۘۖ۠ۦۗۥۘۘ۬ۜۘۗۙۙ";
                                            break;
                                    }
                                }
                                break;
                            case -84960568:
                                str10 = "ۛۧۡۘۙ۬ۧ۠۟ۘ۠ۚ۬ۖۦۨ۠ۨۘ۠ۚۖۗۜۤۙۧۨۤۘۜۘ";
                                break;
                            case 507252314:
                                break;
                            case 775871626:
                                str23 = "ۢۨۡۘۛۨۚۡۤۜۘۨۜۖۢۚ۫۫ۡۤ۬ۛ۬ۡۥ۟۟ۡۢ۠ۚۖ";
                                break;
                        }
                    }
                    str10 = "۟۬ۚۨۚۨۖۦۙۢ۫ۖۘۢ۠ۘۖۥۘۤۚۜ۠ۢۡۘۜۘۦۙۦۧۡۦۤۡۘ۠ۦۗۜۦۖۘ";
                    break;
                case 942804100:
                    str3 = InterfaceC3865f6.OooOOOO;
                    str10 = "۬۬ۨۘ۫ۜۖۘۢۜ۫۠۟ۡۘۨۨ۠ۚۧۡ۬۬۫ۖۡۖۘۚۧ۫ۨۖ۬";
                    break;
                case 964030567:
                    str4 = InterfaceC3865f6.OooOOO;
                    str10 = "ۧۦ۬۟ۧ۠ۤۘۘ۟ۧۦ۫ۘۜۘ۫۠ۚۧ۟ۨۘ۠ۢۜ۟ۘۨۜۥ۬۫ۙۢۖ۠";
                    break;
                case 1108729837:
                    str = InterfaceC3865f6.OooOOO0;
                    str10 = "ۢۧۤۚ۫ۙۧۦۖۘۚۢ۟ۜۤۙۛ۠ۜۨۨۨۘۦۧۨۧ۬۟ۥۤۨۘۧۨۦۘ۬ۘ۬ۡ۬ۗۖ۠ۚۙۦۗ۟ۥۘ";
                    break;
                case 1123790973:
                    str10 = "ۧۗۢۥ۟ۛ۟ۛۥۧ۠۬ۜ۟ۢ۠ۨۦۧۡۡۘۢۡۢۗۛۜۘۗ۟ۢۨۥۤ۟ۚۚ";
                    str9 = str4;
                    break;
                case 1191805187:
                    boolValueOf2 = Boolean.valueOf(z);
                    str10 = "ۘ۟ۥۘۚۛۙۘۧۧۘۦۧۘ۬۬۟ۚۙ۠ۦۨ۬ۥۙۦۘۨۚۥۘۢۨۡۨۦۖۘۢۙۜۘۜۚۥ۠ۘۤۤ۠۟ۚۨۜ۠۠ۘۘۨۜۦۘ";
                    break;
                case 1228777490:
                    str10 = "ۜۦۘۘۗ۠ۦۘۛۡۢۚۘۧ۠ۙۖۛۚۥۘۖ۫ۦۘۙۗۦۘۙ۬ۖۘۛۨۛۡۥۙۥۚۗۢ۬ۜۡۢۦۘ۠ۦ۫ۙۧ۠";
                    str9 = str3;
                    break;
                case 1315316985:
                    c4529x4OooO0O08 = C4529x4.OooO0O0();
                    str10 = "۟ۢ۟ۤۡۧۘ۟۠ۛۙۦۘۗۜۙ۠ۜۢۧۦۦ۟۬۟۫۬۬ۨۡۘۙۦۨۖۜۚۥۙۚۡ۟ۢۖۜۥۛۧ۠ۢ۬ۘۘ۠ۚۚ";
                    break;
                case 1392049182:
                    builder = new AlertDialog.Builder(this);
                    str10 = "ۖۨۦۘۙۥۥ۟ۛۥ۠ۥ۠۟۬ۖۨۛۢۡۛۘۥۘۖۜۦۛۢۤۦۘۨۢۘۨۢۙۡۖ۬ۚ۠ۤۘۘۦۦۧ";
                    break;
                case 1413344867:
                    str10 = "ۧۨۦۘۚ۬۠ۧۨۘ۬ۚۦ۠۫ۨۘۤۥۗۡۚۡۜۗ۫ۤۗۙۧ۬۟ۖۚۦۜ۬ۦۤۘۥ۠۬ۜۘ";
                    bool = boolValueOf8;
                    break;
                case 1417803731:
                    editText.setText(C4529x4.OooO0O0().OooO0Oo(InterfaceC3865f6.OooOo00, "logcat -v time"));
                    str10 = "ۜ۠ۨۜ۫۫ۙۨۡۘۘ۫ۤ۫ۚۨۘۙۙۜۥۦۥۘۦۗۥۘۗۨ۟ۛۡۦۚ۬ۜ۠ۘۜۨۜۢۧۧۤۖۙۜۘۤۤ۬ۖۖۡۘۢۦۤ";
                    break;
                case 1452167213:
                    str10 = "ۘ۬ۙۜۚۨۘۘ۫ۡۘ۟۫ۥ۬ۖۗ۟۫ۜۤۡۦۧۖۘۢۧۛۦ۠ۖۨ۫ۢۡۧ۟ۚۙۚۤ۠ۨۘۛۛۦۘ۬ۨۜ";
                    r32 = r24;
                    break;
                case 1457832491:
                    str7 = InterfaceC3865f6.OooOOoo;
                    str10 = "ۗۨۦۘ۠۬ۤۗ۠ۖۘۦۗۥۡۧۨ۫ۨۖۨ۠ۛ۬۟۟ۦۨۢۖ۫ۜ۫ۘۚ۠۫ۦۜۧۘۚۗۜۘۚۡۘۥۖۡۘ۠ۢۙۢۤۧ";
                    break;
                case 1491753440:
                    boolValueOf = Boolean.valueOf(z);
                    str10 = "ۨۘۜۦۙۨ۬ۤۖۘ۟ۢۖۘ۟ۦ۟۠ۨۡۥۛۢۚۤۖۛۘ۫۫۠۠ۦ۟ۘۘۚۖۚ";
                    break;
                case 1541154301:
                    str10 = "۫ۢۧ۠۟ۖۥ۬ۚۨ۬ۤۜۚۥۨۛۦۘۥۡۖۘۢ۠ۤ۬۫ۜۡۧۢۖۗۜ۠ۚۚۛۜۗۥۧۚۜ۟ۤۡۡۘ";
                    r32 = r33;
                    break;
                case 1629507558:
                    str10 = "ۨۙۛ۬ۦۡۘۢۚ۠۫ۧۦۥۖۧۡۛ۟ۡۡۘۜ۫ۥۘۤ۫ۥۖۧۧۡ۫۬ۥ۠ۨۢۗۙۚ۟ۘۤۥۜ۠ۢ۬ۤۖۘۘ۟ۢۥۘ";
                    bool = boolValueOf3;
                    break;
                case 1841243032:
                    str10 = "ۥۨۦۘۙۤۦۘ۫ۤۖۡۥۙۛ۫ۘۘۢۙۥۚۡۨۘۦۧۤۧۖ۟۫ۛۘ";
                    break;
                case 1883258608:
                    r33 = this.OooooOO;
                    str10 = "۬۬ۤۖۖۗۢۜۛۢ۫ۥۖۗۘ۠ۘۥۧۧۦۡۚ۬ۦۘ۬ۨۗۛ۠ۘۘۤۤ۬ۥۛۦۘۤۛۨۘ۬۬ۙۛۘۧ";
                    break;
                case 1897845982:
                    C4529x4.OooO0O0().OooO0o(InterfaceC3865f6.OooOOo, Boolean.valueOf(z));
                    str10 = "ۤۥ۫۬ۗۜۘۦۡۨۦ۠ۗۧ۫ۛۡۡ۫ۛۨۤۗۜۖۦۤۖۦۚۤۚۧۗۥۖۖۘ";
                    break;
                case 1954215905:
                    c4529x4.OooO0o(str9, bool);
                    str10 = "ۧ۟ۢ۠۟ۙۗۘۢ۟ۛۧۙ۠ۙۙ۠ۦۡ۟۠۟۠ۖۘۙۢۧ۬ۨۨۘۗۥۜۦۡۢۦۤۤ۫ۧۘۘ";
                    break;
                case 2100369405:
                    boolValueOf4 = Boolean.valueOf(z);
                    str10 = "ۡۛۙۦۨۦۘۚۗۦۘۧۖۥۥ۫ۡۥ۟ۥۘۧ۬ۜۚ۟ۖ۬۠ۜۘ۠۬۫۬ۗۧۘۡۧۘ";
                    break;
                case 2126783316:
                    str6 = InterfaceC3865f6.OooOo0;
                    str10 = "۫ۖ۬ۘ۬ۗۜۥۙۡ۠ۜۢۨۗۥۘۚۦۦۘ۫۠ۧۨ۫ۡۗۨۨۗ۟ۘۘ۠ۖۢ۠ۖۖۧۜۜ";
                    break;
                case 2132113262:
                    AppContext.OooO00o().OooOO0(R.string.setting_illegal);
                    str10 = "ۤۛۜۙۥۥۜۛۨۗ۟ۙۥۤۛۦۦۤۧۡۖۢۛۛۖۦۥۙۖۧۥۘۙۤۖۘ۠ۥۗۙ۬۠ۙ۫ۡۘۢۖۡۘۦۗۨۘۛۚۤ";
                    break;
            }
            return;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = "ۛۡۡۘۧۥۜۢۗۗۗۗ۟ۜۛۙۜۦۗۖ۬ۘۦۛ۬ۖۦ۠ۖۥۥۘۨ۫ۘ۫۫ۙۦ۠۠ۚۡۥۨۧۖۨۙ";
        Intent intent = null;
        ScriptLog scriptLog = null;
        File file = null;
        File[] fileArrListFiles = null;
        C4048k4.OooO00o oooO00o = null;
        Intent intent2 = null;
        Intent intent3 = null;
        Intent intent4 = null;
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_SPINNER_VALUE) ^ 1007) ^ 202) ^ 917789462) {
                case -2031933633:
                    scriptLog.setSize(C4048k4.OooO0Oo(file.length()));
                    str = "ۗۡ۬۬۠ۜ۟ۛۙۨۖۚۦۙۖۘۚۧ۠ۦ۟ۦۧۢۤ۠ۗۢۜۗ۟ۡ۠۫۬ۗۡ";
                    continue;
                case -2007055104:
                case -1689229306:
                case -1541663665:
                case -1457668633:
                case 409872096:
                case 1469651875:
                case 1700534026:
                    str = "ۢۢ۟ۚ۫ۨۛۧۦ۠ۛۘ۟ۢۤۗۚ۟ۡۨۙۛۘۘۥۨ۫۬ۗۘ";
                    continue;
                case -1994940013:
                    intent.putExtra(InterfaceC3865f6.OooOoO, true);
                    str = "ۤۗۗۖۦۦۘۖۧۥ۟ۗۖۧۚۛ۬ۧۙۛۖ۟۠ۜۥۦۛ۬۟ۙۘۗۡۘ۠ۚۖ";
                    continue;
                case -1971280205:
                    str = "ۜۖۢۛۤۨۘ۬ۨ۬ۡۨۚۢ۟ۜۘۤۚۘۦۛۗ۫ۡۧۜۙ۟ۧۤۨۨۧۖ۫ۢۙۡ۟ۘۜۧۙ۫ۗۘۦۡ۟ۖۖۧۘۢۖۧۘ";
                    fileArrListFiles = new File(C3939h6.OooO0O0).listFiles(oooO00o);
                    continue;
                case -1968743129:
                    scriptLog.setName(file.getName());
                    str = "ۥۛۥۘۜۨۨۘ۠ۥۦ۟۬ۢۥ۫۫ۤۡۥۘۧۦ۠ۥۨۙۡۜۦۘ۬ۡۖ";
                    continue;
                case -1959415290:
                    intent = new Intent(this, (Class<?>) ScriptLogDetailActivity.class);
                    str = "۫ۥۛ۬۟ۡۘۨۛۡۘۢۘۖۘۤ۬ۘۘۙۖۘ۬ۛۡۦ۟۟ۦ۟ۧ۟ۢۦ";
                    continue;
                case -1848912075:
                    str = "ۤۢۦۧۘ۫ۦۚۗۜ۫ۥۘۧ۬۬ۧۧۘۨۘۛ۬ۢۜۘۨ۬ۤۥۘۖۘۜۦۦۚۨۤ۬ۢۢۡ۬";
                    intent3 = intent4;
                    continue;
                case -1651238531:
                    startActivity(intent3);
                    str = "ۛۧۤۢ۬ۙ۟ۥۦۘۚۤۚۤۦۗۡۥۜۡۨۥۖۜۙ۫ۡۘۚۜۛۙ۠ۜ۟ۤ۫ۤۡۚۨۗۖۨۡۧ۟ۡۛۤۤۡ۫ۥۡ";
                    continue;
                case -1427337309:
                    switch (view.getId()) {
                        case R.id.btn_setting_scriptlog /* 2131296826 */:
                            str = "ۦۛۧۡۚۨۘ۠ۜۤۙ۠ۙۚ۬ۘۛ۬ۖۜۨ۠ۖۨۦۘۖ۟ۡۘۧۨۦۘۧۢۥۘۤۧۡۧۨۛۗ۠ۨۙۙۘۙۧ۟";
                            break;
                        case R.id.button_setting_feedback /* 2131296831 */:
                            str = "ۘۦۨۘۦۤۗۛۘۧۘۗۙۤۚۤۤ۫ۛۜۘۜۖۘۘۜۦۘۡۘۖۘۙۚ۠ۨۗۡ۟ۗ۟";
                            break;
                        case R.id.ll_device_name /* 2131297117 */:
                            str = "ۦۗۛۗۡۚۘۚۗۘ۬ۖۘۖۛۘۘۤۘۘۘۦ۟ۢۢۖۘۜۖۗۚۚۚ";
                            break;
                        case R.id.ll_project_number /* 2131297120 */:
                            str = "ۛۧ۟ۨۘۘ۬ۥ۬ۧ۠۠ۨۛۤ۬ۗ۟ۖۙۥۡۖۜ۠ۛۘ۫۫ۤ۠ۥۤ۠ۚۡۘۦۖۘۤۜۛ";
                            break;
                        case R.id.setting_button_exitapp /* 2131297262 */:
                            str = "ۧۖۘۧۡۖۘۖۤۛۢۙۗۨۨۦۘۗۥۖۦۦۦۘۢۧۨ۬ۥۘۘۧۘۦۘ";
                            break;
                        case R.id.setting_button_update /* 2131297264 */:
                            str = "ۥۖۢۨۤۜۘۘۨۙۜۖۗۨۜ۬ۗۥۖۘۧ۟ۦۚ۫ۜۘۤ۟ۙۚۤۘۙۢۛۚۚۧۗۢۛۖۜۤۗۡ۠ۜۜ";
                            continue;
                        default:
                            str = "۬ۙۡۗۚۧ۫ۗ۫ۙ۠ۤۨۧۢۗ۬ۥۤۛۘ۟ۦ۬ۧۦۘۧۘۨۗۗۨۘ۫ۨۜۘ۟ۗۘۘ۠ۡ";
                            break;
                    }
                    break;
                case -1394406070:
                    str = "ۤ۬۫ۦۘ۬ۦ۟ۡۚۜۜۘۥۖۧ۟ۡۨ۬ۗ۟ۜۗۚۨ۫ۜۘۖۧۜۘ۫ۡۢۥ۫۠ۘۘ۫ۡۙ";
                    continue;
                case -1357606280:
                    return;
                case -1327949826:
                    str = "ۡ۠ۡۘ۟ۛۖۛۢ۫ۡۦۥۦ۬ۛۢۙۘ۬ۢۜۘۥۛۙ۠۫ۤۢۤۜۛۙۖ۬ۗۙ";
                    intent3 = intent;
                    continue;
                case -1188012837:
                    str = "ۚۙۜۢۢۘۡ۟ۗ۫ۤۖۘۡۘۘۘ۠ۨ۬ۛۨۚۛۦ۬ۛۤۖۗۗۨۘۦۤۖۢۙۖۘۧۧۘۚ۠ۚۛ۬ۥۘۜۘۜۛۡۖۘۥۢۘ";
                    oooO00o = new C4048k4.OooO00o(".log");
                    continue;
                case -1077092706:
                    StudioBindClearActivity.OooO(this, AppContext.OooO00o().OoooOoO);
                    str = "ۢۗۘ۠ۢۙۙۗۦۘۚ۬ۜ۬ۛۡۘۗۥۜۘۗۛۖۨۘۜۘۥۙۡۘۨۗۜ۟۠ۜ۠ۤۘ";
                    continue;
                case -678126929:
                    OooOOO0();
                    str = "ۦۨۜۘۙۢۦۘ۠ۤۜۗۨۥۧۘ۟ۥ۬ۨۚۤۥۘۜۦۜۘۚ۟۫۬ۧ۬۫ۦ۟ۡۖ۟ۜ۫ۙۧۘۙ";
                    continue;
                case -513142528:
                    str = "۟۫ۡۘۥۙۧۜۙ۬ۧ۬ۚ۠ۖۤۚ۠ۥۘ۬ۤۦۘۧۡ۫ۖۗۤ۫ۨۢ";
                    file = fileArrListFiles[0];
                    continue;
                case -238121952:
                    str = "ۤۢۦۧۘ۫ۦۚۗۜ۫ۥۘۧ۬۬ۧۧۘۨۘۛ۬ۢۜۘۨ۬ۤۥۘۖۘۜۦۦۚۨۤ۬ۢۢۡ۬";
                    continue;
                case -96895853:
                    AppContext.OooO00o().OooO();
                    str = "ۧ۫ۜ۠ۡۚ۠ۧۧۦ۬ۖۥ۬ۜ۟ۦۧۥۜۥۘۢۙۤ۠ۧۡۚ۫۟";
                    continue;
                case 14496922:
                    String str2 = "ۛۤۡۘۘۨ۫۠ۗۢۦ۫ۙۛۙ۫ۤۦۥۡۧۘۗۤ۟۫ۡۛۖۧۖۗۛۨۘ۟ۗۡۨ۬ۥۘۨۡ۫۬ۧۛۛ۟۟۬۬۬ۛۢ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1045955119)) {
                            case -383540602:
                                str = "ۙ۬ۜۘۖ۬ۥۢۤۡۘۡۙ۟ۥ۟ۥۘۗۧۖۘ۬۫۠ۨۧ۠ۨۥۘۧۚۚۢۜۥۘۢۤ۫ۚ۟ۛۗۗۜۘ";
                                continue;
                            case 501220207:
                                str = "ۖۡۦۘۛ۟ۘۘ۬۫۠۟ۘۜۘۦۧۧۦۡۤ۟ۦۖۢۛۦۨۤ۬ۥۧۘ۠ۜۖ۠ۥۧۧۖۖۘ۬ۖۖۨۦۦۙ";
                                continue;
                                continue;
                            case 766023641:
                                str2 = "ۖۚۜۜۥۥۚۥ۟۠ۥۘ۟ۤۜۘۘۥۛۘۢ۫۬۠ۥۦۖ۠ۜ۟ۥۦ۫ۧۧۦۥۨ۫ۛۧۥۧۘ";
                                break;
                            case 1360169513:
                                String str3 = "ۨ۬ۡۘۨۜۗۦۥۥۘۚۖۘۥۜۦۘۛۚۜۘۡۦ۠ۥۛۨ۫ۥۨۘۙ۫ۛۨۜۡۘ۫ۦۘۗۖۨۘۛ۫ۧۗۛۖۘۧ۫۫ۘۗۚۧۜۢ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1057396680)) {
                                        case 575254408:
                                            str2 = "۬ۡ۫۫ۜۜۤۖۙۨ۬ۨۖۨۘۛ۫۟ۙۦ۟ۙۛ۫ۛۙۖۨۨۘۡ۫ۙۥ۫ۡۡۥۧۘ۬ۥۥۘۙۖۨۘۗ۟ۜ";
                                            break;
                                        case 814620199:
                                            str3 = "ۡۥۘۘۨۢۚۙۧۢۧۗۗۖ۠ۚۡۚۢ۬۬ۚۜۘ۟ۚۖۘۛۥۧۘۦ۫ۨ۫۫ۖۘۥۙۖۜ۠ۗ";
                                            break;
                                        case 1822685187:
                                            str3 = fileArrListFiles.length == 0 ? "۬ۧۨۘ۠ۗۧ۬ۗۡۘۧۗ۫۠ۧۗۙ۬ۥۡ۠ۨۖ۬۟ۚ۫ۦ۟ۡۦ۟ۧۤۜۤ" : "ۤۙۜۘۙۖۙۙۥۘۘۛۘۡۘۦ۠ۜۘۚ۠ۖۖۦۦۤۘۢۥۜۡۘۜۨۡۘۚۗۤۤۜۧۘۨ۬ۡ۟۬ۛۧ۬ۛ۠ۤۥۘ";
                                            break;
                                        case 2046646364:
                                            str2 = "ۜۛۜۘۙۢۤ۬۫ۧ۬ۤ۬ۤۗۗۗ۠ۜ۟۫ۥۘۨۗۦۜ۠ۡۦۡ۟ۗۜۡۚۥۤۦۖۥۗۘۨ۫ۤۡ۠ۙ۬";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 296445812:
                    scriptLog.setFile(file);
                    str = "۬ۚۘۘۤ۫ۧۦۛۦۘ۬ۢ۫ۜۥۧۘۤۢۡۢ۟ۦۚۛۛۜۜۤۖۙۘۘۤۢ۟ۙۦ۟";
                    continue;
                case 374908074:
                    intent4 = new Intent(this, (Class<?>) EditDeviceNameActivity.class);
                    str = "ۛۗ۟ۡۦۚۖۚ۠ۦۡۛ۟ۖۘۖۙ۠ۤۚۦۘۖۨۨ۠۠ۨ۬ۥۜۘ";
                    continue;
                case 514138749:
                    intent4.putExtra("device_name", this.o0OOO0o.getText().toString());
                    str = "۠۬ۧۨۖۢۦۡۚۦ۟ۤ۫ۖۚۨۥۘ۬۟ۙ۠ۖۙۧۨۢۛۘۡۘۤۛۦۦۡۛ۫۠ۗۘۤۨۘۘ۟ۥۘ۬ۢۥۘ";
                    continue;
                case 541098957:
                    startActivityForResult(intent2, 1);
                    str = "ۙۚۨۙۘۛۡ۟ۜۤۦۖۦۧۤۛۛۨۡۗۧ۬ۛۛۚۗۛۧ۬۟۠ۛۡۡۧۨۘۘۦ۠ۤ۫ۦۘ";
                    continue;
                case 562853860:
                    str = "ۗ۫ۧۘۖۘۜۘۚۗۢ۠ۥۡ۫ۙ۫ۨ۠ۨۦۘۤۤۡۘ۟ۚۜۘۤۦۦۦۗۙۙۜۛۛۚۖۘۥۜۤ۫ۢۡ۟۠ۡ";
                    scriptLog = new ScriptLog();
                    continue;
                case 706862866:
                    intent2.putExtra(FeedbackActivity.class.getCanonicalName(), C4125m7.OooO0o0().OooO0O0);
                    str = "ۢۦۛ۬ۤۨۦ۟ۥۘۜۛۡۘۘۤۤۧۤۧ۠ۤۖۗۜۢ۫۬ۧ۠۫ۨ۫ۧۢ۬ۦۘۘۘۚۨۖۡۘۤۘۗۗ۠ۥ";
                    continue;
                case 717770253:
                    StudioBindActivity.OooOO0o(this);
                    str = "۬۠ۢۚۙۙ۫ۛ۫ۥۨۥۘۤ۬ۢ۬۬ۥۙۥ۫ۖۧۡۘۛۢۨۘ۠ۗ۠ۥۜ۟ۢۜۖۘۧۦۜۦۗۙۤۘۥۘۜ۠ۛ";
                    continue;
                case 762368456:
                    str = "ۗ۬ۗۤ۠ۜۤۜۙۨۢۢۖۚۥۨۖۘ۬ۙۘۚۧۜۘ۟ۧۚۧۥۘ";
                    intent2 = new Intent(this, (Class<?>) FeedbackActivity.class);
                    continue;
                case 850631955:
                    break;
                case 944494230:
                    String str4 = "ۡۙ۠ۗۦۘۗۚۤۧۘۨۦۖۧۖۨۘۛۗ۬ۛۤۡۥۛۜۗ۫ۥۘ۬ۧ۟ۙ۬";
                    while (true) {
                        switch (str4.hashCode() ^ (-781693601)) {
                            case -1974923321:
                                str4 = "ۨ۫ۖۘۚۚۖۘۢ۬ۖۤۗۦۡۡۘۘۡۛ۬ۨۚۨۗۚۥۘ۠ۥۧۘۜۤ۫ۜۜۘۤ۠ۘۘ";
                                break;
                            case 566216999:
                                String str5 = "ۜ۠۟ۦۗۥۘۚۚۥۗۨۥۦ۬ۥۘۡۛۥۘۨ۬ۥۧۨۖۡ۠ۙ۟ۛۜ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-928647458)) {
                                        case -1587889575:
                                            str4 = "ۖۡ۠ۢ۟۠ۦ۬ۦۜۙ۠ۢۜۘۧۨۖ۟ۨۦۘۥۨۡۘۦۗۜۘۢۘۦ۟۫ۧۙۥۡۘ";
                                            break;
                                        case 61495552:
                                            str5 = "ۛۚۦۦۦۦۘۖۖ۟ۗۙۥۘ۠۬ۧۜۥۡۙۜۨۘ۟ۥۜۚۥۥۦۢۘۚ۫ۧۖۜۥۘ۫۫ۧۙۨۛ";
                                            break;
                                        case 175334000:
                                            str5 = fileArrListFiles != null ? "ۨۚۧۙۨۧۘۤۚۥۘۗۧۖۘۘۖۥۤۖۘ۟ۙۥۢۦۦۧ۫ۢۖ۟ۥۦ۬ۡۘۙۗۢ۠ۛۧۧ۠ۘ۬ۘۦۘۜۢۤۙۦۚۤ۟ۘۘ" : "ۨۜۜۘۧۦۥۘۡۖۥۘۚۢ۫ۨۜۧۘۥ۠ۛۚ۫ۜۘۜۦۗۢۘۦۘۨ۬ۤۛۨ۟ۘۗۧ";
                                            break;
                                        case 2056715150:
                                            str4 = "ۢ۫ۢۧۙۙۢۨۘ۠ۦۤۦۚۦۘ۬ۡۙۨۖۧۖۚۛۡ۠ۖۘۨۛۜۜ۬ۨۢۗۗ";
                                            break;
                                    }
                                }
                                break;
                            case 624548464:
                                str = "ۤۜۖۘ۠ۤۡۘ۬ۛۢۢۢ۫ۧۤ۟۟ۘ۟ۛۙۚ۠ۖۨ۬ۤۤۗ۬ۜۘ۫ۨۦۘ۫ۘۚ۟ۧۤۛۖۡۘ";
                                break;
                            case 1232912143:
                                break;
                        }
                    }
                    break;
                case 1226273115:
                    AppContext.OooO00o().OooOO0(R.string.No_ScriptLog);
                    str = "ۢۢ۟ۚ۫ۨۛۧۦ۠ۛۘ۟ۢۤۗۚ۟ۡۨۙۛۘۘۥۨ۫۬ۗۘ";
                    continue;
                case 1311671919:
                    String str6 = "ۤ۫۫ۘۙ۬ۜۥۦ۫ۡۗۙۚۜۘۢۚۘۘۙۡۨۘۧۗۦۘۦۜۢۧۚۖۘۚ۟ۦۘۛۖۘۨ۟ۥۘۡۖۙۥۧۢۖ۬۠";
                    while (true) {
                        switch (str6.hashCode() ^ 1639860153) {
                            case -1578878084:
                                String str7 = "۬۟ۢۗۡۦ۠۟ۜۖۚۥ۠ۨۢۢ۠ۧۢۙۢۨۘۙۧۙۤۚۙۖۡ۠ۤۘ۠ۖۘۖ۟ۗۙۤ۟";
                                while (true) {
                                    switch (str7.hashCode() ^ (-543841748)) {
                                        case 1011867524:
                                            str6 = "ۦۛۗۥ۟ۨۨۙۜۘۨۘۨۘ۬ۗۖۧ۬ۖۘۢ۟۬ۙۦۗۗۗۙۖۙۤۘۧۨۘۘۡۢ۟ۛ۬ۦۘۡۘۜۤۦۘۢ۫۫";
                                            break;
                                        case 1016190221:
                                            str6 = "ۜۤۡۧۧۡۘۖۢ۠ۖ۟۠۠ۨۗۙۚۧۖۛ۟۟ۜ۬ۜ۠ۢ۫ۦۚ۫۟ۥۘۘۖۘ۬۠۟ۡۖۧۘۚ۫۟ۜۗ۠ۥۤۜۘۖ۠ۧ";
                                            break;
                                        case 1457957832:
                                            str7 = "ۗۢۘۘۘۧۛۧ۟ۗۨۢۖۘۨۨۧ۫ۙۨۜۗۡۘۚۗۘۘۢ۠ۖۚۘۨۢۢۦۘۡۘۘۜ۠ۤ۟ۥۥۙۘۧۘۧۗۘۘۖ۠ۦۘ۬ۡۡۘ";
                                            break;
                                        case 1906778398:
                                            str7 = TextUtils.isEmpty(AppContext.OooO00o().OoooOoO) ? "ۢۦ۬ۥ۠ۨۗۚۦۛۗۖۘۗۗۛۚۦۖ۟ۨۥۨۜۙۚۘ۟۟ۦۨۘ" : "ۚۜۢۗۜۡۘۨ۟ۥۥ۠۟ۤۢ۠ۗ۟ۜ۠ۖ۫۬ۦۘ۟ۥ۬ۛ۫ۧۜ۬ۖۘۦۖۧۘ۬ۛ۬ۦ۬ۨۘۖۗۖۥۗۦ";
                                            break;
                                    }
                                }
                                break;
                            case 553308884:
                                str6 = "ۨۜۘۘۤۤۥۘۗۦۜۦۢۚۚۜ۬ۙۚۖۧۢۜۘ۟۠۠ۚۘۧۘۙۨۚ۠ۨۥۙ۠ۘۘ";
                                break;
                            case 1399347220:
                                str = "ۗۘۨۥۖ۟ۙۧۛۡۤ۠ۥۨۧ۠ۢۦۘ۫ۖۖۖ۫ۘۘۗۙۘۘۚۧۧۚ۬۟ۜۦۗ۠۬ۦۗۨۨۘ";
                                continue;
                                continue;
                            case 1576741684:
                                str = "ۥ۟ۛۙۢۘۘۖۦ۟ۢ۫ۤۧۦۖۚۘۘۡۜۧۘۙۤۡۘۘۨۥۘۙۛۖۨ۠ۨۖۥۦۡۖ۠۟ۤۤۢۢۧۛ۠ۘ";
                                continue;
                        }
                    }
                    break;
                case 1621496948:
                    Arrays.sort(fileArrListFiles, new C4348s8());
                    str = "ۗۨۨۘ۬ۖۡۘۥۚۨۘ۟ۛۤۢۦۦۗۙۥۘۥۤۦۘۢۛ۫ۚۚۜۘۡۘ۟ۨۚۘۘۘۥۧ۫ۛۡۦۦۦ";
                    continue;
                case 1748397980:
                    intent.putExtra(InterfaceC3865f6.OooOoOO, scriptLog);
                    str = "ۦ۬ۡۛۜۥۦ۟ۘۘ۫ۦۖۛۥۢ۠ۦۥ۟ۘۥۘۧۨۙ۠۟ۖۙۤۛۦۥۨۧۤۡۨۢۘۡۥ";
                    continue;
                case 1853602684:
                    str = "۫ۧۧۨۦۗۨ۟ۦۡۖۙ۫ۜ۟۟ۚۜۘۢۥۦۡ۫ۤۡۙۘۘۡۜۡۘۤۜۜۡۨۖۘۡۙۡۘ۫ۖۛۘۡۡۘ۫۟ۡ";
                    continue;
            }
            str = "ۘ۠۬ۤۥ۫ۥۡۥۘ۬۬ۗۡ۬ۤۛ۟ۚۡۥۜۦ۠ۢۖ۬ۤۦ۠ۡۘۘۙۡۘۨۧۨۘۚ۠ۗۦۖۜۘۛ۬ۙۖۨۛ";
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۧۡۡۥۘ۟ۤۨۥۙۡۘۡۧۙ۟۟ۤۙۚۘۖۗۚۧۨ۬ۚ";
        while (true) {
            switch ((((str.hashCode() ^ 362) ^ 393) ^ 87) ^ (-1188593655)) {
                case -1279455282:
                    initView();
                    str = "ۘ۟ۛۦۖۚۙۜ۫ۨۖۛۨ۟ۡۧۘۗۜۖۘ۟ۖۘۘ۬ۙۦۧۨۧۤ۠۬ۤۙۜ۠ۘۙۖۧ۫ۗۚۥۘ۫۠ۘ";
                    break;
                case -1154238645:
                    str = "ۥۛ۟ۗۧۜۘۦۙۘۥۙ۟ۗۖۦ۬ۧۦۘۢۖۜۘ۟ۗۥۤۧۤۧۦۨۖۛۗۨۨۢ";
                    break;
                case 1038135065:
                    super.onCreate(bundle);
                    str = "ۧۦۨۥۘۗۦۧۖۤۦۨۦۘۧۘ۠ۥۨ۟۬۠ۛۗۧۦۦۛ۠ۤۜۗ۫ۖۙۖۖ۫ۙۘۘۚۢۨۘۡ۟ۙ۫ۥ۫ۙۨۘۘۛۗ۫";
                    break;
                case 1046156889:
                    setContentView(R.layout.activity_setting);
                    str = "ۚ۟ۦۜ۠۬ۘۨۖۘۚۖۧۘۖ۫ۜۘۤۦۡۙۧۚۘۜ۟۠۫۬۫ۦۘ";
                    break;
                case 1073808417:
                    str = "ۦ۬ۘۡۦۘ۫ۛۤۙۙ۬ۥ۟ۚۖۡۛ۟۫ۦۦۜۤۡۨۨ";
                    break;
                case 2030076655:
                    return;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        OooOO0 oooOO0 = null;
        String str = "۟ۘۚۤۨۙ۫ۧۚۛۚۨۚۥۢ۬ۚۨۤۘۜۘۥۧۚۤۧۦۥۦۜۦۘۥۤۥۦۘۙ۫ۗۤۜۙۙۤۛۨۚۜۛۢۧۜۦ";
        while (true) {
            switch ((((str.hashCode() ^ 263) ^ 711) ^ 632) ^ (-1318770448)) {
                case -1977415899:
                    return;
                case -884302079:
                    j10.OooO0o().OooOoO0(this);
                    str = "ۙۨۨۘ۟ۡ۠ۦ۫ۡۘ۫ۘۧۚۨۢۦ۫ۡۖ۟۠ۨ۟۟ۙ۟۫۟ۥ۠";
                    break;
                case -825573583:
                    oooOO0 = this.o00ooo;
                    str = "ۧۡۥۘۤۙۛۡۖ۠ۥۛۢ۫۫۫ۢۢۨۚ۫۬۟ۢۧۨۡۘۜۢۙۧۘۢۥ۫ۥ۫ۚۡۡۙۜۘۛۥۖۦۦۧ";
                    break;
                case -800409897:
                    String str2 = "ۢۨۨۘۖۘۢۡۖۥۖۗۨۘۢۧ۠ۤۙ۫ۨ۟ۜۘۛۢۛۥۧ۟ۚۡۙۥۘۚۘۘۨ۬ۥۙ۫ۗ۫ۡۨۘۘۙۙۦ";
                    while (true) {
                        switch (str2.hashCode() ^ 885015335) {
                            case -1395871768:
                                str2 = "ۘۙۦۛۢۖۘۛۜ۫۬ۧۤۢۛۚۤۥۘۘۢۥۘۜۨۖۜۤۜۘۛۢۥۚۢۘ۠ۤۖۘ";
                                break;
                            case -1138607306:
                                str = "ۦۘۦ۠ۚۘ۫ۜۙ۟ۦۘۜۡۢۗ۟ۨۘۚ۬ۜۧۦۤۤ۬۠ۛۢۦ";
                                continue;
                            case 382898017:
                                str = "ۙۘۦۤۗۡۤ۬ۙۧۢ۫ۤ۫ۦ۠ۖۘۦۙۜۙۥۨۘۛۗۚۢۢۤۚۨۢ۠۫۠ۥۗۧۢۜۘۤۤۚۜۥۥۘ";
                                continue;
                            case 934181692:
                                String str3 = "ۜ۠ۧ۠ۖۜۘ۬۟ۖۖۡ۟ۖۤۦۘۤۘۜۘۥ۠ۙۖ۠۠ۙۜ۫۠ۘۥۢۨۙۗۢۜۘۜۙ۠ۥۚۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1396695726) {
                                        case -599180516:
                                            str3 = "ۚۛۘۘۘۙۚۤۦۦۡۦۜۘۥۦۧ۫ۥۨۘ۫ۗۡۘ۫ۖۥۘ۟ۡۘۘۛۧۙۢۗۥۗۙ";
                                            break;
                                        case 101118118:
                                            str3 = oooOO0 != null ? "ۤۧۗۛ۫ۗۧ۠ۖۘۘۡۨ۬۠ۗۗۘ۟ۤۘۨۘۧۥۤۡۤۤۘۤۥۘۦ۬ۜۥ۟ۧۦۛۡۘ۠۠ۦۥۜۦۜۨۨۘ" : "ۙۥۖ۠۬ۖۘۢۦۦۧۚۛۖۢۡۗۙۡۥۜۡۘۧۥۡۘۛۛۚ۬ۘ۟ۥۤۘ۫ۛۨۘ";
                                            break;
                                        case 787922181:
                                            str2 = "ۧۡۜۘۗ۫۠ۘۤۜ۫ۨۦۘۜ۫ۜۨۘۤ۫۟ۖۙۢۛۜۛۨۦ۬";
                                            break;
                                        case 1939587675:
                                            str2 = "ۡۨۡ۟ۚۧۘ۫ۡۘۧۘۙۛۦۗ۟ۚۜ۠۫۫ۚ۠۬ۧ۟ۗۙۨۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 433882252:
                    C3982ic.OooOo00().OooOo0();
                    str = "۬ۡۖۘۨ۠ۡۜۙۛۚ۠ۖۢۜۚۨ۠ۖۘۜۘۨۘۛۚۚ۠۬ۜۚۜ۟ۙ۠ۛۛۜۥۘۘۛ۠ۘۨۖۘۖۖۧۘۘۦۢۛۥ۬ۨۗۤ";
                    break;
                case 1152796990:
                    super.onDestroy();
                    str = "ۨۡۛۦۢۧ۬ۙۘۘۜۡۦۚۜ۬۠ۗۥۗۦۧۘۢۥۨۧ۬۬ۥۦ۫";
                    break;
                case 1275811522:
                    oooOO0.cancel();
                    str = "ۦۘۦ۠ۚۘ۫ۜۙ۟ۦۘۜۡۢۗ۟ۨۘۚ۬ۜۧۦۤۤ۬۠ۛۢۦ";
                    break;
                case 1458501220:
                    str = "ۖۙۤ۠ۙۥۦۨۧۡۛۛۛۙ۬ۨ۟ۖ۠ۙ۬ۛۤۡۦۖۨ۬۟ۦۢۘۡۨۛۦۚۥ۬ۡۤۦۘ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "۬ۡۤۨۡۧۦ۬۬ۙۛۡۘۛ۠ۖۨ۠۠ۜۦۗۤۨۖۙ۠۠۠۬ۡۚۚۘۚۜۥۗۘۗۗۤۗ";
        while (true) {
            switch ((((str.hashCode() ^ 625) ^ C4095le.o0000O0) ^ 538) ^ 766783187) {
                case -1448537926:
                    str = "ۧ۠ۡۖۗ۠ۡ۬ۖۘ۫۫ۦۘۨۧۘۡۗۤۧۖۧۖۨۚ۟ۨۦۡۚۜۦۜۡۡ۠۫ۘۛۗۢۥ۬";
                    break;
                case -1203517476:
                    return;
                case -368794790:
                    super.onPause();
                    str = "ۖ۟۬ۨ۠ۚۥ۫ۦۘۛۡۘۦ۠ۖۘۙ۟ۦۘۤۖۨۘۢ۟ۦۥۡۡۘۦۥۡ۠۫ۗۙ۠ۡۘ۫ۦۡۦۦۜۗۚۥۛۗۙ";
                    break;
                case 97116617:
                    C3691ah.OooO0OO(SettingActivity.class.getCanonicalName());
                    str = "ۙۛۤۜۤ۟ۖ۫ۘۘۜۙۚۜۛ۠ۥۙۧۘۙۢۗ۬ۘۙۦۛ۫۟ۦۘۧۘۧۗۢۛۧۘۘۤۨۦۘۜۨۢۖۙۨۨۖ۬ۥۛ۠";
                    break;
                case 1282333500:
                    C3691ah.OooO0o0(this);
                    str = "ۖۙ۫ۙۖ۟ۘۢۨۘۢۤۛۗۨ۬ۜۤۖ۟ۜۘۙۛۨۘۨۙۙ۬ۢۚ";
                    break;
            }
        }
    }

    @p10(threadMode = ThreadMode.MAIN)
    public void onReceiveStudioProjectStatusEvent(C3839eh c3839eh) {
        String strOooO00o = null;
        String str = "ۗ۠ۦۘۥۧۖۘ۟ۥۘۗۜۜۛۗ۫ۢ۟ۧۜۢۜۛۦۘۨۙۘۜۘۧۢۡۡ";
        while (true) {
            switch ((((str.hashCode() ^ 874) ^ 288) ^ 481) ^ (-981887657)) {
                case -1973388811:
                    str = "ۢۖ۫ۢۧۤۘ۟ۗ۬ۡ۫ۗۦۙۦ۟ۚ۫ۤۜۢۨۚ۫۟ۥ۬ۗ۠۠ۖۜۡ۟ۚۢۡۘ۠ۘۚۜۧۤ۫۠۟۟ۤۥۙۢ";
                    break;
                case -1545990804:
                    OooOO0O();
                    str = "ۙ۠ۚ۬ۜ۫ۛ۬ۧۜۚۧۨۚۡ۠۠ۥۚۘ۬۫ۙۜۥۘ۠ۛۖ";
                    break;
                case -310740303:
                    return;
                case -86559194:
                    OooOO0O();
                    str = "ۙۙۛ۬ۥۦۤ۟ۥۘ۠ۖۨۘ۫ۙ۬ۜۢۤۘ۫ۜۘۗۡۖ۠ۘ۬۫ۥۛۥ۬۟ۢۤۖۘ۬ۖۘ۬۫ۛ۫ۧۚ۟۬۟";
                    break;
                case -33727509:
                case 924635045:
                case 1626467886:
                    str = "ۘۜۜۘۖۛۦۘ۬ۧۧۢ۠ۙ۠ۡ۠۫ۖۘۘۚ۠ۤۤۖۧۜۨۡۛۘۤ";
                    break;
                case -22143934:
                    this.o0OOO0o.setText(strOooO00o);
                    str = "۬۠ۨۘۙۤۚۘۖۛ۫ۙ۫ۗۛۦۛۛۜۘۡۧۖۘۖۢ۫ۘۡۘۖ۟۬ۥۖ۟ۚۖ";
                    break;
                case 150851309:
                    this.o0ooOoO.postDelayed(new OooO0o(this), 500L);
                    str = "ۘۜۜۘۖۛۦۘ۬ۧۧۢ۠ۙ۠ۡ۠۫ۖۘۘۚ۠ۤۤۖۧۜۨۡۛۘۤ";
                    break;
                case 1082130036:
                    str = "ۗ۟ۘ۠ۨۡۘۨۨۡۘۨ۟ۖۗ۫ۨۘ۠۬ۜۜۥ۬ۤۢۖۙۥۤۗۥۚۡ۠ۨۦۛۘۡۙۧۦۜۘ";
                    break;
                case 1084699622:
                    OooOO0o(c3839eh.OooO00o());
                    str = "۟ۡۧۚۜۦۘۖۙۥ۬ۘۖۘ۫ۦۤۧۦۜۖۗۦ۟ۚۘۘ۟ۦۥۘۚۛۚۘۡۖۙۧ";
                    break;
                case 1589967373:
                    strOooO00o = c3839eh.OooO00o();
                    str = "ۜۢۢۖ۫ۜۘۡۗۧۦ۠۬ۦۗۤۧۚۙۨۡۜ۠ۘ۟۟ۨۗ۠ۧۨۘۡۘ۠ۢۙ۬۟ۦۘۡۧۥۘ";
                    break;
                case 1674594787:
                    switch (c3839eh.OooO0O0()) {
                        case 10001:
                        case 10002:
                            str = "ۘۤۦۘۙۜۦۘۖۢۢۨۦۘ۠ۧ۬ۚۛۡۘۡ۫ۘ۫ۙۧۥۜۦۘ";
                            break;
                        case 10003:
                            str = "ۗۥ۟ۜۡۘۡۙۗۡ۬ۘۘۦۖۘۘۖۖۚۤ۠ۥ۟ۗۖۘۨۖۥۘ۬ۗ۠ۖۗ۫۟ۚۢ";
                            break;
                        case 10004:
                            str = "ۤۨۚۖ۫ۡۘۙ۠ۨۙۛۥۘۤۘۨۘ۬ۖۙ۫ۜۖۘۨۚۢۨۥۘۘۧۘ۟ۗۦ۬۫۟ۛۖۛۙۙۜۥۧۨۥۘۜ۠ۛۘۧۡۘۖ۟۠";
                            break;
                        default:
                            str = "ۖۛۜۥۤۢۘۙۖۖۥۥۢۥۜۘۙۨ۬ۧۨۢۘ۟ۨ۫ۢۗ۟ۨۥۘۛۥۘۙ۟ۨۘ";
                            break;
                    }
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "ۥ۠ۛۥ۫ۤۡۦ۟ۨۛۛۢ۟ۜ۬ۤۢۦۜۘۗۗۡۘ۟ۢۚ۬ۚۨۚ۫ۘۘۛ۠۠ۗ۫ۨۢۨۗۤۤۡۘۘ۬ۦ۫ۤۛۙۜۧۘ";
        while (true) {
            switch ((((str.hashCode() ^ 198) ^ 119) ^ 723) ^ (-1097231986)) {
                case -2028295877:
                    C3691ah.OooO0Oo(SettingActivity.class.getCanonicalName());
                    str = "۬ۘۦۢۘۖۘۛۥۧۡۙۘۘ۠ۙۥۘ۠ۗۖۗۢۘۘۡ۠ۨۗۨۘۘۥۛ۟ۙ۬۬ۡۗۜۘ";
                    break;
                case -1371471439:
                    str = "ۡۧۥۗ۬ۗۦۖۜۘۚۡۧۜۥۖ۬ۘۛۢۨۨۜۧۤۦ۫ۜۘ۬ۨ۬";
                    break;
                case -571639767:
                    super.onResume();
                    str = "ۢۜۖۜ۬ۚۗۤۨۜۤۖۢۧۜۘۛۨۡۘۤۢ۫۠ۖۘ۫۠۟۠ۚۡۙۜ۟ۙۘۚ";
                    break;
                case 24628426:
                    return;
                case 100936397:
                    C3691ah.OooO0o(this);
                    str = "ۨ۬ۨۤ۫ۦۦۖۡۢۚۡۥۥۜۘۦۤۚۤۢۥۤۤ۠۠ۛۦۘ۫ۖۜ۠۠ۙۜۜۨۘۚۤۜ۬۫ۜۢۙۦۘۧۛۙ";
                    break;
            }
        }
    }
}
