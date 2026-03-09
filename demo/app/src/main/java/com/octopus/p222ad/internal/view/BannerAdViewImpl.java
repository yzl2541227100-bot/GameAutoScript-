package com.octopus.p222ad.internal.view;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.C3064a;
import com.octopus.p222ad.internal.C3110c;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.EnumC3119l;
import com.octopus.p222ad.internal.animation.Animator;
import com.octopus.p222ad.internal.animation.TransitionDirection;
import com.octopus.p222ad.internal.animation.TransitionType;
import com.octopus.p222ad.internal.network.AsyncTaskC3126a;
import com.octopus.p222ad.internal.network.ServerResponse;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.internal.utilities.WebviewUtil;
import com.octopus.p222ad.internal.video.AdVideoView;
import com.octopus.p222ad.p224b.C3069b;
import com.octopus.p222ad.utils.C3266g;
import com.octopus.p222ad.utils.C3267h;
import com.octopus.p222ad.utils.C3268i;
import com.octopus.p222ad.utils.C3269j;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.widget.ScrollClickView;

/* JADX INFO: loaded from: classes2.dex */
public class BannerAdViewImpl extends AdViewImpl implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: A */
    private C3268i f17685A;

    /* JADX INFO: renamed from: B */
    private C3267h f17686B;

    /* JADX INFO: renamed from: C */
    private boolean f17687C;

    /* JADX INFO: renamed from: D */
    private InterfaceC3194b f17688D;

    /* JADX INFO: renamed from: E */
    private EnumC3191a f17689E;

    /* JADX INFO: renamed from: m */
    public boolean f17690m;

    /* JADX INFO: renamed from: n */
    public int f17691n;

    /* JADX INFO: renamed from: o */
    public int f17692o;

    /* JADX INFO: renamed from: p */
    private int f17693p;

    /* JADX INFO: renamed from: q */
    private boolean f17694q;

    /* JADX INFO: renamed from: r */
    private boolean f17695r;

    /* JADX INFO: renamed from: s */
    private BroadcastReceiver f17696s;

    /* JADX INFO: renamed from: t */
    private boolean f17697t;

    /* JADX INFO: renamed from: u */
    private boolean f17698u;

    /* JADX INFO: renamed from: v */
    private boolean f17699v;

    /* JADX INFO: renamed from: w */
    private Animator f17700w;

    /* JADX INFO: renamed from: x */
    private boolean f17701x;

    /* JADX INFO: renamed from: y */
    private AdWebView f17702y;

    /* JADX INFO: renamed from: z */
    private C3269j f17703z;

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$1 */
    public class C31841 extends BroadcastReceiver {
        public C31841() {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
            /*
                r1 = this;
                java.lang.String r2 = r3.getAction()
                java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L1d
                com.octopus.ad.internal.view.BannerAdViewImpl r2 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                r2.m14765h()
                java.lang.String r2 = com.octopus.p222ad.internal.utilities.HaoboLog.baseLogTag
                int r3 = com.octopus.p222ad.C3063R.string.screen_off_stop
            L15:
                java.lang.String r3 = com.octopus.p222ad.internal.utilities.HaoboLog.getString(r3)
                com.octopus.p222ad.internal.utilities.HaoboLog.m14607d(r2, r3)
                goto L4f
            L1d:
                java.lang.String r2 = r3.getAction()
                java.lang.String r3 = "android.intent.action.SCREEN_ON"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L4f
                r2 = 0
                com.octopus.ad.internal.view.BannerAdViewImpl r3 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                int r3 = com.octopus.p222ad.internal.view.BannerAdViewImpl.m14752a(r3)
                r0 = 1
                if (r3 <= 0) goto L3a
            L33:
                com.octopus.ad.internal.view.BannerAdViewImpl r2 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                r2.m14764g()
                r2 = 1
                goto L48
            L3a:
                com.octopus.ad.internal.view.BannerAdViewImpl r3 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                boolean r3 = com.octopus.p222ad.internal.view.BannerAdViewImpl.m14756b(r3)
                if (r3 == 0) goto L48
                com.octopus.ad.internal.view.BannerAdViewImpl r2 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                r2.m14765h()
                goto L33
            L48:
                if (r2 == 0) goto L4f
                java.lang.String r2 = com.octopus.p222ad.internal.utilities.HaoboLog.baseLogTag
                int r3 = com.octopus.p222ad.C3063R.string.screen_on_start
                goto L15
            L4f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.view.BannerAdViewImpl.C31841.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$2 */
    public class C31852 implements C3269j.a {
        public C31852() {
        }

        @Override // com.octopus.p222ad.utils.C3269j.a
        /* JADX INFO: renamed from: a */
        public void mo14767a() {
            BannerAdViewImpl.this.m14691a("", "", "", "", "", "", "", "", 2);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$3 */
    public class ViewOnTouchListenerC31863 implements View.OnTouchListener {
        public ViewOnTouchListenerC31863() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$4 */
    public class C31874 implements C3268i.a {
        public C31874() {
        }

        @Override // com.octopus.p222ad.utils.C3268i.a
        /* JADX INFO: renamed from: a */
        public void mo14768a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            BannerAdViewImpl.this.m14691a(str, str2, str3, str4, str5, str6, str7, str8, 1);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$5 */
    public class C31885 implements C3267h.a {
        public C31885() {
        }

        @Override // com.octopus.p222ad.utils.C3267h.a
        /* JADX INFO: renamed from: a */
        public void mo14769a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            BannerAdViewImpl.this.m14691a(str, str2, str3, str4, str5, str6, str7, str8, 0);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$6 */
    public class ViewOnTouchListenerC31896 implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f17709a;

        /* JADX INFO: renamed from: b */
        public float f17710b;

        /* JADX INFO: renamed from: c */
        public float f17711c;

        /* JADX INFO: renamed from: d */
        public float f17712d;

        /* JADX INFO: renamed from: e */
        public float f17713e;

        /* JADX INFO: renamed from: f */
        public float f17714f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f17715g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f17716h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C3268i.a f17717i;

        public ViewOnTouchListenerC31896(int i, String str, C3268i.a aVar) {
            i = i;
            str = str;
            aVar = aVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C3268i.a aVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            StringBuilder sb;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f17709a = motionEvent.getX();
                this.f17710b = motionEvent.getY();
                this.f17711c = motionEvent.getX();
                this.f17712d = motionEvent.getY();
                this.f17713e = motionEvent.getRawX();
                this.f17714f = motionEvent.getRawY();
            } else if (action == 1) {
                C3255f.m14982b("ScrollClickUtil", "mCurPosX = " + this.f17711c + ",mCurPosY = " + this.f17712d + ",mPosX = " + this.f17709a + ",mPosY = " + this.f17710b);
                float f = this.f17712d;
                float f2 = this.f17710b;
                if (f - f2 <= 0.0f || Math.abs(f - f2) <= i) {
                    float f3 = this.f17712d;
                    float f4 = this.f17710b;
                    if (f3 - f4 >= 0.0f || Math.abs(f3 - f4) <= i) {
                        float f5 = this.f17711c;
                        float f6 = this.f17709a;
                        if (f5 - f6 >= 0.0f || Math.abs(f5 - f6) <= i) {
                            float f7 = this.f17711c;
                            float f8 = this.f17709a;
                            if (f7 - f8 < 0.0f && Math.abs(f7 - f8) > i && ScrollClickView.DIR_RIGHT.equalsIgnoreCase(str) && (aVar = aVar) != null) {
                                str = this.f17709a + "";
                                str2 = this.f17710b + "";
                                str3 = this.f17713e + "";
                                str4 = this.f17714f + "";
                                str5 = motionEvent.getX() + "";
                                str6 = motionEvent.getY() + "";
                                str7 = motionEvent.getRawX() + "";
                                sb = new StringBuilder();
                                sb.append(motionEvent.getRawY());
                                sb.append("");
                                aVar.mo14768a(str, str2, str3, str4, str5, str6, str7, sb.toString());
                            }
                        } else if (ScrollClickView.DIR_LEFT.equalsIgnoreCase(str) && (aVar = aVar) != null) {
                            str = this.f17709a + "";
                            str2 = this.f17710b + "";
                            str3 = this.f17713e + "";
                            str4 = this.f17714f + "";
                            str5 = motionEvent.getX() + "";
                            str6 = motionEvent.getY() + "";
                            str7 = motionEvent.getRawX() + "";
                            sb = new StringBuilder();
                            sb.append(motionEvent.getRawY());
                            sb.append("");
                            aVar.mo14768a(str, str2, str3, str4, str5, str6, str7, sb.toString());
                        }
                    } else if (ScrollClickView.DIR_UP.equalsIgnoreCase(str) && (aVar = aVar) != null) {
                        str = this.f17709a + "";
                        str2 = this.f17710b + "";
                        str3 = this.f17713e + "";
                        str4 = this.f17714f + "";
                        str5 = motionEvent.getX() + "";
                        str6 = motionEvent.getY() + "";
                        str7 = motionEvent.getRawX() + "";
                        sb = new StringBuilder();
                        sb.append(motionEvent.getRawY());
                        sb.append("");
                        aVar.mo14768a(str, str2, str3, str4, str5, str6, str7, sb.toString());
                    }
                } else if (ScrollClickView.DIR_DOWN.equalsIgnoreCase(str) && (aVar = aVar) != null) {
                    str = this.f17709a + "";
                    str2 = this.f17710b + "";
                    str3 = this.f17713e + "";
                    str4 = this.f17714f + "";
                    str5 = motionEvent.getX() + "";
                    str6 = motionEvent.getY() + "";
                    str7 = motionEvent.getRawX() + "";
                    sb = new StringBuilder();
                    sb.append(motionEvent.getRawY());
                    sb.append("");
                    aVar.mo14768a(str, str2, str3, str4, str5, str6, str7, sb.toString());
                }
            } else if (action == 2) {
                this.f17711c = motionEvent.getX();
                this.f17712d = motionEvent.getY();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$7 */
    public static /* synthetic */ class C31907 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17719a;

        static {
            int[] iArr = new int[EnumC3191a.values().length];
            f17719a = iArr;
            try {
                iArr[EnumC3191a.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17719a[EnumC3191a.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17719a[EnumC3191a.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17719a[EnumC3191a.CENTER_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17719a[EnumC3191a.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17719a[EnumC3191a.CENTER_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17719a[EnumC3191a.BOTTOM_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17719a[EnumC3191a.BOTTOM_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17719a[EnumC3191a.BOTTOM_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$a */
    public enum EnumC3191a {
        TOP_LEFT,
        TOP_CENTER,
        TOP_RIGHT,
        CENTER_LEFT,
        CENTER,
        CENTER_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_CENTER,
        BOTTOM_RIGHT;

        /* JADX INFO: renamed from: a */
        public int m14770a() {
            switch (C31907.f17719a[ordinal()]) {
                case 1:
                    return 51;
                case 2:
                    return 49;
                case 3:
                    return 53;
                case 4:
                    return 19;
                case 5:
                default:
                    return 17;
                case 6:
                    return 21;
                case 7:
                    return 83;
                case 8:
                    return 81;
                case 9:
                    return 85;
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$b */
    public class AnimationAnimationListenerC3192b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b */
        private final InterfaceC3194b f17731b;

        /* JADX INFO: renamed from: c */
        private final Animator f17732c;

        /* JADX INFO: renamed from: com.octopus.ad.internal.view.BannerAdViewImpl$b$1 */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Animator f17733a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC3194b f17734b;

            public AnonymousClass1(Animator animator, InterfaceC3194b interfaceC3194b) {
                animator = animator;
                interfaceC3194b = interfaceC3194b;
            }

            @Override // java.lang.Runnable
            public void run() {
                animator.clearAnimation();
                interfaceC3194b.destroy();
                animator.setAnimation();
            }
        }

        public AnimationAnimationListenerC3192b(InterfaceC3194b interfaceC3194b, Animator animator) {
            this.f17731b = interfaceC3194b;
            this.f17732c = animator;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            animation.setAnimationListener(null);
            InterfaceC3194b interfaceC3194b = this.f17731b;
            Animator animator = this.f17732c;
            if (interfaceC3194b == null || animator == null) {
                return;
            }
            interfaceC3194b.getView().getHandler().post(new Runnable() { // from class: com.octopus.ad.internal.view.BannerAdViewImpl.b.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Animator f17733a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC3194b f17734b;

                public AnonymousClass1(Animator animator2, InterfaceC3194b interfaceC3194b2) {
                    animator = animator2;
                    interfaceC3194b = interfaceC3194b2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    animator.clearAnimation();
                    interfaceC3194b.destroy();
                    animator.setAnimation();
                }
            });
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BannerAdViewImpl(Context context) {
        super(context);
        this.f17687C = true;
    }

    public BannerAdViewImpl(Context context, int i) {
        super(context);
        this.f17687C = true;
        setAutoRefreshInterval(i);
    }

    public BannerAdViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17687C = true;
    }

    public BannerAdViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17687C = true;
    }

    public BannerAdViewImpl(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
        this.f17687C = true;
    }

    /* JADX INFO: renamed from: a */
    private void m14753a(double d) {
        C3269j c3269j = this.f17703z;
        if (c3269j != null) {
            c3269j.m15089a(d);
            View viewM15087a = this.f17703z.m15087a(ViewUtil.px2dip(getContext(), getWidth()), ViewUtil.px2dip(getContext(), getHeight()));
            if (viewM15087a != null) {
                this.f17703z.m15091a(new C3269j.a() { // from class: com.octopus.ad.internal.view.BannerAdViewImpl.2
                    public C31852() {
                    }

                    @Override // com.octopus.p222ad.utils.C3269j.a
                    /* JADX INFO: renamed from: a */
                    public void mo14767a() {
                        BannerAdViewImpl.this.m14691a("", "", "", "", "", "", "", "", 2);
                    }
                });
                addView(viewM15087a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14754a(int i) {
        boolean zM15037a = C3266g.m15037a(i);
        C3255f.m14981a("OctopusAd", "octopus clickable = " + zM15037a);
        if (zM15037a) {
            return;
        }
        disableFullClick(new View.OnTouchListener() { // from class: com.octopus.ad.internal.view.BannerAdViewImpl.3
            public ViewOnTouchListenerC31863() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m14755a(String str, int i, C3268i.a aVar) {
        if (aVar != null) {
            this.f17685A.m15060a(aVar);
        }
        setScrollClick(new View.OnTouchListener() { // from class: com.octopus.ad.internal.view.BannerAdViewImpl.6

            /* JADX INFO: renamed from: a */
            public float f17709a;

            /* JADX INFO: renamed from: b */
            public float f17710b;

            /* JADX INFO: renamed from: c */
            public float f17711c;

            /* JADX INFO: renamed from: d */
            public float f17712d;

            /* JADX INFO: renamed from: e */
            public float f17713e;

            /* JADX INFO: renamed from: f */
            public float f17714f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f17715g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ String f17716h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ C3268i.a f17717i;

            public ViewOnTouchListenerC31896(int i2, String str2, C3268i.a aVar2) {
                i = i2;
                str = str2;
                aVar = aVar2;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                C3268i.a aVar2;
                String str2;
                String str22;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                StringBuilder sb;
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f17709a = motionEvent.getX();
                    this.f17710b = motionEvent.getY();
                    this.f17711c = motionEvent.getX();
                    this.f17712d = motionEvent.getY();
                    this.f17713e = motionEvent.getRawX();
                    this.f17714f = motionEvent.getRawY();
                } else if (action == 1) {
                    C3255f.m14982b("ScrollClickUtil", "mCurPosX = " + this.f17711c + ",mCurPosY = " + this.f17712d + ",mPosX = " + this.f17709a + ",mPosY = " + this.f17710b);
                    float f = this.f17712d;
                    float f2 = this.f17710b;
                    if (f - f2 <= 0.0f || Math.abs(f - f2) <= i) {
                        float f3 = this.f17712d;
                        float f4 = this.f17710b;
                        if (f3 - f4 >= 0.0f || Math.abs(f3 - f4) <= i) {
                            float f5 = this.f17711c;
                            float f6 = this.f17709a;
                            if (f5 - f6 >= 0.0f || Math.abs(f5 - f6) <= i) {
                                float f7 = this.f17711c;
                                float f8 = this.f17709a;
                                if (f7 - f8 < 0.0f && Math.abs(f7 - f8) > i && ScrollClickView.DIR_RIGHT.equalsIgnoreCase(str) && (aVar2 = aVar) != null) {
                                    str2 = this.f17709a + "";
                                    str22 = this.f17710b + "";
                                    str3 = this.f17713e + "";
                                    str4 = this.f17714f + "";
                                    str5 = motionEvent.getX() + "";
                                    str6 = motionEvent.getY() + "";
                                    str7 = motionEvent.getRawX() + "";
                                    sb = new StringBuilder();
                                    sb.append(motionEvent.getRawY());
                                    sb.append("");
                                    aVar2.mo14768a(str2, str22, str3, str4, str5, str6, str7, sb.toString());
                                }
                            } else if (ScrollClickView.DIR_LEFT.equalsIgnoreCase(str) && (aVar2 = aVar) != null) {
                                str2 = this.f17709a + "";
                                str22 = this.f17710b + "";
                                str3 = this.f17713e + "";
                                str4 = this.f17714f + "";
                                str5 = motionEvent.getX() + "";
                                str6 = motionEvent.getY() + "";
                                str7 = motionEvent.getRawX() + "";
                                sb = new StringBuilder();
                                sb.append(motionEvent.getRawY());
                                sb.append("");
                                aVar2.mo14768a(str2, str22, str3, str4, str5, str6, str7, sb.toString());
                            }
                        } else if (ScrollClickView.DIR_UP.equalsIgnoreCase(str) && (aVar2 = aVar) != null) {
                            str2 = this.f17709a + "";
                            str22 = this.f17710b + "";
                            str3 = this.f17713e + "";
                            str4 = this.f17714f + "";
                            str5 = motionEvent.getX() + "";
                            str6 = motionEvent.getY() + "";
                            str7 = motionEvent.getRawX() + "";
                            sb = new StringBuilder();
                            sb.append(motionEvent.getRawY());
                            sb.append("");
                            aVar2.mo14768a(str2, str22, str3, str4, str5, str6, str7, sb.toString());
                        }
                    } else if (ScrollClickView.DIR_DOWN.equalsIgnoreCase(str) && (aVar2 = aVar) != null) {
                        str2 = this.f17709a + "";
                        str22 = this.f17710b + "";
                        str3 = this.f17713e + "";
                        str4 = this.f17714f + "";
                        str5 = motionEvent.getX() + "";
                        str6 = motionEvent.getY() + "";
                        str7 = motionEvent.getRawX() + "";
                        sb = new StringBuilder();
                        sb.append(motionEvent.getRawY());
                        sb.append("");
                        aVar2.mo14768a(str2, str22, str3, str4, str5, str6, str7, sb.toString());
                    }
                } else if (action == 2) {
                    this.f17711c = motionEvent.getX();
                    this.f17712d = motionEvent.getY();
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    private void m14757j() {
        this.f17694q = false;
        this.f17693p = -1;
        this.f17695r = false;
        this.f17701x = true;
    }

    /* JADX INFO: renamed from: k */
    private void m14758k() {
        if (this.f17696s != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.f17696s = new BroadcastReceiver() { // from class: com.octopus.ad.internal.view.BannerAdViewImpl.1
            public C31841() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context v, Intent v2) {
                /*
                    this = this;
                    java.lang.String r2 = r3.getAction()
                    java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                    boolean r2 = r2.equals(r0)
                    if (r2 == 0) goto L1d
                    com.octopus.ad.internal.view.BannerAdViewImpl r2 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                    r2.m14765h()
                    java.lang.String r2 = com.octopus.p222ad.internal.utilities.HaoboLog.baseLogTag
                    int r3 = com.octopus.p222ad.C3063R.string.screen_off_stop
                L15:
                    java.lang.String r3 = com.octopus.p222ad.internal.utilities.HaoboLog.getString(r3)
                    com.octopus.p222ad.internal.utilities.HaoboLog.m14607d(r2, r3)
                    goto L4f
                L1d:
                    java.lang.String r2 = r3.getAction()
                    java.lang.String r3 = "android.intent.action.SCREEN_ON"
                    boolean r2 = r2.equals(r3)
                    if (r2 == 0) goto L4f
                    r2 = 0
                    com.octopus.ad.internal.view.BannerAdViewImpl r3 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                    int r3 = com.octopus.p222ad.internal.view.BannerAdViewImpl.m14752a(r3)
                    r0 = 1
                    if (r3 <= 0) goto L3a
                L33:
                    com.octopus.ad.internal.view.BannerAdViewImpl r2 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                    r2.m14764g()
                    r2 = 1
                    goto L48
                L3a:
                    com.octopus.ad.internal.view.BannerAdViewImpl r3 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                    boolean r3 = com.octopus.p222ad.internal.view.BannerAdViewImpl.m14756b(r3)
                    if (r3 == 0) goto L48
                    com.octopus.ad.internal.view.BannerAdViewImpl r2 = com.octopus.p222ad.internal.view.BannerAdViewImpl.this
                    r2.m14765h()
                    goto L33
                L48:
                    if (r2 == 0) goto L4f
                    java.lang.String r2 = com.octopus.p222ad.internal.utilities.HaoboLog.baseLogTag
                    int r3 = com.octopus.p222ad.C3063R.string.screen_on_start
                    goto L15
                L4f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.view.BannerAdViewImpl.C31841.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        try {
            C3255f.m14983c("OctopusAd", "before registerReceiver");
            getContext().registerReceiver(this.f17696s, intentFilter);
        } catch (Throwable unused) {
            C3255f.m14983c("OctopusAd", "ignore error");
        }
    }

    /* JADX INFO: renamed from: l */
    private void m14759l() {
        if (this.f17693p > 0) {
            m14758k();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m14760m() {
        C3268i c3268i = this.f17685A;
        if (c3268i != null) {
            c3268i.m15058a();
            View viewM15057a = this.f17685A.m15057a(ViewUtil.px2dip(getContext(), getWidth()), ViewUtil.px2dip(getContext(), getHeight()));
            if (viewM15057a != null) {
                m14755a(ScrollClickView.DIR_UP, 100, new C3268i.a() { // from class: com.octopus.ad.internal.view.BannerAdViewImpl.4
                    public C31874() {
                    }

                    @Override // com.octopus.p222ad.utils.C3268i.a
                    /* JADX INFO: renamed from: a */
                    public void mo14768a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                        BannerAdViewImpl.this.m14691a(str, str2, str3, str4, str5, str6, str7, str8, 1);
                    }
                });
                addView(viewM15057a);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private void m14761n() {
        View viewM15050a;
        C3267h c3267h = this.f17686B;
        if (c3267h == null || (viewM15050a = c3267h.m15050a(ViewUtil.px2dip(getContext(), getWidth()), ViewUtil.px2dip(getContext(), getHeight()), true)) == null) {
            return;
        }
        this.f17686B.m15052a(new C3267h.a() { // from class: com.octopus.ad.internal.view.BannerAdViewImpl.5
            public C31885() {
            }

            @Override // com.octopus.p222ad.utils.C3267h.a
            /* JADX INFO: renamed from: a */
            public void mo14769a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                BannerAdViewImpl.this.m14691a(str, str2, str3, str4, str5, str6, str7, str8, 0);
            }
        });
        addView(viewM15050a);
    }

    /* JADX INFO: renamed from: o */
    private void m14762o() {
        StringBuilder sb = new StringBuilder();
        sb.append("enter dismantleBroadcast mReceiver == null ? ");
        sb.append(this.f17696s == null);
        C3255f.m14983c("OctopusAd", sb.toString());
        if (this.f17696s == null) {
            return;
        }
        try {
            getContext().unregisterReceiver(this.f17696s);
            C3255f.m14983c("OctopusAd", "after unregisterReceiver");
        } catch (IllegalArgumentException unused) {
            C3255f.m14983c("OctopusAd", "got IllegalArgumentException");
        }
        this.f17696s = null;
    }

    /* JADX INFO: renamed from: p */
    private void m14763p() {
        C3269j c3269j = this.f17703z;
        if (c3269j != null) {
            c3269j.m15095c();
            this.f17703z = null;
        }
        C3267h c3267h = this.f17686B;
        if (c3267h != null) {
            c3267h.m15051a();
        }
        C3268i c3268i = this.f17685A;
        if (c3268i != null) {
            c3268i.m15063c();
        }
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: a */
    public void mo14688a(Context context, AttributeSet attributeSet) {
        this.f17693p = -1;
        this.f17690m = false;
        this.f17697t = false;
        this.f17698u = false;
        this.f17699v = false;
        this.f17700w = new Animator(getContext(), TransitionType.NONE, TransitionDirection.UP, 500L);
        View view = (View) getParent();
        if (view != null) {
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = view.getMeasuredHeight();
            C3120m c3120mM14425a = C3120m.m14425a();
            int iM14447m = (int) ((measuredHeight / c3120mM14425a.m14447m()) + 0.5f);
            this.f17538h.m14382d((int) ((measuredHeight2 / c3120mM14425a.m14446l()) + 0.5f));
            this.f17538h.m14384e(iM14447m);
        }
        super.mo14688a(context, attributeSet);
        m14759l();
        this.f17538h.m14371a(this.f17524a != null ? EnumC3119l.SPLASH : EnumC3119l.BANNER);
        this.mAdFetcher.m14366a(this.f17693p);
        if (this.f17701x) {
            this.mAdFetcher.m14367b();
            this.f17694q = true;
        }
        this.f17703z = new C3269j(getContext());
        this.f17685A = new C3268i(getContext());
        this.f17686B = new C3267h(getContext());
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: a */
    public void mo14689a(InterfaceC3194b interfaceC3194b) {
        int refreshInterval;
        if (interfaceC3194b == null || interfaceC3194b.failed() || interfaceC3194b.getView() == null) {
            onAdFailedToLoad(AdRequest.INVALID_DISPLAY);
            HaoboLog.m14609e(HaoboLog.baseLogTag, "Loaded an ad with an invalid displayable");
            return;
        }
        if (this.f17533c == interfaceC3194b) {
            return;
        }
        this.f17688D = interfaceC3194b;
        if (getTransitionType() == TransitionType.NONE) {
            removeAllViews();
            InterfaceC3194b interfaceC3194b2 = this.f17533c;
            if (interfaceC3194b2 != null) {
                interfaceC3194b2.destroy();
            }
            View view = interfaceC3194b.getView();
            addView(view);
            if (view instanceof AdWebView) {
                C3255f.m14981a("OctopusAd", "set mAdWebView");
                this.f17702y = (AdWebView) view;
            }
            if (view.getLayoutParams() != null) {
                ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = getAdAlignment().m14770a();
            }
            if (getMediaType() != EnumC3119l.SPLASH || (interfaceC3194b.getView() instanceof AdVideoView)) {
                interfaceC3194b.visible();
            }
        } else {
            if (interfaceC3194b.getView().getLayoutParams() != null) {
                ((FrameLayout.LayoutParams) interfaceC3194b.getView().getLayoutParams()).gravity = getAdAlignment().m14770a();
                this.f17700w.setLayoutParams(interfaceC3194b.getView().getLayoutParams());
            }
            if (getChildCount() == 0 || indexOfChild(this.f17700w) == -1) {
                removeAllViews();
                if (getMediaType() != EnumC3119l.SPLASH || (interfaceC3194b.getView() instanceof AdVideoView)) {
                    interfaceC3194b.visible();
                }
                addView(this.f17700w, 0);
                this.f17700w.addView(interfaceC3194b.getView());
            } else {
                if (getMediaType() != EnumC3119l.SPLASH || (interfaceC3194b.getView() instanceof AdVideoView)) {
                    interfaceC3194b.visible();
                }
                this.f17700w.addView(interfaceC3194b.getView());
                this.f17700w.showNext();
            }
            InterfaceC3194b interfaceC3194b3 = this.f17533c;
            if (interfaceC3194b3 != null) {
                if (interfaceC3194b3.getView().getAnimation() != null) {
                    interfaceC3194b3.getView().getAnimation().setAnimationListener(new AnimationAnimationListenerC3192b(interfaceC3194b3, this.f17700w));
                } else {
                    interfaceC3194b3.destroy();
                }
            }
        }
        m14693b();
        if (this.f17524a == null && (refreshInterval = interfaceC3194b.getRefreshInterval()) > 0 && this.f17687C) {
            setAutoRefreshInterval(refreshInterval * 1000);
        }
        this.f17533c = interfaceC3194b;
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public void activityOnDestroy() {
        InterfaceC3194b interfaceC3194b = this.f17688D;
        if (interfaceC3194b != null) {
            interfaceC3194b.onDestroy();
            this.f17688D = null;
        }
        C3255f.m14983c("OctopusAd", "enter activityOnDestroy before dismantleBroadcast");
        m14762o();
        m14763p();
        if (this.mAdFetcher != null) {
            m14765h();
        }
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public void activityOnPause() {
        InterfaceC3194b interfaceC3194b = this.f17688D;
        if (interfaceC3194b != null) {
            interfaceC3194b.onPause();
        }
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public void activityOnResume() {
        InterfaceC3194b interfaceC3194b = this.f17688D;
        if (interfaceC3194b != null) {
            interfaceC3194b.onResume();
        }
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: b */
    public void mo14694b(Context context, AttributeSet attributeSet) {
        String str;
        int i;
        boolean opensNativeBrowser;
        String str2;
        String string;
        m14757j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3063R.styleable.AdView);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        HaoboLog.m14613v(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.found_n_in_xml, indexCount));
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C3063R.styleable.AdView_adSlotId) {
                setAdSlotId(typedArrayObtainStyledAttributes.getString(index));
                str2 = HaoboLog.xmlLogTag;
                string = HaoboLog.getString(C3063R.string.placement_id, typedArrayObtainStyledAttributes.getString(index));
            } else if (index == C3063R.styleable.AdView_auto_refresh_interval) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, -1);
                setAutoRefreshInterval(i3);
                if (i3 <= 0) {
                    this.f17701x = true;
                }
                str2 = HaoboLog.xmlLogTag;
                string = HaoboLog.getString(C3063R.string.xml_set_period, i3);
            } else {
                if (index == C3063R.styleable.AdView_test) {
                    C3120m.m14425a().f17182b = typedArrayObtainStyledAttributes.getBoolean(index, false);
                    str = HaoboLog.xmlLogTag;
                    i = C3063R.string.xml_set_test;
                    opensNativeBrowser = C3120m.m14425a().f17182b;
                } else {
                    if (index == C3063R.styleable.AdView_adSize) {
                        String string2 = typedArrayObtainStyledAttributes.getString(index);
                        C3064a c3064a = null;
                        if (string2 != null && !string2.isEmpty()) {
                            try {
                                c3064a = (C3064a) C3064a.class.getDeclaredField(string2).get(null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c3064a == null) {
                            c3064a = C3064a.f16690g;
                        }
                        HaoboLog.m14607d(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.xml_ad_size, c3064a.toString()));
                        setAdSize(c3064a.m13842b(), c3064a.m13840a());
                    } else if (index == C3063R.styleable.AdView_should_reload_on_resume) {
                        setShouldReloadOnResume(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        str = HaoboLog.xmlLogTag;
                        i = C3063R.string.xml_set_should_reload;
                        opensNativeBrowser = this.f17695r;
                    } else if (index == C3063R.styleable.AdView_opens_native_browser) {
                        setOpensNativeBrowser(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        str = HaoboLog.xmlLogTag;
                        i = C3063R.string.xml_set_opens_native_browser;
                        opensNativeBrowser = getOpensNativeBrowser();
                    } else if (index == C3063R.styleable.AdView_expands_to_fit_screen_width) {
                        setExpandsToFitScreenWidth(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        str = HaoboLog.xmlLogTag;
                        i = C3063R.string.xml_set_expands_to_full_screen_width;
                        opensNativeBrowser = this.f17697t;
                    } else if (index == C3063R.styleable.AdView_resize_ad_to_fit_container) {
                        setResizeAdToFitContainer(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        str = HaoboLog.xmlLogTag;
                        i = C3063R.string.xml_resize_ad_to_fit_container;
                        opensNativeBrowser = this.f17698u;
                    } else if (index == C3063R.styleable.AdView_show_loading_indicator) {
                        HaoboLog.m14607d(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.show_loading_indicator_xml));
                        setShowLoadingIndicator(typedArrayObtainStyledAttributes.getBoolean(index, true));
                    } else if (index == C3063R.styleable.AdView_transition_type) {
                        HaoboLog.m14607d(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.transition_type));
                        setTransitionType(TransitionType.getTypeForInt(typedArrayObtainStyledAttributes.getInt(index, 0)));
                    } else if (index == C3063R.styleable.AdView_transition_direction) {
                        HaoboLog.m14607d(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.transition_direction));
                        setTransitionDirection(TransitionDirection.getDirectionForInt(typedArrayObtainStyledAttributes.getInt(index, 0)));
                    } else if (index == C3063R.styleable.AdView_transition_duration) {
                        HaoboLog.m14607d(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.transition_duration));
                        setTransitionDuration(typedArrayObtainStyledAttributes.getInt(index, 1000));
                    } else if (index == C3063R.styleable.AdView_load_landing_page_in_background) {
                        setLoadsInBackground(typedArrayObtainStyledAttributes.getBoolean(index, true));
                        str = HaoboLog.xmlLogTag;
                        i = C3063R.string.xml_load_landing_page_in_background;
                        opensNativeBrowser = this.f17537g;
                    }
                }
                HaoboLog.m14607d(str, HaoboLog.getString(i, opensNativeBrowser));
            }
            HaoboLog.m14607d(str2, string);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void cancel() {
        C3110c c3110c = this.mAdFetcher;
        if (c3110c != null) {
            c3110c.m14365a();
        }
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: d */
    public boolean mo14696d() {
        return true;
    }

    public void disableFullClick(View.OnTouchListener onTouchListener) {
        AdWebView adWebView = this.f17702y;
        if (adWebView != null) {
            adWebView.setOnTouchListener(onTouchListener);
        }
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: e */
    public boolean mo14697e() {
        return false;
    }

    @SuppressLint({"NewApi"})
    public void expandToFitScreenWidth(int i, int i2, InterfaceC3194b interfaceC3194b) {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i3 = point.x;
        int iFloor = (int) Math.floor(i2 * (i3 / i));
        this.f17691n = getLayoutParams().height;
        this.f17692o = getLayoutParams().width;
        if (getLayoutParams().width > 0 || getLayoutParams().width == -2) {
            getLayoutParams().width = i3;
        }
        getLayoutParams().height = iFloor;
        View view = interfaceC3194b.getView();
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
        }
        view.invalidate();
        this.f17690m = true;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: f */
    public void mo14698f() {
    }

    /* JADX INFO: renamed from: g */
    public void m14764g() {
        if (this.f17694q) {
            return;
        }
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.start));
        this.mAdFetcher.m14367b();
        this.f17694q = true;
    }

    public EnumC3191a getAdAlignment() {
        if (this.f17689E == null) {
            this.f17689E = EnumC3191a.CENTER;
        }
        return this.f17689E;
    }

    public int getAdHeight() {
        HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.get_height, this.f17538h.m14386g()));
        return this.f17538h.m14386g();
    }

    public int getAdWidth() {
        HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.get_width, this.f17538h.m14385f()));
        return this.f17538h.m14385f();
    }

    public int getAutoRefreshInterval() {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.get_period, this.f17693p));
        return this.f17693p;
    }

    public boolean getExpandsToFitScreenWidth() {
        return this.f17697t;
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3073a
    public EnumC3119l getMediaType() {
        return this.f17524a != null ? EnumC3119l.SPLASH : EnumC3119l.BANNER;
    }

    public boolean getResizeAdToFitContainer() {
        return this.f17698u;
    }

    public boolean getShouldReloadOnResume() {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.get_should_resume, this.f17695r));
        return this.f17695r;
    }

    public TransitionDirection getTransitionDirection() {
        return this.f17700w.getTransitionDirection();
    }

    public long getTransitionDuration() {
        return this.f17700w.getTransitionDuration();
    }

    public TransitionType getTransitionType() {
        return this.f17700w.getTransitionType();
    }

    /* JADX INFO: renamed from: h */
    public void m14765h() {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.stop));
        this.mAdFetcher.m14365a();
        this.f17694q = false;
    }

    /* JADX INFO: renamed from: i */
    public void m14766i() {
        this.f17690m = false;
        if (getLayoutParams() != null) {
            getLayoutParams().height = this.f17691n;
            getLayoutParams().width = this.f17692o;
        }
    }

    public boolean isAutoRefresh() {
        return this.f17687C;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public boolean loadAd(AsyncTaskC3126a.a aVar) {
        if (!super.loadAd(aVar)) {
            return false;
        }
        this.f17694q = true;
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ServerResponse serverResponse;
        C3069b.m interEvent;
        if (Build.VERSION.SDK_INT >= 16) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        if (getMediaType() != EnumC3119l.SPLASH || (serverResponse = this.serverResponse) == null || (interEvent = serverResponse.getInterEvent()) == null) {
            return;
        }
        C3069b.r rVarM14056c = interEvent.m14056c();
        if (rVarM14056c != null && rVarM14056c.m14080a() == 1) {
            m14753a(rVarM14056c.m14083b());
        }
        C3069b.p pVarM14057d = interEvent.m14057d();
        if (pVarM14057d != null && pVarM14057d.m14062a() == 1) {
            m14760m();
        }
        C3069b.l lVarM14050a = interEvent.m14050a();
        m14754a(lVarM14050a != null ? lVarM14050a.m14048a() : 0);
        C3069b.o oVarM14055b = interEvent.m14055b();
        if (oVarM14055b == null || oVarM14055b.m14060a() != 1) {
            return;
        }
        m14761n();
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f17534d) {
            this.f17534d = false;
            return;
        }
        if (!this.f17699v || z) {
            C3120m c3120mM14425a = C3120m.m14425a();
            int iM14446l = (int) (((i3 - i) / c3120mM14425a.m14446l()) + 0.5f);
            int iM14447m = (int) (((i4 - i2) / c3120mM14425a.m14447m()) + 0.5f);
            if (iM14446l < this.f17538h.m14385f() || (iM14447m < this.f17538h.m14386g() && iM14446l > 0 && iM14447m > 0)) {
                HaoboLog.m14609e(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.adsize_too_big, iM14446l, iM14447m, this.f17538h.m14385f(), this.f17538h.m14386g()));
                m14695c();
                C3110c c3110c = this.mAdFetcher;
                if (c3110c != null) {
                    c3110c.m14365a();
                    return;
                }
                return;
            }
            this.f17538h.m14382d(iM14446l);
            this.f17538h.m14384e(iM14447m);
            if (!this.f17699v) {
                m14695c();
            }
            this.f17699v = true;
        }
        if (this.f17694q) {
            m14758k();
            if (this.f17695r) {
                m14764g();
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            C3255f.m14983c("OctopusAd", "enter onWindowVisibilityChanged before dismantleBroadcast");
            m14762o();
            HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.hidden));
            if (this.mAdFetcher != null && this.f17694q) {
                m14765h();
            }
            if (getChildAt(0) instanceof WebView) {
                WebviewUtil.onPause((WebView) getChildAt(0));
                return;
            }
            return;
        }
        m14758k();
        HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.unhidden));
        if ((this.f17694q || this.f17695r || this.f17693p > 0) && !this.f17536f && !this.f17534d && !m14692a() && this.mAdFetcher != null) {
            m14764g();
        }
        this.f17536f = false;
        if (getChildAt(0) instanceof WebView) {
            WebviewUtil.onResume((WebView) getChildAt(0));
        }
    }

    public void resetContainerIfNeeded() {
        if (this.f17690m) {
            m14766i();
        }
    }

    @SuppressLint({"NewApi"})
    public void resizeWebViewToFitContainer(int i, int i2, InterfaceC3194b interfaceC3194b) {
        int measuredWidth = getWidth() <= 0 ? getMeasuredWidth() : getWidth();
        int measuredHeight = getHeight() <= 0 ? getMeasuredHeight() : getHeight();
        if (measuredHeight <= 0 || measuredWidth <= 0) {
            HaoboLog.m14615w(HaoboLog.baseLogTag, "Unable to resize ad to fit container because of failure to obtain the container size.");
            return;
        }
        float f = i / measuredWidth;
        float f2 = i2 / measuredHeight;
        View view = interfaceC3194b.getView();
        if (f < f2) {
            measuredWidth = (i * measuredHeight) / i2;
            if (view instanceof WebView) {
                ((WebView) view).setInitialScale((int) Math.ceil((measuredHeight * 100) / i2));
            }
        } else {
            measuredHeight = (i2 * measuredWidth) / i;
            if (view instanceof WebView) {
                ((WebView) view).setInitialScale((int) Math.ceil((measuredWidth * 100) / i));
            }
        }
        if (view.getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(measuredWidth, measuredHeight);
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        } else {
            view.getLayoutParams().width = measuredWidth;
            view.getLayoutParams().height = measuredHeight;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 17;
        }
        view.invalidate();
    }

    public void setAdAlignment(EnumC3191a enumC3191a) {
        this.f17689E = enumC3191a;
    }

    public void setAdSize(int i, int i2) {
        HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.set_size, i, i2));
        this.f17538h.m14375b(i);
        this.f17538h.m14379c(i2);
    }

    public void setAutoRefresh(boolean z) {
        this.f17687C = z;
    }

    public void setAutoRefreshInterval(int i) {
        if (i > 0) {
            i = Math.max(10000, i);
        }
        this.f17693p = i;
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.set_period, this.f17693p));
        C3110c c3110c = this.mAdFetcher;
        if (c3110c != null) {
            c3110c.m14366a(this.f17693p);
        }
    }

    public void setExpandsToFitScreenWidth(boolean z) {
        this.f17697t = z;
    }

    public void setResizeAdToFitContainer(boolean z) {
        this.f17698u = z;
    }

    public void setScrollClick(View.OnTouchListener onTouchListener) {
        AdWebView adWebView = this.f17702y;
        if (adWebView != null) {
            adWebView.setOnTouchListener(onTouchListener);
        }
    }

    public void setShouldReloadOnResume(boolean z) {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.set_should_resume, z));
        this.f17695r = z;
    }

    public void setTransitionDirection(TransitionDirection transitionDirection) {
        this.f17700w.setTransitionDirection(transitionDirection);
    }

    public void setTransitionDuration(long j) {
        this.f17700w.setTransitionDuration(j);
    }

    public void setTransitionType(TransitionType transitionType) {
        this.f17700w.setTransitionType(transitionType);
    }
}
