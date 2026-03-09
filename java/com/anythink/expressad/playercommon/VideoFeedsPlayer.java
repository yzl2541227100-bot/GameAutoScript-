package com.anythink.expressad.playercommon;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.annotation.Nullable;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1498ad;
import com.anythink.expressad.exoplayer.C1531d;
import com.anythink.expressad.exoplayer.C1575f;
import com.anythink.expressad.exoplayer.C1581g;
import com.anythink.expressad.exoplayer.C1658i;
import com.anythink.expressad.exoplayer.C1765v;
import com.anythink.expressad.exoplayer.InterfaceC1766w;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p101h.C1646o;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p104i.C1661c;
import com.anythink.expressad.exoplayer.p104i.C1665g;
import com.anythink.expressad.exoplayer.p105j.C1698o;
import com.anythink.expressad.reward.player.InterfaceC1973c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class VideoFeedsPlayer implements InterfaceC1766w.c {
    public static final int INTERVAL_TIME_PLAY_TIME_CD_THREAD = 1000;
    public static final String TAG = "VideoFeedsPlayer";
    private C1498ad exoPlayer;
    private Timer mBufferTimeoutTimer;
    private Context mContext;
    private long mCurrentPosition;
    private View mFullScreenLoadingView;
    private volatile VideoPlayerStatusListener mInnerVFPLisener;
    private boolean mIsSilent;
    private WeakReference<View> mLoadingView;
    private volatile VideoPlayerStatusListener mOutterVFListener;
    public String mPlayLocalVideoFileErrorStr;
    private String mPlayUrl;
    private SurfaceHolder mSurfaceHolder;
    private int mVideoReadyRate;
    private InterfaceC1650s mediaSource;
    public InterfaceC1973c tempEventListener;
    private boolean mIsComplete = false;
    private boolean mIsPlaying = false;
    private boolean mHasPrepare = false;
    private boolean mIsBuffering = false;
    private boolean mIsNeedBufferingTimeout = false;
    private boolean mIsFrontDesk = true;
    private int mBufferTime = 5;
    private Object mLock = new Object();
    private boolean isStart = false;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };
    private boolean needPrepareVideoPlayAgain = false;
    private String mNetVideoUrl = "";
    private String mMediaSourceUrl = "";
    private Runnable playProgressRunnable = new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.2
        @Override // java.lang.Runnable
        public void run() {
            long jMo6346s;
            try {
                if (VideoFeedsPlayer.this.exoPlayer == null || !VideoFeedsPlayer.this.exoPlayerIsPlaying()) {
                    return;
                }
                VideoFeedsPlayer videoFeedsPlayer = VideoFeedsPlayer.this;
                videoFeedsPlayer.mCurrentPosition = videoFeedsPlayer.exoPlayer.mo6347t();
                float f = VideoFeedsPlayer.this.mCurrentPosition % 1000;
                int iRound = Math.round(VideoFeedsPlayer.this.mCurrentPosition / 1000.0f);
                StringBuilder sb = new StringBuilder("currentPosition:");
                sb.append(iRound);
                sb.append(" mCurrentPosition:");
                sb.append(VideoFeedsPlayer.this.mCurrentPosition);
                if (VideoFeedsPlayer.this.exoPlayer == null || VideoFeedsPlayer.this.exoPlayer.mo6346s() <= 0) {
                    jMo6346s = 0;
                } else {
                    jMo6346s = VideoFeedsPlayer.this.exoPlayer.mo6346s() / 1000;
                    if (f > 0.0f && f < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && jMo6346s > 0 && iRound < 1 + jMo6346s) {
                    if (!VideoFeedsPlayer.this.isStart) {
                        VideoFeedsPlayer videoFeedsPlayer2 = VideoFeedsPlayer.this;
                        videoFeedsPlayer2.postOnPlayStartOnMainThread(videoFeedsPlayer2.exoPlayer.mo6346s() / 1000);
                        new StringBuilder("onPlayStarted()，getCurrentPosition:").append(VideoFeedsPlayer.this.exoPlayer.mo6347t());
                        VideoFeedsPlayer.this.isStart = true;
                    }
                    VideoFeedsPlayer.this.postOnPlayProgressOnMainThread(iRound, (int) jMo6346s);
                }
                VideoFeedsPlayer.this.mIsComplete = false;
                if (!VideoFeedsPlayer.this.mIsBuffering) {
                    VideoFeedsPlayer.this.hideLoading();
                }
                VideoFeedsPlayer.this.mHandler.postDelayed(this, 1000L);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    };

    private void cancelBufferTimeoutTimer() {
        try {
            Timer timer = this.mBufferTimeoutTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void cancelPlayProgressTimer() {
        try {
            this.mHandler.removeCallbacks(this.playProgressRunnable);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mLoadingView != null && VideoFeedsPlayer.this.mLoadingView.get() != null) {
                        ((View) VideoFeedsPlayer.this.mLoadingView.get()).setVisibility(8);
                    }
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(8);
                    }
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void postOnBufferinEndOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingEnd();
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingEnd();
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnBufferingStarOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onBufferingStart(str);
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onBufferingStart(str);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void postOnPlayCompletedOnMainThread() {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayCompleted();
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayCompleted();
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void postOnPlayErrorOnMainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.10
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayError(str);
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayError(str);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayProgressOnMainThread(final int i, final int i2) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayProgress(i, i2);
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayProgress(i, i2);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void postOnPlaySetDataSourceError2MainThread(final String str) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlaySetDataSourceError(str);
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlaySetDataSourceError(str);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOnPlayStartOnMainThread(final long j) {
        try {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        int i = (int) j;
                        if (VideoFeedsPlayer.this.mOutterVFListener != null) {
                            try {
                                VideoFeedsPlayer.this.mOutterVFListener.onPlayStarted(i);
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                        if (VideoFeedsPlayer.this.mInnerVFPLisener != null) {
                            try {
                                VideoFeedsPlayer.this.mInnerVFPLisener.onPlayStarted(i);
                            } catch (Exception e2) {
                                e2.getMessage();
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void rePrepareVideoSourceAgain() {
        if (this.mOutterVFListener != null) {
            this.mOutterVFListener.onVideoDownloadResume();
        }
        InterfaceC1650s interfaceC1650s = this.mediaSource;
        if (interfaceC1650s != null) {
            this.exoPlayer.mo6310a(interfaceC1650s);
        }
    }

    private void startBufferIngTimer(final String str) {
        if (this.mIsNeedBufferingTimeout) {
            cancelBufferTimeoutTimer();
            Timer timer = new Timer();
            this.mBufferTimeoutTimer = timer;
            timer.schedule(new TimerTask() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        if (!VideoFeedsPlayer.this.mHasPrepare || VideoFeedsPlayer.this.mIsBuffering) {
                            VideoFeedsPlayer.this.postOnBufferingStarOnMainThread(str);
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }, this.mBufferTime * 1000);
        }
    }

    private void startPlayProgressTimer() {
        try {
            cancelPlayProgressTimer();
            this.mHandler.post(this.playProgressRunnable);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void closeSound() {
        try {
            C1498ad c1498ad = this.exoPlayer;
            if (c1498ad == null) {
                return;
            }
            c1498ad.m6301a(0.0f);
            this.mIsSilent = true;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public boolean exoPlayerIsPlaying() {
        return this.exoPlayer.m6298J();
    }

    public boolean fullScreenLoadingViewisVisible() {
        try {
            View view = this.mFullScreenLoadingView;
            if (view != null) {
                return view.getVisibility() == 0;
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public int getCurPosition() {
        return (int) this.mCurrentPosition;
    }

    public int getDuration() {
        C1498ad c1498ad = this.exoPlayer;
        if (c1498ad == null) {
            return 0;
        }
        c1498ad.mo6346s();
        return 0;
    }

    public boolean getIsFrontDesk() {
        return this.mIsFrontDesk;
    }

    public boolean halfLoadingViewisVisible() {
        try {
            WeakReference<View> weakReference = this.mLoadingView;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            return this.mLoadingView.get().getVisibility() == 0;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public boolean hasPrepare() {
        return this.mHasPrepare;
    }

    public void initBufferIngParam(int i) {
        if (i > 0) {
            this.mBufferTime = i;
        }
        this.mIsNeedBufferingTimeout = true;
        StringBuilder sb = new StringBuilder("mIsNeedBufferingTimeout:");
        sb.append(this.mIsNeedBufferingTimeout);
        sb.append("  mMaxBufferTime:");
        sb.append(this.mBufferTime);
    }

    public boolean initPlayer(Context context, View view, String str, String str2, int i, VideoPlayerStatusListener videoPlayerStatusListener) {
        try {
            if (view == null) {
                postOnPlayErrorOnMainThread("MediaPlayer init error");
                return false;
            }
            this.needPrepareVideoPlayAgain = !TextUtils.equals(str, str2);
            this.mMediaSourceUrl = str;
            this.mNetVideoUrl = str2;
            this.mVideoReadyRate = i;
            this.mContext = context;
            this.mOutterVFListener = videoPlayerStatusListener;
            this.mLoadingView = new WeakReference<>(view);
            this.exoPlayer = C1658i.m7561a(new C1575f(context), new C1661c(), new C1531d());
            this.mediaSource = new C1646o.c(new C1698o(context, "AnyThink_ExoPlayer")).mo7246b(Uri.parse(str));
            this.exoPlayer.mo6302a(0);
            this.exoPlayer.mo6310a(this.mediaSource);
            this.exoPlayer.mo6314a(this);
            return true;
        } catch (Throwable th) {
            th.getMessage();
            postOnPlayErrorOnMainThread(th.toString());
            return false;
        }
    }

    public boolean isComplete() {
        return this.mIsComplete;
    }

    public boolean isPlayIng() {
        try {
            if (this.exoPlayer != null) {
                return exoPlayerIsPlaying();
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isSilent() {
        return this.mIsSilent;
    }

    public void justSeekTo(int i) {
        try {
            this.mCurrentPosition = i;
            boolean z = this.mHasPrepare;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void onBufferingUpdate(int i) {
    }

    public void onCompletion() {
        try {
            this.mIsComplete = true;
            this.mIsPlaying = false;
            this.mCurrentPosition = 0L;
            hideLoading();
            postOnPlayCompletedOnMainThread();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public boolean onError(int i, String str) {
        try {
            StringBuilder sb = new StringBuilder("onError what: ");
            sb.append(i);
            sb.append(" extra: ");
            sb.append(str);
            hideLoading();
            if (!this.mIsFrontDesk && "MIX 3".equalsIgnoreCase(C1341e.m4048a()) && C1341e.m4054b().equalsIgnoreCase("Xiaomi")) {
                return true;
            }
            this.mHasPrepare = false;
            postOnPlayErrorOnMainThread(str);
        } catch (Exception e) {
            e.getMessage();
        }
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onPlaybackParametersChanged(C1765v c1765v) {
        new StringBuilder("onPlaybackParametersChanged : ").append(c1765v.f10070b);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onPlayerError(C1581g c1581g) {
        boolean z;
        StringBuilder sb;
        InterfaceC1973c interfaceC1973c = this.tempEventListener;
        if (interfaceC1973c != null) {
            interfaceC1973c.mo10465e();
        }
        String message = "Play error and ExoPlayer have not message.";
        if (c1581g != null) {
            int i = c1581g.f8497d;
            z = true;
            if (i != 0) {
                if (i == 1) {
                    message = "Play error, because have a RendererException.";
                } else if (i == 2) {
                    message = "Play error, because have a UnexpectedException.";
                }
                z = false;
            } else {
                message = "Play error, because have a SourceException.";
            }
            if (c1581g.getCause() != null && !TextUtils.isEmpty(c1581g.getCause().getMessage())) {
                message = c1581g.getCause().getMessage();
            }
        } else {
            z = false;
        }
        if (this.needPrepareVideoPlayAgain && z) {
            this.mPlayLocalVideoFileErrorStr = message;
            this.needPrepareVideoPlayAgain = false;
            rePrepareVideoSourceAgain();
            return;
        }
        long jMo6347t = 0;
        try {
            jMo6347t = this.exoPlayer.mo6347t();
        } catch (Throwable unused) {
        }
        String str = "videoUrl" + this.mNetVideoUrl + ",readyRate:" + this.mVideoReadyRate + ",cdRate:0,play process:" + jMo6347t;
        if (TextUtils.isEmpty(this.mPlayLocalVideoFileErrorStr)) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(",localFileErrorMsg:");
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(",localFileErrorMsg:");
            sb.append(this.mPlayLocalVideoFileErrorStr);
            sb.append(",errorMsg:");
        }
        sb.append(message);
        onError(c1581g.f8497d, sb.toString());
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onPlayerStateChanged(boolean z, int i) {
        if (i == 2) {
            this.mIsBuffering = true;
            showLoading();
            startBufferIngTimer("play buffering tiemout");
        } else {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                cancelPlayProgressTimer();
                onCompletion();
                return;
            }
            this.mIsBuffering = false;
            hideLoading();
            postOnBufferinEndOnMainThread();
            onPrepared();
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onPositionDiscontinuity(int i) {
    }

    public void onPrepared() {
        InterfaceC1973c interfaceC1973c;
        try {
            new StringBuilder("onPrepared:").append(this.mHasPrepare);
            if (!this.mHasPrepare && (interfaceC1973c = this.tempEventListener) != null) {
                interfaceC1973c.mo10464d();
            }
            this.mHasPrepare = true;
            if (!this.mIsFrontDesk && this.exoPlayer != null) {
                pause();
            }
            boolean z = this.mIsFrontDesk;
            if (z && z) {
                hideLoading();
                this.mHasPrepare = true;
                if (this.exoPlayer != null) {
                    this.mIsPlaying = true;
                }
                postOnBufferinEndOnMainThread();
                startPlayProgressTimer();
                StringBuilder sb = new StringBuilder("onPrepare mCurrentPosition:");
                sb.append(this.mCurrentPosition);
                sb.append(" onPrepare mHasPrepare:");
                sb.append(this.mHasPrepare);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onSeekProcessed() {
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onTimelineChanged(AbstractC1499ae abstractC1499ae, @Nullable Object obj, int i) {
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.c
    public void onTracksChanged(C1621af c1621af, C1665g c1665g) {
    }

    public void openSound() {
        try {
            C1498ad c1498ad = this.exoPlayer;
            if (c1498ad == null) {
                return;
            }
            c1498ad.m6301a(1.0f);
            this.mIsSilent = false;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void pause() {
        try {
            if (this.exoPlayer != null) {
                StringBuilder sb = new StringBuilder("pause isPalying:");
                sb.append(exoPlayerIsPlaying());
                sb.append(" mIsPlaying:");
                sb.append(this.mIsPlaying);
                hideLoading();
                this.exoPlayer.mo6315a(false);
                this.mIsPlaying = false;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void play() {
        this.exoPlayer.mo6315a(true);
    }

    public void play(String str, int i) {
        try {
            synchronized (this.mLock) {
                new StringBuilder("Start Play currentionPosition:").append(this.mCurrentPosition);
                if (i > 0) {
                    this.mCurrentPosition = i;
                }
                if (TextUtils.isEmpty(str)) {
                    postOnPlayErrorOnMainThread("play url is null");
                    return;
                }
                this.mPlayUrl = str;
                this.mHasPrepare = false;
                this.mIsFrontDesk = true;
                showLoading();
                setDataSource();
                new StringBuilder("mPlayUrl:").append(this.mPlayUrl);
            }
        } catch (Exception e) {
            e.getMessage();
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }

    public void play(String str, SurfaceHolder surfaceHolder) {
        try {
            synchronized (this.mLock) {
                if (TextUtils.isEmpty(str)) {
                    postOnPlayErrorOnMainThread("play url is null");
                    return;
                }
                this.mPlayUrl = str;
                this.mHasPrepare = false;
                this.mIsFrontDesk = true;
                this.mSurfaceHolder = surfaceHolder;
                showLoading();
                setDataSource();
                new StringBuilder("mPlayUrl:").append(this.mPlayUrl);
            }
        } catch (Exception e) {
            e.getMessage();
            releasePlayer();
            hideLoading();
            postOnPlayErrorOnMainThread("mediaplayer cannot play");
        }
    }

    public void prepare() {
        C1498ad c1498ad;
        try {
            if (this.mHasPrepare || (c1498ad = this.exoPlayer) == null) {
                return;
            }
            c1498ad.mo6310a(this.mediaSource);
            this.mHasPrepare = true;
            this.mIsPlaying = false;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void releasePlayer() {
        try {
            cancelPlayProgressTimer();
            cancelBufferTimeoutTimer();
            if (this.exoPlayer != null) {
                stop();
                this.exoPlayer.mo6324b(this);
                this.exoPlayer.mo6341n();
                this.mInnerVFPLisener = null;
                this.mOutterVFListener = null;
            }
            hideLoading();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void seekTo(int i) {
        C1498ad c1498ad;
        long j = i;
        try {
            this.mCurrentPosition = j;
            if (this.mHasPrepare && (c1498ad = this.exoPlayer) != null) {
                c1498ad.mo6304a(j);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setDataSource() {
        try {
            if (this.exoPlayer != null) {
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    setDisplay(surfaceHolder);
                }
                boolean zExists = false;
                this.mHasPrepare = false;
                if (!TextUtils.equals(this.mMediaSourceUrl, this.mNetVideoUrl)) {
                    try {
                        zExists = new File(this.mMediaSourceUrl).exists();
                    } catch (Throwable unused) {
                    }
                    if (!zExists) {
                        this.mediaSource = new C1646o.c(new C1698o(this.mContext, "AnyThink_ExoPlayer")).mo7246b(Uri.parse(this.mNetVideoUrl));
                        this.mMediaSourceUrl = this.mNetVideoUrl;
                    }
                }
                if (TextUtils.equals(this.mMediaSourceUrl, this.mNetVideoUrl) && this.mVideoReadyRate > 0) {
                    C1322e.m3913a("Video Play Fail:Play Network Url", "AdxExpress videoUrl:" + this.mPlayUrl + ",readyRate:" + this.mVideoReadyRate + ",maxVideoCacheSize:" + C1160l.m1996a().m2007c() + ",lastRecycleCheckDownloadedFileSize:" + C1160l.m1996a().m2008d(), C1175n.m2059a().m2168q());
                }
                new StringBuilder("Real Play Url:").append(this.mMediaSourceUrl);
                this.exoPlayer.mo6310a(this.mediaSource);
                this.exoPlayer.mo6315a(true);
                startBufferIngTimer(PlayerErrorConstant.PREPARE_TIMEOUT);
            }
        } catch (Exception e) {
            e.getMessage();
            hideLoading();
            postOnPlayErrorOnMainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
            postOnPlaySetDataSourceError2MainThread(PlayerErrorConstant.ILLEGAL_VIDEO_ADDRESS);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.exoPlayer.mo6306a(surfaceHolder);
        } catch (Throwable th) {
            th.getMessage();
            postOnPlayErrorOnMainThread(th.toString());
        }
    }

    public void setFullScreenLoadingView(View view) {
        if (view != null) {
            try {
                this.mFullScreenLoadingView = view;
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public void setIsComplete(boolean z) {
        this.mIsComplete = z;
    }

    public void setIsFrontDesk(boolean z) {
        try {
            this.mIsFrontDesk = z;
            new StringBuilder("isFrontDesk: ").append(z ? "frontStage" : "backStage");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setPlaybackParams(float f) {
        try {
            if (exoPlayerIsPlaying()) {
                this.exoPlayer.mo6313a(new C1765v(f));
            } else {
                this.exoPlayer.mo6313a(new C1765v(f));
                this.exoPlayer.mo6340m();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setSelfVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mInnerVFPLisener = videoPlayerStatusListener;
    }

    public void setTempEventListener(InterfaceC1973c interfaceC1973c) {
        this.tempEventListener = interfaceC1973c;
    }

    public void setVideoFeedsPlayerListener(VideoPlayerStatusListener videoPlayerStatusListener) {
        this.mOutterVFListener = videoPlayerStatusListener;
    }

    public void setVolume(float f, float f2) {
        try {
            C1498ad c1498ad = this.exoPlayer;
            if (c1498ad != null) {
                c1498ad.m6301a(f2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void showLoading() {
        try {
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.anythink.expressad.playercommon.VideoFeedsPlayer.4
                @Override // java.lang.Runnable
                public void run() {
                    if (VideoFeedsPlayer.this.mFullScreenLoadingView != null) {
                        VideoFeedsPlayer.this.mFullScreenLoadingView.setVisibility(0);
                    }
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void start(boolean z) {
        try {
            if (this.exoPlayer == null || exoPlayerIsPlaying()) {
                return;
            }
            showLoading();
            play();
            this.mIsPlaying = true;
            if (z) {
                startPlayProgressTimer();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void stop() {
        try {
            if (this.mHasPrepare && this.exoPlayer != null) {
                hideLoading();
                this.exoPlayer.mo6340m();
                this.mHasPrepare = false;
                this.mIsPlaying = false;
                this.mIsComplete = true;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
