package com.cyjh.mobileanjian.ipc.utils;

import com.cyjh.mobileanjian.ipc.share.proto.Ipc;
import java.util.HashMap;
import p285z2.C4392tf;

/* JADX INFO: renamed from: com.cyjh.mobileanjian.ipc.utils.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C2701m {
    private static final HashMap<String, Ipc.FundType> OooO00o = new HashMap<String, Ipc.FundType>() { // from class: com.cyjh.mobileanjian.ipc.utils.m.1
        {
            put("void", Ipc.FundType.VOID);
            put("boolean", Ipc.FundType.BOOLEAN);
            put("int", Ipc.FundType.INT);
            put("long", Ipc.FundType.LONG);
            put("float", Ipc.FundType.FLOAT);
            put("double", Ipc.FundType.DOUBLE);
            put("String", Ipc.FundType.STRING);
        }
    };

    public static Ipc.FundType OooO00o(String str) {
        return C4392tf.OooO00o(str) ? Ipc.FundType.VOID : OooO00o.get(str);
    }
}
