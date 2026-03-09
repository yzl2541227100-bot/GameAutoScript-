package com.anythink.expressad.videocommon.p178b;

import android.net.Uri;
import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p120g.p123c.C1814d;
import com.anythink.expressad.foundation.p120g.p123c.EnumC1811a;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import com.anythink.expressad.foundation.p138h.C1878l;
import com.anythink.expressad.foundation.p138h.C1879m;
import com.anythink.expressad.foundation.p138h.C1882p;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.videocommon.p178b.C2323h;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2328m {

    /* JADX INFO: renamed from: a */
    public static final String f14473a = "foldername";

    /* JADX INFO: renamed from: b */
    public static final String f14474b = "md5filename";

    /* JADX INFO: renamed from: c */
    public static final String f14475c = "nc";

    /* JADX INFO: renamed from: d */
    public static final int f14476d = 259200000;

    /* JADX INFO: renamed from: e */
    private static String f14477e = "ResourceManager";

    /* JADX INFO: renamed from: f */
    private String f14478f;

    /* JADX INFO: renamed from: com.anythink.expressad.videocommon.b.m$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static C2328m f14480a = new C2328m(0);

        private a() {
        }
    }

    private C2328m() {
        this.f14478f = C1814d.m9407b(EnumC1811a.ANYTHINK_700_RES);
    }

    public /* synthetic */ C2328m(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C2328m m11910a() {
        return a.f14480a;
    }

    /* JADX INFO: renamed from: a */
    private String m11912a(String str, String str2, File file) {
        String strM9730a = C1879m.m9730a(str2, this.f14478f + "/" + C1882p.m9771a(C1890x.m9869a(str)));
        return TextUtils.isEmpty(strM9730a) ? C1879m.m9740b(file) : strM9730a;
    }

    /* JADX INFO: renamed from: c */
    private void m11913c() {
        this.f14478f = C1814d.m9407b(EnumC1811a.ANYTHINK_700_RES);
    }

    /* JADX INFO: renamed from: a */
    public final String m11914a(String str) {
        String strSubstring;
        try {
            String str2 = this.f14478f + "/" + C1882p.m9771a(C1890x.m9869a(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(f14473a);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str3 = queryParameters.get(0);
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
            String str4 = str2 + "/" + str3 + "/" + str3 + ".html";
            if (!C1879m.m9734a(str4)) {
                return null;
            }
            try {
                strSubstring = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                strSubstring = "";
            }
            return "file://" + str4 + (TextUtils.isEmpty(strSubstring) ? "" : "?".concat(String.valueOf(strSubstring)));
        } catch (Exception e) {
            if (!C1404a.f6209a) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m11915a(String str, byte[] bArr) {
        String message;
        String strM11912a = "unknow exception ";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str2 = this.f14478f + "/" + C1882p.m9771a(C1890x.m9869a(str)) + MultiDexExtractor.EXTRACTED_SUFFIX;
                    File file = new File(str2);
                    if (C1879m.m9736a(bArr, file)) {
                        Uri uri = Uri.parse(str);
                        List<String> queryParameters = uri.getQueryParameters(f14475c);
                        if (queryParameters == null || queryParameters.size() == 0) {
                            List<String> queryParameters2 = uri.getQueryParameters(f14474b);
                            if (queryParameters2 != null && queryParameters2.size() > 0) {
                                String str3 = queryParameters2.get(0);
                                if (!TextUtils.isEmpty(str3) && str3.equals(C1878l.m9723a(file))) {
                                    strM11912a = m11912a(str, str2, file);
                                }
                            }
                        } else {
                            strM11912a = m11912a(str, str2, file);
                        }
                    }
                    if (!TextUtils.isEmpty(strM11912a)) {
                        C1879m.m9740b(file);
                    }
                }
                message = strM11912a;
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.printStackTrace();
                }
                message = e.getMessage();
            }
        } else {
            message = strM11912a;
        }
        return message;
    }

    /* JADX INFO: renamed from: b */
    public final void m11916b() {
        try {
            if (TextUtils.isEmpty(this.f14478f)) {
                return;
            }
            C2323h.a.f14448a.m11866a(new AbstractRunnableC1861a() { // from class: com.anythink.expressad.videocommon.b.m.1
                @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                /* JADX INFO: renamed from: a */
                public final void mo5269a() {
                    C1879m.m9744c(C2328m.this.f14478f);
                }

                @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                /* JADX INFO: renamed from: b */
                public final void mo5270b() {
                }

                @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a
                /* JADX INFO: renamed from: c */
                public final void mo5271c() {
                }
            });
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
    }
}
