package com.anythink.expressad.video.dynview;

import android.content.Context;
import android.view.View;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2074c {

    /* JADX INFO: renamed from: a */
    private Context f13185a;

    /* JADX INFO: renamed from: b */
    private String f13186b;

    /* JADX INFO: renamed from: c */
    private int f13187c;

    /* JADX INFO: renamed from: d */
    private float f13188d;

    /* JADX INFO: renamed from: e */
    private float f13189e;

    /* JADX INFO: renamed from: f */
    private int f13190f;

    /* JADX INFO: renamed from: g */
    private int f13191g;

    /* JADX INFO: renamed from: h */
    private View f13192h;

    /* JADX INFO: renamed from: i */
    private List<C1781c> f13193i;

    /* JADX INFO: renamed from: j */
    private int f13194j;

    /* JADX INFO: renamed from: k */
    private boolean f13195k;

    /* JADX INFO: renamed from: l */
    private String f13196l;

    /* JADX INFO: renamed from: m */
    private int f13197m;

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.c$a */
    public static class a implements b {

        /* JADX INFO: renamed from: a */
        private Context f13198a;

        /* JADX INFO: renamed from: b */
        private String f13199b;

        /* JADX INFO: renamed from: c */
        private int f13200c;

        /* JADX INFO: renamed from: d */
        private float f13201d;

        /* JADX INFO: renamed from: e */
        private float f13202e;

        /* JADX INFO: renamed from: f */
        private int f13203f;

        /* JADX INFO: renamed from: g */
        private int f13204g;

        /* JADX INFO: renamed from: h */
        private View f13205h;

        /* JADX INFO: renamed from: i */
        private List<C1781c> f13206i;

        /* JADX INFO: renamed from: j */
        private int f13207j;

        /* JADX INFO: renamed from: k */
        private boolean f13208k;

        /* JADX INFO: renamed from: l */
        private String f13209l;

        /* JADX INFO: renamed from: m */
        private int f13210m;

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: a */
        public final b mo11109a(float f) {
            this.f13201d = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: a */
        public final b mo11110a(int i) {
            this.f13200c = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: a */
        public final b mo11111a(Context context) {
            this.f13198a = context.getApplicationContext();
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: a */
        public final b mo11112a(View view) {
            this.f13205h = view;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: a */
        public final b mo11113a(String str) {
            this.f13199b = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: a */
        public final b mo11114a(List<C1781c> list) {
            this.f13206i = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: a */
        public final b mo11115a(boolean z) {
            this.f13208k = z;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: a */
        public final C2074c mo11116a() {
            return new C2074c(this, (byte) 0);
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: b */
        public final b mo11117b(float f) {
            this.f13202e = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: b */
        public final b mo11118b(int i) {
            this.f13203f = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: b */
        public final b mo11119b(String str) {
            this.f13209l = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: c */
        public final b mo11120c(int i) {
            this.f13204g = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: d */
        public final b mo11121d(int i) {
            this.f13207j = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.C2074c.b
        /* JADX INFO: renamed from: e */
        public final b mo11122e(int i) {
            this.f13210m = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        b mo11109a(float f);

        /* JADX INFO: renamed from: a */
        b mo11110a(int i);

        /* JADX INFO: renamed from: a */
        b mo11111a(Context context);

        /* JADX INFO: renamed from: a */
        b mo11112a(View view);

        /* JADX INFO: renamed from: a */
        b mo11113a(String str);

        /* JADX INFO: renamed from: a */
        b mo11114a(List<C1781c> list);

        /* JADX INFO: renamed from: a */
        b mo11115a(boolean z);

        /* JADX INFO: renamed from: a */
        C2074c mo11116a();

        /* JADX INFO: renamed from: b */
        b mo11117b(float f);

        /* JADX INFO: renamed from: b */
        b mo11118b(int i);

        /* JADX INFO: renamed from: b */
        b mo11119b(String str);

        /* JADX INFO: renamed from: c */
        b mo11120c(int i);

        /* JADX INFO: renamed from: d */
        b mo11121d(int i);

        /* JADX INFO: renamed from: e */
        b mo11122e(int i);
    }

    private C2074c(a aVar) {
        this.f13189e = aVar.f13202e;
        this.f13188d = aVar.f13201d;
        this.f13190f = aVar.f13203f;
        this.f13191g = aVar.f13204g;
        this.f13185a = aVar.f13198a;
        this.f13186b = aVar.f13199b;
        this.f13187c = aVar.f13200c;
        this.f13192h = aVar.f13205h;
        this.f13193i = aVar.f13206i;
        this.f13194j = aVar.f13207j;
        this.f13195k = aVar.f13208k;
    }

    public /* synthetic */ C2074c(a aVar, byte b2) {
        this(aVar);
    }

    /* JADX INFO: renamed from: l */
    private static a m11086l() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public final Context m11087a() {
        return this.f13185a;
    }

    /* JADX INFO: renamed from: b */
    public final String m11088b() {
        return this.f13186b;
    }

    /* JADX INFO: renamed from: c */
    public final float m11089c() {
        return this.f13188d;
    }

    /* JADX INFO: renamed from: d */
    public final float m11090d() {
        return this.f13189e;
    }

    /* JADX INFO: renamed from: e */
    public final int m11091e() {
        return this.f13190f;
    }

    /* JADX INFO: renamed from: f */
    public final View m11092f() {
        return this.f13192h;
    }

    /* JADX INFO: renamed from: g */
    public final List<C1781c> m11093g() {
        return this.f13193i;
    }

    /* JADX INFO: renamed from: h */
    public final int m11094h() {
        return this.f13187c;
    }

    /* JADX INFO: renamed from: i */
    public final int m11095i() {
        return this.f13194j;
    }

    /* JADX INFO: renamed from: j */
    public final int m11096j() {
        return this.f13191g;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11097k() {
        return this.f13195k;
    }
}
