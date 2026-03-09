package com.cyjh.elfin.base;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Process;
import android.widget.Toast;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.multidex.MultiDex;
import com.anythink.basead.p025ui.GuideToClickView;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.cyjh.elfin.p200ui.activity.ElfinFreeActivity;
import com.cyjh.elfin.services.KeepMainService;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;
import p285z2.C3680a6;
import p285z2.C3681a7;
import p285z2.C3691ah;
import p285z2.C3716b5;
import p285z2.C3760cc;
import p285z2.C3765ch;
import p285z2.C3792d7;
import p285z2.C3834ec;
import p285z2.C3902g6;
import p285z2.C3939h6;
import p285z2.C3950hh;
import p285z2.C3951hi;
import p285z2.C3976i6;
import p285z2.C3977i7;
import p285z2.C4010j3;
import p285z2.C4095le;
import p285z2.C4125m7;
import p285z2.C4173ni;
import p285z2.C4279qd;
import p285z2.C4419u5;
import p285z2.C4496w8;
import p285z2.C4529x4;
import p285z2.C4580yi;
import p285z2.C4605z6;
import p285z2.InterfaceC3865f6;
import p285z2.ia0;

/* JADX INFO: loaded from: classes.dex */
public class AppContext extends Application implements InterfaceC3865f6 {
    public static AppContext o00Oo0;
    public static int o00Ooo;
    public String OoooOoO;
    private String OooooOO;
    private String OooooOo;
    public boolean OoooOoo = false;
    public boolean Ooooo00 = false;
    public boolean Ooooo0o = false;
    public boolean OooooO0 = true;
    public boolean Oooooo0 = false;
    public boolean Oooooo = false;
    public boolean OoooooO = false;
    public boolean Ooooooo = false;
    public boolean o0OoOo0 = true;
    public String ooOO = "";
    public String o00O0O = "";

    public static AppContext OooO00o() {
        while (true) {
            switch (((("ۜۗۛ۟ۢ۠ۖۢۦۘ۫ۧۢۧ۠ۗ۫۟ۛۚۚۧۗۥۘ۬ۘۤۨۛ۠ۜۘۚۛ۠ۘۤ۠ۧۥۧۡۜ۬۬۟ۢ۟ۥ۟ۘۜۨ".hashCode() ^ 947) ^ 673) ^ 967) ^ 2126858254) {
                case 1858964366:
                    return o00Oo0;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:146|148|(4:220|149|226|150)|(7:151|SW:152|213|218|173|(3:174|SW:175|256)|168)|222|167|168|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0061, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0062, code lost:
    
        r1.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooO0O0(int r7) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyjh.elfin.base.AppContext.OooO0O0(int):java.lang.String");
    }

    private void OooO0OO() {
        String str = "ۦۖۘۦ۟ۖۡۜۖۘ۟ۥۜ۫ۘۖۘۨۘۛۡ۠ۖۖۧۛۨۚۧۙۖۥۨۘۚۛۛۖۜۛۚۨۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ 660) ^ UiMessage.CommandToUi.Command_Type.SET_TAB_VALUE) ^ 359) ^ (-631240012)) {
                case -1808871916:
                    return;
                case -1328590064:
                    str = "ۗۧۢ۟ۦۜۚۨۘۤۘۧۘ۠ۧۥۜۗۦۥۚۘۘۧ۬ۡ۟ۗ۟ۦ۬ۤۚۢۨۘۨۤۡۗۚۥ۠ۙۜۤۡۨۘۤۥۘ";
                    break;
                case -1092822314:
                    C3680a6.OooO0O0().OooO0OO(this);
                    str = "۫ۜ۠ۗۙ۠۠۠ۡۘۦۘۜۙۖۥۡۘۖۘ۫ۛۚۗۙۢۦۚۡۘۢۤۡۡۤۖ۬ۡۡۘۨۧۘۚۖۡۘ";
                    break;
                case -581425255:
                    System.loadLibrary("mqm");
                    str = "۬۠۟ۗۡۖ۬ۦۡۛۜۥ۟ۢۛۚۛۦۘۛ۬ۥۘۥ۠ۤۙۢۢ۟ۥۘۘۖۜۘۘۗۧۡۘۦۖ۫ۨ۟ۨۘ۫ۢۧ۫۬ۦۙۡۧۘۗۜۘ";
                    break;
                case -174043072:
                    C4010j3.OooOOO(C3976i6.OooO0Oo(), C3976i6.OooO0oO, Long.parseLong(getResources().getString(R.string.elfin_appid)), 640L, getResources().getString(R.string.pay_vsersion), 2, "6.6.7", "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC0AatpFE9KckLT7KpzeYNM6plI646qp/QoniwsJAzRzIC0CKPn8wxcK2XbPB+fVqwdbBSGgQaC+ETcdWhVjTGEcrI1Kz1mEyKDnAoa43raEAEjfYq/pobRzbWuk/7Ul9QWspIs6/fCseb1VqkEgPEwy4Dm63vVmrcSGFBL+SzEzwIDAQAB", "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAN7UCn6kI9moTzG5rOxUVy+48EFPhRWK8LSJb2pDRiZoQ55okepl/AHfOdG+H+pCJ7We+SeAJvMv7zEggf4saCdT+gNGTpqVafPkijA0eHxVCZ5GGQhwE/avF5mruyT8ZtYvINgfwwJu7L7bmIlj1nXF8mGw8LbeVM3cShrtRdP3AgMBAAECgYAU6sKxcKcM34fPmyZoaOJmUG39M4HCq/A8gko7J2WGZXMzg41u+3PUmSfMUJSeYOdpXSr2UklVusIxUmPhgDmmipp5jX9s+65o0GtFPEHaetVWAltWyNYVbeC/nZzcWVqE7B6ReYSZNqt7ARVLXd5b5txYrzUswvbGx9odA0LAgQJBAOqW3HHo8X8nqgao432zeMmdS0f7ThKbFWGdYPT3m3MrgHcXCSzV/tBY0GLGDakTrV+yXfmEBNFDivCWDwb7xzkCQQDzKmLAtx4jbwr/VT8VrxhSgUMGtyW30YDuAtCVntYtZgSMSH5iMc+NEl0jQSdfzrGLhkZ7QkCGwvUUR6bOqcSvAkEAhfg/zqG8gORy+jirKlc7TNCSdHo1HPUKIeQRwfRCB2S5iclTCRLw4aVG5JG8rWk6YuNnPZ7CbYvIJhtcW52gKQJBALJootPqhr5QtqzoCsUKFrpSBK9kqNPZbtMyVX+xbksY0rVqau/4w+MpWhSHtS/iIvnPpt7AmT9GwzIB8C0o+hkCQHqe2QbpVHxUvq4YeeNPw9ahFI56hlTy3NNY8Lk/J/PsQwf0eqlQqTWR8P4eBDnoZkxKlAsCBT2avsreWvQR/Yk=", getString(R.string.elfin_appinfo));
                    str = "ۥۦۧۘ۬ۗ۠ۨۤۘۤۦۘۦۢۚۢۥۥۤۗۛۖۙۡ۟ۗۡۧۗۚۚۙۡۤۘ۫۫ۥۧۖۡ۫";
                    break;
                case 274945363:
                    C3950hh.OooO0Oo().OooO0o0(this);
                    str = "ۖۧۗۡۗۖ۬ۤۛۘۡۥۘ۫ۘۜۘ۬ۛۡۘ۠ۘۦۘ۠ۡۡۘۢۘۚ۬۬ۡۘ۟۠ۚۤ۬ۙ";
                    break;
                case 648572200:
                    C4605z6.OooO0Oo().OooO0o(this);
                    str = "ۜۤۜۘ۠ۨۘۤ۬ۗۖۨ۫ۨۜۥۧۡۘۧۥۨۘۥۨۡۧۜۙۚۘۘۜۛۢۚ۟ۤۥۗۛۨۙۦۘ";
                    break;
                case 1607488826:
                    C3977i7.OooO().OooOooo(0);
                    str = "ۡ۫ۦۥۚ۬۟ۛ۬ۡۙۨۚۙۢۙۚۡۥۥۘۗۢ۬ۗ۫ۢ۟۟ۥۘۙۤۦ۠ۡ۠ۗۘۛۘۚۥۘ";
                    break;
                case 1797552330:
                    OooO0o0();
                    str = "ۚۥۡۘ۬ۦۚۨۚۨۡۚۧۗۦۤۧۘۨ۠ۦ۬ۡۡۘۙۙۙ۟ۜۡۘۨۥۗۧۢ۠ۦ۫ۨۘۧۢۥۛۨۧۥۘۤۛۛۢۛۜۤ";
                    break;
                case 1877782391:
                    C3834ec.OooO0OO().OooO0o(this);
                    str = "ۢ۟ۨۘۡۧ۬ۤ۫ۦۘۦۨۘۘۙۘۢۖۥۨۘۗۙۗۥۡۘۘ۠۟ۚۥۥۜۘۦۡ۫ۡۛۚ";
                    break;
                case 2146104668:
                    C3760cc.OooO0Oo().OooO0o0(this);
                    str = "ۜ۟ۡ۠ۖۤ۠۟۟ۜۜ۠ۢۥۨۘۡۙۥۦۨۢۗۜۧۥۨۜۘۤۥۧۗۤ۟ۛۦۦۘۛۡۖۖۢۨۘۖۘۙۘۨ۠۟ۙۥۘۗۛۥ";
                    break;
            }
        }
    }

