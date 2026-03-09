package p285z2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.ywfzjbcy.R;
import java.io.File;

/* JADX INFO: renamed from: z2.v8 */
/* JADX INFO: loaded from: classes.dex */
public class C4459v8 {

    /* JADX INFO: renamed from: z2.v8$OooO00o */
    public class OooO00o extends SimpleTarget<Bitmap> {
        public final /* synthetic */ InterfaceC4051k7 OoooOoO;

        public OooO00o(InterfaceC4051k7 interfaceC4051k7) {
            this.OoooOoO = interfaceC4051k7;
        }

        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable InterfaceC4526x1<? super Bitmap> interfaceC4526x1) {
            InterfaceC4051k7 interfaceC4051k7 = this.OoooOoO;
            if (interfaceC4051k7 != null) {
                interfaceC4051k7.OooO00o(bitmap);
            }
        }

        @Override // com.bumptech.glide.request.target.Target
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable InterfaceC4526x1 interfaceC4526x1) {
            onResourceReady((Bitmap) obj, (InterfaceC4526x1<? super Bitmap>) interfaceC4526x1);
        }
    }

    /* JADX INFO: renamed from: z2.v8$OooO0O0 */
    public class OooO0O0 implements InterfaceC4193o1<File> {
        public final /* synthetic */ InterfaceC4193o1 OoooOoO;

        public OooO0O0(InterfaceC4193o1 interfaceC4193o1) {
            this.OoooOoO = interfaceC4193o1;
        }

        @Override // p285z2.InterfaceC4193o1
        public boolean OooO00o(@Nullable GlideException glideException, Object obj, Target<File> target, boolean z) {
            InterfaceC4193o1 interfaceC4193o1 = this.OoooOoO;
            if (interfaceC4193o1 != null) {
                return interfaceC4193o1.OooO00o(glideException, obj, target, z);
            }
            return false;
        }

        @Override // p285z2.InterfaceC4193o1
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public boolean OooO0O0(File file, Object obj, Target<File> target, DataSource dataSource, boolean z) {
            InterfaceC4193o1 interfaceC4193o1 = this.OoooOoO;
            if (interfaceC4193o1 != null) {
                return interfaceC4193o1.OooO0O0(file, obj, target, dataSource, z);
            }
            return false;
        }
    }

    private C4459v8() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void OooO(Context context, String str, ImageView imageView, o0O0o000 o0o0o000) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooO(str).OooOO0O(new C4230p1().o0OOO0o(R.drawable.bg_normal_pic).OooOoO0(R.drawable.bg_normal_pic).o0OO00O(Priority.NORMAL).o00000Oo(o0o0o000)).o0000oOO(imageView);
        }
    }

    public static void OooO00o(Context context, String str, C4230p1 c4230p1, InterfaceC4051k7 interfaceC4051k7) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooOOO0().OooO(str).OooOO0O(c4230p1).o0000o0o(new OooO00o(interfaceC4051k7));
        }
    }

    public static C4230p1 OooO0O0() {
        return new C4230p1().o0OOO0o(R.drawable.bg_normal_pic).OooOoO0(R.drawable.bg_normal_pic).o0OO00O(Priority.NORMAL);
    }

    public static C4230p1 OooO0OO() {
        return new C4230p1().OooOOO0().o0OOO0o(R.drawable.bg_normal_pic).OooOoO0(R.drawable.bg_normal_pic).o0OO00O(Priority.NORMAL);
    }

    public static boolean OooO0Oo(Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return Build.VERSION.SDK_INT >= 17 ? (activity.isDestroyed() || activity.isFinishing()) ? false : true : !activity.isFinishing();
    }

    public static void OooO0o(Context context, int i, ImageView imageView, C4230p1 c4230p1) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooO0oo(Integer.valueOf(i)).OooOO0O(c4230p1).o0000oOO(imageView);
        }
    }

    public static void OooO0o0(Context context, int i, ImageView imageView) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooO0oo(Integer.valueOf(i)).OooOO0O(OooO0O0()).o0000oOO(imageView);
        }
    }

    public static void OooO0oO(Context context, File file, ImageView imageView) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooO0Oo(file).OooOO0O(OooO0O0()).o0000oOO(imageView);
        }
    }

    public static void OooO0oo(Context context, String str, ImageView imageView) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooO(str).OooOO0O(OooO0O0()).o0000oOO(imageView);
        }
    }

    public static void OooOO0(Context context, String str, ImageView imageView, C4230p1 c4230p1) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooO(str).OooOO0O(c4230p1).o0000oOO(imageView);
        }
    }

    public static void OooOO0O(Context context, byte[] bArr, ImageView imageView) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooO0OO(bArr).OooOO0O(new C4230p1().o0OOO0o(R.drawable.bg_normal_pic).OooOoO0(R.drawable.bg_normal_pic).o0OO00O(Priority.HIGH).OooOOoo(o0oo0000.OooO00o)).o0000oOO(imageView);
        }
    }

    public static void OooOO0o(Context context, String str, ImageView imageView) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooOOOo().OooO(str).o0000oOO(imageView);
        }
    }

    @SuppressLint({"CheckResult"})
    public static void OooOOO(Context context, String str, InterfaceC4193o1<File> interfaceC4193o1) {
        if (OooO0Oo(context)) {
            o0O0o<File> o0o0oOooOo00 = o00Oo00.OooOooO(context).OooOo00();
            o0o0oOooOo00.OooO(str);
            o0o0oOooOo00.o0000oo0(new OooO0O0(interfaceC4193o1));
            o0o0oOooOo00.o000O0Oo();
        }
    }

    public static void OooOOO0(Context context, String str, ImageView imageView, C4230p1 c4230p1) {
        if (OooO0Oo(context)) {
            o00Oo00.OooOooO(context).OooOOOo().OooO(str).OooOO0O(c4230p1).o0000oOO(imageView);
        }
    }
}
