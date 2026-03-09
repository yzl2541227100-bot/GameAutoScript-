package com.anythink.china.p030a.p031a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.anythink.china.a.a.g */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1040g extends IInterface {

    /* JADX INFO: renamed from: com.anythink.china.a.a.g$a */
    public static abstract class a extends Binder implements InterfaceC1040g {

        /* JADX INFO: renamed from: a */
        public static final int f2252a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f2253b = 2;

        /* JADX INFO: renamed from: c */
        private static final String f2254c = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

        /* JADX INFO: renamed from: com.anythink.china.a.a.g$a$a, reason: collision with other inner class name */
        public static class C4657a implements InterfaceC1040g {

            /* JADX INFO: renamed from: a */
            private IBinder f2255a;

            public C4657a(IBinder iBinder) {
                this.f2255a = iBinder;
            }

            /* JADX INFO: renamed from: c */
            private static String m1341c() {
                return a.f2254c;
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1040g
            /* JADX INFO: renamed from: a */
            public final String mo1338a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f2254c);
                    this.f2255a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f2255a;
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1040g
            /* JADX INFO: renamed from: b */
            public final boolean mo1339b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f2254c);
                    this.f2255a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, f2254c);
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC1040g m1340a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f2254c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1040g)) ? new C4657a(iBinder) : (InterfaceC1040g) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(f2254c);
                String strMo1338a = mo1338a();
                parcel2.writeNoException();
                parcel2.writeString(strMo1338a);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(f2254c);
                return true;
            }
            parcel.enforceInterface(f2254c);
            boolean zMo1339b = mo1339b();
            parcel2.writeNoException();
            parcel2.writeInt(zMo1339b ? 1 : 0);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo1338a();

    /* JADX INFO: renamed from: b */
    boolean mo1339b();
}
