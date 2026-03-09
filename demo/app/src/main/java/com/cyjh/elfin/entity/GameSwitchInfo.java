package com.cyjh.elfin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes.dex */
public class GameSwitchInfo implements Parcelable {
    public static final Parcelable.Creator<GameSwitchInfo> CREATOR;

    /* JADX INFO: renamed from: Id */
    public String f15885Id;
    public String Name;
    public String Path;
    public String Type;

    static {
        String str = "۫ۡۤۚۚۤۧۙۙۗۧۥۙۚۦ۫۬ۦۘۤ۫ۜۜۗ۬ۗۨۗۙۜۨ۟ۚۘ۠ۛۦۘۛۖۦ۬ۦۖۘۚۦۡۢۤۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 562) ^ 376) ^ 968) ^ (-1587961060)) {
                case -1450560029:
                    CREATOR = new Parcelable.Creator<GameSwitchInfo>() { // from class: com.cyjh.elfin.entity.GameSwitchInfo.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public GameSwitchInfo createFromParcel(Parcel parcel) {
                            String str2 = "ۧۤۡۧۨۤۧۖۡۘۗۥ۬ۡۢۧۨۜۨۡۙۖۨ۫ۨۘۖ۬ۤۙۚ۬ۙۢۜۘ۫ۡۜۘۦۜۘۖۧ۫ۡ۬ۜۘ۟ۥۥۡۘۘۘۦ۬ۦ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 512) ^ 299) ^ UiMessage.CommandToUi.Command_Type.GET_TITLE_TEXT_VALUE) ^ (-1878202606)) {
                                    case -1623526067:
                                        str2 = "ۗۥۨۘۨۥۥۘۨۤۚۥۚۚۗۜۘۘۧ۫ۨۗۡۡۘۖۨۜۘۘ۬ۨۘۖۚۜۘۙ۫ۚۘۚۦۡ۬ۛۡۖۧۘۦۘۛۜۥۜۘۗۘۙۦۘ۟";
                                        break;
                                    case -1553458580:
                                        str2 = "ۢۘۜۘ۫ۧۥۘۤۢۢۧۢ۟۫ۗۨۘ۟ۘ۟ۡ۬ۨۘ۠ۗۧ۬۟ۥ۠ۢ۬۫ۨۢۘۙۙۚۦ۬ۢۡۘۘ";
                                        break;
                                    case -206393598:
                                        return new GameSwitchInfo(parcel);
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ GameSwitchInfo createFromParcel(Parcel parcel) {
                            String str2 = "ۘ۫۟ۨ۠ۚۥۗۡۘ۬ۨۛۛۖۖۘ۟ۜۤۛۧ۠ۘۥ۠۬ۚۜۜۛۜۤۚۜۨۖۘۘۥۚ۫ۥ۠ۛۢۜ۟ۜۙۦ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 436) ^ 533) ^ 431) ^ 1414764642) {
                                    case -1353729241:
                                        return createFromParcel(parcel);
                                    case 839494278:
                                        str2 = "۫ۛۦۘۤۢۚۧ۟ۧۗۡۨۚۨۘ۟ۛۨۤۛۙۢۙۘۘۛۘۥۘۗۖۥۘ";
                                        break;
                                    case 1612266044:
                                        str2 = "ۘۦۡۜۦۥۘۢۨۘۛۧ۟ۧۙۖۖۗۨۘۘۛۜۨ۫ۦۙۡۘۦۨ۬۫ۚۗۢۧۧۚ۟ۨۚ۟ۥۚۖۘ۫ۢۨۘۛۦۧۧ۫ۧ";
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public GameSwitchInfo[] newArray(int i) {
                            String str2 = "ۖۗۨۘۧۦۡۙۡۘۘ۟ۙۛۛۛۢۘۢۙۙۜۥۘ۠۬ۚۘ۠ۘۛۤۜ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 972) ^ 109) ^ 464) ^ 593676394) {
                                    case -1225014374:
                                        str2 = "۫ۨۜ۫۟ۡۜ۬ۚۖۡۘ۬۫۬ۚۗ۫ۢۦۦۤۘ۠ۢۨۚ۬۟ۗۨۘ۠ۧۡۘ";
                                        break;
                                    case 1012768321:
                                        return new GameSwitchInfo[i];
                                    case 1712110109:
                                        str2 = "ۘۘۡۢۡۖۦۚۜۘۨۖۜۘ۫ۥۜۧۛ۫۟ۨۨۘۖۗۜۘۥۨۘۘۨ۬ۜۤۡۧۘۛۗۥ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ GameSwitchInfo[] newArray(int i) {
                            String str2 = "ۨۚۖۖۗۤۙۥ۫ۤۨۘۘۢ۫ۦۚۙ۠۫ۧ۫ۖۚۖۙۛۦۘ۫ۛۗۜۗۤۙۜ۟۠ۗۨ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 320) ^ 98) ^ 966) ^ (-1885751916)) {
                                    case 653697350:
                                        str2 = "ۙ۬ۚۢۛۨۘۛۦ۫ۚۘۘۘۗ۫ۘۡۦۗۜۥۤ۫ۢ۟۬ۥۘۢ۫ۨۘ";
                                        break;
                                    case 1061690118:
                                        str2 = "ۢۚۦ۠ۥۖۜۚۜۘۙ۬ۖۘۢۙ۟ۙۡ۫ۙ۫ۡ۫ۨ۠ۦۨۖۘ۫۟ۥۛ۟ۥۗۘ";
                                        break;
                                    case 2053590495:
                                        return newArray(i);
                                }
                            }
                        }
                    };
                    str = "۬۟ۗ۫ۤۚۨۖۚۢۥۡۧۖۧۘۨۚۜۘ۟ۚۖۡ۟۬ۛۨۘۧۘۢ۟ۖ۫ۖۛۦۘۚ۟ۜۧۙۛۨ۬ۜۦ۫ۨۘ";
                    break;
                case 2022019640:
                    return;
            }
        }
    }

    public GameSwitchInfo() {
    }

    public GameSwitchInfo(Parcel parcel) {
        this.f15885Id = parcel.readString();
        this.Name = parcel.readString();
        this.Type = parcel.readString();
        this.Path = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        String str = "ۡۥ۠۬ۤۡۘۢۨۧۘ۬ۥۥۜۙۘ۟ۦ۟ۗۛۗۜۛ۟ۦۗۨۘۙۘۖۙۜ۫ۗۛۦۦۖۘۘۡۤۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 478) ^ 514) ^ 49) ^ (-237049215)) {
                case -1150084498:
                    str = "ۚۖۘۘۧ۫ۜۡۚ۫۠ۤۦۘۡۨۖۡۜۡۨ۠ۧۧۥۘۚۚۨۘ۫ۚۖ۟۟ۗ۟ۗۖۡ۟ۡ۫۟ۤۚۖۘۚۡۨۗ۟ۦۘ";
                    break;
                case -522936944:
                    return 0;
            }
        }
    }

    public String toString() {
        StringBuilder sb = null;
        String str = "ۜۤۡۘۤۖۨۡۜۚ۬۬ۨۗۡۘۙۜۘۘۘۥ۠ۨۡۨۘۘۥۘۡۨۖ";
        while (true) {
            switch ((((str.hashCode() ^ 171) ^ 134) ^ 799) ^ (-1153760830)) {
                case -2086003918:
                    sb.append(MessageFormatter.DELIM_STOP);
                    str = "ۚۡ۬ۧۤۜۘۘۙۖۘۤۤۡۧۘ۫ۘۜۗۜۙ۟ۢۨ۫ۨۚۛۜۧ۠۠ۘۘۡۡ۟ۚۛۨۨۖۘۘۥۚۢۢۙۘۘ";
                    break;
                case -1317300319:
                    sb.append(", Name='");
                    str = "ۗۜۙۜ۫۠۠ۛ۬ۜ۫ۤ۬ۛۨۚۙۧۤۥۛۧۥۥۜۛۜ۠ۥۜۗۘۧ۠ۖۖۘۜۖۙۨۧ۠ۧۢۛۥۛ۠";
                    break;
                case -1295253208:
                    sb.append(this.Type);
                    str = "ۢۦۦۘۗۙ۠ۤۤۢۦۨ۟ۛۚۖ۬۬ۖۦۛ۫ۤۦۧ۠ۥۘۚۘ۫۫۫ۡۦۢ۠ۘۡۘ";
                    break;
                case -1214346266:
                    sb.append(this.Path);
                    str = "ۦۚۥۘۨۗۛۛۢۖۤ۠۟ۢۙۡۘۙۧۛ۫۫ۦ۫ۚۢۥۚۥۘۜۨۖ";
                    break;
                case -1157244448:
                    sb.append('\'');
                    str = "ۧۦۡۘۢ۬ۡۨ۟ۥ۬۫۫ۥ۠ۖۧۡ۬ۜ۬ۗۖۦۚۢۦۦۘۨۦۥۙۚۜۘۤۦۙۡۥ۟ۤۤۤۚۤۡۘۤۧۖۘ";
                    break;
                case -983602799:
                    sb.append('\'');
                    str = "ۚۧۦۛۜۦۜۧۨ۬ۥۖۢ۬ۙۗۥۗۖۖۡۘۢۡ۟ۚۚۥۘ۠ۘ";
                    break;
                case -776570491:
                    sb = new StringBuilder();
                    str = "۬ۤۦ۫ۡۧۘ۠ۧۤۜۛۡۘ۬ۥۘۘۜ۫ۗ۟ۖۛۦۜ۟ۥۦۗ۟ۙۛ";
                    break;
                case -533523099:
                    sb.append('\'');
                    str = "ۥۥۙ۠ۙۗۘ۟۬ۨۚۗۖۨۘۜۖۦۘ۫ۗۗۚ۬۠ۦۙۛ۟ۡۡۘۤۘۚ۫ۦۥ۟ۘۘ۟ۥۨۘۡۘۘۘۨۧۨۘۡۛ۬ۤ۠ۜۘ";
                    break;
                case -387120481:
                    sb.append('\'');
                    str = "ۛۜۖۚ۟ۚۡۢۜۘ۟ۜۡۗۜۨۚۜۦۧۦۘۤۖ۟ۥۤۢۛۚۤۨ۬ۘ۟ۙ۠ۧۥۚۛ۫ۤ۫ۜۜۘۛۜۚۤۥۦ۫۬";
                    break;
                case -64195426:
                    sb.append(", Path='");
                    str = "Oۢۚۨۚۡۦۘۦۢۘ۫ۢۡۘۚۛۤۤ۫ۚۢۦۙ۫ۖۡۘۢ۬ۙۤۗ۠ۙۚ۬";
                    break;
                case 171649251:
                    sb.append(this.Name);
                    str = "ۗۛۢۛۜۡۘ۬۟ۧ۟۟۟ۤۨۡۘۦۘ۫ۖۧۤ۠۬۠ۜۤۧۦۨۘ";
                    break;
                case 230514772:
                    sb.append(", Type='");
                    str = "ۚۤۘ۬ۨۧ۟۠ۧ۟ۡۥۘۡۧۦۛۤۦۘۢۛۦۛۖۡۧۡۗۡۘۙۡۤۦ۟ۤۥ";
                    break;
                case 852585094:
                    return sb.toString();
                case 1109832273:
                    sb.append("GameSwitchInfo{Id='");
                    str = "۫ۛۦۛۥۗۗۙۦۘۨۙۖۘۚ۫ۛۨ۬ۖۛۡۧ۟ۦۗ۟ۖۦ۫۠ۜ۟ۥ۠ۘۘۚۢۜۘ۫ۡ۫۠ۜ۫ۨ۫۟";
                    break;
                case 1462211617:
                    sb.append(this.f15885Id);
                    str = "ۙۛۘۛۡۗۖۜۛ۟ۙۧۗ۫ۡ۬ۨۘ۠۫ۦۘ۫ۢۘۘۤۨۖ۠ۧۖۘ۠۫۟ۚ۟ۦۗۚۡۡۧۜۘۗۜۘۧۥۧۖۨۨۙۛۜۘ";
                    break;
                case 1824993215:
                    str = "۬ۖۧۘۖۦ۬ۤۖۚۧۘۜ۟ۗۤ۠ۛۜۗۙۨۘۥۗۦۘۢ۫ۡۖۡۘۤۧۨۘۚۘۘۘ";
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = "ۛ۬ۜۘۘۙۖۘۨۗۘۘۨ۠ۡۡۙۛۧ۟ۗۤۢۙۘۙۨ۠۬ۘۢۨۤ۟ۧۥۘۚۨۨۖۖۛۡۛ۫ۢۡۦۗۨۖ";
        while (true) {
            switch ((((str.hashCode() ^ 525) ^ 470) ^ 0) ^ 3683779) {
                case -1564600516:
                    parcel.writeString(this.Path);
                    str = "ۥ۬۠۬۟ۥۢۧۡۘ۠ۖۖۤۨ۫ۥۗ۬ۙۦۘۙۢ۠ۧۘۜۘ۠۟ۥۡۥ۟ۖ۠ۡۘ۠ۖۗ۟ۖۧۘۗۚۖ۫ۢۘۙ۫ۖۘۦۨۖۘ";
                    break;
                case -1309685958:
                    return;
                case -1144928622:
                    parcel.writeString(this.Type);
                    str = "ۧۙۦۜ۫ۜۘۗۖۤۖۚ۠ۖۘۥۘۧۧۨۛۨۡ۬ۧۗۤۡۘ۠ۤۜۘۚۥۨۨ۫ۢ۬ۙۧۙ۫۟ۤۚۗۢۨ۠";
                    break;
                case -1090087273:
                    str = "۠ۦۖۙۚۖۘۖۢۜۘۜۡۥۙۘۨۘۨۘۨۘۙۥۡۘۥۦۧۘۙ۫ۙۦۘ۬۠ۡۦۘۡۢ۬";
                    break;
                case -1001914541:
                    parcel.writeString(this.Name);
                    str = "ۤ۫ۤۙۢۧ۠ۛۜۧ۟ۥۛۤۘۜۗۙۨۨۙۗۡۖۖ۬ۘۘۦ۠۟ۘۘ۬ۧۥۘۘ";
                    break;
                case 276486909:
                    parcel.writeString(this.f15885Id);
                    str = "ۗۙۨۢۥۥۘۦ۫ۘۤۗۡۥۤۘۘۙۢ۟ۖۘۥۨۗۖۙۦۤۙ۟ۥۖۤۨ۟ۘ۫۟ۗۤۢۗۖۧۚۦۛ۟ۘۘۛ۟ۦۘ۠ۘۗ";
                    break;
                case 453703876:
                    str = "۬ۘۧۘۖ۠۬۟ۨۙ۠ۘ۫۠ۨۡۜۧۘۘۨۨۥۘۡ۫ۥۘۛۗۡۘۤ۠ۜۘۥۖۡۛۖۘۘ";
                    break;
                case 807738092:
                    str = "ۧۤۙ۫۬ۙۜۙۢۦۛۡۘ۟ۡ۬ۖۤۖۘۡۗۡۜۗۛۦۗ۟ۛ۟۫ۗۦۢ۬ۦۤۛۗۨۘۘۗۨۘ";
                    break;
            }
        }
    }
}
