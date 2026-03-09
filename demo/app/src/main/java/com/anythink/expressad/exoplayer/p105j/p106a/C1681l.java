package com.anythink.expressad.exoplayer.p105j.p106a;

import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1681l implements InterfaceC1678i {

    /* JADX INFO: renamed from: b */
    public static final C1681l f9349b = new C1681l(Collections.emptyMap());

    /* JADX INFO: renamed from: c */
    private static final int f9350c = 10485760;

    /* JADX INFO: renamed from: d */
    private int f9351d;

    /* JADX INFO: renamed from: e */
    private final Map<String, byte[]> f9352e;

    private C1681l(Map<String, byte[]> map) {
        this.f9352e = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public static C1681l m7809a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0 || i3 > 10485760) {
                throw new IOException("Invalid value size: ".concat(String.valueOf(i3)));
            }
            byte[] bArr = new byte[i3];
            dataInputStream.readFully(bArr);
            map.put(utf, bArr);
        }
        return new C1681l(map);
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, byte[]> m7810a(Map<String, byte[]> map, C1680k c1680k) {
        HashMap map2 = new HashMap(map);
        m7811a((HashMap<String, byte[]>) map2, c1680k.m7807a());
        m7812a((HashMap<String, byte[]>) map2, c1680k.m7808b());
        return map2;
    }

    /* JADX INFO: renamed from: a */
    private static void m7811a(HashMap<String, byte[]> map, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            map.remove(list.get(i));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7812a(HashMap<String, byte[]> map, Map<String, Object> map2) {
        byte[] bytes;
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
            } else if (obj instanceof String) {
                bytes = ((String) obj).getBytes(Charset.forName("UTF-8"));
            } else {
                if (!(obj instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) obj;
            }
            if (bytes.length > 10485760) {
                throw new IllegalArgumentException(String.format("The size of %s (%d) is greater than maximum allowed: %d", str, Integer.valueOf(bytes.length), 10485760));
            }
            map.put(str, bytes);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m7813a(Map<String, byte[]> map) {
        if (this.f9352e.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : this.f9352e.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m7814a(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName("UTF-8"));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1678i
    /* JADX INFO: renamed from: a */
    public final long mo7792a(String str) {
        if (this.f9352e.containsKey(str)) {
            return ByteBuffer.wrap(this.f9352e.get(str)).getLong();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    public final C1681l m7815a(C1680k c1680k) {
        HashMap map = new HashMap(this.f9352e);
        m7811a((HashMap<String, byte[]>) map, c1680k.m7807a());
        m7812a((HashMap<String, byte[]>) map, c1680k.m7808b());
        return m7813a((Map<String, byte[]>) map) ? this : new C1681l(map);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1678i
    /* JADX INFO: renamed from: a */
    public final String mo7793a(String str, String str2) {
        return this.f9352e.containsKey(str) ? new String(this.f9352e.get(str), Charset.forName("UTF-8")) : str2;
    }

    /* JADX INFO: renamed from: a */
    public final void m7816a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.f9352e.size());
        for (Map.Entry<String, byte[]> entry : this.f9352e.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1678i
    /* JADX INFO: renamed from: a */
    public final byte[] mo7794a(String str, byte[] bArr) {
        if (!this.f9352e.containsKey(str)) {
            return bArr;
        }
        byte[] bArr2 = this.f9352e.get(str);
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1678i
    /* JADX INFO: renamed from: b */
    public final boolean mo7795b(String str) {
        return this.f9352e.containsKey(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1681l.class != obj.getClass()) {
            return false;
        }
        return m7813a(((C1681l) obj).f9352e);
    }

    public final int hashCode() {
        if (this.f9351d == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f9352e.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f9351d = iHashCode;
        }
        return this.f9351d;
    }
}
