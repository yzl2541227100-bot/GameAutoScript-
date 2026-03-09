package cn.haorui.sdk.core.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.haorui.sdk.core.domain.HttpResponse;
import cn.haorui.sdk.core.exception.C0493a;
import cn.haorui.sdk.core.taskcenter.C0551g;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p285z2.AbstractC4262px;
import p285z2.AbstractC4336rx;
import p285z2.C3892fx;
import p285z2.C3966hx;
import p285z2.C4003ix;
import p285z2.C4077kx;
import p285z2.C4151mx;
import p285z2.C4225ox;
import p285z2.C4299qx;
import p285z2.InterfaceC4335rw;
import p285z2.InterfaceC4372sw;

/* JADX INFO: loaded from: classes.dex */
public final class HttpUtil {
    private static final String TAG = "HttpUtil";
    private static C4151mx adClient;
    private static C4151mx client;
    private static final C4077kx MEDIA_TYPE_TEXT = C4077kx.OooO0Oo("text/x-markdown; charset=utf-8");
    private static final C4077kx MEDIA_TYPE_JPG = C4077kx.OooO0Oo("image/png");
    private static final C4077kx MEDIA_TYPE_AUDIO = C4077kx.OooO0Oo("audio/mp3");
    private static final C4077kx MEDIA_TYPE_VIDEO = C4077kx.OooO0Oo(C1732o.f9735e);
    private static final C4077kx MEDIA_TYPE_OBJECT = C4077kx.OooO0Oo(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE);
    private static final C4077kx MEDIA_TYPE_JSON = C4077kx.OooO0Oo("application/json; charset=utf-8");
    private static Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$a */
    public static class C0566a implements InterfaceC4372sw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpGetJsonCallback f252a;

        public C0566a(HttpGetJsonCallback httpGetJsonCallback) {
            this.f252a = httpGetJsonCallback;
        }

        @Override // p285z2.InterfaceC4372sw
        public void onFailure(@NotNull InterfaceC4335rw interfaceC4335rw, @NotNull IOException iOException) {
            this.f252a.onFailure(iOException);
        }

        @Override // p285z2.InterfaceC4372sw
        public void onResponse(@NotNull InterfaceC4335rw interfaceC4335rw, @NotNull C4299qx c4299qx) {
            AbstractC4336rx abstractC4336rxOooOO0 = c4299qx.OooOO0();
            OriginalResponse originalResponse = new OriginalResponse(c4299qx.OoooooO(), c4299qx.o00o0O());
            originalResponse.setHeaders(c4299qx.o00Oo0());
            if (abstractC4336rxOooOO0 != null) {
                try {
                    originalResponse.setBody(abstractC4336rxOooOO0.string());
                } catch (Throwable th) {
                    originalResponse.setBody("");
                    th.printStackTrace();
                }
            }
            try {
                try {
                    this.f252a.onResponse(originalResponse);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                c4299qx.close();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$b */
    public static class C0567b implements InterfaceC4372sw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpGetJsonCallback f253a;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ IOException f254a;

            public a(IOException iOException) {
                this.f254a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0567b.this.f253a.onFailure(this.f254a);
            }
        }

        /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ OriginalResponse f256a;

            public b(OriginalResponse originalResponse) {
                this.f256a = originalResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C0567b.this.f253a.onResponse(this.f256a);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public C0567b(HttpGetJsonCallback httpGetJsonCallback) {
            this.f253a = httpGetJsonCallback;
        }

        @Override // p285z2.InterfaceC4372sw
        public void onFailure(@NotNull InterfaceC4335rw interfaceC4335rw, @NotNull IOException iOException) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                HttpUtil.handler.post(new a(iOException));
            }
        }

        @Override // p285z2.InterfaceC4372sw
        public void onResponse(@NotNull InterfaceC4335rw interfaceC4335rw, @NotNull C4299qx c4299qx) {
            AbstractC4336rx abstractC4336rxOooOO0 = c4299qx.OooOO0();
            OriginalResponse originalResponse = new OriginalResponse(c4299qx.OoooooO(), c4299qx.o00o0O());
            originalResponse.setHeaders(c4299qx.o00Oo0());
            if (abstractC4336rxOooOO0 != null) {
                try {
                    originalResponse.setBody(abstractC4336rxOooOO0.string());
                } catch (Throwable th) {
                    originalResponse.setBody("");
                    th.printStackTrace();
                }
            }
            c4299qx.close();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                HttpUtil.handler.post(new b(originalResponse));
                return;
            }
            try {
                this.f253a.onResponse(originalResponse);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$c */
    public static class C0568c implements InterfaceC4372sw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpGetWithStringCallback f258a;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ IOException f259a;

            public a(IOException iOException) {
                this.f259a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0568c.this.f258a.onFailure(this.f259a);
                Integer num = C0493a.f86a;
            }
        }

        /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ HttpResponse f261a;

            public b(HttpResponse httpResponse) {
                this.f261a = httpResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C0568c.this.f258a.onResponse(this.f261a);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public C0568c(HttpGetWithStringCallback httpGetWithStringCallback) {
            this.f258a = httpGetWithStringCallback;
        }

        @Override // p285z2.InterfaceC4372sw
        public void onFailure(@NotNull InterfaceC4335rw interfaceC4335rw, @NotNull IOException iOException) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                HttpUtil.handler.post(new a(iOException));
            }
        }

