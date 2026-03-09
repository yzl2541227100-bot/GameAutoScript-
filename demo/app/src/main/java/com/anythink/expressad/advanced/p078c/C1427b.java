package com.anythink.expressad.advanced.p078c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.advanced.p076a.C1420a;
import com.anythink.expressad.advanced.p079d.C1431c;
import com.anythink.expressad.advanced.p079d.C1432d;
import com.anythink.expressad.advanced.p079d.InterfaceC1429a;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1891y;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.p073a.p074a.C1406a;
import com.anythink.expressad.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.advanced.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1427b {

    /* JADX INFO: renamed from: c */
    private C1781c f6514c;

    /* JADX INFO: renamed from: d */
    private ATNativeAdvancedView f6515d;

    /* JADX INFO: renamed from: e */
    private C1432d f6516e;

    /* JADX INFO: renamed from: f */
    private C1405a f6517f;

    /* JADX INFO: renamed from: g */
    private C1431c f6518g;

    /* JADX INFO: renamed from: h */
    private boolean f6519h;

    /* JADX INFO: renamed from: j */
    private ImageView f6521j;

    /* JADX INFO: renamed from: k */
    private String f6522k;

    /* JADX INFO: renamed from: l */
    private String f6523l;

    /* JADX INFO: renamed from: m */
    private boolean f6524m;

    /* JADX INFO: renamed from: b */
    private String f6513b = "NativeAdvancedShowManager";

    /* JADX INFO: renamed from: i */
    private int f6520i = -1;

    /* JADX INFO: renamed from: n */
    private View.OnClickListener f6525n = new View.OnClickListener() { // from class: com.anythink.expressad.advanced.c.b.1
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (C1427b.this.f6519h) {
                C1427b.m5471b(C1427b.this);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public Handler f6512a = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.advanced.c.b.2
        public AnonymousClass2(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 2 && C1427b.this.f6514c != null && C1427b.this.f6514c.m8856ay() && C1427b.this.f6515d != null) {
                C1427b.this.f6515d.getAdvancedNativeWebview();
            }
        }
    };

    /* JADX INFO: renamed from: o */
    private InterfaceC1429a f6526o = new InterfaceC1429a() { // from class: com.anythink.expressad.advanced.c.b.3
        public AnonymousClass3() {
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5494a() {
            if (C1427b.this.f6515d != null) {
                C1427b.this.f6515d.setVisibility(8);
            }
            C1427b.m5471b(C1427b.this);
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5495a(int i) {
            C1427b.this.f6520i = i;
            if (C1427b.this.f6515d != null) {
                C1427b.this.f6515d.changeCloseBtnState(i);
            }
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5496a(C1781c c1781c) {
            C1427b.this.m5487a(c1781c);
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5497a(String str) {
            try {
                if (C1427b.this.f6516e != null) {
                    if (TextUtils.isEmpty(str)) {
                        C1427b.this.f6516e.mo5409a(C1427b.this.f6514c);
                        C1432d unused = C1427b.this.f6516e;
                    } else {
                        C1781c c1781cM8703b = C1781c.m8703b(C1781c.m8671a(C1427b.this.f6514c));
                        c1781cM8703b.m8902p(str);
                        C1427b.this.m5487a(c1781cM8703b);
                    }
                }
            } catch (Exception e) {
                String unused2 = C1427b.this.f6513b;
                e.getMessage();
            }
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5498a(boolean z) {
            if (C1427b.this.f6516e != null) {
                C1427b.this.f6524m = z;
                if (z) {
                    C1432d unused = C1427b.this.f6516e;
                } else {
                    C1432d unused2 = C1427b.this.f6516e;
                }
            }
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: b */
        public final void mo5499b() {
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: c */
        public final void mo5500c() {
            String unused = C1427b.this.f6513b;
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: d */
        public final void mo5501d() {
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: e */
        public final void mo5502e() {
            C1427b.m5471b(C1427b.this);
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.b$1 */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (C1427b.this.f6519h) {
                C1427b.m5471b(C1427b.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.b$2 */
    public class AnonymousClass2 extends Handler {
        public AnonymousClass2(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 2 && C1427b.this.f6514c != null && C1427b.this.f6514c.m8856ay() && C1427b.this.f6515d != null) {
                C1427b.this.f6515d.getAdvancedNativeWebview();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.b$3 */
    public class AnonymousClass3 implements InterfaceC1429a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5494a() {
            if (C1427b.this.f6515d != null) {
                C1427b.this.f6515d.setVisibility(8);
            }
            C1427b.m5471b(C1427b.this);
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5495a(int i) {
            C1427b.this.f6520i = i;
            if (C1427b.this.f6515d != null) {
                C1427b.this.f6515d.changeCloseBtnState(i);
            }
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5496a(C1781c c1781c) {
            C1427b.this.m5487a(c1781c);
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5497a(String str) {
            try {
                if (C1427b.this.f6516e != null) {
                    if (TextUtils.isEmpty(str)) {
                        C1427b.this.f6516e.mo5409a(C1427b.this.f6514c);
                        C1432d unused = C1427b.this.f6516e;
                    } else {
                        C1781c c1781cM8703b = C1781c.m8703b(C1781c.m8671a(C1427b.this.f6514c));
                        c1781cM8703b.m8902p(str);
                        C1427b.this.m5487a(c1781cM8703b);
                    }
                }
            } catch (Exception e) {
                String unused2 = C1427b.this.f6513b;
                e.getMessage();
            }
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: a */
        public final void mo5498a(boolean z) {
            if (C1427b.this.f6516e != null) {
                C1427b.this.f6524m = z;
                if (z) {
                    C1432d unused = C1427b.this.f6516e;
                } else {
                    C1432d unused2 = C1427b.this.f6516e;
                }
            }
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: b */
        public final void mo5499b() {
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: c */
        public final void mo5500c() {
            String unused = C1427b.this.f6513b;
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: d */
        public final void mo5501d() {
        }

        @Override // com.anythink.expressad.advanced.p079d.InterfaceC1429a
        /* JADX INFO: renamed from: e */
        public final void mo5502e() {
            C1427b.m5471b(C1427b.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.b$4 */
    public class AnonymousClass4 implements InterfaceC1798a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ATNativeAdvancedView f6530a;

        public AnonymousClass4(ATNativeAdvancedView aTNativeAdvancedView) {
            aTNativeAdvancedView = aTNativeAdvancedView;
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: a */
        public final void mo5503a() {
            String string;
            C1427b.this.m5493e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = C1427b.this.f6513b;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: b */
        public final void mo5504b() {
            String string;
            C1427b.this.m5492d();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = C1427b.this.f6513b;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: c */
        public final void mo5505c() {
            String string;
            C1427b.this.m5492d();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = C1427b.this.f6513b;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.f6738a, strEncodeToString);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.c.b$5 */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f6532a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ATNativeAdvancedView f6533b;

        public AnonymousClass5(C1781c c1781c, ATNativeAdvancedView aTNativeAdvancedView) {
            c1781c = c1781c;
            aTNativeAdvancedView = aTNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1427b.this.m5488a(c1781c, aTNativeAdvancedView, false);
        }
    }

    public C1427b(Context context, String str, String str2) {
        this.f6522k = str2;
        this.f6523l = str;
        if (this.f6521j == null) {
            ImageView imageView = new ImageView(context);
            this.f6521j = imageView;
            imageView.setPadding(C1886t.m9834b(context, 2.0f), C1886t.m9834b(context, 2.0f), C1886t.m9834b(context, 2.0f), C1886t.m9834b(context, 2.0f));
            Context contextM2148f = C1175n.m2059a().m2148f();
            this.f6521j.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f6521j.getLayoutParams();
            this.f6521j.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(C1886t.m9834b(contextM2148f, 29.0f), C1886t.m9834b(contextM2148f, 16.0f)) : layoutParams);
            this.f6521j.setImageResource(C1875i.m9684a(contextM2148f, "anythink_native_advanced_close_icon", C1875i.f11528c));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5467a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f6525n);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5468a(C1781c c1781c, Context context, String str) {
        if (c1781c != null) {
            try {
                List<String> listM8869e = c1781c.m8869e();
                if (listM8869e == null || listM8869e.size() <= 0) {
                    return;
                }
                Iterator<String> it = listM8869e.iterator();
                while (it.hasNext()) {
                    C1405a.m5185a(context, c1781c, str, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5471b(C1427b c1427b) {
        C1432d c1432d = c1427b.f6516e;
        if (c1432d != null) {
            c1432d.mo5411c();
            c1427b.f6516e = null;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5472b(C1781c c1781c) {
        boolean z = true;
        if (c1781c.m8908s()) {
            z = false;
        } else {
            Context contextM2148f = C1175n.m2059a().m2148f();
            String str = this.f6522k;
            C1773a.m8548c().m8553b(contextM2148f);
            if (!TextUtils.isEmpty(c1781c.m8838ag())) {
                C1405a.m5186a(contextM2148f, c1781c, str, c1781c.m8838ag(), false, true, C1406a.f6269i);
            }
            if (!TextUtils.isEmpty(str) && c1781c.m8804L() != null && c1781c.m8804L().m9205o() != null) {
                C1405a.m5187a(contextM2148f, c1781c, str, c1781c.m8804L().m9205o(), false);
            }
            c1781c.m8865c(true);
            C1807f.m9397a(this.f6522k, c1781c, C1807f.f11183g);
        }
        if (z) {
            m5473b(c1781c, C1175n.m2059a().m2148f(), this.f6522k);
            m5468a(c1781c, C1175n.m2059a().m2148f(), this.f6522k);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m5473b(C1781c c1781c, Context context, String str) {
        if (c1781c != null) {
            try {
                if (TextUtils.isEmpty(c1781c.m8840ai())) {
                    return;
                }
                C1405a.m5186a(context, c1781c, str, c1781c.m8840ai(), false, true, C1406a.f6270j);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m5475c(C1781c c1781c, Context context, String str) {
        C1773a.m8548c().m8553b(context);
        if (!TextUtils.isEmpty(c1781c.m8838ag())) {
            C1405a.m5186a(context, c1781c, str, c1781c.m8838ag(), false, true, C1406a.f6269i);
        }
        if (TextUtils.isEmpty(str) || c1781c.m8804L() == null || c1781c.m8804L().m9205o() == null) {
            return;
        }
        C1405a.m5187a(context, c1781c, str, c1781c.m8804L().m9205o(), false);
    }

    /* JADX INFO: renamed from: f */
    private void m5479f() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        this.f6521j.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f6521j.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(C1886t.m9834b(contextM2148f, 29.0f), C1886t.m9834b(contextM2148f, 16.0f));
        }
        this.f6521j.setLayoutParams(layoutParams);
        this.f6521j.setImageResource(C1875i.m9684a(contextM2148f, "anythink_native_advanced_close_icon", C1875i.f11528c));
    }

    /* JADX INFO: renamed from: g */
    private void m5480g() {
        if (this.f6514c.m8814V()) {
            return;
        }
        boolean z = true;
        this.f6514c.m8865c(true);
        C1781c c1781c = this.f6514c;
        if (c1781c.m8908s()) {
            z = false;
        } else {
            Context contextM2148f = C1175n.m2059a().m2148f();
            String str = this.f6522k;
            C1773a.m8548c().m8553b(contextM2148f);
            if (!TextUtils.isEmpty(c1781c.m8838ag())) {
                C1405a.m5186a(contextM2148f, c1781c, str, c1781c.m8838ag(), false, true, C1406a.f6269i);
            }
            if (!TextUtils.isEmpty(str) && c1781c.m8804L() != null && c1781c.m8804L().m9205o() != null) {
                C1405a.m5187a(contextM2148f, c1781c, str, c1781c.m8804L().m9205o(), false);
            }
            c1781c.m8865c(true);
            C1807f.m9397a(this.f6522k, c1781c, C1807f.f11183g);
        }
        if (z) {
            m5473b(c1781c, C1175n.m2059a().m2148f(), this.f6522k);
            m5468a(c1781c, C1175n.m2059a().m2148f(), this.f6522k);
        }
        C1432d c1432d = this.f6516e;
        if (c1432d != null) {
            c1432d.mo5408a();
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m5481h() {
    }

    /* JADX INFO: renamed from: i */
    private void m5482i() {
        C1432d c1432d = this.f6516e;
        if (c1432d != null) {
            c1432d.mo5411c();
            this.f6516e = null;
        }
    }

    /* JADX INFO: renamed from: j */
    private static /* synthetic */ void m5483j() {
    }

    /* JADX INFO: renamed from: a */
    public final String m5484a() {
        C1781c c1781c = this.f6514c;
        return (c1781c == null || c1781c.m8818Z() == null) ? "" : this.f6514c.m8818Z();
    }

    /* JADX INFO: renamed from: a */
    public final void m5485a(C1431c c1431c) {
        this.f6518g = c1431c;
    }

    /* JADX INFO: renamed from: a */
    public final void m5486a(C1432d c1432d) {
        this.f6516e = c1432d;
    }

    /* JADX INFO: renamed from: a */
    public final void m5487a(C1781c c1781c) {
        c1781c.m8891l(this.f6522k);
        C1432d c1432d = this.f6516e;
        if (c1432d != null) {
            c1432d.mo5409a(c1781c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5488a(C1781c c1781c, ATNativeAdvancedView aTNativeAdvancedView, boolean z) {
        FeedBackButton feedBackButtonM9382b;
        if (aTNativeAdvancedView == null) {
            return;
        }
        C1800b.m9367a().m9380a(this.f6522k, new InterfaceC1798a() { // from class: com.anythink.expressad.advanced.c.b.4

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ATNativeAdvancedView f6530a;

            public AnonymousClass4(ATNativeAdvancedView aTNativeAdvancedView2) {
                aTNativeAdvancedView = aTNativeAdvancedView2;
            }

            @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
            /* JADX INFO: renamed from: a */
            public final void mo5503a() {
                String string;
                C1427b.this.m5493e();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (C1175n.m2059a().m2148f() != null) {
                        jSONObject.put("status", 1);
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    String unused = C1427b.this.f6513b;
                    th.getMessage();
                    string = "";
                }
                String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
                C1469j.m5701a();
                C1469j.m5703a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.f6738a, strEncodeToString);
            }

            @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
            /* JADX INFO: renamed from: b */
            public final void mo5504b() {
                String string;
                C1427b.this.m5492d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (C1175n.m2059a().m2148f() != null) {
                        jSONObject.put("status", 2);
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    String unused = C1427b.this.f6513b;
                    th.getMessage();
                    string = "";
                }
                String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
                C1469j.m5701a();
                C1469j.m5703a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.f6738a, strEncodeToString);
            }

            @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
            /* JADX INFO: renamed from: c */
            public final void mo5505c() {
                String string;
                C1427b.this.m5492d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (C1175n.m2059a().m2148f() != null) {
                        jSONObject.put("status", 2);
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    String unused = C1427b.this.f6513b;
                    th.getMessage();
                    string = "";
                }
                String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
                C1469j.m5701a();
                C1469j.m5703a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.f6738a, strEncodeToString);
            }
        });
        if (c1781c.m8800H() && C1800b.m9367a().m9384b() && (feedBackButtonM9382b = C1800b.m9367a().m9382b(this.f6522k)) != null) {
            RelativeLayout.LayoutParams layoutParams = null;
            try {
                layoutParams = (RelativeLayout.LayoutParams) feedBackButtonM9382b.getLayoutParams();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(C1800b.f10956a, C1800b.f10957b);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) feedBackButtonM9382b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(feedBackButtonM9382b);
            }
            aTNativeAdvancedView2.addView(feedBackButtonM9382b, layoutParams);
        }
        this.f6519h = this.f6519h;
        this.f6514c = c1781c;
        this.f6515d = aTNativeAdvancedView2;
        NativeAdvancedJSBridgeImpl advancedNativeJSBridgeImpl = aTNativeAdvancedView2.getAdvancedNativeJSBridgeImpl();
        if (advancedNativeJSBridgeImpl == null) {
            advancedNativeJSBridgeImpl = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView2.getContext(), this.f6523l, this.f6522k);
            List<C1781c> arrayList = new ArrayList<>();
            arrayList.add(c1781c);
            advancedNativeJSBridgeImpl.setCampaignList(arrayList);
        }
        advancedNativeJSBridgeImpl.setAllowSkip(this.f6519h ? 1 : 0);
        advancedNativeJSBridgeImpl.setNativeAdvancedBridgeListener(this.f6526o);
        aTNativeAdvancedView2.setAdvancedNativeJSBridgeImpl(advancedNativeJSBridgeImpl);
        if (c1781c.m8908s() || !this.f6519h) {
            this.f6521j.setVisibility(8);
        }
        ImageView imageView = this.f6521j;
        if (imageView != null) {
            imageView.setOnClickListener(this.f6525n);
        }
        aTNativeAdvancedView2.setCloseView(this.f6521j);
        boolean z3 = false;
        if (aTNativeAdvancedView2.getVisibility() != 0) {
            aTNativeAdvancedView2.setVisibility(0);
        }
        boolean zM9874a = C1891y.m9874a(aTNativeAdvancedView2.getAdvancedNativeWebview());
        C1431c c1431c = this.f6518g;
        if (c1431c == null || zM9874a || c1431c.m5545c() == null || this.f6518g.m5545c().getAlpha() < 0.5f || this.f6518g.m5545c().getVisibility() != 0 || this.f6524m) {
            if (z) {
                aTNativeAdvancedView2.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.5

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ C1781c f6532a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ ATNativeAdvancedView f6533b;

                    public AnonymousClass5(C1781c c1781c2, ATNativeAdvancedView aTNativeAdvancedView2) {
                        c1781c = c1781c2;
                        aTNativeAdvancedView = aTNativeAdvancedView2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1427b.this.m5488a(c1781c, aTNativeAdvancedView, false);
                    }
                }, 200L);
                return;
            }
            return;
        }
        aTNativeAdvancedView2.show();
        C1773a.m8548c().m8553b(aTNativeAdvancedView2.getContext());
        c1781c2.m8891l(this.f6522k);
        C1800b.m9367a().m9379a(this.f6522k, c1781c2);
        C1781c c1781c2 = this.f6514c;
        if (c1781c2 != null && c1781c2.m8856ay() && aTNativeAdvancedView2 != null) {
            aTNativeAdvancedView2.getAdvancedNativeWebview();
            try {
                C1420a.m5402c(c1781c2.m8818Z());
            } catch (Throwable th) {
                th.getMessage();
                C1781c c1781c3 = this.f6514c;
                if (c1781c3 != null) {
                    c1781c3.m8818Z();
                    this.f6514c.m8832aa();
                    this.f6514c.m10146aZ();
                }
            }
        }
        if (!this.f6514c.m8814V()) {
            this.f6514c.m8865c(true);
            C1781c c1781c4 = this.f6514c;
            if (!c1781c4.m8908s()) {
                Context contextM2148f = C1175n.m2059a().m2148f();
                String str = this.f6522k;
                C1773a.m8548c().m8553b(contextM2148f);
                if (!TextUtils.isEmpty(c1781c4.m8838ag())) {
                    C1405a.m5186a(contextM2148f, c1781c4, str, c1781c4.m8838ag(), false, true, C1406a.f6269i);
                }
                if (!TextUtils.isEmpty(str) && c1781c4.m8804L() != null && c1781c4.m8804L().m9205o() != null) {
                    C1405a.m5187a(contextM2148f, c1781c4, str, c1781c4.m8804L().m9205o(), false);
                }
                c1781c4.m8865c(true);
                C1807f.m9397a(this.f6522k, c1781c4, C1807f.f11183g);
                z3 = true;
            }
            if (z3) {
                m5473b(c1781c4, C1175n.m2059a().m2148f(), this.f6522k);
                m5468a(c1781c4, C1175n.m2059a().m2148f(), this.f6522k);
            }
            C1432d c1432d = this.f6516e;
            if (c1432d != null) {
                c1432d.mo5408a();
            }
        }
        int i = this.f6520i;
        if (i != -1) {
            aTNativeAdvancedView2.changeCloseBtnState(i);
        }
        C1420a.m5402c(c1781c2.m8818Z());
        this.f6512a.sendEmptyMessageDelayed(2, 1000L);
    }

    /* JADX INFO: renamed from: a */
    public final void m5489a(boolean z) {
        this.f6519h = z;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1429a m5490b() {
        return this.f6526o;
    }

    /* JADX INFO: renamed from: c */
    public final void m5491c() {
        if (this.f6516e != null) {
            this.f6516e = null;
        }
        if (this.f6526o != null) {
            this.f6526o = null;
        }
        if (this.f6525n != null) {
            this.f6525n = null;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f6515d;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        if (this.f6518g != null) {
            this.f6518g = null;
        }
        C1800b.m9367a().m9385c(this.f6522k);
    }

    /* JADX INFO: renamed from: d */
    public final void m5492d() {
        ATNativeAdvancedWebview advancedNativeWebview;
        if (this.f6515d == null || C1800b.f10958c || (advancedNativeWebview = this.f6515d.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        NativeAdvancedJsUtils.sendEventToH5(advancedNativeWebview, NativeAdvancedJsUtils.f6615b, "");
    }

    /* JADX INFO: renamed from: e */
    public final void m5493e() {
        ATNativeAdvancedWebview advancedNativeWebview;
        ATNativeAdvancedView aTNativeAdvancedView = this.f6515d;
        if (aTNativeAdvancedView == null || (advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        C1469j.m5701a();
        C1469j.m5703a((WebView) advancedNativeWebview, NativeAdvancedJsUtils.f6614a, "");
    }
}
