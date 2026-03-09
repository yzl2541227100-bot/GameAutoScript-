package cn.haorui.sdk.core.oaid.repeackage.com.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.zui.deviceidservice.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0544a extends IInterface {

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.zui.deviceidservice.a$a */
    public static abstract class a extends Binder implements InterfaceC0544a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f225a = 0;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.zui.deviceidservice.a$a$a, reason: collision with other inner class name */
        public static class C4642a implements InterfaceC0544a {

            /* JADX INFO: renamed from: a */
            public IBinder f226a;

            public C4642a(IBinder iBinder) {
                this.f226a = iBinder;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.zui.deviceidservice.InterfaceC0544a
            /* JADX INFO: renamed from: a */
            public String mo83a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    if (!this.f226a.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f225a;
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
                return this.f226a;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.zui.deviceidservice.InterfaceC0544a
            /* JADX INFO: renamed from: b */
            public boolean mo84b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    if (!this.f226a.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f225a;
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
    String mo83a();

    /* JADX INFO: renamed from: b */
    boolean mo84b();
}
