package com.anythink.basead.p025ui.p027b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.ui.b.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0989b {

    /* JADX INFO: renamed from: a */
    public Context f1977a;

    /* JADX INFO: renamed from: b */
    public AbstractC1247l f1978b;

    /* JADX INFO: renamed from: c */
    public C1248m f1979c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f1980d;

    /* JADX INFO: renamed from: e */
    public int f1981e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f1982f;

    /* JADX INFO: renamed from: g */
    public View f1983g;

    /* JADX INFO: renamed from: h */
    public a f1984h;

    /* JADX INFO: renamed from: com.anythink.basead.ui.b.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo534a(int i, int i2);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1180a();

    /* JADX INFO: renamed from: a */
    public abstract void mo1181a(int i, Map<String, Object> map);

    /* JADX INFO: renamed from: a */
    public void mo1182a(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, a aVar) {
        this.f1977a = context;
        this.f1978b = abstractC1247l;
        this.f1979c = c1248m;
        this.f1980d = viewGroup;
        this.f1981e = i;
        this.f1984h = aVar;
        this.f1982f = relativeLayout;
        this.f1983g = view;
    }
}
