package com.anythink.china.p030a.p031a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.anythink.china.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1034a implements IInterface {

    /* JADX INFO: renamed from: a */
    private IBinder f2233a;

    public C1034a(IBinder iBinder) {
        this.f2233a = iBinder;
    }

    /* JADX INFO: renamed from: a */
    public final String m1324a() {
        String string;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            this.f2233a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            string = parcelObtain2.readString();
        } catch (Throwable th) {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            th.printStackTrace();
            string = null;
        }
        parcelObtain.recycle();
        parcelObtain2.recycle();
        return string;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2233a;
    }
}
