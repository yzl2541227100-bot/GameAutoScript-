package cn.haorui.sdk.core.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;
import cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.g */
/* JADX INFO: loaded from: classes.dex */
public class C0527g implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f194a;

    /* JADX INFO: renamed from: b */
    public String f195b;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.g$a */
    public class a implements ServiceConnectionC0532l.a {
        public a(C0527g c0527g) {
        }

        @Override // cn.haorui.sdk.core.oaid.impl.ServiceConnectionC0532l.a
        /* JADX INFO: renamed from: a */
        public String mo69a(IBinder iBinder) {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                th.printStackTrace();
                string = null;
            }
            parcelObtain.recycle();
            parcelObtain2.recycle();
            return string;
        }
    }

    public C0527g(Context context) {
        this.f194a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f194a == null || interfaceC0519a == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f195b) && !mo68a()) {
            new OAIDException("Huawei Advertising ID not available");
            return;
        }
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage(this.f195b);
        ServiceConnectionC0532l.m70a(this.f194a, intent, interfaceC0519a, new a(this));
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        Context context = this.f194a;
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getPackageInfo("com.huawei.hwid", 0) != null) {
                this.f195b = "com.huawei.hwid";
            } else if (packageManager.getPackageInfo("com.huawei.hwid.tv", 0) != null) {
                this.f195b = "com.huawei.hwid.tv";
            } else {
                this.f195b = "com.huawei.hms";
                if (packageManager.getPackageInfo("com.huawei.hms", 0) == null) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
