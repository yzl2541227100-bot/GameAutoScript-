package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.C3404b;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C3488d {

    /* JADX INFO: renamed from: a */
    private static C3488d f19162a = null;

    /* JADX INFO: renamed from: b */
    private static Context f19163b = null;

    /* JADX INFO: renamed from: c */
    private static String f19164c = null;

    /* JADX INFO: renamed from: e */
    private static final String f19165e = "mobclick_agent_user_";

    /* JADX INFO: renamed from: f */
    private static final String f19166f = "mobclick_agent_header_";

    /* JADX INFO: renamed from: g */
    private static final String f19167g = "mobclick_agent_cached_";

    /* JADX INFO: renamed from: d */
    private a f19168d;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final int f19169a;

        /* JADX INFO: renamed from: b */
        private File f19170b;

        /* JADX INFO: renamed from: c */
        private FilenameFilter f19171c;

        public a(Context context) {
            this(context, ".um");
        }

        public a(Context context, String str) {
            this.f19169a = 10;
            this.f19171c = new FilenameFilter() { // from class: com.umeng.commonsdk.statistics.common.d.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return str2.startsWith("um");
                }
            };
            File file = new File(context.getFilesDir(), str);
            this.f19170b = file;
            if (file.exists() && this.f19170b.isDirectory()) {
                return;
            }
            this.f19170b.mkdir();
        }

        /* JADX INFO: renamed from: a */
        public void m16317a(b bVar) {
            File file;
            File[] fileArrListFiles = this.f19170b.listFiles(this.f19171c);
            if (fileArrListFiles != null && fileArrListFiles.length >= 10) {
                Arrays.sort(fileArrListFiles);
                int length = fileArrListFiles.length - 10;
                for (int i = 0; i < length; i++) {
                    fileArrListFiles[i].delete();
                }
            }
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            bVar.m16322a(this.f19170b);
            int length2 = fileArrListFiles.length;
            for (int i2 = 0; i2 < length2; i2++) {
                try {
                } catch (Throwable unused) {
                    file = fileArrListFiles[i2];
                }
                if (bVar.m16323b(fileArrListFiles[i2])) {
                    file = fileArrListFiles[i2];
                    file.delete();
                }
            }
            bVar.m16324c(this.f19170b);
        }

        /* JADX INFO: renamed from: a */
        public void m16318a(byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                return;
            }
            try {
                HelperUtils.writeFile(new File(this.f19170b, String.format(Locale.US, "um_cache_%d.env", Long.valueOf(System.currentTimeMillis()))), bArr);
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m16319a() {
            File[] fileArrListFiles = this.f19170b.listFiles();
            return fileArrListFiles != null && fileArrListFiles.length > 0;
        }

        /* JADX INFO: renamed from: b */
        public void m16320b() {
            File[] fileArrListFiles = this.f19170b.listFiles(this.f19171c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }

        /* JADX INFO: renamed from: c */
        public int m16321c() {
            File[] fileArrListFiles = this.f19170b.listFiles(this.f19171c);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return 0;
            }
            return fileArrListFiles.length;
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m16322a(File file);

        /* JADX INFO: renamed from: b */
        boolean m16323b(File file);

        /* JADX INFO: renamed from: c */
        void m16324c(File file);
    }

    public C3488d(Context context) {
        this.f19168d = new a(context);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C3488d m16307a(Context context) {
        f19163b = context.getApplicationContext();
        f19164c = context.getPackageName();
        if (f19162a == null) {
            f19162a = new C3488d(context);
        }
        return f19162a;
    }

    /* JADX INFO: renamed from: f */
    private SharedPreferences m16308f() {
        return f19163b.getSharedPreferences(f19165e + f19164c, 0);
    }

    /* JADX INFO: renamed from: a */
    public int m16309a() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f19163b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void m16310a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f19163b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16311a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f19163b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16312a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = m16308f().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public String m16313b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f19163b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16314c() {
        return C3404b.m15654c(f19163b) > 0;
    }

    /* JADX INFO: renamed from: d */
    public String[] m16315d() {
        try {
            SharedPreferences sharedPreferencesM16308f = m16308f();
            String string = sharedPreferencesM16308f.getString("au_p", null);
            String string2 = sharedPreferencesM16308f.getString("au_u", null);
            if (string != null && string2 != null) {
                return new String[]{string, string2};
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m16316e() {
        m16308f().edit().remove("au_p").remove("au_u").commit();
    }
}
