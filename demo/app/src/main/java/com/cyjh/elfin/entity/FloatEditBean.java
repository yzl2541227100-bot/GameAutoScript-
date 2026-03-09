package com.cyjh.elfin.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;

/* JADX INFO: loaded from: classes.dex */
public class FloatEditBean implements Parcelable {
    public static final Parcelable.Creator<FloatEditBean> CREATOR;
    public String intentContent;
    public String intentTtile;
    public boolean isCancle;
    public String leftContent;
    public String rightContent;
    public ActionBarOperaEnum type;

    static {
        String str = "ۤ۫ۨۘۦۛۘۘۥۜ۠ۨۢۤۙ۫ۘۜۦۙۖ۠ۖۘۜۗۥۖۙۦۘ۬ۦۢ";
        while (true) {
            switch ((((str.hashCode() ^ InterfaceC2174a.f13808L) ^ 428) ^ 352) ^ (-81103665)) {
                case -828484531:
                    return;
                case 1357217265:
                    CREATOR = new Parcelable.Creator<FloatEditBean>() { // from class: com.cyjh.elfin.entity.FloatEditBean.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public FloatEditBean createFromParcel(Parcel parcel) {
                            String str2 = "۟ۧ۠ۨۢۧۜۦۢۦۖۨۢۜۜۘۜۙ۠ۨ۠ۥۘۥۤۖۢۗۨۗۛ۟ۤۤۙ۫ۙۜ۫۬ۚۗۢۥۘۖۗۚ۟ۨۚ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 318) ^ UiMessage.CommandToUi.Command_Type.SET_FW_IMAGE_VIEW_VALUE) ^ 244) ^ 397629593) {
                                    case -68769045:
                                        return new FloatEditBean(parcel);
                                    case 33038854:
                                        str2 = "ۦ۬ۘ۫ۧۤۦۖۧۦۜۛۙ۟ۥۘ۫ۚۚۗۥ۬۬ۧۧۘۙ۫۟ۧۦۘۤۜۘۢۡ۬ۘۢ۠۟۟";
                                        break;
                                    case 1959771124:
                                        str2 = "ۡۘۘۛۚۨ۟۠ۦۜ۫ۥ۠۬۠ۛ۟ۨۡۜۧۥۘ۟ۖۘۘ۠ۚۢ۬ۗۥۘۦ۬ۥ۠ۖۘۘۖۧ۠ۜ۫ۜۖۨۘ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ FloatEditBean createFromParcel(Parcel parcel) {
                            String str2 = "ۤ۟ۨۘۜ۟ۨ۫ۥۥۚۦۘۘۢۜۡۧۛۘۙۢۖ۫۟ۗ۠ۜۧۘۙۨۨ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 581) ^ 879) ^ 545) ^ 2098417942) {
                                    case -1294006175:
                                        str2 = "۬ۗۤۢۧ۬ۧۢۘۘۡ۠ۘۙۜۦۘۛۢ۠ۦۥۢ۠ۨۛۙۘۜۘ۠ۙۥۘ";
                                        break;
                                    case -801329482:
                                        str2 = "ۙۙۡۘۥۚۨ۬ۗۨۘۢ۟ۦۘۜ۬ۖۛۤۡۘ۟۟ۖۙۥ۠ۢۥۘۘۦ۬ۡۘۨۧ۠۬ۗۢ۟ۧۖۘ۠۬ۥۘۛۤۢ۠ۙۨ۫ۙۘۥۦ";
                                        break;
                                    case 298502757:
                                        return createFromParcel(parcel);
                                }
                            }
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public FloatEditBean[] newArray(int i) {
                            String str2 = "ۥۙۘۘ۠ۙۦۘ۟۬ۡ۬ۨ۟ۨۧۘۘ۠ۦۜۢۛۘۚۙۦۙۨ۠ۥۗۚ۫۫۟۟۬ۛ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 600) ^ 729) ^ 934) ^ (-2011159504)) {
                                    case -2018469828:
                                        return new FloatEditBean[i];
                                    case -950061952:
                                        str2 = "۬۟ۡۦۗۖۘ۟ۥ۟۟ۦۚ۫ۜۥۚۘۜۛۛۖۨ۟ۗۖۤۢۤۗ۟ۗۜۡۘۢۨۢۤۧۦۗۛ۬ۦۜۢۚۧۗۦۦۘ۬ۦۘ";
                                        break;
                                    case 424205717:
                                        str2 = "۬۬ۤ۫ۦۙۦۗۛۡۛۗۡۜۗۘۖۤۦ۟ۛ۫۠ۦۘۚۗۙۡ۬ۗ۬۫ۦۘۖۥۦۦۜۙۡۜۧۘ";
                                        break;
                                }
                            }
                        }

