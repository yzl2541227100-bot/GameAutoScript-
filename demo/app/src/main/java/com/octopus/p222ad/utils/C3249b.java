package com.octopus.p222ad.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AlertDialog;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.DownloadService;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.p224b.C3069b;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.utils.p258b.C3260k;
import p285z2.C3902g6;

/* JADX INFO: renamed from: com.octopus.ad.utils.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3249b {

    /* JADX INFO: renamed from: b */
    private static C3249b f17883b;

    /* JADX INFO: renamed from: a */
    private Context f17884a;

    /* JADX INFO: renamed from: c */
    private boolean f17885c;

    /* JADX INFO: renamed from: d */
    private C3215a f17886d;

    /* JADX INFO: renamed from: e */
    private C3069b.i f17887e;

    private C3249b(Context context) {
        this.f17884a = context;
    }

    /* JADX INFO: renamed from: a */
    public static C3249b m14955a(Context context) {
        if (f17883b == null) {
            synchronized (C3249b.class) {
                if (f17883b == null) {
                    f17883b = new C3249b(context);
                }
            }
        }
        return f17883b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m14957d() {
        String str;
        if (!m14959f()) {
            str = "startDownloadService download:下载必要参数为null";
        } else {
            if (C3260k.m14997a(this.f17884a)) {
                try {
                    this.f17884a.startService(new Intent(this.f17884a, (Class<?>) DownloadService.class));
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            str = "startDownloadService:checkStoragePermission false";
        }
        Log.d("octopus", str);
    }

    /* JADX INFO: renamed from: e */
    private void m14958e() {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f17884a, C3063R.style.OctopusAlertDialogStyle);
            builder.setTitle("应用详情");
            String strM14826e = C3902g6.OooO00o;
            if (!TextUtils.isEmpty(this.f17886d.m14826e())) {
                strM14826e = this.f17886d.m14826e();
            }
            builder.setMessage("下载" + strM14826e + "观看更多内容");
            builder.setPositiveButton(C3063R.string.octopus_confirm, new DialogInterface.OnClickListener() { // from class: com.octopus.ad.utils.b.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C3249b.this.m14957d();
                }
            });
            builder.setNegativeButton(C3063R.string.octopus_cancel, new DialogInterface.OnClickListener() { // from class: com.octopus.ad.utils.b.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m14959f() {
        String str;
        C3215a c3215a = this.f17886d;
        if (c3215a == null) {
            return false;
        }
        if (TextUtils.isEmpty(c3215a.m14822a())) {
            str = "apkUrl can not be empty!";
        } else if (TextUtils.isEmpty(this.f17886d.m14823b())) {
            str = "apkName can not be empty!";
        } else {
            if (this.f17886d.m14823b().endsWith(AbstractC1067a.f2406g)) {
                return true;
            }
            str = "apkName must endsWith .apk!";
        }
        C3255f.m14983c("DownloadManager", str);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public C3215a m14960a() {
        return this.f17886d;
    }

    /* JADX INFO: renamed from: a */
    public C3249b m14961a(C3069b.i iVar) {
        this.f17887e = iVar;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3249b m14962a(C3215a c3215a) {
        this.f17886d = c3215a;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3249b m14963a(boolean z) {
        this.f17885c = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C3249b m14964b(Context context) {
        this.f17884a = context;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m14965b() {
        if (C3120m.m14425a().m14451q() || this.f17885c) {
            m14957d();
        } else {
            m14958e();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14966c() {
        this.f17884a = null;
        f17883b = null;
    }
}
