package com.iflytek.voiceads.p208b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.iflytek.voiceads.p208b.C2897e;

/* JADX INFO: renamed from: com.iflytek.voiceads.b.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2893a {

    /* JADX INFO: renamed from: c */
    private C2896d f16117c;

    /* JADX INFO: renamed from: d */
    private String f16118d;

    /* JADX INFO: renamed from: e */
    private a f16119e;

    /* JADX INFO: renamed from: a */
    C2897e.b f16115a = new C2894b(this);

    /* JADX INFO: renamed from: f */
    private final int f16120f = 1;

    /* JADX INFO: renamed from: b */
    Handler f16116b = new HandlerC2895c(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: com.iflytek.voiceads.b.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo13233a(Bitmap bitmap);
    }

    public C2893a(Context context, String str) {
        this.f16118d = str;
        this.f16117c = new C2896d(context, str);
    }

    /* JADX INFO: renamed from: a */
    public void m13232a(a aVar) {
        this.f16119e = aVar;
        if (TextUtils.isEmpty(this.f16118d)) {
            aVar.mo13233a(null);
            return;
        }
        Bitmap bitmapM13239a = this.f16117c.m13239a();
        if (bitmapM13239a != null) {
            aVar.mo13233a(bitmapM13239a);
        } else {
            new C2897e(this.f16118d, this.f16115a).m13242a();
        }
    }
}
