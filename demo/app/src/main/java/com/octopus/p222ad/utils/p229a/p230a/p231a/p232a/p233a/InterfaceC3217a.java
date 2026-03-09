package com.octopus.p222ad.utils.p229a.p230a.p231a.p232a.p233a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3217a extends IInterface {

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.a.a.a$a */
    public static abstract class a extends Binder implements InterfaceC3217a {

        /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.a.a.a$a$a, reason: collision with other inner class name */
        public static class C4705a implements InterfaceC3217a {

            /* JADX INFO: renamed from: a */
            public static InterfaceC3217a f17821a;

            /* JADX INFO: renamed from: b */
            private IBinder f17822b;

            public C4705a(IBinder iBinder) {
                this.f17822b = iBinder;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p232a.p233a.InterfaceC3217a
            /* JADX INFO: renamed from: a */
            public String mo14855a(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.creator.IdsSupplier");
                    parcelObtain.writeString(str);
                    if (!this.f17822b.transact(2, parcelObtain, parcelObtain2, 0) && a.m14861d() != null) {
                        return a.m14861d().mo14855a(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p232a.p233a.InterfaceC3217a
            /* JADX INFO: renamed from: a */
            public boolean mo14856a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.creator.IdsSupplier");
                    if (!this.f17822b.transact(1, parcelObtain, parcelObtain2, 0) && a.m14861d() != null) {
                        return a.m14861d().mo14856a();
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
                return this.f17822b;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p232a.p233a.InterfaceC3217a
            /* JADX INFO: renamed from: b */
            public String mo14857b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.creator.IdsSupplier");
                    if (!this.f17822b.transact(3, parcelObtain, parcelObtain2, 0) && a.m14861d() != null) {
                        return a.m14861d().mo14857b();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p232a.p233a.InterfaceC3217a
            /* JADX INFO: renamed from: b */
            public String mo14858b(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.creator.IdsSupplier");
                    parcelObtain.writeString(str);
                    if (!this.f17822b.transact(5, parcelObtain, parcelObtain2, 0) && a.m14861d() != null) {
                        return a.m14861d().mo14858b(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p232a.p233a.InterfaceC3217a
            /* JADX INFO: renamed from: c */
            public String mo14859c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.creator.IdsSupplier");
                    if (!this.f17822b.transact(4, parcelObtain, parcelObtain2, 0) && a.m14861d() != null) {
                        return a.m14861d().mo14859c();
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
        public static InterfaceC3217a m14860a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.creator.IdsSupplier");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3217a)) ? new C4705a(iBinder) : (InterfaceC3217a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: d */
        public static InterfaceC3217a m14861d() {
            return C4705a.f17821a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String strMo14855a;
            if (i == 1) {
                parcel.enforceInterface("com.android.creator.IdsSupplier");
                boolean zMo14856a = mo14856a();
                parcel2.writeNoException();
                parcel2.writeInt(zMo14856a ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.android.creator.IdsSupplier");
                strMo14855a = mo14855a(parcel.readString());
            } else if (i == 3) {
                parcel.enforceInterface("com.android.creator.IdsSupplier");
                strMo14855a = mo14857b();
            } else if (i == 4) {
                parcel.enforceInterface("com.android.creator.IdsSupplier");
                strMo14855a = mo14859c();
            } else {
                if (i != 5) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.android.creator.IdsSupplier");
                    return true;
                }
                parcel.enforceInterface("com.android.creator.IdsSupplier");
                strMo14855a = mo14858b(parcel.readString());
            }
            parcel2.writeNoException();
            parcel2.writeString(strMo14855a);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo14855a(String str) throws RemoteException;

    /* JADX INFO: renamed from: a */
    boolean mo14856a() throws RemoteException;

    /* JADX INFO: renamed from: b */
    String mo14857b() throws RemoteException;

    /* JADX INFO: renamed from: b */
    String mo14858b(String str) throws RemoteException;

    /* JADX INFO: renamed from: c */
    String mo14859c() throws RemoteException;
}
