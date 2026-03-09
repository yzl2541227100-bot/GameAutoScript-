package com.anythink.basead.p015c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anythink.basead.p010a.C0717a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1213af;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: renamed from: com.anythink.basead.c.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0749g extends AbstractC1213af {

    /* JADX INFO: renamed from: a */
    public String f745a;

    /* JADX INFO: renamed from: b */
    public String f746b;

    /* JADX INFO: renamed from: com.anythink.basead.c.g$1 */
    public class AnonymousClass1 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f747a;

        public AnonymousClass1(Dialog dialog) {
            dialog = dialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0749g c0749g = C0749g.this;
            C1322e.m3914a(c0749g.f746b, c0749g.f3730c.m3229t(), C0749g.this.f745a, 7, (String) null, 0L, 0L);
            try {
                dialog.dismiss();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.c.g$2 */
    public class AnonymousClass2 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f749a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Dialog f750b;

        public AnonymousClass2(Context context, Dialog dialog) {
            context = context;
            dialog = dialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                C0749g c0749g = C0749g.this;
                C1322e.m3914a(c0749g.f746b, c0749g.f3730c.m3229t(), C0749g.this.f745a, 8, (String) null, 0L, 0L);
                if (C0717a.m129a(context, C0749g.this.f3730c)) {
                    C0749g c0749g2 = C0749g.this;
                    C1322e.m3914a(c0749g2.f746b, c0749g2.f3730c.m3229t(), C0749g.this.f745a, 9, (String) null, 0L, 0L);
                }
                dialog.dismiss();
            } catch (Throwable unused) {
            }
        }
    }

    public C0749g(AbstractC1247l abstractC1247l, String str, String str2) {
        this.f745a = str;
        this.f746b = str2;
        this.f3730c = abstractC1247l;
    }

    @Override // com.anythink.core.common.p055f.AbstractC1213af
    /* JADX INFO: renamed from: a */
    public final void mo315a(Activity activity) {
        try {
            AbstractC1247l abstractC1247l = this.f3730c;
            String strM2492ak = abstractC1247l instanceof AbstractC1217aj ? ((AbstractC1217aj) abstractC1247l).m2492ak() : "";
            if (TextUtils.isEmpty(strM2492ak)) {
                strM2492ak = this.f3730c.m3233v();
            }
            Context contextM2148f = C1175n.m2059a().m2148f();
            View viewInflate = LayoutInflater.from(activity).inflate(C1345i.m4154a(contextM2148f, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(C1345i.m4154a(contextM2148f, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) viewInflate.findViewById(C1345i.m4154a(contextM2148f, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) viewInflate.findViewById(C1345i.m4154a(contextM2148f, "myoffer_confirm_continue", "id"));
            String string = contextM2148f.getString(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_confirm_msg", C1875i.f11532g));
            String string2 = contextM2148f.getString(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_give_up", C1875i.f11532g));
            String string3 = contextM2148f.getString(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_continue", C1875i.f11532g));
            textView.setText(string + "\"" + strM2492ak + "\"?");
            textView2.setText(string2);
            textView3.setText(string3);
            Dialog dialog = new Dialog(activity, C1345i.m4154a(contextM2148f, "style_full_screen_translucent_dialog", C1875i.f11530e));
            dialog.setContentView(viewInflate);
            dialog.setCancelable(false);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.c.g.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Dialog f747a;

                public AnonymousClass1(Dialog dialog2) {
                    dialog = dialog2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0749g c0749g = C0749g.this;
                    C1322e.m3914a(c0749g.f746b, c0749g.f3730c.m3229t(), C0749g.this.f745a, 7, (String) null, 0L, 0L);
                    try {
                        dialog.dismiss();
                    } catch (Throwable unused) {
                    }
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.c.g.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f749a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Dialog f750b;

                public AnonymousClass2(Context contextM2148f2, Dialog dialog2) {
                    context = contextM2148f2;
                    dialog = dialog2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        C0749g c0749g = C0749g.this;
                        C1322e.m3914a(c0749g.f746b, c0749g.f3730c.m3229t(), C0749g.this.f745a, 8, (String) null, 0L, 0L);
                        if (C0717a.m129a(context, C0749g.this.f3730c)) {
                            C0749g c0749g2 = C0749g.this;
                            C1322e.m3914a(c0749g2.f746b, c0749g2.f3730c.m3229t(), C0749g.this.f745a, 9, (String) null, 0L, 0L);
                        }
                        dialog.dismiss();
                    } catch (Throwable unused) {
                    }
                }
            });
            dialog2.show();
        } catch (Throwable unused) {
        }
    }
}
