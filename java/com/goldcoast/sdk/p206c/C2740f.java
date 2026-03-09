package com.goldcoast.sdk.p206c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.goldcoast.sdk.c.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C2740f {
    /* JADX INFO: renamed from: a */
    public static String m13173a(InputStream inputStream, Map map) {
        String strTrim;
        String strTrim2;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        boolean z = map != null && map.size() > 0;
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        if (map != null && line.contains(":")) {
                            String[] strArrSplit = line.split(":");
                            if (z) {
                                m13174a(map, strArrSplit[0], strArrSplit[1]);
                            } else if (strArrSplit[0].trim().equals("processor")) {
                                map.put("processorcnt", strArrSplit.length > 1 ? strArrSplit[1].trim() : strArrSplit[0].trim());
                            } else {
                                if (strArrSplit.length > 1) {
                                    strTrim = strArrSplit[0].trim();
                                    strTrim2 = strArrSplit[1].trim();
                                } else {
                                    strTrim = strArrSplit[0].trim();
                                    strTrim2 = strArrSplit[0].trim();
                                }
                                map.put(strTrim, strTrim2);
                            }
                        }
                        sb.append(line);
                        sb.append("\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    break;
                } catch (IOException unused) {
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m13174a(Map<String, String> map, String str, String str2) {
        String strTrim = str.replace("[", "").replace("]", "").trim();
        String strTrim2 = str2.replace("[", "").replace("]", "").trim();
        Iterator<String> it = map.keySet().iterator();
        if (it == null || !it.hasNext()) {
            return;
        }
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(strTrim)) {
                map.put(next, strTrim2);
                return;
            }
        }
    }
}
