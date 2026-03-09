package com.anythink.expressad.exoplayer.p094e.p095a;

import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1574m;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1560k {

    /* JADX INFO: renamed from: f */
    private static final String f8327f = "TrackEncryptionBox";

    /* JADX INFO: renamed from: a */
    public final boolean f8328a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f8329b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1574m.a f8330c;

    /* JADX INFO: renamed from: d */
    public final int f8331d;

    /* JADX INFO: renamed from: e */
    public final byte[] f8332e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1560k(boolean r5, @androidx.annotation.Nullable java.lang.String r6, int r7, byte[] r8, int r9, int r10, @androidx.annotation.Nullable byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r11 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2 = r2 ^ r3
            com.anythink.expressad.exoplayer.p107k.C1711a.m8010a(r2)
            r4.f8328a = r5
            r4.f8329b = r6
            r4.f8331d = r7
            r4.f8332e = r11
            com.anythink.expressad.exoplayer.e.m$a r5 = new com.anythink.expressad.exoplayer.e.m$a
            r7 = 2
            if (r6 != 0) goto L21
            goto L75
        L21:
            r6.hashCode()
            r11 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case 3046605: goto L4f;
                case 3046671: goto L44;
                case 3049879: goto L39;
                case 3049895: goto L2e;
                default: goto L2c;
            }
        L2c:
            r0 = -1
            goto L58
        L2e:
            java.lang.String r0 = "cens"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L37
            goto L2c
        L37:
            r0 = 3
            goto L58
        L39:
            java.lang.String r0 = "cenc"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L42
            goto L2c
        L42:
            r0 = 2
            goto L58
        L44:
            java.lang.String r0 = "cbcs"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L4d
            goto L2c
        L4d:
            r0 = 1
            goto L58
        L4f:
            java.lang.String r2 = "cbc1"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L58
            goto L2c
        L58:
            switch(r0) {
                case 0: goto L74;
                case 1: goto L74;
                case 2: goto L75;
                case 3: goto L75;
                default: goto L5b;
            }
        L5b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.<init>(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L75
        L74:
            r1 = 2
        L75:
            r5.<init>(r1, r8, r9, r10)
            r4.f8330c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p094e.p095a.C1560k.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    private static int m6949a(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C1500b.f7465be)) {
                    b = 0;
                }
                break;
            case 3046671:
                if (str.equals(C1500b.f7467bg)) {
                    b = 1;
                }
                break;
            case 3049879:
                if (str.equals(C1500b.f7464bd)) {
                    b = 2;
                }
                break;
            case 3049895:
                if (str.equals(C1500b.f7466bf)) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(f8327f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
