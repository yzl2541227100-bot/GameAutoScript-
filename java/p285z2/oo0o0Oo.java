package p285z2;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;
import p285z2.OooOo;

/* JADX INFO: loaded from: classes.dex */
public class oo0o0Oo implements o0OoOo0 {
    public static final boolean OooO0OO = o0OOO0o.OooO0O0;
    private static int OooO0Oo = 3000;
    private static int OooO0o0 = 4096;
    public final o00000O0 OooO00o;
    public final o0O0O00 OooO0O0;

    public oo0o0Oo(o00000O0 o00000o0) {
        this(o00000o0, new o0O0O00(OooO0o0));
    }

    public oo0o0Oo(o00000O0 o00000o0, o0O0O00 o0o0o00) {
        this.OooO00o = o00000o0;
        this.OooO0O0 = o0o0o00;
    }

    private void OooO0O0(Map<String, String> map, OooOo.OooO00o oooO00o) {
        if (oooO00o == null) {
            return;
        }
        String str = oooO00o.OooO0O0;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        if (oooO00o.OooO0Oo > 0) {
            map.put("If-Modified-Since", DateUtils.formatDate(new Date(oooO00o.OooO0Oo)));
        }
    }

    private static void OooO0OO(String str, Request<?> request, VolleyError volleyError) throws VolleyError {
        o0ooOOo o0oooooOooOo = request.OooOo();
        int iOooOoOO = request.OooOoOO();
        try {
            o0oooooOooOo.OooO00o(volleyError);
            request.OooO0O0(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iOooOoOO)));
        } catch (VolleyError e) {
            request.OooO0O0(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iOooOoOO)));
            throw e;
        }
    }

    public static Map<String, String> OooO0Oo(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private byte[] OooO0o0(HttpEntity httpEntity) throws ServerError, IOException {
        o0000O0O o0000o0o = new o0000O0O(this.OooO0O0, (int) httpEntity.getContentLength());
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new ServerError();
            }
            byte[] bArrOooO00o = this.OooO0O0.OooO00o(1024);
            while (true) {
                int i = content.read(bArrOooO00o);
                if (i == -1) {
                    break;
                }
                o0000o0o.write(bArrOooO00o, 0, i);
            }
            byte[] byteArray = o0000o0o.toByteArray();
            try {
                httpEntity.consumeContent();
            } catch (IOException unused) {
                o0OOO0o.OooO0o("Error occured when calling consumingContent", new Object[0]);
            }
            this.OooO0O0.OooO0O0(bArrOooO00o);
            o0000o0o.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                httpEntity.consumeContent();
            } catch (IOException unused2) {
                o0OOO0o.OooO0o("Error occured when calling consumingContent", new Object[0]);
            }
            this.OooO0O0.OooO0O0(null);
            o0000o0o.close();
            throw th;
        }
    }

    private void OooO0oO(long j, Request<?> request, byte[] bArr, StatusLine statusLine) {
        if (OooO0OO || j > OooO0Oo) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(request.OooOo().OooO0OO());
            o0OOO0o.OooO0O0("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        throw new java.io.IOException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [z2.oo0o0Oo] */
    @Override // p285z2.o0OoOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p285z2.o00Oo0 OooO00o(com.android.volley.Request<?> r24) throws com.android.volley.VolleyError {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.oo0o0Oo.OooO00o(com.android.volley.Request):z2.o00Oo0");
    }

    public void OooO0o(String str, String str2, long j) {
        o0OOO0o.OooO0o("HTTP ERROR(%s) %d ms to fetch %s", str, Long.valueOf(SystemClock.elapsedRealtime() - j), str2);
    }
}
