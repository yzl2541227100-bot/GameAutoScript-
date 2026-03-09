package cn.haorui.sdk.platform.p003hr.recycler;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import cn.haorui.sdk.C0384R;
import cn.haorui.sdk.activity.HRDownloadDetailActivity;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdData;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.HttpResponse;
import cn.haorui.sdk.core.domain.LayoutBean;
import cn.haorui.sdk.core.exception.C0493a;
import cn.haorui.sdk.core.loader.C0511g;
import cn.haorui.sdk.core.p002ad.BaseAdSlot;
import cn.haorui.sdk.core.p002ad.prerender.PreRenderAdLoader;
import cn.haorui.sdk.core.p002ad.recycler.ExpressMediaListener;
import cn.haorui.sdk.core.p002ad.recycler.IAdExposureListener;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdListener;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener;
import cn.haorui.sdk.core.p002ad.recycler.RecylcerAdInteractionListener;
import cn.haorui.sdk.core.utils.AderUtil;
import cn.haorui.sdk.core.utils.ClickHandler;
import cn.haorui.sdk.core.utils.DimensionUtils;
import cn.haorui.sdk.core.utils.DownloadDialogBean;
import cn.haorui.sdk.core.utils.HRConstants;
import cn.haorui.sdk.core.utils.HttpGetBytesCallback;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.MemoryUtil;
import cn.haorui.sdk.core.utils.ResultBean;
import cn.haorui.sdk.core.view.RoundImageView;
import cn.haorui.sdk.core.view.TouchAdContainer;
import cn.haorui.sdk.core.view.gif.GifImageView;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p285z2.o000;
import p285z2.o000O;
import p285z2.o000OO00;

/* JADX INFO: loaded from: classes.dex */
public class HRPreRenderAdapter implements RecyclerAdData {
    private static final String TAG = "HRPreRenderAdapter";
    private RelativeLayout adView;
    private HRHRAdNativeWrapper adWrapper;
    private int containerWidth;
    private ExpressMediaListener expressMediaListener;
    private IAdExposureListener iAdExposureListener;
    private OnImgloadSuccessListener imgLoadListener;
    private RecylcerAdInteractionListener interactionListener;
    private boolean isAdExposure;
    private boolean isImageLoad = false;
    private boolean isUpDownStyle;
    private NativeAdData nativeAdData;
    private int shakeId;

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$1 */
    public class ViewTreeObserverOnPreDrawListenerC06241 implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ ViewGroup val$container;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ Rect val$mClipRect;
        public final /* synthetic */ RecylcerAdInteractionListener val$recylcerAdInteractionListener;

        /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$1$1 */
        public class AnonymousClass1 implements C0511g.d {
            public AnonymousClass1() {
            }

            @Override // cn.haorui.sdk.core.loader.C0511g.d
            public void onShake() {
                RecylcerAdInteractionListener recylcerAdInteractionListener;
                C0511g.c.f151a.m44a(HRPreRenderAdapter.this.shakeId);
                if (HRPreRenderAdapter.this.nativeAdData.getAdSlot().getCbc() == 0 && (recylcerAdInteractionListener = recylcerAdInteractionListener) != null) {
                    recylcerAdInteractionListener.onAdClicked();
                }
                ClickHandler.handleClick(HRPreRenderAdapter.this.nativeAdData);
            }
        }

        public ViewTreeObserverOnPreDrawListenerC06241(ViewGroup viewGroup, Rect rect, Context context, RecylcerAdInteractionListener recylcerAdInteractionListener) {
            viewGroup = viewGroup;
            rect = rect;
            context = context;
            recylcerAdInteractionListener = recylcerAdInteractionListener;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!viewGroup.getGlobalVisibleRect(rect)) {
                return true;
            }
            if (((long) rect.height()) * ((long) rect.width()) >= ((long) viewGroup.getHeight()) * ((long) viewGroup.getWidth()) * 0.3d && !HRPreRenderAdapter.this.isAdExposure) {
                HRPreRenderAdapter.this.isAdExposure = true;
                if (HRPreRenderAdapter.this.adWrapper.getHRAdListenerAdapter() != null && HRPreRenderAdapter.this.nativeAdData.getAdPatternType() != 2) {
                    HRPreRenderAdapter.this.adWrapper.getHRAdListenerAdapter().onADExposure();
                }
                if (HRPreRenderAdapter.this.shakeId == 0) {
                    HRPreRenderAdapter.this.shakeId = C0511g.c.f151a.m49b();
                }
                if ((HRPreRenderAdapter.this.nativeAdData.getAdSlot().getAct_type() & 4) == 4 || (HRPreRenderAdapter.this.nativeAdData.getAdSlot().getAct_type() & 8) == 8) {
                    int i = (HRPreRenderAdapter.this.nativeAdData.getAdSlot().getAct_type() & 8) == 8 ? 2 : 1;
                    C0511g.c.f151a.m47a(HRPreRenderAdapter.this.nativeAdData.getAdSlot().getPosId(), HRPreRenderAdapter.this.nativeAdData.getAdSlot().getLoadedTime(), HRPreRenderAdapter.this.nativeAdData.getAdSlot().getDclk());
                    C0511g.c.f151a.m45a(HRPreRenderAdapter.this.nativeAdData.getAdSlot().getPower_index(), i, HRPreRenderAdapter.this.nativeAdData.getAdSlot().getPower_delay(), HRPreRenderAdapter.this.nativeAdData.getAdSlot().getPower_count(), HRPreRenderAdapter.this.shakeId, HRPreRenderAdapter.this.nativeAdData.getAdSlot().getEcpm(), new C0511g.d() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.1.1
                        public AnonymousClass1() {
                        }

                        @Override // cn.haorui.sdk.core.loader.C0511g.d
                        public void onShake() {
                            RecylcerAdInteractionListener recylcerAdInteractionListener;
                            C0511g.c.f151a.m44a(HRPreRenderAdapter.this.shakeId);
                            if (HRPreRenderAdapter.this.nativeAdData.getAdSlot().getCbc() == 0 && (recylcerAdInteractionListener = recylcerAdInteractionListener) != null) {
                                recylcerAdInteractionListener.onAdClicked();
                            }
                            ClickHandler.handleClick(HRPreRenderAdapter.this.nativeAdData);
                        }
                    });
                    C0511g.c.f151a.m48a(true);
                }
                viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$10 */
    public class C062510 extends o000OO00 {
        public C062510() {
        }

