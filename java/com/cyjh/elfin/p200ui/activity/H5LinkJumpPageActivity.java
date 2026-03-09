package com.cyjh.elfin.p200ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.umeng.analytics.MobclickAgent;
import com.ywfzjbcy.R;

/* JADX INFO: loaded from: classes.dex */
public class H5LinkJumpPageActivity extends BaseActivity {
    private LinearLayout OooooO0;
    private WebView OooooOO;

    public class OooO00o extends WebViewClient {
        public final H5LinkJumpPageActivity OooO00o;

        public OooO00o(H5LinkJumpPageActivity h5LinkJumpPageActivity) {
            this.OooO00o = h5LinkJumpPageActivity;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2 = "ۢۛۖۗ۫۠ۤۧۖۨۧۜۘۗۨۤۧ۟ۜۡۜ۠ۗۖۡ۫۫۬ۨ۬ۘۘ۠ۥۧۘ۫ۦۖۥۢۨۘۙۗ۬ۙ۫ۥۘ۫ۦ۟ۜۥۖۗۢۖ";
            while (true) {
                switch (str2.hashCode() ^ (-656897478)) {
                    case -361391945:
                        str2 = "ۡۚ۠ۘ۫ۜۦۛۤۗۙۗۤۡ۬۠ۘۖ۠ۜ۬ۨ۟ۗۖ۫ۖۘۦۖۗ۠ۤۦۢۛۜۘۚ۫ۥۘ۠۬ۥۘۢۨۜۘۗ۫ۖۘ";
                        break;
                    case -262413660:
                        String str3 = "ۗۗۘۧۧ۬ۘۢۢ۠ۨۧۙ۠ۗ۫۬ۥۘۤۧۘۘۚۦۗ۠۠ۜۘۢۧ۬ۗۗۦ۟ۖ۫ۖۧۜۘۦۗۘۘ";
                        while (true) {
                            switch (str3.hashCode() ^ 887778379) {
                                case -1674814037:
                                    str2 = "ۦۚۜۦۗۨۘۥ۠ۡۘۡۛۚۖۘۦ۠۟ۘ۫ۡۘ۫۟ۘۘۖ۬ۜۨۘۙ۬ۥۥ۠ۡ۬ۚۦۘۜۛۦۙۢۚۖۡۢ";
                                    continue;
                                case -666721607:
                                    str3 = "ۚۧ۫ۢۙۥۘۗۗۜۘۦۘۘۖ۟ۤۢۥۙۚۡۦۨۤۨۘۛۨۜۦ۬ۙ";
                                    break;
                                case 1011462163:
                                    str3 = !str.startsWith("http://") ? "ۖۧۘۤۡۡۘۨۦۦۘۦۘۦۘ۫ۖۜۤۚۡۨۘۤۡ۟ۦۦۚۦ۫ۨ" : "ۦ۠ۛ۟ۦۘۚۜۧۦۚۢۧۛۖۘۨۚ۠ۨۖۧۢ۫ۤۛۡۜۘۚ۬ۘ۫ۧۢۢۗۘ";
                                    break;
                                case 2010828249:
                                    str2 = "ۜۢۡۘۧۢۘ۟ۧۛۨۜۨۘۡۜۡۘۥۙۖۘۚۧۨۗۦۜۗۖۜۗۖۘ";
                                    continue;
                            }
                        }
                        break;
                    case -122093965:
                        String str4 = "۬ۦۘ۫ۨۢۖۡۢ۫ۛۗۗۥۦۦ۫ۜۥۗۛ۬ۦۦۥۙۨۗۦۤۥ۟ۦ۬ۗ۫ۙۦۥۙۨ";
                        while (true) {
                            switch (str4.hashCode() ^ (-513389583)) {
                                case 88421922:
                                    str4 = "ۗۙۚۥۜۧۘ۬ۙۥۥۤۘۥۦۨۖۨۘۘ۬ۡۗۨۦۗۨۨۚۜۧۙۦۥ۬۟ۡۖۘۢۚ۬ۡۧۘۘۥۗۧ۟ۥۖ";
                                    break;
                                case 168833038:
                                    try {
                                        this.OooO00o.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case 1277300168:
                                    String str5 = "ۗۛۜۘۧۙۚۙۚۛۢ۫ۚۘۜۡۘ۠۟ۨۘۢۥۨۘۙۤ۬ۗۖۛۧۦۙۛۜۡۘ۫ۛۛۗۥۡ۠ۗۥ";
                                    while (true) {
                                        switch (str5.hashCode() ^ 570240126) {
                                            case -2091229067:
                                                str5 = !str.startsWith("https://") ? "ۤۙۘۢۛۨۨ۫ۨۡۧۡۦۚۜ۠ۛۜۛۡ۬ۜۛۥۘ۠ۡۧۖۖۚۛۘۡۙۢ" : "ۜۡۨۘۦۘ۬ۛۖۦ۠۠ۢۥ۟۫ۖۢۨۤ۟ۢۘۙۢۡ۫ۨۘۛۜۙ۬ۙۜۤۛۦۘ";
                                                break;
                                            case -1715616955:
                                                str5 = "ۦۖ۠۬ۜ۬ۘۘۘۘۜۦۜۘۤۖۚۨ۫ۚۢۥۘۛۦۘ۠ۤۥۘۘۖۜۘ";
                                                break;
                                            case -1555811262:
                                                str4 = "ۧۘۜ۫ۤۦۧۖۥۙۤۤۡ۠۫ۥۢۘۘۢۜۘۖۦۧۘۤۦۦۘۛ۫";
                                                continue;
                                            case -451776108:
                                                str4 = "۠۠ۖۦ۟ۡۗۨۦۨ۟ۗ۫۫۬ۥۤۦۘ۠ۤۤۡ۟۬ۧۥۧۘۧ۠ۛۨۡۘۧۢۙ۬ۜۨۘۡۗۦۘۗۗۢۦ۟ۢ";
                                                continue;
                                        }
                                    }
                                    break;
                                case 1345920470:
                                    break;
                            }
                        }
                        break;
                    case 1528400133:
                        break;
                }
            }
            webView.loadUrl(str);
            return true;
        }
    }

