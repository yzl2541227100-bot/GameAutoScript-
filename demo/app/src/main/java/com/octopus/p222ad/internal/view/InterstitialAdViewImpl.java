package com.octopus.p222ad.internal.view;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.C3110c;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.EnumC3119l;
import com.octopus.p222ad.internal.network.AsyncTaskC3126a;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class InterstitialAdViewImpl extends AdViewImpl {
    public static final String INTENT_KEY_CLOSE_BUTTON_DELAY = "CLOSE_BUTTON_DELAY";
    public static final String INTENT_KEY_TIME = "TIME";
    public static InterstitialAdViewImpl INTERSTITIALADVIEW_TO_USE = null;
    public static final long MAX_AGE = 270000;

    /* JADX INFO: renamed from: m */
    public boolean f17742m;

    /* JADX INFO: renamed from: n */
    public boolean f17743n;

    /* JADX INFO: renamed from: o */
    private int f17744o;

    /* JADX INFO: renamed from: p */
    private int f17745p;

    /* JADX INFO: renamed from: q */
    private boolean f17746q;

    /* JADX INFO: renamed from: r */
    private Queue<InterfaceC3196d> f17747r;

    /* JADX INFO: renamed from: s */
    private AdActivity.InterfaceC3053a f17748s;

    public InterstitialAdViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17744o = 0;
        this.f17745p = 10000;
        this.f17747r = new LinkedList();
        this.f17748s = null;
        this.f17742m = false;
        this.f17743n = false;
    }

    public InterstitialAdViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17744o = 0;
        this.f17745p = 10000;
        this.f17747r = new LinkedList();
        this.f17748s = null;
        this.f17742m = false;
        this.f17743n = false;
    }

    public InterstitialAdViewImpl(Context context, boolean z, boolean z3) {
        super(context);
        int iArgb = 0;
        this.f17744o = 0;
        this.f17745p = 10000;
        this.f17747r = new LinkedList();
        this.f17748s = null;
        this.f17742m = false;
        this.f17743n = false;
        this.f17540j = z;
        this.f17541k = z3;
        if (z) {
            iArgb = -16777216;
        } else if (!z3) {
            iArgb = Color.argb(51, 0, 0, 0);
        }
        this.f17744o = iArgb;
    }

    /* JADX INFO: renamed from: a */
    private boolean m14771a(long j) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC3196d> it = this.f17747r.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            InterfaceC3196d next = it.next();
            if (next != null && j - next.mo14774a() <= MAX_AGE && j - next.mo14774a() >= 0 && !next.mo14775b()) {
                z = true;
                break;
            }
            arrayList.add(next);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f17747r.remove((InterfaceC3196d) it2.next());
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    private boolean m14772b(InterfaceC3194b interfaceC3194b) {
        if (interfaceC3194b != null && !interfaceC3194b.failed()) {
            return true;
        }
        HaoboLog.m14609e(HaoboLog.baseLogTag, "Loaded an ad with an invalid displayable");
        return false;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: a */
    public void mo14688a(Context context, AttributeSet attributeSet) {
        super.mo14688a(context, attributeSet);
        this.mAdFetcher.m14366a(-1);
        this.f17538h.m14371a(EnumC3119l.INTERSTITIAL);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int top = displayMetrics.heightPixels;
        int i = displayMetrics.widthPixels;
        try {
            Activity activity = (Activity) context;
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
            top -= activity.getWindow().findViewById(R.id.content).getTop() + 0;
        } catch (ClassCastException unused) {
        }
        C3120m c3120mM14425a = C3120m.m14425a();
        int iM14447m = (int) ((top / c3120mM14425a.m14447m()) + 0.5f);
        this.f17538h.m14382d((int) ((i / c3120mM14425a.m14446l()) + 0.5f));
        this.f17538h.m14384e(iM14447m);
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: a */
    public void mo14689a(InterfaceC3194b interfaceC3194b) {
        if (!m14772b(interfaceC3194b)) {
            onAdFailedToLoad(AdRequest.INVALID_DISPLAY);
            return;
        }
        InterfaceC3194b interfaceC3194b2 = this.f17533c;
        if (interfaceC3194b2 != null) {
            interfaceC3194b2.destroy();
        }
        if (!this.f17742m && !this.f17743n) {
            this.f17533c = interfaceC3194b;
            this.f17747r.add(new C3195c(interfaceC3194b, Long.valueOf(System.currentTimeMillis()), false));
        } else if (interfaceC3194b != null) {
            interfaceC3194b.destroy();
        }
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public void activityOnDestroy() {
        this.f17742m = true;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public void activityOnPause() {
        this.f17743n = true;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public void activityOnResume() {
        this.f17743n = false;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: b */
    public void mo14694b(Context context, AttributeSet attributeSet) {
        String str;
        int i;
        boolean z;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3063R.styleable.AdView);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        HaoboLog.m14613v(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.found_n_in_xml, indexCount));
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C3063R.styleable.AdView_adSlotId) {
                setAdSlotId(typedArrayObtainStyledAttributes.getString(index));
                HaoboLog.m14607d(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.placement_id, typedArrayObtainStyledAttributes.getString(index)));
            } else {
                if (index == C3063R.styleable.AdView_test) {
                    C3120m.m14425a().f17182b = typedArrayObtainStyledAttributes.getBoolean(index, false);
                    str = HaoboLog.xmlLogTag;
                    i = C3063R.string.xml_set_test;
                    z = C3120m.m14425a().f17182b;
                } else if (index == C3063R.styleable.AdView_opens_native_browser) {
                    HaoboLog.m14607d(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.xml_set_opens_native_browser));
                    setOpensNativeBrowser(typedArrayObtainStyledAttributes.getBoolean(index, false));
                } else if (index == C3063R.styleable.AdView_show_loading_indicator) {
                    HaoboLog.m14607d(HaoboLog.xmlLogTag, HaoboLog.getString(C3063R.string.show_loading_indicator_xml));
                    setShowLoadingIndicator(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == C3063R.styleable.AdView_load_landing_page_in_background) {
                    setLoadsInBackground(typedArrayObtainStyledAttributes.getBoolean(index, true));
                    str = HaoboLog.xmlLogTag;
                    i = C3063R.string.xml_load_landing_page_in_background;
                    z = this.f17537g;
                }
                HaoboLog.m14607d(str, HaoboLog.getString(i, z));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.octopus.p222ad.AdLifeControl
    public void cancel() {
        C3110c c3110c = this.mAdFetcher;
        if (c3110c != null) {
            c3110c.m14365a();
        }
        INTERSTITIALADVIEW_TO_USE = null;
        this.f17747r.clear();
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: d */
    public boolean mo14696d() {
        return false;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, com.octopus.p222ad.AdLifeControl
    public void destroy() {
        super.destroy();
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.destroy_int));
        C3110c c3110c = this.mAdFetcher;
        if (c3110c != null) {
            c3110c.m14365a();
        }
        this.f17747r.clear();
        INTERSTITIALADVIEW_TO_USE = null;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: e */
    public boolean mo14697e() {
        return true;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    /* JADX INFO: renamed from: f */
    public void mo14698f() {
        AdActivity.InterfaceC3053a interfaceC3053a = this.f17748s;
        if (interfaceC3053a != null) {
            interfaceC3053a.mo13820d();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m14773g() {
        AdActivity.InterfaceC3053a interfaceC3053a = this.f17748s;
        if (interfaceC3053a != null) {
            interfaceC3053a.mo13821e();
        }
    }

    public AdActivity.InterfaceC3053a getAdImplementation() {
        return this.f17748s;
    }

    public Queue<InterfaceC3196d> getAdQueue() {
        return this.f17747r;
    }

    public int getBackgroundColor() {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.get_bg));
        return this.f17744o;
    }

    public int getCloseButtonDelay() {
        return this.f17745p;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public int getCreativeHeight() {
        return -1;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public int getCreativeWidth() {
        return -1;
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3073a
    public EnumC3119l getMediaType() {
        return EnumC3119l.INTERSTITIAL;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public boolean isLoaded() {
        return m14771a(System.currentTimeMillis());
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl
    public boolean loadAd(AsyncTaskC3126a.a aVar) {
        C3110c c3110c;
        getAdParameters().m14373a(false);
        this.f17539i = aVar;
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.load_ad_int));
        if (!isReadyToStart() || (c3110c = this.mAdFetcher) == null) {
            return false;
        }
        c3110c.m14365a();
        this.mAdFetcher.m14367b();
        this.loadCount = 1;
        this.clickCount = 0;
        return true;
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, com.octopus.p222ad.AdLifeControl
    public void onCreateLifeCycle() {
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, com.octopus.p222ad.AdLifeControl
    public void onDestroyLifeCycle() {
        C3110c c3110c = this.mAdFetcher;
        if (c3110c != null) {
            c3110c.m14365a();
        }
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, com.octopus.p222ad.AdLifeControl
    public void onPauseLifeCycle() {
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, com.octopus.p222ad.AdLifeControl
    public void onRestartLifeCycle() {
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, com.octopus.p222ad.AdLifeControl
    public void onResumeLifeCycle() {
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, com.octopus.p222ad.AdLifeControl
    public void onStartLifeCycle() {
    }

    @Override // com.octopus.p222ad.internal.view.AdViewImpl, com.octopus.p222ad.AdLifeControl
    public void onStopLifeCycle() {
    }

    public void setAdImplementation(AdActivity.InterfaceC3053a interfaceC3053a) {
        this.f17748s = interfaceC3053a;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.set_bg));
        this.f17744o = i;
    }

    public void setCloseButtonDelay(int i) {
        this.f17745p = Math.min(i, 10000);
    }

    public void setDismissOnClick(boolean z) {
        this.f17746q = z;
    }

    public boolean shouldDismissOnClick() {
        return this.f17746q;
    }

    public int show(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return this.f17747r.size();
        }
        HaoboLog.m14607d(HaoboLog.publicFunctionsLogTag, HaoboLog.getString(C3063R.string.show_int));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!m14771a(jCurrentTimeMillis) || this.f17742m) {
            HaoboLog.m14615w(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.empty_queue));
            return this.f17747r.size();
        }
        Class clsM13811a = AdActivity.m13811a();
        Intent intent = new Intent(activity, (Class<?>) clsM13811a);
        intent.putExtra("ACTIVITY_TYPE", "INTERSTITIAL");
        intent.putExtra(INTENT_KEY_TIME, jCurrentTimeMillis);
        intent.putExtra(INTENT_KEY_CLOSE_BUTTON_DELAY, this.f17745p);
        INTERSTITIALADVIEW_TO_USE = this;
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            INTERSTITIALADVIEW_TO_USE = null;
            HaoboLog.m14609e(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.adactivity_missing, clsM13811a.getName()));
        }
        return this.f17747r.size() - 1;
    }
}
