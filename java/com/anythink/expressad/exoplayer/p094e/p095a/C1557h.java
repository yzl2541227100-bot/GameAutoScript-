package com.anythink.expressad.exoplayer.p094e.p095a;

import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1557h {

    /* JADX INFO: renamed from: a */
    private static final String f8308a = "PsshAtomUtil";

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final UUID f8309a;

        /* JADX INFO: renamed from: b */
        private final int f8310b;

        /* JADX INFO: renamed from: c */
        private final byte[] f8311c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f8309a = uuid;
            this.f8310b = i;
            this.f8311c = bArr;
        }
    }

    private C1557h() {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static UUID m6935a(byte[] bArr) {
        a aVarM6940c = m6940c(bArr);
        if (aVarM6940c == null) {
            return null;
        }
        return aVarM6940c.f8309a;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m6936a(UUID uuid, @Nullable byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(AbstractC1550a.f8062Z);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m6937a(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        boolean z = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int length2 = length + 32;
        if (z) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(AbstractC1550a.f8062Z);
        byteBufferAllocate.putInt(z ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (z) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static byte[] m6938a(byte[] bArr, UUID uuid) {
        a aVarM6940c = m6940c(bArr);
        if (aVarM6940c == null) {
            return null;
        }
        if (uuid == null || uuid.equals(aVarM6940c.f8309a)) {
            return aVarM6940c.f8311c;
        }
        Log.w(f8308a, "UUID mismatch. Expected: " + uuid + ", got: " + aVarM6940c.f8309a + ".");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m6939b(byte[] bArr) {
        a aVarM6940c = m6940c(bArr);
        if (aVarM6940c == null) {
            return -1;
        }
        return aVarM6940c.f8310b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    private static a m6940c(byte[] bArr) {
        C1736s c1736s = new C1736s(bArr);
        if (c1736s.m8269b() < 32) {
            return null;
        }
        c1736s.m8272c(0);
        if (c1736s.m8280i() != c1736s.m8265a() + 4 || c1736s.m8280i() != AbstractC1550a.f8062Z) {
            return null;
        }
        int iM6823a = AbstractC1550a.m6823a(c1736s.m8280i());
        if (iM6823a > 1) {
            Log.w(f8308a, "Unsupported pssh version: ".concat(String.valueOf(iM6823a)));
            return null;
        }
        UUID uuid = new UUID(c1736s.m8281j(), c1736s.m8281j());
        if (iM6823a == 1) {
            c1736s.m8274d(c1736s.m8284m() * 16);
        }
        int iM8284m = c1736s.m8284m();
        if (iM8284m != c1736s.m8265a()) {
            return null;
        }
        byte[] bArr2 = new byte[iM8284m];
        c1736s.m8268a(bArr2, 0, iM8284m);
        return new a(uuid, iM6823a, bArr2);
    }
}