    public class OooO0O0 implements TitleView.OooO0O0 {
        public final H5LinkJumpPageActivity OooO00o;

        private OooO0O0(H5LinkJumpPageActivity h5LinkJumpPageActivity) {
            this.OooO00o = h5LinkJumpPageActivity;
        }

        public /* synthetic */ OooO0O0(H5LinkJumpPageActivity h5LinkJumpPageActivity, OooO00o oooO00o) {
            this(h5LinkJumpPageActivity);
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "۠ۨ۬ۗۗۖۘ۫۠ۢۥۘۨۤۧۗۖ۟ۢۖۙ۠ۜۤ۠ۦۗۧۧۖۘۗۙۡۘۘۥۡۘۨ۠ۘ۬ۡ۠ۢۡۜۘۧۨۤ";
            while (true) {
                switch ((((str.hashCode() ^ 425) ^ 89) ^ 150) ^ (-852730442)) {
                    case 332271282:
                        str = "۠ۢ۠ۙۙۗۢۨۘ۫ۡۢۤۡ۬ۥۛ۠۠ۘ۬ۙۜۥۘۥۗ۠";
                        break;
                    case 1019217935:
                        str = "۬ۖۦۚۨۘ۟ۤۡۘ۟ۚۥۘۜ۫ۛۧۙ۟ۙۚۨۘۚۛ۟ۥ۟ۥۛۛۗ۟۫ۥۘۙۜۗۡ۠ۗۘۗۨۘۧۘۡۘ۬ۛ۫";
                        break;
                    case 1638912761:
                        return;
                    case 1775476674:
                        this.OooO00o.finish();
                        str = "۟ۙۤۧۨۘۦۤۡ۬ۥۤۦۜ۫۠ۨ۟ۨۧۨۨۘۨۨ۫ۢۤۙۖۜۛ۫ۥۦۥۡۧۜۥ۫ۘۧۧ۬ۗۖۢۡ۠ۗۜۦۘ";
                        break;
                }
            }
        }
    }

