package com.king.sdk;

import android.os.Binder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.king.sdk.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3033f extends Binder implements InterfaceC3032e {
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.king.sdk.IBA2159EDE8B5B1B06F70D35A9630B683");
            return true;
        }
        parcel.enforceInterface("com.king.sdk.IBA2159EDE8B5B1B06F70D35A9630B683");
        parcel.readInt();
        AbstractBinderC3030c.m13773a(parcel.readStrongBinder());
        parcel2.writeNoException();
        return true;
    }
}
