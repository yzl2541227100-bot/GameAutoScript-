package com.anythink.core.common.p066o;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.anythink.core.common.p051b.C1175n;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.p284io.FilenameUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.anythink.core.common.o.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1345i {

    /* JADX INFO: renamed from: a */
    public static final String f5286a = "CommonUtils";

    /* JADX INFO: renamed from: b */
    public static char[] f5287b = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* JADX INFO: renamed from: d */
    private static char[] f5289d = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* JADX INFO: renamed from: e */
    private static char[] f5290e = {FilenameUtils.EXTENSION_SEPARATOR, 'X'};

    /* JADX INFO: renamed from: f */
    private static int f5291f = 0;

    /* JADX INFO: renamed from: g */
    private static int f5292g = 1;

    /* JADX INFO: renamed from: h */
    private static int f5293h = 2;

    /* JADX INFO: renamed from: i */
    private static int f5294i = 3;

    /* JADX INFO: renamed from: j */
    private static int f5295j = 0;

    /* JADX INFO: renamed from: k */
    private static int f5296k = 7;

    /* JADX INFO: renamed from: l */
    private static int f5297l = 14;

    /* JADX INFO: renamed from: m */
    private static int f5298m = 19;

    /* JADX INFO: renamed from: n */
    private static int f5299n = 16;

    /* JADX INFO: renamed from: o */
    private static int f5300o = 26;

    /* JADX INFO: renamed from: c */
    public static char[] f5288c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* JADX INFO: renamed from: p */
    private static final Pattern f5301p = Pattern.compile("(?i)((?:http|https|ftp|file)://|(?:inline|data|about|javascript):|(?:.*:.*@))(.*)");

    /* JADX INFO: renamed from: com.anythink.core.common.o.i$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnSystemUiVisibilityChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f5302a;

        public AnonymousClass1(View view) {
            this.f5302a = view;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i) {
            if ((i & 2) == 0) {
                C1345i.m4157a(this.f5302a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4153a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public static int m4154a(Context context, String str, String str2) {
        if (context == null) {
            context = C1175n.m2059a().m2148f();
        }
        if (context == null) {
            return -1;
        }
        String strConcat = "anythink_".concat(String.valueOf(str));
        String strM2106L = C1175n.m2059a().m2106L();
        int identifier = TextUtils.isEmpty(strM2106L) ? -1 : context.getResources().getIdentifier(strConcat, str2, strM2106L);
        if (identifier > 0) {
            StringBuilder sb = new StringBuilder("getResId (use bundle name), ");
            sb.append(strConcat);
            sb.append(", resId: ");
            sb.append(identifier);
            return identifier;
        }
        int identifier2 = context.getResources().getIdentifier(strConcat, str2, context.getPackageName());
        StringBuilder sb2 = new StringBuilder("getResId (use default package name), ");
        sb2.append(strConcat);
        sb2.append(", resId: ");
        sb2.append(identifier2);
        return identifier2;
    }

    /* JADX INFO: renamed from: a */
    public static String m4155a(Object[] objArr) {
        int length;
        if (objArr == null || objArr.length - 1 == -1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            sb.append(String.valueOf(objArr[i]));
            if (i == length) {
                return sb.toString();
            }
            sb.append(",");
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4156a(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(4870);
            decorView.setOnSystemUiVisibilityChangeListener(new AnonymousClass1(decorView));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4157a(View view) {
        view.setSystemUiVisibility(4870);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4158a() {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4159a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m4160a(Context context, String str) {
        boolean z;
        z = false;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (m4168b(str, context) != null) {
                        z = true;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static <T extends String> boolean m4161a(T t) {
        return t == null || t.length() == 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4162a(String str, Context context) {
        boolean z = false;
        try {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                StringBuilder sb = new StringBuilder("Permission ");
                sb.append(str);
                sb.append(" is granted");
                z = true;
            } else {
                StringBuilder sb2 = new StringBuilder("Permission ");
                sb2.append(str);
                sb2.append(" is NOT granted");
            }
        } catch (Exception unused) {
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static final char[] m4163a(int i) {
        StringBuilder sb;
        String strValueOf;
        if (i == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(f5287b, f5296k)));
            sb.append(f5290e[f5295j]);
            sb.append(String.valueOf(Arrays.copyOfRange(f5287b, f5296k, f5297l)));
            sb.append(f5290e[f5295j]);
            sb.append(String.valueOf(Arrays.copyOfRange(f5287b, f5297l, f5299n)));
            sb.append(f5290e[f5295j]);
            strValueOf = String.valueOf(f5288c);
        } else if (i == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(f5287b, f5296k)));
            sb.append(f5290e[f5295j]);
            sb.append(String.valueOf(Arrays.copyOfRange(f5287b, f5296k, f5297l)));
            sb.append(f5290e[f5295j]);
            strValueOf = String.valueOf(Arrays.copyOfRange(f5287b, f5298m, f5300o));
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(f5287b, f5299n, f5298m)));
            strValueOf = String.valueOf(f5289d);
        } else {
            if (i != 3) {
                sb = null;
                return sb.toString().toCharArray();
            }
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(f5287b, f5299n, f5298m)));
            strValueOf = String.valueOf(f5288c);
        }
        sb.append(strValueOf);
        return sb.toString().toCharArray();
    }

    /* JADX INFO: renamed from: a */
    public static String[] m4164a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.optString(i);
            }
            return strArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m4165b(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", C3902g6.OooO0O0);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private static int m4166b(Context context, String str, String str2) {
        int i;
        String str3 = str + "_" + str2;
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        for (Class<?> cls : Class.forName(context.getPackageName() + ".R").getClasses()) {
            if (cls.getSimpleName().equals("styleable")) {
                for (Field field : cls.getFields()) {
                    if (field.getName().equals(str3)) {
                        return ((Integer) field.get(null)).intValue();
                    }
                    return 0;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    private static View.OnSystemUiVisibilityChangeListener m4167b(View view) {
        return new AnonymousClass1(view);
    }

    /* JADX INFO: renamed from: b */
    private static Object m4168b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(m4163a(f5291f))).getMethod(String.valueOf(m4163a(f5293h)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(m4163a(f5292g))).getMethod(String.valueOf(m4163a(f5294i)), new Class[0]).invoke(context, new Object[0]), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T extends String> boolean m4169b(T t) {
        return t != null && t.length() > 0;
    }

    /* JADX INFO: renamed from: b */
    private static int[] m4170b(Context context, String str) {
        int i;
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        for (Field field : Class.forName(context.getPackageName() + ".R$styleable").getFields()) {
            if (field.getName().equals(str)) {
                return (int[]) field.get(null);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, Object> m4171c(String str) {
        HashMap map = new HashMap();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.opt(next));
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4172c(Context context) {
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4173d(String str) {
        return f5301p.matcher(str.toLowerCase()).matches();
    }
}
