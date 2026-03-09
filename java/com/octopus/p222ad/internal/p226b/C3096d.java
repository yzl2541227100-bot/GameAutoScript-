package com.octopus.p222ad.internal.p226b;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3096d {

    /* JADX INFO: renamed from: d */
    private static final Pattern f17046d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* JADX INFO: renamed from: e */
    private static final Pattern f17047e = Pattern.compile("GET /(.*) HTTP");

    /* JADX INFO: renamed from: a */
    public final String f17048a;

    /* JADX INFO: renamed from: b */
    public final long f17049b;

    /* JADX INFO: renamed from: c */
    public final boolean f17050c;

    public C3096d(String str) {
        C3103k.m14329a(str);
        long jM14277a = m14277a(str);
        this.f17049b = Math.max(0L, jM14277a);
        this.f17050c = jM14277a >= 0;
        this.f17048a = m14279b(str);
    }

    /* JADX INFO: renamed from: a */
    private long m14277a(String str) {
        Matcher matcher = f17046d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    public static C3096d m14278a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (TextUtils.isEmpty(line)) {
                return new C3096d(sb.toString());
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    /* JADX INFO: renamed from: b */
    private String m14279b(String str) {
        Matcher matcher = f17047e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f17049b + ", partial=" + this.f17050c + ", uri='" + this.f17048a + '\'' + MessageFormatter.DELIM_STOP;
    }
}
