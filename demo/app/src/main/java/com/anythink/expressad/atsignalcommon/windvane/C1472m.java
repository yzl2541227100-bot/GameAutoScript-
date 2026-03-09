package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.base.C1453e;
import com.anythink.expressad.atsignalcommon.mraid.MraidUriUtil;
import com.anythink.expressad.atsignalcommon.p082b.C1446c;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1472m implements Handler.Callback, InterfaceC1463d {

    /* JADX INFO: renamed from: a */
    public Pattern f6787a;

    /* JADX INFO: renamed from: b */
    public String f6788b;

    /* JADX INFO: renamed from: d */
    public Context f6790d;

    /* JADX INFO: renamed from: e */
    public WindVaneWebView f6791e;

    /* JADX INFO: renamed from: c */
    public final int f6789c = 1;

    /* JADX INFO: renamed from: f */
    public Handler f6792f = new Handler(Looper.getMainLooper(), this);

    public C1472m(Context context) {
        this.f6790d = context;
    }

    /* JADX INFO: renamed from: a */
    private void m5706a(C1460a c1460a) {
        WindVaneWebView windVaneWebView = c1460a.f6757a;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(c1460a.f6760d);
        if (jsObject == null) {
            return;
        }
        try {
            C1446c.f fVarM5606a = C1446c.m5589a(this.f6790d.getClassLoader(), jsObject.getClass().getName()).m5606a(c1460a.f6761e, Object.class, String.class);
            fVarM5606a.m5617a();
            if (jsObject == null || !(jsObject instanceof AbstractC1471l)) {
                return;
            }
            c1460a.f6758b = jsObject;
            c1460a.f6759c = fVarM5606a;
            c1460a.f6758b = jsObject;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = c1460a;
            this.f6792f.sendMessage(messageObtain);
        } catch (C1446c.b.a e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5707b(C1460a c1460a) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = c1460a;
        this.f6792f.sendMessage(messageObtain);
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1463d
    /* JADX INFO: renamed from: a */
    public final WebView mo5676a() {
        return this.f6791e;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1463d
    /* JADX INFO: renamed from: a */
    public final void mo5677a(WindVaneWebView windVaneWebView) {
        this.f6791e = windVaneWebView;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1463d
    /* JADX INFO: renamed from: a */
    public final void mo5678a(Pattern pattern) {
        this.f6787a = pattern;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1463d
    /* JADX INFO: renamed from: a */
    public final boolean mo5679a(String str) {
        if (!C1473n.m5708a(str)) {
            return false;
        }
        this.f6787a = C1473n.m5709b(str);
        this.f6788b = str;
        return true;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1463d
    /* JADX INFO: renamed from: b */
    public final C1460a mo5680b(String str) {
        if (str == null) {
            return null;
        }
        C1460a mraidMethodContext = MraidUriUtil.getMraidMethodContext(this.f6791e, str);
        if (mraidMethodContext == null) {
            Matcher matcher = this.f6787a.matcher(str);
            if (matcher.matches()) {
                mraidMethodContext = new C1460a();
                int iGroupCount = matcher.groupCount();
                if (iGroupCount >= 5) {
                    mraidMethodContext.f6762f = matcher.group(5);
                }
                if (iGroupCount >= 3) {
                    mraidMethodContext.f6760d = matcher.group(1);
                    mraidMethodContext.f6763g = matcher.group(2);
                    String strGroup = matcher.group(3);
                    mraidMethodContext.f6761e = strGroup;
                    HashMap<String, String> map = C1453e.f6688k;
                    if (map != null && map.containsKey(strGroup)) {
                        mraidMethodContext.f6761e = C1453e.f6688k.get(mraidMethodContext.f6761e);
                    }
                }
            }
            return null;
        }
        mraidMethodContext.f6757a = this.f6791e;
        return mraidMethodContext;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1463d
    /* JADX INFO: renamed from: b */
    public final String mo5681b() {
        return this.f6788b;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1463d
    /* JADX INFO: renamed from: c */
    public final void mo5682c(String str) {
        C1460a mraidMethodContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str == null) {
            mraidMethodContext = null;
        } else {
            mraidMethodContext = MraidUriUtil.getMraidMethodContext(this.f6791e, str);
            if (mraidMethodContext == null) {
                Matcher matcher = this.f6787a.matcher(str);
                if (matcher.matches()) {
                    mraidMethodContext = new C1460a();
                    int iGroupCount = matcher.groupCount();
                    if (iGroupCount >= 5) {
                        mraidMethodContext.f6762f = matcher.group(5);
                    }
                    if (iGroupCount >= 3) {
                        mraidMethodContext.f6760d = matcher.group(1);
                        mraidMethodContext.f6763g = matcher.group(2);
                        String strGroup = matcher.group(3);
                        mraidMethodContext.f6761e = strGroup;
                        HashMap<String, String> map = C1453e.f6688k;
                        if (map != null && map.containsKey(strGroup)) {
                            mraidMethodContext.f6761e = C1453e.f6688k.get(mraidMethodContext.f6761e);
                        }
                    }
                }
                mraidMethodContext = null;
            }
            mraidMethodContext.f6757a = this.f6791e;
        }
        if (mraidMethodContext == null) {
            return;
        }
        WindVaneWebView windVaneWebView = mraidMethodContext.f6757a;
        Object jsObject = windVaneWebView != null ? windVaneWebView.getJsObject(mraidMethodContext.f6760d) : null;
        if (jsObject == null) {
            return;
        }
        try {
            C1446c.f fVarM5606a = C1446c.m5589a(this.f6790d.getClassLoader(), jsObject.getClass().getName()).m5606a(mraidMethodContext.f6761e, Object.class, String.class);
            fVarM5606a.m5617a();
            if (jsObject == null || !(jsObject instanceof AbstractC1471l)) {
                return;
            }
            mraidMethodContext.f6758b = jsObject;
            mraidMethodContext.f6759c = fVarM5606a;
            mraidMethodContext.f6758b = jsObject;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = mraidMethodContext;
            this.f6792f.sendMessage(messageObtain);
        } catch (C1446c.b.a e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.InterfaceC1463d
    /* JADX INFO: renamed from: d */
    public final void mo5683d(String str) {
        this.f6788b = str;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1460a c1460a = (C1460a) message.obj;
        if (c1460a == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = c1460a.f6758b;
                C1446c.f fVar = c1460a.f6759c;
                Object[] objArr = new Object[2];
                objArr[0] = c1460a;
                objArr[1] = TextUtils.isEmpty(c1460a.f6762f) ? MessageFormatter.DELIM_STR : c1460a.f6762f;
                fVar.m5616a(obj, objArr);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
