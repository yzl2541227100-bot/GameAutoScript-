package com.cyjh.elfin.p200ui.view.customview.loadwidget.swiperefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentManagerImpl;
import com.cyjh.elfin.p200ui.view.customview.loadstate.LoadStatueEnum;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import p285z2.C4587yp;
import p285z2.InterfaceC4350sa;
import p285z2.InterfaceC4424ua;

/* JADX INFO: loaded from: classes.dex */
public class BaseListView extends ListView implements AbsListView.OnScrollListener, InterfaceC4424ua {
    private static int OoooooO = 5;
    private boolean OoooOoO;
    private LoadStatueEnum OoooOoo;
    private int Ooooo00;
    private BaseFootView Ooooo0o;
    private InterfaceC4350sa OooooO0;
    private int OooooOO;
    private int OooooOo;
    private OooO00o Oooooo;
    private int Oooooo0;

    public interface OooO00o {
        void onScroll(AbsListView absListView, int i, int i2, int i3);

        void onScrollStateChanged(AbsListView absListView, int i);
    }

    static {
        while (true) {
            switch (((("ۤۛۘۘۜ۟۬ۧۖۙۙ۠۟ۡۢۘۙۗ۠ۙۚۤۨۘۧ۠ۧۡۘۛۦۚۤۤ۟۠ۨۘۜ۬۬ۦۛۤ".hashCode() ^ 344) ^ 135) ^ 979) ^ 868126811) {
                case 1423158881:
                    return;
            }
        }
    }

    public BaseListView(Context context) {
        super(context);
        this.OoooOoO = false;
        this.OoooOoo = LoadStatueEnum.NON;
        this.Ooooo00 = 10;
        OooO0oO();
    }

