package com.iflytek.voiceads.p208b;

import android.graphics.Bitmap;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.iflytek.voiceads.b.e */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2897e extends Thread {

    /* JADX INFO: renamed from: a */
    private String f16125a;

    /* JADX INFO: renamed from: b */
    private b f16126b;

    /* JADX INFO: renamed from: com.iflytek.voiceads.b.e$a */
    static class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long j2 = 0;
            while (j2 < j) {
                long jSkip = this.in.skip(j - j2);
                if (jSkip == 0) {
                    if (read() < 0) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 = jSkip + j2;
            }
            return j2;
        }
    }

    /* JADX INFO: renamed from: com.iflytek.voiceads.b.e$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo13234a(Bitmap bitmap);

        /* JADX INFO: renamed from: a */
        void mo13235a(Exception exc);
    }

    public C2897e(String str, b bVar) {
        this.f16125a = str;
        this.f16126b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006f -> B:42:0x0008). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0071 -> B:42:0x0008). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:42:0x0008). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:42:0x0008). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0097 -> B:42:0x0008). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0099 -> B:42:0x0008). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m13241b() throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = r5.f16125a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9
        L8:
            return
        L9:
            r1 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> L61 java.lang.IllegalStateException -> L75 java.lang.Exception -> L89 java.lang.Throwable -> L9e
            java.lang.String r2 = r5.f16125a     // Catch: java.io.IOException -> L61 java.lang.IllegalStateException -> L75 java.lang.Exception -> L89 java.lang.Throwable -> L9e
            r0.<init>(r2)     // Catch: java.io.IOException -> L61 java.lang.IllegalStateException -> L75 java.lang.Exception -> L89 java.lang.Throwable -> L9e
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> L61 java.lang.IllegalStateException -> L75 java.lang.Exception -> L89 java.lang.Throwable -> L9e
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.io.IOException -> L61 java.lang.IllegalStateException -> L75 java.lang.Exception -> L89 java.lang.Throwable -> L9e
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            r1 = 15000(0x3a98, float:2.102E-41)
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            r1 = 15000(0x3a98, float:2.102E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            r2 = 200(0xc8, float:2.8E-43)
            if (r2 == r1) goto L40
            com.iflytek.voiceads.b.e$b r1 = r5.f16126b     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            java.lang.String r3 = "network error!"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            r1.mo13235a(r2)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            if (r0 == 0) goto L8
            r0.disconnect()
            goto L8
        L40:
            java.io.InputStream r1 = r0.getInputStream()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            com.iflytek.voiceads.b.e$a r2 = new com.iflytek.voiceads.b.e$a     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            r2.<init>(r1)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            android.os.Looper.prepare()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            com.iflytek.voiceads.b.e$b r3 = r5.f16126b     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            r3.mo13234a(r2)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            r1.close()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> Laa java.lang.IllegalStateException -> Lac java.io.IOException -> Lae
            if (r0 == 0) goto L8
            r0.disconnect()
            goto L8
        L61:
            r0 = move-exception
            r0 = r1
        L63:
            com.iflytek.voiceads.b.e$b r1 = r5.f16126b     // Catch: java.lang.Throwable -> La5
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "I/O error!"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La5
            r1.mo13235a(r2)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L8
            r0.disconnect()
            goto L8
        L75:
            r0 = move-exception
            r0 = r1
        L77:
            com.iflytek.voiceads.b.e$b r1 = r5.f16126b     // Catch: java.lang.Throwable -> La5
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "Incorrect URL!"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La5
            r1.mo13235a(r2)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L8
            r0.disconnect()
            goto L8
        L89:
            r0 = move-exception
            r0 = r1
        L8b:
            com.iflytek.voiceads.b.e$b r1 = r5.f16126b     // Catch: java.lang.Throwable -> La5
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "network error!"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La5
            r1.mo13235a(r2)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L8
            r0.disconnect()
            goto L8
        L9e:
            r0 = move-exception
        L9f:
            if (r1 == 0) goto La4
            r1.disconnect()
        La4:
            throw r0
        La5:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L9f
        Laa:
            r1 = move-exception
            goto L8b
        Lac:
            r1 = move-exception
            goto L77
        Lae:
            r1 = move-exception
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.voiceads.p208b.C2897e.m13241b():void");
    }

    /* JADX INFO: renamed from: a */
    public void m13242a() {
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        m13241b();
    }
}
