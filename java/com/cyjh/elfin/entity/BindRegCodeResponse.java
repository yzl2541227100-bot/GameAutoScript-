package com.cyjh.elfin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import p285z2.C4095le;

/* JADX INFO: loaded from: classes.dex */
public class BindRegCodeResponse implements Parcelable {
    public static final Parcelable.Creator<BindRegCodeResponse> CREATOR;
    public int Code;
    public RegCodeTimeInfo Data;
    public String Message;

    public static class RegCodeTimeInfo implements Parcelable {
        public static final Parcelable.Creator<RegCodeTimeInfo> CREATOR;
        public long ClientTimestamp;
        public long ExpireTime;
        public long ServerTimestamp;

        static {
            String str = "ۢۗۥ۟ۛۜ۟ۘۜۘۤۘۘۦۥۜۘ۫۠ۡۦۨ۠ۗ۟۬ۦۚ۬ۚۜۘۧ۬ۙۢۡۤ";
            while (true) {
                switch ((((str.hashCode() ^ 5) ^ 669) ^ 291) ^ (-2076976251)) {
                    case -1199068276:
                        return;
                    case 547470297:
                        CREATOR = new Parcelable.Creator<RegCodeTimeInfo>() { // from class: com.cyjh.elfin.entity.BindRegCodeResponse.RegCodeTimeInfo.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public RegCodeTimeInfo createFromParcel(Parcel parcel) {
                                String str2 = "۫۬۫ۘۡۙ۠ۜۨۖۗۦۘۜۛ۫ۦۘۗۡۢۢ۠ۡۦۘۨۛۨۘۖۚ";
                                while (true) {
                                    switch ((((str2.hashCode() ^ 447) ^ 451) ^ 705) ^ 540457113) {
                                        case -1671329507:
                                            str2 = "۬ۨۜۘ۫۟ۤۡۦۡۘۢۚ۫ۢۧ۬ۢۢۡۘۨۜۙۥۧ۟ۜۜۛ۫ۙ۟ۚۡۘۜ";
                                            break;
                                        case -1438139987:
                                            str2 = "ۨۚۚ۫ۙۤۜ۬۫ۨۜۡۘۘۚۛۨ۬ۤۚۥۘۘۙۚۗۘۛۨۘۖۧۜۘ۫ۛۨۘۤۦۧ";
                                            break;
                                        case 850809244:
                                            return new RegCodeTimeInfo(parcel);
                                    }
                                }
                            }

                            @Override // android.os.Parcelable.Creator
                            public /* bridge */ /* synthetic */ RegCodeTimeInfo createFromParcel(Parcel parcel) {
                                String str2 = "ۗ۫ۜۘۤۘۨۘۙۛۘۢۙۛۡۦۡۘۨۘۧۢۦۧۘ۬۫۫ۛۘۚۥۡۨۘۧۗۥۡۘۙۤۡۖ۠ۨۘۥۤۖۘۗۧۡ";
                                while (true) {
                                    switch ((((str2.hashCode() ^ 578) ^ 109) ^ 243) ^ (-1028547575)) {
                                        case -1635960424:
                                            return createFromParcel(parcel);
                                        case -507271448:
                                            str2 = "ۙۦۢۗ۟۫۟ۨۖۦۜۨۘۗۥۤ۠ۚۦۘ۠ۧۡۘۦۖۢۖۦۨۨۛۖ۬ۤۢ۠ۜۘۖۘۡۘۤۜۦۘ۠ۧۢ۫ۖۜۘۘۦۥۡۢۚ";
                                            break;
                                        case 2062452916:
                                            str2 = "ۡۜۘۙۨۥۘ۠ۛۘۘ۠۫۬ۛۥۢ۠۬ۥۘۨۧۙۤ۬۠۟ۦۧۘۙۖۨۜۙ۟۫۠ۗۛۜۨۙۤۨۘ";
                                            break;
                                    }
                                }
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public RegCodeTimeInfo[] newArray(int i) {
                                String str2 = "۠ۛۡۘۨۢۡۘۚۥۡۘۙۥۥۚۚۖۘ۫ۜۡۡۗۖۘ۠ۗ۬ۜۨۦۘۙۨۨۘۥ۟ۧۨۦۤۘۦۦۘ۟ۙۨۙۛۨۘۚۘۚ";
                                while (true) {
                                    switch ((((str2.hashCode() ^ 682) ^ 2) ^ 483) ^ 1984712554) {
                                        case -1295234348:
                                            str2 = "ۜۙۤۗ۟ۗۥۤۖۢۜۢ۟ۢ۬ۙۡۥۘۘۜۗۖۨۘۨ۬ۜۘۡۜ۫ۥۖۡۘۤۚۦۛۦۥۘۢۙۦۗۛ۠ۛۗۡۘۥۨۡۨ۫";
                                            break;
                                        case 1280362956:
                                            str2 = "ۨ۠۬ۧ۟ۜۗۥ۬ۤ۫ۦۛ۟ۥۘ۫ۗۛۡ۫ۜۗۗۜۦۘۦۘۨۨۛ۫ۘۡ۠ۨۥۢ۟ۙۧ۫ۖ";
                                            break;
                                        case 1371649924:
                                            return new RegCodeTimeInfo[i];
                                    }
                                }
                            }

                            @Override // android.os.Parcelable.Creator
                            public /* bridge */ /* synthetic */ RegCodeTimeInfo[] newArray(int i) {
                                String str2 = "ۙۙۥۢۛۧۧۖۧ۠ۖۧۘ۟۫ۘۘۛۢۖۡۘۘۙۙۥۢۦۗۢۘۗ۟ۖۖۘۚۧۡۘۘۤۗۜۜ۬ۜۤ۬ۦ۫ۡۘۥۨۦۢۡ";
                                while (true) {
                                    switch ((((str2.hashCode() ^ 583) ^ 389) ^ 79) ^ (-1693575627)) {
                                        case -2092281849:
                                            str2 = "ۤۗ۬ۘ۬ۛۙ۫ۗۧۘۛ۠ۦۧ۠۠۫ۚۤۛ۟ۧۨۘۢۚۚۡۦۜۘۖۤۛۙۢۥۘۛۦۛۤۛۙ";
                                            break;
                                        case 281666236:
                                            str2 = "۫ۗۥۘۨۜۧۧۚۦۙ۟ۥۗۢ۬ۡۥ۫ۘۘۙ۫۬ۨۥۘۚۚۨۚۗۘۘۦۜ۠ۢۡۜۘۜۤۢۖ۟ۛۨۛۨۢۙۨۨ۟ۨۘ";
                                            break;
                                        case 2057531546:
                                            return newArray(i);
                                    }
                                }
                            }
                        };
                        str = "ۧۖۥۥۢۜ۬ۗۡۘۦۜۥۘۦۙ۠ۘۤۘۖۤۥۜۡۤۛۨۡۢۡۜۘۚۥۖۥ۬ۘۘۗۙۚۙ۠۫ۦۨۢ۫ۤۡ";
                        break;
                }
            }
        }

