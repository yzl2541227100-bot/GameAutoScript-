package mobi.oneway.export.p283g;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: mobi.oneway.export.g.j */
/* JADX INFO: loaded from: classes2.dex */
public class C3638j {
    /* JADX INFO: renamed from: a */
    private static void m16979a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16980a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.disconnect();
    }

    /* JADX INFO: renamed from: a */
    public static void m16981a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            m16979a(closeable);
        }
    }
}
