package p285z2;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p285z2.C4419u5;

/* JADX INFO: renamed from: z2.j5 */
/* JADX INFO: loaded from: classes.dex */
public final class C4012j5 {

    /* JADX INFO: renamed from: z2.j5$OooO00o */
    public static class OooO00o {
        private String OooO00o;
        private String OooO0O0;
        private Drawable OooO0OO;
        private String OooO0Oo;
        private int OooO0o;
        private String OooO0o0;
        private boolean OooO0oO;

        public OooO00o(String str, String str2, Drawable drawable, String str3, String str4, int i, boolean z) {
            OooO(str2);
            OooO0oo(drawable);
            OooOO0(str);
            OooOO0O(str3);
            OooOOO(str4);
            OooOOO0(i);
            OooOO0o(z);
        }

        public void OooO(String str) {
            this.OooO0O0 = str;
        }

        public Drawable OooO00o() {
            return this.OooO0OO;
        }

        public String OooO0O0() {
            return this.OooO0O0;
        }

        public String OooO0OO() {
            return this.OooO00o;
        }

        public String OooO0Oo() {
            return this.OooO0Oo;
        }

        public String OooO0o() {
            return this.OooO0o0;
        }

        public int OooO0o0() {
            return this.OooO0o;
        }

        public boolean OooO0oO() {
            return this.OooO0oO;
        }

        public void OooO0oo(Drawable drawable) {
            this.OooO0OO = drawable;
        }

        public void OooOO0(String str) {
            this.OooO00o = str;
        }

        public void OooOO0O(String str) {
            this.OooO0Oo = str;
        }

        public void OooOO0o(boolean z) {
            this.OooO0oO = z;
        }

        public void OooOOO(String str) {
            this.OooO0o0 = str;
        }

        public void OooOOO0(int i) {
            this.OooO0o = i;
        }

        @NonNull
        public String toString() {
            return "{\n    pkg name: " + OooO0OO() + "\n    app icon: " + OooO00o() + "\n    app name: " + OooO0O0() + "\n    app path: " + OooO0Oo() + "\n    app v name: " + OooO0o() + "\n    app v code: " + OooO0o0() + "\n    is system: " + OooO0oO() + "\n}";
        }
    }

