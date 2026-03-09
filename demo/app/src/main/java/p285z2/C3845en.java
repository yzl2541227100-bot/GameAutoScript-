package p285z2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: z2.en */
/* JADX INFO: loaded from: classes2.dex */
public final class C3845en extends AbstractC4067kn {
    private static final Pattern OooO0o = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final C3808dn OooOO0O(C3770cm c3770cm) {
        Matcher matcher = OooO0o.matcher(AbstractC4067kn.OooO0OO(c3770cm));
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(4);
        try {
            double d = Double.parseDouble(matcher.group(1));
            if (d <= 90.0d && d >= -90.0d) {
                double d2 = Double.parseDouble(matcher.group(2));
                if (d2 <= 180.0d && d2 >= -180.0d) {
                    double d3 = 0.0d;
                    if (matcher.group(3) != null) {
                        double d4 = Double.parseDouble(matcher.group(3));
                        if (d4 < 0.0d) {
                            return null;
                        }
                        d3 = d4;
                    }
                    return new C3808dn(d, d2, d3, strGroup);
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
