package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class CloseHeaderView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private ViewGroup f1360a;

    /* JADX INFO: renamed from: b */
    private CloseImageView f1361b;

    /* JADX INFO: renamed from: c */
    private TextView f1362c;

    /* JADX INFO: renamed from: d */
    private String f1363d;

    /* JADX INFO: renamed from: e */
    private String f1364e;

    /* JADX INFO: renamed from: f */
    private long f1365f;

    /* JADX INFO: renamed from: g */
    private long f1366g;

    public CloseHeaderView(Context context) {
        super(context);
        this.f1363d = "";
        this.f1364e = "";
        m849a();
    }

    public CloseHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1363d = "";
        this.f1364e = "";
        m849a();
    }

    public CloseHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1363d = "";
        this.f1364e = "";
        m849a();
    }

    /* JADX INFO: renamed from: a */
    private void m849a() {
        setBackgroundColor(Color.parseColor("#66000000"));
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "myoffer_close_header_view", "layout"), this);
        this.f1360a = (ViewGroup) findViewById(C1345i.m4154a(getContext(), "myoffer_feedback_ll_nobg_id", "id"));
        this.f1361b = (CloseImageView) findViewById(C1345i.m4154a(getContext(), "myoffer_btn_close_ch_id", "id"));
        this.f1362c = (TextView) findViewById(C1345i.m4154a(getContext(), "myoffer_tv_countdown_text", "id"));
        this.f1363d = getContext().getString(C1345i.m4154a(getContext(), "myoffer_count_down_to_rewarded", C1875i.f11532g));
        this.f1364e = getContext().getString(C1345i.m4154a(getContext(), "myoffer_count_down_finish_rewarded", C1875i.f11532g));
    }

    public CloseImageView getCloseImageView() {
        return this.f1361b;
    }

    public ViewGroup getFeedbackButton() {
        return this.f1360a;
    }

    public void refresh(long j) {
        this.f1366g = j;
        if (j >= this.f1365f) {
            this.f1362c.setText(this.f1364e);
            this.f1362c.setTextColor(-1);
        } else {
            this.f1362c.setText(Html.fromHtml(String.format(this.f1363d, Integer.valueOf((int) Math.ceil((r0 - j) / 1000.0d)))));
        }
    }

    public void setDuration(long j) {
        this.f1365f = j;
    }
}
