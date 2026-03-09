package p285z2;

import android.text.TextUtils;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.Script;
import com.cyjh.http.bean.request.EngineParams;
import com.ywfzjbcy.R;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: renamed from: z2.b7 */
/* JADX INFO: loaded from: classes.dex */
public class C3718b7 {
    public static boolean OooO0o = false;
    private static final String OooO0o0 = "z2.b7";
    private static final C3718b7 OooO0oO = new C3718b7();
    private Script OooO00o;
    public boolean OooO0O0;
    public int OooO0OO = 0;
    public long OooO0Oo;

    public static C3718b7 OooO0Oo() {
        return OooO0oO;
    }

    public void OooO() {
        String str = AppContext.OooO00o().getFilesDir() + File.separator + C3902g6.o0ooOOo;
        String str2 = "initMQScript --> dirName =" + str;
        File file = new File(str, InterfaceC3865f6.OooO00o);
        File file2 = new File(str, InterfaceC3865f6.OooO0O0);
        File file3 = new File(str, InterfaceC3865f6.OooO0OO);
        File file4 = new File(str, InterfaceC3865f6.OooO0Oo);
        File file5 = new File(str, InterfaceC3865f6.OooO0o0);
        File file6 = new File(str, InterfaceC3865f6.OooO0o);
        File file7 = new File(str, InterfaceC3865f6.OooO0oo);
        String absolutePath = AppContext.OooO00o().getFilesDir().getAbsolutePath();
        String str3 = "initMQScript --> PATH_APPFILE =" + absolutePath;
        File file8 = new File(C4048k4.OooO(absolutePath, InterfaceC3865f6.OooO00o));
        File file9 = new File(C4048k4.OooO(absolutePath, InterfaceC3865f6.OooO0O0));
        File file10 = new File(C4048k4.OooO(absolutePath, InterfaceC3865f6.OooO0OO));
        File file11 = new File(C4048k4.OooO(absolutePath, InterfaceC3865f6.OooO0Oo));
        File file12 = new File(C4048k4.OooO(absolutePath, InterfaceC3865f6.OooO0o0));
        File file13 = new File(C4048k4.OooO(absolutePath, InterfaceC3865f6.OooO0o));
        File file14 = new File(C4048k4.OooO(absolutePath, InterfaceC3865f6.OooO0oO));
        File file15 = new File(C4048k4.OooO(absolutePath, InterfaceC3865f6.OooO0oo));
        this.OooO0O0 = file.exists() || file2.exists() || file3.exists() || file4.exists() || file5.exists() || file6.exists();
        String str4 = "initMQScript -->  isUseSdcardScript=" + this.OooO0O0;
        if (this.OooO0O0) {
            if (1 == C3683a9.OooO00o(AppContext.OooO00o())) {
                this.OooO0O0 = true;
            } else {
                this.OooO0O0 = false;
            }
        }
        String str5 = "initMQScript -->  compareScriptVersion=" + this.OooO0O0;
        try {
            Script scriptOooO0OO = C4533x8.OooO0OO(this.OooO0O0 ? new FileInputStream(file2) : AppContext.OooO00o().getAssets().open(InterfaceC3865f6.OooO0O0));
            this.OooO00o = scriptOooO0OO;
            if (!this.OooO0O0) {
                file = file8;
            }
            scriptOooO0OO.setLcFile(file);
            Script script = this.OooO00o;
            if (!this.OooO0O0) {
                file2 = file9;
            }
            script.setPropFile(file2);
            Script script2 = this.OooO00o;
            if (!this.OooO0O0) {
                file3 = file10;
            }
            script2.setAtcFile(file3);
            Script script3 = this.OooO00o;
            if (!this.OooO0O0) {
                file4 = file11;
            }
            script3.setUiFile(file4);
            Script script4 = this.OooO00o;
            if (!this.OooO0O0) {
                file5 = file12;
            }
            script4.setUipFile(file5);
            Script script5 = this.OooO00o;
            if (!this.OooO0O0) {
                file6 = file13;
            }
            script5.setRtdFile(file6);
            this.OooO00o.setInfoFile(this.OooO0O0 ? file7 : file15);
            this.OooO00o.setCfgFile(file14);
            C3716b5.OooO0OO().OooO0oO(this.OooO00o.getVersion());
            if (this.OooO0O0) {
                C3977i7.OooO().OooOOO0(OooO0Oo().OooO0OO(), OooO0Oo().OooO0o0(), OooO0Oo().OooO0o());
            }
            String str6 = "initMQScript --> cfgFile absolutePath = " + this.OooO00o.getCfgFile().getAbsolutePath() + ",isUseSdcardScript=" + this.OooO0O0;
            String str7 = "initMQScript --> 4 AppId1=" + this.OooO00o.getAppId() + ",Version=" + this.OooO00o.getVersion();
            String str8 = "initMQScript --> 5 mScript=" + this.OooO00o.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OooO00o() {
        if (this.OooO00o != null) {
            this.OooO00o = null;
        }
    }

    public String OooO0O0() {
        if (C4010j3.OooO0O0().endsWith("/")) {
            return C4010j3.OooO0O0();
        }
        return C4010j3.OooO0O0() + "/";
    }

    public String OooO0OO() {
        String strOooO0O0;
        Script script;
        EngineParams engineParams = new EngineParams(C3834ec.OooO0OO().OooO00o(AppContext.OooO00o()));
        engineParams.PackageName = AppContext.OooO00o().getPackageName();
        if (C4010j3.OooO0O0().endsWith("/")) {
            strOooO0O0 = C4010j3.OooO0O0();
        } else {
            strOooO0O0 = C4010j3.OooO0O0() + "/";
        }
        engineParams.BaseURL = strOooO0O0;
        engineParams.PayAppId = this.OooO00o.getAppId();
        Script script2 = this.OooO00o;
        engineParams.ScriptType = (script2 == null || !TextUtils.isEmpty(script2.getAppId())) && ((script = this.OooO00o) == null || !TextUtils.isEmpty(script.getVersion()));
        Script script3 = this.OooO00o;
        engineParams.AppVersion = (script3 == null || !TextUtils.isEmpty(script3.getVersion())) ? this.OooO00o.getVersion() : AppContext.OooO00o().getString(R.string.pay_vsersion);
        engineParams.authDesKeys = C4010j3.OooO0OO;
        engineParams.keys = C4125m7.OooO0o0().OooO0Oo();
        engineParams.f15896id = this.OooO00o.getId();
        return C4159n4.OooO0O0(engineParams);
    }

    public String OooO0o() {
        return "d6c9aaeed6c9abd9c8cffed0cef3d8cbcccfd0d7c9cfd7fdc9aaccc0d6c9aaeed6c9aad1cecff6d2c0f1abd8d7dffedecfa9dcd2cfaaf6f3d7aac8c8c8cfd0d8cfccccd8cbcec8d2cef1dcdfcbaad0eacfcfeed9c0abdcded7dfdcf2fed2d8ddc8cef6d6c3a8eed7ccdefed6f9d2eaf6cdcfafd4d4f4d8e9c9cbf5a8d4dec0e2f9d9a3c8f8a8afeafea9d4d1cbc2eac9fff1f6ded7dfd4d6cfddaeaefea9f2f0c9e0d0c3c3f6d8d9d1a8c0cdf9c2fef1c3f1d0cec8a8fec8c3cfd7e8c8ccc8f0c0dcfef5ccf7eacfc8aaccf0f9f1f1e2d9f1eeacd7cdabdcffcfeedff8f1dcecc3cecbe0f9f7dcdccbcfccebc0f6f6e2d6a9d8ecc3f6d0acc3f6feabfbe3a2a9cccdedafcfccfee0f9dff6e0d4f3a3f7cba9d4f6c3f0dccdf9cdeedcc0abd8dcfea9f1aac8ddaad1d4f0d4a8ccf7abe3c3abd4d2c8f1d0d7d1abd4acc8c2eaa9c9cfc8d8cfcfdcd9d9f3aaeed6c9aaeec8cfafdfd3dcd8cccbf1e2d0cbe3d8d6c8ccf1eed6c9aaeed6cbf5a7";
    }

    public String OooO0o0() {
        return "d6c9aaeed6c9abd9c8cffed0cef3d8c9cfaadffdcfdcd0d0ccf1dccfc8c9d8d6c8ccf1eed6c9aaeed6cbead4c9cff6decddcdcd0cbf1dcd8c9aad0f4cfcfc8f6d7cfdcedd1a9d8decfdceae2c8cef2aefecddcacf9abc0ddc3a9c0abcfdfd0d9ccdec8ccccf7f6a8cbe0d8eacce0f6e2cfced8c0f8cddcdccea8ccf2c9f1f2e2d9f6eaf7feaad3e0fff7afc9fef7fdecf9ccdceac0cedceffef7eeefc0aad4f3fff1ede8d5d2f2d0c9cffde8cedffef4f8f6cfecf8aac8c9fbe0c0f2f8dcfeeffff0ccd0f8a9fed5c9ddfdaeccf6dceec0ccd0f5fbaaf1d1c3aad0cbd7f4d0aec0cceae2d4a9d4e8d6aafef3ccaae2afc8dcf6d3d5dfabdec3f4ccafd1e0d3abfbcfeac0d5ccf5e2ffddc0d1fbd2d4cbcbe0d3e0f8dcc8d5d7aaccecc3cefecccddccbaffeaaf6dfcbccdcd8cbfdead8f8aafed8c8f1a3e3cba9d4c3cba8afdfcef3eed3fff0cce0f8cddcd2fbf7f6fbf8dfd0aad6abc8cacbf4fee2fef4fecbc9cfead6cea9f6f1f8ddf2eeccf4ead4d4dfa3d5c3f4c0aafff0dcd1fba8afacc8f1d4ccd9f7afeec8ddaff2ccf0d8e2d5cde2d1c9f6c0f3f9f1d4d4ccf1eaebd4dcf6d8d4c2d8ecf9cddcf6cdcedfecc3f6d8abfecddcd5cbf4d0c9ccd2f2d9d7f7afe3ccf6c0f4c9f7d0cdf9a8eac2c8f6f9e0c0a9c3abd7f7d7d1d7aac0e9c3cdf2cafea8cce8cdddabdcf8ccc8f2f9f7cca9c8ccc0ced7ced4f6cce3eef3c3abfed6d5dedcd7cecfede3ffd2d4f7c3cff2c8cef1d4a9c9cfccdecfccdcdff9cde2aaffd2fda8cfdfc3ecc9f0c0ecc8edeae2ceaaaeaff9e0d4ebc9f7afccfedffde8d7dec8cef8c2f2cdfbddafc2c8dedbafd4c2c8acc9e0c8d9d7aac0a9fba9d7e2c0f0fec8ccaaafd9fbc2f2f4d7f4d8dcd4f0dcf7f9a8ede0d4cdf2d8ccdcd0c8d4d2d0a9d9f7e2f4d5dff9e8d5ddd7abcbcdeedccbcef2aff9ddf6a9ceddd4f6c9ced3aec9e3a2e2ccc9a3ddc3cef2c0cccda3ddc8dfd0e3c3a8e2aad5cffed8d4a8fed7cfcde2fbd4abfed7ccabf6dcfbf1ccf5d1abf6ebc9dcdbd1fbf6d0d1c0dff1edc8cdafc3d5dec0aefbcec8fbc8a8cfedc9f1dcf5f9aaede2c8f1ccf6f8c2eae2f8f1cce3feaaead9cbcff6c3d4dcdbaed4f7f2a8c9cfc8e8c3a9c0ecd4d2dcaff9dcf2cad7d2eac8fba8afc9d4fdead5cff4f5e2cba8f6d3fbaaccf0c9ded8c8c0a8c8e8feccf6efc9f6cca9fbabd7aeceaafee9cff4cccecff4c0d6d7c2d8caf8cfe2ebcdf4f5e3c0c2feeed7f1e2afcbabf6f3cddfc0abc0dda3defbaad4c8cfcfd4afd9f7dcd6cedccba8f8a8dfe8cccfe2f2f9e0c0d8f9f1c0defbdddfa8cccdfecefef6ead6fbf6cbe3cce0fecfcecde2cdd6a9d4c2d4cfe2d2cef1e9e2c3cdabe3fef3eed4cfddead6ccf7a3ccfbdefeccfef0c8eacedecfd1fff0c0f3c0c2fed1fbe3a3c9f9aaabafcbcdc0d8fedfeecbf8abead8fbaad3a8f8f4c8e8c8e0c0cdcff0f2cdcedec0abc8aaf2effbf6cbaecfdcfeeccff6d4cac0cda3fbcccef2aafff6c8c2cfdfd7abcfd2f6f7fffdf5a9c8cfabd3d5cff2e2f9dcccd6fbe0dce8c0f1cbe8c9ddfec8d4cec0d2cdf1abcef9dcdcd7cbcdfeccd5cdabe3d4aae9e0f8d2d3edc8cdc3e3c9fdf5eed6c9aaeed6cfccd5c8d9d8c9cfaadffdcfdcd0d0ccf1dccfc8c9d8d6c8ccf1eed6c9aaeed6cbf5a7";
    }

    public Script OooO0oO() {
        return this.OooO00o;
    }

    public void OooO0oo() {
    }

    public void OooOO0() {
        if (this.OooO00o == null) {
            throw new RuntimeException("script info not exist");
        }
        C3977i7.OooO().Oooo000(this.OooO00o.getLcFile().getAbsolutePath(), this.OooO00o.getAtcFile().getAbsolutePath(), this.OooO00o.getCfgFile().getAbsolutePath(), 0, this.OooO0Oo, C4125m7.OooO0o0().OooO0o(), C4125m7.OooO0o0().OooO0oO(), AppContext.OooO00o().getString(R.string.pay_appid), AppContext.OooO00o().getString(R.string.pay_vsersion));
    }

    public boolean OooOO0O() {
        Script script;
        Script script2 = this.OooO00o;
        return !(script2 == null || TextUtils.isEmpty(script2.getAppId())) || ((script = this.OooO00o) != null && TextUtils.isEmpty(script.getVersion()));
    }

    public boolean OooOO0o() {
        return C3683a9.OooO(AppContext.OooO00o(), this.OooO0O0);
    }

    public void OooOOO() {
        OooO();
    }

    public void OooOOO0(long j) {
        String str = "ENGIN_MQRUNNER_TOKENKEY: setTokenKey = " + j;
        this.OooO0Oo = j;
    }
}
