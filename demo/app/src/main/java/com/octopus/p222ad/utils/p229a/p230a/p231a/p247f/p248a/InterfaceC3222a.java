package com.octopus.p222ad.utils.p229a.p230a.p231a.p247f.p248a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.f.a.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3222a extends IInterface {

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.f.a.a$a */
    public static abstract class a extends Binder implements InterfaceC3222a {

        /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.f.a.a$a$a, reason: collision with other inner class name */
        public static class C4710a implements InterfaceC3222a {

            /* JADX INFO: renamed from: a */
            public static InterfaceC3222a f17831a;

            /* JADX INFO: renamed from: b */
            private IBinder f17832b;

            public C4710a(IBinder iBinder) {
                this.f17832b = iBinder;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p247f.p248a.InterfaceC3222a
            /* JADX INFO: renamed from: a */
            public String mo14890a(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (!this.f17832b.transact(1, parcelObtain, parcelObtain2, 0) && a.m14891a() != null) {
                        return a.m14891a().mo14890a(str, str2, str3);
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
                return this.f17832b;
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC3222a m14891a() {
            return C4710a.f17831a;
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC3222a m14892a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3222a)) ? new C4710a(iBinder) : (InterfaceC3222a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.heytap.openid.IOpenID");
                return true;
            }
            parcel.enforceInterface("com.heytap.openid.IOpenID");
            String strMo14890a = mo14890a(parcel.readString(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strMo14890a);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo14890a(String str, String str2, String str3) throws RemoteException;
}
