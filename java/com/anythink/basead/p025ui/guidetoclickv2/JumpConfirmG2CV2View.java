package com.anythink.basead.p025ui.guidetoclickv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class JumpConfirmG2CV2View extends BaseG2CV2View {

    /* JADX INFO: renamed from: c */
    private TextView f2101c;

    /* JADX INFO: renamed from: d */
    private LinearLayout f2102d;

    public JumpConfirmG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    /* JADX INFO: renamed from: a */
    public final void mo1223a(int i, int i2) {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_g2c_v2_jump_confirm", "layout"), this);
        setBackgroundResource(C1345i.m4154a(getContext(), "myoffer_g2c_jump_confirm_bg", C1875i.f11528c));
        this.f2102d = (LinearLayout) findViewById(C1345i.m4154a(getContext(), "myoffer_ll_jump_confirm_container", "id"));
        TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_jump_confirm_ignore", "id"));
        this.f2101c = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.JumpConfirmG2CV2View.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0989b.a aVar = JumpConfirmG2CV2View.this.f2057b;
                if (aVar != null) {
                    aVar.mo534a(11, 19);
                }
            }
        });
        if (i != 2) {
            this.f2102d.setPadding(C1345i.m4153a(getContext(), 18.0f), 0, 0, 0);
        }
    }
}
