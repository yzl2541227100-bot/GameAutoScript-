package com.iflytek.voiceads.p208b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.iflytek.voiceads.utils.C2989g;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: com.iflytek.voiceads.b.d */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2896d {

    /* JADX INFO: renamed from: a */
    private String f16123a;

    /* JADX INFO: renamed from: b */
    private Context f16124b;

    public C2896d(Context context, String str) {
        this.f16124b = context;
        this.f16123a = str;
    }

    /* JADX INFO: renamed from: a */
    private String m13236a(String str) {
        return str.split("/")[r0.length - 1];
    }

    /* JADX INFO: renamed from: b */
    private String m13237b() {
        return m13238c() + File.separator + "ifly_image_cache";
    }

    /* JADX INFO: renamed from: c */
    private String m13238c() {
        File cacheDir = this.f16124b.getCacheDir();
        return (cacheDir == null || TextUtils.isEmpty(cacheDir.getPath())) ? "" : cacheDir.getPath();
    }

    /* JADX INFO: renamed from: a */
    public Bitmap m13239a() {
        String str = m13238c() + File.separator + "ifly_image_cache" + File.separator + m13236a(this.f16123a) + ".cache";
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile != null) {
            return bitmapDecodeFile;
        }
        file.delete();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m13240a(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        String str = m13236a(this.f16123a) + ".cache";
        String strM13237b = m13237b();
        File file = new File(strM13237b);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(strM13237b + File.separator + str);
        try {
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            if (this.f16123a.contains("png")) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } else if (this.f16123a.contains("jpg")) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            C2989g.m13557b("IFLY_AD_SDK", "saveBitmap:" + e.getMessage());
        }
    }
}
