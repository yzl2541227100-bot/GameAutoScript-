package com.tramini.plugin.p261a.p269h;

import android.text.TextUtils;
import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p265d.C3335c;
import com.tramini.plugin.p261a.p267f.C3341a;
import com.tramini.plugin.p261a.p267f.C3342b;
import com.tramini.plugin.p261a.p267f.C3343c;
import com.tramini.plugin.p261a.p267f.C3344d;
import com.tramini.plugin.p261a.p267f.C3345e;
import com.tramini.plugin.p261a.p267f.C3347g;
import com.tramini.plugin.p261a.p267f.C3348h;
import com.tramini.plugin.p261a.p267f.C3349i;
import com.tramini.plugin.p261a.p269h.p271b.C3354a;
import com.tramini.plugin.p272b.C3366b;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3351a {

    /* JADX INFO: renamed from: a */
    public static final String f18195a = "a";

    /* JADX INFO: renamed from: com.tramini.plugin.a.h.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo15135a(C3333a c3333a);
    }

    /* JADX INFO: renamed from: a */
    public static void m15282a(final C3366b c3366b, final String str, final String str2, final String str3, final a aVar) {
        if (c3366b == null) {
            aVar.mo15135a(null);
        } else {
            C3354a.m15289a().m15291a(new Runnable() { // from class: com.tramini.plugin.a.h.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    ConcurrentHashMap<String, C3335c> concurrentHashMapM15358f;
                    C3333a c3333aM15202a = null;
                    try {
                        concurrentHashMapM15358f = c3366b.m15358f();
                    } catch (Throwable unused) {
                    }
                    if (concurrentHashMapM15358f == null) {
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.mo15135a(null);
                            return;
                        }
                        return;
                    }
                    C3335c c3335c = concurrentHashMapM15358f.get(TextUtils.equals(str, "33") ? "2" : str);
                    String str4 = c3335c != null ? c3335c.f18112d : "";
                    if (TextUtils.isEmpty(str4)) {
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.mo15135a(null);
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str4);
                    String str5 = str;
                    byte b = -1;
                    int iHashCode = str5.hashCode();
                    if (iHashCode != 50) {
                        if (iHashCode != 56) {
                            if (iHashCode != 1572) {
                                if (iHashCode != 1632) {
                                    if (iHashCode != 1691) {
                                        if (iHashCode != 53) {
                                            if (iHashCode != 54) {
                                                if (iHashCode != 1606) {
                                                    if (iHashCode == 1607 && str5.equals("29")) {
                                                        b = 7;
                                                    }
                                                } else if (str5.equals("28")) {
                                                    b = 6;
                                                }
                                            } else if (str5.equals("6")) {
                                                b = 3;
                                            }
                                        } else if (str5.equals("5")) {
                                            b = 2;
                                        }
                                    } else if (str5.equals("50")) {
                                        b = 8;
                                    }
                                } else if (str5.equals("33")) {
                                    b = 1;
                                }
                            } else if (str5.equals("15")) {
                                b = 5;
                            }
                        } else if (str5.equals("8")) {
                            b = 4;
                        }
                    } else if (str5.equals("2")) {
                        b = 0;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            c3333aM15202a = C3341a.m15202a(jSONObject, c3335c, str2, str3);
                            break;
                        case 2:
                            c3333aM15202a = C3342b.m15211a(jSONObject, c3335c, str2, str3);
                            break;
                        case 3:
                            c3333aM15202a = C3345e.m15227a(jSONObject, c3335c, str2, str3);
                            break;
                        case 4:
                            c3333aM15202a = C3343c.m15220a(jSONObject, c3335c, str2);
                            break;
                        case 5:
                            c3333aM15202a = C3349i.m15273a(jSONObject, c3335c, str2);
                            break;
                        case 6:
                            c3333aM15202a = C3344d.m15223a(jSONObject, c3335c, str2);
                            break;
                        case 7:
                            c3333aM15202a = C3348h.m15268a(jSONObject, c3335c, str2);
                            break;
                        case 8:
                            c3333aM15202a = C3347g.m15263a(jSONObject, c3335c, str2);
                            break;
                    }
                    a aVar4 = aVar;
                    if (aVar4 != null) {
                        aVar4.mo15135a(c3333aM15202a);
                    }
                }
            });
        }
    }
}