    private void OooO0Oo() {
        String str = "ۛۗ۟ۘۢۜۘۦۙۖۘۛۖۘۘۧۘۡ۬ۙۗۖۥۤۤۛ۫ۘ۬ۚۤ۠ۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 901) ^ 578) ^ 651) ^ (-2143919803)) {
                case -2136472069:
                    System.loadLibrary("mqm");
                    str = "۠ۡۗۦۢۡۘۧۤ۟۟۠ۙ۠ۘ۫ۥۜۧۘ۠۬ۦۖۙۨۘۨ۫ۜۖۨۘۚۗۦۢۨۘۚۥۘۚۤۢۜۦۚۡۧ";
                    break;
                case -1605266485:
                    str = "ۛۦۢۙۙۡ۬ۜۨۘ۬ۙ۫ۧۖۘۘۧ۫ۗۙ۬ۨۘۢۗ۬ۡۡۥۘ۟ۙۥۤۙۖۥۥۨۘۛۗۨۛ۫";
                    break;
                case -1458424138:
                    C3680a6.OooO0O0().OooO0OO(this);
                    str = "ۗ۫ۜۘۚۗۜۢ۟۠۟ۤۙۖ۬۫ۙۘۥۘۚۘۙۛۗۧۖۛ۫ۡۙۘۘۙۚ۠ۜۤۜۘۗۙۤ۫ۙ۠ۦۧۤ۫۟ۜۜۛۜۘۧۡۘ";
                    break;
                case -381401075:
                    ia0.Oooo0(this);
                    str = "ۚ۠ۥۘۚۧۘۡۚۛۢۡۘۘ۫ۗۛۜۡۘۢ۠ۘۘۥ۠ۨۘ۬ۡ۫ۜۖۡۘ";
                    break;
                case -157204622:
                    C4605z6.OooO0Oo().OooO0o(this);
                    str = "ۙۚۨۘۖۤۜۘۙۨۧۘۙۦۜۘۗۜۜۦۛ۬ۦۨۨۘۘۡۧۘۧۢۧۢۦۨۡۢۖۥۗ۫";
                    break;
                case -90911928:
                    return;
                case 277672317:
                    C3834ec.OooO0OO().OooO0o(this);
                    str = "ۨۥ۠ۜۢۥۥ۟ۢۡ۫۟ۢۥۖۤ۠۫۬ۚۨۚۨۛۨۜۙۨ۬ۥۚۥۗ۠۫۫";
                    break;
                case 531945922:
                    OooO0o0();
                    str = "۠ۧۚۤ۫ۤ۬ۤ۬ۦۦ۫ۨ۫ۙۦۘۛۡۚۜۖۘ۫ۨۨۖ۫ۥۘۡ۠ۡۘۖ۠ۘۙۤۖۙۥ۠۬ۗۗ۬۬ۡۢۗۘۘ۠ۖۜۘ";
                    break;
                case 834802235:
                    OooO0oO();
                    str = "ۧ۬ۡۙۜ۟ۨۚۨۚ۠ۧۗۙۧۢ۟ۖۖۡۡۘۥۗۡۚۜ۬ۥۥۦۘۨۜۥۘ۠ۖۖ";
                    break;
                case 1024135980:
                    C3760cc.OooO0Oo().OooO0o0(this);
                    str = "ۗۥۜۛۤۘۥۛۖۘۙۤۚۦۥۡۘۜۖ۫ۡۨۡ۟ۜۖۡۙۚۥۦۡۘۥۡۦۘ۠ۛ۬ۡ۫ۤۜۖۥۢۛ۬ۙۛ";
                    break;
                case 1113903330:
                    C4010j3.OooOOO(C3976i6.OooO0Oo(), C3976i6.OooO0oO, Long.parseLong(getResources().getString(R.string.elfin_appid)), 640L, getResources().getString(R.string.pay_vsersion), 2, "6.6.7", "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC0AatpFE9KckLT7KpzeYNM6plI646qp/QoniwsJAzRzIC0CKPn8wxcK2XbPB+fVqwdbBSGgQaC+ETcdWhVjTGEcrI1Kz1mEyKDnAoa43raEAEjfYq/pobRzbWuk/7Ul9QWspIs6/fCseb1VqkEgPEwy4Dm63vVmrcSGFBL+SzEzwIDAQAB", "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAN7UCn6kI9moTzG5rOxUVy+48EFPhRWK8LSJb2pDRiZoQ55okepl/AHfOdG+H+pCJ7We+SeAJvMv7zEggf4saCdT+gNGTpqVafPkijA0eHxVCZ5GGQhwE/avF5mruyT8ZtYvINgfwwJu7L7bmIlj1nXF8mGw8LbeVM3cShrtRdP3AgMBAAECgYAU6sKxcKcM34fPmyZoaOJmUG39M4HCq/A8gko7J2WGZXMzg41u+3PUmSfMUJSeYOdpXSr2UklVusIxUmPhgDmmipp5jX9s+65o0GtFPEHaetVWAltWyNYVbeC/nZzcWVqE7B6ReYSZNqt7ARVLXd5b5txYrzUswvbGx9odA0LAgQJBAOqW3HHo8X8nqgao432zeMmdS0f7ThKbFWGdYPT3m3MrgHcXCSzV/tBY0GLGDakTrV+yXfmEBNFDivCWDwb7xzkCQQDzKmLAtx4jbwr/VT8VrxhSgUMGtyW30YDuAtCVntYtZgSMSH5iMc+NEl0jQSdfzrGLhkZ7QkCGwvUUR6bOqcSvAkEAhfg/zqG8gORy+jirKlc7TNCSdHo1HPUKIeQRwfRCB2S5iclTCRLw4aVG5JG8rWk6YuNnPZ7CbYvIJhtcW52gKQJBALJootPqhr5QtqzoCsUKFrpSBK9kqNPZbtMyVX+xbksY0rVqau/4w+MpWhSHtS/iIvnPpt7AmT9GwzIB8C0o+hkCQHqe2QbpVHxUvq4YeeNPw9ahFI56hlTy3NNY8Lk/J/PsQwf0eqlQqTWR8P4eBDnoZkxKlAsCBT2avsreWvQR/Yk=", getString(R.string.elfin_appinfo));
                    str = "۠ۗۧۖۢ۫۫ۛۡۘۡۚۖۘۚ۫ۛۘۜۡۘۧۧ۫۠ۛۜۘۨۨۦۘۖۜۖۘ۫ۛۜۤۗۤۗۘ۬۫ۡۨ";
                    break;
                case 1147213889:
                    C3950hh.OooO0Oo().OooO0o0(this);
                    str = "ۖۗۘۧۖ۠ۨۡ۠ۛۤۖۗۧۨۘۙ۫ۛۥۜۖۙۦ۬ۨۜۘ۟ۨۜۚ۬ۖۘۚۘۦۘۡۥۖۘ۬ۢۡ۟ۤۤۚۗۨۗۜۦۧۡۘ";
                    break;
                case 1261783621:
                    C3977i7.OooO().OooOooo(0);
                    str = "ۦۨۘۨۜ۠ۦۖۜ۫ۘۡۗ۫۫ۥۙۡۦۤۤۧۘ۬ۨۨۨۘۗۘۛۤۖۚۧۘۧۘ۠۫ۚۜۗ۟ۛۨۢۜ";
                    break;
                case 1596718430:
                    OooO0oo();
                    str = "ۙۨۧۘۛۤۦۘ۬۟ۥۘۚۥۦۘۢۛ۫ۜ۠ۙۤۜۥۘ۫ۜۦۘۘۤۖۛ۟ۗۧۧۖۥۨۢ";
                    break;
            }
        }
    }

    private void OooO0o() {
        String str = "ۚۙۖۘۖۡۜۘۜ۬۟ۨۦۜۘۙۘۦۘۧۥ۟ۙۤۧۘۖۤۚۘۧ۠۬۠ۙۘۡۖۙۦۘۥۨ۬ۘۙۥۘۛۛۘۘ۬ۗۥۘۖۗۖۘۢ۠۫";
        while (true) {
            switch ((((str.hashCode() ^ 743) ^ 17) ^ C1801a.f11011aV) ^ (-6682457)) {
                case -1408083564:
                    return;
                case -831660000:
                    String str2 = "ۗۚۡۘۥۘ۬۟۫ۤۦ۟ۙ۟ۘۘۛ۬ۙۘۜۦۘۢ۠ۨۘۡۦۦۨۗۖۥۜۨۘۧۨۡۘۤۡۘۥ۫ۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 604107817) {
                            case 442900275:
                                String str3 = "ۦۚۨۘۥ۬۟۫ۦ۠ۖۗۙۙۗۧۚ۠ۘۗ۟ۢۗۚ۠ۧۖۧۡۤۡ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-875787853)) {
                                        case -1857829039:
                                            str2 = "ۧۘۧۘۛۦ۬ۧۤۤ۟۬۫۬ۨۚ۠۫ۜ۟ۦۜۘۘۦۤۡۤۛ۟ۚۨۘۡۤۜ۫ۧۥ";
                                            break;
                                        case -766373352:
                                            str3 = "ۘۦۡۘۨۗۙۥۗۛۛ۬ۨۗ۬ۜۙۗۗۤۧۦۘ۠ۗۥ۟ۜۢۗ۠ۗ۫۬ۨۥۢۢ۫ۚۢۘ۠ۛۨۖۘۨۡۨۨۢ۫ۚۙۘ";
                                            break;
                                        case 1679954043:
                                            str2 = "۟ۜ۬ۖۖۘۘ۟۬ۡۗۧۙ۫ۖۛۗ۫ۧ۬ۗۖ۠ۜۘۡۖ۠ۙ۠ۚۘۚ۫ۨۙ۟ۡۚۦۘۨۢ۫۟ۡۙۙۢۥۘ";
                                            break;
                                        case 1779604906:
                                            str3 = this.OooooOO.endsWith(":enginfloat") ? "۟۠ۥۘۗ۟ۦۨۨۖۤۢ۬۫ۖۡۘۧۙۤ۟ۦۛۖۚ۫ۖ۫ۘۙ۫۠ۨۚۜ۬ۚۧۢۥۧۘ۟ۛۘۜۚۘۘ" : "ۘۘۘۗۦۙۙ۫ۗۤۦ۬۬ۦۡۘۧۛ۫ۛ۟ۗۗۘۥۤۡ۟۬ۢۚ";
                                            break;
                                    }
                                }
                                break;
                            case 774636251:
                                str2 = "ۚ۫ۥۥۡۤۧۢۨۘۧ۟ۘۜۜ۠ۥۤۛ۟ۖ۫ۖۥۨ۬ۧۦۘۜۢۜۧۡۡۘۧ۠ۢۛ۬۬۫ۢۦۘ";
                                break;
                            case 828148224:
                                str = "ۘۨۜۢ۫ۖۖ۬ۨۧۙۗ۫ۗۥۡۙۦۘۙ۟ۤۛۖۡۘۦۘۖۘۛۙۥۘۘۥۦۘۖ۟ۚ";
                                continue;
                            case 1208297402:
                                str = "ۦۖ۬ۚۨۡۤۛۥۘ۠ۚۡۙۦۦ۠ۜۙ۫ۢۗۛۡۘۘ۠ۡۘۖۨۛۦۥۘۗۢ۬۫ۘۜۧۦۜۘۢۤۤۨ۠ۜ";
                                continue;
                        }
                    }
                    break;
                case -110400404:
                    this.OooooOo = getPackageName();
                    str = "ۤۥۦۘۙۗۡۘۗۛۜۘۧ۠ۡۚۚۡۘ۠ۛۗۡۤۖۘۢ۠ۗۦۙ۟ۚۡ۠۬ۢ۟ۢۤۙ";
                    break;
                case -42624078:
                    String str4 = "ۜۥۜۘۧ۫۬ۗۥۨۦۨۨۘۡ۟۟ۜۙ۬ۚۦۨۥۚۜۦ۟ۦۘۜ۬ۜۘۨ۟ۥۨ۫ۥۘۙۦۥۘ۟ۡۘۘ۫ۜۙۙۤۘۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-102586214)) {
                            case -612416388:
                                String str5 = "ۚۙ۠ۙۗۜۘۧ۫ۥۘۘۡۛۢۙۜۘ۬ۛۦۘ۟ۦۨ۠ۘۗۙۙۜۤۚۧۢ۠ۜۤۧۤۨۗۖۘ۬۟ۙ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-1791394147)) {
                                        case -1739631065:
                                            str4 = "ۦۧۘۨۗۜۘ۟ۢۤ۠ۥ۠۬ۙ۫ۨۙ۫ۧۜ۟۠ۛ۬ۢۖۤۘۘۜۘۤۧۦۘۗۥۖۙ۠ۡ۠۬ۦۛۧۗۙۧۛ";
                                            break;
                                        case -247988758:
                                            str4 = "ۛۛۥۘۘ۠ۧۗۥ۟ۧۖۢ۫۟ۜۥ۟ۘ۟۟ۥ۟ۙۜۘۘۖۚ۟۫ۚۜۙۖۘۢۖۖۘۦۢۥۗۦ۠ۗۥۦۘۨ۟ۥ";
                                            break;
                                        case 1621533654:
                                            str5 = getPackageName().equals(this.OooooOO) ? "ۥۨۘۛۚۦۘ۬۠ۥۘ۫۠ۥۢۧۜ۫ۧۖ۟ۜۥۡۨۜۘ۠ۦۗۢۗ۠ۘۤ۫ۧۨۗ" : "۟۫ۗۢۜ۟ۦ۬ۤۗۖۙۘۜ۟ۙۘۘ۠ۜۦۘۢۢ۠ۡ۫ۡۘۚۜۖۘۧۨۨۘ۠ۤۥۘۚۧۘ۫ۨۧۦۥۦۘ۫ۥ۬";
                                            break;
                                        case 1884355307:
                                            str5 = "ۘۚۨۘۡۖ۫ۤ۬۫ۛۢۖۧۨۘۘۧ۟ۙۖ۫ۦ۫ۘۘۛۖۗ۬ۨۧۘۖۢۥۘۗۙۖۘۦۡۧۨۧۖۘۖۘۘۘۚۦۡۘ۬ۦۚۥۘۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 621665890:
                                str = "۬ۜۖۘۜۜۖۜۘ۬ۖۛ۠ۧ۟۟ۥۧۡۘۗۢۦۚ۠ۚۚۤۦۘۛۜۡۘۨۛۖۖۜ۟ۨۧۗ۫ۜۘۗۤۖۘۗ۠ۖ";
                                continue;
                            case 1887050674:
                                str = "ۢۨۚۥۦۛ۬۟۬ۤۦۘۡۘۥۘۥۗ۟۬ۢۜۘ۫ۚۗۤۚۜۘ۫ۤۙ";
                                continue;
                            case 1892009810:
                                str4 = "۟ۦۨۘۥۜۡۘۚۥۦۗۡۘۨۗۖۖۘۢۙۛۥۨۜۗ۟۟ۤۢ۫ۗۤ۟ۨۨۖۘ";
                                break;
                        }
                    }
                    break;
                case 95718553:
                    o00Ooo = Process.myPid();
                    str = "۟ۗۧۥ۬ۘۧۦۗۧ۬ۨۖۦۘۙۖۦۦ۠ۥۨۥ۟ۖۖۦۛ۠ۜۘۘۤۙۛ۠۫ۧۘ۠۠ۥ";
                    break;
                case 423796698:
                    str = "ۥۗۢ۫ۡ۫۬ۧۨۘ۟۬ۥۘ۟ۗۘۜۧۘۘ۫ۛۧۘۚۚۙ۬ۦ۟ۚۗ۠ۚۚۚۢۡۦۗ۟۫۬ۗۛۛۥۤۖۨۘ۫ۡۨۨۘ";
                    break;
                case 779347009:
                    this.OooooOO = OooO0O0(Process.myPid());
                    str = "ۥ۫ۚۥۨۖۘۡۗۤۨۖۨۧ۫ۦۘۗۗۖۥۥۥۘۥۡۥ۠ۚ۬ۨ۫۠۟۟ۖۧ۫ۦۡۤ۠۬ۥۨۘ";
                    break;
                case 1320378990:
                    this.Oooooo = true;
                    str = "ۘۨۜۢ۫ۖۖ۬ۨۧۙۗ۫ۗۥۡۙۦۘۙ۟ۤۛۖۡۘۦۘۖۘۛۙۥۘۘۥۦۘۖ۟ۚ";
                    break;
                case 1598425347:
                    this.Oooooo0 = true;
                    str = "ۢۨۚۥۦۛ۬۟۬ۤۦۘۡۘۥۘۥۗ۟۬ۢۜۘ۫ۚۗۤۚۜۘ۫ۤۙ";
                    break;
            }
        }
    }

    private void OooO0o0() {
        String str = "ۗۖۦۘۗۖ۟۫ۛۤۘۦۙۤ۬ۗۘۗۨ۫ۛۖۘ۫۟ۛۧۤۤۘۙ۫۬ۡۘۛۧۛۤ۠ۨۜۤۡۘۛۦۚ۫ۨۘ۬ۚۜ۫ۦ۫";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.FW_SET_TEXT_VALUE) ^ 604) ^ 604) ^ 1640371593) {
                case -2006812825:
                    C3716b5.OooO0OO().OooO0o0(this, C3902g6.OooO0o);
                    str = "ۥۡۘ۠ۗۘۘۛۤ۠ۚۡۤۙ۠ۘۚۛ۬ۨۥۡۢۘۘۡۤۨۗۨۥۘۜۨۥۗ۠ۤۨ۟ۜۘۘۜۚۥۙۦۘۧ۟ۘۘ";
                    break;
                case -1691950248:
                    str = "ۖ۠ۨۜۖۤ۫ۜۦۨۡۧ۬۫ۛۚ۬۬ۚ۫ۨۘۜۚۦۤۨۘۖۗۜ";
                    break;
                case -1537883134:
                    C4125m7.OooO0o0().OooO0oo(this);
                    str = "ۛ۫ۨۘۦ۠ۧ۬ۙۨۘۤۘۜۘۘۢ۬ۛۙۡۘۘۢۜۤۦۗۘۧۘۘۥۨۗ۠ۙۡۨۡۧۤۖۘۙۨۚۤۢۤۚۚۢ";
                    break;
                case -1114299089:
                    return;
                case -952568095:
                    C3939h6.OooO0O0(this);
                    str = "ۨۦۨۘۢ۫ۨۘۘۥۨۘ۟۠۬۠ۧۙۥۘۢۦۗ۬ۦۙۢۜۛۢۡۘ";
                    break;
                case 134674438:
                    C4529x4.OooO0O0().OooO0o0(this);
                    str = "ۡۨۖۨ۟ۡۘۜۥۘۡ۟ۛۗۦۥۘۛۘۗۗۚۡۦۥۧۘۨۧۜۥۗۖۗۛۜ۬ۘۦ";
                    break;
                case 174286730:
                    C4279qd.OooO0OO().OooO0Oo(this);
                    str = "ۥۥۦ۫ۘ۬۟ۖ۫ۦ۠ۦۨۡۤۦۥۘۤۧۡۗۘۡۚۦۗۖۙۜ";
                    break;
            }
        }
    }

    private void OooO0oO() {
        String str = "ۖۦۧۘۘۘۥۨۤۡۙۢۚۡ۟ۙۛۖۘۘ۟ۖ۫ۙۗۚۜۡۘ۟ۧۜۘۙۖۘۘۜ۟ۧ";
        while (true) {
            switch ((((str.hashCode() ^ 821) ^ 531) ^ 110) ^ 2046017276) {
                case -991306701:
                    return;
                case -879896566:
                    str = "ۧۨۘۘۗۢۤ۫ۛۘۘ۠ۧۦۧ۫ۨۛۤۚۡۥۖۘۧ۫ۦۙۡۤۤۦۢۥۙۜۘ۫۟۟ۢ۫ۢۖۛ";
                    break;
                case 184420129:
                    C3691ah.OooO0oO(false);
                    str = "ۗ۬ۡۙۡۗۙۥۘ۟ۛۙ۬۠ۨۘۙ۫ۗ۠۬ۡۘ۟ۚۥۘ۬ۢۤ۬ۛۦ";
                    break;
                case 807601547:
                    C3691ah.OooO00o(this, "67e0ebf048ac1b4f87f502bd", "BillApk");
                    str = "ۜۗۤۜۢ۫۬۬ۥۘۗ۟ۘۘۖۜۥۜۧۢۚ۟۟ۚۚۖۛۚۗۤۜۦۗ۟ۢۤ۟ۘۥۦۢ۟ۥۘ";
                    break;
            }
        }
    }

    private void OooO0oo() {
        String str = "ۨۙۛ۬ۥۖۢ۟ۜۘ۫۬ۡۙۤۦۦۢۗۥۢۛ۟ۚۨۧۨۧ۠ۘۧۨۗۗۜ۬ۙۨۤۨۛۘۥۘۢۢ۠ۘۤۨۧۢۦۘۜۘۜ";
        while (true) {
            switch ((((str.hashCode() ^ 145) ^ 948) ^ 195) ^ 1794024431) {
                case -493591375:
                    return;
                case 790183489:
                    str = "۫ۤۖۘۖۨۖۨ۟ۜۘۜ۟ۜۘۚۥ۬ۜۘۦۘ۠ۜۨۘ۟ۦۜۛۨۖۨۗ";
                    break;
                case 1400964426:
                    startService(new Intent(this, (Class<?>) KeepMainService.class));
                    str = "ۨۦۡۘۛۦ۠ۛۚۗۙۧۚۨۧ۟ۥۧ۟۟۟ۗۦۛۢۚۤۦۢۜۚۗۨ۠ۘ۫ۜۡۨ۬ۗۗۢ۫ۢۘۦۘ۠ۨۨۘۚۘۧۘ";
                    break;
            }
        }
    }

    public void OooO() {
        String str = "ۥ۫ۥۘۜ۟ۘ۟۬۠ۨۗ۟ۤۦۘۤۚۥۦۧۖۦۜ۟ۨۥۘ۬ۛۨۘ";
        StringBuilder sb = null;
        ActivityManager activityManager = null;
        while (true) {
            switch ((((str.hashCode() ^ 959) ^ 23) ^ 427) ^ 1106689021) {
                case -2053641891:
                    String str2 = "۠ۘۨۧۤۦ۟ۨۜ۟ۢۖۢۧۖۛۥۧۘۧ۬ۜۤۘۦۡ۫ۦۨ۬ۙ۠ۙۧۘۛۤۖ۫۬۠ۜۨۘۢ۠ۨۘۖۖۜۥۡ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 1413020742) {
                            case -1024029633:
                                str = "۟۟۫ۢۖ۬ۤۛۦۨ۫ۡ۠ۢۤۢۜۤۨ۟ۢ۟ۖ۟ۗۛۥۦۘۡۨۘۢۚۥۘۚ۟ۡۥۧۜۨۤۥ۠۠ۤ۠ۗۨۨۘۨ";
                                continue;
                            case -559886171:
                                str2 = "ۗۘۥۖۦ۠ۛۥۙۧۚۚۚۙۨۘۛۧۘۘۢۚۥ۠ۘۚۙۤۦۘۙ۬ۥ۠۫ۗۘۡۡۘ۠ۦۥۘ۟ۛ۟";
                                break;
                            case -35378791:
                                str = "ۛۚۖۦۗۖۤۨۛۖۘۦۖۨۜۦۨ۫ۘۥۥۘۜۧۖ۫ۥۡ۠۟ۥۘ";
                                continue;
                            case 299869580:
                                String str3 = "ۡۘۨۗۧۦۜۛۥۘۗ۬۠ۙۨ۠ۨ۬۬۫ۜۡۦۚۖۙۚ۫ۤۘۥ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-416486544)) {
                                        case -1675630241:
                                            str2 = "ۘۦۢۢۖۖۜۜۦۘ۫۟ۗۧۦۦ۟ۢ۫ۚۚۦۘ۬ۜۦ۫ۨۡۘۙۙۗ";
                                            break;
                                        case -1236418604:
                                            str3 = activityManager != null ? "ۨۢۛ۟ۖۘۘۙۚ۟۟۠ۖۘۧۨ۟ۗۖۡ۠ۨ۬ۗۥۜۧۨۘۘۢۧۤ" : "ۨۦۘۘۜۨۡۜۦۘۧۙۡۘۗۘۡۤۗ۟ۨ۬ۡۖۗۜۡۦ۫ۙۛۜۛۚۦۥۦۥ۠۟ۤۜۡۧ۠ۚۡۢ";
                                            break;
                                        case -416212317:
                                            str2 = "ۢۘۥۘۤۨۗ۠۠ۙۧ۬ۨۘۦۥۘۘۖۘ۬۫ۘۢۤۜۙ۠۬ۚۙۖ۟۬ۚۥۘۧۨۢ";
                                            break;
                                        case 691946167:
                                            str3 = "ۨ۠ۨۥۜۙۖۗۜۘ۟ۧۜ۠۫ۙ۫ۚۚ۟ۡۨۘۚۥۖۖۚۦۧۚۖۘۢۖۘۛۚۖۘ۫ۖۜۛۥۤۥۤۖۧۗۥۡۘۥۘۗۙۧ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1952455242:
                    Process.killProcess(Process.myPid());
                    str = "۫ۦۘۘۨۦۚۦ۬ۡۤۥۘۤۗۖۘۛ۬ۘۚۘۜۛۧۛۤ۬ۛۦۘۙۥۨۤ۠ۗۚۛۛ۠ۨۜۧ";
                    break;
                case -1471219491:
                    C3951hi.OooOo0O(this);
                    str = "ۢۡ۬ۜۥۤۛۢۚۜۦۧۘۙ۫ۦ۬۟ۤ۬ۚۨۡۜۨۖۖۗۜۛۧۤۥۡۘۜۦ۠۬۠۠۟ۨۨۘ";
                    break;
                case -1276090378:
                    ((ActivityManager) getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
                    str = "ۖۜۘۘۧۤۜ۟ۚۦ۟ۙۥ۬ۨ۫۫ۧۤۦۖۦۘۦۢۘۘۧۧۗ۠ۙۤ۠۫ۡۖۡۧۖۖۦۡۤۛۜۥۘۤ۠ۤ";
                    break;
                case -1127389173:
                    str = "۠۬ۘۘ۬ۚۧۨۜۚۢۦۧۘۘۤۥۘۛۛۤۘۗۦۘۥۨۘۙۥۤۜۙ۫";
                    activityManager = (ActivityManager) getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                    break;
                case -1104990234:
                    sb.append(getPackageName());
                    str = "ۦ۫ۦۘ۫ۥۖۘۘۜۜ۟ۧۤۧ۬ۖۘۤۖۦۘ۟ۡۗۘ۫ۖۘۜۥۘۤۤۘۗۛۦۘۗۜۜۘ";
                    break;
                case -746517125:
                    C3765ch.OooOo00(this);
                    str = "ۜ۟ۦۘ۫ۧۚ۟ۢۧ۟ۗۜۘۨۘۨ۟ۖۙۤۛۢۧۤ۟ۚ۬ۙۙ۬ۥ";
                    break;
                case -689104879:
                    System.exit(0);
                    str = "ۡۤ۠ۖۤۘۦۙۖۘ۟ۧۢۧۨ۠ۢۗۘ۟ۙۖۚۖۥۤۗۜۘۡۧۦۘ۫ۙۨۡ۬ۖ";
                    break;
                case -580922762:
                    sb.append(":download_server");
                    str = "ۢۚ۬۠۟ۛۦۘۖۙۨۧۙ۫ۨۘ۫۠۟ۢۗۜۦۡۘۗۚۦۥۚۘ";
                    break;
                case 138746804:
                    C4496w8.OooO0o();
                    str = "۬۬ۢۨۨۜۡۘۗۘۥۥۚۗۥۘۡۤۦۢ۠ۦۘۢۛۦۡ۠ۘۘۖۖۘۗۡۙۢ۫ۖۙۡۦ۟۬ۗ۬ۙۙۙۛۨۘۖۙۥۙۖ";
                    break;
                case 1180727818:
                    str = "۫ۦۥۘۜۛۖۙۡ۫۟ۢ۬ۦۥۡۜ۠۬ۢ۫ۨۘ۠ۜۡۘ۫ۖۡۘۨ۫ۛ";
                    break;
                case 1301786422:
                    sb = new StringBuilder();
                    str = "ۨ۟ۡۘۤۗۛۘۖ۟ۗۡۛۙۖ۬۟ۛ۠ۙۗ۬ۜۨۖۘۧۙۢۜۚ۟۬ۨۘۖۙۧ۠ۘ۫ۤۚۦۘۨ۟ۜۘۥ۠ۥۘ۠۫ۦۦۥ۬";
                    break;
                case 1348717407:
                    return;
                case 1424264459:
                    C3691ah.OooO0O0(this);
                    str = "ۗۨۥۘ۠ۦۚۛ۬۟ۗۢۖۘۚۥ۫ۜۘۥۘۢۧ۠ۙۥ۠ۗۡ۫ۖۧۤۡ۠ۦۘۤۘۧۘ";
                    break;
                case 1648224124:
                    activityManager.killBackgroundProcesses(sb.toString());
                    str = "۟۟۫ۢۖ۬ۤۛۦۨ۫ۡ۠ۢۤۢۜۤۨ۟ۢ۟ۖ۟ۗۛۥۦۘۡۨۘۢۚۥۘۚ۟ۡۥۧۜۨۤۥ۠۠ۤ۠ۗۨۨۘۨ";
                    break;
                case 2036008069:
                    C3977i7.OooO().Oooo0o();
                    str = "ۙۧۘۛۦۤۜۢۡ۠۠ۨۘۙۨ۫ۙۦۘۤۨۘۘۘۗۖۘۙۧۦۡۙ۬ۥۜۡۛۥۘۦ۠ۨ۬۠ۘۘۦۖۗۡۤۨۘ۫ۜۘۥ۟ۜ";
                    break;
            }
        }
    }

    public void OooOO0(int i) {
        String str = "ۨۚۜۦۡۘ۠ۤۙۨۤۖۢۡۦۘۡۙۡۘۚۢۜۗۥۨۙۢ۠ۨۤ۬ۨۥۥۘۘۧۦۧۘ۫ۙ۫";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_EDIT_INPUT_TYPE_VALUE) ^ 842) ^ 987) ^ (-934935998)) {
                case -1908746148:
                    str = "ۖۥۡۧۤ۠۬ۨۨۘۖۛۡۖ۟ۥ۫ۦۤۚۥۥۧۡۦۘ۟۟ۘۥۢۙ۫ۥۧۘ۠ۜۙۦ۫ۖ۫۠ۗ";
                    break;
                case 670710565:
                    str = "ۨۛۛۦۛ۬ۨۢۦۘۢۖۨۘۘ۟ۨۜۗۨۤۗۨۢۗۥۨۧ۠۫ۧۨۘۥۛۘۘۙ۫";
                    break;
                case 777272623:
                    Toast.makeText(this, i, 0).show();
                    str = "۬ۨۜۦ۠۬ۖۜۚۗۖۧۗۙۤ۫ۦۘ۫ۦۨۘۥۧۡۘۦۡۦۖۡۜ۠ۘۙۧۢۘۘۢۡۡۗ۠ۗۜۗۙۤ۠ۜۘ";
                    break;
                case 956806521:
                    return;
            }
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        String str = "ۖۖۧۗۢۘۘۛۜۜۘ۬ۘۛۥۜۜۘ۫ۥۤۦۘۥۦۚۨ۟ۦۥۘۖۗۡ";
        while (true) {
            switch ((((str.hashCode() ^ 87) ^ 574) ^ 177) ^ (-1706389594)) {
                case -1626978697:
                    OooO0o();
                    str = "ۜ۠ۥۘ۟ۗۖۘ۬ۧۙۥۨۗۘ۬ۥۡۖۘۖۘۙۨۖۤ۟ۘۖۘۙۛۚۦۘۨۘۙۨ۟ۥۜۧۘۧ۬۠ۦ۠ۦۢۢۚۜۤۦۘۙۚۢ";
                    break;
                case -910853834:
                    o00Oo0 = this;
                    str = "ۜۢۙۛ۫۟ۧۥۖ۬۬ۜۘ۠۫۬ۛ۬ۦۘۖۢۧۧۡۖۘۘۢۨۙۧۦۘۗۗۡۘۥۚۦۘۦ۫ۘۘۙ۫۟ۦ۠ۘۘۜۖۡۘ۠ۘۡ۫ۚ۟";
                    break;
                case -815701296:
                    str = "ۖۡۨۘۡۤۤۚۥ۫ۨۘۘۗۥۥۚۥۡۙۡۘ۠ۙۚۢ۬ۥۨۘۘۘۢۡۜۗۖۘۘ۠ۙۢ۟۫۬ۚۦۚۥۘۘۜۜۢ۠ۨۖۘ";
                    break;
                case -676843305:
                    super.attachBaseContext(context);
                    str = "ۛۦۥۘۦ۠ۦۘ۟۠۟ۛۚۖۘۛۤۖۦۦۘۥۥ۫ۛۚۘۘۡۨۡۖۘ۠ۡۧۜۘ۠۟ۙۖ۟ۥۘۖۨۨۘ";
                    break;
                case -52155791:
                    str = "۟ۦۘۘ۫ۖۘۘۨۥۥۘۜۥۦۘۨ۟۟ۚۛۡۧۛۡۘۘۘۖۘۙۖۢۤۚۨۘ";
                    break;
                case 12763916:
                    return;
                case 676685905:
                    MultiDex.install(this);
                    str = "ۧۢۗ۟ۦۖۘۦۨ۟۬ۚۧ۟ۚۘۘ۬ۦ۟ۤۨ۟ۥۙۢۖۙۥۘۚ";
                    break;
                case 1875415702:
                    C4173ni.OooO0o().OooO0O0(this, getPackageName(), ElfinFreeActivity.class, 100);
                    str = "ۜۤۨۘ۬ۛۢۧۚۥۘ۠ۘۘۘۨۧ۠ۙۦۖۘۧۗۜۧ۟۬ۡۙۥۤۜۘۙۢۜ۠ۨۛ";
                    break;
            }
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        String str = "۟۬ۗۢۨ۟ۘۦۥۘۦۤ۬۠۫۬ۦۥۨۚۛۘ۟ۢۢۧ۠ۧ۟۬۫ۜۚۘ۬ۖ۬۬ۙۧۙۘ۟ۚ۬ۨۤۥۘۦۡۛ۬ۤۨ";
        while (true) {
            switch ((((str.hashCode() ^ 57) ^ 641) ^ 711) ^ (-1521746462)) {
                case -1520928335:
                    C3681a7.OooO00o().OooO0OO(configuration.orientation);
                    str = "۟ۡۗۥۥۙ۫ۙۖۘۜۥۧۘۤۘۚ۟ۦۛ۠ۖۛ۫ۜ۠ۦۨۖۘۘۛۥ۠۫ۧۥۖۤۨ۟ۤۚ۠ۡۘ۫ۡۙۚۥۤ";
                    break;
                case -51753659:
                    str = "ۗۗ۫ۖ۠۬ۛۥۛ۟۫ۖۘ۠ۤ۬ۖۧۗۦۜۛۛۘۗ۠۟ۛۖۚۨۘۧۦۖۘۦۨۡۘۡۦۜۦۚۙۘ۫ۡۘ۬ۗۥۘۤ۬ۥۨۘۧۘ";
                    break;
                case 104140160:
                    str = "ۨۡۥۗ۫ۦۘۥۡ۫ۜۚۤۦۗ۠ۗۖۥۚ۠ۜۡۧۦۘۨ۫ۦۘۗۗۖ۫ۙۥۘۤۡۗۗۥۡۧۛۡۘ";
                    break;
                case 423867264:
                    String str2 = "۬۟ۘۘۗۡۚۛۡۨۘۦۧۧۡۘۗۗۡۦۨ۬ۤۨۗۢ۠ۚۗۤۛۦۘۡۛۖۧۚۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 2023464619) {
                            case -324133019:
                                str = "۫ۦ۬ۥۜۘۘ۟ۨۙۨ۫۟۠ۖۙۙۦۨۛۨۛۙۛۤۗۧۧۢ۠ۙ۟ۘ۟۟ۜۘۡۦۘۘۥۜۗۚ۠ۡ۠۟ۨۧۗۦۚ۟ۗ";
                                continue;
                            case 818088644:
                                str2 = "ۤ۫ۤۜۘۛۨۘۧۘۛۛۛۙ۠ۘۚۛۖۙۦۘۘۦۢۜۘۙۡۡۘۘۜۜۘۨۜۤ۟ۘۚۤۚۢۦ۫ۚۙۨۘۘۘۘ۟۬۟ۧ۫ۨۘ";
                                break;
                            case 1550315548:
                                String str3 = "ۖۚۖۛۧۖۘ۠ۜۤۢ۫ۨ۫ۦۖۘۡۗۘۛ۫۬۫ۗ۠ۧۙۚۢۢۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-611216969)) {
                                        case -392755826:
                                            str3 = C4605z6.OooO0Oo().OooO0OO() != null ? "ۢۨ۫۟ۤۧۢ۠ۢۧۚ۠۫۫ۡۘۜۥۥۖۚۨۗۡۖۘۜ۠ۥ۫ۡ۠ۦۢۚۢۢۜ۟ۘ۠ۙ۫ۘ۠ۥ۠ۤۢ" : "ۘ۫ۘ۟ۘۖۘ۟ۥۦۘۤ۬۟ۥۧۘۡۖ۬ۖۤۘ۟ۥۗۚۚۗۘۤ";
                                            break;
                                        case -273503253:
                                            str2 = "۬ۛۦۘۖ۟۠ۘۨۡۢۗۨۜۘۜ۠ۥۤۥۡۥۘۚۙۥۘۙۛۦۜۢۚۘۧۢۨۖۢ۬ۙۛ۠ۘۡۘۛۥۥۘۢۧۤ";
                                            break;
                                        case 289806133:
                                            str3 = "ۧۢۧ۫ۖۙۜۨۙۗۙۙۡۗۛۢۖۨۘۗۨۥۘ۟ۧۜۘۖۖۜۘۧۢۗۙۤ۠ۢۗۥ";
                                            break;
                                        case 1883304673:
                                            str2 = "۫ۤۤۡۤۜۘۧ۬ۜ۫ۘۡ۫ۜ۬۬ۜۦۤۜۗۡۙۘ۠ۜۚۘ۫ۙۖ۠ۙۨۢۦۜ۫ۙۘۡۘۥۦ۬۟ۗۥ";
                                            break;
                                    }
                                }
                                break;
                            case 2147456758:
                                str = "ۚۖۘۘۚۛ۟ۧ۫ۥۘۘۙۧۘۜۘۦ۫ۨۖۜۡۗۤۛۙۛۜۘۡۧ۟ۢۘۗۛۛۨۘۜۦۖۘۚ۠ۦۘ";
                                continue;
                        }
                    }
                    break;
                case 619364556:
                    return;
                case 621596596:
                    C4605z6.OooO0Oo().OooO0OO().OoooOOo();
                    str = "۫ۦ۬ۥۜۘۘ۟ۨۙۨ۫۟۠ۖۙۙۦۨۛۨۛۙۛۤۗۧۧۢ۠ۙ۟ۘ۟۟ۜۘۡۦۘۘۥۜۗۚ۠ۡ۠۟ۨۧۗۦۚ۟ۗ";
                    break;
                case 908664100:
                    super.onConfigurationChanged(configuration);
                    str = "۟۠ۢۙۘۦۨۙۨۗۖ۟ۦۜۤۛۨۗۨۤۚ۬ۖۘۤۗۢۤۡۥۘۢۗ۟۠ۘۢۡۘۧۘۚ۫ۘۘ";
                    break;
            }
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        String str = "۬ۚۖۗۚۖ۬ۦۥۤۢۤۚۛ۫۠ۢۚ۟ۗۜۘ۟ۙۘۘۖ۬ۖۘۜۦۧۘ۟ۘۜۙۘۦۘۘ۫ۙ۫ۗۧۧ۫ۡۘۗۖۨۘۧۦۗۜۨۘ";
        while (true) {
            switch ((((str.hashCode() ^ GuideToClickView.C0870a.f1446e) ^ 763) ^ 338) ^ 1501548157) {
                case -1144572164:
                    String str2 = "ۢۥۧۘۨۚ۫ۥۥۜ۠ۧۧۨۨۨ۟ۙۥۦۤۨۖۘۨۜۙۜۚۦۘ۫ۚ۟ۜۤ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 1888222801) {
                            case -216803841:
                                str = "۠ۘ۫۫ۖۥۗۘ۠۬ۛۜۘ۬ۡۘۘۘۜۘۗ۫ۙۢۥۚۛۦۥ۟ۘۢ";
                                continue;
                            case -141867464:
                                String str3 = "ۦۗ۬ۛۘۤۘۜۨۤۥۦۘ۠ۗۜۘۖۖ۟۠۟ۢۜۦۘ۫۠ۦۘۜۡۛۤۧۦۡ۠ۡۖۖۨۘۗۤۛۨۗۡۘۥۖۦۖۛۗۜۖۥ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1069496063) {
                                        case -1565112667:
                                            str3 = "ۧۤۢۢ۫ۙۦۡۖۗۚۚ۫ۚۘۘۗۖ۬۠ۥۨۘۨۖۘ۬ۗۧۧ۟۠۟۫۟ۥۦۤ";
                                            break;
                                        case 557667269:
                                            str2 = "ۡۙۢۗۘۚۢۗۨۘۦۤۖۘۚۨ۫۠ۤۦۘO۟ۥۖۘۘۙۛۥۚ۫ۙۗۚۘۚۡۨۦۤۨ۫ۗۘۨۙۢۥۘ";
                                            break;
                                        case 1189279635:
                                            str3 = this.Oooooo0 ? "ۗ۫ۙ۫ۙۨۘۗۦۨۡۚۛ۟ۢۘۘۗۛ۬ۚۨۛۚ۟ۛۤۨۘۤۚۨۡۢ۫ۘۨۙ۫۟ۖ۬ۖۙۖۢۨۘۧ۟۟۟ۡۘۘۚۛۜ" : "ۥۡۥۘۤۧۗۖۚ۬ۖ۟ۛۤۜۛۚ۠ۙۘ۬ۗۧۗۛ۬ۢ۫۠";
                                            break;
                                        case 1767500493:
                                            str2 = "ۥۥۖۘۨۥۘ۫ۘۚۤۧ۟ۦۥ۟ۦۢ۫ۖۛ۫ۢۡ۟۫ۥۡۘۡ۬ۥۢ۬ۥۖۡۨۘ۟ۨۗۙۙ۫";
                                            break;
                                    }
                                }
                                break;
                            case 667731616:
                                str2 = "ۧۘۘۜۘۥۘۙۦۗۡۢۙۗ۬ۛۥۚۖ۫۟ۥۘۦۗۖۨۖۦۘۚ۠ۖۗۜۦۚۦۦۘ";
                                break;
                            case 1166648074:
                                str = "۠ۤ۫ۢۜۗۢۚۡۘۛۘۜۘۘ۟ۦۖۨۡۘۚۖۦۘۚۖۥۘۧۚۖۜ۟ۥۢۗ۟ۥۧ";
                                continue;
                        }
                    }
                    break;
                case -290147043:
                    C4580yi.OooO0oO().OooO(this);
                    str = "ۜۛۘ۬ۧۥۦۧ۬ۤ۫ۢۡۘۘۦۧۗۘۧۤۖۨۢۖۚۨۘ۟ۥۦۨۥۜۘۛۦۙۨۨ۠ۖۖۗۧۘۨۧۥۖۚۡۘۨۚۦۘ";
                    break;
                case 208456176:
                    OooO0Oo();
                    str = "ۥۨۖۘۜ۫ۥۘ۟ۡۚ۠ۛ۬ۢ۠ۨۘۢۚۘۘۙۨ۬ۢ۟ۢۥۜ۬ۜ۫۟۠ۗۗۙ۟ۧۛۥۧۘۧۖۤ";
                    break;
                case 250918912:
                    C4173ni.OooO0o().OooO0Oo(this);
                    str = "۠ۜ۟ۧۤۚۘ۠ۘۘۙۡۜ۠ۜۜۘ۠۟ۡۘ۫۠ۚۗۜۨۤۙۥۘۤۡۛۚ۫ۤۥۘۧۘ";
                    break;
                case 301453183:
                    str = "ۛۘ۠ۜ۬ۗۚ۠ۜۘۗۢۚۡ۠ۥۗۨۦۜۢۤۥۤۦۗۦۘۧۥۡۘۚۙۨۘۜ۟۟ۥۛۘۧۦۥۘ۠ۘۙۨ۟ۖۘ";
                    break;
                case 547583192:
                    C4419u5.OooO0O0(this);
                    str = "ۢۘۨۡۘۖۘ۠۬ۢۦۥۘ۬۬ۙۗۗۡ۬ۜۛۧۜۜۘۛۡۧۘۡۤۖۘۦ۬ۗۧۨۨۗۛۡۘۚۖ۟";
                    break;
                case 826008322:
                case 1819062621:
                    str = "۬۠ۜۘ۟۫ۖۘ۟ۤۜۦۚۘۘۧ۬ۦ۠۟ۦۘۨۘۚۘ۫ۜۛۥۦۧ۟ۙۥۛۖ۟ۖۗۥۧۡ۟۬ۖۘۘۢۦۚ۟ۖۙ۟۫۠";
                    break;
                case 949226811:
                    super.onCreate();
                    str = "۬ۢۦۘۜ۫ۤۧۤۖۖ۟ۘۘۜۛ۟ۧۖۘۘۨۧۡۛ۟ۥۘۡۗ۟ۧ۬ۚ۟ۧۙۤۧۨۜۨۧۧۖۖۤۨۧۥ";
                    break;
                case 1262687246:
                    return;
                case 1323129370:
                    OooO0OO();
                    str = "ۢۦۡۘۖ۠ۧۜ۫ۜۚ۟ۜۘۧۢۥۢۧۘۧۗۘۘۘۚۥۢۤۨۦۜۖۘۜۧۙۚۧ۟ۢۖۛۙۗۜۘ۠ۡۖۘۢۛۨۡۛۖ۬ۨۘ";
                    break;
                case 1771410155:
                    String str4 = "ۖۖۙۥۦۜۨۖۖۤۦ۫ۡ۟ۖۗ۠۠۠ۜۡۡۛ۟ۥۙۦۘۥۡۜۚ۫ۛۜۥۜۘۙۢۥۛ۠۬ۗۘۦۖۢۜۘ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1180161245)) {
                            case -2124832632:
                                String str5 = "۠ۨ۠ۚۤۦۘۧۦۛ۠ۨۘۘۜ۬ۤ۬ۨۖۘۧۘۦۘۖۤۡۜۥۡ۠ۤۘۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1603357025) {
                                        case -1985545148:
                                            str4 = "ۙۦۦۘۥۡۦۘۨۙۚۘۘۢۢۧ۟ۨۧۛۤۤۢۛ۫۟ۚۘ۟ۢۥ۠۬۬۟ۙۙۚۡۘۥۦۦۘۛ۠ۥۜۡۥۘ";
                                            break;
                                        case -1389527633:
                                            str5 = this.Oooooo ? "۬ۘۚۗۧ۠ۡ۠ۡۘۚۢۛۛۗۡۘۖ۠ۖۘۧۢۘۘۚۧۚۚ۬ۜۤۘۦۜ۫ۛ۟ۖ۬ۧۜۛۦ۬ۨۙۘۡ۫ۤۢ۟ۧۡۘۗۛۗ" : "ۦۖۖۚ۫۟ۧۨۡۚۡۜۘۙۡۨۘۛۜۧۘۘ۫ۖۘ۬ۤۥۢۗۙ۟ۘۧۘۡ۠ۙۛ۠۠ۗۘۤ۬ۚۨۥۨۖۘۡۨۤ";
                                            break;
                                        case -24288279:
                                            str5 = "ۤۗۨ۟ۡۖۘ۠۠ۧۘۚۜۘۦۚۨۘۨۗ۬ۙۦۢۧۘۢۥۧۥۢ";
                                            break;
                                        case 1681418441:
                                            str4 = "۫ۥۤۖۦۘۥۤۘۥۥ۟ۦۤۛۧۨۨۦۡۦۘۖ۫ۨ۫۫ۥۛۘۙۖ۫۠ۢۙۤ۠۠ۧۥۚۥۘۢۥۡۘ۠۟ۜ۫ۦۡۦۜۧ";
                                            break;
                                    }
                                }
                                break;
                            case -499379583:
                                str = "ۦۥۨ۟۬ۨۜۨۚۙۤۧۖۡۘۜۖۗۚۧۢۙۗۢۚۘۧۘۥۢۢۧ۟ۦۘۗۖۘ";
                                continue;
                            case -244073837:
                                str4 = "ۨۗۡۜۧۢۧۧۧ۫ۦ۠ۡۡۥۦۜۤۛۡۨۦۘۤۜۘۖۘۦۙ۫ۦ۫ۥۘۘ۟۬";
                                break;
                            case 2144420556:
                                str = "۠ۡۢۢ۬ۚ۠ۚۦۘۛۥ۬ۥۖۤۘۖۦۘ۬ۘۘۤۧۤ۫ۜۥۘ۟۬ۗۧۙۧۥۥۘۡۦۡ۬ۤۧ۬ۘۨۜۦۛۡۦۦۘۖۨ۠";
                                continue;
                        }
                    }
                    break;
                case 2041198002:
                    C3977i7.OooO().OooOO0O(this);
                    str = "۫ۛۧۘ۠ۗۦۢ۫ۡۜ۟ۛۛۥۘ۠ۗۡۜ۠۟ۗۗۥۘ۫ۥۡۘۢۜۦۜۘۧۘۡ۠ۙۘ۠۬ۡۥۘ۟۠ۡۘۙۥۛ";
                    break;
                case 2080285813:
                    C3792d7.OooO00o().OooO0O0(this);
                    str = "۬۠ۜۘ۟۫ۖۘ۟ۤۜۦۚۘۘۧ۬ۦ۠۟ۦۘۨۘۚۘ۫ۜۛۥۦۧ۟ۙۥۛۖ۟ۖۗۥۧۡ۟۬ۖۘۘۢۦۚ۟ۖۙ۟۫۠";
                    break;
            }
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        String str = "ۦ۟۬ۙۤۖۘۥ۬ۢۙۘۘۘۨۡ۬ۢۧۢۖۡۛۜۙ۫ۡۛۦۘ۬ۢ۟ۦۤۥ۬ۜۘ";
        while (true) {
            switch ((((str.hashCode() ^ 861) ^ 141) ^ UiMessage.CommandToUi.Command_Type.SET_LINE_VALUE) ^ 266758149) {
                case -1077115926:
                    return;
                case 69676955:
                    str = "ۦ۟ۜۘۜ۠ۨۘۗ۟ۨ۫ۢۖۘۜ۟ۥۘۚۦۡۘ۟ۗۘۦۛۘۚ۠ۥۤ۬ۥۧۗۚۦۘۢۚۨۖۘۦۙۜۘۙۡۗ۫ۧۛۤۤۨۘۧۢۨۘ";
                    break;
                case 810907261:
                    super.onLowMemory();
                    str = "ۤۨۧۘ۫ۙۡۙۢ۬ۗۨ۟ۥۜۛۦۤۚۦۥۘۦۡۨۘ۬ۧ۟۠ۗ۬ۧۧ۫ۗ۠۬ۙ۠ۡۘ۠ۜۡۦۢۙۗ۟ۗ";
                    break;
            }
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        String str = "۫ۙۡۘ۠ۦۨۚۤۗۙۗ۫۫ۘ۠۫ۜۘ۬ۙۦۘۦۙۨۘ۬۫ۚۤۡۦ";
        while (true) {
            switch ((((str.hashCode() ^ 626) ^ 365) ^ 246) ^ (-495748166)) {
                case -252277379:
                    super.onTerminate();
                    str = "۬ۖۢۡۘۚۧۦۜۨ۫۟ۙۖۜۙۚۚۜۤ۬۫ۘۡۘۤۛۡۘۨۖۘۙۙۗۢ۠ۡ";
                    break;
                case 52387383:
                    return;
                case 1495964434:
                    str = "ۖۨۢۖۜۥۘۤۛۘۘۖۛۦۘۖۜۥۗۤۗۥۥۗۙ۠ۨ۟ۡۜۥۘۦۡۥۖۘۘۘۘۢۡۦۘۤۗۦۚۙۡۘ۫۟ۥۖۖۗۚۧ۬";
                    break;
            }
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        StringBuilder sb = null;
        String str = "ۢۥۜۦۦۥۘۖ۟ۚۙۨۡۖۖ۫ۥۘ۬ۙۥ۟ۛۛ۟ۛ۬۬۫ۚ۬";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.SET_BACKCOLOR_VALUE) ^ 569) ^ C4095le.o0000O00) ^ (-2065996279)) {
                case -1890314526:
                    sb.append(i);
                    str = "۠ۚ۟ۘۜۙۨۘۛۙۧۧ۬ۜۥۧۢۘۘۖ۬ۘۜۖ۫۫ۘۘۘۧۗۛ";
                    break;
                case -444706743:
                    return;
                case 742678253:
                    sb.append("onLowMemory:");
                    str = "ۦۧۨۢۚۛۧۧۗ۟ۢۖ۟۟ۘۘۦۦۦۤۡۜ۫ۛ۫۠ۖۧۧ۫ۗۖۨۖۥۥۤۧۗۜۗۤۦۘ۠ۥۨۜ۠ۙ";
                    break;
                case 909052026:
                    str = "۠ۛۥۤ۟ۙۧۜۜۘۤۚۖ۟ۨۘۚۥۖۜۜ۬ۦ۬ۥۨ۠۠ۢ۟ۨۘۥۡۘۘ۠ۤ۟ۡۨ۬۠";
                    break;
                case 1090808558:
                    sb.toString();
                    str = "ۨۧۜۜ۫ۦۘۥۧۥۘ۫ۜۦۘۡۨۨۘۡۦۧۧ۠ۦۘۖۚۘۖ۬ۡۗ۬ۡۙ۬ۤۖ۠ۘۘ۫ۗۧۨۡۨ";
                    break;
                case 1341462308:
                    super.onTrimMemory(i);
                    str = "ۘۧ۟ۚ۬ۦۘۜ۫ۦۘۘۖۧۘۖۚۦۘۚۨۧۢۚۡۨۚۨۘ۠ۢۚۡۜۦۘۦۨۗۗۥۘۤۦۥۛۤ۠";
                    break;
                case 1513157852:
                    str = "ۚۛۚۡۗۥۙۤ۟ۛۤۜۤۘۧۛ۠ۜۥۥۡۘۥۗۦۡۛۚۧۢ";
                    break;
                case 1941539889:
                    sb = new StringBuilder();
                    str = "ۙۧۥۢۥۘ۬ۜۚۦۦۧۜۨ۬ۡۡۖۘ۟ۗۙۢۙ۠ۨ۫ۘۖۖۡۘۢۡۚۨۦۚۗۖۥۗۖۥ";
                    break;
            }
        }
    }
}
