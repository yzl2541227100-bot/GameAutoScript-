package com.cyjh.elfin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import p285z2.C4095le;

/* JADX INFO: loaded from: classes.dex */
public class RootRelatedEntity implements Parcelable {
    public static final Parcelable.Creator<RootRelatedEntity> CREATOR;
    public String Code;
    public RootRelatedData Data;
    public String Msg;

    public static class RootRelatedData implements Parcelable {
        public static final Parcelable.Creator<RootRelatedData> CREATOR;

        /* JADX INFO: renamed from: Id */
        public String f15886Id;
        public String Image;
        public String PackageName;
        public String Path;
        public String ScriptName;
        public String Type;

        static {
            String str = "۠ۨ۫ۦۦۧۘۧۧۢۧۢۗۙۘۚ۟ۥۘۦۥۙۚ۟ۨۢۛۤۖۙۜۘۚۖۦۛۘ۬ۜۡۖۥۢۧۘۗۘۗ۠ۦۘ۬ۡۥۧ";
            while (true) {
                switch ((((str.hashCode() ^ 997) ^ 422) ^ 973) ^ 386738133) {
                    case -1903039722:
                        return;
                    case -1649700470:
                        CREATOR = new Parcelable.Creator<RootRelatedData>() { // from class: com.cyjh.elfin.entity.RootRelatedEntity.RootRelatedData.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public RootRelatedData createFromParcel(Parcel parcel) {
                                String str2 = "۬ۙۢۧۥ۫ۥۥۛۥۤۖ۫ۖۚۚۚ۠ۘۥۖۦ۟ۦۡۖۘۘۧۜۦۤۜۜۨۛۘ۬۬ۦ";
                                while (true) {
                                    switch ((((str2.hashCode() ^ 993) ^ 974) ^ 29) ^ 1929165980) {
                                        case -440326734:
                                            return new RootRelatedData(parcel);
                                        case 599126332:
                                            str2 = "ۢۤ۫۟۬۫ۜۗۡۘۙۘۜۘ۬ۥۙۗۡۚۢۘۢۛۨۘ۫ۚۙۗۧۛۗۨۨۨۢۥۦۖۘۖۗۖ۬ۜۙۛ۫ۡ";
                                            break;
                                        case 1673844053:
                                            str2 = "۠ۛ۟ۨۦۨۘ۟ۘۧۨۢ۬۫ۥۜۧۘۨۛۡۘۦۛ۫ۧۛ۠ۚۗۦۢۤۦۘ۫۟۬۫۟ۥۘۨۦۥۘۖ۫ۦۘۥۧۡۘۤۦۖۘۦۗۡۘ";
                                            break;
                                    }
                                }
                            }

                            @Override // android.os.Parcelable.Creator
                            public /* bridge */ /* synthetic */ RootRelatedData createFromParcel(Parcel parcel) {
                                String str2 = "۫۠ۜۤ۬ۥۖۚ۠ۧۜ۬ۛۦۛ۬ۛۦۘۧۢۥۧ۟ۤۖ۟ۛۢ۬";
                                while (true) {
                                    switch ((((str2.hashCode() ^ 64) ^ 510) ^ 73) ^ 1299216880) {
                                        case -244807491:
                                            str2 = "ۘۢۖ۫ۡۥۛۢۜ۫ۤۦۨۥۦۘۙۗۖۘۗۚ۟۠ۥ۠ۢۗۡۡۖۥۖۥۨۘۙۨ۬";
                                            break;
                                        case 1242527894:
                                            str2 = "ۨۛۙۘۨۨۘۡۚۖۥۜۡۘۨ۬۫ۡۜ۬ۢۥۜۘۜۡۚ۫ۨۨۡۡۨ";
                                            break;
                                        case 1486996803:
                                            return createFromParcel(parcel);
                                    }
                                }
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public RootRelatedData[] newArray(int i) {
                                String str2 = "ۢۗۗۦ۫ۦۖۙۜۜۥۧۥ۫ۜۛۖۨۨۨۘۛۘۛۡۚۥۦۗۡۜ۫ۦۘۡ۟ۦۘ۟ۜۥۘ۟ۛۦۥ۬ۛۤۘۦۘ";
                                while (true) {
                                    switch ((((str2.hashCode() ^ 577) ^ 234) ^ 854) ^ (-949271306)) {
                                        case -1152149296:
                                            str2 = "ۤ۫ۙ۟ۖۛۡۙۦۘ۠۫ۡۢ۫ۦۘۙۥ۟۫۬۠ۢ۟ۨۛۗۖۧۤۘۗۘۥۙۙۙۗ۠ۧ۟ۚۜۘۚۚۜ۟۟";
                                            break;
                                        case 848544588:
                                            return new RootRelatedData[i];
                                        case 1278711101:
                                            str2 = "ۙۖۡۜۗۡۡۘۘۨۘۡۖۤۢۤۖ۫ۖۘۨۥۨ۟ۙۖۢۗۛۖۘۧۚۙ۫۬۬۬ۙۢ۠ۨۜۗ۬ۥۘۖۘ۟ۥۚۛۚۢ";
                                            break;
                                    }
                                }
                            }

                            @Override // android.os.Parcelable.Creator
                            public /* bridge */ /* synthetic */ RootRelatedData[] newArray(int i) {
                                String str2 = "ۘۚۦۤۘۘۢۨۨۡ۠ۘۢۖۥۥۗۨۘۖۛۥۘۖۗۦۛۡۨۤۤۧۥۤۢۢۜۛۦۚ۬۫ۡ";
                                while (true) {
                                    switch ((((str2.hashCode() ^ 16) ^ 372) ^ 482) ^ 1337574666) {
                                        case -1407243012:
                                            str2 = "ۗۙۨۘۥۖۧۡۙۧ۟ۜ۠۟۠ۥۜۦۧۛۤۤۜۜۜۨ۟ۧۖۥۤۨۙ۠ۛۗ۫۟ۘۘۢۧۤۢ۠ۜۘۤۘۖۢ۠ۘ";
                                            break;
                                        case -1072249738:
                                            str2 = "ۤۥۜۘ۟ۖۗ۠ۧۨۘۡۤۡ۠ۗۡۘ۫۠ۚۦۘۥۥۡۧۤۖۘۘۤۗۥۛ۬ۡۘۖۚۥۡۛۥۙۥۗۛ۠ۦۡ۟ۘۘ۬ۧۘۚ۟ۗ";
                                            break;
                                        case 1441899173:
                                            return newArray(i);
                                    }
                                }
                            }
                        };
                        str = "ۙۗۜۘۛۨۜۘۨۙ۠ۖۧۘۘۨۤۖۤۡ۠ۖۦۧ۠ۖۛۖۚۥ۟ۨۥۘۚۘۘۤۜۘۢۤۜۘ";
                        break;
                }
            }
        }