    private void OooO0oO(String str) {
        WebSettings settings = null;
        String str2 = "ۧۢۖۘۦۖۙۤ۬۟ۜ۠ۚۖۜۛ۟۠ۜۘۛۖۦۘۤۛۢۚۙ۠ۜۤۘۘ";
        while (true) {
            switch ((((str2.hashCode() ^ 931) ^ 161) ^ 982) ^ (-316950559)) {
                case -1910897803:
                    settings.setJavaScriptEnabled(true);
                    str2 = "۬۠ۦۛۥۙۙۨۙۦۜۡۘۡۖۢ۠ۗۘۘۧ۫۟ۘۦۥۘۤ۠۠۟۟ۘۘۚۙۦۙۙ۠";
                    break;
                case -849936825:
                    str2 = "ۦۖ۟ۨۥۗۡۚۘۦۨۜۘ۠ۥ۟ۦۨۧۦۙ۟ۢۤۢۛۛۥۡۘۢ۬۟ۘۚ۫ۤۤۜۘ۟ۖۤ";
                    break;
                case 62767186:
                    settings.setDatabaseEnabled(true);
                    str2 = "ۚۨۦۥ۫ۛۡۢۢۙ۫ۨۨۚۨ۠ۥۢۥۦۨۨۘ۟ۢۛ۟۫ۚ";
                    break;
                case 1237064229:
                    this.OooooOO.setWebViewClient(new OooO00o(this));
                    str2 = "ۧۗ۠۬ۦۚ۬ۡۘۘۤۙۤۢۚۖۢ۠ۥۧ۫ۜۧۧۗۛۗۙۧ۫ۙۨ۬ۤۜۘ۠ۨۨۘ۟ۧۘ۟ۗۜۘ۠ۨۙۨ۫ۘۘۗ۫ۘ";
                    break;
                case 1384405022:
                    settings.setDomStorageEnabled(true);
                    str2 = "ۢۚ۬ۤۨۙۘۚۖۘۥۗ۬۫ۖۘ۬ۙ۫ۨ۠ۗۢۤۛۦۢ۫ۨۤ۠";
                    break;
                case 1506077664:
                    settings.setLoadWithOverviewMode(true);
                    str2 = "۠ۧۨۘۚۡۤۦۨۨۘۘۥۚۗۦۦۥ۬۫۠ۙۗۘۗۙ۟ۖۘۘۡۘۖۦۥۖۢۨۦۘۤۦۦۘۛۛ۠";
                    break;
                case 1636552001:
                    settings.setBuiltInZoomControls(true);
                    str2 = "ۢۥ۠ۦ۬ۡۤۚ۠ۥۡۛۢۥۘۘۛۖۗۜۥۥۘۢ۫ۦۘۜۙۨۘۚۜۘۚۗۡۘۤۗۘۛۖ۫ۨۜۖۘۤ۬۠ۤۡۤ";
                    break;
                case 1658944735:
                    this.OooooOO.loadUrl(str);
                    str2 = "ۚۖۜۘۜۖۦۛۚۘۦۤۤۧۥ۠ۜۤۨۤ۠ۧۥۡۘ۫۬ۘۘۖۧۢ";
                    break;
                case 1846669447:
                    str2 = "۬ۚۢۨۘۖۜۧۡۘۡۙۚ۠ۤۤۙۖۨۖۖۥۖ۫۟ۤ۠ۙ۫ۙۜ۠۠ۘۘۙۙۢۜ۠ۙۚۧۖ";
                    break;
                case 2118489279:
                    return;
                case 2143159698:
                    settings = this.OooooOO.getSettings();
                    str2 = "ۖۤۜۘ۬۟ۨۡ۟ۘۘۗۙۜۙۜۙ۟۫ۖۘۖۨۛۛۖۢۨ۬ۡۘۗۗۘۘ۠۟ۙۢۤۛۤ۠ۢۛ۬ۖۜ۫ۡۘ۬ۛۗۢ۬ۙ۬ۤۙ";
                    break;
            }
        }
    }

