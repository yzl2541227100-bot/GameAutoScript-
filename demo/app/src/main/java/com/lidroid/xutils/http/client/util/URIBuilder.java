package com.lidroid.xutils.http.client.util;

import android.text.TextUtils;
import com.lidroid.xutils.util.LogUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class URIBuilder {
    private String encodedAuthority;
    private String encodedFragment;
    private String encodedPath;
    private String encodedQuery;
    private String encodedSchemeSpecificPart;
    private String encodedUserInfo;
    private String fragment;
    private String host;
    private String path;
    private int port;
    private List<NameValuePair> queryParams;
    private String scheme;
    private String userInfo;

    public URIBuilder() {
        this.port = -1;
    }

    public URIBuilder(String str) {
        try {
            digestURI(new URI(str));
        } catch (URISyntaxException e) {
            LogUtils.m13791e(e.getMessage(), e);
        }
    }

    public URIBuilder(URI uri) {
        digestURI(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String buildString(java.nio.charset.Charset r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.scheme
            if (r1 == 0) goto L11
            r0.append(r1)
            r1 = 58
            r0.append(r1)
        L11:
            java.lang.String r1 = r3.encodedSchemeSpecificPart
            if (r1 == 0) goto L1a
        L15:
            r0.append(r1)
            goto La2
        L1a:
            java.lang.String r1 = r3.encodedAuthority
            java.lang.String r2 = "//"
            if (r1 == 0) goto L29
            r0.append(r2)
            java.lang.String r1 = r3.encodedAuthority
            r0.append(r1)
            goto L6e
        L29:
            java.lang.String r1 = r3.host
            if (r1 == 0) goto L6e
            r0.append(r2)
            java.lang.String r1 = r3.encodedUserInfo
            java.lang.String r2 = "@"
            if (r1 == 0) goto L3d
        L36:
            r0.append(r1)
            r0.append(r2)
            goto L46
        L3d:
            java.lang.String r1 = r3.userInfo
            if (r1 == 0) goto L46
            java.lang.String r1 = r3.encodeUserInfo(r1, r4)
            goto L36
        L46:
            java.lang.String r1 = r3.host
            boolean r1 = org.apache.http.conn.util.InetAddressUtils.isIPv6Address(r1)
            if (r1 == 0) goto L5b
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.String r1 = r3.host
            r0.append(r1)
            java.lang.String r1 = "]"
            goto L5d
        L5b:
            java.lang.String r1 = r3.host
        L5d:
            r0.append(r1)
            int r1 = r3.port
            if (r1 < 0) goto L6e
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r3.port
            r0.append(r1)
        L6e:
            java.lang.String r1 = r3.encodedPath
            if (r1 == 0) goto L7a
            java.lang.String r1 = normalizePath(r1)
        L76:
            r0.append(r1)
            goto L87
        L7a:
            java.lang.String r1 = r3.path
            if (r1 == 0) goto L87
            java.lang.String r1 = normalizePath(r1)
            java.lang.String r1 = r3.encodePath(r1, r4)
            goto L76
        L87:
            java.lang.String r1 = r3.encodedQuery
            java.lang.String r2 = "?"
            if (r1 == 0) goto L93
            r0.append(r2)
            java.lang.String r1 = r3.encodedQuery
            goto L15
        L93:
            java.util.List<org.apache.http.NameValuePair> r1 = r3.queryParams
            if (r1 == 0) goto La2
            r0.append(r2)
            java.util.List<org.apache.http.NameValuePair> r1 = r3.queryParams
            java.lang.String r1 = r3.encodeQuery(r1, r4)
            goto L15
        La2:
            java.lang.String r1 = r3.encodedFragment
            java.lang.String r2 = "#"
            if (r1 == 0) goto Lb1
            r0.append(r2)
            java.lang.String r4 = r3.encodedFragment
        Lad:
            r0.append(r4)
            goto Lbf
        Lb1:
            java.lang.String r1 = r3.fragment
            if (r1 == 0) goto Lbf
            r0.append(r2)
            java.lang.String r1 = r3.fragment
            java.lang.String r4 = r3.encodeFragment(r1, r4)
            goto Lad
        Lbf:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lidroid.xutils.http.client.util.URIBuilder.buildString(java.nio.charset.Charset):java.lang.String");
    }

    private void digestURI(URI uri) {
        this.scheme = uri.getScheme();
        this.encodedSchemeSpecificPart = uri.getRawSchemeSpecificPart();
        this.encodedAuthority = uri.getRawAuthority();
        this.host = uri.getHost();
        this.port = uri.getPort();
        this.encodedUserInfo = uri.getRawUserInfo();
        this.userInfo = uri.getUserInfo();
        this.encodedPath = uri.getRawPath();
        this.path = uri.getPath();
        this.encodedQuery = uri.getRawQuery();
        this.queryParams = parseQuery(uri.getRawQuery());
        this.encodedFragment = uri.getRawFragment();
        this.fragment = uri.getFragment();
    }

    private String encodeFragment(String str, Charset charset) {
        return URLEncodedUtils.encFragment(str, charset);
    }

    private String encodePath(String str, Charset charset) {
        return URLEncodedUtils.encPath(str, charset).replace(Marker.ANY_NON_NULL_MARKER, "20%");
    }

    private String encodeQuery(List<NameValuePair> list, Charset charset) {
        return URLEncodedUtils.format(list, charset);
    }

    private String encodeUserInfo(String str, Charset charset) {
        return URLEncodedUtils.encUserInfo(str, charset);
    }

    private static String normalizePath(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == '/') {
            i++;
        }
        return i > 1 ? str.substring(i - 1) : str;
    }

    private List<NameValuePair> parseQuery(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return URLEncodedUtils.parse(str);
    }

    public URIBuilder addParameter(String str, String str2) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        this.queryParams.add(new BasicNameValuePair(str, str2));
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public URI build(Charset charset) throws URISyntaxException {
        return new URI(buildString(charset));
    }

    public String getFragment() {
        return this.fragment;
    }

    public String getHost() {
        return this.host;
    }

    public String getPath() {
        return this.path;
    }

    public int getPort() {
        return this.port;
    }

    public List<NameValuePair> getQueryParams() {
        return this.queryParams != null ? new ArrayList(this.queryParams) : new ArrayList();
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getUserInfo() {
        return this.userInfo;
    }

    public URIBuilder setFragment(String str) {
        this.fragment = str;
        this.encodedFragment = null;
        return this;
    }

    public URIBuilder setHost(String str) {
        this.host = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        return this;
    }

    public URIBuilder setParameter(String str, String str2) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        if (!this.queryParams.isEmpty()) {
            Iterator<NameValuePair> it = this.queryParams.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equals(str)) {
                    it.remove();
                }
            }
        }
        this.queryParams.add(new BasicNameValuePair(str, str2));
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public URIBuilder setPath(String str) {
        this.path = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedPath = null;
        return this;
    }

    public URIBuilder setPort(int i) {
        if (i < 0) {
            i = -1;
        }
        this.port = i;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        return this;
    }

    public URIBuilder setQuery(String str) {
        this.queryParams = parseQuery(str);
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public URIBuilder setScheme(String str) {
        this.scheme = str;
        return this;
    }

    public URIBuilder setUserInfo(String str) {
        this.userInfo = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        this.encodedUserInfo = null;
        return this;
    }

    public URIBuilder setUserInfo(String str, String str2) {
        return setUserInfo(String.valueOf(str) + ':' + str2);
    }
}
