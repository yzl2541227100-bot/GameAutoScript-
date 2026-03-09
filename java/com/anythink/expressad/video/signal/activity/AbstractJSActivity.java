package com.anythink.expressad.video.signal.activity;

import android.content.res.Configuration;
import com.anythink.expressad.activity.ATBaseActivity;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.video.signal.InterfaceC2192a;
import com.anythink.expressad.video.signal.InterfaceC2208b;
import com.anythink.expressad.video.signal.InterfaceC2209c;
import com.anythink.expressad.video.signal.InterfaceC2306e;
import com.anythink.expressad.video.signal.InterfaceC2310g;
import com.anythink.expressad.video.signal.InterfaceC2312i;
import com.anythink.expressad.video.signal.InterfaceC2313j;
import com.anythink.expressad.video.signal.factory.C2308a;
import com.anythink.expressad.video.signal.factory.IJSFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractJSActivity extends ATBaseActivity implements IJSFactory {

    /* JADX INFO: renamed from: t */
    public static final String f13965t = "AbstractJSActivity";

    /* JADX INFO: renamed from: u */
    public IJSFactory f13966u = new C2308a();

    /* JADX INFO: renamed from: b */
    private static boolean m11624b() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m11625a(IJSFactory iJSFactory) {
        this.f13966u = iJSFactory;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2192a getActivityProxy() {
        return this.f13966u.getActivityProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2312i getIJSRewardVideoV1() {
        return this.f13966u.getIJSRewardVideoV1();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2208b getJSBTModule() {
        return this.f13966u.getJSBTModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2209c getJSCommon() {
        return this.f13966u.getJSCommon();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2306e getJSContainerModule() {
        return this.f13966u.getJSContainerModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2310g getJSNotifyProxy() {
        return this.f13966u.getJSNotifyProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public InterfaceC2313j getJSVideoModule() {
        return this.f13966u.getJSVideoModule();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (getJSCommon().mo11571g()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().mo11547g();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getJSCommon().mo11571g()) {
            getActivityProxy().mo11541a(configuration);
        }
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (getJSCommon().mo11571g()) {
            getActivityProxy().mo11539a();
        }
        getActivityProxy().mo11540a(1);
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (C1800b.f10958c) {
            return;
        }
        if (getJSCommon().mo11571g()) {
            getActivityProxy().mo11542b();
        }
        getActivityProxy().mo11540a(0);
    }
}
