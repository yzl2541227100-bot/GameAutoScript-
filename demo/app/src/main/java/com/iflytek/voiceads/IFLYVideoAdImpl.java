package com.iflytek.voiceads;

import android.content.Context;
import android.view.ViewGroup;
import com.iflytek.voiceads.listener.IFLYVideoListener;
import com.iflytek.voiceads.p218e.C2954a;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class IFLYVideoAdImpl extends IFLYVideoAd {

    /* JADX INFO: renamed from: a */
    private C2954a f16114a;

    public IFLYVideoAdImpl(Context context, String str, int i, IFLYVideoListener iFLYVideoListener) {
        this.f16114a = new C2954a(context, str, i, iFLYVideoListener);
    }

    public boolean backPressed() {
        if (this.f16114a != null) {
            return this.f16114a.m13425j();
        }
        return false;
    }

    public void cacheVideo() {
        if (this.f16114a != null) {
            this.f16114a.m13415b();
        }
    }

    public ViewGroup getVideoView() {
        if (this.f16114a != null) {
            return this.f16114a.f16343a;
        }
        return null;
    }

    public boolean isPlaying() {
        if (this.f16114a != null) {
            return this.f16114a.m13424i();
        }
        return false;
    }

    public void loadAd() {
        if (this.f16114a != null) {
            this.f16114a.m13411a();
        }
    }

    public void onPause() {
        if (this.f16114a != null) {
            this.f16114a.m13422g();
        }
    }

    public void onResume() {
        if (this.f16114a != null) {
            this.f16114a.m13423h();
        }
    }

    public void release() {
        if (this.f16114a != null) {
            this.f16114a.m13420e();
        }
    }

    public void setDirectJump(boolean z) {
        if (this.f16114a != null) {
            this.f16114a.m13418c(z);
        }
    }

    public void setParameter(String str, Object obj) {
        if (this.f16114a != null) {
            this.f16114a.m13412a(str, obj);
        }
    }

    public void setVolume(boolean z) {
        if (this.f16114a != null) {
            this.f16114a.m13413a(z);
        }
    }

    public void setWifiTip(boolean z) {
        if (this.f16114a != null) {
            this.f16114a.m13416b(z);
        }
    }

    public void showAd(Object... objArr) {
        if (this.f16114a != null) {
            this.f16114a.m13414a(objArr);
        }
    }

    public void skipAd() {
        if (this.f16114a != null) {
            this.f16114a.m13421f();
        }
    }

    public void startPlay() {
        if (this.f16114a != null) {
            this.f16114a.m13419d();
        }
    }

    public void videoDownScroll() {
        if (this.f16114a != null) {
            this.f16114a.m13427l();
        }
    }

    public void videoUpScroll() {
        if (this.f16114a != null) {
            this.f16114a.m13426k();
        }
    }
}
