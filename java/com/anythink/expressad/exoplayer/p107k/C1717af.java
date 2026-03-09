package com.anythink.expressad.exoplayer.p107k;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1497ac;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1763t;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.af */
/* JADX INFO: loaded from: classes.dex */
public final class C1717af {

    /* JADX INFO: renamed from: a */
    public static final int f9627a;

    /* JADX INFO: renamed from: b */
    public static final String f9628b;

    /* JADX INFO: renamed from: c */
    public static final String f9629c;

    /* JADX INFO: renamed from: d */
    public static final String f9630d;

    /* JADX INFO: renamed from: e */
    public static final String f9631e;

    /* JADX INFO: renamed from: f */
    private static final String f9632f = "Util";

    /* JADX INFO: renamed from: g */
    private static final Pattern f9633g;

    /* JADX INFO: renamed from: h */
    private static final Pattern f9634h;

    /* JADX INFO: renamed from: i */
    private static final Pattern f9635i;

    /* JADX INFO: renamed from: j */
    private static final int[] f9636j;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.af$1 */
    public class AnonymousClass1 implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f9637a;

        public AnonymousClass1(String str) {
            str = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new Thread(runnable, str);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i = 26;
        }
        f9627a = i;
        String str = Build.DEVICE;
        f9628b = str;
        String str2 = Build.MANUFACTURER;
        f9629c = str2;
        String str3 = Build.MODEL;
        f9630d = str3;
        f9631e = str + ", " + str3 + ", " + str2 + ", " + i;
        f9633g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f9634h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f9635i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f9636j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    private C1717af() {
    }

    /* JADX INFO: renamed from: a */
    public static float m8048a(float f) {
        return Math.max(0.1f, Math.min(f, 8.0f));
    }

