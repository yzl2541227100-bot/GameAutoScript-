package com.iflytek.voiceads.videolib;

import android.media.AudioManager;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.l */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
class C3010l implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ JZPlayer f16568a;

    C3010l(JZPlayer jZPlayer) {
        this.f16568a = jZPlayer;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        switch (i) {
            case -2:
                try {
                    JZPlayer jZPlayerM13684c = C3013o.m13684c();
                    if (jZPlayerM13684c != null && jZPlayerM13684c.f16497g == 3) {
                        jZPlayerM13684c.f16503m.performClick();
                        break;
                    }
                } catch (Exception e) {
                    C2989g.m13557b("JZVideoPlayer", "audio focus" + e.getMessage());
                    return;
                }
                break;
            case -1:
                this.f16568a.m13594a();
                break;
        }
    }
}
