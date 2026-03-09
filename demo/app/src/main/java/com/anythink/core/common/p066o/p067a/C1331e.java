package com.anythink.core.common.p066o.p067a;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.anythink.core.common.o.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1331e {
    /* JADX INFO: renamed from: a */
    private static View m3967a(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static View m3968a(Context context, View view) {
        View rootView;
        View viewFindViewById = null;
        View viewFindViewById2 = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (view != null && (rootView = view.getRootView()) != null && (viewFindViewById = rootView.findViewById(R.id.content)) == null) {
            viewFindViewById = rootView;
        }
        return viewFindViewById2 != null ? viewFindViewById2 : viewFindViewById;
    }

    /* JADX INFO: renamed from: a */
    private static void m3969a(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    /* JADX INFO: renamed from: b */
    private static View m3970b(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View viewFindViewById = rootView.findViewById(R.id.content);
        return viewFindViewById != null ? viewFindViewById : rootView;
    }
}
