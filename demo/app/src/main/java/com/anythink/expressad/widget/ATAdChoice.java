package com.anythink.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1885s;

/* JADX INFO: loaded from: classes.dex */
public class ATAdChoice extends ATImageView {

    /* JADX INFO: renamed from: a */
    private static String f14711a = "ATAdChoice";

    /* JADX INFO: renamed from: b */
    private String f14712b;

    /* JADX INFO: renamed from: c */
    private String f14713c;

    /* JADX INFO: renamed from: d */
    private String f14714d;

    /* JADX INFO: renamed from: e */
    private Context f14715e;

    /* JADX INFO: renamed from: com.anythink.expressad.widget.ATAdChoice$1 */
    public class C23411 implements InterfaceC1819c {
        public C23411() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            ATAdChoice.this.setImageBitmap(bitmap);
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    public ATAdChoice(Context context) {
        super(context);
        this.f14712b = "";
        this.f14713c = "";
        this.f14714d = "";
        this.f14715e = context;
        m12111a();
    }

    public ATAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14712b = "";
        this.f14713c = "";
        this.f14714d = "";
        this.f14715e = context;
        m12111a();
    }

    public ATAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14712b = "";
        this.f14713c = "";
        this.f14714d = "";
        this.f14715e = context;
        m12111a();
    }

    /* JADX INFO: renamed from: a */
    private void m12111a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m12112a(com.anythink.expressad.foundation.p116d.C1781c r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L3a
            com.anythink.expressad.foundation.d.c$a r2 = r4.m8912v()
            if (r2 == 0) goto L3a
            com.anythink.expressad.foundation.d.c$a r2 = r4.m8912v()
            java.lang.String r2 = r2.m8942c()
            r3.f14712b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3a
            com.anythink.expressad.foundation.d.c$a r2 = r4.m8912v()
            java.lang.String r2 = r2.m8941b()
            r3.f14714d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3a
            com.anythink.expressad.foundation.d.c$a r4 = r4.m8912v()
            java.lang.String r4 = r4.m8943d()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3a
            r4 = 1
            goto L3b
        L3a:
            r4 = 0
        L3b:
            if (r4 != 0) goto L72
            com.anythink.expressad.p086d.C1486b.m6002a()
            com.anythink.expressad.foundation.b.a r4 = com.anythink.expressad.foundation.p113b.C1773a.m8548c()
            r4.m8558f()
            com.anythink.expressad.d.a r4 = com.anythink.expressad.p086d.C1486b.m6007b()
            if (r4 == 0) goto L70
            java.lang.String r2 = r4.m5934H()
            r3.f14712b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L70
            java.lang.String r2 = r4.m5936J()
            r3.f14714d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L70
            java.lang.String r4 = r4.m5935I()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L70
            goto L71
        L70:
            r0 = 0
        L71:
            r4 = r0
        L72:
            java.lang.String r0 = r3.f14712b
            r3.setImageUrl(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.widget.ATAdChoice.m12112a(com.anythink.expressad.foundation.d.c):boolean");
    }

    /* JADX INFO: renamed from: b */
    private void m12113b() {
        Context context = this.f14715e;
        if (context != null) {
            C1818b.m9427a(context).m9443a(this.f14712b, new C23411());
        }
    }

    /* JADX INFO: renamed from: c */
    private void m12114c() {
        if (TextUtils.isEmpty(this.f14714d)) {
            return;
        }
        C1885s.m9806a(this.f14715e, this.f14714d, null);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (TextUtils.isEmpty(this.f14714d)) {
            return true;
        }
        C1885s.m9806a(this.f14715e, this.f14714d, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCampaign(com.anythink.expressad.out.C1935j r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.anythink.expressad.foundation.p116d.C1781c
            if (r0 == 0) goto L91
            com.anythink.expressad.foundation.d.c r4 = (com.anythink.expressad.foundation.p116d.C1781c) r4
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L40
            com.anythink.expressad.foundation.d.c$a r2 = r4.m8912v()
            if (r2 == 0) goto L40
            com.anythink.expressad.foundation.d.c$a r2 = r4.m8912v()
            java.lang.String r2 = r2.m8942c()
            r3.f14712b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L40
            com.anythink.expressad.foundation.d.c$a r2 = r4.m8912v()
            java.lang.String r2 = r2.m8941b()
            r3.f14714d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L40
            com.anythink.expressad.foundation.d.c$a r4 = r4.m8912v()
            java.lang.String r4 = r4.m8943d()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L40
            r4 = 1
            goto L41
        L40:
            r4 = 0
        L41:
            if (r4 != 0) goto L78
            com.anythink.expressad.p086d.C1486b.m6002a()
            com.anythink.expressad.foundation.b.a r4 = com.anythink.expressad.foundation.p113b.C1773a.m8548c()
            r4.m8558f()
            com.anythink.expressad.d.a r4 = com.anythink.expressad.p086d.C1486b.m6007b()
            if (r4 == 0) goto L76
            java.lang.String r2 = r4.m5934H()
            r3.f14712b = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L76
            java.lang.String r2 = r4.m5936J()
            r3.f14714d = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L76
            java.lang.String r4 = r4.m5935I()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L76
            goto L77
        L76:
            r0 = 0
        L77:
            r4 = r0
        L78:
            java.lang.String r0 = r3.f14712b
            r3.setImageUrl(r0)
            if (r4 == 0) goto L91
            android.content.Context r4 = r3.f14715e
            if (r4 == 0) goto L91
            com.anythink.expressad.foundation.g.d.b r4 = com.anythink.expressad.foundation.p120g.p124d.C1818b.m9427a(r4)
            java.lang.String r0 = r3.f14712b
            com.anythink.expressad.widget.ATAdChoice$1 r1 = new com.anythink.expressad.widget.ATAdChoice$1
            r1.<init>()
            r4.m9443a(r0, r1)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.widget.ATAdChoice.setCampaign(com.anythink.expressad.out.j):void");
    }
}
