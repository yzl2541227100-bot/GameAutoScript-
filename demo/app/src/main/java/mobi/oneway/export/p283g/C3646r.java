package mobi.oneway.export.p283g;

import android.content.SharedPreferences;
import java.util.Map;
import mobi.oneway.export.p274a.C3582b;

/* JADX INFO: renamed from: mobi.oneway.export.g.r */
/* JADX INFO: loaded from: classes2.dex */
public class C3646r {

    /* JADX INFO: renamed from: a */
    private static final String f19813a = "OneWay_sp";

    /* JADX INFO: renamed from: b */
    private String f19814b;

    public C3646r(String str) {
        this.f19814b = str;
    }

    /* JADX INFO: renamed from: a */
    public static C3646r m17006a() {
        return m17007a(f19813a);
    }

    /* JADX INFO: renamed from: a */
    public static C3646r m17007a(String str) {
        return new C3646r(str);
    }

    /* JADX INFO: renamed from: d */
    private SharedPreferences m17008d() {
        return C3582b.m16650a().getSharedPreferences(this.f19814b, 0);
    }

    /* JADX INFO: renamed from: a */
    public C3646r m17009a(String str, Object obj) {
        SharedPreferences.Editor editorEdit = m17008d().edit();
        if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        } else {
            editorEdit.putString(str, String.valueOf(obj));
        }
        editorEdit.apply();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Object m17010b(String str, Object obj) {
        SharedPreferences sharedPreferencesM17008d = m17008d();
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferencesM17008d.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferencesM17008d.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferencesM17008d.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferencesM17008d.getLong(str, ((Long) obj).longValue()));
        }
        if (obj instanceof String) {
            return sharedPreferencesM17008d.getString(str, (String) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, ?> m17011b() {
        return m17008d().getAll();
    }

    /* JADX INFO: renamed from: b */
    public C3646r m17012b(String str) {
        m17008d().edit().remove(str).apply();
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C3646r m17013c() {
        m17008d().edit().clear().apply();
        return this;
    }
}
