package p285z2;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.util.concurrent.Executors;
import p285z2.C3725be;

/* JADX INFO: renamed from: z2.cc */
/* JADX INFO: loaded from: classes2.dex */
public class C3760cc {
    private static String OooO0Oo = "cc";
    private static C3760cc OooO0o0;
    private Context OooO00o;
    private OooO0o OooO0O0;
    public C3725be.OooO0OO OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: z2.cc$OooO00o */
    public class OooO00o implements C3725be.OooO0OO {
        public OooO00o() {
        }

        @Override // p285z2.C3725be.OooO0OO
        public void OooO00o(long j, long j2, int i) {
        }

        @Override // p285z2.C3725be.OooO0OO
        public void OooO0O0(Exception exc) {
            String unused = C3760cc.OooO0Oo;
            String str = "onDownloadFailed --> exception=" + exc.getMessage();
            if (C3760cc.this.OooO0O0 != null) {
                C3760cc.this.OooO0O0.OooO0O0("下载语音识别库失败！");
            }
        }

        @Override // p285z2.C3725be.OooO0OO
        public void OooO0OO(File file) {
            String unused = C3760cc.OooO0Oo;
            String str = "onDownloadSuccess --> file=" + file.getName();
            C3760cc.this.new OooO0O0(file).executeOnExecutor(Executors.newCachedThreadPool(), new Void[0]);
        }
    }

    /* JADX INFO: renamed from: z2.cc$OooO0O0 */
    public class OooO0O0 extends AsyncTask<Void, Void, Boolean> {
        private File OooO00o;

        public OooO0O0(File file) {
            this.OooO00o = file;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            boolean zOooO0OO = C3901g5.OooO0OO(this.OooO00o, C4011j4.OooO0o(InterfaceC4047k3.o00000O0 + File.separator + InterfaceC4047k3.o0000oO));
            C4011j4.OooO(this.OooO00o);
            String unused = C3760cc.OooO0Oo;
            String str = "DeleteZipTask doInBackground --> result=" + zOooO0OO;
            return Boolean.valueOf(zOooO0OO);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (C3760cc.this.OooO0O0 != null) {
                if (bool.booleanValue()) {
                    C3760cc.this.OooO0O0.OooO0OO();
                } else {
                    C3760cc.this.OooO0O0.OooO0O0("下载语音识别库失败！");
                }
            }
        }
    }

    /* JADX INFO: renamed from: z2.cc$OooO0OO */
    public class OooO0OO extends AsyncTask<String, Void, Void> {
        private Context OooO00o;

        public OooO0OO(Context context) {
            this.OooO00o = context;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                File fileOooO0o = C4011j4.OooO0o(InterfaceC4047k3.o00000O0 + File.separator + InterfaceC4047k3.o0000oO);
                File file = new File(fileOooO0o, InterfaceC4047k3.o0000O0);
                File file2 = new File(fileOooO0o, InterfaceC4047k3.o0000O0);
                C4011j4.OooO(file);
                C4011j4.OooO(file2);
                String strSubstring = strArr[0].substring(strArr[0].lastIndexOf("/"));
                File fileOooOO0o = C4011j4.OooOO0o(strArr[1], strSubstring);
                String unused = C3760cc.OooO0Oo;
                String str = "LibraryDownloadTask doInBackground --> zipName=" + strSubstring + ", file path = " + fileOooOO0o.getAbsolutePath();
                C3725be.OooO0oo().OooO0o(strArr[0], fileOooOO0o.getParentFile().getAbsolutePath(), fileOooOO0o.getName(), -1, C3760cc.this.OooO0OO);
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: z2.cc$OooO0o */
    public interface OooO0o {
        void OooO00o();

        void OooO0O0(String str);

        void OooO0OO();
    }

    private C3760cc() {
    }

    public static C3760cc OooO0Oo() {
        if (OooO0o0 == null) {
            synchronized (C3760cc.class) {
                if (OooO0o0 == null) {
                    OooO0o0 = new C3760cc();
                }
            }
        }
        return OooO0o0;
    }

    private void OooO0oO(String str) {
        if (OooO0o()) {
            OooO0o oooO0o = this.OooO0O0;
            if (oooO0o != null) {
                oooO0o.OooO00o();
                return;
            }
            return;
        }
        String str2 = this.OooO00o.getPackageName() + File.separator + InterfaceC4047k3.o0000oO;
        String str3 = "libraryDownloadTask --> path=" + str2;
        new OooO0OO(this.OooO00o).executeOnExecutor(Executors.newCachedThreadPool(), str, str2);
    }

    public void OooO0OO(String str, OooO0o oooO0o) {
        String str2 = "download --> url=" + str;
        this.OooO0O0 = oooO0o;
        OooO0oO(str);
    }

    public boolean OooO0o() {
        String str = InterfaceC4047k3.o00000O + InterfaceC4047k3.o0000oO;
        File file = new File(str, InterfaceC4047k3.o0000O0);
        File file2 = new File(str, InterfaceC4047k3.o0000O0O);
        return file.exists() && file.length() > 0 && file2.exists() && file2.length() > 0;
    }

    public C3760cc OooO0o0(Context context) {
        this.OooO00o = context;
        return this;
    }
}
