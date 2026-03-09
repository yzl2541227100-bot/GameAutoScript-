package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.os.Environment;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.s */
/* JADX INFO: loaded from: classes2.dex */
public class C3510s extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19262a = "utdid";

    /* JADX INFO: renamed from: b */
    private static final String f19263b = "android.permission.WRITE_EXTERNAL_STORAGE";

    /* JADX INFO: renamed from: c */
    private static final Pattern f19264c = Pattern.compile("UTDID\">([^<]+)");

    /* JADX INFO: renamed from: d */
    private Context f19265d;

    public C3510s(Context context) {
        super(f19262a);
        this.f19265d = context;
    }

    /* JADX INFO: renamed from: b */
    private String m16418b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f19264c.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private String m16419g() {
        File fileM16420h = m16420h();
        if (fileM16420h != null && fileM16420h.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileM16420h);
                try {
                    return m16418b(HelperUtils.readStreamToString(fileInputStream));
                } finally {
                    HelperUtils.safeClose(fileInputStream);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private File m16420h() {
        if (DeviceConfig.checkPermission(this.f19265d, "android.permission.WRITE_EXTERNAL_STORAGE") && Environment.getExternalStorageState().equals("mounted")) {
            try {
                return new File(Environment.getExternalStorageDirectory().getCanonicalPath(), ".UTSystemConfig/Global/Alvin2.xml");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        try {
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, this.f19265d);
        } catch (Exception unused) {
            return m16419g();
        }
    }
}
