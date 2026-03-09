package com.cyjh.elfin.p200ui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import java.util.List;
import p285z2.C4095le;
import p285z2.C4491w3;
import p285z2.C4587yp;

/* JADX INFO: loaded from: classes.dex */
public class CircleDotLinearLayout extends LinearLayout {
    private static final int OooooOo = 6;
    private static final String Oooooo = "#3c7ac5";
    private static final int Oooooo0 = 0;
    private static final String OoooooO = "#bababa";
    private static final float Ooooooo = 8.0f;
    private static final int o0OoOo0 = 100;
    private List<ImageView> OoooOoO;
    private GradientDrawable OoooOoo;
    private GradientDrawable Ooooo00;
    private OooO0O0 Ooooo0o;
    private Handler OooooO0;
    private int OooooOO;

    public class OooO0O0 implements Runnable {
        public final CircleDotLinearLayout OoooOoO;

        private OooO0O0(CircleDotLinearLayout circleDotLinearLayout) {
            this.OoooOoO = circleDotLinearLayout;
        }

        public void OooO00o() {
            String str = "ۨۖ۬ۥ۬۬ۤۤۡۚۢۘۘ۬ۚ۠ۙۦۡۘۤۨۡۘۖ۬ۥۘۦۘۘۛ۟ۡۙۚ۫ۗۥۧۘۘۙۘ۫ۥۘۤۛۨۡۢۢۚۗ۠ۦۖۧ";
            while (true) {
                switch ((((str.hashCode() ^ 242) ^ UiMessage.CommandToUi.Command_Type.SET_FONT_SIZE_LEVEL_VALUE) ^ 756) ^ (-95185693)) {
                    case -949632331:
                        str = "ۚ۟ۢۡۤۜۖۧۡۛ۠ۜۘۤۛ۠۠ۜۘۗۜ۫۟ۤۜۘۧ۫ۜۗ۫ۖۗۙۘۘۗۨۥۘۢۘۛۦۢۘۘۜۜۦۘۗۦۥ۠ۖۜۘۜۢۘۘ";
                        break;
                    case -612923110:
                        CircleDotLinearLayout.OooO00o(this.OoooOoO).removeCallbacks(this);
                        str = "ۛۥۘۖ۫ۛۛۧۘۘۚۧ۠ۘ۟ۘۢۤ۠ۦۜۘۛۧۢۙۗۦۘ۬ۛۨۘۦۜ۟۬ۥ۬ۡۙۧۘۥۦۢۡۙۥۖۥ";
                        break;
                    case -581498403:
                        CircleDotLinearLayout.OooO00o(this.OoooOoO).postDelayed(this, 100L);
                        str = "ۖۤۡۡۙۛۚۥۦۘ۟ۧۚ۫ۢۢۛۜۥۚۘ۬۟ۘۥۘۙۖۡ۠ۡ۟ۜۥ۟ۨۤۚۛۛۗۚۨ";
                        break;
                    case 2019818615:
                        return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۛۘۙ۬۟۬۫۟ۖۘۦۖۡۙۨ۠ۙ۬ۙۚۗ۬ۨۙۜۘۡۧ۬ۗۥۜۘۡ۠ۡۘۙۥۖۢۢۖۘۥ۬ۖۘۤۥۚۥ۬ۚۨ۫۟۟ۦۘ";
            int i = 0;
            GradientDrawable gradientDrawableOooO0o = null;
            ImageView imageView = null;
            GradientDrawable gradientDrawable = null;
            ImageView imageView2 = null;
            GradientDrawable gradientDrawableOooO0o0 = null;
            ImageView imageView3 = null;
            int i2 = 0;
            while (true) {
                switch ((((str.hashCode() ^ 239) ^ 550) ^ C4095le.o00000Oo) ^ (-1133326963)) {
                    case -1979862015:
                        str = "ۖۖۢۖۙۥ۫۠ۚۡۦۖۛ۬ۥۗ۠۠۫ۦۦ۫ۦ۠ۥ۟ۦۚ۫ۖۖۡۘۜۨ۬";
                        gradientDrawable = gradientDrawableOooO0o;
                        break;
                    case -1153820762:
                        str = "۟۫ۤۛۖۖ۬ۗۤۡۚۨۨۨۦۥۧۢۢ۬ۦ۬ۖۖۗۥۘۥۘ۬ۡۗۡۘۨ۬ۦۘ";
                        i2 = i;
                        break;
                    case -1102057308:
                        CircleDotLinearLayout.OooO00o(this.OoooOoO).removeCallbacks(this);
                        str = "ۧۜ۠ۦ۫ۥۢۜۘۘ۠ۧۜ۠۬ۥۧۡۘ۠ۡۜۥۨۘۘۤۨۗ۬۠ۙۜۖ۠۟۟ۦۙۤۨۘۙۜۘۘۧۚ۬ۧ۠ۘۘ";
                        break;
                    case -1075430786:
                        return;
                    case -900915035:
                        str = "ۡ۬ۙ۟ۗۧ۠ۙۦۘۧ۟ۘۥ۫ۨۘۧۚۢ۟ۥۜۘۛ۟ۥۖۡ۬ۘۘۜ۬ۖ۟ۚۦۜۧ۟ۡۚ۠ۖۨۙۚۗۜ";
                        i2 = 0;
                        break;
                    case -801089330:
                        str = "۬ۜۧۢۚۦۡۨۥۘۢ۠ۨۘۛۨۜۘۖۡۘۛۤۗۢۖۨۘۥۛ۬ۢۢۘۜۖ۠ۘ۫ۡۤ۟ۚۨۛ۬ۜۘۧۥۢ۫ۡۡۧۤ۫";
                        imageView3 = (ImageView) CircleDotLinearLayout.OooO0Oo(this.OoooOoO).get(i2);
                        break;
                    case -784352384:
                        str = "ۙۙۧۗۖۧۘ۫ۡۢۧ۠ۦۥ۫ۢۦۚۤۚۙۥۘۦۤۨۘۢۥۡۛۦ۫ۗۛۖۘۤۦۨ";
                        break;
                    case -751547440:
                        str = "ۖۚۙۦ۫ۜۦ۠ۨ۬ۨ۠۟ۚۥۛ۫ۚۜۤۘۛۢۙ۬ۥۧ۠ۚ۠ۘۜۘ۟۠۠";
                        imageView2 = imageView3;
                        break;
                    case -712478916:
                        str = "۟۬ۘۧۨۦۘۖ۬ۢۛ۬ۥۢۤۘ۠ۢ۟ۚۜۥۨۦ۠ۨ۟۠ۖۜۦۘۘ۬ۜۘ۟ۗۨ۠ۤۖۙ۠ۜ۠۠ۢ۬۬ۖ";
                        break;
                    case -537300880:
                        imageView2.setImageDrawable(gradientDrawable);
                        str = "ۡۥۛۜ۫۬ۘۜۡۧۡۘ۫۬ۥۨۢ۟ۖۧ۫ۢۖۢ۬ۗۚۘۥۙۚ۟ۢۨۧۗۘۥۖۘ۬ۤۨۘۙۚۙ۬ۥۥۘ";
                        break;
                    case -452491278:
                        str = "۬۟ۙۥۖۡۨ۬ۤ۟۟ۧۗۤۡۙۧۧ۫ۙۖۘۡ۬ۘۘۚۧۚۢۦۤ۠۬ۜۘۦۗۨۙۤۚۛۚۚ";
                        imageView2 = imageView;
                        break;
                    case 24045960:
                        CircleDotLinearLayout.OooO00o(this.OoooOoO).postDelayed(this, 100L);
                        str = "۠ۤۧۢ۬ۖۘۘ۟ۨۘۘ۬ۚۗ۫۬ۥۢۖۘۘۚۜۘۘۗۥۨۚ۫ۧۦ۠";
                        break;
                    case 461610864:
                        String str2 = "ۘۗۚ۟ۙۛۥۖ۬۟ۗۡۗ۬۫ۖۗۚۧۡۜۘ۬ۙ۫۬ۗۡۘۦۜۛ۟ۜۘۜۘۜۚۙۤۦۡ۟ۡۥۜۤ۬ۘۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 368886648) {
                                case -872878708:
                                    str = "ۥ۠۫ۦ۠ۥۘۛۙ۬ۘ۠ۗۨۡۨۘ۟ۙۜۘۨۖۘۘۢۚۙۙۗ۠ۗ۬ۥۢۥۚۜۖۧ۫ۡۥۖۖۘ";
                                    continue;
                                case 82736357:
                                    str2 = "۬ۗ۟ۜ۟ۥۘۖۛۥۘۧۖۜۘۤ۬ۦۘ۫ۖۘ۟ۢ۠ۖۢ۬ۢۡ۬ۥ۠۟۬ۡ۬ۢۚۖۘۗۨۖۘۦ۫ۖ";
                                    break;
                                case 1043826386:
                                    String str3 = "ۢ۬ۥۘۧۢ۠ۗ۬۟۬ۡۨۘۨۗۖۘۖۗ۠ۡۖۨۘۚۘۗۘۖۡۡۖۦۘۧۤۦۥۥۦۘۛۡ۬ۨۨۤ۫ۦ۠ۥ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 918566713) {
                                            case -2073859928:
                                                str3 = "ۤۧ۟ۛۖ۫۬ۙۢ۫ۦۗۤۨ۬۟۠ۚۗۨۘۢۗ۬ۘۙۜۘۨۦۗۙۡۧۜۙۘۚ۠ۘۘۧۧۥۘ";
                                                break;
                                            case -497798144:
                                                str2 = "ۖۘۖۧۨۘۗۙۨۢۥۢ۠ۖۘۘۡۦۘۦ۠ۛۤ۟۫ۥۥۛ۠۬۫";
                                                break;
                                            case 478691756:
                                                str2 = "ۖۡۘۘۘۛ۬ۦۦ۫ۚ۬ۘۘۜۘۤۢۖۨۚۙ۫ۘۢۦۘۨۘۦۘ۟ۗ۫ۗۢ۬ۧۢۜ۫ۨۛ۟ۛۡۘ";
                                                break;
                                            case 661345381:
                                                str3 = i2 < CircleDotLinearLayout.OooO0Oo(this.OoooOoO).size() ? "ۙۙۡ۬ۖۜ۫ۥۜۛۡ۬ۜ۫ۢۧ۟ۦۘۦۤۥۘۚۛ۬ۦۦۘۛ۬ۨ" : "ۗۗۚۛ۬ۘۢۙۡۡۜۦۗۥۨۘۨۢ۬ۧ۟ۜ۬ۜۘۨۛۖۘۦۤۙ۠ۨۡۘۤ۫ۡۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1118317813:
                                    str = "۬ۨۥۘۚۛۡۡۗ۬ۘۥۖ۫ۖۡۛۧۧۙۥۙۧۖ۬۬ۙ۬ۘۨۢ۠ۦۘ۠ۖۡ۠ۧۖۗۙ";
                                    continue;
                            }
                        }
                        break;
                    case 757003777:
                        str = "۬۟ۙۥۖۡۨ۬ۤ۟۟ۧۗۤۡۙۧۧ۫ۙۖۘۡ۬ۘۘۚۧۚۢۦۤ۠۬ۜۘۦۗۨۙۤۚۛۚۚ";
                        break;
                    case 781142634:
                        gradientDrawableOooO0o = CircleDotLinearLayout.OooO0o(this.OoooOoO);
                        str = "ۘۦ۬ۙۥۜۢ۬۫ۚۤۜۘۛۡۖۛۨ۟ۡ۫ۙۡۥۘ۠ۡ۫ۥۢۢۧۙۦ۠ۤۧ";
                        break;
                    case 792659691:
                        String str4 = "ۖۚۛۖۡۨۘ۫ۘۥۙ۫۠ۢ۟۫ۛۖۦۘۥۧۖۤۖۘۤۙ۠ۗۦۥۘ";
                        while (true) {
                            switch (str4.hashCode() ^ (-956473646)) {
                                case -45708156:
                                    str = "۬ۨۜۘۙۛ۫۟ۤۨۘۖۢۙۛۡۡۘۜۖۤۢۨ۬۫۠ۦۨۧۨۘۦۦۦۥ۫ۡۖۚۨۜ۫ۦۘۙۥ۬ۙۙۢۖۖۡۘ";
                                    continue;
                                case 862272332:
                                    str = "ۦۡ۬ۢۘۜ۟ۤۨۤۗۖۡۙۘۘۛۡ۟۫ۡۚۛۧۥ۬ۙۨۘۛۙۨۚۘۘۘۘۘۙۢۥۡۘ۬۠ۥۤ۫۬ۤۤ۟";
                                    continue;
                                case 1786034903:
                                    str4 = "ۧۛ۫ۥۚۢۢ۫ۧ۫ۙۗۚۘۢۥۖۥۘۧ۟ۖۘ۟ۧۚۚ۬ۛۖۗۥۢۖ۟ۛۧۡ";
                                    break;
                                case 1941587514:
                                    String str5 = "۟ۧۥۛ۫ۘۛۡۘ۬۟۟ۦۨۛۗۘۧۘۥۛۖۥۡ۬ۛ۬ۛ۠ۤۨۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-1922262658)) {
                                            case -1882448037:
                                                str4 = "۟۬ۨۗ۫ۨۧۙۡۘۖ۫ۘۘ۫ۛۨ۬ۙۨۘ۠ۥۘۘۙۚۡۘۨ۫ۡۘ۬ۙۜۘ";
                                                break;
                                            case -1237036033:
                                                str4 = "ۦۡ۠ۦۗۜۢۚۡۢ۬ۙۙۢۦۘ۟ۡۨۘۦۡ۠ۧۖۢۢ۬ۜۙۛ۟ۥ۫ۚۥۡۙۢ۠ۙ۟ۡۙۚۦۛۛۨۘۘ";
                                                break;
                                            case -1105565382:
                                                str5 = "ۤ۠ۦۘۨۚۡۘ۠ۤۤۢ۟ۥۘۛۧۥۛۡۜۘ۫ۥۥۨۥۘۘۢۜ۟ۡۚۜۙۛۧۘۖۖۘ";
                                                break;
                                            case 777040214:
                                                str5 = i2 == CircleDotLinearLayout.OooO0O0(this.OoooOoO) % CircleDotLinearLayout.OooO0Oo(this.OoooOoO).size() ? "ۢ۠ۦۥۤۖ۠ۦۜ۟ۖ۠۫۬ۙۥۢۨ۬ۧۧۦۤۦۘۡۗۖۘ۫۠۠ۙ۠ۤ۫ۦۙۨ۬ۡۘ۟ۛۘۘ" : "ۗۖۖۘۙ۬ۥۘۧۥۦۚ۟ۥۘۨۤۘۘۢۚۜ۟ۨ۟ۤۛۜۚۡۚۛۦۥ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 839663317:
                        CircleDotLinearLayout.OooO0OO(this.OoooOoO);
                        str = "۬۫ۥۦۦۥۗۜۘۖۜۡۘۙۡۖۘ۬۫ۛۧ۠ۘۘۦۤۨۨ۟ۡۤۤۥۦ۬۬ۨۛۤۛۤۙۜۗۤۛۦۘۨۜۡۚۥۖۘۚۚۗ";
                        break;
                    case 963202138:
                        str = "۟ۚۧۨۡۜۛ۬ۙۥۥۧۜۦۜۘۛۘۛۤۨۗۙۜۘۘۚۜ۠ۘۧۛ۬۬ۛۖۧۘۤۦۦ۟ۦۘۘ۟ۘۘۗۛۘۘ";
                        gradientDrawable = gradientDrawableOooO0o0;
                        break;
                    case 1360350725:
                        str = "ۤۦۜۢۧۨۡۤۨ۬۫ۖۗۨۜۗۤۘۤ۠ۛۦۖۘۛۗۥۘ۫ۥ";
                        imageView = (ImageView) CircleDotLinearLayout.OooO0Oo(this.OoooOoO).get(i2);
                        break;
                    case 1466864797:
                        gradientDrawableOooO0o0 = CircleDotLinearLayout.OooO0o0(this.OoooOoO);
                        str = "۬ۖۛ۫ۚۥۤۘۥۚ۟ۨ۠ۥۡۥۘۧۘ۫۫ۡۘۥۨۧۦ۬ۢۡۜۗ۫۬ۨۘ۫ۖۦۘۚۗۡۢ۟ۙۦ۫۬ۤ۬ۚۙۙۦۦۖۘ";
                        break;
                    case 1886606046:
                        i = i2 + 1;
                        str = "ۨۦۥۜۨۜۖۥۖۡ۬۫ۧۢۡۘۦۖۡۘ۬ۛۤۥ۠۠۬ۥۖۘۛۤۤ۠۠ۦۗۤۤۡ۠ۨۘۖۨۜۘۜۤۢۖ۠ۘۘ";
                        break;
                    case 2108796530:
                        str = "ۡ۬ۙ۟ۗۧ۠ۙۦۘۧ۟ۘۥ۫ۨۘۧۚۢ۟ۥۜۘۛ۟ۥۖۡ۬ۘۘۜ۬ۖ۟ۚۦۜۧ۟ۡۚ۠ۖۨۙۚۗۜ";
                        break;
                }
            }
        }
    }

    public CircleDotLinearLayout(Context context) {
        super(context);
        this.OoooOoO = new ArrayList();
        this.OooooO0 = new Handler();
        OooO0oO();
    }

    public CircleDotLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OoooOoO = new ArrayList();
        this.OooooO0 = new Handler();
        OooO0oO();
    }

