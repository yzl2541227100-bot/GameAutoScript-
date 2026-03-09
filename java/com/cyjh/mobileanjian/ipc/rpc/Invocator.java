package com.cyjh.mobileanjian.ipc.rpc;

import com.cyjh.mobileanjian.ipc.utils.C2702r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p285z2.C4318rf;

/* JADX INFO: loaded from: classes2.dex */
public class Invocator {
    public static final String TAG = "Invocator";

    public static int invoke(String str, String str2, String str3, List<String> list, List<String> list2) {
        StringBuilder sb = new StringBuilder("want method: ");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append(".");
        sb.append(str3);
        new StringBuilder("types: ").append(list);
        new StringBuilder("value: ").append(list2);
        if (list == null && list2 != null) {
            return 6;
        }
        if (list != null && list2 == null) {
            return 6;
        }
        if (list != null && list2 != null && list.size() != list2.size()) {
            return 6;
        }
        Class<?>[] clsArr = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int size = list.size();
                    Class<?>[] clsArr2 = new Class[size];
                    for (int i = 0; i < size; i++) {
                        clsArr2[i] = C4318rf.OooOO0.OooO0O0(list.get(i));
                    }
                    clsArr = clsArr2;
                }
            } catch (ClassNotFoundException unused) {
                return 1;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return 3;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return 4;
            } catch (NoSuchMethodException unused2) {
                return 2;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return 5;
            }
        }
        Class<?> cls = Class.forName(str + "." + str2);
        Method declaredMethod = cls.getDeclaredMethod(str3, clsArr);
        new StringBuilder("Get method: ").append(declaredMethod);
        Object[] objArrOooO0OO = C2702r.OooO0OO(list, list2);
        if (clsArr != null && objArrOooO0OO == null) {
            return 7;
        }
        declaredMethod.invoke(cls, objArrOooO0OO);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object invoke(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List<java.lang.String> r9, java.util.List<java.lang.String> r10, int r11) {
        /*
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "want method: "
            r11.<init>(r0)
            r11.append(r6)
            java.lang.String r0 = "."
            r11.append(r0)
            r11.append(r7)
            r11.append(r0)
            r11.append(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "types: "
            r11.<init>(r1)
            r11.append(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "value: "
            r11.<init>(r1)
            r11.append(r10)
            r11 = 0
            if (r9 != 0) goto L31
            if (r10 != 0) goto L43
        L31:
            if (r9 == 0) goto L35
            if (r10 == 0) goto L43
        L35:
            if (r9 == 0) goto L44
            if (r10 == 0) goto L44
            int r1 = r9.size()
            int r2 = r10.size()
            if (r1 == r2) goto L44
        L43:
            return r11
        L44:
            if (r9 == 0) goto L66
            int r1 = r9.size()     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            if (r1 <= 0) goto L66
            int r1 = r9.size()     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            r3 = 0
        L53:
            if (r3 >= r1) goto L67
            z2.mf r4 = p285z2.C4318rf.OooOO0     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.Object r5 = r9.get(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.Class r4 = r4.OooO0O0(r5)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            int r3 = r3 + 1
            goto L53
        L66:
            r2 = r11
        L67:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            r1.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            r1.append(r6)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            r1.append(r0)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            r1.append(r7)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.String r6 = r1.toString()     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r8, r2)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.String r0 = "Get method: "
            r8.<init>(r0)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            r8.append(r7)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.Object[] r8 = com.cyjh.mobileanjian.ipc.utils.C2702r.OooO0OO(r9, r10)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            if (r2 == 0) goto L94
            if (r8 != 0) goto L94
            return r11
        L94:
            java.lang.Object r6 = r7.invoke(r6, r8)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            java.lang.String r8 = "result: "
            r7.<init>(r8)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            r7.append(r6)     // Catch: java.lang.reflect.InvocationTargetException -> La3 java.lang.IllegalArgumentException -> La8 java.lang.IllegalAccessException -> Lad java.lang.Throwable -> Lb1
            return r6
        La3:
            r6 = move-exception
            r6.printStackTrace()
            goto Lb1
        La8:
            r6 = move-exception
            r6.printStackTrace()
            goto Lb1
        Lad:
            r6 = move-exception
            r6.printStackTrace()
        Lb1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.mobileanjian.ipc.rpc.Invocator.invoke(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int):java.lang.Object");
    }

    public static boolean isListEmpty(List list) {
        return list == null || list.size() == 0;
    }
}
