package com.anythink.basead.p016d;

import android.content.Context;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.basead.p021e.InterfaceC0774d;
import com.anythink.core.common.p055f.C1248m;

/* JADX INFO: renamed from: com.anythink.basead.d.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0766e extends AbstractC0756b {

    /* JADX INFO: renamed from: a */
    public boolean f908a;

    /* JADX INFO: renamed from: com.anythink.basead.d.e$1 */
    public class AnonymousClass1 implements InterfaceC0773c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0774d f909a;

        public AnonymousClass1(InterfaceC0774d interfaceC0774d) {
            interfaceC0774d = interfaceC0774d;
        }

        @Override // com.anythink.basead.p021e.InterfaceC0773c
        public final void onAdCacheLoaded() {
            C0769h c0769hM466a = C0766e.this.m466a();
            InterfaceC0774d interfaceC0774d = interfaceC0774d;
            if (interfaceC0774d != null) {
                interfaceC0774d.onNativeAdLoaded(c0769hM466a);
            }
        }

        @Override // com.anythink.basead.p021e.InterfaceC0773c
        public final void onAdDataLoaded() {
        }

        @Override // com.anythink.basead.p021e.InterfaceC0773c
        public final void onAdLoadFailed(C0747e c0747e) {
            InterfaceC0774d interfaceC0774d = interfaceC0774d;
            if (interfaceC0774d != null) {
                interfaceC0774d.onNativeAdLoadError(c0747e);
            }
        }
    }

    public C0766e(Context context, AbstractC0756b.b bVar, C1248m c1248m, boolean z) {
        super(context, bVar, c1248m);
        this.f908a = z;
    }

    /* JADX INFO: renamed from: a */
    public final C0769h m466a() {
        return new C0769h(this.f844b, this.f847e, this.f845c, this.f848f, this.f908a);
    }

    /* JADX INFO: renamed from: a */
    public final void m467a(InterfaceC0774d interfaceC0774d) {
        super.m402a(new InterfaceC0773c() { // from class: com.anythink.basead.d.e.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0774d f909a;

            public AnonymousClass1(InterfaceC0774d interfaceC0774d2) {
                interfaceC0774d = interfaceC0774d2;
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdCacheLoaded() {
                C0769h c0769hM466a = C0766e.this.m466a();
                InterfaceC0774d interfaceC0774d2 = interfaceC0774d;
                if (interfaceC0774d2 != null) {
                    interfaceC0774d2.onNativeAdLoaded(c0769hM466a);
                }
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.p021e.InterfaceC0773c
            public final void onAdLoadFailed(C0747e c0747e) {
                InterfaceC0774d interfaceC0774d2 = interfaceC0774d;
                if (interfaceC0774d2 != null) {
                    interfaceC0774d2.onNativeAdLoadError(c0747e);
                }
            }
        });
    }
}
