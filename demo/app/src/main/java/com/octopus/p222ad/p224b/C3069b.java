package com.octopus.p222ad.p224b;

import android.util.Log;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.utilities.JsonUtil;
import com.octopus.p222ad.internal.utilities.SPUtils;
import com.octopus.p222ad.p224b.C3072e;
import com.octopus.p222ad.utils.p258b.C3250a;
import com.octopus.p222ad.utils.p258b.C3254e;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.umeng.commonsdk.proguard.C3471v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.octopus.ad.b.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3069b {

    /* JADX INFO: renamed from: com.octopus.ad.b.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private C3072e.f f16751a;

        /* JADX INFO: renamed from: b */
        private String f16752b;

        /* JADX INFO: renamed from: c */
        private List<e> f16753c;

        /* JADX INFO: renamed from: a */
        public C3072e.f m13903a() {
            return this.f16751a;
        }

        /* JADX INFO: renamed from: a */
        public void m13904a(C3072e.f fVar) {
            this.f16751a = fVar;
        }

        /* JADX INFO: renamed from: a */
        public void m13905a(String str) {
            this.f16752b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m13906a(List<e> list) {
            this.f16753c = list;
        }

        /* JADX INFO: renamed from: b */
        public String m13907b() {
            return this.f16752b;
        }

        /* JADX INFO: renamed from: c */
        public List<e> m13908c() {
            return this.f16753c;
        }

        /* JADX INFO: renamed from: d */
        public int m13909d() {
            List<e> list = this.f16753c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private String f16754a;

        /* JADX INFO: renamed from: b */
        private String f16755b;

        /* JADX INFO: renamed from: c */
        private int f16756c;

        /* JADX INFO: renamed from: d */
        private String f16757d;

        /* JADX INFO: renamed from: e */
        private String f16758e;

        /* JADX INFO: renamed from: f */
        private String f16759f;

        /* JADX INFO: renamed from: g */
        private String f16760g;

        /* JADX INFO: renamed from: h */
        private String f16761h;

        /* JADX INFO: renamed from: i */
        private i f16762i;

        /* JADX INFO: renamed from: j */
        private String f16763j;

        /* JADX INFO: renamed from: k */
        private boolean f16764k;

        /* JADX INFO: renamed from: l */
        private int f16765l;

        /* JADX INFO: renamed from: m */
        private j f16766m;

        /* JADX INFO: renamed from: n */
        private a f16767n;

        /* JADX INFO: renamed from: o */
        private C4702b f16768o;

        /* JADX INFO: renamed from: p */
        private List<j> f16769p;

        /* JADX INFO: renamed from: com.octopus.ad.b.b$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private List<String> f16770a;

            /* JADX INFO: renamed from: b */
            private List<String> f16771b;

            /* JADX INFO: renamed from: c */
            private List<String> f16772c;

            /* JADX INFO: renamed from: d */
            private List<String> f16773d;

            /* JADX INFO: renamed from: e */
            private List<String> f16774e;

            /* JADX INFO: renamed from: f */
            private List<String> f16775f;

            /* JADX INFO: renamed from: g */
            private List<String> f16776g;

            /* JADX INFO: renamed from: h */
            private List<String> f16777h;

            /* JADX INFO: renamed from: i */
            private List<String> f16778i;

            /* JADX INFO: renamed from: j */
            private List<String> f16779j;

            /* JADX INFO: renamed from: k */
            private List<String> f16780k;

            /* JADX INFO: renamed from: l */
            private List<String> f16781l;

            /* JADX INFO: renamed from: m */
            private List<String> f16782m;

            /* JADX INFO: renamed from: n */
            private List<String> f16783n;

            /* JADX INFO: renamed from: o */
            private List<String> f16784o;

            /* JADX INFO: renamed from: a */
            public List<String> m13937a() {
                return this.f16770a;
            }

            /* JADX INFO: renamed from: a */
            public void m13938a(List<String> list) {
                this.f16770a = list;
            }

            /* JADX INFO: renamed from: b */
            public List<String> m13939b() {
                return this.f16771b;
            }

            /* JADX INFO: renamed from: b */
            public void m13940b(List<String> list) {
                this.f16771b = list;
            }

            /* JADX INFO: renamed from: c */
            public List<String> m13941c() {
                return this.f16772c;
            }

            /* JADX INFO: renamed from: c */
            public void m13942c(List<String> list) {
                this.f16772c = list;
            }

            /* JADX INFO: renamed from: d */
            public List<String> m13943d() {
                return this.f16773d;
            }

            /* JADX INFO: renamed from: d */
            public void m13944d(List<String> list) {
                this.f16773d = list;
            }

            /* JADX INFO: renamed from: e */
            public List<String> m13945e() {
                return this.f16774e;
            }

            /* JADX INFO: renamed from: e */
            public void m13946e(List<String> list) {
                this.f16774e = list;
            }

            /* JADX INFO: renamed from: f */
            public List<String> m13947f() {
                return this.f16781l;
            }

            /* JADX INFO: renamed from: f */
            public void m13948f(List<String> list) {
                this.f16775f = list;
            }

            /* JADX INFO: renamed from: g */
            public List<String> m13949g() {
                return this.f16782m;
            }

            /* JADX INFO: renamed from: g */
            public void m13950g(List<String> list) {
                this.f16776g = list;
            }

            /* JADX INFO: renamed from: h */
            public List<String> m13951h() {
                return this.f16783n;
            }

            /* JADX INFO: renamed from: h */
            public void m13952h(List<String> list) {
                this.f16777h = list;
            }

            /* JADX INFO: renamed from: i */
            public List<String> m13953i() {
                return this.f16784o;
            }

            /* JADX INFO: renamed from: i */
            public void m13954i(List<String> list) {
                this.f16778i = list;
            }

            /* JADX INFO: renamed from: j */
            public void m13955j(List<String> list) {
                this.f16779j = list;
            }

            /* JADX INFO: renamed from: k */
            public void m13956k(List<String> list) {
                this.f16780k = list;
            }

            /* JADX INFO: renamed from: l */
            public void m13957l(List<String> list) {
                this.f16781l = list;
            }

            /* JADX INFO: renamed from: m */
            public void m13958m(List<String> list) {
                this.f16782m = list;
            }

            /* JADX INFO: renamed from: n */
            public void m13959n(List<String> list) {
                this.f16783n = list;
            }

            /* JADX INFO: renamed from: o */
            public void m13960o(List<String> list) {
                this.f16784o = list;
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.b.b$b$b, reason: collision with other inner class name */
        public static class C4702b {

            /* JADX INFO: renamed from: a */
            private List<String> f16785a;

            /* JADX INFO: renamed from: b */
            private List<String> f16786b;

            /* JADX INFO: renamed from: c */
            private List<String> f16787c;

            /* JADX INFO: renamed from: d */
            private List<String> f16788d;

            /* JADX INFO: renamed from: e */
            private List<String> f16789e;

            /* JADX INFO: renamed from: f */
            private List<a> f16790f;

            /* JADX INFO: renamed from: com.octopus.ad.b.b$b$b$a */
            public static class a {

                /* JADX INFO: renamed from: a */
                private int f16791a;

                /* JADX INFO: renamed from: b */
                private List<String> f16792b;

                /* JADX INFO: renamed from: a */
                public void m13967a(int i) {
                    this.f16791a = i;
                }

                /* JADX INFO: renamed from: a */
                public void m13968a(List<String> list) {
                    this.f16792b = list;
                }
            }

            /* JADX INFO: renamed from: a */
            public void m13961a(List<String> list) {
                this.f16785a = list;
            }

            /* JADX INFO: renamed from: b */
            public void m13962b(List<String> list) {
                this.f16786b = list;
            }

            /* JADX INFO: renamed from: c */
            public void m13963c(List<String> list) {
                this.f16787c = list;
            }

            /* JADX INFO: renamed from: d */
            public void m13964d(List<String> list) {
                this.f16788d = list;
            }

            /* JADX INFO: renamed from: e */
            public void m13965e(List<String> list) {
                this.f16789e = list;
            }

            /* JADX INFO: renamed from: f */
            public void m13966f(List<a> list) {
                this.f16790f = list;
            }
        }

        /* JADX INFO: renamed from: a */
        public String m13910a() {
            return this.f16754a;
        }

        /* JADX INFO: renamed from: a */
        public void m13911a(int i) {
            this.f16756c = i;
        }

        /* JADX INFO: renamed from: a */
        public void m13912a(a aVar) {
            this.f16767n = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m13913a(C4702b c4702b) {
            this.f16768o = c4702b;
        }

        /* JADX INFO: renamed from: a */
        public void m13914a(i iVar) {
            this.f16762i = iVar;
        }

        /* JADX INFO: renamed from: a */
        public void m13915a(String str) {
            this.f16754a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m13916a(List<j> list) {
            this.f16769p = list;
        }

        /* JADX INFO: renamed from: a */
        public void m13917a(boolean z) {
            this.f16764k = z;
        }

        /* JADX INFO: renamed from: b */
        public String m13918b() {
            return this.f16755b;
        }

        /* JADX INFO: renamed from: b */
        public void m13919b(int i) {
            this.f16765l = i;
        }

        /* JADX INFO: renamed from: b */
        public void m13920b(String str) {
            this.f16755b = str;
        }

        /* JADX INFO: renamed from: c */
        public int m13921c() {
            return this.f16756c;
        }

        /* JADX INFO: renamed from: c */
        public void m13922c(String str) {
            this.f16757d = str;
        }

        /* JADX INFO: renamed from: d */
        public String m13923d() {
            return this.f16757d;
        }

        /* JADX INFO: renamed from: d */
        public void m13924d(String str) {
            this.f16758e = str;
        }

        /* JADX INFO: renamed from: e */
        public String m13925e() {
            return this.f16758e;
        }

        /* JADX INFO: renamed from: e */
        public void m13926e(String str) {
            this.f16759f = str;
        }

        /* JADX INFO: renamed from: f */
        public String m13927f() {
            return this.f16760g;
        }

        /* JADX INFO: renamed from: f */
        public void m13928f(String str) {
            this.f16760g = str;
        }

        /* JADX INFO: renamed from: g */
        public String m13929g() {
            return this.f16761h;
        }

        /* JADX INFO: renamed from: g */
        public void m13930g(String str) {
            this.f16761h = str;
        }

        /* JADX INFO: renamed from: h */
        public i m13931h() {
            return this.f16762i;
        }

        /* JADX INFO: renamed from: i */
        public String m13932i() {
            return this.f16763j;
        }

        /* JADX INFO: renamed from: j */
        public j m13933j() {
            return this.f16766m;
        }

        /* JADX INFO: renamed from: k */
        public a m13934k() {
            return this.f16767n;
        }

        /* JADX INFO: renamed from: l */
        public C4702b m13935l() {
            return this.f16768o;
        }

        /* JADX INFO: renamed from: m */
        public List<j> m13936m() {
            return this.f16769p;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private String f16793a;

        /* JADX INFO: renamed from: b */
        private String f16794b;

        /* JADX INFO: renamed from: c */
        private String f16795c;

        /* JADX INFO: renamed from: d */
        private String f16796d;

        /* JADX INFO: renamed from: a */
        public String m13969a() {
            return this.f16793a;
        }

        /* JADX INFO: renamed from: a */
        public void m13970a(String str) {
            this.f16793a = str;
        }

        /* JADX INFO: renamed from: b */
        public String m13971b() {
            return this.f16794b;
        }

        /* JADX INFO: renamed from: b */
        public void m13972b(String str) {
            this.f16794b = str;
        }

        /* JADX INFO: renamed from: c */
        public String m13973c() {
            return this.f16795c;
        }

        /* JADX INFO: renamed from: c */
        public void m13974c(String str) {
            this.f16795c = str;
        }

        /* JADX INFO: renamed from: d */
        public String m13975d() {
            return this.f16796d;
        }

        /* JADX INFO: renamed from: d */
        public void m13976d(String str) {
            this.f16796d = str;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        private String f16797a;

        /* JADX INFO: renamed from: b */
        private b f16798b;

        /* JADX INFO: renamed from: c */
        private c f16799c;

        /* JADX INFO: renamed from: d */
        private List<a> f16800d;

        /* JADX INFO: renamed from: e */
        private List<Object> f16801e;

        /* JADX INFO: renamed from: f */
        private int f16802f;

        /* JADX INFO: renamed from: g */
        private String f16803g;

        /* JADX INFO: renamed from: h */
        private String f16804h;

        /* JADX INFO: renamed from: a */
        public String m13977a() {
            return this.f16797a;
        }

        /* JADX INFO: renamed from: a */
        public void m13978a(int i) {
            this.f16802f = i;
        }

        /* JADX INFO: renamed from: a */
        public void m13979a(b bVar) {
            this.f16798b = bVar;
        }

        /* JADX INFO: renamed from: a */
        public void m13980a(c cVar) {
            this.f16799c = cVar;
        }

        /* JADX INFO: renamed from: a */
        public void m13981a(String str) {
            this.f16797a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m13982a(List<a> list) {
            this.f16800d = list;
        }

        /* JADX INFO: renamed from: b */
        public String m13983b() {
            return this.f16804h;
        }

        /* JADX INFO: renamed from: b */
        public void m13984b(String str) {
            this.f16804h = str;
        }

        /* JADX INFO: renamed from: c */
        public b m13985c() {
            return this.f16798b;
        }

        /* JADX INFO: renamed from: c */
        public void m13986c(String str) {
            this.f16803g = str;
        }

        /* JADX INFO: renamed from: d */
        public int m13987d() {
            List<a> list = this.f16800d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: renamed from: e */
        public c m13988e() {
            return this.f16799c;
        }

        /* JADX INFO: renamed from: f */
        public List<a> m13989f() {
            return this.f16800d;
        }

        /* JADX INFO: renamed from: g */
        public List<Object> m13990g() {
            return this.f16801e;
        }

        /* JADX INFO: renamed from: h */
        public int m13991h() {
            List<Object> list = this.f16801e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: renamed from: i */
        public int m13992i() {
            return this.f16802f;
        }

        /* JADX INFO: renamed from: j */
        public String m13993j() {
            return this.f16803g;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        private String f16805a;

        /* JADX INFO: renamed from: b */
        private String f16806b;

        /* JADX INFO: renamed from: a */
        public String m13994a() {
            return this.f16805a;
        }

        /* JADX INFO: renamed from: a */
        public void m13995a(String str) {
            this.f16805a = str;
        }

        /* JADX INFO: renamed from: b */
        public String m13996b() {
            return this.f16806b;
        }

        /* JADX INFO: renamed from: b */
        public void m13997b(String str) {
            this.f16806b = str;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        private String f16807a;

        /* JADX INFO: renamed from: b */
        private String f16808b;

        /* JADX INFO: renamed from: a */
        public String m13998a() {
            return this.f16807a;
        }

        /* JADX INFO: renamed from: a */
        public void m13999a(String str) {
            this.f16807a = str;
        }

        /* JADX INFO: renamed from: b */
        public String m14000b() {
            return this.f16808b;
        }

        /* JADX INFO: renamed from: b */
        public void m14001b(String str) {
            this.f16808b = str;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        private int f16809a;

        /* JADX INFO: renamed from: b */
        private int f16810b;

        /* JADX INFO: renamed from: c */
        private int f16811c;

        /* JADX INFO: renamed from: d */
        private int f16812d;

        /* JADX INFO: renamed from: a */
        public int m14002a() {
            return this.f16809a;
        }

        /* JADX INFO: renamed from: a */
        public void m14003a(int i) {
            this.f16809a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m14004b() {
            return this.f16810b;
        }

        /* JADX INFO: renamed from: b */
        public void m14005b(int i) {
            this.f16810b = i;
        }

        /* JADX INFO: renamed from: c */
        public int m14006c() {
            return this.f16811c;
        }

        /* JADX INFO: renamed from: c */
        public void m14007c(int i) {
            this.f16811c = i;
        }

        /* JADX INFO: renamed from: d */
        public int m14008d() {
            return this.f16812d;
        }

        /* JADX INFO: renamed from: d */
        public void m14009d(int i) {
            this.f16812d = i;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        private int f16813a;

        /* JADX INFO: renamed from: a */
        public int m14010a() {
            return this.f16813a;
        }

        /* JADX INFO: renamed from: a */
        public void m14011a(int i) {
            this.f16813a = i;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$i */
    public static class i {

        /* JADX INFO: renamed from: a */
        private String f16814a;

        /* JADX INFO: renamed from: b */
        private String f16815b;

        /* JADX INFO: renamed from: c */
        private String f16816c;

        /* JADX INFO: renamed from: d */
        private String f16817d;

        /* JADX INFO: renamed from: e */
        private String f16818e;

        /* JADX INFO: renamed from: f */
        private String f16819f;

        /* JADX INFO: renamed from: g */
        private String f16820g;

        /* JADX INFO: renamed from: a */
        public void m14012a(String str) {
            this.f16814a = str;
        }

        /* JADX INFO: renamed from: b */
        public void m14013b(String str) {
            this.f16815b = str;
        }

        /* JADX INFO: renamed from: c */
        public void m14014c(String str) {
            this.f16816c = str;
        }

        /* JADX INFO: renamed from: d */
        public void m14015d(String str) {
            this.f16817d = str;
        }

        /* JADX INFO: renamed from: e */
        public void m14016e(String str) {
            this.f16818e = str;
        }

        /* JADX INFO: renamed from: f */
        public void m14017f(String str) {
            this.f16819f = str;
        }

        /* JADX INFO: renamed from: g */
        public void m14018g(String str) {
            this.f16820g = str;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$j */
    public static class j {

        /* JADX INFO: renamed from: a */
        private String f16821a;

        /* JADX INFO: renamed from: b */
        private String f16822b;

        /* JADX INFO: renamed from: c */
        private String f16823c;

        /* JADX INFO: renamed from: d */
        private String f16824d;

        /* JADX INFO: renamed from: e */
        private String f16825e;

        /* JADX INFO: renamed from: f */
        private String f16826f;

        /* JADX INFO: renamed from: g */
        private String f16827g;

        /* JADX INFO: renamed from: h */
        private String f16828h;

        /* JADX INFO: renamed from: i */
        private String f16829i;

        /* JADX INFO: renamed from: j */
        private String f16830j;

        /* JADX INFO: renamed from: a */
        public String m14019a() {
            return this.f16821a;
        }

        /* JADX INFO: renamed from: a */
        public void m14020a(String str) {
            this.f16821a = str;
        }

        /* JADX INFO: renamed from: b */
        public String m14021b() {
            return this.f16822b;
        }

        /* JADX INFO: renamed from: b */
        public void m14022b(String str) {
            this.f16822b = str;
        }

        /* JADX INFO: renamed from: c */
        public String m14023c() {
            return this.f16823c;
        }

        /* JADX INFO: renamed from: c */
        public void m14024c(String str) {
            this.f16823c = str;
        }

        /* JADX INFO: renamed from: d */
        public String m14025d() {
            return this.f16824d;
        }

        /* JADX INFO: renamed from: d */
        public void m14026d(String str) {
            this.f16824d = str;
        }

        /* JADX INFO: renamed from: e */
        public String m14027e() {
            return this.f16825e;
        }

        /* JADX INFO: renamed from: e */
        public void m14028e(String str) {
            this.f16825e = str;
        }

        /* JADX INFO: renamed from: f */
        public String m14029f() {
            return this.f16826f;
        }

        /* JADX INFO: renamed from: f */
        public void m14030f(String str) {
            this.f16826f = str;
        }

        /* JADX INFO: renamed from: g */
        public String m14031g() {
            return this.f16827g;
        }

        /* JADX INFO: renamed from: g */
        public void m14032g(String str) {
            this.f16827g = str;
        }

        /* JADX INFO: renamed from: h */
        public String m14033h() {
            return this.f16828h;
        }

        /* JADX INFO: renamed from: h */
        public void m14034h(String str) {
            this.f16828h = str;
        }

        /* JADX INFO: renamed from: i */
        public String m14035i() {
            return this.f16830j;
        }

        /* JADX INFO: renamed from: i */
        public void m14036i(String str) {
            this.f16829i = str;
        }

        /* JADX INFO: renamed from: j */
        public void m14037j(String str) {
            this.f16830j = str;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$k */
    public static class k {

        /* JADX INFO: renamed from: a */
        private int f16831a;

        /* JADX INFO: renamed from: b */
        private int f16832b;

        /* JADX INFO: renamed from: c */
        private int f16833c;

        /* JADX INFO: renamed from: d */
        private boolean f16834d;

        /* JADX INFO: renamed from: e */
        private List<String> f16835e;

        /* JADX INFO: renamed from: a */
        public int m14038a() {
            return this.f16831a;
        }

        /* JADX INFO: renamed from: a */
        public void m14039a(int i) {
            this.f16831a = i;
        }

        /* JADX INFO: renamed from: a */
        public void m14040a(List<String> list) {
            this.f16835e = list;
        }

        /* JADX INFO: renamed from: a */
        public void m14041a(boolean z) {
            this.f16834d = z;
        }

        /* JADX INFO: renamed from: b */
        public int m14042b() {
            return this.f16832b;
        }

        /* JADX INFO: renamed from: b */
        public void m14043b(int i) {
            this.f16832b = i;
        }

        /* JADX INFO: renamed from: c */
        public int m14044c() {
            return this.f16833c;
        }

        /* JADX INFO: renamed from: c */
        public void m14045c(int i) {
            this.f16833c = i;
        }

        /* JADX INFO: renamed from: d */
        public boolean m14046d() {
            return this.f16834d;
        }

        /* JADX INFO: renamed from: e */
        public List<String> m14047e() {
            return this.f16835e;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$l */
    public static class l {

        /* JADX INFO: renamed from: a */
        private int f16836a;

        /* JADX INFO: renamed from: a */
        public int m14048a() {
            return this.f16836a;
        }

        /* JADX INFO: renamed from: a */
        public void m14049a(int i) {
            this.f16836a = i;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$m */
    public static class m {

        /* JADX INFO: renamed from: a */
        private l f16837a;

        /* JADX INFO: renamed from: b */
        private o f16838b;

        /* JADX INFO: renamed from: c */
        private r f16839c;

        /* JADX INFO: renamed from: d */
        private p f16840d;

        /* JADX INFO: renamed from: a */
        public l m14050a() {
            return this.f16837a;
        }

        /* JADX INFO: renamed from: a */
        public void m14051a(l lVar) {
            this.f16837a = lVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14052a(o oVar) {
            this.f16838b = oVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14053a(p pVar) {
            this.f16840d = pVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14054a(r rVar) {
            this.f16839c = rVar;
        }

        /* JADX INFO: renamed from: b */
        public o m14055b() {
            return this.f16838b;
        }

        /* JADX INFO: renamed from: c */
        public r m14056c() {
            return this.f16839c;
        }

        /* JADX INFO: renamed from: d */
        public p m14057d() {
            return this.f16840d;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$n */
    public static class n {

        /* JADX INFO: renamed from: a */
        private int f16841a;

        /* JADX INFO: renamed from: a */
        public int m14058a() {
            return this.f16841a;
        }

        /* JADX INFO: renamed from: a */
        public void m14059a(int i) {
            this.f16841a = i;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$o */
    public static class o {

        /* JADX INFO: renamed from: a */
        private int f16842a;

        /* JADX INFO: renamed from: a */
        public int m14060a() {
            return this.f16842a;
        }

        /* JADX INFO: renamed from: a */
        public void m14061a(int i) {
            this.f16842a = i;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$p */
    public static class p {

        /* JADX INFO: renamed from: a */
        private int f16843a;

        /* JADX INFO: renamed from: a */
        public int m14062a() {
            return this.f16843a;
        }

        /* JADX INFO: renamed from: a */
        public void m14063a(int i) {
            this.f16843a = i;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$q */
    public static class q {

        /* JADX INFO: renamed from: a */
        private int f16844a;

        /* JADX INFO: renamed from: b */
        private String f16845b;

        /* JADX INFO: renamed from: c */
        private String f16846c;

        /* JADX INFO: renamed from: d */
        private long f16847d;

        /* JADX INFO: renamed from: e */
        private List<s> f16848e;

        /* JADX INFO: renamed from: a */
        public static q m14064a(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            try {
                return m14069c(m14067b(inputStream));
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            } catch (JSONException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static q m14065a(byte[] bArr) throws JSONException {
            if (bArr == null) {
                return null;
            }
            try {
                return m14069c(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        private static ArrayList<String> m14066a(JSONArray jSONArray) throws JSONException {
            ArrayList<String> arrayList = new ArrayList<>();
            if (m14068b(jSONArray)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        private static String m14067b(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }

        /* JADX INFO: renamed from: b */
        private static boolean m14068b(JSONArray jSONArray) {
            return jSONArray != null && jSONArray.length() > 0;
        }

        /* JADX INFO: renamed from: c */
        private static q m14069c(String str) throws JSONException {
            String str2;
            q qVar;
            JSONArray jSONArray;
            ArrayList arrayList;
            String str3;
            q qVar2;
            int i;
            JSONArray jSONArray2;
            ArrayList arrayList2;
            String str4;
            q qVar3;
            JSONArray jSONArray3;
            int i2;
            ArrayList arrayList3;
            q qVar4;
            int i3;
            JSONArray jSONArray4;
            ArrayList arrayList4;
            q qVar5;
            JSONArray jSONArray5;
            int i4;
            String strM14968b = str;
            String str5 = "ServerResponse";
            C3255f.m14982b("ServerResponse", "encryptStr = " + strM14968b);
            Boolean bool = (Boolean) SPUtils.getFromGroupSdk(C3120m.m14425a().f17185h, "encrypt", Boolean.TRUE);
            if (bool == null || bool.booleanValue()) {
                strM14968b = C3250a.m14968b(C3254e.m14980a(), strM14968b);
                C3255f.m14984d("ServerResponse", "decryptStr = " + strM14968b);
            }
            JSONObject jSONObject = new JSONObject(strM14968b);
            q qVar6 = new q();
            try {
                qVar6.m14073a(jSONObject.optString("errcode"));
                qVar6.m14076b(jSONObject.optString("errmsg"));
                qVar6.m14071a(jSONObject.optInt("status"));
                qVar6.m14072a(jSONObject.optLong("ts"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("spaceInfo");
                ArrayList arrayList5 = new ArrayList();
                if (!m14068b(jSONArrayOptJSONArray)) {
                    return qVar6;
                }
                int i5 = 0;
                while (i5 < jSONArrayOptJSONArray.length()) {
                    s sVar = new s();
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
                    if (jSONObjectOptJSONObject != null) {
                        sVar.m14091a(jSONObjectOptJSONObject.optString("spaceID"));
                        sVar.m14096b(jSONObjectOptJSONObject.optString("spaceParam"));
                        sVar.m14089a(C3072e.a.m14222a(jSONObjectOptJSONObject.optInt("adpType")));
                        sVar.m14085a(jSONObjectOptJSONObject.optInt("refreshInterval"));
                        sVar.m14095b(jSONObjectOptJSONObject.optInt("filter"));
                        sVar.m14090a(C3072e.h.m14226a(jSONObjectOptJSONObject.optInt("screenDirection")));
                        sVar.m14100c(jSONObjectOptJSONObject.optString("width"));
                        sVar.m14104d(jSONObjectOptJSONObject.optString("height"));
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("adpPosition");
                        f fVar = new f();
                        fVar.m13999a(jSONObjectOptJSONObject2.optString("x"));
                        fVar.m14001b(jSONObjectOptJSONObject2.optString("y"));
                        sVar.m14086a(fVar);
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("interEvent");
                        if (jSONObjectOptJSONObject3 != null) {
                            m mVar = new m();
                            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("shakeEvent");
                            if (jSONObjectOptJSONObject4 != null) {
                                r rVar = new r();
                                rVar.m14082a(jSONObjectOptJSONObject4.getInt("v"));
                                rVar.m14081a(jSONObjectOptJSONObject4.getDouble("sr"));
                                mVar.m14054a(rVar);
                            }
                            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject3.optJSONObject("scrollEvent");
                            if (jSONObjectOptJSONObject5 != null) {
                                p pVar = new p();
                                pVar.m14063a(jSONObjectOptJSONObject5.getInt("v"));
                                mVar.m14053a(pVar);
                            }
                            JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject3.optJSONObject("fullScreenClk");
                            if (jSONObjectOptJSONObject6 != null) {
                                l lVar = new l();
                                lVar.m14049a(jSONObjectOptJSONObject6.getInt("v"));
                                mVar.m14051a(lVar);
                            }
                            JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject3.optJSONObject("regionScreenClk");
                            if (jSONObjectOptJSONObject7 != null) {
                                o oVar = new o();
                                oVar.m14061a(jSONObjectOptJSONObject7.getInt("v"));
                                mVar.m14052a(oVar);
                            }
                            sVar.m14087a(mVar);
                        }
                        JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject.optJSONObject("strategy");
                        if (jSONObjectOptJSONObject8 != null) {
                            t tVar = new t();
                            JSONObject jSONObjectOptJSONObject9 = jSONObjectOptJSONObject8.optJSONObject("pass");
                            if (jSONObjectOptJSONObject9 != null) {
                                n nVar = new n();
                                nVar.m14059a(jSONObjectOptJSONObject9.getInt("v"));
                                tVar.m14137a(nVar);
                            }
                            JSONObject jSONObjectOptJSONObject10 = jSONObjectOptJSONObject8.optJSONObject("auto");
                            if (jSONObjectOptJSONObject10 != null) {
                                g gVar = new g();
                                gVar.m14007c(jSONObjectOptJSONObject10.getInt("v"));
                                gVar.m14003a(jSONObjectOptJSONObject10.getInt("f"));
                                gVar.m14005b(jSONObjectOptJSONObject10.getInt(C3471v.f18958al));
                                gVar.m14009d(jSONObjectOptJSONObject10.getInt("cr"));
                                tVar.m14134a(gVar);
                            }
                            JSONObject jSONObjectOptJSONObject11 = jSONObjectOptJSONObject8.optJSONObject("callback");
                            if (jSONObjectOptJSONObject11 != null) {
                                h hVar = new h();
                                hVar.m14011a(jSONObjectOptJSONObject11.getInt("v"));
                                tVar.m14135a(hVar);
                            }
                            JSONObject jSONObjectOptJSONObject12 = jSONObjectOptJSONObject8.optJSONObject("dpUp");
                            if (jSONObjectOptJSONObject12 != null) {
                                k kVar = new k();
                                kVar.m14045c(jSONObjectOptJSONObject12.getInt("v"));
                                kVar.m14039a(jSONObjectOptJSONObject12.getInt("f"));
                                kVar.m14043b(jSONObjectOptJSONObject12.getInt(C3471v.f18958al));
                                kVar.m14041a(jSONObjectOptJSONObject12.getBoolean("o"));
                                kVar.m14040a(JsonUtil.getStringArrayList(jSONObjectOptJSONObject12.getJSONArray("t")));
                                tVar.m14136a(kVar);
                            }
                            sVar.m14088a(tVar);
                        }
                        sVar.m14093a(jSONObjectOptJSONObject.optBoolean("autoClose"));
                        sVar.m14099c(jSONObjectOptJSONObject.optInt("maxTime"));
                        sVar.m14097b(jSONObjectOptJSONObject.optBoolean("manualClosable"));
                        sVar.m14103d(jSONObjectOptJSONObject.optInt("minTime"));
                        sVar.m14101c(jSONObjectOptJSONObject.optBoolean("wifiPreload"));
                        sVar.m14105d(jSONObjectOptJSONObject.optBoolean("mute"));
                        sVar.m14109e(jSONObjectOptJSONObject.optBoolean("fullScreen"));
                        sVar.m14112f(jSONObjectOptJSONObject.optBoolean("backgroundDim"));
                        sVar.m14115g(jSONObjectOptJSONObject.optBoolean(NativeAdvancedJsUtils.f6624k));
                        sVar.m14107e(jSONObjectOptJSONObject.optInt("orgID"));
                        sVar.m14111f(jSONObjectOptJSONObject.optInt("contentType"));
                        sVar.m14108e(jSONObjectOptJSONObject.optString("appID"));
                        sVar.m14114g(jSONObjectOptJSONObject.optInt("acratio"));
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("adResponse");
                        ArrayList arrayList6 = new ArrayList();
                        if (m14068b(jSONArrayOptJSONArray2)) {
                            int i6 = 0;
                            while (i6 < jSONArrayOptJSONArray2.length()) {
                                JSONObject jSONObjectOptJSONObject13 = jSONArrayOptJSONArray2.optJSONObject(i6);
                                if (jSONObjectOptJSONObject13 != null) {
                                    d dVar = new d();
                                    dVar.m13981a(jSONObjectOptJSONObject13.optString("extInfo"));
                                    dVar.m13984b(jSONObjectOptJSONObject13.optString("adid"));
                                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject13.optJSONArray("contentInfo");
                                    ArrayList arrayList7 = new ArrayList();
                                    if (m14068b(jSONArrayOptJSONArray3)) {
                                        int i7 = 0;
                                        while (i7 < jSONArrayOptJSONArray3.length()) {
                                            JSONObject jSONObjectOptJSONObject14 = jSONArrayOptJSONArray3.optJSONObject(i7);
                                            JSONArray jSONArray6 = jSONArrayOptJSONArray;
                                            a aVar = new a();
                                            JSONArray jSONArray7 = jSONArrayOptJSONArray2;
                                            aVar.m13905a(jSONObjectOptJSONObject14.optString("template"));
                                            aVar.m13904a(C3072e.f.m14225a(jSONObjectOptJSONObject14.optInt("renderType")));
                                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject14.optJSONArray("adcontentSlot");
                                            if (m14068b(jSONArrayOptJSONArray4)) {
                                                ArrayList arrayList8 = new ArrayList();
                                                str2 = str5;
                                                jSONArray4 = jSONArrayOptJSONArray3;
                                                int i8 = 0;
                                                while (i8 < jSONArrayOptJSONArray4.length()) {
                                                    try {
                                                        JSONObject jSONObjectOptJSONObject15 = jSONArrayOptJSONArray4.optJSONObject(i8);
                                                        if (jSONObjectOptJSONObject15 != null) {
                                                            jSONArray5 = jSONArrayOptJSONArray4;
                                                            e eVar = new e();
                                                            qVar5 = qVar6;
                                                            try {
                                                                eVar.m13995a(jSONObjectOptJSONObject15.optString("md5"));
                                                                String strOptString = jSONObjectOptJSONObject15.optString("content");
                                                                i4 = i5;
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append(strOptString);
                                                                arrayList4 = arrayList5;
                                                                sb.append("");
                                                                Log.e("content_url", sb.toString());
                                                                eVar.m13997b(strOptString);
                                                                arrayList8.add(eVar);
                                                            } catch (JSONException e) {
                                                                e = e;
                                                                qVar = qVar5;
                                                            }
                                                        } else {
                                                            arrayList4 = arrayList5;
                                                            qVar5 = qVar6;
                                                            jSONArray5 = jSONArrayOptJSONArray4;
                                                            i4 = i5;
                                                        }
                                                        i8++;
                                                        jSONArrayOptJSONArray4 = jSONArray5;
                                                        qVar6 = qVar5;
                                                        i5 = i4;
                                                        arrayList5 = arrayList4;
                                                    } catch (JSONException e2) {
                                                        e = e2;
                                                        qVar = qVar6;
                                                    }
                                                }
                                                arrayList3 = arrayList5;
                                                qVar4 = qVar6;
                                                i3 = i5;
                                                aVar.m13906a(arrayList8);
                                            } else {
                                                arrayList3 = arrayList5;
                                                str2 = str5;
                                                qVar4 = qVar6;
                                                i3 = i5;
                                                jSONArray4 = jSONArrayOptJSONArray3;
                                            }
                                            arrayList7.add(aVar);
                                            i7++;
                                            jSONArrayOptJSONArray = jSONArray6;
                                            jSONArrayOptJSONArray2 = jSONArray7;
                                            jSONArrayOptJSONArray3 = jSONArray4;
                                            str5 = str2;
                                            qVar6 = qVar4;
                                            i5 = i3;
                                            arrayList5 = arrayList3;
                                        }
                                        jSONArray2 = jSONArrayOptJSONArray;
                                        arrayList2 = arrayList5;
                                        str4 = str5;
                                        qVar3 = qVar6;
                                        jSONArray3 = jSONArrayOptJSONArray2;
                                        i2 = i5;
                                        dVar.m13982a(arrayList7);
                                    } else {
                                        jSONArray2 = jSONArrayOptJSONArray;
                                        arrayList2 = arrayList5;
                                        str4 = str5;
                                        qVar3 = qVar6;
                                        jSONArray3 = jSONArrayOptJSONArray2;
                                        i2 = i5;
                                    }
                                    JSONObject jSONObjectOptJSONObject16 = jSONObjectOptJSONObject13.optJSONObject("adLogo");
                                    if (jSONObjectOptJSONObject16 != null) {
                                        c cVar = new c();
                                        cVar.m13972b(jSONObjectOptJSONObject16.optString("adLabel"));
                                        cVar.m13970a(jSONObjectOptJSONObject16.optString("adLabelUrl"));
                                        cVar.m13976d(jSONObjectOptJSONObject16.optString("sourceLabel"));
                                        cVar.m13974c(jSONObjectOptJSONObject16.optString("sourceUrl"));
                                        dVar.m13980a(cVar);
                                    }
                                    dVar.m13978a(jSONObjectOptJSONObject13.optInt("price"));
                                    dVar.m13986c(jSONObjectOptJSONObject13.optString("tagid"));
                                    b bVar = new b();
                                    JSONObject jSONObjectOptJSONObject17 = jSONObjectOptJSONObject13.optJSONObject("interactInfo");
                                    if (jSONObjectOptJSONObject17 != null) {
                                        JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject17.optJSONArray("thirdpartInfo");
                                        if (m14068b(jSONArrayOptJSONArray5)) {
                                            ArrayList arrayList9 = new ArrayList();
                                            for (int i9 = 0; i9 < jSONArrayOptJSONArray5.length(); i9++) {
                                                JSONObject jSONObjectOptJSONObject18 = jSONArrayOptJSONArray5.optJSONObject(i9);
                                                if (jSONObjectOptJSONObject18 != null) {
                                                    j jVar = new j();
                                                    jVar.m14022b(jSONObjectOptJSONObject18.optString("clickUrl"));
                                                    jVar.m14020a(jSONObjectOptJSONObject18.optString("viewUrl"));
                                                    jVar.m14024c(jSONObjectOptJSONObject18.optString("dpSucessUrl"));
                                                    jVar.m14026d(jSONObjectOptJSONObject18.optString("nurl"));
                                                    jVar.m14028e(jSONObjectOptJSONObject18.optString("lurl"));
                                                    jVar.m14030f(jSONObjectOptJSONObject18.optString("convertUrl"));
                                                    jVar.m14037j(jSONObjectOptJSONObject18.optString("onFinish"));
                                                    jVar.m14034h(jSONObjectOptJSONObject18.optString("onPause"));
                                                    jVar.m14036i(jSONObjectOptJSONObject18.optString("onRecover"));
                                                    jVar.m14032g(jSONObjectOptJSONObject18.optString("onStart"));
                                                    arrayList9.add(jVar);
                                                }
                                            }
                                            bVar.m13916a(arrayList9);
                                        }
                                        bVar.m13922c(jSONObjectOptJSONObject17.optString("apkName"));
                                        bVar.m13928f(jSONObjectOptJSONObject17.optString("appDesc"));
                                        bVar.m13930g(jSONObjectOptJSONObject17.optString("appDownloadURL"));
                                        bVar.m13926e(jSONObjectOptJSONObject17.optString("appStoreID"));
                                        bVar.m13915a(jSONObjectOptJSONObject17.optString("landingPageUrl"));
                                        bVar.m13920b(jSONObjectOptJSONObject17.optString("deeplinkUrl"));
                                        bVar.m13911a(jSONObjectOptJSONObject17.optInt("interactType"));
                                        bVar.m13924d(jSONObjectOptJSONObject17.optString("packageName"));
                                        bVar.m13917a(jSONObjectOptJSONObject17.optBoolean("useBuiltInBrow"));
                                        bVar.m13919b(jSONObjectOptJSONObject17.optInt("openExternal"));
                                        JSONObject jSONObjectOptJSONObject19 = jSONObjectOptJSONObject17.optJSONObject("followTrackExt");
                                        JSONObject jSONObjectOptJSONObject20 = jSONObjectOptJSONObject17.optJSONObject("complianceInfo");
                                        if (jSONObjectOptJSONObject20 != null) {
                                            i iVar = new i();
                                            iVar.m14012a(jSONObjectOptJSONObject20.optString("appName"));
                                            iVar.m14013b(jSONObjectOptJSONObject20.optString("appVersion"));
                                            iVar.m14014c(jSONObjectOptJSONObject20.optString("developerName"));
                                            iVar.m14015d(jSONObjectOptJSONObject20.optString("privacyUrl"));
                                            iVar.m14016e(jSONObjectOptJSONObject20.optString("permissionsUrl"));
                                            iVar.m14017f(jSONObjectOptJSONObject20.optString("functionDescUrl"));
                                            iVar.m14018g(jSONObjectOptJSONObject20.optString("appIconURL"));
                                            bVar.m13914a(iVar);
                                        }
                                        b.a aVar2 = new b.a();
                                        if (jSONObjectOptJSONObject19 != null) {
                                            aVar2.m13938a(m14066a(jSONObjectOptJSONObject19.optJSONArray("open")));
                                            aVar2.m13940b(m14066a(jSONObjectOptJSONObject19.optJSONArray("beginDownload")));
                                            aVar2.m13942c(m14066a(jSONObjectOptJSONObject19.optJSONArray(C3902g6.OoooOO0)));
                                            aVar2.m13944d(m14066a(jSONObjectOptJSONObject19.optJSONArray("beginInstall")));
                                            aVar2.m13946e(m14066a(jSONObjectOptJSONObject19.optJSONArray("install")));
                                            aVar2.m13948f(m14066a(jSONObjectOptJSONObject19.optJSONArray("active")));
                                            aVar2.m13950g(m14066a(jSONObjectOptJSONObject19.optJSONArray(C1781c.f10318cf)));
                                            aVar2.m13952h(m14066a(jSONObjectOptJSONObject19.optJSONArray("showSlide")));
                                            aVar2.m13955j(m14066a(jSONObjectOptJSONObject19.optJSONArray("pageClose")));
                                            aVar2.m13954i(m14066a(jSONObjectOptJSONObject19.optJSONArray("pageLoad")));
                                            aVar2.m13956k(m14066a(jSONObjectOptJSONObject19.optJSONArray("pageAction")));
                                            aVar2.m13957l(m14066a(jSONObjectOptJSONObject19.optJSONArray("deepLinkSuccess")));
                                            aVar2.m13958m(m14066a(jSONObjectOptJSONObject19.optJSONArray("deepLinkFail")));
                                            aVar2.m13959n(m14066a(jSONObjectOptJSONObject19.optJSONArray("dpAppInstalled")));
                                            aVar2.m13960o(m14066a(jSONObjectOptJSONObject19.optJSONArray("dpAppNotInstalled")));
                                            bVar.m13912a(aVar2);
                                        }
                                        JSONObject jSONObjectOptJSONObject21 = jSONObjectOptJSONObject17.optJSONObject("videoTrackExt");
                                        b.C4702b c4702b = new b.C4702b();
                                        if (jSONObjectOptJSONObject21 != null) {
                                            c4702b.m13961a(m14066a(jSONObjectOptJSONObject21.optJSONArray(C1781c.f10279bT)));
                                            c4702b.m13962b(m14066a(jSONObjectOptJSONObject21.optJSONArray(C1781c.f10314cb)));
                                            c4702b.m13963c(m14066a(jSONObjectOptJSONObject21.optJSONArray("continue")));
                                            c4702b.m13964d(m14066a(jSONObjectOptJSONObject21.optJSONArray("exit")));
                                            c4702b.m13965e(m14066a(jSONObjectOptJSONObject21.optJSONArray(C1781c.f10283bX)));
                                            JSONArray jSONArrayOptJSONArray6 = jSONObjectOptJSONObject21.optJSONArray("showTrack");
                                            ArrayList arrayList10 = new ArrayList();
                                            if (m14068b(jSONArrayOptJSONArray6)) {
                                                for (int i10 = 0; i10 < jSONArrayOptJSONArray6.length(); i10++) {
                                                    JSONObject jSONObjectOptJSONObject22 = jSONArrayOptJSONArray6.optJSONObject(i10);
                                                    if (jSONObjectOptJSONObject22 != null) {
                                                        b.C4702b.a aVar3 = new b.C4702b.a();
                                                        aVar3.m13967a(jSONObjectOptJSONObject22.optInt("t"));
                                                        aVar3.m13968a(m14066a(jSONObjectOptJSONObject22.optJSONArray(C1781c.f10246am)));
                                                        arrayList10.add(aVar3);
                                                    }
                                                }
                                                c4702b.m13966f(arrayList10);
                                            }
                                            bVar.m13913a(c4702b);
                                        }
                                        dVar.m13979a(bVar);
                                    }
                                    arrayList6.add(dVar);
                                } else {
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    arrayList2 = arrayList5;
                                    str4 = str5;
                                    qVar3 = qVar6;
                                    jSONArray3 = jSONArrayOptJSONArray2;
                                    i2 = i5;
                                }
                                i6++;
                                jSONArrayOptJSONArray = jSONArray2;
                                jSONArrayOptJSONArray2 = jSONArray3;
                                str5 = str4;
                                qVar6 = qVar3;
                                i5 = i2;
                                arrayList5 = arrayList2;
                            }
                            jSONArray = jSONArrayOptJSONArray;
                            str3 = str5;
                            qVar2 = qVar6;
                            i = i5;
                            sVar.m14092a(arrayList6);
                            arrayList = arrayList5;
                        } else {
                            jSONArray = jSONArrayOptJSONArray;
                            str3 = str5;
                            qVar2 = qVar6;
                            i = i5;
                            arrayList = arrayList5;
                        }
                        arrayList.add(sVar);
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                        arrayList = arrayList5;
                        str3 = str5;
                        qVar2 = qVar6;
                        i = i5;
                    }
                    i5 = i + 1;
                    arrayList5 = arrayList;
                    jSONArrayOptJSONArray = jSONArray;
                    str5 = str3;
                    qVar6 = qVar2;
                }
                ArrayList arrayList11 = arrayList5;
                str2 = str5;
                qVar = qVar6;
                try {
                    qVar.m14074a(arrayList11);
                    return qVar;
                } catch (JSONException e3) {
                    e = e3;
                }
            } catch (JSONException e4) {
                e = e4;
                str2 = str5;
            }
            qVar = qVar6;
            C3255f.m14983c(str2, "JSONException e = " + e.getMessage());
            return qVar;
        }

        /* JADX INFO: renamed from: a */
        public int m14070a() {
            List<s> list = this.f16848e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: renamed from: a */
        public void m14071a(int i) {
            this.f16844a = i;
        }

        /* JADX INFO: renamed from: a */
        public void m14072a(long j) {
            this.f16847d = j;
        }

        /* JADX INFO: renamed from: a */
        public void m14073a(String str) {
            this.f16845b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m14074a(List<s> list) {
            this.f16848e = list;
        }

        /* JADX INFO: renamed from: b */
        public int m14075b() {
            return this.f16844a;
        }

        /* JADX INFO: renamed from: b */
        public void m14076b(String str) {
            this.f16846c = str;
        }

        /* JADX INFO: renamed from: c */
        public String m14077c() {
            return this.f16845b;
        }

        /* JADX INFO: renamed from: d */
        public String m14078d() {
            return this.f16846c;
        }

        /* JADX INFO: renamed from: e */
        public List<s> m14079e() {
            return this.f16848e;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$r */
    public static class r {

        /* JADX INFO: renamed from: a */
        private int f16849a;

        /* JADX INFO: renamed from: b */
        private double f16850b = 1.5d;

        /* JADX INFO: renamed from: a */
        public int m14080a() {
            return this.f16849a;
        }

        /* JADX INFO: renamed from: a */
        public void m14081a(double d) {
            this.f16850b = d;
        }

        /* JADX INFO: renamed from: a */
        public void m14082a(int i) {
            this.f16849a = i;
        }

        /* JADX INFO: renamed from: b */
        public double m14083b() {
            return this.f16850b;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$s */
    public static class s {

        /* JADX INFO: renamed from: a */
        private String f16851a;

        /* JADX INFO: renamed from: b */
        private String f16852b;

        /* JADX INFO: renamed from: c */
        private C3072e.a f16853c;

        /* JADX INFO: renamed from: d */
        private int f16854d;

        /* JADX INFO: renamed from: e */
        private C3072e.h f16855e;

        /* JADX INFO: renamed from: f */
        private int f16856f;

        /* JADX INFO: renamed from: g */
        private String f16857g;

        /* JADX INFO: renamed from: h */
        private String f16858h;

        /* JADX INFO: renamed from: i */
        private f f16859i;

        /* JADX INFO: renamed from: j */
        private m f16860j;

        /* JADX INFO: renamed from: k */
        private t f16861k;

        /* JADX INFO: renamed from: l */
        private boolean f16862l;

        /* JADX INFO: renamed from: m */
        private int f16863m;

        /* JADX INFO: renamed from: n */
        private boolean f16864n;

        /* JADX INFO: renamed from: o */
        private int f16865o;

        /* JADX INFO: renamed from: p */
        private boolean f16866p;

        /* JADX INFO: renamed from: q */
        private boolean f16867q;

        /* JADX INFO: renamed from: r */
        private boolean f16868r;

        /* JADX INFO: renamed from: s */
        private boolean f16869s;

        /* JADX INFO: renamed from: t */
        private boolean f16870t;

        /* JADX INFO: renamed from: u */
        private boolean f16871u;

        /* JADX INFO: renamed from: v */
        private int f16872v;

        /* JADX INFO: renamed from: w */
        private int f16873w;

        /* JADX INFO: renamed from: x */
        private String f16874x;

        /* JADX INFO: renamed from: y */
        private int f16875y;

        /* JADX INFO: renamed from: z */
        private List<d> f16876z;

        /* JADX INFO: renamed from: a */
        public String m14084a() {
            return this.f16851a;
        }

        /* JADX INFO: renamed from: a */
        public void m14085a(int i) {
            this.f16854d = i;
        }

        /* JADX INFO: renamed from: a */
        public void m14086a(f fVar) {
            this.f16859i = fVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14087a(m mVar) {
            this.f16860j = mVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14088a(t tVar) {
            this.f16861k = tVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14089a(C3072e.a aVar) {
            this.f16853c = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14090a(C3072e.h hVar) {
            this.f16855e = hVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14091a(String str) {
            this.f16851a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m14092a(List<d> list) {
            this.f16876z = list;
        }

        /* JADX INFO: renamed from: a */
        public void m14093a(boolean z) {
            this.f16862l = z;
        }

        /* JADX INFO: renamed from: b */
        public String m14094b() {
            return this.f16852b;
        }

        /* JADX INFO: renamed from: b */
        public void m14095b(int i) {
            this.f16856f = i;
        }

        /* JADX INFO: renamed from: b */
        public void m14096b(String str) {
            this.f16852b = str;
        }

        /* JADX INFO: renamed from: b */
        public void m14097b(boolean z) {
            this.f16864n = z;
        }

        /* JADX INFO: renamed from: c */
        public C3072e.a m14098c() {
            return this.f16853c;
        }

        /* JADX INFO: renamed from: c */
        public void m14099c(int i) {
            this.f16863m = i;
        }

        /* JADX INFO: renamed from: c */
        public void m14100c(String str) {
            this.f16857g = str;
        }

        /* JADX INFO: renamed from: c */
        public void m14101c(boolean z) {
            this.f16866p = z;
        }

        /* JADX INFO: renamed from: d */
        public int m14102d() {
            return this.f16854d;
        }

        /* JADX INFO: renamed from: d */
        public void m14103d(int i) {
            this.f16865o = i;
        }

        /* JADX INFO: renamed from: d */
        public void m14104d(String str) {
            this.f16858h = str;
        }

        /* JADX INFO: renamed from: d */
        public void m14105d(boolean z) {
            this.f16867q = z;
        }

        /* JADX INFO: renamed from: e */
        public C3072e.h m14106e() {
            return this.f16855e;
        }

        /* JADX INFO: renamed from: e */
        public void m14107e(int i) {
            this.f16872v = i;
        }

        /* JADX INFO: renamed from: e */
        public void m14108e(String str) {
            this.f16874x = str;
        }

        /* JADX INFO: renamed from: e */
        public void m14109e(boolean z) {
            this.f16868r = z;
        }

        /* JADX INFO: renamed from: f */
        public int m14110f() {
            return this.f16856f;
        }

        /* JADX INFO: renamed from: f */
        public void m14111f(int i) {
            this.f16873w = i;
        }

        /* JADX INFO: renamed from: f */
        public void m14112f(boolean z) {
            this.f16869s = z;
        }

        /* JADX INFO: renamed from: g */
        public String m14113g() {
            return this.f16857g;
        }

        /* JADX INFO: renamed from: g */
        public void m14114g(int i) {
            this.f16875y = i;
        }

        /* JADX INFO: renamed from: g */
        public void m14115g(boolean z) {
            this.f16870t = z;
        }

        /* JADX INFO: renamed from: h */
        public String m14116h() {
            return this.f16858h;
        }

        /* JADX INFO: renamed from: i */
        public f m14117i() {
            return this.f16859i;
        }

        /* JADX INFO: renamed from: j */
        public m m14118j() {
            return this.f16860j;
        }

        /* JADX INFO: renamed from: k */
        public t m14119k() {
            return this.f16861k;
        }

        /* JADX INFO: renamed from: l */
        public boolean m14120l() {
            return this.f16862l;
        }

        /* JADX INFO: renamed from: m */
        public int m14121m() {
            return this.f16863m;
        }

        /* JADX INFO: renamed from: n */
        public boolean m14122n() {
            return this.f16864n;
        }

        /* JADX INFO: renamed from: o */
        public int m14123o() {
            return this.f16865o;
        }

        /* JADX INFO: renamed from: p */
        public boolean m14124p() {
            return this.f16866p;
        }

        /* JADX INFO: renamed from: q */
        public boolean m14125q() {
            return this.f16867q;
        }

        /* JADX INFO: renamed from: r */
        public boolean m14126r() {
            return this.f16868r;
        }

        /* JADX INFO: renamed from: s */
        public boolean m14127s() {
            return this.f16869s;
        }

        /* JADX INFO: renamed from: t */
        public boolean m14128t() {
            return this.f16870t;
        }

        /* JADX INFO: renamed from: u */
        public boolean m14129u() {
            return this.f16871u;
        }

        /* JADX INFO: renamed from: v */
        public int m14130v() {
            return this.f16875y;
        }

        /* JADX INFO: renamed from: w */
        public List<d> m14131w() {
            return this.f16876z;
        }

        /* JADX INFO: renamed from: x */
        public int m14132x() {
            List<d> list = this.f16876z;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.b$t */
    public static class t {

        /* JADX INFO: renamed from: a */
        private n f16877a;

        /* JADX INFO: renamed from: b */
        private g f16878b;

        /* JADX INFO: renamed from: c */
        private h f16879c;

        /* JADX INFO: renamed from: d */
        private k f16880d;

        /* JADX INFO: renamed from: a */
        public n m14133a() {
            return this.f16877a;
        }

        /* JADX INFO: renamed from: a */
        public void m14134a(g gVar) {
            this.f16878b = gVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14135a(h hVar) {
            this.f16879c = hVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14136a(k kVar) {
            this.f16880d = kVar;
        }

        /* JADX INFO: renamed from: a */
        public void m14137a(n nVar) {
            this.f16877a = nVar;
        }

        /* JADX INFO: renamed from: b */
        public g m14138b() {
            return this.f16878b;
        }

        /* JADX INFO: renamed from: c */
        public h m14139c() {
            return this.f16879c;
        }

        /* JADX INFO: renamed from: d */
        public k m14140d() {
            return this.f16880d;
        }
    }
}
