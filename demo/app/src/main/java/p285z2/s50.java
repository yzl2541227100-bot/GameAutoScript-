package p285z2;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.experimental.max.MaxHistory;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public class s50 {
    private static final String OooO0O0 = "malformed JUnit 3 test class: ";
    private final MaxHistory OooO00o;

    public class OooO00o extends x80 {
        public final /* synthetic */ List OooO00o;

        /* JADX INFO: renamed from: z2.s50$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C4737OooO00o extends m90 {
            public C4737OooO00o(Class cls, List list) throws InitializationError {
                super((Class<?>) cls, (List<z80>) list);
            }
        }

        public OooO00o(List list) {
            this.OooO00o = list;
        }

        @Override // p285z2.x80
        public z80 OooO0oo() {
            try {
                return new C4737OooO00o(null, this.OooO00o);
            } catch (InitializationError e) {
                return new l70(null, e);
            }
        }
    }

    private s50(File file) {
        this.OooO00o = MaxHistory.forFolder(file);
    }

    private z80 OooO00o(Description description) {
        if (description.toString().equals("TestSuite with 0 tests")) {
            return m90.Oooo00O();
        }
        if (description.toString().startsWith(OooO0O0)) {
            return new m70(new C4039jw(OooO0o(description)));
        }
        Class<?> testClass = description.getTestClass();
        if (testClass != null) {
            String methodName = description.getMethodName();
            return (methodName == null ? x80.OooO00o(testClass) : x80.OooO(testClass, methodName)).OooO0oo();
        }
        throw new RuntimeException("Can't build a runner from description [" + description + "]");
    }

    private x80 OooO0O0(List<Description> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Description> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OooO00o(it.next()));
        }
        return new OooO00o(arrayList);
    }

    private List<Description> OooO0OO(x80 x80Var) {
        ArrayList arrayList = new ArrayList();
        OooO0Oo(null, x80Var.OooO0oo().getDescription(), arrayList);
        return arrayList;
    }

    private void OooO0Oo(Description description, Description description2, List<Description> list) {
        if (!description2.getChildren().isEmpty()) {
            Iterator<Description> it = description2.getChildren().iterator();
            while (it.hasNext()) {
                OooO0Oo(description2, it.next(), list);
            }
        } else {
            if (!description2.toString().equals("warning(junit.framework.TestSuite$1)")) {
                list.add(description2);
                return;
            }
            list.add(Description.createSuiteDescription(OooO0O0 + description, new Annotation[0]));
        }
    }

    private Class<?> OooO0o(Description description) {
        try {
            return Class.forName(description.toString().replace(OooO0O0, ""));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static s50 OooO0o0(String str) {
        return OooOO0o(new File(str));
    }

    public static s50 OooOO0o(File file) {
        return new s50(file);
    }

    public Result OooO(x80 x80Var, JUnitCore jUnitCore) {
        jUnitCore.OooO00o(this.OooO00o.listener());
        return jUnitCore.OooO0oo(OooOO0(x80Var).OooO0oo());
    }

    public Result OooO0oO(Class<?> cls) {
        return OooO0oo(x80.OooO00o(cls));
    }

    public Result OooO0oo(x80 x80Var) {
        return OooO(x80Var, new JUnitCore());
    }

    public x80 OooOO0(x80 x80Var) {
        if (x80Var instanceof j70) {
            return x80Var;
        }
        List<Description> listOooO0OO = OooO0OO(x80Var);
        Collections.sort(listOooO0OO, this.OooO00o.testComparator());
        return OooO0O0(listOooO0OO);
    }

    public List<Description> OooOO0O(x80 x80Var) {
        return OooO0OO(OooOO0(x80Var));
    }
}
