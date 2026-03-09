package cn.haorui.sdk.platform.p003hr;

import cn.haorui.sdk.core.AbstractC0481b;
import cn.haorui.sdk.core.C0479a;
import cn.haorui.sdk.core.utils.HRConstants;

/* JADX INFO: loaded from: classes.dex */
public class HRInitConfig extends AbstractC0481b {
    public static HRInitConfig getInstance() {
        return (HRInitConfig) C0479a.m18a(HRConstants.PLATFORM_HR).config();
    }
}
