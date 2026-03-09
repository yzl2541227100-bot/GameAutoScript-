package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.p010a.C0732e;
import com.umeng.commonsdk.amap.C3402b;
import com.umeng.commonsdk.proguard.C3471v;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.C3482a;
import com.umeng.commonsdk.statistics.C3483b;
import com.umeng.commonsdk.statistics.C3484c;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class UMConfigure {
    public static final int DEVICE_TYPE_BOX = 2;
    public static final int DEVICE_TYPE_PHONE = 1;
    private static final String KEY_FILE_NAME_APPKEY = "APPKEY";
    private static final String KEY_FILE_NAME_LOG = "LOG";
    private static final String KEY_METHOD_NAME_PUSH_SETCHANNEL = "setMessageChannel";
    private static final String KEY_METHOD_NAME_PUSH_SET_SECRET = "setSecret";
    private static final String KEY_METHOD_NAME_SETAPPKEY = "setAppkey";
    private static final String KEY_METHOD_NAME_SETCHANNEL = "setChannel";
    private static final String KEY_METHOD_NAME_SETDEBUGMODE = "setDebugMode";
    private static final String TAG = "UMConfigure";
    private static boolean debugLog;
    private static C3402b readUMAmapTimer;
    private static C3402b writeUMAmapTimer;

    private static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            if (debugLog) {
                Log.e(TAG, "getClass e is " + e.toString());
            }
            return null;
        }
    }

    private static Object getDecInstanceObject(Class<?> cls) {
        Constructor<?> declaredConstructor;
        String string;
        StringBuilder sb;
        String string2;
        if (cls == null) {
            return null;
        }
        try {
            declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        } catch (NoSuchMethodException e) {
            if (debugLog) {
                Log.e(TAG, "getDecInstanceObject e is " + e.toString());
            }
            declaredConstructor = null;
        }
        if (declaredConstructor != null) {
            declaredConstructor.setAccessible(true);
            try {
                return declaredConstructor.newInstance(new Object[0]);
            } catch (IllegalAccessException e2) {
                if (!debugLog) {
                    return null;
                }
                sb = new StringBuilder();
                sb.append("getDecInstanceObject e is ");
                string2 = e2.toString();
                sb.append(string2);
                string = sb.toString();
                Log.e(TAG, string);
                return null;
            } catch (IllegalArgumentException e3) {
                if (!debugLog) {
                    return null;
                }
                sb = new StringBuilder();
                sb.append("getDecInstanceObject e is ");
                string2 = e3.toString();
                sb.append(string2);
                string = sb.toString();
                Log.e(TAG, string);
                return null;
            } catch (InstantiationException e4) {
                if (!debugLog) {
                    return null;
                }
                sb = new StringBuilder();
                sb.append("getDecInstanceObject e is ");
                string2 = e4.toString();
                sb.append(string2);
                string = sb.toString();
                Log.e(TAG, string);
                return null;
            } catch (InvocationTargetException e5) {
                if (!debugLog) {
                    return null;
                }
                sb = new StringBuilder();
                sb.append("getDecInstanceObject e is ");
                string2 = e5.toString();
                sb.append(string2);
                string = sb.toString();
                Log.e(TAG, string);
                return null;
            }
        }
        if (!debugLog) {
            return null;
        }
        string = "getDecInstanceObject constructor is  null";
        Log.e(TAG, string);
        return null;
    }

    private static Method getDecMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        String str2;
        Method declaredMethod = null;
        if (cls != null) {
            try {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                if (debugLog) {
                    Log.e(TAG, "getDecMethod e is " + e.toString());
                }
            }
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            } else if (debugLog) {
                str2 = "getDecMethod met is null";
                Log.e(TAG, str2);
            }
        } else if (debugLog) {
            str2 = "getDecMethod className is null";
            Log.e(TAG, str2);
        }
        return declaredMethod;
    }

    private Object getInstanceObject(Class<?> cls) {
        StringBuilder sb;
        String string;
        String string2;
        if (cls != null) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                if (debugLog) {
                    sb = new StringBuilder();
                    sb.append("getInstanceObject e is ");
                    string = e.toString();
                    sb.append(string);
                    string2 = sb.toString();
                    Log.e(TAG, string2);
                }
            } catch (InstantiationException e2) {
                if (debugLog) {
                    sb = new StringBuilder();
                    sb.append("getInstanceObject e is ");
                    string = e2.toString();
                    sb.append(string);
                    string2 = sb.toString();
                    Log.e(TAG, string2);
                }
            }
        } else if (debugLog) {
            string2 = "getInstanceObject cla is null";
            Log.e(TAG, string2);
        }
        return null;
    }

    public static String getUMIDString(Context context) {
        if (context != null) {
            return UMUtils.getUMId(context.getApplicationContext());
        }
        return null;
    }

    public static void init(Context context, int i, String str) {
        init(context, null, null, i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void init(android.content.Context r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.UMConfigure.init(android.content.Context, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    private static void invoke(Method method, Object obj, Object[] objArr) {
        StringBuilder sb;
        String string;
        if (method == null || obj == null) {
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            if (debugLog) {
                sb = new StringBuilder();
                sb.append("invoke e is ");
                string = e.toString();
                sb.append(string);
                Log.e(TAG, sb.toString());
            }
        } catch (IllegalArgumentException e2) {
            if (debugLog) {
                sb = new StringBuilder();
                sb.append("invoke e is ");
                string = e2.toString();
                sb.append(string);
                Log.e(TAG, sb.toString());
            }
        } catch (InvocationTargetException e3) {
            if (debugLog) {
                sb = new StringBuilder();
                sb.append("invoke e is ");
                string = e3.toString();
                sb.append(string);
                Log.e(TAG, sb.toString());
            }
        }
    }

    private static void invoke(Method method, Object[] objArr) {
        StringBuilder sb;
        String string;
        if (method != null) {
            try {
                method.invoke(null, objArr);
            } catch (IllegalAccessException e) {
                if (debugLog) {
                    sb = new StringBuilder();
                    sb.append("invoke e is ");
                    string = e.toString();
                    sb.append(string);
                    Log.e(TAG, sb.toString());
                }
            } catch (IllegalArgumentException e2) {
                if (debugLog) {
                    sb = new StringBuilder();
                    sb.append("invoke e is ");
                    string = e2.toString();
                    sb.append(string);
                    Log.e(TAG, sb.toString());
                }
            } catch (InvocationTargetException e3) {
                if (debugLog) {
                    sb = new StringBuilder();
                    sb.append("invoke e is ");
                    string = e3.toString();
                    sb.append(string);
                    Log.e(TAG, sb.toString());
                }
            }
        }
    }

    private static void saveSDKComponent() {
        StringBuffer stringBuffer = new StringBuffer();
        if (getClass("com.umeng.analytics.MobclickAgent") != null) {
            stringBuffer.append("a");
        }
        if (getClass("com.umeng.message.PushAgent") != null) {
            stringBuffer.append("p");
        }
        if (getClass("com.umeng.socialize.UMShareAPI") != null) {
            stringBuffer.append(C3471v.f18958al);
        }
        if (getClass("com.umeng.error.UMError") != null) {
            stringBuffer.append(C0732e.f588a);
        }
        if (getClass("com.umeng.commonsdk.UMConfigureImpl") != null) {
            stringBuffer.append("i");
        }
        if (getClass("com.umeng.commonsdk.amap.UMAmapConfig") != null) {
            stringBuffer.append("o");
        }
        if (TextUtils.isEmpty(stringBuffer)) {
            return;
        }
        C3484c.f19148a = stringBuffer.toString();
        UMSLEnvelopeBuild.module = stringBuffer.toString();
    }

    private static void setCheckDevice(boolean z) {
        C3483b.f19144d = z;
    }

    public static void setEncryptEnabled(boolean z) {
        C3484c.m16260a(z);
        UMSLEnvelopeBuild.setEncryptEnabled(z);
    }

    private static void setFile(Class<?> cls, String str, String str2) {
        if (cls != null) {
            try {
                Field field = cls.getField(str);
                field.set(str, str2);
                if (debugLog) {
                    Log.i(TAG, "setFile value is " + field.get(str).toString());
                }
            } catch (Exception e) {
                if (debugLog) {
                    Log.e(TAG, "setFile e is " + e.toString());
                }
            }
        }
    }

    private static void setFile(Class<?> cls, String str, boolean z) {
        if (cls != null) {
            try {
                Field field = cls.getField(str);
                field.set(str, Boolean.valueOf(z));
                if (debugLog) {
                    Log.i(TAG, "setFile value is " + field.get(str).toString());
                }
            } catch (Exception e) {
                if (debugLog) {
                    Log.e(TAG, "setFile e is " + e.toString());
                }
            }
        }
    }

    private static void setLatencyWindow(long j) {
        C3482a.f19139a = ((int) j) * 1000;
    }

    public static void setLogEnabled(boolean z) {
        StringBuilder sb;
        try {
            debugLog = z;
            if (z) {
                Log.i(TAG, "common sdk version is 1.3.2");
            }
            MLog.DEBUG = z;
            Class<?> cls = getClass("com.umeng.message.PushAgent");
            invoke(getDecMethod(cls, KEY_METHOD_NAME_SETDEBUGMODE, new Class[]{Boolean.TYPE}), getDecInstanceObject(cls), new Object[]{Boolean.valueOf(z)});
            setFile(getClass("com.umeng.socialize.Config"), "DEBUG", z);
        } catch (Exception e) {
            e = e;
            if (debugLog) {
                sb = new StringBuilder();
                sb.append("set log enabled e is ");
                sb.append(e);
                Log.e(TAG, sb.toString());
            }
        } catch (Throwable th) {
            e = th;
            if (debugLog) {
                sb = new StringBuilder();
                sb.append("set log enabled e is ");
                sb.append(e);
                Log.e(TAG, sb.toString());
            }
        }
    }
}
