package com.anythink.expressad.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.atsignalcommon.base.InterfaceC1449a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1885s;
import com.anythink.expressad.video.signal.factory.C2309b;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkLandingPageView extends AnythinkH5EndCardView {

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkLandingPageView$a */
    public static final class C2137a implements InterfaceC1449a {
        private C2137a() {
        }

        public /* synthetic */ C2137a(byte b) {
            this();
        }

        @Override // com.anythink.expressad.atsignalcommon.base.InterfaceC1449a
        /* JADX INFO: renamed from: a */
        public final boolean mo5623a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            C1885s.m9806a(C1175n.m2059a().m2148f(), str, null);
            return true;
        }
    }

    public AnythinkLandingPageView(Context context) {
        super(context);
    }

    public AnythinkLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    /* JADX INFO: renamed from: a */
    public final String mo11313a() {
        C1781c c1781c = this.f13478b;
        if (c1781c != null) {
            return c1781c.m8835ad();
        }
        return null;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
        if (this.f13482f) {
            this.f13584s.setFilter(new C2137a((byte) 0));
        }
        super.preLoadData(c2309b);
        setVisibility(0);
        setCloseVisible(0);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.InterfaceC2311h
    public void webviewshow() {
        try {
            C1469j.m5701a();
            C1469j.m5703a((WebView) this.f13584s, "webviewshow", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
