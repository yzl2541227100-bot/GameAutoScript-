package com.cyjh.elfin.p200ui.activity.studio;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.elfin.entity.Script;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;
import p285z2.C3678a4;
import p285z2.C3718b7;
import p285z2.C3753c5;
import p285z2.C3839eh;
import p285z2.C4095le;
import p285z2.C4241pc;
import p285z2.j10;

/* JADX INFO: loaded from: classes.dex */
public class EditDeviceNameActivity extends BaseActivity implements View.OnClickListener {
    public static String Oooooo = null;
    public static final String OoooooO = "device_name";
    private TitleView OooooO0;
    private EditText OooooOO;
    private Handler OooooOo = new Handler();
    private ImageView Oooooo0;

    public class OooO00o implements C4241pc.OooO00o {
        public final String OooO00o;
        public final EditDeviceNameActivity OooO0O0;

        /* JADX INFO: renamed from: com.cyjh.elfin.ui.activity.studio.EditDeviceNameActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC4696OooO00o implements Runnable {
            public final OooO00o OoooOoO;

            public RunnableC4696OooO00o(OooO00o oooO00o) {
                this.OoooOoO = oooO00o;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = "ۡۧۥۙۦۦۘۖ۬ۛۜۥۚۢۦۥۖ۠ۢۡ۫۠ۤ۠ۥۚۥۖۛۛۥۘۨۖۦ۫ۥۜۘ";
                while (true) {
                    switch ((((str.hashCode() ^ C4095le.o00000o0) ^ UiMessage.CommandToUi.Command_Type.FW_ZORDER_VALUE) ^ 58) ^ (-1216744711)) {
                        case -1949938557:
                            return;
                        case -1674890818:
                            str = "ۧۛۧۦ۬ۦۤ۟ۤۧۙۛ۟۟ۙۚۙۨۢۥۢۖۦۡۘۘ۟ۢۦۢۤ";
                            break;
                        case -1224235060:
                            C3753c5.OooO0o0(this.OoooOoO.OooO0O0.getApplicationContext(), "修改成功！");
                            str = "ۗ۫ۤۚۤۥۧ۠ۛۦۚۨۘۖۛۛۧۗۖۧۥۦۘۦ۬ۢۦۥۘۛۥۡۘ۠ۤۖۗۗۘۘۨۚۤۥۚ۠۟ۜۧ۫ۚۦۘ";
                            break;
                    }
                }
            }
        }

        public class OooO0O0 implements Runnable {
            public final String OoooOoO;
            public final OooO00o OoooOoo;

            public OooO0O0(OooO00o oooO00o, String str) {
                this.OoooOoo = oooO00o;
                this.OoooOoO = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = "۫ۗۘۧۧۚۜۛۛۢۙۜۘ۬ۙۥۡۨۡۘۨۧۥۘۦۨۦۛۡ۠ۢ۠ۜۘۛ۟ۖۘ۫ۡ";
                while (true) {
                    switch ((((str.hashCode() ^ 17) ^ 496) ^ 444) ^ 762928057) {
                        case -1692404851:
                            C3753c5.OooO0o0(this.OoooOoo.OooO0O0.getApplicationContext(), this.OoooOoO);
                            str = "ۡۜۘۡ۫۫۬ۡۘۘۘۥۘۛۨۜۘۗۙ۟ۤۥۜۘۢۗۥۛۢ۫ۛ۫ۘ";
                            break;
                        case -1252844873:
                            str = "ۤۤ۟ۥۧۨۘۢۙۖۘۜۗۜۚۖۗۖۚۨۙۦۡۘۢ۫۠۬۫ۧ۬۠ۘۘ";
                            break;
                        case -1001168143:
                            return;
                    }
                }
            }
        }

        public OooO00o(EditDeviceNameActivity editDeviceNameActivity, String str) {
            this.OooO0O0 = editDeviceNameActivity;
            this.OooO00o = str;
        }

        @Override // p285z2.C4241pc.OooO00o
        public void OooO00o(int i, String str) {
            String str2 = "ۛۙۡۧۜۗۢۧۦۢۗۧۛ۠۫ۗۦۜۘ۠ۖۜ۠۠ۗۢۦۚۦۖۛۖۧۥۘۨۙۖۘۜۨۡۚ۠ۡۘۘ۫۠ۧۜۥۘۛۤۘۢ۫";
            while (true) {
                switch ((((str2.hashCode() ^ 553) ^ 903) ^ 848) ^ 314483055) {
                    case -1294981878:
                        str2 = "۟ۘۙۡۦۖۘۗۛۜۜۖۜۖ۠ۙ۟ۜۙۦ۠۟ۧۤۦۘ۬ۧۡۘۜۦۖۘ";
                        break;
                    case -389159674:
                        str2 = "ۛۚۤۥۨۗۙۡۦۘۖۘۢ۟ۙۦۗۢ۫ۤۙۙ۠۠ۧۦ۟ۨۘۨ۬۬۫ۘۥ۫ۤۤۦۧۜۜۨۘ";
                        break;
                    case 238817171:
                        return;
                    case 482873509:
                        EditDeviceNameActivity.OooO0oo(this.OooO0O0).post(new OooO0O0(this, str));
                        str2 = "ۥ۠ۚۢۦۘۧ۟ۘۧۘۘ۟ۥ۟ۜۙۨۧۜۤ۬ۗۙۘۥۘۘۖۢۜۘ";
                        break;
                    case 1375271844:
                        str2 = "ۢ۠ۦۘۨ۫ۘۘۖۖۧۘۡ۟ۥۘۗۥۜ۫۠ۨۗۛۛۤۡ۫ۥ۠ۢۛۡۨۥۛۡۡ۟ۡۘۚۛۤۜۖۤ";
                        break;
                }
            }
        }

        @Override // p285z2.C4241pc.OooO00o
        public void onSuccess(String str) {
            String str2 = "ۚ۠ۙ۬ۦۦ۫ۚۥۘۦ۠ۜۘ۫ۢۡۢۚۦۥۨۙۜۡۢۡۧۘۨۦۧۘۢۧۚۘۙۧۦۙۡۘۘۧۥ۬۬ۘۘۖ۟ۜ۫ۜۘۛۙۥ";
            while (true) {
                switch ((((str2.hashCode() ^ 482) ^ 862) ^ 892) ^ 1437555196) {
                    case -1205818404:
                        this.OooO0O0.finish();
                        str2 = "ۛۛۚۤۡۡۘ۟ۨۘۘ۟ۦۜۦۢۗۦۥۡۖۜۢۗۥۜۘ۫ۛۦۙ۬ۜۙۗ۟ۜۧۥۛۢۦ۟ۚۥۡۚۚۤۦۢۢۨ";
                        break;
                    case -62556607:
                        str2 = "ۛۘۥ۟ۛۖۘۛۦۘ۬۫ۚۦۨۧۘ۟ۜۡۤ۠ۘۘ۟ۚۤۚۤۦۗۙۛ۬ۚ۟ۜۛۖۘۚۘۛ۬۬ۜۘۥۛ۬ۜۥۦۘ";
                        break;
                    case 1002110209:
                        return;
                    case 1142379640:
                        j10.OooO0o().OooOOOO(new C3839eh(10004, this.OooO00o));
                        str2 = "ۙۖ۟۟ۛۥۘۤ۬ۗۗۦۡۡۘۛ۠ۢۖۘ۫ۢۙۡۡۘۚۙۤ۟ۦۡۘۥۘۢۚۙۥۘ";
                        break;
                    case 1502628692:
                        EditDeviceNameActivity.OooO0oo(this.OooO0O0).post(new RunnableC4696OooO00o(this));
                        str2 = "ۜۛۙۜۧ۟۟ۢۖۘۡۙۛۦ۬ۦۘۘۧۚۤ۬ۨۚۙۘۘۨۦۧۤۥۥۙۦۚۙ۬ۨۘۜۜۖۢۨۛۧۤۖۥۜۜۨۙۚۙ";
                        break;
                    case 1688439521:
                        str2 = "ۦۧ۟ۨۧۖۘ۫ۡۦۘۗۙۦۧۦۜۦۖۜۘ۠ۜ۫ۘۥۦۚۡۨۘۛۛۡۙۧۖۙۗۦۘ";
                        break;
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public final EditDeviceNameActivity OoooOoO;

        public OooO0O0(EditDeviceNameActivity editDeviceNameActivity) {
            this.OoooOoO = editDeviceNameActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۚ۫ۦۘۘۙۦۡۧۧۜۢۤ۬۟ۡۘ۟ۧۦۛۛۨۤۡۡۦۥۡۘۚۛۘۘۘۜۨ۠۫ۖۤۡۨۘۖۥۡۘۥ۟ۦۥۢۨۘ";
            while (true) {
                switch ((((str.hashCode() ^ 173) ^ 144) ^ 254) ^ 457998424) {
                    case -624829992:
                        C3753c5.OooO0o0(this.OoooOoO.getApplicationContext(), "脚本数据出错");
                        str = "ۢۖۥۘۥۧۦۘۢۜۥۘۘۖۗۗۤۖۘ۫ۚۖۘ۫ۜ۠ۤۗۙۧۛ۫۫ۗۢۦۛ۠ۙۤۡ";
                        break;
                    case 1457530604:
                        str = "ۨۦۢۗۗۥۘۚۤۡۗۧۚۙ۫ۖۘۢۥۜۘ۠ۘ۫ۙۤۤۥ۬ۥۘۜۙۦۖۚۗ۫ۧ";
                        break;
                    case 1643491753:
                        return;
                }
            }
        }
    }

    public class OooO0OO implements TitleView.OooO0O0 {
        public final EditDeviceNameActivity OooO00o;

        private OooO0OO(EditDeviceNameActivity editDeviceNameActivity) {
            this.OooO00o = editDeviceNameActivity;
        }

        public /* synthetic */ OooO0OO(EditDeviceNameActivity editDeviceNameActivity, OooO00o oooO00o) {
            this(editDeviceNameActivity);
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "ۢۦۨۘ۟ۦۥۘ۫ۨۥۘۛۦۦۖ۠۠ۨۘۘۚ۫ۦۙۖۦۖۛۤۡ۬ۖ";
            while (true) {
                switch ((((str.hashCode() ^ 339) ^ 69) ^ 50) ^ (-1851192429)) {
                    case 16146890:
                        str = "ۛۦۙ۫ۚ۬ۖۤۘۘۡۘۨۘۢۛۥ۫ۗۡۚۗ۫ۜۖ۫ۚۗ۫ۘ۬ۖ۬۬ۢۢۤۜۘ۫ۛ۠ۙۙۦۘۤۛۖۘۛۨۜ";
                        break;
                    case 255999655:
                        this.OooO00o.finish();
                        str = "ۧۤۢ۠ۚ۟ۢۗۙۖ۫۟ۙۗۘۧۜۢۤۦ۫۠ۧۡ۟ۗ۫ۥ۠ۘۘۦۦۡۘۙۡۖۘ۟ۙۙۡۦۡۗ۟ۦۡۨۛۖۥۡۘۥۘۜۘ";
                        break;
                    case 1493992760:
                        str = "۠۟۟ۗۚۙۙۛۡۘۜۦۛۘۨۖۘ۬ۙۗۧۖۘۨ۫ۡۧۛ۟ۤۢ۫ۧۧۥ۟ۨۤۢۨۘۘ۠ۚۨۘ۬ۡۖۘ۬۫ۗۚ۫ۦ۫ۡۚ";
                        break;
                    case 1548276858:
                        return;
                }
            }
        }
    }

