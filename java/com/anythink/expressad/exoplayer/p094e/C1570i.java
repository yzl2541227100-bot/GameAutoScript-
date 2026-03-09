package com.anythink.expressad.exoplayer.p094e;

import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p097g.p099b.C1590e;
import com.anythink.expressad.exoplayer.p097g.p099b.C1592g;
import com.anythink.expressad.exoplayer.p097g.p099b.C1594i;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1570i {

    /* JADX INFO: renamed from: d */
    private static final String f8377d = "com.apple.iTunes";

    /* JADX INFO: renamed from: e */
    private static final String f8378e = "iTunSMPB";

    /* JADX INFO: renamed from: b */
    public int f8380b = -1;

    /* JADX INFO: renamed from: c */
    public int f8381c = -1;

    /* JADX INFO: renamed from: a */
    public static final C1592g.a f8376a = new C1592g.a() { // from class: com.anythink.expressad.exoplayer.e.i.1
        @Override // com.anythink.expressad.exoplayer.p097g.p099b.C1592g.a
        /* JADX INFO: renamed from: a */
        public final boolean mo6992a(int i, int i2, int i3, int i4, int i5) {
            if (i2 == 67 && i3 == 79 && i4 == 77) {
                return i5 == 77 || i == 2;
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: f */
    private static final Pattern f8379f = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    private boolean m6988a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f8380b = i2;
        this.f8381c = i3;
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m6989a(String str) {
        Matcher matcher = f8379f.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt(matcher.group(1), 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f8380b = i;
            this.f8381c = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6990a() {
        return (this.f8380b == -1 || this.f8381c == -1) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6991a(C1582a c1582a) {
        for (int i = 0; i < c1582a.m7085a(); i++) {
            C1582a.a aVarM7086a = c1582a.m7086a(i);
            if (aVarM7086a instanceof C1590e) {
                C1590e c1590e = (C1590e) aVarM7086a;
                if (f8378e.equals(c1590e.f8528c) && m6989a(c1590e.f8529d)) {
                    return true;
                }
            } else if (aVarM7086a instanceof C1594i) {
                C1594i c1594i = (C1594i) aVarM7086a;
                if (f8377d.equals(c1594i.f8557b) && f8378e.equals(c1594i.f8558c) && m6989a(c1594i.f8559d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
