package com.octopus.p222ad.utils.p229a.p230a.p231a.p234b.p235a.p236a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.b.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3218a extends IInterface {

    /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.b.a.a.a$a */
    public static abstract class a extends Binder implements InterfaceC3218a {

        /* JADX INFO: renamed from: com.octopus.ad.utils.a.a.a.b.a.a.a$a$a, reason: collision with other inner class name */
        public static class C4706a implements InterfaceC3218a {

            /* JADX INFO: renamed from: a */
            public static InterfaceC3218a f17823a;

            /* JADX INFO: renamed from: b */
            private IBinder f17824b;

            public C4706a(IBinder iBinder) {
                this.f17824b = iBinder;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p234b.p235a.p236a.InterfaceC3218a
            /* JADX INFO: renamed from: a */
            public boolean mo14862a() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    if (!this.f17824b.transact(1, parcelObtain, parcelObtain2, 0) && a.m14868f() != null) {
                        return a.m14868f().mo14862a();
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
                return this.f17824b;
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p234b.p235a.p236a.InterfaceC3218a
            /* JADX INFO: renamed from: b */
            public String mo14863b() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    if (!this.f17824b.transact(2, parcelObtain, parcelObtain2, 0) && a.m14868f() != null) {
                        return a.m14868f().mo14863b();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p234b.p235a.p236a.InterfaceC3218a
            /* JADX INFO: renamed from: c */
            public String mo14864c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    if (!this.f17824b.transact(3, parcelObtain, parcelObtain2, 0) && a.m14868f() != null) {
                        return a.m14868f().mo14864c();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p234b.p235a.p236a.InterfaceC3218a
            /* JADX INFO: renamed from: d */
            public String mo14865d() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    if (!this.f17824b.transact(4, parcelObtain, parcelObtain2, 0) && a.m14868f() != null) {
                        return a.m14868f().mo14865d();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.octopus.p222ad.utils.p229a.p230a.p231a.p234b.p235a.p236a.InterfaceC3218a
            /* JADX INFO: renamed from: e */
            public String mo14866e() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    if (!this.f17824b.transact(5, parcelObtain, parcelObtain2, 0) && a.m14868f() != null) {
                        return a.m14868f().mo14866e();
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
        public static InterfaceC3218a m14867a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3218a)) ? new C4706a(iBinder) : (InterfaceC3218a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: f */
        public static InterfaceC3218a m14868f() {
            return C4706a.f17823a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String strMo14863b;
            if (i == 1) {
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                boolean zMo14862a = mo14862a();
                parcel2.writeNoException();
                parcel2.writeInt(zMo14862a ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                strMo14863b = mo14863b();
            } else if (i == 3) {
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                strMo14863b = mo14864c();
            } else if (i == 4) {
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                strMo14863b = mo14865d();
            } else {
                if (i != 5) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    return true;
                }
                parcel.enforceInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                strMo14863b = mo14866e();
            }
            parcel2.writeNoException();
            parcel2.writeString(strMo14863b);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo14862a() throws RemoteException;

    /* JADX INFO: renamed from: b */
    String mo14863b() throws RemoteException;

    /* JADX INFO: renamed from: c */
    String mo14864c() throws RemoteException;

    /* JADX INFO: renamed from: d */
    String mo14865d() throws RemoteException;

    /* JADX INFO: renamed from: e */
    String mo14866e() throws RemoteException;
}
