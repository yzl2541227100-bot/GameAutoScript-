package com.anythink.expressad.foundation.p118f.p119a;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.FeedbackRadioGroup;
import com.anythink.expressad.widget.p182a.DialogC2346c;
import com.anythink.expressad.widget.p182a.InterfaceC2345b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.f.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1799a {

    /* JADX INFO: renamed from: n */
    private static int f10930n = -1;

    /* JADX INFO: renamed from: s */
    private static String f10931s;

    /* JADX INFO: renamed from: a */
    private String f10932a;

    /* JADX INFO: renamed from: b */
    private C1781c f10933b;

    /* JADX INFO: renamed from: c */
    private FeedBackButton f10934c;

    /* JADX INFO: renamed from: d */
    private int f10935d;

    /* JADX INFO: renamed from: e */
    private int f10936e;

    /* JADX INFO: renamed from: j */
    private String f10941j;

    /* JADX INFO: renamed from: k */
    private String f10942k;

    /* JADX INFO: renamed from: p */
    private DialogC2346c f10946p;

    /* JADX INFO: renamed from: q */
    private List<a> f10947q;

    /* JADX INFO: renamed from: f */
    private int f10937f = -1;

    /* JADX INFO: renamed from: g */
    private int f10938g = -1;

    /* JADX INFO: renamed from: h */
    private int f10939h = -1;

    /* JADX INFO: renamed from: i */
    private int f10940i = -1;

    /* JADX INFO: renamed from: l */
    private float f10943l = 1.0f;

    /* JADX INFO: renamed from: m */
    private int f10944m = C1886t.m9834b(C1175n.m2059a().m2148f(), 20.0f);

    /* JADX INFO: renamed from: o */
    private int f10945o = f10930n;

    /* JADX INFO: renamed from: r */
    private InterfaceC2345b f10948r = new InterfaceC2345b() { // from class: com.anythink.expressad.foundation.f.a.a.1
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: a */
        public final void mo9362a() {
            C1799a.m9332a(C1799a.this);
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: b */
        public final void mo9363b() {
            C1799a.m9336b(C1799a.this);
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: c */
        public final void mo9364c() {
            C1799a.m9337c(C1799a.this);
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.f.a.a$1 */
    public class AnonymousClass1 implements InterfaceC2345b {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: a */
        public final void mo9362a() {
            C1799a.m9332a(C1799a.this);
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: b */
        public final void mo9363b() {
            C1799a.m9336b(C1799a.this);
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: c */
        public final void mo9364c() {
            C1799a.m9337c(C1799a.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.f.a.a$2 */
    public class AnonymousClass2 implements InterfaceC2345b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: a */
        public final void mo9362a() {
            C1799a.m9332a(C1799a.this);
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: b */
        public final void mo9363b() {
            C1799a.m9336b(C1799a.this);
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: c */
        public final void mo9364c() {
            C1799a.m9337c(C1799a.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.f.a.a$3 */
    public class AnonymousClass3 implements CompoundButton.OnCheckedChangeListener {
        public AnonymousClass3() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                String unused = C1799a.f10931s = (String) compoundButton.getText();
            }
            if (C1799a.this.f10946p != null) {
                C1799a.this.f10946p.m12141a(!TextUtils.isEmpty(C1799a.f10931s));
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.f.a.a$4 */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1799a.this.m9350a();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.f.a.a$5 */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1799a.this.m9350a();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.f.a.a$a */
    public static class a implements InterfaceC2345b {

        /* JADX INFO: renamed from: a */
        private InterfaceC1798a f10954a;

        /* JADX INFO: renamed from: b */
        private String f10955b;

        public a(String str, InterfaceC1798a interfaceC1798a) {
            this.f10954a = interfaceC1798a;
            this.f10955b = str;
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: a */
        public final void mo9362a() {
            C1800b.f10958c = false;
            InterfaceC1798a interfaceC1798a = this.f10954a;
            if (interfaceC1798a != null) {
                String unused = C1799a.f10931s;
                interfaceC1798a.mo5505c();
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m9365a(boolean z) {
            C1800b.f10958c = true;
            InterfaceC1798a interfaceC1798a = this.f10954a;
            if (interfaceC1798a == null || !z) {
                return;
            }
            interfaceC1798a.mo5503a();
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: b */
        public final void mo9363b() {
            C1800b.f10958c = false;
            InterfaceC1798a interfaceC1798a = this.f10954a;
            if (interfaceC1798a != null) {
                interfaceC1798a.mo5504b();
            }
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: c */
        public final void mo9364c() {
        }
    }

    public C1799a(String str) {
        this.f10947q = new ArrayList();
        this.f10932a = str;
        if (this.f10947q == null) {
            this.f10947q = new ArrayList();
        }
        m9340g();
        m9347n();
        m9341h();
    }

    /* JADX INFO: renamed from: a */
    private static FeedbackRadioGroup m9329a(C1483a.b bVar) {
        JSONArray jSONArrayM6001d = bVar.m6001d();
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (jSONArrayM6001d == null || jSONArrayM6001d.length() <= 0 || contextM2148f == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextM2148f);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    /* JADX INFO: renamed from: a */
    private void m9331a(RadioButton radioButton) {
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.anythink.expressad.foundation.f.a.a.3
            public AnonymousClass3() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    String unused = C1799a.f10931s = (String) compoundButton.getText();
                }
                if (C1799a.this.f10946p != null) {
                    C1799a.this.f10946p.m12141a(!TextUtils.isEmpty(C1799a.f10931s));
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9332a(C1799a c1799a) {
        List<a> list = c1799a.f10947q;
        if (list != null) {
            for (a aVar : list) {
                if (aVar != null) {
                    aVar.mo9362a();
                }
            }
        }
        f10931s = "";
    }

    /* JADX INFO: renamed from: a */
    private void m9333a(FeedbackRadioGroup feedbackRadioGroup, C1483a.b bVar) {
        ColorStateList colorStateList;
        JSONArray jSONArrayM6001d = bVar.m6001d();
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (jSONArrayM6001d == null || jSONArrayM6001d.length() <= 0 || contextM2148f == null) {
            return;
        }
        int iM9684a = C1875i.m9684a(contextM2148f, "anythink_cm_feedback_choice_btn_bg", C1875i.f11528c);
        Resources resourcesM9685a = C1875i.m9685a(contextM2148f);
        int iM9684a2 = C1875i.m9684a(contextM2148f, "anythink_cm_feedback_rb_text_color_color_list", C1875i.f11529d);
        if (resourcesM9685a != null) {
            try {
                colorStateList = resourcesM9685a.getColorStateList(iM9684a2);
            } catch (Exception e) {
                e.printStackTrace();
                colorStateList = null;
            }
        } else {
            colorStateList = null;
        }
        int iM9834b = C1886t.m9834b(contextM2148f, 14.0f);
        int iM9834b2 = C1886t.m9834b(contextM2148f, 7.0f);
        int iM9834b3 = C1886t.m9834b(contextM2148f, 6.0f);
        for (int i = 0; i < jSONArrayM6001d.length(); i++) {
            String strOptString = jSONArrayM6001d.optString(i);
            RadioButton radioButton = new RadioButton(contextM2148f);
            radioButton.setButtonDrawable((Drawable) null);
            radioButton.setBackgroundResource(iM9684a);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setPadding(iM9834b, iM9834b2, iM9834b, iM9834b2);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
            int i2 = iM9834b3 / 4;
            layoutParams.setMargins(iM9834b3, i2, iM9834b3, i2);
            m9331a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9334a(boolean z) {
        List<a> list = this.f10947q;
        if (list != null) {
            for (a aVar : list) {
                if (aVar != null) {
                    aVar.m9365a(z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m9335b(a aVar) {
        List<a> list = this.f10947q;
        if (list != null) {
            list.remove(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9336b(C1799a c1799a) {
        List<a> list = c1799a.f10947q;
        if (list != null) {
            for (a aVar : list) {
                if (aVar != null) {
                    aVar.mo9363b();
                }
            }
        }
        f10931s = "";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9337c(C1799a c1799a) {
        List<a> list = c1799a.f10947q;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m9340g() {
        if (this.f10948r == null) {
            this.f10948r = new InterfaceC2345b() { // from class: com.anythink.expressad.foundation.f.a.a.2
                public AnonymousClass2() {
                }

                @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
                /* JADX INFO: renamed from: a */
                public final void mo9362a() {
                    C1799a.m9332a(C1799a.this);
                }

                @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
                /* JADX INFO: renamed from: b */
                public final void mo9363b() {
                    C1799a.m9336b(C1799a.this);
                }

                @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
                /* JADX INFO: renamed from: c */
                public final void mo9364c() {
                    C1799a.m9337c(C1799a.this);
                }
            };
        }
    }

    /* JADX INFO: renamed from: h */
    private void m9341h() {
        try {
            C1800b.m9367a();
            if (C1800b.m9366a(C1175n.m2059a().m2148f()) != null) {
                C1486b.m6002a();
                C1773a.m8548c().m8558f();
                C1483a c1483aM6007b = C1486b.m6007b();
                if (c1483aM6007b == null) {
                    C1486b.m6002a();
                    c1483aM6007b = C1486b.m6010c();
                }
                C1483a.b bVarM5938L = c1483aM6007b.m5938L();
                if (bVarM5938L == null) {
                    return;
                }
                m9340g();
                C1800b.m9367a();
                this.f10946p = new DialogC2346c(C1800b.m9366a(C1175n.m2059a().m2148f()), this.f10948r);
                FeedbackRadioGroup feedbackRadioGroupM9329a = m9329a(bVarM5938L);
                this.f10946p.m12143c(bVarM5938L.m6000c());
                this.f10946p.m12142b(bVarM5938L.m5999b());
                this.f10946p.m12140a(bVarM5938L.m5998a());
                this.f10946p.m12138a(feedbackRadioGroupM9329a);
                this.f10946p.m12141a(!TextUtils.isEmpty(f10931s));
                m9333a(feedbackRadioGroupM9329a, bVarM5938L);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m9342i() {
        List<a> list = this.f10947q;
        if (list != null) {
            for (a aVar : list) {
                if (aVar != null) {
                    aVar.mo9363b();
                }
            }
        }
        f10931s = "";
    }

    /* JADX INFO: renamed from: j */
    private void m9343j() {
        List<a> list = this.f10947q;
        if (list != null) {
            for (a aVar : list) {
                if (aVar != null) {
                    aVar.mo9362a();
                }
            }
        }
        f10931s = "";
    }

    /* JADX INFO: renamed from: k */
    private void m9344k() {
        List<a> list = this.f10947q;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private String m9345l() {
        return this.f10932a;
    }

    /* JADX INFO: renamed from: m */
    private void m9346m() {
        FeedBackButton feedBackButton = this.f10934c;
        if (feedBackButton != null) {
            int i = this.f10937f;
            if (i >= 0) {
                feedBackButton.setX(i);
            }
            int i2 = this.f10938g;
            if (i2 >= 0) {
                this.f10934c.setY(i2);
            }
            float f = this.f10943l;
            if (f >= 0.0f) {
                this.f10934c.setAlpha(f);
                this.f10934c.setEnabled(this.f10943l != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f10934c.getLayoutParams();
            int i3 = this.f10939h;
            if (i3 > 0) {
                this.f10934c.setWidth(i3);
                if (layoutParams != null) {
                    layoutParams.width = this.f10939h;
                }
            }
            int i4 = this.f10940i;
            if (i4 > 0) {
                this.f10934c.setHeight(i4);
                if (layoutParams != null) {
                    layoutParams.height = this.f10940i;
                }
            }
            if (layoutParams != null) {
                this.f10934c.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f10941j)) {
                    this.f10934c.setTextColor(Color.parseColor(this.f10941j));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i5 = this.f10944m;
            if (i5 > 0) {
                gradientDrawable.setCornerRadius(i5);
            }
            gradientDrawable.setColor(Color.parseColor(!TextUtils.isEmpty(this.f10942k) ? this.f10942k : FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            try {
                this.f10934c.setBackgroundDrawable(gradientDrawable);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private void m9347n() {
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (contextM2148f != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextM2148f);
                this.f10934c = feedBackButton;
                int i = 8;
                if (this.f10945o != 8) {
                    i = 0;
                }
                feedBackButton.setVisibility(i);
                this.f10934c.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.4
                    public AnonymousClass4() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1799a.this.m9350a();
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private int m9348o() {
        return this.f10935d;
    }

    /* JADX INFO: renamed from: p */
    private int m9349p() {
        return this.f10936e;
    }

    /* JADX INFO: renamed from: a */
    public final void m9350a() {
        C1800b.m9367a();
        Activity activityM9366a = C1800b.m9366a(C1175n.m2059a().m2148f());
        DialogC2346c dialogC2346c = this.f10946p;
        if (dialogC2346c == null || dialogC2346c.getContext() != activityM9366a) {
            m9341h();
        }
        Context contextM2148f = C1175n.m2059a().m2148f();
        FeedBackButton feedBackButton = this.f10934c;
        if (feedBackButton != null) {
            contextM2148f = feedBackButton.getContext();
        }
        C1800b.m9367a();
        boolean zM9371a = C1800b.m9371a(contextM2148f, this.f10946p);
        List<a> list = this.f10947q;
        if (list != null) {
            for (a aVar : list) {
                if (aVar != null) {
                    aVar.m9365a(zM9371a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9351a(int i) {
        this.f10945o = i;
        FeedBackButton feedBackButton = this.f10934c;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9352a(int i, int i2, int i3, int i4, int i5, float f, String str, String str2) {
        this.f10937f = i;
        this.f10938g = i2;
        this.f10939h = i3;
        this.f10940i = i4;
        this.f10941j = str;
        this.f10942k = str2;
        this.f10943l = f;
        this.f10944m = i5;
        m9346m();
    }

    /* JADX INFO: renamed from: a */
    public final void m9353a(C1781c c1781c) {
        this.f10933b = c1781c;
    }

    /* JADX INFO: renamed from: a */
    public final void m9354a(a aVar) {
        if (this.f10947q == null) {
            this.f10947q = new ArrayList();
        }
        this.f10947q.add(aVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m9355a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f10934c;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f10943l);
            feedBackButton.setEnabled(this.f10943l != 0.0f);
            feedBackButton.setVisibility(this.f10945o != 8 ? 0 : 8);
            this.f10934c = feedBackButton;
            C1781c c1781c = this.f10933b;
            if (c1781c != null && !c1781c.m8886j()) {
                m9346m();
            }
            feedBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.5
                public AnonymousClass5() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1799a.this.m9350a();
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9356b() {
        DialogC2346c dialogC2346c = this.f10946p;
        if (dialogC2346c == null || !dialogC2346c.isShowing()) {
            return;
        }
        this.f10946p.cancel();
    }

    /* JADX INFO: renamed from: b */
    public final void m9357b(int i) {
        this.f10935d = i;
    }

    /* JADX INFO: renamed from: c */
    public final FeedBackButton m9358c() {
        if (this.f10934c == null) {
            m9347n();
        }
        return this.f10934c;
    }

    /* JADX INFO: renamed from: c */
    public final void m9359c(int i) {
        this.f10936e = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m9360d() {
        FeedBackButton feedBackButton = this.f10934c;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f10934c.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f10934c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f10934c);
            }
        }
        DialogC2346c dialogC2346c = this.f10946p;
        if (dialogC2346c != null) {
            dialogC2346c.m12139a((InterfaceC2345b) null);
        }
        this.f10946p = null;
        this.f10947q = null;
        this.f10934c = null;
        this.f10948r = null;
    }

    /* JADX INFO: renamed from: e */
    public final C1781c m9361e() {
        return this.f10933b;
    }
}
