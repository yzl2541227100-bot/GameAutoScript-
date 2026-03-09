package com.cyjh.elfin.p200ui.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Observer;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.cyjh.common.base.activity.BaseModelActivity;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.MsgItem;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.http.bean.response.BaseResponseInfo;
import com.cyjh.http.bean.response.BuyRegCodeConfigInfo;
import com.cyjh.http.bean.response.QueryRegCodeInfo;
import com.cyjh.http.bean.response.RegCodeInfoResponse;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.umeng.analytics.MobclickAgent;
import com.ywfzjbcy.R;
import p285z2.C3753c5;
import p285z2.C3902g6;
import p285z2.C4125m7;
import p285z2.C4128ma;
import p285z2.C4273q7;
import p285z2.C4381t4;
import p285z2.C4460v9;
import p285z2.C4496w8;
import p285z2.C4589yr;
import p285z2.DialogC4608z9;
import p285z2.j10;

/* JADX INFO: loaded from: classes.dex */
public class BindRegisterCodeActivity extends BaseModelActivity<C4128ma> implements View.OnClickListener {
    public static final int o00oO0o = 1003;
    public static final String[] oo000o;
    private String OooooOO;
    private EditText OooooOo;
    private LinearLayout Oooooo;
    private TextView Oooooo0;
    private TextView OoooooO;
    private TextView Ooooooo;
    private View o00O0O;
    private View o00Oo0;
    private TextView o00Ooo;
    private final Handler o00o0O = new Handler();
    private boolean o00ooo;
    private TextView o0OoOo0;
    private View ooOO;

    public class OooO implements TitleView.OooO0o {
        public final BindRegisterCodeActivity OooO00o;

        public OooO(BindRegisterCodeActivity bindRegisterCodeActivity) {
            this.OooO00o = bindRegisterCodeActivity;
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0o
        public void OooO00o(View view) {
            String str = "۟ۘۡۘ۬ۨۧ۬ۜۘۖۜۘۦۗۤۡۦۘۤ۟ۗۛۘۘۛۨۙ۟۠ۦ";
            while (true) {
                switch ((((str.hashCode() ^ 364) ^ 853) ^ 725) ^ (-2109147910)) {
                    case -1367164257:
                        str = "ۛ۠ۨۘۗۜ۬ۦۖۜۗۖۚۢۜۢۡۥۜۚۤ۠ۢۧۥۘۦۛۙۨۖۦۥۘۜۘۢۖۥۘۛۤۡۘۥۙۙۧ۟ۧۥۙ۫۠۫ۨۤ۟ۛ";
                        break;
                    case -1095991269:
                        return;
                    case 1168575135:
                        C4496w8.OooOOOO(this.OooO00o, C4273q7.OooO0o0().OooO0o());
                        str = "ۜۤۡۘۡۤۛۚۨۘ۬ۡۗۧۛ۫ۘۦ۠ۦ۬ۨۘۖ۬ۘۗۙۗۥ۠ۥۢۨۘۛۗۥ۫ۤۘۘۗۨۡۘ";
                        break;
                    case 2000960363:
                        str = "ۚۡۨ۫ۚۡ۫۟ۖۘۖ۠۫ۚ۠ۨۢۦۤۧۨۥۛۘۧۘۚ۬ۨۚۙۦۡۗۜ۬ۨۤ۠۫ۘۘۙۦۘۚۢۛۙۨۘ";
                        break;
                }
            }
        }
    }

    public class OooO00o implements Observer<BaseResponseInfo> {
        public final BindRegisterCodeActivity OooO00o;

        /* JADX INFO: renamed from: com.cyjh.elfin.ui.activity.BindRegisterCodeActivity$OooO00o$OooO00o */
        public class ViewOnClickListenerC4695OooO00o implements View.OnClickListener {
            public final DialogC4608z9 OoooOoO;
            public final OooO00o OoooOoo;

            public ViewOnClickListenerC4695OooO00o(OooO00o oooO00o, DialogC4608z9 dialogC4608z9) {
                this.OoooOoo = oooO00o;
                this.OoooOoO = dialogC4608z9;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str = "ۚۡۥۘۤۜۚ۟ۖۘۘ۠ۙ۫ۘۖ۟۟ۧ۬ۨۜۨۘۤۖۘۖۨ۟ۨۥۘ";
                while (true) {
                    switch ((((str.hashCode() ^ 400) ^ 14) ^ 13) ^ 1517693691) {
                        case -235314640:
                            this.OoooOoO.dismiss();
                            str = "ۙۦۧۙۛ۠۬۫ۡۘۧۨۥۘۛۧۙ۟ۨۜۛۛۥۗ۠ۖۘ۟ۧۤۗۖۖۘۛۖۧۢۖۛۤۧۥۢ۬ۨۘ۠ۗۛ۬ۢۘۘۨ۠۬ۚۚۘ";
                            break;
                        case -5765130:
                            str = "ۥۖ۬۫ۖۥۜۨۖۘۖۤۘۘۥ۟ۥۘ۫ۜۜ۫ۢۘۥۦۡۘۦۗ۫۫ۤۘۘۦۥۥۢۛۦ۠ۥۘۛۚۘۘ۫ۚۡ۬۠ۘۘ";
                            break;
                        case 14289366:
                            return;
                        case 1073034770:
                            str = "۬ۖۡۘۦۜۢ۬ۙۧۦۗۢۘۡۘ۟۟ۖۘۥۚۤۜۧ۠ۢۨۦۦۡۢۙۥۘۡ۠ۦۡ۟۠ۨۘۨۤۡۗۗۨۖۗۜۦۥۚ";
                            break;
                    }
                }
            }
        }

        public OooO00o(BindRegisterCodeActivity bindRegisterCodeActivity) {
            this.OooO00o = bindRegisterCodeActivity;
        }

