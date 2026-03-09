package com.anythink.core.common.p058h;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.p054e.C1200c;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1343g;
import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import com.anythink.core.common.p066o.p068b.C1335b;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1268a {

    /* JADX INFO: renamed from: a */
    private static final String f4592a = "http.loader";

    /* JADX INFO: renamed from: m */
    public InterfaceC1283k f4593m;

    /* JADX INFO: renamed from: n */
    public boolean f4594n;

    /* JADX INFO: renamed from: o */
    public String f4595o;

    /* JADX INFO: renamed from: com.anythink.core.common.h.a$1 */
    public class AnonymousClass1 extends AbstractRunnableC1337d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f4596a;

        public AnonymousClass1(int i) {
            this.f4596a = i;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:570|985|571|982|572|987|573|(2:574|(1:576)(1:989))|577|(2:579|(3:581|(1:583)|584)(7:586|914|589|918|590|(2:928|594)|(2:598|599)(1:994)))(1:587)|585|914|589|918|590|(0)|(0)(0)) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:1000:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:1001:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:1002:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:1003:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:1004:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:1005:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:598:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:694:0x029b A[Catch: all -> 0x04f7, TryCatch #63 {all -> 0x04f7, blocks: (B:572:0x012f, B:692:0x0283, B:694:0x029b, B:695:0x029f, B:714:0x02d0, B:716:0x02eb, B:717:0x02ef, B:736:0x0320, B:738:0x032d, B:739:0x0331, B:758:0x0362, B:760:0x036f, B:761:0x0373, B:780:0x03a3, B:799:0x03cf, B:818:0x0407, B:837:0x043f, B:856:0x0477, B:875:0x04bc), top: B:960:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:709:0x02c7  */
        /* JADX WARN: Removed duplicated region for block: B:716:0x02eb A[Catch: all -> 0x04f7, TryCatch #63 {all -> 0x04f7, blocks: (B:572:0x012f, B:692:0x0283, B:694:0x029b, B:695:0x029f, B:714:0x02d0, B:716:0x02eb, B:717:0x02ef, B:736:0x0320, B:738:0x032d, B:739:0x0331, B:758:0x0362, B:760:0x036f, B:761:0x0373, B:780:0x03a3, B:799:0x03cf, B:818:0x0407, B:837:0x043f, B:856:0x0477, B:875:0x04bc), top: B:960:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:731:0x0317  */
        /* JADX WARN: Removed duplicated region for block: B:738:0x032d A[Catch: all -> 0x04f7, TryCatch #63 {all -> 0x04f7, blocks: (B:572:0x012f, B:692:0x0283, B:694:0x029b, B:695:0x029f, B:714:0x02d0, B:716:0x02eb, B:717:0x02ef, B:736:0x0320, B:738:0x032d, B:739:0x0331, B:758:0x0362, B:760:0x036f, B:761:0x0373, B:780:0x03a3, B:799:0x03cf, B:818:0x0407, B:837:0x043f, B:856:0x0477, B:875:0x04bc), top: B:960:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:753:0x0359  */
        /* JADX WARN: Removed duplicated region for block: B:760:0x036f A[Catch: all -> 0x04f7, TryCatch #63 {all -> 0x04f7, blocks: (B:572:0x012f, B:692:0x0283, B:694:0x029b, B:695:0x029f, B:714:0x02d0, B:716:0x02eb, B:717:0x02ef, B:736:0x0320, B:738:0x032d, B:739:0x0331, B:758:0x0362, B:760:0x036f, B:761:0x0373, B:780:0x03a3, B:799:0x03cf, B:818:0x0407, B:837:0x043f, B:856:0x0477, B:875:0x04bc), top: B:960:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:775:0x039b  */
        /* JADX WARN: Removed duplicated region for block: B:794:0x03c6  */
        /* JADX WARN: Removed duplicated region for block: B:813:0x03fe  */
        /* JADX WARN: Removed duplicated region for block: B:832:0x0436  */
        /* JADX WARN: Removed duplicated region for block: B:851:0x046e  */
        /* JADX WARN: Removed duplicated region for block: B:870:0x04b3  */
        /* JADX WARN: Removed duplicated region for block: B:889:0x04f3  */
        /* JADX WARN: Removed duplicated region for block: B:905:0x050f  */
        /* JADX WARN: Removed duplicated region for block: B:908:0x049e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:910:0x0421 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:912:0x04a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:916:0x0428 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:920:0x04ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:922:0x042f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:924:0x03b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:926:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:928:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:930:0x03b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:932:0x02b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:934:0x03bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:936:0x02c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:938:0x0344 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:940:0x034b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:942:0x0352 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:944:0x0459 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:946:0x04de A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:948:0x0460 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:950:0x04e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:952:0x0467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:954:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:956:0x04ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:958:0x03f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:961:0x03f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:963:0x04fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:965:0x0501 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:967:0x0302 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:969:0x0386 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:971:0x0508 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:973:0x0309 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:975:0x038d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:977:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:979:0x0394 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:994:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:995:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:996:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:997:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:998:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:999:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v13 */
        /* JADX WARN: Type inference failed for: r12v14 */
        /* JADX WARN: Type inference failed for: r12v15 */
        /* JADX WARN: Type inference failed for: r12v16 */
        /* JADX WARN: Type inference failed for: r12v17 */
        /* JADX WARN: Type inference failed for: r12v18 */
        /* JADX WARN: Type inference failed for: r12v19 */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v20 */
        /* JADX WARN: Type inference failed for: r12v21 */
        /* JADX WARN: Type inference failed for: r12v22 */
        /* JADX WARN: Type inference failed for: r12v23, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v24, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v25, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v26, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v27, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v28, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v29, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v30, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v31, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v32, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v33, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v35, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r12v36 */
        /* JADX WARN: Type inference failed for: r12v37 */
        /* JADX WARN: Type inference failed for: r12v38 */
        /* JADX WARN: Type inference failed for: r12v39 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v40 */
        /* JADX WARN: Type inference failed for: r12v41 */
        /* JADX WARN: Type inference failed for: r12v42 */
        /* JADX WARN: Type inference failed for: r12v43 */
        /* JADX WARN: Type inference failed for: r12v44 */
        /* JADX WARN: Type inference failed for: r12v45 */
        /* JADX WARN: Type inference failed for: r12v46 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r12v9 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v32, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v33, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v34, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v35, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v36, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v37, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v38, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v39, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v40, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v41, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v45 */
        /* JADX WARN: Type inference failed for: r2v60, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v68 */
        /* JADX WARN: Type inference failed for: r2v69 */
        /* JADX WARN: Type inference failed for: r2v70 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v20, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v21, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v22, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v23, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v24, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v25, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v26, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v27, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v28, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v29, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v30, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r3v31 */
        /* JADX WARN: Type inference failed for: r3v32 */
        /* JADX WARN: Type inference failed for: r3v33 */
        /* JADX WARN: Type inference failed for: r3v34 */
        /* JADX WARN: Type inference failed for: r3v35 */
        /* JADX WARN: Type inference failed for: r3v36 */
        /* JADX WARN: Type inference failed for: r3v37 */
        /* JADX WARN: Type inference failed for: r3v38 */
        /* JADX WARN: Type inference failed for: r3v39 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v50 */
        /* JADX WARN: Type inference failed for: r3v52 */
        /* JADX WARN: Type inference failed for: r3v54 */
        /* JADX WARN: Type inference failed for: r3v56 */
        /* JADX WARN: Type inference failed for: r3v57 */
        /* JADX WARN: Type inference failed for: r3v59 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v61 */
        /* JADX WARN: Type inference failed for: r3v63 */
        /* JADX WARN: Type inference failed for: r3v65 */
        /* JADX WARN: Type inference failed for: r3v67 */
        /* JADX WARN: Type inference failed for: r3v69 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v70, types: [java.io.InputStreamReader, java.io.Reader] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v82 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m3645b(java.lang.String r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p058h.AbstractC1268a.AnonymousClass1.m3645b(java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo1492a() throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.String r0 = "9999"
                com.anythink.core.common.h.a r1 = com.anythink.core.common.p058h.AbstractC1268a.this     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                com.anythink.core.common.h.k r1 = r1.f4593m     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                if (r1 == 0) goto Ld
                int r2 = r5.f4596a     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                r1.onLoadStart(r2)     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
            Ld:
                com.anythink.core.common.h.a r1 = com.anythink.core.common.p058h.AbstractC1268a.this     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                java.lang.String r1 = r1.mo626b()     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                r5.m3645b(r1)     // Catch: java.lang.Exception -> L17 java.lang.StackOverflowError -> L3a java.lang.OutOfMemoryError -> L3c
                return
            L17:
                r1 = move-exception
                java.lang.String r2 = r1.getMessage()
                java.lang.String r3 = r1.getMessage()
                if (r3 == 0) goto L26
                java.lang.String r2 = r1.getMessage()
            L26:
                com.anythink.core.common.h.a r3 = com.anythink.core.common.p058h.AbstractC1268a.this
                com.anythink.core.common.h.k r3 = r3.f4593m
                if (r3 == 0) goto L39
                int r4 = r5.f4596a
                java.lang.String r1 = r1.getMessage()
                com.anythink.core.api.AdError r0 = com.anythink.core.api.ErrorCode.getErrorCode(r0, r0, r1)
                r3.onLoadError(r4, r2, r0)
            L39:
                return
            L3a:
                r1 = move-exception
                goto L3d
            L3c:
                r1 = move-exception
            L3d:
                java.lang.System.gc()
                java.lang.String r2 = r1.getMessage()
                java.lang.String r3 = r1.getMessage()
                if (r3 == 0) goto L4e
                java.lang.String r2 = r1.getMessage()
            L4e:
                com.anythink.core.common.h.a r3 = com.anythink.core.common.p058h.AbstractC1268a.this
                com.anythink.core.common.h.k r3 = r3.f4593m
                if (r3 == 0) goto L61
                int r4 = r5.f4596a
                java.lang.String r1 = r1.getMessage()
                com.anythink.core.api.AdError r0 = com.anythink.core.api.ErrorCode.getErrorCode(r0, r0, r1)
                r3.onLoadError(r4, r2, r0)
            L61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p058h.AbstractC1268a.AnonymousClass1.mo1492a():void");
        }
    }

    /* JADX INFO: renamed from: a */
    public static InputStream m3632a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!"gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
            return inputStream;
        }
        try {
            byte[] bArr = new byte[2];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            int i = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            return (i == -1 || (((bArr[1] & 255) << 8) | (bArr[0] & 255)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
        } catch (Exception unused2) {
            return inputStream;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3633a(AbstractC1268a abstractC1268a) {
        if ((abstractC1268a.mo637l() & 8) == 8) {
            C1200c.m2314a().m2335b(abstractC1268a.f4595o);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m3634b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: d */
    private void m3635d(int i) {
        C1335b c1335bM3998a;
        int i2;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        if (mo3644o()) {
            c1335bM3998a = C1335b.m3998a();
            i2 = 1;
        } else {
            c1335bM3998a = C1335b.m3998a();
            i2 = 10;
        }
        c1335bM3998a.m4004a((AbstractRunnableC1337d) anonymousClass1, i2);
    }

    /* JADX INFO: renamed from: p */
    private void m3636p() {
        this.f4594n = true;
    }

    /* JADX INFO: renamed from: q */
    private void m3637q() {
        if ((mo637l() & 8) == 8) {
            C1200c.m2314a().m2335b(this.f4595o);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo621a();

    /* JADX INFO: renamed from: a */
    public abstract Object mo622a(Object obj);

    /* JADX INFO: renamed from: a */
    public final void m3638a(int i, int i2, String str, AdError adError) {
        InterfaceC1283k interfaceC1283k = this.f4593m;
        if (interfaceC1283k != null) {
            interfaceC1283k.onLoadError(i, str, adError);
        }
        mo627b(adError);
        mo641b(i2);
    }

    /* JADX INFO: renamed from: a */
    public void mo3639a(int i, InterfaceC1283k interfaceC1283k) {
        C1335b c1335bM3998a;
        int i2;
        this.f4594n = false;
        this.f4593m = interfaceC1283k;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        if (mo3644o()) {
            c1335bM3998a = C1335b.m3998a();
            i2 = 1;
        } else {
            c1335bM3998a = C1335b.m3998a();
            i2 = 10;
        }
        c1335bM3998a.m4004a((AbstractRunnableC1337d) anonymousClass1, i2);
    }

    /* JADX INFO: renamed from: a */
    public void mo623a(int i, Object obj) {
        InterfaceC1283k interfaceC1283k = this.f4593m;
        if (interfaceC1283k != null) {
            interfaceC1283k.onLoadFinish(i, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3640a(int i, ConnectTimeoutException connectTimeoutException) {
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, ErrorCode.exception, connectTimeoutException.getMessage());
        InterfaceC1283k interfaceC1283k = this.f4593m;
        if (interfaceC1283k != null) {
            interfaceC1283k.onLoadError(i, "Connect timeout.", errorCode);
        }
        mo627b(errorCode);
        mo641b(C1281i.f4749b);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo624a(AdError adError);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo625a(int i);

    /* JADX INFO: renamed from: b */
    public abstract String mo626b();

    /* JADX INFO: renamed from: b */
    public void mo641b(int i) {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo627b(AdError adError);

    /* JADX INFO: renamed from: c */
    public abstract Map<String, String> mo628c();

    /* JADX INFO: renamed from: c */
    public final void m3641c(int i) {
        InterfaceC1283k interfaceC1283k = this.f4593m;
        if (interfaceC1283k != null) {
            interfaceC1283k.onLoadCanceled(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract byte[] mo629d();

    /* JADX INFO: renamed from: e */
    public JSONObject mo630e() {
        return C1275c.m3678a(mo637l());
    }

    /* JADX INFO: renamed from: f */
    public JSONObject mo631f() {
        return C1275c.m3683b(mo637l());
    }

    /* JADX INFO: renamed from: g */
    public String mo632g() {
        HashMap map = new HashMap();
        String strM4028a = C1340d.m4028a(mo630e().toString());
        String strM4028a2 = C1340d.m4028a(mo631f().toString());
        map.put(C1275c.f4651O, mo3642m());
        map.put("p", strM4028a);
        map.put(C1275c.f4658V, strM4028a2);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            sb.append(map.get(str));
        }
        new StringBuilder(" sorted value list:").append(sb.toString());
        map.put("sign", C1343g.m4127c(mo635j() + sb.toString()));
        if (mo636k() != null) {
            map.putAll(mo636k());
        }
        Set<String> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : setKeySet) {
                jSONObject.put(str2, String.valueOf(map.get(str2)));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract String mo633h();

    /* JADX INFO: renamed from: i */
    public abstract Context mo634i();

    /* JADX INFO: renamed from: j */
    public abstract String mo635j();

    /* JADX INFO: renamed from: k */
    public abstract Map<String, Object> mo636k();

    /* JADX INFO: renamed from: l */
    public int mo637l() {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public String mo3642m() {
        return "1.0";
    }

    /* JADX INFO: renamed from: n */
    public boolean mo3643n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo3644o() {
        return false;
    }
}
