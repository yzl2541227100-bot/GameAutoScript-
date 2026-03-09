package com.anythink.expressad.video.dynview.p170j;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1882p;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.ordercamp.p171a.C2100a;
import com.anythink.expressad.video.dynview.p158a.C2069a;
import com.anythink.expressad.video.dynview.p159b.C2072a;
import com.anythink.expressad.video.dynview.p160c.EnumC2076b;
import com.anythink.expressad.video.dynview.p162e.InterfaceC2078a;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2081c;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2082d;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2083e;
import com.anythink.expressad.video.dynview.p164g.C2087a;
import com.anythink.expressad.video.dynview.p165h.C2089b;
import com.anythink.expressad.video.dynview.p166i.C2092b;
import com.anythink.expressad.video.dynview.p166i.p167a.C2091a;
import com.anythink.expressad.video.dynview.p166i.p169c.C2096b;
import com.anythink.expressad.video.dynview.p166i.p169c.InterfaceC2095a;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2097a {

    /* JADX INFO: renamed from: a */
    public static final String f13267a = "DataEnergizeWrapper";

    /* JADX INFO: renamed from: k */
    private static boolean f13268k;

    /* JADX INFO: renamed from: c */
    private C2096b f13270c;

    /* JADX INFO: renamed from: d */
    private Map<String, Bitmap> f13271d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f13272e;

    /* JADX INFO: renamed from: f */
    private String f13273f = "#FFFFFFFF";

    /* JADX INFO: renamed from: g */
    private String f13274g = "#60000000";

    /* JADX INFO: renamed from: h */
    private String f13275h = "#FF5F5F5F";

    /* JADX INFO: renamed from: i */
    private String f13276i = "#90ECECEC";

    /* JADX INFO: renamed from: j */
    private volatile long f13277j = 0;

    /* JADX INFO: renamed from: l */
    private InterfaceC2095a f13278l = null;

    /* JADX INFO: renamed from: m */
    private boolean f13279m = false;

    /* JADX INFO: renamed from: n */
    private int f13280n = 0;

    /* JADX INFO: renamed from: b */
    public InterfaceC2078a f13269b = new InterfaceC2078a() { // from class: com.anythink.expressad.video.dynview.j.a.1
        @Override // com.anythink.expressad.video.dynview.p162e.InterfaceC2078a
        /* JADX INFO: renamed from: a */
        public final void mo11126a() {
            if (!C2097a.this.f13279m || C2097a.this.f13270c == null) {
                return;
            }
            C2097a.this.f13270c.m11205a(C2097a.this.f13280n * 1000, C2097a.this.f13278l);
            C2097a.this.f13279m = false;
        }

        @Override // com.anythink.expressad.video.dynview.p162e.InterfaceC2078a
        /* JADX INFO: renamed from: b */
        public final void mo11127b() {
        }

        @Override // com.anythink.expressad.video.dynview.p162e.InterfaceC2078a
        /* JADX INFO: renamed from: c */
        public final void mo11128c() {
            if (C2097a.this.f13270c != null) {
                C2097a.this.f13270c.m11207c();
                C2097a.this.f13279m = true;
            }
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.j.a$5, reason: invalid class name */
    public class AnonymousClass5 extends AbstractViewOnClickListenerC2343a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map f13296a;

        public AnonymousClass5(Map map) {
            this.f13296a = map;
        }

        @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
        /* JADX INFO: renamed from: a */
        public final void mo11015a(View view) {
            if (C2097a.this.f13272e) {
                return;
            }
            C2097a.m11234f(C2097a.this);
            C2097a.m11216a(C2097a.this, this.f13296a);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.j.a$6, reason: invalid class name */
    public class AnonymousClass6 implements InterfaceC2095a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f13298a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f13299b;

        public AnonymousClass6(TextView textView, Map map) {
            this.f13298a = textView;
            this.f13299b = map;
        }

        @Override // com.anythink.expressad.video.dynview.p166i.p169c.InterfaceC2095a
        /* JADX INFO: renamed from: a */
        public final void mo11199a() {
            C2097a.m11216a(C2097a.this, this.f13299b);
        }

        @Override // com.anythink.expressad.video.dynview.p166i.p169c.InterfaceC2095a
        /* JADX INFO: renamed from: a */
        public final void mo11200a(long j) {
            String string;
            StringBuilder sb;
            String str;
            C2097a.this.f13280n = (int) (j / 1000);
            long j2 = C2097a.this.f13280n;
            Context context = this.f13298a.getContext();
            String strM4066f = C1341e.m4066f(context);
            if (strM4066f.startsWith(C2069a.f13139Q) || strM4066f.startsWith(C2069a.f13140R)) {
                string = j2 + C4196o4.OooO00o.OooO0Oo + context.getString(C1875i.m9684a(context, "anythink_cm_video_auto_play_after", C1875i.f11532g));
            } else {
                if (strM4066f.startsWith(C2069a.f13141S)) {
                    sb = new StringBuilder(C2069a.f13129G);
                    sb.append(j2);
                    str = " Sekunden";
                } else if (strM4066f.startsWith(C2069a.f13142T)) {
                    sb = new StringBuilder();
                    sb.append(j2);
                    str = C2069a.f13130H;
                } else if (strM4066f.startsWith(C2069a.f13143U)) {
                    sb = new StringBuilder(C2069a.f13131I);
                    sb.append(j2);
                    str = " secondes";
                } else if (strM4066f.startsWith(C2069a.f13144V)) {
                    sb = new StringBuilder(" ثوان");
                    sb.append(j2);
                    str = C2069a.f13132J;
                } else if (strM4066f.startsWith(C2069a.f13145W)) {
                    sb = new StringBuilder(C2069a.f13133K);
                    sb.append(j2);
                    str = " секунд";
                } else {
                    sb = new StringBuilder(C2069a.f13128F);
                    sb.append(j2);
                    str = " s";
                }
                sb.append(str);
                string = sb.toString();
            }
            this.f13298a.setText(string);
            C2097a.this.f13277j++;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m11210a(String str) {
        return C1875i.m9684a(C1175n.m2059a().m2148f(), str, "id");
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m11212a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor(this.f13276i));
            return bitmapCreateBitmap;
        } catch (Exception e) {
            if (!C1404a.f6209a) {
                return bitmapCreateBitmap;
            }
            e.printStackTrace();
            return bitmapCreateBitmap;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11213a(final ImageView imageView, String str, final int i) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        C1818b.m9427a(imageView.getContext()).m9443a(str, new InterfaceC1819c() { // from class: com.anythink.expressad.video.dynview.j.a.10
            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5462a(Bitmap bitmap, String str2) {
                if (bitmap == null || bitmap.isRecycled()) {
                    int iM9684a = C1875i.m9684a(imageView.getContext(), "anythink_icon_play_bg", C1875i.f11528c);
                    imageView.setBackgroundColor(Color.parseColor(C2097a.this.f13275h));
                    imageView.setImageResource(iM9684a);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    return;
                }
                int i2 = i;
                if (i2 != 501 && i2 != 802) {
                    imageView.setImageBitmap(bitmap);
                    return;
                }
                ImageView imageView2 = imageView;
                C2092b.m11188a();
                imageView2.setImageBitmap(C2092b.m11187a(bitmap, 0));
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5463a(String str2, String str3) {
                try {
                    int iM9684a = C1875i.m9684a(imageView.getContext(), "anythink_icon_play_bg", C1875i.f11528c);
                    imageView.setBackgroundColor(Color.parseColor(C2097a.this.f13275h));
                    imageView.setImageResource(iM9684a);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m11214a(C2074c c2074c, View view) {
        Map<String, Bitmap> map = this.f13271d;
        if (map == null || map.size() <= 1) {
            return;
        }
        new C2089b();
        Map<String, Bitmap> map2 = this.f13271d;
        if (view != null) {
            C2091a.m11182a().m11184a(map2, c2074c, view);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11215a(C2097a c2097a, C2074c c2074c, View view) {
        Map<String, Bitmap> map = c2097a.f13271d;
        if (map == null || map.size() <= 1) {
            return;
        }
        new C2089b();
        Map<String, Bitmap> map2 = c2097a.f13271d;
        if (view != null) {
            C2091a.m11182a().m11184a(map2, c2074c, view);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11216a(C2097a c2097a, Map map) {
        if (map != null) {
            try {
                if (map.containsKey(C2069a.f13126D) && (map.get(C2069a.f13126D) instanceof InterfaceC2082d)) {
                    ((InterfaceC2082d) map.get(C2069a.f13126D)).mo10459a();
                    c2097a.m11227b();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11217a(C2097a c2097a, Map map, List list, int i) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey(C2069a.f13126D) && (map.get(C2069a.f13126D) instanceof InterfaceC2082d)) {
            InterfaceC2082d interfaceC2082d = (InterfaceC2082d) map.get(C2069a.f13126D);
            if (interfaceC2082d != null) {
                interfaceC2082d.mo10460a((C1781c) list.get(i));
            }
            c2097a.m11227b();
            return;
        }
        if (map.containsKey(C2069a.f13127E) && (map.get(C2069a.f13127E) instanceof InterfaceC2081c)) {
            InterfaceC2081c interfaceC2081c = (InterfaceC2081c) map.get(C2069a.f13127E);
            if (interfaceC2081c != null) {
                interfaceC2081c.mo11132a((C1781c) list.get(i), i);
            }
            c2097a.m11227b();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11218a(String str, Context context, View view, int i, Map map) {
        FrameLayout.LayoutParams layoutParams;
        String strM9870a = C1890x.m9870a(str, "cltp");
        long j = !TextUtils.isEmpty(strM9870a) ? Long.parseLong(strM9870a) : 0L;
        if (j != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f13268k = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            f13268k = false;
            TextView textView = (TextView) view.findViewById(m11210a("anythink_choice_one_countdown_tv"));
            textView.setTextSize(11.0f);
            textView.setTextColor(Color.parseColor(this.f13273f));
            String str2 = this.f13274g;
            if (textView != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(Color.parseColor(str2));
                gradientDrawable.setCornerRadius(C1886t.m9834b(textView.getContext(), 12.0f));
                gradientDrawable.setStroke(C1886t.m9834b(textView.getContext(), 1.0f), Color.parseColor(str2));
                textView.setBackgroundDrawable(gradientDrawable);
            }
            if (i == 2 && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                int iM9843d = C1886t.m9843d(context);
                int iM9834b = C1886t.m9834b(context, 10.0f);
                layoutParams.setMargins(iM9834b, iM9834b, iM9843d, iM9834b);
            }
            if (textView != null) {
                textView.setVisibility(0);
                textView.setOnClickListener(new AnonymousClass5(map));
                this.f13278l = new AnonymousClass6(textView, map);
                C2096b c2096bM11204a = new C2096b().m11203a(j * 1000).m11202a().m11204a(this.f13278l);
                this.f13270c = c2096bM11204a;
                c2096bM11204a.m11206b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11219a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        m11213a(imageView, str, -1);
    }

    /* JADX INFO: renamed from: a */
    private void m11220a(final String str, final ImageView imageView, final C2074c c2074c, final View view) {
        C1818b.m9427a(imageView.getContext()).m9443a(str, new InterfaceC1819c() { // from class: com.anythink.expressad.video.dynview.j.a.2
            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5462a(Bitmap bitmap, String str2) {
                ImageView imageView2;
                if (bitmap == null || bitmap.isRecycled() || (imageView2 = imageView) == null) {
                    return;
                }
                imageView2.setImageBitmap(bitmap);
                if (C2097a.this.f13271d != null) {
                    C2097a.this.f13271d.put(C1882p.m9771a(str), bitmap);
                    C2097a.m11215a(C2097a.this, c2074c, view);
                }
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5463a(String str2, String str3) {
            }
        });
        if (m11212a() != null) {
            m11228b(c2074c, view);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11221a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey(C2069a.f13126D) && (map.get(C2069a.f13126D) instanceof InterfaceC2082d)) {
                    ((InterfaceC2082d) map.get(C2069a.f13126D)).mo10459a();
                    m11227b();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11222a(Map map, List<C1781c> list, int i) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey(C2069a.f13126D) && (map.get(C2069a.f13126D) instanceof InterfaceC2082d)) {
            InterfaceC2082d interfaceC2082d = (InterfaceC2082d) map.get(C2069a.f13126D);
            if (interfaceC2082d != null) {
                interfaceC2082d.mo10460a(list.get(i));
            }
            m11227b();
            return;
        }
        if (map.containsKey(C2069a.f13127E) && (map.get(C2069a.f13127E) instanceof InterfaceC2081c)) {
            InterfaceC2081c interfaceC2081c = (InterfaceC2081c) map.get(C2069a.f13127E);
            if (interfaceC2081c != null) {
                interfaceC2081c.mo11132a(list.get(i), i);
            }
            m11227b();
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m11225b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: b */
    private void m11227b() {
        C2091a.m11182a().m11185b();
        C2096b c2096b = this.f13270c;
        if (c2096b != null) {
            c2096b.m11207c();
            this.f13270c = null;
        }
        C2072a.m11068a().f13183a = null;
        if (this.f13269b != null) {
            this.f13269b = null;
        }
        Map<String, Bitmap> map = this.f13271d;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f13271d.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f13271d.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m11228b(C2074c c2074c, View view) {
        C2087a.b bVarMo11154a;
        float fM11089c;
        C2087a.a aVarM11139a = C2087a.m11139a();
        aVarM11139a.mo11155a(c2074c.m11091e()).mo11153a();
        if (c2074c.m11091e() != 2 || c2074c.m11090d() > c2074c.m11089c()) {
            bVarMo11154a = aVarM11139a.mo11154a(c2074c.m11090d());
            fM11089c = c2074c.m11089c();
        } else {
            bVarMo11154a = aVarM11139a.mo11154a(c2074c.m11089c());
            fM11089c = c2074c.m11090d();
        }
        bVarMo11154a.mo11157b(fM11089c);
        if (view.getBackground() == null) {
            view.setBackgroundDrawable(aVarM11139a.mo11160b());
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11229b(C2097a c2097a, Map map) {
        if (map != null) {
            try {
                if (map.containsKey(C2069a.f13127E) && (map.get(C2069a.f13127E) instanceof InterfaceC2081c)) {
                    ((InterfaceC2081c) map.get(C2069a.f13127E)).mo11131a();
                    c2097a.m11227b();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11230b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey(C2069a.f13127E) && (map.get(C2069a.f13127E) instanceof InterfaceC2081c)) {
                    ((InterfaceC2081c) map.get(C2069a.f13127E)).mo11131a();
                    m11227b();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m11234f(C2097a c2097a) {
        c2097a.f13272e = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m11238a(C2074c c2074c, View view, InterfaceC2083e interfaceC2083e) {
        if (interfaceC2083e == null) {
            return;
        }
        if (c2074c != null) {
            try {
                ImageView imageView = (ImageView) view.findViewById(m11210a("anythink_iv_adbanner_bg"));
                if (imageView != null) {
                    imageView.setBackgroundColor(Color.parseColor(this.f13276i));
                }
                ImageView imageView2 = (ImageView) view.findViewById(m11210a("anythink_iv_adbanner"));
                if (imageView2 != null) {
                    imageView2.setBackgroundColor(Color.parseColor(this.f13276i));
                }
                interfaceC2083e.mo11133a(view, new ArrayList());
                return;
            } catch (Exception e) {
                e.getMessage();
            }
        }
        interfaceC2083e.mo11134a(EnumC2076b.NOT_FOUND_VIEWOPTION);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18, types: [android.widget.ImageView, com.anythink.expressad.videocommon.view.RoundImageView] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.anythink.expressad.video.dynview.j.a] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.ImageView, com.anythink.expressad.videocommon.view.RoundImageView] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11239a(com.anythink.expressad.video.dynview.C2074c r33, android.view.View r34, final java.util.Map r35, com.anythink.expressad.video.dynview.p163f.InterfaceC2083e r36) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.p170j.C2097a.m11239a(com.anythink.expressad.video.dynview.c, android.view.View, java.util.Map, com.anythink.expressad.video.dynview.f.e):void");
    }

    /* JADX INFO: renamed from: b */
    public final void m11240b(C2074c c2074c, View view, Map map, InterfaceC2083e interfaceC2083e) {
        EnumC2076b enumC2076b;
        C1781c c1781c;
        if (interfaceC2083e == null) {
            return;
        }
        if (c2074c == null) {
            enumC2076b = EnumC2076b.NOT_FOUND_VIEWOPTION;
        } else {
            if (map != null && map.containsKey("is_dy_success")) {
                f13268k = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            f13268k = false;
            ImageView imageView = (ImageView) view.findViewById(m11210a("anythink_reward_icon_riv"));
            TextView textView = (TextView) view.findViewById(m11210a("anythink_reward_title_tv"));
            LinearLayout linearLayout = (LinearLayout) view.findViewById(m11210a("anythink_reward_stars_mllv"));
            TextView textView2 = (TextView) view.findViewById(m11210a("anythink_reward_click_tv"));
            ImageView imageView2 = (ImageView) view.findViewById(m11210a("anythink_videoview_bg"));
            TextView textView3 = (TextView) view.findViewById(m11210a("anythink_reward_desc_tv"));
            List<View> arrayList = new ArrayList<>();
            List<C1781c> listM11093g = c2074c.m11093g();
            if (listM11093g != null && listM11093g.size() > 0 && (c1781c = listM11093g.get(0)) != null) {
                if (imageView != null) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                    m11219a(c1781c.m10150bd(), imageView);
                }
                if (textView != null) {
                    textView.setText(c1781c.m10148bb());
                }
                if (textView3 != null) {
                    textView3.setText(c1781c.m10149bc());
                }
                if (linearLayout != null) {
                    double dM10144aX = c1781c.m10144aX();
                    if (dM10144aX <= 0.0d) {
                        dM10144aX = 5.0d;
                    }
                    ((AnyThinkLevelLayoutView) linearLayout).setRatingAndUser(dM10144aX, c1781c.m10145aY());
                }
                if (textView2 != null) {
                    textView2.setText(c1781c.f11928cU);
                }
                int iM11094h = c2074c.m11094h();
                if (iM11094h == 102 || iM11094h == 202 || iM11094h == 302) {
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                } else if (iM11094h == 802) {
                    if (imageView != null) {
                        arrayList.add(imageView);
                    }
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                    m11213a(imageView2, c1781c.m10151be(), iM11094h);
                } else if (iM11094h == 904 && c2074c.m11097k()) {
                    arrayList.add(view);
                }
                interfaceC2083e.mo11133a(view, arrayList);
                return;
            }
            enumC2076b = EnumC2076b.CAMPAIGNEX_IS_NULL;
        }
        interfaceC2083e.mo11134a(enumC2076b);
    }

    /* JADX INFO: renamed from: c */
    public final void m11241c(C2074c c2074c, View view, final Map map, InterfaceC2083e interfaceC2083e) {
        try {
            if (this.f13271d == null) {
                this.f13271d = new HashMap();
            }
            final List<C1781c> listM11093g = c2074c.m11093g();
            if (view.getContext() == null) {
                interfaceC2083e.mo11134a(EnumC2076b.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f13268k = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            f13268k = false;
            ListView listView = (ListView) view.findViewById(m11210a("anythink_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(m11210a("anythink_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(m11210a("anythink_order_view_iv_close"));
            C2100a c2100a = new C2100a(listM11093g);
            if (c2074c.m11091e() == 1) {
                if (listView != null) {
                    listView.setAdapter((ListAdapter) c2100a);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.anythink.expressad.video.dynview.j.a.7
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view2, int i, long j) {
                            C2097a.m11217a(C2097a.this, map, listM11093g, i);
                        }
                    });
                }
            } else if (gridView != null) {
                int iM11090d = (int) c2074c.m11090d();
                int size = iM11090d / listM11093g.size();
                int i = size / 9;
                int i2 = i / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = iM11090d - (i * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i) - (i2 / 2));
                gridView.setHorizontalSpacing(i2);
                gridView.setStretchMode(0);
                gridView.setNumColumns(listM11093g.size());
                gridView.setAdapter((ListAdapter) c2100a);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.anythink.expressad.video.dynview.j.a.8
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view2, int i3, long j) {
                        C2097a.m11217a(C2097a.this, map, listM11093g, i3);
                    }
                });
            }
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.dynview.j.a.9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C2097a.m11229b(C2097a.this, map);
                    }
                });
            }
            if (interfaceC2083e != null) {
                interfaceC2083e.mo11133a(view, null);
            }
        } catch (Exception unused) {
            if (interfaceC2083e != null) {
                interfaceC2083e.mo11134a(EnumC2076b.NOT_FOUND_VIEWOPTION);
            }
        }
    }
}
