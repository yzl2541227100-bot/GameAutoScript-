package cn.haorui.sdk.platform;

import android.content.Context;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.AbstractC0497b;
import cn.haorui.sdk.core.loader.C0509e;
import cn.haorui.sdk.core.loader.IAdLoadListener;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.loader.cache.InterfaceC0501c;
import cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePlatformLoader<Loader extends AbstractC0497b, LoaderListener extends IAdLoadListener> implements InterfaceC0508d<Loader> {
    public Loader adLoader;
    private InterfaceC0501c cacheAdListener;
    public IConCurrentLoadListener conCurrentListener;
    public Context context;
    private int groupIndex;
    public LoaderListener loadListener;
    public InterfaceC0508d next;
    public SdkAdInfo sdkAdInfo;
    public Map<String, Object> localParams = new HashMap();
    private int index = -1;

    public BasePlatformLoader(Loader loader, SdkAdInfo sdkAdInfo) {
        this.adLoader = loader;
        this.sdkAdInfo = sdkAdInfo;
        this.context = loader.getContext();
        this.loadListener = (LoaderListener) C0509e.m41a(this, loader.getLoaderListener());
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public void destroy() {
    }

    public Loader getAdLoader() {
        return this.adLoader;
    }

    @Override // cn.haorui.sdk.core.loader.InterfaceC0508d
    public InterfaceC0501c getCacheAdListener() {
        return this.cacheAdListener;
    }

    @Override // cn.haorui.sdk.core.loader.InterfaceC0508d
    public IConCurrentLoadListener getConCurrentListener() {
        return this.conCurrentListener;
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public Context getContext() {
        return this.context;
    }

    public int getGroupIndex() {
        return this.groupIndex;
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public LoaderListener getLoaderListener() {
        return this.loadListener;
    }

    public Map<String, Object> getLocalParams() {
        return this.localParams;
    }

    @Override // cn.haorui.sdk.core.loader.InterfaceC0508d
    public SdkAdInfo getSdkAdInfo() {
        return this.sdkAdInfo;
    }

    @Override // cn.haorui.sdk.core.loader.InterfaceC0508d
    public int getTag() {
        return this.index;
    }

    public InterfaceC0508d next() {
        return this.next;
    }

    @Override // cn.haorui.sdk.core.loader.InterfaceC0508d
    public void setCacheAdListener(InterfaceC0501c interfaceC0501c) {
        this.cacheAdListener = interfaceC0501c;
    }

    @Override // cn.haorui.sdk.core.loader.InterfaceC0508d
    public void setConCurrentLoadListener(IConCurrentLoadListener iConCurrentLoadListener) {
        this.conCurrentListener = iConCurrentLoadListener;
    }

    @Override // cn.haorui.sdk.core.loader.InterfaceC0508d
    public void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    @Override // cn.haorui.sdk.core.loader.InterfaceC0508d
    public void setLocalParams(Map<String, Object> map) {
        this.localParams = map;
    }

    public void setNext(InterfaceC0508d interfaceC0508d) {
        this.next = interfaceC0508d;
    }

    @Override // cn.haorui.sdk.core.loader.InterfaceC0508d
    public void setTag(int i) {
        this.index = i;
    }
}