    public CircleDotLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OoooOoO = new ArrayList();
        this.OooooO0 = new Handler();
        OooO0oO();
    }

    public static /* synthetic */ Handler OooO00o(CircleDotLinearLayout circleDotLinearLayout) {
        String str = "ۚۡۘۘۙۢ۬ۚۢ۫ۢۗۜ۠ۛۦۘۗۥۛۦ۫۟ۚۛۦۖۦۨۘۛ۟ۙۨۢۙ۬ۘۘۚ۠ۦ۠۠ۨۘ۫۫ۚ۟ۤۥۧ۠۫ۤۦۨ";
        while (true) {
            switch ((((str.hashCode() ^ 254) ^ 283) ^ 623) ^ (-1936094569)) {
                case 991421759:
                    return circleDotLinearLayout.OooooO0;
                case 1685767790:
                    str = "ۡ۬ۘۘۨۨۘۘ۠ۡۧۛۨۚۙۗ۬ۖۦۛۤۧۦۖۦۥۘۛۦۘۜۧۘۜۨۥ۫ۛۖۘۛ۟ۖۤۜۥۘۨ۟۟ۢۥۘۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ int OooO0O0(CircleDotLinearLayout circleDotLinearLayout) {
        String str = "ۗۙۚۚۖۗ۫ۗۛ۠ۘۢۜ۫ۙ۬ۨ۫ۦۘۖۖۗۗۡۢۨۙۗۛۥۡۗۡۧۡۥۢۛۨۥۖۦۢۤۧۥ";
        while (true) {
            switch ((((str.hashCode() ^ 494) ^ 422) ^ 435) ^ 1835324157) {
                case -560292666:
                    return circleDotLinearLayout.OooooOO;
                case 510319462:
                    str = "۟۟ۛ۟۫ۡۨۥۤ۠ۗ۬ۜۚ۫ۖۨۨۙۧۡۗۖۘ۫ۥۜ۬ۦ۫ۦۦ۫ۘۧ۫ۜۘۨۧۡۘۘ۫۬ۧۥۖۨ";
                    break;
            }
        }
    }

    public static /* synthetic */ int OooO0OO(CircleDotLinearLayout circleDotLinearLayout) {
        int i = 0;
        String str = "ۘۦۡۘۚ۬ۙۚۗۡۤۘۨۨۧۨۘ۟ۛۦۘۛ۫ۙۦۚۗۜۚۖۘۖ۠ۖۘۦ۫ۜۨۙۦۨ۠ۦۘۨۡ۬";
        while (true) {
            switch ((((str.hashCode() ^ 68) ^ 629) ^ 703) ^ (-1591962565)) {
                case -1518240443:
                    return i;
                case -744690101:
                    i = circleDotLinearLayout.OooooOO;
                    str = "۬ۥۧۘۗۘۚۡۚۡۘۘ۫ۢۨۤ۬ۚ۬ۦۡۘۚۢۨۡ۫ۢۜۘ۟ۙ۫ۤۡۘۜۖۥۘۥۙ۬۠ۖ۬ۡ۠ۨۥۘ";
                    break;
                case 651517405:
                    circleDotLinearLayout.OooooOO = i + 1;
                    str = "ۡۛۤۨۛۨۘۨۖۜۘۤۗۘ۫ۢۤۜۧۦۘۘ۠ۥۗ۟ۦۘ۠ۗۜۙ۟۠";
                    break;
                case 1741256643:
                    str = "ۧۘ۟ۦ۟۬۫ۘۡۛۘۡۧۗۡۤۖۘۖ۫۠ۨۖۘۘۧۡۧۛۥۧۘۙۥۥۘۧۨۤۜۛۨۘ۠ۤ";
                    break;
            }
        }
    }

    public static /* synthetic */ List OooO0Oo(CircleDotLinearLayout circleDotLinearLayout) {
        String str = "ۜۘۚۤۧۡ۠۫ۦ۠ۘۧۘۜۡۜۘۤ۬۬ۤۡۖۘۡ۫۫ۙۚۤ۟ۦۖۖۙۥۘ۠۟ۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 100) ^ 5) ^ 814) ^ (-2050641421)) {
                case -524860320:
                    return circleDotLinearLayout.OoooOoO;
                case 1955563883:
                    str = "ۚۧۘۘ۬ۜۨۘ۟ۗۦۘۚ۬ۛۦۘۜۘۨۚۡۦۦۖۘۘۜ۬ۖۦۡۘۦ۫ۡۘ۟۫ۜۧۜۘۡۛۥۙۙۨۘۢۨۧۘۙ۠ۨ۫۟۫ۖۥۦ";
                    break;
            }
        }
    }

