package com.anythink.core.common.res.image;

import android.os.SystemClock;
import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: renamed from: com.anythink.core.common.res.image.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1383b {

    /* JADX INFO: renamed from: a */
    private final String f5583a = getClass().getSimpleName();

    /* JADX INFO: renamed from: c */
    public String f5584c;

    /* JADX INFO: renamed from: d */
    public boolean f5585d;

    /* JADX INFO: renamed from: e */
    public long f5586e;

    /* JADX INFO: renamed from: f */
    public long f5587f;

    /* JADX INFO: renamed from: g */
    public long f5588g;

    /* JADX INFO: renamed from: h */
    public long f5589h;

    /* JADX INFO: renamed from: i */
    public long f5590i;

    /* JADX INFO: renamed from: com.anythink.core.common.res.image.b$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractRunnableC1337d {
        public AnonymousClass1() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v43 */
        /* JADX WARN: Type inference failed for: r1v44 */
        /* JADX WARN: Type inference failed for: r1v45 */
        /* JADX WARN: Type inference failed for: r1v46 */
        /* JADX WARN: Type inference failed for: r1v47 */
        /* JADX WARN: Type inference failed for: r1v48 */
        /* JADX WARN: Type inference failed for: r1v49 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v50 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.net.HttpURLConnection] */
        /* JADX INFO: renamed from: b */
        private void m4540b(String str) throws Throwable {
            HttpURLConnection httpURLConnection;
            AbstractC1383b abstractC1383b;
            AbstractC1383b.this.f5586e = System.currentTimeMillis();
            AbstractC1383b.this.f5587f = SystemClock.elapsedRealtime();
            ?? r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            try {
                try {
                    String unused = AbstractC1383b.this.f5583a;
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection.setInstanceFollowRedirects(false);
                        Map<String, String> mapMo210a = AbstractC1383b.this.mo210a();
                        if (mapMo210a != null && mapMo210a.size() > 0) {
                            for (String str2 : mapMo210a.keySet()) {
                                httpURLConnection.addRequestProperty(str2, mapMo210a.get(str2));
                                String unused2 = AbstractC1383b.this.f5583a;
                                StringBuilder sb = new StringBuilder("REQUEST ADDED HEADER: \n");
                                sb.append(str2);
                                sb.append("  :  ");
                                sb.append(mapMo210a.get(str2));
                            }
                        }
                        abstractC1383b = AbstractC1383b.this;
                    } catch (SocketTimeoutException e) {
                        e = e;
                        r1 = httpURLConnection;
                        AbstractC1383b.this.mo212a(C1384c.f5592a, e.getMessage());
                        String unused3 = AbstractC1383b.this.f5583a;
                        if (r1 != 0) {
                            r1.disconnect();
                        }
                    } catch (ConnectTimeoutException e2) {
                        e = e2;
                        r1 = httpURLConnection;
                        AbstractC1383b.this.mo212a(C1384c.f5592a, e.getMessage());
                        if (r1 != 0) {
                            r1.disconnect();
                            return;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        r1 = httpURLConnection;
                        String unused4 = AbstractC1383b.this.f5583a;
                        e.getMessage();
                        AbstractC1383b.this.mo212a(C1384c.f5592a, e.getMessage());
                        if (r1 != 0) {
                            r1.disconnect();
                            return;
                        }
                    } catch (OutOfMemoryError e4) {
                        e = e4;
                        r1 = httpURLConnection;
                        System.gc();
                        String unused5 = AbstractC1383b.this.f5583a;
                        e.getMessage();
                        AbstractC1383b.this.mo212a(C1384c.f5592a, e.getMessage());
                        if (r1 != 0) {
                            r1.disconnect();
                            return;
                        }
                    } catch (StackOverflowError e5) {
                        e = e5;
                        r1 = httpURLConnection;
                        System.gc();
                        String unused6 = AbstractC1383b.this.f5583a;
                        e.getMessage();
                        AbstractC1383b.this.mo212a(C1384c.f5592a, e.getMessage());
                        if (r1 != 0) {
                            r1.disconnect();
                            return;
                        }
                    } catch (Error e6) {
                        e = e6;
                        r1 = httpURLConnection;
                        System.gc();
                        String unused7 = AbstractC1383b.this.f5583a;
                        e.getMessage();
                        AbstractC1383b.this.mo212a(C1384c.f5592a, e.getMessage());
                        if (r1 != 0) {
                            r1.disconnect();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r1 = httpURLConnection;
                        if (r1 != 0) {
                            r1.disconnect();
                        }
                        throw th;
                    }
                } catch (StackOverflowError e7) {
                    e = e7;
                } catch (Error e8) {
                    e = e8;
                } catch (SocketTimeoutException e9) {
                    e = e9;
                } catch (ConnectTimeoutException e10) {
                    e = e10;
                } catch (Exception e11) {
                    e = e11;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                }
                if (abstractC1383b.f5585d) {
                    abstractC1383b.mo212a(C1384c.f5593b, "Task had been canceled.");
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        return;
                    }
                    return;
                }
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    AbstractC1383b abstractC1383b2 = AbstractC1383b.this;
                    if (abstractC1383b2.f5585d) {
                        abstractC1383b2.mo212a(C1384c.f5593b, "Task had been canceled.");
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            return;
                        }
                        return;
                    }
                    abstractC1383b2.f5590i = httpURLConnection.getContentLength();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    boolean zMo213a = AbstractC1383b.this.mo213a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    AbstractC1383b.this.f5588g = System.currentTimeMillis();
                    AbstractC1383b.this.f5589h = SystemClock.elapsedRealtime();
                    if (zMo213a) {
                        String unused8 = AbstractC1383b.this.f5583a;
                        StringBuilder sb2 = new StringBuilder("download success --> ");
                        String str3 = AbstractC1383b.this.f5584c;
                        sb2.append(str3);
                        AbstractC1383b.this.mo215c();
                        r1 = str3;
                    } else {
                        String unused9 = AbstractC1383b.this.f5583a;
                        new StringBuilder("download fail --> ").append(AbstractC1383b.this.f5584c);
                        AbstractC1383b.this.mo212a(C1384c.f5592a, "Save fail!");
                        r1 = "Save fail!";
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        return;
                    }
                    return;
                }
                String unused10 = AbstractC1383b.this.f5583a;
                StringBuilder sb3 = new StringBuilder("http respond status code is ");
                sb3.append(responseCode);
                sb3.append(" ! url=");
                sb3.append(str);
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    AbstractC1383b.this.mo212a(C1384c.f5592a, "Resource download fail, status code: " + responseCode + ", " + httpURLConnection.getResponseMessage() + ", url: " + str);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        return;
                    }
                    return;
                }
                AbstractC1383b abstractC1383b3 = AbstractC1383b.this;
                if (abstractC1383b3.f5585d) {
                    abstractC1383b3.mo212a(C1384c.f5593b, "Task had been canceled.");
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null) {
                        if (!headerField.toLowerCase().startsWith("http")) {
                            AbstractC1383b.this.mo212a(C1384c.f5592a, "Final url is wrong:".concat(String.valueOf(headerField)));
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                                return;
                            }
                            return;
                        }
                        m4540b(headerField);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
        /* JADX INFO: renamed from: a */
        public final void mo1492a() throws Throwable {
            AbstractC1383b abstractC1383b;
            String message;
            try {
                m4540b(AbstractC1383b.this.f5584c);
            } catch (Exception e) {
                String unused = AbstractC1383b.this.f5583a;
                e.getMessage();
                abstractC1383b = AbstractC1383b.this;
                message = e.getMessage();
                abstractC1383b.mo212a(C1384c.f5592a, message);
            } catch (OutOfMemoryError e2) {
                e = e2;
                System.gc();
                abstractC1383b = AbstractC1383b.this;
                message = e.getMessage();
                abstractC1383b.mo212a(C1384c.f5592a, message);
            } catch (StackOverflowError e3) {
                e = e3;
                System.gc();
                abstractC1383b = AbstractC1383b.this;
                message = e.getMessage();
                abstractC1383b.mo212a(C1384c.f5592a, message);
            }
        }
    }

    public AbstractC1383b(String str) {
        this.f5584c = str;
    }

    /* JADX INFO: renamed from: e */
    private void m4535e() {
        this.f5585d = true;
    }

    /* JADX INFO: renamed from: f */
    private void m4536f() {
        mo211a(new AnonymousClass1());
    }

    /* JADX INFO: renamed from: g */
    private static int m4537g() {
        return 60000;
    }

    /* JADX INFO: renamed from: h */
    private static int m4538h() {
        return 20000;
    }

    /* JADX INFO: renamed from: a */
    public abstract Map<String, String> mo210a();

    /* JADX INFO: renamed from: a */
    public abstract void mo211a(AbstractRunnableC1337d abstractRunnableC1337d);

    /* JADX INFO: renamed from: a */
    public abstract void mo212a(String str, String str2);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo213a(InputStream inputStream);

    /* JADX INFO: renamed from: b */
    public abstract void mo214b();

    /* JADX INFO: renamed from: c */
    public abstract void mo215c();

    /* JADX INFO: renamed from: d */
    public final void m4539d() {
        this.f5585d = false;
        mo211a(new AnonymousClass1());
    }
}