        @Override // p285z2.o000OO00
        public void callback(String str, ImageView imageView, Bitmap bitmap, o000O o000o) {
            if (200 > o000o.OooOO0o() || 300 <= o000o.OooOO0o() || bitmap.isRecycled() || 5 > bitmap.getWidth() || 5 > bitmap.getHeight()) {
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$11 */
    public class RunnableC062611 implements Runnable {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ GifImageView val$shakeImage;
        public final /* synthetic */ RelativeLayout val$startShakeRoot;

        /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$11$1 */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                gifImageView.clear();
                relativeLayout.setVisibility(8);
            }
        }

        public RunnableC062611(Context context, RelativeLayout relativeLayout, GifImageView gifImageView) {
            context = context;
            relativeLayout = relativeLayout;
            gifImageView = gifImageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int measuredHeight = HRPreRenderAdapter.this.adView.getMeasuredHeight();
            if (measuredHeight < displayMetrics.density * 120.0f) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.height = Math.max(measuredHeight - 70, (int) (displayMetrics.density * 70.0f));
                layoutParams.width = -2;
                relativeLayout.setLayoutParams(layoutParams);
            }
            relativeLayout.setVisibility(0);
            byte[] imageBytes = HRPreRenderAdapter.this.getImageBytes(context, C0384R.raw.adsail_new_shake);
            if (imageBytes != null && imageBytes.length > 0) {
                gifImageView.setBytes(imageBytes, 1);
                gifImageView.startAnimation();
            }
            relativeLayout.postDelayed(new Runnable() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.11.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    gifImageView.clear();
                    relativeLayout.setVisibility(8);
                }
            }, C1659a.f9130f);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$2 */
    public class C06272 implements TouchAdContainer.OnWindownEventListener {
        public C06272() {
        }

        @Override // cn.haorui.sdk.core.view.TouchAdContainer.OnWindownEventListener
        public void onAttachedToWindow() {
        }

        @Override // cn.haorui.sdk.core.view.TouchAdContainer.OnWindownEventListener
        public void onDetachedFromWindow() {
            C0511g.c.f151a.m44a(HRPreRenderAdapter.this.shakeId);
        }