        @Override // p285z2.InterfaceC4372sw
        public void onResponse(@NotNull InterfaceC4335rw interfaceC4335rw, @NotNull C4299qx c4299qx) {
            HttpResponse<String> httpResponse = new HttpResponse<>();
            if (c4299qx.o00o0O()) {
                httpResponse.setSuccessful(true);
                c4299qx.OooOO0();
            } else {
                httpResponse.setSuccessful(false);
                httpResponse.setErrorCode(c4299qx.OoooooO());
                httpResponse.setErrorDescription(c4299qx.o00ooo());
            }
            c4299qx.close();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                HttpUtil.handler.post(new b(httpResponse));
                return;
            }
            try {
                this.f258a.onResponse(httpResponse);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$d */
    public static class C0569d implements HttpGetJsonCallback<OriginalResponse> {
        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        public void onFailure(@NotNull IOException iOException) {
            LogUtil.m87e(HttpUtil.TAG, "onFailure: " + iOException.getMessage());
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        public void onResponse(OriginalResponse originalResponse) {
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$e */
    public static class C0570e implements InterfaceC4372sw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpGetJsonCallback f263a;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ IOException f264a;

            public a(IOException iOException) {
                this.f264a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0570e.this.f263a.onFailure(this.f264a);
                Integer num = C0493a.f86a;
            }
        }

        /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$e$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C4299qx f266a;

            public b(C4299qx c4299qx) {
                this.f266a = c4299qx;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C0570e.this.f263a.onResponse(this.f266a);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public C0570e(HttpGetJsonCallback httpGetJsonCallback) {
            this.f263a = httpGetJsonCallback;
        }

        @Override // p285z2.InterfaceC4372sw
        public void onFailure(@NotNull InterfaceC4335rw interfaceC4335rw, @NotNull IOException iOException) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                HttpUtil.handler.post(new a(iOException));
            }
        }

        @Override // p285z2.InterfaceC4372sw
        public void onResponse(@NotNull InterfaceC4335rw interfaceC4335rw, @NotNull C4299qx c4299qx) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                HttpUtil.handler.post(new b(c4299qx));
                return;
            }
            try {
                this.f263a.onResponse(c4299qx);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$f */
    public static class C0571f implements HttpGetJsonCallback<OriginalResponse> {
        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        public void onFailure(@NotNull IOException iOException) {
            LogUtil.m87e(HttpUtil.TAG, "Task_onFailure: " + iOException.getMessage());
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        public void onResponse(OriginalResponse originalResponse) {
            LogUtil.m87e(HttpUtil.TAG, "Task_onResponse: " + originalResponse.getBody());
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$g */
    public static class C0572g implements InterfaceC4372sw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpGetBytesCallback f268a;

        /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$g$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ IOException f269a;

            public a(IOException iOException) {
                this.f269a = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0572g.this.f268a.onFailure(this.f269a);
            }
        }

        /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$g$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ HttpResponse f271a;

            public b(HttpResponse httpResponse) {
                this.f271a = httpResponse;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C0572g.this.f268a.onResponse(this.f271a);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public C0572g(HttpGetBytesCallback httpGetBytesCallback) {
            this.f268a = httpGetBytesCallback;
        }

        @Override // p285z2.InterfaceC4372sw
        public void onFailure(@NotNull InterfaceC4335rw interfaceC4335rw, IOException iOException) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                HttpUtil.handler.post(new a(iOException));
            } else {
                this.f268a.onFailure(iOException);
            }
        }

        @Override // p285z2.InterfaceC4372sw
        public void onResponse(@NotNull InterfaceC4335rw interfaceC4335rw, @NotNull C4299qx c4299qx) {
            String strO00ooo;
            HttpResponse httpResponse = new HttpResponse();
            try {
                if (!c4299qx.o00o0O()) {
                    httpResponse.setSuccessful(false);
                    httpResponse.setErrorCode(c4299qx.OoooooO());
                    strO00ooo = c4299qx.o00ooo();
                } else {
                    if (c4299qx.OooOO0() != null) {
                        byte[] bArrBytes = c4299qx.OooOO0().bytes();
                        httpResponse.setSuccessful(true);
                        httpResponse.setResponseBody(bArrBytes);
                        SdkHandler.getInstance().runOnUiThread(new b(httpResponse));
                    }
                    httpResponse.setSuccessful(false);
                    httpResponse.setErrorCode(c4299qx.OoooooO());
                    strO00ooo = "bad file";
                }
                httpResponse.setErrorDescription(strO00ooo);
                SdkHandler.getInstance().runOnUiThread(new b(httpResponse));
            } finally {
                c4299qx.close();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.utils.HttpUtil$h */
    public static class RunnableC0573h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpGetBytesCallback f273a;

        public RunnableC0573h(HttpGetBytesCallback httpGetBytesCallback) {
            this.f273a = httpGetBytesCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f273a.onFailure(null);
        }
    }

    static {
        C4151mx.OooO0O0 oooO0O0 = new C4151mx.OooO0O0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        adClient = oooO0O0.OooO(30L, timeUnit).OooOoo(30L, timeUnit).OooO0Oo();
        client = new C4151mx.OooO0O0().OooO(30L, timeUnit).OooOoo(30L, timeUnit).OooO0Oo();
    }

    public static void asyncGetErrorReport(String str, Integer num, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (num == null) {
            num = -1;
        }
        String strReplaceMacros = replaceMacros(str, num.intValue(), str2);
        LogUtil.m86d(TAG, "错误上报： " + strReplaceMacros);
        asyncGetJson(strReplaceMacros, null, new C0569d());
    }

    public static void asyncGetFile(String str, @NotNull HttpGetBytesCallback httpGetBytesCallback) {
        try {
            client.OooO00o(new C4225ox.OooO00o().OooOOo0(str).OooO0O0()).OooOO0(new C0572g(httpGetBytesCallback));
        } catch (Exception e) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                handler.post(new RunnableC0573h(httpGetBytesCallback));
            } else {
                httpGetBytesCallback.onFailure(null);
            }
            e.printStackTrace();
        }
    }

    public static void asyncGetJson(@NotNull String str, Map<String, String> map, @NotNull HttpGetJsonCallback<OriginalResponse> httpGetJsonCallback) {
        try {
            C4003ix c4003ixOooOo0 = C4003ix.OooOo0(str);
            if (c4003ixOooOo0 == null) {
                return;
            }
            C4003ix.OooO00o oooO00oOooOOoo = c4003ixOooOo0.OooOOoo();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    oooO00oOooOOoo.OooO0oO(entry.getKey(), entry.getValue());
                }
            }
            C4225ox c4225oxOooO0O0 = new C4225ox.OooO00o().OooOOoo(oooO00oOooOOoo.OooO0oo()).OooO0o().OooO0O0();
            LogUtil.m86d(TAG, "url[" + c4225oxOooO0O0.OooOO0O().OoooO0O().toString() + "]");
            adClient.OooO00o(c4225oxOooO0O0).OooOO0(new C0567b(httpGetJsonCallback));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void asyncGetTaskReport(String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String string = TextUtils.replace(str, new String[]{"__REQTIME__"}, new String[]{String.valueOf(System.currentTimeMillis())}).toString();
        if (TextUtils.isEmpty(string) || !string.contains("&")) {
            strSubstring = "";
        } else {
            try {
                Uri uri = Uri.parse(string);
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                TreeSet<String> treeSet = new TreeSet(new C0551g());
                treeSet.addAll(queryParameterNames);
                Log.e("SignUtil", "sortParams: " + treeSet.toString());
                StringBuilder sb = new StringBuilder();
                for (String str2 : treeSet) {
                    String queryParameter = uri.getQueryParameter(str2);
                    sb.append(str2);
                    sb.append("=");
                    sb.append(queryParameter);
                    sb.append("&");
                }
                strSubstring = sb.toString().substring(0, sb.length() - 1);
            } catch (Exception e) {
                e.printStackTrace();
                strSubstring = "";
            }
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest((strSubstring + "GlSjz6xbhIJ&KEK*6!pykPBDSe@6wP$M").getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i));
            }
            asyncGetJson(string + "&sign=" + sb2.toString(), null, new C0571f());
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UnsupportedEncodingException", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("NoSuchAlgorithmException", e3);
        }
    }

