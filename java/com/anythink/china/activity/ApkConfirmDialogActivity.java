package com.anythink.china.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.anythink.china.common.C1066a;
import com.anythink.china.common.p036c.C1080a;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p057g.InterfaceC1263a;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.p071ui.component.RoundImageView;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.expressad.foundation.p138h.C1875i;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes.dex */
public class ApkConfirmDialogActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public static AbstractC1247l f2311a;

    /* JADX INFO: renamed from: b */
    private static InterfaceC1263a f2312b;

    /* JADX INFO: renamed from: c */
    private Dialog f2313c;

    /* JADX INFO: renamed from: com.anythink.china.activity.ApkConfirmDialogActivity$2 */
    public class ViewOnClickListenerC10542 implements View.OnClickListener {
        public ViewOnClickListenerC10542() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.china.activity.ApkConfirmDialogActivity.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ApkConfirmDialogActivity.f2312b != null) {
                        ApkConfirmDialogActivity.f2312b.mo167a(false);
                    }
                }
            }, 2, true);
            ApkConfirmDialogActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.activity.ApkConfirmDialogActivity$3 */
    public class ViewOnClickListenerC10553 implements View.OnClickListener {
        public ViewOnClickListenerC10553() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.china.activity.ApkConfirmDialogActivity.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ApkConfirmDialogActivity.f2312b != null) {
                        ApkConfirmDialogActivity.f2312b.mo167a(true);
                    }
                }
            }, 2, true);
            ApkConfirmDialogActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.activity.ApkConfirmDialogActivity$4 */
    public class C10564 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RoundImageView f2323b;

        public C10564(String str, RoundImageView roundImageView) {
            this.f2322a = str;
            this.f2323b = roundImageView;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f2322a)) {
                this.f2323b.setImageBitmap(bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.activity.ApkConfirmDialogActivity$5 */
    public class ViewOnClickListenerC10575 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1247l f2325a;

        public ViewOnClickListenerC10575(AbstractC1247l abstractC1247l) {
            this.f2325a = abstractC1247l;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(ApkConfirmDialogActivity.this, this.f2325a.m3174M());
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.activity.ApkConfirmDialogActivity$6 */
    public class ViewOnClickListenerC10586 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1247l f2327a;

        public ViewOnClickListenerC10586(AbstractC1247l abstractC1247l) {
            this.f2327a = abstractC1247l;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(ApkConfirmDialogActivity.this, this.f2327a.m3173L());
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.activity.ApkConfirmDialogActivity$7 */
    public class ViewOnClickListenerC10597 implements View.OnClickListener {
        public ViewOnClickListenerC10597() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.china.activity.ApkConfirmDialogActivity.7.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ApkConfirmDialogActivity.f2312b != null) {
                        ApkConfirmDialogActivity.f2312b.mo167a(true);
                    }
                }
            }, 2, true);
            ApkConfirmDialogActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.activity.ApkConfirmDialogActivity$8 */
    public class ViewOnClickListenerC10608 implements View.OnClickListener {
        public ViewOnClickListenerC10608() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.china.activity.ApkConfirmDialogActivity.8.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ApkConfirmDialogActivity.f2312b != null) {
                        ApkConfirmDialogActivity.f2312b.mo167a(false);
                    }
                }
            }, 2, true);
            ApkConfirmDialogActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1389a(final Context context, final AbstractC1247l abstractC1247l, final InterfaceC1263a interfaceC1263a) {
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.china.activity.ApkConfirmDialogActivity.1
            @Override // java.lang.Runnable
            public final void run() {
                if (C1066a.m1427a(context).m1451a(abstractC1247l)) {
                    interfaceC1263a.mo167a(true);
                } else if (C1080a.m1540a(context, abstractC1247l.m3167F())) {
                    interfaceC1263a.mo167a(true);
                } else {
                    C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.china.activity.ApkConfirmDialogActivity.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            RunnableC10531 runnableC10531 = RunnableC10531.this;
                            ApkConfirmDialogActivity.f2311a = abstractC1247l;
                            InterfaceC1263a unused = ApkConfirmDialogActivity.f2312b = interfaceC1263a;
                            Intent intent = new Intent(context, (Class<?>) ApkConfirmDialogActivity.class);
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                        }
                    });
                }
            }
        }, 2, true);
    }

    /* JADX INFO: renamed from: b */
    private void m1390b() {
        try {
            AbstractC1247l abstractC1247l = f2311a;
            String strM2492ak = abstractC1247l instanceof AbstractC1217aj ? ((AbstractC1217aj) abstractC1247l).m2492ak() : "";
            if (TextUtils.isEmpty(strM2492ak)) {
                strM2492ak = f2311a.m3233v();
            }
            View viewInflate = LayoutInflater.from(this).inflate(C1345i.m4154a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "myoffer_confirm_continue", "id"));
            textView.setText("立即下载\"" + strM2492ak + "\"?");
            textView2.setText("取 消");
            textView3.setText("确 定");
            textView2.setOnClickListener(new ViewOnClickListenerC10542());
            textView3.setOnClickListener(new ViewOnClickListenerC10553());
            Dialog dialog = new Dialog(this, C1345i.m4154a(this, "style_full_screen_translucent_dialog", C1875i.f11530e));
            this.f2313c = dialog;
            dialog.setContentView(viewInflate);
            this.f2313c.setCancelable(false);
            this.f2313c.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m1391c() {
        TextView textView;
        View view;
        TextView textView2;
        try {
            AbstractC1247l abstractC1247l = f2311a;
            View viewInflate = LayoutInflater.from(this).inflate(C1345i.m4154a(this, "confirm", "layout"), (ViewGroup) null, false);
            RoundImageView roundImageView = (RoundImageView) viewInflate.findViewById(C1345i.m4154a(this, "confirm_dialog_icon", "id"));
            TextView textView3 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "confirm_dialog_title", "id"));
            TextView textView4 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "confirm_dialog_version_name", "id"));
            TextView textView5 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "confirm_dialog_publisher_name", "id"));
            TextView textView6 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "confirm_dialog_permission_manage", "id"));
            TextView textView7 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "confirm_dialog_privacy_agreement", "id"));
            TextView textView8 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "confirm_dialog_download_now", "id"));
            TextView textView9 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "confirm_dialog_give_up", "id"));
            String strM3237x = abstractC1247l.m3237x();
            if (TextUtils.isEmpty(strM3237x)) {
                textView = textView9;
                view = viewInflate;
                textView2 = textView8;
                ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.height = 0;
                roundImageView.setLayoutParams(layoutParams);
            } else {
                roundImageView.setNeedRadiu(true);
                roundImageView.setRadiusInDip(4);
                ViewGroup.LayoutParams layoutParams2 = roundImageView.getLayoutParams();
                view = viewInflate;
                textView = textView9;
                textView2 = textView8;
                C1378b.m4482a(this).m4494a(new C1381e(1, strM3237x), layoutParams2.width, layoutParams2.height, new C10564(strM3237x, roundImageView));
            }
            String strM2492ak = abstractC1247l instanceof AbstractC1217aj ? ((AbstractC1217aj) abstractC1247l).m2492ak() : "";
            if (TextUtils.isEmpty(strM2492ak)) {
                strM2492ak = abstractC1247l.m3233v();
            }
            textView3.setText(strM2492ak);
            textView4.setText(getResources().getString(C1345i.m4154a(this, "confirm_dialog_version", C1875i.f11532g), abstractC1247l.m3172K()));
            textView5.setText(getResources().getString(C1345i.m4154a(this, "confirm_dialog_publisher", C1875i.f11532g), abstractC1247l.m3171J()));
            String string = getResources().getString(C1345i.m4154a(this, "confirm_dialog_privacy_agreement", C1875i.f11532g));
            String string2 = getResources().getString(C1345i.m4154a(this, "confirm_dialog_application_permission", C1875i.f11532g));
            int length = string.length();
            int length2 = string2.length();
            if (length != length2) {
                int iAbs = Math.abs(length2 - length);
                StringBuilder sb = new StringBuilder(string);
                for (int i = 0; i < iAbs; i++) {
                    sb.append(C4196o4.OooO00o.OooO0Oo);
                }
                string = sb.toString();
            }
            textView7.setText(string);
            textView6.setOnClickListener(new ViewOnClickListenerC10575(abstractC1247l));
            textView7.setOnClickListener(new ViewOnClickListenerC10586(abstractC1247l));
            textView2.setOnClickListener(new ViewOnClickListenerC10597());
            textView.setOnClickListener(new ViewOnClickListenerC10608());
            Dialog dialog = new Dialog(this, C1345i.m4154a(this, "style_full_screen_translucent_dialog", C1875i.f11530e));
            this.f2313c = dialog;
            dialog.setContentView(view);
            this.f2313c.setCancelable(false);
            Window window = this.f2313c.getWindow();
            if (window != null) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(C1345i.m4154a(this, "confirm_dialog_margin", "dimen"));
                int i2 = getResources().getDisplayMetrics().widthPixels;
                int i3 = getResources().getDisplayMetrics().heightPixels;
                int i4 = dimensionPixelSize * 2;
                if (i2 > i3) {
                    window.setLayout((int) Math.ceil(r4 * 0.98859316f), i3 - i4);
                } else {
                    window.setLayout(i2 - i4, (int) Math.ceil(r3 / 0.98859316f));
                }
            }
            this.f2313c.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.china.activity.ApkConfirmDialogActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C1360x.m4268a(false);
        Dialog dialog = this.f2313c;
        if (dialog != null) {
            dialog.dismiss();
            this.f2313c = null;
        }
        f2311a = null;
        f2312b = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        C1360x.m4268a(true);
    }
}
