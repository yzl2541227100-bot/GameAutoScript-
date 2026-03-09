package com.cyjh.elfin.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.cyjh.elfin.base.AppContext;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import p285z2.InterfaceC3865f6;

/* JADX INFO: loaded from: classes.dex */
public class BaseService extends Service implements InterfaceC3865f6 {
    public AppContext OoooOoO;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String str = "ۜۨۥۜۗۚۤۙۜۘ۟ۥ۫ۦۗۦۚۗۥۘۨ۫۫۠ۢۛۦۘۛۡۦۦ۬ۚۤ۫ۡ۠۫ۘۘۥۥۘ";
        while (true) {
            switch ((((str.hashCode() ^ 84) ^ 663) ^ 231) ^ 1427059448) {
                case -1429915385:
                    str = "ۢۧ۬۫۟ۥۘۗۚۗۜۚۦۚۤۡۘۦۙۛۤۦۚۥۤۖۘۥۡۘۘۘۧۛ۬ۜۘۛۡۖۘۚۖۖ۟ۢ۬";
                    break;
                case -1213045953:
                    return null;
                case -803988099:
                    str = "ۨۥۥۥۦۙۨ۟ۨۘ۠ۦۧۘ۠ۘۖۘ۬۠ۘۘۡۘۙ۬ۥۥۘۦۘۛۙ۟ۘ";
                    break;
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = "ۤۚۛۜۗۡۦۛۦ۫ۚۖۘۢۨۙۗۧۨۘ۬ۛۘ۬ۢۘۘ۠ۚۜ۬۠ۚۢۦۙۖۛۥ";
        while (true) {
            switch ((((str.hashCode() ^ UiMessage.CommandToUi.Command_Type.FW_SET_TOP_VALUE) ^ 181) ^ 231) ^ (-967282345)) {
                case -1275174721:
                    super.onCreate();
                    str = "ۦۚۘۘۘۙۗۧۤۗۡ۠ۦۘ۫۟ۤۚۘۥۘ۠۫ۦۤۦۜۘۖۨ۬ۢۜۗۢۗۥۘ۟ۢۡۘۖۦۥۡۚۨۘ";
                    break;
                case -1188268776:
                    str = "۟ۡ۟۫۫ۘۘ۠ۨ۟ۦۧۤۨۙ۠۠ۢۨۨۢۨۥ۫ۚۡۙۤۦۨ۟ۢ۬۫ۛۚۦۘ";
                    break;
                case -310259964:
                    return;
                case 810446300:
                    this.OoooOoO = (AppContext) getApplicationContext();
                    str = "ۦۖۧۥۚۥۦۧۛۨۢ۬ۧ۫ۘۘۘۘۡۘۙۛ۟۬ۚۢۤۛ۬ۤۖۤ";
                    break;
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str = "ۚۗۥۘۖۤۘ۫ۧ۠ۦۧۘۧۥۥۘ۟ۘۖۘۨۡۘۘ۟ۧۡۚ۠ۤۦ۟ۚۧۖۘۘۡۖۖۘۥ۬۬ۙۚۢ";
        while (true) {
            switch ((((str.hashCode() ^ 425) ^ 620) ^ 48) ^ (-779980248)) {
                case -2135512461:
                    str = "ۘۚۤۥ۫۫ۧ۠ۤ۫ۛۥۙۙ۠ۜۢۡۖ۫ۙ۫ۤۨۘۥۜ۬ۨۗۘۗۢ۫ۖۛ۬ۥ۬ۨۘ۠ۢۚ";
                    break;
                case -1188012495:
                    str = "ۚۤۧۚۦۙ۟۟ۙۥۗۘۘ۠ۚۗ۟ۖۧۘ۠ۤۡۦ۫ۦۤۥۖۘۘ۟ۘۥۘۜۜۘۦۘۢۥۢ۟ۘۦ";
                    break;
                case -103258244:
                    return super.onStartCommand(intent, i, i2);
                case 175517080:
                    str = "ۘۡۖۘۢۗۡۘۢۤۧۚۜ۬ۨۧۘۘۦۡۗۨۜ۬ۛ۠۟ۖۧۨۘۡ۫ۧۜۗۜۘۜۚۘۘ";
                    break;
                case 823281340:
                    str = "ۦ۟ۘۘۗۗۥۜ۫ۗ۟ۡۚ۠ۧۡۘۨۤۘۘۢۜۥۘۗۡۤ۫ۚۢۤۡۚۛۨ۬ۦۖۦۧ۬۠ۚ۠ۤۢۗۢۜۤۛ";
                    break;
            }
        }
    }
}
