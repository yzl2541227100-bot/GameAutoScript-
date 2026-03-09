package com.anythink.expressad.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p091b.C1503c;
import com.anythink.expressad.exoplayer.p091b.C1515o;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1506f;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1507g;
import com.anythink.expressad.exoplayer.p093d.C1542k;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1538g;
import com.anythink.expressad.exoplayer.p096f.InterfaceC1578c;
import com.anythink.expressad.exoplayer.p097g.C1609g;
import com.anythink.expressad.exoplayer.p097g.InterfaceC1608f;
import com.anythink.expressad.exoplayer.p108l.C1749e;
import com.anythink.expressad.exoplayer.p108l.InterfaceC1752h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1575f implements InterfaceC1496ab {

    /* JADX INFO: renamed from: a */
    public static final long f8394a = 5000;

    /* JADX INFO: renamed from: b */
    public static final int f8395b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f8396c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f8397d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f8398e = 50;

    /* JADX INFO: renamed from: f */
    private static final String f8399f = "DefaultRenderersFactory";

    /* JADX INFO: renamed from: g */
    private final Context f8400g;

    /* JADX INFO: renamed from: h */
    @Nullable
    private final InterfaceC1538g<C1542k> f8401h;

    /* JADX INFO: renamed from: i */
    private final int f8402i;

    /* JADX INFO: renamed from: j */
    private final long f8403j;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C1575f(Context context) {
        this(context, 0);
    }

    public C1575f(Context context, int i) {
        this(context, null, i, f8394a);
    }

    public C1575f(Context context, int i, long j) {
        this(context, null, i, j);
    }

    @Deprecated
    private C1575f(Context context, @Nullable InterfaceC1538g<C1542k> interfaceC1538g) {
        this(context, interfaceC1538g, (byte) 0);
    }

    @Deprecated
    private C1575f(Context context, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, byte b) {
        this(context, interfaceC1538g, 0, f8394a);
    }

    @Deprecated
    private C1575f(Context context, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, int i, long j) {
        this.f8400g = context;
        this.f8402i = i;
        this.f8403j = j;
        this.f8401h = interfaceC1538g;
    }

    /* JADX INFO: renamed from: a */
    private static void m6993a() {
    }

    /* JADX INFO: renamed from: a */
    private static void m6994a(Context context, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, long j, Handler handler, InterfaceC1752h interfaceC1752h, int i, ArrayList<InterfaceC1768y> arrayList) {
        arrayList.add(new C1749e(context, InterfaceC1578c.f8475a, j, interfaceC1538g, handler, interfaceC1752h, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            arrayList.add(size, (InterfaceC1768y) Class.forName("com.anythink.expressad.exoplayer.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, InterfaceC1752h.class, Integer.TYPE).newInstance(Boolean.TRUE, Long.valueOf(j), handler, interfaceC1752h, 50));
            Log.i(f8399f, "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating VP9 extension", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6995a(Context context, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, InterfaceC1506f[] interfaceC1506fArr, Handler handler, InterfaceC1507g interfaceC1507g, int i, ArrayList<InterfaceC1768y> arrayList) {
        int i2;
        int i3;
        arrayList.add(new C1515o(context, InterfaceC1578c.f8475a, interfaceC1538g, handler, interfaceC1507g, C1503c.m6414a(context), interfaceC1506fArr));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (InterfaceC1768y) Class.forName("com.anythink.expressad.exoplayer.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC1507g.class, InterfaceC1506f[].class).newInstance(handler, interfaceC1507g, interfaceC1506fArr));
                    Log.i(f8399f, "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i3 = i2 + 1;
                } catch (ClassNotFoundException unused3) {
                }
                try {
                    arrayList.add(i2, (InterfaceC1768y) Class.forName("com.anythink.expressad.exoplayer.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1507g.class, InterfaceC1506f[].class).newInstance(handler, interfaceC1507g, interfaceC1506fArr));
                    Log.i(f8399f, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused4) {
                    i2 = i3;
                    i3 = i2;
                }
                try {
                    arrayList.add(i3, (InterfaceC1768y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1507g.class, InterfaceC1506f[].class).newInstance(handler, interfaceC1507g, interfaceC1506fArr));
                    Log.i(f8399f, "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating FLAC extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating Opus extension", e3);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6996a(InterfaceC1608f interfaceC1608f, Looper looper, ArrayList<InterfaceC1768y> arrayList) {
        arrayList.add(new C1609g(interfaceC1608f, looper));
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC1506f[] m6997b() {
        return new InterfaceC1506f[0];
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1496ab
    /* JADX INFO: renamed from: a */
    public final InterfaceC1768y[] mo6248a(Handler handler, InterfaceC1752h interfaceC1752h, InterfaceC1507g interfaceC1507g, InterfaceC1608f interfaceC1608f, @Nullable InterfaceC1538g<C1542k> interfaceC1538g) {
        int i;
        int i2;
        InterfaceC1538g<C1542k> interfaceC1538g2 = interfaceC1538g == null ? this.f8401h : interfaceC1538g;
        ArrayList arrayList = new ArrayList();
        Context context = this.f8400g;
        long j = this.f8403j;
        int i3 = this.f8402i;
        arrayList.add(new C1749e(context, InterfaceC1578c.f8475a, j, interfaceC1538g2, handler, interfaceC1752h, 50));
        if (i3 != 0) {
            int size = arrayList.size();
            if (i3 == 2) {
                size--;
            }
            try {
                arrayList.add(size, (InterfaceC1768y) Class.forName("com.anythink.expressad.exoplayer.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, InterfaceC1752h.class, Integer.TYPE).newInstance(Boolean.TRUE, Long.valueOf(j), handler, interfaceC1752h, 50));
                Log.i(f8399f, "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        }
        Context context2 = this.f8400g;
        InterfaceC1506f[] interfaceC1506fArr = new InterfaceC1506f[0];
        int i4 = this.f8402i;
        arrayList.add(new C1515o(context2, InterfaceC1578c.f8475a, interfaceC1538g2, handler, interfaceC1507g, C1503c.m6414a(context2), interfaceC1506fArr));
        if (i4 != 0) {
            int size2 = arrayList.size();
            if (i4 == 2) {
                size2--;
            }
            try {
                try {
                    i = size2 + 1;
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating Opus extension", e2);
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                arrayList.add(size2, (InterfaceC1768y) Class.forName("com.anythink.expressad.exoplayer.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC1507g.class, InterfaceC1506f[].class).newInstance(handler, interfaceC1507g, interfaceC1506fArr));
                Log.i(f8399f, "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused3) {
                size2 = i;
                i = size2;
            }
            try {
                try {
                    i2 = i + 1;
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating FLAC extension", e3);
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i, (InterfaceC1768y) Class.forName("com.anythink.expressad.exoplayer.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1507g.class, InterfaceC1506f[].class).newInstance(handler, interfaceC1507g, interfaceC1506fArr));
                Log.i(f8399f, "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
                i = i2;
                i2 = i;
            }
            try {
                arrayList.add(i2, (InterfaceC1768y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1507g.class, InterfaceC1506f[].class).newInstance(handler, interfaceC1507g, interfaceC1506fArr));
                Log.i(f8399f, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused6) {
            } catch (Exception e4) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e4);
            }
        }
        arrayList.add(new C1609g(interfaceC1608f, handler.getLooper()));
        return (InterfaceC1768y[]) arrayList.toArray(new InterfaceC1768y[arrayList.size()]);
    }
}
