package com.anythink.basead.p025ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class RewardExitConfirmDialogActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public static final int f1639a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f1640b = 2;

    /* JADX INFO: renamed from: c */
    private static Runnable f1641c = null;

    /* JADX INFO: renamed from: d */
    private static String f1642d = null;

    /* JADX INFO: renamed from: e */
    private static int f1643e = 1;

    /* JADX INFO: renamed from: f */
    private Dialog f1644f;

    /* JADX INFO: renamed from: com.anythink.basead.ui.RewardExitConfirmDialogActivity$1 */
    public class ViewOnClickListenerC09171 implements View.OnClickListener {
        public ViewOnClickListenerC09171() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RewardExitConfirmDialogActivity.this.finish();
            if (RewardExitConfirmDialogActivity.f1641c != null) {
                RewardExitConfirmDialogActivity.f1641c.run();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.RewardExitConfirmDialogActivity$2 */
    public class ViewOnClickListenerC09182 implements View.OnClickListener {
        public ViewOnClickListenerC09182() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RewardExitConfirmDialogActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1013a(Context context, String str, Runnable runnable, int i) {
        f1642d = str;
        f1641c = runnable;
        f1643e = i;
        Intent intent = new Intent(context, (Class<?>) RewardExitConfirmDialogActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: b */
    private void m1014b() {
        Resources resources;
        int iM4154a;
        try {
            View viewInflate = LayoutInflater.from(this).inflate(C1345i.m4154a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "myoffer_confirm_continue", "id"));
            textView2.setText(getResources().getString(C1345i.m4154a(this, "myoffer_reward_exit_confirm_give_up", C1875i.f11532g)));
            if (f1643e != 2) {
                textView.setText(getResources().getString(C1345i.m4154a(this, "myoffer_reward_exit_confirm_msg", C1875i.f11532g), f1642d));
                resources = getResources();
                iM4154a = C1345i.m4154a(this, "myoffer_reward_exit_confirm_continue", C1875i.f11532g);
            } else {
                textView.setText(getResources().getString(C1345i.m4154a(this, "myoffer_anim_reward_exit_confirm_msg", C1875i.f11532g), f1642d));
                resources = getResources();
                iM4154a = C1345i.m4154a(this, "myoffer_anim_reward_exit_confirm_continue", C1875i.f11532g);
            }
            textView3.setText(resources.getString(iM4154a));
            textView2.setOnClickListener(new ViewOnClickListenerC09171());
            textView3.setOnClickListener(new ViewOnClickListenerC09182());
            Dialog dialog = new Dialog(this, C1345i.m4154a(this, "style_full_screen_translucent_dialog", C1875i.f11530e));
            this.f1644f = dialog;
            dialog.setContentView(viewInflate);
            this.f1644f.setCancelable(false);
            this.f1644f.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Resources resources;
        int iM4154a;
        super.onCreate(bundle);
        try {
            View viewInflate = LayoutInflater.from(this).inflate(C1345i.m4154a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) viewInflate.findViewById(C1345i.m4154a(this, "myoffer_confirm_continue", "id"));
            textView2.setText(getResources().getString(C1345i.m4154a(this, "myoffer_reward_exit_confirm_give_up", C1875i.f11532g)));
            if (f1643e != 2) {
                textView.setText(getResources().getString(C1345i.m4154a(this, "myoffer_reward_exit_confirm_msg", C1875i.f11532g), f1642d));
                resources = getResources();
                iM4154a = C1345i.m4154a(this, "myoffer_reward_exit_confirm_continue", C1875i.f11532g);
            } else {
                textView.setText(getResources().getString(C1345i.m4154a(this, "myoffer_anim_reward_exit_confirm_msg", C1875i.f11532g), f1642d));
                resources = getResources();
                iM4154a = C1345i.m4154a(this, "myoffer_anim_reward_exit_confirm_continue", C1875i.f11532g);
            }
            textView3.setText(resources.getString(iM4154a));
            textView2.setOnClickListener(new ViewOnClickListenerC09171());
            textView3.setOnClickListener(new ViewOnClickListenerC09182());
            Dialog dialog = new Dialog(this, C1345i.m4154a(this, "style_full_screen_translucent_dialog", C1875i.f11530e));
            this.f1644f = dialog;
            dialog.setContentView(viewInflate);
            this.f1644f.setCancelable(false);
            this.f1644f.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Dialog dialog = this.f1644f;
        if (dialog != null) {
            dialog.dismiss();
            this.f1644f = null;
        }
        f1641c = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
