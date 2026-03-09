package com.anythink.basead.p010a.p012b;

import android.text.TextUtils;
import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p010a.C0732e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p015c.C0751i;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.image.AbstractC1383b;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.a.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0726e extends AbstractC1383b {

    /* JADX INFO: renamed from: a */
    private String f535a;

    /* JADX INFO: renamed from: b */
    private boolean f536b;

    /* JADX INFO: renamed from: j */
    private boolean f537j;

    /* JADX INFO: renamed from: k */
    private String f538k;

    /* JADX INFO: renamed from: l */
    private int f539l;

    /* JADX INFO: renamed from: m */
    private AbstractC1247l f540m;

    public C0726e(String str, boolean z, AbstractC1247l abstractC1247l, String str2) {
        super(str2);
        this.f540m = abstractC1247l;
        this.f535a = str;
        this.f536b = z;
        this.f537j = TextUtils.equals(abstractC1247l.m3159B(), str2);
        this.f538k = abstractC1247l.m3229t();
        this.f539l = abstractC1247l.mo2426d();
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final Map<String, String> mo210a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final void mo211a(AbstractRunnableC1337d abstractRunnableC1337d) {
        C1335b c1335bM3998a;
        int i;
        if (this.f536b) {
            c1335bM3998a = C1335b.m3998a();
            i = 5;
        } else {
            c1335bM3998a = C1335b.m3998a();
            i = 4;
        }
        c1335bM3998a.m4004a(abstractRunnableC1337d, i);
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final void mo212a(String str, String str2) {
        if (this.f537j) {
            C1322e.m3917a(this.f535a, this.f538k, this.f5584c, "0", this.f5590i, str2, this.f5586e, 0L, this.f539l, this.f5589h - this.f5587f);
        }
        C0725d.m205a().m208a(this.f5584c, C0748f.m310a(str, str2));
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final boolean mo213a(InputStream inputStream) {
        C0732e.m247a();
        return C0732e.m254a(this.f5584c, inputStream);
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: b */
    public final void mo214b() {
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: c */
    public final void mo215c() {
        if (this.f537j) {
            C0717a.m126a(30, this.f540m, new C0751i("", ""));
            C1322e.m3917a(this.f535a, this.f538k, this.f5584c, "1", this.f5590i, (String) null, this.f5586e, this.f5588g, this.f539l, this.f5589h - this.f5587f);
        }
        C0725d.m205a().m207a(this.f5584c, 100);
    }
}
