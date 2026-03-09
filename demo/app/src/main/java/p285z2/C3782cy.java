package p285z2;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p285z2.C3966hx;
import p285z2.C4299qx;

/* JADX INFO: renamed from: z2.cy */
/* JADX INFO: loaded from: classes2.dex */
public final class C3782cy {

    @Nullable
    public final C4225ox OooO00o;

    @Nullable
    public final C4299qx OooO0O0;

    /* JADX INFO: renamed from: z2.cy$OooO00o */
    public static class OooO00o {
        private long OooO;
        public final long OooO00o;
        public final C4225ox OooO0O0;
        public final C4299qx OooO0OO;
        private Date OooO0Oo;
        private Date OooO0o;
        private String OooO0o0;
        private String OooO0oO;
        private Date OooO0oo;
        private long OooOO0;
        private String OooOO0O;
        private int OooOO0o;

        public OooO00o(long j, C4225ox c4225ox, C4299qx c4299qx) {
            this.OooOO0o = -1;
            this.OooO00o = j;
            this.OooO0O0 = c4225ox;
            this.OooO0OO = c4299qx;
            if (c4299qx != null) {
                this.OooO = c4299qx.o0Oo0oo();
                this.OooOO0 = c4299qx.o0ooOoO();
                C3966hx c3966hxO00Oo0 = c4299qx.o00Oo0();
                int iOooOO0o = c3966hxO00Oo0.OooOO0o();
                for (int i = 0; i < iOooOO0o; i++) {
                    String strOooO0oO = c3966hxO00Oo0.OooO0oO(i);
                    String strOooOOO = c3966hxO00Oo0.OooOOO(i);
                    if ("Date".equalsIgnoreCase(strOooO0oO)) {
                        this.OooO0Oo = C4337ry.OooO0O0(strOooOOO);
                        this.OooO0o0 = strOooOOO;
                    } else if ("Expires".equalsIgnoreCase(strOooO0oO)) {
                        this.OooO0oo = C4337ry.OooO0O0(strOooOOO);
                    } else if ("Last-Modified".equalsIgnoreCase(strOooO0oO)) {
                        this.OooO0o = C4337ry.OooO0O0(strOooOOO);
                        this.OooO0oO = strOooOOO;
                    } else if ("ETag".equalsIgnoreCase(strOooO0oO)) {
                        this.OooOO0O = strOooOOO;
                    } else if ("Age".equalsIgnoreCase(strOooO0oO)) {
                        this.OooOO0o = C4374sy.OooO0oo(strOooOOO, -1);
                    }
                }
            }
        }

        private long OooO00o() {
            Date date = this.OooO0Oo;
            long jMax = date != null ? Math.max(0L, this.OooOO0 - date.getTime()) : 0L;
            int i = this.OooOO0o;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.OooOO0;
            return jMax + (j - this.OooO) + (this.OooO00o - j);
        }

