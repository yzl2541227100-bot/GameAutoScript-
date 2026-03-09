package com.octopus.p222ad.internal.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.anythink.expressad.p086d.C1486b;
import com.octopus.p222ad.ADBidEvent;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.AdLifeControl;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.AppEventListener;
import com.octopus.p222ad.BannerAdListener;
import com.octopus.p222ad.BannerAdView;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.C3064a;
import com.octopus.p222ad.IBidding;
import com.octopus.p222ad.InterstitialAdListener;
import com.octopus.p222ad.RewardVideoAdListener;
import com.octopus.p222ad.SplashAdListener;
import com.octopus.p222ad.internal.AsyncTaskC3115h;
import com.octopus.p222ad.internal.C3110c;
import com.octopus.p222ad.internal.C3111d;
import com.octopus.p222ad.internal.C3130p;
import com.octopus.p222ad.internal.EnumC3119l;
import com.octopus.p222ad.internal.InterfaceC3073a;
import com.octopus.p222ad.internal.InterfaceC3081b;
import com.octopus.p222ad.internal.network.AsyncTaskC3126a;
import com.octopus.p222ad.internal.network.InterfaceC3127b;
import com.octopus.p222ad.internal.network.ServerResponse;
import com.octopus.p222ad.internal.p225a.C3075b;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.SPUtils;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.internal.video.AdVideoView;
import com.octopus.p222ad.internal.view.AdWebView;
import com.octopus.p222ad.internal.view.C3197e;
import com.octopus.p222ad.p223a.C3065a;
import com.octopus.p222ad.p223a.InterfaceC3066b;
import com.octopus.p222ad.p224b.C3069b;
import com.octopus.p222ad.p224b.C3070c;
import com.octopus.p222ad.p224b.C3072e;
import com.octopus.p222ad.utils.C3262c;
import com.octopus.p222ad.utils.C3266g;
import com.octopus.p222ad.utils.ThreadUtils;
import com.octopus.p222ad.widget.SkipView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AdViewImpl extends FrameLayout implements AdLifeControl, IBidding, InterfaceC3073a {

    /* JADX INFO: renamed from: ah */
    private static FrameLayout f17498ah;

    /* JADX INFO: renamed from: ai */
    private static C3197e f17499ai;

    /* JADX INFO: renamed from: aj */
    private static AdWebView.InterfaceC3182b f17500aj;

    /* JADX INFO: renamed from: A */
    private boolean f17501A;

    /* JADX INFO: renamed from: B */
    private AppCompatTextView f17502B;

    /* JADX INFO: renamed from: C */
    private AppCompatTextView f17503C;

    /* JADX INFO: renamed from: D */
    private ImageView f17504D;

    /* JADX INFO: renamed from: E */
    private C3065a f17505E;

    /* JADX INFO: renamed from: F */
    private AppCompatImageView f17506F;

    /* JADX INFO: renamed from: G */
    private long f17507G;

    /* JADX INFO: renamed from: H */
    private GestureDetector f17508H;

    /* JADX INFO: renamed from: I */
    private float f17509I;

    /* JADX INFO: renamed from: J */
    private float f17510J;

    /* JADX INFO: renamed from: K */
    private float f17511K;

    /* JADX INFO: renamed from: L */
    private float f17512L;

    /* JADX INFO: renamed from: M */
    private FrameLayout f17513M;

    /* JADX INFO: renamed from: N */
    private FrameLayout f17514N;

    /* JADX INFO: renamed from: O */
    private int f17515O;

    /* JADX INFO: renamed from: P */
    private String f17516P;

    /* JADX INFO: renamed from: Q */
    private String f17517Q;

    /* JADX INFO: renamed from: R */
    private String f17518R;

    /* JADX INFO: renamed from: S */
    private boolean f17519S;

    /* JADX INFO: renamed from: T */
    private boolean f17520T;

    /* JADX INFO: renamed from: U */
    private boolean f17521U;

    /* JADX INFO: renamed from: V */
    private boolean f17522V;

    /* JADX INFO: renamed from: W */
    private boolean f17523W;

    /* JADX INFO: renamed from: a */
    public ViewGroup f17524a;

    /* JADX INFO: renamed from: aa */
    private boolean f17525aa;

    /* JADX INFO: renamed from: ab */
    private boolean f17526ab;

    /* JADX INFO: renamed from: ac */
    private int f17527ac;

    /* JADX INFO: renamed from: ad */
    private View f17528ad;

    /* JADX INFO: renamed from: ae */
    private AdWebView f17529ae;

    /* JADX INFO: renamed from: af */
    private boolean f17530af;

    /* JADX INFO: renamed from: ag */
    private final InterfaceC3175d f17531ag;

    /* JADX INFO: renamed from: b */
    public C3172a f17532b;
    public int bottomPadding;

    /* JADX INFO: renamed from: c */
    public InterfaceC3194b f17533c;
    public int clickCount;

    /* JADX INFO: renamed from: d */
    public boolean f17534d;

    /* JADX INFO: renamed from: e */
    public boolean f17535e;

    /* JADX INFO: renamed from: f */
    public boolean f17536f;

    /* JADX INFO: renamed from: g */
    public boolean f17537g;

    /* JADX INFO: renamed from: h */
    public C3111d f17538h;

    /* JADX INFO: renamed from: i */
    public AsyncTaskC3126a.a f17539i;

    /* JADX INFO: renamed from: j */
    public boolean f17540j;

    /* JADX INFO: renamed from: k */
    public boolean f17541k;

    /* JADX INFO: renamed from: l */
    public int f17542l;
    public int leftPadding;
    public int loadCount;

    /* JADX INFO: renamed from: m */
    private View f17543m;
    public C3110c mAdFetcher;

    /* JADX INFO: renamed from: n */
    private int f17544n;

    /* JADX INFO: renamed from: o */
    private int f17545o;

    /* JADX INFO: renamed from: p */
    private String f17546p;

    /* JADX INFO: renamed from: q */
    private SplashAdListener f17547q;

    /* JADX INFO: renamed from: r */
    private InterstitialAdListener f17548r;
    public int rightPadding;

    /* JADX INFO: renamed from: s */
    private BannerAdListener f17549s;
    public ServerResponse serverResponse;

    /* JADX INFO: renamed from: t */
    private RewardVideoAdListener f17550t;
    public int topPadding;

    /* JADX INFO: renamed from: u */
    private AppEventListener f17551u;

    /* JADX INFO: renamed from: v */
    private C3174c f17552v;

    /* JADX INFO: renamed from: w */
    private final Handler f17553w;

    /* JADX INFO: renamed from: x */
    private C3173b f17554x;

    /* JADX INFO: renamed from: y */
    private boolean f17555y;

    /* JADX INFO: renamed from: z */
    private boolean f17556z;

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$1 */
    public class HandlerC31491 extends Handler {
        public HandlerC31491(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$10 */
    public class ViewOnClickListenerC315010 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3197e f17558a;

        public ViewOnClickListenerC315010(C3197e c3197e) {
            c3197e = c3197e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c3197e.m14790a();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$11 */
    public class ViewOnClickListenerC315111 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3197e f17560a;

        public ViewOnClickListenerC315111(C3197e c3197e) {
            c3197e = c3197e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c3197e.m14790a();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$12 */
    public class RunnableC315212 implements Runnable {

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$12$1 */
        public class AnonymousClass1 implements GestureDetector.OnGestureListener {
            public AnonymousClass1() {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                AdViewImpl.this.f17509I = motionEvent.getX();
                AdViewImpl.this.f17510J = motionEvent.getY();
                AdViewImpl.this.f17511K = motionEvent.getRawX();
                AdViewImpl.this.f17512L = motionEvent.getRawY();
                AdViewImpl adViewImpl = AdViewImpl.this;
                int i = adViewImpl.clickCount;
                int i2 = adViewImpl.loadCount;
                return true;
            }
        }

        public RunnableC315212() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdViewImpl.this.f17508H = new GestureDetector(new GestureDetector.OnGestureListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.12.1
                public AnonymousClass1() {
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public boolean onDown(MotionEvent motionEvent) {
                    return false;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    return false;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public void onLongPress(MotionEvent motionEvent) {
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    return false;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public void onShowPress(MotionEvent motionEvent) {
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public boolean onSingleTapUp(MotionEvent motionEvent) {
                    AdViewImpl.this.f17509I = motionEvent.getX();
                    AdViewImpl.this.f17510J = motionEvent.getY();
                    AdViewImpl.this.f17511K = motionEvent.getRawX();
                    AdViewImpl.this.f17512L = motionEvent.getRawY();
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    int i = adViewImpl.clickCount;
                    int i2 = adViewImpl.loadCount;
                    return true;
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$13 */
    public class C315313 extends AppCompatTextView {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3197e f17564a;

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$13$1 */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewGroup.MarginLayoutParams f17566a;

            public AnonymousClass1(ViewGroup.MarginLayoutParams marginLayoutParams) {
                marginLayoutParams = marginLayoutParams;
            }

            @Override // java.lang.Runnable
            public void run() {
                C315313.this.setLayoutParams(marginLayoutParams);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C315313(Context context, C3197e c3197e) {
            super(context);
            c3197e = c3197e;
        }

        @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
        @SuppressLint({"NewApi", "DrawAllocation"})
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            Activity activity;
            boolean z3;
            Point point;
            int i5;
            int i6;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Point point2 = new Point(0, 0);
            try {
                activity = (Activity) c3197e.f17753b.getContext();
                z3 = true;
            } catch (ClassCastException unused) {
                activity = null;
                z3 = false;
            }
            if (z3) {
                activity.getWindowManager().getDefaultDisplay().getSize(point2);
            }
            int[] iArr2 = new int[2];
            if (AdViewImpl.this.getMediaType().equals(EnumC3119l.INTERSTITIAL)) {
                InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.measure(0, 0);
                InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getLocationOnScreen(iArr2);
                point = new Point(InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getMeasuredWidth(), InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getMeasuredHeight());
            } else {
                AdViewImpl.this.measure(0, 0);
                AdViewImpl.this.getLocationOnScreen(iArr2);
                point = new Point(AdViewImpl.this.getMeasuredWidth(), AdViewImpl.this.getMeasuredHeight());
            }
            int i7 = point.x;
            int i8 = AdViewImpl.this.f17542l;
            int iMin = i7 - i8;
            int iMin2 = point.y - i8;
            if (z3) {
                iMin = (iArr2[0] + Math.min(point2.x, i7)) - AdViewImpl.this.f17542l;
                iMin2 = (iArr2[1] + Math.min(point2.y, point.y)) - AdViewImpl.this.f17542l;
                i5 = iArr2[0];
                i6 = iArr2[1];
            } else {
                i5 = 0;
                i6 = 0;
            }
            if (iArr[0] + 1 < i5 || iArr[0] - 1 > iMin || iArr[1] + 1 < i6 || iArr[1] - 1 > iMin2) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 53);
                layoutParams.setMargins(40, 40, 40, 40);
                post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.13.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ ViewGroup.MarginLayoutParams f17566a;

                    public AnonymousClass1(ViewGroup.MarginLayoutParams layoutParams2) {
                        marginLayoutParams = layoutParams2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C315313.this.setLayoutParams(marginLayoutParams);
                    }
                });
                AdViewImpl.this.f17503C.setBackgroundDrawable(getResources().getDrawable(C3063R.drawable.oct_close_background));
                AdViewImpl.this.f17503C.setTextColor(ContextCompat.getColorStateList(getContext(), C3063R.color.oct_text_selector));
                AdViewImpl.this.f17503C.setTextSize(2, 16.0f);
                AdViewImpl.this.f17503C.setText(C3063R.string.skip_ad);
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$14 */
    public class ViewOnClickListenerC315414 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3197e f17568a;

        public ViewOnClickListenerC315414(C3197e c3197e) {
            c3197e = c3197e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c3197e.m14790a();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$15 */
    public class C315515 implements InterfaceC3175d {
        public C315515() {
        }

        @Override // com.octopus.p222ad.internal.view.AdViewImpl.InterfaceC3175d
        /* JADX INFO: renamed from: a */
        public void mo14538a(int i) {
            if (AdViewImpl.this.f17521U || AdViewImpl.this.f17522V || AdViewImpl.this.f17523W || AdViewImpl.this.f17525aa) {
                return;
            }
            AdViewImpl adViewImpl = AdViewImpl.this;
            if (adViewImpl.serverResponse != null) {
                SPUtils.putFrequency(adViewImpl.getContext(), "liftUpfrequency" + AdViewImpl.this.serverResponse.getTagId(), i);
                AdViewImpl.this.m14667h();
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$16 */
    public static /* synthetic */ class C315616 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17571a;

        static {
            int[] iArr = new int[C3197e.a.values().length];
            f17571a = iArr;
            try {
                iArr[C3197e.a.bottom_center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17571a[C3197e.a.bottom_left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17571a[C3197e.a.bottom_right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17571a[C3197e.a.center.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17571a[C3197e.a.top_center.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17571a[C3197e.a.top_left.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17571a[C3197e.a.top_right.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$17 */
    public class RunnableC315717 implements Runnable {
        public RunnableC315717() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdViewImpl.this.f17529ae.f17644ad.handleView(AdViewImpl.this.f17529ae, AdViewImpl.this.f17538h.m14369a());
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$18 */
    public class RunnableC315818 implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int[] f17574b;

        public RunnableC315818(int[] iArr) {
            iArr = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InterfaceC3175d interfaceC3175d = interfaceC3175d;
                int[] iArr = iArr;
                int i = iArr[0] - 1;
                iArr[0] = i;
                interfaceC3175d.mo14538a(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$19 */
    public class C315919 implements InterfaceC3175d {
        public C315919() {
        }

        @Override // com.octopus.p222ad.internal.view.AdViewImpl.InterfaceC3175d
        /* JADX INFO: renamed from: a */
        public void mo14538a(int i) {
            if (AdViewImpl.this.f17521U || AdViewImpl.this.f17522V || AdViewImpl.this.f17523W) {
                return;
            }
            AdViewImpl adViewImpl = AdViewImpl.this;
            if (adViewImpl.serverResponse != null) {
                SPUtils.putFrequency(adViewImpl.getContext(), "frequency" + AdViewImpl.this.serverResponse.getTagId(), i);
                AdViewImpl.this.m14665g();
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$2 */
    public class C31602 implements InterfaceC3066b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f17576a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f17577b;

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$2$1 */
        public class AnonymousClass1 implements View.OnClickListener {
            public AnonymousClass1() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AdViewImpl.this.mo14697e()) {
                    C31602 c31602 = C31602.this;
                    if (!z) {
                        AdViewImpl.this.getAdDispatcher().mo14241b();
                        C31602 c316022 = C31602.this;
                        Activity activity = AdViewImpl.this.getActivity(view);
                        if (activity == null || activity.isFinishing()) {
                            return;
                        }
                        activity.finish();
                        return;
                    }
                    View view2 = view;
                    if (view2 instanceof AdWebView) {
                        if (!((AdWebView) view2).loadAdBy(1)) {
                            return;
                        }
                    } else if (!(view2 instanceof AdVideoView) || !((AdVideoView) view2).getAdWebView().loadAdBy(1)) {
                        return;
                    }
                    ((C3075b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).m14234g();
                }
            }
        }

        public C31602(boolean z, View view) {
            z = z;
            view = view;
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13860a() {
            AdViewImpl.this.f17502B.setText("");
            AdViewImpl.this.f17502B.setBackgroundResource(C3063R.drawable.oct_close);
            AdViewImpl.this.f17502B.setVisibility(0);
            AdViewImpl.this.f17502B.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.2.1
                public AnonymousClass1() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AdViewImpl.this.mo14697e()) {
                        C31602 c31602 = C31602.this;
                        if (!z) {
                            AdViewImpl.this.getAdDispatcher().mo14241b();
                            C31602 c316022 = C31602.this;
                            Activity activity = AdViewImpl.this.getActivity(view);
                            if (activity == null || activity.isFinishing()) {
                                return;
                            }
                            activity.finish();
                            return;
                        }
                        View view2 = view;
                        if (view2 instanceof AdWebView) {
                            if (!((AdWebView) view2).loadAdBy(1)) {
                                return;
                            }
                        } else if (!(view2 instanceof AdVideoView) || !((AdVideoView) view2).getAdWebView().loadAdBy(1)) {
                            return;
                        }
                        ((C3075b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).m14234g();
                    }
                }
            });
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13861a(long j) {
            AdViewImpl.this.f17502B.setText(Integer.toString((int) ((j / 1000) + 1)));
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: b */
        public void mo13862b() {
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$20 */
    public class RunnableC316120 implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int[] f17581b;

        public RunnableC316120(int[] iArr) {
            iArr = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InterfaceC3175d interfaceC3175d = interfaceC3175d;
                int[] iArr = iArr;
                int i = iArr[0] - 1;
                iArr[0] = i;
                interfaceC3175d.mo14538a(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$21 */
    public class RunnableC316221 implements Runnable {
        public RunnableC316221() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdViewImpl.this.m14665g();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$22 */
    public class ViewOnClickListenerC316322 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AdVideoView f17583a;

        public ViewOnClickListenerC316322(AdVideoView adVideoView) {
            adVideoView = adVideoView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AdViewImpl.this.f17506F.setImageResource(adVideoView.toggleMute() ? C3063R.drawable.oct_voice_off : C3063R.drawable.oct_voice_on);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$23 */
    public class C316423 implements InterfaceC3066b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f17585a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f17586b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f17587c;

        public C316423(int i, boolean z, View view) {
            i = i;
            z = z;
            view = view;
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13860a() {
            AdViewImpl.this.f17502B.setText("0");
            if (!AdViewImpl.this.mo14697e()) {
                AdViewImpl.this.getAdDispatcher().mo14241b();
                if (AdViewImpl.this.f17524a == null) {
                    HaoboLog.m14609e(HaoboLog.jsLogTag, "Should not close banner!");
                    return;
                }
                return;
            }
            if (!z) {
                AdViewImpl.this.getAdDispatcher().mo14241b();
                Activity activity = AdViewImpl.this.getActivity(view);
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                activity.finish();
                return;
            }
            View view = view;
            if (view instanceof AdWebView) {
                if (!((AdWebView) view).loadAdBy(1)) {
                    return;
                }
            } else if (!(view instanceof AdVideoView) || !((AdVideoView) view).getAdWebView().loadAdBy(1)) {
                return;
            }
            ((C3075b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).m14234g();
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13861a(long j) {
            int i = (int) ((j / 1000) + 1);
            int i2 = i;
            AdViewImpl.this.f17502B.setText(Integer.toString(i));
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: b */
        public void mo13862b() {
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$3 */
    public class ViewOnClickListenerC31653 implements View.OnClickListener {
        public ViewOnClickListenerC31653() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AdViewImpl.this.getAdDispatcher().mo14241b();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$4 */
    public class C31664 implements InterfaceC3066b {
        public C31664() {
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13860a() {
            AdViewImpl.this.f17532b.m14700a(true);
            if (AdViewImpl.this.f17532b.m14701a() && (AdViewImpl.this.f17532b.m14703c() == C3172a.a.UNCHANGE || AdViewImpl.this.f17532b.m14703c() == C3172a.a.STATE_PREPARE_CHANGE)) {
                AdViewImpl.this.getAdDispatcher().mo14241b();
            }
            if (AdViewImpl.this.f17524a == null) {
                HaoboLog.m14609e(HaoboLog.jsLogTag, "Should not close banner!");
            }
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13861a(long j) {
            AdViewImpl.this.getAdDispatcher().mo14237a(j);
            int i = (int) ((j / 1000) + 1);
            if (AdViewImpl.this.f17543m == null || !AdViewImpl.this.f17519S) {
                return;
            }
            ((SkipView) AdViewImpl.this.f17543m).setText(String.format("跳过 %d", Integer.valueOf(i)));
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: b */
        public void mo13862b() {
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$5 */
    public class ViewOnClickListenerC31675 implements View.OnClickListener {
        public ViewOnClickListenerC31675() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AdViewImpl.this.f17520T) {
                AdViewImpl.this.m14665g();
                return;
            }
            AdViewImpl.this.getAdDispatcher().mo14241b();
            if (AdViewImpl.this.f17505E != null) {
                AdViewImpl.this.f17505E.m13858d();
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$6 */
    public class C31686 implements InterfaceC3066b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f17592a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f17593b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f17594c;

        public C31686(int i, boolean z, View view) {
            i = i;
            z = z;
            view = view;
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13860a() {
            AdViewImpl.this.f17502B.setText("0");
            if (!AdViewImpl.this.mo14697e()) {
                AdViewImpl.this.f17532b.m14700a(true);
                if (AdViewImpl.this.f17532b.m14701a() && (AdViewImpl.this.f17532b.m14703c() == C3172a.a.UNCHANGE || AdViewImpl.this.f17532b.m14703c() == C3172a.a.STATE_PREPARE_CHANGE)) {
                    AdViewImpl.this.getAdDispatcher().mo14241b();
                }
                if (AdViewImpl.this.f17524a == null) {
                    HaoboLog.m14609e(HaoboLog.jsLogTag, "Should not close banner!");
                    return;
                }
                return;
            }
            if (!z) {
                AdViewImpl.this.getAdDispatcher().mo14241b();
                Activity activity = AdViewImpl.this.getActivity(view);
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                activity.finish();
                return;
            }
            View view = view;
            if (view instanceof AdWebView) {
                if (!((AdWebView) view).loadAdBy(1)) {
                    return;
                }
            } else if (!(view instanceof AdVideoView) || !((AdVideoView) view).getAdWebView().loadAdBy(1)) {
                return;
            }
            ((C3075b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).m14234g();
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13861a(long j) {
            int i = (int) ((j / 1000) + 1);
            int i2 = i;
            if (i2 > 0 && i <= i2) {
                AdViewImpl.this.f17503C.setEnabled(true);
            }
            AdViewImpl.this.f17502B.setText(Integer.toString(i));
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: b */
        public void mo13862b() {
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$7 */
    public class C31697 implements InterfaceC3066b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f17596a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f17597b;

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$7$1 */
        public class AnonymousClass1 implements View.OnClickListener {
            public AnonymousClass1() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdViewImpl.this.getAdDispatcher().mo14241b();
                if (AdViewImpl.this.f17505E != null) {
                    AdViewImpl.this.f17505E.m13858d();
                }
                C31697 c31697 = C31697.this;
                Activity activity = AdViewImpl.this.getActivity(view);
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                activity.finish();
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$7$2 */
        public class AnonymousClass2 implements View.OnClickListener {
            public AnonymousClass2() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AdViewImpl.this.mo14697e()) {
                    AdViewImpl.this.getAdDispatcher().mo14241b();
                    C31697 c31697 = C31697.this;
                    Activity activity = AdViewImpl.this.getActivity(view);
                    if (activity == null || activity.isFinishing()) {
                        return;
                    }
                    activity.finish();
                }
            }
        }

        public C31697(int i, View view) {
            i = i;
            view = view;
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13860a() {
            AdViewImpl.this.f17502B.setText("关闭");
            AdViewImpl.this.f17502B.setVisibility(0);
            AdViewImpl.this.f17502B.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.7.2
                public AnonymousClass2() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AdViewImpl.this.mo14697e()) {
                        AdViewImpl.this.getAdDispatcher().mo14241b();
                        C31697 c31697 = C31697.this;
                        Activity activity = AdViewImpl.this.getActivity(view);
                        if (activity == null || activity.isFinishing()) {
                            return;
                        }
                        activity.finish();
                    }
                }
            });
            AdViewImpl.this.f17503C.setVisibility(8);
            View view = view;
            if (view instanceof AdVideoView) {
                ((AdVideoView) view).onRewardVideoAdReward();
            }
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13861a(long j) {
            int i = (int) ((j / 1000) + 1);
            AdViewImpl.this.f17502B.setText(Integer.toString(i));
            int i2 = i;
            if (i2 <= 0 || i > i2) {
                return;
            }
            View view = view;
            if (view instanceof AdVideoView) {
                ((AdVideoView) view).onRewardVideoAdReward();
            }
            AdViewImpl.this.f17503C.setEnabled(true);
            AdViewImpl.this.f17503C.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.7.1
                public AnonymousClass1() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    AdViewImpl.this.getAdDispatcher().mo14241b();
                    if (AdViewImpl.this.f17505E != null) {
                        AdViewImpl.this.f17505E.m13858d();
                    }
                    C31697 c31697 = C31697.this;
                    Activity activity = AdViewImpl.this.getActivity(view);
                    if (activity == null || activity.isFinishing()) {
                        return;
                    }
                    activity.finish();
                }
            });
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: b */
        public void mo13862b() {
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$8 */
    public class C31708 implements InterfaceC3066b {
        public C31708() {
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13860a() {
            AdViewImpl.this.f17502B.setText("0");
            AdViewImpl.this.f17502B.setVisibility(8);
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: a */
        public void mo13861a(long j) {
            AdViewImpl.this.f17502B.setText(Integer.toString((int) ((j / 1000) + 1)));
        }

        @Override // com.octopus.p222ad.p223a.InterfaceC3066b
        /* JADX INFO: renamed from: b */
        public void mo13862b() {
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$9 */
    public class ViewOnClickListenerC31719 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f17602a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f17603b;

        public ViewOnClickListenerC31719(boolean z, View view) {
            z = z;
            view = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            if (!AdViewImpl.this.mo14697e()) {
                AdViewImpl.this.getAdDispatcher().mo14241b();
                if (AdViewImpl.this.f17505E != null) {
                    AdViewImpl.this.f17505E.m13858d();
                }
                if (AdViewImpl.this.f17524a != null) {
                    HaoboLog.m14609e(HaoboLog.jsLogTag, "Should not close banner!");
                    return;
                }
                return;
            }
            if (z) {
                View view2 = view;
                if (view2 instanceof AdWebView) {
                    if (((AdWebView) view2).loadAdBy(1)) {
                        ((C3075b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).m14234g();
                        return;
                    }
                    return;
                } else {
                    if (!(view2 instanceof AdVideoView)) {
                        return;
                    }
                    AdViewImpl.this.getAdDispatcher().mo14241b();
                    if (AdViewImpl.this.f17505E != null) {
                        AdViewImpl.this.f17505E.m13858d();
                    }
                    activity = AdViewImpl.this.getActivity(view);
                    if (activity == null || activity.isFinishing()) {
                        return;
                    }
                }
            } else {
                AdViewImpl.this.getAdDispatcher().mo14241b();
                activity = AdViewImpl.this.getActivity(view);
                if (activity == null || activity.isFinishing()) {
                    return;
                } else {
                    activity.onBackPressed();
                }
            }
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$a */
    public static class C3172a {

        /* JADX INFO: renamed from: a */
        public a f17605a = a.UNCHANGE;

        /* JADX INFO: renamed from: b */
        public boolean f17606b = false;

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$a$a */
        public enum a {
            UNCHANGE,
            STATE_PREPARE_CHANGE,
            STATE_BACKGROUND,
            FINISHCLOSE
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m14699a(a aVar) {
            a aVar2 = a.STATE_PREPARE_CHANGE;
            if (aVar == aVar2 && this.f17605a == a.UNCHANGE) {
                this.f17605a = aVar2;
            }
            a aVar3 = a.STATE_BACKGROUND;
            if (aVar == aVar3 && this.f17605a == aVar2) {
                this.f17605a = aVar3;
            }
            a aVar4 = a.FINISHCLOSE;
            if (aVar == aVar4 && this.f17605a == aVar3 && this.f17606b) {
                this.f17605a = aVar4;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m14700a(boolean z) {
            this.f17606b = z;
        }

        /* JADX INFO: renamed from: a */
        public boolean m14701a() {
            return this.f17606b;
        }

        /* JADX INFO: renamed from: b */
        public void m14702b() {
            this.f17605a = a.UNCHANGE;
        }

        /* JADX INFO: renamed from: c */
        public a m14703c() {
            return this.f17605a;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$b */
    public class C3173b implements InterfaceC3081b {

        /* JADX INFO: renamed from: b */
        private Handler f17613b;

        /* JADX INFO: renamed from: c */
        private InterfaceC3127b f17614c;

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$b$1 */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC3127b f17615a;

            public AnonymousClass1(InterfaceC3127b interfaceC3127b) {
                interfaceC3127b = interfaceC3127b;
            }

            @Override // java.lang.Runnable
            public void run() {
                AdViewImpl.this.setCreativeWidth(interfaceC3127b.mo14403b().getCreativeWidth());
                AdViewImpl.this.setCreativeHeight(interfaceC3127b.mo14403b().getCreativeHeight());
                AdViewImpl.this.setAdExtInfo(interfaceC3127b.mo14405d());
                AdViewImpl.this.setPrice(interfaceC3127b.mo14406e());
                AdViewImpl.this.setTagId(interfaceC3127b.mo14407f());
                AdViewImpl.this.setAdId(interfaceC3127b.mo14408g());
                AdViewImpl.this.mo14689a(interfaceC3127b.mo14403b());
                AdViewImpl adViewImpl = AdViewImpl.this;
                if (adViewImpl.f17540j) {
                    if (adViewImpl.f17550t != null) {
                        AdViewImpl.this.f17550t.onRewardVideoAdLoaded();
                    }
                } else {
                    if (adViewImpl.f17548r == null || !interfaceC3127b.mo14402a().equals(EnumC3119l.INTERSTITIAL)) {
                        return;
                    }
                    Log.e("OctopusAd", "enter Octopus ad load");
                    AdViewImpl.this.f17548r.onAdLoaded();
                }
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$b$2 */
        public class AnonymousClass2 implements Runnable {
            public AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AdViewImpl adViewImpl = AdViewImpl.this;
                if (adViewImpl.serverResponse != null) {
                    Context context = adViewImpl.getContext();
                    AdViewImpl adViewImpl2 = AdViewImpl.this;
                    AdViewImpl.setAutoClickStrategy(context, adViewImpl2.serverResponse, adViewImpl2.f17531ag);
                    AdViewImpl adViewImpl3 = AdViewImpl.this;
                    adViewImpl3.f17526ab = AdViewImpl.isCallBackClick(adViewImpl3.serverResponse);
                    if (!AdViewImpl.this.f17526ab) {
                        AdViewImpl.this.f17527ac = 8;
                    }
                }
                AdViewImpl adViewImpl4 = AdViewImpl.this;
                if (adViewImpl4.f17540j) {
                    if (adViewImpl4.f17528ad != null && (AdViewImpl.this.f17528ad instanceof AdVideoView)) {
                        ((AdVideoView) AdViewImpl.this.f17528ad).setOpt(AdViewImpl.this.f17527ac);
                    }
                    if (AdViewImpl.this.f17550t != null) {
                        AdViewImpl.this.f17550t.onRewardVideoAdShown();
                        return;
                    }
                    return;
                }
                adViewImpl4.f17529ae.setOpt(AdViewImpl.this.f17527ac);
                if (AdViewImpl.this.f17548r != null) {
                    Log.e("OctopusAd", "enter Octopus ad show");
                    AdViewImpl.this.f17548r.onAdShown();
                }
                if (AdViewImpl.this.f17549s != null) {
                    Log.e("OctopusAd", "enter Octopus ad show");
                    AdViewImpl.this.f17549s.onAdShown();
                }
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$b$3 */
        public class AnonymousClass3 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f17618a;

            public AnonymousClass3(int i) {
                i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                AdViewImpl.this.onAdFailedToLoad(i);
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$b$4 */
        public class AnonymousClass4 implements Runnable {
            public AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AdViewImpl adViewImpl = AdViewImpl.this;
                if (!adViewImpl.f17540j) {
                    if (adViewImpl.f17547q != null) {
                        AdViewImpl.this.f17547q.onAdClosed();
                    }
                    if (AdViewImpl.this.f17548r != null) {
                        AdViewImpl.this.f17548r.onAdClosed();
                    }
                    if (AdViewImpl.this.f17549s != null) {
                        AdViewImpl.this.f17549s.onAdClosed();
                    }
                } else if (adViewImpl.f17550t != null) {
                    AdViewImpl.this.f17550t.onRewardVideoAdClosed();
                }
                AdViewImpl.this.f17532b.m14702b();
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$b$5 */
        public class AnonymousClass5 implements Runnable {
            public AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AdViewImpl adViewImpl = AdViewImpl.this;
                if (adViewImpl.f17540j) {
                    if (adViewImpl.f17550t != null) {
                        AdViewImpl.this.f17532b.m14699a(C3172a.a.STATE_PREPARE_CHANGE);
                        Log.i("OctopusAd", "enter Octopus ad click");
                        if (!AdViewImpl.this.f17526ab || AdViewImpl.this.f17523W) {
                            return;
                        }
                        AdViewImpl.this.f17550t.onRewardVideoAdClicked();
                        return;
                    }
                    return;
                }
                adViewImpl.f17532b.m14699a(C3172a.a.STATE_PREPARE_CHANGE);
                Log.i("OctopusAd", "enter Octopus ad click");
                if (!AdViewImpl.this.f17526ab || AdViewImpl.this.f17523W) {
                    return;
                }
                if (AdViewImpl.this.f17547q != null) {
                    AdViewImpl.this.f17547q.onAdClicked();
                }
                if (AdViewImpl.this.f17548r != null) {
                    AdViewImpl.this.f17548r.onAdClicked();
                }
                if (AdViewImpl.this.f17549s != null) {
                    AdViewImpl.this.f17549s.onAdClicked();
                }
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$b$6 */
        public class AnonymousClass6 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f17622a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f17623b;

            public AnonymousClass6(String str, String str2) {
                str = str;
                str = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AdViewImpl.this.f17551u != null) {
                    AdViewImpl.this.f17551u.onAppEvent(str, str);
                }
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$b$7 */
        public class AnonymousClass7 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f17625a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f17626b;

            public AnonymousClass7(String str, int i) {
                str = str;
                i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                AdViewImpl adViewImpl = AdViewImpl.this;
                if (!adViewImpl.f17540j || adViewImpl.f17550t == null) {
                    return;
                }
                AdViewImpl.this.f17550t.onRewarded(new C3130p(str, i));
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$b$8 */
        public class AnonymousClass8 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f17628a;

            public AnonymousClass8(long j) {
                j = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AdViewImpl.this.f17547q == null || C3173b.this.f17614c == null || !C3173b.this.f17614c.mo14402a().equals(EnumC3119l.SPLASH)) {
                    return;
                }
                AdViewImpl.this.f17547q.onAdTick(j);
            }
        }

        public C3173b(Handler handler) {
            this.f17613b = handler;
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14235a() {
            AdViewImpl.this.f17507G = System.currentTimeMillis();
            this.f17613b.post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.b.2
                public AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (adViewImpl.serverResponse != null) {
                        Context context = adViewImpl.getContext();
                        AdViewImpl adViewImpl2 = AdViewImpl.this;
                        AdViewImpl.setAutoClickStrategy(context, adViewImpl2.serverResponse, adViewImpl2.f17531ag);
                        AdViewImpl adViewImpl3 = AdViewImpl.this;
                        adViewImpl3.f17526ab = AdViewImpl.isCallBackClick(adViewImpl3.serverResponse);
                        if (!AdViewImpl.this.f17526ab) {
                            AdViewImpl.this.f17527ac = 8;
                        }
                    }
                    AdViewImpl adViewImpl4 = AdViewImpl.this;
                    if (adViewImpl4.f17540j) {
                        if (adViewImpl4.f17528ad != null && (AdViewImpl.this.f17528ad instanceof AdVideoView)) {
                            ((AdVideoView) AdViewImpl.this.f17528ad).setOpt(AdViewImpl.this.f17527ac);
                        }
                        if (AdViewImpl.this.f17550t != null) {
                            AdViewImpl.this.f17550t.onRewardVideoAdShown();
                            return;
                        }
                        return;
                    }
                    adViewImpl4.f17529ae.setOpt(AdViewImpl.this.f17527ac);
                    if (AdViewImpl.this.f17548r != null) {
                        Log.e("OctopusAd", "enter Octopus ad show");
                        AdViewImpl.this.f17548r.onAdShown();
                    }
                    if (AdViewImpl.this.f17549s != null) {
                        Log.e("OctopusAd", "enter Octopus ad show");
                        AdViewImpl.this.f17549s.onAdShown();
                    }
                }
            });
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14236a(int i) {
            this.f17613b.post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.b.3

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17618a;

                public AnonymousClass3(int i2) {
                    i = i2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl.this.onAdFailedToLoad(i);
                }
            });
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14237a(long j) {
            this.f17613b.post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.b.8

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ long f17628a;

                public AnonymousClass8(long j2) {
                    j = j2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (AdViewImpl.this.f17547q == null || C3173b.this.f17614c == null || !C3173b.this.f17614c.mo14402a().equals(EnumC3119l.SPLASH)) {
                        return;
                    }
                    AdViewImpl.this.f17547q.onAdTick(j);
                }
            });
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14238a(InterfaceC3127b interfaceC3127b) {
            this.f17614c = interfaceC3127b;
            if (!interfaceC3127b.mo14402a().equals(EnumC3119l.BANNER) && !interfaceC3127b.mo14402a().equals(EnumC3119l.INTERSTITIAL) && !interfaceC3127b.mo14402a().equals(EnumC3119l.SPLASH)) {
                mo14236a(AdRequest.INVALID_MEDIA_TYPE);
            } else if (AdViewImpl.this.serverResponse.getFilter() != 1) {
                this.f17613b.post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.b.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC3127b f17615a;

                    public AnonymousClass1(InterfaceC3127b interfaceC3127b2) {
                        interfaceC3127b = interfaceC3127b2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        AdViewImpl.this.setCreativeWidth(interfaceC3127b.mo14403b().getCreativeWidth());
                        AdViewImpl.this.setCreativeHeight(interfaceC3127b.mo14403b().getCreativeHeight());
                        AdViewImpl.this.setAdExtInfo(interfaceC3127b.mo14405d());
                        AdViewImpl.this.setPrice(interfaceC3127b.mo14406e());
                        AdViewImpl.this.setTagId(interfaceC3127b.mo14407f());
                        AdViewImpl.this.setAdId(interfaceC3127b.mo14408g());
                        AdViewImpl.this.mo14689a(interfaceC3127b.mo14403b());
                        AdViewImpl adViewImpl = AdViewImpl.this;
                        if (adViewImpl.f17540j) {
                            if (adViewImpl.f17550t != null) {
                                AdViewImpl.this.f17550t.onRewardVideoAdLoaded();
                            }
                        } else {
                            if (adViewImpl.f17548r == null || !interfaceC3127b.mo14402a().equals(EnumC3119l.INTERSTITIAL)) {
                                return;
                            }
                            Log.e("OctopusAd", "enter Octopus ad load");
                            AdViewImpl.this.f17548r.onAdLoaded();
                        }
                    }
                });
            } else {
                mo14236a(AdRequest.ERROR_CODE_NO_FILL);
                AdViewImpl.this.sendLossNotice(interfaceC3127b2.mo14406e() + 100, "1001", ADBidEvent.OTHER);
            }
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14239a(String str, int i) {
            this.f17613b.post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.b.7

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f17625a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f17626b;

                public AnonymousClass7(String str2, int i2) {
                    str = str2;
                    i = i2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (!adViewImpl.f17540j || adViewImpl.f17550t == null) {
                        return;
                    }
                    AdViewImpl.this.f17550t.onRewarded(new C3130p(str, i));
                }
            });
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14240a(String str, String str2) {
            this.f17613b.post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.b.6

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f17622a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f17623b;

                public AnonymousClass6(String str3, String str22) {
                    str = str3;
                    str = str22;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (AdViewImpl.this.f17551u != null) {
                        AdViewImpl.this.f17551u.onAppEvent(str, str);
                    }
                }
            });
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: b */
        public void mo14241b() {
            AdViewImpl.this.f17521U = true;
            this.f17613b.post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.b.4
                public AnonymousClass4() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (!adViewImpl.f17540j) {
                        if (adViewImpl.f17547q != null) {
                            AdViewImpl.this.f17547q.onAdClosed();
                        }
                        if (AdViewImpl.this.f17548r != null) {
                            AdViewImpl.this.f17548r.onAdClosed();
                        }
                        if (AdViewImpl.this.f17549s != null) {
                            AdViewImpl.this.f17549s.onAdClosed();
                        }
                    } else if (adViewImpl.f17550t != null) {
                        AdViewImpl.this.f17550t.onRewardVideoAdClosed();
                    }
                    AdViewImpl.this.f17532b.m14702b();
                }
            });
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: c */
        public void mo14242c() {
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: d */
        public void mo14243d() {
            this.f17613b.post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.b.5
                public AnonymousClass5() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (adViewImpl.f17540j) {
                        if (adViewImpl.f17550t != null) {
                            AdViewImpl.this.f17532b.m14699a(C3172a.a.STATE_PREPARE_CHANGE);
                            Log.i("OctopusAd", "enter Octopus ad click");
                            if (!AdViewImpl.this.f17526ab || AdViewImpl.this.f17523W) {
                                return;
                            }
                            AdViewImpl.this.f17550t.onRewardVideoAdClicked();
                            return;
                        }
                        return;
                    }
                    adViewImpl.f17532b.m14699a(C3172a.a.STATE_PREPARE_CHANGE);
                    Log.i("OctopusAd", "enter Octopus ad click");
                    if (!AdViewImpl.this.f17526ab || AdViewImpl.this.f17523W) {
                        return;
                    }
                    if (AdViewImpl.this.f17547q != null) {
                        AdViewImpl.this.f17547q.onAdClicked();
                    }
                    if (AdViewImpl.this.f17548r != null) {
                        AdViewImpl.this.f17548r.onAdClicked();
                    }
                    if (AdViewImpl.this.f17549s != null) {
                        AdViewImpl.this.f17549s.onAdClicked();
                    }
                }
            });
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: e */
        public void mo14244e() {
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: f */
        public void mo14245f() {
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$c */
    public static class C3174c {

        /* JADX INFO: renamed from: a */
        public static final ArrayList<Pair<String, C3174c>> f17630a = new ArrayList<>();
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$d */
    public interface InterfaceC3175d {
        /* JADX INFO: renamed from: a */
        void mo14538a(int i);
    }

    public AdViewImpl(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public AdViewImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17524a = null;
        this.f17543m = null;
        this.f17546p = "";
        this.f17532b = new C3172a();
        this.f17553w = new Handler(Looper.getMainLooper()) { // from class: com.octopus.ad.internal.view.AdViewImpl.1
            public HandlerC31491(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
        this.f17534d = false;
        this.f17535e = false;
        this.f17536f = false;
        this.f17537g = true;
        this.f17555y = false;
        this.f17556z = true;
        this.f17538h = null;
        this.f17539i = null;
        this.f17501A = false;
        this.f17540j = false;
        this.f17541k = false;
        this.f17526ab = true;
        this.f17527ac = 0;
        this.f17530af = false;
        this.f17531ag = new InterfaceC3175d() { // from class: com.octopus.ad.internal.view.AdViewImpl.19
            public C315919() {
            }

            @Override // com.octopus.p222ad.internal.view.AdViewImpl.InterfaceC3175d
            /* JADX INFO: renamed from: a */
            public void mo14538a(int i2) {
                if (AdViewImpl.this.f17521U || AdViewImpl.this.f17522V || AdViewImpl.this.f17523W) {
                    return;
                }
                AdViewImpl adViewImpl = AdViewImpl.this;
                if (adViewImpl.serverResponse != null) {
                    SPUtils.putFrequency(adViewImpl.getContext(), "frequency" + AdViewImpl.this.serverResponse.getTagId(), i2);
                    AdViewImpl.this.m14665g();
                }
            }
        };
        this.f17542l = 0;
        mo14688a(context, attributeSet);
    }

    public AdViewImpl(Context context, ViewGroup viewGroup, View view) {
        super(context, null, 0);
        this.f17524a = null;
        this.f17543m = null;
        this.f17546p = "";
        this.f17532b = new C3172a();
        this.f17553w = new Handler(Looper.getMainLooper()) { // from class: com.octopus.ad.internal.view.AdViewImpl.1
            public HandlerC31491(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
        this.f17534d = false;
        this.f17535e = false;
        this.f17536f = false;
        this.f17537g = true;
        this.f17555y = false;
        this.f17556z = true;
        this.f17538h = null;
        this.f17539i = null;
        this.f17501A = false;
        this.f17540j = false;
        this.f17541k = false;
        this.f17526ab = true;
        this.f17527ac = 0;
        this.f17530af = false;
        this.f17531ag = new InterfaceC3175d() { // from class: com.octopus.ad.internal.view.AdViewImpl.19
            public C315919() {
            }

            @Override // com.octopus.p222ad.internal.view.AdViewImpl.InterfaceC3175d
            /* JADX INFO: renamed from: a */
            public void mo14538a(int i2) {
                if (AdViewImpl.this.f17521U || AdViewImpl.this.f17522V || AdViewImpl.this.f17523W) {
                    return;
                }
                AdViewImpl adViewImpl = AdViewImpl.this;
                if (adViewImpl.serverResponse != null) {
                    SPUtils.putFrequency(adViewImpl.getContext(), "frequency" + AdViewImpl.this.serverResponse.getTagId(), i2);
                    AdViewImpl.this.m14665g();
                }
            }
        };
        this.f17542l = 0;
        this.f17524a = viewGroup;
        if (view == null) {
            this.f17519S = true;
            this.f17543m = new SkipView(context);
        } else {
            this.f17519S = false;
            this.f17543m = view;
        }
        mo14688a(context, (AttributeSet) null);
    }

    /* JADX INFO: renamed from: a */
    private void m14652a(int i, int i2) {
        this.f17534d = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width > 0) {
                getLayoutParams().width = i;
            }
            if (getLayoutParams().height > 0) {
                getLayoutParams().height = i2;
            }
        }
        if (this.f17555y && (getParent() instanceof View)) {
            View view = (View) getParent();
            if (view.getLayoutParams() != null) {
                if (view.getLayoutParams().width > 0) {
                    view.getLayoutParams().width = i;
                }
                if (view.getLayoutParams().height > 0) {
                    view.getLayoutParams().height = i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14653a(C3070c c3070c, int i) {
        this.f17522V = true;
        AdWebView adWebView = this.f17529ae;
        if (adWebView != null) {
            adWebView.handleClickView(c3070c, System.currentTimeMillis(), System.currentTimeMillis() + 10, i, this.f17527ac);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m14665g() {
        int i;
        if (this.f17529ae != null) {
            if (isAoClickCallBack(this.serverResponse)) {
                i = 0;
                this.f17523W = false;
                this.f17526ab = true;
            } else {
                this.f17523W = true;
                i = 9;
            }
            this.f17527ac = i;
            this.f17529ae.handleClickView(null, System.currentTimeMillis(), System.currentTimeMillis() + 10, this.f17527ac);
        }
    }

    public static FrameLayout getMRAIDFullscreenContainer() {
        return f17498ah;
    }

    public static C3197e getMRAIDFullscreenImplementation() {
        return f17499ai;
    }

    public static AdWebView.InterfaceC3182b getMRAIDFullscreenListener() {
        return f17500aj;
    }

    /* JADX INFO: renamed from: h */
    public void m14667h() {
        ServerResponse serverResponse;
        AdWebView adWebView = this.f17529ae;
        if (adWebView == null || (serverResponse = adWebView.f17644ad) == null || this.serverResponse == null) {
            return;
        }
        this.f17525aa = true;
        serverResponse.setIsLiftUp(true);
        m14668i();
        if (C3266g.m15037a(this.serverResponse.getAcRatio())) {
            new Handler().postDelayed(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.21
                public RunnableC316221() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl.this.m14665g();
                }
            }, new Random().nextInt(C1486b.f7228b) + C1486b.f7228b);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m14668i() {
        AdWebView adWebView = this.f17529ae;
        adWebView.f17644ad.handleView(adWebView, this.f17538h.m14369a());
    }

    public static boolean isAoClickCallBack(ServerResponse serverResponse) {
        C3069b.t strategy;
        C3069b.g gVarM14138b;
        if (serverResponse == null || (strategy = serverResponse.getStrategy()) == null || (gVarM14138b = strategy.m14138b()) == null) {
            return false;
        }
        return C3266g.m15037a(gVarM14138b.m14008d());
    }

    public static boolean isCallBackClick(ServerResponse serverResponse) {
        C3069b.t strategy;
        C3069b.h hVarM14139c;
        if (serverResponse == null || (strategy = serverResponse.getStrategy()) == null || (hVarM14139c = strategy.m14139c()) == null) {
            return true;
        }
        return C3266g.m15037a(hVarM14139c.m14010a());
    }

    public static void setAutoClickStrategy(Context context, ServerResponse serverResponse, InterfaceC3175d interfaceC3175d) {
        C3069b.t strategy;
        C3069b.g gVarM14138b;
        if (serverResponse == null || (strategy = serverResponse.getStrategy()) == null || (gVarM14138b = strategy.m14138b()) == null || !C3266g.m15037a(gVarM14138b.m14006c())) {
            return;
        }
        SPUtils.refreshFrequencyDate(context);
        int[] iArr = {gVarM14138b.m14002a()};
        int frequency = SPUtils.getFrequency(context, "frequency" + serverResponse.getTagId());
        if (frequency != -1) {
            iArr[0] = frequency;
        }
        if (iArr[0] > 0) {
            C3262c.m15017a(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.18

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int[] f17574b;

                public RunnableC315818(int[] iArr2) {
                    iArr = iArr2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        InterfaceC3175d interfaceC3175d2 = interfaceC3175d;
                        int[] iArr2 = iArr;
                        int i = iArr2[0] - 1;
                        iArr2[0] = i;
                        interfaceC3175d2.mo14538a(i);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }, ((long) gVarM14138b.m14004b()) * 1000);
        }
    }

    @SuppressLint({"DefaultLocale"})
    private void setDefaultSkip(Context context) {
        int screenWidth = (int) (((double) ViewUtil.getScreenWidth(context)) * 0.15d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(screenWidth, (int) (((double) screenWidth) * 0.45d));
        layoutParams.gravity = 53;
        layoutParams.topMargin = ViewUtil.dip2px(context, 20.0f);
        layoutParams.rightMargin = ViewUtil.dip2px(context, 20.0f);
        addView(this.f17543m, layoutParams);
        View view = this.f17543m;
        if (view != null) {
            ((SkipView) view).setData(1, 0);
        }
    }

    public static void setDpUpStrategy(Context context, ServerResponse serverResponse, InterfaceC3175d interfaceC3175d) {
        C3069b.t strategy;
        C3069b.k kVarM14140d;
        boolean zM15038a;
        if (serverResponse == null || (strategy = serverResponse.getStrategy()) == null || (kVarM14140d = strategy.m14140d()) == null || !kVarM14140d.m14046d() || !C3266g.m15037a(kVarM14140d.m14044c())) {
            return;
        }
        List<String> listM14047e = kVarM14140d.m14047e();
        if (listM14047e != null && listM14047e.size() > 0) {
            Iterator<String> it = listM14047e.iterator();
            zM15038a = false;
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split("-");
                if (strArrSplit.length == 2 && (zM15038a = C3266g.m15038a(strArrSplit[0], strArrSplit[1]))) {
                    break;
                }
            }
        } else {
            zM15038a = false;
        }
        if (zM15038a) {
            SPUtils.refreshFrequencyDate(context);
            int[] iArr = {kVarM14140d.m14038a()};
            int frequency = SPUtils.getFrequency(context, "liftUpfrequency" + serverResponse.getTagId());
            if (frequency != -1) {
                iArr[0] = frequency;
            }
            if (iArr[0] > 0) {
                C3262c.m15017a(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.20

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ int[] f17581b;

                    public RunnableC316120(int[] iArr2) {
                        iArr = iArr2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            InterfaceC3175d interfaceC3175d2 = interfaceC3175d;
                            int[] iArr2 = iArr;
                            int i = iArr2[0] - 1;
                            iArr2[0] = i;
                            interfaceC3175d2.mo14538a(i);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }, ((long) kVarM14140d.m14042b()) * 1000);
            }
        }
    }

    public static void setMRAIDFullscreenContainer(FrameLayout frameLayout) {
        f17498ah = frameLayout;
    }

    public static void setMRAIDFullscreenImplementation(C3197e c3197e) {
        f17499ai = c3197e;
    }

    public static void setMRAIDFullscreenListener(AdWebView.InterfaceC3182b interfaceC3182b) {
        f17500aj = interfaceC3182b;
    }

    /* JADX INFO: renamed from: a */
    public Context m14684a(View view) {
        return view.getContext() instanceof MutableContextWrapper ? ((MutableContextWrapper) view.getContext()).getBaseContext() : getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m14685a(int i, int i2, int i3, int i4, C3197e.a aVar, boolean z, C3197e c3197e) {
        m14652a(i, i2);
        ViewUtil.removeChildFromParent(this.f17503C);
        if (this.f17542l <= 0) {
            this.f17542l = (int) (c3197e.f17753b.getContext().getResources().getDisplayMetrics().density * 50.0f);
        }
        this.f17503C = new AppCompatTextView(getContext()) { // from class: com.octopus.ad.internal.view.AdViewImpl.13

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3197e f17564a;

            /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$13$1 */
            public class AnonymousClass1 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ViewGroup.MarginLayoutParams f17566a;

                public AnonymousClass1(ViewGroup.MarginLayoutParams layoutParams2) {
                    marginLayoutParams = layoutParams2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C315313.this.setLayoutParams(marginLayoutParams);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C315313(Context context, C3197e c3197e2) {
                super(context);
                c3197e = c3197e2;
            }

            @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
            @SuppressLint({"NewApi", "DrawAllocation"})
            public void onLayout(boolean z3, int i5, int i22, int i32, int i42) {
                Activity activity;
                boolean z32;
                Point point;
                int i52;
                int i6;
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                Point point2 = new Point(0, 0);
                try {
                    activity = (Activity) c3197e.f17753b.getContext();
                    z32 = true;
                } catch (ClassCastException unused) {
                    activity = null;
                    z32 = false;
                }
                if (z32) {
                    activity.getWindowManager().getDefaultDisplay().getSize(point2);
                }
                int[] iArr2 = new int[2];
                if (AdViewImpl.this.getMediaType().equals(EnumC3119l.INTERSTITIAL)) {
                    InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.measure(0, 0);
                    InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getLocationOnScreen(iArr2);
                    point = new Point(InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getMeasuredWidth(), InterstitialAdViewImpl.INTERSTITIALADVIEW_TO_USE.getMeasuredHeight());
                } else {
                    AdViewImpl.this.measure(0, 0);
                    AdViewImpl.this.getLocationOnScreen(iArr2);
                    point = new Point(AdViewImpl.this.getMeasuredWidth(), AdViewImpl.this.getMeasuredHeight());
                }
                int i7 = point.x;
                int i8 = AdViewImpl.this.f17542l;
                int iMin = i7 - i8;
                int iMin2 = point.y - i8;
                if (z32) {
                    iMin = (iArr2[0] + Math.min(point2.x, i7)) - AdViewImpl.this.f17542l;
                    iMin2 = (iArr2[1] + Math.min(point2.y, point.y)) - AdViewImpl.this.f17542l;
                    i52 = iArr2[0];
                    i6 = iArr2[1];
                } else {
                    i52 = 0;
                    i6 = 0;
                }
                if (iArr[0] + 1 < i52 || iArr[0] - 1 > iMin || iArr[1] + 1 < i6 || iArr[1] - 1 > iMin2) {
                    ViewGroup.MarginLayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 53);
                    layoutParams2.setMargins(40, 40, 40, 40);
                    post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.13.1

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ ViewGroup.MarginLayoutParams f17566a;

                        public AnonymousClass1(ViewGroup.MarginLayoutParams layoutParams22) {
                            marginLayoutParams = layoutParams22;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            C315313.this.setLayoutParams(marginLayoutParams);
                        }
                    });
                    AdViewImpl.this.f17503C.setBackgroundDrawable(getResources().getDrawable(C3063R.drawable.oct_close_background));
                    AdViewImpl.this.f17503C.setTextColor(ContextCompat.getColorStateList(getContext(), C3063R.color.oct_text_selector));
                    AdViewImpl.this.f17503C.setTextSize(2, 16.0f);
                    AdViewImpl.this.f17503C.setText(C3063R.string.skip_ad);
                }
            }
        };
        int i5 = this.f17542l;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5, 17);
        int i6 = this.f17542l;
        int i7 = (i2 / 2) - (i6 / 2);
        int i8 = (i / 2) - (i6 / 2);
        int i9 = C315616.f17571a[aVar.ordinal()];
        if (i9 == 1) {
            layoutParams.topMargin = i7;
        } else {
            if (i9 == 2) {
                layoutParams.rightMargin = i8;
            } else if (i9 == 3) {
                layoutParams.leftMargin = i8;
            } else if (i9 == 5) {
                layoutParams.bottomMargin = i7;
            } else {
                if (i9 == 6) {
                    layoutParams.rightMargin = i8;
                } else if (i9 == 7) {
                    layoutParams.leftMargin = i8;
                }
                layoutParams.bottomMargin = i7;
            }
            layoutParams.topMargin = i7;
        }
        this.f17503C.setLayoutParams(layoutParams);
        this.f17503C.setBackgroundColor(0);
        this.f17503C.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.14

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3197e f17568a;

            public ViewOnClickListenerC315414(C3197e c3197e2) {
                c3197e = c3197e2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c3197e.m14790a();
            }
        });
        if (c3197e2.f17753b.getParent() != null) {
            ((ViewGroup) c3197e2.f17753b.getParent()).addView(this.f17503C);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14686a(int i, int i2, C3197e c3197e) {
        ViewUtil.removeChildFromParent(this.f17503C);
        this.f17503C = null;
        AdWebView adWebView = c3197e.f17753b;
        if (adWebView.f17643a) {
            ViewUtil.removeChildFromParent(adWebView);
            if (c3197e.m14803d() != null) {
                c3197e.m14803d().addView(c3197e.f17753b, 0);
            }
            if (c3197e.m14802c() != null) {
                c3197e.m14802c().finish();
            }
            if (getMediaType().equals(EnumC3119l.BANNER) && (c3197e.f17753b.getContext() instanceof MutableContextWrapper)) {
                ((MutableContextWrapper) c3197e.f17753b.getContext()).setBaseContext(getContext());
            }
        }
        f17498ah = null;
        f17499ai = null;
        f17500aj = null;
        m14652a(i, i2);
        this.f17536f = true;
        this.f17535e = false;
    }

    /* JADX INFO: renamed from: a */
    public void m14687a(int i, int i2, boolean z, C3197e c3197e, AdWebView.InterfaceC3182b interfaceC3182b) {
        m14652a(i, i2);
        AppCompatTextView appCompatTextViewCreateCloseButton = ViewUtil.createCloseButton(getContext());
        this.f17503C = appCompatTextViewCreateCloseButton;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) appCompatTextViewCreateCloseButton.getLayoutParams();
        if (!c3197e.f17753b.f17643a && getChildAt(0) != null) {
            layoutParams.rightMargin = (getMeasuredWidth() - getChildAt(0).getMeasuredWidth()) / 2;
        }
        this.f17503C.setLayoutParams(layoutParams);
        this.f17503C.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.11

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3197e f17560a;

            public ViewOnClickListenerC315111(C3197e c3197e2) {
                c3197e = c3197e2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c3197e.m14790a();
            }
        });
        if (c3197e2.f17753b.f17643a) {
            m14690a(c3197e2, z, interfaceC3182b);
        } else {
            addView(this.f17503C);
        }
        this.f17535e = true;
    }

    /* JADX INFO: renamed from: a */
    public void mo14688a(Context context, AttributeSet attributeSet) {
        setBackgroundColor(0);
        this.f17554x = new C3173b(this.f17553w);
        this.f17538h = new C3111d(context, StringUtil.createRequestId());
        ThreadUtils.runOnUIThread(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.12

            /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$12$1 */
            public class AnonymousClass1 implements GestureDetector.OnGestureListener {
                public AnonymousClass1() {
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public boolean onDown(MotionEvent motionEvent) {
                    return false;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    return false;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public void onLongPress(MotionEvent motionEvent) {
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    return false;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public void onShowPress(MotionEvent motionEvent) {
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public boolean onSingleTapUp(MotionEvent motionEvent) {
                    AdViewImpl.this.f17509I = motionEvent.getX();
                    AdViewImpl.this.f17510J = motionEvent.getY();
                    AdViewImpl.this.f17511K = motionEvent.getRawX();
                    AdViewImpl.this.f17512L = motionEvent.getRawY();
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    int i = adViewImpl.clickCount;
                    int i2 = adViewImpl.loadCount;
                    return true;
                }
            }

            public RunnableC315212() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AdViewImpl.this.f17508H = new GestureDetector(new GestureDetector.OnGestureListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.12.1
                    public AnonymousClass1() {
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public boolean onDown(MotionEvent motionEvent) {
                        return false;
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                        return false;
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public void onLongPress(MotionEvent motionEvent) {
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                        return false;
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public void onShowPress(MotionEvent motionEvent) {
                    }

                    @Override // android.view.GestureDetector.OnGestureListener
                    public boolean onSingleTapUp(MotionEvent motionEvent) {
                        AdViewImpl.this.f17509I = motionEvent.getX();
                        AdViewImpl.this.f17510J = motionEvent.getY();
                        AdViewImpl.this.f17511K = motionEvent.getRawX();
                        AdViewImpl.this.f17512L = motionEvent.getRawY();
                        AdViewImpl adViewImpl = AdViewImpl.this;
                        int i = adViewImpl.clickCount;
                        int i2 = adViewImpl.loadCount;
                        return true;
                    }
                });
            }
        });
        try {
            HaoboLog.setErrorContext(getContext().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        setPadding(0, 0, 0, 0);
        this.mAdFetcher = new C3110c(this);
        if (attributeSet != null) {
            mo14694b(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo14689a(InterfaceC3194b interfaceC3194b);

    /* JADX INFO: renamed from: a */
    public void m14690a(C3197e c3197e, boolean z, AdWebView.InterfaceC3182b interfaceC3182b) {
        c3197e.m14794a((ViewGroup) c3197e.f17753b.getParent());
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewUtil.removeChildFromParent(c3197e.f17753b);
        frameLayout.addView(c3197e.f17753b);
        if (this.f17503C == null) {
            AppCompatTextView appCompatTextViewCreateCloseButton = ViewUtil.createCloseButton(getContext());
            this.f17503C = appCompatTextViewCreateCloseButton;
            appCompatTextViewCreateCloseButton.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.10

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C3197e f17558a;

                public ViewOnClickListenerC315010(C3197e c3197e2) {
                    c3197e = c3197e2;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    c3197e.m14790a();
                }
            });
        }
        frameLayout.addView(this.f17503C);
        f17498ah = frameLayout;
        f17499ai = c3197e2;
        f17500aj = interfaceC3182b;
        Class clsM13811a = AdActivity.m13811a();
        try {
            Intent intent = new Intent(getContext(), (Class<?>) clsM13811a);
            intent.putExtra("ACTIVITY_TYPE", ServerResponse.EXTRAS_KEY_MRAID);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.adactivity_missing, clsM13811a.getName()));
            f17498ah = null;
            f17499ai = null;
            f17500aj = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14691a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        C3070c c3070c = new C3070c();
        if (!TextUtils.isEmpty(str)) {
            c3070c.m14142a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c3070c.m14144b(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            c3070c.m14146c(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            c3070c.m14148d(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            c3070c.m14150e(str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            c3070c.m14152f(str6);
        }
        if (!TextUtils.isEmpty(str7)) {
            c3070c.m14154g(str7);
        }
        if (!TextUtils.isEmpty(str8)) {
            c3070c.m14156h(str8);
        }
        m14653a(c3070c, i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m14692a() {
        return this.f17535e;
    }

    public abstract void activityOnDestroy();

    public abstract void activityOnPause();

    public abstract void activityOnResume();

    public void addBannerCloseBtn() {
        ViewUtil.removeChildFromParent(this.f17504D);
        ImageView imageViewCreateImageCloseButton = ViewUtil.createImageCloseButton(getContext());
        this.f17504D = imageViewCreateImageCloseButton;
        imageViewCreateImageCloseButton.setVisibility(0);
        this.f17504D.setEnabled(true);
        this.f17504D.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.3
            public ViewOnClickListenerC31653() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdViewImpl.this.getAdDispatcher().mo14241b();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addCloseButton(int r11, int r12, int r13, android.view.View r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.view.AdViewImpl.addCloseButton(int, int, int, android.view.View, boolean):void");
    }

    public void addInterstitialCloseButton(int i, int i2, View view, boolean z) {
        ViewUtil.removeChildFromParent(this.f17502B);
        if (i2 != -1) {
            this.f17502B = ViewUtil.createInterstitialCountDown(getContext(), i2);
            int i3 = i > 0 ? i2 - i : 0;
            C3065a c3065a = new C3065a(i2 * 1000, 50L);
            this.f17505E = c3065a;
            c3065a.m13855a(new InterfaceC3066b() { // from class: com.octopus.ad.internal.view.AdViewImpl.23

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17585a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f17586b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ View f17587c;

                public C316423(int i32, boolean z3, View view2) {
                    i = i32;
                    z = z3;
                    view = view2;
                }

                @Override // com.octopus.p222ad.p223a.InterfaceC3066b
                /* JADX INFO: renamed from: a */
                public void mo13860a() {
                    AdViewImpl.this.f17502B.setText("0");
                    if (!AdViewImpl.this.mo14697e()) {
                        AdViewImpl.this.getAdDispatcher().mo14241b();
                        if (AdViewImpl.this.f17524a == null) {
                            HaoboLog.m14609e(HaoboLog.jsLogTag, "Should not close banner!");
                            return;
                        }
                        return;
                    }
                    if (!z) {
                        AdViewImpl.this.getAdDispatcher().mo14241b();
                        Activity activity = AdViewImpl.this.getActivity(view);
                        if (activity == null || activity.isFinishing()) {
                            return;
                        }
                        activity.finish();
                        return;
                    }
                    View view2 = view;
                    if (view2 instanceof AdWebView) {
                        if (!((AdWebView) view2).loadAdBy(1)) {
                            return;
                        }
                    } else if (!(view2 instanceof AdVideoView) || !((AdVideoView) view2).getAdWebView().loadAdBy(1)) {
                        return;
                    }
                    ((C3075b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).m14234g();
                }

                @Override // com.octopus.p222ad.p223a.InterfaceC3066b
                /* JADX INFO: renamed from: a */
                public void mo13861a(long j) {
                    int i4 = (int) ((j / 1000) + 1);
                    int i22 = i;
                    AdViewImpl.this.f17502B.setText(Integer.toString(i4));
                }

                @Override // com.octopus.p222ad.p223a.InterfaceC3066b
                /* JADX INFO: renamed from: b */
                public void mo13862b() {
                }
            });
        } else {
            if (i == -1) {
                return;
            }
            this.f17502B = ViewUtil.createInterstitialCountDown(getContext(), i);
            C3065a c3065a2 = new C3065a(i * 1000, 50L);
            this.f17505E = c3065a2;
            c3065a2.m13855a(new InterfaceC3066b() { // from class: com.octopus.ad.internal.view.AdViewImpl.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f17576a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f17577b;

                /* JADX INFO: renamed from: com.octopus.ad.internal.view.AdViewImpl$2$1 */
                public class AnonymousClass1 implements View.OnClickListener {
                    public AnonymousClass1() {
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (AdViewImpl.this.mo14697e()) {
                            C31602 c31602 = C31602.this;
                            if (!z) {
                                AdViewImpl.this.getAdDispatcher().mo14241b();
                                C31602 c316022 = C31602.this;
                                Activity activity = AdViewImpl.this.getActivity(view);
                                if (activity == null || activity.isFinishing()) {
                                    return;
                                }
                                activity.finish();
                                return;
                            }
                            View view2 = view;
                            if (view2 instanceof AdWebView) {
                                if (!((AdWebView) view2).loadAdBy(1)) {
                                    return;
                                }
                            } else if (!(view2 instanceof AdVideoView) || !((AdVideoView) view2).getAdWebView().loadAdBy(1)) {
                                return;
                            }
                            ((C3075b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).m14234g();
                        }
                    }
                }

                public C31602(boolean z3, View view2) {
                    z = z3;
                    view = view2;
                }

                @Override // com.octopus.p222ad.p223a.InterfaceC3066b
                /* JADX INFO: renamed from: a */
                public void mo13860a() {
                    AdViewImpl.this.f17502B.setText("");
                    AdViewImpl.this.f17502B.setBackgroundResource(C3063R.drawable.oct_close);
                    AdViewImpl.this.f17502B.setVisibility(0);
                    AdViewImpl.this.f17502B.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.2.1
                        public AnonymousClass1() {
                        }

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            if (AdViewImpl.this.mo14697e()) {
                                C31602 c31602 = C31602.this;
                                if (!z) {
                                    AdViewImpl.this.getAdDispatcher().mo14241b();
                                    C31602 c316022 = C31602.this;
                                    Activity activity = AdViewImpl.this.getActivity(view);
                                    if (activity == null || activity.isFinishing()) {
                                        return;
                                    }
                                    activity.finish();
                                    return;
                                }
                                View view22 = view;
                                if (view22 instanceof AdWebView) {
                                    if (!((AdWebView) view22).loadAdBy(1)) {
                                        return;
                                    }
                                } else if (!(view22 instanceof AdVideoView) || !((AdVideoView) view22).getAdWebView().loadAdBy(1)) {
                                    return;
                                }
                                ((C3075b) ((InterstitialAdViewImpl) AdViewImpl.this).getAdImplementation()).m14234g();
                            }
                        }
                    });
                }

                @Override // com.octopus.p222ad.p223a.InterfaceC3066b
                /* JADX INFO: renamed from: a */
                public void mo13861a(long j) {
                    AdViewImpl.this.f17502B.setText(Integer.toString((int) ((j / 1000) + 1)));
                }

                @Override // com.octopus.p222ad.p223a.InterfaceC3066b
                /* JADX INFO: renamed from: b */
                public void mo13862b() {
                }
            });
        }
        this.f17505E.m13854a();
        ViewParent parent = mo14697e() ? view2.getParent() : getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).addView(this.f17502B);
        }
    }

    public void addMuteButton(AdVideoView adVideoView, boolean z) {
        ViewUtil.removeChildFromParent(this.f17506F);
        AppCompatImageView appCompatImageViewCreateMuteButton = ViewUtil.createMuteButton(getContext(), z);
        this.f17506F = appCompatImageViewCreateMuteButton;
        appCompatImageViewCreateMuteButton.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.22

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AdVideoView f17583a;

            public ViewOnClickListenerC316322(AdVideoView adVideoView2) {
                adVideoView = adVideoView2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdViewImpl.this.f17506F.setImageResource(adVideoView.toggleMute() ? C3063R.drawable.oct_voice_off : C3063R.drawable.oct_voice_on);
            }
        });
        ViewParent parent = mo14697e() ? adVideoView2.getParent() : getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).addView(this.f17506F);
        }
    }

    @SuppressLint({"DefaultLocale"})
    public void addSkipView(int i, View view) {
        C3069b.t strategy;
        C3069b.n nVarM14133a;
        ViewUtil.removeChildFromParent(this.f17503C);
        ViewUtil.removeChildFromParent(this.f17502B);
        C3065a c3065a = this.f17505E;
        if (c3065a != null) {
            c3065a.m13858d();
        }
        C3065a c3065a2 = new C3065a((i <= 0 ? 5L : i) * 1000, 50L);
        this.f17505E = c3065a2;
        c3065a2.m13855a(new InterfaceC3066b() { // from class: com.octopus.ad.internal.view.AdViewImpl.4
            public C31664() {
            }

            @Override // com.octopus.p222ad.p223a.InterfaceC3066b
            /* JADX INFO: renamed from: a */
            public void mo13860a() {
                AdViewImpl.this.f17532b.m14700a(true);
                if (AdViewImpl.this.f17532b.m14701a() && (AdViewImpl.this.f17532b.m14703c() == C3172a.a.UNCHANGE || AdViewImpl.this.f17532b.m14703c() == C3172a.a.STATE_PREPARE_CHANGE)) {
                    AdViewImpl.this.getAdDispatcher().mo14241b();
                }
                if (AdViewImpl.this.f17524a == null) {
                    HaoboLog.m14609e(HaoboLog.jsLogTag, "Should not close banner!");
                }
            }

            @Override // com.octopus.p222ad.p223a.InterfaceC3066b
            /* JADX INFO: renamed from: a */
            public void mo13861a(long j) {
                AdViewImpl.this.getAdDispatcher().mo14237a(j);
                int i2 = (int) ((j / 1000) + 1);
                if (AdViewImpl.this.f17543m == null || !AdViewImpl.this.f17519S) {
                    return;
                }
                ((SkipView) AdViewImpl.this.f17543m).setText(String.format("跳过 %d", Integer.valueOf(i2)));
            }

            @Override // com.octopus.p222ad.p223a.InterfaceC3066b
            /* JADX INFO: renamed from: b */
            public void mo13862b() {
            }
        });
        this.f17505E.m13854a();
        view.setVisibility(0);
        ServerResponse serverResponse = this.serverResponse;
        if (serverResponse != null && (strategy = serverResponse.getStrategy()) != null && (nVarM14133a = strategy.m14133a()) != null) {
            this.f17520T = C3266g.m15037a(nVarM14133a.m14058a());
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.view.AdViewImpl.5
            public ViewOnClickListenerC31675() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (AdViewImpl.this.f17520T) {
                    AdViewImpl.this.m14665g();
                    return;
                }
                AdViewImpl.this.getAdDispatcher().mo14241b();
                if (AdViewImpl.this.f17505E != null) {
                    AdViewImpl.this.f17505E.m13858d();
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m14693b() {
        getVisibility();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo14694b(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: c */
    public void m14695c() {
        getVisibility();
    }

    public void clearAdRequest() {
        this.f17539i = null;
    }

    public void createAdLogo(ServerResponse.AdLogoInfo adLogoInfo, ServerResponse.AdLogoInfo adLogoInfo2) {
        ViewUtil.removeChildFromParent(this.f17513M);
        ViewUtil.removeChildFromParent(this.f17514N);
        if (!TextUtils.isEmpty(adLogoInfo.getAdurl())) {
            this.f17513M = ViewUtil.createAdImageView(new MutableContextWrapper(getContext()), adLogoInfo);
        }
        if (TextUtils.isEmpty(adLogoInfo2.getAdurl())) {
            return;
        }
        this.f17514N = ViewUtil.createLogoImageView(new MutableContextWrapper(getContext()), adLogoInfo2);
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo14696d();

    @Override // com.octopus.p222ad.AdLifeControl
    public void destroy() {
        HaoboLog.m14607d(HaoboLog.baseLogTag, "called destroy() on AdView");
        InterfaceC3194b interfaceC3194b = this.f17533c;
        if (interfaceC3194b != null) {
            interfaceC3194b.destroy();
            this.f17533c = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f17508H.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo14697e();

    /* JADX INFO: renamed from: f */
    public abstract void mo14698f();

    public void finalize() {
        try {
            super.finalize();
        } catch (Throwable unused) {
        }
        C3110c c3110c = this.mAdFetcher;
        if (c3110c != null) {
            c3110c.m14365a();
        }
    }

    public Activity getActivity(View view) {
        return (Activity) m14684a(view);
    }

    public InterfaceC3081b getAdDispatcher() {
        return this.f17554x;
    }

    public String getAdId() {
        return this.f17518R;
    }

    public C3111d getAdParameters() {
        return this.f17538h;
    }

    public AsyncTaskC3126a.a getAdRequest() {
        return this.f17539i;
    }

    public C3064a getAdSize() {
        return new C3064a(this.f17544n, this.f17545o);
    }

    public String getAdSlotId() {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.get_placement_id, this.f17538h.m14378c()));
        return this.f17538h.m14378c();
    }

    public AppEventListener getAppEventListener() {
        return this.f17551u;
    }

    public C3174c getBrowserStyle() {
        return this.f17552v;
    }

    public int getContainerHeight() {
        return this.f17538h.m14388i();
    }

    public int getContainerWidth() {
        return this.f17538h.m14387h();
    }

    public int getCreativeHeight() {
        return this.f17545o;
    }

    public int getCreativeWidth() {
        return this.f17544n;
    }

    public String getLandingPageUrl() {
        return this.f17517Q;
    }

    public boolean getLoadsInBackground() {
        return this.f17537g;
    }

    public String getMediationAdapterClassName() {
        return null;
    }

    public Handler getMyHandler() {
        return this.f17553w;
    }

    public boolean getOpensNativeBrowser() {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.get_opens_native_browser, this.f17538h.m14389j()));
        return this.f17538h.m14389j();
    }

    public int getPrice() {
        return this.f17515O;
    }

    public RewardVideoAdListener getRewaredVideoAdListener() {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.get_reward_video_ad_listener));
        return this.f17550t;
    }

    public boolean getShowLoadingIndicator() {
        return this.f17556z;
    }

    public ViewGroup getSplashParent() {
        return this.f17524a;
    }

    public String getTagId() {
        return this.f17516P;
    }

    public void isLoadToShow(AdWebView adWebView) {
        if (this.serverResponse.getFilter() == 1) {
            return;
        }
        this.f17529ae = adWebView;
        this.f17530af = true;
        Log.e("OctopusAd", "enter Octopus ad load");
        SplashAdListener splashAdListener = this.f17547q;
        if (splashAdListener != null) {
            splashAdListener.onAdLoaded();
        }
        InterstitialAdListener interstitialAdListener = this.f17548r;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdLoaded();
        }
        BannerAdListener bannerAdListener = this.f17549s;
        if (bannerAdListener != null) {
            bannerAdListener.onAdLoaded();
            if (getMediaType().equals(EnumC3119l.BANNER)) {
                BannerAdView bannerAdView = new BannerAdView(getContext(), this);
                bannerAdView.checkShow();
                this.f17549s.onRenderSuccess(bannerAdView);
            }
        }
    }

    public boolean isLoaded() {
        return this.f17530af;
    }

    public boolean isLoading() {
        return this.f17501A;
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3073a
    public boolean isReadyToStart() {
        if (m14692a()) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.already_expanded));
            return false;
        }
        C3111d c3111d = this.f17538h;
        return (c3111d == null || !c3111d.m14391l() || this.f17539i == null) ? false : true;
    }

    public boolean isRewardVideo() {
        return this.f17540j;
    }

    public boolean loadAd(AsyncTaskC3126a.a aVar) {
        C3110c c3110c;
        this.f17539i = aVar;
        if (!isReadyToStart()) {
            SplashAdListener splashAdListener = this.f17547q;
            if (splashAdListener != null) {
                splashAdListener.onAdFailedToLoad(AdRequest.ERROR_CODE_NOT_READY_TO_REQUEST);
            }
            InterstitialAdListener interstitialAdListener = this.f17548r;
            if (interstitialAdListener != null) {
                interstitialAdListener.onAdFailedToLoad(AdRequest.ERROR_CODE_NOT_READY_TO_REQUEST);
            }
            BannerAdListener bannerAdListener = this.f17549s;
            if (bannerAdListener != null) {
                bannerAdListener.onAdFailedToLoad(AdRequest.ERROR_CODE_NOT_READY_TO_REQUEST);
            }
            return false;
        }
        if (getWindowVisibility() == 0 && (c3110c = this.mAdFetcher) != null) {
            c3110c.m14365a();
            this.mAdFetcher.m14368c();
            this.mAdFetcher.m14367b();
            this.f17501A = true;
            this.loadCount = 1;
            this.clickCount = 0;
            return true;
        }
        C3110c c3110c2 = this.mAdFetcher;
        if (c3110c2 != null) {
            c3110c2.m14365a();
            this.mAdFetcher.m14368c();
            this.mAdFetcher.m14367b();
            this.f17501A = true;
            this.loadCount = 1;
            this.clickCount = 0;
        }
        return false;
    }

    public void onAdFailedToLoad(int i) {
        if (this.f17540j) {
            RewardVideoAdListener rewardVideoAdListener = this.f17550t;
            if (rewardVideoAdListener != null) {
                rewardVideoAdListener.onRewardVideoAdFailedToLoad(i);
                return;
            }
            return;
        }
        SplashAdListener splashAdListener = this.f17547q;
        if (splashAdListener != null) {
            splashAdListener.onAdFailedToLoad(i);
        }
        InterstitialAdListener interstitialAdListener = this.f17548r;
        if (interstitialAdListener != null) {
            interstitialAdListener.onAdFailedToLoad(i);
        }
        BannerAdListener bannerAdListener = this.f17549s;
        if (bannerAdListener != null) {
            bannerAdListener.onAdFailedToLoad(i);
        }
    }

    public void onBannerAdShow() {
        AdWebView adWebView = this.f17529ae;
        if (adWebView != null) {
            adWebView.onAdShow();
        }
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onCreateLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onDestroyLifeCycle() {
        C3110c c3110c = this.mAdFetcher;
        if (c3110c != null) {
            c3110c.m14365a();
        }
        activityOnDestroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onPauseLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onRestartLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onResumeLifeCycle() {
        C3172a c3172a = this.f17532b;
        C3172a.a aVar = C3172a.a.FINISHCLOSE;
        c3172a.m14699a(aVar);
        if (this.f17532b.m14703c() == aVar) {
            getAdDispatcher().mo14241b();
        }
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onStartLifeCycle() {
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void onStopLifeCycle() {
        this.f17532b.m14699a(C3172a.a.STATE_BACKGROUND);
    }

    public void openAdInNativeBrowser(boolean z) {
        setOpensNativeBrowser(z);
    }

    public void pingClick(String str) {
        if (StringUtil.isEmpty(str)) {
            return;
        }
        new AsyncTaskC3115h(str).execute(new Void[0]);
    }

    public void pingConvert(String str) {
        if (StringUtil.isEmpty(str)) {
            return;
        }
        new AsyncTaskC3115h(str).execute(new Void[0]);
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendLossNotice(int i, String str, String str2) {
        try {
            this.serverResponse.reportLoss(i, str, str2);
            setDpUpStrategy(getContext(), this.serverResponse, new InterfaceC3175d() { // from class: com.octopus.ad.internal.view.AdViewImpl.15
                public C315515() {
                }

                @Override // com.octopus.p222ad.internal.view.AdViewImpl.InterfaceC3175d
                /* JADX INFO: renamed from: a */
                public void mo14538a(int i2) {
                    if (AdViewImpl.this.f17521U || AdViewImpl.this.f17522V || AdViewImpl.this.f17523W || AdViewImpl.this.f17525aa) {
                        return;
                    }
                    AdViewImpl adViewImpl = AdViewImpl.this;
                    if (adViewImpl.serverResponse != null) {
                        SPUtils.putFrequency(adViewImpl.getContext(), "liftUpfrequency" + AdViewImpl.this.serverResponse.getTagId(), i2);
                        AdViewImpl.this.m14667h();
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendWinNotice(int i) {
        try {
            this.serverResponse.reportWin(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setAdExtInfo(String str) {
        this.f17546p = str;
    }

    public void setAdId(String str) {
        this.f17518R = str;
    }

    public void setAdSlotId(String str) {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.set_placement_id, str));
        this.f17538h.m14372a(str);
    }

    public void setAdWebView(AdWebView adWebView) {
        this.f17529ae = adWebView;
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f17551u = appEventListener;
    }

    public void setBannerAdListener(BannerAdListener bannerAdListener) {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.set_banner_ad_listener));
        this.f17549s = bannerAdListener;
    }

    public void setBrowserStyle(C3174c c3174c) {
        this.f17552v = c3174c;
    }

    public void setChannel(String str) {
        this.f17538h.m14376b(str);
    }

    public void setCloseButtonPadding(int i, int i2, int i3, int i4) {
        this.leftPadding = i;
        this.topPadding = i2;
        this.rightPadding = i3;
        this.bottomPadding = i4;
    }

    public void setCreativeHeight(int i) {
        this.f17545o = i;
    }

    public void setCreativeWidth(int i) {
        this.f17544n = i;
    }

    public void setInterstitialAdListener(InterstitialAdListener interstitialAdListener) {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.set_interstitial_ad_listener));
        this.f17548r = interstitialAdListener;
    }

    public void setLandingPageUrl(String str) {
        this.f17517Q = str;
    }

    public void setLoadsInBackground(boolean z) {
        this.f17537g = z;
    }

    public void setOpensNativeBrowser(boolean z) {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.set_opens_native_browser, z));
        this.f17538h.m14377b(z);
    }

    public void setPrice(int i) {
        this.f17515O = i;
    }

    public void setRequestId(String str) {
        this.f17538h.m14380c(str);
    }

    public void setRewardVideoAdListener(RewardVideoAdListener rewardVideoAdListener) {
        if (!this.f17540j) {
            HaoboLog.m14609e(HaoboLog.publicFunctionsLogTag, "setRewardVideoAdListener() called on non-RewardVideoAd");
        } else {
            HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.set_reward_video_ad_listener));
            this.f17550t = rewardVideoAdListener;
        }
    }

    public void setShouldResizeParent(boolean z) {
        this.f17555y = z;
    }

    public void setShowLoadingIndicator(boolean z) {
        this.f17556z = z;
    }

    public void setSplashAdListener(SplashAdListener splashAdListener) {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.set_splash_ad_listener));
        this.f17547q = splashAdListener;
    }

    public void setTag(String str) {
        if ("OctopusGroup".equals(str)) {
            m14667h();
        }
    }

    public void setTagId(String str) {
        this.f17516P = str;
    }

    public void showAd() {
        ViewGroup viewGroup = this.f17524a;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f17524a.addView(this);
        }
        AdWebView adWebView = this.f17529ae;
        ServerResponse serverResponse = adWebView.f17644ad;
        this.serverResponse = serverResponse;
        if (serverResponse == null || serverResponse.mMediaType != EnumC3119l.SPLASH || this.f17543m == null) {
            int showCloseBtnTime = adWebView.getShowCloseBtnTime();
            int autoCloseTime = this.f17529ae.getAutoCloseTime();
            AdWebView adWebView2 = this.f17529ae;
            addCloseButton(-1, showCloseBtnTime, autoCloseTime, adWebView2, adWebView2.f17644ad.getAdType() == C3072e.a.ADP_IVIDEO);
        } else {
            if (this.f17519S) {
                setDefaultSkip(getContext());
            }
            addSkipView(this.f17529ae.getAutoCloseTime(), this.f17543m);
        }
        setAutoClickStrategy(getContext(), this.serverResponse, this.f17531ag);
        boolean zIsCallBackClick = isCallBackClick(this.serverResponse);
        this.f17526ab = zIsCallBackClick;
        if (!zIsCallBackClick) {
            this.f17527ac = 8;
        }
        this.f17529ae.setOpt(this.f17527ac);
        if (this.f17547q != null) {
            Log.e("OctopusAd", "enter Octopus ad show");
            this.f17547q.onAdShown();
            this.f17529ae.post(new Runnable() { // from class: com.octopus.ad.internal.view.AdViewImpl.17
                public RunnableC315717() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    AdViewImpl.this.f17529ae.f17644ad.handleView(AdViewImpl.this.f17529ae, AdViewImpl.this.f17538h.m14369a());
                }
            });
        }
    }

    public void showAdLogo(View view) {
        ViewUtil.removeChildFromParent(this.f17513M);
        ViewUtil.removeChildFromParent(this.f17514N);
        ViewParent parent = mo14697e() ? view.getParent() : this;
        if (parent instanceof FrameLayout) {
            if (this.f17513M != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 42, 83);
                layoutParams.setMargins(16, 0, 0, 16);
                ((FrameLayout) parent).addView(this.f17513M, layoutParams);
                this.f17513M.setVisibility(0);
            }
            if (this.f17514N != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 42, 85);
                layoutParams2.setMargins(0, 0, 16, 16);
                ((FrameLayout) parent).addView(this.f17514N, layoutParams2);
                this.f17514N.setVisibility(0);
            }
        }
    }

    public void showBannerCloseBtn(View view) {
        ImageView imageView;
        if (!(view instanceof FrameLayout) || (imageView = this.f17504D) == null) {
            return;
        }
        ((FrameLayout) view).addView(imageView);
    }
}
