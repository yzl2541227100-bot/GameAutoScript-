package com.octopus.p222ad.internal.p226b.p227a;

import com.octopus.p222ad.internal.utilities.HaoboLog;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.a.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3087e implements InterfaceC3083a {

    /* JADX INFO: renamed from: a */
    private final ExecutorService f17037a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.octopus.ad.internal.b.a.e$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: b */
        private final File f17039b;

        public a(File file) {
            this.f17039b = file;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            AbstractC3087e.this.m14265b(this.f17039b);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14263a(List<File> list) {
        long jM14264b = m14264b(list);
        int size = list.size();
        for (File file : list) {
            if (!mo14266a(file, jM14264b, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    jM14264b -= length;
                    HaoboLog.m14611i(HaoboLog.lruDiskUsageLogTag, "Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    HaoboLog.m14609e(HaoboLog.lruDiskUsageLogTag, "Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private long m14264b(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m14265b(File file) throws IOException {
        C3086d.m14257c(file);
        m14263a(C3086d.m14256b(file.getParentFile()));
    }

    @Override // com.octopus.p222ad.internal.p226b.p227a.InterfaceC3083a
    /* JADX INFO: renamed from: a */
    public void mo14252a(File file) throws IOException {
        this.f17037a.submit(new a(file));
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo14266a(File file, long j, int i);
}
