package com.octopus.p222ad.internal.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import com.octopus.p222ad.ADBidEvent;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.IBidding;
import com.octopus.p222ad.NativeAdListener;
import com.octopus.p222ad.NativeAdResponse;
import com.octopus.p222ad.internal.C3110c;
import com.octopus.p222ad.internal.C3111d;
import com.octopus.p222ad.internal.EnumC3119l;
import com.octopus.p222ad.internal.InterfaceC3073a;
import com.octopus.p222ad.internal.InterfaceC3081b;
import com.octopus.p222ad.internal.network.AsyncTaskC3126a;
import com.octopus.p222ad.internal.network.InterfaceC3127b;
import com.octopus.p222ad.internal.utilities.DeviceInfoUtil;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.ImageService;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.UserEnvInfoUtil;

/* JADX INFO: renamed from: com.octopus.ad.internal.nativead.a */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC3122a extends AsyncTaskC3126a implements IBidding, InterfaceC3073a {

    /* JADX INFO: renamed from: a */
    public C3110c f17206a;

    /* JADX INFO: renamed from: c */
    private NativeAdListener f17207c;

    /* JADX INFO: renamed from: d */
    private a f17208d;

    /* JADX INFO: renamed from: e */
    private boolean f17209e;

    /* JADX INFO: renamed from: f */
    private boolean f17210f;

    /* JADX INFO: renamed from: g */
    private C3111d f17211g;

    /* JADX INFO: renamed from: h */
    private int f17212h;

    /* JADX INFO: renamed from: i */
    private String f17213i;

    /* JADX INFO: renamed from: j */
    private String f17214j;

    /* JADX INFO: renamed from: k */
    private boolean f17215k = false;

    /* JADX INFO: renamed from: com.octopus.ad.internal.nativead.a$a */
    public class a implements InterfaceC3081b, ImageService.ImageServiceListener {

        /* JADX INFO: renamed from: a */
        public ImageService f17216a;

        /* JADX INFO: renamed from: b */
        public NativeAdResponse f17217b;

        /* JADX INFO: renamed from: com.octopus.ad.internal.nativead.a$a$1 */
        public class AnonymousClass1 implements ImageService.ImageReceiver {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ NativeAdResponse f17219a;

            public AnonymousClass1(NativeAdResponse nativeAdResponse) {
                nativeAdResponse = nativeAdResponse;
            }

            @Override // com.octopus.ad.internal.utilities.ImageService.ImageReceiver
            public void onFail() {
                HaoboLog.m14609e(HaoboLog.httpRespLogTag, "Image downloading logFailed for url " + nativeAdResponse.getImageUrl());
            }

            @Override // com.octopus.ad.internal.utilities.ImageService.ImageReceiver
            public void onReceiveImage(Bitmap bitmap) {
                nativeAdResponse.setImage(bitmap);
            }
        }

        /* JADX INFO: renamed from: com.octopus.ad.internal.nativead.a$a$2 */
        public class AnonymousClass2 implements ImageService.ImageReceiver {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ NativeAdResponse f17221a;

            public AnonymousClass2(NativeAdResponse nativeAdResponse) {
                nativeAdResponse = nativeAdResponse;
            }

            @Override // com.octopus.ad.internal.utilities.ImageService.ImageReceiver
            public void onFail() {
                HaoboLog.m14609e(HaoboLog.httpRespLogTag, "Image downloading logFailed for url " + nativeAdResponse.getIconUrl());
            }

            @Override // com.octopus.ad.internal.utilities.ImageService.ImageReceiver
            public void onReceiveImage(Bitmap bitmap) {
                nativeAdResponse.setIcon(bitmap);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AsyncTaskC3122a asyncTaskC3122a, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14235a() {
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14236a(int i) {
            if (AsyncTaskC3122a.this.f17207c != null) {
                AsyncTaskC3122a.this.f17207c.onAdFailed(i);
            }
            AsyncTaskC3122a.this.f17215k = false;
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14237a(long j) {
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14238a(InterfaceC3127b interfaceC3127b) {
            if (!interfaceC3127b.mo14402a().equals(EnumC3119l.NATIVE)) {
                mo14236a(AdRequest.INVALID_MEDIA_TYPE);
                return;
            }
            NativeAdResponse nativeAdResponseMo14404c = interfaceC3127b.mo14404c();
            if (nativeAdResponseMo14404c == null) {
                return;
            }
            this.f17217b = nativeAdResponseMo14404c;
            if (((C3124c) nativeAdResponseMo14404c).m14522a() == 1) {
                mo14236a(AdRequest.ERROR_CODE_NO_FILL);
                AsyncTaskC3122a.this.sendLossNotice(interfaceC3127b.mo14406e() + 100, "1001", ADBidEvent.OTHER);
                return;
            }
            AsyncTaskC3122a.this.m14458a(interfaceC3127b.mo14406e());
            AsyncTaskC3122a.this.m14465b(interfaceC3127b.mo14407f());
            AsyncTaskC3122a.this.m14472e(nativeAdResponseMo14404c.getLandingPageUrl());
            if (!AsyncTaskC3122a.this.f17209e && !AsyncTaskC3122a.this.f17210f) {
                if (AsyncTaskC3122a.this.f17207c != null) {
                    AsyncTaskC3122a.this.f17207c.onAdLoaded(nativeAdResponseMo14404c);
                } else {
                    nativeAdResponseMo14404c.destroy();
                }
                AsyncTaskC3122a.this.f17215k = false;
                return;
            }
            this.f17216a = new ImageService();
            if (AsyncTaskC3122a.this.f17209e) {
                this.f17216a.registerImageReceiver(new ImageService.ImageReceiver() { // from class: com.octopus.ad.internal.nativead.a.a.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ NativeAdResponse f17219a;

                    public AnonymousClass1(NativeAdResponse nativeAdResponseMo14404c2) {
                        nativeAdResponse = nativeAdResponseMo14404c2;
                    }

                    @Override // com.octopus.ad.internal.utilities.ImageService.ImageReceiver
                    public void onFail() {
                        HaoboLog.m14609e(HaoboLog.httpRespLogTag, "Image downloading logFailed for url " + nativeAdResponse.getImageUrl());
                    }

                    @Override // com.octopus.ad.internal.utilities.ImageService.ImageReceiver
                    public void onReceiveImage(Bitmap bitmap) {
                        nativeAdResponse.setImage(bitmap);
                    }
                }, nativeAdResponseMo14404c2.getImageUrl());
            }
            if (AsyncTaskC3122a.this.f17210f) {
                this.f17216a.registerImageReceiver(new ImageService.ImageReceiver() { // from class: com.octopus.ad.internal.nativead.a.a.2

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ NativeAdResponse f17221a;

                    public AnonymousClass2(NativeAdResponse nativeAdResponseMo14404c2) {
                        nativeAdResponse = nativeAdResponseMo14404c2;
                    }

                    @Override // com.octopus.ad.internal.utilities.ImageService.ImageReceiver
                    public void onFail() {
                        HaoboLog.m14609e(HaoboLog.httpRespLogTag, "Image downloading logFailed for url " + nativeAdResponse.getIconUrl());
                    }

                    @Override // com.octopus.ad.internal.utilities.ImageService.ImageReceiver
                    public void onReceiveImage(Bitmap bitmap) {
                        nativeAdResponse.setIcon(bitmap);
                    }
                }, nativeAdResponseMo14404c2.getIconUrl());
            }
            this.f17216a.registerNotification(this);
            this.f17216a.execute();
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14239a(String str, int i) {
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: a */
        public void mo14240a(String str, String str2) {
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: b */
        public void mo14241b() {
            NativeAdResponse nativeAdResponse = this.f17217b;
            if (nativeAdResponse != null) {
                nativeAdResponse.destroy();
                this.f17217b = null;
            }
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: c */
        public void mo14242c() {
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: d */
        public void mo14243d() {
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: e */
        public void mo14244e() {
        }

        @Override // com.octopus.p222ad.internal.InterfaceC3081b
        /* JADX INFO: renamed from: f */
        public void mo14245f() {
        }

        @Override // com.octopus.ad.internal.utilities.ImageService.ImageServiceListener
        public void onAllImageDownloadsFinish() {
            if (AsyncTaskC3122a.this.f17207c != null) {
                AsyncTaskC3122a.this.f17207c.onAdLoaded(this.f17217b);
            } else {
                this.f17217b.destroy();
            }
            this.f17216a = null;
            this.f17217b = null;
            AsyncTaskC3122a.this.f17215k = false;
        }
    }

    public AsyncTaskC3122a(Context context, String str, int i) {
        DeviceInfoUtil.retrieveDeviceInfo(context.getApplicationContext());
        UserEnvInfoUtil.retrieveUserEnvInfo(context.getApplicationContext());
        C3111d c3111d = new C3111d(context, StringUtil.createRequestId());
        this.f17211g = c3111d;
        c3111d.m14372a(str);
        this.f17211g.m14370a(i);
        this.f17211g.m14371a(EnumC3119l.NATIVE);
        C3110c c3110c = new C3110c(this);
        this.f17206a = c3110c;
        c3110c.m14366a(-1);
        this.f17208d = new a();
    }

    /* JADX INFO: renamed from: a */
    public void m14458a(int i) {
        this.f17212h = i;
    }

    /* JADX INFO: renamed from: a */
    public void m14459a(NativeAdListener nativeAdListener) {
        this.f17207c = nativeAdListener;
    }

    /* JADX INFO: renamed from: a */
    public void m14460a(String str) {
        HaoboLog.m14607d(HaoboLog.nativeLogTag, HaoboLog.getString(C3063R.string.set_placement_id, str));
        this.f17211g.m14372a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m14461a(boolean z) {
        HaoboLog.m14607d(HaoboLog.nativeLogTag, HaoboLog.getString(C3063R.string.set_opens_native_browser, z));
        this.f17211g.m14377b(z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m14462a() {
        HaoboLog.m14607d(HaoboLog.nativeLogTag, HaoboLog.getString(C3063R.string.get_opens_native_browser, this.f17211g.m14389j()));
        return this.f17211g.m14389j();
    }

    /* JADX INFO: renamed from: a */
    public boolean m14463a(AsyncTaskC3126a.a aVar) {
        String str;
        String str2;
        if (this.f17207c == null) {
            str = HaoboLog.nativeLogTag;
            str2 = "No mNativeAdListener installed for this request, won't load a new ad";
        } else {
            if (!this.f17215k) {
                if (!this.f17211g.m14391l()) {
                    return false;
                }
                this.f17206a.m14365a();
                this.f17206a.m14368c();
                this.f17206a.m14367b();
                this.f17215k = true;
                return true;
            }
            str = HaoboLog.nativeLogTag;
            str2 = "Still loading last nativead ad , won't load a new ad";
        }
        HaoboLog.m14609e(str, str2);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public String m14464b() {
        HaoboLog.m14607d(HaoboLog.nativeLogTag, HaoboLog.getString(C3063R.string.get_placement_id, this.f17211g.m14378c()));
        return this.f17211g.m14378c();
    }

    /* JADX INFO: renamed from: b */
    public void m14465b(String str) {
        this.f17213i = str;
    }

    /* JADX INFO: renamed from: b */
    public void m14466b(boolean z) {
        m14461a(z);
    }

    /* JADX INFO: renamed from: c */
    public int m14467c() {
        return this.f17212h;
    }

    /* JADX INFO: renamed from: c */
    public void m14468c(String str) {
        this.f17211g.m14376b(str);
    }

    /* JADX INFO: renamed from: d */
    public String m14469d() {
        return this.f17213i;
    }

    /* JADX INFO: renamed from: d */
    public void m14470d(String str) {
        this.f17211g.m14380c(str);
    }

    /* JADX INFO: renamed from: e */
    public C3111d m14471e() {
        return this.f17211g;
    }

    /* JADX INFO: renamed from: e */
    public void m14472e(String str) {
        this.f17214j = str;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC3081b m14473f() {
        return this.f17208d;
    }

    /* JADX INFO: renamed from: g */
    public void m14474g() {
        this.f17208d.mo14241b();
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3073a
    public EnumC3119l getMediaType() {
        return this.f17211g.m14390k();
    }

    @Override // com.octopus.p222ad.internal.InterfaceC3073a
    public boolean isReadyToStart() {
        return this.f17207c != null && this.f17211g.m14391l();
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendLossNotice(int i, String str, String str2) {
        NativeAdResponse nativeAdResponse;
        try {
            a aVar = this.f17208d;
            if (aVar == null || (nativeAdResponse = aVar.f17217b) == null) {
                return;
            }
            C3124c c3124c = (C3124c) nativeAdResponse;
            c3124c.m14524a(i, str, str2);
            c3124c.m14531b();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.octopus.p222ad.IBidding
    public void sendWinNotice(int i) {
        NativeAdResponse nativeAdResponse;
        try {
            a aVar = this.f17208d;
            if (aVar == null || (nativeAdResponse = aVar.f17217b) == null) {
                return;
            }
            ((C3124c) nativeAdResponse).m14532b(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
