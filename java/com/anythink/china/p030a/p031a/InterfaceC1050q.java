package com.anythink.china.p030a.p031a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.anythink.china.a.a.q */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1050q extends IInterface {

    /* JADX INFO: renamed from: com.anythink.china.a.a.q$a */
    public static class a implements InterfaceC1050q {

        /* JADX INFO: renamed from: a */
        private IBinder f2289a;

        public a(IBinder iBinder) {
            this.f2289a = iBinder;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1050q
        /* JADX INFO: renamed from: a */
        public final String mo1369a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f2289a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (Exception e) {
                    e.printStackTrace();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return null;
                }
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.anythink.china.p030a.p031a.InterfaceC1050q
        /* JADX INFO: renamed from: b */
        public final String mo1370b() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.f2289a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (Exception e) {
                    e.printStackTrace();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return null;
                }
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    String mo1369a();

    /* JADX INFO: renamed from: b */
    String mo1370b();
}
