package com.octopus.p222ad.p224b;

/* JADX INFO: renamed from: com.octopus.ad.b.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C3072e {

    /* JADX INFO: renamed from: com.octopus.ad.b.e$a */
    public enum a {
        ADP_UNKNOWN(0),
        ADP_IVIDEO(1),
        ADP_LOADING(2),
        ADP_TABLE(3),
        ADP_BANNER(4),
        ADP_CUSTOMER(5),
        ADP_NATIVE(6);


        /* JADX INFO: renamed from: h */
        private final int f16960h;

        a(int i) {
            this.f16960h = i;
        }

        /* JADX INFO: renamed from: a */
        public static a m14222a(int i) {
            switch (i) {
                case 0:
                    return ADP_UNKNOWN;
                case 1:
                    return ADP_IVIDEO;
                case 2:
                    return ADP_LOADING;
                case 3:
                    return ADP_TABLE;
                case 4:
                    return ADP_BANNER;
                case 5:
                    return ADP_CUSTOMER;
                case 6:
                    return ADP_NATIVE;
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.e$b */
    public enum b {
        DEVICE_UNKNOWN(0),
        DEVICE_PHONE(1),
        DEVICE_FLAT(2),
        DEVICE_WEAR(3),
        DEVICE_PC(4),
        DEVICE_OTHER(5);


        /* JADX INFO: renamed from: g */
        private final int f16968g;

        b(int i) {
            this.f16968g = i;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.e$c */
    public enum c {
        ISP_UNKNOWN(0),
        ISP_CN_MOBILE(1),
        ISP_CN_UNICOM(2),
        ISP_CN_TEL(3),
        ISP_OTHER(4);


        /* JADX INFO: renamed from: f */
        private final int f16975f;

        c(int i) {
            this.f16975f = i;
        }

        /* JADX INFO: renamed from: a */
        public final int m14223a() {
            return this.f16975f;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.e$d */
    public enum d {
        NET_UNKNOWN(0),
        NET_3G(1),
        NET_4G(2),
        NET_5G(3),
        NET_WIFI(4),
        NET_OTHER(5),
        NET_2G(6);


        /* JADX INFO: renamed from: h */
        private final int f16984h;

        d(int i) {
            this.f16984h = i;
        }

        /* JADX INFO: renamed from: a */
        public final int m14224a() {
            return this.f16984h;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.e$e */
    public enum e {
        PLATFORM_UNKNOWN(0),
        PLATFORM_IOS(1),
        PLATFORM_ANDROID(2),
        PLATFORM_OTHER(3);


        /* JADX INFO: renamed from: e */
        private final int f16990e;

        e(int i) {
            this.f16990e = i;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.e$f */
    public enum f {
        RENDER_UNKNOWN(0),
        RENDER_VIDEO(1),
        RENDER_PIC(2),
        RENDER_H5(3),
        RENDER_JSON(4),
        RENDER_VAST_VIDEO(5);


        /* JADX INFO: renamed from: g */
        private final int f16998g;

        f(int i) {
            this.f16998g = i;
        }

        /* JADX INFO: renamed from: a */
        public static f m14225a(int i) {
            if (i == 0) {
                return RENDER_UNKNOWN;
            }
            if (i == 1) {
                return RENDER_VIDEO;
            }
            if (i == 2) {
                return RENDER_PIC;
            }
            if (i == 3) {
                return RENDER_H5;
            }
            if (i == 4) {
                return RENDER_JSON;
            }
            if (i != 5) {
                return null;
            }
            return RENDER_VAST_VIDEO;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.e$g */
    public enum g {
        REQ_UNKNOWN(0),
        REQ_AD(1),
        REQ_WIFI_PRELOAD(2);


        /* JADX INFO: renamed from: d */
        private final int f17003d;

        g(int i) {
            this.f17003d = i;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.e$h */
    public enum h {
        SCREEN_DIRECTION_UNKOWN(0),
        PORTRAIT(1),
        LANDSCAPE(2);


        /* JADX INFO: renamed from: d */
        private final int f17008d;

        h(int i) {
            this.f17008d = i;
        }

        /* JADX INFO: renamed from: a */
        public static h m14226a(int i) {
            if (i == 0) {
                return SCREEN_DIRECTION_UNKOWN;
            }
            if (i == 1) {
                return PORTRAIT;
            }
            if (i != 2) {
                return null;
            }
            return LANDSCAPE;
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.b.e$i */
    public enum i {
        SRC_UNKNOWN(0),
        SRC_APP(1),
        SRC_WAP(2),
        SRC_PC(3),
        SRC_TEST(4);


        /* JADX INFO: renamed from: f */
        private final int f17015f;

        i(int i) {
            this.f17015f = i;
        }
    }
}
