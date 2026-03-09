package com.elfin.p203ad.bean.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManagerImpl;
import cn.haorui.sdk.adsail_ad.view.scaleImage.SubsamplingScaleImageView;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import java.util.List;
import p285z2.C4095le;

/* JADX INFO: loaded from: classes2.dex */
public class FengLingAdInfo implements Parcelable {
    public static final Parcelable.Creator<FengLingAdInfo> CREATOR;
    private int actionName;
    private int adId;
    private String adPlatformIcon;
    private int adPlatformId;
    private String clickUrl;
    private int creativeType;
    private int drawType;
    private int height;
    private OooO0O0 imgs;
    private int rating;
    private String title;
    private OooO0OO webTracks;
    private int width;

    public class OooO00o implements Parcelable.Creator<FengLingAdInfo> {
        public FengLingAdInfo OooO00o(Parcel parcel) {
            String str = "ۧۚۛ۬ۖۤۧۗۗۜۨۘ۫ۤۘۘۘۤۘۘ۠ۘۢۦۗۥۘ۟ۦ۠ۙۗۛ۫ۢۥۙۧ۟";
            while (true) {
                switch ((((str.hashCode() ^ 830) ^ 980) ^ 362) ^ 2010052098) {
                    case -246325925:
                        str = "ۛۖۡۨۡۖۘۨ۟ۤ۟ۥۥۘۛۡ۬ۡۡۛۤۙۥۘۨۨۛ۬۠ۨۘۘۧ۬ۥۛۥۘۡ۠ۘۚ۠ۖۘۘۘۘۘۙ۬ۨۖۦ۟۫ۢۤ۬ۗۥ";
                        break;
                    case 513289710:
                        return new FengLingAdInfo(parcel);
                    case 912613725:
                        str = "ۜۙۡۘۙۛۜۧ۟ۖۡۛۖۘۗۨۥۘۚۜۡۥۨ۠ۡ۫ۡۘۘۧۦۘۘۗۚۗۥۧۘۤ۬ۖۘ";
                        break;
                }
            }
        }