        public void OooO00o(@Nullable BaseResponseInfo baseResponseInfo) {
            String str = "۠ۛۖۘۤۖۦۥۚۜۘۘۜۡۘ۫ۤۥۘۙۡۖۨۚۘۤۗۗۡ۟ۡۙۙ۬ۥۡۙۘۤۗۢ۫ۡۘۛۨ۬ۘ۬ۤۛۨۙ";
            DialogC4608z9 dialogC4608z9 = null;
            BindRegisterCodeActivity bindRegisterCodeActivity = null;
            int i = 0;
            while (true) {
                switch ((((str.hashCode() ^ 532) ^ 578) ^ 510) ^ (-1375467855)) {
                    case -1967135204:
                        C3753c5.OooO0OO(AppContext.OooO00o(), baseResponseInfo.Message);
                        str = "۠ۘۨ۟ۙۨۘۤۦۘۚۙ۫ۦۘۚۙۧ۫ۤۥۨۗۨۗۥۚ۠ۖۜۘۚۦۨۘۡۖۘ۠۠ۜۘۧۘۜ۠۬ۚ۬ۖۘۛۛۦۘۖ۟ۤ";
                        continue;
                    case -1796523962:
                        dialogC4608z9.OooO0O0(new ViewOnClickListenerC4695OooO00o(this, dialogC4608z9));
                        str = "ۙ۫ۖۢۢۙۥۥ۟۠ۗ۬ۨۘۤۦ۟۠ۢۧۦۘ۠ۚ۫ۖۘۘۘۡۤۚۦ۟ۨۤۜۛۜۘ";
                        continue;
                    case -1411371947:
                    case 1232322895:
                    case 1855360274:
                        str = "ۛۤۙۘ۫ۢۢۗۙۗۥۧۘۨ۠ۤۛۡۜۧۥۘۥۚۜ۟ۦۛۖۖ";
                        continue;
                    case -1350528380:
                        dialogC4608z9 = new DialogC4608z9(this.OooO00o, false, baseResponseInfo.Message);
                        str = "۫ۤۡۘۥۡۚۛۤۨۘ۫ۢ۟ۛۚۥۘ۠ۧۨۜۢ۬ۘۜ۠ۛۖۦۤۧۘۗۙۢۢۘۧ";
                        continue;
                    case -1168639002:
                        String str2 = "ۨۚ۬ۘۛۦۘۨ۬ۖۦۗۡۘۚ۫ۨۘۡۦۜۖۗۖۗۚۦۘۨۙۡ۫ۦۡۛۘۧۚ۠ۦۘ";
                        while (true) {
                            switch (str2.hashCode() ^ (-563042106)) {
                                case -105683001:
                                    str = "ۨۜ۠ۖۡۥۘ۫ۦۦۚۜۘۘ۠ۜۤۡۙۧ۟ۖ۬ۤۙ۟۠ۛ۟ۘۥۘ۟ۛۙۘۡۡۢۘۦ۫ۡۨۘۙۡ۬ۡۘۛ";
                                    break;
                                case -55465717:
                                    String str3 = "ۘۤۧۙ۫ۧ۫ۗۧ۫ۙۘۘۡۜ۟ۛۤۖۘۡۗۘۨۧ۟ۨ۫ۥ۫ۦۛ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 66949066) {
                                            case -1971833002:
                                                str3 = 1201 != i ? "ۛۙۨۘ۫ۢ۟ۜۜ۠ۚۙۦ۫ۡۢۡۗ۟ۗۙۡۘۖۥۖۘۨ۠ۖۘۡۛۦۘۖۧۨۙۛۧۡۘۘۨۙ" : "۟ۢۥ۟ۛۤۡۙۨ۠ۚۙۚۢۘۘۖۤۘۘۤۛۧۙ۬۬ۗ۠ۨۦۦۡ";
                                                break;
                                            case -673949022:
                                                str2 = "ۧۡۦۢ۟ۗۙ۟ۨۘۨۡۚۜۗۡۨۢۧۨۙۛۜۨۨ۫ۗۜۛۗۦۚ۫۬۫ۥۗ۬ۗۧۡۚۙۥ۬ۤۢ۫ۡۘۘ۬ۧۖۗۤ";
                                                break;
                                            case 38147260:
                                                str2 = "ۙۖ۟ۗۜۘۤۧۗۧۜ۬۟ۘ۬ۢۙۗۗۨۘۙ۬ۡۖ۠۬ۘۘۨ";
                                                break;
                                            case 1898950492:
                                                str3 = "۫ۦۤ۫ۧۘۘۧۛۨۘۧۛ۬ۥۤۥۜ۫ۙ۬۠ۖۘۖۥۘۨۙ۠ۧۤۘۘۧ۟ۡۤۨۥۤۧۗۚۧۗۙ۟ۗۥۥۧۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 216235505:
                                    str2 = "ۘۨ۟ۤۢۚۡۦۥۦۥۦۘۥۖۤۜۥۧ۟ۖۚۡۤۙۦ۟ۢۦۚۜ";
                                    break;
                                case 415989128:
                                    break;
                            }
                        }
                        break;
                    case -1156864256:
                        String str4 = "ۦ۠ۛۜ۟۬ۢۥۥۘۤۚ۟ۤۦۥۜ۬ۨۘۚۨۡۘۤ۫ۛۧۖۥۨ۬۟ۘۡۖۘ۠۫ۖ۟ۙ۠ۙۢۥۥۙۙ۫۬ۦۘ";
                        while (true) {
                            switch (str4.hashCode() ^ 1318430882) {
                                case -1929731153:
                                    str = "ۥۗۡۘ۬ۛ۠ۢۜۤۗۖۖ۫۬ۚ۫ۦۜۘۥۗ۟ۤۦۧۘ۟ۙۦۘۦ۫ۦ";
                                    continue;
                                case 282370364:
                                    String str5 = "ۢ۫ۖۘۧۢۡۧۨۤۜۙۦۘ۟۟۟ۨۦۥۡۖۘ۠ۨۧۘۢۤۦۜۖۧۘ۬ۧۦۧۜۜۛ۬ۙ۠ۢۡۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-1271030648)) {
                                            case -1423348395:
                                                str4 = "ۢۡۘۤۦۥۡۙۥۘ۠ۥۨۚ۠ۗۦ۠ۘۘۙۧۦۘۧۥۙ۬ۦۢۜۗۙ۟ۦۘۘۤۖۗۘۖۦۢ۫ۧ۟ۘۦۘۢۧ";
                                                break;
                                            case -394184303:
                                                str4 = "ۚۧ۬۟۟۫ۥۜۥۘ۫ۨۦۦۖ۫ۘۙۘۘۗۙۗۡۤ۫ۛ۠ۡۘ۬ۢۙۧۢۡۚۤۖۘ";
                                                break;
                                            case 180371502:
                                                str5 = "۬ۧ۟ۢۗۘۚۙۦۘۖۚۢۤۛۨۥۗۨۘ۠۠ۡۦۧ۬ۥۡۨۖۙۘۘۧۘۘۘۥۗۥ۬ۧ۬۠ۙۚ۫۠ۗ۠ۘۘ۬ۛ۬ۦ۬۬";
                                                break;
                                            case 1555397563:
                                                str5 = 1300 == i ? "ۨۨۜۘۤۧۜۚۚۛۨۨۨۘۙۢۖۘۙۘۡ۟ۘۤۗۢۚ۠ۤۥۘۗۥ۟۬۠ۥۖۘ" : "۫ۨۦۙۧ۟۫ۗۨ۠ۘ۠۬۫۫ۗۨ۠ۙ۫ۦۚ۟ۙ۠ۛۗ۫ۤۜۖ۬ۗۖۛۜۘ۫ۧۥۦۚ۟ۙۢ۬ۗۛۜۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 336361074:
                                    str = "ۨ۬۫۬ۚۢۢۖۘۛ۟ۚۗۢۗۘ۫ۧۥۙۖ۟ۢۤۗۙۥۘۗۥۜۡۦۦۘۛۨۛۖۖ۬ۥۨ۠ۦۤۙۜۜ۫";
                                    continue;
                                    continue;
                                case 437360101:
                                    str4 = "ۙۨۘۥۦۥۘ۟ۛۗۛۧۜۘ۟ۦۜۘۜۤۤۗۗۡۦۧۤ۠ۧۨۘۜۥۢ";
                                    break;
                            }
                        }
                        break;
                    case -1055015956:
                        String str6 = "ۗۥۥۥۧۥۛۜۥۜۨۙۥۖۥۘۧۨۧۘۤۢ۠۫ۘۛۦ۟ۗۡ۬ۥۜۘۘۤۤۘۛۛۗ۟ۨۧۨۖۗۖۦۛ۬۬ۦۤ۫ۚ";
                        while (true) {
                            switch (str6.hashCode() ^ (-1796180323)) {
                                case -1495142581:
                                    str6 = "ۦۧۤۜ۟ۢ۟ۨ۟ۙۚۖۘ۠ۖۦۘ۬ۜ۬ۘۙۢ۬۫۫۟ۢۖۚۛۙ۠ۦۦۘۥۦۚ";
                                    break;
                                case -1062400136:
                                    String str7 = "۫ۤۗۧ۠ۘۘۛ۟ۦۖۧ۟ۧۡۤۙ۟ۤۦۢ۫ۢۥ۫ۗۘۧۗۡۨۤۥ۠ۖۥۖ۟ۨۧۘۤ۠ۤ۠ۚۨۥ۠ۧۚ۫ۨۤۤۨۘ";
                                    while (true) {
                                        switch (str7.hashCode() ^ 564373695) {
                                            case -1937774892:
                                                str7 = 1202 != i ? "ۗۨۡۘۦۤۥۛۗۘۘ۬ۜۥۤۚۖۙۨۦ۬ۚۥۘۤۥۖۘۚۨ۟ۥ۠ۛۜ۟ۡۢۧ۟ۢۗۡۗۘۘۤۛۢ۬ۗۛۙ۠ۤۛۡ۟" : "ۧ۟ۜۧۥۡۘۙۛۘ۠۫ۙۥۘۡۧۛۡۘۚۜۖۘۢۛۖۘ۫ۨۤۚۧۖۘۛۗۘۘ۫ۨۨۘۥۜ۬۫ۦۨۘ";
                                                break;
                                            case -1040975497:
                                                str6 = "ۖۢۘۘۛۖۡۘۨۗۜۢۜۢۛ۟ۜۘ۠ۧۘۘۦۚۥۘۜۤ۬ۖۤۚ۟ۛۧ۫۟ۧۤ۟ۘۘ";
                                                break;
                                            case -369416493:
                                                str7 = "ۖ۠ۘۘۖۘۜ۟ۗۖ۫ۦۨۗۜۧۛۨۘۜۢۥۖۤۖۥۖۘۘ۠ۘ۠ۛۚۤۤۘ۠";
                                                break;
                                            case 905991730:
                                                str6 = "ۨۢۧۜ۬۠ۚۡۧۥۦۘۙۢۘۘۖۜۚۖۡۥۘۧۙۥۨۥۖ۠ۚۡۛ۬ۖۢۘۘۘ۟ۖۛ۫ۘۜۨۖۖۡۦۘۢۧ۠ۜۥۛ";
                                                break;
                                        }
                                    }
                                    break;
                                case -980976345:
                                    str = "ۖ۟ۡۘۚۦۚۥۚۨۨۛۥۥۤۦ۠ۚۧۚ۟۬۬ۢۥۥۘۥۦۚۙۗۙۧۥۚۥ";
                                    break;
                                case 758176559:
                                    break;
                            }
                        }
                        break;
                    case -1043691208:
                        String str8 = "ۗۚۧۜۘۗۦ۟ۥۗۦۘۥ۬ۨۚۙۦۘۡۢۦۘ۬۫ۡۛۘۨۘۥۧۜۖۗۤۛ۬ۘۘ۠ۨۦۘ۟ۡۡۘ";
                        while (true) {
                            switch (str8.hashCode() ^ 2139262962) {
                                case 63889689:
                                    String str9 = "ۖۨۦۘۥۖۢۗ۫ۡ۫ۧۨۛۙۙۘۥۥۙۙۨۘۛ۬ۢ۟۟ۜۘۡۗۥۘۤ۫ۥۘۛۡۘۚۗۥۘۗۚۡ۬۠ۦۚۗۖۘۨۘۙۢ۠";
                                    while (true) {
                                        switch (str9.hashCode() ^ 888592507) {
                                            case -1590981678:
                                                str9 = 1100 != i ? "ۡۜۜۘۛۥۧۘۛۖۖۘۗۤ۬ۖ۠ۖۘ۟ۗۗۡۚۜۢ۫ۥۗۘۢۜۤۜۤۧ۠ۢۜۘۥ۠ۦۘۙۖۘۘۗۡ۠ۜ۟ۤ" : "ۧۤۛ۟ۗۜۘۛ۬ۧۥۦۧۘۖ۫ۚۚۚ۟ۨۡۨۙۖۖۚۤۡۘ۟ۦۦۘۨۚۜۘۥۖۧۘۢۖۖۘۜۛۜۘۙۛ۬۬ۖۗۖ۟ۘۘۢۨۧ";
                                                break;
                                            case -6399842:
                                                str9 = "ۤ۬ۖۧۗ۠ۧۦۘۧ۟ۙۢۨۛۖۙۧۡۜۘۧۦۨۙ۠ۤۦۖۛۦ۠ۤۛ۫ۛ۫ۡۡۢ";
                                                break;
                                            case 232713787:
                                                str8 = "ۨۧۤۤۦۥۖۥۤ۠ۦۘۡ۟۬۫ۧ۟۬ۘۤۦۥۘۦۦ۟ۦۗۨۙۧۖۙۗۨۘ۟۫۫ۛۤۗ";
                                                break;
                                            case 1440670928:
                                                str8 = "ۡۖۗۢۡۘۤۢ۠ۢۙ۠ۥۢۜۘۙۗۖ۬ۦ۬ۥۖۘ۟ۛ۠ۘۢ۬ۦۡۥۘۛ۫۫";
                                                break;
                                        }
                                    }
                                    break;
                                case 152053035:
                                    str8 = "ۤۤۚۧۥۚۥ۠۫۬۠ۚ۫ۜۘ۬ۧۦۘۘ۟ۚ۟ۜ۟ۗۧۥۘۧۤۡۘ";
                                    break;
                                case 762272368:
                                    str = "ۚۥۚ۟ۛۦۘۨۖۡۘۤۦۖۡ۫ۙۚۖۘۙ۫ۘۘۤۥۛ۟ۛۦۘۢۘۙۦۦۨۛۖۖ۬ۧۛۙ۟ۖۘ۠ۨۙۦۜۜۖۜۥۥ۟";
                                    break;
                                case 1680358030:
                                    break;
                            }
                        }
                        break;
                    case -1001923066:
                        C3753c5.OooO0OO(bindRegisterCodeActivity, bindRegisterCodeActivity.getString(R.string.activation_code_suc));
                        str = "ۨ۠ۥۘ۫ۨۡۨۨۧۙۨۗۥ۟ۧ۟ۘۜ۠ۚۜۖ۟ۨۖۘ۟۬ۦۤۦۡۦۛۛۦ۫ۜۘۗۧۢۗۨۨۘ۠ۨۘ۠ۨۡۘۗۘۜۘ";
                        continue;
                    case -958273669:
                        str = "ۜ۟ۨۚۗۜۜۛۦۦۗۦۘ۫ۧۜۡۘۖۘۜۗۘۘ۟ۥ۠ۧۥۤۢۗۢۛۖۢۖ۫ۦۜۢۖۦ۟ۗ۬ۗۖۛۖۨۡۙ۫ۡۡۚ";
                        continue;
                    case -742594489:
                        str = "ۡ۬ۙۨۨۘۤۢۡۢۜۧۘۘۖۖۗۜۘۘۖۛ۫ۥ۫ۤۖۥۨۨۚ۟";
                        i = baseResponseInfo.Code;
                        continue;
                    case -449481604:
                        String str10 = "۫ۤ۟ۗۥۖۘۨۡۘۖ۟ۘ۬ۖ۟ۘۘۘۘۡۚ۬ۦۗۜۘۜ۟ۖۘۜۨۥۡۨۖۛۜۗۚۤۗۨۙۚۦۦۗۙۖ";
                        while (true) {
                            switch (str10.hashCode() ^ (-1925909564)) {
                                case -927880310:
                                    String str11 = "ۖۤۦۛ۠ۜ۬ۨۥ۟ۦۡۨ۟ۢۗۥۘۜۨۘۘۨۖۘۡ۟ۡۘ۠ۘۨۘۜۤۖۘۡۜۤۦ۟۠ۖ۟";
                                    while (true) {
                                        switch (str11.hashCode() ^ 2073409708) {
                                            case -1563804111:
                                                str11 = i == 200 ? "ۜۤۡ۟ۦۘۢۧۢۥۚۖ۠ۘۖۘ۫ۥۘۘۦۚۧۜ۫ۜۘۘۜۚۧۗۡۖۦۘ۬۬۠" : "۬ۨۤ۠ۖۡۘۙۛۖۜۢۤۨۡۥۘ۟۫ۗۤۡۨۘۤۜۥۘ۟ۥۨۘۦۙۖ";
                                                break;
                                            case -1313289479:
                                                str10 = "ۚۚۘۧۤ۬ۘۙ۬ۜ۫ۛۧۦۦۚۦۘۜ۠ۘۘۧۨ۟ۙۚۢۙۡ۟ۛۢۨۘ۫ۘۜۘۘۤۙۚ۬";
                                                break;
                                            case -1155451891:
                                                str11 = "۟ۚۖۤۥۡۗۦۘۤۧۦۘۧۘۘۦۚۦۘ۫ۧۗۛۦۨۥۗۤۥ۬ۜۘۗۥ۬ۖۛۘۤۚۘۘ۫۬ۢ۫ۚۚۡۥۥ";
                                                break;
                                            case 1254628001:
                                                str10 = "ۢ۫ۘۘۥ۫ۜ۫۟۬ۢ۟ۙۛ۠۬ۚ۠ۜۙۖ۟ۤۛۦۦۖۨۘ۠ۦۦۘۡۢۨۘۚۧۘۘۘۘۘۘۨۢۙ";
                                                break;
                                        }
                                    }
                                    break;
                                case -552768405:
                                    str = "۬ۧ۫ۥۖۘۦۡۜۙ۠۬ۧۖۧۘ۬۫ۦۖۗ۬ۖۢۢ۠ۚۗۥۘۘۘۢۘۘۖۘۡۘ";
                                    continue;
                                case 868954184:
                                    str = "ۤۗۥۗۡۢۜ۬ۨۧۖۜۘۨۨۖۡۖۤۥ۟ۙ۠ۜۚۘۨۜۘ";
                                    continue;
                                    continue;
                                case 1778395096:
                                    str10 = "ۢۖۛۙۛ۠ۨۡۛۤۖۦۤۥۜۘۡۦۥۚۥۤۘۢۖۙ۬ۧۖۙۘۘۖ۠ۦۨۛۜ۬ۤۧۤۖ۫ۜۥۤۦۛ";
                                    break;
                            }
                        }
                        break;
                    case -280904005:
                        str = "ۜۗ۫ۤۡۥۘۢۤۖۤۢۨۘۘۖۚۢ۟ۥۥ۟ۥۘ۠ۛۤۦۘۙۖۢۗ۫ۧ۬ۖۛ۬ۢ۟ۗۤۡۛ۠ۢۘۘۡۚۘۥۢۥۘۛۘۖۘ";
                        bindRegisterCodeActivity = this.OooO00o;
                        continue;
                    case -23220176:
                        dialogC4608z9.show();
                        str = "ۛۡ۫ۛۖۡۧۤ۬ۧۨۧۘ۟ۙۘۖۖۢۙ۬ۢۥۗۨۤ۫ۨۧۚۥۘۨۡۢۖۗۦۛۖۘۢۛۘۧۜۨۙ۬";
                        continue;
                    case 291432632:
                        j10.OooO0o().OooOOOO(new MsgItem.UpdateMessageToDialog(baseResponseInfo.Message));
                        str = "ۛۤۙۘ۫ۢۢۗۙۗۥۧۘۨ۠ۤۛۡۜۧۥۘۥۚۜ۟ۦۛۖۖ";
                        continue;
                    case 491961120:
                        return;
                    case 586651138:
                        String str12 = "۟۬ۨ۬ۙۨۘۙۦ۟ۙۨۦۘ۫ۢۥۘۨۦ۫۠ۢۧۤ۟ۘۘۤۚۜۘۖۤۦۘۚۦۖۘۧۘۚۢۨۦۢۨۜۘۧ۠ۢۛ۟۬ۡۚۨ۟ۗۡۘ";
                        while (true) {
                            switch (str12.hashCode() ^ 2033934539) {
                                case -2035393659:
                                    String str13 = "ۘ۠ۦۘۘ۫ۗۦۥ۠ۗۘ۬ۘۦۖۗۤ۬ۤۨۘۙۗۦ۬ۨۖۙۘۤۥۖ۟ۙ۠ۘۨۛۥۚۛۦۘۥۜۥۛۦۜ";
                                    while (true) {
                                        switch (str13.hashCode() ^ (-1909434805)) {
                                            case -305577328:
                                                str13 = 1200 != i ? "ۡۤۖۡۡۚۦ۬ۘۘۛۛۙۗۗۚۡۘۧۘۘۛۙۛۗۚۜۤۡۘۛۤۚ۫ۗۜۜۨۘ۠ۤۖۧۖۨۘۘۦۗۥۖۡ" : "ۗۤۘۘۘۦۥۧۛ۠ۚ۟۬۬ۗ۟ۚۢۜۨ۫ۗۗۨۥۘۘۖ۫۠ۧۥۘ۠۠ۚۙۦۛۘۤۙ۟ۚۚ۟۫ۜۘۖۘۖۘۨۖۥۘۘۦۨۘ";
                                                break;
                                            case 569198589:
                                                str12 = "ۢ۟ۘۘۥۨۡ۬ۨۘۘۤۗۢۡ۫ۢ۟ۥۖۛۚ۟ۡۘۙۜۥۡۖۥۢۚۚۧۢۦۢۢ۠ۛۛ";
                                                break;
                                            case 1300994350:
                                                str12 = "ۡۨۧۦۢۦۘۢۚۧۨ۟۫ۡۙ۫ۥۛ۟ۜۖ۟ۦ۬ۛ۫۟۫ۚۤۨۘۦۛۧۛ۬۬ۗۧۖۘ۟۫";
                                                break;
                                            case 1797946595:
                                                str13 = "ۦۛ۫ۧۢۛ۠۠ۖۘۜ۬ۚۥۤۥۘۦۘۦ۠ۖۘۘۦۧ۬ۡۘۡ۬ۥۨ";
                                                break;
                                        }
                                    }
                                    break;
                                case -1456262372:
                                    str = "ۙۗۘ۠ۘۛۖۗ۟ۛ۬ۜۨۙۨۤۡ۟ۙۚ۫ۘۗۘۤ۫ۜۘۤ۟ۗۡ۠ۦۘۤۦۤۙۛۢۦۗۜۤۦۜۖۦۦۘۦۧ۟ۡۦۙ";
                                    break;
                                case -1147794796:
                                    break;
                                case -478529961:
                                    str12 = "ۡۗۢۙۧ۟ۛۖۧۘ۬ۦۥۘۛۥۧ۠ۛ۫ۦۘۖ۫ۢ۠ۚۥۡۗۗۗ";
                                    break;
                            }
                        }
                        break;
                    case 1478190225:
                        String str14 = "ۡۥۦۘۧۚۘ۠۫۠۬۬ۤۘۥ۟ۗ۬۟۟ۧۖۥۜۥۖۚۡۥۧۨ۠ۨۜۖۥ";
                        while (true) {
                            switch (str14.hashCode() ^ 36171872) {
                                case -116177244:
                                    String str15 = "ۤۦۥۘۗۜۖ۠ۧۨۨ۬ۧۙۖۘ۟ۚۙۧ۠ۧ۠ۡۨۡ۠ۨۨ۟ۜ۫ۡۚ۟۬۬ۥۡۘۗۥ۬۬ۛۧۜۢۖۘۧۨۛۥۥ۟";
                                    while (true) {
                                        switch (str15.hashCode() ^ 1640669594) {
                                            case -1145118727:
                                                str14 = "ۧ۟ۡۘۡۘۧۘۡۚۦ۠ۡۧۨۥۗۨۙ۬ۤۧۗ۟ۗۧ۬۟ۨۗۘۦۡۦ۬۟ۨۛ۬ۡۘۖ۫ۘۥۙۤۢۚۡۤ۠ۘۚۜۡۘ";
                                                break;
                                            case -1069951224:
                                                str14 = "ۖ۬ۗۗۥۜۘۚ۫ۨۘOۨۜۜۘ۬ۢۘۜۢۙ۬ۨۘۤۗۗۘۜ۬ۚ۠ۛۧۜۦ";
                                                break;
                                            case 381676353:
                                                str15 = "ۦ۟ۥۘۢۜۢ۠ۧۖۤ۠ۙۤ۟ۘۘۚۖۡۘۧۤۢۢۡۨۛ۫ۥۚ۬ۚۡۤ۟ۥ۬ۜۤۡۘۛ۬ۖ";
                                                break;
                                            case 581763432:
                                                str15 = !DialogC4608z9.Ooooo0o ? "ۘۧۛۗۜۙۨۥۘۘۤۥۥۦۛۖۘۜۧۦۗۤۧۡۘۦۙۧۖۘۨ۟ۜۘۘۦۤۛۛۖۘ" : "ۚۧۖۧۧۨۗ۬ۖۢۤ۟ۥ۠۟ۙۢ۫ۖۛۢۘۧۙۖۗ۠۠ۖۢۦۘۙۤۡۥۥ۫ۛۤ";
                                                break;
                                        }
                                    }
                                    break;
                                case 282694232:
                                    str14 = "ۜۡۧۘۢ۫ۘۘۡۤۚ۫ۜۡۥۖۨۘۤۜۡۜۘۘ۠ۛ۟ۨۘۦۘ۠ۗ۬ۜۢۚ۫ۘ۬";
                                    break;
                                case 849493094:
                                    str = "ۚۘۥۘۚۙ۠ۡ۫۫ۘۖۘۘۤ۫ۦۛۤ۟ۥ۫ۦۡۥۘۘۛۚۨۘۚۖۧۨۛۨۘ۬ۙۛۚ۬ۨۗۨۗۛۥۚۢۥۘۜۢۜۘ۟ۘ";
                                    continue;
                                case 1934121781:
                                    str = "ۢۙ۫ۨۜۛ۫ۤۨۤۤۚۢۜۚۢۛۜۜۘۧۤ۫ۢۨۡۘۚۛۦۘ";
                                    continue;
                                    continue;
                            }
                        }
                        break;
                    case 1724797118:
                        str = "ۧ۟ۡۘۧۚۜۘۦۙ۬ۙۘۤۡۤۘ۬ۨۘۙ۟ۗ۠ۢۨۘۜ۬ۖۘۧۨۨۡۗۡ۬ۖۨۘ";
                        continue;
                    case 1787204969:
                        break;
                }
                str = "ۙۗۨۘ۫ۘۖۧۢۜۜۗۗۚ۟ۦۘ۬۟ۛۨ۟ۦۢۤۢۘۖۖ۟۫ۥۨۜۨۘۛ۟ۦۧۙ۟ۧۘ۬ۖ۠ۘۘۧۦۘۘ";
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(@Nullable BaseResponseInfo baseResponseInfo) {
            String str = "۠ۧۖۥۦۦۗۗۥۘ۠ۚ۟۟ۚۜۦ۠۠ۢۦ۠ۛ۬ۙ۠ۛ۫۠۬ۛ";
            while (true) {
                switch ((((str.hashCode() ^ 317) ^ 532) ^ 356) ^ 734996919) {
                    case -1862949779:
                        OooO00o(baseResponseInfo);
                        str = "ۨۥۜۛۗۖۘۛ۟ۤۡۙۚ۠ۗۨۜۜۘۛۦ۬ۜۚۚۚۜۛۛۨۖۚۗۤۡۜۘ۟۠ۖۨۧۜۘۛۙۡۘۦ۬۠";
                        break;
                    case -1597695370:
                        str = "۫ۚۘۖۜۜۨۗۖۘۨۜۘۘۧۖۚۚۧۛۗ۬ۨۗۛۜۗۗۨۢۢۥۧۘ۫ۨۥۘۜۜۛ۠ۧ۟۬۟ۦۙۜ۟ۗۢۗۗۥۗ";
                        break;
                    case 1439771201:
                        str = "ۗۡۤۢۨۥۧۥۥۘۤۤ۠۬ۜۦۙۗۥۘۗۗۦۙۤۤۘ۬۟ۧۦۨۘۢۡۡ۫ۚۨۢۛۨ۫ۨۢ";
                        break;
                    case 1901584998:
                        return;
                }
            }
        }
    }

    public class OooO0O0 implements Observer<RegCodeInfoResponse> {
        public final BindRegisterCodeActivity OooO00o;

        public OooO0O0(BindRegisterCodeActivity bindRegisterCodeActivity) {
            this.OooO00o = bindRegisterCodeActivity;
        }

        public void OooO00o(@Nullable RegCodeInfoResponse regCodeInfoResponse) {
            String str = "ۧ۬۬ۜۖ۬ۛۦۡۘ۬۬ۖ۬ۧۚۢ۫۟ۘۛۥۘ۬ۘۦۘ۠ۚۤ۫ۙۨۡۗ۠ۢۖ۬ۙۚۚۦۡۢ۫۠ۢۛۤۨۘ۠ۦۤۡۨۢ";
            String strValueOf = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                switch ((((str.hashCode() ^ 788) ^ 88) ^ 588) ^ 499623276) {
                    case -910843907:
                        BindRegisterCodeActivity.OooOO0(this.OooO00o, regCodeInfoResponse.Data);
                        str = "ۨۘ۫ۧۤ۟۟۫ۡ۬ۡۗۗۘۛۤ۫۬۫ۜۘ۟ۛۖۘ۠ۡۥ۫ۖۙۦۤۥۢۦ۬ۜۧۘۡ۬ۖۘۖۗۡۤۢۜۘ";
                        break;
                    case 541943096:
                        str3 = regCodeInfoResponse.Message;
                        str = "ۤۘۡۘۜ۟۟ۗۛۦۘۙ۫۫۟۬ۙۨۦۚۨۡۤ۠ۚۤۦۙۧۡۦۘۧۧ";
                        break;
                    case 582660183:
                        String str4 = "۟۫ۨۗۗۛۨۤۤۤۨ۫ۨ۟۬ۙ۟ۨۘ۬ۧۨۢۚ۟ۥ۫ۙۢۦۘۧۙۨۘۙ۬ۘۘۢۙۘۘۛۛ۫ۥ۟ۨ۠۠ۢ";
                        while (true) {
                            switch (str4.hashCode() ^ 862118287) {
                                case -2027763365:
                                    str4 = "ۧۢۥۘ۬ۧۥۙۛۗۚۘۜۘۖۡۙۘۘۘۘۘۘۖۘ۬۟۫ۚۨۖۘۤۘۦ۫ۨۦۨۨۜ۬ۗ۬۟ۜۥۘۧۤۤۨۧۧۗۤۙ۟ۦۜۘ";
                                    break;
                                case 338932633:
                                    str = "ۙۗ۠ۦۘۨۢ۬ۢۡۚۛۡۢۨ۬ۚۢۘ۟۠ۨۖۚ۠ۖۜۤ۠۠ۨۘۖۜۤ";
                                    continue;
                                case 1911407684:
                                    String str5 = "ۧۙ۠۠ۘ۫۟ۤۡۚۨۘۖۧۖۘ۟۬ۗۢۨۢۚۙۡ۬۠۠۫۠ۦۨۢۛۘۨۢۗۛۘۦ۫۟ۤۚۛۘۙ۟";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-1224352475)) {
                                            case 704623607:
                                                str4 = "ۛۦۥۘۗۚۜۘۚۜ۬۟۠ۥۛۤۨۡۢۥ۫ۗۨ۟۠ۧۙۘۘۡۚۥۧۨۘۖ۬ۖۘ";
                                                break;
                                            case 1348317562:
                                                str5 = "۫ۗ۠۠۟ۦۨۤۤۘۙۡۙ۟ۛ۠ۖۡۘۦ۫ۖۧۖ۠ۙۢ۬ۨ۫۠";
                                                break;
                                            case 1610923386:
                                                str5 = TextUtils.isEmpty(str3) ? "ۙۖۘۘۡۛۥۘۢ۬ۜۘۚۨۨۘۢۗ۠ۛۙ۫ۧۨۗۜ۠ۥۦۢۥۢۚۥ" : "ۦۛۜۨۨۖۥۗۢۛۧۨۘۛ۫۟ۥۦۖۘۚۜۥۥۜۘۘۥۥۡۛۗۧۙۛۖۘۢ۟ۘۘۧۗۚ۫ۛۘۧۦۡۗۧۚۢۨۖۘۘۡۙ";
                                                break;
                                            case 1969744404:
                                                str4 = "ۥۡۨۘۧۖۘۘۖۧۢۡۤۚۗ۫ۨۘ۬ۚۦۨۧۜ۠ۤۡ۬۟ۖ۫ۢۛ";
                                                break;
                                        }
                                    }
                                    break;
                                case 2112610424:
                                    str = "ۗۥۦۘۗۧۖۧۤ۬ۘۗۡ۬ۛۗۘۦۥۡۨۛۖۢۢۜ۟۫ۜۙۨ۟۫ۛۡۖ۠ۙۢۥۘۘ۠ۚۜۖۡۤ۟ۦۥ۠ۗ";
                                    continue;
                            }
                        }
                        break;
                    case 833509143:
                        String str6 = "ۚ۠ۨۘۥۖۨۦۧۙۧ۟ۧ۠ۙۙۤۜۖۘ۟ۙۘۢۜۘۘۚۙۧۗۧۖۘۧ۠ۛۖۘ";
                        while (true) {
                            switch (str6.hashCode() ^ 1654408544) {
                                case -1100297888:
                                    String str7 = "ۦۥۘۘۖۥۘۘۢ۟۫ۢۗۧۥۧۡۘۛ۬ۦۛۙ۠ۘۤ۠ۚۙۡ۠۟";
                                    while (true) {
                                        switch (str7.hashCode() ^ (-97376264)) {
                                            case -1615012353:
                                                str7 = "ۛۨۥۘۚ۠ۡۤۡۜ۠ۜۡۘ۠ۤۦۘ۟ۨۦۛۥ۫۫۟۬ۙ۫۬ۚۜۘۢ۟ۢۚۜۢۡ۫ۥۘ۬ۤۗۖۥۧۘۥۥ۬ۥۧۖۖۛ۫";
                                                break;
                                            case -1007228153:
                                                str6 = "۠ۜ۠۠ۦۘۘ۫۬۠ۜ۫ۖۘۖۨۜ۟ۧۛۚۤۨۘۦ۠ۨۛۥ۫۠ۧۡ";
                                                break;
                                            case 1164042493:
                                                str7 = regCodeInfoResponse.Code == 200 ? "۬ۥۘ۠۠ۘۙۨۚ۫ۙۥۘۚۛ۫ۡۙۢۦ۠۫ۥۗ۠۟ۧ۟ۢ۠ۗۦۧۘۘۤۜۦۤۘۥۛۖۘ" : "۬۠ۛ۟۠ۛۦ۬ۨۥۗۨۙۖۛ۫ۡۘۙۦۡۘۨۙۖۡۚۡ۠ۥۚۡ۫ۖۘۨۙۢ۫ۗ۫ۗۦۢ۫ۙۥۘۖ";
                                                break;
                                            case 1903033602:
                                                str6 = "ۙۡۘۦۘۥۘۜۗۢۤۤۧۥۦۧۘۘۧۨۘۖ۠۫ۨۢۦۡۨۙ۟۠ۖۙۤۢۡۛۖۘۧۢۖۜۙۖ۬ۚۡ۫ۦ";
                                                break;
                                        }
                                    }
                                    break;
                                case 966603998:
                                    str = "ۙۙ۫ۙۧۨۘۦۘ۟ۢۙ۫ۛۧۜۤۦۘۚۛۘۘۙۗۚۙ۠ۡۗۨ۬ۡ۫۟۠ۦۦۘ۟۟ۗ۬ۡۜۢۦۧۡۜۗۘۘۘۥۡۘ";
                                    continue;
                                case 1662870285:
                                    str = "ۥۨۙ۟ۤۨ۟ۗۤ۬۠ۤۡ۫ۙۤۦ۟ۜۛۤۢ۬ۙۧۨۧۘ۟ۗۨۘۥۦۨۘۡۖۛۛۨۡۙۖۥۧۖۘۧۖۧ۟ۙۜۢۨۤ";
                                    continue;
                                case 1908649969:
                                    str6 = "۟ۦۡۘۡۚ۫ۚۗۜۘۨۜۡۖۖۜۢۨۜۛۛ۬ۡۧۘۚۖۢ۫ۙۨۜۛۡۥۧۗ۟ۦۥۥۛ";
                                    break;
                            }
                        }
                        break;
                    case 858839390:
                        C3753c5.OooO0OO(AppContext.OooO00o(), str2);
                        str = "۟ۘۥۧۡۢ۫ۖۨۘ۠ۛۘ۟ۦۜ۠۬ۨۛۘ۬ۖۥۤۤ۠ۘۤۦ۫";
                        break;
                    case 1129228423:
                        strValueOf = String.valueOf(regCodeInfoResponse.Code);
                        str = "ۦۡۡۘۜ۬ۖۘۖۡۖۘۥۘۦۘ۟ۚۤۥۖۡۘۤۥۧۘۛۧ۬ۨ۠ۥۘۗ۠ۘۢۤۚۛۤۜ";
                        break;
                    case 1415860236:
                        str = "۬ۙۖۘۜۡۙۛۜۥۛ۫ۤۙۥۙۖۖۦ۠۬ۘۜ۫ۜۘ۫۟ۧۗ۫ۙ";
                        str2 = str3;
                        break;
                    case 1570936815:
                        str = "ۢ۠ۧۙ۬۬۬ۖۗۜ۬۬ۘ۠ۜۘۤۧۢۗ۫ۘۛۙۜۙۥۥۡ۠ۜ۠ۛۥۘۦۘۘۡۚۥۘۧۚۚۨ۬ۨۗۛۖۘ";
                        break;
                    case 1816097793:
                        str = "ۥۨۙۚۙ۫ۚۤۡ۫ۨ۫ۨۗۢۡۢۡۘۛۢۨۘۙ۠ۧۦۨ۫ۖ۬ۖۘۖۘۦۘۗ۫ۙ";
                        break;
                    case 1866543372:
                        return;
                    case 1898225440:
                        str = "ۙۗ۠ۦۘۨۢ۬ۢۡۚۛۡۢۨ۬ۚۢۘ۟۠ۨۖۚ۠ۖۜۤ۠۠ۨۘۖۜۤ";
                        str2 = strValueOf;
                        break;
                    case 2122043229:
                        str = "۟ۘۥۧۡۢ۫ۖۨۘ۠ۛۘ۟ۦۜ۠۬ۨۛۘ۬ۖۥۤۤ۠ۘۤۦ۫";
                        break;
                }
            }
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(@Nullable RegCodeInfoResponse regCodeInfoResponse) {
            String str = "ۙۤ۫ۚ۫ۦۘ۬۠۠۠۟ۘۥۥۘۚۢۘ۠ۤ۟ۜ۟۠ۘۚۦۗۢۚۦ۠ۥۘ۠ۛۨۘۚۤ۫ۢۖ";
            while (true) {
                switch ((((str.hashCode() ^ 530) ^ 747) ^ 998) ^ 1211865151) {
                    case -199027901:
                        OooO00o(regCodeInfoResponse);
                        str = "ۦۨۘۖۤۜۘۦۡۡۘۗۢ۬ۥۛۛۡۘۘۦۚۥۘۦۖۦۨۥ۬ۖۧۘۘۧۜۡۖۗۙ۬ۜ۠ۚ۟ۦۘ۫ۧۗۗۡۗ";
                        break;
                    case 299894833:
                        return;
                    case 807275480:
                        str = "ۧۛۜۘ۠ۥۥۘۛۖۜۘۥ۫۫۟ۦۘۗۨۤۥۨۢۜ۫ۘۘۚ۠ۖۥۢۜۘۖ۟ۘۨۘۛۙۥۘۙۦۙ۬ۦۗۡ۬ۥۚ۠ۜۘۙ۟ۧ";
                        break;
                    case 941687208:
                        str = "ۡۦۜۛۧۚۘۘۘۘۡ۟ۦۘۨۛۗۙۚۜۥۡ۫ۤۗ۠ۥ۫ۡۘ۬۫";
                        break;
                }
            }
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public final AlertDialog OoooOoO;
        public final BindRegisterCodeActivity OoooOoo;

        public OooO0OO(BindRegisterCodeActivity bindRegisterCodeActivity, AlertDialog alertDialog) {
            this.OoooOoo = bindRegisterCodeActivity;
            this.OoooOoO = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "ۘ۟ۧۤ۫ۡۘۚۧۨۘۧۡۢ۬۠۫ۙۜۜۘۦۛۖ۟ۦۘۨۧ۠ۘۚۤ۠ۛۜۘۢ۟ۖۘ";
            while (true) {
                switch ((((str.hashCode() ^ 438) ^ 476) ^ 623) ^ 1247397284) {
                    case -1983635229:
                        ((C4128ma) BindRegisterCodeActivity.OooOO0o(this.OoooOoo)).OooOo0O(BindRegisterCodeActivity.OooOO0O(this.OoooOoo), 0);
                        str = "۠ۚۢۗۦۛۚۚۙ۠ۤۖۘۚۡۢۚ۫ۤۡۘۦۘۡۢۘ۫ۤۦۦۨۘۛۚ۠ۨۨۜۗۥۚۤۚۨۘۜ۬۠ۜۖۜ";
                        break;
                    case -1870438157:
                        str = "۫ۦ۠ۤۜۜۘۢۛۨۘۥ۬ۛۧۡۥۘۗۨۧۘ۬ۘۘۧۘۜۨۥۦ۫۬ۜۘۚ۬ۖ۟۠";
                        break;
                    case -652423119:
                        str = "ۧۙۨۘۗۨۢۜۢۨۘ۟ۜۨۘۚۦۧۘ۠ۦۚۜۖۜۜۙۗۢ۬ۗۖۤ۠ۚ۟ۥۜۥۖۛۡۦۘ۟ۗۚۛۙۜۘۖۚ۫";
                        break;
                    case 1112898820:
                        return;
                    case 2140337438:
                        this.OoooOoO.dismiss();
                        str = "ۛۢۥۘۦۘۥۛۖۘۚۛۖۘۡۥۘۖۙ۟۠ۗۛۛۥۙ۫ۘ۠ۤۢۙ";
                        break;
                }
            }
        }
    }

