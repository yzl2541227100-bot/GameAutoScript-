package com.cyjh.elfin.floatingwindowprocess.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.telephony.TelephonyManager;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.elfin.entity.ElfinFloatViewEvent;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import com.ywfzjbcy.R;
import p285z2.C3718b7;
import p285z2.C3788d3;
import p285z2.C3977i7;
import p285z2.C4010j3;
import p285z2.C4014j7;
import p285z2.C4095le;
import p285z2.C4125m7;
import p285z2.C4273q7;
import p285z2.C4529x4;
import p285z2.C4605z6;
import p285z2.InterfaceC3865f6;
import p285z2.j10;

/* JADX INFO: loaded from: classes.dex */
public class FloatingWindowService extends Service {
    private static final String Ooooo0o;
    public static final int OooooO0 = 1;
    public static final int OooooOO = 2;
    public static final int OooooOo = 8;
    public static final int Oooooo = 102;
    public static final int Oooooo0 = 11;
    public static final int OoooooO = 101;
    public static final int Ooooooo = 201;
    public static final String o00O0O = "PARAM_V";
    public static final String o00Oo0 = "PARAM_KEYS";
    public static final String o00Ooo = "script_service_key_type";
    public static final String o00o0O = "script_service_key_encrypt_value";
    public static final String o00oO0O = "PARAM_APP_2_DOMAIN_NAME";
    public static final int o00oO0o = 1;
    public static final String o00ooo = "script_service_key_sec_value";
    public static final int o0OoOo0 = 202;
    public static final String o0ooOO0 = "PARAM_AUTH_KEYS";
    public static final int oo000o = 0;
    public static final String ooOO = "script_service_key_bundle";
    private final Handler OoooOoO = new Handler();
    private final String OoooOoo = "android.intent.action.PHONE_STATE";
    private PhoneStateReceiver Ooooo00;

    public class OooO00o implements Runnable {
        public final FloatingWindowService OoooOoO;

        public OooO00o(FloatingWindowService floatingWindowService) {
            this.OoooOoO = floatingWindowService;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "ۜۢ۠ۙۘۙۢۨۛۨۘۙۡۘۘۚۦۤۦۗۢۢۢۥۘۘۤۖۘۧۗۥۘۧۨۨۘۙ۬ۥۖ۠ۗۧۦۗۡۗۗ۟ۡۘ۬ۚ۫ۘۦۛ";
            while (true) {
                switch ((((str.hashCode() ^ 515) ^ 144) ^ 430) ^ 43758860) {
                    case -1655716266:
                        str = "۫ۥۘ۟ۘۗ۫ۜ۫ۛۚۨۘۤۚۖۘۥۦۨۘۥۗۗۢۜۖۢۖۙۛ۟۬ۥۜۖ۫ۛۖۘۧۖۥ۠۫ۡۧ۟۫ۛۡۦۘۘۦۡۧۢ۟";
                        break;
                    case 1642866246:
                        j10.OooO0o().OooOOOO(new ElfinFloatViewEvent(10101));
                        str = "ۢۢۛ۟ۧۡۘ۫ۥۙۧۦۢۦۗۧۧۦۜۙۛۨۘ۠ۡ۠ۧۦۦ۟۠";
                        break;
                    case 1918270481:
                        return;
                }
            }
        }
    }

    public class PhoneStateReceiver extends BroadcastReceiver {
        public final FloatingWindowService OooO00o;

