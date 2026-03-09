package com.anythink.expressad.foundation.p113b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C1773a {

    /* JADX INFO: renamed from: a */
    public static final String f10127a = "a";

    /* JADX INFO: renamed from: b */
    private static volatile C1773a f10128b;

    /* JADX INFO: renamed from: c */
    private Context f10129c;

    /* JADX INFO: renamed from: d */
    private String f10130d;

    /* JADX INFO: renamed from: e */
    private String f10131e;

    /* JADX INFO: renamed from: g */
    private JSONObject f10133g;

    /* JADX INFO: renamed from: i */
    private boolean f10135i;

    /* JADX INFO: renamed from: j */
    private WeakReference<Context> f10136j;

    /* JADX INFO: renamed from: k */
    private WeakReference<Activity> f10137k;

    /* JADX INFO: renamed from: l */
    private String f10138l;

    /* JADX INFO: renamed from: f */
    private int f10132f = 0;

    /* JADX INFO: renamed from: h */
    private boolean f10134h = false;

    private C1773a() {
    }

    /* JADX INFO: renamed from: a */
    private void m8546a(int i) {
        this.f10132f = i;
    }

    /* JADX INFO: renamed from: a */
    private void m8547a(JSONObject jSONObject) {
        this.f10133g = jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static C1773a m8548c() {
        if (f10128b == null) {
            synchronized (C1773a.class) {
                if (f10128b == null) {
                    f10128b = new C1773a();
                }
            }
        }
        return f10128b;
    }

    /* JADX INFO: renamed from: a */
    public final String m8549a() {
        return this.f10138l;
    }

    /* JADX INFO: renamed from: a */
    public final void m8550a(Context context) {
        this.f10129c = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m8551a(String str) {
        this.f10138l = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m8552b() {
        try {
            Context context = this.f10129c;
            if (context != null) {
                return context.getPackageName();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8553b(Context context) {
        this.f10136j = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m8554b(String str) {
        this.f10130d = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m8555c(String str) {
        this.f10131e = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m8556d() {
        if (this.f10134h) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f10133g = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public final Context m8557e() {
        return this.f10129c;
    }

    /* JADX INFO: renamed from: f */
    public final String m8558f() {
        return !TextUtils.isEmpty(this.f10130d) ? this.f10130d : "";
    }

    /* JADX INFO: renamed from: g */
    public final String m8559g() {
        return !TextUtils.isEmpty(this.f10131e) ? this.f10131e : "";
    }

    /* JADX INFO: renamed from: h */
    public final Context m8560h() {
        WeakReference<Context> weakReference = this.f10136j;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: i */
    public final int m8561i() {
        return this.f10132f;
    }

    /* JADX INFO: renamed from: j */
    public final JSONObject m8562j() {
        return this.f10133g;
    }
}
