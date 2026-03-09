package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.u */
/* JADX INFO: loaded from: classes2.dex */
public class C3470u {

    /* JADX INFO: renamed from: a */
    private static String f18915a = "239.192.152.163";

    /* JADX INFO: renamed from: b */
    private static int f18916b = 48809;

    /* JADX INFO: renamed from: c */
    private WifiManager.MulticastLock f18917c;

    /* JADX INFO: renamed from: d */
    private WifiManager f18918d;

    /* JADX INFO: renamed from: e */
    private Context f18919e;

    public C3470u(Context context) {
        if (context != null) {
            this.f18919e = context;
            this.f18918d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16037a() {
        try {
            WifiManager wifiManager = this.f18918d;
            if (wifiManager != null) {
                WifiManager.MulticastLock multicastLockCreateMulticastLock = wifiManager.createMulticastLock("multicast.test");
                this.f18917c = multicastLockCreateMulticastLock;
                if (multicastLockCreateMulticastLock != null) {
                    multicastLockCreateMulticastLock.acquire();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m16038a(Context context) throws Throwable {
        String uMIDString = UMConfigure.getUMIDString(context);
        if (TextUtils.isEmpty(uMIDString)) {
            return;
        }
        m16039a(context, uMIDString);
    }

    /* JADX INFO: renamed from: a */
    private static void m16039a(Context context, String str) throws Throwable {
        m16040a(context, f18915a, f18916b, str);
    }

    /* JADX INFO: renamed from: a */
    private static void m16040a(Context context, String str, int i, String str2) throws Throwable {
        new C3470u(context).m16041a(str, i, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m16041a(String str, int i, String str2) throws Throwable {
        WifiManager.MulticastLock multicastLock;
        MulticastSocket multicastSocket;
        m16037a();
        MulticastSocket multicastSocket2 = null;
        MulticastSocket multicastSocket3 = null;
        try {
            try {
                try {
                    MulticastSocket multicastSocket4 = new MulticastSocket(i);
                    try {
                        multicastSocket4.joinGroup(InetAddress.getByName(str));
                        multicastSocket4.setLoopbackMode(true);
                        DatagramPacket datagramPacket = new DatagramPacket(str2.getBytes(), str2.getBytes().length, InetAddress.getByName(str), i);
                        multicastSocket4.send(datagramPacket);
                        try {
                            multicastSocket4.close();
                        } catch (Exception e) {
                            C3454e.m15904a(this.f18919e, e);
                        }
                        multicastLock = this.f18917c;
                        multicastSocket = datagramPacket;
                        multicastSocket2 = datagramPacket;
                    } catch (Exception e2) {
                        e = e2;
                        multicastSocket3 = multicastSocket4;
                        C3454e.m15904a(this.f18919e, e);
                        if (multicastSocket3 != null) {
                            try {
                                multicastSocket3.close();
                            } catch (Exception e3) {
                                C3454e.m15904a(this.f18919e, e3);
                            }
                        }
                        multicastLock = this.f18917c;
                        multicastSocket = multicastSocket3;
                        multicastSocket2 = multicastSocket3;
                        if (multicastLock != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        multicastSocket2 = multicastSocket4;
                        if (multicastSocket2 != null) {
                            try {
                                multicastSocket2.close();
                            } catch (Exception e4) {
                                C3454e.m15904a(this.f18919e, e4);
                            }
                        }
                        try {
                            WifiManager.MulticastLock multicastLock2 = this.f18917c;
                            if (multicastLock2 == null) {
                                throw th;
                            }
                            multicastLock2.release();
                            throw th;
                        } catch (Exception unused) {
                            throw th;
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                }
                if (multicastLock != null) {
                    multicastLock.release();
                    multicastSocket2 = multicastSocket;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
        }
    }
}