        public RootRelatedData(Parcel parcel) {
            this.f15886Id = parcel.readString();
            this.Type = parcel.readString();
            this.Image = parcel.readString();
            this.Path = parcel.readString();
            this.PackageName = parcel.readString();
            this.ScriptName = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            String str = "۠ۦۦۘ۠ۗۘۧۜۜۘ۬ۡۙۛۗۗۨۚۥۙ۟ۛۡۙۛۙۦۢ۟ۨۖۧۥۘ۠ۥۘۜۙۖۦۖۧ۬ۡۙۗ۫ۦ";
            while (true) {
                switch ((((str.hashCode() ^ 755) ^ 226) ^ C4095le.o0000O00) ^ 635035269) {
                    case 902439678:
                        return 0;
                    case 1130373195:
                        str = "ۤۖۤۘ۬ۘۘ۬ۖ۬ۚۖۜۚۥۡۘ۟ۛۧ۬۟ۦۘ۫۟ۖۘۚۧ۬ۢۜۘ۟ۦۧۘۛ۠ۙۗ۟ۘۘۧۨۦۘ";
                        break;
                }
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            String str = "ۜۢۢۧۥ۫۟۬ۤ۟ۤۢۥ۫۠ۤ۟ۥۥۚۜۖۡۥۘۜ۠ۥۦۗۖۦۘۜۦ۠ۥۦۙۡۧ";
            while (true) {
                switch ((((str.hashCode() ^ 393) ^ 858) ^ 200) ^ 1744487184) {
                    case -1839378264:
                        parcel.writeString(this.Path);
                        str = "ۦۢۤ۬ۧۨۘۡ۟ۖۦۧۨۘۛۙۡۖۤ۟ۙۗۗ۬ۚۡۦۗۦۘۜۥ۟ۤۡۢۖۢۜۘۧۖۥۘ۟ۜۚۗۜۖۨ۫ۦۜ۠ۜۘ۫۫ۨۘ";
                        break;
                    case -1100616606:
                        parcel.writeString(this.Image);
                        str = "۬۟ۥۘۡۛۚ۬۟۟ۚۖۢۤۦ۟ۡۗ۠۬ۧۜۘۗۗۨۘۗۙۜۘۥ۬۬ۢ۠ۢۦۤ";
                        break;
                    case -623113746:
                        parcel.writeString(this.PackageName);
                        str = "ۖۘۗۜۦۥۤ۬ۨ۠ۤۧۨۢۥ۬ۨۙ۠ۤۥۢۖۜۘۛۢۘۘۤۜۜۘۥ۬۬ۛ۠ۦ";
                        break;
                    case -337917737:
                        str = "ۦۨ۬ۧ۫ۤۢۨۘۘۜۖ۟ۙۜۨۘ۠ۥۘۚۘۧۘۥۗۧۡۦۖۘ۟ۜۙۥۘۦۢۦۤ۫ۥ۫۬ۥۘ";
                        break;
                    case 226298534:
                        parcel.writeString(this.ScriptName);
                        str = "ۡۦۥۘ۟۫ۜۦۛۘ۫ۡۦۘۧۧۗۢ۠ۥۘۜۨۤۜۚ۠۟ۥۖۖ۟ۤۧۦۙۡۢۗۚۙۘ۫ۢۖۘ۟ۢ۟ۜۢ";
                        break;
                    case 824163690:
                        str = "ۨ۠۫ۤۡۜۘ۠ۖۦۨۧۙۘۗۢۗ۬ۦۘۖۥۥۥ۟ۢۙ۬ۦۨۡۡۘۧۙۥۘۗۦۡ۫۟ۥ۬ۜۘۜۗۦ۫ۥ۠";
                        break;
                    case 987773523:
                        parcel.writeString(this.f15886Id);
                        str = "۟ۧۚۨۢۛ۬ۨۘۧۤۘ۟ۨۤۛۢۜ۫ۘۧۧ۫۬ۧ۬ۛۛ۫ۥۘۡۨۤۗۙۘۘۤۖۗۛۡۡۘ";
                        break;
                    case 1690718333:
                        return;
                    case 1857362089:
                        str = "ۘ۫ۛ۫ۨ۠ۨۘ۫۠۟۠ۙ۫ۘۘۖۖۧۘ۬ۤۥۘ۫ۦۧۨۜۥ۠ۨ۬ۦۨۖۘ۟ۢ۟ۦۖۚۦۥۘۤۗۨۧ۟ۖۘ";
                        break;
                    case 1936971405:
                        parcel.writeString(this.Type);
                        str = "ۦ۠ۦ۠۬۬ۛۙۨۘۙۡۤۜ۟ۦۘۜۧۖۜ۬ۛ۟ۙۨۤۗۘ۠ۗۢۦ۟ۡۛۧۥۦۜۡۧۛ";
                        break;
                }
            }
        }
    }

