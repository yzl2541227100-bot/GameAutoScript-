package com.anythink.expressad.widget.p182a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;

/* JADX INFO: renamed from: com.anythink.expressad.widget.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC2346c extends Dialog {

    /* JADX INFO: renamed from: a */
    private static final String f14734a = "ATFeedBackDialog";

    /* JADX INFO: renamed from: b */
    private InterfaceC2345b f14735b;

    /* JADX INFO: renamed from: c */
    private TextView f14736c;

    /* JADX INFO: renamed from: d */
    private LinearLayout f14737d;

    /* JADX INFO: renamed from: e */
    private Button f14738e;

    /* JADX INFO: renamed from: f */
    private Button f14739f;

    /* JADX INFO: renamed from: g */
    private int f14740g;

    /* JADX INFO: renamed from: h */
    private int f14741h;

    /* JADX INFO: renamed from: com.anythink.expressad.widget.a.c$1 */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (DialogC2346c.this.f14735b != null) {
                DialogC2346c.this.f14735b.mo9362a();
            }
            DialogC2346c.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.widget.a.c$2 */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (DialogC2346c.this.f14735b != null) {
                DialogC2346c.this.f14735b.mo9363b();
            }
            DialogC2346c.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.widget.a.c$3 */
    public class AnonymousClass3 implements DialogInterface.OnCancelListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            if (DialogC2346c.this.f14735b != null) {
                DialogC2346c.this.f14735b.mo9363b();
            }
        }
    }

    public DialogC2346c(Context context, InterfaceC2345b interfaceC2345b) {
        WindowManager.LayoutParams attributes;
        int i;
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(C1875i.m9684a(context, "anythink_cm_feedbackview", "layout"), (ViewGroup) null);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (getContext().getResources().getConfiguration().orientation == 1) {
            this.f14741h = displayMetrics.widthPixels;
            this.f14740g = displayMetrics.heightPixels;
            attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = (int) (this.f14740g * 0.8f);
            i = 80;
        } else {
            this.f14741h = displayMetrics.heightPixels;
            this.f14740g = displayMetrics.widthPixels;
            attributes = getWindow().getAttributes();
            attributes.width = (int) (this.f14740g * 0.5f);
            attributes.height = -1;
            i = 17;
        }
        attributes.gravity = i;
        getWindow().setAttributes(attributes);
        this.f14735b = interfaceC2345b;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f14736c = (TextView) viewInflate.findViewById(C1875i.m9684a(context, "anythink_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                e.getMessage();
            }
            try {
                this.f14737d = (LinearLayout) viewInflate.findViewById(C1875i.m9684a(context, "anythink_video_common_alertview_contentview", "id"));
                this.f14738e = (Button) viewInflate.findViewById(C1875i.m9684a(context, "anythink_video_common_alertview_confirm_button", "id"));
                this.f14739f = (Button) viewInflate.findViewById(C1875i.m9684a(context, "anythink_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        Button button = this.f14739f;
        if (button != null) {
            button.setOnClickListener(new AnonymousClass1());
        }
        Button button2 = this.f14738e;
        if (button2 != null) {
            button2.setOnClickListener(new AnonymousClass2());
        }
        setOnCancelListener(new AnonymousClass3());
    }

    /* JADX INFO: renamed from: a */
    private void m12131a() {
        Button button = this.f14739f;
        if (button != null) {
            button.setOnClickListener(new AnonymousClass1());
        }
        Button button2 = this.f14738e;
        if (button2 != null) {
            button2.setOnClickListener(new AnonymousClass2());
        }
        setOnCancelListener(new AnonymousClass3());
    }

    /* JADX INFO: renamed from: a */
    private static void m12132a(Window window) {
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
    private void m12133a(String str, ViewGroup viewGroup, String str2, String str3) {
        m12140a(str);
        m12138a(viewGroup);
        m12142b(str2);
        m12143c(str3);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12134a(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    /* JADX INFO: renamed from: b */
    private void m12135b() {
        if (this.f14735b != null) {
            this.f14735b = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private InterfaceC2345b m12136c() {
        return this.f14735b;
    }

    /* JADX INFO: renamed from: d */
    private void m12137d() {
        WindowManager.LayoutParams attributes;
        int i;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (getContext().getResources().getConfiguration().orientation == 1) {
            this.f14741h = displayMetrics.widthPixels;
            this.f14740g = displayMetrics.heightPixels;
            attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = (int) (this.f14740g * 0.8f);
            i = 80;
        } else {
            this.f14741h = displayMetrics.heightPixels;
            this.f14740g = displayMetrics.widthPixels;
            attributes = getWindow().getAttributes();
            attributes.width = (int) (this.f14740g * 0.5f);
            attributes.height = -1;
            i = 17;
        }
        attributes.gravity = i;
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: renamed from: a */
    public final void m12138a(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f14737d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 38.0f);
            layoutParams.rightMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 38.0f);
            layoutParams.topMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 20.0f);
            layoutParams.bottomMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 24.0f);
            this.f14737d.addView(viewGroup, layoutParams);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12139a(InterfaceC2345b interfaceC2345b) {
        this.f14735b = interfaceC2345b;
    }

    /* JADX INFO: renamed from: a */
    public final void m12140a(String str) {
        TextView textView = this.f14736c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12141a(boolean z) {
        Button button = this.f14739f;
        if (button != null) {
            button.setClickable(z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12142b(String str) {
        Button button = this.f14738e;
        if (button != null) {
            button.setText(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12143c(String str) {
        Button button = this.f14739f;
        if (button != null) {
            button.setText(str);
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
