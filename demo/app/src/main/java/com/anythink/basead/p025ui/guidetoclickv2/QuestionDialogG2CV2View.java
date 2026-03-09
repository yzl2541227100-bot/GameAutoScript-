package com.anythink.basead.p025ui.guidetoclickv2;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class QuestionDialogG2CV2View extends BaseG2CV2View {

    /* JADX INFO: renamed from: c */
    private TextView f2123c;

    /* JADX INFO: renamed from: d */
    private TextView f2124d;

    /* JADX INFO: renamed from: e */
    private String f2125e;

    /* JADX INFO: renamed from: f */
    private String f2126f;

    public QuestionDialogG2CV2View(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    /* JADX INFO: renamed from: a */
    public final void mo1223a(int i, int i2) {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_g2c_v2_question_dialog", "layout"), this);
        TextView textView = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_question_answer1", "id"));
        this.f2123c = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.QuestionDialogG2CV2View.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0989b.a aVar = QuestionDialogG2CV2View.this.f2057b;
                if (aVar != null) {
                    aVar.mo534a(11, 17);
                }
            }
        });
        TextView textView2 = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_g2c_question_answer2", "id"));
        this.f2124d = textView2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.QuestionDialogG2CV2View.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0989b.a aVar = QuestionDialogG2CV2View.this.f2057b;
                if (aVar != null) {
                    aVar.mo534a(11, 17);
                }
            }
        });
        if (!TextUtils.isEmpty(this.f2125e)) {
            this.f2123c.setText(this.f2125e);
        }
        if (!TextUtils.isEmpty(this.f2126f)) {
            this.f2124d.setText(this.f2126f);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.QuestionDialogG2CV2View.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    public void setQuestionAnswer(String str, String str2) {
        this.f2125e = str;
        this.f2126f = str2;
    }
}
