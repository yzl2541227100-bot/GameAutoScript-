package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.advanced.p079d.C1431c;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ATNativeAdvancedView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public static final String f6634a = "webviewshow";

    /* JADX INFO: renamed from: b */
    private static String f6635b = "ATNativeAdvancedView";

    /* JADX INFO: renamed from: c */
    private ATNativeAdvancedWebview f6636c;

    /* JADX INFO: renamed from: d */
    private View f6637d;

    /* JADX INFO: renamed from: e */
    private boolean f6638e;

    /* JADX INFO: renamed from: f */
    private boolean f6639f;

    /* JADX INFO: renamed from: g */
    private boolean f6640g;

    /* JADX INFO: renamed from: h */
    private C1431c f6641h;

    /* JADX INFO: renamed from: i */
    private NativeAdvancedJSBridgeImpl f6642i;

    /* JADX INFO: renamed from: j */
    private Context f6643j;

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.view.ATNativeAdvancedView$1 */
    public class RunnableC14381 implements Runnable {
        public RunnableC14381() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String unused = ATNativeAdvancedView.f6635b;
                String string = "";
                try {
                    int[] iArr = new int[2];
                    ATNativeAdvancedView.this.f6636c.getLocationOnScreen(iArr);
                    String unused2 = ATNativeAdvancedView.f6635b;
                    StringBuilder sb = new StringBuilder("coordinate:");
                    sb.append(iArr[0]);
                    sb.append("--");
                    sb.append(iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", C1886t.m9821a(C1175n.m2059a().m2148f(), iArr[0]));
                    jSONObject.put("startY", C1886t.m9821a(C1175n.m2059a().m2148f(), iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    String unused3 = ATNativeAdvancedView.f6635b;
                    th.getMessage();
                }
                String strEncodeToString = Base64.encodeToString(string.toString().getBytes(), 2);
                C1469j.m5701a();
                C1469j.m5703a((WebView) ATNativeAdvancedView.this.f6636c, "webviewshow", strEncodeToString);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ATNativeAdvancedView(Context context) {
        this(context, null);
    }

    public ATNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATNativeAdvancedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6643j = context;
    }

    /* JADX INFO: renamed from: b */
    private void m5566b() {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6636c;
        if (aTNativeAdvancedWebview != null && aTNativeAdvancedWebview.getParent() == null) {
            addView(this.f6636c, new ViewGroup.LayoutParams(-1, -1));
        }
        int[] iArr = new int[2];
        this.f6636c.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6636c;
        transInfoForMraid(aTNativeAdvancedWebview2, iArr[0], iArr[1], aTNativeAdvancedWebview2.getWidth(), this.f6636c.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview3 = this.f6636c;
        if (aTNativeAdvancedWebview3 != null) {
            aTNativeAdvancedWebview3.setObject(this.f6642i);
            this.f6636c.post(new RunnableC14381());
        }
        View view = this.f6637d;
        if (view != null) {
            if (view.getParent() != null) {
                bringChildToFront(this.f6637d);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 28.0f), C1886t.m9834b(getContext(), 16.0f));
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.rightMargin = C1886t.m9834b(getContext(), 2.0f);
            layoutParams.topMargin = C1886t.m9834b(getContext(), 2.0f);
            addView(this.f6637d, layoutParams);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m5567c() {
        int[] iArr = new int[2];
        this.f6636c.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6636c;
        transInfoForMraid(aTNativeAdvancedWebview, iArr[0], iArr[1], aTNativeAdvancedWebview.getWidth(), this.f6636c.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6636c;
        if (aTNativeAdvancedWebview2 != null) {
            aTNativeAdvancedWebview2.setObject(this.f6642i);
            this.f6636c.post(new RunnableC14381());
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
            map.put(CallMraidJS.f6709a, "inline");
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
        View view = this.f6637d;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f6640g = false;
        this.f6639f = false;
        this.f6638e = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.f6637d;
        if (view == null || view.getParent() == null) {
            return;
        }
        removeView(this.f6637d);
    }

    public void destroy() {
        removeAllViews();
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6636c;
        if (aTNativeAdvancedWebview != null && !aTNativeAdvancedWebview.isDestroyed()) {
            this.f6636c.release();
            NativeAdvancedJsUtils.sendEventToH5(this.f6636c, "onSystemDestory", "");
        }
        if (this.f6643j != null) {
            this.f6643j = null;
        }
    }

    public NativeAdvancedJSBridgeImpl getAdvancedNativeJSBridgeImpl() {
        return this.f6642i;
    }

    public ATNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.f6636c;
    }

    public View getCloseView() {
        return this.f6637d;
    }

    public boolean isEndCardReady() {
        return this.f6640g;
    }

    public boolean isH5Ready() {
        return this.f6638e;
    }

    public boolean isVideoReady() {
        return this.f6639f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.f6640g = false;
        this.f6639f = false;
        this.f6638e = false;
    }

    public void setAdvancedNativeJSBridgeImpl(NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl) {
        this.f6642i = nativeAdvancedJSBridgeImpl;
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6636c;
        if (aTNativeAdvancedWebview != null) {
            aTNativeAdvancedWebview.setObject(nativeAdvancedJSBridgeImpl);
        }
    }

    public void setAdvancedNativeWebview(ATNativeAdvancedWebview aTNativeAdvancedWebview) {
        this.f6636c = aTNativeAdvancedWebview;
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = this.f6642i;
        if (nativeAdvancedJSBridgeImpl != null) {
            aTNativeAdvancedWebview.setObject(nativeAdvancedJSBridgeImpl);
        }
    }

    public void setCloseView(View view) {
        this.f6637d = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z) {
        this.f6640g = z;
    }

    public void setH5Ready(boolean z) {
        this.f6638e = z;
    }

    public void setVideoReady(boolean z) {
        this.f6639f = z;
    }

    public void show() {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.f6636c;
        if (aTNativeAdvancedWebview != null && aTNativeAdvancedWebview.getParent() == null) {
            addView(this.f6636c, new ViewGroup.LayoutParams(-1, -1));
        }
        int[] iArr = new int[2];
        this.f6636c.getLocationInWindow(iArr);
        ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.f6636c;
        transInfoForMraid(aTNativeAdvancedWebview2, iArr[0], iArr[1], aTNativeAdvancedWebview2.getWidth(), this.f6636c.getHeight());
        ATNativeAdvancedWebview aTNativeAdvancedWebview3 = this.f6636c;
        if (aTNativeAdvancedWebview3 != null) {
            aTNativeAdvancedWebview3.setObject(this.f6642i);
            this.f6636c.post(new RunnableC14381());
        }
        View view = this.f6637d;
        if (view != null) {
            if (view.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C1886t.m9834b(getContext(), 28.0f), C1886t.m9834b(getContext(), 16.0f));
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = C1886t.m9834b(getContext(), 2.0f);
                layoutParams.topMargin = C1886t.m9834b(getContext(), 2.0f);
                addView(this.f6637d, layoutParams);
            } else {
                bringChildToFront(this.f6637d);
            }
        }
        clearResState();
    }
}
