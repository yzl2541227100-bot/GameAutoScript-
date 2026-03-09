package com.cyjh.elfin.p200ui.activity.studio;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.MsgItem;
import com.cyjh.elfin.entity.Script;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.http.bean.response.ProjectNumberInfo;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;
import mobi.oneway.export.C3580a;
import p285z2.C3683a9;
import p285z2.C3718b7;
import p285z2.C3753c5;
import p285z2.C3765ch;
import p285z2.C3839eh;
import p285z2.C4095le;
import p285z2.C4270q4;
import p285z2.C4278qc;
import p285z2.C4529x4;
import p285z2.InterfaceC3865f6;
import p285z2.j10;

/* JADX INFO: loaded from: classes.dex */
public class StudioBindActivity extends BaseActivity implements View.OnClickListener {
    public static String o00o0O;
    private FrameLayout OooooOO;
    private TextView OooooOo;
    private TitleView Oooooo;
    private EditText Oooooo0;
    private String OoooooO;
    private String Ooooooo;
    private String o00O0O;
    private boolean o00Ooo;
    private String o0OoOo0;
    private String ooOO;
    private Handler OooooO0 = new Handler();
    private boolean o00Oo0 = true;

    public class OooO00o implements C4278qc.OooO00o {
        public final StudioBindActivity OooO00o;

