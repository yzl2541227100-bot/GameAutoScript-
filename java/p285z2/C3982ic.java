package p285z2;

import android.content.Context;
import com.cyjh.http.bean.request.UpdateRequestInfo;
import com.cyjh.http.bean.response.VersionUpdateInfo;

/* JADX INFO: renamed from: z2.ic */
/* JADX INFO: loaded from: classes2.dex */
public class C3982ic implements InterfaceC3908gc, InterfaceC4094ld {
    public static final int Ooooo00 = 2;
    public static final int Ooooo0o = 3;
    private static C3982ic OooooO0;
    private C4130mc OoooOoO;
    private OooO00o OoooOoo;

    /* JADX INFO: renamed from: z2.ic$OooO00o */
    public interface OooO00o {
        void OooO00o(VersionUpdateInfo versionUpdateInfo);

        void OooO0O0(VersionUpdateInfo versionUpdateInfo);

        void OooO0OO(VersionUpdateInfo versionUpdateInfo);
    }

    private C3982ic() {
    }

    public static C3982ic OooOo00() {
        if (OooooO0 == null) {
            OooooO0 = new C3982ic();
        }
        return OooooO0;
    }

    @Override // p285z2.InterfaceC4094ld
    public void OooO00o(VersionUpdateInfo versionUpdateInfo) {
        OooO00o oooO00o = this.OoooOoo;
        if (oooO00o != null) {
            oooO00o.OooO00o(versionUpdateInfo);
        }
    }

    @Override // p285z2.InterfaceC4094ld
    public void OooO0O0(VersionUpdateInfo versionUpdateInfo) {
        OooO00o oooO00o = this.OoooOoo;
        if (oooO00o != null) {
            oooO00o.OooO0O0(versionUpdateInfo);
        }
    }

    @Override // p285z2.InterfaceC4094ld
    public void OooO0o(String str) {
        this.OoooOoo.OooO0OO(null);
    }

    @Override // p285z2.InterfaceC4094ld
    public void OooOO0(VersionUpdateInfo versionUpdateInfo) {
        OooO00o oooO00o = this.OoooOoo;
        if (oooO00o != null) {
            oooO00o.OooO0OO(versionUpdateInfo);
        }
    }

    @Override // p285z2.InterfaceC4094ld
    public void OooOOO0() {
        this.OoooOoo.OooO0OO(null);
    }

    public void OooOo(boolean z, Context context, UpdateRequestInfo updateRequestInfo) {
        C4130mc c4130mc = new C4130mc(context, this, z, updateRequestInfo);
        this.OoooOoO = c4130mc;
        c4130mc.OooO0o(context);
    }

    public void OooOo0() {
        C4130mc c4130mc = this.OoooOoO;
        if (c4130mc != null) {
            c4130mc.OooO0OO();
        }
    }

    public C3982ic OooOo0O(OooO00o oooO00o) {
        this.OoooOoo = oooO00o;
        return this;
    }

    public void OooOo0o(boolean z, Context context) {
        C4130mc c4130mc = new C4130mc(context, this, z);
        this.OoooOoO = c4130mc;
        c4130mc.OooO0o(context);
    }
}