    private static void asyncGetWithHeaders(@NotNull String str, @Nullable Map<String, String> map, @NotNull HttpGetWithStringCallback httpGetWithStringCallback) {
        try {
            C3966hx.OooO00o oooO00o = new C3966hx.OooO00o();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    oooO00o.OooO0O0(entry.getKey(), entry.getValue());
                }
            }
            C4003ix c4003ixOooOo0 = C4003ix.OooOo0(str);
            if (c4003ixOooOo0 == null) {
                return;
            }
            client.OooO00o(new C4225ox.OooO00o().OooO(oooO00o.OooO0oo()).OooOOoo(c4003ixOooOo0.OooOOoo().OooO0oo()).OooO0o().OooO0O0()).OooOO0(new C0568c(httpGetWithStringCallback));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void asyncGetWithWebViewUA(@NonNull Context context, @NotNull String str, @NotNull HttpGetWithStringCallback httpGetWithStringCallback) {
        String defaultUserAgent;
        LogUtil.m86d(TAG, "url=" + str);
        HashMap map = new HashMap();
        try {
            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        } catch (Exception e) {
            e.printStackTrace();
            defaultUserAgent = "";
        } catch (Throwable unused) {
            defaultUserAgent = "";
        }
        map.put("X-Requested-With", "");
        map.put("User-Agent", defaultUserAgent);
        asyncGetWithHeaders(str, map, httpGetWithStringCallback);
    }

