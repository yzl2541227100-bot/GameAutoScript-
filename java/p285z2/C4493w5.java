package p285z2;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import com.cyjh.common.util.toast.ImageUtils;
import com.cyjh.common.util.toast.KeyboardUtils;
import com.cyjh.common.util.toast.ThreadUtils;
import java.util.List;
import p285z2.C4419u5;

/* JADX INFO: renamed from: z2.w5 */
/* JADX INFO: loaded from: classes.dex */
public class C4493w5 {
    public static List<Activity> OooO() {
        return C4456v5.OooO0oO.OooOO0O();
    }

    public static void OooO00o(Activity activity, C4419u5.OooO00o oooO00o) {
        C4456v5.OooO0oO.OooO0Oo(activity, oooO00o);
    }

    public static void OooO0O0(C4419u5.OooO00o oooO00o) {
        C4456v5.OooO0oO.OooO0o0(oooO00o);
    }

    public static void OooO0OO(C4419u5.OooO0o oooO0o) {
        C4456v5.OooO0oO.OooO0oO(oooO0o);
    }

    public static int OooO0Oo(float f) {
        return C4308r5.OooO0O0(f);
    }

    public static void OooO0o() {
        C3938h5.OooO();
    }

    public static boolean OooO0o0(CharSequence charSequence, CharSequence charSequence2) {
        return C4345s5.OooO00o(charSequence, charSequence2);
    }

    public static void OooO0oO(Activity activity) {
        KeyboardUtils.OooO0o(activity);
    }

    public static String OooO0oo(@Nullable String str, Object... objArr) {
        return C4345s5.OooO0OO(str, objArr);
    }

    public static int OooOO0() {
        return C4271q5.OooO0Oo();
    }

    public static Application OooOO0O() {
        return C4456v5.OooO0oO.OooOOOO();
    }

    public static String OooOO0o() {
        return C4197o5.OooO0O0();
    }

    public static Intent OooOOO(String str, boolean z) {
        return C4086l5.OooO0O0(str, z);
    }

    public static String OooOOO0() {
        return C4197o5.OooO0o();
    }

    public static Intent OooOOOO(String str) {
        return C4086l5.OooO0OO(str);
    }

    public static String OooOOOo(String str) {
        return C3938h5.Oooo0(str);
    }

    public static C4234p5 OooOOo() {
        return C4234p5.OooOO0O("Utils");
    }

    public static int OooOOo0() {
        return C4049k5.OooO00o();
    }

    public static int OooOOoo() {
        return C4049k5.OooO0O0();
    }

    public static boolean OooOo(Activity activity) {
        return C3938h5.OoooO0(activity);
    }

    public static String OooOo0(@StringRes int i, Object... objArr) {
        return C4345s5.OooO0o0(i, objArr);
    }

    public static String OooOo00(@StringRes int i) {
        return C4345s5.OooO0Oo(i);
    }

    public static Activity OooOo0O() {
        return C4456v5.OooO0oO.OooOOOo();
    }

    public static void OooOo0o(Application application) {
        C4456v5.OooO0oO.OooOOo0(application);
    }

    @RequiresApi(api = 23)
    public static boolean OooOoO() {
        return C4160n5.OooO00o();
    }

    public static boolean OooOoO0() {
        return C4456v5.OooO0oO.OooOOo();
    }

    public static boolean OooOoOO(Intent intent) {
        return C4086l5.OooO0Oo(intent);
    }

    public static boolean OooOoo(String str) {
        return C4345s5.OooO0oo(str);
    }

    public static boolean OooOoo0() {
        return C4530x5.OooO0O0();
    }

    public static View OooOooO(@LayoutRes int i) {
        return C4530x5.OooO0OO(i);
    }

    public static void OooOooo() {
        Oooo000(C3975i5.OooOO0O());
    }

    public static void Oooo0(C4419u5.OooO00o oooO00o) {
        C4456v5.OooO0oO.OooOo0o(oooO00o);
    }

    private static void Oooo000(Runnable... runnableArr) {
        for (Runnable runnable : runnableArr) {
            ThreadUtils.OooooO0().execute(runnable);
        }
    }

    public static void Oooo00O(Activity activity) {
        C4456v5.OooO0oO.OooOo0(activity);
    }

    public static void Oooo00o(Activity activity, C4419u5.OooO00o oooO00o) {
        C4456v5.OooO0oO.OooOo0O(activity, oooO00o);
    }

    public static void Oooo0O0(C4419u5.OooO0o oooO0o) {
        C4456v5.OooO0oO.OooOoO0(oooO0o);
    }

    public static void Oooo0OO(Runnable runnable) {
        ThreadUtils.o00oO0o(runnable);
    }

    public static void Oooo0o(Application application) {
        C4456v5.OooO0oO.OooOoo0(application);
    }

    public static void Oooo0o0(Runnable runnable, long j) {
        ThreadUtils.o00oO0O(runnable, j);
    }

    public static Bitmap Oooo0oO(View view) {
        return ImageUtils.o00000oO(view);
    }
}
