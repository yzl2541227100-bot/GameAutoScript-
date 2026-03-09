package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class MLog {
    public static boolean DEBUG = false;
    private static final int LEVEL_DEBUG = 2;
    private static final int LEVEL_ERROR = 5;
    private static final int LEVEL_INFO = 3;
    private static final int LEVEL_VERBOSE = 1;
    private static final int LEVEL_WARN = 4;
    private static int LOG_MAXLENGTH = 2000;
    private static String TAG = "MobclickAgent";

    private MLog() {
    }

    /* JADX INFO: renamed from: d */
    public static void m16263d(String str) {
        m16264d(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: d */
    public static void m16264d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m16265d(String str, Throwable th) {
        m16264d(TAG, str, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m16266d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16264d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16264d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16273e(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m16267d(Throwable th) {
        m16264d(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: d */
    public static void m16268d(Locale locale, String str, Object... objArr) {
        try {
            m16264d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16273e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16269e(String str) {
        m16270e(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: e */
    public static void m16270e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16271e(String str, Throwable th) {
        m16270e(TAG, str, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m16272e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16270e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16270e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16273e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16273e(Throwable th) {
        m16270e(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m16274e(Locale locale, String str, Object... objArr) {
        try {
            m16270e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16273e(th);
        }
    }

    public static String getStackTrace(Throwable th) {
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

    /* JADX INFO: renamed from: i */
    public static void m16275i(String str) {
        m16276i(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: i */
    public static void m16276i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m16277i(String str, Throwable th) {
        m16276i(TAG, str, th);
    }

    /* JADX INFO: renamed from: i */
    public static void m16278i(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16276i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16276i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16273e(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m16279i(Throwable th) {
        m16276i(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: i */
    public static void m16280i(Locale locale, String str, Object... objArr) {
        try {
            m16276i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16273e(th);
        }
    }

    private static void print(int i, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i2 = LOG_MAXLENGTH;
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
                    i2 = LOG_MAXLENGTH + i2;
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
            String stackTrace = getStackTrace(th);
            if (TextUtils.isEmpty(stackTrace)) {
                return;
            }
            if (i == 1) {
                Log.v(str, stackTrace);
                return;
            }
            if (i == 2) {
                Log.d(str, stackTrace);
                return;
            }
            if (i == 3) {
                Log.i(str, stackTrace);
            } else if (i == 4) {
                Log.w(str, stackTrace);
            } else {
                if (i != 5) {
                    return;
                }
                Log.e(str, stackTrace);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m16281v(String str) {
        m16282v(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: v */
    public static void m16282v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m16283v(String str, Throwable th) {
        m16282v(TAG, str, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m16284v(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16282v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16282v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16273e(th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m16285v(Throwable th) {
        m16282v(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m16286v(Locale locale, String str, Object... objArr) {
        try {
            m16282v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16273e(th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m16287w(String str) {
        m16288w(TAG, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: w */
    public static void m16288w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m16289w(String str, Throwable th) {
        m16288w(TAG, str, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m16290w(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                m16288w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                m16288w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th) {
            m16273e(th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m16291w(Throwable th) {
        m16288w(TAG, (String) null, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m16292w(Locale locale, String str, Object... objArr) {
        try {
            m16288w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m16273e(th);
        }
    }
}