                        @Override // android.os.Parcelable.Creator
                        public /* bridge */ /* synthetic */ FloatEditBean[] newArray(int i) {
                            String str2 = "ۤۙۜۥۙۨۥۚۖ۫۠ۖۘۖۜۘۖۛۘۚۤۢۜۚۜۘۨ۠ۨۘۤۡ";
                            while (true) {
                                switch ((((str2.hashCode() ^ 116) ^ 510) ^ 271) ^ 1988439241) {
                                    case -1778128281:
                                        str2 = "ۤ۠ۡۛ۫ۨۗۗۧۤ۬ۖۗۙۨۘۤۘۙۤۨۘۜۙۗۧ۠ۘۜۨ";
                                        break;
                                    case -472978354:
                                        return newArray(i);
                                    case 931157280:
                                        str2 = "ۗۥ۬ۖ۫ۙۤۗ۫ۤۗۨۜۜۨۘۛۜۘۘ۠۫ۙۧۛۦۘۢۨۙۦۜۘۙۨۡۤۤۥ";
                                        break;
                                }
                            }
                        }
                    };
                    str = "ۙۡۜۘۚۘۧۘ۠ۗۘۘۘۖۨۘۦۡۡ۬ۗۜۜۘۥۙۡۘۛۨۢ۟ۤۢۦۖ۟۟ۘ۫ۡۙ۬ۥۧۘ";
                    break;
            }
        }
    }

    public FloatEditBean() {
    }

    public FloatEditBean(Parcel parcel) {
        boolean z;
        ActionBarOperaEnum actionBarOperaEnum;
        this.intentTtile = parcel.readString();
        this.intentContent = parcel.readString();
        this.leftContent = parcel.readString();
        this.rightContent = parcel.readString();
        String str = "۬ۤ۟۬ۜۜۤۧۙۦۚۛۖۦۚ۬ۢۥۘۡۧۡۥۦۜۡ۠ۚ۟ۢۘۘ۠۠ۙۘۘۥ";
        while (true) {
            switch (str.hashCode() ^ 1031386440) {
                case -1007183129:
                    z = true;
                    break;
                case -843282873:
                    str = "۬ۥ۠ۙۖ۟ۛۦ۫ۗۘۥۜۜۘ۟ۖۗۗۜۦۘۖۧۦۨۡۨۜۦۜۧۘۤۤ۠۟۫ۤ۫ۜۡۗۢۤۦۧۖۘۢۜۙۦۥ";
                    continue;
                case -228157691:
                    String str2 = "۠۫ۡۚۘۘ۠ۘۘۤۤۗۗۛۛۚۛۨۘۙۡۧۘۢ۬ۦۢ۫ۥۛ۫۠ۧۡۧۘۗۥۚ۠۟ۜۜۨۜۘۚ۬ۜۘۙۗۘۚۜ۟۟ۨ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 1616827206) {
                            case 192517717:
                                str = "ۡۘۗۧۦۦۨ۫ۜۘۛۥۗۨ۠ۘۘۨۚۗۥ۬ۦۡۗۙۖ۟ۢ۫ۘۡۤۜۡۘۢۧۘۚۙۦۨۘۘۘۘۘ۫ۛ۠ۧ";
                                continue;
                                continue;
                            case 356014686:
                                str = "۠۟ۘۘۥۥۧۘ۠ۗۡۜۘۘۢ۬۟ۢ۫ۥۘۡۘ۟ۘۚۨۘ۬ۗۗۨۜۘ";
                                continue;
                            case 1283369169:
                                str2 = parcel.readByte() == 0 ? "ۨ۫ۦۨ۟۬۫ۤۘۧ۟ۙۘ۟۬ۧ۠ۥۦ۫ۘۧۘۘ۬ۢۜۘۥۘ۫ۢۦۜۨ۟" : "ۢۗ۟ۦۧ۠ۛۧۥۘ۠ۡۖۨ۬ۥۘۛۢۧۚۘ۬۠۠ۨ۫ۖۜۘۛۢۨ۠ۨۨۘۡۧۤۚ۬۬ۛۢۜۘ";
                                break;
                            case 1337389801:
                                str2 = "ۡۧۜۗۥۖۘۢۨۤ۠ۥ۟۫ۤۜۘۤۨۧۘۥۧۛۡ۫ۜۘۦۙۢۙۚۚۗ۬۬ۦۨۘۡۥۜۘۨۘۚۗ۫ۚ۫";
                                break;
                        }
                    }
                    break;
                case 1518066987:
                    z = false;
                    break;
            }
        }
        this.isCancle = z;
        int i = parcel.readInt();
        String str3 = "ۘ۬ۦۘۛۚۦۗۨۘۤ۬۫۟ۦۚۚۦۖ۫ۜ۬ۡۚۖۨ۫۠۬۫ۙۥۚۤۗۜۖۘ۫۬ۗ۠ۥۘۨۖۧۗۚۥۥۢۢۜۛۧ";
        while (true) {
            switch (str3.hashCode() ^ 712141041) {
                case -1505767953:
                    actionBarOperaEnum = null;
                    break;
                case 1426805117:
                    String str4 = "ۚ۟ۘۧۢۖۚۜۘۘ۫ۤۘۘ۬ۗۜۧۚۧۡۧ۠۬ۖۘۖۖۗۙۗ۫ۚۦۨۨۚۦۘۢۢۖۘۗۢۡۘ۠ۖۘ۠۟ۜۖۗۤۨۛۤ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1205095000)) {
                            case -489322666:
                                str3 = "ۥۙۜۙۡۘۦۢ۟ۧ۬ۖۘۛۧۗۢۙۨ۠ۨۥۥۧ۫ۦۦۡۘ۟ۨۦۘۖۘۜۘۗۧ۬ۜۛۢۢۙ۟۟ۡۘۧۙۙ";
                                continue;
                            case 160071413:
                                str4 = i != -1 ? "ۥۘۤۦۘۥۧۦۢۡۡۛ۫ۜۦۘۡۨۚ۬ۤۙ۟ۦۤۙ۟ۡۛۥۦۘ۟ۥۧۡۛۤۛ۫ۚۖۨ۬" : "ۘۤۗۦۤ۟ۨۡۘۘۥۚ۟ۜۨۘۖۦۙ۟ۜ۠ۜۚۦۘۤ۠ۨۧۘۡۘۧ۬۫۠ۦۢۚۢۢۦۧۘۤۚۦۘۢۥۙ";
                                break;
                            case 1148090346:
                                str4 = "۫ۘۥۘۘۘ۬ۘ۠ۧۙ۟۠ۦۚۡۙ۠ۨۘۨۙۙ۠ۡۛۚۥۛ۟ۦۘ۫ۧۡۜۥۛۚۦۗۨۢۤۦۨ۠ۤۖۜۘۨۦۢۥۢ";
                                break;
                            case 1738435865:
                                str3 = "۬ۜۚۧ۬ۨۘۦۨۦۖۥۘۧۢۤۛۦۥۘۥۖۚۖۘۛ۫۠ۡۘۗ۫ۨۘ۫ۛۦۖ۟ۗ۫۟۠۬ۙۖۘۖۖۦ۟ۨۜ";
                                continue;
                        }
                    }
                    break;
                case 1469893084:
                    str3 = "ۨ۠ۦۛۢ۠ۚۙۡۧۜۤ۟ۨ۫ۙۙۚ۠۬ۙۧ۬ۥۘۨۥۚۧ۫ۦۨۘ۠ۘۤ۫ۤۛۤۧۡ";
                    break;
                case 1714498687:
                    actionBarOperaEnum = ActionBarOperaEnum.values()[i];
                    break;
            }
        }
        this.type = actionBarOperaEnum;
    }

    public static FloatEditBean getDeleteFloatBean(Context context, String str) {
        FloatEditBean floatEditBean = null;
        String str2 = "ۢۚۡۧ۠ۜۘۗۜۘۘ۬ۛۨۘۨۧۡۘۛۡ۬ۛ۫ۨۘۢۧۦۜۗۗۤۙۦۧ۬ۘۘۛ۠ۖ";
        while (true) {
            switch ((((str2.hashCode() ^ 144) ^ 317) ^ 812) ^ (-884756085)) {
                case -2135085671:
                    floatEditBean.intentContent = str;
                    str2 = "ۢۚۜ۟۠ۡۘ۠ۥۥۦۜۜۚۡۘ۟ۗۡۘۤۛ۠۠ۛۦۘۛۧۚ۟ۗۙۖۛۚ۠ۦۖۙۨۥۥۘۖۖۖۥۘۧۛۘۘۜۡۧ";
                    break;
                case -1624259939:
                    floatEditBean.type = ActionBarOperaEnum.DELETE;
                    str2 = "ۖۥۗ۬۬ۥۚۖۢۛۛۗۦۙۘۨۢۡۘۛۚۦۖۘ۠ۛۖۘ۠ۨۥۘۗۧۖۜۥۡۨۦۘۘۚ۫ۥ";
                    break;
                case -871842303:
                    return floatEditBean;
                case -787186503:
                    floatEditBean = new FloatEditBean();
                    str2 = "ۖۛ۬ۗۧۦۧۜۢ۬ۧۦۤۗ۟ۢۘۧۘ۟ۚۘۘۖۡۚۛۗ۬۫ۡ";
                    break;
                case -701746286:
                    floatEditBean.intentTtile = context.getString(R.string.menu_delete);
                    str2 = "ۤ۠ۦ۬۬ۢۡۖۡۘ۫۟۫ۛۖۚۘۤ۫۠۫ۛۖۙ۟ۦ۫ۧۖۜۘۥۛ۬ۡۤۤۛ۟ۤۘۚۛ";
                    break;
                case 37802594:
                    floatEditBean.leftContent = context.getString(R.string.btn_cancle);
                    str2 = "ۖۦۖۢۗۘۖۛ۬ۖۧۙۙۖۦۘۖۚۥۘۗۤۚۘۨۛۖۗۚۘۧۛۘ۟ۧۤۘۥ۠ۜ۠ۨۜ۠ۡۨۤۦۦۜۘۨۦۘۘۛۨۘۘ";
                    break;
                case 669979790:
                    str2 = "ۢۧۙۛۘۘۖۜۖۘۚۦۜ۬ۚۦۧۨۘۨۛۥۦۘۘ۠ۛ۠ۛۘۧۘ۬ۜۦۘۨۛۖ";
                    break;
                case 1215320486:
                    floatEditBean.isCancle = true;
                    str2 = "۬ۦۤۡ۬۫ۦ۬ۨۘۡ۫ۘۘۖۥ۠ۡۢۧۡۧۚۖۦۘۤۥۘۘۡۡۦۘۥۛ۟ۦۖۨۘ";
                    break;
                case 1935080328:
                    str2 = "ۗۘۚۧۤۘۘۤۚۨۘۦۥۦۖ۠ۦۤۢۖ۠ۡۘۖۘۚۤۙۖۘۘ۟ۛۥۛۜۚۤ۟ۡ۫ۢۧۘۘ";
                    break;
                case 2039356476:
                    floatEditBean.rightContent = context.getString(R.string.btn_ok);
                    str2 = "ۖۧۤۥۚۗۧ۠ۘۛۗۖۘ۫۬۟ۘۜۨ۟ۜ۫۠ۙۗۜ۠ۡۘۗۖۥ۬ۤۜۘۡۘۚ۠ۖۘۥۘ۫ۗۦۖۨۗۜۘۢۚۘۧ۫ۜ";
                    break;
            }
        }
    }

    public static FloatEditBean getEditFlloatBean(Context context, String str) {
        FloatEditBean floatEditBean = null;
        String str2 = "ۥۜۧۥۛۨ۠ۧۙۗۦۖۘۜۨۡۗ۫۟۟ۥۜۘۧۥ۬۠ۥ۠ۙۤۚۙۛۗۜۙۧۤۧ۬ۙ۫ۨۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 316) ^ 799) ^ 23) ^ (-65968522)) {
                case -1913776707:
                    floatEditBean.intentTtile = context.getString(R.string.menu_rename);
                    str2 = "۠ۘۙ۠ۢۜۘۨ۫ۙۥۨۘۘۚ۬ۘ۬۬ۨ۫۬ۛۘ۟ۤۗۡ۠ۖ۫۬";
                    break;
                case -1066576511:
                    floatEditBean.type = ActionBarOperaEnum.RENAME;
                    str2 = "ۤۙۦۛۚۡ۬ۤ۠ۘۖۛۚۦۗۦ۠ۗۛۜۖۘۙۨۢۧۢۦۙۖۦۚ۫ۧۜۚۡۘۨۙۧۚۥۖ";
                    break;
                case -847821867:
                    floatEditBean.leftContent = context.getString(R.string.btn_cancle);
                    str2 = "ۙۛۗۛۥۜۤۛۢۦۨ۬ۜۨۥۘۧۢۗۗۧۗ۫ۦۦۨ۟ۙۤۘۤۘۤ۫ۧۗۥۘۜۛۨۛ۫ۛۛۜۤۥۤ۠ۜۧۜۘۙۢۘۘ";
                    break;
                case -711476982:
                    floatEditBean.isCancle = true;
                    str2 = "۠ۗۜۘ۠ۡۙ۫ۧۥۘۦ۬ۖۘۨۢۦۘۢۖۗۗۥۧ۫ۜۚۢۧۢ۫۠ۧ۟ۨۡۘۘ۫ۨۘ";
                    break;
                case -90637854:
                    floatEditBean.intentContent = str;
                    str2 = "ۘۖ۟ۚۦ۠ۗ۬ۘۜۧۨۘۦۡۧۤۨۗۜۥ۠ۖۗۜ۟ۧۘ۟ۜ";
                    break;
                case -8531921:
                    str2 = "۫ۗۗۖ۫ۤ۫ۤ۠۟ۛۦۘۤۢۥۘۥۗۢۤۢۜۘ۫۫ۜۙۦۤۡۧۤ۟۫ۙۡۡۥۤۙۗ۠ۙۚ۠ۗۡۘۨۜۤۦۥۖۖۘۘ";
                    break;
                case 1060460583:
                    floatEditBean = new FloatEditBean();
                    str2 = "ۜۚۜۙ۬ۙۚۚۖۦ۟ۡۥۚۨۘ۬۠ۖ۠ۚۜۘۢۘۧۘۖۢۘۖۘۧۘ";
                    break;
                case 1470682056:
                    return floatEditBean;
                case 1661889565:
                    floatEditBean.rightContent = context.getString(R.string.btn_ok);
                    str2 = "ۧۗۧۤۚۛۤۗ۫ۨۧۙۦۙۨ۠ۘۧۘۡ۫ۦۘۢۦۘۘۧۛۨۨۤۡۘۢ۬۬ۚ۬ۙۖۧۡۘۡۘ۬ۡ۟۫ۛۡ۬";
                    break;
                case 1945082605:
                    str2 = "۟ۧ۫ۙۡۚۗۡۖۘۦۗۧۗۗۚۦ۫ۙۜۦۦۘۜۤۛۤ۫ۖۧ۫۟ۚۜۤۙۛۢۛ۬ۦۘۧۜۜۘۖ۬۬ۙۘۖۛۙۘۜۦۖۘ";
                    break;
            }
        }
    }

    public static FloatEditBean getNewCreateFlloatBean(Context context, String str) {
        FloatEditBean floatEditBean = null;
        String str2 = "ۡ۫ۘ۫ۗۥۘ۫ۧۙ۬ۧۦۘ۠ۢۚ۟ۙۙ۠۠ۘۨۤ۠ۡۦۘۙۙۡۡۦۥۢۢ۠";
        while (true) {
            switch ((((str2.hashCode() ^ 972) ^ 89) ^ 848) ^ (-1313104464)) {
                case -1527828006:
                    floatEditBean.rightContent = context.getString(R.string.btn_ok);
                    str2 = "۫ۡۖۘ۠ۦۜۘۢۡۤۛ۠ۖۘۡۦۦۘۦۤۜ۬ۙ۠ۧۢ۠۫ۜۜۛۘۨۘۚۢ۟ۖۗۢۚ۠ۚۗۨۧۤ۫ۙۥۘۡۘ";
                    break;
                case -1451797639:
                    floatEditBean.intentContent = str;
                    str2 = "ۛۗ۫ۛۜۙۦۥۦ۠۬ۘۘۧۤۨۛ۫۬ۛ۫ۥ۫۫ۙۢۙۡۘۡۢۦ";
                    break;
                case -847693544:
                    str2 = "ۖۧۨۚۖۡۘۤۥۛ۟ۨۛۢۥۧۘۥۦۦۘۨۘۧۗۘۘۢ۫ۥۘۤۡ۟۟ۤۨۘۖ۫ۧۙۖۗۦۜ";
                    break;
                case -725192251:
                    floatEditBean = new FloatEditBean();
                    str2 = "۠۫ۨۘ۟ۦۧۘ۟۬ۘۘۖۜۘۧ۠ۜ۟۟ۡۧ۫ۜ۟ۛۦ۠۬ۛۚۨۢۤۙۨ۬ۤۛ۬۫ۥۜۙ۠۬۬ۚۖۧۛۚۢۤۘۨ";
                    break;
                case -412630428:
                    floatEditBean.type = ActionBarOperaEnum.CREATE_NEW_FILE;
                    str2 = "ۙ۬ۜۧۡۘۘ۫ۥۗۖۘۦۤۛۥۘۛ۠ۖۙۗۢ۠ۛۦۜۧۡ۠ۦۥۘۖۢۚ۠ۙۜ۬۟ۥۘۙۦۥۘۦۛ۬ۛۙۘ۫ۖۗۜۖۢ";
                    break;
                case -222029365:
                    str2 = "ۥۗۡۖۗۗۢۛۥۜۥۙۖۡۧۥۤۖۛۦۥۘۡۥۤۛۢۧۖۨ۟ۥۧ۟ۚ۬ۜۘ۬ۡۢۧۙۜۙۨۗۙۢۛ۟ۖۘ۫ۤۜۘ";
                    break;
                case 1276986282:
                    floatEditBean.isCancle = true;
                    str2 = "ۖۢۧۛۨۡ۫۟ۡۘۜ۫ۛۤۜۗۤۥۘ۟ۨۧۡۥۘ۠ۦۡ۟۫ۘۘ";
                    break;
                case 1863793296:
                    return floatEditBean;
                case 2002307197:
                    floatEditBean.intentTtile = context.getString(R.string.create_new_file);
                    str2 = "۠ۜۦۖ۬ۜۘ۫۠۟ۤۚ۠ۢ۠ۖۘۖۦۙۥۘۧۘۨۚۗۡۡۛۦ۫ۚۤۙ۬ۥۨۘ";
                    break;
                case 2007248173:
                    floatEditBean.leftContent = context.getString(R.string.btn_cancle);
                    str2 = "ۨۡۧۘۨۤۨۗۨۦۘۖۡۜۥۛ۬۬ۗ۬ۚۗۨۘۤۢۢ۫ۥۛۦۗۙۨۜۘۖۦۧۨۜۖۘۤۧۜۘ";
                    break;
            }
        }
    }

    public static FloatEditBean getSaveFloatBean(Context context) {
        FloatEditBean floatEditBean = null;
        String str = "ۥۜۖۘۤۥۦۘۛۙۘۘۗۖۛۙۨۘۘۤۦۖ۫ۛۙۧ۟ۚ۠ۗ۫ۥۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 386) ^ 388) ^ FrameMetricsAggregator.EVERY_DURATION) ^ (-486674843)) {
                case -1592574372:
                    floatEditBean.intentContent = context.getString(R.string.tips);
                    str = "۬۫ۛۧ۫ۥۘۦۘۥۤۙ۫ۗۙۢ۟ۨۜۘۜۖۨۘۦۖ۫ۘۥۙۛۧۛۡۙۘ۟ۖۘۘ";
                    break;
                case -299699229:
                    str = "ۤۛۡۘۡۨۙۖۧ۠ۧۨۡ۫ۤ۫۬ۨۘۨۚۦۘ۬ۢۦۘۖۥۖۘۗ۫ۘۜۛۢۧۘۘۘۢۚ۬ۡ";
                    break;
                case -166901421:
                    floatEditBean.leftContent = context.getString(R.string.cancel);
                    str = "۟ۚ۬ۗۜۡۘۥۚۛۢۙۖ۟ۧۜ۟ۛۡۤۡۦۨۦۜۚۤۥۘۦۤۤ۫ۥۖۘۚۢۖۘ";
                    break;
                case 475710027:
                    return floatEditBean;
                case 1039055461:
                    floatEditBean = new FloatEditBean();
                    str = "۬ۢۡۚۖ۟ۥۙۘۥۛۦۛ۬ۘۥۡۘۘۙۜۡۢۥۜۚۛ۫ۚۥۘۖۧۡۥۦ۫ۗۜۘۜۛۥۘ۟ۖۧۚۨۨۘ";
                    break;
                case 1078649710:
                    floatEditBean.rightContent = context.getString(R.string.save);
                    str = "۟ۨۙۗۧۨۘۘۧۗۜۡۨۤۙۤۗ۬ۥۘۨۤۧۡ۟ۘۘۧۙۦۘۨۖۤ۟ۘۘۗۢۤ";
                    break;
                case 1814065951:
                    floatEditBean.type = ActionBarOperaEnum.SAVE;
                    str = "ۙۧۖۖۨ۫ۤۘۙۨۨۦۤۚۡۘۥۦۦۦۚۖۤ۬ۧۖۢۦ";
                    break;
                case 2062480636:
                    floatEditBean.intentTtile = context.getString(R.string.save_script_title);
                    str = "ۧ۫ۖۘۤۙۦۗ۫ۛ۟ۡۨۢۡۛۗۦۗ۬۟۬۫۠ۨۢۜۡۘۨ۠۠ۛ۟ۘۜۨۘۜۧ۬ۘۦ۠ۖۢۘۘۥۚ۫ۥۥۚ۫۫";
                    break;
            }
        }
    }

    public static FloatEditBean getStartDownloadFlloatBean(Context context, String str) {
        FloatEditBean floatEditBean = null;
        String str2 = "ۜۤۘۘۚۧۢۦۥۥۘۢ۟ۦ۬ۧۖۘ۠ۥۨۘۜۜۦۥۤ۠ۨ۫ۜۢۙۘۘۚۛۙۨۥۥ";
        while (true) {
            switch ((((str2.hashCode() ^ 45) ^ 444) ^ 105) ^ (-1602486313)) {
                case -1754102831:
                    str2 = "۫۫ۦۤ۫ۘۘۙۨۛۢۢۡۘۙ۟ۜۘۥۘۛۥۤۨۘ۫ۦ۫ۧۢۘۘۡۗ۠ۥۧۚۜۗ۫";
                    break;
                case -1237568709:
                    floatEditBean.isCancle = true;
                    str2 = "ۢۨۛۦۡۘۘ۠ۚۜۢ۠ۙۙۧۤۤۛۛۤ۬ۘۘۤۙۢۙ۠ۦۢ۫۫ۡۢۖۘۙ۠ۢۧۥ۠ۚۘۖ۠ۢۧۦۚ۬ۙۦ۫ۨۛ۠";
                    break;
                case -1073290842:
                    str2 = "ۧۡۤۨۤۡۙۤ۫ۤۘۘۘ۬ۤ۟ۚۦ۫ۢۜ۫ۤۘۛۨۤۦۜۜۨۖۖۥۘۛۙۤۜ۠ۚۘۗۡۘ";
                    break;
                case -1061503445:
                    floatEditBean.rightContent = context.getString(R.string.btn_down);
                    str2 = "ۡ۠ۖۘۢۤۡۘۡۨۨۦۦۨۥۡۖۘۚ۟۬ۚۘۖۘۥۦۖۘ۟ۚۘۘ۬ۙۚۡۘۘۘۗۖۜۘ۠ۥۨۖۤ۬";
                    break;
                case -1016147911:
                    floatEditBean = new FloatEditBean();
                    str2 = "ۚۜۧۘۚۛۥۘۧۨۡۘۛۧۜۘۚۚۜۙۡۦۘۨۤۘۘ۟ۦۖۘۜۥۦۘۤ۫ۡۘۙۦۚۛ۟۠ۥ۫۫ۚ۬ۚۘۚۥ۠ۤۙۚۤۨۨۡۘ";
                    break;
                case 229809565:
                    floatEditBean.intentTtile = context.getString(R.string.user_permission);
                    str2 = "ۦۗۛ۬ۧۜۘۧۖۜۥۗۦۖۛۜۨۨۤۥۛۗۡۡۨۘۦۧۤ۫ۛۤۚ۫ۨۘۧۤۡۘ";
                    break;
                case 1049180720:
                    floatEditBean.type = ActionBarOperaEnum.START_DOWNLOAD;
                    str2 = "ۖۡۥۥ۟ۤۘۚۛۘۗۛۘۡۚ۫ۖۧۛۛ۠ۗۨۖۘ۟۫ۨۤ۠ۚ۠ۗۦۘۡۙۦ۬ۖ۟ۛۗۥۖۜۦۛۜ۟ۙۚۨۘۢۤ۠";
                    break;
                case 1641670061:
                    floatEditBean.intentContent = str;
                    str2 = "۬ۛۨۘۗۘۥۚۚۖۥۤۛۨۘۥۘۚۙۢۘۤ۟۟ۚۧۨۥۘۧ۫ۢۘۧۙۜۙۙۤۘۡۘۗۚۙ";
                    break;
                case 1839774631:
                    floatEditBean.leftContent = context.getString(R.string.btn_cancle);
                    str2 = "ۢۨ۬ۦ۬ۧۦۦۖۘۜۜ۬ۘۙۙۥۨۜۘ۫ۙۘ۠ۨۨۘۚ۟ۢۢ۫ۖ۟ۥ۫ۧ۠ۚ۬ۥۤۧۢۤۦۖۜۘۛ۬ۥ";
                    break;
                case 2141224002:
                    return floatEditBean;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        String str = "ۗۜ۫ۗۨۥۘۨ۫ۙۧۜۛۙۥۗۧۨۘۧ۠ۘۡ۬ۘۘ۫ۗۡۦۦۜۚۦۡۖ";
        while (true) {
            switch ((((str.hashCode() ^ 257) ^ 480) ^ 106) ^ 109305324) {
                case -405120955:
                    return 0;
                case 521183499:
                    str = "ۜۦۥۘۘۨۙ۠ۘۘ۟ۜ۬ۢۡۖۘ۟ۗۗ۬ۥۘۗۘۙ۠ۢ۟۟۟ۘۘ۫۫۟۫ۦۦۙۡ۫ۜۘۨۘۧ۫ۖۘۢۙۗۨ۠ۤ۠ۤۚ";
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ActionBarOperaEnum actionBarOperaEnum = null;
        String str = "ۦۤۧ۟ۘۢۥ۬۬ۙ۠ۦۧ۬ۡۤۧۤۘ۫ۤ۟ۧۨۖۚۤۗۧۜ";
        int iOrdinal = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((((str.hashCode() ^ 868) ^ 846) ^ 361) ^ (-1272865187)) {
                case -2123520111:
                    str = "ۦۛ۟۟ۚۧۡۚ۠ۦۨ۟ۥ۬ۛۜۘۧۛۗۙۤۢۥۙۢ۟۫";
                    i2 = iOrdinal;
                    break;
                case -1766662460:
                    str = "ۢ۠ۢۨ۬ۢۘۗۙۦۡۖۘۚۢۡۤۤۜۘۜۚۗۖۧۛۦۦۘۙۜۙۘۛۘۘۤۛۧ";
                    break;
                case -1680373830:
                    parcel.writeByte(this.isCancle ? (byte) 1 : (byte) 0);
                    str = "ۜۦۥۘۙۘۘۡۨۢۙۧۘ۠ۤۛ۫ۨۦۘۖ۟ۗۦۖۜۢۤۦۘۥ۫ۦۗ۫ۧ۠ۧ۠ۚ۠۠ۨۖۦ۬۟ۥۧۚۖۘ";
                    break;
                case -1034503056:
                    parcel.writeInt(i2);
                    str = "ۖۦۗۡۤۨۘۚۡۤ۬ۜۧۘ۬ۨۡۛۤۦۘۦۙۦۤۢۥ۫ۡۥ۬۠ۨۘ";
                    break;
                case -927800397:
                    str = "ۚۨۧۘ۬۫ۦۘۥۛۘ۟۠ۡۘۡۨۡۘۛۚۡۘۜ۫ۗۜۚۤ۬ۘۘۘۙۛ۟";
                    i2 = i3;
                    break;
                case -887083967:
                    i3 = -1;
                    str = "ۨۘۦۖ۬ۚۛۥۢۜۚۥۙۗۤۙ۠ۖۗۧۡۘۤۧۖۤۙۧ۬ۡۦۘۢۡۦ۬۬ۥۘۖۤۚۘۤۡۛۤۖۘۥ۬ۧۨ۠ۜۘۢۦۨۘ";
                    break;
                case -860873841:
                    parcel.writeString(this.intentContent);
                    str = "۫ۜۧۘۜۙۘۘۡۥۛۧۙۖۘۜ۫۫۠ۚۜۘۤۦۡۦۗۤۙۨۧۡۜۘۘۢۛۦ۠ۧۨۛۥۡ۫ۚۗ";
                    break;
                case -487165269:
                    str = "ۦۛ۟۟ۚۧۡۚ۠ۦۨ۟ۥ۬ۛۜۘۧۛۗۙۤۢۥۙۢ۟۫";
                    break;
                case 62068430:
                    str = "ۧ۫ۨ۠ۧۜۗۨۘۘۤۡ۠ۗۙۥۘۨۗۤ۠ۘۡۢۤ۟ۖۤۨۘۦۗ۫۬۟۫ۤۨۛۜۦۙۧ۫ۜۛ۫ۙۚ۠";
                    actionBarOperaEnum = this.type;
                    break;
                case 155046909:
                    return;
                case 164936530:
                    iOrdinal = actionBarOperaEnum.ordinal();
                    str = "ۘۛۜۘۚۜۨۡۙ۬۟ۗ۬۠ۢ۬ۙ۫ۡۖۘۚ۟۠ۡۘۧۢۛ۫";
                    break;
                case 653744417:
                    str = "ۘۨۥۦۢۤۖۗ۟ۖ۠ۘۥ۬ۚۤۡۡۧۙۦۘۨۘ۫۫ۘ۫۫ۛ۠۠ۨۘۦ۟ۥۘ";
                    break;
                case 1162062072:
                    str = "ۦۖۧۘۜۗۦۛۚۨۚۧۖۘۤۡ۬ۖۧۜۦ۬ۤۖۥ۟ۚۚۢۙ۬۠ۥۦۘۧ۟ۘۖۘۜۘۗۨ۬ۛۨۡۢۨۖۨۖۧۛۦۚ";
                    break;
                case 1738794137:
                    parcel.writeString(this.intentTtile);
                    str = "ۥۗۜۘ۠ۧۥۘۨۗۗۛۢۨۥۨۚ۬ۢۛۦ۬ۥۙۖ۟ۧۗۜۘۤۦۜۘۥۛۨۢۤۛۦۚۛۖۙ۟ۘ۫ۗۖۚۚۙۗۢۙۦۘ";
                    break;
                case 1916714115:
                    parcel.writeString(this.rightContent);
                    str = "۫۟ۥۘۘۡۧۛۢۦۘۜۧۡۘ۠ۚۡۘۤۦۡۘۢۗۘ۫ۥۛۚۦۜۜۨ۠ۦۨۜۘۡۢۗۧۤۦۧۡۘۘ۫ۜۡۘ۬ۙۢ";
                    break;
                case 2021329152:
                    String str2 = "ۡ۟ۡۘۜۨۗۤ۬ۗۘۖۡۚۜۘۨۡۛۢۧ۟ۢۦۜۙ۟ۡۜۜۧۘۛۚۘۘۢۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-306006797)) {
                            case -1907508283:
                                str = "ۥ۟ۡۘۢۚۜۘۛ۫۬۠ۨۘۢۜۥۘۖ۟ۖۡۧۦۘ۫ۤۦۢۦۛۖۥۤ";
                                continue;
                            case -1412620210:
                                String str3 = "ۜۛۗۛۨۡۘۡۡۢۗۖۘ۬ۗۘۜۡۘۜۜۚۗۧۦۘۚۙۙۡ۟۫";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1610202243)) {
                                        case -1333795650:
                                            str2 = "ۤۜۨۛۤۘۘۢۧۘ۬ۥۘۙۖۖۜۨۥۘۘۤۙ۫ۡۢۡۖۗ۬ۨۘ";
                                            break;
                                        case 24728875:
                                            str3 = actionBarOperaEnum == null ? "۟ۡۥۘۦ۬ۛۚۚۖ۫ۦۛۦۤۥۘۧۗ۠ۙۖۚۙ۟۫ۨ۟ۡۘۖ۬ۚۤۧۙۗ۬ۨۘ" : "ۛۚۖۘۡۢۙ۠ۥ۫ۚ۠۫ۛۘۨۗۡۙۛۖۘۖ۠ۚۨۡۘۢۖۚۢ۠ۛۢۧۡۤۜۘ۬ۖ۟ۥۡۢۦۗۛۦۧۛۦۗۨ";
                                            break;
                                        case 558374143:
                                            str3 = "ۢ۫ۡۡۢۨۘ۟۫ۨۘۚۤۤۘۧۡۡۦۘ۠ۢۦۖۥۜۧۧۖۙۙۗۙۡۖۧۗۜۘۜۗۗ۫۫ۥ";
                                            break;
                                        case 1778293460:
                                            str2 = "ۢۛ۠۟ۛۥۧۥ۫ۘۛۢۧۧۦۘۤۤ۬ۦۚۦۘۦۚۨۘ۟۫ۥۜۙۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case -358493022:
                                str = "۫ۦۢۥ۬ۚۨۥۡۘۚۡۨ۬ۖۦۘ۟۠ۘ۠ۙۥۘۗۦۘۘۡۙۢ۫ۤۦۙۚ۬ۙۗۥۚۢۨ۟ۤۨۘۖۗۜۘ۟ۡ۟";
                                continue;
                            case -23673441:
                                str2 = "۬ۢۖۥۧۦۧۖۨۗ۠ۜ۫ۗۜۗۗ۫۫ۦ۫ۙ۬۠۫ۥۖۡۗۘۗۥۘ۟ۧۖۘۤۡۖۘۨۙۙ";
                                break;
                        }
                    }
                    break;
                case 2021856128:
                    parcel.writeString(this.leftContent);
                    str = "ۜۙۡۘۛ۟ۙۢۨ۫ۧۗۨۘۙۜۖۘ۟ۦۥۘۖۢ۬ۙۤۨۘۘۧۤۡۨۡ";
                    break;
            }
        }
    }
}
