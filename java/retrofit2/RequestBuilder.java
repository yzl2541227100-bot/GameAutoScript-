package retrofit2;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p285z2.AbstractC4262px;
import p285z2.C3892fx;
import p285z2.C3966hx;
import p285z2.C4003ix;
import p285z2.C4077kx;
import p285z2.C4114lx;
import p285z2.C4225ox;
import p285z2.h00;
import p285z2.i00;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final C4003ix baseUrl;

    @Nullable
    private AbstractC4262px body;

    @Nullable
    private C4077kx contentType;

    @Nullable
    private C3892fx.OooO00o formBuilder;
    private final boolean hasBody;
    private final C3966hx.OooO00o headersBuilder;
    private final String method;

    @Nullable
    private C4114lx.OooO00o multipartBuilder;

    @Nullable
    private String relativeUrl;
    private final C4225ox.OooO00o requestBuilder = new C4225ox.OooO00o();

    @Nullable
    private C4003ix.OooO00o urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    public static class ContentTypeOverridingRequestBody extends AbstractC4262px {
        private final C4077kx contentType;
        private final AbstractC4262px delegate;

        public ContentTypeOverridingRequestBody(AbstractC4262px abstractC4262px, C4077kx c4077kx) {
            this.delegate = abstractC4262px;
            this.contentType = c4077kx;
        }

        @Override // p285z2.AbstractC4262px
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // p285z2.AbstractC4262px
        public C4077kx contentType() {
            return this.contentType;
        }

        @Override // p285z2.AbstractC4262px
        public void writeTo(i00 i00Var) throws IOException {
            this.delegate.writeTo(i00Var);
        }
    }

    public RequestBuilder(String str, C4003ix c4003ix, @Nullable String str2, @Nullable C3966hx c3966hx, @Nullable C4077kx c4077kx, boolean z, boolean z3, boolean z4) {
        this.method = str;
        this.baseUrl = c4003ix;
        this.relativeUrl = str2;
        this.contentType = c4077kx;
        this.hasBody = z;
        this.headersBuilder = c3966hx != null ? c3966hx.OooO() : new C3966hx.OooO00o();
        if (z3) {
            this.formBuilder = new C3892fx.OooO00o();
        } else if (z4) {
            C4114lx.OooO00o oooO00o = new C4114lx.OooO00o();
            this.multipartBuilder = oooO00o;
            oooO00o.OooO0oO(C4114lx.OooOO0);
        }
    }

    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                h00 h00Var = new h00();
                h00Var.OooOooo(str, 0, iCharCount);
                canonicalizeForPath(h00Var, str, iCharCount, length, z);
                return h00Var.Oooo0oo();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void canonicalizeForPath(h00 h00Var, String str, int i, int i2, boolean z) {
        h00 h00Var2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (h00Var2 == null) {
                        h00Var2 = new h00();
                    }
                    h00Var2.OooO0oO(iCodePointAt);
                    while (!h00Var2.OooOOO()) {
                        int i3 = h00Var2.readByte() & 255;
                        h00Var.OooOOOO(37);
                        char[] cArr = HEX_DIGITS;
                        h00Var.OooOOOO(cArr[(i3 >> 4) & 15]);
                        h00Var.OooOOOO(cArr[i3 & 15]);
                    }
                } else {
                    h00Var.OooO0oO(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.OooO0O0(str, str2);
        } else {
            this.formBuilder.OooO00o(str, str2);
        }
    }

    public void addHeader(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.headersBuilder.OooO0O0(str, str2);
            return;
        }
        try {
            this.contentType = C4077kx.OooO0OO(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e);
        }
    }

    public void addHeaders(C3966hx c3966hx) {
        this.headersBuilder.OooO0Oo(c3966hx);
    }

    public void addPart(C3966hx c3966hx, AbstractC4262px abstractC4262px) {
        this.multipartBuilder.OooO0OO(c3966hx, abstractC4262px);
    }

    public void addPart(C4114lx.OooO0O0 oooO0O0) {
        this.multipartBuilder.OooO0Oo(oooO0O0);
    }

    public void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String strCanonicalizeForPath = canonicalizeForPath(str2, z);
        String strReplace = this.relativeUrl.replace("{" + str + "}", strCanonicalizeForPath);
        if (!PATH_TRAVERSAL.matcher(strReplace).matches()) {
            this.relativeUrl = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    public void addQueryParam(String str, @Nullable String str2, boolean z) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            C4003ix.OooO00o oooO00oOooOo00 = this.baseUrl.OooOo00(str3);
            this.urlBuilder = oooO00oOooOo00;
            if (oooO00oOooOo00 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (z) {
            this.urlBuilder.OooO0OO(str, str2);
        } else {
            this.urlBuilder.OooO0oO(str, str2);
        }
    }

    public <T> void addTag(Class<T> cls, @Nullable T t) {
        this.requestBuilder.OooOOOO(cls, t);
    }

    public C4225ox.OooO00o get() {
        C4003ix c4003ixOooo0oo;
        C4003ix.OooO00o oooO00o = this.urlBuilder;
        if (oooO00o != null) {
            c4003ixOooo0oo = oooO00o.OooO0oo();
        } else {
            c4003ixOooo0oo = this.baseUrl.Oooo0oo(this.relativeUrl);
            if (c4003ixOooo0oo == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        AbstractC4262px contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            C3892fx.OooO00o oooO00o2 = this.formBuilder;
            if (oooO00o2 != null) {
                contentTypeOverridingRequestBody = oooO00o2.OooO0OO();
            } else {
                C4114lx.OooO00o oooO00o3 = this.multipartBuilder;
                if (oooO00o3 != null) {
                    contentTypeOverridingRequestBody = oooO00o3.OooO0o();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = AbstractC4262px.create((C4077kx) null, new byte[0]);
                }
            }
        }
        C4077kx c4077kx = this.contentType;
        if (c4077kx != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, c4077kx);
            } else {
                this.headersBuilder.OooO0O0("Content-Type", c4077kx.toString());
            }
        }
        return this.requestBuilder.OooOOoo(c4003ixOooo0oo).OooO(this.headersBuilder.OooO0oo()).OooOO0(this.method, contentTypeOverridingRequestBody);
    }

    public void setBody(AbstractC4262px abstractC4262px) {
        this.body = abstractC4262px;
    }

    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }
}
