package com.goldcoast.sdk.domain;

import android.os.ConditionVariable;
import android.text.TextUtils;
import com.goldcoast.sdk.p206c.C2735a;
import com.goldcoast.sdk.p206c.C2741g;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.InterfaceC2554h;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.goldcoast.sdk.domain.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C2751h implements InterfaceC2554h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16064a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f16065b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ConditionVariable f16066c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f16067d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ EntryPoint f16068e;

    public C2751h(EntryPoint entryPoint, int i, String str, ConditionVariable conditionVariable, int i2) {
        this.f16068e = entryPoint;
        this.f16064a = i;
        this.f16065b = str;
        this.f16066c = conditionVariable;
        this.f16067d = i2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00aa -> B:33:0x0048). Please report as a decompilation issue!!! */
    @Override // com.p188b.p189a.InterfaceC2554h
    /* JADX INFO: renamed from: a */
    public final void mo12928a(C2542as c2542as) {
        String strM12910d = c2542as.m12889e().m12910d();
        HashMap map = new HashMap();
        C2741g.m13175a();
        C2741g.m13178b("######\n" + String.format("<feedBackP.Enc>:%s\n", strM12910d));
        if (!TextUtils.isEmpty(strM12910d) || this.f16064a != 1) {
            String strM13152b = null;
            try {
                strM13152b = C2735a.m13152b(new JSONObject(strM12910d).optString("body", ""));
            } catch (JSONException e) {
                map.put("message", this.f16068e.getStackString(e));
            }
            if (!TextUtils.isEmpty(strM13152b) || c2542as.m12886b() == 200 || this.f16064a != 1) {
                try {
                    if (new JSONObject(strM13152b).optString("code", "").equals("200")) {
                        if (this.f16064a == 2) {
                            EntryPoint.m13191a(this.f16067d);
                        }
                    } else if (this.f16064a == 1) {
                        EntryPoint.m13196a(this.f16065b);
                        map.put("message", "code not equals 200");
                    }
                } catch (Exception e2) {
                    map.put("stack", this.f16068e.getStackString(e2));
                }
            }
            this.f16066c.open();
        }
        map.put("message", "response is null");
        EntryPoint.m13196a(this.f16065b);
        this.f16066c.open();
    }

    @Override // com.p188b.p189a.InterfaceC2554h
    /* JADX INFO: renamed from: a */
    public final void mo12929a(IOException iOException) {
        new HashMap();
        if (this.f16064a == 1) {
            EntryPoint.m13196a(this.f16065b);
        }
        EntryPoint entryPoint = this.f16068e;
        entryPoint.m13207b(entryPoint.getStackString(iOException), 3);
        this.f16066c.open();
    }
}
