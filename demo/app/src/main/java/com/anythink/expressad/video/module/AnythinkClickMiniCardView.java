package com.anythink.expressad.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import androidx.multidex.MultiDexExtractor;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.videocommon.p178b.C2324i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkClickMiniCardView extends AnythinkH5EndCardView {

    /* JADX INFO: renamed from: A */
    private static final float f13507A = 0.7f;

    /* JADX INFO: renamed from: B */
    private boolean f13508B;

    public AnythinkClickMiniCardView(Context context) {
        super(context);
        this.f13508B = false;
    }

    public AnythinkClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13508B = false;
    }

    @RequiresApi(api = 11)
    /* JADX INFO: renamed from: a */
    private void m11328a(View view) {
        int iM9847f = C1886t.m9847f(this.f13477a);
        int iM9845e = C1886t.m9845e(this.f13477a);
        int i = (int) ((iM9847f * f13507A) + 0.5f);
        int i2 = (int) ((iM9845e * f13507A) + 0.5f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    /* JADX INFO: renamed from: a */
    public final String mo11313a() {
        C1781c c1781c = this.f13478b;
        if (c1781c == null) {
            return null;
        }
        C1781c.c cVarM8805M = c1781c.m8805M();
        String strM8956d = cVarM8805M != null ? cVarM8805M.m8956d() : null;
        if (TextUtils.isEmpty(strM8956d) || !strM8956d.contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
            return strM8956d;
        }
        String strM11883c = C2324i.m11867a().m11883c(strM8956d);
        return !TextUtils.isEmpty(strM11883c) ? strM11883c : strM8956d;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    /* JADX INFO: renamed from: b */
    public final RelativeLayout.LayoutParams mo11314b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    @RequiresApi(api = 11)
    /* JADX INFO: renamed from: e */
    public final void mo11329e() {
        super.mo11329e();
        if (this.f13482f) {
            setBackgroundResource(findColor("anythink_reward_minicard_bg"));
            m11328a(this.f13581p);
            setClickable(true);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.module.AnythinkBaseView
    @RequiresApi(api = 11)
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f13482f) {
            m11328a(this.f13581p);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
        super.preLoadData(c2309b);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i, int i2) {
        if (Build.VERSION.SDK_INT < 11) {
            return;
        }
        View viewFindViewById = ((Activity) this.f13477a).getWindow().findViewById(R.id.content);
        int width = viewFindViewById.getWidth();
        int height = viewFindViewById.getHeight();
        if (i <= 0 || i2 <= 0 || i > width || i2 > height) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f13581p.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f13581p.setLayoutParams(layoutParams);
    }

    public void setAnythinkClickMiniCardViewClickable(boolean z) {
        setClickable(z);
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i, int i2, int i3, int i4) {
        this.f13508B = true;
        resizeMiniCard(i3, i4);
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C1886t.m9834b(getContext(), i));
            gradientDrawable.setColor(-1);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 16) {
                this.f13584s.setBackground(gradientDrawable);
            } else {
                this.f13584s.setBackgroundDrawable(gradientDrawable);
            }
            if (i2 >= 21) {
                this.f13584s.setClipToOutline(true);
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.InterfaceC2311h
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f13584s;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkClickMiniCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    String string = "";
                    try {
                        try {
                            int[] iArr = new int[2];
                            AnythinkClickMiniCardView.this.f13584s.getLocationOnScreen(iArr);
                            StringBuilder sb = new StringBuilder("coordinate:");
                            sb.append(iArr[0]);
                            sb.append("--");
                            sb.append(iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", C1886t.m9821a(C1175n.m2059a().m2148f(), iArr[0]));
                            jSONObject.put("startY", C1886t.m9821a(C1175n.m2059a().m2148f(), iArr[1]));
                            string = jSONObject.toString();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        String strEncodeToString = Base64.encodeToString(string.toString().getBytes(), 2);
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkClickMiniCardView.this.f13584s, "webviewshow", strEncodeToString);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
