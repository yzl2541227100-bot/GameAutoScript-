package com.octopus.p222ad.utils.p229a.p230a.p231a.p249g.p250a.p251a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.g.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3223a extends IInterface {

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.g.a.a.a$a */
    public static abstract class a extends Binder implements InterfaceC3223a {

        /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.g.a.a.a$a$a, reason: collision with other inner class name */
        public static class C4711a implements InterfaceC3223a {

            /* JADX INFO: renamed from: a */
            public static InterfaceC3223a f17833a;

            /* JADX INFO: renamed from: b */
            private IBinder f17834b;

            public C4711a(IBinder iBinder) {
                this.f17834b = iBinder;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p249g.p250a.p251a.InterfaceC3223a
            /* JADX INFO: renamed from: a */
            public String mo14893a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    if (!this.f17834b.transact(1, parcelObtain, parcelObtain2, 0) && a.m14897b() != null) {
                        return a.m14897b().mo14893a();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p249g.p250a.p251a.InterfaceC3223a
            /* JADX INFO: renamed from: a */
            public String mo14894a(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    parcelObtain.writeString(str);
                    if (!this.f17834b.transact(2, parcelObtain, parcelObtain2, 0) && a.m14897b() != null) {
                        return a.m14897b().mo14894a(str);
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
                return this.f17834b;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p249g.p250a.p251a.InterfaceC3223a
            /* JADX INFO: renamed from: b */
            public String mo14895b(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    parcelObtain.writeString(str);
                    if (!this.f17834b.transact(3, parcelObtain, parcelObtain2, 0) && a.m14897b() != null) {
                        return a.m14897b().mo14895b(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC3223a m14896a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3223a)) ? new C4711a(iBinder) : (InterfaceC3223a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC3223a m14897b() {
            return C4711a.f17833a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String strMo14893a;
            if (i == 1) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                strMo14893a = mo14893a();
            } else if (i == 2) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                strMo14893a = mo14894a(parcel.readString());
            } else {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.samsung.android.deviceidservice.IDeviceIdService");
                    return true;
                }
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                strMo14893a = mo14895b(parcel.readString());
            }
            parcel2.writeNoException();
            parcel2.writeString(strMo14893a);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo14893a() throws RemoteException;

    /* JADX INFO: renamed from: a */
    String mo14894a(String str) throws RemoteException;

    /* JADX INFO: renamed from: b */
    String mo14895b(String str) throws RemoteException;
}