    public class OooO0o implements TitleView.OooO0o {
        public final EditDeviceNameActivity OooO00o;

        private OooO0o(EditDeviceNameActivity editDeviceNameActivity) {
            this.OooO00o = editDeviceNameActivity;
        }

        public /* synthetic */ OooO0o(EditDeviceNameActivity editDeviceNameActivity, OooO00o oooO00o) {
            this(editDeviceNameActivity);
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0o
        public void OooO00o(View view) {
            String str = "ۧۦۡۘۜۘۦۗۙۢ۫۫۠ۢۥۖۢۡۘۘۡۚۖۘ۬۟ۘ۟ۜۖۥۚۖ";
            while (true) {
                switch ((((str.hashCode() ^ 483) ^ 187) ^ 803) ^ (-438182034)) {
                    case -303890997:
                        str = "ۤۤۢۜۗۧ۠ۗۥۘۤۨۖۘۗۤۙۘ۫ۖۘۜۦۥ۠ۥۡۘ۫ۧۛۡۗ۬ۡۛۡۖۛۖۘۚۢۛۥۙ۠ۨ۫ۘۘ۬ۚۨۘ";
                        break;
                    case -29840671:
                        str = "۠۟ۡۘ۫ۚۨۦۤۢ۠ۛۦۨۙۘۘ۬۟ۧۧ۟ۛۙۤۤۢۦۧ۫۬ۦۘۤۗ۫ۡ۬ۚ";
                        break;
                    case 968965780:
                        EditDeviceNameActivity.OooO0oO(this.OooO00o);
                        str = "۬ۗۗۜۖۖ۫۠ۜۘۧۖۦۘۖۙۦۘۥۗ۠ۖۛۥۘۥ۬ۖۘۡۚۦۧۡۖ۟ۥۦۘ۬ۥۡۘۤۦۛۡۚۘۘ";
                        break;
                    case 1065037430:
                        return;
                }
            }
        }
    }

