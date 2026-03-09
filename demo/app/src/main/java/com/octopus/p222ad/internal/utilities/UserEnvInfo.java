package com.octopus.p222ad.internal.utilities;

import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.p224b.C3072e;

/* JADX INFO: loaded from: classes2.dex */
public class UserEnvInfo {
    private static UserEnvInfo sUserEnvInfoInstance;

    /* JADX INFO: renamed from: ip */
    public String f17422ip;
    public C3072e.c isp = C3072e.c.ISP_OTHER;
    public boolean locationEnabled = true;
    private int mLocationDecimalDigits = -1;

    /* JADX INFO: renamed from: net, reason: collision with root package name */
    public C3072e.d f19842net;

    private UserEnvInfo() {
    }

    public static UserEnvInfo getInstance() {
        UserEnvInfo userEnvInfo;
        synchronized (UserEnvInfo.class) {
            if (sUserEnvInfoInstance == null) {
                sUserEnvInfoInstance = new UserEnvInfo();
                HaoboLog.m14613v(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.init));
            }
            userEnvInfo = sUserEnvInfoInstance;
        }
        return userEnvInfo;
    }

    public int getLocationDecimalDigits() {
        return this.mLocationDecimalDigits;
    }

    public void setLocationDecimalDigits(int i) {
        String str;
        StringBuilder sb;
        String str2;
        if (i > 6) {
            this.mLocationDecimalDigits = 6;
            str = HaoboLog.baseLogTag;
            sb = new StringBuilder();
            sb.append("Out of range input ");
            sb.append(i);
            str2 = ", set location digits after decimal to maximum 6";
        } else {
            if (i >= -1) {
                this.mLocationDecimalDigits = i;
                return;
            }
            this.mLocationDecimalDigits = -1;
            str = HaoboLog.baseLogTag;
            sb = new StringBuilder();
            sb.append("Negative input ");
            sb.append(i);
            str2 = ", set location digits after decimal to default";
        }
        sb.append(str2);
        HaoboLog.m14615w(str, sb.toString());
    }
}