    static {
        String str = "۬ۤۛۦ۟ۦۤۗۘۛۦۤ۬۫ۡ۠۫ۡۘۦۗۨۗۦۘۘۡۤۦۗۧۨۘۗۙۤ۬ۢۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 628) ^ 169) ^ 810) ^ 1250060164) {
                case -1580018881:
                    CREATOR = new Parcelable.Creator<RootRelatedEntity>() { // from class: com.cyjh.elfin.entity.RootRelatedEntity.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public RootRelatedEntity createFromParcel(Parcel parcel) {
                            String str2 = "۬ۙۥۘۥۦ۫ۘۥۢ۬ۛۨ۫ۦۗۚ۫ۦۘۗۥۡۛۗۨۤۢۜۘۢۡۡۘۦۨۢۘۘ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 810) ^ 512) ^ 248) ^ 1411486864) {
                                    case -648952924:
                                        str2 = "۟ۥۚۜۘۢۖۘ۠ۗۨ۟ۖ۠ۛۗۚ۫ۗۛ۠ۜ۟ۚ۟۠ۨۤۖۘۥ۬ۨۛۘۜ";
                                        break;
                                    case -409016840:
                                        return new RootRelatedEntity(parcel);
                                    case 1937680659:
                                        str2 = "ۡۙۜۜ۟ۦۨۡۜۘ۬ۗۥۘۡۤ۫ۤۦۘۘۢۤۡۘۥۗۦۘۦۤۦۘۛۘۡۘۘۚۦ۬ۦۜۦۢۚۗ۠ۙۚ۠ۢۥۤۙۘ۬ۢۡ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ RootRelatedEntity createFromParcel(Parcel parcel) {
                            String str2 = "۬ۙۚۙۗۜۢۨۥۜۜۘۤۤ۫ۥۧۛۗۘۘۨۡۧۘۛۥۥۘۨ۟ۦۘۖۜۜۡۙۘ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 857) ^ 676) ^ 752) ^ (-12774655)) {
                                    case -1615802829:
                                        str2 = "۟ۚۢ۟ۥۥۦۙۥۘۡ۠ۤۖۙۢۦ۬۟ۚۜ۬ۘ۫۠۠۟ۨ۬۫ۙ۬ۗ۟۠۟ۢۧۥۘۘ۬۬";
                                        break;
                                    case 663161166:
                                        return createFromParcel(parcel);
                                    case 863701013:
                                        str2 = "ۡۘۦۖۦۛۙۦۦۨ۠ۨۘۥۦۛۦ۫ۘ۟ۤ۠ۡۦۦۗۨۜ۬ۤ";
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public RootRelatedEntity[] newArray(int i) {
                            String str2 = "ۨۘ۠۬ۨ۠ۗ۬ۖۤۗۦ۬۬ۚۤۛ۫ۗۡۘۨۘ۬۠۟ۥۘ۟ۨۧۘۗۛۙۧۙۡۘۥۧۧۗ۬ۥۨۚۥۦۘۡۧۛۦۨ۟ۘۘ";
                            while (true) {
                                switch ((((str2.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_SIZE_VALUE) ^ 473) ^ 535) ^ 1567783115) {
                                    case -635012320:
                                        str2 = "۟۟ۢ۫ۙۙ۟ۧۡ۫ۡۦۘ۠ۡۥۘۚۖۢۢۜۖۢۨۘۤۦۘ۫ۤۗۦ۠ۙۖۤ۬ۛۚۦۘۤۤۜۘۢۢۥۘۙۧۨۘ۠۫ۙ۫ۢۥۘ";
                                        break;
                                    case 386315153:
                                        return new RootRelatedEntity[i];
                                    case 1652580684:
                                        str2 = "ۡۚ۬ۨۢۘۘۤ۟ۦۘۚۢۤۧۗ۟ۗ۬ۚ۟ۙۨ۫ۥۥۘ۟ۙۢۗۡۘۥ۠ۖۘۛۥۖۘ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ RootRelatedEntity[] newArray(int i) {
                            String str2 = "ۘ۠ۜۖۛۨۘ۫ۘۦۘ۠ۜۦۘۧ۬ۡ۬۟۫ۗ۟ۙۦ۠ۡۘۤۙ۫ۡۦۦۜۡۥۛۤۘۘۢۛۡۖۡۤۛۙ۬۟ۨۥ۟۠ۚۗۧۘۘ";
                            while (true) {
                                switch ((((str2.hashCode() ^ UiMessage.CommandToUi.Command_Type.GET_TEXTCOLOR_VALUE) ^ 897) ^ 997) ^ (-1390193955)) {
                                    case 25395843:
                                        return newArray(i);
                                    case 1458257998:
                                        str2 = "ۧ۠ۥۡۙۡۘۗۡۨۢۥ۠۟ۦ۬ۡۙۥۘۨۗۚۖۡ۠ۚ۠۠ۖۜۘۧۡۧۘۤۗۡۘ";
                                        break;
                                    case 2093311634:
                                        str2 = "ۦۨۧۦۖۧۘ۟ۤ۫ۨۚۤۘ۟ۧۛۜۜۘ۠ۧۡۨۥۡۚ۠ۥۨۢۤ";
                                        break;
                                }
                            }
                        }
                    };
                    str = "ۚ۬ۧ۬ۜۦۘۜ۬ۖۘۧ۟ۥۘ۬ۚۦۘۘ۠۫ۨۤۙ۬ۤۥ۟ۤۥۘۜۘۨ";
                    break;
                case 974194406:
                    return;
            }
        }
    }

