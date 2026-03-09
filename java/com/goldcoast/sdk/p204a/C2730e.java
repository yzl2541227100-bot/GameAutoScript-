package com.goldcoast.sdk.p204a;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.goldcoast.sdk.a.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2730e extends AbstractC2728c<C2730e> {

    /* JADX INFO: renamed from: a */
    private String f15951a;

    /* JADX INFO: renamed from: b */
    private String f15952b;

    /* JADX INFO: renamed from: c */
    private String f15953c;

    /* JADX INFO: renamed from: d */
    private String f15954d;

    /* JADX INFO: renamed from: e */
    private String f15955e;

    /* JADX INFO: renamed from: f */
    private String f15956f;

    /* JADX INFO: renamed from: g */
    private String f15957g;

    /* JADX INFO: renamed from: h */
    private String f15958h;

    /* JADX INFO: renamed from: i */
    private String f15959i;

    /* JADX INFO: renamed from: j */
    private String f15960j;

    /* JADX INFO: renamed from: k */
    private String f15961k;

    /* JADX INFO: renamed from: l */
    private String f15962l;

    /* JADX INFO: renamed from: m */
    private String f15963m;

    /* JADX INFO: renamed from: n */
    private String f15964n;

    /* JADX INFO: renamed from: o */
    private String f15965o;

    /* JADX INFO: renamed from: p */
    private String f15966p;

    /* JADX INFO: renamed from: q */
    private String f15967q;

    /* JADX INFO: renamed from: r */
    private String f15968r;

    /* JADX INFO: renamed from: s */
    private String f15969s;

    /* JADX INFO: renamed from: t */
    private String f15970t;

    /* JADX INFO: renamed from: u */
    private String f15971u;

    /* JADX INFO: renamed from: v */
    private String f15972v;

    /* JADX INFO: renamed from: w */
    private String f15973w;

    /* JADX INFO: renamed from: x */
    private String f15974x;

    /* JADX INFO: renamed from: y */
    private String f15975y;

    public C2730e() {
    }

    public C2730e(Map<String, String> map) {
        Iterator<String> it = map.keySet().iterator();
        if (it == null || !it.hasNext()) {
            return;
        }
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("ro.product.brand")) {
                this.f15951a = map.get(next);
            } else if (next.equals("ro.product.name")) {
                this.f15952b = map.get(next);
            } else if (next.equals("ro.product.model")) {
                this.f15953c = map.get(next);
            } else if (next.equals("ro.build.fingerprint")) {
                this.f15954d = map.get(next);
            } else if (next.equals("ro.build.version.sdk")) {
                this.f15955e = map.get(next);
            } else if (next.equals("ro.build.version.release")) {
                this.f15956f = map.get(next);
            } else if (next.equals("ro.build.date")) {
                this.f15957g = map.get(next);
            } else if (next.equals("ro.build.date.utc")) {
                this.f15958h = map.get(next);
            } else if (next.equals("ro.boot.cpuid")) {
                this.f15959i = map.get(next);
            } else if (next.equals("ro.btconfig.vendor")) {
                this.f15960j = map.get(next);
            } else if (next.equals("persist.sys.timezone")) {
                this.f15961k = map.get(next);
            } else if (next.equals("persist.sys.country")) {
                this.f15962l = map.get(next);
            } else if (next.equals("persist.sys.language")) {
                this.f15963m = map.get(next);
            } else if (next.equals("persist.sys.dalvik.vm.lib")) {
                this.f15964n = map.get(next);
            } else if (next.equals("ro.build.description")) {
                this.f15965o = map.get(next);
            } else if (next.equals("ro.runtime.firstboot")) {
                this.f15966p = map.get(next);
            } else if (next.equals("ro.serialno")) {
                this.f15967q = map.get(next);
            } else if (next.equals("ro.hardware")) {
                this.f15968r = map.get(next);
            } else if (next.equals("ro.product.board")) {
                this.f15969s = map.get(next);
            } else if (next.equals("ro.product.locale.language")) {
                this.f15970t = map.get(next);
            } else if (next.equals("ro.product.locale.region")) {
                this.f15971u = map.get(next);
            } else if (next.equals("ro.product.cpu.abi")) {
                this.f15972v = map.get(next);
            } else if (next.equals("ro.board.platform")) {
                this.f15973w = map.get(next);
            } else if (next.equals("ro.build.selinux")) {
                this.f15974x = map.get(next);
            } else if (next.equals("ro.build.selinux.enforce")) {
                this.f15975y = map.get(next);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m13127a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ro.product.brand", this.f15951a);
            jSONObject.put("ro.product.name", this.f15952b);
            jSONObject.put("ro.product.model", this.f15953c);
            jSONObject.put("ro.build.fingerprint", this.f15954d);
            jSONObject.put("ro.build.version.sdk", this.f15955e);
            jSONObject.put("ro.build.version.release", this.f15956f);
            jSONObject.put("ro.build.date", this.f15957g);
            jSONObject.put("ro.build.date.utc", this.f15958h);
            jSONObject.put("ro.boot.cpuid", this.f15959i);
            jSONObject.put("ro.btconfig.vendor", this.f15960j);
            jSONObject.put("persist.sys.timezone", this.f15961k);
            jSONObject.put("persist.sys.country", this.f15962l);
            jSONObject.put("persist.sys.language", this.f15963m);
            jSONObject.put("persist.sys.dalvik.vm.lib", this.f15964n);
            jSONObject.put("ro.build.description", this.f15965o);
            jSONObject.put("ro.runtime.firstboot", this.f15966p);
            jSONObject.put("ro.serialno", this.f15967q);
            jSONObject.put("ro.hardware", this.f15968r);
            jSONObject.put("ro.product.board", this.f15969s);
            jSONObject.put("ro.product.locale.language", this.f15970t);
            jSONObject.put("ro.product.locale.region", this.f15971u);
            jSONObject.put("ro.product.cpu.abi", this.f15972v);
            jSONObject.put("ro.board.platform", this.f15973w);
            jSONObject.put("ro.build.selinux", this.f15974x);
            jSONObject.put("ro.build.selinux.enforce", this.f15975y);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public final String m13128b() {
        return this.f15958h;
    }
}
