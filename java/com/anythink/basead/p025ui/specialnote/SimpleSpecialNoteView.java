package com.anythink.basead.p025ui.specialnote;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class SimpleSpecialNoteView extends BaseSpecialNoteView {
    public SimpleSpecialNoteView(Context context) {
        super(context);
    }

    public SimpleSpecialNoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView
    /* JADX INFO: renamed from: a */
    public final void mo1318a() {
        this.f2222n = getContext().getString(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_special_note_delay_click_simple", C1875i.f11532g));
    }

    @Override // com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView
    /* JADX INFO: renamed from: b */
    public final void mo1319b() {
        setOrientation(0);
        int iM4153a = C1345i.m4153a(getContext(), 5.0f);
        setPadding(iM4153a, 0, iM4153a, 0);
        setGravity(16);
        setBackgroundColor(Color.parseColor("#80000000"));
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_special_note_simple", "layout"), (ViewGroup) this, true);
        this.f2220l = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_special_countdown_text", "id"));
        this.f2221m = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_special_cancel_text", "id"));
    }

    @Override // com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView
    /* JADX INFO: renamed from: c */
    public final void mo1320c() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, getMeasuredHeight(), 0.0f);
        translateAnimation.setDuration(500L);
        startAnimation(translateAnimation);
        super.mo1320c();
    }

    @Override // com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView
    /* JADX INFO: renamed from: d */
    public final boolean mo1321d() {
        return true;
    }
}
