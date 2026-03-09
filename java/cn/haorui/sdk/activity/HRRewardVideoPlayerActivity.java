package cn.haorui.sdk.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import cn.haorui.sdk.C0384R;
import cn.haorui.sdk.adsail_ad.MediaView;
import cn.haorui.sdk.adsail_ad.nativ.NormalMediaView;
import cn.haorui.sdk.adsail_ad.reward.CircleProcessBar;
import cn.haorui.sdk.core.loader.C0511g;
import cn.haorui.sdk.core.p002ad.AdType;
import cn.haorui.sdk.core.p002ad.IAd;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener;
import cn.haorui.sdk.core.utils.ClickHandler;
import cn.haorui.sdk.core.utils.DownloadDialogBean;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.view.NoNavigationDialog;
import cn.haorui.sdk.core.view.TouchAdContainer;
import cn.haorui.sdk.core.view.TouchPositionListener;
import cn.haorui.sdk.core.view.gif.GifImageView;
import cn.haorui.sdk.platform.p003hr.BaseFullScreenVideoAd;
import com.anythink.expressad.foundation.p120g.C1801a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p285z2.o000;

/* JADX INFO: loaded from: classes.dex */
public class HRRewardVideoPlayerActivity extends AppCompatActivity {
    public static final String Action_text = "Action_text";
    public static final String Ad_content = "Ad_content";
    public static final String Ad_icon_url = "Ad_icon_url";
    public static final String Ad_title = "Ad_title";
    public static final String Ad_type = "Ad_type";
    public static final String Clickable_range = "Clickable_range";
    public static final String Clk_type = "clk_type";
    public static final String Close_btn = "Close_btn";
    public static final String From_logo = "From_logo";
    public static final String Interaction_type = "Interaction_type";
    public static final String Power_count = "power_count";
    public static final String Power_delay = "power_delay";
    public static final String Power_index = "power_index";
    private static final String TAG = "AdsailRewardVideoPlayerActivity";
    public static final String Video_complete_key = "Video_complete_key";
    public static final String Video_cover = "Video_cover";
    public static final String Video_endcover = "Video_endcover";
    public static final String Video_keep_time = "Video_keep_time";
    public static final String Video_mute_key = "Video_mute_key";
    public static final String Video_one_half_key = "Video_one_half_key";
    public static final String Video_one_quarter_key = "Video_one_quarter_key";
    public static final String Video_pause_key = "Video_pause_key";
    public static final String Video_replay_key = "Video_replay_key";
    public static final String Video_resume_key = "Video_resume_key";
    public static final String Video_start_key = "Video_start_key";
    public static final String Video_three_quarter_key = "Video_three_quarter_key";
    public static final String Video_unmute_key = "Video_unmute_key";

