package com.anythink.expressad.exoplayer.p096f;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p108l.C1746b;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.e */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class C1580e {
    private C1580e() {
    }

    /* JADX INFO: renamed from: a */
    private static void m7073a(MediaFormat mediaFormat, @Nullable C1746b c1746b) {
        if (c1746b != null) {
            m7075a(mediaFormat, "color-transfer", c1746b.f9842c);
            m7075a(mediaFormat, "color-standard", c1746b.f9840a);
            m7075a(mediaFormat, "color-range", c1746b.f9841b);
            byte[] bArr = c1746b.f9843d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7074a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7075a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7076a(MediaFormat mediaFormat, String str, String str2) {
        mediaFormat.setString(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private static void m7077a(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7078a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-".concat(String.valueOf(i)), ByteBuffer.wrap(list.get(i)));
        }
    }
}
