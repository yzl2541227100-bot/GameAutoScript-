package cn.haorui.sdk.core.view.gif;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: cn.haorui.sdk.core.view.gif.a */
/* JADX INFO: loaded from: classes.dex */
public class C0586a {

    /* JADX INFO: renamed from: y */
    public static final String f291y = "a";

    /* JADX INFO: renamed from: a */
    public int[] f292a;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f294c;

    /* JADX INFO: renamed from: d */
    public byte[] f295d;

    /* JADX INFO: renamed from: e */
    public byte[] f296e;

    /* JADX INFO: renamed from: h */
    public GifHeaderParser f299h;

    /* JADX INFO: renamed from: i */
    public short[] f300i;

    /* JADX INFO: renamed from: j */
    public byte[] f301j;

    /* JADX INFO: renamed from: k */
    public byte[] f302k;

    /* JADX INFO: renamed from: l */
    public byte[] f303l;

    /* JADX INFO: renamed from: m */
    public int[] f304m;

    /* JADX INFO: renamed from: n */
    public int f305n;

    /* JADX INFO: renamed from: o */
    public int f306o;

    /* JADX INFO: renamed from: q */
    public a f308q;

    /* JADX INFO: renamed from: r */
    public Bitmap f309r;

    /* JADX INFO: renamed from: s */
    public boolean f310s;

    /* JADX INFO: renamed from: t */
    public int f311t;

    /* JADX INFO: renamed from: u */
    public int f312u;

    /* JADX INFO: renamed from: v */
    public int f313v;

    /* JADX INFO: renamed from: w */
    public int f314w;

    /* JADX INFO: renamed from: x */
    public boolean f315x;

    /* JADX INFO: renamed from: b */
    public final int[] f293b = new int[256];

    /* JADX INFO: renamed from: f */
    public int f297f = 0;

    /* JADX INFO: renamed from: g */
    public int f298g = 0;

    /* JADX INFO: renamed from: p */
    public GifHeader f307p = new GifHeader();

    /* JADX INFO: renamed from: cn.haorui.sdk.core.view.gif.a$a */
    public interface a {
    }

