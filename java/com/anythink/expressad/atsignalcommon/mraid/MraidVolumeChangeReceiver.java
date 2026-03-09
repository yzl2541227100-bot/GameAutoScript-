package com.anythink.expressad.atsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class MraidVolumeChangeReceiver {

    /* JADX INFO: renamed from: a */
    public static double f6725a = -1.0d;

    /* JADX INFO: renamed from: b */
    private static final String f6726b = "android.media.VOLUME_CHANGED_ACTION";

    /* JADX INFO: renamed from: c */
    private static final String f6727c = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    /* JADX INFO: renamed from: d */
    private Context f6728d;

    /* JADX INFO: renamed from: e */
    private AudioManager f6729e;

    /* JADX INFO: renamed from: f */
    private boolean f6730f = false;

    /* JADX INFO: renamed from: g */
    private VolumeChangeListener f6731g;

    /* JADX INFO: renamed from: h */
    private VolumeChangeBroadcastReceiver f6732h;

    public static class VolumeChangeBroadcastReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private WeakReference<MraidVolumeChangeReceiver> f6733a;

        public VolumeChangeBroadcastReceiver(MraidVolumeChangeReceiver mraidVolumeChangeReceiver) {
            this.f6733a = new WeakReference<>(mraidVolumeChangeReceiver);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MraidVolumeChangeReceiver mraidVolumeChangeReceiver;
            VolumeChangeListener volumeChangeListener;
            if (!MraidVolumeChangeReceiver.f6726b.equals(intent.getAction()) || intent.getIntExtra(MraidVolumeChangeReceiver.f6727c, -1) != 3 || (mraidVolumeChangeReceiver = this.f6733a.get()) == null || (volumeChangeListener = mraidVolumeChangeReceiver.getVolumeChangeListener()) == null) {
                return;
            }
            double currentVolume = mraidVolumeChangeReceiver.getCurrentVolume();
            if (currentVolume >= 0.0d) {
                volumeChangeListener.onVolumeChanged(currentVolume);
            }
        }
    }

    public interface VolumeChangeListener {
        void onVolumeChanged(double d);
    }

    public MraidVolumeChangeReceiver(Context context) {
        this.f6728d = context;
        this.f6729e = (AudioManager) context.getApplicationContext().getSystemService(C1732o.f9732b);
    }

    public double getCurrentVolume() {
        AudioManager audioManager = this.f6729e;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f6729e;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f6725a = streamVolume;
        return streamVolume;
    }

    public VolumeChangeListener getVolumeChangeListener() {
        return this.f6731g;
    }

    public void registerReceiver() {
        if (this.f6728d != null) {
            this.f6732h = new VolumeChangeBroadcastReceiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(f6726b);
            this.f6728d.registerReceiver(this.f6732h, intentFilter);
            this.f6730f = true;
        }
    }

    public void setVolumeChangeListener(VolumeChangeListener volumeChangeListener) {
        this.f6731g = volumeChangeListener;
    }

    public void unregisterReceiver() {
        Context context;
        if (!this.f6730f || (context = this.f6728d) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f6732h);
            this.f6731g = null;
            this.f6730f = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
