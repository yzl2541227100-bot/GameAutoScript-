package mobi.oneway.export;

import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import mobi.oneway.export.enums.PluginErrorType;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p274a.C3582b;
import mobi.oneway.export.p274a.C3583c;
import mobi.oneway.export.p274a.C3584d;
import mobi.oneway.export.p280e.C3611c;
import mobi.oneway.export.p283g.C3635g;
import mobi.oneway.export.p283g.C3636h;
import mobi.oneway.export.p283g.C3638j;
import mobi.oneway.export.p283g.C3641m;

/* JADX INFO: renamed from: mobi.oneway.export.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3585b {

    /* JADX INFO: renamed from: a */
    private static ClassLoader f19620a;

    /* JADX INFO: renamed from: mobi.oneway.export.b$1 */
    public static class AnonymousClass1 implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.getName().startsWith("OnewaySdk");
        }
    }

    /* JADX INFO: renamed from: a */
    public static Class m16664a(String str) {
        try {
            return m16665a().loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ClassLoader m16665a() {
        try {
            if (f19620a == null) {
                m16669e();
                if (C3584d.m16663a()) {
                    f19620a = C3585b.class.getClassLoader();
                } else {
                    f19620a = new DexClassLoader(m16666b(), m16667c(), null, C3585b.class.getClassLoader());
                }
            }
            return f19620a;
        } catch (Exception e) {
            C3611c.m16816a(PluginErrorType.shell_error_classloader, C3635g.m16943a((Throwable) e));
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m16666b() {
        if (C3582b.m16650a() == null) {
            return "";
        }
        return C3582b.m16650a().getDir("plugin", 0).getPath() + File.separator + C3581a.f19609j;
    }

    /* JADX INFO: renamed from: c */
    private static String m16667c() {
        return C3582b.m16650a() != null ? C3582b.m16650a().getDir(C3581a.f19607h, 0).getPath() : "";
    }

    /* JADX INFO: renamed from: d */
    private static String m16668d() {
        return C3582b.m16650a() != null ? C3582b.m16650a().getDir("plugin", 0).getPath() : "";
    }

    /* JADX INFO: renamed from: e */
    private static void m16669e() {
        if (C3582b.m16650a() == null) {
            C3641m.m16997d("context is null,please invoke OnewaySdk.init method first");
            return;
        }
        m16670f();
        if (C3636h.m16951a(m16666b())) {
            return;
        }
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = C3582b.m16650a().getAssets().open(C3583c.m16660a() + File.separator + C3583c.m16661b());
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                C3636h.m16950a(new File(m16666b()), bArr);
                C3638j.m16981a(inputStreamOpen);
            } catch (IOException e) {
                C3641m.m16997d("load local default OnewaySdk failed");
                C3611c.m16816a(PluginErrorType.shell_error_assetsIo, C3635g.m16943a((Throwable) e));
                C3638j.m16981a(inputStreamOpen);
            }
        } catch (Throwable th) {
            C3638j.m16981a(inputStreamOpen);
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m16670f() {
        File[] fileArrListFiles;
        File file = new File(m16668d());
        if (!C3636h.m16965e(file) || (fileArrListFiles = file.listFiles(new FileFilter() { // from class: mobi.oneway.export.b.1
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return file2.getName().startsWith("OnewaySdk");
            }
        })) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!file2.getName().equals(C3581a.f19609j)) {
                C3636h.m16972j(file2);
            }
        }
    }
}
