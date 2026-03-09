package p285z2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.grandcentrix.tray.provider.TrayContract;
import org.litepal.exceptions.DatabaseGenerateException;

/* JADX INFO: loaded from: classes2.dex */
public class pc0 {
    private static final String OooO00o = "DBUtility";
    private static final String OooO0O0 = ",abort,add,after,all,alter,and,as,asc,autoincrement,before,begin,between,by,cascade,check,collate,column,commit,conflict,constraint,create,cross,database,deferrable,deferred,delete,desc,distinct,drop,each,end,escape,except,exclusive,exists,foreign,from,glob,group,having,in,index,inner,insert,intersect,into,is,isnull,join,like,limit,match,natural,not,notnull,null,of,offset,on,or,order,outer,plan,pragma,primary,query,raise,references,regexp,reindex,release,rename,replace,restrict,right,rollback,row,savepoint,select,set,table,temp,temporary,then,to,transaction,trigger,union,unique,update,using,vacuum,values,view,virtual,when,where,";
    private static final String OooO0OO = "_lpcolumn";
    private static final String OooO0Oo = "\\s*(=|!=|<>|<|>)";
    private static final String OooO0o = "\\s+(not\\s+)?(in)\\s*\\(";
    private static final String OooO0o0 = "\\s+(not\\s+)?(like|between)\\s+";

    private pc0() {
    }

    public static String OooO(String str, String str2) {
        return nc0.OooO0O0(OooOOO0(str) + "_" + str2);
    }

