package p285z2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: z2.j6 */
/* JADX INFO: loaded from: classes.dex */
public class C4013j6 extends SQLiteOpenHelper {
    private static final String OooO0O0 = "create table Message(id integer primary key autoincrement,number text,title text,time text,content text,description text,type text)";
    private Context OooO00o;

    public C4013j6(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.OooO00o = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(OooO0O0);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
