package com.octopus.p222ad.p224b;

import com.octopus.p222ad.p224b.C3071d;
import com.octopus.p222ad.p224b.C3072e;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.octopus.ad.b.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3068a {

    /* JADX INFO: renamed from: com.octopus.ad.b.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f16713a;

        /* JADX INFO: renamed from: b */
        private String f16714b;

        /* JADX INFO: renamed from: c */
        private String f16715c;

        /* JADX INFO: renamed from: d */
        private long f16716d;

        /* JADX INFO: renamed from: e */
        private String f16717e;

        /* JADX INFO: renamed from: com.octopus.ad.b.a$a$a, reason: collision with other inner class name */
        public static final class C4701a {

            /* JADX INFO: renamed from: a */
            private String f16718a;

            /* JADX INFO: renamed from: b */
            private String f16719b;

            /* JADX INFO: renamed from: c */
            private String f16720c;

            /* JADX INFO: renamed from: d */
            private long f16721d;

            /* JADX INFO: renamed from: e */
            private String f16722e;

            /* JADX INFO: renamed from: a */
            public C4701a m13869a(String str) {
                this.f16718a = str;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m13870a() {
                a aVar = new a();
                aVar.f16716d = this.f16721d;
                aVar.f16715c = this.f16720c;
                aVar.f16717e = this.f16722e;
                aVar.f16714b = this.f16719b;
                aVar.f16713a = this.f16718a;
                return aVar;
            }

            /* JADX INFO: renamed from: b */
            public C4701a m13871b(String str) {
                this.f16719b = str;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public C4701a m13872c(String str) {
                this.f16720c = str;
                return this;
            }
        }

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public JSONObject m13868a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("spaceID", this.f16713a);
                jSONObject.put("spaceParam", this.f16714b);
                jSONObject.put("requestUUID", this.f16715c);
                jSONObject.put("channelReserveTs", this.f16716d);
                jSONObject.put("sdkExtInfo", this.f16717e);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private String f16723a;

        /* JADX INFO: renamed from: b */
        private C3072e.i f16724b;

        /* JADX INFO: renamed from: c */
        private C3072e.g f16725c;

        /* JADX INFO: renamed from: d */
        private long f16726d;

        /* JADX INFO: renamed from: e */
        private String f16727e;

        /* JADX INFO: renamed from: f */
        private String f16728f;

        /* JADX INFO: renamed from: g */
        private String f16729g;

        /* JADX INFO: renamed from: h */
        private String f16730h;

        /* JADX INFO: renamed from: i */
        private String f16731i;

        /* JADX INFO: renamed from: j */
        private long f16732j;

        /* JADX INFO: renamed from: k */
        private long f16733k;

        /* JADX INFO: renamed from: l */
        private C3071d.a f16734l;

        /* JADX INFO: renamed from: m */
        private C3071d.c f16735m;

        /* JADX INFO: renamed from: n */
        private ArrayList<a> f16736n;

        /* JADX INFO: renamed from: com.octopus.ad.b.a$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private String f16737a;

            /* JADX INFO: renamed from: b */
            private C3072e.i f16738b;

            /* JADX INFO: renamed from: c */
            private C3072e.g f16739c;

            /* JADX INFO: renamed from: d */
            private long f16740d;

            /* JADX INFO: renamed from: e */
            private String f16741e;

            /* JADX INFO: renamed from: f */
            private String f16742f;

            /* JADX INFO: renamed from: g */
            private String f16743g;

            /* JADX INFO: renamed from: h */
            private String f16744h;

            /* JADX INFO: renamed from: i */
            private String f16745i;

            /* JADX INFO: renamed from: j */
            private long f16746j;

            /* JADX INFO: renamed from: k */
            private long f16747k;

            /* JADX INFO: renamed from: l */
            private C3071d.a f16748l;

            /* JADX INFO: renamed from: m */
            private C3071d.c f16749m;

            /* JADX INFO: renamed from: n */
            private ArrayList<a> f16750n = new ArrayList<>();

            /* JADX INFO: renamed from: a */
            public a m13888a(long j) {
                this.f16740d = j;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m13889a(C3071d.a aVar) {
                this.f16748l = aVar;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m13890a(C3071d.c cVar) {
                this.f16749m = cVar;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m13891a(C3072e.g gVar) {
                this.f16739c = gVar;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m13892a(C3072e.i iVar) {
                this.f16738b = iVar;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m13893a(String str) {
                this.f16737a = str;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public b m13894a() {
                b bVar = new b();
                bVar.f16727e = this.f16741e;
                bVar.f16728f = this.f16742f;
                bVar.f16734l = this.f16748l;
                bVar.f16725c = this.f16739c;
                bVar.f16732j = this.f16746j;
                bVar.f16724b = this.f16738b;
                bVar.f16726d = this.f16740d;
                bVar.f16730h = this.f16744h;
                bVar.f16731i = this.f16745i;
                bVar.f16733k = this.f16747k;
                bVar.f16735m = this.f16749m;
                bVar.f16736n = this.f16750n;
                bVar.f16729g = this.f16743g;
                bVar.f16723a = this.f16737a;
                return bVar;
            }

            /* JADX INFO: renamed from: a */
            public void m13895a(a aVar) {
                this.f16750n.add(aVar);
            }

            /* JADX INFO: renamed from: b */
            public a m13896b(long j) {
                this.f16746j = j;
                return this;
            }

            /* JADX INFO: renamed from: b */
            public a m13897b(String str) {
                this.f16741e = str;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m13898c(long j) {
                this.f16747k = j;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m13899c(String str) {
                this.f16742f = str;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m13900d(String str) {
                this.f16743g = str;
                return this;
            }

            /* JADX INFO: renamed from: e */
            public a m13901e(String str) {
                this.f16744h = str;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public a m13902f(String str) {
                this.f16745i = str;
                return this;
            }
        }

        private b() {
        }

        /* JADX INFO: renamed from: a */
        private String m13878a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", this.f16723a);
                jSONObject.put("srcType", this.f16724b);
                jSONObject.put("reqType", this.f16725c);
                jSONObject.put("timeStamp", this.f16726d);
                jSONObject.put("appid", this.f16727e);
                jSONObject.put("reqid", this.f16728f);
                jSONObject.put("appVersion", this.f16729g);
                jSONObject.put("appName", this.f16730h);
                jSONObject.put("packageName", this.f16731i);
                jSONObject.put("appInstallTime", this.f16732j);
                jSONObject.put("appUpdateTime", this.f16733k);
                C3071d.a aVar = this.f16734l;
                if (aVar != null) {
                    jSONObject.put("devInfo", aVar.m14184a());
                }
                C3071d.c cVar = this.f16735m;
                if (cVar != null) {
                    jSONObject.put("envInfo", cVar.m14217a());
                }
                ArrayList<a> arrayList = this.f16736n;
                if (arrayList != null && arrayList.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < this.f16736n.size(); i++) {
                        jSONArray.put(this.f16736n.get(i).m13868a());
                    }
                    jSONObject.put("adReqInfo", jSONArray);
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        public String toString() {
            return m13878a();
        }
    }
}
