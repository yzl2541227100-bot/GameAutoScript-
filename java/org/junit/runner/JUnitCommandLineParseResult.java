package org.junit.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.FilterFactory;
import org.junit.runners.model.InitializationError;
import p285z2.m60;
import p285z2.t80;
import p285z2.v80;
import p285z2.x80;

/* JADX INFO: loaded from: classes2.dex */
public class JUnitCommandLineParseResult {
    private final List<String> OooO00o = new ArrayList();
    private final List<Class<?>> OooO0O0 = new ArrayList();
    private final List<Throwable> OooO0OO = new ArrayList();

    public static class CommandLineParserError extends Exception {
        private static final long serialVersionUID = 1;

        public CommandLineParserError(String str) {
            super(str);
        }
    }

    private x80 OooO00o(x80 x80Var) {
        try {
            Iterator<String> it = this.OooO00o.iterator();
            while (it.hasNext()) {
                x80Var = x80Var.OooO0oO(v80.OooO0o0(x80Var, it.next()));
            }
            return x80Var;
        } catch (FilterFactory.FilterNotCreatedException e) {
            return OooO0Oo(e);
        }
    }

    private String[] OooO0O0(String[] strArr, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i != i2) {
            arrayList.add(strArr[i]);
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private x80 OooO0Oo(Throwable th) {
        return x80.OooO0o0(JUnitCommandLineParseResult.class, th);
    }

    public static JUnitCommandLineParseResult OooO0oO(String[] strArr) {
        JUnitCommandLineParseResult jUnitCommandLineParseResult = new JUnitCommandLineParseResult();
        jUnitCommandLineParseResult.OooO0oo(strArr);
        return jUnitCommandLineParseResult;
    }

    private void OooO0oo(String[] strArr) {
        OooOO0(OooO(strArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return OooO0O0(r8, r1, r8.length);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] OooO(java.lang.String... r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.length
            if (r1 == r2) goto L8e
            r2 = r8[r1]
            java.lang.String r3 = "--"
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L17
            int r1 = r1 + 1
        L11:
            int r0 = r8.length
            java.lang.String[] r8 = r7.OooO0O0(r8, r1, r0)
            return r8
        L17:
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L11
            java.lang.String r3 = "--filter="
            boolean r3 = r2.startsWith(r3)
            java.lang.String r4 = "--filter"
            if (r3 != 0) goto L4f
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L2e
            goto L4f
        L2e:
            java.util.List<java.lang.Throwable> r3 = r7.OooO0OO
            org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError r4 = new org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "JUnit knows nothing about the "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = " option"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            r3.add(r4)
            goto L8a
        L4f:
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L79
            int r1 = r1 + 1
            int r3 = r8.length
            if (r1 >= r3) goto L5d
            r2 = r8[r1]
            goto L85
        L5d:
            java.util.List<java.lang.Throwable> r8 = r7.OooO0OO
            org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError r1 = new org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " value not specified"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            r8.add(r1)
            goto L8e
        L79:
            r3 = 61
            int r3 = r2.indexOf(r3)
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)
        L85:
            java.util.List<java.lang.String> r3 = r7.OooO00o
            r3.add(r2)
        L8a:
            int r1 = r1 + 1
            goto L2
        L8e:
            java.lang.String[] r8 = new java.lang.String[r0]
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.runner.JUnitCommandLineParseResult.OooO(java.lang.String[]):java.lang.String[]");
    }

    public x80 OooO0OO(t80 t80Var) {
        if (!this.OooO0OO.isEmpty()) {
            return OooO0Oo(new InitializationError(this.OooO0OO));
        }
        List<Class<?>> list = this.OooO0O0;
        return OooO00o(x80.OooO0OO(t80Var, (Class[]) list.toArray(new Class[list.size()])));
    }

    public List<String> OooO0o() {
        return Collections.unmodifiableList(this.OooO00o);
    }

    public List<Class<?>> OooO0o0() {
        return Collections.unmodifiableList(this.OooO0O0);
    }

    public void OooOO0(String[] strArr) {
        for (String str : strArr) {
            try {
                this.OooO0O0.add(m60.OooO00o(str));
            } catch (ClassNotFoundException e) {
                this.OooO0OO.add(new IllegalArgumentException("Could not find class [" + str + "]", e));
            }
        }
    }
}
