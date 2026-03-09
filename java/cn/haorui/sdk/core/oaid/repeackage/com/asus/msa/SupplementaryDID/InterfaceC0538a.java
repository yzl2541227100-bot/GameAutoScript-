package cn.haorui.sdk.core.oaid.repeackage.com.asus.msa.SupplementaryDID;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.asus.msa.SupplementaryDID.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0538a extends IInterface {

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.asus.msa.SupplementaryDID.a$a */
    public static abstract class a extends Binder implements InterfaceC0538a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f213a = 0;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.asus.msa.SupplementaryDID.a$a$a, reason: collision with other inner class name */
        public static class C4636a implements InterfaceC0538a {

            /* JADX INFO: renamed from: a */
            public IBinder f214a;

            public C4636a(IBinder iBinder) {
                this.f214a = iBinder;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.asus.msa.SupplementaryDID.InterfaceC0538a
            /* JADX INFO: renamed from: a */
            public String mo74a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    if (!this.f214a.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f213a;
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
                return this.f214a;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.asus.msa.SupplementaryDID.InterfaceC0538a
            /* JADX INFO: renamed from: b */
            public boolean mo75b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    if (!this.f214a.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f213a;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    String mo74a();

    /* JADX INFO: renamed from: b */
    boolean mo75b();
}
