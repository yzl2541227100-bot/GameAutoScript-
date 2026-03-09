package com.anythink.expressad.video.dynview.p164g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2087a extends ShapeDrawable {

    /* JADX INFO: renamed from: a */
    private int f13224a;

    /* JADX INFO: renamed from: b */
    private float f13225b;

    /* JADX INFO: renamed from: c */
    private float f13226c;

    /* JADX INFO: renamed from: d */
    private int f13227d;

    /* JADX INFO: renamed from: e */
    private int f13228e;

    /* JADX INFO: renamed from: f */
    private Bitmap f13229f;

    /* JADX INFO: renamed from: g */
    private Bitmap f13230g;

    /* JADX INFO: renamed from: h */
    private boolean f13231h;

    /* JADX INFO: renamed from: i */
    private Paint f13232i;

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.g.a$a */
    public static class a implements b {

        /* JADX INFO: renamed from: a */
        private RectShape f13233a;

        /* JADX INFO: renamed from: b */
        private Bitmap f13234b;

        /* JADX INFO: renamed from: c */
        private Bitmap f13235c;

        /* JADX INFO: renamed from: d */
        private boolean f13236d;

        /* JADX INFO: renamed from: e */
        private int f13237e;

        /* JADX INFO: renamed from: f */
        private int f13238f;

        /* JADX INFO: renamed from: g */
        private int f13239g;

        /* JADX INFO: renamed from: h */
        private float f13240h;

        /* JADX INFO: renamed from: i */
        private float f13241i;

        private a() {
            this.f13238f = 100;
            this.f13239g = 10;
            this.f13233a = new RectShape();
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        @Override // com.anythink.expressad.video.dynview.p164g.C2087a.b
        /* JADX INFO: renamed from: a */
        public final b mo11153a() {
            this.f13236d = true;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.p164g.C2087a.b
        /* JADX INFO: renamed from: a */
        public final b mo11154a(float f) {
            this.f13240h = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.p164g.C2087a.b
        /* JADX INFO: renamed from: a */
        public final b mo11155a(int i) {
            this.f13237e = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.p164g.C2087a.b
        /* JADX INFO: renamed from: a */
        public final b mo11156a(Bitmap bitmap) {
            this.f13234b = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.p164g.C2087a.b
        /* JADX INFO: renamed from: b */
        public final b mo11157b(float f) {
            this.f13241i = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.p164g.C2087a.b
        /* JADX INFO: renamed from: b */
        public final b mo11158b(int i) {
            this.f13238f = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.p164g.C2087a.b
        /* JADX INFO: renamed from: b */
        public final b mo11159b(Bitmap bitmap) {
            this.f13235c = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.p164g.C2087a.b
        /* JADX INFO: renamed from: b */
        public final C2087a mo11160b() {
            return new C2087a(this, (byte) 0);
        }

        @Override // com.anythink.expressad.video.dynview.p164g.C2087a.b
        /* JADX INFO: renamed from: c */
        public final b mo11161c(int i) {
            this.f13239g = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.g.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        b mo11153a();

        /* JADX INFO: renamed from: a */
        b mo11154a(float f);

        /* JADX INFO: renamed from: a */
        b mo11155a(int i);

        /* JADX INFO: renamed from: a */
        b mo11156a(Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        b mo11157b(float f);

        /* JADX INFO: renamed from: b */
        b mo11158b(int i);

        /* JADX INFO: renamed from: b */
        b mo11159b(Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        C2087a mo11160b();

        /* JADX INFO: renamed from: c */
        b mo11161c(int i);
    }

    private C2087a(a aVar) {
        super(aVar.f13233a);
        this.f13231h = false;
        this.f13229f = aVar.f13234b;
        this.f13230g = aVar.f13235c;
        this.f13231h = aVar.f13236d;
        this.f13224a = aVar.f13237e;
        this.f13227d = aVar.f13238f;
        this.f13228e = aVar.f13239g;
        this.f13225b = aVar.f13240h;
        this.f13226c = aVar.f13241i;
        Paint paint = new Paint();
        this.f13232i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f13232i.setAntiAlias(true);
    }

    public /* synthetic */ C2087a(a aVar, byte b2) {
        this(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static a m11139a() {
        return new a((byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11140a(android.graphics.Canvas r7) {
        /*
            r6 = this;
            float r0 = r6.f13226c
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r2 = 0
            r1.moveTo(r2, r2)
            int r3 = r6.f13227d
            float r3 = (float) r3
            float r3 = r3 + r0
            int r4 = r6.f13228e
            float r4 = (float) r4
            float r3 = r3 - r4
            r1.lineTo(r2, r3)
            float r3 = r6.f13225b
            int r4 = r6.f13227d
            float r4 = (float) r4
            float r4 = r0 - r4
            int r5 = r6.f13228e
            float r5 = (float) r5
            float r4 = r4 - r5
            r1.lineTo(r3, r4)
            float r3 = r6.f13225b
            r1.lineTo(r3, r2)
            boolean r3 = r6.f13231h
            if (r3 == 0) goto L39
            r6.m11141a(r7, r1)     // Catch: java.lang.Exception -> L34
            goto L48
        L34:
            r1 = move-exception
            r1.printStackTrace()
            goto L48
        L39:
            android.graphics.Bitmap r3 = r6.f13229f
            if (r3 == 0) goto L48
            boolean r3 = r3.isRecycled()
            if (r3 != 0) goto L48
            android.graphics.Bitmap r3 = r6.f13229f     // Catch: java.lang.Exception -> L34
            r6.m11142a(r7, r1, r3)     // Catch: java.lang.Exception -> L34
        L48:
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            int r3 = r6.f13227d
            float r3 = (float) r3
            float r3 = r3 + r0
            int r4 = r6.f13228e
            float r4 = (float) r4
            float r3 = r3 + r4
            r1.moveTo(r2, r3)
            float r3 = r6.f13226c
            r1.lineTo(r2, r3)
            float r2 = r6.f13225b
            float r3 = r6.f13226c
            r1.lineTo(r2, r3)
            float r2 = r6.f13225b
            int r3 = r6.f13227d
            float r3 = (float) r3
            float r0 = r0 - r3
            int r3 = r6.f13228e
            float r3 = (float) r3
            float r0 = r0 + r3
            r1.lineTo(r2, r0)
            boolean r0 = r6.f13231h
            if (r0 == 0) goto L7e
            r6.m11141a(r7, r1)     // Catch: java.lang.Exception -> L79
            return
        L79:
            r7 = move-exception
            r7.printStackTrace()
            return
        L7e:
            android.graphics.Bitmap r0 = r6.f13230g
            if (r0 == 0) goto L92
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L92
            android.graphics.Bitmap r0 = r6.f13230g     // Catch: java.lang.Exception -> L8e
            r6.m11142a(r7, r1, r0)     // Catch: java.lang.Exception -> L8e
            return
        L8e:
            r7 = move-exception
            r7.printStackTrace()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.p164g.C2087a.m11140a(android.graphics.Canvas):void");
    }

    /* JADX INFO: renamed from: a */
    private void m11141a(Canvas canvas, Path path) {
        this.f13232i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f13232i);
    }

    /* JADX INFO: renamed from: a */
    private void m11142a(Canvas canvas, Path path, Bitmap bitmap) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f13232i.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawPath(path, this.f13232i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11143b(android.graphics.Canvas r6) {
        /*
            r5 = this;
            float r0 = r5.f13225b
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r2 = 0
            r1.moveTo(r2, r2)
            float r3 = r5.f13226c
            r1.lineTo(r2, r3)
            int r3 = r5.f13227d
            float r3 = (float) r3
            float r3 = r0 - r3
            int r4 = r5.f13228e
            float r4 = (float) r4
            float r3 = r3 - r4
            float r4 = r5.f13226c
            r1.lineTo(r3, r4)
            int r3 = r5.f13227d
            float r3 = (float) r3
            float r3 = r3 + r0
            int r4 = r5.f13228e
            float r4 = (float) r4
            float r3 = r3 - r4
            r1.lineTo(r3, r2)
            boolean r3 = r5.f13231h
            if (r3 == 0) goto L39
            r5.m11141a(r6, r1)     // Catch: java.lang.Exception -> L34
            goto L48
        L34:
            r1 = move-exception
            r1.printStackTrace()
            goto L48
        L39:
            android.graphics.Bitmap r3 = r5.f13229f
            if (r3 == 0) goto L48
            boolean r3 = r3.isRecycled()
            if (r3 != 0) goto L48
            android.graphics.Bitmap r3 = r5.f13229f     // Catch: java.lang.Exception -> L34
            r5.m11142a(r6, r1, r3)     // Catch: java.lang.Exception -> L34
        L48:
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            int r3 = r5.f13227d
            float r3 = (float) r3
            float r3 = r3 + r0
            int r4 = r5.f13228e
            float r4 = (float) r4
            float r3 = r3 + r4
            r1.moveTo(r3, r2)
            float r3 = r5.f13225b
            r1.lineTo(r3, r2)
            float r2 = r5.f13225b
            float r3 = r5.f13226c
            r1.lineTo(r2, r3)
            int r2 = r5.f13227d
            float r2 = (float) r2
            float r0 = r0 - r2
            int r2 = r5.f13228e
            float r2 = (float) r2
            float r0 = r0 + r2
            float r2 = r5.f13226c
            r1.lineTo(r0, r2)
            boolean r0 = r5.f13231h
            if (r0 == 0) goto L7e
            r5.m11141a(r6, r1)     // Catch: java.lang.Exception -> L79
            return
        L79:
            r6 = move-exception
            r6.printStackTrace()
            return
        L7e:
            android.graphics.Bitmap r0 = r5.f13230g
            if (r0 == 0) goto L92
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L92
            android.graphics.Bitmap r0 = r5.f13230g     // Catch: java.lang.Exception -> L8e
            r5.m11142a(r6, r1, r0)     // Catch: java.lang.Exception -> L8e
            return
        L8e:
            r6 = move-exception
            r6.printStackTrace()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.p164g.C2087a.m11143b(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r7) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.p164g.C2087a.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }
}