    private C4012j5() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @Nullable
    public static OooO00o OooO(String str) {
        try {
            PackageManager packageManager = C4419u5.OooO00o().getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return OooOo0O(packageManager, packageManager.getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void OooO00o() {
        C4493w5.OooO0o();
        System.exit(0);
    }

    @Nullable
    public static OooO00o OooO0O0(File file) {
        if (file != null && file.isFile() && file.exists()) {
            return OooO0OO(file.getAbsolutePath());
        }
        return null;
    }

    @Nullable
    public static OooO00o OooO0OO(String str) {
        PackageManager packageManager;
        PackageInfo packageArchiveInfo;
        if (C4493w5.OooOoo(str) || (packageManager = C4419u5.OooO00o().getPackageManager()) == null || (packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0)) == null) {
            return null;
        }
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        applicationInfo.sourceDir = str;
        applicationInfo.publicSourceDir = str;
        return OooOo0O(packageManager, packageArchiveInfo);
    }

    @Nullable
    public static Drawable OooO0Oo() {
        return OooO0o0(C4419u5.OooO00o().getPackageName());
    }

    public static int OooO0o() {
        return OooO0oO(C4419u5.OooO00o().getPackageName());
    }

    @Nullable
    public static Drawable OooO0o0(String str) {
        if (C4493w5.OooOoo(str)) {
            return null;
        }
        try {
            PackageManager packageManager = C4419u5.OooO00o().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int OooO0oO(String str) {
        if (C4493w5.OooOoo(str)) {
            return 0;
        }
        try {
            PackageInfo packageInfo = C4419u5.OooO00o().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.applicationInfo.icon;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Nullable
    public static OooO00o OooO0oo() {
        return OooO(C4419u5.OooO00o().getPackageName());
    }

    @NonNull
    public static String OooOO0() {
        return OooOO0O(C4419u5.OooO00o().getPackageName());
    }

    @NonNull
    public static String OooOO0O(String str) {
        if (C4493w5.OooOoo(str)) {
            return "";
        }
        try {
            PackageManager packageManager = C4419u5.OooO00o().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    @NonNull
    public static String OooOO0o() {
        return C4419u5.OooO00o().getPackageName();
    }

    @NonNull
    public static String OooOOO(String str) {
        if (C4493w5.OooOoo(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = C4419u5.OooO00o().getPackageManager().getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    @NonNull
    public static String OooOOO0() {
        return OooOOO(C4419u5.OooO00o().getPackageName());
    }

    public static int OooOOOO() {
        return OooOOOo(C4419u5.OooO00o().getPackageName());
    }

    public static int OooOOOo(String str) {
        try {
            return C4419u5.OooO00o().getPackageManager().getApplicationInfo(str, 0).uid;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int OooOOo(String str) {
        if (C4493w5.OooOoo(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = C4419u5.OooO00o().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int OooOOo0() {
        return OooOOo(C4419u5.OooO00o().getPackageName());
    }

    @NonNull
    public static String OooOOoo() {
        return OooOo00(C4419u5.OooO00o().getPackageName());
    }

    public static boolean OooOo(String str) {
        if (C4493w5.OooOoo(str)) {
            return false;
        }
        try {
            return (C4419u5.OooO00o().getPackageManager().getApplicationInfo(str, 0).flags & 2) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    @NonNull
    public static List<OooO00o> OooOo0() {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = C4419u5.OooO00o().getPackageManager();
        if (packageManager == null) {
            return arrayList;
        }
        Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            OooO00o oooO00oOooOo0O = OooOo0O(packageManager, it.next());
            if (oooO00oOooOo0O != null) {
                arrayList.add(oooO00oOooOo0O);
            }
        }
        return arrayList;
    }

    @NonNull
    public static String OooOo00(String str) {
        if (C4493w5.OooOoo(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = C4419u5.OooO00o().getPackageManager().getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static OooO00o OooOo0O(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        String str = packageInfo.versionName;
        int i = packageInfo.versionCode;
        String str2 = packageInfo.packageName;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            return new OooO00o(str2, "", null, "", str, i, false);
        }
        return new OooO00o(str2, applicationInfo.loadLabel(packageManager).toString(), applicationInfo.loadIcon(packageManager), applicationInfo.sourceDir, str, i, (applicationInfo.flags & 1) != 0);
    }

    public static boolean OooOo0o() {
        return OooOo(C4419u5.OooO00o().getPackageName());
    }

    public static boolean OooOoO(@NonNull String str) {
        return !C4493w5.OooOoo(str) && str.equals(C4493w5.OooOOO0());
    }

    public static boolean OooOoO0() {
        return C4493w5.OooOoO0();
    }

    public static boolean OooOoOO(String str) {
        if (C4493w5.OooOoo(str)) {
            return false;
        }
        try {
            return C4419u5.OooO00o().getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean OooOoo() {
        return OooOooO(C4419u5.OooO00o().getPackageName());
    }

    public static boolean OooOoo0(String str) {
        ActivityManager activityManager;
        if (!C4493w5.OooOoo(str) && (activityManager = (ActivityManager) C4419u5.OooO00o().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)) != null) {
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(Integer.MAX_VALUE);
            if (runningTasks != null && runningTasks.size() > 0) {
                Iterator<ActivityManager.RunningTaskInfo> it = runningTasks.iterator();
                while (it.hasNext()) {
                    ComponentName componentName = it.next().baseActivity;
                    if (componentName != null && str.equals(componentName.getPackageName())) {
                        return true;
                    }
                }
            }
            List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
            if (runningServices != null && runningServices.size() > 0) {
                Iterator<ActivityManager.RunningServiceInfo> it2 = runningServices.iterator();
                while (it2.hasNext()) {
                    if (str.equals(it2.next().service.getPackageName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean OooOooO(String str) {
        if (C4493w5.OooOoo(str)) {
            return false;
        }
        try {
            return (C4419u5.OooO00o().getPackageManager().getApplicationInfo(str, 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean OooOooo() {
        try {
            PackageInfo packageInfo = C4419u5.OooO00o().getPackageManager().getPackageInfo(C4419u5.OooO00o().getPackageName(), 0);
            return packageInfo.firstInstallTime == packageInfo.lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }

    public static void Oooo0(Activity activity, int i, String str) {
        if (activity == null || C4493w5.OooOoo(str)) {
            return;
        }
        Intent intentOooOOO = C4493w5.OooOOO(str, false);
        if (C4493w5.OooOoOO(intentOooOOO)) {
            activity.startActivityForResult(intentOooOOO, i);
        }
    }

    public static void Oooo000(String str) {
        if (C4493w5.OooOoo(str)) {
            return;
        }
        Intent intentOooOOOO = C4493w5.OooOOOO(str);
        if (intentOooOOOO == null) {
            Log.e("AppUtils", "Didn't exist launcher activity.");
        } else {
            C4419u5.OooO00o().startActivity(intentOooOOOO);
        }
    }

    public static void Oooo00O() {
        Oooo0O0(C4419u5.OooO00o().getPackageName());
    }

    public static void Oooo00o(Activity activity, int i) {
        Oooo0(activity, i, C4419u5.OooO00o().getPackageName());
    }

    public static void Oooo0O0(String str) {
        if (C4493w5.OooOoo(str)) {
            return;
        }
        Intent intentOooOOO = C4493w5.OooOOO(str, true);
        if (C4493w5.OooOoOO(intentOooOOO)) {
            C4419u5.OooO00o().startActivity(intentOooOOO);
        }
    }

    public static void Oooo0OO(@NonNull C4419u5.OooO0o oooO0o) {
        C4493w5.OooO0OO(oooO0o);
    }

    public static void Oooo0o(boolean z) {
        Intent intentOooOOOO = C4493w5.OooOOOO(C4419u5.OooO00o().getPackageName());
        if (intentOooOOOO == null) {
            Log.e("AppUtils", "Didn't exist launcher activity.");
            return;
        }
        intentOooOOOO.addFlags(335577088);
        C4419u5.OooO00o().startActivity(intentOooOOOO);
        if (z) {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    public static void Oooo0o0() {
        Oooo0o(false);
    }

    public static void Oooo0oO(@NonNull C4419u5.OooO0o oooO0o) {
        C4493w5.Oooo0O0(oooO0o);
    }
}
