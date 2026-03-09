package com.anythink.expressad.out;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.p089e.InterfaceC1491b;
import java.io.Serializable;

/* JADX INFO: renamed from: com.anythink.expressad.out.j */
/* JADX INFO: loaded from: classes.dex */
public class C1935j implements InterfaceC1491b, InterfaceC1819c, Serializable {

    /* JADX INFO: renamed from: a */
    private static final long f11922a = 1;

    /* JADX INFO: renamed from: cR */
    public static final int f11923cR = 1;

    /* JADX INFO: renamed from: cS */
    public static final int f11924cS = 2;

    /* JADX INFO: renamed from: cT */
    public static final int f11925cT = 3;

    /* JADX INFO: renamed from: cU */
    public String f11928cU;

    /* JADX INFO: renamed from: j */
    private double f11935j;

    /* JADX INFO: renamed from: l */
    private Object f11937l;

    /* JADX INFO: renamed from: n */
    private String f11939n;

    /* JADX INFO: renamed from: o */
    private Drawable f11940o;

    /* JADX INFO: renamed from: p */
    private Drawable f11941p;

    /* JADX INFO: renamed from: q */
    private InterfaceC1942q f11942q;

    /* JADX INFO: renamed from: b */
    private String f11926b = "";

    /* JADX INFO: renamed from: c */
    private String f11927c = "";

    /* JADX INFO: renamed from: d */
    private String f11929d = "";

    /* JADX INFO: renamed from: e */
    private String f11930e = "";

    /* JADX INFO: renamed from: f */
    private String f11931f = "";

    /* JADX INFO: renamed from: g */
    private String f11932g = "";

    /* JADX INFO: renamed from: h */
    private String f11933h = "";

    /* JADX INFO: renamed from: i */
    private long f11934i = 0;

    /* JADX INFO: renamed from: k */
    private int f11936k = 33333;

    /* JADX INFO: renamed from: m */
    private int f11938m = 1;

    /* JADX INFO: renamed from: r */
    private int f11943r = 0;

    /* JADX INFO: renamed from: s */
    private int f11944s = 0;

    /* JADX INFO: renamed from: t */
    private int f11945t = 0;

    /* JADX INFO: renamed from: a */
    private Drawable m10123a() {
        return this.f11940o;
    }

