package com.p188b.p189a.p190a.p195e;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.anythink.core.api.ATCustomRuleKeys;
import com.p188b.p199b.C2582i;
import com.sun.mail.imap.IMAPStore;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.b.a.a.e.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2484d {

    /* JADX INFO: renamed from: a */
    public static final C2483c[] f15303a;

    /* JADX INFO: renamed from: b */
    public static final Map<C2582i, Integer> f15304b;

    static {
        C2483c c2483c = new C2483c(C2483c.f15299f, "");
        int i = 0;
        C2582i c2582i = C2483c.f15296c;
        C2582i c2582i2 = C2483c.f15297d;
        C2582i c2582i3 = C2483c.f15298e;
        C2582i c2582i4 = C2483c.f15295b;
        C2483c[] c2483cArr = {c2483c, new C2483c(c2582i, "GET"), new C2483c(c2582i, "POST"), new C2483c(c2582i2, "/"), new C2483c(c2582i2, "/index.html"), new C2483c(c2582i3, "http"), new C2483c(c2582i3, "https"), new C2483c(c2582i4, "200"), new C2483c(c2582i4, "204"), new C2483c(c2582i4, "206"), new C2483c(c2582i4, "304"), new C2483c(c2582i4, "400"), new C2483c(c2582i4, "404"), new C2483c(c2582i4, "500"), new C2483c("accept-charset", ""), new C2483c("accept-encoding", "gzip, deflate"), new C2483c("accept-language", ""), new C2483c("accept-ranges", ""), new C2483c("accept", ""), new C2483c("access-control-allow-origin", ""), new C2483c(ATCustomRuleKeys.AGE, ""), new C2483c("allow", ""), new C2483c("authorization", ""), new C2483c("cache-control", ""), new C2483c("content-disposition", ""), new C2483c("content-encoding", ""), new C2483c("content-language", ""), new C2483c("content-length", ""), new C2483c("content-location", ""), new C2483c("content-range", ""), new C2483c("content-type", ""), new C2483c("cookie", ""), new C2483c(IMAPStore.ID_DATE, ""), new C2483c("etag", ""), new C2483c("expect", ""), new C2483c("expires", ""), new C2483c("from", ""), new C2483c("host", ""), new C2483c("if-match", ""), new C2483c("if-modified-since", ""), new C2483c("if-none-match", ""), new C2483c("if-range", ""), new C2483c("if-unmodified-since", ""), new C2483c("last-modified", ""), new C2483c("link", ""), new C2483c(RequestParameters.SUBRESOURCE_LOCATION, ""), new C2483c("max-forwards", ""), new C2483c("proxy-authenticate", ""), new C2483c("proxy-authorization", ""), new C2483c("range", ""), new C2483c(RequestParameters.SUBRESOURCE_REFERER, ""), new C2483c("refresh", ""), new C2483c("retry-after", ""), new C2483c("server", ""), new C2483c("set-cookie", ""), new C2483c("strict-transport-security", ""), new C2483c("transfer-encoding", ""), new C2483c("user-agent", ""), new C2483c("vary", ""), new C2483c("via", ""), new C2483c("www-authenticate", "")};
        f15303a = c2483cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2483cArr.length);
        while (true) {
            C2483c[] c2483cArr2 = f15303a;
            if (i >= c2483cArr2.length) {
                f15304b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(c2483cArr2[i].f15300g)) {
                    linkedHashMap.put(c2483cArr2[i].f15300g, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2582i m12698a(C2582i c2582i) throws IOException {
        int iMo13056g = c2582i.mo13056g();
        for (int i = 0; i < iMo13056g; i++) {
            byte bMo13045a = c2582i.mo13045a(i);
            if (bMo13045a >= 65 && bMo13045a <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c2582i.mo13047a());
            }
        }
        return c2582i;
    }
}
