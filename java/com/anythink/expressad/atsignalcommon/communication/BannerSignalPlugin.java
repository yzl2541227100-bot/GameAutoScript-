package com.anythink.expressad.atsignalcommon.communication;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.AbstractC1471l;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* JADX INFO: loaded from: classes.dex */
public class BannerSignalPlugin extends AbstractC1471l {

    /* JADX INFO: renamed from: a */
    private final String f6703a = "BannerSignalPlugin";

    /* JADX INFO: renamed from: b */
    private InterfaceC1457b f6704b;

    public void click(Object obj, String str) {
    }

    public void getFileInfo(Object obj, String str) {
    }

    public void getNetstat(Object obj, String str) {
    }

    public void handlerH5Exception(Object obj, String str) {
    }

    public void increaseOfferFrequence(Object obj, String str) {
    }

    public void init(Object obj, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.expressad.atsignalcommon.windvane.AbstractC1471l
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof InterfaceC1457b) {
                this.f6704b = (InterfaceC1457b) context;
            } else {
                if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof InterfaceC1457b)) {
                    return;
                }
                this.f6704b = (InterfaceC1457b) windVaneWebView.getObject();
            }
        } catch (Throwable unused) {
        }
    }

    public void install(Object obj, String str) {
    }

    public void onSignalCommunication(Object obj, String str) {
    }

    public void openURL(Object obj, String str) {
    }

    public void readyStatus(Object obj, String str) {
    }

    public void reportUrls(Object obj, String str) {
    }

    public void resetCountdown(Object obj, String str) {
    }

    public void sendImpressions(Object obj, String str) {
    }

    public void toggleCloseBtn(Object obj, String str) {
    }

    public void triggerCloseBtn(Object obj, String str) {
    }
}
