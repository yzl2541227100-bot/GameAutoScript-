package p285z2;

import android.app.Application;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.MsgItem;
import com.cyjh.http.bean.response.BaseResponseInfo;
import com.cyjh.http.bean.response.BindRegCodeResponse;
import com.cyjh.http.bean.response.RegCodeInfoResponse;
import com.cyjh.http.bean.response.RegCodeStatusInfo;
import p285z2.C3940h7;

/* JADX INFO: renamed from: z2.ma */
/* JADX INFO: loaded from: classes.dex */
public class C4128ma extends AndroidViewModel implements InterfaceC3798dd, InterfaceC3983id {
    private static final String OooooOO = "z2.ma";
    private C4167nc OoooOoO;
    private C4500wc OoooOoo;
    private String Ooooo00;
    private MutableLiveData<BaseResponseInfo> Ooooo0o;
    private MutableLiveData<RegCodeInfoResponse> OooooO0;

    /* JADX INFO: renamed from: z2.ma$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RegCodeStatusInfo regCodeStatusInfo = new RegCodeStatusInfo();
            regCodeStatusInfo.status = 1;
            regCodeStatusInfo.regCode = C4128ma.this.Ooooo00;
            String strOooO0O0 = C4159n4.OooO0O0(regCodeStatusInfo);
            C3688ae.Oooo0o(C4128ma.this.getApplication(), InterfaceC4047k3.o0Oo0oo + C4010j3.OooO0o(), strOooO0O0);
            C4496w8.OooOO0o(201);
        }
    }

    /* JADX INFO: renamed from: z2.ma$OooO0O0 */
    public class OooO0O0 implements C3940h7.OooOO0 {

        /* JADX INFO: renamed from: z2.ma$OooO0O0$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4496w8.OooO0oO(C4125m7.OooO0o0().OooO0o(), C4125m7.OooO0o0().OooO0oO());
            }
        }

        public OooO0O0() {
        }

        @Override // p285z2.C3940h7.OooOO0
        public void OooO00o(Object obj) {
            String unused = C4128ma.OooooOO;
            C3827e5.OooO00o().OooO0o(new OooO00o());
        }

        @Override // p285z2.C3940h7.OooOO0
        public void OooO0O0() {
            String unused = C4128ma.OooooOO;
        }
    }

    public C4128ma(@NonNull Application application) {
        super(application);
        this.Ooooo0o = new MutableLiveData<>();
        this.OooooO0 = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: OooOoO0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void OooOoO() {
        C3940h7.OooO0Oo(new OooO0O0(), false);
    }

    @Override // p285z2.InterfaceC3983id
    public void OooO0oo(String str) {
        this.OooooO0.postValue(new RegCodeInfoResponse(0, str));
    }

    @Override // p285z2.InterfaceC3798dd
    public void OooOOOO(BaseResponseInfo baseResponseInfo) {
        C4273q7.OooO0o0().OooOO0o(0L);
        this.Ooooo00 = "";
        this.Ooooo0o.postValue(baseResponseInfo);
    }

    @Override // p285z2.InterfaceC3983id
    public void OooOOOo(RegCodeInfoResponse regCodeInfoResponse) {
        this.OooooO0.postValue(regCodeInfoResponse);
    }

    @Override // p285z2.InterfaceC3798dd
    public void OooOOoo(BindRegCodeResponse bindRegCodeResponse) {
        if (200 != bindRegCodeResponse.Code) {
            OooOOOO(new BaseResponseInfo(bindRegCodeResponse.Code, bindRegCodeResponse.Message));
            if (bindRegCodeResponse.Code == 1401 && TextUtils.equals(this.Ooooo00, C4273q7.OooO0o0().OooO0o())) {
                this.Ooooo00 = "";
                C4273q7.OooO0o0().OooOOO0("");
                C3951hi.OooOOO(C4273q7.OooO0o0().OooO0o());
                C3688ae.OooO0OO(InterfaceC4047k3.o0Oo0oo + C4010j3.OooO0o(), AppContext.OooO00o());
                return;
            }
            return;
        }
        BindRegCodeResponse.RegCodeTimeInfo regCodeTimeInfo = bindRegCodeResponse.Data;
        long j = regCodeTimeInfo.ExpireTime;
        long j2 = regCodeTimeInfo.ServerTimestamp;
        C4273q7.OooO0o0().OooOO0o(j);
        String str = "onBindSuc --> expireTime=" + j + ",serverTimestamp=" + j2 + ",dueTime=" + ((j - j2) / 60);
        C4240pb.OooO00o().OooO00o(new OooO00o());
        C4273q7.OooO0o0().OooOOO0(this.Ooooo00);
        j10.OooO0o().OooOOOO(new MsgItem.BindRegCodeBus(j));
        this.Ooooo0o.postValue(new BaseResponseInfo(bindRegCodeResponse.Code, bindRegCodeResponse.Message));
        new Handler().postDelayed(new Runnable() { // from class: z2.ka
            @Override // java.lang.Runnable
            public final void run() {
                this.OoooOoO.OooOoO();
            }
        }, 1000L);
    }

    public MutableLiveData<RegCodeInfoResponse> OooOo() {
        return this.OooooO0;
    }

    public void OooOo0O(String str, int i) {
        if (this.OoooOoO == null) {
            this.OoooOoO = new C4167nc(this);
        }
        this.Ooooo00 = str;
        this.OoooOoO.OooO0OO(str, getApplication(), i, C4273q7.OooO0o0().OooO0o());
    }

    public MutableLiveData<BaseResponseInfo> OooOo0o() {
        return this.Ooooo0o;
    }

    public void OooOoOO(String str) {
        if (this.OoooOoo == null) {
            this.OoooOoo = new C4500wc(this);
        }
        this.OoooOoo.OooO0o(str, C4273q7.OooO0o0().OooO0o(), getApplication());
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C4167nc c4167nc = this.OoooOoO;
        if (c4167nc != null) {
            c4167nc.OooO0o();
        }
        C4500wc c4500wc = this.OoooOoo;
        if (c4500wc != null) {
            c4500wc.OooO0OO();
        }
    }
}
