package com.anythink.basead.p025ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.C0742c;
import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p010a.C0731d;
import com.anythink.basead.p010a.C0732e;
import com.anythink.basead.p010a.p012b.C0724c;
import com.anythink.basead.p010a.p012b.C0727f;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p015c.C0752j;
import com.anythink.basead.p021e.AbstractC0778h;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p025ui.EndCardView;
import com.anythink.basead.p025ui.MraidEndCardView;
import com.anythink.basead.p025ui.PanelView;
import com.anythink.basead.p025ui.animplayerview.BasePlayerView;
import com.anythink.basead.p025ui.animplayerview.WebLandpagePlayerView;
import com.anythink.basead.p025ui.p027b.AbstractC0988a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1219al;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseScreenATView extends BaseATView {
    public static final int FORMAT_INTERSTITIAL = 3;
    public static final int FORMAT_REWARD_VIDEO = 1;
    public static final String TAG = BaseScreenATView.class.getSimpleName();

    /* JADX INFO: renamed from: A */
    public int f1233A;

    /* JADX INFO: renamed from: B */
    public long f1234B;

    /* JADX INFO: renamed from: C */
    public int f1235C;

    /* JADX INFO: renamed from: D */
    public boolean f1236D;

    /* JADX INFO: renamed from: E */
    public int f1237E;

    /* JADX INFO: renamed from: F */
    public int f1238F;

    /* JADX INFO: renamed from: G */
    public boolean f1239G;

    /* JADX INFO: renamed from: H */
    public boolean f1240H;

    /* JADX INFO: renamed from: I */
    public boolean f1241I;

    /* JADX INFO: renamed from: J */
    public float f1242J;

    /* JADX INFO: renamed from: K */
    public RelativeLayout f1243K;

    /* JADX INFO: renamed from: L */
    public BasePlayerView f1244L;

    /* JADX INFO: renamed from: M */
    public PanelView f1245M;

    /* JADX INFO: renamed from: N */
    public BaseEndCardView f1246N;

    /* JADX INFO: renamed from: O */
    public C0987b f1247O;

    /* JADX INFO: renamed from: P */
    public CountDownView f1248P;

    /* JADX INFO: renamed from: Q */
    public CloseImageView f1249Q;

    /* JADX INFO: renamed from: R */
    public ViewGroup f1250R;

    /* JADX INFO: renamed from: S */
    public MuteImageView f1251S;

    /* JADX INFO: renamed from: T */
    public AbstractC0778h f1252T;

    /* JADX INFO: renamed from: U */
    public Runnable f1253U;

    /* JADX INFO: renamed from: V */
    public ConcurrentHashMap<Integer, Boolean> f1254V;

    /* JADX INFO: renamed from: W */
    public int f1255W;

    /* JADX INFO: renamed from: aa */
    public int f1256aa;

    /* JADX INFO: renamed from: ab */
    public int f1257ab;

    /* JADX INFO: renamed from: ac */
    public int f1258ac;

    /* JADX INFO: renamed from: ad */
    private long f1259ad;

    /* JADX INFO: renamed from: ae */
    private long f1260ae;

    /* JADX INFO: renamed from: af */
    private long f1261af;

    /* JADX INFO: renamed from: ag */
    private long f1262ag;

    /* JADX INFO: renamed from: ah */
    private boolean f1263ah;

    /* JADX INFO: renamed from: ai */
    private boolean f1264ai;

    /* JADX INFO: renamed from: aj */
    private boolean f1265aj;

    /* JADX INFO: renamed from: ak */
    private C0742c f1266ak;

    /* JADX INFO: renamed from: v */
    public int f1267v;

    /* JADX INFO: renamed from: w */
    public int f1268w;

    /* JADX INFO: renamed from: x */
    public int f1269x;

    /* JADX INFO: renamed from: y */
    public int f1270y;

    /* JADX INFO: renamed from: z */
    public int f1271z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseScreenATView$10 */
    public class C082110 implements EndCardView.InterfaceC0864a {
        public C082110() {
        }

        @Override // com.anythink.basead.p025ui.EndCardView.InterfaceC0864a
        /* JADX INFO: renamed from: a */
        public final void mo796a() {
            String str = BaseScreenATView.TAG;
            BaseScreenATView baseScreenATView = BaseScreenATView.this;
            baseScreenATView.mo700a(1, baseScreenATView.f1176r ? 7 : 3);
        }

        @Override // com.anythink.basead.p025ui.EndCardView.InterfaceC0864a
        /* JADX INFO: renamed from: b */
        public final void mo797b() {
            BaseScreenATView.this.mo769K();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseScreenATView$11 */
    public class C082211 implements C0742c.a {
        public C082211() {
        }

        @Override // com.anythink.basead.C0742c.a
        /* JADX INFO: renamed from: a */
        public final void mo305a() {
            BaseScreenATView.m755e(BaseScreenATView.this);
        }

        @Override // com.anythink.basead.C0742c.a
        /* JADX INFO: renamed from: b */
        public final void mo306b() {
            BaseScreenATView.this.m788s();
            BaseScreenATView.this.f1266ak.m304b();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseScreenATView$5 */
    public class RunnableC08285 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0833a f1280a;

        public RunnableC08285(InterfaceC0833a interfaceC0833a) {
            this.f1280a = interfaceC0833a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1175n c1175nM2059a;
            Runnable runnable;
            C1391a c1391aM4865b = C1392b.m4845a(BaseScreenATView.this.getContext()).m4865b(C1175n.m2059a().m2165o());
            List<String> arrayList = new ArrayList<>();
            final ArrayList arrayList2 = new ArrayList();
            int i = BaseScreenATView.this.f1238F;
            int iMin = 0;
            if (i == 2) {
                arrayList = c1391aM4865b.m4763h();
            } else if (i == 3) {
                arrayList = c1391aM4865b.m4765j();
            } else if (i == 5) {
                arrayList = c1391aM4865b.m4764i();
                boolean z = arrayList.size() >= 4;
                if (z) {
                    for (int i2 = 0; i2 < 4; i2++) {
                        String str = arrayList.get(i2);
                        if (TextUtils.isEmpty(str) || !C0724c.m203b(str, 3)) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    arrayList.clear();
                }
            }
            if (arrayList.size() == 0) {
                c1175nM2059a = C1175n.m2059a();
                runnable = new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.5.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0833a interfaceC0833a = RunnableC08285.this.f1280a;
                        if (interfaceC0833a != null) {
                            interfaceC0833a.mo811a(arrayList2);
                        }
                    }
                };
            } else {
                if (arrayList != null && arrayList.size() > 0) {
                    try {
                        iMin = Math.min(BaseScreenATView.this.getResources().getDisplayMetrics().widthPixels, BaseScreenATView.this.getResources().getDisplayMetrics().heightPixels) / 2;
                    } catch (Throwable unused) {
                    }
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C1378b.m4482a(BaseScreenATView.this.getContext()).m4497b(new C1381e(3, it.next()), iMin, iMin));
                    }
                }
                c1175nM2059a = C1175n.m2059a();
                runnable = new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.5.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0833a interfaceC0833a = RunnableC08285.this.f1280a;
                        if (interfaceC0833a != null) {
                            interfaceC0833a.mo811a(arrayList2);
                        }
                    }
                };
            }
            c1175nM2059a.m2135b(runnable);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseScreenATView$7 */
    public class C08307 implements InterfaceC0833a {
        public C08307() {
        }

        @Override // com.anythink.basead.p025ui.BaseScreenATView.InterfaceC0833a
        /* JADX INFO: renamed from: a */
        public final void mo811a(List<Bitmap> list) {
            BasePlayerView basePlayerView;
            if (BaseScreenATView.this.f1238F == 5 && (list == null || list.size() == 0)) {
                BaseScreenATView.this.f1238F = 1;
            }
            BaseScreenATView.this.m742a(list);
            if (!BaseScreenATView.this.f1263ah || (basePlayerView = BaseScreenATView.this.f1244L) == null || basePlayerView.isPlaying()) {
                return;
            }
            BaseScreenATView.this.m744ab();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseScreenATView$a */
    public interface InterfaceC0833a {
        /* JADX INFO: renamed from: a */
        void mo811a(List<Bitmap> list);
    }

    public BaseScreenATView(Context context) {
        super(context);
        this.f1238F = 100;
        this.f1263ah = false;
        this.f1253U = new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseScreenATView.super.mo710h();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BaseScreenATView(android.content.Context r4, com.anythink.core.common.p055f.C1248m r5, com.anythink.core.common.p055f.AbstractC1247l r6, java.lang.String r7, int r8, int r9) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6, r7)
            r4 = 100
            r3.f1238F = r4
            r5 = 0
            r3.f1263ah = r5
            com.anythink.basead.ui.BaseScreenATView$1 r6 = new com.anythink.basead.ui.BaseScreenATView$1
            r6.<init>()
            r3.f1253U = r6
            r3.f1267v = r8
            r3.f1268w = r9
            com.anythink.core.common.f.m r6 = r3.f1160b
            com.anythink.core.common.f.n r6 = r6.f4333n
            int r6 = r6.m3247B()
            if (r6 <= 0) goto L2a
            com.anythink.core.common.f.m r6 = r3.f1160b
            com.anythink.core.common.f.n r6 = r6.f4333n
            int r6 = r6.m3247B()
            int r6 = r6 * 1000
            goto L32
        L2a:
            com.anythink.core.common.f.m r6 = r3.f1160b
            com.anythink.core.common.f.n r6 = r6.f4333n
            int r6 = r6.m3247B()
        L32:
            long r6 = (long) r6
            r3.f1260ae = r6
            com.anythink.core.common.f.m r6 = r3.f1160b
            com.anythink.core.common.f.n r6 = r6.f4333n
            int r6 = r6.m3249C()
            if (r6 <= 0) goto L4a
            com.anythink.core.common.f.m r6 = r3.f1160b
            com.anythink.core.common.f.n r6 = r6.f4333n
            int r6 = r6.m3249C()
            int r6 = r6 * 1000
            goto L52
        L4a:
            com.anythink.core.common.f.m r6 = r3.f1160b
            com.anythink.core.common.f.n r6 = r6.f4333n
            int r6 = r6.m3249C()
        L52:
            long r6 = (long) r6
            r3.f1261af = r6
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L65
            long r0 = r3.f1260ae
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L65
            long r0 = r0 + r6
            r3.f1262ag = r0
            goto L67
        L65:
            r3.f1262ag = r6
        L67:
            com.anythink.core.common.f.m r6 = r3.f1160b
            com.anythink.core.common.f.n r6 = r6.f4333n
            int r6 = r6.m3255F()
            int r6 = r6 * 1000
            r3.f1235C = r6
            com.anythink.core.common.f.m r6 = r3.f1160b
            com.anythink.core.common.f.n r6 = r6.f4333n
            int r6 = r6.m3253E()
            r7 = 1
            if (r6 != 0) goto L7f
            r5 = 1
        L7f:
            r3.f1241I = r5
            int r5 = r3.f1267v
            if (r7 != r5) goto Lb3
            com.anythink.core.common.f.l r5 = r3.f1161c
            boolean r5 = r5.m3170I()
            if (r5 == 0) goto L90
            r3.f1238F = r4
            return
        L90:
            com.anythink.core.common.f.m r4 = r3.f1160b
            com.anythink.core.common.f.n r4 = r4.f4333n
            int r4 = r4.m3309aj()
            if (r4 != r7) goto L9f
            r4 = 101(0x65, float:1.42E-43)
            r3.f1238F = r4
            return
        L9f:
            com.anythink.core.common.f.m r4 = r3.f1160b
            com.anythink.core.common.f.n r4 = r4.f4333n
            int r4 = r4.m3310ak()
            if (r4 <= 0) goto Lb3
            com.anythink.core.common.f.m r4 = r3.f1160b
            com.anythink.core.common.f.n r4 = r4.f4333n
            int r4 = r4.m3310ak()
            r3.f1238F = r4
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.BaseScreenATView.<init>(android.content.Context, com.anythink.core.common.f.m, com.anythink.core.common.f.l, java.lang.String, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m727Q() {
        /*
            r7 = this;
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3247B()
            if (r0 <= 0) goto L15
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3247B()
            int r0 = r0 * 1000
            goto L1d
        L15:
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3247B()
        L1d:
            long r0 = (long) r0
            r7.f1260ae = r0
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3249C()
            if (r0 <= 0) goto L35
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3249C()
            int r0 = r0 * 1000
            goto L3d
        L35:
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3249C()
        L3d:
            long r0 = (long) r0
            r7.f1261af = r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L50
            long r4 = r7.f1260ae
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L50
            long r4 = r4 + r0
            r7.f1262ag = r4
            goto L52
        L50:
            r7.f1262ag = r0
        L52:
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3255F()
            int r0 = r0 * 1000
            r7.f1235C = r0
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3253E()
            r1 = 1
            if (r0 != 0) goto L6b
            r0 = 1
            goto L6c
        L6b:
            r0 = 0
        L6c:
            r7.f1241I = r0
            int r0 = r7.f1267v
            if (r1 != r0) goto La0
            com.anythink.core.common.f.l r0 = r7.f1161c
            boolean r0 = r0.m3170I()
            if (r0 == 0) goto L7f
            r0 = 100
        L7c:
            r7.f1238F = r0
            return
        L7f:
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3309aj()
            if (r0 != r1) goto L8c
            r0 = 101(0x65, float:1.42E-43)
            goto L7c
        L8c:
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3310ak()
            if (r0 <= 0) goto La0
            com.anythink.core.common.f.m r0 = r7.f1160b
            com.anythink.core.common.f.n r0 = r0.f4333n
            int r0 = r0.m3310ak()
            r7.f1238F = r0
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.BaseScreenATView.m727Q():void");
    }

    /* JADX INFO: renamed from: R */
    private void m728R() {
        if (C0731d.m246b(this.f1161c) && !C0724c.m199a(this.f1160b, this.f1161c) && this.f1246N == null) {
            this.f1246N = m747b(true);
        }
    }

    /* JADX INFO: renamed from: S */
    private void m729S() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        this.f1269x = i;
        int i2 = displayMetrics.heightPixels;
        this.f1270y = i2;
        this.f1255W = i;
        this.f1256aa = i2;
    }

    /* JADX INFO: renamed from: T */
    private void m730T() {
        if (this.f1238F == 100) {
            m742a((List<Bitmap>) null);
        } else {
            C1335b.m3998a().m4007a((Runnable) new RunnableC08285(new C08307()), 2, true);
        }
    }

    /* JADX INFO: renamed from: U */
    private void m731U() {
        if (this.f1246N == null) {
            this.f1246N = m747b(false);
        }
        mo768J();
        mo769K();
    }

    /* JADX INFO: renamed from: V */
    private void m732V() {
        this.f1237E = mo787r();
        EndCardView endCardView = new EndCardView(getContext(), this.f1161c, this.f1160b);
        endCardView.setSize(this.f1269x, this.f1270y);
        endCardView.init(false, false, new C082110());
        this.f1246N = endCardView;
        mo768J();
        endCardView.load();
        if (mo779b(this.f1237E)) {
            mo764F();
            PanelView panelViewMo773O = mo773O();
            if (panelViewMo773O == null || panelViewMo773O.getVisibility() != 0) {
                return;
            }
            if (panelViewMo773O.getCTAButton() == null || panelViewMo773O.getCTAButton().getVisibility() != 0) {
                this.f1175q = panelViewMo773O;
            } else {
                this.f1175q = panelViewMo773O.getCTAButton();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    private void m733W() {
        m789t();
        if (this.f1266ak == null) {
            this.f1266ak = new C0742c();
        }
        this.f1266ak.m302a(getContext(), this.f1161c, this.f1160b, new C082211());
    }

    /* JADX INFO: renamed from: X */
    private void m734X() {
        this.f1264ai = true;
        if (mo772N() != null) {
            mo772N().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m735Y() {
        if (this.f1247O == null) {
            this.f1247O = new C0987b(this.f1243K);
        }
        this.f1247O.m1169b();
    }

    /* JADX INFO: renamed from: Z */
    private void m736Z() {
        C0987b c0987b = this.f1247O;
        if (c0987b != null) {
            c0987b.m1170c();
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m737a(AbstractC1249n abstractC1249n) {
        int iM3259H;
        if (abstractC1249n == null || (iM3259H = (int) (abstractC1249n.m3259H() / 100.0f)) == 0) {
            return 0;
        }
        Random random = new Random();
        if (random.nextInt(100) > iM3259H) {
            return 0;
        }
        int iM3261I = abstractC1249n.m3261I();
        int iM3263J = abstractC1249n.m3263J();
        if (iM3263J <= 0) {
            return 0;
        }
        if (iM3261I == iM3263J) {
            return iM3261I;
        }
        try {
            return random.nextInt(iM3263J - iM3261I) + iM3261I;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m739a(InterfaceC0833a interfaceC0833a) {
        C1335b.m3998a().m4007a((Runnable) new RunnableC08285(interfaceC0833a), 2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m742a(List<Bitmap> list) {
        mo784o();
        if (this.f1235C == 0) {
            mo767I();
        }
        this.f1244L.setListener(new BasePlayerView.InterfaceC0966a() { // from class: com.anythink.basead.ui.BaseScreenATView.6
            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: a */
            public final void mo800a() {
                String str = BaseScreenATView.TAG;
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                AbstractC0988a abstractC0988a = baseScreenATView.f1178t;
                if (abstractC0988a != null) {
                    abstractC0988a.m1178a(baseScreenATView.f1244L.getVideoLength());
                }
                BaseScreenATView.this.m699a(101);
                BaseScreenATView.this.mo763E();
                BaseScreenATView.this.f1259ad = System.currentTimeMillis();
                BaseScreenATView.this.mo710h();
                BaseScreenATView.m748b(BaseScreenATView.this);
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: a */
            public final void mo801a(int i) {
                int i2;
                C0751i c0751iMo711i = BaseScreenATView.this.mo711i();
                if (i == 25) {
                    String str = BaseScreenATView.TAG;
                    i2 = 2;
                } else {
                    if (i != 50) {
                        if (i != 75) {
                            return;
                        }
                        String str2 = BaseScreenATView.TAG;
                        C0717a.m126a(4, BaseScreenATView.this.f1161c, c0751iMo711i);
                        return;
                    }
                    String str3 = BaseScreenATView.TAG;
                    i2 = 3;
                }
                C0717a.m126a(i2, BaseScreenATView.this.f1161c, c0751iMo711i);
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: a */
            public final void mo802a(long j) {
                BaseScreenATView.m749b(BaseScreenATView.this, j);
                BaseScreenATView.this.mo775a(j);
                BaseScreenATView.this.mo778b(j);
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                int i = baseScreenATView.f1235C;
                if (i >= 0 && j >= i) {
                    baseScreenATView.mo767I();
                }
                if (j >= BaseScreenATView.this.f1160b.f4333n.m3357k()) {
                    BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
                    if (baseScreenATView2.f1240H) {
                        return;
                    }
                    baseScreenATView2.mo767I();
                    BaseScreenATView baseScreenATView3 = BaseScreenATView.this;
                    baseScreenATView3.f1240H = true;
                    AbstractC0778h abstractC0778h = baseScreenATView3.f1252T;
                    if (abstractC0778h != null) {
                        abstractC0778h.mo464c();
                    }
                }
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: a */
            public final void mo803a(C0747e c0747e) {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                baseScreenATView.f1176r = true;
                baseScreenATView.m699a(108);
                AbstractC0778h abstractC0778h = BaseScreenATView.this.f1252T;
                if (abstractC0778h != null) {
                    abstractC0778h.mo555h();
                }
                C0751i c0751iMo711i = BaseScreenATView.this.mo711i();
                c0751iMo711i.f768h = BaseScreenATView.this.fillVideoEndRecord(false);
                C0717a.m126a(17, BaseScreenATView.this.f1161c, c0751iMo711i);
                BaseScreenATView.this.m776a(c0747e);
                BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
                if (!baseScreenATView2.f1240H && baseScreenATView2.f1160b.f4333n.m3359l() == 1) {
                    BaseScreenATView baseScreenATView3 = BaseScreenATView.this;
                    baseScreenATView3.f1240H = true;
                    AbstractC0778h abstractC0778h2 = baseScreenATView3.f1252T;
                    if (abstractC0778h2 != null) {
                        abstractC0778h2.mo464c();
                    }
                }
                BaseScreenATView baseScreenATView4 = BaseScreenATView.this;
                BasePlayerView basePlayerView = baseScreenATView4.f1244L;
                if (basePlayerView != null) {
                    baseScreenATView4.mo778b(basePlayerView.getVideoLength());
                }
                BaseScreenATView baseScreenATView5 = BaseScreenATView.this;
                if (baseScreenATView5.f1239G) {
                    baseScreenATView5.mo774P();
                } else {
                    baseScreenATView5.mo786q();
                }
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: b */
            public final void mo804b() {
                String str = BaseScreenATView.TAG;
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: b */
            public final void mo805b(long j) {
                AbstractC0778h abstractC0778h = BaseScreenATView.this.f1252T;
                if (abstractC0778h != null) {
                    abstractC0778h.mo554g();
                }
                BaseScreenATView.this.mo782c(j);
                C0717a.m126a(35, BaseScreenATView.this.f1161c, BaseScreenATView.this.mo711i());
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: c */
            public final void mo806c() {
                String str = BaseScreenATView.TAG;
                C0751i c0751iMo711i = BaseScreenATView.this.mo711i();
                C0717a.m126a(5, BaseScreenATView.this.f1161c, c0751iMo711i);
                C0717a.m126a(31, BaseScreenATView.this.f1161c, c0751iMo711i);
                BaseScreenATView.this.m699a(107);
                AbstractC0778h abstractC0778h = BaseScreenATView.this.f1252T;
                if (abstractC0778h != null) {
                    abstractC0778h.mo462b();
                }
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                if (!baseScreenATView.f1240H) {
                    baseScreenATView.f1240H = true;
                    AbstractC0778h abstractC0778h2 = baseScreenATView.f1252T;
                    if (abstractC0778h2 != null) {
                        abstractC0778h2.mo464c();
                    }
                }
                if (BaseScreenATView.this.f1160b.f4333n.m3271N() != 1) {
                    if (BaseScreenATView.this.mo770L() != null) {
                        BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
                        baseScreenATView2.m702a(baseScreenATView2.mo770L());
                    }
                    BaseScreenATView.this.m781c(2);
                    return;
                }
                BaseScreenATView baseScreenATView3 = BaseScreenATView.this;
                baseScreenATView3.f1176r = true;
                if (baseScreenATView3.f1239G) {
                    baseScreenATView3.mo774P();
                } else {
                    baseScreenATView3.mo786q();
                }
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: d */
            public final void mo807d() {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                BasePlayerView basePlayerView = baseScreenATView.f1244L;
                if (basePlayerView != null) {
                    BaseScreenATView.m750c(baseScreenATView, basePlayerView.getCurrentPosition());
                }
                C0751i c0751iMo711i = BaseScreenATView.this.mo711i();
                c0751iMo711i.f767g = BaseScreenATView.this.m712j();
                C0717a.m126a(14, BaseScreenATView.this.f1161c, c0751iMo711i);
                AbstractC1249n abstractC1249n = BaseScreenATView.this.f1160b.f4333n;
                if ((abstractC1249n == null || abstractC1249n.m3245A() != 1) && !BaseScreenATView.this.m771M()) {
                    return;
                }
                BaseScreenATView.this.mo700a(1, 3);
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: e */
            public final void mo808e() {
                String str = BaseScreenATView.TAG;
                C0751i c0751iMo711i = BaseScreenATView.this.mo711i();
                c0751iMo711i.f767g = BaseScreenATView.this.m712j();
                C0717a.m126a(12, BaseScreenATView.this.f1161c, c0751iMo711i);
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: f */
            public final void mo809f() {
                String str = BaseScreenATView.TAG;
                C0751i c0751iMo711i = BaseScreenATView.this.mo711i();
                c0751iMo711i.f767g = BaseScreenATView.this.m712j();
                C0717a.m126a(13, BaseScreenATView.this.f1161c, c0751iMo711i);
            }

            @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView.InterfaceC0966a
            /* JADX INFO: renamed from: g */
            public final void mo810g() {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                C1248m c1248m = baseScreenATView.f1160b;
                new C0727f(c1248m.f4321b, baseScreenATView.f1161c, c1248m.f4333n).m222b();
            }
        });
        this.f1252T.mo553f();
        this.f1244L.init(this.f1161c, this.f1160b, this.f1241I, list);
        if (this.f1238F == 1) {
            mo786q();
        } else {
            this.f1244L.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: aa */
    private void m743aa() {
        C0717a.m126a(1, this.f1161c, mo711i());
        AbstractC0778h abstractC0778h = this.f1252T;
        if (abstractC0778h != null) {
            abstractC0778h.mo458a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ab */
    public void m744ab() {
        BasePlayerView basePlayerView = this.f1244L;
        if (basePlayerView == null || !basePlayerView.hasVideo()) {
            return;
        }
        if (!this.f1244L.isPlaying()) {
            this.f1259ad = System.currentTimeMillis();
            long currentPosition = this.f1244L.getCurrentPosition();
            this.f1234B = currentPosition;
            if (currentPosition != 0) {
                C0717a.m126a(15, this.f1161c, mo711i());
            }
        }
        this.f1244L.start();
    }

    /* JADX INFO: renamed from: ac */
    private void m745ac() {
        mo783d(4);
    }

    /* JADX INFO: renamed from: ad */
    private void m746ad() {
        BasePlayerView basePlayerView = this.f1244L;
        if (basePlayerView == null || basePlayerView.getParent() == null || !(this.f1244L.getParent() instanceof ViewGroup)) {
            return;
        }
        if (!mo714l() || this.f1176r) {
            mo774P();
        }
    }

    /* JADX INFO: renamed from: b */
    private BaseEndCardView m747b(boolean z) {
        MraidEndCardView mraidEndCardView = new MraidEndCardView(getContext(), this.f1161c, this.f1160b);
        mraidEndCardView.setEndCardListener(new MraidEndCardView.InterfaceC0892a() { // from class: com.anythink.basead.ui.BaseScreenATView.9
            @Override // com.anythink.basead.p025ui.MraidEndCardView.InterfaceC0892a
            /* JADX INFO: renamed from: a */
            public final void mo812a() {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                if (3 == baseScreenATView.f1267v) {
                    if (baseScreenATView.f1161c.m3168G() == 1 && BaseScreenATView.this.f1161c.m3170I()) {
                        return;
                    }
                    BaseScreenATView.this.mo710h();
                }
            }

            @Override // com.anythink.basead.p025ui.MraidEndCardView.InterfaceC0892a
            /* JADX INFO: renamed from: a */
            public final void mo813a(String str) {
                String str2 = BaseScreenATView.TAG;
                BaseScreenATView.this.f1161c.m3236w(str);
                BaseScreenATView.this.mo700a(1, 13);
            }

            @Override // com.anythink.basead.p025ui.MraidEndCardView.InterfaceC0892a
            /* JADX INFO: renamed from: b */
            public final void mo814b() {
            }

            @Override // com.anythink.basead.p025ui.MraidEndCardView.InterfaceC0892a
            /* JADX INFO: renamed from: c */
            public final void mo815c() {
                BaseScreenATView baseScreenATView = BaseScreenATView.this;
                if (3 == baseScreenATView.f1267v) {
                    if (baseScreenATView.f1161c.m3168G() == 1 && BaseScreenATView.this.f1161c.m3170I()) {
                        return;
                    }
                    BaseScreenATView.this.m776a(C0748f.m310a(C0748f.f729k, C0748f.f718Q));
                    BaseScreenATView.this.m781c(5);
                }
            }
        });
        mraidEndCardView.init(z);
        return mraidEndCardView;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m748b(BaseScreenATView baseScreenATView) {
        C0717a.m126a(1, baseScreenATView.f1161c, baseScreenATView.mo711i());
        AbstractC0778h abstractC0778h = baseScreenATView.f1252T;
        if (abstractC0778h != null) {
            abstractC0778h.mo458a();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m749b(BaseScreenATView baseScreenATView, long j) {
        C1219al c1219alM2489ah;
        Map<Integer, String[]> mapM2583z;
        AbstractC1247l abstractC1247l = baseScreenATView.f1161c;
        if (!(abstractC1247l instanceof AbstractC1217aj) || (c1219alM2489ah = ((AbstractC1217aj) abstractC1247l).m2489ah()) == null || (mapM2583z = c1219alM2489ah.m2583z()) == null || mapM2583z.size() <= 0) {
            return;
        }
        if (baseScreenATView.f1254V == null) {
            baseScreenATView.f1254V = new ConcurrentHashMap<>();
        }
        long j2 = j / 1000;
        for (Integer num : mapM2583z.keySet()) {
            if (baseScreenATView.f1254V.get(num) == null || !baseScreenATView.f1254V.get(num).booleanValue()) {
                if (j2 >= num.intValue()) {
                    baseScreenATView.f1254V.put(num, Boolean.TRUE);
                    C0751i c0751iMo711i = baseScreenATView.mo711i();
                    c0751iMo711i.f768h.f789i = num.intValue();
                    C0717a.m126a(32, baseScreenATView.f1161c, c0751iMo711i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m750c(BaseScreenATView baseScreenATView, long j) {
        if (baseScreenATView.f1236D && baseScreenATView.f1260ae == -1) {
            long j2 = baseScreenATView.f1261af;
            if (j2 != 0) {
                baseScreenATView.f1260ae = j;
                if (j2 > 0) {
                    baseScreenATView.f1262ag = j + j2;
                }
                baseScreenATView.mo764F();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m752d(long j) {
        C1219al c1219alM2489ah;
        Map<Integer, String[]> mapM2583z;
        AbstractC1247l abstractC1247l = this.f1161c;
        if (!(abstractC1247l instanceof AbstractC1217aj) || (c1219alM2489ah = ((AbstractC1217aj) abstractC1247l).m2489ah()) == null || (mapM2583z = c1219alM2489ah.m2583z()) == null || mapM2583z.size() <= 0) {
            return;
        }
        if (this.f1254V == null) {
            this.f1254V = new ConcurrentHashMap<>();
        }
        long j2 = j / 1000;
        for (Integer num : mapM2583z.keySet()) {
            if (this.f1254V.get(num) == null || !this.f1254V.get(num).booleanValue()) {
                if (j2 >= num.intValue()) {
                    this.f1254V.put(num, Boolean.TRUE);
                    C0751i c0751iMo711i = mo711i();
                    c0751iMo711i.f768h.f789i = num.intValue();
                    C0717a.m126a(32, this.f1161c, c0751iMo711i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m754e(long j) {
        if (this.f1236D && this.f1260ae == -1) {
            long j2 = this.f1261af;
            if (j2 != 0) {
                this.f1260ae = j;
                if (j2 > 0) {
                    this.f1262ag = j + j2;
                }
                mo764F();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m755e(BaseScreenATView baseScreenATView) {
        baseScreenATView.f1264ai = true;
        if (baseScreenATView.mo772N() != null) {
            baseScreenATView.mo772N().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m757g(BaseScreenATView baseScreenATView) {
        C0987b c0987b = baseScreenATView.f1247O;
        if (c0987b != null) {
            c0987b.m1170c();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m758h(BaseScreenATView baseScreenATView) {
        baseScreenATView.m789t();
        if (baseScreenATView.f1266ak == null) {
            baseScreenATView.f1266ak = new C0742c();
        }
        baseScreenATView.f1266ak.m302a(baseScreenATView.getContext(), baseScreenATView.f1161c, baseScreenATView.f1160b, baseScreenATView.new C082211());
    }

    /* JADX INFO: renamed from: A */
    public void mo759A() {
        if (mo770L() != null) {
            this.f1242J = mo698a(mo770L(), this.f1160b.f4333n.m3363n());
            mo770L().setVisibility(8);
            mo770L().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseScreenATView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseScreenATView.this.mo760B();
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo760B();

    /* JADX INFO: renamed from: C */
    public final void m761C() {
        BasePlayerView basePlayerView = this.f1244L;
        if (basePlayerView == null || !basePlayerView.isPlaying()) {
            return;
        }
        this.f1244L.stop();
        this.f1244L.removeAllViews();
        C0751i c0751iMo711i = mo711i();
        c0751iMo711i.f767g = m712j();
        C0717a.m126a(16, this.f1161c, c0751iMo711i);
    }

    /* JADX INFO: renamed from: D */
    public void mo762D() {
        if (mo772N() != null) {
            mo772N().setVisibility(8);
            mo772N().setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseScreenATView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseScreenATView.m758h(BaseScreenATView.this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: E */
    public void mo763E() {
        mo783d(0);
        MuteImageView muteImageView = this.f1251S;
        if (muteImageView == null || muteImageView.getVisibility() == 0) {
            return;
        }
        this.f1251S.setVisibility(0);
    }

    /* JADX INFO: renamed from: F */
    public void mo764F() {
        PanelView panelViewMo773O = mo773O();
        if (panelViewMo773O.getVisibility() != 0) {
            m699a(104);
            panelViewMo773O.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: G */
    public void mo765G() {
        if (mo773O().getVisibility() != 8) {
            mo773O().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m766H() {
        if (this.f1264ai || mo772N() == null || mo772N().getVisibility() == 0) {
            return;
        }
        mo772N().setVisibility(0);
    }

    /* JADX INFO: renamed from: I */
    public void mo767I() {
        if (mo770L() != null && mo770L().getVisibility() != 0) {
            mo770L().setVisibility(0);
            mo770L().setClickAreaScaleFactor(this.f1242J);
        }
        m766H();
    }

    /* JADX INFO: renamed from: J */
    public abstract void mo768J();

    /* JADX INFO: renamed from: K */
    public void mo769K() {
        m699a(103);
        BasePlayerView basePlayerView = this.f1244L;
        if (basePlayerView != null && basePlayerView.getParent() != null && (this.f1244L.getParent() instanceof ViewGroup) && (!mo714l() || this.f1176r)) {
            mo774P();
        }
        mo783d(8);
        if (mo770L() != null) {
            mo770L().setClickAreaScaleFactor(this.f1242J);
        }
        MuteImageView muteImageView = this.f1251S;
        if (muteImageView != null) {
            muteImageView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: L */
    public CloseImageView mo770L() {
        return this.f1249Q;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m771M() {
        BasePlayerView basePlayerView;
        return this.f1267v == 1 && this.f1238F == 101 && (basePlayerView = this.f1244L) != null && (basePlayerView instanceof WebLandpagePlayerView);
    }

    /* JADX INFO: renamed from: N */
    public ViewGroup mo772N() {
        return this.f1250R;
    }

    /* JADX INFO: renamed from: O */
    public PanelView mo773O() {
        return this.f1245M;
    }

    /* JADX INFO: renamed from: P */
    public void mo774P() {
        BasePlayerView basePlayerView = this.f1244L;
        if (basePlayerView == null || basePlayerView.getParent() == null) {
            return;
        }
        ((ViewGroup) this.f1244L.getParent()).removeView(this.f1244L);
        this.f1244L = null;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo700a(int i, int i2) {
        this.f1242J = mo698a(mo770L(), this.f1160b.f4333n.m3361m());
        if (this.f1265aj || this.f1161c == null) {
            return;
        }
        super.mo700a(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void mo775a(long j) {
        long j2 = this.f1262ag;
        if (j2 >= 0 && j > j2) {
            mo765G();
            return;
        }
        if (this.f1236D) {
            long j3 = this.f1260ae;
            if (j3 < 0 || j < j3) {
                return;
            }
            mo764F();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m776a(C0747e c0747e) {
        AbstractC0778h abstractC0778h = this.f1252T;
        if (abstractC0778h != null) {
            abstractC0778h.mo459a(c0747e);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo703a(C0779i c0779i) {
        AbstractC0778h abstractC0778h = this.f1252T;
        if (abstractC0778h != null) {
            abstractC0778h.mo463b(c0779i);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: a */
    public final void mo704a(boolean z) {
        AbstractC0778h abstractC0778h = this.f1252T;
        if (abstractC0778h != null) {
            abstractC0778h.mo461a(z);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo777b() {
        this.f1243K = (RelativeLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_rl_root", "id"));
        this.f1244L = (BasePlayerView) findViewById(C1345i.m4154a(getContext(), "myoffer_player_view_id", "id"));
        this.f1245M = (PanelView) findViewById(C1345i.m4154a(getContext(), "myoffer_banner_view_id", "id"));
        this.f1248P = (CountDownView) findViewById(C1345i.m4154a(getContext(), "myoffer_count_down_view_id", "id"));
        this.f1251S = (MuteImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_btn_mute_id", "id"));
        this.f1249Q = (CloseImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_btn_close_id", "id"));
        this.f1250R = (ViewGroup) findViewById(C1345i.m4154a(getContext(), "myoffer_feedback_ll_id", "id"));
        mo780c();
        mo783d(4);
        mo795z();
        mo759A();
        mo762D();
        mo792w();
        this.f1236D = mo779b(this.f1237E);
    }

    /* JADX INFO: renamed from: b */
    public void mo778b(long j) {
        CountDownView countDownView = this.f1248P;
        if (countDownView == null || countDownView.getVisibility() != 0) {
            return;
        }
        this.f1248P.refresh(j);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo779b(int i);

    /* JADX INFO: renamed from: c */
    public void mo780c() {
    }

    /* JADX INFO: renamed from: c */
    public final void m781c(int i) {
        C0751i c0751iMo711i = mo711i();
        c0751iMo711i.f767g = m712j();
        C0717a.m126a(7, this.f1161c, c0751iMo711i);
        AbstractC0778h abstractC0778h = this.f1252T;
        if (abstractC0778h != null) {
            abstractC0778h.m548a(i);
            this.f1252T.mo465d();
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo782c(long j) {
        CountDownView countDownView = this.f1248P;
        if (countDownView != null) {
            countDownView.setDuration(j);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: d */
    public void mo706d() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        this.f1269x = i;
        int i2 = displayMetrics.heightPixels;
        this.f1270y = i2;
        this.f1255W = i;
        this.f1256aa = i2;
        mo791v();
    }

    /* JADX INFO: renamed from: d */
    public void mo783d(int i) {
        CountDownView countDownView = this.f1248P;
        if (countDownView != null) {
            if (i == 0 && countDownView.getVisibility() == 0) {
                return;
            }
            this.f1248P.setVisibility(i);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    public void destroy() {
        super.destroy();
        this.f1252T = null;
        BaseEndCardView baseEndCardView = this.f1246N;
        if (baseEndCardView != null) {
            baseEndCardView.mo723a();
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: e */
    public final void mo707e() {
        if (this.f1252T != null) {
            int i = this.f1238F;
            int i2 = 5;
            if (i == 1) {
                i2 = this.f1160b.f4333n.m3310ak() == 1 ? 2 : 8;
            } else if (i == 2) {
                i2 = 3;
            } else if (i == 3) {
                i2 = 4;
            } else if (i != 4) {
                i2 = i != 5 ? i != 101 ? 1 : 7 : 6;
            }
            C0779i c0779i = new C0779i();
            c0779i.f981c = i2;
            if ((this instanceof LetterFullScreenATView) || (this instanceof LetterHalfScreenATView)) {
                c0779i.f982d = 1;
            } else {
                c0779i.f982d = 2;
            }
            this.f1252T.mo460a(c0779i);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: f */
    public final void mo708f() {
        this.f1265aj = true;
        if (this.f1247O == null) {
            this.f1247O = new C0987b(this.f1243K);
        }
        this.f1247O.m1169b();
    }

    public C0752j fillVideoEndRecord(boolean z) {
        C0752j c0752j = new C0752j();
        c0752j.f790l = this.f1268w == 2 ? 4 : 1;
        c0752j.f792r = 1;
        BasePlayerView basePlayerView = this.f1244L;
        c0752j.f781a = basePlayerView != null ? basePlayerView.getVideoLength() / 1000 : 0L;
        c0752j.f782b = this.f1234B / 1000;
        BasePlayerView basePlayerView2 = this.f1244L;
        c0752j.f783c = basePlayerView2 != null ? basePlayerView2.getCurrentPosition() / 1000 : 0L;
        long j = this.f1234B;
        c0752j.f784d = j == 0 ? 1 : 0;
        c0752j.f791o = j == 0 ? 1 : 2;
        BasePlayerView basePlayerView3 = this.f1244L;
        c0752j.f785e = (basePlayerView3 == null || basePlayerView3.getCurrentPosition() != this.f1244L.getVideoLength()) ? 0 : 1;
        c0752j.f793u = z ? 0 : 2;
        c0752j.f786f = this.f1259ad;
        c0752j.f787g = System.currentTimeMillis();
        BasePlayerView basePlayerView4 = this.f1244L;
        c0752j.f788h = basePlayerView4 != null ? basePlayerView4.getCurrentPosition() : 0L;
        new StringBuilder("Video End Record:").append(c0752j.toString());
        return c0752j;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: g */
    public final void mo709g() {
        this.f1265aj = false;
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.12
            @Override // java.lang.Runnable
            public final void run() {
                BaseScreenATView.m757g(BaseScreenATView.this);
            }
        });
    }

    public float getCloseButtonScaleFactor() {
        return this.f1242J;
    }

    public long getHideBannerTime() {
        return this.f1262ag;
    }

    public int getPlayerViewType() {
        return this.f1238F;
    }

    public long getShowBannerTime() {
        return this.f1260ae;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: h */
    public final synchronized void mo710h() {
        if (this.f1160b.f4333n.m3287V() > 0) {
            C1175n.m2059a().m2118a(this.f1253U, this.f1160b.f4333n.m3287V());
        } else {
            super.mo710h();
        }
    }

    public boolean hasReward() {
        return this.f1240H;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: i */
    public final C0751i mo711i() {
        C0751i c0751i = new C0751i(this.f1160b.f4323d, this.f1173o);
        c0751i.f765e = getWidth();
        c0751i.f766f = getHeight();
        BasePlayerView basePlayerView = this.f1244L;
        if (basePlayerView != null && basePlayerView.hasVideo()) {
            c0751i.f768h = fillVideoEndRecord(true);
        }
        return c0751i;
    }

    public void init() {
        mo777b();
        if (this.f1239G) {
            mo786q();
            return;
        }
        int i = this.f1267v;
        if (1 == i) {
            if (this.f1238F == 100) {
                m742a((List<Bitmap>) null);
            } else {
                C1335b.m3998a().m4007a((Runnable) new RunnableC08285(new C08307()), 2, true);
            }
            m728R();
            return;
        }
        if (3 == i) {
            if (C0731d.m245a(this.f1161c, this.f1160b)) {
                mo785p();
                m728R();
            } else {
                mo786q();
                if (C0731d.m246b(this.f1161c)) {
                    return;
                }
                mo710h();
            }
        }
    }

    public boolean isShowEndCard() {
        return this.f1239G;
    }

    public boolean isVideoMute() {
        return this.f1241I;
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: l */
    public final boolean mo714l() {
        return C0731d.m245a(this.f1161c, this.f1160b);
    }

    @Override // com.anythink.basead.p025ui.BaseATView
    /* JADX INFO: renamed from: m */
    public RelativeLayout.LayoutParams mo715m() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f1268w == 2) {
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, C1345i.m4153a(getContext(), 154.0f));
        } else {
            int measuredHeight = (getMeasuredHeight() * 2) / 3;
            layoutParams.addRule(11);
            layoutParams.setMargins(0, measuredHeight, 0, 0);
        }
        return layoutParams;
    }

    public boolean needHideFeedbackButton() {
        return this.f1264ai;
    }

    /* JADX INFO: renamed from: o */
    public void mo784o() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (m771M()) {
            ((WebLandpagePlayerView) this.f1244L).onActivityResult(i, i2, intent);
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo785p() {
        m742a(new ArrayList());
    }

    /* JADX INFO: renamed from: q */
    public void mo786q() {
        m699a(102);
        this.f1239G = true;
        if (C0731d.m246b(this.f1161c)) {
            if (this.f1246N == null) {
                this.f1246N = m747b(false);
            }
            mo768J();
            mo769K();
        } else {
            this.f1237E = mo787r();
            EndCardView endCardView = new EndCardView(getContext(), this.f1161c, this.f1160b);
            endCardView.setSize(this.f1269x, this.f1270y);
            endCardView.init(false, false, new C082110());
            this.f1246N = endCardView;
            mo768J();
            endCardView.load();
            if (mo779b(this.f1237E)) {
                mo764F();
                PanelView panelViewMo773O = mo773O();
                if (panelViewMo773O != null && panelViewMo773O.getVisibility() == 0) {
                    View cTAButton = panelViewMo773O.getCTAButton();
                    PanelView cTAButton2 = panelViewMo773O;
                    if (cTAButton != null) {
                        int visibility = panelViewMo773O.getCTAButton().getVisibility();
                        cTAButton2 = panelViewMo773O;
                        if (visibility == 0) {
                            cTAButton2 = panelViewMo773O.getCTAButton();
                        }
                    }
                    this.f1175q = cTAButton2;
                }
            }
        }
        BaseEndCardView baseEndCardView = this.f1246N;
        if (baseEndCardView != null) {
            baseEndCardView.postDelayed(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenATView.8
                @Override // java.lang.Runnable
                public final void run() {
                    BaseScreenATView.this.mo767I();
                }
            }, m737a(this.f1160b.f4333n));
        }
        C0717a.m126a(6, this.f1161c, mo711i());
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo787r();

    /* JADX INFO: renamed from: s */
    public final void m788s() {
        m699a(110);
        this.f1263ah = true;
        try {
            C0742c c0742c = this.f1266ak;
            if (c0742c == null || !c0742c.m303a()) {
                m744ab();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCloseButtonScaleFactor(float f) {
        this.f1242J = f;
        if (mo770L() != null) {
            mo770L().setClickAreaScaleFactor(this.f1242J);
        }
    }

    public void setHasReward(boolean z) {
        this.f1240H = z;
    }

    public void setHideBannerTime(long j) {
        this.f1262ag = j;
    }

    public void setHideFeedbackButton(boolean z) {
        this.f1264ai = z;
    }

    public void setIsShowEndCard(boolean z) {
        this.f1239G = z;
    }

    public void setListener(AbstractC0778h abstractC0778h) {
        this.f1252T = abstractC0778h;
    }

    public void setShowBannerTime(long j) {
        this.f1260ae = j;
    }

    public void setVideoMute(boolean z) {
        this.f1241I = z;
    }

    /* JADX INFO: renamed from: t */
    public final void m789t() {
        m699a(111);
        this.f1263ah = false;
        BasePlayerView basePlayerView = this.f1244L;
        if (basePlayerView != null) {
            if (basePlayerView.isPlaying()) {
                C0717a.m126a(11, this.f1161c, mo711i());
            }
            this.f1244L.pause();
        }
    }

    /* JADX INFO: renamed from: u */
    public void mo790u() {
        destroy();
        C1175n.m2059a().m2144d(this.f1253U);
    }

    /* JADX INFO: renamed from: v */
    public void mo791v() {
        String strM3239y = this.f1161c.m3239y();
        if (!TextUtils.isEmpty(strM3239y)) {
            C0732e.m247a();
            int[] iArrM4026a = C1339c.m4026a(C0732e.m248a(1, strM3239y));
            if (iArrM4026a != null) {
                int i = iArrM4026a[0];
                this.f1257ab = i;
                int i2 = iArrM4026a[1];
                this.f1258ac = i2;
                this.f1255W = i;
                this.f1256aa = i2;
            }
        }
        StringBuilder sb = new StringBuilder("mMaterialWidth: ");
        sb.append(this.f1255W);
        sb.append(", mMaterialHeight: ");
        sb.append(this.f1256aa);
    }

    /* JADX INFO: renamed from: w */
    public void mo792w() {
        PanelView panelView = this.f1245M;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.f1245M.init(this.f1161c, this.f1160b, this.f1268w, mo713k(), new PanelView.InterfaceC0910a() { // from class: com.anythink.basead.ui.BaseScreenATView.13
                @Override // com.anythink.basead.p025ui.PanelView.InterfaceC0910a
                /* JADX INFO: renamed from: a */
                public final void mo798a(int i, int i2) {
                    BaseScreenATView.this.mo700a(i, i2);
                }

                @Override // com.anythink.basead.p025ui.PanelView.InterfaceC0910a
                /* JADX INFO: renamed from: a */
                public final boolean mo799a() {
                    if (!BaseScreenATView.this.m794y()) {
                        return false;
                    }
                    BaseScreenATView.this.mo700a(4, 5);
                    return true;
                }
            });
        }
        mo793x();
    }

    /* JADX INFO: renamed from: x */
    public void mo793x() {
    }

    /* JADX INFO: renamed from: y */
    public final boolean m794y() {
        C0742c c0742c = this.f1266ak;
        return (c0742c == null || !c0742c.m303a()) && this.f1263ah;
    }

    /* JADX INFO: renamed from: z */
    public void mo795z() {
        MuteImageView muteImageView = this.f1251S;
        if (muteImageView == null) {
            return;
        }
        muteImageView.setMute(this.f1241I);
        this.f1251S.setVisibility(4);
        this.f1251S.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseScreenATView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseScreenATView baseScreenATView;
                BaseScreenATView baseScreenATView2 = BaseScreenATView.this;
                BasePlayerView basePlayerView = baseScreenATView2.f1244L;
                if (basePlayerView == null || baseScreenATView2.f1251S == null) {
                    return;
                }
                boolean zIsMute = basePlayerView.isMute();
                boolean z = true;
                if (!zIsMute) {
                    baseScreenATView = BaseScreenATView.this;
                } else {
                    baseScreenATView = BaseScreenATView.this;
                    z = false;
                }
                baseScreenATView.f1241I = z;
                baseScreenATView.f1251S.setMute(z);
                BaseScreenATView.this.f1244L.setMute(z);
            }
        });
    }
}
