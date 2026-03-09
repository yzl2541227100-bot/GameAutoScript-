package com.anythink.expressad.widget.p182a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1888v;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;

/* JADX INFO: renamed from: com.anythink.expressad.widget.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC2344a extends Dialog {

    /* JADX INFO: renamed from: a */
    private static final String f14724a = "ATAlertDialog";

    /* JADX INFO: renamed from: b */
    private InterfaceC2345b f14725b;

    /* JADX INFO: renamed from: c */
    private TextView f14726c;

    /* JADX INFO: renamed from: d */
    private TextView f14727d;

    /* JADX INFO: renamed from: e */
    private Button f14728e;

    /* JADX INFO: renamed from: f */
    private Button f14729f;

    public DialogC2344a(Context context, final InterfaceC2345b interfaceC2345b) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(C1875i.m9684a(context, "anythink_cm_alertview", "layout"), (ViewGroup) null);
        this.f14725b = interfaceC2345b;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f14726c = (TextView) viewInflate.findViewById(C1875i.m9684a(context, "anythink_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                e.getMessage();
            }
            try {
                this.f14727d = (TextView) viewInflate.findViewById(C1875i.m9684a(context, "anythink_video_common_alertview_contentview", "id"));
                this.f14728e = (Button) viewInflate.findViewById(C1875i.m9684a(context, "anythink_video_common_alertview_confirm_button", "id"));
                this.f14729f = (Button) viewInflate.findViewById(C1875i.m9684a(context, "anythink_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        Button button = this.f14729f;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.widget.a.a.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC2345b interfaceC2345b2 = interfaceC2345b;
                    if (interfaceC2345b2 != null) {
                        interfaceC2345b2.mo9362a();
                    }
                    DialogC2344a.this.cancel();
                    DialogC2344a.this.m12127a();
                }
            });
        }
        Button button2 = this.f14728e;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.widget.a.a.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC2345b interfaceC2345b2 = interfaceC2345b;
                    if (interfaceC2345b2 != null) {
                        interfaceC2345b2.mo9363b();
                    }
                    DialogC2344a.this.cancel();
                    DialogC2344a.this.m12127a();
                }
            });
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    /* JADX INFO: renamed from: a */
    private void m12117a(int i) {
        Context contextM2148f = C1175n.m2059a().m2148f();
        String string = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", C1875i.f11532g));
        String string2 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_tips", C1875i.f11532g));
        String string3 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_close", C1875i.f11532g));
        String string4 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_continue", C1875i.f11532g));
        String string5 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close", C1875i.f11532g));
        String string6 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_cancel", C1875i.f11532g));
        String string7 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_continue", C1875i.f11532g));
        if (i != C1801a.f11129cr) {
            string = string2;
        }
        m12119a(string);
        if (i != C1801a.f11129cr) {
            string3 = string4;
        }
        m12121b(string3);
        if (i != C1801a.f11129cr) {
            string5 = string6;
        }
        m12123c(string5);
        m12125d(string7);
    }

    /* JADX INFO: renamed from: a */
    private static void m12118a(Window window) {
        View decorView;
        int i;
        if (window != null) {
            window.setFlags(1024, 1024);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 19) {
                window.addFlags(67108864);
                decorView = window.getDecorView();
                i = 4098;
            } else {
                decorView = window.getDecorView();
                i = 2;
            }
            decorView.setSystemUiVisibility(i);
            if (i2 >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m12119a(String str) {
        TextView textView = this.f14726c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m12120a(String str, String str2, String str3, String str4) {
        m12119a(str);
        m12121b(str2);
        m12123c(str3);
        m12125d(str4);
    }

    /* JADX INFO: renamed from: b */
    private void m12121b(String str) {
        TextView textView = this.f14727d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m12122c() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        String string = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", C1875i.f11532g));
        String string2 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", C1875i.f11532g));
        String string3 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close", C1875i.f11532g));
        String string4 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_cancel_close", C1875i.f11532g));
        m12119a(string);
        m12121b(string2);
        m12123c(string3);
        m12125d(string4);
    }

    /* JADX INFO: renamed from: c */
    private void m12123c(String str) {
        Button button = this.f14728e;
        if (button != null) {
            button.setText(str);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m12124d() {
        C1486b.m6002a();
        C1773a.m8548c().m8558f();
        C1483a c1483aM6007b = C1486b.m6007b();
        if (c1483aM6007b != null) {
            m12120a(c1483aM6007b.m5929C(), c1483aM6007b.m5930D(), c1483aM6007b.m5931E(), c1483aM6007b.m5932F());
            return;
        }
        Context contextM2148f = C1175n.m2059a().m2148f();
        String string = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", C1875i.f11532g));
        String string2 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", C1875i.f11532g));
        String string3 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close", C1875i.f11532g));
        String string4 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_continue_to_play", C1875i.f11532g));
        m12119a(string);
        m12121b(string2);
        m12123c(string3);
        m12125d(string4);
    }

    /* JADX INFO: renamed from: d */
    private void m12125d(String str) {
        Button button = this.f14729f;
        if (button != null) {
            button.setText(str);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m12126e() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        String string = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", C1875i.f11532g));
        String string2 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", C1875i.f11532g));
        String string3 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close", C1875i.f11532g));
        String string4 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_continue_to_play", C1875i.f11532g));
        m12119a(string);
        m12121b(string2);
        m12123c(string3);
        m12125d(string4);
    }

    /* JADX INFO: renamed from: a */
    public final void m12127a() {
        if (this.f14725b != null) {
            this.f14725b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12128a(int i, String str) {
        try {
            String string = C1888v.m9864b(getContext(), "Anythink_ConfirmTitle".concat(String.valueOf(str)), "").toString();
            String string2 = C1888v.m9864b(getContext(), "Anythink_ConfirmContent".concat(String.valueOf(str)), "").toString();
            String string3 = C1888v.m9864b(getContext(), "Anythink_CancelText".concat(String.valueOf(str)), "").toString();
            String string4 = C1888v.m9864b(getContext(), "Anythink_ConfirmText".concat(String.valueOf(str)), "").toString();
            if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string4)) {
                m12120a(string, string2, string3, string4);
                return;
            }
            Context contextM2148f = C1175n.m2059a().m2148f();
            String string5 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", C1875i.f11532g));
            String string6 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_tips", C1875i.f11532g));
            String string7 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_close", C1875i.f11532g));
            String string8 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn_continue", C1875i.f11532g));
            String string9 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close", C1875i.f11532g));
            String string10 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_cancel", C1875i.f11532g));
            String string11 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_continue", C1875i.f11532g));
            if (i != C1801a.f11129cr) {
                string5 = string6;
            }
            m12119a(string5);
            if (i != C1801a.f11129cr) {
                string7 = string8;
            }
            m12121b(string7);
            if (i != C1801a.f11129cr) {
                string9 = string10;
            }
            m12123c(string9);
            m12125d(string11);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12129b() {
        try {
            Context contextM2148f = C1175n.m2059a().m2148f();
            String string = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_warn", C1875i.f11532g));
            String string2 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close_desc", C1875i.f11532g));
            String string3 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_confim_close", C1875i.f11532g));
            String string4 = contextM2148f.getString(C1875i.m9684a(getContext(), "anythink_cm_dialog_alert_cancel_close", C1875i.f11532g));
            m12119a(string);
            m12121b(string2);
            m12123c(string3);
            m12125d(string4);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            Window window = getWindow();
            if (window != null) {
                window.setFlags(1024, 1024);
                int i = Build.VERSION.SDK_INT;
                if (i >= 19) {
                    window.addFlags(67108864);
                    window.getDecorView().setSystemUiVisibility(4098);
                } else {
                    window.getDecorView().setSystemUiVisibility(2);
                }
                if (i >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(-1, -1);
                window.setGravity(17);
            }
            getWindow().clearFlags(8);
        } catch (Exception e) {
            e.getMessage();
            super.show();
        }
    }
}
