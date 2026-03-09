package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3489e {

    /* JADX INFO: renamed from: a */
    public static boolean f19173a = false;

    /* JADX INFO: renamed from: b */
    private static String f19174b = "ULog";

    /* JADX INFO: renamed from: c */
    private static final int f19175c = 1;

    /* JADX INFO: renamed from: d */
    private static final int f19176d = 2;

    /* JADX INFO: renamed from: e */
    private static final int f19177e = 3;

    /* JADX INFO: renamed from: f */
    private static final int f19178f = 4;

    /* JADX INFO: renamed from: g */
    private static final int f19179g = 5;

    /* JADX INFO: renamed from: h */
    private static int f19180h = 2000;

    private C3489e() {
    }

    /* JADX INFO: renamed from: a */
    private static void m16325a(int i, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i2 = f19180h;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= 100) {
                    break;
                }
                if (length > i2) {
                    if (i == 1) {
                        Log.v(str, str2.substring(i4, i2));
                    } else if (i == 2) {
                        Log.d(str, str2.substring(i4, i2));
                    } else if (i == 3) {
                        Log.i(str, str2.substring(i4, i2));
                    } else if (i == 4) {
                        Log.w(str, str2.substring(i4, i2));
                    } else if (i == 5) {
                        Log.e(str, str2.substring(i4, i2));
                    }
                    i3++;
                    i4 = i2;
                    i2 = f19180h + i2;
                } else if (i == 1) {
                    Log.v(str, str2.substring(i4, length));
                } else if (i == 2) {
                    Log.d(str, str2.substring(i4, length));
                } else if (i == 3) {
                    Log.i(str, str2.substring(i4, length));
                } else if (i == 4) {
                    Log.w(str, str2.substring(i4, length));
                } else if (i == 5) {
                    Log.e(str, str2.substring(i4, length));
                }
            }
        }
        if (th != null) {
            String strM16356f = m16356f(th);
            if (TextUtils.isEmpty(strM16356f)) {
                return;
            }
            if (i == 1) {
                Log.v(str, strM16356f);
                return;
            }
            if (i == 2) {
                Log.d(str, strM16356f);
                return;
            }
            if (i == 3) {
                Log.i(str, strM16356f);
            } else if (i == 4) {
                Log.w(str, strM16356f);
            } else {
                if (i != 5) {
                    return;
                }
                Log.e(str, strM16356f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16326a(String str) {
        m16327a(f19174b, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m16327a(String str, String str2, Throwable th) {
        if (f19173a) {
            m16325a(1, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16328a(String str, Throwable th) {
        m16339c(f19174b, str, th);
    }

    /* JADX INFO: renamed from: a */
    public static void m16329a(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16339c(f19174b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16339c(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16330a(Throwable th) {
        m16339c(f19174b, (String) null, th);
    }

    /* JADX INFO: renamed from: a */
    public static void m16331a(Locale locale, String str, Object... objArr) {
        try {
            m16339c(f19174b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16332b(String str) {
        m16333b(f19174b, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: b */
    public static void m16333b(String str, String str2, Throwable th) {
        if (f19173a) {
            m16325a(2, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16334b(String str, Throwable th) {
        m16327a(f19174b, str, th);
    }

    /* JADX INFO: renamed from: b */
    public static void m16335b(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16333b(f19174b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16333b(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16336b(Throwable th) {
        m16327a(f19174b, (String) null, th);
    }

    /* JADX INFO: renamed from: b */
    public static void m16337b(Locale locale, String str, Object... objArr) {
        try {
            m16333b(f19174b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m16338c(String str) {
        m16339c(f19174b, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: c */
    public static void m16339c(String str, String str2, Throwable th) {
        if (f19173a) {
            m16325a(3, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m16340c(String str, Throwable th) {
        m16345d(f19174b, str, th);
    }

    /* JADX INFO: renamed from: c */
    public static void m16341c(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16351e(f19174b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16351e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m16342c(Throwable th) {
        m16345d(f19174b, (String) null, th);
    }

    /* JADX INFO: renamed from: c */
    public static void m16343c(Locale locale, String str, Object... objArr) {
        try {
            m16351e(f19174b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m16344d(String str) {
        m16345d(f19174b, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: d */
    public static void m16345d(String str, String str2, Throwable th) {
        if (f19173a) {
            m16325a(4, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m16346d(String str, Throwable th) {
        m16333b(f19174b, str, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m16347d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16327a(f19174b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16327a(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m16348d(Throwable th) {
        m16333b(f19174b, (String) null, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m16349d(Locale locale, String str, Object... objArr) {
        try {
            m16327a(f19174b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16350e(String str) {
        m16351e(f19174b, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: e */
    public static void m16351e(String str, String str2, Throwable th) {
        if (f19173a) {
            m16325a(5, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16352e(String str, Throwable th) {
        m16351e(f19174b, str, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m16353e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16345d(f19174b, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16345d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16354e(Throwable th) {
        m16351e(f19174b, (String) null, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m16355e(Locale locale, String str, Object... objArr) {
        try {
            m16345d(f19174b, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16354e(th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m16356f(Throwable th) {
        PrintWriter printWriter;
        StringWriter stringWriter;
        StringWriter stringWriter2 = null;
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
            } catch (Throwable unused) {
                printWriter = null;
            }
        } catch (Throwable unused2) {
            printWriter = null;
        }
        try {
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            String string = stringWriter.toString();
            try {
                stringWriter.close();
            } catch (Throwable unused3) {
            }
            printWriter.close();
            return string;
        } catch (Throwable unused4) {
            stringWriter2 = stringWriter;
            if (stringWriter2 != null) {
                try {
                    stringWriter2.close();
                } catch (Throwable unused5) {
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
            return "";
        }
    }
}
