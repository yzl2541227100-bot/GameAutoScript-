package com.octopus.p222ad.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.widget.RegionClickView;

/* JADX INFO: renamed from: com.octopus.ad.utils.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3267h {

    /* JADX INFO: renamed from: c */
    private static String f17924c;

    /* JADX INFO: renamed from: d */
    private static String f17925d;

    /* JADX INFO: renamed from: e */
    private static String f17926e;

    /* JADX INFO: renamed from: f */
    private static String f17927f;

    /* JADX INFO: renamed from: a */
    private Context f17928a;

    /* JADX INFO: renamed from: b */
    private a f17929b;

    /* JADX INFO: renamed from: com.octopus.ad.utils.h$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo14769a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    public C3267h(Context context) {
        this.f17928a = context;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    private ViewGroup.MarginLayoutParams m15040a(int i, int i2) {
        int i3;
        int i4;
        float screenHeightDp = ViewUtil.getScreenHeightDp(this.f17928a);
        TextUtils.isEmpty("50%");
        String str = "85%";
        if (TextUtils.isEmpty("85%")) {
            C3255f.m14981a("OctopusAd", "screenHeightDp = " + screenHeightDp + ",adHeightDp = " + i2);
            str = screenHeightDp > ((float) i2) ? "63" : "188";
        }
        String str2 = TextUtils.isEmpty("250") ? "325" : "250";
        String str3 = TextUtils.isEmpty("40") ? "65" : "40";
        float screenWidthDp = ViewUtil.getScreenWidthDp(this.f17928a);
        int i5 = "50%".endsWith("%") ? (Integer.parseInt("50%".substring(0, "50%".indexOf("%"))) * i) / 100 : Integer.parseInt("50%");
        if (str.endsWith("%")) {
            i3 = (Integer.parseInt(str.substring(0, str.indexOf("%"))) * i2) / 100;
        } else {
            i3 = i2 - Integer.parseInt(str);
            C3255f.m14981a("OctopusAd", "adHeightDp = " + i2 + ", centerYInt = " + i3);
        }
        int i6 = 400;
        if (str2.endsWith("%")) {
            int i7 = Integer.parseInt(str2.substring(0, str2.indexOf("%")));
            if (screenWidthDp >= 400.0f) {
                i4 = (i7 * 400) / 100;
                i6 = i4;
            } else {
                i6 = (((int) screenWidthDp) * i7) / 100;
            }
        } else {
            i4 = Integer.parseInt(str2);
            if (i4 < 400) {
                i6 = i4;
            }
        }
        int i8 = str3.endsWith("%") ? (Integer.parseInt(str3.substring(0, str3.indexOf("%"))) * i6) / 100 : Integer.parseInt(str3);
        int iDip2px = ViewUtil.dip2px(this.f17928a, i6);
        int iDip2px2 = ViewUtil.dip2px(this.f17928a, i8);
        int iDip2px3 = ViewUtil.dip2px(this.f17928a, i5);
        int iDip2px4 = ViewUtil.dip2px(this.f17928a, i3);
        C3255f.m14981a("OctopusAd", "widthInt = " + iDip2px + ",heightInt = " + iDip2px2);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iDip2px, iDip2px2);
        C3255f.m14981a("OctopusAd", "centerYInt = " + iDip2px4 + ",centerXInt = " + iDip2px3 + ",adWidthDp = " + i + ",adHeightDp = " + i2);
        marginLayoutParams.topMargin = iDip2px4 - (iDip2px2 / 2);
        marginLayoutParams.leftMargin = iDip2px3 - (iDip2px / 2);
        return marginLayoutParams;
    }

    /* JADX INFO: renamed from: a */
    public View m15050a(int i, int i2, boolean z) {
        if (this.f17928a == null) {
            return null;
        }
        C3255f.m14983c("OctopusAd", "adWidthDp = " + i + ",adHeightDp = " + i2);
        RegionClickView regionClickView = new RegionClickView(this.f17928a);
        regionClickView.setRegionalClickViewBean();
        regionClickView.setLayoutParams(m15040a(i, i2));
        if (z) {
            regionClickView.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.utils.h.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (C3267h.this.f17929b != null) {
                        C3267h.this.f17929b.mo14769a(C3267h.f17924c, C3267h.f17925d, C3267h.f17926e, C3267h.f17927f, C3267h.f17924c, C3267h.f17925d, C3267h.f17926e, C3267h.f17927f);
                    }
                }
            });
            regionClickView.setOnTouchListener(new View.OnTouchListener() { // from class: com.octopus.ad.utils.h.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    try {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        String unused = C3267h.f17924c = motionEvent.getX() + "";
                        String unused2 = C3267h.f17925d = motionEvent.getY() + "";
                        String unused3 = C3267h.f17926e = motionEvent.getRawX() + "";
                        String unused4 = C3267h.f17927f = motionEvent.getRawY() + "";
                        return false;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            });
        }
        return regionClickView;
    }

    /* JADX INFO: renamed from: a */
    public void m15051a() {
        this.f17928a = null;
        this.f17929b = null;
    }

    /* JADX INFO: renamed from: a */
    public void m15052a(a aVar) {
        this.f17929b = aVar;
    }
}
