package com.octopus.p222ad.internal.nativead;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import com.anythink.china.common.p033a.AbstractC1067a;
import com.anythink.expressad.p086d.C1486b;
import com.octopus.p222ad.AdActivity;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.NativeAdResponse;
import com.octopus.p222ad.internal.AsyncTaskC3115h;
import com.octopus.p222ad.internal.AsyncTaskC3118k;
import com.octopus.p222ad.internal.C3114g;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.C3132r;
import com.octopus.p222ad.internal.network.ServerResponse;
import com.octopus.p222ad.internal.p225a.C3074a;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.ImageManager;
import com.octopus.p222ad.internal.utilities.JsonUtil;
import com.octopus.p222ad.internal.utilities.ReportEventUtil;
import com.octopus.p222ad.internal.utilities.SPUtils;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.UrlUtil;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.internal.utilities.WebviewUtil;
import com.octopus.p222ad.internal.view.AdViewImpl;
import com.octopus.p222ad.p224b.C3069b;
import com.octopus.p222ad.utils.C3215a;
import com.octopus.p222ad.utils.C3249b;
import com.octopus.p222ad.utils.C3266g;
import com.octopus.p222ad.utils.p258b.C3253d;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.utils.p258b.C3257h;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.octopus.ad.internal.nativead.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3124c implements NativeAdResponse {

    /* JADX INFO: renamed from: E */
    private ServerResponse.AdLogoInfo f17231E;

    /* JADX INFO: renamed from: F */
    private ServerResponse.AdLogoInfo f17232F;

    /* JADX INFO: renamed from: G */
    private ServerResponse f17233G;

    /* JADX INFO: renamed from: H */
    private List<? extends View> f17234H;

    /* JADX INFO: renamed from: J */
    private View f17236J;

    /* JADX INFO: renamed from: K */
    private List<View> f17237K;

    /* JADX INFO: renamed from: L */
    private NativeAdEventListener f17238L;

    /* JADX INFO: renamed from: M */
    private View.OnClickListener f17239M;

    /* JADX INFO: renamed from: N */
    private C3132r f17240N;

    /* JADX INFO: renamed from: O */
    private ArrayList<AsyncTaskC3118k> f17241O;

    /* JADX INFO: renamed from: Q */
    private long f17243Q;

    /* JADX INFO: renamed from: R */
    private int f17244R;

    /* JADX INFO: renamed from: S */
    private String f17245S;

    /* JADX INFO: renamed from: T */
    private String f17246T;

    /* JADX INFO: renamed from: U */
    private String f17247U;

    /* JADX INFO: renamed from: V */
    private String f17248V;

    /* JADX INFO: renamed from: W */
    private C3069b.i f17249W;

    /* JADX INFO: renamed from: X */
    private C3069b.b.a f17250X;

    /* JADX INFO: renamed from: Y */
    private C3069b.b f17251Y;

    /* JADX INFO: renamed from: a */
    private NativeAdResponse.EnumC3062b f17253a;

    /* JADX INFO: renamed from: b */
    private String f17254b;

    /* JADX INFO: renamed from: c */
    private String f17255c;

    /* JADX INFO: renamed from: d */
    private String f17256d;

    /* JADX INFO: renamed from: e */
    private String f17257e;

    /* JADX INFO: renamed from: f */
    private Bitmap f17258f;

    /* JADX INFO: renamed from: g */
    private Bitmap f17259g;

    /* JADX INFO: renamed from: h */
    private String f17260h;

    /* JADX INFO: renamed from: i */
    private String f17261i;

    /* JADX INFO: renamed from: j */
    private String f17262j;

    /* JADX INFO: renamed from: k */
    private double f17263k;

    /* JADX INFO: renamed from: l */
    private String f17264l;

    /* JADX INFO: renamed from: m */
    private int f17265m;

    /* JADX INFO: renamed from: n */
    private int f17266n;

    /* JADX INFO: renamed from: o */
    private boolean f17267o;

    /* JADX INFO: renamed from: p */
    private boolean f17268p;

    /* JADX INFO: renamed from: q */
    private boolean f17269q;

    /* JADX INFO: renamed from: s */
    private boolean f17271s;

    /* JADX INFO: renamed from: w */
    private String f17275w;

    /* JADX INFO: renamed from: x */
    private HashMap<String, Object> f17276x;

    /* JADX INFO: renamed from: r */
    private boolean f17270r = false;

    /* JADX INFO: renamed from: t */
    private int f17272t = 0;

    /* JADX INFO: renamed from: u */
    private int f17273u = 0;

    /* JADX INFO: renamed from: v */
    private boolean f17274v = true;

    /* JADX INFO: renamed from: y */
    private boolean f17277y = false;

    /* JADX INFO: renamed from: z */
    private ArrayList<String> f17278z = new ArrayList<>();

    /* JADX INFO: renamed from: A */
    private ArrayList<String> f17227A = new ArrayList<>();

    /* JADX INFO: renamed from: B */
    private ArrayList<String> f17228B = new ArrayList<>();

    /* JADX INFO: renamed from: C */
    private ArrayList<String> f17229C = new ArrayList<>();

    /* JADX INFO: renamed from: D */
    private ArrayList<String> f17230D = new ArrayList<>();

    /* JADX INFO: renamed from: I */
    private Runnable f17235I = new Runnable() { // from class: com.octopus.ad.internal.nativead.c.1
        @Override // java.lang.Runnable
        public void run() {
            Log.e("expireRunnable", "expireRunnable");
            C3124c.this.f17277y = true;
            C3124c.this.f17236J = null;
            C3124c.this.f17237K = null;
            if (C3124c.this.f17240N != null) {
                C3124c.this.f17240N.m14606d();
                C3124c.this.f17240N = null;
            }
            C3124c.this.f17241O = null;
            C3124c.this.f17238L = null;
            if (C3124c.this.f17259g != null) {
                C3124c.this.f17259g.recycle();
                C3124c.this.f17259g = null;
            }
            if (C3124c.this.f17258f != null) {
                C3124c.this.f17258f.recycle();
                C3124c.this.f17258f = null;
            }
        }
    };

    /* JADX INFO: renamed from: P */
    private String f17242P = "";

    /* JADX INFO: renamed from: Z */
    private boolean f17252Z = false;

    /* JADX INFO: renamed from: a */
    public static C3124c m14481a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ArrayList<String> stringArrayList = JsonUtil.getStringArrayList(JsonUtil.getJSONArray(jSONObject, "ImpressionTrackers"));
        C3124c c3124c = new C3124c();
        if (stringArrayList != null) {
            c3124c.f17229C = stringArrayList;
        }
        c3124c.f17254b = JsonUtil.getJSONString(jSONObject, "Headline");
        c3124c.f17255c = JsonUtil.getJSONString(jSONObject, "Body");
        c3124c.f17256d = JsonUtil.getJSONString(jSONObject, "Image");
        c3124c.f17272t = JsonUtil.getJSONInt(jSONObject, "LayoutType");
        c3124c.f17271s = JsonUtil.getJSONBoolean(jSONObject, "IsShowClose");
        JSONArray jSONArray = JsonUtil.getJSONArray(jSONObject, "Images");
        JSONArray jSONArray2 = JsonUtil.getJSONArray(jSONObject, "Videos");
        JSONArray jSONArray3 = JsonUtil.getJSONArray(jSONObject, "Texts");
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                c3124c.f17278z.add((String) jSONArray.get(i));
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                c3124c.f17227A.add((String) jSONArray2.get(i2));
            }
        }
        if (jSONArray3 != null) {
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                c3124c.f17228B.add((String) jSONArray3.get(i3));
            }
        }
        if (jSONObject.has("AppIcon")) {
            c3124c.f17253a = NativeAdResponse.EnumC3062b.APP_INSTALL;
            c3124c.f17257e = JsonUtil.getJSONString(jSONObject, "AppIcon");
            c3124c.f17262j = JsonUtil.getJSONString(jSONObject, "Action");
            c3124c.f17263k = JsonUtil.getJSONDouble(jSONObject, "Star");
            c3124c.f17264l = JsonUtil.getJSONString(jSONObject, "Store");
            c3124c.f17265m = JsonUtil.getJSONInt(jSONObject, "Price");
        } else {
            c3124c.f17253a = NativeAdResponse.EnumC3062b.CONTENT;
            c3124c.f17257e = JsonUtil.getJSONString(jSONObject, "Logo");
            c3124c.f17262j = JsonUtil.getJSONString(jSONObject, "Action");
            c3124c.f17275w = JsonUtil.getJSONString(jSONObject, "Advertiser");
        }
        ArrayList<String> stringArrayList2 = JsonUtil.getStringArrayList(JsonUtil.getJSONArray(jSONObject, "ClickTrackers"));
        if (stringArrayList2 != null) {
            c3124c.f17230D = stringArrayList2;
        }
        c3124c.f17276x = JsonUtil.getStringObjectHashMap(JsonUtil.getJSONObject(jSONObject, "Custom"));
        new Handler(Looper.getMainLooper()).postDelayed(c3124c.f17235I, 3600000L);
        return c3124c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m14486a(Context context) {
        StringBuilder sb;
        this.f17268p = true;
        ArrayList<String> arrayList = this.f17230D;
        if (arrayList != null) {
            for (String string : arrayList) {
                C3255f.m14981a("octopus", "setClickListener:" + string);
                if (string.startsWith("http://v.adintl.cn/clk")) {
                    if (this.f17270r) {
                        sb = new StringBuilder();
                        sb.append(string);
                        sb.append("&opt=1");
                    } else if (this.f17273u != 0) {
                        sb = new StringBuilder();
                        sb.append(string);
                        sb.append("&opt=");
                        sb.append(this.f17273u);
                    }
                    string = sb.toString();
                }
                new AsyncTaskC3115h(string).execute(new Void[0]);
            }
        }
        NativeAdEventListener nativeAdEventListener = this.f17238L;
        if (nativeAdEventListener != null && this.f17274v && !this.f17269q) {
            nativeAdEventListener.onAdClick();
        }
        if (!m14496a(this.f17261i, this.f17260h, context)) {
            HaoboLog.m14607d(HaoboLog.nativeLogTag, "Unable to handle click.");
        }
        this.f17230D = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m14487a(View view, NativeAdShownListener nativeAdShownListener) {
        if (this.f17277y || view == null) {
            return;
        }
        C3132r c3132r = this.f17240N;
        if (c3132r != null) {
            c3132r.m14606d();
        }
        Object tag = view.getTag(55449210);
        if (tag instanceof C3132r) {
            ((C3132r) tag).m14606d();
        }
        C3132r c3132rM14597a = C3132r.m14597a(view);
        this.f17240N = c3132rM14597a;
        view.setTag(55449210, c3132rM14597a);
        C3114g.m14411a(view, nativeAdShownListener);
        this.f17241O = new ArrayList<>();
        Iterator<String> it = this.f17229C.iterator();
        while (it.hasNext()) {
            this.f17241O.add(AsyncTaskC3118k.m14421a(this.f17242P, it.next(), this.f17240N, view.getContext(), this.f17229C));
        }
        this.f17236J = view;
        new Handler(Looper.getMainLooper()).removeCallbacks(this.f17235I);
        if (this.f17233G != null) {
            AdViewImpl.setAutoClickStrategy(view.getContext(), this.f17233G, new AdViewImpl.InterfaceC3175d() { // from class: com.octopus.ad.internal.nativead.c.2
                @Override // com.octopus.p222ad.internal.view.AdViewImpl.InterfaceC3175d
                /* JADX INFO: renamed from: a */
                public void mo14538a(int i) {
                    if (C3124c.this.f17267o || C3124c.this.f17268p || C3124c.this.f17236J == null || C3124c.this.f17233G == null) {
                        return;
                    }
                    SPUtils.putFrequency(C3124c.this.f17236J.getContext(), "frequency" + C3124c.this.f17233G.getTagId(), i);
                    if (AdViewImpl.isAoClickCallBack(C3124c.this.f17233G)) {
                        C3124c.this.f17269q = false;
                        C3124c.this.f17274v = true;
                        C3124c.this.f17273u = 0;
                    } else {
                        C3124c.this.f17269q = true;
                        C3124c.this.f17273u = 9;
                    }
                    C3124c c3124c = C3124c.this;
                    c3124c.m14486a(c3124c.f17236J.getContext());
                }
            });
            boolean zIsCallBackClick = AdViewImpl.isCallBackClick(this.f17233G);
            this.f17274v = zIsCallBackClick;
            if (zIsCallBackClick) {
                return;
            }
            this.f17273u = 8;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14488a(View view, List<View> list) {
        if (m14493a(view)) {
            if (list != null && !list.isEmpty()) {
                view.setOnClickListener(null);
                Iterator<View> it = list.iterator();
                while (it.hasNext()) {
                    it.next().setOnClickListener(this.f17239M);
                }
            }
            this.f17237K = list;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14489a(final ViewGroup viewGroup, int i) {
        final View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, (ViewGroup) null);
        final ImageView imageView = (ImageView) viewInflate.findViewById(C3063R.id.ad_image);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(C3063R.id.ad_logo);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(C3063R.id.ad_logo_text);
        ImageView imageView4 = (ImageView) viewInflate.findViewById(C3063R.id.ad_close);
        TextView textView = (TextView) viewInflate.findViewById(C3063R.id.ad_title);
        TextView textView2 = (TextView) viewInflate.findViewById(C3063R.id.ad_action);
        if (!TextUtils.isEmpty(getTitle())) {
            textView.setText(getTitle());
        }
        if (!TextUtils.isEmpty(getButtonText())) {
            textView2.setText(getButtonText());
        }
        if (!TextUtils.isEmpty(getImageUrl())) {
            ImageManager.with(null).getBitmap(getImageUrl(), new ImageManager.BitmapLoadedListener() { // from class: com.octopus.ad.internal.nativead.c.14
                @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoadFailed() {
                    C3124c.this.f17238L.onAdRenderFailed(AdRequest.ERROR_CODE_RENDER_FAIL);
                }

                @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoaded(Bitmap bitmap) {
                    imageView.setImageBitmap(bitmap);
                    viewGroup.removeAllViews();
                    viewGroup.addView(viewInflate);
                    C3124c.this.m14493a((View) viewGroup);
                    C3124c.this.m14487a(viewGroup, new NativeAdShownListener() { // from class: com.octopus.ad.internal.nativead.c.14.1
                        @Override // com.octopus.p222ad.internal.nativead.NativeAdShownListener
                        public void onAdShown() {
                            if (C3124c.this.f17238L != null) {
                                C3124c.this.f17238L.onADExposed();
                            }
                        }
                    });
                }
            });
        }
        if (!TextUtils.isEmpty(getLogoUrl())) {
            ImageManager.with(null).load(getLogoUrl()).into(imageView2);
        }
        if (!TextUtils.isEmpty(getTextLogoUrl())) {
            ImageManager.with(null).load(getTextLogoUrl()).into(imageView3);
        }
        if (!this.f17271s) {
            imageView4.setVisibility(8);
        } else {
            imageView4.setVisibility(0);
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.nativead.c.15
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C3124c.this.f17238L.onAdClose();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14492a(final ImageManager.BitmapLoadedListener bitmapLoadedListener) {
        int i;
        boolean z;
        boolean z3;
        ArrayList<String> imageUrls = getImageUrls();
        final Bitmap[] bitmapArr = new Bitmap[3];
        if (imageUrls == null || imageUrls.size() <= 0) {
            return;
        }
        final ServerResponse.AdLogoInfo textLogoInfo = getTextLogoInfo();
        if (textLogoInfo.getType() == ServerResponse.AdLogoInfo.TYPE_PIC) {
            i = 1;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        final ServerResponse.AdLogoInfo logoInfo = getLogoInfo();
        if (logoInfo.getType() == ServerResponse.AdLogoInfo.TYPE_PIC) {
            i++;
            z3 = true;
        } else {
            z3 = false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(i + 1);
        boolean z4 = z3;
        new Thread(new Runnable() { // from class: com.octopus.ad.internal.nativead.c.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    countDownLatch.await();
                    Handler handler = new Handler(Looper.getMainLooper());
                    Bitmap[] bitmapArr2 = bitmapArr;
                    if (bitmapArr2[0] == null) {
                        handler.post(new Runnable() { // from class: com.octopus.ad.internal.nativead.c.9.1
                            @Override // java.lang.Runnable
                            public void run() {
                                bitmapLoadedListener.onBitmapLoadFailed();
                            }
                        });
                        return;
                    }
                    final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapArr2[0].getWidth(), bitmapArr[0].getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setShadowLayer(5.0f, 0.0f, 0.0f, -16777216);
                    paint.setColor(-1);
                    paint.setTextSize(ViewUtil.dip2px(C3120m.m14425a().m14441g(), 8.0f));
                    canvas.drawBitmap(bitmapArr[0], 0.0f, 0.0f, paint);
                    Bitmap[] bitmapArr3 = bitmapArr;
                    if (bitmapArr3[1] != null) {
                        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapArr3[1], 85, 42, false), 10.0f, (canvas.getHeight() - r5.getHeight()) - 5, paint);
                    } else if (textLogoInfo.getType() == ServerResponse.AdLogoInfo.TYPE_TEXT && !TextUtils.isEmpty(textLogoInfo.getAdurl())) {
                        paint.getTextBounds(textLogoInfo.getAdurl(), 0, textLogoInfo.getAdurl().length(), new Rect());
                        canvas.drawText(textLogoInfo.getAdurl(), 15.0f, (canvas.getHeight() - (r5.height() / 2.0f)) - 5.0f, paint);
                    }
                    Bitmap[] bitmapArr4 = bitmapArr;
                    if (bitmapArr4[2] != null) {
                        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapArr4[2], 42, 42, false), (canvas.getWidth() - r2.getWidth()) - 10, (canvas.getHeight() - r2.getHeight()) - 10, paint);
                    } else if (logoInfo.getType() == ServerResponse.AdLogoInfo.TYPE_TEXT && !TextUtils.isEmpty(logoInfo.getAdurl())) {
                        paint.getTextBounds(logoInfo.getAdurl(), 0, logoInfo.getAdurl().length(), new Rect());
                        canvas.drawText(logoInfo.getAdurl(), (canvas.getWidth() - r5.width()) - 13, (canvas.getHeight() - (r5.height() / 2.0f)) - 5.0f, paint);
                    }
                    handler.post(new Runnable() { // from class: com.octopus.ad.internal.nativead.c.9.2
                        @Override // java.lang.Runnable
                        public void run() {
                            bitmapLoadedListener.onBitmapLoaded(bitmapCreateBitmap);
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        ImageManager.with(null).getBitmap(imageUrls.get(0), new ImageManager.BitmapLoadedListener() { // from class: com.octopus.ad.internal.nativead.c.10
            @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
            public void onBitmapLoadFailed() {
                countDownLatch.countDown();
            }

            @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
            public void onBitmapLoaded(Bitmap bitmap) {
                countDownLatch.countDown();
                bitmapArr[0] = bitmap;
            }
        });
        if (z) {
            ImageManager.with(null).getBitmap(textLogoInfo.getAdurl(), new ImageManager.BitmapLoadedListener() { // from class: com.octopus.ad.internal.nativead.c.11
                @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoadFailed() {
                    countDownLatch.countDown();
                }

                @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoaded(Bitmap bitmap) {
                    countDownLatch.countDown();
                    bitmapArr[1] = bitmap;
                }
            });
        }
        if (z4) {
            ImageManager.with(null).getBitmap(logoInfo.getAdurl(), new ImageManager.BitmapLoadedListener() { // from class: com.octopus.ad.internal.nativead.c.12
                @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoadFailed() {
                    countDownLatch.countDown();
                }

                @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
                public void onBitmapLoaded(Bitmap bitmap) {
                    countDownLatch.countDown();
                    bitmapArr[2] = bitmap;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m14493a(final View view) {
        if (this.f17277y || view == null) {
            return false;
        }
        C3132r c3132r = this.f17240N;
        if (c3132r != null) {
            c3132r.m14606d();
        }
        Object tag = view.getTag(55449210);
        if (tag instanceof C3132r) {
            ((C3132r) tag).m14606d();
        }
        C3132r c3132rM14597a = C3132r.m14597a(view);
        this.f17240N = c3132rM14597a;
        view.setTag(55449210, c3132rM14597a);
        if (this.f17240N == null) {
            return false;
        }
        this.f17241O = new ArrayList<>();
        Iterator<String> it = this.f17229C.iterator();
        while (it.hasNext()) {
            this.f17241O.add(AsyncTaskC3118k.m14421a(this.f17242P, it.next(), this.f17240N, view.getContext(), this.f17229C));
        }
        this.f17236J = view;
        final GestureDetector gestureDetector = new GestureDetector(new GestureDetector.OnGestureListener() { // from class: com.octopus.ad.internal.nativead.c.5
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                C3124c.this.f17243Q = System.currentTimeMillis();
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (C3124c.this.f17230D != null) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    for (String str : C3124c.this.f17230D) {
                        String strReplaceToTouchEventUrl = UrlUtil.replaceToTouchEventUrl(str, x + "", y + "", rawX + "", rawY + "", String.valueOf(C3124c.this.f17243Q), String.valueOf(System.currentTimeMillis()), "");
                        if (!TextUtils.isEmpty(C3124c.this.f17242P)) {
                            strReplaceToTouchEventUrl = strReplaceToTouchEventUrl.replace("__REQUESTUUID__", C3124c.this.f17242P);
                        }
                        C3255f.m14981a("octopus", "setClickListener:" + str);
                        if (C3124c.this.f17273u != 0 && strReplaceToTouchEventUrl.startsWith("http://v.adintl.cn/clk")) {
                            strReplaceToTouchEventUrl = strReplaceToTouchEventUrl + "&opt=" + C3124c.this.f17273u;
                        }
                        new AsyncTaskC3115h(StringUtil.replaceClick(view, strReplaceToTouchEventUrl)).execute(new Void[0]);
                    }
                }
                C3124c.this.f17230D = null;
                return false;
            }
        });
        m14508e();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.octopus.ad.internal.nativead.c.6
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        view.setOnClickListener(this.f17239M);
        new Handler(Looper.getMainLooper()).removeCallbacks(this.f17235I);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m14495a(String str, Context context) {
        if (str != null && !str.isEmpty()) {
            if (!this.f17252Z) {
                return m14502b(str, context);
            }
            Class clsM13811a = AdActivity.m13811a();
            try {
                WebView webView = new WebView(new MutableContextWrapper(context));
                WebviewUtil.setWebViewSettings(webView);
                webView.loadUrl(str);
                C3074a.f17016a.add(webView);
                Intent intent = new Intent(context, (Class<?>) clsM13811a);
                intent.setFlags(268435456);
                intent.putExtra("ACTIVITY_TYPE", "DOWNLOADBROWSER");
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
                HaoboLog.m14615w(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.adactivity_missing, clsM13811a.getName()));
                C3074a.f17016a.remove();
            } catch (Exception e) {
                HaoboLog.m14609e(HaoboLog.baseLogTag, "Exception initializing the redirect webview: " + e.getMessage());
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m14496a(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.f17248V) || this.f17244R != 2) {
                return m14495a(str2, context);
            }
            if (C3253d.m14975a(context, this.f17246T)) {
                C3253d.m14978b(context, this.f17246T);
                C3069b.b.a aVar = this.f17250X;
                if (aVar != null) {
                    ReportEventUtil.report(aVar.m13937a());
                }
            } else {
                File fileM14973a = C3253d.m14973a(context);
                String absolutePath = fileM14973a != null ? fileM14973a.getAbsolutePath() : "";
                C3249b.m14955a(context).m14964b(context).m14961a(this.f17249W).m14963a(this.f17270r || (i = this.f17273u) == 8 || i == 9).m14962a(new C3215a(this.f17248V, this.f17246T + AbstractC1067a.f2406g, this.f17246T, absolutePath, this.f17245S, this.f17247U, context.getPackageName() + ".fileprovider", this.f17250X)).m14965b();
            }
            return true;
        }
        try {
            if (this.f17250X != null) {
                ReportEventUtil.report(C3253d.m14975a(context, this.f17246T) ? this.f17250X.m13951h() : this.f17250X.m13953i());
            }
            Uri uri = Uri.parse(str);
            if (uri.getScheme() == null || !uri.getScheme().equals("bzopen") || TextUtils.isEmpty(uri.getHost()) || uri.getPathSegments().size() <= 0) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setFlags(268435456);
                if (context != null) {
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LAUNCHER");
                String queryParameter = uri.getQueryParameter("flags");
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        intent2.setFlags((queryParameter.startsWith("0x") || queryParameter.startsWith("0X")) ? Integer.parseInt(queryParameter.substring(2), 16) : Integer.parseInt(queryParameter));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                intent2.setComponent(new ComponentName(uri.getHost(), uri.getPathSegments().get(0)));
                String queryParameter2 = uri.getQueryParameter("rect");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String[] strArrSplit = queryParameter2.split(":");
                        if (strArrSplit.length == 4) {
                            Rect rect = new Rect();
                            rect.set(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Integer.parseInt(strArrSplit[3]));
                            intent2.setSourceBounds(rect);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (context != null) {
                    context.startActivity(intent2);
                }
            }
            m14510f();
            C3069b.b.a aVar2 = this.f17250X;
            if (aVar2 != null) {
                ReportEventUtil.report(aVar2.m13947f());
            }
            return true;
        } catch (Exception unused) {
            C3069b.b.a aVar3 = this.f17250X;
            if (aVar3 != null) {
                ReportEventUtil.report(aVar3.m13949g());
            }
            return m14495a(str2, context);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m14502b(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            HaoboLog.m14615w(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.opening_url_failed, str));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m14504c() {
        if (this.f17233G == null) {
            return;
        }
        this.f17269q = true;
        this.f17270r = true;
        m14507d();
        if (C3266g.m15037a(this.f17233G.getAcRatio())) {
            new Handler().postDelayed(new Runnable() { // from class: com.octopus.ad.internal.nativead.c.4
                @Override // java.lang.Runnable
                public void run() {
                    C3124c.this.m14486a(C3120m.m14425a().m14441g());
                }
            }, new Random().nextInt(C1486b.f7228b) + C1486b.f7228b);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m14507d() {
        Iterator<String> it = this.f17229C.iterator();
        while (it.hasNext()) {
            new AsyncTaskC3115h(it.next() + "&opt=1").executeOnExecutor(C3257h.m14988b().m14990d(), new Void[0]);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m14508e() {
        this.f17239M = new View.OnClickListener() { // from class: com.octopus.ad.internal.nativead.c.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3124c.this.m14486a(view.getContext());
            }
        };
    }

    /* JADX INFO: renamed from: f */
    private void m14510f() {
        List<C3069b.j> listM13936m;
        StringBuilder sb;
        C3069b.b bVar = this.f17251Y;
        if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
            return;
        }
        for (int i = 0; i < listM13936m.size(); i++) {
            C3069b.j jVar = listM13936m.get(i);
            if (jVar != null && !TextUtils.isEmpty(jVar.m14023c())) {
                String strM14023c = jVar.m14023c();
                if (strM14023c.startsWith("http://v.adintl.cn/deepLink")) {
                    if (this.f17270r) {
                        sb = new StringBuilder();
                        sb.append(strM14023c);
                        sb.append("&opt=1");
                    } else if (this.f17273u != 0) {
                        sb = new StringBuilder();
                        sb.append(strM14023c);
                        sb.append("&opt=");
                        sb.append(this.f17273u);
                    }
                    strM14023c = sb.toString();
                }
                new AsyncTaskC3115h(strM14023c).execute(new Void[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m14522a() {
        return this.f17266n;
    }

    /* JADX INFO: renamed from: a */
    public void m14523a(int i) {
        this.f17266n = i;
    }

    /* JADX INFO: renamed from: a */
    public void m14524a(int i, String str, String str2) {
        List<C3069b.j> listM13936m;
        C3069b.b bVar = this.f17251Y;
        if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
            return;
        }
        for (int i2 = 0; i2 < listM13936m.size(); i2++) {
            C3069b.j jVar = listM13936m.get(i2);
            if (jVar != null && !TextUtils.isEmpty(jVar.m14027e())) {
                new AsyncTaskC3115h(UrlUtil.replaceLossUrl(jVar.m14027e(), i, str, str2)).execute(new Void[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14525a(final ViewGroup viewGroup) {
        m14492a(new ImageManager.BitmapLoadedListener() { // from class: com.octopus.ad.internal.nativead.c.13
            @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
            public void onBitmapLoadFailed() {
                C3124c.this.f17238L.onAdRenderFailed(AdRequest.ERROR_CODE_RENDER_FAIL);
            }

            @Override // com.octopus.ad.internal.utilities.ImageManager.BitmapLoadedListener
            public void onBitmapLoaded(Bitmap bitmap) {
                if (viewGroup == null) {
                    C3124c.this.f17238L.onAdRenderFailed(AdRequest.ERROR_CODE_RENDER_FAIL);
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                ImageView imageView = new ImageView(viewGroup.getContext());
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageBitmap(bitmap);
                frameLayout.addView(imageView);
                if (C3124c.this.f17271s) {
                    ImageView imageView2 = new ImageView(viewGroup.getContext());
                    imageView2.setImageResource(C3063R.drawable.oct_ic_close);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, GravityCompat.END);
                    layoutParams.setMargins(0, 5, 5, 0);
                    frameLayout.addView(imageView2, layoutParams);
                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.octopus.ad.internal.nativead.c.13.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            C3124c.this.f17238L.onAdClose();
                        }
                    });
                }
                viewGroup.removeAllViews();
                viewGroup.addView(frameLayout);
                C3124c.this.m14493a((View) viewGroup);
                C3124c.this.m14487a(viewGroup, new NativeAdShownListener() { // from class: com.octopus.ad.internal.nativead.c.13.2
                    @Override // com.octopus.p222ad.internal.nativead.NativeAdShownListener
                    public void onAdShown() {
                        if (C3124c.this.f17238L != null) {
                            C3124c.this.f17238L.onADExposed();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m14526a(C3069b.b bVar) {
        this.f17251Y = bVar;
        this.f17250X = bVar.m13934k();
        this.f17244R = bVar.m13921c();
        this.f17245S = bVar.m13923d();
        this.f17246T = bVar.m13925e();
        this.f17247U = bVar.m13927f();
        this.f17248V = bVar.m13929g();
        this.f17249W = bVar.m13931h();
        if (TextUtils.isEmpty(this.f17246T)) {
            this.f17246T = "octopus";
        }
        if (TextUtils.isEmpty(this.f17245S)) {
            this.f17245S = "Octopus";
        }
        if (TextUtils.isEmpty(this.f17247U)) {
            this.f17247U = "Ad Download";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14527a(ServerResponse.AdLogoInfo adLogoInfo) {
        this.f17231E = adLogoInfo;
    }

    /* JADX INFO: renamed from: a */
    public void m14528a(ServerResponse serverResponse) {
        this.f17233G = serverResponse;
    }

    /* JADX INFO: renamed from: a */
    public void m14529a(String str) {
        this.f17242P = str;
    }

    /* JADX INFO: renamed from: a */
    public void m14530a(boolean z) {
        this.f17252Z = z;
    }

    /* JADX INFO: renamed from: b */
    public void m14531b() {
        if (this.f17233G == null) {
            return;
        }
        AdViewImpl.setDpUpStrategy(C3120m.m14425a().m14441g(), this.f17233G, new AdViewImpl.InterfaceC3175d() { // from class: com.octopus.ad.internal.nativead.c.3
            @Override // com.octopus.p222ad.internal.view.AdViewImpl.InterfaceC3175d
            /* JADX INFO: renamed from: a */
            public void mo14538a(int i) {
                if (C3124c.this.f17267o || C3124c.this.f17268p || C3124c.this.f17269q || C3124c.this.f17270r || C3124c.this.f17233G == null) {
                    return;
                }
                SPUtils.putFrequency(C3120m.m14425a().m14441g(), "liftUpfrequency" + C3124c.this.f17233G.getTagId(), i);
                C3124c.this.m14504c();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m14532b(int i) {
        List<C3069b.j> listM13936m;
        C3069b.b bVar = this.f17251Y;
        if (bVar == null || (listM13936m = bVar.m13936m()) == null) {
            return;
        }
        for (int i2 = 0; i2 < listM13936m.size(); i2++) {
            C3069b.j jVar = listM13936m.get(i2);
            if (jVar != null && !TextUtils.isEmpty(jVar.m14025d())) {
                new AsyncTaskC3115h(UrlUtil.replaceWinUrl(jVar.m14025d(), i)).execute(new Void[0]);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14533b(ServerResponse.AdLogoInfo adLogoInfo) {
        this.f17232F = adLogoInfo;
    }

    /* JADX INFO: renamed from: b */
    public void m14534b(String str) {
        this.f17260h = str;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public void bindUnifiedView(ViewGroup viewGroup, List<View> list, NativeAdEventListener nativeAdEventListener) {
        try {
            this.f17238L = nativeAdEventListener;
            if (nativeAdEventListener == null) {
                return;
            }
            if (viewGroup != null) {
                m14488a(viewGroup, list);
                m14487a(viewGroup, new NativeAdShownListener() { // from class: com.octopus.ad.internal.nativead.c.8
                    @Override // com.octopus.p222ad.internal.nativead.NativeAdShownListener
                    public void onAdShown() {
                        if (C3124c.this.f17238L != null) {
                            C3124c.this.f17238L.onADExposed();
                        }
                    }
                });
            } else {
                nativeAdEventListener.onAdRenderFailed(AdRequest.ERROR_CODE_RENDER_FAIL);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            NativeAdEventListener nativeAdEventListener2 = this.f17238L;
            if (nativeAdEventListener2 != null) {
                nativeAdEventListener2.onAdRenderFailed(AdRequest.ERROR_CODE_RENDER_FAIL);
            }
        }
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public void bindView(ViewGroup viewGroup, NativeAdEventListener nativeAdEventListener) {
        int i;
        this.f17238L = nativeAdEventListener;
        int i2 = this.f17272t;
        if (i2 == 1) {
            i = C3063R.layout.oct_native_text_above_img;
        } else if (i2 == 2) {
            i = C3063R.layout.oct_native_text_below_img;
        } else if (i2 == 3) {
            i = C3063R.layout.oct_native_text_right_img;
        } else {
            if (i2 != 4) {
                m14525a(viewGroup);
                return;
            }
            i = C3063R.layout.oct_native_text_left_img;
        }
        m14489a(viewGroup, i);
    }

    /* JADX INFO: renamed from: c */
    public void m14535c(String str) {
        this.f17261i = str;
    }

    /* JADX INFO: renamed from: d */
    public void m14536d(String str) {
        this.f17229C.add(str);
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public void destroy() {
        this.f17267o = true;
        Handler handler = new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.f17235I);
        handler.post(this.f17235I);
    }

    /* JADX INFO: renamed from: e */
    public void m14537e(String str) {
        this.f17230D.add(str);
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getAdvertiser() {
        return this.f17275w;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getButtonText() {
        return TextUtils.isEmpty(this.f17262j) ? "查看详情" : this.f17262j;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getDescription() {
        return this.f17255c;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public Bitmap getIcon() {
        return this.f17259g;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getIconUrl() {
        return this.f17257e;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public Bitmap getImage() {
        return this.f17258f;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getImageUrl() {
        return this.f17256d;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public ArrayList<String> getImageUrls() {
        return this.f17278z;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getLandingPageUrl() {
        return this.f17260h;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    @NonNull
    public Bitmap getLogo(@NonNull Context context) {
        return BitmapFactory.decodeResource(context.getResources(), C3063R.drawable.oct_logo);
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public ServerResponse.AdLogoInfo getLogoInfo() {
        return this.f17232F;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getLogoUrl() {
        ServerResponse.AdLogoInfo adLogoInfo = this.f17232F;
        if (adLogoInfo == null || adLogoInfo.getType() != ServerResponse.AdLogoInfo.TYPE_PIC) {
            return null;
        }
        return this.f17232F.getAdurl();
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public NativeAdResponse.EnumC3062b getNativeAdType() {
        return this.f17253a;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public HashMap<String, Object> getNativeElements() {
        return this.f17276x;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public List<? extends View> getNativeInfoListView() {
        return this.f17234H;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public NativeAdResponse.EnumC3061a getNetworkIdentifier() {
        return NativeAdResponse.EnumC3061a.OCTOPUS;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public int getPrice() {
        return this.f17265m;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public double getStarRating() {
        return this.f17263k;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getStore() {
        return this.f17264l;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public ArrayList<String> getTextList() {
        return this.f17228B;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    @NonNull
    public Bitmap getTextLogo(@NonNull Context context) {
        return BitmapFactory.decodeResource(context.getResources(), C3063R.drawable.oct_logo_text);
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public ServerResponse.AdLogoInfo getTextLogoInfo() {
        return this.f17231E;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getTextLogoUrl() {
        ServerResponse.AdLogoInfo adLogoInfo = this.f17231E;
        if (adLogoInfo == null || adLogoInfo.getType() != ServerResponse.AdLogoInfo.TYPE_PIC) {
            return null;
        }
        return this.f17231E.getAdurl();
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public String getTitle() {
        return this.f17254b;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public ArrayList<String> getVideoUrls() {
        return this.f17227A;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public boolean hasExpired() {
        return this.f17277y;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public void setIcon(Bitmap bitmap) {
        this.f17259g = bitmap;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public void setImage(Bitmap bitmap) {
        this.f17258f = bitmap;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public void setNativeInfoListView(List<? extends View> list) {
        this.f17234H = list;
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public void setTag(String str) {
        if ("OctopusGroup".equals(str)) {
            m14504c();
        }
    }

    @Override // com.octopus.p222ad.NativeAdResponse
    public void unregisterViews() {
        View view = this.f17236J;
        if (view != null) {
            view.setOnClickListener(null);
        }
        List<View> list = this.f17237K;
        if (list != null && !list.isEmpty()) {
            Iterator<View> it = this.f17237K.iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(null);
            }
        }
        destroy();
    }
}
