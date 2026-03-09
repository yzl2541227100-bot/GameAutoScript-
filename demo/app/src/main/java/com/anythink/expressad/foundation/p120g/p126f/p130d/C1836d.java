package com.anythink.expressad.foundation.p120g.p126f.p130d;

import com.anythink.expressad.foundation.p120g.p126f.C1858k;
import com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p132f.C1846c;
import com.anythink.expressad.foundation.p120g.p126f.p133g.C1851d;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d.d */
/* JADX INFO: loaded from: classes.dex */
public class C1836d extends AbstractC1837e<JSONObject> {

    /* JADX INFO: renamed from: c */
    private static final String f11358c = C1836d.class.getSimpleName();

    public C1836d(int i, String str, String str2, InterfaceC1840e<JSONObject> interfaceC1840e) {
        super(i, str, str2, interfaceC1840e);
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: a */
    public final C1858k<JSONObject> mo9519a(C1846c c1846c) {
        C1824a c1824a;
        try {
            return c1846c.f11382a == 204 ? C1858k.m9635a(new JSONObject(), c1846c) : C1858k.m9635a(new JSONObject(new String(c1846c.f11383b, C1851d.m9571a(c1846c.f11385d))), c1846c);
        } catch (UnsupportedEncodingException e) {
            e.getMessage();
            c1824a = new C1824a(8, c1846c);
            return C1858k.m9634a(c1824a);
        } catch (JSONException e2) {
            e2.getMessage();
            c1824a = new C1824a(8, c1846c);
            return C1858k.m9634a(c1824a);
        }
    }
}