        /* JADX INFO: renamed from: com.cyjh.elfin.ui.activity.studio.StudioBindActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC4697OooO00o implements Runnable {
            public final OooO00o OoooOoO;

            public RunnableC4697OooO00o(OooO00o oooO00o) {
                this.OoooOoO = oooO00o;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = "ۢ۬ۦۦ۫۬ۡۗۜ۫ۜۡ۫ۖۜۘۛۡۚۡۗۡۨ۟ۡۘۥۢۥۖۖۡۘۡۢۖۘۨۡۥۘ۟۬ۨۡۘۢ۫۠ۜۘۧ۟۬ۗۢۙۤ۠";
                while (true) {
                    switch ((((str.hashCode() ^ 193) ^ C3580a.f19598e) ^ 371) ^ 753901087) {
                        case -1213553200:
                            C3753c5.OooO0o0(this.OoooOoO.OooO00o.getApplicationContext(), "绑定成功！");
                            str = "ۚۗۤۙ۟۠ۛۤۥ۠۠ۨۘ۠۫ۨۘۖۛۙۘۜۖۘۤۥۨۘۗۨۙ۫ۤۗۡۛۘ۫ۙۤ۟ۗۘۘۙ۬ۥۗۢۖۘ۠۫ۦۘ";
                            break;
                        case -252744482:
                            str = "ۡۜۨۘۧۦۥۘۙ۠ۘۘۥۧۨۘۖ۟ۜۘۚۚۛۜۚ۫ۚۡۜ۠ۢۧۢۛۥۥ۫ۤۡۦۨۘۢۗ۟ۡۘۜۘۦۙۤۦۜۘ";
                            break;
                        case 1625037029:
                            return;
                    }
                }
            }
        }

        public class OooO0O0 implements Runnable {
            public final ProjectNumberInfo OoooOoO;
            public final OooO00o OoooOoo;

            public OooO0O0(OooO00o oooO00o, ProjectNumberInfo projectNumberInfo) {
                this.OoooOoo = oooO00o;
                this.OoooOoO = projectNumberInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = "۟ۜۡۘۥۥۘۤۢۢۜ۫ۜۘۥ۬ۗۧۛۤۙ۬ۦۘ۬۠۟ۨ۠۟ۚۧ۠ۗۨ۬ۘۡۛ";
                while (true) {
                    switch ((((str.hashCode() ^ 822) ^ 334) ^ 779) ^ (-64035875)) {
                        case -968022064:
                            str = "ۢۜۡۘۦۢۢۛۛۛۖۘۛ۠۟ۡۘۧۦۧۧ۠ۘۘۗ۠ۤۨۘۥۘۤۛۗ";
                            break;
                        case 221991636:
                            j10.OooO0o().OooOOOO(new C3839eh(10002, this.OoooOoO.IMToken));
                            str = "ۘۜۘۘۥۢۢۘۗۢۘۦۡۘ۟۬۫ۡ۬ۦ۟ۗ۬ۚ۬ۨۘۨۧۜۘۦۧۦۘ۫ۛۢۤ۫ۦۘ";
                            break;
                        case 1726102661:
                            return;
                    }
                }
            }
        }

        public class OooO0OO implements Runnable {
            public final String OoooOoO;
            public final OooO00o OoooOoo;

            public OooO0OO(OooO00o oooO00o, String str) {
                this.OoooOoo = oooO00o;
                this.OoooOoO = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = "۟ۧۤ۠ۧۨ۠۠ۢۜۙۚۥ۫ۚ۠ۨۛۚۙۦۧۘۧۧۘۨۛۚ";
                while (true) {
                    switch ((((str.hashCode() ^ 934) ^ 183) ^ 956) ^ 18060819) {
                        case -1639115161:
                            C3753c5.OooO0o0(this.OoooOoo.OooO00o, this.OoooOoO);
                            str = "ۦۚۛ۟۟۫ۨ۠ۡۘ۟ۗ۠ۥۢۖۚۛۥۦۡۗۛۘۨ۟ۨۦۥۢ۟۫ۛ۟ۦ۠ۜۘ";
                            break;
                        case -4926033:
                            return;
                        case 919880822:
                            str = "ۘۥۗۜ۬۫ۨ۬ۙ۫ۥ۫ۦ۠ۖۘۖۨ۟۟۬ۧۖۢۦۜۙۚ۫۫ۦۖۧۛ۟ۗۙۗ۫۟۫ۡۖ";
                            break;
                    }
                }
            }
        }

        public OooO00o(StudioBindActivity studioBindActivity) {
            this.OooO00o = studioBindActivity;
        }

        @Override // p285z2.C4278qc.OooO00o
        public void OooO00o(int i, String str) {
            String str2 = "ۢ۟ۜۘۘۦ۬ۡۦۥۦۘ۫۟ۥۘۥۥۢۖ۫ۨۘ۠ۛۖۤۨ۫ۤۧۡۥۘۛۨۚۜۘۧۗۜۗۨۧۗ۟ۡۜ۫ۘۧ۬ۚۖۜۡ";
            while (true) {
                switch ((((str2.hashCode() ^ 524) ^ 179) ^ C4095le.o0000oo) ^ 1792100365) {
                    case -1650836299:
                        StudioBindActivity.OooO0oo(this.OooO00o).post(new OooO0OO(this, str));
                        str2 = "ۤ۠۫ۧۘ۬۟۠ۙۢۘۨۤۥۢ۫ۦۚ۬ۤۨۧۡۖۘ۟ۨۡۜۦۡ";
                        break;
                    case -1589638090:
                        str2 = "ۘ۬ۢۤۘۖۘۙۘۘ۟ۙۖۤۨۛۜۛۦۘۛۖۘۘۚۚ۫ۘ۠۠ۙۙۨ";
                        break;
                    case -951112243:
                        StudioBindActivity.OooO0oO(this.OooO00o, true);
                        str2 = "۬ۜۜۗ۟۠ۚۨۧ۫ۙۘۘۦۨۘ۠ۤۚۨۨۜۘ۫ۚۜۘ۬ۖۜ۬ۥۘۜۘۤۤ۟ۡۚۜۨۗۡۗ";
                        break;
                    case -543027293:
                        C4278qc.OooO0oO().OooOO0(null);
                        str2 = "۟ۛۘۘۛ۟ۧ۠ۖۖۘۡۘ۫ۦۚۨۘ۠ۡۛۢۖۡۘۡۗۡۧۥۤۧۖۥ۠ۥۘۘۧ۫ۥۘۤۤۧۨۚۨۨۧۥۥۖۙ۫ۚ۫۬";
                        break;
                    case -440820826:
                        return;
                    case 759610366:
                        str2 = "ۡ۫ۨۖ۫ۥۘۥۖۥ۟ۘ۬ۥۖ۟ۘۡۧۘۘۗۖۨۧۨۘۜ۠ۦۘ۟۫ۜۘۢۖۧ۫۬ۨۥۗۥۧۗۨۘۨۜۦۘ۫ۡۘۘۖۧ۬۟۬۫";
                        break;
                    case 1881792284:
                        str2 = "ۗۛۦۘۥۡۦۦۚۨۘ۟ۛۖۘۖ۟۬ۗ۫ۢۚۥ۬ۚۖۡۜ۠ۦۤ۬ۧ۟ۖۘۦۚ۫ۚۡۧۘ۟ۦۙ";
                        break;
                }
            }
        }

        @Override // p285z2.C4278qc.OooO00o
        public void OooO0O0(ProjectNumberInfo projectNumberInfo) {
            String str = "۟ۚۚۢ۟ۛۚۥۡۘ۫۟ۧۥۨۖۡۘۡۚۥۡۨۚۥ۬ۚۖۛۧۘۚۤۨ۠ۖۤۜۗۨۘ۟ۙۜۘۘۖۗ۠۫۟ۛ۠ۡۘ۠ۗۗ";
            String strOooO00o = null;
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_ROW_ALIGNMENT_VALUE) ^ C4095le.o00000o0) ^ 324) ^ (-252743917)) {
                    case -1693555955:
                        C4529x4.OooO0O0().OooO0oo(InterfaceC3865f6.OooOoo0, strOooO00o);
                        str = "ۘۡۢۥۥۧۘۧۙۛۢۡۗۢۛۖۘۨۙۖۘۖ۟ۥۨ۟ۜۘۚۘۨ۬ۡ۠ۖ۬ۡۥۛۦۤۛۤۤۧۤ";
                        break;
                    case -1404225593:
                        C3765ch.OooOOo(projectNumberInfo.IMServerHost, projectNumberInfo.IMServerPort);
                        str = "ۚ۫ۡۛ۫ۙۖ۬ۡۘۨۦۦۘ۟۬ۧ۬ۚ۫ۚۖ۬ۘۤۥۙۗۦۘۖ۟ۖۛ۟ۡۘۜۛۘۘۧۜ۬۬۫ۡۘ";
                        break;
                    case -1349682348:
                        this.OooO00o.finish();
                        str = "ۚ۬۫ۦۧۖۘۚۚۥۢۗۗۗۦۙۛۧۢ۠ۖۦۘۢ۬ۢۡ۫ۦ۠ۡۛۘۘۘۡۚۨۘ";
                        break;
                    case -1096852507:
                        str = "۠۬ۘۘ۫ۡۘ۫ۦۖۡۖۥۦۦۧۘۧۥۖۤۙۜۢ۬ۜۦۡۢۙۡۧۘۤۧۚۥۜۦ";
                        break;
                    case -887069722:
                        str = "ۙۘ۠ۧ۠ۧۜۧۥۜۡۖۖۨ۠۟ۦ۫ۤۡۥۘ۫۠ۘۛۨۨۘۘۘ";
                        break;
                    case -111930771:
                        StudioBindActivity.OooO0oo(this.OooO00o).post(new RunnableC4697OooO00o(this));
                        str = "ۖۥ۫ۛۖۚۙۖۘۜۖۤۙۡۘۘۘ۫ۡۘۗ۫ۘۘۢۚۦۚ۠ۚ۫۫ۦ";
                        break;
                    case -17907221:
                        str = "ۙۗۡۘۢ۬ۥۘ۬۟ۦۦۨ۠ۗ۠ۥۨۘۜۥ۠ۡ۠ۗۦۤۚۡ۟ۙۥۧۨ۟ۦۡ";
                        break;
                    case 428055373:
                        AppContext.OooO00o().OoooOoO = StudioBindActivity.OooO(this.OooO00o);
                        str = "ۙۚ۠ۥ۬۫۟ۘۨۘۖ۟ۦۘۚۖۗۛۘۙ۟۠ۤ۟ۡۜۥۤ۠ۥۘۘۡ۫۠ۥ۠ۖ۬ۦ۠ۧۜ۫ۨ۬ۥۖۜ";
                        break;
                    case 985072009:
                        StudioBindActivity.OooO0oo(this.OooO00o).postDelayed(new OooO0O0(this, projectNumberInfo), 500L);
                        str = "ۢۖۡۘۦۡۘۛۡۢۧۗۖۘۗۧۙ۬ۛۖۘۤۛۜۘۦ۠ۘ۫ۢۥۜ۠ۥ";
                        break;
                    case 1390809285:
                        strOooO00o = C4270q4.OooO00o(StudioBindActivity.OooOO0(this.OooO00o));
                        str = "ۛۡ۬ۧ۟ۧۗ۬ۛۙۥۘۘۘۙۦۘ۬ۡۧۘۙۖۙۥ۬۠ۤۚۦۧۧۡۜۧۥۤۘۘ۫ۤۛۧۖۧۘ";
                        break;
                    case 1655562237:
                        return;
                    case 1746645181:
                        String str2 = "ۧ۫ۙۘۡۜۢۜۧۘ۠ۛۗ۫ۚۗۘ۫ۙۙ۫۫۟ۤۘۘۖ۬ۙۜۥۤۖۡۦۛۗۧ";
                        while (true) {
                            switch (str2.hashCode() ^ (-320475279)) {
                                case -1446864591:
                                    str = "ۤۥۤۚۖۘۘۛۚۜۘۗۜۥۘۤ۫ۖ۠۠ۥۘۗۨۙۗۢۥۘۨۡۦۘ۠ۤۘۢۧۖۘ۫ۗۖۢۢۢۡۙۢۥۚۙۘۖۖ۟ۦۤۛۖۘ";
                                    continue;
                                case -1158951772:
                                    String str3 = "۬۠ۤ۟ۜۗۗ۫ۥۢۥۨ۬ۨۥۘۜۗۨۘۖۡۘ۬ۨۜۘۙۨۨ۫ۛ۠";
                                    while (true) {
                                        switch (str3.hashCode() ^ 129054731) {
                                            case -1977358878:
                                                str2 = "۟ۧۡۚۙ۟ۗۙۢ۫۟ۘۥۖۡۖۦۘۛۛۡۘۜ۟ۨۜ۠ۨۛ۬ۡۘۧۚ۠ۨ۠ۥۛۨۖۘۗۜۚۢۥۦۘ۠۟ۦۘ";
                                                break;
                                            case 1675043758:
                                                str2 = "ۖۗۤۤۛ۬ۖۡۗۘۚۘۘ۠ۦۦۘۗۨۡ۫ۜۜۘۖۨۧۙۙۤۜ۫ۤۜۢۤۧۦۤۘۡۧۘۤ۬ۛ۬ۥۘ۫ۦۘۘ";
                                                break;
                                            case 1976200383:
                                                str3 = "ۜ۫ۖۖۡۧۧۧۖۘ۬ۤۖۖۛۚۙۦۢۖۧۦ۠ۤۛۙۖۨۘۤۥۚۢۜۦۘۘۤۖۦۘ۠۟۠ۗۢۜۛۚ۟ۢۗۦۘۡۘۦ";
                                                break;
                                            case 2135403567:
                                                str3 = StudioBindActivity.OooOO0O(this.OooO00o) ? "۫ۢ۟ۙۜ۫ۧۡۦۘۤ۫ۨۜۘۖ۫ۛۖۘۡۧۚ۠ۛۧۦۧۤۡۘ۟" : "ۜۦۥۘۙۨۥۘۗۗۚ۟ۜۘۖۜۖۘۙۚۘۘۤ۫ۖۘ۠ۤۦۘۛۛۛۤ۬ۤ";
                                                break;
                                        }
                                    }
                                    break;
                                case -719684620:
                                    str2 = "ۜۜۨۘۡۦ۠ۙۢۨۘۧۖۡۚۦۦۘۦۜۥۚۤۢ۫ۡۧ۟ۘۡۘۦۗۥۛۢۢۚۧ";
                                    break;
                                case 298728538:
                                    str = "ۙۗ۟۟ۖ۬ۚۙۛۨۛۜۦۨۨۘۥۦۗۡۦۦۘۜۧ۬۬ۜۨۚۙۗ";
                                    continue;
                            }
                        }
                        break;
                    case 1749955656:
                        C4278qc.OooO0oO().OooOO0(null);
                        str = "ۘ۫ۖۘ۫۬۬۟۫ۛۛۧۗۧۧۙۡۥۨۘۢۨ۟ۖۜۙۛۨۡ۟۠";
                        break;
                    case 1922439426:
                        j10.OooO0o().OooOOOO(new C3839eh(10001, projectNumberInfo.IMToken));
                        str = "۠۬ۘۘ۫ۡۘ۫ۦۖۡۖۥۦۦۧۘۧۥۖۤۙۜۢ۬ۜۦۡۢۙۡۧۘۤۧۚۥۜۦ";
                        break;
                    case 1930739635:
                        StudioBindActivity.OooO0oO(this.OooO00o, true);
                        str = "۬ۗۛۚۦۡ۫ۗ۠ۦۦۢۙۗۨ۟ۜ۟ۜ۟ۥۘۧۘۦۚ۠۬ۢۜۡۤۙ۠ۚ۟ۛۡۧۘۛۡۨۘ";
                        break;
                }
            }
        }
    }

    static {
        String str = "ۗ۟ۨۚۜۡۘۚۚۛۥۖ۫ۨۖۦۘۘ۫ۢۨۨ۟۬ۨۧۖۜۛۙ۟ۤ";
        while (true) {
            switch ((((str.hashCode() ^ 144) ^ 807) ^ 449) ^ 668868054) {
                case -888114164:
                    o00o0O = StudioBindActivity.class.getSimpleName();
                    str = "ۙۜۘ۠۠ۖۘۘۙۚ۬ۦۛۥۤۡۚ۫۬ۥۤۖ۬۟۫۠ۜۦۘۧ۫۫ۛ۟ۦۘ۫ۛ۫ۥ۟ۛۚۦۦۘ";
                    break;
                case 23864666:
                    return;
            }
        }
    }

    public static /* synthetic */ String OooO(StudioBindActivity studioBindActivity) {
        String str = "ۚۧۖۘ۟ۡ۟ۙۖۘۙ۟ۨۘ۠ۡۧۧۢۧۗۛۗۢۢۘۘ۟۬ۥ۫۠ۦۗ۫ۙۦۥ۫ۨۡۜۘۗۦۙ۠۟ۙۜ۬۠";
        while (true) {
            switch ((((str.hashCode() ^ 737) ^ 758) ^ 87) ^ 804232442) {
                case -2088889818:
                    return studioBindActivity.Ooooooo;
                case 654116443:
                    str = "ۗۦۗۢۗۗۦۜۤۨۢۜ۠ۦۧۤ۬ۦۖۖۘۘۗۤۖۤ۬ۦۘۖۘۥۢ۫ۙۜۗۜ";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean OooO0oO(StudioBindActivity studioBindActivity, boolean z) {
        String str = "ۡۨ۫ۛۛ۫ۧۜۡ۫ۘۧۘۜۢ۫ۙۗۥۖۗۨۧۚۢۘۤۘۘ۟ۤۦ۟ۡۡۘۚ۬ۖۘۛۤ۬۟ۥۜ";
        while (true) {
            switch ((((str.hashCode() ^ 540) ^ 730) ^ 325) ^ 939701805) {
                case -1166656310:
                    return z;
                case -395069818:
                    str = "ۜ۫ۚۖۙۢۖۦ۠ۗۚۥۘۜۦۧۘۧۛۘۦ۫ۜۖۛۛۨۤۖۘۛۖۗۖۧۘۚۚۙۗۡۜۘۘ۬ۙۚۧۖۧۡۥۡۦۜۘۡۙۜ";
                    break;
                case 438344178:
                    str = "ۚۦۥۛۜۧۘ۟ۥۗۥۘ۟ۛۗ۠ۨۗۗۘۛۗۢۦۖۘ۠ۡ۬۠ۚۗ";
                    break;
                case 715092332:
                    studioBindActivity.o00Oo0 = z;
                    str = "۟۟ۘۢۘۧۡۢۖۧۜۛۙۙۘ۫ۖۘ۠ۗ۠ۘ۫ۖۘۜۚ۟ۘۦۡۙۖۦۘۧۢ۟";
                    break;
            }
        }
    }

    public static /* synthetic */ TitleView OooO0oo(StudioBindActivity studioBindActivity) {
        String str = "ۢ۬ۡۥۤۗۗ۠۬ۤ۫ۦ۬ۘ۠ۥۛۘۘۢۢ۬۬ۤۡۙۜۖۘۦۘ۠ۥۗ۠ۗ۟";
        while (true) {
            switch ((((str.hashCode() ^ 898) ^ 970) ^ 154) ^ 53362253) {
                case 58720872:
                    str = "۠ۨۨ۠۠ۘۘۗۜۧۘۖۦۧ۫ۧۘۘۖۛۤۛۥۜۥۚۤۙ۠ۛۦۜۗۥۤ۫ۘۧۖۘۦۨۥۤۦۤۗۢ۟";
                    break;
                case 1431318363:
                    return studioBindActivity.Oooooo;
            }
        }
    }

    public static /* synthetic */ String OooOO0(StudioBindActivity studioBindActivity) {
        String str = "ۤۚۨۘ۫ۡۛ۠ۘۜۘۧۙۨ۫۠ۜۘۜۡۜۘۙۡۢۙۥۘۚ۬ۦۘ۬ۗۧ۬۫ۚۧۢۤۖ۠۟ۡۢۙ۠ۦۘۜۚۧ";
        while (true) {
            switch ((((str.hashCode() ^ C4095le.o00000oo) ^ 586) ^ 935) ^ (-992585881)) {
                case -1541350351:
                    return studioBindActivity.o00O0O;
                case 1639702467:
                    str = "ۨۦۨۘ۫ۖۗ۠ۗۤۗۘۥۘۜ۫ۧۨۢۨۘ۟۬۫ۛ۬ۛ۠ۦۘۙۧۦۘۜۗۖۧۨ۠";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean OooOO0O(StudioBindActivity studioBindActivity) {
        String str = "ۗ۠ۜ۠۬ۦۘۢ۫ۤۖ۠ۨ۟ۨ۬ۥ۫ۖ۠ۦۚۤۦۥۘۨۙۜۘۡۧۨۖ۫ۙۜۧۗۖ۬ۥۘۘۧۖۘۢۚ۠ۧۙۗۙۛۗ۬ۡۗ";
        while (true) {
            switch ((((str.hashCode() ^ 431) ^ 951) ^ 879) ^ (-1207998357)) {
                case -371450771:
                    return studioBindActivity.o00Ooo;
                case -7255067:
                    str = "ۗۖ۟ۜۖۨۥۜۨۜۙۘۘۜۦۘۘۘۗۥۘۥۙۡۘۙۘۛ۬ۜۘۚ۠ۢۨۥۡۚۨۡۘۦۤۡ۬۠ۗۚ۠ۢۖۡۘ";
                    break;
            }
        }
    }

    public static void OooOO0o(Context context) {
        String str = "ۙۢۥ۟ۜۛۛۜۤۚ۠ۜۖۧۗۙۜ۫ۢۗۦۘۖ۟ۗ۠۬ۛۘۖۘۨۡۢۛۢ۟ۙ۟ۜۨۘۗ";
        while (true) {
            switch ((((str.hashCode() ^ 945) ^ 559) ^ 102) ^ (-1804434039)) {
                case -791621358:
                    context.startActivity(new Intent(context, (Class<?>) StudioBindActivity.class));
                    str = "۠۟ۘۗ۠ۡۘۥۘۡۘۡۖۜۤۙۥۘۦۤۘ۫ۚۖۘۙۘۖۜ۠ۖۘۖۜۛ۠ۤۡ۠ۘۡۘ";
                    break;
                case -412562742:
                    str = "ۜۡ۠۠ۜۜ۫ۥۘۘۙۘۘۙ۬ۚۚۗۛۧۤۤۢۤۙۧۖۘۧۦۖۘۥۢۜۚۨۘ۠ۡۛۥۜۛۖۤۥۖۧۢ۬ۦ۟ۘۗۡۘ";
                    break;
                case 1281915332:
                    return;
            }
        }
    }

    public static void OooOOO(Context context) {
        Intent intent = null;
        String str = "۠ۦۨۘ۬ۡۙۥ۠ۢ۬ۡۨۘۜۦ۠ۖ۬ۡ۬ۢ۫ۧۘۘۨ۫ۥۦۛۖۘۡۘۤۛۡۘۚۢۚۚۘ۬";
        while (true) {
            switch ((((str.hashCode() ^ 65) ^ 534) ^ 21) ^ (-515031106)) {
                case -950997388:
                    context.startActivity(intent);
                    str = "ۖ۠ۙۛۧۢۛۗۧۚ۟۠۟ۡۥۘۘۨ۬۬ۦۚ۠۠۬ۢۖۘۛۥۘ۫ۧۘۘۥۖۨۘۤۡۚۧ۟ۦۤۗۨۡۥۘ۟ۧۥۢۨۦ";
                    break;
                case -499368976:
                    intent = new Intent(context, (Class<?>) StudioBindActivity.class);
                    str = "ۛۡۨۙۨۦۘۜۚۗ۟ۤ۬ۙ۟ۢۚۗۗۗۚۚ۟ۙۡۘ۬ۜۦۜۜۧ۫ۧۛۧ۠ۜۘۦ۫۬ۚ۫۫ۥ۬ۖ۬۬";
                    break;
                case -220013783:
                    str = "ۙ۫ۡۘ۠ۢۦۖ۫ۥ۠ۘۥ۫ۜۢۙۤۨۡۜۗۡۢ۫ۨۜۦۡ۠ۙۡ۟ۖۦۡۡۘ۫ۨۨۛۘۚۘۙۧۤۜۧۜ۬۬۟ۨۦۘ";
                    break;
                case 400546186:
                    return;
                case 1346652206:
                    intent.addFlags(268435456);
                    str = "ۚۥۦ۫۫ۡۚۤ۟ۘۧۦۧ۬ۥۘ۟ۚۡۗ۟۬ۖۢۘۤۤۡ۬ۡ";
                    break;
            }
        }
    }

    public static void OooOOO0(Context context, boolean z) {
        Intent intent = null;
        String str = "ۖۡۤۛۡۥۙۥۥۘۤۜۛۖۢۧۜ۬ۢۧۜۜۘۘ۫ۛۚۨۡۗۖ۟ۖۨ۫ۨۢ۠ۛ۟ۜۗۜ۫ۛۘۢ۫۫ۡۘۖۗۚ۠ۗۧ";
        while (true) {
            switch ((((str.hashCode() ^ 425) ^ 878) ^ 200) ^ 1168028113) {
                case -1154078431:
                    context.startActivity(intent);
                    str = "۠ۙۘۢ۠ۥۗۨۥۘۙ۫ۨۘۙ۠ۥۗۘۘۧۢ۠ۚ۫ۥۘۘۥۚۡ۟ۖۘۚۚۘۥۜۖۘۛۚۖۘۧۛۛۥۦۘۘۧۜۖۘ";
                    break;
                case -1101285181:
                    intent = new Intent(context, (Class<?>) StudioBindActivity.class);
                    str = "ۜۛۡۘۙۘۦۖۖۘۜۤۘۙۛۜۗۛ۫ۛۦۨۚۛۚۧۡ۬ۙۜ۟۫ۥۨ۫ۜۤ۟ۧۜۜ۠۬ۗۡۡ۬ۢۙ";
                    break;
                case -37754522:
                    return;
                case 1167850686:
                    str = "ۖۖ۫ۖۢۘۘۦۖۦۘۥ۬۠ۧۦۥ۟ۨۥۘۧۚۖ۠ۜۘۤۖۢۖۙۛ۬ۙۗۦۡ۟";
                    break;
                case 1323871415:
                    str = "ۛ۠ۙ۠۫۫ۘۘ۠ۥۙۦۖۥۨۘۙۨۢۘۚۘۨۨۢ۟ۙۢۛ۟ۥۧۙۦۡ۟ۧۘ۠ۧ۫۬ۨۘ";
                    break;
                case 1395476703:
                    intent.putExtra("is_change", z);
                    str = "۠۟ۘۘۤۙۡۘۧۥۖۡۢۜۖۛ۠۟ۨۧۢ۫ۤۡۡۥ۬ۨۙۗۡۖۘۨ۫ۡۘۥ۟ۚۜۦۡۚۖ۫۠ۛۜۘ۫ۙۜۧۙۨ۬ۜ";
                    break;
            }
        }
    }

    private void OooOOOO() {
        String str = "ۖ۠ۖۘۗۦ۟ۨ۫ۙۦۚۨ۟ۡۡۤۙ۟۠ۛۦۘۖۡۥۘۥۢۡ۟۟ۖۘ";
        StringBuilder sb = null;
        String strTrim = null;
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_ENABLED_VALUE) ^ 228) ^ 464) ^ (-1651431872)) {
                case -1898695579:
                    sb.append("bindStudioProject --> scriptCFGContent=");
                    str = "ۢۜۜۘ۠ۖۖۘۙ۟ۖۗۘۦۘۥۘۦۘۚۛۦۘ۬ۙ۠ۤۢۚۤۦۧۜۧۢۗۛۥۘ۫ۢۢ";
                    continue;
                case -1853849842:
                    sb.append(",scriptUIPContent=");
                    str = "۠ۦۡۘۚۦۘۡۢۘۘۤۖۨۛۚۡۤۨۗۚۥۙۨ۫ۛۜ۫ۡۥۥۨۚۗ۟ۢۦۦۗۥۜۘ۟ۤۦ";
                    continue;
                case -1289939800:
                    sb.toString();
                    str = "ۨ۬ۖ۠۟ۜ۫ۜۘۤۙۨۘۖۚۥۧ۟۫ۡۡۡۚۘۤۨۤۙۡ۟ۡۤۖۘ۫۫۬ۜۢۜۧۚۖۙۚۛۦۛۖۘۗ۠ۨۡ۬ۛ";
                    continue;
                case -669831448:
                    String str2 = "ۤۖۥۘۢۚۖۘۛۜۨۤ۟ۖ۠ۙۢۢۜۜۘۢ۟ۜ۬ۤۨۘۥ۠۠ۧۜۥۙۥۥۨۡۖ";
                    while (true) {
                        switch (str2.hashCode() ^ 1009108041) {
                            case -1265084353:
                                break;
                            case -629048079:
                                str2 = "۫۟ۜ۬ۡۜۘۤۢۚۦۖۖۘۦۢۤۢۧ۬ۨۨۖۙۨۡ۬ۛۥۘ۬ۡ۠ۙۥۧۤ۟ۨ";
                                break;
                            case 356369475:
                                String str3 = "۫ۢۦۘۥۡۡۘۙۧۛۦۨۜۘۖۙۧ۟ۡۢۜ۠ۢۨۚۡۥۨۘۘ۬ۘۙ۟ۜۢ۬ۤ۟۬۬ۘۨۘۚۦ۫ۚۢۡۘۢۛ۫۫ۨۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-447001155)) {
                                        case -1777897917:
                                            str2 = "ۜۡ۠ۤۗ۠ۦۦۥۜۘۜۖۦۨۘۘۧ۠۟ۧۛۦۗۡۡۦۧۨۨۘۖۗۤۗۚ۬ۤۨۤۛ۬ۨۘۨۜۦۘۗۤۧ۠ۦۘۘۧۧۖۘ";
                                            break;
                                        case 516584573:
                                            str3 = !TextUtils.isEmpty(this.OoooooO) ? "۠ۨۤ۟ۦۧۘۦۙۨ۠۟۬ۤ۠ۤۘۜۨۧ۫ۧۘ۟ۛ۬۫ۤۥۥۥۘ۟ۡۗۘۙ۫ۙۜۡۘۢۨۤ" : "۠ۦۚۧۗۘۘ۬ۜۦۘۡ۫ۦۤۨۥۘۡۧۨ۫ۙۘۙۥۜۘۤۧۥۘۢۧۡۜۥۥۡ۠ۗۨۨۘ۬ۧ۬";
                                            break;
                                        case 1243045219:
                                            str2 = "ۦۨۤۜۥۡ۬ۨۛ۬ۡۖۘۗۡۜۖۘۨۘ۟ۛۡۘۘۖۡۘۧۤۥۤۧۘۚۢۦۡۚۥۖۧۧۜۢۗۢۡۥۘۢۖۜۜۘۦۘۦۧۥۘ";
                                            break;
                                        case 2084653869:
                                            str3 = "ۛ۟۬ۖۦۖۘۧۜ۟ۙۖۨۘ۟ۨ۠ۗۘۦۘۡ۟ۖ۫ۢ۬ۡۤۜۘۡۜۙۖۦۘۥ۫ۡۘۥۦۦۘۨۘ۬ۛ۫۟ۚۘۘۚ۟۠۟ۦ";
                                            break;
                                    }
                                }
                                break;
                            case 575678626:
                                str = "ۜۨۜۢ۟ۥۘۡۨۦ۠۟ۜۘۚۜۜۘ۫ۨۘۙۗۜۘۧ۠ۢۙ۟ۛۚۙۖ";
                                break;
                        }
                    }
                    break;
                case -265856239:
                    String str4 = "ۗۚۢۙۙ۠ۜۙۤۚۢۘۤۜۦۘۛ۠ۦۘۢۥ۬ۥ۫ۨۚۦ۟ۥۙۦۘۚ۬ۘۘ۬ۧۜ۠ۦ۫۟۠۫";
                    while (true) {
                        switch (str4.hashCode() ^ 1710370307) {
                            case -1252105658:
                                str4 = "۬ۡۘۘۥۘۥۘۙ۟ۢۥۡۜۘ۫ۤۨۥۜۥۘۚۘۘۙۡۧ۫۬ۙ۫ۜۘۛ۫ۖۘۧۧۦۡۥۧۘ۫ۡۗۘۦۡۘۡ۫ۗ۟۠ۥۨۦ";
                                break;
                            case 875275548:
                                String str5 = "ۢ۠ۡۘۛ۟۬ۜۗۖۘۙ۬ۢۘۘۘ۫ۘۡۘۧۦۜۘۦۖۧۜ۠ۢۜۙ۟ۤۚۡۘۨۗۜۘۛۨۦۘۦۛۧ";
                                while (true) {
                                    switch (str5.hashCode() ^ 950117266) {
                                        case -713316740:
                                            str4 = "ۤۚ۫۫۟ۙۥۧۘ۫۬ۥۚ۫ۘ۫ۜۖۘ۫ۚۨۘ۫ۤۡۘۤ۟ۖۙۡۗۚۨ۠ۗ۬۟ۨ۬ۨۥۨۖ۠ۛۥۚۨۘۧ۬ۛۛۖۖۘ";
                                            break;
                                        case -263617013:
                                            str4 = "ۗۙ۠۬ۛۧ۟ۥۡ۟ۗ۬ۗۘۚۖۢ۬ۜ۫ۦۨ۬ۥۘ۟ۛۜۛ۠ۘۛۢ۠ۧۢۥۘۜۘۡۘ۬ۖۢ";
                                            break;
                                        case 128156706:
                                            str5 = "ۜۤ۫ۜۢۨۢ۬ۦۤۖۧۗۧ۬ۜۢۛۢ۬ۥۘۦۜۨۘۜۜ۬ۨ۫ۨ۟ۖ۠ۗ۬ۥ۟ۨ۬ۜ۠ۖۘۘۙۘۥۖ۬";
                                            break;
                                        case 1747926858:
                                            str5 = this.o00Oo0 ? "۠ۗۥۚۨۙۧۥۥ۬ۙ۫ۦۖۦۨۘ۫ۢۜۛۢۜۚۜۦۘۨۢۥۛ۟ۚۤ۬ۨۘۨۚۖۘۡ۫ۜۙۡۜۘ۬ۚۧ" : "۟ۧۜۤۡۖۘ۬ۖۘۘۨۨۘۧۘۙۜۧۙۡ۬ۡۘۗۜۡۘ۠ۦۘۗۦۥۘ۠۟ۨ۬ۖۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1298908389:
                                str = "۠ۛۦۘۡۗ۬ۢۛۛۘۙۢۧۡۦۙۗۧۢ۠۟۫۬ۧۛۥۙۨۡۚۨۥۖۖۥۧ۫ۚۧ۫ۦ۫";
                                break;
                            case 1858415022:
                                break;
                        }
                    }
                    break;
                case -185738699:
                    sb.append(this.o00O0O);
                    str = "ۖۦۗۧۥۦۧ۟ۘۘۥۘۦۦۘۘۙ۫ۦۜۚۗۚۦۢۥۙۛۙ۬ۡۘ۫ۖۥۥ";
                    continue;
                case -169696899:
                    C3753c5.OooO0Oo(getApplicationContext(), R.string.project_number_number_can_not_empty);
                    str = "ۙۜۚۚۗۧۙۖۘۘۚۚۖۢۘۗۥۡۡۥ۫ۢۘۛۙۛ۫ۦۘۘۥۦۖۛۖۛۡۨۘ";
                    continue;
                case 222734506:
                    this.o00Oo0 = false;
                    str = "ۧۗۗۢ۬ۜۘۤۡۨۘۢ۫ۡۘۘۥ۬ۜۢۤۤۜۢۥۜۖۘۢ۫۠ۢۗۨۘۧۘۖۘۥۛ۟ۙۨ۫";
                    continue;
                case 294401029:
                    this.Ooooooo = strTrim;
                    str = "ۤ۬ۥۘۗ۟ۦۘ۟۫ۛۤ۠ۜۛۢۜۘۚ۫ۥۖۤۖ۫ۜۥۢ۫۟ۧۦۖۛۚۜۘۗۡۦۘۡ۫ۗ۟ۥۖۘۚۜۘۘۘۚۛۨۘۧ۟ۥ";
                    continue;
                case 538495353:
                    sb.append(this.ooOO);
                    str = "ۢۙۥۧۚۘۘۡۚۥ۫ۦۖۘۤۗۜۚ۟ۧۧ۬ۨۘۨ۬ۥۘۜۡۨۦۙۘۨۡۧ۫ۖۨۥۘۡۢۡۤۤۙۘۨ۫";
                    continue;
                case 712145069:
                case 2012052498:
                    return;
                case 754472309:
                    String str6 = "ۘۚۡۘ۟ۤ۬۫ۡۗۡ۟ۢۡۚ۟ۖۥۘۗ۟ۥۘۤۙ۫ۤۥۤۨ۫ۙ۟ۗ۬ۧ۬ۙۖ۫۠ۖۛۨۘۖۦۨۘۖۦۡۚ۫ۧۜۗۚ";
                    while (true) {
                        switch (str6.hashCode() ^ (-1425406369)) {
                            case -2143838070:
                                str = "ۗۗۡۘۘۡۗ۬۟۫ۙۢۙۡ۠ۧۨۘۚ۠ۗۥۥۘۥ۬ۖۚ۬۬ۖۗۜۢ۫ۤ۬۠ۙۥۗۤ";
                                continue;
                                continue;
                            case -2104116319:
                                str = "ۙۦۦۘۛ۬۬ۨۘۘۧۢ۠ۨۗۘۘۥۙ۠ۖۤۡۡۛ۬ۜۤ۠۫ۛۡۘۖۧۜۘۥۚۙ۠ۚۡۥۤ۠ۜۥۜۤ۠ۜۥۜ۬ۚ۫ۘۘ";
                                continue;
                            case -1812191445:
                                String str7 = "ۙۙۘۘ۫ۡۦۚۥۦۘۜۜۡۘۢ۬ۡۘ۫ۤۨۢۧۖۦۧۦۨ۫۟ۛۙۘۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 927287217) {
                                        case -1703691744:
                                            str6 = "ۗ۬ۜۤۢۖۢ۫۫ۛ۫ۖۘۜۧۢۚۖۖۘ۟ۢۚۡۢۦۘۤۡۙۚۥۙۜۦۗ۬ۜۘۨۚۘۘۧۜ۬ۢ۬ۢ۫۬ۥ۫ۛۤۦۤۥ";
                                            break;
                                        case -850743667:
                                            str7 = TextUtils.isEmpty(strTrim) ? "ۗۦۢ۠۟ۡۘۙۦۖۗ۠ۦۘۤۤۖۘۧۘۥۘۖۢۗ۟ۤۦۘۦۢۙۦۦ۫ۡ۫ۥۗ۟ۥۘ۠ۢۤۡۗۥۘۛ۟ۚۗۡۧۘۜۘۡ۠ۗۨۘ" : "ۖۢۥۥۖۜۨۜۘۘۨۚۡۘ۠ۢۖۦۤۜۘۤۜۗ۠ۖۙۥۥۧ۫۬ۦۢ۫ۙۚۥۜ۟ۧ۬ۢۙ۠ۧ۠۫ۖۥ";
                                            break;
                                        case -757919861:
                                            str6 = "ۗ۟ۦۧۚۥۘۨ۠۫ۚۖۥۘۘۢۖۘۦۘۜۘۙۜۢۧۨۢۚۥۙۧۨ";
                                            break;
                                        case 730310414:
                                            str7 = "ۨۨۗ۫ۥ۬ۚۘۘۦ۬ۖۗۖ۠۠ۦ۟ۙۢۙۛۖ۠ۥ۠ۤۙۤۧ";
                                            break;
                                    }
                                }
                                break;
                            case 307495680:
                                str6 = "ۥ۬ۖۘۨۚۜ۫۫ۚ۬ۛۦۙۙۡۜۘۨۜۗۙۧۢ۟ۦۦۡ۠ۤ۠ۜ۫ۤۘۙۦۘۨۛۤۖۡ";
                                break;
                        }
                    }
                    break;
                case 1200580493:
                    str = "ۡۜۡۤۤۨۨۥ۬۬ۚۘۙۨۦۘۢۡۦۢۚۘۘۘۤ۠ۘۗۜۦۘۘ";
                    strTrim = this.Oooooo0.getText().toString().trim();
                    continue;
                case 1363601025:
                    str = "ۚۙۜۦۥۧۘۦۥۙ۠۫ۦۘۤ۫ۥ۬ۚۖ۬ۡۚ۠ۜۘۘ۫ۘۧۗۨۘۧۘ۟ۘ۠ۖۘۨۢ۠ۘ۬ۦۘ۠ۦۘۘۧۘ۫ۜ۟ۡ۫۟ۨ";
                    sb = new StringBuilder();
                    continue;
                case 1658457783:
                    C4278qc.OooO0oO().OooO0OO(this, this.Ooooooo, this.OoooooO, this.o0OoOo0, this.ooOO, this.o00O0O, new OooO00o(this));
                    str = "ۚۢۥۘۡۨۧۘۨۧۘۥۤۖۘ۠ۨ۠۫۟۬ۧ۫ۙۧۚ۫ۙۨۙۨۙۥۗۦۧۦۛۤ";
                    continue;
                case 1904840663:
                    str = "ۙۧۤۢ۬ۡۥۘۜۘ۫ۚۗۤ۠ۖۘۡۤ۬۟ۦۜ۫ۦۨۘۙ۫۬ۢۙۢۧۨ۟ۚۨۢ";
                    continue;
            }
            str = "ۚۢۥۘۡۨۧۘۨۧۘۥۤۖۘ۠ۨ۠۫۟۬ۧ۫ۙۧۚ۫ۙۨۙۨۙۥۗۦۧۦۛۤ";
        }
    }