    public RootRelatedEntity(Parcel parcel) {
        this.Code = parcel.readString();
        this.Msg = parcel.readString();
        this.Data = (RootRelatedData) parcel.readParcelable(RootRelatedData.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        String str = "ۦۜۘۘۢۚۘۖۜ۟ۘ۠ۨۤ۫ۡۘۚ۠ۢۤۗ۬ۤۦۙ۫ۚۥۘۘ۠ۧۗۘ۠۟ۖ۫ۨۜۧۘۨۤۗ";
        while (true) {
            switch ((((str.hashCode() ^ 594) ^ 845) ^ 331) ^ 1278787328) {
                case -1089168965:
                    str = "۠ۙۥۘۘۛۗۘۜۧۘۙۧۘۖ۬ۙۧۧۘۘ۬ۖۦۙۙۖۘۘۘۚ۟ۛۜ";
                    break;
                case 184531354:
                    return 0;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = "ۙۢۦۘ۠ۜۤۦۘۖۘۨۗۦۥ۬ۥۘ۠ۗۧۧۛۥۘۧۨۚۦۥ۠۠۫ۖ";
        while (true) {
            switch ((((str.hashCode() ^ 441) ^ 807) ^ 643) ^ 730631035) {
                case -1932022935:
                    str = "۠ۦۤ۫۬ۥۘۜۖ۠ۗۡۧۘۙۜۖ۫۫ۘ۟ۢ۬ۜۗۥۨۧۛۙۖۜۘۛۖۥۘۜۗ۠۬ۚۚ۬۟ۘۙ۬۬ۢۡ۠۫ۦ۟ۥ۫ۜۘ";
                    break;
                case -1710306872:
                    return;
                case -1176466616:
                    parcel.writeString(this.Code);
                    str = "ۖۧۧۖ۬ۢۚۗۘ۫ۚۦۘ۟ۗۡۛۜۘۨۢۚ۠ۚ۬ۗۨۦۘ۠ۗۘۘۦۙۨۡۨۦۘۡۢ۫ۖۗۥۘۡۡ۫ۧۚۥۘ";
                    break;
                case -1129311830:
                    str = "ۡۖۛۡۢۢ۠ۦۘۘۥۥۘۜ۬ۨۧ۟ۜۘ۫۬ۡۛۘ۫ۚۛۖۘۘ۟ۖۘ";
                    break;
                case -1083123270:
                    str = "ۗۚ۬ۨۙۨ۬ۨۖۘۙۚۦۢۗۜۙۘۘۤۛۨۘۡۛۥۘۘۖۧۘ۠ۡۛ";
                    break;
                case -457929081:
                    parcel.writeString(this.Msg);
                    str = "ۡۛ۠۫ۨۖۖۡۦۧۤ۫ۢۚ۬۬ۚۛۛۜۦ۠۟ۛۙۤۨۘۧۗۥۘ";
                    break;
                case 329523634:
                    parcel.writeParcelable(this.Data, i);
                    str = "ۡۡۖۚ۫ۘۨۦۘۢۖۛۨۥۙ۠ۜۧۘۤۨۢۜۖۗۛۘۤۦۘۘۡۤۘۘۖۘۨۘۨۡۖۘۦۙۖۘ";
                    break;
            }
        }
    }
}
