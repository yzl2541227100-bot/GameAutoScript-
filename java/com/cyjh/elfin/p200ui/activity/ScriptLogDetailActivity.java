package com.cyjh.elfin.p200ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.elfin.entity.ScriptLog;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executors;
import p285z2.C3691ah;
import p285z2.C4048k4;
import p285z2.C4589yr;
import p285z2.InterfaceC3865f6;

/* JADX INFO: loaded from: classes.dex */
public class ScriptLogDetailActivity extends BaseActivity implements View.OnClickListener {
    private TitleView OooooO0;
    private TextView OooooOO;
    private Button OooooOo;
    private boolean Oooooo;
    private ScriptLog Oooooo0;

    public class OooO0O0 implements TitleView.OooO0O0 {
        public final ScriptLogDetailActivity OooO00o;

        private OooO0O0(ScriptLogDetailActivity scriptLogDetailActivity) {
            this.OooO00o = scriptLogDetailActivity;
        }

        public /* synthetic */ OooO0O0(ScriptLogDetailActivity scriptLogDetailActivity, OooO00o oooO00o) {
            this(scriptLogDetailActivity);
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "ۘۢۦۘۖۥ۫ۜۦۜۘ۠ۚۡۘۜ۟ۘ۫ۦۖۘۤۗۨۨۡۗۛۙۥۧۗۖۥ۬ۦۙۢۘ۬ۚۙۡۖۨۘ۫ۜۧۘۢۥۨۘ";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_WEB_VIEW_VALUE) ^ 395) ^ UiMessage.CommandToUi.Command_Type.SET_FW_IMAGE_VIEW_VALUE) ^ (-2124891991)) {
                    case -1952793608:
                        str = "ۡ۟ۢۡۧۛۦ۟ۘۢۢۖ۟۠ۥۘۗۦۧۘ۟۟ۜ۫ۘۥۘ۠ۘۡۘۖۛۜۘ۫ۤۡۘ۠ۘۦۘ";
                        break;
                    case -1150979712:
                        str = "ۘۘۘۘۛۦۦۘۤۨۚ۬ۡ۬ۙۘۜۘۛۤۦۥۛۡۘۗۤۜۘۜۘ۟ۦۜۜ";
                        break;
                    case 913865748:
                        return;
                    case 2070335319:
                        this.OooO00o.finish();
                        str = "ۘۘۦۥۗۘۤۤ۬ۢ۬ۡۜ۫ۥۤۙۧۖۦۧۦۗۦۤ۟ۖۘۘۨۦۘۤۡۜۜ۟۠۬ۧۦۘۗۥۖۤۛۚۖۚ۬";
                        break;
                }
            }
        }
    }

    public class OooO0OO extends AsyncTask<File, Integer, String> {
        public final ScriptLogDetailActivity OooO00o;

        private OooO0OO(ScriptLogDetailActivity scriptLogDetailActivity) {
            this.OooO00o = scriptLogDetailActivity;
        }

        public /* synthetic */ OooO0OO(ScriptLogDetailActivity scriptLogDetailActivity, OooO00o oooO00o) {
            this(scriptLogDetailActivity);
        }

        public String OooO00o(File... fileArr) {
            try {
                return C4048k4.OooOOO0(ScriptLogDetailActivity.OooO0oo(this.OooO00o).getFile(), 0, null);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        public void OooO0O0(String str) {
            String str2 = "ۛۗۤ۠ۙۦۛۦ۬۠ۧۜۘۚۛۤۛ۬ۥۘۛ۫ۡۘۗ۟ۤ۬ۨ۠ۗۖۢ۫ۧۧۡۨۦۘۖۖۘۡۘۦۧۛۦۛۖۖۙۤۧۛۧۦۘ";
            while (true) {
                switch ((((str2.hashCode() ^ 202) ^ 995) ^ 53) ^ (-1853524825)) {
                    case -1497656837:
                        ScriptLogDetailActivity.OooOO0(this.OooO00o);
                        str2 = "۫ۢ۠ۗۗۦۘۤۚۜۘ۬ۘۛ۟ۡۡۡ۟ۘۘ۫۠ۚۥۧ۬ۥۢۖۚۨۚۥۘ۠ۨۜ۫";
                        break;
                    case -1205438119:
                        str2 = "۫ۘۡۗۡۨۘ۠ۡۘۘۨۗۨۘۦۢۨ۬۠ۛۢۜۙ۬۟۫ۛۘۨ۬ۥۤۦۜۘ۬ۤۡ۠۫ۤۖۥۘ";
                        break;
                    case -1085451803:
                        ScriptLogDetailActivity.OooO(this.OooO00o).setText(str);
                        str2 = "۫ۘۥۤۡۤ۫۟ۗۖ۠ۨۘۥۜۜۘ۫۫ۙۧ۟ۢ۫ۖۦۘۘۖۥۘۥ۠ۛ";
                        break;
                    case 421369848:
                        super.onPostExecute(str);
                        str2 = "ۧۗۢۘۛۜ۟ۜ۠ۘۗ۟ۨۥۗۦۖۘۦ۫ۖۙۚۦۘۗۧۚۗۥۖۙۤۥ۟ۡۧۘۗ۠۟ۦ۫";
                        break;
                    case 999990434:
                        str2 = "ۗ۫ۦۘ۫ۢۖۘ۠ۖۗۧۡۡ۟ۜۧۘۤ۟ۥۢۧۤۗۤۜ۬ۨۜۘۜۨۗۡۤۙ۟ۗۥ";
                        break;
                    case 1517046598:
                        return;
                }
            }
        }

        public void OooO0OO(Integer... numArr) {
            String str = "ۜۙۘۨۡ۬ۧۗۨ۫ۖۚۦۦۘۧۤۖۘۤۡۜۥۧۗ۫ۨۚۥۧ۟ۡۥۤۦۚۥ";
            while (true) {
                switch ((((str.hashCode() ^ 841) ^ 830) ^ 85) ^ (-1372401675)) {
                    case -1085664508:
                        str = "ۧۥۖۘۖۛۖۘۘۛۥۜ۬ۦۘۡۚۤۙۘۥ۫۟ۥۨ۫ۙۧۛۡۨۧۘۨۦۢۡۜۚ";
                        break;
                    case -994876647:
                        return;
                    case 126000307:
                        super.onProgressUpdate(numArr);
                        str = "ۗ۫۠ۜۧۦۚ۫ۦۤۢۧ۠ۡۙ۬ۛۘۘۗۧ۟ۘۚۧۘ۫ۖۚۧۖۖۙۤۛۨۜ";
                        break;
                    case 1146010520:
                        str = "ۘۧ۠۠۟ۦۧۗ۫ۖۢۚۡ۫ۙۗۚۦۘۢۚۚۢۡ۠ۤۥ۫ۛ۠ۨۘۖ۬ۧۡ۠ۛۛ۫ۘۘۡۧۛۤ۬ۨۛۧۘۙ۬۟ۙۜۡ";
                        break;
                }
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String doInBackground(File[] fileArr) {
            String str = "۬ۙۦۧۦ۠۠۠ۜۘۢ۟ۘۜ۠ۜۚۦۗۦۗۜۘ۠ۗۤۛۥۚۛۙ۫";
            while (true) {
                switch ((((str.hashCode() ^ 909) ^ 915) ^ 737) ^ (-1677748951)) {
                    case -389371447:
                        return OooO00o(fileArr);
                    case 135069525:
                        str = "ۥۤۡۘ۟ۡۜۗ۬۫ۚۨۚۦۧۧ۫ۤۗۚۜۖۥۘۗ۬ۨ۟۟ۘۜۘۥۘۗۥۖ";
                        break;
                    case 1097329989:
                        str = "ۜۛۘۤۜۗ۠ۘ۟ۛ۟ۜۢۚۡ۬۠ۜۜۦۨۘۡۢۙۢۨۧۗۖۖۨ۟ۛۘۧۘ";
                        break;
                }
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String str) {
            String str2 = "ۛ۬ۨ۬۬۫ۖ۠ۤۜۧۘۘۜۧ۠ۦۥۙ۫ۡۜۨۘۥۢۜۡ۠ۢ۟۠ۜۧۤۨۨۨۘۜۡۗۦۘۡۧ۬ۨۘۙۦۥۥۧۘ";
            while (true) {
                switch ((((str2.hashCode() ^ 193) ^ 754) ^ 82) ^ (-327385947)) {
                    case -1712760973:
                        OooO0O0(str);
                        str2 = "۠ۡۥۘ۟ۥۡ۬ۦ۟ۚۥۢۥۡۘ۠ۜۙۢ۫ۧۢ۬ۗۡۗ۠ۧۦۥۜۘۚۨ۬ۗۦۖۘۨۧۚ";
                        break;
                    case -959006807:
                        return;
                    case 762847834:
                        str2 = "۬ۦۥۙۡۗ۬ۗ۠ۨۜ۠ۡۚۡۘۙۘ۬ۜۤۙۖۙۤۚۛۢۤۘۨۨۚۨ۬۟ۢ۟ۥۦۖ۬ۖۘۦۤ۠ۗۦۘۘ";
                        break;
                    case 1811507088:
                        str2 = "ۡۨۡۘۧۜۦۤۚۡۘۖۦۘۘ۬۠ۖ۟ۥۨۜۡۡۘ۠ۦۖۘۛ۠ۨۘ۫ۤۧۢۥ۠ۡۘ۠ۦۦۚۙۥۘۗۦ۬۬ۜۦۥۧۘ۟ۦ۟";
                        break;
                }
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            ScriptLogDetailActivity scriptLogDetailActivity = null;
            String str = "۟ۨۦۨۤۗۨۦۨۘۘ۠ۘۘۛۗۡۘۖۗۡۘۤۗۤ۬ۡۡۘۚ۬ۦۗۤ۬";
            while (true) {
                switch ((((str.hashCode() ^ 293) ^ 919) ^ 27) ^ 929326420) {
                    case -1332700379:
                        ScriptLogDetailActivity.OooO0oO(scriptLogDetailActivity, scriptLogDetailActivity, R.string.scriptlogdetail_progressdialog_title, R.string.scriptlogdetail_progressdialog_content);
                        str = "ۥۤۛۥ۫ۖ۫۠ۛۡ۟۫ۖۚۛۧۨۘۨۗۤۖ۬ۦۘ۫ۙۦۘ۟ۗۡۖ۟ۤۢۘۙۗۙۡۘۧۖ۟ۧۤۛۜۘۜ";
                        break;
                    case -119224128:
                        scriptLogDetailActivity = this.OooO00o;
                        str = "۬ۤۦۘۢۨۧ۠ۥ۠ۥۧۨۘۥۜۜۡۥۘۦ۫ۨۜۤ۫ۖۢۤۨۖۡۘ";
                        break;
                    case 28926903:
                        return;
                    case 1846608532:
                        str = "۬ۜۧۘ۟ۨۖۘۨ۟ۨ۫ۘۡۧۛۜۖۧۚۗۧۥ۠ۙۙۘۦ۟۟۫ۥ۫ۨۧۦۥۜۜ۬۬ۙ۠ۢ۟ۤۥۘۨ۬ۥ۟۟ۜۧۤۨۘ";
                        break;
                    case 1858040232:
                        super.onPreExecute();
                        str = "ۚۢۜ۠ۗۗ۬۫ۦۘۡۚۖۙۨۛۢۧۥ۟ۤۨۘۚۛۥۘۗۡ۫ۖۖۡۘۖۧۤۜۗۗۨۘۘۘۖۜۘۚۢۚۙۖۚ۬ۚۚۨۢ";
                        break;
                }
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
            String str = "ۦۚ۫۫ۤۙ۠ۡۘۨۢۖۗۦۛۢۜۗ۬۫ۘۤ۫ۜۘۧۗۜۘۤ۬ۦۚۦۘۜۖۦۘۚۥۧۘ۫۟ۧۤۦۦۨۧۛ";
            while (true) {
                switch ((((str.hashCode() ^ 774) ^ 768) ^ 738) ^ 1806521870) {
                    case -1728687165:
                        return;
                    case -1582197720:
                        OooO0OO(numArr);
                        str = "ۢ۫ۛۡۛۦۘ۫ۗۘۘۘۚۜۘ۠ۤۖ۠ۛۜۘ۟۫ۙۦۛ۫ۘۡۘ۠ۖۨۖۚ۫۟ۥۢۖۘۖۜۗۜۘ";
                        break;
                    case -1512655066:
                        str = "ۗۥۙ۟ۙۛ۠ۡۚۙۘۥۘۛۦۛۖۛۖۘۨۙۡۘۧۘ۫ۦۤۥۤۨۖۡۦۧۙۤۖ";
                        break;
                    case -719028338:
                        str = "ۡۙۡۘۖۗۚۘۢۜۘۗ۟ۖۘۚۢۦ۠ۧۥۘۖۙۦ۠ۡۡ۬۬ۡۥ۬ۤۚۛۥۥۘ۬۫ۘۧۖۛۜۘۙۚۜۥۙۧۛۛۘۘۙۨۘ";
                        break;
                }
            }
        }
    }

    public static /* synthetic */ TextView OooO(ScriptLogDetailActivity scriptLogDetailActivity) {
        String str = "ۜ۠ۦ۠ۛۚۛۘۜۡۦۖۘۦۧۢۜۦۜۧ۬ۚۚۘ۠ۢۘۦۦۤ۫ۛ۠ۦۘۖۨۗۜۛۨۘ۫ۥۦۘۘ۬ۜۚۛ۟ۙۜۖۘۖ۠۫";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.GET_TITLE_TEXT_VALUE) ^ 934) ^ 56) ^ 942382367) {
                case -245033037:
                    str = "ۛۙۡۨۗۚۨ۠ۖ۠ۖ۬ۜۨۥ۬ۦۗۦۢ۬ۙۙۦۘۦ۟ۡۘۥۨۦ";
                    break;
                case 1423811367:
                    return scriptLogDetailActivity.OooooOO;
            }
        }
    }

    public static /* synthetic */ void OooO0oO(ScriptLogDetailActivity scriptLogDetailActivity, Context context, int i, int i2) {
        String str = "ۤ۠ۙ۟ۚۗ۬۬ۘۛ۬ۜۘ۫ۘۜۦ۠ۜۘۥ۟ۙ۟ۚۜ۬ۙۘۘۘۘۛۦ۠ۦۘۤۨۗ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_SPINNER_VALUE) ^ 14) ^ 36) ^ (-1037768380)) {
                case -1058841893:
                    str = "ۧۙۚۚۥۡۖۥ۫ۧ۟ۦۘۛۗۦۘ۠ۛۖۖۚۜۘۡۧ۟ۙۙۥۘۙۥ۟ۥ۫۫۟ۚۘۘۢۘۧۘۖۧۖ";
                    break;
                case -370581317:
                    str = "ۨۥۤۨۘۙۧۗ۠ۧ۬ۖۘۜۤۦۘ۠ۛۘۘ۬ۥ۟ۥۛۥۡۡۙ۠ۤ۫ۧ۟ۖۘۘۗۨۚۗۦۘۘ۟ۨۘۨۥ۠ۘۖۦ";
                    break;
                case 1004425729:
                    scriptLogDetailActivity.OooO0o0(context, i, i2);
                    str = "ۙۥۨۘۜ۫ۨ۫ۡۥۘ۟ۜۡۘ۬ۜۦۥۦۘۙۦۡ۟ۥۛۦۥۘۛ۟ۘۘۙۗ۠ۚۥۨۦ۠۬ۧۗۦ۠ۖۘ۬ۢۨۘۤۥۥۘۨ۠۬";
                    break;
                case 1119097819:
                    str = "ۜۡۤ۫۠ۖۘۨۙۛۘۛ۫۟ۨۡۛۧۨۖۙۨۛۜ۠ۡۦ۫ۖۨۙۗۢۛۢ۟";
                    break;
                case 1452057112:
                    str = "ۨۨۡۘۛۨ۫ۧۗۡۦۛۖۘۢۛۡۘۖۗۡۚۜۙۦۢ۠ۘۙۤ۟ۡۦۥ۬ۥۨۧۘۜ۫ۜ۫۟ۨۨۜۙۜۙۤۧ۫ۧ۟ۙۜ";
                    break;
                case 1636980601:
                    return;
            }
        }
    }

    public static /* synthetic */ ScriptLog OooO0oo(ScriptLogDetailActivity scriptLogDetailActivity) {
        String str = "ۘۚۨۘۨۖۨۘ۠ۙۜۘۦۖۨۘ۠۬۟۫۠ۗ۠۠۟ۗ۬ۙ۟ۖۗۗۦۛۙۖۦۚۦۖ";
        while (true) {
            switch ((((str.hashCode() ^ 32) ^ 746) ^ 414) ^ (-663860631)) {
                case -364365852:
                    return scriptLogDetailActivity.Oooooo0;
                case 1105316411:
                    str = "۬ۦۡ۫ۥۘۘۡۙۘۖۦ۟۠ۛۗۚۤۜۛۚۖۘۘ۫ۨۘۢ۟ۜۙۘۛۨۥۚ۟ۜ۠ۙۨۧۢ۫۫ۥۡۢۨ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooOO0(ScriptLogDetailActivity scriptLogDetailActivity) {
        String str = "ۢۗۘۘۙۧۢۧۥۧۘۘۤۜۘ۠ۨۗۘۗ۠ۖ۫ۙۘۤۨۘ۬۠ۡۘۦۚ۫ۜۗۢۛۙۨۨ۟ۡۘۦ۬ۘ۫ۥۨۘۘۛۡ۟ۨ۫ۗۖۖ";
        while (true) {
            switch ((((str.hashCode() ^ 190) ^ 557) ^ 589) ^ 51528786) {
                case -893869360:
                    str = "ۙۦ۫ۙۤۘۚۛۘ۠۟ۤ۬ۧ۠ۤ۬ۦ۟ۦۥ۠ۙۛۚۦۧ۫۠ۗ";
                    break;
                case 569582683:
                    return;
                case 2119414829:
                    scriptLogDetailActivity.OooO0O0();
                    str = "ۜۛۧۡ۫ۥۘۨۙۨۥ۬ۘۘۢۖۜۡۥۥۡ۬۠ۛۜۘۡۜۧۧۛۧ۬ۦۖۘۨۛۦۗ۫ۧ۫ۘۥۘ";
                    break;
            }
        }
    }

    private void OooOO0O() {
        Intent intent = null;
        String str = "ۚ۠ۥۜۧۚ۟ۜۡۘۢ۬ۡۗۤۦ۟ۥۖۗۜۧۥ۠ۖۘۛۡ۬ۖۥۜۢۙۧۖۦۧۘۜ۟۫ۘۤۢ۬ۙ۫ۦۛۖۖۗۚۨۗۚ";
        while (true) {
            switch ((((str.hashCode() ^ 249) ^ 508) ^ 978) ^ 30175287) {
                case -923108129:
                    this.Oooooo0 = (ScriptLog) intent.getParcelableExtra(InterfaceC3865f6.OooOoOO);
                    str = "ۡۨ۫ۦۗۥۘۨ۟ۛۡۘۖۤۤۛۤۧۛۚۦ۬ۢۙۥۘۖ۟ۥۨۢۡۘۜۙۤ۫ۗۡۘ";
                    break;
                case -286602233:
                    return;
                case 485725796:
                    this.Oooooo = intent.getBooleanExtra(InterfaceC3865f6.OooOoO, false);
                    str = "ۡ۫ۨۖۘۗۙۡ۠ۙۡۙۧۗۚۦۙۡۙۢۦۢۗۛۥۢۢۧۘۘ";
                    break;
                case 488073400:
                    str = "۬ۛۘۘۙۛۚۤۥۘۘ۟ۖۨۥۧۦ۟ۤ۟ۡ۠ۚۙۙۖ۠ۡ۟ۛۜ";
                    break;
                case 1731274727:
                    intent = getIntent();
                    str = "ۨۥۙۡۧۜۧۥ۬ۙ۫ۘۘۤۥۦ۬ۙ۟ۗۖ۠۠ۥ۫ۜۘۨۗۡۢۢۘۧۡۘ";
                    break;
            }
        }
    }

    private void OooOO0o() {
        Button button = null;
        String str = "ۨ۬ۨۘۜۗۢۚ۬ۤۛۛۘۦۨۚ۫ۙ۫ۦۚۗۤۢ۫ۨۘۙۥ۟ۙ۟ۨۘۧۡۘۘۛۛۖ۬ۤۥ";
        while (true) {
            switch ((((str.hashCode() ^ 860) ^ 347) ^ 413) ^ (-302611055)) {
                case -1730743179:
                    str = "ۧۜۧ۬ۗ۠ۛۙۦۘۖۥۧۘۘۗ۠ۡۨۚۢۥۤ۫ۜۙۨۚۙۢۦۛ";
                    button = (Button) findViewById(R.id.btn_scriptlogdetail_showmore);
                    break;
                case -1233268427:
                    button.setVisibility(8);
                    str = "۬ۜۖۨۢۖۘۗۤ۠ۘۧۜۚۜۢ۬ۡۡۘۗ۬ۜۦۤۚۛۖۘۜۦۖۘۖ۟ۛۖۛۘ۬ۤۦۙۤ۫ۖ۟ۥۘۚۗۘۘ";
                    break;
                case -1045744550:
                    this.OooooOo.setOnClickListener(this);
                    str = "ۨۙۖۘ۬ۜۢۙۖۛۦۙۥۘۥ۬ۢ۠ۛ۟ۧۙۚۜۤۥۢۖۗۧۢۜۡۤۡۘ۟ۚۥۚۘۖۛ۬ۖۘ";
                    break;
                case -1032978469:
                    return;
                case -656574135:
                    str = "ۘ۟ۙۢۗۥۘۢۧ۬۟ۖۧ۟ۦۦۘۤ۟ۦۘۘۗۚ۫ۡۚۢۙۜۘۜۡۦۘۜ۠ۙۡۙۚ۫ۘۡۥۗۗۜۘۨۡۖۥ";
                    break;
                case -17962280:
                    button.setVisibility(0);
                    str = "ۨ۠ۛۚۡۖۘۡۨۛۦۢۖۧۤۘۘۢ۟ۨۘۤۨۦۡۚ۠۫۫ۖۜۨۗۙۧ۟ۜۧۗۙ۠ۖۘۦ۟ۘۘۤۧۦۘ۟ۢۜ";
                    break;
                case 923407607:
                    str = "۬ۜۖۨۢۖۘۗۤ۠ۘۧۜۚۜۢ۬ۡۡۘۗ۬ۜۦۤۚۛۖۘۜۦۖۘۖ۟ۛۖۛۘ۬ۤۦۙۤ۫ۖ۟ۥۘۚۗۘۘ";
                    break;
                case 1210418675:
                    String str2 = "۬ۗۙ۫ۨ۟ۨۙۤ۟ۥ۟ۜ۫ۧ۠ۗۗۚۖۘۜۜۛۥۦۗۤۦۜۘ۠ۚۢۚۖۗۡۥۙۗۥۥ۟۫ۥ۟ۥۘ۟ۖۨۨۚۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 1873144381) {
                            case -1793276633:
                                String str3 = "ۥۘۤۜ۠ۥۚۗۦۘۦۡۧۘۛۘ۫۬ۢۦۘۨۢۨۨ۬ۥۛۜۚ۫ۨۧۡۛۡۜ۬ۦ۠ۚۦ۫ۘۢ۟ۢۜۡۛ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1185856134) {
                                        case -1275838451:
                                            str3 = "ۖۖۖۡۡۧ۟ۗۦ۫۟۫ۙۖۘ۫ۧۖۘۘۛۤۧۥۜۤ۟ۨۘۗۚۥۘ۫ۜۦۘ۬ۨۘۦۢۙۘۡۘۥ۠ۨۘۥ۠ۨ";
                                            break;
                                        case -1264332086:
                                            str3 = this.Oooooo ? "ۛۚۥۘۖۘۡۜۡ۟ۨ۠ۤۖۖۛۖۚ۫ۖ۟ۨۢ۬ۥۥۘۖۚۥۘۘ۬ۦ۬۬۬" : "ۤۦ۟ۥۧۨ۟ۚۡۜۢۙۖۡۢۢۛۘۘۜۘۤۛۚ۟۫ۤۨۥ۫۫ۤۜۨۤۤۚۨ۬ۙۘۘۘۗ۬۠ۨۥۘ۟ۤۙۗۗۖۘ";
                                            break;
                                        case -60486569:
                                            str2 = "ۧۘۖۡۗۗۗ۫ۦ۫ۡۛۖ۬۟ۡۡ۟ۙۥۧۦ۠ۘ۠ۜۘ۟ۧۥ";
                                            break;
                                        case 1323780530:
                                            str2 = "ۘۖ۫ۖۘۙۙۛ۠۠ۧۥۡۢۥ۟ۛۢ۫ۘۘۘۥۡۘۘۜۜۤۗۜۛۨۚ۟ۡ۬ۧۚۦۧۘۖۗۢ";
                                            break;
                                    }
                                }
                                break;
                            case -1445587882:
                                str = "ۦۢۨۘۥ۬ۦ۟ۚۨۘۤۛۧۙۘۧۖۘۜۦ۠۬ۛ۟ۘ۫ۧۖۧ۟۟";
                                continue;
                            case -575520045:
                                str2 = "ۗۙۖۘۘ۬ۡۤۡۦۜ۠ۜۧۗۥۘۛۘۖۧۜۢۡۗۡۘۙۗۦ۠۫ۥۘۨ۟ۦۘۢ۫ۧ";
                                break;
                            case 774194612:
                                str = "ۗ۫۟ۙ۟ۘۘۦۙۦۘۜۜۜۜ۬ۡۢۘۘۘۖۦۡۘ۟ۗ۟ۖۘۛۤۖۚ۫ۖ۠ۜۘۨۘۛۧۦۘۙۖ۬";
                                continue;
                        }
                    }
                    break;
                case 1678634007:
                    this.OooooOo = button;
                    str = "ۘ۫ۤۡۢۡۡۜۨۢ۬ۖۘۚۚ۠ۢۘۧۨۗۚۧۛۧ۫۫ۚۘۦۡۘۢۙۘۜۤۥۘ۠ۢۙۜۚۥۘۖ۫ۨۘۚۚۥ";
                    break;
            }
        }
    }

    private void OooOOO0() {
        String str = "۫ۜۨۘۗۨ۠ۚۤۨۨۛۢۢۘۚۙۥۢ۬۫ۢۨۘۖ۬ۖۡۦ۠";
        TitleView titleView = null;
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_UIP_DATA_VALUE) ^ C4589yr.OooO00o) ^ 587) ^ 930276076) {
                case -2013436034:
                    titleView.setTitleText(this.Oooooo0.getName());
                    str = "ۛۨۨۗۜۛ۟ۢۜۘۙۙۖۘۧۜۢۨۨۜۘۜۡۜۘۗۢ۠۠ۦۨۖۚۖۥۧ۟ۧۜۖ۫۬ۡۧۦۘ۠ۤ۬ۚۦۧۘ";
                    break;
                case -1977539301:
                    str = "ۜۨۧۘۦۥ۠ۗ۬ۡۢ۫۠۠ۖۥۘۤۜۢ۠ۤۜۦۡۗۧۚۡۘۤۥ۠";
                    titleView = (TitleView) findViewById(R.id.titleview_scriptlogdetail);
                    break;
                case -1664053819:
                    str = "ۧۨۚۛۙۤۚۗۦۘۨۜۘۘۖۖ۟ۛۡۦ۠ۡۘۤۥۖۘۛۡۖۧۨۡۨ۠ۖۧۛ۠ۡۧ۫ۖۧ۬ۨۖۛۗۜۘ";
                    break;
                case -1619213561:
                    this.OooooO0.setOnLeftImageViewListener(new OooO0O0());
                    str = "ۗ۠ۨۧۢۜۨۚۛۧۛ۫ۧۨۥۘۦۧ۫ۗۗ۠ۚ۬۬ۙ۠ۗۛۚ۫ۥۥۘۦۦۦۘۗ۠ۢۤ۠ۖۗۡۢۧۤۜ";
                    break;
                case -250570839:
                    this.OooooO0.setVisibilityRightImage(4);
                    str = "ۚ۠ۘۥ۠ۦۖ۬۫ۢۘۥۘۛۜۥۘۧۢۚ۟ۚ۟ۧ۬۬ۡ۠۠ۜۢۦ";
                    break;
                case 224382270:
                    return;
                case 694652208:
                    this.OooooO0.setleftImage(R.drawable.ic_back);
                    str = "ۧۥۦۘۦۢۖۘ۫ۘۧۘۘۡۨۘۜ۬ۚۥۚۡۤۖۜۘۧۨۨۘۥۛۦۦ۠۠ۡۦۚۘ";
                    break;
                case 871247687:
                    this.OooooO0 = titleView;
                    str = "ۚۤۗۦۘۢۖۚۨۘ۟ۜۚۡۢ۠ۧ۫ۨۨۦۜۘ۠ۢۚۗ۬۟ۤۦ۟";
                    break;
                case 1843430126:
                    this.OooooO0.setTitleSize(18);
                    str = "ۙۢۡ۠ۧۢۖۦۦۘۧۗۖۜۢۢۡۨۛۦۥ۬ۨۗۡۗۖۤۗ۫ۦۘۥ۬ۛۤ۟ۤۙ۟ۧۧۛۥۘ";
                    break;
            }
        }
    }

    private void initView() {
        String str = "ۖۢۜۘۗ۫۬۫ۥۦۘۛۜۤ۠ۛۦ۟ۗۡۘۡۗ۠ۚ۠ۖۢۘۨ۠ۛۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 17) ^ 884) ^ 178) ^ 1360873368) {
                case -2131786274:
                    OooOOO0();
                    str = "ۤۤۤۨۦۙۚۛۚۧۙۙۦۥۗۧۢۥۡ۠۠ۥ۬ۨۡ۟ۖۨۧۡۨۖۜ۬۟ۚۥۘ۟۟ۢ";
                    break;
                case 75735848:
                    str = "ۧۥ۠ۘۢۖۘۥ۬ۗۛۜۡ۬ۨۡ۟۟ۘۘ۬ۢۚۡۢ۟ۘۗ۫ۨۗۡۘ";
                    break;
                case 297437013:
                    this.OooooOO = (TextView) findViewById(R.id.tv_scriptlogdetail_scriptlog);
                    str = "ۧۚۘۘ۫ۚۗۗۦۧۘ۫۠ۦۖۖۦۛۦ۟ۖۜۡۢ۠ۦۥۦ۬ۙۧۧ۟ۤ۬ۥ۠ۗۥۙۡۘۧۙۚ۠۫ۥۘۚۛ۬";
                    break;
                case 811173411:
                    return;
                case 1982342149:
                    new OooO0OO().executeOnExecutor(Executors.newCachedThreadPool(), this.Oooooo0.getFile());
                    str = "ۛۜۘۧ۫۟ۦۥۦ۬ۢ۠ۖۜۨۡۜ۠ۧۥۨۘۥۨۤۥۡۘۘۥۢۨۛۙۖۘۢ۬۟ۡۡۜۨۘ۫ۗۛۥۨۡ";
                    break;
                case 2107774010:
                    OooOO0o();
                    str = "ۛۖۧ۫ۛۤۚۚ۫۫ۘۜۖۘۜۘۢۢۖۘۡۧۧۤۜۖۘۤۘ۠ۧۛ۫";
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = "۫۬ۙ۟۟۫ۧۙۘۘ۫ۙۨۘۥۦۡۘ۫ۛ۫ۙ۫۠۬ۨۤۖۡۦۘ۫ۡۖ۫ۗۢۥۗۨۘۛۚۚۛۘۨۤۘۘۢۚۥ";
        while (true) {
            switch ((((str.hashCode() ^ 830) ^ 951) ^ 745) ^ (-895458502)) {
                case -1933656235:
                    str = "۬۠ۨۥۡۘۘۧۜۘ۬ۢۚۤ۫۟ۧۛ۠ۨۜۥۘۨ۠ۜۘۨ۠۬ۥۜۥۘ۟ۘۤۛ۟ۚۖ۫ۗ۟ۤ۠۟۫ۜ۟ۗۛۧۜۘۗۦ";
                    break;
                case -1587286822:
                    startActivity(new Intent(this, (Class<?>) ScriptLogActivity.class));
                    str = "۬۠ۨۥۡۘۘۧۜۘ۬ۢۚۤ۫۟ۧۛ۠ۨۜۥۘۨ۠ۜۘۨ۠۬ۥۜۥۘ۟ۘۤۛ۟ۚۖ۫ۗ۟ۤ۠۟۫ۜ۟ۗۛۧۜۘۗۦ";
                    break;
                case -1231138923:
                    String str2 = "ۦۨ۬ۥۧۡۦۧۛ۟ۚۘ۟۫ۡۙۖ۬ۥ۬ۘ۠ۡۢۢۦ۫ۛ۫ۥۘۗۜۨۤۚ۟۫۫۟ۥۘ۟ۤ۟ۚ۫ۡۧ۟۬۫ۖۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 608637776) {
                            case -1436847354:
                                str2 = "ۢۢۧ۟ۡۨۘۡ۠ۚ۠۫ۤۘۨۤۛۚ۫ۛۨۘۨ۫ۖ۟ۗۘۘۢ۫ۥۖۧۢۖ۬ۜۥۨۜۘ۬۬ۗ۫ۜ۬ۧۗۜ";
                                break;
                            case 697743671:
                                str = "۟ۦۦۘۛۛۤۚۜ۠ۥۦۖ۠ۦۡۘ۠ۚۤۧۘ۫۬ۖ۠ۦۜۡۘۘ۟ۢۨۘۚ۟ۤۦ۫ۜۗ۬۠۫";
                                continue;
                            case 1318614791:
                                String str3 = "ۤۥۦۘۗۨۗۤۦ۠ۨۙۨۘۢۖۧۗۦۜۘۨۧۜۘۛۨۧۘۗۡۨۘۗۗ۠ۛ۫ۖۘ۟ۛۦۘۙۤۥۨۗۖۘۖۡ۫ۥۙۖ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-752348587)) {
                                        case -1376565386:
                                            str2 = "ۜۛۦۘۢۗ۟۫ۥۤ۟ۦۡۘۗۜۗۙۢ۫ۤۜۘۙۛۤۛ۟ۘۘ۠ۘۖۘۗۤۚۚۘۘ";
                                            break;
                                        case -658917610:
                                            str3 = "ۗۤۛۗ۠ۗۘ۬ۥ۫ۗۦۘۛ۠۟ۚۙۡۨۛۚۘۤۛۨۢۦۘ۟ۖۦۘۨ۠ۛ۠۫ۖۡۛ۫ۙۤۤ";
                                            break;
                                        case -362644111:
                                            str2 = "ۘ۫ۜۘ۟ۧۚۡۖۙ۠۟۠ۥۗۜۘۚۜۘۘۢۡۡۤۧۥۘۗۖۖۢۢۖۘۚ۫ۜۘۖۖۡۘ۬ۧۗۖۗۥۜۘۘۘۛۚۤۘ۫۫۫۠ۗ";
                                            break;
                                        case 658908359:
                                            str3 = view.getId() != R.id.btn_scriptlogdetail_showmore ? "۫ۙ۟۠ۙۥۘۧۗۚ۫ۜۘۘۦ۬ۧۗۙۤۥۜۘۜۦۙۘۚۚ۟ۛۘۤۡۥۘۛۗ۠" : "۫ۦۡ۟ۨۖۙۗۡۛ۬ۨۚۡۘۗۛۘۘ۟ۚۨۘۗۡۡۘۖۢۜۘۢۜۨۙۨۖۙۘ۟ۧ۠ۖ۫۠۬۠ۥۡۙۤۜۥۢۖۢۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1503862076:
                                str = "ۥۨۛ۟ۡۘۘۛۙۦۜۙۡ۟ۖۜۘۚۖۥۘۤ۠ۥۥۥۙۖ۫ۘۖ۟ۘۥۡۥۙۡۘۘۡۘۜۘۧۧۢۛ۟ۛۥۤۤ";
                                continue;
                        }
                    }
                    break;
                case 312731731:
                    str = "ۘ۫ۢ۬۟ۨ۠ۘ۫۟ۜۖۡۚۚۜ۠ۖۦ۫۫۫ۜۘۜۧۘ۟ۘۨۛۚۢ۫ۗ";
                    break;
                case 870891858:
                    str = "ۦۦۘۗۜ۠ۛۦ۬ۗ۟ۦۘ۬ۤۤۥۤۡۥۡۧۘۖ۠۟ۖ۬۬ۧ۟ۗ۬ۡۘۗۜۦۘۚۧۖۘۛۖۦۘۥۖۗۢۥۨ۟۟ۡۧۥۜۘ";
                    break;
                case 1718019335:
                    return;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۨ۫۫ۚۘۤ۫۠ۡۦۢۙۦ۬ۗۚۚۙۗۡۢۨۙ۟ۡۘۛۦ۟ۨۚۡۘۗۘ۬ۢۨۧۗۖۖۘۥۨۡۘۨۙ۠";
        while (true) {
            switch ((((str.hashCode() ^ 466) ^ 673) ^ 816) ^ (-341334477)) {
                case -1128106101:
                    OooOO0O();
                    str = "ۡۛۨۘۧۘۨۦۗۥۘۧ۬ۦۘۦۜۧۘ۬۟ۥۚۧۥۤۘۛۥ۟ۦۘۢۢۡۙۛۡۦۤۦ";
                    break;
                case -645783520:
                    return;
                case -393402731:
                    str = "ۘ۫ۡۙۨۧۘۘۘۢ۠ۥۛۥۘۙۖۦۨۘۨۨۘ۟۫ۚ۟ۖۖ۫۠ۖۗۜۖ۫ۖۧۘۧۧۖۘ۟ۜۧۘۜۦۙۢ۠ۨ";
                    break;
                case 783193404:
                    initView();
                    str = "ۧ۫۟ۗۨۤ۬ۡۥۡۡۗ۬ۡۧۘۜۘۨ۫ۗۦۡۥۗۛۙۥۘۢۤۘۥ۫ۥۜ۟۠ۧۡۘۥۚ";
                    break;
                case 1305230045:
                    super.onCreate(bundle);
                    str = "ۚ۫ۡۥۦۧۘۖۘۨۢۙۧ۫ۜۦۘۦۡۡۘۖۤۡۗ۬ۧۨۨۘ۠ۛ۬";
                    break;
                case 1552924105:
                    setContentView(R.layout.activity_scriptlogdetail);
                    str = "ۘ۬۠ۘۘۖۘۥۚۤۙۚۙۚ۟ۧۗۙۛۚۖۤۜ۠ۛۧۨۡۡۜۘ۠۫ۢۖۡۤۖۢۖ۬ۖۥۦۙۜ۬ۤۘ۠ۧۗۧ";
                    break;
                case 1585502892:
                    str = "ۛۖ۫۬ۦۖۘۦۖۜ۫ۨۡ۠ۜۡۘۙۙۡۘۢۨۜۜۙۨۘۚ۬ۜۘ۫ۨۗۨ۫۫ۧۖ۫ۛ۟ۘۗۛ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "ۦۡۜۢۙۜۘۢ۫ۖۘ۬۠ۤۚۘ۫ۛۤ۟ۜ۫ۘ۟ۧ۠ۜۨۘۜۜۖ";
        while (true) {
            switch ((((str.hashCode() ^ 537) ^ UiMessage.CommandToUi.Command_Type.GET_TITLE_TEXT_VALUE) ^ 190) ^ 1708527083) {
                case -1556099937:
                    return;
                case -1370790314:
                    C3691ah.OooO0OO(ScriptLogDetailActivity.class.getCanonicalName());
                    str = "ۜۜۖۘۜۢۖۘ۬۟ۖ۫ۥۘۛۢۦۘۛ۟ۡۘۚۗۡۘۧۜۘۡۜۖۚۧۖۜ۟ۡ۟۟ۙۤۧ۠ۤۧۖۙ۬ۙ۠ۥ";
                    break;
                case -912123607:
                    C3691ah.OooO0o0(this);
                    str = "ۜۛ۬ۜۜۘۘۨ۬ۤۙۥۧۥ۬ۚۥۚ۬ۨۨۥۘۥۢۘۘۤۦۖۘۨۘۨۘۧۡۨۡ۫۬ۢۦۨۘ۟ۢۢۥ۠ۡۘۗۨۨۘۥۜۥۘۥۖۥ";
                    break;
                case -649958196:
                    str = "ۜۥۙۦ۬ۨ۠ۗ۬ۛۚۦۘ۫۟ۡۥۢۘۘۖۙۖ۟ۥۧۘ۫ۡۦۧۘۧۚۘۨۘۖ۬ۜۘۗۛۗۨۤۗ";
                    break;
                case 735111741:
                    super.onPause();
                    str = "ۢۙۙۘۗۥۘۚۢۜۛۘ۠ۡۦۥۘۜۤ۠ۢ۠۟۟ۥۢۚۙ۠ۤۜۨۦۥۧۗ۟ۘ۟ۧۖۘۧۧۨۘ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "ۢۖۢۢۢۤۙۛۦۧۧۦ۟ۨ۟ۜۨۡۘۢۨۧۘ۫ۗۗ۫۫۫ۖۦۛۜ۟ۤۦۢۥۘۗۡۘۤ۫ۜۤۖۚۘۚۨۥۦۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 569) ^ 417) ^ 614) ^ 1908954156) {
                case -158004644:
                    super.onResume();
                    str = "ۥۗۖۢۛۗۙۦۡۘۡۤۜۘۥ۠۟ۘۖۨۛۡۗۖۙۖۖۦۘۨۧۛ۬ۤۦۘ۬ۤۖۙۧۗۢۢۨۘ";
                    break;
                case 266891489:
                    str = "ۘۜۢ۫۫۫ۤۙۙۙۘۥۘۛۦۦۘۙ۟ۧۡۦۡۘۚۙ۬ۤۗۗۥۢۡۘ۠ۢۢۙۘ۬ۨۡۘۤۨۛۨۢۨ۠ۧۘۘ";
                    break;
                case 880031455:
                    C3691ah.OooO0o(this);
                    str = "ۡۘۘ۬ۡۜۘۧۤۤۜۥۚۢۥۜ۟ۦۤۛ۫ۖۘۦ۠ۦۜۘ۟۠ۤۧ۠ۤ۟ۡۚۖۚۤۙۡۖۧ۫ۚۧۜۖ۬ۡۙۢۚۡۦ";
                    break;
                case 1103630588:
                    return;
                case 1414729548:
                    C3691ah.OooO0Oo(ScriptLogDetailActivity.class.getCanonicalName());
                    str = "ۖۢۦۘ۠ۦۥۢۗۜۘۧۚ۫ۖۘۥۖۤۥۘۘۦ۟۠۫ۥۘۧۚ۬۬ۗ۠";
                    break;
            }
        }
    }
}
