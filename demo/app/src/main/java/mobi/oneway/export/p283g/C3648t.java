package mobi.oneway.export.p283g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: mobi.oneway.export.g.t */
/* JADX INFO: loaded from: classes2.dex */
public class C3648t {
    /* JADX INFO: renamed from: a */
    public static int m17032a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                outputStream.flush();
                return i;
            }
            outputStream.write(bArr, 0, i2);
            i += i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m17033a(InputStream inputStream) {
        return m17034a(inputStream, Charset.defaultCharset().name());
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m17034a(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    /* JADX INFO: renamed from: b */
    public static InputStreamReader m17035b(InputStream inputStream, String str) {
        return str == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, str);
    }

    /* JADX INFO: renamed from: c */
    public static String m17036c(InputStream inputStream, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(str == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, str));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb.toString();
            }
            sb.append(line);
        }
    }
}