        public FengLingAdInfo[] OooO0O0(int i) {
            String str = "ۘۙۦۦۤۘۘۡۚ۟۬۬ۜۘۧۤۦۘۤۘ۟ۦۦۛۥۘۤۤۘ۠ۤۛ۠ۧۛۤۗۖ";
            while (true) {
                switch ((((str.hashCode() ^ 326) ^ 941) ^ UiMessage.CommandToUi.Command_Type.SET_FONT_VALUE) ^ 2018293681) {
                    case -1853678903:
                        return new FengLingAdInfo[i];
                    case -1305638735:
                        str = "ۢۛۙۦۙ۬۠۠۫ۚ۠ۨۚ۫ۥۘۜۧۢۤ۫۠ۧۛ۠۬۬۠ۖۡۧ۠ۘۤۦۜۘۦ۫ۚۛ۫ۛۤۘ۫ۗۖ";
                        break;
                    case -50655530:
                        str = "ۙۜۙ۠۬ۜۘۚۢۖۨۚۨ۠ۥ۫ۦۥۘۤۨۧۘۘۜۘۘۘ۬ۨۡ۬ۡۥۙۡۘ۠ۢۨ";
                        break;
                }
            }
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FengLingAdInfo createFromParcel(Parcel parcel) {
            String str = "ۤۢۖۛۛۘۘۥۖۘۘۙۤۘۚ۠ۡۜۛ۟ۨۜۢ۟۬۬ۤۨۘۘۜۘۜۜ۫۫۠ۚۘۘ۠۬ۜۨۜۖۘ";
            while (true) {
                switch ((((str.hashCode() ^ 62) ^ 571) ^ 184) ^ (-278245566)) {
                    case -806809709:
                        str = "۫ۨۤۧۤۚ۫ۚۦۜۛۚ۟ۛۦۚۖ۫ۧۨۘۥ۟ۖ۬ۛ۬ۡ۫ۛۦۚۗۧ۫ۥۢۖۨۤ";
                        break;
                    case 2497453:
                        str = "ۖۛۖۘۖ۟ۜۙۢۧۘۨۘۘ۠ۥۜۧۙۗۜۚۢۤۡۘۢۚۙۢۚۥ۟ۧ۟ۗۡۗۧۡۚ۠ۖۘۛۦۥۤ۟ۖۘ";
                        break;
                    case 1228709561:
                        return OooO00o(parcel);
                }
            }
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FengLingAdInfo[] newArray(int i) {
            String str = "ۦ۫ۤۜۡ۟۫ۤۗ۬ۧ۠ۨۖۘۘۘۛۛۛۖۤۧۧۨۘۙۖۗۦۥۖۘ";
            while (true) {
                switch ((((str.hashCode() ^ 976) ^ 430) ^ 780) ^ (-1494472846)) {
                    case -2097856886:
                        str = "ۚۢۜۚۨ۠ۡۤۧۥۦۡۘۚۚۗۘۡۖۨۨۘۙ۠ۖۙۡ۟ۙۧۦۦۗۧ۠ۗ";
                        break;
                    case 629987580:
                        return OooO0O0(i);
                    case 1688114017:
                        str = "ۤۙۘ۟۫۬ۗۛۧۗۙۨۘۤۖۥ۟۟ۦ۫ۙۘۘۧۥۥۡۖۨۘۡۚۨ";
                        break;
                }
            }
        }
    }

    public class OooO0O0 {
        private int OooO00o;
        private int OooO0O0;
        private String OooO0OO;
        public final FengLingAdInfo OooO0Oo;

        public OooO0O0(FengLingAdInfo fengLingAdInfo) {
            this.OooO0Oo = fengLingAdInfo;
        }

        public int OooO00o() {
            String str = "ۙۜۖۘۥ۟۬۬ۙۚ۬۫ۖۘۙۤۦۘۛۦۘ۟ۘ۫ۛ۫ۦۙۡۖۘۧۘۨۙۗۚۥ۠۫";
            while (true) {
                switch ((((str.hashCode() ^ 850) ^ 418) ^ 644) ^ (-342924562)) {
                    case -2144495788:
                        str = "ۧۧۡۘۗۖۥ۠ۨۧۘۚۢۘۡۛ۠ۚۡۡۘۧۛۗ۟ۚ۟ۘۤۡۘۙۢ۫ۗۢۜۦۘۘۘۤۜۤ۟ۖۜۡۗۢۥ۠ۜۘ";
                        break;
                    case 199459187:
                        return this.OooO00o;
                }
            }
        }

        public String OooO0O0() {
            String str = "ۧۢۥۘ۟ۙۨۚۥۤۢۚۨۘۥۤۚۖۢۗۚۛ۫ۢۡۥۧۥۖۚ۟ۨۘۡ۫ۗ۫ۘۘ۫ۚۧۗۘۛ";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.FW_GET_VALUE_VALUE) ^ 111) ^ 192) ^ 940226427) {
                    case -1967416437:
                        str = "ۗۖۧۛۙۖۘۘۤۢۥۜۥۘۥ۬ۨۧۙ۬ۖۧۜ۫ۖۡ۠ۦۤ۬ۡ۫ۘۙ۟ۖۛ۬ۢۗۨ۫ۚۛ۬۟ۡۜۘۘ";
                        break;
                    case -540990321:
                        return this.OooO0OO;
                }
            }
        }

        public int OooO0OO() {
            String str = "۠ۙۤۡۥۡۘۤ۟۫ۜۤ۟ۦۥۘۨ۫ۢۚۘۤۨۡۦۘۚ۫ۨۘۢ۠ۜ";
            while (true) {
                switch ((((str.hashCode() ^ 544) ^ 970) ^ 800) ^ (-2142551177)) {
                    case -1868408446:
                        str = "ۖۘۜ۫۬۬ۚۥۤ۟ۚ۬ۛۗ۠ۚۗۤۦۤ۟۟۬ۨۘۙۡۨۢۧۘۘۙۛۥۙۜۡۘ";
                        break;
                    case 928051671:
                        return this.OooO0O0;
                }
            }
        }

        public void OooO0Oo(int i) {
            String str = "ۡۡۥۘۤۘۘ۫ۙۥۘۘۜۧۛۜۚۜۘۢۖ۫ۦۗۖۘۗ۠ۨۘ۠ۖۜۚۥۥۘۘۦۦۘ";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.FW_ZORDER_VALUE) ^ UiMessage.CommandToUi.Command_Type.CLOSE_CONTINUE_ACK_VALUE) ^ UiMessage.CommandToUi.Command_Type.SET_ENABLED_VALUE) ^ 1189908949) {
                    case -1455703144:
                        str = "ۙۜۡ۫ۙۖۘ۠۬ۡۘۘۥۥۘۥۙۨۘ۬ۥۙۚۧۚۨ۬ۜ۫ۙۦۘ۟ۢۥۘۜۦۧۢۖ۠ۨۛۖۘ۬ۛۙۜۛۥۡۙ۠۬۠ۘۘۛۢۖۘ";
                        break;
                    case 1189817437:
                        this.OooO00o = i;
                        str = "ۘۖۙۦۡۤ۫ۜ۬۟ۡۖۘ۫ۘ۟۠۟ۢۧۨۘ۠ۙۖۜۖۨۦۡۙۧ۟ۨۘ۫ۘۧۘ۬ۦ۠ۡۚ۠";
                        break;
                    case 1646831451:
                        return;
                    case 2031557281:
                        str = "ۥۥۜۛۚ۠ۥۡۘۘۛۦۢۚۚۖۘۗۙۡ۟ۧ۟ۗۛۖۘۖۢۡۘۛۗۨۘ۬ۙۤ۟ۦۘۘ۬۬۟۬۟ۡۡۡۜۥۖۘۙۜۦ۠۠۬";
                        break;
                }
            }
        }

        public void OooO0o(int i) {
            String str = "ۨۡۘۘۧۥۤ۠۠۬ۚ۠ۖۜۥۘۚۚۨۘ۬ۡۧۢۡۡۦۖۖۡۗۚۘۛۛۜۛ۫ۘۘۦۦ۟ۨۘۘۡۦۘ۫۬۠";
            while (true) {
                switch ((((str.hashCode() ^ 835) ^ 127) ^ SubsamplingScaleImageView.ORIENTATION_270) ^ (-895947367)) {
                    case -589636104:
                        this.OooO0O0 = i;
                        str = "ۚۢۗۛۚۚۙۛۗۡۚۙۖۗۦ۫ۢۘۘۖۦۖۘ۬۫ۦۘۙۧۖۤ۬ۗ";
                        break;
                    case 211277774:
                        str = "ۜۦ۠ۘۗۦۘۥۧۜۚ۬ۦۤۧۨۘ۫۫ۖۖۢ۬ۚۚ۠ۖۗۤ۫ۗۨ";
                        break;
                    case 272060292:
                        return;
                    case 1195841008:
                        str = "ۛۥ۫ۧۖۤۨۧۦۚۗۢۧۛۗۡۧۤ۟ۛۦۘ۟ۡۡۡۗۤۦۦۙۙۧۤۛۧۦ";
                        break;
                }
            }
        }

        public void OooO0o0(String str) {
            String str2 = "۟۟ۜۘۢۛۢۚۧۥۘۙۜۦۥۘۨ۬۟ۙۜۙۡ۫ۛۡۖۖۘۡۜۨۜ۫ۜۘۛۗۘۘۥۤۦ۬ۡۘۘ";
            while (true) {
                switch ((((str2.hashCode() ^ 466) ^ UiMessage.CommandToUi.Command_Type.FW_OPACITY_VALUE) ^ 887) ^ (-862311107)) {
                    case -1675983574:
                        return;
                    case -164947578:
                        this.OooO0OO = str;
                        str2 = "ۦۛۙۙۚۤۘ۠ۘۘۦۡۜۘۤۚ۠۬ۗۦۢۗۗۚۘۨۖۥۘ۟ۖۗ۠۫۟ۜۤۚ";
                        break;
                    case 633175978:
                        str2 = "ۗۡۦۘۚۡۖ۬ۜۗۨۤۦۘۦ۫۟ۧۙۖۢۗۥۘۥ۬ۜ۠ۜۨۘۗۙۖۨۥۦۘ۟ۚۢ";
                        break;
                    case 1109996599:
                        str2 = "ۗۗۜ۬ۤ۫ۢۚۥۘۨۙۤۖ۬ۧۦۡۥۥۘ۟۠ۡۡ۬ۙۙۙ۬ۖۢۦۦۘۛۗۥ۟۠ۙۤۤۚ";
                        break;
                }
            }
        }
    }

    public class OooO0OO {
        private int OooO00o;
        private List<String> OooO0O0;
        private List<String> OooO0OO;
        private List<String> OooO0Oo;
        public final FengLingAdInfo OooO0o;
        private List<String> OooO0o0;

        public OooO0OO(FengLingAdInfo fengLingAdInfo) {
            this.OooO0o = fengLingAdInfo;
        }

        public void OooO(List<String> list) {
            String str = "۬ۧ۠ۡۜۦۘۨۖ۠ۢۚ۫ۖ۟ۥۘۡۡۘۚۢ۬ۚ۠ۙۡۗۖۘ۫ۧۡۛ۫۬ۖۤ";
            while (true) {
                switch ((((str.hashCode() ^ 521) ^ 135) ^ 140) ^ 40512035) {
                    case -408944489:
                        return;
                    case 426955228:
                        this.OooO0o0 = list;
                        str = "۫ۗۚ۬ۖ۬ۡ۬۫ۡۘۘۚۡۢۨۧۧ۫۠ۚۖۜۦۘۚۚۧ۫ۧۘۘۘ۟۫ۙۗ۟۬ۗۗۗۘۡۘ۬ۜۡۨۘۨۨ۬ۤۗۡۚ";
                        break;
                    case 1440171124:
                        str = "ۖۛۚ۬ۤۜۘ۬ۢ۫۬ۥۗۘ۫ۛۚۙۦۛۨۖ۠ۖۢۤۨۤۤۢۦ";
                        break;
                    case 1731081437:
                        str = "۠۠ۜۘۛۜۨۘۗۨۦۤۛۡۥۨۤۘۘۜۢۥ۟ۥۙ۟ۖۜۘۨۜۖۛۦۤ۫ۧ۟ۘۚۤۨۛ۫ۚۛۤۚ۬ۖ";
                        break;
                }
            }
        }

        public List<String> OooO00o() {
            String str = "ۡۖۘ۟ۢۡ۟ۤ۬ۨۡۜۢۘۧۘۛۡۡ۠ۤۧۛۚۙۛۙۜۘۡۤۙ۠ۢۢۤۢۜ";
            while (true) {
                switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_RADIO_GROUP_VALUE) ^ 282) ^ 860) ^ (-116121033)) {
                    case -1389174085:
                        return this.OooO0OO;
                    case 1173068987:
                        str = "ۜ۫ۛۨ۟ۡۘۙۘ۬ۧۧۥ۬ۘۨۗۤ۫۬۟ۥۥۘۗ۬ۤۤۚۚ";
                        break;
                }
            }
        }

        public List<String> OooO0O0() {
            String str = "ۗۤۢۦۚۘۘۖۘۥۘۤۘۨۘۥۘ۠ۛۙۥۘۜۥۤۡۛۤۚۚۘۘۚۥۨۖ۫ۥ۫ۤۗ۠ۦۨۘۗۥۘۘۡۨۡۗۢۥ۠ۘۦۨۥۨ";
            while (true) {
                switch ((((str.hashCode() ^ 884) ^ 160) ^ 129) ^ 1352319012) {
                    case 682703920:
                        return this.OooO0Oo;
                    case 881915376:
                        str = "ۚ۬ۙۘۤۥۨ۫ۧۦۖۜۦۛۘۘۚۙۖۘ۫۟ۘۘۨۜۨۘۗۖۘ۬ۗۛۙۨۧۡۜۧۢۚۨۖۢۦۧۚۡۘۧۛۥ۠ۗۛ۫ۛۡۘ";
                        break;
                }
            }
        }

        public List<String> OooO0OO() {
            String str = "ۢۢۥۨۛۘۘۙۦۦۨۙۙۗۗۘۘ۬ۨۜۘۖ۫ۨ۟ۚۙۛ۟ۛۥۘۜۤۥ۫ۡ۠ۧ۫ۡۜۘۘ";
            while (true) {
                switch ((((str.hashCode() ^ 180) ^ 819) ^ 699) ^ 5820146) {
                    case -2046643877:
                        return this.OooO0O0;
                    case -1881967550:
                        str = "ۙ۫ۨۙۦۛۙۗۗۗۤۢۦۨۦۘۧ۠۬۫۫۫ۜ۫ۥۘ۫ۦۙۤۙۖ۠ۘۚ۬ۜۨۘۦ۠۫۫۬ۘۘ";
                        break;
                }
            }
        }

        public List<String> OooO0Oo() {
            String str = "ۢۨۜۘۖۛ۫۬ۧۜۘۥ۠ۗ۟۬ۧۖ۬ۛۤۧۢۛ۬۟ۢۙۖۡ۬ۨۘ";
            while (true) {
                switch ((((str.hashCode() ^ 504) ^ 749) ^ 774) ^ (-1161289413)) {
                    case 1629438540:
                        return this.OooO0o0;
                    case 1811717687:
                        str = "ۘۛۦۜۤۡۖ۬ۗ۟ۘۡۘۡۚۡۘ۬۫ۧ۫ۢۥۤۘۗۦۥۥۘ۫۠ۙۢۨۥۘۛۖۘ۟ۦۜۘۚۖۧ";
                        break;
                }
            }
        }

        public void OooO0o(List<String> list) {
            String str = "ۥۜۗۥۧۖۥۧۘۧۢۨۘۨۨۥۘۛ۠۠ۘ۬ۙۧۢۦۥۡ۬ۦ۫۠۫۫ۘۥۛۗۦۛ۠ۛ";
            while (true) {
                switch ((((str.hashCode() ^ 400) ^ 185) ^ 542) ^ 1658958633) {
                    case -2098696745:
                        str = "۫ۖۢ۟۬ۤۡ۠ۦۛۥۜۘۘۢۧۜۜۢۨ۬۟ۡۡۘۘۢۜۡۖ۬ۖۤۛۦۦۥۧۘ";
                        break;
                    case -1537610365:
                        this.OooO0OO = list;
                        str = "ۦۗۗۘۨۘۖۧۜۘ۠۠ۡۘۤ۠ۦ۬ۜۘۘۢۥۜۘۙۘۙۘ۟ۖۘۛۜۛۤۥۜۘۙ۬ۡۘ";
                        break;
                    case -545400241:
                        return;
                    case -490948133:
                        str = "ۖۧۗۛ۠ۤۚۛۧۖۥ۟ۜۛۗۖۨۧ۟ۥۘ۟ۨۙ۟ۖۧۧۢۖ";
                        break;
                }
            }
        }

        public int OooO0o0() {
            String str = "ۥ۬ۖ۟ۛۗۢۘۦۘۡۜۧۘۗۙۗ۫ۦ۠۬ۢۗۥۡۤۡۥۧۘۘۗۚۧۙۦۘۚۚۦۢۖ۠۠ۜۢۧۡۛۙۚ";
            while (true) {
                switch ((((str.hashCode() ^ 917) ^ 672) ^ 182) ^ 153813874) {
                    case -109151004:
                        str = "ۙ۬ۖ۠ۤۦۤۜۛۢۘۡۜۦۦۘۖۦۥۘۧۖ۟ۜ۫ۢۦۖۘۛۧۙ";
                        break;
                    case 822601407:
                        return this.OooO00o;
                }
            }
        }

        public void OooO0oO(List<String> list) {
            String str = "۬ۗۧۘۚ۬ۡۥۨۧۦ۫۫ۛۖۘۦۧۙۛۢۛۘۚۧۖۜۘۙۘۦۘۛۙ۫ۘۧۘ۟ۛۗۥۤۧ";
            while (true) {
                switch ((((str.hashCode() ^ 485) ^ 595) ^ 667) ^ 1940467248) {
                    case -2103158629:
                        return;
                    case -1378944810:
                        str = "ۧۗۦۘۥۘۢۢۘۤ۫ۢۘۘۡۙۘۘ۬ۦۘ۠ۜۘ۠ۨۨ۫ۤۨۘۚۘۢۘۚۜۚۧۖۘ۠ۖۙ۠ۙۥۘۚ۬ۦۨ۠ۜ";
                        break;
                    case 713016672:
                        this.OooO0Oo = list;
                        str = "ۥۡۘۧۥۛ۬ۥۤۖۘۘ۬ۤۖ۟ۤۥۘ۟ۡۜۜۡۘۘ۠ۥۡۘۖۙ۟ۛۚۜۘۙۚۖ۟ۚ۫ۖۘ۬۠ۜۦۙۖۤ";
                        break;
                    case 718793922:
                        str = "۠ۛۦۘۜۥۥۥۛۛۙۤ۠ۧۚۙۛ۟ۧۖۢۡۖۢۗۘ۟ۗۡۨ۫ۢۛ۠ۡۡۖۧۖۡۘۤۦ";
                        break;
                }
            }
        }

        public void OooO0oo(List<String> list) {
            String str = "۟ۢۖۥۤۡ۠ۨۧۘۡۙۢۜۗۨۘۢۘۨۢ۬ۜۚۨۖ۫ۚ۫۬۫ۘ";
            while (true) {
                switch ((((str.hashCode() ^ C4095le.o00000Oo) ^ 960) ^ 825) ^ (-786674744)) {
                    case -2087008087:
                        str = "ۤۧۘۢۧۘۥۥۤۨۤ۠۠ۡۘۗۡ۟۠ۡۥۗۙۧۤۘ۬ۡۚۗ۠ۛۘۘۧۖۧۖۧ۟ۡ۬";
                        break;
                    case -1324972886:
                        str = "ۡۨۢ۫ۛۗۡۤۛۨ۠ۨۘۗ۟ۢۢۨۘۘۨۜۗۜۨۨۤ۫ۛۖۚۗ۟ۘۖۘۢۚۤۘۡ۠ۚۙ۟ۨۡۘ۠ۖۚ";
                        break;
                    case -787780773:
                        return;
                    case 2055352685:
                        this.OooO0O0 = list;
                        str = "ۢۛۤۨۧۚۢۨۘۘۢ۫۫۠ۤۢۤۖۙۧۙۘ۟ۡۘۡۖۘۢۗۥۘۜۦۡۘۡۗۦ";
                        break;
                }
            }
        }

        public void OooOO0(int i) {
            String str = "ۨۘۗۛۨۡۦۤ۠ۦ۬ۛۥۨۦۘۧۛۜۛۛۚ۟۫۬ۢۚۨ۬ۢۘۘ";
            while (true) {
                switch ((((str.hashCode() ^ 202) ^ 231) ^ 722) ^ 2091351589) {
                    case -508947196:
                        return;
                    case -241724105:
                        str = "ۗۙۜۛ۟ۘۘۚۖۦ۠ۥۨ۠ۛ۬ۜ۠ۛۤ۠ۧۗ۬ۧۢۙۘۦۖۥۢۨۥۢۧۖ";
                        break;
                    case 450911664:
                        str = "۟ۢۖۛۡۖۛ۬ۛۘۧۘ۟ۙۥۚۜۡۘۜۛۥۖۘ۫ۧۛ۫ۘۥۘ";
                        break;
                    case 1481007173:
                        this.OooO00o = i;
                        str = "ۧۥۛ۠ۧۢۥۤ۫ۜۥۤۜۧۗۜۙ۫ۚۧۧۡۛۙ۫ۙۥ۫ۦ";
                        break;
                }
            }
        }
    }

    static {
        String str = "ۡۢۦۘۢۖۧۛۖۦۙۙۘۦۘ۫۠ۢۨۘۙۤۗ۫ۦۤ۫۬ۥۘۢۤۗۥۢۡۙ۬ۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_EDIT_INPUT_TYPE_VALUE) ^ UiMessage.CommandToUi.Command_Type.SET_SPINNER_VALUE) ^ 231) ^ 95441961) {
                case 1029087418:
                    CREATOR = new OooO00o();
                    str = "ۖۘۨۡ۟ۖ۠ۛۛۡ۫ۦۖۜۙۦۥ۠ۗۜۘۢۚ۬ۨۖۖۘۧۖۗۢۦۜۚۖ۬ۜۘ";
                    break;
                case 1384356317:
                    return;
            }
        }
    }

    public FengLingAdInfo() {
    }

    public FengLingAdInfo(Parcel parcel) {
        this.creativeType = parcel.readInt();
        this.drawType = parcel.readInt();
        this.actionName = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.title = parcel.readString();
        this.rating = parcel.readInt();
        this.adPlatformIcon = parcel.readString();
        this.adId = parcel.readInt();
        this.clickUrl = parcel.readString();
        this.adPlatformId = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        String str = "ۡۨۡۢۘۜۘۗ۫ۖۥۡۖۘۢۜۜ۫ۚۦۦۗ۠ۦۡۦۗۥۘ۟ۚ۬ۙۨ۠ۗۘۤۦۚۗۧۗۛۤۤۢۙۤۗۖۖ۟۟ۥۢ";
        while (true) {
            switch ((((str.hashCode() ^ 635) ^ 573) ^ 227) ^ (-2137486267)) {
                case -949644499:
                    str = "ۚۧ۠ۥۧ۟ۨۢۦۘ۟۫۬ۖ۟ۦۘ۠ۛۖۘۘۘۦۘۜۘۗۢ۠ۖۦۧۘۙۚ۠ۧۖۗۙۥۜۗۧۚۗۘۤۙ۬ۖۘۥۙۖۘۖۧۜ";
                    break;
                case 329737062:
                    return 0;
            }
        }
    }

    public int getActionName() {
        String str = "۠ۗ۫ۦۥۙۥۢۗ۟ۖۘۗۡۥۘۥۚۙۦۜۙۥۡۘۜۦۙۖۚۖۘۥۘۢۧۤۥۘ۠۟ۜۙۥۘۜۥۨۘۛ۫ۘ";
        while (true) {
            switch ((((str.hashCode() ^ 785) ^ 88) ^ 498) ^ (-1465642552)) {
                case -2146650679:
                    return this.actionName;
                case 1576752016:
                    str = "ۨ۠ۥ۫ۘۘۤۙۥۘۧۧۢۥ۠ۙۢۧۖۘۢۜۢۖۘۤۙۙۦۘۜۥۘ";
                    break;
            }
        }
    }

    public int getAdId() {
        String str = "ۡۥۨ۟ۧۢۧ۠ۙۨۗۘۘۤۖۦ۬ۥۖۘۦۧۦۘ۬ۜ۬ۗۢ۠ۗۢۗۨۥۖۘۦ۟ۦۘۚۘۥۨۡۚ۫ۥۚ۟۫ۦ۠ۦۖۛۘۗ";
        while (true) {
            switch ((((str.hashCode() ^ 266) ^ 663) ^ 936) ^ 178773659) {
                case -1985540905:
                    return this.adId;
                case 1214750876:
                    str = "ۦ۫ۖۘ۟ۥ۫ۘۧۥۘۢۗۗۖۥۜۘۙۨ۠ۘۨۘۗ۠ۥۘۘۜۗۗۦۛ";
                    break;
            }
        }
    }

    public String getAdPlatformIcon() {
        String str = "ۖۦۦۘۚۛۢۘۙ۠ۧۢ۫ۦۤۚۨۙۨ۟۫ۛۥۚ۠ۡۛۜۚ۫ۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 417) ^ 943) ^ 314) ^ (-254734624)) {
                case -1122692809:
                    str = "ۡۤ۬ۘ۠۟ۥۙۜۘۖۖۤۜۖۖۙۡۘ۠ۚۦۘۗۛۖ۬۟ۡۚ۟ۤۨۗۥۘۘۙۘۗ۠ۡۘۗۡۥۚۛۗۢۖۜۘ";
                    break;
                case 1739533527:
                    return this.adPlatformIcon;
            }
        }
    }

    public int getAdPlatformId() {
        String str = "ۗ۠۟۬ۙۦۛۗ۫ۖۙ۠ۘ۟ۙ۠۠ۢ۬ۦۜ۬ۢۥۧۦۙۥۖۡۡۜۘۥ۫ۖۘۥۛۡۧۖۧۘ";
        while (true) {
            switch ((((str.hashCode() ^ 492) ^ 642) ^ UiMessage.CommandToUi.Command_Type.FW_SET_TEXT_VALUE) ^ 110393793) {
                case -1191665277:
                    return this.adPlatformId;
                case 2083610913:
                    str = "ۨ۟ۘۢۥۡۘۚۗۢۨ۟ۡۘۧۘۚۥ۠ۦۛۡۨۡۦۘۢۡۤۜۨۦۘۤۤۨۘ";
                    break;
            }
        }
    }

    public String getClickUrl() {
        String str = "ۚ۬ۚ۬ۛۜۚۜۖۧۙۦۘۖۦۡۘۥۡۡۘۙۡۡۘۜۚۤۢ۫ۧۤۥۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_ENABLED_VALUE) ^ 55) ^ UiMessage.CommandToUi.Command_Type.GET_BACKCOLOR_VALUE) ^ (-337588347)) {
                case -471793926:
                    return this.clickUrl;
                case 1822928939:
                    str = "ۘ۫۠۟ۨۘۡۢۛۙ۬ۗ۫۟ۙۘۙ۟ۡۡۦۘۡۙۖۛۜۘ۠ۦۖۘۜۜۘۦۧۧۛۛۜۡ۫ۦۘۘۖۘۥۘۤۗ۬ۚۡۥۨۘ";
                    break;
            }
        }
    }

    public int getCreativeType() {
        String str = "ۗۖۙ۫ۨۡۙۖۘۘ۬ۢۤۤۖ۟۫ۙۙۙۜۨۜۗۘۘۖۗۜۙ۫ۡۘۧۨۥۘۧۙ۬ۧۥ۠ۡۛ";
        while (true) {
            switch ((((str.hashCode() ^ 839) ^ 665) ^ 84) ^ (-83017749)) {
                case -65488994:
                    return this.creativeType;
                case 2116330014:
                    str = "ۦۚۥۘ۬ۦ۬۠ۡ۫ۗۢۘۘ۠ۨۦۘۨۖ۫ۗۡ۟ۛۥۜۘۥۚۧۡۘۛ۠ۗۖۢۜ۟ۜۦۘۚۧۧ۬۠۬ۗۜۘۚۥ۬۠ۨۧ";
                    break;
            }
        }
    }

    public int getDrawType() {
        String str = "ۖۥۧۘۨ۬۫ۙ۬ۨۢ۬ۥ۫ۡۜۘۧۢ۠ۘۘ۬ۙۦۗۧۡۦۧۘۘۖۦۥ۠ۦۤۘۜۘۘۥۨۢۧ۫ۜۘ۫۫۬";
        while (true) {
            switch ((((str.hashCode() ^ 636) ^ 820) ^ 707) ^ (-1897787310)) {
                case -1666112512:
                    return this.drawType;
                case -142176768:
                    str = "ۚۜ۟ۨۗۨۘ۬ۗ۫ۨۡۨۦ۟۫۟ۘۜۙ۟ۖۜۚۦۦۢۛۢۖۘ";
                    break;
            }
        }
    }

    public int getHeight() {
        String str = "۠ۦۥۧۢۨۦ۟ۛۗۢۢۨ۠ۘۘۚۨۜۘ۟۟ۗۖ۬ۜۨۡۙۡ۬ۧ";
        while (true) {
            switch ((((str.hashCode() ^ 331) ^ 799) ^ UiMessage.CommandToUi.Command_Type.SET_CHECK_BOX_VALUE) ^ (-182927819)) {
                case 1220463864:
                    return this.height;
                case 1999346300:
                    str = "ۖۡۘۥۦۜۘۥۦۖۘۧۧۖۘۚۤۨۘۤ۫ۧۤۨۛۤۜ۬۠ۜ۠ۖۚ";
                    break;
            }
        }
    }

    public OooO0O0 getImgs() {
        String str = "۟ۥۢۗ۠ۢۚۦۖۡۘۘۛ۠ۡۘ۬ۙۧۥ۟۠ۗۢۛۧ۫ۚۦۨۜۧۦۚۧۛۖۧۢۘۘۢ۟ۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 458) ^ 283) ^ 85) ^ (-702981189)) {
                case -1329993505:
                    return this.imgs;
                case 2014092341:
                    str = "ۖۘۨۘ۫۬ۚۚۢۦۡۤ۟ۦۥۘۙۚ۬ۤۡ۠۬ۗۘۗۛۘۡ۬ۦۘ۬ۦۥۘۡۧۖۘۚ۠ۗۦۖ۬ۢۚ۟ۨۧۥۙ۬ۡ۬ۦۙ";
                    break;
            }
        }
    }

    public int getRating() {
        String str = "ۖۗ۟ۗۦۘۜ۬ۧۥۛۚۤۨ۟ۢۗۡۘۧۜۖۤ۠ۧ۬ۛۥۘۘۤۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 643) ^ 899) ^ 540) ^ 1463924042) {
                case -957496948:
                    str = "ۧۘۨ۫ۘۖۘۨ۟ۙۨۥ۟ۤۤ۟ۢۧۡۘۧۡۨۥۚۢۥ۫ۛۧ۠";
                    break;
                case 1789808492:
                    return this.rating;
            }
        }
    }

    public String getTitle() {
        String str = "۟ۛۨۨۖ۬ۙۢ۠ۦ۠ۛۙۤۦۘۜ۠ۖۘۜۥۡ۟ۡ۟ۚۜۡ۫ۜۘ۟ۜۥۖۙۚۘۙۡۡۤ۠ۧۘۧۥۘۗ۟۟ۙۗۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 825) ^ 348) ^ 573) ^ (-986174408)) {
                case 1119255533:
                    return this.title;
                case 1967281940:
                    str = "۠ۦۨۘۘۗۨۘۜۤۧۥۨ۠ۥۡۗۨۤۧۘ۟ۧۘۗ۬ۡۤۨۘۜ۫ۡۘۘ۬ۖۘۚۙۥۘۡۗ۟۟ۚۨۡۖۘۘۤۗ";
                    break;
            }
        }
    }

    public OooO0OO getWebTracks() {
        String str = "ۖۜۡۛ۟ۡۘۙۨۙۖۖۦۘۧۧۙۧۧ۫ۢۦۨۘۢۢ۬ۨۖۦۘۙۜۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 543) ^ 114) ^ 484) ^ 1081066601) {
                case -349832286:
                    return this.webTracks;
                case 18940867:
                    str = "۠ۢۘۘ۟ۨۢۧۥۗۨ۬ۢ۬۟ۡۤۜ۫ۙۨ۬ۙۖۜۚۚۧۛۧۛۙۤۡ۠۟۬";
                    break;
            }
        }
    }

    public int getWidth() {
        String str = "ۦۨ۠۬۟ۡۜ۫ۨۢۛۛۛۨۦۘۢۡۦۘۜۙۜۘۙۖۘۘ۟ۧۘۥ۟ۨۘ۫ۢۥۘۚۙۖۥ۟ۦ۠ۤ";
        while (true) {
            switch ((((str.hashCode() ^ FragmentManagerImpl.ANIM_DUR) ^ 35) ^ UiMessage.CommandToUi.Command_Type.SET_TITLE_BACKCOLOR_VALUE) ^ (-1620540932)) {
                case -181087615:
                    return this.width;
                case 1416945615:
                    str = "۟ۡ۬ۗۚۦۘۛۗۖۘۤۗۦۘۘۙۘۘۙۨۥ۠ۥۧۘۙۢۖۙۧۡۙۥ۫";
                    break;
            }
        }
    }

    public void setActionName(int i) {
        String str = "ۥۢۗۖۖۧۘۗۖ۫ۙۡۚۦۛۥۙۤۢۙۘ۫ۦۙ۬ۖۨۡۙۚۛۛۘۙۧ۠ۡ۠ۥۗ۟۠۟ۢۗۧۖ۬ۖۘ۠۠ۢۧۛۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 735) ^ 345) ^ 791) ^ 481824168) {
                case -1684696685:
                    this.actionName = i;
                    str = "۠ۛۛۡۚۥۘۛۙۤۙۙۜۘ۫ۗۢۢۗ۟ۘۘۤۡۢۙۖ۠ۧۙۦ۟ۗۙ۫۟ۘۨ۬۠ۢ۫ۚۨۘ";
                    break;
                case -1427595411:
                    return;
                case 754181629:
                    str = "ۤۡ۟ۨۖۛۧۙۚ۬ۘۛ۠ۜۖۘۗۥۛۨۢ۟۬ۨۥۚۡ۫ۜۨۘۘ۠ۢۧ۫۫ۤۨ۬ۜۘۖۜۘۚۡۜۘۘۜ۬ۦۛۨۘۦۙۡۘ";
                    break;
                case 1743991657:
                    str = "ۢۢۘۘۗۥۦۘۖ۠ۢۘ۬ۘۘۘۚۗۧۢ۠ۤ۟ۖ۫۫ۡۧۖۤ۠ۖ۠۠ۨۘۛۦۗۦ۠۬ۡۖ۠ۢۥۥۘ۬ۤۤ";
                    break;
            }
        }
    }

    public void setAdId(int i) {
        String str = "۫ۛۜۘۡۡۢۚۜۚ۟ۘۙۢۤۖ۬۬ۦۙۢۗۥۘۗ۟ۡۧ۬ۛۧ";
        while (true) {
            switch ((((str.hashCode() ^ 127) ^ 939) ^ 98) ^ 1338273170) {
                case -1506305667:
                    str = "۬ۨۨ۟۠۠ۥۨۦۘۡۚۛۡ۬ۦۜ۬ۜۘۥۖۧۖۙۙۤ۬ۡۘۦۦ۬ۖۜۘۢ۠۠۟۬۟ۚۨ۟";
                    break;
                case -816575317:
                    str = "ۛۧۡۘۖۖ۠ۘۛۡۨۖۡۘۢۜۚۖ۠ۡۘۢۡۗۛۧۚۜۙۛ۠ۜۖۤ۠ۖ۫ۧۤ";
                    break;
                case 120487443:
                    return;
                case 812725887:
                    this.adId = i;
                    str = "ۛ۟ۜۘۤۚ۟ۡ۠ۘۘۦۥۘۘۗۖۢۡۙۡۖۘۘۚۤۛۗۛۡۘۡۧ۫ۜۛۗۖۤ۠ۖۡۢۤ۫ۢۦۛۛۜۨۡۘۚۜۡ۫۟ۡ";
                    break;
            }
        }
    }

    public void setAdPlatformIcon(String str) {
        String str2 = "ۙۦۜۘۗۗ۬ۤۗ۫ۜۜ۟ۜۛۢ۫ۚۘۘۛۦۦۢۗۤۘۚۜۛۙۚۚ۬ۨۜۧۨۘ۠ۢۧۦۡۨ";
        while (true) {
            switch ((((str2.hashCode() ^ 325) ^ 161) ^ 648) ^ (-950247243)) {
                case -2102269347:
                    return;
                case -929678014:
                    str2 = "ۖ۟ۤۢۚۛ۬ۦ۫ۢۥۘۙ۫ۖ۟ۙۗۦۗۤۗۖ۠ۛۛۜۡ۫ۗۘۢۢۘۘ۬۠ۦۧۘ۠ۡۗ";
                    break;
                case 802373918:
                    str2 = "۫ۘۡۘۢ۫ۖۘۢ۫۟۠ۗۨۘۛۗۖۦۢۘۙ۫ۛۛۧۖۖۜۜۖۚۦ";
                    break;
                case 2006107204:
                    this.adPlatformIcon = str;
                    str2 = "ۙۚۤ۠ۥۖۘۨۖ۠ۦۡ۫۫ۥۘۖۡۤۢۘۘۡ۠ۡۖۡۙۚۖۖۘ۬۟ۦۘۗۢۗۚۙۥۘۤۥ۫ۙۗۚۘۡۚ۬ۧۜۘۗۤۗ";
                    break;
            }
        }
    }

    public void setAdPlatformId(int i) {
        String str = "۬ۧۡۡۥۡۘۡۚۜۘ۫ۨۜۘۦ۠ۡۘۛۨۦۘۙۨۗۛ۠ۛۗۨۡۡۖۦۘۦۘۢۚۖۢ۫ۜۢۢ";
        while (true) {
            switch ((((str.hashCode() ^ 452) ^ 117) ^ 719) ^ (-1548487301)) {
                case -1850376384:
                    str = "۠ۥ۟ۡۢۚۥ۫ۙ۫ۢ۬ۘۢۤۘۢۖۘۨ۠ۨۘۘ۠ۜ۟۬ۨۘۚۛۤ۬ۦۚۘۢۜۡۛۧۥۥۘۦ۫ۜ۠ۗۦ";
                    break;
                case -122458415:
                    this.adPlatformId = i;
                    str = "۟ۨۛۤۢۡۘۚ۠ۡۘ۫ۜۡۘۘۘ۫۟ۨۧۨ۫ۡ۠ۨۦۧۨۜۦۤۦۘۦۤۧۗۤۥۦ۬۫ۖۗ۫ۖۡۢ۬ۧۜۚۨۘۤۙ";
                    break;
                case 455508756:
                    str = "۬۬ۗۖ۫ۡۘۙ۠ۨۘ۬ۙۨۘۡ۫ۘۘۘۧۥۢۗۡۦۡۘۘ۬۟ۦۡۗۨۘۚ۠ۘۦۡ۟۬ۖۖۘ";
                    break;
                case 795006832:
                    return;
            }
        }
    }

    public void setClickUrl(String str) {
        String str2 = "ۜۘۖۧ۟ۥۤ۟ۘۢۨ۫ۦۘۘۜۚۨ۫۠۬ۦ۫ۥۘۘ۫ۘۘ۬ۛۥۘۥۖۦ۠ۥۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 911) ^ 844) ^ 804) ^ (-1362586811)) {
                case -2085009415:
                    str2 = "ۗۖۦۘۨ۬ۜۘۙ۫ۡۘۡۚۡۘۘۧۖۘۜۘۦۘۛۥۥۘۛۜۡۖ۠ۖۚۦۗۘ۬ۢۧۗ۠ۗۚ۠ۖ۟";
                    break;
                case -1923025198:
                    return;
                case 924118281:
                    this.clickUrl = str;
                    str2 = "ۘۨۨۤۚۨۜ۬ۥ۬ۙ۠ۗۘۨۘۛۢۜ۠ۡۖۘ۠ۤۥۦۧۛ۬۬۬ۡۜ۟ۤۘۧۘۡۢۡۘۡۧۡ۫۬ۥ۟ۦۘۘۧۢۘ";
                    break;
                case 1879983745:
                    str2 = "ۚۙۜۘۖۘۘۖۢۦۥ۫ۚۗ۬ۘۘۤۧۧۧۗ۬ۜۘۦ۬ۨۚۦ۫";
                    break;
            }
        }
    }

    public void setCreativeType(int i) {
        String str = "۟ۨۥ۟ۤۜۨ۠۟ۚۦ۠ۢۨۛۢ۫ۦۗۚۢۥۚۦ۠ۥۖۡۢ۬";
        while (true) {
            switch ((((str.hashCode() ^ FragmentManagerImpl.ANIM_DUR) ^ 758) ^ 885) ^ 1172429205) {
                case -992147562:
                    str = "ۘۙۗۢۡۦۘۘۗۜۘۥۙۗۦۘۘۚۖ۠ۗۡۖۢۜۘۨۦۜۘ۟ۖۥۧۡۤۗۛۧ۬۠ۦۘۧ۫ۡۘۖۨۤۥۤۘۘ۟۫ۨۢۢ۫";
                    break;
                case 167954394:
                    return;
                case 573208203:
                    this.creativeType = i;
                    str = "۬۟ۜۘۖۙۨۥۜۦۘ۫ۨۡۥۨۛۘۨۘۘۧۢ۫ۧۚ۟ۗۤ۫ۤ۫ۖ";
                    break;
                case 1600441065:
                    str = "ۘۢۚ۫ۧۢۡ۫ۙۦۤۢۦۡۦۗۛۚ۫ۨۨۛۜۡۦۦۘۚ۫۟";
                    break;
            }
        }
    }

    public void setDrawType(int i) {
        String str = "ۤۨۜۘ۬ۨ۟ۛ۬ۛۥۦۘۜ۫ۥ۠ۖۜۘۨۖۚۡۧ۟ۧ۟ۘۘۖۡۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 443) ^ UiMessage.CommandToUi.Command_Type.GET_FW_TEXT_COLOR_VALUE) ^ 65) ^ (-1088000930)) {
                case -338833532:
                    this.drawType = i;
                    str = "ۗۗۜ۟ۙۘۖۤۜۘ۠ۙۘۘۛۤ۬ۜۗۥۙۛۙ۬ۥۘۘۙۨۜۜۦۖۘ";
                    break;
                case 3999178:
                    return;
                case 313134103:
                    str = "ۜ۬۫۠ۚۖۛۗۨۚۡۘۗۖۜۢۚ۬ۨۘ۟ۢۨۥۘ۫ۧۦۘۥۖۦۘۦۗۥۘۜۦۡۦۢۤۚۥۖ";
                    break;
                case 1955369893:
                    str = "ۚۗۦۥۧۢۗۦۥۘ۬ۖۘۖۚۙۘ۠۫۟۟ۢۙۜۥۤۖۥۙۤ";
                    break;
            }
        }
    }

    public void setHeight(int i) {
        String str = "ۨ۫ۜۘۙۧۘۜۦۡۜۡۡۘ۬ۛ۫ۙ۟ۥۡ۠ۦۤۖۧۘۜۖۖۘۛۧۦۖ۟ۖ۫ۘۡۚۚۡۘۧۦۦۘۡۖۦۙ۫ۦ۬ۛۦۧۙۦ";
        while (true) {
            switch ((((str.hashCode() ^ 97) ^ 639) ^ UiMessage.CommandToUi.Command_Type.SET_IMAGE_VIEW_VALUE) ^ (-1663954654)) {
                case -937038971:
                    return;
                case -613685808:
                    this.height = i;
                    str = "ۤ۫۟ۙ۬ۗۘۚۢۗۤ۠۫ۢۜۘۢۥۡ۟ۥۚۖ۠۟ۜۢۧۗۛۙۘۡۨ۫ۢۤۥۤۙۚۤۘۧۘۚۜۦۘۡۤ۠ۜۧۗ";
                    break;
                case 22123708:
                    str = "ۚۘۙ۬ۦۡۘۖۜۥۢۜۧۜۜۨۘۖۙۤ۫ۨۨۡۡۥۤۙۨۘۥۜۛ۫۫ۨ۫ۥۡۡۧۤۥۧۘ۟ۨۜۡ۠۬";
                    break;
                case 1877669069:
                    str = "۬ۥۡۘۡۤۖۘ۠ۧۜۚۘۡۘۖۢۨۘۥۘۜۘۤۘۘۡۡۤۗۙۢ۬۫ۨۙۡ۫ۥۘۨۘۨۤۤۧۧۨۦۜ۠ۤ۬ۥۘۖۦۛۘۙۦ";
                    break;
            }
        }
    }

    public void setImgs(OooO0O0 oooO0O0) {
        String str = "ۨۨ۫ۚۢۗۖۨۜۥ۟ۨ۬۟ۦۘۡۙۛۤ۬۫ۚۛۚۜ۠ۖۤۖۜۛۙۛۨۨۖۘۥۜۚ۫ۙۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 509) ^ 438) ^ 994) ^ (-1452153086)) {
                case -1524690745:
                    str = "۠ۖ۟ۥ۟۬ۢ۬ۘۘۤۘۖۗۜۦۘ۬ۘ۬ۚۚۗۢۖ۬۟۫ۚ۟ۨۖۧۙۘۡۗۧۙۥۤۜۨۖۛ۬ۡۘۛۡۜۨۨۜۘۨۦۚ";
                    break;
                case -838511870:
                    str = "ۡۘ۫۬ۚۘۘۥ۠ۗ۫۫۫ۘۙ۟ۤۥۜۘۧۧۦۨۛۖۥۛۘۥۦۨۘ";
                    break;
                case -607999982:
                    return;
                case 1826694466:
                    this.imgs = oooO0O0;
                    str = "ۘۤۥۜۗۥۘۦ۟ۜۘۦۧۦ۫ۡۧۢۥۡ۠ۘۘۥۡۦۧۗۡۘۛۦۧۘۢۜۡۘۙ۠ۘۘۚۜۚۚۛۥۘۤۜۘۡۖۡۘۙۘۙۛۙۖ";
                    break;
            }
        }
    }

    public void setRating(int i) {
        String str = "ۦۜ۫ۧۤۦ۬ۚ۠ۡۘۥۘ۠ۡۦۘۜ۠ۦۡۚۡۡۜۢ۠۫ۡۦۦۚۧ۟ۗۙۙۚۗۖ۬ۡۙ";
        while (true) {
            switch ((((str.hashCode() ^ 728) ^ 746) ^ 676) ^ 861332995) {
                case -1598747275:
                    str = "۟ۚ۟ۢ۠۟ۨۤۛ۬ۦۘ۟۬ۖۥۧ۠۠ۢۡۘ۟ۗۗ۬ۙۨۤۙۡ";
                    break;
                case -1421926232:
                    this.rating = i;
                    str = "ۡ۫ۛۜۜۖۘۨۚۧۙ۬ۡ۠ۡۖۘۧ۫۫۟ۙۥۘۦۨ۠ۧۡۘۡۨۨۨۚۥ۟ۖۛۙۡۥۘۧۧۥ";
                    break;
                case 1413132200:
                    return;
                case 1903467667:
                    str = "ۢۦۦۘۘۖ۟ۧۥۖۘۛۨۡۘۧۡۜۘۛۧۤۚۗۘۘۡۦۜۘۥۧۥۘۦۤۜۘۤۨۦ۬۟ۢۛۨۡۘ۠۬";
                    break;
            }
        }
    }

    public void setTitle(String str) {
        String str2 = "ۖۚۡۦ۫۬ۢ۫ۨۘۜۤۦۘۗۡ۟ۡۦۘۛ۟ۦۘۧۛۖۚۛ۟۫۠ۡۡ۠ۖۘ۠ۥ۟";
        while (true) {
            switch ((((str2.hashCode() ^ 597) ^ 821) ^ 377) ^ (-428138253)) {
                case -2046270593:
                    this.title = str;
                    str2 = "ۜۖۨ۟ۧۥۙ۠۫ۦۖۢ۟ۤۦۧۢۡۡ۫ۜۘ۫ۢۖۘ۫ۧ۟ۥۜۖۘۗۘۘۘۙۙ۟۠ۡۧۥۧ۫۠۫ۡۘۘۢۜۥۢۧۙۖۘ";
                    break;
                case -1101787315:
                    str2 = "ۡۥۡۤۢ۟ۜ۫ۥۥۨۢ۬ۢۥۥ۬ۙ۫ۙۜۘ۬۬ۧ۫۟ۖ۟۟ۡۖۜۘۧۨۥۘ۟ۨ۫ۖۜۖۘۛ۟ۨ۟۠ۘۘ";
                    break;
                case 1014254737:
                    return;
                case 1546625904:
                    str2 = "۠ۗۚ۬۟ۤۛۖۚۚ۬۬۫ۘۘۙۘۤۗۧۡۢۥۖ۟۠ۙۚۜ۫ۡۚۥۚۜۤۧۨۘۨۜ۬ۖۗۡۢۥۧۘ";
                    break;
            }
        }
    }

    public void setWebTracks(OooO0OO oooO0OO) {
        String str = "۬ۡۛۛۗ۬ۘۖۧۛۦۢۛۖۖۘۤۤۦۜۤۥ۟ۥۥۨۜۚۛۗۘۘۢ۠ۥۘ۠ۚ۬ۜۛۤۛۨۘۤ۠ۘۘۛۗۜۧ۟ۡۘۜۛۤ";
        while (true) {
            switch ((((str.hashCode() ^ 821) ^ 1002) ^ 66) ^ (-1452987969)) {
                case 647762287:
                    this.webTracks = oooO0OO;
                    str = "ۛۙۘۘۗۨۥۘۥ۠۠ۖ۫ۗۡۨۢۧۡۘۛ۟۠ۥۥۜۘۨۥ۬ۧۤۤ";
                    break;
                case 1385001277:
                    str = "ۤۚۘۘۦۘۘ۬ۜ۫۬ۤ۠ۨۡۤۚ۫ۦۢۗۥۤۙۚۧ۟ۙۜۧۗۢۤ۟۬ۖۜ۟ۖۚۥ۫ۜۘۧ۠ۗۥۘۡۘۖۗۙۦۧۥۘ";
                    break;
                case 1558770824:
                    str = "ۥۘ۬ۘۛۜ۬ۜۗۘ۠ۡۢۘ۠ۜۧۥۘۤۢۡۡۥۢۧۢۘۘۖۗۦۘ";
                    break;
                case 1735504172:
                    return;
            }
        }
    }

    public void setWidth(int i) {
        String str = "ۤۦ۠ۢۖۨۘۙۡۘ۬ۧۜۘ۟۬۬ۖۧۦۦۚۢۥۡ۫ۘ۟۫ۢ۫ۘۘۥ۟ۥۥۜۢۢۡۙۜۧۧ";
        while (true) {
            switch ((((str.hashCode() ^ 837) ^ 44) ^ UiMessage.CommandToUi.Command_Type.GET_ENABLED_VALUE) ^ (-433241962)) {
                case -1817786243:
                    str = "ۨ۫۬ۘۡۦۘۛ۠ۢۗۚۡۛۘ۟ۤۜۘۡۖۗۜ۫ۦۘ۟ۧۙۘۙ۠ۧۗۖۢۘۘ۠۬ۜۘۜۖۘۜۚۦۡۘ";
                    break;
                case -1653560018:
                    this.width = i;
                    str = "۬۫ۜۧۡۜۘۙ۠ۙ۫۬ۤۖۜۖۛ۟ۛۚ۬ۖۧۢۧۧۤۘۘۚۦ۠ۗۛۘۘۛۦۚ۟ۗۥۘ۠۬ۨۘ";
                    break;
                case 27590752:
                    return;
                case 1529042237:
                    str = "ۧۡۧۘۢۚۛۖۚۖۘۧۨۦۘۘۖۦۘۗۤۗ۫ۢۤۛۙۜۘۛۧۖۘ۟ۛۦۘۧ۟ۤ۬ۦۘ۬ۚ۟ۙ۟ۥۘۛۤۡۘۘۚۜۘۙۜۢ۫ۨ";
                    break;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = "ۤ۬۠ۤۥۤۗۘۧۥۥۖۘۦۚۢۧۥۦۘۛۛۤ۠ۙۡۗۙۛۙۙۥۤ۫ۡ";
        while (true) {
            switch ((((str.hashCode() ^ 318) ^ UiMessage.CommandToUi.Command_Type.SET_FONT_VALUE) ^ 930) ^ 741508899) {
                case -1969820830:
                    str = "ۘۤۧۦۨۥۧۦ۠ۘۧۚۙ۫ۥۘۘ۫ۡۘۘۡۢ۟ۡۜۘۘۗۖۘ۬ۡۘۘۘۗۨۘۧۢۗۘۨۥۡۙۜۜ۠ۨۜۨۘۘۛۘۙۦۖۧ";
                    break;
                case -1373745757:
                    str = "ۖۖۦۖ۟ۙۚۗۡۨۖ۫ۦ۫ۛ۬ۡۘۨۜۘۚ۟ۨۙۛۘۘۡۢۗۧۚۨۘۚۗۨۘ۟ۚۧۦۛۨۘۚۤۖۘۢۢۖۘ";
                    break;
                case -1113229732:
                    parcel.writeInt(this.height);
                    str = "ۛ۠۫ۡۡۦۘۢۡۥۘۙۗۡۙ۬ۘۛۙ۫ۖۥۘۨۤۖۘۡۘۨ۟ۢۙۤۡۗ۬ۧۨۘۗۜ۟ۗۡۧ";
                    break;
                case -583772905:
                    parcel.writeInt(this.drawType);
                    str = "ۙ۬ۖۦۗۖۘۤۤۦۧۙۦۙ۫ۘۘۙ۫۟ۗۡۢ۫۬ۤۤۘۘۗ۫ۘۘ";
                    break;
                case -433908112:
                    str = "۟ۧۥۥۧۖ۟ۚ۠۠ۥۨۢ۬ۖ۟ۨۢۛۤۥۘۤۜۧۘۦۦۦۘۤ۠ۗۚۚۚ۬ۦۦۘۘۗۗۖ۬ۡۘۦۤۚۘۘۛۜۥۡۘۗ۟";
                    break;
                case -343889724:
                    parcel.writeString(this.adPlatformIcon);
                    str = "ۚۢۗۛ۫ۗ۟ۚ۫ۢۚۥۘ۠ۧۢۧۡۗۥ۫ۖۤۜۥۘ۟ۧۛۧۜۗۗۚ۟ۜۖۥۜۚۛ۠۫ۜ";
                    break;
                case -36875328:
                    parcel.writeString(this.clickUrl);
                    str = "ۙۙۖ۠ۢۥۘۦۧ۫ۗۦۖ۫ۘ۫ۡ۫ۤۦۦۥۙ۠ۧۗ۬ۦۘۖۦۜۘۙۖۥۘۙۚۚۥۙۘۘۖۜۨ";
                    break;
                case 151602147:
                    parcel.writeInt(this.adId);
                    str = "ۘۛۥۘ۠ۡۗۢۨۘۘ۫ۚۘۘ۫ۦ۠ۤۢۢۜۨۨۘ۫ۙۛۖۛۘۘۛۜۗۖۦۚۛۤۖۥۙۡۤ۠ۘۘ۬ۧۚ۠ۤ۫۬ۖۛۢۚۚ";
                    break;
                case 337850377:
                    parcel.writeInt(this.rating);
                    str = "ۡۤۘۤۛۖۘۘۦۛۘۦۛ۟ۨۦۘۥۡۨۘۚۥۘۦۙۦۘۢۢۡۘ۫ۥۦۚۧۤۢۘۤ";
                    break;
                case 476376659:
                    return;
                case 476502685:
                    parcel.writeInt(this.width);
                    str = "ۡ۟ۢۤۤۜۢۥ۬ۢۜ۫ۖۘ۠ۗ۟۠ۖۛۧ۟ۜۢۚۨ۫ۛۧۡۥ۬۬ۧ";
                    break;
                case 939949948:
                    parcel.writeInt(this.adPlatformId);
                    str = "ۙۖۖۢۘۧۘۖۤ۫ۥۥ۬ۤ۫ۡۘۡۢ۬۬ۨۛۘۖۡۘۘ۬ۖۘۦۤۡۘۢۛۖۘ۟۫۟ۨۛۦۤۨ۟ۥ۠ۛۙ";
                    break;
                case 983607894:
                    parcel.writeString(this.title);
                    str = "ۚۖۤۗۡۡۘۡ۟ۙۥ۠ۜۘۧ۫ۚ۠ۗۧۦ۫ۨۨۡۜۘۤ۬۬ۜۨ۫ۙ۟۠ۧۖۦۘ۫ۡ۬۟ۥ۟ۥ۠ۧ۠۬۬";
                    break;
                case 1579274045:
                    parcel.writeInt(this.actionName);
                    str = "۠ۥ۠۫ۨ۬ۖ۫ۥۘۨۜۘۦۙۚۖۙۤۤۦۡۧۜۘۙ۫ۢ۫۫ۗ۠ۙۡۛۡ۫ۜۢۦۨۥۧۚۘۘۗۥۖۘ";
                    break;
                case 1993567937:
                    parcel.writeInt(this.creativeType);
                    str = "ۨۜۨۘۙ۫ۖۛۤۘۘۚۨۙ۟ۢ۠۬۫ۨ۫ۖۨۘۢ۫۠ۚۥۛ۫ۤۗ";
                    break;
            }
        }
    }
}
