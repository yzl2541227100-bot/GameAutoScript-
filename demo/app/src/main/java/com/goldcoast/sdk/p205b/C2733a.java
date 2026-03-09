package com.goldcoast.sdk.p205b;

import android.content.Context;
import com.goldcoast.sdk.p206c.C2739e;
import com.goldcoast.sdk.p206c.C2741g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.goldcoast.sdk.b.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2733a {
    /* JADX INFO: renamed from: a */
    public static String m13149a(String str, Context context, String str2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String str3 = File.separator;
        sb.append(str3);
        sb.append("ota");
        sb.append(str3);
        sb.append("elf");
        sb.append(str3);
        sb.append(str2);
        String string = sb.toString();
        C2741g.m13175a();
        C2741g.m13177a(str);
        C2741g.m13175a();
        C2741g.m13177a("download filename=".concat(String.valueOf(str2)));
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.143 Safari/537.36");
        System.setProperty("http.keepAlive", "false");
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() == 200) {
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i);
            }
            fileOutputStream.close();
            C2739e.m13169a(string, 493);
            httpURLConnection.disconnect();
        }
        return string;
    }
}
