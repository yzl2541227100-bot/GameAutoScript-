package com.cyjh.elfin.p200ui.view.customview.loadstate;

import com.anythink.basead.p025ui.GuideToClickView;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class LoadStatueEnum {
    private static final LoadStatueEnum[] $VALUES;
    public static final LoadStatueEnum COMPLETE;
    public static final LoadStatueEnum EMPTY;
    public static final LoadStatueEnum FAILED;
    public static final LoadStatueEnum LOADING;
    public static final LoadStatueEnum NON;

    static {
        String str = "ۜ۫۫ۘۨۨۚۡۥۢۦۖ۫ۦۖۥۦۚ۫۠۫ۚۙۖۙۦۥ۠ۥۤۤۢۦ۫ۘ";
        LoadStatueEnum loadStatueEnum = null;
        LoadStatueEnum loadStatueEnum2 = null;
        LoadStatueEnum loadStatueEnum3 = null;
        LoadStatueEnum loadStatueEnum4 = null;
        LoadStatueEnum loadStatueEnum5 = null;
        while (true) {
            switch ((((str.hashCode() ^ 690) ^ 880) ^ UiMessage.CommandToUi.Command_Type.SET_BACKCOLOR_VALUE) ^ (-1006251226)) {
                case -2004492620:
                    str = "ۡ۫ۥۘۜۛ۫ۛۦۖۘۖۤۙۧۚۘۘۛۖۥۨۨۖۜۖۦۘۤۛ۠ۦۧۜۦ۫ۢۙۡ۟ۧۘۡۦۧۙۤۚ۟";
                    loadStatueEnum3 = new LoadStatueEnum("FAILED", 2);
                    break;
                case -1759991410:
                    FAILED = loadStatueEnum3;
                    str = "ۚۡۥۙۡۦۤۡۨۙۖۛۜ۟ۢۚۗۛ۟ۘۚۢۜۤۦۦ۫ۥ۟ۦ۫۠ۖۘۥۤۦۛۙۦ۫ۙۚۙۦ۟ۙ۫ۡۥۥۥۙ۠";
                    break;
                case -1200350862:
                    return;
                case -744619806:
                    str = "ۖۜۖۛ۟ۘۖۗۚۢۛۤ۠ۖۦۦۡ۠۠ۙۛۗۘۜۘۘۨ۬۬ۘۖۖ۫ۢۚۜۧۘۜۤ۟۬ۙ۫ۛۥۡۜۘۘۙ۠۫ۧ۟";
                    loadStatueEnum2 = new LoadStatueEnum("EMPTY", 3);
                    break;
                case -728075816:
                    NON = loadStatueEnum5;
                    str = "ۤۡ۫ۦ۠۟ۡۤ۬ۙۨۢۨۙ۟ۛۢۖۗۚۗۘۚۥۘۧۛۘۗۚۢۤۤۚۗۚۨۘ۫ۨۘۙۥۨۘ";
                    break;
                case -412390327:
                    LOADING = loadStatueEnum4;
                    str = "ۘۥۨۧۚۡۘۤۥۜ۫ۚۖ۫۬ۢۡۛۖۘ۠ۘۛ۬ۖۥۢ۟ۜۥۖۨۧۛۙۖۙۘۡۡۥۘۙۨۛۦۡۘۨ۟ۨ";
                    break;
                case 242770476:
                    $VALUES = new LoadStatueEnum[]{loadStatueEnum5, loadStatueEnum4, loadStatueEnum3, loadStatueEnum2, loadStatueEnum};
                    str = "۬ۨۚ۟ۗۤۗۚۢۘ۬ۦۦۥۚۧۢۜ۠۫ۥۤۢۦۘ۬ۛۜۢۗۡ۬۬ۗۢۡۦ۬ۦۘ۠ۖۜۘۘۧۗ۟ۜ";
                    break;
                case 798088554:
                    str = "ۙۥۘۢۙۖۘ۫ۚۘۘۜۢۧۨۨۙۜ۠ۡۘۗۘۘۥۖۨۘۤ۟ۘ۠ۨۡ";
                    loadStatueEnum5 = new LoadStatueEnum("NON", 0);
                    break;
                case 1350256596:
                    loadStatueEnum = new LoadStatueEnum("COMPLETE", 4);
                    str = "ۚ۬ۡۧۥۘۢۚۡۘۖۚۥۘۨ۬ۤۤۚۢۨۗۧ۠ۙۦۢۗۘ۬ۧۗۦۡۗۗۘۡۘۘۧۜۘ۟ۨ۟۬۟ۜۚۙۥ";
                    break;
                case 1397637095:
                    EMPTY = loadStatueEnum2;
                    str = "۠ۨۖۘ۫۫ۖۤ۬ۚۗ۫۫ۘۨ۠ۘۡۧۚۜۜۙۖۘۥۢۨۘۢۚۨۘ۫ۚۘۘۦۘۦۘۜۖۗۢ۠ۙۚۤۘۦ۟۫ۚ۠ۡۘۜ۟۫";
                    break;
                case 1607157386:
                    COMPLETE = loadStatueEnum;
                    str = "ۛۥۙۙۙۤۖۜۡۘ۠۠ۡۡۛۜۛۨ۬ۢۖۛۨۙۡ۬ۗۙۥ۟ۗۨۢ۟ۜۨۦ";
                    break;
                case 1693261401:
                    str = "ۥ۫ۘۘۧۖ۠ۚۗۙۢۢۨۙۨۢۥۘۥۘۚ۠ۢۜ۠ۘۛ۠ۥۥ۫ۨۘ";
                    loadStatueEnum4 = new LoadStatueEnum("LOADING", 1);
                    break;
            }
        }
    }

    private LoadStatueEnum(String str, int i) {
    }

    public static LoadStatueEnum valueOf(String str) {
        String str2 = "ۨۙۧۦۛۦۘۡۤ۟۬ۤۥۜۚۘۤۘ۠۬ۨ۠ۦۖۜۘۦۜۨۙۢ";
        while (true) {
            switch ((((str2.hashCode() ^ 319) ^ 527) ^ 248) ^ 509448377) {
                case -1478868019:
                    return (LoadStatueEnum) Enum.valueOf(LoadStatueEnum.class, str);
                case 1683900826:
                    str2 = "ۢۗۛۢۧ۟ۢۚۖۡ۫ۗۤۗۚۗۥۘۘ۟۠ۥۦۡۘۚۢۜ۟ۧۛۜۤۤۚۨ۠ۧۦۚ۬ۡۗۜۛۢۜۜۘ";
                    break;
            }
        }
    }

    public static LoadStatueEnum[] values() {
        while (true) {
            switch (((("۬۠ۡۢۢۡۧۜۗۨ۠ۢ۫ۜۥۘۖۢۡۘۖۧۨۘۦ۬ۥۘ۟۠ۡۘۖۜۨ".hashCode() ^ 479) ^ GuideToClickView.C0870a.f1448g) ^ 481) ^ 649210544) {
                case 2090936824:
                    return (LoadStatueEnum[]) $VALUES.clone();
            }
        }
    }
}
