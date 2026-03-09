package com.anythink.china.p030a.p031a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.anythink.china.a.a.n */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1047n extends IInterface {

    /* JADX INFO: renamed from: com.anythink.china.a.a.n$a */
    public static class a implements InterfaceC1047n {

        /* JADX INFO: renamed from: a */
        private IBinder f2281a;

        public a(IBinder iBinder) {
            this.f2281a = iBinder;
        }

        /* JADX INFO: renamed from: a */
        public final String m1366a() {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                this.f2281a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                th.printStackTrace();
                string = null;
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return string;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f2281a;
        }
    }
}
