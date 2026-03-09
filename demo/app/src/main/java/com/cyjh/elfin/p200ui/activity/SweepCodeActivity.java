package com.cyjh.elfin.p200ui.activity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.foundation.p138h.C1879m;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.cyjh.common.base.activity.BaseActivity;
import com.cyjh.elfin.p200ui.view.customview.TitleView;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.umeng.analytics.MobclickAgent;
import com.ywfzjbcy.R;
import com.zbar.zbar.decode.CaptureActivityHandler;
import java.io.IOException;
import p285z2.C3753c5;
import p285z2.C3964hv;
import p285z2.C4186nv;
import p285z2.C4587yp;

/* JADX INFO: loaded from: classes.dex */
public class SweepCodeActivity extends BaseActivity implements SurfaceHolder.Callback {
    public static final String o00oO0O = "SWEEP_RESULT_BACK";
    private static final float o0ooOO0 = 0.5f;
    private static final long o0ooOOo = 200;
    private ImageView OooooOo;
    private C4186nv Oooooo;
    private CaptureActivityHandler Oooooo0;
    private boolean Ooooooo;
    private MediaPlayer o00O0O;
    private boolean o0OoOo0;
    private boolean ooOO;
    private RelativeLayout OooooO0 = null;
    private RelativeLayout OooooOO = null;
    private boolean OoooooO = false;
    private int o00Oo0 = 0;
    private int o00Ooo = 0;
    private int o00o0O = 0;
    private int o00ooo = 0;
    public boolean oo000o = true;
    private final MediaPlayer.OnCompletionListener o00oO0o = new OooO0O0(this);

    public class OooO00o implements View.OnClickListener {
        public final SweepCodeActivity OoooOoO;

        public OooO00o(SweepCodeActivity sweepCodeActivity) {
            this.OoooOoO = sweepCodeActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = "ۘۗ۬ۜۛ۟۠ۥۚۗۨۗ۟ۤۘ۠ۤ۫ۘۜۨۘ۬ۢ۫ۡۧۛۨۢۥۚۡۨۗۥۘۙ۫۫ۚۙۚۚۜۦۙۗ۟۬ۙۘۜۨۥۘ";
            while (true) {
                switch ((((str.hashCode() ^ 516) ^ 690) ^ 838) ^ (-1982340794)) {
                    case -858732236:
                        str = "۠ۗۘ۫ۘۚۜۜۦۘ۫ۧۛۖۗۗۙۗۖۦۘۘۗۙۘۚۨۘ۬ۤۜۗۦۘۚۥۘۘۜۚ۠ۨۥۗۙۤۚۡۗ";
                        break;
                    case 270917776:
                        this.OoooOoO.OooOOo0();
                        str = "۫ۨۡۚۗ۫ۥۘۧۚۧۘۘۛۜ۟ۙۨ۬ۦۚۗۘ۬ۤۦۧ۠۬ۚۤۙۤۜۘۡۧۛۥ۟ۦۤ۟ۜۘۛۘۥۘ۫ۢۘۘۢۖۦۘ۬ۗۙ";
                        break;
                    case 1484742997:
                        str = "ۛ۫ۨۘۤۨۘۜۧۧ۟ۗۨۘۧۖۜۛۖۜۘۧۜ۠ۡۗۘ۫ۘۦۙ۠ۦۘۙۙۦۘۥۙۖۘ۟ۥۥۦۖۖ۫ۖۖۤۤۗ";
                        break;
                    case 1615205860:
                        return;
                }
            }
        }
    }

    public class OooO0O0 implements MediaPlayer.OnCompletionListener {
        public final SweepCodeActivity OooO00o;

        public OooO0O0(SweepCodeActivity sweepCodeActivity) {
            this.OooO00o = sweepCodeActivity;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            String str = "ۚۢۧ۟۠ۖۜۨۜۢۗۜۘۥۧ۠ۘۨۥۧۘ۟۟ۜۘۙ۠ۜۘۡۢۚۜ۬ۘۧۨۤۘ۠ۜۘۤۚۜۗ۠۫ۛ۬۟ۧۢۘۡ۟ۖ";
            while (true) {
                switch ((((str.hashCode() ^ 94) ^ 729) ^ 286) ^ 552025864) {
                    case -1984068840:
                        mediaPlayer.seekTo(0);
                        str = "ۘ۬۠ۖ۬ۗۜۗۘ۫ۧۦۢۧۙ۠ۘۘۗ۠۟ۧ۟ۖۜ۬ۛۗۤۡۚۚۥ۟ۘۡۘ";
                        break;
                    case -316480057:
                        return;
                    case -109173066:
                        str = "۠ۤۡ۬ۦ۫ۗۧۧۙۗ۫ۢۥ۬۬ۧۜ۠۟ۡۘ۠۟ۛۥۗۜۘۥۜۘۦۨۗۚۘۡۨۡۤ۬ۗ";
                        break;
                    case 962247080:
                        str = "ۛۧۙ۬ۖۗ۠ۙۖۘ۠ۡۖ۫ۙۜۖ۫ۦۡۦۘ۬ۦۚۡ۟۬ۚۥۦ۠ۗۥۜۜ۠";
                        break;
                }
            }
        }
    }

    public class OooO0OO implements TitleView.OooO0O0 {
        public final SweepCodeActivity OooO00o;

        private OooO0OO(SweepCodeActivity sweepCodeActivity) {
            this.OooO00o = sweepCodeActivity;
        }

        public /* synthetic */ OooO0OO(SweepCodeActivity sweepCodeActivity, OooO00o oooO00o) {
            this(sweepCodeActivity);
        }

        @Override // com.cyjh.elfin.ui.view.customview.TitleView.OooO0O0
        public void onClick(View view) {
            String str = "ۚۤۧ۬ۦ۟ۗۧ۫ۙۙۜۘۧۗ۫ۛۢ۟ۚۥ۫ۡۜۘۖۨۨۘۡۜۨۡۤۘۘ۬ۙۚۗۜۧۘۖۚۜۘۜ۬۟ۘ۬ۢ۟۫ۗۡۡۗ";
            while (true) {
                switch ((((str.hashCode() ^ 146) ^ 765) ^ 342) ^ (-1667988375)) {
                    case -2030198893:
                        return;
                    case -1563365511:
                        str = "ۙۨۜ۟۠ۘۖ۟ۗۢ۟ۘۤ۠۫ۢ۬ۘۜۤۥۛۢۦ۟ۙۗۙۢۦ۟۟ۥۚۤۖۘۙ۟ۖۘۤۚۙ";
                        break;
                    case -1450659365:
                        this.OooO00o.finish();
                        str = "ۜ۫ۦ۫ۡۥۘۗۛۤۗۜۘۘۚۘۧۨۗ۬ۡۤ۟ۚۧۢۛۦ۟ۧۘۤۘۘۦۘۚۢۘۚ۬ۤ۠ۧۜۘۛۦۥۘۘۙۦۘۘ۟ۖۘۥ۫۫";
                        break;
                    case -1424681294:
                        str = "ۤۢۦۘۦ۟ۖۘۤۥۜۘۙ۠ۛۗۦۢ۠ۛۢۗ۟ۗ۠۬۫ۡۜۘۘۢۨۘۤۗ۟۟ۖۜۘۖ۬۟ۢۡۛ";
                        break;
                }
            }
        }
    }

    private void OooOOO(SurfaceHolder surfaceHolder) {
        try {
            C3964hv.OooO0O0().OooO0o(surfaceHolder);
            Point pointOooO0OO = C3964hv.OooO0O0().OooO0OO();
            int i = pointOooO0OO.y;
            int i2 = pointOooO0OO.x;
            int left = (this.OooooOO.getLeft() * i) / this.OooooO0.getWidth();
            int top = (this.OooooOO.getTop() * i2) / this.OooooO0.getHeight();
            int width = (i * this.OooooOO.getWidth()) / this.OooooO0.getWidth();
            int height = (i2 * this.OooooOO.getHeight()) / this.OooooO0.getHeight();
            OooOo0o(left);
            OooOo(top);
            OooOo0(width);
            OooOo00(height);
            OooOo0O(true);
            String str = "ۘۥۗ۫۫ۚۘ۬ۡ۬ۙۧۡۢۖۘۖۙۧ۠ۙۨۘۥ۫ۘ۬ۤۨ۠۫ۦۥ۫ۥ۬ۜۦۘۦۨۚۛۤۥۘ";
            while (true) {
                switch (str.hashCode() ^ (-615757885)) {
                    case -1888679713:
                        return;
                    case -68341426:
                        str = "ۦۤۧۡۗۦۜ۫ۡ۠۟۫ۘۦۜ۬ۨۧ۟ۦۜۘۗۚۘۘۛ۟ۨۘۗۗۥۘ۬۫ۥۘۨۧۨۘ";
                        break;
                    case 177408335:
                        this.Oooooo0 = new CaptureActivityHandler(this);
                        return;
                    case 1783010912:
                        String str2 = "ۧۖۧۘۙۨۘۛۗۧ۠ۥۧۧۡۙۚۗۚ۫۠ۗ۬ۡۘۗۨۖ۫ۛۥۚۚۨ۬";
                        while (true) {
                            switch (str2.hashCode() ^ (-743297232)) {
                                case -1997005957:
                                    str2 = "ۖۗۤۙۘۤۥ۬ۡۘۜۚۨۘۚۘۖۘ۟ۘۖۘ۠ۜۦۧۡۦۘۖ۠ۖۘۥ۟ۦ۫ۨۢۦ۟ۜۘۤۧۥ۬۠ۙۙ۫ۗۘۛۜۘۥۚۨ۫ۥ۠";
                                    break;
                                case 693461761:
                                    str = "ۧۜۖۡۗۦ۬ۨۢۖۡۗۚۛۦ۫ۛ۠ۤۖۢۤۥۥۛۨۛۖ۫۟ۙۡۜ۠ۘۘ";
                                    continue;
                                case 884042493:
                                    str = "ۛۡۡۡۧۨۘۦۡۨۖۗ۟ۗۖ۟ۢۦۘۢۘ۠ۘۘۙۚۘۨۘۘۤۥۘۥۜۗۙۖۖۚۛۨۘۤۙ۠ۢۜۦۘۦ۠ۧۚۧۜۡۗ۠";
                                    continue;
                                case 2037776643:
                                    str2 = this.Oooooo0 != null ? "ۜ۬ۗۤۗ۟ۗۛۜۢۧۢ۫۬۠ۙۘۘۗۖۙ۫ۛۗۚ۠ۘۜۚۦۘ" : "ۘۛۗۥ۟ۖۘۛ۬ۗۛۨۚۡۙۘۘۤ۬۟ۤۖۗۗۖۢ۟ۖۜۘۘۜۜۘۜ۠ۗۗۧ۫ۦ۟ۨۘۧۘۡۘۥ۟ۨۘOۨ۟۠۫۠";
                                    break;
                            }
                        }
                        break;
                }
            }
        } catch (IOException e) {
        } catch (RuntimeException e2) {
        }
    }