    public BaseListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OoooOoO = false;
        this.OoooOoo = LoadStatueEnum.NON;
        this.Ooooo00 = 10;
        OooO0oO();
    }

    public BaseListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OoooOoO = false;
        this.OoooOoo = LoadStatueEnum.NON;
        this.Ooooo00 = 10;
        OooO0oO();
    }

    private void OooO0oO() {
        String str = "ۘۙۘۗۘۥۘۨ۬۟ۤ۠ۦۥۛۡۘۨۥۥۢ۬ۦۘۡ۠ۗۥ۬ۜۘۛۙۖۘۢۗۗۧۖۘۜ۫۟ۤۘ۠ۜۤۘۘ۬۟ۜ۬ۚۛۥۜ";
        while (true) {
            switch ((((str.hashCode() ^ 983) ^ 229) ^ 873) ^ (-442295020)) {
                case -1996453799:
                    return;
                case 1698061786:
                    setOnScrollListener(this);
                    str = "ۧۚۨۛۙۤۦۙ۬۟ۨۖۦۡۖۘۡۗ۬۟ۚۤ۬ۡۘۖ۫ۘ۠۬۠ۚ۬ۛۥ۫۠ۥۛۨۘۤۗۨۧۡۨۘۖۜۦۘۧۛۨۤۥۖۘ";
                    break;
                case 2039325227:
                    str = "ۦۥ۠ۘۜۧۜۡۢۛۨۘۚۨۦۗۛۤۛ۠ۢۦۦۜ۟ۨۢۥۘ";
                    break;
            }
        }
    }

    private void OooOOO0() {
        String str = "ۖۥۗۖۨۦۘۤ۠۟۟ۡ۫ۗۤۦۤۛۜ۬ۛۥۛۤۘۖۥۖۜۙۚۙ۟ۡۘ۟ۖۥ";
        boolean z = false;
        boolean z3 = false;
        while (true) {
            switch ((((str.hashCode() ^ 907) ^ 632) ^ 820) ^ 964454131) {
                case -1241901090:
                    OooO();
                    str = "ۘۥ۠ۡۨ۟ۚۤۧۗۛۨۚۤۜۘۛۛۖۘۛۡ۠ۢ۬ۙۙ۠ۘ۠۟ۜۗۢۥۛ۟ۤۘۘۡۡۤۡۗۗۖۘۢۘۢۦۘۜ۠ۜۘ";
                    break;
                case -1210954381:
                    str = "ۦۨۧۗ۬ۘۖۦۜۘ۬ۚۢۨ۠۟۫۟ۢۡۡۘۨۚۖۘۧۡۙۥۥۚۤۖۢۧ۫ۛۙ۟ۚۦۢۡۥۘۤۘۘۡ";
                    z = false;
                    break;
                case -991826405:
                    str = "ۦۨۧۗ۬ۘۖۦۜۘ۬ۚۢۨ۠۟۫۟ۢۡۡۘۨۚۖۘۧۡۙۥۥۚۤۖۢۧ۫ۛۙ۟ۚۦۢۡۥۘۤۘۘۡ";
                    break;
                case -983404982:
                    String str2 = "ۢۖۖۘ۬ۖۨ۫ۧ۬ۢ۬ۦۨۧۘۚۤۗۤۘ۬ۖۙۢ۬ۘۨۘۜۡۜۨۦۛۦۡۖ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1125592389)) {
                            case 215213130:
                                str = "ۨۖ۠ۘۚ۬ۤۡۘۧۘۨۘۛۜۚۥۥۡۘۡۘۖ۟۠ۨۘ۟ۗۗ۟ۥۦۢ۬ۢۡۢۦۤۖۥ۟ۜۨ";
                                continue;
                            case 1632757571:
                                str = "ۘۥ۠ۡۨ۟ۚۤۧۗۛۨۚۤۜۘۛۛۖۘۛۡ۠ۢ۬ۙۙ۠ۘ۠۟ۜۗۢۥۛ۟ۤۘۘۡۡۤۡۗۗۖۘۢۘۢۦۘۜ۠ۜۘ";
                                continue;
                            case 1634743441:
                                String str3 = "ۘۨۥۘ۫ۙۗۖ۟ۢۗ۬ۖۥۜۥۘۨۗۡ۟ۧۥۘۙۜ۬ۥۜۨۘۧۚ۬۬ۗۡۛۙۜۧۗۢۢۢۨۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-292303626)) {
                                        case -429155177:
                                            str2 = "۬ۘۤۖۚۥۘۧۙۛ۠ۨۙ۬ۦۙۜۜۡۡۙۢۙ۫۫۠۟ۨۚۤ۟۫۫ۜۘ۬ۧۢۥۚۧۨۢۙۢۥۨۘۛ۬ۨۘ";
                                            break;
                                        case -21355670:
                                            str3 = z ? "ۖۛۨۘۢۚۡۗ۠ۧۙۘۧۘۤۥ۟۫۬ۖۚۡ۟ۗۙ۠ۢۙۘۨ۠ۙ" : "ۗۢۤۗۥۘۨۘۖ۬ۖۚۦ۬ۨۘۛۢۥۘۖۡۦۜۤۤ۟ۗۨۘۤۜۡۘۜۤۘ۠ۚ۟ۚۚ۬ۦۥۡۧ۟ۥۘۢۨۖۘ";
                                            break;
                                        case 156652257:
                                            str3 = "ۗۖۨۘۖۥۙۡ۫۬۬ۡۙۚۗۨۘۢۨۧۗۦۗۘۘۨۧۘۘۤۧۨۘۚ۬۬۬ۤۗ";
                                            break;
                                        case 1595532830:
                                            str2 = "۫ۨۦۘۡۜۦۘۨۦۘ۬۟ۨۡۘۨۘۗ۠ۡۧۡۘۜۨۚۚ۬ۡۖۢۘ";
                                            break;
                                    }
                                }
                                break;
                            case 2083278812:
                                str2 = "ۜ۫ۦۖ۟ۜۘۙ۬ۚ۟ۦۚۨ۫۟۫ۘۖۘ۬ۧۚۗۙۜۜۦۘۢۚۘ۫ۥۜۘۨ۟۫۟۠ۘۨۡۡۘۡۥ۫ۦۦۡۛۗۙۘۢۥ";
                                break;
                        }
                    }
                    break;
                case -440211091:
                    str = "ۖۧۥۘۧۙۘۚۙۘۘۤۖۗۙۘۨۘۙۨۘۘۤۥۤ۫۬۬ۧۥۙۜ۟ۥۢ۠۠ۙۨۜۘۢ۫ۙۢۗۘ";
                    z = z3;
                    break;
                case -163543153:
                    String str4 = "۫ۛۥۢۡۜۤ۠ۦۘ۠ۜۛۡۡۖ۠ۗۖۚۢۜۘۜۙۗۤۢ۫۟ۖۤۚۖۘۖۘ۫ۛۦۧۘۜۥۚ";
                    while (true) {
                        switch (str4.hashCode() ^ (-2027639649)) {
                            case -2020921940:
                                str4 = "ۧ۟ۡۘۜۜۥۘۛۙۖۘ۠ۛ۫ۗ۟ۜۘۥۛۨۨ۬ۛۡ۬ۛ۫ۡۖۤ۠ۧۛۡۨۛۨۖۘۛۤۖۘۙۧۨ";
                                break;
                            case -1307032131:
                                str = "ۡۢۨۘۨۤۙۧۧۛۥۨۧۘ۬ۥۥۘۛ۫ۙۥ۬ۨۡۥۡۘۗ۠۬ۜۘ۫ۚۨۖۡۖۘۜۚۦۘۙ۟ۗۨۥ۬ۨۡۧ";
                                continue;
                            case 1191306299:
                                String str5 = "ۜۗۙۨۤۖۘ۬ۚۥۘۛۜ۬ۙۘۜ۫ۛۚۨۧۖۘۙۜۚۘۢۤ۠";
                                while (true) {
                                    switch (str5.hashCode() ^ (-630723508)) {
                                        case -846782067:
                                            str5 = this.Oooooo0 == 0 ? "ۧۛۨۤۦ۠ۦۨۥۘۥ۫ۛۡ۠ۦۘۤۨۥۘۚۚۗۧۤۖ۫ۢۦۘ۫۫ۥ۠ۥۘۨۙۘۘ۟۬ۡۥۗ۬ۡۦۜ۠ۥ۟" : "۟ۥۡۘۨۘۚۗۛۧۧۡۦۜ۟ۚۥۘۖۘۧۘۗۖۘۧ۫ۖۘۗ۬ۥۘۧۛۥۘۢ۠ۘۘۚۢۤۚۚ۬";
                                            break;
                                        case -113654855:
                                            str4 = "ۦۨۡۘۥۨۙ۫ۨۧۘۡۛۜۘۘۥ۟ۢۙۖۘۥۚۗ۬ۗۥۘۨۜۛۡۥۚۦۡۡۛۙ";
                                            break;
                                        case 535793820:
                                            str4 = "ۘۙۨۘۦۖۥۘۦۙ۫ۤۥۡۘۖۨۙۢۛۚۚ۠ۨۘ۟ۗۡۘۙۢۛۗۗۙ۠ۢۛۜۢۦ۫ۦۖۘۙۤۤ";
                                            break;
                                        case 1487595805:
                                            str5 = "ۛ۫ۤۤ۠۠ۛۥ۬ۤۜۦۢۘۘۤۛۤۡۧۡۡۡۜۨۥۚ۠ۜۜ۠۫ۙ۠ۛ۟۟ۘۖۘۙۙۢ۬ۖۖۢۦۚ";
                                            break;
                                    }
                                }
                                break;
                            case 1895957504:
                                str = "۠ۢۤۜۤ۬ۜۨۢۥۨۛۧۚۨۘۖۖۥۘ۫۬ۦۘۥۜۘۘۥۘۦۘ۟ۙۦ";
                                continue;
                        }
                    }
                    break;
                case 8280592:
                case 377123363:
                    return;
                case 283476325:
                    str = "۫ۧ۫۠ۚۥۗۚۘۘۙۢۨۡۘۘۢۛۗۦۘۘۖۤۥۙۘ۬ۦۡۡ";
                    break;
                case 306435144:
                    z3 = true;
                    str = "ۥ۟۫ۘۗۨۘۥۥۜۚ۠ۚۗۖ۠ۛۤۡۚۧۛۥۖۦۘ۟ۥۘۘۘۨۖۘۙۨۧۘۗۛۗ";
                    break;
                case 389784368:
                    str = "ۘۛ۬ۚ۠ۤۗۧۚۥۧ۬ۖۙۦۘ۟ۨۛۖۧۨۙۜۘۤۘۖۧۚۖۘۢۜ۬۟ۥۢ";
                    break;
                case 1522868631:
                    String str6 = "ۦ۬ۖۘۗۘ۠ۨ۟ۘۘۖ۠۟ۡۜۥ۬ۥ۫ۡ۠ۧۘۡۢۥۛۤۖ۫ۦۜ۬ۧۡۘۢۧۥۘۚ۟ۤ۬ۙۨۘۗۚۛ";
                    while (true) {
                        switch (str6.hashCode() ^ (-1608356270)) {
                            case -1342715605:
                                str = "ۥۡ۟۟ۨۦۢۨ۫ۘۢۥۦۨۛۥۘۚۗۧ۬ۦۘۘۨۡۧۘ۠۠ۡۘۗۖ۬ۢۛۥۚۚۨۦ۬ۢ";
                                continue;
                            case -1307452454:
                                str6 = "ۦ۠ۡۘۚۡۧۦۨۖۘ۟۫۫ۙۢۚۡۨۢۡ۬۬۬ۨۦۗۜۡۙ۟ۜ";
                                break;
                            case -778082541:
                                str = "ۨ۬ۡۘ۫ۥۡۛۢۨۘۚۘۥۘۚۛ۫۟ۖۛ۬ۘۢۤۙۧۜۚۡۘ۫ۢۥۘ۠ۚۦۢۨۘۜ۫ۡ۠ۥۚۙۤ۫ۢۢ۟";
                                continue;
                            case 1080905837:
                                String str7 = "ۙ۟ۤ۠ۥۤ۟ۖۜۡ۠ۢ۬ۤۡۚۨۡۘ۬ۗۚ۬ۡۘۢ۫ۨۘۥ۟ۧۡۖۙۗۤ";
                                while (true) {
                                    switch (str7.hashCode() ^ 191439674) {
                                        case -1495418991:
                                            str7 = "ۜۨۜۢۚۗ۟۠ۥۘ۟ۦۖۘۧۖ۫۟ۗۨۘۘ۠ۢۢ۠ۦۢۖ۠ۗۥۖۖۘۙۗۙ۟ۛ۫ۘۖ۫ۙ";
                                            break;
                                        case -329694114:
                                            str6 = "ۜ۬ۤۙ۬ۘۤ۫ۘۧۨۨۘۨۦۧۗۛۢۖ۟ۘۘۙۥ۬ۚ۬ۦ۬ۜ۠ۢۡ۠ۜۧۨۘۙ۟۬۠ۚ۬ۧ۫ۢ۠ۨۘۖۧۜۚۨۜۘ";
                                            break;
                                        case -50088835:
                                            str6 = "۠ۚۨ۠ۜۤۦ۟ۖۘۧۜ۟ۚۥۘ۟ۚۦۘۥۤۛۡۗۘۘ۬ۛ۬ۜ۫۠";
                                            break;
                                        case 917746426:
                                            str7 = this.OooooOo - this.OooooOO < OoooooO ? "ۧۢۗ۬ۛۖۨۙۘۘۤۜۜۦۚۢۦۚۤۧۚۥۖۛۧۤ۬ۛۡۘۡۘۖۗۗ۫ۥۘۘۡۨۙۗ۟ۖۗۚ۬ۚ۬ۡ" : "ۜۡۥ۠ۢۖۨۢۡۘۢۚۨۦۗۘۙۛ۫ۨۥۜۙۥۘ۬ۢۨۜۘۡۘۧۜ۬ۢۛۦۘ۬ۧۖۗۛۙۗۥۦۗۗۘۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public void OooO() {
        String str = "ۜۦۙ۬۬ۢ۟۟ۖۘ۠ۖۘ۟ۚ۫۫ۘۖۘۛۧۤۦۢۥۛۖۘ۬ۘۙ";
        LoadStatueEnum loadStatueEnum = null;
        LoadStatueEnum loadStatueEnum2 = null;
        InterfaceC4350sa interfaceC4350sa = null;
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_RADIO_GROUP_VALUE) ^ 782) ^ 470) ^ 1493614118) {
                case -1830206552:
                    String str2 = "ۖۦۗ۠ۦ۬۟ۜۘۘۦۨۘۚ۟ۧۡۡ۠۫ۢۦۘۢۤۧۖۘ۬ۛۧۡۡۡۡۤۡ۟ۘۨۛۙۥۜۖۗۥۖ۬ۜ";
                    while (true) {
                        switch (str2.hashCode() ^ (-280311512)) {
                            case -1894483681:
                                String str3 = "۟ۙ۬ۚۘۧۘۡۚۘۜۜۧۘ۠ۢۘۘۢۙۘۘۜ۬ۦۘۚۜ۟ۨۥۧۢۗۤ۬ۢۛۥۘۘ۬ۤۖۘۧۥۧۘۘۜۨ۫ۙۦۘ۫ۜۗۖ۠ۦۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-836377214)) {
                                        case -1075643011:
                                            str2 = "ۨۙۗۗۜۢۗ۠ۧۢ۫ۚۖۦۗۗۘۧۛۛۗۜۧۘۡۦۤۥۘ";
                                            break;
                                        case 35187748:
                                            str3 = "۟۟ۡ۬ۧۥۛۨۗۡۦۡۘۢ۟ۡۧ۠ۡۤۥۦۘۗۜۦۘۘۡ۫ۚ۟ۘۘۗۖ۟ۨ۠ۥۨۥۘ۟۬ۘۘ";
                                            break;
                                        case 546018493:
                                            str3 = interfaceC4350sa != null ? "۬ۗۧۛۧۗ۠ۗۜۜ۟ۨۘۚۜۧۘۧۥ۠ۚۨۡۘۜ۟ۡۧۧۦۘ۫ۨۨ" : "ۜ۠ۢۘۜۘۘۜۙ۬ۦۚ۬ۘ۟ۘۡۡۚۨۥۘۖۦۘۤۗۜۢ۟ۜۘ۫ۛۥۘۜۜۥۘۙ۬ۖۘۥ۟ۙۚ۬ۦۘ۟ۙۗۢۡۢۢۘ";
                                            break;
                                        case 746215953:
                                            str2 = "ۚۜۜۗۘۖۘۥۛۦۘۘ۬۫ۛۨۦۘ۠ۨۧۡ۠ۨ۠۟ۙۜۙۖ۠ۜۥ۫ۚۧ۬۠ۗ";
                                            break;
                                    }
                                }
                                break;
                            case -823236869:
                                str2 = "ۙۖۧۖ۟ۖۛۥۤۛۨۧۡۜۚۢۜۙۨۦۧۘۗۙۤ۫ۛۥۧۚۡۗۦۜۘۦۦۘۥ۬۟ۘ۫ۧۡۨۘۤۛۜ۠ۜۧۨۘۧ";
                                break;
                            case 418312136:
                                str = "ۤۡۘۘۢۚۗۥۛ۫ۥ۟ۙ۠ۧۦۘۡۘۥۘ۫ۨ۠ۢۧۢ۟ۖۜۘ۟۠";
                                break;
                            case 1701172594:
                                break;
                        }
                    }
                    break;
                case -1715069679:
                    return;
                case -969230678:
                    String str4 = "ۦۡ۬ۚۨۚۡۨۜۗۛ۫۫ۗۦۘ۠ۙۢ۟ۘۤۤۡۚۤۚۡۙۥۦۘۛۜۡۖۤۜ";
                    while (true) {
                        switch (str4.hashCode() ^ (-493575600)) {
                            case -1702233896:
                                break;
                            case -1506301809:
                                str4 = "ۖۙۢۙۖۖ۬ۨۘۤ۠ۖۥۡۡۘۤۦۢۡۨۖۦۖۡۤۚۥۘۨۧۖۘۚ۟۫ۘۚۖۦۤۥۙۖۨۨۦ۟ۚۥ۠";
                                break;
                            case -398513193:
                                String str5 = "ۨۨۡۘۘ۫ۘۖۖۜۘ۠۬ۖ۠ۨۜۘۤۗۨۘۤ۬۟ۘۛۘۙۤ۬ۚۜۦۘۥ۫ۘۖۦ۬ۖۛۛۙۥۧۘۛۥۚ۫ۚۘۢۤۚۙۚ۟";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1137960584)) {
                                        case -2132159131:
                                            str4 = "ۖۗۙۖۚ۟ۗۨۙۚۥ۬ۚۗۥۘۙۜۢۚۢۢۖ۬ۡ۬۬ۡۛۦ۬ۡۡۘۧۤۦۘۛ۫ۨۘۛ۠";
                                            break;
                                        case -1911615392:
                                            str5 = loadStatueEnum2 != loadStatueEnum ? "۫ۨۖۧ۟۠۫ۤ۬ۥۘۧۘ۫ۜۢۘۖۧ۠ۢۜۘۗۙۜۖۨۘۘۦ۠ۖۘۡۚ۟ۚ۫ۦۖۖۖۘۗۙۜۙۥۖۘۜۗۤ" : "ۢۤ۟ۢۚۨۘۛۖۘۨۥۦۘۦۥۡۘ۠ۘۢۘۜۧۦۘۨۘۛ۠ۨۧۤۨۘۖۧۥۘۚۥۘۥۖۙۜۥ۫ۗ۬ۨۘ۫ۛۤ۬ۡۙۙۧ۫";
                                            break;
                                        case -819509008:
                                            str4 = "ۙ۫۟ۖۘۜۘۚۗۜۘ۬ۖۦۘۛۦۧۘۤۚ۟ۡ۟ۧۨ۠۫ۘ۠ۘۙۧۦ";
                                            break;
                                        case 1943949892:
                                            str5 = "ۦۡۨۜۥۖۘۘۡۖۙۜۘۘۖۙ۠ۙۦۢۤۖۘۘۘ۫ۧ۫۠ۤۚۗۘۘ۠۟۬ۗۘۜ";
                                            break;
                                    }
                                }
                                break;
                            case 281869975:
                                str = "۫ۗۖۘۦۥ۟۟۫ۜۗۡۘۘۦۥۨۨۘۛ۟ۜۤۤۡۗۤ۟۟ۙ۬ۥۘۖۚۙۖۖۥۘۚ۫ۜ۫ۜۘۛۦ۫۟ۨۘ۫ۖۥ۫ۜۗ";
                                break;
                        }
                    }
                    break;
                case -743637160:
                    interfaceC4350sa.OooO00o();
                    str = "ۡ۫ۛۜۗۥ۟ۥۢۨۦۧۘۡۤۨۘۛۚۨۘ۬ۘۧۘۤۥۦۘۙۘۜۘۤۢ۠";
                    continue;
                case 622278255:
                    str = "ۗ۠ۨۘ۠ۦۘۙۧۙۚۚۦۘۗۜۥۘۚۥۘۘۛۢۖ۬ۗۤۥۜۨۘۢۡۧۧۡۧۘۜۥ۫ۚۤ۫ۗ۟۬ۘ۠ۜۘۗۨۧۘ";
                    loadStatueEnum2 = this.OoooOoo;
                    continue;
                case 665540245:
                    str = "ۛۧۖۦۥ۬ۚۨۥۘ۬ۥۘۦۢۢۘ۠ۦۘ۬ۚۦۘۡۜ۬ۜۥۙ۟ۛۥۘ۠ۚ۬ۢۜۛۗۡۙۚۙۨۘۢۚ۟ۥۤۤ";
                    interfaceC4350sa = this.OooooO0;
                    continue;
                case 933116322:
                    loadStatueEnum = LoadStatueEnum.LOADING;
                    str = "ۨۡۥۦۧۜ۠ۗۨۨ۟ۘۢۧ۠ۡۤۜۘ۫۫ۤۗۙۡۚۡۥۦۧۗۨۚۚ۟۫ۢۗۡۢۡۡۘ۬ۡۜۥۨۢۗۨۘۦ۫";
                    continue;
                case 1187589537:
                    str = "ۤۗۜ۫ۡۘ۠ۥۥۘۥۤۗۙۙۧ۠۬ۡۧۧۘۧۛۜۘۖۨۥۜۨ۟ۖۤۖۙۘۘۡۙۤۜۖۙۛ۠ۡۜۚۛ۠۠ۡۤۢ";
                    continue;
                case 1654320448:
                    this.OoooOoo = loadStatueEnum;
                    str = "ۛۤ۠ۚۘ۟ۙۡۘ۟ۥۙۡۜ۬ۖ۟ۗۜۖ۠۫ۨۘۦۜۧۖۦۦۜۨۢۧ۬ۛۖ۟ۗۜۚ۠۬ۚۗۦ۟";
                    continue;
            }
            str = "ۡ۫ۛۜۗۥ۟ۥۢۨۦۧۘۡۤۨۘۛۚۨۘ۬ۘۧۘۤۥۦۘۙۘۜۘۤۢ۠";
        }
    }

    @Override // p285z2.InterfaceC4424ua
    public void OooO00o() {
        BaseFootView baseFootView = null;
        String str = "ۘۛۧۙۙۙ۬ۗۖۘ۬ۙۜۨۖۖۘۗۦۖۦۜۦۘ۫ۗۖۘۡ۬ۙۦۖۖۘۗۢۡۘۥۥۜۢ۬ۙۜۘۘۤۥۘۢۡ۫ۨۘ۬ۦۘۦ";
        while (true) {
            switch ((((str.hashCode() ^ 421) ^ 685) ^ 67) ^ 1604704297) {
                case -967298882:
                    baseFootView = this.Ooooo0o;
                    str = "ۢ۫ۨۘۚۙۡۘۦۚۧ۠ۖۗۗۗۛۦۦۚۖۥۧۘۦ۬۫ۜۘۦۘۙۜۘۧ۟ۡۡۤۤۗۥۜۘۙ۠ۨ";
                    break;
                case -108204246:
                    this.OoooOoo = LoadStatueEnum.NON;
                    str = "ۢۦۨۘ۟ۜ۫ۖۢ۟ۛ۠ۥۘۙۥۡۘ۠ۚ۫ۨۜۡۙۗۨۖ۬ۚ۫ۙ۫ۖۦۥۘۛۥۜ";
                    break;
                case 257152131:
                    String str2 = "ۧ۠ۙ۟ۗۦۘۙۡۦۘ۟ۦۥۘ۬۫۟۬ۤۢۢۖۨۘۜۚ۠ۘۖۥۘۥۚۙ";
                    while (true) {
                        switch (str2.hashCode() ^ (-901192184)) {
                            case -1849202543:
                                str = "ۘۨۖۘ۬ۘۛۤۖۥۘۙۛۜۘ۠ۗۨۘۘۤ۠ۗ۟ۦۘۡ۫ۡۡۡۧۘۢۖۨۤۢۜۛ۬ۛۡۥ۠ۨۦۡۗۧۙۛۡ۟ۚۧۙۚ";
                                continue;
                            case -789039306:
                                str = "ۗۗۨۘۡ۫ۚ۫ۡۥۗۥۤۨ۬ۡۙ۟ۖۘۡۥۗۨۥۦۘۙ۬ۙ۬ۦۜۘ";
                                continue;
                            case 515909561:
                                str2 = "ۨۧۛ۠ۙۗۤۖۙۘ۬۠ۗۡۧۡۘۤۡ۠ۚۥۘ۟ۜۢ۠ۨۨۘۨۙ۫۬ۡۧ";
                                break;
                            case 1747374805:
                                String str3 = "ۥۦۡۘۗۙۘ۫ۗۨۘۨۤۖۘۨۧۘ۫ۖۨۘۥۛۖۦۜۚ۫ۘۧۛۚۚ۟ۛۘ۫ۡۚ۟ۜۧۢۖۘۥۜ۫ۨۙۥۨۘۖۘ۟ۤۢ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-710303142)) {
                                        case -1966867289:
                                            str2 = "۠۫۫ۛ۠ۦۥ۟۫ۢ۫ۡۙۜۙۖۦۖۥۜۥ۫ۦۨۙ۬۟ۦ";
                                            break;
                                        case 187399730:
                                            str3 = baseFootView != null ? "ۚۜۥۨ۬۟ۤ۠ۘۚ۠۠ۗۨۚۡۨۜۢۡۡۘۤۗۥۨ۫ۢۛۧۡۘۛۢۨۘ۬ۧ۠ۤۜۥ۟۠ۗ" : "۠ۙۖۘۗۥۛۦۤۙۗۦ۫ۜۧ۠۟۠ۨۘۘۦۘۡۢ۟ۢ۬ۡۘۚۨۤ";
                                            break;
                                        case 747757397:
                                            str3 = "ۜۤۦۖۡۙۗۚۘۙۨۜۘۚ۟۬ۢۜۗۤۧۖۘۛ۫ۗۨۜۨۗۤۢ";
                                            break;
                                        case 1300379124:
                                            str2 = "۟۠ۜۡۦۡ۫ۘ۫۫ۚۘۘۨۛۥۘۘۙۗۗۨۡ۟ۡۨۘۖۗۡۛ۠۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 731557302:
                    str = "ۗ۠ۢۤۦۘۚۨۚۗۦ۟ۗ۠ۨۛۛۡۧ۬ۨ۟ۙۘ۬۠ۘ۫ۛۦۘ";
                    break;
                case 787608762:
                    baseFootView.OooO00o();
                    str = "ۘۨۖۘ۬ۘۛۤۖۥۘۙۛۜۘ۠ۗۨۘۘۤ۠ۗ۟ۦۘۡ۫ۡۡۡۧۘۢۖۨۤۢۜۛ۬ۛۡۥ۠ۨۦۡۗۧۙۛۡ۟ۚۧۙۚ";
                    break;
                case 1956578566:
                    return;
            }
        }
    }

    @Override // p285z2.InterfaceC4424ua
    public void OooO0O0() {
        BaseFootView baseFootView = null;
        String str = "ۡۧۖ۠ۡۚۨۨۢۡۦ۫ۨۥ۠۠ۗۖۥۖۧ۬ۥۜۘۤۖۦ۫ۙۖۡۡۘۚۜ۬ۚۨۥۘۥۨۜۡۗۢ";
        while (true) {
            switch ((((str.hashCode() ^ 890) ^ 651) ^ 567) ^ 1586495657) {
                case -1335508043:
                    return;
                case -1291012500:
                    this.OoooOoo = LoadStatueEnum.FAILED;
                    str = "ۘۦۥۘ۠ۦۙۨ۠۟ۘۦۥۘ۠ۨۢ۫ۘۦۦۗۜۦۘ۫ۥۖۨۖ۫ۦۢۗۙ۟ۖ";
                    break;
                case -1251627631:
                    baseFootView = this.Ooooo0o;
                    str = "ۗۗۨۘ۠ۖۥۤۖۘ۬۠ۙۤۢۗۜۨ۟۬ۜۘۤۙ۠۠۟۫ۢۤۖۘ";
                    break;
                case -99269871:
                    baseFootView.OooO0O0();
                    str = "ۢۗۖۙۤ۟ۥۥۜۘ۫ۢۥۘۖۜۦۘۗۧۖ۫ۨۢۜۨۙۢۡۚۛۜۨۦۢ۬ۖۚۥ";
                    break;
                case 1131843827:
                    str = "ۡۘۖۧۜۛۜۜ۟ۦۚ۬۬ۢۚۗۜۤۛۗۤۜۦۤۛ۬ۦۘ۠ۤۡۗۖۚۚ۫۬۠ۡۘۛ۫ۜۖۚ۫ۨ";
                    break;
                case 1817964538:
                    String str2 = "ۛۦۢۦۦۨۘ۠ۖۢۖۙۦۧۙۤۡۨۧۢۢ۫۫ۜ۟۬ۜۘۥ۠ۚ۫ۦۤۥۙۚۡۖۢۖۖۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 1224554065) {
                            case -1652345877:
                                str2 = "ۢ۠ۧ۬ۗۙ۟ۡۚۨ۫ۖۘ۠۬ۘۘۖۤ۫ۘۦۥۥۤۨۘۨۛۜۘ۠ۜۘۨۢۚۤ۠۠";
                                break;
                            case -993786046:
                                str = "ۢۗۖۙۤ۟ۥۥۜۘ۫ۢۥۘۖۜۦۘۗۧۖ۫ۨۢۜۨۙۢۡۚۛۜۨۦۢ۬ۖۚۥ";
                                continue;
                            case -162036363:
                                str = "ۗۛۘۛۘۦۘ۬۠ۘۢ۟۬ۤۡۦۘۜ۬ۚۘۘۗۥۚۦۙۨ۬ۘۚۘۘ۫۬۫ۖۥ۟";
                                continue;
                            case 1815878787:
                                String str3 = "ۢۧۦۢۦۘۘۡۗۗۙ۬ۖۘ۠ۤۚ۫۫ۜۘۙۨۖۘۥۚۦ۠ۚۡۦۛۢۡۙۜۦۜۛۢۢۧۨۖۙۙۚۛۘۖ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1130274574)) {
                                        case 318393540:
                                            str2 = "ۛ۬ۥۘۖۘۗ۫۬ۜۧۥ۫۟ۜۤۢۨۗ۫ۚۤۘۘ۬ۡۖۜۛۜۗ";
                                            break;
                                        case 1018537468:
                                            str3 = baseFootView != null ? "ۢۡۖ۠ۜۤۢۜ۬۫۫ۙ۬ۚۚ۠ۧۧۗۨۢۚۛ۟۟ۧۖ۟۠ۤ۟ۖۘۥۦۧۘ" : "۫ۙۥۘۖۨۡۘۘۢۦۘۘ۟ۘۘ۟ۧۡۘۧ۫ۚ۬۫ۘۘۦۧۗۘ۬ۜ۟ۘۢۛ۟۬ۘۜ۟ۘۚۨۘۜۨۡۘ";
                                            break;
                                        case 1303116823:
                                            str3 = "ۥۗ۟۠ۥۦۚۙۧۨۙۥ۬ۨۧۥۨۡ۟ۗۨۘۖۘۧۘۤۧۦۘۢۡۖ۬۟ۛ۫۫ۚ";
                                            break;
                                        case 2076884532:
                                            str2 = "ۜۡۖ۠ۧۥۛۤۗ۟۬۬ۚ۫ۢۡ۬ۨۨۘۥۛ۫۟ۜۘۙۖۧۘۨۜۙۚۥۨۘۜۥۙۢۦۜ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
        }
    }

    @Override // p285z2.InterfaceC4424ua
    public void OooO0OO() {
        BaseFootView baseFootView = null;
        String str = "ۤۦۜۦۘۨۘۦۛۘۘۨۗۡۖۛ۫۫ۨۚۖۨۨ۬ۢۘۘۜ۬ۙۢۜۘ۫۬ۡۘۨۨۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 658) ^ 434) ^ C4587yp.OooO0oO) ^ 1564684512) {
                case -1788777888:
                    str = "ۘۚ۬ۢۖۗۥۘۦ۠ۢۥ۠ۧۧۢ۟ۗ۬ۥۗۖ۟۠ۗۜۥۨۤۚۨۧۛۦ۠ۡۧۨۘۢۘ۬";
                    break;
                case -1538341949:
                    String str2 = "ۚۢۧۧۢۥ۟۬۫ۥۛۖۘۢۘۘۘۚۧۛۧ۠ۧۜۙۦۘۙۖۨۘۙ۫ۙۘۗۜۤ۟۟ۖ۬ۧۤۛۢۜۗۚۘۜۘۡۖۦۘۢۢۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1714166921) {
                            case -2096372518:
                                str = "ۛۙۜ۬ۖۧۘۗ۬ۜ۟ۘۧۡۦۨۘۙۘۨۘۚۨۘۘۦ۬ۗۜۛۘۘۧۡۢ۠ۚۦۘۙۘۗ۫ۧۛۛۙۤۨ۠ۥۘۖۖ۬";
                                continue;
                            case -1576923967:
                                str = "ۛۛۛۤۢ۟ۦۜۙۚۖۙۛۖۜۗۧۘۙۦۧۖۦۘۘۨۢۨۡۗۦۘۤۗۖۚۙۘۘۚۤ۟ۦۛۘ";
                                continue;
                            case -661273405:
                                str2 = "ۤۥۥۘۥۚۡۘۧۢۘۘۙۡ۠۟ۨۥۘۧۢۥۙۙ۟ۨ۬ۘ۠ۘۧۢۛۡۙ۟ۤ۠ۧ۬۫ۙۧۦۡۡ";
                                break;
                            case 1600780638:
                                String str3 = "ۚۤۘۘۨۥ۟ۙ۟۟۠ۜۡۘۗۙۚۗۜۨۥ۬ۗۙۨۨ۬ۚۧۤ۟ۙۗۢۥۦۜۧۗۦۤ۠ۡۨۘۢ۫ۗۜۜۨۘۘۜۗۥۦۨۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1158298445)) {
                                        case -1437699220:
                                            str2 = "ۢۥ۫ۦۘۥ۟ۧۡۘۖۖۨۘۡ۬ۢۥۢۥۘۥ۠ۥۘۦۚۜۘۜۥ۬ۖۘۗ۠۟ۖ۠۫ۛۨۛۥۘۙۦۨۧۥ۟ۜۚۨ";
                                            break;
                                        case -1170281669:
                                            str3 = baseFootView != null ? "ۨ۠ۜۘۨۜ۬۠۟ۛۚ۫۬ۦۜۧۡۨۘ۫ۗ۠ۗۘۛۛۡ۬ۦۧۧۚ۟ۚۗۧ" : "ۦ۫ۧۦ۟ۥۧۖۤۗۛۛ۫ۥۘۚ۫ۜۘۥ۠ۨۨۗۜۚ۠ۜۚۢۧۨۛۖۖۤۥۘۚ۟ۧ۫ۤۘۘ";
                                            break;
                                        case -109656937:
                                            str2 = "ۧ۠ۡ۫۬ۜ۠۟۟ۥۡۘۘۥۘۤ۬ۤۦۜۧۖۘ۫۠ۖۥۦۤۙۧۦۘ۟۠ۛ۠۠ۜۚۨۗۜۛ۟ۥۜۘۚۤۦۗ۟ۢۜۢۡ";
                                            break;
                                        case 366819407:
                                            str3 = "۟ۤۘۘۤۚۜ۟ۧۘۜ۫ۗۖ۠ۦ۠ۚۜۨۖۚۚ۫ۡ۠ۖۦ۟ۧۥۦۖۧۘۨۗۖۘۢۛۦۘۗۘۡۨۘۢۤۨۧ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -790675348:
                    baseFootView.OooO0OO();
                    str = "ۛۛۛۤۢ۟ۦۜۙۚۖۙۛۖۜۗۧۘۙۦۧۖۦۘۘۨۢۨۡۗۦۘۤۗۖۚۙۘۘۚۤ۟ۦۛۘ";
                    break;
                case -713370918:
                    baseFootView = this.Ooooo0o;
                    str = "ۥۛۜۘۚۛ۫۬۠۟۠ۙۡۘۡۘۜۤۢۙۙۘۖۜۜۙۥ۟ۗۙۙۙۘ۠ۘ۠ۥۦ۟";
                    break;
                case -639129783:
                    return;
                case -279417616:
                    this.OoooOoo = LoadStatueEnum.EMPTY;
                    str = "ۗۘۧۡۛۖۘۢ۟ۥۡۖۥۚۦۚۜۦۡۘۧۡۧۚۡۨۗۖۖۡۖۡ";
                    break;
            }
        }
    }

    @Override // p285z2.InterfaceC4424ua
    public void OooO0Oo() {
        BaseFootView baseFootView = null;
        String str = "ۛۜ۟ۨۘ۟ۗ۟ۘۙۢۡۜۘۘۦۨۘۘۡۗۜۦۜۘ۟ۤۡ۫ۥۨۦۨۥۡۨۨۨۘ۬ۛۤ";
        while (true) {
            switch ((((str.hashCode() ^ 766) ^ 552) ^ 738) ^ (-169507276)) {
                case -1104106761:
                    baseFootView = this.Ooooo0o;
                    str = "ۗۨۖۘۘۗۜۘۤۙۜۘۢۡۤ۟ۗۖۘۖۙ۫ۛ۬ۜۨۖ۠ۧ۠ۦۘۗۖۨ";
                    break;
                case -1093282604:
                    str = "۫۠ۛۦۘ۬ۙ۠۫ۨۧۥ۠ۛۖۦ۟ۨۚ۫ۨۘۡ۬۟ۗ۟ۥۖۜۡ۠ۦۡۛۦۚ";
                    break;
                case -216846245:
                    this.OoooOoo = LoadStatueEnum.NON;
                    str = "ۙ۬ۜۘۨۗۖۘ۠ۙۨۚۥۘۥۘۛ۠ۗۢ۠ۢۡ۠ۢۙۙۨۖۧۧۚ۬ۗ۟۠ۛ۫ۡۧ۫ۡۛۘۘ";
                    break;
                case -215169392:
                    baseFootView.OooO0Oo();
                    str = "ۙۛۖۘۥ۟ۦۘۤۥۗۛۛۚۦ۬ۥۖۨ۠ۘۙۥۘۚۥۘ۠ۨۖۧۛۘۖ۠ۗۙۡۚ";
                    break;
                case 987129073:
                    return;
                case 2074471023:
                    String str2 = "ۧۦۚۦۘۦۘۨۖۢۤۦۤۡۢۦۡۦۙۗۥ۫۬ۚۘۤۡۧۗۢ۠";
                    while (true) {
                        switch (str2.hashCode() ^ (-1075477365)) {
                            case -444396818:
                                str = "ۚۗۜۨۜۦۘۜ۠ۦۧ۠ۖۘۖ۫ۘۘۤ۫ۧۧۖۜۧۤۡۘۚۖۧۘۨ۟۟ۚۛۤ۟ۜۥۘۡۙۖۘۘۦۖۘ";
                                continue;
                            case 483262287:
                                str2 = "ۦۘۜ۫۫ۨۘۖۜ۬ۢۚۥۛۧۨۘۧۜۦۘۜۨۨۘۧۡۡۛ۠ۥۤ۠ۚ";
                                break;
                            case 531821599:
                                String str3 = "ۤۡۙۙ۠ۜۘۛۚۢۚۡۚۦۥۘۧۤۦۚۥۛۢ۠ۙ۟۬۟ۚۦۢ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1047906690)) {
                                        case -1606387303:
                                            str2 = "ۛۚ۫ۛۘۙۦۖۧ۬ۨۖۘۖ۬۬۟۟ۗۙ۟ۦۘ۠ۦۚۦۥۙۙۚۚۛۨ۫ۚۗۦۘۚۙۖ۟ۖۘۦۖۤۘۗۖ۫ۚۘ";
                                            break;
                                        case 1153962566:
                                            str2 = "۬ۚۢۢۘۥۘۗ۠ۡۢ۫ۘۘۗ۟ۘۘۖۜۧۦۙۦ۬۟ۚۨۛۜۘۖ۠ۘۢ۬ۚۨۘۤ۬۠ۧ۟ۧۡۘۤۥۤۖۤۛۙۡۤۘۦۛ";
                                            break;
                                        case 1286888432:
                                            str3 = baseFootView != null ? "ۡ۟۬ۖ۟ۜ۫۫ۨۧۢۦ۠ۜۦۘۥۘۘ۟ۤۚۡۖۧ۫ۦۥۘۦۘ" : "ۗۜۨۗۛ۠۟ۧۛۚۨ۫۫ۗۚ۟ۥۙۢۤۥۛۖ۬ۦۙۛۡۗۖۗۢۘۦ۫ۦۘۢۤۖۘۚ۟ۗ";
                                            break;
                                        case 1332019314:
                                            str3 = "۠ۛۢۚۛۡۤۤۧۡۥۡۘ۠ۨۜ۬ۦۡۡۙۨۚۗۛۥ۫ۘۘ۫۠ۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case 958967096:
                                str = "ۙۛۖۘۥ۟ۦۘۤۥۗۛۛۚۦ۬ۥۖۨ۠ۘۙۥۘۚۥۘ۠ۨۖۧۛۘۖ۠ۗۙۡۚ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public void OooO0o(View view) {
        String str = "۬ۖۤۦۛۙ۬ۘۖۙۛۦۘ۠ۘ۫۟ۚۜۘۙۦۦۚۧ۬۠ۜۖۢۤۢۙۡۘۧ۫ۖۚۛۡۘۨۚۤۥۖۦۧۜۡ";
        while (true) {
            switch ((((str.hashCode() ^ 955) ^ 998) ^ 585) ^ (-43289610)) {
                case -1049551268:
                    return;
                case -289842236:
                    addFooterView(view, null, false);
                    str = "۫ۗۦۗۘۘۧۛۖۥۛۧۨۢۙۖۙ۬ۢۦۥۘۢ۬ۦۢ۫ۢ۫۫ۨۘۙۘۥۦۚۦۖ۬ۤۢۜ۠ۧۘ۠ۙ۟ۤۛۦۥۘ۬ۥۢ";
                    break;
                case 152183151:
                    str = "ۘ۬ۖۘۡۦۖۗۨۜۘۘۦ۠۫ۡۢۗۘۚۨۥۡۘۧۦۧۘ۬۬ۜۥۛۘ";
                    break;
                case 1867519811:
                    str = "ۧۤۢ۬۬۠ۥۚۨۙۖۦۘ۫ۥۜ۟ۜۦۘ۫۫۬ۥۦۥ۫۬ۜۧۚۙ۫ۗۜۘۡۘۘ۟۫ۙۙ۫۟ۘۨۦۜۘ";
                    break;
            }
        }
    }

    @Override // p285z2.InterfaceC4424ua
    public void OooO0o0() {
        BaseFootView baseFootView = null;
        String str = "ۗۥ۫ۖۥۙۧۚۜۧۥۨۚۨ۬۫ۦ۬۫ۧۗ۫ۘۘۨۢۙۜ۠ۥۘ۠ۤۨۥۡۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_RADIO_GROUP_VALUE) ^ 839) ^ 653) ^ (-871655146)) {
                case -1186351232:
                    baseFootView.OooO0o0();
                    str = "ۤۦۥ۟۠۠ۖ۟ۖۗ۫ۜ۬ۨۜۘۨۙ۬ۦۘۤۙۜۨ۫ۨۘۗۥۥۙۗ۟ۗ۟ۜۘۨۙۢ۫ۨ۫";
                    break;
                case -1130532693:
                    str = "ۚ۫ۤۚۨۚ۫ۢۜۚۘۦۘ۠ۛۘۘۙۤۘۘۘ۠۫ۨ۟ۧۗ۠۬ۛۛ۠۬۠ۜۘ۬ۢۜۖۘۙۛۤۧ۫ۦۨۤۨ۠";
                    break;
                case -770614213:
                    String str2 = "ۢۗ۬۟ۥ۟ۧۧۡۘۙۤۜۦ۬ۛۚۘۧۘۥۦۘۚۗۗ۠ۘۡۥۨۛ";
                    while (true) {
                        switch (str2.hashCode() ^ 888586886) {
                            case -2115475909:
                                str = "ۨۧۧۢ۫ۚۦۦۖۘۚۨۘۘۖ۫۟ۥ۠ۥۡۦۨۘۘۨۦۡۢ۟ۜۖ۠";
                                continue;
                            case -788710230:
                                str = "ۤۦۥ۟۠۠ۖ۟ۖۗ۫ۜ۬ۨۜۘۨۙ۬ۦۘۤۙۜۨ۫ۨۘۗۥۥۙۗ۟ۗ۟ۜۘۨۙۢ۫ۨ۫";
                                continue;
                            case -287934152:
                                String str3 = "ۛۡۛۙۜۡۘۦۜۥۘۡۦۚۙ۠ۘ۠ۗۡۜ۠ۦۘۛ۫ۡۘۖۚ۟ۛۢۖۖۛۦۘۛۚ";
                                while (true) {
                                    switch (str3.hashCode() ^ 516376648) {
                                        case -1938820221:
                                            str3 = "ۚۢۘۘۦۧۖۘۚۜۚۖۖ۬ۖۘۨۗۦۛۧۜۖۖۧۘ۠ۗۙ۫۟ۥۘۛۗۡۘۗۙۤ";
                                            break;
                                        case -800455335:
                                            str2 = "ۙۥ۠ۢۙ۠ۧۧ۠ۜۘۢۥۘۡۖۛۦۘۚ۫ۤۡۦۧۘۦۛۧۘۤۘۘۡۢ۟ۥۤۢۖ۟ۥۡۜۗۤۚۚۡۧۚۥۛۜۘۥۡۘ";
                                            break;
                                        case 327762109:
                                            str2 = "ۘۚ۫ۖۙۚۙۚۧ۟ۡۥۦۙۨۨۦۚ۟ۖۘ۬ۘۚ۟۫ۡۡ۫ۡۦۥۘۘ۫ۙ۠ۗۗ۫ۛۗۡۗ۠ۜۧۜۘۜۛۧ";
                                            break;
                                        case 1263969749:
                                            str3 = baseFootView != null ? "ۧۛۡۘۢۜ۫ۛۗۡۘۙۦۤۥ۠ۨۘۨۘۖۥۙۜۘۙۥۧۘۗۜۜۜۧۥۘ" : "ۧۤۙ۬۟ۥۜۚۚۗۛۡۡۙۦۙ۟ۨ۠ۨۜۘۧۧۡۘ۟ۚۛۙ۫ۛۘۛۛۜۢۤ";
                                            break;
                                    }
                                }
                                break;
                            case -87277168:
                                str2 = "ۨۜۧ۟ۥۖۧۜۥ۫۫۫ۛ۟ۜۘۧ۫ۖۘۛۛۘۘۨ۬ۗ۟ۚۗۦۡۧۦۡۘۡ۟۫۟ۢۜۦۢ۠ۧۡۖ۫ۘۦ";
                                break;
                        }
                    }
                    break;
                case 1272305047:
                    return;
                case 1563394256:
                    this.OoooOoo = LoadStatueEnum.COMPLETE;
                    str = "۬ۤ۬ۙۡۥۘۘۗۡۘۙۤۧۦۗۨۦ۟ۙۦ۠۬ۥ۟ۥۥۖۜۘ۠ۢۖۘ۠۬ۘ۟ۡۘ۫۟ۤۨ۟۠ۦۘۘۢۘ۫ۧۜ۬ۧۗۥۘ";
                    break;
                case 1903531310:
                    baseFootView = this.Ooooo0o;
                    str = "ۖ۫ۚۨۡۗۚۦۗۦۡۡۛۡ۠۟ۦۖۢۧ۬ۧۦ۟ۖ۫ۡۘ۫ۙۖۘ۬ۘ۫ۙۚ۫ۤۤۛ۫ۙۘۛۙۛۥۨۘۦۢۨۚ۫ۘ";
                    break;
            }
        }
    }

    public boolean OooO0oo() {
        String str = "۬ۜۧۨ۟۫ۜۢۘۦ۠ۜ۟۟ۗۨۘۡۚۢۜۘۚۚۥۘۡۥۡۘۜۛ۠۠ۢۚ۫ۜۨ۬ۥۘۘۤۘ";
        while (true) {
            switch ((((str.hashCode() ^ 600) ^ 582) ^ 845) ^ (-519671806)) {
                case 284254245:
                    str = "ۦ۠ۜۢۥۖ۫ۛۨۥۙۢۨۜۦۘۘۤۖ۟ۜۢۤۦۢۥ۫ۘۘۖۤ۫ۡۜۢۡۥۤۥۥۜ۠ۗۗۡۥ۟ۘ۠۫ۤۚۦۘۡ۬ۨ";
                    break;
                case 877504832:
                    return this.OoooOoO;
            }
        }
    }

    public void OooOO0(int i, int i2) {
        String str = "ۗ۬ۜۘۦ۬۬ۗ۠ۡۘۨۚۗۥ۠ۘۜ۠ۨۘۡۙۚۥ۟ۤۦ۫۬ۧۥۧۘۜۗۜۘۘ۫ۘۦ۫۟ۛۤۦۥۖۤۥۘۚ۟ۦۛۖ۬";
        while (true) {
            switch ((((str.hashCode() ^ 798) ^ 397) ^ 496) ^ (-1763087157)) {
                case -1678967905:
                    this.Ooooo00 = i;
                    str = "ۘۗۦ۬ۙۤ۫ۖۜۥۘۤۥۤ۟۫ۖۘۘۨۜۙۘۧۘ۟۫ۥۘۜۚۦۘۦۦۥۘ۠۬ۖۘۘۨۛۙۡۥۘ";
                    break;
                case -678475366:
                    str = "۫ۖۧۚۜۧۙ۫ۚ۟ۧۥۡۧۚۨۡ۬ۦۘۘۖۚۦۢۡۨۘۢ۬ۤ۠ۙۢۖۗۘۚۜۚۗۢۤۨۜ۟ۡۢۤ";
                    break;
                case -221751377:
                    return;
                case 1021233958:
                    setScrollLoad(true);
                    str = "۬ۖۛۜ۬ۖۜۧ۠ۘ۠۠ۙۜۨۡ۫ۖۘۛ۬ۤۡۢۢ۫۫ۡۧۛۛۢۤۨۦۨ۟۬ۖۘۢۖۤۧۤۦ۟ۚۦۤۤۖۘۘۦ۟";
                    break;
                case 1528621495:
                    str = "۫ۙ۫ۘ۠ۨ۟ۙ۟ۧۙۥۢۚ۟ۨ۟ۘ۫ۡۦ۬ۘۗۖۨۖۤۗۚۗۡۘۙۘۦۢۦۘۨۤۥ";
                    break;
                case 1751646865:
                    str = "۬ۛۡۖۜۜۘۢۤۥۚ۫ۜۜۥۨۘ۟ۡ۠۬ۢۢۖۡۘۚۘۥۡۥۚۗۥۡۘۢۛۢ۠ۚۘۘۢۥۦۘۢۥۖۘۨۦۜ";
                    break;
                case 1856836863:
                    OoooooO = i2;
                    str = "ۢۙۖۢۤۧۜ۠ۚۦۖۢۜۘۤ۟ۗۥۘۦۨۡۘ۫۟ۛۡۙۖۚۙۥۘۚ۬ۛۥۖ۠ۨۜ۟ۥ۠ۛ";
                    break;
            }
        }
    }

    public boolean OooOO0O() {
        String str = "۠۬ۜۜۥۜۛۗۖ۠۫ۖۘ۟ۘۚۢۧۜ۟ۖۥۤۘۚۤۙۡۘۚۗ۠";
        BaseFootView baseFootView = null;
        while (true) {
            switch ((((str.hashCode() ^ 130) ^ 915) ^ 992) ^ 1195118263) {
                case -1881542726:
                    String str2 = "ۨ۠ۦ۟۟ۦۢۢۥۤۡ۫ۗۡۡۦ۠ۜ۫ۛۦ۠۟ۥۢۛۧۙۦۧۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 997249358) {
                            case -1680446530:
                                String str3 = "ۧۨۨۥ۬ۖۚۡ۬ۨۧ۬ۘۙ۬ۤۘۘ۬۠ۥۘۜۡۘۘۗۤۨۘۙۛ۟ۤۗۛۥۤۖۨۙۜ۟۠ۜۙۧۢۧۡۜۘۦۚۡۦۙۨۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-255622355)) {
                                        case -1286553896:
                                            str3 = "ۥۧۥ۠ۗۚ۠ۚۢۙ۠۬۬ۥۚۗۤۘۡۛۢۡۜۜ۬ۙۡۘۢ۠ۛۥۤۛۜۥۤۜۙۜۘۙۚۤۨۨۗۦ۫ۥۘۘۖۚ۬۠۟";
                                            break;
                                        case -187021791:
                                            str2 = "ۗۛۨۘۘۨۚۛۗۥۢۜۘ۫۠ۦۗۢۦۡ۟۬ۗۗۘۘۥ۠۠۠ۨۖ";
                                            break;
                                        case 187277021:
                                            str3 = baseFootView != null ? "۬ۡۤۖۗۘۘۘۢ۬ۘۤ۟۬ۛۖۖۘۜۗ۟۟ۚۚ۟۟ۖۗۚۛۘ۬ۡۘۚۗۢۧۧ۬ۦۧۖۘ۠ۗۨۘۖۗۗ" : "۟ۛۖۗۚۘۙۛۥۘ۫ۗۦۥۦ۠ۤۚۦۥۜۘۤۥۛۖۥۧۙۚ۠ۨۙۧۖۥۚ";
                                            break;
                                        case 363955933:
                                            str2 = "ۡ۠ۘۘۦۡۦۨۥ۫ۤۚۘۘۜۡۖۙ۠ۥۘۖۚۤۥ۠ۛۜ۫ۡ۟ۖۦۘۡۦۢۨۜۛۨۡۧۘ۫ۗۥۦۨۢۦۚ";
                                            break;
                                    }
                                }
                                break;
                            case -1084579733:
                                str = "ۢۤۘۘۘۖۧۘ۫۬ۘ۫۬ۦۘۛۥۡۖۘۦۘۥۥۖۨۗۥۜۦ۫۟ۤۜ";
                                continue;
                            case -903968007:
                                str = "ۧ۬ۤۢ۫ۖۘ۠ۨۘۜ۫ۘۘ۠ۤۦۙۗۢ۠ۢۚۢ۠۠۬ۜۧۖۨۘۘۧ۬ۨ۫ۙۡۡۘۘ۬ۡۨۘۡۚ۫ۨۜۨۨۖۡۘ۟ۡۜ";
                                continue;
                            case 44515564:
                                str2 = "ۚۖۙۗۧۨۤۘۘ۟ۛۘۘۦۜۢۖ۠ۖۘۤۤۜۨۛۧ۬ۡۘۚۜۡۢۜۧۘۗۛۢۘۙۘ۠ۚۨۛۦ۟ۧۛ";
                                break;
                        }
                    }
                    break;
                case -904919869:
                    str = "ۛ۬ۖۚۤۥۘۤۦۘۘۘۖۖۦ۟ۧ۬ۙۖۧۦۖۘۘ۟ۧ۬ۛۨۖۧۘ";
                    break;
                case -111036978:
                    this.Ooooo0o = null;
                    str = "ۛ۬ۚۡۚۙۙۘۦۘۥۜۥۘ۠۬ۥۤۦۡۘۗ۟ۡ۠ۖۜۘۛ۬ۛۤۢ۫ۨۡۦ۟ۧۘۘۤۦۧ";
                    break;
                case 116230744:
                    return removeFooterView(baseFootView);
                case 1669031843:
                    return false;
                case 1684522392:
                    baseFootView = this.Ooooo0o;
                    str = "ۘۙۤۛۨۡۦۘۧۨۜۥۗۖۦۗۥۦۘۖۛۥۘۢۥ۠ۡۜۤۢۥۚۙ۫ۖۘۙۛ۫";
                    break;
            }
        }
    }

    public void OooOO0o(View view) {
        String str = "ۜۚۚۘۡۜۘۛۛۤۘۧۧۙۘ۬ۥۢۡۘ۫ۢۚۨۢۘۙۤۜۥ۫ۘ";
        while (true) {
            switch ((((str.hashCode() ^ 762) ^ 837) ^ 366) ^ (-719692821)) {
                case -1341903619:
                    return;
                case -1016992256:
                    OooOO0O();
                    str = "۬ۛۛۥۗۨ۟ۗ۟ۨ۠ۨۤ۟۟ۡۚ۬۬ۥ۫ۗۙ۠ۡۚۡۘۙۡ۬";
                    break;
                case -841251918:
                    str = "ۥۜۜۚۥۚۧۗ۟ۘ۠ۙ۬ۥۘۖۨۥۘۧۡۖ۠ۗۨۘ۠ۢ۫۫ۨ۬ۙۚۦۘۦ۫۟ۧ۬۬ۡ۬ۘۘ۠ۘۥۘۨ۠ۦۘۜۛۧۘۥۤ";
                    break;
                case 465868474:
                    str = "ۘۦۗۛۖۨۘۥۥ۬ۜ۬۠۬ۢۘۘ۠۬ۘۢ۫ۗ۬ۖۧۘۖۘۢۢۜۙۤۜۤۨ۠";
                    break;
                case 769004508:
                    OooO0o(view);
                    str = "ۢ۬ۚۖۜۙۡۧۡۡۙۛۢۢ۫ۥ۬۠۬ۦۖۗۛۘۘۗۚ۟ۖۡۦۛۨۛۧ۬ۚۥۢۜۛۙۗ";
                    break;
            }
        }
    }

    @Override // android.widget.ListView
    public void addFooterView(View view, Object obj, boolean z) {
        BaseFootView baseFootView = null;
        String str = "ۗۙۖۗ۟ۚۤۦۢۥۥۜ۬ۙۨۤۦۖۡۗۨۘۗۥۛۦۗۥۘۘۨۧۘ";
        while (true) {
            switch ((((str.hashCode() ^ 879) ^ 834) ^ UiMessage.CommandToUi.Command_Type.FW_SET_LEFT_VALUE) ^ (-808050176)) {
                case -1540217283:
                    str = "ۢۛۤۤۚۜۤۙۧۤۤۢۖۗۡۖ۬ۛۜ۫ۜۤۤۚۥ۬۫ۥ";
                    continue;
                case -1377851337:
                    String str2 = "ۤ۟ۥۘۡۡۗۨۘۘۚ۠ۙۢۧۘۘ۟ۗۥۘ۟ۧۥ۬ۗۨۘۨۚ۟ۡۥۦۘۦۙ۬۟ۧۢۚۖۖۘۘۖۜۘ۬ۖۗۤۙۥۙۦۧۨۦۥ";
                    while (true) {
                        switch (str2.hashCode() ^ 302184927) {
                            case -678701742:
                                str2 = "ۥۦۜۘۛ۠ۜۘۧۧۡۘ۬ۧۨۘۨۗۢۡ۟ۥۘۘۤۥۘۡۜۜۘۢۦ۠۠ۧ۬";
                                break;
                            case -476565156:
                                break;
                            case -433186084:
                                str = "ۡۙۙۘ۬ۙ۟ۖۘۗ۫۫ۖۡ۠ۨۖ۬ۛ۠ۧۜ۬ۡۛ۟ۥۙۨۘۘۤۡۡۙ۠ۙۘۦۚ۠ۙۘۘ۬ۛۙۚ۠۫ۦ۫ۚۙۜ";
                                break;
                            case -338744345:
                                String str3 = "ۥۢۛۡۛ۫۫ۛۗ۫۠۟ۦۘۘۗۘۘۧۤۜۘۧۛۤۧۖۖۘ۟ۚۘۘ۟ۗۦۧۦ۠";
                                while (true) {
                                    switch (str3.hashCode() ^ 1637533034) {
                                        case -515458260:
                                            str2 = "۫ۛۙۜۖ۠ۖۙۘۘۧۜۥۘ۟ۚۡۘۧ۠ۥۖۚۜۦۦۡۛۦۘۘۡۖۖۜۡۜۛۙۚۢۦۦۘۧۥ۟ۗۖ۬۠ۘۡ۬ۧۥۘۘ";
                                            break;
                                        case 240572487:
                                            str2 = "ۥۗۜۥۛۖۘۖۧۖۘۦ۫ۢۜ۟ۜۘۢۛۨ۫ۦۚۗۖۚۖۨۥ۠ۤۗۛ۟۟۠ۖۘۘۙۛۚۗۙ";
                                            break;
                                        case 596057573:
                                            str3 = this.Ooooo0o == null ? "ۨۜۦۘۥۗ۫ۜۚۙۚۜۜۘۚۤۨ۫ۡۙۗۙۨۧۢ۠ۘۘۡ۠ۨۚۦۘۧۥۨۘۘۤۤۙ۫ۡۘۙۤۦۘۜۚۧۗۖۗۖ۟ۘ" : "ۜۧ۠ۤۖۗۢۘۖۘۛۦۡۘۧ۠ۖۤۧۥۙۧۖۘ۫ۨ۫ۘۤۤۜۙ۬";
                                            break;
                                        case 689194807:
                                            str3 = "ۜۜ۬ۤۚۗۘۥۨۘۢۡۥۘۗۖۖۘۛۘ۬۬ۛۘۧۧۥۚۖۥۨۡۙۥۜۧ۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -418864076:
                    str = "۫۬۠ۘۛۨۘ۠ۖۜۜۨۘۘۡۙۥۘ۠۠ۨۙۛۜۘۧۚۥۘ۟۫ۛۡۗۥۥ۠۫۬ۦۖۘ";
                    continue;
                case -150830583:
                    str = "ۖۢۛۢۜۧۘۨۨۥۘ۟ۨ۠ۤۙ۫ۘۧۦۢۗۜۘ۠۬ۦۘۨۖۦۘ۫ۡۘ۫ۥۦ۟ۘۨۘۡۥۦۘۗۛۖۧۗۦۨۘ۬";
                    baseFootView = (BaseFootView) view;
                    continue;
                case 218720531:
                    str = "۠ۘۖۘۦۖۘۦۢ۟۬۬ۡۚۤۘۘۛۛۖۖ۟ۖۚۨۥۘۙۢۙۛ۬ۚ";
                    continue;
                case 379798424:
                    this.Ooooo0o = baseFootView;
                    str = "ۦۜۖۙ۟ۜۙۗۗۥۛۤۢۧۘ۫۠ۢۨ۟ۥ۠ۖۡۘۜۡۖۜۖۖۘۡۗۦۦۚۜۘ";
                    continue;
                case 500470954:
                    String str4 = "ۙۤ۟ۖۤۨ۠ۚۜۧۦ۠ۡۜ۟ۜۜۘۗۥۖۛ۫ۨۡۧۡۘ۫ۧۖۘۗۘۘۘۨۤ۠ۗۦۖۘۛۗۨۘۧۨ۬ۡۥۦۘۛ۟ۥۖ۟ۨۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-521752783)) {
                            case -2067834869:
                                str4 = "۫۬ۥۨۥۧۘ۫ۦۗ۟۫ۘ۫ۢۤۨ۠ۜۘۙۢۧۦۤ۫۠ۘۦۛۨ۫";
                                break;
                            case 446416676:
                                String str5 = "ۚۗۜۘۨۛۚۧۗۧۖۥۛۜۘۘۘۖۦۘۘۛۜۘۖۗۘۚۗۨ۠ۖۖۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 2100711866) {
                                        case -1231206898:
                                            str5 = view instanceof BaseFootView ? "ۡۘۦۤ۟۠۬ۗۖۘۘۖۜۘۡۛۛۧ۠ۡۡ۠ۦۘۤۤۘۛۜۡۧۗۘ" : "۬۟ۡۘ۟ۛ۬ۤۤۦۘۗ۠۬ۘ۬ۜۘۨۘۡ۬ۙۚۜۙۥۘۨ۟ۘۧۙۢۙۙۗۨۚۦۘ۠ۗۡۘۥۚۜۘۙ۠ۛۙۢۡۙۜۘ۠ۚۡۘ";
                                            break;
                                        case -544954287:
                                            str5 = "ۚۜ۠ۥۧۗ۟۬ۢۛ۬ۡۡۘۙ۬ۗ۫ۜۘۘۦۙۨ۬۬ۦۛۡ۬۠۟ۡۦ";
                                            break;
                                        case -143196713:
                                            str4 = "ۚ۬ۛۦۤۜۘۦ۠ۨۘۘۜۜ۬ۡۛ۟۬ۖۙۙۡۘۘ۟ۡ۟ۚۢ۫ۛۦۘ۫ۡۡۘۨۧۚ";
                                            break;
                                        case 1366032100:
                                            str4 = "ۛ۠۠۬ۤ۟ۡۛۥۛ۫ۤۛ۟ۖۛۨ۟۫ۦۨۚۙۤۤۨۦ۫ۢۖ۟ۙۡۘۗۖۡۘۚۛۥۘۨۖۛۧ۫ۛ۠ۜ۠ۥۙۦۘۛۘۥ";
                                            break;
                                    }
                                }
                                break;
                            case 524194524:
                                break;
                            case 1170680175:
                                str = "ۜۥۖۖۛۜۘ۟ۛۡ۟۫ۛۤۚۦۡ۟ۙۜۡۘۛۤۖۤۗۦۘۗ۟۟ۧۜۦۚۜۜۦۖۦ۫ۥۦۘۙ۫ۥۘۤۧۦ";
                                break;
                        }
                    }
                    break;
                case 748742841:
                    return;
                case 882893225:
                    super.addFooterView(view, obj, z);
                    str = "ۚۧۚۘۚۘۘۗۧۦۘۧۤ۟۟۠ۛۘۖ۬ۨۡۦ۬۬ۜۧۘۙۜۘۙۦۛۗۤ۟";
                    continue;
                case 1052519302:
                    str = "ۖۦۘۡۛ۟ۜۖۨۘۚۦۖۘۖ۬ۦۘۦۚۙ۟ۙ۠ۗۥ۬ۡۗۘ۫ۢۡۘ";
                    continue;
                case 1168760068:
                    baseFootView.setCallBack(this.OooooO0);
                    str = "ۡۤ۫۟ۡۡ۫ۙۡۗۦۚۢ۫ۘۘ۠ۖۗۧ۫۬ۧۗ۠ۥۙۖۧۦۥۘۘۧ۫ۨۜۦۘۘ۬ۢ۠ۖۘۢۢۧۙۡ۠";
                    continue;
            }
            str = "ۡۤ۫۟ۡۡ۫ۙۡۗۦۚۢ۫ۘۘ۠ۖۗۧ۫۬ۧۗ۠ۥۙۖۧۦۥۘۘۧ۫ۨۜۦۘۘ۬ۢ۠ۖۘۢۢۧۙۡ۠";
        }
    }

    public BaseFootView getFootView() {
        String str = "۟ۨۡۘ۬ۙۘۘۤۛۦۥۖۦۘۙۨۜۘۧۨۛۜ۠ۥۘۜۚۚۙ۫ۨۤ۟ۨۘ۠ۛۗۡۙۥۘۙۦ۬ۖ۠ۗۨۢۥۙ۫۟";
        while (true) {
            switch ((((str.hashCode() ^ 735) ^ 528) ^ 399) ^ 176890632) {
                case -1257183106:
                    return this.Ooooo0o;
                case -593018343:
                    str = "ۙۜۜۥۜ۟ۜۛ۬ۜ۫ۡۘۙۗۥۘۧ۠ۘ۫ۖ۟ۨۘۥ۟ۦۧ۟۠";
                    break;
            }
        }
    }

    public int getPageSize() {
        String str = "ۚۨۧۘۛۡۦۘ۬ۤۖۛۢ۠۠ۧۥۖۚۥۗ۬ۚۘ۟ۦۨۧۡ۟ۖ";
        while (true) {
            switch ((((str.hashCode() ^ 271) ^ 664) ^ 551) ^ 1968439334) {
                case -2038439844:
                    str = "ۨ۟ۛۘۧۦۗ۬ۤ۟ۜۙۢ۠۠ۙ۟ۡۘۜۡۥۦۘۨۘ۟ۡۡۘ۟ۢ";
                    break;
                case -1786907575:
                    return this.Ooooo00;
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        OooO00o oooO00o = null;
        String str = "ۘۤۖۘ۬ۦۘۦ۠ۘۧۘ۬ۜ۠ۘۙۜۢۜ۟ۢۖۤۜۘ۟ۤۗۤ۟ۢ۠ۛۢۨۥۛۖۢۢۛۜۖۧۘۨۘۥۥ۟۟ۥۚۦ";
        while (true) {
            switch ((((str.hashCode() ^ 555) ^ 227) ^ 902) ^ (-720827592)) {
                case -2102737611:
                    str = "ۡ۬ۜۘ۬۫ۙ۟۠ۨ۫۬ۥۘۤۨۘۘۙۧۡۛۥ۫ۨ۠ۛۘۜۥۥۛۥۛۦۘۨ۟ۥۙۖۛۗۥۧۘۡۚۦۘۙۖ۠";
                    break;
                case -1970898132:
                    oooO00o.onScroll(absListView, i, i2, i3);
                    str = "ۤۨۦۘۥۜۘۘۜۥۖۛۜۜۥ۠ۜۙۦۘۦۢۥۘ۟ۧۛۜ۟ۘۘۤۥۦۘۥۤۧۧۘۦۘۘۚ۟ۧ۟ۗ";
                    break;
                case -1406522752:
                    oooO00o = this.Oooooo;
                    str = "ۙۙۧۘ۫ۖۗۖۨۘ۠ۡۤۧۜۧۘۘۨۥۜۡۦ۫ۥۡۖۛۨۧۤۘۘۧۚ۬ۖۜۨۘۡۨ۠ۚۨۜۘ۫ۡۘۘۚۤ";
                    break;
                case -367854880:
                    this.OooooOo = i3;
                    str = "۫ۖۢۜۧۚ۫ۤۧ۠ۖۤۘۖۡۘۢۜۜۜۗۡۘۨۖۘۘۜۢۤ۬ۨۜۘۖۦۖۘۤۦۘۧۨۨۘۙۗۛ۫ۥۘ۫ۨۜۗۗۥۘۡۚۘۘ";
                    break;
                case 249771756:
                    return;
                case 287988517:
                    str = "ۚۦۡۘۨۙۜۘ۬ۘۨۘۙۦۘۘۦۦۜۛۚۢۖۚۖۘۘ۟ۤ۠ۚۘۨۡۡۡۧۘۗۛۗ";
                    break;
                case 298460276:
                    str = "۬۠ۢۤۦۙۙ۬ۤۡ۟۬ۤۗۨۢۥۡ۫ۥۥۘۢۡۖۖۗۧۨ۠ۥۘ";
                    break;
                case 1284893352:
                    this.OooooOO = i + i2;
                    str = "ۥ۠۟ۖۡۡۤ۬۬ۧ۟ۜ۟ۜۘۘۘۧۢۤۜ۬ۧۛۙۥۚۦۚۥۦۨ۠ۤۗۛۨۘ۟ۡ۟۬ۖۨۘ";
                    break;
                case 1440253486:
                    String str2 = "ۥۢۡۘ۟ۡ۫ۜۦۥۘۨۨۧۦ۠ۨۢۨۢۛۡۡۘۙۛۘۛۧۡۘۤۙ۟ۢۡۖۤۘۛ۟۟ۛۤۡۛ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1743158108)) {
                            case -1273597734:
                                str = "۠ۛۜۘۨۥۘۙۨۖۚۗۤۥۘۜۢۦۘۡ۬ۜۘ۬۟۠ۙۗۤۨۜۡۥۛۗۚۦ۬ۧۨ۬۠۬";
                                continue;
                            case -1021726115:
                                str = "ۛۡۥۜ۟ۦۘۖۛۖۘۗ۬ۤ۠ۥۢۚ۠ۖۘۡۥۨۘۛۥۘۘ۬ۧۥۢۗۥ۫ۙ۫ۖۘۥۘ۬ۨۘۘۦۛ۠ۗ۠ۛۛۥۨ";
                                continue;
                            case -549387424:
                                String str3 = "ۘۘۘۘۗۡۦۘۘۖۨۘۨۤۜ۫۠۫ۙۚ۠ۨۥۗۡۡۜۘۤۛۖۘۧۨۡۤ۫ۛ۫ۜۖۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 10777661) {
                                        case -728813847:
                                            str2 = "ۗۘۢۙۜۛ۬ۗۙ۬ۥۤ۠۫ۗۦۨۧ۠ۘۡ۬۫ۨ۠ۤۨۛۨۜ۠۬ۙۢۘۦۨۜۛۚۚۚۚۤۡۢۖۖۛۜۥۤۚ۟";
                                            break;
                                        case -718154237:
                                            str2 = "ۖ۬ۦۘۨۡ۠ۗۜ۫ۢۦۜۗۘۖۥۦۥۜۜۡۘۦ۠ۛ۬ۤۥۘ۟ۥۜ۫۬ۙ۠ۛ۫ۛۧۤۘۚۨ";
                                            break;
                                        case -393172694:
                                            str3 = this.OoooOoO ? "ۛۡۙۢۦۨۨۖۘۘۚۦۨۗۚۢۡۦۦۘ۟ۥۧۘۗۤۦۡۤ۬ۢۥۗۢۢۘۘۙۜۨ" : "ۗۥۖۘۤۨۦۘۥۚۦۘۛۛۨۨۛۡۘ۠ۜۨۜۧۨ۫ۧۧۨۦ۠ۘ۟";
                                            break;
                                        case 1869628428:
                                            str3 = "ۙۖۗۘ۬ۢۢۤۙۛۦۜۘۧۗۜۘۥۗۢ۠ۤۘۘۗۤ۫ۧۧ۠ۘۥۦۘۖۨۧۤ۫۟ۡۖۧۘۜۖۢۢۖۥۥۛۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 588464579:
                                str2 = "ۗۥۤۗۘۘۢۢۦۘۦۨۢ۫ۧۢۜۗ۟۫ۥۡۘۚۡۥۚۙ۟ۘۜۦۧۥۥ۫ۦۗ";
                                break;
                        }
                    }
                    break;
                case 1599409410:
                    str = "۬ۨ۬۫ۚۘۛۥ۫ۦۘ۠ۜۜ۫۠ۡۖۘ۫۬ۙۚۨۜ۫ۙۤۨۚۘۢۖۘۘۚۨۚ۠ۘ۟ۙۜۦۥۜ۫ۦ";
                    break;
                case 1688777281:
                    String str4 = "۟ۙۗۤۗۙۧۖۘ۬ۗۢۧۘ۠ۖۛۘ۠ۙۡۖۡ۬ۗ۠ۤۛۜۘۗۘۡۛۢ۠ۡۨۘۘۢۜۚ";
                    while (true) {
                        switch (str4.hashCode() ^ 1410464967) {
                            case -1420768809:
                                String str5 = "ۥ۫ۡۨ۫ۜۘۧۖۢ۟ۦۖۢ۬ۛۖۥۦۙۤ۟ۤۥۨۘۖۖۦۘۥۜۛ۠ۙ۫۟۫ۡۘۡۢۛۙ۫ۧ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1779853678)) {
                                        case -2118639851:
                                            str5 = oooO00o != null ? "ۧ۟ۖۜۘۨ۫۠ۗۛۛۗ۟۬ۦۘ۟ۖۦۘۖ۫ۨۛۙۦ۫ۢۛۨۜۚۢۦۛۖ۟ۛۢۙۜۘۤۤۤۡۢ۟ۨ" : "۟۠ۛۖۨۡ۠۫۠ۛۢۥۘۛۢۖۘۚۨۘۤۢ۫ۗ۫ۢۡۧۦۘۖۨۜۘۢۡۦۘۥ۫ۧۥۖۗۤۙۥ";
                                            break;
                                        case -1771992642:
                                            str4 = "ۚۚۧ۠ۙۤ۠ۜۘۢۢۤۗۡ۟ۦۡۜۘۡۨۘۘۘ۬۟ۦ۟ۗۤۖۚۙۢۘۘۥۛ۫";
                                            break;
                                        case 321136268:
                                            str5 = "۟ۦۥ۟۫ۥ۟۟ۨۘ۫ۥ۬۟ۧۖۘۘۦۘۘ۬ۖۘۥۛ۟۬۟ۜۘۖۦۡ";
                                            break;
                                        case 1948618362:
                                            str4 = "ۘۡۗۤۡۘۘۜۛۘۢۘۖۘۢۧۤ۫۬ۚۢ۟ۦۘۧ۠ۡۘۗۤۙۖۜۖۘ۟ۙ۫ۚۧۡۨ۫۬ۧ۟ۦۘۦۢۡۦ۬ۛۛۘۨۛۚۜۘ";
                                            break;
                                    }
                                }
                                break;
                            case -1061716036:
                                str4 = "ۗۛۥۘۘ۠ۥۗۘۧۨ۠ۗۚۙۨۚۤ۫ۤۖ۟ۧۛۘۘۗۙ۟ۖۘۦۘۨۙۘ۫ۤۘۢۥۚۖۗۚ";
                                break;
                            case 125077286:
                                str = "۬ۜۖۘۡۤۚۨ۫ۛۜ۠ۗۚ۬۠ۨۛ۬ۨۥۨ۟۟ۛۚۜۤۡ۫ۖ۬ۦۦۖۡۗۖۨۘۦ۫ۘۡۦۡۤۚۚ";
                                continue;
                            case 1750097849:
                                str = "ۤۨۦۘۥۜۘۘۜۥۖۛۜۜۥ۠ۜۙۦۘۦۢۥۘ۟ۧۛۜ۟ۘۘۤۥۦۘۥۤۧۧۘۦۘۘۚ۟ۧ۟ۗ";
                                continue;
                        }
                    }
                    break;
                case 1698769486:
                    str = "ۨۜۘۘۖۥۜۗۘۖۘۢۗۤ۬۠ۛ۟ۥۨۘ۟۠ۧۖۨۡۜۡۢۘ۠ۨۘۜۘۦۧۗۤۚۗۢۖۗ۫ۡۗۘۘ۬ۘۛۧۧۢۥۗۡۘ";
                    break;
                case 2046478304:
                    OooOOO0();
                    str = "۠ۛۜۘۨۥۘۙۨۖۚۗۤۥۘۜۢۦۘۡ۬ۜۘ۬۟۠ۙۗۤۨۜۡۥۛۗۚۦ۬ۧۨ۬۠۬";
                    break;
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        OooO00o oooO00o = null;
        String str = "۟ۨۡۘۚۤۦۘۜۖۜۘۤۢۦ۟ۥۜۘۙۦۨ۫ۦۡۘۡۢۜۖ۟ۥۘۙۡۖۘۚۨۗۗ۫ۨۤ۫ۛ۬ۢ";
        while (true) {
            switch ((((str.hashCode() ^ 762) ^ 564) ^ 355) ^ 1087266097) {
                case -2123867733:
                    oooO00o.onScrollStateChanged(absListView, i);
                    str = "ۖۧۛۗۤ۫۬ۛۛۨۡۡۤۖۛ۠ۜۘ۫ۙۡۘۘۛ۠ۚ۫ۘۘۢۙۜ";
                    break;
                case -1432081165:
                    str = "ۨ۫ۨۨۜۖۤۖ۫۬ۤ۟ۦ۟ۖ۠ۘۦۖۖۡۛۡۡۘۘۨ۟ۧ۬ۨ";
                    break;
                case -1309983510:
                    this.Oooooo0 = i;
                    str = "ۖ۟ۦۨۘۢۨۦۡۘ۠ۥۜۖۧۚۥۜۥۤۘۨۘۦۖۨ۠ۙۘۘ۫۟ۨ";
                    break;
                case -788218705:
                    str = "ۘۙۡۨ۬ۥ۠ۦۨ۬ۖۥۘۥۨۨۘۛۡۘۘۘ۫ۧۥۨۦ۠ۢ۬ۡ۟۟";
                    break;
                case -626107325:
                    return;
                case -457998207:
                    str = "ۧۢۘۜۢۨۘ۟ۦۜۘۘۙۛۚۙۧۖ۫ۗۦۗۢۡۢۖۖ۟ۖۦۡ۬ۖۤۥ۠";
                    break;
                case 67534318:
                    String str2 = "ۘۦۤۥۤۢ۬ۢۛۘۡۘ۬ۙۤۙۤۨۘۢ۫ۙۢۢۡۘۨۤ۬ۜۖۙۖ۟ۡۖ۟ۗۗۨ۠ۖ۬۠";
                    while (true) {
                        switch (str2.hashCode() ^ (-1311576647)) {
                            case -1114284250:
                                str = "ۖۧۛۗۤ۫۬ۛۛۨۡۡۤۖۛ۠ۜۘ۫ۙۡۘۘۛ۠ۚ۫ۘۘۢۙۜ";
                                continue;
                            case -881043046:
                                str = "ۘۦۢ۫ۡۥۘۨۜۙ۫ۙۥۘۘۡۢۘ۫ۗۚ۟۬ۡۚۜۖۘۢۧ";
                                continue;
                            case -176196291:
                                str2 = "ۗۜۖۘۚۦۜۘۗۗ۠۬۬ۨۘۢۡۦۘ۟ۧۘۦۦۡۜۗۘۘۧۖۜۨۜۘ۫ۦۜۘۢۦۦۘۧۘۗۥۗۧۤۗۨ۠۟";
                                break;
                            case 1348737397:
                                String str3 = "ۜۗ۬ۙۤۨۡ۫ۢۚۡۖۘۢۢۧۗۗۗۗۧۢۚۢۜ۫ۧۥۘۦۙۥۘۢ۠ۘۥۡۤۤۦ۬ۜۛۨ۬۫ۘۨۗۘۨۤۙۚۥۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1011415181)) {
                                        case -2121848550:
                                            str2 = "۬ۧۙۗ۬ۡ۬۠ۡۤۗۦۘۤۢ۬ۗ۠ۙۤۜۜۘۧۤۖۘ۟ۖۡۜۨۡۘ۠۬ۙۖۙۦۢۙ۫۟ۘ۫ۛۡۦۡۨۛۢۙۥۘۚ۠۫";
                                            break;
                                        case -1131769330:
                                            str3 = "۠۟ۜۛ۬ۛ۠ۨۦۨۧۘۘۦۜۗۗ۬۠۠۠ۘۨۘۚ۟ۤۢ۠ۜ";
                                            break;
                                        case -910891590:
                                            str3 = oooO00o != null ? "ۦۦ۠۬ۥۥۜۛ۫ۗۙۢۜۥۘۡۖۦۛۨ۫ۙ۟۠۬ۡۨۘ۬ۦ" : "۟۟ۡۘ۠ۗۖۘ۬ۢۘۘۢۜۧۗ۠ۘۙۘۥۘۨۨۚۚۘ۟ۢۚۛ۟۟۟ۙۖۘۘۛ۠ۡۢۗۚ۬ۚۚ";
                                            break;
                                        case -63731938:
                                            str2 = "۬ۜۧۘ۟ۘۡۘۗۘۛۛۘۖۘۜۜ۠۫ۥ۟ۙۜ۟ۘۢۡۚۚۨۤۘۨۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1674348549:
                    oooO00o = this.Oooooo;
                    str = "ۖۛۧۙۙ۬ۨۨ۬۟ۤۘۨۙۖۘۗۧۦۙۖۚ۟ۙۘۗ۠ۗۙۥۙ";
                    break;
            }
        }
    }

    @Override // android.widget.ListView
    public boolean removeFooterView(View view) {
        String str = "ۛۤ۫ۘۤ۠ۤ۫۠۬ۖۗ۠ۘۘ۠ۨۢۨۛ۫۟ۖۖۢۘۘۡۢ۬ۚ۠ۖۘۗۥۢۘۡۤۨۘۡ";
        while (true) {
            switch ((((str.hashCode() ^ 360) ^ FragmentManagerImpl.ANIM_DUR) ^ 460) ^ 1915381753) {
                case -1955027981:
                    str = "ۦ۫ۦۨ۫ۗۘۥ۬۫ۨۚ۠ۛ۟ۤۦۧۜۛۛۜۡۘۚ۫ۥۘۦۢۧۙۗۥۘۤ۫۬ۙۖۘۘ۫۟ۗۘۗۚ۟ۗ۬ۡۡۥۛ۬ۘ";
                    break;
                case -1541800975:
                    this.Ooooo0o = null;
                    str = "ۤۖۡۘۚۥۖۘۜۜۧۗۚۤۤۜۧۙ۟ۗۧ۫ۛۙ۬ۦۘۛ۬ۖۘۜۡ۠ۖ۠ۥۡۛۘۘۧۢۥۘۨۢۛۡۛۗۦۜ۫ۗۤۨۘۢۗۗ";
                    break;
                case 219714544:
                    return super.removeFooterView(view);
                case 530137642:
                    str = "ۥۡۖۘۖۨۧۘۘۛۥۘۡۤۦۘ۟ۨۜۘۗۛۥۛۗ۟ۨۥۘۤۘ۫ۨۡۥۛۥ۟۫ۗ۫ۡۦ۠ۙ۠ۡۘۢۜۦۜۨۥۘ";
                    break;
                case 2123305464:
                    String str2 = "ۨ۠ۙۧۗۦ۬۫ۤۖۥۡۘۖۗۤ۬ۚۦۗ۫ۧۢۛۡۘۢۢ۬ۡۢۖۘۨ۬ۧۗۥۚ۬ۙۗۧ۟۠۟۠ۛ۠ۘۥۘۚۨۘۘۤ۫ۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-177232797)) {
                            case 307471421:
                                String str3 = "ۧۘۚۛ۠ۙۙۘ۫ۙۖۦۡ۫ۜۘۘۦۗۤ۠ۘۛۢۥۢۢ۬ۙۧۛ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-2139693989)) {
                                        case -103446787:
                                            str2 = "ۜۥ۫ۗۧۖ۟۫ۚۗۤۜۨۧ۟۟ۧۙۘۜۡۚۚۖۘۥۡۥ۬ۨۧۘۛۧۖۛۡۗ";
                                            break;
                                        case 65625875:
                                            str3 = "ۜۨۧۧ۫ۦۧ۫ۧۤۜۨۗۨۜۖۢۡۘ۬ۢ۫ۚۙ۟ۖۙۖۜۧ۟";
                                            break;
                                        case 1237815509:
                                            str2 = "۟ۨ۟ۥۛۘۘۖۧ۬ۖۙۨۙۙۦۘۜۘۗ۟۬ۛ۬ۙ۫ۖۨۡ۫ۦ۬";
                                            break;
                                        case 1359285445:
                                            str3 = this.Ooooo0o == view ? "۠ۢۛ۫ۙۚ۠ۧۨۡۚۙۢۡۢۙۢۥۘۖ۫ۡ۠ۚۘۡ۠ۨ۬۠ۘۘۨ۠ۡۜۙۘۡۘۤۜۦ۫ۛ۠۫ۡۗۨۘ" : "ۤۛۤۢۦۢۛ۫ۡۖ۟۫ۘۗۨۦ۟ۙۦۛۦۧۛۢ۬ۧۢۦۖ۠ۧۜ۟ۡۨۥۧۘ۠ۡۙۗۚۛۙۗۦۖ۬۬ۚ۠ۦ";
                                            break;
                                    }
                                }
                                break;
                            case 1121328074:
                                str = "۫ۚۚۨۖۗۧ۬ۖۦ۠ۚۤ۠ۛۖۚۥۥۛ۫۟ۡۧۨۙۡۘۦۦۘ۟ۗ۟۠ۡۜۘۚۚۦۙۦ۠ۘۨ";
                                continue;
                            case 1419930359:
                                str2 = "ۘۖۡۚۚ۬۫۫۬۟۫ۨ۬ۜۨۘۥ۬۫۫ۧ۟ۙۡۚۧۦۘۘۗۜۤۘۦۘ۫ۖۖۘۢۚۨ۟۠ۨ۟ۧ۟ۦ۠";
                                break;
                            case 2036244070:
                                str = "ۤۖۡۘۚۥۖۘۜۜۧۗۚۤۤۜۧۙ۟ۗۧ۫ۛۙ۬ۦۘۛ۬ۖۘۜۡ۠ۖ۠ۥۡۛۘۘۧۢۥۘۨۢۛۡۛۗۦۜ۫ۗۤۨۘۢۗۗ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public void setIListViewCallBack(InterfaceC4350sa interfaceC4350sa) {
        String str = "۟ۚۜۛۙۖۘۡۧۦۘۜۨۥ۫ۜ۫ۥۙۦۡۡۡۖۛۦۘ۟ۚۡۦ۠ۢۗ۬ۙۡۢ۬۟ۡۤۢۘۖۘۧ۠ۖۘ۟ۦۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_TITLE_TEXT_VALUE) ^ 622) ^ 916) ^ (-1528079180)) {
                case -2111278097:
                    this.OooooO0 = interfaceC4350sa;
                    str = "ۨ۬ۜۘ۫۫ۘۦۜۚۛۢۡۗۚۢ۫ۗ۠ۢۗۢ۫ۘۥۛۚۚۨۚ۟ۢۙۦۤۥۘ۬ۧۖۘ۟۟ۙ۫ۜۘۘۥۗۛۤۢۖۘۖۧۤ";
                    break;
                case -1210172210:
                    this.Ooooo0o.setCallBack(interfaceC4350sa);
                    str = "۟ۤۡۘۡۜۥۦۦۖۦۖۘۢ۠ۡۖ۠ۧۚۙۨۗۥۘۨۡۡۘۗ۠ۡۥۜۘۗۛۧۗۙ۫ۛۦۥۘۜ۫۠ۘۜۧۦۘۜۨۖۦۘ";
                    break;
                case -1106781518:
                    str = "ۛۘۦۘۡ۠ۗۖۛۖۘۜۜۜۙۨۖۗۢۥۘۡۗ۬۟۬ۘۖۡ۬ۨۡۡۘۤۨۜۢۦۧ";
                    break;
                case 1240372011:
                    str = "۟ۨۡۧۡۜۦۡ۟ۤۗ۠ۚۥۖۚۘۨۗۡۤۜۢۤۗۥۘۨۨۧۘۨۘۘۧ۟۫ۡ۟ۖ۫ۨۘ";
                    break;
                case 1504829121:
                    return;
            }
        }
    }

    public void setScrollLoad(boolean z) {
        String str = "۬۫ۡۡۨۡۘۦۜۜۘۡ۫ۦۘۢۨۨۘ۟ۚۨۢۖ۠ۚۡۘۦۜۖۥۗ۠ۙ۬ۡۘۚۜ۠ۧۖۖۗۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 89) ^ 879) ^ 4) ^ 1147342798) {
                case -1063795670:
                    return;
                case -280264314:
                    str = "ۧ۬ۦۘۙ۟ۜۘۥ۠ۢ۬ۤۖ۫ۗۥۛۗۦۤ۬ۥۥ۬ۡ۫ۛۖۘۘۛۗ";
                    break;
                case 947345816:
                    str = "ۖۚۨۜۦۙۙۖۥۘۦۖۘ۠ۥۘۘۛۦۧۘۦۧ۫ۤۦۙۥۚۙۚۜۤۚۘۧ۠۠۬۠ۘۘۘۛۘۥۨۚۘۥ۬ۦۡۘۢۙۤۨۘ";
                    break;
                case 1554580069:
                    this.OoooOoO = z;
                    str = "۟ۡۧۘۜۛۨۘۧۘۘ۬ۦۖۥ۬ۨۜۖۥۘ۬ۨۦۘۨ۟ۖۘ۫۠ۦۡۜ۠ۡۡۘۡ۟۫ۡۗۤ۫۟ۢۚۚ۠ۘۘۢۛۡۘۘۘ۟";
                    break;
            }
        }
    }

    public void setmListViewScrollListener(OooO00o oooO00o) {
        String str = "ۖۗۛۨ۠ۥۖۤۤ۫ۚۡۘ۠ۛۜۖۚۡۘ۬ۦۗۜۚۘۘۧۥۦۘۘ۬ۡۛۚۚۗۚ";
        while (true) {
            switch ((((str.hashCode() ^ 396) ^ 288) ^ 827) ^ 238828813) {
                case -1938258221:
                    str = "۟ۗ۠ۥۥ۟ۘۘۡۜۜۥۘۘۚۤۡۦۗۛ۬ۡۥۦۡۘۚۗۦۤۢۚۦ۬ۙۛۗۢ۫۫۟ۨ۫ۗۨۦۘۤۖۜۘۚ۫۬ۙۖۨ";
                    break;
                case -1090242756:
                    this.Oooooo = oooO00o;
                    str = "۬ۛۛۢۦۘۘۛۥۗ۟ۥۡۜۥۘۛۥ۠ۗۡ۬ۙۖۢۢۥۙۖ۬ۖ";
                    break;
                case 252996232:
                    return;
                case 332948216:
                    str = "ۦۘۥۘۜۧۚۥۘۦۘ۫۟ۢۜۥۜۨۨۦۘۢۜ۫ۢ۠ۛ۟۠ۨۢۗۨۘۢۙۘۥۘ۠";
                    break;
            }
        }
    }
}
