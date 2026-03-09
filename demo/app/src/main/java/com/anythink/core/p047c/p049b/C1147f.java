package com.anythink.core.p047c.p049b;

import com.anythink.core.p047c.p049b.C1146e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.c.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1147f {

    /* JADX INFO: renamed from: a */
    public static final double f2898a = -1.0d;

    /* JADX INFO: renamed from: b */
    private static final String f2899b = "UserValueCalculator";

    /* JADX INFO: renamed from: c */
    private static final String[] f2900c = {"MAX", "MIN", "AVG", "SUM", "COUNT"};

    /* JADX INFO: renamed from: d */
    private static final String[] f2901d = {"=", ">", "<", "!=", ">=", "<="};

    /* JADX INFO: renamed from: e */
    private static final String[] f2902e = {"OR", "AND"};

    /* JADX INFO: renamed from: f */
    private static final String[] f2903f = {"DESC", "ASC"};

    /* JADX INFO: renamed from: g */
    private final C1146e f2904g;

    public C1147f(C1146e c1146e) {
        this.f2904g = c1146e;
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m1902a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("f", 2);
            jSONObject.put("q_f", "price");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("type");
            jSONObject.put("w_c_f", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(0);
            jSONObject.put("w_c_o", jSONArray2);
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put("4");
            jSONObject.put("w_c_v", jSONArray3);
            jSONObject.put("o_f", C1146e.a.f2892i);
            jSONObject.put("o", 0);
            jSONObject.put("l", 3);
        } catch (JSONException e) {
            e.getMessage();
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:140|(1:142)(1:143)|144|145|(1:178)(27:242|151|(9:154|155|244|156|(1:162)(1:158)|163|(1:250)(2:168|247)|169|152)|246|170|171|238|180|(2:182|183)(1:184)|240|185|(1:187)|194|(1:199)(1:198)|200|(1:202)|203|(3:205|(1:207)|208)|209|(3:211|(1:213)|214)|215|(1:217)|218|219|237|220|(2:228|251)(3:226|227|231))|179|238|180|(0)(0)|240|185|(0)|194|(17:196|199|200|(0)|203|(0)|209|(0)|215|(0)|218|219|237|220|(2:222|224)|228|251)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0143, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0145, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0146, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0148, code lost:
    
        new java.lang.StringBuilder("get order by sql failed: ").append(r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0115 A[Catch: Exception -> 0x0145, TRY_LEAVE, TryCatch #2 {Exception -> 0x0145, blocks: (B:180:0x0109, B:182:0x0115), top: B:238:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x012c A[Catch: Exception -> 0x0143, TRY_LEAVE, TryCatch #3 {Exception -> 0x0143, blocks: (B:185:0x0123, B:187:0x012c), top: B:240:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x015c A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:130:0x0021, B:132:0x0027, B:136:0x0037, B:137:0x003b, B:140:0x0045, B:142:0x004a, B:144:0x004f, B:149:0x0077, B:176:0x00f6, B:194:0x0156, B:196:0x015c, B:198:0x0162, B:200:0x016f, B:202:0x017a, B:203:0x019a, B:205:0x01a0, B:207:0x01a6, B:208:0x01a9, B:209:0x01ac, B:211:0x01b2, B:213:0x01b8, B:214:0x01bb, B:215:0x01be, B:217:0x01db, B:218:0x01ed, B:193:0x0148), top: B:235:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x017a A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:130:0x0021, B:132:0x0027, B:136:0x0037, B:137:0x003b, B:140:0x0045, B:142:0x004a, B:144:0x004f, B:149:0x0077, B:176:0x00f6, B:194:0x0156, B:196:0x015c, B:198:0x0162, B:200:0x016f, B:202:0x017a, B:203:0x019a, B:205:0x01a0, B:207:0x01a6, B:208:0x01a9, B:209:0x01ac, B:211:0x01b2, B:213:0x01b8, B:214:0x01bb, B:215:0x01be, B:217:0x01db, B:218:0x01ed, B:193:0x0148), top: B:235:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01a0 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:130:0x0021, B:132:0x0027, B:136:0x0037, B:137:0x003b, B:140:0x0045, B:142:0x004a, B:144:0x004f, B:149:0x0077, B:176:0x00f6, B:194:0x0156, B:196:0x015c, B:198:0x0162, B:200:0x016f, B:202:0x017a, B:203:0x019a, B:205:0x01a0, B:207:0x01a6, B:208:0x01a9, B:209:0x01ac, B:211:0x01b2, B:213:0x01b8, B:214:0x01bb, B:215:0x01be, B:217:0x01db, B:218:0x01ed, B:193:0x0148), top: B:235:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01b2 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:130:0x0021, B:132:0x0027, B:136:0x0037, B:137:0x003b, B:140:0x0045, B:142:0x004a, B:144:0x004f, B:149:0x0077, B:176:0x00f6, B:194:0x0156, B:196:0x015c, B:198:0x0162, B:200:0x016f, B:202:0x017a, B:203:0x019a, B:205:0x01a0, B:207:0x01a6, B:208:0x01a9, B:209:0x01ac, B:211:0x01b2, B:213:0x01b8, B:214:0x01bb, B:215:0x01be, B:217:0x01db, B:218:0x01ed, B:193:0x0148), top: B:235:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01db A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:130:0x0021, B:132:0x0027, B:136:0x0037, B:137:0x003b, B:140:0x0045, B:142:0x004a, B:144:0x004f, B:149:0x0077, B:176:0x00f6, B:194:0x0156, B:196:0x015c, B:198:0x0162, B:200:0x016f, B:202:0x017a, B:203:0x019a, B:205:0x01a0, B:207:0x01a6, B:208:0x01a9, B:209:0x01ac, B:211:0x01b2, B:213:0x01b8, B:214:0x01bb, B:215:0x01be, B:217:0x01db, B:218:0x01ed, B:193:0x0148), top: B:235:0x0021 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double m1903a(int r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p047c.p049b.C1147f.m1903a(int, java.lang.String):double");
    }
}
