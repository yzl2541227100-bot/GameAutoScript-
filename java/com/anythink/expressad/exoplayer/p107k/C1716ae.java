package com.anythink.expressad.exoplayer.p107k;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C1716ae {

    /* JADX INFO: renamed from: a */
    private static final int f9622a = 4;

    /* JADX INFO: renamed from: b */
    private static final int f9623b = 0;

    /* JADX INFO: renamed from: c */
    private static final int f9624c = 1;

    /* JADX INFO: renamed from: d */
    private static final int f9625d = 2;

    /* JADX INFO: renamed from: e */
    private static final int f9626e = 3;

    private C1716ae() {
    }

    /* JADX INFO: renamed from: a */
    private static Uri m8043a(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: a */
    private static Uri m8044a(String str, String str2) {
        String strM8045a;
        int i;
        int i2;
        int i3;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM8046a = m8046a(str2);
        if (iArrM8046a[0] != -1) {
            sb.append(str2);
            m8045a(sb, iArrM8046a[1], iArrM8046a[2]);
        } else {
            int[] iArrM8046a2 = m8046a(str);
            if (iArrM8046a[3] == 0) {
                i3 = iArrM8046a2[3];
            } else {
                if (iArrM8046a[2] != 0) {
                    if (iArrM8046a[1] != 0) {
                        int i4 = iArrM8046a2[0] + 1;
                        sb.append((CharSequence) str, 0, i4);
                        sb.append(str2);
                        strM8045a = m8045a(sb, iArrM8046a[1] + i4, i4 + iArrM8046a[2]);
                    } else {
                        if (str2.charAt(iArrM8046a[1]) == '/') {
                            sb.append((CharSequence) str, 0, iArrM8046a2[1]);
                            sb.append(str2);
                            i = iArrM8046a2[1];
                            i2 = iArrM8046a2[1] + iArrM8046a[2];
                        } else if (iArrM8046a2[0] + 2 >= iArrM8046a2[1] || iArrM8046a2[1] != iArrM8046a2[2]) {
                            int iLastIndexOf = str.lastIndexOf(47, iArrM8046a2[2] - 1);
                            int i5 = iLastIndexOf == -1 ? iArrM8046a2[1] : iLastIndexOf + 1;
                            sb.append((CharSequence) str, 0, i5);
                            sb.append(str2);
                            strM8045a = m8045a(sb, iArrM8046a2[1], i5 + iArrM8046a[2]);
                        } else {
                            sb.append((CharSequence) str, 0, iArrM8046a2[1]);
                            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                            sb.append(str2);
                            i = iArrM8046a2[1];
                            i2 = iArrM8046a2[1] + iArrM8046a[2] + 1;
                        }
                        strM8045a = m8045a(sb, i, i2);
                    }
                    return Uri.parse(strM8045a);
                }
                i3 = iArrM8046a2[2];
            }
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
        }
        strM8045a = sb.toString();
        return Uri.parse(strM8045a);
    }

    /* JADX INFO: renamed from: a */
    private static String m8045a(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int iLastIndexOf = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i6 = iLastIndexOf + 1;
            if (i5 == i6 && sb.charAt(iLastIndexOf) == '.') {
                sb.delete(iLastIndexOf, i3);
                i4 = i3 - iLastIndexOf;
            } else if (i5 == iLastIndexOf + 2 && sb.charAt(iLastIndexOf) == '.' && sb.charAt(i6) == '.') {
                iLastIndexOf = sb.lastIndexOf("/", iLastIndexOf - 2) + 1;
                int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                sb.delete(i7, i3);
                i4 = i3 - i7;
            } else {
                iLastIndexOf = i5 + 1;
                i5 = iLastIndexOf;
            }
            i2 -= i4;
            i5 = iLastIndexOf;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static int[] m8046a(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    private static String m8047b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM8046a = m8046a(str2);
        if (iArrM8046a[0] != -1) {
            sb.append(str2);
            m8045a(sb, iArrM8046a[1], iArrM8046a[2]);
            return sb.toString();
        }
        int[] iArrM8046a2 = m8046a(str);
        if (iArrM8046a[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM8046a2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM8046a[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM8046a2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM8046a[1] != 0) {
            int i = iArrM8046a2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return m8045a(sb, iArrM8046a[1] + i, i + iArrM8046a[2]);
        }
        if (str2.charAt(iArrM8046a[1]) == '/') {
            sb.append((CharSequence) str, 0, iArrM8046a2[1]);
            sb.append(str2);
            return m8045a(sb, iArrM8046a2[1], iArrM8046a2[1] + iArrM8046a[2]);
        }
        if (iArrM8046a2[0] + 2 < iArrM8046a2[1] && iArrM8046a2[1] == iArrM8046a2[2]) {
            sb.append((CharSequence) str, 0, iArrM8046a2[1]);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(str2);
            return m8045a(sb, iArrM8046a2[1], iArrM8046a2[1] + iArrM8046a[2] + 1);
        }
        int iLastIndexOf = str.lastIndexOf(47, iArrM8046a2[2] - 1);
        int i2 = iLastIndexOf == -1 ? iArrM8046a2[1] : iLastIndexOf + 1;
        sb.append((CharSequence) str, 0, i2);
        sb.append(str2);
        return m8045a(sb, iArrM8046a2[1], i2 + iArrM8046a[2]);
    }
}
