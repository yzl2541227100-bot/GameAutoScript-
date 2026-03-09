package com.anythink.basead.p025ui.animplayerview.redpacket;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.anythink.core.common.p066o.C1345i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class RedPacketView extends View {
    public static final String TAG = "RedPacketView";

    /* JADX INFO: renamed from: a */
    private static final double f1876a = 0.15d;

    /* JADX INFO: renamed from: b */
    private static final double f1877b = 0.2d;

    /* JADX INFO: renamed from: c */
    private static final int f1878c = 400;

    /* JADX INFO: renamed from: d */
    private final Matrix f1879d;

    /* JADX INFO: renamed from: e */
    private final List<C0977a> f1880e;

    /* JADX INFO: renamed from: f */
    private final Map<Integer, Float> f1881f;

    /* JADX INFO: renamed from: g */
    private List<Integer> f1882g;

    /* JADX INFO: renamed from: h */
    private Paint f1883h;

    /* JADX INFO: renamed from: i */
    private int f1884i;

    /* JADX INFO: renamed from: j */
    private int f1885j;

    /* JADX INFO: renamed from: k */
    private int f1886k;

    /* JADX INFO: renamed from: l */
    private int f1887l;

    /* JADX INFO: renamed from: m */
    private int f1888m;

    /* JADX INFO: renamed from: n */
    private Bitmap f1889n;

    /* JADX INFO: renamed from: o */
    private boolean f1890o;

    public RedPacketView(Context context) {
        this(context, null);
    }

    public RedPacketView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedPacketView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1879d = new Matrix();
        this.f1880e = new ArrayList();
        this.f1881f = new HashMap();
        Paint paint = new Paint();
        this.f1883h = paint;
        paint.setFilterBitmap(true);
        this.f1883h.setDither(true);
        this.f1883h.setAntiAlias(true);
        setLayerType(2, null);
    }

    /* JADX INFO: renamed from: a */
    private static int m1120a(int i) {
        int i2 = i % 4;
        return i2 == 0 ? (i / 4) * 9 : i2 == 1 ? ((i / 4) * 9) + 2 : i2 == 2 ? ((i / 4) * 9) + 4 : i2 == 3 ? ((i / 4) * 9) + 8 : i2;
    }

    /* JADX INFO: renamed from: a */
    private void m1121a() {
        Paint paint = new Paint();
        this.f1883h = paint;
        paint.setFilterBitmap(true);
        this.f1883h.setDither(true);
        this.f1883h.setAntiAlias(true);
        setLayerType(2, null);
    }

    /* JADX INFO: renamed from: a */
    private void m1122a(Bitmap bitmap) {
        int height = (int) (((double) this.f1888m) / (((((double) this.f1887l) * f1877b) * ((double) bitmap.getHeight())) / ((double) bitmap.getWidth())));
        this.f1886k = height;
        this.f1885j = 3;
        this.f1884i = ((height * 3) * 4) / 9;
    }

    /* JADX INFO: renamed from: a */
    private void m1123a(Canvas canvas) {
        C0977a next;
        Bitmap bitmapM1130c;
        Iterator<C0977a> it = this.f1880e.iterator();
        while (it.hasNext() && (bitmapM1130c = (next = it.next()).m1130c()) != null) {
            this.f1879d.setTranslate((-next.m1129b()) >> 1, (-next.m1128a()) >> 1);
            this.f1879d.postRotate(next.m1132e());
            this.f1879d.postTranslate((next.m1129b() >> 1) + next.f1891a, (next.m1128a() >> 1) + next.f1892b);
            canvas.drawBitmap(bitmapM1130c, this.f1879d, this.f1883h);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1124a(C0977a c0977a, int i) {
        Float f;
        if (c0977a.m1129b() <= 0 || c0977a.m1128a() <= 0) {
            return;
        }
        int i2 = i % 4;
        if (i2 == 0) {
            i2 = (i / 4) * 9;
        } else if (i2 == 1) {
            i2 = ((i / 4) * 9) + 2;
        } else if (i2 == 2) {
            i2 = ((i / 4) * 9) + 4;
        } else if (i2 == 3) {
            i2 = ((i / 4) * 9) + 8;
        }
        int i3 = this.f1885j;
        int i4 = i2 / i3;
        int i5 = i2 % i3;
        int i6 = this.f1887l / i3;
        int i7 = this.f1888m / this.f1886k;
        int iM1129b = c0977a.m1129b();
        int iM1128a = c0977a.m1128a();
        c0977a.f1891a = (i5 * i6) + ((i6 - iM1129b) >> 1);
        int iNextInt = new Random().nextInt(21) - 10;
        int i8 = iM1128a / 3;
        int iNextInt2 = new Random().nextInt(i8) + i8;
        if (i4 > 0 && (f = this.f1881f.get(Integer.valueOf(i2 - this.f1885j))) != null) {
            float fFloatValue = f.floatValue() + iNextInt2 + iNextInt;
            c0977a.f1892b = fFloatValue;
            if ((this.f1888m - fFloatValue) - m1125b() < iM1128a) {
                if (this.f1882g == null) {
                    this.f1882g = new ArrayList();
                }
                this.f1882g.add(Integer.valueOf(i));
            }
        }
        if (c0977a.f1892b == 0.0f) {
            c0977a.f1892b = (i4 * i7) + iNextInt2 + iNextInt;
        }
        float f2 = iM1128a;
        if (c0977a.f1892b + f2 > this.f1888m) {
            c0977a.f1892b = (r3 - iM1128a) - m1125b();
        }
        if (c0977a.f1892b < 0.0f) {
            c0977a.f1892b = iM1128a >> 1;
        }
        this.f1881f.put(Integer.valueOf(i2), Float.valueOf(c0977a.f1892b + f2));
    }

    /* JADX INFO: renamed from: b */
    private int m1125b() {
        return C1345i.m4153a(getContext(), 5.0f);
    }

    /* JADX INFO: renamed from: b */
    private C0977a m1126b(Bitmap bitmap) {
        return new C0977a(getContext(), bitmap, this.f1887l);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:7:0x000e, B:8:0x0024, B:10:0x0028, B:12:0x002e, B:15:0x005b, B:16:0x0061, B:18:0x0065, B:20:0x0078, B:23:0x0080, B:25:0x0084, B:33:0x00a3, B:35:0x00de, B:37:0x00ee, B:39:0x0109, B:41:0x010d, B:42:0x0114, B:43:0x011d, B:45:0x0124, B:46:0x012b, B:48:0x0136, B:49:0x013f, B:51:0x0145, B:52:0x014a, B:28:0x008c, B:30:0x0094, B:32:0x009d, B:53:0x015a, B:54:0x0163, B:56:0x0167, B:58:0x016d, B:59:0x0173, B:61:0x0179, B:63:0x0185, B:65:0x018d, B:67:0x0197, B:68:0x019a), top: B:75:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:7:0x000e, B:8:0x0024, B:10:0x0028, B:12:0x002e, B:15:0x005b, B:16:0x0061, B:18:0x0065, B:20:0x0078, B:23:0x0080, B:25:0x0084, B:33:0x00a3, B:35:0x00de, B:37:0x00ee, B:39:0x0109, B:41:0x010d, B:42:0x0114, B:43:0x011d, B:45:0x0124, B:46:0x012b, B:48:0x0136, B:49:0x013f, B:51:0x0145, B:52:0x014a, B:28:0x008c, B:30:0x0094, B:32:0x009d, B:53:0x015a, B:54:0x0163, B:56:0x0167, B:58:0x016d, B:59:0x0173, B:61:0x0179, B:63:0x0185, B:65:0x018d, B:67:0x0197, B:68:0x019a), top: B:75:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initRedPacketList(android.graphics.Bitmap r13) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.animplayerview.redpacket.RedPacketView.initRedPacketList(android.graphics.Bitmap):void");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C0977a next;
        Bitmap bitmapM1130c;
        super.onDraw(canvas);
        Iterator<C0977a> it = this.f1880e.iterator();
        while (it.hasNext() && (bitmapM1130c = (next = it.next()).m1130c()) != null) {
            this.f1879d.setTranslate((-next.m1129b()) >> 1, (-next.m1128a()) >> 1);
            this.f1879d.postRotate(next.m1132e());
            this.f1879d.postTranslate((next.m1129b() >> 1) + next.f1891a, (next.m1128a() >> 1) + next.f1892b);
            canvas.drawBitmap(bitmapM1130c, this.f1879d, this.f1883h);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1887l = getMeasuredWidth();
        this.f1888m = getMeasuredHeight();
    }

    public void release() {
        this.f1890o = false;
        try {
            Bitmap bitmap = this.f1889n;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f1889n.recycle();
            }
            Iterator<C0977a> it = this.f1880e.iterator();
            while (it.hasNext()) {
                it.next().m1131d();
            }
            this.f1880e.clear();
            Map<Integer, Float> map = this.f1881f;
            if (map != null) {
                map.clear();
            }
            List<Integer> list = this.f1882g;
            if (list != null) {
                list.clear();
            }
        } catch (Exception e) {
            Log.e(TAG, "release failed: " + e.getMessage());
        }
    }
}