        @Override // cn.haorui.sdk.core.view.TouchAdContainer.OnWindownEventListener
        public void onWindowFocusChanged(boolean z) {
            C0511g c0511g;
            int i;
            boolean z3;
            if (z) {
                c0511g = C0511g.c.f151a;
                i = HRPreRenderAdapter.this.shakeId;
                z3 = true;
            } else {
                c0511g = C0511g.c.f151a;
                i = HRPreRenderAdapter.this.shakeId;
                z3 = false;
            }
            c0511g.m46a(i, z3);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$3 */
    public class C06283 implements RecylcerAdInteractionListener {
        public C06283() {
        }

        @Override // cn.haorui.sdk.core.loader.InteractionListener
        public void onAdClicked() {
            if (HRPreRenderAdapter.this.nativeAdData.getAdSlot().getCbc() != 0 || HRPreRenderAdapter.this.interactionListener == null) {
                return;
            }
            HRPreRenderAdapter.this.interactionListener.onAdClicked();
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecylcerAdInteractionListener
        public void onAdClosed() {
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecylcerAdInteractionListener
        public void onAdRenderFailed() {
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$4 */
    public class ViewOnClickListenerC06294 implements View.OnClickListener {
        public final /* synthetic */ View val$adRoot;
        public final /* synthetic */ BaseAdSlot val$adSlot;

        public ViewOnClickListenerC06294(BaseAdSlot baseAdSlot, View view) {
            baseAdSlot = baseAdSlot;
            view = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                DownloadDialogBean downloadDialogBean = new DownloadDialogBean();
                downloadDialogBean.setApp_name(baseAdSlot.getAppName());
                downloadDialogBean.setApp_feature(baseAdSlot.getApp_feature());
                downloadDialogBean.setApp_intro(baseAdSlot.getApp_intro());
                downloadDialogBean.setApp_privacy(baseAdSlot.getApp_privacy());
                downloadDialogBean.setApp_size(baseAdSlot.getApp_size());
                downloadDialogBean.setDeveloper(baseAdSlot.getDeveloper());
                downloadDialogBean.setPayment_types(baseAdSlot.getPayment_types());
                downloadDialogBean.setApp_permission(baseAdSlot.getApp_permission());
                downloadDialogBean.setApp_permission_url(baseAdSlot.getApp_permission_url());
                downloadDialogBean.setApp_intor_url(baseAdSlot.getApp_intor_url());
                downloadDialogBean.setApp_private_agreement(baseAdSlot.getPrivacy_agreement());
                HRDownloadDetailActivity.startActivity(view.getContext(), downloadDialogBean);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$5 */
    public class C06305 implements RecyclerAdMediaListener {
        public C06305() {
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoCompleted() {
            if (HRPreRenderAdapter.this.expressMediaListener != null) {
                HRPreRenderAdapter.this.expressMediaListener.onVideoCompleted();
            }
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoError() {
            if (HRPreRenderAdapter.this.expressMediaListener != null) {
                HRPreRenderAdapter.this.expressMediaListener.onVideoError(-1, "视频加载出错");
            }
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoLoaded() {
            if (HRPreRenderAdapter.this.expressMediaListener != null) {
                HRPreRenderAdapter.this.expressMediaListener.onVideoLoaded();
            }
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoPause() {
            if (HRPreRenderAdapter.this.expressMediaListener != null) {
                HRPreRenderAdapter.this.expressMediaListener.onVideoPause();
            }
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoResume() {
            if (HRPreRenderAdapter.this.expressMediaListener != null) {
                HRPreRenderAdapter.this.expressMediaListener.onVideoResume();
            }
        }

        @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
        public void onVideoStart() {
            if (HRPreRenderAdapter.this.expressMediaListener != null) {
                HRPreRenderAdapter.this.expressMediaListener.onVideoStart();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$6 */
    public class C06316 implements HttpGetBytesCallback {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ float val$density;
        public final /* synthetic */ RoundImageView val$imageView;

        public C06316(RoundImageView roundImageView, Context context, float f) {
            roundImageView = roundImageView;
            context = context;
            f = f;
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onFailure(@NotNull IOException iOException) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onResponse(HttpResponse<byte[]> httpResponse) {
            int width;
            int i;
            if (!httpResponse.isSuccessful()) {
                HRPreRenderAdapter.this.sendAdError(httpResponse.getErrorCode(), httpResponse.getErrorDescription());
                return;
            }
            byte[] responseBody = httpResponse.getResponseBody();
            if (responseBody == null || responseBody.length <= 0) {
                HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载错误");
                return;
            }
            if (responseBody.length >= MemoryUtil.getTraceMemory()) {
                HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载失败");
                return;
            }
            if (HRPreRenderAdapter.this.isGif(responseBody)) {
                RoundImageView roundImageView = roundImageView;
                if (roundImageView != null) {
                    roundImageView.setBytes(responseBody);
                    int gifWidth = roundImageView.getGifWidth();
                    int gifHeight = roundImageView.getGifHeight();
                    int iDip2px = HRPreRenderAdapter.this.adWrapper.getAdLoader() instanceof PreRenderAdLoader ? (int) DimensionUtils.dip2px(context, ((PreRenderAdLoader) HRPreRenderAdapter.this.adWrapper.getAdLoader()).getFixedHeight()) : 0;
                    LogUtil.m89i(HRPreRenderAdapter.TAG, "fixedHeight=" + iDip2px);
                    int i2 = (int) (f * 75.0f);
                    if (iDip2px > 0) {
                        i = (gifWidth * iDip2px) / gifHeight;
                    } else {
                        i = (gifWidth * i2) / gifHeight;
                        iDip2px = i2;
                    }
                    ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                    layoutParams.width = i;
                    layoutParams.height = iDip2px;
                    roundImageView.setLayoutParams(layoutParams);
                    roundImageView.startAnimation();
                }
            } else {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(responseBody, 0, responseBody.length);
                if (bitmapDecodeByteArray != null) {
                    int iDip2px2 = HRPreRenderAdapter.this.adWrapper.getAdLoader() instanceof PreRenderAdLoader ? (int) DimensionUtils.dip2px(context, ((PreRenderAdLoader) HRPreRenderAdapter.this.adWrapper.getAdLoader()).getFixedHeight()) : 0;
                    LogUtil.m89i(HRPreRenderAdapter.TAG, "fixedHeight=" + iDip2px2);
                    int i3 = (int) (f * 75.0f);
                    if (iDip2px2 > 0) {
                        width = (bitmapDecodeByteArray.getWidth() * iDip2px2) / bitmapDecodeByteArray.getHeight();
                    } else {
                        width = (bitmapDecodeByteArray.getWidth() * i3) / bitmapDecodeByteArray.getHeight();
                        iDip2px2 = i3;
                    }
                    ViewGroup.LayoutParams layoutParams2 = roundImageView.getLayoutParams();
                    layoutParams2.width = width;
                    layoutParams2.height = iDip2px2;
                    roundImageView.setLayoutParams(layoutParams2);
                    roundImageView.setImageBitmap(bitmapDecodeByteArray);
                } else {
                    HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载失败");
                }
            }
            if (HRPreRenderAdapter.this.imgLoadListener == null || HRPreRenderAdapter.this.isImageLoad) {
                return;
            }
            HRPreRenderAdapter.this.isImageLoad = true;
            HRPreRenderAdapter.this.imgLoadListener.onImgLoaded(0);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$7 */
    public class C06327 implements HttpGetBytesCallback {
        public final /* synthetic */ RoundImageView val$image;

        public C06327(RoundImageView roundImageView) {
            roundImageView = roundImageView;
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onFailure(@NotNull IOException iOException) {
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onResponse(HttpResponse<byte[]> httpResponse) {
            if (!httpResponse.isSuccessful()) {
                HRPreRenderAdapter.this.sendAdError(httpResponse.getErrorCode(), httpResponse.getErrorDescription());
                return;
            }
            try {
                byte[] responseBody = httpResponse.getResponseBody();
                if (responseBody == null || responseBody.length <= 0) {
                    HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载错误");
                    return;
                }
                if (responseBody.length >= MemoryUtil.getTraceMemory()) {
                    HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载失败");
                    return;
                }
                int height = 0;
                if (HRPreRenderAdapter.this.isGif(responseBody)) {
                    RoundImageView roundImageView = roundImageView;
                    if (roundImageView != null) {
                        roundImageView.setBytes(responseBody);
                        roundImageView.startAnimation();
                        height = roundImageView.getGifHeight();
                    }
                } else {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(responseBody, 0, responseBody.length);
                    if (bitmapDecodeByteArray != null) {
                        height = bitmapDecodeByteArray.getHeight();
                        roundImageView.setImageBitmap(bitmapDecodeByteArray);
                    } else {
                        HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载错误");
                    }
                }
                if (HRPreRenderAdapter.this.imgLoadListener == null || !HRPreRenderAdapter.this.isImageLoad) {
                    return;
                }
                HRPreRenderAdapter.this.imgLoadListener.onImgLoaded(height);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$8 */
    public class C06338 implements HttpGetBytesCallback {
        public final /* synthetic */ RoundImageView val$imageView_large;
        public final /* synthetic */ int val$width;

        public C06338(RoundImageView roundImageView, int i) {
            roundImageView = roundImageView;
            i = i;
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onFailure(@NotNull IOException iOException) {
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
        public void onResponse(HttpResponse<byte[]> httpResponse) {
            if (!httpResponse.isSuccessful()) {
                HRPreRenderAdapter.this.sendAdError(httpResponse.getErrorCode(), httpResponse.getErrorDescription());
                return;
            }
            byte[] responseBody = httpResponse.getResponseBody();
            if (responseBody == null || responseBody.length <= 0) {
                HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载错误");
                return;
            }
            if (responseBody.length >= MemoryUtil.getTraceMemory()) {
                HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载失败");
                return;
            }
            int height = 0;
            if (HRPreRenderAdapter.this.isGif(responseBody)) {
                RoundImageView roundImageView = roundImageView;
                if (roundImageView != null) {
                    roundImageView.setBytes(responseBody);
                    height = (i * roundImageView.getGifHeight()) / roundImageView.getGifWidth();
                    ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = height;
                    roundImageView.setLayoutParams(layoutParams);
                    roundImageView.startAnimation();
                }
            } else {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(responseBody, 0, responseBody.length);
                if (bitmapDecodeByteArray != null) {
                    height = (i * bitmapDecodeByteArray.getHeight()) / bitmapDecodeByteArray.getWidth();
                    ViewGroup.LayoutParams layoutParams2 = roundImageView.getLayoutParams();
                    layoutParams2.width = -1;
                    layoutParams2.height = height;
                    roundImageView.setLayoutParams(layoutParams2);
                    roundImageView.setImageBitmap(bitmapDecodeByteArray);
                } else {
                    HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载失败");
                }
            }
            if (HRPreRenderAdapter.this.imgLoadListener == null || HRPreRenderAdapter.this.isImageLoad) {
                return;
            }
            HRPreRenderAdapter.this.isImageLoad = true;
            HRPreRenderAdapter.this.imgLoadListener.onImgLoaded(height);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$9 */
    public class ViewOnClickListenerC06349 implements View.OnClickListener {
        public final /* synthetic */ View val$view;

        public ViewOnClickListenerC06349(View view) {
            view = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HRPreRenderAdapter.this.adWrapper.getLoaderListener() != 0) {
                ((RecyclerAdListener) HRPreRenderAdapter.this.adWrapper.getLoaderListener()).onAdClosed();
            }
            if (HRPreRenderAdapter.this.interactionListener != null) {
                HRPreRenderAdapter.this.interactionListener.onAdClosed();
            }
            View view2 = view;
            if (view2 == null || view2.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public interface OnImgloadSuccessListener {
        void onImgLoaded(int i);
    }

    public HRPreRenderAdapter(@NonNull HRHRAdNativeWrapper hRHRAdNativeWrapper, @NonNull NativeAdData nativeAdData) {
        this.adWrapper = hRHRAdNativeWrapper;
        this.nativeAdData = nativeAdData;
    }

    private void closeAd(TextView textView, View view) {
        textView.setOnClickListener(new View.OnClickListener() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.9
            public final /* synthetic */ View val$view;

            public ViewOnClickListenerC06349(View view2) {
                view = view2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (HRPreRenderAdapter.this.adWrapper.getLoaderListener() != 0) {
                    ((RecyclerAdListener) HRPreRenderAdapter.this.adWrapper.getLoaderListener()).onAdClosed();
                }
                if (HRPreRenderAdapter.this.interactionListener != null) {
                    HRPreRenderAdapter.this.interactionListener.onAdClosed();
                }
                View view22 = view;
                if (view22 == null || view22.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
                    return;
                }
                ((ViewGroup) view.getParent()).removeView(view);
            }
        });
    }

    public byte[] getImageBytes(Context context, int i) {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i2 = inputStreamOpenRawResource.read(bArr);
                if (-1 == i2) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void handleDownloadView(Context context, View view, BaseAdSlot baseAdSlot) {
        try {
            if (baseAdSlot.getInteractionType() == 1) {
                TextView textView = (TextView) view.findViewById(C0384R.id.adsail_download_layer_textview);
                textView.setVisibility(0);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(baseAdSlot.getAppName())) {
                    sb.append("应用名称：");
                    sb.append(baseAdSlot.getAppName());
                    sb.append(" | ");
                }
                if (!TextUtils.isEmpty(baseAdSlot.getApp_ver())) {
                    sb.append("应用版本：");
                    sb.append(baseAdSlot.getApp_ver());
                    sb.append(" | ");
                }
                if (!TextUtils.isEmpty(baseAdSlot.getApp_size())) {
                    sb.append("应用大小：");
                    sb.append(baseAdSlot.getApp_size());
                    sb.append(" | ");
                }
                if (!TextUtils.isEmpty(baseAdSlot.getDeveloper())) {
                    sb.append("开发者：");
                    sb.append(baseAdSlot.getDeveloper());
                    sb.append(" | ");
                }
                sb.append(" 权限详情> | 隐私协议 > | 功能介绍 >");
                textView.setText(sb.toString());
                textView.setOnClickListener(new View.OnClickListener() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.4
                    public final /* synthetic */ View val$adRoot;
                    public final /* synthetic */ BaseAdSlot val$adSlot;

                    public ViewOnClickListenerC06294(BaseAdSlot baseAdSlot2, View view2) {
                        baseAdSlot = baseAdSlot2;
                        view = view2;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        try {
                            DownloadDialogBean downloadDialogBean = new DownloadDialogBean();
                            downloadDialogBean.setApp_name(baseAdSlot.getAppName());
                            downloadDialogBean.setApp_feature(baseAdSlot.getApp_feature());
                            downloadDialogBean.setApp_intro(baseAdSlot.getApp_intro());
                            downloadDialogBean.setApp_privacy(baseAdSlot.getApp_privacy());
                            downloadDialogBean.setApp_size(baseAdSlot.getApp_size());
                            downloadDialogBean.setDeveloper(baseAdSlot.getDeveloper());
                            downloadDialogBean.setPayment_types(baseAdSlot.getPayment_types());
                            downloadDialogBean.setApp_permission(baseAdSlot.getApp_permission());
                            downloadDialogBean.setApp_permission_url(baseAdSlot.getApp_permission_url());
                            downloadDialogBean.setApp_intor_url(baseAdSlot.getApp_intor_url());
                            downloadDialogBean.setApp_private_agreement(baseAdSlot.getPrivacy_agreement());
                            HRDownloadDetailActivity.startActivity(view.getContext(), downloadDialogBean);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isGif(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        return new BigInteger(1, bArr2).toString(16).startsWith("47494638");
    }

    private void renderStyle(LayoutBean.StyleBean styleBean, RelativeLayout relativeLayout, TextView textView, TextView textView2, RoundImageView roundImageView, TextView textView3, ImageView imageView, TextView textView4, TextView textView5) {
        LayoutBean.StyleBean.BorderBean border;
        try {
            float f = this.adWrapper.getContext().getResources().getDisplayMetrics().density;
            if (styleBean.getContainer() != null && relativeLayout != null) {
                List<Integer> padding = styleBean.getContainer().getPadding();
                if (padding != null && padding.size() >= 4) {
                    relativeLayout.setPadding((int) (padding.get(3).intValue() * f), (int) (padding.get(0).intValue() * f), (int) (padding.get(1).intValue() * f), (int) (padding.get(2).intValue() * f));
                }
                LayoutBean.StyleBean.BorderBean border2 = styleBean.getContainer().getBorder();
                if (border2 != null && border2.getClip() && border2.getRadius() != null && border2.getRadius().size() >= 4) {
                    relativeLayout.setBackground(createRectangleDrawable(border2.getRadius(), 0, ""));
                }
            }
            if (styleBean.getTitle() != null && textView != null) {
                if (styleBean.getTitle().getMargin() != null && styleBean.getTitle().getMargin().size() >= 4) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                    marginLayoutParams.topMargin = (int) (styleBean.getTitle().getMargin().get(0).intValue() * f);
                    marginLayoutParams.rightMargin = (int) (styleBean.getTitle().getMargin().get(1).intValue() * f);
                    marginLayoutParams.bottomMargin = (int) (styleBean.getTitle().getMargin().get(2).intValue() * f);
                    marginLayoutParams.leftMargin = (int) (styleBean.getTitle().getMargin().get(3).intValue() * f);
                    textView.setLayoutParams(marginLayoutParams);
                }
                if (styleBean.getTitle().getPadding() != null && styleBean.getTitle().getPadding().size() >= 4) {
                    textView.setPadding((int) (styleBean.getTitle().getPadding().get(3).intValue() * f), (int) (styleBean.getTitle().getPadding().get(0).intValue() * f), (int) (styleBean.getTitle().getPadding().get(1).intValue() * f), (int) (styleBean.getTitle().getPadding().get(2).intValue() * f));
                }
                if (styleBean.getTitle().getText() != null) {
                    if (!TextUtils.isEmpty(styleBean.getTitle().getText().getColor())) {
                        textView.setTextColor(Color.parseColor("#" + styleBean.getTitle().getText().getColor()));
                    }
                    if (styleBean.getTitle().getText().getSize() > 0) {
                        textView.setTextSize(styleBean.getTitle().getText().getSize());
                    }
                    if (styleBean.getTitle().getText().getLines() == 0) {
                        textView.setMaxLines(20);
                    } else {
                        textView.setMaxLines(styleBean.getTitle().getText().getLines());
                    }
                }
            }
            if (styleBean.getContent() != null && textView2 != null) {
                if (styleBean.getContent().getMargin() != null && styleBean.getContent().getMargin().size() >= 4) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                    marginLayoutParams2.topMargin = (int) (styleBean.getContent().getMargin().get(0).intValue() * f);
                    marginLayoutParams2.rightMargin = (int) (styleBean.getContent().getMargin().get(1).intValue() * f);
                    marginLayoutParams2.bottomMargin = (int) (styleBean.getContent().getMargin().get(2).intValue() * f);
                    marginLayoutParams2.leftMargin = (int) (styleBean.getContent().getMargin().get(3).intValue() * f);
                    textView2.setLayoutParams(marginLayoutParams2);
                }
                if (styleBean.getContent().getPadding() != null && styleBean.getContent().getPadding().size() >= 4) {
                    textView2.setPadding((int) (styleBean.getContent().getPadding().get(3).intValue() * f), (int) (styleBean.getContent().getPadding().get(0).intValue() * f), (int) (styleBean.getContent().getPadding().get(1).intValue() * f), (int) (styleBean.getContent().getPadding().get(2).intValue() * f));
                }
                if (styleBean.getContent().getText() != null) {
                    if (!TextUtils.isEmpty(styleBean.getContent().getText().getColor())) {
                        textView2.setTextColor(Color.parseColor("#" + styleBean.getContent().getText().getColor()));
                    }
                    if (styleBean.getContent().getText().getSize() > 0) {
                        textView2.setTextSize(styleBean.getContent().getText().getSize());
                    }
                    if (styleBean.getContent().getText().getLines() == 0) {
                        textView.setMaxLines(20);
                    } else {
                        textView.setMaxLines(styleBean.getContent().getText().getLines());
                    }
                }
            }
            if (styleBean.getCreative() != null && roundImageView != null) {
                LayoutBean.StyleBean.BorderBean border3 = styleBean.getCreative().getBorder();
                if (border3 != null && border3.getClip() && border3.getRadius() != null && border3.getRadius().size() >= 4) {
                    roundImageView.setCornerTopLeftRadius((int) (border3.getRadius().get(0).intValue() * f));
                    roundImageView.setCornerTopRightRadius((int) (border3.getRadius().get(1).intValue() * f));
                    roundImageView.setCornerBottomRightRadius((int) (border3.getRadius().get(2).intValue() * f));
                    roundImageView.setCornerBottomLeftRadius((int) (border3.getRadius().get(3).intValue() * f));
                }
                if (styleBean.getCreative().getMargin() != null && styleBean.getCreative().getMargin().size() >= 4) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) roundImageView.getLayoutParams();
                    marginLayoutParams3.topMargin = (int) (styleBean.getCreative().getMargin().get(0).intValue() * f);
                    marginLayoutParams3.rightMargin = (int) (styleBean.getCreative().getMargin().get(1).intValue() * f);
                    marginLayoutParams3.bottomMargin = (int) (styleBean.getCreative().getMargin().get(2).intValue() * f);
                    marginLayoutParams3.leftMargin = (int) (styleBean.getCreative().getMargin().get(3).intValue() * f);
                    roundImageView.setLayoutParams(marginLayoutParams3);
                }
            }
            if (styleBean.getDislike() != null && textView3 != null) {
                if (styleBean.getDislike().isHide()) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(0);
                }
                if (styleBean.getDislike().getText() != null) {
                    LayoutBean.StyleBean.TextBean text = styleBean.getDislike().getText();
                    if (text.getSize() > 0) {
                        textView3.setTextSize(text.getSize());
                    }
                    if (!TextUtils.isEmpty(text.getColor())) {
                        textView3.setTextColor(Color.parseColor("#" + text.getColor()));
                    }
                    if (text.getLines() > 0) {
                        textView3.setMaxLines(text.getLines());
                    }
                }
                if (styleBean.getDislike().getMargin() != null && styleBean.getDislike().getMargin().size() >= 4) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) textView3.getLayoutParams();
                    marginLayoutParams4.topMargin = (int) (styleBean.getDislike().getMargin().get(0).intValue() * f);
                    marginLayoutParams4.rightMargin = (int) (styleBean.getDislike().getMargin().get(1).intValue() * f);
                    marginLayoutParams4.bottomMargin = (int) (styleBean.getDislike().getMargin().get(2).intValue() * f);
                    marginLayoutParams4.leftMargin = (int) (styleBean.getDislike().getMargin().get(3).intValue() * f);
                    textView3.setLayoutParams(marginLayoutParams4);
                }
                List<Integer> padding2 = styleBean.getDislike().getPadding();
                if (padding2 != null && padding2.size() >= 4) {
                    textView3.setPadding((int) (padding2.get(3).intValue() * f), (int) (padding2.get(0).intValue() * f), (int) (padding2.get(1).intValue() * f), (int) (padding2.get(2).intValue() * f));
                }
                LayoutBean.StyleBean.BorderBean border4 = styleBean.getDislike().getBorder();
                if (border4 != null) {
                    textView3.setBackground(createRectangleDrawable(border4.getRadius(), styleBean.getDislike().getBorder().getSize(), "#" + styleBean.getDislike().getBorder().getColor()));
                }
            }
            if (styleBean.getLogo() != null && imageView != null) {
                if (styleBean.getLogo().isHide()) {
                    imageView.setVisibility(8);
                } else if (AdSdk.adConfig().showLogo()) {
                    imageView.setVisibility(0);
                }
                if (styleBean.getLogo().getMargin() != null && styleBean.getLogo().getMargin().size() >= 4) {
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                    marginLayoutParams5.topMargin = (int) (styleBean.getLogo().getMargin().get(0).intValue() * f);
                    marginLayoutParams5.rightMargin = (int) (styleBean.getLogo().getMargin().get(1).intValue() * f);
                    marginLayoutParams5.bottomMargin = (int) (styleBean.getLogo().getMargin().get(2).intValue() * f);
                    marginLayoutParams5.leftMargin = (int) (styleBean.getLogo().getMargin().get(3).intValue() * f);
                    imageView.setLayoutParams(marginLayoutParams5);
                }
            }
            if (styleBean.getSource() != null && textView4 != null) {
                if (styleBean.getSource().isHide()) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setVisibility(0);
                }
                if (styleBean.getSource().getMargin() != null && styleBean.getSource().getMargin().size() >= 4) {
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) textView4.getLayoutParams();
                    marginLayoutParams6.topMargin = (int) (styleBean.getSource().getMargin().get(0).intValue() * f);
                    marginLayoutParams6.rightMargin = (int) (styleBean.getSource().getMargin().get(1).intValue() * f);
                    marginLayoutParams6.bottomMargin = (int) (styleBean.getSource().getMargin().get(2).intValue() * f);
                    marginLayoutParams6.leftMargin = (int) (styleBean.getSource().getMargin().get(3).intValue() * f);
                    textView4.setLayoutParams(marginLayoutParams6);
                }
                List<Integer> padding3 = styleBean.getSource().getPadding();
                if (padding3 != null && padding3.size() >= 4) {
                    textView4.setPadding((int) (padding3.get(3).intValue() * f), (int) (padding3.get(0).intValue() * f), (int) (padding3.get(1).intValue() * f), (int) (padding3.get(2).intValue() * f));
                }
                if (styleBean.getSource().getText() != null) {
                    LayoutBean.StyleBean.TextBean text2 = styleBean.getSource().getText();
                    if (text2.getSize() > 0) {
                        textView4.setTextSize(text2.getSize());
                    }
                    if (!TextUtils.isEmpty(text2.getColor())) {
                        textView4.setTextColor(Color.parseColor("#" + text2.getColor()));
                    }
                }
            }
            if (styleBean.getButton() == null || textView5 == null) {
                return;
            }
            if (styleBean.getButton().getMargin() != null && styleBean.getButton().getMargin().size() >= 4) {
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) textView5.getLayoutParams();
                marginLayoutParams7.topMargin = (int) (styleBean.getButton().getMargin().get(0).intValue() * f);
                marginLayoutParams7.rightMargin = (int) (styleBean.getButton().getMargin().get(1).intValue() * f);
                marginLayoutParams7.bottomMargin = (int) (styleBean.getButton().getMargin().get(2).intValue() * f);
                marginLayoutParams7.leftMargin = (int) (styleBean.getButton().getMargin().get(3).intValue() * f);
                textView5.setLayoutParams(marginLayoutParams7);
            }
            List<Integer> padding4 = styleBean.getButton().getPadding();
            if (padding4 != null && padding4.size() >= 4) {
                textView5.setPadding((int) (padding4.get(3).intValue() * f), (int) (padding4.get(0).intValue() * f), (int) (padding4.get(1).intValue() * f), (int) (padding4.get(2).intValue() * f));
            }
            if (styleBean.getButton().getText() != null) {
                LayoutBean.StyleBean.TextBean text3 = styleBean.getButton().getText();
                if (text3.getSize() > 0) {
                    textView5.setTextSize(text3.getSize());
                }
                if (!TextUtils.isEmpty(text3.getColor())) {
                    textView5.setTextColor(Color.parseColor("#" + text3.getColor()));
                }
            }
            if (styleBean.getButton().getBorder() == null || (border = styleBean.getButton().getBorder()) == null || border.getRadius() == null || border.getRadius().size() < 4) {
                return;
            }
            textView5.setBackground(createRectangleDrawable(border.getRadius(), styleBean.getButton().getBorder().getSize(), "#" + styleBean.getButton().getBorder().getColor()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendAdError(int i, String str) {
        if (this.adWrapper.getLoaderListener() != 0) {
            ((RecyclerAdListener) this.adWrapper.getLoaderListener()).onAdRenderFail(str, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void showLeftRightStyle(android.content.Context r17, cn.haorui.sdk.core.domain.LayoutBean.StyleBean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.platform.p003hr.recycler.HRPreRenderAdapter.showLeftRightStyle(android.content.Context, cn.haorui.sdk.core.domain.LayoutBean$StyleBean, int, int, int, int):void");
    }

    private void showLogo(ImageView imageView) {
        if (!TextUtils.isEmpty(this.nativeAdData.getAdSlot().getFromLogo())) {
            new o000(imageView).o00000o0(this.nativeAdData.getAdSlot().getFromLogo(), false, true, 0, -1, new o000OO00() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.10
                public C062510() {
                }

                @Override // p285z2.o000OO00
                public void callback(String str, ImageView imageView2, Bitmap bitmap, o000O o000o) {
                    if (200 > o000o.OooOO0o() || 300 <= o000o.OooOO0o() || bitmap.isRecycled() || 5 > bitmap.getWidth() || 5 > bitmap.getHeight()) {
                        return;
                    }
                    imageView2.setImageBitmap(bitmap);
                }
            });
        }
        imageView.setVisibility(AdSdk.adConfig().showLogo() ? 0 : 8);
    }

    private void showStartShakeImage(Context context, RelativeLayout relativeLayout, GifImageView gifImageView) {
        this.adView.postDelayed(new Runnable() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.11
            public final /* synthetic */ Context val$context;
            public final /* synthetic */ GifImageView val$shakeImage;
            public final /* synthetic */ RelativeLayout val$startShakeRoot;

            /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$11$1 */
            public class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    gifImageView.clear();
                    relativeLayout.setVisibility(8);
                }
            }

            public RunnableC062611(Context context2, RelativeLayout relativeLayout2, GifImageView gifImageView2) {
                context = context2;
                relativeLayout = relativeLayout2;
                gifImageView = gifImageView2;
            }

            @Override // java.lang.Runnable
            public void run() {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int measuredHeight = HRPreRenderAdapter.this.adView.getMeasuredHeight();
                if (measuredHeight < displayMetrics.density * 120.0f) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    layoutParams.height = Math.max(measuredHeight - 70, (int) (displayMetrics.density * 70.0f));
                    layoutParams.width = -2;
                    relativeLayout.setLayoutParams(layoutParams);
                }
                relativeLayout.setVisibility(0);
                byte[] imageBytes = HRPreRenderAdapter.this.getImageBytes(context, C0384R.raw.adsail_new_shake);
                if (imageBytes != null && imageBytes.length > 0) {
                    gifImageView.setBytes(imageBytes, 1);
                    gifImageView.startAnimation();
                }
                relativeLayout.postDelayed(new Runnable() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.11.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        gifImageView.clear();
                        relativeLayout.setVisibility(8);
                    }
                }, C1659a.f9130f);
            }
        }, 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void showThreeImageStyle(android.content.Context r22, cn.haorui.sdk.core.domain.LayoutBean.StyleBean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.platform.p003hr.recycler.HRPreRenderAdapter.showThreeImageStyle(android.content.Context, cn.haorui.sdk.core.domain.LayoutBean$StyleBean, int, int, int, int):void");
    }

    private void showUpDownStyle(Context context, LayoutBean.StyleBean styleBean, int i, int i2, int i3, int i4) {
        int i5;
        RoundImageView roundImageView;
        View viewInflate = View.inflate(context, C0384R.layout.adsail_item_pre_render_large_image, null);
        if (styleBean != null && styleBean.getType() == 201) {
            viewInflate = View.inflate(context, C0384R.layout.adsail_item_pre_render_large_image_top, null);
        }
        this.isUpDownStyle = true;
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(C0384R.id.adsail_item_pre_render_large_iamge_rootview);
        this.adView = relativeLayout;
        relativeLayout.setPadding(i, i2, i3, i4);
        TextView textView = (TextView) viewInflate.findViewById(C0384R.id.adsail_item_pre_render_large_iamge_title);
        TextView textView2 = (TextView) viewInflate.findViewById(C0384R.id.adsail_item_pre_render_large_iamge_content);
        RoundImageView roundImageView2 = (RoundImageView) viewInflate.findViewById(C0384R.id.adsail_item_pre_render_large_iamge_imageview);
        ImageView imageView = (ImageView) viewInflate.findViewById(C0384R.id.adsail_item_pre_render_large_iamge_logo);
        TextView textView3 = (TextView) viewInflate.findViewById(C0384R.id.adsail_item_pre_render_large_iamge_fromtext);
        TextView textView4 = (TextView) viewInflate.findViewById(C0384R.id.adsail_item_pre_render_large_iamge_close);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(C0384R.id.adsail_item_pre_render_large_shake_image);
        TextView textView5 = (TextView) viewInflate.findViewById(C0384R.id.adsail_item_pre_render_large_iamge_shake_text);
        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate.findViewById(C0384R.id.adsail_shakeRoot);
        GifImageView gifImageView = (GifImageView) viewInflate.findViewById(C0384R.id.adsail_shake_img);
        TextView textView6 = (TextView) viewInflate.findViewById(C0384R.id.adsail_shake_text);
        View view = viewInflate;
        if ((this.nativeAdData.getAdSlot().getAct_type() & 4) == 4) {
            showStartShakeImage(context, relativeLayout2, gifImageView);
            i5 = 0;
            imageView2.setVisibility(0);
            textView5.setVisibility(0);
            textView5.setText("摇一摇");
            textView6.setText("摇一摇");
        } else if ((this.nativeAdData.getAdSlot().getAct_type() & 8) == 8) {
            showStartShakeImage(context, relativeLayout2, gifImageView);
            i5 = 0;
            imageView2.setVisibility(0);
            textView5.setVisibility(0);
            textView5.setText("扭一扭");
            textView6.setText("扭一扭");
        } else {
            i5 = 0;
        }
        if ((this.nativeAdData.getAdSlot().getAct_type() & 4) == 4) {
            imageView2.setVisibility(i5);
            textView5.setVisibility(i5);
            textView5.setText("摇一摇");
        } else if ((this.nativeAdData.getAdSlot().getAct_type() & 8) == 8) {
            imageView2.setVisibility(i5);
            textView5.setVisibility(i5);
            textView5.setText("扭一扭");
        }
        textView.setText(this.nativeAdData.getAdSlot().getTitle());
        textView2.setText(this.nativeAdData.getAdSlot().getContent());
        textView3.setText(this.nativeAdData.getAdSlot().getIconTitle());
        if (this.nativeAdData.getImgUrls() == null || this.nativeAdData.getImgUrls().length <= 0 || TextUtils.isEmpty(this.nativeAdData.getImgUrls()[0])) {
            roundImageView = roundImageView2;
        } else {
            roundImageView = roundImageView2;
            HttpUtil.asyncGetFile(this.nativeAdData.getImgUrls()[0], new HttpGetBytesCallback() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.8
                public final /* synthetic */ RoundImageView val$imageView_large;
                public final /* synthetic */ int val$width;

                public C06338(RoundImageView roundImageView3, int i6) {
                    roundImageView = roundImageView3;
                    i = i6;
                }

                @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
                public void onFailure(@NotNull IOException iOException) {
                }

                @Override // cn.haorui.sdk.core.utils.HttpGetBytesCallback
                public void onResponse(HttpResponse<byte[]> httpResponse) {
                    if (!httpResponse.isSuccessful()) {
                        HRPreRenderAdapter.this.sendAdError(httpResponse.getErrorCode(), httpResponse.getErrorDescription());
                        return;
                    }
                    byte[] responseBody = httpResponse.getResponseBody();
                    if (responseBody == null || responseBody.length <= 0) {
                        HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载错误");
                        return;
                    }
                    if (responseBody.length >= MemoryUtil.getTraceMemory()) {
                        HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载失败");
                        return;
                    }
                    int height = 0;
                    if (HRPreRenderAdapter.this.isGif(responseBody)) {
                        RoundImageView roundImageView3 = roundImageView;
                        if (roundImageView3 != null) {
                            roundImageView3.setBytes(responseBody);
                            height = (i * roundImageView.getGifHeight()) / roundImageView.getGifWidth();
                            ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                            layoutParams.width = -1;
                            layoutParams.height = height;
                            roundImageView.setLayoutParams(layoutParams);
                            roundImageView.startAnimation();
                        }
                    } else {
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(responseBody, 0, responseBody.length);
                        if (bitmapDecodeByteArray != null) {
                            height = (i * bitmapDecodeByteArray.getHeight()) / bitmapDecodeByteArray.getWidth();
                            ViewGroup.LayoutParams layoutParams2 = roundImageView.getLayoutParams();
                            layoutParams2.width = -1;
                            layoutParams2.height = height;
                            roundImageView.setLayoutParams(layoutParams2);
                            roundImageView.setImageBitmap(bitmapDecodeByteArray);
                        } else {
                            HRPreRenderAdapter.this.sendAdError(C0493a.f86a.intValue(), "图片加载失败");
                        }
                    }
                    if (HRPreRenderAdapter.this.imgLoadListener == null || HRPreRenderAdapter.this.isImageLoad) {
                        return;
                    }
                    HRPreRenderAdapter.this.isImageLoad = true;
                    HRPreRenderAdapter.this.imgLoadListener.onImgLoaded(height);
                }
            });
        }
        showLogo(imageView);
        closeAd(textView4, view);
        if (styleBean != null) {
            if (styleBean.getType() == 101 || styleBean.getType() == 201) {
                renderStyle(styleBean, this.adView, textView, textView2, roundImageView3, textView4, imageView, textView3, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void showVideoStyle(android.content.Context r17, cn.haorui.sdk.core.domain.LayoutBean.StyleBean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.platform.p003hr.recycler.HRPreRenderAdapter.showVideoStyle(android.content.Context, cn.haorui.sdk.core.domain.LayoutBean$StyleBean, int, int, int, int):void");
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void bindAdToView(Context context, ViewGroup viewGroup, List<View> list, RecylcerAdInteractionListener recylcerAdInteractionListener) {
        this.interactionListener = recylcerAdInteractionListener;
        viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.1
            public final /* synthetic */ ViewGroup val$container;
            public final /* synthetic */ Context val$context;
            public final /* synthetic */ Rect val$mClipRect;
            public final /* synthetic */ RecylcerAdInteractionListener val$recylcerAdInteractionListener;

            /* JADX INFO: renamed from: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter$1$1 */
            public class AnonymousClass1 implements C0511g.d {
                public AnonymousClass1() {
                }

                @Override // cn.haorui.sdk.core.loader.C0511g.d
                public void onShake() {
                    RecylcerAdInteractionListener recylcerAdInteractionListener;
                    C0511g.c.f151a.m44a(HRPreRenderAdapter.this.shakeId);
                    if (HRPreRenderAdapter.this.nativeAdData.getAdSlot().getCbc() == 0 && (recylcerAdInteractionListener = recylcerAdInteractionListener) != null) {
                        recylcerAdInteractionListener.onAdClicked();
                    }
                    ClickHandler.handleClick(HRPreRenderAdapter.this.nativeAdData);
                }
            }

            public ViewTreeObserverOnPreDrawListenerC06241(ViewGroup viewGroup2, Rect rect, Context context2, RecylcerAdInteractionListener recylcerAdInteractionListener2) {
                viewGroup = viewGroup2;
                rect = rect;
                context = context2;
                recylcerAdInteractionListener = recylcerAdInteractionListener2;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!viewGroup.getGlobalVisibleRect(rect)) {
                    return true;
                }
                if (((long) rect.height()) * ((long) rect.width()) >= ((long) viewGroup.getHeight()) * ((long) viewGroup.getWidth()) * 0.3d && !HRPreRenderAdapter.this.isAdExposure) {
                    HRPreRenderAdapter.this.isAdExposure = true;
                    if (HRPreRenderAdapter.this.adWrapper.getHRAdListenerAdapter() != null && HRPreRenderAdapter.this.nativeAdData.getAdPatternType() != 2) {
                        HRPreRenderAdapter.this.adWrapper.getHRAdListenerAdapter().onADExposure();
                    }
                    if (HRPreRenderAdapter.this.shakeId == 0) {
                        HRPreRenderAdapter.this.shakeId = C0511g.c.f151a.m49b();
                    }
                    if ((HRPreRenderAdapter.this.nativeAdData.getAdSlot().getAct_type() & 4) == 4 || (HRPreRenderAdapter.this.nativeAdData.getAdSlot().getAct_type() & 8) == 8) {
                        int i = (HRPreRenderAdapter.this.nativeAdData.getAdSlot().getAct_type() & 8) == 8 ? 2 : 1;
                        C0511g.c.f151a.m47a(HRPreRenderAdapter.this.nativeAdData.getAdSlot().getPosId(), HRPreRenderAdapter.this.nativeAdData.getAdSlot().getLoadedTime(), HRPreRenderAdapter.this.nativeAdData.getAdSlot().getDclk());
                        C0511g.c.f151a.m45a(HRPreRenderAdapter.this.nativeAdData.getAdSlot().getPower_index(), i, HRPreRenderAdapter.this.nativeAdData.getAdSlot().getPower_delay(), HRPreRenderAdapter.this.nativeAdData.getAdSlot().getPower_count(), HRPreRenderAdapter.this.shakeId, HRPreRenderAdapter.this.nativeAdData.getAdSlot().getEcpm(), new C0511g.d() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.1.1
                            public AnonymousClass1() {
                            }

                            @Override // cn.haorui.sdk.core.loader.C0511g.d
                            public void onShake() {
                                RecylcerAdInteractionListener recylcerAdInteractionListener2;
                                C0511g.c.f151a.m44a(HRPreRenderAdapter.this.shakeId);
                                if (HRPreRenderAdapter.this.nativeAdData.getAdSlot().getCbc() == 0 && (recylcerAdInteractionListener2 = recylcerAdInteractionListener) != null) {
                                    recylcerAdInteractionListener2.onAdClicked();
                                }
                                ClickHandler.handleClick(HRPreRenderAdapter.this.nativeAdData);
                            }
                        });
                        C0511g.c.f151a.m48a(true);
                    }
                    viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            }
        });
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        TouchAdContainer touchAdContainer = new TouchAdContainer(viewGroup2.getContext());
        View adView = getAdView();
        if (adView == null) {
            return;
        }
        if (adView.getParent() != null && (adView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) adView.getParent()).removeView(adView);
        }
        touchAdContainer.addView(adView, layoutParams);
        touchAdContainer.setOnWindownEventListener(new TouchAdContainer.OnWindownEventListener() { // from class: cn.haorui.sdk.platform.hr.recycler.HRPreRenderAdapter.2
            public C06272() {
            }

            @Override // cn.haorui.sdk.core.view.TouchAdContainer.OnWindownEventListener
            public void onAttachedToWindow() {
            }

            @Override // cn.haorui.sdk.core.view.TouchAdContainer.OnWindownEventListener
            public void onDetachedFromWindow() {
                C0511g.c.f151a.m44a(HRPreRenderAdapter.this.shakeId);
            }

            @Override // cn.haorui.sdk.core.view.TouchAdContainer.OnWindownEventListener
            public void onWindowFocusChanged(boolean z) {
                C0511g c0511g;
                int i;
                boolean z3;
                if (z) {
                    c0511g = C0511g.c.f151a;
                    i = HRPreRenderAdapter.this.shakeId;
                    z3 = true;
                } else {
                    c0511g = C0511g.c.f151a;
                    i = HRPreRenderAdapter.this.shakeId;
                    z3 = false;
                }
                c0511g.m46a(i, z3);
            }
        });
        viewGroup2.removeAllViews();
        viewGroup2.addView(touchAdContainer, -1, -2);
        this.nativeAdData.setInteractionListener(this.interactionListener);
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void bindMediaView(ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams, RecyclerAdMediaListener recyclerAdMediaListener) {
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void bindMediaView(ViewGroup viewGroup, RecyclerAdMediaListener recyclerAdMediaListener) {
    }

    public GradientDrawable createRectangleDrawable(List<Integer> list, int i, String str) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(-1);
            if (i > 0) {
                gradientDrawable.setStroke(i, Color.parseColor(str));
            }
            if (list != null && list.size() == 4) {
                gradientDrawable.setCornerRadii(new float[]{list.get(0).intValue(), list.get(0).intValue(), list.get(1).intValue(), list.get(1).intValue(), list.get(2).intValue(), list.get(2).intValue(), list.get(3).intValue(), list.get(3).intValue()});
            }
            return gradientDrawable;
        } catch (Exception unused) {
            return new GradientDrawable();
        }
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void destroy() {
        C0511g.c.f151a.m44a(this.shakeId);
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getActionText() {
        return null;
    }

    public IAdExposureListener getAdExposureListener() {
        return this.iAdExposureListener;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public int getAdPatternType() {
        return this.nativeAdData.getAdPatternType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x017a  */
    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getAdView() {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.platform.p003hr.recycler.HRPreRenderAdapter.getAdView():android.view.View");
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getAppIntro() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getAppIntroUrl() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getAppName() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public List<HRAdInfo.PermissionBean> getAppPermissionList() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getAppPremissionUrl() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getAppSize() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getAppVersion() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getContent() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public ResultBean getData() {
        ResultBean resultBean = new ResultBean();
        resultBean.setCid(this.adWrapper.getAdSlot().getCid());
        resultBean.setCat(this.adWrapper.getAdSlot().getCat());
        resultBean.setAderId(this.adWrapper.getAdSlot().getAder_id());
        resultBean.setFromId(this.adWrapper.getAdSlot().getFromId());
        resultBean.setReqId(this.adWrapper.getAdSlot().getReq_id());
        resultBean.setPrice(this.adWrapper.getAdSlot().getEcpm());
        resultBean.setEcpm(this.adWrapper.getAdSlot().getEcpm() + "");
        resultBean.setS_ext(this.adWrapper.getAdSlot().getS_ext());
        resultBean.setS_code(this.adWrapper.getAdSlot().getS_code());
        resultBean.setSdkName(HRConstants.PLATFORM_HR);
        return resultBean;
    }

    public String getDeepLink() {
        if (AderUtil.getIsOperationContent(this.nativeAdData.getAdSlot().getAder_id())) {
            return this.nativeAdData.getAdSlot().getDeep_link();
        }
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getDesc() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getDeveloper() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public long getDuration() {
        return this.nativeAdData.getAdSlot().getVideo_duration() * 1000;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getFrom() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getFromId() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getFromLogo() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public int getHeight() {
        return this.nativeAdData.getAdSlot().getHeight();
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getIconTitle() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getIconUrl() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String[] getImgUrls() {
        return AderUtil.getIsOperationContent(this.nativeAdData.getAdSlot().getAder_id()) ? this.nativeAdData.getAdSlot().getImageUrls() : new String[0];
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public int getInteractionType() {
        return this.nativeAdData.getInteractionType();
    }

    public boolean getIsOperationContent() {
        return AderUtil.getIsOperationContent(this.nativeAdData.getAdSlot().getAder_id());
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getPackageName() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getPlatFormEcpm() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getPlatform() {
        return HRConstants.PLATFORM_HR;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getPrivacyAgreement() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public int getRecyclerType() {
        return 2;
    }

    public int getSrcType() {
        return this.nativeAdData.getAdPatternType();
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getTitle() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public String getVideoUrl() {
        return null;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public int getWidth() {
        return this.nativeAdData.getAdSlot().getWidth();
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public boolean isAdValid() {
        int expire_timestamp = this.adWrapper.getAdSlot().getExpire_timestamp();
        return SystemClock.uptimeMillis() - this.adWrapper.getAdSlot().getLoadedTime() < (expire_timestamp <= 0 ? 1740000L : (long) (expire_timestamp * 1000));
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public boolean isNativeExpress() {
        return true;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void mute() {
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void pauseVideo() {
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void replay() {
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void resumeVideo() {
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void setExpressMediaListener(ExpressMediaListener expressMediaListener) {
        this.expressMediaListener = expressMediaListener;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void setOnADExposureListener(IAdExposureListener iAdExposureListener) {
        this.iAdExposureListener = iAdExposureListener;
    }

    public void setOnImgloadSuccessListener(OnImgloadSuccessListener onImgloadSuccessListener) {
        this.imgLoadListener = onImgloadSuccessListener;
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void startVideo() {
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void stopVideo() {
    }

    @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdData
    public void unmute() {
    }
}
