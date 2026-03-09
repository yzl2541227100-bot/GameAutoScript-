package cn.haorui.sdk.core.loader;

import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.AbstractC0497b;
import cn.haorui.sdk.core.loader.cache.InterfaceC0501c;
import cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener;
import java.util.Map;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0508d<Loader extends AbstractC0497b> extends IAdLoader {
    InterfaceC0501c getCacheAdListener();

    IConCurrentLoadListener getConCurrentListener();

    SdkAdInfo getSdkAdInfo();

    int getTag();

    void setCacheAdListener(InterfaceC0501c interfaceC0501c);

    void setConCurrentLoadListener(IConCurrentLoadListener iConCurrentLoadListener);

    void setGroupIndex(int i);

    void setLocalParams(Map<String, Object> map);

    void setTag(int i);
}
