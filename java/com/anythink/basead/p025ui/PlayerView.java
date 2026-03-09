package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.anythink.basead.p010a.C0732e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p025ui.animplayerview.BasePlayerView;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.expressad.exoplayer.C1498ad;
import com.anythink.expressad.exoplayer.C1531d;
import com.anythink.expressad.exoplayer.C1575f;
import com.anythink.expressad.exoplayer.C1581g;
import com.anythink.expressad.exoplayer.C1658i;
import com.anythink.expressad.exoplayer.InterfaceC1766w;
import com.anythink.expressad.exoplayer.p101h.C1646o;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p104i.C1661c;
import com.anythink.expressad.exoplayer.p105j.C1698o;
import com.anythink.expressad.exoplayer.p105j.C1700q;
import com.anythink.expressad.exoplayer.p108l.InterfaceC1751g;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends BasePlayerView {
    public static final String TAG = PlayerView.class.getSimpleName();

    /* JADX INFO: renamed from: A */
    private String f1591A;

    /* JADX INFO: renamed from: B */
    private String f1592B;

    /* JADX INFO: renamed from: C */
    private int f1593C;

    /* JADX INFO: renamed from: D */
    private int f1594D;

    /* JADX INFO: renamed from: E */
    private int f1595E;

    /* JADX INFO: renamed from: F */
    private int f1596F;

    /* JADX INFO: renamed from: G */
    private int f1597G;

    /* JADX INFO: renamed from: H */
    private boolean f1598H;

    /* JADX INFO: renamed from: I */
    private boolean f1599I;

    /* JADX INFO: renamed from: J */
    private boolean f1600J;

    /* JADX INFO: renamed from: K */
    private boolean f1601K;

    /* JADX INFO: renamed from: L */
    private boolean f1602L;

    /* JADX INFO: renamed from: M */
    private boolean f1603M;

    /* JADX INFO: renamed from: N */
    private boolean f1604N;

    /* JADX INFO: renamed from: O */
    private boolean f1605O;

    /* JADX INFO: renamed from: P */
    private Handler f1606P;

    /* JADX INFO: renamed from: Q */
    private boolean f1607Q;

    /* JADX INFO: renamed from: R */
    private Thread f1608R;

    /* JADX INFO: renamed from: S */
    private boolean f1609S;

    /* JADX INFO: renamed from: T */
    private boolean f1610T;

    /* JADX INFO: renamed from: U */
    private View f1611U;

    /* JADX INFO: renamed from: V */
    private InterfaceC1766w.c f1612V;

    /* JADX INFO: renamed from: W */
    private InterfaceC1751g f1613W;

    /* JADX INFO: renamed from: a */
    public int f1614a;

    /* JADX INFO: renamed from: aa */
    private final long f1615aa;

    /* JADX INFO: renamed from: ab */
    private long f1616ab;

    /* JADX INFO: renamed from: b */
    public int f1617b;

    /* JADX INFO: renamed from: c */
    public int f1618c;

    /* JADX INFO: renamed from: d */
    public boolean f1619d;

    /* JADX INFO: renamed from: e */
    public String f1620e;

    /* JADX INFO: renamed from: f */
    public String f1621f;

    /* JADX INFO: renamed from: g */
    private C1498ad f1622g;

    /* JADX INFO: renamed from: y */
    private InterfaceC1650s f1623y;

    /* JADX INFO: renamed from: z */
    private TextureView f1624z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.PlayerView$2 */
    public class ViewOnClickListenerC09122 implements View.OnClickListener {
        public ViewOnClickListenerC09122() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PlayerView.this.f1825v != null) {
                PlayerView.this.f1825v.mo807d();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.PlayerView$3 */
    public class RunnableC09133 implements Runnable {
        public RunnableC09133() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (PlayerView.this.f1601K) {
                if (PlayerView.this.f1603M || !PlayerView.this.isPlaying() || PlayerView.this.f1606P == null) {
                    if (PlayerView.this.f1616ab == 0) {
                        PlayerView.this.f1616ab = SystemClock.elapsedRealtime();
                    }
                    try {
                        Thread.sleep(10L);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (SystemClock.elapsedRealtime() - PlayerView.this.f1616ab > C1575f.f8394a) {
                        if (PlayerView.this.f1825v != null) {
                            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.ui.PlayerView.3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    PlayerView.this.mo1091a(C0748f.m310a(C0748f.f729k, "Video player error!Buffer timeout"));
                                }
                            });
                        }
                        PlayerView.this.m978d();
                    }
                } else {
                    PlayerView.this.f1616ab = 0L;
                    try {
                        PlayerView.this.f1606P.sendEmptyMessage((int) PlayerView.this.f1622g.mo6347t());
                    } catch (Throwable unused) {
                    }
                    try {
                        Thread.sleep(200L);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.PlayerView$4 */
    public class C09144 extends InterfaceC1766w.a {
        public C09144() {
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.a, com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public final void onPlayerError(C1581g c1581g) {
            boolean z;
            long jMo6347t;
            StringBuilder sb;
            super.onPlayerError(c1581g);
            String str = "Play error and ExoPlayer have not message.";
            if (c1581g != null) {
                int i = c1581g.f8497d;
                z = true;
                if (i != 0) {
                    if (i == 1) {
                        str = "Play error, because have a RendererException.";
                    } else if (i == 2) {
                        str = "Play error, because have a UnexpectedException.";
                    }
                    z = false;
                } else {
                    str = "Play error, because have a SourceException.";
                }
                if (c1581g.getCause() != null && !TextUtils.isEmpty(c1581g.getCause().getMessage())) {
                    str = str + ",eception:" + c1581g.getCause().getMessage();
                }
            } else {
                z = false;
            }
            PlayerView playerView = PlayerView.this;
            if (playerView.f1619d && z) {
                playerView.f1621f = str;
                String str2 = PlayerView.TAG;
                StringBuilder sb2 = new StringBuilder("ExoPlayer onPlayerError()...error:");
                sb2.append(str);
                sb2.append(",and rePrepareVideoSourceAgain");
                PlayerView playerView2 = PlayerView.this;
                playerView2.f1619d = false;
                PlayerView.m944J(playerView2);
                return;
            }
            String str3 = PlayerView.TAG;
            playerView.m978d();
            if (PlayerView.this.f1825v != null) {
                try {
                    jMo6347t = PlayerView.this.f1622g.mo6347t();
                } catch (Throwable unused) {
                    jMo6347t = 0;
                }
                String str4 = jMo6347t <= 0 ? C0748f.f734p : C0748f.f729k;
                String str5 = "videoUrl:" + PlayerView.this.f1592B + ",readyRate:" + PlayerView.this.f1618c + ",cdRate:" + PlayerView.this.f1617b + ",play process:" + jMo6347t;
                if (TextUtils.isEmpty(PlayerView.this.f1621f)) {
                    sb = new StringBuilder();
                    sb.append(str5);
                    sb.append(",localFileErrorMsg:");
                } else {
                    sb = new StringBuilder();
                    sb.append(str5);
                    sb.append(",localFileErrorMsg:");
                    sb.append(PlayerView.this.f1621f);
                    sb.append(",errorMsg:");
                }
                sb.append(str);
                String string = sb.toString();
                if (PlayerView.this.f1604N) {
                    PlayerView.this.mo1091a(C0748f.m310a(str4, C0748f.f705D.concat(String.valueOf(string))));
                } else {
                    PlayerView.this.mo1091a(C0748f.m310a(str4, C0748f.f713L.concat(String.valueOf(string))));
                }
            }
        }

        @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.a, com.anythink.expressad.exoplayer.InterfaceC1766w.c
        public final void onPlayerStateChanged(boolean z, int i) {
            super.onPlayerStateChanged(z, i);
            String str = PlayerView.TAG;
            if (i == 2) {
                if (PlayerView.this.f1605O) {
                    return;
                }
                PlayerView.this.f1605O = true;
                PlayerView.m949O(PlayerView.this);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                PlayerView.this.m978d();
                if (PlayerView.this.f1603M) {
                    return;
                }
                PlayerView.m954T(PlayerView.this);
                PlayerView playerView = PlayerView.this;
                playerView.f1593C = playerView.f1594D;
                if (PlayerView.this.f1825v != null) {
                    PlayerView.this.f1825v.mo806c();
                }
                PlayerView.this.m1096i();
                return;
            }
            if (!PlayerView.this.f1604N) {
                PlayerView.m950P(PlayerView.this);
                PlayerView.this.f1605O = false;
                PlayerView playerView2 = PlayerView.this;
                playerView2.f1594D = (int) playerView2.f1622g.mo6346s();
                if (PlayerView.this.f1825v != null) {
                    PlayerView.this.f1825v.mo805b(PlayerView.this.f1594D);
                }
                PlayerView.this.f1595E = Math.round(r6.f1594D * 0.25f);
                PlayerView.this.f1596F = Math.round(r6.f1594D * 0.5f);
                PlayerView.this.f1597G = Math.round(r6.f1594D * 0.75f);
                PlayerView playerView3 = PlayerView.this;
                int i2 = playerView3.f1618c;
                if (i2 <= 0 || i2 >= 100) {
                    playerView3.f1610T = false;
                } else {
                    if (playerView3.f1617b > i2) {
                        playerView3.f1617b = i2 / 2;
                    }
                    playerView3.f1614a = Math.round(((playerView3.f1617b * 1.0f) / 100.0f) * playerView3.f1594D);
                    r6.f1614a -= 2000;
                    PlayerView.this.f1610T = true;
                }
            }
            if (PlayerView.this.f1593C <= 0 || Math.abs(((long) PlayerView.this.f1593C) - PlayerView.this.f1622g.mo6347t()) <= 500) {
                return;
            }
            PlayerView.this.f1622g.mo6304a(PlayerView.this.f1593C);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.PlayerView$5 */
    public class C09155 implements InterfaceC1751g {
        public C09155() {
        }

        @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1751g
        /* JADX INFO: renamed from: a */
        public final void mo1007a() {
        }

        @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1751g
        /* JADX INFO: renamed from: a */
        public final void mo1008a(int i, int i2) {
            PlayerView playerView = PlayerView.this;
            playerView.autoFitVideoSize(i, i2, playerView.f1624z);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.PlayerView$a */
    public static class C0916a extends View.BaseSavedState {
        public static final Parcelable.Creator<C0916a> CREATOR = new Parcelable.Creator<C0916a>() { // from class: com.anythink.basead.ui.PlayerView.a.1
            /* JADX INFO: renamed from: a */
            private static C0916a m1010a(Parcel parcel) {
                return new C0916a(parcel);
            }

            /* JADX INFO: renamed from: a */
            private static C0916a[] m1011a(int i) {
                return new C0916a[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ C0916a createFromParcel(Parcel parcel) {
                return new C0916a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ C0916a[] newArray(int i) {
                return new C0916a[i];
            }
        };

        /* JADX INFO: renamed from: a */
        public int f1631a;

        /* JADX INFO: renamed from: b */
        public boolean f1632b;

        /* JADX INFO: renamed from: c */
        public boolean f1633c;

        /* JADX INFO: renamed from: d */
        public boolean f1634d;

        /* JADX INFO: renamed from: e */
        public boolean f1635e;

        /* JADX INFO: renamed from: f */
        public boolean f1636f;

        /* JADX INFO: renamed from: g */
        public boolean f1637g;

        /* JADX INFO: renamed from: h */
        public boolean f1638h;

        public C0916a(Parcel parcel) {
            super(parcel);
            this.f1631a = parcel.readInt();
            boolean[] zArr = new boolean[7];
            parcel.readBooleanArray(zArr);
            this.f1632b = zArr[0];
            this.f1633c = zArr[1];
            this.f1634d = zArr[2];
            this.f1635e = zArr[3];
            this.f1636f = zArr[4];
            this.f1637g = zArr[5];
            this.f1638h = zArr[6];
        }

        public C0916a(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: a */
        public final String m1009a() {
            return "SavedState(\nsavePosition - " + this.f1631a + "\nsaveVideoPlay25 - " + this.f1632b + "\nsaveVideoPlay50 - " + this.f1633c + "\nsaveVideoPlay75 - " + this.f1634d + "\nsaveIsVideoStart - " + this.f1635e + "\nsaveIsVideoPlayCompletion - " + this.f1636f + "\nsaveIsMute - " + this.f1637g + "\nsaveVideoNeedResumeByCdRate - " + this.f1638h + "\n)";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1631a);
            parcel.writeBooleanArray(new boolean[]{this.f1632b, this.f1633c, this.f1634d, this.f1635e, this.f1636f, this.f1637g, this.f1638h});
        }
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1591A = "";
        this.f1592B = "";
        this.f1593C = -1;
        this.f1601K = false;
        this.f1602L = false;
        this.f1603M = false;
        this.f1604N = false;
        this.f1605O = false;
        this.f1617b = 0;
        this.f1618c = 0;
        this.f1619d = false;
        this.f1620e = "";
        this.f1621f = "";
        this.f1615aa = C1575f.f8394a;
        this.f1616ab = 0L;
        setSaveEnabled(true);
        this.f1606P = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.PlayerView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                BasePlayerView.InterfaceC0966a interfaceC0966a;
                int i;
                if (PlayerView.this.f1825v == null) {
                    return;
                }
                PlayerView.this.f1593C = message.what;
                if (!PlayerView.this.f1602L && !PlayerView.this.f1603M) {
                    PlayerView.m979d(PlayerView.this);
                    if (PlayerView.this.f1825v != null) {
                        PlayerView.this.f1825v.mo800a();
                    }
                }
                if (PlayerView.this.f1825v != null) {
                    PlayerView.this.f1825v.mo802a(PlayerView.this.f1593C);
                }
                if (!PlayerView.this.f1598H && PlayerView.this.f1593C >= PlayerView.this.f1595E) {
                    PlayerView.m992l(PlayerView.this);
                    if (PlayerView.this.f1825v != null) {
                        interfaceC0966a = PlayerView.this.f1825v;
                        i = 25;
                        interfaceC0966a.mo801a(i);
                    }
                } else if (!PlayerView.this.f1599I && PlayerView.this.f1593C >= PlayerView.this.f1596F) {
                    PlayerView.m997q(PlayerView.this);
                    if (PlayerView.this.f1825v != null) {
                        interfaceC0966a = PlayerView.this.f1825v;
                        i = 50;
                        interfaceC0966a.mo801a(i);
                    }
                } else if (!PlayerView.this.f1600J && PlayerView.this.f1593C >= PlayerView.this.f1597G) {
                    PlayerView.m1002v(PlayerView.this);
                    if (PlayerView.this.f1825v != null) {
                        interfaceC0966a = PlayerView.this.f1825v;
                        i = 75;
                        interfaceC0966a.mo801a(i);
                    }
                }
                if (PlayerView.this.f1610T) {
                    int i2 = PlayerView.this.f1593C;
                    PlayerView playerView = PlayerView.this;
                    if (i2 < playerView.f1614a || playerView.f1825v == null) {
                        return;
                    }
                    PlayerView.this.f1610T = false;
                    PlayerView.this.f1825v.mo810g();
                }
            }
        };
        setBackgroundColor(-16777216);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m944J(PlayerView playerView) {
        BasePlayerView.InterfaceC0966a interfaceC0966a = playerView.f1825v;
        if (interfaceC0966a != null) {
            interfaceC0966a.mo810g();
        }
        playerView.f1622g.mo6310a(playerView.f1623y);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m949O(PlayerView playerView) {
        View view = playerView.f1611U;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ boolean m950P(PlayerView playerView) {
        playerView.f1604N = true;
        return true;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m954T(PlayerView playerView) {
        playerView.f1603M = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m962a() {
        View view = this.f1611U;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m964a(String str, boolean z) {
        String str2;
        String strM2168q;
        while (true) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.f1622g == null) {
                    mo1091a(C0748f.m310a(C0748f.f729k, "Player show fail with some internal error"));
                    return;
                }
                this.f1619d = TextUtils.equals(str, this.f1591A);
                if (TextUtils.equals(str, this.f1592B) && this.f1618c > 0) {
                    if (z) {
                        str2 = "AdxPlayer videoUrl:" + str + ",readyRate:" + this.f1618c + ",maxVideoCacheSize:" + C1160l.m1996a().m2007c() + ",lastRecycleCheckDownloadedFileSize:" + C1160l.m1996a().m2008d() + ",isChaoDi:true,ChaoDiThrowableMsg:" + this.f1620e;
                        strM2168q = C1175n.m2059a().m2168q();
                    } else {
                        str2 = "AdxPlayer videoUrl:" + str + ",readyRate:" + this.f1618c + ",maxVideoCacheSize:" + C1160l.m1996a().m2007c() + ",lastRecycleCheckDownloadedFileSize:" + C1160l.m1996a().m2008d();
                        strM2168q = C1175n.m2059a().m2168q();
                    }
                    C1322e.m3913a("Video Play Fail:Play Network Url", str2, strM2168q);
                }
                Uri uri = Uri.parse(str);
                this.f1623y = str.toLowerCase().startsWith("http") ? new C1646o.c(new C1700q("Anythink_ExoPlayer")).mo7246b(uri) : new C1646o.c(new C1698o(getContext(), "Anythink_ExoPlayer")).mo7246b(uri);
                this.f1622g.mo6308a(this.f1624z);
                this.f1622g.mo6310a(this.f1623y);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                if (TextUtils.equals(str, this.f1592B) || z) {
                    mo1091a(C0748f.m310a(C0748f.f729k, th.getMessage()));
                } else {
                    this.f1620e = th.getMessage();
                    str = this.f1592B;
                    z = true;
                }
            }
        }
        mo1091a(C0748f.m310a(C0748f.f729k, th.getMessage()));
    }

    /* JADX INFO: renamed from: a */
    private void m965a(boolean z) {
        boolean z3;
        if (new File(this.f1591A).exists() || !TextUtils.isEmpty(this.f1592B)) {
            this.f1609S = true;
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            mo1091a(C0748f.m310a(C0748f.f729k, C0748f.f712K));
            return;
        }
        if (this.f1624z == null) {
            TextureView textureView = new TextureView(getContext());
            this.f1624z = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f1624z, layoutParams);
        }
        if (this.f1622g == null) {
            this.f1622g = C1658i.m7561a(new C1575f(getContext()), new C1661c(), new C1531d());
            C09144 c09144 = new C09144();
            this.f1612V = c09144;
            this.f1622g.mo6314a(c09144);
            C09155 c09155 = new C09155();
            this.f1613W = c09155;
            this.f1622g.mo6312a(c09155);
            this.f1622g.m6301a(this.f1607Q ? 0.0f : 1.0f);
            this.f1622g.mo6315a(z);
            m964a(new File(this.f1591A).exists() ? this.f1591A : this.f1592B, false);
        }
        setOnClickListener(new ViewOnClickListenerC09122());
    }

    /* JADX INFO: renamed from: b */
    private void m968b() {
        View view = this.f1611U;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m970b(boolean z) {
        if (this.f1622g == null) {
            this.f1622g = C1658i.m7561a(new C1575f(getContext()), new C1661c(), new C1531d());
            C09144 c09144 = new C09144();
            this.f1612V = c09144;
            this.f1622g.mo6314a(c09144);
            C09155 c09155 = new C09155();
            this.f1613W = c09155;
            this.f1622g.mo6312a(c09155);
            this.f1622g.m6301a(this.f1607Q ? 0.0f : 1.0f);
            this.f1622g.mo6315a(z);
            m964a(new File(this.f1591A).exists() ? this.f1591A : this.f1592B, false);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m974c() {
        if (this.f1608R != null) {
            return;
        }
        this.f1601K = true;
        this.f1616ab = 0L;
        Thread thread = new Thread(new RunnableC09133());
        this.f1608R = thread;
        thread.setName("anythink_type_player_progress");
        this.f1608R.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m978d() {
        this.f1601K = false;
        this.f1608R = null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m979d(PlayerView playerView) {
        playerView.f1602L = true;
        return true;
    }

    /* JADX INFO: renamed from: e */
    private boolean m982e() {
        if (!new File(this.f1591A).exists() && TextUtils.isEmpty(this.f1592B)) {
            return true;
        }
        this.f1609S = true;
        return false;
    }

    /* JADX INFO: renamed from: f */
    private String m984f() {
        return new File(this.f1591A).exists() ? this.f1591A : this.f1592B;
    }

    /* JADX INFO: renamed from: g */
    private void m986g() {
        if (this.f1624z == null) {
            TextureView textureView = new TextureView(getContext());
            this.f1624z = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f1624z, layoutParams);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m988h() {
        BasePlayerView.InterfaceC0966a interfaceC0966a = this.f1825v;
        if (interfaceC0966a != null) {
            interfaceC0966a.mo810g();
        }
        this.f1622g.mo6310a(this.f1623y);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m992l(PlayerView playerView) {
        playerView.f1598H = true;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m997q(PlayerView playerView) {
        playerView.f1599I = true;
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m1002v(PlayerView playerView) {
        playerView.f1600J = true;
        return true;
    }

    public void autoFitVideoSize(int i, int i2, View view) {
        float fMax = Math.max(i / view.getMeasuredWidth(), i2 / view.getMeasuredHeight());
        int iCeil = (int) Math.ceil(r4 / fMax);
        int iCeil2 = (int) Math.ceil(r5 / fMax);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = iCeil;
        layoutParams.height = iCeil2;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return Math.max(this.f1593C, 0);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        C1498ad c1498ad = this.f1622g;
        return c1498ad != null ? c1498ad.mo6346s() : this.f1594D;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.f1609S;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void init(AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, List<Bitmap> list) {
        super.init(abstractC1247l, c1248m, z, list);
        initMuteStatus(z);
        setVideoRateConfig(abstractC1247l.m3220o().m3289W(), abstractC1247l.m3220o().m3291X());
        load(abstractC1247l.m3159B(), false);
    }

    public void initMuteStatus(boolean z) {
        this.f1607Q = z;
    }

    public boolean isComplete() {
        return this.f1603M;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.f1607Q;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        C1498ad c1498ad = this.f1622g;
        return c1498ad != null && c1498ad.m6298J();
    }

    public void load(String str, boolean z) {
        boolean z3;
        this.f1592B = str;
        C0732e.m247a();
        this.f1591A = C0732e.m248a(4, str);
        if (new File(this.f1591A).exists() || !TextUtils.isEmpty(this.f1592B)) {
            this.f1609S = true;
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            mo1091a(C0748f.m310a(C0748f.f729k, C0748f.f712K));
            return;
        }
        if (this.f1624z == null) {
            TextureView textureView = new TextureView(getContext());
            this.f1624z = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f1624z, layoutParams);
        }
        if (this.f1622g == null) {
            this.f1622g = C1658i.m7561a(new C1575f(getContext()), new C1661c(), new C1531d());
            C09144 c09144 = new C09144();
            this.f1612V = c09144;
            this.f1622g.mo6314a(c09144);
            C09155 c09155 = new C09155();
            this.f1613W = c09155;
            this.f1622g.mo6312a(c09155);
            this.f1622g.m6301a(this.f1607Q ? 0.0f : 1.0f);
            this.f1622g.mo6315a(z);
            m964a(new File(this.f1591A).exists() ? this.f1591A : this.f1592B, false);
        }
        setOnClickListener(new ViewOnClickListenerC09122());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C0916a c0916a = (C0916a) parcelable;
        new StringBuilder("onRestoreInstanceState...").append(c0916a.m1009a());
        super.onRestoreInstanceState(c0916a.getSuperState());
        this.f1593C = c0916a.f1631a;
        this.f1598H = c0916a.f1632b;
        this.f1599I = c0916a.f1633c;
        this.f1600J = c0916a.f1634d;
        this.f1602L = c0916a.f1635e;
        this.f1603M = c0916a.f1636f;
        boolean z = c0916a.f1637g;
        this.f1607Q = z;
        this.f1610T = c0916a.f1638h;
        C1498ad c1498ad = this.f1622g;
        if (c1498ad != null) {
            c1498ad.m6301a(z ? 0.0f : 1.0f);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0916a c0916a = new C0916a(super.onSaveInstanceState());
        c0916a.f1631a = this.f1593C;
        c0916a.f1632b = this.f1598H;
        c0916a.f1633c = this.f1599I;
        c0916a.f1634d = this.f1600J;
        c0916a.f1635e = this.f1602L;
        c0916a.f1636f = this.f1603M;
        c0916a.f1637g = this.f1607Q;
        c0916a.f1638h = this.f1610T;
        new StringBuilder("onSaveInstanceState...").append(c0916a.m1009a());
        return c0916a;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void pause() {
        m978d();
        C1498ad c1498ad = this.f1622g;
        if (c1498ad != null) {
            c1498ad.mo6315a(false);
        }
    }

    public void release() {
        m978d();
        m1096i();
        C1498ad c1498ad = this.f1622g;
        if (c1498ad != null) {
            if (c1498ad.m6298J()) {
                this.f1622g.mo6340m();
            }
            InterfaceC1766w.c cVar = this.f1612V;
            if (cVar != null) {
                this.f1622g.mo6324b(cVar);
            }
            InterfaceC1751g interfaceC1751g = this.f1613W;
            if (interfaceC1751g != null) {
                this.f1622g.mo6323b(interfaceC1751g);
            }
            this.f1622g.mo6341n();
            this.f1622g = null;
        }
        Handler handler = this.f1606P;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f1604N = false;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.InterfaceC0966a interfaceC0966a) {
        this.f1825v = interfaceC0966a;
    }

    public void setLoadingView(View view) {
        this.f1611U = view;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void setMute(boolean z) {
        this.f1607Q = z;
        if (z) {
            C1498ad c1498ad = this.f1622g;
            if (c1498ad != null) {
                c1498ad.m6301a(0.0f);
            }
            BasePlayerView.InterfaceC0966a interfaceC0966a = this.f1825v;
            if (interfaceC0966a != null) {
                interfaceC0966a.mo808e();
                return;
            }
            return;
        }
        C1498ad c1498ad2 = this.f1622g;
        if (c1498ad2 != null) {
            c1498ad2.m6301a(1.0f);
        }
        BasePlayerView.InterfaceC0966a interfaceC0966a2 = this.f1825v;
        if (interfaceC0966a2 != null) {
            interfaceC0966a2.mo809f();
        }
    }

    public void setVideoRateConfig(int i, int i2) {
        this.f1618c = i;
        this.f1617b = i2;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void start() {
        View view = this.f1611U;
        if (view != null) {
            view.setVisibility(8);
        }
        C1498ad c1498ad = this.f1622g;
        if (c1498ad != null) {
            c1498ad.mo6315a(true);
        }
        if (this.f1608R == null) {
            this.f1601K = true;
            this.f1616ab = 0L;
            Thread thread = new Thread(new RunnableC09133());
            this.f1608R = thread;
            thread.setName("anythink_type_player_progress");
            this.f1608R.start();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void stop() {
        C1498ad c1498ad = this.f1622g;
        if (c1498ad != null) {
            c1498ad.mo6340m();
        }
        BasePlayerView.InterfaceC0966a interfaceC0966a = this.f1825v;
        if (interfaceC0966a != null) {
            interfaceC0966a.mo804b();
        }
        m1096i();
    }
}
