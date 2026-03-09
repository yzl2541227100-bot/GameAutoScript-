package com.anythink.core.common.p066o;

import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.common.p051b.AbstractC1165d;
import com.anythink.core.common.p055f.C1229av;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: com.anythink.core.common.o.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1346j {

    /* JADX INFO: renamed from: a */
    public static C1346j f5303a = new C1346j();

    /* JADX INFO: renamed from: a */
    public static ATBaseAdAdapter m4174a(C1229av c1229av) {
        try {
            return m4176a(c1229av.m2809i());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static ATBaseAdAdapter m4175a(Class<? extends AbstractC1165d> cls) throws NoSuchMethodException {
        if (cls == null) {
            Log.w("anythink", "can not find adapter");
        }
        Constructor<? extends AbstractC1165d> declaredConstructor = cls.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (ATBaseAdAdapter) declaredConstructor.newInstance(new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static ATBaseAdAdapter m4176a(String str) throws NoSuchMethodException {
        if (str == null) {
            return null;
        }
        Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(ATBaseAdAdapter.class);
        if (clsAsSubclass == 0) {
            Log.w("anythink", "can not find adapter");
        }
        Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (ATBaseAdAdapter) declaredConstructor.newInstance(new Object[0]);
    }
}
