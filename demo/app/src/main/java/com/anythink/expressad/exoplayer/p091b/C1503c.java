package com.anythink.expressad.exoplayer.p091b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.c */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public final class C1503c {

    /* JADX INFO: renamed from: a */
    public static final C1503c f7539a = new C1503c(new int[]{2}, 2);

    /* JADX INFO: renamed from: b */
    private final int[] f7540b;

    /* JADX INFO: renamed from: c */
    private final int f7541c;

    private C1503c(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f7540b = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f7540b = new int[0];
        }
        this.f7541c = i;
    }

    /* JADX INFO: renamed from: a */
    private int m6413a() {
        return this.f7541c;
    }

    /* JADX INFO: renamed from: a */
    public static C1503c m6414a(Context context) {
        return m6415a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public static C1503c m6415a(Intent intent) {
        return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f7539a : new C1503c(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6416a(int i) {
        return Arrays.binarySearch(this.f7540b, i) >= 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1503c)) {
            return false;
        }
        C1503c c1503c = (C1503c) obj;
        return Arrays.equals(this.f7540b, c1503c.f7540b) && this.f7541c == c1503c.f7541c;
    }

    public final int hashCode() {
        return this.f7541c + (Arrays.hashCode(this.f7540b) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f7541c + ", supportedEncodings=" + Arrays.toString(this.f7540b) + "]";
    }
}
