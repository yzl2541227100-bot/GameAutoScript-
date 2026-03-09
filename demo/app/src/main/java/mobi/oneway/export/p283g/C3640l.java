package mobi.oneway.export.p283g;

import android.location.Location;
import android.location.LocationManager;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import mobi.oneway.export.p274a.C3582b;

/* JADX INFO: renamed from: mobi.oneway.export.g.l */
/* JADX INFO: loaded from: classes2.dex */
public class C3640l {

    /* JADX INFO: renamed from: mobi.oneway.export.g.l$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19804a;

        static {
            int[] iArr = new int[a.values().length];
            f19804a = iArr;
            try {
                iArr[a.lat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19804a[a.lon.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: mobi.oneway.export.g.l$a */
    public enum a {
        lat,
        lon
    }

    /* JADX INFO: renamed from: a */
    public static String m16983a() {
        return m16984a(a.lat);
    }

    /* JADX INFO: renamed from: a */
    private static String m16984a(a aVar) {
        Location lastKnownLocation;
        try {
            LocationManager locationManager = (LocationManager) C3582b.m16650a().getSystemService(RequestParameters.SUBRESOURCE_LOCATION);
            if (locationManager.isProviderEnabled("gps") && (lastKnownLocation = locationManager.getLastKnownLocation("gps")) != null) {
                int i = AnonymousClass1.f19804a[aVar.ordinal()];
                return i != 1 ? i != 2 ? "" : String.valueOf(lastKnownLocation.getLongitude()) : String.valueOf(lastKnownLocation.getLatitude());
            }
            return m16986b(aVar);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m16985b() {
        return m16984a(a.lon);
    }

    /* JADX INFO: renamed from: b */
    private static String m16986b(a aVar) {
        double latitude;
        Location lastKnownLocation = ((LocationManager) C3582b.m16650a().getSystemService(RequestParameters.SUBRESOURCE_LOCATION)).getLastKnownLocation("network");
        if (lastKnownLocation == null) {
            return "";
        }
        int i = AnonymousClass1.f19804a[aVar.ordinal()];
        if (i == 1) {
            latitude = lastKnownLocation.getLatitude();
        } else {
            if (i != 2) {
                return "";
            }
            latitude = lastKnownLocation.getLongitude();
        }
        return String.valueOf(latitude);
    }
}