    public C0586a(a aVar) {
        this.f308q = aVar;
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m93a(int i, byte[] bArr) {
        if (this.f299h == null) {
            this.f299h = new GifHeaderParser();
        }
        GifHeader header = this.f299h.setData(bArr).parseHeader();
        this.f307p = header;
        if (bArr != null) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            synchronized (this) {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f311t = 0;
                this.f307p = header;
                this.f315x = false;
                this.f305n = -1;
                this.f306o = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferWrap.asReadOnlyBuffer();
                this.f294c = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f294c.order(ByteOrder.LITTLE_ENDIAN);
                this.f310s = false;
                Iterator<C0587b> it = header.frames.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().f322g == 3) {
                        this.f310s = true;
                        break;
                    }
                }
                this.f312u = iHighestOneBit;
                int i2 = header.width;
                this.f314w = i2 / iHighestOneBit;
                int i3 = header.height;
                this.f313v = i3 / iHighestOneBit;
                ((C0588c) this.f308q).getClass();
                this.f303l = new byte[i2 * i3];
                a aVar = this.f308q;
                int i4 = this.f314w * this.f313v;
                ((C0588c) aVar).getClass();
                this.f304m = new int[i4];
            }
        }
        return this.f311t;
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m94a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            a aVar = this.f308q;
            int i = this.f314w;
            int i2 = this.f313v;
            ((C0588c) aVar).getClass();
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
            if (bitmapCreateBitmap != null && Build.VERSION.SDK_INT >= 12) {
                bitmapCreateBitmap.setHasAlpha(true);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: a */
    public final void m95a(int[] iArr, C0587b c0587b, int i) {
        int i2 = c0587b.f319d;
        int i3 = this.f312u;
        int i4 = i2 / i3;
        int i5 = c0587b.f317b / i3;
        int i6 = c0587b.f318c / i3;
        int i7 = c0587b.f316a / i3;
        int i8 = this.f314w;
        int i9 = (i5 * i8) + i7;
        int i10 = (i4 * i8) + i9;
        while (i9 < i10) {
            int i11 = i9 + i6;
            for (int i12 = i9; i12 < i11; i12++) {
                iArr[i12] = i;
            }
            i9 += this.f314w;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v35, types: [short] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX INFO: renamed from: b */
    public synchronized Bitmap m96b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        short s;
        int i10;
        int i11;
        int i12;
        if (this.f307p.frameCount <= 0 || this.f305n < 0) {
            String str = f291y;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "unable to decode frame, frameCount=" + this.f307p.frameCount + " framePointer=" + this.f305n);
            }
            this.f311t = 1;
        }
        int i13 = this.f311t;
        if (i13 != 1 && i13 != 2) {
            int i14 = 0;
            this.f311t = 0;
            C0587b c0587b = this.f307p.frames.get(this.f305n);
            int i15 = this.f305n - 1;
            C0587b c0587b2 = i15 >= 0 ? this.f307p.frames.get(i15) : null;
            int[] iArr = c0587b.f326k;
            if (iArr == null) {
                iArr = this.f307p.gct;
            }
            this.f292a = iArr;
            if (iArr == null) {
                String str2 = f291y;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No Valid Color Table for frame #" + this.f305n);
                }
                this.f311t = 1;
                return null;
            }
            if (c0587b.f321f) {
                System.arraycopy(iArr, 0, this.f293b, 0, iArr.length);
                int[] iArr2 = this.f293b;
                this.f292a = iArr2;
                iArr2[c0587b.f323h] = 0;
            }
            int[] iArr3 = this.f304m;
            if (c0587b2 == null) {
                Arrays.fill(iArr3, 0);
            }
            if (c0587b2 != null && (i11 = c0587b2.f322g) > 0) {
                if (i11 == 2) {
                    if (!c0587b.f321f) {
                        GifHeader gifHeader = this.f307p;
                        i12 = gifHeader.bgColor;
                        if (c0587b.f326k != null && gifHeader.bgIndex == c0587b.f323h) {
                        }
                        m95a(iArr3, c0587b2, i12);
                    } else if (this.f305n == 0) {
                        this.f315x = true;
                    }
                    i12 = 0;
                    m95a(iArr3, c0587b2, i12);
                } else if (i11 == 3) {
                    Bitmap bitmap = this.f309r;
                    if (bitmap == null) {
                        m95a(iArr3, c0587b2, 0);
                    } else {
                        int i16 = c0587b2.f319d;
                        int i17 = this.f312u;
                        int i18 = c0587b2.f317b / i17;
                        int i19 = c0587b2.f318c / i17;
                        int i20 = c0587b2.f316a / i17;
                        int i21 = this.f314w;
                        bitmap.getPixels(iArr3, (i18 * i21) + i20, i21, i20, i18, i19, i16 / i17);
                    }
                }
            }
            this.f297f = 0;
            this.f298g = 0;
            this.f294c.position(c0587b.f325j);
            int i22 = c0587b.f319d * c0587b.f318c;
            byte[] bArr = this.f303l;
            if (bArr == null || bArr.length < i22) {
                ((C0588c) this.f308q).getClass();
                this.f303l = new byte[i22];
            }
            if (this.f300i == null) {
                this.f300i = new short[4096];
            }
            if (this.f301j == null) {
                this.f301j = new byte[4096];
            }
            if (this.f302k == null) {
                this.f302k = new byte[4097];
            }
            int iM97c = m97c();
            int i23 = 1 << iM97c;
            int i24 = i23 + 1;
            int i25 = i23 + 2;
            int i26 = iM97c + 1;
            int i27 = (1 << i26) - 1;
            for (int i28 = 0; i28 < i23; i28++) {
                this.f300i[i28] = 0;
                this.f301j[i28] = (byte) i28;
            }
            int i29 = i25;
            int i30 = i26;
            int i31 = i27;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            int i38 = -1;
            int i39 = 0;
            int i40 = 0;
            while (true) {
                if (i33 >= i22) {
                    break;
                }
                if (i32 == 0) {
                    int iM97c2 = m97c();
                    if (iM97c2 > 0) {
                        try {
                            if (this.f295d == null) {
                                ((C0588c) this.f308q).getClass();
                                this.f295d = new byte[255];
                            }
                            int i41 = this.f297f;
                            int i42 = this.f298g;
                            int i43 = i41 - i42;
                            if (i43 >= iM97c2) {
                                System.arraycopy(this.f296e, i42, this.f295d, i14, iM97c2);
                                i10 = this.f298g + iM97c2;
                            } else if (this.f294c.remaining() + i43 >= iM97c2) {
                                System.arraycopy(this.f296e, this.f298g, this.f295d, i14, i43);
                                this.f298g = this.f297f;
                                m98d();
                                int i44 = iM97c2 - i43;
                                System.arraycopy(this.f296e, i14, this.f295d, i43, i44);
                                i10 = this.f298g + i44;
                            } else {
                                this.f311t = 1;
                            }
                            this.f298g = i10;
                        } catch (Exception e) {
                            Log.w(f291y, "Error Reading Block", e);
                            this.f311t = 1;
                        }
                    }
                    if (iM97c2 <= 0) {
                        this.f311t = 3;
                        break;
                    }
                    i32 = iM97c2;
                    i34 = 0;
                }
                i36 += (this.f295d[i34] & 255) << i35;
                i34++;
                i32--;
                int i45 = i35 + 8;
                int i46 = i38;
                int i47 = i39;
                int i48 = i29;
                int i49 = i30;
                while (true) {
                    i8 = i32;
                    if (i45 < i49) {
                        i35 = i45;
                        i39 = i47;
                        i30 = i49;
                        i29 = i48;
                        i14 = 0;
                        i38 = i46;
                        break;
                    }
                    int i50 = i36 & i31;
                    i36 >>= i49;
                    i45 -= i49;
                    if (i50 == i23) {
                        i48 = i25;
                        i49 = i26;
                        i31 = i27;
                        i32 = i8;
                        i46 = -1;
                    } else {
                        if (i50 > i48) {
                            i9 = i45;
                            this.f311t = 3;
                            break;
                        }
                        i9 = i45;
                        if (i50 == i24) {
                            break;
                        }
                        if (i46 == -1) {
                            this.f302k[i40] = this.f301j[i50];
                            i46 = i50;
                            i40++;
                            i45 = i9;
                            i47 = i46;
                            i32 = i8;
                        } else {
                            if (i50 >= i48) {
                                this.f302k[i40] = (byte) i47;
                                s = i46;
                                i40++;
                            } else {
                                s = i50;
                            }
                            while (s >= i23) {
                                this.f302k[i40] = this.f301j[s];
                                s = this.f300i[s];
                                i40++;
                                i50 = i50;
                            }
                            int i51 = i50;
                            byte[] bArr2 = this.f301j;
                            int i52 = bArr2[s] & 255;
                            int i53 = i40 + 1;
                            int i54 = i23;
                            byte b = (byte) i52;
                            this.f302k[i40] = b;
                            if (i48 < 4096) {
                                this.f300i[i48] = (short) i46;
                                bArr2[i48] = b;
                                i48++;
                                if ((i48 & i31) == 0 && i48 < 4096) {
                                    i49++;
                                    i31 += i48;
                                }
                            }
                            i40 = i53;
                            while (i40 > 0) {
                                i40--;
                                this.f303l[i37] = this.f302k[i40];
                                i33++;
                                i37++;
                            }
                            i47 = i52;
                            i32 = i8;
                            i45 = i9;
                            i46 = i51;
                            i23 = i54;
                        }
                    }
                }
                i30 = i49;
                i29 = i48;
                i32 = i8;
                i35 = i9;
                i14 = 0;
                i38 = i46;
                i39 = i47;
            }
            for (int i55 = i37; i55 < i22; i55++) {
                this.f303l[i55] = 0;
            }
            int i56 = c0587b.f319d;
            int i57 = this.f312u;
            int i58 = i56 / i57;
            int i59 = c0587b.f317b / i57;
            int i60 = c0587b.f318c / i57;
            int i61 = c0587b.f316a / i57;
            boolean z = this.f305n == 0;
            int i62 = 0;
            int i63 = 1;
            int i64 = 0;
            int i65 = 8;
            while (i64 < i58) {
                if (c0587b.f320e) {
                    if (i62 >= i58) {
                        i63++;
                        if (i63 == 2) {
                            i62 = 4;
                        } else if (i63 == 3) {
                            i62 = 2;
                            i65 = 4;
                        } else if (i63 == 4) {
                            i62 = 1;
                            i65 = 2;
                        }
                    }
                    i2 = i62 + i65;
                } else {
                    i2 = i62;
                    i62 = i64;
                }
                int i66 = i62 + i59;
                if (i66 < this.f313v) {
                    int i67 = this.f314w;
                    int i68 = i66 * i67;
                    int i69 = i68 + i61;
                    int i70 = i69 + i60;
                    int i71 = i68 + i67;
                    if (i71 < i70) {
                        i70 = i71;
                    }
                    int i72 = this.f312u;
                    int i73 = i64 * i72 * c0587b.f318c;
                    int i74 = ((i70 - i69) * i72) + i73;
                    int i75 = i69;
                    while (i75 < i70) {
                        int i76 = i58;
                        int i77 = i70;
                        if (this.f312u == 1) {
                            i6 = this.f292a[this.f303l[i73] & 255];
                            i3 = i59;
                            i4 = i60;
                            i5 = i61;
                        } else {
                            int i78 = c0587b.f318c;
                            i3 = i59;
                            int i79 = i73;
                            int i80 = 0;
                            int i81 = 0;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            while (true) {
                                if (i79 >= this.f312u + i73) {
                                    i4 = i60;
                                    break;
                                }
                                byte[] bArr3 = this.f303l;
                                i4 = i60;
                                if (i79 >= bArr3.length || i79 >= i74) {
                                    break;
                                }
                                int i85 = this.f292a[bArr3[i79] & 255];
                                if (i85 != 0) {
                                    i7 = i61;
                                    i83 += (i85 >> 24) & 255;
                                    i82 += (i85 >> 16) & 255;
                                    i81 += (i85 >> 8) & 255;
                                    i80 += i85 & 255;
                                    i84++;
                                } else {
                                    i7 = i61;
                                }
                                i79++;
                                i60 = i4;
                                i61 = i7;
                            }
                            i5 = i61;
                            int i86 = i78 + i73;
                            for (int i87 = i86; i87 < this.f312u + i86; i87++) {
                                byte[] bArr4 = this.f303l;
                                if (i87 >= bArr4.length || i87 >= i74) {
                                    break;
                                }
                                int i88 = this.f292a[bArr4[i87] & 255];
                                if (i88 != 0) {
                                    i83 += (i88 >> 24) & 255;
                                    i82 += (i88 >> 16) & 255;
                                    i81 += (i88 >> 8) & 255;
                                    i80 += i88 & 255;
                                    i84++;
                                }
                            }
                            i6 = i84 == 0 ? 0 : ((i83 / i84) << 24) | ((i82 / i84) << 16) | ((i81 / i84) << 8) | (i80 / i84);
                        }
                        if (i6 != 0) {
                            iArr3[i75] = i6;
                        } else if (!this.f315x && z) {
                            this.f315x = true;
                        }
                        i73 += this.f312u;
                        i75++;
                        i58 = i76;
                        i70 = i77;
                        i59 = i3;
                        i60 = i4;
                        i61 = i5;
                    }
                }
                i64++;
                i62 = i2;
                i58 = i58;
                i59 = i59;
                i60 = i60;
                i61 = i61;
            }
            if (this.f310s && ((i = c0587b.f322g) == 0 || i == 1)) {
                if (this.f309r == null) {
                    this.f309r = m94a();
                }
                Bitmap bitmap2 = this.f309r;
                if (bitmap2 != null) {
                    int i89 = this.f314w;
                    bitmap2.setPixels(iArr3, 0, i89, 0, 0, i89, this.f313v);
                }
            }
            Bitmap bitmapM94a = m94a();
            if (bitmapM94a != null) {
                int i90 = this.f314w;
                bitmapM94a.setPixels(iArr3, 0, i90, 0, 0, i90, this.f313v);
            }
            return bitmapM94a;
        }
        String str3 = f291y;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f311t);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m97c() {
        try {
            m98d();
            byte[] bArr = this.f296e;
            int i = this.f298g;
            this.f298g = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.f311t = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m98d() {
        if (this.f297f > this.f298g) {
            return;
        }
        if (this.f296e == null) {
            ((C0588c) this.f308q).getClass();
            this.f296e = new byte[16384];
        }
        this.f298g = 0;
        int iMin = Math.min(this.f294c.remaining(), 16384);
        this.f297f = iMin;
        this.f294c.get(this.f296e, 0, iMin);
    }
}
