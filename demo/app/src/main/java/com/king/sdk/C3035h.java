package com.king.sdk;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.king.sdk.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C3035h implements IDFEE16B42C8B2890D8FF2860AF5562B1 {

    /* JADX INFO: renamed from: a */
    private IBinder f16632a;

    public C3035h(IBinder iBinder) {
        this.f16632a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16632a;
    }

    @Override // com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1
    public final void on088201B3F7D8B2CA1DF5D6AD12CB0C1F(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f16632a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1
    public final void on0D923A4B87763BA40F853B570EF75D94(int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.f16632a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1
    public final void on19C45B0F9674B131C4BF67981B1CC455(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f16632a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1
    public final boolean on1DC022CD78BE5580705D060873AAEB16(Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1");
            boolean z = true;
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f16632a.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() == 0) {
                z = false;
            }
            if (parcelObtain2.readInt() != 0) {
                intent.readFromParcel(parcelObtain2);
            }
            return z;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1
    public final void on369D7B24CF0870337D9962B9BB11E924() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1");
            this.f16632a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1
    public final void on46FE18C9ADFE18C2BC0D43B003F41A66(String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f16632a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1
    public final boolean on96EC25C9716D6EFFB8DD7648F16E4FA2(Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1");
            boolean z = true;
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f16632a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() == 0) {
                z = false;
            }
            if (parcelObtain2.readInt() != 0) {
                intent.readFromParcel(parcelObtain2);
            }
            return z;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1
    public final void onACF4B25418AE4E2D8376A85BD6F0FC17(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f16632a.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1
    public final void onB9504A9B1263E0D14DFE18C2167427BC(String str, String str2, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.king.sdk.IDFEE16B42C8B2890D8FF2860AF5562B1");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.f16632a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
