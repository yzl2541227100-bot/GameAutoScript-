package com.octopus.p222ad.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.octopus.p222ad.internal.C3132r;
import com.octopus.p222ad.internal.network.C3128c;
import com.octopus.p222ad.internal.utilities.HTTPGet;
import com.octopus.p222ad.internal.utilities.HTTPResponse;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.UrlUtil;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.octopus.ad.internal.k */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC3118k extends HTTPGet {

    /* JADX INFO: renamed from: a */
    private String f17151a;

    /* JADX INFO: renamed from: b */
    private C3132r f17152b;

    /* JADX INFO: renamed from: c */
    private boolean f17153c;

    /* JADX INFO: renamed from: d */
    private Context f17154d;

    /* JADX INFO: renamed from: e */
    private a f17155e;

    /* JADX INFO: renamed from: f */
    private ArrayList<String> f17156f;

    /* JADX INFO: renamed from: g */
    private String f17157g;

    /* JADX INFO: renamed from: com.octopus.ad.internal.k$a */
    public class a implements C3132r.a {

        /* JADX INFO: renamed from: a */
        public long f17158a;

        private a() {
            this.f17158a = 0L;
        }

        @Override // com.octopus.p222ad.internal.C3132r.a
        /* JADX INFO: renamed from: a */
        public void mo14424a(boolean z) {
            this.f17158a = z ? this.f17158a + 250 : 0L;
            if (this.f17158a >= 500) {
                AsyncTaskC3118k.this.m14422a();
            }
        }
    }

    private AsyncTaskC3118k(String str, String str2, C3132r c3132r, Context context, ArrayList<String> arrayList) {
        super(false);
        this.f17153c = false;
        this.f17157g = "";
        this.f17151a = str2;
        this.f17152b = c3132r;
        this.f17155e = new a();
        this.f17154d = context;
        this.f17156f = arrayList;
        this.f17157g = str;
    }

    /* JADX INFO: renamed from: a */
    public static AsyncTaskC3118k m14421a(String str, String str2, C3132r c3132r, Context context, ArrayList<String> arrayList) {
        if (c3132r == null) {
            return null;
        }
        AsyncTaskC3118k asyncTaskC3118k = new AsyncTaskC3118k(str, str2, c3132r, context, arrayList);
        c3132r.m14602a(asyncTaskC3118k.f17155e);
        return asyncTaskC3118k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m14422a() {
        Context context;
        if (!this.f17153c && (context = this.f17154d) != null) {
            C3128c c3128cM14584a = C3128c.m14584a(context.getApplicationContext());
            if (c3128cM14584a.m14590b(this.f17154d)) {
                execute(new Void[0]);
                this.f17152b.m14604b(this.f17155e);
                this.f17155e = null;
            } else {
                c3128cM14584a.m14589a(this.f17151a, this.f17154d);
            }
            this.f17153c = true;
            this.f17156f.remove(this.f17151a);
        }
    }

    @Override // com.octopus.p222ad.internal.utilities.HTTPGet
    public String getUrl() {
        View viewM14601a = this.f17152b.m14601a();
        if (viewM14601a == null) {
            return UrlUtil.replaceToTouchEventUrl(this.f17151a, "", "", "", "", "", "", "");
        }
        if (!TextUtils.isEmpty(this.f17157g)) {
            this.f17151a = this.f17151a.replace("__REQUESTUUID__", this.f17157g);
        }
        return StringUtil.replaceView(0, viewM14601a, this.f17151a);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.octopus.p222ad.internal.utilities.HTTPGet, android.os.AsyncTask
    public void onPostExecute(HTTPResponse hTTPResponse) {
        HaoboLog.m14607d(HaoboLog.nativeLogTag, "Impression tracked.");
    }
}
