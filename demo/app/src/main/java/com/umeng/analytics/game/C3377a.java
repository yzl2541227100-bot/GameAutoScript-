package com.umeng.analytics.game;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3397s;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.Serializable;

/* JADX INFO: renamed from: com.umeng.analytics.game.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3377a {

    /* JADX INFO: renamed from: a */
    public String f18307a;

    /* JADX INFO: renamed from: b */
    public String f18308b;

    /* JADX INFO: renamed from: c */
    private Context f18309c;

    /* JADX INFO: renamed from: d */
    private final String f18310d = "um_g_cache";

    /* JADX INFO: renamed from: e */
    private final String f18311e = "single_level";

    /* JADX INFO: renamed from: f */
    private final String f18312f = "stat_player_level";

    /* JADX INFO: renamed from: g */
    private final String f18313g = "stat_game_level";

    /* JADX INFO: renamed from: h */
    private a f18314h = null;

    /* JADX INFO: renamed from: com.umeng.analytics.game.a$a */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: a */
        private static final long f18315a = 20140327;

        /* JADX INFO: renamed from: b */
        private String f18316b;

        /* JADX INFO: renamed from: c */
        private long f18317c;

        /* JADX INFO: renamed from: d */
        private long f18318d;

        public a(String str) {
            this.f18316b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m15444a() {
            this.f18318d = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: a */
        public boolean m15445a(String str) {
            return this.f18316b.equals(str);
        }

        /* JADX INFO: renamed from: b */
        public void m15446b() {
            this.f18317c += System.currentTimeMillis() - this.f18318d;
            this.f18318d = 0L;
        }

        /* JADX INFO: renamed from: c */
        public void m15447c() {
            m15444a();
        }

        /* JADX INFO: renamed from: d */
        public void m15448d() {
            m15446b();
        }

        /* JADX INFO: renamed from: e */
        public long m15449e() {
            return this.f18317c;
        }

        /* JADX INFO: renamed from: f */
        public String m15450f() {
            return this.f18316b;
        }
    }

    public C3377a(Context context) {
        this.f18309c = context;
    }

    /* JADX INFO: renamed from: a */
    public a m15440a(String str) {
        a aVar = new a(str);
        this.f18314h = aVar;
        aVar.m15444a();
        return this.f18314h;
    }

    /* JADX INFO: renamed from: a */
    public void m15441a() {
        try {
            a aVar = this.f18314h;
            if (aVar != null) {
                aVar.m15446b();
                SharedPreferences.Editor editorEdit = this.f18309c.getSharedPreferences("um_g_cache", 0).edit();
                editorEdit.putString("single_level", C3397s.m15621a(this.f18314h));
                editorEdit.putString("stat_player_level", this.f18308b);
                editorEdit.putString("stat_game_level", this.f18307a);
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public a m15442b(String str) {
        a aVar = this.f18314h;
        if (aVar == null) {
            return null;
        }
        aVar.m15448d();
        if (!this.f18314h.m15445a(str)) {
            return null;
        }
        a aVar2 = this.f18314h;
        this.f18314h = null;
        return aVar2;
    }

    /* JADX INFO: renamed from: b */
    public void m15443b() {
        SharedPreferences sharedPreferences;
        try {
            SharedPreferences preferenceWrapper = PreferenceWrapper.getInstance(this.f18309c, "um_g_cache");
            String string = preferenceWrapper.getString("single_level", null);
            if (!TextUtils.isEmpty(string)) {
                a aVar = (a) C3397s.m15620a(string);
                this.f18314h = aVar;
                if (aVar != null) {
                    aVar.m15447c();
                }
            }
            if (TextUtils.isEmpty(this.f18308b)) {
                String string2 = preferenceWrapper.getString("stat_player_level", null);
                this.f18308b = string2;
                if (string2 == null && (sharedPreferences = PreferenceWrapper.getDefault(this.f18309c)) != null) {
                    this.f18308b = sharedPreferences.getString("userlevel", null);
                }
            }
            if (this.f18307a == null) {
                this.f18307a = preferenceWrapper.getString("stat_game_level", null);
            }
        } catch (Throwable unused) {
        }
    }
}
