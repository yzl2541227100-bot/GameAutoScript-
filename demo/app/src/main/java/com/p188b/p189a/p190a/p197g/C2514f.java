package com.p188b.p189a.p190a.p197g;

import com.p188b.p189a.p190a.C2446c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.a.g.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2514f implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public boolean f15435a;

    /* JADX INFO: renamed from: b */
    public String f15436b;

    /* JADX INFO: renamed from: c */
    private final List<String> f15437c;

    public C2514f(List<String> list) {
        this.f15437c = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = C2446c.f15176b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f15435a = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.f15437c;
        }
        if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f15436b = (String) objArr[0];
            return null;
        }
        List list = (List) objArr[0];
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj2 = this.f15437c.get(0);
                break;
            }
            if (this.f15437c.contains(list.get(i))) {
                obj2 = list.get(i);
                break;
            }
            i++;
        }
        String str = (String) obj2;
        this.f15436b = str;
        return str;
    }
}