    static {
        String str = "ۧۙۛۢ۫ۥۘ۬ۛۦۘۚۦۡۘۢۖۡۡۖ۬ۜۗۜۘۚۧۜۘۖۢۢ۬ۥۥۘۜ۫ۗ۬ۗۨۨۨ۫۫ۥۛۚۖ۠۬ۚ";
        while (true) {
            switch ((((str.hashCode() ^ 765) ^ 369) ^ 282) ^ 1591115504) {
                case -1667217698:
                    Oooooo = EditDeviceNameActivity.class.getSimpleName();
                    str = "ۛۧۨ۠ۧۗۡ۠۬۠۬ۨۘۤۙۤۖ۟ۗۥۘۘۡۥۘۧۥۖۘۤۜۙۚۦ۫۠ۙۖۘ";
                    break;
                case 632968762:
                    return;
            }
        }
    }

    public static void OooO(Context context) {
        String str = "ۚۦۙ۠۬ۥۘۧۜ۟ۢ۬۟ۜ۟ۜ۠ۘۥۤۢۦۜ۫ۦۛۜۖۘۙۙ۟ۦۦۚۚۘۥۘۤۗۙۢ۠ۗۛۥۜۘۤۡۙ";
        while (true) {
            switch ((((str.hashCode() ^ 780) ^ 404) ^ 79) ^ 175624144) {
                case -1846947911:
                    context.startActivity(new Intent(context, (Class<?>) EditDeviceNameActivity.class));
                    str = "ۤۨۦۥ۫ۡۚۡۦۡۘ۬ۥۘ۠۠ۙ۫ۛۖۚۛۦۡۘ۫ۦۥۨۧۘۘ۟ۨۤۚۙۦۘۖۚ۠";
                    break;
                case -1185280469:
                    return;
                case 895412893:
                    str = "ۤۘۚ۬ۜۦۦۛۘۘۙۗۦۘۗۦۖ۫ۧۡۢ۠ۥ۠ۗۚ۬۫۠ۡ۫ۜۘۖۤ۟ۚۗۜۘۨ۟ۧۖۜ۟ۤ۟ۡۧۙۛ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooO0oO(EditDeviceNameActivity editDeviceNameActivity) {
        String str = "۟۠ۨۙۙۚ۫ۢۘ۟ۜۖ۬ۡۘۤۗ۟ۜۛۢ۬ۛۛۨۙۛۚۛۜۘۡۡۦۘ۫ۤۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 420) ^ 864) ^ 364) ^ (-937805783)) {
                case -1762616604:
                    str = "۟ۨ۬ۨۘۗۤۥۦۘ۠۟ۢۤ۟ۦۨۨ۫ۨۜۡۥۚ۟ۘۘۘۥ۠ۡۚۢۢۡ۟ۗ";
                    break;
                case -734471657:
                    editDeviceNameActivity.OooOO0o();
                    str = "ۨۙۦۤۗۥۘۧۛۖ۟ۥۘۘ۟۫ۖۚۜۜۢ۠ۥۙۨ۫۠ۧۖۘۛۜۨۘ۠ۜۥۦۙۘۖۧۙۙۤۜ";
                    break;
                case 1185146032:
                    return;
            }
        }
    }