    public class OooO0o implements View.OnClickListener {
        public final AlertDialog OoooOoO;
        public final BindRegisterCodeActivity OoooOoo;

        public OooO0o(BindRegisterCodeActivity bindRegisterCodeActivity, AlertDialog alertDialog) {
            this.OoooOoo = bindRegisterCodeActivity;
            this.OoooOoO = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "۫۫ۥۛۙۛ۟۠ۤ۫۟ۘۘۢۧۙۜۙۦۘۗۙۖۘۗۗۥۘۖۙۢۥۛ۠ۚ۫۠ۡۥۘ";
            while (true) {
                switch ((((str.hashCode() ^ 830) ^ 134) ^ UiMessage.CommandToUi.Command_Type.SET_FW_SMOOTH_VALUE) ^ (-454769500)) {
                    case -1681220392:
                        this.OoooOoO.dismiss();
                        str = "ۦۤۘۘ۬ۜۖۘۥۖۤ۟ۦۤۥۚ۬۬ۥۖۘۖ۠ۦ۫ۢۘۦۧۥۧۖۦۘ۟ۗۥۘۤۧۜۘۜۛۦۘۘۘۦۘۤ۬۫ۦۚۘۤۗ۬ۚۦۤ";
                        break;
                    case -971111287:
                        return;
                    case -904795828:
                        str = "ۜۘۥۘۧۨۥۤۡۖۜۙۖۘۙۚۥۘۥ۟ۜۘۗۜۧۛۧۤ۬ۦۛ۠ۛۤۡۗۙۜۤ۬ۜۛ۫ۚ۠ۦۘۦۡۘۤۧۗ";
                        break;
                    case -807248270:
                        ((C4128ma) BindRegisterCodeActivity.OooOOO0(this.OoooOoo)).OooOo0O(BindRegisterCodeActivity.OooOO0O(this.OoooOoo), 1);
                        str = "ۥۥۨۘ۠۠ۖۘۥۨۤۚۦۨۗۢ۠۟ۥۚ۫ۙۢۙۙۡۗۚۦ۠۟ۤۛۗ۬ۘۥ۫ۘۨۘۚۧۧ۟ۢۤۜۤ";
                        break;
                    case -520365048:
                        str = "ۖۡۧۘ۫۫ۚ۠ۦۥۢۘۘۘۛۥۜۡۡۦۤ۟ۤۚۘۘ۬ۚۡۡۦۘۜۙۦۘۥۨۧۘ";
                        break;
                }
            }
        }
    }

    public class OooOO0 implements Runnable {
        public final BindRegisterCodeActivity OoooOoO;

        public OooOO0(BindRegisterCodeActivity bindRegisterCodeActivity) {
            this.OoooOoO = bindRegisterCodeActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۦ۫ۡۨۢۨۘۡ۟۫ۡۤۘۤۥۦۘۜۘۛۜۗ۬ۢۛ۬ۥۥۧۡۢۘۘ۠ۚ۠۫۠ۖۘ";
            while (true) {
                switch ((((str.hashCode() ^ 727) ^ 554) ^ 736) ^ 1301991060) {
                    case -1935442536:
                        return;
                    case -1404847305:
                        BindRegisterCodeActivity.OooOOO(this.OoooOoO, false);
                        str = "۬۬ۡ۠ۡۦۘۛۢۨ۬ۦۚۦ۬ۧ۫ۘ۠ۨۖ۫ۦ۟ۙۗۛۤۡۗ۟";
                        break;
                    case -770343172:
                        str = "۟۬ۖۘۢۤۗ۫ۙۘۙۘۖۦ۟ۙۘۛۤ۫ۡۜۘۨۢ۬ۢۤ۟ۚۦ۟۬ۤۢۤۙۛ";
                        break;
                }
            }
        }
    }

    public class OooOO0O implements View.OnClickListener {
        public final BuyRegCodeConfigInfo OoooOoO;
        public final BindRegisterCodeActivity OoooOoo;

