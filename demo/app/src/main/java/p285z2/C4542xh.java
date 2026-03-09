package p285z2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.nativead.api.ATNativeMaterial;

/* JADX INFO: renamed from: z2.xh */
/* JADX INFO: loaded from: classes2.dex */
public class C4542xh {
    private static final String OooO00o = "xh";

    /* JADX INFO: renamed from: z2.xh$OooO00o */
    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View OoooOoO;
        public final /* synthetic */ Context OoooOoo;
        public final /* synthetic */ int Ooooo00;
        public final /* synthetic */ int Ooooo0o;
        public final /* synthetic */ FrameLayout.LayoutParams OooooO0;

        public OooO00o(View view, Context context, int i, int i2, FrameLayout.LayoutParams layoutParams) {
            this.OoooOoO = view;
            this.OoooOoo = context;
            this.Ooooo00 = i;
            this.Ooooo0o = i2;
            this.OooooO0 = layoutParams;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i;
            this.OoooOoO.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int width = this.OoooOoO.getWidth() - C4542xh.OooO0O0(this.OoooOoo, 10.0f);
            int i2 = this.Ooooo00;
            if (i2 <= 0 || (i = this.Ooooo0o) <= 0 || i2 <= i) {
                FrameLayout.LayoutParams layoutParams = this.OooooO0;
                layoutParams.width = -1;
                layoutParams.height = (width * 600) / 1024;
            } else {
                int i3 = (i * width) / i2;
                FrameLayout.LayoutParams layoutParams2 = this.OooooO0;
                layoutParams2.width = width;
                layoutParams2.height = i3;
            }
        }
    }

    /* JADX INFO: renamed from: z2.xh$OooO0O0 */
    public class OooO0O0 implements ATShakeViewListener {
        public final /* synthetic */ FrameLayout OooO00o;

        public OooO0O0(FrameLayout frameLayout) {
            this.OooO00o = frameLayout;
        }

        @Override // com.anythink.core.api.ATShakeViewListener
        public void onDismiss() {
            this.OooO00o.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: z2.xh$OooO0OO */
    public class OooO0OO implements ATShakeViewListener {
        public final /* synthetic */ FrameLayout OooO00o;

        public OooO0OO(FrameLayout frameLayout) {
            this.OooO00o = frameLayout;
        }

        @Override // com.anythink.core.api.ATShakeViewListener
        public void onDismiss() {
            this.OooO00o.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: z2.xh$OooO0o */
    public class OooO0o implements View.OnClickListener {
        public final /* synthetic */ String OoooOoO;
        public final /* synthetic */ View OoooOoo;

        public OooO0o(String str, View view) {
            this.OoooOoO = str;
            this.OoooOoo = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.OoooOoO));
                intent.addFlags(268468224);
                Context context = this.OoooOoo.getContext();
                if (context != null) {
                    context.startActivity(intent);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0373  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO00o(android.content.Context r24, com.anythink.nativead.api.ATNativeMaterial r25, android.view.View r26, com.anythink.nativead.api.ATNativePrepareInfo r27) {
        /*
            Method dump skipped, instruction units count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4542xh.OooO00o(android.content.Context, com.anythink.nativead.api.ATNativeMaterial, android.view.View, com.anythink.nativead.api.ATNativePrepareInfo):void");
    }

    public static int OooO0O0(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static void OooO0OO(ATNativeMaterial aTNativeMaterial) {
        String str;
        String str2;
        String str3;
        String str4;
        if (aTNativeMaterial == null) {
            return;
        }
        String adType = aTNativeMaterial.getAdType();
        adType.hashCode();
        if (adType.equals("1")) {
            str = OooO00o;
            str2 = "Ad source type: Video, video duration: " + aTNativeMaterial.getVideoDuration();
        } else if (adType.equals("2")) {
            str = OooO00o;
            str2 = "Ad source type: Image";
        } else {
            str = OooO00o;
            str2 = "Ad source type: Unknown";
        }
        Log.i(str, str2);
        int nativeType = aTNativeMaterial.getNativeType();
        if (nativeType != 1) {
            if (nativeType == 2) {
                str3 = OooO00o;
                str4 = "Native type: Patch";
            }
            Log.i(OooO00o, "show native material:\nadMaterial: " + aTNativeMaterial + "\ngetTitle:" + aTNativeMaterial.getTitle() + "\ngetDescriptionText:" + aTNativeMaterial.getDescriptionText() + "\ngetNativeType:" + aTNativeMaterial.getNativeType() + "\ngetAdMediaView:" + aTNativeMaterial.getAdMediaView(new Object[0]) + "\ngetAdIconView:" + aTNativeMaterial.getAdIconView() + "\ngetIconImageUrl:" + aTNativeMaterial.getIconImageUrl() + "\ngetMainImageUrl:" + aTNativeMaterial.getMainImageUrl() + "\ngetMainImageWidth:" + aTNativeMaterial.getMainImageWidth() + "\ngetMainImageHeight:" + aTNativeMaterial.getMainImageHeight() + "\ngetVideoWidth:" + aTNativeMaterial.getVideoWidth() + "\ngetVideoHeight:" + aTNativeMaterial.getVideoHeight() + "\ngetAppPrice:" + aTNativeMaterial.getAppPrice() + "\ngetAppCommentNum:" + aTNativeMaterial.getAppCommentNum() + "\ngetCallToActionText:" + aTNativeMaterial.getCallToActionText() + "\ngetStarRating:" + aTNativeMaterial.getStarRating() + "\ngetVideoUrl:" + aTNativeMaterial.getVideoUrl() + "\ngetAdChoiceIconUrl:" + aTNativeMaterial.getAdChoiceIconUrl() + "\ngetAdFrom:" + aTNativeMaterial.getAdFrom() + "\ngetImageUrlList:" + aTNativeMaterial.getImageUrlList() + "\ngetNetworkInfoMap:" + aTNativeMaterial.getNetworkInfoMap() + "\ngetAdAppInfo:" + aTNativeMaterial.getAdAppInfo() + "\ngetNativeAdInteractionType:" + aTNativeMaterial.getNativeAdInteractionType() + "\ngetVideoDuration:" + aTNativeMaterial.getVideoDuration() + "\ngetAdvertiserName:" + aTNativeMaterial.getAdvertiserName() + "\ngetNativeType:" + aTNativeMaterial.getNativeType() + "\ngetAdType:" + aTNativeMaterial.getAdType() + "\ngetNativeCustomVideo:" + aTNativeMaterial.getNativeCustomVideo() + "\ngetAdLogo:" + aTNativeMaterial.getAdLogo() + "\ngetNativeExpressWidth:" + aTNativeMaterial.getNativeExpressWidth() + "\ngetNativeExpressHeight" + aTNativeMaterial.getNativeExpressHeight() + "\n");
        }
        str3 = OooO00o;
        str4 = "Native type: Feed";
        Log.i(str3, str4);
        Log.i(OooO00o, "show native material:\nadMaterial: " + aTNativeMaterial + "\ngetTitle:" + aTNativeMaterial.getTitle() + "\ngetDescriptionText:" + aTNativeMaterial.getDescriptionText() + "\ngetNativeType:" + aTNativeMaterial.getNativeType() + "\ngetAdMediaView:" + aTNativeMaterial.getAdMediaView(new Object[0]) + "\ngetAdIconView:" + aTNativeMaterial.getAdIconView() + "\ngetIconImageUrl:" + aTNativeMaterial.getIconImageUrl() + "\ngetMainImageUrl:" + aTNativeMaterial.getMainImageUrl() + "\ngetMainImageWidth:" + aTNativeMaterial.getMainImageWidth() + "\ngetMainImageHeight:" + aTNativeMaterial.getMainImageHeight() + "\ngetVideoWidth:" + aTNativeMaterial.getVideoWidth() + "\ngetVideoHeight:" + aTNativeMaterial.getVideoHeight() + "\ngetAppPrice:" + aTNativeMaterial.getAppPrice() + "\ngetAppCommentNum:" + aTNativeMaterial.getAppCommentNum() + "\ngetCallToActionText:" + aTNativeMaterial.getCallToActionText() + "\ngetStarRating:" + aTNativeMaterial.getStarRating() + "\ngetVideoUrl:" + aTNativeMaterial.getVideoUrl() + "\ngetAdChoiceIconUrl:" + aTNativeMaterial.getAdChoiceIconUrl() + "\ngetAdFrom:" + aTNativeMaterial.getAdFrom() + "\ngetImageUrlList:" + aTNativeMaterial.getImageUrlList() + "\ngetNetworkInfoMap:" + aTNativeMaterial.getNetworkInfoMap() + "\ngetAdAppInfo:" + aTNativeMaterial.getAdAppInfo() + "\ngetNativeAdInteractionType:" + aTNativeMaterial.getNativeAdInteractionType() + "\ngetVideoDuration:" + aTNativeMaterial.getVideoDuration() + "\ngetAdvertiserName:" + aTNativeMaterial.getAdvertiserName() + "\ngetNativeType:" + aTNativeMaterial.getNativeType() + "\ngetAdType:" + aTNativeMaterial.getAdType() + "\ngetNativeCustomVideo:" + aTNativeMaterial.getNativeCustomVideo() + "\ngetAdLogo:" + aTNativeMaterial.getAdLogo() + "\ngetNativeExpressWidth:" + aTNativeMaterial.getNativeExpressWidth() + "\ngetNativeExpressHeight" + aTNativeMaterial.getNativeExpressHeight() + "\n");
    }

    private static void OooO0Oo(Context context, ATNativeMaterial aTNativeMaterial, FrameLayout frameLayout) {
        int iOooO0O0 = OooO0O0(context, 100.0f);
        int iOooO0O02 = OooO0O0(context, 100.0f);
        View shakeView = aTNativeMaterial.getShakeView(iOooO0O0, iOooO0O02, new OooO0O0(frameLayout));
        if (shakeView == null || frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(0);
        frameLayout.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOooO0O0, iOooO0O02);
        layoutParams.gravity = 17;
        frameLayout.addView(shakeView, layoutParams);
    }

    private static void OooO0o(View view, String str) {
        view.setOnClickListener(new OooO0o(str, view));
    }

    private static void OooO0o0(Context context, ATNativeMaterial aTNativeMaterial, FrameLayout frameLayout) {
        int iOooO0O0 = OooO0O0(context, 120.0f);
        int iOooO0O02 = OooO0O0(context, 50.0f);
        View slideView = aTNativeMaterial.getSlideView(iOooO0O0, iOooO0O02, 5, new OooO0OO(frameLayout));
        if (slideView == null || frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(0);
        frameLayout.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOooO0O0, iOooO0O02 + OooO0O0(context, 50.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(slideView, layoutParams);
    }
}
