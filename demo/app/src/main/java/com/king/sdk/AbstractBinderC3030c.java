package com.king.sdk;

import android.accounts.Account;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.king.sdk.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3030c extends Binder implements InterfaceC3029b {
    /* JADX INFO: renamed from: a */
    public static InterfaceC3029b m13773a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3029b)) ? new C3031d(iBinder) : (InterfaceC3029b) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                String strMo13747a = mo13747a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strMo13747a);
                return true;
            case 2:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                int iMo13745a = mo13745a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo13745a);
                return true;
            case 3:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                int iMo13761b = mo13761b(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo13761b);
                return true;
            case 4:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                int iMo13744a = mo13744a();
                parcel2.writeNoException();
                parcel2.writeInt(iMo13744a);
                return true;
            case 5:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13755a(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13754a(parcel.readString(), parcel.readStrongBinder(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13752a(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13750a(parcel.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13756a(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                byte[] bArrMo13764b = mo13764b();
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo13764b);
                return true;
            case 11:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13748a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                Intent intentMo13746a = mo13746a(parcel.readString());
                parcel2.writeNoException();
                if (intentMo13746a != null) {
                    parcel2.writeInt(1);
                    intentMo13746a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 13:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13749a(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                IBinder iBinderMo13762b = mo13762b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderMo13762b);
                return true;
            case 15:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13766c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                String strMo13765c = mo13765c();
                parcel2.writeNoException();
                parcel2.writeString(strMo13765c);
                return true;
            case 17:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                String strMo13767d = mo13767d();
                parcel2.writeNoException();
                parcel2.writeString(strMo13767d);
                return true;
            case 18:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13757a(parcel.createStringArray(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                int iMo13769e = mo13769e();
                parcel2.writeNoException();
                parcel2.writeInt(iMo13769e);
                return true;
            case 20:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                String strMo13771f = mo13771f();
                parcel2.writeNoException();
                parcel2.writeString(strMo13771f);
                return true;
            case 21:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                boolean zMo13768d = mo13768d(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo13768d ? 1 : 0);
                return true;
            case 22:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13751a(AbstractBinderC3034g.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13763b(AbstractBinderC3034g.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13753a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                String strMo13772g = mo13772g();
                parcel2.writeNoException();
                parcel2.writeString(strMo13772g);
                return true;
            case 26:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                mo13770e(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                boolean zMo13760a = mo13760a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zMo13760a ? 1 : 0);
                return true;
            case 28:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                boolean zMo13758a = mo13758a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zMo13758a ? 1 : 0);
                return true;
            case 29:
                parcel.enforceInterface("com.king.sdk.I2FABB9840C76199A1E170A7C19698595");
                boolean zMo13759a = mo13759a(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createByteArray(), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zMo13759a ? 1 : 0);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
