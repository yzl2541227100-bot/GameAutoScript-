package com.anythink.core.common;

import android.content.Context;
import com.anythink.core.common.p055f.C1208aa;
import java.lang.reflect.Method;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.anythink.core.common.r */
/* JADX INFO: loaded from: classes.dex */
public class C1373r {

    /* JADX INFO: renamed from: a */
    public static final int f5467a = 35;

    /* JADX INFO: renamed from: b */
    public static final String f5468b = "isDefaultOffer";

    /* JADX INFO: renamed from: g */
    private static volatile C1373r f5469g;

    /* JADX INFO: renamed from: c */
    public Method f5470c;

    /* JADX INFO: renamed from: d */
    public Method f5471d;

    /* JADX INFO: renamed from: e */
    public Method f5472e;

    /* JADX INFO: renamed from: f */
    public Method f5473f;

    private C1373r() {
        try {
            Class<?> cls = Class.forName("com.anythink.network.myoffer.MyOfferAPI");
            this.f5470c = cls.getDeclaredMethod("preloadTopOnOffer", Context.class, C1208aa.class);
            this.f5471d = cls.getDeclaredMethod("getOutOfCapOfferIds", Context.class);
            this.f5472e = cls.getDeclaredMethod("getDefaultOfferId", Context.class, String.class);
            this.f5473f = cls.getDeclaredMethod("checkOffersOutOfCap", Context.class, String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1373r m4395a() {
        if (f5469g == null) {
            synchronized (C1373r.class) {
                if (f5469g == null) {
                    f5469g = new C1373r();
                }
            }
        }
        return f5469g;
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m4396a(Context context) {
        try {
            Method method = this.f5471d;
            if (method != null) {
                return new JSONArray(method.invoke(null, context).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JSONArray();
    }

    /* JADX INFO: renamed from: a */
    public final void m4397a(Context context, String str) {
        try {
            if (this.f5470c != null) {
                C1208aa c1208aa = new C1208aa();
                c1208aa.f3711a = str;
                this.f5470c.invoke(null, context, c1208aa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m4398b(Context context, String str) {
        try {
            Method method = this.f5472e;
            return method != null ? method.invoke(null, context, str).toString() : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4399c(Context context, String str) {
        try {
            Method method = this.f5473f;
            if (method != null) {
                return ((Boolean) method.invoke(null, context, str)).booleanValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