        public PhoneStateReceiver(FloatingWindowService floatingWindowService) {
            this.OooO00o = floatingWindowService;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int callState = 0;
            String str = "ۗ۠ۨۘۛ۬ۗۤ۠ۘۜۛۡۗۙۧۤ۫ۚۦۜۥۚۘۘۖ۫ۨۘۚۢۘۘۤۛۖۤۦۖۘ";
            StringBuilder sb = null;
            StringBuilder sb2 = null;
            TelephonyManager telephonyManager = null;
            StringBuilder sb3 = null;
            String action = null;
            Boolean bool = null;
            while (true) {
                switch ((((str.hashCode() ^ 986) ^ 438) ^ 308) ^ (-145858528)) {
                    case -1397043713:
                        sb3.append(">>>>>>action>>>>");
                        str = "ۗۦۜۘۘۦۥۘۧۢۘۖۘۛۨۦۖۘۤۢ۫ۡۗۗۙۘۦۘ۬۠ۡ۟۫ۨۘ";
                        continue;
                    case -1261939429:
                        sb2.append("tm.getCallState()>>>>");
                        str = "۠ۚۙۚۡۜۘ۠ۖ۟ۡۤۡۥۖۜۖۨۧۨۥۖۘ۬ۛۡۖۘۦۛۖۧۤۡ۬ۡۜ";
                        continue;
                    case -991670829:
                        str = "ۥۘۜۢۗ۠۬ۤۗۖۦۚۖۘۥۘۥۘۥۘۨ۠ۥۡۙۖۘۗۡۙ۬ۥ۠ۡۡۧۘۚۛۜۘۧۙۜۛۡۥ";
                        continue;
                    case -948761771:
                        String str2 = "ۚۙۡ۫۬ۡۘۚۖۥۡۦۧۗۥۥۡۨۜۧۗۙۜۡۖۧۛ۫۫ۧۡۡۘۘۚۦۤۛ۫ۦۘۖۨۨۦۢ۬ۦۘۢ۫ۖ۟ۚۤ";
                        while (true) {
                            switch (str2.hashCode() ^ 1481613517) {
                                case -1120165435:
                                    String str3 = "ۖۥۡۘۡۨۡۘۧۤۦۢۗۖۘۡۤۦۙۘ۟ۗۖۘ۫ۧۜۦۨ۫۬ۜۧۘ۠ۡۧۘ۫ۙۢ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 1322791849) {
                                            case -781775759:
                                                str3 = "ۙ۟ۙۚۗۗۖۘۛ۠ۧۛ۟ۘۤۨۘۜۧۨۗۖۛۖۖۥۘۙۦۨۘۘۧۧ۫ۦ";
                                                break;
                                            case -649192047:
                                                str3 = "android.intent.action.PHONE_STATE".equals(action) ? "ۗ۠ۢۖۧۚۨۧۤۛ۫ۦۗۛۚ۟ۦۗۘۥ۫ۦۨۘۨۚۤۛ۟۫۠ۘۥۢۥۨۘ" : "ۦۖۧۥۜۦۚۚۢ۬ۡۜۧ۠ۤۚۖۤۧ۫ۖۘۢۥۚۙ۫ۜۚۜۘ۠ۤۢۗۜۖۘ۟۠ۦۧ۬ۨۘۥۢۖۥۖۧ";
                                                break;
                                            case -348964798:
                                                str2 = "۠ۙۛۙۡۛۧۢۛۧۛۢۦۙۦ۫ۖۨۤۤ۟ۢۦ۠۬۫ۚۗۗ۫ۡ۫ۛۦۛ۬ۘۥ۟ۡۨۙ";
                                                break;
                                            case 471135644:
                                                str2 = "۫ۘۡۡۘۨۘۖۨۧۘۦ۟ۦۘۘ۫۬ۛ۫ۚۘۤۚۦۖ۬ۛۦۨۛ۫۟ۤۢ۫ۙۥ۟ۜۨۧۚۦۡۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case -613589900:
                                    str = "۬ۡ۬ۨۜۖۘۥ۠ۡۙۢ۟۬ۖۨۘ۬۠ۛۗۦۖۦۧۥۘۛۡۗۗۤۗۧۥۖۘۡۛۥۘۖۛۘۡۚ۬ۧۖۘۘۧۘۘۘ";
                                    break;
                                case 375318995:
                                    break;
                                case 1162337297:
                                    str2 = "ۤۚ۠۫۬ۨۖ۫۫ۤۛۚۨۧۘۖ۟۫ۡ۫ۧۧ۠ۧ۫ۥۧ۠ۗۧۡۥۢ۟۫ۛۨۖۜ۠۫۬ۘ۬ۚ۠۠ۘ۠ۧۧۢۡۡۘ";
                                    break;
                            }
                        }
                        break;
                    case -924302667:
                    case -84388518:
                        break;
                    case -825268446:
                        str = "ۤۙۧۖۖۖۜ۠ۥ۬ۙۨ۬ۡۘۖ۟ۡۘۤۤۚۛۧۤۨۙۥۘۤ۟ۖۦۘۛۢۚ";
                        continue;
                    case -822427704:
                        sb.toString();
                        str = "۠۠ۨۨۗۡۘ۟۫۟ۥۦۥۘۢۤۢۙۖۡۘۢۖۨۘۛ۟ۘۤۜۨۛۡۡۘ";
                        continue;
                    case -735418032:
                        str = "ۢۤۧۖۡۦۘۗۙۜۢۧۥ۠ۥ۟ۙۗۢۛۦۖۚۜۥۖۧۡۘۜۦۨۖ۫ۜۘۙ۠ۜۨۡۥۧۤۧ۬ۤۜ۬ۦۖۦۥۡۘۤۧ";
                        sb3 = new StringBuilder();
                        continue;
                    case -427606802:
                        String str4 = "ۘۖۨ۠ۥۧۗۥۘۛ۟ۙۤۖ۬ۦ۟ۨۘۨۙۨۤۢۨۘۥ۬ۗۤۦۘۨۛۘۘۜۚۖۤۦۨۘۢۨۖۘۤۙۥۜۘۙ";
                        while (true) {
                            switch (str4.hashCode() ^ (-1844737703)) {
                                case -1685195569:
                                    str4 = "ۙۧۘۖۡۧۘۚۖۖۘۦ۬ۧ۠ۘۡۖۛ۟ۖۗۡۘۖۥ۬۠۫ۚۦ۬ۦۘۛ۫ۘ۫ۚۗ";
                                    break;
                                case -1638277224:
                                    String str5 = "ۢۛ۫۫ۢۖ۟ۗ۟ۥۙۗۖۥۧۘۤۜ۬۬ۦۖۛۛۤۨ۬ۙۡۖۧۨۘۖ۫ۘۙۚۡۘۢۧ";
                                    while (true) {
                                        switch (str5.hashCode() ^ (-1661543179)) {
                                            case -2023494991:
                                                str4 = "۟۬ۗ۟۟ۧ۟ۤۘ۬ۜۧۘۜۜۜۘۡ۬ۧ۫ۨ۫ۦۘۢۤۤ۠ۘ۟ۦۘۚۘۙ۫۫۫";
                                                break;
                                            case -1665752395:
                                                str5 = callState != 1 ? "ۤۢ۟ۗۗۦۚۦۚۥۤۘۘۛۘۡۘ۠۟۠ۙۨ۬ۜۨۘۘۘۖۘۨۖۘۗۙۘۘۢ۠ۥۛ۟ۢۜۢۤۚۡۜۘۚۡ۟" : "۟ۗۡۗۢ۟ۗۗۖۘۡۗۦۘۥۚۜۘ۫ۥ۟ۢۦۡۘۘۧۛۖۖۡۗۘۗۚۢۙۗۥ۫۟ۢۦ۟ۦۧۘ۟ۗۦۘۧۧۙۖۗۜۜۜۘ";
                                                break;
                                            case -1619417151:
                                                str4 = "۫ۙۥ۬ۚۦۨ۟ۛۗۖۨۧۚ۟ۥۤۦۘۤۗۤ۠۟ۦ۫۬ۖۦۘۖۘ۠ۤۛۛۨ۫ۦۘۡۘۥ۬ۦۘۗۢۦ۠ۦۢۙۙۥۘۚۗ";
                                                break;
                                            case 2145607313:
                                                str5 = "ۡۙۙۦ۠ۜ۠ۙۨ۟ۚۖۘ۬ۛۨۡۦۚۧۦۨ۟ۨۥۢ۠ۙۦۧۖ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1233065191:
                                    str = "ۨ۫ۨۘۚۜۧۘۥۛۢۧۢۡۘۗۙ۟ۧۘۡۘۛۙۚۦۚۡۘۙۤ۬ۙۤۜۘۧۜۗ۟ۦۜۙۨۗۥۙۛۨۙۧۡۤۨ";
                                    continue;
                                case 1774123497:
                                    str = "ۗۚۜۙۗۦۘۥۗۤۤۖۧۘۙۜ۫ۛ۠ۥۘۙۙۗۚ۠ۖۤ۫ۦۤۡۘ";
                                    continue;
                                    continue;
                            }
                        }
                        break;
                    case -288595307:
                        str = "ۛۤۡۘۖۤۜۘۦۖۛ۫ۜۚ۫ۖۛۢۜۘۨۢ۫ۦۘۥ۫ۚۥۦۧۘ";
                        bool = Boolean.TRUE;
                        continue;
                    case 6195148:
                        sb2.toString();
                        str = "ۜۦۛ۠ۛ۫ۥۚ۠ۧۘۧۘۦۗۡۘ۠ۨۧۘۖۙ۟ۘ۟ۘۘۢۡۡۘۢۨۨ";
                        continue;
                    case 6508676:
                        sb3.append(action);
                        str = "ۙۙۤۢ۠ۜۘۗۜۘۘۡ۬ۥۘۙۦۧۘۛ۬ۡۘۛۤۙۙۥۨۘۛۘۘۨۗۦۘۜ۫ۘۘۖ۠۟ۡۚۤۜۛۘ۟ۡۘۘۤۡۥۘ";
                        continue;
                    case 22634185:
                        str = "ۨ۟ۡۨۛۗ۠ۙۖۦ۟ۨۛۘۚۜۧۜۖۡۥۢۤۨۘۖۨۘۦۚۗۤ۬ۡۘۨۛۛ۠ۘۡ۫ۗۡۘ";
                        telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        continue;
                    case 469768168:
                        sb2.append(telephonyManager.getCallState());
                        str = "۬ۧۥۖۙۡۦۥۜۡ۠ۘۘ۟ۧۦۘۗۙۤۦۡۖۘۗۛۥ۬ۦۜۖۛۖۘۖ۫۬ۥۤۗۥۗۜۦۛۘۘۡۤۖۚۤۜۥۖۜۘۚۘۧۘ";
                        continue;
                    case 599532256:
                        String str6 = "ۨۨۙۢۛۖۘۛۛۘ۬ۦۡۘ۟ۧ۫ۡۛۖۧ۟ۛۖ۫۬ۗۚۡۧۧۡ۫۫ۤۚۨ۬ۛ۬ۜۦۗۨ";
                        while (true) {
                            switch (str6.hashCode() ^ (-1460983014)) {
                                case -851657179:
                                    str6 = "ۖۙۙۦۗۨ۟ۢۥۖۚۖۘ۠ۢۘۨۗۦۘۦۖۖۚۢۜۘۤۡۦۖۜۖۥۖ۟۟۫ۡۙۦۘۙۜۧۥۙۛۧۡۜۘ";
                                    break;
                                case -713571156:
                                    break;
                                case 68661062:
                                    str = "ۙ۬ۙ۠ۧۨۘ۟ۤ۠۬ۘۘۘۡۥۜۛۤ۟ۧۖۥۢ۬ۦۘۘۦۙ۟۠ۘۦۥۧۢۨۘۤۗۥۧۧۢ۠۬ۚۜۘۨۥۛۡۘۦۢۨۘ";
                                    break;
                                case 1705536849:
                                    String str7 = "ۧۛۤۖ۟ۘۘ۟ۙۖۨۖ۫۫ۘۧۘ۟ۡۨۜۨۘۘ۬ۢۖۘ۟ۚۥۢۤ۠ۥۡۦۦ۠ۘۘۤۤۤۗۦۛ";
                                    while (true) {
                                        switch (str7.hashCode() ^ (-1644318676)) {
                                            case -1584514175:
                                                str7 = "۬ۥۡۡۜ۠ۖ۠ۛ۬ۥۘۗۛۘۥۙۦۡۙۘۘۖ۟ۖۘ۠ۢۢ۬ۥ۠ۛۢۦۢۧۨۘۥۛۚۨۤۘۘ۟ۚۜۘۢۦۜۘ۠۟ۥۨۨۨ";
                                                break;
                                            case 568406922:
                                                str7 = C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOO0O, bool) ? "ۤۤۤ۬۬ۤ۟ۙۨۘ۟ۖۨۘۙ۫ۖۘۙۚۨۘۛ۠ۧۤۥۡۘۡۛۖۖ۬ۖۘۤۜۖۘ۟۠ۖۘ۬ۛۡۡۧۘ" : "ۘ۠ۦۤ۟ۚۘۚۛ۟ۘۜ۠ۦۘۘ۫۠ۧۚۘۖۥۛ۟ۥۘۜۜ۬ۖ۬ۚۦۦۧۨ۫ۡۗۢۙ۫ۨۨۨۙۦۖۘۦۜۛۚۦۧ";
                                                break;
                                            case 932417748:
                                                str6 = "ۘۡۜۥ۫۬ۙۡۘۙۜ۠ۗۙۧۙ۫ۘۘۦۡۤۖۥ۟ۢۥۘۨۥۦ۟ۚۘۤ۟ۦۛۤۢۙ۬۫";
                                                break;
                                            case 1387919600:
                                                str6 = "ۥۨۤۗۗ۟ۨۜۨۗۧۘۙۜ۟ۧۢ۟۠ۙۙۥ۫۬ۥۛۥۥ";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 673007169:
                        str = "ۜۗۥۘۤۤۨۢ۬ۗۧ۠ۜۘۚۡۥۙۧۨۘ۫۬ۢ۟۠ۙۘۢۚ۫ۛۡۘ۟ۧۖۢۜۤ";
                        action = intent.getAction();
                        continue;
                    case 756981303:
                        sb = new StringBuilder();
                        str = "۬ۦۦۘۚ۬ۡ۟ۨۧۘ۫ۚۡۘۡۥ۠ۥۗۘۘۖۥۢۧ۫۟ۙۙۖۘۤۜۛ۟۠۫ۛۗۨ۟ۖۘۥۘۧۘۡۜ۟ۦ۟ۘۛۨۤۤۗ۫";
                        continue;
                    case 786236183:
                        sb3.toString();
                        str = "۬ۧۡۤۛۘۘ۬ۨۡۘۖۨۘۘۚۖۨۘۛۨۖۘۘۢۜ۠ۦۦۗۨۙۜۙ۬ۨ۟۫ۧۜۘ۬ۨۜ۫ۨۡۨۚ۫ۨۙۥۚۚۜۘ۬۟ۦۘ";
                        continue;
                    case 1200572210:
                        String str8 = "۠ۛۚۘۡۤۤۗۛۙ۠ۨۧۨۥۘۛ۟۫ۦۧۛۨۨۢۢۦۖۘۘ۠۟ۖۥۨۖۜۘ۬ۖۤۧۦۧۘ";
                        while (true) {
                            switch (str8.hashCode() ^ (-928308358)) {
                                case -1771620285:
                                    break;
                                case 1006137917:
                                    str8 = "ۨۖۖۘ۟ۖ۬ۦۖۛۖۛۘۘۢۜۨۘۤۚۥۘۖۛۨۘ۠۠ۦۘ۟ۙۤۦۙۥ۟ۤۡۘۥۥۡۘ";
                                    break;
                                case 1279825724:
                                    String str9 = "ۘۨۥۘۜۗۥۘۖۦۖ۬ۖۥ۬ۤۥۙۤۖۗۦۚ۠ۚۛۧۘۘۤۖۖ";
                                    while (true) {
                                        switch (str9.hashCode() ^ (-495964163)) {
                                            case -819475383:
                                                str9 = "ۦۜۡۘۛ۬ۡۢۛۦۘۡۢۦۖۧ۟ۛۘۨۘۛۨۧۘ۟۫ۘۗۛۥۖۚ۠ۛۜۨۖ۠ۜۘۜۥۙۛۚۙ۬ۧۜۘ۫ۗۜۘ";
                                                break;
                                            case -25895700:
                                                str8 = "ۗۧۨۘ۟ۜ۟ۧۢ۫ۢۜۧۘۛۨۜۧ۬ۙۢۘ۠ۙۚۖ۠ۛ۬ۥۜۘۢۙۜ۫ۛۢۚ۠ۥۜۗ۠۟ۥۘۖۗ";
                                                break;
                                            case 529738826:
                                                str9 = C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOO0O, bool) ? "ۙۥۖۘ۬ۧۥۦ۠ۨ۫ۡ۫ۙ۬۬۬ۤۘۘۥۘۘۖۥۤ۠ۢۢ۟ۗۛۢۤۡۥۤۡۘ" : "ۚۚۙ۠ۥۥۘ۟ۤۜۥۤۦۨ۟ۘۨۜۨۘۘۘۥۘ۫ۡۡۨۘۦۛۦۧۥۡۘۡۚۡۘۨ۟ۘۘۘۛۥۢۖۜۘۜۧۦۚۖۜۛ۬ۙ";
                                                break;
                                            case 1344246663:
                                                str8 = "ۗ۠ۡۗ۟ۦۘۤۖۥۨۚۥۤۛ۫ۜۨۡ۫ۖۙۘۖۗۘۦۨ۬ۢۜۘۨۘۧۖۡۘۢۗۜۘۤۘۨۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1722563610:
                                    str = "ۙۚۡۘ۫ۢ۠۬ۨۜۘۥۨ۟ۦۥۤ۬ۗۤۘۡۦۘ۬ۜۖۧ۠ۥۘۜۧۡۘۥۘۨۚ۬ۖۚ۠ۗۚ۟ۜ";
                                    break;
                            }
                        }
                        break;
                    case 1323154257:
                        String str10 = "ۨۤۡۘۨۧ۫ۜۖۢۢۨۨۖۤۖۘۖۙ۠ۥ۠۫ۜۗۦۛ۠ۦۙۗۦۖۡ۠ۡ۬ۘۘۚۛۥۘۤۨۛ";
                        while (true) {
                            switch (str10.hashCode() ^ 1653883084) {
                                case -2141342339:
                                    str = "ۤۨۛۙۡۨۡۚۘ۟۫ۥۘ۟ۛۜۚ۠ۖۘۚۦۜۧۘ۠ۡۡۡۘۙ۬ۡۜ۫ۜۜ۫ۡ";
                                    continue;
                                    continue;
                                case -1849587725:
                                    String str11 = "ۜ۬ۨۧۗۜۜۨۡۙ۫ۙۖۤۙ۫ۘۨ۫ۥۨۘۚۤ۫۠۠ۢۡ۠۫";
                                    while (true) {
                                        switch (str11.hashCode() ^ 2042724629) {
                                            case 726350910:
                                                str11 = callState != 2 ? "ۖۙۦۙۧۥۘۡۦۨۘۜۖۦ۫۠۫ۛۚۢۤۥۢۜ۠ۧ۟ۖۥ۫۫ۡۘۤۦۖۨ۫ۘۥۛۙۚۘ" : "۬ۖۤۡۖ۬ۚۖ۫ۨۦۜۖ۫ۙ۟ۜۘۡۜ۬ۚۤۡۖ۫ۖۘۘۤۨ۬ۡۢۡۙۧۗۤۙ۫ۢ";
                                                break;
                                            case 1316848784:
                                                str10 = "۟ۗۚۨۥۖۛۘۦۘۢ۟ۥۙۥۡۘۢۘۨۘۖۤ۠ۜۚۘۘۥۗۖۘ۟۠۟ۧۜۜ۫۬ۡۥۘ۟ۖۧۚۧۚۤ۠۟ۢۖۖ۠ۛۙ";
                                                break;
                                            case 1414067956:
                                                str10 = "ۚۜۙۥ۟ۜۘۥۡۘ۬ۢۚۡۗۚۙۤۜۥۧۨۘۧۥۦۡ۫ۦۘۛ۟ۛ";
                                                break;
                                            case 1883104712:
                                                str11 = "ۡ۫ۜۘۨۥۧۨۖۘۨۘۘۘۜۦۖ۫ۗ۠ۦۤۦۘۘ۬ۤ۟ۖۜۛۚۤۦۜۤ۫ۖۘۗۘۥ۫ۧ۠";
                                                break;
                                        }
                                    }
                                    break;
                                case 200048933:
                                    str = "۬ۧ۫ۨۥۙۚۤۤۨۧۘۘۗۨ۬ۧۥۚۦۜۦۖۖۥۥ۫ۨۡ۫۫";
                                    continue;
                                case 1041926667:
                                    str10 = "ۙۛۥۘ۬ۖۦۧۢۥ۬ۥۦۖۢ۟ۙۛۖۘۖۦ۬ۚ۫۫ۛۨۦۛ۠۟۬ۦۨۘۧۢۖۡۧۜۘۚۥۛ";
                                    break;
                            }
                        }
                        break;
                    case 1691983520:
                        str = "ۗۢ۠ۛۤۗ۬ۧۘ۠۠ۘۘۘۚۢۢۧۥۘۢۘۘۘۘۜۢۙۘۨۘ۬ۡۜۤۙۘۘ۬ۡۤ";
                        callState = telephonyManager.getCallState();
                        continue;
                    case 1733851561:
                        sb.append("继续选项>>>");
                        str = "ۦۡۜۘۙۢۚۡۡۘ۠ۦۖۘۚ۬ۦۡۘۘۨۨ۬ۙۙۗۖ۠۟ۗۚ۬۫ۧۥۦۙ";
                        continue;
                    case 1791354335:
                        str = "ۙ۬ۙ۠ۧۨۘ۟ۤ۠۬ۘۘۘۡۥۜۛۤ۟ۧۖۥۢ۬ۦۘۘۦۙ۟۠ۘۦۥۧۢۨۘۤۗۥۧۧۢ۠۬ۚۜۘۨۥۛۡۘۦۢۨۘ";
                        continue;
                    case 1793620946:
                        sb.append(C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOO0O, bool));
                        str = "۫ۤۦۘ۬ۚۘۥۢۢۡۦۖۤۥۙۖ۬ۖۡۙ۬ۚۢۨۘۗۤۛۥ";
                        continue;
                    case 1824003967:
                        C3977i7.OooO().Oooo0o0();
                        str = "ۤۘۜۘۦۤۦۗۖۜۘ۬۬ۤۨۡۗۨۦ۫۟ۚۜ۫ۖۨۘۛ۠ۤۥۢۚۜ۬ۗ۬ۤۨۧ۟ۦۚۙۥۧۙۜۘ۬ۚۛ";
                        continue;
                    case 2019876212:
                        str = "ۜۡۨ۫ۢۧ۠۫ۘۘ۬ۥۘۘۘ۫ۤۤۗۖۘۜۗ۟ۗۘۨۘۦۜۥۨۜۦ";
                        sb2 = new StringBuilder();
                        continue;
                    case 2033615417:
                        String str12 = "۫ۥۨۘ۠۠ۘۘۛ۟ۧۤۚ۠ۡۧۗۦۤۦۘ۟ۗۥۡۙ۟ۖۥۧۘۨۥ۫";
                        while (true) {
                            switch (str12.hashCode() ^ (-907262419)) {
                                case -2108947125:
                                    str = "ۙۘۦۘ۬ۨۜۘ۠ۖۘۥ۟ۧۧۗۗۤۘۡ۠۫ۡۤ۠ۥۘۘۙۦ۠ۘۥۡ۫ۙ۫ۧۦۦۖۤ۟ۤۡۥۖ۬ۙۥۨۢۡۢۖۥۨ";
                                    continue;
                                    continue;
                                case -1064390482:
                                    str12 = "۠۟ۨۦۛ۟۠ۚۜۘۙ۟ۜۘۦۥۨۡۖۨۢ۬ۛۚۧۨۘۜۥۨۘۨۨۜۡۧۜۗۙۦۘۙ۬ۥۡۥۢۜۧۤۚۦ۬";
                                    break;
                                case -87274359:
                                    String str13 = "ۖ۫ۧۖ۟ۦۘۨۤۦ۬ۡۖۘۘۧۤۤ۠ۛۥۥۗۡ۠ۖ۟ۗۦۗۘۗۢۖ۬۟ۤۢ";
                                    while (true) {
                                        switch (str13.hashCode() ^ (-931605837)) {
                                            case -1650914723:
                                                str12 = "ۗۡۗۡۧۨۘۨۗۜۘۧۢۥۘۨۢۡ۫ۥۖۘۛۗ۟ۘۜۘۗۛۖۜ۠ۥۡۘۗۧۘۦۘ۬ۖۨۜۘۤ";
                                                break;
                                            case -1200646728:
                                                str13 = "android.intent.action.NEW_OUTGOING_CALL".equals(action) ? "ۜۢۖ۫۫ۘۚ۠۠ۤۙۥۢۥۤۧۤۡۤۢۢ۟ۜۥۘۛ۬ۨۛ۟۫" : "ۖۤۨۘۡۧۘۛۡۦۘ۠ۧۤۗۦۥ۫ۙۚۜۛ۬۟۠۬ۛۡۦۤ۟ۘۘ۟ۖۨۘۘۜۢ۟ۤۦۘ۬۬ۤۨۙ۟ۧۜۥ";
                                                break;
                                            case -922626930:
                                                str12 = "ۗۙ۬ۢۜۨ۟ۙۗ۫ۦۡ۬ۗۡۘۥ۟ۨۛ۬ۨ۬۫ۤ۠ۘ۫ۘۘ۬ۖۨۘۚۤ۫ۜۛۢۙۜۗۡۜ۬۠ۤۘۘ";
                                                break;
                                            case 1928264720:
                                                str13 = "۬ۗۙۡۖۨۘ۫۠ۖۚۙ۟ۥۙۨۘۗۚۚ۟ۨۨۙۖۗۢۡ۟ۤۚۥۜ۠ۜۗۤۗ";
                                                break;
                                        }
                                    }
                                    break;
                                case 913343784:
                                    str = "ۘۦۘ۬ۨۥۤۙۦۛ۟ۛۤ۠ۜۘۖۢۢ۠ۦ۠ۖ۟ۧۧۘۜۡۜۖ";
                                    continue;
                            }
                        }
                        break;
                    case 2045994396:
                        return;
                    case 2124026802:
                        str = "ۢۗۜۗۤۤۛۛۡ۟۠ۦۘۗۙۜۙۡۦۘۗۖۧۛۘۗۡ۠ۖ۫ۧۨۘۤ۠ۢۚۥۦ۠۬ۚ۠ۘۛ";
                        continue;
                }
                str = "ۤۘۜۘۦۤۦۗۖۜۘ۬۬ۤۨۡۗۨۦ۫۟ۚۜ۫ۖۨۘۛ۠ۤۥۢۚۜ۬ۗ۬ۤۨۧ۟ۦۚۙۥۧۙۜۘ۬ۚۛ";
            }
        }
    }

    static {
        String str = "ۜۙۙ۬ۜ۫ۧۨۚ۫ۨ۫ۤ۠ۨۘۢۨۢ۬۬ۜۘۘۘۨۘ۠ۙۤۖۢۘۜۘۘ۠۫ۡ";
        while (true) {
            switch ((((str.hashCode() ^ 358) ^ 844) ^ 798) ^ (-1899388995)) {
                case -996828284:
                    return;
                case -384659734:
                    Ooooo0o = FloatingWindowService.class.getName();
                    str = "ۘۘۘ۟۠ۗۨۤۜۤۛ۠ۛۙۨۙۨۜۘ۟ۨۦۗۜۘۘ۫ۥۥۚۢۛ۫۬ۢۧۢ۟۬ۚ۬ۜ۠ۜۘۗۤۡۦۜۗ۫۟ۡۗۡۘ";
                    break;
            }
        }
    }

    private void OooO00o() {
        Notification.Builder builder;
        try {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            Resources resources = getResources();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = "ۗۡۡۧۘۜۚۜۨۘۨ۠ۗۢۥۘۤۗۜۘ۠ۦۢۘۦۡۘۙۧۖۘۜۨ۟ۜ۫ۛۗۨ۬ۦۥ۟۬ۥۡۘۚۚۨۘۢۗۧ";
            while (true) {
                switch (str.hashCode() ^ (-539403185)) {
                    case -1562014854:
                        builder = new Notification.Builder(this);
                        break;
                    case 212867745:
                        String str2 = "۠ۛۛۛ۟ۨۧ۟ۙۨ۟ۖۡ۬ۡۘۖۚ۟ۗۦۖۙۘۥۘۚۥۧ۠ۥۜۘۜۤۖۘۖ۟ۜۢ۫ۚۛۥۛ";
                        while (true) {
                            switch (str2.hashCode() ^ 1330508014) {
                                case -1952359389:
                                    str = "ۜۧۦۘۘۨۥۥۢۙۡۢۜۘۗۥۜ۠ۢۧۖ۟ۘۘۖۘۦۛۧۛۗۥ۠ۥۘۘۖ۬ۦۧ۠۠ۗ";
                                    continue;
                                case -984815328:
                                    str2 = Build.VERSION.SDK_INT < 26 ? "ۨۛۨۛۗۨۘۛۖۘۘۖۦۦۦۗۖۘ۬ۢۥۢۡۖۘۖۤ۫ۗۙۜۘ۟ۛۤۘ۫ۛۛ۠ۧۧ۠ۦ۫ۧۧۡ۠ۦۥۦۢ" : "ۜۗ۟ۚۗ۟ۘۦۘۘۗۜۥۘۢۖ۟۬ۨ۫ۨۖۜۘۛۜۘۤ۟۫۠ۡۜۛۨۦۘۖ۬۫ۢۧ۟ۥۨۗۙ۠ۙۖ۬۠ۖ۬ۖۨۦۤ";
                                    break;
                                case -573994516:
                                    str = "۫۠ۘۘۘۙ۫ۖۡۘ۬ۧ۫۠ۧ۟ۜۡۥ۬ۚۡۤۢ۬ۧ۟ۨ۠ۤۦ۟ۢۛۧ۠ۦۘۙۚۦۦۗ۬ۧۧۢ۠ۘۚۜۚۧۛ۠ۥۘ";
                                    continue;
                                case 1368102704:
                                    str2 = "ۘۜۘ۟ۘۘۥ۫۫ۢۨۦۘۨۛۤۘۨۘ۫ۢۘۘ۫ۨ۬ۚ۠ۘۢۖۤ";
                                    break;
                            }
                        }
                        break;
                    case 784451913:
                        NotificationChannel notificationChannel = new NotificationChannel("createRecordingNotification", "Channel1", 3);
                        notificationChannel.enableLights(true);
                        notificationChannel.setLightColor(-65536);
                        notificationChannel.setShowBadge(true);
                        notificationChannel.enableVibration(false);
                        notificationChannel.setVibrationPattern(new long[]{0});
                        String str3 = "۠ۖۗۜۚۨۘ۬۬ۧۡ۠ۨۘۢ۫ۙۤ۫ۥ۠ۛۦۘۡۜۛۛۥۧۘۖۥۖۘۖ۠ۨۦۤۜۚۤۘۘۨۦۦۜۨۦۘ۬ۚۦ۬ۚ۠ۧ۫ۥۘ";
                        while (true) {
                            switch (str3.hashCode() ^ 617827301) {
                                case 472710537:
                                    str3 = "ۧۥۗۧۜۜۙ۠ۖۡۥۤۚۢۘۦ۫۫۫۫ۧۡۧ۟ۘۙۘۘۙ۫ۧۦ۟ۡۖۗۚۦۘۖۘۙۤۡۘ۟ۜ۠ۡ۬";
                                    break;
                                case 812068863:
                                    notificationManager.createNotificationChannel(notificationChannel);
                                    builder = new Notification.Builder(this, "createRecordingNotification");
                                    break;
                                case 1232150918:
                                    String str4 = "۠ۘۧۘۧۥۥۘۡۧۡ۬ۜۙۦۧۨ۬ۦ۟ۧۗۖۧۦۘ۬ۖۤ۠۟۫۠ۗۢۙۗ۬";
                                    while (true) {
                                        switch (str4.hashCode() ^ 1686524709) {
                                            case -1796179669:
                                                str4 = notificationManager == null ? "ۜ۫ۡۘۚ۟ۗۨۖۡۖۜۗ۬ۧۥۤۖۚۨ۫ۘۘ۫ۧۖۘۛۜ۬ۦۧۧۦۘۦۘۡۛۘۘۥۘۘۢ۫" : "ۢ۬۬ۧۨۡۜۤۜ۟۬ۖۜۗۤۜۦۘ۫ۧۖ۟ۘۙۦۖۨۛۙۥۘۡ۫۫۫ۚۚۗۖۜۘ۬ۧۚ";
                                                break;
                                            case -1091072119:
                                                str3 = "ۜۦۢۢۜ۬ۛۢۢۗۛۡۢۡ۫ۜۦۥۘۡ۠ۨۘ۟۬ۨۦۜۦۘۨۦۨۘۛۧۨۜۛۡۘ";
                                                continue;
                                            case -646057524:
                                                str3 = "ۤۖۦۘۚۖۡۘۛۘۖۤ۫ۚۥۘۥۘۘۦۡۘۖۨۦۘۙۥۤۧۖۦۘ۫ۘ۬ۢۨ۬ۛ۫ۙۤۛۨۗۢۦ۠۠۬ۨۦۘۖ۠ۥۘۚۨ";
                                                continue;
                                            case 2098623242:
                                                str4 = "ۤۧۦ۟ۦۖۖۥ۬ۧۗۘۘ۬۠ۡۘۨۦۖۘ۬۫۫ۗ۠ۛۛۢۡ۫ۢۥ۟ۖۘۢ۟ۚۨۙ۫ۨۙۗ۟ۧۖۘۛۜۛ۫۫ۡۘۡۚۡۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1441555704:
                                    builder = new Notification.Builder(this);
                                    break;
                            }
                        }
                        break;
                    case 1470252110:
                        str = "ۨۙ۠۟ۜۢۤۥ۟ۜۗۜۛۦۨۚۗۤۜۚۨۢۘۢۦۦۚۚۚۛ";
                        break;
                }
            }
            builder.setTicker(resources.getString(R.string.app_name));
            builder.setSmallIcon(R.drawable.ic_launcher);
            builder.setWhen(jCurrentTimeMillis);
            Notification notificationBuild = builder.build();
            notificationBuild.icon = R.drawable.ic_launcher;
            notificationBuild.flags = 2;
            notificationBuild.flags = 34;
            notificationBuild.flags = 98;
            startForeground(getResources().getInteger(R.integer.notification_id), notificationBuild);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
    }

    private void OooO0O0(Intent intent) {
        Bundle bundleExtra = null;
        String str = "ۦۧۖ۫ۚۗۧۗۗ۬ۗۙۤۥۜۘۦۘۘۗ۟ۥۘۙۘۘۛۧۥۘۥۨۨۘۙۜ۫ۡۙۗۥۗۙ۫۫ۨۘ۬ۗۤۡۧۧ۟۫ۥ۬ۙۡۘ";
        int i = 0;
        while (true) {
            switch ((((str.hashCode() ^ 177) ^ 817) ^ 706) ^ (-1053914443)) {
                case -762105189:
                    break;
                case -50966432:
                    C4125m7.OooO0o0().OooO(bundleExtra.getString(o00Oo0));
                    str = "ۢ۫ۘۘ۠ۘۘۘۤۖۦۜۥۖ۫ۙۨ۫ۡۚ۬ۢۦۧۨۘۡۛ۠ۘۛۤۖۤ۠ۜۢۖ";
                    continue;
                case 37452079:
                    str = "۫ۨۨۘ۬ۨۜۘۨۥۤۖۜۧۘۢ۫ۚۘۛۥۘۧۧۛ۟ۘ۟ۖۧ۫ۜۧۥۘۦ۬ۡۖۘۨۘۘۢۗۤ۠";
                    continue;
                case 590926830:
                    String str2 = "ۘۤ۠ۢ۬ۦۘۘۚۘۘۢ۠ۨ۟ۦۛۘ۫ۦۘ۫ۖۢ۫ۛۗۗۜ۠ۤۜۛۚ۠ۥۨ۟ۥۗ۟ۧۤۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 1164882848) {
                            case -1521978305:
                                str = "ۥۨۘۘ۬ۜ۬۠ۤۥۥۙۢ۬ۢۖۘ۠ۨۨۡۦۘۘۡۙۨ۬ۧۤۙۘ۬ۨۜۖۘ۫ۖۨ۟۟ۘۘۦۦۗۜ۠ۦۗۜۡۘۡۗۗۦۖۘ";
                                break;
                            case -934708881:
                                String str3 = "ۘۘۥۜۚۡۙ۬ۡۘ۬ۦۤۜۧۥۙۨۘۘۚۙۥۘۧۦۖۧۡۘۡۢۥۘۥۦۙۚۘۧۘۨۛۡۡۡۘۢۨ۬ۗۦ۟ۜۖۧۘۡ۫ۨ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1686954296)) {
                                        case -1699273067:
                                            str2 = "ۘۥ۠ۨۗۙۛۖۧۙۦۘۜۡۖۖۖۧۘ۠ۥۧۘۢۢۘ۬ۤۡۢۨۗ";
                                            break;
                                        case -1386906086:
                                            str2 = "ۨۨۤۜۤۦۜ۬ۗۦ۟ۜۘ۠۫ۤۤ۬ۡۡۤۡۖۜۡۘۗۥۡۘۨۜۡ";
                                            break;
                                        case 637883452:
                                            str3 = "۫ۦۛۗۖۨۙۘ۫ۦۥ۟۬ۤۛ۫۫۫ۚ۟ۥۗۜۜۘ۬۟ۘۘۗۗۦۘۢۛۛۨۤ۠ۙۢۧۤ۫ۗ۟۫ۨ۫ۗۘ۫۟۟ۡۘ";
                                            break;
                                        case 1065263140:
                                            str3 = bundleExtra != null ? "ۜۗۥۘۜۗ۫ۦ۟۬۬ۨۛۘۡۧۨۛ۬ۡۘۘۗ۟۠ۖۢۗۛۦۘۤ۬ۚۦۚۘ" : "۫ۡ۠۫۠ۦۧۢۜۡ۫۫۬ۡۜۘ۫ۙۨۘ۠۟۬ۚ۠ۖۨ۠ۨۨۘ۫ۦۧۜ۫ۚۘ";
                                            break;
                                    }
                                }
                                break;
                            case -597426178:
                                str2 = "۫۬ۖۘ۟ۚ۟ۢۦۖۘۖۜۗۜۖۥۘ۫ۧۖۘۧ۠ۜ۟ۚ۠ۛ۠ۙۙۤۡۘ";
                                break;
                            case 1472678223:
                                break;
                        }
                    }
                    break;
                case 622480835:
                    C4125m7.OooO0o0().OooOO0O(bundleExtra.getString(o00ooo));
                    str = "۠ۜۙۜۚۨۘ۬ۙ۟ۙۡ۟ۖ۠ۨۘۨ۟ۜ۠۟ۜ۬۟ۜۘۥ۫ۧۥۙ۬ۗۦۜۘۙۦ۬ۨۘۤۦۨۜ";
                    continue;
                case 622855136:
                    String str4 = "۠۫ۖۗ۟ۨۘۖ۬ۢۚۙۧۗ۬۫ۥ۠ۥۘ۠ۦ۠ۜۥۥۛۤۢۦ۬ۧۦۨ۬ۦ۬ۥۘۥۡۡ۠ۨۡۡۦ۬ۡۦۗ۠ۤ۠ۨۡۧۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 1831141540) {
                            case -1888380259:
                                break;
                            case -1839489949:
                                str = "۟ۛۥۖ۟ۖۘۜۨۘۢ۟۠ۦ۠ۘۘۧۜۡ۠ۨۦۧۦۗ۟ۖۘۙۚۥۘ";
                                break;
                            case -390534089:
                                String str5 = "ۚۧۜۘۜۤۥۘۜ۬ۖۘ۟ۛۙۙۢۘۘۛۨۡۤۥۥۘۙۥۦۧۤۖۚۨۘۡۜۤۧۗۖ۠ۗۨۘۗۜ۬ۖ۠ۗۦۨۖۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 935342015) {
                                        case -40568617:
                                            str4 = "۬۟ۛ۫ۡۚۙۥۙۥۡ۠ۨۖۡۘۢۙ۟ۤۘۗۧۡۦ۬ۘ۟۠ۜۘۧۡۚۤۤۦۚۢۚۢۖ۫";
                                            break;
                                        case 648062580:
                                            str4 = "۟ۗۘۘۗۚۥۘۚۜۚۨۗۖۘۢۧۦۘ۠ۚۡۘۥۥۧۘۧ۬ۦۘۜۚۛۧ۠ۤ";
                                            break;
                                        case 1511066029:
                                            str5 = "ۥۢۦۘۜ۟ۖۜۛ۫۬ۤۚۡ۫ۤۧ۟ۨ۟ۦۜۜۤۚ۠۠ۨۥ۠ۨۘۨ۬ۗۤۦۥۙۥۜۚۤ۟ۢۡۙ۫ۥۡ";
                                            break;
                                        case 1584596478:
                                            str5 = i == 1 ? "ۦۤ۟ۚۨۨ۬ۘۧۖۗۚۧۘۢۘۚۢۧۜۙۛۚۘۘۙۧ۬۠ۡۧۘ۬ۨۜۘۘۘۘۘۖۜۦۘۧۨۢۨۖۡۘ۫ۘۨۡۧۨۘ۠ۤۘۘ" : "ۥ۫ۤۨ۠ۨۘ۫ۖۧۡۥۖۗۖۙۜۙۘۦۙۛۘ۫ۨ۟ۗۗۘۛۧۨۚۡ۠ۧ۟ۜۘۖۗ۟ۡۘۥۚۘۘۘ۫ۖۘ۬ۨ۟ۙۜۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case 566862921:
                                str4 = "ۢۗ۠۬ۘۡۗۖۘۘۗۜ۠ۗۡۤۜۚۦۖۗ۫ۨۛۥۗ۫ۥۘۦۜۡۘۥۤۗۛۙۜۘ۬ۗ۫ۡۦۜۘۖۜۛۖۡۦۘ";
                                break;
                        }
                    }
                    break;
                case 733610848:
                    String str6 = "ۡۘۦۘۤۜۜ۟ۘ۬ۤۦۡۥۙۛۡ۠ۤۙۘۡۘ۬ۧۦۘۢۙ۫ۡۛۨ۫ۙۘۘۨۤۦۘ";
                    while (true) {
                        switch (str6.hashCode() ^ (-126725098)) {
                            case -196980686:
                                str = "ۘۜۨ۠۬ۦۙۗۨۥ۠۟۟ۤۚۦ۬ۜۘۤۡۘۘۤۛۥۙۛۗۚۜۥۧۙۨۘ۟۬ۖۘۙۦۨۦۘۥۘۖۡۦۘۙۛۖۘۖ۟ۛ۫ۖۗ";
                                continue;
                                continue;
                            case 927253467:
                                str6 = "ۧۚۗۚ۬ۤ۬ۛۥۛۜۙ۬ۡۨۖۘۥ۠ۦۘ۠۟ۛۛۘ۫۫ۧۜۤۜۘۦۚۜ";
                                break;
                            case 1535911705:
                                str = "۫ۢۖۖۧۡۘۥۥۘۤۧۡۡۦ۬ۘۨۘۖ۟ۡۧۤۡۨۗۢۚۘۘۦۖۢۜ۫ۗ";
                                continue;
                            case 2080976776:
                                String str7 = "ۤۡۖۘۦۧۡۘۜۚۧۗۦۜۘۢۤۡ۫ۦ۫ۡۘۙۗۨۥۘۗۦۡۘۢۜ";
                                while (true) {
                                    switch (str7.hashCode() ^ 2113920289) {
                                        case -396036874:
                                            str6 = "ۗۦۜۥ۫ۡۦۙۘۘ۬ۙۛۡۧۡۢۡۦۘۢۙ۟ۢ۫ۥۜۘۖۘۦۡۙۤۥۦۚۥۖ۬ۜۘۡۗۖۘ";
                                            break;
                                        case 651859705:
                                            str7 = i == 0 ? "ۖۛۚۨۦۡۤۦۡۘ۫ۡۨۘۛۘ۬۫ۦۧۡۥۙ۬ۤ۟۟ۧ۫ۛۢۖ" : "ۚۙۨۘ۫۬ۥ۫ۖۜ۫ۗۥۘۤۢ۫ۙ۠ۨۗۘ۠ۨۜ۠۫ۡۗۧۤ۠ۢۛۗۖۜۡ";
                                            break;
                                        case 1164825626:
                                            str6 = "ۡۜۘ۠ۛۜۘ۠ۥۘۘۢۨ۟ۖ۠ۤۖۡۗۖۥۘۘۡۨۘ۟ۙۦۘۥۡ۫۠ۗۚۨ۟ۡ۠ۤ۫ۚۚۜ";
                                            break;
                                        case 1331559401:
                                            str7 = "ۤ۟ۡۜۡۘ۬ۤۜۘۥۦۘۘۡۨۘۘ۟ۦۜۘ۠ۙۛۢۢۦ۬ۙ۠۫۠ۡۤ۟ۘۘۥۗۨ۫۬ۨ۫۠ۨۘۧۖۙ۬ۡۥۜۘۘ۫ۦ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 757837640:
                    C4010j3.OooO0O0 = bundleExtra.getString(o00O0O);
                    str = "۟ۜۢ۟ۙۖۘۧ۬ۦۖۢۗ۟ۦۘۗۗۛ۬ۗۧ۫ۤۨۘۛۙۖۖۜ۬";
                    continue;
                case 815651625:
                    C4010j3.OooO0OO = bundleExtra.getStringArray(o0ooOO0);
                    str = "ۘۚۙۤۗۢۥۢۡۧۤۨۧۙۖۨۘۧ۬ۖۘۨ۠۫ۖۢۛۡ۠ۥۘۛۛۜۛ۠";
                    continue;
                case 914505573:
                    C4010j3.OooOOOo(bundleExtra.getString(o00oO0O));
                    str = "۫ۡۨۥ۫ۛۨۖۜۚۥۥۨۨۖۤ۠ۥ۬۠ۖۘۥ۫ۘۘۥۧ۫ۚۜۥۛۜۘۧۧۗۚۨۚۢۖۧ";
                    continue;
                case 1178758339:
                    C4125m7.OooO0o0().OooOO0(bundleExtra.getString(o00o0O));
                    str = "ۖۧ۫۠ۨ۠ۧ۫ۚۘۛۜۜۗۧ۬۠۬ۖۘۡۨۥۘۦ۬ۖۚۗ۟ۛ۬ۚۚۜۤۜۜۦ۫ۥۥۘۙۤۧۙۗۖۢ۠ۖۦۛۦ";
                    continue;
                case 1419941356:
                    bundleExtra = intent.getBundleExtra(ooOO);
                    str = "ۢ۫ۦۘ۬۫ۚۦۖ۟ۘ۟ۚۦۛۘۘۗۘ۬ۖ۬ۘۘۧۘ۠ۨۡ۫ۢۖۖۢۙۦۡۜ۬";
                    continue;
                case 1461788737:
                    str = "۠ۖۧۜۦۦۘۡ۠ۜۘۛۗۛ۟ۢۥ۬ۤۘۘۢ۬۟ۗۜۙۚۙۗۤۚۤ";
                    continue;
                case 1547406437:
                    C3718b7.OooO0Oo().OooOOO();
                    str = "ۘ۫ۦۘ۫۟ۚۛ۫ۛۨۦ۠۬ۧۨۖ۫۟۬۫ۙۖۨۘ۟ۤۜۘۗۥۘ۟ۦۦۘۡۚۦۘ";
                    continue;
                case 1760071835:
                    return;
                case 1949270835:
                    OooO0Oo();
                    str = "ۥۧۖۨۥۜۦ۟۬ۥۛۘۘۧۛۡۘۛۘ۬ۚۚ۟ۡ۬ۡۘۦۥۘۨۘۥۘ۠ۤۜۘۢ۠ۖۘۡۘ۟ۘۤۨۨۙۖۤۨۘۤۛۜۘۢۗۘ";
                    continue;
                case 1993065023:
                    i = bundleExtra.getInt(o00Ooo, 0);
                    str = "ۙ۟ۛۦۦ۟۬ۖۘۢۗۖۜۡۦۘۥۡۢۦۛۡۘۘۛۡۢ۫ۖۘۜۘۜ۠ۗ۬ۘۘۡۘ";
                    continue;
            }
            str = "ۘ۫ۦۘ۫۟ۚۛ۫ۛۨۦ۠۬ۧۨۖ۫۟۬۫ۙۖۨۘ۟ۤۜۘۗۥۘ۟ۦۦۘۡۚۦۘ";
        }
    }

    private void OooO0OO() {
        String str = "ۖۙۖۘۗۛۖۘۚۘۗۗۛۜۘۥ۫۬ۙۦۧۘۙۦۘۘ۫ۦ۠ۤۨ۠ۗ۬ۡ۟۬۫ۘۗۧۗۦۘۘۢۧۖۦۨۘۤۡۦۘ";
        while (true) {
            switch ((((str.hashCode() ^ 945) ^ C4095le.o0000O) ^ 652) ^ 51898164) {
                case -1118214427:
                    OooO0Oo();
                    str = "ۚ۫ۘۘۛۛۡۚۗۧۜ۬ۡۘۛۤۚۙۨۘۘۘۗۖۘۘ۫ۦۘ۬ۙۚۗۨۜۘۡ۟ۥۘۛۜ۬ۦۥۜۗۢۧۚۛۢۛ۟ۛ";
                    break;
                case -256321557:
                    C4605z6.OooO0Oo().OooO0o(this);
                    str = "ۙ۬ۢۤۘۦۚۢۛۜۢۧۥۛۤۨۧۖ۬ۧۚ۠ۦۛۧۤۨۛ۠ۙ۫ۜۖۘ";
                    break;
                case 1569706493:
                    return;
                case 2123121646:
                    str = "ۖ۬ۧۨۚۜۘۥۢۙ۟ۖ۫ۗۦۦ۫۬ۖۘۤۧ۫ۗۨۡۛۜۘۚۦۖۘۨۗۜۢ۬ۡۘ";
                    break;
            }
        }
    }

    private void OooO0Oo() {
        String str = "ۖۤۧۦۖۦۘۥ۠۬ۧۦۜۨۜ۫ۢۙۥۘۛۚۧ۬ۛۖۨۨۘۘۗۢۢ۟۠ۜۧۡۧۥۡۜۦۖۘ";
        while (true) {
            switch ((((str.hashCode() ^ 388) ^ 49) ^ 939) ^ 1147134574) {
                case -241822353:
                    C3977i7.OooO().OooOOO0(C3718b7.OooO0Oo().OooO0OO(), C3718b7.OooO0Oo().OooO0o0(), C3718b7.OooO0Oo().OooO0o());
                    str = "ۦۙۦۘۦۡۘۘۡۢۚۚۗۚۘۙۧۢۢۧۧ۟ۗۜۗۜ۬ۙۧۖۥ۫ۦۛۨۖ۠ۘۘ۠ۡۖۢۗۢ";
                    break;
                case -207944056:
                    str = "ۨۨ۠ۜ۠ۡۘۘۙۙۧۙۡۘ۟ۛۜۧۨۘۘۛۖۦۘۧۗۥۘۘۗۥۘ۬۫ۙۘۜۨۘۡۧۚ۫ۘ۬ۘۢۨۘۖ۠۬ۛۚ۬";
                    break;
                case 1459538417:
                    C3718b7.OooO0Oo().OooO();
                    str = "ۨۘۜۧ۠ۥۘۨۙۨۥۚۛ۟ۖۦۘۢۚۡۘۤۖۜۘۤۜۡۢۥۘۗۧ۫ۚۙۖ۟ۢۗ";
                    break;
                case 2062481820:
                    return;
            }
        }
    }

    private void OooO0o0() {
        String str = "ۘۖۡۘۗۜۘ۫۬ۨۨ۟ۨۘۘۥۧۘۦۖۡۥۚۘ۬ۛ۠۬۬ۧ۬ۘۦۘۖۜۨۘۖۨۢۡۡۖۘۨۨۦۘۢۛ۟۠ۢۘۘ";
        while (true) {
            switch ((((str.hashCode() ^ 850) ^ 177) ^ 183) ^ 1583511847) {
                case -255174716:
                    C3718b7.OooO0Oo().OooO00o();
                    str = "ۛۘ۬ۤۤۡ۟ۜ۠ۚۖۧۘۖۗۖۘۤۥۗۨۤۨۛۙۘۡۙۘ۫ۨۘۢۖ۟ۡ۫";
                    break;
                case -127376259:
                    str = "ۥ۟ۦۘۨۙۨۙۚۙۜۖۜۘ۫ۤ۠۟ۤ۫ۘ۟ۖۗ۟ۨۘۦۧۤۤۖ۠ۗۖۛۘۡۖۘ۬ۧۥۖۛ";
                    break;
                case 95753067:
                    C3977i7.OooO().Oooo0o();
                    str = "ۛ۫ۚۡۜۧۜۢۨۘۘ۟۟ۢ۠ۦ۟ۥۘۘۢۚۨۘ۟ۛۜۨۤ۟ۢۚۖۙۡ۬ۤ۟ۦۘۢۖۜۙۡۢۦۦۗۧۡۨۘۖۤۨۘۗۛۦۘ";
                    break;
                case 670984260:
                    C4605z6.OooO0Oo().OooO0O0();
                    str = "ۡۧۜۛۗۧۦۡۧۖ۠ۗۘۢۢۚ۟ۖ۫ۘۘۚ۬ۨۦ۠ۘۘ۠ۜۧۘ۫۫ۨ۟ۚۢ";
                    break;
                case 1909084371:
                    return;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String str = "ۨ۫۫ۛۤ۫۬ۖۦۘۖۨۘۘۢۢۘۨۖۗۚۙۜۘۛۧۖۖۧۦۘۢۤۥۚۙۘۘۦۛۢۨ۠ۡۤۖ۫";
        while (true) {
            switch ((((str.hashCode() ^ 384) ^ 716) ^ 351) ^ (-1857888639)) {
                case -1801181466:
                    str = "ۙۙۛۚۧۗۜ۬ۢۥ۫ۘ۫ۦۧۘۧۘۥۦۜۢۥۢ۟ۥۥۘۥۜۙۛ۟ۥۛۤۥۘۜۙ۬ۘۧۥۧ۟۟ۥۤۥۘ";
                    break;
                case -171271716:
                    str = "ۧ۬ۗۖۖۖۘۢۗۖۘ۫ۜ۫ۤ۠ۜ۬۬ۧۙۦۚۢۨۦۙ۠ۘۗۡۚۥۨۘۤۙۡۗ۠ۙۥۧۚ۟ۘۨۜۡۤۡۗۘۘۦۖ";
                    break;
                case 1261551279:
                    return C4014j7.OooO0O0().OooO0Oo().getBinder();
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        IntentFilter intentFilter = null;
        String str = "ۥۨۙۜۦ۬ۥۖۢۘۗۥۘۤۘۖۤ۠ۡۥۘۥۘۥۧۦ۫ۧۦۘ۫۠ۜۘ۟ۡۘۘۡۦۤۡۢۦ۫ۛۧۘۦۘۥۥۨۢۙۖۘ۟ۖۛ";
        while (true) {
            switch ((((str.hashCode() ^ 947) ^ 715) ^ 99) ^ 1546877683) {
                case -1517934772:
                    return;
                case -698257998:
                    OooO00o();
                    str = "ۚۦۘۘ۟ۡۨۨ۠ۘ۬ۧۘۤۖۧۘ۬ۨۖۘۤ۫ۜ۫ۗۤ۟ۘۦۘۘۢۛ۬ۤ۬ۢۖۤ";
                    break;
                case -530209939:
                    intentFilter = new IntentFilter();
                    str = "ۗ۬۫۠۬ۜۘۜۜۧۘ۟۠۠ۛۨۤۧ۬ۧ۠ۛۡ۟ۗۨۘۦۗۘۡ۠ۡ۠ۧۤۖۢۨ۬۫ۢۖۥۧ۠ۘۗۢۘۡۤۡ۠ۙۢۤ";
                    break;
                case -29525906:
                    intentFilter.addAction("android.intent.action.PHONE_STATE");
                    str = "۬ۙ۫ۢۢ۠ۧۚ۠۫ۘۖۘۛۖۖۗ۟ۜۥۤۢۤۧۜۘ۫ۨۛۙۙۤ";
                    break;
                case 335097289:
                    str = "ۘۨ۬ۖۡۡۘۥۢ۬ۗۙۚۖۘۗۜۦ۟ۡۘ۫ۥ۫۬ۜۥۨ۟ۢۡۘ";
                    break;
                case 342397352:
                    super.onCreate();
                    str = "ۤۥۜۘۥۘۗۦۜۖۘۧۥۘۦۥۚۢۡۛۤۘۤ۠ۗ۫ۚ۬ۦۜۢۤۖۥۙۚ";
                    break;
                case 515133326:
                    intentFilter.addAction("android.intent.action.NEW_OUTGOING_CALL");
                    str = "ۤۖ۬ۖ۟ۤ۫۫ۦۘۖۘۘۙ۠۬ۖۚۜۘ۬ۤۡ۟ۖ۬ۡۚۨۘ۬ۥۖ";
                    break;
                case 1470419805:
                    registerReceiver(this.Ooooo00, intentFilter);
                    str = "ۦۡۘۘۖ۬۬ۧ۬ۚ۬ۚۜۘۛۘۨۡۨۖۘ۠ۙ۫ۙۚۥۙۧ۠ۥۤۢۚ۠ۡۢۘۘۧ۬ۦ۠ۗۢ";
                    break;
                case 1734741391:
                    this.Ooooo00 = new PhoneStateReceiver(this);
                    str = "ۖۖ۬ۥ۫ۘۘ۬ۛۘ۠ۤۛۜۚ۟۠ۚۦ۫ۨۦۘ۬ۙۚۚۗۘ۟ۥ۫ۗۦۡۘ۠ۜۤ";
                    break;
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        String str = "ۗۥ۠ۗ۠ۖۘۢۡ۫ۡۖۜۡۨۖۘۦۘۥۖۙۧ۟ۜۜۘۨۡۚ۠۟ۚۡۘۥۜ۟ۢ۠ۨۙۦۧۧۦۧ۬ۙۦ";
        while (true) {
            switch ((((str.hashCode() ^ 379) ^ 328) ^ 977) ^ (-1131723439)) {
                case -268503421:
                    unregisterReceiver(this.Ooooo00);
                    str = "ۢۚۡۘۚۗ۟۬۬ۨۙۙۚۖۥۘۧۙۖۘۗۨۛۚۤۧۢۜۘۘۙۜ";
                    break;
                case -101409189:
                    super.onDestroy();
                    str = "۠ۖۛۚۤ۬ۙۤۨۘۚۙۛۖ۫۟ۜۖۢۗۚۚۨۨۤۡۦۤ۟ۘۧۡ۬۫۟ۡۘۛ۠ۚۦۙ۫ۨ۠۬ۧ۠ۨۧ۟ۘۢۡۦ";
                    break;
                case -67789014:
                    return;
                case -4872738:
                    str = "ۘ۫ۖۘ۬ۜۙۖۗۘۘۨۖۘۦۦۢۖ۫ۖۜ۟ۡۙۦۘۗ۫ۘۘ۠ۗۢۙۛۚ۠۬ۧۦۗۙۨۘۦ۬ۧۨۨۡۜۥۢۛ۟ۦۘ";
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:590:0x001a. Please report as an issue. */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int intExtra = 0;
        int i3 = 0;
        int i4 = 0;
        String stringExtra = null;
        int intExtra2 = 0;
        long longExtra = 0;
        StringBuilder sb = null;
        String str = "ۜ۫ۡ۬ۧ۠ۛۜۛ۫ۨۘۥ۟ۡۙۧ۠۬ۧۖۢۘۘۘۗۧۛۥ۟ۛۦۗ۟ۚۡۡۢۙۜۘ۟ۦ۠";
        while (true) {
            switch ((((str.hashCode() ^ 604) ^ UiMessage.CommandToUi.Command_Type.SET_FW_BG_VALUE) ^ 524) ^ 274377562) {
                case -1900774970:
                    C4605z6.OooO0Oo().OooO0oO();
                    str = "۟ۧۦۗۚۢۨۙۢۥۘۨۧ۫ۨۨ۬ۨۘۖۖۤۖۢۤ۬ۤۦۛۧ۠";
                    break;
                case -1900734842:
                    String str2 = "ۗۖ۬ۧۨۧۧۗۡۙۛۥۖۧۜۖ۟ۡ۬ۙۡۘۛۜۜ۫۟ۥۘۘۗ۠";
                    while (true) {
                        switch (str2.hashCode() ^ (-1238061100)) {
                            case -1993287323:
                                str2 = "ۖۛۥ۠ۦۛۤۜۧۘۚۘۨۦۘۨۛۙۨۡۖۘۡۤۘ۬ۙۡۙۗۢ۫ۢۥۘۥۛۦۗۜۨۥ۟ۦۘۚۘۜۘۧۙۜ";
                                break;
                            case -1173480191:
                                str = "ۖۥۖۨۤ۫۠ۗۛۗۘ۬ۥۨۧۘۧۨ۠ۨۜۗۡۢۖۘ۟۬ۨۦ۠۟ۚۤۜۘۖۙۦۡۦۨۘۤ۟ۨۘ";
                                continue;
                            case -140172079:
                                str = "ۖۦۢ۫۬ۗ۬ۛۦۘۛۙۡ۬ۜۨۘۤۖۡۘۨۘ۟ۚۘۡۘ۠ۤۡۘۤ۬ۤۦۘۨۙۢۙ۟ۖۘ۠ۦۙۡ۫۫ۡ۫ۨۘ";
                                continue;
                            case -862833:
                                String str3 = "ۙۨ۫۠ۥۚۚۧ۬ۘۛۚ۟ۤۤۧ۠ۜۘۙۗۥۘۗۥ۬ۦۥۦۘ۬۠ۜۙۨۧۘۡ۫ۘۛ۫ۡۘۥ۟ۥۧۧۡۙۙۡۘۗ۟ۨۘۤۧۦ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-943819091)) {
                                        case -1484961349:
                                            str3 = i4 != 201 ? "ۘۙۜۘۖۧ۬ۧۡۘۤۧۡۘۥۤۗۢۤۛۥۨۦۘۦۡ۫ۡۡۦۙۚۤۛۤۦۘۨۧ۫ۨ۠ۢۧۢ۟" : "۬ۛۚۨۨ۟ۘۙۢۨۗۥۘۥۖۤ۬ۘۥۤۡۧۙۘۡۘۢ۠ۦۨۛۨۢۙۙۚۚۘۨۨۧۧۨۘ۫ۧ۬۫ۢۚۚۖۙۢۦ";
                                            break;
                                        case -300737065:
                                            str2 = "ۨۗۡۥۥۘۘ۫ۥۖۘ۬ۨۤ۫ۚۚۖۢ۬ۡۘ۫ۦۧۚۦۜۦۧۙۚۘۧۘۙ۫ۜۘۤۧۜۛۤۢ۬ۡۘۛۧۥۙۤۦ۫ۢ";
                                            break;
                                        case 449716771:
                                            str3 = "ۛۨۦۘ۟ۡۨۜ۫ۘ۫ۧۨۙۖ۠ۖۤۥ۠ۘۖۧۚۖۘۚۙۦ۠ۦۤ۬ۨۧۢۡۘ";
                                            break;
                                        case 1181622045:
                                            str2 = "ۘۛ۫۠ۦۡۘۨۖۛۤۜۦۘۚۛ۫۬ۘۦۧ۟ۙۙۙۥۘۥۛۢۥۢۜۙۥۡۘۤۗ۟۟ۨۘۜۨۘ۫ۛۘۘۜۚۤ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1886538912:
                    AppContext.OooO00o().Ooooo00 = true;
                    str = "ۢۥۖۙ۬ۖ۟ۙ۬ۙۗۨۚ۬ۙ۬ۜۧ۠ۥۡۘ۫ۙۖۘۧۛۨ۫۠ۨۛۘۧۦۢۖۙۖۛۢۘۘۘ۠ۜۘۥۖ۬ۘۘۨۘۙۦۦۘ";
                    break;
                case -1809167577:
                    intExtra2 = intent.getIntExtra("userId", 0);
                    str = "ۙۛۧۡۙۥۘۥۧۦۘۥ۟۠۠۫ۚ۬ۗۡۤۢۤۘ۠ۦۦۨ۬۬ۘۨۢۧۦۘۚۧۦۘ";
                    break;
                case -1783839750:
                    C4605z6.OooO0Oo().OooO0oO();
                    str = "ۜۡۖۢ۫۠ۦۙۥۗۥۨۘۙۚۥۘ۠ۨ۬ۡۜۘۙۢ۫ۗۥۗۗۧۦۘۢۚۤۚۨۘۘۧۥۛۜۗۡۗۧۘۢۡۜۘ";
                    break;
                case -1693704954:
                    C3718b7.OooO0Oo().OooO0OO = 1;
                    str = "ۨۨۜۘۨ۠ۚۜۨ۠۟ۘۘۘ۫ۢۙۚۛۚۗۡۗۚۧۗ۟ۦۜۘۢۚۛ";
                    break;
                case -1625217853:
                    str = "ۨۜۦۘۘۢ۬ۡۢۛۥ۬ۤ۬ۘۨۘۜۨۥۘۖۧۖۘۖۤ۟ۤ۫ۘۖۦۜ";
                    break;
                case -1602245491:
                case -1310104149:
                case -1152548945:
                case -1093112888:
                case -1068415216:
                case -491530051:
                case -46670421:
                case 3034241:
                case 157416421:
                case 883881254:
                case 1165562768:
                case 1548355455:
                    str = "ۤۦ۟ۛۗ۫ۢ۠۠ۢۨۘۨۗۜ۟۫ۗۗۨۘۢۥۜۙ۠ۥ۬ۖۦۗۛۡۘۙۤۡۡ۫۫۫۟ۚ";
                    break;
                case -1526318808:
                    String str4 = "ۤ۠۫ۙۙ۬۬ۨۧۢۢۖۜۖۜۙۘۘ۬ۛۤۧۜۖۚۨۘۢۛۤۡۛ۬ۛۥۘۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 172140740) {
                            case 853245384:
                                str = "ۤۢ۫۠ۨۥ۠ۢ۬ۘۢۖۘۧۥۡۘۘ۠۠۠۠۠ۛۢۦۘۖۖۗ۬ۧۨۘ۟ۥۗۡۢۦۘۦۥۜۛ۫ۘۗۙ۟ۘۡۙۛ۫ۚ۠ۧۧ";
                                continue;
                            case 878121750:
                                str4 = "۬ۢۘۘۛۚۖ۟۟ۙۜۡۨۘۨۤۨۡ۠ۦۡ۠ۗۡ۟۫۫۟ۖۘۢۧۜۘۖۥۙ۫ۢۡۨۦۛۤۚۤ";
                                break;
                            case 1432165857:
                                str = "ۢۦۘۘۙۜۤۖۡۙ۬ۢ۬ۧۦۨۘۗ۟ۙۢۡۦۜۨۦۘۤۨۦۚۗۦۘۡ۠۫ۜۥۦۘ۟۠ۡۙۙۘۘۤۥۦۙۥ";
                                continue;
                            case 2115330708:
                                String str5 = "ۤۚۖۘۜ۠ۜۜ۟ۨۘۨۚۤۚۘ۬ۙۡۗۛ۟ۡۡۘۢۤۗۡۛ۫۠ۧۢۜۘۘۨۗۡۘۧۜۛ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-692593000)) {
                                        case 651193549:
                                            str5 = "ۥ۬ۜۖۨ۠ۘۗۦۦۗۖۘۜۨ۫۠ۢۖۨ۬ۡۛ۟ۧۗ۬ۚۤۤۙۛۨ۟ۗۗۤۥۦۛۤۤۡۗۢۢۧۤ۟ۨۛۨۧ";
                                            break;
                                        case 679345303:
                                            str5 = i4 != 101 ? "ۛۘۡۘۙ۟۫ۛۗ۬ۗۧ۠۟ۘۘۜۖۨۤۘۧۜۢ۫۫ۨۘۖۤۜۘۧۖۡۘۗۚۚۡ۟ۦۧۡۧۘ" : "ۨ۫۬ۛۘۨۙ۠۬ۛۢۢ۬۠ۦۢۜۖۘۡۢۚۖ۟۠ۙۜۘۦۖۚۙۦۘ۠ۥۨۘ";
                                            break;
                                        case 1551991294:
                                            str4 = "ۙ۬ۦۘۨۨۨۡۢۚۧۧۛ۟ۦۘۧۦۥۘۧ۫ۥۘ۟ۘ۬۫ۡۘۨۙ۬ۜ۠ۙۗۡۛ۬ۧۛۥۚۘۘۨ۬ۡ۠ۙۧۧ۟ۨ۬ۥۜۘ";
                                            break;
                                        case 1839011215:
                                            str4 = "ۥۥۖۘۧۜۘۘ۬ۖۢۨۙۜ۠۟ۦۘۜۤۡۘۧۤ۠۫ۛۡۡۖۚۧۦ۠ۜۙۡۛۘۘۚۦۧۘ۠ۨۤۜۜۘۧۖۡۘۜۖ۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -1515558080:
                    String str6 = "ۘۡۧ۬ۦۘ۬ۦۡۘۧۙۦۘۦۦۤ۫ۜۗۜۧۘۘۤۡۘۛۘۘ۟ۛۜ";
                    while (true) {
                        switch (str6.hashCode() ^ (-1250394476)) {
                            case -966076890:
                                str = "ۙۦۘۙۦۚۨۙۙۘۢۜۘۥۛۛۥ۫ۖۘۛۤۥۘۧ۬۟۫ۥۚ۟۟ۧ";
                                break;
                            case 130738666:
                                String str7 = "ۤۤۨۖۧۖۛ۫۟ۤۢ۠۟۟ۢۥۢۖۦۦۛۦۘۚۛۖۘۚۘۦۘۛۖۛۥۨۘۨۤۚۘ۠ۚۜ۬ۚۙ۬";
                                while (true) {
                                    switch (str7.hashCode() ^ 1720723215) {
                                        case -1732072748:
                                            str7 = C3718b7.OooO0Oo().OooO0OO != 2 ? "ۗ۬ۨۡۖۖۡۘۘۗۡۨۦۤۨۘۦۛۜۘۚۢۖۘۢۢۜ۬ۤۘۘۢۘ۫۬ۢۢۢۘۢۚۖۗ۠ۢۙۦ۫۫ۤۤۧ" : "ۘۛۚ۫ۛۡۘۜۤۜۘۡۙۨۘۖۚۗۚ۫ۜۘۛۦۦۥۦۘۜۤۖۘ۫ۙۙۧ۠ۢۛۖۛ";
                                            break;
                                        case -1075644201:
                                            str6 = "ۚۜۘۘۖۦۖۛۡۧۜۤۥۖۛۜۘۦۤ۬ۘۚ۬ۖۘۤۡۦ۠ۛۢۡۢۙۢۖۗۘۨ۠ۨۗۤۨۥ۟ۢۛۜۘۦۡۦۘ۟۬ۚ";
                                            break;
                                        case 172153085:
                                            str7 = "ۤ۠ۡۘ۠۬ۘۘ۟۬ۧۛ۬ۙۖۜۘۘۨۧۤۚ۠ۖۘۨۡ۠ۧۢۖۦۢۗۦۜۜۡ۫ۛ";
                                            break;
                                        case 1695941129:
                                            str6 = "۟ۜ۟۟ۦۜۘۛۘۘۘ۠ۙۜۘۗۡۚۦۘۛۡۖۘۢۛۘۧۖۢۛۧۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case 244371778:
                                str6 = "ۦۗۡۘۦۢۘۘۚۖۚۚۢ۫ۤ۟۬ۤۙۡ۫ۧۨۗۘۨۘ۬۬۠ۖۥۥۘۥ۬ۦۘۨ۟ۦۗۘ۫ۡۚۙۚۘۦۘۨۙۖ";
                                break;
                            case 2025533441:
                                break;
                        }
                    }
                    break;
                case -1496938953:
                    sb = new StringBuilder();
                    str = "ۤۡۧۘ۬ۛۘۘۧۗ۬ۨۘ۠ۖۤۡۘ۫ۤۖۚۥ۠ۚۨ۬۠۟۠ۘۘۙۧۡۘۜۦۖ۟ۖۡۘۧ۬ۖ";
                    break;
                case -1463782728:
                    str = "ۨۜۦۘۘۢ۬ۡۢۛۥ۬ۤ۬ۘۨۘۜۨۥۘۖۧۖۘۖۤ۟ۤ۫ۘۖۦۜ";
                    i4 = i3;
                    break;
                case -1417979042:
                    Process.killProcess(Process.myPid());
                    str = "ۘۖۗ۫۬ۧۙ۟۬ۜ۟ۘۘۙ۫ۖۛۘۧۧۧۨۘۤۡ۫ۖۖۡۘۘۧ۫ۚۤۖۘۛۨۘۨۦۖۘۘ۟ۘۘۥۤۘۘۧۖۢۡ۬ۥۘۧ۟ۨ";
                    break;
                case -1334423670:
                    stringExtra = intent.getStringExtra("localGamePackage");
                    str = "ۖۢۜۘۚۙۨۡۙ۫ۦۘۖۘۗۥ۬۫ۗۖۘۗۢۤۧۨۙۛۚۙۚۢۚۙ۫۟ۨ";
                    break;
                case -1280086597:
                    String str8 = "ۦۧۧۘ۫ۖۗۗۙۧۥۖۖۖۙۛۤۚ۬ۨۡۢۜ۬ۚۡۤۨۨۘۖۡۡۘۖ۫ۗۘۦۥۡۥۡۘۘۙۥۘۗ۫ۨۘۡۦۜۗۦۡۘ";
                    while (true) {
                        switch (str8.hashCode() ^ 348190832) {
                            case -1761979813:
                                str8 = "ۧۢۙ۟ۘۖۘۢ۠۠ۤۥ۠ۨۛۥۘۗ۠۟ۧۨۖۘ۟۠ۙۚۦ۠۫ۙۖۘۖۧۗ۫ۦۘۦۤۗۧۙۚ";
                                break;
                            case -1532950016:
                                break;
                            case -806339873:
                                str = "ۨ۬۠۫ۚۡۘۡۖ۬ۤۙۜۘۡۗۗۛۖۜۘۤۛۜۘ۠۟ۤۙۨۛ۠۬ۥۘۢۤۗۤ۠ۛۛ۫ۘۘۗ۫";
                                break;
                            case -47399641:
                                String str9 = "۫ۚۤۜۥۡۘ۫ۥۤۖۨۥۘۛ۬ۦۘۨ۟۫۫ۜۗۢۚۨۘۗۘۧۘۛۡ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-760901329)) {
                                        case -1433704524:
                                            str8 = "ۘۗۤۙ۫ۡۘۜۚۦۙۙۦۜ۠۫۬ۛۙۡۧۤۚۚۧۡۙۘۧۖۘۛۗۡۘ۟ۢ۠۬ۧۥۗۦ";
                                            break;
                                        case -1024261725:
                                            str8 = "ۗ۠ۧ۟ۤۙ۫۫ۢۘۘۡ۬ۦۖۜۦۖ۠ۛۘۧۦۘۙۨۤۨ۬ۥۘۘۥۛۙۙۛۚۖ۟ۛۙۨۢۙۡۚ۬ۨ";
                                            break;
                                        case -887114816:
                                            str9 = C3718b7.OooO0Oo().OooO0OO != 3 ? "ۨۦۧۘۙ۫ۥۢۢۚۡ۬ۡ۟۫ۦۘۗۨۙۨۢۜۦۙۡۘۥۥۢۖۥ۠ۖۛۜۘ۠ۙ۬ۚۖ۟ۧۘۛ" : "ۦۦۨۘ۫ۚۥۨۗۦۘۥ۫ۡۘ۟ۡ۠ۜۢۘۗ۟ۦۘۢۡۖۘۛۛۧۥۛۜۘۖ۬ۜۘۘۜۡۤۜۡۢۧۙۖۦ۟ۤۜۘۧ۟ۘۘۖۚۘ";
                                            break;
                                        case -576354009:
                                            str9 = "ۨ۫ۜۘۤۨۨۙۨۘۤۘۦۘ۟ۨۨۥۗۤۖۗۡۘ۟۬ۚۨۘۥۘۙ۬ۥۗۦۡۜ۟ۘۢۨۗۙۤۙۙۤۙۚۗۙۥۧۢۤۨ۫";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    str = "ۤۦ۟ۛۗ۫ۢ۠۠ۢۨۘۨۗۜ۟۫ۗۗۨۘۢۥۜۙ۠ۥ۬ۖۦۗۛۡۘۙۤۡۡ۫۫۫۟ۚ";
                    break;
                case -1175355386:
                    C3977i7.OooO().OooOOoo(114);
                    str = "ۧ۫ۨۘۗۙ۠ۘۢۡۦۙۦۥۘۘۘۛۦۙ۟ۧۨۘۙۧۢۡۗۢۜ۠ۖۘۙ۟ۙۖۚۜۙۜۘۖ۠ۤۤۖۤۖۧۛۘۖۗ۫ۘۘۘ";
                    break;
                case -1112428116:
                    String str10 = "۟ۘۥۘۧ۟ۦۗۘۧۧۜۘۘ۟ۢۛۗۘۘ۟ۦۡۥۤۦۘ۟ۨۙۨۤۜۘ";
                    while (true) {
                        switch (str10.hashCode() ^ 1330168315) {
                            case -1156277202:
                                String str11 = "ۨۢۚۡ۟ۜۘۖۦۘۗ۟ۖۘۦۥۤۡۢۚ۫۟۟۟۬ۢۥۧ۫ۗۖۚۛۛۦۘۢۢۢ۟ۦۥۘۡۛۛ";
                                while (true) {
                                    switch (str11.hashCode() ^ (-218789754)) {
                                        case -191315412:
                                            str11 = "ۡۧۘۘۙ۠ۛۢ۬۬ۗۧۤۤۘۜۤۜۨۛۘۜۘۨ۟ۡۜۡۥۘ۬۟ۘۦۨۖۘۥ۠ۦۘۢۜۦۗۤ۠ۘ۟ۧۜۚۚ";
                                            break;
                                        case 119458970:
                                            str10 = "ۘۙۘۛ۫ۦۘۨۘۤ۠ۦۖۙۘۧۜۚ۬۟ۤۘۘۥۘۨۘۘۙۘۘۦ۠ۘۘ";
                                            break;
                                        case 254016505:
                                            str11 = i4 != 3 ? "۬۟ۦۚۖۘۗۗۖۘۚۖۚۛۥۗۢۘۘۦۘۡۘۡۡۜۘۗۘۧۛ۫ۥۘ۟ۙۖۢۘۜۘۘۢۜۦۢۦ" : "۫ۥۙۡ۫۠ۦۘۨۘۗۛۦۘۨ۠ۘ۠ۢۜۦۙۗۥۥ۟ۘۨۘۙۦۘۘ۠۠ۧۥ۠ۥۘۖ۬ۚۗۥۡۘ۠۫ۤۛ۫۠";
                                            break;
                                        case 1754873374:
                                            str10 = "ۚۖۨۜۚۛۖۧۖۘۢۤۜۘ۫ۗۡۘۘ۬ۜۥۧ۫ۚ۟ۧۡۜۨۛۙ";
                                            break;
                                    }
                                }
                                break;
                            case 1477590294:
                                str = "ۡۧۧۜۙ۟ۙۙۦۘۜ۫ۦۘ۬ۚۖۘۨ۠ۦۘۨۖۨۘۚ۬۫ۖ۠۬ۤۜۦۘ۠۬ۥۘۗۤۖ۠ۖۦۙ۬ۨۤۨ۟ۡۗۤۡۨۨۘ۬ۙۨۘ";
                                break;
                            case 1576639828:
                                str10 = "ۤۚۨۧۚۡۘ۫ۤ۬ۡ۬ۘۤۚ۠ۖۤۜ۠ۧۧۚۖۨۘۧ۟ۥۘۥۦ۫";
                                break;
                            case 2075322853:
                                break;
                        }
                    }
                    break;
                case -1090200736:
                    String str12 = "ۨۘۖۘ۠ۚۨۛۛۗۧۜ۠ۜ۬ۗۡ۠ۖۘۖۛۨ۟ۧۦ۫ۙۙۖۗۘۘۖۡۜۘۗۙۥۘۦ۟ۧۥۧۡۘ۠ۗۛ۟ۗ۬ۜۜۨۘۡۢ";
                    while (true) {
                        switch (str12.hashCode() ^ 1977189183) {
                            case -1953959252:
                                String str13 = "۫ۨۦۘۚۙۘۧۨۘ۬۬ۚۜۢ۠ۢۥۦۦۤۧۛۚۘۘۚ۬ۥۜۚۚ";
                                while (true) {
                                    switch (str13.hashCode() ^ 1411429503) {
                                        case -1640356851:
                                            str13 = "ۡۤۡۤۥۡۘۖۘۚۚ۬ۖۗۤۜ۠ۢۡۦ۫ۥۗۦۘ۟ۜۧ۫ۡۨۘ۫ۧۥۨۘۥ۠ۗ۬ۘ۠ۙۗۙۥۤۦۥۤۘۘ۠ۚۧ";
                                            break;
                                        case -1161369468:
                                            str12 = "۬ۗۘۘۧۥۧۗۛۡۘۜ۬ۘۘۗۘۘۙۢۙۢۙۜۘۢۤۜۗ۟ۨ۟۬ۨۘۨۨۤۡۜۙۖۜۧۘۖۤ۟ۚۜۦۙ۫ۥ";
                                            break;
                                        case 1800695705:
                                            str12 = "ۙۨۤۤۡ۫ۤۨۥۛۨۘۙۜۥۙۜۨۘۡۥۨ۟ۥۖۨۚۦۘۜۖۜ";
                                            break;
                                        case 2142652644:
                                            str13 = i4 != 1 ? "ۦ۟ۦۘۦۢۡۚۘۦۚۗۘ۫۟ۦۥۖۜۚۨۜ۠ۙۖۘۛ۟ۖۘۛۡۨ۟۠ۤۦۥۛ" : "ۖۡۤۢ۬ۤۗۛۖۛۜۘۢۙۡۚۚۜۘۛ۫ۥ۠ۘ۟ۥ۠ۛۨۦۖۘۙ۟ۤۛۖۘۙ۬ۡۘۧ۠۫";
                                            break;
                                    }
                                }
                                break;
                            case -1525130017:
                                str12 = "ۖۤۜ۠۬ۙ۠۟۟ۨۖ۠۠ۜۘۚۖۗ۫ۛۗۖۗ۠ۡ۠ۜۙ۫ۨۚۨۖۘۡۨۘۘ";
                                break;
                            case -345595928:
                                str = "ۧ۟ۧۧۡۙ۟ۥ۠ۙ۠ۨ۠ۨ۬ۧۖۧۘ۠ۤۨۘۡۤ۠ۛ۫ۚ۠ۧۦ";
                                continue;
                            case 1535187271:
                                str = "۠ۦ۟ۨ۫۟ۚۙۥۢ۫ۖۜۜۘۦۖۢۢۛۜ۫ۗ۠ۛۢۨ۟ۢۘۗۘۘۚۘ۟";
                                continue;
                        }
                    }
                    break;
                case -1081674354:
                    OooO0OO();
                    str = "ۤۦ۟ۛۗ۫ۢ۠۠ۢۨۘۨۗۜ۟۫ۗۗۨۘۢۥۜۙ۠ۥ۬ۖۦۗۛۡۘۙۤۡۡ۫۫۫۟ۚ";
                    break;
                case -1071532349:
                    i3 = 0;
                    str = "ۢ۠ۜۗۙۥۘۛۤ۬۫ۖۜۘۨۛۡۗۤۖۙۤۢ۫۬۟ۤۤ۬ۥ۬۟ۖۛۜۘۙۤ۟ۗ۫ۧۤۛ۫ۦۤۨۘۨ۬۠۫ۘۙۤۜۖۘ";
                    break;
                case -1055593852:
                    System.exit(0);
                    str = "ۜۧۖ۠ۖ۬ۡۡۨۘۡ۬۠ۤۜۙ۫ۚۖۡۥ۠ۜۧۦۚ۬ۥۘۨ۫ۨۚۡۘۘۦ۠ۤ۠ۚۖ۟۠ۥۨۦۥۘۦۚۛ۫ۧۦۘۧۚۖۘ";
                    break;
                case -876681121:
                    str = "ۘۧۗ۟ۨۡۘۨ۫ۥۘ۫ۖ۫ۚۗۦۘ۠۠ۖۘۤ۬ۗۤۗۤۙۗۦۘۖ۬ۢۘۙۡۥۢۖۤۧۡۛ۠۫۬ۤۨۦۖ";
                    break;
                case -873925061:
                    str = "ۥ۬ۨۘ۠ۘۡۘ۬۟ۚۖۤۜۘۡۚۛ۫ۙ۬ۛۙۨۘۚۚ۫ۤۜۗۤ۬ۜۘۘۙۘۙۡۦۘ۠ۦۚۤۥ۟ۦ۫ۡۘۦۜۖۤۗۖۨۗ";
                    i4 = intExtra;
                    break;
                case -601778609:
                    break;
                case -568890861:
                    OooO0o0();
                    str = "ۚ۠۟ۘۦ۫۠ۦۦۘۤۨۨۦۛ۟ۖۤ۟۟ۧۦۘ۟۬ۖۖ۠ۤۨۥۦۤۚۖۤۦۨۘۗ۟ۘ۠ۧۛ۫ۗۖۢ۟ۡۘ۟ۚ۠ۤۤۡۘ";
                    break;
                case -542249966:
                    sb.append("ENGIN_MQRUNNER_TOKENKEY: token = ");
                    str = "ۥۤۧۤۨۜۘۘۡۨۨۦۘۘۚۢۜۘ۬ۙۜۜۖۘ۟ۘ۬ۦۨۥۡۤۧ۠ۡۖۘۥۤۗۧۤۦۧۙۛۚۖۧۢۦۘۦۙ۠ۧۛۜۘ";
                    break;
                case -406865668:
                    OooO0O0(intent);
                    str = "ۚۨ۟ۙۚۦۛۥۥۘۦۤۙۘۜۨۘ۬۬ۨۤۥۖ۟۟ۡۚۥۤۙۚۘ";
                    break;
                case -168835196:
                    this.OoooOoO.postDelayed(new OooO00o(this), 1000L);
                    str = "ۖ۠ۘۘ۬ۚۘۘۙ۬ۢۡ۠ۜۜۖۛۖۜ۫ۤۗۖۚ۫ۖۖۙۖۙ۠ۧ۟ۥ۟ۜۡۡۘۖ۫۫۟ۧۙۗۚۥ۬ۡۗۢۙۧۜۡ";
                    break;
                case -87156605:
                    String str14 = "ۙۤۖۢۦۨۧۖۨ۟ۚۖۛۧۨۘۛ۟ۨ۫ۖۥ۠ۨ۟ۖۥۦۡۜۥۘۡۘۧۖۦۗۚۙۢۘۚۘۘ";
                    while (true) {
                        switch (str14.hashCode() ^ (-546225174)) {
                            case -1612386919:
                                String str15 = "ۨۧۥۡۧۥۘۚۢۗۤۛۛۛۛۡۘۡۘۦۤۡۥۡ۬ۨۦۨۧۘۤ۫ۛۨ۬۠۟ۨۗ۫ۧۘۢ۬ۖۘ۠ۚۢۚۢ۟ۢۦۛۡۦ۬";
                                while (true) {
                                    switch (str15.hashCode() ^ (-68267893)) {
                                        case -1292742426:
                                            str15 = C3718b7.OooO0Oo().OooO0OO == 0 ? "ۡۡۛۛۘۘۛۦۚۜۡۤۧۖۚۜۗۘۦۤۧۖۗۘۜۘۥۘۙۖۡۘۘ۟ۜۘۛۦ۠" : "ۜۡۨۨ۬ۘۘۛۗۧۜۢ۫۫ۧۡ۟۟ۘۗۥۨۛۛۧۥۦۨۘ۫ۛۧۧۙۡۢۧۘ";
                                            break;
                                        case -598334046:
                                            str14 = "ۧۧۘۘۧ۟ۨۨۦۜۚۛۦۛۘۦۘۙۖۦۢۦۢۧۘۘۜۖۛۤ۫ۛۨۤۧ۬ۡۥۘ";
                                            break;
                                        case 877964628:
                                            str15 = "ۦۜ۟۬ۖۧۘۨۙۜۘۨۥۤۧ۫ۤۥۦۥۘ۟۬۠ۥ۟ۙ۠ۨۥۡۖۡۦۢۦۘۡ۬ۖ";
                                            break;
                                        case 1559456175:
                                            str14 = "ۗۦ۬ۙ۫ۖ۫ۢۤۡۢۜۙۡۢ۬ۧ۠۬ۙۦۙۡۖۢۨۘ۬۠ۥۛ۬ۚۨ۟ۖۘ۫۫ۨۚۡۥ";
                                            break;
                                    }
                                }
                                break;
                            case -267926503:
                                str = "ۡۨۢۢ۬ۦۘۖۘۨۘ۫ۤ۠ۘۨۤۦۗۥۘ۬ۗۡۘۜۗۥۘۗۗ۟۬ۘۡۘۙۘۘ۠ۥۡۘۦ۬ۨۘۛ۟ۡۘ۫۟ۗۚۧۘۘۛۜۗۙۢۜۘ";
                                continue;
                            case -262245378:
                                str = "ۨۨۜۘۨ۠ۚۜۨ۠۟ۘۘۘ۫ۢۙۚۛۚۗۡۗۚۧۗ۟ۦۜۘۢۚۛ";
                                continue;
                            case 436297102:
                                str14 = "ۜۨۖۘۡۖۜۘۖۘۗ۬۟ۤۤ۠۟ۚۚۗۨۥۗۨۢۤ۟۬ۘۖۖۘۗۧۧۛۡ۬ۢۥۙۤۦۘۘ۠ۡۘۨۖۗۧ۬ۜۨۜۡۘ";
                                break;
                        }
                    }
                    break;
                case 97759463:
                    str = "ۨۧۚۤ۠ۚۙۧۜۗۦۙۙۡۗ۟ۥ۟ۥۘۘۢۦۨۘۘ۠ۤۙۨۧۘ۫ۦۛۚۖۧۘۨ۬ۜۘۡۚۘۡۖۖ۫۟";
                    break;
                case 325933622:
                    sb.toString();
                    str = "ۗۗۤۘۜۡۘۙۦۗۨۗۦۘ۠۫۟ۡۘ۫ۦۗۡۢ۫ۨۡۛۙۡ۫ۗ۠ۦۦ۫ۨۘۘۨۤۘۘ۬ۨۧۡۗۥۘۗۨۘۘ";
                    break;
                case 357862320:
                    String str16 = "ۘۚۙۗۜۡۘ۬ۤۚۛ۟ۨۘۧۤۡ۬ۘۜۥ۟ۖۥۙۜۘۧ۬ۥۘۦۖۖۛۥۚ۠ۡۥۘ";
                    while (true) {
                        switch (str16.hashCode() ^ (-712093542)) {
                            case 318827415:
                                str = "۟ۛۥۛۙۨۘۙۧۜۦ۬۟ۥ۠ۥۘۘ۠۟ۡۚ۟۟ۥۧۘۘۙۙ۠ۜۤۢۛۗ۠ۛۥ۬ۖ۟ۥۗ۠ۡۢۢۤ۟ۘۘ۟ۚۡۗ۫ۢ";
                                continue;
                            case 322803497:
                                String str17 = "ۢ۬۬۫۬۬۠ۗۖۚ۠ۗ۫ۘ۬ۧۖۤۧۡۘۙ۬ۘۘۦ۫۠۫ۨۗ";
                                while (true) {
                                    switch (str17.hashCode() ^ 1733045172) {
                                        case -1927883867:
                                            str16 = "ۜۡۚۨۢۡۢۛۖۘۨۨۧ۫ۙۛۤۨۨ۟ۨۦۘۡۗۛۥۤۥۗ۟ۥۨ۬ۤۖۤۧۙۨۘۘۖۡ۠ۗۙۥۘۥۨۤ";
                                            break;
                                        case -802760885:
                                            str17 = i4 != 102 ? "ۘۙۢۡ۫ۢۡۥۙ۫ۙ۬ۚۚۤ۟۬۬ۚ۟ۨۘۨۘۡۘۛۢۨۘۦۨۧ" : "ۧۧۙ۬۬ۨۗۢ۟ۡۥ۟ۥۜۥ۬ۡۧۚۤ۬ۜۗۜۘۜ۬ۧۗ۠ۨۗۡ۬ۛۖۨۘ۬ۖۦۡۖۖ";
                                            break;
                                        case -395353149:
                                            str17 = "ۗۙۧۗۢۤ۟ۦۜ۠ۡۘۢۢۚۢۤ۠ۗ۬ۗ۫ۚ۟۠۠ۨۧۘ";
                                            break;
                                        case -312828769:
                                            str16 = "۬ۛ۠ۥۥۢۛۘۧۘۤۡۙۜۗۘۘۗۧۚۡۥۨ۬ۘۘۘۚ۟ۢۖۙۤ۫ۚۡ۠ۦۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1019974200:
                                str = "ۙۛۖۘۖۦۦۘۜۘۢۛۥۖۘۤۜۖۚۨۖۘۖۛۤۘۖۧۜۨ۟ۙ۠ۨۘۡۚۗ۬ۨۛ";
                                continue;
                            case 1175005173:
                                str16 = "ۤۤۤۨۚۚۢۨۘۘۢ۫ۖۘۜ۬ۨۜۜ۟ۙۢ۫۠ۦۘۜۤ۬ۗ۫ۙ";
                                break;
                        }
                    }
                    break;
                case 400467730:
                    C3718b7.OooO0Oo().OooO0OO = 1;
                    str = "ۛۖۗۨۗ۟ۗۗۜۗۘۥۛۦۨۛ۫ۚۗۥۜۘ۠۬ۦۘۧۤۨ۬۟ۨ";
                    break;
                case 436328060:
                    C3977i7.OooO().Oooo0oo();
                    str = "ۗۤ۟ۡ۠ۖۨ۠۟۫ۡۡۙۛ۫ۘ۫ۨۘۜ۫ۘۘۗۢۦۜۗ۠ۜ۫۫ۨۥۘۛۘ۬";
                    break;
                case 741336194:
                    switch (i4) {
                        case 8:
                            str = "ۗۚۗ۠۠ۘۚۤۜۘۜۤۢۦ۫ۡۜۡۧۘۤۧۙۡۛۢۛۖۚۧۤۙۚۜۘۘۛۖۗۗۙۡۘۦۙ۠ۡۜۤۥ۬ۗۥ۫ۜۙۚۚ";
                            continue;
                        case 9:
                            str = "ۛ۬ۥۘۚۧۘۘۨۛۖۘ۫ۡۢۡۖ۫ۤۢۨۘۦۦۡۦۥ۟۠۟ۙۦ۬ۦ";
                            continue;
                        case 10:
                            break;
                        case 11:
                            str = "ۖۘۧۘ۫ۜۖۧۧۖۙۖۨۘۥ۟۟ۖۤۨۜۧۘۥۛۧۤۡۛۗۤۦۨۧۜۜۧۨۨ۠ۚۘۨ۬";
                            continue;
                        case 12:
                            str = "۟ۤۘۘۜۘۨۘۧۢۡ۠۠ۤۙۨۖۤۥۤۥ۟ۨۘۧۤ۫ۡۢۚ۠۬ۘ";
                            continue;
                        case 13:
                            str = "ۡ۟ۡۘۥ۬ۨۘۤۙۨۥ۠ۖۘۡۧۦۘۡ۠ۖۘۦۡۦۘ۫ۢۤۖۦ۬ۙۛۖۖۡۦۘۥۡۤۨۜۛۗۜۚۚ۟ۘۘۥۙۖۘ";
                            continue;
                        default:
                            str = "ۚۘۡۘۚ۬ۨۢۨۗۨ۟ۚۥۜۦۘۙۢۨۜۢ۠۫ۜۦۘۡۘۜۘ۠ۨ۫۬ۨۖۘۦۧۨۘۖۛۧ۟ۘۜۘ";
                            continue;
                    }
                    str = "ۧۨۖ۟ۡۧۥ۬ۨۘۗۜۛۙۢۘۦۦۨۘ۫۟ۡ۬ۤۘۘۨۢۧۧ۬ۙ";
                    break;
                case 745082440:
                    str = "۫۟ۥۢۗ۫ۚۡۖ۬ۡۡۘۨۨ۟ۡۥۨ۫۠ۡۥۧۜۘۗۨ۬ۗۧۨۘ";
                    break;
                case 811677098:
                    C3718b7.OooO0Oo().OooOOO0(longExtra);
                    str = "ۛ۠ۛۨ۟۠ۨۧۖۨۢۗ۠۠ۥۘۚۧۢۨۡۙۡۘ۟ۤۦ۠ۘ۠ۥ";
                    break;
                case 886495386:
                    stopSelf();
                    str = "ۢۙ۟ۧۙۨۘ۟ۡۧۘۙۗۤۙ۫ۖۘۦۚۚۦۢ۠۬ۚۢۜ۠ۧ۫";
                    break;
                case 1104796995:
                    longExtra = intent.getLongExtra("tokenKey", 0L);
                    str = "۠ۗۨۘ۠۠ۥ۫ۥۘۗۤۛۧۢۖۚ۫۠ۚۨۙ۟ۡۧۘ۬ۥۧۘۧۤ۫";
                    break;
                case 1273944781:
                    C4605z6.OooO0Oo().OooO0o0();
                    str = "ۢۚۤۦۙ۫ۘۥۚ۬ۜۧۘۤۢ۫ۨۢۜ۠ۡۥۘۗ۬۠ۖۢۥۙۦۧۢۨۨۧ۟ۖۘ۬ۜۜۨ۫ۜۜۨۘۚۢ۬ۜۧۥ۬۬";
                    break;
                case 1334474125:
                    str = "۬ۤۡۘ۬ۙ۬ۡۘۨۘ۫ۘۥۨۜۛۙۛۛۥۗۢۘۚۛۦۨۘۙۦۧ";
                    break;
                case 1335214220:
                    String str18 = "۬ۥ۬ۜ۬ۗۦۗۡۛۜۧۘۨۡۧۘۢ۬ۡۘۗۜۖۘۛۚۜۘۗۙ۠ۙۜ۫";
                    while (true) {
                        switch (str18.hashCode() ^ 1873809353) {
                            case -968739749:
                                str = "ۘۨۙۢ۫ۖۘۧۢ۟ۥۗ۟ۧۢۡۘۨ۠ۙۥۖۦ۟ۥۖۡۦۡۡۧ۠۬ۤۚۨۡۥۘ";
                                continue;
                            case -505445807:
                                str18 = "ۙۖۘۘۙۛۖ۠ۡۘۤ۠ۚۦۨۘۜۛۛ۠ۜۤ۟۫ۦۘۘۨۨۘۚۗۥۘ۫ۨۙۢۥۘۡۛ۟ۦۘۥۢۨ۠ۚۧۘۘ";
                                break;
                            case -123618932:
                                String str19 = "ۘۖۡۘۢۧ۠ۦۙۘۜۡۘۨۥۢۛۧ۫ۥۦۦۦۛۦۘۨ۫۠ۜۢ۠";
                                while (true) {
                                    switch (str19.hashCode() ^ (-1023229519)) {
                                        case -1935095799:
                                            str18 = "ۛۗۜ۠ۧۘۘ۟۫۟ۡۘۧۤ۫ۨۘۜۘۖۘۧۙۚ۬ۧۡۘ۫ۧۘ۟ۤ۫ۤۦۦۘۚۗۡۢۢ۠ۚۥۧۗۨۜۗۛۦ";
                                            break;
                                        case -571553722:
                                            str19 = "ۖۥۨۘۢۥۜۚۤۥ۟ۤۚ۬ۦۧۧۤۧۘۜۦۘۙۥ۫ۥۘۘۡ۬ۚۙۦۖۥۤۗۥۜۜۘۚۦۛۧۢۜ۬ۙۛ";
                                            break;
                                        case -282085782:
                                            str19 = i4 != 2 ? "ۗ۠ۦۜۘۤۗۢ۬۫ۙۢۛ۠ۜۡۗۧۧۘۘۖ۬ۤۚۖۘۨۚ۟ۦۥۥۚ۫۫ۛۥۛۨ۫ۘۘ۟ۥۨۖۥۘ" : "ۖ۟ۚۖۨۨۥۛۙۙ۟ۢۗۧۡ۠ۚ۟ۗۨۢۨۥۦۖۥۖۗۨۖۘۘۤۗ۠۬ۧ";
                                            break;
                                        case 1333849777:
                                            str18 = "۠ۜ۟۬ۡۧۘۥ۠ۦ۫ۛۤۙۨۖۙۜۖۘ۫ۜۡ۟ۥۚۗۨۡ۫ۗۚۢۙۨۘۛۨۖۘ";
                                            break;
                                    }
                                }
                                break;
                            case 51742951:
                                str = "ۛۚۗۗۚۗۙۖۘۛۖ۟ۜ۟ۥۘۘۦۧۗۜۘۗۙۥۤۛۜۘۜۛۥۘ";
                                continue;
                        }
                    }
                    break;
                case 1406417590:
                    C3977i7.OooO().OooOooO(stringExtra);
                    str = "ۚۨۘۥۧۜۘۧۢۜ۫ۚۢۢ۠۟ۗۘۢۨ۬ۙۛۥ۬ۦۡۦۘ۫ۙۤ۠ۥۖۦ۫ۨۘۗۢۛۗۡۡۘۦ۠۠ۘۡۨۘ";
                    break;
                case 1448580482:
                    intExtra = intent.getIntExtra(C3788d3.OooO, 0);
                    str = "ۙۛۦۘۘۧۢ۬ۡ۠ۙ۠۫ۡ۠ۖۙۢۦۖۖ۬ۛ۠ۨۡۛۦۚۜۛ۬ۨۘۙ۬ۗ۫ۙۚۢۚ۟ۤۗۘۘۜۨ";
                    break;
                case 1468378516:
                    sb.append(longExtra);
                    str = "ۙۘۤ۠ۡۨۦۙۖۘۖۦۜۘ۟۟ۨۡۥۘۤۙۤۨۦۘ۟ۛۜۦۘۡ";
                    break;
                case 1602122899:
                    String str20 = "۟ۚۡۘ۬ۙۚۙۗۥۘۜۘۗۧۗۘۘۡۖ۠ۗ۠ۡۘ۠ۜۥۘۦۡۖۘۖۨۖۚۥ۬ۖۚۛۛۚۦۛۛۨۡۚۨۘۧۖۦۧۥۡۛۙۗ";
                    while (true) {
                        switch (str20.hashCode() ^ (-629623229)) {
                            case 176211321:
                                str = "ۙۧۥۘ۠ۡ۫۫ۤۨۘۤۨ۫ۚۘۛۥ۟ۥۘۛ۟ۖۛۖۢۛ۠ۛ۫ۛۡۘۘۧۛۛۦۡ";
                                continue;
                            case 691763714:
                                String str21 = "۫۬ۥۘ۫ۦ۬ۧ۠ۗۘۘ۫ۖۢۗ۬۟ۤۛۢۘۧۙ۫ۢۛۧ۠۫ۢۨۦۦۧۘۤۥۛ۟ۨۘ";
                                while (true) {
                                    switch (str21.hashCode() ^ (-2066019801)) {
                                        case -705746358:
                                            str21 = intent != null ? "ۢۡۡۨ۠ۨۘۧۘۤ۬ۘۘۗۡۧۘۨۚ۫۫ۖۦۘۘۤۨ۠ۛۚۡۦۥۜۗۗۗۜۦۘ۠ۥ۟ۧۘۥۘ۫ۡۡۘۦ۠ۜۘ" : "ۧۚۛۛۛۧۡۢۦۘۢۡۖۘۥ۟ۤۤۦۜۘۧ۬ۛۘۥۢۖۜۡۙۧۦۗۜۢ۫ۜۜۘۛ۬ۜۘۖۙۖۖۛۗۥۧۜۜۦۨ۠ۨۜۘ";
                                            break;
                                        case -51812396:
                                            str21 = "ۢۨ۫۬ۨۧ۟ۡۨۘۜۨۜۖۜۛۡ۫ۥۘۡۚۡۘ۬ۗۦۘۤۢۘۘۤۚۢۙۦۘۧۢ۬";
                                            break;
                                        case 1290453834:
                                            str20 = "ۨ۬۟ۖۚۢۖ۟ۦۘۡۛۛۨۛۘ۫ۢۜۘۦ۟ۡۘ۟ۜ۫ۚۥۤ۬ۤۦۖ۠ۜۘ۫ۤۘ";
                                            break;
                                        case 1849448426:
                                            str20 = "ۖ۠ۧۗۛ۬۬ۥۨۘۘۥۖ۬ۜۘۚۧۤۜۨۘۧۜۥۘ۫ۖۘۘ۬۠۟ۦۧ۬ۚۜۘۡۦۤۙۡ۠";
                                            break;
                                    }
                                }
                                break;
                            case 1836945399:
                                str20 = "۬ۜۨۘۖۢۘۘ۬ۧ۫ۢ۠ۖۘۙۗۜۘ۟ۘۖ۫ۜۜۘۖۛۛۡ۟ۦۚۖۜۧۤۜۘ۬ۗ۠";
                                break;
                            case 2033712984:
                                str = "ۨ۬ۦۘۛۛۜۘۚۚۦۘ۬۟ۦۢ۬ۛۖۤۤ۬ۜۘۡۙۖۘۛۘۦۦۤ۠ۥۘۘۘۢۡۙ۫ۤۦۨ۫۬";
                                continue;
                        }
                    }
                    break;
                case 1901523092:
                    String str22 = "ۛ۠ۦۜۧۥۖۖۤۘۖۛۛ۠ۦۘ۫ۛۤۗۙۛۜۜ۫ۡۖۖۖ۠۟۬ۗۖۢۨ۠۠ۡۡۘۧۚۗۧۤۥۘۧۥۧ";
                    while (true) {
                        switch (str22.hashCode() ^ 1167839906) {
                            case -1656592943:
                                str = "۫ۙۥۖۚۡۢۘۡۦۘ۟ۛۡۚۢۚۜۘ۠ۧۛۦۥۡۘۡۜۚ۬ۗ۫ۘۡۤۖ۫ۖ۫ۛ۫۫ۜ۬ۤۙۦۘۤۖۡۚۖۢ۬ۨۨ";
                                continue;
                            case -1173989883:
                                str22 = "ۙۤۦۨ۟۬ۖۤۗۡۦۖ۫ۥۥۘۦۦ۠۠۟ۥۜ۠ۡۘۡ۠ۜۜۖۨۘۦۨۥۘۙۥۘۗۥۧۘۙ۬ۖۥ۠ۡۨۘۥ";
                                break;
                            case -486528866:
                                str = "ۡۜۛۢ۟ۥۘۙ۠ۗ۟ۘ۠۠ۡۥۨۧۦۘۨ۬ۡۘۧۚ۟ۢۧۥۘ۫ۜۨۘ";
                                continue;
                            case 1424685551:
                                String str23 = "ۚ۠ۥۘۢۥ۠ۛۧۜۦۜ۫۬ۗۦۘۗۡۧۥۜۜۘ۠۠۠ۨۧۘۘۚۤۢۙۢۗ۠ۚۢۤۥۘۤۥۥۘ";
                                while (true) {
                                    switch (str23.hashCode() ^ 294754842) {
                                        case -1676490005:
                                            str23 = "ۥۦۖۗ۠ۢۘۥۖ۫ۙۗۥۤۥۚۙۤۖۢۦۘۤۛۙۤۙۧۘۦۜۘۡ۠ۗۛۦۖ۬ۥۜ۠ۨ۬ۨۘۡۘ۫ۜۖۘۘۘۤۙۛۦۘ";
                                            break;
                                        case 236529556:
                                            str23 = i4 != 202 ? "۫۟ۢ۟ۗ۫۫ۖۦۘ۠ۜۦۧ۬ۗ۫ۗ۟ۚۨۛۚۖۨ۠ۙۘۘۚۘۖ۬ۙۘ۟۟ۚۥۢۥۦۢۘۖۖۙۧۤۥ۬ۦۧۘۘۗۤ" : "۟۟۫ۧ۫۫ۛۧۜۖۜۘۙ۬ۧۜۧۘۙ۠ۤۗۤۛۙۨۥۘۦۙۙۖ۟ۦۘ۬ۨۡۘۛۙ۟ۦ۟ۛ۬ۜۥۖۗۗ";
                                            break;
                                        case 1128957173:
                                            str22 = "ۢۧۙۗۚۙۧ۬ۛۢۘۘۘۘۛۡۘۗۢۨۘۨۚ۫ۤۚۢۖ۠ۨۘۙۦۙۢۚۤۡۚۖۘ";
                                            break;
                                        case 1652297014:
                                            str22 = "ۘۢۚۢۧۨۘ۫۠ۚۖۗۢۙ۠ۧۥۙۜۖۖۡۘۤۜۡ۟ۥۘۛ۬ۖ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1946219958:
                    C4273q7.OooO0o0().OooOO0O();
                    str = "ۢۡۤ۟ۛۤۗ۬۬۫ۦۥۖۛۨۤ۫ۘۙۘۨۘۜ۫۟ۢۨۜۦ۫ۗۜۙۥۘۧۤۨ";
                    break;
                case 2105572173:
                    C3977i7.OooO().Oooo00o(intExtra2);
                    str = "۟۫ۨۡ۠ۤۘۦ۬ۖۘۦۗۨۛۤۥۦۘۛ۟ۧ۟ۛۨ۬ۖۨۘۘۛ۫";
                    break;
            }
            return 2;
        }
    }
}
