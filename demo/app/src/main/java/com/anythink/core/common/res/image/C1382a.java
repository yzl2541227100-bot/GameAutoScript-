package com.anythink.core.common.res.image;

import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.C1380d;
import com.anythink.core.common.res.C1381e;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.res.image.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1382a extends AbstractC1383b {

    /* JADX INFO: renamed from: a */
    public C1381e f5581a;

    /* JADX INFO: renamed from: b */
    public a f5582b;

    /* JADX INFO: renamed from: com.anythink.core.common.res.image.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4500a(C1381e c1381e);

        /* JADX INFO: renamed from: a */
        void mo4501a(C1381e c1381e, String str);
    }

    public C1382a(C1381e c1381e) {
        super(c1381e.f5580f);
        this.f5581a = c1381e;
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final Map<String, String> mo210a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final void mo211a(AbstractRunnableC1337d abstractRunnableC1337d) {
        C1335b.m3998a().m4004a(abstractRunnableC1337d, 4);
    }

    /* JADX INFO: renamed from: a */
    public final void m4533a(a aVar) {
        this.f5582b = aVar;
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final void mo212a(String str, String str2) {
        a aVar = this.f5582b;
        if (aVar != null) {
            aVar.mo4501a(this.f5581a, str2);
        }
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final boolean mo213a(InputStream inputStream) {
        C1380d c1380dM4520a = C1380d.m4520a(C1175n.m2059a().m2148f());
        C1381e c1381e = this.f5581a;
        return c1380dM4520a.m4528a(c1381e.f5579e, C1343g.m4123a(c1381e.f5580f), inputStream);
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: b */
    public final void mo214b() {
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: c */
    public final void mo215c() {
        a aVar = this.f5582b;
        if (aVar != null) {
            aVar.mo4500a(this.f5581a);
        }
    }
}
