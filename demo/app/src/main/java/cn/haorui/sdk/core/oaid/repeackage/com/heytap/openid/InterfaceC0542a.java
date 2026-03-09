package cn.haorui.sdk.core.oaid.repeackage.com.heytap.openid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.heytap.openid.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0542a extends IInterface {

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.heytap.openid.a$a */
    public static abstract class a extends Binder implements InterfaceC0542a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f221a = 0;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.heytap.openid.a$a$a, reason: collision with other inner class name */
        public static class C4640a implements InterfaceC0542a {

            /* JADX INFO: renamed from: a */
            public IBinder f222a;

            public C4640a(IBinder iBinder) {
                this.f222a = iBinder;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.heytap.openid.InterfaceC0542a
            /* JADX INFO: renamed from: a */
            public String mo81a(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (!this.f222a.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f221a;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f222a;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    String mo81a(String str, String str2, String str3);
}
