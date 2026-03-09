package com.anythink.expressad.video.dynview.p170j;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p158a.C2070b;
import com.anythink.expressad.video.dynview.p165h.C2089b;
import com.anythink.expressad.video.dynview.p166i.p168b.C2093a;
import com.anythink.expressad.video.dynview.widget.AnyThinkFramLayout;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnyThinkRelativeLayout;
import com.anythink.expressad.video.module.AnythinkClickCTAView;
import com.anythink.expressad.video.widget.SoundImageView;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.j.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2098b {

    /* JADX INFO: renamed from: a */
    private String f13309a = "anythink_top_play_bg";

    /* JADX INFO: renamed from: b */
    private String f13310b = "anythink_top_finger_bg";

    /* JADX INFO: renamed from: c */
    private String f13311c = "anythink_bottom_play_bg";

    /* JADX INFO: renamed from: d */
    private String f13312d = "anythink_bottom_finger_bg";

    /* JADX INFO: renamed from: e */
    private String f13313e = "anythink_tv_count";

    /* JADX INFO: renamed from: f */
    private String f13314f = "anythink_sound_switch";

    /* JADX INFO: renamed from: g */
    private String f13315g = "anythink_top_control";

    /* JADX INFO: renamed from: h */
    private String f13316h = "anythink_tv_title";

    /* JADX INFO: renamed from: i */
    private String f13317i = "anythink_tv_desc";

    /* JADX INFO: renamed from: j */
    private String f13318j = "anythink_tv_install";

    /* JADX INFO: renamed from: k */
    private String f13319k = "anythink_sv_starlevel";

    /* JADX INFO: renamed from: l */
    private String f13320l = "anythink_sv_heat_count_level";

    /* JADX INFO: renamed from: m */
    private String f13321m = "anythink_tv_cta";

    /* JADX INFO: renamed from: n */
    private String f13322n = "anythink_native_ec_controller";

    /* JADX INFO: renamed from: o */
    private String f13323o = "anythink_reward_shape_choice_rl";

    /* JADX INFO: renamed from: p */
    private String f13324p = "#FFFFFF";

    /* JADX INFO: renamed from: q */
    private String f13325q = "#FF000000";

    /* JADX INFO: renamed from: r */
    private String f13326r = "#40000000";

    /* JADX INFO: renamed from: s */
    private String f13327s = "#CAEF79";

    /* JADX INFO: renamed from: t */
    private String f13328t = "#2196F3";

    /* JADX INFO: renamed from: u */
    private String f13329u = "#402196F3";

    /* JADX INFO: renamed from: v */
    private String f13330v = "#8FC31F";

    /* JADX INFO: renamed from: w */
    private String f13331w = "#03A9F4";

    /* JADX INFO: renamed from: x */
    private boolean f13332x = false;

    /* JADX INFO: renamed from: a */
    private static int m11242a(String str) {
        return C1875i.m9684a(C1175n.m2059a().m2148f(), str, "id");
    }

    /* JADX INFO: renamed from: a */
    private static void m11243a() {
    }

    /* JADX INFO: renamed from: a */
    private void m11244a(Context context, View view, C2074c c2074c) {
        SoundImageView soundImageView = (SoundImageView) view.findViewById(m11242a(this.f13314f));
        int iM9834b = C1886t.m9834b(context, 60.0f);
        int iM9834b2 = C1886t.m9834b(context, 10.0f);
        if (soundImageView != null) {
            c2074c.m11091e();
            ((FrameLayout.LayoutParams) soundImageView.getLayoutParams()).setMargins(iM9834b2, 0, 0, iM9834b);
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m11245b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: b */
    private void m11246b(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m11242a(this.f13315g));
        if (relativeLayout != null) {
            if (C2070b.f13175a == 0 && C2070b.f13176b == 0 && C2070b.f13177c == 0 && C2070b.f13178d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m11247d(View view, C2074c c2074c) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m11242a(this.f13322n));
        if (relativeLayout != null) {
            if (c2074c.m11091e() == 1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(layoutParams.leftMargin + C2070b.f13175a, layoutParams.topMargin + C2070b.f13177c, layoutParams.rightMargin + C2070b.f13176b, layoutParams.bottomMargin + C2070b.f13178d);
                relativeLayout.setLayoutParams(layoutParams);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.setMargins(layoutParams2.leftMargin + C2070b.f13175a, layoutParams2.topMargin + C2070b.f13177c, layoutParams2.rightMargin + C2070b.f13176b, layoutParams2.bottomMargin + C2070b.f13178d);
            relativeLayout.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11248a(View view) {
        ObjectAnimator objectAnimatorM11163a;
        ObjectAnimator objectAnimatorM11171b;
        ObjectAnimator objectAnimatorM11163a2;
        if (view == null || !(view instanceof AnyThinkFramLayout)) {
            return;
        }
        AnyThinkFramLayout anyThinkFramLayout = (AnyThinkFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            this.f13332x = false;
            ImageView imageView = (ImageView) view.findViewById(m11242a(this.f13309a));
            ImageView imageView2 = (ImageView) view.findViewById(m11242a(this.f13310b));
            ImageView imageView3 = (ImageView) view.findViewById(m11242a(this.f13311c));
            ImageView imageView4 = (ImageView) view.findViewById(m11242a(this.f13312d));
            ObjectAnimator objectAnimatorM11171b2 = null;
            if (imageView != null) {
                new C2089b();
                objectAnimatorM11163a = C2089b.m11163a(imageView);
            } else {
                objectAnimatorM11163a = null;
            }
            if (imageView2 != null) {
                new C2089b();
                objectAnimatorM11171b = C2089b.m11171b(imageView2);
            } else {
                objectAnimatorM11171b = null;
            }
            if (imageView3 != null) {
                new C2089b();
                objectAnimatorM11163a2 = C2089b.m11163a(imageView3);
            } else {
                objectAnimatorM11163a2 = null;
            }
            if (imageView4 != null) {
                new C2089b();
                objectAnimatorM11171b2 = C2089b.m11171b(imageView4);
            }
            if (objectAnimatorM11163a == null || objectAnimatorM11163a2 == null || objectAnimatorM11171b == null || objectAnimatorM11171b2 == null) {
                return;
            }
            animatorSet.playTogether(objectAnimatorM11163a, objectAnimatorM11163a2, objectAnimatorM11171b, objectAnimatorM11171b2);
            anyThinkFramLayout.setAnimatorSet(animatorSet);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11249a(android.view.View r11, com.anythink.expressad.video.dynview.C2074c r12) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.p170j.C2098b.m11249a(android.view.View, com.anythink.expressad.video.dynview.c):void");
    }

    /* JADX INFO: renamed from: b */
    public final void m11250b(View view, C2074c c2074c) {
        Context context;
        int iM9834b;
        if (view == null || c2074c == null || (context = view.getContext()) == null) {
            return;
        }
        if (c2074c.m11091e() == 1) {
            view.setBackgroundDrawable(context.getResources().getDrawable(C1875i.m9684a(context, this.f13323o, C1875i.f11528c)));
            TextView textView = (TextView) view.findViewById(m11242a(this.f13316h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f13325q));
            }
            TextView textView2 = (TextView) view.findViewById(m11242a(this.f13317i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f13325q));
            }
            iM9834b = C1886t.m9834b(context, 2.0f);
        } else {
            iM9834b = C1886t.m9834b(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int iM9834b2 = C1886t.m9834b(context, 8.0f);
        View viewFindViewById = view.findViewById(m11242a(this.f13318j));
        if (viewFindViewById != null) {
            if (c2074c.m11092f() != null && (c2074c.m11092f() instanceof AnythinkClickCTAView)) {
                new C2089b();
                ((AnythinkClickCTAView) c2074c.m11092f()).setObjectAnimator(C2089b.m11173c(viewFindViewById));
            }
            if (viewFindViewById instanceof TextView) {
                TextView textView3 = (TextView) viewFindViewById;
                textView3.setTextColor(Color.parseColor(this.f13324p));
                textView3.setTextSize(15.0f);
                String str = this.f13327s;
                C2093a.m11189a(textView3, 1.0f, 5.0f, str, new String[]{this.f13330v, str}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(iM9834b, iM9834b, iM9834b, iM9834b2);
            layoutParams.height = C1886t.m9834b(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11251c(View view, C2074c c2074c) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || c2074c == null) {
            return;
        }
        if (view.getContext() != null) {
            this.f13332x = false;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(m11242a(this.f13319k));
            View viewFindViewById = view.findViewById(m11242a(this.f13321m));
            if (linearLayout != null && (linearLayout instanceof AnyThinkLevelLayoutView)) {
                if (c2074c.m11091e() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m11242a(this.f13322n));
            if (relativeLayout != null) {
                if (c2074c.m11091e() == 1) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(layoutParams2.leftMargin + C2070b.f13175a, layoutParams2.topMargin + C2070b.f13177c, layoutParams2.rightMargin + C2070b.f13176b, layoutParams2.bottomMargin + C2070b.f13178d);
                    layoutParams = layoutParams2;
                } else {
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams3.setMargins(layoutParams3.leftMargin + C2070b.f13175a, layoutParams3.topMargin + C2070b.f13177c, layoutParams3.rightMargin + C2070b.f13176b, layoutParams3.bottomMargin + C2070b.f13178d);
                    layoutParams = layoutParams3;
                }
                relativeLayout.setLayoutParams(layoutParams);
            }
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof TextView) {
                    TextView textView = (TextView) viewFindViewById;
                    textView.setTextColor(Color.parseColor(this.f13324p));
                    textView.setTextSize(25.0f);
                    String str = this.f13327s;
                    C2093a.m11189a(viewFindViewById, 1.0f, 5.0f, str, new String[]{this.f13330v, str}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                new C2089b();
                animatorSet.playTogether(C2089b.m11173c(viewFindViewById));
                if (view instanceof AnyThinkFramLayout) {
                    ((AnyThinkFramLayout) view).setAnimatorSet(animatorSet);
                }
                if (view instanceof AnyThinkRelativeLayout) {
                    ((AnyThinkRelativeLayout) view).setAnimatorSet(animatorSet);
                }
            }
        }
        new C2089b();
        C2089b.m11174e(view);
    }
}