    /* JADX INFO: renamed from: a */
    public static int m8049a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m8050a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* JADX INFO: renamed from: a */
    private static int m8051a(Uri uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            return m8124l(".".concat(String.valueOf(str)));
        }
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return m8124l(path);
    }

    /* JADX INFO: renamed from: a */
    private static <T> int m8052a(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z3) {
        int i;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t) == 0);
            i = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z3 ? Math.max(0, i) : i;
    }

    /* JADX INFO: renamed from: a */
    private static int m8053a(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f9636j[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public static int m8054a(int[] iArr, int i) {
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            return -(iBinarySearch + 2);
        }
        do {
            iBinarySearch--;
            if (iBinarySearch < 0) {
                break;
            }
        } while (iArr[iBinarySearch] == i);
        return iBinarySearch;
    }

    /* JADX INFO: renamed from: a */
    public static int m8055a(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = iBinarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* JADX INFO: renamed from: a */
    public static int m8056a(long[] jArr, long j, boolean z, boolean z3) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j);
            i = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z3 ? Math.min(jArr.length - 1, i) : i;
    }

    /* JADX INFO: renamed from: a */
    public static long m8057a(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    /* JADX INFO: renamed from: a */
    public static long m8058a(long j, long j2) {
        return Math.max(0L, Math.min(j, j2));
    }

    /* JADX INFO: renamed from: a */
    public static long m8059a(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    /* JADX INFO: renamed from: a */
    public static long m8060a(long j, C1497ac c1497ac, long j2, long j3) {
        if (C1497ac.f7328a.equals(c1497ac)) {
            return j;
        }
        long j4 = c1497ac.f7333f;
        long j5 = j - j4;
        if (((j4 ^ j) & (j ^ j5)) < 0) {
            j5 = Long.MIN_VALUE;
        }
        long j6 = c1497ac.f7334g;
        long j7 = j + j6;
        if (((j6 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = j5 <= j2 && j2 <= j7;
        boolean z3 = j5 <= j3 && j3 <= j7;
        return (z && z3) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z ? j2 : z3 ? j3 : j5;
    }

    /* JADX INFO: renamed from: a */
    public static ComponentName m8061a(Context context, Intent intent) {
        return f9627a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    /* JADX INFO: renamed from: a */
    public static Point m8062a(Context context) {
        return m8063a(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0070  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point m8063a(android.content.Context r7, android.view.Display r8) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p107k.C1717af.m8063a(android.content.Context, android.view.Display):android.graphics.Point");
    }

    /* JADX INFO: renamed from: a */
    private static String m8064a(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.8.4";
    }

    /* JADX INFO: renamed from: a */
    private static String m8065a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.trim().split("(\\s*,\\s*)", -1);
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (i == C1732o.m8207f(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m8066a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    private static String m8067a(StringBuilder sb, Formatter formatter, long j) {
        if (j == C1500b.f7455b) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / C1485b.f6968P;
        sb.setLength(0);
        return (j5 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)) : formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3))).toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m8068a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    /* JADX INFO: renamed from: a */
    public static String m8069a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName("UTF-8"));
    }

    /* JADX INFO: renamed from: a */
    public static String m8070a(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorService m8071a(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.anythink.expressad.exoplayer.k.af.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f9637a;

            public AnonymousClass1(String str2) {
                str = str2;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(@NonNull Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m8072a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: a */
    private static void m8073a(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* JADX INFO: renamed from: a */
    public static void m8074a(InterfaceC1691h interfaceC1691h) {
        if (interfaceC1691h != null) {
            try {
                interfaceC1691h.mo7744b();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8075a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m8076a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m8076a(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: a */
    public static void m8077a(Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public static <T> void m8078a(List<T> list, int i, int i2) {
        list.subList(i, i2).clear();
    }

    /* JADX INFO: renamed from: a */
    public static void m8079a(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
            return;
        }
        if (j >= 1000000 || 1000000 % j != 0) {
            double d = 1000000.0d / j;
            while (i < jArr.length) {
                jArr[i] = (long) (jArr[i] * d);
                i++;
            }
            return;
        }
        long j3 = 1000000 / j;
        while (i < jArr.length) {
            jArr[i] = jArr[i] * j3;
            i++;
        }
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: a */
    private static boolean m8080a() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8081a(char c) {
        return c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?';
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8082a(int i) {
        return i == 10 || i == 13;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8083a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8084a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8085a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8086a(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m8085a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m8087a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m8088a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    private static long[] m8089a(List<Long> list, long j, long j2) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < size) {
                jArr[i] = list.get(i).longValue() / j3;
                i++;
            }
        } else if (j2 >= j || j % j2 != 0) {
            double d = j / j2;
            while (i < size) {
                jArr[i] = (long) (list.get(i).longValue() * d);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < size) {
                jArr[i] = list.get(i).longValue() * j4;
                i++;
            }
        }
        return jArr;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T[] m8090a(T[] tArr, int i) {
        C1711a.m8010a(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    /* JADX INFO: renamed from: a */
    public static String[] m8091a(String str, String str2) {
        return str.split(str2, -1);
    }

    /* JADX INFO: renamed from: b */
    public static int m8092b(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i != 1073741824) {
            if (i == 2) {
                return i2 * 2;
            }
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i2 * 4;
    }

    /* JADX INFO: renamed from: b */
    public static int m8093b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: b */
    private static int m8094b(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return m8124l(path);
    }

    /* JADX INFO: renamed from: b */
    private static <T> int m8095b(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z3) {
        int i;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t) == 0);
            i = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z3 ? Math.min(list.size() - 1, i) : i;
    }

    /* JADX INFO: renamed from: b */
    public static long m8096b(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    /* JADX INFO: renamed from: b */
    private static File m8097b(Context context, String str) throws IOException {
        File fileCreateTempFile = File.createTempFile(str, null, context.getCacheDir());
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m8098b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return m8110d(str);
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    private static void m8099b(Display display, Point point) {
        display.getRealSize(point);
    }

    /* JADX INFO: renamed from: b */
    private static <T extends Throwable> void m8100b(Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8101b(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    /* JADX INFO: renamed from: b */
    private static String[] m8102b(String str, String str2) {
        return str.split(str2, 2);
    }

    /* JADX INFO: renamed from: c */
    private static long m8103c(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: c */
    private static File m8104c(Context context, String str) {
        return File.createTempFile(str, null, context.getCacheDir());
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: c */
    private static void m8105c(Display display, Point point) {
        display.getSize(point);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8106c(int i) {
        return i == Integer.MIN_VALUE || i == 1073741824;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m8107c(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* JADX INFO: renamed from: d */
    public static int m8108d(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 13;
        }
        if (i == 2) {
            return 6;
        }
        int i2 = 4;
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                return i != 8 ? 1 : 3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: d */
    private static long m8109d(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* JADX INFO: renamed from: d */
    public static String m8110d(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: d */
    private static void m8111d(Display display, Point point) {
        point.x = display.getWidth();
        point.y = display.getHeight();
    }

    /* JADX INFO: renamed from: e */
    public static int m8112e(int i) {
        if (i != 0) {
            return (i == 1 || i == 2 || i == 4 || i == 5 || i == 8) ? 4 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: e */
    private static long m8113e(long j, long j2) {
        long j3 = j - j2;
        if (((j ^ j3) & (j2 ^ j)) < 0) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    /* JADX INFO: renamed from: e */
    public static String m8114e(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    /* JADX INFO: renamed from: f */
    public static int m8115f(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m8116f(String str) {
        int length = str.length();
        C1711a.m8010a(length <= 4);
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt << 8) | str.charAt(i);
        }
        return iCharAt;
    }

    /* JADX INFO: renamed from: g */
    public static int m8117g(int i) {
        if (i == 0) {
            return 16777216;
        }
        if (i == 1) {
            return C1500b.f7428aZ;
        }
        if (i == 2) {
            return C1500b.f7427aY;
        }
        if (i == 3 || i == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m8118g(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: h */
    private static int m8119h(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: h */
    public static String m8120h(String str) {
        int length = str.length();
        int iEnd = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '%') {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int i3 = length - (i * 2);
        StringBuilder sb = new StringBuilder(i3);
        Matcher matcher = f9635i.matcher(str);
        while (i > 0 && matcher.find()) {
            char c = (char) Integer.parseInt(matcher.group(1), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c);
            iEnd = matcher.end();
            i--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i3) {
            return null;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    private static long m8121i(String str) {
        Matcher matcher = f9634h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j : j;
    }

    /* JADX INFO: renamed from: j */
    private static long m8122j(String str) throws C1763t {
        Matcher matcher = f9633g.matcher(str);
        if (!matcher.matches()) {
            throw new C1763t("Invalid date/time format: ".concat(String.valueOf(str)));
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - ((long) (i * 60000)) : timeInMillis;
    }

    /* JADX INFO: renamed from: k */
    private static UUID m8123k(String str) {
        String strM8110d = m8110d(str);
        strM8110d.hashCode();
        switch (strM8110d) {
            case "playready":
                return C1500b.f7472bl;
            case "widevine":
                return C1500b.f7471bk;
            case "clearkey":
                return C1500b.f7470bj;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    /* JADX INFO: renamed from: l */
    private static int m8124l(String str) {
        String strM8110d = m8110d(str);
        if (strM8110d.endsWith(".mpd")) {
            return 0;
        }
        if (strM8110d.endsWith(".m3u8")) {
            return 2;
        }
        return strM8110d.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    /* JADX INFO: renamed from: m */
    private static String m8125m(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (m8081a(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder((i2 * 2) + length);
        while (i2 > 0) {
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (m8081a(cCharAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(cCharAt));
                i2--;
            } else {
                sb.append(cCharAt);
            }
            i = i4;
        }
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }
}
