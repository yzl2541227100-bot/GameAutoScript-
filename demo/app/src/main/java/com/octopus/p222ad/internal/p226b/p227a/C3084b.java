package com.octopus.p222ad.internal.p226b.p227a;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.octopus.p222ad.internal.p226b.C3105m;
import com.octopus.p222ad.internal.p226b.InterfaceC3082a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3084b implements InterfaceC3082a {

    /* JADX INFO: renamed from: a */
    public File f17034a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC3083a f17035b;

    /* JADX INFO: renamed from: c */
    private RandomAccessFile f17036c;

    public C3084b(File file, InterfaceC3083a interfaceC3083a) throws C3105m {
        File file2;
        try {
            if (interfaceC3083a == null) {
                throw new NullPointerException();
            }
            this.f17035b = interfaceC3083a;
            C3086d.m14255a(file.getParentFile());
            boolean zExists = file.exists();
            if (zExists) {
                file2 = file;
            } else {
                file2 = new File(file.getParentFile(), file.getName() + ".download");
            }
            this.f17034a = file2;
            this.f17036c = new RandomAccessFile(this.f17034a, zExists ? C1781c.f10296bk : "rw");
        } catch (IOException e) {
            throw new C3105m("Error using file " + file + " as disc cache", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m14253a(File file) {
        return file.getName().endsWith(".download");
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3082a
    /* JADX INFO: renamed from: a */
    public synchronized int mo14246a() throws C3105m {
        try {
        } catch (IOException e) {
            throw new C3105m("Error reading length of file " + this.f17034a, e);
        }
        return (int) this.f17036c.length();
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3082a
    /* JADX INFO: renamed from: a */
    public synchronized int mo14247a(byte[] bArr, long j, int i) throws C3105m {
        try {
            this.f17036c.seek(j);
        } catch (IOException e) {
            throw new C3105m(String.format("Error reading %d bytes with offset %d failFrom file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(mo14246a()), Integer.valueOf(bArr.length)), e);
        }
        return this.f17036c.read(bArr, 0, i);
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3082a
    /* JADX INFO: renamed from: a */
    public synchronized void mo14248a(byte[] bArr, int i) throws C3105m {
        try {
            if (mo14251d()) {
                throw new C3105m("Error append cache: cache file " + this.f17034a + " is completed!");
            }
            this.f17036c.seek(mo14246a());
            this.f17036c.write(bArr, 0, i);
        } catch (IOException e) {
            throw new C3105m(String.format("Error writing %d bytes to %s failFrom buffer with size %d", Integer.valueOf(i), this.f17036c, Integer.valueOf(bArr.length)), e);
        }
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3082a
    /* JADX INFO: renamed from: b */
    public synchronized void mo14249b() throws C3105m {
        try {
            this.f17036c.close();
            this.f17035b.mo14252a(this.f17034a);
        } catch (IOException e) {
            throw new C3105m("Error closing file " + this.f17034a, e);
        }
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3082a
    /* JADX INFO: renamed from: c */
    public synchronized void mo14250c() throws C3105m {
        if (mo14251d()) {
            return;
        }
        mo14249b();
        File file = new File(this.f17034a.getParentFile(), this.f17034a.getName().substring(0, this.f17034a.getName().length() - 9));
        if (!this.f17034a.renameTo(file)) {
            throw new C3105m("Error renaming file " + this.f17034a + " to " + file + " for completion!");
        }
        this.f17034a = file;
        try {
            this.f17036c = new RandomAccessFile(this.f17034a, C1781c.f10296bk);
        } catch (IOException e) {
            throw new C3105m("Error opening " + this.f17034a + " as disc cache", e);
        }
    }

    @Override // com.octopus.p222ad.internal.p226b.InterfaceC3082a
    /* JADX INFO: renamed from: d */
    public synchronized boolean mo14251d() {
        return !m14253a(this.f17034a);
    }
}
