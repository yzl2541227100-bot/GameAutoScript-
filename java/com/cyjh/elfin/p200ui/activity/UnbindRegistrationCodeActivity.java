package com.cyjh.elfin.p200ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.media.AudioAttributesCompat;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.cyjh.common.base.activity.BaseModelActivity;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.http.bean.response.RegCodeInfoResponse;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.umeng.analytics.MobclickAgent;
import com.ywfzjbcy.R;
import p285z2.C3753c5;
import p285z2.C4095le;
import p285z2.C4125m7;
import p285z2.C4239pa;
import p285z2.C4381t4;
import p285z2.C4589yr;

/* JADX INFO: loaded from: classes.dex */
public class UnbindRegistrationCodeActivity extends BaseModelActivity<C4239pa> implements View.OnClickListener {
    private static final int o00O0O = 2;
    public static final int o00Oo0 = 1002;
    private String OooooOo;
    private EditText Oooooo;
    private String Oooooo0;
    private TextView Ooooooo;
    private Button o0OoOo0;
    private Button ooOO;
    private Handler OooooOO = new Handler();
    private boolean OoooooO = false;

    public class OooO00o implements Observer<RegCodeInfoResponse> {
        public final UnbindRegistrationCodeActivity OooO00o;

        public OooO00o(UnbindRegistrationCodeActivity unbindRegistrationCodeActivity) {
            this.OooO00o = unbindRegistrationCodeActivity;
        }

