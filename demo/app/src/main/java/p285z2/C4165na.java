package p285z2;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: z2.na */
/* JADX INFO: loaded from: classes.dex */
public class C4165na extends AndroidViewModel {
    private OooO0O0 OooO00o;
    private MutableLiveData<Integer> OooO0O0;

    /* JADX INFO: renamed from: z2.na$OooO0O0 */
    public class OooO0O0 implements Runnable {
        private OooO0O0() {
        }

        public /* synthetic */ OooO0O0(C4165na c4165na, OooO00o oooO00o) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4165na.this.OooOo0();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C4165na(@NonNull Application application) {
        super(application);
        this.OooO0O0 = new MutableLiveData<>();
    }

    public void OooOo() {
        C3977i7.OooO().Oooo0O0(C3718b7.OooO0Oo().OooO0oO().getLcFile().getAbsolutePath(), C4125m7.OooO0o0().OooO0o(), C4125m7.OooO0o0().OooO0oO(), C3718b7.OooO0Oo().OooO0Oo);
        OooOo00();
        C4162n7.OooO00o().OooO0OO(false);
        C3950hh.OooO0Oo().OooOO0O();
        C3691ah.OooO0Oo(ViewOnClickListenerC3943ha.class.getCanonicalName());
    }

    public void OooOo0() throws Exception {
        MutableLiveData<Integer> mutableLiveData = this.OooO0O0;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(1);
        }
    }

    public void OooOo00() {
        String str = "ScriptDataManager.getInstance().isUseSdcardScript1 = " + C3718b7.OooO0Oo().OooO0O0;
    }

    public MutableLiveData<Integer> OooOo0O() {
        return this.OooO0O0;
    }

    public void OooOo0o() {
        C3977i7.OooO().Oooo0o0();
        C3691ah.OooO0OO(ViewOnClickListenerC3943ha.class.getCanonicalName());
    }

    public void OooOoO0() {
        this.OooO00o = new OooO0O0();
        C4240pb.OooO00o().OooO00o(this.OooO00o);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        if (this.OooO00o != null) {
            C4240pb.OooO00o().OooO0OO(this.OooO00o);
        }
    }
}