    public static String OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.trim().toLowerCase(Locale.US);
        if (!lowerCase.contains(",")) {
            return OooO0O0(lowerCase);
        }
        String[] strArrSplit = lowerCase.split(",");
        StringBuilder sb = new StringBuilder();
        int length = strArrSplit.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            String str2 = strArrSplit[i];
            if (z) {
                sb.append(",");
            }
            sb.append(OooO0O0(str2));
            i++;
            z = true;
        }
        return sb.toString();
    }

    private static String OooO0O0(String str) {
        String str2 = "";
        if (str.endsWith("asc")) {
            str = str.replace("asc", "").trim();
            str2 = " asc";
        } else if (str.endsWith("desc")) {
            str = str.replace("desc", "").trim();
            str2 = " desc";
        }
        return OooO0Oo(str) + str2;
    }

    public static String[] OooO0OO(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = OooO0Oo(strArr[i]);
        }
        return strArr2;
    }

    public static String OooO0Oo(String str) {
        if (!OooOOo0(str)) {
            return str;
        }
        return str + OooO0OO;
    }

    public static List<String> OooO0o(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select * from sqlite_master where type = ?", new String[]{"table"});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("tbl_name"));
                        if (!arrayList.contains(string)) {
                            arrayList.add(string);
                        }
                    } while (cursorRawQuery.moveToNext());
                }
                return arrayList;
            } catch (Exception e) {
                e.printStackTrace();
                throw new DatabaseGenerateException(e.getMessage());
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public static String OooO0o0(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("(\\w+\\s*(=|!=|<>|<|>)|\\w+\\s+(not\\s+)?(like|between)\\s+|\\w+\\s+(not\\s+)?(in)\\s*\\()").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group();
                    String strReplaceAll = strGroup.replaceAll("(\\s*(=|!=|<>|<|>)|\\s+(not\\s+)?(like|between)\\s+|\\s+(not\\s+)?(in)\\s*\\()", "");
                    String strReplace = strGroup.replace(strReplaceAll, "");
                    matcher.appendReplacement(stringBuffer, OooO0Oo(strReplaceAll) + strReplace);
                }
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static fc0 OooO0oO(String str, SQLiteDatabase sQLiteDatabase) throws Throwable {
        if (!OooOo00(str, sQLiteDatabase)) {
            throw new DatabaseGenerateException(DatabaseGenerateException.TABLE_DOES_NOT_EXIST_WHEN_EXECUTING + str);
        }
        List<String> listOooO0oo = OooO0oo(str, sQLiteDatabase);
        fc0 fc0Var = new fc0();
        fc0Var.OooO(str);
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("pragma table_info(" + str + ")", null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        dc0 dc0Var = new dc0();
                        String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("name"));
                        String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("type"));
                        boolean z = true;
                        if (cursorRawQuery.getInt(cursorRawQuery.getColumnIndexOrThrow("notnull")) == 1) {
                            z = false;
                        }
                        boolean zContains = listOooO0oo.contains(string);
                        String string3 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("dflt_value"));
                        dc0Var.OooO0oO(string);
                        dc0Var.OooO0oo(string2);
                        dc0Var.OooOO0(z);
                        dc0Var.OooOO0O(zContains);
                        dc0Var.OooO(string3 != null ? string3.replace("'", "") : "");
                        fc0Var.OooO00o(dc0Var);
                    } while (cursorRawQuery.moveToNext());
                }
                return fc0Var;
            } catch (Exception e) {
                e.printStackTrace();
                throw new DatabaseGenerateException(e.getMessage());
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> OooO0oo(java.lang.String r8, android.database.sqlite.SQLiteDatabase r9) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "name"
            java.lang.String r1 = ")"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            r4.<init>()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            java.lang.String r5 = "pragma index_list("
            r4.append(r5)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            r4.append(r8)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            r4.append(r1)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            android.database.Cursor r8 = r9.rawQuery(r8, r3)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            boolean r4 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L82
            if (r4 == 0) goto L73
            r4 = r3
        L29:
            java.lang.String r5 = "unique"
            int r5 = r8.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            int r5 = r8.getInt(r5)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r6 = 1
            if (r5 != r6) goto L67
            int r5 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.lang.String r5 = r8.getString(r5)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.lang.String r7 = "pragma index_info("
            r6.append(r7)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r6.append(r5)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r6.append(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            android.database.Cursor r4 = r9.rawQuery(r5, r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            if (r5 == 0) goto L67
            int r5 = r4.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r2.add(r5)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
        L67:
            boolean r5 = r8.moveToNext()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            if (r5 != 0) goto L29
            r3 = r4
            goto L73
        L6f:
            r9 = move-exception
            goto L80
        L71:
            r9 = move-exception
            goto L84
        L73:
            if (r8 == 0) goto L78
            r8.close()
        L78:
            if (r3 == 0) goto L7d
            r3.close()
        L7d:
            return r2
        L7e:
            r9 = move-exception
            r4 = r3
        L80:
            r3 = r8
            goto L99
        L82:
            r9 = move-exception
            r4 = r3
        L84:
            r3 = r8
            goto L8b
        L86:
            r9 = move-exception
            r4 = r3
            goto L99
        L89:
            r9 = move-exception
            r4 = r3
        L8b:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L98
            org.litepal.exceptions.DatabaseGenerateException r8 = new org.litepal.exceptions.DatabaseGenerateException     // Catch: java.lang.Throwable -> L98
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L98
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L98
            throw r8     // Catch: java.lang.Throwable -> L98
        L98:
            r9 = move-exception
        L99:
            if (r3 == 0) goto L9e
            r3.close()
        L9e:
            if (r4 == 0) goto La3
            r4.close()
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.pc0.OooO0oo(java.lang.String, android.database.sqlite.SQLiteDatabase):java.util.List");
    }

    public static String OooOO0(String str) {
        return nc0.OooO0O0(OooOOO0(str) + TrayContract.Preferences.Columns.f19815ID);
    }

    public static String OooOO0O(String str, String str2) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Locale locale = Locale.US;
        if (str.toLowerCase(locale).compareTo(str2.toLowerCase(locale)) <= 0) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2);
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append("_");
            sb.append(str);
        }
        return sb.toString();
    }

    public static String OooOO0o(Field field) {
        return nc0.OooO0O0(field.getName() + TrayContract.Preferences.Columns.f19815ID);
    }

    public static String OooOOO(String str) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.US).endsWith(TrayContract.Preferences.Columns.f19815ID)) {
            return null;
        }
        return str.substring(0, str.length() - 3);
    }

    public static String OooOOO0(String str) {
        if (TextUtils.isEmpty(str) || '.' == str.charAt(str.length() - 1)) {
            return null;
        }
        return str.substring(str.lastIndexOf(".") + 1);
    }

    public static List<String> OooOOOO(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(OooOOO0(it.next()));
            }
        }
        return arrayList;
    }

    public static boolean OooOOOo(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("pragma table_info(" + str2 + ")", null);
                if (cursorRawQuery.moveToFirst()) {
                    while (true) {
                        if (str.equalsIgnoreCase(cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("name")))) {
                            z = true;
                            break;
                        }
                        if (!cursorRawQuery.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorRawQuery != null) {
                }
            }
            return z;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r0.getInt(r0.getColumnIndexOrThrow("type")) != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooOOo(java.lang.String r9, android.database.sqlite.SQLiteDatabase r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L61
            java.lang.String r0 = "[0-9a-zA-Z]+_[0-9a-zA-Z]+"
            boolean r0 = r9.matches(r0)
            if (r0 == 0) goto L61
            r0 = 0
            java.lang.String r2 = "table_schema"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r10
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            boolean r10 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r10 == 0) goto L4c
        L22:
            java.lang.String r10 = "name"
            int r10 = r0.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.String r10 = r0.getString(r10)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            boolean r10 = r9.equalsIgnoreCase(r10)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r10 == 0) goto L46
            java.lang.String r9 = "type"
            int r9 = r0.getColumnIndexOrThrow(r9)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            int r9 = r0.getInt(r9)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r10 = 2
            if (r9 != r10) goto L4c
            r9 = 1
            if (r0 == 0) goto L45
            r0.close()
        L45:
            return r9
        L46:
            boolean r10 = r0.moveToNext()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r10 != 0) goto L22
        L4c:
            if (r0 == 0) goto L61
            goto L57
        L4f:
            r9 = move-exception
            goto L5b
        L51:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L61
        L57:
            r0.close()
            goto L61
        L5b:
            if (r0 == 0) goto L60
            r0.close()
        L60:
            throw r9
        L61:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.pc0.OooOOo(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }

    public static boolean OooOOo0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(",");
        sb.append(str.toLowerCase(Locale.US));
        sb.append(",");
        return OooO0O0.contains(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r0.getInt(r0.getColumnIndexOrThrow("type")) != 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooOOoo(java.lang.String r9, android.database.sqlite.SQLiteDatabase r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L60
            java.lang.String r0 = "[0-9a-zA-Z]+_[0-9a-zA-Z]+"
            boolean r0 = r9.matches(r0)
            if (r0 == 0) goto L60
            r0 = 0
            java.lang.String r2 = "table_schema"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r10
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            boolean r10 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r10 == 0) goto L4b
        L22:
            java.lang.String r10 = "name"
            int r10 = r0.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r10 = r0.getString(r10)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            boolean r10 = r9.equalsIgnoreCase(r10)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r10 == 0) goto L45
            java.lang.String r9 = "type"
            int r9 = r0.getColumnIndexOrThrow(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            int r9 = r0.getInt(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r10 = 1
            if (r9 != r10) goto L4b
            if (r0 == 0) goto L44
            r0.close()
        L44:
            return r10
        L45:
            boolean r10 = r0.moveToNext()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r10 != 0) goto L22
        L4b:
            if (r0 == 0) goto L60
            goto L56
        L4e:
            r9 = move-exception
            goto L5a
        L50:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L60
        L56:
            r0.close()
            goto L60
        L5a:
            if (r0 == 0) goto L5f
            r0.close()
        L5f:
            throw r9
        L60:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.pc0.OooOOoo(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }

    public static boolean OooOo00(String str, SQLiteDatabase sQLiteDatabase) {
        try {
            return nc0.OooO0Oo(OooO0o(sQLiteDatabase), str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
