package com.tramini.plugin.p261a.p267f;

import android.net.Uri;
import android.text.TextUtils;
import com.tramini.plugin.p261a.p269h.p270a.C3352a;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.tramini.plugin.a.f.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3346f {

    /* JADX INFO: renamed from: com.tramini.plugin.a.f.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final int f18168a = -1;

        /* JADX INFO: renamed from: b */
        public static final int f18169b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f18170c = 1;

        /* JADX INFO: renamed from: d */
        public int f18171d;

        /* JADX INFO: renamed from: e */
        public Object f18172e;

        /* JADX INFO: renamed from: a */
        public static a m15245a() {
            a aVar = new a();
            aVar.f18171d = 0;
            return aVar;
        }

        /* JADX INFO: renamed from: a */
        public static a m15246a(Object obj) {
            a aVar = new a();
            aVar.f18171d = 1;
            aVar.f18172e = obj;
            return aVar;
        }

        /* JADX INFO: renamed from: b */
        public static a m15247b(Object obj) {
            a aVar = new a();
            aVar.f18171d = -1;
            aVar.f18172e = obj;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.f.f$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        private static String m15248a(String str) {
            return C3346f.m15239b(str, "(src|SRC)=(\"|')(.*?)(\"|')", 3);
        }

        /* JADX INFO: renamed from: a */
        public static String m15249a(String str, String str2) {
            for (String str3 : str2.split(",")) {
                str = C3346f.m15242c(str, str3.replaceAll("#01;", ","));
            }
            return !TextUtils.isEmpty(str) ? str : "";
        }

        /* JADX INFO: renamed from: b */
        private static String m15250b(String str, String str2) {
            return C3346f.m15242c(str, str2 + ".*?\\>(.*?)(</span>|</div>)");
        }

        /* JADX INFO: renamed from: c */
        private static String m15251c(String str, String str2) {
            return C3346f.m15239b(str, "<(img|IMG).*?" + str2 + "(.*?)(/>|></img>|>)", 2);
        }

        /* JADX INFO: renamed from: d */
        private static String m15252d(String str, String str2) {
            return C3346f.m15239b(str, "(" + str2 + ")(http.*?)(" + str2 + ")", 2);
        }

        /* JADX INFO: renamed from: e */
        private static String m15253e(String str, String str2) {
            return C3346f.m15239b(str, str2 + "=(\"|')(.*?)(\"|')", 2);
        }

        /* JADX INFO: renamed from: f */
        private static String m15254f(String str, String str2) {
            Matcher matcher = Pattern.compile(str2, 34).matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        }

        /* JADX INFO: renamed from: g */
        private static String m15255g(String str, String str2) {
            return C3346f.m15242c(str, "'" + str2 + "'\\s*:\\s*'(.*?)'");
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.f.f$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean mo15228a(Object obj);

        /* JADX INFO: renamed from: b */
        a mo15229b(Object obj);
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.f.f$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public static final String f18173a = "<!\\[CDATA\\[(.*?)\\]\\]>";

        /* JADX INFO: renamed from: a */
        private static String m15256a(String str) {
            return C3346f.m15242c(str, f18173a);
        }

        /* JADX INFO: renamed from: a */
        public static String m15257a(String str, String str2) {
            String str3;
            for (String str4 : str2.split(",")) {
                if (str4.contains("#")) {
                    String[] strArrSplit = str4.split("#");
                    String str5 = strArrSplit[0];
                    str3 = ".*<" + str5 + ".*?>(.*?" + strArrSplit[1] + ".*?)</" + str5 + ">";
                } else {
                    str3 = "<" + str4 + ".*?>(.*?)</" + str4 + ">";
                }
                str = C3346f.m15242c(str, str3);
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String strM15242c = C3346f.m15242c(str, f18173a);
            return !TextUtils.isEmpty(strM15242c) ? strM15242c : str;
        }

        /* JADX INFO: renamed from: a */
        private static String m15258a(String str, String str2, String str3) {
            return C3346f.m15242c(str, ".*<" + str2 + ".*?>(.*?" + str3 + ".*?)</" + str2 + ">");
        }

        /* JADX INFO: renamed from: b */
        public static String m15259b(String str, String str2) {
            try {
                String strM15242c = C3346f.m15242c(str, "<" + str2 + ">(.*?)</" + str2 + ">");
                if (TextUtils.isEmpty(strM15242c)) {
                    return "";
                }
                String[] strArrSplit = strM15242c.split(":");
                return String.valueOf(Integer.parseInt(strArrSplit[2].substring(0, 2)) + (Integer.parseInt(strArrSplit[1].substring(0, 2)) * 60) + (Integer.parseInt(strArrSplit[0].substring(0, 2)) * 60 * 60));
            } catch (Throwable unused) {
                return "";
            }
        }

        /* JADX INFO: renamed from: c */
        private static String m15260c(String str, String str2) {
            return C3346f.m15242c(str, "<" + str2 + ".*?>(.*?)</" + str2 + ">");
        }

        /* JADX INFO: renamed from: d */
        private static String m15261d(String str, String str2) {
            String strM15242c = C3346f.m15242c(str, str2 + "=\"(.*?)\"");
            return !TextUtils.isEmpty(strM15242c) ? strM15242c.replace("\"", "") : "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m15230a(Object obj, String str) {
        try {
            return obj.getClass().getMethod(str, new Class[0]).invoke(obj, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m15231a(Object obj, String str, StringBuffer stringBuffer, c cVar) {
        Object obj2;
        Object objM15231a;
        Object objM15231a2;
        if (cVar != null && obj != null && obj.getClass().getName().startsWith(str)) {
            stringBuffer.append(obj.getClass().getName() + ",");
            try {
                ArrayList<Field> arrayList = new ArrayList();
                for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
                }
                if (arrayList.size() != 0) {
                    for (Field field : arrayList) {
                        field.setAccessible(true);
                        Object obj3 = field.get(obj);
                        if (obj3 != null) {
                            if (cVar.mo15228a(obj3)) {
                                a aVarMo15229b = cVar.mo15229b(obj3);
                                int i = aVarMo15229b.f18171d;
                                if (i == 0) {
                                    continue;
                                } else {
                                    if (i == 1) {
                                        return aVarMo15229b.f18172e;
                                    }
                                    if (i == -1 && (obj2 = aVarMo15229b.f18172e) != null && !stringBuffer.toString().contains(obj2.getClass().getName()) && (objM15231a = m15231a(obj2, str, stringBuffer, cVar)) != null) {
                                        return objM15231a;
                                    }
                                }
                            } else if (!stringBuffer.toString().contains(obj3.getClass().getName()) && (objM15231a2 = m15231a(obj3, str, stringBuffer, cVar)) != null) {
                                return objM15231a2;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Object m15232a(String str, String str2) {
        try {
            Object objInvoke = Class.forName(str).getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field[] declaredFields = objInvoke.getClass().getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    if (field.get(objInvoke) instanceof Map) {
                        Map map = (Map) field.get(objInvoke);
                        if (map == null) {
                            return null;
                        }
                        Object obj = map.get(str2);
                        return obj instanceof WeakReference ? ((WeakReference) obj).get() : map.get(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m15233a(String str) {
        try {
            return TextUtils.isEmpty(str) ? "" : Uri.parse(str).getQueryParameter("id");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15235a(Class cls, List<Field> list) {
        if (cls != null) {
            try {
                if (cls.getName().equals(Object.class.getName())) {
                    return;
                }
                Field[] declaredFields = cls.getDeclaredFields();
                if (declaredFields != null && declaredFields.length > 0) {
                    list.addAll(Arrays.asList(declaredFields));
                }
                m15235a(cls.getSuperclass(), list);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m15236b(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m15237b(String str, String str2) {
        try {
            return Class.forName(str).getMethod(str2, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m15238b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String queryParameter = Uri.parse(str).getQueryParameter("adurl");
            return TextUtils.isEmpty(queryParameter) ? "" : m15233a(queryParameter);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m15239b(final String str, final String str2, final int i) {
        final ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
        final String[] strArr = new String[1];
        executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: com.tramini.plugin.a.f.f.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Matcher matcher = Pattern.compile(str2, 34).matcher(new C3352a(str));
                    if (matcher.find()) {
                        strArr[0] = matcher.group(i);
                    }
                } catch (Throwable unused) {
                }
                try {
                    synchronized (executorServiceNewFixedThreadPool) {
                        executorServiceNewFixedThreadPool.notifyAll();
                    }
                } catch (Throwable unused2) {
                }
            }
        });
        try {
            synchronized (executorServiceNewFixedThreadPool) {
                executorServiceNewFixedThreadPool.wait(500L);
            }
            executorServiceNewFixedThreadPool.shutdown();
            return strArr[0] != null ? strArr[0] : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15240b(Class cls, List<Method> list) {
        if (cls != null) {
            try {
                if (cls.getName().equals(Object.class.getName())) {
                    return;
                }
                Method[] declaredMethods = cls.getDeclaredMethods();
                if (declaredMethods != null && declaredMethods.length > 0) {
                    list.addAll(Arrays.asList(declaredMethods));
                }
                m15240b(cls.getSuperclass(), list);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m15241c(String str) {
        Properties properties = new Properties();
        try {
            properties.load(new StringReader("unicodedString=".concat(String.valueOf(str))));
        } catch (IOException unused) {
        }
        return properties.getProperty("unicodedString");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m15242c(String str, String str2) {
        return m15239b(str, str2, 1);
    }

    /* JADX INFO: renamed from: d */
    public static String m15243d(String str) {
        try {
            return URLDecoder.decode(str.replaceAll("%(?![0-9a-fA-F]{2})", "%25"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m15244d(String str, String str2) {
        return m15239b(str, str2, 1);
    }
}
