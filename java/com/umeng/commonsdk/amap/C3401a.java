package com.umeng.commonsdk.amap;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.MLog;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.umeng.commonsdk.amap.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3401a {

    /* JADX INFO: renamed from: a */
    private Context f18596a;

    /* JADX INFO: renamed from: b */
    private Class<?> f18597b;

    /* JADX INFO: renamed from: c */
    private Object f18598c;

    public C3401a(Context context) {
        C3489e.m16329a("ContentValues", "new UMAmapLocation");
        if (context == null) {
            MLog.m16269e("Context参数不能为null");
            return;
        }
        this.f18596a = context.getApplicationContext();
        try {
            Class<?> cls = Class.forName("com.amap.api.netlocation.AMapNetworkLocationClient");
            this.f18597b = cls;
            if (cls != null) {
                this.f18598c = cls.getConstructor(Context.class).newInstance(this.f18596a);
            }
        } catch (Exception e) {
            C3489e.m16329a("ContentValues", "new UMAmapLocation e is " + e);
        }
    }

    /* JADX INFO: renamed from: a */
    public Class<?> m15637a() {
        return this.f18597b;
    }

    /* JADX INFO: renamed from: b */
    public synchronized byte[] m15638b() {
        byte[] bArr;
        Method method;
        C3489e.m16329a("ContentValues", "UMAmapLocation getNetworkLocationParameter");
        bArr = null;
        try {
            Class<?> cls = this.f18597b;
            if (cls != null && this.f18598c != null && (method = cls.getMethod("getNetworkLocationParameter", new Class[0])) != null) {
                bArr = (byte[]) method.invoke(this.f18598c, new Object[0]);
            }
        } catch (Exception e) {
            C3489e.m16329a("ContentValues", "getNetworkLocationParameter e is " + e);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m15639c() {
        Method method;
        C3489e.m16329a("ContentValues", "UMAmapLocation destory");
        try {
            Class<?> cls = this.f18597b;
            if (cls != null && this.f18598c != null && (method = cls.getMethod("destroy", new Class[0])) != null) {
                method.invoke(this.f18598c, new Object[0]);
            }
        } catch (Exception e) {
            C3489e.m16329a("ContentValues", "UMAmapLocation destory e is " + e);
        }
    }
}
