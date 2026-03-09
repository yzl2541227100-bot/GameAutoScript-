package com.octopus.p222ad.internal.network;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.github.kevinsawicki.http.HttpRequest;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.C3111d;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.EnumC3119l;
import com.octopus.p222ad.internal.InterfaceC3112e;
import com.octopus.p222ad.internal.utilities.DeviceInfo;
import com.octopus.p222ad.internal.utilities.DeviceInfoUtil;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.HashingFunctions;
import com.octopus.p222ad.internal.utilities.SPUtils;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.UserEnvInfo;
import com.octopus.p222ad.internal.utilities.UserEnvInfoUtil;
import com.octopus.p222ad.internal.utilities.WebviewUtil;
import com.octopus.p222ad.p224b.C3068a;
import com.octopus.p222ad.p224b.C3069b;
import com.octopus.p222ad.p224b.C3071d;
import com.octopus.p222ad.p224b.C3072e;
import com.octopus.p222ad.utils.p229a.C3226b;
import com.octopus.p222ad.utils.p258b.C3250a;
import com.octopus.p222ad.utils.p258b.C3254e;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.utils.p258b.C3256g;
import com.octopus.p222ad.utils.p258b.C3261l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.octopus.ad.internal.network.a */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC3126a extends AsyncTask<Void, Integer, ServerResponse> {

    /* JADX INFO: renamed from: a */
    private SoftReference<InterfaceC3112e> f17371a;

    /* JADX INFO: renamed from: d */
    private final Bundle f17372d;

    /* JADX INFO: renamed from: e */
    private boolean f17373e;

    /* JADX INFO: renamed from: f */
    private int f17374f;

    /* JADX INFO: renamed from: g */
    private final Set<String> f17375g;

    /* JADX INFO: renamed from: h */
    private final Set<String> f17376h;

    /* JADX INFO: renamed from: i */
    private Date f17377i;

    /* JADX INFO: renamed from: j */
    private String f17378j;

    /* JADX INFO: renamed from: k */
    private int f17379k;

    /* JADX INFO: renamed from: l */
    private String f17380l;

    /* JADX INFO: renamed from: m */
    private int f17381m;

    /* JADX INFO: renamed from: n */
    private boolean f17382n;

    /* JADX INFO: renamed from: c */
    private static final ServerResponse f17370c = new ServerResponse(true);

    /* JADX INFO: renamed from: b */
    public static final String f17369b = HashingFunctions.md5("emulator");

    /* JADX INFO: renamed from: com.octopus.ad.internal.network.a$a */
    public static final class a {

        /* JADX INFO: renamed from: d */
        private Date f17386d;

        /* JADX INFO: renamed from: e */
        private String f17387e;

        /* JADX INFO: renamed from: h */
        private String f17390h;

        /* JADX INFO: renamed from: j */
        private boolean f17392j;

        /* JADX INFO: renamed from: a */
        private final HashSet<String> f17383a = new HashSet<>();

        /* JADX INFO: renamed from: b */
        private final Bundle f17384b = new Bundle();

        /* JADX INFO: renamed from: c */
        private final HashSet<String> f17385c = new HashSet<>();

        /* JADX INFO: renamed from: f */
        private int f17388f = -1;

        /* JADX INFO: renamed from: g */
        private boolean f17389g = false;

        /* JADX INFO: renamed from: i */
        private int f17391i = -1;

        /* JADX INFO: renamed from: a */
        public Bundle m14570a(Class<? extends Object> cls) {
            return this.f17384b.getBundle(cls.getName());
        }

        /* JADX INFO: renamed from: a */
        public Date m14571a() {
            return this.f17386d;
        }

        /* JADX INFO: renamed from: a */
        public void m14572a(int i) {
            this.f17388f = i;
        }

        /* JADX INFO: renamed from: a */
        public void m14573a(Class<? extends Object> cls, Bundle bundle) {
            this.f17384b.putBundle(cls.getName(), bundle);
        }

        /* JADX INFO: renamed from: a */
        public void m14574a(String str) {
            this.f17383a.add(str);
        }

        /* JADX INFO: renamed from: a */
        public void m14575a(Date date) {
            this.f17386d = date;
        }

        /* JADX INFO: renamed from: a */
        public void m14576a(boolean z) {
            this.f17391i = z ? 1 : 0;
        }

        /* JADX INFO: renamed from: b */
        public String m14577b() {
            return this.f17387e;
        }

        /* JADX INFO: renamed from: b */
        public void m14578b(String str) {
            this.f17385c.add(str);
        }

        /* JADX INFO: renamed from: b */
        public void m14579b(boolean z) {
            this.f17392j = z;
        }

        /* JADX INFO: renamed from: c */
        public int m14580c() {
            return this.f17388f;
        }

        /* JADX INFO: renamed from: c */
        public void m14581c(String str) {
            this.f17387e = str;
        }

        /* JADX INFO: renamed from: d */
        public Set<String> m14582d() {
            return this.f17383a;
        }

        /* JADX INFO: renamed from: d */
        public void m14583d(String str) {
            this.f17390h = str;
        }
    }

    public AsyncTaskC3126a() {
        this.f17375g = new HashSet();
        this.f17372d = null;
        this.f17376h = new HashSet();
    }

    public AsyncTaskC3126a(a aVar) {
        this.f17377i = aVar.f17386d;
        this.f17378j = aVar.f17387e;
        this.f17379k = aVar.f17388f;
        this.f17375g = Collections.unmodifiableSet(aVar.f17383a);
        this.f17372d = aVar.f17384b;
        this.f17376h = Collections.unmodifiableSet(aVar.f17385c);
        this.f17373e = aVar.f17389g;
        this.f17380l = aVar.f17390h;
        this.f17381m = aVar.f17391i;
        this.f17382n = aVar.f17392j;
    }

    /* JADX INFO: renamed from: a */
    private HttpURLConnection m14552a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: a */
    private void m14553a(int i) {
        InterfaceC3112e interfaceC3112e = this.f17371a.get();
        if (interfaceC3112e != null) {
            interfaceC3112e.mo14394a(i);
        }
        HaoboLog.clearLastResponse();
    }

    /* JADX INFO: renamed from: a */
    private void m14554a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setRequestProperty("User-Agent", C3120m.m14425a().m14442h());
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(HttpRequest.HEADER_ACCEPT, "application/json");
        String cookie = WebviewUtil.getCookie();
        if (!TextUtils.isEmpty(cookie)) {
            httpURLConnection.setRequestProperty("Cookie", cookie);
        }
        httpURLConnection.setRequestProperty("Connect-Length", Integer.toString(bArr.length));
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.flush();
        outputStream.close();
    }

    /* JADX INFO: renamed from: b */
    private boolean m14555b(int i) {
        if (i == 200) {
            return true;
        }
        HaoboLog.m14611i(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.http_bad_status, i));
        return false;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ServerResponse doInBackground(Void... voidArr) {
        C3111d c3111dMo14396b;
        String str;
        int i;
        String strM14440f;
        String string = "";
        InterfaceC3112e interfaceC3112e = this.f17371a.get();
        if (interfaceC3112e == null || (c3111dMo14396b = interfaceC3112e.mo14396b()) == null) {
            return null;
        }
        try {
            boolean z = c3111dMo14396b.m14390k() == EnumC3119l.PREFETCH;
            C3120m c3120mM14425a = C3120m.m14425a();
            DeviceInfo deviceInfo = DeviceInfo.getInstance();
            C3071d.a aVarM14190a = new C3071d.a.C4703a().m14188a(deviceInfo.sdkUID).m14200k(DeviceInfo.density).m14201l(DeviceInfo.densityDpi).m14191b(C3226b.m14911a(c3120mM14425a.m14441g())).m14202m(C3226b.m14917d(c3120mM14425a.m14441g())).m14204o(C3256g.m14985a(c3120mM14425a.m14441g())).m14205p(C3256g.m14986b(c3120mM14425a.m14441g())).m14206q(deviceInfo.bootMark).m14207r(deviceInfo.updateMark).m14192c("").m14193d(deviceInfo.f17415os).m14187a(C3072e.e.PLATFORM_ANDROID).m14186a(deviceInfo.devType).m14194e(deviceInfo.brand).m14195f(deviceInfo.model).m14196g(deviceInfo.manufacturer).m14197h(deviceInfo.resolution).m14198i(deviceInfo.screenSize).m14199j(deviceInfo.language).m14203n(deviceInfo.root).m14208s(deviceInfo.agVercode).m14209t(deviceInfo.hmsVercode).m14189a(deviceInfo.wxInstalled).m14210u(DeviceInfo.physicalMemoryByte).m14211v(DeviceInfo.harddiskSizeByte).m14212w(deviceInfo.appList).m14190a();
            UserEnvInfo userEnvInfo = UserEnvInfo.getInstance();
            C3071d.c cVarM14221a = new C3071d.c.a().m14220a(userEnvInfo.f19842net).m14219a(userEnvInfo.isp).m14221a();
            String strM14438d = c3120mM14425a.m14438d();
            if ("OctopusGroup".equals(c3111dMo14396b.m14381d())) {
                strM14440f = c3120mM14425a.m14439e();
                if (!TextUtils.isEmpty(strM14440f)) {
                    strM14438d = strM14440f;
                }
            } else {
                strM14440f = c3120mM14425a.m14440f();
                if (!TextUtils.isEmpty(strM14440f)) {
                    strM14438d = strM14440f;
                }
            }
            C3068a.b.a aVarM13898c = new C3068a.b.a().m13893a("1.5.8.9").m13892a(C3072e.i.SRC_APP).m13900d(UserEnvInfoUtil.getVersionName(C3120m.m14425a().f17185h)).m13891a(z ? C3072e.g.REQ_WIFI_PRELOAD : C3072e.g.REQ_AD).m13888a(C3261l.m15005c()).m13897b(strM14438d).m13899c("OctopusGroup".equals(c3111dMo14396b.m14381d()) ? c3111dMo14396b.m14383e() : "").m13889a(aVarM14190a).m13890a(cVarM14221a).m13900d(C3261l.m15009e(c3111dMo14396b.m14374b())).m13901e(C3261l.m15010f(c3111dMo14396b.m14374b())).m13902f(C3261l.m15008d(c3111dMo14396b.m14374b())).m13896b(C3261l.m14998a(c3111dMo14396b.m14374b())).m13898c(C3261l.m15006c(c3111dMo14396b.m14374b()));
            if (z) {
                for (String str2 : C3120m.m14425a().m14450p()) {
                    if (!StringUtil.isEmpty(str2)) {
                        aVarM13898c.m13895a(new C3068a.a.C4701a().m13869a(str2).m13872c(c3111dMo14396b.m14369a()).m13870a());
                    }
                }
            } else {
                aVarM13898c.m13895a(new C3068a.a.C4701a().m13869a(c3111dMo14396b.m14378c()).m13872c(c3111dMo14396b.m14369a()).m13871b(c3111dMo14396b.m14392m()).m13870a());
            }
            C3068a.b bVarM13894a = aVarM13898c.m13894a();
            Boolean bool = (Boolean) SPUtils.getFromGroupSdk(C3120m.m14425a().f17185h, "encrypt", Boolean.TRUE);
            if (bool == null || bool.booleanValue()) {
                String strM14967a = C3250a.m14967a(C3254e.m14980a(), bVarM13894a.toString());
                if (strM14967a != null) {
                    string = strM14967a;
                }
                Log.i("requestData:", string);
            } else {
                string = bVarM13894a.toString();
            }
            byte[] bytes = string.getBytes();
            C3255f.m14984d("octopus", "sdkRequest:" + bVarM13894a.toString());
            String strM14444j = c3120mM14425a.m14444j();
            if (!"OctopusGroup".equals(c3111dMo14396b.m14381d())) {
                strM14444j = strM14444j + "&v=1";
            }
            C3255f.m14984d("octopus", "getRequestBaseUrl:" + strM14444j);
            HaoboLog.setLastRequest(bVarM13894a.toString());
            HaoboLog.m14611i(HaoboLog.httpReqLogTag, HaoboLog.getString(C3063R.string.fetch_url, HaoboLog.getLastRequest()));
            HttpURLConnection httpURLConnectionM14552a = m14552a(new URL(strM14444j));
            m14554a(httpURLConnectionM14552a, bytes);
            httpURLConnectionM14552a.connect();
            this.f17374f = httpURLConnectionM14552a.getResponseCode();
            if (!m14555b(httpURLConnectionM14552a.getResponseCode())) {
                return f17370c;
            }
            if (httpURLConnectionM14552a.getContentLength() == 0) {
                HaoboLog.m14609e(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.response_blank));
            }
            InputStream inputStream = httpURLConnectionM14552a.getInputStream();
            C3069b.q qVarM14064a = C3069b.q.m14064a(inputStream);
            inputStream.close();
            return new ServerResponse(qVarM14064a, httpURLConnectionM14552a.getHeaderFields(), c3111dMo14396b.m14390k());
        } catch (MalformedURLException unused) {
            str = HaoboLog.httpReqLogTag;
            i = C3063R.string.http_url_malformed;
            HaoboLog.m14609e(str, HaoboLog.getString(i));
            return f17370c;
        } catch (IOException unused2) {
            str = HaoboLog.httpReqLogTag;
            i = C3063R.string.http_io;
            HaoboLog.m14609e(str, HaoboLog.getString(i));
            return f17370c;
        } catch (IllegalArgumentException unused3) {
            str = HaoboLog.httpReqLogTag;
            i = C3063R.string.http_unknown;
            HaoboLog.m14609e(str, HaoboLog.getString(i));
            return f17370c;
        } catch (SecurityException unused4) {
            str = HaoboLog.httpReqLogTag;
            i = C3063R.string.permissions_internet;
            HaoboLog.m14609e(str, HaoboLog.getString(i));
            return f17370c;
        } catch (Exception e) {
            e.printStackTrace();
            HaoboLog.m14609e(HaoboLog.httpReqLogTag, Log.getStackTraceString(e));
            str = HaoboLog.httpReqLogTag;
            i = C3063R.string.unknown_exception;
            HaoboLog.m14609e(str, HaoboLog.getString(i));
            return f17370c;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14557a(InterfaceC3112e interfaceC3112e) {
        int i;
        this.f17371a = new SoftReference<>(interfaceC3112e);
        C3111d c3111dMo14396b = interfaceC3112e.mo14396b();
        if (c3111dMo14396b == null || c3111dMo14396b.m14374b() == null) {
            i = AdRequest.ERROR_CODE_INVALID_REQUEST;
        } else {
            DeviceInfoUtil.retrieveDeviceInfo(c3111dMo14396b.m14374b().getApplicationContext());
            UserEnvInfoUtil.retrieveUserEnvInfo(c3111dMo14396b.m14374b().getApplicationContext());
            if (C3128c.m14584a(c3111dMo14396b.m14374b().getApplicationContext()).m14590b(c3111dMo14396b.m14374b())) {
                return;
            } else {
                i = AdRequest.ERROR_CODE_INTERNAL_ERROR;
            }
        }
        m14553a(i);
        cancel(true);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(ServerResponse serverResponse) {
        int i;
        if (serverResponse == null || this.f17374f == 204) {
            HaoboLog.m14613v(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.no_response));
            i = AdRequest.ERROR_CODE_NO_FILL;
        } else {
            if (!serverResponse.m14551a()) {
                InterfaceC3112e interfaceC3112e = this.f17371a.get();
                if (interfaceC3112e != null) {
                    interfaceC3112e.mo14395a(serverResponse);
                    return;
                }
                return;
            }
            i = AdRequest.ERROR_CODE_NETWORK_ERROR;
        }
        m14553a(i);
    }

    @Override // android.os.AsyncTask
    @TargetApi(11)
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onCancelled(ServerResponse serverResponse) {
        super.onCancelled(serverResponse);
        HaoboLog.m14615w(HaoboLog.httpRespLogTag, HaoboLog.getString(C3063R.string.cancel_request));
    }
}
