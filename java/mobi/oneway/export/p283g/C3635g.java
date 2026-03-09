package mobi.oneway.export.p283g;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: mobi.oneway.export.g.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3635g {
    /* JADX INFO: renamed from: a */
    public static String m16942a(Exception exc) {
        return exc.getMessage();
    }

    /* JADX INFO: renamed from: a */
    public static String m16943a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }
}