        public void OooO00o(@Nullable RegCodeInfoResponse regCodeInfoResponse) {
            String str = "ۡ۟ۨۢۘۛۙۘۥۢ۟ۨۘۦۚۧ۫۫۫۬ۨۘ۫ۡۜۛۢۥۘۖ۟ۖ۠ۨۘۚ۬ۥۡۡۗۡۜۡ۠ۛۤۘۖۗ";
            String string = null;
            StringBuilder sb = null;
            String str2 = null;
            String string2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                switch ((((str.hashCode() ^ 35) ^ AudioAttributesCompat.FLAG_ALL) ^ 91) ^ (-1960227958)) {
                    case -2031574924:
                        C3753c5.OooO0OO(AppContext.OooO00o(), str2);
                        str = "ۙۚۨۘ۟ۜۗۗۗۘۘ۫ۥۧ۟ۘۨۛ۫ۜ۫۟ۗۗۡۡ۫ۖۚۥۥۚۛۛۢۘۦۥ۫ۥۤ۟ۢ۬ۨۘۗۡ";
                        break;
                    case -1951796765:
                        sb.append(this.OooO00o.getString(R.string.status_code_text));
                        str = "ۚۗۜۘ۟ۧۜۘۧۦۚ۟ۧۘۨۦ۬ۘ۫ۚۗۧۤۛۛۙۖۧۢۖۛۧۤۙ۠ۖ۬ۖۥۙۨۘۛۧۨۘۚۛ۫۫ۤۖۢۤۢۛۗۨ";
                        break;
                    case -1778090354:
                        string = sb.toString();
                        str = "ۜۗۖۨۨۜۧۙ۠ۢۨۘۛۡۤ۠ۗۘۘ۫ۨۘۘ۬ۢۦۘۧۧۦۘۡۙۘۘ";
                        break;
                    case -1612759185:
                        String str5 = "ۢ۫۫ۘۙۖۘ۟ۛۡۖ۟۫ۨۚۘۘۦۘۘۤۛۧۡ۬ۦۖ۬ۤۥ۬ۢۘۜۘ۬ۘ۬";
                        while (true) {
                            switch (str5.hashCode() ^ (-721146621)) {
                                case -989147059:
                                    str = "۠۠ۤۖۗۨۜۡۤۤ۟ۤۢ۟ۧۨۘۙۥۚۢۛۥۘۖ۫ۘۘ۬ۥ۫ۖۧۜ۫ۚۡۡۚۘۘۨۡۨۘۛۦۜۘۜ۟ۥ۬ۚۨۘۢۛ";
                                    continue;
                                case 151507070:
                                    str = "ۤۦۧۡۗۜ۟ۥۘۢۛ۟ۨۦۥ۫ۖۧۘۡۙۧۨۚۡۙۢۛ۫۠ۦۚ۟ۡۦۧۖۘۛۤۜ۫ۤۛۤۥۤ۟ۗ۠ۖ۫ۚ۫ۦۜۘ";
                                    continue;
                                case 1002295061:
                                    String str6 = "ۘۙ۠ۢۚ۬ۡۜۜۘۧۗۥۘۤۨۜۘۘۙۛۡۤۘۧۜۙ۠ۡۦۘۢۜۘۡۘ۫۬۠ۙ";
                                    while (true) {
                                        switch (str6.hashCode() ^ 411290206) {
                                            case -1029244633:
                                                str6 = "ۘۜ۟ۧۗۘۘۖۘۥۡ۬ۧۡ۠ۘۘۚۢ۠ۙۘۙۦ۫ۨۘۖۥۦۘۧۗۥۘ۟ۜۚۛۤۢۧۥۙ۬ۨۥۘۖۙۨۘۙۦ۬ۗۖۤ۠ۖ";
                                                break;
                                            case -673306844:
                                                str5 = "ۨ۟ۖۘۦۥۚۖۢ۟ۦۡۗ۬ۙۜ۟ۚۜ۠۫ۡۘۨۨۨ۬ۘۡۧۘۘ۟ۦ۫۠۬۬ۨۖۘ۬ۧۘۘۢۦۘۘۤ۫ۧ";
                                                break;
                                            case -301739167:
                                                str5 = "ۦۚۦۛۤۦۘۘۧۙ۠ۨۨۘۤ۬ۖۘۡۚۦۖ۠ۤۢۖۚۘۚۖۘۜۚۚۧ۬۬ۚۛۥۘۘ۬ۤۧ۬ۙ";
                                                break;
                                            case 65472092:
                                                str6 = regCodeInfoResponse.Code == 200 ? "ۖۛ۟ۗۡۡۗ۫ۨۘۘۧۛۚ۠ۦۡۧۘۘ۠ۧ۠۠ۤ۠ۘۗ۬ۤۤۨۦۜۢۚ۠ۖ۟ۧۥۛۙۗ" : "ۖۜۖۙۦ۫ۘۛۨۘۙۨۚۤۥۜۨۘۙۛۖۖۥ۫ۢۦۖۘ۟ۡۧ۠۬۫ۛۥ۟ۢ۫ۤ۠ۗ۠";
                                                break;
                                        }
                                    }
                                    break;
                                case 1380676290:
                                    str5 = "ۧۛ۠ۛۧۚۢۚۜۚۥۜۤۗۙۢۗۨۘۡۤۢۖ۬۬ۧۥۘۘۡ۟ۘۘۗۛۙۢ۠ۡ";
                                    break;
                            }
                        }
                        break;
                    case -432754044:
                        str = "ۜۖۚۛ۫ۢۦۗۡۘۖۢۗۘۦۧۧۚۙۤۗۜۘۖۙ۬۠۟ۨۘۖۥ۠ۘۨۢۤۘۢ";
                        str3 = str4;
                        break;
                    case -398973298:
                        str = "۠۠ۤۖۗۨۜۡۤۤ۟ۤۢ۟ۧۨۘۙۥۚۢۛۥۘۖ۫ۘۘ۬ۥ۫ۖۧۜ۫ۚۡۡۚۘۘۨۡۨۘۛۦۜۘۜ۟ۥ۬ۚۨۘۢۛ";
                        str3 = string2;
                        break;
                    case 365649208:
                        sb.append(regCodeInfoResponse.Code);
                        str = "ۨۤ۠ۘ۟ۜۘۘ۬ۨۘ۬ۡۦۘۨۜۤۦۦۥۘ۟ۦۙۢۢۤ۟ۦۡۚۧۚۚۗۢۙۚۧۛۖۡۙۦۧۦۤۥۘۗۦۖۘۢۥۡۦۘ";
                        break;
                    case 372755237:
                        str = "ۙۢۢۧۜۛۘۛ۫ۚ۠ۡۡ۟ۙۢ۟ۖۘۛۖۖۘۘۜۘۢۘ۟ۡۛۛ";
                        break;
                    case 592344562:
                        str = "ۦۜۜۘۗ۟ۨۡ۫ۨۘۙۢۖۘۚۙۤۧۛۚۥۛۥۘۛۤۖۘۛۦۥۘۙۘۖۢ۬ۦۙ۬ۗ";
                        str2 = string;
                        break;
                    case 712014488:
                        str4 = regCodeInfoResponse.Message;
                        str = "۠۟ۥ۬ۜۖۘۜۛ۬۠۟ۥۘۘۢۨۘۢۛ۟ۚ۟۬ۤۜۜ۬ۢۚۨۙۙۢۦۢۖۤۡۘۜۖۨۖۨ۬";
                        break;
                    case 1518465492:
                        str = "ۗۗۖۖۢ۟ۖۗۜۘۚۧ۬ۖۗۡۦۡۢۜۦۘۜۨۡۨۘۥۖۨۨۘۖۧۦۖۙۥۚ۬ۚۚ۟ۙ۠ۛ۫ۤۚۖۘ";
                        str2 = str3;
                        break;
                    case 1520329091:
                        return;
                    case 1530151053:
                        str = "ۤۗۨۘۥ۬ۗۗۥۘ۟ۦ۬ۥۚۥۘ۟ۤۡۘۥۚۜۘ۫ۤۦۘۨۢۢۘ۫ۗۙ۫ۨۥ۫ۙۧۛۙۛۤۛ";
                        sb = new StringBuilder();
                        break;
                    case 1775934438:
                        String str7 = "۬۠ۚۙۚ۬ۨۦۧۛۦۖۨ۟ۖۦۢۥۘۙۜۦۘۖۨ۠ۛۥۙۜ۟ۗۡۧ۟ۢۨۘ";
                        while (true) {
                            switch (str7.hashCode() ^ (-1798629451)) {
                                case -1161042970:
                                    str7 = "ۘۘ۫ۛ۫ۛۛۦۥۘ۬ۛۦۙ۬ۜۘۦۧۚۙۨۘ۠ۜۚۤۙۙۦۡۚۨ۬ۗۤ۠ۖ۫۠ۤۘۗۖۘ۠ۜ۫ۛ۫۟ۙ۫۠ۧۢۧ";
                                    break;
                                case -786527341:
                                    str = "ۧۛۡۘۧۜۛۦۘۡ۫ۨ۠۬ۡۨۡ۠ۢ۠ۙۘۘۗۙ۫۠ۦ۠۟۬۬۟ۨۧۘۗۖۨۛۦۤ";
                                    continue;
                                case -739769339:
                                    String str8 = "ۦۤۢۡۛۡۘۧۖۧۘ۟ۢۚ۟ۧۨۗۜۥۘۜۦۦۤ۬۫۫ۚ۟ۥۙ۫";
                                    while (true) {
                                        switch (str8.hashCode() ^ (-348204254)) {
                                            case -1045777663:
                                                str8 = "ۚۚۤۢ۬ۚۙۤ۟ۗۘۧ۟۬ۥۘ۠ۘۤ۠ۨۤۚۚۛۡۛۘۘۤۢ۬ۛۨۨۛ۫ۢ۬ۡۘۗۙۘ";
                                                break;
                                            case 962015695:
                                                str7 = "ۜۢۘۥۚۨۘۖ۬ۜۚۙۡۘۢۡۨۨۚ۫ۙۡۜۘۤ۟ۙ۫ۤ۟ۚۦۡ۫ۙۜ۬ۨۦ۬ۦۤ۠ۜۨ۠ۨۘۦۦۖۖ۠ۚۖۨۘ";
                                                break;
                                            case 1657232134:
                                                str8 = TextUtils.isEmpty(str3) ? "ۥ۟۫۫۫ۨۚۜۡۙۧۢۚۤۜۗۙ۫ۡۥۡۘ۟ۤۥۢۧۨۘۢۚۛۦۚۦ۟۟ۖۨۡۤ۟ۗۢۘۘۦۧۧۜۚۦۘ۟۬ۗ" : "ۢۚۧۨۜۤۘ۟ۦۖۡ۫ۦ۬ۗۧ۟ۜۛۧۦ۟ۨۦۥۙۚۙۗ۫۟ۖۗۖۜۘۘۜۗۖۤۧۤ";
                                                break;
                                            case 1919657075:
                                                str7 = "ۡۛۖۘۛۨۚۢ۫ۨۘۖ۟ۦۘ۟ۤ۠ۖۛۨ۫ۚۦۘ۠ۡۜۘۥۥۡۘ۫ۚۡۢۧ۫ۡۢ۬ۡۚۖۘۦۙۘۘۚۚۛ۫۫۫";
                                                break;
                                        }
                                    }
                                    break;
                                case 2131355707:
                                    str = "ۦۜۜۘۗ۟ۨۡ۫ۨۘۙۢۖۘۚۙۤۧۛۚۥۛۥۘۛۤۖۘۛۦۥۘۙۘۖۢ۬ۦۙ۬ۗ";
                                    continue;
                            }
                        }
                        break;
                    case 1919353147:
                        str = "ۙ۫ۘۘۤۨ۟ۜۘۖۨۙۦۘۡۡ۟۫ۨۖۘۙۢۜۜۖۧۘ۠۫ۖۗۖۧۙ۫ۥۘۤ۟ۦۘ";
                        string2 = this.OooO00o.getString(R.string.unbind_reg_code_suc);
                        break;
                    case 1961283766:
                        str = "۫۬ۙ۬۠ۥۥ۠ۛۧ۟۫ۡۧۙۨ۟ۖۡۧۥۛۜۦۤۤۘۨۢۨۘۦۘۦۘۚۨۖۢۚۛۛۨۘ";
                        break;
                }
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(@Nullable RegCodeInfoResponse regCodeInfoResponse) {
            String str = "ۖۡۚۥۙۜۘۘۡۦۘۖۜ۫ۗۜۧۘۡۥۘ۫ۦۡ۟ۚۢۖۦۘۛۛۥ";
            while (true) {
                switch ((((str.hashCode() ^ InterfaceC2174a.f13811O) ^ 423) ^ 985) ^ (-1239587239)) {
                    case -811917205:
                        str = "۫ۥۛۤۨۚۖ۬ۤۜۧۧۜۦ۟ۗ۟ۦۗۢۖۘۖۡۧۘۜۚۗ۟ۧۘۘ";
                        break;
                    case -324379402:
                        return;
                    case -23932502:
                        str = "ۚۛ۠۫ۥۖۖۚۜۘۖ۫ۘۘۗۚۗ۫۫ۥۦۗۡۘۛۧۚۛ۬ۜۘۙ۠ۤۥ۟ۦۘۘ۟ۗۚۤۚۗۜۖ۬ۢ۬ۦۘ";
                        break;
                    case 689977591:
                        OooO00o(regCodeInfoResponse);
                        str = "۬ۨۨۤ۟۬ۛ۫ۙۦۙۦۘۧ۟ۡۡ۬ۨ۬ۢۤ۬ۜۘ۬ۗۘۘۤۙۤ";
                        break;
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public final UnbindRegistrationCodeActivity OoooOoO;

        public OooO0O0(UnbindRegistrationCodeActivity unbindRegistrationCodeActivity) {
            this.OoooOoO = unbindRegistrationCodeActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۚ۬ۛۖۚۖۘۘ۬ۦ۫ۦۤۚۗۜۛۜۙۛۦۢۙۥۘۜۤ۟ۨۙۤۖۨ۫۟ۤۢ۫ۨۧۢۦۜۤۖۜۘۖۘۥۘۛۨۨۚ۠ۖۘ";
            while (true) {
                switch ((((str.hashCode() ^ 732) ^ 689) ^ 324) ^ 1731786824) {
                    case -31594808:
                        return;
                    case 812593695:
                        str = "ۨۗۜۚۨۧۙۡۖۘۤۡ۬ۗۛۖ۫۟۟۬۫ۛۦۢۨۘۜۚ۬ۦۦۜ";
                        break;
                    case 1958653605:
                        UnbindRegistrationCodeActivity.OooOO0(this.OoooOoO, false);
                        str = "ۚ۟ۜۘۤۗۤۢۧۡ۟ۦۦۘ۠۠ۢۥ۬ۜ۠ۛ۫ۛۥ۬۟ۡۘۛ۠ۚ";
                        break;
                }
            }
        }
    }

    public class OooO0OO implements TitleView.OooO0O0 {
        public final UnbindRegistrationCodeActivity OooO00o;

        private OooO0OO(UnbindRegistrationCodeActivity unbindRegistrationCodeActivity) {
            this.OooO00o = unbindRegistrationCodeActivity;
        }

        public /* synthetic */ OooO0OO(UnbindRegistrationCodeActivity unbindRegistrationCodeActivity, OooO00o oooO00o) {
            this(unbindRegistrationCodeActivity);
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "ۨۡۘۚۙ۠۠ۡۛ۬ۙۤ۫ۘ۠ۦۦۘۛۨ۫ۛۨۢۨۢۥۘ۟۠۫۫۠ۙۜ۬ۖۘۨۗۧۨۨۜۘ";
            while (true) {
                switch ((((str.hashCode() ^ 698) ^ 998) ^ 898) ^ 1530855080) {
                    case -1711716788:
                        str = "ۘۙ۬ۙۤۚۦ۬ۡۘۘۢۥۘ۟۠ۨۘۖۨۥۘۖ۫۫ۚۛ۫ۘۜۥۘۘۘۘۥ۟ۢۗ۠ۥۘۡۢۥ۫ۗ۫ۘۧۜۤۘۜۘۡۘۘۜۜ";
                        break;
                    case -1591434570:
                        str = "ۙۢۡ۟ۘۘۘۙ۬ۗ۟ۡۚۚۤۜ۬ۖۢۢۜۛۥۡۗ۬ۢۖۥۤ۟ۡۛۥ۠";
                        break;
                    case -1574216708:
                        this.OooO00o.finish();
                        str = "۟ۦۢۤۖۨ۬ۡ۫ۥۛۧۛۛۡۘۙۧۘۛۤۙۘۜۦ۠۬ۗۥۧۧۥۧۘۤۦۤۦۙۛۚۘۢۗۢۢۦ۠۠";
                        break;
                    case -1520942922:
                        return;
                }
            }
        }
    }

    public static /* synthetic */ boolean OooOO0(UnbindRegistrationCodeActivity unbindRegistrationCodeActivity, boolean z) {
        String str = "ۚۖۖۘۢۤۚۚۦۡۡۨۘۛ۬ۛۡۢۜۘۨۘۘۘۥۖۤۡ۟ۡۛۖ۬ۙۚۚۦۜۛ";
        while (true) {
            switch ((((str.hashCode() ^ 358) ^ 156) ^ 942) ^ 1161234801) {
                case -1567012448:
                    unbindRegistrationCodeActivity.OoooooO = z;
                    str = "ۚۖۜۚ۫ۖۘۦۜ۠ۖۥۘ۫ۗ۠ۦ۫۫ۡۦۗۗۖۢ۟ۜۘۗۛ۫ۙ۟ۦۧۥۡۘ۠ۢ۫ۛۡۥۘ۫ۙۖۡۘۥۥۥ۠۠۠۟";
                    break;
                case -1391687911:
                    str = "ۜۥۨۘۜۢۨۗۢۙۡ۟ۜۦۛ۫ۘ۠ۙۢۡۥۘۧۙۡۤۛۦۘۘۧۦ";
                    break;
                case 870401334:
                    return z;
                case 1513565577:
                    str = "۫ۙۖۘۢۥۗۢۧۧ۟ۧ۠۠ۛ۠ۙۦۥۘۖۛۙ۫ۚۘۘۡۖۘ۫ۜ";
                    break;
            }
        }
    }

    private void OooOO0O() {
        String str = "ۜۧۤۙ۟۬۫ۙۥۘ۬ۘۢۦ۫ۗ۫ۘۧ۠ۡۘ۟ۡۡ۫ۤ۠۫ۦۨۘ۫ۗۜۥۜۨۗۜۢۙ۬ۜۘ";
        int iIndexOf = 0;
        SpannableString spannableString = null;
        String str2 = null;
        String strValueOf = null;
        while (true) {
            switch ((((str.hashCode() ^ 484) ^ 759) ^ C4095le.o0000O) ^ 1561587810) {
                case -1863657211:
                    String str3 = "ۜۢۢۖ۠ۛۜۗۘۘۖۖۜۘۨۜۢۖۖۘۘۤۜۥۖۗۦۖۦۖۥۧۘۘۢ۠ۡۖۖۙ۫ۚ۫ۢۗ۬ۖ۬ۡۦۥۤۚۖ۠ۖۦۘۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 915378142) {
                            case -229508983:
                                str = "۫ۗۤۙۢۥۢ۬ۤ۫ۨ۫ۘ۬ۘۘۜۧۘۘۜ۬۠ۧۜۢۚۜۤۡۤۨۚۘ۠۟ۦۖۨۙۗۨۙ۟ۖۖۡۢۙۛۦ۠۫ۚۡۘۘ";
                                continue;
                            case 1020204293:
                                String str4 = "۟ۛۘۘۡۦ۬۟ۤۘۨۧۧ۟ۦۨۗۙۙ۫ۡۢۜۤۡ۬۫ۥۨ۠ۙۙۤۡ۟ۘۦۘۥۜۖۘۚۚۧ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-1748245806)) {
                                        case -1712845204:
                                            str3 = "ۗۛۤۘۚۗۧۦۘ۟ۖۤۧۙۧۢۜۚۚۗۦۛۗۢۧ۫ۧ۫ۡ۠ۡ۟ۘۥۘۨۘۗۤۙ۫۟ۖۘۛ۫ۜ۫ۨۙ";
                                            break;
                                        case -556213603:
                                            str3 = "ۛۚۙۘۡۧۘۧۚۨۘۜۚۡۘۜۘۛۢۥۘ۫۠ۦۘۗۡۡۘۛ۬ۛۛ۫ۡۘۡۢۙۚۧ۫ۥۥۘ۟۫";
                                            break;
                                        case -489259975:
                                            str4 = !TextUtils.isEmpty(this.OooooOo) ? "ۚۙۘۦۨۤۘۤۗۖۚ۟ۥۘۜۘۨۦۤ۠ۦۘۥ۫ۚۥۜۢۦ۫ۦۘ۠۬ۖۢ۟ۘ۠ۡۢۧۢۥۚ۠۬ۧ۟ۥۘ" : "ۙۤۡۚۥۙۦ۠ۡۘۘۚۘۘۡۙۡۢۤۦ۫ۛۦ۠ۥۘۛۢۤۘۚۥۘ";
                                            break;
                                        case 712982503:
                                            str4 = "ۖۢۨۤۤۢۘۜۤۚۙۢۖۢۥ۟۫ۗۧۖ۟ۗۛۢۛۤۙۢۗۥۘۗ۬ۢۗۗۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1111620881:
                                str = "ۜۘۧۘۗۡۡۘۛۘۜ۫ۥۛۡۖۧۙ۬ۜۗۜۚۥۚۘۧۨۘ۬ۦۨۘ۫۟ۡۡۦۡۦۖۡ۠ۤۖۘۘ۟ۖۘۖۨۤۚۘۖۘ۫۟ۥ";
                                continue;
                            case 2018731955:
                                str3 = "ۘۡۢۙۥۥۘ۠ۖۧۘۜۨۥۘۗ۟ۛۥۘۖۢۨۧۨۗۖۦ۬۬ۨۜۜۘۡۤ۠۠ۚۘۘۚۦۙ۫ۢۦۧۦۚۨۛۡۜۚۢۨۤۥ";
                                break;
                        }
                    }
                    break;
                case -1588600243:
                    this.Oooooo.setText(this.OooooOo);
                    str = "۫ۗۤۙۢۥۢ۬ۤ۫ۨ۫ۘ۬ۘۘۜۧۘۘۜ۬۠ۧۜۢۚۜۤۡۤۨۚۘ۠۟ۦۖۨۙۗۨۙ۟ۖۖۡۢۙۛۦ۠۫ۚۡۘۘ";
                    break;
                case -1462888487:
                    iIndexOf = str2.indexOf(strValueOf);
                    str = "ۛ۫ۨۜۖۖۚۙۨۜۘۚۨۡۨۙۢۖۘۖۙۥۘۨۘۧۦۘۤۙۙ۫ۘۘۤۙ۫";
                    break;
                case -1361069402:
                    this.o0OoOo0.setOnClickListener(this);
                    str = "ۤۙۡۘۜۚۛۧۙۡۘۤۗۢۚۥۨۖ۟ۨ۫ۡۗۘۜۧۨۡۨۘ۬۟ۖۧۙۤ۠ۡ";
                    break;
                case -1197555496:
                    str = "ۗۢ۟۬۫۟ۦ۠ۢۨۖۧۥۛۡ۟ۙۨۢۡۖۘۧۘۛ۫ۡۨ۠ۜۧۘۖ۠ۨۘۡۡۜ";
                    break;
                case -986790553:
                    spannableString = new SpannableString(str2);
                    str = "۠ۥۚ۬ۛۦۦۥۖۤۥۛۢۡ۫ۗۜۜۘۢۨۧ۬ۡ۟۟ۜۖۘۘۤۥۘۦ۬ۙۘ۬ۖ۫ۖۘۖ۫۠ۛۜۛۙ۫۠";
                    break;
                case -719789664:
                    str = "ۨۤۘ۬ۗ۟ۦۦ۟ۛۤۘۢۜۢ۬ۘ۟ۛۥۦۚۖۘۜۧۘۢۜۛۘۥ۫ۖۘ";
                    strValueOf = String.valueOf(C4125m7.OooO0o0().OooOOO0);
                    break;
                case -457070864:
                    str = "ۜ۬ۧۙۘۜۘۚۖ۫ۜۧ۬ۤ۟ۚ۠ۛۗۚۢ۫ۨۛۨۥۧۡۘ۫ۖۦۖۚۥۤۘ۠ۙۦۛۡ۫۬";
                    str2 = String.format(getString(R.string.unbind_app_buckle_time), strValueOf);
                    break;
                case -362415331:
                    this.Ooooooo.setText(spannableString);
                    str = "ۧ۠ۨۡۚۗۥۥۘۥۗ۬۠ۨۜۘۡۦۘۙۙۤۨۛۛۨۧۡۘ۟ۦۙۘۡۤۙۦۘۜۦۜۘۜۦ۟۟ۘۢۘۛ۬ۗ۬ۜ۟ۦۘ";
                    break;
                case -93869445:
                    this.ooOO.setOnClickListener(this);
                    str = "ۢۙۦۗۨۙۖ۠۟ۙۡۨۘۦۤۥۘۜۙ۟ۘۚۥۖۗۘۧ۠ۗ۠ۜۘۚۥۡۘۨۘۦۥۛۨۜۙۜۘۥۘۜۘۤۥۥ";
                    break;
                case 253521972:
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4948")), iIndexOf, strValueOf.length() + iIndexOf + 2, 17);
                    str = "ۛۖۖۖۖۖۘ۫ۙۡۘ۬ۥۗۙ۠ۤ۠۬ۥۢ۟۫۠ۜۦۙۗۛۨۢۗ";
                    break;
                case 1882354150:
                    return;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public void OooO() {
        String str = "ۚ۫۟۠ۖ۟ۚ۠ۜ۟۟۬۠ۗۥۘ۫۠ۖۘۨ۠ۚ۫۫ۧۦۧۘۘۜۗۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 94) ^ 954) ^ 780) ^ (-505149383)) {
                case -890011916:
                    ((C4239pa) this.OooooO0).OooOo00().observe(this, new OooO00o(this));
                    str = "۬۟ۚۨ۟ۙ۟ۤۚۚۨ۟ۢ۬ۤۦۗۛۚۘۛۜ۬ۜۜۧۘۜۘۨۗۛۤۨۦۘۧۧۗۧ۫ۘۘۖ۟۟ۨۤۤۚۙۨۘۜۗ۠";
                    break;
                case 207389851:
                    str = "ۛ۠ۥۚۧ۠ۥۡۜۥۜۚۛۘۡۥۛۘۘۥ۟ۚۗۗۢۤۨۢۨۖۜۘۡۙۚۨۦۢۦۤۨۘ۟ۛۧۚۙ۟ۧۜۡ";
                    break;
                case 566343017:
                    return;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public int OooO0oO() {
        String str = "۬۠۫۫ۦۜۘ۫۠ۡ۬۟۫ۧۛۨۨ۬ۦۤۙۨۘ۫ۨۥۢۚۜ۠ۥۡۚۛ۠ۨۥۡۖۤۜۥۘۙ۟ۜۘۗۚۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_FW_BG_VALUE) ^ 697) ^ C4589yr.OooO0O0) ^ 772323478) {
                case -433381423:
                    return R.layout.activity_unregister_code;
                case 500786554:
                    str = "۟۠ۜ۟۠ۨ۠ۥۙۜۖۥۘۥۤۨ۫ۖۘۜۚۥۗۥۘ۫ۢۜۘ۫ۖۚۖۙۡۘۛۘۖۘۢۨۧۘۜۖۧ۫ۖۧ۫۠ۚۤۜ۫ۧۥۘۘ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public Class<C4239pa> OooO0oo() {
        String str = "۫۟ۙۡۙۦ۠۫۠۫۫ۜۦۡۗ۟۟ۖۗۤۤ۫ۦۧۘ۠ۥۧۙۛۙۖۖۧ۟ۖۗۘ۫ۥۘۙۦۥۢۖۗ۫ۜۦۧۙ۫ۜۦۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 141) ^ 898) ^ C4095le.o0000O00) ^ (-1951234866)) {
                case -2092154656:
                    return C4239pa.class;
                case 1957194449:
                    str = "ۖۚۤۚۡۚۨۨۥۗ۟ۘۘۗۗۖۧۖۦۘۛۘۦۘ۠ۤۨ۬ۦۨۘۡۧۙۢۜۜۘۦۗ۫";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public void initView() {
        String str = "ۗۥ۬ۗۡۘۛۛۤ۬ۜۘۗ۫ۤ۠ۥ۬ۦ۫۠ۤۨۖۘ۬ۖۨۜۡۛ";
        TitleView titleView = null;
        while (true) {
            switch ((((str.hashCode() ^ 523) ^ 337) ^ 468) ^ (-410791689)) {
                case -1692804066:
                    return;
                case -469831655:
                    titleView.setTitleText(getString(R.string.register_code_unbind));
                    str = "۬ۛۖۘۨ۫ۖۘۗۦۢۥ۟ۦۚۢۚۤۜۦۘۦ۟ۧۥ۟ۖۗۦۦۚۢۥۗۦۘ۬ۗۛ";
                    break;
                case -407106208:
                    titleView.setleftImage(R.drawable.ic_back);
                    str = "ۜۗۨ۟ۢۖۘۗۚۧۙ۟ۙۥۗ۠ۜۦۧۘ۬ۚۢۗۙۡۘۗۨۘۤۦۜۙۨۖۘۚۙۤ";
                    break;
                case -158869828:
                    str = "ۘۗۚۘۤۘۨۤۢۥۤۨۘ۬ۛۚۚۛۥۖۖۜۘۚۨۤۜ۠ۚۤۡ۠۟ۦۧۘ۟ۙۜ";
                    titleView = (TitleView) findViewById(R.id.id_title);
                    break;
                case -48151227:
                    OooOO0O();
                    str = "ۤ۠ۥۘۡۦۜۗۥۘۡ۟۟ۘۦۘۗۢۥۗۖۘۘۙۧۖۘۘۤۖۘۘۥۡۨۨۤ۟ۗۘۘۨۡۤۚۤۗۖۘۚۡۜۥۘۗۨۦۢۘۢ";
                    break;
                case 404893279:
                    this.Ooooooo = (TextView) findViewById(R.id.tv_buckle_time);
                    str = "ۚ۬ۖۛۡۦۘۨۛۨۘ۫ۛۧ۫ۤ۫ۧۜۢۦۧۥۡ۟ۦۘ۠ۖ۟ۧۛۛۗۚۛۛۘ۫ۢۚۖۦ۟ۧۜ۫ۡۛۨۘ";
                    break;
                case 412180669:
                    this.Oooooo = (EditText) findViewById(R.id.register_number);
                    str = "ۗۙۖ۬ۢۖۘۛۖۨۘۚۤۛۜ۬ۧۚۦ۫ۧۙۚۗۡۜۗ۫ۜ۬ۖ۟ۨۘۡ۬ۜۚۤۥ۬ۡۗ۬ۥۙۢۗۜۘۥۦۥۙۡۜۘ";
                    break;
                case 1020828529:
                    titleView.setVisibilityRightImage(4);
                    str = "ۖۛۘۘۚۗۨۘۛۤ۬۠ۡۤۨۗۖۤۚ۟ۤۘۤ۫ۨۙۦۘۗۗۙۖ۠ۧۥ۟۠ۛۚۡۘۛ۫ۢۨۤۡ";
                    break;
                case 1175581095:
                    this.o0OoOo0 = (Button) findViewById(R.id.btn_unbind);
                    str = "ۗۚۡ۟ۙ۠ۖۥۚۗۙۦۥۖۖۘۧۗۙ۬ۤۧۘۘۜۚۡۦ۠ۚۥۘ۬ۦۜۡۧۥۖۡۥۜۜۖۘ۟ۤۘۘۥۚ";
                    break;
                case 1488347877:
                    titleView.setOnLeftImageViewListener(new OooO0OO(this, null));
                    str = "ۤۧ۠ۛ۬۫ۧۦۨۘۖۗ۫ۜۙۘۘ۟۫ۘۛۜۨۦۜۧۥۤۘۘ۫ۚۖۘۛۚۛۙ۬";
                    break;
                case 1565621174:
                    this.ooOO = (Button) findViewById(R.id.btn_sweep_unbind);
                    str = "۠ۢۖۘۨۗۦ۠ۖۥۘۜۚۖۖۚۦۜ۫ۤ۬ۚۡۦۧۘۘۤۨۡۚ۫ۦۜۡۤۙۙۥۤۚۡۘۚۜ۟ۥۦۦۙۤۙۜۧۙۧۛۨۘ";
                    break;
                case 1843133079:
                    str = "۬ۦۜۥۥۧ۟ۡ۠ۨۨۜۘ۬۟ۚۖ۟ۜۘۢۙۗ۠ۗۜۧۖۘۛ۫ۥۘۗ۟ۦۢ۠ۖ۬ۚۦۘۧ۬ۤۨۥۘۘۘۧۘۦۡۖۥۤۖۘ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str = "ۖۙۢۥ۫ۖ۠ۤۜۥۧۢۗۦۧۘۡۖۖۘ۬ۖۚۛ۫ۚ۫ۡ۬ۤۛۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 594) ^ UiMessage.CommandToUi.Command_Type.SET_FW_BUTTON_VALUE) ^ 953) ^ (-1529795557)) {
                case -2035486586:
                    return;
                case -1159889006:
                    str = "ۡۘۖۙۥۧۘۗ۬۫ۚۖ۬۠ۧ۫۟ۡۥۘۥۖۜۡۡۜۘۢۢ۫ۧۦۖۖۜۖۜۛۙ";
                    break;
                case -1102130976:
                    super.onActivityResult(i, i2, intent);
                    str = "ۘۦۦۘۘۡ۬ۡۨۜۜ۫ۨۗ۠۬۫ۖۦۘۚۥۧۘۤ۫ۜۘۚۜۚۧ۫ۦۘۖۨ۟ۢ۫ۡ";
                    break;
                case -824153768:
                    str = "ۗۙۖۘ۠ۜۥۘۤۘۗۘۦۖ۬ۜۖۘۜۗۨۢ۟ۘۖۛۨۖۘۖۘ۠۬۠ۚۗۖۨۘۖۘۢۖۗ۬ۖۘۖۨ۫ۘۡ۫ۥۧ۬ۛۨ";
                    break;
                case 1717589114:
                    str = "۫ۗۡۨۗۥۘ۫ۤۥۘ۠ۛۦۘۡۖۚۗۨۘۛۢۖۘ۠ۖۘۘۡۦۥۡۡۤۡۜۛۗ۟ۢۤۘۢ۫ۥۚۘۘۦۜ۫ۥۘ";
                    break;
                case 1758008061:
                    str = "ۥۙ۬۫ۥۗۚۚ۟ۗۜۥۖۛۦۘۥۤۡۘۥۗۡۘۦۢۡۚۜۡۘۗۚۤۙۢۘۘۡۨۨۘ";
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = "۠۬ۡ۟۟ۦۨ۠ۘۚ۬ۘۘۖۗۥۘۘ۬ۛ۟ۤۥۘۖۡۥۘۛ۟ۨۘۦ۫ۜۙۗۖ۫ۨۤۤۨ۬ۨۨۘۛۙۚ۟ۛۜۘ";
        String strTrim = null;
        while (true) {
            switch ((((str.hashCode() ^ 88) ^ 340) ^ UiMessage.CommandToUi.Command_Type.SET_FW_IMAGE_VIEW_VALUE) ^ 400399044) {
                case -1364613512:
                case -1154610709:
                case -772705585:
                case 1272751024:
                    return;
                case -1218965829:
                    C3753c5.OooO0O0(AppContext.OooO00o(), R.string.input_register_number);
                    str = "ۨۗۜۘ۠ۤۨۦ۬ۛ۠ۘۢ۠ۡۦۘۙۦۢۘۦۢۙ۬۫۬ۗۚۤۨۨ۫ۖۛۦۡ";
                    break;
                case -1110405761:
                    String str2 = "ۛ۟ۥۦۖۘۛۚۨ۟ۧۤۤۢۗۖ۫ۜۘۖۡ۟۟ۛۥۜۛۨۧ۟ۧ";
                    while (true) {
                        switch (str2.hashCode() ^ (-425232517)) {
                            case -1541062832:
                                String str3 = "ۨۙۢۢ۬۟ۜۗۘۥۙۨۦۥۤۜۛۗۥۘۘۚ۠ۖۘۚ۫ۚۛۗۥۘۡۨۘۧ۬";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1798374752)) {
                                        case -1470521207:
                                            str2 = "ۗ۠ۜۘۧۚۗۡ۬ۦۖ۟ۖ۠ۗۥۘ۟ۛۢۘۘۤۧۖۢۦۘ۟ۧۨۘۚۥۥۗۧۘۘ";
                                            break;
                                        case -750491207:
                                            str2 = "ۤۛۦۘۦۚۢۛۖۥۘۤۦ۟ۙۧۚۦۢۡۘ۫۟ۥۘۗۗ۬ۘ۬ۡۘۙ۟ۤۡۛۤۖۗۦ۠۠ۘۗۗ";
                                            break;
                                        case 797314059:
                                            str3 = "ۜۙۖۙۢۦۘۧۧ۫ۦۤۢۧۨۘۖۖۡۘ۟۟ۜۖ۫ۤۗۘۜۘۤۚۨۥۤۙۗ۟۬۟ۙۢۖۙۙ";
                                            break;
                                        case 941359165:
                                            str3 = !C4381t4.OooOO0(view.getContext()) ? "ۗۜۘۘ۠ۛۚۢۖ۠ۛ۠۫۟ۧۛۧ۬ۘۘۡۖۖۗ۬۠ۥۜۗۧ۬ۡ۬ۘۧ۬ۙۦ۠ۙۖۜ۬ۢۚۚۚ۟ۧۡۘۨۜۡۘ۠ۤ" : "ۜۛۧۦۘۘۘ۟ۗۧۥۢۘۘۚ۬ۜۧۤ۬ۘ۫۬ۗۨۤۗ۠ۘۙۦۧۘۥۛۘ۬ۛۜۜۢۖۡۨۙ";
                                            break;
                                    }
                                }
                                break;
                            case -718646903:
                                str = "ۛ۫۫ۘۤۥۡۛۗۦ۫۫ۗ۟ۦۘۡۢۦۘۨۦۗۛۗۡۜۘ۫ۦ۠ۚۛۙۚۗ۬ۤۦۜۖۛۖۘۘۙۘۗۜ۠ۜۜۡۘۖ۫۫";
                                continue;
                            case -343414851:
                                str = "۠ۚۦۘۙۥ۬ۤۢ۠۟ۧۙۙۡۤۤۤۦۘۘۖۥ۫۫ۛۤۧۥۡۘۡۘۧۖۛۦۘ";
                                continue;
                            case 934523297:
                                str2 = "ۛۖۦۚۢۨۗۛ۫ۤۢۜۖۚۥۘ۟۫۟ۖۧۦۘۚۧۦۘ۠ۧۗۢۘۧۘۦۜۙۙۖۛۧ۬ۥۛۡۘ";
                                break;
                        }
                    }
                    break;
                case -711811861:
                    str = "ۢۧ۬ۙۨۙۚۖۙۤۜ۬ۢ۫ۡۘۧ۬ۦۘۥ۫ۚۡۛ۫ۢۘۙۙۢۘۦۧ۟ۡۖۥۘ";
                    break;
                case -700712220:
                    ((C4239pa) this.OooooO0).OooOo0(this.Oooooo0);
                    str = "ۢۧۛۗ۠ۘۨ۟۠۬ۦۦۘۨۚۧۛۦۤۢ۬ۖۘۙۙ۬ۥۜۛۦۘۖ۠ۨۘۦۥۜۘ۠۫۟ۗۢۦۘ";
                    break;
                case -374712771:
                    str = "۫ۘۗ۟ۧۦۛۛۡۢۨۘۛۤۦۘ۬ۜ۠ۛۚۜۘۤ۟ۗ۫ۦۧ۟۠ۨ۟ۛۚ۬ۙۧۙۤۥۘۛۥ۠ۦۛ۟ۜۖ۬";
                    break;
                case -281119873:
                    this.OooooOO.postDelayed(new OooO0O0(this), C2187m.f13871ag);
                    str = "ۨۦ۟ۜۙۡۘۗ۟ۨۘۡۛۘۘۧ۬۬ۖۙۗۙۡۜۙۦۙۥۛۥ۠ۙۚۖۡ۬ۦۨۡۖۘۛ۫ۗ";
                    break;
                case 178241865:
                    String str4 = "ۨۘۡۘۥ۬ۘۘ۟ۘۡۘۤ۠۠ۖۘ۟ۦۙ۟ۦۡۡۘۚۖۖۘۜۗۧۨۧۗۦۤۥۘۖۨ۬ۜۢۢۖۙ۠";
                    while (true) {
                        switch (str4.hashCode() ^ 1219923742) {
                            case -1323675321:
                                String str5 = "ۢۦۡۘ۟ۧ۫ۡۙۢۦۘۘ۬ۥۘۗۜۜۘۧۜۧۘۘۖۗۨۢۨۘۧۦۧۘۚۛۡۘۘ۟ۥۘۦۗۛ۟ۡۜۛ۠ۦ۠ۤۨۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1203052102)) {
                                        case -355688717:
                                            str4 = "ۚ۬ۧ۬ۢۦۘۡ۫ۙ۟ۡۡۜۥۘۚ۠۟ۖۗۛ۠ۜۜۗ۟ۧ۠ۜۥۨۙ۫ۜ۠ۛۡۢۘۘۙۚۦۘۥۙۤ۟ۨۧ۫ۨۦۚۥۥ";
                                            break;
                                        case 298858934:
                                            str5 = "ۗۗ۬ۨ۬ۢۧۡۘۡۚۨۚۖۢۤۧۥۘۚۘۦۘ۫ۤ۫ۘۦۨۘۧ۬۟۫ۧۧۖۡۡۘۜۙ۫ۥۤۜۘۤۗۙ۫ۘۖۘ";
                                            break;
                                        case 725033052:
                                            str4 = "ۧۗۜۘۢۤۥۘۛۥۜۡۛۚۛۡۧۘۘۡۜۘۙۥۢۤ۟ۙۤۦۥۘۗ۠ۥۤۗۖۘ۟ۤۙۦۘۥۤۚۥۚۢۦۘ۠ۨۤ";
                                            break;
                                        case 1575754424:
                                            str5 = view.getId() != R.id.btn_unbind ? "ۙۧ۬۫ۘۨۘۦۡۡۘ۟ۘۥۢۥۦۙ۠ۘۚ۬ۛۤۥۡۘۢۨۘۘۢۤۨۘ" : "ۛۧۡۘ۟ۘۘۘۢۚۚ۟ۙۗۛۦۧۜۤۧ۫۬ۗۖۥۡۖۡۙۗۤۘۛۚۨۨۛ";
                                            break;
                                    }
                                }
                                break;
                            case -859768001:
                                str = "ۘۢ۬ۤۚۨۘۗۧۧۤۢۥۘۢ۠ۜۨۥۨ۫۠ۧۚۜ۠ۤ۫ۡۘ۬ۦۗۤ۫ۛۢۧۢ";
                                continue;
                            case -160827895:
                                str = "ۥۛۧۢۧۦۘۨۦۖۘۤۥ۠ۥۜۡۙۛۚۛۙۘۘۜۘۖۘۧۤۖۘۗۖۖۘۦۖۧۘ۬ۤۖۘ";
                                continue;
                            case 207579813:
                                str4 = "۬ۡۨۘ۠ۘۛۢۘۦۘۥۡ۫۠ۙۥۤۘۘ۬ۦۗۡۦۡۘۥۘۧۘۡۜۨۢۤۨ۫ۖۘۜ۬ۗۖۨ";
                                break;
                        }
                    }
                    break;
                case 275417893:
                    this.OoooooO = true;
                    str = "ۨۖۨۙۤۢۦ۫۫ۡۨۜۘۖ۬ۦ۠ۤۡۘ۠ۧۘۘ۫۟ۜۛۜ۫ۖۘۖۘۨۤۢۡ۫۟ۘۜۖۘۛۚ۠ۛۖۛۖۢۡ";
                    break;
                case 563914779:
                    this.Oooooo0 = strTrim;
                    str = "ۦۧۖۢۘۡۘۤۢۙ۫ۢۦۘۧۨۙۧ۬۟۠ۗۘۘ۬۬ۖۡۥۛۨۙ۬۠ۜ۠ۘۨۘۢۥۧۢۙۨ";
                    break;
                case 1067549596:
                    String str6 = "ۢۘۜ۟۬۫ۥ۬ۘۙۡۘ۫ۨۜۦ۫ۘۘۜۤ۬ۥ۠ۧ۬ۘ۬ۜۚۥۘۢۤۜۘ۬۫ۧ";
                    while (true) {
                        switch (str6.hashCode() ^ 2112606663) {
                            case -2080196503:
                                String str7 = "ۧۗۚ۫ۚۧۡۡ۠ۙۦۖۘۜۗۨ۟ۡ۠ۛۢۡۘۜ۠ۥۢۖۜۛۜ۫۫ۧۨۘۗۜ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-126476542)) {
                                        case -1979642682:
                                            str7 = this.OoooooO ? "ۙ۠۟ۤۗۥ۬ۜۘ۟ۦۦ۠ۖۚۡۘۜۛۖ۠ۜۧۧ۬ۦۛ۬ۛۖۙۨۡۙۤۦۘ" : "ۢۙۥۘۚۡۜۘۦۢ۫ۥ۠ۡۘۢۦۦۨۙۘۘ۫ۘۥۚۘۨۘۤۨۡۘۢۜۤۗۤۥۘۧۥ۟ۘۦۦۘ۠ۤۤۨۗۘۢۚۙۗۥ۬ۚ۫ۧ";
                                            break;
                                        case -292168235:
                                            str6 = "ۤۦۖۥۧۜۘۥۗۜۚۜۖ۠ۡۖ۟۬ۨۥۖۘۘۗۛ۬ۙ۬ۢۢۧۙۢۦۧۧ۫ۙۥۤ۟";
                                            break;
                                        case 301765986:
                                            str7 = "۟ۗۢ۠ۖۜۘۘۗۡ۠ۖۜۙۖۤۘ۠ۤۧۜۘۜ۫ۘۘ۫ۨ۠ۜۖۢۥۗۨۦۥ۫ۧ۫ۛۘۙۥۘ";
                                            break;
                                        case 1622493585:
                                            str6 = "ۙۛۦۘ۬ۘۜۘۦۗۧۦۖۚۖۤۗۤۖۡۘ۠ۢۡۜۥۤۙۨ۟ۖۘ۠";
                                            break;
                                    }
                                }
                                break;
                            case -346706165:
                                str6 = "۫ۚ۟ۨ۬ۧ۟ۦۘۘۤۙۦۜۦۡۦۚۚۨۖۗۤۙۦۧۖۨ۠ۡ";
                                break;
                            case -145487277:
                                str = "ۖ۬ۖۦۖۡۘ۟۬ۤۙۥۚۖۨۥۘۖۤۥ۬ۗۚۧۦۘۘ۠ۧۘۘۥۧۖۧۚ۟ۨۗ۫ۚۦ۠۠ۢ۫۠ۜ";
                                continue;
                            case 1406317899:
                                str = "ۚۘۖ۠۬ۢۗ۬ۦۘۨۡۜۘۙۤۨۘ۟ۤۥۖۘۘۘ۟۟۟ۛۧۖۖۡۨۡۜۧۘۦ۫ۤ۫۟ۖۛ۬ۢۗۗۨۘ۠ۘۜۘ";
                                continue;
                        }
                    }
                    break;
                case 1352184030:
                    str = "ۨۦ۟ۜۙۡۘۗ۟ۨۘۡۛۘۘۧ۬۬ۖۙۗۙۡۜۙۦۙۥۛۥ۠ۙۚۖۡ۬ۦۨۡۖۘۛ۫ۗ";
                    break;
                case 1399459147:
                    C3753c5.OooO0OO(AppContext.OooO00o(), AppContext.OooO00o().getResources().getString(R.string.network_off));
                    str = "ۨۘ۬ۜۜۚۜۡۙۦۨۨ۟ۢۜ۟۬ۤۤۧۚۛۥۘۖ۠ۙ۟۟ۨۘ";
                    break;
                case 1601898167:
                    this.OooooOO.removeCallbacksAndMessages(null);
                    str = "۬۫ۦۘ۫ۙ۬ۗۙۢۜۙۦۘۚ۬ۖۘۗۜۘۘۥۖۘ۫ۢۥۘۦۛۘۘۦۦۡۦۚۦۚۨۘ";
                    break;
                case 1618860993:
                    String str8 = "ۦۛۜۘ۬ۡۡۘۡۙۜ۟۠ۡۘ۟ۦۦۢۗ۫ۡۨۦۘۨۥۧ۬۠ۨۘۙۨۜۙۗۚۗ۠ۨۡۙۘۘۛۦۧۢۦ۠۠۫ۚ";
                    while (true) {
                        switch (str8.hashCode() ^ 2063505504) {
                            case -1697427909:
                                str = "ۙۥۧۘۨۘۘ۬ۥۥۘۡۦۧۘۘۨۗ۟ۨ۫ۗۢۛۨۢۛۢۖ۠ۢۛۖۘ";
                                continue;
                            case -1250460246:
                                str = "ۤ۟ۥۘۙۘۗۗۘۜۘ۠ۚۖۙۛۜۥۚۘۙۡ۬ۜۧۥۘۡۙۘۢۜۥۘ۠۠۠۟ۘۚ";
                                continue;
                            case -450579130:
                                String str9 = "ۢۚۖۤۦۖۥۖۘۘۧۦۢۛۥۡۘ۬ۢ۫ۘۦۚۛۙۗۤۨۧۥۦ۫ۨۥۛۚۜۘۛۙ۬ۜۖۤ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-1487805438)) {
                                        case -1070321332:
                                            str9 = "ۘۜۜۘۙۚۜ۬ۘۥۜۙۘۘۡ۬ۤۖ۬ۥۘۨۥۙۗۤۨۢۙۖۘۜ۠ۖۘۨۘۘۛ۬ۙ۬ۡۙۙۤ۠ۢ۫۫ۨ";
                                            break;
                                        case 1424803806:
                                            str8 = "ۧ۬ۘ۠ۦۥۘۗۖۡۤۖۢۗۘ۟ۚۦ۫ۗۦۜۖ۟ۜۛۘۧۦۜۖۘۧۘۖۡۚۘ";
                                            break;
                                        case 1948521314:
                                            str9 = TextUtils.isEmpty(strTrim) ? "ۡ۟ۡۘ۠ۛۧۜۧۨۛۦۖۜۗۡۡۡۘۙۥۘۘۥۦۜ۟ۗۢۢۧۘۥۘۜۘۛۦۘۦ۟ۤ" : "ۚ۠ۨۘ۫ۤۙ۠ۨۜۘۦۨۧۘۢۤۡ۟ۖۗۙۧۢ۬۫ۥۘۡۤۨۖۦۗ۬ۤ۫ۘۧ";
                                            break;
                                        case 1975860126:
                                            str8 = "ۛ۬ۦۛ۠ۨۘۡۢۤۗۨۖ۟ۧۨۤۥۡۘۡ۫ۡۙۙۥۘۤ۬ۘۡۙۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case 507614493:
                                str8 = "ۤۘۖۘ۠ۙۜۤۨۘۤۤ۠ۢۗ۟۟ۤۖۚ۠۬۬ۨۧ۫ۗۜۜۥۛۡۥۢۤۜۜۗۜۨ۬ۨۦۥۧۥۚۧ۟ۜۚۖۘۗ۬ۦۘ";
                                break;
                        }
                    }
                    break;
                case 2113709901:
                    strTrim = this.Oooooo.getText().toString().trim();
                    str = "ۢ۟ۘۤۘۨۡۤۨۡۧۘ۫ۖۙۛۦۡۘۚۥ۫ۘۛۖ۠ۖۧۘ۟ۡۦۘ۠ۖۘ۬۠ۡۙۥۡۘۥۙۤ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۦۥۡۛۨۛۘ۟ۢۘۦ۟ۚۢۖۘ۠ۨ۟۬ۧۥۘۛ۫۟ۙۖۖۘۜ۬ۘۘۡۡۖۡۦۢۡ۫۠ۤۤۢۡۚۖۥ۫ۨۘ";
        Handler handler = null;
        while (true) {
            switch ((((str.hashCode() ^ 692) ^ 2) ^ 256) ^ (-1306078977)) {
                case -1957460174:
                    str = "۫۫ۦ۫ۛ۬ۡ۬ۖۜۛۛ۠ۗۥۖۖ۟۟ۢۨۤۜۘۦۛۧ۬ۤۗ";
                    break;
                case -1379041331:
                    String str2 = "ۡ۟ۤۙۗۡۘۘۙۚۧۦۘۢۖۧ۬ۙۡۘۨۦۦۦ۠ۛۢۜۘۦۗۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1370123764)) {
                            case -1793710252:
                                str2 = "ۦۛۘۚۚۖۘ۫ۚۡۙ۟ۡۘۥۙۛۡۢۘۘ۠ۥۢۚ۠ۜۘۡۡۥ۬ۘ۟";
                                break;
                            case -539136122:
                                String str3 = "۬ۥۨۘ۠۟ۡۘۡ۠ۙ۬۫ۦۘۛۗۥۧۥۚۨ۬۟۫ۘۘۡۦ۬ۤ۟ۗۗۘۨۘۗۛۜۘۗۛ۠ۡۦۧۨۢۜۧۜۥ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1315339729)) {
                                        case -1471210626:
                                            str3 = "ۚۚۥۘ۫ۜۗۧۚۨ۟ۗۗۢۛۘۗۥۚۡ۬ۜۘۡ۠ۗۘ۟ۨۤۙۦۘۘ۬ۧۘۚۙ";
                                            break;
                                        case -1172185629:
                                            str2 = "۬ۡۥۘۥۗۢۙ۫ۧۡۙۖۧۘۚۚۜۖ۟ۛۨۦۥۤۙۨۘ۫ۙۖۚۦ۫ۜۖ۟ۙۛۢۡۢۗۜۜۗۙۨۡۜۜۦۘ۬ۦۘۘ";
                                            break;
                                        case 551720422:
                                            str3 = handler != null ? "ۖۖۡۖ۟ۧ۠ۦۧ۟ۘۜۘ۫ۛۡۖ۫ۖۤۤۗۘۖۨۗۥۨۥۘۘ۠ۡۧۘۡۚۚۢۖۙ۟ۤۚۥۡۖۘ۫ۙۥۘ۠ۡۥۜ۠" : "ۨۤۘۢۚۚۢۢۗ۟۟۬ۜۧ۟ۧۘۦۖۖۘۛۗ۠ۖۖ۟ۚ۬ۗ۫۫ۖۛ۟";
                                            break;
                                        case 1358680938:
                                            str2 = "ۘۗۦۘۘۖۦۡۙۦۛ۟ۤ۠ۜۧۘۗ۬ۗۗۦۗ۬ۛ۟ۨۛ۟ۚۛۚۢ۬۠۬ۖۢۚۚ۟ۙ۫ۖۘ۫۬ۗۧ۫ۢ";
                                            break;
                                    }
                                }
                                break;
                            case 1742257699:
                                str = "۫ۤۨۘۤۤ۟ۘۥۧۧۜ۠ۚ۠ۙۜۥۘۛۖۦۙۥۢۧ۫۠ۗ۠۬ۚۖ۟ۥۛۢۜۙۘۢۥۛ۠ۘۘۨ۫ۥۘ۠ۡۢۦۤۗ";
                                continue;
                            case 1891102619:
                                str = "۠ۗۦۘۧۧۚۦۡۘۗۛۖۘۤۤۛۜۚۗۡۖ۬۟ۜۘ۠۬ۢۥ۬ۦ";
                                continue;
                        }
                    }
                    break;
                case -1339766922:
                    handler = this.OooooOO;
                    str = "ۜ۬ۜۘ۫ۡۜۛۢۤۨۧۚۖۜۛۜۤۗۦۛۚۘۖۡۘ۟ۗۨ۬ۧۧ";
                    break;
                case -836389847:
                    super.onDestroy();
                    str = "ۤۥۡ۫ۙۚ۟ۡۨۘۗ۫ۦۤۛۢۜ۠ۨۘۥ۫ۡۥۙۚۥۗ۟ۧۚ۠ۙۗۜۘۢۨۨۤۘۦۘۢ۠ۤ۬۬ۖۘۖۘۡۘۡۢۢۥ۬";
                    break;
                case 937936954:
                    handler.removeCallbacksAndMessages(null);
                    str = "۠ۗۦۘۧۧۚۦۡۘۗۛۖۘۤۤۛۜۚۗۡۖ۬۟ۜۘ۠۬ۢۥ۬ۦ";
                    break;
                case 1440670836:
                    return;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "۠ۥۦ۠ۢۖۘۛۖۚۙۥۘۨۢ۫ۢۙۡ۠ۡۤۘۜۘۡۢ۫ۚۦۤۜۖۨۘ۫ۖۚۜۧۘۘۙۚۥۘۘ۟ۚۘۢۘۦۢ۬ۙ";
        while (true) {
            switch ((((str.hashCode() ^ 431) ^ 643) ^ 111) ^ 941804180) {
                case -1888303904:
                    MobclickAgent.onPause(this);
                    str = "ۛ۫ۗ۬۠ۚ۬ۥ۠۬ۥۖۘۙۘ۠ۤۛۤۦۤۖۘ۠ۘۖۦ۠ۥۛۛۛ";
                    break;
                case -1834485559:
                    str = "ۚۢۥۘ۬ۧۘ۫ۚۧۙ۬ۤۡۤۘۘ۫ۖۘ۠ۖۢۡۧۜۘۦۚۗ۟ۘۧ۬ۥۚ۟ۙۨۘۘۜۜۘۚۨۚۨۧۜ۬۬ۢ";
                    break;
                case -156630585:
                    super.onPause();
                    str = "ۦ۠ۛۥۘ۠۠ۖۗۗۖۧۖۛ۟ۙۛ۫ۘۧۦ۠۫ۤۙۢۖۦۨۢ";
                    break;
                case 227877064:
                    return;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "۟ۨۘۖۧۘۦۡۢ۫ۥۥۘۜۧۖۘۥۡ۬ۗۡۡۤۥۘۘۧۦۦۘۜۧۡۗۦۥۧۖۡۘ۠ۚۦۚۨۨۘۜۧۙۧۨۙ۬ۛۖۘۥۧ۫";
        while (true) {
            switch ((((str.hashCode() ^ 628) ^ 32) ^ 514) ^ (-1910820535)) {
                case 23295348:
                    MobclickAgent.onResume(this);
                    str = "ۘۚۥۘۤۘۤ۬ۖۘۙۥۜ۫ۛۦ۬ۖ۟۫۬ۤ۫ۚۡۥۥۧ۟ۛۦۢۗ۟۠ۗۦۘ";
                    break;
                case 358731034:
                    return;
                case 1340549235:
                    str = "ۖۤۜۚۖۧۘۥۤۛۚۛۡۘۖ۬ۧۢۢۤۨۧۛ۟ۨۘ۟ۖۦۤۦۜۘ";
                    break;
                case 1949300689:
                    super.onResume();
                    str = "ۦۡۨۥۤۖۘۜۘۡ۬ۙۨۘۢۚۚۖۙۚ۟ۙۘۘۢۜۘۘۜۨۨ۫ۥۥۜۗۤ۬ۜۘ";
                    break;
            }
        }
    }
}
