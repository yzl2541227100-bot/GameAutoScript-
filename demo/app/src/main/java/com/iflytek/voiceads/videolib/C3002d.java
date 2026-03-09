package com.iflytek.voiceads.videolib;

import android.media.MediaPlayer;
import android.view.Surface;
import com.iflytek.voiceads.utils.C2989g;
import java.util.Map;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C3002d extends AbstractC3000b implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: b */
    public MediaPlayer f16556b;

    @Override // com.iflytek.voiceads.videolib.AbstractC3000b
    /* JADX INFO: renamed from: a */
    public void mo13656a() {
        if (this.f16556b != null) {
            try {
                this.f16556b.start();
            } catch (Exception e) {
                C2989g.m13557b("JZVideoPlayer", "media start" + e.getMessage());
            }
        }
    }

    @Override // com.iflytek.voiceads.videolib.AbstractC3000b
    /* JADX INFO: renamed from: a */
    public void mo13657a(long j) {
        if (this.f16556b != null) {
            try {
                this.f16556b.seekTo((int) j);
            } catch (Exception e) {
                C2989g.m13557b("JZVideoPlayer", "media seek:" + e.getMessage());
            }
        }
    }

    @Override // com.iflytek.voiceads.videolib.AbstractC3000b
    /* JADX INFO: renamed from: a */
    public void mo13658a(Surface surface) {
        if (this.f16556b != null) {
            this.f16556b.setSurface(surface);
        }
    }

    @Override // com.iflytek.voiceads.videolib.AbstractC3000b
    /* JADX INFO: renamed from: a */
    public void mo13659a(boolean z) {
        if (this.f16556b != null) {
            if (z) {
                this.f16556b.setVolume(0.0f, 0.0f);
            } else {
                this.f16556b.setVolume(1.0f, 1.0f);
            }
        }
    }

    @Override // com.iflytek.voiceads.videolib.AbstractC3000b
    /* JADX INFO: renamed from: b */
    public void mo13660b() {
        try {
            this.f16556b = new MediaPlayer();
            this.f16556b.setVolume(0.0f, 0.0f);
            this.f16556b.setAudioStreamType(3);
            this.f16556b.setLooping(this.f16543a.f16541f);
            this.f16556b.setOnPreparedListener(this);
            this.f16556b.setOnCompletionListener(this);
            this.f16556b.setOnBufferingUpdateListener(this);
            this.f16556b.setScreenOnWhilePlaying(true);
            this.f16556b.setOnSeekCompleteListener(this);
            this.f16556b.setOnErrorListener(this);
            this.f16556b.setOnInfoListener(this);
            this.f16556b.setOnVideoSizeChangedListener(this);
            MediaPlayer.class.getDeclaredMethod("setDataSource", String.class, Map.class).invoke(this.f16556b, this.f16543a.m13653a().toString(), this.f16543a.f16540e);
            this.f16556b.prepareAsync();
        } catch (Exception e) {
            C2989g.m13557b("JZVideoPlayer", "media prepare:" + e.getMessage());
        }
    }

    @Override // com.iflytek.voiceads.videolib.AbstractC3000b
    /* JADX INFO: renamed from: c */
    public void mo13661c() {
        if (this.f16556b != null) {
            try {
                this.f16556b.pause();
            } catch (Exception e) {
                C2989g.m13557b("JZVideoPlayer", "media pause:" + e.getMessage());
            }
        }
    }

    @Override // com.iflytek.voiceads.videolib.AbstractC3000b
    /* JADX INFO: renamed from: d */
    public void mo13662d() {
        if (this.f16556b != null) {
            this.f16556b.release();
        }
    }

    @Override // com.iflytek.voiceads.videolib.AbstractC3000b
    /* JADX INFO: renamed from: e */
    public long mo13663e() {
        if (this.f16556b != null) {
            return this.f16556b.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.iflytek.voiceads.videolib.AbstractC3000b
    /* JADX INFO: renamed from: f */
    public long mo13664f() {
        if (this.f16556b != null) {
            return this.f16556b.getDuration();
        }
        return 0L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16554k.post(new RunnableC3005g(this, i));
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16554k.post(new RunnableC3004f(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16554k.post(new RunnableC3007i(this, i, i2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16554k.post(new RunnableC3008j(this, i));
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        String lowerCase = this.f16543a.m13653a().toString().toLowerCase();
        if (lowerCase.contains("mp3") || lowerCase.contains("wav")) {
            TextureViewSurfaceTextureListenerC3001c.m13665a().f16554k.post(new RunnableC3003e(this));
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16554k.post(new RunnableC3006h(this));
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16550g = i;
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16551h = i2;
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16554k.post(new RunnableC3009k(this));
    }
}