    private void OooOOO0() {
        String str = "ۗ۟ۥۢۘۘ۬ۚ۬ۤۘۨۢۘۦۗۚۖۢۖ۫ۙۢۙۡۡ۟ۧ۟ۦ۟ۜۢۧۜۗۨۙۖۘۨ۫ۘۦۘۨۘۙۜۜ۬۟ۖۜۘۢ";
        while (true) {
            switch (str.hashCode() ^ (-1009679723)) {
                case -962964857:
                    String str2 = "۠ۧ۫ۚ۟ۙۢۤ۬ۜ۫۬ۙۛۥۘۘۚ۬ۛۚۨۘۡۘۜۚۦۧۘۘۜۧۤ۠۠۟ۡۘ۫۬ۘۘۗۘۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1605275067) {
                            case -1651896293:
                                setVolumeControlStream(3);
                                MediaPlayer mediaPlayer = new MediaPlayer();
                                this.o00O0O = mediaPlayer;
                                mediaPlayer.setAudioStreamType(3);
                                this.o00O0O.setOnCompletionListener(this.o00oO0o);
                                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = getResources().openRawResourceFd(R.raw.beep);
                                try {
                                    this.o00O0O.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                                    assetFileDescriptorOpenRawResourceFd.close();
                                    this.o00O0O.setVolume(0.5f, 0.5f);
                                    this.o00O0O.prepare();
                                    return;
                                } catch (IOException e) {
                                    this.o00O0O = null;
                                    return;
                                }
                            case -111222497:
                                str2 = "ۜۨۤۥۢۡۘۘۦۘۧ۫ۨۘۖ۫ۤۨۖۚۙ۬۫ۨۨۧ۟ۛ۟ۜۥۘ۬ۤۜۘۘۛۜۡۗۨ۫۠ۥۖۥۤ۟ۡۖۘ";
                                break;
                            case 1443921565:
                                String str3 = "ۨ۫ۖۘۜۖۧۙ۠ۛ۠ۦۥۨۦ۟ۥۤۦۘۨ۬ۚۨۘۡۘۧۧۥۘ۫۠ۙۨ۠ۨۢۥۛ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-751219523)) {
                                        case -2069479642:
                                            str3 = this.o00O0O != null ? "ۦۛۛ۠ۘۥ۫ۙۘۘۧ۠ۧۗ۫ۘۘۡ۬ۦۘۗۙۤۗۖۘۚ۟ۗ۟۬ۢ۠ۙۢ۟ۛ" : "۠ۤۖ۟ۘۜۘۨۦۜۦۤ۠ۖۖۖۘۤۗۘ۬ۦ۬ۡۗ۬۫ۘۘۚۛ۬ۥۘۥۘۛۘۘ۬۫ۥۘۧۜۦۘۡۢۖۘۙۡۦ۠۫ۖۘۗۜۖ";
                                            break;
                                        case -960547268:
                                            str2 = "ۥ۬ۨ۟ۚۨۘۙۡۦ۫ۘۘ۟ۦۥۢۤۦۛۖۘۢۖۢۦ۠ۚۘۘۧ۫۫ۚۥۦۘۧۘۡۘۙۘۨۘۤ۫ۨۘ۠ۙۛ";
                                            continue;
                                        case -183699898:
                                            str3 = "ۦۖۘۦۢۚۤۜۖۘ۟ۖۧۥۙ۟ۖۡۥۖۤۨۖۙ۫۬ۗۡۥۦۢۧۤۥۘۜۗۦۡۡۘۘۥۙۛ";
                                            break;
                                        case 431134025:
                                            str2 = "۟ۘۨۧ۬۠ۗۨۤ۟ۙ۫ۢۨۡۘۘۖۘۘ۟ۜۖۜۛۚۘۧۨۘۗ۟ۦۘ۫ۢۜۙۢۙۥۨۛ۬۬ۡۘ";
                                            continue;
                                    }
                                }
                                break;
                            case 1454887259:
                                return;
                        }
                    }
                    break;
                case -67869295:
                    return;
                case 1329618577:
                    str = "ۘۚۥۤۥۧۦۗ۫ۗ۠ۡۘۦ۬ۡۢۤۡۘۖۡۘۘۗۨۛۚ۬۟ۗۘ۫ۚۚۨۛ۟ۧۛۧۨۘ۠ۖۛۤۥۖۖۢ";
                    break;
                case 2000829934:
                    String str4 = "ۖۧۙ۠ۜۨۘۤ۟۟ۦۥۘۤۥۘۗۗۡ۠ۘۘۡ۬۫ۤۦۢۖۛۨۘ۟ۢۡۘۤ۫ۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 737395492) {
                            case -1964264788:
                                str = "ۜۖۙۛۢۦۧۨۛ۟ۘۜۘۜ۬ۧۦۥۡۗۤۡۘۚۗۜۦ۬۠ۜۘۨۘ۬ۨۚۡۜۘ";
                                continue;
                            case -1752348375:
                                str4 = "۬ۖ۟ۧ۟ۤۨۢ۠ۧ۬ۡۘۢۨۤۤۧۘ۠ۘۦۦۦ۫۫ۦۢۨۥۧۙۥۘۦ۫ۡۘۦۥ۫ۗۡۘ";
                                break;
                            case -1214082863:
                                str4 = !this.o0OoOo0 ? "۟۬ۦۦۜۡۧۗۘۘ۬۬ۙۖۡۖۨۦۘۘ۫ۦۧۙۘۤۡۙۢ۬ۛ۠ۜۜۜۨۘۤۥۜۘۜۥۥۘ" : "۟ۗۜۜۖۚ۠ۡۗۡۨۛۡۥ۬ۚۘۘۘۦۘۤ۠ۜۘۧۛۖۘ۟ۥۨۘۗۨ۠ۤ۫ۜۨۢۛۧۛ";
                                break;
                            case 916495575:
                                str = "۬ۤ۫ۢ۠ۥۗ۟ۥۘۤۥۡۘۙۙۥۘۘ۠ۡۨۙۨۘۤۨ۬ۖۘۘۘۗۙۜۥۘ۬ۙۘۡۥۨۘۤۛۗ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    private void OooOOOO() {
        OooO00o oooO00o = null;
        String str = "۬ۧۡ۟ۚ۫ۤۨۨ۫ۢۘۘۛۨ۬ۜۥۡۘ۠۬ۗ۫ۖۧۙۙۥۤۖۘۡۢۜ۫ۢ۬ۘۛۜۡۤۖۘ";
        TitleView titleView = null;
        while (true) {
            switch ((((str.hashCode() ^ 491) ^ 433) ^ 992) ^ 1577876258) {
                case -499657853:
                    titleView.setleftImage(R.drawable.ic_back);
                    str = "ۜۡۢ۠ۡۜۘۦ۟ۢ۬ۘۜۘۚۘۢ۠ۜۧۛۚۖ۠ۥۢۘۜۖۘۘۛۘۦۥۜۥۖۜۨ۟ۖۚۦۜۢۖ۟ۧ۟ۙ";
                    break;
                case 43485445:
                    titleView.setVisibilityRightImage(4);
                    str = "ۨۡۗۦۡۨۧ۠ۖۘۚ۬۟ۙ۠ۦۘۜۚۜۢۗۨۘۤۘ۫ۧۗۡۜۗۙۜۤۢۧۛۥۢۙۜۘۘۦۙۗۦۢۥۘۜۛۨۖۢۜۤ";
                    break;
                case 470477596:
                    str = "ۖۨۦۘ۬ۤۡۖۜۘۘۖۤۜۢ۟ۨۘۢۨۜۘۛۚۧ۠ۢۛۦۘۘۚۨۤۙۛۘۡ۟ۥۢۢۘ۠ۧۡۘۗۙۡۘۡۥۘۛ۠ۢۜۦۘۘ";
                    break;
                case 1051355448:
                    titleView.setOnLeftImageViewListener(new OooO0OO(this, oooO00o));
                    str = "ۢۥۧۧۗ۟ۧۨۥۘۦۜۙۨۜۛۘۦۘۨۚۤۖ۠ۖۘ۫ۤۙۡۖۗۚۥۧۗۦ۬ۛ۟ۘۘۤ۟۬";
                    break;
                case 1470647834:
                    titleView.setTitleText(getString(R.string.sweep_code_register_code));
                    str = "ۖ۫ۧ۬ۜۜۘۦ۟ۡۘۗۛۨۨ۠ۛۗ۫ۦۘ۟ۨ۬ۗ۬۠ۙۗۨۘۚ۟۫";
                    break;
                case 1672698342:
                    str = "ۥۗ۟ۨ۟ۛۜۢ۬۫۠ۙ۠ۤۖۨۨۢۖۦۦ۫ۘۚۛۛۥۖ۟۟ۗۦۦۤۦۡۘۖۥۘۛ۠ۜۨۘۛ۠ۨ";
                    titleView = (TitleView) findViewById(R.id.id_title);
                    break;
                case 1708983211:
                    return;
            }
        }
    }

    private void OooOOo(String str, Bitmap bitmap) {
        String str2 = "ۙ۠ۢۡۗۥۘۛۖۘۧۡ۠ۗۨۨ۫ۚۤۘۚۚ۬ۖۚۡۗۤۤۜۧۘۗۙۗۧۡۡۘ۬۫ۨۗۜۡۚۦۡۖۨۘۗۜۢ۟ۖ۟";
        while (true) {
            switch ((((str2.hashCode() ^ 760) ^ 38) ^ 879) ^ (-1196532303)) {
                case -1292518638:
                    Toast.makeText(this, "Scan failed!", 0).show();
                    str2 = "۫۬ۨۖۦۜۘ۬ۖۨۛۘۖ۠ۜۢ۫۠۬۠۫ۛۨۗۚۗۙۜۧۨ";
                    break;
                case -885193855:
                    str2 = "ۙۜۡ۠ۛۢۢۤۘۘۤ۟۠ۚۙ۟ۤۖۖۘۘۖۘۦ۫ۘۘ۟ۦۥۘۚ۠ۘۘۧۗۘۡ۫ۙۛۡۖۛۡ۫ۜۗۦ۠ۖۘ";
                    break;
                case -366041823:
                    return;
                case 178220938:
                    str2 = "ۥۚۜۘۛۨ۠ۖ۟ۜ۠ۢۥۙۡۙ۫ۛ۠۫ۨۙۥۙۨۘ۠۬ۖۢۥۛۧۦۦۘ۫۫ۛ";
                    break;
                case 1214475544:
                    str2 = "ۧۤۧۡۥۡۘ۠۬۫ۥۚ۬ۜۘۘۘۖۚۧۨۥۨۥۥۡۘۦۨ۠ۦۘۜۘ۫ۡۡ۠ۥ۫ۙۙۨۜ۟ۡۙۨۘ۠ۚۨ";
                    break;
                case 1445666221:
                    String str3 = "ۜ۟ۧۚ۟ۖۨۤ۠ۛ۫ۦ۫ۦۨۧۚۜۧۡۘۛۛۤ۫ۛۘ۫ۢۚۙۦۨۘۢ۟ۛۖ۟۟ۤۗۦ۫۟ۡ۬۠ۥ۠ۖۧۢۦۨ";
                    while (true) {
                        switch (str3.hashCode() ^ (-2025765375)) {
                            case -1292643156:
                                str2 = "۫۬ۨۖۦۜۘ۬ۖۨۛۘۖ۠ۜۢ۫۠۬۠۫ۛۨۗۚۗۙۜۧۨ";
                                continue;
                            case -660068808:
                                String str4 = "ۚ۫ۖۘ۟ۥۙۨۖۧۘۢۤۖۗۨۚۤۥۧۘۛۛۢۖۤۥۨۙۛۦۡ۬";
                                while (true) {
                                    switch (str4.hashCode() ^ (-1785619475)) {
                                        case -1708975030:
                                            str3 = "ۦ۬ۥۘۨۢۚۖۧۢۛۙۦ۫ۖۙۛۤۘۦ۫ۜۘۘۘۧۜۙۡۘۖۨ۫۬ۖۧۘ۬ۥۤۤۢۘۢ۬۟";
                                            break;
                                        case -1147716421:
                                            str4 = "۬۫ۦۜۨۚۜۧۗ۫۬ۡۘۢۖ۬ۦۢ۠ۥۗۦ۬ۦۘ۬ۜۡۘۡۢۥۘ";
                                            break;
                                        case 359946895:
                                            str4 = TextUtils.isEmpty(str) ? "۟۟ۨۦۦ۫۫ۨ۠ۙۥۧۘۘۥۚۜۖۖۘۖۢ۠ۧۚۡۘۗۢۤۧۥۥ۠۟ۚۜۦۧۘۛۢۤۢۢۧ۬۫ۖۘۜۡۨۘ" : "ۙ۟ۜ۟ۥۧۨۙۗۛۚۤ۬ۤۡۘۡۥۥ۫۠ۡۘۛۡۗ۟ۨۛۦۥۥۘ";
                                            break;
                                        case 1493455907:
                                            str3 = "ۨۤ۠ۘۨۚۨۧۘۜۥۧۦۡۥۡۖۛۦۥۘۗۡۘ۫۠ۜۘ۠ۧۦۤۥۜۘۜۢۛۤۚۦۤ۠ۡ";
                                            break;
                                    }
                                }
                                break;
                            case -297370534:
                                str3 = "۟۟ۖۘۨۦۗۥۧۘۢۦۥۘۧۦۡۦ۬ۜۢۗۚۛۦۤ۠ۘۜۘ۠ۥ۟ۢۙۥۘۦۛ۟ۜۗ۬ۧۖۜۘۗۧۘۘۦۙ";
                                break;
                            case -100101658:
                                str2 = "۟ۜۦۘۗۡۚۡۛۖۨ۬ۘۘۡۢ۟ۛۢۖۘۙ۠ۢۨۦۘۧ۠ۨۙۘۘۘۛۚۚ۫ۥۗۛ۬۟ۗۢۖۘ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    private void OooOOoo() {
        MediaPlayer mediaPlayer = null;
        String str = "ۧۨۚۗ۠ۡۘ۫ۙۖۚ۬ۘۘۥۘۢۙۜۘۜۦۘۢۥۥ۫۬۫ۗۦ۟ۗ۬ۧۙۡۨ";
        while (true) {
            switch ((((str.hashCode() ^ 449) ^ 969) ^ 963) ^ 2123197718) {
                case -1790735547:
                    mediaPlayer.start();
                    str = "۠ۖۨۥۘ۠ۛۦۢۗ۟ۤۤ۬۬۠ۗۗۢۖ۟ۢۤۚ۫ۢۦۘۡۛۘۧ۬ۢۜۘۤ۠۬ۦۜۖۘ۟۫ۛ۬ۘۛ۫ۧۚۘۖۘ";
                    continue;
                case -437707918:
                    String str2 = "ۛۛۚۡۖۜۘۚۨۜۘۢۖ۫ۨۧ۬ۡ۠ۨ۟ۨۖۘ۠۫ۗۡۦۦ";
                    while (true) {
                        switch (str2.hashCode() ^ 1060656696) {
                            case -1554568410:
                                String str3 = "ۖۘۦۘۡۢۦۢ۫ۖۗ۬ۡۘۖۛۡۤۤۡۜۚۛ۟ۘۤۙۜ۬۠۟ۙۘۜ۬۫ۦ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1261394351) {
                                        case -721537804:
                                            str3 = "ۖ۟ۜۘۙ۟ۙ۟ۘۢۗۗ۟ۤۤۤ۠ۜۘۘۗۡۦۦۘۜۛۖۧۥ۫ۡۘۢۜۖۘ۬ۢ۫ۗۜۥ";
                                            break;
                                        case -505342650:
                                            str2 = "ۨۡۗ۠ۜۦ۬۟ۙۧ۫۟ۖۖۜ۠ۨۖۥ۫ۥۗۢۗ۫۫۟ۘۡ۟ۗۧۚۨ۬ۧۢۧۖۗ۠۬ۜۜۡ۟ۛ";
                                            break;
                                        case 52860280:
                                            str3 = mediaPlayer != null ? "ۨ۠ۗ۫ۗ۟ۘۖۢۥۥۤۙۗۘۘۢ۫ۙ۫ۥۖ۬۟۠ۗ۟ۥۡۖۢ۠ۛ۫۬ۘۘ" : "ۚ۫ۦۘۡۜۗۢۢۜ۫ۙۙۜۥۥ۬ۨۨ۬ۢۥ۟ۗۗۦ۟ۖۘۥۦ۠ۖۚۘۘۡۤ۬ۜ۬ۚ۫ۜۡۘ";
                                            break;
                                        case 1784723401:
                                            str2 = "ۛۨ۟ۛۢۜۘۗۖۘۢۖۜۘ۬ۢۖۡۥۖۚۗۨۥۨۙۘ۠ۤۥۨۖۘۧۖ۠ۗۨۨۘۦۨۙ۬۫ۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case -120259750:
                                str = "ۨۤ۠ۜۗ۬۬ۤ۬ۨۡۦۘ۫ۙۥۘۛۡۖ۠ۖۦ۫ۜۜۡۢۘۘۧ۬ۘۘۡۜۘۘۨ۠ۨۘۚۦۖۘۡۡۨۘۧۢ۠۟ۤۛ۠ۚۢ";
                                break;
                            case 619683363:
                                break;
                            case 690889279:
                                str2 = "ۨۚۛ۟ۦۢۚ۠ۦۘ۟ۘۤۛ۫ۨۜۥۢۛ۫ۨۘۛۚۖۘۤۢۗۦۚۥۘۨۚۧۛۗ۟ۜ۫ۜۘۜۦۚ۫ۤۨ۠ۖۦۘۢۖۜۘۦۛۤ";
                                break;
                        }
                    }
                    break;
                case -370792462:
                    str = "ۧۤۜ۟ۛ۫ۗۥۘۥۚ۟ۘۡۤۤۨۦ۬ۛۗۛۨۜۘۤۘۖۜۡۥۘ";
                    continue;
                case 1480237226:
                    String str4 = "ۧۥ۠ۢ۬ۚۗۥۙ۠۟ۦۙ۫ۘ۬ۡۤۘۦۛ۠۫ۘۚ۟ۙۘۖۥۨۘۖ۬ۡۘ۟ۤۡۘۗۗۥ۫۬ۨۘۚۘۘۘ۬ۥ۠۫۫ۘۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1756091933)) {
                            case -1998197825:
                                str4 = "ۛۨۖۘۦ۬ۘۘۧۚۛۥۢۧۛۙۜ۫ۨۨۘۦۦ۫۟۬ۨۘۙۚۨۢۡۛ";
                                break;
                            case -753655574:
                                str = "۟ۘۜۨۦۘۘۤۜ۬ۚ۟ۦۨۧۨۘۖۤۢۤۡۘۢۙ۟ۤۜ۫ۧۥۤ۠۫ۦۙ۠ۥۦۡۥۡۦۨۘۥ۫ۡۢ۫ۗ۟ۜۙۙ۠۫";
                                continue;
                            case -678206287:
                                String str5 = "ۡۧۥۘ۠ۗۨۘۘۚۢۘۘۜۘۖ۫۫ۘۚۦۛۙۨۘۤ۬ۡۘۡۢ۫ۜۦۧ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-81250080)) {
                                        case -1606718053:
                                            str5 = "ۥۚۢۜۙۤۤۖ۟۬ۜۖۘۡ۬ۧۥۜۖۘ۫۫ۢۖۜ۬ۛۨۥۘۛۥ۫ۛۜۡ۬ۧۧ";
                                            break;
                                        case 517557474:
                                            str4 = "ۗۘۢ۬ۦ۬ۜ۟ۢۖۖۡ۫ۥۘۢۖۖۧ۬ۦۤۛۤۛۤۘۘۚ۫۟ۗۘۨۘۖ۠ۚۘۥۘ۟ۖۥۘ۫ۦۨۘۛۥۗ۫ۛۦۨۛ";
                                            break;
                                        case 1088474681:
                                            str4 = "ۦۗۤ۬۟۟ۜۙۗۤۖ۬۬ۥۨۘ۠۫ۢ۫۫ۛ۠ۗۡۘۤۥۦۖۘۗ۠ۜۛۥۦ";
                                            break;
                                        case 1997191402:
                                            str5 = this.ooOO ? "۫ۢۢۦ۟ۘۘۥۦۘۥ۟۬ۧۙۨۚۧ۬ۖۗۨۘ۬ۚۥۘۘ۠ۡۡۧۦۤۦۢۡۦۥۘ۫ۘ۠ۖۙۜۘ" : "۬ۚۘۛۜۘۤ۫ۖۙۚۥۤۖۜۘۘۚۜۘۧۥۜۡۤۛۡ۠ۢۙۜ۟ۨۗۖۖۨۘۙۨۦۘۘۙۤ";
                                            break;
                                    }
                                }
                                break;
                            case 2013603036:
                                str = "ۘۥۧۙ۫ۖۧۖۤۖۥۨۘۧ۬ۨۘۛۦۥ۫ۥۘۘۤۤۦۧۧۘۚ۫ۧۧۦۡۢۙ۠ۧ۫ۨ۬ۗۡ۫ۡۘۡۛۘ";
                                continue;
                                continue;
                        }
                    }
                    break;
                case 1487322015:
                    mediaPlayer = this.o00O0O;
                    str = "ۜۧۦۧۜۧۢۥۜۘۜ۟۫ۚ۫ۨۚۗۜ۬ۢ۠ۗۖۖۢۨۨۘۘۢۥۘۦ۫ۙۗۧ۬ۡۙۜ۬ۗ۬ۗ۟۫ۚۢۛ";
                    continue;
                case 1645525209:
                    return;
                case 2055586589:
                    ((Vibrator) getSystemService("vibrator")).vibrate(o0ooOOo);
                    str = "ۘۥۧۙ۫ۖۧۖۤۖۥۨۘۧ۬ۨۘۛۦۥ۫ۥۘۘۤۤۦۧۧۘۚ۫ۧۧۦۡۢۙ۠ۧ۫ۨ۬ۗۡ۫ۡۘۡۛۘ";
                    continue;
                case 2080584413:
                    String str6 = "۬ۙۦۖۡۧۘۨۨۡۛۛۡۘۛۙ۬ۗۨۙۨۗۨۘۖۢ۠ۛۢۗ۠ۖۙۧۛۦۜ۫ۧ۟ۗۘۗ۬ۜۘۡۡۧۘۛۦۚۛۖۥۢ۟ۥ";
                    while (true) {
                        switch (str6.hashCode() ^ 76424538) {
                            case -1816781466:
                                String str7 = "ۧۥۙۘۜۡۘۧۤۜۢۨۡۧۚۡ۠ۢۦۘۗ۟ۛۜۖۥۧۦۘ۫ۛۤۜۦ۫ۜۙۦۚ۠۬ۖۤۜ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-1613664124)) {
                                        case -2005402473:
                                            str7 = this.o0OoOo0 ? "ۖۚۜ۟ۗۥۘۦۛۢۡۧۡۥۨۜۘۡ۫ۙۦۦۤۤ۠ۘۘۜۗۛۥۨۙ" : "ۘۢۘ۠ۜ۠ۧۢۚ۫ۖۨۘۡۖۧۖۚۦۘۜۜۦۘۨۘ۠۬ۗ۠ۚۙۥۢۤ۟ۜ۫ۥ۬۫ۗۢۚۖۘ۟۬۟۟ۤۚ";
                                            break;
                                        case -511237675:
                                            str6 = "ۙۧۖۧۙۨۗۤۦۖۥۗۨۚ۫۫ۗۧۖۧ۫۟۬ۡۘۘۚۗ۠ۛۙۖۦۚۤۦۜۘۜۙۜۜۘۜ";
                                            break;
                                        case -59350893:
                                            str7 = "ۡۨۖۖۥۤۢۖ۟ۖۦۗۧۘۛۥ۫ۨ۬۫ۜۘۦۘۚ۫ۘ۫ۛ۬ۖ۟ۢۜۘ۠ۗۗۖ۟ۖ۬ۥۥۘۡ۬ۨۘۦ۬ۨ";
                                            break;
                                        case 1317278993:
                                            str6 = "۟ۢۜۘۛ۫ۘ۬ۜۦۧ۫ۙۜۜۜ۠۟ۛۘ۫ۖۘۙۨۜۘۥۚۜۘۗ۫۟۫۠۬ۜ۬ۛ";
                                            break;
                                    }
                                }
                                break;
                            case -1703349349:
                                break;
                            case -742883880:
                                str = "۟ۦۡۘۤۨۖۘ۠۬ۥۦۢۥۘۖۚۦۢۦۖۘۥۙۛۦۛۡۗۚۥۘ۫۬ۖۘ";
                                break;
                            case -544880196:
                                str6 = "ۛۢۨۘ۠ۡۘۨۢۢۨۜۤۘۜۛۢۤۙ۠ۥۥۖ۬ۨۥۨۖۘۖۖۤۛۡ۠ۚۗۥۤۦۙ۟ۦۡۘ";
                                break;
                        }
                    }
                    break;
            }
            str = "۠ۖۨۥۘ۠ۛۦۢۗ۟ۤۤ۬۬۠ۗۗۢۖ۟ۢۤۚ۫ۢۦۘۡۛۘۧ۬ۢۜۘۤ۠۬ۦۜۖۘ۟۫ۛ۬ۘۛ۫ۧۚۘۖۘ";
        }
    }

    private void OooOoO0() {
        String str = "ۦۦۡۘ۟ۗۡۘۗۙ۫ۤ۫ۤۛ۫ۘۢۖ۟ۛ۠ۗ۟ۚۤۡۦۥۘۡۦۧۘۛۗ۟ۤ۟ۖۘۡۥۡۡ۫ۥۘۧۡۚۘۜۦۦۖۥۛۜۚ";
        CaptureActivityHandler captureActivityHandler = null;
        while (true) {
            switch ((((str.hashCode() ^ 510) ^ 3) ^ 846) ^ (-1848261988)) {
                case -2041026190:
                    C3964hv.OooO0O0().OooO00o();
                    str = "ۧۨۨۘۖۜۥۗ۫۟ۜۥۤۢ۬ۤۗۨۦۘۛ۠ۖۘۖ۟ۦۘ۟ۥۛۙۨۚۤۡۘۢ۠ۛۧۜۙۡۙۖۤ۟ۙۖۜۡ";
                    break;
                case -1827064199:
                    captureActivityHandler = this.Oooooo0;
                    str = "ۚ۠ۨۧ۬ۖۘۖ۫ۥۘۜۛۘۘۚۨ۠ۦۢۗۤۨۚۧۛ۬ۗۢ۠ۗۢۚ";
                    break;
                case -1707288840:
                    captureActivityHandler.OooO00o();
                    str = "ۢۚ۫ۢۗ۟ۗۚ۠ۛ۟۟ۢ۫ۘۘۨۜۨۤۚۛ۟۫ۚۖۘۖ۟ۦ";
                    break;
                case -55538465:
                    return;
                case 220481389:
                    str = "ۧۗ۫۟ۢۨ۬ۚۨۘۗۛۨۘ۠ۦۡ۫ۧ۠ۧۗۢۖۤۗۜۡۜۘۧۛۧ";
                    break;
                case 524251066:
                    String str2 = "ۘۖۨۤۛۚۘۢۖۢ۟ۥ۟ۘۨۘۡۛ۫۟ۙۤۜۛ۠۫ۨ۬۠ۤ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 492147897) {
                            case -1379897474:
                                str = "ۛۤۙ۟۠۬۫ۨ۫ۨ۬ۚ۠ۗۦۛۢۥۘۜۢۦۢۦۦۖۛۘۨۘۘ۟ۗۚۘۢۦۘۗۥۢۧۛۜۘ۫ۗۘۘۡ۟ۨۘ";
                                continue;
                            case 1158491483:
                                str2 = "ۤۛۥۖۢ۬ۡۤ۫ۚ۠ۨۘ۟ۧۜۙۜۨ۟ۡۧۤۢۙۨۙۙۦۘۖۖۧۘۘۨۘۧۨۨ۠۠ۢۤۚۖۛۧۦۘۨۡۨۚۢ";
                                break;
                            case 1981706621:
                                str = "ۢۜۚۥ۠ۡۘۛۥۖۘۛۦۦ۟ۖ۫۠ۦۨۧۧۚۥۛۖۘ۠۬ۧۨۡ۬ۥۙۙۘۚۥۘ۬ۦۡۙۥۛ۬ۥۜۘۘۥۜ";
                                continue;
                            case 2107960079:
                                String str3 = "ۛۘۥۘۤۦۘ۠ۥۧۘۜۜۦۘۧۦ۠ۙۥۚۖ۟ۖۘ۟ۧۖۘۗۥۛۡۥۜ۫ۢ۬ۗۛ۠ۖۤ۠ۢۤ۟ۨ۫ۜۦۧۘ۠۬ۢۤۨۜۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1645948328)) {
                                        case -685357613:
                                            str2 = "ۚۚۙ۬ۤۛۢۢۡۤۢۤۤۛۡۥۖۘۗ۫ۦۛ۟ۤۥۥۜۦۜۥۘ۠ۚۘۘۢ۟ۦۚۡۛۦۖ۫ۖ۠ۢۗۙۖ";
                                            break;
                                        case 602517698:
                                            str3 = "ۘۗ۫ۛۡۛۚۡۢۛۥۘۘۜ۟ۛۙۨ۬ۙۤۤۤۛۘۘۜۧۜۘۢۤۡۘۘۦۘۤۘۙۙۛۢۨۨۘۚۗۦۙۨۤ";
                                            break;
                                        case 888391990:
                                            str2 = "۟ۦۖ۫ۥۤۘۘۘۘۖۘۥۨ۠ۜۚ۫۟ۨۖۧۘۚۨۦۡۖۧ۫ۜۘۡ۬ۥۘ۟ۜۙ";
                                            break;
                                        case 2056975603:
                                            str3 = captureActivityHandler != null ? "۠ۛۨۛۘۧ۫۟ۨۘ۬۫ۖۘ۠ۚۖۦۢ۠ۥۛ۠ۛۤۛۡۜۗۧۛۜۘ۟۬ۥۘۙۢۡۘ" : "۠۠۬۫ۗۡۜۨۨۘۡ۬۟ۜۨۦ۠ۦۡۢۤۚۘۤ۫ۘۙۖۜۦ۠۬ۢۙۚۡۘ۠ۜۘ۫ۦۢۘۙۙۗ۫ۥ۫ۙۖۘۥ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 759870611:
                    this.Oooooo0 = null;
                    str = "ۛۤۙ۟۠۬۫ۨ۫ۨ۬ۚ۠ۗۦۛۢۥۘۜۢۦۢۦۦۖۛۘۨۘۘ۟ۗۚۘۢۦۘۗۥۢۧۛۜۘ۫ۗۘۘۡ۟ۨۘ";
                    break;
            }
        }
    }

    private void initView() {
        String str = "۫ۗۗۨۥۗۥ۬۫ۨۜۜۘۜۥۥۘ۬ۧۘۙ۟۟ۢۖۙۜ۬ۦۖۚ۫ۘۜۡۘۦۧۚۙۛۗۙۚ";
        TranslateAnimation translateAnimation = null;
        int i = 0;
        RelativeLayout.LayoutParams layoutParams = null;
        int i2 = 0;
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_FW_TEXT_SIZE_VALUE) ^ 648) ^ 389) ^ 930202127) {
                case -2094534108:
                    str = "ۤۖۜۢۜۤۤۛۦۤ۫ۦۘۛۛۘۗۚ۫ۜۨۧۙۚۙ۟ۨۘۤۘۥۧۘۥۘ۫ۖۧ";
                    break;
                case -1935475957:
                    str = "ۨۥۜ۬۟ۦۢ۠ۜۘۙۙ۬ۜۢۦۛۜۖۤۖ۠ۧۘۘۘ۬ۦۙۚۗۢۖۖۢۛۤ۟ۥ۬ۗۢ۬ۚۖۜۖۧۦۨۘۚۨۥۗ۬ۘۘ";
                    layoutParams = (RelativeLayout.LayoutParams) this.OooooOO.getLayoutParams();
                    break;
                case -1735129222:
                    ((LinearLayout) findViewById(R.id.linear_open_light)).setOnClickListener(new OooO00o(this));
                    str = "ۨۤ۬ۤ۫ۢۨۨۘۜۢۤۦۗۜۘ۟ۧ۬ۡ۟ۡۧۡ۫ۨۤۚۧۡ۬ۢۨۖۘۧۢۖۜۧ۠ۡۙۘۘ۟ۗۨۘۧ۬ۚ";
                    break;
                case -1574570251:
                    translateAnimation.setRepeatMode(2);
                    str = "ۜۧۡۘۙۛۗۡ۟۫ۜۘۡۘۚ۠۫۠ۙۖۙۙۢ۠ۘ۫۠۠ۖ۟۟ۜۘۜۘۧۨۙۥۗۤ۬ۡ۬ۡۤۛۢ۟۠ۦۜ۬ۧۨ۟ۚ";
                    break;
                case -1560728888:
                    translateAnimation.setDuration(1500L);
                    str = "ۢ۠۬ۛۦۨۘۨۢ۬ۧ۫ۖۨۚۘۘۦۨۨۧۡۙۖۡۛۜۧ۬ۡۢۤۥۘۢ۫ۨۘۦ۠ۛۦۗ۬";
                    break;
                case -1161597126:
                    this.Oooooo = new C4186nv(this);
                    str = "ۤۚۦۧۖۧۘۢۨۢۙ۬ۦۜۘۖۖ۟ۜۘۧۗۗۙۥ۠ۤۙ۠ۚۖۙۖۖۨۜۡۘ";
                    break;
                case -1156811436:
                    C3964hv.OooO0Oo(this);
                    str = "۟ۙۨۥۦۛۤ۫ۤ۠۬ۧۨۥۘ۫ۜ۟ۢۜۥۘۡۗۢۥۚۛۚۨۡۘۢۜۥۘۗ۟ۤۤ۟۬ۖ۠ۖۙۚۨۚۦۛ";
                    break;
                case -917801730:
                    return;
                case 31308853:
                    this.OooooOO.setLayoutParams(layoutParams);
                    str = "۫ۘۜ۟ۨۦۘۢۢۨۘ۬ۥۨۦۧ۟۬ۨۘۗۚۡۜۨ۟ۚ۠ۦۚۥۚۙ۫۫ۖۜۦۘۚۖۨۨ";
                    break;
                case 97585994:
                    layoutParams.width = i;
                    str = "ۥۦۢۡۖ۫۬۟ۤۥۢۘ۬۬ۜۘۜ۠ۛۙۚۢۡ۠ۨۘ۠ۖۙۧۘ۠۬۫ۡۛۤۡ";
                    break;
                case 259402147:
                    this.OooooOo = (ImageView) findViewById(R.id.capture_scan_line);
                    str = "۬۟ۗ۠ۜ۫ۘۖۦ۠ۢ۫۫ۘۘۤۖۚۘۙۤۨۦۨۘۤۚۦۦۡۛۗۢۦۘۛ۫ۨۘۚۜۙۡۜۧۘۜۤۖۛۘۘۧۘۥۦ";
                    break;
                case 270883825:
                    translateAnimation.setRepeatCount(-1);
                    str = "۠۟ۨۦۛ۫ۦ۟۟۟ۖ۠ۜ۫ۦۦۜۘۘ۬۠ۤ۫ۚۜۘ۬ۦۗۚۥۗۢ۬ۦۘۧۜ۟ۗۜۘۚۗۤۙۡۘۘ۟ۥۘۙۚۡۜۘۧ";
                    break;
                case 296457655:
                    this.OooooO0 = (RelativeLayout) findViewById(R.id.capture_containter);
                    str = "ۦۧ۟۫ۛۨۘۗۧۦ۠ۜۡ۟ۘۦۘۡۘۨۨۙ۟ۜۜۘۗ۫ۛۥۙ۠۠ۡۘۗۧۥۤۡۤۧ۫ۤۜۜ۫ۢۨ۬۬ۥۢۢۦۥۘ";
                    break;
                case 357642616:
                    str = "ۦۨۘ۠۬ۘۘۛۡۨ۟۠۟ۡۧۤۥۚۜۧۘۢۗۦۘ۟ۥۦۡ۫ۨۜۨ۟ۤ۟ۨۘۜ۟ۦۘ۠ۚۤۜ۟ۧۛۦۘ";
                    translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 2, 0.0f, 2, 0.9f);
                    break;
                case 380624371:
                    this.OooooOO = (RelativeLayout) findViewById(R.id.capture_crop_layout);
                    str = "ۦۖۚۜۧۛۖۢۖۧ۫ۛۙۛۗۧۖۖۖۥۘۦۖ۠ۗۖۧۨۘۘ۬ۖ۟ۘۦۡۙۥۘۤۦۤ";
                    break;
                case 530077606:
                    str = "۬ۨۚۖ۠ۗ۬ۜۘۤۖ۫ۡۚۖۘۦۦۙۨۢۙۛ۫ۢۧۜۛۧۡۨۘ";
                    i = (i2 * 2) / 3;
                    break;
                case 567082871:
                    translateAnimation.setInterpolator(new LinearInterpolator());
                    str = "۟ۛۚ۬ۥۜۛ۫ۨۘ۟ۧۘ۠۠ۨۘۤۡۤۛۗۥ۠ۥۘۥۘۖۥۜ";
                    break;
                case 704093340:
                    this.Ooooooo = false;
                    str = "۠ۤۛ۟ۚۢۥۗۗۡۚۧ۠ۗ۠ۙۜۡۘ۟۠ۦۘۚ۬ۚۤۡۨۡۨۡۘۡۚۦۘۛ۟ۗۛۖۜۘۢۙۦۤۤۘۧۦۘ";
                    break;
                case 1453603349:
                    str = "ۙۢۦۛۡۤۜۡۧۙۚۦۘۨۖۗۚۧۜۘۨۜۨۜۛۦ۫ۖۥ۫ۖۜۨۧ۬ۖۙۤۜۡۚۤۚۤ۬ۧ۬ۚۚۖۘ";
                    i2 = getResources().getDisplayMetrics().widthPixels;
                    break;
                case 1892538705:
                    this.OooooOo.setAnimation(translateAnimation);
                    str = "۬ۥۖۤۛ۠ۢۚۙۗۧۜۗۦۖۖۜۡ۠۠ۤۢ۫۟۠۫ۖۘۥۚۡۘۨ۟ۗۚۛۤۚۛۦۘۨ۬۟";
                    break;
                case 2025311651:
                    layoutParams.height = i;
                    str = "۫ۦ۫ۘۡۗۙ۟۫ۛۘۘۡۗۢۗۡۘۘۧۖۥۚ۬ۤۛۡۙۘۖۨۘۛۚۙۨۛۨۘ۟ۦۛۜ۠ۖۘ";
                    break;
            }
        }
    }

    public Handler OooO() {
        String str = "ۗ۠ۥۘۗۘ۠ۦۥۙ۟ۛۨۗۧۖۡۘۖۡ۟ۛۚۛۥۢۜۙۨۡۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 547) ^ 541) ^ 552) ^ (-251004525)) {
                case -2086616642:
                    return this.Oooooo0;
                case -265768282:
                    str = "ۗۛۥ۠۟۠ۖۙ۫ۙۗۗۚ۠ۦۗۨ۠ۙۜۤ۠۟ۡۗۦۘ۬ۨ۟";
                    break;
            }
        }
    }

    public int OooO0oO() {
        String str = "ۛۡۥ۟ۘۧۘۢۚۜۖۧ۫ۢۜۛ۬ۚۛۙۛ۟ۢۢۛۥۘۛۧۧۚۢۗۘۚۦۘۦۥۨۘ۫ۚۜ";
        while (true) {
            switch ((((str.hashCode() ^ 709) ^ InterfaceC2174a.f13811O) ^ 512) ^ (-1583968627)) {
                case -1392036722:
                    return this.o00ooo;
                case 1519836174:
                    str = "ۛۢۖۘۖۧۜۘۥۧۙۧۦۥۤۢۜۘۛۘ۠ۥ۬۫ۗۤۜۘۜۖۤۘۘۛ";
                    break;
            }
        }
    }

    public int OooO0oo() {
        String str = "ۥ۫ۚۤ۫ۢۘۗۥۧ۟ۛ۬۟ۜۙ۠ۜۥۜۘۨۜۥ۫ۢۥۘۥ۫۟ۖۙۙۗۦۤۢۤ۬ۧۗ۟ۜۢۛۥ۠ۥ";
        while (true) {
            switch ((((str.hashCode() ^ 492) ^ 20) ^ 156) ^ (-2091265300)) {
                case -1666864096:
                    str = "ۧۜۘۤۨۧ۟ۙ۫ۜۖۨۘۛۨۡۘۢ۟ۜۘۢۢۥۢۧۖۘ۠ۜۥۘۥۨۘۘۜۚۗۧۙۡۜۧۜۘۡۙ";
                    break;
                case 882578675:
                    return this.o00o0O;
            }
        }
    }

    public int OooOO0() {
        String str = "۫ۤۖۘۧۥۜۦۢۚۧۧ۬ۜۛۨۘۛ۬ۖۘۤۖۨۘۤ۬ۚۤۦۘۘ۫ۦۘۗۡۡ۟۬۬ۖۢ۫ۚۜۖ";
        while (true) {
            switch ((((str.hashCode() ^ 899) ^ 192) ^ 932) ^ (-1871787062)) {
                case 965443510:
                    str = "۠۬ۜۜۥۧۢۢۙۗ۬ۜۧۨۨۤۢۘۦۧ۠۠ۡۘۘ۟ۙۢ۬۟ۖۘۚۡۥۖۦ۠ۢۚۙۡۧۘۘ";
                    break;
                case 1889385348:
                    return this.o00Oo0;
            }
        }
    }

    public int OooOO0O() {
        String str = "ۨۢۖۘۘ۬ۧۢۤۘۘۡۧۥ۟ۖۦۧۦۘۖۗۨۘ۠ۦۖۥۙ۟ۧۘ۬ۛۨ۟۫ۙۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 110) ^ 374) ^ 84) ^ (-442603292)) {
                case -2130031744:
                    return this.o00Ooo;
                case 1754317436:
                    str = "ۖۙۛۗۜۘ۬ۧ۠ۨ۬ۨۘۨۤۖ۬ۤۚ۬ۧ۬۬ۡۧۤۧۦۡۜ۠۬۟ۛۙۢ";
                    break;
            }
        }
    }

    public void OooOO0o(String str) {
        Intent intent = null;
        String str2 = "ۚۢۚۢۧۜۘۦۥۢۗۖۖۘۛۛ۫ۚۛۗۜۨۜۗۜۘۤ۟ۦۙۦۨۚ۟ۘ۫ۖۧۘ";
        while (true) {
            switch ((((str2.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_IMAGE_VIEW_VALUE) ^ 396) ^ 981) ^ 273270725) {
                case -1901137205:
                    return;
                case -1721346328:
                    String str3 = "ۤ۬ۖۘۙۡۡۘۦۡ۬ۧۢۚ۟ۜۨۘۢۤۜۘۙۤۦۘۛۗۘۘۡۗۤۜۤۢۤۘۖۗۢۦۘۙۥۧۘ۠ۥۘۘ";
                    while (true) {
                        switch (str3.hashCode() ^ (-2021331670)) {
                            case -111422361:
                                str2 = "۬۬ۖۨۖۖۘۜۘۤۦۡۨ۠۠ۘ۠ۜۢ۫۟۬ۙۥۘۖۡۧۘۙۡۦۥ۫ۨۘۜۛۥۘۥ۠۫ۖۦ۠";
                                continue;
                            case 1354578084:
                                str2 = "ۦۤ۟ۡۜۚۢۧۦ۬۠ۨۖۢ۫ۘۗۨۗۥۦۖۚ۠ۤۗۘۡۦۜۘ";
                                continue;
                            case 1449568895:
                                str3 = "ۛ۟ۘۘۥ۫ۢۢۢۗۨۖۡۙ۠ۜۘ۠۬ۜ۫ۦۚ۫ۗۦۧۜۨۡۖۚ۠ۡۘۦۧۜۘ";
                                break;
                            case 1868546608:
                                String str4 = "ۘ۠ۘۙۧۙۚۦ۟ۙۚۜۘۢۤۥۘ۟ۜۘ۬۬ۦۗۡۤۗۙۦ۬ۚۜۘۙ۬ۗۥ۬۟ۨۜۘ۠ۜۛ";
                                while (true) {
                                    switch (str4.hashCode() ^ 288315599) {
                                        case -428855137:
                                            str3 = "ۖۨۚۥۡ۠ۘ۫ۨۧۨۨۚۚۨۡۖۘۚ۫ۨ۫ۦۜۘۨ۟ۘۥۦ۠ۗۘ۟۠ۢۨۘ";
                                            break;
                                        case 123307306:
                                            str4 = "ۧۖۘۢۢۜ۠ۡ۫۫ۗۘۘۖۗۙۛۘۨۡۦ۟ۥۢۢۡ۬ۘۘۡۙۥۘ";
                                            break;
                                        case 837659448:
                                            str3 = "ۜۙۨۙ۫ۡۦۙۗۘۥۙۧ۬ۡۘۛۙۢ۬ۗۥۛۖۢۙۗۤۗ۟ۨۘ";
                                            break;
                                        case 1363177079:
                                            str4 = str != null ? "۟ۖۡۘۘ۠۫۠۟ۛۥۢ۠ۖ۠ۧۧۗۙۖۤ۬ۗ۬ۙۢ۬ۢۢۨۨۙۜ۠۟ۗۛۨۖ۫۟ۛ۫ۦۙۜۖۥۥۗۜ۫ۤۤۜۘ" : "۬۟ۚۗۚۦۢۧۙۥۜۜۥۡۖۨ۫۠ۖۢۚۜۤ۫۫ۢ۫ۡۦۖۧۡۥۘ۬ۘۜۘ۟۠ۡۘۦۡۨۙۧۦۘۧۢۡۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1374532544:
                    OooOOoo();
                    str2 = "ۤۚۢۗۤۡۘ۠ۥۜ۬ۤۚۥۦۘۤۨ۟ۙۚۦۘۚۜۥۘۘۛۖۙۘۘ۟ۖۙۛۨۜ";
                    break;
                case -498128337:
                    C3753c5.OooO0O0(this, R.string.sweep_error_tips);
                    str2 = "ۖ۬۫ۡۚۘۘ۬ۤۤ۫ۜۥۡۡۢۥۢۚۜۦۘۡۙ۫۟ۨۡۘۜۡ۬ۗۥ۟ۘۥۖۨۡ۟ۙ۫ۚۛۖۤۨۖۥ";
                    break;
                case -432485387:
                    str2 = "ۖ۬۫ۡۚۘۘ۬ۤۤ۫ۜۥۡۡۢۥۢۚۜۦۘۡۙ۫۟ۨۡۘۜۡ۬ۗۥ۟ۘۥۖۨۡ۟ۙ۫ۚۛۖۤۨۖۥ";
                    break;
                case -165467950:
                    str2 = "ۙۜ۫۬ۦۦۘۧ۬۬ۜ۫ۤۖۛ۫۫۠ۤۜۨ۠ۡۧۤۖۤۖۘ۫ۚۦۘ۠ۜۡۘۗۢۦۘ";
                    break;
                case -116906315:
                    intent = new Intent();
                    str2 = "۟ۚۢۤۙۢۖۧۧ۠ۘۥۘۢۙۧ۟ۗۘۘ۟ۧۙۥۗۢۦۚۧۛ۬ۨۘ۬ۤۖۘۨ۟۫۟ۥۢۙۡ۟";
                    break;
                case 463662138:
                    finish();
                    str2 = "ۚ۠۫ۖۡۢۛ۫ۥ۬ۜۨۘۧۧۧ۟ۦۖۛۦۖۘۧۡۘۡۢۦۘ۬۫ۗۨۖۖۡۗۦ";
                    break;
                case 833153119:
                    intent.putExtra("SWEEP_RESULT_BACK", str);
                    str2 = "۟ۛۙ۬ۡۨۘۨۙۤۥۧۖۘۘۘ۬ۖۥۦ۠ۙۘۤۙ۠ۦۘۥۛۙ۠ۚۤۘۢۗۘۘ";
                    break;
                case 1025801348:
                    str2 = "ۚۧۜۘۗۢۘۘ۟ۨۜۘۧۢۥۘ۫۬۫۫ۚۦۙۨۥۘۥۥۢۜۢ۠ۛۜ۠";
                    break;
                case 1202146920:
                    OooOoO0();
                    str2 = "ۗۘۥۦۘ۫ۨ۠ۨۘۢۢۦۘۥۚ۠۠۫ۧۘ۫ۘۘ۠۟۬ۜ۬۠ۛۨ۟ۦۥۦۛۙۘ۫ۙ۠ۥۥۘۚۜۧۛۢۡۘۨۘۗۦۥۘ";
                    break;
                case 1590491066:
                    setResult(-1, intent);
                    str2 = "ۤۜۖۘۤۗۦۘۨۚۦۘۢ۟ۜۜۙۙۤۘۘۡۢۢۡۙۡۢۤۙۢ۠ۡۜۤۥۘۖۡۨۤۚۡۘۘۤ۫";
                    break;
                case 1739656402:
                    this.OooooOo.clearAnimation();
                    str2 = "۠ۚۘۘۛۥۖۘۙۗ۠۟ۙۡۗۡۨۘۘۗۙۡۜۜۘۖۧۢۥۜۚۡۥۡۢ۟ۤۤۤۢ";
                    break;
                case 1796172195:
                    this.Oooooo.OooO0O0();
                    str2 = "۬ۛۘۘ۠ۡۤۘۧۙ۬ۛۙۛۖۡۤۜۘ۠ۚ۠ۢ۠ۘۢۖۘۜۧ۫ۗ۠ۤۗۜۦ۟۠ۡۘ۟ۗۛ۬۫ۦۧۢۜۘۛۧۙۨ۠۠";
                    break;
            }
        }
    }

    public boolean OooOOOo() {
        String str = "ۧ۠ۡۘۛۙۖۘۤۘۜۘۧ۬ۨۘ۬ۘۢۦۥۗۡ۟ۚۜ۬ۦ۬۫ۙ۠ۥ۬۟ۥۘۗۜۖۘۗۚۨۧۤ";
        while (true) {
            switch ((((str.hashCode() ^ 333) ^ 822) ^ 3) ^ 1123813423) {
                case -1321682088:
                    return this.OoooooO;
                case 615379216:
                    str = "ۗۜۥۘۘ۬ۡ۬۠ۤۤۢۢۨۘۤۘ۟ۨۘۗۡۥۘۗۘۧۘۡۨۖۘۜۗۛۥۤۗۥۢۥۘۨۢۗۦۨۛ۬ۗۗۤ۬۫۟ۘۡۘ۬ۜۤ";
                    break;
            }
        }
    }

    public void OooOOo0() {
        String str = "ۡۜ۫ۗۜۥۘۤۛ۠ۙ۟ۛۙۥۦۥۘۨۚۖۡۘۦ۬ۗ۬ۚ۬۠ۦۤ۟ۙۤ۫۬ۚۖۥۥۛ۠ۖۘۛۜۙۢۙۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 117) ^ UiMessage.CommandToUi.Command_Type.SET_FW_SMOOTH_VALUE) ^ C4587yp.OooO0oO) ^ 1397546604) {
                case -907297561:
                    this.oo000o = false;
                    str = "ۗۗۨۘۡۦۤ۬ۗۙ۠ۧۨۨۘ۫ۜۨۗ۟ۖۖۘ۟ۙ۬ۡۚۛۨۤۙۖۧۘۤۥۗۗۧۙۡۤ۫";
                    break;
                case -766834855:
                    str = "ۜۥۨۜۦۙۙۖۧۢۚۡۘۗۗۤۨ۟ۡۘۥ۫ۦۘۙۛ۫ۧۜۖۘۖۖۧۘ";
                    break;
                case -225479317:
                    C3964hv.OooO0O0().OooO0o0();
                    str = "ۜۥۨۜۦۙۙۖۧۢۚۡۘۗۗۤۨ۟ۡۘۥ۫ۦۘۙۛ۫ۧۜۖۘۖۖۧۘ";
                    break;
                case -129299418:
                    C3964hv.OooO0O0().OooO0oO();
                    str = "ۡۛۥ۬ۤۜۘ۫ۗ۫۟ۥۖۘ۬ۢۧۖ۫ۡ۟ۙۡۘ۬ۜۧ۬ۧۜۤۨ۬ۚۥۘ۫ۤۨۘۗۚۧ۟ۗۢۡۚۧ۟۫ۗ";
                    break;
                case 587784582:
                    return;
                case 795317109:
                    String str2 = "ۦۥۥۘ۠ۚۥۗۖۖ۫ۥۧۘۨ۟ۚۨۤۙۖۢۥ۬ۖۧۘۘ۬ۛۖۧۨۘۡۡۦۘ۠ۘۛۛۥۨۘ۟ۜۡۘۥۡۡۙۜ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 1005902765) {
                            case -1879350205:
                                str = "ۦ۫ۦۘۖۜ۠ۦۛ۠ۘ۫۟ۗۜ۬ۚۘۜۙۘۘۜۗۜۡۘۘۜۖۥۡ۬ۖۥ۬ۖۘۨۗۘ۬ۥۗۜۥۧۡ۠ۢۗ۟ۢ۠ۢۖۘ";
                                continue;
                            case -1435865646:
                                String str3 = "ۤۘۤۗ۬ۨۘۦ۟ۜۘۢۥۨ۟۬ۜۘ۬ۨۘۧۨۜۘ۫ۗۙۜۨۛۧ۫۫ۤۚۦۢۧۨۘۜۧۡۙۤۘۛۗۘۘۘۡۖۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1327181180) {
                                        case 783717163:
                                            str2 = "۠۬ۜۘۦۡۚۨۥۧ۟ۡۘۙۘ۫ۡۖ۠ۧۙۜۤۤۗ۫ۙۖۛۛۨۦۡۘۧۡۘ۠ۨۧۧۢۘۘۨۗ۠ۛ۠ۘۗۢۜۘۦ۟ۚ";
                                            break;
                                        case 878593707:
                                            str2 = "ۤۦۦۘۢۡۡۘۘۗۘۚۨۘ۫ۤۥۗۚ۟ۘۚ۬۬ۥ۠ۖۡۘ۠ۥۜۘۚۥۧۥۘۙ۬ۡۖ۬ۙۖۗ۬ۡ۟ۜ";
                                            break;
                                        case 1778921895:
                                            str3 = "ۢۨۤۦۨ۠۠ۢۥۘۚ۬۟۫ۙۥ۟ۥۧۡۘۘۘۖۚۥۙ۟ۚۚۙۢ";
                                            break;
                                        case 2048576975:
                                            str3 = this.oo000o ? "۬ۨۖۘۛ۬ۥۛۦۡۘۦ۬ۖۘۖۢۧۖۡۥۘ۫ۡۜۘۜ۟ۥۘۗ۠ۗۦ۟ۗۛ۬ۧۥۛۘۘ" : "۬ۗۨۘۧۡۥۘۦ۠ۥۘ۠ۤۥۘ۫۠ۖۘۥۖۜۘۡۛۖ۫ۙ۠ۤۚۡۜۚۨۘۤۜۧۘۧ۫ۖۥۛ۬ۤ۫۫ۥۥۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case 810568098:
                                str = "ۦۘۨۘ۫ۜ۟ۘۘۙ۬ۗۧ۠۟ۢ۟۬ۥۘ۫ۧۖ۠۬ۛ۟ۨ۠۟";
                                continue;
                            case 1113697308:
                                str2 = "ۨ۠ۥۨۜۘۘۨۢۧۖۚۨۘۛ۬ۡۘۘۨۡۘۗۧۧۜۛۦۘ۟۬ۨۘۦ۟ۦۘۗۥۦۜۙۥۢۖۡۘۡۤۦۘۗۢۨۘۢ۟ۢۛۚۥۘۡۦ۟";
                                break;
                        }
                    }
                    break;
                case 1329251156:
                    str = "ۖۧۜۘۢۧۤۘۥۙ۟۠۫ۚۘۘ۠ۖۜۙۚ۬ۗۚۛۖۛۧۜۛۛۨۡ۬۠ۚ۟ۧۧۡۘۧۜۖۘ";
                    break;
                case 1569257035:
                    this.oo000o = true;
                    str = "ۧ۬ۜۧۥۡۡ۫ۛۘۥۙۨۡ۫ۢ۠ۚۥۘ۬ۨۨۖۘۘۡۨۘۥۖۛۜۗۦۛۡۨۖۧۢۜۤۘ";
                    break;
            }
        }
    }

    public void OooOo(int i) {
        String str = "ۖ۫ۙ۟ۡۦۘ۠ۙ۬۬۠ۖۘۙۘۖۜۘۢۗۦۘۙۜۡۦۘۢۥۦ۟ۤ۟ۜۘۥۢۨۘۥۨۗ۠ۦۘۛۥۨۘۢۚۜۘۥ۟ۡ۫ۢۢ";
        while (true) {
            switch ((((str.hashCode() ^ 347) ^ 615) ^ 776) ^ (-848806135)) {
                case -972375634:
                    return;
                case -586505121:
                    str = "ۤۥۢ۟ۢۦۘۡۘۖۘۗۦۤۗۡۥۖۧۨۘۤۡۥ۫۫ۛۙۢۛ۫ۗۨ۫ۖۦۤۖۦۚۦ۠ۙۡۡۘ۫ۗۙۜۧ۫";
                    break;
                case -404855542:
                    str = "ۛۙ۬ۥۙۗۨۦۘۛۘۖۖۡ۠ۨ۬ۦۘۡۗۤ۫۟ۨۘۖۜۖۘۛۙۨۦۛۗۢ۫ۦ";
                    break;
                case 1480347239:
                    this.o00Ooo = i;
                    str = "۫۬ۜۘۙۛۘۘۜۤ۬۟ۥ۫۬۟ۙۜۦۡۚۢۧۥۜ۠ۚۡۖۦۙۚ۟۟ۦۘۙۥۨ۫ۘۡۘۗۤۚۖ۟ۤ۬ۨۘ";
                    break;
            }
        }
    }

    public void OooOo0(int i) {
        String str = "ۡۨۗۘۨۛۧ۠۟ۡۧۙۛۥۡۘۨۗۢۘۥۤۖۜۦۘۡۜۛۜۘۖۢۤۗ۟ۖۘۧۘۢۢۜۥ۫ۛ۟ۖۡ۟ۡۧۖۘۡۖ";
        while (true) {
            switch ((((str.hashCode() ^ 672) ^ 675) ^ 329) ^ (-515532469)) {
                case -1663950982:
                    this.o00o0O = i;
                    str = "ۙ۠ۙۛۘ۟ۜۜ۠ۚۜۘۛۖۙۖۜۖۦۘۥۖۧۜۥۧۥۚۚۥۘۘۦۡۤۤۦۗ۠۟۠ۧۗۙۗۖ۫ۨۘۡ۬۬۬ۧ";
                    break;
                case -47038180:
                    str = "ۨۤۘۘۖۧ۟ۤۦ۟ۛ۠ۥۘۙۜۘۨۥۦۢ۠ۖۡۗ۫ۚۘۖ۠ۚۦۘۢۡۜۢۛۚ۬ۜۤۦۡ";
                    break;
                case 312640326:
                    str = "ۦۜۛ۠ۙۜۗۘۚۧۖۥۦۗۚۦۘۧۘۥ۟۟ۗۦ۠ۜۘ۟ۙۖۨ۟ۡ۟ۥۜ۬";
                    break;
                case 1999728039:
                    return;
            }
        }
    }

    public void OooOo00(int i) {
        String str = "۬ۖۖۘۧۧ۫ۗ۬ۢ۫۫ۨۚۤۤۥۨۨۘۥۜۘۥۦۛۗۢۚۥۖۜ۟ۘۤ۬ۧۘ۫";
        while (true) {
            switch ((((str.hashCode() ^ 716) ^ 588) ^ 595) ^ 2093694566) {
                case -1797433105:
                    this.o00ooo = i;
                    str = "ۗ۟ۖۜ۬ۨۘ۟ۗۤۘۚۡۢۨۥۘ۬ۧۥۘۜۙۖۨ۬ۘۘۛ۟ۘۗۢۨۤۤۤۜۖۦۗ۬ۤۦۙۜۘۛ۬ۢ۬ۛۨۘ";
                    break;
                case 293548228:
                    str = "ۗۛۥۘۡۥۦ۟ۢۜۘ۟ۧۧۗۧ۬۬۟ۤۦۙۧ۫ۙۜۘۖۦ۫ۗ۫ۜۘۨۙ۬۠ۦ۬";
                    break;
                case 740062615:
                    str = "ۡۚۙۗ۬ۢۨۙۤۦۦ۬ۤۥۥۘۙۜۜۜۛۘۘ۫۠ۛۘۙ۠ۨۖ۠ۙۘۥۘۤۙۘۘۥۗۛۥۘ";
                    break;
                case 1974553229:
                    return;
            }
        }
    }

    public void OooOo0O(boolean z) {
        String str = "۫ۙ۬ۘۙۜۧۡۥۘۡۙ۫ۦ۟ۘۘ۬۬ۡۘۖۨۥۘ۟۠ۥۘ۠ۚۨۘۘۘۥۖۗ۠ۖۢۧۚۥۦۘۡۙۚ";
        while (true) {
            switch ((((str.hashCode() ^ 936) ^ 718) ^ 943) ^ (-234339991)) {
                case -1883960108:
                    return;
                case 787661762:
                    this.OoooooO = z;
                    str = "ۢۘۜۜۙ۫ۥۙ۟ۜۛۧۨۢۦۤۧۖۘۛۖۖۦۜۦۘۨۚۡۘۨۤ۬ۦۜ۟ۘۙۛ۬ۢۦۘ۫۫ۡۗۚ۟ۙۜ۠ۢۛۥۢۦ۫";
                    break;
                case 1108296996:
                    str = "ۘۙۗۘۗۤۖۘۤ۫ۘۛ۟ۙۖۘ۬ۜۗ۟ۖۜۢۘۘۦۜۤۧۧۧۗ۠ۨۘۧ۫ۙۜۘۧۤ۟ۖۧۖ۠ۗۛۖۘۡۦۖۘ۟۟ۚ";
                    break;
                case 1835191456:
                    str = "ۜ۠۠ۡ۬ۦۘۤۧۚ۠ۚ۬ۧۜۛۧۨۧۧ۫ۥۡۗۖ۠ۦۗۧۖ۫۬ۥۘۜۨۦۘۛۧۢۛۧۧ";
                    break;
            }
        }
    }

    public void OooOo0o(int i) {
        String str = "۬ۛۥۢۚۧۤۥۤۙۡۢ۠ۤ۠ۜۡۗۢۨۥ۟ۛۘۦۥۗ۟ۤۚۡۡۘۦ۫ۗ";
        while (true) {
            switch ((((str.hashCode() ^ 712) ^ 882) ^ C1879m.a.f11569a) ^ 1113890251) {
                case -1759769768:
                    return;
                case -1332739991:
                    str = "ۙۗۖ۠۬ۥ۫ۥۥۛۙۡۗ۬ۛۡۚۢۨۘۘۗۜۘۦۨ۠ۦۜۦ۬ۥۢ۟۠۠ۘۘۨ۟ۘۥ۟ۤ۬ۦ۬ۡۡۧۚ۬ۥ";
                    break;
                case -33823637:
                    str = "ۤۢۘۘۖۗۗۤۡۘۨۥۨ۫۟ۘۛۢۦۘۚۗۡۘۙۧ۬ۤ۬ۨۘۥۛۛ";
                    break;
                case 1393701911:
                    this.o00Oo0 = i;
                    str = "ۨۢ۫۠ۙۖۘ۠۠ۦۜ۠۫۠۟ۘۜۢۢۦۧۦۗۜۜۘۨۜۥۡۚۖۘۡ۫ۖۘۛۧۗ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۧۖۘۧ۟ۥۘۢۘۦۘۤۤۜۘ۬۫ۗۛۤۦ۫ۧۜۗ۬ۛ۠ۥۘۡ۠ۦۘۧ۠۬ۛۨۜۥۡۘۘۨ۫۠";
        while (true) {
            switch ((((str.hashCode() ^ 19) ^ 264) ^ 391) ^ 2096037591) {
                case -2104251681:
                    str = "ۥۖۜۘ۠۫ۖۘۖۗۘۘ۫ۙۧۚۗ۟۠ۙۖۥ۫ۧ۟ۜۙۨ۬ۢ۟ۤۘۜۘ۠۟ۢۗۡۘۘۙۡۦۦۡ۬ۨۦۘ";
                    break;
                case -1899291569:
                    str = "ۙۛۤۚۖۙۨۤۙ۬ۚۦۢۙۧۤۜۜۤۘۘۦ۫ۦۘۢۘۖۘۨۢۡۖ۬ۚۖۥۥۖۤۥۘۜۢۢۤۜ۫ۦۗۛۢۦۙ۬ۖۡۘ";
                    break;
                case -1776386217:
                case 1869350688:
                    return;
                case -1208359414:
                    OooOOOO();
                    str = "ۧ۬ۥۘۧۢۥ۠۬ۛۨ۟ۚۥۗۖۘ۬ۡ۠ۗۧۘۗۗۨۘۢۚ۟ۚۗ۟ۦ۫ۚۡ۠ۛ";
                    break;
                case 128482386:
                    setContentView(R.layout.activity_sweep_code);
                    str = "ۤ۠ۨۦ۫ۥۘۤۨۨۙۦۦۘۦۚۡۡۡۨ۠۫ۡۘۥۥۗ۟ۛۡۘۤ۠۬ۚۙۡۘ۫ۨۘۡ۠۟ۗۧ۠ۧ۠۫ۨۜۘ";
                    break;
                case 527754596:
                    ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 0);
                    str = "ۡۤۢ۬ۚۡۘ۫ۨۖۘۘۢ۟۠ۜ۬۠ۢۧۜۢۖۘ۬ۛۦۨۦۥۘ۬ۢۥۤۛۙ۟ۘۤۤ۠ۚۛ";
                    break;
                case 1241178338:
                    initView();
                    str = "ۥ۠ۦۜۙ۠ۙۥ۠ۢۚۧ۠۫ۢۤۖۚۗۖۢۜۙۦۨۢ۟۫ۨ۟ۢۖۖۘ۠ۚۥۚۘۘۛۦۢ";
                    break;
                case 1964050030:
                    String str2 = "ۡ۟ۘۘۧۢۡۘ۫ۖۧۘۤۗۛ۠۫ۖۘ۬۠۠ۧ۠ۚۘۥۜۘۤۘۤۤۡۥۜۜۥۘۜۦ۠۫۬ۘۘۘ۠ۖ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1523010695)) {
                            case -1908547737:
                                str2 = "ۥۙ۫۬ۡۢۛۢۨۘۙۙۚۖۡۖۤۤۗۗ۟ۜ۬ۛۙۨ۠ۥۜ۬ۖۘۢ۬ۚۥ۟ۦۘۚۨۦ۫۬ۙۙۛۜۚ۫ۘۘۛۢۙۥۙۗ";
                                break;
                            case 555957129:
                                str = "ۚۚۘۘۨۗۖۡۧۢۥۜۦۘۗۙۜۘۤۢ۫ۙۜۢۚۥۘۘۢۗۜۢۗۖ۫ۥۡۧ۫ۡۘ";
                                continue;
                            case 879363725:
                                str = "ۖۜۗ۬۟ۥۜۧۡۘ۠ۧۘۘۗ۫ۤۗ۫ۡۘ۬ۛۘۡۦۦۦ۟۬ۤۛ";
                                continue;
                            case 1909556080:
                                String str3 = "ۦۡۦۘۦۦۥۢۥ۬ۙۛۤۜۜۜ۬ۜۜۨۤۖۙۤۘۘۥ۬ۧۨۦۖ";
                                while (true) {
                                    switch (str3.hashCode() ^ 204096964) {
                                        case -1914585530:
                                            str3 = "۫ۥۖ۠ۘۨۘۚۙۛۖۡۘۨۙ۬ۗۜۥ۟ۛۥۛۦۨۘۘۙۙۖۛۥ";
                                            break;
                                        case -1854781864:
                                            str3 = ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0 ? "ۥۨۘۘۢ۟ۙۚۘ۬ۡ۫ۦۦۧۘۘۖۛۦۘۤ۬ۙۨۛۖۘۨ۫ۡۘۘۖۜۘۨۧ۬ۘ۠ۗ۬۬ۥ۠۬ۢۧۤۚۤۢۛۚۡۡۖ۬" : "ۙۗۖۧۚۥۨۤۥۢ۬ۘۘ۟ۥۙۡۛ۫۫ۧۜۘۜۤۘۘۥۦۙۡ۬ۥۛ۠ۧۨۢۡۥ۟ۘۤۤۦۛۗۖ۫ۗۢۖۜۘۙۤ";
                                            break;
                                        case 1787367775:
                                            str2 = "ۤۨۡۖۙۨ۬ۦۦۜۖۘ۟ۗۦۨۦ۟ۜۢ۬ۧ۫۟۠ۧۜۘ۫ۚ";
                                            break;
                                        case 1822859126:
                                            str2 = "۟ۢۚۢۦۙ۬ۨۘۧۨۘ۠ۗۚۤ۟ۨۚۧۥۘۛ۫ۘۘ۠۟ۢۚۛۢ۫ۙۢ۬ۖ۠ۡۙۥ۠ۢۖۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 2027216724:
                    super.onCreate(bundle);
                    str = "۟ۨۤ۟۠ۙۡۦۚۢۧۖۘۧۚۖۘۦۖۡۗۘۖۘۢ۫ۙۘۛۜۘۙۨۗ";
                    break;
            }
        }
    }

    @Override // com.cyjh.common.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۦۘۢۦۚ۟ۛۗۨۚ۫ۢۢۨۤ۬ۧۚۡ۟ۥۘ۫ۦۧۘ۫ۢۗۡۡۘۡۛۜۙۙۙۧ۬۫ۡۥۘۗۚۥۘۛۖۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 934) ^ 293) ^ 690) ^ 259210463) {
                case -1945556786:
                    super.onDestroy();
                    str = "ۦۨۤ۠ۘۛ۫۠ۖ۫۫ۚۘۖۘ۟ۦۡۚۖۦ۫۟ۨۘ۬ۗۥۖۚۛ۠ۢۘۘۥ۠ۘۘۗۨۙۧۛۧۤۥۜۗۗ";
                    break;
                case -1789239468:
                    this.Oooooo.OooO0OO();
                    str = "ۗۨۧۘ۟ۜۙ۠ۡۨۘۘۡۥۜ۠ۚۦۖۨۢۧۛۥۡۘۙۤۛۡ۫ۡ";
                    break;
                case 1115756044:
                    return;
                case 1798568736:
                    str = "ۛۜ۟ۨۥۡۘۧۡۜۛۗ۬ۨۥۢ۫ۥۙۥۤۘۨ۬ۘۨۡۖۜۧۘۖۜۚۜۛۨ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String str = "۫ۤۦۘۗ۬۟ۛ۟ۤۜۜۨۚۧۦۜۨۗ۠۠ۥۥ۠ۖ۟۟ۧۥۚۚۡ۟ۖۦۘ۟۫ۦۛۘۛ";
        while (true) {
            switch ((((str.hashCode() ^ 807) ^ 518) ^ 340) ^ (-1783769964)) {
                case -316597937:
                    MobclickAgent.onPause(this);
                    str = "۫۫ۖۡۜۖۘۢ۬ۚۛۢۢ۫ۗۗۜۙۚۜۥۢۖۦ۟۟ۙۖۗۗۦۥۜۚۚۦ۫ۨ۫ۗ۫ۚۘۡۙۚ۠ۚ۫ۙۥۢۥ۠ۘ";
                    break;
                case 185439936:
                    str = "ۥۨۦۘ۟ۚۡۘۢۘ۬ۗ۟۬۟ۡۥۤ۠ۜۚۜۘۦۘ۬ۗۚ۟ۥ۫ۧ";
                    break;
                case 771606006:
                    OooOoO0();
                    str = "ۨۗ۠ۥ۠ۡ۟۫۫ۨ۬ۨۙۚۥۘۥۖۡۘۤ۬ۛۨ۠ۛۚۢۨۘۥۜۘۦۦۛ۟ۧۥۢۡۘۛۨ۟ۡۖۦۡۙۛ۬ۚۨۛۗ۬";
                    break;
                case 868254215:
                    return;
                case 1333344570:
                    super.onPause();
                    str = "ۗ۟۠ۨۖۙ۫ۖ۬ۥۨ۠ۜ۫ۢۤۙۖۛۚۦۘۗۖ۠۫ۤۜۡۘ۟ۗ۫ۙۘۛۚۨۖۘ۠ۜۡۧۘ۟ۥ۠ۡ۫ۜۡۘ۫۠ۨ";
                    break;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        SurfaceHolder holder = null;
        String str = "۬ۧ۟ۤ۟ۡ۬ۖۛۤۜۥۘۥۜۘۦۜ۠ۙۛ۫ۘۥۜۘۧۡۥۘ۬ۖۨۘۙۜۤۦۢۜۗ۬۠۠۫ۛ۫ۧۙۗۗۖۘۢ۬ۥۚ۬ۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 494) ^ 422) ^ 176) ^ (-697571135)) {
                case -1194693401:
                    String str2 = "ۗۚۜۘۚۚۧۙۢۛ۠۟ۡۜۙۙۘۢۡۘ۬۬ۤۤۚ۬ۨۥۧۛۡۖۗۜۚ۠ۙۗۘۨۧۧۛۥۘۗۗ۫ۨۦۤۤۘۘۤۖۤ";
                    while (true) {
                        switch (str2.hashCode() ^ (-276413011)) {
                            case -121601337:
                                str = "۟ۦ۫ۘۨۧۘ۟ۦۘۖۚۖۗۚۛ۫۠ۚۦۤۦۜۥۘۦۛۨۘ۟۬ۧ۠ۖۛۘۦۜۘۛۛ۬ۤ۠ۜۧ۟ۚۘۦۢ";
                                continue;
                            case 715756:
                                String str3 = "ۢ۫ۜۧۤ۠ۚۘۗۖۖ۠ۨۧۜۙ۫ۤ۠ۜۘۘۜۡۘۛۦۙۛۜۦۖۥۘۗۘۛۥ۟ۡۜ۫ۘۚ۠ۛۗۥۖۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 859192883) {
                                        case -1391810397:
                                            str3 = ((AudioManager) getSystemService(C1732o.f9732b)).getRingerMode() != 2 ? "ۦۚۥ۬ۤۥۡۜۛۤۖۜۘ۬۠ۤۘۖۖ۟۟ۛۤۛۡۦۨۜۧۦۘۦ۫۫۟ۢۨۘۜۥ۬۬ۖۧۘ" : "ۨۖۨۧۛۛ۫۬ۨۘ۟ۖۢۡۗۡ۠۠۬ۧۚۗۨۗۡۜۗ۟ۛ۫ۛۘ۫ۚ۟۟ۜۢۖ۟ۡۥۗ۫ۜۦۜۘ";
                                            break;
                                        case -1133466565:
                                            str2 = "۠ۙۥۖۥۡۘۢۖۡۘ۫ۢۗۛۘۢ۟ۘۚۤۗۘۘۙۗۨۙۛۜۤ۟ۡ۫۟ۦۛۖۘ";
                                            break;
                                        case -575294338:
                                            str3 = "ۛۛ۟ۡۧۨۘۦ۟۫ۚۗۧۡۨۖۘۘۦۖ۠ۙۖۘۙۦۗۖۡۘۨۢۨۘۡۨۡۘۡۖۗ۬ۨۨۦ۬۫ۦ۠ۛۖۤۜۘ";
                                            break;
                                        case 1864752642:
                                            str2 = "ۗۗۥۖۢۙۛ۬ۦۢۡۧ۬ۤۛۚ۬۠ۦۧۘۡۜۥۦۦۦۤۡۘۙۧۖۜۛۦۜ۠ۡۨۦۜۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1295682402:
                                str2 = "۫ۗۡ۫ۥۘۗۜۥۖۢ۟۬ۦۤ۟ۨۤۧ۠ۜۘ۫ۡۙ۠ۧۜ۬ۨۦۖ۫ۦۤۥۧۧۧۦۘۛۢ۫";
                                break;
                            case 1758659594:
                                str = "ۙۥۛۛۨۖۗۗۡۘۜ۟۬ۜۡۦۜ۟ۦۡۜۦۨۜ۬۬۫ۘ۫ۧۦۖ۬ۤۗۡۙۜ۬ۡ۠ۖۥۘۢۛۘۙۦۖۘ";
                                continue;
                        }
                    }
                    break;
                case -667946224:
                    OooOOO(holder);
                    str = "ۢ۬ۖۘۦۦ۬ۜۚۘۘ۫۟ۚۖۧۡۚۗۥۘۛۛ۬ۗ۟ۗۗۢ۬ۡۖ۟ۘۦ۠ۖۜۜۡۘۨۥۨۘۛۤۧۙ۠ۡۦۖ۟ۨۤۦۘ";
                    break;
                case -617903014:
                    MobclickAgent.onResume(this);
                    str = "ۖۗۜۘۜۖ۫ۚۗۖۙۘۖۦۜۘۤۙۡ۫۠ۦۤۦ۟ۦۗۖۘ۬ۛۦۘۡ۬۠۟ۨۢۙۧۦۘۨ۠ۜۘ";
                    break;
                case -591020904:
                    holder.addCallback(this);
                    str = "۠ۖۦۘۡ۠ۡۘ۫ۦۥ۟ۨۗۤۥۨۨۗۘۘۚۖۧۘۗۚۦۥۤۘۘۗۙۨۘ۟۬۬ۛۥ۠";
                    break;
                case -398541894:
                    super.onResume();
                    str = "ۤۦۦۘۗۤۢۗ۟ۛۙۤۚۘۙ۠ۚۜۘۥۡۘۢۦۨۘۨۤۙۤۦ۟ۧۢۨ۬ۨ۟ۡۢۢۤۡۖۘ۟ۜۖۖ۠ۘ";
                    break;
                case 109319123:
                    holder.setType(3);
                    str = "ۘۘۧۘ۠۟ۡۗۖۥۘۨۥۥۘ۬ۖۛۥۤۢ۟ۙ۟ۙۢۚۢۢ۟ۦۘۦۦۘۥ۬ۡۘۡۨۦۘ۬ۥۘۚۦۜۘۢۚۙ";
                    break;
                case 503116436:
                    String str4 = "ۖۖۤ۟ۗۡۘۗ۟ۧۥۨۦۖۨۦۘ۫ۤ۠ۜ۟ۜۘ۟ۖۤ۫۠ۨۘۧ۟ۖۛۡۧۘۧۧۨۙ۫ۖۘۡۤۥ";
                    while (true) {
                        switch (str4.hashCode() ^ (-2113857215)) {
                            case -1417960299:
                                String str5 = "ۗ۬ۛۨۥۖۦ۠ۧۗۜۦۘۨۛۨۘ۬ۥۖۘۚۜۜۛۡۡۘۦ۠ۘۧۛۢ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-437148313)) {
                                        case -1174919041:
                                            str5 = this.Ooooooo ? "۬ۥ۫۟ۨ۬۟ۧۦۜۤۢ۠ۥۤۗۡۗ۫ۥ۟۬ۙ۫ۘۘ۠ۚۜۥۖۖ۫۬ۦۦۘۗۘۥۗۨ۫" : "ۧۚۥ۠ۜۥۖۛۨۘ۬ۨۤۨ۟۠ۜ۠ۙ۫۬ۛۧ۟ۥۘۖۢ۠ۤۨۛۙ۠ۘۘۛۦۘ";
                                            break;
                                        case 146739356:
                                            str4 = "ۜۛۦۗۦۤۤ۟ۤۜ۟ۧ۬ۧۙ۬ۗۡۧ۬ۤۚۛۥ۫۠ۛۡۤۡ۫ۨۤۚۧۜۘۛۙۘۧۨۧۘۜۘۧۘۥۜۡۜۦۤ۫ۗۢ";
                                            break;
                                        case 657457473:
                                            str4 = "۫ۤۥۘ۟ۦ۬ۨۚۙۘۧۘ۠۠ۨۥۖۤۨۜۡۥۦۜۡۨ۫ۥۥۛ۬ۢۛۨ۟ۨ۬ۨۜۡۗۘۘۤۛۘۘۦۖۧۘ";
                                            break;
                                        case 1712718161:
                                            str5 = "ۗۛۗۨۙۥۘۛۘۦۘۛۢۤۤ۫۫ۤۧ۠۠ۨۦ۠ۙۧۚۛ۫ۖۨۛۨ۬ۤۜۦۢۚ۟ۘۘ۠۟";
                                            break;
                                    }
                                }
                                break;
                            case -128259454:
                                str = "ۚۘۘۘۡۘۙۚۦ۬ۦۗ۬ۧ۠ۜۥۙۙۥۡ۫ۗۢۨۘۥ۬۬ۤۧۨ";
                                continue;
                            case 963745398:
                                str = "ۚۨۨۗۛ۠ۦۦۨۘۧۜۡۙۛۖۘۥۥۡۚۛۦۘۦ۫ۨۦ۬ۤ۫ۦ۫ۖۙۜ۠ۧۘۨۥۘۚ۬ۢۦۛۨۨۖۖ";
                                continue;
                            case 1576568670:
                                str4 = "ۥۡۡۘۡۥۚۜۘۨۡ۫ۥۙۦ۠ۧۧۨۘۙۙۨۚۥۢ۫ۤۖۘۘۦۧۥۧۙۗۜۙۘ۠ۘۘ";
                                break;
                        }
                    }
                    break;
                case 815750599:
                    this.ooOO = true;
                    str = "ۥۚ۫ۘۛۥۨ۫ۗۘۥۤ۬ۥۨۢۥۨۡۙۢۥۧۜۚ۬ۜۘ۬ۤۘۨۖۘۘۤ۬۟ۙ۬ۨۘۖ۬ۖۢ۬ۦۛۙۧ";
                    break;
                case 835252564:
                    this.o0OoOo0 = false;
                    str = "۟ۦ۫ۘۨۧۘ۟ۦۘۖۚۖۗۚۛ۫۠ۚۦۤۦۜۥۘۦۛۨۘ۟۬ۧ۠ۖۛۘۦۜۘۛۛ۬ۤ۠ۜۧ۟ۚۘۦۢ";
                    break;
                case 970188003:
                    OooOOO0();
                    str = "۫ۥۡۘۛ۫۬ۧۛۨۘۦۜۜۘۖۥۜۜۚۚ۫ۖۡۘۧ۫ۡۘۙۖۖۘ۟ۥۡۘۤ۟ۖ۟ۖ۟ۙۤۦۘ۫۫ۖ۫ۨۧۨۧۛ۬ۨۥۘۜۚ۠";
                    break;
                case 1277705584:
                    this.o0OoOo0 = true;
                    str = "۬ۤ۠۬ۧ۠۬۫ۧۨۡۧۘۨۘۥۥۤۡ۠ۘۤۦۢ۟۠ۜۤۛ۬ۜۙۥۘۦۗ۠ۢ۠ۥۗۨۗ";
                    break;
                case 1334259724:
                    str = "ۘۘۧۘ۠۟ۡۗۖۥۘۨۥۥۘ۬ۖۛۥۤۢ۟ۙ۟ۙۢۚۢۢ۟ۦۘۦۦۘۥ۬ۡۘۡۨۦۘ۬ۥۘۚۦۜۘۢۚۙ";
                    break;
                case 1626323043:
                    str = "ۧۧۜۤۘ۬۟ۙۚۖ۫ۥۥۧۦۖۦ۠ۦۘۡۘۥۡۖۨۛۚۛۧۖۦۜۛۚۧۚۙۜۖ۠ۜۢۡۛۥ۟ۦۨۜ۠۬۬ۘۜۘ";
                    break;
                case 1702563143:
                    return;
                case 1866448749:
                    holder = ((SurfaceView) findViewById(R.id.capture_preview)).getHolder();
                    str = "ۖۥ۟ۢۛۜۨۗۨۗ۟ۦۘۦۤۦۘۤ۬ۖ۬ۨۡۚۡۜۘ۠ۢۦۤ۟ۢ";
                    break;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        String str = "۬۠ۚۥ۬۟ۧۚۖۙۧۥۖۗۘ۠ۖۗ۫۠۫ۡ۬ۦۗۧۗ۟ۨۜۘۦ۬ۧۦۗۖۘۧۦۘۦۗۨۙۙۦۘۜۙ";
        while (true) {
            switch ((((str.hashCode() ^ 541) ^ 576) ^ 958) ^ (-1472598188)) {
                case -1863322389:
                    str = "ۖۗۚۘۧۥۙۖ۬۫ۨۡۘۗۖ۫۬ۖۨۦۚۨۨ۠ۡۚۗۥۦۦۨۙۨۘۧۗ۫";
                    break;
                case -1419413218:
                    str = "ۤ۟ۦۚۗۛۛۖۜۘۘۨ۟ۚۧۥۘۦۤۧۥۖ۠ۖ۬ۗۚ۬ۛۛۙۥۘۧۘۘۘ۠ۦ";
                    break;
                case -515626552:
                    str = "ۦ۠ۗۨ۟ۡۘۖۢۤ۟۟۬ۛۨۗۧۧۡ۠۟ۡۘۤۢۡۘۚۛۨۘۙۦۨۖۜۦۘۖۜ۬ۢۘۜۡۛۚۘۡۘۚ۠ۛۜۘۗۙۚ۠";
                    break;
                case -109293396:
                    return;
                case 952404764:
                    str = "ۚۡۡۚۜۧ۫ۦۤۚۢ۬ۘۤۚۧۨۘۡۢۖۜۧۥۦۖۨۧۡۘ۠ۢۖۘۜۘۜۘۘۡۢۢ۬ۚۥۧۨۤۜۘۢ۬۟۫ۨۧ";
                    break;
                case 1656678653:
                    str = "۬ۗۖۘۧۤۡۘۥۗۚۖۡۥۘۗۜۜۘ۠ۘۙۨۤۘۨۤۜۨ۠ۙۤۢۨۘۖۚۗۜۧۦۘۖۙۡۦۤۡۘۚ۠ۘۘۧۧۦۘ";
                    break;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        String str = "ۡ۟ۤۢ۠ۜۘۢۧۖۘۗۚۥ۠۫ۥۖۢۚ۠ۘۗ۠ۛ۬ۡۜ۟ۡۚۨۘۜۖۖۘۚۚ۬۫ۜۙۤۤۥۘۛ۠ۘۚ۫ۥۘ۬ۥۜۘۦۤ";
        while (true) {
            switch ((((str.hashCode() ^ 494) ^ 320) ^ 295) ^ 230776282) {
                case -2073483120:
                    String str2 = "ۜۘۧۢۚ۫ۦۥۡۘ۟ۚ۠ۚۥۘۘۡ۬ۨ۠۫۬۫ۚۖۜۡۖ۫ۗۛ";
                    while (true) {
                        switch (str2.hashCode() ^ 1000852581) {
                            case -1798408286:
                                str = "ۖۡۢۢۤۧ۠ۛۢۢۘۗۜ۠۟۬ۗۤۡۢۜ۫۫ۨۤ۬ۦۘۜ۠ۨۜۦۜۘۜۙۡ";
                                continue;
                            case -184945166:
                                str = "ۖۥۜۘۧۚۤۜۙۡۛۜۖۘ۟۟ۚۚۡ۠ۜۜۢۡۧۙ۬ۧ۠ۙۥۘ";
                                continue;
                            case 53183818:
                                String str3 = "۟۠ۡۘۗۖۜۘۙ۬ۙۥۢ۫ۦۖۢ۬ۡۘۧۜۙۦۘ۫ۘۚۨۘۜ۠۠ۡ۟ۡۘۛۜۘۘۥۡ۟۬ۜۢ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-417911848)) {
                                        case -1296479867:
                                            str2 = "ۖ۫ۨۘۦۨۡۘ۫ۧۗۜۜ۫۬ۦۡۙۛۧۦۘۨۘ۠ۙۦۖۥۜۘۡۢۛۧۜۘۘۜۘۨۘۦۘۥۦۗۜ۫ۡۨۖۙۙۛۦۖۘۚ۟ۘ";
                                            break;
                                        case -1075165648:
                                            str3 = "ۘۖۜۖۘۧۜ۠ۖۚۦۘۖۘۦۙ۠ۗۛۨۢۛ۫ۘۖۦۧ۠۬ۗۥۜۘۗۨۛۧۥۡۘۗ۟ۨۘۦ۟ۗۡۛ۠ۨ۟ۥۘۨ۫ۜ";
                                            break;
                                        case -597583530:
                                            str2 = "ۥۧۡۘ۫ۖۛ۠۠ۛۙۜۚۖ۫ۙۢۚۖۛۡۢۡۗۘۤۡۘۨ۬ۘۘۥۧۘۖ۬ۦۜۨۢۛۤۢ۬۬ۚۡۗ";
                                            break;
                                        case 1927619030:
                                            str3 = !this.Ooooooo ? "ۚۚۙۖۤۛۢ۫ۖۨۢۖ۠ۨ۬ۘۗ۬۠ۡۙۜۖ۟۬۬ۧ۫ۢۥۨ۫ۢۨۡۘۘۖ۠ۜۜۗۖۤۧۖۚۢۖۥۘۗ۠ۨۘ" : "ۜ۟ۥۘ۟ۥۧۗۤۘۘۢۤۘ۠ۧ۫ۡۘۨۥۘ۬ۖۡۘۨ۟ۗۦۥۖ۟۬ۨۤۤۡۘۥ۠ۢۖۨ۫";
                                            break;
                                    }
                                }
                                break;
                            case 535314364:
                                str2 = "۠ۗۖۘۙۡۡۘۖۦۧۘۚ۟ۛۜۚۖۨۡۘۢۡۘۘ۬ۖۡۘۥ۠ۖۢ۫ۗ";
                                break;
                        }
                    }
                    break;
                case -1202436396:
                    return;
                case -675429717:
                    this.Ooooooo = true;
                    str = "ۙۨۘۘ۫۠ۧۨۥۜۘۨۧ۠ۧ۫۬ۛۘ۟ۙۖۘۨۧۡۢۨۘۜۤ۟۫ۜ۫۠ۛۙۚۡۛ۟ۙۤۙۚۥۜ۫ۛ۟ۚۗ";
                    break;
                case -675044672:
                    str = "ۥۡۥۖۚۦۖۜۨۜ۟۬ۛۡۘۧۙ۠ۖۗۥۨۘۘ۠ۨۡ۠ۨۘ";
                    break;
                case -362915036:
                    str = "۬ۘۧۨۡ۫ۘۗۧ۫ۢۧ۠ۥۥۛۨۘۜۨۜۘۡۙۡۘۨ۬ۡۨۤ۟ۗۗۘۘ۬ۖۦۘ";
                    break;
                case 436296924:
                    OooOOO(surfaceHolder);
                    str = "ۖۡۢۢۤۧ۠ۛۢۢۘۗۜ۠۟۬ۗۤۡۢۜ۫۫ۨۤ۬ۦۘۜ۠ۨۜۦۜۘۜۙۡ";
                    break;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        String str = "ۖۢۜۘۦۢۨۘ۬ۡۘۘۧ۫۬ۨۖۦۘۢۤ۫۬ۜ۠ۦ۬ۙۨۗۨ۫ۘۧۘۥ۬ۦۗ۠ۦ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.FW_SET_HEIGHT_VALUE) ^ 742) ^ 658) ^ (-1384667504)) {
                case -1483734446:
                    str = "ۤۗۦۢۡۦۘۢۧۥۘ۠ۙۥ۟ۖۦۘ۫ۡ۫۠ۨۡ۟ۜۥۜ۬ۦۘ۠ۥۥ";
                    break;
                case -1084575372:
                    this.Ooooooo = false;
                    str = "۠ۛۖۚۜۤۜۡۖۘۦۚ۟ۗۦۥۡۚۤۦۤۘۖۙۘۘۖ۫ۥۘۧۧۥ۠ۢۡۘۜۥ۠ۨۘۜۤۗۚۖۚۦۗۚۘ";
                    break;
                case -663501777:
                    str = "ۤۤۙۢۢۥۖۚۚ۠ۛۤ۬ۦۘۧ۫ۧۥۢۛۢ۠ۦ۫ۧۚۧۤ۠ۚۧۢۢ۫۠";
                    break;
                case -324915203:
                    return;
            }
        }
    }
}
