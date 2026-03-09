package com.p188b.p189a.p190a;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p188b.p189a.AbstractC2540aq;
import com.p188b.p189a.AbstractC2544au;
import com.p188b.p189a.C2526ac;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.C2582i;
import com.p188b.p199b.C2598y;
import com.p188b.p199b.InterfaceC2581h;
import com.p188b.p199b.InterfaceC2597x;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.IDN;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.b.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2446c {

    /* JADX INFO: renamed from: a */
    public static final byte[] f15175a;

    /* JADX INFO: renamed from: c */
    public static final AbstractC2544au f15177c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC2540aq f15178d;

    /* JADX INFO: renamed from: b */
    public static final String[] f15176b = new String[0];

    /* JADX INFO: renamed from: g */
    private static final C2582i f15181g = C2582i.m13043b("efbbbf");

    /* JADX INFO: renamed from: h */
    private static final C2582i f15182h = C2582i.m13043b("feff");

    /* JADX INFO: renamed from: i */
    private static final C2582i f15183i = C2582i.m13043b("fffe");

    /* JADX INFO: renamed from: j */
    private static final C2582i f15184j = C2582i.m13043b("0000ffff");

    /* JADX INFO: renamed from: k */
    private static final C2582i f15185k = C2582i.m13043b("ffff0000");

    /* JADX INFO: renamed from: e */
    public static final Charset f15179e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: l */
    private static final Charset f15186l = Charset.forName("UTF-16BE");

    /* JADX INFO: renamed from: m */
    private static final Charset f15187m = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: n */
    private static final Charset f15188n = Charset.forName("UTF-32BE");

    /* JADX INFO: renamed from: o */
    private static final Charset f15189o = Charset.forName("UTF-32LE");

    /* JADX INFO: renamed from: f */
    public static final TimeZone f15180f = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: p */
    private static final Pattern f15190p = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        byte[] bArr = new byte[0];
        f15175a = bArr;
        f15177c = AbstractC2544au.m12909a(bArr);
        f15178d = AbstractC2540aq.m12880a(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m12570a(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m12571a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m12572a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static <T> int m12573a(T[] tArr, T t) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (m12587a(tArr[i], t)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static String m12574a(C2526ac c2526ac, boolean z) {
        String strM12817f;
        if (c2526ac.m12817f().contains(":")) {
            strM12817f = "[" + c2526ac.m12817f() + "]";
        } else {
            strM12817f = c2526ac.m12817f();
        }
        if (!z && c2526ac.m12818g() == C2526ac.m12799a(c2526ac.m12811b())) {
            return strM12817f;
        }
        return strM12817f + ":" + c2526ac.m12818g();
    }

    /* JADX INFO: renamed from: a */
    public static String m12575a(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            boolean z = false;
            for (int i = 0; i < lowerCase.length(); i++) {
                char cCharAt = lowerCase.charAt(i);
                if (cCharAt > 31 && cCharAt < 127 && " #%/:?@[\\]".indexOf(cCharAt) == -1) {
                }
                z = true;
            }
            if (z) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12576a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static Charset m12577a(InterfaceC2581h interfaceC2581h, Charset charset) {
        if (interfaceC2581h.mo13011b(f15181g)) {
            interfaceC2581h.mo13023f(r0.mo13056g());
            return f15179e;
        }
        if (interfaceC2581h.mo13011b(f15182h)) {
            interfaceC2581h.mo13023f(r0.mo13056g());
            return f15186l;
        }
        if (interfaceC2581h.mo13011b(f15183i)) {
            interfaceC2581h.mo13023f(r0.mo13056g());
            return f15187m;
        }
        if (interfaceC2581h.mo13011b(f15184j)) {
            interfaceC2581h.mo13023f(r0.mo13056g());
            return f15188n;
        }
        if (!interfaceC2581h.mo13011b(f15185k)) {
            return charset;
        }
        interfaceC2581h.mo13023f(r0.mo13056g());
        return f15189o;
    }

    /* JADX INFO: renamed from: a */
    public static <T> List<T> m12578a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public static <T> List<T> m12579a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX INFO: renamed from: a */
    public static ThreadFactory m12580a(String str, boolean z) {
        return new ThreadFactoryC2460d(str, z);
    }

    /* JADX INFO: renamed from: a */
    public static void m12581a(long j, long j2) {
        if ((j2 | 0) < 0 || 0 > j || j - 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12582a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12583a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m12586a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12584a(InterfaceC2597x interfaceC2597x, int i, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jMo13064d = interfaceC2597x.mo12514a().mo13063c_() ? interfaceC2597x.mo12514a().mo13064d() - jNanoTime : Long.MAX_VALUE;
        interfaceC2597x.mo12514a().mo13060a(Math.min(jMo13064d, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C2579f c2579f = new C2579f();
            while (interfaceC2597x.mo12513a(c2579f, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                c2579f.m13038o();
            }
            C2598y c2598yMo12514a = interfaceC2597x.mo12514a();
            if (jMo13064d == Long.MAX_VALUE) {
                c2598yMo12514a.mo13066e_();
                return true;
            }
            c2598yMo12514a.mo13060a(jNanoTime + jMo13064d);
            return true;
        } catch (InterruptedIOException unused) {
            C2598y c2598yMo12514a2 = interfaceC2597x.mo12514a();
            if (jMo13064d == Long.MAX_VALUE) {
                c2598yMo12514a2.mo13066e_();
                return false;
            }
            c2598yMo12514a2.mo13060a(jNanoTime + jMo13064d);
            return false;
        } catch (Throwable th) {
            C2598y c2598yMo12514a3 = interfaceC2597x.mo12514a();
            if (jMo13064d == Long.MAX_VALUE) {
                c2598yMo12514a3.mo13066e_();
            } else {
                c2598yMo12514a3.mo13060a(jNanoTime + jMo13064d);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12585a(InterfaceC2597x interfaceC2597x, TimeUnit timeUnit) {
        try {
            return m12584a(interfaceC2597x, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12586a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12587a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static <T> T[] m12588a(Class<T> cls, T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object[] objArr : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    T t = tArr2[i];
                    if (objArr.equals(t)) {
                        arrayList.add(t);
                        break;
                    }
                    i++;
                }
            }
        }
        return (T[]) arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, arrayList.size()));
    }

    /* JADX INFO: renamed from: a */
    public static String[] m12589a(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* JADX INFO: renamed from: b */
    public static int m12590b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m12591b(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static String m12592c(String str, int i, int i2) {
        int iM12570a = m12570a(str, i, i2);
        return str.substring(iM12570a, m12591b(str, iM12570a, i2));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12593c(String str) {
        return f15190p.matcher(str).matches();
    }
}
