package p285z2;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pl.droidsonroids.gif.GifIOException;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jd0 {

    public static final class OooO extends jd0 {
        private final ByteBuffer OooO00o;

        public OooO(@NonNull ByteBuffer byteBuffer) {
            super();
            this.OooO00o = byteBuffer;
        }

        @Override // p285z2.jd0
        public GifInfoHandle OooO0OO() throws GifIOException {
            return new GifInfoHandle(this.OooO00o);
        }
    }

    public static class OooO0O0 extends jd0 {
        private final AssetFileDescriptor OooO00o;

        public OooO0O0(@NonNull AssetFileDescriptor assetFileDescriptor) {
            super();
            this.OooO00o = assetFileDescriptor;
        }

        @Override // p285z2.jd0
        public GifInfoHandle OooO0OO() throws IOException {
            return new GifInfoHandle(this.OooO00o);
        }
    }

    public static final class OooO0OO extends jd0 {
        private final AssetManager OooO00o;
        private final String OooO0O0;

        public OooO0OO(@NonNull AssetManager assetManager, @NonNull String str) {
            super();
            this.OooO00o = assetManager;
            this.OooO0O0 = str;
        }

        @Override // p285z2.jd0
        public GifInfoHandle OooO0OO() throws IOException {
            return new GifInfoHandle(this.OooO00o.openFd(this.OooO0O0));
        }
    }

    public static final class OooO0o extends jd0 {
        private final byte[] OooO00o;

        public OooO0o(@NonNull byte[] bArr) {
            super();
            this.OooO00o = bArr;
        }

        @Override // p285z2.jd0
        public GifInfoHandle OooO0OO() throws GifIOException {
            return new GifInfoHandle(this.OooO00o);
        }
    }

    public static final class OooOO0 extends jd0 {
        private final FileDescriptor OooO00o;

        public OooOO0(@NonNull FileDescriptor fileDescriptor) {
            super();
            this.OooO00o = fileDescriptor;
        }

        @Override // p285z2.jd0
        public GifInfoHandle OooO0OO() throws IOException {
            return new GifInfoHandle(this.OooO00o);
        }
    }

    public static final class OooOO0O extends jd0 {
        private final String OooO00o;

        public OooOO0O(@NonNull File file) {
            super();
            this.OooO00o = file.getPath();
        }

        public OooOO0O(@NonNull String str) {
            super();
            this.OooO00o = str;
        }

        @Override // p285z2.jd0
        public GifInfoHandle OooO0OO() throws GifIOException {
            return new GifInfoHandle(this.OooO00o);
        }
    }

    public static class OooOOO extends jd0 {
        private final Resources OooO00o;
        private final int OooO0O0;

        public OooOOO(@NonNull Resources resources, @DrawableRes @RawRes int i) {
            super();
            this.OooO00o = resources;
            this.OooO0O0 = i;
        }

        @Override // p285z2.jd0
        public GifInfoHandle OooO0OO() throws IOException {
            return new GifInfoHandle(this.OooO00o.openRawResourceFd(this.OooO0O0));
        }
    }

    public static final class OooOOO0 extends jd0 {
        private final InputStream OooO00o;

        public OooOOO0(@NonNull InputStream inputStream) {
            super();
            this.OooO00o = inputStream;
        }

        @Override // p285z2.jd0
        public GifInfoHandle OooO0OO() throws IOException {
            return new GifInfoHandle(this.OooO00o);
        }
    }

    public static final class OooOOOO extends jd0 {
        private final ContentResolver OooO00o;
        private final Uri OooO0O0;

        public OooOOOO(@Nullable ContentResolver contentResolver, @NonNull Uri uri) {
            super();
            this.OooO00o = contentResolver;
            this.OooO0O0 = uri;
        }

        @Override // p285z2.jd0
        public GifInfoHandle OooO0OO() throws IOException {
            return GifInfoHandle.OooOoO0(this.OooO00o, this.OooO0O0);
        }
    }

    private jd0() {
    }

    public /* synthetic */ jd0(OooO00o oooO00o) {
        this();
    }

    public final cd0 OooO00o(cd0 cd0Var, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z, fd0 fd0Var) throws IOException {
        return new cd0(OooO0O0(fd0Var), cd0Var, scheduledThreadPoolExecutor, z);
    }

    public final GifInfoHandle OooO0O0(@NonNull fd0 fd0Var) throws IOException {
        GifInfoHandle gifInfoHandleOooO0OO = OooO0OO();
        gifInfoHandleOooO0OO.Oooo0OO(fd0Var.OooO00o, fd0Var.OooO0O0);
        return gifInfoHandleOooO0OO;
    }

    public abstract GifInfoHandle OooO0OO() throws IOException;
}
