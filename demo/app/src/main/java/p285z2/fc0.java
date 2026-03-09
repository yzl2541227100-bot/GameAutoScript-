package p285z2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fc0 {
    private String OooO00o;
    private List<dc0> OooO0O0 = new ArrayList();
    private String OooO0OO;

    public void OooO(String str) {
        this.OooO00o = str;
    }

    public void OooO00o(dc0 dc0Var) {
        this.OooO0O0.add(dc0Var);
    }

    public boolean OooO0O0(String str) {
        for (int i = 0; i < this.OooO0O0.size(); i++) {
            if (str.equalsIgnoreCase(this.OooO0O0.get(i).OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public String OooO0OO() {
        return this.OooO0OO;
    }

    public dc0 OooO0Oo(String str) {
        for (dc0 dc0Var : this.OooO0O0) {
            if (dc0Var.OooO00o().equalsIgnoreCase(str)) {
                return dc0Var;
            }
        }
        return null;
    }

    public String OooO0o() {
        return this.OooO00o;
    }

    public List<dc0> OooO0o0() {
        return this.OooO0O0;
    }

    public void OooO0oO(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.OooO0O0.size()) {
                i = -1;
                break;
            } else if (str.equalsIgnoreCase(this.OooO0O0.get(i).OooO00o())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.OooO0O0.remove(i);
        }
    }

    public void OooO0oo(String str) {
        this.OooO0OO = str;
    }
}
