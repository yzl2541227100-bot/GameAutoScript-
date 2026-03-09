package com.octopus.p222ad.internal.nativead;

import android.util.Log;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.NativeAdResponse;
import com.octopus.p222ad.internal.AbstractC3129o;
import com.octopus.p222ad.internal.C3111d;
import com.octopus.p222ad.internal.EnumC3119l;
import com.octopus.p222ad.internal.network.InterfaceC3127b;
import com.octopus.p222ad.internal.network.ServerResponse;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.view.InterfaceC3194b;
import com.octopus.p222ad.utils.p258b.C3257h;
import java.lang.ref.SoftReference;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: com.octopus.ad.internal.nativead.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3123b extends AbstractC3129o {

    /* JADX INFO: renamed from: a */
    private final SoftReference<AsyncTaskC3122a> f17223a;

    /* JADX INFO: renamed from: com.octopus.ad.internal.nativead.b$1 */
    public class AnonymousClass1 implements InterfaceC3127b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3124c f17224a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ServerResponse f17225b;

        public AnonymousClass1(C3124c c3124c, ServerResponse serverResponse) {
            c3124c = c3124c;
            serverResponse = serverResponse;
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: a */
        public EnumC3119l mo14402a() {
            return EnumC3119l.NATIVE;
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: b */
        public InterfaceC3194b mo14403b() {
            return null;
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: c */
        public NativeAdResponse mo14404c() {
            return c3124c;
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: d */
        public String mo14405d() {
            return "";
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: e */
        public int mo14406e() {
            return serverResponse.getPrice();
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: f */
        public String mo14407f() {
            return serverResponse.getTagId();
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: g */
        public String mo14408g() {
            return null;
        }

        @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
        /* JADX INFO: renamed from: h */
        public void mo14409h() {
            c3124c.destroy();
        }
    }

    public C3123b(AsyncTaskC3122a asyncTaskC3122a) {
        this.f17223a = new SoftReference<>(asyncTaskC3122a);
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: a */
    public void mo14393a() {
        AsyncTaskC3122a asyncTaskC3122a = this.f17223a.get();
        if (asyncTaskC3122a == null) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, "Before execute request manager, you should set ad request!");
            return;
        }
        m14591e();
        try {
            asyncTaskC3122a.m14557a(this);
            asyncTaskC3122a.executeOnExecutor(C3257h.m14988b().m14989c(), new Void[0]);
        } catch (IllegalStateException e) {
            Log.d("octopus", "ignored:" + e.getMessage());
        } catch (RejectedExecutionException e2) {
            HaoboLog.m14609e(HaoboLog.baseLogTag, "Concurrent Thread Exception while firing new ad request: " + e2.getMessage());
        }
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: a */
    public void mo14394a(int i) {
        m14592f();
        AsyncTaskC3122a asyncTaskC3122a = this.f17223a.get();
        if (asyncTaskC3122a != null) {
            asyncTaskC3122a.m14473f().mo14236a(i);
        }
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: a */
    public void mo14395a(ServerResponse serverResponse) {
        AsyncTaskC3122a asyncTaskC3122a = this.f17223a.get();
        if (asyncTaskC3122a != null) {
            if (!serverResponse.containsAds()) {
                HaoboLog.m14615w(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.response_no_ads));
                asyncTaskC3122a.m14473f().mo14236a(AdRequest.ERROR_CODE_NO_FILL);
            } else {
                C3124c c3124c = (C3124c) serverResponse.getNativeAdResponse();
                c3124c.m14529a(asyncTaskC3122a.m14471e().m14369a());
                c3124c.m14530a(asyncTaskC3122a.m14462a());
                m14475a(new InterfaceC3127b() { // from class: com.octopus.ad.internal.nativead.b.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ C3124c f17224a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ ServerResponse f17225b;

                    public AnonymousClass1(C3124c c3124c2, ServerResponse serverResponse2) {
                        c3124c = c3124c2;
                        serverResponse = serverResponse2;
                    }

                    @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                    /* JADX INFO: renamed from: a */
                    public EnumC3119l mo14402a() {
                        return EnumC3119l.NATIVE;
                    }

                    @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                    /* JADX INFO: renamed from: b */
                    public InterfaceC3194b mo14403b() {
                        return null;
                    }

                    @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                    /* JADX INFO: renamed from: c */
                    public NativeAdResponse mo14404c() {
                        return c3124c;
                    }

                    @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                    /* JADX INFO: renamed from: d */
                    public String mo14405d() {
                        return "";
                    }

                    @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                    /* JADX INFO: renamed from: e */
                    public int mo14406e() {
                        return serverResponse.getPrice();
                    }

                    @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                    /* JADX INFO: renamed from: f */
                    public String mo14407f() {
                        return serverResponse.getTagId();
                    }

                    @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                    /* JADX INFO: renamed from: g */
                    public String mo14408g() {
                        return null;
                    }

                    @Override // com.octopus.p222ad.internal.network.InterfaceC3127b
                    /* JADX INFO: renamed from: h */
                    public void mo14409h() {
                        c3124c.destroy();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14475a(InterfaceC3127b interfaceC3127b) {
        m14592f();
        AsyncTaskC3122a asyncTaskC3122a = this.f17223a.get();
        if (asyncTaskC3122a != null) {
            asyncTaskC3122a.m14473f().mo14238a(interfaceC3127b);
        } else {
            interfaceC3127b.mo14409h();
        }
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3112e
    /* JADX INFO: renamed from: b */
    public C3111d mo14396b() {
        AsyncTaskC3122a asyncTaskC3122a = this.f17223a.get();
        if (asyncTaskC3122a != null) {
            return asyncTaskC3122a.m14471e();
        }
        return null;
    }

    @Override // com.octopus.p222ad.internal.AbstractC3129o
    /* JADX INFO: renamed from: c */
    public void mo14400c() {
        AsyncTaskC3122a asyncTaskC3122a = this.f17223a.get();
        if (asyncTaskC3122a != null) {
            asyncTaskC3122a.cancel(true);
        }
    }
}
