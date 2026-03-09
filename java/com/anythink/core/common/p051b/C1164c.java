package com.anythink.core.common.p051b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.anythink.core.common.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1164c {

    /* JADX INFO: renamed from: com.anythink.core.common.b.c$a */
    public final class a {

        /* JADX INFO: renamed from: b */
        private final String f3008b;

        /* JADX INFO: renamed from: c */
        private final boolean f3009c;

        public a(String str, boolean z) {
            this.f3008b = str;
            this.f3009c = z;
        }

        /* JADX INFO: renamed from: b */
        private boolean m2023b() {
            return this.f3009c;
        }

        /* JADX INFO: renamed from: a */
        public final String m2024a() {
            return this.f3008b;
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.c$b */
    public final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public boolean f3010a;

        /* JADX INFO: renamed from: c */
        private final LinkedBlockingQueue<IBinder> f3012c;

        private b() {
            this.f3010a = false;
            this.f3012c = new LinkedBlockingQueue<>(1);
        }

        public /* synthetic */ b(C1164c c1164c, byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final IBinder m2025a() {
            if (this.f3010a) {
                throw new IllegalStateException();
            }
            this.f3010a = true;
            return this.f3012c.take();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f3012c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.b.c$c */
    public final class c implements IInterface {

        /* JADX INFO: renamed from: b */
        private IBinder f3014b;

        public c(IBinder iBinder) {
            this.f3014b = iBinder;
        }

        /* JADX INFO: renamed from: a */
        public final String m2026a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f3014b.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f3014b;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m2027b() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f3014b.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m2022a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            byte b2 = 0;
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b(this, b2);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0 || !context.bindService(intent, bVar, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                c cVar = new c(bVar.m2025a());
                return new a(cVar.m2026a(), cVar.m2027b());
            } finally {
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
