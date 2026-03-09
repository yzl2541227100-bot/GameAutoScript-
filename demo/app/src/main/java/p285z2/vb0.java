package p285z2;

import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.anythink.china.common.C1082d;
import com.umeng.analytics.pro.C3381c;
import com.umeng.commonsdk.framework.C3405c;
import java.io.File;
import org.litepal.LitePalApplication;
import org.litepal.exceptions.DatabaseGenerateException;

/* JADX INFO: loaded from: classes2.dex */
public class vb0 {
    private static zb0 OooO00o;

    private static zb0 OooO00o() {
        pb0 pb0VarOooO0oo = pb0.OooO0oo();
        pb0VarOooO0oo.OooO0O0();
        if (OooO00o == null) {
            String strOooO0o = pb0VarOooO0oo.OooO0o();
            if ("external".equalsIgnoreCase(pb0VarOooO0oo.OooO())) {
                strOooO0o = LitePalApplication.OooO00o().getExternalFilesDir("") + C3381c.f18417b + strOooO0o;
            } else if (!C3405c.f18619d.equalsIgnoreCase(pb0VarOooO0oo.OooO()) && !TextUtils.isEmpty(pb0VarOooO0oo.OooO())) {
                String strReplace = (Environment.getExternalStorageDirectory().getPath() + "/" + pb0VarOooO0oo.OooO()).replace("//", "/");
                if (nc0.OooO0o("androidx.core.content.ContextCompat", "checkSelfPermission") && ContextCompat.checkSelfPermission(LitePalApplication.OooO00o(), C1082d.f2502b) != 0) {
                    throw new DatabaseGenerateException(String.format(DatabaseGenerateException.EXTERNAL_STORAGE_PERMISSION_DENIED, strReplace));
                }
                File file = new File(strReplace);
                if (!file.exists()) {
                    file.mkdirs();
                }
                strOooO0o = strReplace + "/" + strOooO0o;
            }
            OooO00o = new zb0(strOooO0o, pb0VarOooO0oo.OooOO0());
        }
        return OooO00o;
    }

    public static void OooO0O0() {
        zb0 zb0Var = OooO00o;
        if (zb0Var != null) {
            zb0Var.getWritableDatabase().close();
            OooO00o = null;
        }
    }

    public static SQLiteDatabase OooO0OO() {
        return OooO0Oo();
    }

    public static synchronized SQLiteDatabase OooO0Oo() {
        return OooO00o().getWritableDatabase();
    }
}
