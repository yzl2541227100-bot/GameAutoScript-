package com.anythink.core.api;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.basead.p044b.C1120b;
import com.anythink.core.common.p051b.InterfaceC1173l;
import com.anythink.core.common.p055f.C1243h;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAd implements IATThirdPartyMaterial {
    public abstract void clear(View view);

    public abstract void destroy();

    public abstract ViewGroup getCustomAdContainer();

    public abstract C1243h getDetail();

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public abstract Map<String, Object> getNetworkInfoMap();

    public abstract void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams);

    public abstract void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams, C1120b c1120b);

    public abstract void setNativeEventListener(InterfaceC1173l interfaceC1173l);

    public abstract void setNetworkInfoMap(Map<String, Object> map);

    public abstract void setTrackingInfo(C1243h c1243h);

    public abstract void setVideoMute(boolean z);
}
