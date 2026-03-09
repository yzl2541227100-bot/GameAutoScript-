package com.octopus.p222ad.utils.p229a.p230a.p231a.p239d.p240a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.d.a.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3220a extends IInterface {

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.d.a.a$a */
    public static abstract class a extends Binder implements InterfaceC3220a {

        /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.d.a.a$a$a, reason: collision with other inner class name */
        public static class C4708a implements InterfaceC3220a {

            /* JADX INFO: renamed from: a */
            public static InterfaceC3220a f17827a;

            /* JADX INFO: renamed from: b */
            private IBinder f17828b;

            public C4708a(IBinder iBinder) {
                this.f17828b = iBinder;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p239d.p240a.InterfaceC3220a
            /* JADX INFO: renamed from: a */
            public String mo14877a(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    parcelObtain.writeString(str);
                    if (!this.f17828b.transact(1, parcelObtain, parcelObtain2, 0) && a.m14885c() != null) {
                        return a.m14885c().mo14877a(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p239d.p240a.InterfaceC3220a
            /* JADX INFO: renamed from: a */
            public boolean mo14878a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    if (!this.f17828b.transact(6, parcelObtain, parcelObtain2, 0) && a.m14885c() != null) {
                        return a.m14885c().mo14878a();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17828b;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p239d.p240a.InterfaceC3220a
            /* JADX INFO: renamed from: b */
            public String mo14879b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    if (!this.f17828b.transact(7, parcelObtain, parcelObtain2, 0) && a.m14885c() != null) {
                        return a.m14885c().mo14879b();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p239d.p240a.InterfaceC3220a
            /* JADX INFO: renamed from: b */
            public String mo14880b(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    parcelObtain.writeString(str);
                    if (!this.f17828b.transact(2, parcelObtain, parcelObtain2, 0) && a.m14885c() != null) {
                        return a.m14885c().mo14880b(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p239d.p240a.InterfaceC3220a
            /* JADX INFO: renamed from: c */
            public String mo14881c(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    parcelObtain.writeString(str);
                    if (!this.f17828b.transact(3, parcelObtain, parcelObtain2, 0) && a.m14885c() != null) {
                        return a.m14885c().mo14881c(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p239d.p240a.InterfaceC3220a
            /* JADX INFO: renamed from: d */
            public String mo14882d(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    parcelObtain.writeString(str);
                    if (!this.f17828b.transact(4, parcelObtain, parcelObtain2, 0) && a.m14885c() != null) {
                        return a.m14885c().mo14882d(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p239d.p240a.InterfaceC3220a
            /* JADX INFO: renamed from: e */
            public String mo14883e(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                    parcelObtain.writeString(str);
                    if (!this.f17828b.transact(5, parcelObtain, parcelObtain2, 0) && a.m14885c() != null) {
                        return a.m14885c().mo14883e(str);
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
        public static InterfaceC3220a m14884a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3220a)) ? new C4708a(iBinder) : (InterfaceC3220a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: c */
        public static InterfaceC3220a m14885c() {
            return C4708a.f17827a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String strMo14877a;
            if (i == 1598968902) {
                parcel2.writeString("com.coolpad.deviceidsupport.IDeviceIdManager");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
                    strMo14877a = mo14877a(parcel.readString());
                    break;
                case 2:
                    parcel.enforceInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
                    strMo14877a = mo14880b(parcel.readString());
                    break;
                case 3:
                    parcel.enforceInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
                    strMo14877a = mo14881c(parcel.readString());
                    break;
                case 4:
                    parcel.enforceInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
                    strMo14877a = mo14882d(parcel.readString());
                    break;
                case 5:
                    parcel.enforceInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
                    strMo14877a = mo14883e(parcel.readString());
                    break;
                case 6:
                    parcel.enforceInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
                    boolean zMo14878a = mo14878a();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo14878a ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("com.coolpad.deviceidsupport.IDeviceIdManager");
                    strMo14877a = mo14879b();
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            parcel2.writeString(strMo14877a);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo14877a(String str) throws RemoteException;

    /* JADX INFO: renamed from: a */
    boolean mo14878a() throws RemoteException;

    /* JADX INFO: renamed from: b */
    String mo14879b() throws RemoteException;

    /* JADX INFO: renamed from: b */
    String mo14880b(String str) throws RemoteException;

    /* JADX INFO: renamed from: c */
    String mo14881c(String str) throws RemoteException;

    /* JADX INFO: renamed from: d */
    String mo14882d(String str) throws RemoteException;

    /* JADX INFO: renamed from: e */
    String mo14883e(String str) throws RemoteException;
}
