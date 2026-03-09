package com.anythink.china.p030a.p031a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.anythink.china.a.a.i */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1042i extends IInterface {

    /* JADX INFO: renamed from: com.anythink.china.a.a.i$a */
    public static class a implements InterfaceC1042i {
        @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
        /* JADX INFO: renamed from: a */
        public final String mo1349a(String str) {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
        /* JADX INFO: renamed from: a */
        public final boolean mo1350a() {
            return false;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
        /* JADX INFO: renamed from: b */
        public final String mo1351b() {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
        /* JADX INFO: renamed from: b */
        public final String mo1352b(String str) {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
        /* JADX INFO: renamed from: c */
        public final String mo1353c(String str) {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
        /* JADX INFO: renamed from: d */
        public final String mo1354d(String str) {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
        /* JADX INFO: renamed from: e */
        public final String mo1355e(String str) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.a.a.i$b */
    public static abstract class b extends Binder implements InterfaceC1042i {

        /* JADX INFO: renamed from: a */
        public static final int f2264a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f2265b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f2266c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f2267d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f2268e = 5;

        /* JADX INFO: renamed from: f */
        public static final int f2269f = 6;

        /* JADX INFO: renamed from: g */
        public static final int f2270g = 7;

        /* JADX INFO: renamed from: h */
        private static final String f2271h = "com.coolpad.deviceidsupport.IDeviceIdManager";

        /* JADX INFO: renamed from: com.anythink.china.a.a.i$b$a */
        public static class a implements InterfaceC1042i {

            /* JADX INFO: renamed from: a */
            public static InterfaceC1042i f2272a;

            /* JADX INFO: renamed from: b */
            private IBinder f2273b;

            public a(IBinder iBinder) {
                this.f2273b = iBinder;
            }

            /* JADX INFO: renamed from: c */
            private static String m1359c() {
                return b.f2271h;
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
            /* JADX INFO: renamed from: a */
            public final String mo1349a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2271h);
                    parcelObtain.writeString(str);
                    if (!this.f2273b.transact(1, parcelObtain, parcelObtain2, 0) && b.m1358c() != null) {
                        return b.m1358c().mo1349a(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
            /* JADX INFO: renamed from: a */
            public final boolean mo1350a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2271h);
                    if (!this.f2273b.transact(6, parcelObtain, parcelObtain2, 0) && b.m1358c() != null) {
                        return b.m1358c().mo1350a();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f2273b;
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
            /* JADX INFO: renamed from: b */
            public final String mo1351b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2271h);
                    if (!this.f2273b.transact(7, parcelObtain, parcelObtain2, 0) && b.m1358c() != null) {
                        return b.m1358c().mo1351b();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
            /* JADX INFO: renamed from: b */
            public final String mo1352b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2271h);
                    parcelObtain.writeString(str);
                    if (!this.f2273b.transact(2, parcelObtain, parcelObtain2, 0) && b.m1358c() != null) {
                        return b.m1358c().mo1352b(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
            /* JADX INFO: renamed from: c */
            public final String mo1353c(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2271h);
                    parcelObtain.writeString(str);
                    if (!this.f2273b.transact(3, parcelObtain, parcelObtain2, 0) && b.m1358c() != null) {
                        return b.m1358c().mo1353c(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
            /* JADX INFO: renamed from: d */
            public final String mo1354d(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2271h);
                    parcelObtain.writeString(str);
                    if (!this.f2273b.transact(4, parcelObtain, parcelObtain2, 0) && b.m1358c() != null) {
                        return b.m1358c().mo1354d(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1042i
            /* JADX INFO: renamed from: e */
            public final String mo1355e(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2271h);
                    parcelObtain.writeString(str);
                    if (!this.f2273b.transact(5, parcelObtain, parcelObtain2, 0) && b.m1358c() != null) {
                        return b.m1358c().mo1355e(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, f2271h);
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC1042i m1356a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f2271h);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1042i)) ? new a(iBinder) : (InterfaceC1042i) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: a */
        private static boolean m1357a(InterfaceC1042i interfaceC1042i) {
            if (a.f2272a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC1042i == null) {
                return false;
            }
            a.f2272a = interfaceC1042i;
            return true;
        }

        /* JADX INFO: renamed from: c */
        public static InterfaceC1042i m1358c() {
            return a.f2272a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String strMo1349a;
            if (i == 1598968902) {
                parcel2.writeString(f2271h);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(f2271h);
                    strMo1349a = mo1349a(parcel.readString());
                    break;
                case 2:
                    parcel.enforceInterface(f2271h);
                    strMo1349a = mo1352b(parcel.readString());
                    break;
                case 3:
                    parcel.enforceInterface(f2271h);
                    strMo1349a = mo1353c(parcel.readString());
                    break;
                case 4:
                    parcel.enforceInterface(f2271h);
                    strMo1349a = mo1354d(parcel.readString());
                    break;
                case 5:
                    parcel.enforceInterface(f2271h);
                    strMo1349a = mo1355e(parcel.readString());
                    break;
                case 6:
                    parcel.enforceInterface(f2271h);
                    boolean zMo1350a = mo1350a();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo1350a ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(f2271h);
                    strMo1349a = mo1351b();
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            parcel2.writeString(strMo1349a);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo1349a(String str);

    /* JADX INFO: renamed from: a */
    boolean mo1350a();

    /* JADX INFO: renamed from: b */
    String mo1351b();

    /* JADX INFO: renamed from: b */
    String mo1352b(String str);

    /* JADX INFO: renamed from: c */
    String mo1353c(String str);

    /* JADX INFO: renamed from: d */
    String mo1354d(String str);

    /* JADX INFO: renamed from: e */
    String mo1355e(String str);
}
