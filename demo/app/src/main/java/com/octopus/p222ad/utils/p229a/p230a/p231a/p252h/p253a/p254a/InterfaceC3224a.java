package com.octopus.p222ad.utils.p229a.p230a.p231a.p252h.p253a.p254a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.h.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3224a extends IInterface {

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.h.a.a.a$a */
    public static abstract class a extends Binder implements InterfaceC3224a {

        /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.h.a.a.a$a$a, reason: collision with other inner class name */
        public static class C4712a implements InterfaceC3224a {

            /* JADX INFO: renamed from: a */
            public static InterfaceC3224a f17835a;

            /* JADX INFO: renamed from: b */
            private IBinder f17836b;

            public C4712a(IBinder iBinder) {
                this.f17836b = iBinder;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p252h.p253a.p254a.InterfaceC3224a
            /* JADX INFO: renamed from: a */
            public String mo14898a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    if (!this.f17836b.transact(1, parcelObtain, parcelObtain2, 0) && a.m14901c() != null) {
                        return a.m14901c().mo14898a();
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
                return this.f17836b;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p252h.p253a.p254a.InterfaceC3224a
            /* JADX INFO: renamed from: b */
            public boolean mo14899b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    if (!this.f17836b.transact(2, parcelObtain, parcelObtain2, 0) && a.m14901c() != null) {
                        return a.m14901c().mo14899b();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC3224a m14900a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3224a)) ? new C4712a(iBinder) : (InterfaceC3224a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: c */
        public static InterfaceC3224a m14901c() {
            return C4712a.f17835a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                String strMo14898a = mo14898a();
                parcel2.writeNoException();
                parcel2.writeString(strMo14898a);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                return true;
            }
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            boolean zMo14899b = mo14899b();
            parcel2.writeNoException();
            parcel2.writeInt(zMo14899b ? 1 : 0);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo14898a() throws RemoteException;

    /* JADX INFO: renamed from: b */
    boolean mo14899b() throws RemoteException;
}