    private void OooOOOo() {
        String str = "۟ۦۨۦۨ۟۟ۢۡۘ۬ۛۤۘۘۤۨۨ۟۟ۤۚۙۥ۠ۧۤ۫ۧۢ۫ۧ۠ۧۤۜۘۨۨ۫۫ۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 191) ^ 947) ^ UiMessage.CommandToUi.Command_Type.FW_SET_LEFT_VALUE) ^ 916768133) {
                case -1815351157:
                    this.Oooooo.setVisibilityLeftImage(0);
                    str = "ۛ۠ۢۗۛۦۖۘۙۖۧۘ۬ۙۤ۟ۤۡ۟۫۬ۘۗۨۙ۬۟ۗۧۖۢ۟ۙۨۘۦۗۢۙۤۡۘۙ۠ۡۢۗۙ";
                    break;
                case -1539528826:
                    this.Oooooo.setTitleText(R.string.already_bind_project_number);
                    str = "ۨۖۡۘ۬ۥۤۜۡۙۙ۟ۖۘۤۗۜۘ۬۠ۡۘۛۙۦ۫۬ۖۘۗۨۜۢۧۖۛۡۖۥۘۘۧۙ۠ۖۨۨ۫ۘۖۚۥۘ";
                    break;
                case -1524035148:
                    this.Oooooo.setOnLeftImageViewListener(new TitleView.OooO0O0() { // from class: z2.k9
                        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
                        public final void onClick(View view) {
                            this.OooO00o.OooOOo(view);
                        }
                    });
                    str = "ۧۚۥۘۤۥۧۘۙۙۡۛۗۧ۟ۦ۠ۢۡۚۡ۫ۜۛۨۘۦۦۜۘۥۦۧۘ۫ۨۨۘۜۛ۟ۙۦۜۢۚۡۘۨۛۤۚ۫۟ۨۜۡ۫۟۬";
                    break;
                case -1386946935:
                    str = "ۙ۟ۚۥۨۚۚۦۥ۫ۢۘ۫ۦ۟ۥۢ۬ۤۢۢۥۧۦۘۜۧ۠ۙ۠ۢۛ۟ۜۘۡۨۘۘ";
                    break;
                case -522261257:
                    this.Oooooo.setVisibilityRightImage(4);
                    str = "ۙۖۘۛۤۥ۠ۨۢۙۨۜۚ۟ۧۡۢۦۗۜۧۘۘۧۖۦۙۖۚ";
                    break;
                case -365929928:
                    return;
                case 1670875943:
                    this.Oooooo.setleftImage(R.drawable.ic_back);
                    str = "ۤۧۤۙۙۗۖۢۛۜ۫ۖۘۢۚۡۗۚۘۨ۫۫ۗۨۢۢ۬ۨۘۙۥۦۘۦۢۘۘۢۜۜۘ۬ۗۘۘۧۛ۟ۡ۟ۘۜ۟ۦۨۨۧ۟ۦ۫";
                    break;
            }
        }
    }

    private /* synthetic */ void OooOOo0(View view) {
        String str = "ۙ۟ۛۦۤۚۦ۠ۖ۠ۘۨ۠ۥ۬۟ۢۘۡۗۡ۬ۚۗۡۢ۟ۦۡۤ۫ۥۢۧ۫۬۟ۧ۠ۜۜۗ۟ۜۜۧ۟ۖۨۘۘۥۜۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 756) ^ 17) ^ 586) ^ 1661805731) {
                case -765912901:
                    return;
                case -250845869:
                    str = "ۨۙۖۘۙۡۘۦۜۜ۠ۖۡۘۚۤۧۨۦۗۦۘۙۧۨۘۖۢ۫ۗۡۥ۬ۛۙۜۖۘۨ۬ۛۗۖۦۘۦۦۖۘۛۨۨۘ";
                    break;
                case 399881817:
                    str = "ۗۘۦۘۤ۟ۧۡۙۚۘ۟۟ۗۨ۠ۗۡۥۢۢۙۨۤۛۘ۠۫ۨۨۧ۠ۘۘۛۚۨۨۥ۟ۗۤ۠ۜۦۘ۟ۗۨۘۦۜ۟ۛ۬ۥ";
                    break;
                case 670973134:
                    finish();
                    str = "۫ۙۖۥۤۥ۬ۨۧۗ۟ۤۜۧۛۤۥۦۘۜۢۚ۬۬ۜۥۧۥۘ۬ۜۘۨۗۥۨۥۘۨۢۙۛۘ۠ۧۥۡۘۛۖۥ۠۫۫۫ۗ";
                    break;
            }
        }
    }

    private void initData() {
        this.o00Ooo = getIntent().getBooleanExtra("is_change", false);
        String str = "studioProjectNumber:" + AppContext.OooO00o().OoooOoO;
        Script scriptOooO0oO = C3718b7.OooO0Oo().OooO0oO();
        String str2 = "۟ۤۜۦ۫ۡۘۜۡۨۘۜۘۗ۬۬ۚۘۡۜۘ۟۟ۢۧۡۥ۫ۘۥۦۤۜۘۨۤۥۖۤۜۖ۬ۖۦ";
        while (true) {
            switch (str2.hashCode() ^ (-2146395124)) {
                case -1306678038:
                    str2 = "ۨۥۨۘۨ۟ۜ۫ۨۡۘۨۙۥۘۥۥۦۘ۫ۦۢۢۥ۫ۖ۠ۦۘۤ۬ۛ۬ۗۨۘ";
                    break;
                case -1229968381:
                    try {
                        j10.OooO0o().OooOOOO(new MsgItem(MsgItem.SCRIPT_UI_SAVE_CFG));
                        this.OoooooO = scriptOooO0oO.getId();
                        this.Ooooooo = AppContext.OooO00o().OoooOoO;
                        this.o0OoOo0 = C3683a9.OooO0o(this, C3718b7.OooO0Oo().OooO0O0);
                        this.ooOO = C3683a9.OooO0oO(this, C3718b7.OooO0Oo().OooO0O0);
                        this.o00O0O = C3683a9.OooO0Oo(this);
                        String str3 = "initData --> scriptUIPContent=" + this.ooOO + ",mScriptCFGContent=" + this.o00O0O;
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                case 498112507:
                    return;
                case 578352292:
                    String str4 = "ۜۢۡۦۛۖ۫ۤ۫ۙۗۧ۬ۡۤ۠ۚۧۗۥۖ۠۬ۜۛۚۨۖۙۘۖ۫ۙۜۢۨۘۜۜۦۘۜۗۖ۫۟ۤ۠ۨۘ۟ۧ۟ۜۜۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 1188237291) {
                            case -651358824:
                                str2 = "۫۬ۘۢۢۗۙۛۛ۠ۖۧۗۘۜۙ۟ۜ۫ۘۛۘۧۤۜۤۨ۠ۘۜۜ۬ۤۗۚۘۡۤ۫ۗۤۡۜۢۦۧۘ";
                                continue;
                            case 671674292:
                                str4 = scriptOooO0oO == null ? "۠ۙۛ۠۬۠ۢۧۧۤ۟ۤۦۧۤۥۘۥۘۖۘۖۛۛۥۘ۫ۙۦ۟ۖۙ۬ۙۦۘۥ۬ۡۘ" : "ۢۦۥۘۧۡۨۥۥۖۘۙۛۘۗ۠۟۬۬ۗۖ۬ۡۘۥۢۢ۠ۙ۬ۚۛۥۘ";
                                break;
                            case 1033057877:
                                str2 = "ۘۖۘۥۦۖۘۘۢۙۡۙۥۗۢۜ۠ۥۥۘۚۧۖۘۖۤۚۗۙۧۛ۬ۦۘۘۡۡۘۧۘۚۛۖۨۥۜۤۚۘۜۜۚۡۚۚۚۜ";
                                continue;
                            case 1855801990:
                                str4 = "ۗ۟ۥۨۢۗۡ۠ۜۖۘۗۥۥۖۢۚۗۨۡۘ۬ۤ۬ۧۡۚۨۘۦۤۥ۬ۨۜ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    private void initListener() {
        String str = "ۖۜۥۘ۟ۡۤۖ۟ۦۘۙۖۡۘ۟ۘۡۘۤ۟ۥۙ۬ۨۘۗۦۡۘ۬۟ۨۘۖۛۨ۫ۙۥۘۥۚۥۘۗۢۢۖ۬ۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ C4095le.o00000o0) ^ 74) ^ 803) ^ 1414218304) {
                case -820479886:
                    return;
                case 1796702069:
                    this.OooooOo.setOnClickListener(this);
                    str = "ۚۚ۟ۨۤۨۘۘۦ۠ۧۜۛۛ۫ۦۡۤۢۖۢ۠۟۫ۜۨۥۦۘۖۤۦۘۜ۠۫ۦ۟۬";
                    break;
                case 1918233615:
                    str = "ۙۦۘ۫ۙۨۛ۬ۢۙ۠ۧۗۤۜۘۚۘۗۗۜۖۘۢۛۜۧ۟ۡۘۘ۫ۤ";
                    break;
            }
        }
    }

    private void initView() {
        TitleView titleView = null;
        String str = "۬ۨۖۜ۬ۦۘ۫ۚۖۘ۫ۛۘۘۤ۫ۨ۬ۥۤۙۘۘۘۜۥۘۘ۟ۥ۠۫ۛۚ۫ۨۡۚ۫ۢۤۨۥۥۖ";
        while (true) {
            switch ((((str.hashCode() ^ 842) ^ 624) ^ 964) ^ 1120127484) {
                case -2024421445:
                    this.OooooOo = (TextView) findViewById(R.id.tv_studio_bind);
                    str = "ۦۢۤۚۖۥۘۦۥۢ۬ۥۘۘۖۧ۬ۦۢۜۘۙۧۗ۟۬ۜۧۜۘۦ۠ۢۨۥۘۚۦ۠";
                    break;
                case -51012813:
                    return;
                case 340602064:
                    this.Oooooo0 = (EditText) findViewById(R.id.et_studio_project_key);
                    str = "ۤۢۦۘ۠ۡۙۜ۫ۡۨۨۨۢۢ۫ۗۨۦۘۚ۫ۡۤۡۙۨۘۢ۠ۙ۠";
                    break;
                case 1123213259:
                    titleView.setVisibilityTvRight(0);
                    str = "ۦۦۙۜ۫۠ۦ۟ۘۛۛۨۘۢۖۖۘ۫ۦۘۚۥۡۘ۫۬ۘۚۚ۬ۛۜۡۦ۠ۢۥۖۚۧۥۜۤۡ۟ۦ۫ۨۢۗۖۜۡۦۘۜۖۦ";
                    break;
                case 1453067844:
                    str = "ۢۛۖۢۦۜۧۤۢۥۗۦۘۦۦۖ۬۫۠۫۠ۦۘۢۥۤۙۧ۠ۧۗۜۘۜۘۙۚ۫ۤۤۛۧۜۚۦۖ۟ۧۧۡ۬ۚۧۦۘۦۖۥ";
                    break;
                case 1646639678:
                    this.Oooooo = titleView;
                    str = "ۚ۟ۘۗۢۢۘۖۥۥۚۦۙ۟ۦۘۢۨۗۢۦۘۘۥۨ۬۬ۥۢ۬۠ۖۛۨ۟ۙۙۦ۠۫ۘۘ۠ۖۜۘ۟ۘۧۘۥۨۚ";
                    break;
                case 1957026165:
                    str = "ۡۚۥۘۘۘۖۘۘۜۚۘۛۜۘۖۧۘۘۘۘۚ۠ۧۜۦۘۦ۫ۜۤۡۚ۠ۤۗۜۘۜۖ۬ۜ۬ۗۛۦۜۘۦۦۨۘۜۨۘۘ";
                    titleView = (TitleView) findViewById(R.id.titleView);
                    break;
            }
        }
    }

    public /* synthetic */ void OooOOo(View view) {
        String str = "۬ۦۜۘۧۚۚۨۚۚ۟ۤۘۘۤۘۥۘ۟ۖۙۡۥۛۨۚۦۙۛۧۛۘۡ۫ۨۥۘۦۜۥۘۢۖۡۡۨۜۜۡۢۦۢ";
        while (true) {
            switch ((((str.hashCode() ^ 139) ^ 896) ^ 912) ^ 781686763) {
                case -1232356041:
                    return;
                case -1121429203:
                    str = "ۥۘۦۗۘۧۖۦۗۖ۟ۨۘۛۖۛۤۛۛۛ۟ۦۘۜۘۡۘۤۦۥۘۦ۫ۘۘۥ۟ۡۘۥۜۢۢ۠ۨۡۚۢ";
                    break;
                case -42781739:
                    str = "۠ۖۖۘۘۘۧ۫ۘۦۘۥۢۜۘۙۖۘ۠ۗۡۘۚۙۘۘۤۗ۬۟ۙۤۗۗۨۡۧۤۗۦۡۤ۫ۡ۟ۛ";
                    break;
                case 1788315516:
                    OooOOo0(view);
                    str = "ۚۙۖۘۧۨۨۙۤۗۨۜۚ۬۟ۚ۬ۥۚۥۤۢۨۧ۫ۛۚۦ۠ۡۥۚ۟ۙ۟ۤۖۘۡ۫ۖۘ";
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = "ۗ۬۠ۡۤۖۢۜۘ۟ۨۚ۟۫ۗۡۖۡ۬ۤۤۤ۟ۘۙۘۖۥۘۡۜ۠ۘۤۚۗۤ۫ۜ۟ۜۘۗۙۨ۬ۜ";
        while (true) {
            switch ((((str.hashCode() ^ 227) ^ 990) ^ 674) ^ (-1881553325)) {
                case -2059829372:
                    OooOOOO();
                    str = "ۚۘۘۛ۟ۤۛۦ۠ۢۡۘ۠۬ۜۜۖۦۘۚۖۦۢۤۦ۟ۢ۟ۥۚ";
                    break;
                case -1635223628:
                    str = "ۥۜۚۗۦۖۧ۫ۡۘۧۘۜۘ۫ۘۧۘۗ۬ۜ۬ۘۖۘۨۖۖۘ۠ۡۖۘ۫ۚ۟";
                    break;
                case 108569523:
                    str = "ۛۤۤۖۚۤۨۨۧۘ۟ۤۢ۠ۘۜۚ۠ۡۘۙۗۧ۫ۨۢۢۡۢۢۨ۠ۡ۫ۦۨۘۢ۫ۖۜۘۢ۠۠";
                    break;
                case 354871550:
                    String str2 = "ۨۢۦۧۚۚۤۢۗ۟ۗۙ۬ۚۦ۠ۙۨۘ۠ۙ۫ۥۜۖۨۜۖۤۘۘۘۡۦۥ۟ۤۢۦۘ۟۟ۚۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1801088078) {
                            case -1486395834:
                                str = "۫۟ۘۘ۟ۖ۬ۗ۠ۡۘۛۨ۬۫ۖۨۖۜۨۚۙۡۘۘۨۦۛۨ۫ۨۚۛ";
                                continue;
                            case -1251269287:
                                str2 = "ۥۗۖۦۛۗ۠ۛۦ۬ۥۡۛۡ۬ۨۦۘۧۤ۠ۦۦ۟ۘۗۢ۫ۢۚ";
                                break;
                            case -358978020:
                                String str3 = "ۚۗۡۘۙۧۚۖ۠ۗۚۦۨۘۖۦۦۗۛۥۡ۟ۚ۟ۨۤۢۢ۫ۙۛۥۚۡۥOۦۘ۫۠ۖۘۛۦۦ۠ۛۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1063672648)) {
                                        case -1884497551:
                                            str2 = "ۦ۬ۜ۠ۘۦۢ۟ۥۚۚۧ۫ۛۥۘ۠۟ۥۚ۫ۘۗۚۡۨۖۖۘ۟ۘ۫ۢۥۖۚۗۙ";
                                            break;
                                        case -881847717:
                                            str3 = "ۧۡۖۘۧۙۗۧۢۧۨۡۧۘۤۖ۬ۛ۠ۙ۠ۘۖۧۖۜۘۢۧۧۚۖۜۤۨۘۥ۬۬";
                                            break;
                                        case -802959176:
                                            str3 = view.getId() != R.id.tv_studio_bind ? "ۦ۬ۥۘۡۥۚۧۖۦۖۘۡۛۘۡۘۡۖۘۜۚۜ۟ۚۥۧۡ۫ۘ۬ۜۘۛۚۖۥ۠ۖۤۤۧۡ۫۬ۜ۠ۡۨ۫ۙ" : "ۚۜۧۘۢۧۙۥۘۨۢۜۚۙۥ۬۠ۡۥۦۤۡۙۤۤۘۜۘۘۜۦۗ۬ۙۢ۫ۙۨۘۧۢۖ۫ۖۦۘۛۚ۟ۤۖۚۜ۬ۥۘۢۨۢ";
                                            break;
                                        case -781311159:
                                            str2 = "ۨۜۛۗۨۤۦۚۚۧۢۨ۬ۚۙۚ۬ۜۛۤ۫ۖۗۦۘۦۗۢۚۖۘ۫۟ۗ۬ۢۙۖۗۥۨ۠۠ۦ۬ۨۧۢ۟ۡۢۡۘۡۜۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case 2001613957:
                                str = "ۚۧۛۦ۫ۢۜۧۚۨۨۖۢۢۡۢۚ۬ۛۙ۠۟ۨۡۚۦ۫ۨ۟ۡۡۗۨۜۦۘۥۖۧۘۘۛ";
                                continue;
                        }
                    }
                    break;
                case 1162793193:
                    return;
                case 1547883079:
                    str = "ۚۘۘۛ۟ۤۛۦ۠ۢۡۘ۠۬ۜۜۖۦۘۚۖۦۢۤۦ۟ۢ۟ۥۚ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "۟ۡ۠۬۬۬ۧۢ۟ۤ۠۠۬ۜۖ۬۫۫ۦ۠ۦۘۗۨ۬ۜۨۘۨۙۦۘۛۛۤۚۢۨ";
        while (true) {
            switch ((((str.hashCode() ^ 758) ^ 194) ^ 81) ^ 553389415) {
                case -1892597806:
                    str = "ۘ۠ۨۚ۫ۜۛ۫ۖۘۦۘۧۤۢ۫۬۫ۡۨۘۨۖۖۘ۬ۖ۫ۜۨۜۦۚۨۘۨۗۢۨۖۦۘ۠ۚۛۗ۠ۤۦۗۥۘ";
                    break;
                case -1007287760:
                    OooOOOo();
                    str = "ۡ۟ۥۘ۫ۤۡۗ۬ۧۜۢۙ۬ۢۧۤۢۖۜۗۜۘۢۦۢۖۥ۟ۢ۟ۧۥ۠ۙۙۢۛۡۤ۟ۤ";
                    break;
                case -237377446:
                    super.onCreate(bundle);
                    str = "ۤ۟ۜۚۢۖۜۙۥۨۖۘ۬ۚۦۦۦۧۖۖۡۤۛۡۘ۠۫ۖۧۖۜۘۜۜۚۤۚ۟ۖۙ۬ۜۡۙۜۡۘۘۤۖۙ";
                    break;
                case -221900674:
                    initView();
                    str = "ۛۘۧۘ۫ۥۥۘۖۗۙۖۥ۬ۜۖۘۖۙۥۘۖۘۦۚۖۖۚ۠ۖۘۥۜۘ۬ۜۥۢ۠ۨۥۘ۟۬ۖ";
                    break;
                case 8424385:
                    return;
                case 765693601:
                    setContentView(R.layout.activity_studio_bind);
                    str = "ۢۙ۫ۤۖۨۘۧ۬ۦۜۚ۬۠ۜۘۛۢۖۨ۫ۘۘۥۢ۬ۤۙۖۘۨۥۜۗ۟ۤۦ۟۠ۙۚۙۙۛۘۘۢۜۥۛۧۖ";
                    break;
                case 1549530771:
                    str = "ۗۚۚ۟۬ۥۘۜ۠ۘۘ۟ۜۡۘۥۤۛۧ۬ۙۡۨۢۘۘۤ۟ۖۘۦۢ۫ۙۖ۫ۧۦۡۘۜۦۨۢۚۨ";
                    break;
                case 2012063260:
                    initData();
                    str = "ۤۙۗ۫ۨۡۘ۠ۢۥۚۧۡ۠ۖۨۘۖۚۨۙۜۙ۠ۥۘۙۥۙ۠ۥ۬ۧۘۦۘۗۛۥۙ۬ۨۛ۬ۗ";
                    break;
                case 2087091107:
                    initListener();
                    str = "ۖۡ۟ۥۧۘۘۜۡۧۘۛۛۡۢۙۖ۬ۚۙۙ۬ۚۨۡ۫ۗۖ۬ۥۛۚ";
                    break;
            }
        }
    }
}
