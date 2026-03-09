package com.iflytek.voiceads.view;

import android.content.Context;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.iflytek.voiceads.listener.IFLYAdListener;
import com.iflytek.voiceads.listener.InternalListener;
import com.iflytek.voiceads.param.C2969d;
import com.iflytek.voiceads.utils.C2983a;
import com.iflytek.voiceads.utils.C2984b;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class BannerAdView extends AdView {

    /* JADX INFO: renamed from: t */
    private boolean f16601t;

    /* JADX INFO: renamed from: u */
    private Context f16602u;

    /* JADX INFO: renamed from: v */
    private boolean f16603v;

    public BannerAdView(Context context) {
        super(context);
        this.f16601t = false;
        this.f16603v = true;
    }

    public BannerAdView(Context context, RelativeLayout relativeLayout, String str, InternalListener internalListener) {
        super(context, relativeLayout, str, C2983a.a.BANNER, internalListener);
        this.f16601t = false;
        this.f16603v = true;
        this.f16602u = context.getApplicationContext();
    }

    @Override // com.iflytek.voiceads.view.AdView
    /* JADX INFO: renamed from: a */
    public synchronized void mo13704a(IFLYAdListener iFLYAdListener) {
        if (!this.f16601t) {
            this.f16601t = true;
            super.mo13704a(iFLYAdListener);
        }
    }

    @Override // com.iflytek.voiceads.view.AdView
    /* JADX INFO: renamed from: d */
    protected synchronized void mo13713d(Message message) throws Exception {
        if (C2984b.m13532a(this.f16602u) || C2984b.m13537b(this.f16602u)) {
            C2989g.m13555a("IFLY_AD_SDK", "Ad is invisible, please check the app's state!");
            this.f16587l.m13731a(this.f16587l.obtainMessage(1), m13714e());
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f16577b.getParent();
            if (viewGroup == null) {
                C2989g.m13555a("IFLY_AD_SDK", "Ad has no parent!");
            } else {
                if (this.f16603v) {
                    this.f16603v = false;
                } else if (!this.f16577b.isShown()) {
                    C2989g.m13555a("IFLY_AD_SDK", "Ad is invisible, recycle delayed!");
                    this.f16587l.m13731a(this.f16587l.obtainMessage(1), m13714e());
                } else if (!C2984b.m13534a(this.f16602u, viewGroup)) {
                    C2989g.m13555a("IFLY_AD_SDK", "Ad is invisible,not in screen, recycle delayed!");
                    this.f16587l.m13731a(this.f16587l.obtainMessage(1), m13714e());
                }
                super.mo13713d(message);
            }
        }
    }

    @Override // com.iflytek.voiceads.view.AdView
    /* JADX INFO: renamed from: h */
    protected synchronized void mo13717h() {
        C2989g.m13555a("IFLY_AD_SDK", "recycleLoadAd");
        if (this.f16577b.getParent() == null) {
            C2989g.m13555a("IFLY_AD_SDK", "There isn't valid parent widget!");
        } else if (C2983a.c.end != this.f16587l.m13728a()) {
            C2989g.m13555a("IFLY_AD_SDK", "Ad is requesting, can't recycle load ad!");
        } else if (m13715f()) {
            this.f16587l.m13731a(this.f16587l.obtainMessage(1), m13714e());
        } else {
            this.f16601t = false;
        }
    }

    @Override // com.iflytek.voiceads.view.AdView
    /* JADX INFO: renamed from: k */
    public void mo13720k() {
        int iMin = Math.min(C2969d.m13461c(this.f16602u), C2969d.m13463d(this.f16602u));
        int iM13448b = (this.f16580e.m13448b() * iMin) / this.f16580e.m13444a();
        this.f16577b.setGravity(17);
        m13702a(iMin, iM13448b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
