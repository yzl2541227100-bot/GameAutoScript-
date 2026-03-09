package p285z2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.litepal.LitePalApplication;

/* JADX INFO: loaded from: classes2.dex */
public class zb0 extends SQLiteOpenHelper {
    public static final String OooO00o = "LitePalHelper";

    public zb0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    public zb0(String str, int i) {
        this(LitePalApplication.OooO00o(), str, null, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        yb0.OooOoo0(sQLiteDatabase);
        bc0 bc0VarOooo00o = la0.Oooo00o();
        if (bc0VarOooo00o != null) {
            bc0VarOooo00o.onCreate();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        yb0.Oooo0O0(sQLiteDatabase);
        rc0.OooO0OO(pb0.OooO0oo().OooO0oO(), i2);
        bc0 bc0VarOooo00o = la0.Oooo00o();
        if (bc0VarOooo00o != null) {
            bc0VarOooo00o.OooO00o(i, i2);
        }
    }
}
