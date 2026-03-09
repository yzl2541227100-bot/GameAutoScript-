package com.octopus.p222ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.octopus.p222ad.internal.nativead.NativeAdEventListener;
import com.octopus.p222ad.internal.network.ServerResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface NativeAdResponse {

    /* JADX INFO: renamed from: com.octopus.ad.NativeAdResponse$a */
    public enum EnumC3061a {
        OCTOPUS
    }

    /* JADX INFO: renamed from: com.octopus.ad.NativeAdResponse$b */
    public enum EnumC3062b {
        CONTENT,
        APP_INSTALL
    }

    void bindUnifiedView(ViewGroup viewGroup, List<View> list, NativeAdEventListener nativeAdEventListener);

    void bindView(ViewGroup viewGroup, NativeAdEventListener nativeAdEventListener);

    void destroy();

    String getAdvertiser();

    String getButtonText();

    String getDescription();

    Bitmap getIcon();

    String getIconUrl();

    Bitmap getImage();

    String getImageUrl();

    ArrayList<String> getImageUrls();

    String getLandingPageUrl();

    Bitmap getLogo(Context context);

    ServerResponse.AdLogoInfo getLogoInfo();

    String getLogoUrl();

    EnumC3062b getNativeAdType();

    HashMap<String, Object> getNativeElements();

    List<? extends View> getNativeInfoListView();

    EnumC3061a getNetworkIdentifier();

    int getPrice();

    double getStarRating();

    String getStore();

    ArrayList<String> getTextList();

    Bitmap getTextLogo(Context context);

    ServerResponse.AdLogoInfo getTextLogoInfo();

    String getTextLogoUrl();

    String getTitle();

    ArrayList<String> getVideoUrls();

    boolean hasExpired();

    void setIcon(Bitmap bitmap);

    void setImage(Bitmap bitmap);

    void setNativeInfoListView(List<? extends View> list);

    void setTag(String str);

    void unregisterViews();
}
