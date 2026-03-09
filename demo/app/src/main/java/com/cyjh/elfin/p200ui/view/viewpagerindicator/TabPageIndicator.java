package com.cyjh.elfin.p200ui.view.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import cn.haorui.sdk.adsail_ad.view.scaleImage.SubsamplingScaleImageView;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;
import p285z2.C4095le;
import p285z2.C4535xa;
import p285z2.InterfaceC4498wa;
import p285z2.InterfaceC4572ya;

/* JADX INFO: loaded from: classes.dex */
public class TabPageIndicator extends HorizontalScrollView implements InterfaceC4572ya {
    private static final CharSequence Oooooo;
    private Runnable OoooOoO;
    private final View.OnClickListener OoooOoo;
    private final C4535xa Ooooo00;
    private ViewPager Ooooo0o;
    private ViewPager.OnPageChangeListener OooooO0;
    private int OooooOO;
    private int OooooOo;
    private OooO0OO Oooooo0;

    public class OooO00o implements View.OnClickListener {
        public final TabPageIndicator OoooOoO;

        public OooO00o(TabPageIndicator tabPageIndicator) {
            this.OoooOoO = tabPageIndicator;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OooO0o oooO0o = null;
            String str = "ۖۧۜۘ۬۫ۨ۫ۘۖۘۗۥۦۡۚ۬ۘ۫۠ۧ۠ۡۗ۬ۖۘۢۧۘۘۖۖۨ";
            int iOooO0O0 = 0;
            int currentItem = 0;
            while (true) {
                switch ((((str.hashCode() ^ 201) ^ 595) ^ 859) ^ 682088190) {
                    case -879469749:
                        TabPageIndicator.OooO0Oo(this.OoooOoO).OooO00o(iOooO0O0);
                        str = "۬ۖۨۘۤ۠ۙۖ۠ۗۜۚۦۘ۟ۘۖۘۢ۟ۛۥۡۘۘۢۨۘۘۛۗۡ۟۟ۡ۫ۧ۬ۡۛ۠";
                        continue;
                    case -329353787:
                        str = "ۛۧۦۘۖۨۡۘۛۜۧۘۧۥ۬ۚۡۨۚۤۢۦۖۡ۟۠ۡۘۘۘۜۥۜۜۘۘۢۜۘ۠ۙۖۘ۬۫ۤۛۙۙ۬ۥۘ۠۟ۡۘ";
                        oooO0o = (OooO0o) view;
                        continue;
                    case -154517525:
                        String str2 = "ۗۢۗۢۡۡ۬ۨۖۘۦ۫ۜ۠۫۬۟ۡۜۤ۠۬ۥۙۘۘۡ۟۫۬ۥۜ۫ۧۙ۫";
                        while (true) {
                            switch (str2.hashCode() ^ (-1087994787)) {
                                case -473263892:
                                    str2 = "ۙ۠۟ۖۖۦۘ۟ۥۖۘۜۡ۟ۜۨۘ۬۫۬ۧۘۙۡۦۘۛۡۧۗۖۨۘ";
                                    break;
                                case 669068625:
                                    String str3 = "ۙۤ۟ۦۡۢ۠ۘۦۘۚۘۜۘ۠۫ۗۙۗۡۦ۠ۚ۟ۚۤۥ۬ۢۖۖۤ۠ۡۘۜۧۖۘۜۨۦۖۢۤ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-1872320616)) {
                                            case -1999338427:
                                                str3 = "ۦۙ۟ۦۢۘۘ۠ۜ۟۫ۤۘۙ۟۬ۜۦۙۛ۬ۦۘۥۥۛۘۨۘۙۙۙ۬ۚ۫۫۫ۢۦ۟ۜۥۡۨ";
                                                break;
                                            case -1188455878:
                                                str3 = currentItem == iOooO0O0 ? "ۡ۟۠ۦۧۢ۟۫ۡۧۜۡۤۘۜۘۗۜۖۗ۫ۗۨ۟ۖۗۜۥۘ۟۟ۤۧ۫ۜۘۤۡۖۘۖۖۥۘۦۙۥۘ" : "۬ۛۥۘۥۦۛۦۜۖۘۥۗۖۥۧۙۛۚ۠ۧۚۦۜۜ۟ۨۘۨۘ۠۫۟ۚۖۨۦ۬ۢۤۖۛۖۜۡۘۨۗۚۗۜۘۘۛۖۖۘۜۜۜۘ";
                                                break;
                                            case -1037744795:
                                                str2 = "۟ۖۖۘۚۛۘۥۚ۠ۙۧۦۘۗ۫ۡۘۥۜۘ۫۬ۖۗۗۦۘۤۡۡۧ۠ۖۘ۠ۛۥۘۢۗۥۘ";
                                                break;
                                            case 677269298:
                                                str2 = "۠ۡ۠ۖ۬ۨۘۗ۬ۜۥ۫۠ۗ۠ۥۘۤۗۛ۠ۛۦۗۥۤۙۖۗ۫ۗۦۗۙۨ۬ۗۤۛ۟ۨۘۖۡۘۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1155978090:
                                    break;
                                case 1280557057:
                                    str = "ۖۤۘۘ۬ۚۡۛ۠ۧۧۖۥۥۛۗۙۖۜۘۘۤۛ۠ۜۡ۠ۢۦۘۨۙۡۘ";
                                    break;
                            }
                        }
                        break;
                    case -36800780:
                        str = "۫ۨۨۘۘۚۙۚۖۜۖ۫ۡۚۧۢۘۛۢۗۡۜۘۤۡۗۨۢۜۘۛۗ۟ۙۛۤۦ۟ۘۘۙ۟ۢۤۤۘ۬۫ۜۜ۟ۛ";
                        continue;
                    case 118497907:
                        str = "ۗۙۦ۠ۢۙۥۨۛۖۧ۬ۦۖۡۗۤۡۚۡۘۦ۬ۖۘۥۛۥۘۤۡۧۘ۬ۡ۬۬۠ۥۘۙۤۜۤۢ۫ۦۢۙۗۖۢۖ۬ۗۤۚۜۘ";
                        currentItem = TabPageIndicator.OooO0OO(this.OoooOoO).getCurrentItem();
                        continue;
                    case 705412369:
                        TabPageIndicator.OooO0OO(this.OoooOoO).setCurrentItem(iOooO0O0);
                        str = "۟ۥۛۧۥۡۘۛۦۡۤۧۨۘۗۧۥۖ۫۟ۗۧ۠۠ۖۨۖۨۛ۫ۛۗ";
                        continue;
                    case 1258691468:
                        String str4 = "ۡ۠ۘۘ۫ۜۤۖۖ۬۫ۖ۫ۨۘۤۦۡۘۘ۫ۨۘۘۡۘۘۤ۬۠۫۟ۥۘۥ۫ۨۛ۟ۢ";
                        while (true) {
                            switch (str4.hashCode() ^ (-1325059596)) {
                                case -1161094515:
                                    break;
                                case -35668630:
                                    str = "ۗ۫ۥۨۥۥۘ۬ۚۦۘۤۨۘۘۚۡۡ۫ۚۥۧ۟۠۫۫۬ۢۡۧ۟۟۠ۨۨۥۖۦۜۘۙۨۚۛۘۥۘۙۤۖۘۚۚۨ";
                                    break;
                                case 318221322:
                                    String str5 = "ۖۢۜۘ۟ۛۗۧ۫ۛۛۡۖ۬ۚۘ۠۬ۡۘ۠۟۬ۙ۬ۡۘۘ۟ۤۛۨۛۗۡۛۚۜۡۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-1319777353)) {
                                            case -1884358986:
                                                str4 = "ۚ۬ۖۙ۫ۙۦۗۘۘۨ۟ۦۨ۟ۨۘۦۥۖۘۛۗۜۙۘۦۘ۫ۛۦ۠ۨۢۤۚۙۗۡۡۙۘۗۨۜۧ۠۠ۨۘۗۥۢ";
                                                break;
                                            case -716527704:
                                                str5 = "ۘۢۤۡۥ۟ۙۧۦ۠ۨۥۛ۬ۜ۠۫۠ۤۥۨۖۡۧ۟ۗۦۘۤۦۡۙ۠ۜۨ۬۠ۗۜۥۘۛۦۚۥ۫ۗۨۡۡۘ";
                                                break;
                                            case 773192052:
                                                str5 = TabPageIndicator.OooO0Oo(this.OoooOoO) != null ? "ۘۙۖۥۡ۬۬ۢۡۘۜۚۘۙۢۗۛۨۘۙۘۜۘۗ۠ۤۨۤۥۜۡۢۖۡۗۘۘۦ" : "ۖۜۥۖۡ۟ۢ۟ۖۗۖ۟۠ۢۘۘۦ۬ۦۡۧۨۘۛۗۦۘۦۖۖۘ۫ۡۚ۠ۖۙۨۢۜۘ۠ۗۡۘۢ۫ۦۛۡۤۙۙۚ";
                                                break;
                                            case 1606025737:
                                                str4 = "ۧۛۢۜۧۨۘۙۢۢۛۨ۬ۘۗۥۘ۟ۢ۟ۢۤۥ۠ۗۙۙۡۨۘۡۨۘۚۚۜۢۨۖۜۥۥۚۗۘۘۜۤۨۘۥۗۘۚ۟ۡۖۤۛ";
                                                break;
                                        }
                                    }
                                    break;
                                case 794630391:
                                    str4 = "۟ۥ۠ۢ۫ۜۡۘ۫۠ۖۖۘۚ۠ۦۛۡۢۦۢۗ۫۟ۖۘۛۘ۫ۖۖۘۚ۠ۤۦ۟ۥۘ";
                                    break;
                            }
                        }
                        break;
                    case 1268235253:
                        iOooO0O0 = oooO0o.OooO0O0();
                        str = "ۛۚۜۤۡۖۘۗۜۜۘۖۛۖۘۧۨ۟ۡۚۨ۟ۜ۫ۢۡۨۘ۬۠۟ۤۢ۠ۚۘ۫ۚۥۡۜ۫ۚۜۦۡۘۦۦۢ۠ۙۛۙ۫ۥۚۙۘۘ";
                        continue;
                    case 1432129030:
                        str = "ۥۤ۠ۡۜۧۙۖۘ۬۫ۘۘۡ۫ۢۜۧۖۦۗۡۨۧۙۢۘ۟ۤۡ";
                        continue;
                    case 1637142562:
                        return;
                }
                str = "۬ۖۨۘۤ۠ۙۖ۠ۗۜۚۦۘ۟ۘۖۘۢ۟ۛۥۡۘۘۢۨۘۘۛۗۡ۟۟ۡ۫ۧ۬ۡۛ۠";
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public final View OoooOoO;
        public final TabPageIndicator OoooOoo;

        public OooO0O0(TabPageIndicator tabPageIndicator, View view) {
            this.OoooOoo = tabPageIndicator;
            this.OoooOoO = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۙۛۚۗۨۧۜۛۜ۫ۗۢ۫ۨۖۘۖۧۧۤۦۛۙ۫ۛۢۡۢۧ۠ۙ۟ۧۨۘۡۚۧۨۡۘۘ";
            int width = 0;
            int left = 0;
            while (true) {
                switch ((((str.hashCode() ^ 903) ^ 906) ^ 343) ^ 1963482555) {
                    case -1380310429:
                        str = "۬ۥۚ۟ۛۚ۠ۨ۠ۢۡۘ۠ۤۤۦۨۜۘۡۚ۬ۧ۟ۖۘۥۧۨۘۗۨ۬ۖۨۦ۠ۡۤۗۜۦۤۗۛۡۚۥۛۗۘۢ۫ۥۚ۟ۥ";
                        break;
                    case -863790169:
                        left = this.OoooOoO.getLeft();
                        str = "ۨ۟ۛۥۢۘۘۚ۬ۖۗۥ۟ۖۙۘۘۘۜۡۘ۠ۙۤۙۗۚۗۜۘ۟ۖۨۘۖۥۧۘۨۛۘ";
                        break;
                    case 125895282:
                        return;
                    case 431114921:
                        width = (this.OoooOoo.getWidth() - this.OoooOoO.getWidth()) / 2;
                        str = "ۚۖۥۘۛ۬ۜ۟ۜۘۡۘۜۢۡۧۘۧۜۜۚ۬ۧ۠ۦۘۘۥ۠۬ۦ";
                        break;
                    case 1175458078:
                        this.OoooOoo.smoothScrollTo(left - width, 0);
                        str = "ۜ۟ۖۜۛۧۘۨۧۘۗۛۡۖۘۘۛۢۨ۠ۛۡۘ۬ۙۨۥۖۨۜۢۗۛ۠ۥۘۧۙۖۘۘ۫۬ۗۦۡ";
                        break;
                    case 1744563063:
                        TabPageIndicator.OooO0o0(this.OoooOoo, null);
                        str = "ۚ۠ۛۙۧۤۙۚۨۨۢۥۘۚ۟ۜۨۧۘۗۗۘ۬ۥۜۘ۠ۗۚۙۖۛ";
                        break;
                }
            }
        }
    }

    public interface OooO0OO {
        void OooO00o(int i);
    }

    public class OooO0o extends TextView {
        private int OoooOoO;
        public final TabPageIndicator OoooOoo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(TabPageIndicator tabPageIndicator, Context context) {
            super(context, null, R.attr.vpiTabPageIndicatorStyle);
            this.OoooOoo = tabPageIndicator;
        }

        public static /* synthetic */ int OooO00o(OooO0o oooO0o, int i) {
            String str = "ۘۢۘۙۧۘۙۡۘۢۖۥۚۢۜۦ۬ۗ۫ۡۘۥۨۙ۬ۙۗۜۗۡ";
            while (true) {
                switch ((((str.hashCode() ^ 400) ^ 120) ^ 917) ^ 730065387) {
                    case -1705921901:
                        oooO0o.OoooOoO = i;
                        str = "۫ۖۖۘۨۦۡۘۥۦ۠ۨۤۦۤۥۙۖ۬ۗۥۦۡۖۚۚۤۛۨۘۡۙۜۤۚ۠ۘ۫ۡۖ۬ۜۘۨۢۘۘۢۨۧۘۗۖ۫۬ۢۖۘ۫ۚۚ";
                        break;
                    case -404826743:
                        return i;
                    case 557179964:
                        str = "ۛ۠ۙۗۘۨۥۡۙۧ۠ۘۜ۟ۧۧۘۘۤۨۘۘ۠ۥۙۛۘۚ۬ۨۜۘۦۥۤۘۙۘۘۥۧۨۘۜ۬۠ۡۨ۠ۢۖۧۦ۟ۚۛۜۘ";
                        break;
                    case 2127344467:
                        str = "ۘۛۛۗۙ۫ۛۧۘ۫ۤ۬ۤۤۧۨۨۘۨۦۡۘۘۚۖۘۡۚۦۘ۬ۨۜۘ";
                        break;
                }
            }
        }

        public int OooO0O0() {
            String str = "۫ۡۨۘ۟ۚۧۨ۟ۙۖ۬ۚۜۚۧۧۢۚ۠ۛۨۘۢۘۖ۟ۢۜۚۗۦۘ۬ۨۨ۠ۚۛۧۛۗۦۛۢۚۜۘۦ۠ۡۡۗۖۘ۬۟ۛ";
            while (true) {
                switch ((((str.hashCode() ^ 525) ^ 132) ^ 334) ^ 1347993558) {
                    case 528949578:
                        return this.OoooOoO;
                    case 2067691742:
                        str = "۠ۥۡ۠۠ۜۚۘۗۢۚۜۙۖۥۘۢۢۖۙۦۤ۠۫ۥ۬ۤۛ۫ۙۙۡۘۜۖۗۥۘۙۤۦۘۥۙۤ۟۫ۧۗۢۡۘۦۥۗۙۦۥۘ";
                        break;
                }
            }
        }

