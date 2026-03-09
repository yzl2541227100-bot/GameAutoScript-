package com.anythink.expressad.foundation.p120g.p137i;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1866a {

    /* JADX INFO: renamed from: b */
    private String f11488b;

    /* JADX INFO: renamed from: c */
    private MediaPlayer f11489c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f11490d;

    /* JADX INFO: renamed from: f */
    private volatile MediaPlayer.OnPreparedListener f11492f;

    /* JADX INFO: renamed from: a */
    public Object f11487a = new Object();

    /* JADX INFO: renamed from: e */
    private volatile boolean f11491e = false;

    /* JADX INFO: renamed from: a */
    private void m9660a(MediaPlayer.OnPreparedListener onPreparedListener) {
        synchronized (this.f11487a) {
            this.f11492f = onPreparedListener;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9661a(MediaPlayer mediaPlayer, String str) {
        this.f11489c = mediaPlayer;
        this.f11488b = str;
        this.f11490d = true;
        this.f11489c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.anythink.expressad.foundation.g.i.a.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                synchronized (C1866a.this.f11487a) {
                    C1866a.m9663a(C1866a.this);
                    if (C1866a.this.f11492f != null) {
                        C1866a.this.f11492f.onPrepared(mediaPlayer2);
                    }
                }
            }
        });
        try {
            this.f11489c.prepareAsync();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m9662a() {
        boolean z;
        synchronized (this.f11487a) {
            z = this.f11490d;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m9663a(C1866a c1866a) {
        c1866a.f11491e = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m9665b() {
        boolean z;
        synchronized (this.f11487a) {
            z = this.f11491e;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    private String m9666c() {
        return this.f11488b;
    }

    /* JADX INFO: renamed from: d */
    private MediaPlayer m9667d() {
        return this.f11489c;
    }
}