    public static void asyncPostGetJson(String str, String str2, @NotNull HttpGetJsonCallback<C4299qx> httpGetJsonCallback) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        client.OooO00o(new C4225ox.OooO00o().OooOOo0(str).OooOO0o(AbstractC4262px.create(C4077kx.OooO0Oo("application/json; charset=utf-8"), str2)).OooO0O0()).OooOO0(new C0570e(httpGetJsonCallback));
    }

    public static void asyncRequestJson(@NotNull String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @NotNull HttpGetJsonCallback<OriginalResponse> httpGetJsonCallback) {
        try {
            C4003ix c4003ixOooOo0 = C4003ix.OooOo0(str);
            if (c4003ixOooOo0 == null) {
                return;
            }
            C4003ix.OooO00o oooO00oOooOOoo = c4003ixOooOo0.OooOOoo();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    oooO00oOooOOoo.OooO0oO(entry.getKey(), entry.getValue());
                }
            }
            C4225ox.OooO00o oooO00oOooOOoo2 = new C4225ox.OooO00o().OooOOoo(oooO00oOooOOoo.OooO0oo());
            if (map2 == null) {
                oooO00oOooOOoo2.OooO0o();
            } else {
                C3892fx.OooO00o oooO00o = new C3892fx.OooO00o();
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    oooO00o.OooO00o(entry2.getKey(), entry2.getValue());
                }
                oooO00oOooOOoo2.OooOO0o(oooO00o.OooO0OO());
            }
            if (map3 != null) {
                C3966hx.OooO00o oooO00o2 = new C3966hx.OooO00o();
                for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                    oooO00o2.OooO0O0(entry3.getKey(), entry3.getValue());
                }
                oooO00oOooOOoo2.OooO(oooO00o2.OooO0oo());
            }
            C4225ox c4225oxOooO0O0 = oooO00oOooOOoo2.OooO0O0();
            LogUtil.m86d(TAG, "url[" + c4225oxOooO0O0.OooOO0O().OoooO0O().toString() + "]");
            adClient.OooO00o(c4225oxOooO0O0).OooOO0(new C0566a(httpGetJsonCallback));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void doCommonRequest(C4225ox c4225ox, InterfaceC4372sw interfaceC4372sw) {
        client.OooO00o(c4225ox).OooOO0(interfaceC4372sw);
    }

    public static String replaceMacros(@NonNull String str, int i, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArr = {"__ERROR_CODE__", "__ERROR_MESSAGE__", "__MS_EVENT_SEC__", "__MS_EVENT_MSEC__"};
        String[] strArr2 = new String[4];
        strArr2[0] = i != 0 ? String.valueOf(i) : "__ERROR_CODE__";
        if (TextUtils.isEmpty(str2)) {
            str2 = "__ERROR_MESSAGE__";
        }
        strArr2[1] = str2;
        strArr2[2] = String.valueOf(jCurrentTimeMillis / 1000);
        strArr2[3] = String.valueOf(jCurrentTimeMillis);
        return TextUtils.replace(str, strArr, strArr2).toString();
    }
}
