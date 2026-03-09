package com.octopus.p222ad.utils.p229a.p230a.p231a.p241e.p242a.p243a.p244a.p245a.p246a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.e.a.a.a.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3221a extends IInterface {

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.e.a.a.a.a.a.a$a */
    public static abstract class a extends Binder implements InterfaceC3221a {

        /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.e.a.a.a.a.a.a$a$a, reason: collision with other inner class name */
        public static class C4709a implements InterfaceC3221a {

            /* JADX INFO: renamed from: a */
            public static InterfaceC3221a f17829a;

            /* JADX INFO: renamed from: b */
            private IBinder f17830b;

            public C4709a(IBinder iBinder) {
                this.f17830b = iBinder;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p241e.p242a.p243a.p244a.p245a.p246a.InterfaceC3221a
            /* JADX INFO: renamed from: a */
            public String mo14886a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (!this.f17830b.transact(1, parcelObtain, parcelObtain2, 0) && a.m14889b() != null) {
                        return a.m14889b().mo14886a();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p241e.p242a.p243a.p244a.p245a.p246a.InterfaceC3221a
            /* JADX INFO: renamed from: a */
            public boolean mo14887a(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f17830b.transact(2, parcelObtain, parcelObtain2, 0) && a.m14889b() != null) {
                        return a.m14889b().mo14887a(z);
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
                return this.f17830b;
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC3221a m14888a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3221a)) ? new C4709a(iBinder) : (InterfaceC3221a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC3221a m14889b() {
            return C4709a.f17829a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                String strMo14886a = mo14886a();
                parcel2.writeNoException();
                parcel2.writeString(strMo14886a);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                return true;
            }
            parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean zMo14887a = mo14887a(parcel.readInt() != 0);
            parcel2.writeNoException();
            parcel2.writeInt(zMo14887a ? 1 : 0);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo14886a() throws RemoteException;

    /* JADX INFO: renamed from: a */
    boolean mo14887a(boolean z) throws RemoteException;
}
