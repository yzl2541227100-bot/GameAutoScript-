package mobi.oneway.export.p283g;

import android.text.TextUtils;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p285z2.C3688ae;
import p285z2.C4196o4;

/* JADX INFO: renamed from: mobi.oneway.export.g.s */
/* JADX INFO: loaded from: classes2.dex */
public class C3647s {
    /* JADX INFO: renamed from: a */
    public static String m17014a(int i) {
        return i > 1048576 ? m17028b("%.1fM", Float.valueOf((float) ((((double) i) * 1.0d) / ((double) 1048576)))) : m17028b("%.1fK", Float.valueOf((float) ((((double) i) * 1.0d) / ((double) 1024))));
    }

    /* JADX INFO: renamed from: a */
    public static String m17015a(long j) {
        if (j > UMAmapConfig.AMAP_CACHE_WRITE_TIME) {
            return m17028b("%.1f 万", Double.valueOf(j / 10000.0d));
        }
        return String.valueOf(j) + C4196o4.OooO00o.OooO0Oo;
    }

    /* JADX INFO: renamed from: a */
    public static String m17016a(InputStream inputStream) {
        return m17017a(inputStream, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public static String m17017a(InputStream inputStream, String str) {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReaderM17035b = C3648t.m17035b(inputStream, str);
        char[] cArr = new char[4096];
        while (true) {
            int i = inputStreamReaderM17035b.read(cArr);
            if (i == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m17018a(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m17019a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(".")) {
            return str;
        }
        return str.split("\\.")[r1.length - 1];
    }

    /* JADX INFO: renamed from: a */
    public static String m17020a(String str, int i) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("[\\r\\n]+");
        if (i >= strArrSplit.length) {
            return null;
        }
        return strArrSplit[i];
    }

    /* JADX INFO: renamed from: a */
    public static String m17021a(String str, String str2, String str3, Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < objArr.length - 1; i++) {
            sb.append(objArr[i]);
            if (str3 != null) {
                sb.append(str3);
            }
        }
        sb.append(objArr[objArr.length - 1]);
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m17022a(String str, List list) {
        if (list == null) {
            return null;
        }
        Object[] objArr = new Object[list.size()];
        list.toArray(objArr);
        return m17023a(str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m17023a(String str, Object... objArr) {
        return m17021a(null, null, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m17024a(Date date) {
        return new SimpleDateFormat(C3688ae.OooO0O0, Locale.getDefault()).format(date);
    }

    /* JADX INFO: renamed from: a */
    public static String m17025a(Object... objArr) {
        return m17021a(null, null, null, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17026a(String str, String str2) {
        return str != null && str.equals(str2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17027a(String str, String... strArr) {
        if (str == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static String m17028b(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m17029b(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(date);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17030b(String str, String... strArr) {
        if (str != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17031c(String str, String... strArr) {
        if (str != null && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