    private void OooO0oo(String str) {
        OooO00o oooO00o = null;
        String str2 = "ۘۚۧۜۚ۟ۘۨۘۜ۫ۨۛۦۚۚۦۖ۬ۥۡۘۢ۬ۚۛۥۨۘ۬ۜۤ۫ۛۧۦۚۘۘ۠۬۫۫ۘۘۛۨۨ۟ۚۙۖۦ۫ۙ";
        LinearLayout.LayoutParams layoutParams = null;
        TitleView titleView = null;
        while (true) {
            switch ((((str2.hashCode() ^ UiMessage.CommandToUi.Command_Type.GET_UIP_DATA_VALUE) ^ 899) ^ 950) ^ (-789757147)) {
                case -1782875812:
                    return;
                case -1207898785:
                    titleView.setOnLeftImageViewListener(new OooO0O0(this, oooO00o));
                    str2 = "ۜۡۖۘۢۙۜۛۦۘۡۨۨۘ۬ۦ۫ۙۜۚۦۜۡۢۙۥۘۛ۟ۖۘۖۖۗ۠ۤۡۘۨۘۧۘۦۥۤۨۧۛۖ۫ۤۘۢ";
                    break;
                case -1191971053:
                    this.OooooO0 = (LinearLayout) findViewById(R.id.ll_root);
                    str2 = "ۗۖۧۤۗۗۨ۟ۖۤۙۘۘ۫۟ۖۡ۠ۤۖۗۧۧۘۛۛۢۤۡۗۡۘ۬ۛۜۘ";
                    break;
                case -878312671:
                    this.OooooO0.addView(this.OooooOO, layoutParams);
                    str2 = "ۡۡۡۘۥۢۗۖۤۧۙۧۡۡۡۜۗۜۥۧۜۥۘۢۛ۬ۜۢۧۨ۫۫";
                    break;
                case -556410040:
                    titleView.setVisibilityRightImage(8);
                    str2 = "۬ۘۥۘ۬۫۬ۦۦۤۙۢۦ۫ۦۤ۬۠ۥۢۡۨ۫۫ۤۦۦۥۜۥۥۘ۠ۙ۟ۤۙ۠ۥۛ۠۫ۥۜۘ";
                    break;
                case -517381809:
                    str2 = "ۙۦۧۨۥ۠ۡۛ۠ۙۨۡۛۙۚۛۜۢۗ۫ۦۦۜۤۧۗۗۙۨ";
                    break;
                case 144554189:
                    str2 = "ۨ۠ۦۚۢ۫ۘۙ۬۫ۦۗۨۡۘ۠ۢۘۘ۬ۚۖۖ۟ۦۥۡۥۡۡۘۢۥ۫ۦۜۘ";
                    titleView = (TitleView) findViewById(R.id.title_view);
                    break;
                case 367946331:
                    this.OooooOO = new WebView(getApplicationContext());
                    str2 = "ۖۘۨۘۦۜ۬ۦۧۖۘۡۤۡۘۘۖۨۜۜۘۧۖۦ۠ۤۡۜۢۘۘۙ۫ۛۥ۟ۢۦ۟ۧ۬۬ۥۨۖۥۘۛ۠۬۠ۘۘۤۡۦۘۘ۟ۨۘ";
                    break;
                case 560011035:
                    str2 = "ۙۦ۬ۗۡۧۥۗۘۘۜۖۖۧ۠ۤۘۢۧۛۘۡۚۧۨۗۨۡۘۘۢۧ۫۫ۚۜۘۢ۠ۜۤۧۚۘۗۦۘۦۖۦۘ";
                    break;
                case 843851204:
                    titleView.setleftImage(R.drawable.ic_back);
                    str2 = "ۨۙ۫ۨۨۨۙۦۖۘ۟۠ۗۤۡ۟ۗۙۦ۠ۛۡۤۚۗۖۚۡۧۥۛۦۨۡ۬ۗۙ";
                    break;
                case 1582780412:
                    layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    str2 = "ۧۗۡ۬ۖۖۘۚ۬ۦۧۚۖۥۗۚۙ۫ۛۚۡۜۙ۠ۖۘۥۦ۟ۖۤۧ";
                    break;
                case 1734918441:
                    titleView.setVisibilityTvRight(0);
                    str2 = "ۖۜۥۚ۟ۙۗ۬۫۬۬۬۫ۧۜۘ۟ۘۤ۟ۖۦ۟ۢۥۘ۬ۗۧۚۗۧۥۨۦۥۥۖۘ۬۠ۚ۬ۛۡۘ";
                    break;
                case 1856470132:
                    titleView.setTitleText(str);
                    str2 = "۠ۚۥۘ۬ۗۤۦۜۨۘۗۧۡۘۘۖۧۢۘۘۘ۟ۗۖۘ۬ۨۘۛۦ۟ۙ۟ۢۜۙۘۘۗۥۛۡۜۡۘۜۘۙۨۚ۟ۘۧ۫ۢۡۘۦۨۜۘ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۗۡۢ۬ۥ۫۫ۛۜۛۧۜۘۦۡۙۥۜ۟۠ۘۤ۬ۙۤۜ۫ۛۢۢۡۢۛۤۥۛۦۡۥۘۙۥۡۘ۟ۡۧۘۨۗۦ";
        String stringExtra = null;
        String stringExtra2 = null;
        Intent intent = null;
        while (true) {
            switch ((((str.hashCode() ^ 598) ^ 568) ^ 566) ^ 393718158) {
                case -1801304857:
                    return;
                case -165363789:
                    super.onCreate(bundle);
                    str = "ۚ۠ۧۖ۠ۘۜ۬ۘۦۢۢ۬ۢۡ۬ۥۥۢ۠ۦۘ۟ۧۗ۬ۢ۟ۖۧۦۚۜۖۖ۬۬ۧۥۘۘۤۦۙۙۗ۠ۥۛ۫۬ۖۘۚۙۖ";
                    break;
                case 23017793:
                    OooO0oO(stringExtra);
                    str = "۠ۦۧۘ۬۫ۚ۬ۙ۟ۙۘۤۘۘۛۥۘ۫ۥۜ۬ۥ۟ۘۗۦۤۜۦۘۚۡۖۙۖۘۛۦۘۧۧۜ";
                    break;
                case 35713126:
                    str = "ۛ۬ۜۧۖۥۗۚۤۨۖۡۦۤ۠ۙۜۦۘۙۤۙۛۙۖۡۤۛۡۖ۟ۨۧۘۖۘ";
                    break;
                case 278356663:
                    OooO0oo(stringExtra2);
                    str = "ۤۢۥۨۥۛۥ۟ۙۙۗ۬۠ۘۧۗۧۨۘ۬ۦۡۘۤۗۤۙۙۥ۫ۤۨۘ";
                    break;
                case 330763388:
                    str = "ۜ۫ۥۘۨۖۗۨۦۜۘۜۜۧۗ۬ۥۘۚۘۧۚۧۨۜۧۥۘ۟۬ۥۜۢۛۢۤۨۘۦ۠";
                    intent = getIntent();
                    break;
                case 448569696:
                    str = "۟ۜ۫ۛۘۚۗۥۗ۟ۤۚۨۙۘۘ۫ۧۗۥۥۦۘۡۜۨۗۧۚۡۦۗۨۢۛۚ۟ۧۢۗ۬ۧۡۧ۠۟ۢ۬ۤ";
                    break;
                case 572174225:
                    str = "ۖۛۧۗۡۛ۠ۥۢۘۤۘۘۙ۠ۡۘۖۛۧ۟۟ۦۙۚۜۘۡۛۦۘۢۘ۬";
                    stringExtra2 = intent.getStringExtra(H5LinkJumpPageActivity.class.getCanonicalName());
                    break;
                case 893492706:
                    setContentView(R.layout.activity_h5_link_page);
                    str = "۬ۙۤ۫۠ۤۖۨ۬۫ۦۙۚۨۧۘۡ۠۫ۘۡۘۘۨ۫۠۟۟ۙۨۡۙ";
                    break;
                case 1936758887:
                    stringExtra = intent.getStringExtra(H5LinkJumpPageActivity.class.getSimpleName());
                    str = "ۖۤۚ۟۠۠ۗ۠ۧۚۤۦۧۢۧ۬ۜۡۡۜۘۡۘۧۖۡۧۖۙۗۛۡۦۡۘۡ۫ۚۖۘۜۜۘ۫ۛۡۙۧۛۦ۟ۨ۬ۖ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۦۧۗ۟ۢۛۖۢۤۗۤۜۡ۠ۧۜ۠ۥ۬ۧۜۙۜۢۗۖۖۘۢ۬ۦۘۖۨۦۜ۫ۗۧ۫۠ۤۘ۫۟ۢۧۧۨۖۘۘۖ۟ۖۨۘ";
        WebView webView = null;
        while (true) {
            switch ((((str.hashCode() ^ 342) ^ 958) ^ 688) ^ (-128234722)) {
                case -1878548035:
                    webView = this.OooooOO;
                    str = "ۧۧۖۘۙۛ۫ۤۜ۬ۤۡۨۦۦۖۘۡۖۨۘۢ۬ۦۘ۟ۜۜۡ۠ۙۥۦ";
                    break;
                case -926061909:
                    this.OooooOO.destroy();
                    str = "۫ۥۧۘۧۗۛۖ۬۟ۜ۫ۨۘۨۙۘۘ۫ۡۧۜ۠۫ۙۗۚ۬ۡۧۘۤۡ۠ۜۥۥۘۚۢۜۨۨۘۘۜۜۡۡۖ۬ۨۘۡۘ";
                    break;
                case -616034008:
                    super.onDestroy();
                    str = "ۧۧۖۘۗ۬ۖۘ۠۟ۤ۫۬ۧۢۜۧۘۤۘ۬ۧ۟ۥۥ۫ۤۗ۠ۜۘۧ۫ۨ";
                    break;
                case -466073691:
                    this.OooooO0.removeView(webView);
                    str = "۬ۚۨۘۖۙۜۘۘۤۘ۬۬۟ۡ۫ۛۚۦۡۖۘۨۘۛ۟۠ۙۖۜۘ۠ۢ۟ۙۢۖۖۥۘۘۙ۟ۨ۫۫ۛ۫ۗۜۢۖۦۘ";
                    break;
                case 382365059:
                    this.OooooOO = null;
                    str = "ۚۛۤۨۦۥ۬ۤۡۦۥ۫ۚۡۥۘۥۙۡۖ۫ۖ۬ۢۘۛۘۧۘۗ۠۬ۡ۟ۨۘ۫ۦ۟۫ۤ۟ۤۙۦۘ";
                    break;
                case 1340528635:
                    String str2 = "ۢ۫ۦۘۨۜۛ۬ۨ۠ۢۨۡۗ۟ۥۨۚۜۚ۠ۜۛۚۦۜۛۛ۬ۦۧۘ۬۫۬۬ۥۘۥ۬ۥ۫ۨۘۧ۠۟ۢ۫ۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 1974996150) {
                            case -1848143423:
                                str = "۬ۖۤۜ۠ۗۧۢۜۖۢۢۦۦۧ۠ۙۘۘۤۘۥۘۥۧ۟ۥۚۥۘۢۢۖۛۚ۬۫ۙۦۘۨۗۥۘۨۦ";
                                continue;
                            case 764313376:
                                str2 = "ۜۙ۫ۖۨ۠ۛۙ۠۫ۥۘۘۘۡۨۘۜۧۦۘ۟ۢۨ۟ۡ۬۠۫ۤۥ۟ۥۘۜۙۜۚۗۚۥۚۦۙۥۧ";
                                break;
                            case 944523157:
                                str = "ۚۛۤۨۦۥ۬ۤۡۦۥ۫ۚۡۥۘۥۙۡۖ۫ۖ۬ۢۘۛۘۧۘۗ۠۬ۡ۟ۨۘ۫ۦ۟۫ۤ۟ۤۙۦۘ";
                                continue;
                            case 1300930388:
                                String str3 = "ۢۡ۫ۚۥۚۥۨۚۦۖۧۘ۬۟ۢۘۛۜۘۡۛۘۖۛۦ۬ۚۦۡۘۜۥۙ۠ۚ۠ۡۥۥۘ۫ۨۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 755628490) {
                                        case -1452667599:
                                            str3 = webView != null ? "ۤۡۢۥ۠ۡ۫ۖۙۜۧۙ۬ۖۜۘۗۜ۫ۡۧۨۘۙۢ۟ۥۧۘۥۨۨۧ۠ۦۦۗۗ۠ۜۢۘۖۡۛ۠ۨ۟ۜ" : "ۛۛۥۘۗۗۘۘۖۦۡۘۛۚۥۧۨۨۘ۟ۗۖۘ۫ۡ۬ۘۗۦۤۙۗ۠۠ۥ۟ۡ۬ۧۗ۫ۘۙۡۨۖۙۡۚۦۘ۫ۗۚ";
                                            break;
                                        case -683146672:
                                            str3 = "ۡۨ۫ۜۘۤۤ۬ۥۦۖۧۢۛۦ۟۫ۚۘۖۦۘ۬ۘۙ۠ۨۜۧ۬ۛۥ۟۠ۦ";
                                            break;
                                        case -394783094:
                                            str2 = "ۜ۫ۨۧۤۘۘ۬ۥۨۚ۬ۜۘۜۡۛۘۘۘۡ۟ۙۙۤۗۢۢۘۘۡۢ۫ۨۦۘۘ۬ۖۤۜۤۘۤۙۥۘ۟ۤۜۘۙۗۥۘۧۡۨۖۜ۬";
                                            break;
                                        case 1297595990:
                                            str2 = "ۥۤۦۘ۟ۖۘۛۦۡۘۥ۬ۖۘۗ۫ۦ۟ۨۘۥ۠۠ۧۚۧۗۦۖۘۜ۫ۙۛۢۥۨۤ۬ۖ۠ۚۛۘۥۘۨۚۜۦۖۨۘۧۙۖۧۘۜۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1533728729:
                    return;
                case 1773133206:
                    str = "ۦۚۨۘ۟ۧۢۛۡۖۨۤ۠ۥۜۚۦ۠ۜۢۨۖۥۜ۠ۧ۫ۧۢۗۤ۫ۨۨ۫۠ۜۘۘۘۚ۬ۥۨۘ۬۫ۖۘ۬ۢۖۘ";
                    break;
                case 2082913033:
                    this.OooooOO.removeAllViews();
                    str = "۟۫۟ۥۘ۟۠ۗۚۥۨۛ۟ۦۤۦۢ۬ۥۧۦۜۖۤۢۘۘ۬ۧ۬ۡۨۘ۫۫ۡۘ۠ۘۦۥۥ۬ۖ۟۫ۧۗۧۢۜۦۧۘۥ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "۠ۧۤۜۢۙۗۡۖۦۥۘۛ۫ۜۘۤۥ۠ۦۙۜ۫۬۫۫ۦۚۦۥ۬ۤ۬ۚۘۙۥۨۜۘۖ۟ۥۘۜۤۚۚۙۡۘ";
        while (true) {
            switch ((((str.hashCode() ^ 783) ^ 234) ^ 639) ^ (-802383819)) {
                case -1744798599:
                    return;
                case -1119764810:
                    super.onPause();
                    str = "ۨۤۖۘۤۧۚۤۘۤۖۘۧۢۖۘۚۥۧۡۗۥۛۧۦۦۨۜۘۜۙ۠ۧۧۢۥۦ۫۫۠ۘۘۗۘۖۘۚۘۜۘۨۥۜۘۚۘ۟۬ۤ";
                    break;
                case 526954237:
                    MobclickAgent.onPause(this);
                    str = "ۗۜۡۡۜۡۘۙۘۡۘۚ۠ۢۡۢۖۜ۠ۥۧۧۥۢ۟ۖۚۡۤۨۙ";
                    break;
                case 2001475766:
                    str = "۟۟ۥ۠ۗۧ۟ۗۜۘۜۨۥۘۡۙۜۤۧۜۗۚۥۢۢۨۘۘ۠ۖۘۜۚ۠";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "ۖۢۚۖۜۜۨ۬ۡۘۚ۟ۡۘۦۥۜۘۛ۠ۧۢۙۦۖۖۡۨۦۦۙ۟ۥۘ۬ۖۘۜۘۥۢ۟ۧۢۨۗ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_FW_IMAGE_VIEW_VALUE) ^ 540) ^ 878) ^ (-593115720)) {
                case -1333497395:
                    super.onResume();
                    str = "ۗۜ۠ۙۤۖۧۚۤۧۛ۫ۚۧۖۘۙۥۚۤۥ۬۫ۘ۫ۗۦۛۤۥ۫ۧ۫۟ۥۛۤۚۛۛۨۢۨۘۡۨ۟ۜۦ۬";
                    break;
                case -934645075:
                    return;
                case -473368486:
                    str = "ۡۧۖ۬ۜ۟ۨۡ۫ۛۤۥۘۤ۫ۥۙ۬ۛۛۨ۟ۘۡۗۧۡۦ۠ۘ۫۫ۨۘۦۨۙۙۢۗۗ۟";
                    break;
                case 1134702770:
                    MobclickAgent.onResume(this);
                    str = "۟ۧۦۘۚۛۛۛۧۖۘۨۙۥۘۧۢۜۘ۠ۚ۠ۨۥۦۡۛۥ۬ۖۚۡ۫ۙ";
                    break;
            }
        }
    }
}
