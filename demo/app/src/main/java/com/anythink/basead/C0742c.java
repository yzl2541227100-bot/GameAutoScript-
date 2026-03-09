package com.anythink.basead;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: renamed from: com.anythink.basead.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0742c {

    /* JADX INFO: renamed from: a */
    public AbstractC1247l f654a;

    /* JADX INFO: renamed from: b */
    public C1248m f655b;

    /* JADX INFO: renamed from: c */
    private Context f656c;

    /* JADX INFO: renamed from: d */
    private Dialog f657d;

    /* JADX INFO: renamed from: e */
    private View f658e;

    /* JADX INFO: renamed from: f */
    private EditText f659f;

    /* JADX INFO: renamed from: g */
    private ImageView f660g;

    /* JADX INFO: renamed from: h */
    private TextView f661h;

    /* JADX INFO: renamed from: i */
    private TextView f662i;

    /* JADX INFO: renamed from: j */
    private TextView f663j;

    /* JADX INFO: renamed from: k */
    private TextView f664k;

    /* JADX INFO: renamed from: l */
    private TextView f665l;

    /* JADX INFO: renamed from: m */
    private TextView f666m;

    /* JADX INFO: renamed from: n */
    private TextView f667n;

    /* JADX INFO: renamed from: o */
    private TextView f668o;

    /* JADX INFO: renamed from: p */
    private TextView f669p;

    /* JADX INFO: renamed from: q */
    private TextView f670q;

    /* JADX INFO: renamed from: r */
    private boolean f671r;

    /* JADX INFO: renamed from: s */
    private a f672s;

    /* JADX INFO: renamed from: t */
    private View.OnClickListener f673t = new View.OnClickListener() { // from class: com.anythink.basead.c.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof TextView) {
                C0742c c0742c = C0742c.this;
                C1322e.m3893a(c0742c.f654a, c0742c.f655b, ((TextView) view).getTag().toString(), "");
                C0742c.m294b(C0742c.this);
                if (C0742c.this.f672s != null) {
                    C0742c.this.f672s.mo305a();
                }
            }
        }
    };

    /* JADX INFO: renamed from: com.anythink.basead.c$1, reason: invalid class name */
    public class AnonymousClass1 implements DialogInterface.OnCancelListener {
        public AnonymousClass1() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            if (C0742c.this.f672s != null) {
                C0742c.this.f672s.mo306b();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.c$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0742c.m294b(C0742c.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.c$3, reason: invalid class name */
    public class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (C0742c.this.f659f == null || C0742c.this.f656c == null) {
                return;
            }
            String string = C0742c.this.f659f.getText().toString();
            if (!TextUtils.isEmpty(string)) {
                C0742c c0742c = C0742c.this;
                C1322e.m3893a(c0742c.f654a, c0742c.f655b, "0", string);
                C0742c.m294b(C0742c.this);
                if (C0742c.this.f672s != null) {
                    C0742c.this.f672s.mo305a();
                    return;
                }
                return;
            }
            if (C0742c.this.f671r) {
                return;
            }
            C0742c.this.f671r = true;
            C0742c.this.f659f.setCursorVisible(false);
            C0742c.this.f659f.setHint(C1345i.m4154a(C0742c.this.f656c, "myoffer_feedback_hint", C1875i.f11532g));
            C0742c.this.f659f.setHintTextColor(Color.parseColor("#999999"));
            C0742c.this.f659f.postDelayed(new Runnable() { // from class: com.anythink.basead.c.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    C0742c.this.f671r = false;
                    C0742c.this.f659f.setCursorVisible(true);
                    C0742c.this.f659f.setHint("");
                }
            }, 1500L);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.c$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C0742c.this.f657d != null) {
                C0742c.this.f657d.dismiss();
            }
            if (C0742c.this.f672s != null) {
                C0742c.this.f672s.mo306b();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo305a();

        /* JADX INFO: renamed from: b */
        void mo306b();
    }

    /* JADX INFO: renamed from: a */
    private void m292a(int i, int i2) {
        int iM4153a;
        Context context;
        float f;
        Context context2 = this.f656c;
        Dialog dialog = new Dialog(context2, C1345i.m4154a(context2, "myoffer_feedback_dialog", C1875i.f11530e));
        this.f657d = dialog;
        dialog.setContentView(this.f658e);
        this.f657d.setCancelable(true);
        this.f657d.setOnCancelListener(new AnonymousClass1());
        Window window = this.f657d.getWindow();
        if (window != null) {
            if (i > i2) {
                iM4153a = C1345i.m4153a(this.f656c, 280.0f);
                context = this.f656c;
                f = 320.0f;
            } else {
                iM4153a = C1345i.m4153a(this.f656c, 300.0f);
                context = this.f656c;
                f = 426.0f;
            }
            window.setLayout(iM4153a, C1345i.m4153a(context, f));
        }
        this.f657d.show();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m294b(C0742c c0742c) {
        new Handler().postDelayed(c0742c.new AnonymousClass4(), 30L);
    }

    /* JADX INFO: renamed from: c */
    private void m296c() {
        this.f660g = (ImageView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_iv_close", "id"));
        this.f659f = (EditText) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_et", "id"));
        this.f661h = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_commit", "id"));
        this.f662i = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_1", "id"));
        this.f663j = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_2", "id"));
        this.f664k = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_3", "id"));
        this.f665l = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_4", "id"));
        this.f666m = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_5", "id"));
        this.f667n = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_6", "id"));
        this.f668o = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_7", "id"));
        this.f669p = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_8", "id"));
        this.f670q = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_9", "id"));
        this.f660g.setOnClickListener(new AnonymousClass2());
        this.f662i.setOnClickListener(this.f673t);
        this.f663j.setOnClickListener(this.f673t);
        this.f664k.setOnClickListener(this.f673t);
        this.f665l.setOnClickListener(this.f673t);
        this.f666m.setOnClickListener(this.f673t);
        this.f667n.setOnClickListener(this.f673t);
        this.f668o.setOnClickListener(this.f673t);
        this.f669p.setOnClickListener(this.f673t);
        this.f670q.setOnClickListener(this.f673t);
        this.f661h.setOnClickListener(new AnonymousClass3());
    }

    /* JADX INFO: renamed from: d */
    private void m298d() {
        this.f660g.setOnClickListener(new AnonymousClass2());
        this.f662i.setOnClickListener(this.f673t);
        this.f663j.setOnClickListener(this.f673t);
        this.f664k.setOnClickListener(this.f673t);
        this.f665l.setOnClickListener(this.f673t);
        this.f666m.setOnClickListener(this.f673t);
        this.f667n.setOnClickListener(this.f673t);
        this.f668o.setOnClickListener(this.f673t);
        this.f669p.setOnClickListener(this.f673t);
        this.f670q.setOnClickListener(this.f673t);
        this.f661h.setOnClickListener(new AnonymousClass3());
    }

    /* JADX INFO: renamed from: e */
    private void m299e() {
        new Handler().postDelayed(new AnonymousClass4(), 30L);
    }

    /* JADX INFO: renamed from: a */
    public final void m302a(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, a aVar) {
        int iM4153a;
        int iM4153a2;
        try {
            this.f656c = context;
            this.f654a = abstractC1247l;
            this.f655b = c1248m;
            this.f672s = aVar;
            int i = context.getResources().getDisplayMetrics().widthPixels;
            int i2 = context.getResources().getDisplayMetrics().heightPixels;
            this.f658e = i > i2 ? LayoutInflater.from(context).inflate(C1345i.m4154a(context, "myoffer_feedback_land", "layout"), (ViewGroup) null, false) : LayoutInflater.from(context).inflate(C1345i.m4154a(context, "myoffer_feedback", "layout"), (ViewGroup) null, false);
            this.f660g = (ImageView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_iv_close", "id"));
            this.f659f = (EditText) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_et", "id"));
            this.f661h = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_commit", "id"));
            this.f662i = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_1", "id"));
            this.f663j = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_2", "id"));
            this.f664k = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_3", "id"));
            this.f665l = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_4", "id"));
            this.f666m = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_5", "id"));
            this.f667n = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_6", "id"));
            this.f668o = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_7", "id"));
            this.f669p = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_8", "id"));
            this.f670q = (TextView) this.f658e.findViewById(C1345i.m4154a(this.f656c, "myoffer_feedback_tv_9", "id"));
            this.f660g.setOnClickListener(new AnonymousClass2());
            this.f662i.setOnClickListener(this.f673t);
            this.f663j.setOnClickListener(this.f673t);
            this.f664k.setOnClickListener(this.f673t);
            this.f665l.setOnClickListener(this.f673t);
            this.f666m.setOnClickListener(this.f673t);
            this.f667n.setOnClickListener(this.f673t);
            this.f668o.setOnClickListener(this.f673t);
            this.f669p.setOnClickListener(this.f673t);
            this.f670q.setOnClickListener(this.f673t);
            this.f661h.setOnClickListener(new AnonymousClass3());
            Context context2 = this.f656c;
            Dialog dialog = new Dialog(context2, C1345i.m4154a(context2, "myoffer_feedback_dialog", C1875i.f11530e));
            this.f657d = dialog;
            dialog.setContentView(this.f658e);
            this.f657d.setCancelable(true);
            this.f657d.setOnCancelListener(new AnonymousClass1());
            Window window = this.f657d.getWindow();
            if (window != null) {
                if (i > i2) {
                    iM4153a = C1345i.m4153a(this.f656c, 280.0f);
                    iM4153a2 = C1345i.m4153a(this.f656c, 320.0f);
                } else {
                    iM4153a = C1345i.m4153a(this.f656c, 300.0f);
                    iM4153a2 = C1345i.m4153a(this.f656c, 426.0f);
                }
                window.setLayout(iM4153a, iM4153a2);
            }
            this.f657d.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m303a() {
        Dialog dialog = this.f657d;
        return dialog != null && dialog.isShowing();
    }

    /* JADX INFO: renamed from: b */
    public final void m304b() {
        this.f656c = null;
        this.f654a = null;
        this.f655b = null;
        this.f672s = null;
    }
}
