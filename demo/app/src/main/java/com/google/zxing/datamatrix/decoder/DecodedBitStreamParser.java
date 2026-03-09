package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.p284io.FilenameUtils;
import org.apache.commons.p284io.IOUtils;
import org.slf4j.helpers.MessageFormatter;
import p285z2.C3809do;
import p285z2.C3846eo;
import p285z2.C4367sr;

/* JADX INFO: loaded from: classes2.dex */
public final class DecodedBitStreamParser {
    private static final char[] OooO00o = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] OooO0O0;
    private static final char[] OooO0OO;
    private static final char[] OooO0Oo;
    private static final char[] OooO0o0;

    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        static {
            int[] iArr = new int[Mode.values().length];
            OooO00o = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO00o[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO00o[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OooO00o[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OooO00o[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        char[] cArr = {'!', '\"', '#', C4367sr.OooO0OO, '%', '&', '\'', '(', ')', '*', '+', ',', '-', FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX, ':', ';', '<', '=', '>', '?', '@', '[', IOUtils.DIR_SEPARATOR_WINDOWS, ']', '^', '_'};
        OooO0O0 = cArr;
        OooO0OO = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        OooO0Oo = cArr;
        OooO0o0 = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', MessageFormatter.DELIM_START, '|', MessageFormatter.DELIM_STOP, '~', 127};
    }

    private DecodedBitStreamParser() {
    }

    private static int OooO(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }

    public static C3846eo OooO00o(byte[] bArr) throws FormatException {
        C3809do c3809do = new C3809do(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        Mode modeOooO0OO = Mode.ASCII_ENCODE;
        do {
            Mode mode = Mode.ASCII_ENCODE;
            if (modeOooO0OO == mode) {
                modeOooO0OO = OooO0OO(c3809do, sb, sb2);
            } else {
                int i = OooO00o.OooO00o[modeOooO0OO.ordinal()];
                if (i == 1) {
                    OooO0o0(c3809do, sb);
                } else if (i == 2) {
                    OooO0oO(c3809do, sb);
                } else if (i == 3) {
                    OooO0O0(c3809do, sb);
                } else if (i == 4) {
                    OooO0o(c3809do, sb);
                } else {
                    if (i != 5) {
                        throw FormatException.getFormatInstance();
                    }
                    OooO0Oo(c3809do, sb, arrayList);
                }
                modeOooO0OO = mode;
            }
            if (modeOooO0OO == Mode.PAD_ENCODE) {
                break;
            }
        } while (c3809do.OooO00o() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String string = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C3846eo(bArr, string, arrayList, null);
    }

    private static void OooO0O0(C3809do c3809do, StringBuilder sb) throws FormatException {
        int iOooO0Oo;
        char c;
        int i;
        int[] iArr = new int[3];
        while (c3809do.OooO00o() != 8 && (iOooO0Oo = c3809do.OooO0Oo(8)) != 254) {
            OooO0oo(iOooO0Oo, c3809do.OooO0Oo(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    c = '\r';
                } else if (i3 == 1) {
                    c = '*';
                } else if (i3 == 2) {
                    c = '>';
                } else if (i3 != 3) {
                    if (i3 < 14) {
                        i = i3 + 44;
                    } else {
                        if (i3 >= 40) {
                            throw FormatException.getFormatInstance();
                        }
                        i = i3 + 51;
                    }
                    c = (char) i;
                } else {
                    c = ' ';
                }
                sb.append(c);
            }
            if (c3809do.OooO00o() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Mode OooO0OO(C3809do c3809do, StringBuilder sb, StringBuilder sb2) throws FormatException {
        String str;
        boolean z = false;
        do {
            int iOooO0Oo = c3809do.OooO0Oo(8);
            if (iOooO0Oo == 0) {
                throw FormatException.getFormatInstance();
            }
            if (iOooO0Oo > 128) {
                if (iOooO0Oo != 129) {
                    if (iOooO0Oo > 229) {
                        switch (iOooO0Oo) {
                            case 230:
                                return Mode.C40_ENCODE;
                            case 231:
                                return Mode.BASE256_ENCODE;
                            case 232:
                                sb.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z = true;
                                break;
                            case 236:
                                str = "[)>\u001e05\u001d";
                                sb.append(str);
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                str = "[)>\u001e06\u001d";
                                sb.append(str);
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return Mode.ANSIX12_ENCODE;
                            case 239:
                                return Mode.TEXT_ENCODE;
                            case 240:
                                return Mode.EDIFACT_ENCODE;
                            default:
                                if (iOooO0Oo != 254 || c3809do.OooO00o() != 0) {
                                    throw FormatException.getFormatInstance();
                                }
                                break;
                        }
                    } else {
                        int i = iOooO0Oo - 130;
                        if (i < 10) {
                            sb.append('0');
                        }
                        sb.append(i);
                    }
                } else {
                    return Mode.PAD_ENCODE;
                }
            } else {
                if (z) {
                    iOooO0Oo += 128;
                }
                sb.append((char) (iOooO0Oo - 1));
                return Mode.ASCII_ENCODE;
            }
        } while (c3809do.OooO00o() > 0);
        return Mode.ASCII_ENCODE;
    }

    private static void OooO0Oo(C3809do c3809do, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
        int iOooO0OO = c3809do.OooO0OO() + 1;
        int i = iOooO0OO + 1;
        int iOooO = OooO(c3809do.OooO0Oo(8), iOooO0OO);
        if (iOooO == 0) {
            iOooO = c3809do.OooO00o() / 8;
        } else if (iOooO >= 250) {
            iOooO = ((iOooO - 249) * 250) + OooO(c3809do.OooO0Oo(8), i);
            i++;
        }
        if (iOooO < 0) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[iOooO];
        int i2 = 0;
        while (i2 < iOooO) {
            if (c3809do.OooO00o() < 8) {
                throw FormatException.getFormatInstance();
            }
            bArr[i2] = (byte) OooO(c3809do.OooO0Oo(8), i);
            i2++;
            i++;
        }
        collection.add(bArr);
        try {
            sb.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e)));
        }
    }

    private static void OooO0o(C3809do c3809do, StringBuilder sb) {
        while (c3809do.OooO00o() > 16) {
            for (int i = 0; i < 4; i++) {
                int iOooO0Oo = c3809do.OooO0Oo(6);
                if (iOooO0Oo == 31) {
                    int iOooO0O0 = 8 - c3809do.OooO0O0();
                    if (iOooO0O0 != 8) {
                        c3809do.OooO0Oo(iOooO0O0);
                        return;
                    }
                    return;
                }
                if ((iOooO0Oo & 32) == 0) {
                    iOooO0Oo |= 64;
                }
                sb.append((char) iOooO0Oo);
            }
            if (c3809do.OooO00o() <= 0) {
                return;
            }
        }
    }

    private static void OooO0o0(C3809do c3809do, StringBuilder sb) throws FormatException {
        int iOooO0Oo;
        int i;
        char c;
        char c2;
        int[] iArr = new int[3];
        boolean z = false;
        int i2 = 0;
        while (c3809do.OooO00o() != 8 && (iOooO0Oo = c3809do.OooO0Oo(8)) != 254) {
            OooO0oo(iOooO0Oo, c3809do.OooO0Oo(8), iArr);
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (z) {
                            i = i4 + 128;
                            c2 = (char) i;
                            sb.append(c2);
                            z = false;
                        }
                        c = (char) i4;
                        sb.append(c);
                    } else if (i2 == 2) {
                        char[] cArr = OooO0O0;
                        if (i4 < cArr.length) {
                            c = cArr[i4];
                            if (z) {
                                c2 = (char) (c + 128);
                                sb.append(c2);
                                z = false;
                            }
                        } else if (i4 == 27) {
                            c = 29;
                        } else {
                            if (i4 != 30) {
                                throw FormatException.getFormatInstance();
                            }
                            z = true;
                        }
                        sb.append(c);
                    } else {
                        if (i2 != 3) {
                            throw FormatException.getFormatInstance();
                        }
                        if (z) {
                            i = i4 + 224;
                            c2 = (char) i;
                            sb.append(c2);
                            z = false;
                        } else {
                            i4 += 96;
                            c = (char) i4;
                            sb.append(c);
                        }
                    }
                    i2 = 0;
                } else if (i4 < 3) {
                    i2 = i4 + 1;
                } else {
                    char[] cArr2 = OooO00o;
                    if (i4 >= cArr2.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c3 = cArr2[i4];
                    if (z) {
                        sb.append((char) (c3 + 128));
                        z = false;
                    } else {
                        sb.append(c3);
                    }
                }
            }
            if (c3809do.OooO00o() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r3 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        r3 = (char) (r4 + 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r3 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void OooO0oO(p285z2.C3809do r9, java.lang.StringBuilder r10) throws com.google.zxing.FormatException {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L6:
            int r5 = r9.OooO00o()
            r6 = 8
            if (r5 != r6) goto Lf
            return
        Lf:
            int r5 = r9.OooO0Oo(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L18
            return
        L18:
            int r6 = r9.OooO0Oo(r6)
            OooO0oo(r5, r6, r1)
            r5 = 0
        L20:
            if (r5 >= r0) goto L93
            r6 = r1[r5]
            if (r4 == 0) goto L71
            r7 = 1
            if (r4 == r7) goto L61
            r8 = 2
            if (r4 == r8) goto L45
            if (r4 != r0) goto L40
            char[] r4 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.OooO0o0
            int r7 = r4.length
            if (r6 >= r7) goto L3b
            char r4 = r4[r6]
            if (r3 == 0) goto L6c
        L37:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L66
        L3b:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L40:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L45:
            char[] r4 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.OooO0Oo
            int r8 = r4.length
            if (r6 >= r8) goto L4f
            char r4 = r4[r6]
            if (r3 == 0) goto L6c
            goto L37
        L4f:
            r4 = 27
            if (r6 == r4) goto L5e
            r3 = 30
            if (r6 != r3) goto L59
            r3 = 1
            goto L6f
        L59:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L5e:
            r4 = 29
            goto L6c
        L61:
            if (r3 == 0) goto L6b
            int r6 = r6 + 128
            char r3 = (char) r6
        L66:
            r10.append(r3)
            r3 = 0
            goto L6f
        L6b:
            char r4 = (char) r6
        L6c:
            r10.append(r4)
        L6f:
            r4 = 0
            goto L8b
        L71:
            if (r6 >= r0) goto L77
            int r6 = r6 + 1
            r4 = r6
            goto L8b
        L77:
            char[] r7 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.OooO0OO
            int r8 = r7.length
            if (r6 >= r8) goto L8e
            char r6 = r7[r6]
            if (r3 == 0) goto L88
            int r6 = r6 + 128
            char r3 = (char) r6
            r10.append(r3)
            r3 = 0
            goto L8b
        L88:
            r10.append(r6)
        L8b:
            int r5 = r5 + 1
            goto L20
        L8e:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L93:
            int r5 = r9.OooO00o()
            if (r5 > 0) goto L6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.OooO0oO(z2.do, java.lang.StringBuilder):void");
    }

    private static void OooO0oo(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }
}
