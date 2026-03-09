package mobi.oneway.export.p283g;

import android.util.Log;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: mobi.oneway.export.g.m */
/* JADX INFO: loaded from: classes2.dex */
public class C3641m {

    /* JADX INFO: renamed from: a */
    private static final String f19808a = "OnewaySdk";

    /* JADX INFO: renamed from: b */
    private static boolean f19809b;

    /* JADX INFO: renamed from: c */
    private static boolean f19810c;

    /* JADX INFO: renamed from: mobi.oneway.export.g.m$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public String toString() {
            String string;
            StackTraceElement[] stackTrace = getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < 4 && i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                boolean zIsNativeMethod = stackTraceElement.isNativeMethod();
                String strM17019a = C3647s.m17019a(stackTraceElement.getClassName());
                int lineNumber = stackTraceElement.getLineNumber();
                String fileName = stackTraceElement.getFileName();
                String methodName = stackTraceElement.getMethodName();
                if (i == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strM17019a);
                    sb2.append(".");
                    sb2.append(methodName);
                    sb2.append(zIsNativeMethod ? "(Native)" : fileName != null ? "(" + fileName + ":" + lineNumber + ")" : "(UnSrc)");
                    string = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(strM17019a);
                    sb3.append(".");
                    sb3.append(methodName);
                    sb3.append(zIsNativeMethod ? "(Native)" : "(" + lineNumber + ")");
                    string = sb3.toString();
                }
                sb.append("[");
                sb.append(string);
                sb.append("]");
                if (i < 3) {
                    sb.append("->");
                }
            }
            return ((Object) sb) + IOUtils.LINE_SEPARATOR_WINDOWS + getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16987a(Object obj) {
        if (f19810c) {
            Log.v("OnewaySdk-", obj + "");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16988a(String str) {
        if (f19809b) {
            Log.d(f19808a, new a(str).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16989a(String str, Throwable th) {
        Log.e(f19808a, str, th);
    }

    /* JADX INFO: renamed from: a */
    public static void m16990a(boolean z) {
        f19809b = z;
    }

    /* JADX INFO: renamed from: a */
    public static void m16991a(Object... objArr) {
        if (f19809b) {
            Log.v(f19808a, new a(C3647s.m17025a(objArr)).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16992a() {
        return f19809b;
    }

    /* JADX INFO: renamed from: b */
    public static void m16993b(String str) {
        if (f19809b) {
            Log.i(f19808a, new a(str).toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16994b(boolean z) {
        f19810c = z;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16995b() {
        return f19810c;
    }

    /* JADX INFO: renamed from: c */
    public static void m16996c(String str) {
        if (f19809b) {
            str = new a(str).toString();
        }
        Log.w(f19808a, str);
    }

    /* JADX INFO: renamed from: d */
    public static void m16997d(String str) {
        Log.e(f19808a, new a(str).toString());
    }
}
