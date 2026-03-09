package com.octopus.p222ad.utils;

import com.octopus.p222ad.utils.p258b.C3255f;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.octopus.ad.utils.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3266g {
    /* JADX INFO: renamed from: a */
    public static boolean m15037a(int i) {
        return ((int) ((Math.random() * 100.0d) + 1.0d)) <= i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15038a(String str, String str2) {
        String str3;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
            boolean zM15039a = m15039a(simpleDateFormat.parse(simpleDateFormat.format(new Date())), simpleDateFormat.parse(str), simpleDateFormat.parse(str2));
            if (zM15039a) {
                str3 = "当前时间在时间段内[" + str + "," + str2 + "]";
            } else {
                str3 = "当前时间不再时间段内[" + str + "," + str2 + "]";
            }
            C3255f.m14981a("channels:", str3);
            return zM15039a;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15039a(Date date, Date date2, Date date3) {
        if (date.getTime() == date2.getTime() || date.getTime() == date3.getTime()) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date3);
        return calendar.after(calendar2) && calendar.before(calendar3);
    }
}
