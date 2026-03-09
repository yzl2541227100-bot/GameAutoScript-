package com.anythink.expressad.video.dynview.p165h;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.video.dynview.C2068a;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p159b.C2072a;
import com.anythink.expressad.video.dynview.p159b.C2073b;
import com.anythink.expressad.video.dynview.p160c.EnumC2076b;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2083e;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2086h;
import com.anythink.expressad.video.dynview.p170j.C2099c;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2088a {
    public C2088a(Context context, List<C1781c> list, InterfaceC2086h interfaceC2086h, Map<String, Object> map) {
        new C2099c();
        m11162a(C2099c.m11253a(context, list), interfaceC2086h, map);
    }

    public C2088a(C2074c c2074c, InterfaceC2086h interfaceC2086h, Map<String, Object> map) {
        m11162a(c2074c, interfaceC2086h, map);
    }

    /* JADX INFO: renamed from: a */
    private void m11162a(C2074c c2074c, final InterfaceC2086h interfaceC2086h, Map<String, Object> map) {
        if (interfaceC2086h == null) {
            return;
        }
        if (c2074c == null) {
            interfaceC2086h.mo10990a(EnumC2076b.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (c2074c.m11087a() == null) {
            interfaceC2086h.mo10990a(EnumC2076b.NOT_FOUND_CONTEXT);
            return;
        }
        if (TextUtils.isEmpty(c2074c.m11088b())) {
            interfaceC2086h.mo10990a(EnumC2076b.NOT_FOUND_LAYOUTNAME);
            return;
        }
        View viewInflate = LayoutInflater.from(c2074c.m11087a()).inflate(C1875i.m9684a(c2074c.m11087a(), c2074c.m11088b(), "layout"), (ViewGroup) null);
        C2073b.m11078a();
        C2073b.m11080a(viewInflate, c2074c);
        C2072a.m11068a().m11077a(viewInflate, c2074c, map, new InterfaceC2083e() { // from class: com.anythink.expressad.video.dynview.h.a.1
            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2083e
            /* JADX INFO: renamed from: a */
            public final void mo11133a(View view, List<View> list) {
                C2068a c2068a = new C2068a();
                c2068a.m11056a(view);
                c2068a.m11057a(list);
                c2068a.m11060d();
                interfaceC2086h.mo10989a(c2068a);
            }

            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2083e
            /* JADX INFO: renamed from: a */
            public final void mo11134a(EnumC2076b enumC2076b) {
                interfaceC2086h.mo10990a(enumC2076b);
            }
        });
    }
}
