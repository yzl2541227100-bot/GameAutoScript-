package com.cyjh.elfin.p200ui.view.customview.loadwidget.swiperefresh;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.AbsListView;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReHeadDefaultSwipeRefreshLayout<T> extends ReDefaultSwipeRefreshLayout {
    public ReHeadDefaultSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public boolean canChildScrollUp() {
        BaseListView baseListView = null;
        String str = "ۖۘۡۢۛۧ۬ۛ۫ۗۘۢۧۙۤۗ۬ۢۢۡۢۨۤۦۘۜۛۖۜۦ۠ۢ۟ۚۥۧۥۘ";
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            switch ((((str.hashCode() ^ 383) ^ 328) ^ 490) ^ 1709577754) {
                case -2094391809:
                    str = "۠ۥۥۦۖۥۘۛۙ۬۬ۧۢۙ۫ۢۧۧۖۙۘۥۙۧ۬ۤۙۚۖ۟ۖۘۛۙۚۖۚۥۤۚ۟ۖۧ۠";
                    z3 = z4;
                    break;
                case -1400164316:
                    str = "ۥۨۜۘ۠ۚۗۨۙ۫ۙۧۧۥۢۖۘ۬۠۫ۨۢۥۛۜۜۘۘ۬۠۬۠ۡۘ";
                    z3 = false;
                    break;
                case -768634647:
                    str = "ۤۤۤۛۡۥۘۘۧۨۘۥۥ۬۟ۗۖۘۦۗۨۘۜۤۗ۬ۛۙۙ۠ۜ۠ۦۘ";
                    break;
                case -587974912:
                    str = "ۗۨۙۜۗۤۗۙ۟۟ۚۦۘ۬ۡۗ۠ۥۤۡۧۥۘۡۖۢۡۖۘۧۖۖ۟ۦۖۘۦۚۦ";
                    z5 = true;
                    break;
                case -378110681:
                    str = "ۤ۬ۥۥۚۖۘ۫ۡۖۘۥۨۥۜ۠ۖۘ۟ۨۡۖۖۘ۟۫ۤۥۛۦۡۛۚ۫ۖ۫ۚۗۛۖ۟۠ۛۖۘ۫۬ۥ۟ۧۗۖۥۥۡۙۖۘ";
                    z = false;
                    break;
                case -129260928:
                    str = "ۘۗۘۘۧۙ۬۬ۥۡۘۢۢۗ۟۠۟ۨۗ۫۠ۨ۬۬ۛۘۘ۠ۖۘۘۡۗۦۘۗ۬ۡۘ۫ۘۥ۫ۧۗۚ۫ۥۘۙۦ۫ۤۗۦۘۦۘ۬ۢۥ";
                    z3 = z4;
                    break;
                case 98899138:
                    String str2 = "ۡۜۧۘ۠۟ۨۘۜۤۥۘۨ۟ۦۚۡۤ۟۬ۙۥۖ۫ۚ۟ۖۘۙ۟ۥۘۙۘۦۘۜۘۥۘۖ۫ۘ۬ۘۢۦ۬۠۠ۨۜۚۘۗۖۢۘۧۢۢ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1856959561)) {
                            case -756339113:
                                str = "۬ۚۤۚ۟ۜۘۚۛۥ۠ۢۛۧۙۦۘۘۢۖۘۗۧ۠ۧۙۡۧۧۡۘۚۤ۬ۥۖۗ۟ۜۗۘۥۘ";
                                break;
                            case -112539870:
                                String str3 = "ۢ۟ۜۛۚ۠ۘ۟۫ۗ۠ۚۨۥۗۡۜۦۜۚۗ۫ۤ۬۟ۜۘ۠ۢۛۖ۫ۖۘۘۥۙۧ۬ۖۙۧۨۘ۫۫ۧۨۗۢۗۦۥۛۜۥ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-2138902898)) {
                                        case -1705866803:
                                            str2 = "ۧۦۥۘۗۚۚۡۡۚۤۢۛۦ۫۟۫ۡۜۙۤۤۖۚۦۥۘ۫ۧۥۘۘۥۦۘۚۥ۠ۧۥۘۚۦۨۘۢۙۢ۬ۦ";
                                            break;
                                        case 35742303:
                                            str2 = "ۛۦۛۧ۫۬ۢ۟ۘۧۗۢۨۧۥۘۨۚۘۘ۟۟ۡ۬۫ۖۡۖۘۘۢۙۖۖۛۖ۠ۢۦۢۥۦۘۙۗۛ۫ۘۦۘ۫ۘۧۜۚۖۘۚ۠ۘۘ";
                                            break;
                                        case 1444948002:
                                            str3 = baseListView.getChildCount() > 0 ? "ۤ۫ۦۜۥۢۦۖۖۢۚ۫۬۟ۢ۟ۖۘۚۛۙۙۦۨ۬ۥۜۘۢۘۧۘۛۘۧۙۡۘۡۢۜۡۨۡۘۚۛۖۘۧۗۦۤ۬ۙۛۜۨۘ" : "ۧ۠ۥۘۡۨ۬ۜۘۤ۬ۤۦۘۘۨۧۘۦ۫ۥۘۛۢۥۧۡۦۘۦۖۨۘۢۖۨ۫۟ۘۛۗۘۦۥۚۤۡۧۘۚۥۧ۫ۧۤۨ۫ۥۗۧ";
                                            break;
                                        case 1689816804:
                                            str3 = "ۙ۬ۥۘۖۘۜۘ۟ۥۖۘ۫ۢۤۘۖۜۘۖۦۘۚۥۧ۠ۜ۟ۙۖۧ۠۫ۜ۟ۛۘۨۧۤ۠۫۬۠ۘۡ۫۠ۦۘ۬۬ۦۘۨۢۡۘۚۧ";
                                            break;
                                    }
                                }
                                break;
                            case -96031439:
                                str2 = "۬ۤۨۥۙۚۨۢۘ۠ۖۨۘۚۢۤۦۤۘ۫ۙۙۙۥ۫ۗۖ۬ۦۘۖۖۘۚۚۙ";
                                break;
                            case 1537302042:
                                break;
                        }
                    }
                    break;
                case 112202506:
                    str = "ۥۡۗۚۗۥ۟۫ۥۘۜۤۥۤۛۥۤۢۥۘۦۚۘۘۤۘۨۘۧۡۗ۠ۧۢۥ۟ۖۘۜۜ";
                    break;
                case 182960336:
                    str = "ۜۚۙ۫ۘ۠ۗۨۘ۠ۖۧ۫۬۬ۥۘۘۜۘۡۘۖۗۡۘۙۧۡۘ۬ۚۘۘۛۦۢۗ۟ۚ";
                    z4 = true;
                    break;
                case 308592978:
                    return z;
                case 366614327:
                    z6 = baseListView instanceof AbsListView;
                    str = "ۚ۬ۤۚ۫ۦۘ۠ۘۗۗ۬ۜۘۘۖۛۙۢ۠ۨۜۛۜۡۘۨ۫۫ۛۤۥۗۗۨۘۨۗۥۘ";
                    break;
                case 369401393:
                    String str4 = "۫ۙ۬ۚ۬ۜ۬۟ۥۨۢۦ۠ۘۖۜ۫ۘ۟ۦۦۛۗۜۥۘ۫ۥۡ۟ۛۡۘۚۛۖ۠ۥۗۚۥۙ۫ۛۜ۠ۦ۬ۧۖۧۘۙۧۘۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 1960278916) {
                            case -1082013760:
                                String str5 = "ۡۡۜۛۙ۠ۧۤۤۢۦۧۧۢۥۗۦۘۦۛۗ۠۬ۡۤۜۛۡۥ۬ۖۥۤۜۢۙۚ۟ۚ۠ۢۜۘۧۖۨۨۗۥ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1192466411)) {
                                        case -1385587240:
                                            str4 = "۟ۨۙۖ۟ۦۘۛۧۚۦۦ۫۫ۥۡۧۗۥۘ۟ۨۥ۬ۤۜۘۘۗۛۚۡ۠ۛۗۡ۟۠ۛۨۡۨۜۢۡ";
                                            break;
                                        case -829059860:
                                            str5 = baseListView.getScrollY() > 0 ? "ۧۚۙۚۤۤۙۢۢۛۙۖۘ۟۫ۥۘۤۨۤ۫۟ۨۘۛۗۜۡ۠۬ۚۨۖۧ۟ۖۜۡۚۜۧۧ۫ۧۜۘ" : "ۡۥ۬ۘۤۦۘۥۙۡۘۢۧۦ۠ۡ۟ۤ۫ۙ۠۫ۛۖۘۘۘۢ۟ۘۘۛۙۖ";
                                            break;
                                        case 1144390545:
                                            str4 = "ۖ۬ۡۘ۫ۧۥۘۡۦۚۙۥۙۚۥۘۡ۬ۡۘ۫ۡۧۘۨۗۥۙۘۗۢۙۡ۟ۛۥۥ۫ۢۤۧ۬۫ۜۗۛۙۨ۟ۜۨۘ۟ۙۨۘۙۛ۬";
                                            break;
                                        case 1674324695:
                                            str5 = "ۡ۫ۥ۠ۢۧۜۡ۫ۛۙ۬ۦۗۜۘۢ۫ۡۘ۫ۛۤۖۚۨۘۧۧۢۧۗۢ۫ۖۦۡۗ۬ۜ۫ۖۤۥۡۘۖۡۡۘۛۡۗ";
                                            break;
                                    }
                                }
                                break;
                            case -82616037:
                                str4 = "۫ۛ۬۬۬ۦۚۡۜۘۖۛۨۜۛۨۚۤۗ۟ۖۘۥۧۘ۠ۨۦۚۚۡۗ۬ۖۘۢۢۖۜۘ۟ۘۧۜ";
                                break;
                            case 47408200:
                                str = "ۤ۫ۡۘۖۙۧۥۜۘۘ۬ۜ۠۠ۘۧۘۧۨۜۨۗۖۘۛۙۘۘۛۡۧ۠۟۬ۘۛۘۨ";
                                continue;
                            case 793660979:
                                str = "ۜۨۦ۬ۖ۫۟۠ۨۘ۬ۡۘۨۦۥۚۦۖۤۖۡۘۙۛۧۘۧۖۗۜۘ";
                                continue;
                        }
                    }
                    break;
                case 424199666:
                    String str6 = "ۢۨ۠ۧۛ۫ۛۤۜۜۘۘۙۨۗ۬ۥۡۘۘۧۘۘ۟۬۠۫ۨۚ۬۠ۨۖۖۖۨ۫ۡۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 1013417464) {
                            case -2010501658:
                                str = "ۚۖ۫ۦ۟ۥۘۤۘۘۘۗۚ۠۬ۡۨۘۨ۠ۖ۬ۨۡ۠ۗۨۘۗۢۘۘۗ۠ۜۘ۟ۛۨۗۢ۫";
                                continue;
                            case -1610788803:
                                str6 = "ۡۖ۟ۙۧۥ۫ۙۨۘۘۢۦۚۤ۟ۜۖۘۘۨۤۧۗۡۜۜۤۖۗۨۛ۠ۦۘۙۤۚ";
                                break;
                            case 1537162527:
                                String str7 = "ۨۘۖۘ۬ۘۦۛۡۛۨۛۨ۠ۚۦۘۗۛۨۘۚۖۧ۫ۜۡۘۖۖۦۘۥۨۨۛ۫ۖۜ۟ۡۚۢۦۘۘۡۢ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1935299627) {
                                        case -1715706508:
                                            str7 = z6 ? "۬ۧ۬۬ۡ۬۠ۜۜۘۗۗۨ۬ۡۗۨۧۤ۬ۖۦۘۜۖۢۧ۠ۥۖ۬ۖۘۘۢۦۢۜۨۘۢۚۥۨۧۙ۬ۖۥۢۢۜ" : "ۨ۫ۦ۟ۚۥۜۗۙۢۢۦۘۨۘۡۛۚۥ۟ۡۘۚۡۗۜ۬ۨۧ۫";
                                            break;
                                        case -1574488733:
                                            str6 = "ۙۨ۫۬ۗ۬ۨۥۙ۟۟ۧۢۗۚۙۖۡۖۚ۬ۡۧۘۘۜۗ۬ۦۤ۠ۘۤ۟ۥۘۘۘۡۥۜ۠ۢۡۜۢۙۚ۬ۡۘۡۙۜ۟ۖۡ";
                                            break;
                                        case 658324367:
                                            str6 = "ۦۜۥۘۦۗۛۜۜۨ۬ۥۙۛۦۛۙۗۘ۬ۛۖۥۦۡۘۚۖ۠ۛۡۘۢۖۧۘۗۖۥۙۧۥۘۛ۠۫ۖ۠ۙۧۙ۠";
                                            break;
                                        case 1030518020:
                                            str7 = "۠۬ۦۥۚۡۘۦۚۦۦۤۦۗۥۨ۟ۜۨۘۖۗۥۘۡۜۘ۬ۗۧۚۨۡۘۘۡۧۧۘۜۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1904947893:
                                str = "۫ۛۧۧۥۜۥۥۗ۫ۥۘۘۨۘ۫ۧۗۖۘۥۦۜۘۜۤۛ۠ۦۤ۟ۤۨ۟۬ۖۘۢۤ۟";
                                continue;
                        }
                    }
                    break;
                case 470808807:
                    String str8 = "۠ۙۥۜۢۡۘ۬ۤۛۖۗۤۥۡۙۛ۟ۦۙۡۡۘ۫ۘۧۙۡۧۡۨۜ";
                    while (true) {
                        switch (str8.hashCode() ^ (-752196484)) {
                            case -1315115073:
                                String str9 = "۟ۛ۬ۜۛ۫ۙۛ۬ۧۧۘۘۙۧ۫۠ۙۜ۫ۘۦ۫ۨۘ۬ۜۘۘۨۗۡۘ";
                                while (true) {
                                    switch (str9.hashCode() ^ 658519293) {
                                        case -2113880061:
                                            str9 = "ۦ۠ۥ۠۟ۜۘۥ۬ۘۘۤۤۦ۠ۚۦۘۜۡۤۥۡۖۘ۬ۢۧۗۢۖ۫ۨۥ۬۟۠ۧۜۘ";
                                            break;
                                        case -1932832719:
                                            str8 = "ۛ۫ۖۖۨۘۘۜۚۦۨۧۦۘ۬ۥۢۢۧ۠۫ۙۚۘۚ۠ۙۡۥۘۙۤۗۖۖۖۘۘ۬ۤ";
                                            break;
                                        case 1530855672:
                                            str8 = "۫ۥ۬ۙ۠ۚۗ۫ۜۘۨۚۖۗۘۡۜۗۜۘۙۛۘۤۤۨۘۡۚۨۘۙۥۖۘۖۨۨۘۤۦۥۜۦۧۘ۠ۚ۫";
                                            break;
                                        case 1691762033:
                                            str9 = Build.VERSION.SDK_INT < 14 ? "ۡۥۖۘۨۨۧۚۛ۠ۚۛۛۚۖۖۤۜۥۘۥ۫ۡۘۡ۬۠ۚۗ۫ۙۤۥۘۤۚۖۜ۟ۧۖ۠ۧۡ۬ۖۘۙۧۢۖۧۖۘ" : "ۡۘ۫ۨۙۧۤۗۡۢۡۧۖ۠۫ۤۗ۫۫ۤۨۘۧ۬ۨۜ۟ۜۘۤۘ۟";
                                            break;
                                    }
                                }
                                break;
                            case -1048780344:
                                str = "۫ۙ۟۬۠۫ۖ۫ۥۘ۬ۗۦۘۘۥۜۘۜۜۜۜۥۙ۫ۖۧۘۤ۠ۦۨۧۙۦۚۗۚۨۛۚۨۙۡ۫ۥۖۥ۬ۘۗۡۘۥ۟ۙۛۚۨۘ";
                                continue;
                            case -102337838:
                                str = "ۥۘۘۘ۬۟ۨۘۖۜۦۧۥۦۘۦۦۧۘۡ۫ۚۤۡۤۙۛ۠ۡۦۥۘۢۡۤۛۨۧۘۗۤۤۖۘۘۘۙۛۨ۫ۘۘۘ۟ۧ";
                                continue;
                            case 2112024958:
                                str8 = "ۥۜۤۗۨۚۢۛۥۘ۟ۘۛ۟ۨۙۗۥۘ۫ۨۦۘ۟ۨۦۘۛۘۙ۠۫ۖۘۡۖ۫ۜ۬ۡۘۜۖ۟ۙۦۤ۟ۨۖۘۧۨۡۘۢۖۗ۬ۛ۟";
                                break;
                        }
                    }
                    break;
                case 742271030:
                    return ViewCompat.canScrollVertically(this.OoooOoO, -1);
                case 831016797:
                    str = "ۛۜۤۜ۠ۥۨۙۤۚۨۗۖ۠ۖۨۗۘۘۡۡۘۘۛ۠ۥۘۤۖۨۛ۠ۧۦۗۡۘۧ۬ۜۘۥۢۘۘ۠ۚۖۘ";
                    z = z5;
                    break;
                case 1196093450:
                    str = "ۤ۬ۥۥۚۖۘ۫ۡۖۘۥۨۥۜ۠ۖۘ۟ۨۡۖۖۘ۟۫ۤۥۛۦۡۛۚ۫ۖ۫ۚۗۛۖ۟۠ۛۖۘ۫۬ۥ۟ۧۗۖۥۥۡۙۖۘ";
                    break;
                case 1449408646:
                    str = "ۥۨۜۘ۠ۚۗۨۙ۫ۙۧۧۥۢۖۘ۬۠۫ۨۢۥۛۜۜۘۘ۬۠۬۠ۡۘ";
                    break;
                case 1494710261:
                    String str10 = "ۥۧۘۘ۫ۧۜۘۨۡ۠ۤۡۡۗۖۗۗۦۘ۟ۡۡۘۤ۟ۜۘۥۖۖۘۨۘ۠";
                    while (true) {
                        switch (str10.hashCode() ^ 100201961) {
                            case -1337524168:
                                break;
                            case 333509973:
                                str = "ۙۗۧۧ۫ۢ۠ۥ۬ۦۧۢ۠ۖ۬ۢۤۤۖۘ۫ۘ۟ۢۤۦۘ۬ۧۜ";
                                break;
                            case 1224693484:
                                String str11 = "ۖ۠ۛ۫ۛۢ۟ۜ۟ۤۡۧۘ۠ۛ۫ۜۡ۟ۦۢۤ۫ۘۢۛۛۜۛۙۡۘۤۤۡۖۥۨۘۙۨۛ۫ۘۘ";
                                while (true) {
                                    switch (str11.hashCode() ^ 1538204961) {
                                        case -2039844747:
                                            str11 = baseListView.getChildAt(0).getTop() < baseListView.getPaddingTop() ? "ۨۙۦۘ۠۠ۗۙۗۚۧۢۥۙ۠ۖۘۖ۟ۜ۠ۛۤۗۨۨۘۧ۫ۗۜۚۤۗۨۘۘ۠ۥۦۙۖ۬ۢۧۜ" : "ۥۜۤۖ۟ۨۜۡۤۤۧۡۢۥۘۜ۠ۚۦۛۙۜۗۥۧۢۛۦۡۘۘ۬ۨۜ۬ۥۘۘۢ۟ۤۙۘۘۘ۬۫ۖۨۧ۬";
                                            break;
                                        case -1011347966:
                                            str11 = "ۤۨۦۢۨۘۚۙۗۘ۫ۦۨۙۜۨۢۦۜ۟ۧۙۛۛ۬ۛۥۘ۟ۤۙۨۧۤ۬ۢۤۛۧۜۖۧۢ";
                                            break;
                                        case -444962233:
                                            str10 = "ۨۨۜۘۨۤۚۛۜۨۘ۫ۘۖۘۤۧ۟۬۬ۚۗۨۖۦ۟ۡۖۘۡۙۥۡ۬ۛۙۘۦۘۤۛۦۨۚۜۖۜۚۘۥۗۛۗ۬ۛۜۘ";
                                            break;
                                        case 1514108602:
                                            str10 = "ۡۚۤ۟ۦۢ۬ۗۥۙ۫ۥۤ۫ۨ۫ۨ۠ۨ۟ۢ۫۟ۜۥۢۦۘۨ۟ۨ";
                                            break;
                                    }
                                }
                                break;
                            case 1906392115:
                                str10 = "ۛ۠ۜۜۦۥۤۖۨۖۡۧۘۡۢۗۧۨ۟ۢۨۦۘۡۘۜۡۚ۟ۜ۫ۢۦۜۦۧۗۢ۠ۥ۠ۙ۠";
                                break;
                        }
                    }
                    str = "۬ۧۧۦۦۦۨۙۜۘۗۘۤۗۗۨ۠ۛۢ۫ۦۘۖۦۗۥۥۦۘ۠۠ۗۦۖۖۖۚۖۘۘۦۗ۫ۛۛ";
                    break;
                case 1995773142:
                    str = "۠ۦۤۘۙ۬ۗۢۘۦۚ۫ۢۘۧۥۨ۬۠۬ۙۜۘ۠۟ۤۧۗۖۘ۟ۘۦۧۛۜۘ";
                    break;
                case 2019816429:
                    return z3;
                case 2023757838:
                    baseListView = this.OoooOoO;
                    str = "۫ۤۘۘۧۥۦۤۦۤ۟ۖ۫ۥۛۥۖۙۜۘۨۨۘۡۖ۠۠ۖۘۡۖۛۜۛۖۡۦ۠ۦۜۦۘ۬۠ۖۘ۬ۛۤۙ۠ۨۢۛۢۦۤۥ";
                    break;
                case 2108292211:
                    String str12 = "ۗ۟ۨ۬ۚۚ۠ۡۛۜۖۥۘۧ۠ۦۖۢۦۢۨۙۚۜۛۜۙۚۡۢۡۙۢۨ۬ۚ۠۟ۥۧۘۘۜۥۘۤ۠ۘۜۘۙ";
                    while (true) {
                        switch (str12.hashCode() ^ (-1529713903)) {
                            case -1970622005:
                                str = "ۢ۟ۛ۬۟ۢۢ۬ۗۜ۟ۢ۟ۥۡۘ۟ۡۗۦۜۙۘۖۧۘ۫ۘۚۢۥ۠ۛ۫ۘۘۨۨۦۘ۠۬ۜۙ۬ۘۘۥۦۤ۬ۤۙ";
                                break;
                            case -1306779777:
                                break;
                            case -1119748627:
                                str12 = "ۧۧۨۚۦۧۚۜ۠ۡۜۜۖ۬ۨۜۦۗۡ۫ۧۦۜۜ۟ۡ۟۠ۥۧ۟ۙۡۘۧ۟۠ۢۧ۬ۧۚۜ";
                                break;
                            case 503305026:
                                String str13 = "ۥۜۖۘۗۗۡۨ۬ۖۘۦۖۖۘۙۘۙۥۜۗ۠ۤۦۘۤ۫ۤ۬ۢ۟ۢۡۡۘۤ۬ۡۘ۟۟۬۟ۢ۟۫۬۟";
                                while (true) {
                                    switch (str13.hashCode() ^ (-506206972)) {
                                        case -1036659854:
                                            str13 = "۬ۢ۟ۖۧۘۧ۠ۚۨۨ۫۟ۘۡ۟ۢ۬ۦۚ۬۠ۗۥ۠ۚ۬ۗۙۨۘۤۗۡۘۚ۠ۜۘ۠۟ۜۥۘۘۙۖۘۜ۟۠";
                                            break;
                                        case -275330593:
                                            str12 = "۟۟۠ۨ۫ۡۗۡۜۘۡۜۘۧۜ۬ۗۢۨۖۤۜۘۢۗۨۘۡۨۢۚۢۤۥۚۖۖۤۜۘ";
                                            break;
                                        case 748551491:
                                            str12 = "ۥۖۛۖۧۛۦۗۖۘ۬۠۠ۤۢۜۘۗ۫ۗۘۗۦۘ۫ۨ۬ۗۖۙ۬ۧۡ۫ۙ۟ۢ۟ۢ";
                                            break;
                                        case 1709109365:
                                            str13 = baseListView.getFirstVisiblePosition() <= 0 ? "ۛۛۗۥۡۖۛۗۤۚۡۙۧۧۛۘۛۘۙۜ۬ۘۘۚۤۖۧ۬ۥ" : "۟ۗۗ۠۠ۡۘ۟ۥۗۥ۠۫۠۟ۘ۠ۨۗۗۤۜۡۨۜ۫ۚۗۤۖۢۚۨۨۧۤۖۤۜۧ۬ۚۖۘ";
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
}
