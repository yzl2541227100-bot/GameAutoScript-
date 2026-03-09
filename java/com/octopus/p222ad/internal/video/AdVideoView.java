package com.octopus.p222ad.internal.video;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.AssetFileDescriptor;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.octopus.p222ad.AdRequest;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.C3120m;
import com.octopus.p222ad.internal.InterfaceC3081b;
import com.octopus.p222ad.internal.network.ServerResponse;
import com.octopus.p222ad.internal.p225a.C3075b;
import com.octopus.p222ad.internal.p226b.C3098f;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.utilities.LoadingDialogUtil;
import com.octopus.p222ad.internal.utilities.StringUtil;
import com.octopus.p222ad.internal.utilities.UserEnvInfoUtil;
import com.octopus.p222ad.internal.utilities.ViewUtil;
import com.octopus.p222ad.internal.video.C3148a;
import com.octopus.p222ad.internal.view.AdViewImpl;
import com.octopus.p222ad.internal.view.AdWebView;
import com.octopus.p222ad.internal.view.InterfaceC3194b;
import com.octopus.p222ad.internal.view.InterstitialAdViewImpl;
import com.octopus.p222ad.p223a.C3065a;
import com.octopus.p222ad.p224b.C3072e;
import com.umeng.commonsdk.proguard.C3442bg;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AdVideoView extends TextureView implements MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, InterfaceC3194b {

    /* JADX INFO: renamed from: a */
    public MediaPlayer f17424a;

    /* JADX INFO: renamed from: b */
    public C3148a.b f17425b;

    /* JADX INFO: renamed from: c */
    private boolean f17426c;

    /* JADX INFO: renamed from: d */
    private boolean f17427d;

    /* JADX INFO: renamed from: e */
    private boolean f17428e;

    /* JADX INFO: renamed from: f */
    private boolean f17429f;

    /* JADX INFO: renamed from: g */
    private int f17430g;

    /* JADX INFO: renamed from: h */
    private int f17431h;

    /* JADX INFO: renamed from: i */
    private int f17432i;

    /* JADX INFO: renamed from: j */
    private int f17433j;

    /* JADX INFO: renamed from: k */
    private int f17434k;

    /* JADX INFO: renamed from: l */
    private int f17435l;

    /* JADX INFO: renamed from: m */
    private boolean f17436m;
    public AdWebView mAdWebView;

    /* JADX INFO: renamed from: n */
    private boolean f17437n;

    /* JADX INFO: renamed from: o */
    private C3065a f17438o;

    /* JADX INFO: renamed from: p */
    private EnumC3147a f17439p;

    /* JADX INFO: renamed from: q */
    private Pair<String, Integer> f17440q;

    /* JADX INFO: renamed from: r */
    private long f17441r;

    /* JADX INFO: renamed from: s */
    private float f17442s;

    /* JADX INFO: renamed from: t */
    private float f17443t;

    /* JADX INFO: renamed from: u */
    private boolean f17444u;

    /* JADX INFO: renamed from: v */
    private int f17445v;

    /* JADX INFO: renamed from: com.octopus.ad.internal.video.AdVideoView$1 */
    public class C31431 implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AdWebView f17446a;

        public C31431(AdWebView adWebView) {
            adWebView = adWebView;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            String str;
            AdVideoView.this.f17428e = true;
            AdVideoView.this.mAdWebView.f17644ad.handleOnCompletion();
            if (AdVideoView.this.f17427d) {
                AdVideoView.this.onRewardVideoAdReward();
                AdVideoView.this.onRewardVideoAdComplete();
            }
            if (AdVideoView.this.mAdWebView.loadAdBy(1)) {
                AdViewImpl adViewImpl = adWebView.adViewImpl;
                if (!(adViewImpl instanceof InterstitialAdViewImpl)) {
                    return;
                }
                if (((InterstitialAdViewImpl) adViewImpl).getAdImplementation() != null) {
                    ((C3075b) ((InterstitialAdViewImpl) adWebView.adViewImpl).getAdImplementation()).m14234g();
                    return;
                }
                str = "Error in incentive video ad adaptation model !";
            } else {
                str = "We can't go next, just stand here";
            }
            Log.d("octopus", str);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.video.AdVideoView$2 */
    public class C31442 implements MediaPlayer.OnInfoListener {
        public C31442() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            AdViewImpl adViewImpl;
            if (i == 3) {
                AdWebView adWebView = AdVideoView.this.mAdWebView;
                if (adWebView != null && (adViewImpl = adWebView.adViewImpl) != null && adViewImpl.getAdDispatcher() != null) {
                    if (!AdVideoView.this.f17427d) {
                        AdVideoView.this.f17427d = true;
                        if (AdVideoView.this.f17438o == null) {
                            AdVideoView adVideoView = AdVideoView.this;
                            AdViewImpl adViewImpl2 = adVideoView.mAdWebView.adViewImpl;
                            int i3 = adVideoView.f17435l;
                            int showCloseBtnTime = AdVideoView.this.mAdWebView.getShowCloseBtnTime();
                            int autoCloseTime = AdVideoView.this.mAdWebView.getAutoCloseTime();
                            AdVideoView adVideoView2 = AdVideoView.this;
                            adViewImpl2.addCloseButton(i3, showCloseBtnTime, autoCloseTime, adVideoView2, adVideoView2.mAdWebView.f17644ad.getAdType() == C3072e.a.ADP_IVIDEO);
                        }
                        AdVideoView.this.mAdWebView.adViewImpl.getAdDispatcher().mo14235a();
                        AdVideoView adVideoView3 = AdVideoView.this;
                        AdWebView adWebView2 = adVideoView3.mAdWebView;
                        adWebView2.f17644ad.handleView(adVideoView3, adWebView2.adViewImpl.getAdParameters().m14369a());
                    }
                    LoadingDialogUtil.getInstance().dismissLoadingDialog();
                    AdVideoView.this.mAdWebView.adViewImpl.getAdDispatcher().mo14245f();
                }
                if (AdVideoView.this.f17438o != null) {
                    AdVideoView.this.f17438o.m13857c();
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.video.AdVideoView$3 */
    public class C31453 implements MediaPlayer.OnPreparedListener {
        public C31453() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AdVideoView adVideoView;
            EnumC3147a enumC3147a;
            AdVideoView.this.f17435l = mediaPlayer.getDuration() / 1000;
            Log.d("octopus", "mPlayTime:" + AdVideoView.this.f17435l);
            if (AdVideoView.this.f17436m) {
                HaoboLog.m14609e(HaoboLog.baseLogTag, "Video start called!");
                AdVideoView.this.start(0);
                adVideoView = AdVideoView.this;
                enumC3147a = EnumC3147a.NRF_START;
            } else {
                adVideoView = AdVideoView.this;
                enumC3147a = EnumC3147a.NRF_PAUSE;
            }
            adVideoView.f17439p = enumC3147a;
            if (AdVideoView.this.f17435l <= 0) {
                AdVideoView.this.onRewardVideoAdFailedToLoad(AdRequest.ERROR_CODE_VIDEO_PLAY_FAIL);
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.video.AdVideoView$4 */
    public class C31464 implements MediaPlayer.OnErrorListener {
        public C31464() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            AdVideoView.this.onRewardVideoAdFailedToLoad(AdRequest.ERROR_CODE_VIDEO_PLAY_FAIL);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.video.AdVideoView$a */
    public enum EnumC3147a {
        NRF_NONE,
        NRF_START,
        NRF_PAUSE
    }

    public AdVideoView(AdWebView adWebView) {
        super(new MutableContextWrapper(adWebView.getContextFromMutableContext()));
        this.f17426c = false;
        this.f17427d = false;
        this.f17428e = false;
        this.f17429f = false;
        this.f17435l = -1;
        this.f17436m = false;
        this.f17437n = false;
        this.f17439p = EnumC3147a.NRF_NONE;
        this.f17440q = null;
        this.f17425b = C3148a.b.FIT_CENTER;
        this.f17445v = 0;
        this.mAdWebView = adWebView;
    }

    /* JADX INFO: renamed from: a */
    private static float m14617a(float f) {
        return f / C3120m.m14425a().m14449o().density;
    }

    /* JADX INFO: renamed from: a */
    private static float m14618a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return m14617a((float) Math.sqrt((f5 * f5) + (f6 * f6)));
    }

    /* JADX INFO: renamed from: a */
    private void m14621a() {
        if (this.f17424a != null) {
            reset();
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f17424a = mediaPlayer;
        mediaPlayer.setOnVideoSizeChangedListener(this);
        setSurfaceTextureListener(this);
    }

    /* JADX INFO: renamed from: a */
    private void m14622a(int i, int i2) {
        Matrix matrixM14644a;
        if (i == 0 || i2 == 0 || (matrixM14644a = new C3148a(new C3148a.c(getWidth(), getHeight()), new C3148a.c(i, i2)).m14644a(this.f17425b)) == null) {
            return;
        }
        setTransform(matrixM14644a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    private void m14623a(HashMap map) {
        C3148a.b bVar;
        if (map.isEmpty()) {
            return;
        }
        if (map.containsKey(ServerResponse.EXTRAS_KEY_SCALE)) {
            String str = (String) map.get(ServerResponse.EXTRAS_KEY_SCALE);
            str.hashCode();
            byte b = -1;
            switch (str.hashCode()) {
                case -2092301763:
                    if (str.equals("RIGHT_TOP_CROP")) {
                        b = 0;
                    }
                    break;
                case -1943089714:
                    if (str.equals("RIGHT_BOTTOM")) {
                        b = 1;
                    }
                    break;
                case -1923874824:
                    if (str.equals("RIGHT_CENTER")) {
                        b = 2;
                    }
                    break;
                case -1792626435:
                    if (str.equals("LEFT_TOP")) {
                        b = 3;
                    }
                    break;
                case -1629510025:
                    if (str.equals("RIGHT_CENTER_CROP")) {
                        b = 4;
                    }
                    break;
                case -1130639214:
                    if (str.equals("LEFT_TOP_CROP")) {
                        b = 5;
                    }
                    break;
                case -1092027392:
                    if (str.equals("END_INSIDE")) {
                        b = 6;
                    }
                    break;
                case -1025888925:
                    if (str.equals("LEFT_BOTTOM")) {
                        b = 7;
                    }
                    break;
                case -1006674035:
                    if (str.equals("LEFT_CENTER")) {
                        b = 8;
                    }
                    break;
                case -440887238:
                    if (str.equals("CENTER_CROP")) {
                        b = 9;
                    }
                    break;
                case -438941894:
                    if (str.equals("CENTER_BOTTOM_CROP")) {
                        b = 10;
                    }
                    break;
                case -188276732:
                    if (str.equals("CENTER_TOP_CROP")) {
                        b = 11;
                    }
                    break;
                case -172377086:
                    if (str.equals("LEFT_CENTER_CROP")) {
                        b = 12;
                    }
                    break;
                case -128849043:
                    if (str.equals("FIT_END")) {
                        b = C3442bg.f18781k;
                    }
                    break;
                case 378209945:
                    if (str.equals("START_INSIDE")) {
                        b = C3442bg.f18782l;
                    }
                    break;
                case 384437857:
                    if (str.equals("RIGHT_BOTTOM_CROP")) {
                        b = C3442bg.f18783m;
                    }
                    break;
                case 743229044:
                    if (str.equals("FIT_START")) {
                        b = C3442bg.f18784n;
                    }
                    break;
                case 1093733475:
                    if (str.equals("FIT_CENTER")) {
                        b = 17;
                    }
                    break;
                case 1218764914:
                    if (str.equals("RIGHT_TOP")) {
                        b = 18;
                    }
                    break;
                case 1477882197:
                    if (str.equals("CENTER_BOTTOM")) {
                        b = 19;
                    }
                    break;
                case 1648362059:
                    if (str.equals("CENTER_TOP")) {
                        b = 20;
                    }
                    break;
                case 1677322022:
                    if (str.equals("CENTER_INSIDE")) {
                        b = 21;
                    }
                    break;
                case 1841570796:
                    if (str.equals("LEFT_BOTTOM_CROP")) {
                        b = 22;
                    }
                    break;
                case 1984282709:
                    if (str.equals("CENTER")) {
                        b = 23;
                    }
                    break;
                case 2074054159:
                    if (str.equals("FIT_XY")) {
                        b = 24;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bVar = C3148a.b.RIGHT_TOP_CROP;
                    break;
                case 1:
                    bVar = C3148a.b.RIGHT_BOTTOM;
                    break;
                case 2:
                    bVar = C3148a.b.RIGHT_CENTER;
                    break;
                case 3:
                    bVar = C3148a.b.LEFT_TOP;
                    break;
                case 4:
                    bVar = C3148a.b.RIGHT_CENTER_CROP;
                    break;
                case 5:
                    bVar = C3148a.b.LEFT_TOP_CROP;
                    break;
                case 6:
                    bVar = C3148a.b.END_INSIDE;
                    break;
                case 7:
                    bVar = C3148a.b.LEFT_BOTTOM;
                    break;
                case 8:
                    bVar = C3148a.b.LEFT_CENTER;
                    break;
                case 9:
                    bVar = C3148a.b.CENTER_CROP;
                    break;
                case 10:
                    bVar = C3148a.b.CENTER_BOTTOM_CROP;
                    break;
                case 11:
                    bVar = C3148a.b.CENTER_TOP_CROP;
                    break;
                case 12:
                    bVar = C3148a.b.LEFT_CENTER_CROP;
                    break;
                case 13:
                    bVar = C3148a.b.FIT_END;
                    break;
                case 14:
                    bVar = C3148a.b.START_INSIDE;
                    break;
                case 15:
                    bVar = C3148a.b.RIGHT_BOTTOM_CROP;
                    break;
                case 16:
                    bVar = C3148a.b.FIT_START;
                    break;
                case 17:
                default:
                    bVar = C3148a.b.FIT_CENTER;
                    break;
                case 18:
                    bVar = C3148a.b.RIGHT_TOP;
                    break;
                case 19:
                    bVar = C3148a.b.CENTER_BOTTOM;
                    break;
                case 20:
                    bVar = C3148a.b.CENTER_TOP;
                    break;
                case 21:
                    bVar = C3148a.b.CENTER_INSIDE;
                    break;
                case 22:
                    bVar = C3148a.b.LEFT_BOTTOM_CROP;
                    break;
                case 23:
                    bVar = C3148a.b.CENTER;
                    break;
                case 24:
                    bVar = C3148a.b.FIT_XY;
                    break;
            }
            this.f17425b = bVar;
        }
        if (map.containsKey(ServerResponse.EXTRAS_KEY_REWARD_ITEM)) {
            String str2 = (String) map.get(ServerResponse.EXTRAS_KEY_REWARD_ITEM);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String strOptString = jSONObject.optString("type");
                this.f17440q = !TextUtils.isEmpty(strOptString) ? Pair.create(strOptString, Integer.valueOf(jSONObject.optInt("amount"))) : Pair.create("coin", 10);
            } catch (JSONException unused) {
                HaoboLog.m14609e(HaoboLog.jsonLogTag, "Error parse reward item: " + str2);
                this.f17440q = Pair.create("coin", 10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m14627b(int i, int i2) {
        boolean z;
        if (i == 0 && i2 == 0) {
            onResume();
            z = true;
        } else {
            onPause();
            z = false;
        }
        this.f17436m = z;
    }

    private void setDataSource(@NonNull AssetFileDescriptor assetFileDescriptor) throws IOException {
        setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        assetFileDescriptor.close();
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public void destroy() {
        stop();
        ViewUtil.removeChildFromParent(this);
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public boolean failed() {
        return this.f17426c;
    }

    public void finishActivity() {
        AdViewImpl adViewImpl;
        AdWebView adWebView = this.mAdWebView;
        if (adWebView == null || (adViewImpl = adWebView.adViewImpl) == null) {
            return;
        }
        adViewImpl.getAdDispatcher().mo14241b();
        AdWebView adWebView2 = this.mAdWebView;
        Activity activity = adWebView2.adViewImpl.getActivity(adWebView2);
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public AdWebView getAdWebView() {
        return this.mAdWebView;
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public int getCreativeHeight() {
        return this.f17433j;
    }

    public int getCreativeLeft() {
        return this.f17430g;
    }

    public int getCreativeTop() {
        return this.f17431h;
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public int getCreativeWidth() {
        return this.f17432i;
    }

    public int getCurrentPosition() {
        return this.f17424a.getCurrentPosition();
    }

    public int getDuration() {
        return this.f17424a.getDuration();
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public int getRefreshInterval() {
        return this.f17434k;
    }

    public int getVideoHeight() {
        return this.f17424a.getVideoHeight();
    }

    public int getVideoWidth() {
        return this.f17424a.getVideoWidth();
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public View getView() {
        return this;
    }

    public boolean isLooping() {
        return this.f17424a.isLooping();
    }

    public boolean isPlaying() {
        return this.f17424a.isPlaying();
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public void onDestroy() {
        destroy();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f17424a == null) {
            return;
        }
        if (isPlaying()) {
            stop();
        }
        release();
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public void onPause() {
        if (this.f17428e || this.f17439p != EnumC3147a.NRF_START) {
            return;
        }
        pause();
        C3065a c3065a = this.f17438o;
        if (c3065a != null) {
            c3065a.m13856b();
        }
        this.f17439p = EnumC3147a.NRF_PAUSE;
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public void onResume() {
        if (this.f17428e || this.f17439p != EnumC3147a.NRF_PAUSE) {
            return;
        }
        start(1);
        C3065a c3065a = this.f17438o;
        if (c3065a != null) {
            c3065a.m13857c();
        }
        this.f17439p = EnumC3147a.NRF_START;
    }

    public void onRewardVideoAdComplete() {
        AdViewImpl adViewImpl = this.mAdWebView.adViewImpl;
        if (adViewImpl == null || adViewImpl.getRewaredVideoAdListener() == null) {
            return;
        }
        this.mAdWebView.adViewImpl.getRewaredVideoAdListener().onRewardVideoAdComplete();
    }

    public void onRewardVideoAdFailedToLoad(int i) {
        AdViewImpl adViewImpl = this.mAdWebView.adViewImpl;
        if (adViewImpl != null && adViewImpl.getRewaredVideoAdListener() != null) {
            this.mAdWebView.adViewImpl.getRewaredVideoAdListener().onRewardVideoAdFailedToLoad(i);
        }
        finishActivity();
    }

    public void onRewardVideoAdReward() {
        if (this.f17429f || this.f17440q == null) {
            return;
        }
        this.f17429f = true;
        InterfaceC3081b adDispatcher = this.mAdWebView.adViewImpl.getAdDispatcher();
        Pair<String, Integer> pair = this.f17440q;
        adDispatcher.mo14239a((String) pair.first, ((Integer) pair.second).intValue());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        MediaPlayer mediaPlayer = this.f17424a;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        AdWebView adWebView;
        AdViewImpl adViewImpl;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis - this.f17441r;
                Log.d("octopus", "ACTION_UP:" + j);
                if (j < 1000 && this.f17444u && (adWebView = this.mAdWebView) != null && (adViewImpl = adWebView.adViewImpl) != null && adViewImpl.getAdDispatcher() != null) {
                    AdViewImpl adViewImpl2 = this.mAdWebView.adViewImpl;
                    adViewImpl2.clickCount++;
                    adViewImpl2.getAdDispatcher().mo14243d();
                    AdWebView adWebView2 = this.mAdWebView;
                    AdViewImpl adViewImpl3 = adWebView2.adViewImpl;
                    boolean z3 = adViewImpl3.clickCount > adViewImpl3.loadCount;
                    adWebView2.f17644ad.setOpenInNativeBrowser(adViewImpl3.getOpensNativeBrowser());
                    this.mAdWebView.f17644ad.handleClick(this, motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "", String.valueOf(this.f17441r), String.valueOf(jCurrentTimeMillis), z3, this.mAdWebView.adViewImpl.getAdParameters().m14369a(), this.f17445v);
                }
            } else if (action == 2 && this.f17444u && m14618a(this.f17442s, this.f17443t, motionEvent.getX(), motionEvent.getY()) > 15.0f) {
                this.f17444u = false;
            }
            z = false;
        } else {
            this.f17441r = System.currentTimeMillis();
            this.f17442s = motionEvent.getX();
            this.f17443t = motionEvent.getY();
            this.f17444u = true;
            Log.d("octopus", "ACTION_DOWN");
            z = true;
        }
        return super.onTouchEvent(motionEvent) || z;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m14627b(getWindowVisibility(), i);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m14627b(i, getVisibility());
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.f17424a;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            this.mAdWebView.f17644ad.handleOnPause(this);
        }
    }

    public void prepare() throws IllegalStateException, IOException {
        prepare(null);
    }

    public void prepare(@Nullable MediaPlayer.OnPreparedListener onPreparedListener) throws IllegalStateException, IOException {
        this.f17424a.setOnPreparedListener(onPreparedListener);
        this.f17424a.prepare();
    }

    public void prepareAsync() throws IllegalStateException {
        prepareAsync(null);
    }

    public void prepareAsync(@Nullable MediaPlayer.OnPreparedListener onPreparedListener) throws IllegalStateException {
        this.f17424a.setOnPreparedListener(onPreparedListener);
        this.f17424a.prepareAsync();
    }

    public void release() {
        reset();
        this.f17424a.release();
        this.f17424a = null;
    }

    public void reset() {
        this.f17424a.reset();
    }

    public void seekTo(int i) {
        MediaPlayer mediaPlayer = this.f17424a;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i);
        }
    }

    public void setAssetData(@NonNull String str) throws IOException {
        setDataSource(getContext().getAssets().openFd(str));
    }

    public void setCountDownTimer(C3065a c3065a) {
        this.f17438o = c3065a;
    }

    public void setCreativeLeft(int i) {
        this.f17430g = i;
    }

    public void setCreativeTop(int i) {
        this.f17431h = i;
    }

    public void setDataSource(@NonNull Context context, @NonNull Uri uri) throws IOException {
        m14621a();
        this.f17424a.setDataSource(context, uri);
    }

    public void setDataSource(@NonNull Context context, @NonNull Uri uri, @Nullable Map<String, String> map) throws IOException {
        m14621a();
        this.f17424a.setDataSource(context, uri, map);
    }

    public void setDataSource(@NonNull FileDescriptor fileDescriptor) throws IOException {
        m14621a();
        this.f17424a.setDataSource(fileDescriptor);
    }

    public void setDataSource(@NonNull FileDescriptor fileDescriptor, long j, long j2) throws IOException {
        m14621a();
        this.f17424a.setDataSource(fileDescriptor, j, j2);
    }

    public void setDataSource(@NonNull String str) throws IOException {
        m14621a();
        this.f17424a.setDataSource(str);
    }

    public void setHasFail() {
        this.f17426c = true;
    }

    public void setLooping(boolean z) {
        MediaPlayer mediaPlayer = this.f17424a;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setOnCompletionListener(@Nullable MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f17424a.setOnCompletionListener(onCompletionListener);
    }

    public void setOnErrorListener(@Nullable MediaPlayer.OnErrorListener onErrorListener) {
        this.f17424a.setOnErrorListener(onErrorListener);
    }

    public void setOnInfoListener(@Nullable MediaPlayer.OnInfoListener onInfoListener) {
        this.f17424a.setOnInfoListener(onInfoListener);
    }

    public void setOpt(int i) {
        this.f17445v = i;
    }

    public void setRawData(@RawRes int i) throws IOException {
        setDataSource(getResources().openRawResourceFd(i));
    }

    public void setRefreshInterval(int i) {
        this.f17434k = i;
    }

    public void setScalableType(C3148a.b bVar) {
        this.f17425b = bVar;
        m14622a(getVideoWidth(), getVideoHeight());
    }

    public void setVolume(float f, float f2) {
        MediaPlayer mediaPlayer = this.f17424a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f2);
        }
    }

    public void start(int i) {
        MediaPlayer mediaPlayer = this.f17424a;
        if (mediaPlayer != null) {
            mediaPlayer.start();
            this.mAdWebView.f17644ad.handleOnStart(this, i);
        }
    }

    public void stop() {
        MediaPlayer mediaPlayer = this.f17424a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public boolean toggleMute() {
        boolean z = !this.f17437n;
        this.f17437n = z;
        float f = z ? 0.0f : 1.0f;
        setVolume(f, f);
        return this.f17437n;
    }

    public void transferAd(AdWebView adWebView, String str) {
        int creativeWidth;
        if (StringUtil.isEmpty(str)) {
            return;
        }
        this.f17433j = adWebView.getCreativeHeight();
        this.f17432i = adWebView.getCreativeWidth();
        this.f17431h = adWebView.getCreativeTop();
        this.f17430g = adWebView.getCreativeLeft();
        this.f17434k = adWebView.getRefreshInterval();
        try {
            new URI(str);
            this.f17425b = C3148a.b.FIT_CENTER;
            HaoboLog.m14613v(HaoboLog.videoLogTag, HaoboLog.getString(C3063R.string.videoview_loading, str));
            m14623a(adWebView.getAdExtras());
            try {
                C3098f c3098fM14433b = C3120m.m14425a().m14433b();
                if (!UserEnvInfoUtil.isUsingWifi(C3120m.m14425a().m14441g()) && this.mAdWebView.IsVideoWifiOnly() && !c3098fM14433b.m14304b(str)) {
                    HaoboLog.m14609e(HaoboLog.videoLogTag, HaoboLog.getString(C3063R.string.wifi_video_load, str));
                    setHasFail();
                    return;
                }
                setDataSource(c3098fM14433b.m14302a(str));
                boolean zIsMuted = adWebView.isMuted();
                this.f17437n = zIsMuted;
                float f = zIsMuted ? 0.0f : 1.0f;
                setVolume(f, f);
                float fM14446l = C3120m.m14425a().m14446l();
                float fM14447m = C3120m.m14425a().m14447m();
                int creativeHeight = -1;
                if (getCreativeWidth() == 1 && getCreativeHeight() == 1) {
                    creativeWidth = -1;
                } else {
                    creativeHeight = (int) ((getCreativeHeight() * fM14447m) + 0.5f);
                    creativeWidth = (int) ((getCreativeWidth() * fM14446l) + 0.5f);
                }
                if (getCreativeLeft() == 0 && getCreativeTop() == 0) {
                    setLayoutParams(new FrameLayout.LayoutParams(creativeWidth, creativeHeight, 17));
                } else {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(creativeWidth, creativeHeight, 8388659);
                    layoutParams.setMargins((int) ((getCreativeLeft() * fM14446l) + 0.5f), (int) ((getCreativeTop() * fM14447m) + 0.5f), 0, 0);
                    setLayoutParams(layoutParams);
                    setScalableType(C3148a.b.FIT_START);
                }
                setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.octopus.ad.internal.video.AdVideoView.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ AdWebView f17446a;

                    public C31431(AdWebView adWebView2) {
                        adWebView = adWebView2;
                    }

                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        String str2;
                        AdVideoView.this.f17428e = true;
                        AdVideoView.this.mAdWebView.f17644ad.handleOnCompletion();
                        if (AdVideoView.this.f17427d) {
                            AdVideoView.this.onRewardVideoAdReward();
                            AdVideoView.this.onRewardVideoAdComplete();
                        }
                        if (AdVideoView.this.mAdWebView.loadAdBy(1)) {
                            AdViewImpl adViewImpl = adWebView.adViewImpl;
                            if (!(adViewImpl instanceof InterstitialAdViewImpl)) {
                                return;
                            }
                            if (((InterstitialAdViewImpl) adViewImpl).getAdImplementation() != null) {
                                ((C3075b) ((InterstitialAdViewImpl) adWebView.adViewImpl).getAdImplementation()).m14234g();
                                return;
                            }
                            str2 = "Error in incentive video ad adaptation model !";
                        } else {
                            str2 = "We can't go next, just stand here";
                        }
                        Log.d("octopus", str2);
                    }
                });
                setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.octopus.ad.internal.video.AdVideoView.2
                    public C31442() {
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // android.media.MediaPlayer.OnInfoListener
                    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                        AdViewImpl adViewImpl;
                        if (i == 3) {
                            AdWebView adWebView2 = AdVideoView.this.mAdWebView;
                            if (adWebView2 != null && (adViewImpl = adWebView2.adViewImpl) != null && adViewImpl.getAdDispatcher() != null) {
                                if (!AdVideoView.this.f17427d) {
                                    AdVideoView.this.f17427d = true;
                                    if (AdVideoView.this.f17438o == null) {
                                        AdVideoView adVideoView = AdVideoView.this;
                                        AdViewImpl adViewImpl2 = adVideoView.mAdWebView.adViewImpl;
                                        int i3 = adVideoView.f17435l;
                                        int showCloseBtnTime = AdVideoView.this.mAdWebView.getShowCloseBtnTime();
                                        int autoCloseTime = AdVideoView.this.mAdWebView.getAutoCloseTime();
                                        AdVideoView adVideoView2 = AdVideoView.this;
                                        adViewImpl2.addCloseButton(i3, showCloseBtnTime, autoCloseTime, adVideoView2, adVideoView2.mAdWebView.f17644ad.getAdType() == C3072e.a.ADP_IVIDEO);
                                    }
                                    AdVideoView.this.mAdWebView.adViewImpl.getAdDispatcher().mo14235a();
                                    AdVideoView adVideoView3 = AdVideoView.this;
                                    AdWebView adWebView22 = adVideoView3.mAdWebView;
                                    adWebView22.f17644ad.handleView(adVideoView3, adWebView22.adViewImpl.getAdParameters().m14369a());
                                }
                                LoadingDialogUtil.getInstance().dismissLoadingDialog();
                                AdVideoView.this.mAdWebView.adViewImpl.getAdDispatcher().mo14245f();
                            }
                            if (AdVideoView.this.f17438o != null) {
                                AdVideoView.this.f17438o.m13857c();
                            }
                        }
                        return false;
                    }
                });
                prepareAsync(new MediaPlayer.OnPreparedListener() { // from class: com.octopus.ad.internal.video.AdVideoView.3
                    public C31453() {
                    }

                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        AdVideoView adVideoView;
                        EnumC3147a enumC3147a;
                        AdVideoView.this.f17435l = mediaPlayer.getDuration() / 1000;
                        Log.d("octopus", "mPlayTime:" + AdVideoView.this.f17435l);
                        if (AdVideoView.this.f17436m) {
                            HaoboLog.m14609e(HaoboLog.baseLogTag, "Video start called!");
                            AdVideoView.this.start(0);
                            adVideoView = AdVideoView.this;
                            enumC3147a = EnumC3147a.NRF_START;
                        } else {
                            adVideoView = AdVideoView.this;
                            enumC3147a = EnumC3147a.NRF_PAUSE;
                        }
                        adVideoView.f17439p = enumC3147a;
                        if (AdVideoView.this.f17435l <= 0) {
                            AdVideoView.this.onRewardVideoAdFailedToLoad(AdRequest.ERROR_CODE_VIDEO_PLAY_FAIL);
                        }
                    }
                });
                setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.octopus.ad.internal.video.AdVideoView.4
                    public C31464() {
                    }

                    @Override // android.media.MediaPlayer.OnErrorListener
                    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        AdVideoView.this.onRewardVideoAdFailedToLoad(AdRequest.ERROR_CODE_VIDEO_PLAY_FAIL);
                        return false;
                    }
                });
            } catch (IOException | NullPointerException e) {
                HaoboLog.m14609e(HaoboLog.videoLogTag, HaoboLog.getString(C3063R.string.failed_video_load, str, e.getMessage()));
                setHasFail();
            }
        } catch (NullPointerException | URISyntaxException unused) {
            HaoboLog.m14609e(HaoboLog.videoLogTag, HaoboLog.getString(C3063R.string.invalid_video_url, str));
            setHasFail();
        }
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3194b
    public void visible() {
        this.mAdWebView.setVisibility(0);
        this.mAdWebView.adViewImpl.showAdLogo(this);
        AdWebView adWebView = this.mAdWebView;
        if (adWebView == null || !adWebView.shouldDisplayButton()) {
            return;
        }
        AdWebView adWebView2 = this.mAdWebView;
        if (adWebView2.adViewImpl != null) {
            int autoCloseTime = adWebView2.getAutoCloseTime();
            int i = this.f17435l;
            if (autoCloseTime > i) {
                AdWebView adWebView3 = this.mAdWebView;
                adWebView3.adViewImpl.addCloseButton(i, adWebView3.getShowCloseBtnTime(), this.f17435l, this, this.mAdWebView.f17644ad.getAdType() == C3072e.a.ADP_IVIDEO);
            } else {
                AdWebView adWebView4 = this.mAdWebView;
                adWebView4.adViewImpl.addCloseButton(i, adWebView4.getShowCloseBtnTime(), this.mAdWebView.getAutoCloseTime(), this, this.mAdWebView.f17644ad.getAdType() == C3072e.a.ADP_IVIDEO);
                this.mAdWebView.adViewImpl.addMuteButton(this, this.f17437n);
            }
        }
        AdViewImpl adViewImpl = this.mAdWebView.adViewImpl;
        if (adViewImpl != null && adViewImpl.getAdDispatcher() != null && !this.mAdWebView.adViewImpl.isRewardVideo()) {
            this.mAdWebView.adViewImpl.getAdDispatcher().mo14235a();
            AdWebView adWebView5 = this.mAdWebView;
            adWebView5.f17644ad.handleView(this, adWebView5.adViewImpl.getAdParameters().m14369a());
        }
        AdWebView adWebView6 = this.mAdWebView;
        AdViewImpl adViewImpl2 = adWebView6.adViewImpl;
        if (adViewImpl2 != null) {
            adViewImpl2.setAdWebView(adWebView6);
        }
    }
}
