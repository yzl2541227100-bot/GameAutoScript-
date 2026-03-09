package cn.haorui.sdk.core.oaid.repeackage.com.samsung.android.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.samsung.android.deviceidservice.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0543a extends IInterface {

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.samsung.android.deviceidservice.a$a */
    public static abstract class a extends Binder implements InterfaceC0543a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f223a = 0;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.samsung.android.deviceidservice.a$a$a, reason: collision with other inner class name */
        public static class C4641a implements InterfaceC0543a {

            /* JADX INFO: renamed from: a */
            public IBinder f224a;

            public C4641a(IBinder iBinder) {
                this.f224a = iBinder;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.samsung.android.deviceidservice.InterfaceC0543a
            /* JADX INFO: renamed from: a */
            public String mo82a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    if (!this.f224a.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f223a;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f224a;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    String mo82a();
}