        public RegCodeTimeInfo(Parcel parcel) {
            this.ClientTimestamp = parcel.readLong();
            this.ServerTimestamp = parcel.readLong();
            this.ExpireTime = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            String str = "ۧ۫ۛ۟۟ۨۘۗۢۜۘۧ۟ۡۘۨۧۥۗۢۢۡۖۘۗۖۨۘ۫۠ۖۧۧۛۨۨۜۖۙ";
            while (true) {
                switch ((((str.hashCode() ^ 826) ^ 907) ^ 868) ^ (-1439834950)) {
                    case 802793358:
                        str = "ۙۥۡۖ۟ۖۘۤ۫ۥۗۧ۫۬۬ۥۙ۫ۘۘۙۘۘۘۥۨۦۜۜ۟ۧۥۘۗۘۖۘۡۘ";
                        break;
                    case 2113162096:
                        return 0;
                }
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            String str = "ۛۦۦۘۥۢۨۙ۫۫ۦۗۖۘۨۢۙۖ۟ۦۛۧۨۘۗۢۘۗ۫ۘۘۥۛۦۘۙۦۥۘۛۦۢ۬ۚ۟ۢۥۛ۬ۨ۟ۡ۟ۡۤ۟ۙۢ۟ۜ";
            while (true) {
                switch ((((str.hashCode() ^ 889) ^ 265) ^ 278) ^ (-88543552)) {
                    case -1009980627:
                        str = "ۦۛۡۘۜۚۡۘۜۨۘۘۢۙ۬ۚ۬۫ۨۤ۟ۖۡۨۘ۫ۜۥۨۥۡۘۧۨ۬۟ۙ۬ۢۜ";
                        break;
                    case -351597033:
                        parcel.writeLong(this.ClientTimestamp);
                        str = "ۢۦۛۤ۠ۗ۟ۜ۫ۥۖۦۤ۟ۘۘۙۦۦۘ۟۫ۜۘۘۗۚ۫۫ۧۜۧۜۨۚۗۧ۬ۘ۠ۚۢۗۡۘۥۖۗ";
                        break;
                    case 466185708:
                        parcel.writeLong(this.ExpireTime);
                        str = "۬ۚۨۘۜ۫ۥۨۧۨۘۨۘۘۛۥۚ۠ۦۘۦۛۧۡۘۡۘۚۚۘۚۥۥۙۧ۟۬ۡ۠۟ۛ۫ۜۛۨ";
                        break;
                    case 500822088:
                        str = "۫ۡۥۗۤۜۘۥۡۖۘۢۢۛ۬ۦۢۤۦۥۘۨ۠ۗ۬ۥۤۖۥۘۖ۟ۨ۬ۜ۠ۦ۫۟ۦۤۨ۠ۗۨ";
                        break;
                    case 1064671322:
                        str = "ۘۢ۟ۢ۬ۧۜ۫۠۟ۨۡ۫ۤ۬۫ۥۛۖۘۘۜۢۗۦۡ۬ۢۢ۫ۨۥۦۖۤۖ";
                        break;
                    case 1108180732:
                        parcel.writeLong(this.ServerTimestamp);
                        str = "ۢۜۢ۫۬ۡۘۨۡۚۨۧۦۘۛۢۥ۠ۚۛۜۤۡۢۧۦۘۦ۟ۜۘ۬ۗۘۘۦۖۚۖۨ۫ۨۢۗۦۙۘۛۧۥۘۙۘۚ";
                        break;
                    case 1302735445:
                        return;
                }
            }
        }
    }

