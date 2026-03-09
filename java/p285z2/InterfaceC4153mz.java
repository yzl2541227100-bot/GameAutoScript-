package p285z2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: z2.mz */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4153mz {
    public static final InterfaceC4153mz OooO00o = new OooO00o();

    /* JADX INFO: renamed from: z2.mz$OooO00o */
    public class OooO00o implements InterfaceC4153mz {
        @Override // p285z2.InterfaceC4153mz
        public c10 OooO00o(File file) throws FileNotFoundException {
            return u00.OooOO0O(file);
        }

        @Override // p285z2.InterfaceC4153mz
        public b10 OooO0O0(File file) throws FileNotFoundException {
            try {
                return u00.OooO0o(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return u00.OooO0o(file);
            }
        }

        @Override // p285z2.InterfaceC4153mz
        public void OooO0OO(File file) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    OooO0OO(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }

        @Override // p285z2.InterfaceC4153mz
        public boolean OooO0Oo(File file) {
            return file.exists();
        }

        @Override // p285z2.InterfaceC4153mz
        public void OooO0o(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // p285z2.InterfaceC4153mz
        public void OooO0o0(File file, File file2) throws IOException {
            OooO0o(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // p285z2.InterfaceC4153mz
        public b10 OooO0oO(File file) throws FileNotFoundException {
            try {
                return u00.OooO00o(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return u00.OooO00o(file);
            }
        }

        @Override // p285z2.InterfaceC4153mz
        public long OooO0oo(File file) {
            return file.length();
        }
    }

    c10 OooO00o(File file) throws FileNotFoundException;

    b10 OooO0O0(File file) throws FileNotFoundException;

    void OooO0OO(File file) throws IOException;

    boolean OooO0Oo(File file);

    void OooO0o(File file) throws IOException;

    void OooO0o0(File file, File file2) throws IOException;

    b10 OooO0oO(File file) throws FileNotFoundException;

    long OooO0oo(File file);
}
