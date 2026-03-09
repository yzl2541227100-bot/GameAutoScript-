package cn.haorui.sdk.core;

import cn.haorui.sdk.platform.PlatformFactory;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cn.haorui.sdk.core.a */
/* JADX INFO: loaded from: classes.dex */
public class C0479a {

    /* JADX INFO: renamed from: a */
    public static Map<String, InterfaceC0492e> f46a = PlatformFactory.createAll();

    /* JADX INFO: renamed from: a */
    public static InterfaceC0492e m18a(@NotNull String str) {
        return f46a.get(str);
    }
}
