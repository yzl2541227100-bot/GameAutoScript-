package com.cyjh.elfin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManagerImpl;
import com.anythink.expressad.p086d.C1486b;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import java.io.File;
import p285z2.C4095le;

/* JADX INFO: loaded from: classes.dex */
public class ScriptLog implements Parcelable {
    public static final Parcelable.Creator<ScriptLog> CREATOR;
    private File file;
    private boolean isSelect;
    private String name;
    private String size;

    static {
        String str = "ۖۙۚۤۚۘۘۛۢۦۘۗ۫ۘۘۨۢۖۚۚۙۘۦۧۛۧ۠ۙۙۦۦ۫ۖۤۜۥۘۙ۬ۥ";
        while (true) {
            switch ((((str.hashCode() ^ 241) ^ 1003) ^ 314) ^ 1661977395) {
                case -706976373:
                    return;
                case 182100537:
                    CREATOR = new Parcelable.Creator<ScriptLog>() { // from class: com.cyjh.elfin.entity.ScriptLog.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public ScriptLog createFromParcel(Parcel parcel) {
                            String str2 = "ۨۧ۬۬۠ۥۥۢ۫۫ۛۥۘۥۢۡ۠ۘ۟ۤۘۘۨۤۢۖ۠ۖۘ۬۫ۜۘۧۚۤۚۢۢۦۛۡۘۧۙ۟";
                            while (true) {
                                switch ((((str2.hashCode() ^ 431) ^ UiMessage.CommandToUi.Command_Type.SET_SPINNER_VALUE) ^ 623) ^ (-1492157267)) {
                                    case -831242719:
                                        str2 = "۠ۘ۫ۘۡۧۘ۬ۦۜۜۡۥۘۜۖۜۘ۬ۘ۠ۖۙ۫ۨۧۤۦۡۡۤۖۘۘۦۙۚۗۦۛ";
                                        break;
                                    case 1420364781:
                                        return new ScriptLog(parcel);
                                    case 1503055997:
                                        str2 = "ۗۗ۬۫ۦۥۜۖ۟۫۫۠ۧۦ۠ۘۘۜۘۤۢۜۢۧۦۨۚۡۗۚۘ۫۫ۥۥۗۥۘۖۥۧۘۥ۫ۦ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ ScriptLog createFromParcel(Parcel parcel) {
                            String str2 = "ۡ۫ۘۘۚۜۚ۠۠ۤ۠ۖۖۘۥۤۡۡ۟ۦۘۦۥۢۧۡۢ۬ۨۤۜۙۨۗۨ۟ۗ۬۠ۛۦۥۧ۟";
                            while (true) {
                                switch ((((str2.hashCode() ^ 975) ^ 380) ^ C1486b.f7228b) ^ 1518911374) {
                                    case -2059653896:
                                        str2 = "۬ۨ۟ۖۦۖۘۡۥۡۘۙۧ۫۬۫ۖۜۦۦۘۢۛ۬ۘۢۦۗ۫ۨ۠۠ۖۖۛۖۘۡۜۙ";
                                        break;
                                    case -1224831552:
                                        str2 = "ۗۨۖۘۧۤۧ۟ۜۖ۟ۧۢۦۥۘۗ۬ۧۗۗ۠۠ۦۦۘۥ۬ۨۙۥۡۘ۬ۤۖۤ۬ۚ";
                                        break;
                                    case -957907185:
                                        return createFromParcel(parcel);
                                }
                            }
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public ScriptLog[] newArray(int i) {
                            String str2 = "ۛ۬ۤۖۗ۬ۜۜۘۘۧ۠ۥ۬ۘۜۙۤۚۨۖۘۘۙۜۖۜۚۦۜۘ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 94) ^ 858) ^ 960) ^ 1322258098) {
                                    case -956018793:
                                        str2 = "ۦۙۖۖۦۨۘۜ۠ۘۘ۬ۨۨۘۙۜۛۧۨۙۨۖ۫ۖۧۡۙۘۘۡۦۜۨۡۜۘ۬ۨۜۨۘۡۘ۫ۤۙ";
                                        break;
                                    case 235897604:
                                        return new ScriptLog[i];
                                    case 740215588:
                                        str2 = "۟ۨۥۜۜۛۙۘۖۘ۫ۢۜۘۙۗۗۤ۫ۥۙۖۡۘۖۙۨۘۛ۟ۘۘۤۗۙۧ۟ۨۘ۬ۧۧ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ ScriptLog[] newArray(int i) {
                            String str2 = "ۘ۬ۤۖۜ۟ۦۢۖۘۙۙ۫ۨۖۛۢۚۖۘۤۛۦۘۧ۫۬ۜۤۤۗۥۘۥ۫ۜۛ۫ۜۘ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 461) ^ 786) ^ UiMessage.CommandToUi.Command_Type.SET_ENABLED_VALUE) ^ 1796952447) {
                                    case -722130499:
                                        str2 = "ۘۛۗۨۡ۟ۘۨۡۘۛۗۘۘۧۜۙۦ۬۬ۜۨ۠۬ۦۛۗۦ۫ۙ۬ۘۘۙۢۢۙ۟۫۬۟ۜۤۚۘ۠ۢۥ";
                                        break;
                                    case -662013442:
                                        return newArray(i);
                                    case 868258293:
                                        str2 = "ۘۧۧۙۡۥ۟ۥۧ۠ۜۖۘۨۖ۟ۛۥۦۘۛۛۙۜ۟ۗ۟ۙۥۘۗۢۦۧۨ۠ۗۡۛۦۤۨۘ۫۟ۤ";
                                        break;
                                }
                            }
                        }
                    };
                    str = "ۙۡ۫۬ۜۘۗ۬ۚۚۙۖۘۡ۬۫ۡ۠ۦۘۢۡۡۘۨۛ۠ۨۧۥ۬ۦۦۧۨۥۢ۬ۘۦ۠ۗۧۖۡۦۘۡۘۘ۬ۨۘۤ۬ۤ۫ۨۘ";
                    break;
            }
        }
    }

