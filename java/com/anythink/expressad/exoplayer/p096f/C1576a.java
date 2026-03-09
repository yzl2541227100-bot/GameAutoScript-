package com.anythink.expressad.exoplayer.p096f;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1732o;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.a */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class C1576a {

    /* JADX INFO: renamed from: a */
    public static final String f8404a = "MediaCodecInfo";

    /* JADX INFO: renamed from: b */
    public static final int f8405b = -1;

    /* JADX INFO: renamed from: c */
    public final String f8406c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f8407d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f8408e;

    /* JADX INFO: renamed from: f */
    public final boolean f8409f;

    /* JADX INFO: renamed from: g */
    public final boolean f8410g;

    /* JADX INFO: renamed from: h */
    public final boolean f8411h;

    /* JADX INFO: renamed from: i */
    public final boolean f8412i;

    /* JADX WARN: Removed duplicated region for block: B:52:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1576a(java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r3, boolean r4, boolean r5, boolean r6) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.anythink.expressad.exoplayer.p107k.C1711a.m8005a(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.f8406c = r1
            r0.f8407d = r2
            r0.f8408e = r3
            r0.f8412i = r4
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L2c
            if (r3 == 0) goto L2c
            int r4 = com.anythink.expressad.exoplayer.p107k.C1717af.f9627a
            r5 = 19
            if (r4 < r5) goto L27
            java.lang.String r4 = "adaptive-playback"
            boolean r4 = r3.isFeatureSupported(r4)
            if (r4 == 0) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            if (r4 == 0) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            r0.f8409f = r4
            r4 = 21
            if (r3 == 0) goto L46
            int r5 = com.anythink.expressad.exoplayer.p107k.C1717af.f9627a
            if (r5 < r4) goto L41
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r3.isFeatureSupported(r5)
            if (r5 == 0) goto L41
            r5 = 1
            goto L42
        L41:
            r5 = 0
        L42:
            if (r5 == 0) goto L46
            r5 = 1
            goto L47
        L46:
            r5 = 0
        L47:
            r0.f8410g = r5
            if (r6 != 0) goto L60
            if (r3 == 0) goto L5f
            int r5 = com.anythink.expressad.exoplayer.p107k.C1717af.f9627a
            if (r5 < r4) goto L5b
            java.lang.String r4 = "secure-playback"
            boolean r3 = r3.isFeatureSupported(r4)
            if (r3 == 0) goto L5b
            r3 = 1
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 == 0) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            r0.f8411h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p096f.C1576a.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):void");
    }

    /* JADX INFO: renamed from: a */
    private static int m6998a(String str, String str2, int i) {
        if (i > 1 || ((C1717af.f9627a >= 26 && i > 0) || C1732o.f9750t.equals(str2) || C1732o.f9701I.equals(str2) || C1732o.f9702J.equals(str2) || C1732o.f9748r.equals(str2) || C1732o.f9699G.equals(str2) || C1732o.f9700H.equals(str2) || C1732o.f9753w.equals(str2) || C1732o.f9703K.equals(str2) || C1732o.f9754x.equals(str2) || C1732o.f9755y.equals(str2) || C1732o.f9705M.equals(str2))) {
            return i;
        }
        int i2 = C1732o.f9756z.equals(str2) ? 6 : C1732o.f9693A.equals(str2) ? 16 : 30;
        Log.w(f8404a, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static C1576a m6999a(String str) {
        return new C1576a(str, null, null, true, false, false);
    }

    /* JADX INFO: renamed from: a */
    private static C1576a m7000a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return new C1576a(str, str2, codecCapabilities, false, false, false);
    }

    /* JADX INFO: renamed from: a */
    public static C1576a m7001a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z3) {
        return new C1576a(str, str2, codecCapabilities, false, z, z3);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7002a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C1717af.f9627a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    private static boolean m7003a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    /* JADX INFO: renamed from: b */
    private int m7004b() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (C1717af.f9627a < 23 || (codecCapabilities = this.f8408e) == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: b */
    private static boolean m7005b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX INFO: renamed from: c */
    private void m7006c(String str) {
        Log.d(f8404a, "NoSupport [" + str + "] [" + this.f8406c + ", " + this.f8407d + "] [" + C1717af.f9631e + "]");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m7007c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C1717af.f9627a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* JADX INFO: renamed from: d */
    private void m7008d(String str) {
        Log.d(f8404a, "AssumedSupport [" + str + "] [" + this.f8406c + ", " + this.f8407d + "] [" + C1717af.f9631e + "]");
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: d */
    private static boolean m7009d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* JADX INFO: renamed from: e */
    private static boolean m7010e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C1717af.f9627a >= 21 && codecCapabilities.isFeatureSupported("secure-playback");
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: f */
    private static boolean m7011f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: g */
    private static int m7012g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public final Point m7013a(int i, int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8408e;
        if (codecCapabilities == null) {
            str = "align.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(C1717af.m8049a(i, widthAlignment) * widthAlignment, C1717af.m8049a(i2, heightAlignment) * heightAlignment);
            }
            str = "align.vCaps";
        }
        m7006c(str);
        return null;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public final boolean m7014a(int i) {
        String strConcat;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8408e;
        if (codecCapabilities == null) {
            strConcat = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                strConcat = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i)) {
                    return true;
                }
                strConcat = "sampleRate.support, ".concat(String.valueOf(i));
            }
        }
        m7006c(strConcat);
        return false;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public final boolean m7015a(int i, int i2, double d) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8408e;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else {
                if (m7003a(videoCapabilities, i, i2, d)) {
                    return true;
                }
                if (i < i2 && m7003a(videoCapabilities, i2, i, d)) {
                    Log.d(f8404a, "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f8406c + ", " + this.f8407d + "] [" + C1717af.f9631e + "]");
                    return true;
                }
                str = "sizeAndRate.support, " + i + "x" + i2 + "x" + d;
            }
        }
        m7006c(str);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final MediaCodecInfo.CodecProfileLevel[] m7016a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8408e;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: b */
    public final boolean m7017b(int i) {
        String strConcat;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8408e;
        if (codecCapabilities == null) {
            strConcat = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                strConcat = "channelCount.aCaps";
            } else {
                String str = this.f8406c;
                String str2 = this.f8407d;
                int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((C1717af.f9627a < 26 || maxInputChannelCount <= 0) && !C1732o.f9750t.equals(str2) && !C1732o.f9701I.equals(str2) && !C1732o.f9702J.equals(str2) && !C1732o.f9748r.equals(str2) && !C1732o.f9699G.equals(str2) && !C1732o.f9700H.equals(str2) && !C1732o.f9753w.equals(str2) && !C1732o.f9703K.equals(str2) && !C1732o.f9754x.equals(str2) && !C1732o.f9755y.equals(str2) && !C1732o.f9705M.equals(str2))) {
                    int i2 = C1732o.f9756z.equals(str2) ? 6 : C1732o.f9693A.equals(str2) ? 16 : 30;
                    Log.w(f8404a, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i2 + "]");
                    maxInputChannelCount = i2;
                }
                if (maxInputChannelCount >= i) {
                    return true;
                }
                strConcat = "channelCount.support, ".concat(String.valueOf(i));
            }
        }
        m7006c(strConcat);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7018b(String str) {
        String strM8204c;
        StringBuilder sb;
        if (str == null || this.f8407d == null || (strM8204c = C1732o.m8204c(str)) == null) {
            return true;
        }
        if (this.f8407d.equals(strM8204c)) {
            Pair<Integer, Integer> pairM7056a = C1579d.m7056a(str);
            if (pairM7056a == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m7016a()) {
                if (codecProfileLevel.profile == ((Integer) pairM7056a.first).intValue() && codecProfileLevel.level >= ((Integer) pairM7056a.second).intValue()) {
                    return true;
                }
            }
            sb = new StringBuilder("codec.profileLevel, ");
        } else {
            sb = new StringBuilder("codec.mime ");
        }
        sb.append(str);
        sb.append(", ");
        sb.append(strM8204c);
        m7006c(sb.toString());
        return false;
    }
}
