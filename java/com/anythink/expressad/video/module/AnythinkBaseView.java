package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.video.module.p172a.p173a.C2180f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnythinkBaseView extends RelativeLayout {
    public static final String TAG = "AnythinkBaseView";

    /* JADX INFO: renamed from: n */
    private static final int f13476n = -999;

    /* JADX INFO: renamed from: a */
    public Context f13477a;

    /* JADX INFO: renamed from: b */
    public C1781c f13478b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f13479c;

    /* JADX INFO: renamed from: d */
    public int f13480d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2174a f13481e;

    /* JADX INFO: renamed from: f */
    public boolean f13482f;

    /* JADX INFO: renamed from: g */
    public float f13483g;

    /* JADX INFO: renamed from: h */
    public float f13484h;

    /* JADX INFO: renamed from: i */
    public boolean f13485i;

    /* JADX INFO: renamed from: j */
    public int f13486j;

    /* JADX INFO: renamed from: k */
    public boolean f13487k;

    /* JADX INFO: renamed from: l */
    public int f13488l;

    /* JADX INFO: renamed from: m */
    public int f13489m;

    public AnythinkBaseView(Context context) {
        this(context, null);
    }

    public AnythinkBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13480d = 1;
        this.f13481e = new C2180f();
        this.f13482f = false;
        this.f13488l = 1;
        this.f13489m = 0;
        this.f13477a = context;
        this.f13479c = LayoutInflater.from(context);
        init(context);
    }

    public AnythinkBaseView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z3, int i2, int i3) {
        super(context, attributeSet);
        this.f13480d = 1;
        this.f13481e = new C2180f();
        this.f13482f = false;
        this.f13488l = 1;
        this.f13489m = 0;
        this.f13477a = context;
        this.f13479c = LayoutInflater.from(context);
        this.f13485i = z;
        this.f13486j = i;
        this.f13487k = z3;
        this.f13488l = i2;
        this.f13489m = i3;
        init(context);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m11315a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C1801a.f11114cc, C1886t.m9821a(C1175n.m2059a().m2148f(), this.f13483g));
                jSONObject2.put(C1801a.f11115cd, C1886t.m9821a(C1175n.m2059a().m2148f(), this.f13484h));
                jSONObject2.put(C1801a.f11117cf, i);
                try {
                    this.f13480d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C1801a.f11118cg, this.f13480d);
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

    /* JADX INFO: renamed from: c */
    public void mo11316c() {
    }

    /* JADX INFO: renamed from: d */
    public final String m11317d() {
        return m11315a(0).toString();
    }

    public void defaultShow() {
    }

    public int filterFindViewId(boolean z, String str) {
        return z ? findDyID(str) : findID(str);
    }

    public int findColor(String str) {
        return C1875i.m9684a(this.f13477a.getApplicationContext(), str, C1875i.f11529d);
    }

    public int findDrawable(String str) {
        return C1875i.m9684a(this.f13477a.getApplicationContext(), str, C1875i.f11528c);
    }

    public int findDyID(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public int findID(String str) {
        return C1875i.m9684a(this.f13477a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C1875i.m9684a(this.f13477a.getApplicationContext(), str, "layout");
    }

    public C1781c getCampaign() {
        return this.f13478b;
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

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f13477a.getResources().getConfiguration().orientation == 2;
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
        this.f13480d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f13483g = motionEvent.getRawX();
        this.f13484h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f13480d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(C1781c c1781c) {
        this.f13478b = c1781c;
    }

    public void setLayoutCenter(int i, int i2) {
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
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
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

    public void setNotifyListener(InterfaceC2174a interfaceC2174a) {
        this.f13481e = interfaceC2174a;
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
