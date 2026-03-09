package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3485a {

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final String f19156a;

        /* JADX INFO: renamed from: b */
        private final boolean f19157b;

        public a(String str, boolean z) {
            this.f19156a = str;
            this.f19157b = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public String m16296b() {
            return this.f19156a;
        }

        /* JADX INFO: renamed from: a */
        public boolean m16297a() {
            return this.f19157b;
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a$b */
    public static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public boolean f19158a;

        /* JADX INFO: renamed from: b */
        private final LinkedBlockingQueue<IBinder> f19159b;

        private b() {
            this.f19158a = false;
            this.f19159b = new LinkedBlockingQueue<>(1);
        }

        /* JADX INFO: renamed from: a */
        public IBinder m16298a() throws InterruptedException {
            if (this.f19158a) {
                throw new IllegalStateException();
            }
            this.f19158a = true;
            return this.f19159b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f19159b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a$c */
    public static final class c implements IInterface {

        /* JADX INFO: renamed from: a */
        private IBinder f19160a;

        public c(IBinder iBinder) {
            this.f19160a = iBinder;
        }

        /* JADX INFO: renamed from: a */
        public String m16299a() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f19160a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m16300a(boolean z) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z ? 1 : 0);
                this.f19160a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f19160a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m16293a(Context context) {
        try {
            a aVarM16294b = m16294b(context);
            if (aVarM16294b == null) {
                return null;
            }
            return aVarM16294b.m16296b();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static a m16294b(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return null;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (!context.bindService(intent, bVar, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                try {
                    c cVar = new c(bVar.m16298a());
                    return new a(cVar.m16299a(), cVar.m16300a(true));
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                context.unbindService(bVar);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