        @Override // android.widget.TextView, android.view.View
        public void onMeasure(int i, int i2) {
            String str = "ۙ۬ۥ۬۟ۨۜۢ۟ۜۡۘۘۖۖۨۘۧۘۢۙۨۘۧ۠ۙۚ۫ۥۗۗ۬ۛۧۤۥۨۖۘ۫ۦۜۘۛۖۡۧ۬۠ۦۤ۠۫ۗۦۘۙۛ۬";
            while (true) {
                switch ((((str.hashCode() ^ 809) ^ 111) ^ 106) ^ (-1429763514)) {
                    case -2033293996:
                        str = "ۤۦۜۗۧۜۗۥۧۘ۬ۢۤۗۘۦۘۙۨۘۨۨۨۗ۟ۘۥۥۘۖۙ۟ۥۜۘ۟ۛۨ";
                        continue;
                    case -1017031366:
                        str = "۫ۨ۫۟ۘۖۘۙۗۙۡۛۙۥۦۗۛ۠ۙۢۗۦۚۜۘۗۡۜۘۙۘۛ";
                        continue;
                    case -879828103:
                        String str2 = "ۖۛۥۨۦۘۡۥۖۘۢۜۚۜۨۘ۬ۨۨۗۢۙۤ۠ۦۢ۬ۜۘۜۤۦ۟ۚۙۥۦ۟۟ۥۛ۠ۜ۬ۘۛۥۤۢ۟ۡۧۘ۬ۨۖ";
                        while (true) {
                            switch (str2.hashCode() ^ (-888392714)) {
                                case -1740977176:
                                    String str3 = "ۤ۬ۖۦ۠۬ۖ۠ۘۘ۟۫ۛۦۜ۬۫ۤۘۜ۠ۨۘ۫ۡۡ۟۫۬۫ۛۡۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 595099430) {
                                            case -1800361236:
                                                str3 = "ۜ۬ۢۛۡۧۗۙۡ۫ۧۡۦ۟۟ۥۨۛ۠ۡۙۛۖۦۦۨۘۡۤ۬۟ۥۡۘ۬ۢۚ";
                                                break;
                                            case -18883716:
                                                str3 = getMeasuredWidth() > TabPageIndicator.OooO0o(this.OoooOoo) ? "ۘ۟ۦۗ۬ۨۘۢۨۧ۫ۡۨۙۦ۠ۨۥۜۘۙ۟ۖ۫ۡۧ۠ۡۦۦۖۡۘۤۗۘۗۦۥۥۢۧۜۧۜۨ۟ۗۙۨۘۘۜۚ۫" : "ۥۨۡۘۜۖۖۘ۬ۗ۬ۙۜۘۘۤۗ۠ۢۖۨۘۥۦۦۘۛۙۜۘ۠ۜۨۘۧۖ۫";
                                                break;
                                            case 86536550:
                                                str2 = "ۡۡۖۘۨۚۙ۠۫ۦۘۤۥ۫ۦۛۘۥۨۜ۟۟ۡۤۡۛۧۤۖۘ۠۫ۖۘ۠ۘۤ۠ۖۡۙ۠ۗ۬ۧۦۥۜۗۦۚۤ۬ۜۗ۠ۛۘۘ";
                                                break;
                                            case 1973139676:
                                                str2 = "ۧ۬ۡۘۖ۫۟ۧۜۡۘۦۧۨۘۥۨۜۘۚۡۧۡۙۡۘۦ۫۠ۘ۠ۨۚۢۡ";
                                                break;
                                        }
                                    }
                                    break;
                                case 28451335:
                                    break;
                                case 309236493:
                                    str = "۫ۨۙ۫ۤۢۥۘۘۘۦ۬ۙۧۜۘۘ۫ۗۥۥۨۘۖۙۥۜۨۡ۫۠ۨ";
                                    break;
                                case 1999436601:
                                    str2 = "ۧۛۥۘۥ۠۫ۥۖ۟ۙۡۨۘۗۜۢۨۤۚ۬۠ۡۡ۟ۨۘۡۦۤۖ۟ۤۧۥۗۗۛ۟";
                                    break;
                            }
                        }
                        break;
                    case -472161988:
                        String str4 = "ۤۤۘۧۚۢ۫ۨۖۘۗ۬ۨۧۖۙ۬ۥۡ۫ۧۤۤۤۚۚۧۗ۬ۧ۫ۢۦۦۘۜ۬ۖۘ۬ۤۤۚۡۙ";
                        while (true) {
                            switch (str4.hashCode() ^ 1679201412) {
                                case -918591547:
                                    String str5 = "ۧۧۜۘۚۡۨۘۨۤۥۘۜۛ۬ۜ۟ۗۛ۬۬۠ۥۜۘۥۛۡۢۖۖۧۘۥۦۗۨۘ۠ۘ۟۠۟۠ۗۛۦۘۛ۫ۜۘ۠ۨۢۧۙ۫ۦۡۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-207032758)) {
                                            case -1925665155:
                                                str5 = TabPageIndicator.OooO0o(this.OoooOoo) > 0 ? "ۘۢۜۘۙۖ۫ۛۙۤۙۧۖۘ۬ۘ۠ۡۗۨۘۦ۟ۥۗۘۘۘ۠۟ۜۡۥۘۨۨۦ۬ۘۤۦۗۦۘۧۚۙۗۧۜۘۗ۬۬ۙۛۢۘ۬ۨۘ" : "۠۬ۥۘۚ۫ۤۥۘۢۡ۬ۤۨۗۤۦۘۧۡۛ۠ۘۧ۫ۜۡۘۘ۟ۦۙۧۢ۫ۨۡۘ۬ۢ۠ۡۢۦۘۦۥ۬۟۬ۚ";
                                                break;
                                            case -1109088513:
                                                str4 = "ۤۢۦۘۙ۬ۥ۠ۤۥۘۗۛۙۦ۫ۜۘۘ۫ۢۗۧۜۘۙۦۢ۟ۛۤۘۦۘ";
                                                break;
                                            case 242995448:
                                                str5 = "۫ۥۙۚۧۨۘۛۦۨۜۥۥۤۛ۫ۚۗۡۡ۟ۡۥۘۨ۠ۢ۬ۨۜۙ۠ۨۤۤۜۘ۠ۢۢۛۜۚ";
                                                break;
                                            case 1419295391:
                                                str4 = "ۖۨۧۜۘۚ۬ۚۛۙ۟ۘۘۥۤۧۤ۟ۦۡۥۨۘۗ۠ۨۘۛۜ۠ۙۗۘۘۙۛۚۛ۫۬ۘۡۛۥۢۖ۬ۙۛۥۦ";
                                                break;
                                        }
                                    }
                                    break;
                                case -756173510:
                                    str = "ۖۦۘۘۙۢۙ۫ۛۛۘ۫ۙۡۜۥۘ۫ۤۜ۬۠۫ۛۡۖۘۧۗ۬ۙ۬ۙۜۧۦ۬ۗۘۘۛ۬ۦۤ۬۬ۧۛۢۨۙ۬";
                                    break;
                                case -347580443:
                                    break;
                                case 133129277:
                                    str4 = "۬ۘۘۘۡ۬ۜۘۡ۟۬۠۠۬ۨۢۦۘۘۦۤۜ۫ۖۚ۫۬ۨۘۡۘ۟ۖۥۘ";
                                    break;
                            }
                        }
                        break;
                    case -40398097:
                        return;
                    case 550132534:
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.OooO0o(this.OoooOoo), 1073741824), i2);
                        str = "ۢۙۚۥۘۨۨۦۚۡۥۚۥ۫۠۠ۜۘۙۛۥۡ۬۫ۦۙۦۘۜۚۖۘۗۛۛۜ۬۫ۗۚۜ۬ۦ۫ۧۘۧۘۘ۟ۜۘۤۗۘۘ۫ۚۦۘ";
                        continue;
                    case 1349374924:
                        str = "ۙۡ۠۬۠ۥۘۜۡۘۘۜۜ۠ۤۜۙۙۜۜۤۥ۠ۙۖۖۘۜۨۛۧۨۡۧۗۛۧۢۗۖۢۘۘۦۢۘۦۨ۟ۚ۠ۢ";
                        continue;
                    case 1652418057:
                        super.onMeasure(i, i2);
                        str = "ۥۦۨۘۤۚۡۘۜ۠۬ۙۤۦۖ۟ۜ۠ۘۘۤۡۖ۠ۚۖۘ۫ۢ۟ۙۘۤ۠۬ۤۙۜۜۛۤۥۨۦۚۖۤ۠ۘ۫ۘۥۨۤ۬ۜ۟";
                        continue;
                }
                str = "ۢۙۚۥۘۨۨۦۚۡۥۚۥ۫۠۠ۜۘۙۛۥۡ۬۫ۦۙۦۘۜۚۖۘۗۛۛۜ۬۫ۗۚۜ۬ۦ۫ۧۘۧۘۘ۟ۜۘۤۗۘۘ۫ۚۦۘ";
            }
        }
    }

    static {
        String str = "ۜ۫۠۟ۡۢ۬۟ۨۡۧ۟ۤۖۥۘ۫ۢۜ۫ۢۜۜۙۗۦۜۙۡۢ۠۬ۘۢۨۢ";
        while (true) {
            switch ((((str.hashCode() ^ 50) ^ 371) ^ 717) ^ (-1033206732)) {
                case -630731870:
                    return;
                case -383484790:
                    Oooooo = "";
                    str = "ۛ۬۬ۨۡۗ۠ۚۨۥۥ۫ۛۡ۟ۡۖۜۗۛۜۙۦۦۘ۠۬ۘۛ۬ۙۖۛ۬ۙۢۥ";
                    break;
            }
        }
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    public TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OoooOoo = new OooO00o(this);
        setHorizontalScrollBarEnabled(false);
        C4535xa c4535xa = new C4535xa(context, R.attr.vpiTabPageIndicatorStyle);
        this.Ooooo00 = c4535xa;
        addView(c4535xa, new ViewGroup.LayoutParams(-2, -1));
    }

    public static /* synthetic */ ViewPager OooO0OO(TabPageIndicator tabPageIndicator) {
        String str = "ۚ۟ۙ۫ۧۡۨ۠ۖۘۨۜۨۘۤۥۖۘۥۥۚۤ۠ۛۖ۠ۖ۫ۨۥۘۛۢۚۢۡۛۥۖۧۘ۠ۢۥۘ۫ۖۡۡۖۦۡ۫ۚۡ۫ۧۗۢ";
        while (true) {
            switch ((((str.hashCode() ^ 332) ^ 852) ^ 457) ^ 331388910) {
                case 1588908551:
                    str = "ۜۡۤۛۤۗۖ۠۬ۢۤۥۧۗۡۖۙۢ۬ۜۧۘ۫ۨۡۧۨۘۘ۠ۘۤ۬ۜۘۢۢۡ";
                    break;
                case 1682688256:
                    return tabPageIndicator.Ooooo0o;
            }
        }
    }

    public static /* synthetic */ OooO0OO OooO0Oo(TabPageIndicator tabPageIndicator) {
        String str = "ۦ۬ۜۛۛۢ۟ۨ۬ۦۢۚۚ۠ۡۡ۟۟ۢۢۤۢۘۛۖۛۨۧۗ۫ۥۘۢ۟ۥ";
        while (true) {
            switch ((((str.hashCode() ^ 542) ^ 383) ^ 730) ^ (-372684231)) {
                case -1878278899:
                    str = "ۙۚ۠ۥۢۨۚۤۢ۫ۦۦۥۛۙۤۜۨۘۨۙۥۚ۟ۧۢۤ۟۬ۙۥۘ";
                    break;
                case -1877757599:
                    return tabPageIndicator.Oooooo0;
            }
        }
    }

    public static /* synthetic */ int OooO0o(TabPageIndicator tabPageIndicator) {
        String str = "ۡ۫ۥۘۡ۬۠۟ۤۖۢۗۧۨۙۜ۠ۦۦۜۥۘۚۥۨۧۤۛۙۧۥ۫ۘ۟ۖۘۦۘۜ۠ۦۙۡۘ۫۬ۖۡ۫ۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 729) ^ 313) ^ SubsamplingScaleImageView.ORIENTATION_270) ^ (-92932773)) {
                case 930826184:
                    return tabPageIndicator.OooooOO;
                case 1882348631:
                    str = "ۛۚۘۚۙ۬۬ۢۥۘ۬ۜۖ۟ۘۦۘۢۧۦۢۢۛۥۛۨۤۖۚۙۖۤۢ۠۫ۘۛ۫۫ۖۨۘ۟۫ۢ";
                    break;
            }
        }
    }

    public static /* synthetic */ Runnable OooO0o0(TabPageIndicator tabPageIndicator, Runnable runnable) {
        String str = "۠۬۬ۗۢۨۖ۟ۗ۟ۨۘ۠ۡۦۨ۟ۢۨۛۥۘۨۛۡۛۜۨۘۙ۫";
        while (true) {
            switch ((((str.hashCode() ^ 909) ^ 129) ^ UiMessage.CommandToUi.Command_Type.SET_BOTTON_VALUE) ^ (-1357934313)) {
                case -265265451:
                    return runnable;
                case 1228378647:
                    str = "۠ۙۦۘ۬ۡ۫ۖ۫ۦۘ۟ۡۖۘۘ۠ۗۦۥۡۙۨۤۘۥۗۥ۬ۨۛۢۥۘ";
                    break;
                case 1781426083:
                    tabPageIndicator.OoooOoO = runnable;
                    str = "ۦۦۥۥۜۚۙ۠ۥۨۚۨۘۦۡۘۢۥۤ۫ۘۘ۟ۛۥۘ۠ۘ۬ۨۛ۬ۘۚ۟ۚۚۢۦۘۘۘۙۤۡۘۘۧ۬۬ۡۥ";
                    break;
                case 1889237709:
                    str = "ۧ۠ۨۘۥۖۘۜۦ۬ۦۚۜۨ۠ۚۚۙۢۤۨۧۜۗ۟ۘۡۜ۬ۢۨۘ";
                    break;
            }
        }
    }

    private void OooO0oO(int i, CharSequence charSequence, int i2) {
        OooO0o oooO0o = null;
        String str = "ۘۖ۫ۤۜۧۘ۬ۦۨۘۨۡۜۘۜ۬ۖۚۙۙ۟ۥۛۤ۟ۤ۟ۥۛ۟ۡ";
        while (true) {
            switch ((((str.hashCode() ^ 997) ^ 422) ^ 88) ^ (-2085347372)) {
                case -1694059324:
                    oooO0o.setFocusable(true);
                    str = "ۛۗۨۢۤۖۘۨۗۛ۠ۧ۠ۥۙۨۚۧۤۥۨۤۗۗۦۗۗۖۘ۟ۗۚۜ۠ۜۘۘۜۡۘ";
                    break;
                case -1520871764:
                    return;
                case -1311485406:
                    OooO0o.OooO00o(oooO0o, i);
                    str = "ۦ۟ۧۡۨۖۛۧۘۘۗۜۡۘۚ۟ۖۘۤۖۗ۠ۧ۫۟ۡۥ۟ۙۜ۠۠۟ۜۚ۟۟ۚ";
                    break;
                case -875096368:
                    str = "ۘ۫ۡۘۤۜ۫ۚۤۘۡۛۗۦۘۘۘ۟۠ۡۡۗۘۘۦۛۖۦۜۚۘ۟ۦۘ۟ۥۦ۟ۧۜۘ۬ۖۖۘ۟ۤۥۘ";
                    break;
                case -254399623:
                    oooO0o.setOnClickListener(this.OoooOoo);
                    str = "ۗۚ۠۬ۙۨۦ۠۠ۤۗۦۘۛ۫ۨۖۤ۬ۙ۫۫ۙۛۗۥۥۚۜۤۢۙۙۡۘۢۦۤۚۥۨ۫ۖۥۢۤۗۗۧ۠ۙۙۥ۟ۢۥ";
                    break;
                case 142691691:
                    this.Ooooo00.addView(oooO0o, new LinearLayout.LayoutParams(0, -1, 1.0f));
                    str = "ۡۜۛۙۧۙۙۧ۠ۦۥۤ۟ۦۨۘۦۜۦۨۘۗۨۧ۟۫ۥۘۡۗۥ۟ۘۗۖ۟ۗ۫ۦۦۘ۫۬ۦ";
                    break;
                case 564280662:
                    str = "ۡۦۥۘ۟ۡۧۘۨۙۜ۠ۤۥۘۤ۫۟ۨۜ۟ۢۢۛۖ۠ۡۥ۟ۖۘۛۖۨۛۦۙۙۙۙۜۥۘ۫ۗۤ";
                    break;
                case 673960079:
                    oooO0o = new OooO0o(this, getContext());
                    str = "۟۬ۢۗ۠ۢ۬ۗۚۤ۠ۥۚۘۜ۫ۨۘۗۡۨۘۙۗۥۚۧۡۘۢۨۖ۠ۖۦۙ۫ۚۗۜۜۥۧۦۢۤۦ۟ۧ";
                    break;
                case 1001532192:
                    String str2 = "۠ۤۥۘۗۤۘۦ۬ۡۘۦ۫۠ۥۡ۠ۥۗۥۙۗ۠ۘۥۡ۫ۜۡ۬ۚۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-84250510)) {
                            case -1474887108:
                                str = "ۡۡۘۦۧۡۨۖۦۦۧۧ۫ۗ۬ۥ۫۟ۢۚۧۙۢۛۢۘۛۨۙۗۥۡۘۜ۠ۦۧۙۨۚۜۙۨۚۚۜۡۧۘ";
                                continue;
                            case -836823784:
                                String str3 = "ۙ۠۫ۤ۟ۢۛۨۛۜ۠ۢ۫۟ۛ۟ۗۦۘۘۚۤ۟ۙ۬ۥ۬ۦۦ۟ۧۛۦۚ۫۫ۙۧۤۢۧۙ۠ۘۡۘ۟ۜۦ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1992964770)) {
                                        case -1826447745:
                                            str2 = "ۜ۠۠۫ۜۦۘۗۜۧۤۚ۬ۥۦۗ۠ۗۜۘۚۚۡۜۗ۟ۖۙۤۡۧۘ۟ۚۜۚۚۢ";
                                            break;
                                        case -302117004:
                                            str2 = "ۛۡۧۘۡۚۖۘۧ۠ۙۦۖ۬۠ۗۘۘۛۥۥۘ۠ۛۚ۬ۗۨۢۚۨۜۥۘۖۧۘۘۡۖۚۚۙ۬ۡۗۜ";
                                            break;
                                        case 269412212:
                                            str3 = i2 != 0 ? "ۧۨۛۧۚۚ۟ۛۧۦۘۢۢۙۖۘۦۨۘۤ۟۬ۡۧۘۗۜۗۧۤۦۘ" : "ۤۘۥ۫ۡۥۧۢۛۗ۬ۧۤۚ۫۬ۦۜۙۛۤۢۗۘۘۦۧۦۧۡ۫ۙۜۥۘۨۖۦۙ۫ۥۗۗۥۘ";
                                            break;
                                        case 1405019115:
                                            str3 = "ۤۜۖۘۨۤۡۘۨۛۘۥۜۘ۠ۥۢ۠ۤۚۚۗۨۢ۫ۗۛۤۢۚۥۧۘۤ۬ۘۘۛۙۡۘ۫ۧۨۘۙۘۙ";
                                            break;
                                    }
                                }
                                break;
                            case 262143449:
                                str2 = "ۦۘۨۦۥۖۦۧۡۦۗۚۧۗ۟ۖۛۜۤۗ۬ۖۥ۬ۥۗ۠ۦۙۜۦۚۡۗۙۢۗۗۡ۬ۧۚ";
                                break;
                            case 1205116176:
                                str = "ۧۚۜ۬ۥۙۧۜۙۖۢۦۘۧ۟ۧ۫ۡۘ۬ۥۜۤۖۢۧۧ۬۫۠ۛ";
                                continue;
                        }
                    }
                    break;
                case 1074248224:
                    oooO0o.setText(charSequence);
                    str = "ۦۜ۠ۚۧۨ۬ۚۘۘۜ۟۬ۗۛ۟۠۬ۥ۠ۨ۫ۧۧ۟ۧۖۨۘ۠ۦۤۥۢۧۢۢۖۜۥۘۡۨ";
                    break;
                case 1606680885:
                    str = "ۥۨ۫ۖ۫ۦۘۘۦۤ۬ۙۜۘۦۜ۠ۢ۟۟ۢۢ۬ۥۛۥۘۤۧۚۥۚۡ۬ۡۖۘۤۢۛۤۢۤۤ۟۟";
                    break;
                case 1629270093:
                    str = "۟ۤ۫ۤ۬ۢۗۨۜۖ۠ۜۦۨۨۤۖ۟ۥۦۧۖۘۥۦۖۜ۬ۘ";
                    break;
                case 2100545610:
                    oooO0o.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
                    str = "ۡۡۘۦۧۡۨۖۦۦۧۧ۫ۗ۬ۥ۫۟ۢۚۧۙۢۛۢۘۛۨۙۗۥۡۘۜ۠ۦۧۙۨۚۜۙۨۚۚۜۡۧۘ";
                    break;
            }
        }
    }

    private void OooO0oo(int i) {
        String str = "ۥ۠ۡۘۖۦۖۚۖ۬۬ۚۥۘ۟ۨۘۘۥ۠ۡۘۨۦۥۘ۫ۘۖۘ۟۟ۥۘ۫ۦۗ";
        OooO0O0 oooO0O0 = null;
        Runnable runnable = null;
        View childAt = null;
        while (true) {
            switch ((((str.hashCode() ^ 678) ^ 893) ^ 644) ^ 2013909771) {
                case -1262186304:
                    removeCallbacks(runnable);
                    str = "ۧ۬ۢۘۧۖۘۧۖ۟۬۬ۥۘ۟۠۠ۖۨۥۛۛۡۘ۠ۥۘۚۗۥۘۨۤ۟";
                    break;
                case -682819624:
                    String str2 = "۬ۘۘۘۢۗۨۘ۫۟ۢۦۘۦۘ۬ۡۧۘۢ۫ۦۘۢ۬ۦۡ۫ۡ۫۠ۖۧۙۤ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1345642084)) {
                            case -2023313380:
                                str = "ۧ۬ۢۘۧۖۘۧۖ۟۬۬ۥۘ۟۠۠ۖۨۥۛۛۡۘ۠ۥۘۚۗۥۘۨۤ۟";
                                continue;
                            case -1131590228:
                                str2 = "ۙ۬ۥۘۨۗۨۧۧۤ۠ۗۗۨۘۤۢۨۜۘۡۢۤۦۚۡۛۢۚ۠ۗ۠";
                                break;
                            case 2050277554:
                                String str3 = "ۚۖۦۘۥۥۡۘۢۡۚۦ۬ۡۡۡۘۦ۠ۦۘۜۛۗۘۛۧۛ۟ۥ۠ۤ۟ۤۤۧۥۘۨۘۡۜ۬۬ۧۨ۬ۛ۠ۗۧۥۘۢۖۧۘۘۥۜ";
                                while (true) {
                                    switch (str3.hashCode() ^ 166698981) {
                                        case 843698183:
                                            str3 = "۟ۦۡۖۚۜۘۜۘۢۖۜۢ۟۟ۘۘ۟ۥۙ۠ۜۤ۬ۙۘۘ۬۠ۦ۟ۚۦ";
                                            break;
                                        case 1131947250:
                                            str3 = runnable != null ? "ۜۤۦۚۨۙۖۖۘ۫ۛۘۘۛۗۦۜۥ۬۬۠۟ۚ۬ۘۗۜۘۘۧ۠۬ۜۥۡ۬ۛۚۧۨۦۚۦۡ" : "ۙۘۨۦۙۜۘ۠۬ۡۗۘۛۘۡۢۙۛ۠ۙۤۛۤۙۘۘۙۥۜۘۧ۫۫ۥ۠۫ۚ۟ۨۘۚۡۛۢۢۖۘ";
                                            break;
                                        case 1274184718:
                                            str2 = "۫ۡۙۖۨۨۜۧۜۘ۟ۙۖۘۖۢۥۘ۫ۡ۟ۖۗ۠ۥۘۥۘۜ۫۟ۖ۠ۖۘۦ۠ۡۥۗۖۘ";
                                            break;
                                        case 1355489640:
                                            str2 = "ۤۘۘۘۙۚۡ۟ۙۤۨۗ۫ۦ۫۬ۖۧۥۘۧۘۧۖ۬ۛۙۧۗۙۢۦۛۡۨۚ۬ۙۢۨۨۖۨۘ۟ۤۖۘۧۥۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case 2111515995:
                                str = "۠ۤۚ۫ۢۜۘۛ۬ۚۤۨۡۖۛۜۘۢۛۧۗ۬ۦۥۛۦۘۖ۟ۙۧۜۚۚۨ۬ۚ۬ۖۧۧۛۤۘ۟";
                                continue;
                        }
                    }
                    break;
                case -334552859:
                    str = "ۡۥۦۘ۬ۘ۟ۜۡ۟ۜۗ۟۬ۖ۟ۘۢۥۘۚ۫ۤۜۙۖۗۘۘ۠ۖۖۡۥۘ۟ۖۛۖۡۦۘۧۡۜۘ";
                    break;
                case -58495339:
                    return;
                case -5142151:
                    post(oooO0O0);
                    str = "ۨۘۥ۬ۥ۫ۗۡ۬۟ۚۥۢۙۨۦ۟ۜۘۜۢۗ۫ۧۘۡۚۥۘۚۨۥۘۦۙۚۢۙۜۘ";
                    break;
                case 101621847:
                    str = "ۡۨۧۜۘ۟ۦ۫ۢۢۗۢۘۜۥۘۨۘۙ۟۬ۦۘۢ۟ۗۡۨۨۘۧۡ۠ۗ۬ۘۨۘۡۘۖۡۧۘ۠ۛۥۘۘۗ۫ۡۢۘ";
                    runnable = this.OoooOoO;
                    break;
                case 916791498:
                    str = "ۚ۬۬ۧۦۡۘۖۚۘۖ۠ۦۘۙۦۜ۟ۥۨۦۧۨۘ۠ۚۘۧۜۛۘۙ۫ۤۛۚۤۗۜۘۥۦۦۚ۬۠ۘۘۡ۬ۡۜ";
                    childAt = this.Ooooo00.getChildAt(i);
                    break;
                case 1121002441:
                    str = "ۧۖۜۖۙۘۘۦۥۖۘۗۦۛ۬۫۫ۚۙۧۤۗۜ۟ۥۛۢ۟ۦ۟ۥۙۚۤ۟۬ۨۡۘ۠ۢۡۥ۟";
                    break;
                case 1153716962:
                    this.OoooOoO = oooO0O0;
                    str = "ۡ۫ۖۘۖ۠ۖۖۗۜۘۡۜۥۛۜۨۘۛۦۨۧۥ۫ۚۛ۫ۚۨۗۘۛۙۖۗۖۘ۬ۚۧ";
                    break;
                case 2034587252:
                    oooO0O0 = new OooO0O0(this, childAt);
                    str = "ۜۦۧۘۨۨۤۛۥۖۤۧۖۘۦ۠ۡۘۥۢۥۥۡۢ۠ۥۘۤۗۘۡۦۘ۠ۨۖۗۨۦۘۧۖۙۢۥۨۘ";
                    break;
            }
        }
    }

    @Override // p285z2.InterfaceC4572ya
    public void OooO00o() {
        PagerAdapter adapter = null;
        InterfaceC4498wa interfaceC4498wa = null;
        InterfaceC4498wa interfaceC4498wa2 = null;
        InterfaceC4498wa interfaceC4498wa3 = null;
        int count = 0;
        int i = 0;
        CharSequence pageTitle = null;
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        int iOooO00o = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = "ۦۛۡۘۧ۫ۖ۠ۢۛۘۦۙۚۢۥۢۛۧۜۗ۬ۗۧۡۘ۫ۧ۬ۚۜۖۥۖۖۘۦۛ۠";
        while (true) {
            switch ((((str.hashCode() ^ 428) ^ 901) ^ 802) ^ (-554355277)) {
                case -1894187140:
                    OooO0oO(i5, charSequence2, i3);
                    str = "ۦۨۗۛۙۡۘۨۦۡ۫ۦ۠ۥۡۖۘ۟ۖۧۘ۬ۡۡۢۡۚ۬ۥۡۘ۫ۧۦۦۚۜۙۧۢ۫ۜۢۢ۠ۛۥ۫ۦۘۙۧۨۘ";
                    break;
                case -1884966946:
                    return;
                case -1597265307:
                    count = adapter.getCount();
                    str = "۬ۤۡۘۛۨۥۦ۠۫ۜۤۗۤ۫ۡۦۘۖۘۘ۬ۨۘ۬ۨۥۖۨۧۘ۬ۡۧۘۧۖۘۦۙۨۢۦۥۨۧ۠ۗۘۘۥ۬ۜۛ۬۟۫ۨۗ";
                    break;
                case -1339985548:
                    str = "ۢۘۨۛۡۘۘۜۥۡۘۛۡۘۧۡۙۛۚۘ۫ۢ۫ۡۚۦۛۢ۟ۢۤۖۘۡۘۜۥۖۧ۠ۜۤۗ۬ۘۘ۠ۜۦ۫ۨۧ";
                    interfaceC4498wa3 = interfaceC4498wa2;
                    break;
                case -1291569928:
                    str = "ۚۖۡۘ۟ۖ۬۠۟ۛۥۜۧۖۙۦۗۨۘ۬۫ۙ۟ۨۚ۟ۢۚۨ۟ۜ";
                    charSequence2 = charSequence;
                    break;
                case -1276838696:
                    str = "ۨ۟ۘۘۨۖۦۥۦۢ۟ۦۚۘۘۦۘ۠ۖۥۘ۠ۦۨۘۙۧۦۘۗ۫ۖۜۢۥۘ۠ۙۨۗۙۖۘ۟ۢۘۡۤ۟ۘۙۨۧ۠ۘۡۗۢۥ";
                    i5 = i4;
                    break;
                case -1166837318:
                    str = "۬ۗۦۘۘ۟۟ۢ۬ۜۘۗۨۜۘۜ۬ۘۘ۬ۡۦۘۤۡۡۘۡۛ۬ۙ۠ۡۘۥ۠ۡۘۢۦۘۘ۠ۨ";
                    charSequence2 = pageTitle;
                    break;
                case -1105974981:
                    interfaceC4498wa2 = null;
                    str = "ۘ۠ۘۘ۬۫ۡۙ۬ۦۙۘۦۘۜۦۖۘۛۧۥۘۨۙۜۧۜۧۨۙ۫۟ۥۢۚۦۙۡ۟ۙۙۖۧ۬ۗۖۙۜۚ۫ۡۜۖۤۧۘۧ";
                    break;
                case -1042307131:
                    str = "ۡۢۜۘۢۨۦۘ۬ۘۗۥ۠۫ۗۥۢۗۧۛۙۚۖۗۛۛۜۘۛۖۡۜۙۧۘۖۛۚ۫ۘۢۗۨۘۥۦۜۢۨۡۘۜۦۙۤۘۡۘ";
                    break;
                case -977124403:
                    String str2 = "ۡۚ۠۬ۧۖۘۜۘۚۧۖ۬ۛۘۘۗ۬ۜۢۧۨۘۨۥ۬ۖۨۘ۫ۧۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1761128045) {
                            case -1536027287:
                                str2 = "ۢۚۨۤۖ۫ۨۖۜ۠ۡ۠ۧ۫ۨۨۦۦۘۧۥۨۘ۬ۛ۫ۜ۬ۧۨۘۗۘۗۗ۠۬ۡۦۜۜۖۙۡ";
                                break;
                            case -1058314188:
                                str = "۫۟۠ۖۥ۟ۛۢۨۘ۬ۦۥۘۚۢ۠ۖۨۜ۟ۦۙۡۥۗۧۡۘۨۡۤۖۥۧۘ۬۠۬ۘۤۢ۫ۗۖۘ";
                                continue;
                            case -380941667:
                                str = "ۚۖۡۘ۟ۖ۬۠۟ۛۥۜۧۖۙۦۗۨۘ۬۫ۙ۟ۨۚ۟ۢۚۨ۟ۜ";
                                continue;
                            case 2044354436:
                                String str3 = "۫ۡۛۨۜۤۗ۫ۘۘۗۛۖۘۨۙۖۘ۫ۗۘۧۘۖۡۡۘۥۙۥۘ۬ۤۗۥۜۢۦۥۡۨۨۡۘۧ۫ۡۘۙۤ۫۫۬۫۫ۚۢۙ۠۟";
                                while (true) {
                                    switch (str3.hashCode() ^ 1297389074) {
                                        case 151683569:
                                            str3 = "ۢۖۘ۟ۦۘۘ۠ۤۜۦۧۚۨ۟ۨۖۤۡۘۢۖۡۗ۬ۜۘۗۤۧۨۦۖۘۛۨۗۙۥۡۘ";
                                            break;
                                        case 402603925:
                                            str2 = "۫ۥۙۘۙۜۤۤ۬ۛۥۘۡۤۢۢۙۜۘۨۖ۟ۘۘۙۨۦۘ۬ۖ۬ۘۚۧۙۙۧۧۨ۬ۜۨۧۘۨ۫ۨۡ۫ۧۙۘ۫ۛۛۖ";
                                            break;
                                        case 1436514619:
                                            str3 = pageTitle == null ? "ۢۨۨ۫ۢۘۘۛۧۦۤۙۥۨۦۘۥ۟ۡۡۤۙۨۘۧۦۦۢۧۧۨۗۧۦۘۨ" : "ۛۗۧۖۗۨۨۡۘۘۛۡ۫ۨۧۘۘۛۢۨۘۙۤ۠ۧۘۘۘۢۧۨۘۧۘۗ۠ۖۨۘۥۨۖ۟ۙ۫ۡۢۦۥ۬ۙۡ۟";
                                            break;
                                        case 2024570770:
                                            str2 = "ۨۤ۟۠ۦۖۘ۠۫ۡۘۚ۬ۦ۬ۘۖۘۧۧۨ۟ۥۚۧۥۖۘۛۗۦۘۖۢۚۙۨۦۘۘ۬ۜۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -561621259:
                    str = "۬ۖۙۤ۫ۨۛۢۦۘۦۛۚۚۤ۠ۦۥۘۘۨۤۗ۠۬ۖۘۡۛۗۡۢۖۗ۟۬ۜۜۘۘ۠ۙۜۘۚۡ۠۬ۢ۟ۦۜۖ";
                    i3 = iOooO00o;
                    break;
                case -529443833:
                    String str4 = "ۗۚۘۘۙۖۦۘۙۨۧۗۨۧۘۚۧۨۘۢۖ۬ۗۡۚۙۖۖۛ۫ۚۡۚ۫";
                    while (true) {
                        switch (str4.hashCode() ^ (-1325772638)) {
                            case 632143366:
                                String str5 = "۟ۙۚ۟ۖۢۜ۠ۦۘۚۡۙۛ۫ۡۙۢ۠۬ۤۛۜ۫ۤ۫ۘۤۘۨۛ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1297071047) {
                                        case -984968657:
                                            str5 = "ۢۛ۫ۨۘۢۡۧ۬ۧۖۧۘۤۛۜۦۖۦۘۗۖ۬۟ۘۖۛ۫ۤۢۤۗ";
                                            break;
                                        case -940926374:
                                            str5 = interfaceC4498wa3 != null ? "ۘۘۡۘۚۥۡۘۨۜۜۘ۬ۛۘۚۗۦۡۤۤ۠۠ۢۙۤۚ۟ۖۦ۬۬۫ۜۛۘ۫ۛ" : "ۢۧۨۘۘۤۦۢۙۨۜ۫ۛۢۙۧۜۛۥ۫۫۬ۚۧۦۤ۠ۦ۠ۖۦۙۜۖۘۘۗۡۙۘۢۖ۟ۚۖۖۖۥۖۥۘۚۤۡۦۤۢ";
                                            break;
                                        case -446165950:
                                            str4 = "ۧۙۙۖ۬ۥۤۜۜۦ۫۬ۘۖ۟ۧۦۡۘۚۖۖۘۙۘۥۨۥۘۧۦۖۘۧ۫ۙۗۜۤۙۗۗۘۗۛ";
                                            break;
                                        case 1946764693:
                                            str4 = "۠۟ۘۤۘۨۘۙۥۥۘۦۥۙۜۙۨۤۧۜۘۖۦۖۙۤۡۢ۠ۤۙۜ۬ۛۗۗۖ۠ۗۧ۬ۦۘۥ۠ۤ۫۬ۘۘۘۙۢ۠ۧۛۦۙۧ";
                                            break;
                                    }
                                }
                                break;
                            case 952126121:
                                str = "ۛۜۧۘۥۧۙۚۨۚۙۙۡۜۘۗۙ۬ۡۘۥۨۤۚۥ۟ۖ۫ۦ۬ۛۥۦۖۘۚۧۗ";
                                continue;
                            case 1174098607:
                                str = "ۘۥۦۖ۟ۙۧ۠۫۟۠ۘ۠۬ۡۡۢۥ۠ۡۘۘ۫ۛۡۘۨۛ۠ۡۗ۫ۦۖۜۢۙۜۘۤ۬ۨۘ۬ۘۥ";
                                continue;
                            case 1413175805:
                                str4 = "ۚ۫۠۬ۖ۠ۢۜۨۘۦۘۘ۫ۥۛۨۚۘ۬۫ۧۛ۫ۦۘ۠ۛۦۘۘۛ۫";
                                break;
                        }
                    }
                    break;
                case -491683807:
                    this.Ooooo00.removeAllViews();
                    str = "ۡۗۜۘۢۚۨۙ۫ۘۨۖ۫ۥۦۙۨۙ۫ۨ۠ۦۡۗۘۢۙۖ۟ۦۘۨۛۘۧ۬ۗ";
                    break;
                case -454486254:
                    String str6 = "ۦۖ۬ۚۘ۫ۘۡۚۥۜۦۘۘۗۢۢ۠ۖۧۦۘۘۛۢۡ۬ۦۘۘ۬۫ۤ۠ۖۤۤۘۖ۟۠ۦۘۥ۫ۘۛۦۧۘۗۜۦۘۦۢۢۨۡۦۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 1902699702) {
                            case -1776162665:
                                String str7 = "ۘۙۚۥ۠ۧ۠ۤۡۤۡۘۛۖۙۛۡۦۗۘۚۡ۠ۜۘۘ۟ۤۦۛۘۘۨۥۧۘۨۢۚۚ۟ۗۚۚۦۙۨ۫ۢۢۥۘ۠ۨۢۚۙۖۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1490983927) {
                                        case -926891390:
                                            str7 = "ۜ۫ۗ۬ۤۡۘ۬ۗۨۡۗۤۙۥۜۘۜ۟ۥۘۜ۠ۤۨ۫ۨۨ۬ۡۘۜ۠ۥۙ۬ۥۘ۬۫ۢۖۗۤۜۢۚ۫۬ۘۘۢۢۤ";
                                            break;
                                        case -431773081:
                                            str6 = "ۙۖ۫ۡۥۗۙ۠۟۠۬ۤ۠۬ۢۘۨۦۦۘ۠ۧۤۧۤۡۜ۫ۖۘۧۘۨۜ۫ۙۡۦۡۨۦۦ۫ۗ۟ۖ۫ۢۜۨۜۢ۬۟";
                                            break;
                                        case 545162870:
                                            str7 = this.OooooOo > count ? "ۥ۬ۥۤ۫ۦۦۧۚۘۗۧۚۜۗۙۗۧ۬ۛۙۡۨۛۥۢۥۖۘۚۡۘۥۧۙۤۚۖ۟ۡۜۘۜۨۥۥۙۦ" : "۟۟ۦۥۨ۬۬ۚۘۘۛۛۢۨۨ۫ۦ۠ۛۢ۫۫ۥۡۘۗۤۖۛۖۘۧۘۘۘۥۨۦۘۙۧۡۘۜ۫ۘ۬ۨۧۘۢۗۜۘ";
                                            break;
                                        case 1798558288:
                                            str6 = "ۘۡۥۘۨۨۦۚۡۘۛ۟ۦۤۙۛۡۚۥۜۨۛ۫۠ۘۘۢۧۧ۬ۥۦۘ۬۟۬ۢۘۚۧۤۦۘۡ۠ۙ۬۠۫ۡۛۘۦۘ۠ۡۚۧ";
                                            break;
                                    }
                                }
                                break;
                            case -1236499285:
                                str = "ۙ۫ۨۘۧۧۡۘۘ۠ۘۘۘ۫ۘۘۡۧۢۖۘۡۘۦۚۤۖ۠ۡۤ۫ۛۤۢۡۘ۟ۥۜۥۖ";
                                continue;
                            case 1303653574:
                                str = "ۤۦۧۘۚۢ۟ۡۤۖۘۛۥۚۦۙ۟ۘۛ۠ۚۧ۠ۘۢۚۢ۠ۗ۠ۧۤۙۢۘ۟ۡۜۘ";
                                continue;
                            case 1820310491:
                                str6 = "ۢۘۜۘۥۧۘ۫ۘۙۤۥ۟ۢۘ۬ۢۗۜۘۥۥۙۜۘۡۙ۠۠ۘۨۗۖۤ۠ۙۦۤ";
                                break;
                        }
                    }
                    break;
                case -129825006:
                    adapter = this.Ooooo0o.getAdapter();
                    str = "۠ۘۥۘۥ۟ۡۘۤۖۚۗۜۥۘۤۖ۬۫ۨۥۘۗۦۤۦۘۘۛۦۘۖ۟ۥۜ۟ۜۧۡۡۜ۫ۜۘ۫ۚۤ";
                    break;
                case 114717501:
                    str = "۬ۜۛۥۡۧۗۥۖ۠ۜۦۜۛۨۘۦ۫ۛۗۛۥۘۢۧ۟ۢۗۥۦ۟ۥۘ۬ۗۨۘ۬۬ۘۘ";
                    break;
                case 128521733:
                    i2 = 0;
                    str = "ۡۖۛۛۚۦۖ۫ۥۛۘۦۘۨۙۡۢۛۜۙۛ۠ۚ۬ۤۨۜۘۙۧۘۤ۟۠ۗۡۘۡۤۥۘۜۘۡ";
                    break;
                case 170964708:
                    str = "ۢۘۨۛۡۘۘۜۥۡۘۛۡۘۧۡۙۛۚۘ۫ۢ۫ۡۚۦۛۢ۟ۢۤۖۘۡۘۜۥۖۧ۠ۜۤۗ۬ۘۘ۠ۜۦ۫ۨۧ";
                    break;
                case 241273310:
                    setCurrentItem(this.OooooOo);
                    str = "ۘۘۛۘۘ۬ۡ۟ۦۘۦۚۛۚۡۥۙ۟ۧۘۖۦۘ۬۫ۡۘ۬ۙۡۡۧۗ";
                    break;
                case 537866693:
                    i = 0;
                    str = "ۨ۠ۖ۟ۦ۬ۙۡۡۡۢۖۘ۬ۗۥۥۡ۬ۜۦۤۘۜ۠ۖ۠ۘۘ۫ۨۛۦ۬۠ۢۛۥۘۘ۬۫ۤ۬ۡۘۖۥۜۘۘۚۧۜۘۘۖۛ";
                    break;
                case 599787655:
                    pageTitle = adapter.getPageTitle(i5);
                    str = "ۘۦۘۚۡۙۜۚۗۢۨۧۘۥۚۧۚۧۘ۬ۥۧ۠ۘۥۡ۬ۧۧۡۘ";
                    break;
                case 954101635:
                    str = "ۡۢۜۘۢۨۦۘ۬ۘۗۥ۠۫ۗۥۢۗۧۛۙۚۖۗۛۛۜۘۛۖۡۜۙۧۘۖۛۚ۫ۘۢۗۨۘۥۦۜۢۨۡۘۜۦۙۤۘۡۘ";
                    i3 = i2;
                    break;
                case 1033636654:
                    String str8 = "ۜۖ۟ۗۛۥۨۛ۟ۧ۫ۚ۠ۗ۬ۦۘۚ۟ۙۘۨۧۘۖۘۛۙۜۖۙۡ۬۟ۘۚۗۤۥۦۧۨ";
                    while (true) {
                        switch (str8.hashCode() ^ 999094230) {
                            case -1822859175:
                                str = "۠۠ۘۛۛۨۘ۬۠۟ۙۧ۬ۘۘۡۛ۠ۛۛۨۛۥ۠۠ۤۡۘۗۦ";
                                continue;
                            case -97819412:
                                String str9 = "ۤۛۖۤۤۧۧۦۦ۬ۘ۬ۛۜ۫۠۟ۡۘۚۦۛۘۙۘۖ۫ۥۜۡۤۧ۬ۜۘۖۢۥۘ";
                                while (true) {
                                    switch (str9.hashCode() ^ 1933349393) {
                                        case -469430361:
                                            str9 = adapter instanceof InterfaceC4498wa ? "ۘۛۘ۫۠ۤۘ۫ۘۘۦۨۥ۬۠ۘۘۘۗۥۢ۫ۚۤۚۖۘۚۦۨۢۡۨۘۤۨۙ۠۠ۘ" : "ۤۚۡ۠ۜۧ۟۫ۜۘۗۗۗۖ۟ۛ۬ۜۚۖۚۡۘۢۡۡۦۧۗۤ۫ۘۘۢۢ";
                                            break;
                                        case -341347856:
                                            str9 = "ۙ۟ۢۗۦۖۡۙۖۘۜۖۘۘۨ۬ۖۘۨۤۢ۟ۜۘۨ۟ۜۗۘ۟ۥۚ";
                                            break;
                                        case 1245914604:
                                            str8 = "ۡۢۘۘۗۖۡۘۡۡۚۘۛۥۘۢۚۖۚۚۘۥ۫ۢۖۜۢۙۗۥۘ۫ۚۘۘۢۢ۬ۤۨۦۘۚۦۚۤۥۖۧۘۡۖۨۛ";
                                            break;
                                        case 1677894457:
                                            str8 = "ۦۢ۟ۚۖۨۘۧۘۗ۫ۦۢۖۙ۠۫ۖۛۖۧۖۗۘۘۥ۫ۧۢۖۘۗۥۜۘۡۢۦۘۙۨۜۘۤۙۢ۬ۛۘۤ۫ۦۘ۟ۡۚۗۗۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case 301254926:
                                str = "ۘۥۨۘۥۤۙۛۘۡۚۖۦۘ۫ۧۦۘۛۢۚۨۙ۬ۦ۠ۥ۬ۜۖۘ۟ۜۘۥۨۧۚۡۖ۠ۖۛۖۚ۫ۦۢۢ۬ۥۦۘ";
                                continue;
                            case 1628566784:
                                str8 = "ۥ۠ۦۨ۬ۜۤۧۧ۟ۙۢۖۥۘ۫ۥۨۘۡۙۧۧۙۥۘۦۡۜۥۡ۫ۚۗۨۤۥۦ۫ۙۛۥ۟ۛۦ۬ۜ۠";
                                break;
                        }
                    }
                    break;
                case 1063613551:
                    str = "ۘۢ۫ۛۜۖۗۘۜ۫ۘ۟ۢۙۖۙۦۥ۬ۘۛ۬۫ۖۙ۬ۙۜۤۤ۠ۡۘۘ۠ۧۦ";
                    interfaceC4498wa3 = interfaceC4498wa;
                    break;
                case 1354598100:
                    requestLayout();
                    str = "ۛۤۙۙۡۡۡۘۘۢ۠ۦۖ۟ۧۖۚۨۘۜۧۥۦۜۚ۬ۙۦۘۜۙۦۥۧ۠ۡ۫ۜۘ";
                    break;
                case 1370254796:
                    charSequence = Oooooo;
                    str = "ۜ۟ۙۡۧۖ۟ۢۨۘ۟۠ۨۘۙ۬ۨۘۗۥۡۘۡۡ۫۫ۨۜۘۢ۠ۡۘۢۢۦ۟ۢۦۘۖۙ۟ۨۤۜۘ۬۬ۚۤۙۛۢۗۥۘ";
                    break;
                case 1592322224:
                    String str10 = "ۚۥۨۘ۫ۨۨۘ۟ۡۥ۬۟۟ۦۨۡۚۨۘۦۛۜ۟ۖۘۗۨۖۘ۫ۨ۬";
                    while (true) {
                        switch (str10.hashCode() ^ (-1145156702)) {
                            case -82106221:
                                str = "۫ۤ۟۟ۙۤۦۜۨۜۜۧۘ۫ۗۜۘۗۥۤۨۤۡۘۧۨۚۗ۫ۦۘۙۖۨۘۜ۬ۡۥۛۦۚۗۥ۬ۡۘۥۡۦۧۨۦ";
                                continue;
                            case 256061764:
                                String str11 = "ۢۥۥۢۚۢ۠۠ۙ۟ۤۦۢۚۧۛۖۜ۠ۛۚۗۡ۟ۤۙ۠ۨ۫ۤ";
                                while (true) {
                                    switch (str11.hashCode() ^ (-1617503972)) {
                                        case -1388883576:
                                            str11 = "ۛ۬ۜۖ۠ۜۘۧۗۖۘۚۖۗ۬ۙۘۤۨۚۨۙۦ۬۟ۖۘۜۘۚۙۨۥۢۚۦۘۙۖۖۘۛۙۖۘۢۙ۠ۤۢۦۘ۟۠ۙ۫۬۬۫ۨۨ";
                                            break;
                                        case -935111726:
                                            str11 = i5 < count ? "ۙۘۦۖ۠ۖۡ۫ۧ۠ۨۥۤۡۛ۫ۖۨ۬ۤۦۜۚۖۤۜۨۘۘۖۘۘ" : "۠۟ۡ۫ۧۤۗ۠ۗۨۨۙ۠ۜۡۙۢۦۘۙۘۨۘۗۜۗ۠۫ۥۘۛۚۥ";
                                            break;
                                        case -788294021:
                                            str10 = "ۡۘۜۘۤۧۥۥۢ۟ۨ۠ۥۘۤۙۚۢۚ۫۫ۧۢۥۗۛۤۦۗۚۥۘۗۚۦۘۨۘ۫";
                                            break;
                                        case 641443336:
                                            str10 = "ۖۗۙۥۘۨۖۢۨۘ۠ۛۖ۠ۥۨ۠ۖۜۖۘۖۘ۟۠ۤۥۘۢۨۢۛ";
                                            break;
                                    }
                                }
                                break;
                            case 486215502:
                                str = "ۧ۠ۥۧۧۨۘۚۧۘۘۘ۬ۨۘۙ۟ۚۛۥ۟۬ۢ۫۬ۢۜۘۛ۠ۥۥۗۨۘ۬ۥۘ۫ۧۦۚ۬ۚۙۚ۟";
                                continue;
                            case 1726683773:
                                str10 = "ۙۡۖۥۗۗۙۥۦۡ۟ۨۚ۟ۦۜ۟ۜۙ۠ۦۚۢ۫ۤۜۚۖۥ۬ۙۚۡۖۚۗ";
                                break;
                        }
                    }
                    break;
                case 1658901036:
                    str = "ۦ۫ۨۘۘۥۜۦۨۗ۠ۙۦۘۤۗۘۘ۬ۙۘۦ۟ۘۤۧۡۘ۠ۦۚۙۡۥۤۖۨۗۘۧۢۢۡۢ۠ۧ";
                    break;
                case 1667294399:
                    i4 = i5 + 1;
                    str = "۠ۜۗۗۢۨۘ۠ۦۖۘۢۧۛۤۚۚ۟۫ۡۛۨۜ۫ۥۘۢۧۦۘ۟ۗۧ";
                    break;
                case 1680987741:
                    iOooO00o = interfaceC4498wa3.OooO00o(i5);
                    str = "ۙۧۡۘ۠۬ۤۛۢۜۘۨۡۖ۬۬ۖ۬ۜۥۘۖ۠۠۬ۧۨ۫ۙۗ۬ۙۘۘۤۖۗ۟ۗۦ۫ۢۘۢۤ";
                    break;
                case 1728453638:
                    str = "ۦ۫ۨۘۘۥۜۦۨۗ۠ۙۦۘۤۗۘۘ۬ۙۘۦ۟ۘۤۧۡۘ۠ۦۚۙۡۥۤۖۨۗۘۧۢۢۡۢ۠ۧ";
                    i5 = i;
                    break;
                case 1835703267:
                    str = "ۖ۬ۘۘ۟ۚۗۚۦۡۘۤۦۥۘۢ۫ۜۘۤۘۢ۟ۦۥۜۨۡۘۨ۟ۦۖۥ۠ۡۦۥۤۧۤ۠ۜ۬ۨۡۧ";
                    interfaceC4498wa = (InterfaceC4498wa) adapter;
                    break;
                case 1842791084:
                    this.OooooOo = count - 1;
                    str = "ۙ۫ۨۘۧۧۡۘۘ۠ۘۘۘ۫ۘۘۡۧۢۖۘۡۘۦۚۤۖ۠ۡۤ۫ۛۤۢۡۘ۟ۥۜۥۖ";
                    break;
            }
        }
    }

    @Override // p285z2.InterfaceC4572ya
    public void OooO0O0(ViewPager viewPager, int i) {
        String str = "ۚۛ۬ۗۥ۫ۖۘۨۘۤۢۨۙ۫ۚۢۛۛۘۢۖۜۤۡۘ۟ۧۜۛۜۥۘ۬۠ۙۦۘۥۖۡۜۘۤۘۖۧۢۛ۠ۚۛ";
        while (true) {
            switch ((((str.hashCode() ^ 874) ^ 905) ^ 812) ^ 299779333) {
                case -2121855077:
                    str = "ۧ۬۟ۢۦۦۘۗۜۜۦۦۘۥۘ۠ۜ۫ۨۡۧ۬ۙۚۧ۠ۘۜ۬۠ۡۤۙۖۥ۟ۘۘ۟ۧۜۘ۫ۖۘ";
                    break;
                case -2092344307:
                    return;
                case -1615377076:
                    setCurrentItem(i);
                    str = "ۜۨۥۘۙۥ۟۫ۧ۟ۜۖۛ۟ۡۘۘۧ۬ۧۧ۫ۖۦۜۚۧۤۦۛۤ۬ۢۥۡۛۘۘۚۖۨۗۛ۠";
                    break;
                case -988355622:
                    setViewPager(viewPager);
                    str = "۬ۙۡۨۗۦۜۖۤۦ۬ۖۘۗۜۨۘۛۢۥۘۥۗۢۘ۬ۨۨۘۨۜ";
                    break;
                case -599041186:
                    str = "ۡۙۦۘ۬ۛۦ۠ۢۜۘۖۡۡۘۖۡۦۚۖۡۘۤۢۜ۬ۥ۟ۙۢۦۘ۟ۢۦۘۙ۠ۘۘۦۛ۫ۙۙۜ۬۠ۘۚۚۖۘۙ۠ۢۢۡۤۛۨۢ";
                    break;
                case -288600063:
                    str = "ۨ۬ۨۘۢۤۙۙۤ۬ۥۙۘۚۖۜۘۡۥۦۘۡۨۧۘ۟ۛۨۘۡۗۖۜۡۜۜۧۢۡۗۖۜ۠ۜ۟ۧۜۘ۬ۜۖۘۜۖۘۘ";
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Runnable runnable = null;
        String str = "ۖۖ۫ۜ۟ۨۘ۫۠ۖۘۥۥۧ۫ۡۘۛۥۡۘۘ۫۠ۛ۠ۨۖۧ۬ۖۥۡۘۨۗ۫ۚ۟ۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 50) ^ 706) ^ 332) ^ (-1873769093)) {
                case -1919667340:
                    runnable = this.OoooOoO;
                    str = "ۖۤۨۘۜۛۖۘۖۚۧۨ۠ۘۘۖ۬ۤۜۡۘۘۧۧ۫ۧۨۛ۬ۨۧۗۛۤۜۢۥ۫ۜۗۙۡۘ۬ۗۜ";
                    break;
                case -1572441596:
                    String str2 = "ۗۜۨۖۥۘۘ۠۠ۙۡۖۖۘۙۗۦۘۥ۫ۛ۬۠ۘۛ۟ۛۧۜۘۘۡۨۡۜۘۘ۬ۨۡۘۖۙۡ۠۬ۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1746002594)) {
                            case -1152434776:
                                str = "۠ۘۥۖۧۜ۠ۗۨۘۚ۬ۡۘۖۦۥۛ۟۬ۨۦۗۤ۠۫ۜ۟ۖۛۧۚۡۥۘ۟ۚۘۚۡۢۨۗ۫۬ۘۨ۠ۡ۟";
                                continue;
                            case 282154665:
                                str2 = "ۘۢۦۚۨ۟ۦۜ۠ۧۜۗۢۛۨ۬ۢۛۗ۫ۜ۠ۖۜۘۨۖ۠ۘ۠ۜۢۚۤۚۙۡۘۗۨ۫ۚۥۦۘۛۤ۟ۤ۟ۙ";
                                break;
                            case 447512487:
                                str = "۫ۢۡۘۗۥۙۘۜۧۖۡۚۘۗۦۦۘۨۤۛۚ۬ۘۡۚۧۖۦۡۖ۟۠ۘۛ۬۫ۦۘ۟ۛۖۘۜ۬ۛ۫ۢۢۜۤۖۚۡ۠";
                                continue;
                            case 991059820:
                                String str3 = "ۚۗۜۘۡۘۤۘۢۥۘ۠۠ۘۘۧ۠ۖۘۦ۠۫ۜۤۤۗ۟ۡۨ۫ۨۘۦۙۥۘۤۛۚۗۤۗۡۡۥۘۗۧۤ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1427592593)) {
                                        case -469111589:
                                            str2 = "ۡۧۘۘۛ۫۟ۥۛۡۗ۟ۜۘۢ۬۠ۙۗۥۘۘۧۜۖۥۤۡۡۘ۠ۘۘۘۨۥۨۘ۠ۛۦ";
                                            break;
                                        case -69741257:
                                            str3 = "ۛ۫ۗۢۘۦۘۙۨۡۖ۬ۥۧ۫۫ۡ۫ۜۘ۫ۡۥۘۜۢۨ۟ۤۤ۠ۤۛۦۢۘۘۜۚۘ۟ۚۨ۬ۥ۬";
                                            break;
                                        case -17676016:
                                            str3 = runnable != null ? "ۡ۠ۧۖۗۚۛ۠ۖۚۙۜۘۛۛۤ۟ۡۘۧۙۖۚۧۛ۠ۚۗۙۦۚۗۡۥۘۦۨۗۡ۟ۢۤۡۨ" : "ۤۡۨۘ۠۫ۢ۬ۥۜۘۨۦۜۙ۟ۢ۫ۡۥۘۖۘۘ۫۬۠ۙۖۨۨۛۥۚۘۤۤ۫۫ۦۜۙۘۘۨۖۢ۟ۘ۠ۡ۟ۚۤۘۤ";
                                            break;
                                        case -14474855:
                                            str2 = "ۡۡۨۘۚۗۡۖۖۨۤۜۡۘۖۜ۫ۦۜۖۥۚ۟ۦۙۖۦۜۧۘ۬ۧ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -98403491:
                    return;
                case 673479225:
                    post(runnable);
                    str = "۫ۢۡۘۗۥۙۘۜۧۖۡۚۘۗۦۦۘۨۤۛۚ۬ۘۡۚۧۖۦۡۖ۟۠ۘۛ۬۫ۦۘ۟ۛۖۘۜ۬ۛ۫ۢۢۜۤۖۚۡ۠";
                    break;
                case 1353141380:
                    str = "ۨۤۧۚۚۡۘۦۤۖۘۚۡۛۜ۠ۨ۠ۙ۟ۛۜۦۢۦۦۘۘۦۘ۟ۙ۫ۤ۫ۨۧۤۡۘۥۡۥۨۦۢ";
                    break;
                case 1597332261:
                    super.onAttachedToWindow();
                    str = "ۖۡۖۗۜ۫ۧ۫ۨ۟ۜۜۘۡۨۨۧۢۢۜۖۖۘۖۧۦۘۙۢۜۘ۬۟ۘۘ۟ۦۥۘ۬";
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Runnable runnable = null;
        String str = "۬ۙۥۛۜۘۙۚۢۗۘۡۘۡۡۡۘۡۛ۬ۥۧۢۛۙۨۘ۟ۛۧۛۙ۫ۜۘۖۗۢ۬ۜ۠ۤۚۛۘۘ۠ۥ۟ۧ۫ۗۗ۠ۙۨ۠۫";
        while (true) {
            switch ((((str.hashCode() ^ 961) ^ 136) ^ 844) ^ (-793547221)) {
                case -2138100538:
                    String str2 = "ۥ۟ۡۘ۟ۘۜۛ۫ۘۘۨۤۙۧۨۚۡ۟ۘۘۜۘۢۥۘۘۙۦۘۦۨۦ۠ۧ۠ۙۤۗۖۚۦۘ۠ۨۤۘۖۥۖ۫ۙ";
                    while (true) {
                        switch (str2.hashCode() ^ 960708383) {
                            case -2087108381:
                                String str3 = "ۜۜۢۡۛۘۧۧ۫ۙ۠۠ۗ۟ۨۘۢۦۡۜۙۜۦ۟ۜۘۧۚۘۚۢۥۥۛۥۘۘۥۖۡۚۛۜ۟ۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1768035703)) {
                                        case -1905431336:
                                            str2 = "۟ۘۢۧۚ۟ۦۖۖۛۨۨۥۖ۠ۦۜۡۧۥۘۜ۠ۛ۫ۖۨۘۜ";
                                            break;
                                        case -787622460:
                                            str3 = runnable != null ? "ۙۡۗۦۨۢ۠ۦۦۡۘۢۡۤ۠ۙۜۖ۠ۙۖۤ۠ۧ۠۫ۘۘۥۛۛۜۦ۬ۗۡۚ۫ۧۦ۬ۗۜۘ" : "ۗۦۧۘۥۙۘۘ۬ۗۨۢۨۧۘ۫ۨۧۘۚۗۙۙۨ۠ۢۜۨۘۦۗ۠ۜۘۤ";
                                            break;
                                        case -355043904:
                                            str3 = "ۘۢۢۤ۠ۧۙۚۖۦۖۘۛ۫ۢۜۦۖۤ۬ۤۜ۬ۜۘۜۤۦۤۢۥ";
                                            break;
                                        case 1411884367:
                                            str2 = "ۖۘۗۚۖۙۚۚۗۤۛۖۘۨ۬ۥۘۘ۠ۥۦ۟ۘۛ۬ۥ۠ۖۜۘۚۧ۟ۢ۫۠۠ۥۡۘۧ۬ۘۘۚۥۛ۫ۙۢۙۛۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case -282723633:
                                str2 = "ۢۗ۫ۦ۬ۦۘۘۦۥۚۦ۬ۜۜ۫۠ۜۤۤۡ۟ۦۥۘۖۥۡۘ۟ۨۧۨۗۚۘۤۨۘۤۙۜۘۘ۠ۧ";
                                break;
                            case 477256155:
                                str = "ۥۧۗۦۨۧۖۘۜ۬۫ۧۥۘۥۙ۬ۙۤ۬ۨۜۦۘۢۛۛۥۥۥۦۚۦۦۚ۬ۧۡۜۘۥۙۖۛۢۢۨ۬ۖۤ۠ۤۙۨۡ";
                                continue;
                            case 1740175083:
                                str = "ۗۨۦۘ۬۫۠ۧ۬ۨۤۘۦ۬ۥۤۘ۬ۗ۠ۖۡۥۦ۠ۛۢۥۘۙۙۥ";
                                continue;
                        }
                    }
                    break;
                case -2131135607:
                    str = "ۙ۠ۜۦ۫ۥۘۖ۫ۡۘۗۥۙۛۥ۟ۨۚۘۖۘۢۘۙۡۜۛ۫ۙۚۦۜۨۘۧۗۥۡۥۡۢۙ";
                    break;
                case 777397418:
                    return;
                case 1147855464:
                    runnable = this.OoooOoO;
                    str = "ۢۡۦۘ۠ۛۖۘۛۙ۬ۤۘۦۜۗ۠ۜ۬ۗۧۖۧ۫ۦۦۦۛ۫۟ۧۜۢۡۗۡۢۤ۫ۖۘۨ۫ۖۘ۫ۖ۫ۥۘ۟ۦۙۘۘۘۥۖ";
                    break;
                case 1157143265:
                    super.onDetachedFromWindow();
                    str = "ۖۤ۫۟ۙۨ۬ۨۘۦۖ۬۠۫ۨۘۘۚۜۜۤۥۜۥۘۦ۫ۘۚ۫ۘۗ۠۬ۛۛۥۘۖۧۨۘۥۚۘۚۨۥۦۢۙ";
                    break;
                case 1482826300:
                    removeCallbacks(runnable);
                    str = "ۥۧۗۦۨۧۖۘۜ۬۫ۧۥۘۥۙ۬ۙۤ۬ۨۜۦۘۢۛۛۥۥۥۦۚۦۦۚ۬ۧۡۜۘۥۙۖۛۢۢۨ۬ۖۤ۠ۤۙۨۡ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = 0;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        int childCount = 0;
        int size = 0;
        int i3 = 0;
        int i4 = 0;
        int measuredWidth = 0;
        int measuredWidth2 = 0;
        String str = "ۥۜۧ۬ۥۚ۫ۜۥۘۢۗ۫ۧۥۥ۬ۘ۫۠ۖۘۘۢ۟ۤۛۡۘۦۢ۫";
        while (true) {
            switch ((((str.hashCode() ^ 986) ^ 152) ^ 159) ^ 392203550) {
                case -1970609914:
                    super.onMeasure(i, i2);
                    str = "ۥ۬ۡۖۖۚۧۡۦۗۙۡۡۘۘۖۚۤۙۥۙۜۛۥۘۤۘۡۘۡ۟ۜۘۥ۟۫ۛۦۙۦۥ۟۬ۥۡ";
                    break;
                case -1889151908:
                    String str2 = "ۡۘ۫ۢۢۦۛۘۘۙۡۚ۟ۙۥۘۥۙۦۜۘۖۘۘۥۙۘۖۙۦۢۜۘۨۖۡۤۗ۫ۛۤ۬ۘۢۚۦۡ۠ۨۜۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-2050203921)) {
                            case -1365832714:
                                break;
                            case -1302739143:
                                String str3 = "ۨۡۤۙۤۥۨۦۦۘۖ۟ۦۘۚۢ۫ۗ۟۟ۗۗۜۘۡۖ۫۟ۥۤ۬ۖۘۡۥۧۡ";
                                while (true) {
                                    switch (str3.hashCode() ^ 2003302952) {
                                        case -184807483:
                                            str2 = "ۧۚۥۥۥۨ۫ۧۥۘ۬ۨ۬ۡۡۛۡۦۢۥۤ۬۫۠ۗ۫ۚۨۘ۟ۡۧ۠ۤۡۘۚۘۜۘ";
                                            break;
                                        case 548308464:
                                            str3 = "ۢۧۡۘۜۥۡ۬۟ۤ۟ۨۨۨۙۦۢۚۛۜۡۘ۫ۤۥۘۖ۠ۧۥۖۗ۟ۘ۟ۘۥ۟۫ۘۥۘۦۢۗ";
                                            break;
                                        case 742882231:
                                            str2 = "ۖ۠ۖۘۤۖۚۦۙ۫ۙۥۧۘۗۙۛۖۦۦۤۨۜۘۘۢۡۘ۟ۛ۟ۥۚۨۛۧۙ۟۟ۚۛ۟ۦۘ۟ۥۤ۟ۦۛۦۦۨ";
                                            break;
                                        case 841495634:
                                            str3 = mode == Integer.MIN_VALUE ? "ۚ۬ۦۛ۠ۘۡۖۘۘۨۡ۠ۜۛۡۘۢۙۢۡ۟۫ۙ۟ۘۚۢۛۢۦۨ" : "ۛۚۘۜۥۢۛۨۨۘۨ۠ۗۨۦۡۘۗۧۡ۟ۜۙۚ۟ۦۘ۟ۡۜۢۜۨ";
                                            break;
                                    }
                                }
                                break;
                            case -938151683:
                                str = "ۢۗۘۥۗۤ۠ۖۚۗ۠ۧۜۧ۫ۚ۫ۨۘۖۛ۫۟۟ۚ۬ۤۦۘ۬ۖۡۘۜۧۢۚ۬ۙ۠۫ۡۘ۫ۢ۠";
                                break;
                            case 1439195591:
                                str2 = "ۦۚۡۘۢۘۥۧۛۖ۫ۖۧۨۖۚۧۗۡۘ۠۠ۢۜۜۜۘۤۗۖ۫ۢ۬ۡۦ۟ۧۤۧۤۥ۟ۛۧ۬ۙۛ۫۟ۨۧۦۗۖ۫ۢ۬";
                                break;
                        }
                    }
                    str = "ۙ۟ۜۡۗۛۗ۬ۥۘۢۤۛ۠ۢ۬ۥۙۖۨ۬ۚۖۨۤۢۧۥۦۘۘۜۨۗۜ۫ۨۛ۬ۗۢۘۙ";
                    break;
                case -1479729889:
                    setCurrentItem(this.OooooOo);
                    str = "۬ۛۘ۬ۛ۟ۦۜۨۘۗۨۧۘۗۗۨۘۚۜۥۗۨۢ۬ۤۢۘۚۢ۟۬ۧۖۚۥۘۚۙ۫ۦ۬ۡۤۜۡۘۥۛۦۘۢ۟ۗ";
                    break;
                case -1446442807:
                    str = "۟ۜۖ۫ۤۜۤۧۦۡۗۥۙۡۘۙۚۚۢۤۨۖۡۘۙۦۧۘ۬ۖۥۖۥ۠ۘ۬ۜ";
                    break;
                case -1305357004:
                    measuredWidth2 = getMeasuredWidth();
                    str = "۫ۛۚۢۗ۟۫ۘۘ۫ۛ۟ۤ۠۟ۦۗۖۖۨۢۚۨۜۘۦۚۛ۟ۢۖۘۙۧۥۘۗۛۨ۟ۥۜۘۛ۠ۗ";
                    break;
                case -1054946505:
                    this.OooooOO = i4;
                    str = "۟ۜۖ۫ۤۜۤۧۦۡۗۥۙۡۘۙۚۚۢۤۨۖۡۘۙۦۧۘ۬ۖۥۖۥ۠ۘ۬ۜ";
                    break;
                case -683247827:
                    measuredWidth = getMeasuredWidth();
                    str = "ۘۜۖۘۡ۫۬ۢۨۘۘۖۖۥۘۦۦۢ۫ۧۡۘۘۜۨ۠ۦۘۛ۟ۡۜۡۛ۟ۤۦۛۨۥۨ۫ۖۘۚ۠ۜۘ";
                    break;
                case -682085096:
                    mode = View.MeasureSpec.getMode(i);
                    str = "ۢۙۜۘۥ۫ۢ۠۠ۚ۟۫ۦۢۖۤ۬۠ۜۘۜ۠ۖۘۨۤۦۘۤۥۜۡۡۥۘ";
                    break;
                case -557804381:
                    String str4 = "۠ۧۨۘ۠ۛۜۖۘۗۨۢ۬ۤۛۨۘۙ۠۫ۦۤ۬۬ۙ۫ۙۗۥۘ۠ۘۙۜۘۧۘۤۢ۬";
                    while (true) {
                        switch (str4.hashCode() ^ 592903725) {
                            case -887640980:
                                str = "ۗ۬ۦۘ۟ۤۥۘۦ۟ۛۘ۟ۘ۬ۦۥۘۤۥۖۧۧۚۢۧۘۘۢۧ۟ۛۥۙ";
                                continue;
                            case -848745992:
                                str4 = "۠ۢۥۘۖۧۡۛۚۘۘ۫ۚۚۥۢۘۗۧ۫۟۟ۘۘۧۖۜۙۡۦۥۡۦۘ";
                                break;
                            case -356325926:
                                String str5 = "ۜۛۧ۫ۤۜۘۥۨۚۨۛۡۘۘۨۨۘۚۘۢۘۤۥۘ۠ۦۡۥۖۚۢ۫ۘۘۚۜۥۘ۟ۘۗ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-931138814)) {
                                        case 647508117:
                                            str4 = "ۗ۬ۘۘۘ۟ۤۤۡۘۘۚۢۘۙۚۜۘ۬ۥۧۘۖۥۧ۬ۜ۬۟ۖ۫ۘۜۨۛۜۛۘۥ";
                                            break;
                                        case 650750612:
                                            str4 = "ۡۡۚۜ۟ۙۤ۬ۖۗۘۗۡۡ۬ۦۗ۬ۡۖ۫ۧۘ۫ۛۘۘۚۗۖۘۧ۠۫۫ۙۖۘۨۢۘۥۧۖ";
                                            break;
                                        case 1730400888:
                                            str5 = "ۚۢۚۘۙۢ۫ۜۘۘ۟ۡۨ۟۬۟ۧۛۨۘ۟ۘۥۘۤ۬ۘۜ۟ۡۘۦ۫ۖۘ۬ۛۥۘۗۗۘ۫ۡ۟ۨ۬ۨۖۖۗۤ۫ۘ";
                                            break;
                                        case 1872806929:
                                            str5 = childCount > 2 ? "ۙ۠ۜۘۗۜۖۥۙۥۘۛۙۥۧۙۖ۫ۙۨۡۥۡۘۗۚۡۘ۠ۚۛۦ۬ۥۜۡۜۘ۠۠ۖ" : "ۗ۠ۜۤۜ۟ۨۛۤۙۗۤ۠ۨۖۙ۠ۙۘۧۧ۟۠ۖ۟ۚ۠ۘۘۛ۫ۦۛۤۛ";
                                            break;
                                    }
                                }
                                break;
                            case 11060765:
                                str = "ۥ۫ۚۢۦۘۥۜ۟ۡۗ۫ۗۜۘۙ۬ۙۗۧۛۧۚۗۡۛۦ۬ۜ۠ۡۛۜۢۙۖۜۘۖۛۥۘۙۢۥۢۤۘۥۥۦۘۡۘۦ";
                                continue;
                        }
                    }
                    break;
                case -523967143:
                    setFillViewport(z4);
                    str = "ۚۢۘۘۚۦ۬ۛ۫۠۫ۗ۟ۚۚۨۚۥۘۘۙۤۦ۟ۚۨۘۛۘۧۘۢۦۘۘۨۖۨۘۘۚۤ";
                    break;
                case -257569788:
                    i3 = -1;
                    str = "ۥۖۥۘۜۛۦۤۜۥۖۜۡۘۘۖۦۢۜۛۥۦۖۦۘۖۘۦۧۧۡ۠۠ۡۡۜۛ۠ۜۤ۠ۥۥۚۗ";
                    break;
                case -232557454:
                    z = true;
                    str = "ۡۢۢ۬۬۟۟ۤۜ۬ۨ۬ۨۙۙۜۗۥۨۨۘۘۘۧۦۡۖۘۚۡۙۦۨۢ۫ۛۥ";
                    break;
                case 6570976:
                    String str6 = "۟ۚۙۙۡ۟ۗۜۤۘۜۘۨۦ۠ۚۡۡۚۦۘۥۡۖۥۚ۫ۥ۟ۡۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 63717243) {
                            case -1817824119:
                                str = "ۘۖۦۘ۬ۛۧۧۨۘۗۢۗۨۡۗۧ۟ۖۘ۫ۨۛۚۨۧۘ۫۠ۚۦۚ۫۟ۘۧ۟ۢۘۘۗۦۦۘۧ۫ۨۘ";
                                continue;
                            case -88469349:
                                str = "۫ۙۥۛ۬ۨۦۜۥۘ۬۬ۡۚۢۨۛۦۛ۫ۙۨۧۛۛۡۛ۟ۗ۠ۖۦۚ۟ۤۥۗۦ۬ۖۦۢۙۨۖۘۡۨۙۨۤۛۤۘۧ";
                                continue;
                            case 353488584:
                                String str7 = "ۧۧۘۘۜۙۡۤۖۧۖ۠ۜۦ۬ۘۘۧۚۤۚ۫۟ۛ۟ۘۜۘ۫ۨۦۘۜۘۜۘۧ۬ۧۨۥۙۚ۫۫ۤ۫ۖۘۚ۬ۥۘۥۤۡۢۤ۬";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1961799759)) {
                                        case -1659210324:
                                            str6 = "ۖۘۘۘۘۥۡۘۘۧۗۡۧۨۢۡۥۘ۬ۘۙۦۙۨۘ۟ۛۥۘۛۤۡۘ۟ۜۜۘۙۖۤۥ۟ۨۘۥۜۡۢۛۛ۬۫۫ۦۡۡ";
                                            break;
                                        case -83742831:
                                            str7 = "ۗۨۦۘ۬ۢۘ۫ۨۨۘۧۧۚۢۘۗۡۨۜۘ۟ۙۖۘ۟ۙۡ۠ۡۘۘ۬ۥ۫ۛۜۦۘۦۨۨۘ۟ۦۥ";
                                            break;
                                        case 1614625839:
                                            str6 = "ۨۖۤۖۛ۟ۛۚۤۖۦۘۖۙۗ۠۠۠ۦۧۨۚۜۚۘۡۜۘۛۚۗۗۧۖ۟ۡۤۥۛۤۛۛۥۘۖۨۛۡۤۨ";
                                            break;
                                        case 1763047730:
                                            str7 = mode == 1073741824 ? "ۡۧ۠ۘۢۡۧۡۦ۠۬ۦۘۜ۠ۡۘۛۢۡۘۛۚۛۥۦ۟ۤۘۜۘۛ۟ۜ" : "۟ۖۘۚۥۜۘۢ۟ۥۘۗۦۦۖۚۜۘ۬ۘۘۨۨ۬۫۬ۡۗۚۦۨۡۥۘۤۥ۬ۛۦۦ";
                                            break;
                                    }
                                }
                                break;
                            case 1068028678:
                                str6 = "ۜۚۖۙۡۦۘۨۘۘ۬ۡۦۘ۟۠ۛۢ۠ۙۡۡۖۘۨۜۘۢۗۨۤۖۖۘ۟۠ۤ";
                                break;
                        }
                    }
                    break;
                case 34970439:
                    childCount = this.Ooooo00.getChildCount();
                    str = "ۚۚ۫ۘۛ۬۠ۘۘۘۘ۬ۖۙۥۘۜۛۛۥۙۗۛۖۦۜۙۢۧۤۧ۠ۦۧۗۨ۟";
                    break;
                case 66397653:
                    str = "ۗۘۢۗۛۛۘۥۘۘۚۜۥۤ۠ۥۚۗۦ۫ۢۘۘ۬۫ۘۘۤۘۛۙۦۘ";
                    z4 = z3;
                    break;
                case 93750245:
                    break;
                case 264889472:
                    String str8 = "۟ۛۜۘۤۡۡۘ۟ۗۥۘ۠ۖۧۘ۠۬ۨۘ۟ۡۗۨۢۤۨۨۚۦۦۘۨۤۡۘۢۖۘۘۛۗ۠";
                    while (true) {
                        switch (str8.hashCode() ^ 1194225693) {
                            case -1482785075:
                                String str9 = "۠ۢۗۘۡۘۘۥۡۘۤۜۧۘۖۜۡۘۨۜۘۘۖۚۡۘ۟ۦ۠ۜۘۡۛۢۡۘ۬ۗۚۧۢۦۙۥۚۥۗۦ";
                                while (true) {
                                    switch (str9.hashCode() ^ 2126831654) {
                                        case -1612872228:
                                            str8 = "۠ۨۧۛۜۦۤۥۖۘۚۢۦۘۚۙۜۘ۠ۛۨۧۡۜۗۡۙۨۘۥۙۨۖۘۥ۟ۜۡۦ۠";
                                            break;
                                        case -1244992916:
                                            str9 = "۫ۚ۬۟ۛ۠ۖۡۢۘۡۦۡ۫ۜۜۗ۟ۜ۬۟ۤ۬۟ۤۥۧۗۥ۬ۧۛۧۦۜۘۙۨۖۛ۬۬ۦۦۘۛۖ۫";
                                            break;
                                        case -866887989:
                                            str8 = "ۚۡۨۘۥۧۘۚۜۦۜ۬ۙۧۛ۠۬ۨۘ۠ۚۙ۟ۚۡۘ۫ۛ۟ۦ۫۟۬ۘۥۤ۠ۡۤۙۙۙۢۗ";
                                            break;
                                        case 114427513:
                                            str9 = mode != 1073741824 ? "ۦ۬ۥۧۜۛ۬ۖۦۘۙۘۡۘۧۡۛۚۦۤۚ۠ۗۜۥۖ۟ۦۥۘ۬ۨۦ۬۠ۨۘۘۢۦۧۛۦ۫ۤۨۘۨۧۘۖۙ۟" : "ۦۢۜۘۦۡۖۜ۫ۗۨۘۨۘۥ۟ۜۗۡ۬۬ۚۦۘۙ۠ۦۛۛۡۘۡ۟۫ۘۤۨۜ۟ۙۥۖۧۘۘۥۨ۟ۨۜۚ۬ۥۘ۫ۤۡۖ۠ۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case 166490819:
                                str = "ۢۗۘۥۗۤ۠ۖۚۗ۠ۧۜۧ۫ۚ۫ۨۘۖۛ۫۟۟ۚ۬ۤۦۘ۬ۖۡۘۜۧۢۚ۬ۙ۠۫ۡۘ۫ۢ۠";
                                continue;
                            case 1583039762:
                                str = "ۛۤۘ۟ۢۦۘۜ۟ۨ۠ۜۗۢۢۥۤۤۗۘۨۘۡۤۖۘ۟۟ۡۘۧۢۨۘ۫ۦۘۘۘۡۙۡ۟ۛ۬ۗ۬ۦۛۥۘۥۡۙ";
                                continue;
                            case 1858521790:
                                str8 = "ۙۗ۟ۘۘۙۥۘ۠۟ۨۧۘ۫۫ۡۖۡۧۘۖۥۦۘۦۜ۟ۙ۠ۦ۟۠۠ۖۚۡۘۨ۫ۡۘ";
                                break;
                        }
                    }
                    break;
                case 657581865:
                    str = "ۛۨۜۤ۟ۨۘۖۢ۫ۡۥ۬ۤ۠ۜۘ۫ۨۥ۠۟ۘ۠ۘۖۘۤۙۚۘۧۗۥۙ۬ۘ۠ۤۦ۠ۢۧۡۡۘۥۥۜۗۙۦ";
                    break;
                case 789766905:
                    this.OooooOO = View.MeasureSpec.getSize(i) / 2;
                    str = "ۖ۫۬ۜ۬ۨۨۡ۟ۛۚۘۘۛۚۗ۟۟ۦۡ۠ۜۨۜۛۘۡۢۙۗۥ";
                    break;
                case 817882598:
                    String str10 = "ۡۚۖ۬ۛۥۖۚۢۧۘۙۧۛۥۘ۬ۧۛۗۙۢۤۨ۠ۙۤۧۨۥۥۚۡۥ۟ۘۘۘۦۙۦ۫ۧ";
                    while (true) {
                        switch (str10.hashCode() ^ 1581511154) {
                            case -2072932586:
                                str = "ۗۖۥۢۚ۠ۜۢۜۖۧۤۗۦۛۖ۟ۢۙۨۨۦ۟ۖ۠۠ۨۘۥۘ۠ۤۦۤۜۛۖۘۜۤۘۜ۬ۜۘ";
                                break;
                            case -1120106195:
                                str10 = "ۜ۠ۡۘۥ۫ۘۥۤۡۘۗ۫۠ۢۢۥۢ۫ۡۤ۬ۦ۬۟ۛۖۚۘۘۖۨۦۘۢۖۜ۟۬ۥۘ";
                                break;
                            case -1001404304:
                                break;
                            case 1134907588:
                                String str11 = "ۗۛۡۘۙۖۥۘۘۤۥۘۙۘ۟ۡۧۥۘۧۘۗۙ۫ۦۜۤۙ۬۬ۛۤ۫ۤ";
                                while (true) {
                                    switch (str11.hashCode() ^ (-2077010195)) {
                                        case -1569571284:
                                            str10 = "ۗ۬ۥۧۢ۫ۥۨ۟۠۬۠۠۬۠ۗۢۢ۫۠ۖۘۢۛۜۘ۠۠ۦۚ۬ۥۤۨۨۘۡۖۡۘۧۙۥ۫ۥۜۜۗۡۨۤ";
                                            break;
                                        case -1128498671:
                                            str10 = "۫ۚ۬ۨۨۥۘ۟ۤۘۘۧۢۨۘۛۥۨۥۦۦۘۨۨ۬ۡ۬ۖۛۧۧۗۡۘۘۢۙۛۥۥۨۘ۬ۘۙۘۗۨۥ۠۫۟۬";
                                            break;
                                        case 42802452:
                                            str11 = "ۥۦۖۗۥۜ۬ۖۢ۠ۗۢۧۢۛۖ۠ۙ۫ۧۖ۬ۜۙۦۤۜۘۙ۠ۖۘۡ۫ۖۘۤۦۜ";
                                            break;
                                        case 2062140731:
                                            str11 = z4 ? "ۧۢ۫۠ۙ۠ۙۦۙۤۘ۫ۜ۫ۧۦۨۘۡۚۜ۠ۙۡۘۧۤۨۘ۬ۘ۟ۗۢۤ۫ۢۖ" : "۟۟ۚۦۘ۫ۢ۫ۘ۬ۗ۬۟۠۟ۖۙۨۘۧ۟۬ۖۧۜۢۧۖۖ۠۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    str = "۬ۛۘ۬ۛ۟ۦۜۨۘۗۨۧۘۗۗۨۘۚۜۥۗۨۢ۬ۤۢۘۚۢ۟۬ۧۖۚۥۘۚۙ۫ۦ۬ۡۤۜۡۘۥۛۦۘۢ۟ۗ";
                    break;
                case 893418902:
                    str = "ۧ۠ۘۖۚۨۘۚۖۡۙۤۥۘۘ۠ۚۚ۟ۜۘۙ۟۟ۛۥۡۘۛۦۡۤۥ۠ۢۤۦۘۜۙۡۘۤۥۦۚۥ۬ۚۖۤۙۛ";
                    break;
                case 1259938593:
                    str = "۫۠ۗۦ۟ۛۡۛۘۘۜۢۙۤ۫ۜ۬ۤۚ۠۠۟ۨۨ۫ۥ۠ۦ۫ۢۤۛۦ۟ۚۖۘۜ۬۬۟ۧۜۜۘۨۘۢۜۛ۠ۡ۫ۡۢۢ";
                    z4 = z;
                    break;
                case 1263007749:
                    str = "ۢۤ۫ۥۘۨ۠ۨۛ۬ۘۘۖ۟ۥۧۥ۬۬ۤۘۘۧۖۧ۟ۢۖۥۛۘۥ۠۫ۖۖۘۙۚ۫ۖۘۧ۠ۥۨۨۧ";
                    break;
                case 1304250357:
                    String str12 = "ۚۛۘۘ۟ۖۤۙۜۙۙ۟ۢ۬ۡۘۘۤۜۧ۠ۧ۫ۡۦۥۘۢۚۡۘۦۨۡۥۢۜۘۡۘۖۘ۟۫ۘۘۡۛۖ۠ۦۖ۟ۛۡ";
                    while (true) {
                        switch (str12.hashCode() ^ 2013448392) {
                            case -1888096971:
                                break;
                            case 88210239:
                                String str13 = "ۚۖۥ۫ۛۦۘۨۤۘۘ۠ۚۥۘۚۥۜۘۨۛ۫ۧۤۦۧۙۤۡۖۤۡ۟۠۫ۜۘ۠ۦۤۛۛۡۘۗۚۧۥۛۗ۫ۧۗ";
                                while (true) {
                                    switch (str13.hashCode() ^ 867290904) {
                                        case -1594264637:
                                            str13 = "ۗۚۤۛۨۥۥۨۖۡۨۨۚۥۘۖۗۙۘ۫ۡۥۘۡۘۨۡۙۛۦۘ";
                                            break;
                                        case -513038065:
                                            str13 = childCount > 1 ? "ۨۙۛۛۙۧ۫۠ۙۙ۬ۚۡۨۛۧۖۗۡۨۤ۬ۚۙ۠ۢۖۘ۬ۥ۠۫ۘ۟ۗۥۗۖۛۗۡۡ۠ۧۗۡۘ۬ۘۘۘۙ۬۬ۤۦۡۘ" : "ۤ۟ۥۘ۫ۨ۠ۛ۬ۗ۟ۨۡۜ۠ۦۖۜۙۖۘۗۗۧۡۘۡۨۗ۬۫ۦۘۨۦۦۘۛۧ۬۬ۗۛۧ۟ۤۥۡۚ۠ۨۚۘۘۥۤۘۥ";
                                            break;
                                        case -471240009:
                                            str12 = "۫ۖ۬۠۟ۥۛ۬۠ۗ۠ۥۘۖۙۖۙۥ۬ۨۥۜۖ۠ۥۘ۠ۛۡۜۗ۬ۦ۫۟ۡۖۘ";
                                            break;
                                        case 1005390189:
                                            str12 = "ۙۤۙۡۢۘۗۨۗۤۙۛۖۛۛۡۤۖۢۥۘۙ۬ۛۤۢۤۖۡۘۤ۬۬ۨۛۜۘۙۤۡۘ۫ۨۨۖۡ۠ۢۘۗ";
                                            break;
                                    }
                                }
                                break;
                            case 1339033130:
                                str12 = "۟ۖۗۖۖۖۘۡۛۜۘۡ۟ۧۙۛۗ۠ۗۛۚ۬ۤۢۖۜۨۚۤۨۙۨۘ۫ۗۦ۟ۥۤ";
                                break;
                            case 1415996777:
                                str = "ۘ۬ۥۘۧۖۖۘۖۜۖۛۖۡۨۢۘۘۗۛۖۜۧۦۤۜۦ۠ۚۘۦ۬ۜۨۘ۟۠ۡۜۘۢۡۦ۫۟ۖۜۥۥۜۘۡۘۙۘ۠ۡ۠";
                                break;
                        }
                    }
                    break;
                case 1308371963:
                    str = "ۗۘۢۗۛۛۘۥۘۘۚۜۥۤ۠ۥۚۗۦ۫ۢۘۘ۬۫ۘۘۤۘۛۙۦۘ";
                    break;
                case 1393458998:
                    size = (int) (View.MeasureSpec.getSize(i) * 0.4f);
                    str = "ۢۢۢۙۛۥۜۘۤۚۨۦۨۤۛۨۜ۬ۨۜۗۚ۟ۛۧ۟ۛۘۜ";
                    break;
                case 1400850033:
                    z3 = false;
                    str = "ۙۚۨۧۗۜ۠ۛۜۗۡۨۡ۠ۨۦۘۜۛۧۚ۬ۜۦۥۦۧۖ۟ۜۡۨ۫۬ۜۘۚۤ۠ۗ۠ۙ";
                    break;
                case 1452238171:
                    str = "ۛۨۜۤ۟ۨۘۖۢ۫ۡۥ۬ۤ۠ۜۘ۫ۨۥ۠۟ۘ۠ۘۖۘۤۙۚۘۧۗۥۙ۬ۘ۠ۤۦ۠ۢۧۡۡۘۥۥۜۗۙۦ";
                    i4 = i3;
                    break;
                case 1621441001:
                    str = "ۜۤۘۧۨۛۛۡۥۘۖ۬ۡۘۚۛۘۘ۟ۨۥۘۧۧۙۢ۫ۛۜۖ۫ۗۡۖۥۜۚۜۤ";
                    i4 = size;
                    break;
                case 1743091140:
                    str = "۬ۡۨۢۖۦۘ۬ۦۡۤۖۜۙۦۚۡۡۘۢ۬ۦۡۨۥۘۖۙ۫۟ۨ۫۟۫۫ۥۧۚۘۘۢۦۡ";
                    break;
                case 1982626693:
                    String str14 = "۫ۤۨ۬ۨۘۘۧ۠ۙۤۖۗۗۢۡۘۚۡۗۗۡۧۘ۬ۚۥۜۤۨۙۚۧۙ۬۬ۦۖۘۘۤۢۖۦۗۛ۠ۧۙۦۗۙ";
                    while (true) {
                        switch (str14.hashCode() ^ 1700278986) {
                            case -437155645:
                                str14 = "۬ۧۨۖ۠ۢۥۥۡۘۜ۠ۛۡ۫ۜۧۘۚۚۖۧۖۚۡۘۦۖۚۙ۫ۧ";
                                break;
                            case -94371512:
                                break;
                            case 877925935:
                                str = "ۘ۫۬ۥۚۚۚۦۜۘۡۘۛۚۥ۫۠ۢۡۡۘۜ۟۠ۦۘۘۚۨۦۤۡۢۨۖۥۧۚۤۨۘۦۘۜۗۧۚۢ";
                                break;
                            case 1874716967:
                                String str15 = "ۗۥۡ۟ۨ۫ۖ۠۠۟ۥۘۤۧ۟ۤۛۡۘۜ۠ۤۖۛۜ۠ۜۘۗ۠ۛ";
                                while (true) {
                                    switch (str15.hashCode() ^ 1244190339) {
                                        case -1972230129:
                                            str15 = measuredWidth != measuredWidth2 ? "ۤ۫ۖۘۡۢۛۜۢۜۧۛۥۘ۬ۖۘۘۧۡ۬ۗ۟ۤۖۙ۠۟ۛۜۘۨۜۚ" : "ۤۨۜۘۚۙۘۘ۟ۖۖۧۥۥۘۛۗۦۦۘ۠ۢۛۢ۠ۘۦۚ۟ۙۛ۟ۥۢۘۢ۬ۖۨۥۘۖۤۜۖۦ۬ۜۧۘۙۨۡۘۡۚ۬";
                                            break;
                                        case -1438587207:
                                            str14 = "۫۫ۦۘۙ۟۠ۧ۟ۘۛۛۛۤۧۧۥ۟ۡۘۧۨۙۦۖۖۘۨۦۦۧۛۨۘ۬ۘۚۥۜۧۘۨۥۥۘۤۢۦ۟ۨۚۘۢۧ";
                                            break;
                                        case 448950770:
                                            str15 = "ۜۙۘۖۛۗۘۜ۠ۚۘۘۚۤۜۚۜۡۘ۠ۦ۬ۙ۠۫ۛۚۘ۫۫ۗ۬ۢۜۘۛۦۘۡۦۖۘ۬ۧۦۘ";
                                            break;
                                        case 809899710:
                                            str14 = "ۛۡۨۘۨۧ۬ۢۡۧۛۥۙۛ۟ۤۙ۠ۙۤۢۚۘ۬ۢ۫ۥۘۙ۠ۜۚۨۦۘۛۜۜۨۘۢۡۙۙۧۦۘۛۥۛ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    str = "۬ۛۘ۬ۛ۟ۦۜۨۘۗۨۧۘۗۗۨۘۚۜۥۗۨۢ۬ۤۢۘۚۢ۟۬ۧۖۚۥۘۚۙ۫ۦ۬ۡۤۜۡۘۥۛۦۘۢ۟ۗ";
                    break;
            }
            return;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        ViewPager.OnPageChangeListener onPageChangeListener = null;
        String str = "ۜۜۙۨۜۘۜۗۡۚۨۖۘۥۖۛ۫ۜۥۘۦ۠۬۠ۖۜۘ۫ۨۡۦۤ۫۬ۗ۠۠۠ۙۥۤۦۥ۫ۗۚۘ۟ۡۡۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 69) ^ C4095le.o00000o0) ^ 229) ^ (-665751153)) {
                case -1737111073:
                    onPageChangeListener.onPageScrollStateChanged(i);
                    str = "۠ۡۗۥۛۘۘۥۤۜۧ۬ۦۡ۟۬۫ۙۧۛ۟۬ۘۥۢۦ۬۫ۗۥۘۘ۠ۢۧۘۛۖ۠۟ۙۚۦ۠";
                    break;
                case -1179868195:
                    onPageChangeListener = this.OooooO0;
                    str = "ۡۡ۬ۤ۬ۛۧۛۨۗ۟ۥۥۚۜۛۘ۬ۘۡۙۚۥۨ۫ۛۡۘۜۜۦۘۙۜۥۘۛ۠۠ۜۤۡ۬ۤ۠ۦ۠ۧۨۥۖۨۘۜۦ۠ۗ";
                    break;
                case 982939088:
                    str = "ۦ۬ۧۤۧۥۨۜ۬ۘ۟ۜۥۦۙۢۧ۟ۢ۫ۦۘ۠ۗۡۚ۫ۢۘ۬ۗ";
                    break;
                case 1870316248:
                    String str2 = "ۧۧۡۘۡۨۜۖۧ۟ۘۘۜۘۨ۟ۙۚۙۖۘۙۥۨ۟ۚۦۚۢۛۖۧۚۖ۬ۘۘۙۡۛۧ۟ۨۘ۬ۗۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-684103733)) {
                            case -2133873696:
                                String str3 = "ۚۘۘۖۦۗ۟ۗۦۙۗۖۙۖ۬ۘۨۦۚۥۦۨۤۨۘۗۧۙۥ۟ۢۨۘۗۙ۬۫";
                                while (true) {
                                    switch (str3.hashCode() ^ 241695187) {
                                        case -1250504774:
                                            str3 = "ۚۖۢۖۤۦۘۥۗ۬ۧۗ۟ۥۙۡۡۦۚۚۤۘۤۜۨۦ۠ۗ۬ۧۦۘ";
                                            break;
                                        case -138380726:
                                            str3 = onPageChangeListener != null ? "ۙۖۨۘۧۘ۫۠۫ۛۢۧۡۘ۫۬ۤۦۙۨۘۦۦ۫ۜۚۨ۬ۦۘۢۡۦۘ" : "ۚۗۙۗ۟ۦۥ۟۠ۦ۬ۦۘ۟۬ۗۨۨۥۘۙ۠ۘ۫ۚ۟ۘۨۦ۠ۛۨ۠ۙۧ۫ۚ";
                                            break;
                                        case 1172908725:
                                            str2 = "ۥ۠ۙ۟ۛۜۘۧۗۦۖۦۗۖ۫۠ۧۤۘۘ۫ۢۛ۬ۤۧۖ۟۫ۧۗۘۚ۠ۡ۫۟ۚۘۗۡۡۙۧ";
                                            break;
                                        case 1584944854:
                                            str2 = "ۥۙۥۜۚۜۜۛۧۖۤۜۘ۠۫ۨۘۗۚۜۘۢۥۦۘ۬ۢۤۨ۠ۨۘۨۤۖ۠ۗۙ۫ۜۡۘۖۡ۟ۜ۬ۦۨۧ۫ۥۢۛ";
                                            break;
                                    }
                                }
                                break;
                            case -2060474419:
                                str2 = "۠ۛ۟۠ۢۨۧۛۜ۟ۜۚۨۤۘۖۛۗۗۢۖۢۢۖۥۢۘۛ۫۠ۢۖۘۜۛ۠ۡۖۗ۬۫۠ۧۚۡۘۨ۟ۧ";
                                break;
                            case 1204000801:
                                str = "۠ۡۗۥۛۘۘۥۤۜۧ۬ۦۡ۟۬۫ۙۧۛ۟۬ۘۥۢۦ۬۫ۗۥۘۘ۠ۢۧۘۛۖ۠۟ۙۚۦ۠";
                                continue;
                            case 1887093910:
                                str = "ۤۖۘۘۜۧۡۘۜۘ۠ۥۙۡۘۘۤۗۙۘ۫ۧۜۢۙۡۦۦۥۧۜ۬۟";
                                continue;
                        }
                    }
                    break;
                case 1982351594:
                    str = "ۦۜۨۘۜۗۘۘ۫۬ۖۘۘۚۧۤۦۦۧۖ۠ۨۢ۟ۛۗۛۗۛۗۡ۠۠";
                    break;
                case 2011725592:
                    return;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        ViewPager.OnPageChangeListener onPageChangeListener = null;
        String str = "ۚۗۘۖۤ۫۫ۦۘۜ۠ۛۚۢۢۜۙۡۘۚۘ۫۫ۚۢۙۦۨۘۤۚۧۗۖۡ۬ۗۨۘ۫ۧۙۢۜۨۘۨۦۡۢۖۘ۟۠ۖۘۛ۠ۡ";
        while (true) {
            switch ((((str.hashCode() ^ 700) ^ 898) ^ 802) ^ 1662737814) {
                case -1441520269:
                    onPageChangeListener.onPageScrolled(i, f, i2);
                    str = "۫۟۟ۙۥۛ۟ۡۘۥۥۗۜۤۡۘۜۜۛۚۤۥۘۤۗۨۘ۫۬۠ۙ۠ۢۙ۟ۗۘۛ۬";
                    break;
                case -196548734:
                    str = "ۛ۠ۡۥۨۜۘۦۨۜۤۗۨۤۧۥۘۡۨ۬ۥ۟ۨۘ۬۬ۘۘۚۥۦۤۗ۬ۥۛۜۘۗۨۜۘ";
                    break;
                case -70255656:
                    str = "۟ۖۨۢۙۤۡۤۥۛۤ۬ۢۖ۫ۢۗۥۘۚۦۧۘۛ۠ۡۘۨۛۖۦۚۡۘۡۚۨۙ۫ۨۘۖۨ۠ۦۚۘۘ";
                    break;
                case 1166313857:
                    return;
                case 1320562774:
                    String str2 = "ۢۦۡۘۗۡۖۘ۫ۡ۫ۙۙۡۙۗۦۖۧۧ۠ۛۢۢۜۙۜۡۤۛۦۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1196770791) {
                            case 229974735:
                                String str3 = "ۗۙۗۛۜ۬ۦۢۚۧ۫ۤۡۢۦۡۤۨۘۜۙۡۘۗۥۜۤۗ۠ۥۜۘ۠ۤۥۘۧ۠۬ۢۨۤۢۧۖ۟ۘۘۢۜ۫ۘۢۜۜۚۡ";
                                while (true) {
                                    switch (str3.hashCode() ^ 2057073850) {
                                        case -873094677:
                                            str2 = "ۙۧۖۘۤۗۦۡۜ۠ۤۗۧ۬ۤۚۦۖۘۗ۬ۛ۠۟ۖۘۘۗۛۧ۬ۜۧۨۡۘۦ۠ۡ";
                                            break;
                                        case -312276930:
                                            str3 = onPageChangeListener != null ? "ۡۨ۫ۖۚۜۤۘۙ۬ۜ۠۠ۘۘۡۚ۫ۛۛۡۘۦ۠ۛۢۧۙۚ۬۬ۦۘۢۜۡ۠ۙۡۤۙۥۢۛۜۘ۟ۦۙ" : "ۖۡۡۘۦۢۥۙۦۥۘ۠ۚ۬۫۟ۜۘۢۚۥ۬ۖ۫ۤۘۜۘۤۙۙۚۧۢۚ۬ۢ۫ۛۜ۫۟ۥۚۤ۠";
                                            break;
                                        case 388058885:
                                            str3 = "ۡۙۦۘ۫ۢۤۘ۠ۨۘۡۡۦۘ۟۟ۙۢۚۗۢۛۢۥۘۗۧۨۧۘۡۤۧۥۤۚۨ۟ۗۢۗۖۘۢۡ۫ۥۥۧ۠ۖۛۡۥۡ";
                                            break;
                                        case 1519375113:
                                            str2 = "ۛ۠ۨۘۖۥۧۘ۠ۥۗۥۦۢۡۦۧ۠ۨۜۥۜۧۘۗ۠ۘۢۘۘۥۖۥۘۤۤۥۘۗ۟ۖۘۜۘۡۘۧۨۙۗۤۡۘ۫ۧۨ";
                                            break;
                                    }
                                }
                                break;
                            case 850978993:
                                str = "ۜۚۘۨۧۨۘۡۡۦۡۜۗۥ۟ۚۥۨۤ۟ۡۚۖ۠ۥۘۡۦ۟ۧۡۘ";
                                continue;
                            case 1464557490:
                                str2 = "ۧ۟ۖۘۖۖۜۖ۫ۤۙۦۡۘۖۘۥۧ۠ۗ۬۬۟ۡۘ۠ۨ۬ۘۙۛۖ";
                                break;
                            case 1809812322:
                                str = "۫۟۟ۙۥۛ۟ۡۘۥۥۗۜۤۡۘۜۜۛۚۤۥۘۤۗۨۘ۫۬۠ۙ۠ۢۙ۟ۗۘۛ۬";
                                continue;
                        }
                    }
                    break;
                case 1380966926:
                    str = "ۗۨۘۗ۟ۥۘۛۗ۬۟۠ۡۚۨۘۥ۠ۘۘۙۦۢۗۧۘۨۤۗۘۘ۠ۦۢۡۘ۫۠ۛۗۦۘۡۚۖۘۗۘۨۘۨۢۦ";
                    break;
                case 1959982197:
                    str = "ۥۨۡ۟ۨۢۘۡۛ۫ۘۡۘ۬ۘ۠ۧۜۛۨۚۚۥۧۨۘۜۤۜۚۛ";
                    break;
                case 1995722474:
                    onPageChangeListener = this.OooooO0;
                    str = "ۨ۫ۥ۟ۦۛۥۚۡۘۤۘۥۖۨۜۤۦۧۘۢۦۡۘۡۘۚۘۥۘ۬ۨۧۘۤۥۛۨۜۚۨۦ۬ۧۦۥۥۖۖ۠ۛۚۘۜۦۡۧ۬";
                    break;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        ViewPager.OnPageChangeListener onPageChangeListener = null;
        String str = "ۥۥۥۢۤۚۘۘۖۘۦۢۨۘۙۨۨۘۦۧۙۜۗۘۦۡۨۘ۬ۦۛ۬ۧۦ۫۟ۗۚۧۘۘۧۚۜۘ۟ۙۦۙۢۨۘۙۗۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 849) ^ 870) ^ 831) ^ (-913809285)) {
                case -1334834185:
                    str = "ۘۦۢۦۡۨۙۘۨۘۥۥۘۚ۠۟۬ۛۥۘۜ۠ۗۚۙۘۘۗۘۧۘ۫۠ۧۧۖۤ۫ۙۧ۫ۚۤۡۖۖۘۢۖ۟۬ۜ۬";
                    break;
                case -1266501107:
                    str = "۠ۨۥۘۙۖۥۤۥۜۘۚ۫ۦ۫ۤۖۘ۟۬۬۠ۛۦۘ۫ۤۘ۫ۦۦۘۗۡۡۢۥۜۘۖۛۨۚۢ۠۟ۛۥ";
                    break;
                case -1246944043:
                    return;
                case -966307277:
                    setCurrentItem(i);
                    str = "ۘ۬ۧۘۖۡۘۜۢۜۙۧۖۙۜ۬ۛۗۨۢۨۥۘ۟ۘۘۖۚۘۘۨۤۗ";
                    break;
                case -162321304:
                    String str2 = "۟ۖۨۘۥ۟ۥۛۡۡۡۘۨۤۤ۬ۛۛ۠۬ۡۘۢۙۚۜۨۨۚۦ۟۬ۨۛۨۙۘۢۖۜ۫ۦۖۘ۟ۙۦۤۖۤۘۥۜۚ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 948573559) {
                            case -1196266155:
                                String str3 = "ۛۘۜ۟ۜۖ۫ۘ۫ۘۧۨۚ۬۬ۚۚۥۘۡ۬ۜۘۖۖۜۘۗۘۥۗ۟ۘۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-947750316)) {
                                        case 691829254:
                                            str2 = "ۚ۬ۢۢۧۛۥۘ۟۠۟ۚۢ۟ۙۧۢۡۥۘ۫ۘۘۘۚۛ۬۠ۥ";
                                            break;
                                        case 769962509:
                                            str2 = "۟ۚۗ۬ۛۚۘۙۥۢ۟ۜۘۧۖ۫ۦۡۚۢۛۘۘۢ۟۫۟ۙۨۘ۬ۗۨۥۦۤۛ۟ۙ۠ۧۨۚۦۤۡۜۤۖۘۜۚۥ۫ۥۧۦۘ";
                                            break;
                                        case 912219431:
                                            str3 = "۫ۖۨۤۗۦۘۚۥۜۘ۬ۙۚۦۖ۠۟ۥۢۤۖۘۧۖ۟۠ۗۤۧۥۘۨ۬ۛۡۜۘۖۗۦۢ۠ۨۘ۫۬ۗۘۦۡۖۚۡۘۥۚۥ";
                                            break;
                                        case 1108722181:
                                            str3 = onPageChangeListener != null ? "ۚ۬ۢۡۥۦۘۛۢ۫ۦۧۜۘۢۗۘۨۘ۬ۤۥۘۡۨۛۗۧۨۨۡۦۘۖۥۛ۫ۛۧۤۖۥ۬ۦۗۛۛۤۡ۬ۘۧۛ۠ۜۨۛ" : "۟۟ۙۥۦۙۖۤ۬ۗۖ۫ۦۦۖ۠ۜۘۖۜۥۘۛۦۖۙۚۥ۬۠";
                                            break;
                                    }
                                }
                                break;
                            case 51658940:
                                str = "ۙۜۦۦۨۜۘۜۧۦۘۢۡۘۤۦۘۜۖۙۦۖۢۗ۫ۙۚ۫ۚۡۢۙ";
                                continue;
                            case 833228413:
                                str = "۬ۖۤ۬ۡۥ۫ۘۚۤۚۥۘ۟ۦ۟ۚۢۛۢۢۦۚ۫ۖۘۤۤۥ۫ۡۨۘۥۦ۫۬ۘۨۘۦ۬ۜۘۡۤۢۥ۬ۛۜ۫۫ۙۧۧ۬ۨۘ";
                                continue;
                            case 1328398662:
                                str2 = "ۥۛۛ۫ۧ۫ۛۖۜ۬ۧۧۙ۬۫ۗۗۡ۬۬ۖۘۗۜۨۘۖۗ۫۟ۤۤ";
                                break;
                        }
                    }
                    break;
                case 1221018204:
                    onPageChangeListener.onPageSelected(i);
                    str = "ۙۜۦۦۨۜۘۜۧۦۘۢۡۘۤۦۘۜۖۙۦۖۢۗ۫ۙۚ۫ۚۡۢۙ";
                    break;
                case 1250112605:
                    onPageChangeListener = this.OooooO0;
                    str = "ۙ۟ۤۜ۠ۦۘۖۥۜۘۨۘۡۘۧۜ۬ۚۡۘ۟ۦۢ۬۫ۨۨۧۜ۟۟ۤ۬۟۬۠۠ۗ۟ۙۙۥۖۥۢۨۚۚۧۖۘ";
                    break;
            }
        }
    }

    @Override // p285z2.InterfaceC4572ya
    public void setCurrentItem(int i) {
        String str = "ۘۤۚۜ۟ۤۙۤۚۗۨۗۥۡ۫ۜۖۘ۬ۗ۠ۖۡۦۘۡۥ۟ۢۧ۬";
        int i2 = 0;
        boolean z = false;
        boolean z3 = false;
        View childAt = null;
        int i3 = 0;
        int childCount = 0;
        ViewPager viewPager = null;
        while (true) {
            switch ((((str.hashCode() ^ 417) ^ 437) ^ 154) ^ (-1391958406)) {
                case -2026176407:
                    str = "ۨ۫ۘۘۜۥۥۙۛ۟ۚۖۨۘ۠۟ۜۘۥۤۨۘۘۦۘۚۖۤۙ۟ۛۤۨۘۘ۬۬ۨۧ۠ۥۘۨۖۜۚ۟ۚ۬۫ۘ۟ۡۨ";
                    i3 = 0;
                    break;
                case -1756088733:
                    String str2 = "ۘۡۙۗۤۜۘۖۘۢۤۡۤۥۖۥۙ۬ۘۘۦۧ۫ۤ۫ۘۦۥۦ۠ۤ۬ۚۚۦۦۚۜۘۜۦۖۘۙۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1533529036) {
                            case -1982813794:
                                str = "ۗۥۖۧۗۥۢۙۘۡۡۥۘۚۦۚۘۗۦۘۨۥۙۡۡۧ۠۟ۘۘۧۙۜۘۙ۠ۧۙۚ۬ۘۚۦۘۚۢۘۘ";
                                continue;
                            case -906733795:
                                str = "ۛۙ۠۫ۨۥۦۖ۬ۧۗ۟ۙۖۡۘۤ۬ۧۙۧۛۧۜۗ۟۟ۧ۟ۜۡۘۖ۠ۘۘۖۡۨۘ";
                                continue;
                            case -98713080:
                                str2 = "ۗ۟ۦۘ۬ۦۡۘ۟ۨۦۥۤۖۡ۠ۦۢۙۡۥۙۙۥۖۨۘۧۙۘۛ۟ۦۜۘۗۧۙۦۜۜۗۛۨ";
                                break;
                            case 200955793:
                                String str3 = "ۙۥۘۘۛۨۦۘۥۢۤۤ۫ۢۡۚۚ۫۫ۡۘۤۘۜۘ۬ۘۖۘ۬ۖۦۘ۫ۦۦۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-224671356)) {
                                        case -1629956733:
                                            str2 = "۬ۦ۠۫۫ۡ۠۠ۚۢۢ۬ۜۘۗۨۛۜۛ۟ۡۘ۬ۥۗۗۢۚ۫ۖ";
                                            break;
                                        case 590838191:
                                            str2 = "ۗۤۤۖۢۦۡۨۨۤۗۢۥۦ۬ۧ۟ۤ۠ۥۘۧۥ۟۠ۙۛۙ۟۠ۡۘۘۜ۫ۦۢۚۚۥۢۨۙۤۨۘۖۨ";
                                            break;
                                        case 806535364:
                                            str3 = viewPager != null ? "ۢۧۨۘۜۡۢۦ۬ۡۘۥۨۥۘۤ۠ۘۘ۟ۙۦۘۛ۠ۗۡۢۜۘۖۛۦۤۦۤۛۨۜۘۨۡۖۘۛۨۦۢۦۘۢۢۘۨ۫ۥۘ" : "ۘ۬۟ۛۗۖۜۨۖ۟ۨۘۘۚۤۤۨۖۥۘۜۙۡۙۗۥۘۛۨۗۡۥۢۗۚۤۥۛۤۢۧۙۗۘۧۘ";
                                            break;
                                        case 1665958310:
                                            str3 = "ۛۜۨۛۨۦۘۥۛ۟ۚ۬ۧۨۤۨۘ۠ۗۢ۠ۢۖۚۗۜۖۙۧۜۘۨۥۚۛۛۨۙ۬ۦۦ۠ۘ۫۠ۤۜۖ۫ۨ۫ۗ۟ۡۗ۬";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1731946300:
                    String str4 = "ۤ۟ۜۜۚۖۘ۠ۨۖۘۜۛۖۘۦۥۖۗۤۥ۬ۛۨۘۖ۬ۚ۠ۘۧۧۛۛۦ۬ۖۗۥۨۘۙۤۖۘ۬ۜۛۦ۠ۥۜ۬ۤ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1823040432)) {
                            case -1806719143:
                                String str5 = "ۥۧۨۘۨۚۥ۫ۛۜۘۢۦۨۘۜۛۥۨ۫ۛۡۖ۬ۛۢۜۜۧۙۧۖۡۘ۟۟ۙۦ۠ۦۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-203681723)) {
                                        case -1953524134:
                                            str5 = "ۜۘۦۘۨۖ۟ۢۧۧۘ۠ۘ۫ۘۜۘۢ۫۟ۢ۟۫ۜۥۦۘۧ۬ۨۘۙۦ۬ۜۚۚۚۧۚ۫ۜۛۨۘۦۥۗۢۡۛۧۦۨۥۦۚ";
                                            break;
                                        case -595495001:
                                            str5 = z ? "ۚۚۥ۫ۤ۠ۤ۬ۚۢۜۡۤۥۘۘۚۨۛ۬ۖ۬ۜۡۗ۬ۢۡۥۧۧۚ۠ۘۜ۟۫ۨۦۘۘۜۢۤ۟۠۬ۚۜۡ" : "ۗ۠ۙۦ۟ۘ۬ۙۦۗۢ۟ۙۦۦۗ۫ۡۘۚۘۥۘۧۖۜۘۡۦ۬ۥۖۢۥۨ۟ۖۘۦۗ۠ۖۦۙۜۘۜۨۚۜ۬ۘۘ۟ۜۧۘۢۨۧۘ";
                                            break;
                                        case -360188022:
                                            str4 = "۬ۖ۫۠ۧۨۘۘۥۧۘۥۥۨۘۨۡۙۧۥۨۤ۫ۚۥۜۘۧۖۥۚۘۘۗۖۡۚ۫ۥۘۦۥۜۨۡۡ۟ۚۦۧۨ۬ۗ۟ۗۥۤ";
                                            break;
                                        case 1500859845:
                                            str4 = "ۜۥۘۢۧۛۖۡۜۦۡۥۘۧۗۘۖۙۛۢ۫ۙۖ۬ۤۤ۟ۘۘ۫ۦۖ۬ۜۖۘۦۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case 494642090:
                                str4 = "ۡۨۦۘۧۘۖۤۢۡۘۢۙۘۢۢۛ۠ۙۗۡ۫ۛۘ۬ۨۡۦۘۡۛ۫";
                                break;
                            case 810978863:
                                str = "۬ۥۥۘ۫۬ۖۘۤ۠ۙۧۘۡۘۥۦۧۘۙۖۛۗ۬ۦۚۘۛۡۨ۫ۗۛۗۖۛۜۗ۬ۡ";
                                continue;
                            case 1024059796:
                                str = "ۡ۠ۜۘ۬ۢۢۚۢۖۘ۟ۙۘۘۜۛ۬ۖۢۨۘۦۧۘ۫ۦۗۡۙۢۛۧۦۘۘۨ۬ۡۧۜ";
                                continue;
                        }
                    }
                    break;
                case -1354566056:
                    childAt = this.Ooooo00.getChildAt(i3);
                    str = "۬ۢۘۘۧ۟ۜۘ۬۟ۢ۬ۧۥۘ۫ۡ۠ۦۛۥۚۨۦ۬ۦۤۚۖۡ۠ۖ۬ۗۧۡۘۤ۫";
                    break;
                case -1021386819:
                    OooO0oo(i);
                    str = "۬ۥۥۘ۫۬ۖۘۤ۠ۙۧۘۡۘۥۦۧۘۙۖۛۗ۬ۦۚۘۛۡۨ۫ۗۛۗۖۛۜۗ۬ۡ";
                    break;
                case -915295560:
                    str = "ۖۖۧۘۢۙۗۢۜۖۘۢۖۦۘۖۗ۬ۛ۬ۗۢ۫ۖۘ۫۫ۢۨۛۧ۠ۡ";
                    break;
                case -671163630:
                    i2 = i3 + 1;
                    str = "ۤۜۗۖۥۦۘۘۖۤ۬ۘۘۖ۠ۗ۟ۛۘۘۤۗۜۘۡۛۖۘۚۚۙۘۨۘۖۦ۠ۖۚۥۘۢۘۨۤۖۡۗۗۚۗۦۙ";
                    break;
                case -670661179:
                    viewPager.setCurrentItem(i);
                    str = "ۦۨۦۘۗۗۨۢۤۧۛ۠ۦ۠۟ۢۨ۬ۗ۠۠ۨۘۧۥۘۘۢۤۛۦۡۡ۟۬ۘۘۖۨۖۘ۬ۗۧۦۨۧ";
                    break;
                case -509092175:
                    str = "۫ۚۥۘۛۖۙۚۡ۠ۥۗۙۢۧۥۘۛۨۨۘۨ۫ۢۘۚۚۤۢ۬ۚۦۜۘۤۨ۟ۘۡۨ۫ۛۖۖۨۘۥۜۨۘ۫ۢۧ";
                    break;
                case -316301356:
                    str = "ۨۚ۠ۗۗۙۚۥ۬ۤ۬ۜۨ۫ۚ۠۟ۦۨ۬ۗۥۦۥۤۚۘۤۡۨۘ۠ۚۖۧۖۦۘۚۨۧۘ۟ۘۘ";
                    break;
                case -183409293:
                    String str6 = "۫۫ۦۘۜۗ۠ۙۡ۬۫ۢۥ۬۫ۢۜۡۨۙۘۜۘ۠ۜۘۚ۟ۙۘۢۛۗۖۦۘۜۧۙ";
                    while (true) {
                        switch (str6.hashCode() ^ (-163030598)) {
                            case -927568506:
                                String str7 = "۫ۘۨۘ۬ۗۧۖۥۘۥ۟ۨۘ۬ۧۜۘۗۨۤۛۦۘۘ۬ۡۥۘۥۧ۟۟۠ۥۘ۟ۧۜۘۤ۟ۚ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1840440823)) {
                                        case -1999490707:
                                            str6 = "ۗ۠۬ۥۙۘۙ۟ۗۖۡۢ۠۫ۜۚۖۗۨۛۖۘۘۙۘۜۜۜۢۚۢ۠۫ۦۘۡۤۡۜۚ۬ۧۘ۬ۛۘۡۢ۟۟";
                                            break;
                                        case -1088992404:
                                            str7 = i3 < childCount ? "ۤۚ۟۬ۡۥۡۘۧۘۤۛۛ۫ۦۗۙ۫۫۫ۦۢۖ۠ۛ۠۫ۘۨۡۚ۬ۙۙۡۘ۟۬ۖ۟ۖۛۥۘۜۚۥۖۗ۟ۘۙۦ۠ۚۖۘ" : "ۦۢۦۘ۠ۢۖۘۧ۫ۦۨ۬۫ۙۥۨۘۥ۠ۥۘۦۢ۠ۘۘ۠۬۠ۥۘۘۙۦۧۧ۬ۜۜ۫ۥ۬ۜۤۗ۬";
                                            break;
                                        case 150420256:
                                            str7 = "۠۠۫ۧۘۚۡۜۜۘۜ۫ۜۥ۟ۢۡۡۖۘ۫۟ۜۚۥۡۘ۟ۨۨ۠ۘ۟ۦۢۙۚۥۤۦۜۘۤۖ۠";
                                            break;
                                        case 1909154817:
                                            str6 = "ۡۡ۠۠ۧۙۢۘۙۨۦ۠ۥۖۜۨۤۛ۟ۥۘۧۚۥۢۦۘۨۙۨۢۛۚۢۙۧۢۥۡۦۛۘۗۚۥ۬ۘۙۜ۬ۜۨ۟";
                                            break;
                                    }
                                }
                                break;
                            case -687252137:
                                str = "ۚۖۚۗۜۦۘۤ۠۫ۚۧۙ۟ۧۧ۟ۛۚۦۚ۠ۦۘۤۢۙ۟ۘ۠ۚۥۖۡۘۢۘ۟ۖۡۖ۠ۡۥۘۢ۟۠ۘۢۘۘۥۗۥۘۛۗۨ";
                                continue;
                            case -583377664:
                                str = "۠۠ۧۙۢۜۘۖۥۥۘ۬۠ۢۗۢۖۘ۫ۧۨۨۖۦۖۖۘۘۜۨۤۧۦۚۡۨۜۢۦۢۛۜۜۦ۬ۨ";
                                continue;
                            case 976028678:
                                str6 = "ۚۥۦ۬ۨ۬ۖ۟ۡۗۦۧۘۙۗۜۘۛۢۜ۠ۗۦۤۤۥ۠ۢۨۜ۠ۖ";
                                break;
                        }
                    }
                    break;
                case 5236685:
                    return;
                case 107662659:
                    str = "ۙۘۡۥۨ۫ۖۧۥۙۥۚۖۦۘۙ۟۬۫ۤۖۜ۠۫ۗۧۜ۫ۖۙۛۧۦۘۤۖۖۘ";
                    i3 = i2;
                    break;
                case 208469603:
                    throw new IllegalStateException("ViewPager has not been bound.");
                case 244444254:
                    String str8 = "ۚ۟۠۬ۤۡۙۗۗۗۧۚۛ۟ۘۜۛۡۖۗۗۥۖ۬ۨۗۜۘۡۥۨۘ۬ۙۘۤۙۗۨۜۨۘۧۙۥۨۘۘۡۙۖۗ۫۠ۢۗ۟";
                    while (true) {
                        switch (str8.hashCode() ^ 588420148) {
                            case -1012724561:
                                String str9 = "ۗ۠ۘۘۚۥۢ۫ۡۜ۫ۚ۟ۖۚۦۘۜۜۥۘ۫۫ۥۢۘۡۚۥ۫ۛۨۘۧۥۦۗۡۘۡۢ۫ۛۦۥۘۨۧ۠۬ۡۘۘۥۖۘۡ۫ۦ";
                                while (true) {
                                    switch (str9.hashCode() ^ 177183425) {
                                        case -1861036716:
                                            str8 = "۫ۥ۟ۧۥۢ۫۟ۨۘۗۥۢ۠ۛۢۨۦۘۡۛۡۛۜۖ۟ۜۨۘۧۚۥۘ۠ۦۘۘ۠ۙۛ۟۠ۢۢ";
                                            break;
                                        case -1813526246:
                                            str9 = i3 == i ? "ۦۗۜۘۦۛۥۘۜۦ۫ۦۚۥۨ۬ۘ۟۠ۙ۟۫ۦۘۜ۟۫ۡۧۙۧ۟ۡۘۡۡ۟ۦۢۨۘۚۤ۫ۨۡۘۨ۠ۨۤۢۚ۫ۦۡۢۙ" : "ۗۙۨۘۨۗۡۥۧۢۢۛۨۘ۬۫ۙۙۙ۠ۥۧۘۦۧ۟ۜۥۥۦۦۢۚۥۜۘۖۖۛۖۦۥۧۦۜۛۤ۟ۛۜۧۘ۬ۤۗۦۡۦ";
                                            break;
                                        case -1748059395:
                                            str8 = "ۦۥۡۦۜۖۘۦ۟ۘۘۛۤۥۘۨ۫ۛۨۖۤۖۧۤۨۡۘۘۜۦۥۛۧۛۥۥۤۛۨ۫ۘۜۨۨۨۢۙ۬ۢۦ۫ۘۘ";
                                            break;
                                        case -1270195064:
                                            str9 = "ۥ۫ۘۘۘ۟۬ۦۙۡۥۤۢۚ۫ۥۘۖۥۡۧ۟ۘۖۖۘۘۨۤۘۘۚۤۨۜۛۙۖ۟ۥۘۛ۬ۥ۫ۥۘۗۨۦۢۖۡ۠ۤۨۘ۠۫ۗ";
                                            break;
                                    }
                                }
                                break;
                            case 40635175:
                                str = "ۗ۬ۚۖۦ۬ۨۨۗۦۧۨۘۘۦۨۛ۫ۡۖۙۜۦۙۖۘۤۘۢۧ۟ۜۗۖۦۘۡ۬ۜ۟ۘۗۗۗ۬";
                                continue;
                            case 694478205:
                                str8 = "ۤ۫ۥۗ۠ۘۙۙۨۘۘۦۧ۫ۢۜ۫ۘۗ۠ۘۦۘ۬ۗۜۘ۠۬ۢۥۤۗۧۨۢۡ۟ۢ";
                                break;
                            case 1122082060:
                                str = "ۖۛۚ۠ۜۛ۠۠ۡۘۙ۟ۖۘۖۗۜۘ۟ۚ۬ۡۢۤ۫۫ۗۢۘۗ۠ۦۛ۫ۜۨۘ۬ۗۚۜ۫ۧ۠ۛۥۜۙۘۜۦۖۘۢۡۧۘۢۨۜ";
                                continue;
                        }
                    }
                    break;
                case 340982728:
                    str = "ۨ۫ۘۘۜۥۥۙۛ۟ۚۖۨۘ۠۟ۜۘۥۤۨۘۘۦۘۚۖۤۙ۟ۛۤۨۘۘ۬۬ۨۧ۠ۥۘۨۖۜۚ۟ۚ۬۫ۘ۟ۡۨ";
                    break;
                case 354786961:
                    str = "ۧۥۨۘ۟ۖۥۘ۟ۚۖۦۧۛۨۚۡ۠ۗ۠ۚ۟۠ۙۚۧ۠ۦۘ۠ۛۨ۟ۜۚ۠ۦۢ۠ۘ۟ۖۚ۟ۛۚۗۖۙۧۤۥۥۗۦ";
                    break;
                case 548102257:
                    str = "ۢۧۚ۠ۗۡۘ۬ۧۚۡ۫ۨۘۤۛۛۙۥۜۘ۠ۘۧۘۨۡۤۚ۠ۙ۬ۤۤ";
                    childCount = this.Ooooo00.getChildCount();
                    break;
                case 958526541:
                    this.OooooOo = i;
                    str = "ۖۨ۠۫ۥۧۗۦ۟ۧۚۡۘ۟۠۟ۥۧۙ۫ۧۜۘۛۥ۠ۙۦۘ۟ۥۚۧۘۘۘۢۛ۟ۗۘۛ۟ۛۥ";
                    break;
                case 1032948966:
                    z3 = true;
                    str = "۠ۗۘۘۛۧۘۨۢۨۘۡۡ۠ۜۨۖ۫ۖۚۥۨۜۗ۠ۧۜ۠ۡۛ۟ۤۦ۫ۜۙ۠ۧ۫ۨۘۙ۟ۘ";
                    break;
                case 1138444766:
                    str = "۫ۚۥۘۛۖۙۚۡ۠ۥۗۙۢۧۥۘۛۨۨۘۨ۫ۢۘۚۚۤۢ۬ۚۦۜۘۤۨ۟ۘۡۨ۫ۛۖۖۨۘۥۜۨۘ۫ۢۧ";
                    z = false;
                    break;
                case 1184531911:
                    str = "ۦۢۢ۬۬ۖۘ۫ۗۦۛۜۨۢۙ۟ۜۗۚۧۡۥۘۦۜۙۤۜۤۜۦ۟ۛۚۦۢۛۤ";
                    viewPager = this.Ooooo0o;
                    break;
                case 1270329427:
                    childAt.setSelected(z);
                    str = "۫۟ۢۦۘۡۘۧۤۚۘ۬ۥۘۙۗ۠۠ۙ۫ۚۤۙۤۧ۫ۖۘ۫ۘۗۢ";
                    break;
                case 1410828689:
                    str = "ۢ۠۟ۡۘ۬ۖ۠ۨۚۦ۫ۢۜۘۢ۠ۖۘ۫ۨۚۘۖۙۗۚۥۘۘ۟ۜۘ";
                    break;
                case 1515567706:
                    str = "ۖ۠ۗۧۛ۫ۡۛۗۨۘۥۖ۬ۜۤ۬ۜۘۗۙۧۖۜۡۘۥ۠ۡۘۜۖۚۦۙۡۡ۫ۖۘۘۦۧۨۗۛۦۛۗۧ۫ۗۦۡ۠ۡ۫ۘۘ";
                    z = z3;
                    break;
            }
        }
    }

    @Override // p285z2.InterfaceC4572ya
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        String str = "ۙۥۢۨ۫ۦۦۗۥۘۧۙۘۨۖ۬ۚ۬ۜۨۡۧۥۨۦۘۢۛۘۘۛۦۥۡۘۖۘۨۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 769) ^ 59) ^ 979) ^ (-1072950160)) {
                case -444315395:
                    return;
                case 1091666363:
                    str = "ۨۚ۠۫ۘۦۘۡ۫ۥۘۗ۟۟ۙۜۖۘۡۧۛۘۡۛۗۚۛۢ۫ۨۘ۬۫۬";
                    break;
                case 1188097395:
                    this.OooooO0 = onPageChangeListener;
                    str = "۫۟ۥۥۚۡۢۨۘۥۦۥۛۜۥۜۙۖۢۘۦۘۡۚۗۥۖۦۘ۬ۙۤ۠ۢۨۥۖۧۘ۫۟ۘۘۧ۠ۙ";
                    break;
                case 1452577202:
                    str = "ۢ۟ۖۘۤۥۦۛۜۤۦۘۘۜ۬ۜۜۦۧۘ۠ۥۛۥۦۘ۫۠ۛۦۨۙۙۤۜۛ۬ۜ";
                    break;
            }
        }
    }

    public void setOnTabReselectedListener(OooO0OO oooO0OO) {
        String str = "ۤۛۘۡۖۢۛ۬ۡۘۗ۟ۧۦۖۜ۫ۨۖۗۨۘۘۜۗ۟ۙ۫ۨۙۤۡۨۦۘۡ۫ۦ";
        while (true) {
            switch ((((str.hashCode() ^ 951) ^ 51) ^ 716) ^ (-756675379)) {
                case -1703818901:
                    str = "ۨۨۖۘۘۚۛۛۖۡۘۤۥۤۗۗۡ۫ۘ۫ۗ۫ۧۢۡۘۤۨۛۚۤۖ";
                    break;
                case -547111945:
                    this.Oooooo0 = oooO0OO;
                    str = "ۦۧۛ۫ۗۖۘۤۘۗۢ۟ۦۢ۟ۦ۫ۜۥۘۚۤۜۘۗۗۦۘۗۚ۫ۤۧۙ۠۟ۤ۟ۖۘۧۥۨۘۡ۠ۥۘۧۡۖۡۨۙ";
                    break;
                case -348558638:
                    return;
                case 1560573464:
                    str = "۬ۗۖۘۦۡۘۘۥۛۡۘۘۥۖ۠ۙ۟ۨۨۦۘۖۡۦ۬ۗۘۘ۠ۗ۫۠ۜ";
                    break;
            }
        }
    }

    @Override // p285z2.InterfaceC4572ya
    public void setViewPager(ViewPager viewPager) {
        String str = "ۖ۠ۡۡ۫ۙۘۚۛۙ۟ۜ۫ۧۚۨ۠ۘۘۙۨۛۥۘۙۙۤۘۨ۟ۗۘۨۦۛ۟ۖۘۡۦۛۤۖۦۥۢۢۛۦۡۘ";
        ViewPager viewPager2 = null;
        while (true) {
            switch ((((str.hashCode() ^ 785) ^ 130) ^ 958) ^ (-1541969545)) {
                case -2089757278:
                    String str2 = "۬ۘۜۤۚۖ۬ۜۥۗۢۥۘۨۢۗ۠ۙۧ۟ۙۦۙۙۨۘۢۥۖۘۘۥۨ";
                    while (true) {
                        switch (str2.hashCode() ^ 1786975929) {
                            case -2093782341:
                                str = "۟ۘۥۡ۠ۨۙ۠ۜۡۧۥۘۘ۠ۗ۟۟ۤۚۘۛ۫ۗ۫۟ۜۜۘۙۤ";
                                continue;
                            case -647204803:
                                str = "ۚۖۜۘۤۚۚۢۛۘۡۡۧۘۨۤۡۙۗۡ۠ۥۨۗۨۥۘۗ۟ۚۙۡۥۘۨۘۗ۬ۢۚ";
                                continue;
                            case 1302367551:
                                str2 = "ۧ۠۬۬ۥۥۜۛۤ۫۠ۗۡۘۜۜۘۜۤ۬ۧ۫ۛۥۗۖۘ۟ۚۡۘ";
                                break;
                            case 1362007543:
                                String str3 = "ۨۘ۫ۜۚۤۦۧ۟ۗۜۘ۫ۜۡۘۛۚۚۦۚۖۘۡ۫۫ۖۢۡۘۘۨۥۘۜ۠ۜۖۦ۟ۜۨ۟۬ۙۦۘۜ۟۟ۜۙۡ۬ۢۛ۟ۚ۟";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1129515258)) {
                                        case -1676315294:
                                            str3 = viewPager.getAdapter() != null ? "ۡۖۖۘۖۗۨۖ۠ۡۘۧۥۢۛۦۙۤ۠ۖۖ۫ۡۜۖۥۘ۠۠ۙۖ۟ۥ" : "ۙ۬ۢۛۘۜۘ۟ۗۘۘ۟۠ۜۘۦۗۢۜۡۙۖ۠۬ۙ۬ۦ۬۠ۡۘ۠ۖۜۘۚۨۘۥۥۨۘۖۚۧۧ۠ۛۡۚۨۤۛۚ";
                                            break;
                                        case -1331434572:
                                            str2 = "ۥۛۦۘۙۗ۬ۗۘۥۘۤۗۡۘۛۦۧۘۘۨۥۦۙۨۘۙ۠ۚۢۧۖ۬ۗۗۧۤۥۘۛۦۗ";
                                            break;
                                        case 1755129371:
                                            str3 = "ۨ۫ۙۤۢ۬ۤۛۖۨ۫ۦ۠ۧۨۜۧۜ۫۠ۡۢۛۜۘۖۖۘۥۙۙۛۖۦۢۛۙ۬ۥۤ۟ۦۦ۟۠۠ۘۖ";
                                            break;
                                        case 1973350553:
                                            str2 = "ۧۢ۠ۨۧۛۦۘۘۖۚۦۤۚۢۛۧ۠۬ۙۘۨۢۚۢۚ۫ۡۤۨ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1824779993:
                    OooO00o();
                    str = "ۡۗۚۥۙۡۘ۫۬ۡۦ۬ۚ۟ۨۨ۟ۛۦۥۘ۠ۧۡۧۥ۟ۘۘۧۦۛۤۖۘۘۙ۫";
                    break;
                case -1725239114:
                    throw new IllegalStateException("ViewPager does not have adapter instance.");
                case -1580738177:
                    this.Ooooo0o = viewPager;
                    str = "ۛۘۢۤۢۜ۟ۙ۠ۥۗۦ۟ۚ۠ۚ۠ۜۢۜۜۘ۠ۤۖۢۖۥۘۜۘۦۨۘۤۛۦۘ";
                    break;
                case -1521026330:
                    String str4 = "ۦۥۦۚۚۨۘۘۖ۫۠۫ۢ۠ۢۤۜۤ۬۫ۘۦۛۘۨۘۘۥۘۡۤۥۘۤۤۡۘۡۡۢۤۢۘۚۦۘۘۡ۟ۥ۟۠ۡۘۘۜۘۦۧ۟";
                    while (true) {
                        switch (str4.hashCode() ^ (-1646452340)) {
                            case -1891591284:
                                str4 = "۬۠ۡۘ۫ۨۗۗۘۗۜۧۢۙ۫۬ۥۛۚۧۚۘ۬ۡۨۖۥۘ۠ۙ";
                                break;
                            case -1394824420:
                                String str5 = "ۙ۠ۡۘۡۤۗۧۚ۫ۜۛۙ۠۬ۤۥۜۙۗ۠ۢۦ۫ۤ۟ۖۨۚۡۨۜۨۖۘۗۤۛ۫ۘۦۘۛۡۤ";
                                while (true) {
                                    switch (str5.hashCode() ^ 536353751) {
                                        case -1474622432:
                                            str5 = viewPager2 != null ? "ۤۖۖ۬ۙ۬۠ۖ۫ۧۜۘۡۙۧۖۡۨۘۢ۬ۜۖۤۜۘۛۡ۫ۧۛۛ۬ۛۢۛ۟ۡ" : "۫۫ۘۢۙۚۛۨۚۙۡ۠۬ۡۖۘۨۖۗۗۢۜۘۦۜۘۥۖۙ۬ۙۧۘۜۥۘۥۙۨۘۦۡۛۢ۬ۗۢۡۢۦۧۘ";
                                            break;
                                        case 137385562:
                                            str4 = "ۖ۟ۧۨ۟ۤۡ۠ۨۧ۠۬۠ۢۖۚۘۘۚ۟ۦۘۗ۬ۦۨۥۨۘ۠ۘ۠۟ۥۧۘۙ۬ۨۛۜۡۤ۫ۧۖ۟ۡ";
                                            break;
                                        case 476069392:
                                            str5 = "ۜۨۥۘۦ۟ۨۘۡ۫ۘ۫ۢۧۜۙ۬ۜۘۛ۫ۚۨ۬ۦۥۘ۫ۨۜۢۧۥۗۗۤۧ۟ۜۛۛۙۜۤۦۘ";
                                            break;
                                        case 1064341329:
                                            str4 = "ۗۢ۟ۚۙ۬ۧۥۛۡ۠ۡۘۧۗۨۘۗ۫ۨۘۚۢۢۧۙۛۥ۟ۜۧ۠ۧۦ۠ۖۥ۟ۗۖ۟۟ۢۡۛ";
                                            break;
                                    }
                                }
                                break;
                            case 630603510:
                                str = "ۨ۫ۡ۬۬ۘۘۢ۬ۛۚۛۢۨۡۖۘ۠۬ۢۚ۫۬ۛۧۜۤۥۧۧ۠ۛۨۛ۬ۦۢۦۥ۬ۛ۠ۥ۬۠ۦۘۧۨۥۛۤۛ";
                                continue;
                            case 862778358:
                                str = "ۧۙۦۘۦۨۨۛۦۤۦۥۧۘۖۗ۟ۢۘۨۘۘۨۚۥ۬ۚۢ۠ۨۘۤ۟۟ۤ۠ۚۦۨۜۘۡ۬۟ۦ۟۫ۘۦۘۘۨۡ۫ۘ۟ۚۦۙۤ";
                                continue;
                        }
                    }
                    break;
                case -1311048999:
                    String str6 = "ۜۖ۟۬ۡۚۡۢ۬ۢۢۘۗ۫۬ۖۖۢ۠ۗۜ۟۬ۗۢۢۚ۟ۡۧۡۙۨۘ۬۠۟ۧۘۦ۠ۙۥۥ۬ۖۘۗ۫ۗۤ۫ۘۘۗ۟ۖۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 1681937797) {
                            case -1214994467:
                                str6 = "ۙۜۚۢۜۦۘۢ۠ۖۡۘۨۘ۠۬ۘۘۗۧۘۘۖۜۗۦۧۥۘۡۡ۟۟ۧۦۖ۬ۘۛۧۨۘ۫ۘۧۨۡ۫";
                                break;
                            case 1063383101:
                                String str7 = "ۚۘۙۤۨۡۘۦۧۧۤۖۧۡۙۨۦۢ۟ۜۖۡۘۗۤۢ۫ۦۛۤۜۗ۬ۡ۫ۙۧۥۦۨ۟ۗۚۖۘۗ۠ۙۛ۠ۨ۫ۛۘۘۛۚۜ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1462400935)) {
                                        case -1815051856:
                                            str7 = "ۤۘۦۛۛ۬ۦ۟ۥۛۖۚۧۗۘۘۘ۫۟۟ۚۥۢ۬ۙ۟ۡۘۦۘۧۙۛۦۢ۬ۤۚۨۖۢۧۨۘ۟۟ۜۛۖۨۤۡ۫۟۟ۢ";
                                            break;
                                        case -1741657898:
                                            str6 = "۬ۚۛۡۖۚۧۖۤ۬ۙ۫۟ۡۡۘۦ۠ۧۨۨ۠ۛۖۗۦۧ۟ۖۢۖۦۘ۠ۙۛۥۤۜۥۘۧۖۦۘ";
                                            break;
                                        case -1076482080:
                                            str6 = "ۢۤۘۦۢۡۧۚۜۘۡ۬۫۟ۙۧۚۚۙۗۖۡۚۜۛۤۦ۟ۘۘ";
                                            break;
                                        case 679897725:
                                            str7 = viewPager2 == viewPager ? "ۗۖۡۘۛۛۜ۫ۥۧ۠ۧۦۘۜۤ۬ۥۚ۟ۛ۟ۨ۫ۤۥۘۢۤۦۘۥۨۡۨۤۛ۫ۗ۬ۡۛۨۘۙۦۦۘۚۛۨۜۜۖۗۙۜۘۤ۬ۨ" : "ۢۤۚۛۨۨۘ۬ۚۗۚۘۖۘۡۚۥۘۦۧۜۘ۠ۚۦۘ۟ۦۢۦ۬ۖ۟۠ۨۘۙ۠۬ۤ۫ۘۗۦۥۘۚۥۨۛ۫ۧۡۦۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1345087215:
                                str = "ۥۛۡۘۧۨۨۘۜۖۘۘ۫۟ۤۘۚۥۘ۬ۨۘۗ۫ۖۙۖۡ۫۫۠۫ۥ۬ۦۢۘۖۖۘ۫ۥ۟ۥۘۘ۟ۨ۠ۜ۟";
                                continue;
                            case 1538976889:
                                str = "ۗۚۙۧۙۘۚۘۖۘۛۚۘۛ۫ۤۡۙ۬ۚۤۦۘۧ۫ۜۤۨۦۘۤۜۢۘۥۢۥۘۤۨۦۨۤۧۜۘۢۥۢ۠ۧۖ";
                                continue;
                        }
                    }
                    break;
                case -558473407:
                case -78164958:
                    return;
                case -238755344:
                    viewPager2 = this.Ooooo0o;
                    str = "ۜۖۖۜۤۦۘۚۨۖۘۚۗ۫ۡۧۘۘۙۗۖ۠ۥۜۙ۟۬ۢ۟ۜۦۥۙۚۜۛۘۘۘۧۘۦۥۛۛ";
                    break;
                case 1064524772:
                    viewPager2.setOnPageChangeListener(null);
                    str = "ۧۙۦۘۦۨۨۛۦۤۦۥۧۘۖۗ۟ۢۘۨۘۘۨۚۥ۬ۚۢ۠ۨۘۤ۟۟ۤ۠ۚۦۨۜۘۡ۬۟ۦ۟۫ۘۦۘۘۨۡ۫ۘ۟ۚۦۙۤ";
                    break;
                case 1246520674:
                    viewPager.setOnPageChangeListener(this);
                    str = "ۗۗۚۨۘۜۘۧۛۨۘۦ۬ۚ۟ۨۗ۠ۨۢۙۥ۠ۚۚۖۘ۬۫ۜۘۙۘ۬ۦۦۘۘۙۤ";
                    break;
                case 1359824054:
                    str = "ۦ۟ۥۘۢۛ۫۫ۢ۫ۖۧ۫۠ۚۜۘۙۦۘۘۘۨۙ۬ۜۜۘ۫ۨۡۘۛۡ۫ۥۦۘۤ۬ۘۦۜۡۘۢۤۤۥۥۗۗۜۧۙۘۖۛۚۨۘ";
                    break;
                case 1564375169:
                    str = "ۘۙ۟ۧ۟ۜۡۖۦ۟ۖۤۛۘۜۧ۬۠ۖۨۗ۟ۙۨۚۖۖ۟ۙۖ۬ۚۦ۟ۤ۠";
                    break;
            }
        }
    }
}
