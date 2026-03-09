package mobi.oneway.export.p283g;

import android.text.TextUtils;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: mobi.oneway.export.g.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3633e {
    /* JADX INFO: renamed from: a */
    public static Long m16928a(String str) {
        long value;
        if (TextUtils.isEmpty(str)) {
            value = 0;
        } else {
            CRC32 crc32 = new CRC32();
            crc32.update(str.getBytes());
            value = crc32.getValue();
        }
        return Long.valueOf(value);
    }
}
