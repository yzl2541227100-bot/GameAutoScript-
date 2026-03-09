package cn.haorui.sdk.core.oaid.repeackage.com.bun.lib;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.bun.lib.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0539a extends IInterface {

    /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.bun.lib.a$a */
    public static abstract class a extends Binder implements InterfaceC0539a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f215a = 0;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.repeackage.com.bun.lib.a$a$a, reason: collision with other inner class name */
        public static class C4637a implements InterfaceC0539a {

            /* JADX INFO: renamed from: a */
            public IBinder f216a;

            public C4637a(IBinder iBinder) {
                this.f216a = iBinder;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.bun.lib.InterfaceC0539a
            /* JADX INFO: renamed from: a */
            public String mo76a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.f216a.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f215a;
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
                return this.f216a;
            }

            @Override // cn.haorui.sdk.core.oaid.repeackage.com.bun.lib.InterfaceC0539a
            /* JADX INFO: renamed from: d */
            public boolean mo77d() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    if (!this.f216a.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i = a.f215a;
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
    String mo76a();

    /* JADX INFO: renamed from: d */
    boolean mo77d();
}
