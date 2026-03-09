package com.cyjh.elfin.p200ui.activity;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.elfin.sweepcode.CameraSurfaceView;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;
import java.io.PrintStream;
import p285z2.C3753c5;
import p285z2.C4095le;
import p285z2.C4384t7;
import p285z2.C4458v7;

/* JADX INFO: loaded from: classes.dex */
public class SweepCodeZbarActivity extends BaseActivity implements C4458v7.OooO0O0 {
    public static final String o00O0O = "SWEEP_RESULT_BACK";
    public static final int o00Oo0 = 99;
    public static final int o00Ooo = 100;
    private static final int o00o0O = 17;
    private static final int o00ooo = 18;
    private ImageView OooooOo;
    private C4458v7 Oooooo;
    private RelativeLayout OooooO0 = null;
    private RelativeLayout OooooOO = null;
    private FrameLayout Oooooo0 = null;
    public boolean OoooooO = false;
    public Camera.PreviewCallback Ooooooo = new OooO00o(this);
    private final Handler o0OoOo0 = new OooO0O0(this);
    public boolean ooOO = true;

    public class OooO00o implements Camera.PreviewCallback {
        public final SweepCodeZbarActivity OooO00o;

        public OooO00o(SweepCodeZbarActivity sweepCodeZbarActivity) {
            this.OooO00o = sweepCodeZbarActivity;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            SweepCodeZbarActivity sweepCodeZbarActivity = null;
            String str = "ۛۚۥ۟ۨۦۘۜۡ۠۬۟ۘۧۡۘۘ۠ۤۤۛۢ۬ۦۡۗ۟ۚ۫ۧۡ۠";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.FW_SET_TOP_VALUE) ^ 951) ^ 21) ^ 936157028) {
                    case -1983798857:
                        sweepCodeZbarActivity.OooOOO(bArr, camera, SweepCodeZbarActivity.OooO0oO(sweepCodeZbarActivity));
                        str = "ۧۦۙۢۤۖۚۜۨۘۛۗۖۘۢۤۡۤۚۡۘۧۡۛۢۥۖۘۗ۟ۖۘۡۡۢۥۛ۟ۥ۬ۥۘۖۨۡۘۜ۬ۡ";
                        break;
                    case -1337406374:
                        sweepCodeZbarActivity = this.OooO00o;
                        str = "ۡۥۧ۫ۜ۬ۥۨۢۖۥۛۥۖۡۘۖۜۥۦۘۨۦۙۡۙۨۖۘۙۛۥۘ";
                        break;
                    case -1267396930:
                        return;
                    case -532802257:
                        str = "ۗۦۙۤۦۧۘۨۤۛ۬۠ۗۡۥۚۥۤۦۘۥۚۧۖۜ۬ۨۘۤ۟ۨۗۨۨۜ۬ۢۧۚۥۙ۫ۥۥۥۚ۟ۗۡۘ۬۬ۨۗ۬ۧ";
                        break;
                    case 607292915:
                        str = "ۡۨۜۘۦۖۛۘۨۚۧۜۧۘۜۢۛۛ۟ۨۘۡۘۧۘ۬ۦ۠ۛۦ۬ۡۜۢ";
                        break;
                    case 1498260612:
                        str = "۬۠ۥۘۜۖۚ۫ۦ۬ۛۧۦۘ۠ۜۦۜۢۙۡۖۘۧۦ۟ۦۛ۫ۚۖۚۗۥ۟ۨ۟ۛۤۤۛۧۨۚۥۦۖۖ۟ۜۘۚ۟ۧ";
                        break;
                }
            }
        }
    }

    public class OooO0O0 extends Handler {
        public final SweepCodeZbarActivity OooO00o;

        public OooO0O0(SweepCodeZbarActivity sweepCodeZbarActivity) {
            this.OooO00o = sweepCodeZbarActivity;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str = "۬۬ۡۛۧۛ۠ۜۢۚۙۥۘ۬۬ۛۢۤۖۘۢ۟ۥ۠۬۠ۗ۫۠ۘۖۖۘۜۧۗۤۙ۠ۚۦۥۘۧۘۛ۫ۨۙ۫ۨۙ";
            while (true) {
                switch (str.hashCode() ^ 784643606) {
                    case -1375737137:
                        try {
                            SweepCodeZbarActivity.OooO0oo(this.OooO00o, (String) message.obj);
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            this.OooO00o.OoooooO = false;
                            return;
                        }
                    case -1277749092:
                        str = "ۢۡۨۘۛ۟ۤ۫ۜۖۛ۠ۡۘ۬ۤۜۘۖۥ۟ۚۜ۫ۡۤۖۘۨۧۦۧ۟۟ۦۗۖ۫ۧۧۖ۟ۚۘۗ۬ۤ۬۟۫۟";
                        break;
                    case -696408073:
                        String str2 = "ۛۥۘۛۛۦۖۛۘۘ۟ۙۜۤ۠ۨۘۖۛۨۙۥۤۗ۠ۡۘۜ۫ۖۘۜۙۦ";
                        while (true) {
                            switch (str2.hashCode() ^ 341802893) {
                                case -1430728027:
                                    str = "ۥ۫ۚۗۗۥۡۢۚۛۧۗۘۖ۬ۧۙۖۖۘۧۘۚۘۦۙۦ۠ۚۚۜۘ۬ۨۨۘۢ۫ۡ";
                                    continue;
                                case -1222221153:
                                    str2 = message.what == 17 ? "۠۫ۘۘ۫ۦۥ۫ۙ۟ۤۢۦۤۖۦۜۛۦۘۥۛۧ۠ۜۜۘۢۤۙۖۘۧۗۢ۟ۨۤ" : "ۥۛۥۘۧۢۥۘۜۙۥۜۦۡۘ۠۟ۖۘ۟ۚۧۢ۬ۤۜۛ۫ۤۥۘ۠ۖ۠۟ۡۤ۬۟۠ۤۦۛۖۦۡۘۥۧۜۘۙ۬۠";
                                    break;
                                case 930392405:
                                    str2 = "۬۫۟۟ۙۥۤ۟ۥۘۢۥۥ۫ۥۧۡۛۚۜ۠ۢۧۧۖۘۧ۬ۥ۠۫ۢ۫ۧۜۘۖۜۘۘۧۙ۬ۛۥۢ";
                                    break;
                                case 1106409402:
                                    str = "ۥۡۥۖ۠ۧۡۗۡۛ۫ۥۘ۬۬ۜۘۥ۫ۧ۬۠ۜۦۢۘۘ۫ۨۥۖ۬ۤۢۡۘۜۖۜۨۡۘۘۙۜۧۘۤۜۛۙۛۥۖۛۙ۬ۧۨۘ";
                                    continue;
                            }
                        }
                        break;
                    case 58171729:
                        return;
                }
            }
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public final SweepCodeZbarActivity OoooOoO;

        public OooO0OO(SweepCodeZbarActivity sweepCodeZbarActivity) {
            this.OoooOoO = sweepCodeZbarActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "۠ۚۡۘۙ۫۠۬۟ۦۚۤۥۖۙۥۖۙۘۜۨۜۘۦ۟ۜۖۙ۟۫ۢۥ۟ۧۧۗۥ";
            while (true) {
                switch ((((str.hashCode() ^ 186) ^ 567) ^ 100) ^ 202286062) {
                    case -2139905971:
                        this.OoooOoO.OooOOO0();
                        str = "ۗۘۡۘۥۨۜ۫۠۟۠ۖۡۘۗ۠ۛ۫ۤۥ۫ۘۘۘ۟ۘ۫ۗۘۤۗۡ";
                        break;
                    case 388915199:
                        return;
                    case 1185823231:
                        str = "ۛۤۜۘۥۜۗ۟ۘۦۗۛ۠ۙۜۖۦۛۡۗۘۙۨۥۚۤۙۧ۠ۖ۫";
                        break;
                    case 1596941868:
                        str = "ۛۙۗ۠ۚۙۘ۟ۘۖۦۡۘۙۘۥۘۦۧۨ۟ۙ۟ۖ۫ۥۨۘ۫ۦ۫ۚ۫ۨ۫ۧۥۘۧۥۧۚۙۖۗ۫ۨۜۛۘۘۜۡۗۙۢ";
                        break;
                }
            }
        }
    }

    public class OooO0o implements TitleView.OooO0O0 {
        public final SweepCodeZbarActivity OooO00o;

        private OooO0o(SweepCodeZbarActivity sweepCodeZbarActivity) {
            this.OooO00o = sweepCodeZbarActivity;
        }

        public /* synthetic */ OooO0o(SweepCodeZbarActivity sweepCodeZbarActivity, OooO00o oooO00o) {
            this(sweepCodeZbarActivity);
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "ۥ۠ۜۖ۠ۙۡۚۥۘۧۙ۟ۚ۠ۦۘۖۚۛۧ۠۫ۘۛۙۖۤۧۖۨ۬";
            while (true) {
                switch ((((str.hashCode() ^ 229) ^ 437) ^ 470) ^ (-1615401911)) {
                    case -1685449664:
                        this.OooO00o.finish();
                        str = "ۙ۬ۧ۬۠۫ۦۡۥۥۥ۠ۜۛۜۘۨۜ۬ۤۘۤۗۢۘۘۗ۬ۘۘ۠ۨۘ";
                        break;
                    case -929187042:
                        str = "۟ۨۜۥۘۡۘۦۤۧۗۖۥۛۤۦۘۦۡۘۘۖۛۥۛ۟ۙۙۤۡۡۨۘۘ۟ۙۡۘۘ۫۬ۚۧۚۙ۫۠";
                        break;
                    case -133683618:
                        str = "۠ۨۘۘۥۜ۬ۢۨۜۘۦۢۦۘ۬ۦۗۤۚ۬ۧۙۢۚ۬ۜۖ۫ۜۥۖۛۦۜۡۥۥۘ۠ۛۖۧۖۖۙۘ۬ۘۤۖۘ";
                        break;
                    case 349972971:
                        return;
                }
            }
        }
    }

    private void OooO() {
        String str = "ۨۤۧۚۦ۫ۗۧۡۜ۫۟ۚ۠ۡۘۤۚۡ۟ۢۗۧۡۡۘۧ۬ۘ۫ۤۙۜۗ۬ۧ۠ۛۜۖۥۘۛۜۛۜۥۥ۫۟ۖۘۛۛ۫ۜۚ۠";
        while (true) {
            switch ((((str.hashCode() ^ 413) ^ 501) ^ 877) ^ 1289517364) {
                case -945252331:
                    str = "ۤۦۦۘۙۨ۫ۨ۫ۜۚۙ۠ۛ۬ۖۜۘۤۛۦۤۢۛۖۖۜۡۘ۠۟ۖ";
                    break;
                case -169109966:
                    this.Oooooo0.addView(new CameraSurfaceView(this));
                    str = "ۦۧۜۘۦۨۤ۠ۢ۟ۗۚۢ۠ۧ۟ۗ۬۠ۢۤۢۤۛۗۘۨۦۖۛۥۨۧۨۘۡۧۨۘۗ۟ۘۦۘۦ۫ۛۦۘ۬ۤۙ";
                    break;
                case 273237102:
                    return;
                case 1616608387:
                    C4384t7.OooO().OooOO0o(this.Ooooooo);
                    str = "۫۫ۚۢ۠ۘۘۡۗۤۧۨۧۘۥ۫ۧ۠ۤۗۦ۟ۥۘۚۡۥۘۤۨۚۨۛۨ";
                    break;
            }
        }
    }

    public static /* synthetic */ RelativeLayout OooO0oO(SweepCodeZbarActivity sweepCodeZbarActivity) {
        String str = "۫ۘۙۖ۬ۥۤۨۨۘۘ۫ۛ۟۬ۛۧۡۖۘۗۜۥۘۧۗۚۧۗ۫ۦۖۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 342) ^ 964) ^ 368) ^ 1396438016) {
                case -2110500273:
                    return sweepCodeZbarActivity.OooooOO;
                case -756735444:
                    str = "ۥۦۨۗۢۚۜۛ۫ۜۧۥۙۡۦۘۨۦۥۘۖۖۜۖ۬ۚۖۖۜۛۗ۫ۢۢۦۤۨۤۗۘۖۜۨۢۛۡۘۧۨۧۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ void OooO0oo(SweepCodeZbarActivity sweepCodeZbarActivity, String str) {
        String str2 = "ۧۦۥۦ۫ۨۢۤۥ۬ۗۗ۟ۢۥۗ۬ۥۨۛۨۛۜۘۜۖۦۗۜۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 273) ^ 394) ^ 78) ^ 1398666677) {
                case -1938617537:
                    sweepCodeZbarActivity.OooOOOo(str);
                    str2 = "ۤۦۖۗۢۨۘۘۦۢ۫ۡۖۨۗۨۘ۫ۧۥۡ۬ۧۥۙۨۘۧۡۦۘۖۧۘۡۘۛۧ۠ۨۘۙۘۥۘ۟ۦ۟";
                    break;
                case 52415479:
                    str2 = "ۧۜۖۘۧ۠ۘۘۙۖ۠ۧۚۛ۠ۛۡۗۘۘۙۖۖۘۚۚۘۘۛۥۖۦۘۧۘۙ۟ۙۗۦ۠ۢۥۥۙۚۚ";
                    break;
                case 326905027:
                    return;
                case 1938818749:
                    str2 = "ۦۥۡ۬ۦۥۘۧۨۢ۟ۨۖۤۦۗ۬ۢۘۚۢۘۗۦۘ۠۬ۙ۫ۤۤۜۘۤۥۙۚۜ۠ۙۙۗۛۡۤۢ۬۠ۥ";
                    break;
            }
        }
    }

    private void OooOO0O() {
        String str = "ۦۙۖۘۜۡۘ۬ۨ۟ۨ۫ۢ۫ۨۘ۠۟ۥۘۗۘۧۗۢۦۢ۟ۚۚۥ۫ۢۥۧۨۢۜۘۜۘ۟ۛۦۖۘۜۘۢ۠ۙۥ";
        TitleView titleView = null;
        while (true) {
            switch ((((str.hashCode() ^ 911) ^ UiMessage.CommandToUi.Command_Type.FW_SET_LEFT_VALUE) ^ 905) ^ 1820419657) {
                case -1539287226:
                    titleView.setVisibilityRightImage(4);
                    str = "ۜۖۖۘ۬۠ۡۘۧۚۘ۠۟ۚۤۢۡۦۧۤۧۙۚۧۘ۠۫ۢۖۘۥۧۧ۠ۤۜۘۦۗۛ";
                    break;
                case -1142025843:
                    titleView.setleftImage(R.drawable.ic_back);
                    str = "ۛ۠۫۬ۨۖۦ۬ۛۖۢۖۘۛۦۦۘ۟۠۬ۤ۠ۨۘۡ۟ۥۘ۠ۦۖۛ۬ۗۧۨ۬ۗۥۨۘۢۧۜۘۨۥۨۗۢۤۘۡۖۧۦۢ۫ۤ";
                    break;
                case -123049126:
                    titleView.setOnLeftImageViewListener(new OooO0o(this, null));
                    str = "ۖۚ۠ۘۡ۫ۖۢۚۙۖۥ۫ۥ۟۟ۨۗۙۗۜ۫ۖ۟ۖۗۙۗۖۦۘۦۦۜۖۢۦۘۥۦۨۘۡۗۡۙۥۜۘۥۛۧ";
                    break;
                case 110225776:
                    return;
                case 342112702:
                    titleView.setTitleText(getString(R.string.sweep_code_register_code));
                    str = "ۛۚۖۘۘۧ۬ۛۦۖۨۘۧۘۚۨۗۡۢۖۘۗۢۖۙۨۛ۫ۧۛۤۧۘۘۖ۟ۙ۬۠ۘۘۜۗۥۙۥۦۘ";
                    break;
                case 1649128648:
                    str = "ۘۦۤۗۙۦۦۥۦ۠ۦۜ۫۠ۡۦۖ۟۬ۜ۬۟۠ۤۧۚۦۘۙۖۧۘۥۖ۠۬۬ۚۗۗۤۥۘۛۢ۠۫ۧ۟ۨ۠ۜ۬ۗۛ";
                    break;
                case 1815081223:
                    str = "ۡۨۜۘۗ۫ۗۥۜۡۘ۬ۥ۫ۘۢ۠ۡۚۖۤۖۖۡۘۚۨ۠ۤۜۡۘ";
                    titleView = (TitleView) findViewById(R.id.id_title);
                    break;
            }
        }
    }

    private void OooOO0o() {
        C4458v7 c4458v7 = null;
        String str = "۫ۚۢ۟۬ۢ۬ۛ۟ۡۦۢۗ۠۫۟ۧۜۤ۠ۚ۫ۢۜۛۧۥۘۘۚۢۜ۫۠ۜۡۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 341) ^ C4095le.o0000OO0) ^ 80) ^ 1710620646) {
                case 56663352:
                    return;
                case 77313557:
                    str = "ۨ۟ۡ۠ۤۘۢۖۨۘۡۡۥ۠ۦۡۚۦ۬ۛ۠ۨۤۚۚۢۙۖۜۨۜ۬۠ۥۛ۫ۖۥۢۥۘ۫ۦۗ";
                    break;
                case 1143800083:
                    c4458v7 = new C4458v7();
                    str = "ۜۛۦۗۙۢۥۖۥۘۡۥۦۙۧۦۘۜۢۤ۠ۡۙۢۘۚۧۛۗۚ۟ۦۘۙۛۙ۠۫ۗۚۡۨۙۨۘ";
                    break;
                case 1618674380:
                    c4458v7.OooO0Oo();
                    str = "۫ۘۘۧۢۜۦۧۘ۟ۢۛ۬۟ۚۨۚ۠ۜ۟ۦۘۤۚۦۘ۠ۨۥۘ۬۠۫۫ۜۤۤۘۨ";
                    break;
                case 1823720840:
                    this.Oooooo = c4458v7;
                    str = "ۙۛۡۘۗۘۢ۫ۗۜۧ۟ۘ۫ۨۧۘۢۨۧۘۛۢ۟ۘۛ۬ۦۧۨۘۘۘۤۙۖۛ۟ۜ";
                    break;
            }
        }
    }

    private void OooOOOO() {
        String str = "ۧۘ۬ۤۧۡۘۛۤۙۘۤۢ۬ۧۧۢۙۢۡۛ۟ۜۧۨۥۥۗۡۤ۟۫ۖۨ۫ۚۨۡۛۙۧۖۧۘ";
        while (true) {
            switch ((((str.hashCode() ^ 186) ^ 617) ^ 57) ^ (-255667384)) {
                case -1786936195:
                    return;
                case 1191410318:
                    str = "ۦ۬ۘۘۧۥۤۥ۟ۚ۟ۖۘۘۚۜۥۘ۠ۤۜۚۖۗۨۦۗۥۦۨۘۙ۠ۨۘۜۘ۠ۧۖ۠ۦۘۘۘ۬";
                    break;
                case 2109753849:
                    ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 99);
                    str = "۫ۗ۟ۧۗۘۘ۬ۚۧۙۢۨۘ۬ۚۦۘۨ۟ۥۘۡۜۘۘ۟ۢۦ۠ۚۢۗ۫۬";
                    break;
            }
        }
    }

    private void OooOOOo(String str) {
        String str2 = "ۛ۟ۦۖۦۥۡۗۘۘۖۙۡۧۧۤۨۤۥۙۡۧ۠ۢۦۧۨۡۘۤۢ۠ۡۥۘۨۘۗۧۘ۟ۦۨۘ";
        Intent intent = null;
        StringBuilder sb = null;
        PrintStream printStream = null;
        while (true) {
            switch ((((str2.hashCode() ^ 852) ^ C4095le.o0000O00) ^ 631) ^ (-80808734)) {
                case -2139553879:
                    sb.append("result:");
                    str2 = "ۙۧۥ۫ۚۥۘۥۖ۫ۗۚۢ۟ۡۘۛۧۦۘ۠ۗۧۛ۠ۧۤ۬ۢۨۜۘۥۡ۠ۗ۬ۤۤۨۡۘۖۥۨۘۚۛۜۘ۬ۡ۠ۡۘۖۖۛۤ";
                    break;
                case -2138769884:
                    sb.append(str);
                    str2 = "ۧۤ۟ۢۦ۟ۖ۟ۚۧۦۚۘۘۤۖۗۦۤۡۘ۟ۡۜۘۙۤۡۤۡۥۘۘۤ۫ۖ۟۠";
                    break;
                case -2001727656:
                    intent = new Intent();
                    str2 = "ۧ۟ۥۘۜۖۜۘۜ۬ۖۘۚۨۥۘۜۢۥۘۙۘۘ۫ۥۜۜۢۨۘۖۨۖ۬ۜۢۛۨۘۦۧۜۘۦۖۡۘۚۛۜۦۧۥۧۛۡ";
                    break;
                case -1791197634:
                    C3753c5.OooO0O0(this, R.string.sweep_error_tips);
                    str2 = "ۙ۬ۛۗۘۧۘۖۤۨۨ۠ۡ۟۠ۢ۬ۡۛۖ۠ۖۘۥۧۚ۟ۛۜۥۛۜۘ۟۟ۛۖۜۚۢۢ۬ۧ۫ۗ۟ۤۘۘۚۤ۫ۦ۠ۘۗۦۦ";
                    break;
                case -1685149691:
                    String str3 = "ۢۡۤۗۖۢۛۙ۫ۤۘۛۥ۬ۤۗۛۗۙ۟ۜۘۚ۠ۜۘۧۧۤۦۛۨۥ۟ۛۦۖۢۘ۠ۦۢۙۚ";
                    while (true) {
                        switch (str3.hashCode() ^ 2103555048) {
                            case -2035903129:
                                str2 = "ۡۤۗ۬۟ۧۛ۬ۦۘۜۧۢۖۥۖۚۧ۠ۜۢۥۡۨۡۘۡۦۛۤ۠۠";
                                continue;
                            case 539276340:
                                str2 = "ۛ۟ۦۘۡۙ۟ۘۘۘۘۜ۫ۧ۬ۜۘۦ۬ۢۜۘ۠۟ۙ۠۫ۜۖۤۘۖۦۖۘۙۥۧ";
                                continue;
                            case 994230207:
                                String str4 = "ۧۛ۬ۥ۬ۨۘۖ۟ۗ۠ۨۘۘۦۡۥۘۡۧۖۘۙ۠ۡۤۨ۫۬ۛ۫ۜۦۙۥۙۥۘ۟۟ۡۘ۟ۨۡۗ۬ۦ۫ۗۘۘۢۨ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-1341758474)) {
                                        case -1062717136:
                                            str4 = !TextUtils.isEmpty(str) ? "۫ۙ۠ۡۜۨۘۘۙۧۜۨۘ۫ۚۨۘۧۖۛ۫۟ۥۡۨۨۘۦۚۢۢۙۚۨۖۘۨ۠" : "ۙۥۘۢۙۖۘۘۗ۫۫ۚۛۗۘۚ۫ۖۘۦۨۡ۟ۜ۠ۖۡۘۤۗۖۘۚۙۖۛۦۘۗۨۦۘۙ۬ۖۘۦ۫ۦۡۦۡۘ";
                                            break;
                                        case 431738076:
                                            str3 = "ۛۛۡۘۡۨۖۘۡۘۤۢۢۡۘ۟ۛۡۙۘۨۘۥۤ۠ۢ۠ۘۘۚۗۧۛۚۖۘ";
                                            break;
                                        case 816004985:
                                            str4 = "۟۬ۜۘۜۙۧۢ۬ۧۖۖۢۢۧ۬۬۠ۦۘۨۧۥۚۡۖۧۗۜۘ۫ۥۡۤ۠۬ۢۚۥۤ۟۫ۖ۠ۛۙۥۖۘۛۙۛ";
                                            break;
                                        case 1271888208:
                                            str3 = "ۚۤۙ۫۫ۨۢۜۨۘۤۘۘۖ۠ۧۗۚۨۨۗۥۘۛ۠ۜۘ۠ۙۤۢۡۘۘۜ۫ۡ۟ۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1714534036:
                                str3 = "ۨ۬ۢۜۢۢۡۤۢۙۚۦۡۥۢۥۛۢۙۛۦۥۨ۬ۤ۠ۙۥۜ۟ۡۜۧ۟ۖۘۥ۠ۖۨ۠ۧۜ۟ۘۧۘۗۘۜۨ۠ۡۘ";
                                break;
                        }
                    }
                    break;
                case -1171517939:
                    str2 = "ۦۚۨۢۙۖۘۘۖۜۘۥۡۘۘ۠ۥۨۛۗ۬ۥ۟ۥۥ۠۫ۜۡۗۤ";
                    break;
                case 47602748:
                    intent.putExtra("SWEEP_RESULT_BACK", str);
                    str2 = "۫ۦۙ۬ۚۜۘۡۧۥۘۖۢ۬۠ۚۥۡۚۘۚۨۘۥ۫ۨۢۢ۬ۤۘ۟۠ۡۨۦ۫ۢ۟ۜۜ۬ۛۙۤۗۧۛۧۡۘۧۜۗۨۤۜ";
                    break;
                case 342379060:
                    str2 = "۬ۡۚ۟ۥۤۨۥۘۖ۫ۤ۬ۗۡۤ۠ۨۛۜۧ۫ۖ۟ۚۜۖۘۥۚ۬ۘ۠ۦۚۖۦۗۜۜۘۨۥۘۘ";
                    printStream = System.out;
                    break;
                case 922840242:
                    return;
                case 933084613:
                    finish();
                    str2 = "۬ۢۦۘ۟ۨۜۘۙۤۥۤ۫ۦۙ۟ۖ۠۬ۛ۫ۤۖۘ۟ۨ۟۠۫ۢ۠۟ۡۤۚۗۡۗۦۛۘۧۢۗۨۨۗۙۦۨ۠ۧۜۨۖۘۘ";
                    break;
                case 1048234487:
                    str2 = "ۙ۬ۛۗۘۧۘۖۤۨۨ۠ۡ۟۠ۢ۬ۡۛۖ۠ۖۘۥۧۚ۟ۛۜۥۛۜۘ۟۟ۛۖۜۚۢۢ۬ۧ۫ۗ۟ۤۘۘۚۤ۫ۦ۠ۘۗۦۦ";
                    break;
                case 1219772570:
                    printStream.println(sb.toString());
                    str2 = "ۨۧۥۘۘۡۜۙۥۦۥ۟۟۫ۛ۬۠ۦۤۘۤۡۡ۬۬ۧۦۡ۟۬۫";
                    break;
                case 1424120063:
                    str2 = "ۧۧۤۢۚۤۜ۠۫۫ۖۦۘۥۧۡۘۤ۬۟ۧۦۢۧۗۡ۬ۧۚ۠ۚۢۜۦۜۛۜ۫۬ۚ۟۫ۧۗ۠۠۬ۙۦۘ";
                    sb = new StringBuilder();
                    break;
                case 1424495705:
                    setResult(-1, intent);
                    str2 = "ۗ۠ۜۘۢۛۚۗۡ۬ۜ۟۬ۧۥۖۢۡۘ۫ۦ۟ۙۖ۟ۚۜۖۘۢۡۧۘ";
                    break;
                case 1683546389:
                    str2 = "ۦۗۙۙۨۡۢ۟ۖۘ۟ۛۘۘ۟ۗ۬ۨۥ۬۠ۛۘۧۘۗ۫ۖۘۤۤ۟ۢۥۛۛۧۛۛ۬۟۬ۥۜ۠۠ۖۘۤۙ";
                    break;
            }
        }
    }

    @Override // p285z2.C4458v7.OooO0O0
    public void OooO00o(String str) {
        Message messageObtainMessage = null;
        String str2 = "ۚ۠ۖۥۗۖۘۡۧۡۘۡ۠ۦۢۧۤۨۦ۟ۧۖۦۘ۠ۛۗۙۖۥۖۛۤۖۦۗۗۡ۠۠ۦۧۘۛۛۛۚۘۜۘۘۧۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 31) ^ 508) ^ UiMessage.CommandToUi.Command_Type.FW_SET_TEXT_VALUE) ^ (-2030394605)) {
                case -1700869968:
                    messageObtainMessage.what = 17;
                    str2 = "۬ۙ۠ۚ۠ۜ۠۫ۦۘۖۗۡۘۦۡۘۘ۬ۗۜ۫۫ۜۘۙ۬ۜۜۨۢۥ۬ۜۘۚۤ۬ۛۢۘۘ۬ۛۨۘۦ۟۫ۨۘۖۘۙۛ۬ۘۜۤۙ۬ۨ";
                    break;
                case -1592623003:
                    messageObtainMessage = this.o0OoOo0.obtainMessage();
                    str2 = "ۤۚۦۘ۬ۗۦۘۥۖ۠۬ۥۖۘۚۚۜۘۦۘ۫ۢۤۛۥۤ۟ۢ۟ۥۨۙ۠۟ۧۥۘ۟ۚۨ۠ۗۦۖۜۖ";
                    break;
                case -1430810887:
                    messageObtainMessage.obj = str;
                    str2 = "ۗ۬ۥ۬ۢ۫ۢۥۡۘۛ۫ۨۧۗۘۤۜۜ۠ۘۜۚۚۖ۬ۖ۟۬۠ۖۘ";
                    break;
                case -696065440:
                    str2 = "ۙۘ۟ۨۨ۬ۜۡۖۘ۠ۥۦۡۢۡۘ۫۫ۡۡۨۢۗۜ۫ۡۥ۬ۚۖۥۘ";
                    break;
                case -221493680:
                    str2 = "ۖۥۧ۠۠ۨۘۧۥ۬ۖۛۦۘۚۤۨۘۛۧۚۛۨۛۨ۠ۘۘۧ۠ۚۜۥۖۘ۠ۖۨۘۨۧۨۦۚۢۨۧۡۘ۬ۛ۫ۨۢ۬";
                    break;
                case -192181689:
                    return;
                case 2115127981:
                    this.o0OoOo0.sendMessage(messageObtainMessage);
                    str2 = "۫ۙۡۘۤۥۤۛ۟ۛۙۢۜ۫ۤۚۥۘۥ۟ۨۘۗۦۦۘ۫ۖ۫۟ۥۦۘ";
                    break;
            }
        }
    }

    public void OooOO0() {
        String str = "ۤۨۖۘ۠ۘۙ۠ۘۚۧۦۛۦ۫ۨۘۦۧۨۖۥۗۧ۟ۚۧۘۥۛۥۨۘۨۥۖۘ۫ۢۛ";
        while (true) {
            switch ((((str.hashCode() ^ 762) ^ 549) ^ 911) ^ 1720463412) {
                case 975870714:
                    OooOO0o();
                    str = "۟ۘۨۘۘۗۖۛ۫ۚۢ۫ۙۛ۫ۘۘۜۘۖ۠ۢۦۢۦۧۘۛۙۛ۟ۗۖ";
                    break;
                case 1545991008:
                    return;
                case 1704548074:
                    str = "ۖۥۙۦۗۥۘ۟ۙۘۘۦۜۨۘ۠ۨۜۧۦۖۘۘۦۗۗۙۙۜۨۖ۟ۙۘ۠ۥۗ۟ۥۥۨۚۜۘۙۛۡۘ۬ۥۡۘۛۘۥۘۦۚۥۘۘۖ۠";
                    break;
            }
        }
    }

    public void OooOOO(byte[] bArr, Camera camera, View view) {
        C4458v7 c4458v7 = null;
        String str = "ۘۖۙۧۛ۫ۛۙۘۘ۟ۧۡۘۘۦ۬ۚۛۖۘۙۖۨ۟۬ۜۚۙۡۘۘۨۦۢۦۖۗۡۘۘۛۚ۠ۨۜۥ";
        while (true) {
            switch ((((str.hashCode() ^ 586) ^ 922) ^ 858) ^ 570425194) {
                case -2055344104:
                    str = "۠ۦۖۘۛۖۛۗ۠ۤۛۙۚ۠۫ۡۘۦ۫ۜۦۧۛۥ۟ۡۙۚۥۘۗۨۚۢۗۙۘۘۢۧ۟ۘۘۘۚ۬ۗۧۙ۟ۗۦۘ";
                    break;
                case -1593942469:
                    c4458v7 = this.Oooooo;
                    str = "ۨۜۢۛۦۘۖ۫ۨۨۡ۟ۗۡۘ۬ۧۜۜۥۘ۠ۗۛۗۢۤۤۛ۬ۖۜۙۚۨۘۘۤ۠ۖ۟ۖۘ";
                    break;
                case -1210821806:
                    String str2 = "ۧۢ۫۫۬ۨۘۚۢۘۨۡۨۘۘۦۚۖۡۧۖۥۢۘۦۜۘ۠ۡۧۘۥۛۛ";
                    while (true) {
                        switch (str2.hashCode() ^ 364093260) {
                            case -1836121006:
                                String str3 = "ۥۤۙۦۘۛۥۡۤۧۖۤۡۚۗ۫ۥۧۨۚۜ۬ۡۖۘۙ۬۟ۡۨۜ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1630305113)) {
                                        case -1831159998:
                                            str3 = "ۗۚۢۤۖۨۤۖۘۡۨۜۘۨ۠ۤۛ۠ۖۘۡۤۥۘۧۦۢۙۖۡۗ۠ۜۘ";
                                            break;
                                        case -479764667:
                                            str2 = "ۘۜۖ۠۬ۡۡۛ۟ۘۤۛۥۢۛۚۗۦۧۜۧۖۨۦۙۨۡۚۖۗۗۧۗۢۚۡۘۖۢۦۘۢۚ۟ۛۤۨۘ۠ۗۚۤۜۘۙۡ";
                                            break;
                                        case -66541896:
                                            str3 = c4458v7 != null ? "ۦۦ۫ۧۚۖۡۤ۠ۜ۟ۨۘۤۧۨۗۘۢۨ۫ۥ۠ۥۚۡۙ۫ۜۖۘۢۜۚۙۧۡ" : "ۢۦ۬ۢۧۚ۫ۨۡۨۢۧۙ۫ۗۙۧۚ۟ۡ۠ۡۧۥۘ۫۬ۥۘۦۧۥۘ";
                                            break;
                                        case 1611306106:
                                            str2 = "۠ۖۨۧۥۘۘۥۛۖۥۡ۬ۖۘۥۧۙۗ۫ۘۧ۟ۧۤۜۘۚ۟ۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case -1396807328:
                                str = "ۡ۬۫ۛۥۧۙۙۖۘۛۚۖ۠۟ۡۧۛۜۨ۠ۛۜۜۗۗ۠ۖۘۧۙۙ۟ۜۧۚۜۧ";
                                continue;
                            case -1093701256:
                                str = "ۗۦۦۘۥۚۢۥۥۛۘۢۨۙۚ۬۬۫ۖۡ۠ۛۖ۬ۖۤۥۘ۬۠ۡۙۚ۫۟ۚ۫ۦۧۜۘۙۘۘ۫ۙۖۘۨۡ۟";
                                continue;
                            case -812442832:
                                str2 = "ۤ۬ۢۦ۟ۜۘۥۘ۟ۧ۟ۖ۠ۥۙ۟ۤۤۖۢۛۖۙۡۨۜۛ";
                                break;
                        }
                    }
                    break;
                case -1158692962:
                    String str4 = "ۘ۠ۦۘۢۜۚ۫۬ۚۚۥۜ۠ۘۚۜۦۘۦۜ۬ۚۗۦۜۘۘ۟ۖۢ۟ۖۨۥۘۦۧ۟ۧ۫ۜۙ۬۟ۡۘۦۧۖۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-19558349)) {
                            case -957233177:
                                String str5 = "۬ۜۡۘۤ۫ۨۘ۠ۨۜۘ۟ۗۘۚۢۧۛۜۖۧۥۙ۫۬ۡۘۜۨۜۘۖۗۡۘ۫۠ۜۘۢۧۤۥ۫ۘ۬۟ۥۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-182377585)) {
                                        case -1407359834:
                                            str5 = this.OoooooO ? "ۥۤۥۘۛۦۙۗ۟۠ۜۜ۫ۢۚۨۙۗۘۗۘۘۦۘۗۤۖۦۦۡۙۚ۠ۖۤۖۨۡۜۥ۠ۜۘ" : "۠ۦۧۘ۬ۦۦۦۢ۟۠ۖۨۜۘۚ۟ۧۨ۫ۜۦۗۜۢۙۥۙۙۧ۬۬ۨۘ۫ۦۖۢۙ۠ۚۛ۬";
                                            break;
                                        case -972062426:
                                            str5 = "ۘ۫ۢ۫ۤۧ۫۟ۗۦۥ۠ۢۦۘۙۤۨۘۖ۠ۡۢۘۡۘۥۧۘۖۛۜۡۥۜۧ";
                                            break;
                                        case -483769011:
                                            str4 = "ۚۙۡۧۥ۟ۛۥۢ۫ۧۨۡۡۥۘۛۘۗ۫ۦۘ۟ۡۜۘۢۖۗۛۙۜۘۧۤۦۘۦۚۥ";
                                            break;
                                        case 689508783:
                                            str4 = "۬ۤۦۘ۠۫۠۠ۜ۬ۨ۫ۡۧۗۤۨۢۨۨۧۗ۫ۧۦۘ۫ۖۧۘۛۜۜۧۛۤ۫ۨۨ۬ۗۜۙ۟ۖۗۙۘۚۛۢ";
                                            break;
                                    }
                                }
                                break;
                            case 686052032:
                                str = "ۥۙ۟ۤ۫ۦۘ۟ۨۙ۟ۚ۟۠ۡۘۘۗۤۥۘۨۗۦ۠ۖۜۥۘۙ۠ۨ۠ۢۜۛۨۦۘۨ۟ۥۛۦۥۘۥۥۦۘ۫ۨۙ";
                                continue;
                            case 778757346:
                                str = "ۤۢ۫ۤۧۗۙۛۡۘۗۡۦ۟ۤ۬ۦۗۢۖۡۗۚۛ۟ۗ۟ۚۦ۬ۖۘۙۡۨ۟۟ۛۖ۟ۚ۟ۖۦ";
                                continue;
                            case 1294232575:
                                str4 = "ۜ۬ۡۧۡۜۖۘۖۘۥۖ۠ۚ۠ۜۘۙ۫۫ۖۨۚۙۛۙۤۛۧۦۗۨۧۥۨۘۢۥۥۘ۠ۢۚۨۚۦ";
                                break;
                        }
                    }
                    break;
                case -1017997525:
                    str = "ۥ۬ۖۦ۫ۧۖۙۨ۟ۦۙۨۥۦۤۘۧۘۗۤۘ۫ۢۥۥۧۡۘ۠۫ۖۘۚۙۘۥۗۗ۫۫ۛۜۧ۬";
                    break;
                case -741243835:
                    this.OoooooO = true;
                    str = "ۛۢۨۥۥۨۘۘۦۦۖ۫ۘ۠ۜۧۘ۠ۚۘ۬ۛۙ۟ۘ۬ۗۚۖۤۘۖۜۗ۠ۧ۬۠";
                    break;
                case -452749597:
                    c4458v7.OooO0o(bArr, camera, view, this);
                    str = "ۗۦۦۘۥۚۢۥۥۛۘۢۨۙۚ۬۬۫ۖۡ۠ۛۖ۬ۖۤۥۘ۬۠ۡۙۚ۫۟ۚ۫ۦۧۜۘۙۘۘ۫ۙۖۘۨۡ۟";
                    break;
                case -167148171:
                case 932389617:
                    return;
                case 584590037:
                    str = "ۙۥ۬ۛۡۘۛۛ۫ۖ۫ۖۥۧ۟ۤۥۖۘۙۢ۟ۦۦ۠ۗۢۥۘ۠ۙۚۛۛۜۦۧۚ۫ۙۘۧۙ";
                    break;
                case 1394738505:
                    str = "ۡۧۥۛۜۡۘ۫ۘۨۘ۟ۦۚۥۜۛ۠ۤۙۛۗ۫ۛۜۖۖۗۦۘۘ۠ۖ۠ۚۢۖۢ۫۬ۧ۟ۛ۟ۡ";
                    break;
            }
        }
    }

    public void OooOOO0() {
        String str = "۬ۙۤۙۧۗۘۧۘۘۜۢۘ۟ۙۜۘۗۥۘۢۚۤۙۛۛۖ۬ۚ۟ۦۡ۬ۦۛۢۖۧۦۛۡۘۗ۬ۖ";
        while (true) {
            switch ((((str.hashCode() ^ 529) ^ 219) ^ UiMessage.CommandToUi.Command_Type.SET_CHECK_BOX_VALUE) ^ 992941464) {
                case -1965389182:
                    str = "ۦۜۘۙۙۛ۠ۘۡۘ۠ۗۢۦۗۜۘ۫ۡۨۘ۬ۗ۬ۤۘۙۗۗۘۦۖۥۡۡ۬ۙۚ۠۫ۥۡ۠ۥۛۙۘۥۧۜۤ";
                    break;
                case -1874438467:
                    String str2 = "۟ۢۨۥۘۡۘۦۢۙ۟ۦۦۘۥ۬۠ۘۜۧۘۙ۫ۖۖۛ۫ۘۧۖۘۧ۫۫ۢۗۜۚۥۨ";
                    while (true) {
                        switch (str2.hashCode() ^ (-571158362)) {
                            case -1428616575:
                                str2 = "ۢۚۚۧ۬ۡۘۦ۬ۥۖ۠ۛ۟ۖۛۥۖۦۘۢۥ۬ۤ۟ۥۙۛۡۥۡۘۦۜ۟۟ۜۤ";
                                break;
                            case -235717051:
                                String str3 = "ۗۚۨ۫ۗۚ۬ۦ۬ۥۥۚ۬ۗۗ۟ۘۢۖۥۧۤۦۘۥۦۦۘ۠ۖۙ۟ۧۘۘۚۧۦۖ۟۟ۘۘۨۛ۬۬ۛۛۢ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1022592080) {
                                        case -1528109715:
                                            str3 = "ۧۤۨۘ۟ۦۗۘۗۧۤۗۨۛۦۖۘ۠ۥۧۘۤۡۙۤ۟ۥ۟۠ۦۤۚۚۡۦۘۧۚۥۘ";
                                            break;
                                        case -840557943:
                                            str2 = "ۡۤۖۘ۫ۨ۟ۛۛۖۘۚۥۙ۠۠ۗۤۗ۟ۙۨۥۘۚ۫ۖ۬ۚۜۡ۟ۥۚۘۧۘۡۡۡۘ۬ۚۖۘۚ۠ۥۘ";
                                            break;
                                        case 454791862:
                                            str3 = this.ooOO ? "ۡۢۥۘۘۗۨۘۘۚ۠ۘۥۘۥۘۦ۠ۥۙۙۚۜ۠ۗۢۘۢۙ۬ۛ" : "ۦۗۛۖۨۥۛ۠ۧۙۜۥۘۧۙ۬ۥ۟ۤۘۨۜۘۧۘۦۗ۫ۢۨ۬ۚ۟ۨۘ۬ۦۘ۠ۦۢ۟ۖ۠ۖۛۖۥۙۗۖۦۜۘۜۖۖۘ";
                                            break;
                                        case 1254852504:
                                            str2 = "ۨۜۧۘۛۧۖۦۗۢۥۥۡۡۗۘۘ۠ۡۘۙۨۧۘۨۤۙ۬ۤ۟ۙۤۖۘۘ۫۬ۡۘۜۤۛۥۢۡۢ۟ۗۘۥۨۧۘۧۢۤۢ۬ۧ";
                                            break;
                                    }
                                }
                                break;
                            case 204168245:
                                str = "ۚۖۥۖۤۧۨۥۖۙۨۦۛۥۘۘۖ۠ۜۘ۟ۗ۟۫ۧۤۗۙۜۗۡۖۖۦۘ۟ۢۜۘ۫ۨۦۚۘۖ۫ۛۗۦۥۘۨۜۘ۟۬ۤ";
                                continue;
                            case 2108991778:
                                str = "ۧۘ۟۠ۢۡۘ۟ۜۜ۬۟۬۟ۛۘۙۘۘۢ۫ۗۗۙۜۨۗۖۢۗ۫۟۟ۖۛۦ";
                                continue;
                        }
                    }
                    break;
                case -1375586601:
                    this.ooOO = true;
                    str = "ۖۙ۠۫ۗۨۧۖۡۗۖۖۘۦۘۛۥۘۖۢۡۘۛ۬۟ۤۨۘۨۡۨۦۖۤۖۦۡۘ";
                    break;
                case 863307074:
                    C4384t7.OooO().OooOO0();
                    str = "ۦ۟ۘ۠ۖ۫ۡۨۧ۟ۚۥ۟ۖۖ۟ۗۨۛۥۢ۠ۛۧۥۨ۟۫ۢ۠۫۬ۘ۟ۢ۠ۖۦۙۜۨۤ۟ۢۥۚۚۚ۫ۦۜۦ";
                    break;
                case 1517209300:
                    str = "ۦ۟ۘ۠ۖ۫ۡۨۧ۟ۚۥ۟ۖۖ۟ۗۨۛۥۢ۠ۛۧۥۨ۟۫ۢ۠۫۬ۘ۟ۢ۠ۖۦۙۜۨۤ۟ۢۥۚۚۚ۫ۦۜۦ";
                    break;
                case 1597241243:
                    return;
                case 1869581333:
                    this.ooOO = false;
                    str = "۠ۗۢۚۥۦۗۜ۬ۘۡۦۘۚۗ۠ۢۜۥۧۥۧۘ۬ۨۚۥۙ۬ۢۥۗ۠ۚۖۢ۟ۦۨۗۡۗۘۘۧۚۙۢۡۘۗۧۘۘۙۙۦۘ";
                    break;
                case 1935297671:
                    C4384t7.OooO().OooOO0O();
                    str = "ۡۧ۠ۘ۬ۡۙ۠ۥۜ۫ۛۖ۬۠ۘۙۘۢۚۦ۫ۥۙۜۦۘۥۡۖۘۗۖۜۘ۫ۦ۟۟۬ۜۘۢۥۢۥۧۦۙۧۡۧ۬ۜۘۦۜ۫";
                    break;
            }
        }
    }

    @Override // p285z2.C4458v7.OooO0O0
    public void error() {
        String str = "ۜۡۡۡۡۘۘ۫ۦۛۘۛۖۘ۫ۜۡ۬ۡۡ۟۠ۜۚۚۦۘۗ۠ۙۚ۠ۢۦۢ۬ۦۛۜۧۥۙۨۙۡۘ۟ۖۖۦۥۖۚۡۚۘۜۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 350) ^ 769) ^ 535) ^ (-947810496)) {
                case -1341433198:
                    str = "۠ۦۡۨۚۙۗۥۜۢۗ۬۠ۙۘۗ۬ۗۥۥۘۛ۬۬ۦۡۜۙۦۘۦۚۨۘۡۦۨۘ۬ۧۥۘۙۗۜۜۦۖۘۙۥۦۖۥۥۘۙ۫ۨ";
                    break;
                case -894457114:
                    return;
                case -868575792:
                    this.OoooooO = false;
                    str = "ۢۡ۠ۘۢۗۢۜۨۛۥۘۘۖۜۢۗۖۛ۫ۨۖۛ۠ۛۛۥۥۥۡ";
                    break;
            }
        }
    }

    public void initView() {
        String str = "ۤۜۡۘۙۥۗ۟ۡۘۦۚ۠ۧۧ۫ۥۖۡ۬ۨۖۦۡۖۢ۟ۨۘۤۨۦۘ";
        TranslateAnimation translateAnimation = null;
        int i = 0;
        RelativeLayout.LayoutParams layoutParams = null;
        int i2 = 0;
        while (true) {
            switch ((((str.hashCode() ^ C4095le.o0000O00) ^ 397) ^ 327) ^ (-2117565991)) {
                case -2130855825:
                    translateAnimation.setRepeatMode(2);
                    str = "ۖۧۙۜۘۥۘۘ۟ۘ۬ۨۦۘۢۢۖۘۥۗۗۚ۠ۡۘۨۡۜۚۘ۬ۢۙۦۛۚ۬ۥۙۙۢۙۥۡ۫ۨ۟۠ۚۡۡۖۘ";
                    break;
                case -2004975597:
                    translateAnimation.setRepeatCount(-1);
                    str = "۫ۡۧۘۥ۫ۨۘۘۨۜۘۘۛ۫ۚۨ۬ۥۛۦۙ۫ۤۢۚۤ۟۫ۚۗ۬ۗۤۘ۠ۘۖۨۙ۬ۢ۬ۚۧۜ۠ۤۙۚ۫ۧۖۘۨ۫ۥۘ";
                    break;
                case -1909484218:
                    translateAnimation.setInterpolator(new LinearInterpolator());
                    str = "ۧ۟ۗۤ۫ۡۘۛۨۜۘۨ۟ۦ۫ۧ۠۬ۦۚ۠ۥۜۦۥۘۘۙ۫ۡۖۙۥۧۦۡۧۚۘۘۥ۬ۚۗۚ۫۟ۙۥۘۦۥۙۙۡۘۡۢۦۘ";
                    break;
                case -1842370199:
                    this.OooooOO = (RelativeLayout) findViewById(R.id.capture_crop_layout);
                    str = "ۦۚۙۧۜۧۘۗۥۡۘۖۡۚۥۙۨۘۡۛۡ۠ۘۘۥۘۗۦۦۗۥۡۡ۠۫ۛۥۡۗ";
                    break;
                case -1727635565:
                    return;
                case -1520920437:
                    str = "۟ۜۘۘۖۧۘ۠ۦۧۘۥ۫ۖۘۜۡۨ۫۟ۥ۟ۖۥۥۘۛۧ۠ۘۚۤۥۘۤۦۘۘۥۛۥۚۨ۫ۗ۫ۨۘۙۤۥۖۛۤۢ۬ۢۛ";
                    translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 2, 0.0f, 2, 0.9f);
                    break;
                case -1144717605:
                    this.OooooOO.setLayoutParams(layoutParams);
                    str = "۫ۧۜۘۥۧۘۘۡ۫ۤۥۜ۬ۛۙۦۘۜ۟ۢۦۛۛۘ۫ۖۘۗۖ۠ۡ۟ۚۗۗۛۖۘۤ۟ۗۛۜ۫ۧۗۦۘۘۦۡۦ";
                    break;
                case -1054337350:
                    str = "ۜۨۚۖ۟ۖۘۤۜۡۘ۠ۚۧۚۛۖۚۜۤۗۤ۠ۤۨ۬۬ۜۦۗۡۢۘۡۘۧۥۨۘۘ۫ۛۗۦۖۘۚۚۗۤۚ۬ۛۗۥۙۢۧ";
                    break;
                case -442113864:
                    this.Oooooo0 = (FrameLayout) findViewById(R.id.capture_preview);
                    str = "ۛۤ۠ۨۘۚۖۤۥۙۥۗۗ۫ۚۖ۟ۧۙ۫ۦۘ۫ۤۛۗۥۡۘۧ۟۠ۧۗۖۘ۠ۘۨ";
                    break;
                case -373951392:
                    str = "ۢۢ۫ۘۧۘۘۨ۟۠ۗۨۗۡ۠ۦۘ۬ۤۡ۫ۗ۬ۘۜۡۛۤۛ۫ۛ۠ۦۡۢۤۨۡ";
                    i2 = getResources().getDisplayMetrics().widthPixels;
                    break;
                case -215802893:
                    str = "ۙۤۡۘۖۚۘۜۗۛ۫ۚۡۘۧ۟ۡۗۥۘ۠ۧۗ۫ۘۦۘۜۘۖۗۤ۬ۘۥۙۜ۫ۗۖۖۖۘۖۧۖۙ۬ۡۘ۠ۚۛ";
                    layoutParams = (RelativeLayout.LayoutParams) this.OooooOO.getLayoutParams();
                    break;
                case -203066658:
                    ((LinearLayout) findViewById(R.id.linear_open_light)).setOnClickListener(new OooO0OO(this));
                    str = "ۥۖۥۘۤۢۢۡۤۢۚۤۡ۠ۨۖۘۡۜۢۡۗۢ۫ۜ۠ۦ۬ۥ۬ۖۜۘۥۚۧۡ۬ۦۘ";
                    break;
                case -171648826:
                    translateAnimation.setDuration(1500L);
                    str = "ۘۢۡۚۦۧۘۖۛۧۦۢۤۡۨۤۢۦۛ۟۟ۨۘ۬ۜ۫۫ۛۡۜ۟ۥۡۦۤ۫۫ۤۢۛۖۤۦ";
                    break;
                case 29858379:
                    layoutParams.height = i;
                    str = "ۨۤۘۘۖ۠ۘۨۥۢۡۥ۫ۖۦ۠۠۠ۡ۫ۦۨ۬ۙۚۥۜۥۢۢۜۘۢۛ۬۟ۛۡۘۥۦۦۘۜۚۧۘۜۙ۫ۥ";
                    break;
                case 954440829:
                    this.OooooOo.setAnimation(translateAnimation);
                    str = "ۦ۠ۡۘۜۛۧ۬ۤۛ۬۠ۛۨۘ۬ۜۢ۠ۥۜۧۗۗۗۖۗۚۡۛ۟ۢۡۜۘۜۥ۟ۖ۟۠ۤۦۨ۠ۘۤۖۧ";
                    break;
                case 1166378619:
                    this.OooooO0 = (RelativeLayout) findViewById(R.id.capture_containter);
                    str = "ۤ۟۠۠۬ۨۢۥۥۘۘ۟ۨ۟۬ۛۡۤۥ۬۠ۨۘۚۥۥۘ۬۠ۘۛۡۚۥۘۨ۠ۢۡ۫ۛۧۡۖ";
                    break;
                case 1206562766:
                    str = "ۡۧۦۛۜۛۤۙۖۖۧۘۘ۠ۤ۬۫ۨۘۜ۟ۚ۟۬ۨۗۡۚۛۦۘۘۡۦۛۚۥۧۘۡۤ۫۟ۙۙۡۡۦۘ";
                    i = (i2 * 2) / 3;
                    break;
                case 1492079013:
                    this.OooooOo = (ImageView) findViewById(R.id.capture_scan_line);
                    str = "ۖ۟ۨۘۦۥۥ۫ۜۦۤۜۢۥۖۡ۠ۜۢۜ۠ۜۡ۟ۚۧۧۨۛ۬ۛۢۥۘۜۖۧۙۥ۬۬ۚۡۥۤۜۘۥۨۦۜۚ۬ۛۚۘ";
                    break;
                case 2092389070:
                    layoutParams.width = i;
                    str = "ۤۗۥۛۨۡۗۦ۫ۘۢۖۜۜۨۘۘۖۢۙ۟ۗۚۗۨۘۚ۠۠۫ۧۨۘ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۚۦ۠ۛۢۙ۬ۚۘۘۘ۬۟ۛۨۥۘۨۗ۟ۡ۬ۤۡ۟ۨۨ۟ۡۨۥۛ۫ۡۖۡۧۦۘۢۢۙۡۖۘۜ۟۟ۡۢۧۚۧ۬۫ۡۨ";
        boolean z = false;
        boolean z3 = false;
        while (true) {
            switch ((((str.hashCode() ^ 943) ^ 300) ^ 924) ^ (-1926570727)) {
                case -2064578993:
                    str = "۫ۚ۟ۜۘ۫۫ۤۜۨ۟ۦۘۘۚۗۙ۫ۨۚۛۖۘۙۡۙۦۧۛۥ۠ۘۘۧۗۡۘۤۥۦۘۚ۫ۘۘۦۗۖۘ";
                    break;
                case -1838893703:
                    String str2 = "ۖۧۙۨۖۧۙ۟ۤۙ۬ۥۙۤ۟۠ۡۧ۬ۗۦۥۛۖۨۚۗۤ۠ۤۤ۬ۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 881363925) {
                            case -1400139691:
                                str2 = "ۢۜۚۖۛۦۗ۠۟ۖۘۛۤۦۖۘ۟ۡۧۘۚۜۜۧ۬ۜۙۖۘ۠ۢ۫ۢۜۥۗ۠ۥۗ۠ۜۘۙۙۥۘۛۤۘۘۤۗۜ";
                                break;
                            case -1235876756:
                                String str3 = "ۖ۠ۘۘۤ۫ۜۡۛ۟ۧۖۥۤۘۘۗۗۦ۠ۥ۠۟۟ۛۡۤۥۘۤ۫ۢۚ۬۬ۚۜۗ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-333622549)) {
                                        case -2059137879:
                                            str3 = !z ? "ۨۤۦۘۨۢۡۘۖۡۧۘۦۡۚۜۗۥۥۥ۟ۦۡۡ۬ۛۗۤۜۦۡۜۡۘ" : "ۘۜ۬ۢۗۤۘۨۜ۫ۤۖۘۘۜ۠۠ۘۡۧ۫ۨۘۧۗۨۙ۟ۜۘۚۚ۫۬ۥۦۤۙۜۘۖۨۥۘۥۦۘۘۢۜۨۘۨۢ۫";
                                            break;
                                        case -1010143202:
                                            str2 = "ۧۜۦۘۧۚۥۘ۟ۚۨۘۘۥۧۚۧۚ۫ۡۤۧۦۨۘۦ۫ۡۘۧۜۧۘۛۜ۟۠ۜۧۨۤۦۘۙۡۘۘۥۡۦۚۢۘۘۚۖ۠۟۠ۡۘۙۡۧۘ";
                                            break;
                                        case -785274245:
                                            str2 = "ۤۦۧۥ۠ۘۥ۫ۥۢۨۘۦۡۦ۬ۖۦۘۗ۠۬ۧۨۜۜۤۘۘۛۗۖ۟ۨۥۘ۠۬ۦ";
                                            break;
                                        case 2107654382:
                                            str3 = "۬ۘۥۘ۫ۡۧ۫ۡۨۜۢ۫۫ۘۥۗ۟ۚ۟ۦۘۢۧۥۦۦ۠۠ۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case 296399588:
                                str = "ۖۖۢۥۥۨ۬۟ۗۨۡۖۘۛۜۖۘۤۗۙۢۦۨۘۘۥۚۨۢۦ۠۫ۖۘۛۙۥۦۙۡۘۙۨۘۤ۠ۤۦ۬ۚۜ۬۫";
                                continue;
                            case 1006154991:
                                str = "ۜۗ۟ۦۚۘۛۦۖۘ۬۠ۥۘۛ۟۫ۨۛۡ۠ۧۖۘۜۜۘۜۡۧۖۚۨۘ";
                                continue;
                        }
                    }
                    break;
                case -1535876032:
                    str = "ۚۖۜۘۗۚۥۘۤۜۧۘۡ۠ۡۘۥۙۡۛۗ۫۟ۥۥۘۜۤۥۢۖۖۥۤۦۤ۠ۜۘۗ۬ۗۥۙ۟۟ۥ";
                    break;
                case -1506721538:
                    OooOO0O();
                    str = "ۦۦۤۧ۬ۚۨۗۙۤۨۜۨ۬ۤۜ۟۠ۥ۬ۗۜۛ۠ۜ۠ۜۜ۠ۛۥۘۘۡۥۥۘ";
                    break;
                case -918917873:
                    super.onCreate(bundle);
                    str = "ۗۤۦۦ۬ۘۘۧۖۧۚ۟ۚۙۨۚۚۛۤ۟۬ۥۘۦۡۙۙ۬ۦۘ۠ۖۜۘ";
                    break;
                case -794958443:
                    str = "۫ۦۖۙ۠ۖۘ۟ۡۛۚۗۖۘۜۨۧ۠۫ۡۘۖۗ۟ۡ۫۠ۗ۬ۡۘۚۦۨۘ";
                    break;
                case -771104988:
                    str = "ۢۦۜۘۚۜ۬ۗۖۦۗۜۥۛ۟ۧ۫۫۟ۨۚۜۘۛ۬ۙ۬ۢۖۘۦۨۡۘۛۖۚۖۦۥۘۗ۬ۦۡۨۥ۠ۛۚۧۜۖۘۡۦۘۚۛ۠";
                    break;
                case -665963157:
                    OooOOOO();
                    str = "ۥۜ۫۫ۤۙۙۨۘۘ۠۠ۙ۬۬۟ۚ۫ۢۖۤۡ۠ۘۦۖۦۢ۠ۦۡۨۙ۟ۡۜۖ";
                    break;
                case -563757401:
                    str = "۠ۥ۬ۜۧۘۘ۠ۢۢۤۦۧۢۤۨۘ۬ۢۖۘۥۜۡۘۢۢۨۘۨۨۢۖۚ۟ۡۗ۟۠ۡۘ";
                    break;
                case 309443680:
                    return;
                case 368474859:
                    z3 = true;
                    str = "۟ۤۛۡ۟ۘۘۥۦ۫ۜ۟ۘۨۥۢۗۚۦۘۦ۠ۨۙۜۘۦۡۖۦۚۜۜۚۚ۟ۨ۟۟ۜۨۙۚۘ";
                    break;
                case 431997831:
                    str = "ۢۦۜۘۚۜ۬ۗۖۦۗۜۥۛ۟ۧ۫۫۟ۨۚۜۘۛ۬ۙ۬ۢۖۘۦۨۡۘۛۖۚۖۦۥۘۗ۬ۦۡۨۥ۠ۛۚۧۜۖۘۡۦۘۚۛ۠";
                    z = false;
                    break;
                case 781008565:
                    String str4 = "ۡۚۨۘۗۨۘۘۤۖۧۘۡۥ۠ۡۨۡۚۙۛۘۥۛۖ۟ۨۘۨ۬۟ۛۜ۬ۜ۠ۢۜۜۖۤۘ۫ۦۧۧۥۖۨۘ۠ۙۧ";
                    while (true) {
                        switch (str4.hashCode() ^ (-976200408)) {
                            case -2111547387:
                                str = "ۦ۟ۡۘۦ۟ۘۘۖۤۡۜۛۙۦۖۛۢۖۘۜ۫ۖۚۘۥۦۦۥۘۗۛ۫۬ۨۡۡۘۘ۫ۛۢ۟ۛ۬۠ۛۛۦ۟۫۠ۖۚ";
                                continue;
                            case 475718872:
                                String str5 = "ۖ۬ۖۗۖۤۤ۬۬ۘۚۛۨۨۘ۫ۜۦۘۤۗۖۗۦۧۘۙۤۦۘۡۘ۫ۡ۬ۥۘ۬ۙۡۧۨ۬ۘۦۖۘ۫ۜۥۜۡۛۤ۫ۘۘۧۙ۬";
                                while (true) {
                                    switch (str5.hashCode() ^ 701485249) {
                                        case -321728330:
                                            str5 = ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0 ? "ۘ۬ۢۘۚۗۖ۠ۘۖۛۦۘۛۥۖۘۥ۬ۚۗۖۗ۫ۤۛۧۨۥۘۚۦ۫ۨۖۦۛۡ۬ۙ۫ۨۘۛۢۡۘ۟۠ۢۛۥۘۘۥۖۖۘۚۥۧۘ" : "ۧۧۢ۟ۙ۬ۜۗ۠۬ۙۖ۬۟ۘۢۧۗۘۨ۫ۜۨۘۚۦۖۥۜۦۘۙۙۛۚۦۥۘ۟۠ۜۘۘۢۘ";
                                            break;
                                        case 65559957:
                                            str5 = "ۢۥ۟۫ۚۗ۫ۚ۟۟۬ۙۥۡۛ۫ۤۚۚۥۛۢۛۗ۟۬ۛۙ۫ۥۤۗۛۗ۬ۛۘۡۖۨ۠۠";
                                            break;
                                        case 337158393:
                                            str4 = "ۥ۬ۚۘۙۨۚۛۘۥۗۡۘۖۡۢۦۗۙۢۦۛۤۜۗۗ۫۠ۖۦۖۘۤۢۦۘۙ۫ۡۘ۠۬ۦۘۘ۠ۚۢۗ۠ۢۡۗۛ۫ۨۧۗۖۘ";
                                            break;
                                        case 2069453271:
                                            str4 = "ۘۡۥۚۚۡۘ۬ۖۜۘ۬۬ۘ۬۟ۡۢۤ۟ۚۙۢۖۡۘ۬۟ۜۧۖۙۦۛ۠ۥۨۘۖ۟ۡۗۢۖۤۢۡۧۡ۬";
                                            break;
                                    }
                                }
                                break;
                            case 657581459:
                                str = "۬۫ۨۤۛۖۚۧۦۘۚ۫ۚۥۢۨۘۙۜ۬۫ۛۦۘۥۚ۬۬ۖۚ۠ۧ۬ۗۙۘۘ۬ۗۢۦۨۘۘۙۥۜۘ۬ۙۖۛۜۚۖۧ۠ۘۨۘ";
                                continue;
                            case 1184834893:
                                str4 = "ۛ۬ۜۘۦۘۥۡۖۥۜۨۙۢۗۙۖ۟ۗۤۧ۫ۗۙۦۥۧۘۦۢۧۤۛۥۦۜۛۦۦۡۘۧۙۗۧۨۜۘۡ۟ۡ";
                                break;
                        }
                    }
                    break;
                case 930421134:
                    OooOO0();
                    str = "ۧۖۜۘ۫ۧ۫ۧ۟ۜ۟ۜۥ۟ۤۨۘۥ۠ۨۡۧۥۦۦۘۘۢۙۨۦۢۖۤۗ۟ۧۘۘۜۘۗۢۖۡۘ";
                    break;
                case 1412531111:
                    setContentView(R.layout.activity_sweep_code_zbar);
                    str = "۠ۛۖۤۤۡ۠ۥۜۢ۟ۥ۠ۗ۠۬ۥۢۡ۬ۥ۠۠ۖۘۚۦۢۗۦۖۥۙ۠ۢۧۤۦۖۢ۠۟ۡۚۚۦۘۗۤ۫ۖۦۛ";
                    break;
                case 2007408086:
                    initView();
                    str = "ۙۖ۟۬ۗۛ۫ۜۥۦۤ۟ۚۙۥۦ۬ۜۧۗۥۘۙ۫ۙ۫۠ۗۧۦ";
                    break;
                case 2130973476:
                    OooO();
                    str = "۠ۥ۬ۜۧۘۘ۠ۢۢۤۦۧۢۤۨۘ۬ۢۖۘۥۜۡۘۢۢۨۘۨۨۢۖۚ۟ۡۗ۟۠ۡۘ";
                    break;
                case 2143357171:
                    str = "۟ۡۛۛ۠ۙۥ۫ۡ۫ۖۛۦۥۚۧۨۗ۫ۤۦۡۜۗۦۘۘۢۡۘۘۛۙۢۙۛۡۘ۟ۘۖۧۨۘۘۙۛۨۘۧۚ۠ۧۚۡۡ۬۬";
                    z = z3;
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۦ۫ۜۗۛۨۘۦۛ۫ۖۤۧۚۚۧۦۤۜۘۛۚ۫۟ۗۨۘۜۧۡۨ۠ۛۚۢۘ۠۟ۖۛۧۘۚ۫ۦۘۡۛۨۜۦۨۘۤۤۧۧۤۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 746) ^ C1801a.f11005aP) ^ 15) ^ 801346061) {
                case -1214199188:
                    this.o0OoOo0.removeCallbacksAndMessages(null);
                    str = "۟ۖۙۗ۟۬۟ۡۡۖۥۨ۠ۙۘۨۢ۫ۘ۠ۥۦۧۘۥۘۨۤۚۚۤۛۘۘ۬ۥۧ";
                    break;
                case -919708824:
                    str = "ۡۤۡ۠ۗ۟ۗۚۗۡۘۦۤۦۘۧۤۗۢۜ۬ۚۗۙ۟ۥۥۙۖۘۡۥۧۘ۟ۛ۟ۦۖۘۘ۬ۜۖۘۗۢ۠ۧۦۤ";
                    break;
                case 693261009:
                    super.onDestroy();
                    str = "ۜۦ۫ۗۛۗۡۢۦۘۥۛۦۘۢۡۚۤۘۛ۬ۜۖۚ۠ۗۚ۫ۘۘۡۛ۫ۖۛ۟ۥۥۘۨۚۡۘ۬ۧۙۥۘۦ۫۟";
                    break;
                case 1551107264:
                    return;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        StringBuilder sb = null;
        String str = "ۖۗ۬ۤۘۧۧ۬ۨۘۗۤۘۘۨۧۖۘۗۢۙ۫۟ۖۘۛۚۨۘۜۦۚۗ۬ۛ۫ۢ۫ۢۚۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 884) ^ 751) ^ 993) ^ (-1246211176)) {
                case -2131877460:
                    finish();
                    str = "ۢۦۛۤۧۥۘۤۢۖۘ۫ۙۘۘۦۚۗۦۗۤ۠ۡۘ۟۬ۦۘۛۦۧۤ۫ۚۨ۬ۜۛۖۖۧۙۚۥۚۦۘ";
                    continue;
                case -1783346095:
                    String str2 = "ۢ۫۫ۚۥۚۗ۫ۛۧۡۘۥۥۦۘۘۙۥۘ۬ۗۧۗ۬ۢۚۥۦۦۘۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 252578145) {
                            case -1573950897:
                                str = "ۗۤ۬۬ۨۨۖۥۥۘۡ۟ۡۘۤۧۚۦۦۡۦۥۘۖۙۡۘ۬ۜۖۢۜۙۤۖ۟ۧ۫۬ۜ۬ۘ۠ۖۨۥۙۦۘۘۜۖۘ";
                                break;
                            case -811762769:
                                String str3 = "ۤۡۚۘ۫ۨۨۡۤۚ۫ۤۦۙۚ۫۟ۨۨۤ۟ۨۨۛۘۖۗۗ۠ۤ۫۫ۘۘۘۖۘۦ۠ۜ۟۠ۘۘۡ۠ۜۢۜۘۘۘۙۨۘۗۢۥۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1806162470) {
                                        case -1053105529:
                                            str3 = "۟ۜۦۛۖۡ۫ۦۗۛۤ۬۠ۘۛۜۙۡۤۦۡۘۖۢۧ۠۟ۜۢۧۨۘۛۦ۟ۘۦۜۘۦۡۨۛۤۡۘ";
                                            break;
                                        case -805597104:
                                            str3 = iArr[0] == 0 ? "۠ۚۡۥ۟ۥۧۥۘۙۡۖۘ۟ۢۤ۫ۖۖۘۘۘۜۖۥۘۥۡۘ۫۟ۖ" : "ۗۦ۬ۗۜۥۘۡۦۥ۬ۗۖۘۜۢۚۙۜۦۘ۟۫ۨ۬ۥۢۡۥۜۤۘ۬۠۫۟ۗۥۚۤۡۚۘۦۜۘ";
                                            break;
                                        case 306494338:
                                            str2 = "۠ۡۜۛ۟ۧۖۡ۫۠۠۠ۨۚۜۚۗۚۡۜۡۖۥ۠ۥۡۨۨۗ۟ۡ۫ۥۧۡۢۥۥۥۚۥۤۡۨۘۥۚۥۘۚۚۥۗ۠";
                                            break;
                                        case 1141580439:
                                            str2 = "ۜ۫۬ۦۧۚۤۢۥۜ۫۫۫ۢۢۡ۟۟۫ۦ۠ۢۚ۬ۙۙۙۦۥۦۖۖۛۜۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1336110721:
                                str2 = "ۡۛۜۘۛۘۜۘۙۗۧۖ۫ۨۘۛ۬ۜۘۜۘۛۙۖۨۘۤۜۨۗۢۧۙ۬ۤۤۘۨۘۚۡۘۢۗۢۡۙ۫";
                                break;
                            case 1908945149:
                                break;
                        }
                    }
                    break;
                case -1770820316:
                    sb.append(",grantResults[0]=");
                    str = "ۚۥۨۘۚۨۖۗۜۘۘۢۦۙۖۨۖۘۡۡۢۥۤۨۗۥۧۖۚۙۖۤ۫۬ۤۤۡ۫ۛۤ۬ۙۧۖۙ";
                    continue;
                case -1122349171:
                    OooO();
                    str = "ۛۦ۠۟ۘۡۖ۟ۨۘۜۤۙۘۖۘۙۜۨ۫ۜۤۖۦۖۤۦۘۘ۠ۘۨۖۛ۫ۦۡۤۦۛۗ۬ۘۘ";
                    continue;
                case -763089911:
                    str = "ۙۜۘۢۗۜۘۥۘ۠۫ۚ۟ۖۢۖۦۥۘ۠۬ۨۘۙۖۖۘ۠ۙۜۘۙۗۙۛ۬۟ۨ۟ۘۘ۟۠ۗۨۦۥ";
                    continue;
                case -330012600:
                    return;
                case -234028890:
                case 867580986:
                    str = "ۢۦۛۤۧۥۘۤۢۖۘ۫ۙۘۘۦۚۗۦۗۤ۠ۡۘ۟۬ۦۘۛۦۧۤ۫ۚۨ۬ۜۛۖۖۧۙۚۥۚۦۘ";
                    continue;
                case 58388867:
                    sb.append(iArr[0]);
                    str = "ۙۜۡۛۥۜۘۤۢۡۚۙۙۙۘ۬ۖۛۛۢۡۙ۫ۛۧ۬۬ۥ۬ۤۦۘۚۢۖۘۗۗۖۘۦۙۖۜۦۗۦۘۚۡۧۘ";
                    continue;
                case 136253140:
                    String str4 = "ۧۚ۠ۜۢۨۜۡ۫ۗۢۨۘۡۖۙۡۚۧۡۧۧ۟ۢ۠ۥۢۗۦۤۡۘۜۢۨۘۦۢۥۡ۟ۥۥۜۡۘۘۡۡ۠ۜۥۦۤۗۦۛۘۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-723591573)) {
                            case -906685682:
                                str = "ۧۖۨۘ۟ۦۧۚۙۦۘ۟ۜ۬ۚ۠۫ۜ۠ۚۨۘۘۢۚۙۜ۟ۖۘۥۛۖۘ۫ۚۚۡۥۦۘۙۧۖۘۥ۠۬";
                                continue;
                                continue;
                            case -542958195:
                                str = "ۛۗۖۘۛۖۘۘۛۛۙۙ۬ۙۗۗ۟۫ۥۘۚۦۘۘۚۘۚۘۨ۫ۤۡۖۥۨ۫۫ۘ۬";
                                continue;
                            case 275808789:
                                String str5 = "۫ۖۦۧۥۢ۫ۨۘۤۧۡۘۖ۬ۥۘۜۥۦۘۛ۬ۡۧۡ۟ۢۗۜ۟ۖۘۛۢۥ۬ۤۙ";
                                while (true) {
                                    switch (str5.hashCode() ^ 11343221) {
                                        case -1901989686:
                                            str5 = "ۡۡۥۛۦۨۨ۬۟۫ۗ۠۟ۛۦۘ۠ۜۜۡ۠ۜۧۤۗۛۦۘ۬۠ۘۘۤۘ۠ۥۢۚ";
                                            break;
                                        case -1359673737:
                                            str5 = i != 99 ? "ۙۘۙ۟۠ۖۘۖۨ۬ۘۡۖ۫ۖۖۥۜۙۛ۬ۜۡۗۦۘۧۖۥۚۥۘۧۗۜ۬۬ۖۘۜۨۧۖۘۖۘ۟ۢۥۘۦۙۜ" : "ۚۥۜۢۦۧۨ۬ۤۖۖۘۚۚ۠۬ۛۘۘۘۢۨۜۖۘۛ۫ۚۢ۬ۜۥۖۢۙۙۘۤۜ۠ۧ۬ۜۥۙۦۤۚۥ";
                                            break;
                                        case -1346800427:
                                            str4 = "ۢۢۛۨۧ۬ۙۨۤۨۡ۫ۙۚۧ۠ۤۘۘۦۥۙۢۜۥۗۖۤۡۖۙۡ۟ۥۡۦۧ";
                                            break;
                                        case 671740033:
                                            str4 = "۬۟ۜۦۧۘۤۥ۟ۥۙۗۛ۫ۨۘۡۗۛ۫ۚۨ۫ۖۤۦۚ۫ۙ۟ۢۦ۠ۖ۠۬ۙۘۤۚۙۜۢۗ۠ۡۘۤۧۦۘۚۡۖۘ۬ۗۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1247764702:
                                str4 = "ۗۛۚۖۗ۟ۛ۫ۢ۠ۡۧۘۚۡۚۗۧۦۤ۫ۥۦۨۜۘۛۙۛۙ۫۠۠ۦۢۤۨ۬ۗۢۥ۠ۡۧۥۗۤۡۚ";
                                break;
                        }
                    }
                    break;
                case 136476555:
                    str = "ۦ۬ۘۘۜۚۖۗ۟۬ۙ۠ۜۡ۠ۨۢۖۧۗۖۘ۫ۗۜۚۧۤۤۡۘۚۚۖۘۛۘۤۨۧۧۘۜۜۘ";
                    continue;
                case 266197769:
                    sb = new StringBuilder();
                    str = "ۙۙۗ۠ۥ۫ۧۥۨۘۢۨۤۦۨ۫ۗۡۡۘۧ۟ۤۤۘۨۘۤۢۤ۫ۧۚۗۖ۫ۥ۬ۢۦۤۦۘۘۖۖۘۦۘۛۥ";
                    continue;
                case 324242183:
                    sb.append(strArr[0]);
                    str = "ۛۨۦۢۤۖۖۨۥۘۛۖۛۙ۬ۖۘ۫ۜۨۘۥۗۥۥۙۥۖۥۚ۬ۘۦۛۙۦۘۖۘۧۘ";
                    continue;
                case 775901889:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    str = "۟ۚۦۨۦۗۙۜۦۡۘۘ۬ۚ۬۟۫ۗۗۨۤۙ۫ۥ۬ۦۘ۟ۧۘ";
                    continue;
                case 828404728:
                    sb.append("onRequestPermissionsResult --> permissions[0]=");
                    str = "ۙ۠ۘۘ۫۬ۨ۠ۖۡ۟ۜۡۙۚ۟ۚۛۥۦ۫ۢ۟۠ۤۙ۠ۙۤۥۡۘ";
                    continue;
                case 1359873324:
                    sb.toString();
                    str = "ۘۜ۫ۛۛۚۗۙ۟ۡۤ۬۟ۢ۠ۙۦۘۤ۟ۤۖ۫ۘۡ۠ۧۡۢۘ";
                    continue;
                case 1714116265:
                    str = "ۙۗۗۗ۟ۨۢۡۥۘۡۘۜۡۨۥۘ۬ۙۘۜۧۗۧۘۡۤۡۡ۬ۗۜ۬۫۟ۡ۟ۨۘۗ۫ۤۨۛ";
                    continue;
                case 1870857954:
                    String str6 = "ۡۙۧۡۚۢۚۙۖۘۧ۠ۛۖۖۘۥ۬ۗۨ۬ۜۘۘۘ۫ۙۗۥۘۛۗۦۦۥۘۤ۠ۛ۬ۨۛۛۜۢۖۚۨۜ۟ۦ";
                    while (true) {
                        switch (str6.hashCode() ^ 1674211251) {
                            case -1891388605:
                                break;
                            case -1302131421:
                                str = "ۤۤۢۧۘۙۨۚۡۖۡۥۦۙ۟ۡۜۘۘۗۜۗۤۖۙۡۛۛۜۡۘۛۢۦۘ۫ۚۡ۟ۡۙۥۚۛۛ۠ۥۡۥۢۨۢۖ";
                                break;
                            case -11877369:
                                String str7 = "ۛۧ۠ۖ۟۫ۢ۟ۚۢۦۦۤۜۘۛۖۜۢۥۘ۠ۚۦۖۘۡۘۥۜۘۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1886499032) {
                                        case -2054322744:
                                            str6 = "ۖۛۛۗ۫۟ۙۚۥۧۜ۠ۗ۠۠۬ۨ۟ۛۚۧۢۤۘۘۜۧ۬۬ۛۢ";
                                            break;
                                        case -1972965949:
                                            str7 = iArr.length > 0 ? "۠ۨۙۥۥۥ۟۬ۡۘۦ۟ۦۘۗۙۘ۫ۨۦۗۘۧۡۗۥۘۗ۟ۚۢۚۢ" : "ۤۘۖۘۛۜۖۢ۟ۚۖۥۦۙۛ۟ۗۤۦۡۨۘ۠ۗۥ۠ۗ۫۫ۨۘۘۢۧۜۡۨ۫ۡۧۨۘ۬ۗۦۘ";
                                            break;
                                        case 151950855:
                                            str6 = "ۘۨۚۙۡۛۤۚۜۘۢۙۨۚۡۛۙۛۖۦۚۨۢ۬ۨۙۧۘۘ۟ۘۗ";
                                            break;
                                        case 1499640393:
                                            str7 = "ۡۙۡ۬۠ۖۤۗۡۘ۠۟ۦۘۛۨۜ۫ۨۘۜ۠ۜۘۡۜ۠۬ۡۗۖۙۖ۫ۤۡۢۖۨۨۨۘۚۢۛۤۥۘۤۛۖۘۦۖۡۤ۬ۖ";
                                            break;
                                    }
                                }
                                break;
                            case 2017787143:
                                str6 = "ۨۖۨۘ۟ۜۖۘ۠ۛ۫ۜۗ۠ۧۚۙ۠۠ۡ۠ۖۥۜ۬ۛ۠ۜۘۥ۬ۡۤ۟ۜۘۤۤۦۘ";
                                break;
                        }
                    }
                    break;
                case 1998669671:
                    str = "ۚۙۨۧۤۙۖۚۜۘۙۨۙۡۛۚۢۥ۟۟ۤۢۥۚۜۚ۟ۡۘۥۧۖۗۘۥۘۨۘۗ۬ۡۨ۠ۥۢۛ۫ۗۖۡۤ۠ۗ۫ۧ۠ۨۘ";
                    continue;
            }
            str = "۫ۧ۬ۜۜۖۘۢۙۥ۠ۨۧۘۖۦۥۘۚۤۘ۟۟ۨۜۡۖۘ۬ۖۜ۫ۧۛۛ۫ۖۘۡۚ۬۠ۡۦۘۧۛۡ۬ۧۜۘ۬ۤۜ";
        }
    }
}
