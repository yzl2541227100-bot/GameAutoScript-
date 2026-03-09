package com.octopus.p222ad.internal.view;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.china.common.C1082d;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.EnumC3119l;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.internal.utilities.W3CEvent;
import com.octopus.p222ad.internal.view.AdWebView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.octopus.ad.internal.view.e */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public class C3197e {

    /* JADX INFO: renamed from: a */
    public static final String[] f17752a = {CallMraidJS.f6714f, CallMraidJS.f6715g};

    /* JADX INFO: renamed from: b */
    public final AdWebView f17753b;

    /* JADX INFO: renamed from: e */
    public int f17756e;

    /* JADX INFO: renamed from: f */
    public int f17757f;

    /* JADX INFO: renamed from: g */
    public int f17758g;

    /* JADX INFO: renamed from: j */
    public boolean f17761j;

    /* JADX INFO: renamed from: l */
    private int f17763l;

    /* JADX INFO: renamed from: m */
    private int f17764m;

    /* JADX INFO: renamed from: n */
    private Activity f17765n;

    /* JADX INFO: renamed from: o */
    private ViewGroup f17766o;

    /* JADX INFO: renamed from: q */
    private int f17768q;

    /* JADX INFO: renamed from: k */
    private boolean f17762k = false;

    /* JADX INFO: renamed from: c */
    public boolean f17754c = false;

    /* JADX INFO: renamed from: d */
    public boolean f17755d = false;

    /* JADX INFO: renamed from: h */
    public boolean f17759h = false;

    /* JADX INFO: renamed from: i */
    public boolean f17760i = false;

    /* JADX INFO: renamed from: p */
    private int[] f17767p = new int[4];

    /* JADX INFO: renamed from: r */
    private boolean f17769r = false;

    /* JADX INFO: renamed from: s */
    private C3198f f17770s = null;

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.e$1 */
    public class AnonymousClass1 implements AdWebView.InterfaceC3182b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f17771a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdActivity.EnumC3054b f17772b;

        public AnonymousClass1(boolean z, AdActivity.EnumC3054b enumC3054b) {
            z = z;
            enumC3054b = enumC3054b;
        }

        @Override // com.octopus.p222ad.internal.view.AdWebView.InterfaceC3182b
        /* JADX INFO: renamed from: a */
        public void mo14751a() {
            if (C3197e.this.m14802c() != null) {
                C3197e.this.f17770s.m14741a(C3197e.this.m14802c(), z, enumC3054b);
                AdViewImpl.setMRAIDFullscreenListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.e$2 */
    public class AnonymousClass2 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f17774a;

        public AnonymousClass2(String str) {
            str = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:117:0x00d6, code lost:
        
            if (r0 == 0) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x00f6, code lost:
        
            if (r0 == 0) goto L144;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11, types: [java.io.FileOutputStream] */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16, types: [java.io.FileOutputStream] */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v23 */
        /* JADX WARN: Type inference failed for: r0v25 */
        /* JADX WARN: Type inference failed for: r0v33 */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r0v35 */
        /* JADX WARN: Type inference failed for: r0v38 */
        /* JADX WARN: Type inference failed for: r0v39 */
        /* JADX WARN: Type inference failed for: r0v40 */
        /* JADX WARN: Type inference failed for: r0v41 */
        /* JADX WARN: Type inference failed for: r0v42 */
        /* JADX WARN: Type inference failed for: r0v43 */
        /* JADX WARN: Type inference failed for: r0v44 */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // android.content.DialogInterface.OnClickListener
        @android.annotation.SuppressLint({"NewApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.content.DialogInterface r7, int r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 378
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.view.C3197e.AnonymousClass2.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.e$3 */
    public class AnonymousClass3 implements DialogInterface.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.e$4 */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17777a;

        static {
            int[] iArr = new int[AdActivity.EnumC3054b.values().length];
            f17777a = iArr;
            try {
                iArr[AdActivity.EnumC3054b.landscape.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17777a[AdActivity.EnumC3054b.portrait.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17777a[AdActivity.EnumC3054b.none.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.e$a */
    public enum a {
        top_left,
        top_right,
        center,
        bottom_left,
        bottom_right,
        top_center,
        bottom_center
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.view.e$b */
    public enum b {
        STARTING_DEFAULT,
        STARTING_EXPANDED
    }

    public C3197e(AdWebView adWebView) {
        this.f17753b = adWebView;
    }

    /* JADX INFO: renamed from: a */
    private AdActivity.EnumC3054b m14777a(String str) {
        return str.equals("landscape") ? AdActivity.EnumC3054b.landscape : str.equals("portrait") ? AdActivity.EnumC3054b.portrait : AdActivity.EnumC3054b.none;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    private void m14779a(AdWebView adWebView) {
        if (m14799a(new Intent("android.intent.action.VIEW", Uri.parse("sms:5555555555")))) {
            m14780a(adWebView, "sms", true);
        }
        if (m14799a(new Intent("android.intent.action.VIEW", Uri.parse("tel:5555555555")))) {
            m14780a(adWebView, "tel", true);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 14) {
            if (m14799a(new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI))) {
                m14780a(adWebView, "calendar", true);
                this.f17760i = true;
            } else if (m14799a(new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event"))) {
                m14780a(adWebView, "calendar", true);
                this.f17760i = true;
                W3CEvent.useMIME = true;
            }
        }
        if (this.f17753b.getContext().getPackageManager().checkPermission(C1082d.f2502b, this.f17753b.getContext().getPackageName()) == 0 && i >= 11) {
            m14780a(adWebView, "storePicture", true);
            this.f17759h = true;
        }
        m14780a(adWebView, "inlineVideo", true);
    }

    /* JADX INFO: renamed from: a */
    private void m14780a(AdWebView adWebView, String str, boolean z) {
        adWebView.m14746c(String.format("javascript:window.mraid.util.setSupports('%s', %s)", str, String.valueOf(z)));
    }

    /* JADX INFO: renamed from: c */
    private void m14781c(ArrayList<Pair<String, String>> arrayList) {
        String strDecode = null;
        for (Pair<String, String> pair : arrayList) {
            if (((String) pair.first).equals("uri")) {
                strDecode = Uri.decode((String) pair.second);
            }
        }
        if (StringUtil.isEmpty(strDecode)) {
            return;
        }
        this.f17753b.m14744b(strDecode);
        this.f17753b.m14745c();
    }

    /* JADX INFO: renamed from: d */
    private void m14782d(ArrayList<Pair<String, String>> arrayList) {
        String str = null;
        for (Pair<String, String> pair : arrayList) {
            if (((String) pair.first).equals("uri")) {
                str = (String) pair.second;
            }
        }
        if (str == null) {
            HaoboLog.m14607d(HaoboLog.mraidLogTag, HaoboLog.getString(C3063R.string.store_picture_error));
            return;
        }
        String strDecode = Uri.decode(str);
        AlertDialog.Builder builder = new AlertDialog.Builder(ViewUtil.getTopContext(this.f17753b));
        builder.setTitle(C3063R.string.store_picture_title);
        builder.setMessage(C3063R.string.store_picture_message);
        builder.setPositiveButton(C3063R.string.store_picture_accept, new DialogInterface.OnClickListener() { // from class: com.octopus.ad.internal.view.e.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f17774a;

            public AnonymousClass2(String strDecode2) {
                str = strDecode2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:117:0x00d6, code lost:
            
                if (r0 == 0) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x00f6, code lost:
            
                if (r0 == 0) goto L144;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v11, types: [java.io.FileOutputStream] */
            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.io.FileOutputStream] */
            /* JADX WARN: Type inference failed for: r0v17 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v19 */
            /* JADX WARN: Type inference failed for: r0v20 */
            /* JADX WARN: Type inference failed for: r0v21 */
            /* JADX WARN: Type inference failed for: r0v22 */
            /* JADX WARN: Type inference failed for: r0v23 */
            /* JADX WARN: Type inference failed for: r0v25 */
            /* JADX WARN: Type inference failed for: r0v33 */
            /* JADX WARN: Type inference failed for: r0v34 */
            /* JADX WARN: Type inference failed for: r0v35 */
            /* JADX WARN: Type inference failed for: r0v38 */
            /* JADX WARN: Type inference failed for: r0v39 */
            /* JADX WARN: Type inference failed for: r0v40 */
            /* JADX WARN: Type inference failed for: r0v41 */
            /* JADX WARN: Type inference failed for: r0v42 */
            /* JADX WARN: Type inference failed for: r0v43 */
            /* JADX WARN: Type inference failed for: r0v44 */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // android.content.DialogInterface.OnClickListener
            @android.annotation.SuppressLint({"NewApi"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onClick(android.content.DialogInterface r7, int r8) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 378
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.view.C3197e.AnonymousClass2.onClick(android.content.DialogInterface, int):void");
            }
        });
        builder.setNegativeButton(C3063R.string.store_picture_decline, new DialogInterface.OnClickListener() { // from class: com.octopus.ad.internal.view.e.3
            public AnonymousClass3() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }

    /* JADX INFO: renamed from: e */
    private void m14783e() {
        Activity activity = (Activity) this.f17753b.getContextFromMutableContext();
        int[] iArr = new int[2];
        this.f17753b.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] - activity.getWindow().findViewById(R.id.content).getTop();
        this.f17753b.measure(0, 0);
        int[] iArr2 = {this.f17753b.getMeasuredWidth(), this.f17753b.getMeasuredHeight()};
        ViewUtil.convertFromPixelsToDP(activity, iArr2);
        this.f17753b.m14746c(String.format("javascript:window.mraid.util.setDefaultPosition(%d, %d, %d, %d)", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1])));
    }

    /* JADX INFO: renamed from: e */
    private void m14784e(ArrayList<Pair<String, String>> arrayList) {
        String str;
        int i;
        String str2 = null;
        for (Pair<String, String> pair : arrayList) {
            if (((String) pair.first).equals("uri")) {
                str2 = (String) pair.second;
            }
        }
        if (str2 == null) {
            str = HaoboLog.mraidLogTag;
            i = C3063R.string.play_vide_no_uri;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            try {
                intent.setDataAndType(Uri.parse(URLDecoder.decode(str2, "UTF-8")), C1732o.f9735e);
                try {
                    this.f17753b.getContext().startActivity(intent);
                    this.f17753b.m14745c();
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
            } catch (UnsupportedEncodingException unused2) {
                str = HaoboLog.mraidLogTag;
                i = C3063R.string.unsupported_encoding;
            }
        }
        HaoboLog.m14607d(str, HaoboLog.getString(i));
    }

    /* JADX INFO: renamed from: f */
    private void m14785f() {
        if (this.f17753b.getContextFromMutableContext() instanceof Activity) {
            Activity activity = (Activity) this.f17753b.getContextFromMutableContext();
            int[] screenSizeAsPixels = ViewUtil.getScreenSizeAsPixels(activity);
            int i = screenSizeAsPixels[0];
            int top = screenSizeAsPixels[1] - activity.getWindow().findViewById(R.id.content).getTop();
            float f = activity.getResources().getDisplayMetrics().density;
            int i2 = (int) ((top / f) + 0.5f);
            int i3 = (int) ((i / f) + 0.5f);
            this.f17753b.m14746c("javascript:window.mraid.util.setMaxSize(" + i3 + ", " + i2 + ")");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001f  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14786f(java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L1f
            int r0 = r2.size()     // Catch: java.io.UnsupportedEncodingException -> L1e
            if (r0 <= 0) goto L1f
            r0 = 0
            java.lang.Object r2 = r2.get(r0)     // Catch: java.io.UnsupportedEncodingException -> L1e
            android.util.Pair r2 = (android.util.Pair) r2     // Catch: java.io.UnsupportedEncodingException -> L1e
            java.lang.Object r2 = r2.second     // Catch: java.io.UnsupportedEncodingException -> L1e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.UnsupportedEncodingException -> L1e
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L1e
            com.octopus.ad.internal.utilities.W3CEvent r2 = com.octopus.p222ad.internal.utilities.W3CEvent.createFromJSON(r2)     // Catch: java.io.UnsupportedEncodingException -> L1e
            goto L20
        L1e:
            return
        L1f:
            r2 = 0
        L20:
            if (r2 == 0) goto L44
            android.content.Intent r2 = r2.getInsertIntent()     // Catch: android.content.ActivityNotFoundException -> L44
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r0)     // Catch: android.content.ActivityNotFoundException -> L44
            com.octopus.ad.internal.view.AdWebView r0 = r1.f17753b     // Catch: android.content.ActivityNotFoundException -> L44
            android.content.Context r0 = r0.getContext()     // Catch: android.content.ActivityNotFoundException -> L44
            r0.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L44
            com.octopus.ad.internal.view.AdWebView r2 = r1.f17753b     // Catch: android.content.ActivityNotFoundException -> L44
            r2.m14745c()     // Catch: android.content.ActivityNotFoundException -> L44
            java.lang.String r2 = com.octopus.p222ad.internal.utilities.HaoboLog.mraidLogTag     // Catch: android.content.ActivityNotFoundException -> L44
            int r0 = com.octopus.p222ad.C3063R.string.create_calendar_event     // Catch: android.content.ActivityNotFoundException -> L44
            java.lang.String r0 = com.octopus.p222ad.internal.utilities.HaoboLog.getString(r0)     // Catch: android.content.ActivityNotFoundException -> L44
            com.octopus.p222ad.internal.utilities.HaoboLog.m14607d(r2, r0)     // Catch: android.content.ActivityNotFoundException -> L44
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.octopus.p222ad.internal.view.C3197e.m14786f(java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: g */
    private void m14787g() {
        if (this.f17753b.getContextFromMutableContext() instanceof Activity) {
            int[] screenSizeAsDP = ViewUtil.getScreenSizeAsDP((Activity) this.f17753b.getContextFromMutableContext());
            this.f17763l = screenSizeAsDP[0];
            this.f17764m = screenSizeAsDP[1];
            this.f17753b.m14746c("javascript:window.mraid.util.setScreenSize(" + this.f17763l + ", " + this.f17764m + ")");
        }
    }

    /* JADX INFO: renamed from: g */
    private void m14788g(ArrayList<Pair<String, String>> arrayList) {
        AdActivity.EnumC3054b enumC3054bM14777a = AdActivity.EnumC3054b.none;
        int i = 1;
        boolean z = true;
        for (Pair<String, String> pair : arrayList) {
            if (((String) pair.first).equals("allow_orientation_change")) {
                z = Boolean.parseBoolean((String) pair.second);
            } else if (((String) pair.first).equals("force_orientation")) {
                enumC3054bM14777a = m14777a((String) pair.second);
            }
        }
        if (this.f17754c || this.f17753b.adViewImpl.mo14697e()) {
            AdWebView adWebView = this.f17753b;
            Activity activityM14802c = adWebView.f17643a ? m14802c() : (Activity) ViewUtil.getTopContext(adWebView);
            if (z) {
                AdActivity.m13815b(activityM14802c);
                return;
            }
            int i2 = AnonymousClass4.f17777a[enumC3054bM14777a.ordinal()];
            if (i2 == 1) {
                i = 2;
            } else if (i2 != 2) {
                i = 0;
            }
            AdActivity.m13813a(activityM14802c, i);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m14789h(ArrayList<Pair<String, String>> arrayList) {
        int i = 0;
        int i2 = -1;
        String str = "top-right";
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        for (Pair<String, String> pair : arrayList) {
            try {
                if (((String) pair.first).equals("w")) {
                    i2 = Integer.parseInt((String) pair.second);
                } else if (((String) pair.first).equals("h")) {
                    i3 = Integer.parseInt((String) pair.second);
                } else if (((String) pair.first).equals("offset_x")) {
                    i = Integer.parseInt((String) pair.second);
                } else if (((String) pair.first).equals("offset_y")) {
                    i4 = Integer.parseInt((String) pair.second);
                } else if (((String) pair.first).equals("custom_close_position")) {
                    str = (String) pair.second;
                } else if (((String) pair.first).equals("allow_offscreen")) {
                    z = Boolean.parseBoolean((String) pair.second);
                }
            } catch (NumberFormatException unused) {
                HaoboLog.m14607d(HaoboLog.mraidLogTag, HaoboLog.getString(C3063R.string.number_format));
                return;
            }
        }
        if (i2 > this.f17763l && i3 > this.f17764m) {
            this.f17753b.m14746c("javascript:mraid.util.errorEvent('Resize called with resizeProperties larger than the screen.', 'mraid.resize()')");
            return;
        }
        a aVarValueOf = a.top_right;
        try {
            aVarValueOf = a.valueOf(str.replace('-', '_'));
        } catch (IllegalArgumentException unused2) {
        }
        int i5 = i2;
        int i6 = i3;
        int i7 = i;
        int i8 = i4;
        boolean z3 = z;
        HaoboLog.m14607d(HaoboLog.mraidLogTag, HaoboLog.getString(C3063R.string.resize, i5, i6, i7, i8, str, z3));
        this.f17753b.resize(i5, i6, i7, i8, aVarValueOf, z3);
        this.f17753b.m14745c();
        this.f17753b.m14746c("javascript:window.mraid.util.stateChangeEvent('resized');");
        this.f17755d = true;
    }

    /* JADX INFO: renamed from: a */
    public void m14790a() {
        if (!this.f17754c && !this.f17755d && !this.f17769r) {
            if (!this.f17753b.adViewImpl.mo14697e()) {
                this.f17753b.m14747d();
                return;
            }
            this.f17753b.adViewImpl.getAdDispatcher().mo14241b();
            Activity activity = (Activity) this.f17753b.getContextFromMutableContext();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.finish();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f17753b.getLayoutParams());
        layoutParams.height = this.f17757f;
        layoutParams.width = this.f17756e;
        layoutParams.gravity = this.f17753b.adViewImpl.getMediaType().equals(EnumC3119l.BANNER) ? this.f17758g : 17;
        this.f17753b.setLayoutParams(layoutParams);
        this.f17753b.mo14748e();
        this.f17753b.m14746c("javascript:window.mraid.util.stateChangeEvent('default');");
        if (!this.f17753b.adViewImpl.mo14697e() && !this.f17769r) {
            this.f17753b.adViewImpl.getAdDispatcher().mo14241b();
        }
        Activity activity2 = (Activity) this.f17753b.getContextFromMutableContext();
        if (activity2 != null) {
            activity2.setRequestedOrientation(-1);
        }
        this.f17754c = false;
        this.f17755d = false;
        this.f17770s = null;
    }

    /* JADX INFO: renamed from: a */
    public void m14791a(int i) {
        if (this.f17768q != i) {
            this.f17768q = i;
            m14785f();
            m14787g();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14792a(int i, int i2, int i3, int i4) {
        int[] iArr = this.f17767p;
        if (iArr[0] == i && iArr[1] == i2 && iArr[2] == i3 && iArr[3] == i4) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        Activity activity = (Activity) this.f17753b.getContextFromMutableContext();
        int[] iArr2 = {i, i2 - activity.getWindow().findViewById(R.id.content).getTop(), i3, i4};
        ViewUtil.convertFromPixelsToDP(activity, iArr2);
        int i5 = iArr2[0];
        int i6 = iArr2[1];
        int i7 = iArr2[2];
        int i8 = iArr2[3];
        this.f17753b.m14746c(String.format("javascript:window.mraid.util.setCurrentPosition(%d, %d, %d, %d)", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)));
        this.f17753b.m14746c(String.format("javascript:window.mraid.util.sizeChangeEvent(%d, %d)", Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    /* JADX INFO: renamed from: a */
    public void m14793a(Activity activity) {
        this.f17765n = activity;
    }

    /* JADX INFO: renamed from: a */
    public void m14794a(ViewGroup viewGroup) {
        this.f17766o = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public void m14795a(AdWebView adWebView, String str) {
        if (this.f17762k) {
            return;
        }
        String str2 = this.f17753b.adViewImpl.mo14696d() ? "inline" : C1807f.f11180d;
        boolean zEquals = str.equals(f17752a[b.STARTING_EXPANDED.ordinal()]);
        this.f17769r = zEquals;
        this.f17753b.f17643a = zEquals;
        adWebView.m14746c("javascript:window.mraid.util.setPlacementType('" + str2 + "')");
        if (!this.f17769r) {
            m14779a(adWebView);
            m14787g();
            m14785f();
            m14783e();
        }
        this.f17753b.m14749f();
        adWebView.m14746c("javascript:window.mraid.util.stateChangeEvent('" + str + "')");
        adWebView.m14746c("javascript:window.mraid.util.readyEvent();");
        this.f17756e = this.f17753b.getLayoutParams().width;
        this.f17757f = this.f17753b.getLayoutParams().height;
        if (this.f17753b.adViewImpl.getMediaType().equals(EnumC3119l.BANNER)) {
            this.f17758g = ((FrameLayout.LayoutParams) this.f17753b.getLayoutParams()).gravity;
        }
        this.f17762k = true;
        m14798a(this.f17753b.m14750g());
    }

    /* JADX INFO: renamed from: a */
    public void m14796a(String str, boolean z) {
        String strReplaceFirst = str.replaceFirst("mraid://", "");
        String[] strArrSplit = strReplaceFirst.split("\\?");
        String strReplaceAll = strArrSplit[0].replaceAll("/", "");
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (strArrSplit.length > 1) {
            for (String str2 : strReplaceFirst.substring(strReplaceFirst.indexOf("?") + 1).split("&")) {
                String[] strArrSplit2 = str2.split("=");
                if (strArrSplit2.length >= 2 && !StringUtil.isEmpty(strArrSplit2[1]) && !"undefined".equals(strArrSplit2[1])) {
                    arrayList.add(new Pair<>(strArrSplit2[0], strArrSplit2[1]));
                }
            }
        }
        if (!strReplaceAll.equals("expand")) {
            if (strReplaceAll.equals(C1781c.f10318cf)) {
                m14790a();
                return;
            }
            if (!strReplaceAll.equals("resize")) {
                if (strReplaceAll.equals("setOrientationProperties")) {
                    m14788g(arrayList);
                    return;
                }
                if (this.f17760i && strReplaceAll.equals("createCalendarEvent")) {
                    if (z) {
                        m14786f(arrayList);
                        return;
                    }
                } else if (strReplaceAll.equals("playVideo")) {
                    if (z) {
                        m14784e(arrayList);
                        return;
                    }
                } else if (!this.f17759h || !strReplaceAll.equals("storePicture")) {
                    if (!strReplaceAll.equals("open")) {
                        if (strReplaceAll.equals("setUseCustomClose")) {
                            m14797a(arrayList);
                            return;
                        } else {
                            if (strReplaceAll.equals("enable")) {
                                return;
                            }
                            HaoboLog.m14607d(HaoboLog.mraidLogTag, HaoboLog.getString(C3063R.string.unsupported_mraid, strReplaceAll));
                            return;
                        }
                    }
                    if (z) {
                        m14781c(arrayList);
                        return;
                    }
                } else if (z) {
                    m14782d(arrayList);
                    return;
                }
            } else if (z) {
                m14789h(arrayList);
                return;
            }
        } else if (z) {
            m14801b(arrayList);
            return;
        }
        HaoboLog.m14615w(HaoboLog.mraidLogTag, HaoboLog.getString(C3063R.string.no_user_interaction, strReplaceFirst));
    }

    /* JADX INFO: renamed from: a */
    public void m14797a(ArrayList<Pair<String, String>> arrayList) {
        this.f17753b.setMRAIDUseCustomClose(Boolean.parseBoolean((String) arrayList.get(0).second));
    }

    /* JADX INFO: renamed from: a */
    public void m14798a(boolean z) {
        if (this.f17762k) {
            this.f17761j = z;
            this.f17753b.m14746c("javascript:window.mraid.util.setIsViewable(" + z + ")");
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m14799a(Intent intent) {
        return this.f17753b.getContext().getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }

    /* JADX INFO: renamed from: b */
    public void m14800b() {
        boolean zM14750g = this.f17753b.m14750g();
        if (this.f17761j != zM14750g) {
            m14798a(zM14750g);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14801b(ArrayList<Pair<String, String>> arrayList) {
        AdActivity.EnumC3054b enumC3054b = AdActivity.EnumC3054b.none;
        String strDecode = null;
        AdActivity.EnumC3054b enumC3054bM14777a = enumC3054b;
        int i = -1;
        int i2 = -1;
        boolean z = false;
        boolean z3 = true;
        for (Pair<String, String> pair : arrayList) {
            if (((String) pair.first).equals("w")) {
                try {
                    i = Integer.parseInt((String) pair.second);
                } catch (NumberFormatException unused) {
                }
            } else if (((String) pair.first).equals("h")) {
                i2 = Integer.parseInt((String) pair.second);
            } else if (((String) pair.first).equals("useCustomClose")) {
                z = Boolean.parseBoolean((String) pair.second);
            } else if (((String) pair.first).equals(C1781c.f10246am)) {
                strDecode = Uri.decode((String) pair.second);
            } else if (((String) pair.first).equals("allow_orientation_change")) {
                z3 = Boolean.parseBoolean((String) pair.second);
            } else if (((String) pair.first).equals("force_orientation")) {
                enumC3054bM14777a = m14777a((String) pair.second);
            }
        }
        if (StringUtil.isEmpty(strDecode)) {
            this.f17753b.m14740a(i, i2, z, this, z3, enumC3054bM14777a);
        } else {
            try {
                C3198f c3198f = new C3198f(this.f17753b.adViewImpl, this);
                this.f17770s = c3198f;
                c3198f.m14742a(strDecode);
                this.f17753b.adViewImpl.m14690a(this.f17770s.getMRAIDImplementation(), z, new AdWebView.InterfaceC3182b() { // from class: com.octopus.ad.internal.view.e.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ boolean f17771a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ AdActivity.EnumC3054b f17772b;

                    public AnonymousClass1(boolean z32, AdActivity.EnumC3054b enumC3054bM14777a2) {
                        z = z32;
                        enumC3054b = enumC3054bM14777a2;
                    }

                    @Override // com.octopus.p222ad.internal.view.AdWebView.InterfaceC3182b
                    /* JADX INFO: renamed from: a */
                    public void mo14751a() {
                        if (C3197e.this.m14802c() != null) {
                            C3197e.this.f17770s.m14741a(C3197e.this.m14802c(), z, enumC3054b);
                            AdViewImpl.setMRAIDFullscreenListener(null);
                        }
                    }
                });
            } catch (Exception e) {
                HaoboLog.m14609e(HaoboLog.baseLogTag, "Exception initializing the redirect webview: " + e.getMessage());
            }
        }
        this.f17753b.m14746c("javascript:window.mraid.util.stateChangeEvent('expanded');");
        this.f17754c = true;
        if (this.f17753b.adViewImpl.mo14697e()) {
            return;
        }
        this.f17753b.adViewImpl.getAdDispatcher().mo14242c();
    }

    /* JADX INFO: renamed from: c */
    public Activity m14802c() {
        return this.f17765n;
    }

    /* JADX INFO: renamed from: d */
    public ViewGroup m14803d() {
        return this.f17766o;
    }
}
