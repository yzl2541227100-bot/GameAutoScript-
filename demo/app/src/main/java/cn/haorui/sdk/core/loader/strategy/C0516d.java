package cn.haorui.sdk.core.loader.strategy;

import cn.haorui.sdk.core.loader.loadbean.C0512a;
import java.util.Comparator;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.strategy.d */
/* JADX INFO: loaded from: classes.dex */
public class C0516d implements Comparator<C0512a> {
    public C0516d(C0515c c0515c) {
    }

    @Override // java.util.Comparator
    public int compare(C0512a c0512a, C0512a c0512a2) {
        return c0512a2.m54a() - c0512a.m54a();
    }
}
