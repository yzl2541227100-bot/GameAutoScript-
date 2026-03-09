package com.umeng.commonsdk.proguard;

import androidx.core.app.FrameMetricsAggregator;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ab */
/* JADX INFO: loaded from: classes2.dex */
public final class C3410ab {

    /* JADX INFO: renamed from: a */
    private static final Comparator f18665a = new a();

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ab$a */
    public static class a implements Comparator {
        private a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            return obj instanceof List ? C3410ab.m15707a((List) obj, (List) obj2) : obj instanceof Set ? C3410ab.m15709a((Set) obj, (Set) obj2) : obj instanceof Map ? C3410ab.m15708a((Map) obj, (Map) obj2) : obj instanceof byte[] ? C3410ab.m15712a((byte[]) obj, (byte[]) obj2) : C3410ab.m15703a((Comparable) obj, (Comparable) obj2);
        }
    }

    private C3410ab() {
    }

    /* JADX INFO: renamed from: a */
    public static int m15699a(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b2 < b ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m15700a(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        return d2 < d ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m15701a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m15702a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m15703a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: a */
    public static int m15704a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return m15703a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return m15707a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return m15709a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return m15708a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return m15712a((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    /* JADX INFO: renamed from: a */
    public static int m15705a(String str, String str2) {
        return str.compareTo(str2);
    }

    /* JADX INFO: renamed from: a */
    public static int m15706a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iRemaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i, iRemaining);
        return iRemaining;
    }

    /* JADX INFO: renamed from: a */
    public static int m15707a(List list, List list2) {
        int iM15701a = m15701a(list.size(), list2.size());
        if (iM15701a != 0) {
            return iM15701a;
        }
        for (int i = 0; i < list.size(); i++) {
            int iCompare = f18665a.compare(list.get(i), list2.get(i));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m15708a(Map map, Map map2) {
        int iM15701a = m15701a(map.size(), map2.size());
        if (iM15701a != 0) {
            return iM15701a;
        }
        Comparator comparator = f18665a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f18665a;
            int iCompare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m15709a(Set set, Set set2) {
        int iM15701a = m15701a(set.size(), set2.size());
        if (iM15701a != 0) {
            return iM15701a;
        }
        Comparator comparator = f18665a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f18665a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m15710a(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m15711a(boolean z, boolean z3) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z3));
    }

    /* JADX INFO: renamed from: a */
    public static int m15712a(byte[] bArr, byte[] bArr2) {
        int iM15701a = m15701a(bArr.length, bArr2.length);
        if (iM15701a != 0) {
            return iM15701a;
        }
        for (int i = 0; i < bArr.length; i++) {
            int iM15699a = m15699a(bArr[i], bArr2[i]);
            if (iM15699a != 0) {
                return iM15699a;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static String m15713a(byte b) {
        return Integer.toHexString((b | 256) & FrameMetricsAggregator.EVERY_DURATION).toUpperCase().substring(1);
    }

    /* JADX INFO: renamed from: a */
    public static void m15714a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iPosition = byteBuffer.position() + iArrayOffset;
        int iLimit = iArrayOffset + byteBuffer.limit();
        int i = iLimit - iPosition > 128 ? iPosition + 128 : iLimit;
        for (int i2 = iPosition; i2 < i; i2++) {
            if (i2 > iPosition) {
                sb.append(C4196o4.OooO00o.OooO0Oo);
            }
            sb.append(m15713a(bArrArray[i2]));
        }
        if (iLimit != i) {
            sb.append("...");
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m15715a(ByteBuffer byteBuffer) {
        if (m15717b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m15706a(byteBuffer, bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m15716a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15717b(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* JADX INFO: renamed from: c */
    public static ByteBuffer m15718c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return m15717b(byteBuffer) ? byteBuffer : ByteBuffer.wrap(m15715a(byteBuffer));
    }

    /* JADX INFO: renamed from: d */
    public static ByteBuffer m15719d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBufferWrap.array(), 0, byteBuffer.remaining());
        } else {
            byteBuffer.slice().get(byteBufferWrap.array());
        }
        return byteBufferWrap;
    }
}
