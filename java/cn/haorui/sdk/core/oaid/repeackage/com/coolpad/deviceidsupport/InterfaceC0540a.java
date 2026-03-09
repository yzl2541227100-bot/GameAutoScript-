package cn.haorui.sdk.core.oaid.repeackage.com.coolpad.deviceidsupport;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.coolpad.deviceidsupport.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0540a extends IInterface {

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.coolpad.deviceidsupport.a$a */
    public static abstract class a extends Binder implements InterfaceC0540a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f217a = 0;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.coolpad.deviceidsupport.a$a$a, reason: collision with other inner class name */
        public static class C4638a implements InterfaceC0540a {

            /* JADX INFO: renamed from: a */
            public IBinder f218a;

            public C4638a(IBinder iBinder) {
                this.f218a = iBinder;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.coolpad.deviceidsupport.InterfaceC0540a
            /* JADX INFO: renamed from: a */
            public String mo78a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    parcelObtain.writeString(str);
                    if (!this.f218a.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f217a;
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
                return this.f218a;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    String mo78a(String str);
}
