package p285z2;

import android.text.TextUtils;
import com.cyjh.mobileanjian.ipc.share.proto.Ipc;

/* JADX INFO: renamed from: z2.og */
/* JADX INFO: loaded from: classes2.dex */
public class C4209og implements InterfaceC4356sg, InterfaceC4393tg, Cloneable {
    public static final int o00O0O = -2;
    public static final int o00Oo0 = -1;
    public static final int o00Ooo = 0;
    public static final int o00o0O = 1;
    public String OoooOoO;
    public String OoooOoo;
    public String Ooooo00;
    public String Ooooo0o;
    public String OooooO0;
    public int OooooOO;
    public int OooooOo;
    public long Oooooo;
    public int Oooooo0;
    public boolean OoooooO;
    public boolean Ooooooo;
    public String o0OoOo0;
    public String ooOO;

    public C4209og() {
        this.OoooOoO = "";
        this.OoooOoo = "";
        this.Ooooo00 = "";
        this.Ooooo0o = "";
        this.OooooO0 = "";
        this.OooooOO = 0;
        this.OooooOo = 1;
        this.Oooooo0 = -2;
        this.Oooooo = 0L;
        this.OoooooO = false;
        this.Ooooooo = false;
        this.o0OoOo0 = "";
        this.ooOO = "";
    }

    public C4209og(String str, String str2, String str3) {
        this.OoooOoO = "";
        this.OoooOoo = "";
        this.Ooooo00 = "";
        this.Ooooo0o = "";
        this.OooooO0 = "";
        this.OooooOO = 0;
        this.OooooOo = 1;
        this.Oooooo0 = -2;
        this.Oooooo = 0L;
        this.OoooooO = false;
        this.Ooooooo = false;
        this.o0OoOo0 = "";
        this.ooOO = "";
        this.OoooOoO = str;
        this.OoooOoo = str2;
        this.Ooooo00 = str3;
    }

    public static C4209og OooOoo(Ipc.IpcMessage ipcMessage) {
        C4209og c4209og = new C4209og();
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    c4209og.OooOo0o(ipcMessage.getArg1(i)).OooOo0O(ipcMessage.getArg2(i)).OooOo0(ipcMessage.getArg4(i));
                    break;
                case 1:
                    c4209og.OooO(ipcMessage.getArg1(i)).OooOo(ipcMessage.getArg2(i));
                    break;
                case 2:
                    c4209og.OooOOO(ipcMessage.getArg1(i)).OooOOOo(ipcMessage.getArg2(i));
                    break;
                case 3:
                    c4209og.OooOOoo(ipcMessage.getArg1(i) != 0).OooO0o(ipcMessage.getArg2(i));
                    break;
                case 4:
                    c4209og.OooO0oo(ipcMessage.getArg2(i));
                    break;
                case 5:
                    String arg2 = ipcMessage.getArg2(i);
                    if (!TextUtils.isEmpty(arg2)) {
                        c4209og.OooO0oO(arg2);
                    }
                    break;
                case 6:
                    String arg22 = ipcMessage.getArg2(i);
                    if (!TextUtils.isEmpty(arg22)) {
                        c4209og.OooO0o0(arg22);
                    }
                    break;
            }
        }
        c4209og.OooOOoo(ipcMessage.getEncrypt());
        return c4209og;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooO(int i) {
        if (i >= 0) {
            this.OooooOo = i;
            this.Oooooo0 = -2;
        }
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public String OooO00o() {
        return this.OoooOoO;
    }

    @Override // p285z2.InterfaceC4356sg
    public String OooO0O0() {
        return this.OooooO0;
    }

    @Override // p285z2.InterfaceC4356sg
    public int OooO0OO() {
        return this.OooooOO;
    }

    @Override // p285z2.InterfaceC4356sg
    public String OooO0Oo() {
        return this.Ooooo00;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooO0o(String str) {
        this.Ooooo0o = str;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooO0o0(String str) {
        this.ooOO = str;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooO0oO(String str) {
        this.o0OoOo0 = str;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooO0oo(String str) {
        this.OooooO0 = str;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public String OooOO0O() {
        return this.o0OoOo0;
    }

    @Override // p285z2.InterfaceC4356sg
    public boolean OooOO0o() {
        return this.OoooooO;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooOOO(int i) {
        if (i > 0) {
            this.Oooooo0 = i;
            this.OooooOo = -1;
        }
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public String OooOOO0() {
        return this.ooOO;
    }

    @Override // p285z2.InterfaceC4393tg
    public Ipc.IpcMessage OooOOOO(int i) {
        String str;
        Ipc.IpcMessage.Builder cmd = Ipc.IpcMessage.newBuilder().setCmd(i);
        for (int i2 = 0; i2 < 7; i2++) {
            switch (i2) {
                case 0:
                    cmd.addArg1(this.OooooOO);
                    cmd.addArg2(this.OoooOoO);
                    cmd.addArg4(this.Oooooo);
                    continue;
                    break;
                case 1:
                    cmd.addArg1(this.OooooOo);
                    str = this.OoooOoo;
                    break;
                case 2:
                    cmd.addArg1(this.Oooooo0);
                    str = this.Ooooo00;
                    break;
                case 3:
                    cmd.addArg1(this.Ooooooo ? 1 : 0);
                    str = this.Ooooo0o;
                    break;
                case 4:
                    str = this.OooooO0;
                    break;
                case 5:
                    if (TextUtils.isEmpty(this.o0OoOo0)) {
                        this.o0OoOo0 = "";
                    }
                    str = this.o0OoOo0;
                    break;
                case 6:
                    if (TextUtils.isEmpty(this.ooOO)) {
                        this.ooOO = "";
                    }
                    str = this.ooOO;
                    break;
                default:
                    break;
            }
            cmd.addArg2(str);
        }
        cmd.setEncrypt(this.OoooooO);
        return cmd.build();
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooOOOo(String str) {
        this.Ooooo00 = str;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooOOo(boolean z) {
        this.Ooooooo = z;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public int OooOOo0() {
        return this.OooooOo;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooOOoo(boolean z) {
        this.OoooooO = z;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooOo(String str) {
        this.OoooOoo = str;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooOo0(long j) {
        this.Oooooo = j;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public String OooOo00() {
        return this.OoooOoo;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooOo0O(String str) {
        this.OoooOoO = str;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public InterfaceC4356sg OooOo0o(int i) {
        this.OooooOO = i;
        return this;
    }

    @Override // p285z2.InterfaceC4356sg
    public int OooOoO() {
        return this.Oooooo0;
    }

    @Override // p285z2.InterfaceC4356sg
    public boolean OooOoO0() {
        return this.Ooooooo;
    }

    @Override // p285z2.InterfaceC4356sg
    public long OooOoOO() {
        return this.Oooooo;
    }

    /* JADX INFO: renamed from: OooOoo0 */
    public C4209og clone() {
        try {
            return (C4209og) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // p285z2.InterfaceC4356sg
    public String getAppId() {
        return this.Ooooo0o;
    }
}