        private long OooO0O0() {
            if (this.OooO0OO.OooooOo().OooO0o0() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.OooO0o0());
            }
            if (this.OooO0oo != null) {
                Date date = this.OooO0Oo;
                long time = this.OooO0oo.getTime() - (date != null ? date.getTime() : this.OooOO0);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.OooO0o == null || this.OooO0OO.o0OOO0o().OooOO0O().Oooo000() != null) {
                return 0L;
            }
            Date date2 = this.OooO0Oo;
            long time2 = (date2 != null ? date2.getTime() : this.OooO) - this.OooO0o.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        private C3782cy OooO0Oo() {
            if (this.OooO0OO == null) {
                return new C3782cy(this.OooO0O0, null);
            }
            if ((!this.OooO0O0.OooO0o() || this.OooO0OO.Ooooooo() != null) && C3782cy.OooO00o(this.OooO0OO, this.OooO0O0)) {
                C4298qw c4298qwOooO0O0 = this.OooO0O0.OooO0O0();
                if (c4298qwOooO0O0.OooO() || OooO0o0(this.OooO0O0)) {
                    return new C3782cy(this.OooO0O0, null);
                }
                C4298qw c4298qwOooooOo = this.OooO0OO.OooooOo();
                long jOooO00o = OooO00o();
                long jOooO0O0 = OooO0O0();
                if (c4298qwOooO0O0.OooO0o0() != -1) {
                    jOooO0O0 = Math.min(jOooO0O0, TimeUnit.SECONDS.toMillis(c4298qwOooO0O0.OooO0o0()));
                }
                long millis = 0;
                long millis2 = c4298qwOooO0O0.OooO0oO() != -1 ? TimeUnit.SECONDS.toMillis(c4298qwOooO0O0.OooO0oO()) : 0L;
                if (!c4298qwOooooOo.OooO0oo() && c4298qwOooO0O0.OooO0o() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(c4298qwOooO0O0.OooO0o());
                }
                if (!c4298qwOooooOo.OooO()) {
                    long j = millis2 + jOooO00o;
                    if (j < millis + jOooO0O0) {
                        C4299qx.OooO00o oooO00oO00oO0o = this.OooO0OO.o00oO0o();
                        if (j >= jOooO0O0) {
                            oooO00oO00oO0o.OooO00o("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jOooO00o > 86400000 && OooO0o()) {
                            oooO00oO00oO0o.OooO00o("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C3782cy(null, oooO00oO00oO0o.OooO0OO());
                    }
                }
                String str = this.OooOO0O;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.OooO0o != null) {
                    str = this.OooO0oO;
                } else {
                    if (this.OooO0Oo == null) {
                        return new C3782cy(this.OooO0O0, null);
                    }
                    str = this.OooO0o0;
                }
                C3966hx.OooO00o oooO00oOooO = this.OooO0O0.OooO0o0().OooO();
                AbstractC4484vx.OooO00o.OooO0O0(oooO00oOooO, str2, str);
                return new C3782cy(this.OooO0O0.OooO0oo().OooO(oooO00oOooO.OooO0oo()).OooO0O0(), this.OooO0OO);
            }
            return new C3782cy(this.OooO0O0, null);
        }

        private boolean OooO0o() {
            return this.OooO0OO.OooooOo().OooO0o0() == -1 && this.OooO0oo == null;
        }

        private static boolean OooO0o0(C4225ox c4225ox) {
            return (c4225ox.OooO0OO("If-Modified-Since") == null && c4225ox.OooO0OO("If-None-Match") == null) ? false : true;
        }

        public C3782cy OooO0OO() {
            C3782cy c3782cyOooO0Oo = OooO0Oo();
            return (c3782cyOooO0Oo.OooO00o == null || !this.OooO0O0.OooO0O0().OooOO0o()) ? c3782cyOooO0Oo : new C3782cy(null, null);
        }
    }

    public C3782cy(C4225ox c4225ox, C4299qx c4299qx) {
        this.OooO00o = c4225ox;
        this.OooO0O0 = c4299qx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.OooooOo().OooO0OO() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooO00o(p285z2.C4299qx r3, p285z2.C4225ox r4) {
        /*
            int r0 = r3.OoooooO()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.o0OoOo0(r0)
            if (r0 != 0) goto L5a
            z2.qw r0 = r3.OooooOo()
            int r0 = r0.OooO0o0()
            r1 = -1
            if (r0 != r1) goto L5a
            z2.qw r0 = r3.OooooOo()
            boolean r0 = r0.OooO0Oo()
            if (r0 != 0) goto L5a
            z2.qw r0 = r3.OooooOo()
            boolean r0 = r0.OooO0OO()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            z2.qw r3 = r3.OooooOo()
            boolean r3 = r3.OooOO0()
            if (r3 != 0) goto L6f
            z2.qw r3 = r4.OooO0O0()
            boolean r3 = r3.OooOO0()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3782cy.OooO00o(z2.qx, z2.ox):boolean");
    }
}
