package p285z2;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p285z2.ed0;
import p285z2.jd0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ed0<T extends ed0<T>> {
    private jd0 OooO00o;
    private cd0 OooO0O0;
    private ScheduledThreadPoolExecutor OooO0OO;
    private boolean OooO0Oo = true;
    private final fd0 OooO0o0 = new fd0();

    public T OooO(String str) {
        this.OooO00o = new jd0.OooOO0O(str);
        return (T) OooOo00();
    }

    public cd0 OooO00o() throws IOException {
        jd0 jd0Var = this.OooO00o;
        Objects.requireNonNull(jd0Var, "Source is not set");
        return jd0Var.OooO00o(this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.OooO0o0);
    }

    public T OooO0O0(ContentResolver contentResolver, Uri uri) {
        this.OooO00o = new jd0.OooOOOO(contentResolver, uri);
        return (T) OooOo00();
    }

    public T OooO0OO(AssetFileDescriptor assetFileDescriptor) {
        this.OooO00o = new jd0.OooO0O0(assetFileDescriptor);
        return (T) OooOo00();
    }

    public T OooO0Oo(AssetManager assetManager, String str) {
        this.OooO00o = new jd0.OooO0OO(assetManager, str);
        return (T) OooOo00();
    }

    public T OooO0o(File file) {
        this.OooO00o = new jd0.OooOO0O(file);
        return (T) OooOo00();
    }

    public T OooO0o0(Resources resources, int i) {
        this.OooO00o = new jd0.OooOOO(resources, i);
        return (T) OooOo00();
    }

    public T OooO0oO(FileDescriptor fileDescriptor) {
        this.OooO00o = new jd0.OooOO0(fileDescriptor);
        return (T) OooOo00();
    }

    public T OooO0oo(InputStream inputStream) {
        this.OooO00o = new jd0.OooOOO0(inputStream);
        return (T) OooOo00();
    }

    public T OooOO0(ByteBuffer byteBuffer) {
        this.OooO00o = new jd0.OooO(byteBuffer);
        return (T) OooOo00();
    }

    public T OooOO0O(byte[] bArr) {
        this.OooO00o = new jd0.OooO0o(bArr);
        return (T) OooOo00();
    }

    public ScheduledThreadPoolExecutor OooOO0o() {
        return this.OooO0OO;
    }

    public cd0 OooOOO() {
        return this.OooO0O0;
    }

    public jd0 OooOOO0() {
        return this.OooO00o;
    }

    public fd0 OooOOOO() {
        return this.OooO0o0;
    }

    public boolean OooOOOo() {
        return this.OooO0Oo;
    }

    public T OooOOo(boolean z) {
        this.OooO0Oo = z;
        return (T) OooOo00();
    }

    @qd0
    public T OooOOo0(@Nullable fd0 fd0Var) {
        this.OooO0o0.OooO0O0(fd0Var);
        return (T) OooOo00();
    }

    public T OooOOoo(@IntRange(from = 1, m1to = b00.OooOOoo) int i) {
        this.OooO0o0.OooO0Oo(i);
        return (T) OooOo00();
    }

    public T OooOo(cd0 cd0Var) {
        this.OooO0O0 = cd0Var;
        return (T) OooOo00();
    }

    public T OooOo0(boolean z) {
        return (T) OooOOo(z);
    }

    public abstract T OooOo00();

    public T OooOo0O(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.OooO0OO = scheduledThreadPoolExecutor;
        return (T) OooOo00();
    }

    public T OooOo0o(int i) {
        this.OooO0OO = new ScheduledThreadPoolExecutor(i);
        return (T) OooOo00();
    }
}
