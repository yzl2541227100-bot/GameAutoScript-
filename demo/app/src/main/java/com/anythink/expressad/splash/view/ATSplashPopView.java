package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1880n;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.splash.p152d.C1991d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ATSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* JADX INFO: renamed from: c */
    private static final String f12759c = "ATSplashPopView";

    /* JADX INFO: renamed from: d */
    private static final AtomicInteger f12760d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public View.OnClickListener f12761a;

    /* JADX INFO: renamed from: b */
    public View.OnClickListener f12762b;

    /* JADX INFO: renamed from: e */
    private String f12763e;

    /* JADX INFO: renamed from: f */
    private String f12764f;

    /* JADX INFO: renamed from: g */
    private int f12765g;

    /* JADX INFO: renamed from: h */
    private C1781c f12766h;

    /* JADX INFO: renamed from: i */
    private C1991d f12767i;

    /* JADX INFO: renamed from: j */
    private ImageView f12768j;

    /* JADX INFO: renamed from: k */
    private ImageView f12769k;

    /* JADX INFO: renamed from: l */
    private ImageView f12770l;

    /* JADX INFO: renamed from: m */
    private ImageView f12771m;

    /* JADX INFO: renamed from: n */
    private TextView f12772n;

    /* JADX INFO: renamed from: o */
    private TextView f12773o;

    /* JADX INFO: renamed from: p */
    private TextView f12774p;

    /* JADX INFO: renamed from: q */
    private int f12775q;

    /* JADX INFO: renamed from: r */
    private Handler f12776r;

    /* JADX INFO: renamed from: s */
    private boolean f12777s;

    /* JADX INFO: renamed from: t */
    private C1405a f12778t;

    /* JADX INFO: renamed from: u */
    private Runnable f12779u;

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashPopView$1 */
    public class C20081 implements InterfaceC1819c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f12780a;

        public C20081(boolean z) {
            z = z;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapM9755a = z ? C1880n.m9755a(bitmap) : C1880n.m9756a(bitmap, 16);
                ImageView imageView = ATSplashPopView.this.f12768j;
                if (bitmapM9755a != null) {
                    bitmap = bitmapM9755a;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashPopView$2 */
    public class C20092 implements InterfaceC1819c {
        public C20092() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashPopView$3 */
    public class C20103 implements InterfaceC1819c {
        public C20103() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                ATSplashPopView.this.f12769k.setImageBitmap(C1880n.m9756a(bitmap, 16));
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashPopView$4 */
    public class RunnableC20114 implements Runnable {
        public RunnableC20114() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ATSplashPopView.this.f12774p != null) {
                if (ATSplashPopView.this.f12775q != 0) {
                    ATSplashPopView.m10788j(ATSplashPopView.this);
                    ATSplashPopView.this.f12774p.setText(String.valueOf(ATSplashPopView.this.f12775q));
                    ATSplashPopView.this.f12776r.postDelayed(ATSplashPopView.this.f12779u, 1000L);
                } else {
                    ATSplashPopView.m10780e(ATSplashPopView.this);
                    ATSplashPopView.this.m10785g();
                    ATSplashPopView.this.f12776r.removeCallbacks(ATSplashPopView.this.f12779u);
                    if (ATSplashPopView.this.f12767i != null) {
                        ATSplashPopView.this.f12767i.mo10542a(5);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashPopView$5 */
    public class ViewOnClickListenerC20125 implements View.OnClickListener {
        public ViewOnClickListenerC20125() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ATSplashPopView.this.f12767i != null) {
                ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                ATSplashPopView.m10769a(aTSplashPopView, aTSplashPopView.f12766h);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashPopView$6 */
    public class ViewOnClickListenerC20136 implements View.OnClickListener {
        public ViewOnClickListenerC20136() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ATSplashPopView.this.f12775q <= 0 && ATSplashPopView.this.f12767i != null) {
                ATSplashPopView.this.f12767i.mo10542a(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashPopView$a */
    public static class C2014a {

        /* JADX INFO: renamed from: a */
        private String f12787a;

        /* JADX INFO: renamed from: b */
        private String f12788b;

        /* JADX INFO: renamed from: c */
        private int f12789c;

        /* JADX INFO: renamed from: d */
        private C1781c f12790d;

        public C2014a(String str, String str2, int i, C1781c c1781c) {
            this.f12787a = str;
            this.f12788b = str2;
            this.f12789c = i;
            this.f12790d = c1781c;
        }

        /* JADX INFO: renamed from: a */
        private void m10790a(int i) {
            this.f12789c = i;
        }

        /* JADX INFO: renamed from: a */
        private void m10791a(C1781c c1781c) {
            this.f12790d = c1781c;
        }

        /* JADX INFO: renamed from: a */
        private void m10792a(String str) {
            this.f12787a = str;
        }

        /* JADX INFO: renamed from: b */
        private void m10793b(String str) {
            this.f12788b = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m10794a() {
            return this.f12787a;
        }

        /* JADX INFO: renamed from: b */
        public final String m10795b() {
            return this.f12788b;
        }

        /* JADX INFO: renamed from: c */
        public final int m10796c() {
            return this.f12789c;
        }

        /* JADX INFO: renamed from: d */
        public final C1781c m10797d() {
            return this.f12790d;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashPopView$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC2015b {
    }

    public ATSplashPopView(Context context) {
        super(context);
        this.f12765g = 1;
        this.f12775q = -1;
        this.f12776r = new Handler();
        this.f12777s = false;
        this.f12779u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            public RunnableC20114() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f12774p != null) {
                    if (ATSplashPopView.this.f12775q != 0) {
                        ATSplashPopView.m10788j(ATSplashPopView.this);
                        ATSplashPopView.this.f12774p.setText(String.valueOf(ATSplashPopView.this.f12775q));
                        ATSplashPopView.this.f12776r.postDelayed(ATSplashPopView.this.f12779u, 1000L);
                    } else {
                        ATSplashPopView.m10780e(ATSplashPopView.this);
                        ATSplashPopView.this.m10785g();
                        ATSplashPopView.this.f12776r.removeCallbacks(ATSplashPopView.this.f12779u);
                        if (ATSplashPopView.this.f12767i != null) {
                            ATSplashPopView.this.f12767i.mo10542a(5);
                        }
                    }
                }
            }
        };
        this.f12761a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            public ViewOnClickListenerC20125() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.m10769a(aTSplashPopView, aTSplashPopView.f12766h);
                }
            }
        };
        this.f12762b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            public ViewOnClickListenerC20136() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12775q <= 0 && ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView.this.f12767i.mo10542a(4);
                }
            }
        };
        this.f12765g = 1;
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12765g = 1;
        this.f12775q = -1;
        this.f12776r = new Handler();
        this.f12777s = false;
        this.f12779u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            public RunnableC20114() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f12774p != null) {
                    if (ATSplashPopView.this.f12775q != 0) {
                        ATSplashPopView.m10788j(ATSplashPopView.this);
                        ATSplashPopView.this.f12774p.setText(String.valueOf(ATSplashPopView.this.f12775q));
                        ATSplashPopView.this.f12776r.postDelayed(ATSplashPopView.this.f12779u, 1000L);
                    } else {
                        ATSplashPopView.m10780e(ATSplashPopView.this);
                        ATSplashPopView.this.m10785g();
                        ATSplashPopView.this.f12776r.removeCallbacks(ATSplashPopView.this.f12779u);
                        if (ATSplashPopView.this.f12767i != null) {
                            ATSplashPopView.this.f12767i.mo10542a(5);
                        }
                    }
                }
            }
        };
        this.f12761a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            public ViewOnClickListenerC20125() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.m10769a(aTSplashPopView, aTSplashPopView.f12766h);
                }
            }
        };
        this.f12762b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            public ViewOnClickListenerC20136() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12775q <= 0 && ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView.this.f12767i.mo10542a(4);
                }
            }
        };
        this.f12765g = 1;
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12765g = 1;
        this.f12775q = -1;
        this.f12776r = new Handler();
        this.f12777s = false;
        this.f12779u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            public RunnableC20114() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f12774p != null) {
                    if (ATSplashPopView.this.f12775q != 0) {
                        ATSplashPopView.m10788j(ATSplashPopView.this);
                        ATSplashPopView.this.f12774p.setText(String.valueOf(ATSplashPopView.this.f12775q));
                        ATSplashPopView.this.f12776r.postDelayed(ATSplashPopView.this.f12779u, 1000L);
                    } else {
                        ATSplashPopView.m10780e(ATSplashPopView.this);
                        ATSplashPopView.this.m10785g();
                        ATSplashPopView.this.f12776r.removeCallbacks(ATSplashPopView.this.f12779u);
                        if (ATSplashPopView.this.f12767i != null) {
                            ATSplashPopView.this.f12767i.mo10542a(5);
                        }
                    }
                }
            }
        };
        this.f12761a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            public ViewOnClickListenerC20125() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.m10769a(aTSplashPopView, aTSplashPopView.f12766h);
                }
            }
        };
        this.f12762b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            public ViewOnClickListenerC20136() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12775q <= 0 && ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView.this.f12767i.mo10542a(4);
                }
            }
        };
        this.f12765g = 1;
    }

    @RequiresApi(api = 21)
    public ATSplashPopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12765g = 1;
        this.f12775q = -1;
        this.f12776r = new Handler();
        this.f12777s = false;
        this.f12779u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            public RunnableC20114() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f12774p != null) {
                    if (ATSplashPopView.this.f12775q != 0) {
                        ATSplashPopView.m10788j(ATSplashPopView.this);
                        ATSplashPopView.this.f12774p.setText(String.valueOf(ATSplashPopView.this.f12775q));
                        ATSplashPopView.this.f12776r.postDelayed(ATSplashPopView.this.f12779u, 1000L);
                    } else {
                        ATSplashPopView.m10780e(ATSplashPopView.this);
                        ATSplashPopView.this.m10785g();
                        ATSplashPopView.this.f12776r.removeCallbacks(ATSplashPopView.this.f12779u);
                        if (ATSplashPopView.this.f12767i != null) {
                            ATSplashPopView.this.f12767i.mo10542a(5);
                        }
                    }
                }
            }
        };
        this.f12761a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            public ViewOnClickListenerC20125() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.m10769a(aTSplashPopView, aTSplashPopView.f12766h);
                }
            }
        };
        this.f12762b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            public ViewOnClickListenerC20136() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12775q <= 0 && ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView.this.f12767i.mo10542a(4);
                }
            }
        };
        this.f12765g = 1;
    }

    public ATSplashPopView(Context context, C2014a c2014a, C1991d c1991d) {
        super(context);
        this.f12765g = 1;
        this.f12775q = -1;
        this.f12776r = new Handler();
        this.f12777s = false;
        this.f12779u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            public RunnableC20114() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.f12774p != null) {
                    if (ATSplashPopView.this.f12775q != 0) {
                        ATSplashPopView.m10788j(ATSplashPopView.this);
                        ATSplashPopView.this.f12774p.setText(String.valueOf(ATSplashPopView.this.f12775q));
                        ATSplashPopView.this.f12776r.postDelayed(ATSplashPopView.this.f12779u, 1000L);
                    } else {
                        ATSplashPopView.m10780e(ATSplashPopView.this);
                        ATSplashPopView.this.m10785g();
                        ATSplashPopView.this.f12776r.removeCallbacks(ATSplashPopView.this.f12779u);
                        if (ATSplashPopView.this.f12767i != null) {
                            ATSplashPopView.this.f12767i.mo10542a(5);
                        }
                    }
                }
            }
        };
        this.f12761a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            public ViewOnClickListenerC20125() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.m10769a(aTSplashPopView, aTSplashPopView.f12766h);
                }
            }
        };
        this.f12762b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            public ViewOnClickListenerC20136() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.f12775q <= 0 && ATSplashPopView.this.f12767i != null) {
                    ATSplashPopView.this.f12767i.mo10542a(4);
                }
            }
        };
        if (c2014a == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f12764f = c2014a.m10795b();
        this.f12763e = c2014a.m10794a();
        this.f12765g = c2014a.m10796c();
        this.f12766h = c2014a.m10797d();
        this.f12767i = c1991d;
        m10767a();
    }

    /* JADX INFO: renamed from: a */
    private void m10767a() {
        if (this.f12766h == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i = this.f12765g;
        if (i == 1) {
            m10773b();
            return;
        }
        if (i == 2) {
            m10777c();
        } else if (i == 3) {
            m10779d();
        } else {
            if (i != 4) {
                return;
            }
            m10781e();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10768a(C1781c c1781c) {
        C1991d c1991d = this.f12767i;
        if (c1991d != null) {
            c1991d.mo10543a(c1781c);
            this.f12767i.mo10542a(6);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10769a(ATSplashPopView aTSplashPopView, C1781c c1781c) {
        C1991d c1991d = aTSplashPopView.f12767i;
        if (c1991d != null) {
            c1991d.mo10543a(c1781c);
            aTSplashPopView.f12767i.mo10542a(6);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10770a(String str) {
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(str, new InterfaceC1819c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.2
            public C20092() {
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5462a(Bitmap bitmap, String str2) {
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5463a(String str2, String str22) {
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m10771a(String str, boolean z) {
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(str, new InterfaceC1819c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f12780a;

            public C20081(boolean z3) {
                z = z3;
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5462a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    Bitmap bitmapM9755a = z ? C1880n.m9755a(bitmap) : C1880n.m9756a(bitmap, 16);
                    ImageView imageView = ATSplashPopView.this.f12768j;
                    if (bitmapM9755a != null) {
                        bitmap = bitmapM9755a;
                    }
                    imageView.setImageBitmap(bitmap);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5463a(String str2, String str22) {
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m10773b() {
        ImageView imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 80.0f), C1886t.m9834b(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = C1886t.m9834b(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(C1875i.m9684a(getContext(), "anythink_splash_popview_default", C1875i.f11528c));
        this.f12768j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 60.0f), C1886t.m9834b(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = C1886t.m9834b(getContext(), 7.0f);
        layoutParams2.leftMargin = C1886t.m9834b(getContext(), 10.0f);
        this.f12768j.setId(generateViewId());
        this.f12768j.setLayoutParams(layoutParams2);
        this.f12768j.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C1781c c1781c = this.f12766h;
        if (c1781c != null && !TextUtils.isEmpty(c1781c.m10150bd())) {
            m10771a(this.f12766h.m10150bd(), true);
        }
        this.f12774p = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = C1886t.m9834b(getContext(), 62.0f);
        layoutParams3.bottomMargin = C1886t.m9834b(getContext(), 70.0f);
        this.f12774p.setId(generateViewId());
        this.f12774p.setTextSize(10.0f);
        this.f12774p.setTextColor(-1);
        this.f12774p.setGravity(17);
        this.f12774p.setMinWidth(C1886t.m9834b(getContext(), 16.0f));
        this.f12774p.setMaxHeight(C1886t.m9834b(getContext(), 16.0f));
        this.f12774p.setLayoutParams(layoutParams3);
        this.f12774p.setBackgroundResource(C1875i.m9684a(getContext(), "anythink_cm_circle_50black", C1875i.f11528c));
        addView(imageView);
        addView(this.f12774p);
        addView(this.f12768j);
        C1781c c1781c2 = this.f12766h;
        if (c1781c2 != null && c1781c2.m8911u() <= 0) {
            m10785g();
        }
        setOnClickListener(this.f12761a);
        this.f12774p.setOnClickListener(this.f12762b);
    }

    /* JADX INFO: renamed from: b */
    private void m10774b(C1781c c1781c) {
        C1991d c1991d = this.f12767i;
        if (c1991d != null) {
            c1991d.mo10543a(c1781c);
            this.f12767i.mo10542a(6);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10775b(String str) {
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(str, new InterfaceC1819c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.3
            public C20103() {
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5462a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    ATSplashPopView.this.f12769k.setImageBitmap(C1880n.m9756a(bitmap, 16));
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5463a(String str2, String str22) {
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private void m10777c() {
        int iM9834b = C1886t.m9834b(getContext(), 4.0f);
        this.f12768j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 28.0f), C1886t.m9834b(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f12768j.setId(generateViewId());
        this.f12768j.setLayoutParams(layoutParams);
        this.f12768j.setPadding(iM9834b, iM9834b, iM9834b, iM9834b);
        this.f12768j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        m10771a(this.f12766h.m10150bd(), false);
        TextView textView = new TextView(getContext());
        this.f12772n = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f12768j.getId());
        layoutParams2.addRule(6, this.f12768j.getId());
        layoutParams2.addRule(8, this.f12768j.getId());
        layoutParams2.leftMargin = C1886t.m9834b(getContext(), 4.0f);
        layoutParams2.rightMargin = C1886t.m9834b(getContext(), 40.0f);
        this.f12772n.setLayoutParams(layoutParams2);
        this.f12772n.setGravity(16);
        this.f12772n.setTextSize(10.0f);
        this.f12772n.setSelected(true);
        this.f12772n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f12772n.setMarqueeRepeatLimit(-1);
        this.f12772n.setSingleLine(true);
        this.f12772n.setTextColor(-16777216);
        this.f12772n.setText(this.f12766h.m10148bb());
        setBackgroundResource(C1875i.m9684a(getContext(), "anythink_shape_corners_bg", C1875i.f11528c));
        addView(this.f12768j);
        addView(this.f12772n);
        m10782f();
        setOnClickListener(this.f12761a);
    }

    /* JADX INFO: renamed from: d */
    private void m10779d() {
        int iM9834b = C1886t.m9834b(getContext(), 4.0f);
        this.f12768j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 50.0f), C1886t.m9834b(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f12768j.setId(generateViewId());
        this.f12768j.setLayoutParams(layoutParams);
        this.f12768j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f12768j.setPadding(iM9834b, iM9834b, iM9834b, iM9834b);
        m10771a(this.f12766h.m10150bd(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f12768j.getId());
        layoutParams2.addRule(6, this.f12768j.getId());
        layoutParams2.addRule(8, this.f12768j.getId());
        layoutParams2.leftMargin = C1886t.m9834b(getContext(), 8.0f);
        layoutParams2.rightMargin = C1886t.m9834b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f12772n = textView;
        textView.setId(generateViewId());
        this.f12772n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f12772n.setGravity(16);
        this.f12772n.setTextSize(12.0f);
        this.f12772n.setSelected(true);
        this.f12772n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f12772n.setMarqueeRepeatLimit(-1);
        this.f12772n.setSingleLine(true);
        this.f12772n.setTextColor(-16777216);
        this.f12772n.setText(this.f12766h.m10148bb());
        TextView textView2 = new TextView(getContext());
        this.f12773o = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f12772n.getId());
        layoutParams3.addRule(3, this.f12772n.getId());
        layoutParams3.topMargin = C1886t.m9834b(getContext(), 4.0f);
        layoutParams3.rightMargin = C1886t.m9834b(getContext(), 36.0f);
        this.f12773o.setGravity(16);
        this.f12773o.setLayoutParams(layoutParams3);
        this.f12773o.setTextSize(8.0f);
        this.f12773o.setTextColor(-10066330);
        this.f12773o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f12773o.setMarqueeRepeatLimit(-1);
        this.f12773o.setSelected(true);
        this.f12773o.setSingleLine(true);
        this.f12773o.setText(this.f12766h.m10149bc());
        relativeLayout.addView(this.f12772n);
        relativeLayout.addView(this.f12773o);
        setBackgroundResource(C1875i.m9684a(getContext(), "anythink_shape_corners_bg", C1875i.f11528c));
        addView(this.f12768j);
        addView(relativeLayout);
        m10782f();
        setOnClickListener(this.f12761a);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m10780e(ATSplashPopView aTSplashPopView) {
        aTSplashPopView.f12775q = -1;
        return -1;
    }

    /* JADX INFO: renamed from: e */
    private void m10781e() {
        this.f12770l = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1886t.m9834b(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f12770l.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f12770l.setId(generateViewId());
        this.f12770l.setLayoutParams(layoutParams);
        m10770a(this.f12766h.m10151be());
        this.f12769k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, C1886t.m9834b(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f12769k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f12769k.setId(generateViewId());
        this.f12769k.setLayoutParams(layoutParams2);
        m10775b(this.f12766h.m10151be());
        this.f12768j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 50.0f), C1886t.m9834b(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f12770l.getId());
        layoutParams3.topMargin = 20;
        this.f12768j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f12768j.setId(generateViewId());
        this.f12768j.setLayoutParams(layoutParams3);
        m10771a(this.f12766h.m10150bd(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f12768j.getId());
        layoutParams4.addRule(6, this.f12768j.getId());
        layoutParams4.addRule(8, this.f12768j.getId());
        layoutParams4.leftMargin = C1886t.m9834b(getContext(), 8.0f);
        layoutParams4.rightMargin = C1886t.m9834b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f12772n = textView;
        textView.setId(generateViewId());
        this.f12772n.setGravity(16);
        this.f12772n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f12772n.setTextSize(12.0f);
        this.f12772n.setTextColor(-16777216);
        this.f12772n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f12772n.setMarqueeRepeatLimit(-1);
        this.f12772n.setSelected(true);
        this.f12772n.setSingleLine(true);
        this.f12772n.setText(this.f12766h.m10148bb());
        TextView textView2 = new TextView(getContext());
        this.f12773o = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f12772n.getId());
        layoutParams5.addRule(3, this.f12772n.getId());
        layoutParams5.topMargin = C1886t.m9834b(getContext(), 4.0f);
        layoutParams5.rightMargin = C1886t.m9834b(getContext(), 36.0f);
        this.f12773o.setGravity(16);
        this.f12773o.setLayoutParams(layoutParams5);
        this.f12773o.setTextSize(8.0f);
        this.f12773o.setTextColor(-10066330);
        this.f12773o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f12773o.setMarqueeRepeatLimit(-1);
        this.f12773o.setSelected(true);
        this.f12773o.setSingleLine(true);
        this.f12773o.setText(this.f12766h.m10149bc());
        relativeLayout.addView(this.f12772n);
        relativeLayout.addView(this.f12773o);
        addView(this.f12770l);
        addView(this.f12769k);
        addView(this.f12768j);
        addView(relativeLayout);
        m10782f();
        setOnClickListener(this.f12761a);
    }

    /* JADX INFO: renamed from: f */
    private void m10782f() {
        String language;
        Context context;
        String str;
        this.f12771m = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 32.0f), C1886t.m9834b(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f12768j.getId());
        this.f12771m.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            th.getMessage();
            language = "ZH";
        }
        if (language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) {
            context = getContext();
            str = "anythink_splash_ad";
        } else {
            context = getContext();
            str = "anythink_splash_ad_en";
        }
        this.f12771m.setBackgroundResource(C1875i.m9684a(context, str, C1875i.f11528c));
        addView(this.f12771m);
    }

    /* JADX INFO: renamed from: g */
    public void m10785g() {
        TextView textView = this.f12774p;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C1886t.m9834b(getContext(), 16.0f);
            layoutParams.height = C1886t.m9834b(getContext(), 16.0f);
            this.f12774p.setLayoutParams(layoutParams);
            this.f12774p.setText("");
            this.f12774p.setBackgroundResource(C1875i.m9684a(getContext(), "anythink_splash_popview_close", C1875i.f11528c));
        }
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = f12760d;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m10788j(ATSplashPopView aTSplashPopView) {
        int i = aTSplashPopView.f12775q;
        aTSplashPopView.f12775q = i - 1;
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12767i != null) {
            getWidth();
            getHeight();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f12777s = true;
        if (this.f12774p != null) {
            this.f12776r.removeCallbacks(this.f12779u);
        }
    }

    public void reStartCountDown() {
        if (this.f12777s) {
            this.f12777s = false;
            int i = this.f12775q;
            if (i == -1 || i == 0) {
                m10785g();
                return;
            }
            TextView textView = this.f12774p;
            if (textView != null) {
                textView.setText(String.valueOf(i));
                this.f12776r.postDelayed(this.f12779u, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f12776r.removeCallbacks(this.f12779u);
            this.f12779u = null;
            detachAllViewsFromParent();
            this.f12766h = null;
            this.f12767i = null;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setPopViewType(C2014a c2014a, C1991d c1991d) {
        if (c2014a == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f12764f = c2014a.m10795b();
        this.f12763e = c2014a.m10794a();
        this.f12765g = c2014a.m10796c();
        this.f12766h = c2014a.m10797d();
        this.f12767i = c1991d;
        m10767a();
    }

    public void startCountDown() {
        this.f12776r.removeCallbacks(this.f12779u);
        C1781c c1781c = this.f12766h;
        if (c1781c == null || this.f12765g != 1) {
            return;
        }
        int iM8911u = c1781c.m8911u();
        if (iM8911u <= 0) {
            m10785g();
            return;
        }
        this.f12775q = iM8911u;
        TextView textView = this.f12774p;
        if (textView != null) {
            textView.setText(String.valueOf(iM8911u));
            this.f12776r.postDelayed(this.f12779u, 1000L);
        }
    }
}
