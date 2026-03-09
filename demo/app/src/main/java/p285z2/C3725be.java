package p285z2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;
import p285z2.C4151mx;
import p285z2.C4225ox;

/* JADX INFO: renamed from: z2.be */
/* JADX INFO: loaded from: classes2.dex */
public class C3725be {
    private static C3725be OooO0o = null;
    private static String OooO0o0 = "be";
    private final C4151mx OooO00o;
    private InterfaceC4335rw OooO0O0;
    private RandomAccessFile OooO0OO;
    private int OooO0Oo;

    /* JADX INFO: renamed from: z2.be$OooO00o */
    public class OooO00o implements InterfaceC4372sw {
        public final /* synthetic */ OooO0OO OooO00o;
        public final /* synthetic */ String OooO0O0;
        public final /* synthetic */ String OooO0OO;

        public OooO00o(OooO0OO oooO0OO, String str, String str2) {
            this.OooO00o = oooO0OO;
            this.OooO0O0 = str;
            this.OooO0OO = str2;
        }

        @Override // p285z2.InterfaceC4372sw
        public void onFailure(InterfaceC4335rw interfaceC4335rw, IOException iOException) {
            this.OooO00o.OooO0O0(iOException);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00c7 A[Catch: IOException -> 0x00e1, TryCatch #3 {IOException -> 0x00e1, blocks: (B:42:0x00c2, B:44:0x00c7, B:45:0x00ca), top: B:49:0x00c2 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p285z2.InterfaceC4372sw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onResponse(p285z2.InterfaceC4335rw r18, p285z2.C4299qx r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p285z2.C3725be.OooO00o.onResponse(z2.rw, z2.qx):void");
        }
    }

    /* JADX INFO: renamed from: z2.be$OooO0O0 */
    public class OooO0O0 implements InterfaceC4372sw {
        public final /* synthetic */ OooO0OO OooO00o;
        public final /* synthetic */ String OooO0O0;
        public final /* synthetic */ String OooO0OO;

        public OooO0O0(OooO0OO oooO0OO, String str, String str2) {
            this.OooO00o = oooO0OO;
            this.OooO0O0 = str;
            this.OooO0OO = str2;
        }

        @Override // p285z2.InterfaceC4372sw
        public void onFailure(InterfaceC4335rw interfaceC4335rw, IOException iOException) {
            this.OooO00o.OooO0O0(iOException);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00c7 A[Catch: IOException -> 0x00e1, TryCatch #3 {IOException -> 0x00e1, blocks: (B:42:0x00c2, B:44:0x00c7, B:45:0x00ca), top: B:49:0x00c2 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p285z2.InterfaceC4372sw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onResponse(p285z2.InterfaceC4335rw r18, p285z2.C4299qx r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p285z2.C3725be.OooO0O0.onResponse(z2.rw, z2.qx):void");
        }
    }

    /* JADX INFO: renamed from: z2.be$OooO0OO */
    public interface OooO0OO {
        void OooO00o(long j, long j2, int i);

        void OooO0O0(Exception exc);

        void OooO0OO(File file);
    }

    private C3725be() {
        C4151mx.OooO0O0 oooO0O0 = new C4151mx.OooO0O0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.OooO00o = oooO0O0.OooO(60L, timeUnit).OooOoo(60L, timeUnit).Oooo0O0(60L, timeUnit).OooO0Oo();
    }

    public static /* synthetic */ int OooO0OO(C3725be c3725be, int i) {
        int i2 = c3725be.OooO0Oo + i;
        c3725be.OooO0Oo = i2;
        return i2;
    }

    public static C3725be OooO0oo() {
        if (OooO0o == null) {
            OooO0o = new C3725be();
        }
        return OooO0o;
    }

    public void OooO0o(String str, String str2, String str3, int i, OooO0OO oooO0OO) {
        String str4 = "download --> downLoadLength=" + this.OooO0Oo + ",contentLength=" + i;
        InterfaceC4335rw interfaceC4335rwOooO00o = this.OooO00o.OooO00o(new C4225ox.OooO00o().OooOOo0(str).OooO0O0());
        this.OooO0O0 = interfaceC4335rwOooO00o;
        interfaceC4335rwOooO00o.OooOO0(new OooO0O0(oooO0OO, str2, str3));
    }

    public void OooO0o0() {
        InterfaceC4335rw interfaceC4335rw = this.OooO0O0;
        if (interfaceC4335rw != null) {
            interfaceC4335rw.cancel();
        }
    }

    public void OooO0oO(String str, String str2, String str3, OooO0OO oooO0OO) {
        String str4 = "download 1 --> destFileDir=" + str2 + ",destFileName=" + str3;
        InterfaceC4335rw interfaceC4335rwOooO00o = this.OooO00o.OooO00o(new C4225ox.OooO00o().OooOOo0(str).OooO0O0());
        this.OooO0O0 = interfaceC4335rwOooO00o;
        interfaceC4335rwOooO00o.OooOO0(new OooO00o(oooO0OO, str2, str3));
    }
}
