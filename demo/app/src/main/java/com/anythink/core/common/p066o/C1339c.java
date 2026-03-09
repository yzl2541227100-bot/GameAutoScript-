package com.anythink.core.common.p066o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.anythink.core.common.p051b.C1175n;
import java.io.FileDescriptor;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.anythink.core.common.o.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1339c {

    /* JADX INFO: renamed from: com.anythink.core.common.o.c$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f5208a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Bitmap f5209b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ a f5210c;

        /* JADX INFO: renamed from: com.anythink.core.common.o.c$1$1 */
        public class RunnableC46671 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Bitmap f5211a;

            public RunnableC46671(Bitmap bitmap) {
                bitmap = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = aVar;
                if (aVar != null) {
                    Bitmap bitmap = bitmap;
                    if (bitmap != null) {
                        aVar.mo674a(bitmap);
                    } else {
                        aVar.mo673a();
                    }
                }
            }
        }

        public AnonymousClass1(Context context, Bitmap bitmap, a aVar) {
            context = context;
            bitmap = bitmap;
            aVar = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.o.c.1.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Bitmap f5211a;

                public RunnableC46671(Bitmap bitmap) {
                    bitmap = bitmap;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = aVar;
                    if (aVar != null) {
                        Bitmap bitmap = bitmap;
                        if (bitmap != null) {
                            aVar.mo674a(bitmap);
                        } else {
                            aVar.mo673a();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.o.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo673a();

        /* JADX INFO: renamed from: a */
        void mo674a(Bitmap bitmap);
    }

    /* JADX INFO: renamed from: a */
    private static int m4019a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i3 <= 0 && i4 <= 0) {
            return 1;
        }
        while (i / i5 > i3 && i2 / i5 > i4) {
            i5 *= 2;
        }
        return i5;
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m4020a(Context context, int i, int i2, int i3) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), i, options);
            options.inSampleSize = m4019a(options.outWidth, options.outHeight, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(context.getResources(), i, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m4021a(android.content.Context r6, android.graphics.Bitmap r7) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p066o.C1339c.m4021a(android.content.Context, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m4022a(Bitmap bitmap) {
        int i;
        int i2;
        int[] iArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int[] iArr7 = new int[173056];
        for (int i6 = 0; i6 < 173056; i6++) {
            iArr7[i6] = i6 / 676;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) int.class, 51, 3);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 25;
            if (i7 >= height) {
                break;
            }
            int i11 = -25;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                i2 = height;
                if (i11 > i10) {
                    break;
                }
                int i21 = iArr2[Math.min(i4, Math.max(i11, 0)) + i8];
                int[] iArr9 = iArr8[i11 + 25];
                iArr9[0] = (i21 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr9[1] = (i21 & 65280) >> 8;
                iArr9[2] = i21 & 255;
                int iAbs = 26 - Math.abs(i11);
                i12 += iArr9[0] * iAbs;
                i13 += iArr9[1] * iAbs;
                i14 += iArr9[2] * iAbs;
                if (i11 > 0) {
                    i18 += iArr9[0];
                    i19 += iArr9[1];
                    i20 += iArr9[2];
                } else {
                    i15 += iArr9[0];
                    i16 += iArr9[1];
                    i17 += iArr9[2];
                }
                i11++;
                height = i2;
                i10 = 25;
            }
            int i22 = 25;
            int i23 = 0;
            while (i23 < width) {
                iArr3[i8] = iArr7[i12];
                iArr4[i8] = iArr7[i13];
                iArr5[i8] = iArr7[i14];
                int i24 = i12 - i15;
                int i25 = i13 - i16;
                int i26 = i14 - i17;
                int[] iArr10 = iArr8[((i22 - 25) + 51) % 51];
                int i27 = i15 - iArr10[0];
                int i28 = i16 - iArr10[1];
                int i29 = i17 - iArr10[2];
                if (i7 == 0) {
                    iArr = iArr7;
                    iArr6[i23] = Math.min(i23 + 25 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i30 = iArr2[iArr6[i23] + i9];
                iArr10[0] = (i30 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr10[1] = (i30 & 65280) >> 8;
                iArr10[2] = i30 & 255;
                int i31 = i18 + iArr10[0];
                int i32 = i19 + iArr10[1];
                int i33 = i20 + iArr10[2];
                i12 = i24 + i31;
                i13 = i25 + i32;
                i14 = i26 + i33;
                i22 = (i22 + 1) % 51;
                int[] iArr11 = iArr8[i22 % 51];
                i15 = i27 + iArr11[0];
                i16 = i28 + iArr11[1];
                i17 = i29 + iArr11[2];
                i18 = i31 - iArr11[0];
                i19 = i32 - iArr11[1];
                i20 = i33 - iArr11[2];
                i8++;
                i23++;
                iArr7 = iArr;
            }
            i9 += width;
            i7++;
            height = i2;
        }
        int[] iArr12 = iArr7;
        int i34 = height;
        int i35 = 0;
        while (i35 < width) {
            int i36 = width * (-25);
            int[] iArr13 = iArr6;
            int[] iArr14 = iArr2;
            int i37 = -25;
            int i38 = 0;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            for (int i47 = 25; i37 <= i47; i47 = 25) {
                int iMax = Math.max(0, i36) + i35;
                int[] iArr15 = iArr8[i37 + 25];
                iArr15[0] = iArr3[iMax];
                iArr15[1] = iArr4[iMax];
                iArr15[2] = iArr5[iMax];
                int iAbs2 = 26 - Math.abs(i37);
                i38 += iArr3[iMax] * iAbs2;
                i39 += iArr4[iMax] * iAbs2;
                i40 += iArr5[iMax] * iAbs2;
                if (i37 > 0) {
                    i44 += iArr15[0];
                    i45 += iArr15[1];
                    i46 += iArr15[2];
                } else {
                    i41 += iArr15[0];
                    i42 += iArr15[1];
                    i43 += iArr15[2];
                }
                if (i37 < i5) {
                    i36 += width;
                }
                i37++;
            }
            int i48 = i35;
            int i49 = i34;
            int i50 = 0;
            int i51 = 25;
            while (i50 < i49) {
                iArr14[i48] = (iArr14[i48] & (-16777216)) | (iArr12[i38] << 16) | (iArr12[i39] << 8) | iArr12[i40];
                int i52 = i38 - i41;
                int i53 = i39 - i42;
                int i54 = i40 - i43;
                int[] iArr16 = iArr8[((i51 - 25) + 51) % 51];
                int i55 = i41 - iArr16[0];
                int i56 = i42 - iArr16[1];
                int i57 = i43 - iArr16[2];
                if (i35 == 0) {
                    i = i49;
                    iArr13[i50] = Math.min(i50 + 26, i5) * width;
                } else {
                    i = i49;
                }
                int i58 = iArr13[i50] + i35;
                iArr16[0] = iArr3[i58];
                iArr16[1] = iArr4[i58];
                iArr16[2] = iArr5[i58];
                int i59 = i44 + iArr16[0];
                int i60 = i45 + iArr16[1];
                int i61 = i46 + iArr16[2];
                i38 = i52 + i59;
                i39 = i53 + i60;
                i40 = i54 + i61;
                i51 = (i51 + 1) % 51;
                int[] iArr17 = iArr8[i51];
                i41 = i55 + iArr17[0];
                i42 = i56 + iArr17[1];
                i43 = i57 + iArr17[2];
                i44 = i59 - iArr17[0];
                i45 = i60 - iArr17[1];
                i46 = i61 - iArr17[2];
                i48 += width;
                i50++;
                i49 = i;
            }
            i34 = i49;
            i35++;
            iArr6 = iArr13;
            iArr2 = iArr14;
        }
        bitmap.setPixels(iArr2, 0, width, 0, 0, width, i34);
        return bitmap;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m4023a(FileDescriptor fileDescriptor, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = m4019a(options.outWidth, options.outHeight, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m4024a(String str, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = m4019a(options.outWidth, options.outHeight, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4025a(Context context, Bitmap bitmap, a aVar) {
        C1175n.m2059a();
        C1175n.m2076c(new Runnable() { // from class: com.anythink.core.common.o.c.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f5208a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bitmap f5209b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ a f5210c;

            /* JADX INFO: renamed from: com.anythink.core.common.o.c$1$1 */
            public class RunnableC46671 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Bitmap f5211a;

                public RunnableC46671(Bitmap bitmap) {
                    bitmap = bitmap;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = aVar;
                    if (aVar != null) {
                        Bitmap bitmap = bitmap;
                        if (bitmap != null) {
                            aVar.mo674a(bitmap);
                        } else {
                            aVar.mo673a();
                        }
                    }
                }
            }

            public AnonymousClass1(Context context2, Bitmap bitmap2, a aVar2) {
                context = context2;
                bitmap = bitmap2;
                aVar = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.core.common.o.c.1.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Bitmap f5211a;

                    public RunnableC46671(Bitmap bitmap2) {
                        bitmap = bitmap2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            Bitmap bitmap2 = bitmap;
                            if (bitmap2 != null) {
                                aVar2.mo674a(bitmap2);
                            } else {
                                aVar2.mo673a();
                            }
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static int[] m4026a(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
