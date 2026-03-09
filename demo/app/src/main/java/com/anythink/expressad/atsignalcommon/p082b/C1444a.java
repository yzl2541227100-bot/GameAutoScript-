package com.anythink.expressad.atsignalcommon.p082b;

import com.anythink.expressad.atsignalcommon.p082b.C1446c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1444a extends Exception {

    /* JADX INFO: renamed from: a */
    private static final long f6657a = 1;

    /* JADX INFO: renamed from: b */
    private List<C1446c.b.a> f6658b;

    private C1444a(String str) {
        super(str);
        this.f6658b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private static C1444a m5580a(C1444a c1444a, C1444a c1444a2) {
        if (c1444a == null) {
            return c1444a2;
        }
        if (c1444a2 == null) {
            return c1444a;
        }
        C1444a c1444a3 = new C1444a(c1444a.getMessage() + ";" + c1444a2.getMessage());
        c1444a3.m5583a(c1444a.f6658b);
        c1444a3.m5583a(c1444a2.f6658b);
        return c1444a3;
    }

    /* JADX INFO: renamed from: a */
    private List<C1446c.b.a> m5581a() {
        return this.f6658b;
    }

    /* JADX INFO: renamed from: a */
    private void m5582a(C1446c.b.a aVar) {
        this.f6658b.add(aVar);
    }

    /* JADX INFO: renamed from: a */
    private void m5583a(List<C1446c.b.a> list) {
        this.f6658b.addAll(list);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (C1446c.b.a aVar : this.f6658b) {
            sb.append(aVar.toString());
            sb.append(";");
            try {
                int i = 0;
                if (aVar.getCause() instanceof NoSuchFieldException) {
                    Field[] declaredFields = aVar.m5595a().getDeclaredFields();
                    sb.append(aVar.m5595a().getName());
                    sb.append(".");
                    sb.append(aVar.m5600c());
                    sb.append(";");
                    while (i < declaredFields.length) {
                        sb.append(declaredFields[i].getName());
                        sb.append("/");
                        i++;
                    }
                } else if (aVar.getCause() instanceof NoSuchMethodException) {
                    Method[] declaredMethods = aVar.m5595a().getDeclaredMethods();
                    sb.append(aVar.m5595a().getName());
                    sb.append("->");
                    sb.append(aVar.m5598b());
                    sb.append(";");
                    while (i < declaredMethods.length) {
                        if (aVar.m5598b().equals(declaredMethods[i].getName())) {
                            sb.append(declaredMethods[i].toGenericString());
                            sb.append("/");
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            sb.append("@@@@");
        }
        return sb.toString();
    }
}
