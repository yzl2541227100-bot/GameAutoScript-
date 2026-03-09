package com.anythink.expressad.video.p154bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* JADX INFO: renamed from: n */
    public static int f13087n = 0;

    /* JADX INFO: renamed from: o */
    public static int f13088o = 1;

    /* JADX INFO: renamed from: p */
    private static final int f13089p = -999;

    /* JADX INFO: renamed from: a */
    public Context f13090a;

    /* JADX INFO: renamed from: b */
    public C1781c f13091b;

    /* JADX INFO: renamed from: c */
    public String f13092c;

    /* JADX INFO: renamed from: d */
    public String f13093d;

    /* JADX INFO: renamed from: e */
    public C2340d f13094e;

    /* JADX INFO: renamed from: f */
    public LayoutInflater f13095f;

    /* JADX INFO: renamed from: g */
    public int f13096g;

    /* JADX INFO: renamed from: h */
    public boolean f13097h;

    /* JADX INFO: renamed from: i */
    public float f13098i;

    /* JADX INFO: renamed from: j */
    public float f13099j;

    /* JADX INFO: renamed from: k */
    public Rect f13100k;

    /* JADX INFO: renamed from: l */
    public int f13101l;

    /* JADX INFO: renamed from: m */
    public int f13102m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13093d = "";
        this.f13096g = 1;
        this.f13097h = false;
        this.f13090a = context;
        this.f13095f = LayoutInflater.from(context);
        init(context);
    }

    /* JADX INFO: renamed from: a */
    public static void m11042a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f13087n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            C1469j.m5701a();
            C1469j.m5703a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C2024c.m10829a();
            C2024c.m10831a(webView, e.getMessage());
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    private String m11043b() {
        return m11044a(0).toString();
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m11044a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C1801a.f11114cc, C1886t.m9821a(C1773a.m8548c().m8557e(), this.f13098i));
                jSONObject2.put(C1801a.f11115cd, C1886t.m9821a(C1773a.m8548c().m8557e(), this.f13099j));
                jSONObject2.put(C1801a.f11117cf, i);
                try {
                    this.f13096g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C1801a.f11118cg, this.f13096g);
                jSONObject2.put(C1801a.f11119ch, C1886t.m9841c(getContext()));
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo11014a() {
    }

    public void defaultShow() {
    }

    public int findColor(String str) {
        return C1875i.m9684a(this.f13090a.getApplicationContext(), str, C1875i.f11529d);
    }

    public int findDrawable(String str) {
        return C1875i.m9684a(this.f13090a.getApplicationContext(), str, C1875i.f11528c);
    }

    public int findID(String str) {
        return C1875i.m9684a(this.f13090a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C1875i.m9684a(this.f13090a.getApplicationContext(), str, "layout");
    }

    public C1781c getCampaign() {
        return this.f13091b;
    }

    public String getInstanceId() {
        return this.f13093d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public Rect getRect() {
        return this.f13100k;
    }

    public String getUnitId() {
        return this.f13092c;
    }

    public int getViewHeight() {
        return this.f13102m;
    }

    public int getViewWidth() {
        return this.f13101l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f13090a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f13096g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f13098i = motionEvent.getRawX();
        this.f13099j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f13096g = configuration.orientation;
    }

    public void setCampaign(C1781c c1781c) {
        this.f13091b = c1781c;
    }

    public void setInstanceId(String str) {
        this.f13093d = str;
    }

    public void setLayout(int i, int i2) {
        this.f13101l = i;
        this.f13102m = i2;
    }

    public void setLayoutCenter(int i, int i2) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentRelativeLayoutParams.height = i2;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentLinearLayoutParams.height = i2;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i != -999) {
                parentFrameLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentFrameLayoutParams.height = i2;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i2;
            parentRelativeLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentRelativeLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentRelativeLayoutParams.height = i4;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i2;
            parentLinearLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentLinearLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentLinearLayoutParams.height = i4;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i2;
            parentFrameLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentFrameLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentFrameLayoutParams.height = i4;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setRect(Rect rect) {
        this.f13100k = rect;
    }

    public void setRewardUnitSetting(C2340d c2340d) {
        this.f13094e = c2340d;
    }

    public void setUnitId(String str) {
        this.f13092c = str;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }
}