    static {
        String str = "ۦۛ۟ۨۡۧۘۢ۬ۘۡۚۦۧۖۨۘۜۗۜۘ۫ۤ۬ۖۡ۬ۤ۬۫ۥۙۧ۠ۧ۬ۛۤۖۙۚۙ۫ۤ۠";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.GET_TEXTCOLOR_VALUE) ^ 1010) ^ 763) ^ (-1036369865)) {
                case -611284617:
                    CREATOR = new Parcelable.Creator<BindRegCodeResponse>() { // from class: com.cyjh.elfin.entity.BindRegCodeResponse.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public BindRegCodeResponse createFromParcel(Parcel parcel) {
                            String str2 = "ۘۧ۠ۗۦۢۛۥۧۘۤۛۡۨۘۚۖۡۡۡۜۖۘۨۚ۟۠ۚۙۚ۫ۢۥۗۛ۠ۚۢۜۘۗۦۘۘ۫ۖۡۖۦ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 968) ^ 943) ^ 460) ^ (-2031425450)) {
                                    case -1402066913:
                                        return new BindRegCodeResponse(parcel);
                                    case -127578976:
                                        str2 = "۟۫۫ۧۛۦۚۖ۠۟ۛ۫ۥۚۢۤۙۧۨ۬۬۬ۖۢۙۨۖۘۛۗۢ";
                                        break;
                                    case 1658059790:
                                        str2 = "ۧۦۨۙۖۨۚۚۢۢ۟ۖۛۖۨۘۗۢۥۘۥۢۖۡ۬ۖۘۦۥۛۜۧۨ۫ۛۢۛۖۥ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ BindRegCodeResponse createFromParcel(Parcel parcel) {
                            String str2 = "ۛۚۖۘ۟ۧۥۖۢ۟ۧۗۙۧۡۨۚ۠ۤ۠ۥۜ۠ۖۡۙ۠ۖۡۥۘۡۗۡۤۖۥۘۨۦۖۘۨۢۜۘ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 951) ^ C4095le.o0000O) ^ 278) ^ 689577635) {
                                    case -1464613198:
                                        str2 = "ۚۤۡۘۡۡۖۘ۫ۡ۬ۙۖ۟ۘۨۨۗۥۘۛۧ۬ۘۘۦۨۦۘۗۙۖۧۜ۫۟ۤ۫ۨۖۛۧۛ";
                                        break;
                                    case -842248207:
                                        str2 = "ۗۤۘۘۗۥۙ۬ۗ۫ۙ۟ۙۥۡ۬۫ۨۗۡۜۘ۫۬ۢ۠ۤۡۨۧۥ";
                                        break;
                                    case 1367119690:
                                        return createFromParcel(parcel);
                                }
                            }
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public BindRegCodeResponse[] newArray(int i) {
                            String str2 = "ۡۖۖۘۖۧۨ۫۟ۦۖۤۜۜ۟ۜۥۢ۠ۥۨ۟ۡۡۜۨۗۖۥ۬۠ۘۦۘ۬ۖۢ۠ۙۦۘۦۘۥۘ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 869) ^ 293) ^ 504) ^ 1748237045) {
                                    case -2068879131:
                                        str2 = "ۧۙۛۨۦۥۘ۫ۦۦۘۛۙۡۘۥۖ۫۟ۚۧ۬۟ۜ۠ۨۡۘۘۧۖۛۢۘۘۤۖۖۘ۬۫ۧ۫ۢ۬ۛۛ۠";
                                        break;
                                    case -390023365:
                                        str2 = "ۢۡ۠Oۗۦۡۘ۟ۘۙۗ۠ۘۤۡۢۡ۫ۜۘۥۚۖ۬۟۫ۘۤ۫۫ۚۜۘۜۥۘۚۚۖۗۛۦۘ";
                                        break;
                                    case 568697350:
                                        return new BindRegCodeResponse[i];
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ BindRegCodeResponse[] newArray(int i) {
                            String str2 = "ۤ۟ۚ۬ۢۥۘۤ۟ۤ۠۬ۘۘۨ۟ۛۘۥۚۤ۟ۥۢۜۚۨۖۦۡ۬۬";
                            while (true) {
                                switch ((((str2.hashCode() ^ 386) ^ 658) ^ 0) ^ (-371068014)) {
                                    case -395511497:
                                        str2 = "ۢ۫ۦۘۖۛۙۢ۬۬۬۠۬ۨۗۥۘۡۥ۫۠۬ۤۦۨۛۢۙ۠۟ۗ۬۟ۧۘ۠۬ۧۨۥۜۙ۬ۜ۠ۚۚۛۥ";
                                        break;
                                    case 1891646129:
                                        str2 = "ۢۢۘۘ۬ۦۧۘۘۗۛ۫ۢۜۘۡۖ۬ۘۘۙ۟۬ۨۗ۠ۦۡۙۦ۠ۨۦۜۡۨۨۘۜۗۘۡۜۦۨۛ۫۫ۖۡۨۦۖۘ۬ۛۢ";
                                        break;
                                    case 2085497198:
                                        return newArray(i);
                                }
                            }
                        }
                    };
                    str = "ۤۢۖۛ۟ۡۘ۟ۘۨۢۥۙۙۛۦۘۛۘۜۘ۬ۚ۟ۗۙۖۘۧ۬ۖۘۖۡۙ۫۟ۤ۫۫ۜۦ۫ۖۙ۟ۡۛۥ۟ۘۧۖۤۛ۫ۜۚ";
                    break;
                case 1052770968:
                    return;
            }
        }
    }

    public BindRegCodeResponse(Parcel parcel) {
        this.Code = parcel.readInt();
        this.Message = parcel.readString();
        this.Data = (RegCodeTimeInfo) parcel.readParcelable(RegCodeTimeInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        String str = "ۗۥۙ۫۠ۢۧۚۦ۠ۢۧۢۛ۫ۖۦۨۘۨۗۙۛۤۜۘۘۤۚۢۧۜۘۚ۬ۨۨۛۖۘ۫۬ۨۘۤۚ۫۟ۗۤۚ۠ۖۘ۠ۢۜۘۛۜۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 779) ^ 839) ^ 999) ^ 342287803) {
                case -1424157919:
                    return 0;
                case 464954083:
                    str = "ۖۙۨ۬ۢ۫ۜۤۦۘۨ۫۠ۧۜۗۢۘۤ۟ۨۖۥۦ۠ۡۢۧۤۧۡۚۜۤۜۥ۬ۦ۬۬ۢۨۖ۠ۛ۠";
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = "ۜۢ۠ۖ۬ۨۘۛۦۦۥۨۘۤۢۙۦۚۡۘۛۖۦ۬ۨ۟ۛۗۜۖۨۜۘۙۚۜۘۡۗۜ۫۫ۡۦۥ۬";
        while (true) {
            switch ((((str.hashCode() ^ 458) ^ 907) ^ 620) ^ 498745745) {
                case -1965744387:
                    parcel.writeString(this.Message);
                    str = "۫ۨۛۚۖ۟ۤۖ۬ۥۨۖۧۡۘ۠۫ۧۤ۟۫۠ۗۥۚۘ۟ۖۢۖۘۘۙۡۢۜۙۙۦ۟ۡ۫ۗ۟ۙۛ۬ۜۦۘ";
                    break;
                case -1688052637:
                    parcel.writeInt(this.Code);
                    str = "ۖۛۥۖۨ۫ۚۥۦۘۦۧ۟ۧ۫ۖۘۤۤۛۤۛۡۚۘۦۘۗۤۨۤۦۗۘۚۖۘۨۖۡۜۗۧۚۘۡۘۢۘۥۘۢۜۗۡۖۚۛ۫ۛ";
                    break;
                case -1041674360:
                    parcel.writeParcelable(this.Data, i);
                    str = "ۡ۟ۢۜۚۘۗ۟ۛۛ۟۠ۥۖۡ۬ۜۡۘۘۖۡۖۖۢۢ۫ۘۛۖۨۘ";
                    break;
                case -732183605:
                    str = "ۘۧۜۘۗۥۥ۫۟ۤ۫ۚۚۢۚۤۢۨ۬۬ۥۘ۫ۛۦ۫۫ۥۥۘ۠ۙۧۜۧ۟ۜۦۘۘ۫ۡۨۘۢۦۥۘۥۥ";
                    break;
                case -97591087:
                    str = "ۜۜ۬ۡۚۧۦۜۛۦ۬ۘۡۥ۠۠ۘۡۦۥۤۘۙۨۘۙ۟ۙۢ۬ۦۘۥۜۚۚ۟ۙۜۢ۫۬ۥۗ";
                    break;
                case 1224367455:
                    return;
                case 1707280023:
                    str = "ۡۥ۟ۚۤۙ۟ۙۖۘۥۢۦۧ۬ۡۘ۠ۤۡ۬ۜۡۘۨۘۘۧۡۥۘ۬ۢۨۘۦۦۛۥۛۜ";
                    break;
            }
        }
    }
}
