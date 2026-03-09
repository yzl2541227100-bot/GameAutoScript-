package com.cyjh.elfin.entity;

import com.github.kevinsawicki.http.HttpRequest;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class ActionBarOperaEnum implements Serializable {
    private static final ActionBarOperaEnum[] $VALUES;
    public static final ActionBarOperaEnum ALL_CHECK;
    public static final ActionBarOperaEnum CANCLE;
    public static final ActionBarOperaEnum CLOUD;
    public static final ActionBarOperaEnum CREATE_NEW_FILE;
    public static final ActionBarOperaEnum DELETE;
    public static final ActionBarOperaEnum EDIT_SCRIPT;
    public static final ActionBarOperaEnum HEAD_ICON;
    public static final ActionBarOperaEnum MOVE;
    public static final ActionBarOperaEnum NO_ALL_CHECK;
    public static final ActionBarOperaEnum RENAME;
    public static final ActionBarOperaEnum RUN_SCRIPT;
    public static final ActionBarOperaEnum SAVE;
    public static final ActionBarOperaEnum SEARCH;
    public static final ActionBarOperaEnum START_DOWNLOAD;

    static {
        ActionBarOperaEnum actionBarOperaEnum = null;
        ActionBarOperaEnum actionBarOperaEnum2 = null;
        ActionBarOperaEnum actionBarOperaEnum3 = null;
        ActionBarOperaEnum actionBarOperaEnum4 = null;
        ActionBarOperaEnum actionBarOperaEnum5 = null;
        ActionBarOperaEnum actionBarOperaEnum6 = null;
        ActionBarOperaEnum actionBarOperaEnum7 = null;
        ActionBarOperaEnum actionBarOperaEnum8 = null;
        ActionBarOperaEnum actionBarOperaEnum9 = null;
        ActionBarOperaEnum actionBarOperaEnum10 = null;
        ActionBarOperaEnum actionBarOperaEnum11 = null;
        ActionBarOperaEnum actionBarOperaEnum12 = null;
        ActionBarOperaEnum actionBarOperaEnum13 = null;
        ActionBarOperaEnum actionBarOperaEnum14 = null;
        String str = "۬۫ۜۚۥۚۤۧۦ۬ۤۚۚۤۨۘ۬۬۟۬۟ۡ۫۬ۚۨۨۘۗ۬ۙ";
        while (true) {
            switch ((((str.hashCode() ^ 35) ^ 342) ^ 166) ^ 2111031366) {
                case -2119303044:
                    START_DOWNLOAD = actionBarOperaEnum14;
                    str = "ۡۤ۬۬ۦۖۘۤۜۖۖۤۤۘۘۙۡ۠ۧۘۥ۠ۥۖۜۘۘ۫۫ۢۡ۬۠ۨۡۘۦ۬۬ۧۘۘۘۨۗ";
                    break;
                case -1867613239:
                    actionBarOperaEnum2 = new ActionBarOperaEnum("SAVE", 1);
                    str = "ۦۛۡۘۗۗۛۤۡۙۥۡۡۘۦۛۖۙۘۚۡۢۦۙۛۧ۟۬ۨۘ۫ۜۘۘ";
                    break;
                case -1866602494:
                    NO_ALL_CHECK = actionBarOperaEnum8;
                    str = "۫۫ۛۥۦۙ۫ۦۜۗۚۥۘۖۢۨ۬ۧۧۗۚۨۘ۠ۗۡۘۙۘۨۥۛۤۧۘۨۘۜ۟ۚۧ۫ۦۘۖۖۥۜۛۤۧۡۚ";
                    break;
                case -1860679119:
                    actionBarOperaEnum9 = new ActionBarOperaEnum("CLOUD", 8);
                    str = "ۢ۠ۚ۠ۧ۬ۡۘۘۘۤۜۧۘۗۛۥۥۚ۫ۤ۠۟ۨۥ۬ۗۦۚۦۙۘۘ";
                    break;
                case -1532444140:
                    actionBarOperaEnum6 = new ActionBarOperaEnum("EDIT_SCRIPT", 5);
                    str = "ۤۢۘۘۙۨۢۙۡ۠ۛۜۦۧۨۘۘۙۦۥ۟ۗۙۘ۫ۢۛۛۚۦ۠۟ۡۘۗۖۥۦ";
                    break;
                case -1460425347:
                    actionBarOperaEnum8 = new ActionBarOperaEnum("NO_ALL_CHECK", 7);
                    str = "۬ۜۥۙۧۦۘۨۧۧ۫۬ۢۥۛ۬ۨ۬ۘۘۨ۟۟ۦۛۚۜ۟۬۬ۧ۟ۘۙۥۘۙ۟ۘۘۙ۟ۥ۫ۜۧۗۧۦۘۙ۠ۖۥۖۧۘۤۡۘۘ";
                    break;
                case -1384427553:
                    RUN_SCRIPT = actionBarOperaEnum11;
                    str = "ۨۘۡۘ۠ۧۡۛۚۡۦۡۖۘۤۨۨۦۢۖۘۨۗۜۘۨ۫ۨۘۗ۠ۨ۫ۢۚۖۢۚۤۗۦۡۗۘۘۦۚۚۧۖۘۛۘ۫";
                    break;
                case -1130469391:
                    actionBarOperaEnum14 = new ActionBarOperaEnum("START_DOWNLOAD", 13);
                    str = "ۚۙۤۚۗۖۗۥۘۘۖۦۧۘۙ۠۫ۛۦۘۖۤۥۘۧۜۗۖ۟۬ۤ۫۬ۙۘۘ۫";
                    break;
                case -1083450965:
                    $VALUES = new ActionBarOperaEnum[]{actionBarOperaEnum, actionBarOperaEnum2, actionBarOperaEnum3, actionBarOperaEnum4, actionBarOperaEnum5, actionBarOperaEnum6, actionBarOperaEnum7, actionBarOperaEnum8, actionBarOperaEnum9, actionBarOperaEnum10, actionBarOperaEnum11, actionBarOperaEnum12, actionBarOperaEnum13, actionBarOperaEnum14};
                    str = "ۙۛۘۘ۠ۨۖۢۤ۬ۡۢۤۛ۟ۧۦۜۘ۠ۧ۬۬ۤۦۨ۫ۗۨۘۡۘ۬ۧۨۛ۟ۗۖۖۘۘۦ۟ۡۜۚۧۧۥ";
                    break;
                case -1056797886:
                    actionBarOperaEnum10 = new ActionBarOperaEnum("CREATE_NEW_FILE", 9);
                    str = "ۡۨ۬ۛۨۘ۠۬ۚۥۦۘۢ۬ۙ۟ۦۛۛۨۘۛۨۙ۫۫ۘۧۖۜۘۗۥۖ۬ۤۙۤۦۧۘۗۥۙۨۨۗۢۗۥۘۙۦۥۚۡۘۘ";
                    break;
                case -855383477:
                    CANCLE = actionBarOperaEnum;
                    str = "ۤۖۙۚۢۤۥۤ۬ۘۖۖ۟ۛۘۘۖ۟ۡO۫۫ۡۘۘۜۤۧ۠ۡۘۘۚۢۖ۫۠ۦۨۘۘۚۖۧ۬ۥۘ۫۠";
                    break;
                case -487693586:
                    actionBarOperaEnum11 = new ActionBarOperaEnum("RUN_SCRIPT", 10);
                    str = "ۘۜۨۘ۬۠ۜۘۢۗ۠۟۫۟ۚۦۧۦۚ۬ۘۙۚۙ۬ۥۖ۫ۚۛۡۖۨۚۤۘۡۘ";
                    break;
                case -322583933:
                    DELETE = actionBarOperaEnum4;
                    str = "ۗۤۨۘ۬ۘۦۙۦۗۙۦۤۚۥۡۘۦۜ۟۠ۥۜۘۜۤۖۘۨۚۡۚۘۖ";
                    break;
                case -298270861:
                    MOVE = actionBarOperaEnum5;
                    str = "ۙۖۡ۠۬ۚۤۦۦۘۖۦۘۛ۠ۢۥ۠ۖۥۚۡۦۜۜ۬ۨۙۗۛ۠";
                    break;
                case -62501660:
                    CREATE_NEW_FILE = actionBarOperaEnum10;
                    str = "ۤۤ۫ۡۦ۠ۚۚۜۘۛۗۙۜ۬ۦۛ۠ۗۤۨ۠ۛۨۗۙۛۜۘۗ۬ۦۙۗ۬ۦۜۦۙۗۚۛۦۨ";
                    break;
                case 24863614:
                    actionBarOperaEnum = new ActionBarOperaEnum("CANCLE", 0);
                    str = "ۡۙۜۦۖۧۗۗۦۘۚۦۧۘۚۚۖۛۦۖۤۢۜۘ۠ۛ۠ۢۨۗ۫ۦۛۥۖۛۦۢۖۛۥۢۙۘۛۘ۫ۖۘۙۨۨۖۧۚۛۡ۠";
                    break;
                case 67319297:
                    CLOUD = actionBarOperaEnum9;
                    str = "ۜۙ۬ۥۙۨۦۥۢۤۨۧۖ۬ۧۦۖۦۢ۬ۦۘۚۢۗۛۡ۟ۤۗۚ";
                    break;
                case 201882012:
                    actionBarOperaEnum7 = new ActionBarOperaEnum("ALL_CHECK", 6);
                    str = "۟۫ۖۗ۫ۚۚۡۙۜۜۖۘۛ۟ۡۚۙ۬ۨۥۢۜۛ۫ۘ۬۫ۚ۟";
                    break;
                case 250813380:
                    actionBarOperaEnum5 = new ActionBarOperaEnum("MOVE", 4);
                    str = "ۖۢۦۘۗ۠ۡۤۤۖۖۙۧۜۡۜۛ۫ۦۘۤۗۜۘۦ۟ۜۛۜۙۨۦۥۡۜۥۦۦ۬ۗۡۥۘۘۖۡۘ";
                    break;
                case 375846930:
                    HEAD_ICON = actionBarOperaEnum12;
                    str = "ۡۦۦۘۚۤۜۨۨۜۥۘۗۜۗۜۥۡۙۤۙۘۖۚۧۡۦۥۧۗۛۜۧۡۘ۬ۦۘ۫ۗۦۧۘۘ";
                    break;
                case 489238026:
                    actionBarOperaEnum13 = new ActionBarOperaEnum("SEARCH", 12);
                    str = "۬ۚۘۘ۟ۜ۬ۤۛۦۘۗۜۥۥ۠ۨۘۖ۫۬ۗ۫ۥۗۜۨۚۧۗۦ۟ۜۘۚۜۦۘۛۥۛۨۡۥۘۦۤۦۘۤۢ۠ۥۢ۫۫ۢۢۜۦۜ";
                    break;
                case 504319609:
                    actionBarOperaEnum4 = new ActionBarOperaEnum(HttpRequest.METHOD_DELETE, 3);
                    str = "۠ۜ۠ۛ۟۬ۘۛۧۡۧۢۢۡۤۡۛۙۛۢۤ۬ۨۖ۬ۖ۬ۘۥۖۤۡۜۘ۬ۚ۫۫ۖۦۘ۬ۧۗۗۖۛۧۖ";
                    break;
                case 868602736:
                    EDIT_SCRIPT = actionBarOperaEnum6;
                    str = "ۡۗۘۙ۠ۢۚۗۡۛۙۜۘۡۥۤۚۧۛۚۧۜۢ۫ۚۜۚۛۡۛ۟ۢۚ۟ۜۢۙ";
                    break;
                case 941934392:
                    ALL_CHECK = actionBarOperaEnum7;
                    str = "۫۠ۤۙۥۗۚۢۗۧۧۢ۟ۗۜۘۜۦۤۗۗۥ۬ۥۡۥ۟۟ۖۚۦۛۥۦۢۡ۬";
                    break;
                case 984962224:
                    actionBarOperaEnum3 = new ActionBarOperaEnum("RENAME", 2);
                    str = "ۧ۬۟ۚۤۢۥ۟ۦۢ۫ۜۛۜۥۘ۬ۧۜۘۡۤۜۖۨۧۘۜۘۘۜۜۥۘۙۚۜۛۡۦ";
                    break;
                case 1353812061:
                    SAVE = actionBarOperaEnum2;
                    str = "۫ۦ۟ۨ۫ۦۚۥۤۦۙۧ۠ۡ۠۠ۘۘۖ۫ۘ۟ۧۖۡۚۙۢ۬ۚۦۤ۠ۙۜۤۢ۠ۜۘۘۘ۬ۙۗ۟ۧۖۘ";
                    break;
                case 1386925670:
                    return;
                case 1521219229:
                    RENAME = actionBarOperaEnum3;
                    str = "ۘ۫ۥۨۤۗۖۜۘۛۘۚۛ۬ۛۤۧۥۘۡۤۧۧۙۡۤۖۘۜۦۜۗۚ۟۬۟";
                    break;
                case 1590981453:
                    actionBarOperaEnum12 = new ActionBarOperaEnum("HEAD_ICON", 11);
                    str = "ۜۧ۠ۨۦۢۜ۟ۢۡۜۨۘۡ۫ۡۘۚۛۗۨۦ۫۬ۢۢۜۡ۫ۢۦۘ";
                    break;
                case 1936433952:
                    SEARCH = actionBarOperaEnum13;
                    str = "ۗۙۙۧۛۘۘۦ۫ۘۤۡۘ۠ۢۡۡۡۚ۠ۡ۬۟ۚ۠ۤۜۘۘۙۨۥۘۡ۟ۘ۬ۜ۬";
                    break;
            }
        }
    }

    private ActionBarOperaEnum(String str, int i) {
    }

    public static ActionBarOperaEnum valueOf(String str) {
        String str2 = "ۦۜۚۜۛۜۘ۟ۙۨۧۛۦ۟ۖۖۘۧ۫ۗۦۦۖۤۢۡۘۘۛۜۘۧۗۨ۟ۙ۬ۨۘۖۥۥۘۜۛۖۤۥۧۘ۟ۨ";
        while (true) {
            switch ((((str2.hashCode() ^ 337) ^ 661) ^ 492) ^ 274646299) {
                case -177372011:
                    return (ActionBarOperaEnum) Enum.valueOf(ActionBarOperaEnum.class, str);
                case 1266030464:
                    str2 = "ۧۙ۬۟ۘ۬ۙۥۘۜۦ۬۠ۢۢۘ۠ۜۘ۫ۧۥۙۙۖۘۗ۬ۦۘۘۡ۬";
                    break;
            }
        }
    }

    public static ActionBarOperaEnum[] values() {
        while (true) {
            switch (((("ۨۖۨۙ۫ۥۘۡۨ۠ۖۡۢۤ۟ۡۘۡۥۘۘۚۡۥۨۡۢۢۡۘۧ۫۟".hashCode() ^ 926) ^ 714) ^ 908) ^ (-1765585322)) {
                case 924745966:
                    return (ActionBarOperaEnum[]) $VALUES.clone();
            }
        }
    }
}
