package p285z2;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.MsgItem;
import com.cyjh.http.bean.response.RegCodeInfoResponse;
import com.cyjh.http.bean.response.RegCodeStatusInfo;

/* JADX INFO: renamed from: z2.pa */
/* JADX INFO: loaded from: classes.dex */
public class C4239pa extends AndroidViewModel implements InterfaceC4057kd {
    private C4574yc OoooOoO;
    private String OoooOoo;
    private MutableLiveData<RegCodeInfoResponse> Ooooo00;

    public C4239pa(@NonNull Application application) {
        super(application);
        this.Ooooo00 = new MutableLiveData<>();
    }

    @Override // p285z2.InterfaceC4057kd
    public void OooO(RegCodeInfoResponse regCodeInfoResponse) {
        if (regCodeInfoResponse.Code == 200) {
            String strOooO0o = C4273q7.OooO0o0().OooO0o();
            if (!TextUtils.isEmpty(strOooO0o) && TextUtils.equals(strOooO0o, this.OoooOoo)) {
                j10.OooO0o().OooOOOO(new MsgItem.BindRegCodeBus(-1L));
                RegCodeStatusInfo regCodeStatusInfo = new RegCodeStatusInfo();
                regCodeStatusInfo.status = 2;
                regCodeStatusInfo.regCode = this.OoooOoo;
                String strOooO0O0 = C4159n4.OooO0O0(regCodeStatusInfo);
                C3688ae.Oooo0o(AppContext.OooO00o(), InterfaceC4047k3.o0Oo0oo + C4010j3.OooO0o(), strOooO0O0);
            }
        }
        this.Ooooo00.postValue(regCodeInfoResponse);
    }

    @Override // p285z2.InterfaceC4057kd
    public void OooO0Oo(String str) {
        this.Ooooo00.postValue(new RegCodeInfoResponse(-1, str));
    }

    public void OooOo0(String str) {
        if (this.OoooOoO == null) {
            this.OoooOoO = new C4574yc(this);
        }
        this.OoooOoo = str;
        this.OoooOoO.OooO0o(str, AppContext.OooO00o());
    }

    public MutableLiveData<RegCodeInfoResponse> OooOo00() {
        return this.Ooooo00;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C4574yc c4574yc = this.OoooOoO;
        if (c4574yc != null) {
            c4574yc.OooO0OO();
        }
    }
}
