package p285z2;

import com.github.kevinsawicki.http.HttpRequest;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.helpers.MessageFormatter;
import p285z2.C3966hx;
import p285z2.o000000O;

/* JADX INFO: renamed from: z2.ox */
/* JADX INFO: loaded from: classes2.dex */
public final class C4225ox {
    public final C4003ix OooO00o;
    public final String OooO0O0;
    public final C3966hx OooO0OO;

    @Nullable
    public final AbstractC4262px OooO0Oo;

    @Nullable
    private volatile C4298qw OooO0o;
    public final Map<Class<?>, Object> OooO0o0;

    /* JADX INFO: renamed from: z2.ox$OooO00o */
    public static class OooO00o {

        @Nullable
        public C4003ix OooO00o;
        public String OooO0O0;
        public C3966hx.OooO00o OooO0OO;

        @Nullable
        public AbstractC4262px OooO0Oo;
        public Map<Class<?>, Object> OooO0o0;

        public OooO00o() {
            this.OooO0o0 = Collections.emptyMap();
            this.OooO0O0 = "GET";
            this.OooO0OO = new C3966hx.OooO00o();
        }

        public OooO00o(C4225ox c4225ox) {
            this.OooO0o0 = Collections.emptyMap();
            this.OooO00o = c4225ox.OooO00o;
            this.OooO0O0 = c4225ox.OooO0O0;
            this.OooO0Oo = c4225ox.OooO0Oo;
            this.OooO0o0 = c4225ox.OooO0o0.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(c4225ox.OooO0o0);
            this.OooO0OO = c4225ox.OooO0OO.OooO();
        }

        public OooO00o OooO(C3966hx c3966hx) {
            this.OooO0OO = c3966hx.OooO();
            return this;
        }

        public OooO00o OooO00o(String str, String str2) {
            this.OooO0OO.OooO0O0(str, str2);
            return this;
        }

        public C4225ox OooO0O0() {
            if (this.OooO00o != null) {
                return new C4225ox(this);
            }
            throw new IllegalStateException("url == null");
        }

        public OooO00o OooO0OO(C4298qw c4298qw) {
            String string = c4298qw.toString();
            return string.isEmpty() ? OooOOO("Cache-Control") : OooO0oo("Cache-Control", string);
        }

        public OooO00o OooO0Oo() {
            return OooO0o0(C4558xx.OooO0Oo);
        }

        public OooO00o OooO0o() {
            return OooOO0("GET", null);
        }

        public OooO00o OooO0o0(@Nullable AbstractC4262px abstractC4262px) {
            return OooOO0(HttpRequest.METHOD_DELETE, abstractC4262px);
        }

        public OooO00o OooO0oO() {
            return OooOO0("HEAD", null);
        }

        public OooO00o OooO0oo(String str, String str2) {
            this.OooO0OO.OooOO0O(str, str2);
            return this;
        }

        public OooO00o OooOO0(String str, @Nullable AbstractC4262px abstractC4262px) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (abstractC4262px != null && !C4411ty.OooO0O0(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (abstractC4262px != null || !C4411ty.OooO0o0(str)) {
                this.OooO0O0 = str;
                this.OooO0Oo = abstractC4262px;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        public OooO00o OooOO0O(AbstractC4262px abstractC4262px) {
            return OooOO0(o000000O.OooO00o.OooO00o, abstractC4262px);
        }

        public OooO00o OooOO0o(AbstractC4262px abstractC4262px) {
            return OooOO0("POST", abstractC4262px);
        }

        public OooO00o OooOOO(String str) {
            this.OooO0OO.OooOO0(str);
            return this;
        }

        public OooO00o OooOOO0(AbstractC4262px abstractC4262px) {
            return OooOO0(HttpRequest.METHOD_PUT, abstractC4262px);
        }

        public <T> OooO00o OooOOOO(Class<? super T> cls, @Nullable T t) {
            Objects.requireNonNull(cls, "type == null");
            if (t == null) {
                this.OooO0o0.remove(cls);
            } else {
                if (this.OooO0o0.isEmpty()) {
                    this.OooO0o0 = new LinkedHashMap();
                }
                this.OooO0o0.put(cls, cls.cast(t));
            }
            return this;
        }

        public OooO00o OooOOOo(@Nullable Object obj) {
            return OooOOOO(Object.class, obj);
        }

        public OooO00o OooOOo(URL url) {
            Objects.requireNonNull(url, "url == null");
            return OooOOoo(C4003ix.OooOOO0(url.toString()));
        }

        public OooO00o OooOOo0(String str) {
            StringBuilder sb;
            int i;
            Objects.requireNonNull(str, "url == null");
            if (!str.regionMatches(true, 0, "ws:", 0, 3)) {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    sb = new StringBuilder();
                    sb.append("https:");
                    i = 4;
                }
                return OooOOoo(C4003ix.OooOOO0(str));
            }
            sb = new StringBuilder();
            sb.append("http:");
            i = 3;
            sb.append(str.substring(i));
            str = sb.toString();
            return OooOOoo(C4003ix.OooOOO0(str));
        }

        public OooO00o OooOOoo(C4003ix c4003ix) {
            Objects.requireNonNull(c4003ix, "url == null");
            this.OooO00o = c4003ix;
            return this;
        }
    }

    public C4225ox(OooO00o oooO00o) {
        this.OooO00o = oooO00o.OooO00o;
        this.OooO0O0 = oooO00o.OooO0O0;
        this.OooO0OO = oooO00o.OooO0OO.OooO0oo();
        this.OooO0Oo = oooO00o.OooO0Oo;
        this.OooO0o0 = C4558xx.OooOo0o(oooO00o.OooO0o0);
    }

    @Nullable
    public Object OooO() {
        return OooOO0(Object.class);
    }

    @Nullable
    public AbstractC4262px OooO00o() {
        return this.OooO0Oo;
    }

    public C4298qw OooO0O0() {
        C4298qw c4298qw = this.OooO0o;
        if (c4298qw != null) {
            return c4298qw;
        }
        C4298qw c4298qwOooOOO0 = C4298qw.OooOOO0(this.OooO0OO);
        this.OooO0o = c4298qwOooOOO0;
        return c4298qwOooOOO0;
    }

    @Nullable
    public String OooO0OO(String str) {
        return this.OooO0OO.OooO0Oo(str);
    }

    public List<String> OooO0Oo(String str) {
        return this.OooO0OO.OooOOOO(str);
    }

    public boolean OooO0o() {
        return this.OooO00o.OooOOo0();
    }

    public C3966hx OooO0o0() {
        return this.OooO0OO;
    }

    public String OooO0oO() {
        return this.OooO0O0;
    }

    public OooO00o OooO0oo() {
        return new OooO00o(this);
    }

    @Nullable
    public <T> T OooOO0(Class<? extends T> cls) {
        return cls.cast(this.OooO0o0.get(cls));
    }

    public C4003ix OooOO0O() {
        return this.OooO00o;
    }

    public String toString() {
        return "Request{method=" + this.OooO0O0 + ", url=" + this.OooO00o + ", tags=" + this.OooO0o0 + MessageFormatter.DELIM_STOP;
    }
}
