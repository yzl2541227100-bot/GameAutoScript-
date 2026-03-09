package com.cyjh.elfin.p200ui.activity;

import android.os.Bundle;
import android.view.View;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.ywfzjbcy.R;
import p285z2.C3691ah;
import p285z2.C3869fa;
import p285z2.C4095le;

/* JADX INFO: loaded from: classes.dex */
public class MessageDetailActivity extends BaseActivity {

    public class OooO0O0 implements TitleView.OooO0O0 {
        public final MessageDetailActivity OooO00o;

        private OooO0O0(MessageDetailActivity messageDetailActivity) {
            this.OooO00o = messageDetailActivity;
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "ۦۢۛۦۛۗ۫ۖۡۘۚۜۧۘۖۢۨۛۘۥۘۤۚۤۨ۬ۥۧۖۧۨۘۗۧ۟ۜۘۦ۠۠۠۫ۥۘ۬ۚ۫۫۠ۜۦ۠ۜ";
            while (true) {
                switch ((((str.hashCode() ^ 775) ^ 750) ^ 370) ^ 1882721098) {
                    case -1706997949:
                        this.OooO00o.finish();
                        str = "ۙۧۚۤۢۘۢۨۛۦۨۨۘۖ۟ۢ۟ۥ۠ۨۨ۬۫۬ۘۘ۫ۚۚۙۨۜۖ۬ۖ۟۟ۡۖۨۖۛ۬ۘۘۨۡۙۚۛ۟";
                        break;
                    case 49855188:
                        str = "ۚ۠ۨۧ۫ۛۜۢۘۘۗۧۙۥۧ۬ۧۚۥۢۗۦۧۧۤۢۦۘۘۙۚۜۦ۟ۤۢۚۧ";
                        break;
                    case 2004285388:
                        return;
                    case 2071286671:
                        str = "۫ۛۘۘۙۤۥۘۗۦۖۘۢۖۘۙۖۥ۟۫ۘ۫ۛ۟۠ۥۧۧۖۘۘۤۧۘۘۦ۫ۧۗۦۖۘ";
                        break;
                }
            }
        }
    }

