package p285z2;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.StyleSpan;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.http.bean.response.RegCodeStatusInfo;
import com.ywfzjbcy.R;

/* JADX INFO: renamed from: z2.q7 */
/* JADX INFO: loaded from: classes.dex */
public class C4273q7 {
    private static C4273q7 OooO0o = null;
    public static boolean OooO0oO = true;
    private String OooO00o;
    private int OooO0OO;
    private long OooO0O0 = -1;
    public int OooO0Oo = -1;
    private boolean OooO0o0 = false;

    private String OooO00o() {
        long jCurrentTimeMillis = (this.OooO0O0 - (System.currentTimeMillis() / 1000)) / 60;
        return jCurrentTimeMillis > 0 ? OooO0O0(jCurrentTimeMillis) : "";
    }

    private String OooO0O0(long j) {
        return C3937h4.OooO00o(AppContext.OooO00o(), j);
    }

    @SuppressLint({"StringFormatMatches"})
    private String OooO0OO() {
        if (C4125m7.OooO0o0().OooO0Oo <= 0) {
            this.OooO0Oo = 3;
            return AppContext.OooO00o().getString(R.string.optionfragment_duetime_no);
        }
        this.OooO0Oo = 1;
        return OooO0oo(String.format(AppContext.OooO00o().getString(R.string.optionfragment_unpaid), Integer.valueOf(C4125m7.OooO0o0().OooO0Oo)), C4125m7.OooO0o0().OooO0Oo + "分钟", "", "").toString();
    }

    public static C4273q7 OooO0o0() {
        if (OooO0o == null) {
            synchronized (C4273q7.class) {
                if (OooO0o == null) {
                    C4273q7 c4273q7 = new C4273q7();
                    OooO0o = c4273q7;
                    return c4273q7;
                }
            }
        }
        return OooO0o;
    }

    public int OooO() {
        return this.OooO0OO;
    }

    public long OooO0Oo() {
        return this.OooO0O0;
    }

    public String OooO0o() {
        if (!TextUtils.isEmpty(this.OooO00o)) {
            return this.OooO00o;
        }
        if (this.OooO0o0) {
            return "";
        }
        OooOO0O();
        return TextUtils.isEmpty(this.OooO00o) ? "" : this.OooO00o;
    }

    public String OooO0oO() {
        return (TextUtils.isEmpty(this.OooO00o) || this.OooO0O0 == -1) ? OooO0OO() : OooO00o();
    }

    public SpannableString OooO0oo(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        int iIndexOf = str.indexOf(str2);
        int length = (str2.length() + iIndexOf) - 2;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), iIndexOf, length, 17);
        spannableString.setSpan(new BackgroundColorSpan(Color.parseColor("#2964AA")), iIndexOf, length, 17);
        if (TextUtils.isEmpty(str3)) {
            return spannableString;
        }
        int iIndexOf2 = str.indexOf(str3);
        int length2 = (str3.length() + iIndexOf2) - 2;
        spannableString.setSpan(new StyleSpan(1), iIndexOf2, length2, 17);
        spannableString.setSpan(new BackgroundColorSpan(Color.parseColor("#2964AA")), iIndexOf2, length2, 17);
        if (TextUtils.isEmpty(str4)) {
            return spannableString;
        }
        int iIndexOf3 = str.indexOf(str4);
        int length3 = (str4.length() + iIndexOf3) - 1;
        spannableString.setSpan(new StyleSpan(1), iIndexOf3, length3, 17);
        spannableString.setSpan(new BackgroundColorSpan(Color.parseColor("#2964AA")), iIndexOf3, length3, 17);
        return spannableString;
    }

    public void OooOO0() {
        if (OooO0oO) {
            long jCurrentTimeMillis = (this.OooO0O0 - (System.currentTimeMillis() / 1000)) / 60;
            if (jCurrentTimeMillis > 0) {
                C3753c5.OooO0OO(AppContext.OooO00o(), "注册码" + C3937h4.OooO00o(AppContext.OooO00o(), jCurrentTimeMillis));
            }
        }
    }

    public void OooOO0O() {
        String strOooOO0 = C3688ae.OooOO0(InterfaceC4047k3.o0OOO0o + C4010j3.OooO0o(), AppContext.OooO00o());
        String strOooOO02 = C3688ae.OooOO0(InterfaceC4047k3.o0Oo0oo + C4010j3.OooO0o(), AppContext.OooO00o());
        if (!TextUtils.isEmpty(strOooOO02)) {
            RegCodeStatusInfo regCodeStatusInfo = (RegCodeStatusInfo) C4159n4.OooO0o0(strOooOO02, RegCodeStatusInfo.class);
            if (regCodeStatusInfo == null) {
                return;
            } else {
                strOooOO0 = regCodeStatusInfo.regCode;
            }
        }
        OooOOO0(strOooOO0);
    }

    public void OooOO0o(long j) {
        this.OooO0O0 = j;
    }

    public void OooOOO(int i) {
        this.OooO0Oo = i;
    }

    public void OooOOO0(String str) {
        this.OooO00o = str;
    }

    public void OooOOOO(int i) {
        this.OooO0OO = i;
    }
}
