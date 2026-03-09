package com.cyjh.elfin.entity;

import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import p285z2.C4095le;
import p285z2.C4589yr;
import p285z2.sa0;

/* JADX INFO: loaded from: classes.dex */
public class FeLingAdReportInfo extends sa0 {
    public String adPid;
    public String apkPageName;
    public int postState;
    public int state;
    public int type;
    private String url;

    public FeLingAdReportInfo(String str, String str2, int i, int i2, int i3) {
        this.adPid = str;
        this.url = str2;
        this.type = i;
        this.state = i2;
        this.postState = i3;
    }

    public String getAdPid() {
        String str = "ۦۨۦۘۜۗۗۜ۬ۡۚۨۥۦۖۦۚۢۧۢۦۢۘۜۖۘۛ۬ۖۘۡۜۖۘۘۥۢۙ۠ۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ C4095le.o0000O00) ^ 888) ^ 647) ^ 1620659767) {
                case 1679566342:
                    return this.adPid;
                case 1778966177:
                    str = "ۜۤۜ۟۟ۧۙۚۨ۟۠۠۫۬ۖۜۜۘۦۖۥۨۘۘۢ۠ۜۚۦۥۘ";
                    break;
            }
        }
    }

    public String getApkPageName() {
        String str = "ۗۙۙ۠ۨۖۖ۫ۧ۠ۜۖۘۙ۬ۢۚ۬۫ۧۚۙ۟۠۟ۨۗۥۗۤۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 415) ^ 381) ^ 729) ^ 2018138183) {
                case -1880138124:
                    return this.apkPageName;
                case -1130993917:
                    str = "۟ۚۘۘۧۥۤ۬ۚۙۤۨۦ۬ۦۢۢۤ۬ۥۧۘۘۢۨۘۡۡ۬ۢۛۨۘۚۥۡۧۦۙۙۜۤۢ۟ۙ";
                    break;
            }
        }
    }

    public int getPostState() {
        String str = "ۚۘۚۥۧۛۗ۫ۧۤۚ۫ۜ۬ۚۜۧۖۘۛۙۘ۬ۤۦۙ۠ۡ۬ۜ۟ۦۡۥۡۚۤ۬ۜۖۥۡ۫ۜۗۖۦۢ۫ۡۦۘ۟۬ۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 431) ^ 190) ^ C4589yr.OooO0O0) ^ (-1857268772)) {
                case -1070736850:
                    str = "ۙۘۜۘۜۧۦۘۙ۠ۙOۢۨۛۧۥۜ۟۬ۖ۫۠ۨۤۗۚۧۙۨۘۖۘۥ۬ۖ۠ۛۨۚۨۧۘ";
                    break;
                case 266482573:
                    return this.postState;
            }
        }
    }

    public int getState() {
        String str = "ۗۚۦ۠ۘۨ۠ۤۨ۫ۛۥۙۚۤۤۙۜۢ۠ۜۘۙ۫ۜۘۛۡۧۘۢۖۜۘۖۘۤ۫ۡۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 547) ^ 760) ^ 368) ^ (-865926308)) {
                case -1043350903:
                    str = "ۙۨۡۘۤۘۥۘۤۛۥۘۡۨۥۡۚۘۦۦۦۘۤۥۜۘۖۤۤۢۘۖۙۤ۫ۚۙۛۜۢۤۖ۠۠ۖ۟۬ۢ۬ۡۘۚۗۡۘۨۖۙۢ۫۬";
                    break;
                case 1097475356:
                    return this.state;
            }
        }
    }

    public int getType() {
        String str = "ۧۢۤۙۚۖۘۡۗۜۤ۫ۡۘ۫ۘۦۡۚۧۥ۬۬ۖۦۘۘۛۢۢۦۦ۬ۘۤۦ۟ۡۘ۬ۦۢۨۙ";
        while (true) {
            switch ((((str.hashCode() ^ 735) ^ 147) ^ 879) ^ 1279116071) {
                case -1896866416:
                    return this.type;
                case 100092288:
                    str = "۠ۘۘۤۙۥۢۖۚۗۜۦۘۢۨۘۥۡۥ۠۫ۧ۬ۛۙۨۨۖۗ۫ۙۜۢۥۘ۟ۗۙ۫ۥۥۘ۫ۗ۬۫ۦ۟ۡۚ۟ۜۛ۟ۦۦۦ";
                    break;
            }
        }
    }

    public String getUrl() {
        String str = "۟ۢۥۤۖۧۘ۫ۦۘۜۦ۫ۛۗ۬ۧ۫ۖۘ۫ۤۛ۠ۙۡۘۖۨۙۜ۟ۘۘ۠ۨۘۖۥۙ";
        while (true) {
            switch ((((str.hashCode() ^ 733) ^ UiMessage.CommandToUi.Command_Type.SET_IMAGE_VIEW_VALUE) ^ 732) ^ 426726036) {
                case -110212542:
                    return this.url;
                case 158456228:
                    str = "۬۟ۥۥۧۡۨۡۨۖۧۙۗۦۨۢۙۡۡۢۙۗ۬ۖۖ۠ۘۘۥۦۦ۬ۡ۟ۧۢۡۡۗۡۘۛۛۖۗ۟۬ۦۚۢ۬ۡۨۘ۬ۘۦ";
                    break;
            }
        }
    }

    public void setAdPid(String str) {
        String str2 = "ۢۗۥۘۦۚۤۛۦ۬ۗ۠۫۟ۧۧۗۡۧۦۘ۟ۙۛۘۗۘۦ۟ۖۦۨۖۘۤ۫۟ۘۚۖۘۤ۫ۡۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 319) ^ 393) ^ 742) ^ 1655766367) {
                case -1605867674:
                    return;
                case 182476910:
                    this.adPid = str;
                    str2 = "ۘ۟ۦ۬ۘۡ۬ۤۤۤۛ۟ۖ۟ۛۚ۟ۜۘۤ۬ۖۘۗۡۗ۟ۖۘۡۘ۟";
                    break;
                case 487185061:
                    str2 = "ۥۙۡۤۡۛ۠۠ۖۢۘۥۘۘۜۡۘۥۦۘۨۗ۠ۖۨۘۤۗۖۥۨ۠";
                    break;
                case 1137149618:
                    str2 = "ۘۗۧ۠ۨۖۘۦۥۢۨۛۗۥ۟ۥۢۥ۟۟ۖۥۡۖ۬ۢۜۖۘۧ۬ۨۛۙۗۗۙۢ";
                    break;
            }
        }
    }

    public void setApkPageName(String str) {
        String str2 = "۫ۤۗۙ۠۟ۖۡ۟۫ۛ۟ۜۙۡۘ۠ۨۥ۫ۧۨۘۥۥۘۡۧۖۧ۬ۦ۠ۡۢۗۡۡۘۚۚ۟ۛۨۖۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 378) ^ UiMessage.CommandToUi.Command_Type.GET_TITLE_BACKCOLOR_VALUE) ^ 397) ^ (-1216134232)) {
                case -718425610:
                    str2 = "ۚۥ۬ۜۨۡۘۜ۫ۢۢ۠ۖ۟ۙۤۖۡۨۘ۫ۗۥۘۗۚۚۥۜۜۘۤۘۦۘۖ۠ۢ۟ۚۖۤ۫ۨۢۚۘۘ۟ۚ۠ۢۥ";
                    break;
                case -326164242:
                    this.apkPageName = str;
                    str2 = "۟۟ۜۘۧ۠ۨ۬ۛۘۜ۫ۨۖۛۛۥۗ۫ۦۥۜۘۗۗ۟ۙ۫ۢۘ۬ۗۥۡۜۗۘۦۘ";
                    break;
                case 1113543755:
                    return;
                case 1348784348:
                    str2 = "ۧۧۗۜۖۨۘۖۜۖۘ۬۠ۡ۟ۖۘۗ۫ۨۘۛۧۖۘۡۡۥۖۨۘ۟ۗۦۘۘۡۤ۠ۘۘ";
                    break;
            }
        }
    }

    public void setPostState(int i) {
        String str = "۬ۖۙۥ۬ۧۗۛ۟۬ۜ۠ۘۖۛ۠ۥۚ۠ۧۘۨۘۧۙ۫ۨۦۘۘۜۧۖۤ۬۟۬ۗۥۘۨۨۥ۫ۨۨۘۘ۟ۥۘۜۥۘ۟۟ۙ";
        while (true) {
            switch ((((str.hashCode() ^ 925) ^ 249) ^ 177) ^ 728192637) {
                case -750443760:
                    str = "ۤ۟ۢۨۧۨۤۘۢۦۨۙۙۦۦۘۢۡۚۜ۬ۢۧ۫۬ۘۤ۠ۘۨۧۨۥۘۘ۬ۚ۠";
                    break;
                case 85855719:
                    return;
                case 642905443:
                    str = "۬۟ۨۗۦۘۦۚ۬ۛۥۘۘ۟ۘۖۥۜۧ۫ۙۢ۠ۥۨۘۢۡۦۘ۬۟ۨۘۧۥ۬۬۬۫ۖ۟۬ۤۜۖۘ";
                    break;
                case 838006572:
                    this.postState = i;
                    str = "ۚۗۦۘۦۦۚ۟ۛۨۖۦۘۥۙۦۘۜۢۨۚۦ۬ۤ۫ۙۜۤ۫ۙۙۡۙۦۗۛۧۤۦۘۛۘۙۦۘۤۘۘۘ۫ۤۥ";
                    break;
            }
        }
    }

    public void setState(int i) {
        String str = "ۗۜۥۚۙۥ۠ۨۡ۠ۤ۟۠ۤۥۘۡۚۚۡۚۥۘۜۗۖ۟۬ۢۤ۫ۙۙۧۙ۠ۙۦۗۤۨ۟ۖۘۡۦۖۨۧ";
        while (true) {
            switch ((((str.hashCode() ^ 255) ^ 236) ^ 693) ^ 1049375867) {
                case -36333277:
                    str = "۠ۦۦۘۦۦۘۘۡۦۨۧ۬ۘۘۚۘۧۚۘۘۘۤۛۗ۫۟ۛۨۘۘۚۛ۟ۛۙۥۘۧ۫ۡۘۙۗۡۜۨۦۖۥ۟ۛۡۛ";
                    break;
                case 1120868993:
                    str = "ۤ۬ۡۘۛۧۡۘۥۨۗ۠ۜۨۜۛۙۧۦ۫۟۬۠ۜۥۘ۟۟ۘۘ۟ۛ۫ۥۘ۟ۗۗۛۗ۫ۡۡۜۘ";
                    break;
                case 1209734715:
                    this.state = i;
                    str = "ۚۥۘۘۜ۟ۢ۫۫ۢۥۘ۟ۘۧ۟ۥۢۜۘ۠ۦۢ۬ۨ۫ۡۙۤۨۢۢۢۧۨۦۘۘۚۡۡۘۖ۫ۦ۟ۤۗ۟ۘۘۧۖۤۘۜ";
                    break;
                case 1871994507:
                    return;
            }
        }
    }

    public void setType(int i) {
        String str = "ۖۥۜۜۘۦۘۜ۬ۘۜۢ۬۬ۧۡۜۢۥۥۜ۟ۦۖۨۘۙۧ۟ۨۛۢۙۘۘۢۖۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 50) ^ 196) ^ 194) ^ 1831475239) {
                case -1621022054:
                    str = "ۢۧۦۘۚ۫ۖۘۜ۬ۧۗ۫ۥ۠ۢ۫ۨ۫ۥۢۘۨۗۚۗۘۚۜۘۥۚۘ۬۫ۜۘ۬ۦۦۗ۫۠ۚۖۘۘۢۡۤۦۘ";
                    break;
                case -650217495:
                    str = "ۖۙ۬ۘۡۨۤۗ۫ۢۜۘ۫ۦۡۘۨۦ۫ۘۡۧۘۜۧۦۢ۠۫ۗۢۚۧۚ۟۟۬ۚ";
                    break;
                case 194605693:
                    return;
                case 2006393622:
                    this.type = i;
                    str = "ۙۥۧۘۖۧۤۨۚۥ۠ۥ۟۬۫ۡۘۧۡۡ۠ۨۜۜۚ۫ۖۖۨۦۢۡۘ";
                    break;
            }
        }
    }

    public void setUrl(String str) {
        String str2 = "ۥۙۘۘۖۢۜۥۜ۬ۦ۠ۨۘۥۘۙۜۖۥۤۖۡۖۦۘۨۥۤۦۚۨۥۗ۬ۛۙۛ";
        while (true) {
            switch ((((str2.hashCode() ^ 788) ^ 368) ^ 760) ^ (-1169384807)) {
                case -1715216428:
                    str2 = "ۧ۫ۖۘۡۡۨۘ۬ۘۨۙۡۛۧۧۢۗۛۖۦ۠ۗۧۦۘۗۧۨۧۚۨۘ۫ۜۦ۫ۢۘۘ۠۠ۖۘۖۨۥۘ";
                    break;
                case -1244244838:
                    this.url = str;
                    str2 = "ۙۤۗۡ۬ۥۘ۟۠ۥۘ۫ۡۥۗۦۜۘۖ۬ۖۙۛۡۘۧۜۨۥۧ۬ۙۢۘۘۖ۟ۦۘۧۡۜۘ";
                    break;
                case -441765676:
                    str2 = "ۢ۫ۗۥۤ۟ۦۤ۠ۚۡۘ۟ۙۥۥۜۛۢۥ۠۠ۥ۟ۤۦ۠ۗۜۘۢۨۖۘۘ۟ۥۢۡۗۥۢۡۚۢۛۧ۫۠";
                    break;
                case -343889877:
                    return;
            }
        }
    }
}