    public static /* synthetic */ TitleView OooO0oo(EditDeviceNameActivity editDeviceNameActivity) {
        String str = "ۙۗۗۖۡۥۗۡۨۘۦ۟۟۬ۚ۫ۜۤۡۡ۬ۡۘۢۚۘۖ۟ۥۘۧ۫۟۬ۖۖۘ۬ۨ۠ۡۘۢۗۚۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 342) ^ 587) ^ C4095le.o0000Ooo) ^ 2007299839) {
                case -235386842:
                    return editDeviceNameActivity.OooooO0;
                case 24974039:
                    str = "ۙۥ۠ۢۙ۫۠ۥۧۗۦۤۙۥۨۦۘۚ۟ۙۤۖ۠ۙۘۦۖۥۛۦۖۥۦۛۥۗۦ۬ۚ۬ۛ";
                    break;
            }
        }
    }

    public static void OooOO0(Context context, String str) {
        Intent intent = null;
        String str2 = "ۜ۬ۨۚۖۦۘ۠۫ۥۥۜ۠ۦ۠۟۠ۧۡۘ۫ۚۘۘۢۖۥۘۡۡۦۤۥۨۘ";
        while (true) {
            switch ((((str2.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_SIZE_VALUE) ^ 600) ^ 504) ^ 1834433777) {
                case -1718154777:
                    intent = new Intent(context, (Class<?>) EditDeviceNameActivity.class);
                    str2 = "ۥۨۡۘ۬ۗۦ۠ۗۦۘۜ۠ۡۘۙ۬۫ۡۢۗۙۥۥۖۨ۠ۙۤۘۘۦۥۧۘۤ۟ۢ";
                    break;
                case -1683024827:
                    str2 = "ۘۚۢ۫۟ۜۡۨۨ۫ۗۨۥۨ۫ۧۡۚۧۘۘ۠۟ۦ۟ۖۚ۠ۜۥ";
                    break;
                case -1576421253:
                    context.startActivity(intent);
                    str2 = "۟ۥۨۘۤ۬ۨۧۚۥۘۥ۫ۖۘۘۗ۠ۦۦۡۘۙ۫ۚۧۛۥۘۧۢۥۧۗۜۘ۠ۧۦۡۖۖۘۛ۟ۡۘ۟۟ۦۘ۫ۤۨۘۨۧۗۙۨ۠۫ۨۢ";
                    break;
                case -974518303:
                    return;
                case -966979214:
                    intent.addFlags(268435456);
                    str2 = "ۘۙ۬ۤۚۙۘۡۘ۬ۦ۬ۗۢۤۘۢ۫ۛۜۢ۠۬ۦۘۙ۟ۡۧۨۚ۫ۘۥۘۥۙ۫ۢۖۧۛۧ۟۫ۡۚۜۛۡۘ";
                    break;
                case -135090155:
                    str2 = "ۨۖۥۛۢۨۙۛۥۘۨۖۚۨۜۢۘۥۧۘۙ۫ۜۘۚ۟۟ۨۛۥۦۗۖۗۢۘۢۚ۬ۥۗۙۗۧۛۗۙ۟۬ۡۖۘ۠ۖۢۡۗۜ";
                    break;
                case 16721970:
                    intent.putExtra("device_name", str);
                    str2 = "ۚۙۘۘۘۛۙۙۧۡۘۧۥۥۘۧۜۜۜۛ۠ۗۛۨۡ۬ۙۦۖۨۗ۟ۥۛۛۘۥۘۛ۟ۨۡۦۨ";
                    break;
            }
        }
    }

    private void OooOO0O() {
        OooO00o oooO00o = null;
        String str = "۟ۢۖۘ۟ۖۜۢ۟ۘۘۦۦۜۘۢ۫۟ۤۡۢ۠ۤۨۘ۫۠ۦۜۙ۟ۗۡۜ۬ۤۘۛۘۙ";
        while (true) {
            switch ((((str.hashCode() ^ 924) ^ 427) ^ 68) ^ 1449381065) {
                case -1113386135:
                    this.OooooO0.setTitleText(R.string.edit_device_name_title);
                    str = "۫ۡۧۗۚۥۘۘۧۡۘۥ۟ۨۘۨۘۙۥۤۥۘۡۙۦۜ۟ۨۘۢۙۖۢۜۚۥۜ۬۠ۥ۫ۦۙۡ۠ۙۖ۫ۗۡۗۜۘ";
                    break;
                case -531518101:
                    return;
                case -323347930:
                    this.OooooO0.setVisibilityRightImage(4);
                    str = "ۖۚۧۙ۠ۥ۠ۥ۟ۖۡۜ۫ۧۛ۫ۨۘۧۗۘۘۡۚۙۙ۬۫۫ۢۥۡ۬ۜۛۨۜ۠۫ۜۘۢ۟۠۠ۨۘۡۨۘۘ";
                    break;
                case 1258714320:
                    this.OooooO0.setOnRightTextViewListener(new OooO0o(this, oooO00o));
                    str = "ۖۦۧۘۗۖۨۘۙ۠۟ۤۥۘۤ۠۠ۜۚۡۘ۠۫ۘۘۢ۫۬ۛۗۥۘۘۡۢ";
                    break;
                case 1485759032:
                    this.OooooO0.setleftImage(R.drawable.ic_back);
                    str = "ۥ۬۬ۡۨۥ۠ۛ۠ۖ۟۟ۜۨۖۛۜۘۦۛۡۘۥۜۖۘۗۢۨۚۛۚۦۜۜۘۥۛۘ";
                    break;
                case 1618734907:
                    str = "ۙۨۦۘۤۗ۬ۜۗ۫ۥ۬ۨۤۢۖۘۘۡۤۦۨۚۛۡۖۜۛۥۙۦۜ";
                    break;
                case 1853837958:
                    this.OooooO0.setVisibilityLeftImage(0);
                    str = "ۦ۠۠ۦۘۜ۫ۦۗ۬۬ۖۘۧۡۤۗۧ۠۫ۚۚۚۗ۟۫۬ۨۘۥۙ۠ۘۥ۫ۘ۠";
                    break;
                case 1872831618:
                    this.OooooO0.setOnLeftImageViewListener(new OooO0OO(this, oooO00o));
                    str = "ۗ۫ۨۖۚۥۦۨۘۦ۬ۢۧۡ۫ۥۛۘۗۨۤۤۗۜۘۜۨۦۨۘۚۚۗۘ۟ۛۚۤۨۛۜۚۖۘۙۨ۟ۙۧۢ";
                    break;
            }
        }
    }

    private void OooOO0o() {
        String str = "ۢۘۧۘۘۗۢ۬ۜ۟ۛۜۡۘۨۙۗۧۡ۬ۥۡۘۧۡۜ۠ۤۘۘۢۥۥۘ۟ۗۗۦۚۘۖۦۨۘۢۤۖۘۨۧۦۘۨۜۡۘۧۡۘۥۖۦ";
        Script scriptOooO0oO = null;
        String string = null;
        while (true) {
            switch ((((str.hashCode() ^ 681) ^ 233) ^ UiMessage.CommandToUi.Command_Type.GET_TITLE_TEXT_VALUE) ^ (-1853601872)) {
                case -1407970109:
                    return;
                case -1233307154:
                    str = "ۗ۫ۨۡۢۢۘۥۛ۬ۢۛۨۗ۬ۤۦۦ۠ۚۧۗ۠ۤۥۦۧ۠۠ۡۤۚۚۖۜۘ۫۬ۡۘۨۦۘ";
                    break;
                case -1119826136:
                    C3678a4.Oooo00o(this, string);
                    str = "ۧۨۖۘۚ۬ۚۖۦۚ۫ۗۚ۠ۨۙ۫ۡۘۙۖ۬ۡۙۡۖۡۚۗۗۗ";
                    break;
                case -828638694:
                    C4241pc.OooO0o().OooOO0(this, scriptOooO0oO.getId(), string, new OooO00o(this, string));
                    str = "ۛۘۚ۫۠ۘۘۢۘۖۘ۠ۗ۬ۘ۬ۗۖۢۨۢۘۗۥۛۜۘ۠۠۟۫ۧۜۘۖ۫۠ۡۙۜۘۤ۫ۖۤۙ";
                    break;
                case -391032240:
                    str = "ۥ۫ۜۘۗۢۦۘۨۥۦۤ۫ۜۘ۫۠ۖۤۗۘ۫ۧ۬ۧۚۘۘۥۖۜۘۦۥۚۨۥ۬۫ۧۨۘ۠ۖ۬ۤۡۥۘۤۖۙۖ";
                    break;
                case -345422538:
                    this.OooooO0.post(new OooO0O0(this));
                    str = "ۗ۫ۨۡۢۢۘۥۛ۬ۢۛۨۗ۬ۤۦۦ۠ۚۧۗ۠ۤۥۦۧ۠۠ۡۤۚۚۖۜۘ۫۬ۡۘۨۦۘ";
                    break;
                case 1006173217:
                    String str2 = "۟ۨۧۘۙۜۥۘ۠ۨۜۘۥۚۜۚۗۡۘۨۧۛۢۥۦ۟ۤۨۘۖۛ۬ۨ۬ۜۙۧۦۘۡۜۢۛۨۘۛۜۙ";
                    while (true) {
                        switch (str2.hashCode() ^ (-37690918)) {
                            case -914480006:
                                String str3 = "ۤۢۡۚۤۤ۟ۤۛۖۜۜۡۥۡۘۥۙۜۧۡۢۥۦۛ۟ۛۥۘ۫ۤ۠ۖۘ۬۬ۦۗ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1161586482) {
                                        case -1632929155:
                                            str2 = "ۚ۫ۙۤۛۥۘۚۥۘۜۦۘۘ۬۠ۦ۟ۖۦۧۢۜۤۨۘۨۥ۬ۛۡۤۢ۠۠ۘۥۥۥۜۦۖۧۘۙۤۨۙ۟ۖۘ";
                                            break;
                                        case -1285928542:
                                            str3 = "ۢ۫ۖۙۥۙۡۜۧۛۚ۟۟ۖۦ۟ۧۖۘۛۚۢۥۡۥۡۥۗۦ۫ۖۘ";
                                            break;
                                        case -763455102:
                                            str2 = "ۥ۬۟ۜ۫ۧ۠ۡۢۥ۫۠۠۬ۨۦ۟ۢۘۛ۫ۙۖ۟ۤۤۘۧۜۦۚۦۘ۠ۗ۫ۢۚ۠ۜۦ";
                                            break;
                                        case 1279672241:
                                            str3 = scriptOooO0oO != null ? "۬ۡۜۘۢۖۛۖۖۨۘۖۨۘۛۛۚۛۡۜۘۘ۬ۦۘ۫ۡۘۛۗۖۘ۬ۗۙ" : "ۡۘۙۢۖ۫ۥۤۖۡۗ۫ۢ۬۬ۡۘۡۛۨۘۢۡۗۜۗۙۘۨۧۘۙۘۧۢۨ۫ۡ۬۠ۘۨ۫ۙ۠ۖۘۙۗ۟ۗ۠ۡۖ۬ۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case -663098901:
                                str = "ۜۨۢۙۧۜۘۦۗۥۘۚۚۜۢۤۢ۬ۤ۟ۚ۬۬۠ۡۧۜۖۤۖۧۜۜ۬ۤۛۖۘ";
                                continue;
                            case 466825138:
                                str = "ۚۧۦۘ۠ۤۚ۬ۙۥۜۥۢۘۖۦۘۗۥ۠ۗ۬ۘۘۖۘۧۡۖۗۦۘۧ";
                                continue;
                            case 1885976169:
                                str2 = "ۤۙۛۖ۠ۙ۬۠۫ۦۘۥۛۦ۫ۜۨۚۙ۬ۨۘ۫۟ۗ۬ۦ۫ۡۦۧ۠ۧۧۜۡۜۘ۟ۜۦۘۨۨۨۘۤۜۜۥۨۢۧۧۘۘۧۧۥ";
                                break;
                        }
                    }
                    break;
                case 1155282997:
                    str = "۠ۘۗ۫ۚۚۡۙۥۘۜۖۙۦ۫ۙۜۦۜ۬۬ۤۚ۬۫ۛۧۤۡۚۛۡۜۙۧۧۤ";
                    string = this.OooooOO.getText().toString();
                    break;
                case 2043814495:
                    scriptOooO0oO = C3718b7.OooO0Oo().OooO0oO();
                    str = "ۚۖۧ۠ۦۘۘۥۨۧۘۛ۟ۡۘۚۢۜۘۢۢۘۘۛۗ۠۬ۧ۟ۖۢۜۘۖۚۘ۟ۙۤۢۨۘۘۤ۠ۦۚۡ۫";
                    break;
            }
        }
    }

    private void initData() {
        String stringExtra = null;
        String str = "ۚۚۤۤۛۦۚۤ۬ۚ۠ۡ۫ۧۨۘۦۤۤۧۨۤۖۢۛۨۜۖۙ۠۫ۤۤۡۨۥۥۙۢۖۘ۫ۖۡۗۜۡۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 235) ^ 373) ^ 680) ^ 977547472) {
                case -2025635471:
                    this.OooooO0.setVisibilityTvRight(0);
                    str = "۠ۦۨۘۘۧۙۡۨۧۗۜۗۛۤۦۜ۫ۥۘ۠ۛۙۘۦۡۘۥۢۦۜۛۨۘۙۛ۠ۜۘۜۘۚۧ۠ۧۖۖ";
                    break;
                case -819085692:
                    String str2 = "ۦۤۢۨۖۨۘۖۧۘۜۜ۟۬۫ۦۖۥۡۘ۫۫ۖۡۛۧ۬ۦۥۘ۫ۜۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-709921165)) {
                            case -2027307178:
                                str = "ۖۦۙۜۥۘۚۤۙۢۜۧۘ۬ۖۛۦۙۙۤ۠ۨۘۘ۬ۗۜ۬ۡۤۧ";
                                continue;
                            case -432538504:
                                str2 = "۟ۥۨۗۙۨ۬۠۫۠۠ۙ۠ۚۗ۠۫ۡۘۡۨۘۘۘۛۛ۬۬ۨۘۢۦۖ۠ۦۗۛۤ۠ۡۧ۟ۢۛۨۘۜ۫ۚۡۢۖ";
                                break;
                            case -235175113:
                                String str3 = "۠ۜ۠ۤۦۥۘۨۚ۫ۥ۬ۖۘۨۡۨۘۜ۬ۜۘۜۢۜۗۙ۫ۨۜ۬۬ۡۧۖۙۦۗ۬ۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-2079087189)) {
                                        case -1875559911:
                                            str2 = "ۚ۫ۨۤ۫۠ۛۡۚ۟۬ۜۘۙۘ۫۟ۜۘۦ۫ۚۗۥۙۢۢۖۜۙ۬ۙ۟ۥ۟ۗۡۘۖۦۥۢۨۤۜۧۘۛۚۙ";
                                            break;
                                        case -616698592:
                                            str3 = "ۤۡۧۚۨۥۜۛۙۤ۠۬ۘۙۧ۫ۦۙۗۙۥۘۤۡۗ۟۫ۨۙۙۨ۠ۖۡ۠ۥ۬";
                                            break;
                                        case -207665900:
                                            str2 = "ۜۚۦۚ۫ۧۦۨۜۚ۠۬ۧۨۖۘۡۥۢۜۖۨۘ۬۠ۛ۫۫ۘۢۖۡۘۥۨ۫ۤۢۤۢ۬ۦۘ۫ۛۘۢۡۖۘۢ۟";
                                            break;
                                        case 192882048:
                                            str3 = !TextUtils.isEmpty(stringExtra) ? "۠۬۫ۥۚۧۦۘ۫ۧۛۗۥۛۡۗ۫ۥ۟ۜۘۨ۫ۖۘۜۛۜۘۢ۫ۚۘۗۜ۬۟ۢ" : "ۘ۠ۙۖۘۘ۠ۖۖۘۧۜۥۘ۠ۜۘۘۤ۟۬ۦۡۚۥۥۦۜۙ۫۠ۗۤۤۡۥۚۖۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case 362381583:
                                str = "ۖۚۡ۠۫ۥۘۙۘ۫۫۬ۡۘ۫ۧۘۘۤۦۦۘ۬ۛۦۘۙۤۗۨۛ۬۠ۗۧ۫ۦۡۚۖۘ";
                                continue;
                        }
                    }
                    break;
                case -304351936:
                    return;
                case 204295418:
                    str = "ۛۤۡۚۦ۟ۧۨۛۡۘۗۖۙۡۚ۠ۚۡۨۖ۫ۜۘۧۨۨۘ۬ۦۥۘ۠ۢۙۦۜۗۚۢۧ۫ۨۘۘۢۢ۬ۧ۟";
                    break;
                case 265355065:
                    this.OooooO0.setRightTvText(R.string.save);
                    str = "ۗۙ۟۟ۘۜۘۧۖۧۘۜۦۖۘ۬ۢ۠ۘۧۥۘۘۧۘۙۨۥ۫ۛۡۘۧۦۗۚۙ۟ۥۡۥۘۨۨۤۧ۬ۘ۟ۢۡۘۛ۠ۨۘ";
                    break;
                case 353702329:
                    this.OooooOO.setText(stringExtra);
                    str = "ۧ۫ۛۙۙۙۛۘۨۘۗۜۚۨۗ۫ۧۜۥۚۙ۬ۧ۠۫ۡۘ۬ۧۡۘۘۡۢ۠ۖ۠ۨۧۘۖۢۨۨ";
                    break;
                case 511911530:
                    this.OooooOO.setSelection(stringExtra.length());
                    str = "ۖۦۙۜۥۘۚۤۙۢۜۧۘ۬ۖۛۦۙۙۤ۠ۨۘۘ۬ۗۜ۬ۡۤۧ";
                    break;
                case 1724070010:
                    stringExtra = getIntent().getStringExtra("device_name");
                    str = "ۖۨۨۗۚۧ۫ۚۖۘ۫۠ۘ۫ۚۛۚۤۜۙۦۘۙۛۙۨۚۦۘۘۡ۬ۖۡۥۘۢۗۛۤۗۘۘۢۦۗ۠ۡۦۜۨ۫ۛۚۚ۠ۢ";
                    break;
            }
        }
    }

    private void initListener() {
        String str = "ۚۗۢ۬۟ۡۜ۫ۦۘۨۙۗۙۤۖۦۗۛۨۦۛ۠ۥۡۘ۠ۥۙۢۘۢ";
        while (true) {
            switch ((((str.hashCode() ^ 290) ^ 696) ^ 112) ^ 722677103) {
                case -191954161:
                    this.Oooooo0.setOnClickListener(this);
                    str = "۫۬ۥۘۢۨۧۦ۠ۥۦۨۡۛۧۧۙۨۥۘ۟ۨ۫۫ۚۜۘۤۚۛۜۚۥ۠ۢۛ۟ۜ";
                    break;
                case -23265754:
                    return;
                case 1374069331:
                    str = "ۧ۫ۖۘ۫ۢۨ۠ۖۘ۠ۜۛۛۢۘۘۧۡۦۜ۬ۨۘۚۛ۬ۛۡۘۢۨۘۘ";
                    break;
            }
        }
    }

    private void initView() {
        TitleView titleView = null;
        String str = "ۥ۬ۦ۠ۘۛۚ۟ۨۘۤ۠ۡۘۧۙۤ۫ۙۙۗ۫ۦۖۖۡۘ۬ۚۛۗۡۖۖ۫ۜۘۖ۟ۚ۬ۥۘۥۛۖۘۤۘۖۘۘۚۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 865) ^ 730) ^ 67) ^ (-23775547)) {
                case -1442335268:
                    titleView.setVisibilityTvRight(0);
                    str = "ۛۗۛ۫ۥۗۚۢ۠ۥۜۜۘۢ۬ۦۘۜۢ۫ۦۨۛۧۙۘۘۥۥۘۘ۟ۦۗ";
                    break;
                case -1165481592:
                    return;
                case -1066648631:
                    str = "ۨ۫ۗۗۘۜۜۧۥۖۖ۬ۛۘۗۙ۟ۡۘۡۙۢۤۦۛۘۦۙۛ۫ۢۘۖۖ۟ۖ۟";
                    break;
                case -493350291:
                    this.Oooooo0 = (ImageView) findViewById(R.id.iv_clear);
                    str = "ۥ۠ۧۦۡ۠ۘۥۨۚۥۨۘۘ۟ۦۘۢ۫ۜۘۦ۟ۦۤۙۜ۠ۦۙۡ۠ۥۘۙۥۦۛۙ۫ۥۤۗۥۥ";
                    break;
                case 373720776:
                    this.OooooO0 = titleView;
                    str = "ۛۧۡ۬ۙۘۙۦۖۖۦۘ۬ۗۙۘۖۚۤۨ۠ۡ۬ۡ۟۠ۤ۠ۡۙ۠ۜۘۡۨۨۘ";
                    break;
                case 432084537:
                    str = "ۧ۬۠ۛۘۡۘۦۚ۬ۛۦۘۨۘ۟ۨ۬ۡۘۧۦ۫ۥۜۚۛ۫۬ۛۨۙۚۨۡۤۡۡۙۛۙۙۦۛ";
                    titleView = (TitleView) findViewById(R.id.titleView);
                    break;
                case 1385711708:
                    this.OooooOO = (EditText) findViewById(R.id.et_device_name);
                    str = "ۖ۠ۡۢۥۧۧ۠ۥۦۥۗ۫ۡۦۖ۫ۘۘ۠ۘۜ۫ۡۦ۟ۗۘۘۙۤۡۘۚۥۦ۟۫ۥ";
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = "ۧۦۥۘۧۗۙۦۥۘ۟۟ۗۘۤۡۘۨۜ۠ۤ۬ۘ۬ۙۥۘۗۚۦۘۧۡۘۘ۫ۗۤۛۡۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 639) ^ 63) ^ 94) ^ (-1918117511)) {
                case -1581001026:
                    String str2 = "۟ۜۢۢ۬ۡۚ۬ۦۗۦۜۘۦۦۗ۠ۗۘ۠ۙۤۦۨۙ۠ۗۖۘۧۧۥۨ۠ۡۗ";
                    while (true) {
                        switch (str2.hashCode() ^ 1189656355) {
                            case -337849693:
                                str2 = "ۢ۫ۧۤ۠ۡۘۙۥۘۘۚۗۤۥۧۦۗۨۜۥۧۢۚۖۗۤ۬ۥۢۤۡۘ";
                                break;
                            case -67706476:
                                String str3 = "۫۟ۢۛ۠۟۟ۤۘۘۢۚۗۡ۠ۗۗۚۨۘۤ۫ۢۜۧۗۜۢۖۘ۫۠ۜۘۥۛۢۢۚۚۨۤۨۘۖۤۗۦۙۚ۠ۦ۟ۚۗ۠ۧۚ";
                                while (true) {
                                    switch (str3.hashCode() ^ 591408739) {
                                        case -1374298619:
                                            str3 = "ۗۨۡۘۜۨۜۘۧۤۖ۬ۙ۟ۜ۟ۜۡۨۜۘ۫ۨ۬ۦۘۢۜ۫ۙۤۨۘۙ۬ۖۤۜۦۘۢۧۦۘۚ۬ۢۦۡ۟ۚۢ۫";
                                            break;
                                        case -400056787:
                                            str2 = "ۗۡۛۦۜۙ۬ۢۦۘ۟ۘۦ۟ۦۘۢ۬ۤۖۦ۫ۗۛۨۢۛ۟۬ۦۜۘ";
                                            break;
                                        case 713374055:
                                            str3 = view.getId() != R.id.iv_clear ? "ۧۢ۠ۡۘ۟ۙۢۗۖۧۦۗۥۧۘۖۚۘۘۨ۫ۦۖۖۧ۬۬ۨۧۗۦۘ۠۠۫ۤ۬۠ۥۤۛ۟ۧۦۘ۠ۢۦۘ۟ۚۦۜۖۛۗۖ۟" : "۠۠ۙۢۘۢۨ۟ۨۘ۬ۚۖ۫۟ۖ۠ۚۛ۟ۢ۠ۙۦ۬ۗۦۘۢۡۡۘۜۖۖ۟ۡۜ";
                                            break;
                                        case 1475870986:
                                            str2 = "ۚ۠ۖۥۛۖ۟ۘۨۘۛۤۙۜۡ۫ۜۨ۬ۡۥ۫ۜۥۜۘۗۛۡۘۥۙۙۛۘۙۤۨۗۚۜۜۧۤ۠ۦۜۘۘۡۤۗۥۖۙۗۤۦ";
                                            break;
                                    }
                                }
                                break;
                            case 279943049:
                                str = "ۢۚۧۥ۬۫ۨۙۛۖۙۗۨۚ۬ۘۗۤ۬ۤۦۗۢۢۧ۬ۛ۬ۖۨۦۘۘۖۜۘۢۡۢ۬ۡۚۢۜۘۤۦ۬";
                                continue;
                            case 1827851412:
                                str = "ۦۦۨۘ۠ۚۖۘۢۛۚۤ۠ۨۘۤۚۗۢ۫ۦۘۜ۫ۖۘۘۦۦۘۨۦۦۘۘۡۦۨۥۢۨۨۡ۬ۗ۫ۚۦ";
                                continue;
                        }
                    }
                    break;
                case -974942572:
                    str = "ۘۚ۟ۗۛۦۤۖۧۘۢۧۖۘۙۦ۠ۦ۬۟ۡۛۜۖۡۖۘۢۗۥۗۘۥۘۜۧۗۚ۫ۖۘ";
                    break;
                case -417041897:
                    return;
                case 1065091090:
                    str = "۫ۘۘۘۨۘۥۘۡۥۘۘۥۧۙ۠ۘۜ۬ۢۥ۠ۧۚۚۦۗۚۤ۟ۜۖ۟ۖ۠ۘۘ۫ۙۗۥ۬ۜۘ۬ۧۦۘ";
                    break;
                case 1090846738:
                    str = "ۦۡۨۜۛۚۙۖۘۘۥۙ۟ۖۜۡۦۜۨۘۢۡۗۤۢۜۙۚۢۤۛۡ";
                    break;
                case 1964393896:
                    this.OooooOO.setText("");
                    str = "ۦۡۨۜۛۚۙۖۘۘۥۙ۟ۖۜۡۦۜۨۘۢۡۗۤۢۜۙۚۢۤۛۡ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "۟۬۫ۛ۬ۘۛۖۙ۠۟ۨۘۡۦۦۘۗۖۢۚ۫ۜۜۘۡ۬۫ۥۢۨۤۢۖۢۚۙۦۖۥۘۙۗ۫";
        while (true) {
            switch ((((str.hashCode() ^ 300) ^ 340) ^ 221) ^ 1321584144) {
                case -1856508205:
                    return;
                case -522677420:
                    OooOO0O();
                    str = "ۖ۫ۦۢۘۥ۬ۨۧ۟ۗۖۘۥ۠ۥۖۡۖۘۛۥۧۡۧ۫ۤ۠ۘۛۥۦۡ۫ۖۙۛ۠ۤۘ۬۬ۨۘ۫ۡۨۘ۟۫ۖۖۤۛۙۢۡۘ";
                    break;
                case -407220449:
                    initView();
                    str = "ۥۚۘۘ۟ۛۗۚۥۦۘۖۢۡۘ۫ۢ۬ۡۚۦۚۨۨۘۗۙۜۘ۠ۛۛ۫ۤۛ۠ۤۙۜۤۢ";
                    break;
                case 409779877:
                    super.onCreate(bundle);
                    str = "ۥ۬ۘۘۦۡ۬ۨۖۡۘۛۢۘۘۛۨۦۜۖۛۚ۫ۦۘۘ۫ۢۥۥۘۘۘۦۢ";
                    break;
                case 554583095:
                    str = "۟ۦۗۘۤۜۘۦۥۜۘۜۤۢ۫ۢۨۢۜۗۤۜۦۘ۠ۘۢۥۖۘۘ۠ۛۡۘ";
                    break;
                case 579500147:
                    setContentView(R.layout.activity_edit_device_name);
                    str = "۠ۦۨ۟ۚ۬ۚۙۡ۫ۨ۠ۨ۠ۜۘۘۤۡۘۘۛۢۛ۬ۗ۬ۛۜۧۜۨۛۢۨۘ۠ۖ۫ۧ۫ۙۦۥ";
                    break;
                case 1037655709:
                    initListener();
                    str = "ۨۤۜۘۙۢۡۘ۬ۗ۠ۢ۠۠۠ۨ۟۠ۖۡۡۘۡۤۨۘۤۨۡۦ۟ۜۙۛۤۥۨۢ";
                    break;
                case 1313358338:
                    str = "۫ۥ۫ۚۗۚۖۡۡۘۥۦۢۜۦۦۘ۬ۘۜۗۨۚۗۛۙ۟ۚۚۢۡ۫۠۫ۘۧۡۛ۬۬ۤ۠۠۫۟۟ۢۥۚ";
                    break;
                case 1544365154:
                    initData();
                    str = "۠ۥۖۘ۟ۚۡۢۛۗ۠ۦۖۧۦۙۡۡۘۜۘۥۘۗۗۘۘۘۗۨۙ۫ۥۚ۟ۥۤۢۗۡۨۦۘۛۙۥۘۗۛۨۤۨۥ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۦۖۡۘ۫ۢۙ۠ۖۘ۫ۜ۫ۡۖۧۘۙۛۛۥ۠ۦۦۘۚۖۦۘۙ۠ۘۗۚ۟۬ۛۨۘۖ۟ۘ۟ۧۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 545) ^ 239) ^ 93) ^ 1015632414) {
                case -1684761095:
                    str = "۟ۦۙ۫ۤۢۛۘۦۖۙ۬ۡۗۥ۠ۥۘۨ۬ۥۙ۠ۘۡۡۖۘۘۜ۠۬ۗۚۥۢۗۙۘۥۦۤۖۘۦۢۙ";
                    break;
                case -882088717:
                    return;
                case 1653182737:
                    this.OooooOo = null;
                    str = "ۘۢۥۛۘۢۛۛۦ۫ۙۥۘۡۧۚۙ۟ۧ۫ۛۖۡۗ۫۟۟ۜۘۤۧۚۦ۠ۢۗۥۘۘۥۡۤۢۥۥۘۜ۫ۜۗۛۧۡۜۥۜ۟۫";
                    break;
                case 1819214530:
                    this.OooooOo.removeCallbacksAndMessages(null);
                    str = "ۥۦۨۙۛۡۘۖۨۦۨۛۤۚۙۢۙۘۨۥۚۤۤۧۜۖۢۖۗۛۡ۬۫ۜ۫ۗ۟ۚۗۚۙۜۦۘ";
                    break;
                case 1823969500:
                    super.onDestroy();
                    str = "ۜۤۙ۠۬۫۫ۜۨۘۥۤۗ۫ۤۡۘۚۙۥۘ۬ۜۘۘۙ۬ۡۤۘۜۥۤۦۧۡ۠۬ۡۚۙۛۛۤۤۘ۠ۜۡۡۘۛ";
                    break;
            }
        }
    }
}
