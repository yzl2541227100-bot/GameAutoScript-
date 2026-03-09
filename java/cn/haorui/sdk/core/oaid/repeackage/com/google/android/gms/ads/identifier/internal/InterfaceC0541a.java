package cn.haorui.sdk.core.oaid.repeackage.com.google.android.gms.ads.identifier.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.google.android.gms.ads.identifier.internal.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0541a extends IInterface {

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.google.android.gms.ads.identifier.internal.a$a */
    public static abstract class a extends Binder implements InterfaceC0541a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f219a = 0;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.google.android.gms.ads.identifier.internal.a$a$a, reason: collision with other inner class name */
        public static class C4639a implements InterfaceC0541a {

            /* JADX INFO: renamed from: a */
            public IBinder f220a;

            public C4639a(IBinder iBinder) {
                this.f220a = iBinder;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.google.android.gms.ads.identifier.internal.InterfaceC0541a
            /* JADX INFO: renamed from: a */
            public boolean mo79a(boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f220a.transact(2, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f219a;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f220a;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.google.android.gms.ads.identifier.internal.InterfaceC0541a
            /* JADX INFO: renamed from: c */
            public String mo80c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (!this.f220a.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f219a;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo79a(boolean z);

    /* JADX INFO: renamed from: c */
    String mo80c();
}
