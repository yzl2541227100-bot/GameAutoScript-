package com.anythink.basead.p025ui.specialnote;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class ScreenSpecialNoteView extends BaseSpecialNoteView {
    public ScreenSpecialNoteView(Context context) {
        super(context);
    }

    public ScreenSpecialNoteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView
    /* JADX INFO: renamed from: b */
    public final void mo1319b() {
        setOrientation(0);
        setPadding(C1345i.m4153a(getContext(), 10.0f), 0, C1345i.m4153a(getContext(), 12.0f), 0);
        setGravity(16);
        setBackgroundResource(C1345i.m4154a(C1175n.m2059a().m2148f(), "myoffer_bg_shake_border_thumb", C1875i.f11528c));
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_special_note", "layout"), (ViewGroup) this, true);
        this.f2220l = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_special_countdown_text", "id"));
        this.f2221m = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_special_cancel_text", "id"));
    }

    @Override // com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView
    /* JADX INFO: renamed from: c */
    public final void mo1320c() {
        TranslateAnimation translateAnimation = new TranslateAnimation(getMeasuredWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(500L);
        startAnimation(translateAnimation);
        super.mo1320c();
    }

    @Override // com.anythink.basead.p025ui.specialnote.BaseSpecialNoteView
    /* JADX INFO: renamed from: d */
    public final boolean mo1321d() {
        return false;
    }
}
