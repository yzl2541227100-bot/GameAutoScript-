package p285z2;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import net.grandcentrix.tray.provider.TrayContract;

/* JADX INFO: renamed from: z2.if */
/* JADX INFO: loaded from: classes2.dex */
public class C3985if {
    private static final String OooO00o = "if";
    private static Handler OooO0O0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void OooO(Context context) {
        Toast.makeText(context, "未授予联系人权限，操作失败！", 0).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO00o(android.content.Context r11) throws java.lang.Throwable {
        /*
            boolean r0 = OooO0oo(r11)
            if (r0 != 0) goto L7
            return
        L7:
            android.content.ContentResolver r0 = r11.getContentResolver()
            android.net.Uri r1 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            r2 = 0
            int r0 = r0.delete(r1, r2, r2)
            if (r0 > 0) goto Laa
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "_id"
            java.lang.String r3 = "account_type"
            java.lang.String[] r6 = new java.lang.String[]{r1, r3}
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            android.net.Uri r5 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            if (r1 == 0) goto L82
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            if (r4 == 0) goto L82
        L36:
            r4 = 0
            long r4 = r1.getLong(r4)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            r6 = 1
            r1.getString(r6)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            android.net.Uri r6 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r6, r4)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            android.content.ContentProviderOperation$Builder r6 = android.content.ContentProviderOperation.newUpdate(r6)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            java.lang.String r7 = "account_name"
            android.content.ContentProviderOperation$Builder r6 = r6.withValue(r7, r2)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            android.content.ContentProviderOperation$Builder r6 = r6.withValue(r3, r2)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            android.content.ContentProviderOperation r6 = r6.build()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            r0.add(r6)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            android.net.Uri r6 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r6, r4)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            android.content.ContentProviderOperation$Builder r4 = android.content.ContentProviderOperation.newDelete(r4)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            android.content.ContentProviderOperation r4 = r4.build()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            r0.add(r4)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            int r4 = r0.size()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            r5 = 100
            if (r4 < r5) goto L79
            OooO0OO(r11, r0)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            r0.clear()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
        L79:
            boolean r4 = r1.moveToNext()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La2
            if (r4 != 0) goto L36
            goto L82
        L80:
            r2 = move-exception
            goto L8e
        L82:
            if (r1 == 0) goto L98
        L84:
            r1.close()
            goto L98
        L88:
            r11 = move-exception
            goto La4
        L8a:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L8e:
            java.lang.String r3 = "ClearContacts"
            java.lang.String r4 = "查询失败"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L98
            goto L84
        L98:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Laa
            OooO0OO(r11, r0)
            goto Laa
        La2:
            r11 = move-exception
            r2 = r1
        La4:
            if (r2 == 0) goto La9
            r2.close()
        La9:
            throw r11
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3985if.OooO00o(android.content.Context):void");
    }

    public static void OooO0O0(Context context, String str) {
        if (OooO0oo(context)) {
            Cursor cursorQuery = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "data1=?", new String[]{str}, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    do {
                        Uri uriWithAppendedId = ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, cursorQuery.getInt(0));
                        if (context.getContentResolver().delete(uriWithAppendedId, null, null) <= 0) {
                            ContentResolver contentResolver = context.getContentResolver();
                            Cursor cursorQuery2 = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{TrayContract.Preferences.Columns.f19815ID}, "contact_id = ?", new String[]{String.valueOf(ContentUris.parseId(uriWithAppendedId))}, null);
                            if (cursorQuery2 != null && cursorQuery2.moveToFirst()) {
                                long j = cursorQuery2.getLong(0);
                                cursorQuery2.close();
                                ContentValues contentValues = new ContentValues();
                                contentValues.putNull("account_name");
                                contentValues.putNull("account_type");
                                if (contentResolver.update(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, j), contentValues, null, null) > 0) {
                                    contentResolver.delete(uriWithAppendedId, null, null);
                                }
                            }
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (Exception e) {
                Log.e(OooO00o, e.getMessage());
            } finally {
                cursorQuery.close();
            }
        }
    }

    private static void OooO0OO(Context context, ArrayList<ContentProviderOperation> arrayList) {
        try {
            context.getContentResolver().applyBatch("com.android.contacts", arrayList);
        } catch (OperationApplicationException | RemoteException e) {
            Log.e("ClearContacts", "批量操作失败", e);
            OooO0oO(context, arrayList);
        }
    }

    private static boolean OooO0Oo(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{TrayContract.Preferences.Columns.f19815ID}, "contact_id = ?", new String[]{String.valueOf(ContentUris.parseId(uri))}, null);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("account_name");
            contentValues.putNull("account_type");
            if (contentResolver.update(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, j), contentValues, null, null) > 0 && contentResolver.delete(uri, null, null) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void OooO0o(android.content.Context r9) throws java.lang.Throwable {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "_id"
            java.lang.String r2 = "account_type"
            java.lang.String[] r5 = new java.lang.String[]{r1, r2}
            r1 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            android.net.Uri r4 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            if (r3 == 0) goto L6f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            if (r4 == 0) goto L6f
        L23:
            r4 = 0
            long r4 = r3.getLong(r4)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            r6 = 1
            r3.getString(r6)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            android.net.Uri r6 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r6, r4)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            android.content.ContentProviderOperation$Builder r6 = android.content.ContentProviderOperation.newUpdate(r6)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            java.lang.String r7 = "account_name"
            android.content.ContentProviderOperation$Builder r6 = r6.withValue(r7, r1)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            android.content.ContentProviderOperation$Builder r6 = r6.withValue(r2, r1)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            android.content.ContentProviderOperation r6 = r6.build()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            r0.add(r6)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            android.net.Uri r6 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r6, r4)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            android.content.ContentProviderOperation$Builder r4 = android.content.ContentProviderOperation.newDelete(r4)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            android.content.ContentProviderOperation r4 = r4.build()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            r0.add(r4)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            int r4 = r0.size()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            r5 = 100
            if (r4 < r5) goto L66
            OooO0OO(r9, r0)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            r0.clear()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
        L66:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L8e
            if (r4 != 0) goto L23
            goto L6f
        L6d:
            r1 = move-exception
            goto L7a
        L6f:
            if (r3 == 0) goto L84
        L71:
            r3.close()
            goto L84
        L75:
            r9 = move-exception
            goto L90
        L77:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L7a:
            java.lang.String r2 = "ClearContacts"
            java.lang.String r4 = "查询失败"
            android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L84
            goto L71
        L84:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L8d
            OooO0OO(r9, r0)
        L8d:
            return
        L8e:
            r9 = move-exception
            r1 = r3
        L90:
            if (r1 == 0) goto L95
            r1.close()
        L95:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3985if.OooO0o(android.content.Context):void");
    }

    public static boolean OooO0o0(Context context, String str, String str2, String str3) {
        if (!OooO0oo(context)) {
            return false;
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str2).withValue("data3", str).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str3).withValue("data2", 2).build());
        try {
            context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, e.getMessage(), 1).show();
            return false;
        }
    }

    private static void OooO0oO(Context context, ArrayList<ContentProviderOperation> arrayList) {
        Iterator<ContentProviderOperation> it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                context.getContentResolver().applyBatch("com.android.contacts", new ArrayList<>(Collections.singletonList(it.next())));
            } catch (Exception e) {
                Log.w("ClearContacts", "重试失败", e);
            }
        }
    }

    private static boolean OooO0oo(final Context context) {
        boolean z = ContextCompat.checkSelfPermission(context, "android.permission.WRITE_CONTACTS") == 0;
        if (!z) {
            OooO0O0.post(new Runnable() { // from class: z2.df
                @Override // java.lang.Runnable
                public final void run() {
                    C3985if.OooO(context);
                }
            });
        }
        return z;
    }
}