    public static /* synthetic */ GradientDrawable OooO0o(CircleDotLinearLayout circleDotLinearLayout) {
        String str = "ۖۙۗۙ۫ۖۦۤ۟۫۠۟۬ۙ۠۟۠ۙۧ۫ۗۥۨۜۘۢۡۖۘ۟۬ۦۘۤۚ۫۬۟ۦ۟ۧۜۛۢۗۚۚۖۘۢ۫ۗ";
        while (true) {
            switch ((((str.hashCode() ^ 805) ^ 899) ^ 750) ^ 257884414) {
                case -1781940561:
                    return circleDotLinearLayout.Ooooo00;
                case 614467752:
                    str = "۠ۤۗ۬ۤ۬ۜۚۤۨۚۡ۟ۨۙ۫ۥۖۘۗۘۗۡۗۖۛ۫ۧۨۨ۫ۖ۠ۚۚۚ۟ۨۨۡۙ۫ۡۘۨۚ۬ۚۙ۫ۦۚ۟۫ۖۨۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ GradientDrawable OooO0o0(CircleDotLinearLayout circleDotLinearLayout) {
        String str = "۟ۧۘ۫ۡۢۨۜۙۚۧۦۘۚۥۗ۫ۧ۠ۖ۫ۤۥ۬ۜ۠ۤۜۘۘ۫ۡۘۦۨۘۚۘۨ";
        while (true) {
            switch ((((str.hashCode() ^ 238) ^ 987) ^ 874) ^ (-1824440084)) {
                case -280602611:
                    return circleDotLinearLayout.OoooOoo;
                case 158227735:
                    str = "ۨۢۘۘۨۛۖۤۛ۫۬۠ۡ۫ۛۥ۬ۜ۫ۤ۟ۜۘۖۖۤۢۘۘ۫ۢۨۛۗ۫۬ۤ۟ۛ۬ۙۚ";
                    break;
            }
        }
    }

    private void OooO0oO() {
        String str = "۟ۙۡ۠ۜۧۧ۬ۨۙۧۛۥۘۚۢۦۚۚۛ۬ۗۚ۬ۘۜۥۢۨ";
        OooO0O0 oooO0O0 = null;
        while (true) {
            switch ((((str.hashCode() ^ 769) ^ 263) ^ HideBottomViewOnScrollBehavior.OooO0o0) ^ 1140532731) {
                case -1061463119:
                    OooO0oo();
                    str = "ۗۛۖۧ۫ۖۘ۠ۡۗۙ۟ۜۘۨۥۢۤ۬ۙۘ۫ۙۚۦۙۛ۫ۥۘۙۛۜۘۥۡۤۗ۠ۦۘ۟ۢ۫ۛۙۧۗۙۙۗۘۖۥۡ۟ۨۙۖ";
                    break;
                case -483024030:
                    oooO0O0 = new OooO0O0();
                    str = "۫ۚۜۘ۟ۖۤۖ۠ۖۘۜۖۧۘ۫ۡۙۢۜۦۘۘۨۖ۟۟۫ۢۖۘۘۜۢۢ";
                    break;
                case 719011274:
                    oooO0O0.OooO00o();
                    str = "ۧۧۤۡۛۢۤ۬ۤۚۛۡۘ۬ۗۘۘۦ۬ۚۙ۟ۡ۟ۙ۟۫ۢۦۘ۠ۜۡۘۨۢۛ۫ۡ۬ۖ۠ۤۡۘۘ۠ۜ۬ۜۦۦۘۙ۟۟ۨۛۡۘ";
                    break;
                case 1424610752:
                    return;
                case 1487524702:
                    str = "۫ۘۦۥ۠ۚۛ۫ۨۘۢۦۥۘۦۖۤۘۡۨۘۤ۬ۥۘۛۛۨۦۗ۠ۛ۬";
                    break;
                case 2041402271:
                    this.Ooooo0o = oooO0O0;
                    str = "ۨ۫ۢۜۥ۫ۙ۫ۥ۫ۛۘۗ۟ۖ۬ۥۘۢۤۦۘۡ۠ۦۘۗۥۙۢۦۥۦ۫ۜ۟ۤ";
                    break;
            }
        }
    }

    private void OooO0oo() {
        String str = "ۨۛۙۜ۟ۨۨۡۖ۬ۥۦ۬۟۬ۦۜۜۘۛۖۨۦۚۡۡ۫ۘۛۙۖۘۥ۟ۥۙۜۚ";
        int i = 0;
        LinearLayout.LayoutParams layoutParams = null;
        GradientDrawable gradientDrawable = null;
        ImageView imageView = null;
        int i2 = 0;
        while (true) {
            switch ((((str.hashCode() ^ 892) ^ 22) ^ UiMessage.CommandToUi.Command_Type.SET_SPINNER_VALUE) ^ (-514689026)) {
                case -2090350058:
                    str = "۟ۗۥۙۗۘ۟ۚ۫ۦ۬ۨۗۜۦ۟ۘۦ۟۠ۚ۟ۥۧ۫۠ۦۤۥ۬";
                    continue;
                case -1954077098:
                    gradientDrawable.setColor(Color.parseColor(OoooooO));
                    str = "۬۫ۗۦۙۘۘۧ۠ۥۘۥۡ۠ۥۥ۫ۡۧۧۦۘ۬۬ۧ۟ۧۜۜۘۛۢۖۘۖۗۜۘ۫ۡۚ۬۬ۨۦۘۘ";
                    continue;
                case -1914688074:
                    String str2 = "ۨۖۧۛۘۢۙۡۨۘۜۨ۬ۡ۠ۘۘۖ۠۠ۜۤۘۡۨۙ۠ۜۛ۠ۚ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 1206030336) {
                            case -641631232:
                                str2 = "ۚۙۧ۬ۨۚۗۡۨۘۚۡۤۦۧ۟ۚۖۘۧۡۜ۫ۤۤۙۨۘ۬ۨ۬ۜۦ۠ۥۙۡ۠ۦۡۘۦ۠ۘۘ";
                                break;
                            case 102349647:
                                String str3 = "ۚۧۖۨۘۦۘۥ۟۟ۘ۟ۚ۬ۗۖۘۖۗۨۡۛۡۥۘۡ۬۫ۦۘۧۥۨۘ۠۟۬۬ۡۚۧۛۙۡۚ۬";
                                while (true) {
                                    switch (str3.hashCode() ^ (-837480634)) {
                                        case -1432935573:
                                            str3 = i2 < 6 ? "۠۫ۥۘۙۛۨۥۧۜ۟ۡ۟ۢۖۧۘۥۘۚ۫ۡۢۨ۬ۨۘۦۨۤۧۨۡۘ۫ۛۚۦ۟ۧ" : "ۥ۠ۡۘۜۦۥۧۡۥۥ۬ۨۚ۟۬ۦۜۗۡ۟ۨۘ۠ۧ۠ۡۛ۟ۦۤۥۙۜۤۘۨ۬ۨۚۥۘۙۜۦۘ۠۠۬۬ۜۡۘ۬۠ۛۜ۬ۡ";
                                            break;
                                        case -903726761:
                                            str2 = "ۜۗۦۘۛۚۥۤۘۥ۟ۚۡۡۘۘۥۛۡۙۖۖۨ۬ۨۖۗۘۖۧۥ";
                                            break;
                                        case 141262547:
                                            str3 = "ۤۡ۫ۙۢۧۦۖۘۘۜۡۧۘ۫ۘۦۧ۠ۦۥ۬ۨۘۥۦۨۘۘ۬ۜۘ۫ۡۢۖۥۙۙۘۗۘۢۘۨ۟ۡۦ۟ۚۢۜۘ";
                                            break;
                                        case 779048818:
                                            str2 = "ۤۦۢۘۨۨ۠۬ۜۘۥۙۜۘۢۖ۟ۡۢ۠ۡۙۨۘۥۤ۟ۛ۟ۜۡۜۨۘ۠ۦۙۦۢۢۥۦۘ۟ۨۖۘۨۢۛۧۢۤۡۢۜۘۜۗۜۘ";
                                            break;
                                    }
                                }
                                break;
                            case 730833257:
                                str = "ۧۛۛۛۘۨۘۨۖ۠ۗۨۘۘۨ۫ۦۧۜۘۘ۫ۡۧ۟ۧۙۡۧۛۖۢۖ۠ۨۤ۫ۥۘۧۨۨ۬ۚۨۘ";
                                continue;
                                continue;
                            case 1755112956:
                                str = "ۗۥۜۘۗۡۧۗۗۗۛۨۧۥۡۗۗ۠ۨۘۧۦۧۘۥۚۜۘۨۧۨۘۤۥ۬۟ۗۖۚ۠ۤۛۚۡۢۛۘ";
                                continue;
                        }
                    }
                    break;
                case -1812745952:
                    break;
                case -1713322943:
                    return;
                case -1472560869:
                    str = "ۢۧۨۘۜۦۨ۠ۛ۫ۙۢۧۚۛۤ۟ۙۛۡۤۨۙۨۧۘۧ۟ۘۚۚۘ";
                    continue;
                case -1378482430:
                    this.OoooOoO.clear();
                    str = "۬ۚۛۤ۬ۦۨۜۥۘۜۡ۬ۡ۬۫۫ۗ۟ۢۙۥۨۚ۬ۗۤۘۘۜۨۧ";
                    continue;
                case -1363559970:
                    str = "ۙ۟ۧۙۚۜۘۗۨ۟ۨۜ۬ۘۢۘۘ۬۬ۘ۫ۘۘۘۦ۬ۥۛۥۥۘۚۢۡۘ۫ۥۗۖۥۡۘ";
                    imageView = new ImageView(getContext());
                    continue;
                case -1021680765:
                    gradientDrawable.setShape(1);
                    str = "ۧ۬ۥۘۡۙۖۘ۫ۛۚ۬ۚۢۧۥۖۘۧۗۥۘۘۧۨۛۖۡۘۜۗۡۨۙۜ";
                    continue;
                case -1020760099:
                    this.Ooooo00 = gradientDrawable;
                    str = "ۗۛۧ۫۟ۗۡ۟ۙ۟ۘۜۘۙۧۖۖۨ۬ۡۘۨۦۛۦ۠ۘۦۖۧۨۘ";
                    continue;
                case -902469371:
                    str = "ۘۦ۬ۧ۫ۥۘۘۢۜۘۛ۠ۖۛۦ۫ۨۗ۟ۡۙۦۢ۬ۤ۟ۖۘ۠ۖۖ";
                    continue;
                case -878995729:
                    addView(imageView, layoutParams);
                    str = "۬ۙۡۤۡۡۦۛۛۡۘۦ۠ۦۥۘۚۤۤۧۘۘۘۥۖ۠ۥۢۜۘۙۘۨ۫ۢۦۘ۠ۨ۟۫ۤۗۖ۠ۦۜۚۛۙۢۡ۬ۖۛ";
                    continue;
                case -312057558:
                    removeAllViews();
                    str = "ۜ۬ۡۤ۬ۙ۟ۖۜۛ۫ۤۛۙ۬ۥۖۧ۟ۦۢۦ۟ۥۘۥۗۡۘۨۙۨۘۡۢۖۘۨۜۖ۬۫۬ۢۦۘ۟ۢۦۘۜۛۦۘۦۖۡۘۥۥۘۘ";
                    continue;
                case -285943090:
                    layoutParams.setMargins(0, 0, C4491w3.OooOOO0(getContext(), 8.0f), 0);
                    str = "ۦ۟ۖ۬۫ۧۨۧۥۘۖۦ۟ۧۛۥۛۜۘۘۢ۟ۖۢۗ۫ۘۤ۬ۧۥۡۛۘۧۘۥ۟ۡۥۨۧۧۤۚۨۦۧۚ۠ۨۘۤۛۘ";
                    continue;
                case -71220378:
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    str = "ۢۡۢ۠ۖ۬ۛۜۛ۫۬ۘۘۗۡۧۘۚۥۜۙۡۨ۠ۚۙ۟۫ۧۛۤۨ۬ۥ۬۟ۤۜ";
                    continue;
                case 35832105:
                    this.OoooOoo = gradientDrawable;
                    str = "ۥۧۖۘ۠ۗۘۘۜۘۖۗۖۦۘ۬۠ۙۚۜ۬ۧۛۖۦۢ۟ۦۚۘۤ۠ۥ";
                    continue;
                case 47078149:
                    String str4 = "ۧۘ۟ۘۨۖۘۖ۟ۧۢ۠ۘۘۧۛۥۙۥۚۘۛۧ۬۟ۤ۟ۦۤ۠ۜۘۦۗۚۛۢ۟ۧ۬ۖۢ۫ۤۨۖ۟ۜۥۦ";
                    while (true) {
                        switch (str4.hashCode() ^ (-356567091)) {
                            case -652683577:
                                String str5 = "ۙۢۦۘ۬۬ۘۘۛۡۚۧ۬ۦۘۦۗ۫۟ۙ۬ۦۦ۟ۢۖۡۘۙۜۚۘۖۥ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-366773640)) {
                                        case -1128883158:
                                            str5 = i2 == 5 ? "ۙۚۨۘۡۦۨۘۗۗۚۜۛۡۗ۠ۡۜۘۥ۠ۖۘ۬ۢۥۘۛۤۨۘۜۢۢۢۦۧۗۨۦۘۤۡۦۘ۬ۘۡۚۘ۟ۙۦۡۘۗۡۙۥۥۚ" : "ۛۜۦۘۙۙۡۦ۫ۚ۫ۚۡۘۖۚۢۛ۠ۛۙ۠ۜۘ۫ۥۗۥ۟ۛ۟۟ۤۧ۠ۜۘ۟۬ۡۜۘۖۘۚۨۚۨۧۧۙۛۦ";
                                            break;
                                        case -817573130:
                                            str4 = "۟ۦۧۡ۬ۢۖۙۗ۬ۥۤۤۙۢۦۤۥ۫۠ۡۦۘۢ۟ۙۨۡۙ۟ۘۤۚۤۚۧ۟۫۫ۙۘۥۚۙۚۙۙۗ۟ۖۘۙۡ۫";
                                            break;
                                        case -329860613:
                                            str4 = "ۧۙ۬ۤۘ۬ۗ۠ۡۢۖۘۦۦ۠ۡ۟۠ۗۡۙۨۦۘۜ۟ۦۘۖۨۚ";
                                            break;
                                        case -51625855:
                                            str5 = "۟ۘ۟۬ۥۥۘۤ۫ۦۘ۫ۛۨۘۡۢۜۧۧۙ۠۬ۚۗۨۘۚۨۗ۠۠ۘۗۧۗ۠ۜۦۘۙۜۘ۟۠ۤۧۜۜ۬ۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1816048448:
                                str4 = "ۧۜۡ۫ۦ۟۠ۛۦۙۦۘۗۦۚۨۥ۫ۘۜۧۨ۫ۛۡ۟ۡۦۦۘ۬ۘۥۘۚۢۨۦۖۛۚۧۜۧۜۙ۬ۢۡۘۦ۫ۥۤ۬ۙ";
                                break;
                            case 1997261873:
                                break;
                            case 2048464943:
                                str = "ۛۚۜۜۧۖۙۦۙ۫۫۠ۢۚۘۘۢۡۘۛۡۢ۫ۖۥۘۡۤۜۘۘۢۦۨۦۘۨۙۡۘ۫ۡۢۦ۬ۘ";
                                break;
                        }
                    }
                    break;
                case 86807190:
                    imageView.setImageDrawable(gradientDrawable);
                    str = "۟ۘۦۥۚۖۤۦ۫ۙۧۗۜۦ۬ۜ۫۟ۧۧ۬ۜ۠ۤۙۤۖۘۜۢۦ";
                    continue;
                case 149071889:
                    gradientDrawable.setColor(Color.parseColor(Oooooo));
                    str = "۫ۚۜۘۦۖۡۘۙۨۦ۬۠ۙۤۚۘۘۖ۟ۡۢۚۨۗۢۖ۠ۥۧۨۙۨ";
                    continue;
                case 349272384:
                    str = "۫ۡ۫ۦ۟۫ۥۚۘ۬ۦۙۥۥ۠ۦۧۖۘۜۚۘ۠ۛۥ۫۬۠ۛ۬۬ۘۧ۠ۗۥۘۚۡ۠ۚۧ۬ۡۙۚ۫۟ۤۘۧۦۘۗۦ۫";
                    gradientDrawable = new GradientDrawable();
                    continue;
                case 755867466:
                    gradientDrawable.setCornerRadius(C4491w3.OooOOO0(getContext(), 8.0f));
                    str = "ۗۘۨۘ۫۫۫ۡ۬ۗۨۜۘۤۚۛۢۥۥۛۥۘۘۡۙۦۚۦۚۛۙۜۥۖۨ۟۟۠ۥۢۙ۠ۛۛۡ۟ۦۘۨ۬ۡۘۗۘۢۨ";
                    continue;
                case 836301425:
                    i = i2 + 1;
                    str = "ۚ۠ۜۘۡ۫ۧۖۧ۫۬ۤۦۖۢۦۧۢ۟ۘۡ۫۠ۛۚۢۦۡۛۦۦ۫ۛۙ۠۠ۘۢۘۜۢۜ";
                    continue;
                case 1130308159:
                    this.OoooOoO.add(imageView);
                    str = "ۨۧۡۘۥۥۥۨۥۦۦۧ۬۬ۥۡۘۙۛۚۙۛۖۜۗۚ۬ۛۤۦ۬۟۬ۜۘۗۢۨۨۛۤۡۛۧۤۦۚۦۧ۬";
                    continue;
                case 1622619775:
                    gradientDrawable.setSize(C4491w3.OooOOO0(getContext(), 8.0f), C4491w3.OooOOO0(getContext(), 8.0f));
                    str = "ۘۡ۫ۥۤۜۘۙ۫ۡۡۙۘۦۦۛۢۛۤۛۜۥۘۨۛۧۗ۟ۜ۬ۡ۬ۚۡۥ۠ۚۡۘۘۜۜۨۦۡۘۛۘۦۘۤۚۧ";
                    continue;
                case 1845963046:
                    str = "ۖۢۦۘۦۛۥۘۖ۟۟ۧ۫ۘۘۧۨۢۢۢۜۘۜۨ۫ۨۡۘۘ۟ۦۙۚ۫ۡ";
                    i2 = i;
                    continue;
                case 1991124324:
                    String str6 = "ۤ۠ۚۗۧ۠ۦۢۡۢۖ۟ۛۚۘۡۧۘۛۘ۟ۜۜ۟۬ۛۙ۬۫ۘۧۖۥۧۦ";
                    while (true) {
                        switch (str6.hashCode() ^ 190506267) {
                            case -1331066406:
                                str = "ۗۖۤۗۡۤۧۡۡۘۦۡۢ۬ۤ۠ۥۘۨۦۖۘۧۙ۠ۨ۠۠۠۬ۙ۬ۜۘۖۗۚ";
                                continue;
                            case -886496323:
                                str6 = "ۖۡۜۢۘۥۘۙۢۜ۫ۜۘۥۜۡۥۘۚ۫ۢۛۢ۠ۧۗۥۗۥۜۗ۫۟۠ۛۜۧۜۤۛۚۤۜۗۦۘۙۚ۫";
                                break;
                            case 79735363:
                                String str7 = "ۨۦۜۘۥۛ۫ۡۨ۫ۖۡ۟ۙ۠ۗ۠ۙ۟ۚۛۧ۟ۖ۫ۖۡۘ۬ۘۘۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ 1556040104) {
                                        case -1248509849:
                                            str7 = "ۨۖۥۘۗ۠ۘۤۜۜۘۜۙۡۘۖۡۜۢۗۥ۟ۧۛۦۦۗۛۨۤۘۧ۬۟ۖۢ۠ۨ۫";
                                            break;
                                        case -972454910:
                                            str7 = i2 == 0 ? "ۧ۫ۡ۠ۗۘۜۧۙۨۖ۬ۥۨۖ۠۠ۡۤۖۘۢ۟ۥۥۤۜ۠ۛۚۥۙ۠ۛۢۜ" : "ۗ۟۠ۤۨۘۘۛۘۜۥۥۘۘ۬ۚۖۘۧ۟ۛۖ۠ۡۘۙۗۧۧۘۥ۠ۚۙ۠ۙ۟ۘۢۚ";
                                            break;
                                        case -453265409:
                                            str6 = "۬۠ۖۚۘۤۗۘۛۜۡۜۘۙۚۗۨۘۥۧۥۦۘ۟ۧۡۥۗۜۙۧ۫ۗۖۧۘۖۚۥۘ۟۠ۖۘۗ۠ۘۘۙۜۥۘۜۦۦۘۖۧۡۖۖ۫";
                                            break;
                                        case -439059739:
                                            str6 = "ۡ۫ۧۥ۟ۡۖۤۤۚۢ۫۫۬ۖۘۢۨۘۘۦ۬ۦۘ۟ۛۧ۬ۖ۬ۢۗۥۘۛ۟ۖۘۖۘۘ۟ۡۦۘۜۧۢ۟۬۠ۡۨۥ";
                                            break;
                                    }
                                }
                                break;
                            case 1527358350:
                                str = "ۥ۬ۖۘۡ۬ۥۥۗۥۤۥ۫ۘۢۡۘ۟ۜۘ۫ۥۨۘ۟ۚۚۦۜۦۨ۫ۜۥۨۘۘۜۨۨۧۙۡۚۡ۫ۥۗۥۛ۬ۘۡ۟ۖۡ۬";
                                continue;
                                continue;
                        }
                    }
                    break;
                case 2053443955:
                    str = "۟ۗۥۙۗۘ۟ۚ۫ۦ۬ۨۗۜۦ۟ۘۦ۟۠ۚ۟ۥۧ۫۠ۦۤۥ۬";
                    i2 = 0;
                    continue;
            }
            str = "ۗۛۧ۫۟ۗۡ۟ۙ۟ۘۜۘۙۧۖۖۨ۬ۡۘۨۦۛۦ۠ۘۦۖۧۨۘ";
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        String str = "۫ۜۙ۬ۤۛۢۢۚ۫ۢ۬ۦ۠ۚۜۦۘۛۦۨۘۗۘۖۛۨۛۥۚۖ۬۫ۖۘۜۚۛ۫ۛۘۘۜۛۖۘۚۧۦۘ۫۬ۡ۫ۧ۠۠۠";
        while (true) {
            switch ((((str.hashCode() ^ 718) ^ C4587yp.OooO0oO) ^ 129) ^ 1251190164) {
                case -1072898788:
                    this.OooooO0.removeCallbacksAndMessages(null);
                    str = "ۧۜۙ۠ۘۜۢ۬۫ۦۡۤۡۡۘ۠ۢۦۘۗۛ۠ۨۦۤۜۦۘۜۡۦۘۛۖۖۦ۟۫ۢۦ۠ۢۡۘۘۨ۫ۙۘۛۦۘۢۛۙ۬ۜۘ";
                    break;
                case -745770556:
                    super.onDetachedFromWindow();
                    str = "ۢ۬ۡۘ۟ۚۛۘ۟ۡۧۢۨۘ۫۠ۤۚۘۦۤۗۥۘۜۜۦۢۚۨۗۘۤ۟ۧۧۙ۟۠ۡۦۘۗ";
                    break;
                case 176663208:
                    str = "ۨۤۥۘۛۦۚۢۗۨۦۖۧۥۚۜۜۛ۬۠ۦ۟۫ۤۤۨۦۜۘۛۡۦۘۘ۫ۜ۬۠ۚۘۙۦۡۗۜ۫ۗ۬ۤۨۥۘ";
                    break;
                case 1357334889:
                    return;
            }
        }
    }
}