        public OooOO0O(BindRegisterCodeActivity bindRegisterCodeActivity, BuyRegCodeConfigInfo buyRegCodeConfigInfo) {
            this.OoooOoo = bindRegisterCodeActivity;
            this.OoooOoO = buyRegCodeConfigInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.OoooOoO.BuyLinkUrl));
                String str = "ۙۗۚ۟ۗۘۘ۬ۙۙۡۡۘۥ۬ۤ۟۠۫ۛۨ۟ۗۨ۠ۦۜۡۗۧۖۢۘۙۖۗ۫۬ۙۖۥ۬ۜۘۦۡۚۨۛۜۘۡۥۘ";
                while (true) {
                    switch (str.hashCode() ^ (-499391452)) {
                        case -699670118:
                            str = "ۢ۠ۖۘۙۙۘ۠ۚۜۘۦۖۙۤۗۗ۟۟ۚۜۙۥ۬ۦ۠ۘۤۥ۬۠۟";
                            break;
                        case -40042395:
                            intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
                            break;
                        case 1596741570:
                            String str2 = "ۡۢۜۘ۠ۛۜۘ۟۫ۡ۫ۜ۠ۢ۬ۘۘۥۙۚۘۧۤ۟ۚۢۚ۬ۥۘۥۚ۬ۛۖۖۦ۟ۤۨ۫ۖۘۜۨۦۤ۠ۖۘۨۥ۫۬ۡۦۛۢۚ";
                            while (true) {
                                switch (str2.hashCode() ^ (-2103291920)) {
                                    case -1694464916:
                                        str = "ۖۘۦۘ۟ۨۚۖۧۤۤۤۛ۟ۚ۠ۗۦۧۜۙۖۧۥۢۚۥۗ۠ۛ۫ۚۘۘۥۚۨۘۙۜۘۥۖۥ۠ۨۜۙ۬ۤۨۙ۬۟ۦۜ";
                                        continue;
                                    case -1352315217:
                                        str = "۟ۤۦۘ۬ۚۧۘۘۘۤۜۙۛۙۛۘ۟ۖۦۢ۠ۨۗۙۚۘ۟ۛۗۤ۟ۧۨۘۢۜ۫ۚۤۜۨۧۥۥۘۖۘۧۙۚۘۘۨۥۧۘ";
                                        continue;
                                    case -446781105:
                                        str2 = !BindRegisterCodeActivity.OooOOOO(this.OoooOoo, AppContext.OooO00o(), intent) ? "۟۫ۦۡۤۘۖ۫ۤ۫ۧۧ۠ۦۜۦۤ۠ۗۖۧۘۜۖۜۘۖۤ۠ۛۜۘ" : "ۚۚ۟ۗ۬ۜۖ۫ۜۡۧۘۚۢۛ۫ۤ۫ۘۜۨۥۢۨۨۜ۫ۨ۫ۨ۫ۨۘۘۧۡۨۘۨۥۦۜۛۖ";
                                        break;
                                    case 486854526:
                                        str2 = "ۦۘۤۚۛۥۘۙۗۡۘۚ۬۠ۙۧۦۥۦۘۘۥۛ۫ۥۦۦۘۙۛۗ۠۠ۨۘۛۖۧ۬۫۫ۙۚۢ۟ۡۜۘۙ۠ۦۨۚۘۘ۟ۘۜۚۤۗ";
                                        break;
                                }
                            }
                            break;
                        case 2053190890:
                            break;
                    }
                }
                this.OoooOoo.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                C3753c5.OooO0OO(AppContext.OooO00o(), this.OoooOoo.getString(R.string.invalid_url_address));
            }
        }
    }

    public class OooOOO0 implements TitleView.OooO0O0 {
        public final BindRegisterCodeActivity OooO00o;

        private OooOOO0(BindRegisterCodeActivity bindRegisterCodeActivity) {
            this.OooO00o = bindRegisterCodeActivity;
        }

        public /* synthetic */ OooOOO0(BindRegisterCodeActivity bindRegisterCodeActivity, OooO00o oooO00o) {
            this(bindRegisterCodeActivity);
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "ۚۛۙۨۦ۫ۧۘۦۤۤۨۘۛۢۧۦۥۨۨۨۨۨۖ۫ۙۨۘۚۛۨۗۢ۬ۡۙۡۥ۟ۥ۠ۧ۫";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.FW_SET_TEXT_VALUE) ^ 459) ^ 918) ^ (-1904793884)) {
                    case 208413196:
                        return;
                    case 813365361:
                        this.OooO00o.finish();
                        str = "ۜ۠ۜۥۘۙۦۗۤۜۜۗۘۖ۬ۘۘ۠ۧۢۖۦ۫ۘۙۨۗۜۨۜۘۖۥۘ۬ۧۚۘ۬ۖۖۚۡۚۖۡۘۦۦۗ۠ۧۘۛۘ۠";
                        break;
                    case 1045371104:
                        str = "۫۫ۚ۠ۘۨۥۙۥۘۘۥۦۤۖۢۡۜۨۧۖۛۖۚۨ۠ۧۡۘۤۢۢۦۡۦۘۤۡ۫";
                        break;
                    case 1255658064:
                        str = "ۚۚ۟ۧۗۜۘۙۙۧۡۤۥۘۖ۠ۦۙۚۨۡۛۙۨۨ۫ۤۧۢۗۧۚۥ۟۫";
                        break;
                }
            }
        }
    }

    static {
        String str = "ۙۛ۟ۗۚ۫ۛۦۖ۠۟ۥۡ۠ۡۘۗ۬ۧۘۖۜۘۛۙ۬ۡۙۘۘ۬ۘۥۜ۬ۨۘۛۚ۟ۛۦۡۘۚۨۥ۠ۛۦۘۚۗۘ";
        while (true) {
            switch ((((str.hashCode() ^ 41) ^ 759) ^ 785) ^ (-1780125962)) {
                case -1881383077:
                    return;
                case -1313771377:
                    oo000o = new String[]{"android.permission.CAMERA"};
                    str = "ۘۨۖۡ۟ۢۙۥۧۘۦۚۡۘۧۗ۫ۚۙ۫ۛۙۢۚۨۜۤۨۛ۫ۗ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooOO0(BindRegisterCodeActivity bindRegisterCodeActivity, QueryRegCodeInfo queryRegCodeInfo) {
        String str = "۟ۜۤ۬ۗ۟۟ۘۖۙۦۢۜۦ۬ۗۨۤۧۚ۫ۘۘۨۘۡۘۙۡ۠ۜۘۚ۟ۨۡۧۚۥۚ۬۠۟ۗۦۢ۫ۘۘۢۘۙۖۖ۬";
        while (true) {
            switch ((((str.hashCode() ^ 55) ^ 331) ^ C4589yr.OooO00o) ^ (-732287524)) {
                case -1836868965:
                    bindRegisterCodeActivity.OooOOo(queryRegCodeInfo);
                    str = "۠ۡۧۘۜ۠ۦۘۛۨ۫ۡۚۤۧۡۨۗۘۘۨۢۡ۠ۢۦۜۚۤۦ۟ۖۢۘۘۡۗ۫ۙۢۜۘ۬ۡ۟ۥ۫۠ۜۧۚۧۧۘۘۙۥۡۘ";
                    break;
                case -1050997899:
                    str = "ۜۜۤۚۚۗۡۗۦۘۙۛۧۦۦۜۘۙۢۘۙۚۤۗۧ۬ۥ۬ۜۡۙۦۘۙۤۨۘۙۗۨۛ۟ۦۨۚۜ";
                    break;
                case -1035191623:
                    return;
                case 1914244826:
                    str = "ۢۧۤۗۗۘۘۙۢۤۖۜ۬۬۫ۖ۬ۢۢۧۤۥۘ۫ۚۧ۬ۚۡۤۙۤۙۘۗۛۢۤۖۗۥۛۥۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ String OooOO0O(BindRegisterCodeActivity bindRegisterCodeActivity) {
        String str = "ۧ۟ۥۘۖ۟ۧۙۦۦۘۘۜ۠ۡۘۛ۟ۧۘۘ۬ۨۥۘۢۢ۬ۦۦۘۗ۫ۢ";
        while (true) {
            switch ((((str.hashCode() ^ 508) ^ 499) ^ 62) ^ 904049386) {
                case -1699613562:
                    return bindRegisterCodeActivity.OooooOO;
                case -580812278:
                    str = "ۦۨۢۚۜ۠ۖ۠ۛۗۖۦۛۖۥۚۚۜۨۙۨۛۙۧۤۤۘ۫ۖۡۦۥۘ۬۟ۥۛۘۥۘۚۡۡۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ AndroidViewModel OooOO0o(BindRegisterCodeActivity bindRegisterCodeActivity) {
        String str = "ۖۚۥ۫ۜۜۧ۟ۛۗ۟ۦۦۗۦۘۙۤۧۗۛۙۡ۬ۙۧۦۘۘ۟ۜ۟";
        while (true) {
            switch ((((str.hashCode() ^ 24) ^ 416) ^ C1801a.f11005aP) ^ 1819709070) {
                case -30010744:
                    str = "ۥ۟ۚۗۨۥۙ۟ۖۘ۬۬ۘۘۢ۠۬ۜ۬۠ۧ۟ۢۖ۬ۧۗ۬ۖۘۥۦ۟ۖۦۘۤ۫ۨۘۜۤۘۛ۬";
                    break;
                case 1115746234:
                    return bindRegisterCodeActivity.OooooO0;
            }
        }
    }

    public static /* synthetic */ boolean OooOOO(BindRegisterCodeActivity bindRegisterCodeActivity, boolean z) {
        String str = "ۥ۫ۧۢ۬ۖۦۖۗۛۙۡۜ۟۟ۨ۟ۦۘ۬ۤۖ۟ۚۨۘۗۙۘۦۘۢۦۢۢ۟ۜۡۦۛۖۡۘۢۛۧۖۘۢۥۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 910) ^ 133) ^ 668) ^ (-1067530208)) {
                case -2069532839:
                    str = "ۤۤۧۘۡۘۙۘۘۚۚ۟ۥۢ۬ۙ۬ۙۨۦۚۦۛۡۥۘۚۨۖ۫ۗۦۘۢۙۦ";
                    break;
                case -1340508378:
                    str = "ۢۨۖۘۖۢۤ۬ۖۦۘۥۙۨ۬ۧۘۥۧۖۙ۟ۘۘۚۢۙۖ۬ۧۜۢۥۘۙۤۖۘۡۘ";
                    break;
                case -851033266:
                    return z;
                case -765404843:
                    bindRegisterCodeActivity.o00ooo = z;
                    str = "ۤۡۤۘ۫ۥۡ۟ۛۜۨۧۘۤۤۖۘۜ۠ۦۘۢۖ۠ۙۤۨۧۚۙۜ۬ۗ";
                    break;
            }
        }
    }

    public static /* synthetic */ AndroidViewModel OooOOO0(BindRegisterCodeActivity bindRegisterCodeActivity) {
        String str = "ۡ۬ۜۘۦۘۦۘۛۥۡۘۤۚۛۧۚۛۢۘ۫ۡۦۖۤۢۦۘۥۙۘۘۤ۠۟۠ۢۥۘ۫ۖۖۧۧۙۗۜۨ۬۟ۘۘ۟ۡۢۡۤۨۘۖ۫ۤ";
        while (true) {
            switch ((((str.hashCode() ^ 573) ^ 864) ^ 462) ^ 747016294) {
                case -1394967016:
                    return bindRegisterCodeActivity.OooooO0;
                case 1960066798:
                    str = "ۨۥۙۡۚۜۤۢۦۘ۫۫۬ۧ۬ۖۘۨۡۢۥۖۥۖۡۧۨۦۛۤۧۥۙۘۘۥۥۘۘۢۜۚ۠۠ۢۤ۠ۥۘۥۘۢۧۘۨۥۘۖۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean OooOOOO(BindRegisterCodeActivity bindRegisterCodeActivity, Context context, Intent intent) {
        String str = "ۧۢۗۜۢۖ۟ۙۘۘۡۖۡۘۛۨۖۘۙ۠ۖۘۘۗۘۘۗۨۡۖ۫ۘۙۙۤۛ۟ۥۙۢ۫ۛۦۘۙۜۡۖ۟ۨۜۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 544) ^ 909) ^ 537) ^ (-1277103148)) {
                case 339936822:
                    return bindRegisterCodeActivity.OooOOOo(context, intent);
                case 1051275759:
                    str = "۠ۖۖۘ۟ۜۖۘۤۢۨۘۡۘۢۥۢۥۡۚۤۧ۠ۘۘۖۢ۟ۚۗۥ۟ۛۥۘۨۡۦۨ۠ۧۖۢۘۘۚ۫ۥۘۙۤۗۖۜۥ";
                    break;
                case 1184612635:
                    str = "ۢ۬ۥۘ۠ۙۗ۬ۥۨۛۛۥۤ۠۟ۛۙۨۤۜۘۢۧۜۤۨۨۘۜۨۥ۫ۧۥۘۙۢۘۘ۠ۜۧۖ۠ۧۛۨۡۘۗۨۥ";
                    break;
                case 1533645835:
                    str = "ۚ۠۠ۡۢۜۚۙۙۡۚۡۘ۠ۙ۟ۖۡۜۘ۠ۥۨۘۖ۬ۖۘ۠۬ۖۛ۬ۡۘۚۦۖۘ۫ۢۡۢۗۦۘۘۖۡۘۖۧۧۛۙۘ";
                    break;
            }
        }
    }

    private boolean OooOOOo(Context context, Intent intent) {
        String str = "۠ۧۡۗۢۙۗۢۨۘۘ۠ۤۜۘۦۘۖۡۥۘۤ۫ۛۦۥۙۙۢۥۥۖۛۧۨۘ۫ۘۤ۟ۢۡۥۨۡۘۧۦۖۘۨۥۘۘۨۢۡ۟ۜ";
        while (true) {
            switch ((((str.hashCode() ^ 834) ^ 87) ^ 173) ^ (-881472786)) {
                case -540448124:
                    str = "ۦۨۥ۟ۤ۟ۜ۬ۨۘۤۙ۬ۡۢۗۛۖ۠ۙۦ۬ۥۧۘۥۖۢ۫ۨۤ۠۬۠ۨۨۦۘۗۥۥۘۘۘ۠";
                    break;
                case -432624275:
                    str = "ۙ۠۫ۢ۠ۙۦ۟ۢۡ۬۟ۤ۫ۛ۫ۙۙۛۢۖۦ۫ۚۤۙ۠ۨۘۘۗۘۖۘ۠ۛۗ";
                    break;
                case 417806955:
                    str = "ۢۦۖۚۢۚۖۨۧۘۜۡۖۥ۠ۥۘۗۢۦۥۛۙۤۛۚۜۙ۟ۤۨۨۙۜۧۥۤۨۘ۠ۡۦۘۘۥ";
                    break;
                case 1786188387:
                    return !C3902g6.OooO0O0.equals(context.getPackageManager().resolveActivity(intent, 65536).activityInfo.packageName);
            }
        }
    }

    private void OooOOo(QueryRegCodeInfo queryRegCodeInfo) {
        String str = "۠ۦۜۘۘۚۢۧۥ۟۟ۡۡۗۢۥۘۚۦۤۡ۟ۘۘ۟ۢۡۡۚۦۘۖ۟ۥۚۤۥۘۘ۫ۗ۠ۧۜۗ۫ۜۦ۫ۜۙۨۦ";
        TextView textView = null;
        TextView textView2 = null;
        AlertDialog alertDialogOooO0o0 = null;
        while (true) {
            switch ((((str.hashCode() ^ 868) ^ 703) ^ 494) ^ (-1362543655)) {
                case -1984441868:
                    str = "ۗ۬۠ۨۨۘۨ۬ۗۤۖۦۘ۠ۨۖۘۗ۬۫ۧۗ۠۫ۧۧ۫۠۬ۘۦ";
                    break;
                case -1929337643:
                    ((C4128ma) this.OooooO0).OooOo0O(this.OooooOO, 0);
                    str = "ۢۘ۫ۤۥۘۚۛۤ۟ۦۛۙۗۜۖۢۥۘۜ۬ۜۘۢۗۥۘۚۨۨۘۖۧۢ۟ۤۦۘۛۖۖ";
                    break;
                case -1734763944:
                    str = "ۜۨ۠ۨۜۨۘۤۡۥ۫ۧۢۦۨۦۘۖۗۥۘۢۜۧۘۜ۠ۦۘۚ۠۫ۛۢۙ۠ۢ۟ۧۘۖۘ۟ۨۜۖۦۙۙۛۘۘۨۛۖۘ";
                    textView = (TextView) alertDialogOooO0o0.findViewById(R.id.id_tv_superimposed);
                    break;
                case -1409357654:
                    str = "ۗۢۖ۫۟۠ۘ۫ۡۨۧ۫ۙۖۨۘۘۡۜۘۗ۬ۙۨۢۜۖۖۦۘۚۢۡۗۢۖ۫ۛۦۘۡۡ۟ۙ۫ۤ";
                    alertDialogOooO0o0 = C4460v9.OooO0O0().OooO0o0(this, R.layout.dialog_overlay_regcode, R.style.Theme_Dialog);
                    break;
                case 86774044:
                    str = "ۢۘ۫ۤۥۘۚۛۤ۟ۦۛۙۗۜۖۢۥۘۜ۬ۜۘۢۗۥۘۚۨۨۘۖۧۢ۟ۤۦۘۛۖۖ";
                    break;
                case 109360355:
                    return;
                case 132583416:
                    textView.setOnClickListener(new OooO0o(this, alertDialogOooO0o0));
                    str = "ۡۖ۟ۡۗۘۘۦ۫ۦۢۤۚۗۧۜۘۦۢۘ۠ۤ۬ۗۛۨۨۤ۫۠۬ۦۘ۬۫ۧۛۡۜۘۜۨ۫ۧۥۘ۟ۘۘۘۘۢ";
                    break;
                case 292460292:
                    str = "ۙ۟ۜۚ۫ۢ۫ۤۖۛۥۡۨۘۡۛۨۘۜۛۘۘۖۖۜۢ۫ۜۘ۬ۘۘۢۘۜۘۤۡۨۘۨۤ۟ۦۚۥ۠ۚۜۛۙۥۘۗۙۦۨۥۨ";
                    textView2 = (TextView) alertDialogOooO0o0.findViewById(R.id.id_tv_no_superimposed);
                    break;
                case 545905956:
                    alertDialogOooO0o0.setCancelable(false);
                    str = "ۘۤۦ۫۠۬ۨۥۜۖۦۛ۟ۤ۫ۖۚۦۘۗۘۤۛۥۡۥ۫ۡۘۦۚۚ";
                    break;
                case 1532993188:
                    String str2 = "۫ۨۜۢ۟ۖ۬ۨۚ۫ۤۘۙۛ۠ۡۦۛۢ۠۟۫ۤۥۘۛ۠ۨۘۦۥۖ۬ۚۜۘ۬ۚۜۤۧ۟ۥۗۦ۠ۨۜ۟۠ۦۖۛ۫ۢۥ۠";
                    while (true) {
                        switch (str2.hashCode() ^ 2061138967) {
                            case -2058138149:
                                str = "ۨۨۦۘۛ۫ۘۘ۫۬ۧۖ۠ۨۘۘ۬ۜۘۛۘۦۜۖۡۦۘۥۘۛۥۤ۫ۡ۬ۤۘۖۚ۟ۡۤۘۘۗۗۨۘ۬ۦۡۘۖۧۨ";
                                continue;
                            case -174854549:
                                String str3 = "ۙ۬ۤۘۜۨۗۥ۫ۙۧۘۨۡۥۘۥ۬ۙۖ۬ۥۘۧۘۦۢۥۜۘۛۙۙ۟ۢۥۗۛۚۥۦۘۢ۟ۜۘۧ۬ۡۦۤ۠";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1679854545)) {
                                        case -322619534:
                                            str2 = "ۨۖۘ۟ۜۨۘ۟۠ۜۘۨۜۚۤ۟ۥۨۗۡۚۚۚۖ۟ۢۜ۠ۧۨۤۡۘ۫ۧۦۢ۟ۖۘۙۤۖ۫ۖۡۘۚ۫ۢۛۡۢ";
                                            break;
                                        case 1542971041:
                                            str3 = "ۨۘۙ۫۟۫۫ۧ۬۬ۜ۬ۜۤ۟ۜۘ۠ۤۥۛ۬ۗۙ۬۬ۙۗۢۖۘ۠ۥ۟ۗ۠ۡۨ۫ۤ۬۠ۛ";
                                            break;
                                        case 1888805539:
                                            str3 = queryRegCodeInfo.IsSuperposeConfirm == 1 ? "ۢۜۜۘ۠ۜۙۙۤۡ۠ۨۛۤۦ۫ۧۙۥۚۛۚۛۤ۟ۨۛۦۘۚۤۨ" : "ۙۢۦ۫ۤۜۢۡۨۘ۬۫ۧۖۧۨۘۜۥۦۗۦۗۛۢۘۘۖۗۢ۠۠ۖۘ";
                                            break;
                                        case 2079647712:
                                            str2 = "ۗۜ۟۬۫ۧ۬ۢۢۖۦۧۘۥۢۧۙۖۖۘۧۙۜۤۧ۟ۚۘ۠ۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1780586369:
                                str2 = "ۨۛۜۧۦۡۘۤۖۥۥۢۖۘۛۜۧۘ۬۫ۖۛۤۡۘۦ۟ۚۦۜۘۘۘۤۛ۬ۙۡۘۛۖ۠۠ۤۖۘۘۛۡۘ";
                                break;
                            case 1813890304:
                                str = "۠ۙ۠ۗ۟ۡۘۢۨۨۜ۟ۗۗۗۡۚ۠ۘۢۢۖۘۦۘۨۦۖۖۘۢۚۛ";
                                continue;
                        }
                    }
                    break;
                case 1675165934:
                    alertDialogOooO0o0.show();
                    str = "ۛۜۧۧ۫ۗۜۧۦ۟ۗۙۜۜۧ۫ۜۧۘۜ۫ۜۘ۟ۦۖۘ۟ۧۛ۫۫ۥۢۤ۠ۙۚ۫";
                    break;
                case 1768916605:
                    textView2.setOnClickListener(new OooO0OO(this, alertDialogOooO0o0));
                    str = "ۚ۟ۡۦ۟ۥ۠ۚۖۤۨۦ۬ۖۘۘۙۙ۠ۨ۠ۡۡ۠ۙۜۦۗۜۘۘ۬ۨۖۘۡۨۙ";
                    break;
                case 1791084679:
                    str = "ۖۢۙ۠ۛۤۛۡۨۙۖۖۥ۫ۧ۬۬ۜۘ۬۬ۚۖۦۥۥۛۥۘ۠ۤۧ۫ۘ۟ۘۡۘۙ۬ۡ۫۫ۜۘ";
                    break;
            }
        }
    }

    private void OooOOo0() {
        TextView textView = null;
        TextView textView2 = null;
        TextView textView3 = null;
        TextView textView4 = null;
        View view = null;
        View view2 = null;
        View view3 = null;
        int i = 0;
        BuyRegCodeConfigInfo buyRegCodeConfigInfo = null;
        TextView textView5 = null;
        int i2 = 0;
        int i3 = 0;
        String str = "ۧۦۖۘۡ۬۬ۢۗۦۘ۫ۧۦۧۡۚۡۗۛ۟ۤۛ۟ۨۘۥ۫ۨ۫ۡ۬ۢۚۡۘۛۧۧ";
        while (true) {
            switch ((((str.hashCode() ^ 226) ^ UiMessage.CommandToUi.Command_Type.GET_VISIBLE_VALUE) ^ 494) ^ 1498874396) {
                case -2133436959:
                    return;
                case -2124336352:
                    textView5.setVisibility(0);
                    str = "ۢۦۘۘۢ۫ۥۢۙۜۗۥۨۘۢۧ۫۬ۚۨۘۥۡ۫۠ۚۡۘۦۨۥ۫ۡۧۘ";
                    continue;
                case -2028365446:
                    textView5.setOnClickListener(new OooOO0O(this, buyRegCodeConfigInfo));
                    str = "ۛۧۦۦۖۖۦ۬ۖۥۨۧۘ۠۠ۥۘ۠ۜ۬ۚۡۤۜۜ۟۠ۜۢۨۥۖۛۨۢۧۡۖۘ";
                    continue;
                case -1768338233:
                    textView3 = this.o0OoOo0;
                    str = "ۦۡ۫ۢۢۡۘۡۖۧۢۦۘۘۤ۫ۨۘۤ۠ۘۘۥ۬ۤۘ۫ۜۘۢۖۥۘۘۘۡۛ۟۬ۦۡۘۨۦۚۤۜۡ";
                    continue;
                case -1564553388:
                    new View[]{view, view2, view3}[i3].setVisibility(0);
                    str = "۬ۖ۬ۥۦۧۘ۬ۦ۬۟۫ۨۘۚ۠ۧۛۡۘۗۘ۬ۥۚ۟ۧۜۙۧ۠۫";
                    continue;
                case -1437307707:
                    String str2 = "ۦ۠ۥۧۜۥۘۙۦۛۖۤۙۤۘۢۗۖۥۦۘۨۧۜۘ۠ۛۨۘۡۦۘۘۢۡۜۘۜۙۡۘۛ۟ۛۚ۠ۜۘۜۜۤ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1333617377)) {
                            case -557432793:
                                str2 = "ۦۨۧۤ۬ۜۘۚۨ۟ۙۗۜۦۗۗۗۜ۠ۥۜۘ۟ۚۘۨۥۜۘ۟۬۬ۘۘۥ۫ۧۡۚۨۘۦ۬ۛۙۜۧۘ۟ۖۜ۬ۜۘ۬ۨۚ";
                                break;
                            case -12969344:
                                String str3 = "۫ۧۜۘ۬ۢۜۘۘ۬ۥۘۗ۫۬ۛۧۚۧۤۗۥۛۥۘۢۜ۟ۘۘۚۦ۟ۘۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 626477735) {
                                        case -2059082809:
                                            str3 = "ۗۥۨۘ۫ۢۧۙۙۖۘۧۨۛۙۨۥۖ۟ۜۙ۠ۡۘ۠ۡ۫ۥۥ۟ۜۙۛۨۗۛۧۖ۟۟ۙۢۗۜ۠";
                                            break;
                                        case -2016915121:
                                            str2 = "ۘ۫ۖۘۗۚۗۗۖ۬ۧۗۛ۟۫ۨۥۖۚۤۖ۟ۤ۟ۗۘۖۚۚۗۦۘۘۤۡۘۡۥۦۘۗۡ۫ۨۘ۫";
                                            break;
                                        case -1367257555:
                                            str3 = C4125m7.OooO0o0().OooO0o.size() > 0 ? "ۚ۟۟۠ۗۨۘ۫ۚۖۛ۠۫ۢۘۡۜۖۘۘۘۥۦ۠۬ۢۡۧۘۨۗۗ۫ۦۘۘۧۖۨۘۙ۟ۙۗۛ۟ۖۗۨ۠۬ۜۘۘۙۡۢۛۤ" : "ۚۨۡۜۛۚۚۢۗۖ۫ۡۛ۬ۥۦۧۨۘۚۢۜۧۙۖۘ۫ۥ۟ۘ۟ۤۜ۟ۖۘۜۡۜۦۖ۫۬ۜۜۘۢۘۥۘۧۚۡۘ";
                                            break;
                                        case 101257624:
                                            str2 = "ۤۜۨ۟۟ۥۛۦۦۚ۟ۦۘۤ۬ۙ۫۟ۖۢۧۗۧۡ۠۟ۗۗۨۢۜۘۛۧ۟ۧۙۜۦۡ۟ۦ۬ۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1593332098:
                                str = "۫۟ۜۛۨۡۖۖۡۡۜۚۧۙۧ۟ۨۜۘ۠ۙۛۤۧۘ۫ۨۘۛۦۨۘۡۡۜۘۗۧۦۘۗۧۤۡۗۨۙۘۛۥ۫ۛ";
                                break;
                            case 1770407578:
                                break;
                        }
                    }
                    break;
                case -1402822155:
                    i2 = i3 + 1;
                    str = "ۜۢۖۘۖۘۦ۟ۜ۫ۗۤۥۘۚۤۘۘۤۤۥۘۦۦۧۘۡۚۨۘ۠۫۫ۙۙۦۘ۠ۦۢۛۤ۠ۦۦۘ۬۠ۙ";
                    continue;
                case -696779374:
                    this.Oooooo0.setVisibility(8);
                    str = "ۙ۬ۤ۫ۥۗۖۥۛۘ۠ۢ۠ۛ۬۠۬ۚۘۨۖۨ۬۬ۥۤۘۦۘۥۘۘ۫۠ۧۦۦ۫۟ۘۜ۠ۚۥۛۡۗۘ۠ۚۚۥۧۘ";
                    continue;
                case -655350333:
                    String str4 = "ۦۡۛ۠ۦ۫ۛۗۘۘۡ۟ۥۢۦۛۜۙ۬ۤ۫ۦۤۚۜۡۡۧ۬ۤۚ";
                    while (true) {
                        switch (str4.hashCode() ^ 489126645) {
                            case -1443247255:
                                str4 = "۟۟۫ۖ۟ۚۨ۫ۧۙۧ۬ۙۧۧۥۘۜۜ۫ۡۘۚۙۘۚ۫ۦۧۖۡ";
                                break;
                            case -1185107371:
                                str = "ۨۥۧۘ۠ۦ۫ۗۙۘۛۥۖۘۨۗۢۛۙ۟ۥۢۗ۬ۜۤۚۙۖۨۤۖ";
                                continue;
                            case -612211339:
                                String str5 = "ۙۡۚۖ۟ۨۡ۬۬۟۟ۥۦۙۡۖۗۙۜۤۖۘۨۡۥۗۡۦۘۥۨۘۘ۬۫ۛ۬۠ۙۗۢۙ۬۟ۘۙۜۗۢۢۖۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1645108541) {
                                        case -1207011264:
                                            str5 = "ۨ۬ۡۦۥۤۥ۠ۦۘۡۨ۠ۚۨۡ۟۫ۖۦۗۙۛۖۢۚۡ۠ۦۨۥۘ";
                                            break;
                                        case 1380779565:
                                            str5 = 3 < C4125m7.OooO0o0().OooO0o.size() + (-1) ? "ۛۚۘۨۖ۫ۨۗۤۥۡۢۙۨ۬ۥۨۢۗۦ۠ۦۖ۠ۡ۫ۡۧ۠ۗ" : "ۦۤۡۗۜۘۘۨۙۦۜۘۖۨۤۜ۬۬ۨۛۥۘۗ۫ۛۧۤۦۘۤۨۛۙۜۙۚۜۘ۫ۤۖۘۤ۟ۘۘۖۥۤۨۖ۠ۖ۬ۡۘۘ۠ۡۘ";
                                            break;
                                        case 1561948585:
                                            str4 = "ۘ۬ۚ۠ۗۗۜۘۖۘۗۧۢ۫ۡۘۗۚۖۖۡۤۖۧۜۜۖۛۘۥۘۘ۬ۚۨ۬۠۬۟ۜۢ۠ۘۛۨ۫۠۬";
                                            break;
                                        case 1917808196:
                                            str4 = "ۚۦ۟ۦۤۡۘۤۡۚۨ۫۬ۘۛۚۧۦۘ۟۟ۥۖ۫۟ۥۡۡۘ۠ۛ۬۠ۥ۠ۡۥۡۥۤۖۘۤۦۧ";
                                            break;
                                    }
                                }
                                break;
                            case -492475926:
                                str = "۬ۖ۬ۥۦۧۘ۬ۦ۬۟۫ۨۘۚ۠ۧۛۡۘۗۘ۬ۥۚ۟ۧۜۙۧ۠۫";
                                continue;
                                continue;
                        }
                    }
                    break;
                case -391629623:
                    textView2 = this.Ooooooo;
                    str = "ۨۨۦۘۡۖۤۨۢۗۡۦ۫ۨۢ۟۫۟۟ۙۥۖۘۜۤۖۘۙۛ۠ۨ۫ۖۘۡۧۨۙۡۤۨۗۡۘۨۖۧۘۘۤۡۙۗۨۘ";
                    continue;
                case -268343728:
                    textView5 = new TextView[]{textView, textView2, textView3, textView4}[i3];
                    str = "۠ۢ۫۫۬ۘۘ۠۟ۡۘۙۜ۫ۘۘۖۘ۬۬۠ۢۡ۬ۧ۬ۚۨ۠۬ۚۙۚۨۗ۫ۨۥۖ";
                    continue;
                case -253417934:
                    str = "ۗۛۤ۬ۧۗۢۥۛۗۢۦۥۥۜۜۦ۠ۘ۟ۚۦۨۡۘ۟ۛۚۢۢ۟ۡ۫ۚ۠ۜۨۘ";
                    continue;
                case -215245942:
                    String str6 = "ۗۚۡۘۧۗۥۛ۠ۧۥۘ۠ۧۡۙۢۗۥۘۧۗۚ۫ۚۡۘۧۦ۫ۦۧۘۡۜ۟ۡۗۥ";
                    while (true) {
                        switch (str6.hashCode() ^ 291645337) {
                            case -2010369349:
                                str = "ۤۨۤۜۤ۫ۨۦ۠ۨۚۦ۟ۤۨۘ۠ۢۡۘۙ۫۬ۥۙۦۛۗۡۨۢۗۛۜۜۜۗ۬ۢۨۦۗ۬۠۟ۡۘ۫ۗۡۨۙۤۦۦۨ";
                                continue;
                            case -1676576910:
                                str6 = "ۦۧۧۨ۫ۛ۟ۢ۬۟ۗۗۜۨۜۖۗۨۖۦۧۡۖۦۙ۠ۗۨۘۛۤ۟ۧۜۖۘ۠ۘۚ۠ۡ۟";
                                break;
                            case -1463378628:
                                String str7 = "ۜۥۥۗ۫ۙ۬ۨۜۘۛ۠ۘۥۜۘۘۘۜۘۘ۬ۢۢۚۘۨۜۢ۟ۦۧۘۗۘۦۘۢۙۥ";
                                while (true) {
                                    switch (str7.hashCode() ^ 242271879) {
                                        case 277161372:
                                            str6 = "۠ۜۥۡۘۘۘۗ۬ۢۦۥۖۥۦۙۛۢۘۘۛۗۘۢۛۗۦ۬ۘۤۜ۟ۖ۫ۥ۠۬۫ۥۧۘ۟ۦ۫ۥۜۜۘۧۨۨ";
                                            break;
                                        case 637525653:
                                            str7 = i3 < C4125m7.OooO0o0().OooO0o.size() ? "ۘۚۚ۠ۦۧۘۨۗۘۛ۠ۡ۬ۨۦۙۤۗۨ۟ۡ۠۫ۦۘۡۙۘۘۤۦۧۘ۫ۧۘۘ۫ۥۨۘ" : "ۛ۫ۘۡۚۥۢۨۧۘۚۡۖۘۜۨ۟۫ۘۘۘۡۗ۫۟ۜۘۙۖۥۘۘۡۘ۟ۥۦۘ۬ۚۨۢ۬ۘۧۛۜۘۧۦۡۘۖ۫";
                                            break;
                                        case 1593156771:
                                            str6 = "ۨۤۡۘ۟۬۠ۗ۟ۜۘ۫ۜ۫ۚ۬ۗۧۘۦۢۡۨ۟ۧۘۨۡۢۨ۬۠ۘۡۜۗۦۘۘۦۖۘۗۜۘ۠ۗۖۘۙۨۚۥۙۧ۟ۛۛ";
                                            break;
                                        case 2083002771:
                                            str7 = "ۛۥۨۘۥ۫۬ۨۛۘۜۘۤۜۗۦۘۛۤۨۦ۬ۡ۬ۗۦۗ۟ۛۧۛ۟";
                                            break;
                                    }
                                }
                                break;
                            case -595739000:
                                str = "ۦۥۡۧۡۘۘۘ۠ۢۚۥۜۘۗۦۢۛ۫ۖۘۧۡۘۡۡۦۥۘۤۖۢ۠ۧۡۘۚ۬ۘۚۙ۠ۘۦ۬۟ۛۗۨۡۧ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case -184846279:
                    view = this.ooOO;
                    str = "۫ۜۥۘۨۨ۫ۤۡۦۦۧۜۘ۟ۘۡۘ۫ۙ۠ۥۧۘۘۙ۟ۘۢ۬ۦۨ۫ۤ";
                    continue;
                case -100530064:
                    view2 = this.o00O0O;
                    str = "ۗ۟ۗۥۜۜۘ۬ۙۤۗ۟ۧۨ۬ۤۚۨۜۘۘۚۜ۬ۥ۠ۘ۬ۢۗۡۘۘۗۡۘۙۙۡۘۗۙۤۘۖۨۘۡ۠۠ۧۚۧۨۡۨۘۧ۠ۦۘ";
                    continue;
                case -86963862:
                    str = "ۛۦۜۥۖۘۧۨۖۘۗۥۖۜۨۥۛۜۛۥۦۦۤۧۥۜ۬ۜۢ۠ۙ۬۬ۤۦۧۜۘ۬۟۫ۧۙۧۖ۫ۖۘ۬ۖۢ۠ۧۥۘۡۧۥۘ";
                    buyRegCodeConfigInfo = C4125m7.OooO0o0().OooO0o.get(i3);
                    continue;
                case 33298832:
                    this.Oooooo.setVisibility(0);
                    str = "ۚۡۢۖۢ۬ۤۙۨۘۛ۬ۦ۠ۜۖۙۢۢۙۘۘۖ۠ۨ۫ۢ۫۟ۨ۠۫ۘۘۙۛۨۜ۠ۙۘۨۘۛ۟۟ۢۦۧۘ";
                    continue;
                case 328066159:
                    this.Oooooo0.setVisibility(0);
                    str = "ۦۥۡۧۡۘۘۘ۠ۢۚۥۜۘۗۦۢۛ۫ۖۘۧۡۘۡۡۦۥۘۤۖۢ۠ۧۡۘۚ۬ۘۚۙ۠ۘۦ۬۟ۛۗۨۡۧ";
                    continue;
                case 693237697:
                    textView5.setText(buyRegCodeConfigInfo.ButtonName);
                    str = "ۨۧۗۖۗ۬۠ۦۥۘۤۚ۫ۗ۬۠ۙۘۡۘۤۥۖۤۦۧۘۥۢۘۘ۬ۦۨ";
                    continue;
                case 957316703:
                    view3 = this.o00Oo0;
                    str = "۬۟۬ۙۤۙۥۤ۫ۖۜۘۙۥۥۡۛۛۦۗۜۙۥۦۘۥۛۨۘ۟۫ۡۘۛۡۘۚ۬ۨۘ۟ۨۘۨۚۘۘۨۦ۫ۘۜۨۘۧۨۚۙۤۥۘ";
                    continue;
                case 982324789:
                    str = "ۗۛۤ۬ۧۗۢۥۛۗۢۦۥۥۜۜۦ۠ۘ۟ۚۦۨۡۘ۟ۛۚۢۢ۟ۡ۫ۚ۠ۜۨۘ";
                    i3 = i;
                    continue;
                case 1113596275:
                    str = "ۥۘۤ۫ۦۧۦ۠۠ۜۜۘۢۨۘ۫ۘۘۜۧۨۨۜۗۢۗ۟ۙۢۦۚ۬ۦۚۢۡۢ۫۫ۨۨ۠ۡ۬ۢ۠ۡۛۤۜۨۤ۫ۢ";
                    i3 = i2;
                    continue;
                case 1712274890:
                    textView = this.OoooooO;
                    str = "ۗۛۖۘۥۙۨۜۖۡۘ۫۠۫ۗ۠۟۫۬۫۠ۘۧۘۤۖ۟ۢۘۗۚ۠۬۠۬ۨۘۨۚۗ";
                    continue;
                case 1745636403:
                    i = 0;
                    str = "ۧۛۙۚۘۨۘۖ۫۟ۚۚۘۘۖ۠ۖ۬ۘۙۧۦۡۘ۫ۧۚۛ۬ۡۘۥۨۙۤۨ۟ۖۢۛۛۦۤۗ۫ۚ۫ۦۘۦۖۥ";
                    continue;
                case 2022792304:
                    textView4 = this.o00Ooo;
                    str = "ۜۚۨۘۜۗۦۘ۟ۛ۠۫ۖ۟ۧۦۥۥ۬ۘۤۡ۫ۛۥۧۚ۬ۜۘۨۙۡۘ";
                    continue;
                case 2038325173:
                    str = "ۗۢۧ۠ۢۢۧۙۛ۬ۤ۠ۚۧۥۘۖۗۦۘ۠ۢۗۙۜۥۚۡۘۦ۫۠۬۟ۜ۬۠ۛۛۖ۫ۙۡۜۘۧۦۙۢۥۨۘ";
                    continue;
                case 2102522022:
                    String str8 = "ۘۥۦۥۦۖۘۥۗۦۥ۬ۜۘۨۡۦۘۛۗۖۘ۬ۙۜۖۨۖۘۨۨۙۥۘۛۗۥۧۥۜۘ۫۟۟۫ۨ";
                    while (true) {
                        switch (str8.hashCode() ^ 1731613509) {
                            case -1828259127:
                                str8 = "ۙۜۧۘۧۢ۫ۥۗۦ۟ۨۨۨ۫ۡۘۨۢۦۘۗۤ۫ۗ۫ۗۤۛ۫۫ۚۙۡ۫ۚۙۖۜۘ۫ۖۘۨۧۛ۟ۚۢۧ۬ۥۘۧۚۨۘۜۖۥۘ";
                                break;
                            case -1620117710:
                                break;
                            case 260137178:
                                str = "ۗۥۜۤۖۥۧۦۧۘۛۢۜۘۢ۬ۨۘۙۘۦۘۦ۬ۘۛۥۚۘۥۖ۬ۘۥۘ";
                                break;
                            case 1833250615:
                                String str9 = "ۧۦۧۨ۟ۖ۠ۗۘۘۥۗۘۙۢۡ۟ۘۘۜۡۙۡۗۥۨۨۖۘۛ۫ۧۙۡۨۚۨۘۦ۫۫ۥۦۨۜۡۡۧۜ";
                                while (true) {
                                    switch (str9.hashCode() ^ 1361846338) {
                                        case -122101460:
                                            str8 = "۬ۙۤ۟۠ۖ۟ۘۧۡۦۤۘۦۙۥۛ۫ۛۖۘۙۘۥۧۛۢۨۗۧۙۘ۠۟ۧۡۛ۠۬ۨ۬ۛۖۜۘ۠ۤۦۘۜۥۨۗۘۘۘ";
                                            break;
                                        case 166844690:
                                            str9 = "ۙۚۢ۬ۨۡۥۜۨۘۤۧۨۘۢۖۛۚۗۥۛ۠۫۫ۨۖ۫۟ۙۙ۟ۧ";
                                            break;
                                        case 1244976812:
                                            str8 = "ۢۢۜۘ۟ۛۡۘۚۗۥۘۦۡۘۘۙۜۡۖۥۛۙۢۥۨۖ۬ۛۘ۫ۙۡۜۧۘۛۦۧ۠ۢۘۜۡۥۘۗۦۜۛ۠ۖ";
                                            break;
                                        case 1291918857:
                                            str9 = C4125m7.OooO0o0().OooO0o != null ? "۠ۦۨ۟ۨۛۜۜۧۘ۟ۚۚ۟ۛۡۡ۟ۚۜۡۗۨۦۥۧۦۧۘۤ۫۟۫ۤۦۘۢ۟ۜۦۤۜۤۤۘ" : "ۥۦۨ۫ۘۗۢۢ۬ۜۥۧۜۡۢۙۘۥۜۢۨۘۖۥۨۘۢۨۥۘۢ۟ۛۨۚۤۚۧۛ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
            str = "ۧ۠ۤۗ۬ۜۢ۠ۜ۫۬ۛۙ۟ۤۢۤۥۦۨۘ۫ۧ۫ۖۧۦۘۨۦۤ";
        }
    }

    private void OooOOoo() {
        String str = "ۗ۫ۨۨ۫ۥ۫۠ۜۥۙۦۜۜۧ۟ۙ۫۠ۜ۬ۚۚۘۘ۠ۚۤ۫ۡۡۘۢۧۢۙۤۤۤۢۘۘ۠ۖۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.FW_SET_WIDTH_VALUE) ^ 372) ^ 687) ^ (-267215638)) {
                case -1860675179:
                    str = "ۙ۠ۥۨۡۡۘۨۛ۠۬ۜۖۘۚۙۜۘۜۡ۬ۦۘۦۡۜۡۚۧۤۧۛ۫ۘۖ۠ۦۧۘۡۡۖۗۢ";
                    continue;
                case -1835905789:
                    String str2 = "ۗۘۖۘۥۚۥۘۧۖۥۘۚۗ۠ۡۗۘۘۢۛۛۘۨۨۛۖۜ۠ۥۡۚۙۡۘ۬ۖۖۥۢۨۘۥ۠ۗۤ۫۠ۡۦۘ۠ۤۙ";
                    while (true) {
                        switch (str2.hashCode() ^ 1875769495) {
                            case -1807615623:
                                break;
                            case -709315470:
                                String str3 = "ۗۨ۬۠ۚ۠ۖۥۗۡۚۚۗۙۦۘ۬ۜۘۢۛۚۥۨۛ۫ۦۨۘۡۥۦۗۥۦۗۤۚۨۗۤۗۡۜۘۦۗۙۢۦۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 349731007) {
                                        case -1209979086:
                                            str2 = "ۘۙۖۘ۟۫ۜۘ۟ۨۗۜۧۥۘۘ۫ۖ۟ۙ۠ۡۦۘ۫۟ۜۥۡۡۦۡۡۘۨۡۥ۟۟ۨۘ";
                                            break;
                                        case -945395502:
                                            str3 = ContextCompat.checkSelfPermission(getApplication(), "android.permission.CAMERA") == 0 ? "ۢۧۛۦۧۥۘ۬ۡۘۘۖۘۚۧ۟ۤ۫ۤ۬ۙ۠ۛۡ۟ۡۘ۫ۨۡۙۥۛۡۥ۫ۦۤۥۘ" : "ۧ۟۬۫ۚۡۘۧۨۦۥۨۛ۠ۧ۟ۙ۫ۜۚۘۛ۬ۘ۫۠ۥۙۦۨۘۘ۟ۢ۠۬ۦۖ۠ۥۖۙۙۘۘۛۖۦۘ۠۫ۧۢۛۙۖۦۡ";
                                            break;
                                        case -54018148:
                                            str2 = "ۤۘۧۘ۠ۛۘۘۦۜۨۘۦۗۗۛۖ۠۠ۨۖۥ۬ۘ۠۟ۧۖۗۧۛۙۙۡۡۛۥ۫ۚۜۧۘۢ۬ۡۡ۟ۥۘ۫ۚۨۧۢۙ۟۟";
                                            break;
                                        case 1412372059:
                                            str3 = "۟۬ۥۢ۫ۙۜ۫ۥۘۖۗۦۘۜۛۚۚۥۘۘ۠ۘۖۘۢ۬ۡۘۖۗۖۧۤ۫ۥۜ۫ۧۗۥ۟ۖۙ۟۫ۗ۬ۦۘۘۙۛ۟ۢۖۥۚ۬ۤ";
                                            break;
                                    }
                                }
                                break;
                            case -430879927:
                                str2 = "۬۠ۘۡۧۖۡۨۧۘۘ۬ۡۘۨۜۖۤۧۨۨۢۛۗ۠ۡۤ۠ۥۘۥۤۥۤۨ۬ۚۢ۫ۦۥ۫ۙۗ۟";
                                break;
                            case 372921673:
                                str = "ۛ۠ۥۘۗۖۧۘۗ۟۬۬ۙۗۜۧۥ۠۬ۧۦۧ۟ۢۢ۬ۘۗ۠ۗ۠ۢۤۗۜۘۖۛۨ۠ۛۗۙۗۙ۫ۛۘۘۥ۬ۨۘۤۘۧۘۖۖۖۘ";
                                break;
                        }
                    }
                    break;
                case -1723103649:
                    ActivityCompat.requestPermissions(this, oo000o, 1000);
                    str = "ۘۡۦ۫ۗ۟ۦۗۘۘۗۡۗۜۡۙۗ۫ۨۘ۬ۗۦۘ۟ۧۧۘۧۧۘۘۦ۠ۘۗۥۡ۬ۗۖۙۖۚۗۙۜۜ۠ۙۜۘ";
                    continue;
                case -1643306458:
                    String str4 = "ۥۦ۠ۘۨۧ۫ۜۛۦۦۙۧ۫ۚۚ۠ۤۡۧۙۨۥۗ۟ۘۤ۟ۡۘۙۗ۬ۧۧ۟ۘ۟ۗۨۖۥ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1106157735)) {
                            case -1228412339:
                                str4 = "ۖۘ۫۠ۤۖۘۡۚۜۘۡۚۘۘۜۨۙۦۛۦۜۛۡۘۡۤۥۘۧۘۥۡۤ۫۬ۡ۫ۖۡۘۜۥۧۗۢۥ۠ۛ۠ۥۚ";
                                break;
                            case -1183457665:
                                str = "۬ۛ۫ۡۜۚۡۤۜۨۘۨۛۧ۬ۙ۫ۖۘۖۙۦۘۗ۟ۘۗ۬۟ۢۨۥۙۛۥۘۥۖۧۘۛۛۡۦ۠ۢۦۨۧۘۨۙۨۘ";
                                break;
                            case 291703674:
                                break;
                            case 869439072:
                                String str5 = "ۡۘۤۙ۠ۜۘۖۧۘ۟ۢۗۖۖۖۘ۫ۗۖۘۚ۬ۚۘۗۨۙۘۡۙۤۤ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1309567026)) {
                                        case -1048064678:
                                            str4 = "ۢۤ۠ۦۗۨۘۜ۟ۖۘ۫۠۠ۡۢ۟۟۫ۗۘۚۙۤۙۜۘ۫ۛۧۚۤ۬ۘۧۚ۟ۡۥۡۜۡ۠ۢۥۘۛۢۦۡۘۦ";
                                            break;
                                        case -335602517:
                                            str5 = Build.VERSION.SDK_INT >= 23 ? "ۡ۠ۖۖۛۜۚۤۥۘۚ۟ۛۗۚ۟ۘۥۙۖۢۗۦ۟ۖۘۜۜۗۤۙ۠ۦ۠ۚۤۚۜۘ۠ۗۤۢۛۦۘ" : "۟۟ۖۦۚۖۡ۬۟ۚۘۜۥۖۥۖۖۥۚ۟ۜۘ۬ۛۖۘ۠ۨ۠ۖۙۖۘۧۙۘۜ۟ۢۖۥۜۘۚۦۖ۫ۘۘۗۡ۟";
                                            break;
                                        case 870686169:
                                            str5 = "ۢۤۙۙۤۛۤۜ۫ۛ۠ۡۜۜۖۚۦۘ۟ۡۘۨ۫ۨۘۦۦۖۘ۬۫ۦۘۨۛۥ۫ۛۧۛ۟۠ۙۙۧ";
                                            break;
                                        case 1293725570:
                                            str4 = "۬ۙۜۘۛ۫۠ۥۤۙۥۗۦۧۙۦۛ۫ۥۜ۠ۤۚ۠۟ۥۘۙۧۚۦۡۜۡۨۛ۟ۥۤۜ۟ۨۦۘۧۖۦۦۤ۠ۜۛۖۥ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -175743953:
                    str = "ۛۨۚ۠ۗ۠ۦۜۥۖۘ۬ۛۙۖۨۙۖۘ۬ۥۛۛۥۦۘۥۧۨ۟ۛۗ۠ۙ۫ۧۖ۟ۥ۟ۜۢۨۘۗۡۙۘ۬۫";
                    continue;
                case -49176308:
                    return;
                case 1607446340:
                    OooOo00();
                    str = "ۙ۠ۥۨۡۡۘۨۛ۠۬ۜۖۘۚۙۜۘۜۡ۬ۦۘۦۡۜۡۚۧۤۧۛ۫ۘۖ۠ۦۧۘۡۡۖۗۢ";
                    continue;
            }
            str = "ۙۗ۫ۤۡۖۘۖۦۜۤۨ۫ۦ۬ۡۘۛۡۡ۠۫ۗۗۨۜۘۥ۟ۦ۫ۚۜۧۦۤۢۖۙۦۛ۟ۤۚ۟ۥ۟ۗۡۖۘ۠ۤۤۥۤ";
        }
    }

    private void OooOo00() {
        String str = "۫ۚۨ۬ۥۦۘۜ۟ۥۘۨ۫ۡۤۢۙۦۙۜۦۡ۟ۘۜۜۚۖۦۢۘۖۘۚ۬ۜۘۜۥۨ";
        while (true) {
            switch ((((str.hashCode() ^ 415) ^ 425) ^ 625) ^ (-442342364)) {
                case -1650352591:
                    return;
                case -1045392092:
                    startActivityForResult(C4496w8.OooOOO(this), 1003);
                    str = "۬ۡۙۛۛۥۘۗۤۢ۫ۥۦۥۤۤ۟ۛۦۖۡۡۖۙۥۘۢۡۖۖۚۡۘۖۨۡۘۢۙۘۜۙۚۜ۬ۡۘۢۨ۠۟ۜۘۘۢۤۡۘۨ۟ۨۘ";
                    break;
                case -480322218:
                    str = "ۤۤۖۘۧ۟ۗ۟ۚۨۘۖۨ۠۬ۤۨ۠ۗۧ۫ۡۥۦ۫ۖ۠ۦ۟ۦۦۘۨ۠ۧۦۚۖ۬ۚۘۘۜۨ۟ۧۥۙ۠۟ۙۥۦۘۤۛ۫";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public void OooO() {
        String str = "۟ۢۦۘۖۧۙۢۥۡۘۛۧۙ۠۫ۥۘۘۘۡۘ۠ۖۘۘۧۛۘ۠ۨ۬ۙۨۘۦۗۥۤۖۚۚۚۤۢۗۛ۬ۨ۫ۥۥۘ۬۟ۜۨۘۚ";
        while (true) {
            switch ((((str.hashCode() ^ 349) ^ 628) ^ 137) ^ (-215181942)) {
                case -87100140:
                    str = "ۥۘۥۛ۟ۘۘۖۧ۟۬ۤۛۛۢۡۡۙۧۨ۟ۙۤۘۥۖۦ۬ۢۜ۠ۨۘۡۗۘۜ";
                    break;
                case 1412781362:
                    return;
                case 1874419790:
                    ((C4128ma) this.OooooO0).OooOo().observe(this, new OooO0O0(this));
                    str = "ۤۨۨۘ۬ۦۡۘۧ۟ۡۘ۫۫ۛۡۚۦۧۜۙ۟۠ۖۨۤ۬ۘۡۘۘۧۘۡۘۥۗۚۨ۠ۦۙۢۛۦۜ";
                    break;
                case 1911656681:
                    ((C4128ma) this.OooooO0).OooOo0o().observe(this, new OooO00o(this));
                    str = "۠ۙۦۘ۫ۨۨۛ۠ۗۛۚۦۘۤۜۡ۫۬ۥۘۘۘۗۡۤۙۢۗۗۙۨۚۧۨۖۘۡۤۤۦۨۙۦۜۢۛۨ۫۟ۤۖ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public int OooO0oO() {
        String str = "ۖۥۨۘۥۥۘۙ۠ۡۘۧ۫ۥۘۛۜۥۘ۬۫ۨ۠ۛۦۘۤۢۜۖ۠۠ۜ۫ۤۖۧ۬۫ۢۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 437) ^ 816) ^ UiMessage.CommandToUi.Command_Type.GET_VISIBLE_VALUE) ^ (-1707289062)) {
                case -314752357:
                    return R.layout.activity_register_code;
                case 2068735080:
                    str = "۫ۖۨ۬ۖۤ۠۬ۧۚۧۜۘۜ۬ۦۘ۠ۖ۬۬ۧۛۦۜۘۚۤۢۗۘۛۨۘۡۜۜۖ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public Class<C4128ma> OooO0oo() {
        String str = "ۤ۫ۜۘۛۚۥۘ۬ۡۚۤۗۤۢ۟ۡۘۤۤۤ۟۟ۙ۠ۧۡۘ۫ۨۧ۟ۨۛۦ۠ۘۛ۬ۛۨۦۢۗۤۥ";
        while (true) {
            switch ((((str.hashCode() ^ 834) ^ 268) ^ 830) ^ (-1393028898)) {
                case -1076089024:
                    return C4128ma.class;
                case 261623070:
                    str = "۠ۚۗۨ۬ۘۘۙۙۛۨ۬ۖۘۨ۫۠ۛۘۘۗۜۛ۬۬ۤۥۧۖ۬۬ۖ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseModelActivity
    public void initView() {
        String str = "ۧۚۙۤۛۡۢۜۧۘۢ۟ۨۥۧ۬ۢۡۤ۠۬ۙۜۦۨۘ۟۬ۜۚۜۖ۟ۛۤ۫ۤ۫۠ۥ۠۬۟ۙ";
        TitleView titleView = null;
        while (true) {
            switch ((((str.hashCode() ^ 722) ^ 948) ^ 487) ^ 1458051874) {
                case -2146814813:
                    this.Oooooo0 = (TextView) findViewById(R.id.tv_empty_msg);
                    str = "ۧۘۛۨۗ۬ۤ۫ۧۜۦۧۛۤۚۧۘۘ۬۟ۜۚ۟ۜ۫ۤۥۨۢۙ۬ۡۙۤۛ۬۬ۥۚۘۙ۬ۚۖۦۘۤ";
                    break;
                case -1394440055:
                    titleView.setOnRightTextViewListener(new OooO(this));
                    str = "ۛۛۡۘۧۤۙۛۙۖۘۖ۫ۥۘۛ۫ۡۘۧۗۡۢۘۗۧۡۥۚۡۘۖۘۘۧۖۧ۟ۨۧۘ";
                    break;
                case -993172728:
                    titleView.setVisibilityTvRight(0);
                    str = "ۤۗ۟ۡۡۧۘ۠ۧۤۧ۫۬ۗۗۡۨۖۡۘۛۤ۬۠ۢۥۘۜۗۛۖۢۢ";
                    break;
                case -940749617:
                    OooOOo0();
                    str = "ۜ۠ۘۘۗۢۨۘۢ۫۟ۗ۠ۤ۠۟ۡۘ۬ۤۘۘ۟۫ۧۚۦۦۚۢۖۘۜ۟ۜ۠۠۫۟ۢۡۗۢۧۥۚۥۘۧۦۘ۬ۗۛ";
                    break;
                case -798675873:
                    this.o0OoOo0 = (TextView) findViewById(R.id.tv_month);
                    str = "۠ۗۢۥۜ۟ۢ۟۬ۨۡۥۨۚۘ۫ۖۦۗۦۥۡۥۥۗ۬ۛ۫ۨۦۢۖۖۛۧۜۘ۟ۥ۟ۡۜۜۨۚۨۘۦ۠ۥۚۙۥۘۙۛۧ";
                    break;
                case -714314547:
                    this.o00Oo0 = findViewById(R.id.line_month);
                    str = "۟۬ۜۧۧ۟۠ۨۢۡ۠ۦۘۤۙۦۡۚ۬ۨۙۡۘۥۘۢۤۜۗۗۡۘۖ۠ۘۜۧ۫";
                    break;
                case -688461907:
                    this.OoooooO = (TextView) findViewById(R.id.tv_day);
                    str = "ۙ۫۬ۙۧ۬ۥۧۦۘۦۘ۠۬ۡۛۛۦۛۘ۠۬۫ۡۘۨۛۗ۟ۢۚۖۙ۬۠۟ۖۤۡۘۥۗۦۥۘ۬ۖۖۦۘۨ۠ۦۘۥۤۨۘ";
                    break;
                case -442529280:
                    str = "ۦۦ۫ۙۖۜۧۗۨۘۦۘۘۗۛۖۚۜۙۛۖۦۘۥۜۨۘۘ۫ۤۙ۬ۨۘ";
                    titleView = (TitleView) findViewById(R.id.id_title);
                    break;
                case -348367862:
                    titleView.setTitleText(getString(R.string.activation_code));
                    str = "۠ۜۡۘۚۖ۬ۘۤۡۤ۫ۜۦۚۨۤۘۚۘۧۜۘۦۖۥۘ۠ۤۜۘۢۙۡۛۥ۬ۡ۬ۖۘۘۗۢۛۛۤۧۚۗ۟ۥۘۖۘۜۗ۫";
                    break;
                case -231816703:
                    ((Button) findViewById(R.id.btn_activation)).setOnClickListener(this);
                    str = "ۖۦ۬ۙۡۦۚۤۜ۟۬۫ۖۦۨۘ۟ۙۤۧۢۜۗۡ۫ۦ۠ۖۘۦۗۖ";
                    break;
                case 87162903:
                    this.Oooooo = (LinearLayout) findViewById(R.id.ll_registration_buy);
                    str = "ۗۛۗ۬ۤۙ۬ۨ۠ۙ۬۠ۖۨ۬ۛۖۦۘۛۘ۠ۤۨۚۥۖ۟ۤۦۛ۠۫ۢۗ";
                    break;
                case 138498510:
                    this.OooooOo.setText(C4273q7.OooO0o0().OooO0o());
                    str = "ۛ۟ۜۘۘۢۥۧ۠ۦ۟ۚۛۖۦۧۘۢۘۡۨۧ۠۬۠ۨۘۙۜۛۦۧۨۜۗۤۨۢۗۤ۠ۢۛۙۗ";
                    break;
                case 229440467:
                    this.OooooOo = (EditText) findViewById(R.id.register_number);
                    str = "ۛۥ۠۫ۧۦۘۨ۠ۥۢۤۤۘۛۨۘۛۨۜ۟ۡۦۘ۟۫۬ۦۡ۬ۨۛۙ۟ۘۥۘۥۛ۠";
                    break;
                case 452022108:
                    this.ooOO = findViewById(R.id.line_day);
                    str = "۫۬ۡۘۨۥۖۘۜۖۜۡۢۚۗ۫ۜۨۡۡۘۧۤۜ۫۠ۥۘۨۗۥۘ۟ۘۥۘۥۚۥۘۘۤۧ";
                    break;
                case 969581323:
                    this.o00O0O = findViewById(R.id.line_week);
                    str = "۟ۖۜۘۚۡۨۘ۟ۛۢ۠ۛۢۗۘۢۨۖۜۘۙۢۨۘ۫۟۬ۨۥ۟ۘۙۗۢۙۦۜۚۨ";
                    break;
                case 1049957039:
                    this.Ooooooo = (TextView) findViewById(R.id.tv_week);
                    str = "ۗ۫ۘۗۥۢۜۘ۬ۨۖۘۧ۫ۛۜۡۖۘۦۖۦۗۨۨۘ۫ۗۥۖۨۤ۟۟ۧۡۚ۠";
                    break;
                case 1055231906:
                    titleView.setRightTvText(R.string.register_code_unbind);
                    str = "ۛۘۡۦۚ۬ۙۥۥۧۙۦۘ۬ۢ۠ۥۤۨۘۗ۫ۨۘ۫ۜ۟۫ۤ۟۬ۧۧ۫ۘۘ";
                    break;
                case 1251120104:
                    this.o00Ooo = (TextView) findViewById(R.id.tv_permanent_card);
                    str = "ۥۘۥۘۨۛۡۘۢۢ۫ۜۜۨ۫ۙۛۘۖۦۗۖۘۥۛۛۤۛۜۘۖۥ۟ۜ۠ۙ۠ۡۘ۬ۘۨۥۡۚ۟ۜۛ۫ۛۦۛ۬ۛۧ";
                    break;
                case 1263847388:
                    findViewById(R.id.btn_sweep_activation).setOnClickListener(this);
                    str = "ۥۘۧۘۙۜۥۨ۟ۗۙۥ۠ۗۖۡۘ۟۫ۥ۫۠ۤۚۚۘۘۘۨۥۨ۟ۜۗۧ۟ۢۜۘۗۙۖۘۗ۟ۨۖ۬ۤۜۢ۟";
                    break;
                case 1327628745:
                    str = "ۧۜ۬ۜ۠ۧۙۤۛۘۜۧۘ۬ۤۢۦ۫ۡۖۘ۬ۙۘۨۥۜۜۘۖۛۥ";
                    break;
                case 1464004293:
                    titleView.setOnLeftImageViewListener(new OooOOO0(this, null));
                    str = "ۘۘۡۘۜۛۙۗۗۦۖ۬ۦۙۡۨۘۡ۟ۜۘ۠ۛ۟۠ۨۙۖ۬ۧ۠ۗۨۘ";
                    break;
                case 1748045950:
                    titleView.setVisibilityRightImage(4);
                    str = "ۦۗۥۥۗۛۤۘ۠ۜۖ۠ۨۜۤ۬ۘۥۘۡۡۦۘ۠ۡۥۘ۫ۤۛۤۖۨۜۤۜ۬ۗۤۖۤۗ۠ۚۙۗۦۘۘۖ۬ۖۘ";
                    break;
                case 1771667017:
                    return;
                case 2034999359:
                    titleView.setleftImage(R.drawable.ic_back);
                    str = "ۡۖۘۡۧۘۗۛۢۧۥۜۘ۬۟۬ۧۨۖۗۘۜۘۥۖۢ۠ۥۙ۟۬ۘۜ۠ۙۡ۫ۜۘۦۢ۬۫۫ۜ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra = null;
        String str = "۠ۤۦۗۡۢۜۜۨۙ۬ۜۘ۠ۤ۟ۛۤۦۘۦۘۛ۬ۘۘۧ۟ۘۘۥۦۡۥۤۜۘۥ۫۟ۨ۫۬ۦ۟ۥۘۢ۬ۥۘۧۚۚۛۦ۠۬۫ۢ";
        while (true) {
            switch ((((str.hashCode() ^ 592) ^ 852) ^ UiMessage.CommandToUi.Command_Type.GET_FW_VISIBLE_VALUE) ^ (-747137469)) {
                case -1746963731:
                    this.OooooOo.setText(this.OooooOO);
                    str = "۫ۚۛ۠ۡۛۢۜۨۖۥۗۙۡۤۦ۫۠ۨۧۘ۫ۡۡۚۡۥۘۦۙۦۘۧۙۨۙ۬ۢۢ۫ۨۤۗۡۡۜۨۘ۬ۥۖۘ";
                    continue;
                case -1524161929:
                    String str2 = "ۜۙۥۗۚ۠ۧۥۙۘۥۨۘ۠ۘ۬ۨ۠ۥۡۚۡۗۥ۬ۥ۟ۜۧۘ۟ۜۢ۟ۖۜۛۛۗۥۚۘ۫ۤ۫ۚۡ۟۬ۦ۟ۛ۬ۖ";
                    while (true) {
                        switch (str2.hashCode() ^ (-169717298)) {
                            case -1835040780:
                                str = "۫ۜۗۛۚۚۤۜ۠ۖۧۜ۠۬ۧۨۙ۟ۗ۬ۘۘۦۙۗۘۜۗۛۛۗۡۢۤۦۦۘ۠ۡۘۘۢۢۤ۠۫۠ۚۖۘۘ";
                                continue;
                            case -1543966915:
                                String str3 = "ۜۙۢۤۧۥ۠ۥۜۚۚۜۘۜۘۧۘ۫۫ۤ۠ۦۧۘۖۖۖۘۜ۬ۜۨۢ۟ۗۘۢۙ۟ۥۨ۬ۤۜۜۘۘ۠۠ۦۘۨۖۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-539553073)) {
                                        case -1495368979:
                                            str2 = "ۙ۬ۙۚۗۛۤۖۢۘۚۘۧۧۢۙ۠ۡۥۜۥۘ۠ۢۡۘۦۦ۠ۡۖۘۤۤۛۥ۬ۙۗۖۖۘۤۚۤ";
                                            break;
                                        case -1323949489:
                                            str2 = "ۢۥۘۨ۠ۥۘۡۥۗۥۧۙۤۗۚۧۜۧ۫ۙۦۘۡۨ۠۠ۘۡ۫۫ۖ۬ۥۧۘۤۛۥۘۧۚۤۜۖۜۤۚۨۧۢۨۘ";
                                            break;
                                        case 1082252902:
                                            str3 = !TextUtils.isEmpty(stringExtra) ? "ۜ۬ۡ۠۫ۘۘۙۦۥۘۤ۬ۘۘۢۗۨۚۨۨۡۘۢۖۜۦۘ۠۫ۗۙۜۨۘۤۜ۠ۨۗ۟ۤ۬ۨۨۖۡۘ" : "ۦۛۨۦۡۛۗۖۨۘۨۛ۫۫۫ۦۘ۟ۗۦۘ۫ۡۗۖۧۦۙ۫ۛۚۗۚۘۥۘۚۚ۬۠ۘۚۛۘۙ۫ۖۖۢۜۘۢ۠ۜ۟ۘ۫";
                                            break;
                                        case 1981130009:
                                            str3 = "ۧ۠ۥۘ۟ۜۧۘۚۤۖۨۖۖۦۡ۫ۢۦۚۦ۬ۨۘۡۗۖۙ۬ۙ۠ۨۜۘۧۡۧ۟۬ۦۖۢۧۤۘۛ۬ۡۦۘۥۚۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case -313857617:
                                str2 = "ۖۙۘۘۜۦۦۘۘۘۡۘ۬ۥۘۡۚۨۦۗ۬ۘۨۦۧۤۨۘۖ۟ۗۜۥ۠۬ۧۢۥۡۤۥۚۛ۬۬ۦۘ";
                                break;
                            case 1570115566:
                                str = "ۘۢۖۘ۫ۢۨۡۜۦۘۡۗۨۘ۠ۜۡۘ۬۫ۦۡۘۙۜۡۡۘۨۡ۬ۘۦۦۘۜ۠ۖۦ۠ۦۘ۬۫ۜ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case -940132626:
                    break;
                case -826539589:
                    ((C4128ma) this.OooooO0).OooOoOO(this.OooooOO);
                    str = "ۚ۬ۚۥۚۦۤ۫۬ۤۚۜۘۘۦۜ۠۬ۡۘۧ۠۠ۡۢۤۜۡۙۗۡۥ۟ۦۨۘۖۘۖۥۥ۠۟ۥۘۦۨۗۘ۟ۦ";
                    continue;
                case -770507220:
                    str = "ۜۤۚۘۡۖۜۤۛ۫۟ۜۤ۫۬ۖۤ۫۠ۙۚۚۚۡۘ۫ۜۜۥۛ۠ۛ۫ۙۥ۫ۥۥۤۤۜۦۘۖۘ۫ۜۧۘۘ";
                    continue;
                case -616806373:
                    str = "۠ۥۙۦۘ۟۫ۗۖۧۤۛ۬ۦۜۧۚۨۨۨۧۘۚۖۢۚۘۦۘۢۥۚۧۨۘۦۘۧ۠ۛۘ۟۬ۛۢۧۦ۬۟ۥۧۜۗۡ";
                    continue;
                case -616406863:
                    super.onActivityResult(i, i2, intent);
                    str = "ۖۦ۠ۗۨۗۧۙ۠۟۠ۥۚۚۥۘۙ۬ۖۘۘ۟ۨۡۧۧ۫ۘۡۜۡۥۘۛۜۤۦۤۥۘۛۧۡۙ۠۫";
                    continue;
                case -367416570:
                    this.OooooOO = stringExtra;
                    str = "ۙۛۥۘۤۡۘ۬ۚۤۖۘۚۘۘۡۙۥۢۚۘۥۘ۟ۘۖۘۗۥۨۘ۫ۡۧ";
                    continue;
                case -314167124:
                    str = "ۘ۟ۖۘۘۖ۠ۛ۟ۛ۟ۛۜ۠ۥۘۡ۫ۦۜۥۧ۬۠ۘۘۧۡۜۘۙۤۨۘ";
                    continue;
                case -295390346:
                    C3753c5.OooO0OO(this, getString(R.string.regcode_sweep_result_null));
                    str = "ۙۡۜۢۗۗۘۜۘۘ۟ۘۢ۟ۚۢۦۚۧ۟ۢۙ۠۟ۡۘۦ۟ۨ۫ۜ۠۫۬ۖۘۨۗۦۨۛۨ۟۟ۜۡۘۜۘۚ۠ۚۤۡۙ۬۠ۡ";
                    continue;
                case -287517467:
                    str = "ۙ۟ۘۘۖ۫ۥۗ۫ۨۘۘۙۜۘۘ۫ۤۖۛ۠ۗۘۢۜۧۧ۟ۜ۠ۛ۬ۗۛۖۘۢۡۘۘۖۦۥۚۢۢۜۧۢۤۙۘۖۜۘ۬ۧ۟";
                    continue;
                case 126544010:
                    String str4 = "ۨ۬ۚ۟۟۬ۜ۟ۥۘۛۤۘۦۗۙ۬۠ۦ۠ۜ۬ۘۘۖۘۛۧۥۥۗۥۗۤۢۡۗۡۛۜۡۘۤۘۥۘۧۜۘۘۗۥۗ۟ۘۘۙ۟ۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-72040656)) {
                            case -1458003926:
                                break;
                            case -421648616:
                                str4 = "ۛۗۘۘۧ۠ۙۦۧ۟ۡ۫۠ۤۢۜۦۡۧۗۚۦۘۖۛ۠۟۬ۦۘۗۜۘۜ۟۬ۦۢۨۦۖ۬۟ۗۧۦۢۘۛۦ";
                                break;
                            case 143908233:
                                str = "۫ۥۡۘ۟ۢ۬ۗۜۦۘۜۢۢۢۦۥۖۥ۠۬ۦۨۡۤ۠ۗۥۢۤ۬ۚ";
                                break;
                            case 799164867:
                                String str5 = "ۙۙۜۘۛۥۜۘ۠ۥۤۡۙۙ۟ۨۨۘۖۤۡۛ۟ۜۘۧۜۧۨ۫۠ۧۖۙۧ۫ۧۜۖۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-949003933)) {
                                        case -2012629326:
                                            str4 = "ۦۚ۬ۦ۟ۚۤۙۨۘ۫ۢۛۥۘ۫ۦۦۡۘ۫ۡۡۘۥۡۛۤۚۘۨۜۢۧۛۘۘۧۜۖ";
                                            break;
                                        case -2002834326:
                                            str5 = "ۢۖۛۜ۫ۚۧۨۜۘۦۜۦۘۤۢۧۦۙ۫ۥۚ۫ۜ۟۫ۜۨۘۘۖ۟ۘۘۘ۟ۜۘ۬۟ۜۘ";
                                            break;
                                        case 725735416:
                                            str4 = "۟ۛۡۚ۟ۘۘ۫ۤۨۘۤۛۜۖۧ۟ۤۜۗۦ۬ۡۘ۟ۢۡۘ۠۬ۢۨۖۥۘۨۘ۠ۥۤۥ۟۟ۜۘۧۖۜۘ";
                                            break;
                                        case 895522823:
                                            str5 = intent != null ? "ۛ۬ۘۜ۟ۖۘۛۛۢ۠ۖ۟ۙۗۙۙۦۡۘۖۧۥۛۦۘۙ۬ۘۜۗۜۛۨ۠ۛۛۧۧ۬ۚۜ۬ۘۘۗۙۦۖ۫" : "۟ۡۧۘۡۚۡۘ۟ۤ۟ۚ۟ۢۗۚۨۘ۫ۛ۠ۙۗۡۘۜۤۘۖۦۡ۠ۗۛۘۚ۟ۢۤۢ۬ۡۛۧ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 407478205:
                    return;
                case 1006794455:
                    stringExtra = intent.getStringExtra("SWEEP_RESULT_BACK");
                    str = "ۧۢۢۦۨۧۢۗۧۛۥۛ۟ۦۘۖۨۖۘ۬ۚ۠ۥۥۖۘۨۘۖۥۛۘۖ۠۠ۚۨۚۢۦۖۘۙۥۗۗۥۥۘۚۖۡۘ";
                    continue;
                case 1025287896:
                    String str6 = "۫۬ۖۥۢۘۘۗ۫ۚۜۤۨ۟ۦۛۙ۠ۘۘۢۚۨۘۘۨۗۖ۬ۨۢۥۘ";
                    while (true) {
                        switch (str6.hashCode() ^ (-763730760)) {
                            case -1552303189:
                                String str7 = "ۥۙۖۘ۟۟ۛ۟ۡۧۘۨ۟ۚۦ۠ۗۗۨۥۖۡۘۚ۬ۜۥۛ۬۬ۡ۠ۙ۫ۜۢۨۘ۬ۚۜۚۤ۫ۨ۠ۥۜۧ۬ۡۨۘۖۜۦۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 591958117) {
                                        case -704504420:
                                            str6 = "ۛۤۚۡ۠ۖۘۧۧۧ۠ۢۚ۬ۜۦۖۛۖۙ۟۟ۨۙۦ۬ۢۖۖۗ";
                                            break;
                                        case 461866883:
                                            str7 = i2 == -1 ? "ۖۙۥۘۥ۫ۚۥ۟ۜۘۛۜۢۥ۠ۜۜۢۥۧۧ۠ۛۘ۫۬ۜۖۥۙۧۧ۟۬ۜۘ۫" : "ۗۧۤۛۧۙۙ۟ۖۘۘۧۘۢۗۤ۫ۖۡۜۤ۫ۗۦۧۘۨۧۧ۫ۤۦ";
                                            break;
                                        case 877673140:
                                            str6 = "ۧۜۘ۟ۦۦ۠ۧۛ۬ۦۙ۟ۢۙۙۡۜۤۛ۬ۖۦ۬ۜۨۜۘۙۘۘۘۥ۫ۧۨۜ۫ۛۖۜۘۢۘۛۜۡ۠ۦ۬ۘۖۢ";
                                            break;
                                        case 1484187556:
                                            str7 = "ۗۡۡۘۘۗۡۦ۠ۜۧۘۥۖ۬۟ۗۡۨۘۜۥ۫ۛۜۜۜ۠ۚ۠ۦۖۛۦۛۛۙۨۘۢ۬ۦۘۢۥۜۘۛۧۡۘۘۘۖۖۙ۟ۙۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case -257116416:
                                str = "ۧۦۡۘۚۛۥ۠ۙۢۨۛۤۜ۬ۛ۫ۦ۠ۦۗۙۡۘ۟ۖۥۧۖۘۢ۫ۥۘۤۘۧۙۖ۬ۥۢۥۘۢۥۚۘۡۧۨ۫ۧ۬ۘ";
                                break;
                            case 94198640:
                                str6 = "ۘ۫۫ۧۨۡۘۗ۟ۚۜۡۙۙۥۖۘۥۘۥ۟ۗ۠ۧۗۗۜۦۘۥ۠ۘۘ";
                                break;
                            case 132024511:
                                break;
                        }
                    }
                    break;
                case 1464007158:
                    String str8 = "ۜ۫ۥۡۘۛۧ۟ۡ۟۬ۜۘۚ۠۬۟ۜۡ۠۬ۤۢۖۧۙۘۡۘۛۨۜ";
                    while (true) {
                        switch (str8.hashCode() ^ 2095929717) {
                            case -1942964119:
                                String str9 = "ۦۦۜۘۛۛ۫۬۬ۚۛۜۧۘۚ۠ۗۙۘۜۥۛۜۜۧۧۖۚۦۧۥۡۘ۟۠ۖۖۛۡۘۥۡ۬ۦۦ۟ۨ۬ۡۦۘۨۘۥۘۦ۫ۥ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-1455005464)) {
                                        case -1283917612:
                                            str9 = "۠ۛۨۤ۟۠۬ۨۗۘ۠ۘۘۚۡۘ۫۬۬ۖۡۗۚۘۖۧۘۘۛۜۗۤۡۨۛۛۘۘ";
                                            break;
                                        case -705907682:
                                            str9 = i == 1003 ? "ۜۖۧۘ۠ۥۦۖ۠ۚۖ۟ۖۘۨۤۦۥ۬ۘۘۙۖۨۗۢۘۧۧۖۖۘ۠۟۟ۥۘۜ۬ۡۘۦۙۦۗ۠ۨۘ" : "ۘۖۖۘۡ۬ۨۘۖ۬ۨۤۙۖۘۚۥۡۗۢۜۦۥۧۘۥۜۥۘ۫ۥۘۘۖۥۦ۬۠ۨۡۜ۠ۜۢۦۚۖ";
                                            break;
                                        case 298056547:
                                            str8 = "ۗۜ۠ۡۡ۫۟ۡۨۘۗۘۦۘۤۡۘۨۦ۠۠۫ۡۘۥ۫ۗۦۥۙۙۚۖۘ۫ۦۘۖ۟ۜۢۧ۫ۨۥۤ";
                                            break;
                                        case 1587554393:
                                            str8 = "ۡۚۤۚۢۢۘۛۖۘۜ۟ۤ۠۬ۨۘۢ۠ۧۛۤۤۘۗۖۘ۠ۛۤۥ۟۟";
                                            break;
                                    }
                                }
                                break;
                            case -1698333139:
                                break;
                            case -1082710494:
                                str = "ۘۚۙۥۥۘۦ۫ۥۘۚۖۨۘۖۥۗۨ۟ۦۜۖۜۥ۟ۜۘۥۢۡۘۤۘ۫ۛۧ۫ۢۤ۬ۖۥ۠ۥۜۥۘۘۖۘۗۛۘۘ";
                                break;
                            case 956289236:
                                str8 = "ۡۨۖۘ۟۟۟ۖۘۘۚ۟ۜ۬۫ۤۛۧۘ۫ۙۜۧۗۛۤۘۜۘ۟ۤۘۘ۟ۘۧۙۢۧۥۦۖۘۛۛۚ";
                                break;
                        }
                    }
                    break;
            }
            str = "ۙۡۜۢۗۗۘۜۘۘ۟ۘۢ۟ۚۢۦۚۧ۟ۢۙ۠۟ۡۘۦ۟ۨ۫ۜ۠۫۬ۖۘۨۗۦۨۛۨ۟۟ۜۡۘۜۘۚ۠ۚۤۡۙ۬۠ۡ";
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = 0;
        String str = "ۦۡۘۘۘۡۛۙۜۗۜۙۚۦۡۛۚۤۜۘۛۡۘۥۘۨۢۘ۟ۡۘۜۘ";
        String strTrim = null;
        while (true) {
            switch ((((str.hashCode() ^ 661) ^ 643) ^ 196) ^ 1976278767) {
                case -1547884122:
                case 129423244:
                    str = "ۡ۠ۜۘۧۡۥۘۢۡ۟۫ۙۦۘ۬ۨ۫ۖۤۥۘۥۧۦۘۥۤۧۢۚۘۘۖۘ۫";
                    break;
                case -903025314:
                    str = "ۗۛۨۗۗۡۘۘۚۤۙۦۦ۠ۜۖ۫۠۠۫ۢۧۥ۠ۡۘ۫ۗۖۤۤۧۨ۠ۜۘۢۥۤۡۢۜۘۖۘۨۘۢۚۗۗۨۥۤۡۘۡۡ۠";
                    break;
                case -866291962:
                    this.o00o0O.postDelayed(new OooOO0(this), C2187m.f13871ag);
                    str = "ۡ۠ۜۘۧۡۥۘۢۡ۟۫ۙۦۘ۬ۨ۫ۖۤۥۘۥۧۦۘۥۤۧۢۚۘۘۖۘ۫";
                    break;
                case -716739512:
                case -416661822:
                case 691745356:
                case 960743095:
                    return;
                case -274519906:
                    this.o00o0O.removeCallbacksAndMessages(null);
                    str = "ۙۦۢۧۧۦۤۤۖۛۥۢۗۨۜۘ۫ۤ۟۫ۢۦۚۨۙۨۢۥۤۥۘ۫ۧۘ۠ۦۙ۬۠ۗۤۥ۠ۧۘ۬ۡۗۦۘۘۘۘۙۡۙ";
                    break;
                case -128386405:
                    String str2 = "ۢ۬۬ۚ۠ۨۘۥۤۚۚۧۥۘۛۧۨۜۢۤۖ۟۟ۤۗۤۡۙۦۤ۫ۘ۠۟ۗۨۖۥ";
                    while (true) {
                        switch (str2.hashCode() ^ 525832092) {
                            case -1274504930:
                                String str3 = "ۨۙۚ۠ۜۦۘۧۗۧ۬ۘۖۘۚۤ۠ۡ۫۬۬۫۬ۚۜۛۖۧۜ۬ۛۥ۫ۡۖ۟۫۠ۤ۬۬۟ۧۥۨۥ۠ۙۤۥۘۗۖۦۧۛ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1961622304)) {
                                        case -1749664493:
                                            str3 = "ۡۘۗۛۛۜۙۚۦۜۢۘۚۖۦۘۘۦۖۘ۟ۤۧۡۢۙۢ۫۫ۜۤۤ۬ۡۥۘۡۚۨۘۤۗۖۤۖۨۘ";
                                            break;
                                        case -1246850728:
                                            str3 = TextUtils.isEmpty(strTrim) ? "۠ۦۖۤۙۜۖ۟ۢۦ۬ۧۡۙۨۧۡۙۜ۠ۗۖۡۜ۫ۧۧۖۖۦۘۦ۫ۜۥ۠ۧ۠۟ۡۘ۠ۚۨۘ۫۠۬ۧۤۡ" : "۬ۜ۠ۘۧۨۘۦۧۚ۠ۘۘۘۜۖۧۘۦۖ۟ۧ۬ۘۘ۠ۥۖۨۥ۬ۛۢۙۚ۠ۖۜۗۥۘ۟۫ۗۛ۠۫۟ۢۨۜۛۧۛۦ۠ۡۧۦۘ";
                                            break;
                                        case -70154499:
                                            str2 = "ۗۨۜۘۜۙۡۡ۟ۗۥ۠ۖۘ۫۬ۨۡۘ۬ۛۨۘۦۤۙۗ۠ۗۖ۟ۥۚۖۦۤۘۘۥۖۧۘۜ۫ۘۘۡۧۢۦۛۗ";
                                            break;
                                        case 1017318398:
                                            str2 = "ۧ۟ۖۘۦۤۘۘۗ۟۟ۖۙۖۘۦۚۨۨۛۗۥۘۢۘۛۖۘۜۘۜۘۢ۫ۡۘ۫۬ۥۡۢۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case -446602720:
                                str2 = "ۤ۫ۧ۠۠ۖۘ۬۟۬ۤۡۡۘ۠۫ۨ۟۫ۜۘۜۘۦۘۖۦۡۚۤۨ۫ۗۨۘ";
                                break;
                            case 567625432:
                                str = "ۡۜ۠ۖۡۨ۠۠۫ۖۢ۫۠ۧۥۦ۫ۖۘۨۧۢ۟ۧۜ۟ۡۖۥۥۢۡ۠۬ۛۖۗ۟ۥۚۢ۟ۖۘۤۡۡۦۖۨۘ";
                                continue;
                            case 1098633453:
                                str = "ۙۨۖۦۢۘۙ۬ۗۥ۫ۗۦ۫ۡۘ۫ۙۘۘۨۙۢۨۚۚۙۛۘۚۖۘۨۘۥۙۙۥ";
                                continue;
                        }
                    }
                    break;
                case -108735008:
                    String str4 = "ۤۦۥۘۜۥۡۘۘۛ۫۠۫ۜ۟ۧۤۛۜۖۘۦۦۜۘۧۖ۟ۛۜۥۘۖۡ۠ۛۖۢ۟ۘۜۙۘۗۖۡۚۦۦۧ۟ۤۜ۬ۗۢ۫ۚ";
                    while (true) {
                        switch (str4.hashCode() ^ 1282354226) {
                            case -279769998:
                                str = "ۤۛ۠ۤۛۥۘۛۖ۬۟ۨۥۙۧۡۘۖ۫ۖۘۜۚۗۦۙۦۘۚۡۦۘۖۨۗۡ۠ۥ۬ۙ۟۫ۨۤۢۡۡ";
                                continue;
                            case 541240455:
                                String str5 = "ۢۖۖۧ۠ۙۖۥ۟ۗۥۨ۫ۗۦۗۡۦۤۡۗۘۙۡۚۢۨۗۖۥۘ۠ۘۘۗۡ۟ۤۧ۬ۡۛۘۘۨۤۨ۟ۥۥۥ۟ۡۘۜۡۧۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-707648797)) {
                                        case -1937951778:
                                            str5 = "ۢ۬ۨۘ۬ۡۖۘ۫ۤۖۤۛۥۘۚۤۗ۟ۙۨۛۧۨۘۗۜۜۘۧۨۢۨۥۥۙۖ۬ۘۚۜۛۡۛۥۜۡۘۦۘۘۢۦۥ";
                                            break;
                                        case 637177413:
                                            str5 = id != R.id.btn_activation ? "۠ۤۥۚ۠۫۫ۜۘۡۨۖۚۜۨۘۙۗۨ۬ۥ۫۬ۘۨۧۘۥۙۡۡۗۜۘۨ۫۠ۧۚۚۥۦۜۜۤ۬ۛ۫ۖۘ" : "ۖۨۙ۬ۦ۟۟ۧۘۜۧ۫ۗۦۘۘۗۡۜۘۡۖۤۢۜ۬ۡ۫ۜ۬ۛۢۧۦۤۖۢۗ۟ۘۤ۫ۛۦۘۥۙۢ۫ۡۧۘۦ۫ۥۘۨۦۘ";
                                            break;
                                        case 1215447598:
                                            str4 = "۫ۤ۬ۨۜۗ۬ۢ۫ۢۥۘۘۛۘۨۨ۠ۧۚۘۧۘۜ۠ۦۘۤۧۖۘۗۥۛۡۥۡۢ۬ۧۨۧ۟۫ۦ۫۫۟ۧۖۜۘۛۥۖۘۥۧۦۘ";
                                            break;
                                        case 1258863035:
                                            str4 = "ۙۢۦۘۛ۟ۧۤۦۡۚ۫ۖۘۧۗ۫ۥۖۖۘ۟ۧ۫ۨ۫ۛۤ۫۟۟ۧۡۤۘۗۖ۟ۢ۟ۡ۬ۘۛ۬ۦۖۥ۟ۛۨۘۨ۠ۨۤۢۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case 859769662:
                                str4 = "۬ۢۜ۟ۜۡۘ۠۟۬ۤۜ۫ۗۡۘ۠۟ۗۤ۫ۨۜۗۗ۠ۧۛۛ۬";
                                break;
                            case 1820313492:
                                str = "۟ۥۢۥ۬ۜۦ۬ۢۦۨۡۘۘۦۗ۬ۙۢۡۛۚۤۨۥ۫۬۫ۚۢۚۚۛۖۘۗۛۥۨ۟ۘۚۡ";
                                continue;
                        }
                    }
                    break;
                case 254866434:
                    String str6 = "ۡۙۘۜۨۙۡ۬ۥۢۡۘ۬ۙۗۤۙۙۙۡ۬ۢۗۢۦۨۘ۠ۥۗۦۢۢۙۢۨۘۥۗ۫ۘۙۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 504506997) {
                            case -1241926056:
                                str = "۟۠۫ۦۥ۠ۡۡۧۙۡۗۦۛۧۨ۫ۜۘۙۘ۬ۗۚۚۨ۠ۡۤۛۛۘۚ۬ۢۜۜۘۙۜۥۘۧۙ";
                                continue;
                            case 573143143:
                                String str7 = "ۖ۟ۨۧۡۤۡۖۧۛۙۥۘ۟ۜ۬۫۫ۘ۠ۜۧۘۤۥۥۘ۠ۗۛ۫۟ۘۘۢ۟ۘۘۥۡۗۥۗۘۧۥۨ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1322023410)) {
                                        case -819543326:
                                            str7 = this.o00ooo ? "۬ۦۢ۬ۡۧۨۖۦۨۙۨۤۨۡۤ۠۫ۘ۠ۨ۬ۢۜۚۛۤۙۧۤۤۦۘۙ۬۠۫ۛۙ۬۠ۜۡۨۖۢۡ۬ۖۘۜۦۧۘ" : "ۘۤۖۡۙۢۧۙ۠ۨۗۦۘۤ۬ۥۥۨۢ۬ۧۙ۫ۚ۬ۙۨۘۛۦۥۘۥۥۘۘۢ۫ۘۘۧۡۡۢۙۧ۬ۥۜۧۜ";
                                            break;
                                        case 545774177:
                                            str6 = "ۖۧۦۦ۬ۜۘۙۥۛ۟ۨۗۛۗۘۙۢۗ۬ۜۥۨ۟ۖۘ۠۬ۛۥ۟ۛۥۨۢۢۛۤ";
                                            break;
                                        case 1011436939:
                                            str7 = "ۗۖۥۘۙ۬ۜۘۜ۟ۥ۟ۥۧۘ۬ۢ۫ۜۨۘ۠ۛۘۘ۫ۘۘۘۙ۬ۡۘۨ۠ۖۘۤ۬ۖۚۜۨ۬ۥۗۙۢۦ۫ۗۘۘۥۘۨۘ";
                                            break;
                                        case 1335045327:
                                            str6 = "ۤ۫ۤ۫ۛ۟۬ۖۘۘ۟۫ۧۥۡۢۛ۟ۧ۬ۥۛ۠۠۬ۜۚۦ۫ۧۗۡۗۚۦۛۤۜۚۨۨۜۛ";
                                            break;
                                    }
                                }
                                break;
                            case 896412884:
                                str6 = "ۗ۠ۚۚۗۖۘۦ۬ۖۘۢۢۖۧۡۦۘ۫ۖۖۘۧۙۦ۫ۜۨۙۚۜۘۢۖۘ";
                                break;
                            case 1820169713:
                                str = "ۚ۟ۡۡۖ۫ۘۖ۬ۖۙۖۘۗۙۜۘ۟۟ۗۜۦ۬ۡۛ۫ۚۙ۠ۘۤۖۘۡۚۖۘۗۨۛۧۨۖۘ۫ۡ۬";
                                continue;
                        }
                    }
                    break;
                case 306343065:
                    this.o00ooo = true;
                    str = "ۜۨۥۘۢۥۜۤۖۥۘ۫۫۠ۙۦ۠ۤۙۡۥۖۢ۫ۚۖۗۗۘۢ۬ۗۙۡۛۘ۟ۖ";
                    break;
                case 488484786:
                    String str8 = "ۥۛ۬ۙۥۚۛ۟ۥۧۖۘۛ۫ۘۘۙۢ۟ۗۛ۫ۡۢ۫۫ۧ۠ۢۛۚۙۢۤۧ۟ۢ";
                    while (true) {
                        switch (str8.hashCode() ^ 934737153) {
                            case 16173668:
                                str = "ۛۥۖۘۧ۬ۘۘۚۙۦۦۙۨۘ۫ۧۨۘۚۤۧۘۡۡ۫ۙۦۢۘۘ۬۬ۖۨۤۦۘۦۡۜۘ";
                                continue;
                            case 217130965:
                                str8 = "۟ۚۦۧ۫ۦ۟ۛ۬ۤۜۡۥۚ۫ۡۦۚۦۙۖۥۛۤۧۧۖۙ۟ۜۘ۬ۦۥۘ۬ۨۚۤۧ۫۟۟ۚ";
                                break;
                            case 984608404:
                                String str9 = "ۡ۟ۖۗ۬ۦۜۚۘۦۙۖ۠ۦۤۢۢۨۙ۠ۜۗۛۖۘۖۘۘ۫۟۠۠ۦۜۘۢۡۢ";
                                while (true) {
                                    switch (str9.hashCode() ^ 1977659627) {
                                        case -1137660649:
                                            str9 = id != R.id.btn_sweep_activation ? "۫۫۫ۧۜۡ۟ۤۙۥۘۧۜ۬ۚۙۗۖۜۙۨۘۢۖۘۙ۫۬ۙۦۡ" : "ۖۡۜۘ۟ۚۘۘۦۨۧ۠ۡۥۧۥۢۗۤۢۚ۫ۤۘ۟۫ۛ۠۟ۖۖۜۙ۫۟ۥۧۥۘۙۦۘ۟ۖۜۘۘۨۗۥ۫۟ۛ۠ۘ۟ۥۘ";
                                            break;
                                        case 351645485:
                                            str8 = "ۥۨ۠ۥۘۘۘۙۚۖۘ۟ۖۖۦۜۛۙۢۡۡۗ۠ۢۦ۫ۥۡۡۘ۟ۙۥۘۥۗۖۘۢۗ۫ۗۨۤۥۘۜۘ۬ۧۢۤ۬۟ۜۚ۫ۚ۬ۧ";
                                            break;
                                        case 756164649:
                                            str9 = "ۙۤۚۦۥۥۘۦۥۦۜۗۦۡۥۧۘۚۦۜۢ۠ۡۦۢۥۘۛۡۖۘۛۦۤ۠ۨۜۘۦۦۗۘۜۧۙۧۙۤۖۢ۟ۥۖ";
                                            break;
                                        case 828556121:
                                            str8 = "۠ۖۦۘۙۤ۠ۙۨۡ۬ۦۧۚۛۥۘۛۦۨۘۡ۠ۖۘ۬ۦۧۘۥۢۨۚۘۖۘۢۥۨۘ۫۬ۘۘ۠ۖۡۘۧۦۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1042355163:
                                str = "ۡۜ۠ۚۖۚۜ۠ۜۘۜۨۤۚ۠ۙۖۦۙۗ۠۟ۖۥۤۦۨۘۘۤۡ۫۬ۥۜۨۚۢۘۖۜۨ۟۠ۗۢۜ۬ۧۥۘۖ۟ۛۗۜۡۘ";
                                continue;
                        }
                    }
                    break;
                case 677578596:
                    C3753c5.OooO0O0(AppContext.OooO00o(), R.string.input_register_number);
                    str = "ۛۖۨۚۜۡۖۧۘۘۡۗۥۙۨۨۖۙ۟ۛۚۦۢۥ۬ۚۘۤۢۚ۬۫ۤۥۘۦۥ";
                    break;
                case 822786722:
                    OooOOoo();
                    str = "ۦ۠ۚۧۖۡۘۙۡۙۜۖۛۥۡۖۘ۫ۦۜۙۦۢۥۚۤۜۡۦۜۛۡۘۙۤۢۘۡۖۘۤۚۡۨۙۗۨۧ۠ۤۚۥ";
                    break;
                case 918090606:
                    str = "ۙۚ۬۟ۘۦۨۖۖۙۧۤۢۖۥۥۤۡ۬۬ۢۨۧۦۘ۟ۖۘۦۚ";
                    break;
                case 952029990:
                    strTrim = this.OooooOo.getText().toString().trim();
                    str = "ۦ۠۠ۘۦۖۛ۫ۚۛ۬ۧ۬ۜ۬ۨۛ۟۠ۛۥۘۧ۟۟۠ۧۦۘۡۖۖ";
                    break;
                case 976419509:
                    C3753c5.OooO0OO(AppContext.OooO00o(), AppContext.OooO00o().getString(R.string.network_off));
                    str = "۟ۖۖۦۦۦۘۨۤۥۥۛۤۢۗ۠ۥۨۨۘۢۘۛۡۥۖۘ۠ۙۛۛۜۧۘ۠ۙۖۜۡۖۘۧۨۥۢ۬ۘۘۥ۟ۤۘۚۖ۠۟ۨۨ۬ۡۘ";
                    break;
                case 1004461189:
                    String str10 = "ۖۚۖۨۡۗۧۤۤۨۥۨۘۚۗۢ۫۫ۦۖۙۦۚۥۡۦۡ۠ۚۖۘ۠۬ۘۥۖۘۘۥۡۛۦۜ";
                    while (true) {
                        switch (str10.hashCode() ^ 260017427) {
                            case -1240192242:
                                str10 = "ۜ۠ۗۤۡۨۘۚ۫ۖۘۛ۬ۦۘۘۚۖۦۘۡۢۗۡۘۜۜۜۧۙۨۘ۠ۛۡۘ۬ۧۖۦۥ۫ۗ۠ۖۘۥۨۙۗۜۨۖۦۜ۫۟۟ۗ";
                                break;
                            case -827205169:
                                str = "ۚۧۛۦۜۧۘۥۤۥۘۧۜۨۘ۟۫ۜۜۤ۬ۗۛۙ۬ۨ۟۠ۙۢۦۘۤۜۙ۟ۘۘ۠ۛۡۧۘۧۛ۫ۦۧۢۨ۠ۖ";
                                continue;
                            case 315395928:
                                String str11 = "ۥ۟ۥۘۙۡۗۡ۟ۨۘ۫۫ۖۘۘ۫ۗۚ۟ۥۘۖ۟ۦۘۨۥۨۙۤ۠ۥ۫ۢۡۛ۬ۥۨۨۘۤۚۨۘۜۤ۠ۛۜۤۜۢۗ";
                                while (true) {
                                    switch (str11.hashCode() ^ (-987666754)) {
                                        case -1700590869:
                                            str10 = "۠۠ۤۤۛۘۘۦ۠۟ۖۖۥۘۨۦۙۤ۬۬ۥ۫ۘۘ۬ۚ۠ۗۖۜۘۗۛۢ";
                                            break;
                                        case -1535000052:
                                            str11 = "ۗۥ۠ۙۛۘۘۘۥۡۛ۬۫ۤۚۜۘ۠۠۫ۖۙۗ۬ۘۨۛۛۖۘۜۛ۟ۤ۟۬ۤۖۖۘ۬ۡۧۜۚۨۚۥۘۦۗ۟ۚۚ۟ۛۤۖ";
                                            break;
                                        case 249556421:
                                            str10 = "ۨۢۛ۫ۖۛۚ۟ۥۘ۟ۛۜ۟ۤ۬ۤۨ۟ۧ۟ۦۛۥ۠ۚۛۦۦۘۗۤۚۡۘۜ۫ۧ";
                                            break;
                                        case 1167035574:
                                            str11 = !C4381t4.OooOO0(AppContext.OooO00o()) ? "ۛۥۤۥۤۙۨۨ۫۠۠۟ۖۡ۠۠ۧۥ۫ۛۦۘۖۡۜۜ۠ۢۛۡۡۤ۟ۛۙ۫ۨ۫ۙۢۖۥۥۤۚۦ۠ۦۙۥۤۚۡۖۘ" : "ۚۖۦۜۥۖۢۘ۬۫ۨۘۨ۟ۜۥۘۖۙۥۘۘۨ۫۫ۛۢۘۡۡ";
                                            break;
                                    }
                                }
                                break;
                            case 692303237:
                                str = "ۗۖۨۘۤ۠۟۠ۚۦۘۧۤۥۙۜۚ۟ۖۡۘ۠۫ۖۢ۬ۜۘۨۛۦ";
                                continue;
                        }
                    }
                    break;
                case 1012992112:
                    this.OooooOO = strTrim;
                    str = "ۗۚ۬ۦۢۨۘۡۡۖۘۥۚ۠ۜۧ۬ۖ۠۬ۤۘۗۙۢ۫ۤۜۖۛۘ۠ۧۧۦۘۖۜ۠ۗ۟ۨۜۘۡ۠۫۠۠ۗۙۛۙۤۘۥۘ";
                    break;
                case 1236795655:
                    id = view.getId();
                    str = "ۗ۟ۜۚۘۧۡ۫ۡۙۘۘۢۙۖۘ۫ۤ۫۟ۘۡۧ۫۠ۧۚۗۗۜۥۘۗۙ۟ۖ۫ۚۧ۬ۗ۫ۤۗۗۨۛۤۛۖۢۛۘۧۤۨۘ";
                    break;
                case 2008054396:
                    ((C4128ma) this.OooooO0).OooOoOO(this.OooooOO);
                    str = "ۘۨۡۨۡۜۜۢۧ۟ۨۨۜۢۤۙۚۚۙۖۡۘ۟ۡۢۢۡۘۦۤۦۢۨۥۘ۟۟۟۠ۖۜۗ۠ۖۘۖۧۦۘۢۢ۠ۘۢ۬ۚۛۤ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۨ۬ۧۨۧۚۡۖۘۦ۬ۖۘ۟ۛۧۖۥ۟ۧۘ۠۟ۡۧۘ۠ۥۖۘۖ۫۠۬ۤۨۜۖۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 155) ^ 143) ^ 347) ^ (-262001656)) {
                case -1465351921:
                    return;
                case 1607227552:
                    str = "ۥۛ۫ۚ۫۟۟ۤ۠ۤ۠ۨۘ۫ۡۤۢۧ۟ۦۦۡۨۙۚۗۡۦۘۥۥۦۘۖۦۖۘۘۥۗ";
                    break;
                case 1811065487:
                    super.onDestroy();
                    str = "ۚۡۢۥۖ۠ۖۥۦۛۦۘۗ۫ۘۘۖ۬ۨۘۜ۟۟۠ۥ۠۬ۗۥ۟ۜۜ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "ۜۗ۟ۛ۬ۡۘۢ۠ۤ۠ۚۨۤۨۥۘ۬ۜۤۥ۬۠ۥۧۘۛۤۜۘۗ۠ۢۦۦۜۘۡۦۙ";
        while (true) {
            switch ((((str.hashCode() ^ 60) ^ 391) ^ 399) ^ 1784878122) {
                case -2014856455:
                    super.onPause();
                    str = "ۧ۫ۥۗۛۥۘۥۢۥۘۘۘۖۘۢۜۘۤ۟۟ۧ۬ۦۨۡۧۡۢۧۗۢۘۘ۠ۦۨۘۗۤۤۜۛۧۧۦۦۘ";
                    break;
                case -969554318:
                    MobclickAgent.onPause(this);
                    str = "ۥۥۘ۬ۚۜۘ۬۟ۦۗۢۡۢۙۘۘۦۡۚۗۘۘۜۡۜۘۤۖۥۤۙ۬ۖۚ۠ۡۡ";
                    break;
                case -402753356:
                    str = "ۛ۟۠۬ۢۥۘ۠ۡۛۢ۫ۥۖۢۛۚ۠ۗ۫ۥ۟ۡۜۘۢۖۤ۬۠ۦۘ۫۫ۥۖۤۡۛۜۙ۟۠ۛۤۙۥ۟۬۠ۗۖۘۘ";
                    break;
                case 403903229:
                    return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:154:0x0012. Please report as an issue. */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str = "ۧۛۡۛۢۡۥ۟ۢۛۧۛۧۚۗۧ۠۟ۤۤۖۘۘۘۧۘۙۢۘ۬ۚۦ۬ۗۙۧۡۧ";
        while (true) {
            switch ((((str.hashCode() ^ 344) ^ UiMessage.CommandToUi.Command_Type.SET_FW_IMAGE_VIEW_VALUE) ^ 159) ^ (-1654114511)) {
                case -1866975168:
                    OooOo00();
                    str = "ۢۥۡ۠ۜۗۚۘ۟ۦۖۗۙۛۚ۠ۢ۫ۘ۟ۨۥ۠ۗۖۥ۫ۧۥۗۡۧۘۥۗۘۘۛ۟ۖۥۗۛۤۚ۬ۤۜۤۛ۟ۧۢ۟";
                    break;
                case -1667823182:
                    String str2 = "ۘۦۧ۟ۗۗۙۖ۠ۙۖۢ۬ۘ۟ۗ۬۫ۗۨۜۢ۠ۦۛۚۜ۠ۨۘۘۦ۫ۘ۫۟ۡ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1103626570)) {
                            case -976844453:
                                str2 = "۫ۤۘۜۙۦۘۜ۫۫ۖ۟ۥۘۘۙ۟۫ۙۗۢ۫ۡۙۚۗۨ۫ۜۘۛۨ۬ۜۗۗۨۡ۟۬۬ۘۚۚ۬ۜۜۥ۬ۧۥۘۨۧۢۚۖۘۘ";
                                break;
                            case 201915091:
                                break;
                            case 1628018369:
                                str = "ۛۡۨۡۜۧۛۦۙ۟ۚ۬ۜۧۗۡۘۡ۠ۘۤ۫۠ۥۦۧۘۙۤۛۧ۫ۜۤۗۗۘۤۛ۬ۜۘۡۛۙۗۘۗ";
                                break;
                            case 1673470593:
                                String str3 = "ۖ۠ۜۧۧۡۦۚۜۘۘۧۗۗ۟ۢ۫۟ۖۜۘۘۘۨۖۗۦۡۜ۠ۛۥۘۗۚۘۘۙۢۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 930412530) {
                                        case -35823561:
                                            str2 = "ۤۨۦۨۨۚۧ۠۟ۢۛۘۘۤۡۤۖ۠ۖۘۛ۫ۛۚۦۜۢۥۜۛۘۘۘۡۨۜۤۨۖۦۦ۫۠ۖۡۛۜۛ۫ۜ۟ۤۘۘ۠ۦۡ";
                                            break;
                                        case 422543624:
                                            str2 = "ۖ۬۠ۚۚۖۘۢۤ۠ۖۜۤ۠۠۟ۜۗۛۖۖۘۚۙۡ۠ۗ۬ۜۙۚۖۗۛۧۖۦۘۥۧۚۚ۫ۦۤۤۤۦۢ۬";
                                            break;
                                        case 845162635:
                                            str3 = i == 1000 ? "ۘ۬ۘۘۨۢۦۘۡۘۥۨۨۘۙۢۡۘۥ۬۬ۛۢ۠ۤ۠ۦۦۙۧۛۨۨۘۡۥۦۘۘۨۦ" : "۠ۜ۠ۤۖۘۧۡۦۥۧۖۚۡۘۜۜۙۤ۟ۛۨ۫ۗۧۘۘ۫ۜ۠ۧ۬ۖۘۛۦۦۘۚ۠ۡۨ۠ۙۤۨۥۘۘۨۡۘۙۤ۬ۜۗ۠";
                                            break;
                                        case 1374827945:
                                            str3 = "ۥۡۦۘۥۚ۫ۨ۬ۨۘ۫ۘۘۚۙ۫ۜۛ۫۫۬ۡۘۛ۫ۜۘۤۤ۫۠۠ۢ۬ۦۦ۟ۦۜۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1358625621:
                    String str4 = "ۘۦ۠ۤۗۡۗ۟ۘۚۢۡۘۨۚۦۜۙۨۘۤۜۘۘ۟ۥۖۘۖۛۦۘۢۥۢۢۛۖۘۦۚ۠ۗۙۗۦ۬ۤۡۦ۫ۥ۬ۦۘ۠ۢۥۙۡۨ";
                    while (true) {
                        switch (str4.hashCode() ^ (-787171663)) {
                            case -1020892865:
                                str = "۬۟ۗۡۘۖۗۢۘۚۛ۬ۡۖۧۘۢۚ۟ۛۛۢ۟۟ۘۢۨۥۤ";
                                break;
                            case 651332676:
                                str4 = "ۜۡۛۨ۟ۧ۠ۥۜۘۘۖۜۘۢ۠ۙۛۦۘۡۦۚۤۧ۫ۢۚۦۧۥۜۘ";
                                break;
                            case 982027834:
                                break;
                            case 1864961421:
                                String str5 = "ۨۢۦۥۙۡۘۥۡ۬ۤۖۗۡۘۖۨۡۖۤۘۦۘۥۛۘۙۖ۬ۡۤ۠ۢۗۢۜۜۘۘۤۗ۫ۡ۬ۜۘ۫ۘ۟ۛۢۡۤۗۖۜۖ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1265533141)) {
                                        case -1012865473:
                                            str4 = "ۘۙۛۜۜۗ۫ۖۥۘۡۨ۟ۨۛۖۢۦۢۛۡ۫ۤۚۗۧۗۨۦۥۘ۟ۚۨۘ۬ۙۥۛۘۧۘۘ۠ۨۤ۬ۚ۫ۨ";
                                            break;
                                        case -802097410:
                                            str4 = "ۨۢۜۗۛۛۗۧۖۛۗۦۘۥۦۖ۟۫ۗۢۗۗۡۧۨۘۤۤ۟ۦۡۗۢۜۙۛ۟ۙۘۥۘۘۙۤۧ۬ۢۚۘ۟۟ۦ۬ۗۜۥۘ";
                                            break;
                                        case 805083496:
                                            str5 = iArr.length > 0 ? "۫ۤۘۗۛۛۖۦۦۡۙۦۘۚۚۛ۠ۙۦۖۙۘۘ۫ۧۧ۫ۢ۫ۗۘۦۡۤۙ۫ۛۘۘۜۖ۬ۗۘ" : "۬ۦ۬۟۫۫ۤۘ۠ۡۧۛۨ۬ۡۥۤ۟۟ۢۚۤۧۥ۬ۖۘ۬ۗۙۤۙۜ۬ۧۧ۠ۥۧۘۨ۬ۘ";
                                            break;
                                        case 1531068327:
                                            str5 = "۬ۡ۟ۜۘۘۘۧۛۢ۬ۦۖۘ۠ۖ۟ۧۡۦ۬ۚۗۖ۟۠ۙۦۦۛۚ۫ۢۚۖۚۚۗ۠ۘۦۙ۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -743242988:
                    str = "ۛ۫ۜۘۧۦۦۨۧۖ۫ۗۖۛۚۢۜۛۦۥۧۙ۫ۡۗۢۚۤ۟ۥ۬";
                    break;
                case -25928162:
                    str = "ۛۨۖ۟۠ۜۗۛ۬ۢ۬۬ۢۛۘۘۜۚۦۘۢ۠ۜۚ۟ۦۘۚۖۘۘۙۗۛ";
                    break;
                case 23477659:
                    str = "۟ۥۥ۟ۖۧۛۚۖۗ۟ۥۜۡۨۘۚۜۦۛۧۥۢۚۨۘۧۜۧۘۦۗۨۨۢۢ۟ۦۘۘۚۛۥۘۥۨۜۘۦۙۜۤۗۡۜۖۨۘۙۧۨ";
                    break;
                case 436918254:
                    str = "ۢۦۨۢۡ۫ۚ۬ۘۘۧۖۡۥ۠ۡۤۗۙۙۖۙۥ۠ۥۤۙۛۢۤ۟ۢۦۡۙۦۘۘ۫ۦۘۘۨۘ۬";
                    break;
                case 1408177150:
                    str = "ۧۚۘۚۗۥۘۛ۫ۤۘۦۨۘ۠ۚۨۖ۟ۨۘۨ۫ۖۘۘۥۤۘۖۛۢۙۖۘۖۙۡۜۥۨۥۥۥۘۘۤۖۘۢ۫۠۬ۚۨ۫۟ۥۘ۫ۗۡۘ";
                    break;
                case 1666098201:
                    break;
                case 1788608250:
                    finish();
                    str = "ۛ۫ۜۘۧۦۦۨۧۖ۫ۗۖۛۚۢۜۛۦۥۧۙ۫ۡۗۢۚۤ۟ۥ۬";
                    break;
                case 1987362924:
                    String str6 = "ۛۡۦۘۧۜۖۘۡ۠ۤ۟۟۫ۧ۟ۘۖۨ۫ۗۛۢۗۡۘۘۗۢۜۤۛۨۘۗ۠۬ۘۢۤۜ۬ۛۚ۟ۘۜۜۘ۫ۘۘۘۨ۠ۥۘۥ۠ۦ";
                    while (true) {
                        switch (str6.hashCode() ^ (-45942938)) {
                            case -890931298:
                                String str7 = "ۥۨ۟ۖۖۥ۬ۗۥۚۡ۬ۖۗۨ۫ۦ۟ۦۛۖۖۗۤۢۗۗ۠ۡۤ۠۟ۧۚۨۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1665706270) {
                                        case -1872346168:
                                            str7 = iArr[0] == 0 ? "۠ۘۚۛۥ۟ۘ۟ۡۘ۠ۥ۬ۚۛۡۡۗۗۙۙ۠ۜۥۘ۫ۚۨ۠ۜۨۗۘۦۘ۠ۜۛۨۤۘۘۛۦۜ" : "ۜۙۧ۟ۧۘۘۥۤۚۤۙۦۘۤۡۘۘۙۗۥۘۛۗۘ۬ۧۦۘۧۛۛۙ۠ۜۦۡۡۘۨۗۘۘۡۢۜۨۖۙ۟ۢۘۘۤۤ۠";
                                            break;
                                        case -764914436:
                                            str7 = "ۙ۬ۦۘۧۛۥۘۥۥۛۛۢۖۘ۫ۖۖۘۖ۠ۨۘۧۙۜۛ۟۬ۢۙ۫ۥۙ۬۠ۧۡۚۦۗ۠ۦۨ۬ۛۡ";
                                            break;
                                        case 370918460:
                                            str6 = "۠۫ۛۘ۬ۘۖ۟ۜ۫ۚۘۦۘ۫ۖۗۢ۫ۨۥۜ۠ۤۘۨۙ۟";
                                            break;
                                        case 1751711117:
                                            str6 = "ۨۖۧۨۤۦۘ۬ۧۨۘ۫ۡۨ۬ۢۜ۟ۥ۬۫۫ۙ۟ۡۚ۫ۘ۠۟ۧۨ";
                                            break;
                                    }
                                }
                                break;
                            case 121509322:
                                break;
                            case 819727078:
                                str6 = "ۖۘۡۘۜۦۢۥۜۚ۫ۜۚۢۥۢۨ۫ۗ۟ۖۘۙ۟ۨۤۗۚۙۦۚ۫ۚۢۤۧۚۙۙ۠ۨۚۡۘۦۘۛ۠ۚۡۙ۟۫ۛۧۜۘ";
                                break;
                            case 2065045357:
                                str = "ۧۢۙۘ۫ۦۘ۫ۧۦ۟ۧ۬ۚۛۗۙۚۨۘۘۘۧۥۜۘۘۧۢۦۘۛ۫ۙۘۘۗ۫ۜۙ۠ۡ۟۫ۗۤۡۜۨۘ۬ۗۜۘۘ۟۠ۙۘۜۘ";
                                break;
                        }
                    }
                    str = "ۨۚۨۘۗۚۧ۠ۨۨۘۖۡۦۚۤ۬ۗ۫ۡۘ۫۫ۛۦۖۘۘۥۢۖۘۥ۬ۚ";
                    break;
            }
            return;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "ۧ۫ۥۘۧۦۥۘۙۨۙ۫ۙۜۗۜ۫ۡۨ۠ۦۙۘۢۚۢ۟ۜۢ۠ۤۢۢۗۨۥۡۢ۬ۗۡۘۦ۠ۨۘۘۥۤۧۙۛۖۨۢۘ۟ۙ";
        while (true) {
            switch ((((str.hashCode() ^ 842) ^ 803) ^ 754) ^ (-1156170232)) {
                case -1919334367:
                    return;
                case -1414043600:
                    MobclickAgent.onResume(this);
                    str = "ۙۙۦۧۘۦۘۡۚۜ۫ۛۘۛۨۢۧۤۤۧۗ۟ۗۥۛ۫۠ۚۧۗۡۘۡۢۧۡۛ";
                    break;
                case -397777206:
                    super.onResume();
                    str = "ۦۥۙ۠ۨۢ۟ۨۜۘۦ۟ۤۖۦۢ۬ۖۦۘۜۥ۬۟ۘ۟ۗ۫ۦۧۤۢۛ۠ۜۘۡۦۥۢ۫ۜۘۤ۟ۤ";
                    break;
                case 1047928322:
                    str = "ۙۗۤۖۜۛۨۤ۠ۘۨۦۚۜۡۘۡۤۨ۬ۦۘۘ۬ۜۖۦۥۖۘ۠ۤۥۘ";
                    break;
            }
        }
    }
}
