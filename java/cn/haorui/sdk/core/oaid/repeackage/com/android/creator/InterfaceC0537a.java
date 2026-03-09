package cn.haorui.sdk.core.oaid.repeackage.com.android.creator;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.android.creator.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0537a extends IInterface {

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.android.creator.a$a */
    public static abstract class a extends Binder implements InterfaceC0537a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f211a = 0;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.android.creator.a$a$a, reason: collision with other inner class name */
        public static class C4635a implements InterfaceC0537a {

            /* JADX INFO: renamed from: a */
            public IBinder f212a;

            public C4635a(IBinder iBinder) {
                this.f212a = iBinder;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.android.creator.InterfaceC0537a
            /* JADX INFO: renamed from: a */
            public String mo73a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.creator.IdsSupplier");
                    if (!this.f212a.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f211a;
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
                return this.f212a;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    String mo73a();
}