    private void OooO0oO() {
        String str = "ۡ۫ۚۙۖ۫ۦۙۨۘۙۛۜۗۦۦۘ۟ۦ۠ۨۗۜۧۘۘۗۥۖۛۜۨۘۡۚۡۖۥۧۘۦۛۧۦۘۜ";
        TitleView titleView = null;
        while (true) {
            switch ((((str.hashCode() ^ 827) ^ 395) ^ 496) ^ 380628354) {
                case -2127489632:
                    titleView.setOnLeftImageViewListener(new OooO0O0());
                    str = "ۘۖۨۘ۠۟ۥۘۚۥۚۙۛۘۘۦۢۘۘ۟ۚۥۘ۠ۨ۫ۡۖ۟ۛۡۚۜ۟ۛۥۜۘۥ۫ۡۘۜۘۛ۬ۘۨۛۡ";
                    break;
                case -1301247035:
                    titleView.setleftImage(R.drawable.ic_back);
                    str = "۠ۘۘۦۖۧۘ۫۠ۘۘۜۢ۟۬ۨۨۘ۫ۡۖۦ۠۟ۗۙۘ۫ۖۧۘۢۘ۫ۧۢۤ۟ۧ۠ۤۨۧۘۤۨۛۥ۬ۘۘۨۗۨ۬ۡۥ۫ۖ";
                    break;
                case -929567504:
                    str = "ۘۗۛ۬۫ۦ۟ۤۨ۟ۤۧۚۦۘۘ۟ۡۡۜۜ۠ۘۛۧۤۦ۬۟ۡۦ";
                    titleView = (TitleView) findViewById(R.id.id_msg_detail_head);
                    break;
                case -718523673:
                    titleView.setTitleText(R.string.msg_notify);
                    str = "ۦۙۜ۠ۤۘۖۥۡۘۢۜ۟ۙ۟ۡۘۜۗۢۖۖ۠ۥ۫ۙ۬ۧۡۘۧ۠ۡۘۨۥ۫ۡۢۛۚۨۦۘۚۥ۫";
                    break;
                case -354499253:
                    titleView.setVisibilityRightImage(4);
                    str = "ۚۡۥۗ۬ۘۜۗ۫ۖۗۦۘۖ۠ۖۘۥۗۡۘۡۗۥۘۗۧۛۧۡۤۤۜۖۚۛۨۤۖۖۗۚۨۘ۠۬ۘۙۦۤۦ۫ۥ";
                    break;
                case -260730343:
                    return;
                case 57464578:
                    str = "۬ۧۥۘۦۥۨۘۤۤ۬ۗۥۛۧۙۥۘۙ۬ۡ۠ۖۘۘۚۘۘۚۛۡۘۗ۠۬";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۥۚۜۚۛۡۘۢ۠ۥۘ۫ۤۜۘۥۙۧۙۜۚۦ۫ۖ۠ۤۜ۟۬ۤۥ۬ۜ۫ۢۦ۟ۨۡۧۜۘ۠ۛ۬";
        long longExtra = 0;
        while (true) {
            switch ((((str.hashCode() ^ 994) ^ 923) ^ 830) ^ (-1194987342)) {
                case -1812204246:
                    longExtra = getIntent().getLongExtra(MessageDetailActivity.class.getCanonicalName(), 0L);
                    str = "ۤۖۧۘ۟ۖۗۘۧۜۚۧۖۘۗ۫۟۬۟۠ۖ۠ۨۘۧ۟ۨۘۖۛۦۘۦۥ۫ۧۧۧۘۛ۫ۘۤ۬۬ۗۘۖۜۚ۬";
                    break;
                case -927307069:
                    return;
                case -884679504:
                    str = "ۚۦۨۧۡ۫ۜۚۚ۫۟ۜۥۥۨۘۜ۠ۜۡ۠ۥۘۗ۫ۡۘۨۨۖۚۤۚۧ۟ۢۤ۫ۙۘۨۨۛۖۤۧۚ۬۠۫ۥۚۨۖۢۥ";
                    break;
                case -536345555:
                    getSupportFragmentManager().beginTransaction().replace(R.id.id_fl_fragment, C3869fa.OooOoO0(longExtra)).commit();
                    str = "ۥۗ۠ۧ۬ۘۛۨۥۛۨۙ۬ۖۘۢۧۜۘۨۖۤۗۗۖۛۡۖۜۥۘ۫ۛۨۘ۠ۜۧ";
                    break;
                case -411330490:
                    str = "ۖۥۥۙۨۨ۬ۛۨۘۜۡۡۛۥ۫ۦۦۚۖۧۘۙۖۘۦۨۡ۬ۤۨۘۖۦۧۤۘۜۦۤۤ۟۫ۤۗۨۨۘۦۦۚ";
                    break;
                case 226924915:
                    setContentView(R.layout.activity_msg_detail);
                    str = "ۦ۫ۘۖۚ۬ۙۘۜۖۧۘۡۧۡۘ۫ۥۖۢۜ۬ۘ۬ۘۥۦ۟ۗۖۨۘ";
                    break;
                case 1719015726:
                    OooO0oO();
                    str = "ۖۙۤۛۘۖۧۜۡۜۚۗۙۤۘۘۙۦ۬ۦۘۨ۫ۥۘۡۚۦۘۜۡۖۘ۬۫ۥۘۢۤۦۥۜۨۥۜ";
                    break;
                case 1871893475:
                    super.onCreate(bundle);
                    str = "ۢۥۡۧۡۛۡۜۗ۫ۘۘ۟۫۫ۧۤۥۡۜۦۛ۫ۘ۠ۖۖۧۦۜۘۘۗ۟ۤۥۤ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "ۨۨۜۡۢۥۨۨ۬ۙۛۧۜۨ۫ۢ۬ۦۨۜۦۚۢۦۗۡۘۢۗۜ۠ۥۜۘۛۚۥۦۜۦۥۧۖۚۘۦۗۛ";
        while (true) {
            switch ((((str.hashCode() ^ 469) ^ C4095le.o00000oo) ^ 526) ^ 1882156089) {
                case -1212294931:
                    super.onPause();
                    str = "ۙۧۖۘۨۗۜۘۘۖۙۤۘۡۘۢۥۚۛۚۡۤ۠ۡۛ۟ۡۘۛۨۗۛۤۡۘۥۢۤۙۡۘ";
                    break;
                case 1575668948:
                    str = "۟ۖ۬ۜۛ۫ۢۗۖۚۜ۟ۜۘۦۘۥ۠ۚۖۖۗ۠۠۟۠ۚۢ۫۬ۦۘ۬ۤۘۛۧۧۡۗۦۦۘ۬ۨۘۘۘۙۛ۫";
                    break;
                case 1667735011:
                    return;
                case 1770832827:
                    C3691ah.OooO0o0(this);
                    str = "ۨۦۨ۫ۡۡۘۦۦ۟ۚۧۖۦۖۢۙۜۢۛۗۦۛۧۜۦۡۘۚ۠ۛۖۦۡۜۨ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "۬ۗۘ۠ۚ۫ۜ۟ۡۘ۫ۜۖۘ۟ۛۨۦۧ۫ۚۢۨۘ۬ۦۢۖۥۥۧۚۢۙ۬ۖ۫۬ۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 96) ^ 329) ^ C1801a.f11011aV) ^ (-975010086)) {
                case -2140134555:
                    super.onResume();
                    str = "ۦۡۧ۫ۙۨۙ۠ۡۜۧۘۡۖ۫۫ۘ۠ۥۤ۟۫ۗۡۙۛۙ۠ۤۡ۠ۖۘۧۡ۟۠ۥۦۤ۠ۗۢۧۧ۠ۖۘ۠ۡۡۚۢ۫";
                    break;
                case -672668445:
                    C3691ah.OooO0o(this);
                    str = "ۗۛۦۘۧ۬ۡۨ۠ۨۘۖۛ۟۫ۜۘۙۘۜۘۙ۫ۡۦۛۡۢۘ۬ۖۥۡۥۧ۟۫ۡ۠ۖۥۨۘۖۥۜۘ";
                    break;
                case 1468260732:
                    return;
                case 2083572155:
                    str = "ۨۜۧۘۙۨ۬۠ۖۜۜۤ۫ۧۥۜۖ۫ۖ۬ۦۢۖ۫ۚۦۡۘ۟۟ۧ";
                    break;
            }
        }
    }
}