    /* JADX INFO: renamed from: ad */
    private static BaseFullScreenVideoAd f45ad = null;
    private static DownloadDialogBean downloadBean = null;
    public static final String local_ad_id_key = "local_ad_id_key";
    public static final String orientation_key = "orientation_key";
    private o000 aQuery;
    private int adType;
    private String localAdId;
    private NormalMediaView mediaView;
    private ViewGroup mediaViewContainer;
    private boolean onCompletedInvoked;
    private boolean onReward;
    private CircleProcessBar processBar;
    private int shakeId;
    private GifImageView shakeImageView;
    private TouchAdContainer touchContainer;
    private Runnable updateProcessRunnable = new Runnable() { // from class: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity.11
        public RunnableC040611() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HRRewardVideoPlayerActivity.this.onCompletedInvoked || HRRewardVideoPlayerActivity.this.mediaView == null) {
                return;
            }
            HRRewardVideoPlayerActivity.this.processBar.refreshProcess(HRRewardVideoPlayerActivity.this.mediaView.getCurrentPosition());
            HRRewardVideoPlayerActivity.this.mediaView.postDelayed(this, 100L);
        }
    };
    private boolean videoLoaded;
    private static Map<String, MediaView> rewardMediaViews = new HashMap();
    private static List<IAd> baseFullScreenVideoAdList = new ArrayList();
    private static boolean isMute = false;

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$1 */
    public class ViewOnClickListenerC04041 implements View.OnClickListener {
        public final /* synthetic */ String val$actionText;

        /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$1$1 */
        public class AnonymousClass1 implements DialogInterface.OnClickListener {
            public AnonymousClass1() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                if (HRRewardVideoPlayerActivity.this.mediaView == null || !HRRewardVideoPlayerActivity.this.mediaView.isPlaying()) {
                    return;
                }
                HRRewardVideoPlayerActivity.this.mediaView.resume();
            }
        }

        /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$1$2 */
        public class AnonymousClass2 implements DialogInterface.OnClickListener {
            public AnonymousClass2() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                if (HRRewardVideoPlayerActivity.this.mediaView != null) {
                    HRRewardVideoPlayerActivity.this.mediaView.onVideoSkiped();
                }
                HRRewardVideoPlayerActivity.this.onCompletedInvoked = true;
                HRRewardVideoPlayerActivity.this.onReward = true;
                HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_video_playing_ad_info_container).o00Ooo();
                HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_ad_info_container).o000o00();
                HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_download_button).o000Oo00(str);
                HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_close_button_parent).o000o00();
                HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_skip_button).o00Ooo();
                HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_include_ad_tag).o00Ooo();
                HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_include_ad_tag_end).o000o00();
                if (HRRewardVideoPlayerActivity.this.processBar != null) {
                    HRRewardVideoPlayerActivity.this.processBar.setVisibility(8);
                }
            }
        }

        public ViewOnClickListenerC04041(String str) {
            str = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (HRRewardVideoPlayerActivity.this.mediaView != null && HRRewardVideoPlayerActivity.this.mediaView.isPlaying()) {
                    HRRewardVideoPlayerActivity.this.mediaView.pause();
                }
                NoNavigationDialog noNavigationDialog = new NoNavigationDialog(HRRewardVideoPlayerActivity.this);
                noNavigationDialog.setTitle("观看完成即可获得奖励");
                noNavigationDialog.setButton(-1, "继续观看", new DialogInterface.OnClickListener() { // from class: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity.1.1
                    public AnonymousClass1() {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        if (HRRewardVideoPlayerActivity.this.mediaView == null || !HRRewardVideoPlayerActivity.this.mediaView.isPlaying()) {
                            return;
                        }
                        HRRewardVideoPlayerActivity.this.mediaView.resume();
                    }
                });
                noNavigationDialog.setButton(-2, "放弃奖励", new DialogInterface.OnClickListener() { // from class: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity.1.2
                    public AnonymousClass2() {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        if (HRRewardVideoPlayerActivity.this.mediaView != null) {
                            HRRewardVideoPlayerActivity.this.mediaView.onVideoSkiped();
                        }
                        HRRewardVideoPlayerActivity.this.onCompletedInvoked = true;
                        HRRewardVideoPlayerActivity.this.onReward = true;
                        HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_video_playing_ad_info_container).o00Ooo();
                        HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_ad_info_container).o000o00();
                        HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_download_button).o000Oo00(str);
                        HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_close_button_parent).o000o00();
                        HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_skip_button).o00Ooo();
                        HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_include_ad_tag).o00Ooo();
                        HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_include_ad_tag_end).o000o00();
                        if (HRRewardVideoPlayerActivity.this.processBar != null) {
                            HRRewardVideoPlayerActivity.this.processBar.setVisibility(8);
                        }
                    }
                });
                noNavigationDialog.show();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$10 */
    public class C040510 implements RecyclerAdMediaListener {
        public final /* synthetic */ long val$keepTime;
        public final /* synthetic */ MediaView val$rewardMediaView;

        public C040510(MediaView mediaView, long j) {
            mediaView = mediaView;
            j = j;
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoCompleted() {
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoError() {
            HRRewardVideoPlayerActivity.this.sendBroadcast(BaseFullScreenVideoAd.broadcast_on_video_error);
            for (int i = 0; i < HRRewardVideoPlayerActivity.baseFullScreenVideoAdList.size(); i++) {
                try {
                    BaseFullScreenVideoAd baseFullScreenVideoAd = (BaseFullScreenVideoAd) HRRewardVideoPlayerActivity.baseFullScreenVideoAdList.get(i);
                    if (baseFullScreenVideoAd != null) {
                        baseFullScreenVideoAd.destroy();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            HRRewardVideoPlayerActivity.this.finish();
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoLoaded() {
            HRRewardVideoPlayerActivity.this.videoLoaded = true;
            HRRewardVideoPlayerActivity.this.startVideo(mediaView);
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoPause() {
            HRRewardVideoPlayerActivity.this.sendBroadcast(BaseFullScreenVideoAd.broadcast_on_video_pause);
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoResume() {
            HRRewardVideoPlayerActivity.this.sendBroadcast(BaseFullScreenVideoAd.broadcast_on_video_resume);
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoStart() {
            if (HRRewardVideoPlayerActivity.this.mediaView == null) {
                return;
            }
            long j = j;
            HRRewardVideoPlayerActivity.this.processBar.setmTotalTime((j <= 0 || j >= ((long) HRRewardVideoPlayerActivity.this.mediaView.getDuration())) ? HRRewardVideoPlayerActivity.this.mediaView.getDuration() : (int) j);
            HRRewardVideoPlayerActivity.this.sendBroadcast(BaseFullScreenVideoAd.broadcast_on_video_start);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$11 */
    public class RunnableC040611 implements Runnable {
        public RunnableC040611() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HRRewardVideoPlayerActivity.this.onCompletedInvoked || HRRewardVideoPlayerActivity.this.mediaView == null) {
                return;
            }
            HRRewardVideoPlayerActivity.this.processBar.refreshProcess(HRRewardVideoPlayerActivity.this.mediaView.getCurrentPosition());
            HRRewardVideoPlayerActivity.this.mediaView.postDelayed(this, 100L);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$12 */
    public class ViewOnClickListenerC040712 implements View.OnClickListener {
        public ViewOnClickListenerC040712() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (HRRewardVideoPlayerActivity.downloadBean != null) {
                    HRDownloadDetailActivity.startActivity(HRRewardVideoPlayerActivity.this, HRRewardVideoPlayerActivity.downloadBean);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$2 */
    public class ViewOnClickListenerC04082 implements View.OnClickListener {

        /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$2$1 */
        public class AnonymousClass1 implements DialogInterface.OnClickListener {
            public AnonymousClass1() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                if (HRRewardVideoPlayerActivity.this.mediaView == null || !HRRewardVideoPlayerActivity.this.mediaView.isPlaying()) {
                    return;
                }
                HRRewardVideoPlayerActivity.this.mediaView.resume();
            }
        }

        /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$2$2 */
        public class AnonymousClass2 implements DialogInterface.OnClickListener {
            public AnonymousClass2() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                HRRewardVideoPlayerActivity.this.sendBroadcast(BaseFullScreenVideoAd.broadcast_onclosed);
                HRRewardVideoPlayerActivity.this.finish();
            }
        }

        public ViewOnClickListenerC04082() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (!HRRewardVideoPlayerActivity.this.onReward && HRRewardVideoPlayerActivity.this.adType == AdType.REWARD.value()) {
                    if (HRRewardVideoPlayerActivity.this.mediaView != null && HRRewardVideoPlayerActivity.this.mediaView.isPlaying()) {
                        HRRewardVideoPlayerActivity.this.mediaView.pause();
                    }
                    NoNavigationDialog noNavigationDialog = new NoNavigationDialog(HRRewardVideoPlayerActivity.this);
                    noNavigationDialog.setTitle("观看完成即可获得奖励");
                    noNavigationDialog.setButton(-1, "继续观看", new DialogInterface.OnClickListener() { // from class: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity.2.1
                        public AnonymousClass1() {
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            if (HRRewardVideoPlayerActivity.this.mediaView == null || !HRRewardVideoPlayerActivity.this.mediaView.isPlaying()) {
                                return;
                            }
                            HRRewardVideoPlayerActivity.this.mediaView.resume();
                        }
                    });
                    noNavigationDialog.setButton(-2, "放弃奖励", new DialogInterface.OnClickListener() { // from class: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity.2.2
                        public AnonymousClass2() {
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            HRRewardVideoPlayerActivity.this.sendBroadcast(BaseFullScreenVideoAd.broadcast_onclosed);
                            HRRewardVideoPlayerActivity.this.finish();
                        }
                    });
                    noNavigationDialog.show();
                    return;
                }
                HRRewardVideoPlayerActivity.this.sendBroadcast(BaseFullScreenVideoAd.broadcast_onclosed);
                HRRewardVideoPlayerActivity.this.finish();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$3 */
    public class ViewOnClickListenerC04093 implements View.OnClickListener {
        public ViewOnClickListenerC04093() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (HRRewardVideoPlayerActivity.this.mediaView != null && HRRewardVideoPlayerActivity.this.mediaView.isPlaying()) {
                    if (HRRewardVideoPlayerActivity.isMute) {
                        boolean unused = HRRewardVideoPlayerActivity.isMute = false;
                        HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_voice_button).o0ooOoO(C0384R.drawable.adsail_voice_open);
                        HRRewardVideoPlayerActivity.this.mediaView.onUnmute();
                    } else {
                        boolean unused2 = HRRewardVideoPlayerActivity.isMute = true;
                        HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_voice_button).o0ooOoO(C0384R.drawable.adsail_voice_closed);
                        HRRewardVideoPlayerActivity.this.mediaView.onMute();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$4 */
    public class C04104 implements C0511g.d {
        public final /* synthetic */ LinearLayout val$shakeRootView;

        public C04104(LinearLayout linearLayout) {
            linearLayout = linearLayout;
        }

        @Override // cn.haorui.sdk.core.loader.C0511g.d
        public void onShake() {
            HRRewardVideoPlayerActivity.this.onClick();
            if (HRRewardVideoPlayerActivity.this.shakeImageView != null) {
                HRRewardVideoPlayerActivity.this.shakeImageView.clear();
                linearLayout.setVisibility(8);
            }
            C0511g.c.f151a.m44a(HRRewardVideoPlayerActivity.this.shakeId);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$5 */
    public class ViewOnClickListenerC04115 implements View.OnClickListener {
        public ViewOnClickListenerC04115() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.m87e(HRRewardVideoPlayerActivity.TAG, "video_playing_download_button  clicked");
            HRRewardVideoPlayerActivity.this.onClick();
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$6 */
    public class ViewOnClickListenerC04126 implements View.OnClickListener {
        public ViewOnClickListenerC04126() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.m87e(HRRewardVideoPlayerActivity.TAG, "download_button  clicked");
            HRRewardVideoPlayerActivity.this.onClick();
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$7 */
    public class ViewOnClickListenerC04137 implements View.OnClickListener {
        public ViewOnClickListenerC04137() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HRRewardVideoPlayerActivity.this.onClick();
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$8 */
    public class C04148 implements MediaView.OnVideoKeepTimeFinishListener {
        public C04148() {
        }

        @Override // cn.haorui.sdk.adsail_ad.MediaView.OnVideoKeepTimeFinishListener
        public void onKeepTimeFinished() {
            HRRewardVideoPlayerActivity.this.onReward = true;
            HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_close_button_parent).o000o00();
            HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_skip_button).o00Ooo();
            HRRewardVideoPlayerActivity.this.processBar.setVisibility(8);
            HRRewardVideoPlayerActivity.this.sendBroadcast(BaseFullScreenVideoAd.broadcast_onreward);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity$9 */
    public class C04159 implements MediaView.OnVideoCompleteListener {
        public final /* synthetic */ String val$actionText;

        public C04159(String str) {
            str = str;
        }

        @Override // cn.haorui.sdk.adsail_ad.MediaView.OnVideoCompleteListener
        public void onCompleted() {
            HRRewardVideoPlayerActivity.this.onCompletedInvoked = true;
            HRRewardVideoPlayerActivity.this.onReward = true;
            HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_video_playing_ad_info_container).o00Ooo();
            HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_ad_info_container).o000o00();
            HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_download_button).o000Oo00(str);
            HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_close_button_parent).o000o00();
            HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_reward_skip_button).o00Ooo();
            HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_include_ad_tag).o00Ooo();
            HRRewardVideoPlayerActivity.this.aQuery.o00oO0o(C0384R.id.adsail_include_ad_tag_end).o000o00();
            HRRewardVideoPlayerActivity.this.sendBroadcast(BaseFullScreenVideoAd.broadcast_on_video_complete);
        }
    }

    private byte[] getImageBytes(Context context, int i) {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i2 = inputStreamOpenRawResource.read(bArr);
                if (-1 == i2) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static MediaView getRewardMediaView(String str) {
        return rewardMediaViews.get(str);
    }

    private void handleDownloadView(int i) {
        try {
            LogUtil.m87e(TAG, "interaction_type=" + i + ", downloadBean=" + downloadBean);
            if (i != 1 || downloadBean == null) {
                return;
            }
            TextView textView = (TextView) findViewById(C0384R.id.adsail_download_layer_textview);
            textView.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(downloadBean.getApp_name())) {
                sb.append("应用名称：");
                sb.append(downloadBean.getApp_name());
                sb.append(" | ");
            }
            if (!TextUtils.isEmpty(downloadBean.getApp_ver())) {
                sb.append("应用版本：");
                sb.append(downloadBean.getApp_ver());
                sb.append(" | ");
            }
            if (!TextUtils.isEmpty(downloadBean.getApp_size())) {
                sb.append("应用大小：");
                sb.append(downloadBean.getApp_size());
                sb.append(" | ");
            }
            if (!TextUtils.isEmpty(downloadBean.getDeveloper())) {
                sb.append("开发者：");
                sb.append(downloadBean.getDeveloper());
                sb.append(" | ");
            }
            if (!TextUtils.isEmpty(downloadBean.getApp_permission_url()) || downloadBean.getApp_permission() != null) {
                sb.append(" 权限详情>");
                sb.append(" |");
            }
            if (!TextUtils.isEmpty(downloadBean.getApp_private_agreement())) {
                sb.append(" 隐私协议 > ");
                sb.append(" |");
            }
            if (!TextUtils.isEmpty(downloadBean.getApp_intor_url()) || !TextUtils.isEmpty(downloadBean.getApp_intro())) {
                sb.append(" 功能介绍>");
            }
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                textView.setVisibility(8);
            } else if (string.endsWith(C1801a.f11059bQ)) {
                string.substring(0, string.length() - 1);
            }
            textView.setText(string);
            textView.setOnClickListener(new View.OnClickListener() { // from class: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity.12
                public ViewOnClickListenerC040712() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        if (HRRewardVideoPlayerActivity.downloadBean != null) {
                            HRDownloadDetailActivity.startActivity(HRRewardVideoPlayerActivity.this, HRRewardVideoPlayerActivity.downloadBean);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onClick() {
        NormalMediaView normalMediaView = this.mediaView;
        if (normalMediaView == null || !normalMediaView.isPrepared()) {
            return;
        }
        ClickHandler.setShowDialogActivity(this);
        sendBroadcast(BaseFullScreenVideoAd.broadcast_onclick);
    }

    public static void removeRewardMediaView(String str) {
        MediaView mediaViewRemove;
        if (str == null || (mediaViewRemove = rewardMediaViews.remove(str)) == null || !(mediaViewRemove instanceof NormalMediaView)) {
            return;
        }
        ((NormalMediaView) mediaViewRemove).destroy();
    }

    public void sendBroadcast(@NonNull String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public static void setDownloadDialogBean(DownloadDialogBean downloadDialogBean) {
        downloadBean = downloadDialogBean;
    }

    public static void setFullScreenAd(IAd iAd) {
        baseFullScreenVideoAdList.add(iAd);
    }

    public static void setRewardMediaView(String str, MediaView mediaView) {
        MediaView mediaView2 = rewardMediaViews.get(str);
        if (mediaView2 != null) {
            ((NormalMediaView) mediaView2.getVideoView()).stop();
        }
        rewardMediaViews.put(str, mediaView);
    }

    public static void setVideoMute(boolean z) {
        isMute = z;
    }

    public void startVideo(MediaView mediaView) {
        ((NormalMediaView) mediaView.getVideoView()).start();
        if (this.adType == AdType.REWARD.value()) {
            this.processBar.setVisibility(0);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:104|106|(1:108)(22:(1:111)|112|(21:114|(3:116|(1:118)(1:119)|120)(3:121|(2:(1:124)(1:125)|126)|127)|(7:131|(1:135)|136|(1:138)|139|(1:141)(1:142)|143)|146|(1:150)(1:149)|(1:153)|201|(1:155)(2:159|(1:161)(1:162))|156|163|(1:167)|168|(1:170)|171|(1:173)(1:174)|175|(1:177)|178|(1:180)|181|(9:183|204|184|(1:186)(1:187)|203|191|(1:195)|196|(2:198|207)(1:206))(2:199|200))(1:144)|145|146|(1:150)(0)|(0)|201|(0)(0)|156|163|(0)|168|(0)|171|(0)(0)|175|(0)|178|(0)|181|(0)(0))|109|112|(0)(0)|145|146|(0)(0)|(0)|201|(0)(0)|156|163|(0)|168|(0)|171|(0)(0)|175|(0)|178|(0)|181|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0223, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0250, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020f A[Catch: Exception -> 0x0223, TRY_ENTER, TryCatch #0 {Exception -> 0x0223, blocks: (B:155:0x020f, B:156:0x0220, B:163:0x024c, B:161:0x0228, B:162:0x023a), top: B:201:0x020d }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x045d  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r44) {
        /*
            Method dump skipped, instruction units count: 1121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.activity.HRRewardVideoPlayerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        baseFullScreenVideoAdList.clear();
        rewardMediaViews.remove(this.localAdId);
        C0511g.c.f151a.m44a(this.shakeId);
        downloadBean = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        for (int i = 0; i < baseFullScreenVideoAdList.size(); i++) {
            IAd iAd = baseFullScreenVideoAdList.get(i);
            if (iAd != null) {
                this.touchContainer.setTouchPositionListener(new TouchPositionListener(iAd));
            }
        }
    }
}
