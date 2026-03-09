package com.anythink.expressad.exoplayer.p107k;

import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1581g;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1765v;
import com.anythink.expressad.exoplayer.p090a.InterfaceC1494b;
import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p101h.C1620ae;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1651t;
import com.anythink.expressad.exoplayer.p104i.AbstractC1663e;
import com.anythink.expressad.exoplayer.p104i.C1665g;
import com.anythink.expressad.exoplayer.p104i.InterfaceC1664f;
import io.reactivex.annotations.SchedulerSupport;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import p285z2.C4003ix;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1726i implements InterfaceC1494b {

    /* JADX INFO: renamed from: a */
    private static final String f9672a = "EventLogger";

    /* JADX INFO: renamed from: b */
    private static final int f9673b = 3;

    /* JADX INFO: renamed from: c */
    private static final NumberFormat f9674c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private final AbstractC1663e f9675d;

    /* JADX INFO: renamed from: e */
    private final AbstractC1499ae.b f9676e = new AbstractC1499ae.b();

    /* JADX INFO: renamed from: f */
    private final AbstractC1499ae.a f9677f = new AbstractC1499ae.a();

    /* JADX INFO: renamed from: g */
    private final long f9678g = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f9674c = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    private C1726i(@Nullable AbstractC1663e abstractC1663e) {
        this.f9675d = abstractC1663e;
    }

    /* JADX INFO: renamed from: a */
    private static String m8168a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    /* JADX INFO: renamed from: a */
    private static String m8169a(int i, int i2) {
        return i < 2 ? "N/A" : i2 != 0 ? i2 != 8 ? i2 != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO";
    }

    /* JADX INFO: renamed from: a */
    private static String m8170a(long j) {
        return j == C1500b.f7455b ? "?" : f9674c.format(j / 1000.0f);
    }

    /* JADX INFO: renamed from: a */
    private static String m8171a(InterfaceC1664f interfaceC1664f, C1620ae c1620ae, int i) {
        return m8172a((interfaceC1664f == null || interfaceC1664f.mo7584f() != c1620ae || interfaceC1664f.mo7582c(i) == -1) ? false : true);
    }

    /* JADX INFO: renamed from: a */
    private static String m8172a(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    /* JADX INFO: renamed from: a */
    private void m8173a(InterfaceC1494b.a aVar, String str) {
        Log.d(f9672a, m8182b(aVar, str));
    }

    /* JADX INFO: renamed from: a */
    private void m8174a(InterfaceC1494b.a aVar, String str, Exception exc) {
        m8176a(aVar, "internalError", str, exc);
    }

    /* JADX INFO: renamed from: a */
    private void m8175a(InterfaceC1494b.a aVar, String str, String str2) {
        Log.d(f9672a, m8183b(aVar, str, str2));
    }

    /* JADX INFO: renamed from: a */
    private void m8176a(InterfaceC1494b.a aVar, String str, String str2, Throwable th) {
        m8180a(m8183b(aVar, str, str2), th);
    }

    /* JADX INFO: renamed from: a */
    private void m8177a(InterfaceC1494b.a aVar, String str, Throwable th) {
        m8180a(m8182b(aVar, str), th);
    }

    /* JADX INFO: renamed from: a */
    private static void m8178a(C1582a c1582a, String str) {
        for (int i = 0; i < c1582a.m7085a(); i++) {
            Log.d(f9672a, str + c1582a.m7086a(i));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m8179a(String str) {
        Log.d(f9672a, str);
    }

    /* JADX INFO: renamed from: a */
    private static void m8180a(String str, Throwable th) {
        Log.e(f9672a, str, th);
    }

    /* JADX INFO: renamed from: b */
    private static String m8181b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    /* JADX INFO: renamed from: b */
    private String m8182b(InterfaceC1494b.a aVar, String str) {
        return str + " [" + m8188i(aVar) + "]";
    }

    /* JADX INFO: renamed from: b */
    private String m8183b(InterfaceC1494b.a aVar, String str, String str2) {
        return str + " [" + m8188i(aVar) + ", " + str2 + "]";
    }

    /* JADX INFO: renamed from: c */
    private static String m8184c(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    /* JADX INFO: renamed from: d */
    private static String m8185d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION";
    }

    /* JADX INFO: renamed from: e */
    private static String m8186e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED";
    }

    /* JADX INFO: renamed from: f */
    private static String m8187f(int i) {
        if (i == 0) {
            return CallMraidJS.f6714f;
        }
        if (i == 1) {
            return C1732o.f9732b;
        }
        if (i == 2) {
            return C1732o.f9719a;
        }
        if (i == 3) {
            return "text";
        }
        if (i == 4) {
            return "metadata";
        }
        if (i == 5) {
            return SchedulerSupport.NONE;
        }
        if (i < 10000) {
            return "?";
        }
        return "custom (" + i + ")";
    }

    /* JADX INFO: renamed from: i */
    private String m8188i(InterfaceC1494b.a aVar) {
        String str = "window=" + aVar.f7321c;
        if (aVar.f7322d != null) {
            str = str + ", period=" + aVar.f7322d.f9012a;
            if (aVar.f7322d.m7464a()) {
                str = (str + ", adGroup=" + aVar.f7322d.f9013b) + ", ad=" + aVar.f7322d.f9014c;
            }
        }
        return m8170a(aVar.f7319a - this.f9678g) + ", " + m8170a(aVar.f7324f) + ", " + str;
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6211a() {
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6212a(InterfaceC1494b.a aVar) {
        m8173a(aVar, "seekStarted");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6213a(InterfaceC1494b.a aVar, int i) {
        int iMo6370c = aVar.f7320b.mo6370c();
        int iMo6366b = aVar.f7320b.mo6366b();
        StringBuilder sb = new StringBuilder("timelineChanged [");
        sb.append(m8188i(aVar));
        sb.append(", periodCount=");
        sb.append(iMo6370c);
        sb.append(", windowCount=");
        sb.append(iMo6366b);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED");
        Log.d(f9672a, sb.toString());
        for (int i2 = 0; i2 < Math.min(iMo6370c, 3); i2++) {
            aVar.f7320b.mo6362a(i2, this.f9677f, false);
            Log.d(f9672a, "  period [" + m8170a(C1500b.m6396a(this.f9677f.f7363d)) + "]");
        }
        if (iMo6370c > 3) {
            Log.d(f9672a, "  ...");
        }
        for (int i3 = 0; i3 < Math.min(iMo6366b, 3); i3++) {
            aVar.f7320b.m6363a(i3, this.f9676e, false);
            Log.d(f9672a, "  window [" + m8170a(C1500b.m6396a(this.f9676e.f7374i)) + ", " + this.f9676e.f7369d + ", " + this.f9676e.f7370e + "]");
        }
        if (iMo6366b > 3) {
            Log.d(f9672a, "  ...");
        }
        Log.d(f9672a, "]");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6214a(InterfaceC1494b.a aVar, int i, int i2) {
        m8175a(aVar, "viewportSizeChanged", i + ", " + i2);
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6215a(InterfaceC1494b.a aVar, int i, long j, long j2) {
        m8176a(aVar, "audioTrackUnderrun", i + ", " + j + ", " + j2 + "]", (Throwable) null);
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6216a(InterfaceC1494b.a aVar, int i, C1753m c1753m) {
        m8175a(aVar, "decoderInputFormatChanged", m8187f(i) + ", " + C1753m.m8408c(c1753m));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6217a(InterfaceC1494b.a aVar, int i, String str) {
        m8175a(aVar, "decoderInitialized", m8187f(i) + ", " + str);
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6218a(InterfaceC1494b.a aVar, @Nullable NetworkInfo networkInfo) {
        m8175a(aVar, "networkTypeChanged", networkInfo == null ? SchedulerSupport.NONE : networkInfo.toString());
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6219a(InterfaceC1494b.a aVar, Surface surface) {
        m8175a(aVar, "renderedFirstFrame", surface.toString());
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6220a(InterfaceC1494b.a aVar, C1582a c1582a) {
        Log.d(f9672a, "metadata [" + m8188i(aVar) + ", ");
        m8178a(c1582a, "  ");
        Log.d(f9672a, "]");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6221a(InterfaceC1494b.a aVar, C1581g c1581g) {
        m8180a(m8182b(aVar, "playerFailed"), c1581g);
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6222a(InterfaceC1494b.a aVar, InterfaceC1651t.c cVar) {
        m8175a(aVar, "downstreamFormatChanged", C1753m.m8408c(cVar.f9058c));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6223a(InterfaceC1494b.a aVar, C1665g c1665g) {
        int i;
        AbstractC1663e abstractC1663e = this.f9675d;
        AbstractC1663e.a aVarM7672a = abstractC1663e != null ? abstractC1663e.m7672a() : null;
        if (aVarM7672a == null) {
            m8175a(aVar, "tracksChanged", C4003ix.OooOOO);
            return;
        }
        Log.d(f9672a, "tracksChanged [" + m8188i(aVar) + ", ");
        int iM7681a = aVarM7672a.m7681a();
        int i2 = 0;
        while (true) {
            String str = "  ]";
            String str2 = " [";
            if (i2 >= iM7681a) {
                break;
            }
            C1621af c1621afM7686b = aVarM7672a.m7686b(i2);
            InterfaceC1664f interfaceC1664fM7687a = c1665g.m7687a(i2);
            if (c1621afM7686b.f8754b > 0) {
                i = iM7681a;
                Log.d(f9672a, "  Renderer:" + i2 + " [");
                int i3 = 0;
                while (i3 < c1621afM7686b.f8754b) {
                    C1620ae c1620aeM7299a = c1621afM7686b.m7299a(i3);
                    C1621af c1621af = c1621afM7686b;
                    int i4 = c1620aeM7299a.f8750a;
                    int iM7683a = aVarM7672a.m7683a(i2, i3);
                    String str3 = str;
                    Log.d(f9672a, "    Group:" + i3 + ", adaptive_supported=" + (i4 < 2 ? "N/A" : iM7683a != 0 ? iM7683a != 8 ? iM7683a != 16 ? "?" : "YES" : "YES_NOT_SEAMLESS" : "NO") + str2);
                    int i5 = 0;
                    while (i5 < c1620aeM7299a.f8750a) {
                        Log.d(f9672a, "      " + m8172a((interfaceC1664fM7687a == null || interfaceC1664fM7687a.mo7584f() != c1620aeM7299a || interfaceC1664fM7687a.mo7582c(i5) == -1) ? false : true) + " Track:" + i5 + ", " + C1753m.m8408c(c1620aeM7299a.m7294a(i5)) + ", supported=" + m8181b(aVarM7672a.m7684a(i2, i3, i5)));
                        i5++;
                        str2 = str2;
                    }
                    Log.d(f9672a, "    ]");
                    i3++;
                    c1621afM7686b = c1621af;
                    str = str3;
                }
                String str4 = str;
                if (interfaceC1664fM7687a != null) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= interfaceC1664fM7687a.mo7585g()) {
                            break;
                        }
                        C1582a c1582a = interfaceC1664fM7687a.mo7578a(i6).f9969f;
                        if (c1582a != null) {
                            Log.d(f9672a, "    Metadata [");
                            m8178a(c1582a, "      ");
                            Log.d(f9672a, "    ]");
                            break;
                        }
                        i6++;
                    }
                }
                Log.d(f9672a, str4);
            } else {
                i = iM7681a;
            }
            i2++;
            iM7681a = i;
        }
        String str5 = " [";
        C1621af c1621afM7685b = aVarM7672a.m7685b();
        if (c1621afM7685b.f8754b > 0) {
            Log.d(f9672a, "  Renderer:None [");
            int i7 = 0;
            while (i7 < c1621afM7685b.f8754b) {
                StringBuilder sb = new StringBuilder("    Group:");
                sb.append(i7);
                String str6 = str5;
                sb.append(str6);
                Log.d(f9672a, sb.toString());
                C1620ae c1620aeM7299a2 = c1621afM7685b.m7299a(i7);
                for (int i8 = 0; i8 < c1620aeM7299a2.f8750a; i8++) {
                    Log.d(f9672a, "      " + m8172a(false) + " Track:" + i8 + ", " + C1753m.m8408c(c1620aeM7299a2.m7294a(i8)) + ", supported=" + m8181b(0));
                }
                Log.d(f9672a, "    ]");
                i7++;
                str5 = str6;
            }
            Log.d(f9672a, "  ]");
        }
        Log.d(f9672a, "]");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6224a(InterfaceC1494b.a aVar, C1765v c1765v) {
        m8175a(aVar, "playbackParameters", C1717af.m8066a("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(c1765v.f10070b), Float.valueOf(c1765v.f10071c), Boolean.valueOf(c1765v.f10072d)));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6225a(InterfaceC1494b.a aVar, IOException iOException) {
        m8174a(aVar, "loadError", (Exception) iOException);
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6226a(InterfaceC1494b.a aVar, Exception exc) {
        m8174a(aVar, "drmSessionManagerError", exc);
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6227a(InterfaceC1494b.a aVar, boolean z) {
        m8175a(aVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: a */
    public final void mo6228a(InterfaceC1494b.a aVar, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
        m8175a(aVar, "state", sb.toString());
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: b */
    public final void mo6229b() {
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: b */
    public final void mo6230b(InterfaceC1494b.a aVar) {
        m8173a(aVar, "seekProcessed");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: b */
    public final void mo6231b(InterfaceC1494b.a aVar, int i) {
        m8175a(aVar, "positionDiscontinuity", i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: b */
    public final void mo6232b(InterfaceC1494b.a aVar, int i, int i2) {
        m8175a(aVar, "videoSizeChanged", i + ", " + i2);
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: b */
    public final void mo6233b(InterfaceC1494b.a aVar, InterfaceC1651t.c cVar) {
        m8175a(aVar, "upstreamDiscarded", C1753m.m8408c(cVar.f9058c));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: b */
    public final void mo6234b(InterfaceC1494b.a aVar, boolean z) {
        m8175a(aVar, CallMraidJS.f6713e, Boolean.toString(z));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: c */
    public final void mo6235c() {
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: c */
    public final void mo6236c(InterfaceC1494b.a aVar) {
        m8173a(aVar, "mediaPeriodCreated");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: c */
    public final void mo6237c(InterfaceC1494b.a aVar, int i) {
        m8175a(aVar, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: d */
    public final void mo6238d() {
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: d */
    public final void mo6239d(InterfaceC1494b.a aVar) {
        m8173a(aVar, "mediaPeriodReleased");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: d */
    public final void mo6240d(InterfaceC1494b.a aVar, int i) {
        m8175a(aVar, "decoderEnabled", m8187f(i));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: e */
    public final void mo6241e(InterfaceC1494b.a aVar) {
        m8173a(aVar, "mediaPeriodReadingStarted");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: e */
    public final void mo6242e(InterfaceC1494b.a aVar, int i) {
        m8175a(aVar, "decoderDisabled", m8187f(i));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: f */
    public final void mo6243f(InterfaceC1494b.a aVar) {
        m8173a(aVar, "drmKeysLoaded");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: f */
    public final void mo6244f(InterfaceC1494b.a aVar, int i) {
        m8175a(aVar, "audioSessionId", Integer.toString(i));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: g */
    public final void mo6245g(InterfaceC1494b.a aVar) {
        m8173a(aVar, "drmKeysRestored");
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: g */
    public final void mo6246g(InterfaceC1494b.a aVar, int i) {
        m8175a(aVar, "droppedFrames", Integer.toString(i));
    }

    @Override // com.anythink.expressad.exoplayer.p090a.InterfaceC1494b
    /* JADX INFO: renamed from: h */
    public final void mo6247h(InterfaceC1494b.a aVar) {
        m8173a(aVar, "drmKeysRemoved");
    }
}
