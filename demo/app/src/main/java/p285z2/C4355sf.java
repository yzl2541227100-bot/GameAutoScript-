package p285z2;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import org.apache.commons.p284io.FileUtils;
import org.apache.commons.p284io.FilenameUtils;

/* JADX INFO: renamed from: z2.sf */
/* JADX INFO: loaded from: classes2.dex */
public final class C4355sf {
    private static final String OooO00o = "script";

    private static C4209og OooO00o(Context context, @NonNull C4209og c4209og) throws Exception {
        File file = new File(context.getFilesDir(), OooO00o);
        if (file.exists()) {
            FileUtils.deleteDirectory(file);
        } else {
            file.mkdirs();
            file.setReadable(true, false);
            file.setExecutable(true, false);
        }
        File[] fileArr = {new File(c4209og.OooO00o()), new File(c4209og.OooOo00()), new File(c4209og.OooO0Oo())};
        File file2 = new File(file, FilenameUtils.getName(c4209og.OooO00o()));
        File file3 = new File(file, FilenameUtils.getName(c4209og.OooOo00()));
        File file4 = new File(file, FilenameUtils.getName(c4209og.OooO0Oo()));
        File[] fileArr2 = new File[3];
        fileArr2[0] = file2;
        fileArr2[1] = file3;
        fileArr2[2] = file4;
        for (int i = 0; i < 3; i++) {
            if (fileArr[i].exists()) {
                FileUtils.copyFile(fileArr[i], fileArr2[i]);
                fileArr2[i].setReadable(true, false);
            } else {
                fileArr2[i] = fileArr[i];
            }
        }
        C4209og c4209ogClone = c4209og.clone();
        c4209ogClone.OooOo0O(file2.getAbsolutePath()).OooOo(file3.getAbsolutePath()).OooOOOo(file4.getAbsolutePath());
        return c4209ogClone;
    }
}
