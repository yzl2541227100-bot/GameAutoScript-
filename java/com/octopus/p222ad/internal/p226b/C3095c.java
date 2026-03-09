package com.octopus.p222ad.internal.p226b;

import com.octopus.p222ad.internal.p226b.p227a.InterfaceC3083a;
import com.octopus.p222ad.internal.p226b.p227a.InterfaceC3085c;
import com.octopus.p222ad.internal.p226b.p228b.InterfaceC3093c;
import java.io.File;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3095c {

    /* JADX INFO: renamed from: a */
    public final File f17042a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3085c f17043b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3083a f17044c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3093c f17045d;

    public C3095c(File file, InterfaceC3085c interfaceC3085c, InterfaceC3083a interfaceC3083a, InterfaceC3093c interfaceC3093c) {
        this.f17042a = file;
        this.f17043b = interfaceC3085c;
        this.f17044c = interfaceC3083a;
        this.f17045d = interfaceC3093c;
    }

    /* JADX INFO: renamed from: a */
    public File m14276a(String str) {
        return new File(this.f17042a, this.f17043b.mo14254a(str));
    }
}
