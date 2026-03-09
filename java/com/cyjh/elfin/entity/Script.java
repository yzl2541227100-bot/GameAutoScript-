package com.cyjh.elfin.entity;

import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import java.io.File;
import org.slf4j.helpers.MessageFormatter;
import p285z2.C4095le;

/* JADX INFO: loaded from: classes.dex */
public class Script {
    public static final int SCRIPT_STATE_FREE = 0;
    public static final int SCRIPT_STATE_LOAD = 1;
    public static final int SCRIPT_STATE_PAUSE = 3;
    public static final int SCRIPT_STATE_PAUSE_BY_HEART_BEAT_VERIFI_ERR = 4;
    public static final int SCRIPT_STATE_RUNING = 2;
    private String appId;
    private File atcFile;
    private BestResolution bestResolution;
    private File cfgFile;
    private int changeFileList;
    private String description;
    private FileVersion fileVersion;

    /* JADX INFO: renamed from: id */
    private String f15887id;
    private File infoFile;
    private File lcFile;
    private String name;
    private File propFile;
    private File rtdFile;
    private String selId;
    private String size;
    private File uiFile;
    private File uipFile;
    private String version;

    public String getAppId() {
        String str = "ۧۗۡۛۤۥۤۖۘۘۢ۬ۖۙۢ۟ۛ۟ۨ۫ۛ۬۠ۜۘ۫ۤۗۗ۟ۧ";
        while (true) {
            switch ((((str.hashCode() ^ 115) ^ 541) ^ 820) ^ (-598925026)) {
                case 713986970:
                    str = "ۘۙۦۘ۠۫ۨۖۡۧ۠ۛۥۘۡ۠ۜۘ۬۬ۚۧۢۤۘۡۙ۬۟ۗۢۗۦۗۜۥۘۚۧۥۧۧۚ۟۠ۥ۟ۘ۫۫ۛ۟";
                    break;
                case 1960906928:
                    return this.appId;
            }
        }
    }

    public File getAtcFile() {
        String str = "ۛ۫ۧۡۗۤۥۡۧۤ۫ۙۤۜۥۘۚ۫ۢۢۗ۫ۨۦۗۦۡۢۘۙۚۤۙۦۘ۫ۢۨۘۨۨۘۨۙۡۡۨ۬ۘۘ۟ۜۖۥۢ";
        while (true) {
            switch ((((str.hashCode() ^ 544) ^ 167) ^ 110) ^ 1180183413) {
                case 724921693:
                    return this.atcFile;
                case 1576503464:
                    str = "ۙۖۥۘ۬ۨۘۚۡۖۘۛۙۢ۫ۜۥ۟ۧۤۚۜۘۖۛۦۘۥۡۘۗۜۡۘ۠ۛۡۘۛۜ۠۟۠ۨۛۗۛۡۡۛۢۘۦۨۦۧۦۦۨۘ";
                    break;
            }
        }
    }

    public BestResolution getBestResolution() {
        String str = "ۚۛۖۢ۫۬ۙۦۦ۠۫ۨۘۥۛۘۘۧۙۖۛۖۘۘۨۘۗ۬ۛۨۘ۠۟ۜ";
        while (true) {
            switch ((((str.hashCode() ^ 850) ^ 596) ^ 437) ^ (-1352774684)) {
                case -2075084941:
                    return this.bestResolution;
                case 1851656525:
                    str = "ۛ۠۫ۤۡۨۙۤۨۘۢۦ۠ۙ۠ۖ۟ۛۤ۟ۦۦۖۘۥۦ۫۫ۜۘۜۖ۟ۛۢۙۘۧۤۘۡۡۘۥۨۥ۠ۤۛ۟۟ۡۘۢۘۥ";
                    break;
            }
        }
    }

    public File getCfgFile() {
        String str = "ۢ۫ۛۧ۟۬ۛۥۤ۬ۦۥۛۗ۫ۜۨ۬ۚۧۛۦۙۘۘ۫ۜۗۧۥۡ";
        while (true) {
            switch ((((str.hashCode() ^ 360) ^ 471) ^ 536) ^ (-1739431225)) {
                case -1608615983:
                    return this.cfgFile;
                case 1865339354:
                    str = "ۨۧۤ۠ۦۘۖۧۥۘۘۗۘۡۢۘۢ۟۠ۗۥ۫ۢۚ۠ۤۙۥۘۤۤۘۘ۟ۖۦۤۦۜ۟۠ۖۘ۠ۥ۬ۚۤۖۨۜ۟";
                    break;
            }
        }
    }

    public int getChangeFileList() {
        String str = "ۘ۫ۨۘۚۗۧ۟ۡۨۘۧ۠ۘۘ۠ۤ۫ۖۘۥ۠ۢۚ۬ۨۖۘۤۙۚۡۙۗۜۗۙۨۤۦۘۖۛۖۘۜ۟ۦ";
        while (true) {
            switch ((((str.hashCode() ^ 975) ^ 783) ^ UiMessage.CommandToUi.Command_Type.SET_IMAGE_VIEW_VALUE) ^ 775536807) {
                case -1277029958:
                    return this.changeFileList;
                case 1608179227:
                    str = "ۢ۠۠ۦ۠ۦۦۢۤۤۨۤۧۤۢ۬ۜۘۘۨۜ۠ۚۗۢ۬ۛۛۢۥۘۛۡ۫ۢ۟ۥ۫ۢۡ۫۬";
                    break;
            }
        }
    }

    public String getDescription() {
        String str = "ۛۡۖۘۖۦۘۗۚۙ۠ۚۖۡۗۦۖ۟ۡۘ۬ۜۛۖۡ۠۟ۚۙۧۚۡۨۘۚۙۡۘۤ۟ۡۘۘۡۨۘ۫۠ۧ۫ۙۖۘۙۘۖۘۦ۫ۖ";
        while (true) {
            switch ((((str.hashCode() ^ 769) ^ 682) ^ 698) ^ 1072786797) {
                case -952614849:
                    str = "ۢ۠۟ۚۗۜۘۧۛۡۢۦۘۘۦ۠ۦۘۜۖۖۜۤۤۗ۟۟ۡ۬ۜ۬ۚۨۘۤۢۜۜۤۖۘ۬ۢۖۘۢۤ۬";
                    break;
                case 50054393:
                    return this.description;
            }
        }
    }

    public FileVersion getFileVersion() {
        String str = "ۦۛۨۘۥۧۥۖۨۤۛۢ۬ۧۦۘۤۙۡۘ۫ۡۡ۠ۗۡۘ۟ۘۘۘۡ۠ۙ۬ۡۘۘ۫ۘۥۖۦۖۘۡۤۘۡۖ۠ۘ۫ۡۘۚۜۨۢۥۧۘ";
        while (true) {
            switch ((((str.hashCode() ^ 498) ^ 785) ^ 400) ^ (-1568900500)) {
                case -1699957497:
                    return this.fileVersion;
                case 2006288830:
                    str = "ۖۚ۬۟ۗۥۛ۫ۦۦۙۙۦۨ۫ۥۖۜۧۥۘۘ۟ۥۨۖۚۙۦۤۘۘۨۨ۬ۨ۠ۛۥۢۥۦ۬۬ۜۙۤۢۥۧ";
                    break;
            }
        }
    }

