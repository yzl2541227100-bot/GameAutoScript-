package com.cyjh.elfin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import p285z2.C4095le;
import p285z2.C4589yr;

/* JADX INFO: loaded from: classes.dex */
public class FileVersion implements Parcelable {
    public static final Parcelable.Creator<FileVersion> CREATOR;
    public int atc;

    /* JADX INFO: renamed from: mq */
    public int f15883mq;
    public int prop;
    public int rtd;

    /* JADX INFO: renamed from: ui */
    public int f15884ui;

    static {
        String str = "ۡۦۜۘۖ۠۠ۧۡۘۦۛ۫ۛۢ۫۟ۙۛۦ۫۠ۥۡۧۘۦ۟ۨۦۦۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 87) ^ 696) ^ 474) ^ (-1200136028)) {
                case 1752221362:
                    CREATOR = new Parcelable.Creator<FileVersion>() { // from class: com.cyjh.elfin.entity.FileVersion.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public FileVersion createFromParcel(Parcel parcel) {
                            String str2 = "۬ۢۤۦ۬ۚۢۤۤۡۨۜۘۛۖۜۨۖۖۘ۫ۗ۟۫ۘ۫ۧۗ۟ۦۦۧ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 716) ^ 802) ^ 969) ^ 150792840) {
                                    case -1494887197:
                                        return new FileVersion(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                                    case 1261722860:
                                        str2 = "ۡۙۦۘۤۨۜۘۘۧۜۘۛۖۨۘ۬ۥۜۘۚۜۦ۠ۧۥ۬۟ۜۘ۬۬ۢۘ۠ۘ";
                                        break;
                                    case 1311646970:
                                        str2 = "۟۬ۤۡۡۖۘۡۨۗ۫ۤۚۘۘۡۖۛۙ۠ۚۜ۬ۥۖۛ۬ۙۥۦۦۘ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ FileVersion createFromParcel(Parcel parcel) {
                            String str2 = "ۖۚ۬ۙۢۡۘ۫ۙ۟ۦۧۜۨۢۗ۟ۗۖۥۧۨۘ۠ۢۡ۠ۜۧۡ۟ۤ۫ۧۖ۬ۗۘۘۤۚۜۘۤۦۦ";
                            while (true) {
                                switch ((((str2.hashCode() ^ C4095le.o00000o0) ^ 164) ^ 419) ^ (-1683725279)) {
                                    case -2119470144:
                                        str2 = "۠ۥۨۘۧۖۙۘ۟ۥۨۦۦۘۨۤ۫ۨۗۖۦۢۢۢۘۘۛۦۘۘۚۥۥ";
                                        break;
                                    case -1412335220:
                                        return createFromParcel(parcel);
                                    case -1367562240:
                                        str2 = "ۜۜۨۗ۠ۜ۠ۙۡۘ۠ۗ۠ۡ۫ۦۖۡۗۦۜۥۘۛۨۘۖۢۡۜۦۥۘ";
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public FileVersion[] newArray(int i) {
                            String str2 = "ۛۙ۬ۖۘۧۘۡۤ۟ۧۙۧۥۦۨۘ۬۟۠ۥۜۦۘ۫ۘۥۘۡۙ۫ۙ۟ۡ۟ۜۦ۬ۡۥۡۜۧۚۤ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 96) ^ 1008) ^ 691) ^ (-1672094560)) {
                                    case -2130684495:
                                        str2 = "۠ۤۡۘۗۨۦ۠ۦۧ۬ۤۨۘۜ۫ۜۘ۠ۘۨۘۛۖۦۧۧۜ۫۫ۦۘۖۜۥ۠ۘۖۘۘۨۡۘۜۦۘۨۢۜۛۢۜۘۜۡۨ";
                                        break;
                                    case -1372649326:
                                        return new FileVersion[i];
                                    case 270752831:
                                        str2 = "ۙۨ۟ۦ۟۠ۖۘۘۛ۠ۖۖۡۥ۠ۖۡۘۤ۬ۖۘۘ۬ۜ۠ۘۤ۟ۥۘۤۨۥۤۤ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ FileVersion[] newArray(int i) {
                            String str2 = "ۛۥ۟۫۟ۚ۫ۨۗۧۨۖۘۘۘۨۘ۫ۦۖ۬ۨۥۘۙ۬۟ۡۥۤۤۚۖۘ۠ۥۥۘۙۚۖۘ۠ۤۨۨۗۖۡۙۘۘۤۗۜ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 191) ^ C4095le.o0000OO0) ^ 501) ^ (-1049870160)) {
                                    case -711057557:
                                        return newArray(i);
                                    case 420728378:
                                        str2 = "ۢ۬ۤۨ۬ۚ۬ۗۨۘۗ۟ۜۘۖۤۨۢۨۚۖۘۚۨۧ۠۬۠ۨۘۚ۫۫۫ۗۜۘ۫۠ۘۘ";
                                        break;
                                    case 1499977846:
                                        str2 = "ۙۗۥۘۤۙۦۜ۫ۥۘ۠ۦۨۜۧۦۘۧ۫ۥۘۢۖۛۖۤۦۘۥ۟ۢ۬۬ۘۘ۟۠ۡۙۚۖۘ۠۟ۛۖۗۘۜۛۦۡۛۘۗۘۙۨۘ";
                                        break;
                                }
                            }
                        }
                    };
                    str = "ۥ۬ۦۘۚۙۢۢۚۦۘۥۚۖۨۥۜۘۦۧۨۡۦۦۘۛۚۘۘۚۨۖۚۤۦۘ۫۫ۢۡۥ۟ۗۛۨۘۘۥۥۘ۫ۛۜۚۙۡۘۛۚۘۘۘۤۚ";
                    break;
                case 2111055478:
                    return;
            }
        }
    }

    public FileVersion() {
    }

    public FileVersion(int i, int i2, int i3, int i4, int i5) {
        this.atc = i;
        this.f15883mq = i2;
        this.prop = i3;
        this.f15884ui = i4;
        this.rtd = i5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        String str = "ۘۙۖۡۧۖ۟ۢۖۚۚۥۘۡۖۘۘ۟ۖۘۘۚۜۦۜۜۨۘۖۢۥۨۜ۟ۧۦۦ۟۠ۘۘۥۥۢۖۗۨ۟ۧۡۥۙ۬۬ۨۘ۠۬۠";
        while (true) {
            switch ((((str.hashCode() ^ 61) ^ 791) ^ 51) ^ (-388801134)) {
                case -1450567138:
                    str = "ۦ۬ۜۡ۫ۚۡۢۤۡۗۡ۬ۨۘۛۧۦۗۘۡۗۤۧ۬۠۫۟ۘۜۘۛۜۧ۫ۙۜۜۥ۠ۢۙۧ۬ۙۚۙۚۚۡ۬ۘۡۜ۠";
                    break;
                case 655579996:
                    return 0;
            }
        }
    }

    public int getAtc() {
        String str = "ۧۜۜۘۥۛۤۜۜۢۖۤۨۘ۫ۛۛۢۙ۬ۚ۟ۙۤۤ۫ۜۡۘۦۧۡۘۘ۠ۨۘۘۥۧۘ";
        while (true) {
            switch ((((str.hashCode() ^ 502) ^ 995) ^ 670) ^ (-1203168313)) {
                case -1782704687:
                    str = "ۘۚۜۘۗۡۥۘۦۨۧۘۘۡۘۤۢۗ۟ۖۡۙۚۥۖۗۗۦۦۙۤۢۤۨ۟ۢۘ۫ۖۘۙۤۘۢۦۤۧۦۙۖۗۧ";
                    break;
                case 499702914:
                    return this.atc;
            }
        }
    }

    public int getMq() {
        String str = "ۘۢۜۘۨۖۨۘۨۘۨ۟ۖۗۧۖ۫ۡ۠ۨۘۡۧۜ۬۫ۡۘۘۘۙۡۧۘۨۢ۟۟ۨۜۘ۠ۧ۬ۤۘۧۤۧ۟ۨۢۡۗ۠ۜۘ۬ۚۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 888) ^ 815) ^ 492) ^ (-374540357)) {
                case -31643131:
                    return this.f15883mq;
                case 985752172:
                    str = "ۢ۠ۗۧ۬ۙۗۤۦۘۖۚۘۘۢۡۜۘۧۖۚۜۢ۫ۧۥۢۦۨۢۖۗ۟ۦۘۡۢۘۗۥۜۖۗۙۛۛۡۦۛۛ";
                    break;
            }
        }
    }

    public int getProp() {
        String str = "۟۠۬ۘ۠ۥۘۛۦۛ۫ۖۥۘۘۜۜۘۗۦۙۜۤۥۘۘۜۚۡۜۖۘۖۛ۠";
        while (true) {
            switch ((((str.hashCode() ^ 108) ^ 620) ^ 590) ^ 94796694) {
                case -728401357:
                    return this.prop;
                case 345406333:
                    str = "ۧۖۘۘۤۗ۠ۥۚ۠ۨۥۥۘ۠ۖۦۦۦ۫۠ۜۥۜ۫ۤۧۦۥۘۧۥۗۦۦ۟۫ۤۖۘۛۤ۫";
                    break;
            }
        }
    }

    public int getRtd() {
        String str = "ۨۚۖ۠ۜۜۘۛۚۦۜۥۨۘۜۥۧۘۘۜۡۘۚۨۖۘۨۧۦۛۤۘۡۥۙۧۙۚۤۘۚۨۥۥۘۡۘۘۙ۫۫ۧۘۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 78) ^ 202) ^ 744) ^ 1324600324) {
                case -318718950:
                    str = "ۛۨۦۘۨ۟ۤۙۢۚۚۢۚۚ۬ۥۘۥۚۡۘۥۚ۠ۦۦۤۢۘۡۤۧۥ";
                    break;
                case 155466488:
                    return this.rtd;
            }
        }
    }

    public int getUi() {
        String str = "۠ۧۦۘۡۡۘۤۗ۫۟ۛۗۚۙ۠ۚۙۚۘۖۙۛۧۖۘۜۥۡۤ۫۟۬ۘۤۗۦۛۙ۬ۡۤۡۥۘۖۤۘۘۙۦۧۛۗۢ";
        while (true) {
            switch ((((str.hashCode() ^ 848) ^ 367) ^ 415) ^ (-1046282544)) {
                case -628163769:
                    str = "ۘۖۡۥ۬ۦۖ۟ۙۤۤۨۤ۬ۥۙۢۖۘ۠ۜۨۘ۟ۡۗۡۜۘ";
                    break;
                case 1593890968:
                    return this.f15884ui;
            }
        }
    }

    public void setAtc(int i) {
        String str = "ۥۘۨۘ۠ۡۜۘۖ۬ۨ۬۬ۡۨۛ۬۠ۜۦۦۘۖ۬ۙ۠ۜۨۖۡ۬۬ۤۗۡ۟ۨۘۖۖۧۘ۟ۗ۫";
        while (true) {
            switch ((((str.hashCode() ^ 993) ^ 690) ^ UiMessage.CommandToUi.Command_Type.GET_TITLE_BACKCOLOR_VALUE) ^ (-944170299)) {
                case 1113387259:
                    str = "ۨۘۤۜۖۧۜۡۚۢۢۙۙۨۙۙۖۢۙ۬ۦۘۢۘۦۘۢۢۖۗ۫۟ۖ۫ۗۚ۫ۘۘۡۡۨۚ۟ۡۘۢۦۘۦۤۖۗۤۥۚۚۡ";
                    break;
                case 1472530912:
                    this.atc = i;
                    str = "ۙۧۖ۟ۜۨۘۚ۫ۜۘ۫ۛ۫ۗ۫ۖۘۨ۠ۨۗ۟ۢ۠ۦۜۘۢ۠ۦۘۖۥۗۖۧۘۜۘۙ";
                    break;
                case 2086855256:
                    str = "۫ۘۛ۟ۙۥۧۨۘۥۘۦۙۢۥ۬ۥۥۗ۟۫۬ۖۦۘۗۖۡۡۙۤ";
                    break;
                case 2130674643:
                    return;
            }
        }
    }

    public void setMq(int i) {
        String str = "ۘۛۘۘۧ۫ۦ۫ۜ۟ۡۗۨ۫ۚۜۚۧۡۘۢۡ۬ۨۘۚ۫ۖۙۖۜ۫";
        while (true) {
            switch ((((str.hashCode() ^ 764) ^ 910) ^ C1801a.f11005aP) ^ (-1109424048)) {
                case -2113089927:
                    this.f15883mq = i;
                    str = "ۖۗۥۘ۬۫ۡۜ۟۫ۘۖۨ۟ۛۤۚۤۦۖۢۧۤۗۚۥۙۥۘ۬۫ۘۜۥۨۙۖۦۘ۫ۗۤۧۡۜ";
                    break;
                case 293373556:
                    str = "ۥۤۡۘۡۖۖۡۘۢ۫ۖ۠ۡۗۜۘۢۜۤۜۡۜۜۗۧ۠ۖۥۦۖ۟ۡۥ۫ۡۚۗۨۧۘۜ۫۠ۨ۠۠۬ۡ۟۟ۢۢ۫ۨ";
                    break;
                case 649442344:
                    str = "ۦ۬ۡۧۧۙۤۖۤۧۧۧ۠ۛ۬۟ۨۜۘۙۘ۠ۢ۟۬۟ۗۜۨۛۜۘۨۚ۟۬ۧ۫ۗۨۦۚۦ۬ۦۢ۠ۦۘۗۘ۟ۗۦۡۘ";
                    break;
                case 1308892540:
                    return;
            }
        }
    }

    public void setProp(int i) {
        String str = "ۥۧ۫۫ۦۜۧۖ۬ۨۘۤۛۜۢۧۗۙۦ۫ۡۜ۠ۧۥۘ۠ۧۧۖ۟ۦۘۛۘۡۘ۟ۗۢ۬ۖ";
        while (true) {
            switch ((((str.hashCode() ^ 939) ^ 376) ^ 64) ^ 1035989968) {
                case -2069390655:
                    str = "۠ۚۜۨۜ۠ۧۦۗ۟۠ۛۧۖۧۘ۬ۜۧۘۙ۫ۗۗۦۥۘۗۖۖۘۛۗۤۨۡۥۥۨۖ";
                    break;
                case -2062111489:
                    return;
                case 157917557:
                    str = "ۡۡ۠ۡۛۨۗۘۖۘۢ۠ۤ۠ۨۘ۬۟ۡۘ۫۠ۤۗۨ۠ۢ۟ۥ۫۟۟۫ۦۦۧۤۢ";
                    break;
                case 195700407:
                    this.prop = i;
                    str = "ۨۚۥۘۢۗۧ۬ۢۡۘۤۨۡۛۘ۠ۘۦ۬ۗۥۙۤۗۗ۟۠ۜۘ۫ۜۡۘ";
                    break;
            }
        }
    }

    public void setRtd(int i) {
        String str = "ۗ۬۫ۜۚۙۡۖۨ۫ۧۗۢۡۙۘۜۜۘۥۢ۫ۧۡۜۘۗ۬ۛۡۗۦ۟ۥۤۡۘۧۤۨۘۙۥ";
        while (true) {
            switch ((((str.hashCode() ^ 622) ^ 970) ^ 576) ^ (-1221870162)) {
                case -690242503:
                    return;
                case -508597030:
                    this.rtd = i;
                    str = "ۛ۬ۚۨۚۜۘۙۜۤۙ۫ۙ۠ۡۚۧۗۘۘۧۡ۠ۚۙۙۡۘۗۦ۬ۙ";
                    break;
                case 942974119:
                    str = "ۥ۟ۥۘ۠۫ۖۘۗۤۜۘۖۘۖۖۧۨۘ۟۬ۨۘۤۡۖۘۥ۫ۗ۫ۢۦۗۙۤ۫۟ۥۘۡۖۡۢ۫ۡۘۦۙۡ۟ۚۥۧۖۗۗۥۦۖۤ";
                    break;
                case 1524580099:
                    str = "ۦۥۦۙۛۥۖۥۤۖۛۦ۟ۘۘۧۗۘ۬ۚۥ۠ۖۘ۫ۛۗۛ۠";
                    break;
            }
        }
    }

    public void setUI(int i) {
        String str = "ۖۨۧۧۗۙۨ۫ۘۘۜۥۚۙۚۖۥ۟۬ۡۜۘۘ۫ۨۦۘۤۥۚۨۛۛۨۨ۬۟ۦۚۛۜۜۘۜۢۖۘۖ۬ۢۦۢۗ";
        while (true) {
            switch ((((str.hashCode() ^ C4589yr.OooO00o) ^ 777) ^ UiMessage.CommandToUi.Command_Type.SET_ENABLED_VALUE) ^ 1054681288) {
                case 283532254:
                    str = "ۗۜۖۘۘۨۤۤ۠۫۠۫۬ۛۥۦۘ۠ۗۚۢۨۦۦۛۖۙۦۘ۬۬ۖۘ";
                    break;
                case 837533769:
                    this.f15884ui = i;
                    str = "ۦۨ۠ۤۘۙۚۜۧۘۦ۬ۚۜ۫ۙۛ۫۠ۢۚۘۘۡۢ۟ۤۨۘۥۛۜۘ۬ۖ۟ۤۙۢۤۘۘۘۛ۫ۥۘ۫ۦۘ۬۬ۘ";
                    break;
                case 850752838:
                    str = "ۡۡۤۤۖۤۙۙ۬ۤۨۖ۫ۛۗۖۢۧۖۘۘۙ۬ۚۨۜۘۛ۟ۡۘۘۨۡۥۢۛ";
                    break;
                case 1955378503:
                    return;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = "ۚۚ۟ۘۦۦۘ۠ۡۤۤۡۙ۫ۛۡۘۨ۟ۡ۫ۨۧۦ۠ۚۖۗۨۘۛۡۗ۟ۨۧۗۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 999) ^ 672) ^ 488) ^ (-1285082511)) {
                case -1750698007:
                    parcel.writeInt(this.prop);
                    str = "ۜۜ۠ۥۗۛۧۡۘۘ۟ۦ۟ۥۥۚۜۦۧۘۗۛۖۦۜۘۜۢۡۢ۟ۜۘ۠ۗۡۘ۟۟ۢۚۦۡۘۢۖۧۘ";
                    break;
                case -1245879770:
                    parcel.writeInt(this.f15884ui);
                    str = "ۘۡۗۤۜۦۘۗ۬ۧۥۥۚۢ۠ۦۘۖۤۗۥ۫ۥۨۘۗۢۗۨۘۙۚۥۘ۠۠ۧۖۧۘۧۜۙ۫۬ۡ";
                    break;
                case -559997196:
                    str = "ۥۡۜۥۥۨۗۛۛۘ۟۫۬ۚۗۗۘۘ۬ۦۜۘۧۦۨۤۧۨۢ۬ۦۗۘۢۛۙۥۘ";
                    break;
                case -288740088:
                    parcel.writeInt(this.rtd);
                    str = "ۨ۬ۥۦۜۗۚۥۧۗۗۥۥ۫ۨۨۗۖۘۗۚۜۘۛۤۘ۠ۖ۟۠۠ۙۙۡۤۙۢۨۗۧۢۧ۫ۜۘۡ۠ۘۘ۬۫ۖۘ";
                    break;
                case -280741323:
                    str = "ۦۡۦۖۦ۬ۚۘۦۘۤۦۚۗۙ۟ۗۢۘۘ۬۫ۘۧۥۘۘۚۛۢۡۖ۠ۨۦۨۧۡ";
                    break;
                case 777870370:
                    parcel.writeInt(this.atc);
                    str = "ۥۚۖۧ۬ۜۢۦۥۘۡۖ۬ۥۤۘۘ۫ۨۘۢ۫ۧۦ۟ۡۘ۬ۛۜۘۚۧۜۖۙ۠۠ۜۗۜۤۖۘۛۧۜۧۗۜۨۨۙۧ۫ۧۢۢ۠";
                    break;
                case 1064379956:
                    parcel.writeInt(this.f15883mq);
                    str = "ۜۤۦۚۧ۬ۖۧۘۢ۠۫۬ۤۥ۠ۧۙۡۨۥۡۡۚۡۦۦ۟ۦ۫ۙۧ۬ۦۙ۬ۚۖۥۘۜۖۦ";
                    break;
                case 1183094695:
                    return;
                case 1316063722:
                    str = "ۢ۠ۡۜ۠ۜۚۖۧ۟ۙ۟ۜۗۢۙۙ۬ۜۧۡۘۗ۬ۦۥ۫ۜۘۧۡۡۘۡۢۜۦۜۧۧۨۧۜۛۨۘ۫ۖۦۙ۫";
                    break;
            }
        }
    }
}
