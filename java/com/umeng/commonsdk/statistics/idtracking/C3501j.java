package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.C3471v;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.j */
/* JADX INFO: loaded from: classes2.dex */
public class C3501j extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19242a = "oldumid";

    /* JADX INFO: renamed from: b */
    private Context f19243b;

    /* JADX INFO: renamed from: c */
    private String f19244c;

    /* JADX INFO: renamed from: d */
    private String f19245d;

    public C3501j(Context context) {
        super(f19242a);
        this.f19244c = null;
        this.f19245d = null;
        this.f19243b = context;
    }

    /* JADX INFO: renamed from: b */
    private void m16411b(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX INFO: renamed from: j */
    private void m16412j() {
        try {
            m16411b("/data/local/tmp/.um");
            HelperUtils.writeFile(new File("/data/local/tmp/.um/sysid.dat"), this.f19245d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    private void m16413k() {
        try {
            m16411b("/sdcard/Android/obj/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/obj/.um/sysid.dat"), this.f19245d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    private void m16414l() {
        try {
            m16411b("/sdcard/Android/data/.um");
            HelperUtils.writeFile(new File("/sdcard/Android/data/.um/sysid.dat"), this.f19245d);
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return this.f19244c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m16415g() {
        return m16416h();
    }

    /* JADX INFO: renamed from: h */
    public boolean m16416h() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f19243b, C3471v.f18972e, null);
        this.f19245d = strImprintProperty;
        if (TextUtils.isEmpty(strImprintProperty)) {
            return false;
        }
        this.f19245d = DataHelper.encryptBySHA1(this.f19245d);
        String file = HelperUtils.readFile(new File("/sdcard/Android/data/.um/sysid.dat"));
        String file2 = HelperUtils.readFile(new File("/sdcard/Android/obj/.um/sysid.dat"));
        String file3 = HelperUtils.readFile(new File("/data/local/tmp/.um/sysid.dat"));
        if (TextUtils.isEmpty(file)) {
            m16414l();
        } else if (!this.f19245d.equals(file)) {
            this.f19244c = file;
            return true;
        }
        if (TextUtils.isEmpty(file2)) {
            m16413k();
        } else if (!this.f19245d.equals(file2)) {
            this.f19244c = file2;
            return true;
        }
        if (TextUtils.isEmpty(file3)) {
            m16412j();
            return false;
        }
        if (this.f19245d.equals(file3)) {
            return false;
        }
        this.f19244c = file3;
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m16417i() {
        try {
            m16414l();
            m16413k();
            m16412j();
        } catch (Exception unused) {
        }
    }
}
