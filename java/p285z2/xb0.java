package p285z2;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class xb0 extends ub0 {
    private Collection<fc0> OooOOo0;

    private List<String> o0OO00O() {
        ArrayList arrayList = new ArrayList();
        Iterator<fc0> it = this.OooOOo0.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().OooO0o());
        }
        return arrayList;
    }

    private void o0OOO0o() {
        List<String> listO0Oo0oo = o0Oo0oo();
        OooooO0(listO0Oo0oo, this.OooOOOO);
        Ooooo0o(listO0Oo0oo);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[PHI: r1
  0x005e: PHI (r1v3 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:16:0x005c, B:10:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<java.lang.String> o0Oo0oo() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.OooOOOO     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r3 = "table_schema"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r2 == 0) goto L53
        L1a:
            java.lang.String r2 = "name"
            int r2 = r1.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r3 = "type"
            int r3 = r1.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            boolean r3 = r10.oo0o0Oo(r2, r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r3 == 0) goto L4d
            java.lang.String r3 = "AssociationUpdater"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r4.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r5 = "need to drop "
            r4.append(r5)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r4.append(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            p285z2.qc0.OooO00o(r3, r4)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r0.add(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
        L4d:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r2 != 0) goto L1a
        L53:
            if (r1 == 0) goto L61
            goto L5e
        L56:
            r0 = move-exception
            goto L62
        L58:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L61
        L5e:
            r1.close()
        L61:
            return r0
        L62:
            if (r1 == 0) goto L67
            r1.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.xb0.o0Oo0oo():java.util.List");
    }

    private boolean oo0o0Oo(String str, int i) {
        return !nc0.OooO0Oo(o0OO00O(), str) && i == 0;
    }

    @Override // p285z2.ub0, p285z2.wb0, p285z2.tb0, p285z2.yb0
    public void OooOooO(SQLiteDatabase sQLiteDatabase, boolean z) {
        this.OooOOo0 = Oooo00o();
        this.OooOOOO = sQLiteDatabase;
        o0OOO0o();
    }
}
