package com.sun.mail.pop3;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class TempFile {
    private File file;

    /* JADX INFO: renamed from: sf */
    private WritableSharedFile f18033sf;

    public TempFile(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("pop3.", ".mbox", file);
        this.file = fileCreateTempFile;
        fileCreateTempFile.deleteOnExit();
        this.f18033sf = new WritableSharedFile(this.file);
    }

    public void close() {
        try {
            this.f18033sf.close();
        } catch (IOException unused) {
        }
        this.file.delete();
    }

    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public AppendStream getAppendStream() throws IOException {
        return this.f18033sf.getAppendStream();
    }
}
