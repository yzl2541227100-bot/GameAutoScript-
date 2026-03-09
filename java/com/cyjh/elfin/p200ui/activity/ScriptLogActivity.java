package com.cyjh.elfin.p200ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.PointerIconCompat;
import com.anythink.basead.p025ui.GuideToClickView;
import com.anythink.expressad.video.dynview.p158a.C2069a;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.ScriptLog;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p285z2.C3691ah;
import p285z2.C3939h6;
import p285z2.C4048k4;
import p285z2.C4201o9;
import p285z2.C4348s8;
import p285z2.InterfaceC3865f6;

/* JADX INFO: loaded from: classes.dex */
public class ScriptLogActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private TitleView OooooO0;
    private ListView OooooOO;
    private Button OooooOo;
    private ArrayList<ScriptLog> Oooooo;
    private Button Oooooo0;
    private C4201o9 OoooooO;
    private boolean Ooooooo = false;

    public class OooO0O0 implements TitleView.OooO0O0 {
        public final ScriptLogActivity OooO00o;

        private OooO0O0(ScriptLogActivity scriptLogActivity) {
            this.OooO00o = scriptLogActivity;
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "ۦۦۖۘۚۗ۬ۤۖۖۨ۟ۨۘۡۥۙۧ۬ۜۥۗۖ۬ۛۨۛۘۨۧۢۗ۠۫ۤۧۨۧۗۥۖ۟ۧۦۘۥۦۘۘۥۘ";
            while (true) {
                switch ((((str.hashCode() ^ 3) ^ 197) ^ 641) ^ (-874192201)) {
                    case -1910013730:
                        str = "ۥ۠۟ۖۡۖۛ۠ۡۥ۬ۤ۫۬ۧ۫۟ۘۘۦ۟ۨۙۖۡ۫ۤۘۥۘ";
                        break;
                    case -1667046181:
                        this.OooO00o.finish();
                        str = "ۥۦۥۘۦۨۢۤۨۥۨۜۡۤۨۤۚۚۚۤۧۙ۫۫ۚۚۗۙۧۦۤۡۨۚۨۚۗۧۥۥۡۨۧ۬۠ۧۦۡ۬ۧۥ۬ۚ";
                        break;
                    case 784011699:
                        str = "ۧۨۧۖۖۘۜۤۖۘۢۜ۟۬ۡۙ۠ۤ۠ۡۘۜۘۥۖ۫۟ۜ۬ۥ۫ۤ۫ۢۜ۫۠۫ۤۚۡۘۗۘۢ";
                        break;
                    case 1295258116:
                        return;
                }
            }
        }
    }

    public class OooO0OO implements TitleView.OooO0OO {
        public final ScriptLogActivity OooO00o;

        private OooO0OO(ScriptLogActivity scriptLogActivity) {
            this.OooO00o = scriptLogActivity;
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0OO
        public void onClick(View view) {
            String str = "ۘ۫ۜ۟ۗۡۤ۫ۘ۟۠ۡۘۡۚۜۘۡۦۗۡۖۥۘۚۧ۠ۘ۟ۗۡۨۗ";
            Iterator it = null;
            int i = 0;
            TitleView titleViewOooOO0O = null;
            TitleView titleView = null;
            int i2 = 0;
            int i3 = 0;
            TitleView titleViewOooOO0O2 = null;
            ScriptLogActivity scriptLogActivity = null;
            while (true) {
                switch ((((str.hashCode() ^ 820) ^ 395) ^ 585) ^ (-54572526)) {
                    case -2112758275:
                        String str2 = "۟۫ۨۘۙۢۖۘ۠۫ۡۡۡۜۘۦۜۧۛۨۘۨۜۘ۠ۛۙۜۖۨۘۖۥۥۥۜۨۘۧۚۗۧ۟ۥۧۜۘۤۢۙۜۦۖۘۙۜۘۘۨۜۜۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 867622702) {
                                case -2146268306:
                                    str = "ۗۗۧۢۧ۬۬ۖۦۙ۫ۡۤۦ۟ۤ۠ۖۖۥ۟ۛۗ۟۬ۦۘۢ۬۫ۥ۫ۜۘ۟ۧۡۘ۬۟ۖۢۦ۠";
                                    continue;
                                case -1112111686:
                                    String str3 = "ۘ۠ۖۘۡۢ۫ۦ۠ۡۘۖۢۦۖۤ۫ۤ۫ۡۚۚۢۘۧۚ۫۫ۥۘۛ۬ۦۤۗ۫ۛ۫ۢ۟ۦۚۦۖۛۛۜۘۘۧۚۖۙۜۗۘۧۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-1654408825)) {
                                            case -1475136907:
                                                str3 = it.hasNext() ? "ۤۙۡۧۖۖۘ۠۟ۗۛۘۖۘۘۛۤۨۤۦۘۦۥۨۘۚۘۧۙۙۙ۟ۜۢۡ۫ۦۘ۟ۘۧۢ۬ۢۨۢۤ" : "ۢۘۙۧ۠ۘۧۖ۫ۡۨ۠ۨۥۛ۬ۖ۟ۤۤۨۘۨ۬ۢ۫ۗ۠ۧۗۡۘۥۖۜۘ۬۬ۖۢ۟ۙ۬ۜۡۖۡۥۘۖۜۦۘۢۙ۫ۘۖۢ";
                                                break;
                                            case -90126252:
                                                str3 = "ۗ۬ۙۚۖ۠۟ۜۘۧۦۡ۫ۤۘۨۖۧۘۦۥۤۥۚۤۦ۬ۜۨۙۦ";
                                                break;
                                            case 1194009568:
                                                str2 = "ۛۡۗۥۙۜ۠ۖ۟ۥۘۙ۬ۦۘۖ۫ۨۥۘۦۖۙۙۘۘۢ۟ۦۚۘۥۘۡ۠۫ۦ۬ۛۜۜۦۖۚۦۙۡ۟۟۟ۖۖۚۖ";
                                                break;
                                            case 1275380679:
                                                str2 = "ۜۚۤۘۢۦ۬ۨۘۛ۬ۨۘ۬۟ۗۙۛ۬ۡۤۘۘۗۨۦۘ۫ۗۜۢۧۥۨۜۚۡۦۧۘ۬ۙ۫ۚۦۜۨۡ۠ۨۤۖۧ۟ۨۘۤۢۖ";
                                                break;
                                        }
                                    }
                                    break;
                                case 676126556:
                                    str2 = "ۖۖ۬ۥۦۚ۫ۢۚۦۘ۟ۦۘۘۗ۫ۥۘۧ۟ۨۦ۬ۜۢۡۖ۠ۦۦۙۢۢۤۚۢ";
                                    break;
                                case 1288463574:
                                    str = "ۨۚۜۚ۫ۢۢۤۧ۠۬۫ۤۥ۟ۦۗۚۧ۟۫ۖۚۚۙۖ۫ۤۤ";
                                    continue;
                            }
                        }
                        break;
                    case -1681278411:
                        str = "ۜۗۦۘۛۛ۠۠ۨۖۥۜۦۡ۫۠ۡ۟ۗۗۗۚۛۨۡۥۢۖۘۢۜۜ۟ۡۙ۟ۢۢۛۦۙۨۙۧۖۡۘۘۚ۫ۡۘ";
                        scriptLogActivity = this.OooO00o;
                        break;
                    case -1637409792:
                        ScriptLogActivity.OooOO0(this.OooO00o).setVisibility(0);
                        str = "ۢ۫ۘ۫۠۬ۨۦ۟ۦۧۥۦۨۖۘۗۖۨۘۛۦ۠ۥۚۜۧۧۧۤۗ۠ۢۖۖۘۥۥۥۘۖۢۢۡۡۧۘۘۖۢۗ۠۬ۙۘۡۘۦۗۧ";
                        break;
                    case -1125855789:
                        str = "۠ۖۗۖ۬ۨۘۥۚۧ۬ۛۖۧۦۥۘۘۡۗۘۗ۬ۡۨۡ۬ۡۚۘۧ۬ۙۖ۠ۢ۬ۘۡۘۗۜۙۧۧۨۘ۫۟ۨۘۢۨۦۥۡ";
                        break;
                    case -1108611492:
                        ScriptLogActivity.OooO(this.OooO00o).setVisibility(0);
                        str = "ۤۖۖۘۥۖۖۤ۫۟ۧۚۦۙۗۗۧۘۘ۠ۙۘۗۛ۬ۜۛۘۘۥ۫۟۬ۥۤۘ۠ۨۘۢ۟ۖۧۢۦۛۤ۫ۦۖۨۘ";
                        break;
                    case -1028697361:
                        it = ScriptLogActivity.OooOO0o(this.OooO00o).iterator();
                        str = "۬ۢۡۧۖۖۨۘۡۘ۠ۖۥۘۢۖۧۘۛۘۧۘۢۥۥۢۗ۠ۡۨۧۧ۬ۜۘ";
                        break;
                    case -867927740:
                        ScriptLogActivity.OooOOO0(this.OooO00o).OooO0OO(ScriptLogActivity.OooO0oO(this.OooO00o));
                        str = "ۜۡۥۘۡۙۙۜۚۛۥ۠ۗۚۨ۬ۘۦۦۨۢۧ۫۬ۦ۟ۢۜ۬ۚ۬ۨۢۦ۟ۖۖۥۨۘۘۛۢۖۨۦۨۘۦ۬ۦۘ";
                        break;
                    case -819152971:
                        str = "ۤۡۧۜۥۦۡ۠ۡۘۨۧۦۘۦۛۤۧۢۨۘۢ۫ۙۡۚۢ۬ۤۡۘ۟ۤۦۛۨۤۢ۠ۜۚۚ۠ۡۛۗۜ۟ۥۖۨۗۚۡۦۢۚۤ";
                        i = R.drawable.ic_manage;
                        break;
                    case -783319951:
                        ScriptLogActivity.OooO0oo(scriptLogActivity, !ScriptLogActivity.OooO0oO(scriptLogActivity));
                        str = "ۨۙ۠ۨۧ۟ۨۨ۠ۖ۟ۨۘۤۤۥۘۡ۟ۦ۟۫ۨۡۥۢۛۧۚۚۖۜۖ۟۠ۗۚۖۢۚۘۘۚ۫ۜۦۜۨۘ۟ۥۖۖۘۡۖ۫ۦ";
                        break;
                    case -619266055:
                        str = "ۨۛۥۗۢۤۘۤۧۧۡۧۛۘۡۨۨۨۘۡ۟ۤۛۥۘۘۦ۬ۤ۫ۢ۫ۡۖۘۙ۟ۡۧۙۖ۠ۗۗۜۧ۠ۜۘۛۨ۬ۦۥۢۧ";
                        break;
                    case -529615164:
                        ScriptLogActivity.OooOOO0(this.OooO00o).notifyDataSetChanged();
                        str = "ۧۨۧۘۨۢۘۨۦۗۡۧۖۗ۠ۥۘۜۥۙۖۗۢۘۢ۠ۖۡۥۖ۬ۥۘۡۖۘۨۨۗۘ۠ۘۘۢۤ۫ۥۡ۬ۨ۬ۤۜۨ۫";
                        break;
                    case 103327817:
                        str = "ۚ۬ۜۨۜۚ۠۟ۜۘ۫ۨۧۘۦ۬ۢۥۢۚ۫ۛۦۚۗۚۘ۠ۘۥۤۘۘۢۧۜۘۥۙۗۙۧۤۨۨ۟";
                        titleView = titleViewOooOO0O;
                        break;
                    case 105192800:
                        str = "ۤ۟ۛۗ۬ۢ۟۫۠ۦۡۘ۫ۜۨۨۚۨۘۢۘۢۘ۟ۡۨۡۖۘ۫ۤۖ";
                        titleViewOooOO0O = ScriptLogActivity.OooOO0O(this.OooO00o);
                        break;
                    case 169849887:
                        titleView.setRightImage(i2);
                        str = "ۜ۬ۥۘ۬ۦۤۚۜۚۗۧۚۦۡۘ۫ۜۦۥۦۜۘۗۡ۫ۢۚۥۖۧۘۘ";
                        break;
                    case 504330470:
                        i3 = R.drawable.ic_cancel;
                        str = "ۖۡۗۦ۫ۦۘ۟ۗۘۘۦ۟ۛۧ۬۟ۘ۫ۢ۬۟ۨۘ۫ۛۖ۫ۥۡۘۛۜۜۨۙۗۨۚۗ۟۠ۘۚۛۙۖ۫ۛۦۜۚ";
                        break;
                    case 508679303:
                        ScriptLogActivity.OooOO0(this.OooO00o).setVisibility(8);
                        str = "۟ۤۗۦۦۧۦۗ۬۟۠ۦۘۢۧۜۘ۠ۖۢۧۨۖۙۚۖۘ۫ۘ۫ۛۧۘ۟ۢۡۘ۠ۨۥ۬ۚۜ۟ۢۖۘ";
                        break;
                    case 592890173:
                        titleViewOooOO0O2 = ScriptLogActivity.OooOO0O(this.OooO00o);
                        str = "۟۬ۥۘ۟ۛۛۖ۠ۦۘۢۖۘۘۙۧۥ۬ۨۜۘ۬ۧ۫ۡۤۖۘۛۗۜۘ۫ۚۦ۟ۗۦۘ۬ۖ۟ۨۘۤۧۥۧۘ";
                        break;
                    case 703044019:
                        str = "۟ۛۧۖۧۡ۠ۡ۟ۖۡۙۙۗۜ۫ۘۗۘۢۡۨۧۘۜۦۥۖۛ";
                        break;
                    case 743047835:
                        ((ScriptLog) it.next()).setSelect(false);
                        str = "ۗۜۧۘۢۤ۟۬ۖۚ۫ۙۧۦۙۗۤۜۦۘۤۧۘۘ۬ۥۧۘۡ۬ۡۘۛۜۘۘۚۗۡ۫ۖۥۘ";
                        break;
                    case 806378082:
                        String str4 = "ۗۚۖۙۗۦۢ۟۫۬ۘۦۘۧۦۦۘۨۦۚ۬۬ۗۥۜۗۙۛ۫۬ۙۥۡۦۘۥ۬ۗۗۜۘۨۜ۟ۚۢۧۘۤۦ";
                        while (true) {
                            switch (str4.hashCode() ^ (-1409678907)) {
                                case -448480103:
                                    str4 = "۠۬۠ۤۜۙۤ۫ۘۧ۟ۡۢۜۖ۟ۚۢۤۨۖۘۢ۫ۨۘۙۦۨۘۖۚۡۘۜ۫ۡۚۜۖۘۛۥۧۘۥۜۥ";
                                    break;
                                case 841348697:
                                    String str5 = "ۧۢۦۘ۫ۜۖۡ۠ۖۧۙۥ۟ۜۡۡۤۧ۫۬ۦۛ۬ۖۥۚۖۢۦۥۜۖۘۜۨۜۨۤۜۛۤۛۥ۬ۧ۟ۘۘۨۢ۠ۥۦۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-907534402)) {
                                            case 271163510:
                                                str5 = ScriptLogActivity.OooO0oO(this.OooO00o) ? "ۙۦۨۙ۬ۦۘ۬ۨۘۘ۟ۢۤۗۤۘۚۧ۠ۘۗۜۘۘ۠ۡۘۗۥۡۘۖ۬ۖۨۢۘۢۥۚۧ۟ۦ۟ۤۢ" : "۬ۚۨۘۡۘ۟ۧۧۙۧۨۧۘ۠۫ۧۜۦۜۚۥۡۧۡۦۙۡ۠ۗۥۘۦ۠ۡۘۢ۬۟ۦۘۛۤۦۗۗۚۨۘ۠ۙۗ";
                                                break;
                                            case 381460708:
                                                str4 = "ۤۤۖۘۜۨۗ۠ۖۦۨۢۘۘۗۗۜۢۤۘۘ۠ۨۧۘۢۖۙۗ۫ۜ۬۫۠ۦۘۘۘۚۤۗۘۖۜ۫ۛۘ";
                                                break;
                                            case 1682691874:
                                                str5 = "ۤۢۢۧۚۚ۟ۡۨۤۥۧۘ۠ۢ۫ۨۥۘۖۨۖ۠ۖ۬ۙۘۨۛۘۡ";
                                                break;
                                            case 2088655434:
                                                str4 = "ۙۡۜۘۗ۟ۚ۟ۙۗ۫ۛۛۥ۬ۗۤۘۨۛۜۘۗۦۚۢۜۡۙۨۖۘۧۖۥۘۚ۬ۜۘۨ۬ۧ۟ۦۛۦۤۥۧۡۙۚۗۗۡ۠";
                                                break;
                                        }
                                    }
                                    break;
                                case 1235203425:
                                    str = "ۢۥۜۘۦ۫ۡۘۙۨۥۘۦۦۡۦۜۖۘۥۗۗۡۤۘ۟ۨۘۗۖۨۢۢۨۘۦ۬ۘۥۨۦۘ۟ۦۘۦ۠ۨۙ۠ۖ۠ۙۘۘ۫ۡۚ۫ۢۙ";
                                    continue;
                                case 1648233656:
                                    str = "ۚۦ۫۟ۜۗۢۙۜۘۙۡۡۘۗۨۜۘۜۢۛۨ۠ۨۘۚۥۡۘ۬۟۬ۖۦۛۥ۠ۨۘۥ۟ۡۘ۬ۖ۟۠ۤۡ";
                                    continue;
                            }
                        }
                        break;
                    case 882465339:
                        return;
                    case 1187931813:
                        str = "ۗۘ۬ۦۥۘۢۥۡۘ۠۟ۢ۠۠ۘۘۤۢۚۘ۟ۘۘۜۥۥۛۚۖۜۤۙ";
                        i2 = i3;
                        break;
                    case 1569897200:
                        str = "۬ۢۡۧۖۖۨۘۡۘ۠ۖۥۘۢۖۧۘۛۘۧۘۢۥۥۢۗ۠ۡۨۧۧ۬ۜۘ";
                        break;
                    case 1988741279:
                        ScriptLogActivity.OooO(this.OooO00o).setVisibility(8);
                        str = "ۧ۠ۡۘ۫ۥۤۛ۫ۨۗۨۧۤۥۘ۬ۗ۬ۗۖۨۘۗۚۡ۫ۢۜۜ۫ۙ۬ۖۨۥۖ۠۬ۦ۟ۤۦۥۘۧۜۡۨۖ";
                        break;
                    case 2086354765:
                        str = "۠ۖۗۖ۬ۨۘۥۚۧ۬ۛۖۧۦۥۘۘۡۗۘۗ۬ۡۨۡ۬ۡۚۘۧ۬ۙۖ۠ۢ۬ۘۡۘۗۜۙۧۧۨۘ۫۟ۨۘۢۨۦۥۡ";
                        i2 = i;
                        break;
                    case 2140393514:
                        str = "ۦۨ۫ۤۤۤ۠ۗۤ۬۠ۚ۟ۧۦۛۚۜۡۛۦۘۦ۬۬ۧۛ۠ۖۙۨۘۛۚۨۛۗۗۦۚۗۚ۫ۡ";
                        titleView = titleViewOooOO0O2;
                        break;
                }
            }
        }
    }

    public static /* synthetic */ Button OooO(ScriptLogActivity scriptLogActivity) {
        String str = "ۛۢۜۘۢ۟ۘۘ۟ۡۖۘۧۗۚۛۚۥۘۜۘۨۚۦۦۚۨۖۘۛ۬۠ۥۙۨۜۘۘۘۡۜۧۜۘۙۡ۬۬۠ۘۘۧ۟ۢۚ۬ۥ۫۬ۙ";
        while (true) {
            switch ((((str.hashCode() ^ 231) ^ 803) ^ 432) ^ (-1283751850)) {
                case -952556007:
                    return scriptLogActivity.OooooOo;
                case 845835914:
                    str = "ۚۚۧۚۚۗۥۧۘ۬ۚۚۤۘ۠۠۬ۖۘۤۦۦۧ۠ۥۤۜۘۢۦۥۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ boolean OooO0oO(ScriptLogActivity scriptLogActivity) {
        String str = "۠ۗ۟ۙۨۚۤۡ۬ۖ۬ۥۘۢ۠۟ۦ۬۠۠ۥۡۘۧۦۙۖۚۙۧۨۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 447) ^ 224) ^ 852) ^ 2133664040) {
                case 67418305:
                    str = "ۨۨۦۘۤۥۗۧۨۦۧۛۘۚۚ۫ۤۤۛۚۘۥۘۙۨ۬۬ۜۦۦۛۢ";
                    break;
                case 156472051:
                    return scriptLogActivity.Ooooooo;
            }
        }
    }

    public static /* synthetic */ boolean OooO0oo(ScriptLogActivity scriptLogActivity, boolean z) {
        String str = "ۖ۫۟ۨۗۦۘۘۜۛۨۥۢۢۖۨۘۡۛۦۘ۫ۖۗ۠ۖۚ۫ۧۥۘ۠ۦۘۘۨۥۘۨ۬ۥۡۡۡۘ۟ۗۖۚ۫ۥۘۥۥۧۘ۠ۛۖۘۙۨۙ";
        while (true) {
            switch ((((str.hashCode() ^ 637) ^ UiMessage.CommandToUi.Command_Type.SET_FW_BG_VALUE) ^ 117) ^ (-332606613)) {
                case 49532301:
                    str = "ۛۙۨۘ۬ۖۥۙۘۙۤۢۖۘ۟ۨۚۤۨۨۘۛ۟۫ۥۨۘ۬ۥ۠ۙۧۖۜۤۧۦۘۧۛ۟ۗۥۨۘۙۥۡ۫۬ۘۧۥ۠ۜۨۥۘ";
                    break;
                case 58640985:
                    return z;
                case 719776955:
                    str = "۟ۡۥۘ۫ۢۨۘۧ۬۬ۛۙۖۢۥۦۘۦۢۨ۬۬۠۠ۗۡۘۧۙۘۘۜۜۦۘOۡۥۥ۠۠ۡۥۚۗ";
                    break;
                case 2044109846:
                    scriptLogActivity.Ooooooo = z;
                    str = "ۡ۫ۡۘۚۨۢۛۗۙ۠ۧ۬ۖۖۛۥۢۗۨۘ۟ۗۢۛۤۢ۠ۤۖۘۙ۬ۧ۠ۧۦۧۚۘۖ۫۟";
                    break;
            }
        }
    }

    public static /* synthetic */ Button OooOO0(ScriptLogActivity scriptLogActivity) {
        String str = "ۘۛۤۧۗۦ۬ۚۜۘۗۥۦۤ۫ۘۡۦۛ۠ۦۙۛۚۗۜۘۘۨۙۚ";
        while (true) {
            switch ((((str.hashCode() ^ 897) ^ 617) ^ 602) ^ (-1916508220)) {
                case -2012686365:
                    return scriptLogActivity.Oooooo0;
                case -1974979674:
                    str = "۫ۗۡۥۘۛۨۢۘۘۨۨۜۖۡۘ۫ۖۙ۠ۧۥ۬۬ۘۥۥۘۨۗ۫ۦۦۨۡۢ۬ۧۤۥۖ۠ۖ";
                    break;
            }
        }
    }

    public static /* synthetic */ TitleView OooOO0O(ScriptLogActivity scriptLogActivity) {
        String str = "ۦۥۨۘۥۧۥۗۨۡۥۥۘۖۥۤۖ۠ۧۤ۟۫ۢۨۘۦ۟۫۫ۖۛ";
        while (true) {
            switch ((((str.hashCode() ^ 931) ^ 273) ^ GuideToClickView.C0870a.f1446e) ^ (-1996662951)) {
                case -1370671082:
                    str = "ۦ۬ۖۘ۫ۥۙۜۛ۬ۜۥۨۘۡۙۥۘ۠ۗۢ۠ۘۗۗ۠ۤ۬ۜۨۗۖ۬";
                    break;
                case 423508176:
                    return scriptLogActivity.OooooO0;
            }
        }
    }

    public static /* synthetic */ ArrayList OooOO0o(ScriptLogActivity scriptLogActivity) {
        String str = "ۥۤۦ۫ۜۗۜ۫ۙ۬ۡۗۢۜۗۤ۠ۜۘۤۧۙۨۡ۟ۙ۬ۛۤ۬ۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 962) ^ 73) ^ 768) ^ 34139897) {
                case -1061134868:
                    return scriptLogActivity.Oooooo;
                case -253879802:
                    str = "ۡۤۜۢۙ۫ۛ۟ۚۢۢۖۘۙۥۧۧۘۥ۟ۚۚ۠۟ۖۗۖۨۚ۫ۘۥ۠ۘۚ۠ۦۗۦۘ۫ۚۧ";
                    break;
            }
        }
    }

    private void OooOOO() {
        String str = "ۧۡۗۧۖۚۨۦۡۘۜ۟ۛ۫ۚۧۛۡۡۘۥۖۥۡۜۘۗۡۧۦۢۡۖۜ۟ۦۗ۬ۛۘۘۘۛۥۜۘۤۡۜۥۥۘۙۜۡۘۗ۫۠";
        ScriptLog next = null;
        Iterator<ScriptLog> it = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z3 = false;
        Iterator<ScriptLog> it2 = null;
        while (true) {
            switch ((((str.hashCode() ^ 252) ^ 1011) ^ 821) ^ 462960130) {
                case -1656722757:
                    str = "ۗ۬ۥۖۗۖۛۙۖۘ۟ۦ۬ۡۡۜۘۜۡ۠۠ۙۨۤۚۦۘۜۜ۬ۗۚۦۥۧۚۤ۫۬ۜۤۨۥۗۖۘ";
                    continue;
                case -1629375582:
                    String str2 = "ۘۜۡۘ۬ۢۨۘۢۥۨۘۦۜۜۘ۬ۥۗ۠ۜۦۘۛ۬ۤۤۢۜۘۦ۟ۗۙۜ۬";
                    while (true) {
                        switch (str2.hashCode() ^ (-1986035392)) {
                            case -2126002430:
                                str = "۬ۧۛۧۧۖۘۦۙ۬ۧۜ۬ۢۜۛۙۗۦۡۜۖۘۢ۠۠ۜۛۢ۠ۢۜ";
                                continue;
                            case -1214607438:
                                str2 = "ۜۗۘۚۖ۠ۖۡ۫ۜۢۘۘۚ۫ۗۛ۟ۜۘ۫ۜۧۢۧۚۗۘ۟۫۬ۡۦ۠ۜۘۡۘۘ۬ۛۗۖۜۦ۟۬۫ۘ۫ۡ۟ۜۦۘۦ۠ۖ";
                                break;
                            case -1045833422:
                                String str3 = "ۜ۠ۖ۫ۖۨۘۡۗۢ۠۟ۦۗ۫ۨۢۢۢ۠ۜۘۧ۫۬ۥۦۘۥۘۛۦۥۤۥۘۖۘۙ۟ۜۘۜۧۖ۫ۗۛۨۛۦۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1965993425)) {
                                        case -1197643595:
                                            str2 = "ۧۘۧۘۚۡۧۖۦۜۘۦۢۧ۬ۗۗۦ۬ۥۘۛۢۢ۫ۗۖۘۙۧۗۤۦۨۙۜۦۜۗ۫ۢۡۘۢۙۜۘ۬۠ۤۧ۫ۖۘ";
                                            break;
                                        case -981601059:
                                            str3 = it2.next().isSelect() ? "ۦ۟ۡۘ۟ۚۧۜۦۨۖۘۧ۫۟ۙۚۤۙ۫ۡ۫ۨۜۘۗۗۙۜۥۜۘۧۛۨۘۚۥۥۙۚۤۢۥۘۘۖ۠۠ۚ۟ۗ۬ۜۨۧۡۘ" : "ۖ۫ۡۘۡۗۡۘۢۖۥۨۚۨۜ۟ۨ۟۟ۢۨۡۜۗۘۚ۠۠ۦۘۥ۫ۚ۬ۡۖ۟۬۠ۡۦ۬ۧ۠ۗ";
                                            break;
                                        case -752450245:
                                            str3 = "۠ۤۦ۟ۧۨ۫ۢۧۤۜۚ۠ۜۘۗۘۗۘۨۘۛ۫ۡ۟ۘۧۜۛۢ";
                                            break;
                                        case 154202983:
                                            str2 = "ۧۤۖۘ۠ۤ۬۠ۧۘۘۦۢۥۧۘۙۚۙۡۘ۫ۜۦۢۤۗۥ۠۫ۖۦۡۘۦۛ۟ۚۧۗ";
                                            break;
                                    }
                                }
                                break;
                            case -103579783:
                                str = "۫ۧۚۨۛۛۜۘۢۖۚۢ۠ۜۨۥۦۘۙ۫ۘۘ۟ۙۚۛۛ۫۟ۥ۬ۢۡۢ۠ۚ۠ۜ۠۬ۚۥ۠ۢۜۧۘۨۢ۟";
                                continue;
                                continue;
                        }
                    }
                    break;
                case -1628601825:
                    String str4 = "ۜۜۖۘۤۚۤ۠ۦ۠ۘ۠ۖۥۢۦۘۦۨۤ۫ۢۛۖۦۖۢۤۧۚۖ";
                    while (true) {
                        switch (str4.hashCode() ^ 2006753743) {
                            case -862981143:
                                str = "۬ۜۢۧۚ۫ۛۛۢ۟ۚۘۡۡۡۛۘۘ۬ۗ۬ۜ۬ۥۘۙۨ۟ۨ۫۟ۡۘۦۡۥۘۜۘۜۘ۠ۗۥۘۛۙۨۘۘۙۥ";
                                continue;
                            case -727506685:
                                String str5 = "ۙۦ۟ۨ۟ۡۗۧ۠ۖۖ۫ۡۦۥۘۜ۟ۥۘۖۖۘۦۗ۠ۚۛۛ۠ۤۘۛۛۡۘۙ۠۫ۖۜۧ۠ۡۘۘ۬ۧۨۛۖۤۤۡ۫ۚۚۜ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1445041705)) {
                                        case -1509659147:
                                            str5 = "ۚۚۙ۠۬۠ۛۗ۬۬ۗۨۙ۠ۘۘۨ۬ۥۘۧۧۖۗۛۚۗۘۥۢۧۜ";
                                            break;
                                        case -1274542418:
                                            str4 = "ۢۗۥ۠ۖۤ۫۠۠ۙ۫ۜۘۘۦۘۗ۟ۖۘ۟ۡۘۢۜۦۘۚۙۡۘۛۘۙۘۘۚۘ۟ۗۛۘۘۖۘ";
                                            break;
                                        case 466538054:
                                            str5 = it2.hasNext() ? "ۘ۫ۤۤ۟ۨۘۛۨۖ۠ۜ۠ۤۡ۠ۖ۟ۖۘۢۥ۟ۚ۠ۤۛۗۡۧۘ۟۫ۦۗۙۙۙ۬۬۠ۖۡۘۧۗۡۘۦۖۘۖۥۘۘۜۚۤ" : "ۧۗۘۘۤۤۖۘ۠ۨۜۡۡۦۛۛ۬۫ۙۖۜ۫ۙ۬ۗۖۗۢۨۤۦۛۜۡۧۘ۟۟ۖۘۤۨ۟ۖ۠ۢۗۚۚۜۙۡۘۚۢۗ۟ۗۦ";
                                            break;
                                        case 1564091759:
                                            str4 = "ۛۥ۬ۖۗۢ۠ۧۦۖۖۘۗۖ۟۬ۡۧۘۜ۫۠ۢ۟ۖۘۧ۠۠ۜۗۜۘۤۘۘۙۜۜۡۡۖ۠ۘۘۘۦ۠۬ۛ۟ۡ۫ۜۜۢۥ";
                                            break;
                                    }
                                }
                                break;
                            case -700885467:
                                str4 = "ۜۡۦۘۗ۫ۦۨ۬۬ۗۢۜۜۘۧۨۢۙۤ۬ۢۤۚۗۘۤۜ۠ۙۥۘۧۗۢۢۜۡۘ";
                                break;
                            case -102636695:
                                str = "ۙۘۡۘۡ۬ۨۨۥۚۧ۬ۖۨۘۖۘ۫۫ۨۗ۠۬ۜۙۡۧۨۖۘۚۘۘۘ۫ۙۗۤ۫ۨۚۜ۠ۗۚ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case -1547432482:
                    str = "ۘۤۚۚ۫ۢۥۨۥ۬ۛۤ۫ۢۧۘ۫ۙ۟ۘۦۘۛۛ۟ۘۘۗۖۖ";
                    arrayList = new ArrayList();
                    continue;
                case -1542970830:
                    str = "ۗ۬ۘۘۡۡۚۡۨۛ۠ۙۤۡۧۘۨۘ۟ۗ۠ۢۚۧۘۘۘ۬ۜ۠ۡ۠ۧ۠ۦ۟ۜۜۘۡۦۡۘ۠۟ۦ";
                    next = it.next();
                    continue;
                case -1479980241:
                    arrayList.add(next);
                    str = "ۜۢۥۘ۠ۢۨۖ۟ۙۧۜۢۤۦۘ۬۠۬ۨۗۨۘ۬ۜۖۨۛۘۘۜۢ۟ۜۚۙۚۤۢۛ۬ۨ۟۫ۚۗۚۖۜۜۘ";
                    continue;
                case -1103876041:
                    str = "۫ۛ۫ۚۤۡ۬ۢۖۤۛۜۦۧۢۨۤۥۘۜۘۘۜۗۥۨ۠ۡۥۛۖۘ۠ۥۗۨۤۡۘ۬ۦۗۖ۫ۙۥۡۧۡۥۗ";
                    it = this.Oooooo.iterator();
                    continue;
                case -1074719379:
                    str = "ۧ۠ۨۘۢۡۛۙ۫۬ۖۥۙۤۛۡ۬ۡۖۢۗۙۘۨۦۡۨۦۘۧۥۥۤۗۛۡۢۢ۠ۗۖۤۦۘۨۡۜ۬ۖۘۘ";
                    z = true;
                    continue;
                case -1068069258:
                    str = "ۤۜۧ۬۫ۖۘۤۗۥۖۖۤۚۧۥۘۤۢۨۘۙۤۖۘ۟۬ۚ۫ۘۘۚۛ۟۬ۙۧ۠ۜۙ";
                    continue;
                case -809701132:
                    String str6 = "ۦۤۡۥۢۦ۫ۢۚ۬ۥۘۥ۟۬ۧ۫۠ۛ۟ۥۘۦۡۜۤۢۦۛۢۢ";
                    while (true) {
                        switch (str6.hashCode() ^ 415733509) {
                            case -1212546889:
                                str = "ۤۙۘۘۤۘۦ۬ۨۦۘۗۥۚۙ۟ۥۦۥۛۖۚ۠ۙۘۦۘ۠۫۫ۜ۬ۧ";
                                continue;
                            case -204584675:
                                str = "ۙۗۖۚ۫۠ۖۗۦۘ۫ۡۥۖ۟ۘۜۥۨۘۙۦۨۘۧۨۖۘۧۜ۫ۙ۬ۙۧۜۤۥۜۥ۠ۥ۫ۖۡۛ";
                                continue;
                                continue;
                            case 1100986196:
                                String str7 = "ۘۨ۠ۛۥۤۢۥ۟۫ۥ۠۬۫ۜۘۘۚۜۘۚۗۨۨۤۧۦۖۚۛۤۖۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1985143334) {
                                        case -1945551342:
                                            str6 = "ۢۥۖۘ۟۟ۧۥۦۧۘۜۖۛۙۗ۠۬ۦۗۨۥۨۘۧۚۙ۠ۜۡۚ۠ۦۘۢۗ۠۟۟ۥۘ";
                                            break;
                                        case -1201708882:
                                            str7 = !z3 ? "ۘۦۧۘۨۗۢ۫ۥۦۤۧۦۜۚۙ۟ۜۨۤ۬ۨۘۥۦۦۘۤۚ۫ۛ۫ۧۨ۟ۤۤۛۦ۫ۜۨۘۜ۠۬" : "۠ۘۥ۫ۤۡۘۤۗۖۢۜۙۦۢۧۧۘۦۘۘۨۘۦۗۦۜۡۥۘۖ۟۫ۖۛۗۙۨۨۡۚۡۖۢۙ";
                                            break;
                                        case -1066015653:
                                            str7 = "۬ۤۘۘ۠ۘ۠ۗۨۦ۫ۙ۠ۢۗۨۘۗۤۘۤ۟ۗۘۥۦۘۦ۠ۡۘ۠ۦ۬ۨۥۘۘۥ۬۟ۤۘۘۦۚۙۖۥۙۖۡۗۙ۫ۘۘۘۛ";
                                            break;
                                        case -511034682:
                                            str6 = "ۘۦۨۘۗۦۘۤ۫ۡۘ۫۟ۖۤۤ۟ۥۘۚۚۚۥۢۧۛۗۙ۟ۡۘ۟۠ۡۘۘۧۘۘ۫۫ۥۤۧۨۘۨۤۗۢۛۜ۫ۛۖۘۜۘۧۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1848621619:
                                str6 = "ۘۨۘۘۨۦۛۢۢۖۘ۠۬ۜ۬ۜۘۖ۟۠ۡۜۖۘۧۙۥۘ۬ۘۢ۠ۨۤ";
                                break;
                        }
                    }
                    break;
                case -619263808:
                    this.Oooooo.removeAll(arrayList);
                    str = "ۖۖۛ۟ۚۜۘۙۘۛۢۢۦۦۨۡۘۧۖۦۙ۬ۖۘۖۛۖۢ۬ۜۘۨ۠۟۠ۤۘۖ۬ۛۛۗۨۘۢۦۥۘۜۨۦۘۧ۟ۚۛۨۜ۟ۧۨۘ";
                    continue;
                case -591048186:
                    this.OoooooO.notifyDataSetChanged();
                    str = "ۦۙۗ۬۟ۘۘۧۘ۠ۙۧ۬ۜۛۨۘۛۖۨۘۦۢۘۘۘۘ۫ۤۢۘۘۤ۠ۛۧ۠ۧۢۥ۠ۨۜۚ۠ۚۦ۬ۘ۠ۡۜۗ۬ۥۨۡ";
                    continue;
                case -175128367:
                    String str8 = "ۗۘۤ۟ۢۛ۟ۖۧۛۗ۬ۖۜۘۚ۟ۨۚۨۖۙۦ۫ۗۛۢۨۖۦۙۜ۬ۧ۫ۛۘۨۥۨۨ۟";
                    while (true) {
                        switch (str8.hashCode() ^ 1911904171) {
                            case -775804196:
                                str = "ۜۡۘۥۢۨۧۦۧۘۗ۫ۘۘۡۘۖۘۖۘۖۘ۟ۧ۠ۥۢۨ۟ۚۧ۫۫ۨۦۥۦۘۨۘ۠ۡۚ۬ۨۥۛ";
                                break;
                            case -733250501:
                                break;
                            case 355229333:
                                str8 = "ۙۨۢ۬ۖۜۚۤ۫۠ۖۡۗۧۥ۟ۖۛۘ۫۟ۗۙ۫ۨۗۘۖۤۙ";
                                break;
                            case 1039381477:
                                String str9 = "ۥۙۖ۠ۜۨۧۦ۫ۢۥۘۡ۫ۦۢ۬ۘۘۨۜۥۘۡۙۥۘ۟ۛۦۘۡ۫ۢۡۜۦۘۜۧۨ";
                                while (true) {
                                    switch (str9.hashCode() ^ 1185308529) {
                                        case -879000242:
                                            str8 = "ۜۨۦۘۤۖۗ۟ۨ۟ۤۤۨۘۢۢۥ۫ۜۙۚۙۥۧ۫ۘۛۨۖۘۛۤۥ۫ۖۡۘۥ۫ۢۤۦۨۘۡ۟ۜۡۜۙ۟ۘۧۘۘۨۥۘۨۤۖ";
                                            break;
                                        case -82423558:
                                            str9 = next.isSelect() ? "ۘ۟ۛۧۨۤۜۚۨۢ۠ۨۘۗ۟ۖۙ۟ۦۘۨۨۧۘۨۥۨۘۖۖۡۡۨۡ" : "ۘۨۦۘۧۡۙۧۥۧۧ۟۫ۜۡۥۙۥۧۧۧ۟ۛ۬۬ۖۘۘۖۘ۟ۙۧ۬ۢۗۡۨۨ۬ۘۙۖۨۦۘۚۚ۫ۧ۬۬ۥۢۢ";
                                            break;
                                        case 1282325957:
                                            str9 = "۫ۙۖۘ۬ۘۤ۬ۗۜۦۢۤۜۧۥۘۡۘۥۦۚۗ۬ۘۢۜۨۘۙۥ۟۫ۗۡ۠ۙۢ";
                                            break;
                                        case 1702812250:
                                            str8 = "ۤۧۥۗۦ۟ۙۜۖۘۙۘۙۜۨ۠ۧۥۧۚ۠ۦۜۜۧۘۦ۬۫ۜ۠ۜۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -190109:
                    str = "ۙۘۡۘۡ۬ۨۨۥۚۧ۬ۖۨۘۖۘ۫۫ۨۗ۠۬ۜۙۡۧۨۖۘۚۘۘۘ۫ۙۗۤ۫ۨۚۜ۠ۗۚ";
                    z3 = z;
                    continue;
                case 381308431:
                case 1408875033:
                    return;
                case 570503326:
                    str = "ۙۦۦۤۨۨۘ۠۫ۥۘ۟ۚۦۘۖۜۚۘۧۦۖۡۡۘۤۛۦۘۘۜۤۨۘۦۜۛۖۘۖ۬ۤ۬ۛۚۦ۟ۜۚۨۘۢۨ";
                    z3 = false;
                    continue;
                case 964336328:
                    String str10 = "۠ۡۡۘۧۡ۫ۧۤ۠ۨ۟ۥۢۧۨۨۨۛۨۧۡۘ۬۟ۧ۟ۜۜۘۨۛۦۘ۠۬ۜۘۗۦۜ۫ۘۥۖۢۤۢۗۢۜ۟";
                    while (true) {
                        switch (str10.hashCode() ^ (-675071317)) {
                            case -1365721681:
                                str = "ۥۦۘۘۤۙۜ۫ۜۧۜۜ۟ۤۗۘۘۦۢۢۜۨۘۤۤ۠ۥۘۨ۠ۙ۠";
                                continue;
                            case -1156952291:
                                str = "ۡۢۡ۬ۚۥ۟ۘۡۘۘۛۡۘۚ۫ۨ۫ۧۥۘۚۚۡۥ۫ۨ۫ۘۨ۬ۘۘۥ۫ۜ۠ۧۥۤۙۥۘ۬ۛۖۘ";
                                continue;
                                continue;
                            case 1616873606:
                                str10 = "ۚۨۗ۠۟ۡۥۦۥۘۖۗۜۨۗۤۛۨۜۜ۫ۢ۫ۗۦۤۘۘۘۢۘۚ۬۬ۖۧۜۥۨ۫ۚۦۙۢۛۧۤۙۨۘ";
                                break;
                            case 2037193568:
                                String str11 = "ۡۚ۫ۢۗۡ۫ۛۘۘۖ۫ۚۖۧۛۗ۠ۨۘۖۗۜۘۛ۬۠۫ۜۡۘۜ۠ۖۨ۫ۦۘ۠ۚۦۘ۠ۨۘۛۖۘۛۙۡۘ۠ۘۘۜ۫ۨۢۢ۟";
                                while (true) {
                                    switch (str11.hashCode() ^ (-397463133)) {
                                        case -1531232800:
                                            str10 = "ۘۥ۬ۘۨۧۘۤۛۨۨۧۚۡۥۤۚۦۚ۠ۡۖ۫ۜۘۘۨۜۚۡۢۥ۠ۥۖۨۦۚۨۖۛ۬";
                                            break;
                                        case -537248566:
                                            str11 = "ۧۙ۟۠ۡۜۘ۠۠ۡۜ۬ۢۖۧۦۖۛۖۘ۫ۦۧۘۢۥ۬ۘۙۚ۬ۘۦۘۗ۬ۧ۫ۦۖۘ۫۫ۤۗۡۥۘۙۨۡ۟ۤۖ۬ۜ۟ۘۤۥۘ";
                                            break;
                                        case 275281633:
                                            str10 = "ۖ۠ۜۘۧ۟۟ۦۧۙۡۢۨۘۨۗۡۘۡۢۤۙ۫ۤۧ۟ۚۥۗۛ۫ۜۘۡۛ۠ۘۡۙ";
                                            break;
                                        case 329278048:
                                            str11 = it.hasNext() ? "ۡۧۦ۬۟ۤۢ۬ۚۧ۬ۥۘ۠۫ۘۘۚۛۙۙۥ۬ۧۜۧۜۥ۫۠ۥۨۘۖۜۧۛۗۗ" : "۟۫ۨۘ۠ۡۡۥۚۘۘۗۤ۠ۦۗ۫ۦۜۙ۫ۨۚۢۥ۠۠ۧ۬ۙ۟ۨۘۤ۬ۘۘ۟ۧ۫";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1018693180:
                    break;
                case 1116584602:
                    String str12 = "ۖۨۘۘۘۚۙۛ۟ۤ۬۫ۗۧ۬ۨۗۘۨۘۛ۫ۜۘۧ۟۠۫ۖۧۘ۫۫۟۟ۙۨۨۢۜۛۗۨۘۧۗۦۙ۬ۨۙ۟ۡۖۚۖۘۨۛ۠";
                    while (true) {
                        switch (str12.hashCode() ^ (-453685789)) {
                            case -1919524917:
                                break;
                            case -1518484944:
                                str12 = "ۥۗۘۥ۬ۤ۠ۛ۬۫ۥۖۘۙۜۨۘۢۤ۫۟ۛۚۧۤۘۘ۠ۜۡۚۡۤۖۨۘۗۜۘۨۤۙ۫ۧۥۢۙ۠ۘ۫ۢ";
                                break;
                            case 228709898:
                                String str13 = "ۖ۟ۦۘۙۡۗ۠ۧۡۘۘۚ۟ۚۦۘۘۙۢۜ۠۟ۘ۬ۨۛۙۘۜ۬ۦ";
                                while (true) {
                                    switch (str13.hashCode() ^ 835489054) {
                                        case -2017721470:
                                            str12 = "ۙۤ۫۟ۡۜ۫ۤ۟ۦۖۦۛۨۦۤ۫ۜ۠ۙۥۦۥۜۘۙ۟ۜۧۚۦۘۤۜۦۘۨۥ۟ۧۜ۬ۢۧۤۘۛۘۗۦۜۦۨۘۧۧ۠";
                                            break;
                                        case -892635957:
                                            str13 = next.getFile().delete() ? "ۢۛۛۖۜۨۧۦۡۘۦ۟ۙۙ۫ۘۘۡۛۦ۠۫ۤۡۛۡۘ۬۠ۤۧۡۨۜۨ۟ۨۘۤۗۗۤ۬ۨۖۛۨۡۡۜۦۘ۟ۡۗۨ۬ۨۘ" : "ۥۥۘۘ۬۠۫ۖۘۨۘۘۖۘۘۙۧۙۧۛۘۘۜ۬ۥۘۤۜۚۜۘ۟ۢ۬ۚۛۦۦۘۚۨ۬ۘۜۘۦۦۥۘۗۤۜۤ۫";
                                            break;
                                        case -80204855:
                                            str13 = "ۛۙۘۘۥۤۖۘۦ۬ۖ۬ۨۚۨ۫۟ۘۚ۬ۦ۟ۖۥ۬ۖۡۜۗ۬ۖ";
                                            break;
                                        case 1469248551:
                                            str12 = "۟۫ۨۘۡ۠۫ۥۡ۫ۜۘۢۖۢ۬ۛۥۖۘۙۥۜۘ۟ۖۢۢۡۥ۬ۤ۬۟ۤۦۙۧۧۧ۠ۖ۫ۤۘۘۢۡۧۘ۟۫ۡ";
                                            break;
                                    }
                                }
                                break;
                            case 913953169:
                                str = "ۡۡۨۘۘۦۨۘۡ۠ۖۘۖ۫۬ۛۡۘ۬ۗۜۛ۫ۘۘۥۨۥۚۗۘۘ۫ۖۜۨۨۨۗۘۛۚ۫ۧۤۖ۠ۥۡۘۗ۠ۖۘ۬ۜۧۘ۬";
                                break;
                        }
                    }
                    break;
                case 1423688448:
                    str = "۫ۧۚۨۛۛۜۘۢۖۚۢ۠ۜۨۥۦۘۙ۫ۘۘ۟ۙۚۛۛ۫۟ۥ۬ۢۡۢ۠ۚ۠ۜ۠۬ۚۥ۠ۢۜۧۘۨۢ۟";
                    it2 = this.Oooooo.iterator();
                    continue;
                case 1534977412:
                    AppContext.OooO00o().OooOO0(R.string.scriptlog_unselect);
                    str = "۠ۥۧۤۦۧۘۧۖۨ۠ۘۧۜۛ۠ۨۖۥۖۜۚۦۙۛۨۘۜۡۡ";
                    continue;
            }
            str = "۫ۛ۫ۚۤۡ۬ۢۖۤۛۜۦۧۢۨۤۥۘۜۘۘۜۗۥۨ۠ۡۥۛۖۘ۠ۥۗۨۤۡۘ۬ۦۗۖ۫ۙۥۡۧۡۥۗ";
        }
    }

    public static /* synthetic */ C4201o9 OooOOO0(ScriptLogActivity scriptLogActivity) {
        String str = "ۧ۟ۤ۠ۚۡۡۙۥۘۚۜۥۧ۟ۖۥ۬ۖۙ۟ۚۚ۠ۢۧۙۜۜۘۜ";
        while (true) {
            switch ((((str.hashCode() ^ 14) ^ 77) ^ 164) ^ 763184386) {
                case -1596676494:
                    return scriptLogActivity.OoooooO;
                case 267573321:
                    str = "ۨ۠ۢۢ۠۠ۖ۟۬ۧۗۖۘۧۢۥۘۦ۠ۘۥۖۘ۫ۘۢۧ۟۠ۡۤ۠ۘۢۛۦۢۡۘۨۚۦۘۤۧۖۘ";
                    break;
            }
        }
    }

    private void OooOOOO() {
        String str = "ۢۜۢۜۧ۟ۦۘۘۘۥۧۘۥۡۥۨۜۤ۟۠ۡۘ۫ۘۡۘۥۖۛۙۗۖۨ۠۫۬ۜۘۘۖۧۖۘ۠۠ۥۢۙ۠ۡ۟ۜۘ";
        int i = 0;
        ScriptLog scriptLog = null;
        File file = null;
        int i2 = 0;
        int length = 0;
        File[] fileArrListFiles = null;
        C4048k4.OooO00o oooO00o = null;
        while (true) {
            switch ((((str.hashCode() ^ 644) ^ 421) ^ 895) ^ (-1831128698)) {
                case -1977398819:
                    i = i2 + 1;
                    str = "ۘ۟۫ۗۥۜۖۙۥۘۦۧۜۘۨۥۨۘۨۥ۬ۥۘۜۥۧۖۧۘ۠۫ۡۗۡۧۛ۫ۦۜۘۡۦۗۧۧۙۖۖۙۖۚۨ۫ۖۘۜۤۖۘ";
                    continue;
                case -1681678401:
                    scriptLog.setName(file.getName());
                    str = "ۦۚۧۗ۬ۘۘ۫ۨۤۘۛۤۚۚۜۙ۠ۛۧۦۨۡۙۢ۟ۛۘۘۦۦۥۡۤۨۧۤۘۨۢۥۗۨۘۛۚۥۘۨۘۗۘۡۤۦۚۦ";
                    continue;
                case -1505638538:
                    str = "ۨۗ۫۠ۙۢ۬۟ۜۡۨ۟ۦۙۤ۬ۛۦۘۘۤۨ۬ۡۗۗۢۜۘۨۡۨۚۤۨۖۙۜۘ";
                    length = fileArrListFiles.length;
                    continue;
                case -1323476731:
                    str = "ۚۜۨۘۛ۫ۧۙۚۘ۠۠ۖۘۙ۠ۡۘ۟ۘۖۘۨۖۥۘ۟ۢۨ۫ۚۛ۟ۦۘۢۧ۫ۨۢۨۘۚۥۛۛ۫ۧ";
                    continue;
                case -1208268173:
                    Arrays.sort(fileArrListFiles, new C4348s8());
                    str = "۟ۚۘ۠ۧۖۘ۠ۧۨۘۙۙۡۤۜۖۘۦ۟ۨۘۤۨۧ۫ۤ۬ۘۦ۫ۢۜۨۖۨۘۜۤۘۘۥۨۧۘۖۖۜۘ۠ۦۘۛۗۦ";
                    continue;
                case -1111722120:
                    this.Oooooo.add(scriptLog);
                    str = "ۧۡ۟ۖۚۖ۟ۖۢ۠ۨۙ۟ۦۢۥۘۘۢ۫ۘۘۙ۟ۧۤۖۘۘ۟ۘۜۡۙۜۘۚۡۨۜۨۡۙ۟ۛۨۨۜۧۗۚۦۛ۫ۥۖۧ";
                    continue;
                case -1060786845:
                    String str2 = "ۗ۫ۖۘ۠ۚ۠ۦۢ۠ۨ۬ۜۡۚۦۚۡۗ۟ۜۥۘ۬ۛۖۘۥۢۦۢۛۜ";
                    while (true) {
                        switch (str2.hashCode() ^ (-951730564)) {
                            case -1909656208:
                                break;
                            case 358931195:
                                str2 = "۬ۘۖۘۙۘ۬ۚۨۚۥ۠ۘۚۙ۟ۚۥۧ۠ۡۘۧ۟ۢۨ۫۠ۖۨۗۧۥۘۧۘۖۘ";
                                break;
                            case 1367943290:
                                str = "ۡۤۙۚۦۜۡ۟ۨۖۚۡۗۚ۫ۡۤۛۥۡۘۗ۬ۖۘ۬ۘۡ۬ۜۥ";
                                break;
                            case 2018195038:
                                String str3 = "۬ۘۖۧۘۖۘۤۚۡۚ۫ۤ۬ۙۦۚۗۗۗۧۥۘۥۤۧۛۥۜۡۜۖۦ۟ۡۢۡ۠ۢۛ۟ۨۜۤ۠ۨ۬ۥۡ۟ۡۘۡۘۖۧ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1219930475) {
                                        case -2078753258:
                                            str3 = "۟ۚۦۥ۠ۙۚۢۜۘۛ۠ۜ۟۟ۘ۬ۖۡۘ۟۫ۨۢۦۙۛۙۨۤۗۨۘۚۛۡۖۖۡۜ۫ۡ۠ۛۢۜۤۢۗۥۧۗۨۛ۠";
                                            break;
                                        case -689763699:
                                            str2 = "ۖۙۨۥۖ۟ۚ۬ۧۡۧ۠ۨۙۖۡۤۖ۠ۜۙۘۥۙۘۥۤۨۦ۬ۢۖۜۙۘ۬";
                                            break;
                                        case 134600354:
                                            str3 = i2 < length ? "ۛ۠ۥۙۙ۬۫ۨۡۘۗ۠ۜۜۤۗۗۜۨۢۛۨۘۚ۬ۤۥ۠ۥۘۘۤۗۛۘۤۚۨۚۦۥۖ۠ۘ۬" : "۠ۦۦۘۤ۫ۨ۬ۘۘۘۗۙۖۘ۬ۚ۠ۚۨۦۘۖ۬ۘ۫ۡ۟ۦۚۘۘۙۚۨۘ۟ۘۥۘۗۚۗ";
                                            break;
                                        case 174014056:
                                            str2 = "ۡۗۙۘۙۦۘۜۛۜۘۤۙۧ۬ۛۨۘۘۜۡۜۚۘۘۢۜۛ۟ۙۚۙۢۦۘۤۤ۬ۢۤۥۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -763961228:
                    scriptLog.setFile(file);
                    str = "۠ۖۘۘۡۥۜۘ۠ۡۘۧۦۡۥ۬۟ۛۚ۟ۤۗ۬ۧۛۤۛۗ۟ۡۗۙ";
                    continue;
                case -197407715:
                    this.Oooooo = new ArrayList<>();
                    str = "ۧۡۖۘۜۥ۠ۜۜۜۜۤۚۗۙ۫ۥۡۚ۬ۘۜۥۚۖۦۢۚۙۚ۫ۛۧۤ۠";
                    continue;
                case 486585815:
                    str = "۟ۜۖۥۙۖۗ۫ۛۗۙۛۧۛۥۥ۬ۥۘۚۛۦۘۖ۫۬ۥ۬ۨۚۨ۠";
                    fileArrListFiles = new File(C3939h6.OooO0O0).listFiles(oooO00o);
                    continue;
                case 601732494:
                    return;
                case 643384211:
                    str = "ۢۨۧۘۖ۬ۛۢۜۡۘۛۦۨۘۦۤۢۧۜۜۘۚۛۦۚۧۚ۬ۨۥۘ۬ۧۦۘ";
                    continue;
                case 737922362:
                    scriptLog = new ScriptLog();
                    str = "ۗ۫ۧ۠ۤ۠۬ۧۡۘۜۖ۠ۧۢۗ۫ۥۚۚۢۚۘۡۜۙ۟ۖۘۖۖۘۚۤ۠ۜ۟ۚۥۨ۠۬ۘۥۘ۫ۤۘ۫ۤۥۘ";
                    continue;
                case 924936494:
                    str = "ۧ۟۫۠ۚۡۘۢ۬ۜۘۡۛۚ۠ۚۚۙۛۢۧۜۥۢۚ۠۬ۗۥۘۥۡۚۗۦۛۚ۟۟ۢۗۘۡۚۥۢۥ۫ۧۢۢۗۖۗۦۘ";
                    file = fileArrListFiles[i2];
                    continue;
                case 1012056131:
                    str = "ۛۙ۫ۚۖ۠ۛۜۢ۟ۚۗۦ۫ۖۡ۬ۚۜۖۥۧۨۘۤۖۦۚۦۧۙ۫ۡۘۥۚ۟ۙۦۦ۟۟ۖۘ";
                    i2 = i;
                    continue;
                case 1391601032:
                    scriptLog.setSize(C4048k4.OooO0Oo(file.length()));
                    str = "ۦ۠ۗ۠۬ۗۢۘۡۧۧۜۙ۠ۢۘۘۤۛ۬ۖۗۥۘۤۘۘۘۚۗۛۙۘۧۘ۬ۜۜۘۧۗۥۘۘۢۥۘۜۚۥۚۥ۬ۨۢۦۘ۟ۥ۬";
                    continue;
                case 1717492115:
                    String str4 = "ۛۡۚۛۛۥۖۖۡۘۙ۠ۜۖ۠ۜۘۛۦۥۘۥۡۦ۬ۜۦ۬۟ۦۜۡۢ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1398887866)) {
                            case -1294106610:
                                break;
                            case -1016206106:
                                str4 = "ۡۤۢ۬۫۟ۛۦۥۛۦۧۛۡۘۙۚۘۘۛۗۦۘ۬ۖۘۜۥۖۦۘۧۘۜۙۢۚۤۖۘۤۦ۬۠ۜ۟۟ۙۗۦ۠ۥ";
                                break;
                            case 520949729:
                                String str5 = "ۚ۠ۖ۬ۡ۠۫ۡۧۚۜۢۤۥۚۛ۫۟ۘۦۥۘۡۧۜۘۚۨۘۚۘۥۘۙۤۖۖ۫ۖ۠۫۟ۚۙۦۘۤۧ۫ۖۘۤۙۧۛ۠ۙ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1049428118)) {
                                        case -1914813843:
                                            str5 = "ۢۢۤۖۗۚۚۘۗۥ۟ۥۤۦۨۘ۬ۖ۬ۙۧۙۦۨۖ۬ۖۘ۟ۤۙۙ۟ۘۘۧۨۡۤۛۖۘۚۤ۫ۜۤۙۘۥ۟ۚۚۧۙ";
                                            break;
                                        case -789080582:
                                            str4 = "ۤ۬ۡۜۧۨۘ۟ۜۜۧۦۖۘۤۨۖۨۖ۬ۥۛۖۘۡۘۨۘۙۙۚ۠ۙۘۧۜۨۖۢۗۖۚۤۗۛۘ";
                                            break;
                                        case -424788109:
                                            str4 = "ۢ۫ۘ۫ۗۦۡۢۗ۬ۤ۠ۚۙۗۖۜۖۖ۬ۖۚۨۙۦۘۘ۫۫ۧۛۡۖۘۨ۟۠";
                                            break;
                                        case 1074110687:
                                            str5 = fileArrListFiles != null ? "ۦۗ۬ۧۛۜ۟ۢۦۚۥۦۘۨۦۚۤ۟ۘۘۨ۠ۛ۠۬۬ۗۤ۟ۥۥۘ" : "ۗۘۛ۠۠ۘۘۙۨۜۥ۬ۨۦۡۨۘۘۜۛۥۨۘۤۨۦۗۛۡۤۡ۟";
                                            break;
                                    }
                                }
                                break;
                            case 1163618846:
                                str = "ۦۡۙۤۦۙۤ۫۫ۦۦۘۘۗۥۖۙۤۨۘۗ۟ۥۙۨۛۜ۟۟۫ۤۡ۟ۦۚۛۛ۬ۚۥ۠ۛ۟ۨۦۥۘۨۛۜ";
                                break;
                        }
                    }
                    break;
                case 1755434535:
                    str = "ۜۚۡۘۘۛۥۧۘۦۖ۬ۖۦۛۘۘۧۘۚۡۘۖۘۧۧۦۘۚۧۡۦ۬ۜۘ";
                    oooO00o = new C4048k4.OooO00o(".log");
                    continue;
                case 1977286311:
                    str = "ۚۜۨۘۛ۫ۧۙۚۘ۠۠ۖۘۙ۠ۡۘ۟ۘۖۘۨۖۥۘ۟ۢۨ۫ۚۛ۟ۦۘۢۧ۫ۨۢۨۘۚۥۛۛ۫ۧ";
                    i2 = 0;
                    continue;
                case 1986485001:
                    str = "۬ۙ۬ۨۜۙۖۚ۟ۙۢ۟ۘۥۦۘۢۤ۠ۢۨۡۘۥۧۘۘۧ۫ۢۥۜۘۥۖ۟ۙ۬ۥ۟۟ۥۘۘۤ۫ۖۙۡۗۧۦۜۦۧۜ";
                    continue;
            }
            str = "ۜۧ۠ۘۡۥۘۘ۫۫ۙ۫ۙۚۘۦۥۚ۬۫ۛۖۤۢۤۨۖۥۘۡ۟ۤ";
        }
    }

    private void OooOOOo() {
        String str = "ۦۦۤۢۧۚۦ۟ۨۘۨۗ۠۫۬ۚۡۚۨ۫ۨ۠ۜۧۧۦۘۗۗ۬ۜۗ۫ۦۗۛۙۙۖۙۧ۬";
        C4201o9 c4201o9 = null;
        ListView listView = null;
        while (true) {
            switch ((((str.hashCode() ^ 240) ^ C2069a.f13171w) ^ 266) ^ 1194391187) {
                case -1600917347:
                    c4201o9 = new C4201o9(this, this.Oooooo);
                    str = "ۢۧۥۘ۟ۖۙۘ۫ۥۖۤۘۘۥ۠ۧ۬ۤۥۘۡۦۘۨ۬ۧۦۨۨ۠ۖۖۘ۟۠ۜۘۢ۟ۙ";
                    break;
                case -710101741:
                    this.OooooOO = listView;
                    str = "ۙۗۡۘۛ۠ۜۘۨۛۗۡۧۦۤ۬ۗۗۙۡۘۤۧۚۢ۠ۧۦۛۨۖۦۘۘ۠ۛۘۘۗۘۖۢۥۢ۬۟ۤۛۜۘۘ۟ۙۘۘۛۨۜ۠ۘۘ";
                    break;
                case -234169345:
                    str = "۟ۛۚ۠ۗۘۘۨۗۨۜۤۖۘ۬ۛ۫ۖۤۖۘۨۙۘۘ۠۬ۧۦۙۗۚ۫ۖ۠ۖۡۜ۬ۜۥۥۧۥۛۨۘ۫ۛۤۗۙۦۜۚۨۘ۠ۛ";
                    break;
                case -17402319:
                    str = "ۤۗ۫۬ۡ۬ۘۡۤۜ۠ۥ۫ۢۥۧ۫ۖ۠ۥۚۖۥۨۘۦۦۘ۠ۘۧۘۘۢۤۡۤۢۥۜۘۜۥۛۥ۫ۨۘ۟ۦۙۘ۠ۦۘۨۘ";
                    listView = (ListView) findViewById(R.id.listview_scriptlog);
                    break;
                case 123624764:
                    OooOOOO();
                    str = "ۨۛۨۢۥ۟ۥ۟ۖۥۤۥۘۥۖۙۘۨۦۘۧۚۡۚۗۧۘۢۨۡۖۘۤ۬ۖ۟ۚۙ";
                    break;
                case 313202292:
                    listView.setOnItemClickListener(this);
                    str = "ۖ۫ۚۖۖۢۖ۫ۤۦۧۖۧۦۢ۬ۙۧۛۤۦۧ۟ۥۜۥ۫ۨۥ";
                    break;
                case 743203368:
                    this.OooooOO.setAdapter((ListAdapter) c4201o9);
                    str = "ۘۘ۬ۡ۟۠۬۠ۡۚۚۨۘ۫ۜۜۦۘۦۥۘۗۛۤۧ۫ۥۨۢۗ۫ۖۜۦۧۖۘۡۘۧ۫ۜۧۘ۫ۘۡۜ۬۟ۚ۟ۨۗۦ";
                    break;
                case 814602569:
                    return;
                case 1568952571:
                    this.OoooooO = c4201o9;
                    str = "۬ۗۖ۬۟ۡۖۖۖۘۦۖ۬ۢۙۖۨ۠ۙۡۡ۬۫ۗ۫ۡۚۜۘۡۗۤ۠ۚۘۨ۬ۖ";
                    break;
            }
        }
    }

    private void OooOOo0() {
        String str = "ۙ۠ۘۘ۬ۨۜۢۚۦۧۢۡۘۦۧۦ۠ۥۘۤۜۥۖۘۦۘ۠ۨ۟ۜۤۘۘ";
        TitleView titleView = null;
        while (true) {
            switch ((((str.hashCode() ^ 485) ^ 316) ^ 233) ^ 495221774) {
                case -1480808696:
                    str = "ۚۡۤۙۨۡۗۧۨۚۢۨۚ۠ۧۙۙۤۙۖ۬ۢۜۨۘ۬ۡۙۦ۬ۡۘۢۨۢۦۦۘ";
                    titleView = (TitleView) findViewById(R.id.titleview_scriptlog);
                    break;
                case -1350024681:
                    this.OooooO0.setRightImage(R.drawable.ic_manage);
                    str = "ۥۢۖۚۘۢۡۚۢۤۘۦۦ۠ۛۥ۫ۖۘۢ۟ۖۖۜۨ۬ۥۖۛۥۘۗۗ۫ۤۛۢۘۨۦۜۦۨۘ۫ۢ۬ۢۢۡۘۡۥۚ۬ۨ۠";
                    break;
                case -852177084:
                    titleView.setTitleText(R.string.scriptlog);
                    str = "ۖۛۧ۬ۧۤۤۦۖۘۘۡۖۘ۫ۤۜۧ۟ۤۦۥۦۨۢۨ۫ۡۨۦۨۘ۬ۙۤۛۚۙۚ۠ۤۨۛۜ۟۬۬ۜۘ";
                    break;
                case 310202874:
                    this.OooooO0 = titleView;
                    str = "ۦۛۛۦۜۡۘۨۗ۬۠ۖۛۤۙۥۧۧۡۘۗ۟۬۬ۢۗۗۢۘۗۡۚۨۥۧۘۨ۫ۨۘۡۦۜۡۨۚۢۜۘۤۗۦۘ";
                    break;
                case 1091396781:
                    str = "ۧۛۗۛ۫ۛ۟ۜ۟ۦۡۨۘۗۛۚۜۖۥۘۘۧۘۘۙ۟ۥۘۥۛۚۗۙۛ۟ۛۛۦۘ";
                    break;
                case 1138629277:
                    this.OooooO0.setleftImage(R.drawable.ic_back);
                    str = "ۢۧۖۨ۬ۨۘۥۛۜۦۖۡۘۢۨۤۗۜۧۘۜۢۘ۬۬ۡۘۛۗۨۗۨۦۨ۠ۢۛۨۨ۠ۦۤۧ۫۫ۤۖۡۘ۫ۨۜۘ۫ۤۖۘۡۨ۠";
                    break;
                case 1341841703:
                    this.OooooO0.setOnRightImageViewListener(new OooO0OO());
                    str = "ۚ۫۠۠۬۫۠ۥۘۨۦۙۛۜۘ۬ۗۨۘۧۛ۠ۡۥۗۤۖۘۧۦۧۛۡۥۘۚۙۨۦ۬ۖۘ۠۟ۨۖۗۡۢ۟ۜ";
                    break;
                case 1599319725:
                    return;
                case 2093982018:
                    this.OooooO0.setOnLeftImageViewListener(new OooO0O0());
                    str = "۠۠ۖۘ۠۬ۘۦ۟ۚۦ۫ۗ۫ۚۜۘۨ۬ۘۘ۫ۘۨۘۦۙۦۧۗۨۘۡۢۜۘ";
                    break;
            }
        }
    }

    private void initView() {
        String str = "۟ۙۡۘۛ۫ۢۛۧ۠ۥۖۜۜ۫ۘۘۥۥۗۗۗ۠۟ۖ۟ۘۗۙۥ۠ۧ۠ۖ۠ۡۖۢۦۢۜۘۙۦۦۛۥۜۘۧۘۤ";
        while (true) {
            switch ((((str.hashCode() ^ 285) ^ 800) ^ 827) ^ (-1889457345)) {
                case -1988501872:
                    this.OooooOo.setOnClickListener(this);
                    str = "ۥۨۦ۫ۡۘۘۢۙ۟ۨ۟۫ۤۨۖ۬۟ۥۘۧۛۨۘۜ۫ۖۢۨۢۡۛۨۖۚ۠ۦۗۨ";
                    break;
                case -1087700412:
                    this.Oooooo0.setOnClickListener(this);
                    str = "ۘۥۜۙۗۙۚ۫۬ۚۡۙۛ۟۠ۦۘۘۘۘ۠ۙ۠ۜۚۡۨ۬ۖۤۜۘۤ۟ۗۡۖۦۘۘۧۦۙ۫ۦ";
                    break;
                case 236923424:
                    str = "ۨ۫ۙۦ۟ۖۘۛ۫ۧۥۙ۟ۦۙۡۦۥۥ۟ۢۜۘۗۧ۟ۙ۬ۖۢۘۨۘۦ۫ۘۡ۟ۡۥۦۦ۠ۡۖۘۚۡۗ۠ۘ";
                    break;
                case 688076912:
                    return;
                case 779651284:
                    OooOOOo();
                    str = "ۨۥۥۜۙۨۢ۫ۢۛۤۨۘ۟ۖۥۛۨۧۡۦۘۦۜۥۧۗۤۥۡۖ";
                    break;
                case 1056383684:
                    this.OooooOo = (Button) findViewById(R.id.btn_scriptlog_removeall);
                    str = "۟ۦۖۥ۬۟ۗۖۜۜۛۚۦۥۨۘ۠ۗۥۘۢ۠ۤۚۤۨۨۙۗۚۚۘۘ۟ۤۥۘۗۗۘ۠۟ۜۖۘۘ";
                    break;
                case 1451914687:
                    OooOOo0();
                    str = "ۥۢۘۘۗۡۛ۟ۜ۫ۤۚۧۘۚۜۥۘۘۘۗ۬ۤۘ۠ۦۘۙۧۛۚۛۨۘۢ۫ۧۥۨۡۡۧۘۛۙۖۦ۠۟۫ۢۖۘ";
                    break;
                case 1903917618:
                    this.Oooooo0 = (Button) findViewById(R.id.btn_scriptlog_selectall);
                    str = "ۗۖ۫ۗۙۦۧۧۗۚۦۡۛۖۘۡۙۥۘۛۗ۟ۖۙ۫ۧۙۤۢۢۤ";
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Iterator<ScriptLog> it = null;
        String str = "ۤۘ۠ۖۗۥ۫ۦۘۗ۫ۙۥۖۖ۠ۥۢ۬ۨ۠ۧۧۘۘ۫۠ۡۘۚۜۘ۠ۧۙۢۨۥۜ۠ۚ۫ۗ۠۠ۗۨۘۚ۫۬";
        while (true) {
            switch ((((str.hashCode() ^ 33) ^ PointerIconCompat.TYPE_ZOOM_OUT) ^ 926) ^ 1372284189) {
                case -2037177312:
                    str = "ۥۤۘۡۥۨۘۘۤۖۙۗۚۢۚ۬ۘۛۘۖ۟۠ۗۡۜ۟ۥۥۜۡۤۡۧۤ۫ۦۜۘۘ۬ۘۗ۫ۡۥۜۜۖ۟ۧ";
                    break;
                case -1733475663:
                case -1032954010:
                    str = "۠۠ۗۥۡۦۘۘۙۤ۠ۘۢۡ۠ۨۗ۬ۗۦۥۖۛ۟ۨۛۢۥۘۗۡ۬ۨۘۤۜ۟ۦ۫ۜۘۖ۟ۜ۫ۨۢ۟۠";
                    break;
                case -1242477340:
                    it.next().setSelect(true);
                    str = "ۨۦۚۧۡۢ۫ۘۨۗۜۦۘۜۦۚۦۘۨۡۖۖۖۤۧۗۗۨ۟ۤۧۢۜۘۡ۫ۗۗۧۢۧ۟۠۠ۖ۟ۚۘۜۘ";
                    break;
                case -798745966:
                    str = "ۘ۟ۦۘۙۛۗ۠ۙ۬ۙ۬ۖۢۥۨۘۚۡۘۜۖۘۘ۠ۗۡۘۛۨۛۙۥۜۚۦۡ۬۬";
                    break;
                case -404140652:
                    OooOOO();
                    str = "۠۠ۗۥۡۦۘۘۙۤ۠ۘۢۡ۠ۨۗ۬ۗۦۥۖۛ۟ۨۛۢۥۘۗۡ۬ۨۘۤۜ۟ۦ۫ۜۘۖ۟ۜ۫ۨۢ۟۠";
                    break;
                case 145576889:
                    str = "ۚۦۦۘ۟ۦۖۥۖۘۤۡۡۘۡۘۙۖ۠ۡۤۦۘۧۢ۠ۨ۫ۚۥۧ۫۬ۘۜۘۚۧ۟";
                    break;
                case 525646316:
                    return;
                case 1118376549:
                    switch (view.getId()) {
                        case R.id.btn_scriptlog_removeall /* 2131296823 */:
                            str = "ۘۘۜۘ۠ۚۖۘۢۡۘۗۖۚۡ۫ۨۘۙۚۤۛۨۡ۬ۜ۠ۢۡۚۙ۟۠ۥۤۛۜۘ۟۠ۙۛۨۘۡۘ۬ۥۦۘۥۖۡۘ۠۟ۡۘ۫ۢۥ";
                            break;
                        case R.id.btn_scriptlog_selectall /* 2131296824 */:
                            str = "ۘۖۡۛۢۛ۫ۖۡۘۘۦۛۜ۟ۗ۟ۢۦۨۖۧۡۧۡۘۨۗۥۜ۬ۥۘۜۜ۠ۖ۠ۦۘۢۜۚۖ۟۟";
                            break;
                        default:
                            str = "ۡۗۗۘۢۧۗۤۨۢۥ۫ۡۢۨ۫ۛۤۗۤ۫ۥۧ۬ۨۨۤۗۜۧ۟۟ۚ۠ۥۛۦۘۗۖۦۘ";
                            break;
                    }
                    break;
                case 1586901535:
                    it = this.Oooooo.iterator();
                    str = "ۚۦۦۘ۟ۦۖۥۖۘۤۡۡۘۡۘۙۖ۠ۡۤۦۘۧۢ۠ۨ۫ۚۥۧ۫۬ۘۜۘۚۧ۟";
                    break;
                case 2031975763:
                    String str2 = "۠ۢۥ۬ۙۥۘۛ۫ۙۦۡ۟ۙ۫ۨۛۧۖۘ۫۬ۖۘۘۗۜۘۤۘۤ۫ۖ۫ۘ۟ۦۘۘۖۗ۟ۥۥۘۥۛۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1521960764)) {
                            case -96678456:
                                str2 = "ۡ۬ۦ۫ۧۜۘ۬ۤۛۦ۠ۛ۬۠ۚۨۘۢۖۦۦۧ۫ۜۗۨۘ۫ۥۨۢۢۛۥۤ۬ۤۚۥۘۙۗۛ۫ۥۘۨۡۚ";
                                break;
                            case 1159124588:
                                str = "ۧۢۢۥۚۜۘ۟ۧۢۦۘۚ۠۠ۙۨۦ۫ۦۤۨ۬ۧۨۘۧۥۨۧۥۨۡۙۦۨۖۘۛۧۙۜۨۧۘۚۤۦۤ۟ۥۘۛۥۧ۬ۖۜۘ";
                                continue;
                            case 1484030587:
                                str = "۬ۨۤ۟ۡۥۙۛ۟ۧۖۨۘۧۦۖۘۖۢۘۘۡۢ۠ۘۖۤۗۡ۬ۦۖ";
                                continue;
                            case 1900722383:
                                String str3 = "۫ۖۨۘ۬۠ۛۚۘ۠۠۠ۥۤۢ۫ۦۦۗۛۖۦۤۦۚۘ۠ۚۚۦۖۘ۫۠ۡۘۨۜ۬ۢ۬ۤ۫";
                                while (true) {
                                    switch (str3.hashCode() ^ 1167983002) {
                                        case -379950400:
                                            str3 = "ۖ۫ۙ۟ۘۥۤ۟ۘۘۨ۠ۧۜۥ۟ۖۨۙۧ۬ۗۢ۟ۡ۫۬ۚۚۛۙۖ۠۠ۗۙ۠ۚۜۘۛۨۡۘۛۢۢۥ۬ۚ";
                                            break;
                                        case 871878310:
                                            str2 = "ۛۡۡۘۧۧ۫ۘۜۙۧۧۥۚۤۛۘۘۨۤۦۙۗۨۢۗۦۢۤۡۥۘۖۥۡۤ۠ۘۘۚ۟ۦۘ۫ۤۢۙۚۨۘ۠ۗ۬";
                                            break;
                                        case 1928464172:
                                            str2 = "ۚ۬ۙ۟ۘ۟ۡۦۢۤۢ۫ۡ۠ۗۧۛۙۗۨ۟ۨۨۧۛۤۢۜ۫۬ۙۜ۟ۡۧۜۢۦۗۨۖۦۤۖۘۥ۫ۜ";
                                            break;
                                        case 1996523705:
                                            str3 = it.hasNext() ? "۠ۡۗۛۗۜۛۢۥۡ۫ۡۧۦۧ۫ۜۥۘ۫ۖۖۘۨ۬۟ۗۙۖۘۛۙۖۘۥۡۘۧۡۧ" : "ۡۢ۠۟ۜۘۘ۫ۢۨۘۦ۬ۨۘ۠ۥۖۘۤۧۚۜۦ۠ۤۗۚۦۤ۫ۘۤۧۡۢۨ۬ۥ۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 2115777685:
                    this.OoooooO.notifyDataSetChanged();
                    str = "ۧۙۦۘۜۖۨۤۥۧۘۘۚۡۖ۬ۛۢۛۦۘۧۧۘۜ۬ۛ۠ۛ۠ۥۗ۟ۚۡۛ۟ۖ۫";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۛۢۨۘۖ۟ۖۚ۫ۤۦۛۧۡۢۘۘۡۙۖۖۡۧۧۛۧ۫ۖۧۘۨۨۥۘۡۧۖۘۛۛۖۦۥۘۖۦۦۘ۟۟ۡ۫ۥۘۘۙۤۖۘۚۙۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 157) ^ 47) ^ 468) ^ (-667188644)) {
                case -1401902107:
                    str = "۠ۜۥۦۛۦۚۤۖۘۖۘۜۘۥۖۦ۬ۢۘۛ۟۬ۘۦۡۘۤۤۙۘۨۨۘۡۗۨۛ۠ۘ۫ۡۡۘۗۙ۟";
                    break;
                case -369837966:
                    super.onCreate(bundle);
                    str = "ۤۜۙۗۤۖۜۜۘۨۨۨۦۤ۠ۜۖۘۘۥ۟ۙۙۗۘۘۦۦۤ۬ۢ۠ۗۘۙ۠۬۬۟ۦ۬۬۫ۜۘۢۜۧۘ۟ۚ۫";
                    break;
                case -308067522:
                    return;
                case -40295545:
                    initView();
                    str = "ۨ۬ۥۘۜۧۖۡۜۥۡۨۧۥۧۦۘۖ۠۟ۗۚ۬ۘۤۨۘ۬۫ۙۜۢۦۘ";
                    break;
                case 1612623742:
                    str = "ۜۡۛۤۥۘۚۖۨۘۖۙۥۘۚ۟ۥۗۥۦۛۦۚۧۡۨۗۙۗۖۚۢۥۨۘۙۚۖۗۙۜۘۘۨۡۘ";
                    break;
                case 1651420022:
                    setContentView(R.layout.activity_scriptlog);
                    str = "ۥ۫ۗۚۖۙ۟ۡ۬۟ۡ۫ۥۤ۬ۖۙ۟ۛۖۡ۫ۜۜ۬۟ۧۜۖۗۛۖۚۛۡ";
                    break;
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = "۬ۥۤۗۗ۫۟ۙۡۗۚ۠ۡۡ۟۟ۛۦۘۙۛۡۙۦۖۘۤۢۨۘۛۨۜ۫ۜ۠ۨۜۙۧۥۜۗۨۘ";
        Intent intent = null;
        ScriptLog scriptLog = null;
        while (true) {
            switch ((((str.hashCode() ^ 452) ^ 386) ^ 816) ^ 1059795515) {
                case -2045105958:
                    str = "ۢۚۛ۠ۧۤۤۧۡۦۘۜ۫ۖ۫ۧ۟ۢ۫۫ۚۤ۠ۤۤۡۥۥۘۘۖۛۨۦۢۖۘۜۛۦۘۚۜ۠";
                    break;
                case -1841199095:
                    str = "۫ۗۡۤۘ۠ۡۛ۟ۘ۠ۛۛۤۖۘۖۥۖ۠ۨ۠ۥۘ۬ۖ۫ۤ۟ۢۘۧۧ۟ۚۥۖ";
                    break;
                case -1732403988:
                    return;
                case -874578428:
                    str = "ۚ۬۠ۨۧ۬ۜۨۤۘۨۦۘۚۛ۠۫ۦۗۛ۬۠ۘۡۢۗ۠ۧۗۗۜۘ۟ۨۗ۠ۥۡۘۤ۫ۙۤۢۥۘۜۧ۬ۨۜ";
                    break;
                case -870878582:
                    intent.putExtra(InterfaceC3865f6.OooOoOO, scriptLog);
                    str = "۬ۚۥۘۧۡ۫ۗۧۘۘۘ۬ۦ۟ۖۖۘۤۗۢ۬ۡۗۤۡۘ۠ۜۢ۠ۡۥۘ۫ۧۤۥۘۚۤۦۥ۠ۢۡۘ۬ۙۡۤ۠ۘۘۙ۫ۨۖۡۦ";
                    break;
                case -399060784:
                    intent = new Intent(this, (Class<?>) ScriptLogDetailActivity.class);
                    str = "۟۬ۧۧۛۡ۫۫ۜ۬ۢۡۙۚ۠ۨۘۙۛ۫ۢۧۥۦ۫ۛۤۨ۬ۡۘۚۖۖۘۗۡۢ";
                    break;
                case -304997632:
                    intent.putExtra(InterfaceC3865f6.OooOoO, false);
                    str = "۫۬ۜۙ۫ۦۘۚۖۦۘ۠ۦۗۤۖۜۘۜ۠ۥۤۛ۫ۗۧ۟ۗۨۥۘۨ۟ۖۘ";
                    break;
                case -285228821:
                    String str2 = "ۧ۠۟ۛ۟۬ۢۖۧۚ۬ۥۘۧ۟ۜۘۙۦۡۘۚ۠ۘۘۨۙۘۥۦ۟ۤۜۖ۫۫ۦ۫ۖ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1904753942)) {
                            case -2137009708:
                                str2 = "ۡۙۘ۠ۤ۫ۛۘۘۘۥۘۢۨۘۢۧۡ۟ۦ۫ۤۜۖۘۤۛۨۘۗۘۗۦۛۢۖۙۜۘۨۚۘۙۜۜۘ";
                                break;
                            case -1007163500:
                                String str3 = "ۘۛۖۨۡۙۦۤۥۗۚ۫۬ۡۥۨۙۚۤۡۗۥۦۖۥۥۨۘۜۜۨۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-430366452)) {
                                        case -1676291907:
                                            str3 = "ۖۢۗۡۤۨۖ۫ۤ۫۠ۨۘۖۡ۠ۚ۬ۨۘۘ۫ۜۘۛۗۙ۠ۘۘۦ۠ۚۛۛۘۦ۠ۥۘۗۧۜ۫ۖۗ";
                                            break;
                                        case -1063808520:
                                            str2 = "۬۠ۖۘۗۨۧۗۙۦۤۧۡ۬۠ۘۘۚۢۘۘۘ۠ۨۘۖۧ۬۬ۨ۬ۤۙۤۘۨۚۗ۬ۖۘۖۛۜۘ۫ۘۡ";
                                            break;
                                        case 1367523364:
                                            str2 = "ۜۧۛ۫ۨۛۘۗۛۦ۠ۜۜۘۡ۬ۖۘۛۤۜۙ۠۟ۦۜۖۘ۬ۧ۠ۤۚۧ۟ۙ۬ۛۖ۫ۜۜۙ۠ۨۤۡۢ۠۠ۛۗۨۤۡۘ";
                                            break;
                                        case 1646070446:
                                            str3 = !this.Ooooooo ? "۬ۢۧۘۙۥۧۜۡۧۤۤۤۧۦۢ۠ۤۨۡۘۘۘۨۘۚۦۘۦۘۧۘ" : "ۛۚۦۘ۠ۨۨ۟ۗۨۘۙۜۨۦۨۗۖۨ۫ۤۚ۠ۡۜۘ۠ۡۤۗۧۤۨۙۜۘۚ۟ۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case 748109213:
                                str = "۠ۧۗ۫ۚ۟ۚۘۡۤۤۜۘۤۦۥ۬۠۠ۛۨۗۤۗۧۚۥۘۧ۟ۖۗۙ۟ۖ۠ۖۘۧۨۙۦۙۥۘۨۤۧ۠۫۟";
                                continue;
                            case 840571393:
                                str = "۬ۖ۟ۘۢۖۘ۟ۦۘۘۢۜۡۦۨۘۘۢۦۘۢۛۥۚ۬ۜۘۗ۬ۧ۬ۖ۫ۛۧ۟ۜ۬ۖۖۢۜۚ۫ۘۘ";
                                continue;
                        }
                    }
                    break;
                case -192221384:
                    startActivity(intent);
                    str = "۠ۧۗ۫ۚ۟ۚۘۡۤۤۜۘۤۦۥ۬۠۠ۛۨۗۤۗۧۚۥۘۧ۟ۖۗۙ۟ۖ۠ۖۘۧۨۙۦۙۥۘۨۤۧ۠۫۟";
                    break;
                case 369953386:
                    str = "ۡۜۙۤۢۥۘۨۢۥۛۚۡۘۘ۟۟ۚۘۢۚ۫ۗۨ۟ۙۢۤۢۥۨۖۘۥۛۚ۠ۛۡ۬ۘۖۘۡ";
                    break;
                case 1707418375:
                    str = "ۦۤۙ۬ۘۜۛۡۧۘۘۡ۫ۚۤۜۚۖ۠۫ۚۥۦۥ۬۬ۥۗۙۨۘ۫ۡۘۜۘۜۘ۫ۡۘ۬ۖ۬ۚۙۧۥۘۖۘ۟ۙۡۘۤۧۘ";
                    break;
                case 1878754901:
                    str = "۫۟۬ۧۗۨۢۖۡۙۦۨۘ۠ۧۧۤ۟ۡۚ۠۠ۖۚۨۗۦۚۙۚ۠ۖ۫ۜۘۡۥۛۧ۟ۨۘۧۡۜۥۜۗۧۥۙ";
                    scriptLog = this.Oooooo.get(i);
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "۟ۙۖۘ۫ۖۧۢ۠ۢۜ۟ۤۥۚۘۘۖ۠ۘۘۙۚۡۘۙ۫۠ۡۥۤۛ۬ۗ";
        while (true) {
            switch ((((str.hashCode() ^ 744) ^ 436) ^ 917) ^ (-1418535988)) {
                case 208592878:
                    C3691ah.OooO0OO(ScriptLogActivity.class.getCanonicalName());
                    str = "ۧۖۛۛۡۢ۫ۧۡۘ۫ۤۨۘۖۡۘۘ۟ۢ۬ۘۨۜۙۧۨۗۤ۠ۤۦۙۛۗۖۢۚ۠ۗۛۧۖۥۘۦۨۤۚۡۜ۠ۨۘۧۙۖ";
                    break;
                case 310029946:
                    C3691ah.OooO0o0(this);
                    str = "ۡۜۡۘۧۖۛۢۜۙۡۨۜۘ۟ۤۥۧۜۗۥۖۤۛ۟ۦۘۡۙۛۘۨۥۨۘۨۗۨۘۘ";
                    break;
                case 939810717:
                    return;
                case 1259033185:
                    super.onPause();
                    str = "ۢۨۗۤۢۨۙۛۗۘۘۥۘۗ۟۟ۦۚۙۢۡۖۘۙ۬ۚۘۜۨۤ۠۟ۙۦۡۦۥۤۜۡۗ۠ۦۦۘۦ۟۫ۗۢۛۥۙۥۥۙۡ";
                    break;
                case 2145849317:
                    str = "۫ۡ۬۬ۛ۠ۜۖۙ۫ۚ۟ۨۤۛۛۥۢ۟۟۬ۤۧ۬۟ۢ۠۟ۖۘۗۢۥۦۢۙ۠ۘۧۨۖۨۘ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "۠ۜۖۥ۟ۥۙۦۧۛۗ۟ۥۛۨ۠ۜۘۘ۠ۥۥۤۗۛۦۛۗۖۨ۠ۙ۠۟۫ۡۙۗ۬ۧۨۢۖ";
        while (true) {
            switch ((((str.hashCode() ^ 478) ^ 150) ^ 522) ^ 473753485) {
                case -1557468575:
                    super.onResume();
                    str = "ۧۖۨ۟ۜۥۛۥۢ۟ۢۖۘۚۧۖۘۢۦۨۛۡۘۘۥۨۥ۠ۗ۬ۤۦۘۦ۬ۧۢۢ۠ۥۢۗۚۡۤۚ۟۫ۘۖۦۘۨۦۘۦ۬۠";
                    break;
                case -1036571470:
                    str = "۫ۙۛۡۗۨۧ۟ۥۘۘۖۖۘ۫ۧۦۧۦۖۜۧۤۖۦۢۜۗۧۨۦۥۜۘۘۗۚ";
                    break;
                case 69834481:
                    C3691ah.OooO0Oo(ScriptLogActivity.class.getCanonicalName());
                    str = "ۘۙۛۧۖۡۘ۟ۛۡۘۢ۟ۛ۫۠ۜۖۨۖۘۖۧ۠ۘۙۡۘۦ۬ۦۦۡ۬ۙۚۢۙۘۤ۫ۛ۟۬ۙ";
                    break;
                case 367270015:
                    C3691ah.OooO0o(this);
                    str = "ۨۚۗ۬ۨۦۘۜۖۨۘ۠۫۟ۚۤۜ۟ۗۤۙۧۥۗۛۦۛۢۗ۠۬ۙۖ۠۫۠ۜۨۘ۫ۖۖ۠ۡۘۜۗ۠ۡۨۢۦ۫ۧ۠ۘۨۘ";
                    break;
                case 2039309083:
                    return;
            }
        }
    }
}