    public ScriptLog() {
    }

    private ScriptLog(Parcel parcel) {
        boolean z;
        this.size = parcel.readString();
        this.name = parcel.readString();
        this.file = (File) parcel.readSerializable();
        String str = "ۚۚۨۖۗۤۤۛۖۘ۠۠ۢۢ۫ۖۘ۠ۜۛ۟ۦۖۘۨۡۘۘ۠۟ۚۗۤۡۘۢۧ۫ۖۛ۠ۧۚۥۖۥ۠ۦۧۧۧۘ";
        while (true) {
            switch (str.hashCode() ^ (-2026751080)) {
                case -212154266:
                    z = true;
                    break;
                case 1014712963:
                    str = "ۢۛۥۘۡۘۘ۠ۘۖۘۨۡۚ۟۠ۦۤۖۦۖۦۧۘ۟۠۠۬۬ۨۘۙۥۡ۠ۚۘۦۤۦۘۗۚۖۥۡۧ";
                    break;
                case 1084321698:
                    z = false;
                    break;
                case 1307609492:
                    String str2 = "ۚۜۢۨۛۨۥ۟ۚ۠ۜ۠ۨۤۥۘۢۥۘۢۘۙۨ۠ۖ۟ۘۨۘۙ۬ۡۙۚۘۙۙۡۘ۫ۤۥۨۚۙۜۤۜۤۘ۠ۡۘۦ۠ۚۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-534573743)) {
                            case -974985379:
                                str2 = "۠ۡۨۘۛۗۦۜۖۥۘۖ۫ۥۘ۫۫ۖۘۜۘۡۘ۟ۙۤۜۗ۟ۦۙۗۖ۟ۚۘۜۜۘۙۨۖۘۚۙۢۙ۬۠۟ۧۙۗۥ";
                                break;
                            case -786176309:
                                str = "ۙۖۘۛۦۜۘۛۚۜۘۤۜۧۖۜۛ۟۬۟۫ۙ۠ۚۧۡۘۥۦ۫ۥۚۧۥۙۦۘۗ۫۠ۧۘۙ۠۬ۘ";
                                continue;
                            case -312089594:
                                str2 = parcel.readByte() == 0 ? "ۙۥۘۖۨۘۘۖۢ۟ۚۨۨۘۘۖۛۛۘۡۨۛۡۧۖۘۗۥۨۘ۟ۨۤۛۖۤۡ۬" : "ۘ۟ۦ۠ۙۦۘۘۛۖۦۙۤۨ۟۫۠ۛۧۢۘۨۘۛۙۛۥۥۘۚۨۛ";
                                break;
                            case -176332323:
                                str = "ۨۗۢۡۤۧۚ۬ۨ۬ۙۨۘۙ۬ۧۗۡۖۚۗۙۡۙۡۥ۫ۜۥۗۘۘ۠ۜۢ۬۠ۚ۫ۢۡۥۦۘ۠ۥۦۡۙۥ";
                                continue;
                        }
                    }
                    break;
            }
        }
        this.isSelect = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        String str = "ۨۢۖۘ۬ۤۜۘ۫ۙۡۗۨۚۛۚۦۘۡۘۘۛۖۧۘۢۚۥۚ۬ۥۤۨ۫ۘۙ۟ۦۡ۫ۖۙۡۘۙۛۢ";
        while (true) {
            switch ((((str.hashCode() ^ 342) ^ 414) ^ 54) ^ (-72220226)) {
                case -1861951838:
                    return 0;
                case 1545145769:
                    str = "۬ۚۙۥۛۥۘۢۙۡۘۡۘۡۘۙۢۧۢۜۖۗۧۡ۠۟۫۟۬ۥۘ۟ۨۧ۟ۚ۬ۚۧ۫";
                    break;
            }
        }
    }

    public File getFile() {
        String str = "ۡۜۚۙۘۨۘ۫ۡۘۜۛۤۘۚۚۗ۬ۨۘۨۘۨۘۗۘۛۛۜۦ۟ۨۘۘۧۜۘۗ۠ۜۥۚۦۙ۟۟ۘ۠ۡۘۢ۬ۙ";
        while (true) {
            switch ((((str.hashCode() ^ 349) ^ 131) ^ C4095le.o0000OO0) ^ 2142194045) {
                case -1846622046:
                    str = "ۧ۟۬ۥ۫۟۫ۥۥۘۖۖۨ۟ۤۙۧ۠ۥۘۛ۠ۜ۫ۛ۠۫ۖۧۘۥۜ۠ۚ۠ۡۘۡۜۚۚۤۘۘۤۙۦ";
                    break;
                case 904616117:
                    return this.file;
            }
        }
    }

    public String getName() {
        String str = "ۦۙۖۦۥۘۘ۠۠۫۫ۛۜۥۖۡۗ۠ۖۘۖۗۡۘۙۡۜۘۘۜۘۡۢۦۘۤۛۥۨۘۨۘۙۦۙۗ۬۟ۥۦۖۡۢۙ۬ۜ۟ۨۦۦ";
        while (true) {
            switch ((((str.hashCode() ^ FragmentManagerImpl.ANIM_DUR) ^ 485) ^ 503) ^ (-1384262205)) {
                case 443985395:
                    return this.name;
                case 1844524248:
                    str = "ۢۧۖۘۨ۬ۢ۠ۡۤۡ۠ۢۤ۬۫ۖۙۘۘۚ۠ۜۧۜۧۘۜۜ۟ۗ۟ۜۗۤۤۗۤۜۘ";
                    break;
            }
        }
    }

    public String getSize() {
        String str = "۬ۘۢۙۗۦۘ۫۠ۜۘۘۢ۟ۤۙۘ۠ۨۙۛ۫ۗۧۚۡۘۘۢ۬۟ۘۘۢ۠ۜۡۦ۬ۛۦۗۧ۠";
        while (true) {
            switch ((((str.hashCode() ^ 302) ^ 949) ^ 117) ^ 959408139) {
                case -836664161:
                    str = "ۨۧۧۘۦۦۛ۬ۘۘۦۤۘۘۗۖۖۘۤ۠ۛ۫۬ۘۤۛ۟ۜۦۤۤۢۛ";
                    break;
                case 1688653302:
                    return this.size;
            }
        }
    }

    public boolean isSelect() {
        String str = "ۙۤۗۦ۫ۢ۠ۢۜۥۚۢۜۜ۬ۡ۟۬ۗۗ۫ۥۖۦ۬ۥۥۘۚ۟ۘ۠ۛۧۜۦ";
        while (true) {
            switch ((((str.hashCode() ^ 709) ^ 332) ^ 895) ^ 1159707115) {
                case -763387166:
                    str = "ۛۙۙۛ۫ۘۘ۬ۚۗۙ۠ۡۗۦ۟ۙۨۙۖ۬ۖۘۦۗۜۘۖۖۥۦ۟ۨۘۢ۟ۡۘ۠ۨۖۘ۫ۨۘۥۚ۬ۡۜۥۘۗۜۥۘ۟ۢۦۗۤۖۘ";
                    break;
                case 780488802:
                    return this.isSelect;
            }
        }
    }

    public void setFile(File file) {
        String str = "ۛ۠ۘۘۢۡۡۦ۫ۖۘ۟ۙۙۡۚۤۙۖۗۚۧۚۤۘۖۘۡۤۥۙۢۘۨۚۧۙۦۗۦۙۦۚ۬ۘ";
        while (true) {
            switch ((((str.hashCode() ^ 518) ^ 156) ^ 776) ^ 2133921554) {
                case -848185321:
                    str = "ۧۧۛ۟۠ۦۘۙۤۚۤۚۗۛۜۘ۠ۤۥ۫۟ۢۚۜۡۘۨۘ۬ۙۘۙۜ۬ۥۘ۠ۧۡۤ۟۠۫ۧۨ";
                    break;
                case -715753138:
                    str = "۠ۜ۬ۤۥۡۢۘۚۥۜۥ۠ۡۚۦۧۡۗۛۛ۬ۚۡۘ۟ۗ۫۟ۢ۟۠ۦۛۙ۟ۙۜۤۦۘۦۙۨ۬ۥۨۨۖۛ";
                    break;
                case 1052916067:
                    this.file = file;
                    str = "۬ۛ۫۠ۛۜۤۜۢۡۥ۫ۜۦ۫ۦۨۦۘۗۨۡۘۜ۟ۡۘۦۡۥۥ۟ۛۦ۠ۥۘۜۤۡۘ";
                    break;
                case 1099542168:
                    return;
            }
        }
    }

    public void setName(String str) {
        String str2 = "ۚۛۗۛۨۧۤۢۘۧ۟ۥۘ۟ۧۖۚۡ۬ۢۥۘۤۙۜۦ۬ۥ۟ۘۨۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 996) ^ 443) ^ 734) ^ (-1518875634)) {
                case -1655517105:
                    str2 = "ۖۤۛۖ۫ۦۧ۠ۢۧ۟ۗۨ۬۠ۗۗۨۜۜ۬ۥۜ۬ۖۘ۟ۙۜۢۖ۬ۢۨۤۤ۠۟۠ۡۧۘۤ۬ۨۗ۫ۨۘۢۧۤ۬ۗۚ";
                    break;
                case -1307658319:
                    str2 = "۫۟ۜۘۘۗ۟ۤۨۥۧۢۚۗۤۡ۬ۜۨۤۛۢۡ۫ۚۛ۫ۧۛۦۥۘۖ۠ۥۡ۬ۨ";
                    break;
                case -878614215:
                    this.name = str;
                    str2 = "ۘۗۥۚ۟ۡۘۢۦۘۚۧۥۙۘۨۘۥۛۨۦ۬ۥۘۗۙۦۜ۟ۛۛ۟ۙۖۚۢۧۘۛ";
                    break;
                case -317522088:
                    return;
            }
        }
    }

    public void setSelect(boolean z) {
        String str = "ۢۢۢۜۗ۠ۥۡۡ۫ۘۜۘ۟۟ۜۘۛۛۛ۬ۤۗۧۖۨۘۖۖ۫ۛۧۤۘۥۧۘۢ۬۠۬ۜۡ۫ۡۗۙۗ۫ۘۨۢۗۛۜۘۨۡۥ";
        while (true) {
            switch ((((str.hashCode() ^ 894) ^ 945) ^ 81) ^ (-637748222)) {
                case 428641566:
                    return;
                case 695756731:
                    this.isSelect = z;
                    str = "ۜۢۘۘۤ۠ۡۘۘ۟ۘۘۖۘۗۗ۬ۗۧۛۘۘۦۙۖۘۚۚۜۘۜۡۥۘۗۚۛۥۨۨۘ۫۬";
                    break;
                case 1208472553:
                    str = "ۗۨۤۜ۬۫ۡ۫ۖۘ۟۠ۘۘۧ۬ۘۢۘ۫ۦۨۘۘۧۧۗۧۦۖۘۘ۬ۚ";
                    break;
                case 1583468298:
                    str = "ۦۙۨ۠ۦۚۗۢۡۘ۠ۦۦۤۖۖۥۚ۬ۛۦۘۘۧۙۗۙۚۥۦۥۥ۫ۨۘۘۙۙۧۨۤۦۘ۬ۡۘ";
                    break;
            }
        }
    }

    public void setSize(String str) {
        String str2 = "ۙۨۧۗۧۜۘ۠۫ۖۘۛۨۧۘۧ۫ۖۘۤۚ۫ۙۜۖۘۨۨ۬۟۟ۡۡ۟ۗۦ۟ۡ۫ۢۡ۫ۦۧۦۡۦۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 316) ^ 453) ^ 330) ^ 1169903547) {
                case -2046926928:
                    str2 = "ۨ۬ۧۧۙۨۢۡۨۧۢۢۜۙۥۧۤۡۜۦۡۙۙۚۘ۠ۘۘۗۘۘۘ۬ۚۢۗۧ۬";
                    break;
                case -1739948142:
                    this.size = str;
                    str2 = "ۨۡ۟ۦۤۥۡۘۙۡۜۙۘۦۤ۫ۦۘۥۤۨۘۡۗۥۘۜۢ۬ۛۡۖ۫ۤۗ۠ۨۘ";
                    break;
                case -1491809264:
                    return;
                case -1013611223:
                    str2 = "ۛۦۜ۟ۜۚۙۛ۫ۜۡۗۙۚۢۘۙۜۘ۠ۥۦۧ۠ۨۖ۟ۦۗۥۘۢۙۚۜۧۦۗ۫ۤۘ۫ۥۘ";
                    break;
            }
        }
    }

    public String toString() {
        StringBuilder sb = null;
        String str = "ۦۜۘ۠ۤۨۘۖ۫ۛۛۥۜۚۛۘۘۦۙۧۚۢۧۧۥ۠ۦۘۥۢۚۦ۬ۥۥۘ۬ۤۢۡ۠ۗۦ۬ۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 524) ^ 253) ^ 898) ^ (-926047590)) {
                case -626208980:
                    sb.append("]");
                    str = "ۜۘۜۖۡۛۙۚۛۢۥۥۤ۬ۤۦۛۜۦۥۨۤۛۡۘۦۨۥۘۦۘۗۢۦۘۡۙۨ";
                    break;
                case 65427655:
                    sb.append(this.file);
                    str = "ۖۜۥۨۡ۫ۖۙ۠ۥۘۜۘۚ۫ۜۘ۟ۢۧ۬۬ۛ۫ۤۧۗۦۘۘۥ";
                    break;
                case 201218929:
                    return sb.toString();
                case 400609958:
                    sb = new StringBuilder();
                    str = "ۛۦۛۥۗۥ۟ۖۨۘۚۥۧۘۗ۠ۘۘۘۙۗۜ۠ۚۧ۠ۚۖۡۨۘ۬ۘۖ";
                    break;
                case 407589332:
                    sb.append("ScriptLog [size=");
                    str = "۫ۧۡۨۖۜۘۥۖۧ۫ۗۗ۬ۜۘۘ۠ۨۘۚۘۧۗۥۥ۫۫ۧۙۚۦ";
                    break;
                case 1066031147:
                    str = "ۦۚۘۦۚۡۘۖۖۖۚۖۨۘۗۨۦۘۧ۬۬ۢۥ۠ۨ۠ۙۘ۟۠۫ۡ۬۫ۧۗ۠ۙۚۨۦۛ۠۠ۡۢۨۡۘۤ۠ۤ";
                    break;
                case 1083812833:
                    sb.append(this.size);
                    str = "ۙ۬۟ۚ۬۫ۦۤۖۘۥۤۨۥۤ۟ۜۗۙ۠ۜۢۧ۟ۚ۠۫ۙ۬";
                    break;
                case 1220405727:
                    sb.append(", file=");
                    str = "ۙ۟ۙ۬ۦۖۘۗۤۘۘ۠ۘۧۙۧۧ۠ۘۧ۫ۦۙ۠ۨۚۜۥۘۘۢ۠ۢۤۘۘۘۨۦۧۨۢ۫ۜۦۘۘ۬ۨ۫ۧۗۥۘ";
                    break;
                case 1338935671:
                    sb.append(this.name);
                    str = "ۖۡ۠۬ۨۢۛۥۖۡۜۤۦۨۨۜۘۘۙ۫ۥۘۛ۠ۖۖۨۥۜۧۧۚۢۥۘۗۢۖۥۚ۬۠ۨ۬ۛۚۗۘ۬ۥۖۛ۠ۥۡۨ";
                    break;
                case 1572892765:
                    sb.append(", name=");
                    str = "ۧۡ۬۠ۖۖۘۢۥۧۦۛۤۗ۫ۥۦ۠ۙۧۦۚۧۙۡۜۢۗۚۚ۫ۦۖۧۧۥۘۗ۫ۖۘۚ۟ۦۘ۫ۢۤ۫۫۬ۜۢۤۘۘ";
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = "ۡۧۥۘ۬ۚۢۖۦۘۘ۬۠ۖ۫ۜۜۘۙ۠ۗۙۢۜ۬ۥۦۘ۟ۖۢۚۗۚ۬ۗۦۘ۫ۧۛۡۖۗۗۥۧۡ۬ۡۘۘۧ۫ۢۜۜۘۜ۟ۤ";
        while (true) {
            switch ((((str.hashCode() ^ 764) ^ 854) ^ 781) ^ 1057326051) {
                case -1690037429:
                    return;
                case -1684313902:
                    parcel.writeString(this.name);
                    str = "ۦۘ۬۫ۡۨ۠ۜۥۤ۠ۛۢۥۦۧۘۦۘۦ۠ۢۛ۬ۘۘۘۥۨۘۚۖۗ";
                    break;
                case -1682803692:
                    str = "ۛۤۡۘ۠ۡۨۘۚۗۙۤ۬ۗۗۢۥۘۧۖۡۘۤۗۡۘۦۥۘۘۧۥۨۘۡۤ۬ۙۢۦ۟ۢ۫۬ۚۤۛۦۖ";
                    break;
                case -1448255448:
                    parcel.writeString(this.size);
                    str = "ۜۡۨۘۗۜۙ۫ۘ۫ۦۧۡ۫ۨۜۘۘۥۚۚ۬ۧۗ۬۫۟ۨۖۘۗۗ۠۠ۦۘۘۢۙۛۛۘۢۡۛۨۘۨۥۘۜ۠ۦۥۡۙۨۚ";
                    break;
                case -1145738718:
                    str = "ۦۤۡۘ۬ۧۡۧۨ۠ۜۤۚۦۢۙۥ۠ۖۦ۟ۢۢ۠ۖۛۧۦ۟ۘۘۥۗۦۘ۠ۥۥۘۛۢۤ۟ۨۜۘ";
                    break;
                case -486490418:
                    str = "ۘۚۘۘۚۦ۠ۛۜۡۘ۠۟ۛۡۦۖ۟ۘ۫ۥۜۦۥۤۚۥ۫۫ۜۢۨۘۡۦۜۜ۬ۨۤۙۜۖ۠۠";
                    break;
                case 1348123481:
                    parcel.writeSerializable(this.file);
                    str = "ۧۧۘ۟ۡۨۦۨۙۜۦۨۘۧۡۙۖۜۧۚۨۦ۫ۜۦۥۗۖۘ۠۟ۖ۟ۦۨۦۧۥ";
                    break;
                case 1779901056:
                    parcel.writeByte(this.isSelect ? (byte) 1 : (byte) 0);
                    str = "ۦ۠ۤ۫۬ۘۘ۫ۥۨۢۢۗۛۖۘ۫ۙۖۘۥۜۡۘ۠۬۠ۧ۫۫ۥۧۨۘۥۧۦۘۨۚۗۥۤۘۜۛۙۢۙۘۚ۫ۛ";
                    break;
            }
        }
    }
}
