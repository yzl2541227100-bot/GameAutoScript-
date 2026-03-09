package com.anythink.expressad.video.dynview.ordercamp.p171a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.dynview.p165h.C2089b;
import com.anythink.expressad.video.dynview.widget.ATRotationView;
import com.anythink.expressad.video.dynview.widget.AnyThinkImageView;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnyThinkTextView;
import com.anythink.expressad.videocommon.view.RoundImageView;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2100a extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    private static final String f13336a = "OrderCampAdapter";

    /* JADX INFO: renamed from: e */
    private static final String f13337e = "anythink_lv_item_rl";

    /* JADX INFO: renamed from: f */
    private static final String f13338f = "anythink_lv_iv";

    /* JADX INFO: renamed from: g */
    private static final String f13339g = "anythink_lv_icon_iv";

    /* JADX INFO: renamed from: h */
    private static final String f13340h = "anythink_lv_title_tv";

    /* JADX INFO: renamed from: i */
    private static final String f13341i = "anythink_lv_tv_install";

    /* JADX INFO: renamed from: j */
    private static final String f13342j = "anythink_lv_sv_starlevel";

    /* JADX INFO: renamed from: k */
    private static final String f13343k = "anythink_lv_sv_heat_level";

    /* JADX INFO: renamed from: l */
    private static final String f13344l = "anythink_lv_ration";

    /* JADX INFO: renamed from: m */
    private static final String f13345m = "anythink_lv_desc_tv";

    /* JADX INFO: renamed from: n */
    private static final String f13346n = "anythink_iv_flag";

    /* JADX INFO: renamed from: o */
    private static final String f13347o = "anythink_order_viewed_tv";

    /* JADX INFO: renamed from: p */
    private static final String f13348p = "anythink_order_layout_item";

    /* JADX INFO: renamed from: q */
    private static final String f13349q = "anythink_lv_iv_burl";

    /* JADX INFO: renamed from: r */
    private static final String f13350r = "501";

    /* JADX INFO: renamed from: s */
    private static final String f13351s = "\\.xml";

    /* JADX INFO: renamed from: t */
    private static final String f13352t = "\\/xml";

    /* JADX INFO: renamed from: u */
    private static final String f13353u = "_item.xml";

    /* JADX INFO: renamed from: b */
    private boolean f13354b = false;

    /* JADX INFO: renamed from: c */
    private a f13355c;

    /* JADX INFO: renamed from: d */
    private List<C1781c> f13356d;

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$1 */
    public class AnonymousClass1 implements InterfaceC1819c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f13357a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f13358b;

        public AnonymousClass1(ImageView imageView, boolean z) {
            imageView = imageView;
            z = z;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
            if (z) {
                imageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$2 */
    public class AnonymousClass2 implements InterfaceC1819c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f13360a;

        public AnonymousClass2(Context context) {
            this.f13360a = context;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                int iM9834b = C1886t.m9834b(this.f13360a, 12.0f);
                C2100a.this.f13355c.f13371j.getLayoutParams().height = iM9834b;
                C2100a.this.f13355c.f13371j.getLayoutParams().width = (int) (iM9834b * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                C2100a.this.f13355c.f13371j.setImageBitmap(bitmap);
                C2100a.this.f13355c.f13371j.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public RelativeLayout f13362a;

        /* JADX INFO: renamed from: b */
        public ATRotationView f13363b;

        /* JADX INFO: renamed from: c */
        public AnyThinkImageView f13364c;

        /* JADX INFO: renamed from: d */
        public RoundImageView f13365d;

        /* JADX INFO: renamed from: e */
        public TextView f13366e;

        /* JADX INFO: renamed from: f */
        public TextView f13367f;

        /* JADX INFO: renamed from: g */
        public TextView f13368g;

        /* JADX INFO: renamed from: h */
        public TextView f13369h;

        /* JADX INFO: renamed from: i */
        public AnyThinkLevelLayoutView f13370i;

        /* JADX INFO: renamed from: j */
        public ImageView f13371j;
    }

    public C2100a(List<C1781c> list) {
        this.f13356d = list;
    }

    /* JADX INFO: renamed from: a */
    private static int m11258a(String str) {
        return C1875i.m9684a(C1175n.m2059a().m2148f().getApplicationContext(), str, "layout");
    }

    /* JADX INFO: renamed from: a */
    private View m11259a() {
        View viewInflate = LayoutInflater.from(C1175n.m2059a().m2148f()).inflate(C1875i.m9684a(C1175n.m2059a().m2148f().getApplicationContext(), f13348p, "layout"), (ViewGroup) null);
        a aVar = new a();
        this.f13355c = aVar;
        aVar.f13364c = (AnyThinkImageView) viewInflate.findViewById(m11264b(f13338f));
        this.f13355c.f13365d = (RoundImageView) viewInflate.findViewById(m11264b(f13339g));
        this.f13355c.f13370i = (AnyThinkLevelLayoutView) viewInflate.findViewById(m11264b(f13342j));
        this.f13355c.f13363b = (ATRotationView) viewInflate.findViewById(m11264b(f13344l));
        viewInflate.setTag(this.f13355c);
        return viewInflate;
    }

    /* JADX INFO: renamed from: a */
    private void m11261a(int i) {
        List<C1781c> list = this.f13356d;
        if (list == null || this.f13355c == null || list.size() == 0) {
            return;
        }
        AnyThinkImageView anyThinkImageView = this.f13355c.f13364c;
        if (anyThinkImageView != null) {
            m11263a(anyThinkImageView, this.f13356d.get(i).m10151be(), false);
        }
        RoundImageView roundImageView = this.f13355c.f13365d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            m11263a(this.f13355c.f13365d, this.f13356d.get(i).m10150bd(), true);
        }
        double dM10144aX = this.f13356d.get(i).m10144aX();
        if (dM10144aX <= 0.0d) {
            dM10144aX = 5.0d;
        }
        AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f13355c.f13370i;
        if (anyThinkLevelLayoutView != null) {
            anyThinkLevelLayoutView.setRatingAndUser(dM10144aX, this.f13356d.get(i).m10145aY());
            this.f13355c.f13370i.setOrientation(0);
        }
        ATRotationView aTRotationView = this.f13355c.f13363b;
        if (aTRotationView != null) {
            aTRotationView.setWidthRatio(1.0f);
            this.f13355c.f13363b.setHeightRatio(1.0f);
            this.f13355c.f13363b.setAutoscroll(false);
        }
        AnyThinkImageView anyThinkImageView2 = this.f13355c.f13364c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11262a(View view) {
        this.f13355c.f13362a = (RelativeLayout) view.findViewById(m11268d(f13337e));
        this.f13355c.f13366e = (TextView) view.findViewById(m11268d(f13340h));
        this.f13355c.f13368g = (TextView) view.findViewById(m11268d(f13341i));
        this.f13355c.f13367f = (TextView) view.findViewById(m11268d(f13345m));
        this.f13355c.f13371j = (ImageView) view.findViewById(m11268d(f13346n));
        this.f13355c.f13369h = (TextView) view.findViewById(m11268d(f13347o));
    }

    /* JADX INFO: renamed from: a */
    private void m11263a(ImageView imageView, String str, boolean z) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            C1818b.m9427a(imageView.getContext()).m9443a(str, new InterfaceC1819c() { // from class: com.anythink.expressad.video.dynview.ordercamp.a.a.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ImageView f13357a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f13358b;

                public AnonymousClass1(ImageView imageView2, boolean z3) {
                    imageView = imageView2;
                    z = z3;
                }

                @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                /* JADX INFO: renamed from: a */
                public final void mo5462a(Bitmap bitmap, String str2) {
                    try {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        imageView.setImageBitmap(bitmap);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }

                @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                /* JADX INFO: renamed from: a */
                public final void mo5463a(String str2, String str22) {
                    if (z) {
                        imageView.setVisibility(8);
                    }
                }
            });
        } else if (z3) {
            imageView2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m11264b(String str) {
        return C1875i.m9684a(C1175n.m2059a().m2148f().getApplicationContext(), str, "id");
    }

    /* JADX INFO: renamed from: b */
    private View m11265b() {
        View viewInflate = LayoutInflater.from(C1175n.m2059a().m2148f()).inflate(C1875i.m9684a(C1175n.m2059a().m2148f().getApplicationContext(), f13348p, "layout"), (ViewGroup) null);
        a aVar = new a();
        this.f13355c = aVar;
        aVar.f13364c = (AnyThinkImageView) viewInflate.findViewById(m11264b(f13338f));
        this.f13355c.f13365d = (RoundImageView) viewInflate.findViewById(m11264b(f13339g));
        this.f13355c.f13370i = (AnyThinkLevelLayoutView) viewInflate.findViewById(m11264b(f13342j));
        this.f13355c.f13363b = (ATRotationView) viewInflate.findViewById(m11264b(f13344l));
        viewInflate.setTag(this.f13355c);
        return viewInflate;
    }

    /* JADX INFO: renamed from: b */
    private void m11266b(int i) {
        if (this.f13355c != null) {
            C1781c c1781c = this.f13356d.get(i);
            if (this.f13355c.f13366e != null) {
                this.f13355c.f13366e.setText(c1781c.m10148bb());
            }
            if (this.f13355c.f13367f != null) {
                this.f13355c.f13367f.setText(c1781c.m10149bc());
            }
            TextView textView = this.f13355c.f13368g;
            if (textView != null) {
                String str = c1781c.f11928cU;
                if (textView instanceof AnyThinkTextView) {
                    new C2089b();
                    ((AnyThinkTextView) this.f13355c.f13368g).setObjectAnimator(C2089b.m11173c(this.f13355c.f13368g));
                }
                this.f13355c.f13368g.setText(str);
            }
            if (this.f13355c.f13371j != null) {
                try {
                    Locale.getDefault().getLanguage();
                    Context contextM2148f = C1175n.m2059a().m2148f();
                    C1818b.m9427a(contextM2148f).m9443a(c1781c.m8830aE(), new AnonymousClass2(contextM2148f));
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            if (this.f13355c.f13369h != null) {
                try {
                    this.f13355c.f13369h.setText(C1175n.m2059a().m2148f().getResources().getString(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_viewed_text_str", C1875i.f11532g)));
                    this.f13355c.f13369h.setVisibility(0);
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m11267c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: d */
    private int m11268d(String str) {
        return this.f13354b ? m11267c(str) : m11264b(str);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<C1781c> list = this.f13356d;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f13356d.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List<C1781c> list = this.f13356d;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            if (view == null) {
                View viewInflate = LayoutInflater.from(C1175n.m2059a().m2148f()).inflate(C1875i.m9684a(C1175n.m2059a().m2148f().getApplicationContext(), f13348p, "layout"), (ViewGroup) null);
                a aVar = new a();
                this.f13355c = aVar;
                aVar.f13364c = (AnyThinkImageView) viewInflate.findViewById(m11264b(f13338f));
                this.f13355c.f13365d = (RoundImageView) viewInflate.findViewById(m11264b(f13339g));
                this.f13355c.f13370i = (AnyThinkLevelLayoutView) viewInflate.findViewById(m11264b(f13342j));
                this.f13355c.f13363b = (ATRotationView) viewInflate.findViewById(m11264b(f13344l));
                viewInflate.setTag(this.f13355c);
                view = viewInflate;
            } else {
                this.f13355c = (a) view.getTag();
            }
            this.f13355c.f13362a = (RelativeLayout) view.findViewById(m11268d(f13337e));
            this.f13355c.f13366e = (TextView) view.findViewById(m11268d(f13340h));
            this.f13355c.f13368g = (TextView) view.findViewById(m11268d(f13341i));
            this.f13355c.f13367f = (TextView) view.findViewById(m11268d(f13345m));
            this.f13355c.f13371j = (ImageView) view.findViewById(m11268d(f13346n));
            this.f13355c.f13369h = (TextView) view.findViewById(m11268d(f13347o));
            List<C1781c> list = this.f13356d;
            if (list != null && this.f13355c != null && list.size() != 0) {
                AnyThinkImageView anyThinkImageView = this.f13355c.f13364c;
                if (anyThinkImageView != null) {
                    m11263a(anyThinkImageView, this.f13356d.get(i).m10151be(), false);
                }
                RoundImageView roundImageView = this.f13355c.f13365d;
                if (roundImageView != null) {
                    roundImageView.setBorderRadius(25);
                    m11263a(this.f13355c.f13365d, this.f13356d.get(i).m10150bd(), true);
                }
                double dM10144aX = this.f13356d.get(i).m10144aX();
                if (dM10144aX <= 0.0d) {
                    dM10144aX = 5.0d;
                }
                AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f13355c.f13370i;
                if (anyThinkLevelLayoutView != null) {
                    anyThinkLevelLayoutView.setRatingAndUser(dM10144aX, this.f13356d.get(i).m10145aY());
                    this.f13355c.f13370i.setOrientation(0);
                }
                ATRotationView aTRotationView = this.f13355c.f13363b;
                if (aTRotationView != null) {
                    aTRotationView.setWidthRatio(1.0f);
                    this.f13355c.f13363b.setHeightRatio(1.0f);
                    this.f13355c.f13363b.setAutoscroll(false);
                }
                AnyThinkImageView anyThinkImageView2 = this.f13355c.f13364c;
                if (anyThinkImageView2 != null) {
                    anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                }
            }
            if (this.f13355c != null) {
                C1781c c1781c = this.f13356d.get(i);
                if (this.f13355c.f13366e != null) {
                    this.f13355c.f13366e.setText(c1781c.m10148bb());
                }
                if (this.f13355c.f13367f != null) {
                    this.f13355c.f13367f.setText(c1781c.m10149bc());
                }
                TextView textView = this.f13355c.f13368g;
                if (textView != null) {
                    String str = c1781c.f11928cU;
                    if (textView instanceof AnyThinkTextView) {
                        new C2089b();
                        ((AnyThinkTextView) this.f13355c.f13368g).setObjectAnimator(C2089b.m11173c(this.f13355c.f13368g));
                    }
                    this.f13355c.f13368g.setText(str);
                }
                if (this.f13355c.f13371j != null) {
                    try {
                        Locale.getDefault().getLanguage();
                        Context contextM2148f = C1175n.m2059a().m2148f();
                        C1818b.m9427a(contextM2148f).m9443a(c1781c.m8830aE(), new AnonymousClass2(contextM2148f));
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
                if (this.f13355c.f13369h != null) {
                    try {
                        this.f13355c.f13369h.setText(C1175n.m2059a().m2148f().getResources().getString(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_viewed_text_str", C1875i.f11532g)));
                        this.f13355c.f13369h.setVisibility(0);
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                }
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
        return view;
    }
}
