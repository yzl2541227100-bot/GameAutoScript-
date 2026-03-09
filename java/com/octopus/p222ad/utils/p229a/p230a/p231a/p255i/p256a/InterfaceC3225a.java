package com.octopus.p222ad.utils.p229a.p230a.p231a.p255i.p256a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.i.a.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3225a extends IInterface {

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.i.a.a$a */
    public static abstract class a extends Binder implements InterfaceC3225a {

        /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.i.a.a$a$a, reason: collision with other inner class name */
        public static class C4713a implements InterfaceC3225a {

            /* JADX INFO: renamed from: a */
            public static InterfaceC3225a f17837a;

            /* JADX INFO: renamed from: b */
            private IBinder f17838b;

            public C4713a(IBinder iBinder) {
                this.f17838b = iBinder;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p255i.p256a.InterfaceC3225a
            /* JADX INFO: renamed from: a */
            public String mo14902a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    if (!this.f17838b.transact(1, parcelObtain, parcelObtain2, 0) && a.m14909d() != null) {
                        return a.m14909d().mo14902a();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p255i.p256a.InterfaceC3225a
            /* JADX INFO: renamed from: a */
            public String mo14903a(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    parcelObtain.writeString(str);
                    if (!this.f17838b.transact(4, parcelObtain, parcelObtain2, 0) && a.m14909d() != null) {
                        return a.m14909d().mo14903a(str);
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
                return this.f17838b;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p255i.p256a.InterfaceC3225a
            /* JADX INFO: renamed from: b */
            public String mo14904b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    if (!this.f17838b.transact(2, parcelObtain, parcelObtain2, 0) && a.m14909d() != null) {
                        return a.m14909d().mo14904b();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p255i.p256a.InterfaceC3225a
            /* JADX INFO: renamed from: b */
            public String mo14905b(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    parcelObtain.writeString(str);
                    if (!this.f17838b.transact(5, parcelObtain, parcelObtain2, 0) && a.m14909d() != null) {
                        return a.m14909d().mo14905b(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p255i.p256a.InterfaceC3225a
            /* JADX INFO: renamed from: c */
            public String mo14906c(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    parcelObtain.writeString(str);
                    if (!this.f17838b.transact(6, parcelObtain, parcelObtain2, 0) && a.m14909d() != null) {
                        return a.m14909d().mo14906c(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p255i.p256a.InterfaceC3225a
            /* JADX INFO: renamed from: c */
            public boolean mo14907c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    if (!this.f17838b.transact(3, parcelObtain, parcelObtain2, 0) && a.m14909d() != null) {
                        return a.m14909d().mo14907c();
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
        public static InterfaceC3225a m14908a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3225a)) ? new C4713a(iBinder) : (InterfaceC3225a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: d */
        public static InterfaceC3225a m14909d() {
            return C4713a.f17837a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String strMo14902a;
            if (i == 1598968902) {
                parcel2.writeString("com.zui.deviceidservice.IDeviceidInterface");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    strMo14902a = mo14902a();
                    break;
                case 2:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    strMo14902a = mo14904b();
                    break;
                case 3:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    boolean zMo14907c = mo14907c();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo14907c ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    strMo14902a = mo14903a(parcel.readString());
                    break;
                case 5:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    strMo14902a = mo14905b(parcel.readString());
                    break;
                case 6:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    strMo14902a = mo14906c(parcel.readString());
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            parcel2.writeString(strMo14902a);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo14902a() throws RemoteException;

    /* JADX INFO: renamed from: a */
    String mo14903a(String str) throws RemoteException;

    /* JADX INFO: renamed from: b */
    String mo14904b() throws RemoteException;

    /* JADX INFO: renamed from: b */
    String mo14905b(String str) throws RemoteException;

    /* JADX INFO: renamed from: c */
    String mo14906c(String str) throws RemoteException;

    /* JADX INFO: renamed from: c */
    boolean mo14907c() throws RemoteException;
}
