package mobi.oneway.export.p275b.p277b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mobi.oneway.export.AdListener.feed.OWFeedAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.OnewayAdCloseType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.feed.C3628a;
import mobi.oneway.export.feed.IFeedAd;
import mobi.oneway.export.p281f.C3613a;
import mobi.oneway.export.p281f.C3624d;

/* JADX INFO: renamed from: mobi.oneway.export.b.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3592c extends AbstractC3591b<OWFeedAdListener> {

    /* JADX INFO: renamed from: c */
    private Map<String, List<IFeedAd>> f19654c;

    /* JADX INFO: renamed from: d */
    private List<String> f19655d;

    /* JADX INFO: renamed from: e */
    private List<C3613a> f19656e;

    public C3592c(AdType adType, List<C3613a> list, List<String> list2, long j) {
        super(adType, list2, j);
        this.f19654c = new HashMap();
        this.f19656e = list;
        this.f19655d = list2;
    }

    /* JADX INFO: renamed from: f */
    private List<IFeedAd> m16719f() {
        C3613a c3613aM16877a;
        List<IFeedAd> arrayList = new ArrayList<>();
        Iterator<String> it = this.f19655d.iterator();
        while (true) {
            if (!it.hasNext()) {
                c3613aM16877a = null;
                break;
            }
            String next = it.next();
            List<IFeedAd> list = this.f19654c.get(next);
            if (list != null) {
                c3613aM16877a = C3624d.m16877a(this.f19656e, next);
                arrayList = list;
                break;
            }
            arrayList = list;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, new C3628a(arrayList.get(i), c3613aM16877a));
        }
        return arrayList;
    }

    @Override // mobi.oneway.export.p275b.p277b.AbstractC3591b
    /* JADX INFO: renamed from: a */
    public void mo16694a() {
        if (this.f19643a != 0) {
            ((OWFeedAdListener) this.f19643a).onAdLoad(m16719f());
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.AbstractC3591b
    /* JADX INFO: renamed from: a */
    public void mo16695a(String str) {
        T t = this.f19643a;
        if (t != 0) {
            ((OWFeedAdListener) t).onError(OnewaySdkError.LOAD_ERROR, str);
        }
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16696a(String str, List<IFeedAd> list) {
        m16717f(str);
        this.f19654c.put(str, list);
        if (!m16715d() || this.f19643a == 0) {
            return;
        }
        ((OWFeedAdListener) this.f19643a).onAdLoad(m16719f());
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16697a(String str, OnewayAdCloseType onewayAdCloseType) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16698a(String str, OnewayAdCloseType onewayAdCloseType, String str2) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: a */
    public void mo16699a(String str, OnewaySdkError onewaySdkError, String str2) {
        T t;
        m16718g(str);
        if (!m16716e() || (t = this.f19643a) == 0) {
            return;
        }
        ((OWFeedAdListener) t).onError(onewaySdkError, str2);
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: b */
    public void mo16700b(String str) {
    }

    @Override // mobi.oneway.export.p275b.p277b.AbstractC3591b
    /* JADX INFO: renamed from: c */
    public void mo16714c() {
        super.mo16714c();
        this.f19654c.clear();
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: c */
    public void mo16701c(String str) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: d */
    public void mo16702d(String str) {
    }

    @Override // mobi.oneway.export.p275b.p277b.InterfaceC3593d
    /* JADX INFO: renamed from: e */
    public void mo16703e(String str) {
    }
}
