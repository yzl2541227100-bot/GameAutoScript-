package p285z2;

import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: z2.bx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3744bx {
    private C3744bx() {
    }

    public static String OooO00o(String str, String str2) {
        return OooO0O0(str, str2, C4558xx.OooOO0O);
    }

    public static String OooO0O0(String str, String str2, Charset charset) {
        return "Basic " + ByteString.encodeString(str + ":" + str2, charset).base64();
    }
}
