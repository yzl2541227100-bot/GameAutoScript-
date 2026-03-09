package com.octopus.p222ad.utils.p229a.p230a.p231a.p237c.p238a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.c.a.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3219a extends IInterface {

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.c.a.a$a */
    public static abstract class a extends Binder implements InterfaceC3219a {

        /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.c.a.a$a$a, reason: collision with other inner class name */
        public static class C4707a implements InterfaceC3219a {

            /* JADX INFO: renamed from: a */
            public static InterfaceC3219a f17825a;

            /* JADX INFO: renamed from: b */
            private IBinder f17826b;

            public C4707a(IBinder iBinder) {
                this.f17826b = iBinder;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p237c.p238a.InterfaceC3219a
            /* JADX INFO: renamed from: a */
            public boolean mo14869a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.f17826b.transact(1, parcelObtain, parcelObtain2, 0) && a.m14876g() != null) {
                        return a.m14876g().mo14869a();
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
                return this.f17826b;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p237c.p238a.InterfaceC3219a
            /* JADX INFO: renamed from: b */
            public boolean mo14870b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.f17826b.transact(2, parcelObtain, parcelObtain2, 0) && a.m14876g() != null) {
                        return a.m14876g().mo14870b();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p237c.p238a.InterfaceC3219a
            /* JADX INFO: renamed from: c */
            public String mo14871c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.f17826b.transact(3, parcelObtain, parcelObtain2, 0) && a.m14876g() != null) {
                        return a.m14876g().mo14871c();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p237c.p238a.InterfaceC3219a
            /* JADX INFO: renamed from: d */
            public String mo14872d() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.f17826b.transact(4, parcelObtain, parcelObtain2, 0) && a.m14876g() != null) {
                        return a.m14876g().mo14872d();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p237c.p238a.InterfaceC3219a
            /* JADX INFO: renamed from: e */
            public String mo14873e() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.f17826b.transact(5, parcelObtain, parcelObtain2, 0) && a.m14876g() != null) {
                        return a.m14876g().mo14873e();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p237c.p238a.InterfaceC3219a
            /* JADX INFO: renamed from: f */
            public void mo14874f() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (this.f17826b.transact(6, parcelObtain, parcelObtain2, 0) || a.m14876g() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m14876g().mo14874f();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC3219a m14875a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3219a)) ? new C4707a(iBinder) : (InterfaceC3219a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: g */
        public static InterfaceC3219a m14876g() {
            return C4707a.f17825a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.bun.lib.MsaIdInterface");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                    boolean zMo14869a = mo14869a();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo14869a ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                    boolean zMo14870b = mo14870b();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo14870b ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                    String strMo14871c = mo14871c();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo14871c);
                    return true;
                case 4:
                    parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                    String strMo14872d = mo14872d();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo14872d);
                    return true;
                case 5:
                    parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                    String strMo14873e = mo14873e();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo14873e);
                    return true;
                case 6:
                    parcel.enforceInterface("com.bun.lib.MsaIdInterface");
                    mo14874f();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo14869a() throws RemoteException;

    /* JADX INFO: renamed from: b */
    boolean mo14870b() throws RemoteException;

    /* JADX INFO: renamed from: c */
    String mo14871c() throws RemoteException;

    /* JADX INFO: renamed from: d */
    String mo14872d() throws RemoteException;

    /* JADX INFO: renamed from: e */
    String mo14873e() throws RemoteException;

    /* JADX INFO: renamed from: f */
    void mo14874f() throws RemoteException;
}