    public String getId() {
        String str = "ۙۦۢۖۗۚۨۘۧۧۛۢۚ۬ۛۖۘۘۦۥۨۙۨۥۚۖۢ۠ۡۡۗۛۧۜۙۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 678) ^ 865) ^ 687) ^ (-1439439546)) {
                case -367643479:
                    return this.f15887id;
                case 2102901533:
                    str = "ۙ۠ۖۡۚۥۤۘۜۘ۠ۧۖۘۢۢۘۗۢۖۘۡۧۡۥۥۡۨۖۖۘۤۨۗۥۘۚ۬ۚ";
                    break;
            }
        }
    }

    public File getInfoFile() {
        String str = "ۢۡۛۤۥۖۘ۠ۚۘۘۧۙۥۥۖۘۗۜۧۨۘۘۡ۫ۜۘۛ۬ۨۥ۫ۥۘۥۗۨۦۦۧۘۧۦۚۨۛۚۦ۠ۨۘۖۜۗۤۖۖۘۜۜۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 615) ^ 622) ^ 591) ^ (-1889822947)) {
                case -268849222:
                    str = "ۘۦۛۥۛ۠ۙۖۧۨۙۢ۫ۧ۠ۜۖۖۤۚۘۘ۬ۦۙۗۨۡۢۡۡۘۨۛۢۙۧۦۘ۬۫ۙ۟ۖۜ";
                    break;
                case -230893030:
                    return this.infoFile;
            }
        }
    }

    public File getLcFile() {
        String str = "ۛۢۗۗۙۥۘۡۛ۫۬۟ۡۢۙۚۘۙۡ۟ۚ۟ۜۛۡۘۡۢۤۚۤ۫ۖۦۧۘۗۖۨۛۢ۠۬ۘۢ";
        while (true) {
            switch ((((str.hashCode() ^ 899) ^ 890) ^ 473) ^ (-660283309)) {
                case -258951233:
                    str = "ۥ۟ۦۘۤۜۨۧۨۡۘۦ۠۫ۧۦۦۘۢۖ۠ۥۤۚۙۦۦۖۢۡ۫ۙۡۘۨ۟ۖۡ۫ۜۘۦۢۜۖ۬ۡۜ۠ۦۘۘۙۨ۫ۤۢ۬ۘۤ";
                    break;
                case 203583285:
                    return this.lcFile;
            }
        }
    }

    public String getName() {
        String str = "ۜۘۖ۠ۚۦۤۤۡۨۡۡۘۦ۫ۖۘ۠ۚۚۙۤۗۘۙۧۚۜۘۘۥ۟ۦۡ۬ۗۚ۟ۢۢ۟ۧۚ۟ۚۤۖۖۘۙۖ۠";
        while (true) {
            switch ((((str.hashCode() ^ 792) ^ 462) ^ 91) ^ (-236477321)) {
                case -1754970084:
                    return this.name;
                case 421811591:
                    str = "ۖۖۗۘۦۛ۟ۘۦۘۗۦۚ۟ۘۨ۬ۚۧۦۧۛۡۜۦۘ۫ۘۦۦۢۦۘۦۗ۠۟۟ۘۦۧۧۦۘۡ۟ۡۜۚ۬";
                    break;
            }
        }
    }

    public File getPropFile() {
        String str = "۫ۡۙۤۖۧۜۗ۟ۤۘۖۘۗ۠ۥۜۨۥۘ۟ۘۘ۬ۜ۟۫ۨۙ۟۫ۡۘ۬ۦۦۘۢۡ۠ۢۙۥۧ۬";
        while (true) {
            switch ((((str.hashCode() ^ 991) ^ 369) ^ 353) ^ (-165872849)) {
                case -508432294:
                    str = "ۦۘۦۖۛۥ۠ۥۧۘۛۦۚ۬ۜۡ۫ۜۜۨۢۙۦۥۘۡۦۘۘ۠ۙۗۧۥ۫ۛۦ۬";
                    break;
                case 1893653612:
                    return this.propFile;
            }
        }
    }

    public File getRtdFile() {
        String str = "ۡ۬ۦۘۖۜۘۦۤۘۘ۫۬ۙۛۖۖ۟ۧۡۘۚۥۥ۠ۦۦۥۡۘۧۨ۬۟ۡ۟ۥۧ۟ۖۚۨ۠ۡۦۥۘۨۘ۬ۧۖۤۧۢۖۢۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 479) ^ 355) ^ 89) ^ (-1954828328)) {
                case 683527373:
                    return this.rtdFile;
                case 1177144947:
                    str = "۠ۨ۬ۦۜ۫ۡۜۥۖۜۛۚۥ۟ۚ۬ۙۥۖۨۘ۫ۘۨۘۦۧ۠ۜۖۦۘۘۥۦۘۨ۫ۦۘ۟ۗۚ۫ۗ۟ۧۘۧۙۖ";
                    break;
            }
        }
    }

    public String getSelId() {
        String str = "ۗۤۧۢۚۖۧۧۖۘۤ۬ۥۘۖۛۘۘۜۥۘۙۨۡۘۤۧۢۛۗۡۘۨۛۜۘۚۚۦۘۢۘ۟ۧۗۛ۟ۙۖۘۙ۬ۖۢۤ۬ۛۡۘۗۗۤ";
        while (true) {
            switch ((((str.hashCode() ^ 523) ^ 847) ^ 627) ^ (-2022688290)) {
                case -306845998:
                    str = "ۢۢۙۦۢۤۨۤۦۜۡۦ۬۬ۢۥۗ۬ۚۦۚۢۥۡۥۜ۠۠ۦۤۘۢۗۙۡۙ۠ۖۘۧ۬ۚ";
                    break;
                case 5773139:
                    return this.selId;
            }
        }
    }

    public String getSize() {
        String str = "ۜۧۛۛۖۥۘۧۜ۟ۖۨۤۘۜۖۘ۫ۡۡۛۦ۠ۢۘۗ۬۠ۗ۬ۢۘۧۛۨۘۛۗۧۖۥۘۙ۠ۚۨۨۢۙ۫ۗ";
        while (true) {
            switch ((((str.hashCode() ^ 557) ^ 346) ^ 565) ^ (-318407237)) {
                case 1159096514:
                    return this.size;
                case 1213800243:
                    str = "ۡۘۥۘ۬ۥ۫ۡ۠ۜۘۖۧۦۘ۠ۜۙ۫ۚ۬ۚۥ۟ۦۢۘۦۥ۟ۙۧۛ۟ۚۖۙۘۜۘ";
                    break;
            }
        }
    }

    public File getUiFile() {
        String str = "ۦۚ۟ۛۦۤۢۧۗۘۖۘۧۗۖۘۦۢۚۢۨ۠۫۠ۤۦۘ۬ۘۗۙۢ۫۫ۢۗۙ";
        while (true) {
            switch ((((str.hashCode() ^ 477) ^ 992) ^ C4095le.o00000o0) ^ (-818158393)) {
                case 1412483091:
                    str = "۫ۥۘۜۤۘۨ۫ۚۘۡۨ۫ۙۘۘۡۗۨۘۜۘۘۥ۫۟ۡۨ۠۫ۡۥۡ۫ۡۚۤ";
                    break;
                case 1775369182:
                    return this.uiFile;
            }
        }
    }

    public File getUipFile() {
        String str = "ۡۚۗۜ۠۟۟ۖ۟۟۠ۥۨۙۗ۬ۢۧۤۛۚۡۦۖۥۘۡۜۛۖۘۨۡۧۘۦۡۦۛۘۦۢۧۨۘۤۚۥۘۗ۟ۥ۬ۨۧۘۘۢ۟";
        while (true) {
            switch ((((str.hashCode() ^ 771) ^ 870) ^ UiMessage.CommandToUi.Command_Type.CLOSE_CONTINUE_ACK_VALUE) ^ (-1246373613)) {
                case 93455142:
                    return this.uipFile;
                case 975523705:
                    str = "ۗ۬۟ۢۘۘۜۛ۬ۙۦۨۥۙۜۗۨۗۛۖ۫۫ۥۘۧۚۗۧۧۜۢۢۢۨۢۥۦ۟ۡۤۖۤ۬۬ۖۦۦۨۖۙۖۘۘۚۧ";
                    break;
            }
        }
    }

    public String getVersion() {
        String str = "۠ۤۢۧۚۧۥۘۨۧۖ۟۬ۦۦۘۗۧۥۘۛۥۦۚۧۢۙ۠ۦۜۙ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.CLOSE_CONTINUE_ACK_VALUE) ^ 436) ^ 951) ^ 1149994238) {
                case 417602623:
                    str = "ۦۨ۬ۡۡۤ۫ۥۢۗۢۛۜۧۜۘۙ۟ۦۘۦۚۚ۟ۙۘۡۙۨۗۢۛۛۖۦۜۗۡۙۨۜۘۨۦۨۘ";
                    break;
                case 1938065905:
                    return this.version;
            }
        }
    }

    public void setAppId(String str) {
        String str2 = "ۘۤۦۢۤۦۘۚ۟ۘۗۡۦۤۖۧۗۦۧۘۛۖۡ۬۟۬ۢۤۦۘ۟ۜۦۙۗۜۛ۬ۘۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 826) ^ 873) ^ 178) ^ 1708120993) {
                case -1670314645:
                    str2 = "ۧۙ۟ۨۤ۬ۚۛ۬ۖۖۡ۠ۙۤۙۡۡۥۨۙۗۜۘ۫۫ۦۘۘۖۤ۫ۦۨۤ۠ۦۘۘۥۧۢ۠ۙۦ۫ۥۧۨ۬ۗۨۙۚۥۘ";
                    break;
                case -1613298703:
                    this.appId = str;
                    str2 = "ۢ۟ۡۘۦۨۦۘۢۙ۬ۜۦۧۙۢ۫ۗ۠ۡۘۧۥۦۘ۠ۨۖۤ۠ۚ۟";
                    break;
                case -1488136644:
                    str2 = "ۙۥۧۘۢۘۡۙۦۘ۟ۤۛۡۙۜۘ۟ۜۢۖۤۚۚۗۦۥۜۗۢۥۙ۟ۤۖۘۛۤۤۜ۟۬ۖۦۧ۫۠ۧۗۡۢۚ۬ۤۧۦۥ";
                    break;
                case -261280819:
                    return;
            }
        }
    }

    public void setAtcFile(File file) {
        String str = "۫ۨۤۦۧ۠ۨۦۡۡۗۖۘۡۥۨۤۖ۠ۤۧۦۢۧۦۧۥۘۢۚۗ۫۫ۦۙۨۘۛۨۜۘۘۘۚۙۦۘ۠ۡۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 662) ^ UiMessage.CommandToUi.Command_Type.GET_FW_TEXT_COLOR_VALUE) ^ UiMessage.CommandToUi.Command_Type.GET_FW_VISIBLE_VALUE) ^ (-1773785893)) {
                case -1255150729:
                    this.atcFile = file;
                    str = "۬۟ۘۘۦۗۨۙۢۢۦۤۘۘۘۖ۬ۘۤۥۧۖۚۢۢ۠ۗۢ۟۬ۜ۟ۧ۬ۙۤۧۙۖۛۙۛۖۢ";
                    break;
                case 666170831:
                    return;
                case 745651845:
                    str = "۠ۨۧۘۦۤۘۧۖۜۘ۬۬ۖۢۤۘۘۦۨۥۤۚ۫ۤۜۜۡۘۘۢۘ۠ۘۗۙۛۡ۬";
                    break;
                case 1512612658:
                    str = "ۨۦۢۡۖۤۡۨ۠ۖ۫ۦۙۖۖۨۢ۫۬ۛۚۢۜۥۘۧۗۘۜۙۨۘۢۙۡۗۨۤۥ۫ۖۡۛۘۘ";
                    break;
            }
        }
    }

    public void setBestResolution(BestResolution bestResolution) {
        String str = "ۚۗۘ۫ۦۘۘۚۤۢ۠ۤۖۘۖۘۘۘۥ۬ۘۘۥۦۦۨۚۜۘۗۖ۟ۖۖۦ";
        while (true) {
            switch ((((str.hashCode() ^ 644) ^ 966) ^ 188) ^ (-166244081)) {
                case -438980551:
                    str = "ۢ۫ۘۚۛۦۖۢۖۘۧۥۖۘۙۦۚ۬ۥ۠ۗۡۦۘۨۘۥ۬ۜ۠۟ۖۖۘۤۤۡۘۙۢۥۘ۟۠ۜۘۘۦ۠۟۫ۜۥۦۖ۫۟ۗۦ۬ۡ";
                    break;
                case 411582976:
                    str = "ۗۥۚۚۜۨ۫ۜۡۧۛۨۘۖۤۥۘۤۛۙۜۘۜۚۡ۫ۖ۠۠ۡۦۨ۟ۙ۟ۤۘۧ";
                    break;
                case 1402937701:
                    return;
                case 2021659127:
                    this.bestResolution = bestResolution;
                    str = "۫ۦۜۘۡۤۙۖ۫۟۟ۡۗۘۢۙۡۚۛۖۘۦۢۖۡۖۛۡۘۛ۬۠ۦۛۖۗ۟ۗۜ۠ۖ۬ۖۥۘ";
                    break;
            }
        }
    }

    public void setCfgFile(File file) {
        String str = "۬ۛۨۘۤۨۤۗۤۘۥۙۡۘ۫ۜۢ۟ۧۧۖۛۜۘۧۗۙۛۨۙۜ۠ۧ۟ۛۧ۠ۛ۠ۖۛ۟ۘۥ۫۬ۦۨۘ۟ۥۛۛۜۡۥۤ";
        while (true) {
            switch ((((str.hashCode() ^ 471) ^ 727) ^ 51) ^ (-8115241)) {
                case -1867186294:
                    str = "ۧ۫ۧۚ۠ۨۙۤۨۘۙۚ۠۫ۖۚۜۙ۟ۡۡۦۤ۫ۙۗۘۧۡۧۙۙۡ۠ۦۛۨۗۢ۟ۡۧۚ";
                    break;
                case -1304627897:
                    return;
                case -564749816:
                    str = "ۨۛ۟ۤ۫۠۫ۗ۫ۘۦۜ۫۬ۗۦۤۖۘۦۧ۠۬۫ۨۘ۠ۘۨۦۧۡۘۨۜۨۘۥۦ۟۠ۖ۟ۘۥ";
                    break;
                case 35454996:
                    this.cfgFile = file;
                    str = "۟ۡۥۨ۬ۢۙۗۖۘۘۘۡۘۥ۟ۘۘۡۜۥۘ۫ۖۘۦۜۤۚۥ۫ۤۗۛ";
                    break;
            }
        }
    }

    public void setChangeFileList(int i) {
        String str = "۠۠ۧ۫ۢۜۘۗۚۘۘۖۥۨۘۙ۫ۦۘۗۦۚۗۦۨۘۚ۟۠ۗۛۨۛ۫ۡ۠ۡۘۜ۟ۦۚۡ۠۫۬";
        while (true) {
            switch ((((str.hashCode() ^ 42) ^ 850) ^ 177) ^ (-1098766874)) {
                case -1762026943:
                    str = "۫ۥۨ۠۫ۗۤۗۘۥۨۤۗۥۥۘۢۡۢ۬ۜۘۙۡۜۢ۫۬ۖۡۖۥۜۦۥۗۢۖۦۜۢ۫";
                    break;
                case -991962697:
                    this.changeFileList = i;
                    str = "ۥۛۙ۬ۚۚ۬ۛۘۨۜۛ۫ۛۡۘۢۛۦۢۛۡۦ۬ۗۘۘۖۡۢۦۘ۫ۘۛ۬ۤ۟ۗۛۧۤۥۦ۠ۧۤ۬۠ۜۘۧۜۥۚۡۜۘ";
                    break;
                case -734588385:
                    str = "۠ۦۖ۠ۢۘۘۘۥ۟ۗۘۦۗ۬ۗۥۧ۬ۤۡۡۗۛۡۤ۠ۧۤۖۖ۬ۚۚۧ۠ۡۛۢ۫ۜۧۢ";
                    break;
                case 1940285933:
                    return;
            }
        }
    }

    public void setDescription(String str) {
        String str2 = "ۚۥۥۘۘۨۘۙۚۡۡۢۚۡۖۘۘ۬ۖۦ۬ۥ۠۫ۢۦۘۦۦۤۥۖۗ";
        while (true) {
            switch ((((str2.hashCode() ^ 567) ^ 599) ^ 170) ^ 719665537) {
                case -411057467:
                    str2 = "ۡ۫ۥۛۛۙۢۖۘۚۜ۬ۛۜ۬ۚ۠ۡ۟۠۫ۗ۟ۥۘۜۗۗۥ۟ۚۖ۠ۡۧۙ";
                    break;
                case -144088261:
                    this.description = str;
                    str2 = "ۨ۠ۖۘۛ۫ۜۡۤۥ۠۬۟ۘۚۤۥ۟ۨۘ۫۬ۙ۟ۜۘۘ۫ۜۖۘ۫ۤۢۙۧۧۡ۬۬";
                    break;
                case 1703678361:
                    return;
                case 1755415647:
                    str2 = "ۦۦۨۤۦۤۧۜ۬ۡ۬۠۬ۢ۫ۜۨۡۘۘۡۥۛ۫ۚۘ۬ۤ۫ۢۤۧ۠ۡۚۥۘ";
                    break;
            }
        }
    }

    public void setFileVersion(FileVersion fileVersion) {
        String str = "ۙۘۧۘ۫ۤۥۘۢۦۦۤۘۜۗۖۢ۠۟ۗۡ۬ۚۡۘۢۖۗۜۘۖۦۦ۫۟ۖۚۘۙ۫ۗۨۘ۟ۗۨۧۜۖۧۜۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 17) ^ 346) ^ 351) ^ (-1022807621)) {
                case -872377557:
                    this.fileVersion = fileVersion;
                    str = "ۖۨ۠ۘۚۨۘۢۨۖۘۡ۬ۜۢۘۜۘۙۦۡ۬ۛۨۘۢۨۢۢۗ۬ۡۗۚۢۛۘ۫ۜۗۥ۠۬۟ۡۥۥۛۥۘۧۜۥۘ";
                    break;
                case -788785996:
                    return;
                case 290843458:
                    str = "ۤۤۖۘۦۖۧۘۘ۟ۤ۫ۖۘۜ۟ۚ۫ۧۨۘۘۖۗۘۧۡۙۥۗۙۨۥۘ";
                    break;
                case 2007737950:
                    str = "ۜۛ۫ۨ۟ۡۘۨۡۧۗۗۦۚۛۤۨۨ۫ۛۦۖۘۖ۠ۤۙۨۥ۬ۖ";
                    break;
            }
        }
    }

    public void setId(String str) {
        String str2 = "ۧ۟ۚۤ۫۫ۛۛۧۖۛۤۖ۠ۧ۫۠ۥۘۗۧۡۘۧۜۨۘۤ۫۫ۖۤۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 146) ^ 807) ^ 810) ^ 1216485719) {
                case -1622420167:
                    str2 = "ۗۛۖۘۨۦۗۚ۬ۜ۬ۜۦۚۦ۟۫ۧۦۥۙۜۘ۬ۡۘۘۢۦ۫ۚۚۛ";
                    break;
                case -1159859851:
                    str2 = "ۗۤۖۘۙۦۜۖۤۙ۠۫۫ۡ۠ۜۖ۟۬ۧ۬ۥۘ۬۟ۡۘۤ۬ۜۘۦۤۘۘۘ۫ۗۛۛۚۢۙۥۘۜۧۛۨۥۖۚۛۚ";
                    break;
                case -871365497:
                    this.f15887id = str;
                    str2 = "ۧۛۗۖ۫ۘۜۧۧۡۨۡۘۖۦۡۘۘۤ۬ۧۦۚۙۨۗۙ۟۠ۖۧۘۘۖۚ۠۟ۖۘۙۘۥۘۗ۬ۡۘ";
                    break;
                case -482098774:
                    return;
            }
        }
    }

    public void setInfoFile(File file) {
        String str = "ۚۛۜۘۤۙۙ۠ۤۙۘۛۡۘۜۖۖۜۧۦۜ۠ۘۘ۠ۙۡۘ۟ۛۥۚۡۖ۟ۜۡ۫۠ۥۛۧۦۘۥۨۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 366) ^ 733) ^ 960) ^ 1506188152) {
                case -202398484:
                    return;
                case -100685077:
                    str = "ۡۚۖۘۤۥۥۘۛۛۥۘۥۗۡۘۥۦۨ۬ۘۘۡۖۨۦ۠ۙ۟ۥ۟ۚۢۢ";
                    break;
                case 184891312:
                    this.infoFile = file;
                    str = "ۖۚ۫ۧۤۗۙۗ۟۠ۛۗۖۘۛۡۧۗۘۧۗۧۘۥۡۘۨۢ۬۠ۛ۟ۦۘۚۦ۫ۢۜ۫۬ۨۡۙۘۖۘۧۦۥۤۚۦۘ۟۟";
                    break;
                case 514946486:
                    str = "۬ۧۦ۬ۘۘۢ۫ۥۘۡۘۥۘۖۗۚۘ۬ۙۦۧۢۗۙۜ۠ۧۚۥۘۘۗۜۘۤۖۚۗۥۨۤۘ";
                    break;
            }
        }
    }

    public void setLcFile(File file) {
        String str = "ۤۡۖ۬ۚۥۘۘ۟ۨۘ۟۟۫ۡۤ۬ۛۦ۠ۧۘۘۤۙ۠ۜۦ۠ۚ۬ۡۤۦ۫ۧۘۢ۠ۚۘۛۜۘۡ۬ۘۨۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 87) ^ 946) ^ 785) ^ 721678061) {
                case -1432393070:
                    return;
                case 182926855:
                    str = "ۚۧۛۥۖۜۘۧ۬ۨۘۖۛۗۨۘۡۢۨۧۧۙۜ۠۬ۙۤۛ۫ۧۗ۟۠ۤۨۘۦ۟ۜۘ";
                    break;
                case 1064998264:
                    str = "۫۟ۤۦۥۡۛۖۙ۟۫۬ۛۡۖۥۚۧۗۙۡۘۘۖۡۧ۬۠۠ۤۗۘۡۘ۟ۖۘ";
                    break;
                case 2090645632:
                    this.lcFile = file;
                    str = "ۥۨ۠ۘۘۧۚۢۧۛۘۜۘۖۢۧۖۥۘۙۥۘۤۢۤۥ۫ۨۘ۟ۙۤ۟ۧۜۘۨ۫ۦۚۙۨۖۗۖۘ";
                    break;
            }
        }
    }

    public void setName(String str) {
        String str2 = "ۚ۫۟ۘۥۧۦۦۥۜۨۡۧۜ۬ۦۜۘۛۤۥۗۡۨۙ۠ۥۡۛۡۘ";
        while (true) {
            switch ((((str2.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_TITLE_BACKCOLOR_VALUE) ^ UiMessage.CommandToUi.Command_Type.FW_SET_HEIGHT_VALUE) ^ 723) ^ (-176057731)) {
                case -1881513037:
                    return;
                case -127753308:
                    str2 = "ۧ۠ۖۢۧۡۙۧۖۘ۠ۡ۟ۧ۫ۧۗۨۧۘۘۙۚۦۨۥۘۨ۟۟ۙۘۤۖۖ۠ۨ۬ۙۗۥ۠ۘۢۡ۫۠ۥۚۨ۬ۗۡۢۜ۟";
                    break;
                case 760397473:
                    this.name = str;
                    str2 = "۬۬ۦۘۦۧۖۘۡ۟ۨۖۚ۬ۚۛۘۦۤۦۗۙۙۙۗۘۘۚۘۘۥ۫ۛ";
                    break;
                case 2104675097:
                    str2 = "۬ۧۡۘ۠۫ۡۘ۟ۖۨۘۧ۟ۦۘ۠ۘۖۘۧۘۧۘۘ۫ۨ۟ۛۨۘ۬ۨۧۘۦۜۥۡۖ۠ۤ";
                    break;
            }
        }
    }

    public void setPropFile(File file) {
        String str = "۠ۚۥۦ۫ۜۘۘۨۡۘۥۥۙۤۜۥۧ۟۬ۥ۬۠ۜۖۧۘۨۙۜۚ۟ۙۙۢۡۗۥۘ۫۬۫ۜۙۘ۟ۘ۫ۥۥ";
        while (true) {
            switch ((((str.hashCode() ^ 865) ^ 849) ^ UiMessage.CommandToUi.Command_Type.SET_TAB_VALUE) ^ (-1104101972)) {
                case -1962606753:
                    return;
                case 275160515:
                    str = "ۡۦ۬۠ۛۘۘۥۚۨۘ۬ۖۛۤۨۥۘ۫ۥۖۘۛۛۡۤۧۛۧۦ۠ۜۜ۬";
                    break;
                case 1007453451:
                    this.propFile = file;
                    str = "۠ۡۡۨۛ۟ۢۨۛۧۛ۫ۘۖۚ۫۫ۘۘۗۜۡۘۡۢۨۤۨۦ۫ۛۜ۫۬ۨ۠ۨۖ۫ۖۡۘ۠۠ۢۡۘۦۘۧ۠ۜۘۙ۟ۘۘۢۨۡۘ";
                    break;
                case 1573678995:
                    str = "ۙۦۥۛۖۥۘۛ۠ۦۧۦۤۗۘۙۙۧ۬۠ۤۡۘۗۗۦۘۡ۬ۘۘۧۛۥۘۥۧۥۙۖۖۥ۠ۨۢۙ۬ۗۙۨۘ۬ۤۨۘۧۙۜۘۤۚۜۘ";
                    break;
            }
        }
    }

    public void setRtdFile(File file) {
        String str = "ۙۨۦۦۗۤ۟۟ۥۧۦۥۘۥۨۖۘۡ۠ۢ۬ۡۧۧۖۢۗ۫ۥۨۛ۟ۜ۟ۥۨۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 533) ^ 888) ^ 565) ^ 1181150423) {
                case -1696463458:
                    return;
                case 505167066:
                    str = "ۚۡ۬ۙۥۜۘۤۥۧۘۢۖۖۘ۫ۗ۟ۙۘ۬ۙۚ۫ۘۚۜۘۛۙۥۘۥ۟ۨۘۤۙۨۘۨۥۤۛۖۚۧۗۘۘۜ۟۫ۙۡۦۙ۫۠ۛۛۢ";
                    break;
                case 1420763081:
                    this.rtdFile = file;
                    str = "ۛ۟ۦۤ۠ۗۚۡۤ۫ۜ۫ۧۡۜۘۢۘ۠ۖۚۚۨ۬ۖۗۤۙۥۖۘۤ۫ۘۖۚۢۜۛۗۙۢۦۘ";
                    break;
                case 1621366596:
                    str = "۬ۙۛۢۡۘۢۛۡ۫ۘۚۗۛۦۗۥ۠ۚ۟ۡۘۗ۟ۙۖۚۛ۬ۛۦۡۦۖ۬ۙۚۡۗۥۦۜۦۘ";
                    break;
            }
        }
    }

    public void setSelId(String str) {
        String str2 = "ۗۥۛ۬ۦۧۘۘ۬۟ۗۢۨۡ۠ۢ۟ۖۨۘۛۜۙۘۖۘۖۥۤۙۘۙۖۖ۫۫۫۫";
        while (true) {
            switch ((((str2.hashCode() ^ 711) ^ 587) ^ 341) ^ (-1287018444)) {
                case -1233734889:
                    str2 = "ۧۚۡۢۙۘۘۢ۟ۖۗۜۧۡۗۥ۠ۙۗۡۡۜۘ۬ۖۡۢۤۨۨ۬۠ۜ۠ۖۘۢۥۖۤ۫۟ۧۛۥۘۤ۬ۦۗۧۥ";
                    break;
                case -264938518:
                    str2 = "ۙۖۛۤۛ۟۠ۚۡۨۥ۟ۙۨ۟ۙۚۥ۠ۢۚ۟ۨۘۙ۫ۢۛۖۗۜ۫۬ۜ۫ۜۦۡۢۤۤۗ۫ۛۜۨۡۧۘ";
                    break;
                case 493915376:
                    this.selId = str;
                    str2 = "۫ۤۢ۬ۡۘۥۗ۟۠ۥۜۘۥۖۙ۟۟ۖۦۖۦۚ۬ۨۘۢ۬ۘۡۤۨۨۡۘۢۨ۫";
                    break;
                case 1351135710:
                    return;
            }
        }
    }

    public void setSize(String str) {
        String str2 = "۬۠ۥۖ۠ۥۘ۬ۗ۟ۦۢۘۘۥۜ۠ۦۗۤۛۘۘۛۚۨ۫ۧۗۜۤۥۘۛۛۙ۬ۘۜ";
        while (true) {
            switch ((((str2.hashCode() ^ 15) ^ 923) ^ 809) ^ (-239124177)) {
                case -120681959:
                    str2 = "ۙ۬ۦۘۖۧۙ۫ۚۨۙۨ۫۬۟۫ۚۚۧۧ۟ۥ۫ۖۦۘ۟ۨۗ۟ۤۜۜ۫ۙ۫ۤۦۘ";
                    break;
                case 127976165:
                    this.size = str;
                    str2 = "۬۟۟ۗ۫ۥۜ۠۫۠ۗ۫۠۠ۚ۠ۜۘ۟ۧۧ۬۬ۨۙ۟ۡۗ۠ۡۘۖۤۗۢ۠۟ۘۜۥ۫ۦۨ";
                    break;
                case 353419472:
                    return;
                case 1144307105:
                    str2 = "ۙۖۨۘۛۧۥۘۦ۟ۤۨ۟ۗۙۥۛۦۡۗۘ۠۟ۤۤۤۥۗۨۘۜۘۤ";
                    break;
            }
        }
    }

    public void setUiFile(File file) {
        String str = "ۜۦۦۙۙۦۘ۟ۥ۫۠ۧ۬۫ۥ۫۠ۧۧ۬ۥۘۘۖۜ۬۟ۚۦۘۜۧ۬";
        while (true) {
            switch ((((str.hashCode() ^ 434) ^ 268) ^ 688) ^ (-1270359342)) {
                case -1247683822:
                    str = "۬ۧۖۘۜۢۤ۬ۥۖۘۘۚۜۘۚۛۤۧۢۡ۬ۘۦۘۛۥ۫۠۟۬ۚۡۡۘۢۧۨۧۤۘۚۜۘۤۦۖۛۖۨۘۢۢۤ۫۟ۨۘ۬ۜ۠";
                    break;
                case -160131624:
                    str = "ۥۨۨۨ۬۬۟ۖۘۘۧ۫ۨۦۦۜۨۜۧۘۦۗۦۢۜ۬ۙۤۜۘۤ۬ۚ۠ۢۜۘۢۘۥۗۢۘۘۖ۟ۜ";
                    break;
                case -150631654:
                    return;
                case 1108987378:
                    this.uiFile = file;
                    str = "ۡ۠ۦۘۖۢۡۙۗۘۡۧۜۘۨۙۧ۫ۢۨۘۗ۬ۦۘۤۦ۬ۥۛۨۨۧۘۙۛۥ۟ۦۥۘۡۥۢۜۘۨ";
                    break;
            }
        }
    }

    public void setUipFile(File file) {
        String str = "۫ۖۗۥۧۨۘ۫ۥ۫ۨۥۜۘ۠۠ۖۙۥۘۘۡ۬ۢۖۛۖۧۦۦۘۗۧ۬ۦ۠ۙ۠ۘۢۜۙۗۧۨۗۗۢ۟ۥۛۖۚۢۦۢ";
        while (true) {
            switch ((((str.hashCode() ^ 443) ^ 695) ^ C4095le.o0000oo) ^ 2130359259) {
                case 742567878:
                    str = "۫ۚ۫ۦۚۡۘۛۧۢۖۚ۠ۛۗۖ۟ۨۜۘۥۙۦۘۤۧۤۙۤۤۜ۟";
                    break;
                case 808249664:
                    return;
                case 1114552534:
                    str = "۟ۛۧۙۤۦۚۙ۬ۢۘۚۡۧۖۨۧۖۗۙۗۢ۫ۖۘۢۙۡ۫ۖۜۘۨ۟۠ۚۖۦ۠ۛۧۜۨۦۗۦۙۨۡۗ";
                    break;
                case 1314184151:
                    this.uipFile = file;
                    str = "ۤ۬۠ۗۢۖۘۥۛۤۘ۠ۖۘۧۦۤۜ۬ۗۥ۫۟ۧ۠ۢۨۡۥۘۧۘۚ۫ۤۖۖۘۛ۫ۨۦۥۡۖۦۜۘۙۥۘ۫ۛۖۘۡۢۖۘ";
                    break;
            }
        }
    }

    public void setVersion(String str) {
        String str2 = "ۢۘۧۤۜۖۘۦۖۚۙۤۨۛ۟ۨۘۖۙۡۘۢۛۢۥ۟ۦۘۢ۟ۛۦۢۖ۠ۢ۬ۧۨۡ";
        while (true) {
            switch ((((str2.hashCode() ^ 227) ^ 224) ^ 978) ^ 2043823061) {
                case -2099395079:
                    str2 = "۟ۧ۟ۥ۫ۢ۬ۡۢۚۜۙ۟ۖۦۗۨۙۤۗۖۘۦۛۢۨۗۘۛۤۖۡۥۜ۫ۘۦ";
                    break;
                case -884564941:
                    return;
                case 1501007953:
                    this.version = str;
                    str2 = "ۥۦۘۜۡۗۤۘ۟ۨۤۨۙۥۨۘۡۨۘۦۜۛۧ۟۠ۥۤۥۨۡۧۜۦۨۜۨۧۘ";
                    break;
                case 1995161951:
                    str2 = "۬ۨ۠ۦ۬ۡۘۖۢ۫ۢۛۢۛۢۘ۬ۚ۠۠ۙ۟ۡ۟ۨۘۤ۫۫۬ۥ۬۫ۦۛۧ۫ۧ۫ۜۡۢۖۧ";
                    break;
            }
        }
    }

    public String toString() {
        StringBuilder sb = null;
        String str = "ۖۗۛۙۘ۫ۙۥۧۘۤۛۖۚۙۦۨۛۨۘ۟ۥ۫۫ۨۥۘۜ۫ۨۛۛۢۥ۫ۜۘۖۘۥ۫ۤۜۘۛۚۤ";
        while (true) {
            switch ((((str.hashCode() ^ 295) ^ 590) ^ 20) ^ 2028152006) {
                case -2108820274:
                    sb.append(", id='");
                    str = "ۜۢۥۘۤۙ۫ۙۥ۫۫ۥۧۙ۟ۙۨ۠ۘۛۧۘۥۘۖۦ۟ۦۥۥۧۘ";
                    break;
                case -2098393691:
                    sb.append(this.size);
                    str = "ۧۜۚ۫۠ۜۖ۟ۚۨ۠ۥۚۥۜۦۛۤۘۥۧۦۥۜۤۨۨۖۙۨۚۤۧۘ۠ۚۜۜۘ۠ۘۧ";
                    break;
                case -2068119800:
                    str = "ۥ۟ۜۘۙۛۦۘۡۤۥۚۥ۠۬ۖۘۘۚۡۤۜۚۜۘۡ۟۬ۥ۬۠ۗۡۧۘ۬ۘۘۘۨ۫ۥۘ۟ۨ۠۟ۤۗۖۢ۫ۡۨۧۘۖۥۖۘۖۗۢ";
                    break;
                case -2018163232:
                    sb.append(", appId='");
                    str = "۠۫۟ۤۗۜۘۘۖۖۘۖۦۙۚۘ۫۟ۨ۬۟ۘ۟ۖۢۤۙ۟ۚۡۙۖۘۦۧۜۘ۬ۗۧۢۖۤۜۛۡۙ۟ۖۘۥۙۤۚۚۥۘۧ۠ۤ";
                    break;
                case -1871415591:
                    sb.append('\'');
                    str = "ۡۗۡۥ۫ۢۨۥۘۥۘۤۛۘۜۘ۠۬ۜۗۗۚ۟ۢۖۘۗۖۜۢۛۡۘ";
                    break;
                case -1706168182:
                    sb.append(", selId='");
                    str = "ۤ۫ۛۡۡۖۘۦۧۦۨۤۦۘۘۜۥۘۛ۬ۦۘۖۜۖۘۙ۬ۖۘۚۜۜۘۚۙۜۘ";
                    break;
                case -1516547003:
                    sb.append(this.rtdFile);
                    str = "ۘۨۤۜۗۚۗۥۦۘۘۗۘۘۛۗۖۦۤۚ۬ۦۢۨۛۧۡ۠۬ۛۤۜۘۚۢۨۖ۬ۙ";
                    break;
                case -1411781128:
                    sb.append(this.fileVersion);
                    str = "ۗۛۘۘۢ۟ۧۧۖۜۧۨۜۨۢ۫ۘ۟ۧ۬۟ۥۘۘۗۜ۬ۥ۫ۡۖۖۡۖ۠ۘۗۦۘ";
                    break;
                case -1205120566:
                    sb.append('\'');
                    str = "ۘۚۢۥ۟ۖۘۧۦۚۤۤ۬ۤ۫۫ۘ۠ۤ۫ۜۖ۬۠۟ۛۡۤۛۛۜۥ۠ۗۚ";
                    break;
                case -1140246600:
                    return sb.toString();
                case -1079309981:
                    sb.append(this.uipFile);
                    str = "ۢۨۚۜۖ۫ۘۙۨۛ۫ۦۤ۠ۨ۟۫ۢۡۡۧۜۢۨۥۨۛ۬۫ۡۜۘۘۥۙۘۢ۬ۘ۠ۨۘۗۧۗۙۙۛ";
                    break;
                case -697526057:
                    sb = new StringBuilder();
                    str = "ۥ۫ۡۦۨۜۡ۬۬۬ۜۡ۟ۥۖۘۥۘۖۘ۟۫ۛ۠ۤۘۘۙ۫ۜۘۜۘۘۘۢۛۖۘ۬ۨۜۤۗ۠ۨۥۤۘۛ۬ۜۥۧ";
                    break;
                case -679457483:
                    sb.append(", propFile=");
                    str = "۟ۘ۠ۧۡۗۛ۬ۦۘۥ۬ۦۘ۬۫ۦۘۧۦۨۨۧۥۧۤۖۘ۠ۛ۟ۗۨۙ۟۠ۥۥۖ";
                    break;
                case -560854654:
                    sb.append(this.bestResolution);
                    str = "۬ۦۖۖۦۨۘ۟ۖۨ۫ۖۙۨۖۨۘۢۡۥۘۗۖۚ۫ۢ۠ۥ۟۠ۖ۟ۜۘۙۡۧۜۜۖۘۖۤۗ۬ۡۘۚۥ۠ۦۗۡۘۘۙ۬ۥۙۡ";
                    break;
                case -403547251:
                    sb.append(", uiFile=");
                    str = "ۘۢۙۤۗۜ۬۟ۖۥ۠ۦۘۜۙۡۘۙ۟ۥۘۖ۠ۦۙۨۥۘۘۗۜۘۥ۟";
                    break;
                case -248615381:
                    sb.append(this.uiFile);
                    str = "ۚۚۥۘۘۨۨ۟ۜۥۘۡۘۡۘۛۖۡ۟۟ۢ۠ۛۤۧۤۚۖۡۢۡۙ۟ۙۚۖۥ۟ۡ";
                    break;
                case -197256667:
                    sb.append(", fileVersion=");
                    str = "ۘ۬ۥ۬۫۟۬ۨۜۙۘۛۥۛ۠ۦۧۢۘۧۜۜۨ۬ۙۛۡۧۤۜۘۢۘۥ۫۠ۨۘۧۦۚۤۙۢ";
                    break;
                case -163080478:
                    sb.append(this.atcFile);
                    str = "۬۫ۥۘۦ۠ۢۨۤۛۨۧۢ۫۫۬ۙۡۢۜۦ۠ۛ۠ۦۗۢۡۢۗۙۛ۬ۥۗۦۘ";
                    break;
                case -135843415:
                    sb.append(this.propFile);
                    str = "ۥۚ۟۬ۛۢۚۥۖۖۤۜۛۧۥۘۧۧۘۘۢۡۜۧ۟ۗۨ۬ۖۘۢۚۦۜۗۚۛ۬ۡۡۧۖ۠ۨۜۢۨۘۡۚ۠ۥ۟ۦۘ۫ۢۚ";
                    break;
                case -102573608:
                    sb.append("Script{changeFileList=");
                    str = "ۘۗ۠ۦۥۚۤۧۗۚۥۥ۟۠ۚۡۦ۠ۛۥۢۘۗۖۨۧۥ۬ۥۧۘ";
                    break;
                case 32975170:
                    sb.append('\'');
                    str = "ۧۥ۫ۤۜۜۘۗۨۖۖۤۜۘۘۚۜۜۨۥۧ۟۠۬ۘۨۘۛۛۨۘۚۘ۬ۤۢۜۗ۟ۢۗۘۦۘۡۜۧۘۘۤۖۘۚۖۘۘۜۛۤۗۨۘ";
                    break;
                case 170177881:
                    sb.append(this.version);
                    str = "۫ۡۥۘۥۤۖۘ۠ۖۧۘۨۡۜۘۚۜۛۦ۟ۤۡۧۨۘۤ۠ۛۛۛۦۛۧۜۘۧۦۥۤۙۧ۟ۢۜۛ۬ۡۘ";
                    break;
                case 352713640:
                    sb.append(this.cfgFile);
                    str = "ۦۥۡۘ۫ۜ۬ۗۜۚ۟ۖۥ۠ۥۜۘۙۧ۠ۡۜۚ۠ۛۖۗۡ۠ۜۙۜۛۦۢۛۦ۬ۙۨ۠ۜۨۛۘۢۗ۟ۗۚۦۜۜۙ";
                    break;
                case 469810307:
                    sb.append(MessageFormatter.DELIM_STOP);
                    str = "۟ۨ۠ۦۚ۠ۧۙۖۘۧ۫ۜۘ۬۟ۜۖ۫۠۠ۨۥۘۙ۬ۚۦۧ۬ۜ۫ۗ۫ۖۛ۠ۧۧۥۘۘ۠ۥۡۘ۬ۡۧۘۤ۬ۖۘ";
                    break;
                case 513770447:
                    sb.append('\'');
                    str = "ۘۢۦۘ۠۟ۧۨ۫ۜۘۗۘۢۛۢۜۘ۫ۦۥۘ۫ۦۖۘۛۚۤۗۧ۟ۛۢ";
                    break;
                case 593151747:
                    sb.append('\'');
                    str = "ۖۜۗۙۦۡۘۙۥۡۜۜۛ۟ۥۡۘۘۨۥۘۤ۫۟ۤۡۡۘۢ۫ۗ۟۬۠ۜ۬ۗ";
                    break;
                case 696262582:
                    sb.append(this.selId);
                    str = "ۢ۠ۙ۠ۦۖۘۙۤۢۨۧۧۜۥۥۥۛۙ۬ۜ۬۬ۗۥ۬۟ۧۡۦۜۥۡۨۘ۬۬ۙۦۚۖۘۧۢۤ";
                    break;
                case 762041652:
                    sb.append(this.f15887id);
                    str = "ۚۙۜ۬ۧۥۢ۬ۡۖۘۦۦۦ۠ۢۨۤۨۖۘۗۢۧۚ۬ۚۦ۟ۖۘ";
                    break;
                case 781399030:
                    sb.append(this.name);
                    str = "۫ۙۥۘۤۤۥۘۙۨۚۧ۠ۖۘ۬۟ۦۨ۠۬ۧۨۘۚۗ۫۬ۨ۟ۛۥۤۛۙۜۘۨۧۡۘ";
                    break;
                case 806706926:
                    sb.append(", uipFile=");
                    str = "۠ۛۥۚۘۦۢۡۢۖۚۦۧۦۘۘ۟ۚۥۘۜ۟ۡۧۦۦۛۚۡۘۛ۟ۘۘۦۤۡۚۡ۫ۡ۟ۚۦ";
                    break;
                case 859583764:
                    sb.append(this.changeFileList);
                    str = "ۨۦۧ۫۬ۚ۠۠ۥۘ۫ۜۧۨۢۗۖۥۨۘۨۗۧۧۚۡۡۛۜ۬ۥۚ";
                    break;
                case 934527573:
                    sb.append(", description='");
                    str = "۬ۤۚۜ۠ۖۘۜۛۡۘۚۥ۫ۧۛۡ۠ۛۜ۠ۤۦۘ۟ۨۗۢۦۘۢ۠ۗۙ۫ۙۧۛ۬";
                    break;
                case 1000131482:
                    sb.append(this.appId);
                    str = "ۤۘۨۥ۠ۦۜۤۨۧۢۦۘۖ۠ۜۗۛۛۙۚۢۙ۠ۖۙۙۘۜۙۖۢۧ۟ۦۛ۠ۨۛۚۖ۬ۨۨ۠ۛۡۘ";
                    break;
                case 1114180579:
                    sb.append(this.description);
                    str = "ۨۚۖۘ۫ۘۘۘ۫ۖۡ۬ۗۤ۬۟ۛۥۧۖۘۚ۫ۛۛۨۛ۟ۖۙۡ۫ۢۗۦۨۘۘۚ۠ۨ۟ۥۢ۬ۧۦۘۨ۬ۤۘ۬۬ۨ۠ۗۚ";
                    break;
                case 1190255962:
                    sb.append(this.infoFile);
                    str = "۠ۜۘ۟ۦۛۢ۫ۚۦۤۡۡۦۜۘۘ۟۬ۚ۬ۢۡۚۘۘۚۚ۟ۡ۫ۛۢۨۘۘۙۗۚۙۡ۠ۤۜۙ";
                    break;
                case 1309311049:
                    sb.append(", atcFile=");
                    str = "۬ۦۧۘۤۡۧ۫۠ۨۘ۫ۥۙ۟ۨۡۗ۫ۥ۟ۡۦۘ۬ۖۖۦۛۥۗ۠ۖۘۥۤۜۘۢ۫ۧۗ۫ۘۘۛۜۖۘۤۤۛۦۧ";
                    break;
                case 1483667292:
                    sb.append(", size='");
                    str = "ۡۛۥۚۢۡۥۢۦ۠ۗۧۗۛۚ۟ۦۘۖۚۧۙۨۨۘۘۥۘۘۜۤۡۘ";
                    break;
                case 1518763470:
                    sb.append(", version='");
                    str = "ۜۖۘۘ۟۫ۗۜۥۘۜۨۧ۠ۢۨۘۗۢۜۛۛ۫ۜ۫۫ۦۚۥۙۙۤ۟ۖۙۖۜ";
                    break;
                case 1606596290:
                    sb.append(", rtdFile=");
                    str = "ۖۘ۫ۢۥ۬۫ۥۤۘۜ۫۬ۚۢ۫ۛۜۢۥۛ۫ۤۨ۟ۧۡۦۗۙ۫ۚۧۛ";
                    break;
                case 1654700038:
                    sb.append(this.lcFile);
                    str = "ۧۛۘۘۧ۟۫ۨۛۡۘۤۦۘۙ۬ۖۘۦۜ۫ۥۦۦۚۚۡۨۛۜۤۥۤ۟ۜۡۘ۫۠ۨۘ۬ۥۖۘۚۦۦ۫۬۫ۖۗ";
                    break;
                case 1671688514:
                    sb.append(", bestResolution=");
                    str = "۬ۨۚ۠ۗۜۘۥۘۦۥۧۢ۠۫ۜۘ۫ۖ۠ۥۨۨۘۡۧۙ۟ۛ۫۫ۜۡۘۖۤۗۧ۟ۧۗۤۖۘۙۘۤۤۙۡۘۧۘ۟";
                    break;
                case 1811310899:
                    sb.append(", infoFile=");
                    str = "۟ۨۧ۫ۧۥۘۥۜۗ۟ۡۤۧۡۘۛۤ۠۟۟ۚۛۡۚۦ۠۟ۨ۟ۡۘۗ۬۟۬ۜۨۛۗۙ۠ۢۡ";
                    break;
                case 1904496293:
                    sb.append(", name='");
                    str = "ۚۦۗ۠ۨۛۚۘۥ۟ۛۢۜۦۘ۫۟ۖۖۤۦ۬۫ۙۘۥۛۘۧۚۙۗ۠ۙ۠ۜ";
                    break;
                case 1955619845:
                    sb.append(", lcFile=");
                    str = "ۚ۬ۥۘۥۥۢۡۖۦۘۢۖۤۖۜۛۗۥۘۘۙۚ۬ۦۘۥۘ۫۫ۨۖ۠ۤۥ۠ۜۤ۫";
                    break;
                case 1990979127:
                    sb.append('\'');
                    str = "۫ۡۧۘ۟ۚۥۘۗ۬ۥۤۦ۟ۡۜۦۘۦۗۖۘۚ۟ۡۥۢۤۚۛۗۚۡۦۘۗ۠۠ۚۥۘۘۙۡۜۘۘۜۥۘ";
                    break;
                case 2019798630:
                    sb.append(", cfgFile=");
                    str = "ۜ۫۟ۧ۬ۥۘۦۙۙۜ۫ۖۖۗۖۖ۬ۛۨۥۥۨۦۢ۠ۜۘۤۧۙۥۦۖۘ۟ۚ۠";
                    break;
                case 2044082634:
                    sb.append('\'');
                    str = "ۖۤۥۘۤ۬ۚۜ۫ۤ۫۬ۥۘۜۤۧۡۖۥۙ۟ۘۖۙۦۡۡۜۘ۫۟۟";
                    break;
            }
        }
    }
}
