package net.grandcentrix.tray.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.Date;
import net.grandcentrix.tray.core.TrayLog;
import net.grandcentrix.tray.provider.TrayContract;

/* JADX INFO: loaded from: classes2.dex */
public class TrayContentProvider extends ContentProvider {
    private static final int ALL_PREFERENCE = 30;
    private static final int INTERNAL_ALL_PREFERENCE = 130;
    private static final int INTERNAL_MODULE_PREFERENCE = 120;
    private static final int INTERNAL_SINGLE_PREFERENCE = 110;
    private static final int MODULE_PREFERENCE = 20;
    private static final int SINGLE_PREFERENCE = 10;
    private static UriMatcher sURIMatcher;
    public TrayDBHelper mDeviceDbHelper;
    public TrayDBHelper mUserDbHelper;

    public static void setAuthority(String str) {
        UriMatcher uriMatcher = new UriMatcher(-1);
        sURIMatcher = uriMatcher;
        uriMatcher.addURI(str, TrayContract.Preferences.BASE_PATH, 30);
        sURIMatcher.addURI(str, "preferences/*", 20);
        sURIMatcher.addURI(str, "preferences/*/*", 10);
        sURIMatcher.addURI(str, TrayContract.InternalPreferences.BASE_PATH, INTERNAL_ALL_PREFERENCE);
        sURIMatcher.addURI(str, "internal_preferences/*", 120);
        sURIMatcher.addURI(str, "internal_preferences/*/*", 110);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        setAuthority(providerInfo.authority);
        TrayLog.m17040v("TrayContentProvider registered for authority: " + providerInfo.authority);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int delete(android.net.Uri r6, java.lang.String r7, java.lang.String[] r8) {
        /*
            r5 = this;
            android.content.UriMatcher r0 = net.grandcentrix.tray.provider.TrayContentProvider.sURIMatcher
            int r0 = r0.match(r6)
            r1 = 10
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L38
            r1 = 20
            if (r0 == r1) goto L51
            r1 = 30
            if (r0 == r1) goto L69
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L38
            r1 = 120(0x78, float:1.68E-43)
            if (r0 == r1) goto L51
            r1 = 130(0x82, float:1.82E-43)
            if (r0 != r1) goto L21
            goto L69
        L21:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Delete is not supported for Uri: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L38:
            java.lang.String r0 = "KEY = ?"
            java.lang.String r7 = net.grandcentrix.tray.provider.SqliteHelper.extendSelection(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.util.List r1 = r6.getPathSegments()
            r4 = 2
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r0[r2] = r1
            java.lang.String[] r8 = net.grandcentrix.tray.provider.SqliteHelper.extendSelectionArgs(r8, r0)
        L51:
            java.lang.String r0 = "MODULE = ?"
            java.lang.String r7 = net.grandcentrix.tray.provider.SqliteHelper.extendSelection(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.util.List r1 = r6.getPathSegments()
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r0[r2] = r1
            java.lang.String[] r8 = net.grandcentrix.tray.provider.SqliteHelper.extendSelectionArgs(r8, r0)
        L69:
            java.lang.String r0 = "backup"
            java.lang.String r0 = r6.getQueryParameter(r0)
            if (r0 != 0) goto L8f
            net.grandcentrix.tray.provider.TrayDBHelper r0 = r5.mDeviceDbHelper
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()
            java.lang.String r1 = r5.getTable(r6)
            int r0 = r0.delete(r1, r7, r8)
            net.grandcentrix.tray.provider.TrayDBHelper r1 = r5.mUserDbHelper
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
            java.lang.String r2 = r5.getTable(r6)
            int r7 = r1.delete(r2, r7, r8)
            int r0 = r0 + r7
            goto L9b
        L8f:
            android.database.sqlite.SQLiteDatabase r0 = r5.getWritableDatabase(r6)
            java.lang.String r1 = r5.getTable(r6)
            int r0 = r0.delete(r1, r7, r8)
        L9b:
            if (r0 <= 0) goto La9
            android.content.Context r7 = r5.getContext()
            android.content.ContentResolver r7 = r7.getContentResolver()
            r8 = 0
            r7.notifyChange(r6, r8)
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.grandcentrix.tray.provider.TrayContentProvider.delete(android.net.Uri, java.lang.String, java.lang.String[]):int");
    }

    public SQLiteDatabase getReadableDatabase(Uri uri) {
        return (shouldBackup(uri) ? this.mUserDbHelper : this.mDeviceDbHelper).getReadableDatabase();
    }

    public String getTable(Uri uri) {
        if (uri == null) {
            return null;
        }
        int iMatch = sURIMatcher.match(uri);
        return (iMatch == 110 || iMatch == 120 || iMatch == INTERNAL_ALL_PREFERENCE) ? TrayDBHelper.INTERNAL_TABLE_NAME : TrayDBHelper.TABLE_NAME;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    public SQLiteDatabase getWritableDatabase(Uri uri) {
        return (shouldBackup(uri) ? this.mUserDbHelper : this.mDeviceDbHelper).getWritableDatabase();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        Date date = new Date();
        int iMatch = sURIMatcher.match(uri);
        if (iMatch != 10 && iMatch != 110) {
            throw new IllegalArgumentException("Insert is not supported for Uri: " + uri);
        }
        contentValues.put("CREATED", Long.valueOf(date.getTime()));
        contentValues.put("UPDATED", Long.valueOf(date.getTime()));
        contentValues.put("MODULE", uri.getPathSegments().get(1));
        contentValues.put("KEY", uri.getPathSegments().get(2));
        int iInsertOrUpdate = insertOrUpdate(getWritableDatabase(uri), getTable(uri), "MODULE = ?AND KEY = ?", new String[]{contentValues.getAsString("MODULE"), contentValues.getAsString("KEY")}, contentValues, new String[]{"CREATED"});
        if (iInsertOrUpdate >= 0) {
            getContext().getContentResolver().notifyChange(uri, null);
            return uri;
        }
        if (iInsertOrUpdate == -1) {
            str = "Couldn't update or insert data. Uri: " + uri;
        } else {
            str = "unknown SQLite error";
        }
        TrayLog.m17041w(str);
        return null;
    }

    public int insertOrUpdate(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr, ContentValues contentValues, String[] strArr2) {
        return SqliteHelper.insertOrUpdate(sQLiteDatabase, str, str2, strArr, contentValues, strArr2);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.mUserDbHelper = new TrayDBHelper(getContext(), true);
        this.mDeviceDbHelper = new TrayDBHelper(getContext(), false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.database.Cursor query(android.net.Uri r15, java.lang.String[] r16, java.lang.String r17, java.lang.String[] r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.grandcentrix.tray.provider.TrayContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public boolean shouldBackup(@NonNull Uri uri) {
        return !"false".equals(uri.getQueryParameter("backup"));
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        this.mUserDbHelper.close();
        this.mDeviceDbHelper.close();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("not implemented");
    }
}
