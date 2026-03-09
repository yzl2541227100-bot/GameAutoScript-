package com.anythink.expressad.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.anythink.expressad.splash.p153js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.p153js.SplashJsUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ATSplashView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public static final String f12791a = "webviewshow";

    /* JADX INFO: renamed from: b */
    public static final String f12792b = "updateCountdown";

    /* JADX INFO: renamed from: c */
    private static String f12793c = "ATSplashView";

    /* JADX INFO: renamed from: d */
    private int f12794d;

    /* JADX INFO: renamed from: e */
    private ATSplashWebview f12795e;

    /* JADX INFO: renamed from: f */
    private ViewGroup f12796f;

    /* JADX INFO: renamed from: g */
    private View f12797g;

    /* JADX INFO: renamed from: h */
    private View f12798h;

    /* JADX INFO: renamed from: i */
    private int f12799i;

    /* JADX INFO: renamed from: j */
    private boolean f12800j;

    /* JADX INFO: renamed from: k */
    private boolean f12801k;

    /* JADX INFO: renamed from: l */
    private ViewGroup f12802l;

    /* JADX INFO: renamed from: m */
    private boolean f12803m;

    /* JADX INFO: renamed from: n */
    private View f12804n;

    /* JADX INFO: renamed from: o */
    private boolean f12805o;

    /* JADX INFO: renamed from: p */
    private boolean f12806p;

    /* JADX INFO: renamed from: q */
    private RelativeLayout.LayoutParams f12807q;

    /* JADX INFO: renamed from: r */
    private SplashJSBridgeImpl f12808r;

    /* JADX INFO: renamed from: s */
    private boolean f12809s;

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashView$1 */
    public class RunnableC20161 implements Runnable {
        public RunnableC20161() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String unused = ATSplashView.f12793c;
                String string = "";
                try {
                    int[] iArr = new int[2];
                    ATSplashView.this.f12795e.getLocationOnScreen(iArr);
                    String unused2 = ATSplashView.f12793c;
                    StringBuilder sb = new StringBuilder("coordinate:");
                    sb.append(iArr[0]);
                    sb.append("--");
                    sb.append(iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", C1886t.m9821a(C1175n.m2059a().m2148f(), iArr[0]));
                    jSONObject.put("startY", C1886t.m9821a(C1175n.m2059a().m2148f(), iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    String unused3 = ATSplashView.f12793c;
                    th.getMessage();
                }
                int[] iArr2 = new int[2];
                ATSplashView.this.f12795e.getLocationInWindow(iArr2);
                ATSplashView.transInfoForMraid(ATSplashView.this.f12795e, iArr2[0], iArr2[1], ATSplashView.this.f12795e.getWidth(), ATSplashView.this.f12795e.getHeight());
                String strEncodeToString = Base64.encodeToString(string.toString().getBytes(), 2);
                C1469j.m5701a();
                C1469j.m5703a((WebView) ATSplashView.this.f12795e, "webviewshow", strEncodeToString);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ATSplashView(Context context) {
        this(context, null);
    }

    public ATSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12809s = false;
        m10800b();
    }

    /* JADX INFO: renamed from: b */
    private void m10800b() {
        setBackgroundColor(0);
        this.f12794d = getResources().getConfiguration().orientation;
        this.f12809s = false;
    }

    /* JADX INFO: renamed from: c */
    private void m10801c() {
        int i;
        View view;
        RelativeLayout.LayoutParams layoutParams;
        View view2;
        View view3;
        ViewGroup.LayoutParams layoutParams2;
        View view4;
        if (this.f12798h != null) {
            if (this.f12796f == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f12796f = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f12794d == 2) {
                this.f12799i = C1886t.m9847f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(0, this.f12796f.getId());
                if (!this.f12805o || (view3 = this.f12804n) == null) {
                    ATSplashWebview aTSplashWebview = this.f12795e;
                    if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                        addView(this.f12795e, layoutParams3);
                    }
                    m10802d();
                } else {
                    if (view3.getParent() != null) {
                        C1360x.m4265a(this.f12804n);
                    }
                    addView(this.f12804n, layoutParams3);
                }
                ViewGroup viewGroup = this.f12796f;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i2 = this.f12807q.width;
                    int i3 = this.f12799i;
                    if (i2 > i3 / 4) {
                        i2 = i3 / 4;
                    }
                    this.f12796f.addView(this.f12798h, i2, -1);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i2, -1);
                    layoutParams4.addRule(11);
                    i = 13;
                    layoutParams = layoutParams4;
                    layoutParams.addRule(i);
                    view2 = this.f12796f;
                    layoutParams2 = layoutParams;
                }
            } else {
                this.f12799i = C1886t.m9845e(getContext());
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams5.addRule(2, this.f12796f.getId());
                if (!this.f12805o || (view = this.f12804n) == null) {
                    ATSplashWebview aTSplashWebview2 = this.f12795e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f12795e, layoutParams5);
                    }
                    m10802d();
                } else {
                    if (view.getParent() != null) {
                        C1360x.m4265a(this.f12804n);
                    }
                    addView(this.f12804n, layoutParams5);
                }
                ViewGroup viewGroup2 = this.f12796f;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i4 = this.f12807q.height;
                    int i5 = this.f12799i;
                    if (i4 > i5 / 4) {
                        i4 = i5 / 4;
                    }
                    this.f12796f.addView(this.f12798h, -1, i4);
                    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, i4);
                    i = 12;
                    layoutParams = layoutParams6;
                    layoutParams.addRule(i);
                    view2 = this.f12796f;
                    layoutParams2 = layoutParams;
                }
            }
            addView(view2, layoutParams2);
        } else if (!this.f12805o || (view4 = this.f12804n) == null) {
            ATSplashWebview aTSplashWebview3 = this.f12795e;
            if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                addView(this.f12795e, new ViewGroup.LayoutParams(-1, -1));
            }
            m10802d();
        } else {
            if (view4.getParent() != null) {
                C1360x.m4265a(this.f12804n);
            }
            view2 = this.f12804n;
            layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
            addView(view2, layoutParams2);
        }
        View view5 = this.f12797g;
        if (view5 != null) {
            if (view5.getParent() != null) {
                bringChildToFront(this.f12797g);
                return;
            }
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 100.0f), C1886t.m9834b(getContext(), 30.0f));
            layoutParams7.addRule(10);
            layoutParams7.addRule(11);
            layoutParams7.rightMargin = C1886t.m9834b(getContext(), 10.0f);
            layoutParams7.topMargin = C1886t.m9834b(getContext(), 10.0f);
            addView(this.f12797g, layoutParams7);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m10802d() {
        ATSplashWebview aTSplashWebview = this.f12795e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(this.f12808r);
            this.f12795e.post(new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashView.1
                public RunnableC20161() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String unused = ATSplashView.f12793c;
                        String string = "";
                        try {
                            int[] iArr = new int[2];
                            ATSplashView.this.f12795e.getLocationOnScreen(iArr);
                            String unused2 = ATSplashView.f12793c;
                            StringBuilder sb = new StringBuilder("coordinate:");
                            sb.append(iArr[0]);
                            sb.append("--");
                            sb.append(iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", C1886t.m9821a(C1175n.m2059a().m2148f(), iArr[0]));
                            jSONObject.put("startY", C1886t.m9821a(C1175n.m2059a().m2148f(), iArr[1]));
                            string = jSONObject.toString();
                        } catch (Throwable th) {
                            String unused3 = ATSplashView.f12793c;
                            th.getMessage();
                        }
                        int[] iArr2 = new int[2];
                        ATSplashView.this.f12795e.getLocationInWindow(iArr2);
                        ATSplashView.transInfoForMraid(ATSplashView.this.f12795e, iArr2[0], iArr2[1], ATSplashView.this.f12795e.getWidth(), ATSplashView.this.f12795e.getHeight());
                        String strEncodeToString = Base64.encodeToString(string.toString().getBytes(), 2);
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) ATSplashView.this.f12795e, "webviewshow", strEncodeToString);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i2, int i3, int i4) {
        try {
            int i5 = C1175n.m2059a().m2148f().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i5 == 2 ? "landscape" : i5 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float fM9702e = C1877k.m9702e(C1175n.m2059a().m2148f());
            float fM9705f = C1877k.m9705f(C1175n.m2059a().m2148f());
            HashMap mapM9707g = C1877k.m9707g(C1175n.m2059a().m2148f());
            int iIntValue = ((Integer) mapM9707g.get("width")).intValue();
            int iIntValue2 = ((Integer) mapM9707g.get("height")).intValue();
            HashMap map = new HashMap();
            map.put(CallMraidJS.f6709a, "Interstitial");
            map.put("state", CallMraidJS.f6714f);
            map.put(CallMraidJS.f6711c, "true");
            map.put(CallMraidJS.f6712d, jSONObject);
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            CallMraidJS.getInstance().fireSetDefaultPosition(webView, f, f2, f3, f4);
            CallMraidJS.getInstance().fireSetCurrentPosition(webView, f, f2, f3, f4);
            CallMraidJS.getInstance().fireSetScreenSize(webView, fM9702e, fM9705f);
            CallMraidJS.getInstance().fireSetMaxSize(webView, iIntValue, iIntValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(webView, map);
            CallMraidJS.getInstance().fireReadyEvent(webView);
        } catch (Throwable unused) {
        }
    }

    public void changeCloseBtnState(int i) {
        View view = this.f12797g;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void checkSkipViewLocation() {
        if (this.f12809s) {
            return;
        }
        try {
            View view = this.f12797g;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    int i = ((RelativeLayout.LayoutParams) layoutParams).topMargin;
                    int iM4165b = C1345i.m4165b(getContext()) + i;
                    if (i > 0) {
                        this.f12809s = true;
                    }
                    int[] iArr = new int[2];
                    this.f12797g.getLocationOnScreen(iArr);
                    if (iArr[1] < iM4165b) {
                        ((RelativeLayout.LayoutParams) layoutParams).topMargin = i + (iM4165b - iArr[1]);
                        this.f12797g.setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearResState() {
        this.f12803m = false;
        this.f12801k = false;
        this.f12800j = false;
    }

    public void destroy() {
        ATSplashWebview aTSplashWebview = this.f12795e;
        if (aTSplashWebview == null || aTSplashWebview.isDestroyed()) {
            return;
        }
        this.f12795e.release();
        SplashJsUtils.sendEventToH5(this.f12795e, "onSystemDestory", "");
    }

    public View getCloseView() {
        return this.f12797g;
    }

    public ViewGroup getDevContainer() {
        return this.f12802l;
    }

    public View getIconVg() {
        return this.f12798h;
    }

    public SplashJSBridgeImpl getSplashJSBridgeImpl() {
        return this.f12808r;
    }

    public ATSplashWebview getSplashWebview() {
        return this.f12795e;
    }

    public boolean isAttach() {
        return this.f12806p;
    }

    public boolean isDynamicView() {
        return this.f12805o;
    }

    public boolean isH5Ready() {
        return this.f12800j;
    }

    public boolean isImageReady() {
        return this.f12803m;
    }

    public boolean isVideoReady() {
        return this.f12801k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12806p = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m10800b();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkSkipViewLocation();
    }

    public void onPause() {
        View view = this.f12804n;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f12804n;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f12801k = false;
        this.f12800j = false;
    }

    public void setCloseView(View view) {
        this.f12797g = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f12802l = viewGroup;
    }

    public void setDynamicView(boolean z) {
        this.f12805o = z;
    }

    public void setH5Ready(boolean z) {
        this.f12800j = z;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f12798h = view;
        this.f12807q = layoutParams;
    }

    public void setImageReady(boolean z) {
        this.f12803m = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        View view = this.f12804n;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setNotchPadding(i, i2, i3, i4);
    }

    public void setSplashJSBridgeImpl(SplashJSBridgeImpl splashJSBridgeImpl) {
        this.f12808r = splashJSBridgeImpl;
        ATSplashWebview aTSplashWebview = this.f12795e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f12804n = view;
        }
    }

    public void setSplashWebview(ATSplashWebview aTSplashWebview) {
        this.f12795e = aTSplashWebview;
        SplashJSBridgeImpl splashJSBridgeImpl = this.f12808r;
        if (splashJSBridgeImpl != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setVideoReady(boolean z) {
        this.f12801k = z;
    }

    public void show() {
        int i;
        View view;
        RelativeLayout.LayoutParams layoutParams;
        View view2;
        View view3;
        ViewGroup.LayoutParams layoutParams2;
        View view4;
        ViewGroup viewGroup;
        if (this.f12808r != null && (viewGroup = this.f12802l) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f12808r.updateContext(this.f12802l.getContext());
        }
        if (this.f12798h != null) {
            if (this.f12796f == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f12796f = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f12794d == 2) {
                this.f12799i = C1886t.m9847f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(0, this.f12796f.getId());
                if (!this.f12805o || (view3 = this.f12804n) == null) {
                    ATSplashWebview aTSplashWebview = this.f12795e;
                    if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                        addView(this.f12795e, layoutParams3);
                    }
                    m10802d();
                } else {
                    if (view3.getParent() != null) {
                        C1360x.m4265a(this.f12804n);
                    }
                    addView(this.f12804n, layoutParams3);
                }
                ViewGroup viewGroup2 = this.f12796f;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i2 = this.f12807q.width;
                    int i3 = this.f12799i;
                    if (i2 > i3 / 4) {
                        i2 = i3 / 4;
                    }
                    this.f12796f.addView(this.f12798h, i2, -1);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i2, -1);
                    layoutParams4.addRule(11);
                    i = 13;
                    layoutParams = layoutParams4;
                    layoutParams.addRule(i);
                    view2 = this.f12796f;
                    layoutParams2 = layoutParams;
                }
            } else {
                this.f12799i = C1886t.m9845e(getContext());
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams5.addRule(2, this.f12796f.getId());
                if (!this.f12805o || (view = this.f12804n) == null) {
                    ATSplashWebview aTSplashWebview2 = this.f12795e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f12795e, layoutParams5);
                    }
                    m10802d();
                } else {
                    if (view.getParent() != null) {
                        C1360x.m4265a(this.f12804n);
                    }
                    addView(this.f12804n, layoutParams5);
                }
                ViewGroup viewGroup3 = this.f12796f;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i4 = this.f12807q.height;
                    int i5 = this.f12799i;
                    if (i4 > i5 / 4) {
                        i4 = i5 / 4;
                    }
                    this.f12796f.addView(this.f12798h, -1, i4);
                    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, i4);
                    i = 12;
                    layoutParams = layoutParams6;
                    layoutParams.addRule(i);
                    view2 = this.f12796f;
                    layoutParams2 = layoutParams;
                }
            }
            addView(view2, layoutParams2);
        } else if (!this.f12805o || (view4 = this.f12804n) == null) {
            ATSplashWebview aTSplashWebview3 = this.f12795e;
            if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                addView(this.f12795e, new ViewGroup.LayoutParams(-1, -1));
            }
            m10802d();
        } else {
            if (view4.getParent() != null) {
                C1360x.m4265a(this.f12804n);
            }
            view2 = this.f12804n;
            layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
            addView(view2, layoutParams2);
        }
        View view5 = this.f12797g;
        if (view5 != null) {
            if (view5.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 100.0f), C1886t.m9834b(getContext(), 30.0f));
                layoutParams7.addRule(10);
                layoutParams7.addRule(11);
                layoutParams7.rightMargin = C1886t.m9834b(getContext(), 10.0f);
                layoutParams7.topMargin = C1886t.m9834b(getContext(), 10.0f);
                addView(this.f12797g, layoutParams7);
            } else {
                bringChildToFront(this.f12797g);
            }
        }
        clearResState();
    }

    public void updateCountdown(int i) {
        View view;
        if (this.f12795e != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C1485b.f7175dk, i);
                String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                C1469j.m5701a();
                C1469j.m5703a((WebView) this.f12795e, f12792b, strEncodeToString);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (this.f12805o && (view = this.f12804n) != null && (view instanceof ATSplashNativeView)) {
                ((ATSplashNativeView) view).updateCountDown(i);
            }
        }
    }
}
