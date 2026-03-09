package com.anythink.china.p030a.p031a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.anythink.china.a.a.m */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1046m extends IInterface {

    /* JADX INFO: renamed from: com.anythink.china.a.a.m$a */
    public static abstract class a extends Binder implements InterfaceC1046m {

        /* JADX INFO: renamed from: com.anythink.china.a.a.m$a$a, reason: collision with other inner class name */
        public static class C4658a implements InterfaceC1046m {

            /* JADX INFO: renamed from: a */
            public IBinder f2280a;

            public C4658a(IBinder iBinder) {
                this.f2280a = iBinder;
            }

            /* JADX INFO: renamed from: a */
            public final String m1365a(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        parcelObtain.writeString(str3);
                        this.f2280a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2.readString();
                    } catch (Exception e) {
                        e.printStackTrace();
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        return null;
                    }
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f2280a;
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC1046m m1364a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
                return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1046m)) ? new C4658a(iBinder) : (InterfaceC1046m) iInterfaceQueryLocalInterface;
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
