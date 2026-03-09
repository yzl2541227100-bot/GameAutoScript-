package p285z2;

import com.cyjh.mobileanjian.ipc.interfaces.OnRootApplyCallback;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: z2.ie */
/* JADX INFO: loaded from: classes2.dex */
public final class C3984ie {
    private static final String OooO0oO = "echo \"rootOK\"\n";
    public static C3984ie OooO0oo;
    public OnRootApplyCallback OooO00o = null;
    public OooO0OO OooO0O0 = null;
    public boolean OooO0OO = false;
    public DataOutputStream OooO0Oo = null;
    public InputStream OooO0o0 = null;
    public Process OooO0o = null;

    /* JADX INFO: renamed from: z2.ie$OooO00o */
    public class OooO00o extends Thread {
        public final /* synthetic */ Process OoooOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Process process) {
            super(str);
            this.OoooOoO = process;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        
            r0.printStackTrace();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            return;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r2 = this;
                java.io.InputStreamReader r0 = new java.io.InputStreamReader
                java.lang.Process r1 = r2.OoooOoO
                java.io.InputStream r1 = r1.getErrorStream()
                r0.<init>(r1)
                java.io.BufferedReader r1 = new java.io.BufferedReader
                r1.<init>(r0)
            L10:
                java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L29
                if (r0 != 0) goto L10
                r1.close()     // Catch: java.io.IOException -> L1a
                return
            L1a:
                r0 = move-exception
                r0.printStackTrace()
                return
            L1f:
                r0 = move-exception
                r1.close()     // Catch: java.io.IOException -> L24
                goto L28
            L24:
                r1 = move-exception
                r1.printStackTrace()
            L28:
                throw r0
            L29:
                r1.close()     // Catch: java.io.IOException -> L2d
                return
            L2d:
                r0 = move-exception
                r0.printStackTrace()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p285z2.C3984ie.OooO00o.run():void");
        }
    }

    /* JADX INFO: renamed from: z2.ie$OooO0O0 */
    public class OooO0O0 extends Thread {
        public final /* synthetic */ boolean OoooOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, boolean z) {
            super(str);
            this.OoooOoO = z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C3984ie.this.OooO0o0));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            if (line.equals("rootOK")) {
                                C3984ie c3984ie = C3984ie.this;
                                c3984ie.OooO0OO = true;
                                OnRootApplyCallback onRootApplyCallback = c3984ie.OooO00o;
                                if (onRootApplyCallback != null) {
                                    onRootApplyCallback.onObtained();
                                }
                                if (this.OoooOoO) {
                                }
                            }
                        }
                        try {
                            return;
                        } catch (IOException e) {
                            return;
                        }
                    } finally {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                    try {
                        bufferedReader.close();
                        return;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z2.ie$OooO0OO */
    public class OooO0OO extends Thread {
        private OooO0OO() {
        }

        public /* synthetic */ OooO0OO(C3984ie c3984ie, byte b) {
            this();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                try {
                    C3984ie.this.OooO0o = Runtime.getRuntime().exec("xu");
                } catch (Exception e) {
                    new StringBuilder("requestRoot(xu) --:  Exception: ").append(e.getMessage());
                    C3984ie.this.OooO0o = Runtime.getRuntime().exec("su");
                }
                C3984ie.this.OooO0Oo = new DataOutputStream(C3984ie.this.OooO0o.getOutputStream());
                C3984ie c3984ie = C3984ie.this;
                c3984ie.OooO0o0 = c3984ie.OooO0o.getInputStream();
                C3984ie.this.OooO0Oo.writeBytes(C3984ie.OooO0oO);
                C3984ie.this.OooO0Oo.flush();
                C3984ie c3984ie2 = C3984ie.this;
                c3984ie2.new OooO00o("", c3984ie2.OooO0o);
                OooO0O0 oooO0O0 = c3984ie2.new OooO0O0("", false);
                oooO0O0.start();
                try {
                    oooO0O0.join();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                new StringBuilder("go straight here, mRoot = ").append(c3984ie2.OooO0OO);
                if (c3984ie2.OooO0OO) {
                    return;
                }
                c3984ie2.OooO0o.destroy();
                OnRootApplyCallback onRootApplyCallback = c3984ie2.OooO00o;
                if (onRootApplyCallback != null) {
                    onRootApplyCallback.onRefused();
                }
                try {
                    c3984ie2.OooO0Oo.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                new StringBuilder("requestRoot() --:  Exception: ").append(e4.getMessage());
                Process process = C3984ie.this.OooO0o;
                if (process != null) {
                    process.destroy();
                }
                OnRootApplyCallback onRootApplyCallback2 = C3984ie.this.OooO00o;
                if (onRootApplyCallback2 != null) {
                    onRootApplyCallback2.onRefused();
                }
                e4.printStackTrace();
            }
        }
    }

    public static synchronized C3984ie OooO00o() {
        if (OooO0oo == null) {
            OooO0oo = new C3984ie();
        }
        return OooO0oo;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0022 -> B:13:0x0025). Please report as a decompilation issue!!! */
    private void OooO0oO(Process process, boolean z) {
        OooO00o oooO00o = new OooO00o("", process);
        OooO0O0 oooO0O0 = new OooO0O0("", z);
        if (z) {
            oooO00o.start();
        }
        oooO0O0.start();
        try {
            if (z) {
                try {
                    oooO00o.join();
                } catch (InterruptedException unused) {
                }
                oooO0O0.join();
            } else {
                oooO0O0.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new StringBuilder("go straight here, mRoot = ").append(this.OooO0OO);
        if (this.OooO0OO) {
            return;
        }
        this.OooO0o.destroy();
        OnRootApplyCallback onRootApplyCallback = this.OooO00o;
        if (onRootApplyCallback != null) {
            onRootApplyCallback.onRefused();
        }
        try {
            this.OooO0Oo.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private static /* synthetic */ void OooOO0(C3984ie c3984ie, Process process) {
        c3984ie.new OooO00o("", process);
        OooO0O0 oooO0O0 = c3984ie.new OooO0O0("", false);
        oooO0O0.start();
        try {
            oooO0O0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new StringBuilder("go straight here, mRoot = ").append(c3984ie.OooO0OO);
        if (c3984ie.OooO0OO) {
            return;
        }
        c3984ie.OooO0o.destroy();
        OnRootApplyCallback onRootApplyCallback = c3984ie.OooO00o;
        if (onRootApplyCallback != null) {
            onRootApplyCallback.onRefused();
        }
        try {
            c3984ie.OooO0Oo.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private boolean OooOO0O() {
        return this.OooO0OO;
    }

    private void OooOOO0() {
        if (this.OooO0OO) {
            OooO0oo("exit");
            if (this.OooO0O0.isAlive()) {
                this.OooO0O0.interrupt();
            }
            try {
                this.OooO0Oo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        OooO0oo = null;
    }

    private void OooOOOO() {
        OooO0OO oooO0OO = new OooO0OO(this, (byte) 0);
        this.OooO0O0 = oooO0OO;
        oooO0OO.start();
    }

    private static /* synthetic */ boolean OooOOOo(C3984ie c3984ie) {
        c3984ie.OooO0OO = true;
        return true;
    }

    public final void OooO0o(OnRootApplyCallback onRootApplyCallback) {
        if (this.OooO0OO) {
            onRootApplyCallback.onObtained();
        } else {
            this.OooO00o = onRootApplyCallback;
            OooOOOO();
        }
    }

    public final boolean OooO0oo(String str) {
        if (!this.OooO0OO) {
            return false;
        }
        try {
            this.OooO0Oo.write(str.getBytes());
            this.OooO0Oo.write("\n".getBytes());
            this.OooO0Oo.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return true;
        }
    }
}
