package com.anythink.china.p030a.p031a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.anythink.china.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1038e extends IInterface {

    /* JADX INFO: renamed from: com.anythink.china.a.a.e$a */
    public static class a implements InterfaceC1038e {
        @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
        /* JADX INFO: renamed from: a */
        public final String mo1328a(String str) {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
        /* JADX INFO: renamed from: a */
        public final boolean mo1329a() {
            return false;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
        /* JADX INFO: renamed from: b */
        public final String mo1330b() {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
        /* JADX INFO: renamed from: b */
        public final String mo1331b(String str) {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
        /* JADX INFO: renamed from: c */
        public final String mo1332c() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.anythink.china.a.a.e$b */
    public static abstract class b extends Binder implements InterfaceC1038e {

        /* JADX INFO: renamed from: a */
        public static final int f2242a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f2243b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f2244c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f2245d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f2246e = 5;

        /* JADX INFO: renamed from: f */
        private static final String f2247f = "com.android.creator.FreemeIdsSupplier";

        /* JADX INFO: renamed from: com.anythink.china.a.a.e$b$a */
        public static class a implements InterfaceC1038e {

            /* JADX INFO: renamed from: a */
            public static InterfaceC1038e f2248a;

            /* JADX INFO: renamed from: b */
            private IBinder f2249b;

            public a(IBinder iBinder) {
                this.f2249b = iBinder;
            }

            /* JADX INFO: renamed from: d */
            private static String m1336d() {
                return b.f2247f;
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
            /* JADX INFO: renamed from: a */
            public final String mo1328a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2247f);
                    parcelObtain.writeString(str);
                    if (!this.f2249b.transact(2, parcelObtain, parcelObtain2, 0) && b.m1335d() != null) {
                        return b.m1335d().mo1328a(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
            /* JADX INFO: renamed from: a */
            public final boolean mo1329a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2247f);
                    if (!this.f2249b.transact(1, parcelObtain, parcelObtain2, 0) && b.m1335d() != null) {
                        return b.m1335d().mo1329a();
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
                return this.f2249b;
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
            /* JADX INFO: renamed from: b */
            public final String mo1330b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2247f);
                    if (!this.f2249b.transact(3, parcelObtain, parcelObtain2, 0) && b.m1335d() != null) {
                        return b.m1335d().mo1330b();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
            /* JADX INFO: renamed from: b */
            public final String mo1331b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2247f);
                    parcelObtain.writeString(str);
                    if (!this.f2249b.transact(5, parcelObtain, parcelObtain2, 0) && b.m1335d() != null) {
                        return b.m1335d().mo1331b(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.anythink.china.p030a.p031a.InterfaceC1038e
            /* JADX INFO: renamed from: c */
            public final String mo1332c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f2247f);
                    if (!this.f2249b.transact(4, parcelObtain, parcelObtain2, 0) && b.m1335d() != null) {
                        return b.m1335d().mo1332c();
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
            attachInterface(this, f2247f);
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC1038e m1333a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f2247f);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1038e)) ? new a(iBinder) : (InterfaceC1038e) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: a */
        private static boolean m1334a(InterfaceC1038e interfaceC1038e) {
            if (a.f2248a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC1038e == null) {
                return false;
            }
            a.f2248a = interfaceC1038e;
            return true;
        }

        /* JADX INFO: renamed from: d */
        public static InterfaceC1038e m1335d() {
            return a.f2248a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String strMo1328a;
            if (i == 1) {
                parcel.enforceInterface(f2247f);
                boolean zMo1329a = mo1329a();
                parcel2.writeNoException();
                parcel2.writeInt(zMo1329a ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(f2247f);
                strMo1328a = mo1328a(parcel.readString());
            } else if (i == 3) {
                parcel.enforceInterface(f2247f);
                strMo1328a = mo1330b();
            } else if (i == 4) {
                parcel.enforceInterface(f2247f);
                strMo1328a = mo1332c();
            } else {
                if (i != 5) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString(f2247f);
                    return true;
                }
                parcel.enforceInterface(f2247f);
                strMo1328a = mo1331b(parcel.readString());
            }
            parcel2.writeNoException();
            parcel2.writeString(strMo1328a);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo1328a(String str);

    /* JADX INFO: renamed from: a */
    boolean mo1329a();

    /* JADX INFO: renamed from: b */
    String mo1330b();

    /* JADX INFO: renamed from: b */
    String mo1331b(String str);

    /* JADX INFO: renamed from: c */
    String mo1332c();
}