    /* JADX INFO: renamed from: a */
    private static Drawable m10124a(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    /* JADX INFO: renamed from: a */
    private void m10125a(int i) {
        this.f11943r = i;
    }

    /* JADX INFO: renamed from: a */
    private void m10126a(Drawable drawable) {
        this.f11940o = drawable;
    }

    /* JADX INFO: renamed from: a */
    private void m10127a(InterfaceC1942q interfaceC1942q) {
        this.f11942q = interfaceC1942q;
        if (TextUtils.isEmpty(this.f11932g)) {
            return;
        }
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(this.f11932g, this);
    }

    /* JADX INFO: renamed from: a */
    private void m10128a(Object obj) {
        this.f11937l = obj;
    }

    /* JADX INFO: renamed from: a */
    private void m10129a(String str) {
        this.f11939n = str;
    }

    /* JADX INFO: renamed from: b */
    private Drawable m10130b() {
        return this.f11941p;
    }

    /* JADX INFO: renamed from: b */
    private void m10131b(int i) {
        this.f11944s = i;
    }

    /* JADX INFO: renamed from: b */
    private void m10132b(Drawable drawable) {
        this.f11941p = drawable;
    }

    /* JADX INFO: renamed from: b */
    private void m10133b(InterfaceC1942q interfaceC1942q) {
        this.f11942q = interfaceC1942q;
        if (TextUtils.isEmpty(this.f11933h)) {
            return;
        }
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(this.f11933h, this);
    }

    /* JADX INFO: renamed from: c */
    private Object m10134c() {
        return this.f11937l;
    }

    /* JADX INFO: renamed from: c */
    private void m10135c(InterfaceC1942q interfaceC1942q) {
        this.f11942q = interfaceC1942q;
    }

    /* JADX INFO: renamed from: d */
    private String m10136d() {
        return this.f11928cU;
    }

    /* JADX INFO: renamed from: e */
    private int m10137e() {
        return this.f11943r;
    }

    /* JADX INFO: renamed from: f */
    private int m10138f() {
        return this.f11944s;
    }

    /* JADX INFO: renamed from: g */
    private String m10139g() {
        return this.f11939n;
    }

    /* JADX INFO: renamed from: A */
    public final void m10140A(String str) {
        this.f11933h = str;
    }

    /* JADX INFO: renamed from: B */
    public final void m10141B(String str) {
        this.f11931f = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m10142a(double d) {
        this.f11935j = d;
    }

    /* JADX INFO: renamed from: a */
    public final void m10143a(long j) {
        this.f11934i = j;
    }

    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
    /* JADX INFO: renamed from: a */
    public final void mo5462a(Bitmap bitmap, String str) {
        String str2;
        if (!TextUtils.isEmpty(this.f11933h) && this.f11933h.equals(str) && bitmap != null) {
            this.f11941p = m10124a(bitmap);
            if (this.f11942q != null) {
                m10124a(bitmap);
            }
        }
        if (TextUtils.isEmpty(this.f11932g) || (str2 = this.f11932g) == null || !str2.equals(str) || bitmap == null) {
            return;
        }
        this.f11940o = m10124a(bitmap);
        if (this.f11942q != null) {
            m10124a(bitmap);
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
    /* JADX INFO: renamed from: a */
    public final void mo5463a(String str, String str2) {
    }

    /* JADX INFO: renamed from: aX */
    public final double m10144aX() {
        return this.f11935j;
    }

    /* JADX INFO: renamed from: aY */
    public final int m10145aY() {
        return this.f11936k;
    }

    /* JADX INFO: renamed from: aZ */
    public final String m10146aZ() {
        return this.f11926b;
    }

    /* JADX INFO: renamed from: ba */
    public final String m10147ba() {
        return this.f11927c;
    }

    /* JADX INFO: renamed from: bb */
    public final String m10148bb() {
        return this.f11929d;
    }

    /* JADX INFO: renamed from: bc */
    public final String m10149bc() {
        return this.f11930e;
    }

    /* JADX INFO: renamed from: bd */
    public final String m10150bd() {
        return this.f11932g;
    }

    /* JADX INFO: renamed from: be */
    public final String m10151be() {
        return this.f11933h;
    }

    /* JADX INFO: renamed from: bf */
    public final int m10152bf() {
        return this.f11938m;
    }

    /* JADX INFO: renamed from: bg */
    public final long m10153bg() {
        return this.f11934i;
    }

    /* JADX INFO: renamed from: bh */
    public final String m10154bh() {
        return this.f11931f;
    }

    /* JADX INFO: renamed from: bi */
    public final int m10155bi() {
        return this.f11945t;
    }

    /* JADX INFO: renamed from: o */
    public final void m10156o(int i) {
        this.f11936k = i;
    }

    /* JADX INFO: renamed from: o */
    public void mo8900o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11928cU = str;
    }

    /* JADX INFO: renamed from: p */
    public final void m10157p(int i) {
        this.f11938m = i;
    }

    /* JADX INFO: renamed from: q */
    public final void m10158q(int i) {
        this.f11945t = i;
    }

    /* JADX INFO: renamed from: v */
    public final void m10159v(String str) {
        this.f11926b = str;
    }

    /* JADX INFO: renamed from: w */
    public final void m10160w(String str) {
        this.f11927c = str;
    }

    /* JADX INFO: renamed from: x */
    public final void m10161x(String str) {
        this.f11929d = str;
    }

    /* JADX INFO: renamed from: y */
    public final void m10162y(String str) {
        this.f11930e = str;
    }

    /* JADX INFO: renamed from: z */
    public final void m10163z(String str) {
        this.f11932g = str;
    }
}
